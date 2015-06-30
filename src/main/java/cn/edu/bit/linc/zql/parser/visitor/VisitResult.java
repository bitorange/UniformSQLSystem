package cn.edu.bit.linc.zql.parser.visitor;

import java.util.ArrayList;

/**
 * 访问结果类
 */
public class VisitResult {
    private String result;
    private String operationType;
    private String dbName;

    /**
     * 获取底层库名
     *
     * @return 底层库名
     */
    public String getDbName() {
        return dbName;
    }

    /**
     * 获取操作类型
     *
     * @return 操作类型
     */
    public String getOperationType() {
        return operationType;
    }

    /**
     * 获取节点访问结果
     *
     * @return 访问节点访问结果
     */
    public String getResult() {
        return result;
    }

    /**
     * 构造函数
     *
     * @param result        节点访问结果
     * @param operationType 操作类型
     * @param dbName        底层库名
     */
    public VisitResult(String result, String operationType, String dbName) {
        this.result = result;
        this.operationType = operationType;
        this.dbName = dbName;
    }
}
