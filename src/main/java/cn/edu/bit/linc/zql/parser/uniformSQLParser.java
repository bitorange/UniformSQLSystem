// Generated from uniformSQL.g4 by ANTLR 4.5
package cn.edu.bit.linc.zql.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class uniformSQLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TRUE=1, FALSE=2, ALL=3, NOT=4, LIKE=5, IF=6, EXISTS=7, ASC=8, DESC=9, 
		ORDER=10, GROUP=11, BY=12, HAVING=13, WHERE=14, FROM=15, AS=16, SELECT=17, 
		DISTINCT=18, INSERT=19, OVERWRITE=20, OUTER=21, UNIQUEJOIN=22, PRESERVE=23, 
		JOIN=24, LEFT=25, RIGHT=26, FULL=27, ON=28, PARTITION=29, PARTITIONS=30, 
		TABLE=31, TABLES=32, COLUMNS=33, INDEX=34, INDEXES=35, REBUILD=36, FUNCTIONS=37, 
		SHOW=38, MSCK=39, REPAIR=40, DIRECTORY=41, LOCAL=42, TRANSFORM=43, USING=44, 
		CLUSTER=45, DISTRIBUTE=46, SORT=47, UNION=48, LOAD=49, EXPORT=50, IMPORT=51, 
		DATA=52, INPATH=53, IS=54, NULL=55, CREATE=56, EXTERNAL=57, ALTER=58, 
		CHANGE=59, COLUMN=60, FIRST=61, AFTER=62, DESCRIBE=63, DROP=64, RENAME=65, 
		IGNORE=66, PROTECTION=67, TO=68, COMMENT=69, BOOLEAN=70, TINYINT=71, SMALLINT=72, 
		INT=73, BIGINT=74, FLOAT=75, DOUBLE=76, DATE=77, DATETIME=78, TIMESTAMP=79, 
		DECIMAL=80, STRING=81, VARCHAR=82, ARRAY=83, STRUCT=84, MAP=85, UNIONTYPE=86, 
		REDUCE=87, PARTITIONED=88, CLUSTERED=89, SORTED=90, INTO=91, BUCKETS=92, 
		ROW=93, ROWS=94, FORMAT=95, DELIMITED=96, FIELDS=97, TERMINATED=98, ESCAPED=99, 
		COLLECTION=100, ITEMS=101, KEYS=102, KEY=103, LINES=104, STORED=105, FILEFORMAT=106, 
		SEQUENCEFILE=107, TEXTFILE=108, RCFILE=109, ORCFILE=110, INPUTFORMAT=111, 
		OUTPUTFORMAT=112, INPUTDRIVER=113, OUTPUTDRIVER=114, OFFLINE=115, ENABLE=116, 
		DEFAULT=117, DISABLE=118, READONLY=119, LOCATION=120, TABLESAMPLE=121, 
		BUCKET=122, OUT=123, OF=124, PERCENT=125, CAST=126, ADD=127, REPLACE=128, 
		RLIKE=129, REGEXP=130, TEMPORARY=131, FUNCTION=132, MACRO=133, EXPLAIN=134, 
		EXTENDED=135, FORMATTED=136, PRETTY=137, DEPENDENCY=138, LOGICAL=139, 
		SERDE=140, WITH=141, DEFERRED=142, SERDEPROPERTIES=143, DBPROPERTIES=144, 
		LIMIT=145, SET=146, UNSET=147, TBLPROPERTIES=148, IDXPROPERTIES=149, CASCADED=150, 
		CASE=151, WHEN=152, THEN=153, ELSE=154, END=155, MAPJOIN=156, STREAMTABLE=157, 
		CLUSTERSTATUS=158, UTC=159, LONG=160, DELETE=161, FETCH=162, INTERSECT=163, 
		VIEW=164, IN=165, DATABASE=166, DATABASES=167, MATERIALIZED=168, SCHEMA=169, 
		SCHEMAS=170, GRANT=171, REVOKE=172, SSL=173, UNDO=174, LOCK=175, LOCKS=176, 
		UNLOCK=177, SHARED=178, EXCLUSIVE=179, PROCEDURE=180, UNSIGNED=181, WHILE=182, 
		READ=183, READS=184, PURGE=185, RANGE=186, ANALYZE=187, BEFORE=188, BETWEEN=189, 
		BOTH=190, BINARY=191, CROSS=192, CONTINUE=193, CURSOR=194, TRIGGER=195, 
		RECORDREADER=196, RECORDWRITER=197, LATERAL=198, TOUCH=199, ARCHIVE=200, 
		UNARCHIVE=201, COMPUTE=202, STATISTICS=203, USE=204, OPTION=205, CONCATENATE=206, 
		UPDATE=207, RESTRICT=208, CASCADE=209, SKEWED=210, ROLLUP=211, CUBE=212, 
		DIRECTORIES=213, FOR=214, WINDOW=215, UNBOUNDED=216, PRECEDING=217, FOLLOWING=218, 
		CURRENT=219, LESS=220, MORE=221, OVER=222, GROUPING=223, SETS=224, TRUNCATE=225, 
		NOSCAN=226, PARTIALSCAN=227, USER=228, ROLE=229, INNER=230, EXCHANGE=231, 
		IDENTIFIED=232, CHAR=233, ABS=234, ACOS=235, ASIN=236, ATAN=237, CEIL=238, 
		COS=239, COT=240, EXP=241, FLOOR=242, LN=243, POW=244, RAND=245, ROUND=246, 
		SIN=247, SQRT=248, TAN=249, LCASE=250, LOWER=251, LTRIM=252, RTRIM=253, 
		CONCAT=254, SUBSTR=255, TRIM=256, UCASE=257, UPPER=258, INTERVAL=259, 
		TO_DATE=260, DAY=261, HOUR=262, MINUTE=263, MONTH=264, SECOND=265, FROM_UNIXTIME=266, 
		YEAR=267, DATE_ADD=268, DATE_SUB=269, COLLATE=270, AVG=271, COUNT=272, 
		MAX=273, MIN=274, SUM=275, COALESCE=276, DUPLICATE=277, SERVER=278, ALIASES=279, 
		ALIAS=280, VALUES=281, VALUE=282, LOW_PRIORITY=283, HIGH_PRIORITY=284, 
		HASH=285, REFERENCES=286, DIVIDE=287, MOD=288, OR=289, AND=290, XOR=291, 
		ARROW=292, EQ=293, NOT_EQ=294, LET=295, GET=296, SET_VAR=297, SHIFT_LEFT=298, 
		SHIFT_RIGHT=299, ALL_FIELDS=300, SEMI=301, COLON=302, DOT=303, COMMA=304, 
		ASTERISK=305, RPAREN=306, LPAREN=307, RBRACK=308, LBRACK=309, PLUS=310, 
		MINUS=311, NEGATION=312, VERTBAR=313, BITAND=314, POWER_OP=315, GTH=316, 
		LTH=317, Double_Quote=318, INTEGER_NUM=319, VARCHAR_NUM=320, BINARY_NUM=321, 
		HEX_DIGIT=322, BIT_NUM=323, REAL_NUMBER=324, TEXT_STRING=325, ID=326, 
		IDENTIFIER_WITH_WILDCARDS=327, WHITE_SPACE=328, SL_COMMENT=329, Regex_Escaped_Unicode=330;
	public static final int
		RULE_keyword = 0, RULE_delimited_statement = 1, RULE_integer_types = 2, 
		RULE_relational_op = 3, RULE_cast_data_type = 4, RULE_interval_unit = 5, 
		RULE_string_literal = 6, RULE_number_literal = 7, RULE_hex_literal = 8, 
		RULE_boolean_literal = 9, RULE_bit_literal = 10, RULE_literal_value = 11, 
		RULE_functionList = 12, RULE_number_functions = 13, RULE_char_functions = 14, 
		RULE_time_functions = 15, RULE_other_functions = 16, RULE_group_functions = 17, 
		RULE_schema_name = 18, RULE_database_name = 19, RULE_table_name = 20, 
		RULE_engine_name = 21, RULE_column_name = 22, RULE_view_name = 23, RULE_parser_name = 24, 
		RULE_index_name = 25, RULE_partition_name = 26, RULE_partition_logical_name = 27, 
		RULE_constraintbol_name = 28, RULE_foreign_keybol_name = 29, RULE_collation_name = 30, 
		RULE_event_name = 31, RULE_user_name = 32, RULE_function_name = 33, RULE_procedure_name = 34, 
		RULE_server_name = 35, RULE_wrapper_name = 36, RULE_alias = 37, RULE_password = 38, 
		RULE_server_alias = 39, RULE_role_name = 40, RULE_group_name = 41, RULE_principal_name = 42, 
		RULE_any_name = 43, RULE_priv_type = 44, RULE_expression = 45, RULE_exp_factor1 = 46, 
		RULE_exp_factor2 = 47, RULE_exp_factor3 = 48, RULE_exp_factor4 = 49, RULE_bool_primary = 50, 
		RULE_predicate = 51, RULE_bit_expr = 52, RULE_factor1 = 53, RULE_factor2 = 54, 
		RULE_factor3 = 55, RULE_factor4 = 56, RULE_factor5 = 57, RULE_factor6 = 58, 
		RULE_factor7 = 59, RULE_simple_expr = 60, RULE_function_call = 61, RULE_case_when_statement = 62, 
		RULE_case_when_statement1 = 63, RULE_case_when_statement2 = 64, RULE_column_spec = 65, 
		RULE_expression_list = 66, RULE_interval_expr = 67, RULE_table_references = 68, 
		RULE_table_reference = 69, RULE_table_factor1 = 70, RULE_table_factor2 = 71, 
		RULE_table_factor3 = 72, RULE_table_atom = 73, RULE_join_condition = 74, 
		RULE_index_hint_list = 75, RULE_index_options = 76, RULE_index_hint = 77, 
		RULE_index_list = 78, RULE_partition_clause = 79, RULE_partition_names = 80, 
		RULE_root_statement = 81, RULE_data_manipulation_statements = 82, RULE_data_definition_statements = 83, 
		RULE_select_statement = 84, RULE_select_expression = 85, RULE_where_clause = 86, 
		RULE_groupby_clause = 87, RULE_groupby_item = 88, RULE_having_clause = 89, 
		RULE_orderby_clause = 90, RULE_orderby_item = 91, RULE_limit_clause = 92, 
		RULE_offset = 93, RULE_row_count = 94, RULE_select_list = 95, RULE_column_list = 96, 
		RULE_subquery = 97, RULE_table_spec = 98, RULE_displayed_column = 99, 
		RULE_insert_statements = 100, RULE_insert_header = 101, RULE_insert_subfix = 102, 
		RULE_insert_statement = 103, RULE_value_list_clause = 104, RULE_column_value_list = 105, 
		RULE_set_columns_cluase = 106, RULE_set_column_cluase = 107, RULE_create_database_statement = 108, 
		RULE_drop_database_statement = 109, RULE_create_table_statement = 110, 
		RULE_create_table_statement1 = 111, RULE_create_table_statement2 = 112, 
		RULE_create_table_statement3 = 113, RULE_create_definition = 114, RULE_column_definition = 115, 
		RULE_null_or_notnull = 116, RULE_column_data_type_header = 117, RULE_index_column_name = 118, 
		RULE_reference_definition = 119, RULE_reference_option = 120, RULE_length = 121, 
		RULE_varchar_length = 122, RULE_binary_length = 123, RULE_alter_table_statement = 124, 
		RULE_alter_table_specification = 125, RULE_index_column_names = 126, RULE_index_type = 127, 
		RULE_index_option = 128, RULE_column_definitions = 129, RULE_rename_table_statement = 130, 
		RULE_drop_table_statement = 131, RULE_drop_view_statement = 132, RULE_truncate_table_statement = 133, 
		RULE_create_view_statement = 134, RULE_create_view_body = 135, RULE_alter_view_statement = 136, 
		RULE_create_event_statement = 137, RULE_drop_event_statement = 138, RULE_grant_event_statement = 139, 
		RULE_principal_specification = 140, RULE_revoke_event_statement = 141, 
		RULE_show_event_statement = 142, RULE_show_specification = 143, RULE_set_event_statement = 144, 
		RULE_use_event_statement = 145, RULE_service_event_statement = 146, RULE_update_statements = 147;
	public static final String[] ruleNames = {
		"keyword", "delimited_statement", "integer_types", "relational_op", "cast_data_type", 
		"interval_unit", "string_literal", "number_literal", "hex_literal", "boolean_literal", 
		"bit_literal", "literal_value", "functionList", "number_functions", "char_functions", 
		"time_functions", "other_functions", "group_functions", "schema_name", 
		"database_name", "table_name", "engine_name", "column_name", "view_name", 
		"parser_name", "index_name", "partition_name", "partition_logical_name", 
		"constraintbol_name", "foreign_keybol_name", "collation_name", "event_name", 
		"user_name", "function_name", "procedure_name", "server_name", "wrapper_name", 
		"alias", "password", "server_alias", "role_name", "group_name", "principal_name", 
		"any_name", "priv_type", "expression", "exp_factor1", "exp_factor2", "exp_factor3", 
		"exp_factor4", "bool_primary", "predicate", "bit_expr", "factor1", "factor2", 
		"factor3", "factor4", "factor5", "factor6", "factor7", "simple_expr", 
		"function_call", "case_when_statement", "case_when_statement1", "case_when_statement2", 
		"column_spec", "expression_list", "interval_expr", "table_references", 
		"table_reference", "table_factor1", "table_factor2", "table_factor3", 
		"table_atom", "join_condition", "index_hint_list", "index_options", "index_hint", 
		"index_list", "partition_clause", "partition_names", "root_statement", 
		"data_manipulation_statements", "data_definition_statements", "select_statement", 
		"select_expression", "where_clause", "groupby_clause", "groupby_item", 
		"having_clause", "orderby_clause", "orderby_item", "limit_clause", "offset", 
		"row_count", "select_list", "column_list", "subquery", "table_spec", "displayed_column", 
		"insert_statements", "insert_header", "insert_subfix", "insert_statement", 
		"value_list_clause", "column_value_list", "set_columns_cluase", "set_column_cluase", 
		"create_database_statement", "drop_database_statement", "create_table_statement", 
		"create_table_statement1", "create_table_statement2", "create_table_statement3", 
		"create_definition", "column_definition", "null_or_notnull", "column_data_type_header", 
		"index_column_name", "reference_definition", "reference_option", "length", 
		"varchar_length", "binary_length", "alter_table_statement", "alter_table_specification", 
		"index_column_names", "index_type", "index_option", "column_definitions", 
		"rename_table_statement", "drop_table_statement", "drop_view_statement", 
		"truncate_table_statement", "create_view_statement", "create_view_body", 
		"alter_view_statement", "create_event_statement", "drop_event_statement", 
		"grant_event_statement", "principal_specification", "revoke_event_statement", 
		"show_event_statement", "show_specification", "set_event_statement", "use_event_statement", 
		"service_event_statement", "update_statements"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, "'=>'", null, null, "'<='", "'>='", "':='", "'<<'", 
		"'>>'", "'.*'", "';'", "':'", "'.'", "','", "'*'", "')'", "'('", "']'", 
		"'['", "'+'", "'-'", "'~'", "'|'", "'&'", "'^'", "'>'", "'<'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "TRUE", "FALSE", "ALL", "NOT", "LIKE", "IF", "EXISTS", "ASC", "DESC", 
		"ORDER", "GROUP", "BY", "HAVING", "WHERE", "FROM", "AS", "SELECT", "DISTINCT", 
		"INSERT", "OVERWRITE", "OUTER", "UNIQUEJOIN", "PRESERVE", "JOIN", "LEFT", 
		"RIGHT", "FULL", "ON", "PARTITION", "PARTITIONS", "TABLE", "TABLES", "COLUMNS", 
		"INDEX", "INDEXES", "REBUILD", "FUNCTIONS", "SHOW", "MSCK", "REPAIR", 
		"DIRECTORY", "LOCAL", "TRANSFORM", "USING", "CLUSTER", "DISTRIBUTE", "SORT", 
		"UNION", "LOAD", "EXPORT", "IMPORT", "DATA", "INPATH", "IS", "NULL", "CREATE", 
		"EXTERNAL", "ALTER", "CHANGE", "COLUMN", "FIRST", "AFTER", "DESCRIBE", 
		"DROP", "RENAME", "IGNORE", "PROTECTION", "TO", "COMMENT", "BOOLEAN", 
		"TINYINT", "SMALLINT", "INT", "BIGINT", "FLOAT", "DOUBLE", "DATE", "DATETIME", 
		"TIMESTAMP", "DECIMAL", "STRING", "VARCHAR", "ARRAY", "STRUCT", "MAP", 
		"UNIONTYPE", "REDUCE", "PARTITIONED", "CLUSTERED", "SORTED", "INTO", "BUCKETS", 
		"ROW", "ROWS", "FORMAT", "DELIMITED", "FIELDS", "TERMINATED", "ESCAPED", 
		"COLLECTION", "ITEMS", "KEYS", "KEY", "LINES", "STORED", "FILEFORMAT", 
		"SEQUENCEFILE", "TEXTFILE", "RCFILE", "ORCFILE", "INPUTFORMAT", "OUTPUTFORMAT", 
		"INPUTDRIVER", "OUTPUTDRIVER", "OFFLINE", "ENABLE", "DEFAULT", "DISABLE", 
		"READONLY", "LOCATION", "TABLESAMPLE", "BUCKET", "OUT", "OF", "PERCENT", 
		"CAST", "ADD", "REPLACE", "RLIKE", "REGEXP", "TEMPORARY", "FUNCTION", 
		"MACRO", "EXPLAIN", "EXTENDED", "FORMATTED", "PRETTY", "DEPENDENCY", "LOGICAL", 
		"SERDE", "WITH", "DEFERRED", "SERDEPROPERTIES", "DBPROPERTIES", "LIMIT", 
		"SET", "UNSET", "TBLPROPERTIES", "IDXPROPERTIES", "CASCADED", "CASE", 
		"WHEN", "THEN", "ELSE", "END", "MAPJOIN", "STREAMTABLE", "CLUSTERSTATUS", 
		"UTC", "LONG", "DELETE", "FETCH", "INTERSECT", "VIEW", "IN", "DATABASE", 
		"DATABASES", "MATERIALIZED", "SCHEMA", "SCHEMAS", "GRANT", "REVOKE", "SSL", 
		"UNDO", "LOCK", "LOCKS", "UNLOCK", "SHARED", "EXCLUSIVE", "PROCEDURE", 
		"UNSIGNED", "WHILE", "READ", "READS", "PURGE", "RANGE", "ANALYZE", "BEFORE", 
		"BETWEEN", "BOTH", "BINARY", "CROSS", "CONTINUE", "CURSOR", "TRIGGER", 
		"RECORDREADER", "RECORDWRITER", "LATERAL", "TOUCH", "ARCHIVE", "UNARCHIVE", 
		"COMPUTE", "STATISTICS", "USE", "OPTION", "CONCATENATE", "UPDATE", "RESTRICT", 
		"CASCADE", "SKEWED", "ROLLUP", "CUBE", "DIRECTORIES", "FOR", "WINDOW", 
		"UNBOUNDED", "PRECEDING", "FOLLOWING", "CURRENT", "LESS", "MORE", "OVER", 
		"GROUPING", "SETS", "TRUNCATE", "NOSCAN", "PARTIALSCAN", "USER", "ROLE", 
		"INNER", "EXCHANGE", "IDENTIFIED", "CHAR", "ABS", "ACOS", "ASIN", "ATAN", 
		"CEIL", "COS", "COT", "EXP", "FLOOR", "LN", "POW", "RAND", "ROUND", "SIN", 
		"SQRT", "TAN", "LCASE", "LOWER", "LTRIM", "RTRIM", "CONCAT", "SUBSTR", 
		"TRIM", "UCASE", "UPPER", "INTERVAL", "TO_DATE", "DAY", "HOUR", "MINUTE", 
		"MONTH", "SECOND", "FROM_UNIXTIME", "YEAR", "DATE_ADD", "DATE_SUB", "COLLATE", 
		"AVG", "COUNT", "MAX", "MIN", "SUM", "COALESCE", "DUPLICATE", "SERVER", 
		"ALIASES", "ALIAS", "VALUES", "VALUE", "LOW_PRIORITY", "HIGH_PRIORITY", 
		"HASH", "REFERENCES", "DIVIDE", "MOD", "OR", "AND", "XOR", "ARROW", "EQ", 
		"NOT_EQ", "LET", "GET", "SET_VAR", "SHIFT_LEFT", "SHIFT_RIGHT", "ALL_FIELDS", 
		"SEMI", "COLON", "DOT", "COMMA", "ASTERISK", "RPAREN", "LPAREN", "RBRACK", 
		"LBRACK", "PLUS", "MINUS", "NEGATION", "VERTBAR", "BITAND", "POWER_OP", 
		"GTH", "LTH", "Double_Quote", "INTEGER_NUM", "VARCHAR_NUM", "BINARY_NUM", 
		"HEX_DIGIT", "BIT_NUM", "REAL_NUMBER", "TEXT_STRING", "ID", "IDENTIFIER_WITH_WILDCARDS", 
		"WHITE_SPACE", "SL_COMMENT", "Regex_Escaped_Unicode"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "uniformSQL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public uniformSQLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class KeywordContext extends ParserRuleContext {
		public TerminalNode USE() { return getToken(uniformSQLParser.USE, 0); }
		public TerminalNode USER() { return getToken(uniformSQLParser.USER, 0); }
		public KeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyword; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitKeyword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeywordContext keyword() throws RecognitionException {
		KeywordContext _localctx = new KeywordContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_keyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			_la = _input.LA(1);
			if ( !(_la==USE || _la==USER) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Delimited_statementContext extends ParserRuleContext {
		public TerminalNode Regex_Escaped_Unicode() { return getToken(uniformSQLParser.Regex_Escaped_Unicode, 0); }
		public Delimited_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delimited_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitDelimited_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Delimited_statementContext delimited_statement() throws RecognitionException {
		Delimited_statementContext _localctx = new Delimited_statementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_delimited_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			match(Regex_Escaped_Unicode);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Integer_typesContext extends ParserRuleContext {
		public TerminalNode TINYINT() { return getToken(uniformSQLParser.TINYINT, 0); }
		public TerminalNode SMALLINT() { return getToken(uniformSQLParser.SMALLINT, 0); }
		public TerminalNode INT() { return getToken(uniformSQLParser.INT, 0); }
		public TerminalNode BIGINT() { return getToken(uniformSQLParser.BIGINT, 0); }
		public TerminalNode BOOLEAN() { return getToken(uniformSQLParser.BOOLEAN, 0); }
		public TerminalNode FLOAT() { return getToken(uniformSQLParser.FLOAT, 0); }
		public TerminalNode DOUBLE() { return getToken(uniformSQLParser.DOUBLE, 0); }
		public TerminalNode DATE() { return getToken(uniformSQLParser.DATE, 0); }
		public TerminalNode TIMESTAMP() { return getToken(uniformSQLParser.TIMESTAMP, 0); }
		public TerminalNode VARCHAR() { return getToken(uniformSQLParser.VARCHAR, 0); }
		public TerminalNode BINARY() { return getToken(uniformSQLParser.BINARY, 0); }
		public TerminalNode DECIMAL() { return getToken(uniformSQLParser.DECIMAL, 0); }
		public Integer_typesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integer_types; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitInteger_types(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Integer_typesContext integer_types() throws RecognitionException {
		Integer_typesContext _localctx = new Integer_typesContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_integer_types);
		try {
			setState(313);
			switch (_input.LA(1)) {
			case EOF:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case TINYINT:
				enterOuterAlt(_localctx, 2);
				{
				setState(301);
				match(TINYINT);
				}
				break;
			case SMALLINT:
				enterOuterAlt(_localctx, 3);
				{
				setState(302);
				match(SMALLINT);
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 4);
				{
				setState(303);
				match(INT);
				}
				break;
			case BIGINT:
				enterOuterAlt(_localctx, 5);
				{
				setState(304);
				match(BIGINT);
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 6);
				{
				setState(305);
				match(BOOLEAN);
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 7);
				{
				setState(306);
				match(FLOAT);
				}
				break;
			case DOUBLE:
				enterOuterAlt(_localctx, 8);
				{
				setState(307);
				match(DOUBLE);
				}
				break;
			case DATE:
				enterOuterAlt(_localctx, 9);
				{
				setState(308);
				match(DATE);
				}
				break;
			case TIMESTAMP:
				enterOuterAlt(_localctx, 10);
				{
				setState(309);
				match(TIMESTAMP);
				}
				break;
			case VARCHAR:
				enterOuterAlt(_localctx, 11);
				{
				setState(310);
				match(VARCHAR);
				}
				break;
			case BINARY:
				enterOuterAlt(_localctx, 12);
				{
				setState(311);
				match(BINARY);
				}
				break;
			case DECIMAL:
				enterOuterAlt(_localctx, 13);
				{
				setState(312);
				match(DECIMAL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Relational_opContext extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(uniformSQLParser.EQ, 0); }
		public TerminalNode LTH() { return getToken(uniformSQLParser.LTH, 0); }
		public TerminalNode GTH() { return getToken(uniformSQLParser.GTH, 0); }
		public TerminalNode NOT_EQ() { return getToken(uniformSQLParser.NOT_EQ, 0); }
		public TerminalNode LET() { return getToken(uniformSQLParser.LET, 0); }
		public TerminalNode GET() { return getToken(uniformSQLParser.GET, 0); }
		public Relational_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relational_op; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitRelational_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Relational_opContext relational_op() throws RecognitionException {
		Relational_opContext _localctx = new Relational_opContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_relational_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
			_la = _input.LA(1);
			if ( !(((((_la - 293)) & ~0x3f) == 0 && ((1L << (_la - 293)) & ((1L << (EQ - 293)) | (1L << (NOT_EQ - 293)) | (1L << (LET - 293)) | (1L << (GET - 293)) | (1L << (GTH - 293)) | (1L << (LTH - 293)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cast_data_typeContext extends ParserRuleContext {
		public TerminalNode BINARY() { return getToken(uniformSQLParser.BINARY, 0); }
		public List<TerminalNode> INTEGER_NUM() { return getTokens(uniformSQLParser.INTEGER_NUM); }
		public TerminalNode INTEGER_NUM(int i) {
			return getToken(uniformSQLParser.INTEGER_NUM, i);
		}
		public TerminalNode CHAR() { return getToken(uniformSQLParser.CHAR, 0); }
		public TerminalNode DATE() { return getToken(uniformSQLParser.DATE, 0); }
		public TerminalNode DATETIME() { return getToken(uniformSQLParser.DATETIME, 0); }
		public TerminalNode DECIMAL() { return getToken(uniformSQLParser.DECIMAL, 0); }
		public TerminalNode COMMA() { return getToken(uniformSQLParser.COMMA, 0); }
		public Cast_data_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cast_data_type; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitCast_data_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cast_data_typeContext cast_data_type() throws RecognitionException {
		Cast_data_typeContext _localctx = new Cast_data_typeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_cast_data_type);
		int _la;
		try {
			setState(335);
			switch (_input.LA(1)) {
			case BINARY:
				enterOuterAlt(_localctx, 1);
				{
				setState(317);
				match(BINARY);
				setState(319);
				_la = _input.LA(1);
				if (_la==INTEGER_NUM) {
					{
					setState(318);
					match(INTEGER_NUM);
					}
				}

				}
				break;
			case CHAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(321);
				match(CHAR);
				setState(323);
				_la = _input.LA(1);
				if (_la==INTEGER_NUM) {
					{
					setState(322);
					match(INTEGER_NUM);
					}
				}

				}
				break;
			case DATE:
				enterOuterAlt(_localctx, 3);
				{
				setState(325);
				match(DATE);
				}
				break;
			case DATETIME:
				enterOuterAlt(_localctx, 4);
				{
				setState(326);
				match(DATETIME);
				}
				break;
			case DECIMAL:
				enterOuterAlt(_localctx, 5);
				{
				setState(327);
				match(DECIMAL);
				setState(333);
				_la = _input.LA(1);
				if (_la==INTEGER_NUM) {
					{
					setState(328);
					match(INTEGER_NUM);
					setState(331);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(329);
						match(COMMA);
						setState(330);
						match(INTEGER_NUM);
						}
					}

					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Interval_unitContext extends ParserRuleContext {
		public TerminalNode SECOND() { return getToken(uniformSQLParser.SECOND, 0); }
		public TerminalNode MINUTE() { return getToken(uniformSQLParser.MINUTE, 0); }
		public TerminalNode HOUR() { return getToken(uniformSQLParser.HOUR, 0); }
		public TerminalNode DAY() { return getToken(uniformSQLParser.DAY, 0); }
		public TerminalNode MONTH() { return getToken(uniformSQLParser.MONTH, 0); }
		public TerminalNode YEAR() { return getToken(uniformSQLParser.YEAR, 0); }
		public Interval_unitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interval_unit; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitInterval_unit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Interval_unitContext interval_unit() throws RecognitionException {
		Interval_unitContext _localctx = new Interval_unitContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_interval_unit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
			_la = _input.LA(1);
			if ( !(((((_la - 261)) & ~0x3f) == 0 && ((1L << (_la - 261)) & ((1L << (DAY - 261)) | (1L << (HOUR - 261)) | (1L << (MINUTE - 261)) | (1L << (MONTH - 261)) | (1L << (SECOND - 261)) | (1L << (YEAR - 261)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class String_literalContext extends ParserRuleContext {
		public TerminalNode TEXT_STRING() { return getToken(uniformSQLParser.TEXT_STRING, 0); }
		public String_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_literal; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitString_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final String_literalContext string_literal() throws RecognitionException {
		String_literalContext _localctx = new String_literalContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_string_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(339);
			match(TEXT_STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Number_literalContext extends ParserRuleContext {
		public TerminalNode INTEGER_NUM() { return getToken(uniformSQLParser.INTEGER_NUM, 0); }
		public TerminalNode REAL_NUMBER() { return getToken(uniformSQLParser.REAL_NUMBER, 0); }
		public TerminalNode PLUS() { return getToken(uniformSQLParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(uniformSQLParser.MINUS, 0); }
		public Number_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number_literal; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitNumber_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Number_literalContext number_literal() throws RecognitionException {
		Number_literalContext _localctx = new Number_literalContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_number_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(342);
			_la = _input.LA(1);
			if (_la==PLUS || _la==MINUS) {
				{
				setState(341);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			setState(344);
			_la = _input.LA(1);
			if ( !(_la==INTEGER_NUM || _la==REAL_NUMBER) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Hex_literalContext extends ParserRuleContext {
		public TerminalNode HEX_DIGIT() { return getToken(uniformSQLParser.HEX_DIGIT, 0); }
		public Hex_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hex_literal; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitHex_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Hex_literalContext hex_literal() throws RecognitionException {
		Hex_literalContext _localctx = new Hex_literalContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_hex_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(346);
			match(HEX_DIGIT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Boolean_literalContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(uniformSQLParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(uniformSQLParser.FALSE, 0); }
		public Boolean_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolean_literal; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitBoolean_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Boolean_literalContext boolean_literal() throws RecognitionException {
		Boolean_literalContext _localctx = new Boolean_literalContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_boolean_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(348);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bit_literalContext extends ParserRuleContext {
		public TerminalNode BIT_NUM() { return getToken(uniformSQLParser.BIT_NUM, 0); }
		public Bit_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bit_literal; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitBit_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bit_literalContext bit_literal() throws RecognitionException {
		Bit_literalContext _localctx = new Bit_literalContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_bit_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(350);
			match(BIT_NUM);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Literal_valueContext extends ParserRuleContext {
		public String_literalContext string_literal() {
			return getRuleContext(String_literalContext.class,0);
		}
		public Number_literalContext number_literal() {
			return getRuleContext(Number_literalContext.class,0);
		}
		public Hex_literalContext hex_literal() {
			return getRuleContext(Hex_literalContext.class,0);
		}
		public Boolean_literalContext boolean_literal() {
			return getRuleContext(Boolean_literalContext.class,0);
		}
		public Bit_literalContext bit_literal() {
			return getRuleContext(Bit_literalContext.class,0);
		}
		public TerminalNode NULL() { return getToken(uniformSQLParser.NULL, 0); }
		public Literal_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal_value; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitLiteral_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Literal_valueContext literal_value() throws RecognitionException {
		Literal_valueContext _localctx = new Literal_valueContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_literal_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(358);
			switch (_input.LA(1)) {
			case TEXT_STRING:
				{
				setState(352);
				string_literal();
				}
				break;
			case PLUS:
			case MINUS:
			case INTEGER_NUM:
			case REAL_NUMBER:
				{
				setState(353);
				number_literal();
				}
				break;
			case HEX_DIGIT:
				{
				setState(354);
				hex_literal();
				}
				break;
			case TRUE:
			case FALSE:
				{
				setState(355);
				boolean_literal();
				}
				break;
			case BIT_NUM:
				{
				setState(356);
				bit_literal();
				}
				break;
			case NULL:
				{
				setState(357);
				match(NULL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionListContext extends ParserRuleContext {
		public Number_functionsContext number_functions() {
			return getRuleContext(Number_functionsContext.class,0);
		}
		public Char_functionsContext char_functions() {
			return getRuleContext(Char_functionsContext.class,0);
		}
		public Time_functionsContext time_functions() {
			return getRuleContext(Time_functionsContext.class,0);
		}
		public Other_functionsContext other_functions() {
			return getRuleContext(Other_functionsContext.class,0);
		}
		public Group_functionsContext group_functions() {
			return getRuleContext(Group_functionsContext.class,0);
		}
		public FunctionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitFunctionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionListContext functionList() throws RecognitionException {
		FunctionListContext _localctx = new FunctionListContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_functionList);
		try {
			setState(365);
			switch (_input.LA(1)) {
			case ABS:
			case ACOS:
			case ASIN:
			case ATAN:
			case CEIL:
			case COS:
			case COT:
			case EXP:
			case FLOOR:
			case LN:
			case POW:
			case RAND:
			case ROUND:
			case SIN:
			case SQRT:
			case TAN:
				enterOuterAlt(_localctx, 1);
				{
				setState(360);
				number_functions();
				}
				break;
			case LCASE:
			case LOWER:
			case LTRIM:
			case RTRIM:
			case CONCAT:
			case SUBSTR:
			case TRIM:
			case UCASE:
			case UPPER:
				enterOuterAlt(_localctx, 2);
				{
				setState(361);
				char_functions();
				}
				break;
			case TO_DATE:
			case DAY:
			case HOUR:
			case MINUTE:
			case MONTH:
			case SECOND:
			case FROM_UNIXTIME:
			case YEAR:
			case DATE_ADD:
			case DATE_SUB:
				enterOuterAlt(_localctx, 3);
				{
				setState(362);
				time_functions();
				}
				break;
			case COALESCE:
				enterOuterAlt(_localctx, 4);
				{
				setState(363);
				other_functions();
				}
				break;
			case AVG:
			case COUNT:
			case MAX:
			case MIN:
			case SUM:
				enterOuterAlt(_localctx, 5);
				{
				setState(364);
				group_functions();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Number_functionsContext extends ParserRuleContext {
		public TerminalNode ABS() { return getToken(uniformSQLParser.ABS, 0); }
		public TerminalNode ACOS() { return getToken(uniformSQLParser.ACOS, 0); }
		public TerminalNode ASIN() { return getToken(uniformSQLParser.ASIN, 0); }
		public TerminalNode ATAN() { return getToken(uniformSQLParser.ATAN, 0); }
		public TerminalNode CEIL() { return getToken(uniformSQLParser.CEIL, 0); }
		public TerminalNode COS() { return getToken(uniformSQLParser.COS, 0); }
		public TerminalNode COT() { return getToken(uniformSQLParser.COT, 0); }
		public TerminalNode EXP() { return getToken(uniformSQLParser.EXP, 0); }
		public TerminalNode FLOOR() { return getToken(uniformSQLParser.FLOOR, 0); }
		public TerminalNode LN() { return getToken(uniformSQLParser.LN, 0); }
		public TerminalNode POW() { return getToken(uniformSQLParser.POW, 0); }
		public TerminalNode RAND() { return getToken(uniformSQLParser.RAND, 0); }
		public TerminalNode ROUND() { return getToken(uniformSQLParser.ROUND, 0); }
		public TerminalNode SIN() { return getToken(uniformSQLParser.SIN, 0); }
		public TerminalNode SQRT() { return getToken(uniformSQLParser.SQRT, 0); }
		public TerminalNode TAN() { return getToken(uniformSQLParser.TAN, 0); }
		public Number_functionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number_functions; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitNumber_functions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Number_functionsContext number_functions() throws RecognitionException {
		Number_functionsContext _localctx = new Number_functionsContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_number_functions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(367);
			_la = _input.LA(1);
			if ( !(((((_la - 234)) & ~0x3f) == 0 && ((1L << (_la - 234)) & ((1L << (ABS - 234)) | (1L << (ACOS - 234)) | (1L << (ASIN - 234)) | (1L << (ATAN - 234)) | (1L << (CEIL - 234)) | (1L << (COS - 234)) | (1L << (COT - 234)) | (1L << (EXP - 234)) | (1L << (FLOOR - 234)) | (1L << (LN - 234)) | (1L << (POW - 234)) | (1L << (RAND - 234)) | (1L << (ROUND - 234)) | (1L << (SIN - 234)) | (1L << (SQRT - 234)) | (1L << (TAN - 234)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Char_functionsContext extends ParserRuleContext {
		public TerminalNode LCASE() { return getToken(uniformSQLParser.LCASE, 0); }
		public TerminalNode LOWER() { return getToken(uniformSQLParser.LOWER, 0); }
		public TerminalNode LTRIM() { return getToken(uniformSQLParser.LTRIM, 0); }
		public TerminalNode RTRIM() { return getToken(uniformSQLParser.RTRIM, 0); }
		public TerminalNode CONCAT() { return getToken(uniformSQLParser.CONCAT, 0); }
		public TerminalNode SUBSTR() { return getToken(uniformSQLParser.SUBSTR, 0); }
		public TerminalNode TRIM() { return getToken(uniformSQLParser.TRIM, 0); }
		public TerminalNode UCASE() { return getToken(uniformSQLParser.UCASE, 0); }
		public TerminalNode UPPER() { return getToken(uniformSQLParser.UPPER, 0); }
		public Char_functionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_char_functions; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitChar_functions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Char_functionsContext char_functions() throws RecognitionException {
		Char_functionsContext _localctx = new Char_functionsContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_char_functions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(369);
			_la = _input.LA(1);
			if ( !(((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (LCASE - 250)) | (1L << (LOWER - 250)) | (1L << (LTRIM - 250)) | (1L << (RTRIM - 250)) | (1L << (CONCAT - 250)) | (1L << (SUBSTR - 250)) | (1L << (TRIM - 250)) | (1L << (UCASE - 250)) | (1L << (UPPER - 250)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Time_functionsContext extends ParserRuleContext {
		public TerminalNode TO_DATE() { return getToken(uniformSQLParser.TO_DATE, 0); }
		public TerminalNode DAY() { return getToken(uniformSQLParser.DAY, 0); }
		public TerminalNode HOUR() { return getToken(uniformSQLParser.HOUR, 0); }
		public TerminalNode MINUTE() { return getToken(uniformSQLParser.MINUTE, 0); }
		public TerminalNode MONTH() { return getToken(uniformSQLParser.MONTH, 0); }
		public TerminalNode SECOND() { return getToken(uniformSQLParser.SECOND, 0); }
		public TerminalNode FROM_UNIXTIME() { return getToken(uniformSQLParser.FROM_UNIXTIME, 0); }
		public TerminalNode YEAR() { return getToken(uniformSQLParser.YEAR, 0); }
		public TerminalNode DATE_ADD() { return getToken(uniformSQLParser.DATE_ADD, 0); }
		public TerminalNode DATE_SUB() { return getToken(uniformSQLParser.DATE_SUB, 0); }
		public Time_functionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_time_functions; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitTime_functions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Time_functionsContext time_functions() throws RecognitionException {
		Time_functionsContext _localctx = new Time_functionsContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_time_functions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(371);
			_la = _input.LA(1);
			if ( !(((((_la - 260)) & ~0x3f) == 0 && ((1L << (_la - 260)) & ((1L << (TO_DATE - 260)) | (1L << (DAY - 260)) | (1L << (HOUR - 260)) | (1L << (MINUTE - 260)) | (1L << (MONTH - 260)) | (1L << (SECOND - 260)) | (1L << (FROM_UNIXTIME - 260)) | (1L << (YEAR - 260)) | (1L << (DATE_ADD - 260)) | (1L << (DATE_SUB - 260)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Other_functionsContext extends ParserRuleContext {
		public TerminalNode COALESCE() { return getToken(uniformSQLParser.COALESCE, 0); }
		public Other_functionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_other_functions; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitOther_functions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Other_functionsContext other_functions() throws RecognitionException {
		Other_functionsContext _localctx = new Other_functionsContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_other_functions);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(373);
			match(COALESCE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Group_functionsContext extends ParserRuleContext {
		public TerminalNode AVG() { return getToken(uniformSQLParser.AVG, 0); }
		public TerminalNode COUNT() { return getToken(uniformSQLParser.COUNT, 0); }
		public TerminalNode MAX() { return getToken(uniformSQLParser.MAX, 0); }
		public TerminalNode MIN() { return getToken(uniformSQLParser.MIN, 0); }
		public TerminalNode SUM() { return getToken(uniformSQLParser.SUM, 0); }
		public Group_functionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_group_functions; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitGroup_functions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Group_functionsContext group_functions() throws RecognitionException {
		Group_functionsContext _localctx = new Group_functionsContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_group_functions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(375);
			_la = _input.LA(1);
			if ( !(((((_la - 271)) & ~0x3f) == 0 && ((1L << (_la - 271)) & ((1L << (AVG - 271)) | (1L << (COUNT - 271)) | (1L << (MAX - 271)) | (1L << (MIN - 271)) | (1L << (SUM - 271)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Schema_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Schema_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_schema_name; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitSchema_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Schema_nameContext schema_name() throws RecognitionException {
		Schema_nameContext _localctx = new Schema_nameContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_schema_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(377);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Database_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Database_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_database_name; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitDatabase_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Database_nameContext database_name() throws RecognitionException {
		Database_nameContext _localctx = new Database_nameContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_database_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_name; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitTable_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_nameContext table_name() throws RecognitionException {
		Table_nameContext _localctx = new Table_nameContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(381);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Engine_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Engine_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_engine_name; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitEngine_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Engine_nameContext engine_name() throws RecognitionException {
		Engine_nameContext _localctx = new Engine_nameContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_engine_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(383);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Column_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_name; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitColumn_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_nameContext column_name() throws RecognitionException {
		Column_nameContext _localctx = new Column_nameContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(385);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class View_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public View_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_view_name; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitView_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final View_nameContext view_name() throws RecognitionException {
		View_nameContext _localctx = new View_nameContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_view_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(387);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Parser_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Parser_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parser_name; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitParser_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parser_nameContext parser_name() throws RecognitionException {
		Parser_nameContext _localctx = new Parser_nameContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_parser_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(389);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Index_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Index_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_name; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitIndex_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Index_nameContext index_name() throws RecognitionException {
		Index_nameContext _localctx = new Index_nameContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_index_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(391);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Partition_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Partition_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partition_name; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitPartition_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Partition_nameContext partition_name() throws RecognitionException {
		Partition_nameContext _localctx = new Partition_nameContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_partition_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(393);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Partition_logical_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Partition_logical_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partition_logical_name; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitPartition_logical_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Partition_logical_nameContext partition_logical_name() throws RecognitionException {
		Partition_logical_nameContext _localctx = new Partition_logical_nameContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_partition_logical_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(395);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Constraintbol_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Constraintbol_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constraintbol_name; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitConstraintbol_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Constraintbol_nameContext constraintbol_name() throws RecognitionException {
		Constraintbol_nameContext _localctx = new Constraintbol_nameContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_constraintbol_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(397);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Foreign_keybol_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Foreign_keybol_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreign_keybol_name; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitForeign_keybol_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Foreign_keybol_nameContext foreign_keybol_name() throws RecognitionException {
		Foreign_keybol_nameContext _localctx = new Foreign_keybol_nameContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_foreign_keybol_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(399);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Collation_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Collation_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collation_name; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitCollation_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Collation_nameContext collation_name() throws RecognitionException {
		Collation_nameContext _localctx = new Collation_nameContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_collation_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(401);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Event_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Event_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_event_name; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitEvent_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Event_nameContext event_name() throws RecognitionException {
		Event_nameContext _localctx = new Event_nameContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_event_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(403);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class User_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public User_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_user_name; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitUser_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final User_nameContext user_name() throws RecognitionException {
		User_nameContext _localctx = new User_nameContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_user_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(405);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Function_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_name; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitFunction_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_nameContext function_name() throws RecognitionException {
		Function_nameContext _localctx = new Function_nameContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_function_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(407);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Procedure_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Procedure_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedure_name; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitProcedure_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Procedure_nameContext procedure_name() throws RecognitionException {
		Procedure_nameContext _localctx = new Procedure_nameContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_procedure_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(409);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Server_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Server_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_server_name; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitServer_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Server_nameContext server_name() throws RecognitionException {
		Server_nameContext _localctx = new Server_nameContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_server_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(411);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Wrapper_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Wrapper_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wrapper_name; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitWrapper_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Wrapper_nameContext wrapper_name() throws RecognitionException {
		Wrapper_nameContext _localctx = new Wrapper_nameContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_wrapper_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(413);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AliasContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public TerminalNode AS() { return getToken(uniformSQLParser.AS, 0); }
		public AliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alias; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitAlias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AliasContext alias() throws RecognitionException {
		AliasContext _localctx = new AliasContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_alias);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(416);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(415);
				match(AS);
				}
			}

			setState(418);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PasswordContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public PasswordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_password; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitPassword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PasswordContext password() throws RecognitionException {
		PasswordContext _localctx = new PasswordContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_password);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(420);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Server_aliasContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Server_aliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_server_alias; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitServer_alias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Server_aliasContext server_alias() throws RecognitionException {
		Server_aliasContext _localctx = new Server_aliasContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_server_alias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(422);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Role_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Role_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_role_name; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitRole_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Role_nameContext role_name() throws RecognitionException {
		Role_nameContext _localctx = new Role_nameContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_role_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(424);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Group_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Group_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_group_name; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitGroup_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Group_nameContext group_name() throws RecognitionException {
		Group_nameContext _localctx = new Group_nameContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_group_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(426);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Principal_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Principal_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_principal_name; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitPrincipal_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Principal_nameContext principal_name() throws RecognitionException {
		Principal_nameContext _localctx = new Principal_nameContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_principal_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(428);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Any_nameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(uniformSQLParser.ID, 0); }
		public KeywordContext keyword() {
			return getRuleContext(KeywordContext.class,0);
		}
		public Any_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_any_name; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitAny_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Any_nameContext any_name() throws RecognitionException {
		Any_nameContext _localctx = new Any_nameContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_any_name);
		try {
			setState(432);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(430);
				match(ID);
				}
				break;
			case USE:
			case USER:
				enterOuterAlt(_localctx, 2);
				{
				setState(431);
				keyword();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Priv_typeContext extends ParserRuleContext {
		public TerminalNode INSERT() { return getToken(uniformSQLParser.INSERT, 0); }
		public TerminalNode SELECT() { return getToken(uniformSQLParser.SELECT, 0); }
		public TerminalNode UPDATE() { return getToken(uniformSQLParser.UPDATE, 0); }
		public TerminalNode DELETE() { return getToken(uniformSQLParser.DELETE, 0); }
		public TerminalNode ALL() { return getToken(uniformSQLParser.ALL, 0); }
		public Priv_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_priv_type; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitPriv_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Priv_typeContext priv_type() throws RecognitionException {
		Priv_typeContext _localctx = new Priv_typeContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_priv_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(434);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALL) | (1L << SELECT) | (1L << INSERT))) != 0) || _la==DELETE || _la==UPDATE) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public List<Exp_factor1Context> exp_factor1() {
			return getRuleContexts(Exp_factor1Context.class);
		}
		public Exp_factor1Context exp_factor1(int i) {
			return getRuleContext(Exp_factor1Context.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(uniformSQLParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(uniformSQLParser.OR, i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(436);
			exp_factor1();
			setState(441);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(437);
				match(OR);
				setState(438);
				exp_factor1();
				}
				}
				setState(443);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Exp_factor1Context extends ParserRuleContext {
		public List<Exp_factor2Context> exp_factor2() {
			return getRuleContexts(Exp_factor2Context.class);
		}
		public Exp_factor2Context exp_factor2(int i) {
			return getRuleContext(Exp_factor2Context.class,i);
		}
		public List<TerminalNode> XOR() { return getTokens(uniformSQLParser.XOR); }
		public TerminalNode XOR(int i) {
			return getToken(uniformSQLParser.XOR, i);
		}
		public Exp_factor1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp_factor1; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitExp_factor1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exp_factor1Context exp_factor1() throws RecognitionException {
		Exp_factor1Context _localctx = new Exp_factor1Context(_ctx, getState());
		enterRule(_localctx, 92, RULE_exp_factor1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(444);
			exp_factor2();
			setState(449);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==XOR) {
				{
				{
				setState(445);
				match(XOR);
				setState(446);
				exp_factor2();
				}
				}
				setState(451);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Exp_factor2Context extends ParserRuleContext {
		public List<Exp_factor3Context> exp_factor3() {
			return getRuleContexts(Exp_factor3Context.class);
		}
		public Exp_factor3Context exp_factor3(int i) {
			return getRuleContext(Exp_factor3Context.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(uniformSQLParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(uniformSQLParser.AND, i);
		}
		public Exp_factor2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp_factor2; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitExp_factor2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exp_factor2Context exp_factor2() throws RecognitionException {
		Exp_factor2Context _localctx = new Exp_factor2Context(_ctx, getState());
		enterRule(_localctx, 94, RULE_exp_factor2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(452);
			exp_factor3();
			setState(457);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(453);
				match(AND);
				setState(454);
				exp_factor3();
				}
				}
				setState(459);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Exp_factor3Context extends ParserRuleContext {
		public Exp_factor4Context exp_factor4() {
			return getRuleContext(Exp_factor4Context.class,0);
		}
		public TerminalNode NOT() { return getToken(uniformSQLParser.NOT, 0); }
		public Exp_factor3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp_factor3; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitExp_factor3(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exp_factor3Context exp_factor3() throws RecognitionException {
		Exp_factor3Context _localctx = new Exp_factor3Context(_ctx, getState());
		enterRule(_localctx, 96, RULE_exp_factor3);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(461);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(460);
				match(NOT);
				}
				break;
			}
			setState(463);
			exp_factor4();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Exp_factor4Context extends ParserRuleContext {
		public Bool_primaryContext bool_primary() {
			return getRuleContext(Bool_primaryContext.class,0);
		}
		public TerminalNode IS() { return getToken(uniformSQLParser.IS, 0); }
		public Boolean_literalContext boolean_literal() {
			return getRuleContext(Boolean_literalContext.class,0);
		}
		public TerminalNode NULL() { return getToken(uniformSQLParser.NULL, 0); }
		public TerminalNode NOT() { return getToken(uniformSQLParser.NOT, 0); }
		public Exp_factor4Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp_factor4; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitExp_factor4(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exp_factor4Context exp_factor4() throws RecognitionException {
		Exp_factor4Context _localctx = new Exp_factor4Context(_ctx, getState());
		enterRule(_localctx, 98, RULE_exp_factor4);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(465);
			bool_primary();
			setState(474);
			_la = _input.LA(1);
			if (_la==IS) {
				{
				setState(466);
				match(IS);
				setState(468);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(467);
					match(NOT);
					}
				}

				setState(472);
				switch (_input.LA(1)) {
				case TRUE:
				case FALSE:
					{
					setState(470);
					boolean_literal();
					}
					break;
				case NULL:
					{
					setState(471);
					match(NULL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bool_primaryContext extends ParserRuleContext {
		public List<PredicateContext> predicate() {
			return getRuleContexts(PredicateContext.class);
		}
		public PredicateContext predicate(int i) {
			return getRuleContext(PredicateContext.class,i);
		}
		public Relational_opContext relational_op() {
			return getRuleContext(Relational_opContext.class,0);
		}
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public TerminalNode ALL() { return getToken(uniformSQLParser.ALL, 0); }
		public TerminalNode EXISTS() { return getToken(uniformSQLParser.EXISTS, 0); }
		public TerminalNode NOT() { return getToken(uniformSQLParser.NOT, 0); }
		public Bool_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_primary; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitBool_primary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_primaryContext bool_primary() throws RecognitionException {
		Bool_primaryContext _localctx = new Bool_primaryContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_bool_primary);
		int _la;
		try {
			setState(493);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(476);
				predicate();
				setState(477);
				relational_op();
				setState(478);
				predicate();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(480);
				predicate();
				setState(481);
				relational_op();
				setState(483);
				_la = _input.LA(1);
				if (_la==ALL) {
					{
					setState(482);
					match(ALL);
					}
				}

				setState(485);
				subquery();
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(488);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(487);
					match(NOT);
					}
				}

				setState(490);
				match(EXISTS);
				setState(491);
				subquery();
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(492);
				predicate();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PredicateContext extends ParserRuleContext {
		public List<Bit_exprContext> bit_expr() {
			return getRuleContexts(Bit_exprContext.class);
		}
		public Bit_exprContext bit_expr(int i) {
			return getRuleContext(Bit_exprContext.class,i);
		}
		public TerminalNode IN() { return getToken(uniformSQLParser.IN, 0); }
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
		}
		public TerminalNode NOT() { return getToken(uniformSQLParser.NOT, 0); }
		public TerminalNode BETWEEN() { return getToken(uniformSQLParser.BETWEEN, 0); }
		public TerminalNode AND() { return getToken(uniformSQLParser.AND, 0); }
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public TerminalNode LIKE() { return getToken(uniformSQLParser.LIKE, 0); }
		public Simple_exprContext simple_expr() {
			return getRuleContext(Simple_exprContext.class,0);
		}
		public TerminalNode REGEXP() { return getToken(uniformSQLParser.REGEXP, 0); }
		public PredicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicate; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitPredicate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PredicateContext predicate() throws RecognitionException {
		PredicateContext _localctx = new PredicateContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_predicate);
		int _la;
		try {
			setState(528);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(495);
				bit_expr();
				setState(497);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(496);
					match(NOT);
					}
				}

				setState(499);
				match(IN);
				setState(502);
				switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
				case 1:
					{
					setState(500);
					subquery();
					}
					break;
				case 2:
					{
					setState(501);
					expression_list();
					}
					break;
				}
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(504);
				bit_expr();
				setState(506);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(505);
					match(NOT);
					}
				}

				setState(508);
				match(BETWEEN);
				setState(509);
				bit_expr();
				setState(510);
				match(AND);
				setState(511);
				predicate();
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(513);
				bit_expr();
				setState(515);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(514);
					match(NOT);
					}
				}

				setState(517);
				match(LIKE);
				setState(518);
				simple_expr();
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(520);
				bit_expr();
				setState(522);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(521);
					match(NOT);
					}
				}

				setState(524);
				match(REGEXP);
				setState(525);
				bit_expr();
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				{
				setState(527);
				bit_expr();
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bit_exprContext extends ParserRuleContext {
		public List<Factor1Context> factor1() {
			return getRuleContexts(Factor1Context.class);
		}
		public Factor1Context factor1(int i) {
			return getRuleContext(Factor1Context.class,i);
		}
		public TerminalNode VERTBAR() { return getToken(uniformSQLParser.VERTBAR, 0); }
		public Bit_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bit_expr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitBit_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bit_exprContext bit_expr() throws RecognitionException {
		Bit_exprContext _localctx = new Bit_exprContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_bit_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(530);
			factor1();
			setState(533);
			_la = _input.LA(1);
			if (_la==VERTBAR) {
				{
				setState(531);
				match(VERTBAR);
				setState(532);
				factor1();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Factor1Context extends ParserRuleContext {
		public List<Factor2Context> factor2() {
			return getRuleContexts(Factor2Context.class);
		}
		public Factor2Context factor2(int i) {
			return getRuleContext(Factor2Context.class,i);
		}
		public TerminalNode BITAND() { return getToken(uniformSQLParser.BITAND, 0); }
		public Factor1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor1; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitFactor1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Factor1Context factor1() throws RecognitionException {
		Factor1Context _localctx = new Factor1Context(_ctx, getState());
		enterRule(_localctx, 106, RULE_factor1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(535);
			factor2();
			setState(538);
			_la = _input.LA(1);
			if (_la==BITAND) {
				{
				setState(536);
				match(BITAND);
				setState(537);
				factor2();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Factor2Context extends ParserRuleContext {
		public List<Factor3Context> factor3() {
			return getRuleContexts(Factor3Context.class);
		}
		public Factor3Context factor3(int i) {
			return getRuleContext(Factor3Context.class,i);
		}
		public TerminalNode SHIFT_LEFT() { return getToken(uniformSQLParser.SHIFT_LEFT, 0); }
		public TerminalNode SHIFT_RIGHT() { return getToken(uniformSQLParser.SHIFT_RIGHT, 0); }
		public Factor2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor2; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitFactor2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Factor2Context factor2() throws RecognitionException {
		Factor2Context _localctx = new Factor2Context(_ctx, getState());
		enterRule(_localctx, 108, RULE_factor2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(540);
			factor3();
			setState(543);
			_la = _input.LA(1);
			if (_la==SHIFT_LEFT || _la==SHIFT_RIGHT) {
				{
				setState(541);
				_la = _input.LA(1);
				if ( !(_la==SHIFT_LEFT || _la==SHIFT_RIGHT) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(542);
				factor3();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Factor3Context extends ParserRuleContext {
		public List<Factor4Context> factor4() {
			return getRuleContexts(Factor4Context.class);
		}
		public Factor4Context factor4(int i) {
			return getRuleContext(Factor4Context.class,i);
		}
		public TerminalNode PLUS() { return getToken(uniformSQLParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(uniformSQLParser.MINUS, 0); }
		public Factor3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor3; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitFactor3(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Factor3Context factor3() throws RecognitionException {
		Factor3Context _localctx = new Factor3Context(_ctx, getState());
		enterRule(_localctx, 110, RULE_factor3);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(545);
			factor4();
			setState(548);
			_la = _input.LA(1);
			if (_la==PLUS || _la==MINUS) {
				{
				setState(546);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(547);
				factor4();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Factor4Context extends ParserRuleContext {
		public List<Factor5Context> factor5() {
			return getRuleContexts(Factor5Context.class);
		}
		public Factor5Context factor5(int i) {
			return getRuleContext(Factor5Context.class,i);
		}
		public TerminalNode ASTERISK() { return getToken(uniformSQLParser.ASTERISK, 0); }
		public TerminalNode DIVIDE() { return getToken(uniformSQLParser.DIVIDE, 0); }
		public TerminalNode MOD() { return getToken(uniformSQLParser.MOD, 0); }
		public TerminalNode POWER_OP() { return getToken(uniformSQLParser.POWER_OP, 0); }
		public Factor4Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor4; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitFactor4(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Factor4Context factor4() throws RecognitionException {
		Factor4Context _localctx = new Factor4Context(_ctx, getState());
		enterRule(_localctx, 112, RULE_factor4);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(550);
			factor5();
			setState(553);
			_la = _input.LA(1);
			if (((((_la - 287)) & ~0x3f) == 0 && ((1L << (_la - 287)) & ((1L << (DIVIDE - 287)) | (1L << (MOD - 287)) | (1L << (ASTERISK - 287)) | (1L << (POWER_OP - 287)))) != 0)) {
				{
				setState(551);
				_la = _input.LA(1);
				if ( !(((((_la - 287)) & ~0x3f) == 0 && ((1L << (_la - 287)) & ((1L << (DIVIDE - 287)) | (1L << (MOD - 287)) | (1L << (ASTERISK - 287)) | (1L << (POWER_OP - 287)))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(552);
				factor5();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Factor5Context extends ParserRuleContext {
		public Factor6Context factor6() {
			return getRuleContext(Factor6Context.class,0);
		}
		public Interval_exprContext interval_expr() {
			return getRuleContext(Interval_exprContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(uniformSQLParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(uniformSQLParser.MINUS, 0); }
		public Factor5Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor5; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitFactor5(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Factor5Context factor5() throws RecognitionException {
		Factor5Context _localctx = new Factor5Context(_ctx, getState());
		enterRule(_localctx, 114, RULE_factor5);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(555);
			factor6();
			setState(558);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				setState(556);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(557);
				interval_expr();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Factor6Context extends ParserRuleContext {
		public Simple_exprContext simple_expr() {
			return getRuleContext(Simple_exprContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(uniformSQLParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(uniformSQLParser.MINUS, 0); }
		public TerminalNode NEGATION() { return getToken(uniformSQLParser.NEGATION, 0); }
		public TerminalNode BINARY() { return getToken(uniformSQLParser.BINARY, 0); }
		public Factor6Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor6; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitFactor6(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Factor6Context factor6() throws RecognitionException {
		Factor6Context _localctx = new Factor6Context(_ctx, getState());
		enterRule(_localctx, 116, RULE_factor6);
		int _la;
		try {
			setState(563);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(560);
				_la = _input.LA(1);
				if ( !(_la==BINARY || ((((_la - 310)) & ~0x3f) == 0 && ((1L << (_la - 310)) & ((1L << (PLUS - 310)) | (1L << (MINUS - 310)) | (1L << (NEGATION - 310)))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(561);
				simple_expr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(562);
				simple_expr();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Factor7Context extends ParserRuleContext {
		public Simple_exprContext simple_expr() {
			return getRuleContext(Simple_exprContext.class,0);
		}
		public Factor7Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor7; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitFactor7(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Factor7Context factor7() throws RecognitionException {
		Factor7Context _localctx = new Factor7Context(_ctx, getState());
		enterRule(_localctx, 118, RULE_factor7);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(565);
			simple_expr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Simple_exprContext extends ParserRuleContext {
		public Literal_valueContext literal_value() {
			return getRuleContext(Literal_valueContext.class,0);
		}
		public Column_specContext column_spec() {
			return getRuleContext(Column_specContext.class,0);
		}
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
		}
		public TerminalNode ROW() { return getToken(uniformSQLParser.ROW, 0); }
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public TerminalNode EXISTS() { return getToken(uniformSQLParser.EXISTS, 0); }
		public Case_when_statementContext case_when_statement() {
			return getRuleContext(Case_when_statementContext.class,0);
		}
		public Simple_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_expr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitSimple_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simple_exprContext simple_expr() throws RecognitionException {
		Simple_exprContext _localctx = new Simple_exprContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_simple_expr);
		try {
			setState(577);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(567);
				literal_value();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(568);
				column_spec();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(569);
				function_call();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(570);
				expression_list();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				{
				setState(571);
				match(ROW);
				setState(572);
				expression_list();
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(573);
				subquery();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(574);
				match(EXISTS);
				setState(575);
				subquery();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(576);
				case_when_statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_callContext extends ParserRuleContext {
		public FunctionListContext functionList() {
			return getRuleContext(FunctionListContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(uniformSQLParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(uniformSQLParser.RPAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(uniformSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(uniformSQLParser.COMMA, i);
		}
		public TerminalNode CAST() { return getToken(uniformSQLParser.CAST, 0); }
		public TerminalNode AS() { return getToken(uniformSQLParser.AS, 0); }
		public Cast_data_typeContext cast_data_type() {
			return getRuleContext(Cast_data_typeContext.class,0);
		}
		public Group_functionsContext group_functions() {
			return getRuleContext(Group_functionsContext.class,0);
		}
		public Bit_exprContext bit_expr() {
			return getRuleContext(Bit_exprContext.class,0);
		}
		public TerminalNode ASTERISK() { return getToken(uniformSQLParser.ASTERISK, 0); }
		public TerminalNode ALL() { return getToken(uniformSQLParser.ALL, 0); }
		public TerminalNode DISTINCT() { return getToken(uniformSQLParser.DISTINCT, 0); }
		public Function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitFunction_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_function_call);
		int _la;
		try {
			setState(609);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(579);
				functionList();
				setState(592);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(580);
					match(LPAREN);
					setState(589);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUE) | (1L << FALSE) | (1L << NOT) | (1L << EXISTS) | (1L << NULL))) != 0) || ((((_la - 93)) & ~0x3f) == 0 && ((1L << (_la - 93)) & ((1L << (ROW - 93)) | (1L << (CAST - 93)) | (1L << (CASE - 93)))) != 0) || ((((_la - 191)) & ~0x3f) == 0 && ((1L << (_la - 191)) & ((1L << (BINARY - 191)) | (1L << (USE - 191)) | (1L << (USER - 191)) | (1L << (ABS - 191)) | (1L << (ACOS - 191)) | (1L << (ASIN - 191)) | (1L << (ATAN - 191)) | (1L << (CEIL - 191)) | (1L << (COS - 191)) | (1L << (COT - 191)) | (1L << (EXP - 191)) | (1L << (FLOOR - 191)) | (1L << (LN - 191)) | (1L << (POW - 191)) | (1L << (RAND - 191)) | (1L << (ROUND - 191)) | (1L << (SIN - 191)) | (1L << (SQRT - 191)) | (1L << (TAN - 191)) | (1L << (LCASE - 191)) | (1L << (LOWER - 191)) | (1L << (LTRIM - 191)) | (1L << (RTRIM - 191)) | (1L << (CONCAT - 191)))) != 0) || ((((_la - 255)) & ~0x3f) == 0 && ((1L << (_la - 255)) & ((1L << (SUBSTR - 255)) | (1L << (TRIM - 255)) | (1L << (UCASE - 255)) | (1L << (UPPER - 255)) | (1L << (TO_DATE - 255)) | (1L << (DAY - 255)) | (1L << (HOUR - 255)) | (1L << (MINUTE - 255)) | (1L << (MONTH - 255)) | (1L << (SECOND - 255)) | (1L << (FROM_UNIXTIME - 255)) | (1L << (YEAR - 255)) | (1L << (DATE_ADD - 255)) | (1L << (DATE_SUB - 255)) | (1L << (AVG - 255)) | (1L << (COUNT - 255)) | (1L << (MAX - 255)) | (1L << (MIN - 255)) | (1L << (SUM - 255)) | (1L << (COALESCE - 255)) | (1L << (LPAREN - 255)) | (1L << (PLUS - 255)) | (1L << (MINUS - 255)) | (1L << (NEGATION - 255)))) != 0) || ((((_la - 319)) & ~0x3f) == 0 && ((1L << (_la - 319)) & ((1L << (INTEGER_NUM - 319)) | (1L << (HEX_DIGIT - 319)) | (1L << (BIT_NUM - 319)) | (1L << (REAL_NUMBER - 319)) | (1L << (TEXT_STRING - 319)) | (1L << (ID - 319)))) != 0)) {
						{
						setState(581);
						expression();
						setState(586);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==COMMA) {
							{
							{
							setState(582);
							match(COMMA);
							setState(583);
							expression();
							}
							}
							setState(588);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
					}

					setState(591);
					match(RPAREN);
					}
				}

				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(594);
				match(CAST);
				setState(595);
				match(LPAREN);
				setState(596);
				expression();
				setState(597);
				match(AS);
				setState(598);
				cast_data_type();
				setState(599);
				match(RPAREN);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(601);
				group_functions();
				setState(602);
				match(LPAREN);
				setState(604);
				_la = _input.LA(1);
				if (_la==ALL || _la==DISTINCT || _la==ASTERISK) {
					{
					setState(603);
					_la = _input.LA(1);
					if ( !(_la==ALL || _la==DISTINCT || _la==ASTERISK) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
				}

				setState(606);
				bit_expr();
				setState(607);
				match(RPAREN);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Case_when_statementContext extends ParserRuleContext {
		public Case_when_statement1Context case_when_statement1() {
			return getRuleContext(Case_when_statement1Context.class,0);
		}
		public Case_when_statement2Context case_when_statement2() {
			return getRuleContext(Case_when_statement2Context.class,0);
		}
		public Case_when_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_when_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitCase_when_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Case_when_statementContext case_when_statement() throws RecognitionException {
		Case_when_statementContext _localctx = new Case_when_statementContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_case_when_statement);
		try {
			setState(613);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(611);
				case_when_statement1();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(612);
				case_when_statement2();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Case_when_statement1Context extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(uniformSQLParser.CASE, 0); }
		public TerminalNode END() { return getToken(uniformSQLParser.END, 0); }
		public List<TerminalNode> WHEN() { return getTokens(uniformSQLParser.WHEN); }
		public TerminalNode WHEN(int i) {
			return getToken(uniformSQLParser.WHEN, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> THEN() { return getTokens(uniformSQLParser.THEN); }
		public TerminalNode THEN(int i) {
			return getToken(uniformSQLParser.THEN, i);
		}
		public List<Bit_exprContext> bit_expr() {
			return getRuleContexts(Bit_exprContext.class);
		}
		public Bit_exprContext bit_expr(int i) {
			return getRuleContext(Bit_exprContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(uniformSQLParser.ELSE, 0); }
		public Case_when_statement1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_when_statement1; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitCase_when_statement1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Case_when_statement1Context case_when_statement1() throws RecognitionException {
		Case_when_statement1Context _localctx = new Case_when_statement1Context(_ctx, getState());
		enterRule(_localctx, 126, RULE_case_when_statement1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(615);
			match(CASE);
			setState(621); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(616);
				match(WHEN);
				setState(617);
				expression();
				setState(618);
				match(THEN);
				setState(619);
				bit_expr();
				}
				}
				setState(623); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WHEN );
			setState(627);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(625);
				match(ELSE);
				setState(626);
				bit_expr();
				}
			}

			setState(629);
			match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Case_when_statement2Context extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(uniformSQLParser.CASE, 0); }
		public List<Bit_exprContext> bit_expr() {
			return getRuleContexts(Bit_exprContext.class);
		}
		public Bit_exprContext bit_expr(int i) {
			return getRuleContext(Bit_exprContext.class,i);
		}
		public TerminalNode END() { return getToken(uniformSQLParser.END, 0); }
		public List<TerminalNode> WHEN() { return getTokens(uniformSQLParser.WHEN); }
		public TerminalNode WHEN(int i) {
			return getToken(uniformSQLParser.WHEN, i);
		}
		public List<TerminalNode> THEN() { return getTokens(uniformSQLParser.THEN); }
		public TerminalNode THEN(int i) {
			return getToken(uniformSQLParser.THEN, i);
		}
		public TerminalNode ELSE() { return getToken(uniformSQLParser.ELSE, 0); }
		public Case_when_statement2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_when_statement2; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitCase_when_statement2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Case_when_statement2Context case_when_statement2() throws RecognitionException {
		Case_when_statement2Context _localctx = new Case_when_statement2Context(_ctx, getState());
		enterRule(_localctx, 128, RULE_case_when_statement2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(631);
			match(CASE);
			setState(632);
			bit_expr();
			setState(638); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(633);
				match(WHEN);
				setState(634);
				bit_expr();
				setState(635);
				match(THEN);
				setState(636);
				bit_expr();
				}
				}
				setState(640); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WHEN );
			setState(644);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(642);
				match(ELSE);
				setState(643);
				bit_expr();
				}
			}

			setState(646);
			match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_specContext extends ParserRuleContext {
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public List<TerminalNode> DOT() { return getTokens(uniformSQLParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(uniformSQLParser.DOT, i);
		}
		public Schema_nameContext schema_name() {
			return getRuleContext(Schema_nameContext.class,0);
		}
		public Column_specContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_spec; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitColumn_spec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_specContext column_spec() throws RecognitionException {
		Column_specContext _localctx = new Column_specContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_column_spec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(656);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				{
				setState(651);
				switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
				case 1:
					{
					setState(648);
					schema_name();
					setState(649);
					match(DOT);
					}
					break;
				}
				setState(653);
				table_name();
				setState(654);
				match(DOT);
				}
				break;
			}
			setState(658);
			column_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expression_listContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(uniformSQLParser.LPAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(uniformSQLParser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(uniformSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(uniformSQLParser.COMMA, i);
		}
		public Expression_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression_list; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitExpression_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expression_listContext expression_list() throws RecognitionException {
		Expression_listContext _localctx = new Expression_listContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_expression_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(660);
			match(LPAREN);
			setState(661);
			expression();
			setState(666);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(662);
				match(COMMA);
				setState(663);
				expression();
				}
				}
				setState(668);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(669);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Interval_exprContext extends ParserRuleContext {
		public TerminalNode INTERVAL() { return getToken(uniformSQLParser.INTERVAL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Interval_unitContext interval_unit() {
			return getRuleContext(Interval_unitContext.class,0);
		}
		public Interval_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interval_expr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitInterval_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Interval_exprContext interval_expr() throws RecognitionException {
		Interval_exprContext _localctx = new Interval_exprContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_interval_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(671);
			match(INTERVAL);
			setState(672);
			expression();
			setState(673);
			interval_unit();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_referencesContext extends ParserRuleContext {
		public List<Table_referenceContext> table_reference() {
			return getRuleContexts(Table_referenceContext.class);
		}
		public Table_referenceContext table_reference(int i) {
			return getRuleContext(Table_referenceContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(uniformSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(uniformSQLParser.COMMA, i);
		}
		public Table_referencesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_references; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitTable_references(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_referencesContext table_references() throws RecognitionException {
		Table_referencesContext _localctx = new Table_referencesContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_table_references);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(675);
			table_reference();
			setState(680);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(676);
				match(COMMA);
				setState(677);
				table_reference();
				}
				}
				setState(682);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_referenceContext extends ParserRuleContext {
		public Table_factor1Context table_factor1() {
			return getRuleContext(Table_factor1Context.class,0);
		}
		public Table_atomContext table_atom() {
			return getRuleContext(Table_atomContext.class,0);
		}
		public Table_referenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_reference; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitTable_reference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_referenceContext table_reference() throws RecognitionException {
		Table_referenceContext _localctx = new Table_referenceContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_table_reference);
		try {
			setState(685);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(683);
				table_factor1();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(684);
				table_atom();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_factor1Context extends ParserRuleContext {
		public Table_factor2Context table_factor2() {
			return getRuleContext(Table_factor2Context.class,0);
		}
		public TerminalNode JOIN() { return getToken(uniformSQLParser.JOIN, 0); }
		public Table_atomContext table_atom() {
			return getRuleContext(Table_atomContext.class,0);
		}
		public TerminalNode CROSS() { return getToken(uniformSQLParser.CROSS, 0); }
		public Join_conditionContext join_condition() {
			return getRuleContext(Join_conditionContext.class,0);
		}
		public Table_factor1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_factor1; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitTable_factor1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_factor1Context table_factor1() throws RecognitionException {
		Table_factor1Context _localctx = new Table_factor1Context(_ctx, getState());
		enterRule(_localctx, 140, RULE_table_factor1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(687);
			table_factor2();
			setState(696);
			_la = _input.LA(1);
			if (_la==JOIN || _la==CROSS) {
				{
				setState(689);
				_la = _input.LA(1);
				if (_la==CROSS) {
					{
					setState(688);
					match(CROSS);
					}
				}

				setState(691);
				match(JOIN);
				setState(692);
				table_atom();
				setState(694);
				switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
				case 1:
					{
					setState(693);
					join_condition();
					}
					break;
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_factor2Context extends ParserRuleContext {
		public List<Table_factor3Context> table_factor3() {
			return getRuleContexts(Table_factor3Context.class);
		}
		public Table_factor3Context table_factor3(int i) {
			return getRuleContext(Table_factor3Context.class,i);
		}
		public TerminalNode JOIN() { return getToken(uniformSQLParser.JOIN, 0); }
		public Join_conditionContext join_condition() {
			return getRuleContext(Join_conditionContext.class,0);
		}
		public TerminalNode LEFT() { return getToken(uniformSQLParser.LEFT, 0); }
		public TerminalNode RIGHT() { return getToken(uniformSQLParser.RIGHT, 0); }
		public TerminalNode FULL() { return getToken(uniformSQLParser.FULL, 0); }
		public TerminalNode OUTER() { return getToken(uniformSQLParser.OUTER, 0); }
		public Table_factor2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_factor2; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitTable_factor2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_factor2Context table_factor2() throws RecognitionException {
		Table_factor2Context _localctx = new Table_factor2Context(_ctx, getState());
		enterRule(_localctx, 142, RULE_table_factor2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(698);
			table_factor3();
			setState(707);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEFT) | (1L << RIGHT) | (1L << FULL))) != 0)) {
				{
				setState(699);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEFT) | (1L << RIGHT) | (1L << FULL))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(701);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(700);
					match(OUTER);
					}
				}

				setState(703);
				match(JOIN);
				setState(704);
				table_factor3();
				setState(705);
				join_condition();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_factor3Context extends ParserRuleContext {
		public List<Table_atomContext> table_atom() {
			return getRuleContexts(Table_atomContext.class);
		}
		public Table_atomContext table_atom(int i) {
			return getRuleContext(Table_atomContext.class,i);
		}
		public TerminalNode JOIN() { return getToken(uniformSQLParser.JOIN, 0); }
		public TerminalNode LEFT() { return getToken(uniformSQLParser.LEFT, 0); }
		public TerminalNode RIGHT() { return getToken(uniformSQLParser.RIGHT, 0); }
		public TerminalNode FULL() { return getToken(uniformSQLParser.FULL, 0); }
		public TerminalNode OUTER() { return getToken(uniformSQLParser.OUTER, 0); }
		public Table_factor3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_factor3; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitTable_factor3(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_factor3Context table_factor3() throws RecognitionException {
		Table_factor3Context _localctx = new Table_factor3Context(_ctx, getState());
		enterRule(_localctx, 144, RULE_table_factor3);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(709);
			table_atom();
			setState(718);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				{
				setState(714);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEFT) | (1L << RIGHT) | (1L << FULL))) != 0)) {
					{
					setState(710);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEFT) | (1L << RIGHT) | (1L << FULL))) != 0)) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(712);
					_la = _input.LA(1);
					if (_la==OUTER) {
						{
						setState(711);
						match(OUTER);
						}
					}

					}
				}

				setState(716);
				match(JOIN);
				setState(717);
				table_atom();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_atomContext extends ParserRuleContext {
		public Table_specContext table_spec() {
			return getRuleContext(Table_specContext.class,0);
		}
		public AliasContext alias() {
			return getRuleContext(AliasContext.class,0);
		}
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(uniformSQLParser.LPAREN, 0); }
		public Table_referencesContext table_references() {
			return getRuleContext(Table_referencesContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(uniformSQLParser.RPAREN, 0); }
		public TerminalNode ID() { return getToken(uniformSQLParser.ID, 0); }
		public Table_atomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_atom; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitTable_atom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_atomContext table_atom() throws RecognitionException {
		Table_atomContext _localctx = new Table_atomContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_table_atom);
		int _la;
		try {
			setState(732);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(720);
				table_spec();
				setState(722);
				_la = _input.LA(1);
				if (_la==AS || _la==USE || _la==USER || _la==ID) {
					{
					setState(721);
					alias();
					}
				}

				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(724);
				subquery();
				setState(725);
				alias();
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(727);
				match(LPAREN);
				setState(728);
				table_references();
				setState(729);
				match(RPAREN);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(731);
				match(ID);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Join_conditionContext extends ParserRuleContext {
		public TerminalNode ON() { return getToken(uniformSQLParser.ON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Join_conditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join_condition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitJoin_condition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Join_conditionContext join_condition() throws RecognitionException {
		Join_conditionContext _localctx = new Join_conditionContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_join_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(734);
			match(ON);
			setState(735);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Index_hint_listContext extends ParserRuleContext {
		public List<Index_hintContext> index_hint() {
			return getRuleContexts(Index_hintContext.class);
		}
		public Index_hintContext index_hint(int i) {
			return getRuleContext(Index_hintContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(uniformSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(uniformSQLParser.COMMA, i);
		}
		public Index_hint_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_hint_list; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitIndex_hint_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Index_hint_listContext index_hint_list() throws RecognitionException {
		Index_hint_listContext _localctx = new Index_hint_listContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_index_hint_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(737);
			index_hint();
			setState(742);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(738);
				match(COMMA);
				setState(739);
				index_hint();
				}
				}
				setState(744);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Index_optionsContext extends ParserRuleContext {
		public TerminalNode INDEX() { return getToken(uniformSQLParser.INDEX, 0); }
		public TerminalNode KEY() { return getToken(uniformSQLParser.KEY, 0); }
		public TerminalNode FOR() { return getToken(uniformSQLParser.FOR, 0); }
		public TerminalNode JOIN() { return getToken(uniformSQLParser.JOIN, 0); }
		public TerminalNode ORDER() { return getToken(uniformSQLParser.ORDER, 0); }
		public TerminalNode BY() { return getToken(uniformSQLParser.BY, 0); }
		public TerminalNode GROUP() { return getToken(uniformSQLParser.GROUP, 0); }
		public Index_optionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_options; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitIndex_options(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Index_optionsContext index_options() throws RecognitionException {
		Index_optionsContext _localctx = new Index_optionsContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_index_options);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(745);
			_la = _input.LA(1);
			if ( !(_la==INDEX || _la==KEY) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(754);
			_la = _input.LA(1);
			if (_la==FOR) {
				{
				setState(746);
				match(FOR);
				setState(752);
				switch (_input.LA(1)) {
				case JOIN:
					{
					{
					setState(747);
					match(JOIN);
					}
					}
					break;
				case ORDER:
					{
					{
					setState(748);
					match(ORDER);
					setState(749);
					match(BY);
					}
					}
					break;
				case GROUP:
					{
					{
					setState(750);
					match(GROUP);
					setState(751);
					match(BY);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Index_hintContext extends ParserRuleContext {
		public TerminalNode USE() { return getToken(uniformSQLParser.USE, 0); }
		public Index_optionsContext index_options() {
			return getRuleContext(Index_optionsContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(uniformSQLParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(uniformSQLParser.RPAREN, 0); }
		public Index_listContext index_list() {
			return getRuleContext(Index_listContext.class,0);
		}
		public TerminalNode IGNORE() { return getToken(uniformSQLParser.IGNORE, 0); }
		public Index_hintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_hint; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitIndex_hint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Index_hintContext index_hint() throws RecognitionException {
		Index_hintContext _localctx = new Index_hintContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_index_hint);
		int _la;
		try {
			setState(770);
			switch (_input.LA(1)) {
			case USE:
				enterOuterAlt(_localctx, 1);
				{
				setState(756);
				match(USE);
				setState(757);
				index_options();
				setState(758);
				match(LPAREN);
				setState(760);
				_la = _input.LA(1);
				if (_la==USE || _la==USER || _la==ID) {
					{
					setState(759);
					index_list();
					}
				}

				setState(762);
				match(RPAREN);
				}
				break;
			case IGNORE:
				enterOuterAlt(_localctx, 2);
				{
				setState(764);
				match(IGNORE);
				setState(765);
				index_options();
				setState(766);
				match(LPAREN);
				setState(767);
				index_list();
				setState(768);
				match(RPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Index_listContext extends ParserRuleContext {
		public List<Index_nameContext> index_name() {
			return getRuleContexts(Index_nameContext.class);
		}
		public Index_nameContext index_name(int i) {
			return getRuleContext(Index_nameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(uniformSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(uniformSQLParser.COMMA, i);
		}
		public Index_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_list; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitIndex_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Index_listContext index_list() throws RecognitionException {
		Index_listContext _localctx = new Index_listContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_index_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(772);
			index_name();
			setState(777);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(773);
				match(COMMA);
				setState(774);
				index_name();
				}
				}
				setState(779);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Partition_clauseContext extends ParserRuleContext {
		public TerminalNode PARTITION() { return getToken(uniformSQLParser.PARTITION, 0); }
		public TerminalNode LPAREN() { return getToken(uniformSQLParser.LPAREN, 0); }
		public Partition_namesContext partition_names() {
			return getRuleContext(Partition_namesContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(uniformSQLParser.RPAREN, 0); }
		public Partition_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partition_clause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitPartition_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Partition_clauseContext partition_clause() throws RecognitionException {
		Partition_clauseContext _localctx = new Partition_clauseContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_partition_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(780);
			match(PARTITION);
			setState(781);
			match(LPAREN);
			setState(782);
			partition_names();
			setState(783);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Partition_namesContext extends ParserRuleContext {
		public List<Partition_nameContext> partition_name() {
			return getRuleContexts(Partition_nameContext.class);
		}
		public Partition_nameContext partition_name(int i) {
			return getRuleContext(Partition_nameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(uniformSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(uniformSQLParser.COMMA, i);
		}
		public Partition_namesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partition_names; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitPartition_names(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Partition_namesContext partition_names() throws RecognitionException {
		Partition_namesContext _localctx = new Partition_namesContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_partition_names);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(785);
			partition_name();
			setState(790);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(786);
				match(COMMA);
				setState(787);
				partition_name();
				}
				}
				setState(792);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Root_statementContext extends ParserRuleContext {
		public Data_manipulation_statementsContext data_manipulation_statements() {
			return getRuleContext(Data_manipulation_statementsContext.class,0);
		}
		public Data_definition_statementsContext data_definition_statements() {
			return getRuleContext(Data_definition_statementsContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(uniformSQLParser.SEMI, 0); }
		public Root_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_root_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitRoot_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Root_statementContext root_statement() throws RecognitionException {
		Root_statementContext _localctx = new Root_statementContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_root_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(795);
			switch (_input.LA(1)) {
			case SELECT:
			case INSERT:
			case UPDATE:
				{
				setState(793);
				data_manipulation_statements();
				}
				break;
			case SHOW:
			case CREATE:
			case ALTER:
			case DROP:
			case SET:
			case GRANT:
			case REVOKE:
			case USE:
				{
				setState(794);
				data_definition_statements();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(798);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(797);
				match(SEMI);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Data_manipulation_statementsContext extends ParserRuleContext {
		public Select_statementContext select_statement() {
			return getRuleContext(Select_statementContext.class,0);
		}
		public Insert_statementsContext insert_statements() {
			return getRuleContext(Insert_statementsContext.class,0);
		}
		public Update_statementsContext update_statements() {
			return getRuleContext(Update_statementsContext.class,0);
		}
		public Data_manipulation_statementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_data_manipulation_statements; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitData_manipulation_statements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Data_manipulation_statementsContext data_manipulation_statements() throws RecognitionException {
		Data_manipulation_statementsContext _localctx = new Data_manipulation_statementsContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_data_manipulation_statements);
		try {
			setState(803);
			switch (_input.LA(1)) {
			case SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(800);
				select_statement();
				}
				break;
			case INSERT:
				enterOuterAlt(_localctx, 2);
				{
				setState(801);
				insert_statements();
				}
				break;
			case UPDATE:
				enterOuterAlt(_localctx, 3);
				{
				setState(802);
				update_statements();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Data_definition_statementsContext extends ParserRuleContext {
		public Create_database_statementContext create_database_statement() {
			return getRuleContext(Create_database_statementContext.class,0);
		}
		public Drop_database_statementContext drop_database_statement() {
			return getRuleContext(Drop_database_statementContext.class,0);
		}
		public Create_event_statementContext create_event_statement() {
			return getRuleContext(Create_event_statementContext.class,0);
		}
		public Drop_event_statementContext drop_event_statement() {
			return getRuleContext(Drop_event_statementContext.class,0);
		}
		public Grant_event_statementContext grant_event_statement() {
			return getRuleContext(Grant_event_statementContext.class,0);
		}
		public Revoke_event_statementContext revoke_event_statement() {
			return getRuleContext(Revoke_event_statementContext.class,0);
		}
		public Show_event_statementContext show_event_statement() {
			return getRuleContext(Show_event_statementContext.class,0);
		}
		public Set_event_statementContext set_event_statement() {
			return getRuleContext(Set_event_statementContext.class,0);
		}
		public Create_table_statementContext create_table_statement() {
			return getRuleContext(Create_table_statementContext.class,0);
		}
		public Alter_table_statementContext alter_table_statement() {
			return getRuleContext(Alter_table_statementContext.class,0);
		}
		public Drop_table_statementContext drop_table_statement() {
			return getRuleContext(Drop_table_statementContext.class,0);
		}
		public Drop_view_statementContext drop_view_statement() {
			return getRuleContext(Drop_view_statementContext.class,0);
		}
		public Create_view_statementContext create_view_statement() {
			return getRuleContext(Create_view_statementContext.class,0);
		}
		public Alter_view_statementContext alter_view_statement() {
			return getRuleContext(Alter_view_statementContext.class,0);
		}
		public Use_event_statementContext use_event_statement() {
			return getRuleContext(Use_event_statementContext.class,0);
		}
		public Data_definition_statementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_data_definition_statements; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitData_definition_statements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Data_definition_statementsContext data_definition_statements() throws RecognitionException {
		Data_definition_statementsContext _localctx = new Data_definition_statementsContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_data_definition_statements);
		try {
			setState(820);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(805);
				create_database_statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(806);
				drop_database_statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(807);
				create_event_statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(808);
				drop_event_statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(809);
				grant_event_statement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(810);
				revoke_event_statement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(811);
				show_event_statement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(812);
				set_event_statement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(813);
				create_table_statement();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(814);
				alter_table_statement();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(815);
				drop_table_statement();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(816);
				drop_view_statement();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(817);
				create_view_statement();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(818);
				alter_view_statement();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(819);
				use_event_statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Select_statementContext extends ParserRuleContext {
		public List<Select_expressionContext> select_expression() {
			return getRuleContexts(Select_expressionContext.class);
		}
		public Select_expressionContext select_expression(int i) {
			return getRuleContext(Select_expressionContext.class,i);
		}
		public List<TerminalNode> UNION() { return getTokens(uniformSQLParser.UNION); }
		public TerminalNode UNION(int i) {
			return getToken(uniformSQLParser.UNION, i);
		}
		public List<TerminalNode> ALL() { return getTokens(uniformSQLParser.ALL); }
		public TerminalNode ALL(int i) {
			return getToken(uniformSQLParser.ALL, i);
		}
		public List<TerminalNode> DISTINCT() { return getTokens(uniformSQLParser.DISTINCT); }
		public TerminalNode DISTINCT(int i) {
			return getToken(uniformSQLParser.DISTINCT, i);
		}
		public Select_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitSelect_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_statementContext select_statement() throws RecognitionException {
		Select_statementContext _localctx = new Select_statementContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_select_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(822);
			select_expression();
			setState(830);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==UNION) {
				{
				{
				setState(823);
				match(UNION);
				setState(825);
				_la = _input.LA(1);
				if (_la==ALL || _la==DISTINCT) {
					{
					setState(824);
					_la = _input.LA(1);
					if ( !(_la==ALL || _la==DISTINCT) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
				}

				setState(827);
				select_expression();
				}
				}
				setState(832);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Select_expressionContext extends ParserRuleContext {
		public TerminalNode SELECT() { return getToken(uniformSQLParser.SELECT, 0); }
		public Select_listContext select_list() {
			return getRuleContext(Select_listContext.class,0);
		}
		public TerminalNode FROM() { return getToken(uniformSQLParser.FROM, 0); }
		public Table_referencesContext table_references() {
			return getRuleContext(Table_referencesContext.class,0);
		}
		public Orderby_clauseContext orderby_clause() {
			return getRuleContext(Orderby_clauseContext.class,0);
		}
		public Limit_clauseContext limit_clause() {
			return getRuleContext(Limit_clauseContext.class,0);
		}
		public TerminalNode ALL() { return getToken(uniformSQLParser.ALL, 0); }
		public TerminalNode DISTINCT() { return getToken(uniformSQLParser.DISTINCT, 0); }
		public Where_clauseContext where_clause() {
			return getRuleContext(Where_clauseContext.class,0);
		}
		public Groupby_clauseContext groupby_clause() {
			return getRuleContext(Groupby_clauseContext.class,0);
		}
		public Having_clauseContext having_clause() {
			return getRuleContext(Having_clauseContext.class,0);
		}
		public Select_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitSelect_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_expressionContext select_expression() throws RecognitionException {
		Select_expressionContext _localctx = new Select_expressionContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_select_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(833);
			match(SELECT);
			setState(835);
			_la = _input.LA(1);
			if (_la==ALL || _la==DISTINCT) {
				{
				setState(834);
				_la = _input.LA(1);
				if ( !(_la==ALL || _la==DISTINCT) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			setState(837);
			select_list();
			setState(849);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(838);
				match(FROM);
				setState(839);
				table_references();
				setState(841);
				_la = _input.LA(1);
				if (_la==WHERE) {
					{
					setState(840);
					where_clause();
					}
				}

				setState(844);
				_la = _input.LA(1);
				if (_la==GROUP) {
					{
					setState(843);
					groupby_clause();
					}
				}

				setState(847);
				_la = _input.LA(1);
				if (_la==HAVING) {
					{
					setState(846);
					having_clause();
					}
				}

				}
			}

			setState(852);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(851);
				orderby_clause();
				}
			}

			setState(855);
			_la = _input.LA(1);
			if (_la==LIMIT) {
				{
				setState(854);
				limit_clause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Where_clauseContext extends ParserRuleContext {
		public TerminalNode WHERE() { return getToken(uniformSQLParser.WHERE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Where_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_where_clause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitWhere_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Where_clauseContext where_clause() throws RecognitionException {
		Where_clauseContext _localctx = new Where_clauseContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_where_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(857);
			match(WHERE);
			setState(858);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Groupby_clauseContext extends ParserRuleContext {
		public TerminalNode GROUP() { return getToken(uniformSQLParser.GROUP, 0); }
		public TerminalNode BY() { return getToken(uniformSQLParser.BY, 0); }
		public List<Groupby_itemContext> groupby_item() {
			return getRuleContexts(Groupby_itemContext.class);
		}
		public Groupby_itemContext groupby_item(int i) {
			return getRuleContext(Groupby_itemContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(uniformSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(uniformSQLParser.COMMA, i);
		}
		public TerminalNode WITH() { return getToken(uniformSQLParser.WITH, 0); }
		public TerminalNode ROLLUP() { return getToken(uniformSQLParser.ROLLUP, 0); }
		public Groupby_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupby_clause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitGroupby_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Groupby_clauseContext groupby_clause() throws RecognitionException {
		Groupby_clauseContext _localctx = new Groupby_clauseContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_groupby_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(860);
			match(GROUP);
			setState(861);
			match(BY);
			setState(862);
			groupby_item();
			setState(867);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(863);
				match(COMMA);
				setState(864);
				groupby_item();
				}
				}
				setState(869);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(872);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(870);
				match(WITH);
				setState(871);
				match(ROLLUP);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Groupby_itemContext extends ParserRuleContext {
		public Column_specContext column_spec() {
			return getRuleContext(Column_specContext.class,0);
		}
		public TerminalNode INTEGER_NUM() { return getToken(uniformSQLParser.INTEGER_NUM, 0); }
		public Bit_exprContext bit_expr() {
			return getRuleContext(Bit_exprContext.class,0);
		}
		public Groupby_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupby_item; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitGroupby_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Groupby_itemContext groupby_item() throws RecognitionException {
		Groupby_itemContext _localctx = new Groupby_itemContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_groupby_item);
		try {
			setState(877);
			switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(874);
				column_spec();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(875);
				match(INTEGER_NUM);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(876);
				bit_expr();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Having_clauseContext extends ParserRuleContext {
		public TerminalNode HAVING() { return getToken(uniformSQLParser.HAVING, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Having_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_having_clause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitHaving_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Having_clauseContext having_clause() throws RecognitionException {
		Having_clauseContext _localctx = new Having_clauseContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_having_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(879);
			match(HAVING);
			setState(880);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Orderby_clauseContext extends ParserRuleContext {
		public TerminalNode ORDER() { return getToken(uniformSQLParser.ORDER, 0); }
		public TerminalNode BY() { return getToken(uniformSQLParser.BY, 0); }
		public List<Orderby_itemContext> orderby_item() {
			return getRuleContexts(Orderby_itemContext.class);
		}
		public Orderby_itemContext orderby_item(int i) {
			return getRuleContext(Orderby_itemContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(uniformSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(uniformSQLParser.COMMA, i);
		}
		public Orderby_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderby_clause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitOrderby_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Orderby_clauseContext orderby_clause() throws RecognitionException {
		Orderby_clauseContext _localctx = new Orderby_clauseContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_orderby_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(882);
			match(ORDER);
			setState(883);
			match(BY);
			setState(884);
			orderby_item();
			setState(889);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(885);
				match(COMMA);
				setState(886);
				orderby_item();
				}
				}
				setState(891);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Orderby_itemContext extends ParserRuleContext {
		public Groupby_itemContext groupby_item() {
			return getRuleContext(Groupby_itemContext.class,0);
		}
		public TerminalNode ASC() { return getToken(uniformSQLParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(uniformSQLParser.DESC, 0); }
		public Orderby_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderby_item; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitOrderby_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Orderby_itemContext orderby_item() throws RecognitionException {
		Orderby_itemContext _localctx = new Orderby_itemContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_orderby_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(892);
			groupby_item();
			setState(894);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(893);
				_la = _input.LA(1);
				if ( !(_la==ASC || _la==DESC) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Limit_clauseContext extends ParserRuleContext {
		public TerminalNode LIMIT() { return getToken(uniformSQLParser.LIMIT, 0); }
		public Row_countContext row_count() {
			return getRuleContext(Row_countContext.class,0);
		}
		public OffsetContext offset() {
			return getRuleContext(OffsetContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(uniformSQLParser.COMMA, 0); }
		public Limit_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_limit_clause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitLimit_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Limit_clauseContext limit_clause() throws RecognitionException {
		Limit_clauseContext _localctx = new Limit_clauseContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_limit_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(896);
			match(LIMIT);
			{
			setState(900);
			switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
			case 1:
				{
				setState(897);
				offset();
				setState(898);
				match(COMMA);
				}
				break;
			}
			setState(902);
			row_count();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OffsetContext extends ParserRuleContext {
		public TerminalNode INTEGER_NUM() { return getToken(uniformSQLParser.INTEGER_NUM, 0); }
		public OffsetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_offset; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitOffset(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OffsetContext offset() throws RecognitionException {
		OffsetContext _localctx = new OffsetContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_offset);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(904);
			match(INTEGER_NUM);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Row_countContext extends ParserRuleContext {
		public TerminalNode INTEGER_NUM() { return getToken(uniformSQLParser.INTEGER_NUM, 0); }
		public Row_countContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_row_count; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitRow_count(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Row_countContext row_count() throws RecognitionException {
		Row_countContext _localctx = new Row_countContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_row_count);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(906);
			match(INTEGER_NUM);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Select_listContext extends ParserRuleContext {
		public TerminalNode ASTERISK() { return getToken(uniformSQLParser.ASTERISK, 0); }
		public List<Displayed_columnContext> displayed_column() {
			return getRuleContexts(Displayed_columnContext.class);
		}
		public Displayed_columnContext displayed_column(int i) {
			return getRuleContext(Displayed_columnContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(uniformSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(uniformSQLParser.COMMA, i);
		}
		public Select_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_list; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitSelect_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_listContext select_list() throws RecognitionException {
		Select_listContext _localctx = new Select_listContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_select_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(917);
			switch (_input.LA(1)) {
			case TRUE:
			case FALSE:
			case EXISTS:
			case NULL:
			case ROW:
			case CAST:
			case CASE:
			case BINARY:
			case USE:
			case USER:
			case ABS:
			case ACOS:
			case ASIN:
			case ATAN:
			case CEIL:
			case COS:
			case COT:
			case EXP:
			case FLOOR:
			case LN:
			case POW:
			case RAND:
			case ROUND:
			case SIN:
			case SQRT:
			case TAN:
			case LCASE:
			case LOWER:
			case LTRIM:
			case RTRIM:
			case CONCAT:
			case SUBSTR:
			case TRIM:
			case UCASE:
			case UPPER:
			case TO_DATE:
			case DAY:
			case HOUR:
			case MINUTE:
			case MONTH:
			case SECOND:
			case FROM_UNIXTIME:
			case YEAR:
			case DATE_ADD:
			case DATE_SUB:
			case AVG:
			case COUNT:
			case MAX:
			case MIN:
			case SUM:
			case COALESCE:
			case LPAREN:
			case PLUS:
			case MINUS:
			case NEGATION:
			case INTEGER_NUM:
			case HEX_DIGIT:
			case BIT_NUM:
			case REAL_NUMBER:
			case TEXT_STRING:
			case ID:
				{
				{
				setState(908);
				displayed_column();
				setState(913);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(909);
					match(COMMA);
					setState(910);
					displayed_column();
					}
					}
					setState(915);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			case ASTERISK:
				{
				setState(916);
				match(ASTERISK);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_listContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(uniformSQLParser.LPAREN, 0); }
		public List<Column_specContext> column_spec() {
			return getRuleContexts(Column_specContext.class);
		}
		public Column_specContext column_spec(int i) {
			return getRuleContext(Column_specContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(uniformSQLParser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(uniformSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(uniformSQLParser.COMMA, i);
		}
		public Column_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_list; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitColumn_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_listContext column_list() throws RecognitionException {
		Column_listContext _localctx = new Column_listContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_column_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(919);
			match(LPAREN);
			setState(920);
			column_spec();
			setState(925);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(921);
				match(COMMA);
				setState(922);
				column_spec();
				}
				}
				setState(927);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(928);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SubqueryContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(uniformSQLParser.LPAREN, 0); }
		public Select_statementContext select_statement() {
			return getRuleContext(Select_statementContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(uniformSQLParser.RPAREN, 0); }
		public SubqueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subquery; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitSubquery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubqueryContext subquery() throws RecognitionException {
		SubqueryContext _localctx = new SubqueryContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_subquery);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(930);
			match(LPAREN);
			setState(931);
			select_statement();
			setState(932);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_specContext extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Schema_nameContext schema_name() {
			return getRuleContext(Schema_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(uniformSQLParser.DOT, 0); }
		public Table_specContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_spec; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitTable_spec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_specContext table_spec() throws RecognitionException {
		Table_specContext _localctx = new Table_specContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_table_spec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(937);
			switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
			case 1:
				{
				setState(934);
				schema_name();
				setState(935);
				match(DOT);
				}
				break;
			}
			setState(939);
			table_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Displayed_columnContext extends ParserRuleContext {
		public Table_specContext table_spec() {
			return getRuleContext(Table_specContext.class,0);
		}
		public TerminalNode DOT() { return getToken(uniformSQLParser.DOT, 0); }
		public TerminalNode ASTERISK() { return getToken(uniformSQLParser.ASTERISK, 0); }
		public Column_specContext column_spec() {
			return getRuleContext(Column_specContext.class,0);
		}
		public AliasContext alias() {
			return getRuleContext(AliasContext.class,0);
		}
		public Bit_exprContext bit_expr() {
			return getRuleContext(Bit_exprContext.class,0);
		}
		public Displayed_columnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_displayed_column; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitDisplayed_column(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Displayed_columnContext displayed_column() throws RecognitionException {
		Displayed_columnContext _localctx = new Displayed_columnContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_displayed_column);
		int _la;
		try {
			setState(953);
			switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(941);
				table_spec();
				setState(942);
				match(DOT);
				setState(943);
				match(ASTERISK);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(945);
				column_spec();
				setState(947);
				_la = _input.LA(1);
				if (_la==AS || _la==USE || _la==USER || _la==ID) {
					{
					setState(946);
					alias();
					}
				}

				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(949);
				bit_expr();
				setState(951);
				_la = _input.LA(1);
				if (_la==AS || _la==USE || _la==USER || _la==ID) {
					{
					setState(950);
					alias();
					}
				}

				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Insert_statementsContext extends ParserRuleContext {
		public Insert_statementContext insert_statement() {
			return getRuleContext(Insert_statementContext.class,0);
		}
		public Insert_statementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insert_statements; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitInsert_statements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Insert_statementsContext insert_statements() throws RecognitionException {
		Insert_statementsContext _localctx = new Insert_statementsContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_insert_statements);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(955);
			insert_statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Insert_headerContext extends ParserRuleContext {
		public TerminalNode INSERT() { return getToken(uniformSQLParser.INSERT, 0); }
		public Table_specContext table_spec() {
			return getRuleContext(Table_specContext.class,0);
		}
		public TerminalNode IGNORE() { return getToken(uniformSQLParser.IGNORE, 0); }
		public TerminalNode INTO() { return getToken(uniformSQLParser.INTO, 0); }
		public Partition_clauseContext partition_clause() {
			return getRuleContext(Partition_clauseContext.class,0);
		}
		public TerminalNode LOW_PRIORITY() { return getToken(uniformSQLParser.LOW_PRIORITY, 0); }
		public TerminalNode HIGH_PRIORITY() { return getToken(uniformSQLParser.HIGH_PRIORITY, 0); }
		public Insert_headerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insert_header; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitInsert_header(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Insert_headerContext insert_header() throws RecognitionException {
		Insert_headerContext _localctx = new Insert_headerContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_insert_header);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(957);
			match(INSERT);
			setState(959);
			_la = _input.LA(1);
			if (_la==LOW_PRIORITY || _la==HIGH_PRIORITY) {
				{
				setState(958);
				_la = _input.LA(1);
				if ( !(_la==LOW_PRIORITY || _la==HIGH_PRIORITY) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			setState(962);
			_la = _input.LA(1);
			if (_la==IGNORE) {
				{
				setState(961);
				match(IGNORE);
				}
			}

			setState(965);
			_la = _input.LA(1);
			if (_la==INTO) {
				{
				setState(964);
				match(INTO);
				}
			}

			setState(967);
			table_spec();
			setState(969);
			_la = _input.LA(1);
			if (_la==PARTITION) {
				{
				setState(968);
				partition_clause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Insert_subfixContext extends ParserRuleContext {
		public TerminalNode ON() { return getToken(uniformSQLParser.ON, 0); }
		public TerminalNode DUPLICATE() { return getToken(uniformSQLParser.DUPLICATE, 0); }
		public TerminalNode KEY() { return getToken(uniformSQLParser.KEY, 0); }
		public TerminalNode UPDATE() { return getToken(uniformSQLParser.UPDATE, 0); }
		public List<Column_specContext> column_spec() {
			return getRuleContexts(Column_specContext.class);
		}
		public Column_specContext column_spec(int i) {
			return getRuleContext(Column_specContext.class,i);
		}
		public List<TerminalNode> EQ() { return getTokens(uniformSQLParser.EQ); }
		public TerminalNode EQ(int i) {
			return getToken(uniformSQLParser.EQ, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(uniformSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(uniformSQLParser.COMMA, i);
		}
		public Insert_subfixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insert_subfix; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitInsert_subfix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Insert_subfixContext insert_subfix() throws RecognitionException {
		Insert_subfixContext _localctx = new Insert_subfixContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_insert_subfix);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(971);
			match(ON);
			setState(972);
			match(DUPLICATE);
			setState(973);
			match(KEY);
			setState(974);
			match(UPDATE);
			setState(975);
			column_spec();
			setState(976);
			match(EQ);
			setState(977);
			expression();
			setState(985);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(978);
				match(COMMA);
				setState(979);
				column_spec();
				setState(980);
				match(EQ);
				setState(981);
				expression();
				}
				}
				setState(987);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Insert_statementContext extends ParserRuleContext {
		public Insert_headerContext insert_header() {
			return getRuleContext(Insert_headerContext.class,0);
		}
		public Select_expressionContext select_expression() {
			return getRuleContext(Select_expressionContext.class,0);
		}
		public Value_list_clauseContext value_list_clause() {
			return getRuleContext(Value_list_clauseContext.class,0);
		}
		public Column_listContext column_list() {
			return getRuleContext(Column_listContext.class,0);
		}
		public Insert_subfixContext insert_subfix() {
			return getRuleContext(Insert_subfixContext.class,0);
		}
		public Insert_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insert_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitInsert_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Insert_statementContext insert_statement() throws RecognitionException {
		Insert_statementContext _localctx = new Insert_statementContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_insert_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(988);
			insert_header();
			setState(990);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(989);
				column_list();
				}
			}

			setState(994);
			switch (_input.LA(1)) {
			case SELECT:
				{
				setState(992);
				select_expression();
				}
				break;
			case VALUES:
			case VALUE:
				{
				setState(993);
				value_list_clause();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(997);
			_la = _input.LA(1);
			if (_la==ON) {
				{
				setState(996);
				insert_subfix();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Value_list_clauseContext extends ParserRuleContext {
		public List<Column_value_listContext> column_value_list() {
			return getRuleContexts(Column_value_listContext.class);
		}
		public Column_value_listContext column_value_list(int i) {
			return getRuleContext(Column_value_listContext.class,i);
		}
		public TerminalNode VALUES() { return getToken(uniformSQLParser.VALUES, 0); }
		public TerminalNode VALUE() { return getToken(uniformSQLParser.VALUE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(uniformSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(uniformSQLParser.COMMA, i);
		}
		public Value_list_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value_list_clause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitValue_list_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Value_list_clauseContext value_list_clause() throws RecognitionException {
		Value_list_clauseContext _localctx = new Value_list_clauseContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_value_list_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(999);
			_la = _input.LA(1);
			if ( !(_la==VALUES || _la==VALUE) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(1000);
			column_value_list();
			setState(1005);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1001);
				match(COMMA);
				setState(1002);
				column_value_list();
				}
				}
				setState(1007);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_value_listContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(uniformSQLParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(uniformSQLParser.RPAREN, 0); }
		public List<Bit_exprContext> bit_expr() {
			return getRuleContexts(Bit_exprContext.class);
		}
		public Bit_exprContext bit_expr(int i) {
			return getRuleContext(Bit_exprContext.class,i);
		}
		public List<TerminalNode> DEFAULT() { return getTokens(uniformSQLParser.DEFAULT); }
		public TerminalNode DEFAULT(int i) {
			return getToken(uniformSQLParser.DEFAULT, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(uniformSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(uniformSQLParser.COMMA, i);
		}
		public Column_value_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_value_list; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitColumn_value_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_value_listContext column_value_list() throws RecognitionException {
		Column_value_listContext _localctx = new Column_value_listContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_column_value_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1008);
			match(LPAREN);
			setState(1011);
			switch (_input.LA(1)) {
			case TRUE:
			case FALSE:
			case EXISTS:
			case NULL:
			case ROW:
			case CAST:
			case CASE:
			case BINARY:
			case USE:
			case USER:
			case ABS:
			case ACOS:
			case ASIN:
			case ATAN:
			case CEIL:
			case COS:
			case COT:
			case EXP:
			case FLOOR:
			case LN:
			case POW:
			case RAND:
			case ROUND:
			case SIN:
			case SQRT:
			case TAN:
			case LCASE:
			case LOWER:
			case LTRIM:
			case RTRIM:
			case CONCAT:
			case SUBSTR:
			case TRIM:
			case UCASE:
			case UPPER:
			case TO_DATE:
			case DAY:
			case HOUR:
			case MINUTE:
			case MONTH:
			case SECOND:
			case FROM_UNIXTIME:
			case YEAR:
			case DATE_ADD:
			case DATE_SUB:
			case AVG:
			case COUNT:
			case MAX:
			case MIN:
			case SUM:
			case COALESCE:
			case LPAREN:
			case PLUS:
			case MINUS:
			case NEGATION:
			case INTEGER_NUM:
			case HEX_DIGIT:
			case BIT_NUM:
			case REAL_NUMBER:
			case TEXT_STRING:
			case ID:
				{
				setState(1009);
				bit_expr();
				}
				break;
			case DEFAULT:
				{
				setState(1010);
				match(DEFAULT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1020);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1013);
				match(COMMA);
				setState(1016);
				switch (_input.LA(1)) {
				case TRUE:
				case FALSE:
				case EXISTS:
				case NULL:
				case ROW:
				case CAST:
				case CASE:
				case BINARY:
				case USE:
				case USER:
				case ABS:
				case ACOS:
				case ASIN:
				case ATAN:
				case CEIL:
				case COS:
				case COT:
				case EXP:
				case FLOOR:
				case LN:
				case POW:
				case RAND:
				case ROUND:
				case SIN:
				case SQRT:
				case TAN:
				case LCASE:
				case LOWER:
				case LTRIM:
				case RTRIM:
				case CONCAT:
				case SUBSTR:
				case TRIM:
				case UCASE:
				case UPPER:
				case TO_DATE:
				case DAY:
				case HOUR:
				case MINUTE:
				case MONTH:
				case SECOND:
				case FROM_UNIXTIME:
				case YEAR:
				case DATE_ADD:
				case DATE_SUB:
				case AVG:
				case COUNT:
				case MAX:
				case MIN:
				case SUM:
				case COALESCE:
				case LPAREN:
				case PLUS:
				case MINUS:
				case NEGATION:
				case INTEGER_NUM:
				case HEX_DIGIT:
				case BIT_NUM:
				case REAL_NUMBER:
				case TEXT_STRING:
				case ID:
					{
					setState(1014);
					bit_expr();
					}
					break;
				case DEFAULT:
					{
					setState(1015);
					match(DEFAULT);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(1022);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1023);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Set_columns_cluaseContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(uniformSQLParser.SET, 0); }
		public List<Set_column_cluaseContext> set_column_cluase() {
			return getRuleContexts(Set_column_cluaseContext.class);
		}
		public Set_column_cluaseContext set_column_cluase(int i) {
			return getRuleContext(Set_column_cluaseContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(uniformSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(uniformSQLParser.COMMA, i);
		}
		public Set_columns_cluaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set_columns_cluase; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitSet_columns_cluase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Set_columns_cluaseContext set_columns_cluase() throws RecognitionException {
		Set_columns_cluaseContext _localctx = new Set_columns_cluaseContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_set_columns_cluase);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1025);
			match(SET);
			setState(1026);
			set_column_cluase();
			setState(1031);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1027);
				match(COMMA);
				setState(1028);
				set_column_cluase();
				}
				}
				setState(1033);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Set_column_cluaseContext extends ParserRuleContext {
		public Column_specContext column_spec() {
			return getRuleContext(Column_specContext.class,0);
		}
		public TerminalNode EQ() { return getToken(uniformSQLParser.EQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode DEFAULT() { return getToken(uniformSQLParser.DEFAULT, 0); }
		public Set_column_cluaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set_column_cluase; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitSet_column_cluase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Set_column_cluaseContext set_column_cluase() throws RecognitionException {
		Set_column_cluaseContext _localctx = new Set_column_cluaseContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_set_column_cluase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1034);
			column_spec();
			setState(1035);
			match(EQ);
			setState(1038);
			switch (_input.LA(1)) {
			case TRUE:
			case FALSE:
			case NOT:
			case EXISTS:
			case NULL:
			case ROW:
			case CAST:
			case CASE:
			case BINARY:
			case USE:
			case USER:
			case ABS:
			case ACOS:
			case ASIN:
			case ATAN:
			case CEIL:
			case COS:
			case COT:
			case EXP:
			case FLOOR:
			case LN:
			case POW:
			case RAND:
			case ROUND:
			case SIN:
			case SQRT:
			case TAN:
			case LCASE:
			case LOWER:
			case LTRIM:
			case RTRIM:
			case CONCAT:
			case SUBSTR:
			case TRIM:
			case UCASE:
			case UPPER:
			case TO_DATE:
			case DAY:
			case HOUR:
			case MINUTE:
			case MONTH:
			case SECOND:
			case FROM_UNIXTIME:
			case YEAR:
			case DATE_ADD:
			case DATE_SUB:
			case AVG:
			case COUNT:
			case MAX:
			case MIN:
			case SUM:
			case COALESCE:
			case LPAREN:
			case PLUS:
			case MINUS:
			case NEGATION:
			case INTEGER_NUM:
			case HEX_DIGIT:
			case BIT_NUM:
			case REAL_NUMBER:
			case TEXT_STRING:
			case ID:
				{
				setState(1036);
				expression();
				}
				break;
			case DEFAULT:
				{
				setState(1037);
				match(DEFAULT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_database_statementContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(uniformSQLParser.CREATE, 0); }
		public Schema_nameContext schema_name() {
			return getRuleContext(Schema_nameContext.class,0);
		}
		public TerminalNode DATABASE() { return getToken(uniformSQLParser.DATABASE, 0); }
		public TerminalNode SCHEMA() { return getToken(uniformSQLParser.SCHEMA, 0); }
		public TerminalNode IF() { return getToken(uniformSQLParser.IF, 0); }
		public TerminalNode NOT() { return getToken(uniformSQLParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(uniformSQLParser.EXISTS, 0); }
		public Create_database_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_database_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitCreate_database_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_database_statementContext create_database_statement() throws RecognitionException {
		Create_database_statementContext _localctx = new Create_database_statementContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_create_database_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1040);
			match(CREATE);
			setState(1041);
			_la = _input.LA(1);
			if ( !(_la==DATABASE || _la==SCHEMA) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(1045);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(1042);
				match(IF);
				setState(1043);
				match(NOT);
				setState(1044);
				match(EXISTS);
				}
			}

			setState(1047);
			schema_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Drop_database_statementContext extends ParserRuleContext {
		public TerminalNode DROP() { return getToken(uniformSQLParser.DROP, 0); }
		public Schema_nameContext schema_name() {
			return getRuleContext(Schema_nameContext.class,0);
		}
		public TerminalNode DATABASE() { return getToken(uniformSQLParser.DATABASE, 0); }
		public TerminalNode SCHEMA() { return getToken(uniformSQLParser.SCHEMA, 0); }
		public TerminalNode IF() { return getToken(uniformSQLParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(uniformSQLParser.EXISTS, 0); }
		public Drop_database_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_database_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitDrop_database_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Drop_database_statementContext drop_database_statement() throws RecognitionException {
		Drop_database_statementContext _localctx = new Drop_database_statementContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_drop_database_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1049);
			match(DROP);
			setState(1050);
			_la = _input.LA(1);
			if ( !(_la==DATABASE || _la==SCHEMA) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(1053);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(1051);
				match(IF);
				setState(1052);
				match(EXISTS);
				}
			}

			setState(1055);
			schema_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_table_statementContext extends ParserRuleContext {
		public Create_table_statement1Context create_table_statement1() {
			return getRuleContext(Create_table_statement1Context.class,0);
		}
		public Create_table_statement2Context create_table_statement2() {
			return getRuleContext(Create_table_statement2Context.class,0);
		}
		public Create_table_statement3Context create_table_statement3() {
			return getRuleContext(Create_table_statement3Context.class,0);
		}
		public Create_table_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitCreate_table_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_statementContext create_table_statement() throws RecognitionException {
		Create_table_statementContext _localctx = new Create_table_statementContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_create_table_statement);
		try {
			setState(1060);
			switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1057);
				create_table_statement1();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1058);
				create_table_statement2();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1059);
				create_table_statement3();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_table_statement1Context extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(uniformSQLParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(uniformSQLParser.TABLE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(uniformSQLParser.LPAREN, 0); }
		public List<Create_definitionContext> create_definition() {
			return getRuleContexts(Create_definitionContext.class);
		}
		public Create_definitionContext create_definition(int i) {
			return getRuleContext(Create_definitionContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(uniformSQLParser.RPAREN, 0); }
		public TerminalNode TEMPORARY() { return getToken(uniformSQLParser.TEMPORARY, 0); }
		public TerminalNode EXTERNAL() { return getToken(uniformSQLParser.EXTERNAL, 0); }
		public TerminalNode IF() { return getToken(uniformSQLParser.IF, 0); }
		public TerminalNode NOT() { return getToken(uniformSQLParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(uniformSQLParser.EXISTS, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(uniformSQLParser.DOT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(uniformSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(uniformSQLParser.COMMA, i);
		}
		public TerminalNode AS() { return getToken(uniformSQLParser.AS, 0); }
		public Select_statementContext select_statement() {
			return getRuleContext(Select_statementContext.class,0);
		}
		public Create_table_statement1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_statement1; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitCreate_table_statement1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_statement1Context create_table_statement1() throws RecognitionException {
		Create_table_statement1Context _localctx = new Create_table_statement1Context(_ctx, getState());
		enterRule(_localctx, 222, RULE_create_table_statement1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1062);
			match(CREATE);
			setState(1064);
			_la = _input.LA(1);
			if (_la==TEMPORARY) {
				{
				setState(1063);
				match(TEMPORARY);
				}
			}

			setState(1067);
			_la = _input.LA(1);
			if (_la==EXTERNAL) {
				{
				setState(1066);
				match(EXTERNAL);
				}
			}

			setState(1069);
			match(TABLE);
			setState(1073);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(1070);
				match(IF);
				setState(1071);
				match(NOT);
				setState(1072);
				match(EXISTS);
				}
			}

			setState(1078);
			switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
			case 1:
				{
				setState(1075);
				database_name();
				setState(1076);
				match(DOT);
				}
				break;
			}
			setState(1080);
			table_name();
			setState(1081);
			match(LPAREN);
			setState(1082);
			create_definition();
			setState(1087);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1083);
				match(COMMA);
				setState(1084);
				create_definition();
				}
				}
				setState(1089);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1090);
			match(RPAREN);
			setState(1093);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(1091);
				match(AS);
				setState(1092);
				select_statement();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_table_statement2Context extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(uniformSQLParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(uniformSQLParser.TABLE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode AS() { return getToken(uniformSQLParser.AS, 0); }
		public Select_statementContext select_statement() {
			return getRuleContext(Select_statementContext.class,0);
		}
		public TerminalNode TEMPORARY() { return getToken(uniformSQLParser.TEMPORARY, 0); }
		public TerminalNode EXTERNAL() { return getToken(uniformSQLParser.EXTERNAL, 0); }
		public TerminalNode IF() { return getToken(uniformSQLParser.IF, 0); }
		public TerminalNode NOT() { return getToken(uniformSQLParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(uniformSQLParser.EXISTS, 0); }
		public Create_table_statement2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_statement2; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitCreate_table_statement2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_statement2Context create_table_statement2() throws RecognitionException {
		Create_table_statement2Context _localctx = new Create_table_statement2Context(_ctx, getState());
		enterRule(_localctx, 224, RULE_create_table_statement2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1095);
			match(CREATE);
			setState(1097);
			_la = _input.LA(1);
			if (_la==TEMPORARY) {
				{
				setState(1096);
				match(TEMPORARY);
				}
			}

			setState(1100);
			_la = _input.LA(1);
			if (_la==EXTERNAL) {
				{
				setState(1099);
				match(EXTERNAL);
				}
			}

			setState(1102);
			match(TABLE);
			setState(1106);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(1103);
				match(IF);
				setState(1104);
				match(NOT);
				setState(1105);
				match(EXISTS);
				}
			}

			setState(1108);
			table_name();
			setState(1109);
			match(AS);
			setState(1110);
			select_statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_table_statement3Context extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(uniformSQLParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(uniformSQLParser.TABLE, 0); }
		public List<Table_nameContext> table_name() {
			return getRuleContexts(Table_nameContext.class);
		}
		public Table_nameContext table_name(int i) {
			return getRuleContext(Table_nameContext.class,i);
		}
		public TerminalNode TEMPORARY() { return getToken(uniformSQLParser.TEMPORARY, 0); }
		public TerminalNode EXTERNAL() { return getToken(uniformSQLParser.EXTERNAL, 0); }
		public TerminalNode IF() { return getToken(uniformSQLParser.IF, 0); }
		public TerminalNode NOT() { return getToken(uniformSQLParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(uniformSQLParser.EXISTS, 0); }
		public TerminalNode LIKE() { return getToken(uniformSQLParser.LIKE, 0); }
		public TerminalNode LPAREN() { return getToken(uniformSQLParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(uniformSQLParser.RPAREN, 0); }
		public Create_table_statement3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_statement3; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitCreate_table_statement3(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_statement3Context create_table_statement3() throws RecognitionException {
		Create_table_statement3Context _localctx = new Create_table_statement3Context(_ctx, getState());
		enterRule(_localctx, 226, RULE_create_table_statement3);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1112);
			match(CREATE);
			setState(1114);
			_la = _input.LA(1);
			if (_la==TEMPORARY) {
				{
				setState(1113);
				match(TEMPORARY);
				}
			}

			setState(1117);
			_la = _input.LA(1);
			if (_la==EXTERNAL) {
				{
				setState(1116);
				match(EXTERNAL);
				}
			}

			setState(1119);
			match(TABLE);
			setState(1123);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(1120);
				match(IF);
				setState(1121);
				match(NOT);
				setState(1122);
				match(EXISTS);
				}
			}

			setState(1125);
			table_name();
			setState(1133);
			switch (_input.LA(1)) {
			case LIKE:
				{
				{
				setState(1126);
				match(LIKE);
				setState(1127);
				table_name();
				}
				}
				break;
			case LPAREN:
				{
				{
				setState(1128);
				match(LPAREN);
				setState(1129);
				match(LIKE);
				setState(1130);
				table_name();
				setState(1131);
				match(RPAREN);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_definitionContext extends ParserRuleContext {
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public Column_definitionContext column_definition() {
			return getRuleContext(Column_definitionContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(uniformSQLParser.LPAREN, 0); }
		public List<Index_column_nameContext> index_column_name() {
			return getRuleContexts(Index_column_nameContext.class);
		}
		public Index_column_nameContext index_column_name(int i) {
			return getRuleContext(Index_column_nameContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(uniformSQLParser.RPAREN, 0); }
		public TerminalNode INDEX() { return getToken(uniformSQLParser.INDEX, 0); }
		public TerminalNode KEY() { return getToken(uniformSQLParser.KEY, 0); }
		public Index_nameContext index_name() {
			return getRuleContext(Index_nameContext.class,0);
		}
		public Index_typeContext index_type() {
			return getRuleContext(Index_typeContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(uniformSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(uniformSQLParser.COMMA, i);
		}
		public List<Index_optionContext> index_option() {
			return getRuleContexts(Index_optionContext.class);
		}
		public Index_optionContext index_option(int i) {
			return getRuleContext(Index_optionContext.class,i);
		}
		public Create_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_definition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitCreate_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_definitionContext create_definition() throws RecognitionException {
		Create_definitionContext _localctx = new Create_definitionContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_create_definition);
		int _la;
		try {
			setState(1161);
			switch (_input.LA(1)) {
			case USE:
			case USER:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1135);
				column_name();
				setState(1136);
				column_definition();
				}
				}
				break;
			case INDEX:
			case KEY:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(1138);
				_la = _input.LA(1);
				if ( !(_la==INDEX || _la==KEY) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(1140);
				_la = _input.LA(1);
				if (_la==USE || _la==USER || _la==ID) {
					{
					setState(1139);
					index_name();
					}
				}

				setState(1143);
				_la = _input.LA(1);
				if (_la==USING) {
					{
					setState(1142);
					index_type();
					}
				}

				setState(1145);
				match(LPAREN);
				setState(1146);
				index_column_name();
				setState(1151);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1147);
					match(COMMA);
					setState(1148);
					index_column_name();
					}
					}
					setState(1153);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1154);
				match(RPAREN);
				setState(1158);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==USING || _la==COMMENT) {
					{
					{
					setState(1155);
					index_option();
					}
					}
					setState(1160);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_definitionContext extends ParserRuleContext {
		public Column_data_type_headerContext column_data_type_header() {
			return getRuleContext(Column_data_type_headerContext.class,0);
		}
		public TerminalNode COMMENT() { return getToken(uniformSQLParser.COMMENT, 0); }
		public TerminalNode TEXT_STRING() { return getToken(uniformSQLParser.TEXT_STRING, 0); }
		public Reference_definitionContext reference_definition() {
			return getRuleContext(Reference_definitionContext.class,0);
		}
		public Column_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_definition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitColumn_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_definitionContext column_definition() throws RecognitionException {
		Column_definitionContext _localctx = new Column_definitionContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_column_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1163);
			column_data_type_header();
			setState(1166);
			_la = _input.LA(1);
			if (_la==COMMENT) {
				{
				setState(1164);
				match(COMMENT);
				setState(1165);
				match(TEXT_STRING);
				}
			}

			setState(1169);
			_la = _input.LA(1);
			if (_la==REFERENCES) {
				{
				setState(1168);
				reference_definition();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Null_or_notnullContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(uniformSQLParser.NOT, 0); }
		public TerminalNode NULL() { return getToken(uniformSQLParser.NULL, 0); }
		public Null_or_notnullContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_null_or_notnull; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitNull_or_notnull(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Null_or_notnullContext null_or_notnull() throws RecognitionException {
		Null_or_notnullContext _localctx = new Null_or_notnullContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_null_or_notnull);
		try {
			setState(1174);
			switch (_input.LA(1)) {
			case NOT:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1171);
				match(NOT);
				setState(1172);
				match(NULL);
				}
				}
				break;
			case NULL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1173);
				match(NULL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_data_type_headerContext extends ParserRuleContext {
		public TerminalNode TINYINT() { return getToken(uniformSQLParser.TINYINT, 0); }
		public TerminalNode LPAREN() { return getToken(uniformSQLParser.LPAREN, 0); }
		public LengthContext length() {
			return getRuleContext(LengthContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(uniformSQLParser.RPAREN, 0); }
		public TerminalNode UNSIGNED() { return getToken(uniformSQLParser.UNSIGNED, 0); }
		public Null_or_notnullContext null_or_notnull() {
			return getRuleContext(Null_or_notnullContext.class,0);
		}
		public TerminalNode DEFAULT() { return getToken(uniformSQLParser.DEFAULT, 0); }
		public List<Number_literalContext> number_literal() {
			return getRuleContexts(Number_literalContext.class);
		}
		public Number_literalContext number_literal(int i) {
			return getRuleContext(Number_literalContext.class,i);
		}
		public TerminalNode SMALLINT() { return getToken(uniformSQLParser.SMALLINT, 0); }
		public TerminalNode INT() { return getToken(uniformSQLParser.INT, 0); }
		public TerminalNode BIGINT() { return getToken(uniformSQLParser.BIGINT, 0); }
		public TerminalNode DOUBLE() { return getToken(uniformSQLParser.DOUBLE, 0); }
		public TerminalNode COMMA() { return getToken(uniformSQLParser.COMMA, 0); }
		public TerminalNode FLOAT() { return getToken(uniformSQLParser.FLOAT, 0); }
		public TerminalNode DECIMAL() { return getToken(uniformSQLParser.DECIMAL, 0); }
		public TerminalNode DATE() { return getToken(uniformSQLParser.DATE, 0); }
		public TerminalNode TEXT_STRING() { return getToken(uniformSQLParser.TEXT_STRING, 0); }
		public TerminalNode TIMESTAMP() { return getToken(uniformSQLParser.TIMESTAMP, 0); }
		public TerminalNode DATETIME() { return getToken(uniformSQLParser.DATETIME, 0); }
		public TerminalNode VARCHAR() { return getToken(uniformSQLParser.VARCHAR, 0); }
		public Varchar_lengthContext varchar_length() {
			return getRuleContext(Varchar_lengthContext.class,0);
		}
		public TerminalNode BINARY() { return getToken(uniformSQLParser.BINARY, 0); }
		public Binary_lengthContext binary_length() {
			return getRuleContext(Binary_lengthContext.class,0);
		}
		public TerminalNode BOOLEAN() { return getToken(uniformSQLParser.BOOLEAN, 0); }
		public Column_data_type_headerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_data_type_header; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitColumn_data_type_header(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_data_type_headerContext column_data_type_header() throws RecognitionException {
		Column_data_type_headerContext _localctx = new Column_data_type_headerContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_column_data_type_header);
		int _la;
		try {
			setState(1360);
			switch (_input.LA(1)) {
			case TINYINT:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1176);
				match(TINYINT);
				setState(1181);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(1177);
					match(LPAREN);
					setState(1178);
					length();
					setState(1179);
					match(RPAREN);
					}
				}

				setState(1184);
				_la = _input.LA(1);
				if (_la==UNSIGNED) {
					{
					setState(1183);
					match(UNSIGNED);
					}
				}

				setState(1187);
				_la = _input.LA(1);
				if (_la==NOT || _la==NULL) {
					{
					setState(1186);
					null_or_notnull();
					}
				}

				setState(1191);
				_la = _input.LA(1);
				if (_la==DEFAULT) {
					{
					setState(1189);
					match(DEFAULT);
					setState(1190);
					number_literal();
					}
				}

				}
				}
				break;
			case SMALLINT:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(1193);
				match(SMALLINT);
				setState(1198);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(1194);
					match(LPAREN);
					setState(1195);
					length();
					setState(1196);
					match(RPAREN);
					}
				}

				setState(1201);
				_la = _input.LA(1);
				if (_la==UNSIGNED) {
					{
					setState(1200);
					match(UNSIGNED);
					}
				}

				setState(1204);
				_la = _input.LA(1);
				if (_la==NOT || _la==NULL) {
					{
					setState(1203);
					null_or_notnull();
					}
				}

				setState(1208);
				_la = _input.LA(1);
				if (_la==DEFAULT) {
					{
					setState(1206);
					match(DEFAULT);
					setState(1207);
					number_literal();
					}
				}

				}
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(1210);
				match(INT);
				setState(1215);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(1211);
					match(LPAREN);
					setState(1212);
					length();
					setState(1213);
					match(RPAREN);
					}
				}

				setState(1218);
				_la = _input.LA(1);
				if (_la==UNSIGNED) {
					{
					setState(1217);
					match(UNSIGNED);
					}
				}

				setState(1221);
				_la = _input.LA(1);
				if (_la==NOT || _la==NULL) {
					{
					setState(1220);
					null_or_notnull();
					}
				}

				setState(1225);
				_la = _input.LA(1);
				if (_la==DEFAULT) {
					{
					setState(1223);
					match(DEFAULT);
					setState(1224);
					number_literal();
					}
				}

				}
				}
				break;
			case BIGINT:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(1227);
				match(BIGINT);
				setState(1232);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(1228);
					match(LPAREN);
					setState(1229);
					length();
					setState(1230);
					match(RPAREN);
					}
				}

				setState(1235);
				_la = _input.LA(1);
				if (_la==UNSIGNED) {
					{
					setState(1234);
					match(UNSIGNED);
					}
				}

				setState(1238);
				_la = _input.LA(1);
				if (_la==NOT || _la==NULL) {
					{
					setState(1237);
					null_or_notnull();
					}
				}

				setState(1242);
				_la = _input.LA(1);
				if (_la==DEFAULT) {
					{
					setState(1240);
					match(DEFAULT);
					setState(1241);
					number_literal();
					}
				}

				}
				}
				break;
			case DOUBLE:
				enterOuterAlt(_localctx, 5);
				{
				{
				setState(1244);
				match(DOUBLE);
				setState(1251);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(1245);
					match(LPAREN);
					setState(1246);
					length();
					setState(1247);
					match(COMMA);
					setState(1248);
					number_literal();
					setState(1249);
					match(RPAREN);
					}
				}

				setState(1254);
				_la = _input.LA(1);
				if (_la==UNSIGNED) {
					{
					setState(1253);
					match(UNSIGNED);
					}
				}

				setState(1257);
				_la = _input.LA(1);
				if (_la==NOT || _la==NULL) {
					{
					setState(1256);
					null_or_notnull();
					}
				}

				setState(1261);
				_la = _input.LA(1);
				if (_la==DEFAULT) {
					{
					setState(1259);
					match(DEFAULT);
					setState(1260);
					number_literal();
					}
				}

				}
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 6);
				{
				{
				setState(1263);
				match(FLOAT);
				setState(1270);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(1264);
					match(LPAREN);
					setState(1265);
					length();
					setState(1266);
					match(COMMA);
					setState(1267);
					number_literal();
					setState(1268);
					match(RPAREN);
					}
				}

				setState(1273);
				_la = _input.LA(1);
				if (_la==UNSIGNED) {
					{
					setState(1272);
					match(UNSIGNED);
					}
				}

				setState(1276);
				_la = _input.LA(1);
				if (_la==NOT || _la==NULL) {
					{
					setState(1275);
					null_or_notnull();
					}
				}

				setState(1280);
				_la = _input.LA(1);
				if (_la==DEFAULT) {
					{
					setState(1278);
					match(DEFAULT);
					setState(1279);
					number_literal();
					}
				}

				}
				}
				break;
			case DECIMAL:
				enterOuterAlt(_localctx, 7);
				{
				{
				setState(1282);
				match(DECIMAL);
				setState(1291);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(1283);
					match(LPAREN);
					setState(1284);
					length();
					setState(1287);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(1285);
						match(COMMA);
						setState(1286);
						number_literal();
						}
					}

					setState(1289);
					match(RPAREN);
					}
				}

				setState(1294);
				_la = _input.LA(1);
				if (_la==UNSIGNED) {
					{
					setState(1293);
					match(UNSIGNED);
					}
				}

				setState(1297);
				_la = _input.LA(1);
				if (_la==NOT || _la==NULL) {
					{
					setState(1296);
					null_or_notnull();
					}
				}

				setState(1301);
				_la = _input.LA(1);
				if (_la==DEFAULT) {
					{
					setState(1299);
					match(DEFAULT);
					setState(1300);
					number_literal();
					}
				}

				}
				}
				break;
			case DATE:
				enterOuterAlt(_localctx, 8);
				{
				{
				setState(1303);
				match(DATE);
				setState(1305);
				_la = _input.LA(1);
				if (_la==NOT || _la==NULL) {
					{
					setState(1304);
					null_or_notnull();
					}
				}

				setState(1309);
				_la = _input.LA(1);
				if (_la==DEFAULT) {
					{
					setState(1307);
					match(DEFAULT);
					setState(1308);
					match(TEXT_STRING);
					}
				}

				}
				}
				break;
			case TIMESTAMP:
				enterOuterAlt(_localctx, 9);
				{
				{
				setState(1311);
				match(TIMESTAMP);
				setState(1313);
				_la = _input.LA(1);
				if (_la==NOT || _la==NULL) {
					{
					setState(1312);
					null_or_notnull();
					}
				}

				setState(1317);
				_la = _input.LA(1);
				if (_la==DEFAULT) {
					{
					setState(1315);
					match(DEFAULT);
					setState(1316);
					match(TEXT_STRING);
					}
				}

				}
				}
				break;
			case DATETIME:
				enterOuterAlt(_localctx, 10);
				{
				{
				setState(1319);
				match(DATETIME);
				setState(1321);
				_la = _input.LA(1);
				if (_la==NOT || _la==NULL) {
					{
					setState(1320);
					null_or_notnull();
					}
				}

				setState(1325);
				_la = _input.LA(1);
				if (_la==DEFAULT) {
					{
					setState(1323);
					match(DEFAULT);
					setState(1324);
					match(TEXT_STRING);
					}
				}

				}
				}
				break;
			case VARCHAR:
				enterOuterAlt(_localctx, 11);
				{
				{
				setState(1327);
				match(VARCHAR);
				setState(1328);
				match(LPAREN);
				setState(1329);
				varchar_length();
				setState(1330);
				match(RPAREN);
				setState(1332);
				_la = _input.LA(1);
				if (_la==NOT || _la==NULL) {
					{
					setState(1331);
					null_or_notnull();
					}
				}

				setState(1336);
				_la = _input.LA(1);
				if (_la==DEFAULT) {
					{
					setState(1334);
					match(DEFAULT);
					setState(1335);
					match(TEXT_STRING);
					}
				}

				}
				}
				break;
			case BINARY:
				enterOuterAlt(_localctx, 12);
				{
				{
				setState(1338);
				match(BINARY);
				setState(1343);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(1339);
					match(LPAREN);
					setState(1340);
					binary_length();
					setState(1341);
					match(RPAREN);
					}
				}

				setState(1346);
				_la = _input.LA(1);
				if (_la==NOT || _la==NULL) {
					{
					setState(1345);
					null_or_notnull();
					}
				}

				setState(1350);
				_la = _input.LA(1);
				if (_la==DEFAULT) {
					{
					setState(1348);
					match(DEFAULT);
					setState(1349);
					match(TEXT_STRING);
					}
				}

				}
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 13);
				{
				{
				setState(1352);
				match(BOOLEAN);
				setState(1354);
				_la = _input.LA(1);
				if (_la==NOT || _la==NULL) {
					{
					setState(1353);
					null_or_notnull();
					}
				}

				setState(1358);
				_la = _input.LA(1);
				if (_la==DEFAULT) {
					{
					setState(1356);
					match(DEFAULT);
					setState(1357);
					match(TEXT_STRING);
					}
				}

				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Index_column_nameContext extends ParserRuleContext {
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(uniformSQLParser.LPAREN, 0); }
		public TerminalNode INTEGER_NUM() { return getToken(uniformSQLParser.INTEGER_NUM, 0); }
		public TerminalNode RPAREN() { return getToken(uniformSQLParser.RPAREN, 0); }
		public TerminalNode ASC() { return getToken(uniformSQLParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(uniformSQLParser.DESC, 0); }
		public Index_column_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_column_name; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitIndex_column_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Index_column_nameContext index_column_name() throws RecognitionException {
		Index_column_nameContext _localctx = new Index_column_nameContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_index_column_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1362);
			column_name();
			setState(1366);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(1363);
				match(LPAREN);
				setState(1364);
				match(INTEGER_NUM);
				setState(1365);
				match(RPAREN);
				}
			}

			setState(1369);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(1368);
				_la = _input.LA(1);
				if ( !(_la==ASC || _la==DESC) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Reference_definitionContext extends ParserRuleContext {
		public TerminalNode REFERENCES() { return getToken(uniformSQLParser.REFERENCES, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(uniformSQLParser.LPAREN, 0); }
		public List<Index_column_nameContext> index_column_name() {
			return getRuleContexts(Index_column_nameContext.class);
		}
		public Index_column_nameContext index_column_name(int i) {
			return getRuleContext(Index_column_nameContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(uniformSQLParser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(uniformSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(uniformSQLParser.COMMA, i);
		}
		public List<TerminalNode> ON() { return getTokens(uniformSQLParser.ON); }
		public TerminalNode ON(int i) {
			return getToken(uniformSQLParser.ON, i);
		}
		public TerminalNode DELETE() { return getToken(uniformSQLParser.DELETE, 0); }
		public List<Reference_optionContext> reference_option() {
			return getRuleContexts(Reference_optionContext.class);
		}
		public Reference_optionContext reference_option(int i) {
			return getRuleContext(Reference_optionContext.class,i);
		}
		public TerminalNode UPDATE() { return getToken(uniformSQLParser.UPDATE, 0); }
		public Reference_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reference_definition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitReference_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Reference_definitionContext reference_definition() throws RecognitionException {
		Reference_definitionContext _localctx = new Reference_definitionContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_reference_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1371);
			match(REFERENCES);
			setState(1372);
			table_name();
			setState(1373);
			match(LPAREN);
			setState(1374);
			index_column_name();
			setState(1379);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1375);
				match(COMMA);
				setState(1376);
				index_column_name();
				}
				}
				setState(1381);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1382);
			match(RPAREN);
			setState(1386);
			switch ( getInterpreter().adaptivePredict(_input,177,_ctx) ) {
			case 1:
				{
				setState(1383);
				match(ON);
				setState(1384);
				match(DELETE);
				setState(1385);
				reference_option();
				}
				break;
			}
			setState(1391);
			_la = _input.LA(1);
			if (_la==ON) {
				{
				setState(1388);
				match(ON);
				setState(1389);
				match(UPDATE);
				setState(1390);
				reference_option();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Reference_optionContext extends ParserRuleContext {
		public TerminalNode RESTRICT() { return getToken(uniformSQLParser.RESTRICT, 0); }
		public TerminalNode CASCADE() { return getToken(uniformSQLParser.CASCADE, 0); }
		public TerminalNode SET() { return getToken(uniformSQLParser.SET, 0); }
		public TerminalNode NULL() { return getToken(uniformSQLParser.NULL, 0); }
		public Reference_optionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reference_option; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitReference_option(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Reference_optionContext reference_option() throws RecognitionException {
		Reference_optionContext _localctx = new Reference_optionContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_reference_option);
		try {
			setState(1397);
			switch (_input.LA(1)) {
			case RESTRICT:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1393);
				match(RESTRICT);
				}
				}
				break;
			case CASCADE:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(1394);
				match(CASCADE);
				}
				}
				break;
			case SET:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(1395);
				match(SET);
				setState(1396);
				match(NULL);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LengthContext extends ParserRuleContext {
		public TerminalNode INTEGER_NUM() { return getToken(uniformSQLParser.INTEGER_NUM, 0); }
		public LengthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_length; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitLength(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LengthContext length() throws RecognitionException {
		LengthContext _localctx = new LengthContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_length);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1399);
			match(INTEGER_NUM);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Varchar_lengthContext extends ParserRuleContext {
		public TerminalNode VARCHAR_NUM() { return getToken(uniformSQLParser.VARCHAR_NUM, 0); }
		public Varchar_lengthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varchar_length; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitVarchar_length(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Varchar_lengthContext varchar_length() throws RecognitionException {
		Varchar_lengthContext _localctx = new Varchar_lengthContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_varchar_length);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1401);
			match(VARCHAR_NUM);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Binary_lengthContext extends ParserRuleContext {
		public TerminalNode BINARY_NUM() { return getToken(uniformSQLParser.BINARY_NUM, 0); }
		public Binary_lengthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binary_length; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitBinary_length(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Binary_lengthContext binary_length() throws RecognitionException {
		Binary_lengthContext _localctx = new Binary_lengthContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_binary_length);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1403);
			match(BINARY_NUM);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Alter_table_statementContext extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(uniformSQLParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(uniformSQLParser.TABLE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public List<Alter_table_specificationContext> alter_table_specification() {
			return getRuleContexts(Alter_table_specificationContext.class);
		}
		public Alter_table_specificationContext alter_table_specification(int i) {
			return getRuleContext(Alter_table_specificationContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(uniformSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(uniformSQLParser.COMMA, i);
		}
		public Alter_table_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_table_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitAlter_table_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Alter_table_statementContext alter_table_statement() throws RecognitionException {
		Alter_table_statementContext _localctx = new Alter_table_statementContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_alter_table_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1405);
			match(ALTER);
			setState(1406);
			match(TABLE);
			setState(1407);
			table_name();
			setState(1416);
			_la = _input.LA(1);
			if (_la==CHANGE || _la==RENAME) {
				{
				setState(1408);
				alter_table_specification();
				setState(1413);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1409);
					match(COMMA);
					setState(1410);
					alter_table_specification();
					}
					}
					setState(1415);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Alter_table_specificationContext extends ParserRuleContext {
		public TerminalNode RENAME() { return getToken(uniformSQLParser.RENAME, 0); }
		public TerminalNode TO() { return getToken(uniformSQLParser.TO, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode CHANGE() { return getToken(uniformSQLParser.CHANGE, 0); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public TerminalNode COLUMN() { return getToken(uniformSQLParser.COLUMN, 0); }
		public Alter_table_specificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_table_specification; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitAlter_table_specification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Alter_table_specificationContext alter_table_specification() throws RecognitionException {
		Alter_table_specificationContext _localctx = new Alter_table_specificationContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_alter_table_specification);
		int _la;
		try {
			setState(1428);
			switch (_input.LA(1)) {
			case RENAME:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1418);
				match(RENAME);
				setState(1419);
				match(TO);
				setState(1420);
				table_name();
				}
				}
				break;
			case CHANGE:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(1421);
				match(CHANGE);
				setState(1423);
				_la = _input.LA(1);
				if (_la==COLUMN) {
					{
					setState(1422);
					match(COLUMN);
					}
				}

				setState(1425);
				column_name();
				setState(1426);
				column_name();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Index_column_namesContext extends ParserRuleContext {
		public List<Index_column_nameContext> index_column_name() {
			return getRuleContexts(Index_column_nameContext.class);
		}
		public Index_column_nameContext index_column_name(int i) {
			return getRuleContext(Index_column_nameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(uniformSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(uniformSQLParser.COMMA, i);
		}
		public Index_column_namesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_column_names; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitIndex_column_names(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Index_column_namesContext index_column_names() throws RecognitionException {
		Index_column_namesContext _localctx = new Index_column_namesContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_index_column_names);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1430);
			index_column_name();
			setState(1435);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1431);
				match(COMMA);
				setState(1432);
				index_column_name();
				}
				}
				setState(1437);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Index_typeContext extends ParserRuleContext {
		public TerminalNode USING() { return getToken(uniformSQLParser.USING, 0); }
		public TerminalNode HASH() { return getToken(uniformSQLParser.HASH, 0); }
		public Index_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_type; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitIndex_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Index_typeContext index_type() throws RecognitionException {
		Index_typeContext _localctx = new Index_typeContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_index_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1438);
			match(USING);
			{
			setState(1439);
			match(HASH);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Index_optionContext extends ParserRuleContext {
		public Index_typeContext index_type() {
			return getRuleContext(Index_typeContext.class,0);
		}
		public TerminalNode COMMENT() { return getToken(uniformSQLParser.COMMENT, 0); }
		public TerminalNode TEXT_STRING() { return getToken(uniformSQLParser.TEXT_STRING, 0); }
		public Index_optionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_option; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitIndex_option(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Index_optionContext index_option() throws RecognitionException {
		Index_optionContext _localctx = new Index_optionContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_index_option);
		try {
			setState(1444);
			switch (_input.LA(1)) {
			case USING:
				enterOuterAlt(_localctx, 1);
				{
				setState(1441);
				index_type();
				}
				break;
			case COMMENT:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(1442);
				match(COMMENT);
				setState(1443);
				match(TEXT_STRING);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_definitionsContext extends ParserRuleContext {
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public List<Column_definitionContext> column_definition() {
			return getRuleContexts(Column_definitionContext.class);
		}
		public Column_definitionContext column_definition(int i) {
			return getRuleContext(Column_definitionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(uniformSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(uniformSQLParser.COMMA, i);
		}
		public Column_definitionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_definitions; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitColumn_definitions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_definitionsContext column_definitions() throws RecognitionException {
		Column_definitionsContext _localctx = new Column_definitionsContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_column_definitions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1446);
			column_name();
			setState(1447);
			column_definition();
			setState(1454);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1448);
				match(COMMA);
				setState(1449);
				column_name();
				setState(1450);
				column_definition();
				}
				}
				setState(1456);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Rename_table_statementContext extends ParserRuleContext {
		public TerminalNode RENAME() { return getToken(uniformSQLParser.RENAME, 0); }
		public TerminalNode TABLE() { return getToken(uniformSQLParser.TABLE, 0); }
		public List<Table_nameContext> table_name() {
			return getRuleContexts(Table_nameContext.class);
		}
		public Table_nameContext table_name(int i) {
			return getRuleContext(Table_nameContext.class,i);
		}
		public List<TerminalNode> TO() { return getTokens(uniformSQLParser.TO); }
		public TerminalNode TO(int i) {
			return getToken(uniformSQLParser.TO, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(uniformSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(uniformSQLParser.COMMA, i);
		}
		public Rename_table_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rename_table_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitRename_table_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Rename_table_statementContext rename_table_statement() throws RecognitionException {
		Rename_table_statementContext _localctx = new Rename_table_statementContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_rename_table_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1457);
			match(RENAME);
			setState(1458);
			match(TABLE);
			setState(1459);
			table_name();
			setState(1460);
			match(TO);
			setState(1461);
			table_name();
			setState(1469);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1462);
				match(COMMA);
				setState(1463);
				table_name();
				setState(1464);
				match(TO);
				setState(1465);
				table_name();
				}
				}
				setState(1471);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Drop_table_statementContext extends ParserRuleContext {
		public TerminalNode DROP() { return getToken(uniformSQLParser.DROP, 0); }
		public TerminalNode TABLE() { return getToken(uniformSQLParser.TABLE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode IF() { return getToken(uniformSQLParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(uniformSQLParser.EXISTS, 0); }
		public Drop_table_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_table_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitDrop_table_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Drop_table_statementContext drop_table_statement() throws RecognitionException {
		Drop_table_statementContext _localctx = new Drop_table_statementContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_drop_table_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1472);
			match(DROP);
			setState(1473);
			match(TABLE);
			setState(1476);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(1474);
				match(IF);
				setState(1475);
				match(EXISTS);
				}
			}

			setState(1478);
			table_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Drop_view_statementContext extends ParserRuleContext {
		public TerminalNode DROP() { return getToken(uniformSQLParser.DROP, 0); }
		public TerminalNode VIEW() { return getToken(uniformSQLParser.VIEW, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode IF() { return getToken(uniformSQLParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(uniformSQLParser.EXISTS, 0); }
		public Drop_view_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_view_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitDrop_view_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Drop_view_statementContext drop_view_statement() throws RecognitionException {
		Drop_view_statementContext _localctx = new Drop_view_statementContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_drop_view_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1480);
			match(DROP);
			setState(1481);
			match(VIEW);
			setState(1484);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(1482);
				match(IF);
				setState(1483);
				match(EXISTS);
				}
			}

			setState(1486);
			table_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Truncate_table_statementContext extends ParserRuleContext {
		public TerminalNode TRUNCATE() { return getToken(uniformSQLParser.TRUNCATE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode TABLE() { return getToken(uniformSQLParser.TABLE, 0); }
		public Truncate_table_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_truncate_table_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitTruncate_table_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Truncate_table_statementContext truncate_table_statement() throws RecognitionException {
		Truncate_table_statementContext _localctx = new Truncate_table_statementContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_truncate_table_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1488);
			match(TRUNCATE);
			setState(1490);
			_la = _input.LA(1);
			if (_la==TABLE) {
				{
				setState(1489);
				match(TABLE);
				}
			}

			setState(1492);
			table_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_view_statementContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(uniformSQLParser.CREATE, 0); }
		public Create_view_bodyContext create_view_body() {
			return getRuleContext(Create_view_bodyContext.class,0);
		}
		public Create_view_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_view_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitCreate_view_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_view_statementContext create_view_statement() throws RecognitionException {
		Create_view_statementContext _localctx = new Create_view_statementContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_create_view_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1494);
			match(CREATE);
			setState(1495);
			create_view_body();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_view_bodyContext extends ParserRuleContext {
		public TerminalNode VIEW() { return getToken(uniformSQLParser.VIEW, 0); }
		public View_nameContext view_name() {
			return getRuleContext(View_nameContext.class,0);
		}
		public TerminalNode AS() { return getToken(uniformSQLParser.AS, 0); }
		public Select_statementContext select_statement() {
			return getRuleContext(Select_statementContext.class,0);
		}
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(uniformSQLParser.DOT, 0); }
		public TerminalNode IF() { return getToken(uniformSQLParser.IF, 0); }
		public TerminalNode NOT() { return getToken(uniformSQLParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(uniformSQLParser.EXISTS, 0); }
		public Column_listContext column_list() {
			return getRuleContext(Column_listContext.class,0);
		}
		public Create_view_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_view_body; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitCreate_view_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_view_bodyContext create_view_body() throws RecognitionException {
		Create_view_bodyContext _localctx = new Create_view_bodyContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_create_view_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1497);
			match(VIEW);
			setState(1501);
			switch ( getInterpreter().adaptivePredict(_input,191,_ctx) ) {
			case 1:
				{
				setState(1498);
				database_name();
				setState(1499);
				match(DOT);
				}
				break;
			}
			setState(1503);
			view_name();
			setState(1507);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(1504);
				match(IF);
				setState(1505);
				match(NOT);
				setState(1506);
				match(EXISTS);
				}
			}

			setState(1510);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(1509);
				column_list();
				}
			}

			setState(1512);
			match(AS);
			setState(1513);
			select_statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Alter_view_statementContext extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(uniformSQLParser.ALTER, 0); }
		public Create_view_bodyContext create_view_body() {
			return getRuleContext(Create_view_bodyContext.class,0);
		}
		public Alter_view_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_view_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitAlter_view_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Alter_view_statementContext alter_view_statement() throws RecognitionException {
		Alter_view_statementContext _localctx = new Alter_view_statementContext(_ctx, getState());
		enterRule(_localctx, 272, RULE_alter_view_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1515);
			match(ALTER);
			setState(1516);
			create_view_body();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_event_statementContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(uniformSQLParser.CREATE, 0); }
		public TerminalNode USER() { return getToken(uniformSQLParser.USER, 0); }
		public User_nameContext user_name() {
			return getRuleContext(User_nameContext.class,0);
		}
		public TerminalNode IDENTIFIED() { return getToken(uniformSQLParser.IDENTIFIED, 0); }
		public TerminalNode BY() { return getToken(uniformSQLParser.BY, 0); }
		public PasswordContext password() {
			return getRuleContext(PasswordContext.class,0);
		}
		public Create_event_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_event_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitCreate_event_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_event_statementContext create_event_statement() throws RecognitionException {
		Create_event_statementContext _localctx = new Create_event_statementContext(_ctx, getState());
		enterRule(_localctx, 274, RULE_create_event_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1518);
			match(CREATE);
			setState(1519);
			match(USER);
			setState(1520);
			user_name();
			setState(1521);
			match(IDENTIFIED);
			setState(1522);
			match(BY);
			setState(1523);
			password();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Drop_event_statementContext extends ParserRuleContext {
		public TerminalNode DROP() { return getToken(uniformSQLParser.DROP, 0); }
		public TerminalNode USER() { return getToken(uniformSQLParser.USER, 0); }
		public User_nameContext user_name() {
			return getRuleContext(User_nameContext.class,0);
		}
		public Drop_event_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_event_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitDrop_event_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Drop_event_statementContext drop_event_statement() throws RecognitionException {
		Drop_event_statementContext _localctx = new Drop_event_statementContext(_ctx, getState());
		enterRule(_localctx, 276, RULE_drop_event_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1525);
			match(DROP);
			setState(1526);
			match(USER);
			setState(1527);
			user_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Grant_event_statementContext extends ParserRuleContext {
		public List<TerminalNode> GRANT() { return getTokens(uniformSQLParser.GRANT); }
		public TerminalNode GRANT(int i) {
			return getToken(uniformSQLParser.GRANT, i);
		}
		public List<Priv_typeContext> priv_type() {
			return getRuleContexts(Priv_typeContext.class);
		}
		public Priv_typeContext priv_type(int i) {
			return getRuleContext(Priv_typeContext.class,i);
		}
		public TerminalNode ON() { return getToken(uniformSQLParser.ON, 0); }
		public TerminalNode TO() { return getToken(uniformSQLParser.TO, 0); }
		public List<Principal_specificationContext> principal_specification() {
			return getRuleContexts(Principal_specificationContext.class);
		}
		public Principal_specificationContext principal_specification(int i) {
			return getRuleContext(Principal_specificationContext.class,i);
		}
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public View_nameContext view_name() {
			return getRuleContext(View_nameContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(uniformSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(uniformSQLParser.COMMA, i);
		}
		public TerminalNode WITH() { return getToken(uniformSQLParser.WITH, 0); }
		public TerminalNode OPTION() { return getToken(uniformSQLParser.OPTION, 0); }
		public Grant_event_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grant_event_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitGrant_event_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Grant_event_statementContext grant_event_statement() throws RecognitionException {
		Grant_event_statementContext _localctx = new Grant_event_statementContext(_ctx, getState());
		enterRule(_localctx, 278, RULE_grant_event_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1529);
			match(GRANT);
			setState(1530);
			priv_type();
			setState(1535);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1531);
				match(COMMA);
				setState(1532);
				priv_type();
				}
				}
				setState(1537);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1538);
			match(ON);
			setState(1541);
			switch ( getInterpreter().adaptivePredict(_input,195,_ctx) ) {
			case 1:
				{
				setState(1539);
				table_name();
				}
				break;
			case 2:
				{
				setState(1540);
				view_name();
				}
				break;
			}
			setState(1543);
			match(TO);
			setState(1544);
			principal_specification();
			setState(1549);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1545);
				match(COMMA);
				setState(1546);
				principal_specification();
				}
				}
				setState(1551);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1555);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(1552);
				match(WITH);
				setState(1553);
				match(GRANT);
				setState(1554);
				match(OPTION);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Principal_specificationContext extends ParserRuleContext {
		public User_nameContext user_name() {
			return getRuleContext(User_nameContext.class,0);
		}
		public TerminalNode USER() { return getToken(uniformSQLParser.USER, 0); }
		public Principal_specificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_principal_specification; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitPrincipal_specification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Principal_specificationContext principal_specification() throws RecognitionException {
		Principal_specificationContext _localctx = new Principal_specificationContext(_ctx, getState());
		enterRule(_localctx, 280, RULE_principal_specification);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1558);
			switch ( getInterpreter().adaptivePredict(_input,198,_ctx) ) {
			case 1:
				{
				setState(1557);
				match(USER);
				}
				break;
			}
			setState(1560);
			user_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Revoke_event_statementContext extends ParserRuleContext {
		public TerminalNode REVOKE() { return getToken(uniformSQLParser.REVOKE, 0); }
		public List<Priv_typeContext> priv_type() {
			return getRuleContexts(Priv_typeContext.class);
		}
		public Priv_typeContext priv_type(int i) {
			return getRuleContext(Priv_typeContext.class,i);
		}
		public TerminalNode ON() { return getToken(uniformSQLParser.ON, 0); }
		public TerminalNode FROM() { return getToken(uniformSQLParser.FROM, 0); }
		public List<Principal_specificationContext> principal_specification() {
			return getRuleContexts(Principal_specificationContext.class);
		}
		public Principal_specificationContext principal_specification(int i) {
			return getRuleContext(Principal_specificationContext.class,i);
		}
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public View_nameContext view_name() {
			return getRuleContext(View_nameContext.class,0);
		}
		public TerminalNode GRANT() { return getToken(uniformSQLParser.GRANT, 0); }
		public TerminalNode OPTION() { return getToken(uniformSQLParser.OPTION, 0); }
		public TerminalNode FOR() { return getToken(uniformSQLParser.FOR, 0); }
		public List<TerminalNode> COMMA() { return getTokens(uniformSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(uniformSQLParser.COMMA, i);
		}
		public Revoke_event_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_revoke_event_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitRevoke_event_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Revoke_event_statementContext revoke_event_statement() throws RecognitionException {
		Revoke_event_statementContext _localctx = new Revoke_event_statementContext(_ctx, getState());
		enterRule(_localctx, 282, RULE_revoke_event_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1562);
			match(REVOKE);
			setState(1566);
			_la = _input.LA(1);
			if (_la==GRANT) {
				{
				setState(1563);
				match(GRANT);
				setState(1564);
				match(OPTION);
				setState(1565);
				match(FOR);
				}
			}

			setState(1568);
			priv_type();
			setState(1573);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1569);
				match(COMMA);
				setState(1570);
				priv_type();
				}
				}
				setState(1575);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1576);
			match(ON);
			setState(1579);
			switch ( getInterpreter().adaptivePredict(_input,201,_ctx) ) {
			case 1:
				{
				setState(1577);
				table_name();
				}
				break;
			case 2:
				{
				setState(1578);
				view_name();
				}
				break;
			}
			setState(1581);
			match(FROM);
			setState(1582);
			principal_specification();
			setState(1587);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1583);
				match(COMMA);
				setState(1584);
				principal_specification();
				}
				}
				setState(1589);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Show_event_statementContext extends ParserRuleContext {
		public TerminalNode SHOW() { return getToken(uniformSQLParser.SHOW, 0); }
		public Show_specificationContext show_specification() {
			return getRuleContext(Show_specificationContext.class,0);
		}
		public Show_event_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_show_event_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitShow_event_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Show_event_statementContext show_event_statement() throws RecognitionException {
		Show_event_statementContext _localctx = new Show_event_statementContext(_ctx, getState());
		enterRule(_localctx, 284, RULE_show_event_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1590);
			match(SHOW);
			setState(1591);
			show_specification();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Show_specificationContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(uniformSQLParser.CREATE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode TABLE() { return getToken(uniformSQLParser.TABLE, 0); }
		public TerminalNode VIEW() { return getToken(uniformSQLParser.VIEW, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(uniformSQLParser.DOT, 0); }
		public TerminalNode COLUMNS() { return getToken(uniformSQLParser.COLUMNS, 0); }
		public List<TerminalNode> FROM() { return getTokens(uniformSQLParser.FROM); }
		public TerminalNode FROM(int i) {
			return getToken(uniformSQLParser.FROM, i);
		}
		public TerminalNode LIKE() { return getToken(uniformSQLParser.LIKE, 0); }
		public TerminalNode ID() { return getToken(uniformSQLParser.ID, 0); }
		public TerminalNode DATABASES() { return getToken(uniformSQLParser.DATABASES, 0); }
		public TerminalNode SCHEMAS() { return getToken(uniformSQLParser.SCHEMAS, 0); }
		public TerminalNode SERVER() { return getToken(uniformSQLParser.SERVER, 0); }
		public TerminalNode ALIASES() { return getToken(uniformSQLParser.ALIASES, 0); }
		public TerminalNode GRANT() { return getToken(uniformSQLParser.GRANT, 0); }
		public TerminalNode ON() { return getToken(uniformSQLParser.ON, 0); }
		public Principal_nameContext principal_name() {
			return getRuleContext(Principal_nameContext.class,0);
		}
		public Principal_specificationContext principal_specification() {
			return getRuleContext(Principal_specificationContext.class,0);
		}
		public TerminalNode ALL() { return getToken(uniformSQLParser.ALL, 0); }
		public Show_specificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_show_specification; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitShow_specification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Show_specificationContext show_specification() throws RecognitionException {
		Show_specificationContext _localctx = new Show_specificationContext(_ctx, getState());
		enterRule(_localctx, 286, RULE_show_specification);
		int _la;
		try {
			setState(1624);
			switch (_input.LA(1)) {
			case CREATE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1593);
				match(CREATE);
				setState(1594);
				_la = _input.LA(1);
				if ( !(_la==TABLE || _la==VIEW) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(1598);
				switch ( getInterpreter().adaptivePredict(_input,203,_ctx) ) {
				case 1:
					{
					setState(1595);
					database_name();
					setState(1596);
					match(DOT);
					}
					break;
				}
				setState(1600);
				table_name();
				}
				break;
			case COLUMNS:
				enterOuterAlt(_localctx, 2);
				{
				setState(1601);
				match(COLUMNS);
				setState(1602);
				match(FROM);
				setState(1603);
				table_name();
				setState(1606);
				_la = _input.LA(1);
				if (_la==FROM) {
					{
					setState(1604);
					match(FROM);
					setState(1605);
					database_name();
					}
				}

				}
				break;
			case DATABASES:
			case SCHEMAS:
				enterOuterAlt(_localctx, 3);
				{
				setState(1608);
				_la = _input.LA(1);
				if ( !(_la==DATABASES || _la==SCHEMAS) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(1609);
				match(LIKE);
				setState(1610);
				match(ID);
				}
				break;
			case SERVER:
				enterOuterAlt(_localctx, 4);
				{
				setState(1611);
				match(SERVER);
				setState(1612);
				match(ALIASES);
				}
				break;
			case GRANT:
				enterOuterAlt(_localctx, 5);
				{
				setState(1613);
				match(GRANT);
				setState(1616);
				switch ( getInterpreter().adaptivePredict(_input,205,_ctx) ) {
				case 1:
					{
					setState(1614);
					principal_name();
					}
					break;
				case 2:
					{
					setState(1615);
					principal_specification();
					}
					break;
				}
				setState(1618);
				match(ON);
				setState(1622);
				switch (_input.LA(1)) {
				case ALL:
					{
					setState(1619);
					match(ALL);
					}
					break;
				case TABLE:
					{
					setState(1620);
					match(TABLE);
					setState(1621);
					table_name();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Set_event_statementContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(uniformSQLParser.SET, 0); }
		public TerminalNode TABLE() { return getToken(uniformSQLParser.TABLE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode TO() { return getToken(uniformSQLParser.TO, 0); }
		public Server_aliasContext server_alias() {
			return getRuleContext(Server_aliasContext.class,0);
		}
		public TerminalNode DOT() { return getToken(uniformSQLParser.DOT, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public Set_event_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set_event_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitSet_event_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Set_event_statementContext set_event_statement() throws RecognitionException {
		Set_event_statementContext _localctx = new Set_event_statementContext(_ctx, getState());
		enterRule(_localctx, 288, RULE_set_event_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1626);
			match(SET);
			setState(1627);
			match(TABLE);
			setState(1628);
			table_name();
			setState(1629);
			match(TO);
			setState(1630);
			server_alias();
			setState(1631);
			match(DOT);
			setState(1632);
			database_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Use_event_statementContext extends ParserRuleContext {
		public TerminalNode USE() { return getToken(uniformSQLParser.USE, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public Use_event_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_use_event_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitUse_event_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Use_event_statementContext use_event_statement() throws RecognitionException {
		Use_event_statementContext _localctx = new Use_event_statementContext(_ctx, getState());
		enterRule(_localctx, 290, RULE_use_event_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1634);
			match(USE);
			setState(1635);
			database_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Service_event_statementContext extends ParserRuleContext {
		public TerminalNode SERVER() { return getToken(uniformSQLParser.SERVER, 0); }
		public TerminalNode ALIAS() { return getToken(uniformSQLParser.ALIAS, 0); }
		public Server_aliasContext server_alias() {
			return getRuleContext(Server_aliasContext.class,0);
		}
		public Root_statementContext root_statement() {
			return getRuleContext(Root_statementContext.class,0);
		}
		public Service_event_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_service_event_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitService_event_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Service_event_statementContext service_event_statement() throws RecognitionException {
		Service_event_statementContext _localctx = new Service_event_statementContext(_ctx, getState());
		enterRule(_localctx, 292, RULE_service_event_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1637);
			match(SERVER);
			setState(1638);
			match(ALIAS);
			setState(1639);
			server_alias();
			setState(1640);
			root_statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Update_statementsContext extends ParserRuleContext {
		public TerminalNode UPDATE() { return getToken(uniformSQLParser.UPDATE, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(uniformSQLParser.DOT, 0); }
		public User_nameContext user_name() {
			return getRuleContext(User_nameContext.class,0);
		}
		public Set_columns_cluaseContext set_columns_cluase() {
			return getRuleContext(Set_columns_cluaseContext.class,0);
		}
		public Where_clauseContext where_clause() {
			return getRuleContext(Where_clauseContext.class,0);
		}
		public Update_statementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_update_statements; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitUpdate_statements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Update_statementsContext update_statements() throws RecognitionException {
		Update_statementsContext _localctx = new Update_statementsContext(_ctx, getState());
		enterRule(_localctx, 294, RULE_update_statements);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1642);
			match(UPDATE);
			setState(1643);
			database_name();
			setState(1644);
			match(DOT);
			setState(1645);
			user_name();
			setState(1646);
			set_columns_cluase();
			setState(1647);
			where_clause();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\u014c\u0674\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t\u0080"+
		"\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083\4\u0084\t\u0084\4\u0085"+
		"\t\u0085\4\u0086\t\u0086\4\u0087\t\u0087\4\u0088\t\u0088\4\u0089\t\u0089"+
		"\4\u008a\t\u008a\4\u008b\t\u008b\4\u008c\t\u008c\4\u008d\t\u008d\4\u008e"+
		"\t\u008e\4\u008f\t\u008f\4\u0090\t\u0090\4\u0091\t\u0091\4\u0092\t\u0092"+
		"\4\u0093\t\u0093\4\u0094\t\u0094\4\u0095\t\u0095\3\2\3\2\3\3\3\3\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u013c\n\4\3\5\3\5\3"+
		"\6\3\6\5\6\u0142\n\6\3\6\3\6\5\6\u0146\n\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6"+
		"\u014e\n\6\5\6\u0150\n\6\5\6\u0152\n\6\3\7\3\7\3\b\3\b\3\t\5\t\u0159\n"+
		"\t\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u0169"+
		"\n\r\3\16\3\16\3\16\3\16\3\16\5\16\u0170\n\16\3\17\3\17\3\20\3\20\3\21"+
		"\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30"+
		"\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37"+
		"\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\5\'\u01a3\n\'\3"+
		"\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\5-\u01b3\n-\3.\3.\3/\3/\3/"+
		"\7/\u01ba\n/\f/\16/\u01bd\13/\3\60\3\60\3\60\7\60\u01c2\n\60\f\60\16\60"+
		"\u01c5\13\60\3\61\3\61\3\61\7\61\u01ca\n\61\f\61\16\61\u01cd\13\61\3\62"+
		"\5\62\u01d0\n\62\3\62\3\62\3\63\3\63\3\63\5\63\u01d7\n\63\3\63\3\63\5"+
		"\63\u01db\n\63\5\63\u01dd\n\63\3\64\3\64\3\64\3\64\3\64\3\64\3\64\5\64"+
		"\u01e6\n\64\3\64\3\64\3\64\5\64\u01eb\n\64\3\64\3\64\3\64\5\64\u01f0\n"+
		"\64\3\65\3\65\5\65\u01f4\n\65\3\65\3\65\3\65\5\65\u01f9\n\65\3\65\3\65"+
		"\5\65\u01fd\n\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\5\65\u0206\n\65\3"+
		"\65\3\65\3\65\3\65\3\65\5\65\u020d\n\65\3\65\3\65\3\65\3\65\5\65\u0213"+
		"\n\65\3\66\3\66\3\66\5\66\u0218\n\66\3\67\3\67\3\67\5\67\u021d\n\67\3"+
		"8\38\38\58\u0222\n8\39\39\39\59\u0227\n9\3:\3:\3:\5:\u022c\n:\3;\3;\3"+
		";\5;\u0231\n;\3<\3<\3<\5<\u0236\n<\3=\3=\3>\3>\3>\3>\3>\3>\3>\3>\3>\3"+
		">\5>\u0244\n>\3?\3?\3?\3?\3?\7?\u024b\n?\f?\16?\u024e\13?\5?\u0250\n?"+
		"\3?\5?\u0253\n?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\5?\u025f\n?\3?\3?\3?\5?"+
		"\u0264\n?\3@\3@\5@\u0268\n@\3A\3A\3A\3A\3A\3A\6A\u0270\nA\rA\16A\u0271"+
		"\3A\3A\5A\u0276\nA\3A\3A\3B\3B\3B\3B\3B\3B\3B\6B\u0281\nB\rB\16B\u0282"+
		"\3B\3B\5B\u0287\nB\3B\3B\3C\3C\3C\5C\u028e\nC\3C\3C\3C\5C\u0293\nC\3C"+
		"\3C\3D\3D\3D\3D\7D\u029b\nD\fD\16D\u029e\13D\3D\3D\3E\3E\3E\3E\3F\3F\3"+
		"F\7F\u02a9\nF\fF\16F\u02ac\13F\3G\3G\5G\u02b0\nG\3H\3H\5H\u02b4\nH\3H"+
		"\3H\3H\5H\u02b9\nH\5H\u02bb\nH\3I\3I\3I\5I\u02c0\nI\3I\3I\3I\3I\5I\u02c6"+
		"\nI\3J\3J\3J\5J\u02cb\nJ\5J\u02cd\nJ\3J\3J\5J\u02d1\nJ\3K\3K\5K\u02d5"+
		"\nK\3K\3K\3K\3K\3K\3K\3K\3K\5K\u02df\nK\3L\3L\3L\3M\3M\3M\7M\u02e7\nM"+
		"\fM\16M\u02ea\13M\3N\3N\3N\3N\3N\3N\3N\5N\u02f3\nN\5N\u02f5\nN\3O\3O\3"+
		"O\3O\5O\u02fb\nO\3O\3O\3O\3O\3O\3O\3O\3O\5O\u0305\nO\3P\3P\3P\7P\u030a"+
		"\nP\fP\16P\u030d\13P\3Q\3Q\3Q\3Q\3Q\3R\3R\3R\7R\u0317\nR\fR\16R\u031a"+
		"\13R\3S\3S\5S\u031e\nS\3S\5S\u0321\nS\3T\3T\3T\5T\u0326\nT\3U\3U\3U\3"+
		"U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\5U\u0337\nU\3V\3V\3V\5V\u033c\nV\3"+
		"V\7V\u033f\nV\fV\16V\u0342\13V\3W\3W\5W\u0346\nW\3W\3W\3W\3W\5W\u034c"+
		"\nW\3W\5W\u034f\nW\3W\5W\u0352\nW\5W\u0354\nW\3W\5W\u0357\nW\3W\5W\u035a"+
		"\nW\3X\3X\3X\3Y\3Y\3Y\3Y\3Y\7Y\u0364\nY\fY\16Y\u0367\13Y\3Y\3Y\5Y\u036b"+
		"\nY\3Z\3Z\3Z\5Z\u0370\nZ\3[\3[\3[\3\\\3\\\3\\\3\\\3\\\7\\\u037a\n\\\f"+
		"\\\16\\\u037d\13\\\3]\3]\5]\u0381\n]\3^\3^\3^\3^\5^\u0387\n^\3^\3^\3_"+
		"\3_\3`\3`\3a\3a\3a\7a\u0392\na\fa\16a\u0395\13a\3a\5a\u0398\na\3b\3b\3"+
		"b\3b\7b\u039e\nb\fb\16b\u03a1\13b\3b\3b\3c\3c\3c\3c\3d\3d\3d\5d\u03ac"+
		"\nd\3d\3d\3e\3e\3e\3e\3e\3e\5e\u03b6\ne\3e\3e\5e\u03ba\ne\5e\u03bc\ne"+
		"\3f\3f\3g\3g\5g\u03c2\ng\3g\5g\u03c5\ng\3g\5g\u03c8\ng\3g\3g\5g\u03cc"+
		"\ng\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\7h\u03da\nh\fh\16h\u03dd\13h\3"+
		"i\3i\5i\u03e1\ni\3i\3i\5i\u03e5\ni\3i\5i\u03e8\ni\3j\3j\3j\3j\7j\u03ee"+
		"\nj\fj\16j\u03f1\13j\3k\3k\3k\5k\u03f6\nk\3k\3k\3k\5k\u03fb\nk\7k\u03fd"+
		"\nk\fk\16k\u0400\13k\3k\3k\3l\3l\3l\3l\7l\u0408\nl\fl\16l\u040b\13l\3"+
		"m\3m\3m\3m\5m\u0411\nm\3n\3n\3n\3n\3n\5n\u0418\nn\3n\3n\3o\3o\3o\3o\5"+
		"o\u0420\no\3o\3o\3p\3p\3p\5p\u0427\np\3q\3q\5q\u042b\nq\3q\5q\u042e\n"+
		"q\3q\3q\3q\3q\5q\u0434\nq\3q\3q\3q\5q\u0439\nq\3q\3q\3q\3q\3q\7q\u0440"+
		"\nq\fq\16q\u0443\13q\3q\3q\3q\5q\u0448\nq\3r\3r\5r\u044c\nr\3r\5r\u044f"+
		"\nr\3r\3r\3r\3r\5r\u0455\nr\3r\3r\3r\3r\3s\3s\5s\u045d\ns\3s\5s\u0460"+
		"\ns\3s\3s\3s\3s\5s\u0466\ns\3s\3s\3s\3s\3s\3s\3s\3s\5s\u0470\ns\3t\3t"+
		"\3t\3t\3t\5t\u0477\nt\3t\5t\u047a\nt\3t\3t\3t\3t\7t\u0480\nt\ft\16t\u0483"+
		"\13t\3t\3t\7t\u0487\nt\ft\16t\u048a\13t\5t\u048c\nt\3u\3u\3u\5u\u0491"+
		"\nu\3u\5u\u0494\nu\3v\3v\3v\5v\u0499\nv\3w\3w\3w\3w\3w\5w\u04a0\nw\3w"+
		"\5w\u04a3\nw\3w\5w\u04a6\nw\3w\3w\5w\u04aa\nw\3w\3w\3w\3w\3w\5w\u04b1"+
		"\nw\3w\5w\u04b4\nw\3w\5w\u04b7\nw\3w\3w\5w\u04bb\nw\3w\3w\3w\3w\3w\5w"+
		"\u04c2\nw\3w\5w\u04c5\nw\3w\5w\u04c8\nw\3w\3w\5w\u04cc\nw\3w\3w\3w\3w"+
		"\3w\5w\u04d3\nw\3w\5w\u04d6\nw\3w\5w\u04d9\nw\3w\3w\5w\u04dd\nw\3w\3w"+
		"\3w\3w\3w\3w\3w\5w\u04e6\nw\3w\5w\u04e9\nw\3w\5w\u04ec\nw\3w\3w\5w\u04f0"+
		"\nw\3w\3w\3w\3w\3w\3w\3w\5w\u04f9\nw\3w\5w\u04fc\nw\3w\5w\u04ff\nw\3w"+
		"\3w\5w\u0503\nw\3w\3w\3w\3w\3w\5w\u050a\nw\3w\3w\5w\u050e\nw\3w\5w\u0511"+
		"\nw\3w\5w\u0514\nw\3w\3w\5w\u0518\nw\3w\3w\5w\u051c\nw\3w\3w\5w\u0520"+
		"\nw\3w\3w\5w\u0524\nw\3w\3w\5w\u0528\nw\3w\3w\5w\u052c\nw\3w\3w\5w\u0530"+
		"\nw\3w\3w\3w\3w\3w\5w\u0537\nw\3w\3w\5w\u053b\nw\3w\3w\3w\3w\3w\5w\u0542"+
		"\nw\3w\5w\u0545\nw\3w\3w\5w\u0549\nw\3w\3w\5w\u054d\nw\3w\3w\5w\u0551"+
		"\nw\5w\u0553\nw\3x\3x\3x\3x\5x\u0559\nx\3x\5x\u055c\nx\3y\3y\3y\3y\3y"+
		"\3y\7y\u0564\ny\fy\16y\u0567\13y\3y\3y\3y\3y\5y\u056d\ny\3y\3y\3y\5y\u0572"+
		"\ny\3z\3z\3z\3z\5z\u0578\nz\3{\3{\3|\3|\3}\3}\3~\3~\3~\3~\3~\3~\7~\u0586"+
		"\n~\f~\16~\u0589\13~\5~\u058b\n~\3\177\3\177\3\177\3\177\3\177\5\177\u0592"+
		"\n\177\3\177\3\177\3\177\5\177\u0597\n\177\3\u0080\3\u0080\3\u0080\7\u0080"+
		"\u059c\n\u0080\f\u0080\16\u0080\u059f\13\u0080\3\u0081\3\u0081\3\u0081"+
		"\3\u0082\3\u0082\3\u0082\5\u0082\u05a7\n\u0082\3\u0083\3\u0083\3\u0083"+
		"\3\u0083\3\u0083\3\u0083\7\u0083\u05af\n\u0083\f\u0083\16\u0083\u05b2"+
		"\13\u0083\3\u0084\3\u0084\3\u0084\3\u0084\3\u0084\3\u0084\3\u0084\3\u0084"+
		"\3\u0084\3\u0084\7\u0084\u05be\n\u0084\f\u0084\16\u0084\u05c1\13\u0084"+
		"\3\u0085\3\u0085\3\u0085\3\u0085\5\u0085\u05c7\n\u0085\3\u0085\3\u0085"+
		"\3\u0086\3\u0086\3\u0086\3\u0086\5\u0086\u05cf\n\u0086\3\u0086\3\u0086"+
		"\3\u0087\3\u0087\5\u0087\u05d5\n\u0087\3\u0087\3\u0087\3\u0088\3\u0088"+
		"\3\u0088\3\u0089\3\u0089\3\u0089\3\u0089\5\u0089\u05e0\n\u0089\3\u0089"+
		"\3\u0089\3\u0089\3\u0089\5\u0089\u05e6\n\u0089\3\u0089\5\u0089\u05e9\n"+
		"\u0089\3\u0089\3\u0089\3\u0089\3\u008a\3\u008a\3\u008a\3\u008b\3\u008b"+
		"\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b\3\u008c\3\u008c\3\u008c\3\u008c"+
		"\3\u008d\3\u008d\3\u008d\3\u008d\7\u008d\u0600\n\u008d\f\u008d\16\u008d"+
		"\u0603\13\u008d\3\u008d\3\u008d\3\u008d\5\u008d\u0608\n\u008d\3\u008d"+
		"\3\u008d\3\u008d\3\u008d\7\u008d\u060e\n\u008d\f\u008d\16\u008d\u0611"+
		"\13\u008d\3\u008d\3\u008d\3\u008d\5\u008d\u0616\n\u008d\3\u008e\5\u008e"+
		"\u0619\n\u008e\3\u008e\3\u008e\3\u008f\3\u008f\3\u008f\3\u008f\5\u008f"+
		"\u0621\n\u008f\3\u008f\3\u008f\3\u008f\7\u008f\u0626\n\u008f\f\u008f\16"+
		"\u008f\u0629\13\u008f\3\u008f\3\u008f\3\u008f\5\u008f\u062e\n\u008f\3"+
		"\u008f\3\u008f\3\u008f\3\u008f\7\u008f\u0634\n\u008f\f\u008f\16\u008f"+
		"\u0637\13\u008f\3\u0090\3\u0090\3\u0090\3\u0091\3\u0091\3\u0091\3\u0091"+
		"\3\u0091\5\u0091\u0641\n\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091"+
		"\3\u0091\5\u0091\u0649\n\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091"+
		"\3\u0091\3\u0091\3\u0091\5\u0091\u0653\n\u0091\3\u0091\3\u0091\3\u0091"+
		"\3\u0091\5\u0091\u0659\n\u0091\5\u0091\u065b\n\u0091\3\u0092\3\u0092\3"+
		"\u0092\3\u0092\3\u0092\3\u0092\3\u0092\3\u0092\3\u0093\3\u0093\3\u0093"+
		"\3\u0094\3\u0094\3\u0094\3\u0094\3\u0094\3\u0095\3\u0095\3\u0095\3\u0095"+
		"\3\u0095\3\u0095\3\u0095\3\u0095\2\2\u0096\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|"+
		"~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096"+
		"\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae"+
		"\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6"+
		"\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de"+
		"\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4\u00f6"+
		"\u00f8\u00fa\u00fc\u00fe\u0100\u0102\u0104\u0106\u0108\u010a\u010c\u010e"+
		"\u0110\u0112\u0114\u0116\u0118\u011a\u011c\u011e\u0120\u0122\u0124\u0126"+
		"\u0128\2\32\4\2\u00ce\u00ce\u00e6\u00e6\4\2\u0127\u012a\u013e\u013f\4"+
		"\2\u0107\u010b\u010d\u010d\3\2\u0138\u0139\4\2\u0141\u0141\u0146\u0146"+
		"\3\2\3\4\3\2\u00ec\u00fb\3\2\u00fc\u0104\3\2\u0106\u010f\3\2\u0111\u0115"+
		"\7\2\5\5\23\23\25\25\u00a3\u00a3\u00d1\u00d1\3\2\u012c\u012d\5\2\u0121"+
		"\u0122\u0133\u0133\u013d\u013d\4\2\u00c1\u00c1\u0138\u013a\5\2\5\5\24"+
		"\24\u0133\u0133\3\2\33\35\4\2$$ii\4\2\5\5\24\24\3\2\n\13\3\2\u011d\u011e"+
		"\3\2\u011b\u011c\4\2\u00a8\u00a8\u00ab\u00ab\4\2!!\u00a6\u00a6\4\2\u00a9"+
		"\u00a9\u00ac\u00ac\u06f3\2\u012a\3\2\2\2\4\u012c\3\2\2\2\6\u013b\3\2\2"+
		"\2\b\u013d\3\2\2\2\n\u0151\3\2\2\2\f\u0153\3\2\2\2\16\u0155\3\2\2\2\20"+
		"\u0158\3\2\2\2\22\u015c\3\2\2\2\24\u015e\3\2\2\2\26\u0160\3\2\2\2\30\u0168"+
		"\3\2\2\2\32\u016f\3\2\2\2\34\u0171\3\2\2\2\36\u0173\3\2\2\2 \u0175\3\2"+
		"\2\2\"\u0177\3\2\2\2$\u0179\3\2\2\2&\u017b\3\2\2\2(\u017d\3\2\2\2*\u017f"+
		"\3\2\2\2,\u0181\3\2\2\2.\u0183\3\2\2\2\60\u0185\3\2\2\2\62\u0187\3\2\2"+
		"\2\64\u0189\3\2\2\2\66\u018b\3\2\2\28\u018d\3\2\2\2:\u018f\3\2\2\2<\u0191"+
		"\3\2\2\2>\u0193\3\2\2\2@\u0195\3\2\2\2B\u0197\3\2\2\2D\u0199\3\2\2\2F"+
		"\u019b\3\2\2\2H\u019d\3\2\2\2J\u019f\3\2\2\2L\u01a2\3\2\2\2N\u01a6\3\2"+
		"\2\2P\u01a8\3\2\2\2R\u01aa\3\2\2\2T\u01ac\3\2\2\2V\u01ae\3\2\2\2X\u01b2"+
		"\3\2\2\2Z\u01b4\3\2\2\2\\\u01b6\3\2\2\2^\u01be\3\2\2\2`\u01c6\3\2\2\2"+
		"b\u01cf\3\2\2\2d\u01d3\3\2\2\2f\u01ef\3\2\2\2h\u0212\3\2\2\2j\u0214\3"+
		"\2\2\2l\u0219\3\2\2\2n\u021e\3\2\2\2p\u0223\3\2\2\2r\u0228\3\2\2\2t\u022d"+
		"\3\2\2\2v\u0235\3\2\2\2x\u0237\3\2\2\2z\u0243\3\2\2\2|\u0263\3\2\2\2~"+
		"\u0267\3\2\2\2\u0080\u0269\3\2\2\2\u0082\u0279\3\2\2\2\u0084\u0292\3\2"+
		"\2\2\u0086\u0296\3\2\2\2\u0088\u02a1\3\2\2\2\u008a\u02a5\3\2\2\2\u008c"+
		"\u02af\3\2\2\2\u008e\u02b1\3\2\2\2\u0090\u02bc\3\2\2\2\u0092\u02c7\3\2"+
		"\2\2\u0094\u02de\3\2\2\2\u0096\u02e0\3\2\2\2\u0098\u02e3\3\2\2\2\u009a"+
		"\u02eb\3\2\2\2\u009c\u0304\3\2\2\2\u009e\u0306\3\2\2\2\u00a0\u030e\3\2"+
		"\2\2\u00a2\u0313\3\2\2\2\u00a4\u031d\3\2\2\2\u00a6\u0325\3\2\2\2\u00a8"+
		"\u0336\3\2\2\2\u00aa\u0338\3\2\2\2\u00ac\u0343\3\2\2\2\u00ae\u035b\3\2"+
		"\2\2\u00b0\u035e\3\2\2\2\u00b2\u036f\3\2\2\2\u00b4\u0371\3\2\2\2\u00b6"+
		"\u0374\3\2\2\2\u00b8\u037e\3\2\2\2\u00ba\u0382\3\2\2\2\u00bc\u038a\3\2"+
		"\2\2\u00be\u038c\3\2\2\2\u00c0\u0397\3\2\2\2\u00c2\u0399\3\2\2\2\u00c4"+
		"\u03a4\3\2\2\2\u00c6\u03ab\3\2\2\2\u00c8\u03bb\3\2\2\2\u00ca\u03bd\3\2"+
		"\2\2\u00cc\u03bf\3\2\2\2\u00ce\u03cd\3\2\2\2\u00d0\u03de\3\2\2\2\u00d2"+
		"\u03e9\3\2\2\2\u00d4\u03f2\3\2\2\2\u00d6\u0403\3\2\2\2\u00d8\u040c\3\2"+
		"\2\2\u00da\u0412\3\2\2\2\u00dc\u041b\3\2\2\2\u00de\u0426\3\2\2\2\u00e0"+
		"\u0428\3\2\2\2\u00e2\u0449\3\2\2\2\u00e4\u045a\3\2\2\2\u00e6\u048b\3\2"+
		"\2\2\u00e8\u048d\3\2\2\2\u00ea\u0498\3\2\2\2\u00ec\u0552\3\2\2\2\u00ee"+
		"\u0554\3\2\2\2\u00f0\u055d\3\2\2\2\u00f2\u0577\3\2\2\2\u00f4\u0579\3\2"+
		"\2\2\u00f6\u057b\3\2\2\2\u00f8\u057d\3\2\2\2\u00fa\u057f\3\2\2\2\u00fc"+
		"\u0596\3\2\2\2\u00fe\u0598\3\2\2\2\u0100\u05a0\3\2\2\2\u0102\u05a6\3\2"+
		"\2\2\u0104\u05a8\3\2\2\2\u0106\u05b3\3\2\2\2\u0108\u05c2\3\2\2\2\u010a"+
		"\u05ca\3\2\2\2\u010c\u05d2\3\2\2\2\u010e\u05d8\3\2\2\2\u0110\u05db\3\2"+
		"\2\2\u0112\u05ed\3\2\2\2\u0114\u05f0\3\2\2\2\u0116\u05f7\3\2\2\2\u0118"+
		"\u05fb\3\2\2\2\u011a\u0618\3\2\2\2\u011c\u061c\3\2\2\2\u011e\u0638\3\2"+
		"\2\2\u0120\u065a\3\2\2\2\u0122\u065c\3\2\2\2\u0124\u0664\3\2\2\2\u0126"+
		"\u0667\3\2\2\2\u0128\u066c\3\2\2\2\u012a\u012b\t\2\2\2\u012b\3\3\2\2\2"+
		"\u012c\u012d\7\u014c\2\2\u012d\5\3\2\2\2\u012e\u013c\3\2\2\2\u012f\u013c"+
		"\7I\2\2\u0130\u013c\7J\2\2\u0131\u013c\7K\2\2\u0132\u013c\7L\2\2\u0133"+
		"\u013c\7H\2\2\u0134\u013c\7M\2\2\u0135\u013c\7N\2\2\u0136\u013c\7O\2\2"+
		"\u0137\u013c\7Q\2\2\u0138\u013c\7T\2\2\u0139\u013c\7\u00c1\2\2\u013a\u013c"+
		"\7R\2\2\u013b\u012e\3\2\2\2\u013b\u012f\3\2\2\2\u013b\u0130\3\2\2\2\u013b"+
		"\u0131\3\2\2\2\u013b\u0132\3\2\2\2\u013b\u0133\3\2\2\2\u013b\u0134\3\2"+
		"\2\2\u013b\u0135\3\2\2\2\u013b\u0136\3\2\2\2\u013b\u0137\3\2\2\2\u013b"+
		"\u0138\3\2\2\2\u013b\u0139\3\2\2\2\u013b\u013a\3\2\2\2\u013c\7\3\2\2\2"+
		"\u013d\u013e\t\3\2\2\u013e\t\3\2\2\2\u013f\u0141\7\u00c1\2\2\u0140\u0142"+
		"\7\u0141\2\2\u0141\u0140\3\2\2\2\u0141\u0142\3\2\2\2\u0142\u0152\3\2\2"+
		"\2\u0143\u0145\7\u00eb\2\2\u0144\u0146\7\u0141\2\2\u0145\u0144\3\2\2\2"+
		"\u0145\u0146\3\2\2\2\u0146\u0152\3\2\2\2\u0147\u0152\7O\2\2\u0148\u0152"+
		"\7P\2\2\u0149\u014f\7R\2\2\u014a\u014d\7\u0141\2\2\u014b\u014c\7\u0132"+
		"\2\2\u014c\u014e\7\u0141\2\2\u014d\u014b\3\2\2\2\u014d\u014e\3\2\2\2\u014e"+
		"\u0150\3\2\2\2\u014f\u014a\3\2\2\2\u014f\u0150\3\2\2\2\u0150\u0152\3\2"+
		"\2\2\u0151\u013f\3\2\2\2\u0151\u0143\3\2\2\2\u0151\u0147\3\2\2\2\u0151"+
		"\u0148\3\2\2\2\u0151\u0149\3\2\2\2\u0152\13\3\2\2\2\u0153\u0154\t\4\2"+
		"\2\u0154\r\3\2\2\2\u0155\u0156\7\u0147\2\2\u0156\17\3\2\2\2\u0157\u0159"+
		"\t\5\2\2\u0158\u0157\3\2\2\2\u0158\u0159\3\2\2\2\u0159\u015a\3\2\2\2\u015a"+
		"\u015b\t\6\2\2\u015b\21\3\2\2\2\u015c\u015d\7\u0144\2\2\u015d\23\3\2\2"+
		"\2\u015e\u015f\t\7\2\2\u015f\25\3\2\2\2\u0160\u0161\7\u0145\2\2\u0161"+
		"\27\3\2\2\2\u0162\u0169\5\16\b\2\u0163\u0169\5\20\t\2\u0164\u0169\5\22"+
		"\n\2\u0165\u0169\5\24\13\2\u0166\u0169\5\26\f\2\u0167\u0169\79\2\2\u0168"+
		"\u0162\3\2\2\2\u0168\u0163\3\2\2\2\u0168\u0164\3\2\2\2\u0168\u0165\3\2"+
		"\2\2\u0168\u0166\3\2\2\2\u0168\u0167\3\2\2\2\u0169\31\3\2\2\2\u016a\u0170"+
		"\5\34\17\2\u016b\u0170\5\36\20\2\u016c\u0170\5 \21\2\u016d\u0170\5\"\22"+
		"\2\u016e\u0170\5$\23\2\u016f\u016a\3\2\2\2\u016f\u016b\3\2\2\2\u016f\u016c"+
		"\3\2\2\2\u016f\u016d\3\2\2\2\u016f\u016e\3\2\2\2\u0170\33\3\2\2\2\u0171"+
		"\u0172\t\b\2\2\u0172\35\3\2\2\2\u0173\u0174\t\t\2\2\u0174\37\3\2\2\2\u0175"+
		"\u0176\t\n\2\2\u0176!\3\2\2\2\u0177\u0178\7\u0116\2\2\u0178#\3\2\2\2\u0179"+
		"\u017a\t\13\2\2\u017a%\3\2\2\2\u017b\u017c\5X-\2\u017c\'\3\2\2\2\u017d"+
		"\u017e\5X-\2\u017e)\3\2\2\2\u017f\u0180\5X-\2\u0180+\3\2\2\2\u0181\u0182"+
		"\5X-\2\u0182-\3\2\2\2\u0183\u0184\5X-\2\u0184/\3\2\2\2\u0185\u0186\5X"+
		"-\2\u0186\61\3\2\2\2\u0187\u0188\5X-\2\u0188\63\3\2\2\2\u0189\u018a\5"+
		"X-\2\u018a\65\3\2\2\2\u018b\u018c\5X-\2\u018c\67\3\2\2\2\u018d\u018e\5"+
		"X-\2\u018e9\3\2\2\2\u018f\u0190\5X-\2\u0190;\3\2\2\2\u0191\u0192\5X-\2"+
		"\u0192=\3\2\2\2\u0193\u0194\5X-\2\u0194?\3\2\2\2\u0195\u0196\5X-\2\u0196"+
		"A\3\2\2\2\u0197\u0198\5X-\2\u0198C\3\2\2\2\u0199\u019a\5X-\2\u019aE\3"+
		"\2\2\2\u019b\u019c\5X-\2\u019cG\3\2\2\2\u019d\u019e\5X-\2\u019eI\3\2\2"+
		"\2\u019f\u01a0\5X-\2\u01a0K\3\2\2\2\u01a1\u01a3\7\22\2\2\u01a2\u01a1\3"+
		"\2\2\2\u01a2\u01a3\3\2\2\2\u01a3\u01a4\3\2\2\2\u01a4\u01a5\5X-\2\u01a5"+
		"M\3\2\2\2\u01a6\u01a7\5X-\2\u01a7O\3\2\2\2\u01a8\u01a9\5X-\2\u01a9Q\3"+
		"\2\2\2\u01aa\u01ab\5X-\2\u01abS\3\2\2\2\u01ac\u01ad\5X-\2\u01adU\3\2\2"+
		"\2\u01ae\u01af\5X-\2\u01afW\3\2\2\2\u01b0\u01b3\7\u0148\2\2\u01b1\u01b3"+
		"\5\2\2\2\u01b2\u01b0\3\2\2\2\u01b2\u01b1\3\2\2\2\u01b3Y\3\2\2\2\u01b4"+
		"\u01b5\t\f\2\2\u01b5[\3\2\2\2\u01b6\u01bb\5^\60\2\u01b7\u01b8\7\u0123"+
		"\2\2\u01b8\u01ba\5^\60\2\u01b9\u01b7\3\2\2\2\u01ba\u01bd\3\2\2\2\u01bb"+
		"\u01b9\3\2\2\2\u01bb\u01bc\3\2\2\2\u01bc]\3\2\2\2\u01bd\u01bb\3\2\2\2"+
		"\u01be\u01c3\5`\61\2\u01bf\u01c0\7\u0125\2\2\u01c0\u01c2\5`\61\2\u01c1"+
		"\u01bf\3\2\2\2\u01c2\u01c5\3\2\2\2\u01c3\u01c1\3\2\2\2\u01c3\u01c4\3\2"+
		"\2\2\u01c4_\3\2\2\2\u01c5\u01c3\3\2\2\2\u01c6\u01cb\5b\62\2\u01c7\u01c8"+
		"\7\u0124\2\2\u01c8\u01ca\5b\62\2\u01c9\u01c7\3\2\2\2\u01ca\u01cd\3\2\2"+
		"\2\u01cb\u01c9\3\2\2\2\u01cb\u01cc\3\2\2\2\u01cca\3\2\2\2\u01cd\u01cb"+
		"\3\2\2\2\u01ce\u01d0\7\6\2\2\u01cf\u01ce\3\2\2\2\u01cf\u01d0\3\2\2\2\u01d0"+
		"\u01d1\3\2\2\2\u01d1\u01d2\5d\63\2\u01d2c\3\2\2\2\u01d3\u01dc\5f\64\2"+
		"\u01d4\u01d6\78\2\2\u01d5\u01d7\7\6\2\2\u01d6\u01d5\3\2\2\2\u01d6\u01d7"+
		"\3\2\2\2\u01d7\u01da\3\2\2\2\u01d8\u01db\5\24\13\2\u01d9\u01db\79\2\2"+
		"\u01da\u01d8\3\2\2\2\u01da\u01d9\3\2\2\2\u01db\u01dd\3\2\2\2\u01dc\u01d4"+
		"\3\2\2\2\u01dc\u01dd\3\2\2\2\u01dde\3\2\2\2\u01de\u01df\5h\65\2\u01df"+
		"\u01e0\5\b\5\2\u01e0\u01e1\5h\65\2\u01e1\u01f0\3\2\2\2\u01e2\u01e3\5h"+
		"\65\2\u01e3\u01e5\5\b\5\2\u01e4\u01e6\7\5\2\2\u01e5\u01e4\3\2\2\2\u01e5"+
		"\u01e6\3\2\2\2\u01e6\u01e7\3\2\2\2\u01e7\u01e8\5\u00c4c\2\u01e8\u01f0"+
		"\3\2\2\2\u01e9\u01eb\7\6\2\2\u01ea\u01e9\3\2\2\2\u01ea\u01eb\3\2\2\2\u01eb"+
		"\u01ec\3\2\2\2\u01ec\u01ed\7\t\2\2\u01ed\u01f0\5\u00c4c\2\u01ee\u01f0"+
		"\5h\65\2\u01ef\u01de\3\2\2\2\u01ef\u01e2\3\2\2\2\u01ef\u01ea\3\2\2\2\u01ef"+
		"\u01ee\3\2\2\2\u01f0g\3\2\2\2\u01f1\u01f3\5j\66\2\u01f2\u01f4\7\6\2\2"+
		"\u01f3\u01f2\3\2\2\2\u01f3\u01f4\3\2\2\2\u01f4\u01f5\3\2\2\2\u01f5\u01f8"+
		"\7\u00a7\2\2\u01f6\u01f9\5\u00c4c\2\u01f7\u01f9\5\u0086D\2\u01f8\u01f6"+
		"\3\2\2\2\u01f8\u01f7\3\2\2\2\u01f9\u0213\3\2\2\2\u01fa\u01fc\5j\66\2\u01fb"+
		"\u01fd\7\6\2\2\u01fc\u01fb\3\2\2\2\u01fc\u01fd\3\2\2\2\u01fd\u01fe\3\2"+
		"\2\2\u01fe\u01ff\7\u00bf\2\2\u01ff\u0200\5j\66\2\u0200\u0201\7\u0124\2"+
		"\2\u0201\u0202\5h\65\2\u0202\u0213\3\2\2\2\u0203\u0205\5j\66\2\u0204\u0206"+
		"\7\6\2\2\u0205\u0204\3\2\2\2\u0205\u0206\3\2\2\2\u0206\u0207\3\2\2\2\u0207"+
		"\u0208\7\7\2\2\u0208\u0209\5z>\2\u0209\u0213\3\2\2\2\u020a\u020c\5j\66"+
		"\2\u020b\u020d\7\6\2\2\u020c\u020b\3\2\2\2\u020c\u020d\3\2\2\2\u020d\u020e"+
		"\3\2\2\2\u020e\u020f\7\u0084\2\2\u020f\u0210\5j\66\2\u0210\u0213\3\2\2"+
		"\2\u0211\u0213\5j\66\2\u0212\u01f1\3\2\2\2\u0212\u01fa\3\2\2\2\u0212\u0203"+
		"\3\2\2\2\u0212\u020a\3\2\2\2\u0212\u0211\3\2\2\2\u0213i\3\2\2\2\u0214"+
		"\u0217\5l\67\2\u0215\u0216\7\u013b\2\2\u0216\u0218\5l\67\2\u0217\u0215"+
		"\3\2\2\2\u0217\u0218\3\2\2\2\u0218k\3\2\2\2\u0219\u021c\5n8\2\u021a\u021b"+
		"\7\u013c\2\2\u021b\u021d\5n8\2\u021c\u021a\3\2\2\2\u021c\u021d\3\2\2\2"+
		"\u021dm\3\2\2\2\u021e\u0221\5p9\2\u021f\u0220\t\r\2\2\u0220\u0222\5p9"+
		"\2\u0221\u021f\3\2\2\2\u0221\u0222\3\2\2\2\u0222o\3\2\2\2\u0223\u0226"+
		"\5r:\2\u0224\u0225\t\5\2\2\u0225\u0227\5r:\2\u0226\u0224\3\2\2\2\u0226"+
		"\u0227\3\2\2\2\u0227q\3\2\2\2\u0228\u022b\5t;\2\u0229\u022a\t\16\2\2\u022a"+
		"\u022c\5t;\2\u022b\u0229\3\2\2\2\u022b\u022c\3\2\2\2\u022cs\3\2\2\2\u022d"+
		"\u0230\5v<\2\u022e\u022f\t\5\2\2\u022f\u0231\5\u0088E\2\u0230\u022e\3"+
		"\2\2\2\u0230\u0231\3\2\2\2\u0231u\3\2\2\2\u0232\u0233\t\17\2\2\u0233\u0236"+
		"\5z>\2\u0234\u0236\5z>\2\u0235\u0232\3\2\2\2\u0235\u0234\3\2\2\2\u0236"+
		"w\3\2\2\2\u0237\u0238\5z>\2\u0238y\3\2\2\2\u0239\u0244\5\30\r\2\u023a"+
		"\u0244\5\u0084C\2\u023b\u0244\5|?\2\u023c\u0244\5\u0086D\2\u023d\u023e"+
		"\7_\2\2\u023e\u0244\5\u0086D\2\u023f\u0244\5\u00c4c\2\u0240\u0241\7\t"+
		"\2\2\u0241\u0244\5\u00c4c\2\u0242\u0244\5~@\2\u0243\u0239\3\2\2\2\u0243"+
		"\u023a\3\2\2\2\u0243\u023b\3\2\2\2\u0243\u023c\3\2\2\2\u0243\u023d\3\2"+
		"\2\2\u0243\u023f\3\2\2\2\u0243\u0240\3\2\2\2\u0243\u0242\3\2\2\2\u0244"+
		"{\3\2\2\2\u0245\u0252\5\32\16\2\u0246\u024f\7\u0135\2\2\u0247\u024c\5"+
		"\\/\2\u0248\u0249\7\u0132\2\2\u0249\u024b\5\\/\2\u024a\u0248\3\2\2\2\u024b"+
		"\u024e\3\2\2\2\u024c\u024a\3\2\2\2\u024c\u024d\3\2\2\2\u024d\u0250\3\2"+
		"\2\2\u024e\u024c\3\2\2\2\u024f\u0247\3\2\2\2\u024f\u0250\3\2\2\2\u0250"+
		"\u0251\3\2\2\2\u0251\u0253\7\u0134\2\2\u0252\u0246\3\2\2\2\u0252\u0253"+
		"\3\2\2\2\u0253\u0264\3\2\2\2\u0254\u0255\7\u0080\2\2\u0255\u0256\7\u0135"+
		"\2\2\u0256\u0257\5\\/\2\u0257\u0258\7\22\2\2\u0258\u0259\5\n\6\2\u0259"+
		"\u025a\7\u0134\2\2\u025a\u0264\3\2\2\2\u025b\u025c\5$\23\2\u025c\u025e"+
		"\7\u0135\2\2\u025d\u025f\t\20\2\2\u025e\u025d\3\2\2\2\u025e\u025f\3\2"+
		"\2\2\u025f\u0260\3\2\2\2\u0260\u0261\5j\66\2\u0261\u0262\7\u0134\2\2\u0262"+
		"\u0264\3\2\2\2\u0263\u0245\3\2\2\2\u0263\u0254\3\2\2\2\u0263\u025b\3\2"+
		"\2\2\u0264}\3\2\2\2\u0265\u0268\5\u0080A\2\u0266\u0268\5\u0082B\2\u0267"+
		"\u0265\3\2\2\2\u0267\u0266\3\2\2\2\u0268\177\3\2\2\2\u0269\u026f\7\u0099"+
		"\2\2\u026a\u026b\7\u009a\2\2\u026b\u026c\5\\/\2\u026c\u026d\7\u009b\2"+
		"\2\u026d\u026e\5j\66\2\u026e\u0270\3\2\2\2\u026f\u026a\3\2\2\2\u0270\u0271"+
		"\3\2\2\2\u0271\u026f\3\2\2\2\u0271\u0272\3\2\2\2\u0272\u0275\3\2\2\2\u0273"+
		"\u0274\7\u009c\2\2\u0274\u0276\5j\66\2\u0275\u0273\3\2\2\2\u0275\u0276"+
		"\3\2\2\2\u0276\u0277\3\2\2\2\u0277\u0278\7\u009d\2\2\u0278\u0081\3\2\2"+
		"\2\u0279\u027a\7\u0099\2\2\u027a\u0280\5j\66\2\u027b\u027c\7\u009a\2\2"+
		"\u027c\u027d\5j\66\2\u027d\u027e\7\u009b\2\2\u027e\u027f\5j\66\2\u027f"+
		"\u0281\3\2\2\2\u0280\u027b\3\2\2\2\u0281\u0282\3\2\2\2\u0282\u0280\3\2"+
		"\2\2\u0282\u0283\3\2\2\2\u0283\u0286\3\2\2\2\u0284\u0285\7\u009c\2\2\u0285"+
		"\u0287\5j\66\2\u0286\u0284\3\2\2\2\u0286\u0287\3\2\2\2\u0287\u0288\3\2"+
		"\2\2\u0288\u0289\7\u009d\2\2\u0289\u0083\3\2\2\2\u028a\u028b\5&\24\2\u028b"+
		"\u028c\7\u0131\2\2\u028c\u028e\3\2\2\2\u028d\u028a\3\2\2\2\u028d\u028e"+
		"\3\2\2\2\u028e\u028f\3\2\2\2\u028f\u0290\5*\26\2\u0290\u0291\7\u0131\2"+
		"\2\u0291\u0293\3\2\2\2\u0292\u028d\3\2\2\2\u0292\u0293\3\2\2\2\u0293\u0294"+
		"\3\2\2\2\u0294\u0295\5.\30\2\u0295\u0085\3\2\2\2\u0296\u0297\7\u0135\2"+
		"\2\u0297\u029c\5\\/\2\u0298\u0299\7\u0132\2\2\u0299\u029b\5\\/\2\u029a"+
		"\u0298\3\2\2\2\u029b\u029e\3\2\2\2\u029c\u029a\3\2\2\2\u029c\u029d\3\2"+
		"\2\2\u029d\u029f\3\2\2\2\u029e\u029c\3\2\2\2\u029f\u02a0\7\u0134\2\2\u02a0"+
		"\u0087\3\2\2\2\u02a1\u02a2\7\u0105\2\2\u02a2\u02a3\5\\/\2\u02a3\u02a4"+
		"\5\f\7\2\u02a4\u0089\3\2\2\2\u02a5\u02aa\5\u008cG\2\u02a6\u02a7\7\u0132"+
		"\2\2\u02a7\u02a9\5\u008cG\2\u02a8\u02a6\3\2\2\2\u02a9\u02ac\3\2\2\2\u02aa"+
		"\u02a8\3\2\2\2\u02aa\u02ab\3\2\2\2\u02ab\u008b\3\2\2\2\u02ac\u02aa\3\2"+
		"\2\2\u02ad\u02b0\5\u008eH\2\u02ae\u02b0\5\u0094K\2\u02af\u02ad\3\2\2\2"+
		"\u02af\u02ae\3\2\2\2\u02b0\u008d\3\2\2\2\u02b1\u02ba\5\u0090I\2\u02b2"+
		"\u02b4\7\u00c2\2\2\u02b3\u02b2\3\2\2\2\u02b3\u02b4\3\2\2\2\u02b4\u02b5"+
		"\3\2\2\2\u02b5\u02b6\7\32\2\2\u02b6\u02b8\5\u0094K\2\u02b7\u02b9\5\u0096"+
		"L\2\u02b8\u02b7\3\2\2\2\u02b8\u02b9\3\2\2\2\u02b9\u02bb\3\2\2\2\u02ba"+
		"\u02b3\3\2\2\2\u02ba\u02bb\3\2\2\2\u02bb\u008f\3\2\2\2\u02bc\u02c5\5\u0092"+
		"J\2\u02bd\u02bf\t\21\2\2\u02be\u02c0\7\27\2\2\u02bf\u02be\3\2\2\2\u02bf"+
		"\u02c0\3\2\2\2\u02c0\u02c1\3\2\2\2\u02c1\u02c2\7\32\2\2\u02c2\u02c3\5"+
		"\u0092J\2\u02c3\u02c4\5\u0096L\2\u02c4\u02c6\3\2\2\2\u02c5\u02bd\3\2\2"+
		"\2\u02c5\u02c6\3\2\2\2\u02c6\u0091\3\2\2\2\u02c7\u02d0\5\u0094K\2\u02c8"+
		"\u02ca\t\21\2\2\u02c9\u02cb\7\27\2\2\u02ca\u02c9\3\2\2\2\u02ca\u02cb\3"+
		"\2\2\2\u02cb\u02cd\3\2\2\2\u02cc\u02c8\3\2\2\2\u02cc\u02cd\3\2\2\2\u02cd"+
		"\u02ce\3\2\2\2\u02ce\u02cf\7\32\2\2\u02cf\u02d1\5\u0094K\2\u02d0\u02cc"+
		"\3\2\2\2\u02d0\u02d1\3\2\2\2\u02d1\u0093\3\2\2\2\u02d2\u02d4\5\u00c6d"+
		"\2\u02d3\u02d5\5L\'\2\u02d4\u02d3\3\2\2\2\u02d4\u02d5\3\2\2\2\u02d5\u02df"+
		"\3\2\2\2\u02d6\u02d7\5\u00c4c\2\u02d7\u02d8\5L\'\2\u02d8\u02df\3\2\2\2"+
		"\u02d9\u02da\7\u0135\2\2\u02da\u02db\5\u008aF\2\u02db\u02dc\7\u0134\2"+
		"\2\u02dc\u02df\3\2\2\2\u02dd\u02df\7\u0148\2\2\u02de\u02d2\3\2\2\2\u02de"+
		"\u02d6\3\2\2\2\u02de\u02d9\3\2\2\2\u02de\u02dd\3\2\2\2\u02df\u0095\3\2"+
		"\2\2\u02e0\u02e1\7\36\2\2\u02e1\u02e2\5\\/\2\u02e2\u0097\3\2\2\2\u02e3"+
		"\u02e8\5\u009cO\2\u02e4\u02e5\7\u0132\2\2\u02e5\u02e7\5\u009cO\2\u02e6"+
		"\u02e4\3\2\2\2\u02e7\u02ea\3\2\2\2\u02e8\u02e6\3\2\2\2\u02e8\u02e9\3\2"+
		"\2\2\u02e9\u0099\3\2\2\2\u02ea\u02e8\3\2\2\2\u02eb\u02f4\t\22\2\2\u02ec"+
		"\u02f2\7\u00d8\2\2\u02ed\u02f3\7\32\2\2\u02ee\u02ef\7\f\2\2\u02ef\u02f3"+
		"\7\16\2\2\u02f0\u02f1\7\r\2\2\u02f1\u02f3\7\16\2\2\u02f2\u02ed\3\2\2\2"+
		"\u02f2\u02ee\3\2\2\2\u02f2\u02f0\3\2\2\2\u02f3\u02f5\3\2\2\2\u02f4\u02ec"+
		"\3\2\2\2\u02f4\u02f5\3\2\2\2\u02f5\u009b\3\2\2\2\u02f6\u02f7\7\u00ce\2"+
		"\2\u02f7\u02f8\5\u009aN\2\u02f8\u02fa\7\u0135\2\2\u02f9\u02fb\5\u009e"+
		"P\2\u02fa\u02f9\3\2\2\2\u02fa\u02fb\3\2\2\2\u02fb\u02fc\3\2\2\2\u02fc"+
		"\u02fd\7\u0134\2\2\u02fd\u0305\3\2\2\2\u02fe\u02ff\7D\2\2\u02ff\u0300"+
		"\5\u009aN\2\u0300\u0301\7\u0135\2\2\u0301\u0302\5\u009eP\2\u0302\u0303"+
		"\7\u0134\2\2\u0303\u0305\3\2\2\2\u0304\u02f6\3\2\2\2\u0304\u02fe\3\2\2"+
		"\2\u0305\u009d\3\2\2\2\u0306\u030b\5\64\33\2\u0307\u0308\7\u0132\2\2\u0308"+
		"\u030a\5\64\33\2\u0309\u0307\3\2\2\2\u030a\u030d\3\2\2\2\u030b\u0309\3"+
		"\2\2\2\u030b\u030c\3\2\2\2\u030c\u009f\3\2\2\2\u030d\u030b\3\2\2\2\u030e"+
		"\u030f\7\37\2\2\u030f\u0310\7\u0135\2\2\u0310\u0311\5\u00a2R\2\u0311\u0312"+
		"\7\u0134\2\2\u0312\u00a1\3\2\2\2\u0313\u0318\5\66\34\2\u0314\u0315\7\u0132"+
		"\2\2\u0315\u0317\5\66\34\2\u0316\u0314\3\2\2\2\u0317\u031a\3\2\2\2\u0318"+
		"\u0316\3\2\2\2\u0318\u0319\3\2\2\2\u0319\u00a3\3\2\2\2\u031a\u0318\3\2"+
		"\2\2\u031b\u031e\5\u00a6T\2\u031c\u031e\5\u00a8U\2\u031d\u031b\3\2\2\2"+
		"\u031d\u031c\3\2\2\2\u031e\u0320\3\2\2\2\u031f\u0321\7\u012f\2\2\u0320"+
		"\u031f\3\2\2\2\u0320\u0321\3\2\2\2\u0321\u00a5\3\2\2\2\u0322\u0326\5\u00aa"+
		"V\2\u0323\u0326\5\u00caf\2\u0324\u0326\5\u0128\u0095\2\u0325\u0322\3\2"+
		"\2\2\u0325\u0323\3\2\2\2\u0325\u0324\3\2\2\2\u0326\u00a7\3\2\2\2\u0327"+
		"\u0337\5\u00dan\2\u0328\u0337\5\u00dco\2\u0329\u0337\5\u0114\u008b\2\u032a"+
		"\u0337\5\u0116\u008c\2\u032b\u0337\5\u0118\u008d\2\u032c\u0337\5\u011c"+
		"\u008f\2\u032d\u0337\5\u011e\u0090\2\u032e\u0337\5\u0122\u0092\2\u032f"+
		"\u0337\5\u00dep\2\u0330\u0337\5\u00fa~\2\u0331\u0337\5\u0108\u0085\2\u0332"+
		"\u0337\5\u010a\u0086\2\u0333\u0337\5\u010e\u0088\2\u0334\u0337\5\u0112"+
		"\u008a\2\u0335\u0337\5\u0124\u0093\2\u0336\u0327\3\2\2\2\u0336\u0328\3"+
		"\2\2\2\u0336\u0329\3\2\2\2\u0336\u032a\3\2\2\2\u0336\u032b\3\2\2\2\u0336"+
		"\u032c\3\2\2\2\u0336\u032d\3\2\2\2\u0336\u032e\3\2\2\2\u0336\u032f\3\2"+
		"\2\2\u0336\u0330\3\2\2\2\u0336\u0331\3\2\2\2\u0336\u0332\3\2\2\2\u0336"+
		"\u0333\3\2\2\2\u0336\u0334\3\2\2\2\u0336\u0335\3\2\2\2\u0337\u00a9\3\2"+
		"\2\2\u0338\u0340\5\u00acW\2\u0339\u033b\7\62\2\2\u033a\u033c\t\23\2\2"+
		"\u033b\u033a\3\2\2\2\u033b\u033c\3\2\2\2\u033c\u033d\3\2\2\2\u033d\u033f"+
		"\5\u00acW\2\u033e\u0339\3\2\2\2\u033f\u0342\3\2\2\2\u0340\u033e\3\2\2"+
		"\2\u0340\u0341\3\2\2\2\u0341\u00ab\3\2\2\2\u0342\u0340\3\2\2\2\u0343\u0345"+
		"\7\23\2\2\u0344\u0346\t\23\2\2\u0345\u0344\3\2\2\2\u0345\u0346\3\2\2\2"+
		"\u0346\u0347\3\2\2\2\u0347\u0353\5\u00c0a\2\u0348\u0349\7\21\2\2\u0349"+
		"\u034b\5\u008aF\2\u034a\u034c\5\u00aeX\2\u034b\u034a\3\2\2\2\u034b\u034c"+
		"\3\2\2\2\u034c\u034e\3\2\2\2\u034d\u034f\5\u00b0Y\2\u034e\u034d\3\2\2"+
		"\2\u034e\u034f\3\2\2\2\u034f\u0351\3\2\2\2\u0350\u0352\5\u00b4[\2\u0351"+
		"\u0350\3\2\2\2\u0351\u0352\3\2\2\2\u0352\u0354\3\2\2\2\u0353\u0348\3\2"+
		"\2\2\u0353\u0354\3\2\2\2\u0354\u0356\3\2\2\2\u0355\u0357\5\u00b6\\\2\u0356"+
		"\u0355\3\2\2\2\u0356\u0357\3\2\2\2\u0357\u0359\3\2\2\2\u0358\u035a\5\u00ba"+
		"^\2\u0359\u0358\3\2\2\2\u0359\u035a\3\2\2\2\u035a\u00ad\3\2\2\2\u035b"+
		"\u035c\7\20\2\2\u035c\u035d\5\\/\2\u035d\u00af\3\2\2\2\u035e\u035f\7\r"+
		"\2\2\u035f\u0360\7\16\2\2\u0360\u0365\5\u00b2Z\2\u0361\u0362\7\u0132\2"+
		"\2\u0362\u0364\5\u00b2Z\2\u0363\u0361\3\2\2\2\u0364\u0367\3\2\2\2\u0365"+
		"\u0363\3\2\2\2\u0365\u0366\3\2\2\2\u0366\u036a\3\2\2\2\u0367\u0365\3\2"+
		"\2\2\u0368\u0369\7\u008f\2\2\u0369\u036b\7\u00d5\2\2\u036a\u0368\3\2\2"+
		"\2\u036a\u036b\3\2\2\2\u036b\u00b1\3\2\2\2\u036c\u0370\5\u0084C\2\u036d"+
		"\u0370\7\u0141\2\2\u036e\u0370\5j\66\2\u036f\u036c\3\2\2\2\u036f\u036d"+
		"\3\2\2\2\u036f\u036e\3\2\2\2\u0370\u00b3\3\2\2\2\u0371\u0372\7\17\2\2"+
		"\u0372\u0373\5\\/\2\u0373\u00b5\3\2\2\2\u0374\u0375\7\f\2\2\u0375\u0376"+
		"\7\16\2\2\u0376\u037b\5\u00b8]\2\u0377\u0378\7\u0132\2\2\u0378\u037a\5"+
		"\u00b8]\2\u0379\u0377\3\2\2\2\u037a\u037d\3\2\2\2\u037b\u0379\3\2\2\2"+
		"\u037b\u037c\3\2\2\2\u037c\u00b7\3\2\2\2\u037d\u037b\3\2\2\2\u037e\u0380"+
		"\5\u00b2Z\2\u037f\u0381\t\24\2\2\u0380\u037f\3\2\2\2\u0380\u0381\3\2\2"+
		"\2\u0381\u00b9\3\2\2\2\u0382\u0386\7\u0093\2\2\u0383\u0384\5\u00bc_\2"+
		"\u0384\u0385\7\u0132\2\2\u0385\u0387\3\2\2\2\u0386\u0383\3\2\2\2\u0386"+
		"\u0387\3\2\2\2\u0387\u0388\3\2\2\2\u0388\u0389\5\u00be`\2\u0389\u00bb"+
		"\3\2\2\2\u038a\u038b\7\u0141\2\2\u038b\u00bd\3\2\2\2\u038c\u038d\7\u0141"+
		"\2\2\u038d\u00bf\3\2\2\2\u038e\u0393\5\u00c8e\2\u038f\u0390\7\u0132\2"+
		"\2\u0390\u0392\5\u00c8e\2\u0391\u038f\3\2\2\2\u0392\u0395\3\2\2\2\u0393"+
		"\u0391\3\2\2\2\u0393\u0394\3\2\2\2\u0394\u0398\3\2\2\2\u0395\u0393\3\2"+
		"\2\2\u0396\u0398\7\u0133\2\2\u0397\u038e\3\2\2\2\u0397\u0396\3\2\2\2\u0398"+
		"\u00c1\3\2\2\2\u0399\u039a\7\u0135\2\2\u039a\u039f\5\u0084C\2\u039b\u039c"+
		"\7\u0132\2\2\u039c\u039e\5\u0084C\2\u039d\u039b\3\2\2\2\u039e\u03a1\3"+
		"\2\2\2\u039f\u039d\3\2\2\2\u039f\u03a0\3\2\2\2\u03a0\u03a2\3\2\2\2\u03a1"+
		"\u039f\3\2\2\2\u03a2\u03a3\7\u0134\2\2\u03a3\u00c3\3\2\2\2\u03a4\u03a5"+
		"\7\u0135\2\2\u03a5\u03a6\5\u00aaV\2\u03a6\u03a7\7\u0134\2\2\u03a7\u00c5"+
		"\3\2\2\2\u03a8\u03a9\5&\24\2\u03a9\u03aa\7\u0131\2\2\u03aa\u03ac\3\2\2"+
		"\2\u03ab\u03a8\3\2\2\2\u03ab\u03ac\3\2\2\2\u03ac\u03ad\3\2\2\2\u03ad\u03ae"+
		"\5*\26\2\u03ae\u00c7\3\2\2\2\u03af\u03b0\5\u00c6d\2\u03b0\u03b1\7\u0131"+
		"\2\2\u03b1\u03b2\7\u0133\2\2\u03b2\u03bc\3\2\2\2\u03b3\u03b5\5\u0084C"+
		"\2\u03b4\u03b6\5L\'\2\u03b5\u03b4\3\2\2\2\u03b5\u03b6\3\2\2\2\u03b6\u03bc"+
		"\3\2\2\2\u03b7\u03b9\5j\66\2\u03b8\u03ba\5L\'\2\u03b9\u03b8\3\2\2\2\u03b9"+
		"\u03ba\3\2\2\2\u03ba\u03bc\3\2\2\2\u03bb\u03af\3\2\2\2\u03bb\u03b3\3\2"+
		"\2\2\u03bb\u03b7\3\2\2\2\u03bc\u00c9\3\2\2\2\u03bd\u03be\5\u00d0i\2\u03be"+
		"\u00cb\3\2\2\2\u03bf\u03c1\7\25\2\2\u03c0\u03c2\t\25\2\2\u03c1\u03c0\3"+
		"\2\2\2\u03c1\u03c2\3\2\2\2\u03c2\u03c4\3\2\2\2\u03c3\u03c5\7D\2\2\u03c4"+
		"\u03c3\3\2\2\2\u03c4\u03c5\3\2\2\2\u03c5\u03c7\3\2\2\2\u03c6\u03c8\7]"+
		"\2\2\u03c7\u03c6\3\2\2\2\u03c7\u03c8\3\2\2\2\u03c8\u03c9\3\2\2\2\u03c9"+
		"\u03cb\5\u00c6d\2\u03ca\u03cc\5\u00a0Q\2\u03cb\u03ca\3\2\2\2\u03cb\u03cc"+
		"\3\2\2\2\u03cc\u00cd\3\2\2\2\u03cd\u03ce\7\36\2\2\u03ce\u03cf\7\u0117"+
		"\2\2\u03cf\u03d0\7i\2\2\u03d0\u03d1\7\u00d1\2\2\u03d1\u03d2\5\u0084C\2"+
		"\u03d2\u03d3\7\u0127\2\2\u03d3\u03db\5\\/\2\u03d4\u03d5\7\u0132\2\2\u03d5"+
		"\u03d6\5\u0084C\2\u03d6\u03d7\7\u0127\2\2\u03d7\u03d8\5\\/\2\u03d8\u03da"+
		"\3\2\2\2\u03d9\u03d4\3\2\2\2\u03da\u03dd\3\2\2\2\u03db\u03d9\3\2\2\2\u03db"+
		"\u03dc\3\2\2\2\u03dc\u00cf\3\2\2\2\u03dd\u03db\3\2\2\2\u03de\u03e0\5\u00cc"+
		"g\2\u03df\u03e1\5\u00c2b\2\u03e0\u03df\3\2\2\2\u03e0\u03e1\3\2\2\2\u03e1"+
		"\u03e4\3\2\2\2\u03e2\u03e5\5\u00acW\2\u03e3\u03e5\5\u00d2j\2\u03e4\u03e2"+
		"\3\2\2\2\u03e4\u03e3\3\2\2\2\u03e5\u03e7\3\2\2\2\u03e6\u03e8\5\u00ceh"+
		"\2\u03e7\u03e6\3\2\2\2\u03e7\u03e8\3\2\2\2\u03e8\u00d1\3\2\2\2\u03e9\u03ea"+
		"\t\26\2\2\u03ea\u03ef\5\u00d4k\2\u03eb\u03ec\7\u0132\2\2\u03ec\u03ee\5"+
		"\u00d4k\2\u03ed\u03eb\3\2\2\2\u03ee\u03f1\3\2\2\2\u03ef\u03ed\3\2\2\2"+
		"\u03ef\u03f0\3\2\2\2\u03f0\u00d3\3\2\2\2\u03f1\u03ef\3\2\2\2\u03f2\u03f5"+
		"\7\u0135\2\2\u03f3\u03f6\5j\66\2\u03f4\u03f6\7w\2\2\u03f5\u03f3\3\2\2"+
		"\2\u03f5\u03f4\3\2\2\2\u03f6\u03fe\3\2\2\2\u03f7\u03fa\7\u0132\2\2\u03f8"+
		"\u03fb\5j\66\2\u03f9\u03fb\7w\2\2\u03fa\u03f8\3\2\2\2\u03fa\u03f9\3\2"+
		"\2\2\u03fb\u03fd\3\2\2\2\u03fc\u03f7\3\2\2\2\u03fd\u0400\3\2\2\2\u03fe"+
		"\u03fc\3\2\2\2\u03fe\u03ff\3\2\2\2\u03ff\u0401\3\2\2\2\u0400\u03fe\3\2"+
		"\2\2\u0401\u0402\7\u0134\2\2\u0402\u00d5\3\2\2\2\u0403\u0404\7\u0094\2"+
		"\2\u0404\u0409\5\u00d8m\2\u0405\u0406\7\u0132\2\2\u0406\u0408\5\u00d8"+
		"m\2\u0407\u0405\3\2\2\2\u0408\u040b\3\2\2\2\u0409\u0407\3\2\2\2\u0409"+
		"\u040a\3\2\2\2\u040a\u00d7\3\2\2\2\u040b\u0409\3\2\2\2\u040c\u040d\5\u0084"+
		"C\2\u040d\u0410\7\u0127\2\2\u040e\u0411\5\\/\2\u040f\u0411\7w\2\2\u0410"+
		"\u040e\3\2\2\2\u0410\u040f\3\2\2\2\u0411\u00d9\3\2\2\2\u0412\u0413\7:"+
		"\2\2\u0413\u0417\t\27\2\2\u0414\u0415\7\b\2\2\u0415\u0416\7\6\2\2\u0416"+
		"\u0418\7\t\2\2\u0417\u0414\3\2\2\2\u0417\u0418\3\2\2\2\u0418\u0419\3\2"+
		"\2\2\u0419\u041a\5&\24\2\u041a\u00db\3\2\2\2\u041b\u041c\7B\2\2\u041c"+
		"\u041f\t\27\2\2\u041d\u041e\7\b\2\2\u041e\u0420\7\t\2\2\u041f\u041d\3"+
		"\2\2\2\u041f\u0420\3\2\2\2\u0420\u0421\3\2\2\2\u0421\u0422\5&\24\2\u0422"+
		"\u00dd\3\2\2\2\u0423\u0427\5\u00e0q\2\u0424\u0427\5\u00e2r\2\u0425\u0427"+
		"\5\u00e4s\2\u0426\u0423\3\2\2\2\u0426\u0424\3\2\2\2\u0426\u0425\3\2\2"+
		"\2\u0427\u00df\3\2\2\2\u0428\u042a\7:\2\2\u0429\u042b\7\u0085\2\2\u042a"+
		"\u0429\3\2\2\2\u042a\u042b\3\2\2\2\u042b\u042d\3\2\2\2\u042c\u042e\7;"+
		"\2\2\u042d\u042c\3\2\2\2\u042d\u042e\3\2\2\2\u042e\u042f\3\2\2\2\u042f"+
		"\u0433\7!\2\2\u0430\u0431\7\b\2\2\u0431\u0432\7\6\2\2\u0432\u0434\7\t"+
		"\2\2\u0433\u0430\3\2\2\2\u0433\u0434\3\2\2\2\u0434\u0438\3\2\2\2\u0435"+
		"\u0436\5(\25\2\u0436\u0437\7\u0131\2\2\u0437\u0439\3\2\2\2\u0438\u0435"+
		"\3\2\2\2\u0438\u0439\3\2\2\2\u0439\u043a\3\2\2\2\u043a\u043b\5*\26\2\u043b"+
		"\u043c\7\u0135\2\2\u043c\u0441\5\u00e6t\2\u043d\u043e\7\u0132\2\2\u043e"+
		"\u0440\5\u00e6t\2\u043f\u043d\3\2\2\2\u0440\u0443\3\2\2\2\u0441\u043f"+
		"\3\2\2\2\u0441\u0442\3\2\2\2\u0442\u0444\3\2\2\2\u0443\u0441\3\2\2\2\u0444"+
		"\u0447\7\u0134\2\2\u0445\u0446\7\22\2\2\u0446\u0448\5\u00aaV\2\u0447\u0445"+
		"\3\2\2\2\u0447\u0448\3\2\2\2\u0448\u00e1\3\2\2\2\u0449\u044b\7:\2\2\u044a"+
		"\u044c\7\u0085\2\2\u044b\u044a\3\2\2\2\u044b\u044c\3\2\2\2\u044c\u044e"+
		"\3\2\2\2\u044d\u044f\7;\2\2\u044e\u044d\3\2\2\2\u044e\u044f\3\2\2\2\u044f"+
		"\u0450\3\2\2\2\u0450\u0454\7!\2\2\u0451\u0452\7\b\2\2\u0452\u0453\7\6"+
		"\2\2\u0453\u0455\7\t\2\2\u0454\u0451\3\2\2\2\u0454\u0455\3\2\2\2\u0455"+
		"\u0456\3\2\2\2\u0456\u0457\5*\26\2\u0457\u0458\7\22\2\2\u0458\u0459\5"+
		"\u00aaV\2\u0459\u00e3\3\2\2\2\u045a\u045c\7:\2\2\u045b\u045d\7\u0085\2"+
		"\2\u045c\u045b\3\2\2\2\u045c\u045d\3\2\2\2\u045d\u045f\3\2\2\2\u045e\u0460"+
		"\7;\2\2\u045f\u045e\3\2\2\2\u045f\u0460\3\2\2\2\u0460\u0461\3\2\2\2\u0461"+
		"\u0465\7!\2\2\u0462\u0463\7\b\2\2\u0463\u0464\7\6\2\2\u0464\u0466\7\t"+
		"\2\2\u0465\u0462\3\2\2\2\u0465\u0466\3\2\2\2\u0466\u0467\3\2\2\2\u0467"+
		"\u046f\5*\26\2\u0468\u0469\7\7\2\2\u0469\u0470\5*\26\2\u046a\u046b\7\u0135"+
		"\2\2\u046b\u046c\7\7\2\2\u046c\u046d\5*\26\2\u046d\u046e\7\u0134\2\2\u046e"+
		"\u0470\3\2\2\2\u046f\u0468\3\2\2\2\u046f\u046a\3\2\2\2\u0470\u00e5\3\2"+
		"\2\2\u0471\u0472\5.\30\2\u0472\u0473\5\u00e8u\2\u0473\u048c\3\2\2\2\u0474"+
		"\u0476\t\22\2\2\u0475\u0477\5\64\33\2\u0476\u0475\3\2\2\2\u0476\u0477"+
		"\3\2\2\2\u0477\u0479\3\2\2\2\u0478\u047a\5\u0100\u0081\2\u0479\u0478\3"+
		"\2\2\2\u0479\u047a\3\2\2\2\u047a\u047b\3\2\2\2\u047b\u047c\7\u0135\2\2"+
		"\u047c\u0481\5\u00eex\2\u047d\u047e\7\u0132\2\2\u047e\u0480\5\u00eex\2"+
		"\u047f\u047d\3\2\2\2\u0480\u0483\3\2\2\2\u0481\u047f\3\2\2\2\u0481\u0482"+
		"\3\2\2\2\u0482\u0484\3\2\2\2\u0483\u0481\3\2\2\2\u0484\u0488\7\u0134\2"+
		"\2\u0485\u0487\5\u0102\u0082\2\u0486\u0485\3\2\2\2\u0487\u048a\3\2\2\2"+
		"\u0488\u0486\3\2\2\2\u0488\u0489\3\2\2\2\u0489\u048c\3\2\2\2\u048a\u0488"+
		"\3\2\2\2\u048b\u0471\3\2\2\2\u048b\u0474\3\2\2\2\u048c\u00e7\3\2\2\2\u048d"+
		"\u0490\5\u00ecw\2\u048e\u048f\7G\2\2\u048f\u0491\7\u0147\2\2\u0490\u048e"+
		"\3\2\2\2\u0490\u0491\3\2\2\2\u0491\u0493\3\2\2\2\u0492\u0494\5\u00f0y"+
		"\2\u0493\u0492\3\2\2\2\u0493\u0494\3\2\2\2\u0494\u00e9\3\2\2\2\u0495\u0496"+
		"\7\6\2\2\u0496\u0499\79\2\2\u0497\u0499\79\2\2\u0498\u0495\3\2\2\2\u0498"+
		"\u0497\3\2\2\2\u0499\u00eb\3\2\2\2\u049a\u049f\7I\2\2\u049b\u049c\7\u0135"+
		"\2\2\u049c\u049d\5\u00f4{\2\u049d\u049e\7\u0134\2\2\u049e\u04a0\3\2\2"+
		"\2\u049f\u049b\3\2\2\2\u049f\u04a0\3\2\2\2\u04a0\u04a2\3\2\2\2\u04a1\u04a3"+
		"\7\u00b7\2\2\u04a2\u04a1\3\2\2\2\u04a2\u04a3\3\2\2\2\u04a3\u04a5\3\2\2"+
		"\2\u04a4\u04a6\5\u00eav\2\u04a5\u04a4\3\2\2\2\u04a5\u04a6\3\2\2\2\u04a6"+
		"\u04a9\3\2\2\2\u04a7\u04a8\7w\2\2\u04a8\u04aa\5\20\t\2\u04a9\u04a7\3\2"+
		"\2\2\u04a9\u04aa\3\2\2\2\u04aa\u0553\3\2\2\2\u04ab\u04b0\7J\2\2\u04ac"+
		"\u04ad\7\u0135\2\2\u04ad\u04ae\5\u00f4{\2\u04ae\u04af\7\u0134\2\2\u04af"+
		"\u04b1\3\2\2\2\u04b0\u04ac\3\2\2\2\u04b0\u04b1\3\2\2\2\u04b1\u04b3\3\2"+
		"\2\2\u04b2\u04b4\7\u00b7\2\2\u04b3\u04b2\3\2\2\2\u04b3\u04b4\3\2\2\2\u04b4"+
		"\u04b6\3\2\2\2\u04b5\u04b7\5\u00eav\2\u04b6\u04b5\3\2\2\2\u04b6\u04b7"+
		"\3\2\2\2\u04b7\u04ba\3\2\2\2\u04b8\u04b9\7w\2\2\u04b9\u04bb\5\20\t\2\u04ba"+
		"\u04b8\3\2\2\2\u04ba\u04bb\3\2\2\2\u04bb\u0553\3\2\2\2\u04bc\u04c1\7K"+
		"\2\2\u04bd\u04be\7\u0135\2\2\u04be\u04bf\5\u00f4{\2\u04bf\u04c0\7\u0134"+
		"\2\2\u04c0\u04c2\3\2\2\2\u04c1\u04bd\3\2\2\2\u04c1\u04c2\3\2\2\2\u04c2"+
		"\u04c4\3\2\2\2\u04c3\u04c5\7\u00b7\2\2\u04c4\u04c3\3\2\2\2\u04c4\u04c5"+
		"\3\2\2\2\u04c5\u04c7\3\2\2\2\u04c6\u04c8\5\u00eav\2\u04c7\u04c6\3\2\2"+
		"\2\u04c7\u04c8\3\2\2\2\u04c8\u04cb\3\2\2\2\u04c9\u04ca\7w\2\2\u04ca\u04cc"+
		"\5\20\t\2\u04cb\u04c9\3\2\2\2\u04cb\u04cc\3\2\2\2\u04cc\u0553\3\2\2\2"+
		"\u04cd\u04d2\7L\2\2\u04ce\u04cf\7\u0135\2\2\u04cf\u04d0\5\u00f4{\2\u04d0"+
		"\u04d1\7\u0134\2\2\u04d1\u04d3\3\2\2\2\u04d2\u04ce\3\2\2\2\u04d2\u04d3"+
		"\3\2\2\2\u04d3\u04d5\3\2\2\2\u04d4\u04d6\7\u00b7\2\2\u04d5\u04d4\3\2\2"+
		"\2\u04d5\u04d6\3\2\2\2\u04d6\u04d8\3\2\2\2\u04d7\u04d9\5\u00eav\2\u04d8"+
		"\u04d7\3\2\2\2\u04d8\u04d9\3\2\2\2\u04d9\u04dc\3\2\2\2\u04da\u04db\7w"+
		"\2\2\u04db\u04dd\5\20\t\2\u04dc\u04da\3\2\2\2\u04dc\u04dd\3\2\2\2\u04dd"+
		"\u0553\3\2\2\2\u04de\u04e5\7N\2\2\u04df\u04e0\7\u0135\2\2\u04e0\u04e1"+
		"\5\u00f4{\2\u04e1\u04e2\7\u0132\2\2\u04e2\u04e3\5\20\t\2\u04e3\u04e4\7"+
		"\u0134\2\2\u04e4\u04e6\3\2\2\2\u04e5\u04df\3\2\2\2\u04e5\u04e6\3\2\2\2"+
		"\u04e6\u04e8\3\2\2\2\u04e7\u04e9\7\u00b7\2\2\u04e8\u04e7\3\2\2\2\u04e8"+
		"\u04e9\3\2\2\2\u04e9\u04eb\3\2\2\2\u04ea\u04ec\5\u00eav\2\u04eb\u04ea"+
		"\3\2\2\2\u04eb\u04ec\3\2\2\2\u04ec\u04ef\3\2\2\2\u04ed\u04ee\7w\2\2\u04ee"+
		"\u04f0\5\20\t\2\u04ef\u04ed\3\2\2\2\u04ef\u04f0\3\2\2\2\u04f0\u0553\3"+
		"\2\2\2\u04f1\u04f8\7M\2\2\u04f2\u04f3\7\u0135\2\2\u04f3\u04f4\5\u00f4"+
		"{\2\u04f4\u04f5\7\u0132\2\2\u04f5\u04f6\5\20\t\2\u04f6\u04f7\7\u0134\2"+
		"\2\u04f7\u04f9\3\2\2\2\u04f8\u04f2\3\2\2\2\u04f8\u04f9\3\2\2\2\u04f9\u04fb"+
		"\3\2\2\2\u04fa\u04fc\7\u00b7\2\2\u04fb\u04fa\3\2\2\2\u04fb\u04fc\3\2\2"+
		"\2\u04fc\u04fe\3\2\2\2\u04fd\u04ff\5\u00eav\2\u04fe\u04fd\3\2\2\2\u04fe"+
		"\u04ff\3\2\2\2\u04ff\u0502\3\2\2\2\u0500\u0501\7w\2\2\u0501\u0503\5\20"+
		"\t\2\u0502\u0500\3\2\2\2\u0502\u0503\3\2\2\2\u0503\u0553\3\2\2\2\u0504"+
		"\u050d\7R\2\2\u0505\u0506\7\u0135\2\2\u0506\u0509\5\u00f4{\2\u0507\u0508"+
		"\7\u0132\2\2\u0508\u050a\5\20\t\2\u0509\u0507\3\2\2\2\u0509\u050a\3\2"+
		"\2\2\u050a\u050b\3\2\2\2\u050b\u050c\7\u0134\2\2\u050c\u050e\3\2\2\2\u050d"+
		"\u0505\3\2\2\2\u050d\u050e\3\2\2\2\u050e\u0510\3\2\2\2\u050f\u0511\7\u00b7"+
		"\2\2\u0510\u050f\3\2\2\2\u0510\u0511\3\2\2\2\u0511\u0513\3\2\2\2\u0512"+
		"\u0514\5\u00eav\2\u0513\u0512\3\2\2\2\u0513\u0514\3\2\2\2\u0514\u0517"+
		"\3\2\2\2\u0515\u0516\7w\2\2\u0516\u0518\5\20\t\2\u0517\u0515\3\2\2\2\u0517"+
		"\u0518\3\2\2\2\u0518\u0553\3\2\2\2\u0519\u051b\7O\2\2\u051a\u051c\5\u00ea"+
		"v\2\u051b\u051a\3\2\2\2\u051b\u051c\3\2\2\2\u051c\u051f\3\2\2\2\u051d"+
		"\u051e\7w\2\2\u051e\u0520\7\u0147\2\2\u051f\u051d\3\2\2\2\u051f\u0520"+
		"\3\2\2\2\u0520\u0553\3\2\2\2\u0521\u0523\7Q\2\2\u0522\u0524\5\u00eav\2"+
		"\u0523\u0522\3\2\2\2\u0523\u0524\3\2\2\2\u0524\u0527\3\2\2\2\u0525\u0526"+
		"\7w\2\2\u0526\u0528\7\u0147\2\2\u0527\u0525\3\2\2\2\u0527\u0528\3\2\2"+
		"\2\u0528\u0553\3\2\2\2\u0529\u052b\7P\2\2\u052a\u052c\5\u00eav\2\u052b"+
		"\u052a\3\2\2\2\u052b\u052c\3\2\2\2\u052c\u052f\3\2\2\2\u052d\u052e\7w"+
		"\2\2\u052e\u0530\7\u0147\2\2\u052f\u052d\3\2\2\2\u052f\u0530\3\2\2\2\u0530"+
		"\u0553\3\2\2\2\u0531\u0532\7T\2\2\u0532\u0533\7\u0135\2\2\u0533\u0534"+
		"\5\u00f6|\2\u0534\u0536\7\u0134\2\2\u0535\u0537\5\u00eav\2\u0536\u0535"+
		"\3\2\2\2\u0536\u0537\3\2\2\2\u0537\u053a\3\2\2\2\u0538\u0539\7w\2\2\u0539"+
		"\u053b\7\u0147\2\2\u053a\u0538\3\2\2\2\u053a\u053b\3\2\2\2\u053b\u0553"+
		"\3\2\2\2\u053c\u0541\7\u00c1\2\2\u053d\u053e\7\u0135\2\2\u053e\u053f\5"+
		"\u00f8}\2\u053f\u0540\7\u0134\2\2\u0540\u0542\3\2\2\2\u0541\u053d\3\2"+
		"\2\2\u0541\u0542\3\2\2\2\u0542\u0544\3\2\2\2\u0543\u0545\5\u00eav\2\u0544"+
		"\u0543\3\2\2\2\u0544\u0545\3\2\2\2\u0545\u0548\3\2\2\2\u0546\u0547\7w"+
		"\2\2\u0547\u0549\7\u0147\2\2\u0548\u0546\3\2\2\2\u0548\u0549\3\2\2\2\u0549"+
		"\u0553\3\2\2\2\u054a\u054c\7H\2\2\u054b\u054d\5\u00eav\2\u054c\u054b\3"+
		"\2\2\2\u054c\u054d\3\2\2\2\u054d\u0550\3\2\2\2\u054e\u054f\7w\2\2\u054f"+
		"\u0551\7\u0147\2\2\u0550\u054e\3\2\2\2\u0550\u0551\3\2\2\2\u0551\u0553"+
		"\3\2\2\2\u0552\u049a\3\2\2\2\u0552\u04ab\3\2\2\2\u0552\u04bc\3\2\2\2\u0552"+
		"\u04cd\3\2\2\2\u0552\u04de\3\2\2\2\u0552\u04f1\3\2\2\2\u0552\u0504\3\2"+
		"\2\2\u0552\u0519\3\2\2\2\u0552\u0521\3\2\2\2\u0552\u0529\3\2\2\2\u0552"+
		"\u0531\3\2\2\2\u0552\u053c\3\2\2\2\u0552\u054a\3\2\2\2\u0553\u00ed\3\2"+
		"\2\2\u0554\u0558\5.\30\2\u0555\u0556\7\u0135\2\2\u0556\u0557\7\u0141\2"+
		"\2\u0557\u0559\7\u0134\2\2\u0558\u0555\3\2\2\2\u0558\u0559\3\2\2\2\u0559"+
		"\u055b\3\2\2\2\u055a\u055c\t\24\2\2\u055b\u055a\3\2\2\2\u055b\u055c\3"+
		"\2\2\2\u055c\u00ef\3\2\2\2\u055d\u055e\7\u0120\2\2\u055e\u055f\5*\26\2"+
		"\u055f\u0560\7\u0135\2\2\u0560\u0565\5\u00eex\2\u0561\u0562\7\u0132\2"+
		"\2\u0562\u0564\5\u00eex\2\u0563\u0561\3\2\2\2\u0564\u0567\3\2\2\2\u0565"+
		"\u0563\3\2\2\2\u0565\u0566\3\2\2\2\u0566\u0568\3\2\2\2\u0567\u0565\3\2"+
		"\2\2\u0568\u056c\7\u0134\2\2\u0569\u056a\7\36\2\2\u056a\u056b\7\u00a3"+
		"\2\2\u056b\u056d\5\u00f2z\2\u056c\u0569\3\2\2\2\u056c\u056d\3\2\2\2\u056d"+
		"\u0571\3\2\2\2\u056e\u056f\7\36\2\2\u056f\u0570\7\u00d1\2\2\u0570\u0572"+
		"\5\u00f2z\2\u0571\u056e\3\2\2\2\u0571\u0572\3\2\2\2\u0572\u00f1\3\2\2"+
		"\2\u0573\u0578\7\u00d2\2\2\u0574\u0578\7\u00d3\2\2\u0575\u0576\7\u0094"+
		"\2\2\u0576\u0578\79\2\2\u0577\u0573\3\2\2\2\u0577\u0574\3\2\2\2\u0577"+
		"\u0575\3\2\2\2\u0578\u00f3\3\2\2\2\u0579\u057a\7\u0141\2\2\u057a\u00f5"+
		"\3\2\2\2\u057b\u057c\7\u0142\2\2\u057c\u00f7\3\2\2\2\u057d\u057e\7\u0143"+
		"\2\2\u057e\u00f9\3\2\2\2\u057f\u0580\7<\2\2\u0580\u0581\7!\2\2\u0581\u058a"+
		"\5*\26\2\u0582\u0587\5\u00fc\177\2\u0583\u0584\7\u0132\2\2\u0584\u0586"+
		"\5\u00fc\177\2\u0585\u0583\3\2\2\2\u0586\u0589\3\2\2\2\u0587\u0585\3\2"+
		"\2\2\u0587\u0588\3\2\2\2\u0588\u058b\3\2\2\2\u0589\u0587\3\2\2\2\u058a"+
		"\u0582\3\2\2\2\u058a\u058b\3\2\2\2\u058b\u00fb\3\2\2\2\u058c\u058d\7C"+
		"\2\2\u058d\u058e\7F\2\2\u058e\u0597\5*\26\2\u058f\u0591\7=\2\2\u0590\u0592"+
		"\7>\2\2\u0591\u0590\3\2\2\2\u0591\u0592\3\2\2\2\u0592\u0593\3\2\2\2\u0593"+
		"\u0594\5.\30\2\u0594\u0595\5.\30\2\u0595\u0597\3\2\2\2\u0596\u058c\3\2"+
		"\2\2\u0596\u058f\3\2\2\2\u0597\u00fd\3\2\2\2\u0598\u059d\5\u00eex\2\u0599"+
		"\u059a\7\u0132\2\2\u059a\u059c\5\u00eex\2\u059b\u0599\3\2\2\2\u059c\u059f"+
		"\3\2\2\2\u059d\u059b\3\2\2\2\u059d\u059e\3\2\2\2\u059e\u00ff\3\2\2\2\u059f"+
		"\u059d\3\2\2\2\u05a0\u05a1\7.\2\2\u05a1\u05a2\7\u011f\2\2\u05a2\u0101"+
		"\3\2\2\2\u05a3\u05a7\5\u0100\u0081\2\u05a4\u05a5\7G\2\2\u05a5\u05a7\7"+
		"\u0147\2\2\u05a6\u05a3\3\2\2\2\u05a6\u05a4\3\2\2\2\u05a7\u0103\3\2\2\2"+
		"\u05a8\u05a9\5.\30\2\u05a9\u05b0\5\u00e8u\2\u05aa\u05ab\7\u0132\2\2\u05ab"+
		"\u05ac\5.\30\2\u05ac\u05ad\5\u00e8u\2\u05ad\u05af\3\2\2\2\u05ae\u05aa"+
		"\3\2\2\2\u05af\u05b2\3\2\2\2\u05b0\u05ae\3\2\2\2\u05b0\u05b1\3\2\2\2\u05b1"+
		"\u0105\3\2\2\2\u05b2\u05b0\3\2\2\2\u05b3\u05b4\7C\2\2\u05b4\u05b5\7!\2"+
		"\2\u05b5\u05b6\5*\26\2\u05b6\u05b7\7F\2\2\u05b7\u05bf\5*\26\2\u05b8\u05b9"+
		"\7\u0132\2\2\u05b9\u05ba\5*\26\2\u05ba\u05bb\7F\2\2\u05bb\u05bc\5*\26"+
		"\2\u05bc\u05be\3\2\2\2\u05bd\u05b8\3\2\2\2\u05be\u05c1\3\2\2\2\u05bf\u05bd"+
		"\3\2\2\2\u05bf\u05c0\3\2\2\2\u05c0\u0107\3\2\2\2\u05c1\u05bf\3\2\2\2\u05c2"+
		"\u05c3\7B\2\2\u05c3\u05c6\7!\2\2\u05c4\u05c5\7\b\2\2\u05c5\u05c7\7\t\2"+
		"\2\u05c6\u05c4\3\2\2\2\u05c6\u05c7\3\2\2\2\u05c7\u05c8\3\2\2\2\u05c8\u05c9"+
		"\5*\26\2\u05c9\u0109\3\2\2\2\u05ca\u05cb\7B\2\2\u05cb\u05ce\7\u00a6\2"+
		"\2\u05cc\u05cd\7\b\2\2\u05cd\u05cf\7\t\2\2\u05ce\u05cc\3\2\2\2\u05ce\u05cf"+
		"\3\2\2\2\u05cf\u05d0\3\2\2\2\u05d0\u05d1\5*\26\2\u05d1\u010b\3\2\2\2\u05d2"+
		"\u05d4\7\u00e3\2\2\u05d3\u05d5\7!\2\2\u05d4\u05d3\3\2\2\2\u05d4\u05d5"+
		"\3\2\2\2\u05d5\u05d6\3\2\2\2\u05d6\u05d7\5*\26\2\u05d7\u010d\3\2\2\2\u05d8"+
		"\u05d9\7:\2\2\u05d9\u05da\5\u0110\u0089\2\u05da\u010f\3\2\2\2\u05db\u05df"+
		"\7\u00a6\2\2\u05dc\u05dd\5(\25\2\u05dd\u05de\7\u0131\2\2\u05de\u05e0\3"+
		"\2\2\2\u05df\u05dc\3\2\2\2\u05df\u05e0\3\2\2\2\u05e0\u05e1\3\2\2\2\u05e1"+
		"\u05e5\5\60\31\2\u05e2\u05e3\7\b\2\2\u05e3\u05e4\7\6\2\2\u05e4\u05e6\7"+
		"\t\2\2\u05e5\u05e2\3\2\2\2\u05e5\u05e6\3\2\2\2\u05e6\u05e8\3\2\2\2\u05e7"+
		"\u05e9\5\u00c2b\2\u05e8\u05e7\3\2\2\2\u05e8\u05e9\3\2\2\2\u05e9\u05ea"+
		"\3\2\2\2\u05ea\u05eb\7\22\2\2\u05eb\u05ec\5\u00aaV\2\u05ec\u0111\3\2\2"+
		"\2\u05ed\u05ee\7<\2\2\u05ee\u05ef\5\u0110\u0089\2\u05ef\u0113\3\2\2\2"+
		"\u05f0\u05f1\7:\2\2\u05f1\u05f2\7\u00e6\2\2\u05f2\u05f3\5B\"\2\u05f3\u05f4"+
		"\7\u00ea\2\2\u05f4\u05f5\7\16\2\2\u05f5\u05f6\5N(\2\u05f6\u0115\3\2\2"+
		"\2\u05f7\u05f8\7B\2\2\u05f8\u05f9\7\u00e6\2\2\u05f9\u05fa\5B\"\2\u05fa"+
		"\u0117\3\2\2\2\u05fb\u05fc\7\u00ad\2\2\u05fc\u0601\5Z.\2\u05fd\u05fe\7"+
		"\u0132\2\2\u05fe\u0600\5Z.\2\u05ff\u05fd\3\2\2\2\u0600\u0603\3\2\2\2\u0601"+
		"\u05ff\3\2\2\2\u0601\u0602\3\2\2\2\u0602\u0604\3\2\2\2\u0603\u0601\3\2"+
		"\2\2\u0604\u0607\7\36\2\2\u0605\u0608\5*\26\2\u0606\u0608\5\60\31\2\u0607"+
		"\u0605\3\2\2\2\u0607\u0606\3\2\2\2\u0608\u0609\3\2\2\2\u0609\u060a\7F"+
		"\2\2\u060a\u060f\5\u011a\u008e\2\u060b\u060c\7\u0132\2\2\u060c\u060e\5"+
		"\u011a\u008e\2\u060d\u060b\3\2\2\2\u060e\u0611\3\2\2\2\u060f\u060d\3\2"+
		"\2\2\u060f\u0610\3\2\2\2\u0610\u0615\3\2\2\2\u0611\u060f\3\2\2\2\u0612"+
		"\u0613\7\u008f\2\2\u0613\u0614\7\u00ad\2\2\u0614\u0616\7\u00cf\2\2\u0615"+
		"\u0612\3\2\2\2\u0615\u0616\3\2\2\2\u0616\u0119\3\2\2\2\u0617\u0619\7\u00e6"+
		"\2\2\u0618\u0617\3\2\2\2\u0618\u0619\3\2\2\2\u0619\u061a\3\2\2\2\u061a"+
		"\u061b\5B\"\2\u061b\u011b\3\2\2\2\u061c\u0620\7\u00ae\2\2\u061d\u061e"+
		"\7\u00ad\2\2\u061e\u061f\7\u00cf\2\2\u061f\u0621\7\u00d8\2\2\u0620\u061d"+
		"\3\2\2\2\u0620\u0621\3\2\2\2\u0621\u0622\3\2\2\2\u0622\u0627\5Z.\2\u0623"+
		"\u0624\7\u0132\2\2\u0624\u0626\5Z.\2\u0625\u0623\3\2\2\2\u0626\u0629\3"+
		"\2\2\2\u0627\u0625\3\2\2\2\u0627\u0628\3\2\2\2\u0628\u062a\3\2\2\2\u0629"+
		"\u0627\3\2\2\2\u062a\u062d\7\36\2\2\u062b\u062e\5*\26\2\u062c\u062e\5"+
		"\60\31\2\u062d\u062b\3\2\2\2\u062d\u062c\3\2\2\2\u062e\u062f\3\2\2\2\u062f"+
		"\u0630\7\21\2\2\u0630\u0635\5\u011a\u008e\2\u0631\u0632\7\u0132\2\2\u0632"+
		"\u0634\5\u011a\u008e\2\u0633\u0631\3\2\2\2\u0634\u0637\3\2\2\2\u0635\u0633"+
		"\3\2\2\2\u0635\u0636\3\2\2\2\u0636\u011d\3\2\2\2\u0637\u0635\3\2\2\2\u0638"+
		"\u0639\7(\2\2\u0639\u063a\5\u0120\u0091\2\u063a\u011f\3\2\2\2\u063b\u063c"+
		"\7:\2\2\u063c\u0640\t\30\2\2\u063d\u063e\5(\25\2\u063e\u063f\7\u0131\2"+
		"\2\u063f\u0641\3\2\2\2\u0640\u063d\3\2\2\2\u0640\u0641\3\2\2\2\u0641\u0642"+
		"\3\2\2\2\u0642\u065b\5*\26\2\u0643\u0644\7#\2\2\u0644\u0645\7\21\2\2\u0645"+
		"\u0648\5*\26\2\u0646\u0647\7\21\2\2\u0647\u0649\5(\25\2\u0648\u0646\3"+
		"\2\2\2\u0648\u0649\3\2\2\2\u0649\u065b\3\2\2\2\u064a\u064b\t\31\2\2\u064b"+
		"\u064c\7\7\2\2\u064c\u065b\7\u0148\2\2\u064d\u064e\7\u0118\2\2\u064e\u065b"+
		"\7\u0119\2\2\u064f\u0652\7\u00ad\2\2\u0650\u0653\5V,\2\u0651\u0653\5\u011a"+
		"\u008e\2\u0652\u0650\3\2\2\2\u0652\u0651\3\2\2\2\u0653\u0654\3\2\2\2\u0654"+
		"\u0658\7\36\2\2\u0655\u0659\7\5\2\2\u0656\u0657\7!\2\2\u0657\u0659\5*"+
		"\26\2\u0658\u0655\3\2\2\2\u0658\u0656\3\2\2\2\u0659\u065b\3\2\2\2\u065a"+
		"\u063b\3\2\2\2\u065a\u0643\3\2\2\2\u065a\u064a\3\2\2\2\u065a\u064d\3\2"+
		"\2\2\u065a\u064f\3\2\2\2\u065b\u0121\3\2\2\2\u065c\u065d\7\u0094\2\2\u065d"+
		"\u065e\7!\2\2\u065e\u065f\5*\26\2\u065f\u0660\7F\2\2\u0660\u0661\5P)\2"+
		"\u0661\u0662\7\u0131\2\2\u0662\u0663\5(\25\2\u0663\u0123\3\2\2\2\u0664"+
		"\u0665\7\u00ce\2\2\u0665\u0666\5(\25\2\u0666\u0125\3\2\2\2\u0667\u0668"+
		"\7\u0118\2\2\u0668\u0669\7\u011a\2\2\u0669\u066a\5P)\2\u066a\u066b\5\u00a4"+
		"S\2\u066b\u0127\3\2\2\2\u066c\u066d\7\u00d1\2\2\u066d\u066e\5(\25\2\u066e"+
		"\u066f\7\u0131\2\2\u066f\u0670\5B\"\2\u0670\u0671\5\u00d6l\2\u0671\u0672"+
		"\5\u00aeX\2\u0672\u0129\3\2\2\2\u00d2\u013b\u0141\u0145\u014d\u014f\u0151"+
		"\u0158\u0168\u016f\u01a2\u01b2\u01bb\u01c3\u01cb\u01cf\u01d6\u01da\u01dc"+
		"\u01e5\u01ea\u01ef\u01f3\u01f8\u01fc\u0205\u020c\u0212\u0217\u021c\u0221"+
		"\u0226\u022b\u0230\u0235\u0243\u024c\u024f\u0252\u025e\u0263\u0267\u0271"+
		"\u0275\u0282\u0286\u028d\u0292\u029c\u02aa\u02af\u02b3\u02b8\u02ba\u02bf"+
		"\u02c5\u02ca\u02cc\u02d0\u02d4\u02de\u02e8\u02f2\u02f4\u02fa\u0304\u030b"+
		"\u0318\u031d\u0320\u0325\u0336\u033b\u0340\u0345\u034b\u034e\u0351\u0353"+
		"\u0356\u0359\u0365\u036a\u036f\u037b\u0380\u0386\u0393\u0397\u039f\u03ab"+
		"\u03b5\u03b9\u03bb\u03c1\u03c4\u03c7\u03cb\u03db\u03e0\u03e4\u03e7\u03ef"+
		"\u03f5\u03fa\u03fe\u0409\u0410\u0417\u041f\u0426\u042a\u042d\u0433\u0438"+
		"\u0441\u0447\u044b\u044e\u0454\u045c\u045f\u0465\u046f\u0476\u0479\u0481"+
		"\u0488\u048b\u0490\u0493\u0498\u049f\u04a2\u04a5\u04a9\u04b0\u04b3\u04b6"+
		"\u04ba\u04c1\u04c4\u04c7\u04cb\u04d2\u04d5\u04d8\u04dc\u04e5\u04e8\u04eb"+
		"\u04ef\u04f8\u04fb\u04fe\u0502\u0509\u050d\u0510\u0513\u0517\u051b\u051f"+
		"\u0523\u0527\u052b\u052f\u0536\u053a\u0541\u0544\u0548\u054c\u0550\u0552"+
		"\u0558\u055b\u0565\u056c\u0571\u0577\u0587\u058a\u0591\u0596\u059d\u05a6"+
		"\u05b0\u05bf\u05c6\u05ce\u05d4\u05df\u05e5\u05e8\u0601\u0607\u060f\u0615"+
		"\u0618\u0620\u0627\u062d\u0635\u0640\u0648\u0652\u0658\u065a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}