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
        public static final String CREATE_DATABASE_STATEMENT_MYSQL = "CREATE DATABASE %s %s";     // 创建数据库
        public static final String CREATE_DATABASE_STATEMENT_HIVE = "CREATE DATABASE %s %s";     // 创建数据库
    }

    // 创建数据库
    @Override
    public VisitResult visitCreate_database_statement(uniformSQLParser.Create_database_statementContext ctx) {
        VisitResult visitSchemaNameResult = visit(ctx.schema_name());    // 数据库名

        // 判断底层库类型
        String defaultDBName = InnerDatabases.getDefaultDatabaseName();
        String dbType = InnerDatabases.getDBType(defaultDBName);
        String sqlCommand;
        VisitResult visitResult = null;

        // TODO: 对不支持类型的处理
        if (dbType.equals("MySQL")) {
            sqlCommand = String.format(SQLCommandTemplate.CREATE_DATABASE_STATEMENT_MYSQL, ctx.IF() == null ? "" : "IF NOT EXISTS", visitSchemaNameResult.getResult());
            visitResult = new VisitResult(sqlCommand, "create_database_statement", defaultDBName);
        } else if (dbType.equals("Hive")) {
            sqlCommand = String.format(SQLCommandTemplate.CREATE_DATABASE_STATEMENT_HIVE, ctx.IF() == null ? "" : "IF NOT EXISTS", visitSchemaNameResult.getResult());
            visitResult = new VisitResult(sqlCommand, "create_database_statement", defaultDBName);
        }

        return visitResult;
    }

    // 获取模式名 / 数据库名
    @Override
    public VisitResult visitSchema_name(uniformSQLParser.Schema_nameContext ctx) {
        String result = ctx.ID().getText();
        VisitResult visitResult = new VisitResult(result, null, null);  // 无操作，未知底层库类型
        return visitResult;
    }
}
