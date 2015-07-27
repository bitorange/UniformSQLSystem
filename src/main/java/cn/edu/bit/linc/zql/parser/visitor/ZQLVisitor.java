package cn.edu.bit.linc.zql.parser.visitor;

import cn.edu.bit.linc.zql.ZQLEnv;
import cn.edu.bit.linc.zql.databases.Database;
import cn.edu.bit.linc.zql.databases.InnerDatabase;
import cn.edu.bit.linc.zql.databases.InnerDatabases;
import cn.edu.bit.linc.zql.command.*;
import cn.edu.bit.linc.zql.parser.uniformSQLBaseVisitor;
import cn.edu.bit.linc.zql.parser.uniformSQLParser;

import java.util.ArrayList;

/**
 * 抽象语法树访问器
 */
public class ZQLVisitor extends uniformSQLBaseVisitor<ASTNodeVisitResult> {
    /**
     * 命令生成器
     */
    public SQLCommandBuilder sqlCommandBuilder = new SQLCommandBuilder()
            .addAdapter(new MySQLCommandAdapter())
            .addAdapter(new HiveCommandAdapter());

    /**
     * 创建数据库 Statement
     *
     * @param ctx 节点上下文
     * @return 节点访问结果
     */
    @Override
    public ASTNodeVisitResult visitCreate_database_statement(uniformSQLParser.Create_database_statementContext ctx) {
        ASTNodeVisitResult visitSchemaNameNodeResult = visit(ctx.schema_name());
        int dbId = Integer.valueOf(ZQLEnv.get("innerdb.dafault.innerdb") == null ? "1" : ZQLEnv.get("innerdb.dafault.innerdb"));
        ArrayList<InnerDatabase> innerDatabasesArrayList = InnerDatabases.getInstance().getInnerDatabaseArray();
        Database.DBType dbType = innerDatabasesArrayList.get(dbId).getDbType();
        String command = sqlCommandBuilder.createDatabase(dbType, visitSchemaNameNodeResult.getSqlCommandOrValue(), ctx.IF() == null);

        return new ASTNodeVisitResult(command, SQLCommand.CommandType.CREATE_DATABASE_STATEMENT, dbId);
    }

    /**
     * 获取模式名、数据库名
     *
     * @param ctx 节点上下文
     * @return 模式名、数据库名
     */
    @Override
    public ASTNodeVisitResult visitSchema_name(uniformSQLParser.Schema_nameContext ctx) {
        String value = ctx.ID().getText();
        ASTNodeVisitResult result = new ASTNodeVisitResult(value, null, null);
        return result;
    }
}
