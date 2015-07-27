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
		T__0=1, TRUE=2, FALSE=3, ALL=4, NOT=5, LIKE=6, IF=7, EXISTS=8, ASC=9, 
		DESC=10, ORDER=11, GROUP=12, BY=13, HAVING=14, WHERE=15, FROM=16, AS=17, 
		SELECT=18, DISTINCT=19, INSERT=20, OVERWRITE=21, OUTER=22, UNIQUEJOIN=23, 
		PRESERVE=24, JOIN=25, LEFT=26, RIGHT=27, FULL=28, ON=29, PARTITION=30, 
		PARTITIONS=31, TABLE=32, TABLES=33, COLUMNS=34, INDEX=35, INDEXES=36, 
		REBUILD=37, FUNCTIONS=38, SHOW=39, MSCK=40, REPAIR=41, DIRECTORY=42, LOCAL=43, 
		TRANSFORM=44, USING=45, CLUSTER=46, DISTRIBUTE=47, SORT=48, UNION=49, 
		LOAD=50, EXPORT=51, IMPORT=52, DATA=53, INPATH=54, IS=55, NULL=56, CREATE=57, 
		EXTERNAL=58, ALTER=59, CHANGE=60, COLUMN=61, FIRST=62, AFTER=63, DESCRIBE=64, 
		DROP=65, RENAME=66, IGNORE=67, PROTECTION=68, TO=69, COMMENT=70, BOOLEAN=71, 
		TINYINT=72, SMALLINT=73, INT=74, BIGINT=75, FLOAT=76, DOUBLE=77, DATE=78, 
		DATETIME=79, TIMESTAMP=80, DECIMAL=81, STRING=82, VARCHAR=83, ARRAY=84, 
		STRUCT=85, MAP=86, UNIONTYPE=87, REDUCE=88, PARTITIONED=89, CLUSTERED=90, 
		SORTED=91, INTO=92, BUCKETS=93, ROW=94, ROWS=95, FORMAT=96, DELIMITED=97, 
		FIELDS=98, TERMINATED=99, ESCAPED=100, COLLECTION=101, ITEMS=102, KEYS=103, 
		KEY=104, LINES=105, STORED=106, FILEFORMAT=107, SEQUENCEFILE=108, TEXTFILE=109, 
		RCFILE=110, ORCFILE=111, INPUTFORMAT=112, OUTPUTFORMAT=113, INPUTDRIVER=114, 
		OUTPUTDRIVER=115, OFFLINE=116, ENABLE=117, DEFAULT=118, DISABLE=119, READONLY=120, 
		LOCATION=121, TABLESAMPLE=122, BUCKET=123, OUT=124, OF=125, PERCENT=126, 
		CAST=127, ADD=128, REPLACE=129, RLIKE=130, REGEXP=131, TEMPORARY=132, 
		FUNCTION=133, MACRO=134, EXPLAIN=135, EXTENDED=136, FORMATTED=137, PRETTY=138, 
		DEPENDENCY=139, LOGICAL=140, SERDE=141, WITH=142, DEFERRED=143, SERDEPROPERTIES=144, 
		DBPROPERTIES=145, LIMIT=146, SET=147, UNSET=148, TBLPROPERTIES=149, IDXPROPERTIES=150, 
		CASCADED=151, CASE=152, WHEN=153, THEN=154, ELSE=155, END=156, MAPJOIN=157, 
		STREAMTABLE=158, CLUSTERSTATUS=159, UTC=160, LONG=161, DELETE=162, FETCH=163, 
		INTERSECT=164, VIEW=165, IN=166, DATABASE=167, DATABASES=168, MATERIALIZED=169, 
		SCHEMA=170, SCHEMAS=171, GRANT=172, REVOKE=173, SSL=174, UNDO=175, LOCK=176, 
		LOCKS=177, UNLOCK=178, SHARED=179, EXCLUSIVE=180, PROCEDURE=181, UNSIGNED=182, 
		WHILE=183, READ=184, READS=185, PURGE=186, RANGE=187, ANALYZE=188, BEFORE=189, 
		BETWEEN=190, BOTH=191, BINARY=192, CROSS=193, CONTINUE=194, CURSOR=195, 
		TRIGGER=196, RECORDREADER=197, RECORDWRITER=198, LATERAL=199, TOUCH=200, 
		ARCHIVE=201, UNARCHIVE=202, COMPUTE=203, STATISTICS=204, USE=205, OPTION=206, 
		CONCATENATE=207, UPDATE=208, RESTRICT=209, CASCADE=210, SKEWED=211, ROLLUP=212, 
		CUBE=213, DIRECTORIES=214, FOR=215, WINDOW=216, UNBOUNDED=217, PRECEDING=218, 
		FOLLOWING=219, CURRENT=220, LESS=221, MORE=222, OVER=223, GROUPING=224, 
		SETS=225, TRUNCATE=226, NOSCAN=227, PARTIALSCAN=228, USER=229, ROLE=230, 
		INNER=231, EXCHANGE=232, IDENTIFIED=233, CHAR=234, ABS=235, ACOS=236, 
		ASIN=237, ATAN=238, CEIL=239, COS=240, COT=241, EXP=242, FLOOR=243, LN=244, 
		POW=245, RAND=246, ROUND=247, SIN=248, SQRT=249, TAN=250, LCASE=251, LOWER=252, 
		LTRIM=253, RTRIM=254, CONCAT=255, SUBSTR=256, TRIM=257, UCASE=258, UPPER=259, 
		INTERVAL=260, TO_DATE=261, DAY=262, HOUR=263, MINUTE=264, MONTH=265, SECOND=266, 
		FROM_UNIXTIME=267, YEAR=268, DATE_ADD=269, DATE_SUB=270, COLLATE=271, 
		AVG=272, COUNT=273, MAX=274, MIN=275, SUM=276, COALESCE=277, DUPLICATE=278, 
		SERVER=279, ALIASES=280, ALIAS=281, VALUES=282, VALUE=283, LOW_PRIORITY=284, 
		HIGH_PRIORITY=285, HASH=286, REFERENCES=287, DIVIDE=288, MOD=289, OR=290, 
		AND=291, XOR=292, ARROW=293, EQ=294, NOT_EQ=295, LET=296, GET=297, SET_VAR=298, 
		SHIFT_LEFT=299, SHIFT_RIGHT=300, ALL_FIELDS=301, SEMI=302, COLON=303, 
		DOT=304, COMMA=305, ASTERISK=306, RPAREN=307, LPAREN=308, RBRACK=309, 
		LBRACK=310, PLUS=311, MINUS=312, NEGATION=313, VERTBAR=314, BITAND=315, 
		POWER_OP=316, GTH=317, LTH=318, Double_Quote=319, INTEGER_NUM=320, VARCHAR_NUM=321, 
		BINARY_NUM=322, HEX_DIGIT=323, BIT_NUM=324, REAL_NUMBER=325, TEXT_STRING=326, 
		ID=327, USER_VAR=328, WHITE_SPACE=329, SL_COMMENT=330, IDENTIFIER_WITH_WILDCARDS=331, 
		Regex_Escaped_Unicode=332;
	public static final int
		RULE_keyword = 0, RULE_delimeted_ID = 1, RULE_delimited_statement = 2, 
		RULE_integer_types = 3, RULE_relational_op = 4, RULE_cast_data_type = 5, 
		RULE_interval_unit = 6, RULE_string_literal = 7, RULE_number_literal = 8, 
		RULE_hex_literal = 9, RULE_boolean_literal = 10, RULE_bit_literal = 11, 
		RULE_literal_value = 12, RULE_functionList = 13, RULE_number_functions = 14, 
		RULE_char_functions = 15, RULE_time_functions = 16, RULE_other_functions = 17, 
		RULE_group_functions = 18, RULE_schema_name = 19, RULE_database_name = 20, 
		RULE_table_name = 21, RULE_engine_name = 22, RULE_column_name = 23, RULE_view_name = 24, 
		RULE_parser_name = 25, RULE_index_name = 26, RULE_partition_name = 27, 
		RULE_partition_logical_name = 28, RULE_constraintbol_name = 29, RULE_foreign_keybol_name = 30, 
		RULE_collation_name = 31, RULE_event_name = 32, RULE_user_name = 33, RULE_function_name = 34, 
		RULE_procedure_name = 35, RULE_server_name = 36, RULE_wrapper_name = 37, 
		RULE_alias = 38, RULE_password = 39, RULE_server_alias = 40, RULE_role_name = 41, 
		RULE_group_name = 42, RULE_principal_name = 43, RULE_any_name = 44, RULE_priv_type = 45, 
		RULE_expression = 46, RULE_exp_factor1 = 47, RULE_exp_factor2 = 48, RULE_exp_factor3 = 49, 
		RULE_exp_factor4 = 50, RULE_bool_primary = 51, RULE_predicate = 52, RULE_bit_expr = 53, 
		RULE_factor1 = 54, RULE_factor2 = 55, RULE_factor3 = 56, RULE_factor4 = 57, 
		RULE_factor5 = 58, RULE_factor6 = 59, RULE_factor7 = 60, RULE_simple_expr = 61, 
		RULE_function_call = 62, RULE_case_when_statement = 63, RULE_case_when_statement1 = 64, 
		RULE_case_when_statement2 = 65, RULE_column_spec = 66, RULE_expression_list = 67, 
		RULE_interval_expr = 68, RULE_table_references = 69, RULE_table_reference = 70, 
		RULE_table_factor1 = 71, RULE_table_factor2 = 72, RULE_table_factor3 = 73, 
		RULE_table_atom = 74, RULE_join_condition = 75, RULE_index_hint_list = 76, 
		RULE_index_options = 77, RULE_index_hint = 78, RULE_index_list = 79, RULE_partition_clause = 80, 
		RULE_partition_names = 81, RULE_root_statement = 82, RULE_data_manipulation_statements = 83, 
		RULE_data_definition_statements = 84, RULE_select_statement = 85, RULE_select_expression = 86, 
		RULE_where_clause = 87, RULE_groupby_clause = 88, RULE_groupby_item = 89, 
		RULE_having_clause = 90, RULE_orderby_clause = 91, RULE_orderby_item = 92, 
		RULE_limit_clause = 93, RULE_offset = 94, RULE_row_count = 95, RULE_select_list = 96, 
		RULE_column_list = 97, RULE_subquery = 98, RULE_table_spec = 99, RULE_displayed_column = 100, 
		RULE_insert_statements = 101, RULE_insert_header = 102, RULE_insert_subfix = 103, 
		RULE_insert_statement = 104, RULE_value_list_clause = 105, RULE_column_value_list = 106, 
		RULE_set_columns_cluase = 107, RULE_set_column_cluase = 108, RULE_create_database_statement = 109, 
		RULE_drop_database_statement = 110, RULE_create_table_statement = 111, 
		RULE_create_table_statement1 = 112, RULE_create_table_statement2 = 113, 
		RULE_create_table_statement3 = 114, RULE_create_definition = 115, RULE_column_definition = 116, 
		RULE_null_or_notnull = 117, RULE_column_data_type_header = 118, RULE_index_column_name = 119, 
		RULE_reference_definition = 120, RULE_reference_option = 121, RULE_length = 122, 
		RULE_varchar_length = 123, RULE_binary_length = 124, RULE_alter_table_statement = 125, 
		RULE_alter_table_specification = 126, RULE_index_column_names = 127, RULE_index_type = 128, 
		RULE_index_option = 129, RULE_column_definitions = 130, RULE_rename_table_statement = 131, 
		RULE_drop_table_statement = 132, RULE_drop_view_statement = 133, RULE_truncate_table_statement = 134, 
		RULE_create_view_statement = 135, RULE_create_view_body = 136, RULE_alter_view_statement = 137, 
		RULE_create_event_statement = 138, RULE_drop_event_statement = 139, RULE_grant_event_statement = 140, 
		RULE_principal_specification = 141, RULE_revoke_event_statement = 142, 
		RULE_show_event_statement = 143, RULE_show_specification = 144, RULE_set_event_statement = 145, 
		RULE_use_event_statement = 146, RULE_service_event_statement = 147, RULE_update_statements = 148;
	public static final String[] ruleNames = {
		"keyword", "delimeted_ID", "delimited_statement", "integer_types", "relational_op", 
		"cast_data_type", "interval_unit", "string_literal", "number_literal", 
		"hex_literal", "boolean_literal", "bit_literal", "literal_value", "functionList", 
		"number_functions", "char_functions", "time_functions", "other_functions", 
		"group_functions", "schema_name", "database_name", "table_name", "engine_name", 
		"column_name", "view_name", "parser_name", "index_name", "partition_name", 
		"partition_logical_name", "constraintbol_name", "foreign_keybol_name", 
		"collation_name", "event_name", "user_name", "function_name", "procedure_name", 
		"server_name", "wrapper_name", "alias", "password", "server_alias", "role_name", 
		"group_name", "principal_name", "any_name", "priv_type", "expression", 
		"exp_factor1", "exp_factor2", "exp_factor3", "exp_factor4", "bool_primary", 
		"predicate", "bit_expr", "factor1", "factor2", "factor3", "factor4", "factor5", 
		"factor6", "factor7", "simple_expr", "function_call", "case_when_statement", 
		"case_when_statement1", "case_when_statement2", "column_spec", "expression_list", 
		"interval_expr", "table_references", "table_reference", "table_factor1", 
		"table_factor2", "table_factor3", "table_atom", "join_condition", "index_hint_list", 
		"index_options", "index_hint", "index_list", "partition_clause", "partition_names", 
		"root_statement", "data_manipulation_statements", "data_definition_statements", 
		"select_statement", "select_expression", "where_clause", "groupby_clause", 
		"groupby_item", "having_clause", "orderby_clause", "orderby_item", "limit_clause", 
		"offset", "row_count", "select_list", "column_list", "subquery", "table_spec", 
		"displayed_column", "insert_statements", "insert_header", "insert_subfix", 
		"insert_statement", "value_list_clause", "column_value_list", "set_columns_cluase", 
		"set_column_cluase", "create_database_statement", "drop_database_statement", 
		"create_table_statement", "create_table_statement1", "create_table_statement2", 
		"create_table_statement3", "create_definition", "column_definition", "null_or_notnull", 
		"column_data_type_header", "index_column_name", "reference_definition", 
		"reference_option", "length", "varchar_length", "binary_length", "alter_table_statement", 
		"alter_table_specification", "index_column_names", "index_type", "index_option", 
		"column_definitions", "rename_table_statement", "drop_table_statement", 
		"drop_view_statement", "truncate_table_statement", "create_view_statement", 
		"create_view_body", "alter_view_statement", "create_event_statement", 
		"drop_event_statement", "grant_event_statement", "principal_specification", 
		"revoke_event_statement", "show_event_statement", "show_specification", 
		"set_event_statement", "use_event_statement", "service_event_statement", 
		"update_statements"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'\"'", null, null, null, null, null, null, null, null, null, null, 
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
		null, null, null, null, null, "'=>'", null, null, "'<='", "'>='", "':='", 
		"'<<'", "'>>'", "'.*'", "';'", "':'", "'.'", "','", "'*'", "')'", "'('", 
		"']'", "'['", "'+'", "'-'", "'~'", "'|'", "'&'", "'^'", "'>'", "'<'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, "TRUE", "FALSE", "ALL", "NOT", "LIKE", "IF", "EXISTS", "ASC", 
		"DESC", "ORDER", "GROUP", "BY", "HAVING", "WHERE", "FROM", "AS", "SELECT", 
		"DISTINCT", "INSERT", "OVERWRITE", "OUTER", "UNIQUEJOIN", "PRESERVE", 
		"JOIN", "LEFT", "RIGHT", "FULL", "ON", "PARTITION", "PARTITIONS", "TABLE", 
		"TABLES", "COLUMNS", "INDEX", "INDEXES", "REBUILD", "FUNCTIONS", "SHOW", 
		"MSCK", "REPAIR", "DIRECTORY", "LOCAL", "TRANSFORM", "USING", "CLUSTER", 
		"DISTRIBUTE", "SORT", "UNION", "LOAD", "EXPORT", "IMPORT", "DATA", "INPATH", 
		"IS", "NULL", "CREATE", "EXTERNAL", "ALTER", "CHANGE", "COLUMN", "FIRST", 
		"AFTER", "DESCRIBE", "DROP", "RENAME", "IGNORE", "PROTECTION", "TO", "COMMENT", 
		"BOOLEAN", "TINYINT", "SMALLINT", "INT", "BIGINT", "FLOAT", "DOUBLE", 
		"DATE", "DATETIME", "TIMESTAMP", "DECIMAL", "STRING", "VARCHAR", "ARRAY", 
		"STRUCT", "MAP", "UNIONTYPE", "REDUCE", "PARTITIONED", "CLUSTERED", "SORTED", 
		"INTO", "BUCKETS", "ROW", "ROWS", "FORMAT", "DELIMITED", "FIELDS", "TERMINATED", 
		"ESCAPED", "COLLECTION", "ITEMS", "KEYS", "KEY", "LINES", "STORED", "FILEFORMAT", 
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
		"HEX_DIGIT", "BIT_NUM", "REAL_NUMBER", "TEXT_STRING", "ID", "USER_VAR", 
		"WHITE_SPACE", "SL_COMMENT", "IDENTIFIER_WITH_WILDCARDS", "Regex_Escaped_Unicode"
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
			setState(298);
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

	public static class Delimeted_IDContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(uniformSQLParser.ID, 0); }
		public Delimeted_IDContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delimeted_ID; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitDelimeted_ID(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Delimeted_IDContext delimeted_ID() throws RecognitionException {
		Delimeted_IDContext _localctx = new Delimeted_IDContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_delimeted_ID);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			match(T__0);
			setState(301);
			match(ID);
			setState(302);
			match(T__0);
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
		enterRule(_localctx, 4, RULE_delimited_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(304);
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
		enterRule(_localctx, 6, RULE_integer_types);
		try {
			setState(319);
			switch (_input.LA(1)) {
			case EOF:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case TINYINT:
				enterOuterAlt(_localctx, 2);
				{
				setState(307);
				match(TINYINT);
				}
				break;
			case SMALLINT:
				enterOuterAlt(_localctx, 3);
				{
				setState(308);
				match(SMALLINT);
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 4);
				{
				setState(309);
				match(INT);
				}
				break;
			case BIGINT:
				enterOuterAlt(_localctx, 5);
				{
				setState(310);
				match(BIGINT);
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 6);
				{
				setState(311);
				match(BOOLEAN);
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 7);
				{
				setState(312);
				match(FLOAT);
				}
				break;
			case DOUBLE:
				enterOuterAlt(_localctx, 8);
				{
				setState(313);
				match(DOUBLE);
				}
				break;
			case DATE:
				enterOuterAlt(_localctx, 9);
				{
				setState(314);
				match(DATE);
				}
				break;
			case TIMESTAMP:
				enterOuterAlt(_localctx, 10);
				{
				setState(315);
				match(TIMESTAMP);
				}
				break;
			case VARCHAR:
				enterOuterAlt(_localctx, 11);
				{
				setState(316);
				match(VARCHAR);
				}
				break;
			case BINARY:
				enterOuterAlt(_localctx, 12);
				{
				setState(317);
				match(BINARY);
				}
				break;
			case DECIMAL:
				enterOuterAlt(_localctx, 13);
				{
				setState(318);
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
		enterRule(_localctx, 8, RULE_relational_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
			_la = _input.LA(1);
			if ( !(((((_la - 294)) & ~0x3f) == 0 && ((1L << (_la - 294)) & ((1L << (EQ - 294)) | (1L << (NOT_EQ - 294)) | (1L << (LET - 294)) | (1L << (GET - 294)) | (1L << (GTH - 294)) | (1L << (LTH - 294)))) != 0)) ) {
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
		enterRule(_localctx, 10, RULE_cast_data_type);
		int _la;
		try {
			setState(341);
			switch (_input.LA(1)) {
			case BINARY:
				enterOuterAlt(_localctx, 1);
				{
				setState(323);
				match(BINARY);
				setState(325);
				_la = _input.LA(1);
				if (_la==INTEGER_NUM) {
					{
					setState(324);
					match(INTEGER_NUM);
					}
				}

				}
				break;
			case CHAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(327);
				match(CHAR);
				setState(329);
				_la = _input.LA(1);
				if (_la==INTEGER_NUM) {
					{
					setState(328);
					match(INTEGER_NUM);
					}
				}

				}
				break;
			case DATE:
				enterOuterAlt(_localctx, 3);
				{
				setState(331);
				match(DATE);
				}
				break;
			case DATETIME:
				enterOuterAlt(_localctx, 4);
				{
				setState(332);
				match(DATETIME);
				}
				break;
			case DECIMAL:
				enterOuterAlt(_localctx, 5);
				{
				setState(333);
				match(DECIMAL);
				setState(339);
				_la = _input.LA(1);
				if (_la==INTEGER_NUM) {
					{
					setState(334);
					match(INTEGER_NUM);
					setState(337);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(335);
						match(COMMA);
						setState(336);
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
		enterRule(_localctx, 12, RULE_interval_unit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
			_la = _input.LA(1);
			if ( !(((((_la - 262)) & ~0x3f) == 0 && ((1L << (_la - 262)) & ((1L << (DAY - 262)) | (1L << (HOUR - 262)) | (1L << (MINUTE - 262)) | (1L << (MONTH - 262)) | (1L << (SECOND - 262)) | (1L << (YEAR - 262)))) != 0)) ) {
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
		enterRule(_localctx, 14, RULE_string_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(345);
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
		enterRule(_localctx, 16, RULE_number_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(348);
			_la = _input.LA(1);
			if (_la==PLUS || _la==MINUS) {
				{
				setState(347);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			setState(350);
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
		enterRule(_localctx, 18, RULE_hex_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(352);
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
		enterRule(_localctx, 20, RULE_boolean_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(354);
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
		enterRule(_localctx, 22, RULE_bit_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(356);
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
		enterRule(_localctx, 24, RULE_literal_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(364);
			switch (_input.LA(1)) {
			case TEXT_STRING:
				{
				setState(358);
				string_literal();
				}
				break;
			case PLUS:
			case MINUS:
			case INTEGER_NUM:
			case REAL_NUMBER:
				{
				setState(359);
				number_literal();
				}
				break;
			case HEX_DIGIT:
				{
				setState(360);
				hex_literal();
				}
				break;
			case TRUE:
			case FALSE:
				{
				setState(361);
				boolean_literal();
				}
				break;
			case BIT_NUM:
				{
				setState(362);
				bit_literal();
				}
				break;
			case NULL:
				{
				setState(363);
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
		enterRule(_localctx, 26, RULE_functionList);
		try {
			setState(371);
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
				setState(366);
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
				setState(367);
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
				setState(368);
				time_functions();
				}
				break;
			case COALESCE:
				enterOuterAlt(_localctx, 4);
				{
				setState(369);
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
				setState(370);
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
		enterRule(_localctx, 28, RULE_number_functions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(373);
			_la = _input.LA(1);
			if ( !(((((_la - 235)) & ~0x3f) == 0 && ((1L << (_la - 235)) & ((1L << (ABS - 235)) | (1L << (ACOS - 235)) | (1L << (ASIN - 235)) | (1L << (ATAN - 235)) | (1L << (CEIL - 235)) | (1L << (COS - 235)) | (1L << (COT - 235)) | (1L << (EXP - 235)) | (1L << (FLOOR - 235)) | (1L << (LN - 235)) | (1L << (POW - 235)) | (1L << (RAND - 235)) | (1L << (ROUND - 235)) | (1L << (SIN - 235)) | (1L << (SQRT - 235)) | (1L << (TAN - 235)))) != 0)) ) {
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
		enterRule(_localctx, 30, RULE_char_functions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(375);
			_la = _input.LA(1);
			if ( !(((((_la - 251)) & ~0x3f) == 0 && ((1L << (_la - 251)) & ((1L << (LCASE - 251)) | (1L << (LOWER - 251)) | (1L << (LTRIM - 251)) | (1L << (RTRIM - 251)) | (1L << (CONCAT - 251)) | (1L << (SUBSTR - 251)) | (1L << (TRIM - 251)) | (1L << (UCASE - 251)) | (1L << (UPPER - 251)))) != 0)) ) {
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
		enterRule(_localctx, 32, RULE_time_functions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(377);
			_la = _input.LA(1);
			if ( !(((((_la - 261)) & ~0x3f) == 0 && ((1L << (_la - 261)) & ((1L << (TO_DATE - 261)) | (1L << (DAY - 261)) | (1L << (HOUR - 261)) | (1L << (MINUTE - 261)) | (1L << (MONTH - 261)) | (1L << (SECOND - 261)) | (1L << (FROM_UNIXTIME - 261)) | (1L << (YEAR - 261)) | (1L << (DATE_ADD - 261)) | (1L << (DATE_SUB - 261)))) != 0)) ) {
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
		enterRule(_localctx, 34, RULE_other_functions);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379);
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
		enterRule(_localctx, 36, RULE_group_functions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(381);
			_la = _input.LA(1);
			if ( !(((((_la - 272)) & ~0x3f) == 0 && ((1L << (_la - 272)) & ((1L << (AVG - 272)) | (1L << (COUNT - 272)) | (1L << (MAX - 272)) | (1L << (MIN - 272)) | (1L << (SUM - 272)))) != 0)) ) {
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
		enterRule(_localctx, 38, RULE_schema_name);
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
		enterRule(_localctx, 40, RULE_database_name);
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
		enterRule(_localctx, 42, RULE_table_name);
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
		enterRule(_localctx, 44, RULE_engine_name);
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
		enterRule(_localctx, 46, RULE_column_name);
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
		enterRule(_localctx, 48, RULE_view_name);
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
		enterRule(_localctx, 50, RULE_parser_name);
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
		enterRule(_localctx, 52, RULE_index_name);
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
		enterRule(_localctx, 54, RULE_partition_name);
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
		enterRule(_localctx, 56, RULE_partition_logical_name);
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
		enterRule(_localctx, 58, RULE_constraintbol_name);
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
		enterRule(_localctx, 60, RULE_foreign_keybol_name);
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
		enterRule(_localctx, 62, RULE_collation_name);
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
		enterRule(_localctx, 64, RULE_event_name);
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
		enterRule(_localctx, 66, RULE_user_name);
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
		enterRule(_localctx, 68, RULE_function_name);
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
		enterRule(_localctx, 70, RULE_procedure_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(415);
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
		enterRule(_localctx, 72, RULE_server_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(417);
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
		enterRule(_localctx, 74, RULE_wrapper_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(419);
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
		enterRule(_localctx, 76, RULE_alias);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(422);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(421);
				match(AS);
				}
			}

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
		enterRule(_localctx, 78, RULE_password);
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
		enterRule(_localctx, 80, RULE_server_alias);
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
		enterRule(_localctx, 82, RULE_role_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(430);
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
		enterRule(_localctx, 84, RULE_group_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(432);
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
		enterRule(_localctx, 86, RULE_principal_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(434);
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
		enterRule(_localctx, 88, RULE_any_name);
		try {
			setState(438);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(436);
				match(ID);
				}
				break;
			case USE:
			case USER:
				enterOuterAlt(_localctx, 2);
				{
				setState(437);
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
		enterRule(_localctx, 90, RULE_priv_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(440);
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
		enterRule(_localctx, 92, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(442);
			exp_factor1();
			setState(447);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(443);
				match(OR);
				setState(444);
				exp_factor1();
				}
				}
				setState(449);
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
		enterRule(_localctx, 94, RULE_exp_factor1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(450);
			exp_factor2();
			setState(455);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==XOR) {
				{
				{
				setState(451);
				match(XOR);
				setState(452);
				exp_factor2();
				}
				}
				setState(457);
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
		enterRule(_localctx, 96, RULE_exp_factor2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(458);
			exp_factor3();
			setState(463);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(459);
				match(AND);
				setState(460);
				exp_factor3();
				}
				}
				setState(465);
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
		enterRule(_localctx, 98, RULE_exp_factor3);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(467);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(466);
				match(NOT);
				}
				break;
			}
			setState(469);
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
		enterRule(_localctx, 100, RULE_exp_factor4);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(471);
			bool_primary();
			setState(480);
			_la = _input.LA(1);
			if (_la==IS) {
				{
				setState(472);
				match(IS);
				setState(474);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(473);
					match(NOT);
					}
				}

				setState(478);
				switch (_input.LA(1)) {
				case TRUE:
				case FALSE:
					{
					setState(476);
					boolean_literal();
					}
					break;
				case NULL:
					{
					setState(477);
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
		enterRule(_localctx, 102, RULE_bool_primary);
		int _la;
		try {
			setState(499);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(482);
				predicate();
				setState(483);
				relational_op();
				setState(484);
				predicate();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(486);
				predicate();
				setState(487);
				relational_op();
				setState(489);
				_la = _input.LA(1);
				if (_la==ALL) {
					{
					setState(488);
					match(ALL);
					}
				}

				setState(491);
				subquery();
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(494);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(493);
					match(NOT);
					}
				}

				setState(496);
				match(EXISTS);
				setState(497);
				subquery();
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(498);
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
		enterRule(_localctx, 104, RULE_predicate);
		int _la;
		try {
			setState(534);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(501);
				bit_expr();
				setState(503);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(502);
					match(NOT);
					}
				}

				setState(505);
				match(IN);
				setState(508);
				switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
				case 1:
					{
					setState(506);
					subquery();
					}
					break;
				case 2:
					{
					setState(507);
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
				setState(510);
				bit_expr();
				setState(512);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(511);
					match(NOT);
					}
				}

				setState(514);
				match(BETWEEN);
				setState(515);
				bit_expr();
				setState(516);
				match(AND);
				setState(517);
				predicate();
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(519);
				bit_expr();
				setState(521);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(520);
					match(NOT);
					}
				}

				setState(523);
				match(LIKE);
				setState(524);
				simple_expr();
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(526);
				bit_expr();
				setState(528);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(527);
					match(NOT);
					}
				}

				setState(530);
				match(REGEXP);
				setState(531);
				bit_expr();
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				{
				setState(533);
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
		enterRule(_localctx, 106, RULE_bit_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(536);
			factor1();
			setState(539);
			_la = _input.LA(1);
			if (_la==VERTBAR) {
				{
				setState(537);
				match(VERTBAR);
				setState(538);
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
		enterRule(_localctx, 108, RULE_factor1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(541);
			factor2();
			setState(544);
			_la = _input.LA(1);
			if (_la==BITAND) {
				{
				setState(542);
				match(BITAND);
				setState(543);
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
		enterRule(_localctx, 110, RULE_factor2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(546);
			factor3();
			setState(549);
			_la = _input.LA(1);
			if (_la==SHIFT_LEFT || _la==SHIFT_RIGHT) {
				{
				setState(547);
				_la = _input.LA(1);
				if ( !(_la==SHIFT_LEFT || _la==SHIFT_RIGHT) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(548);
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
		enterRule(_localctx, 112, RULE_factor3);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(551);
			factor4();
			setState(554);
			_la = _input.LA(1);
			if (_la==PLUS || _la==MINUS) {
				{
				setState(552);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(553);
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
		enterRule(_localctx, 114, RULE_factor4);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(556);
			factor5();
			setState(559);
			_la = _input.LA(1);
			if (((((_la - 288)) & ~0x3f) == 0 && ((1L << (_la - 288)) & ((1L << (DIVIDE - 288)) | (1L << (MOD - 288)) | (1L << (ASTERISK - 288)) | (1L << (POWER_OP - 288)))) != 0)) {
				{
				setState(557);
				_la = _input.LA(1);
				if ( !(((((_la - 288)) & ~0x3f) == 0 && ((1L << (_la - 288)) & ((1L << (DIVIDE - 288)) | (1L << (MOD - 288)) | (1L << (ASTERISK - 288)) | (1L << (POWER_OP - 288)))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(558);
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
		enterRule(_localctx, 116, RULE_factor5);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(561);
			factor6();
			setState(564);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				setState(562);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(563);
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
		enterRule(_localctx, 118, RULE_factor6);
		int _la;
		try {
			setState(569);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(566);
				_la = _input.LA(1);
				if ( !(_la==BINARY || ((((_la - 311)) & ~0x3f) == 0 && ((1L << (_la - 311)) & ((1L << (PLUS - 311)) | (1L << (MINUS - 311)) | (1L << (NEGATION - 311)))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(567);
				simple_expr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(568);
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
		enterRule(_localctx, 120, RULE_factor7);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(571);
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
		public TerminalNode USER_VAR() { return getToken(uniformSQLParser.USER_VAR, 0); }
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
		enterRule(_localctx, 122, RULE_simple_expr);
		try {
			setState(584);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(573);
				literal_value();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(574);
				column_spec();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(575);
				function_call();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(576);
				match(USER_VAR);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(577);
				expression_list();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				{
				setState(578);
				match(ROW);
				setState(579);
				expression_list();
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(580);
				subquery();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(581);
				match(EXISTS);
				setState(582);
				subquery();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(583);
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
		enterRule(_localctx, 124, RULE_function_call);
		int _la;
		try {
			setState(616);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(586);
				functionList();
				setState(599);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(587);
					match(LPAREN);
					setState(596);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUE) | (1L << FALSE) | (1L << NOT) | (1L << EXISTS) | (1L << NULL))) != 0) || ((((_la - 94)) & ~0x3f) == 0 && ((1L << (_la - 94)) & ((1L << (ROW - 94)) | (1L << (CAST - 94)) | (1L << (CASE - 94)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (BINARY - 192)) | (1L << (USE - 192)) | (1L << (USER - 192)) | (1L << (ABS - 192)) | (1L << (ACOS - 192)) | (1L << (ASIN - 192)) | (1L << (ATAN - 192)) | (1L << (CEIL - 192)) | (1L << (COS - 192)) | (1L << (COT - 192)) | (1L << (EXP - 192)) | (1L << (FLOOR - 192)) | (1L << (LN - 192)) | (1L << (POW - 192)) | (1L << (RAND - 192)) | (1L << (ROUND - 192)) | (1L << (SIN - 192)) | (1L << (SQRT - 192)) | (1L << (TAN - 192)) | (1L << (LCASE - 192)) | (1L << (LOWER - 192)) | (1L << (LTRIM - 192)) | (1L << (RTRIM - 192)) | (1L << (CONCAT - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (SUBSTR - 256)) | (1L << (TRIM - 256)) | (1L << (UCASE - 256)) | (1L << (UPPER - 256)) | (1L << (TO_DATE - 256)) | (1L << (DAY - 256)) | (1L << (HOUR - 256)) | (1L << (MINUTE - 256)) | (1L << (MONTH - 256)) | (1L << (SECOND - 256)) | (1L << (FROM_UNIXTIME - 256)) | (1L << (YEAR - 256)) | (1L << (DATE_ADD - 256)) | (1L << (DATE_SUB - 256)) | (1L << (AVG - 256)) | (1L << (COUNT - 256)) | (1L << (MAX - 256)) | (1L << (MIN - 256)) | (1L << (SUM - 256)) | (1L << (COALESCE - 256)) | (1L << (LPAREN - 256)) | (1L << (PLUS - 256)) | (1L << (MINUS - 256)) | (1L << (NEGATION - 256)))) != 0) || ((((_la - 320)) & ~0x3f) == 0 && ((1L << (_la - 320)) & ((1L << (INTEGER_NUM - 320)) | (1L << (HEX_DIGIT - 320)) | (1L << (BIT_NUM - 320)) | (1L << (REAL_NUMBER - 320)) | (1L << (TEXT_STRING - 320)) | (1L << (ID - 320)) | (1L << (USER_VAR - 320)))) != 0)) {
						{
						setState(588);
						expression();
						setState(593);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==COMMA) {
							{
							{
							setState(589);
							match(COMMA);
							setState(590);
							expression();
							}
							}
							setState(595);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
					}

					setState(598);
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
				setState(601);
				match(CAST);
				setState(602);
				match(LPAREN);
				setState(603);
				expression();
				setState(604);
				match(AS);
				setState(605);
				cast_data_type();
				setState(606);
				match(RPAREN);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(608);
				group_functions();
				setState(609);
				match(LPAREN);
				setState(611);
				_la = _input.LA(1);
				if (_la==ALL || _la==DISTINCT || _la==ASTERISK) {
					{
					setState(610);
					_la = _input.LA(1);
					if ( !(_la==ALL || _la==DISTINCT || _la==ASTERISK) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
				}

				setState(613);
				bit_expr();
				setState(614);
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
		enterRule(_localctx, 126, RULE_case_when_statement);
		try {
			setState(620);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(618);
				case_when_statement1();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(619);
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
		enterRule(_localctx, 128, RULE_case_when_statement1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(622);
			match(CASE);
			setState(628); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(623);
				match(WHEN);
				setState(624);
				expression();
				setState(625);
				match(THEN);
				setState(626);
				bit_expr();
				}
				}
				setState(630); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WHEN );
			setState(634);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(632);
				match(ELSE);
				setState(633);
				bit_expr();
				}
			}

			setState(636);
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
		enterRule(_localctx, 130, RULE_case_when_statement2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(638);
			match(CASE);
			setState(639);
			bit_expr();
			setState(645); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(640);
				match(WHEN);
				setState(641);
				bit_expr();
				setState(642);
				match(THEN);
				setState(643);
				bit_expr();
				}
				}
				setState(647); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WHEN );
			setState(651);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(649);
				match(ELSE);
				setState(650);
				bit_expr();
				}
			}

			setState(653);
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
		enterRule(_localctx, 132, RULE_column_spec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(663);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				{
				setState(658);
				switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
				case 1:
					{
					setState(655);
					schema_name();
					setState(656);
					match(DOT);
					}
					break;
				}
				setState(660);
				table_name();
				setState(661);
				match(DOT);
				}
				break;
			}
			setState(665);
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
		enterRule(_localctx, 134, RULE_expression_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(667);
			match(LPAREN);
			setState(668);
			expression();
			setState(673);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(669);
				match(COMMA);
				setState(670);
				expression();
				}
				}
				setState(675);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(676);
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
		enterRule(_localctx, 136, RULE_interval_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(678);
			match(INTERVAL);
			setState(679);
			expression();
			setState(680);
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
		enterRule(_localctx, 138, RULE_table_references);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(682);
			table_reference();
			setState(687);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(683);
				match(COMMA);
				setState(684);
				table_reference();
				}
				}
				setState(689);
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
		enterRule(_localctx, 140, RULE_table_reference);
		try {
			setState(692);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(690);
				table_factor1();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(691);
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
		enterRule(_localctx, 142, RULE_table_factor1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(694);
			table_factor2();
			setState(703);
			_la = _input.LA(1);
			if (_la==JOIN || _la==CROSS) {
				{
				setState(696);
				_la = _input.LA(1);
				if (_la==CROSS) {
					{
					setState(695);
					match(CROSS);
					}
				}

				setState(698);
				match(JOIN);
				setState(699);
				table_atom();
				setState(701);
				switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
				case 1:
					{
					setState(700);
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
		enterRule(_localctx, 144, RULE_table_factor2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(705);
			table_factor3();
			setState(714);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEFT) | (1L << RIGHT) | (1L << FULL))) != 0)) {
				{
				setState(706);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEFT) | (1L << RIGHT) | (1L << FULL))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(708);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(707);
					match(OUTER);
					}
				}

				setState(710);
				match(JOIN);
				setState(711);
				table_factor3();
				setState(712);
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
		enterRule(_localctx, 146, RULE_table_factor3);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(716);
			table_atom();
			setState(725);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				{
				setState(721);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEFT) | (1L << RIGHT) | (1L << FULL))) != 0)) {
					{
					setState(717);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEFT) | (1L << RIGHT) | (1L << FULL))) != 0)) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(719);
					_la = _input.LA(1);
					if (_la==OUTER) {
						{
						setState(718);
						match(OUTER);
						}
					}

					}
				}

				setState(723);
				match(JOIN);
				setState(724);
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
		enterRule(_localctx, 148, RULE_table_atom);
		int _la;
		try {
			setState(739);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(727);
				table_spec();
				setState(729);
				_la = _input.LA(1);
				if (_la==AS || _la==USE || _la==USER || _la==ID) {
					{
					setState(728);
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
				setState(731);
				subquery();
				setState(732);
				alias();
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(734);
				match(LPAREN);
				setState(735);
				table_references();
				setState(736);
				match(RPAREN);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(738);
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
		enterRule(_localctx, 150, RULE_join_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(741);
			match(ON);
			setState(742);
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
		enterRule(_localctx, 152, RULE_index_hint_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(744);
			index_hint();
			setState(749);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(745);
				match(COMMA);
				setState(746);
				index_hint();
				}
				}
				setState(751);
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
		enterRule(_localctx, 154, RULE_index_options);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(752);
			_la = _input.LA(1);
			if ( !(_la==INDEX || _la==KEY) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(761);
			_la = _input.LA(1);
			if (_la==FOR) {
				{
				setState(753);
				match(FOR);
				setState(759);
				switch (_input.LA(1)) {
				case JOIN:
					{
					{
					setState(754);
					match(JOIN);
					}
					}
					break;
				case ORDER:
					{
					{
					setState(755);
					match(ORDER);
					setState(756);
					match(BY);
					}
					}
					break;
				case GROUP:
					{
					{
					setState(757);
					match(GROUP);
					setState(758);
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
		enterRule(_localctx, 156, RULE_index_hint);
		int _la;
		try {
			setState(777);
			switch (_input.LA(1)) {
			case USE:
				enterOuterAlt(_localctx, 1);
				{
				setState(763);
				match(USE);
				setState(764);
				index_options();
				setState(765);
				match(LPAREN);
				setState(767);
				_la = _input.LA(1);
				if (_la==USE || _la==USER || _la==ID) {
					{
					setState(766);
					index_list();
					}
				}

				setState(769);
				match(RPAREN);
				}
				break;
			case IGNORE:
				enterOuterAlt(_localctx, 2);
				{
				setState(771);
				match(IGNORE);
				setState(772);
				index_options();
				setState(773);
				match(LPAREN);
				setState(774);
				index_list();
				setState(775);
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
		enterRule(_localctx, 158, RULE_index_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(779);
			index_name();
			setState(784);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(780);
				match(COMMA);
				setState(781);
				index_name();
				}
				}
				setState(786);
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
		enterRule(_localctx, 160, RULE_partition_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(787);
			match(PARTITION);
			setState(788);
			match(LPAREN);
			setState(789);
			partition_names();
			setState(790);
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
		enterRule(_localctx, 162, RULE_partition_names);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(792);
			partition_name();
			setState(797);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(793);
				match(COMMA);
				setState(794);
				partition_name();
				}
				}
				setState(799);
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
		enterRule(_localctx, 164, RULE_root_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(802);
			switch (_input.LA(1)) {
			case SELECT:
			case INSERT:
			case UPDATE:
				{
				setState(800);
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
				setState(801);
				data_definition_statements();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(805);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(804);
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
		enterRule(_localctx, 166, RULE_data_manipulation_statements);
		try {
			setState(810);
			switch (_input.LA(1)) {
			case SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(807);
				select_statement();
				}
				break;
			case INSERT:
				enterOuterAlt(_localctx, 2);
				{
				setState(808);
				insert_statements();
				}
				break;
			case UPDATE:
				enterOuterAlt(_localctx, 3);
				{
				setState(809);
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
		enterRule(_localctx, 168, RULE_data_definition_statements);
		try {
			setState(827);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(812);
				create_database_statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(813);
				drop_database_statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(814);
				create_event_statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(815);
				drop_event_statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(816);
				grant_event_statement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(817);
				revoke_event_statement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(818);
				show_event_statement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(819);
				set_event_statement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(820);
				create_table_statement();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(821);
				alter_table_statement();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(822);
				drop_table_statement();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(823);
				drop_view_statement();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(824);
				create_view_statement();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(825);
				alter_view_statement();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(826);
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
		enterRule(_localctx, 170, RULE_select_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(829);
			select_expression();
			setState(837);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==UNION) {
				{
				{
				setState(830);
				match(UNION);
				setState(832);
				_la = _input.LA(1);
				if (_la==ALL || _la==DISTINCT) {
					{
					setState(831);
					_la = _input.LA(1);
					if ( !(_la==ALL || _la==DISTINCT) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
				}

				setState(834);
				select_expression();
				}
				}
				setState(839);
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
		enterRule(_localctx, 172, RULE_select_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(840);
			match(SELECT);
			setState(842);
			_la = _input.LA(1);
			if (_la==ALL || _la==DISTINCT) {
				{
				setState(841);
				_la = _input.LA(1);
				if ( !(_la==ALL || _la==DISTINCT) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			setState(844);
			select_list();
			setState(856);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(845);
				match(FROM);
				setState(846);
				table_references();
				setState(848);
				_la = _input.LA(1);
				if (_la==WHERE) {
					{
					setState(847);
					where_clause();
					}
				}

				setState(851);
				_la = _input.LA(1);
				if (_la==GROUP) {
					{
					setState(850);
					groupby_clause();
					}
				}

				setState(854);
				_la = _input.LA(1);
				if (_la==HAVING) {
					{
					setState(853);
					having_clause();
					}
				}

				}
			}

			setState(859);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(858);
				orderby_clause();
				}
			}

			setState(862);
			_la = _input.LA(1);
			if (_la==LIMIT) {
				{
				setState(861);
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
		enterRule(_localctx, 174, RULE_where_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(864);
			match(WHERE);
			setState(865);
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
		enterRule(_localctx, 176, RULE_groupby_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(867);
			match(GROUP);
			setState(868);
			match(BY);
			setState(869);
			groupby_item();
			setState(874);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(870);
				match(COMMA);
				setState(871);
				groupby_item();
				}
				}
				setState(876);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(879);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(877);
				match(WITH);
				setState(878);
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
		enterRule(_localctx, 178, RULE_groupby_item);
		try {
			setState(884);
			switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(881);
				column_spec();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(882);
				match(INTEGER_NUM);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(883);
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
		enterRule(_localctx, 180, RULE_having_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(886);
			match(HAVING);
			setState(887);
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
		enterRule(_localctx, 182, RULE_orderby_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(889);
			match(ORDER);
			setState(890);
			match(BY);
			setState(891);
			orderby_item();
			setState(896);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(892);
				match(COMMA);
				setState(893);
				orderby_item();
				}
				}
				setState(898);
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
		enterRule(_localctx, 184, RULE_orderby_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(899);
			groupby_item();
			setState(901);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(900);
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
		enterRule(_localctx, 186, RULE_limit_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(903);
			match(LIMIT);
			{
			setState(907);
			switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
			case 1:
				{
				setState(904);
				offset();
				setState(905);
				match(COMMA);
				}
				break;
			}
			setState(909);
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
		enterRule(_localctx, 188, RULE_offset);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(911);
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
		enterRule(_localctx, 190, RULE_row_count);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(913);
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
		enterRule(_localctx, 192, RULE_select_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(924);
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
			case USER_VAR:
				{
				{
				setState(915);
				displayed_column();
				setState(920);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(916);
					match(COMMA);
					setState(917);
					displayed_column();
					}
					}
					setState(922);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			case ASTERISK:
				{
				setState(923);
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
		enterRule(_localctx, 194, RULE_column_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(926);
			match(LPAREN);
			setState(927);
			column_spec();
			setState(932);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(928);
				match(COMMA);
				setState(929);
				column_spec();
				}
				}
				setState(934);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(935);
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
		enterRule(_localctx, 196, RULE_subquery);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(937);
			match(LPAREN);
			setState(938);
			select_statement();
			setState(939);
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
		enterRule(_localctx, 198, RULE_table_spec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(944);
			switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
			case 1:
				{
				setState(941);
				schema_name();
				setState(942);
				match(DOT);
				}
				break;
			}
			setState(946);
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
		enterRule(_localctx, 200, RULE_displayed_column);
		int _la;
		try {
			setState(960);
			switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(948);
				table_spec();
				setState(949);
				match(DOT);
				setState(950);
				match(ASTERISK);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(952);
				column_spec();
				setState(954);
				_la = _input.LA(1);
				if (_la==AS || _la==USE || _la==USER || _la==ID) {
					{
					setState(953);
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
				setState(956);
				bit_expr();
				setState(958);
				_la = _input.LA(1);
				if (_la==AS || _la==USE || _la==USER || _la==ID) {
					{
					setState(957);
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
		enterRule(_localctx, 202, RULE_insert_statements);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(962);
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
		enterRule(_localctx, 204, RULE_insert_header);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(964);
			match(INSERT);
			setState(966);
			_la = _input.LA(1);
			if (_la==LOW_PRIORITY || _la==HIGH_PRIORITY) {
				{
				setState(965);
				_la = _input.LA(1);
				if ( !(_la==LOW_PRIORITY || _la==HIGH_PRIORITY) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			setState(969);
			_la = _input.LA(1);
			if (_la==IGNORE) {
				{
				setState(968);
				match(IGNORE);
				}
			}

			setState(972);
			_la = _input.LA(1);
			if (_la==INTO) {
				{
				setState(971);
				match(INTO);
				}
			}

			setState(974);
			table_spec();
			setState(976);
			_la = _input.LA(1);
			if (_la==PARTITION) {
				{
				setState(975);
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
		enterRule(_localctx, 206, RULE_insert_subfix);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(978);
			match(ON);
			setState(979);
			match(DUPLICATE);
			setState(980);
			match(KEY);
			setState(981);
			match(UPDATE);
			setState(982);
			column_spec();
			setState(983);
			match(EQ);
			setState(984);
			expression();
			setState(992);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(985);
				match(COMMA);
				setState(986);
				column_spec();
				setState(987);
				match(EQ);
				setState(988);
				expression();
				}
				}
				setState(994);
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
		enterRule(_localctx, 208, RULE_insert_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(995);
			insert_header();
			setState(997);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(996);
				column_list();
				}
			}

			setState(1001);
			switch (_input.LA(1)) {
			case SELECT:
				{
				setState(999);
				select_expression();
				}
				break;
			case VALUES:
			case VALUE:
				{
				setState(1000);
				value_list_clause();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1004);
			_la = _input.LA(1);
			if (_la==ON) {
				{
				setState(1003);
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
		enterRule(_localctx, 210, RULE_value_list_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1006);
			_la = _input.LA(1);
			if ( !(_la==VALUES || _la==VALUE) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(1007);
			column_value_list();
			setState(1012);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1008);
				match(COMMA);
				setState(1009);
				column_value_list();
				}
				}
				setState(1014);
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
		enterRule(_localctx, 212, RULE_column_value_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1015);
			match(LPAREN);
			setState(1018);
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
			case USER_VAR:
				{
				setState(1016);
				bit_expr();
				}
				break;
			case DEFAULT:
				{
				setState(1017);
				match(DEFAULT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1027);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1020);
				match(COMMA);
				setState(1023);
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
				case USER_VAR:
					{
					setState(1021);
					bit_expr();
					}
					break;
				case DEFAULT:
					{
					setState(1022);
					match(DEFAULT);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(1029);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1030);
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
		enterRule(_localctx, 214, RULE_set_columns_cluase);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1032);
			match(SET);
			setState(1033);
			set_column_cluase();
			setState(1038);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1034);
				match(COMMA);
				setState(1035);
				set_column_cluase();
				}
				}
				setState(1040);
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
		enterRule(_localctx, 216, RULE_set_column_cluase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1041);
			column_spec();
			setState(1042);
			match(EQ);
			setState(1045);
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
			case USER_VAR:
				{
				setState(1043);
				expression();
				}
				break;
			case DEFAULT:
				{
				setState(1044);
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
		enterRule(_localctx, 218, RULE_create_database_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1047);
			match(CREATE);
			setState(1048);
			_la = _input.LA(1);
			if ( !(_la==DATABASE || _la==SCHEMA) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(1052);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(1049);
				match(IF);
				setState(1050);
				match(NOT);
				setState(1051);
				match(EXISTS);
				}
			}

			setState(1054);
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
		enterRule(_localctx, 220, RULE_drop_database_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1056);
			match(DROP);
			setState(1057);
			_la = _input.LA(1);
			if ( !(_la==DATABASE || _la==SCHEMA) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(1060);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(1058);
				match(IF);
				setState(1059);
				match(EXISTS);
				}
			}

			setState(1062);
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
		enterRule(_localctx, 222, RULE_create_table_statement);
		try {
			setState(1067);
			switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1064);
				create_table_statement1();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1065);
				create_table_statement2();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1066);
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
		enterRule(_localctx, 224, RULE_create_table_statement1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1069);
			match(CREATE);
			setState(1071);
			_la = _input.LA(1);
			if (_la==TEMPORARY) {
				{
				setState(1070);
				match(TEMPORARY);
				}
			}

			setState(1074);
			_la = _input.LA(1);
			if (_la==EXTERNAL) {
				{
				setState(1073);
				match(EXTERNAL);
				}
			}

			setState(1076);
			match(TABLE);
			setState(1080);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(1077);
				match(IF);
				setState(1078);
				match(NOT);
				setState(1079);
				match(EXISTS);
				}
			}

			setState(1085);
			switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
			case 1:
				{
				setState(1082);
				database_name();
				setState(1083);
				match(DOT);
				}
				break;
			}
			setState(1087);
			table_name();
			setState(1088);
			match(LPAREN);
			setState(1089);
			create_definition();
			setState(1094);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1090);
				match(COMMA);
				setState(1091);
				create_definition();
				}
				}
				setState(1096);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1097);
			match(RPAREN);
			setState(1100);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(1098);
				match(AS);
				setState(1099);
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
		enterRule(_localctx, 226, RULE_create_table_statement2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1102);
			match(CREATE);
			setState(1104);
			_la = _input.LA(1);
			if (_la==TEMPORARY) {
				{
				setState(1103);
				match(TEMPORARY);
				}
			}

			setState(1107);
			_la = _input.LA(1);
			if (_la==EXTERNAL) {
				{
				setState(1106);
				match(EXTERNAL);
				}
			}

			setState(1109);
			match(TABLE);
			setState(1113);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(1110);
				match(IF);
				setState(1111);
				match(NOT);
				setState(1112);
				match(EXISTS);
				}
			}

			setState(1115);
			table_name();
			setState(1116);
			match(AS);
			setState(1117);
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
		enterRule(_localctx, 228, RULE_create_table_statement3);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1119);
			match(CREATE);
			setState(1121);
			_la = _input.LA(1);
			if (_la==TEMPORARY) {
				{
				setState(1120);
				match(TEMPORARY);
				}
			}

			setState(1124);
			_la = _input.LA(1);
			if (_la==EXTERNAL) {
				{
				setState(1123);
				match(EXTERNAL);
				}
			}

			setState(1126);
			match(TABLE);
			setState(1130);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(1127);
				match(IF);
				setState(1128);
				match(NOT);
				setState(1129);
				match(EXISTS);
				}
			}

			setState(1132);
			table_name();
			setState(1140);
			switch (_input.LA(1)) {
			case LIKE:
				{
				{
				setState(1133);
				match(LIKE);
				setState(1134);
				table_name();
				}
				}
				break;
			case LPAREN:
				{
				{
				setState(1135);
				match(LPAREN);
				setState(1136);
				match(LIKE);
				setState(1137);
				table_name();
				setState(1138);
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
		enterRule(_localctx, 230, RULE_create_definition);
		int _la;
		try {
			setState(1168);
			switch (_input.LA(1)) {
			case USE:
			case USER:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1142);
				column_name();
				setState(1143);
				column_definition();
				}
				}
				break;
			case INDEX:
			case KEY:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(1145);
				_la = _input.LA(1);
				if ( !(_la==INDEX || _la==KEY) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(1147);
				_la = _input.LA(1);
				if (_la==USE || _la==USER || _la==ID) {
					{
					setState(1146);
					index_name();
					}
				}

				setState(1150);
				_la = _input.LA(1);
				if (_la==USING) {
					{
					setState(1149);
					index_type();
					}
				}

				setState(1152);
				match(LPAREN);
				setState(1153);
				index_column_name();
				setState(1158);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1154);
					match(COMMA);
					setState(1155);
					index_column_name();
					}
					}
					setState(1160);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1161);
				match(RPAREN);
				setState(1165);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==USING || _la==COMMENT) {
					{
					{
					setState(1162);
					index_option();
					}
					}
					setState(1167);
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
		enterRule(_localctx, 232, RULE_column_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1170);
			column_data_type_header();
			setState(1173);
			_la = _input.LA(1);
			if (_la==COMMENT) {
				{
				setState(1171);
				match(COMMENT);
				setState(1172);
				match(TEXT_STRING);
				}
			}

			setState(1176);
			_la = _input.LA(1);
			if (_la==REFERENCES) {
				{
				setState(1175);
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
		enterRule(_localctx, 234, RULE_null_or_notnull);
		try {
			setState(1181);
			switch (_input.LA(1)) {
			case NOT:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1178);
				match(NOT);
				setState(1179);
				match(NULL);
				}
				}
				break;
			case NULL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1180);
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
		enterRule(_localctx, 236, RULE_column_data_type_header);
		int _la;
		try {
			setState(1367);
			switch (_input.LA(1)) {
			case TINYINT:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1183);
				match(TINYINT);
				setState(1188);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(1184);
					match(LPAREN);
					setState(1185);
					length();
					setState(1186);
					match(RPAREN);
					}
				}

				setState(1191);
				_la = _input.LA(1);
				if (_la==UNSIGNED) {
					{
					setState(1190);
					match(UNSIGNED);
					}
				}

				setState(1194);
				_la = _input.LA(1);
				if (_la==NOT || _la==NULL) {
					{
					setState(1193);
					null_or_notnull();
					}
				}

				setState(1198);
				_la = _input.LA(1);
				if (_la==DEFAULT) {
					{
					setState(1196);
					match(DEFAULT);
					setState(1197);
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
				setState(1200);
				match(SMALLINT);
				setState(1205);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(1201);
					match(LPAREN);
					setState(1202);
					length();
					setState(1203);
					match(RPAREN);
					}
				}

				setState(1208);
				_la = _input.LA(1);
				if (_la==UNSIGNED) {
					{
					setState(1207);
					match(UNSIGNED);
					}
				}

				setState(1211);
				_la = _input.LA(1);
				if (_la==NOT || _la==NULL) {
					{
					setState(1210);
					null_or_notnull();
					}
				}

				setState(1215);
				_la = _input.LA(1);
				if (_la==DEFAULT) {
					{
					setState(1213);
					match(DEFAULT);
					setState(1214);
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
				setState(1217);
				match(INT);
				setState(1222);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(1218);
					match(LPAREN);
					setState(1219);
					length();
					setState(1220);
					match(RPAREN);
					}
				}

				setState(1225);
				_la = _input.LA(1);
				if (_la==UNSIGNED) {
					{
					setState(1224);
					match(UNSIGNED);
					}
				}

				setState(1228);
				_la = _input.LA(1);
				if (_la==NOT || _la==NULL) {
					{
					setState(1227);
					null_or_notnull();
					}
				}

				setState(1232);
				_la = _input.LA(1);
				if (_la==DEFAULT) {
					{
					setState(1230);
					match(DEFAULT);
					setState(1231);
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
				setState(1234);
				match(BIGINT);
				setState(1239);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(1235);
					match(LPAREN);
					setState(1236);
					length();
					setState(1237);
					match(RPAREN);
					}
				}

				setState(1242);
				_la = _input.LA(1);
				if (_la==UNSIGNED) {
					{
					setState(1241);
					match(UNSIGNED);
					}
				}

				setState(1245);
				_la = _input.LA(1);
				if (_la==NOT || _la==NULL) {
					{
					setState(1244);
					null_or_notnull();
					}
				}

				setState(1249);
				_la = _input.LA(1);
				if (_la==DEFAULT) {
					{
					setState(1247);
					match(DEFAULT);
					setState(1248);
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
				setState(1251);
				match(DOUBLE);
				setState(1258);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(1252);
					match(LPAREN);
					setState(1253);
					length();
					setState(1254);
					match(COMMA);
					setState(1255);
					number_literal();
					setState(1256);
					match(RPAREN);
					}
				}

				setState(1261);
				_la = _input.LA(1);
				if (_la==UNSIGNED) {
					{
					setState(1260);
					match(UNSIGNED);
					}
				}

				setState(1264);
				_la = _input.LA(1);
				if (_la==NOT || _la==NULL) {
					{
					setState(1263);
					null_or_notnull();
					}
				}

				setState(1268);
				_la = _input.LA(1);
				if (_la==DEFAULT) {
					{
					setState(1266);
					match(DEFAULT);
					setState(1267);
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
				setState(1270);
				match(FLOAT);
				setState(1277);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(1271);
					match(LPAREN);
					setState(1272);
					length();
					setState(1273);
					match(COMMA);
					setState(1274);
					number_literal();
					setState(1275);
					match(RPAREN);
					}
				}

				setState(1280);
				_la = _input.LA(1);
				if (_la==UNSIGNED) {
					{
					setState(1279);
					match(UNSIGNED);
					}
				}

				setState(1283);
				_la = _input.LA(1);
				if (_la==NOT || _la==NULL) {
					{
					setState(1282);
					null_or_notnull();
					}
				}

				setState(1287);
				_la = _input.LA(1);
				if (_la==DEFAULT) {
					{
					setState(1285);
					match(DEFAULT);
					setState(1286);
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
				setState(1289);
				match(DECIMAL);
				setState(1298);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(1290);
					match(LPAREN);
					setState(1291);
					length();
					setState(1294);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(1292);
						match(COMMA);
						setState(1293);
						number_literal();
						}
					}

					setState(1296);
					match(RPAREN);
					}
				}

				setState(1301);
				_la = _input.LA(1);
				if (_la==UNSIGNED) {
					{
					setState(1300);
					match(UNSIGNED);
					}
				}

				setState(1304);
				_la = _input.LA(1);
				if (_la==NOT || _la==NULL) {
					{
					setState(1303);
					null_or_notnull();
					}
				}

				setState(1308);
				_la = _input.LA(1);
				if (_la==DEFAULT) {
					{
					setState(1306);
					match(DEFAULT);
					setState(1307);
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
				setState(1310);
				match(DATE);
				setState(1312);
				_la = _input.LA(1);
				if (_la==NOT || _la==NULL) {
					{
					setState(1311);
					null_or_notnull();
					}
				}

				setState(1316);
				_la = _input.LA(1);
				if (_la==DEFAULT) {
					{
					setState(1314);
					match(DEFAULT);
					setState(1315);
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
				setState(1318);
				match(TIMESTAMP);
				setState(1320);
				_la = _input.LA(1);
				if (_la==NOT || _la==NULL) {
					{
					setState(1319);
					null_or_notnull();
					}
				}

				setState(1324);
				_la = _input.LA(1);
				if (_la==DEFAULT) {
					{
					setState(1322);
					match(DEFAULT);
					setState(1323);
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
				setState(1326);
				match(DATETIME);
				setState(1328);
				_la = _input.LA(1);
				if (_la==NOT || _la==NULL) {
					{
					setState(1327);
					null_or_notnull();
					}
				}

				setState(1332);
				_la = _input.LA(1);
				if (_la==DEFAULT) {
					{
					setState(1330);
					match(DEFAULT);
					setState(1331);
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
				setState(1334);
				match(VARCHAR);
				setState(1335);
				match(LPAREN);
				setState(1336);
				varchar_length();
				setState(1337);
				match(RPAREN);
				setState(1339);
				_la = _input.LA(1);
				if (_la==NOT || _la==NULL) {
					{
					setState(1338);
					null_or_notnull();
					}
				}

				setState(1343);
				_la = _input.LA(1);
				if (_la==DEFAULT) {
					{
					setState(1341);
					match(DEFAULT);
					setState(1342);
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
				setState(1345);
				match(BINARY);
				setState(1350);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(1346);
					match(LPAREN);
					setState(1347);
					binary_length();
					setState(1348);
					match(RPAREN);
					}
				}

				setState(1353);
				_la = _input.LA(1);
				if (_la==NOT || _la==NULL) {
					{
					setState(1352);
					null_or_notnull();
					}
				}

				setState(1357);
				_la = _input.LA(1);
				if (_la==DEFAULT) {
					{
					setState(1355);
					match(DEFAULT);
					setState(1356);
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
				setState(1359);
				match(BOOLEAN);
				setState(1361);
				_la = _input.LA(1);
				if (_la==NOT || _la==NULL) {
					{
					setState(1360);
					null_or_notnull();
					}
				}

				setState(1365);
				_la = _input.LA(1);
				if (_la==DEFAULT) {
					{
					setState(1363);
					match(DEFAULT);
					setState(1364);
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
		enterRule(_localctx, 238, RULE_index_column_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1369);
			column_name();
			setState(1373);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(1370);
				match(LPAREN);
				setState(1371);
				match(INTEGER_NUM);
				setState(1372);
				match(RPAREN);
				}
			}

			setState(1376);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(1375);
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
		enterRule(_localctx, 240, RULE_reference_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1378);
			match(REFERENCES);
			setState(1379);
			table_name();
			setState(1380);
			match(LPAREN);
			setState(1381);
			index_column_name();
			setState(1386);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1382);
				match(COMMA);
				setState(1383);
				index_column_name();
				}
				}
				setState(1388);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1389);
			match(RPAREN);
			setState(1393);
			switch ( getInterpreter().adaptivePredict(_input,177,_ctx) ) {
			case 1:
				{
				setState(1390);
				match(ON);
				setState(1391);
				match(DELETE);
				setState(1392);
				reference_option();
				}
				break;
			}
			setState(1398);
			_la = _input.LA(1);
			if (_la==ON) {
				{
				setState(1395);
				match(ON);
				setState(1396);
				match(UPDATE);
				setState(1397);
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
		enterRule(_localctx, 242, RULE_reference_option);
		try {
			setState(1404);
			switch (_input.LA(1)) {
			case RESTRICT:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1400);
				match(RESTRICT);
				}
				}
				break;
			case CASCADE:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(1401);
				match(CASCADE);
				}
				}
				break;
			case SET:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(1402);
				match(SET);
				setState(1403);
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
		enterRule(_localctx, 244, RULE_length);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1406);
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
		enterRule(_localctx, 246, RULE_varchar_length);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1408);
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
		enterRule(_localctx, 248, RULE_binary_length);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1410);
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
		enterRule(_localctx, 250, RULE_alter_table_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1412);
			match(ALTER);
			setState(1413);
			match(TABLE);
			setState(1414);
			table_name();
			setState(1423);
			_la = _input.LA(1);
			if (_la==CHANGE || _la==RENAME) {
				{
				setState(1415);
				alter_table_specification();
				setState(1420);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1416);
					match(COMMA);
					setState(1417);
					alter_table_specification();
					}
					}
					setState(1422);
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
		enterRule(_localctx, 252, RULE_alter_table_specification);
		int _la;
		try {
			setState(1435);
			switch (_input.LA(1)) {
			case RENAME:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1425);
				match(RENAME);
				setState(1426);
				match(TO);
				setState(1427);
				table_name();
				}
				}
				break;
			case CHANGE:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(1428);
				match(CHANGE);
				setState(1430);
				_la = _input.LA(1);
				if (_la==COLUMN) {
					{
					setState(1429);
					match(COLUMN);
					}
				}

				setState(1432);
				column_name();
				setState(1433);
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
		enterRule(_localctx, 254, RULE_index_column_names);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1437);
			index_column_name();
			setState(1442);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1438);
				match(COMMA);
				setState(1439);
				index_column_name();
				}
				}
				setState(1444);
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
		enterRule(_localctx, 256, RULE_index_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1445);
			match(USING);
			{
			setState(1446);
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
		enterRule(_localctx, 258, RULE_index_option);
		try {
			setState(1451);
			switch (_input.LA(1)) {
			case USING:
				enterOuterAlt(_localctx, 1);
				{
				setState(1448);
				index_type();
				}
				break;
			case COMMENT:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(1449);
				match(COMMENT);
				setState(1450);
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
		enterRule(_localctx, 260, RULE_column_definitions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1453);
			column_name();
			setState(1454);
			column_definition();
			setState(1461);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1455);
				match(COMMA);
				setState(1456);
				column_name();
				setState(1457);
				column_definition();
				}
				}
				setState(1463);
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
		enterRule(_localctx, 262, RULE_rename_table_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1464);
			match(RENAME);
			setState(1465);
			match(TABLE);
			setState(1466);
			table_name();
			setState(1467);
			match(TO);
			setState(1468);
			table_name();
			setState(1476);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1469);
				match(COMMA);
				setState(1470);
				table_name();
				setState(1471);
				match(TO);
				setState(1472);
				table_name();
				}
				}
				setState(1478);
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
		enterRule(_localctx, 264, RULE_drop_table_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1479);
			match(DROP);
			setState(1480);
			match(TABLE);
			setState(1483);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(1481);
				match(IF);
				setState(1482);
				match(EXISTS);
				}
			}

			setState(1485);
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
		enterRule(_localctx, 266, RULE_drop_view_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1487);
			match(DROP);
			setState(1488);
			match(VIEW);
			setState(1491);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(1489);
				match(IF);
				setState(1490);
				match(EXISTS);
				}
			}

			setState(1493);
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
		enterRule(_localctx, 268, RULE_truncate_table_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1495);
			match(TRUNCATE);
			setState(1497);
			_la = _input.LA(1);
			if (_la==TABLE) {
				{
				setState(1496);
				match(TABLE);
				}
			}

			setState(1499);
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
		enterRule(_localctx, 270, RULE_create_view_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1501);
			match(CREATE);
			setState(1502);
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
		enterRule(_localctx, 272, RULE_create_view_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1504);
			match(VIEW);
			setState(1508);
			switch ( getInterpreter().adaptivePredict(_input,191,_ctx) ) {
			case 1:
				{
				setState(1505);
				database_name();
				setState(1506);
				match(DOT);
				}
				break;
			}
			setState(1510);
			view_name();
			setState(1514);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(1511);
				match(IF);
				setState(1512);
				match(NOT);
				setState(1513);
				match(EXISTS);
				}
			}

			setState(1517);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(1516);
				column_list();
				}
			}

			setState(1519);
			match(AS);
			setState(1520);
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
		enterRule(_localctx, 274, RULE_alter_view_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1522);
			match(ALTER);
			setState(1523);
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
		public TerminalNode ID() { return getToken(uniformSQLParser.ID, 0); }
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
		enterRule(_localctx, 276, RULE_create_event_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1525);
			match(CREATE);
			setState(1526);
			match(USER);
			setState(1527);
			user_name();
			setState(1528);
			match(IDENTIFIED);
			setState(1529);
			match(BY);
			setState(1530);
			match(ID);
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
		enterRule(_localctx, 278, RULE_drop_event_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1532);
			match(DROP);
			setState(1533);
			match(USER);
			setState(1534);
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
		enterRule(_localctx, 280, RULE_grant_event_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1536);
			match(GRANT);
			setState(1537);
			priv_type();
			setState(1542);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1538);
				match(COMMA);
				setState(1539);
				priv_type();
				}
				}
				setState(1544);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1545);
			match(ON);
			setState(1548);
			switch ( getInterpreter().adaptivePredict(_input,195,_ctx) ) {
			case 1:
				{
				setState(1546);
				table_name();
				}
				break;
			case 2:
				{
				setState(1547);
				view_name();
				}
				break;
			}
			setState(1550);
			match(TO);
			setState(1551);
			principal_specification();
			setState(1556);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1552);
				match(COMMA);
				setState(1553);
				principal_specification();
				}
				}
				setState(1558);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1562);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(1559);
				match(WITH);
				setState(1560);
				match(GRANT);
				setState(1561);
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
		public TerminalNode USER() { return getToken(uniformSQLParser.USER, 0); }
		public User_nameContext user_name() {
			return getRuleContext(User_nameContext.class,0);
		}
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
		enterRule(_localctx, 282, RULE_principal_specification);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1564);
			match(USER);
			setState(1565);
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
		enterRule(_localctx, 284, RULE_revoke_event_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1567);
			match(REVOKE);
			setState(1571);
			_la = _input.LA(1);
			if (_la==GRANT) {
				{
				setState(1568);
				match(GRANT);
				setState(1569);
				match(OPTION);
				setState(1570);
				match(FOR);
				}
			}

			setState(1573);
			priv_type();
			setState(1578);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1574);
				match(COMMA);
				setState(1575);
				priv_type();
				}
				}
				setState(1580);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1581);
			match(ON);
			setState(1584);
			switch ( getInterpreter().adaptivePredict(_input,200,_ctx) ) {
			case 1:
				{
				setState(1582);
				table_name();
				}
				break;
			case 2:
				{
				setState(1583);
				view_name();
				}
				break;
			}
			setState(1586);
			match(FROM);
			setState(1587);
			principal_specification();
			setState(1591);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==USER) {
				{
				{
				setState(1588);
				principal_specification();
				}
				}
				setState(1593);
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
		enterRule(_localctx, 286, RULE_show_event_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1594);
			match(SHOW);
			setState(1595);
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
		public Delimeted_IDContext delimeted_ID() {
			return getRuleContext(Delimeted_IDContext.class,0);
		}
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
		enterRule(_localctx, 288, RULE_show_specification);
		int _la;
		try {
			setState(1628);
			switch (_input.LA(1)) {
			case CREATE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1597);
				match(CREATE);
				setState(1598);
				_la = _input.LA(1);
				if ( !(_la==TABLE || _la==VIEW) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(1602);
				switch ( getInterpreter().adaptivePredict(_input,202,_ctx) ) {
				case 1:
					{
					setState(1599);
					database_name();
					setState(1600);
					match(DOT);
					}
					break;
				}
				setState(1604);
				table_name();
				}
				break;
			case COLUMNS:
				enterOuterAlt(_localctx, 2);
				{
				setState(1605);
				match(COLUMNS);
				setState(1606);
				match(FROM);
				setState(1607);
				table_name();
				setState(1610);
				_la = _input.LA(1);
				if (_la==FROM) {
					{
					setState(1608);
					match(FROM);
					setState(1609);
					database_name();
					}
				}

				}
				break;
			case DATABASES:
			case SCHEMAS:
				enterOuterAlt(_localctx, 3);
				{
				setState(1612);
				_la = _input.LA(1);
				if ( !(_la==DATABASES || _la==SCHEMAS) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(1613);
				match(LIKE);
				setState(1614);
				delimeted_ID();
				}
				break;
			case SERVER:
				enterOuterAlt(_localctx, 4);
				{
				setState(1615);
				match(SERVER);
				setState(1616);
				match(ALIASES);
				}
				break;
			case GRANT:
				enterOuterAlt(_localctx, 5);
				{
				setState(1617);
				match(GRANT);
				setState(1620);
				switch ( getInterpreter().adaptivePredict(_input,204,_ctx) ) {
				case 1:
					{
					setState(1618);
					principal_name();
					}
					break;
				case 2:
					{
					setState(1619);
					principal_specification();
					}
					break;
				}
				setState(1622);
				match(ON);
				setState(1626);
				switch (_input.LA(1)) {
				case ALL:
					{
					setState(1623);
					match(ALL);
					}
					break;
				case TABLE:
					{
					setState(1624);
					match(TABLE);
					setState(1625);
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
		enterRule(_localctx, 290, RULE_set_event_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1630);
			match(SET);
			setState(1631);
			match(TABLE);
			setState(1632);
			table_name();
			setState(1633);
			match(TO);
			setState(1634);
			server_alias();
			setState(1635);
			match(DOT);
			setState(1636);
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
		enterRule(_localctx, 292, RULE_use_event_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1638);
			match(USE);
			setState(1639);
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
		enterRule(_localctx, 294, RULE_service_event_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1641);
			match(SERVER);
			setState(1642);
			match(ALIAS);
			setState(1643);
			server_alias();
			setState(1644);
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
		enterRule(_localctx, 296, RULE_update_statements);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1646);
			match(UPDATE);
			setState(1647);
			database_name();
			setState(1648);
			match(DOT);
			setState(1649);
			user_name();
			setState(1650);
			set_columns_cluase();
			setState(1651);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\u014e\u0678\4\2\t"+
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
		"\4\u0093\t\u0093\4\u0094\t\u0094\4\u0095\t\u0095\4\u0096\t\u0096\3\2\3"+
		"\2\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\5\5\u0142\n\5\3\6\3\6\3\7\3\7\5\7\u0148\n\7\3\7\3\7\5\7\u014c"+
		"\n\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u0154\n\7\5\7\u0156\n\7\5\7\u0158\n\7"+
		"\3\b\3\b\3\t\3\t\3\n\5\n\u015f\n\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\5\16\u016f\n\16\3\17\3\17\3\17\3\17\3\17"+
		"\5\17\u0176\n\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25"+
		"\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34"+
		"\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3"+
		"%\3%\3&\3&\3\'\3\'\3(\5(\u01a9\n(\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-"+
		"\3.\3.\5.\u01b9\n.\3/\3/\3\60\3\60\3\60\7\60\u01c0\n\60\f\60\16\60\u01c3"+
		"\13\60\3\61\3\61\3\61\7\61\u01c8\n\61\f\61\16\61\u01cb\13\61\3\62\3\62"+
		"\3\62\7\62\u01d0\n\62\f\62\16\62\u01d3\13\62\3\63\5\63\u01d6\n\63\3\63"+
		"\3\63\3\64\3\64\3\64\5\64\u01dd\n\64\3\64\3\64\5\64\u01e1\n\64\5\64\u01e3"+
		"\n\64\3\65\3\65\3\65\3\65\3\65\3\65\3\65\5\65\u01ec\n\65\3\65\3\65\3\65"+
		"\5\65\u01f1\n\65\3\65\3\65\3\65\5\65\u01f6\n\65\3\66\3\66\5\66\u01fa\n"+
		"\66\3\66\3\66\3\66\5\66\u01ff\n\66\3\66\3\66\5\66\u0203\n\66\3\66\3\66"+
		"\3\66\3\66\3\66\3\66\3\66\5\66\u020c\n\66\3\66\3\66\3\66\3\66\3\66\5\66"+
		"\u0213\n\66\3\66\3\66\3\66\3\66\5\66\u0219\n\66\3\67\3\67\3\67\5\67\u021e"+
		"\n\67\38\38\38\58\u0223\n8\39\39\39\59\u0228\n9\3:\3:\3:\5:\u022d\n:\3"+
		";\3;\3;\5;\u0232\n;\3<\3<\3<\5<\u0237\n<\3=\3=\3=\5=\u023c\n=\3>\3>\3"+
		"?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\5?\u024b\n?\3@\3@\3@\3@\3@\7@\u0252\n"+
		"@\f@\16@\u0255\13@\5@\u0257\n@\3@\5@\u025a\n@\3@\3@\3@\3@\3@\3@\3@\3@"+
		"\3@\3@\5@\u0266\n@\3@\3@\3@\5@\u026b\n@\3A\3A\5A\u026f\nA\3B\3B\3B\3B"+
		"\3B\3B\6B\u0277\nB\rB\16B\u0278\3B\3B\5B\u027d\nB\3B\3B\3C\3C\3C\3C\3"+
		"C\3C\3C\6C\u0288\nC\rC\16C\u0289\3C\3C\5C\u028e\nC\3C\3C\3D\3D\3D\5D\u0295"+
		"\nD\3D\3D\3D\5D\u029a\nD\3D\3D\3E\3E\3E\3E\7E\u02a2\nE\fE\16E\u02a5\13"+
		"E\3E\3E\3F\3F\3F\3F\3G\3G\3G\7G\u02b0\nG\fG\16G\u02b3\13G\3H\3H\5H\u02b7"+
		"\nH\3I\3I\5I\u02bb\nI\3I\3I\3I\5I\u02c0\nI\5I\u02c2\nI\3J\3J\3J\5J\u02c7"+
		"\nJ\3J\3J\3J\3J\5J\u02cd\nJ\3K\3K\3K\5K\u02d2\nK\5K\u02d4\nK\3K\3K\5K"+
		"\u02d8\nK\3L\3L\5L\u02dc\nL\3L\3L\3L\3L\3L\3L\3L\3L\5L\u02e6\nL\3M\3M"+
		"\3M\3N\3N\3N\7N\u02ee\nN\fN\16N\u02f1\13N\3O\3O\3O\3O\3O\3O\3O\5O\u02fa"+
		"\nO\5O\u02fc\nO\3P\3P\3P\3P\5P\u0302\nP\3P\3P\3P\3P\3P\3P\3P\3P\5P\u030c"+
		"\nP\3Q\3Q\3Q\7Q\u0311\nQ\fQ\16Q\u0314\13Q\3R\3R\3R\3R\3R\3S\3S\3S\7S\u031e"+
		"\nS\fS\16S\u0321\13S\3T\3T\5T\u0325\nT\3T\5T\u0328\nT\3U\3U\3U\5U\u032d"+
		"\nU\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\5V\u033e\nV\3W\3W\3W"+
		"\5W\u0343\nW\3W\7W\u0346\nW\fW\16W\u0349\13W\3X\3X\5X\u034d\nX\3X\3X\3"+
		"X\3X\5X\u0353\nX\3X\5X\u0356\nX\3X\5X\u0359\nX\5X\u035b\nX\3X\5X\u035e"+
		"\nX\3X\5X\u0361\nX\3Y\3Y\3Y\3Z\3Z\3Z\3Z\3Z\7Z\u036b\nZ\fZ\16Z\u036e\13"+
		"Z\3Z\3Z\5Z\u0372\nZ\3[\3[\3[\5[\u0377\n[\3\\\3\\\3\\\3]\3]\3]\3]\3]\7"+
		"]\u0381\n]\f]\16]\u0384\13]\3^\3^\5^\u0388\n^\3_\3_\3_\3_\5_\u038e\n_"+
		"\3_\3_\3`\3`\3a\3a\3b\3b\3b\7b\u0399\nb\fb\16b\u039c\13b\3b\5b\u039f\n"+
		"b\3c\3c\3c\3c\7c\u03a5\nc\fc\16c\u03a8\13c\3c\3c\3d\3d\3d\3d\3e\3e\3e"+
		"\5e\u03b3\ne\3e\3e\3f\3f\3f\3f\3f\3f\5f\u03bd\nf\3f\3f\5f\u03c1\nf\5f"+
		"\u03c3\nf\3g\3g\3h\3h\5h\u03c9\nh\3h\5h\u03cc\nh\3h\5h\u03cf\nh\3h\3h"+
		"\5h\u03d3\nh\3i\3i\3i\3i\3i\3i\3i\3i\3i\3i\3i\3i\7i\u03e1\ni\fi\16i\u03e4"+
		"\13i\3j\3j\5j\u03e8\nj\3j\3j\5j\u03ec\nj\3j\5j\u03ef\nj\3k\3k\3k\3k\7"+
		"k\u03f5\nk\fk\16k\u03f8\13k\3l\3l\3l\5l\u03fd\nl\3l\3l\3l\5l\u0402\nl"+
		"\7l\u0404\nl\fl\16l\u0407\13l\3l\3l\3m\3m\3m\3m\7m\u040f\nm\fm\16m\u0412"+
		"\13m\3n\3n\3n\3n\5n\u0418\nn\3o\3o\3o\3o\3o\5o\u041f\no\3o\3o\3p\3p\3"+
		"p\3p\5p\u0427\np\3p\3p\3q\3q\3q\5q\u042e\nq\3r\3r\5r\u0432\nr\3r\5r\u0435"+
		"\nr\3r\3r\3r\3r\5r\u043b\nr\3r\3r\3r\5r\u0440\nr\3r\3r\3r\3r\3r\7r\u0447"+
		"\nr\fr\16r\u044a\13r\3r\3r\3r\5r\u044f\nr\3s\3s\5s\u0453\ns\3s\5s\u0456"+
		"\ns\3s\3s\3s\3s\5s\u045c\ns\3s\3s\3s\3s\3t\3t\5t\u0464\nt\3t\5t\u0467"+
		"\nt\3t\3t\3t\3t\5t\u046d\nt\3t\3t\3t\3t\3t\3t\3t\3t\5t\u0477\nt\3u\3u"+
		"\3u\3u\3u\5u\u047e\nu\3u\5u\u0481\nu\3u\3u\3u\3u\7u\u0487\nu\fu\16u\u048a"+
		"\13u\3u\3u\7u\u048e\nu\fu\16u\u0491\13u\5u\u0493\nu\3v\3v\3v\5v\u0498"+
		"\nv\3v\5v\u049b\nv\3w\3w\3w\5w\u04a0\nw\3x\3x\3x\3x\3x\5x\u04a7\nx\3x"+
		"\5x\u04aa\nx\3x\5x\u04ad\nx\3x\3x\5x\u04b1\nx\3x\3x\3x\3x\3x\5x\u04b8"+
		"\nx\3x\5x\u04bb\nx\3x\5x\u04be\nx\3x\3x\5x\u04c2\nx\3x\3x\3x\3x\3x\5x"+
		"\u04c9\nx\3x\5x\u04cc\nx\3x\5x\u04cf\nx\3x\3x\5x\u04d3\nx\3x\3x\3x\3x"+
		"\3x\5x\u04da\nx\3x\5x\u04dd\nx\3x\5x\u04e0\nx\3x\3x\5x\u04e4\nx\3x\3x"+
		"\3x\3x\3x\3x\3x\5x\u04ed\nx\3x\5x\u04f0\nx\3x\5x\u04f3\nx\3x\3x\5x\u04f7"+
		"\nx\3x\3x\3x\3x\3x\3x\3x\5x\u0500\nx\3x\5x\u0503\nx\3x\5x\u0506\nx\3x"+
		"\3x\5x\u050a\nx\3x\3x\3x\3x\3x\5x\u0511\nx\3x\3x\5x\u0515\nx\3x\5x\u0518"+
		"\nx\3x\5x\u051b\nx\3x\3x\5x\u051f\nx\3x\3x\5x\u0523\nx\3x\3x\5x\u0527"+
		"\nx\3x\3x\5x\u052b\nx\3x\3x\5x\u052f\nx\3x\3x\5x\u0533\nx\3x\3x\5x\u0537"+
		"\nx\3x\3x\3x\3x\3x\5x\u053e\nx\3x\3x\5x\u0542\nx\3x\3x\3x\3x\3x\5x\u0549"+
		"\nx\3x\5x\u054c\nx\3x\3x\5x\u0550\nx\3x\3x\5x\u0554\nx\3x\3x\5x\u0558"+
		"\nx\5x\u055a\nx\3y\3y\3y\3y\5y\u0560\ny\3y\5y\u0563\ny\3z\3z\3z\3z\3z"+
		"\3z\7z\u056b\nz\fz\16z\u056e\13z\3z\3z\3z\3z\5z\u0574\nz\3z\3z\3z\5z\u0579"+
		"\nz\3{\3{\3{\3{\5{\u057f\n{\3|\3|\3}\3}\3~\3~\3\177\3\177\3\177\3\177"+
		"\3\177\3\177\7\177\u058d\n\177\f\177\16\177\u0590\13\177\5\177\u0592\n"+
		"\177\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\5\u0080\u0599\n\u0080\3\u0080"+
		"\3\u0080\3\u0080\5\u0080\u059e\n\u0080\3\u0081\3\u0081\3\u0081\7\u0081"+
		"\u05a3\n\u0081\f\u0081\16\u0081\u05a6\13\u0081\3\u0082\3\u0082\3\u0082"+
		"\3\u0083\3\u0083\3\u0083\5\u0083\u05ae\n\u0083\3\u0084\3\u0084\3\u0084"+
		"\3\u0084\3\u0084\3\u0084\7\u0084\u05b6\n\u0084\f\u0084\16\u0084\u05b9"+
		"\13\u0084\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085"+
		"\3\u0085\3\u0085\7\u0085\u05c5\n\u0085\f\u0085\16\u0085\u05c8\13\u0085"+
		"\3\u0086\3\u0086\3\u0086\3\u0086\5\u0086\u05ce\n\u0086\3\u0086\3\u0086"+
		"\3\u0087\3\u0087\3\u0087\3\u0087\5\u0087\u05d6\n\u0087\3\u0087\3\u0087"+
		"\3\u0088\3\u0088\5\u0088\u05dc\n\u0088\3\u0088\3\u0088\3\u0089\3\u0089"+
		"\3\u0089\3\u008a\3\u008a\3\u008a\3\u008a\5\u008a\u05e7\n\u008a\3\u008a"+
		"\3\u008a\3\u008a\3\u008a\5\u008a\u05ed\n\u008a\3\u008a\5\u008a\u05f0\n"+
		"\u008a\3\u008a\3\u008a\3\u008a\3\u008b\3\u008b\3\u008b\3\u008c\3\u008c"+
		"\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008d\3\u008d\3\u008d\3\u008d"+
		"\3\u008e\3\u008e\3\u008e\3\u008e\7\u008e\u0607\n\u008e\f\u008e\16\u008e"+
		"\u060a\13\u008e\3\u008e\3\u008e\3\u008e\5\u008e\u060f\n\u008e\3\u008e"+
		"\3\u008e\3\u008e\3\u008e\7\u008e\u0615\n\u008e\f\u008e\16\u008e\u0618"+
		"\13\u008e\3\u008e\3\u008e\3\u008e\5\u008e\u061d\n\u008e\3\u008f\3\u008f"+
		"\3\u008f\3\u0090\3\u0090\3\u0090\3\u0090\5\u0090\u0626\n\u0090\3\u0090"+
		"\3\u0090\3\u0090\7\u0090\u062b\n\u0090\f\u0090\16\u0090\u062e\13\u0090"+
		"\3\u0090\3\u0090\3\u0090\5\u0090\u0633\n\u0090\3\u0090\3\u0090\3\u0090"+
		"\7\u0090\u0638\n\u0090\f\u0090\16\u0090\u063b\13\u0090\3\u0091\3\u0091"+
		"\3\u0091\3\u0092\3\u0092\3\u0092\3\u0092\3\u0092\5\u0092\u0645\n\u0092"+
		"\3\u0092\3\u0092\3\u0092\3\u0092\3\u0092\3\u0092\5\u0092\u064d\n\u0092"+
		"\3\u0092\3\u0092\3\u0092\3\u0092\3\u0092\3\u0092\3\u0092\3\u0092\5\u0092"+
		"\u0657\n\u0092\3\u0092\3\u0092\3\u0092\3\u0092\5\u0092\u065d\n\u0092\5"+
		"\u0092\u065f\n\u0092\3\u0093\3\u0093\3\u0093\3\u0093\3\u0093\3\u0093\3"+
		"\u0093\3\u0093\3\u0094\3\u0094\3\u0094\3\u0095\3\u0095\3\u0095\3\u0095"+
		"\3\u0095\3\u0096\3\u0096\3\u0096\3\u0096\3\u0096\3\u0096\3\u0096\3\u0096"+
		"\2\2\u0097\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\66"+
		"8:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a"+
		"\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2"+
		"\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba"+
		"\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2"+
		"\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea"+
		"\u00ec\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa\u00fc\u00fe\u0100\u0102"+
		"\u0104\u0106\u0108\u010a\u010c\u010e\u0110\u0112\u0114\u0116\u0118\u011a"+
		"\u011c\u011e\u0120\u0122\u0124\u0126\u0128\u012a\2\32\4\2\u00cf\u00cf"+
		"\u00e7\u00e7\4\2\u0128\u012b\u013f\u0140\4\2\u0108\u010c\u010e\u010e\3"+
		"\2\u0139\u013a\4\2\u0142\u0142\u0147\u0147\3\2\4\5\3\2\u00ed\u00fc\3\2"+
		"\u00fd\u0105\3\2\u0107\u0110\3\2\u0112\u0116\7\2\6\6\24\24\26\26\u00a4"+
		"\u00a4\u00d2\u00d2\3\2\u012d\u012e\5\2\u0122\u0123\u0134\u0134\u013e\u013e"+
		"\4\2\u00c2\u00c2\u0139\u013b\5\2\6\6\25\25\u0134\u0134\3\2\34\36\4\2%"+
		"%jj\4\2\6\6\25\25\3\2\13\f\3\2\u011e\u011f\3\2\u011c\u011d\4\2\u00a9\u00a9"+
		"\u00ac\u00ac\4\2\"\"\u00a7\u00a7\4\2\u00aa\u00aa\u00ad\u00ad\u06f6\2\u012c"+
		"\3\2\2\2\4\u012e\3\2\2\2\6\u0132\3\2\2\2\b\u0141\3\2\2\2\n\u0143\3\2\2"+
		"\2\f\u0157\3\2\2\2\16\u0159\3\2\2\2\20\u015b\3\2\2\2\22\u015e\3\2\2\2"+
		"\24\u0162\3\2\2\2\26\u0164\3\2\2\2\30\u0166\3\2\2\2\32\u016e\3\2\2\2\34"+
		"\u0175\3\2\2\2\36\u0177\3\2\2\2 \u0179\3\2\2\2\"\u017b\3\2\2\2$\u017d"+
		"\3\2\2\2&\u017f\3\2\2\2(\u0181\3\2\2\2*\u0183\3\2\2\2,\u0185\3\2\2\2."+
		"\u0187\3\2\2\2\60\u0189\3\2\2\2\62\u018b\3\2\2\2\64\u018d\3\2\2\2\66\u018f"+
		"\3\2\2\28\u0191\3\2\2\2:\u0193\3\2\2\2<\u0195\3\2\2\2>\u0197\3\2\2\2@"+
		"\u0199\3\2\2\2B\u019b\3\2\2\2D\u019d\3\2\2\2F\u019f\3\2\2\2H\u01a1\3\2"+
		"\2\2J\u01a3\3\2\2\2L\u01a5\3\2\2\2N\u01a8\3\2\2\2P\u01ac\3\2\2\2R\u01ae"+
		"\3\2\2\2T\u01b0\3\2\2\2V\u01b2\3\2\2\2X\u01b4\3\2\2\2Z\u01b8\3\2\2\2\\"+
		"\u01ba\3\2\2\2^\u01bc\3\2\2\2`\u01c4\3\2\2\2b\u01cc\3\2\2\2d\u01d5\3\2"+
		"\2\2f\u01d9\3\2\2\2h\u01f5\3\2\2\2j\u0218\3\2\2\2l\u021a\3\2\2\2n\u021f"+
		"\3\2\2\2p\u0224\3\2\2\2r\u0229\3\2\2\2t\u022e\3\2\2\2v\u0233\3\2\2\2x"+
		"\u023b\3\2\2\2z\u023d\3\2\2\2|\u024a\3\2\2\2~\u026a\3\2\2\2\u0080\u026e"+
		"\3\2\2\2\u0082\u0270\3\2\2\2\u0084\u0280\3\2\2\2\u0086\u0299\3\2\2\2\u0088"+
		"\u029d\3\2\2\2\u008a\u02a8\3\2\2\2\u008c\u02ac\3\2\2\2\u008e\u02b6\3\2"+
		"\2\2\u0090\u02b8\3\2\2\2\u0092\u02c3\3\2\2\2\u0094\u02ce\3\2\2\2\u0096"+
		"\u02e5\3\2\2\2\u0098\u02e7\3\2\2\2\u009a\u02ea\3\2\2\2\u009c\u02f2\3\2"+
		"\2\2\u009e\u030b\3\2\2\2\u00a0\u030d\3\2\2\2\u00a2\u0315\3\2\2\2\u00a4"+
		"\u031a\3\2\2\2\u00a6\u0324\3\2\2\2\u00a8\u032c\3\2\2\2\u00aa\u033d\3\2"+
		"\2\2\u00ac\u033f\3\2\2\2\u00ae\u034a\3\2\2\2\u00b0\u0362\3\2\2\2\u00b2"+
		"\u0365\3\2\2\2\u00b4\u0376\3\2\2\2\u00b6\u0378\3\2\2\2\u00b8\u037b\3\2"+
		"\2\2\u00ba\u0385\3\2\2\2\u00bc\u0389\3\2\2\2\u00be\u0391\3\2\2\2\u00c0"+
		"\u0393\3\2\2\2\u00c2\u039e\3\2\2\2\u00c4\u03a0\3\2\2\2\u00c6\u03ab\3\2"+
		"\2\2\u00c8\u03b2\3\2\2\2\u00ca\u03c2\3\2\2\2\u00cc\u03c4\3\2\2\2\u00ce"+
		"\u03c6\3\2\2\2\u00d0\u03d4\3\2\2\2\u00d2\u03e5\3\2\2\2\u00d4\u03f0\3\2"+
		"\2\2\u00d6\u03f9\3\2\2\2\u00d8\u040a\3\2\2\2\u00da\u0413\3\2\2\2\u00dc"+
		"\u0419\3\2\2\2\u00de\u0422\3\2\2\2\u00e0\u042d\3\2\2\2\u00e2\u042f\3\2"+
		"\2\2\u00e4\u0450\3\2\2\2\u00e6\u0461\3\2\2\2\u00e8\u0492\3\2\2\2\u00ea"+
		"\u0494\3\2\2\2\u00ec\u049f\3\2\2\2\u00ee\u0559\3\2\2\2\u00f0\u055b\3\2"+
		"\2\2\u00f2\u0564\3\2\2\2\u00f4\u057e\3\2\2\2\u00f6\u0580\3\2\2\2\u00f8"+
		"\u0582\3\2\2\2\u00fa\u0584\3\2\2\2\u00fc\u0586\3\2\2\2\u00fe\u059d\3\2"+
		"\2\2\u0100\u059f\3\2\2\2\u0102\u05a7\3\2\2\2\u0104\u05ad\3\2\2\2\u0106"+
		"\u05af\3\2\2\2\u0108\u05ba\3\2\2\2\u010a\u05c9\3\2\2\2\u010c\u05d1\3\2"+
		"\2\2\u010e\u05d9\3\2\2\2\u0110\u05df\3\2\2\2\u0112\u05e2\3\2\2\2\u0114"+
		"\u05f4\3\2\2\2\u0116\u05f7\3\2\2\2\u0118\u05fe\3\2\2\2\u011a\u0602\3\2"+
		"\2\2\u011c\u061e\3\2\2\2\u011e\u0621\3\2\2\2\u0120\u063c\3\2\2\2\u0122"+
		"\u065e\3\2\2\2\u0124\u0660\3\2\2\2\u0126\u0668\3\2\2\2\u0128\u066b\3\2"+
		"\2\2\u012a\u0670\3\2\2\2\u012c\u012d\t\2\2\2\u012d\3\3\2\2\2\u012e\u012f"+
		"\7\3\2\2\u012f\u0130\7\u0149\2\2\u0130\u0131\7\3\2\2\u0131\5\3\2\2\2\u0132"+
		"\u0133\7\u014e\2\2\u0133\7\3\2\2\2\u0134\u0142\3\2\2\2\u0135\u0142\7J"+
		"\2\2\u0136\u0142\7K\2\2\u0137\u0142\7L\2\2\u0138\u0142\7M\2\2\u0139\u0142"+
		"\7I\2\2\u013a\u0142\7N\2\2\u013b\u0142\7O\2\2\u013c\u0142\7P\2\2\u013d"+
		"\u0142\7R\2\2\u013e\u0142\7U\2\2\u013f\u0142\7\u00c2\2\2\u0140\u0142\7"+
		"S\2\2\u0141\u0134\3\2\2\2\u0141\u0135\3\2\2\2\u0141\u0136\3\2\2\2\u0141"+
		"\u0137\3\2\2\2\u0141\u0138\3\2\2\2\u0141\u0139\3\2\2\2\u0141\u013a\3\2"+
		"\2\2\u0141\u013b\3\2\2\2\u0141\u013c\3\2\2\2\u0141\u013d\3\2\2\2\u0141"+
		"\u013e\3\2\2\2\u0141\u013f\3\2\2\2\u0141\u0140\3\2\2\2\u0142\t\3\2\2\2"+
		"\u0143\u0144\t\3\2\2\u0144\13\3\2\2\2\u0145\u0147\7\u00c2\2\2\u0146\u0148"+
		"\7\u0142\2\2\u0147\u0146\3\2\2\2\u0147\u0148\3\2\2\2\u0148\u0158\3\2\2"+
		"\2\u0149\u014b\7\u00ec\2\2\u014a\u014c\7\u0142\2\2\u014b\u014a\3\2\2\2"+
		"\u014b\u014c\3\2\2\2\u014c\u0158\3\2\2\2\u014d\u0158\7P\2\2\u014e\u0158"+
		"\7Q\2\2\u014f\u0155\7S\2\2\u0150\u0153\7\u0142\2\2\u0151\u0152\7\u0133"+
		"\2\2\u0152\u0154\7\u0142\2\2\u0153\u0151\3\2\2\2\u0153\u0154\3\2\2\2\u0154"+
		"\u0156\3\2\2\2\u0155\u0150\3\2\2\2\u0155\u0156\3\2\2\2\u0156\u0158\3\2"+
		"\2\2\u0157\u0145\3\2\2\2\u0157\u0149\3\2\2\2\u0157\u014d\3\2\2\2\u0157"+
		"\u014e\3\2\2\2\u0157\u014f\3\2\2\2\u0158\r\3\2\2\2\u0159\u015a\t\4\2\2"+
		"\u015a\17\3\2\2\2\u015b\u015c\7\u0148\2\2\u015c\21\3\2\2\2\u015d\u015f"+
		"\t\5\2\2\u015e\u015d\3\2\2\2\u015e\u015f\3\2\2\2\u015f\u0160\3\2\2\2\u0160"+
		"\u0161\t\6\2\2\u0161\23\3\2\2\2\u0162\u0163\7\u0145\2\2\u0163\25\3\2\2"+
		"\2\u0164\u0165\t\7\2\2\u0165\27\3\2\2\2\u0166\u0167\7\u0146\2\2\u0167"+
		"\31\3\2\2\2\u0168\u016f\5\20\t\2\u0169\u016f\5\22\n\2\u016a\u016f\5\24"+
		"\13\2\u016b\u016f\5\26\f\2\u016c\u016f\5\30\r\2\u016d\u016f\7:\2\2\u016e"+
		"\u0168\3\2\2\2\u016e\u0169\3\2\2\2\u016e\u016a\3\2\2\2\u016e\u016b\3\2"+
		"\2\2\u016e\u016c\3\2\2\2\u016e\u016d\3\2\2\2\u016f\33\3\2\2\2\u0170\u0176"+
		"\5\36\20\2\u0171\u0176\5 \21\2\u0172\u0176\5\"\22\2\u0173\u0176\5$\23"+
		"\2\u0174\u0176\5&\24\2\u0175\u0170\3\2\2\2\u0175\u0171\3\2\2\2\u0175\u0172"+
		"\3\2\2\2\u0175\u0173\3\2\2\2\u0175\u0174\3\2\2\2\u0176\35\3\2\2\2\u0177"+
		"\u0178\t\b\2\2\u0178\37\3\2\2\2\u0179\u017a\t\t\2\2\u017a!\3\2\2\2\u017b"+
		"\u017c\t\n\2\2\u017c#\3\2\2\2\u017d\u017e\7\u0117\2\2\u017e%\3\2\2\2\u017f"+
		"\u0180\t\13\2\2\u0180\'\3\2\2\2\u0181\u0182\5Z.\2\u0182)\3\2\2\2\u0183"+
		"\u0184\5Z.\2\u0184+\3\2\2\2\u0185\u0186\5Z.\2\u0186-\3\2\2\2\u0187\u0188"+
		"\5Z.\2\u0188/\3\2\2\2\u0189\u018a\5Z.\2\u018a\61\3\2\2\2\u018b\u018c\5"+
		"Z.\2\u018c\63\3\2\2\2\u018d\u018e\5Z.\2\u018e\65\3\2\2\2\u018f\u0190\5"+
		"Z.\2\u0190\67\3\2\2\2\u0191\u0192\5Z.\2\u01929\3\2\2\2\u0193\u0194\5Z"+
		".\2\u0194;\3\2\2\2\u0195\u0196\5Z.\2\u0196=\3\2\2\2\u0197\u0198\5Z.\2"+
		"\u0198?\3\2\2\2\u0199\u019a\5Z.\2\u019aA\3\2\2\2\u019b\u019c\5Z.\2\u019c"+
		"C\3\2\2\2\u019d\u019e\5Z.\2\u019eE\3\2\2\2\u019f\u01a0\5Z.\2\u01a0G\3"+
		"\2\2\2\u01a1\u01a2\5Z.\2\u01a2I\3\2\2\2\u01a3\u01a4\5Z.\2\u01a4K\3\2\2"+
		"\2\u01a5\u01a6\5Z.\2\u01a6M\3\2\2\2\u01a7\u01a9\7\23\2\2\u01a8\u01a7\3"+
		"\2\2\2\u01a8\u01a9\3\2\2\2\u01a9\u01aa\3\2\2\2\u01aa\u01ab\5Z.\2\u01ab"+
		"O\3\2\2\2\u01ac\u01ad\5Z.\2\u01adQ\3\2\2\2\u01ae\u01af\5Z.\2\u01afS\3"+
		"\2\2\2\u01b0\u01b1\5Z.\2\u01b1U\3\2\2\2\u01b2\u01b3\5Z.\2\u01b3W\3\2\2"+
		"\2\u01b4\u01b5\5Z.\2\u01b5Y\3\2\2\2\u01b6\u01b9\7\u0149\2\2\u01b7\u01b9"+
		"\5\2\2\2\u01b8\u01b6\3\2\2\2\u01b8\u01b7\3\2\2\2\u01b9[\3\2\2\2\u01ba"+
		"\u01bb\t\f\2\2\u01bb]\3\2\2\2\u01bc\u01c1\5`\61\2\u01bd\u01be\7\u0124"+
		"\2\2\u01be\u01c0\5`\61\2\u01bf\u01bd\3\2\2\2\u01c0\u01c3\3\2\2\2\u01c1"+
		"\u01bf\3\2\2\2\u01c1\u01c2\3\2\2\2\u01c2_\3\2\2\2\u01c3\u01c1\3\2\2\2"+
		"\u01c4\u01c9\5b\62\2\u01c5\u01c6\7\u0126\2\2\u01c6\u01c8\5b\62\2\u01c7"+
		"\u01c5\3\2\2\2\u01c8\u01cb\3\2\2\2\u01c9\u01c7\3\2\2\2\u01c9\u01ca\3\2"+
		"\2\2\u01caa\3\2\2\2\u01cb\u01c9\3\2\2\2\u01cc\u01d1\5d\63\2\u01cd\u01ce"+
		"\7\u0125\2\2\u01ce\u01d0\5d\63\2\u01cf\u01cd\3\2\2\2\u01d0\u01d3\3\2\2"+
		"\2\u01d1\u01cf\3\2\2\2\u01d1\u01d2\3\2\2\2\u01d2c\3\2\2\2\u01d3\u01d1"+
		"\3\2\2\2\u01d4\u01d6\7\7\2\2\u01d5\u01d4\3\2\2\2\u01d5\u01d6\3\2\2\2\u01d6"+
		"\u01d7\3\2\2\2\u01d7\u01d8\5f\64\2\u01d8e\3\2\2\2\u01d9\u01e2\5h\65\2"+
		"\u01da\u01dc\79\2\2\u01db\u01dd\7\7\2\2\u01dc\u01db\3\2\2\2\u01dc\u01dd"+
		"\3\2\2\2\u01dd\u01e0\3\2\2\2\u01de\u01e1\5\26\f\2\u01df\u01e1\7:\2\2\u01e0"+
		"\u01de\3\2\2\2\u01e0\u01df\3\2\2\2\u01e1\u01e3\3\2\2\2\u01e2\u01da\3\2"+
		"\2\2\u01e2\u01e3\3\2\2\2\u01e3g\3\2\2\2\u01e4\u01e5\5j\66\2\u01e5\u01e6"+
		"\5\n\6\2\u01e6\u01e7\5j\66\2\u01e7\u01f6\3\2\2\2\u01e8\u01e9\5j\66\2\u01e9"+
		"\u01eb\5\n\6\2\u01ea\u01ec\7\6\2\2\u01eb\u01ea\3\2\2\2\u01eb\u01ec\3\2"+
		"\2\2\u01ec\u01ed\3\2\2\2\u01ed\u01ee\5\u00c6d\2\u01ee\u01f6\3\2\2\2\u01ef"+
		"\u01f1\7\7\2\2\u01f0\u01ef\3\2\2\2\u01f0\u01f1\3\2\2\2\u01f1\u01f2\3\2"+
		"\2\2\u01f2\u01f3\7\n\2\2\u01f3\u01f6\5\u00c6d\2\u01f4\u01f6\5j\66\2\u01f5"+
		"\u01e4\3\2\2\2\u01f5\u01e8\3\2\2\2\u01f5\u01f0\3\2\2\2\u01f5\u01f4\3\2"+
		"\2\2\u01f6i\3\2\2\2\u01f7\u01f9\5l\67\2\u01f8\u01fa\7\7\2\2\u01f9\u01f8"+
		"\3\2\2\2\u01f9\u01fa\3\2\2\2\u01fa\u01fb\3\2\2\2\u01fb\u01fe\7\u00a8\2"+
		"\2\u01fc\u01ff\5\u00c6d\2\u01fd\u01ff\5\u0088E\2\u01fe\u01fc\3\2\2\2\u01fe"+
		"\u01fd\3\2\2\2\u01ff\u0219\3\2\2\2\u0200\u0202\5l\67\2\u0201\u0203\7\7"+
		"\2\2\u0202\u0201\3\2\2\2\u0202\u0203\3\2\2\2\u0203\u0204\3\2\2\2\u0204"+
		"\u0205\7\u00c0\2\2\u0205\u0206\5l\67\2\u0206\u0207\7\u0125\2\2\u0207\u0208"+
		"\5j\66\2\u0208\u0219\3\2\2\2\u0209\u020b\5l\67\2\u020a\u020c\7\7\2\2\u020b"+
		"\u020a\3\2\2\2\u020b\u020c\3\2\2\2\u020c\u020d\3\2\2\2\u020d\u020e\7\b"+
		"\2\2\u020e\u020f\5|?\2\u020f\u0219\3\2\2\2\u0210\u0212\5l\67\2\u0211\u0213"+
		"\7\7\2\2\u0212\u0211\3\2\2\2\u0212\u0213\3\2\2\2\u0213\u0214\3\2\2\2\u0214"+
		"\u0215\7\u0085\2\2\u0215\u0216\5l\67\2\u0216\u0219\3\2\2\2\u0217\u0219"+
		"\5l\67\2\u0218\u01f7\3\2\2\2\u0218\u0200\3\2\2\2\u0218\u0209\3\2\2\2\u0218"+
		"\u0210\3\2\2\2\u0218\u0217\3\2\2\2\u0219k\3\2\2\2\u021a\u021d\5n8\2\u021b"+
		"\u021c\7\u013c\2\2\u021c\u021e\5n8\2\u021d\u021b\3\2\2\2\u021d\u021e\3"+
		"\2\2\2\u021em\3\2\2\2\u021f\u0222\5p9\2\u0220\u0221\7\u013d\2\2\u0221"+
		"\u0223\5p9\2\u0222\u0220\3\2\2\2\u0222\u0223\3\2\2\2\u0223o\3\2\2\2\u0224"+
		"\u0227\5r:\2\u0225\u0226\t\r\2\2\u0226\u0228\5r:\2\u0227\u0225\3\2\2\2"+
		"\u0227\u0228\3\2\2\2\u0228q\3\2\2\2\u0229\u022c\5t;\2\u022a\u022b\t\5"+
		"\2\2\u022b\u022d\5t;\2\u022c\u022a\3\2\2\2\u022c\u022d\3\2\2\2\u022ds"+
		"\3\2\2\2\u022e\u0231\5v<\2\u022f\u0230\t\16\2\2\u0230\u0232\5v<\2\u0231"+
		"\u022f\3\2\2\2\u0231\u0232\3\2\2\2\u0232u\3\2\2\2\u0233\u0236\5x=\2\u0234"+
		"\u0235\t\5\2\2\u0235\u0237\5\u008aF\2\u0236\u0234\3\2\2\2\u0236\u0237"+
		"\3\2\2\2\u0237w\3\2\2\2\u0238\u0239\t\17\2\2\u0239\u023c\5|?\2\u023a\u023c"+
		"\5|?\2\u023b\u0238\3\2\2\2\u023b\u023a\3\2\2\2\u023cy\3\2\2\2\u023d\u023e"+
		"\5|?\2\u023e{\3\2\2\2\u023f\u024b\5\32\16\2\u0240\u024b\5\u0086D\2\u0241"+
		"\u024b\5~@\2\u0242\u024b\7\u014a\2\2\u0243\u024b\5\u0088E\2\u0244\u0245"+
		"\7`\2\2\u0245\u024b\5\u0088E\2\u0246\u024b\5\u00c6d\2\u0247\u0248\7\n"+
		"\2\2\u0248\u024b\5\u00c6d\2\u0249\u024b\5\u0080A\2\u024a\u023f\3\2\2\2"+
		"\u024a\u0240\3\2\2\2\u024a\u0241\3\2\2\2\u024a\u0242\3\2\2\2\u024a\u0243"+
		"\3\2\2\2\u024a\u0244\3\2\2\2\u024a\u0246\3\2\2\2\u024a\u0247\3\2\2\2\u024a"+
		"\u0249\3\2\2\2\u024b}\3\2\2\2\u024c\u0259\5\34\17\2\u024d\u0256\7\u0136"+
		"\2\2\u024e\u0253\5^\60\2\u024f\u0250\7\u0133\2\2\u0250\u0252\5^\60\2\u0251"+
		"\u024f\3\2\2\2\u0252\u0255\3\2\2\2\u0253\u0251\3\2\2\2\u0253\u0254\3\2"+
		"\2\2\u0254\u0257\3\2\2\2\u0255\u0253\3\2\2\2\u0256\u024e\3\2\2\2\u0256"+
		"\u0257\3\2\2\2\u0257\u0258\3\2\2\2\u0258\u025a\7\u0135\2\2\u0259\u024d"+
		"\3\2\2\2\u0259\u025a\3\2\2\2\u025a\u026b\3\2\2\2\u025b\u025c\7\u0081\2"+
		"\2\u025c\u025d\7\u0136\2\2\u025d\u025e\5^\60\2\u025e\u025f\7\23\2\2\u025f"+
		"\u0260\5\f\7\2\u0260\u0261\7\u0135\2\2\u0261\u026b\3\2\2\2\u0262\u0263"+
		"\5&\24\2\u0263\u0265\7\u0136\2\2\u0264\u0266\t\20\2\2\u0265\u0264\3\2"+
		"\2\2\u0265\u0266\3\2\2\2\u0266\u0267\3\2\2\2\u0267\u0268\5l\67\2\u0268"+
		"\u0269\7\u0135\2\2\u0269\u026b\3\2\2\2\u026a\u024c\3\2\2\2\u026a\u025b"+
		"\3\2\2\2\u026a\u0262\3\2\2\2\u026b\177\3\2\2\2\u026c\u026f\5\u0082B\2"+
		"\u026d\u026f\5\u0084C\2\u026e\u026c\3\2\2\2\u026e\u026d\3\2\2\2\u026f"+
		"\u0081\3\2\2\2\u0270\u0276\7\u009a\2\2\u0271\u0272\7\u009b\2\2\u0272\u0273"+
		"\5^\60\2\u0273\u0274\7\u009c\2\2\u0274\u0275\5l\67\2\u0275\u0277\3\2\2"+
		"\2\u0276\u0271\3\2\2\2\u0277\u0278\3\2\2\2\u0278\u0276\3\2\2\2\u0278\u0279"+
		"\3\2\2\2\u0279\u027c\3\2\2\2\u027a\u027b\7\u009d\2\2\u027b\u027d\5l\67"+
		"\2\u027c\u027a\3\2\2\2\u027c\u027d\3\2\2\2\u027d\u027e\3\2\2\2\u027e\u027f"+
		"\7\u009e\2\2\u027f\u0083\3\2\2\2\u0280\u0281\7\u009a\2\2\u0281\u0287\5"+
		"l\67\2\u0282\u0283\7\u009b\2\2\u0283\u0284\5l\67\2\u0284\u0285\7\u009c"+
		"\2\2\u0285\u0286\5l\67\2\u0286\u0288\3\2\2\2\u0287\u0282\3\2\2\2\u0288"+
		"\u0289\3\2\2\2\u0289\u0287\3\2\2\2\u0289\u028a\3\2\2\2\u028a\u028d\3\2"+
		"\2\2\u028b\u028c\7\u009d\2\2\u028c\u028e\5l\67\2\u028d\u028b\3\2\2\2\u028d"+
		"\u028e\3\2\2\2\u028e\u028f\3\2\2\2\u028f\u0290\7\u009e\2\2\u0290\u0085"+
		"\3\2\2\2\u0291\u0292\5(\25\2\u0292\u0293\7\u0132\2\2\u0293\u0295\3\2\2"+
		"\2\u0294\u0291\3\2\2\2\u0294\u0295\3\2\2\2\u0295\u0296\3\2\2\2\u0296\u0297"+
		"\5,\27\2\u0297\u0298\7\u0132\2\2\u0298\u029a\3\2\2\2\u0299\u0294\3\2\2"+
		"\2\u0299\u029a\3\2\2\2\u029a\u029b\3\2\2\2\u029b\u029c\5\60\31\2\u029c"+
		"\u0087\3\2\2\2\u029d\u029e\7\u0136\2\2\u029e\u02a3\5^\60\2\u029f\u02a0"+
		"\7\u0133\2\2\u02a0\u02a2\5^\60\2\u02a1\u029f\3\2\2\2\u02a2\u02a5\3\2\2"+
		"\2\u02a3\u02a1\3\2\2\2\u02a3\u02a4\3\2\2\2\u02a4\u02a6\3\2\2\2\u02a5\u02a3"+
		"\3\2\2\2\u02a6\u02a7\7\u0135\2\2\u02a7\u0089\3\2\2\2\u02a8\u02a9\7\u0106"+
		"\2\2\u02a9\u02aa\5^\60\2\u02aa\u02ab\5\16\b\2\u02ab\u008b\3\2\2\2\u02ac"+
		"\u02b1\5\u008eH\2\u02ad\u02ae\7\u0133\2\2\u02ae\u02b0\5\u008eH\2\u02af"+
		"\u02ad\3\2\2\2\u02b0\u02b3\3\2\2\2\u02b1\u02af\3\2\2\2\u02b1\u02b2\3\2"+
		"\2\2\u02b2\u008d\3\2\2\2\u02b3\u02b1\3\2\2\2\u02b4\u02b7\5\u0090I\2\u02b5"+
		"\u02b7\5\u0096L\2\u02b6\u02b4\3\2\2\2\u02b6\u02b5\3\2\2\2\u02b7\u008f"+
		"\3\2\2\2\u02b8\u02c1\5\u0092J\2\u02b9\u02bb\7\u00c3\2\2\u02ba\u02b9\3"+
		"\2\2\2\u02ba\u02bb\3\2\2\2\u02bb\u02bc\3\2\2\2\u02bc\u02bd\7\33\2\2\u02bd"+
		"\u02bf\5\u0096L\2\u02be\u02c0\5\u0098M\2\u02bf\u02be\3\2\2\2\u02bf\u02c0"+
		"\3\2\2\2\u02c0\u02c2\3\2\2\2\u02c1\u02ba\3\2\2\2\u02c1\u02c2\3\2\2\2\u02c2"+
		"\u0091\3\2\2\2\u02c3\u02cc\5\u0094K\2\u02c4\u02c6\t\21\2\2\u02c5\u02c7"+
		"\7\30\2\2\u02c6\u02c5\3\2\2\2\u02c6\u02c7\3\2\2\2\u02c7\u02c8\3\2\2\2"+
		"\u02c8\u02c9\7\33\2\2\u02c9\u02ca\5\u0094K\2\u02ca\u02cb\5\u0098M\2\u02cb"+
		"\u02cd\3\2\2\2\u02cc\u02c4\3\2\2\2\u02cc\u02cd\3\2\2\2\u02cd\u0093\3\2"+
		"\2\2\u02ce\u02d7\5\u0096L\2\u02cf\u02d1\t\21\2\2\u02d0\u02d2\7\30\2\2"+
		"\u02d1\u02d0\3\2\2\2\u02d1\u02d2\3\2\2\2\u02d2\u02d4\3\2\2\2\u02d3\u02cf"+
		"\3\2\2\2\u02d3\u02d4\3\2\2\2\u02d4\u02d5\3\2\2\2\u02d5\u02d6\7\33\2\2"+
		"\u02d6\u02d8\5\u0096L\2\u02d7\u02d3\3\2\2\2\u02d7\u02d8\3\2\2\2\u02d8"+
		"\u0095\3\2\2\2\u02d9\u02db\5\u00c8e\2\u02da\u02dc\5N(\2\u02db\u02da\3"+
		"\2\2\2\u02db\u02dc\3\2\2\2\u02dc\u02e6\3\2\2\2\u02dd\u02de\5\u00c6d\2"+
		"\u02de\u02df\5N(\2\u02df\u02e6\3\2\2\2\u02e0\u02e1\7\u0136\2\2\u02e1\u02e2"+
		"\5\u008cG\2\u02e2\u02e3\7\u0135\2\2\u02e3\u02e6\3\2\2\2\u02e4\u02e6\7"+
		"\u0149\2\2\u02e5\u02d9\3\2\2\2\u02e5\u02dd\3\2\2\2\u02e5\u02e0\3\2\2\2"+
		"\u02e5\u02e4\3\2\2\2\u02e6\u0097\3\2\2\2\u02e7\u02e8\7\37\2\2\u02e8\u02e9"+
		"\5^\60\2\u02e9\u0099\3\2\2\2\u02ea\u02ef\5\u009eP\2\u02eb\u02ec\7\u0133"+
		"\2\2\u02ec\u02ee\5\u009eP\2\u02ed\u02eb\3\2\2\2\u02ee\u02f1\3\2\2\2\u02ef"+
		"\u02ed\3\2\2\2\u02ef\u02f0\3\2\2\2\u02f0\u009b\3\2\2\2\u02f1\u02ef\3\2"+
		"\2\2\u02f2\u02fb\t\22\2\2\u02f3\u02f9\7\u00d9\2\2\u02f4\u02fa\7\33\2\2"+
		"\u02f5\u02f6\7\r\2\2\u02f6\u02fa\7\17\2\2\u02f7\u02f8\7\16\2\2\u02f8\u02fa"+
		"\7\17\2\2\u02f9\u02f4\3\2\2\2\u02f9\u02f5\3\2\2\2\u02f9\u02f7\3\2\2\2"+
		"\u02fa\u02fc\3\2\2\2\u02fb\u02f3\3\2\2\2\u02fb\u02fc\3\2\2\2\u02fc\u009d"+
		"\3\2\2\2\u02fd\u02fe\7\u00cf\2\2\u02fe\u02ff\5\u009cO\2\u02ff\u0301\7"+
		"\u0136\2\2\u0300\u0302\5\u00a0Q\2\u0301\u0300\3\2\2\2\u0301\u0302\3\2"+
		"\2\2\u0302\u0303\3\2\2\2\u0303\u0304\7\u0135\2\2\u0304\u030c\3\2\2\2\u0305"+
		"\u0306\7E\2\2\u0306\u0307\5\u009cO\2\u0307\u0308\7\u0136\2\2\u0308\u0309"+
		"\5\u00a0Q\2\u0309\u030a\7\u0135\2\2\u030a\u030c\3\2\2\2\u030b\u02fd\3"+
		"\2\2\2\u030b\u0305\3\2\2\2\u030c\u009f\3\2\2\2\u030d\u0312\5\66\34\2\u030e"+
		"\u030f\7\u0133\2\2\u030f\u0311\5\66\34\2\u0310\u030e\3\2\2\2\u0311\u0314"+
		"\3\2\2\2\u0312\u0310\3\2\2\2\u0312\u0313\3\2\2\2\u0313\u00a1\3\2\2\2\u0314"+
		"\u0312\3\2\2\2\u0315\u0316\7 \2\2\u0316\u0317\7\u0136\2\2\u0317\u0318"+
		"\5\u00a4S\2\u0318\u0319\7\u0135\2\2\u0319\u00a3\3\2\2\2\u031a\u031f\5"+
		"8\35\2\u031b\u031c\7\u0133\2\2\u031c\u031e\58\35\2\u031d\u031b\3\2\2\2"+
		"\u031e\u0321\3\2\2\2\u031f\u031d\3\2\2\2\u031f\u0320\3\2\2\2\u0320\u00a5"+
		"\3\2\2\2\u0321\u031f\3\2\2\2\u0322\u0325\5\u00a8U\2\u0323\u0325\5\u00aa"+
		"V\2\u0324\u0322\3\2\2\2\u0324\u0323\3\2\2\2\u0325\u0327\3\2\2\2\u0326"+
		"\u0328\7\u0130\2\2\u0327\u0326\3\2\2\2\u0327\u0328\3\2\2\2\u0328\u00a7"+
		"\3\2\2\2\u0329\u032d\5\u00acW\2\u032a\u032d\5\u00ccg\2\u032b\u032d\5\u012a"+
		"\u0096\2\u032c\u0329\3\2\2\2\u032c\u032a\3\2\2\2\u032c\u032b\3\2\2\2\u032d"+
		"\u00a9\3\2\2\2\u032e\u033e\5\u00dco\2\u032f\u033e\5\u00dep\2\u0330\u033e"+
		"\5\u0116\u008c\2\u0331\u033e\5\u0118\u008d\2\u0332\u033e\5\u011a\u008e"+
		"\2\u0333\u033e\5\u011e\u0090\2\u0334\u033e\5\u0120\u0091\2\u0335\u033e"+
		"\5\u0124\u0093\2\u0336\u033e\5\u00e0q\2\u0337\u033e\5\u00fc\177\2\u0338"+
		"\u033e\5\u010a\u0086\2\u0339\u033e\5\u010c\u0087\2\u033a\u033e\5\u0110"+
		"\u0089\2\u033b\u033e\5\u0114\u008b\2\u033c\u033e\5\u0126\u0094\2\u033d"+
		"\u032e\3\2\2\2\u033d\u032f\3\2\2\2\u033d\u0330\3\2\2\2\u033d\u0331\3\2"+
		"\2\2\u033d\u0332\3\2\2\2\u033d\u0333\3\2\2\2\u033d\u0334\3\2\2\2\u033d"+
		"\u0335\3\2\2\2\u033d\u0336\3\2\2\2\u033d\u0337\3\2\2\2\u033d\u0338\3\2"+
		"\2\2\u033d\u0339\3\2\2\2\u033d\u033a\3\2\2\2\u033d\u033b\3\2\2\2\u033d"+
		"\u033c\3\2\2\2\u033e\u00ab\3\2\2\2\u033f\u0347\5\u00aeX\2\u0340\u0342"+
		"\7\63\2\2\u0341\u0343\t\23\2\2\u0342\u0341\3\2\2\2\u0342\u0343\3\2\2\2"+
		"\u0343\u0344\3\2\2\2\u0344\u0346\5\u00aeX\2\u0345\u0340\3\2\2\2\u0346"+
		"\u0349\3\2\2\2\u0347\u0345\3\2\2\2\u0347\u0348\3\2\2\2\u0348\u00ad\3\2"+
		"\2\2\u0349\u0347\3\2\2\2\u034a\u034c\7\24\2\2\u034b\u034d\t\23\2\2\u034c"+
		"\u034b\3\2\2\2\u034c\u034d\3\2\2\2\u034d\u034e\3\2\2\2\u034e\u035a\5\u00c2"+
		"b\2\u034f\u0350\7\22\2\2\u0350\u0352\5\u008cG\2\u0351\u0353\5\u00b0Y\2"+
		"\u0352\u0351\3\2\2\2\u0352\u0353\3\2\2\2\u0353\u0355\3\2\2\2\u0354\u0356"+
		"\5\u00b2Z\2\u0355\u0354\3\2\2\2\u0355\u0356\3\2\2\2\u0356\u0358\3\2\2"+
		"\2\u0357\u0359\5\u00b6\\\2\u0358\u0357\3\2\2\2\u0358\u0359\3\2\2\2\u0359"+
		"\u035b\3\2\2\2\u035a\u034f\3\2\2\2\u035a\u035b\3\2\2\2\u035b\u035d\3\2"+
		"\2\2\u035c\u035e\5\u00b8]\2\u035d\u035c\3\2\2\2\u035d\u035e\3\2\2\2\u035e"+
		"\u0360\3\2\2\2\u035f\u0361\5\u00bc_\2\u0360\u035f\3\2\2\2\u0360\u0361"+
		"\3\2\2\2\u0361\u00af\3\2\2\2\u0362\u0363\7\21\2\2\u0363\u0364\5^\60\2"+
		"\u0364\u00b1\3\2\2\2\u0365\u0366\7\16\2\2\u0366\u0367\7\17\2\2\u0367\u036c"+
		"\5\u00b4[\2\u0368\u0369\7\u0133\2\2\u0369\u036b\5\u00b4[\2\u036a\u0368"+
		"\3\2\2\2\u036b\u036e\3\2\2\2\u036c\u036a\3\2\2\2\u036c\u036d\3\2\2\2\u036d"+
		"\u0371\3\2\2\2\u036e\u036c\3\2\2\2\u036f\u0370\7\u0090\2\2\u0370\u0372"+
		"\7\u00d6\2\2\u0371\u036f\3\2\2\2\u0371\u0372\3\2\2\2\u0372\u00b3\3\2\2"+
		"\2\u0373\u0377\5\u0086D\2\u0374\u0377\7\u0142\2\2\u0375\u0377\5l\67\2"+
		"\u0376\u0373\3\2\2\2\u0376\u0374\3\2\2\2\u0376\u0375\3\2\2\2\u0377\u00b5"+
		"\3\2\2\2\u0378\u0379\7\20\2\2\u0379\u037a\5^\60\2\u037a\u00b7\3\2\2\2"+
		"\u037b\u037c\7\r\2\2\u037c\u037d\7\17\2\2\u037d\u0382\5\u00ba^\2\u037e"+
		"\u037f\7\u0133\2\2\u037f\u0381\5\u00ba^\2\u0380\u037e\3\2\2\2\u0381\u0384"+
		"\3\2\2\2\u0382\u0380\3\2\2\2\u0382\u0383\3\2\2\2\u0383\u00b9\3\2\2\2\u0384"+
		"\u0382\3\2\2\2\u0385\u0387\5\u00b4[\2\u0386\u0388\t\24\2\2\u0387\u0386"+
		"\3\2\2\2\u0387\u0388\3\2\2\2\u0388\u00bb\3\2\2\2\u0389\u038d\7\u0094\2"+
		"\2\u038a\u038b\5\u00be`\2\u038b\u038c\7\u0133\2\2\u038c\u038e\3\2\2\2"+
		"\u038d\u038a\3\2\2\2\u038d\u038e\3\2\2\2\u038e\u038f\3\2\2\2\u038f\u0390"+
		"\5\u00c0a\2\u0390\u00bd\3\2\2\2\u0391\u0392\7\u0142\2\2\u0392\u00bf\3"+
		"\2\2\2\u0393\u0394\7\u0142\2\2\u0394\u00c1\3\2\2\2\u0395\u039a\5\u00ca"+
		"f\2\u0396\u0397\7\u0133\2\2\u0397\u0399\5\u00caf\2\u0398\u0396\3\2\2\2"+
		"\u0399\u039c\3\2\2\2\u039a\u0398\3\2\2\2\u039a\u039b\3\2\2\2\u039b\u039f"+
		"\3\2\2\2\u039c\u039a\3\2\2\2\u039d\u039f\7\u0134\2\2\u039e\u0395\3\2\2"+
		"\2\u039e\u039d\3\2\2\2\u039f\u00c3\3\2\2\2\u03a0\u03a1\7\u0136\2\2\u03a1"+
		"\u03a6\5\u0086D\2\u03a2\u03a3\7\u0133\2\2\u03a3\u03a5\5\u0086D\2\u03a4"+
		"\u03a2\3\2\2\2\u03a5\u03a8\3\2\2\2\u03a6\u03a4\3\2\2\2\u03a6\u03a7\3\2"+
		"\2\2\u03a7\u03a9\3\2\2\2\u03a8\u03a6\3\2\2\2\u03a9\u03aa\7\u0135\2\2\u03aa"+
		"\u00c5\3\2\2\2\u03ab\u03ac\7\u0136\2\2\u03ac\u03ad\5\u00acW\2\u03ad\u03ae"+
		"\7\u0135\2\2\u03ae\u00c7\3\2\2\2\u03af\u03b0\5(\25\2\u03b0\u03b1\7\u0132"+
		"\2\2\u03b1\u03b3\3\2\2\2\u03b2\u03af\3\2\2\2\u03b2\u03b3\3\2\2\2\u03b3"+
		"\u03b4\3\2\2\2\u03b4\u03b5\5,\27\2\u03b5\u00c9\3\2\2\2\u03b6\u03b7\5\u00c8"+
		"e\2\u03b7\u03b8\7\u0132\2\2\u03b8\u03b9\7\u0134\2\2\u03b9\u03c3\3\2\2"+
		"\2\u03ba\u03bc\5\u0086D\2\u03bb\u03bd\5N(\2\u03bc\u03bb\3\2\2\2\u03bc"+
		"\u03bd\3\2\2\2\u03bd\u03c3\3\2\2\2\u03be\u03c0\5l\67\2\u03bf\u03c1\5N"+
		"(\2\u03c0\u03bf\3\2\2\2\u03c0\u03c1\3\2\2\2\u03c1\u03c3\3\2\2\2\u03c2"+
		"\u03b6\3\2\2\2\u03c2\u03ba\3\2\2\2\u03c2\u03be\3\2\2\2\u03c3\u00cb\3\2"+
		"\2\2\u03c4\u03c5\5\u00d2j\2\u03c5\u00cd\3\2\2\2\u03c6\u03c8\7\26\2\2\u03c7"+
		"\u03c9\t\25\2\2\u03c8\u03c7\3\2\2\2\u03c8\u03c9\3\2\2\2\u03c9\u03cb\3"+
		"\2\2\2\u03ca\u03cc\7E\2\2\u03cb\u03ca\3\2\2\2\u03cb\u03cc\3\2\2\2\u03cc"+
		"\u03ce\3\2\2\2\u03cd\u03cf\7^\2\2\u03ce\u03cd\3\2\2\2\u03ce\u03cf\3\2"+
		"\2\2\u03cf\u03d0\3\2\2\2\u03d0\u03d2\5\u00c8e\2\u03d1\u03d3\5\u00a2R\2"+
		"\u03d2\u03d1\3\2\2\2\u03d2\u03d3\3\2\2\2\u03d3\u00cf\3\2\2\2\u03d4\u03d5"+
		"\7\37\2\2\u03d5\u03d6\7\u0118\2\2\u03d6\u03d7\7j\2\2\u03d7\u03d8\7\u00d2"+
		"\2\2\u03d8\u03d9\5\u0086D\2\u03d9\u03da\7\u0128\2\2\u03da\u03e2\5^\60"+
		"\2\u03db\u03dc\7\u0133\2\2\u03dc\u03dd\5\u0086D\2\u03dd\u03de\7\u0128"+
		"\2\2\u03de\u03df\5^\60\2\u03df\u03e1\3\2\2\2\u03e0\u03db\3\2\2\2\u03e1"+
		"\u03e4\3\2\2\2\u03e2\u03e0\3\2\2\2\u03e2\u03e3\3\2\2\2\u03e3\u00d1\3\2"+
		"\2\2\u03e4\u03e2\3\2\2\2\u03e5\u03e7\5\u00ceh\2\u03e6\u03e8\5\u00c4c\2"+
		"\u03e7\u03e6\3\2\2\2\u03e7\u03e8\3\2\2\2\u03e8\u03eb\3\2\2\2\u03e9\u03ec"+
		"\5\u00aeX\2\u03ea\u03ec\5\u00d4k\2\u03eb\u03e9\3\2\2\2\u03eb\u03ea\3\2"+
		"\2\2\u03ec\u03ee\3\2\2\2\u03ed\u03ef\5\u00d0i\2\u03ee\u03ed\3\2\2\2\u03ee"+
		"\u03ef\3\2\2\2\u03ef\u00d3\3\2\2\2\u03f0\u03f1\t\26\2\2\u03f1\u03f6\5"+
		"\u00d6l\2\u03f2\u03f3\7\u0133\2\2\u03f3\u03f5\5\u00d6l\2\u03f4\u03f2\3"+
		"\2\2\2\u03f5\u03f8\3\2\2\2\u03f6\u03f4\3\2\2\2\u03f6\u03f7\3\2\2\2\u03f7"+
		"\u00d5\3\2\2\2\u03f8\u03f6\3\2\2\2\u03f9\u03fc\7\u0136\2\2\u03fa\u03fd"+
		"\5l\67\2\u03fb\u03fd\7x\2\2\u03fc\u03fa\3\2\2\2\u03fc\u03fb\3\2\2\2\u03fd"+
		"\u0405\3\2\2\2\u03fe\u0401\7\u0133\2\2\u03ff\u0402\5l\67\2\u0400\u0402"+
		"\7x\2\2\u0401\u03ff\3\2\2\2\u0401\u0400\3\2\2\2\u0402\u0404\3\2\2\2\u0403"+
		"\u03fe\3\2\2\2\u0404\u0407\3\2\2\2\u0405\u0403\3\2\2\2\u0405\u0406\3\2"+
		"\2\2\u0406\u0408\3\2\2\2\u0407\u0405\3\2\2\2\u0408\u0409\7\u0135\2\2\u0409"+
		"\u00d7\3\2\2\2\u040a\u040b\7\u0095\2\2\u040b\u0410\5\u00dan\2\u040c\u040d"+
		"\7\u0133\2\2\u040d\u040f\5\u00dan\2\u040e\u040c\3\2\2\2\u040f\u0412\3"+
		"\2\2\2\u0410\u040e\3\2\2\2\u0410\u0411\3\2\2\2\u0411\u00d9\3\2\2\2\u0412"+
		"\u0410\3\2\2\2\u0413\u0414\5\u0086D\2\u0414\u0417\7\u0128\2\2\u0415\u0418"+
		"\5^\60\2\u0416\u0418\7x\2\2\u0417\u0415\3\2\2\2\u0417\u0416\3\2\2\2\u0418"+
		"\u00db\3\2\2\2\u0419\u041a\7;\2\2\u041a\u041e\t\27\2\2\u041b\u041c\7\t"+
		"\2\2\u041c\u041d\7\7\2\2\u041d\u041f\7\n\2\2\u041e\u041b\3\2\2\2\u041e"+
		"\u041f\3\2\2\2\u041f\u0420\3\2\2\2\u0420\u0421\5(\25\2\u0421\u00dd\3\2"+
		"\2\2\u0422\u0423\7C\2\2\u0423\u0426\t\27\2\2\u0424\u0425\7\t\2\2\u0425"+
		"\u0427\7\n\2\2\u0426\u0424\3\2\2\2\u0426\u0427\3\2\2\2\u0427\u0428\3\2"+
		"\2\2\u0428\u0429\5(\25\2\u0429\u00df\3\2\2\2\u042a\u042e\5\u00e2r\2\u042b"+
		"\u042e\5\u00e4s\2\u042c\u042e\5\u00e6t\2\u042d\u042a\3\2\2\2\u042d\u042b"+
		"\3\2\2\2\u042d\u042c\3\2\2\2\u042e\u00e1\3\2\2\2\u042f\u0431\7;\2\2\u0430"+
		"\u0432\7\u0086\2\2\u0431\u0430\3\2\2\2\u0431\u0432\3\2\2\2\u0432\u0434"+
		"\3\2\2\2\u0433\u0435\7<\2\2\u0434\u0433\3\2\2\2\u0434\u0435\3\2\2\2\u0435"+
		"\u0436\3\2\2\2\u0436\u043a\7\"\2\2\u0437\u0438\7\t\2\2\u0438\u0439\7\7"+
		"\2\2\u0439\u043b\7\n\2\2\u043a\u0437\3\2\2\2\u043a\u043b\3\2\2\2\u043b"+
		"\u043f\3\2\2\2\u043c\u043d\5*\26\2\u043d\u043e\7\u0132\2\2\u043e\u0440"+
		"\3\2\2\2\u043f\u043c\3\2\2\2\u043f\u0440\3\2\2\2\u0440\u0441\3\2\2\2\u0441"+
		"\u0442\5,\27\2\u0442\u0443\7\u0136\2\2\u0443\u0448\5\u00e8u\2\u0444\u0445"+
		"\7\u0133\2\2\u0445\u0447\5\u00e8u\2\u0446\u0444\3\2\2\2\u0447\u044a\3"+
		"\2\2\2\u0448\u0446\3\2\2\2\u0448\u0449\3\2\2\2\u0449\u044b\3\2\2\2\u044a"+
		"\u0448\3\2\2\2\u044b\u044e\7\u0135\2\2\u044c\u044d\7\23\2\2\u044d\u044f"+
		"\5\u00acW\2\u044e\u044c\3\2\2\2\u044e\u044f\3\2\2\2\u044f\u00e3\3\2\2"+
		"\2\u0450\u0452\7;\2\2\u0451\u0453\7\u0086\2\2\u0452\u0451\3\2\2\2\u0452"+
		"\u0453\3\2\2\2\u0453\u0455\3\2\2\2\u0454\u0456\7<\2\2\u0455\u0454\3\2"+
		"\2\2\u0455\u0456\3\2\2\2\u0456\u0457\3\2\2\2\u0457\u045b\7\"\2\2\u0458"+
		"\u0459\7\t\2\2\u0459\u045a\7\7\2\2\u045a\u045c\7\n\2\2\u045b\u0458\3\2"+
		"\2\2\u045b\u045c\3\2\2\2\u045c\u045d\3\2\2\2\u045d\u045e\5,\27\2\u045e"+
		"\u045f\7\23\2\2\u045f\u0460\5\u00acW\2\u0460\u00e5\3\2\2\2\u0461\u0463"+
		"\7;\2\2\u0462\u0464\7\u0086\2\2\u0463\u0462\3\2\2\2\u0463\u0464\3\2\2"+
		"\2\u0464\u0466\3\2\2\2\u0465\u0467\7<\2\2\u0466\u0465\3\2\2\2\u0466\u0467"+
		"\3\2\2\2\u0467\u0468\3\2\2\2\u0468\u046c\7\"\2\2\u0469\u046a\7\t\2\2\u046a"+
		"\u046b\7\7\2\2\u046b\u046d\7\n\2\2\u046c\u0469\3\2\2\2\u046c\u046d\3\2"+
		"\2\2\u046d\u046e\3\2\2\2\u046e\u0476\5,\27\2\u046f\u0470\7\b\2\2\u0470"+
		"\u0477\5,\27\2\u0471\u0472\7\u0136\2\2\u0472\u0473\7\b\2\2\u0473\u0474"+
		"\5,\27\2\u0474\u0475\7\u0135\2\2\u0475\u0477\3\2\2\2\u0476\u046f\3\2\2"+
		"\2\u0476\u0471\3\2\2\2\u0477\u00e7\3\2\2\2\u0478\u0479\5\60\31\2\u0479"+
		"\u047a\5\u00eav\2\u047a\u0493\3\2\2\2\u047b\u047d\t\22\2\2\u047c\u047e"+
		"\5\66\34\2\u047d\u047c\3\2\2\2\u047d\u047e\3\2\2\2\u047e\u0480\3\2\2\2"+
		"\u047f\u0481\5\u0102\u0082\2\u0480\u047f\3\2\2\2\u0480\u0481\3\2\2\2\u0481"+
		"\u0482\3\2\2\2\u0482\u0483\7\u0136\2\2\u0483\u0488\5\u00f0y\2\u0484\u0485"+
		"\7\u0133\2\2\u0485\u0487\5\u00f0y\2\u0486\u0484\3\2\2\2\u0487\u048a\3"+
		"\2\2\2\u0488\u0486\3\2\2\2\u0488\u0489\3\2\2\2\u0489\u048b\3\2\2\2\u048a"+
		"\u0488\3\2\2\2\u048b\u048f\7\u0135\2\2\u048c\u048e\5\u0104\u0083\2\u048d"+
		"\u048c\3\2\2\2\u048e\u0491\3\2\2\2\u048f\u048d\3\2\2\2\u048f\u0490\3\2"+
		"\2\2\u0490\u0493\3\2\2\2\u0491\u048f\3\2\2\2\u0492\u0478\3\2\2\2\u0492"+
		"\u047b\3\2\2\2\u0493\u00e9\3\2\2\2\u0494\u0497\5\u00eex\2\u0495\u0496"+
		"\7H\2\2\u0496\u0498\7\u0148\2\2\u0497\u0495\3\2\2\2\u0497\u0498\3\2\2"+
		"\2\u0498\u049a\3\2\2\2\u0499\u049b\5\u00f2z\2\u049a\u0499\3\2\2\2\u049a"+
		"\u049b\3\2\2\2\u049b\u00eb\3\2\2\2\u049c\u049d\7\7\2\2\u049d\u04a0\7:"+
		"\2\2\u049e\u04a0\7:\2\2\u049f\u049c\3\2\2\2\u049f\u049e\3\2\2\2\u04a0"+
		"\u00ed\3\2\2\2\u04a1\u04a6\7J\2\2\u04a2\u04a3\7\u0136\2\2\u04a3\u04a4"+
		"\5\u00f6|\2\u04a4\u04a5\7\u0135\2\2\u04a5\u04a7\3\2\2\2\u04a6\u04a2\3"+
		"\2\2\2\u04a6\u04a7\3\2\2\2\u04a7\u04a9\3\2\2\2\u04a8\u04aa\7\u00b8\2\2"+
		"\u04a9\u04a8\3\2\2\2\u04a9\u04aa\3\2\2\2\u04aa\u04ac\3\2\2\2\u04ab\u04ad"+
		"\5\u00ecw\2\u04ac\u04ab\3\2\2\2\u04ac\u04ad\3\2\2\2\u04ad\u04b0\3\2\2"+
		"\2\u04ae\u04af\7x\2\2\u04af\u04b1\5\22\n\2\u04b0\u04ae\3\2\2\2\u04b0\u04b1"+
		"\3\2\2\2\u04b1\u055a\3\2\2\2\u04b2\u04b7\7K\2\2\u04b3\u04b4\7\u0136\2"+
		"\2\u04b4\u04b5\5\u00f6|\2\u04b5\u04b6\7\u0135\2\2\u04b6\u04b8\3\2\2\2"+
		"\u04b7\u04b3\3\2\2\2\u04b7\u04b8\3\2\2\2\u04b8\u04ba\3\2\2\2\u04b9\u04bb"+
		"\7\u00b8\2\2\u04ba\u04b9\3\2\2\2\u04ba\u04bb\3\2\2\2\u04bb\u04bd\3\2\2"+
		"\2\u04bc\u04be\5\u00ecw\2\u04bd\u04bc\3\2\2\2\u04bd\u04be\3\2\2\2\u04be"+
		"\u04c1\3\2\2\2\u04bf\u04c0\7x\2\2\u04c0\u04c2\5\22\n\2\u04c1\u04bf\3\2"+
		"\2\2\u04c1\u04c2\3\2\2\2\u04c2\u055a\3\2\2\2\u04c3\u04c8\7L\2\2\u04c4"+
		"\u04c5\7\u0136\2\2\u04c5\u04c6\5\u00f6|\2\u04c6\u04c7\7\u0135\2\2\u04c7"+
		"\u04c9\3\2\2\2\u04c8\u04c4\3\2\2\2\u04c8\u04c9\3\2\2\2\u04c9\u04cb\3\2"+
		"\2\2\u04ca\u04cc\7\u00b8\2\2\u04cb\u04ca\3\2\2\2\u04cb\u04cc\3\2\2\2\u04cc"+
		"\u04ce\3\2\2\2\u04cd\u04cf\5\u00ecw\2\u04ce\u04cd\3\2\2\2\u04ce\u04cf"+
		"\3\2\2\2\u04cf\u04d2\3\2\2\2\u04d0\u04d1\7x\2\2\u04d1\u04d3\5\22\n\2\u04d2"+
		"\u04d0\3\2\2\2\u04d2\u04d3\3\2\2\2\u04d3\u055a\3\2\2\2\u04d4\u04d9\7M"+
		"\2\2\u04d5\u04d6\7\u0136\2\2\u04d6\u04d7\5\u00f6|\2\u04d7\u04d8\7\u0135"+
		"\2\2\u04d8\u04da\3\2\2\2\u04d9\u04d5\3\2\2\2\u04d9\u04da\3\2\2\2\u04da"+
		"\u04dc\3\2\2\2\u04db\u04dd\7\u00b8\2\2\u04dc\u04db\3\2\2\2\u04dc\u04dd"+
		"\3\2\2\2\u04dd\u04df\3\2\2\2\u04de\u04e0\5\u00ecw\2\u04df\u04de\3\2\2"+
		"\2\u04df\u04e0\3\2\2\2\u04e0\u04e3\3\2\2\2\u04e1\u04e2\7x\2\2\u04e2\u04e4"+
		"\5\22\n\2\u04e3\u04e1\3\2\2\2\u04e3\u04e4\3\2\2\2\u04e4\u055a\3\2\2\2"+
		"\u04e5\u04ec\7O\2\2\u04e6\u04e7\7\u0136\2\2\u04e7\u04e8\5\u00f6|\2\u04e8"+
		"\u04e9\7\u0133\2\2\u04e9\u04ea\5\22\n\2\u04ea\u04eb\7\u0135\2\2\u04eb"+
		"\u04ed\3\2\2\2\u04ec\u04e6\3\2\2\2\u04ec\u04ed\3\2\2\2\u04ed\u04ef\3\2"+
		"\2\2\u04ee\u04f0\7\u00b8\2\2\u04ef\u04ee\3\2\2\2\u04ef\u04f0\3\2\2\2\u04f0"+
		"\u04f2\3\2\2\2\u04f1\u04f3\5\u00ecw\2\u04f2\u04f1\3\2\2\2\u04f2\u04f3"+
		"\3\2\2\2\u04f3\u04f6\3\2\2\2\u04f4\u04f5\7x\2\2\u04f5\u04f7\5\22\n\2\u04f6"+
		"\u04f4\3\2\2\2\u04f6\u04f7\3\2\2\2\u04f7\u055a\3\2\2\2\u04f8\u04ff\7N"+
		"\2\2\u04f9\u04fa\7\u0136\2\2\u04fa\u04fb\5\u00f6|\2\u04fb\u04fc\7\u0133"+
		"\2\2\u04fc\u04fd\5\22\n\2\u04fd\u04fe\7\u0135\2\2\u04fe\u0500\3\2\2\2"+
		"\u04ff\u04f9\3\2\2\2\u04ff\u0500\3\2\2\2\u0500\u0502\3\2\2\2\u0501\u0503"+
		"\7\u00b8\2\2\u0502\u0501\3\2\2\2\u0502\u0503\3\2\2\2\u0503\u0505\3\2\2"+
		"\2\u0504\u0506\5\u00ecw\2\u0505\u0504\3\2\2\2\u0505\u0506\3\2\2\2\u0506"+
		"\u0509\3\2\2\2\u0507\u0508\7x\2\2\u0508\u050a\5\22\n\2\u0509\u0507\3\2"+
		"\2\2\u0509\u050a\3\2\2\2\u050a\u055a\3\2\2\2\u050b\u0514\7S\2\2\u050c"+
		"\u050d\7\u0136\2\2\u050d\u0510\5\u00f6|\2\u050e\u050f\7\u0133\2\2\u050f"+
		"\u0511\5\22\n\2\u0510\u050e\3\2\2\2\u0510\u0511\3\2\2\2\u0511\u0512\3"+
		"\2\2\2\u0512\u0513\7\u0135\2\2\u0513\u0515\3\2\2\2\u0514\u050c\3\2\2\2"+
		"\u0514\u0515\3\2\2\2\u0515\u0517\3\2\2\2\u0516\u0518\7\u00b8\2\2\u0517"+
		"\u0516\3\2\2\2\u0517\u0518\3\2\2\2\u0518\u051a\3\2\2\2\u0519\u051b\5\u00ec"+
		"w\2\u051a\u0519\3\2\2\2\u051a\u051b\3\2\2\2\u051b\u051e\3\2\2\2\u051c"+
		"\u051d\7x\2\2\u051d\u051f\5\22\n\2\u051e\u051c\3\2\2\2\u051e\u051f\3\2"+
		"\2\2\u051f\u055a\3\2\2\2\u0520\u0522\7P\2\2\u0521\u0523\5\u00ecw\2\u0522"+
		"\u0521\3\2\2\2\u0522\u0523\3\2\2\2\u0523\u0526\3\2\2\2\u0524\u0525\7x"+
		"\2\2\u0525\u0527\7\u0148\2\2\u0526\u0524\3\2\2\2\u0526\u0527\3\2\2\2\u0527"+
		"\u055a\3\2\2\2\u0528\u052a\7R\2\2\u0529\u052b\5\u00ecw\2\u052a\u0529\3"+
		"\2\2\2\u052a\u052b\3\2\2\2\u052b\u052e\3\2\2\2\u052c\u052d\7x\2\2\u052d"+
		"\u052f\7\u0148\2\2\u052e\u052c\3\2\2\2\u052e\u052f\3\2\2\2\u052f\u055a"+
		"\3\2\2\2\u0530\u0532\7Q\2\2\u0531\u0533\5\u00ecw\2\u0532\u0531\3\2\2\2"+
		"\u0532\u0533\3\2\2\2\u0533\u0536\3\2\2\2\u0534\u0535\7x\2\2\u0535\u0537"+
		"\7\u0148\2\2\u0536\u0534\3\2\2\2\u0536\u0537\3\2\2\2\u0537\u055a\3\2\2"+
		"\2\u0538\u0539\7U\2\2\u0539\u053a\7\u0136\2\2\u053a\u053b\5\u00f8}\2\u053b"+
		"\u053d\7\u0135\2\2\u053c\u053e\5\u00ecw\2\u053d\u053c\3\2\2\2\u053d\u053e"+
		"\3\2\2\2\u053e\u0541\3\2\2\2\u053f\u0540\7x\2\2\u0540\u0542\7\u0148\2"+
		"\2\u0541\u053f\3\2\2\2\u0541\u0542\3\2\2\2\u0542\u055a\3\2\2\2\u0543\u0548"+
		"\7\u00c2\2\2\u0544\u0545\7\u0136\2\2\u0545\u0546\5\u00fa~\2\u0546\u0547"+
		"\7\u0135\2\2\u0547\u0549\3\2\2\2\u0548\u0544\3\2\2\2\u0548\u0549\3\2\2"+
		"\2\u0549\u054b\3\2\2\2\u054a\u054c\5\u00ecw\2\u054b\u054a\3\2\2\2\u054b"+
		"\u054c\3\2\2\2\u054c\u054f\3\2\2\2\u054d\u054e\7x\2\2\u054e\u0550\7\u0148"+
		"\2\2\u054f\u054d\3\2\2\2\u054f\u0550\3\2\2\2\u0550\u055a\3\2\2\2\u0551"+
		"\u0553\7I\2\2\u0552\u0554\5\u00ecw\2\u0553\u0552\3\2\2\2\u0553\u0554\3"+
		"\2\2\2\u0554\u0557\3\2\2\2\u0555\u0556\7x\2\2\u0556\u0558\7\u0148\2\2"+
		"\u0557\u0555\3\2\2\2\u0557\u0558\3\2\2\2\u0558\u055a\3\2\2\2\u0559\u04a1"+
		"\3\2\2\2\u0559\u04b2\3\2\2\2\u0559\u04c3\3\2\2\2\u0559\u04d4\3\2\2\2\u0559"+
		"\u04e5\3\2\2\2\u0559\u04f8\3\2\2\2\u0559\u050b\3\2\2\2\u0559\u0520\3\2"+
		"\2\2\u0559\u0528\3\2\2\2\u0559\u0530\3\2\2\2\u0559\u0538\3\2\2\2\u0559"+
		"\u0543\3\2\2\2\u0559\u0551\3\2\2\2\u055a\u00ef\3\2\2\2\u055b\u055f\5\60"+
		"\31\2\u055c\u055d\7\u0136\2\2\u055d\u055e\7\u0142\2\2\u055e\u0560\7\u0135"+
		"\2\2\u055f\u055c\3\2\2\2\u055f\u0560\3\2\2\2\u0560\u0562\3\2\2\2\u0561"+
		"\u0563\t\24\2\2\u0562\u0561\3\2\2\2\u0562\u0563\3\2\2\2\u0563\u00f1\3"+
		"\2\2\2\u0564\u0565\7\u0121\2\2\u0565\u0566\5,\27\2\u0566\u0567\7\u0136"+
		"\2\2\u0567\u056c\5\u00f0y\2\u0568\u0569\7\u0133\2\2\u0569\u056b\5\u00f0"+
		"y\2\u056a\u0568\3\2\2\2\u056b\u056e\3\2\2\2\u056c\u056a\3\2\2\2\u056c"+
		"\u056d\3\2\2\2\u056d\u056f\3\2\2\2\u056e\u056c\3\2\2\2\u056f\u0573\7\u0135"+
		"\2\2\u0570\u0571\7\37\2\2\u0571\u0572\7\u00a4\2\2\u0572\u0574\5\u00f4"+
		"{\2\u0573\u0570\3\2\2\2\u0573\u0574\3\2\2\2\u0574\u0578\3\2\2\2\u0575"+
		"\u0576\7\37\2\2\u0576\u0577\7\u00d2\2\2\u0577\u0579\5\u00f4{\2\u0578\u0575"+
		"\3\2\2\2\u0578\u0579\3\2\2\2\u0579\u00f3\3\2\2\2\u057a\u057f\7\u00d3\2"+
		"\2\u057b\u057f\7\u00d4\2\2\u057c\u057d\7\u0095\2\2\u057d\u057f\7:\2\2"+
		"\u057e\u057a\3\2\2\2\u057e\u057b\3\2\2\2\u057e\u057c\3\2\2\2\u057f\u00f5"+
		"\3\2\2\2\u0580\u0581\7\u0142\2\2\u0581\u00f7\3\2\2\2\u0582\u0583\7\u0143"+
		"\2\2\u0583\u00f9\3\2\2\2\u0584\u0585\7\u0144\2\2\u0585\u00fb\3\2\2\2\u0586"+
		"\u0587\7=\2\2\u0587\u0588\7\"\2\2\u0588\u0591\5,\27\2\u0589\u058e\5\u00fe"+
		"\u0080\2\u058a\u058b\7\u0133\2\2\u058b\u058d\5\u00fe\u0080\2\u058c\u058a"+
		"\3\2\2\2\u058d\u0590\3\2\2\2\u058e\u058c\3\2\2\2\u058e\u058f\3\2\2\2\u058f"+
		"\u0592\3\2\2\2\u0590\u058e\3\2\2\2\u0591\u0589\3\2\2\2\u0591\u0592\3\2"+
		"\2\2\u0592\u00fd\3\2\2\2\u0593\u0594\7D\2\2\u0594\u0595\7G\2\2\u0595\u059e"+
		"\5,\27\2\u0596\u0598\7>\2\2\u0597\u0599\7?\2\2\u0598\u0597\3\2\2\2\u0598"+
		"\u0599\3\2\2\2\u0599\u059a\3\2\2\2\u059a\u059b\5\60\31\2\u059b\u059c\5"+
		"\60\31\2\u059c\u059e\3\2\2\2\u059d\u0593\3\2\2\2\u059d\u0596\3\2\2\2\u059e"+
		"\u00ff\3\2\2\2\u059f\u05a4\5\u00f0y\2\u05a0\u05a1\7\u0133\2\2\u05a1\u05a3"+
		"\5\u00f0y\2\u05a2\u05a0\3\2\2\2\u05a3\u05a6\3\2\2\2\u05a4\u05a2\3\2\2"+
		"\2\u05a4\u05a5\3\2\2\2\u05a5\u0101\3\2\2\2\u05a6\u05a4\3\2\2\2\u05a7\u05a8"+
		"\7/\2\2\u05a8\u05a9\7\u0120\2\2\u05a9\u0103\3\2\2\2\u05aa\u05ae\5\u0102"+
		"\u0082\2\u05ab\u05ac\7H\2\2\u05ac\u05ae\7\u0148\2\2\u05ad\u05aa\3\2\2"+
		"\2\u05ad\u05ab\3\2\2\2\u05ae\u0105\3\2\2\2\u05af\u05b0\5\60\31\2\u05b0"+
		"\u05b7\5\u00eav\2\u05b1\u05b2\7\u0133\2\2\u05b2\u05b3\5\60\31\2\u05b3"+
		"\u05b4\5\u00eav\2\u05b4\u05b6\3\2\2\2\u05b5\u05b1\3\2\2\2\u05b6\u05b9"+
		"\3\2\2\2\u05b7\u05b5\3\2\2\2\u05b7\u05b8\3\2\2\2\u05b8\u0107\3\2\2\2\u05b9"+
		"\u05b7\3\2\2\2\u05ba\u05bb\7D\2\2\u05bb\u05bc\7\"\2\2\u05bc\u05bd\5,\27"+
		"\2\u05bd\u05be\7G\2\2\u05be\u05c6\5,\27\2\u05bf\u05c0\7\u0133\2\2\u05c0"+
		"\u05c1\5,\27\2\u05c1\u05c2\7G\2\2\u05c2\u05c3\5,\27\2\u05c3\u05c5\3\2"+
		"\2\2\u05c4\u05bf\3\2\2\2\u05c5\u05c8\3\2\2\2\u05c6\u05c4\3\2\2\2\u05c6"+
		"\u05c7\3\2\2\2\u05c7\u0109\3\2\2\2\u05c8\u05c6\3\2\2\2\u05c9\u05ca\7C"+
		"\2\2\u05ca\u05cd\7\"\2\2\u05cb\u05cc\7\t\2\2\u05cc\u05ce\7\n\2\2\u05cd"+
		"\u05cb\3\2\2\2\u05cd\u05ce\3\2\2\2\u05ce\u05cf\3\2\2\2\u05cf\u05d0\5,"+
		"\27\2\u05d0\u010b\3\2\2\2\u05d1\u05d2\7C\2\2\u05d2\u05d5\7\u00a7\2\2\u05d3"+
		"\u05d4\7\t\2\2\u05d4\u05d6\7\n\2\2\u05d5\u05d3\3\2\2\2\u05d5\u05d6\3\2"+
		"\2\2\u05d6\u05d7\3\2\2\2\u05d7\u05d8\5,\27\2\u05d8\u010d\3\2\2\2\u05d9"+
		"\u05db\7\u00e4\2\2\u05da\u05dc\7\"\2\2\u05db\u05da\3\2\2\2\u05db\u05dc"+
		"\3\2\2\2\u05dc\u05dd\3\2\2\2\u05dd\u05de\5,\27\2\u05de\u010f\3\2\2\2\u05df"+
		"\u05e0\7;\2\2\u05e0\u05e1\5\u0112\u008a\2\u05e1\u0111\3\2\2\2\u05e2\u05e6"+
		"\7\u00a7\2\2\u05e3\u05e4\5*\26\2\u05e4\u05e5\7\u0132\2\2\u05e5\u05e7\3"+
		"\2\2\2\u05e6\u05e3\3\2\2\2\u05e6\u05e7\3\2\2\2\u05e7\u05e8\3\2\2\2\u05e8"+
		"\u05ec\5\62\32\2\u05e9\u05ea\7\t\2\2\u05ea\u05eb\7\7\2\2\u05eb\u05ed\7"+
		"\n\2\2\u05ec\u05e9\3\2\2\2\u05ec\u05ed\3\2\2\2\u05ed\u05ef\3\2\2\2\u05ee"+
		"\u05f0\5\u00c4c\2\u05ef\u05ee\3\2\2\2\u05ef\u05f0\3\2\2\2\u05f0\u05f1"+
		"\3\2\2\2\u05f1\u05f2\7\23\2\2\u05f2\u05f3\5\u00acW\2\u05f3\u0113\3\2\2"+
		"\2\u05f4\u05f5\7=\2\2\u05f5\u05f6\5\u0112\u008a\2\u05f6\u0115\3\2\2\2"+
		"\u05f7\u05f8\7;\2\2\u05f8\u05f9\7\u00e7\2\2\u05f9\u05fa\5D#\2\u05fa\u05fb"+
		"\7\u00eb\2\2\u05fb\u05fc\7\17\2\2\u05fc\u05fd\7\u0149\2\2\u05fd\u0117"+
		"\3\2\2\2\u05fe\u05ff\7C\2\2\u05ff\u0600\7\u00e7\2\2\u0600\u0601\5D#\2"+
		"\u0601\u0119\3\2\2\2\u0602\u0603\7\u00ae\2\2\u0603\u0608\5\\/\2\u0604"+
		"\u0605\7\u0133\2\2\u0605\u0607\5\\/\2\u0606\u0604\3\2\2\2\u0607\u060a"+
		"\3\2\2\2\u0608\u0606\3\2\2\2\u0608\u0609\3\2\2\2\u0609\u060b\3\2\2\2\u060a"+
		"\u0608\3\2\2\2\u060b\u060e\7\37\2\2\u060c\u060f\5,\27\2\u060d\u060f\5"+
		"\62\32\2\u060e\u060c\3\2\2\2\u060e\u060d\3\2\2\2\u060f\u0610\3\2\2\2\u0610"+
		"\u0611\7G\2\2\u0611\u0616\5\u011c\u008f\2\u0612\u0613\7\u0133\2\2\u0613"+
		"\u0615\5\u011c\u008f\2\u0614\u0612\3\2\2\2\u0615\u0618\3\2\2\2\u0616\u0614"+
		"\3\2\2\2\u0616\u0617\3\2\2\2\u0617\u061c\3\2\2\2\u0618\u0616\3\2\2\2\u0619"+
		"\u061a\7\u0090\2\2\u061a\u061b\7\u00ae\2\2\u061b\u061d\7\u00d0\2\2\u061c"+
		"\u0619\3\2\2\2\u061c\u061d\3\2\2\2\u061d\u011b\3\2\2\2\u061e\u061f\7\u00e7"+
		"\2\2\u061f\u0620\5D#\2\u0620\u011d\3\2\2\2\u0621\u0625\7\u00af\2\2\u0622"+
		"\u0623\7\u00ae\2\2\u0623\u0624\7\u00d0\2\2\u0624\u0626\7\u00d9\2\2\u0625"+
		"\u0622\3\2\2\2\u0625\u0626\3\2\2\2\u0626\u0627\3\2\2\2\u0627\u062c\5\\"+
		"/\2\u0628\u0629\7\u0133\2\2\u0629\u062b\5\\/\2\u062a\u0628\3\2\2\2\u062b"+
		"\u062e\3\2\2\2\u062c\u062a\3\2\2\2\u062c\u062d\3\2\2\2\u062d\u062f\3\2"+
		"\2\2\u062e\u062c\3\2\2\2\u062f\u0632\7\37\2\2\u0630\u0633\5,\27\2\u0631"+
		"\u0633\5\62\32\2\u0632\u0630\3\2\2\2\u0632\u0631\3\2\2\2\u0633\u0634\3"+
		"\2\2\2\u0634\u0635\7\22\2\2\u0635\u0639\5\u011c\u008f\2\u0636\u0638\5"+
		"\u011c\u008f\2\u0637\u0636\3\2\2\2\u0638\u063b\3\2\2\2\u0639\u0637\3\2"+
		"\2\2\u0639\u063a\3\2\2\2\u063a\u011f\3\2\2\2\u063b\u0639\3\2\2\2\u063c"+
		"\u063d\7)\2\2\u063d\u063e\5\u0122\u0092\2\u063e\u0121\3\2\2\2\u063f\u0640"+
		"\7;\2\2\u0640\u0644\t\30\2\2\u0641\u0642\5*\26\2\u0642\u0643\7\u0132\2"+
		"\2\u0643\u0645\3\2\2\2\u0644\u0641\3\2\2\2\u0644\u0645\3\2\2\2\u0645\u0646"+
		"\3\2\2\2\u0646\u065f\5,\27\2\u0647\u0648\7$\2\2\u0648\u0649\7\22\2\2\u0649"+
		"\u064c\5,\27\2\u064a\u064b\7\22\2\2\u064b\u064d\5*\26\2\u064c\u064a\3"+
		"\2\2\2\u064c\u064d\3\2\2\2\u064d\u065f\3\2\2\2\u064e\u064f\t\31\2\2\u064f"+
		"\u0650\7\b\2\2\u0650\u065f\5\4\3\2\u0651\u0652\7\u0119\2\2\u0652\u065f"+
		"\7\u011a\2\2\u0653\u0656\7\u00ae\2\2\u0654\u0657\5X-\2\u0655\u0657\5\u011c"+
		"\u008f\2\u0656\u0654\3\2\2\2\u0656\u0655\3\2\2\2\u0657\u0658\3\2\2\2\u0658"+
		"\u065c\7\37\2\2\u0659\u065d\7\6\2\2\u065a\u065b\7\"\2\2\u065b\u065d\5"+
		",\27\2\u065c\u0659\3\2\2\2\u065c\u065a\3\2\2\2\u065d\u065f\3\2\2\2\u065e"+
		"\u063f\3\2\2\2\u065e\u0647\3\2\2\2\u065e\u064e\3\2\2\2\u065e\u0651\3\2"+
		"\2\2\u065e\u0653\3\2\2\2\u065f\u0123\3\2\2\2\u0660\u0661\7\u0095\2\2\u0661"+
		"\u0662\7\"\2\2\u0662\u0663\5,\27\2\u0663\u0664\7G\2\2\u0664\u0665\5R*"+
		"\2\u0665\u0666\7\u0132\2\2\u0666\u0667\5*\26\2\u0667\u0125\3\2\2\2\u0668"+
		"\u0669\7\u00cf\2\2\u0669\u066a\5*\26\2\u066a\u0127\3\2\2\2\u066b\u066c"+
		"\7\u0119\2\2\u066c\u066d\7\u011b\2\2\u066d\u066e\5R*\2\u066e\u066f\5\u00a6"+
		"T\2\u066f\u0129\3\2\2\2\u0670\u0671\7\u00d2\2\2\u0671\u0672\5*\26\2\u0672"+
		"\u0673\7\u0132\2\2\u0673\u0674\5D#\2\u0674\u0675\5\u00d8m\2\u0675\u0676"+
		"\5\u00b0Y\2\u0676\u012b\3\2\2\2\u00d1\u0141\u0147\u014b\u0153\u0155\u0157"+
		"\u015e\u016e\u0175\u01a8\u01b8\u01c1\u01c9\u01d1\u01d5\u01dc\u01e0\u01e2"+
		"\u01eb\u01f0\u01f5\u01f9\u01fe\u0202\u020b\u0212\u0218\u021d\u0222\u0227"+
		"\u022c\u0231\u0236\u023b\u024a\u0253\u0256\u0259\u0265\u026a\u026e\u0278"+
		"\u027c\u0289\u028d\u0294\u0299\u02a3\u02b1\u02b6\u02ba\u02bf\u02c1\u02c6"+
		"\u02cc\u02d1\u02d3\u02d7\u02db\u02e5\u02ef\u02f9\u02fb\u0301\u030b\u0312"+
		"\u031f\u0324\u0327\u032c\u033d\u0342\u0347\u034c\u0352\u0355\u0358\u035a"+
		"\u035d\u0360\u036c\u0371\u0376\u0382\u0387\u038d\u039a\u039e\u03a6\u03b2"+
		"\u03bc\u03c0\u03c2\u03c8\u03cb\u03ce\u03d2\u03e2\u03e7\u03eb\u03ee\u03f6"+
		"\u03fc\u0401\u0405\u0410\u0417\u041e\u0426\u042d\u0431\u0434\u043a\u043f"+
		"\u0448\u044e\u0452\u0455\u045b\u0463\u0466\u046c\u0476\u047d\u0480\u0488"+
		"\u048f\u0492\u0497\u049a\u049f\u04a6\u04a9\u04ac\u04b0\u04b7\u04ba\u04bd"+
		"\u04c1\u04c8\u04cb\u04ce\u04d2\u04d9\u04dc\u04df\u04e3\u04ec\u04ef\u04f2"+
		"\u04f6\u04ff\u0502\u0505\u0509\u0510\u0514\u0517\u051a\u051e\u0522\u0526"+
		"\u052a\u052e\u0532\u0536\u053d\u0541\u0548\u054b\u054f\u0553\u0557\u0559"+
		"\u055f\u0562\u056c\u0573\u0578\u057e\u058e\u0591\u0598\u059d\u05a4\u05ad"+
		"\u05b7\u05c6\u05cd\u05d5\u05db\u05e6\u05ec\u05ef\u0608\u060e\u0616\u061c"+
		"\u0625\u062c\u0632\u0639\u0644\u064c\u0656\u065c\u065e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}