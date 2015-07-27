package cn.edu.bit.linc.zql;

import cn.edu.bit.linc.zql.command.HiveCommandAdapter;
import cn.edu.bit.linc.zql.command.MySQLCommandAdapter;
import cn.edu.bit.linc.zql.command.SQLCommand;
import cn.edu.bit.linc.zql.command.SQLCommandBuilder;
import cn.edu.bit.linc.zql.util.Logger;
import cn.edu.bit.linc.zql.util.LoggerFactory;

/**
 * 统一 SQL 系统入口，用于初始化系统底层的所有模块
 *
 * @author ihainan
 */
public class ZQLContext {
    private static final Logger logger = LoggerFactory.getLogger(ZQLContext.class);

    /**
     * 初始化统一 SQL 系统
     */
    static {
        initializeSystem();
    }

    /**
     * 初始化系统
     */
    public static void initializeSystem() {
        logger.i("正在初始化系统模块");
        ZQLEnv.init();
    }

    /**
     * 系统入口，在此启动系统
     *
     * @param args 程序参数
     */
    public static void main(String[] args) {
        ZQLContext zqlContext = new ZQLContext();

        /* 伪造会话用于测试，实际是每与客户端建立连接便创建一个会话 */
        // ZQLSession session = new ZQLSession("ihainan", "db_test", "12345");
        // ZQLSession sessionTwo = new ZQLSession("snow", null, "12345");
        // ZQLSession sessionThree = new ZQLSession("snow", null, "12345");

        SQLCommand sqlCommand = new SQLCommand("CREATE DATABASE db_test");
        sqlCommand.execute();
        System.out.println(sqlCommand);
    }
}
