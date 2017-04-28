import DataSource.DataSourceInterface;
import DataSource.MySqlDataSource;
import Definition.BugLevelEnum;
import Entitiy.ProjectEntity;
import Output.HtmlOutput;
import Output.OutputInterface;
import com.beust.jcommander.JCommander;
import com.hubspot.jinjava.Jinjava;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.EnumSet;

public class Main {
    /**
     * MySql 数据库的地址
     */
    private static String host = "localhost";
    /**
     * MySql 数据库的端口号
     */
    private static int port = 3306;
    /**
     * SonarQube 在 MySql 数据库中存储的 Schema 名称
     */
    private static String database = "sonar";
    /**
     * 访问 SonarQube Schema 的用户名
     */
    private static String user = "sonar";
    /**
     * 访问 SonarQube Schema 的密码
     */
    private static String password = "sonar";
    /**
     * SonarQube HTML 报告导出路径
     * 这里使用的是相对路径，会保存在路径的根目录当中
     */
    private static String outputDir = "./output";
    /**
     * 导出报告中所输出的错误级别，可以累积
     */
    private static EnumSet<BugLevelEnum> bugLevels = EnumSet.of(
            BugLevelEnum.BLOCKER
    );
    /**
     * 导出报告所限制的输出条目总数
     * 注意：这个数字请根据实际进行修改，因为很有可能会报 `gc overhead limit exceeded` 错误
     */
    private static int limits = 2000;

    private static Logger logger;

    private DataSourceInterface dataSource;
    private OutputInterface output;

    private Main(DataSourceInterface dataSource, OutputInterface output) {
        this.dataSource = dataSource;
        this.output = output;
    }

    public static void main(String[] args) throws SQLException, IOException, URISyntaxException {
        logger = LoggerFactory.getLogger("sonarqube-reporter");
        logger.info("SonarQube Reporter 程序启动");

        logDatabaseParameters();
        logger.info("正在连接数据库");
        Connection connection = DriverManager.getConnection(
                "jdbc:mysql://" + host + ":" + String.valueOf(port) + "/" + database
                        + "?useUnicode=true&useSSL=false&characterEncoding=UTF-8&user="
                        + user + "&password=" + password);

        logger.info("正在初始化数据库调配器");
        DataSourceInterface dataSource = new MySqlDataSource(connection, logger, bugLevels, limits);
        logger.info("-----------------------");
        logger.info("当前日志输出的缺陷级别包括：");
        for (BugLevelEnum bugLevel:
             bugLevels) {
            logger.info(bugLevel.name() + " -> " + bugLevel.getChinese());
        }
        logger.info("-----------------------");

        logger.info("正在初始化输出调配器");
        Jinjava jinjava = new Jinjava();
        OutputInterface output = new HtmlOutput(outputDir, jinjava);

        Main command = new Main(dataSource, output);
        new JCommander(command, null, args);
        command.run();

        logOutputDirectory();
    }

    private void run() throws IOException, SQLException, URISyntaxException {
        logger.info("-----------------------");
        logger.info("当前限制提取的数据条数限额为：" + limits + "条");
        logger.info("-----------------------");
        ProjectEntity[] projects = dataSource.getProjectIssues();

        logger.info("正在渲染");
        output.renderProjects(projects);
    }

    private static void logDatabaseParameters() {
        logger.info("-----------------------");
        logger.info("MySQL 数据库连接参数：");
        logger.info("Host: " + host);
        logger.info("port: " + port);
        logger.info("database: " + database);
        logger.info("username: " + user);
        logger.info((password.isEmpty() ? "无密码。" : "有密码。"));
        logger.info("-----------------------");
    }

    private static void logOutputDirectory() throws IOException {
        File directory = new File(outputDir);
        logger.info("SonarQube Reporter 程序运行结束，您可以在以下目录找到输出的 html 文件");
        logger.info(directory.getCanonicalPath());
    }
}
