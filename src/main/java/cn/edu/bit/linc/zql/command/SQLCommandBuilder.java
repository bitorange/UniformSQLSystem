package cn.edu.bit.linc.zql.command;

import cn.edu.bit.linc.zql.databases.Database;

/**
 * SQL 命令生成器
 */
public class SQLCommandBuilder {
    private CommandAdapter[] commandAdapters = new CommandAdapter[Database.DBType.values().length];

    public SQLCommandBuilder() {
    }

    public SQLCommandBuilder(CommandAdapter[] commandAdapters) {
        System.arraycopy(commandAdapters, 0, this.commandAdapters, 0, this.commandAdapters.length);
    }

    /**
     * 添加适配器
     *
     * @param commandAdapter 适配器
     */
    public SQLCommandBuilder addAdapter(CommandAdapter commandAdapter) {
        Database.DBType dbType = commandAdapter.dbType;
        commandAdapters[dbType.ordinal()] = commandAdapter;
        return new SQLCommandBuilder(commandAdapters);
    }


    /**
     * 创建数据库
     *
     * @param dbType 底层库类型
     * @param args   参数列表
     * @return SQL 命令
     */
    public String createDatabase(Database.DBType dbType, String... args) {
        return commandAdapters[dbType.ordinal()].createDatabase(args);
    }

    /**
     * 删除数据库
     *
     * @param dbType 底层库类型
     * @param args   参数列表
     * @return SQL命令
     */
    public String dropDatabase(Database.DBType dbType, String... args) {
        return commandAdapters[dbType.ordinal()].dropDatabase(args);
    }


    /**
     * 测试函数
     *
     * @param args 程序参数
     */
    public static void main(String[] args) {
        SQLCommandBuilder builder = new SQLCommandBuilder().addAdapter(new MySQLCommandAdapter());
        String[] sqlArgs = new String[]{"db_test", "IF NOT EXISTS"};
        System.out.println(builder.createDatabase(Database.DBType.MySQL, sqlArgs));
    }
}
