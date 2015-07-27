package cn.edu.bit.linc.zql.parser.visitor;

import cn.edu.bit.linc.zql.command.*;

/**
 * 访问结果类
 */
public class ASTNodeVisitResult {
    private String sqlCommandOrValue;
    private SQLCommand.CommandType commandType;
    private Integer dbId;

    /**
     * 获取底层库编号
     *
     * @return 底层库编号
     */
    public Integer getDbId() {
        return dbId;
    }

    /**
     * 获取操作类型
     *
     * @return 操作类型
     */
    public SQLCommand.CommandType getCommandType() {
        return commandType;
    }

    /**
     * 获取节点访问结果
     *
     * @return 访问节点访问结果，对于 Statement 节点，返回 Result Set / Affected Rows，对于其他节点，返回节点值
     */
    public String getSqlCommandOrValue() {
        return sqlCommandOrValue;
    }

    /**
     * 构造函数
     *
     * @param result      节点访问结果
     * @param commandType 操作类型
     * @param dbId        底层库编号
     */
    public ASTNodeVisitResult(String result, SQLCommand.CommandType commandType, Integer dbId) {
        this.sqlCommandOrValue = result;
        this.commandType = commandType;
        this.dbId = dbId;
    }
}
