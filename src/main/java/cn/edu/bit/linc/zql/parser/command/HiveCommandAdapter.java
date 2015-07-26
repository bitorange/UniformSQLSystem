package cn.edu.bit.linc.zql.parser.command;

/**
 * Hive SQL 命令生成适配器
 */
public class HiveCommandAdapter extends CommandAdapter{
    public final static String CREATE_DATABASE = "CREATE DATABASE %s %s";

    @Override
    public String createDatabase(String dbName, Boolean checkIsExists) {
        return String.format(CREATE_DATABASE, checkIsExists ? "IF NOT EXISTS" : "", dbName);
    }
}
