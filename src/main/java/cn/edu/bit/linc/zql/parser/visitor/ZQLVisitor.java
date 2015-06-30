package cn.edu.bit.linc.zql.parser.visitor;

import cn.edu.bit.linc.zql.connector.InnerDatabases;
import cn.edu.bit.linc.zql.parser.uniformSQLBaseVisitor;
import cn.edu.bit.linc.zql.parser.uniformSQLParser;

/**
 * 抽象语法树访问器
 */
public class ZQLVisitor extends uniformSQLBaseVisitor<VisitResult> {

    /**
     * SQL 语句模板
     */
    private class SQLCommandTemplate {
        public static final String CREATE_DATABASE_STATEMENT_MYSQL = "CREATE DATABASE %s %s";   // 创建数据库
        public static final String CREATE_DATABASE_STATEMENT_HIVE = "CREATE DATABASE %s %s";    // 创建数据库

        public static final String SELECT_STATEMENT_MYSQL = "SELECT %s FROM %s.%s";                // SELECT 语句
        public static final String SELECT_STATEMENT_HIVE = "SELECT %s FROM %s.%s";                // SELECT 语句
    }

    /* SELECT 表达式 */
    @Override
    public VisitResult visitSelect_expression(uniformSQLParser.Select_expressionContext ctx) {
        /* 获取字段列表 */
        VisitResult visitSelectListResult = visit(ctx.select_list());
        String selectList = visitSelectListResult.getResult();

        /* 获取来源表 */
        VisitResult visitTableReferences = visit(ctx.table_references());
        String tableReferences = visitTableReferences.getResult();

        /* 构建 SQL 命令 */
        // TODO: 检测来源表属于哪一个底层库
        String sqlCommand = String.format(SQLCommandTemplate.SELECT_STATEMENT_MYSQL, selectList, InnerDatabases.getDefaultDatabaseName(), tableReferences);
        return new VisitResult(sqlCommand, "select_statement", InnerDatabases.getDefaultInnerDatabaseName());
    }

    /* 获取来源表列表 */
    @Override
    public VisitResult visitTable_references(uniformSQLParser.Table_referencesContext ctx) {
        String tableReferencesStr = "";
        for (int i = 0; i < ctx.table_reference().size(); ++i) {
            uniformSQLParser.Table_referenceContext tableReferenceContext = ctx.table_reference(i);
            tableReferencesStr = tableReferencesStr + tableReferenceContext.getText() + (i == ctx.table_reference().size() - 1 ? "" : " join ");
        }

        return new VisitResult(tableReferencesStr, null, null);
    }

    /* 获取 SELECT 字段列表 */
    @Override
    public VisitResult visitSelect_list(uniformSQLParser.Select_listContext ctx) {
        String selectListStr = "";
        for (int i = 0; i < ctx.displayed_column().size(); ++i) {
            uniformSQLParser.Displayed_columnContext displayedColumnContext = ctx.displayed_column(i);
            selectListStr = selectListStr + displayedColumnContext.getText() + (i == ctx.displayed_column().size() - 1 ? "" : ", ");
        }

        return new VisitResult(selectListStr, null, null);
    }

    /* 创建数据库 */
    @Override
    public VisitResult visitCreate_database_statement(uniformSQLParser.Create_database_statementContext ctx) {
        VisitResult visitSchemaNameResult = visit(ctx.schema_name());    // 数据库名

        // 判断底层库类型
        String defaultInnerDBName = InnerDatabases.getDefaultInnerDatabaseName();
        String dbType = InnerDatabases.getDBType(defaultInnerDBName);
        String sqlCommand;
        VisitResult visitResult = null;

        // TODO: 对不支持类型的处理
        if (dbType.equals("MySQL")) {
            sqlCommand = String.format(SQLCommandTemplate.CREATE_DATABASE_STATEMENT_MYSQL, ctx.IF() == null ? "" : "IF NOT EXISTS", visitSchemaNameResult.getResult());
            visitResult = new VisitResult(sqlCommand, "create_database_statement", defaultInnerDBName);
        } else if (dbType.equals("Hive")) {
            sqlCommand = String.format(SQLCommandTemplate.CREATE_DATABASE_STATEMENT_HIVE, ctx.IF() == null ? "" : "IF NOT EXISTS", visitSchemaNameResult.getResult());
            visitResult = new VisitResult(sqlCommand, "create_database_statement", defaultInnerDBName);
        }

        return visitResult;
    }

    /* 获取模式名、数据库名 */
    @Override
    public VisitResult visitSchema_name(uniformSQLParser.Schema_nameContext ctx) {
        String result = ctx.ID().getText();
        VisitResult visitResult = new VisitResult(result, null, null);  // 无操作，未知底层库类型
        return visitResult;
    }
}
