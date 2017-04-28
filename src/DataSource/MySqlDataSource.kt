package DataSource

import Definition.BugLevelEnum
import Entitiy.FileEntity
import Entitiy.IssueEntity
import Entitiy.ProjectEntity
import Protobuf.DbFileSources
import net.jpountz.lz4.LZ4BlockInputStream
import org.slf4j.Logger
import java.io.ByteArrayInputStream
import java.sql.Connection
import java.sql.ResultSet

class MySqlDataSource(private var connection: Connection, private var logger: Logger, private var bugLevels: Set<BugLevelEnum>, private var limits: Int) : DataSourceInterface {

    override fun getProjectIssues(): Array<ProjectEntity> {
        logger.info("正在从数据库中提取数据")
        val resultSet = retrieveIssuesFromDatabase()
        val projects = mutableListOf<ProjectEntity>()

        var currentProject: ProjectEntity? = null
        var currentFile: FileEntity? = null

        logger.info("正在解析数据")
        while (resultSet.next()) {
            val projectName = resultSet.getString("projectName")
            val filePath = resultSet.getString("filePath")

            if (currentProject == null || !currentProject.name.equals(projectName, true)) {
                if (currentProject != null) {
                    projects.add(currentProject)
                }

                currentProject = ProjectEntity()
                currentProject.name = projectName
                currentProject.uuid = resultSet.getString("projectUuid")
            }

            if (currentFile == null || !currentFile.path.equals(filePath, true)) {
                if (currentFile != null) {
                    currentProject.files.add(currentFile)
                }

                currentFile = FileEntity()
                currentFile.path = filePath
                val binaryData = resultSet.getBytes("fileContents")
                if (binaryData.isNotEmpty()) {
                    val lz4Input = LZ4BlockInputStream(ByteArrayInputStream(binaryData))
                    currentFile.content = DbFileSources.Data.parseFrom(lz4Input)
                }
            }

            val issue = IssueEntity()
            issue.severity = resultSet.getString("issueSeverity")
            issue.message = resultSet.getString("issueMessage")
            issue.line = resultSet.getInt("issueLine")
            issue.effort = resultSet.getInt("issueEffort")

            currentFile.issues.add(issue)

            val issueCount = currentProject.issueCount[issue.severity]?.plus(1) ?: 1
            currentProject.issueCount.put(issue.severity, issueCount)
        }

        if (currentProject != null && currentFile != null) {
            currentProject.files.add(currentFile)
        }

        if (currentProject != null) {
            projects.add(currentProject)
        }

        return projects.toTypedArray()
    }

    // Helper Methods
    private fun retrieveIssuesFromDatabase(): ResultSet {
        return connection.prepareStatement("SELECT " +
                "   p.name as 'projectName', " +  // 产品名称
                "   p.uuid as 'projectUuid', " +  // 产品 ID
                // 所发生的问题等级（BLOCKER：系统崩溃；CRITICAL：软件崩溃；MAJOR：功能未实现；MINOR：轻微错误；INFO：改进建议）
                "   i.severity as 'issueSeverity', " +
                "   i.message as 'issueMessage', " + // 所发生的问题描述
                "   i.line as 'issueLine', " + // 问题所发生的行位置
                "   i.effort as 'issueEffort', " + // 问题的解决方案
                "   fs.binary_data as 'fileContents', " + // 所检测的文件内容
                "   f.path as 'filePath' " + // 所检测的文件路径
                "FROM issues i " +
                "   JOIN projects p ON p.scope = 'PRJ' AND p.project_uuid = i.project_uuid " +
                "   JOIN file_sources fs ON fs.file_uuid = i.component_uuid " +
                "   JOIN projects f ON f.scope = 'FIL' AND f.uuid = fs.file_uuid " +
                convertEnumSetToSQL(bugLevels) +
                " ORDER BY p.name, f.path, i.line " +
                if (limits > 0) "LIMIT " + limits else ""
        ).executeQuery()
    }

    private fun convertEnumSetToSQL(bugLevels: Set<BugLevelEnum>): String {
        if (bugLevels.isEmpty()) { return "" }
        var baseSQL = "WHERE "
        for ((index, bugLevel) in bugLevels.withIndex()) {
            baseSQL += bugLevel.sql + " "
            if (index < bugLevels.size - 1) {
                baseSQL += "OR "
            }
        }
        return baseSQL
    }
}