package cn.edu.bit.linc.zql.command;

import cn.edu.bit.linc.zql.databases.Database;

/**
 * MySQL 命令生成适配器
 */
public class MySQLCommandAdapter extends CommandAdapter {
    public final static String CREATE_DATABASE = "CREATE DATABASE %s %s";
    static {
        dbType = Database.DBType.MySQL;
    }

    @Override
    public String createDatabase(String dbName, Boolean checkIsExists) {
        return String.format(CREATE_DATABASE, checkIsExists ? "IF NOT EXISTS" : "", dbName);
    }

    /**
     * 测试函数
     *
     * @param args 程序参数
     */
    public static void main(String[] args) {
        MySQLCommandAdapter builder = new MySQLCommandAdapter();
        System.out.println(builder.createDatabase("db_name", true));
        CommandAdapter newBuilder = new MySQLCommandAdapter();
        newBuilder.createDatabase("db_name", true);
    }
}
