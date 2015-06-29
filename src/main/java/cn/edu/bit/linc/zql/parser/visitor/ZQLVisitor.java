package cn.edu.bit.linc.zql.parser.visitor;

import cn.edu.bit.linc.zql.parser.uniformSQLBaseVisitor;
import cn.edu.bit.linc.zql.parser.uniformSQLParser;

/**
 * 抽象语法树访问器
 */
public class ZQLVisitor extends uniformSQLBaseVisitor<VisitResult> {

    /**
     * SQL 语句模板
     */
    private class SQLCommandTemplate{
        public static final String CREATE_DATABASE_STATEMENT = "CREATE DATABASE %s %s";     // 创建数据库
    }

    // 创建数据库
    @Override
    public VisitResult visitCreate_database_statement(uniformSQLParser.Create_database_statementContext ctx) {
        VisitResult visitSchemaNameResult = visit(ctx.schema_name());    // 数据库名
        String sqlCommand = String.format(SQLCommandTemplate.CREATE_DATABASE_STATEMENT, ctx.IF() == null ? "" : "IF NOT EXISTS", visitSchemaNameResult.getResult());
        VisitResult visitResult = new VisitResult(sqlCommand, "create_database_statement");
        return visitResult;
    }

    // 获取模式名 / 数据库名
    @Override
    public VisitResult visitSchema_name(uniformSQLParser.Schema_nameContext ctx) {
        String result = ctx.ID().getText();
        VisitResult visitResult = new VisitResult(result, null);
        return visitResult;
    }
}
