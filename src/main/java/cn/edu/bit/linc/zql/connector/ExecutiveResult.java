package cn.edu.bit.linc.zql.connector;

import java.sql.ResultSet;

/**
 * SQL 命令执行结果
 */
public class ExecutiveResult {
    /**
     * 获取命令类型
     *
     * @return 命令类型
     */
    public String getCommandType() {
        return commandType;
    }

    /**
     * 获取命令影响的行数
     *
     * @return 命令影响的行数
     */
    public int getAffectedRows() {
        return affectedRows;
    }

    /**
     * 获取结果集，可能为空
     *
     * @return 结果集
     */
    public ResultSet getResultSet() {
        return resultSet;
    }

    /**
     * 打印结果
     */
    public void printResult(){

    }


    /**
     * 构造函数
     *
     * @param commandType  命令类型
     * @param affectedRows 影响行数
     * @param resultSet    结果集
     */
    public ExecutiveResult(String commandType, int affectedRows, ResultSet resultSet) {
        this.commandType = commandType;
        this.affectedRows = affectedRows;
        this.resultSet = resultSet;
    }

    private String commandType;     // 命令类型，update 还是 query
    private int affectedRows;       // 影响行数
    private ResultSet resultSet;    // 结果集
}
