package cn.edu.bit.linc.zql.parser.visitor;

import cn.edu.bit.linc.zql.ZQLEnv;
import cn.edu.bit.linc.zql.databases.Database;
import cn.edu.bit.linc.zql.databases.InnerDatabase;
import cn.edu.bit.linc.zql.databases.InnerDatabases;
import cn.edu.bit.linc.zql.command.*;
import cn.edu.bit.linc.zql.databases.MetaDatabase;
import cn.edu.bit.linc.zql.exceptions.MetaDatabaseOperationsException;
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
    public final static SQLCommandBuilder sqlCommandBuilder = new SQLCommandBuilder()
            .addAdapter(new MySQLCommandAdapter())
            .addAdapter(new HiveCommandAdapter());
    private final static InnerDatabases innerDatabase = InnerDatabases.getInstance();
    private final static ArrayList<InnerDatabase> innerDatabasesArrayList = innerDatabase.getInnerDatabaseArray();
    private final static MetaDatabase metaDatabase = MetaDatabase.getInstance();

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
        Database.DBType dbType = innerDatabasesArrayList.get(dbId - 1).getDbType();

        String dbName = visitSchemaNameNodeResult.getSqlCommandOrValue();
        String checkExists = ctx.IF() != null ? "IF NOT EXISTS" : "";
        String command = sqlCommandBuilder.createDatabase(dbType, checkExists, dbName);

        return new ASTNodeVisitResult(command, SQLCommand.CommandType.CREATE_DATABASE_STATEMENT, dbId, new String[]{checkExists, dbName});
    }

    /**
     * 获取模式名、数据库名
     *
     * @param ctx 节点上下文
     * @return 模式名、数据库名
     */
    @Override
    public ASTNodeVisitResult visitSchema_name(uniformSQLParser.Schema_nameContext ctx) {
        String value = ctx.any_name().getText();
        ASTNodeVisitResult result = new ASTNodeVisitResult(value, null, null, null);
        return result;
    }

    /**
     * 创建用户 Statement
     *
     * @param ctx 节点上下文
     * @return 节点访问结果
     */
    @Override
    public ASTNodeVisitResult visitCreate_event_statement(uniformSQLParser.Create_event_statementContext ctx) {
        // TODO: 让我打死蚊香春吧，气死我了
        return null;
    }


    /**
     * 删除指定数据库
     *
     * @param ctx 节点上下文
     * @return 节点访问结果
     */
    @Override
    public ASTNodeVisitResult visitDrop_database_statement(uniformSQLParser.Drop_database_statementContext ctx) {
        ASTNodeVisitResult visitSchemaNameNodeResult = visit(ctx.schema_name());

        // 确认数据库 ID
        int dbId;
        try {
            dbId = metaDatabase.getInnerDatabaseId(visitSchemaNameNodeResult.getSqlCommandOrValue());
        } catch (MetaDatabaseOperationsException e) {
            return null;
        }
        String checkExists = ctx.IF() != null ? "IF EXISTS" : "";

        String command = sqlCommandBuilder.dropDatabase(innerDatabasesArrayList.get(dbId - 1).getDbType(), checkExists, visitSchemaNameNodeResult.getSqlCommandOrValue());
        ASTNodeVisitResult finalResult = new ASTNodeVisitResult(command, SQLCommand.CommandType.DROP_DATABASE_STATEMENT,
                dbId, new String[]{checkExists, visitSchemaNameNodeResult.getSqlCommandOrValue()});
        return finalResult;
    }
}
