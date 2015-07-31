package cn.edu.bit.linc.zql;

import cn.edu.bit.linc.zql.command.SQLCommandManager;
import cn.edu.bit.linc.zql.connections.*;
import cn.edu.bit.linc.zql.util.Logger;
import cn.edu.bit.linc.zql.util.LoggerFactory;

import java.sql.SQLException;

/**
 * 统一 SQL 系统入口，用于初始化系统底层的所有模块
 *
 * @author ihainan
 */
public class ZQLContext {
    private static final Logger logger = LoggerFactory.getLogger(ZQLContext.class);

    /**
     * 初始化系统
     */
    public static void initializeSystem() {
        logger.i("正在初始化系统模块");
        ZQLEnv.init();
    }

    private static void executeSQL(String commandStr, ZQLSession session) {
        SQLCommandManager sqlCommandManager = new SQLCommandManager(commandStr, session);
        if (sqlCommandManager.execute()) {
            try {
                System.out.println("执行 SQL 命令 `" + commandStr + "` 成功");
                // sqlCommandManager.printResult();
                System.out.println(sqlCommandManager.getOutput());
            } catch (SQLException e) {
                logger.e("打印执行结果失败", e);
            }
        } else {
            System.out.println("执行 SQL 命令 `" + commandStr + "` 失败");
        }
    }

    /**
     * 系统入口，在此启动系统
     *
     * @param args 程序参数
     */
    public static void main(String[] args) {
        initializeSystem();

        /* 伪造会话用于测试，实际过程是每与客户端建立连接便创建一个会话 */
        ZQLSession session = new ZQLSession("ihainan", null, "12345");

        /* 测试命令 */
        // executeSQL("CREATE DATABASE IF NOT EXISTS db_1", session);
        // executeSQL("CREATE USER snow IDENTIFIED BY f123456", session);
        // executeSQL("CREATE USER ihainan IDENTIFIED BY f123456", session);
        // executeSQL("CREATE DATABASE IF NOT EXISTS db_1", session);
        executeSQL("USE db_1", session);
        executeSQL("SHOW SERVER ALIASES", session);
        // executeSQL("SHOW CREATE TABLE tb_1", session);
        // executeSQL("SHOW DATABASES LIKE db_1%", session);
        // executeSQL("CREATE DATABASE db_2", session);
        // executeSQL("DROP TABLE tb_2", session);
        // executeSQL("CREATE TABLE db_1.tb_1 (ID INT, Password Float)", session);
        executeSQL("SHOW TABLES in db_1 'db%'", session);
        executeSQL("SET TABLE tb_test TO db_mysql.db_1", session);
        // executeSQL("CREATE TABLE IF NOT EXISTS db_1.tb_1 (ID BIGINT, AGE TINYINT)", session);
        // executeSQL("USE db_1", session);
        // executeSQL("GRANT ALL ON tb_1 TO ihainan WITH GRANT OPTION", session);
        // executeSQL("REVOKE GRANT OPTION FOR ALL ON tb_1 FROM snow", session);
        // executeSQL("ALTER TABLE tb_2 RENAME TO tb_1", session);
        // executeSQL("ALTER TABLE tb_1 CHANGE COLUMN ID_1 ID", session);

        // executeSQL("GRANT SELECT, DELETE, UPDATE ON tb_1 TO ihainan", session);
        // executeSQL("CREATE DATABASE IF NOT EXISTS db_1", session);
        // executeSQL("use db_1", session);
        // executeSQL("GRANT INSERT ON tb_1 TO root WITH GRANT OPTION", session);
        // executeSQL("REVOKE GRANT OPTION FOR SELECT ON tb_1 FROM root", session);
        // executeSQL("CREATE TABLE IF NOT EXISTS db_1.tb_1 (Id INT, Password INT COMMENT 'comment') COMMENT 'This is comment' AS SELECT * FROM USER", session);
        // executeSQL("use db_1", session);
        // executeSQL("DROP TABLE tb_1", session);

        // 用户相关
        // executeSQL("CREATE USER ihainan IDENTIFIED BY f123345", session);           // 创建用户
        // executeSQL("CREATE USER_ERROR ihainan IDENTIFIED BY f123345", session);     // 创建用户 - 错误语句
        // executeSQL("CREATE USER ihainan IDENTIFIED BY f123345", session);           // 创建用户 - 重复创建
        // executeSQL("CREATE USER ihainan72 IDENTIFIED BY f123345", session);         // 创建并删除用户
        // executeSQL("DROP USER ihainan72", session);

        // 创建、删除、使用数据库
        // executeSQL("USE db_1", session);
        // System.out.println(session.getDatabase());
        // executeSQL("CREATE DATABASE db_1", session);        // 创建数据库
        // executeSQL("CREATE DATABASE IF NOT EXISTS db_2", session);        // 创建并删除数据库
        // executeSQL("DROP DATABASE db_2", session);

        // 显示、创建、删除、修改数据表、修改列名
        // executeSQL("SHOW TABLES IN db_1 db%", session);        // identifier_with_wildcards doesn't work
        // executeSQL("DROP TABLE table_1_1", session);
        // executeSQL("ALTER TABLE tb_2 RENAME TO tb_1", session);
        // executeSQL("SHOW DATABASES LIKE db%", session);

        // executeSQL("ALTER TABLE tb_1 CHANGE COLUMN ID_2 ID", session);

        // 授权相关
        // executeSQL("GRANT SELECT, DELETE, INSERT ON tb_1 TO ihainan WITH GRANT OPTION", session);    // WITH GRANT OPTION doesn't work
        // executeSQL("SHOW GRANT ON ALL", session);

        // 数据库别名
        // executeSQL("SHOW SERVER ALIASES", session);

        // executeSQL("GRANT SELECT, DELETE, UPDATE ON tb_1_1_1 TO ihainan, snow WITH GRANT OPTION", session);
        // executeSQL("REVOKE GRANT OPTION FOR SELECT, UPDATE ON tb_1_1_1 FROM ihainan, snow", session);    // GRANT OPTION FOR doesn't work
        // executeSQL("SHOW GRANT", session);
        // executeSQL("SHOW DATABASES LIKE db%", session);

        // executeSQL("SELECT * FROM user", session);
    }
}
