package cn.edu.bit.linc.zql.parser.visitor;

import cn.edu.bit.linc.zql.parser.uniformSQLBaseVisitor;
import cn.edu.bit.linc.zql.parser.uniformSQLParser;

/**
 * 抽象语法树访问器
 */
public class ZQLVisitor extends uniformSQLBaseVisitor<String> {

    /**
     * SQL 语句模板
     */
    private class SQLCommandTemplate{
        public static final String CREATE_DATABASE_STATEMENT = "CREATE DATABASE %s %s";     // 创建数据库
    }

    // 创建数据库
    @Override
    public String visitCreate_database_statement(uniformSQLParser.Create_database_statementContext ctx) {
        String schemaName = visit(ctx.schema_name());    // 数据库名
        String sqlCommand = String.format(SQLCommandTemplate.CREATE_DATABASE_STATEMENT, ctx.IF() == null ? "" : "IF NOT EXISTS", schemaName);
        System.out.println(sqlCommand);
        return sqlCommand;
    }

    // 获取模式名 / 数据库名
    @Override
    public String visitSchema_name(uniformSQLParser.Schema_nameContext ctx) {
        System.out.println(ctx.ID().getText());
        return ctx.ID().getText();
    }
}
