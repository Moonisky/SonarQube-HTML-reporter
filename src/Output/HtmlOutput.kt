package Output

import Entitiy.ProjectEntity
import com.hubspot.jinjava.Jinjava
import org.slf4j.LoggerFactory
import java.io.PrintWriter
import java.util.*

class HtmlOutput(private var outputDirectory: String, private var jinjava: Jinjava) : OutputInterface {
    private var logger = LoggerFactory.getLogger(HtmlOutput::class.java)

    override fun renderProjects(projects: Array<ProjectEntity>) {
        for (project in projects) {
            val context = hashMapOf<String, ProjectEntity>()
            context["project"] = project

            logger.info("正在渲染项目：" + project.name)
            val renderedTemplate = jinjava.renderForResult(loadTemplate(), context)

            writeFile(project.name, renderedTemplate.output)
        }
    }

    private fun loadTemplate(): String {
        val classLoader = javaClass.classLoader
        val scanner = Scanner(classLoader.getResourceAsStream("HtmlTemplate/project_issues.html"))
        var result = ""

        while (scanner.hasNextLine()) {
            result += scanner.nextLine() + "\n"
        }

        return result
    }

    private fun writeFile(name: String, renderedTemplate: String) {
        val writer = PrintWriter("$outputDirectory/$name.html", "UTF-8")
        writer.print(renderedTemplate)
        writer.close()
    }
}