import DataSource.MySqlDataSource
import Definition.BugLevelEnum
import Output.HtmlOutput
import com.hubspot.jinjava.Jinjava
import org.slf4j.LoggerFactory
import java.io.File
import java.sql.DriverManager

fun main(args: Array<String>) {
    /// MySql 数据库地址
    val host = "localhost"
    /// MySql 数据库端口号
    val port = 3306
    /// SonarQube 在 MySql 数据库中存储的 Schema 名称
    val database = "sonar"
    /// 访问 SonarQube Schema 的用户名
    val user = "sonar"
    /// 访问 SonarQube Schema 的密码
    val password = "sonar"
    /**
     * SonarQube HTML 报告导出路径
     * 这里使用的是相对路径，会保存在路径的根目录当中
     */
    val outputDirectory = "./output"
    /// 导出报告中所输出的错误级别，可以累积
    val bugLevels = setOf(
            BugLevelEnum.BLOCKER
    )
    /**
     * 导出报告所限制的输出条目总数
     * 注意：这个数字请根据实际进行修改，因为很有可能会报 `gc overhead limit exceeded` 错误
     */
    val limits = 2000

    val logger = LoggerFactory.getLogger("sonarqube-reporter")

    logger.info("SonarQube Reporter 程序启动")

    logger.info("-----------------------")
    logger.info("MySQL 数据库连接参数：")
    logger.info("Host: " + host)
    logger.info("port: " + port)
    logger.info("database: " + database)
    logger.info("username: " + user)
    logger.info(if (password.isEmpty()) "无密码" else "有密码")

    val connection = DriverManager.getConnection(
            "jdbc:mysql://" + host + ":" + port.toString() + "/" + database
                    + "?useUnicode=true&useSSL=false&characterEncoding=UTF-8&user="
                    + user + "&password=" + password)
    val dataSource = MySqlDataSource(connection, logger, bugLevels, limits)

    logger.info("-----------------------")
    logger.info("当前日志输出的缺陷级别包括：")
    for (bugLevel in bugLevels) {
        logger.info(bugLevel.name + " -> " + bugLevel.chinese)
    }

    val jinjava = Jinjava()
    val output = HtmlOutput(outputDirectory, jinjava)

    logger.info("-----------------------")
    logger.info("当前限制提取的数据条数限额为：" + limits + "条")
    logger.info("-----------------------")

    val projects = dataSource.getProjectIssues()
    output.renderProjects(projects)

    val directory = File(outputDirectory)
    logger.info("SonarQube Reporter 程序运行结束，您可以在以下目录找到输出的 html 文件")
    logger.info(directory.canonicalPath)
}