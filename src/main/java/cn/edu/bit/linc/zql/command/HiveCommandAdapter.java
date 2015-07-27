package cn.edu.bit.linc.zql.command;

import cn.edu.bit.linc.zql.databases.Database;

/**
 * Hive SQL 命令生成适配器
 */
public class HiveCommandAdapter extends CommandAdapter {
    public final static String CREATE_DATABASE = "CREATE DATABASE %s %s";

    static {
        dbType = Database.DBType.Hive;
    }

    @Override
    public String createDatabase(String dbName, Boolean checkIsExists) {
        return String.format(CREATE_DATABASE, checkIsExists ? "IF NOT EXISTS" : "", dbName);
    }
}
