package cn.edu.bit.linc.zql.command;

import cn.edu.bit.linc.zql.databases.Database;

/**
 * 底层数据库 SQL 命令
 */
public class InnerSQLCommand {
    private String commandStr;
    private Database.DBType dbType;
    private Object[] args;

    /**
     * 构造函数
     *
     * @param commandStr 命令字符串
     * @param dbType     命令对应底层库类型
     * @param args       命令参数列表
     */
    public InnerSQLCommand(Database.DBType dbType, String commandStr, Object[] args) {
        this.commandStr = commandStr;
        this.dbType = dbType;
        this.args = args;
    }

    /**
     * 获取命令参数列表
     *
     * @return 命令参数列表
     */
    public Object[] getArgs() {
        return args;
    }

    /**
     * 获取命令字符串
     *
     * @return 命令对应底层库类型
     */
    public String getCommandStr() {
        return commandStr;
    }

    /**
     * 获取命令对应底层库类型
     *
     * @return 命令对应底层库类型
     */
    public Database.DBType getDbType() {
        return dbType;
    }
}
