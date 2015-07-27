package cn.edu.bit.linc.zql.command;

/**
 * SQL 命令类，用于执行 SQL 命令并保存执行结果
 */
public class SQLCommand {
    /**
     * SQL 命令类型
     */
    public enum CommandType {
        CREATE_DATABASE_STATEMENT

        // -- Update / Query 分割线 --

    }

    /**
     * 构造器
     *
     * @param sqlCommand 希望执行的 SQL 命令
     */
    public SQLCommand(String sqlCommand) {
        this.sqlCommand = sqlCommand;
    }

    // TODO: 执行 SQL 命令
    public void execute() {

    }

    private final String sqlCommand;
}
