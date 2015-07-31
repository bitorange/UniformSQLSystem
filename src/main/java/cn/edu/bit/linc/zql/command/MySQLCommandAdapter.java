package cn.edu.bit.linc.zql.command;

import cn.edu.bit.linc.zql.databases.Database;

/**
 * MySQL 命令生成适配器
 */
public class MySQLCommandAdapter extends CommandAdapter {
    static {
        dbType = Database.DBType.MySQL;

        /* MySQL 模板在此定义*/
       CREATE_DATABASE = "CREATE DATABASE %s %s";   // CREATE DATABASE [IF NOT EXISTS] db_name
    }

    /**
     * 测试函数
     *
     * @param args 程序参数
     */
    public static void main(String[] args) {
    }
}
