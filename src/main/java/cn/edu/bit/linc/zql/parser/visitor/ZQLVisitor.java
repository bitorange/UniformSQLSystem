package cn.edu.bit.linc.zql.parser.visitor;

import cn.edu.bit.linc.zql.ZQLEnv;
import cn.edu.bit.linc.zql.command.HiveCommandAdapter;
import cn.edu.bit.linc.zql.command.InnerSQLCommand;
import cn.edu.bit.linc.zql.command.MySQLCommandAdapter;
import cn.edu.bit.linc.zql.command.SQLCommandBuilder;
import cn.edu.bit.linc.zql.connections.ZQLSession;
import cn.edu.bit.linc.zql.databases.Database;
import cn.edu.bit.linc.zql.databases.InnerDatabase;
import cn.edu.bit.linc.zql.databases.InnerDatabases;
import cn.edu.bit.linc.zql.databases.MetaDatabase;
import cn.edu.bit.linc.zql.parser.uniformSQLBaseVisitor;
import cn.edu.bit.linc.zql.parser.uniformSQLParser;
import org.apache.commons.net.ntp.TimeStamp;

import java.util.ArrayList;
import java.util.Date;

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
    private final ZQLSession session;

    public ZQLVisitor(ZQLSession session) {
        this.session = session;
    }

    /**
     * 删除用户 Statement
     *
     * @param ctx 节点上下文
     * @return 节点访问结果
     */
    @Override
    public ASTNodeVisitResult visitDrop_event_statement(uniformSQLParser.Drop_event_statementContext ctx) {
        /*
        ASTNodeVisitResult visitUserNameNodeResult = visit(ctx.user_name());    // 用户名
        String commandDeleteFromUserTable = sqlCommandBuilder.dropDatabase(Database.DBType.MySQL, visitUserNameNodeResult.getSqlCommandOrValue());

        return new ASTNodeVisitResult(new String[]{command}, SQLCommand.CommandType.DROP_USER, 0, new String[]{visitUserNameNodeResult.getSqlCommandOrValue()[0]});
        */
        return null;
    }

    /**
     * 用户名节点
     *
     * @param ctx 节点上下文
     * @return 节点访问结果
     */
    @Override
    public ASTNodeVisitResult visitUser_name(uniformSQLParser.User_nameContext ctx) {
        /*
        String value = ctx.any_name().getText();
        ASTNodeVisitResult result = new ASTNodeVisitResult(new String[]{value}, null, null, null);
        return result;
        */
        return null;
    }

    /**
     * 创建数据库 Statement
     *
     * @param ctx 节点上下文
     * @return 节点访问结果
     */
    @Override
    public ASTNodeVisitResult visitCreate_database_statement(uniformSQLParser.Create_database_statementContext ctx) {
        /* 获取子节点数据 */
        ASTNodeVisitResult visitSchemaNameNodeResult = visit(ctx.schema_name());
        String createDbName = visitSchemaNameNodeResult.getValue(); // 数据库名
        String checkExists = ctx.IF() != null ? "IF NOT EXISTS" : "";   // IF NOT EXISTS
        int dbId = Integer.valueOf(ZQLEnv.get("innerdb.dafault.innerdb") == null ? "1" : ZQLEnv.get("innerdb.dafault.innerdb"));    // 底层库

        ArrayList<InnerSQLCommand> commands = new ArrayList<InnerSQLCommand>();
        ArrayList<Integer> dbIds = new ArrayList<Integer>();

        /* 底层库命令 */
        Database.DBType dbType = innerDatabasesArrayList.get(dbId - 1).getDbType();
        InnerSQLCommand innerDbCommand = sqlCommandBuilder.createDatabase(dbType, new String[]{checkExists, createDbName});
        commands.add(innerDbCommand);
        dbIds.add(dbId);

        /* 元数据库命令 */
        String dbAlias = innerDatabasesArrayList.get(dbId - 1).getDbAlias();
        String user = session.getUserName();
        InnerSQLCommand metaDbCommand = sqlCommandBuilder.createDatabaseMetaDb(Database.DBType.MySQL, new String[]{metaDatabase.getMetaDbName(),
                createDbName, String.valueOf(dbId), dbAlias, user, new TimeStamp(new Date().getTime()).toString()});
        commands.add(metaDbCommand);
        dbIds.add(0);

        /* 返回结果 */
        return new ASTNodeVisitResult(null, commands, dbIds);
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
        ASTNodeVisitResult result = new ASTNodeVisitResult(value
                , null, null);
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
        /*
        ASTNodeVisitResult visitSchemaNameNodeResult = visit(ctx.schema_name());

        int dbId;
        try {
            dbId = metaDatabase.getInnerDatabaseId(visitSchemaNameNodeResult.getSqlCommandOrValue()[0]);
        } catch (MetaDatabaseOperationsException e) {
            return null;
        }
        String checkExists = ctx.IF() != null ? "IF EXISTS" : "";
        String dbName = visitSchemaNameNodeResult.getSqlCommandOrValue()[0];
        String command = sqlCommandBuilder.dropDatabase(innerDatabasesArrayList.get(dbId - 1).getDbType(), checkExists, dbName);

        ASTNodeVisitResult finalResult = new ASTNodeVisitResult(new String[]{command}, SQLCommandManager.CommandType.DROP_DATABASE_STATEMENT,
                dbId, new String[]{checkExists, dbName});
        return finalResult;
        */
        return null;
    }
}
