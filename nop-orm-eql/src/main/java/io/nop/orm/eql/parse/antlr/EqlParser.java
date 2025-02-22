// Nop Generated from Eql.g4 by ANTLR 4.10.1
package io.nop.orm.eql.parse.antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*; //NOPMD - suppressed UnusedImports - Auto Gen Code
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator; //NOPMD - suppressed UnusedImports - Auto Gen Code
import java.util.ArrayList; //NOPMD - suppressed UnusedImports - Auto Gen Code

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
// tell cpd to start ignoring code - CPD-OFF
public class EqlParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		AND_=1, CONCAT_=2, NOT_=3, TILDE_=4, VERTICAL_BAR_=5, AMPERSAND_=6, SIGNED_LEFT_SHIFT_=7, 
		SIGNED_RIGHT_SHIFT_=8, CARET_=9, MOD_=10, COLON_=11, PLUS_=12, MINUS_=13, 
		ASTERISK_=14, SLASH_=15, BACKSLASH_=16, DOT_=17, DOT_ASTERISK_=18, SAFE_EQ_=19, 
		DEQ_=20, EQ_=21, NEQ_=22, GT_=23, GTE_=24, LT_=25, LTE_=26, POUND_=27, 
		LP_=28, RP_=29, LBE_=30, RBE_=31, LBT_=32, RBT_=33, COMMA_=34, DQ_=35, 
		SQ_=36, QUESTION_=37, AT_=38, SEMI_=39, BLOCK_COMMENT=40, INLINE_COMMENT=41, 
		WS=42, SELECT=43, INSERT=44, UPDATE=45, DELETE=46, CREATE=47, ALTER=48, 
		DROP=49, TRUNCATE=50, SCHEMA=51, GRANT=52, REVOKE=53, ADD=54, SET=55, 
		TABLE=56, COLUMN=57, INDEX=58, CONSTRAINT=59, PRIMARY=60, UNIQUE=61, FOREIGN=62, 
		KEY=63, POSITION=64, PRECISION=65, FUNCTION=66, TRIGGER=67, PROCEDURE=68, 
		VIEW=69, INTO=70, VALUES=71, WITH=72, UNION=73, DISTINCT=74, CASE=75, 
		WHEN=76, CAST=77, TRIM=78, SUBSTRING=79, FROM=80, NATURAL=81, JOIN=82, 
		FULL=83, INNER=84, OUTER=85, LEFT=86, LATERAL=87, RIGHT=88, CROSS=89, 
		USING=90, WHERE=91, AS=92, ON=93, IF=94, ELSE=95, THEN=96, FOR=97, TO=98, 
		AND=99, OR=100, IS=101, NOT=102, NULL=103, TRUE=104, FALSE=105, EXISTS=106, 
		BETWEEN=107, IN=108, ALL=109, ANY=110, LIKE=111, ILIKE=112, ORDER=113, 
		GROUP=114, BY=115, ASC=116, DESC=117, HAVING=118, LIMIT=119, OFFSET=120, 
		BEGIN=121, COMMIT=122, ROLLBACK=123, SAVEPOINT=124, BOOLEAN=125, DOUBLE=126, 
		CHAR=127, CHARACTER=128, ARRAY=129, INTERVAL=130, DATE=131, TIME=132, 
		TIMESTAMP=133, LOCALTIME=134, LOCALTIMESTAMP=135, YEAR=136, QUARTER=137, 
		MONTH=138, WEEK=139, DAY=140, HOUR=141, MINUTE=142, SECOND=143, MICROSECOND=144, 
		MAX=145, MIN=146, SUM=147, COUNT=148, AVG=149, DEFAULT=150, CURRENT=151, 
		ENABLE=152, DISABLE=153, CALL=154, INSTANCE=155, PRESERVE=156, DO=157, 
		DEFINER=158, CURRENT_USER=159, SQL=160, CASCADED=161, LOCAL=162, CLOSE=163, 
		OPEN=164, NEXT=165, NAME=166, COLLATION=167, NAMES=168, INTEGER=169, REAL=170, 
		DECIMAL=171, TYPE=172, VARCHAR=173, FLOAT=174, FOR_GENERATOR=175, CATALOG_NAME=176, 
		CHARACTER_SET_CATALOG=177, CHARACTER_SET_NAME=178, CHARACTER_SET_SCHEMA=179, 
		CLASS_ORIGIN=180, COBOL=181, COLLATION_CATALOG=182, COLLATION_NAME=183, 
		COLLATION_SCHEMA=184, COLUMN_NAME=185, COMMAND_FUNCTION=186, COMMITTED=187, 
		CONDITION_NUMBER=188, CONNECTION_NAME=189, CONSTRAINT_CATALOG=190, CONSTRAINT_NAME=191, 
		CONSTRAINT_SCHEMA=192, CURSOR_NAME=193, DATA=194, DATETIME_INTERVAL_CODE=195, 
		DATETIME_INTERVAL_PRECISION=196, DYNAMIC_FUNCTION=197, FORTRAN=198, LENGTH=199, 
		MESSAGE_LENGTH=200, MESSAGE_OCTET_LENGTH=201, MESSAGE_TEXT=202, MORE92=203, 
		MUMPS=204, NULLABLE=205, NUMBER=206, PASCAL=207, PLI=208, REPEATABLE=209, 
		RETURNED_LENGTH=210, RETURNED_OCTET_LENGTH=211, RETURNED_SQLSTATE=212, 
		ROW_COUNT=213, SCALE=214, SCHEMA_NAME=215, SERIALIZABLE=216, SERVER_NAME=217, 
		SUBCLASS_ORIGIN=218, TABLE_NAME=219, UNCOMMITTED=220, UNNAMED=221, ABSOLUTE=222, 
		ACTION=223, ALLOCATE=224, ARE=225, ASSERTION=226, AT=227, AUTHORIZATION=228, 
		BIT=229, BIT_LENGTH=230, BOTH=231, CASCADE=232, CATALOG=233, CHAR_LENGTH=234, 
		CHARACTER_LENGTH=235, CHECK=236, COALESCE=237, COLLATE=238, CONNECT=239, 
		CONNECTION=240, CONSTRAINTS=241, CONTINUE=242, CONVERT=243, CORRESPONDING=244, 
		CURRENT_DATE=245, CURRENT_TIME=246, CURRENT_TIMESTAMP=247, CURSOR=248, 
		DEALLOCATE=249, DEC=250, DECLARE=251, DEFERRABLE=252, DEFERRED=253, DESCRIBE=254, 
		DESCRIPTOR=255, DIAGNOSTICS=256, DISCONNECT=257, DOMAIN=258, END=259, 
		END_EXEC=260, ESCAPE=261, EXCEPT=262, EXCEPTION=263, EXEC=264, EXECUTE=265, 
		EXTERNAL=266, EXTRACT=267, FETCH=268, FIRST=269, FOUND=270, GET=271, GLOBAL=272, 
		GO=273, GOTO=274, IDENTITY=275, IMMEDIATE=276, INDICATOR=277, INITIALLY=278, 
		INPUT=279, INSENSITIVE=280, INTERSECT=281, ISOLATION=282, LANGUAGE=283, 
		LAST=284, LEADING=285, LEVEL=286, LOWER=287, MATCH=288, MODULE=289, NATIONAL=290, 
		NCHAR=291, NO=292, NULLIF=293, NUMERIC=294, OCTET_LENGTH=295, OF=296, 
		ONLY=297, OPTION=298, OUTPUT=299, OVERLAPS=300, PAD=301, PARTIAL=302, 
		PREPARE=303, PRIOR=304, PRIVILEGES=305, PUBLIC=306, READ=307, REFERENCES=308, 
		RELATIVE=309, RESTRICT=310, ROWS=311, SCROLL=312, SECTION=313, SESSION=314, 
		SESSION_USER=315, SIZE=316, SMALLINT=317, SOME=318, SPACE=319, SQLCODE=320, 
		SQLERROR=321, SQLSTATE=322, SYSTEM_USER=323, TEMPORARY=324, TIMEZONE_HOUR=325, 
		TIMEZONE_MINUTE=326, TRAILING=327, TRANSACTION=328, TRANSLATE=329, TRANSLATION=330, 
		UNKNOWN=331, UPPER=332, USAGE=333, USER=334, VALUE=335, VARYING=336, WHENEVER=337, 
		WORK=338, WRITE=339, ZONE=340, IDENTIFIER_=341, STRING_=342, NUMBER_=343, 
		HEX_DIGIT_=344, BIT_NUM_=345, STRING=346;
	public static final int
		RULE_sqlProgram = 0, RULE_sqlStatements_ = 1, RULE_sqlStatement = 2, RULE_sqlDmlStatement = 3, 
		RULE_sqlTransactionStatement = 4, RULE_sqlCommit = 5, RULE_sqlRollback = 6, 
		RULE_sqlInsert = 7, RULE_sqlUpdate = 8, RULE_sqlAssignments_ = 9, RULE_sqlAssignment = 10, 
		RULE_sqlValues = 11, RULE_sqlValues_ = 12, RULE_sqlDelete = 13, RULE_sqlSelectWithCte = 14, 
		RULE_sqlCteStatement = 15, RULE_sqlCteStatements_ = 16, RULE_sqlSelect = 17, 
		RULE_unionType_ = 18, RULE_sqlQuerySelect = 19, RULE_sqlProjections_ = 20, 
		RULE_sqlProjection = 21, RULE_sqlExprProjection = 22, RULE_sqlAllProjection = 23, 
		RULE_sqlAlias = 24, RULE_sqlAlias_ = 25, RULE_sqlFrom = 26, RULE_tableSources_ = 27, 
		RULE_sqlTableSource = 28, RULE_sqlSingleTableSource = 29, RULE_sqlSubqueryTableSource = 30, 
		RULE_joinType_ = 31, RULE_sqlTableSource_joinRight = 32, RULE_innerJoin_ = 33, 
		RULE_fullJoin_ = 34, RULE_leftJoin_ = 35, RULE_rightJoin_ = 36, RULE_sqlWhere = 37, 
		RULE_sqlGroupBy = 38, RULE_sqlGroupByItems_ = 39, RULE_sqlHaving = 40, 
		RULE_sqlLimit = 41, RULE_sqlExpr_limitRowCount = 42, RULE_sqlExpr_limitOffset = 43, 
		RULE_sqlSubQueryExpr = 44, RULE_forUpdate_ = 45, RULE_sqlParameterMarker = 46, 
		RULE_sqlLiteral = 47, RULE_sqlStringLiteral = 48, RULE_sqlNumberLiteral = 49, 
		RULE_sqlDateTimeLiteral = 50, RULE_sqlHexadecimalLiteral = 51, RULE_sqlBitValueLiteral = 52, 
		RULE_sqlBooleanLiteral = 53, RULE_sqlNullLiteral = 54, RULE_sqlIdentifier_ = 55, 
		RULE_unreservedWord_ = 56, RULE_sqlTableName = 57, RULE_sqlColumnName = 58, 
		RULE_sqlQualifiedName = 59, RULE_columnNames_ = 60, RULE_sqlExpr = 61, 
		RULE_sqlExpr_primary = 62, RULE_comparisonOperator_ = 63, RULE_sqlExpr_predicate = 64, 
		RULE_sqlInValues_ = 65, RULE_sqlExpr_bit = 66, RULE_sqlExpr_simple = 67, 
		RULE_sqlUnaryExpr = 68, RULE_sqlExpr_brace = 69, RULE_sqlMultiValueExpr = 70, 
		RULE_sqlExistsExpr = 71, RULE_sqlExpr_functionCall = 72, RULE_sqlAggregateFunction = 73, 
		RULE_sqlIdentifier_agg_ = 74, RULE_distinct_ = 75, RULE_functionArgs_ = 76, 
		RULE_sqlExpr_special = 77, RULE_sqlCastExpr = 78, RULE_sqlRegularFunction = 79, 
		RULE_sqlIdentifier_func_ = 80, RULE_sqlDecorators_ = 81, RULE_sqlDecorator = 82, 
		RULE_decoratorArgs_ = 83, RULE_sqlCaseExpr = 84, RULE_caseWhens_ = 85, 
		RULE_sqlCaseWhenItem = 86, RULE_sqlIntervalExpr = 87, RULE_intervalUnit_ = 88, 
		RULE_sqlOrderBy = 89, RULE_sqlOrderByItems_ = 90, RULE_sqlOrderByItem = 91, 
		RULE_sqlGroupByItem = 92, RULE_sqlTypeExpr = 93, RULE_dataTypeName_ = 94, 
		RULE_characterSet_ = 95, RULE_collateClause_ = 96;
	private static String[] makeRuleNames() {
		return new String[] {
			"sqlProgram", "sqlStatements_", "sqlStatement", "sqlDmlStatement", "sqlTransactionStatement", 
			"sqlCommit", "sqlRollback", "sqlInsert", "sqlUpdate", "sqlAssignments_", 
			"sqlAssignment", "sqlValues", "sqlValues_", "sqlDelete", "sqlSelectWithCte", 
			"sqlCteStatement", "sqlCteStatements_", "sqlSelect", "unionType_", "sqlQuerySelect", 
			"sqlProjections_", "sqlProjection", "sqlExprProjection", "sqlAllProjection", 
			"sqlAlias", "sqlAlias_", "sqlFrom", "tableSources_", "sqlTableSource", 
			"sqlSingleTableSource", "sqlSubqueryTableSource", "joinType_", "sqlTableSource_joinRight", 
			"innerJoin_", "fullJoin_", "leftJoin_", "rightJoin_", "sqlWhere", "sqlGroupBy", 
			"sqlGroupByItems_", "sqlHaving", "sqlLimit", "sqlExpr_limitRowCount", 
			"sqlExpr_limitOffset", "sqlSubQueryExpr", "forUpdate_", "sqlParameterMarker", 
			"sqlLiteral", "sqlStringLiteral", "sqlNumberLiteral", "sqlDateTimeLiteral", 
			"sqlHexadecimalLiteral", "sqlBitValueLiteral", "sqlBooleanLiteral", "sqlNullLiteral", 
			"sqlIdentifier_", "unreservedWord_", "sqlTableName", "sqlColumnName", 
			"sqlQualifiedName", "columnNames_", "sqlExpr", "sqlExpr_primary", "comparisonOperator_", 
			"sqlExpr_predicate", "sqlInValues_", "sqlExpr_bit", "sqlExpr_simple", 
			"sqlUnaryExpr", "sqlExpr_brace", "sqlMultiValueExpr", "sqlExistsExpr", 
			"sqlExpr_functionCall", "sqlAggregateFunction", "sqlIdentifier_agg_", 
			"distinct_", "functionArgs_", "sqlExpr_special", "sqlCastExpr", "sqlRegularFunction", 
			"sqlIdentifier_func_", "sqlDecorators_", "sqlDecorator", "decoratorArgs_", 
			"sqlCaseExpr", "caseWhens_", "sqlCaseWhenItem", "sqlIntervalExpr", "intervalUnit_", 
			"sqlOrderBy", "sqlOrderByItems_", "sqlOrderByItem", "sqlGroupByItem", 
			"sqlTypeExpr", "dataTypeName_", "characterSet_", "collateClause_"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'&&'", "'||'", "'!'", "'~'", "'|'", "'&'", "'<<'", "'>>'", "'^'", 
			"'%'", "':'", "'+'", "'-'", "'*'", "'/'", "'\\'", "'.'", "'.*'", "'<=>'", 
			"'=='", "'='", null, "'>'", "'>='", "'<'", "'<='", "'#'", "'('", "')'", 
			"'{'", "'}'", "'['", "']'", "','", "'\"'", "'''", "'?'", "'@'", "';'", 
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
			null, null, null, "'DO NOT MATCH ANY THING, JUST FOR GENERATOR'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "AND_", "CONCAT_", "NOT_", "TILDE_", "VERTICAL_BAR_", "AMPERSAND_", 
			"SIGNED_LEFT_SHIFT_", "SIGNED_RIGHT_SHIFT_", "CARET_", "MOD_", "COLON_", 
			"PLUS_", "MINUS_", "ASTERISK_", "SLASH_", "BACKSLASH_", "DOT_", "DOT_ASTERISK_", 
			"SAFE_EQ_", "DEQ_", "EQ_", "NEQ_", "GT_", "GTE_", "LT_", "LTE_", "POUND_", 
			"LP_", "RP_", "LBE_", "RBE_", "LBT_", "RBT_", "COMMA_", "DQ_", "SQ_", 
			"QUESTION_", "AT_", "SEMI_", "BLOCK_COMMENT", "INLINE_COMMENT", "WS", 
			"SELECT", "INSERT", "UPDATE", "DELETE", "CREATE", "ALTER", "DROP", "TRUNCATE", 
			"SCHEMA", "GRANT", "REVOKE", "ADD", "SET", "TABLE", "COLUMN", "INDEX", 
			"CONSTRAINT", "PRIMARY", "UNIQUE", "FOREIGN", "KEY", "POSITION", "PRECISION", 
			"FUNCTION", "TRIGGER", "PROCEDURE", "VIEW", "INTO", "VALUES", "WITH", 
			"UNION", "DISTINCT", "CASE", "WHEN", "CAST", "TRIM", "SUBSTRING", "FROM", 
			"NATURAL", "JOIN", "FULL", "INNER", "OUTER", "LEFT", "LATERAL", "RIGHT", 
			"CROSS", "USING", "WHERE", "AS", "ON", "IF", "ELSE", "THEN", "FOR", "TO", 
			"AND", "OR", "IS", "NOT", "NULL", "TRUE", "FALSE", "EXISTS", "BETWEEN", 
			"IN", "ALL", "ANY", "LIKE", "ILIKE", "ORDER", "GROUP", "BY", "ASC", "DESC", 
			"HAVING", "LIMIT", "OFFSET", "BEGIN", "COMMIT", "ROLLBACK", "SAVEPOINT", 
			"BOOLEAN", "DOUBLE", "CHAR", "CHARACTER", "ARRAY", "INTERVAL", "DATE", 
			"TIME", "TIMESTAMP", "LOCALTIME", "LOCALTIMESTAMP", "YEAR", "QUARTER", 
			"MONTH", "WEEK", "DAY", "HOUR", "MINUTE", "SECOND", "MICROSECOND", "MAX", 
			"MIN", "SUM", "COUNT", "AVG", "DEFAULT", "CURRENT", "ENABLE", "DISABLE", 
			"CALL", "INSTANCE", "PRESERVE", "DO", "DEFINER", "CURRENT_USER", "SQL", 
			"CASCADED", "LOCAL", "CLOSE", "OPEN", "NEXT", "NAME", "COLLATION", "NAMES", 
			"INTEGER", "REAL", "DECIMAL", "TYPE", "VARCHAR", "FLOAT", "FOR_GENERATOR", 
			"CATALOG_NAME", "CHARACTER_SET_CATALOG", "CHARACTER_SET_NAME", "CHARACTER_SET_SCHEMA", 
			"CLASS_ORIGIN", "COBOL", "COLLATION_CATALOG", "COLLATION_NAME", "COLLATION_SCHEMA", 
			"COLUMN_NAME", "COMMAND_FUNCTION", "COMMITTED", "CONDITION_NUMBER", "CONNECTION_NAME", 
			"CONSTRAINT_CATALOG", "CONSTRAINT_NAME", "CONSTRAINT_SCHEMA", "CURSOR_NAME", 
			"DATA", "DATETIME_INTERVAL_CODE", "DATETIME_INTERVAL_PRECISION", "DYNAMIC_FUNCTION", 
			"FORTRAN", "LENGTH", "MESSAGE_LENGTH", "MESSAGE_OCTET_LENGTH", "MESSAGE_TEXT", 
			"MORE92", "MUMPS", "NULLABLE", "NUMBER", "PASCAL", "PLI", "REPEATABLE", 
			"RETURNED_LENGTH", "RETURNED_OCTET_LENGTH", "RETURNED_SQLSTATE", "ROW_COUNT", 
			"SCALE", "SCHEMA_NAME", "SERIALIZABLE", "SERVER_NAME", "SUBCLASS_ORIGIN", 
			"TABLE_NAME", "UNCOMMITTED", "UNNAMED", "ABSOLUTE", "ACTION", "ALLOCATE", 
			"ARE", "ASSERTION", "AT", "AUTHORIZATION", "BIT", "BIT_LENGTH", "BOTH", 
			"CASCADE", "CATALOG", "CHAR_LENGTH", "CHARACTER_LENGTH", "CHECK", "COALESCE", 
			"COLLATE", "CONNECT", "CONNECTION", "CONSTRAINTS", "CONTINUE", "CONVERT", 
			"CORRESPONDING", "CURRENT_DATE", "CURRENT_TIME", "CURRENT_TIMESTAMP", 
			"CURSOR", "DEALLOCATE", "DEC", "DECLARE", "DEFERRABLE", "DEFERRED", "DESCRIBE", 
			"DESCRIPTOR", "DIAGNOSTICS", "DISCONNECT", "DOMAIN", "END", "END_EXEC", 
			"ESCAPE", "EXCEPT", "EXCEPTION", "EXEC", "EXECUTE", "EXTERNAL", "EXTRACT", 
			"FETCH", "FIRST", "FOUND", "GET", "GLOBAL", "GO", "GOTO", "IDENTITY", 
			"IMMEDIATE", "INDICATOR", "INITIALLY", "INPUT", "INSENSITIVE", "INTERSECT", 
			"ISOLATION", "LANGUAGE", "LAST", "LEADING", "LEVEL", "LOWER", "MATCH", 
			"MODULE", "NATIONAL", "NCHAR", "NO", "NULLIF", "NUMERIC", "OCTET_LENGTH", 
			"OF", "ONLY", "OPTION", "OUTPUT", "OVERLAPS", "PAD", "PARTIAL", "PREPARE", 
			"PRIOR", "PRIVILEGES", "PUBLIC", "READ", "REFERENCES", "RELATIVE", "RESTRICT", 
			"ROWS", "SCROLL", "SECTION", "SESSION", "SESSION_USER", "SIZE", "SMALLINT", 
			"SOME", "SPACE", "SQLCODE", "SQLERROR", "SQLSTATE", "SYSTEM_USER", "TEMPORARY", 
			"TIMEZONE_HOUR", "TIMEZONE_MINUTE", "TRAILING", "TRANSACTION", "TRANSLATE", 
			"TRANSLATION", "UNKNOWN", "UPPER", "USAGE", "USER", "VALUE", "VARYING", 
			"WHENEVER", "WORK", "WRITE", "ZONE", "IDENTIFIER_", "STRING_", "NUMBER_", 
			"HEX_DIGIT_", "BIT_NUM_", "STRING"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "Eql.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public EqlParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class SqlProgramContext extends ParserRuleContext {
		public SqlStatements_Context statements;
		public SqlStatements_Context sqlStatements_() {
			return getRuleContext(SqlStatements_Context.class,0);
		}
		public SqlProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sqlProgram; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).enterSqlProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).exitSqlProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EqlVisitor ) return ((EqlVisitor<? extends T>)visitor).visitSqlProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SqlProgramContext sqlProgram() throws RecognitionException {
		SqlProgramContext _localctx = new SqlProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_sqlProgram);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			((SqlProgramContext)_localctx).statements = sqlStatements_();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SqlStatements_Context extends ParserRuleContext {
		public SqlStatementContext e;
		public List<SqlStatementContext> sqlStatement() {
			return getRuleContexts(SqlStatementContext.class);
		}
		public SqlStatementContext sqlStatement(int i) {
			return getRuleContext(SqlStatementContext.class,i);
		}
		public List<TerminalNode> SEMI_() { return getTokens(EqlParser.SEMI_); }
		public TerminalNode SEMI_(int i) {
			return getToken(EqlParser.SEMI_, i);
		}
		public SqlStatements_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sqlStatements_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).enterSqlStatements_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).exitSqlStatements_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EqlVisitor ) return ((EqlVisitor<? extends T>)visitor).visitSqlStatements_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SqlStatements_Context sqlStatements_() throws RecognitionException {
		SqlStatements_Context _localctx = new SqlStatements_Context(_ctx, getState());
		enterRule(_localctx, 2, RULE_sqlStatements_);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			((SqlStatements_Context)_localctx).e = sqlStatement();
			setState(201);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(197);
					match(SEMI_);
					setState(198);
					((SqlStatements_Context)_localctx).e = sqlStatement();
					}
					} 
				}
				setState(203);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(205);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI_) {
				{
				setState(204);
				match(SEMI_);
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

	public static class SqlStatementContext extends ParserRuleContext {
		public SqlDmlStatementContext sqlDmlStatement() {
			return getRuleContext(SqlDmlStatementContext.class,0);
		}
		public SqlTransactionStatementContext sqlTransactionStatement() {
			return getRuleContext(SqlTransactionStatementContext.class,0);
		}
		public SqlStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sqlStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).enterSqlStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).exitSqlStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EqlVisitor ) return ((EqlVisitor<? extends T>)visitor).visitSqlStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SqlStatementContext sqlStatement() throws RecognitionException {
		SqlStatementContext _localctx = new SqlStatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_sqlStatement);
		try {
			setState(209);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LP_:
			case AT_:
			case SELECT:
			case INSERT:
			case UPDATE:
			case DELETE:
			case WITH:
				enterOuterAlt(_localctx, 1);
				{
				setState(207);
				sqlDmlStatement();
				}
				break;
			case COMMIT:
			case ROLLBACK:
				enterOuterAlt(_localctx, 2);
				{
				setState(208);
				sqlTransactionStatement();
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

	public static class SqlDmlStatementContext extends ParserRuleContext {
		public SqlSelectWithCteContext sqlSelectWithCte() {
			return getRuleContext(SqlSelectWithCteContext.class,0);
		}
		public SqlSelectContext sqlSelect() {
			return getRuleContext(SqlSelectContext.class,0);
		}
		public SqlInsertContext sqlInsert() {
			return getRuleContext(SqlInsertContext.class,0);
		}
		public SqlUpdateContext sqlUpdate() {
			return getRuleContext(SqlUpdateContext.class,0);
		}
		public SqlDeleteContext sqlDelete() {
			return getRuleContext(SqlDeleteContext.class,0);
		}
		public SqlDmlStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sqlDmlStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).enterSqlDmlStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).exitSqlDmlStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EqlVisitor ) return ((EqlVisitor<? extends T>)visitor).visitSqlDmlStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SqlDmlStatementContext sqlDmlStatement() throws RecognitionException {
		SqlDmlStatementContext _localctx = new SqlDmlStatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_sqlDmlStatement);
		try {
			setState(216);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(211);
				sqlSelectWithCte();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(212);
				sqlSelect(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(213);
				sqlInsert();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(214);
				sqlUpdate();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(215);
				sqlDelete();
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

	public static class SqlTransactionStatementContext extends ParserRuleContext {
		public SqlCommitContext sqlCommit() {
			return getRuleContext(SqlCommitContext.class,0);
		}
		public SqlRollbackContext sqlRollback() {
			return getRuleContext(SqlRollbackContext.class,0);
		}
		public SqlTransactionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sqlTransactionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).enterSqlTransactionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).exitSqlTransactionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EqlVisitor ) return ((EqlVisitor<? extends T>)visitor).visitSqlTransactionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SqlTransactionStatementContext sqlTransactionStatement() throws RecognitionException {
		SqlTransactionStatementContext _localctx = new SqlTransactionStatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_sqlTransactionStatement);
		try {
			setState(220);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(218);
				sqlCommit();
				}
				break;
			case ROLLBACK:
				enterOuterAlt(_localctx, 2);
				{
				setState(219);
				sqlRollback();
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

	public static class SqlCommitContext extends ParserRuleContext {
		public TerminalNode COMMIT() { return getToken(EqlParser.COMMIT, 0); }
		public SqlCommitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sqlCommit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).enterSqlCommit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).exitSqlCommit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EqlVisitor ) return ((EqlVisitor<? extends T>)visitor).visitSqlCommit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SqlCommitContext sqlCommit() throws RecognitionException {
		SqlCommitContext _localctx = new SqlCommitContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_sqlCommit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			match(COMMIT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SqlRollbackContext extends ParserRuleContext {
		public TerminalNode ROLLBACK() { return getToken(EqlParser.ROLLBACK, 0); }
		public SqlRollbackContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sqlRollback; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).enterSqlRollback(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).exitSqlRollback(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EqlVisitor ) return ((EqlVisitor<? extends T>)visitor).visitSqlRollback(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SqlRollbackContext sqlRollback() throws RecognitionException {
		SqlRollbackContext _localctx = new SqlRollbackContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_sqlRollback);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			match(ROLLBACK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SqlInsertContext extends ParserRuleContext {
		public SqlDecorators_Context decorators;
		public SqlTableNameContext tableName;
		public ColumnNames_Context columns;
		public SqlValuesContext values;
		public SqlSelectContext select;
		public TerminalNode INSERT() { return getToken(EqlParser.INSERT, 0); }
		public TerminalNode INTO() { return getToken(EqlParser.INTO, 0); }
		public TerminalNode LP_() { return getToken(EqlParser.LP_, 0); }
		public TerminalNode RP_() { return getToken(EqlParser.RP_, 0); }
		public SqlTableNameContext sqlTableName() {
			return getRuleContext(SqlTableNameContext.class,0);
		}
		public ColumnNames_Context columnNames_() {
			return getRuleContext(ColumnNames_Context.class,0);
		}
		public SqlValuesContext sqlValues() {
			return getRuleContext(SqlValuesContext.class,0);
		}
		public SqlSelectContext sqlSelect() {
			return getRuleContext(SqlSelectContext.class,0);
		}
		public SqlDecorators_Context sqlDecorators_() {
			return getRuleContext(SqlDecorators_Context.class,0);
		}
		public SqlInsertContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sqlInsert; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).enterSqlInsert(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).exitSqlInsert(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EqlVisitor ) return ((EqlVisitor<? extends T>)visitor).visitSqlInsert(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SqlInsertContext sqlInsert() throws RecognitionException {
		SqlInsertContext _localctx = new SqlInsertContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_sqlInsert);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT_) {
				{
				setState(226);
				((SqlInsertContext)_localctx).decorators = sqlDecorators_();
				}
			}

			setState(229);
			match(INSERT);
			setState(230);
			match(INTO);
			setState(231);
			((SqlInsertContext)_localctx).tableName = sqlTableName();
			setState(232);
			match(LP_);
			setState(233);
			((SqlInsertContext)_localctx).columns = columnNames_();
			setState(234);
			match(RP_);
			setState(237);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VALUES:
				{
				setState(235);
				((SqlInsertContext)_localctx).values = sqlValues();
				}
				break;
			case LP_:
			case AT_:
			case SELECT:
				{
				setState(236);
				((SqlInsertContext)_localctx).select = sqlSelect(0);
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

	public static class SqlUpdateContext extends ParserRuleContext {
		public SqlDecorators_Context decorators;
		public SqlTableNameContext tableName;
		public SqlAliasContext alias;
		public SqlAssignments_Context assignments;
		public SqlWhereContext where;
		public TerminalNode UPDATE() { return getToken(EqlParser.UPDATE, 0); }
		public SqlTableNameContext sqlTableName() {
			return getRuleContext(SqlTableNameContext.class,0);
		}
		public SqlAssignments_Context sqlAssignments_() {
			return getRuleContext(SqlAssignments_Context.class,0);
		}
		public SqlDecorators_Context sqlDecorators_() {
			return getRuleContext(SqlDecorators_Context.class,0);
		}
		public SqlWhereContext sqlWhere() {
			return getRuleContext(SqlWhereContext.class,0);
		}
		public TerminalNode AS() { return getToken(EqlParser.AS, 0); }
		public SqlAliasContext sqlAlias() {
			return getRuleContext(SqlAliasContext.class,0);
		}
		public SqlUpdateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sqlUpdate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).enterSqlUpdate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).exitSqlUpdate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EqlVisitor ) return ((EqlVisitor<? extends T>)visitor).visitSqlUpdate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SqlUpdateContext sqlUpdate() throws RecognitionException {
		SqlUpdateContext _localctx = new SqlUpdateContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_sqlUpdate);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT_) {
				{
				setState(239);
				((SqlUpdateContext)_localctx).decorators = sqlDecorators_();
				}
			}

			setState(242);
			match(UPDATE);
			setState(243);
			((SqlUpdateContext)_localctx).tableName = sqlTableName();
			{
			setState(245);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(244);
				match(AS);
				}
			}

			setState(248);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==POSITION || ((((_la - 136)) & ~0x3f) == 0 && ((1L << (_la - 136)) & ((1L << (YEAR - 136)) | (1L << (MONTH - 136)) | (1L << (COUNT - 136)) | (1L << (NAME - 136)) | (1L << (TYPE - 136)) | (1L << (CATALOG_NAME - 136)) | (1L << (CHARACTER_SET_CATALOG - 136)) | (1L << (CHARACTER_SET_NAME - 136)) | (1L << (CHARACTER_SET_SCHEMA - 136)) | (1L << (CLASS_ORIGIN - 136)) | (1L << (COBOL - 136)) | (1L << (COLLATION_CATALOG - 136)) | (1L << (COLLATION_NAME - 136)) | (1L << (COLLATION_SCHEMA - 136)) | (1L << (COLUMN_NAME - 136)) | (1L << (COMMAND_FUNCTION - 136)) | (1L << (COMMITTED - 136)) | (1L << (CONDITION_NUMBER - 136)) | (1L << (CONNECTION_NAME - 136)) | (1L << (CONSTRAINT_CATALOG - 136)) | (1L << (CONSTRAINT_NAME - 136)) | (1L << (CONSTRAINT_SCHEMA - 136)) | (1L << (CURSOR_NAME - 136)) | (1L << (DATA - 136)) | (1L << (DATETIME_INTERVAL_CODE - 136)) | (1L << (DATETIME_INTERVAL_PRECISION - 136)) | (1L << (DYNAMIC_FUNCTION - 136)) | (1L << (FORTRAN - 136)) | (1L << (LENGTH - 136)))) != 0) || ((((_la - 200)) & ~0x3f) == 0 && ((1L << (_la - 200)) & ((1L << (MESSAGE_LENGTH - 200)) | (1L << (MESSAGE_OCTET_LENGTH - 200)) | (1L << (MESSAGE_TEXT - 200)) | (1L << (MORE92 - 200)) | (1L << (MUMPS - 200)) | (1L << (NULLABLE - 200)) | (1L << (NUMBER - 200)) | (1L << (PASCAL - 200)) | (1L << (PLI - 200)) | (1L << (REPEATABLE - 200)) | (1L << (RETURNED_LENGTH - 200)) | (1L << (RETURNED_OCTET_LENGTH - 200)) | (1L << (RETURNED_SQLSTATE - 200)) | (1L << (ROW_COUNT - 200)) | (1L << (SCALE - 200)) | (1L << (SCHEMA_NAME - 200)) | (1L << (SERIALIZABLE - 200)) | (1L << (SERVER_NAME - 200)) | (1L << (SUBCLASS_ORIGIN - 200)) | (1L << (TABLE_NAME - 200)) | (1L << (UNCOMMITTED - 200)) | (1L << (UNNAMED - 200)) | (1L << (COALESCE - 200)))) != 0) || ((((_la - 286)) & ~0x3f) == 0 && ((1L << (_la - 286)) & ((1L << (LEVEL - 286)) | (1L << (SESSION - 286)) | (1L << (VALUE - 286)) | (1L << (IDENTIFIER_ - 286)) | (1L << (STRING_ - 286)))) != 0)) {
				{
				setState(247);
				((SqlUpdateContext)_localctx).alias = sqlAlias();
				}
			}

			}
			{
			setState(250);
			((SqlUpdateContext)_localctx).assignments = sqlAssignments_();
			}
			setState(252);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(251);
				((SqlUpdateContext)_localctx).where = sqlWhere();
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

	public static class SqlAssignments_Context extends ParserRuleContext {
		public SqlAssignmentContext e;
		public TerminalNode SET() { return getToken(EqlParser.SET, 0); }
		public List<SqlAssignmentContext> sqlAssignment() {
			return getRuleContexts(SqlAssignmentContext.class);
		}
		public SqlAssignmentContext sqlAssignment(int i) {
			return getRuleContext(SqlAssignmentContext.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(EqlParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(EqlParser.COMMA_, i);
		}
		public SqlAssignments_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sqlAssignments_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).enterSqlAssignments_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).exitSqlAssignments_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EqlVisitor ) return ((EqlVisitor<? extends T>)visitor).visitSqlAssignments_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SqlAssignments_Context sqlAssignments_() throws RecognitionException {
		SqlAssignments_Context _localctx = new SqlAssignments_Context(_ctx, getState());
		enterRule(_localctx, 18, RULE_sqlAssignments_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			match(SET);
			setState(255);
			((SqlAssignments_Context)_localctx).e = sqlAssignment();
			setState(260);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(256);
				match(COMMA_);
				setState(257);
				((SqlAssignments_Context)_localctx).e = sqlAssignment();
				}
				}
				setState(262);
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

	public static class SqlAssignmentContext extends ParserRuleContext {
		public SqlColumnNameContext columnName;
		public SqlExprContext expr;
		public TerminalNode EQ_() { return getToken(EqlParser.EQ_, 0); }
		public SqlColumnNameContext sqlColumnName() {
			return getRuleContext(SqlColumnNameContext.class,0);
		}
		public SqlExprContext sqlExpr() {
			return getRuleContext(SqlExprContext.class,0);
		}
		public SqlAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sqlAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).enterSqlAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).exitSqlAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EqlVisitor ) return ((EqlVisitor<? extends T>)visitor).visitSqlAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SqlAssignmentContext sqlAssignment() throws RecognitionException {
		SqlAssignmentContext _localctx = new SqlAssignmentContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_sqlAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			((SqlAssignmentContext)_localctx).columnName = sqlColumnName();
			setState(264);
			match(EQ_);
			setState(265);
			((SqlAssignmentContext)_localctx).expr = sqlExpr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SqlValuesContext extends ParserRuleContext {
		public SqlValues_Context values;
		public SqlValues_Context sqlValues_() {
			return getRuleContext(SqlValues_Context.class,0);
		}
		public SqlValuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sqlValues; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).enterSqlValues(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).exitSqlValues(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EqlVisitor ) return ((EqlVisitor<? extends T>)visitor).visitSqlValues(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SqlValuesContext sqlValues() throws RecognitionException {
		SqlValuesContext _localctx = new SqlValuesContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_sqlValues);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			((SqlValuesContext)_localctx).values = sqlValues_();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SqlValues_Context extends ParserRuleContext {
		public SqlExprContext e;
		public TerminalNode VALUES() { return getToken(EqlParser.VALUES, 0); }
		public TerminalNode LP_() { return getToken(EqlParser.LP_, 0); }
		public List<SqlExprContext> sqlExpr() {
			return getRuleContexts(SqlExprContext.class);
		}
		public SqlExprContext sqlExpr(int i) {
			return getRuleContext(SqlExprContext.class,i);
		}
		public TerminalNode RP_() { return getToken(EqlParser.RP_, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(EqlParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(EqlParser.COMMA_, i);
		}
		public SqlValues_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sqlValues_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).enterSqlValues_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).exitSqlValues_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EqlVisitor ) return ((EqlVisitor<? extends T>)visitor).visitSqlValues_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SqlValues_Context sqlValues_() throws RecognitionException {
		SqlValues_Context _localctx = new SqlValues_Context(_ctx, getState());
		enterRule(_localctx, 24, RULE_sqlValues_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			match(VALUES);
			setState(270);
			match(LP_);
			setState(271);
			((SqlValues_Context)_localctx).e = sqlExpr(0);
			setState(276);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(272);
				match(COMMA_);
				setState(273);
				((SqlValues_Context)_localctx).e = sqlExpr(0);
				}
				}
				setState(278);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			{
			setState(279);
			match(RP_);
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

	public static class SqlDeleteContext extends ParserRuleContext {
		public SqlDecorators_Context decorators;
		public SqlTableNameContext tableName;
		public SqlAliasContext alias;
		public SqlWhereContext where;
		public TerminalNode DELETE() { return getToken(EqlParser.DELETE, 0); }
		public TerminalNode FROM() { return getToken(EqlParser.FROM, 0); }
		public SqlTableNameContext sqlTableName() {
			return getRuleContext(SqlTableNameContext.class,0);
		}
		public TerminalNode AS() { return getToken(EqlParser.AS, 0); }
		public SqlDecorators_Context sqlDecorators_() {
			return getRuleContext(SqlDecorators_Context.class,0);
		}
		public SqlAliasContext sqlAlias() {
			return getRuleContext(SqlAliasContext.class,0);
		}
		public SqlWhereContext sqlWhere() {
			return getRuleContext(SqlWhereContext.class,0);
		}
		public SqlDeleteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sqlDelete; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).enterSqlDelete(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).exitSqlDelete(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EqlVisitor ) return ((EqlVisitor<? extends T>)visitor).visitSqlDelete(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SqlDeleteContext sqlDelete() throws RecognitionException {
		SqlDeleteContext _localctx = new SqlDeleteContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_sqlDelete);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT_) {
				{
				setState(281);
				((SqlDeleteContext)_localctx).decorators = sqlDecorators_();
				}
			}

			setState(284);
			match(DELETE);
			setState(285);
			match(FROM);
			setState(286);
			((SqlDeleteContext)_localctx).tableName = sqlTableName();
			setState(288);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(287);
				match(AS);
				}
			}

			setState(291);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==POSITION || ((((_la - 136)) & ~0x3f) == 0 && ((1L << (_la - 136)) & ((1L << (YEAR - 136)) | (1L << (MONTH - 136)) | (1L << (COUNT - 136)) | (1L << (NAME - 136)) | (1L << (TYPE - 136)) | (1L << (CATALOG_NAME - 136)) | (1L << (CHARACTER_SET_CATALOG - 136)) | (1L << (CHARACTER_SET_NAME - 136)) | (1L << (CHARACTER_SET_SCHEMA - 136)) | (1L << (CLASS_ORIGIN - 136)) | (1L << (COBOL - 136)) | (1L << (COLLATION_CATALOG - 136)) | (1L << (COLLATION_NAME - 136)) | (1L << (COLLATION_SCHEMA - 136)) | (1L << (COLUMN_NAME - 136)) | (1L << (COMMAND_FUNCTION - 136)) | (1L << (COMMITTED - 136)) | (1L << (CONDITION_NUMBER - 136)) | (1L << (CONNECTION_NAME - 136)) | (1L << (CONSTRAINT_CATALOG - 136)) | (1L << (CONSTRAINT_NAME - 136)) | (1L << (CONSTRAINT_SCHEMA - 136)) | (1L << (CURSOR_NAME - 136)) | (1L << (DATA - 136)) | (1L << (DATETIME_INTERVAL_CODE - 136)) | (1L << (DATETIME_INTERVAL_PRECISION - 136)) | (1L << (DYNAMIC_FUNCTION - 136)) | (1L << (FORTRAN - 136)) | (1L << (LENGTH - 136)))) != 0) || ((((_la - 200)) & ~0x3f) == 0 && ((1L << (_la - 200)) & ((1L << (MESSAGE_LENGTH - 200)) | (1L << (MESSAGE_OCTET_LENGTH - 200)) | (1L << (MESSAGE_TEXT - 200)) | (1L << (MORE92 - 200)) | (1L << (MUMPS - 200)) | (1L << (NULLABLE - 200)) | (1L << (NUMBER - 200)) | (1L << (PASCAL - 200)) | (1L << (PLI - 200)) | (1L << (REPEATABLE - 200)) | (1L << (RETURNED_LENGTH - 200)) | (1L << (RETURNED_OCTET_LENGTH - 200)) | (1L << (RETURNED_SQLSTATE - 200)) | (1L << (ROW_COUNT - 200)) | (1L << (SCALE - 200)) | (1L << (SCHEMA_NAME - 200)) | (1L << (SERIALIZABLE - 200)) | (1L << (SERVER_NAME - 200)) | (1L << (SUBCLASS_ORIGIN - 200)) | (1L << (TABLE_NAME - 200)) | (1L << (UNCOMMITTED - 200)) | (1L << (UNNAMED - 200)) | (1L << (COALESCE - 200)))) != 0) || ((((_la - 286)) & ~0x3f) == 0 && ((1L << (_la - 286)) & ((1L << (LEVEL - 286)) | (1L << (SESSION - 286)) | (1L << (VALUE - 286)) | (1L << (IDENTIFIER_ - 286)) | (1L << (STRING_ - 286)))) != 0)) {
				{
				setState(290);
				((SqlDeleteContext)_localctx).alias = sqlAlias();
				}
			}

			setState(294);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(293);
				((SqlDeleteContext)_localctx).where = sqlWhere();
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

	public static class SqlSelectWithCteContext extends ParserRuleContext {
		public SqlDecorators_Context decorators;
		public SqlCteStatements_Context withCtes;
		public SqlSelectContext select;
		public SqlCteStatements_Context sqlCteStatements_() {
			return getRuleContext(SqlCteStatements_Context.class,0);
		}
		public SqlSelectContext sqlSelect() {
			return getRuleContext(SqlSelectContext.class,0);
		}
		public SqlDecorators_Context sqlDecorators_() {
			return getRuleContext(SqlDecorators_Context.class,0);
		}
		public SqlSelectWithCteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sqlSelectWithCte; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).enterSqlSelectWithCte(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).exitSqlSelectWithCte(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EqlVisitor ) return ((EqlVisitor<? extends T>)visitor).visitSqlSelectWithCte(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SqlSelectWithCteContext sqlSelectWithCte() throws RecognitionException {
		SqlSelectWithCteContext _localctx = new SqlSelectWithCteContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_sqlSelectWithCte);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT_) {
				{
				setState(296);
				((SqlSelectWithCteContext)_localctx).decorators = sqlDecorators_();
				}
			}

			setState(299);
			((SqlSelectWithCteContext)_localctx).withCtes = sqlCteStatements_();
			setState(300);
			((SqlSelectWithCteContext)_localctx).select = sqlSelect(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SqlCteStatementContext extends ParserRuleContext {
		public SqlIdentifier_Context name;
		public SqlSelectContext statement;
		public TerminalNode AS() { return getToken(EqlParser.AS, 0); }
		public TerminalNode LP_() { return getToken(EqlParser.LP_, 0); }
		public TerminalNode RP_() { return getToken(EqlParser.RP_, 0); }
		public SqlIdentifier_Context sqlIdentifier_() {
			return getRuleContext(SqlIdentifier_Context.class,0);
		}
		public SqlSelectContext sqlSelect() {
			return getRuleContext(SqlSelectContext.class,0);
		}
		public SqlCteStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sqlCteStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).enterSqlCteStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).exitSqlCteStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EqlVisitor ) return ((EqlVisitor<? extends T>)visitor).visitSqlCteStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SqlCteStatementContext sqlCteStatement() throws RecognitionException {
		SqlCteStatementContext _localctx = new SqlCteStatementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_sqlCteStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
			((SqlCteStatementContext)_localctx).name = sqlIdentifier_();
			setState(303);
			match(AS);
			setState(304);
			match(LP_);
			setState(305);
			((SqlCteStatementContext)_localctx).statement = sqlSelect(0);
			setState(306);
			match(RP_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SqlCteStatements_Context extends ParserRuleContext {
		public SqlCteStatementContext e;
		public TerminalNode WITH() { return getToken(EqlParser.WITH, 0); }
		public List<SqlCteStatementContext> sqlCteStatement() {
			return getRuleContexts(SqlCteStatementContext.class);
		}
		public SqlCteStatementContext sqlCteStatement(int i) {
			return getRuleContext(SqlCteStatementContext.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(EqlParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(EqlParser.COMMA_, i);
		}
		public SqlCteStatements_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sqlCteStatements_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).enterSqlCteStatements_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).exitSqlCteStatements_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EqlVisitor ) return ((EqlVisitor<? extends T>)visitor).visitSqlCteStatements_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SqlCteStatements_Context sqlCteStatements_() throws RecognitionException {
		SqlCteStatements_Context _localctx = new SqlCteStatements_Context(_ctx, getState());
		enterRule(_localctx, 32, RULE_sqlCteStatements_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
			match(WITH);
			setState(309);
			((SqlCteStatements_Context)_localctx).e = sqlCteStatement();
			setState(314);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(310);
				match(COMMA_);
				setState(311);
				((SqlCteStatements_Context)_localctx).e = sqlCteStatement();
				}
				}
				setState(316);
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

	public static class SqlSelectContext extends ParserRuleContext {
		public SqlSelectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sqlSelect; }
	 
		public SqlSelectContext() { }
		public void copyFrom(SqlSelectContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SqlUnionSelect_exContext extends SqlSelectContext {
		public SqlSelectContext left;
		public SqlDecorators_Context decorators;
		public UnionType_Context unionType;
		public SqlSelectContext right;
		public List<SqlSelectContext> sqlSelect() {
			return getRuleContexts(SqlSelectContext.class);
		}
		public SqlSelectContext sqlSelect(int i) {
			return getRuleContext(SqlSelectContext.class,i);
		}
		public UnionType_Context unionType_() {
			return getRuleContext(UnionType_Context.class,0);
		}
		public SqlDecorators_Context sqlDecorators_() {
			return getRuleContext(SqlDecorators_Context.class,0);
		}
		public SqlUnionSelect_exContext(SqlSelectContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).enterSqlUnionSelect_ex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).exitSqlUnionSelect_ex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EqlVisitor ) return ((EqlVisitor<? extends T>)visitor).visitSqlUnionSelect_ex(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SqlQuerySelect_exContext extends SqlSelectContext {
		public SqlQuerySelectContext sqlQuerySelect() {
			return getRuleContext(SqlQuerySelectContext.class,0);
		}
		public SqlQuerySelect_exContext(SqlSelectContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).enterSqlQuerySelect_ex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).exitSqlQuerySelect_ex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EqlVisitor ) return ((EqlVisitor<? extends T>)visitor).visitSqlQuerySelect_ex(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SqlSelect_exContext extends SqlSelectContext {
		public TerminalNode LP_() { return getToken(EqlParser.LP_, 0); }
		public SqlSelectContext sqlSelect() {
			return getRuleContext(SqlSelectContext.class,0);
		}
		public TerminalNode RP_() { return getToken(EqlParser.RP_, 0); }
		public SqlSelect_exContext(SqlSelectContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).enterSqlSelect_ex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).exitSqlSelect_ex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EqlVisitor ) return ((EqlVisitor<? extends T>)visitor).visitSqlSelect_ex(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SqlSelectContext sqlSelect() throws RecognitionException {
		return sqlSelect(0);
	}

	private SqlSelectContext sqlSelect(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		SqlSelectContext _localctx = new SqlSelectContext(_ctx, _parentState);
		SqlSelectContext _prevctx = _localctx;
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_sqlSelect, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(323);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AT_:
			case SELECT:
				{
				_localctx = new SqlQuerySelect_exContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(318);
				sqlQuerySelect();
				}
				break;
			case LP_:
				{
				_localctx = new SqlSelect_exContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(319);
				match(LP_);
				setState(320);
				sqlSelect(0);
				setState(321);
				match(RP_);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(334);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new SqlUnionSelect_exContext(new SqlSelectContext(_parentctx, _parentState));
					((SqlUnionSelect_exContext)_localctx).left = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_sqlSelect);
					setState(325);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(327);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AT_) {
						{
						setState(326);
						((SqlUnionSelect_exContext)_localctx).decorators = sqlDecorators_();
						}
					}

					setState(329);
					((SqlUnionSelect_exContext)_localctx).unionType = unionType_();
					setState(330);
					((SqlUnionSelect_exContext)_localctx).right = sqlSelect(2);
					}
					} 
				}
				setState(336);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class UnionType_Context extends ParserRuleContext {
		public TerminalNode UNION() { return getToken(EqlParser.UNION, 0); }
		public TerminalNode ALL() { return getToken(EqlParser.ALL, 0); }
		public UnionType_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unionType_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).enterUnionType_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).exitUnionType_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EqlVisitor ) return ((EqlVisitor<? extends T>)visitor).visitUnionType_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnionType_Context unionType_() throws RecognitionException {
		UnionType_Context _localctx = new UnionType_Context(_ctx, getState());
		enterRule(_localctx, 36, RULE_unionType_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
			match(UNION);
			setState(339);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ALL) {
				{
				setState(338);
				match(ALL);
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

	public static class SqlQuerySelectContext extends ParserRuleContext {
		public SqlDecorators_Context decorators;
		public Distinct_Context distinct;
		public Token selectAll;
		public SqlProjections_Context projections;
		public SqlFromContext from;
		public SqlWhereContext where;
		public SqlGroupByContext groupBy;
		public SqlHavingContext having;
		public SqlOrderByContext orderBy;
		public SqlLimitContext limit;
		public ForUpdate_Context forUpdate;
		public TerminalNode SELECT() { return getToken(EqlParser.SELECT, 0); }
		public TerminalNode ASTERISK_() { return getToken(EqlParser.ASTERISK_, 0); }
		public SqlProjections_Context sqlProjections_() {
			return getRuleContext(SqlProjections_Context.class,0);
		}
		public SqlDecorators_Context sqlDecorators_() {
			return getRuleContext(SqlDecorators_Context.class,0);
		}
		public Distinct_Context distinct_() {
			return getRuleContext(Distinct_Context.class,0);
		}
		public SqlFromContext sqlFrom() {
			return getRuleContext(SqlFromContext.class,0);
		}
		public SqlWhereContext sqlWhere() {
			return getRuleContext(SqlWhereContext.class,0);
		}
		public SqlGroupByContext sqlGroupBy() {
			return getRuleContext(SqlGroupByContext.class,0);
		}
		public SqlHavingContext sqlHaving() {
			return getRuleContext(SqlHavingContext.class,0);
		}
		public SqlOrderByContext sqlOrderBy() {
			return getRuleContext(SqlOrderByContext.class,0);
		}
		public SqlLimitContext sqlLimit() {
			return getRuleContext(SqlLimitContext.class,0);
		}
		public ForUpdate_Context forUpdate_() {
			return getRuleContext(ForUpdate_Context.class,0);
		}
		public SqlQuerySelectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sqlQuerySelect; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).enterSqlQuerySelect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).exitSqlQuerySelect(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EqlVisitor ) return ((EqlVisitor<? extends T>)visitor).visitSqlQuerySelect(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SqlQuerySelectContext sqlQuerySelect() throws RecognitionException {
		SqlQuerySelectContext _localctx = new SqlQuerySelectContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_sqlQuerySelect);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(342);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT_) {
				{
				setState(341);
				((SqlQuerySelectContext)_localctx).decorators = sqlDecorators_();
				}
			}

			setState(344);
			match(SELECT);
			setState(346);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DISTINCT) {
				{
				setState(345);
				((SqlQuerySelectContext)_localctx).distinct = distinct_();
				}
			}

			setState(350);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASTERISK_:
				{
				setState(348);
				((SqlQuerySelectContext)_localctx).selectAll = match(ASTERISK_);
				}
				break;
			case NOT_:
			case TILDE_:
			case PLUS_:
			case MINUS_:
			case LP_:
			case QUESTION_:
			case POSITION:
			case CASE:
			case CAST:
			case IF:
			case NOT:
			case NULL:
			case TRUE:
			case FALSE:
			case EXISTS:
			case INTERVAL:
			case DATE:
			case TIME:
			case TIMESTAMP:
			case LOCALTIME:
			case LOCALTIMESTAMP:
			case YEAR:
			case MONTH:
			case MAX:
			case MIN:
			case SUM:
			case COUNT:
			case AVG:
			case NAME:
			case TYPE:
			case CATALOG_NAME:
			case CHARACTER_SET_CATALOG:
			case CHARACTER_SET_NAME:
			case CHARACTER_SET_SCHEMA:
			case CLASS_ORIGIN:
			case COBOL:
			case COLLATION_CATALOG:
			case COLLATION_NAME:
			case COLLATION_SCHEMA:
			case COLUMN_NAME:
			case COMMAND_FUNCTION:
			case COMMITTED:
			case CONDITION_NUMBER:
			case CONNECTION_NAME:
			case CONSTRAINT_CATALOG:
			case CONSTRAINT_NAME:
			case CONSTRAINT_SCHEMA:
			case CURSOR_NAME:
			case DATA:
			case DATETIME_INTERVAL_CODE:
			case DATETIME_INTERVAL_PRECISION:
			case DYNAMIC_FUNCTION:
			case FORTRAN:
			case LENGTH:
			case MESSAGE_LENGTH:
			case MESSAGE_OCTET_LENGTH:
			case MESSAGE_TEXT:
			case MORE92:
			case MUMPS:
			case NULLABLE:
			case NUMBER:
			case PASCAL:
			case PLI:
			case REPEATABLE:
			case RETURNED_LENGTH:
			case RETURNED_OCTET_LENGTH:
			case RETURNED_SQLSTATE:
			case ROW_COUNT:
			case SCALE:
			case SCHEMA_NAME:
			case SERIALIZABLE:
			case SERVER_NAME:
			case SUBCLASS_ORIGIN:
			case TABLE_NAME:
			case UNCOMMITTED:
			case UNNAMED:
			case COALESCE:
			case CURRENT_TIMESTAMP:
			case LEVEL:
			case SESSION:
			case VALUE:
			case IDENTIFIER_:
			case STRING_:
			case NUMBER_:
			case HEX_DIGIT_:
			case BIT_NUM_:
				{
				setState(349);
				((SqlQuerySelectContext)_localctx).projections = sqlProjections_();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(353);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(352);
				((SqlQuerySelectContext)_localctx).from = sqlFrom();
				}
				break;
			}
			setState(356);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(355);
				((SqlQuerySelectContext)_localctx).where = sqlWhere();
				}
				break;
			}
			setState(359);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(358);
				((SqlQuerySelectContext)_localctx).groupBy = sqlGroupBy();
				}
				break;
			}
			setState(362);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(361);
				((SqlQuerySelectContext)_localctx).having = sqlHaving();
				}
				break;
			}
			setState(365);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(364);
				((SqlQuerySelectContext)_localctx).orderBy = sqlOrderBy();
				}
				break;
			}
			setState(368);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(367);
				((SqlQuerySelectContext)_localctx).limit = sqlLimit();
				}
				break;
			}
			setState(371);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				setState(370);
				((SqlQuerySelectContext)_localctx).forUpdate = forUpdate_();
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

	public static class SqlProjections_Context extends ParserRuleContext {
		public SqlProjectionContext e;
		public List<SqlProjectionContext> sqlProjection() {
			return getRuleContexts(SqlProjectionContext.class);
		}
		public SqlProjectionContext sqlProjection(int i) {
			return getRuleContext(SqlProjectionContext.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(EqlParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(EqlParser.COMMA_, i);
		}
		public SqlProjections_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sqlProjections_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).enterSqlProjections_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).exitSqlProjections_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EqlVisitor ) return ((EqlVisitor<? extends T>)visitor).visitSqlProjections_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SqlProjections_Context sqlProjections_() throws RecognitionException {
		SqlProjections_Context _localctx = new SqlProjections_Context(_ctx, getState());
		enterRule(_localctx, 40, RULE_sqlProjections_);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(373);
			((SqlProjections_Context)_localctx).e = sqlProjection();
			setState(378);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(374);
					match(COMMA_);
					setState(375);
					((SqlProjections_Context)_localctx).e = sqlProjection();
					}
					} 
				}
				setState(380);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
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

	public static class SqlProjectionContext extends ParserRuleContext {
		public SqlExprProjectionContext sqlExprProjection() {
			return getRuleContext(SqlExprProjectionContext.class,0);
		}
		public SqlAllProjectionContext sqlAllProjection() {
			return getRuleContext(SqlAllProjectionContext.class,0);
		}
		public SqlProjectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sqlProjection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).enterSqlProjection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).exitSqlProjection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EqlVisitor ) return ((EqlVisitor<? extends T>)visitor).visitSqlProjection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SqlProjectionContext sqlProjection() throws RecognitionException {
		SqlProjectionContext _localctx = new SqlProjectionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_sqlProjection);
		try {
			setState(383);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(381);
				sqlExprProjection();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(382);
				sqlAllProjection();
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

	public static class SqlExprProjectionContext extends ParserRuleContext {
		public SqlExprContext expr;
		public SqlAliasContext alias;
		public SqlDecorators_Context decorators;
		public SqlExprContext sqlExpr() {
			return getRuleContext(SqlExprContext.class,0);
		}
		public TerminalNode AS() { return getToken(EqlParser.AS, 0); }
		public SqlAliasContext sqlAlias() {
			return getRuleContext(SqlAliasContext.class,0);
		}
		public SqlDecorators_Context sqlDecorators_() {
			return getRuleContext(SqlDecorators_Context.class,0);
		}
		public SqlExprProjectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sqlExprProjection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).enterSqlExprProjection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).exitSqlExprProjection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EqlVisitor ) return ((EqlVisitor<? extends T>)visitor).visitSqlExprProjection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SqlExprProjectionContext sqlExprProjection() throws RecognitionException {
		SqlExprProjectionContext _localctx = new SqlExprProjectionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_sqlExprProjection);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(385);
			((SqlExprProjectionContext)_localctx).expr = sqlExpr(0);
			setState(387);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				{
				setState(386);
				match(AS);
				}
				break;
			}
			setState(390);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				setState(389);
				((SqlExprProjectionContext)_localctx).alias = sqlAlias();
				}
				break;
			}
			setState(393);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				{
				setState(392);
				((SqlExprProjectionContext)_localctx).decorators = sqlDecorators_();
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

	public static class SqlAllProjectionContext extends ParserRuleContext {
		public SqlQualifiedNameContext owner;
		public TerminalNode DOT_ASTERISK_() { return getToken(EqlParser.DOT_ASTERISK_, 0); }
		public SqlQualifiedNameContext sqlQualifiedName() {
			return getRuleContext(SqlQualifiedNameContext.class,0);
		}
		public SqlAllProjectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sqlAllProjection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).enterSqlAllProjection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).exitSqlAllProjection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EqlVisitor ) return ((EqlVisitor<? extends T>)visitor).visitSqlAllProjection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SqlAllProjectionContext sqlAllProjection() throws RecognitionException {
		SqlAllProjectionContext _localctx = new SqlAllProjectionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_sqlAllProjection);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(395);
			((SqlAllProjectionContext)_localctx).owner = sqlQualifiedName();
			setState(396);
			match(DOT_ASTERISK_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SqlAliasContext extends ParserRuleContext {
		public SqlAlias_Context alias;
		public SqlAlias_Context sqlAlias_() {
			return getRuleContext(SqlAlias_Context.class,0);
		}
		public SqlAliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sqlAlias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).enterSqlAlias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).exitSqlAlias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EqlVisitor ) return ((EqlVisitor<? extends T>)visitor).visitSqlAlias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SqlAliasContext sqlAlias() throws RecognitionException {
		SqlAliasContext _localctx = new SqlAliasContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_sqlAlias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(398);
			((SqlAliasContext)_localctx).alias = sqlAlias_();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SqlAlias_Context extends ParserRuleContext {
		public SqlIdentifier_Context sqlIdentifier_() {
			return getRuleContext(SqlIdentifier_Context.class,0);
		}
		public TerminalNode STRING_() { return getToken(EqlParser.STRING_, 0); }
		public SqlAlias_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sqlAlias_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).enterSqlAlias_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).exitSqlAlias_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EqlVisitor ) return ((EqlVisitor<? extends T>)visitor).visitSqlAlias_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SqlAlias_Context sqlAlias_() throws RecognitionException {
		SqlAlias_Context _localctx = new SqlAlias_Context(_ctx, getState());
		enterRule(_localctx, 50, RULE_sqlAlias_);
		try {
			setState(402);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case POSITION:
			case YEAR:
			case MONTH:
			case COUNT:
			case NAME:
			case TYPE:
			case CATALOG_NAME:
			case CHARACTER_SET_CATALOG:
			case CHARACTER_SET_NAME:
			case CHARACTER_SET_SCHEMA:
			case CLASS_ORIGIN:
			case COBOL:
			case COLLATION_CATALOG:
			case COLLATION_NAME:
			case COLLATION_SCHEMA:
			case COLUMN_NAME:
			case COMMAND_FUNCTION:
			case COMMITTED:
			case CONDITION_NUMBER:
			case CONNECTION_NAME:
			case CONSTRAINT_CATALOG:
			case CONSTRAINT_NAME:
			case CONSTRAINT_SCHEMA:
			case CURSOR_NAME:
			case DATA:
			case DATETIME_INTERVAL_CODE:
			case DATETIME_INTERVAL_PRECISION:
			case DYNAMIC_FUNCTION:
			case FORTRAN:
			case LENGTH:
			case MESSAGE_LENGTH:
			case MESSAGE_OCTET_LENGTH:
			case MESSAGE_TEXT:
			case MORE92:
			case MUMPS:
			case NULLABLE:
			case NUMBER:
			case PASCAL:
			case PLI:
			case REPEATABLE:
			case RETURNED_LENGTH:
			case RETURNED_OCTET_LENGTH:
			case RETURNED_SQLSTATE:
			case ROW_COUNT:
			case SCALE:
			case SCHEMA_NAME:
			case SERIALIZABLE:
			case SERVER_NAME:
			case SUBCLASS_ORIGIN:
			case TABLE_NAME:
			case UNCOMMITTED:
			case UNNAMED:
			case COALESCE:
			case LEVEL:
			case SESSION:
			case VALUE:
			case IDENTIFIER_:
				enterOuterAlt(_localctx, 1);
				{
				setState(400);
				sqlIdentifier_();
				}
				break;
			case STRING_:
				enterOuterAlt(_localctx, 2);
				{
				setState(401);
				match(STRING_);
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

	public static class SqlFromContext extends ParserRuleContext {
		public SqlDecorators_Context decorators;
		public TableSources_Context tableSources;
		public TerminalNode FROM() { return getToken(EqlParser.FROM, 0); }
		public TableSources_Context tableSources_() {
			return getRuleContext(TableSources_Context.class,0);
		}
		public SqlDecorators_Context sqlDecorators_() {
			return getRuleContext(SqlDecorators_Context.class,0);
		}
		public SqlFromContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sqlFrom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).enterSqlFrom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).exitSqlFrom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EqlVisitor ) return ((EqlVisitor<? extends T>)visitor).visitSqlFrom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SqlFromContext sqlFrom() throws RecognitionException {
		SqlFromContext _localctx = new SqlFromContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_sqlFrom);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(404);
			match(FROM);
			setState(406);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT_) {
				{
				setState(405);
				((SqlFromContext)_localctx).decorators = sqlDecorators_();
				}
			}

			setState(408);
			((SqlFromContext)_localctx).tableSources = tableSources_();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableSources_Context extends ParserRuleContext {
		public SqlTableSourceContext e;
		public List<SqlTableSourceContext> sqlTableSource() {
			return getRuleContexts(SqlTableSourceContext.class);
		}
		public SqlTableSourceContext sqlTableSource(int i) {
			return getRuleContext(SqlTableSourceContext.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(EqlParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(EqlParser.COMMA_, i);
		}
		public TableSources_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableSources_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).enterTableSources_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).exitTableSources_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EqlVisitor ) return ((EqlVisitor<? extends T>)visitor).visitTableSources_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableSources_Context tableSources_() throws RecognitionException {
		TableSources_Context _localctx = new TableSources_Context(_ctx, getState());
		enterRule(_localctx, 54, RULE_tableSources_);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(410);
			((TableSources_Context)_localctx).e = sqlTableSource(0);
			setState(415);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(411);
					match(COMMA_);
					setState(412);
					((TableSources_Context)_localctx).e = sqlTableSource(0);
					}
					} 
				}
				setState(417);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
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

	public static class SqlTableSourceContext extends ParserRuleContext {
		public SqlTableSourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sqlTableSource; }
	 
		public SqlTableSourceContext() { }
		public void copyFrom(SqlTableSourceContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SqlJoinTableSourceContext extends SqlTableSourceContext {
		public SqlTableSourceContext left;
		public JoinType_Context joinType;
		public SqlTableSource_joinRightContext right;
		public SqlExprContext condition;
		public SqlTableSourceContext sqlTableSource() {
			return getRuleContext(SqlTableSourceContext.class,0);
		}
		public JoinType_Context joinType_() {
			return getRuleContext(JoinType_Context.class,0);
		}
		public SqlTableSource_joinRightContext sqlTableSource_joinRight() {
			return getRuleContext(SqlTableSource_joinRightContext.class,0);
		}
		public TerminalNode ON() { return getToken(EqlParser.ON, 0); }
		public SqlExprContext sqlExpr() {
			return getRuleContext(SqlExprContext.class,0);
		}
		public SqlJoinTableSourceContext(SqlTableSourceContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).enterSqlJoinTableSource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).exitSqlJoinTableSource(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EqlVisitor ) return ((EqlVisitor<? extends T>)visitor).visitSqlJoinTableSource(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SqlSingleTableSource_exContext extends SqlTableSourceContext {
		public SqlSingleTableSourceContext sqlSingleTableSource() {
			return getRuleContext(SqlSingleTableSourceContext.class,0);
		}
		public SqlSingleTableSource_exContext(SqlTableSourceContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).enterSqlSingleTableSource_ex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).exitSqlSingleTableSource_ex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EqlVisitor ) return ((EqlVisitor<? extends T>)visitor).visitSqlSingleTableSource_ex(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SqlSubqueryTableSource_exContext extends SqlTableSourceContext {
		public SqlSubqueryTableSourceContext sqlSubqueryTableSource() {
			return getRuleContext(SqlSubqueryTableSourceContext.class,0);
		}
		public SqlSubqueryTableSource_exContext(SqlTableSourceContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).enterSqlSubqueryTableSource_ex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).exitSqlSubqueryTableSource_ex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EqlVisitor ) return ((EqlVisitor<? extends T>)visitor).visitSqlSubqueryTableSource_ex(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SqlTableSourceContext sqlTableSource() throws RecognitionException {
		return sqlTableSource(0);
	}

	private SqlTableSourceContext sqlTableSource(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		SqlTableSourceContext _localctx = new SqlTableSourceContext(_ctx, _parentState);
		SqlTableSourceContext _prevctx = _localctx;
		int _startState = 56;
		enterRecursionRule(_localctx, 56, RULE_sqlTableSource, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(421);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case POSITION:
			case YEAR:
			case MONTH:
			case COUNT:
			case NAME:
			case TYPE:
			case CATALOG_NAME:
			case CHARACTER_SET_CATALOG:
			case CHARACTER_SET_NAME:
			case CHARACTER_SET_SCHEMA:
			case CLASS_ORIGIN:
			case COBOL:
			case COLLATION_CATALOG:
			case COLLATION_NAME:
			case COLLATION_SCHEMA:
			case COLUMN_NAME:
			case COMMAND_FUNCTION:
			case COMMITTED:
			case CONDITION_NUMBER:
			case CONNECTION_NAME:
			case CONSTRAINT_CATALOG:
			case CONSTRAINT_NAME:
			case CONSTRAINT_SCHEMA:
			case CURSOR_NAME:
			case DATA:
			case DATETIME_INTERVAL_CODE:
			case DATETIME_INTERVAL_PRECISION:
			case DYNAMIC_FUNCTION:
			case FORTRAN:
			case LENGTH:
			case MESSAGE_LENGTH:
			case MESSAGE_OCTET_LENGTH:
			case MESSAGE_TEXT:
			case MORE92:
			case MUMPS:
			case NULLABLE:
			case NUMBER:
			case PASCAL:
			case PLI:
			case REPEATABLE:
			case RETURNED_LENGTH:
			case RETURNED_OCTET_LENGTH:
			case RETURNED_SQLSTATE:
			case ROW_COUNT:
			case SCALE:
			case SCHEMA_NAME:
			case SERIALIZABLE:
			case SERVER_NAME:
			case SUBCLASS_ORIGIN:
			case TABLE_NAME:
			case UNCOMMITTED:
			case UNNAMED:
			case COALESCE:
			case LEVEL:
			case SESSION:
			case VALUE:
			case IDENTIFIER_:
				{
				_localctx = new SqlSingleTableSource_exContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(419);
				sqlSingleTableSource();
				}
				break;
			case LP_:
			case LATERAL:
				{
				_localctx = new SqlSubqueryTableSource_exContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(420);
				sqlSubqueryTableSource();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(432);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new SqlJoinTableSourceContext(new SqlTableSourceContext(_parentctx, _parentState));
					((SqlJoinTableSourceContext)_localctx).left = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_sqlTableSource);
					setState(423);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(424);
					((SqlJoinTableSourceContext)_localctx).joinType = joinType_();
					setState(425);
					((SqlJoinTableSourceContext)_localctx).right = sqlTableSource_joinRight();
					setState(428);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
					case 1:
						{
						setState(426);
						match(ON);
						setState(427);
						((SqlJoinTableSourceContext)_localctx).condition = sqlExpr(0);
						}
						break;
					}
					}
					} 
				}
				setState(434);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class SqlSingleTableSourceContext extends ParserRuleContext {
		public SqlTableNameContext tableName;
		public SqlAliasContext alias;
		public SqlDecorators_Context decorators;
		public SqlTableNameContext sqlTableName() {
			return getRuleContext(SqlTableNameContext.class,0);
		}
		public TerminalNode AS() { return getToken(EqlParser.AS, 0); }
		public SqlAliasContext sqlAlias() {
			return getRuleContext(SqlAliasContext.class,0);
		}
		public SqlDecorators_Context sqlDecorators_() {
			return getRuleContext(SqlDecorators_Context.class,0);
		}
		public SqlSingleTableSourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sqlSingleTableSource; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).enterSqlSingleTableSource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).exitSqlSingleTableSource(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EqlVisitor ) return ((EqlVisitor<? extends T>)visitor).visitSqlSingleTableSource(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SqlSingleTableSourceContext sqlSingleTableSource() throws RecognitionException {
		SqlSingleTableSourceContext _localctx = new SqlSingleTableSourceContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_sqlSingleTableSource);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(435);
			((SqlSingleTableSourceContext)_localctx).tableName = sqlTableName();
			setState(437);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				{
				setState(436);
				match(AS);
				}
				break;
			}
			setState(440);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				{
				setState(439);
				((SqlSingleTableSourceContext)_localctx).alias = sqlAlias();
				}
				break;
			}
			setState(443);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				{
				setState(442);
				((SqlSingleTableSourceContext)_localctx).decorators = sqlDecorators_();
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

	public static class SqlSubqueryTableSourceContext extends ParserRuleContext {
		public Token lateral;
		public SqlSelectContext query;
		public SqlAliasContext alias;
		public TerminalNode LP_() { return getToken(EqlParser.LP_, 0); }
		public TerminalNode RP_() { return getToken(EqlParser.RP_, 0); }
		public SqlSelectContext sqlSelect() {
			return getRuleContext(SqlSelectContext.class,0);
		}
		public SqlAliasContext sqlAlias() {
			return getRuleContext(SqlAliasContext.class,0);
		}
		public TerminalNode AS() { return getToken(EqlParser.AS, 0); }
		public TerminalNode LATERAL() { return getToken(EqlParser.LATERAL, 0); }
		public SqlSubqueryTableSourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sqlSubqueryTableSource; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).enterSqlSubqueryTableSource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).exitSqlSubqueryTableSource(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EqlVisitor ) return ((EqlVisitor<? extends T>)visitor).visitSqlSubqueryTableSource(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SqlSubqueryTableSourceContext sqlSubqueryTableSource() throws RecognitionException {
		SqlSubqueryTableSourceContext _localctx = new SqlSubqueryTableSourceContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_sqlSubqueryTableSource);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(446);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LATERAL) {
				{
				setState(445);
				((SqlSubqueryTableSourceContext)_localctx).lateral = match(LATERAL);
				}
			}

			setState(448);
			match(LP_);
			setState(449);
			((SqlSubqueryTableSourceContext)_localctx).query = sqlSelect(0);
			setState(450);
			match(RP_);
			setState(452);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(451);
				match(AS);
				}
			}

			setState(454);
			((SqlSubqueryTableSourceContext)_localctx).alias = sqlAlias();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JoinType_Context extends ParserRuleContext {
		public InnerJoin_Context innerJoin_() {
			return getRuleContext(InnerJoin_Context.class,0);
		}
		public LeftJoin_Context leftJoin_() {
			return getRuleContext(LeftJoin_Context.class,0);
		}
		public RightJoin_Context rightJoin_() {
			return getRuleContext(RightJoin_Context.class,0);
		}
		public FullJoin_Context fullJoin_() {
			return getRuleContext(FullJoin_Context.class,0);
		}
		public JoinType_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinType_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).enterJoinType_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).exitJoinType_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EqlVisitor ) return ((EqlVisitor<? extends T>)visitor).visitJoinType_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinType_Context joinType_() throws RecognitionException {
		JoinType_Context _localctx = new JoinType_Context(_ctx, getState());
		enterRule(_localctx, 62, RULE_joinType_);
		try {
			setState(460);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case JOIN:
			case INNER:
				enterOuterAlt(_localctx, 1);
				{
				setState(456);
				innerJoin_();
				}
				break;
			case LEFT:
				enterOuterAlt(_localctx, 2);
				{
				setState(457);
				leftJoin_();
				}
				break;
			case RIGHT:
				enterOuterAlt(_localctx, 3);
				{
				setState(458);
				rightJoin_();
				}
				break;
			case FULL:
				enterOuterAlt(_localctx, 4);
				{
				setState(459);
				fullJoin_();
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

	public static class SqlTableSource_joinRightContext extends ParserRuleContext {
		public SqlSingleTableSourceContext sqlSingleTableSource() {
			return getRuleContext(SqlSingleTableSourceContext.class,0);
		}
		public SqlSubqueryTableSourceContext sqlSubqueryTableSource() {
			return getRuleContext(SqlSubqueryTableSourceContext.class,0);
		}
		public SqlTableSource_joinRightContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sqlTableSource_joinRight; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).enterSqlTableSource_joinRight(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).exitSqlTableSource_joinRight(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EqlVisitor ) return ((EqlVisitor<? extends T>)visitor).visitSqlTableSource_joinRight(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SqlTableSource_joinRightContext sqlTableSource_joinRight() throws RecognitionException {
		SqlTableSource_joinRightContext _localctx = new SqlTableSource_joinRightContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_sqlTableSource_joinRight);
		try {
			setState(464);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case POSITION:
			case YEAR:
			case MONTH:
			case COUNT:
			case NAME:
			case TYPE:
			case CATALOG_NAME:
			case CHARACTER_SET_CATALOG:
			case CHARACTER_SET_NAME:
			case CHARACTER_SET_SCHEMA:
			case CLASS_ORIGIN:
			case COBOL:
			case COLLATION_CATALOG:
			case COLLATION_NAME:
			case COLLATION_SCHEMA:
			case COLUMN_NAME:
			case COMMAND_FUNCTION:
			case COMMITTED:
			case CONDITION_NUMBER:
			case CONNECTION_NAME:
			case CONSTRAINT_CATALOG:
			case CONSTRAINT_NAME:
			case CONSTRAINT_SCHEMA:
			case CURSOR_NAME:
			case DATA:
			case DATETIME_INTERVAL_CODE:
			case DATETIME_INTERVAL_PRECISION:
			case DYNAMIC_FUNCTION:
			case FORTRAN:
			case LENGTH:
			case MESSAGE_LENGTH:
			case MESSAGE_OCTET_LENGTH:
			case MESSAGE_TEXT:
			case MORE92:
			case MUMPS:
			case NULLABLE:
			case NUMBER:
			case PASCAL:
			case PLI:
			case REPEATABLE:
			case RETURNED_LENGTH:
			case RETURNED_OCTET_LENGTH:
			case RETURNED_SQLSTATE:
			case ROW_COUNT:
			case SCALE:
			case SCHEMA_NAME:
			case SERIALIZABLE:
			case SERVER_NAME:
			case SUBCLASS_ORIGIN:
			case TABLE_NAME:
			case UNCOMMITTED:
			case UNNAMED:
			case COALESCE:
			case LEVEL:
			case SESSION:
			case VALUE:
			case IDENTIFIER_:
				enterOuterAlt(_localctx, 1);
				{
				setState(462);
				sqlSingleTableSource();
				}
				break;
			case LP_:
			case LATERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(463);
				sqlSubqueryTableSource();
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

	public static class InnerJoin_Context extends ParserRuleContext {
		public TerminalNode JOIN() { return getToken(EqlParser.JOIN, 0); }
		public TerminalNode INNER() { return getToken(EqlParser.INNER, 0); }
		public InnerJoin_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_innerJoin_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).enterInnerJoin_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).exitInnerJoin_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EqlVisitor ) return ((EqlVisitor<? extends T>)visitor).visitInnerJoin_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InnerJoin_Context innerJoin_() throws RecognitionException {
		InnerJoin_Context _localctx = new InnerJoin_Context(_ctx, getState());
		enterRule(_localctx, 66, RULE_innerJoin_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(467);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INNER) {
				{
				setState(466);
				match(INNER);
				}
			}

			setState(469);
			match(JOIN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FullJoin_Context extends ParserRuleContext {
		public TerminalNode FULL() { return getToken(EqlParser.FULL, 0); }
		public TerminalNode JOIN() { return getToken(EqlParser.JOIN, 0); }
		public FullJoin_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fullJoin_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).enterFullJoin_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).exitFullJoin_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EqlVisitor ) return ((EqlVisitor<? extends T>)visitor).visitFullJoin_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FullJoin_Context fullJoin_() throws RecognitionException {
		FullJoin_Context _localctx = new FullJoin_Context(_ctx, getState());
		enterRule(_localctx, 68, RULE_fullJoin_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(471);
			match(FULL);
			setState(472);
			match(JOIN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LeftJoin_Context extends ParserRuleContext {
		public TerminalNode LEFT() { return getToken(EqlParser.LEFT, 0); }
		public TerminalNode JOIN() { return getToken(EqlParser.JOIN, 0); }
		public TerminalNode OUTER() { return getToken(EqlParser.OUTER, 0); }
		public LeftJoin_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leftJoin_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).enterLeftJoin_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).exitLeftJoin_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EqlVisitor ) return ((EqlVisitor<? extends T>)visitor).visitLeftJoin_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LeftJoin_Context leftJoin_() throws RecognitionException {
		LeftJoin_Context _localctx = new LeftJoin_Context(_ctx, getState());
		enterRule(_localctx, 70, RULE_leftJoin_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(474);
			match(LEFT);
			setState(476);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OUTER) {
				{
				setState(475);
				match(OUTER);
				}
			}

			setState(478);
			match(JOIN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RightJoin_Context extends ParserRuleContext {
		public TerminalNode RIGHT() { return getToken(EqlParser.RIGHT, 0); }
		public TerminalNode JOIN() { return getToken(EqlParser.JOIN, 0); }
		public TerminalNode OUTER() { return getToken(EqlParser.OUTER, 0); }
		public RightJoin_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rightJoin_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).enterRightJoin_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).exitRightJoin_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EqlVisitor ) return ((EqlVisitor<? extends T>)visitor).visitRightJoin_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RightJoin_Context rightJoin_() throws RecognitionException {
		RightJoin_Context _localctx = new RightJoin_Context(_ctx, getState());
		enterRule(_localctx, 72, RULE_rightJoin_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(480);
			match(RIGHT);
			setState(482);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OUTER) {
				{
				setState(481);
				match(OUTER);
				}
			}

			setState(484);
			match(JOIN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SqlWhereContext extends ParserRuleContext {
		public SqlExprContext expr;
		public TerminalNode WHERE() { return getToken(EqlParser.WHERE, 0); }
		public SqlExprContext sqlExpr() {
			return getRuleContext(SqlExprContext.class,0);
		}
		public SqlWhereContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sqlWhere; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).enterSqlWhere(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).exitSqlWhere(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EqlVisitor ) return ((EqlVisitor<? extends T>)visitor).visitSqlWhere(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SqlWhereContext sqlWhere() throws RecognitionException {
		SqlWhereContext _localctx = new SqlWhereContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_sqlWhere);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(486);
			match(WHERE);
			setState(487);
			((SqlWhereContext)_localctx).expr = sqlExpr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SqlGroupByContext extends ParserRuleContext {
		public SqlGroupByItems_Context items;
		public TerminalNode GROUP() { return getToken(EqlParser.GROUP, 0); }
		public TerminalNode BY() { return getToken(EqlParser.BY, 0); }
		public SqlGroupByItems_Context sqlGroupByItems_() {
			return getRuleContext(SqlGroupByItems_Context.class,0);
		}
		public SqlGroupByContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sqlGroupBy; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).enterSqlGroupBy(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).exitSqlGroupBy(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EqlVisitor ) return ((EqlVisitor<? extends T>)visitor).visitSqlGroupBy(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SqlGroupByContext sqlGroupBy() throws RecognitionException {
		SqlGroupByContext _localctx = new SqlGroupByContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_sqlGroupBy);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(489);
			match(GROUP);
			setState(490);
			match(BY);
			setState(491);
			((SqlGroupByContext)_localctx).items = sqlGroupByItems_();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SqlGroupByItems_Context extends ParserRuleContext {
		public SqlGroupByItemContext e;
		public List<SqlGroupByItemContext> sqlGroupByItem() {
			return getRuleContexts(SqlGroupByItemContext.class);
		}
		public SqlGroupByItemContext sqlGroupByItem(int i) {
			return getRuleContext(SqlGroupByItemContext.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(EqlParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(EqlParser.COMMA_, i);
		}
		public SqlGroupByItems_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sqlGroupByItems_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).enterSqlGroupByItems_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).exitSqlGroupByItems_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EqlVisitor ) return ((EqlVisitor<? extends T>)visitor).visitSqlGroupByItems_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SqlGroupByItems_Context sqlGroupByItems_() throws RecognitionException {
		SqlGroupByItems_Context _localctx = new SqlGroupByItems_Context(_ctx, getState());
		enterRule(_localctx, 78, RULE_sqlGroupByItems_);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(493);
			((SqlGroupByItems_Context)_localctx).e = sqlGroupByItem();
			setState(498);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(494);
					match(COMMA_);
					setState(495);
					((SqlGroupByItems_Context)_localctx).e = sqlGroupByItem();
					}
					} 
				}
				setState(500);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
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

	public static class SqlHavingContext extends ParserRuleContext {
		public SqlExprContext expr;
		public TerminalNode HAVING() { return getToken(EqlParser.HAVING, 0); }
		public SqlExprContext sqlExpr() {
			return getRuleContext(SqlExprContext.class,0);
		}
		public SqlHavingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sqlHaving; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).enterSqlHaving(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).exitSqlHaving(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EqlVisitor ) return ((EqlVisitor<? extends T>)visitor).visitSqlHaving(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SqlHavingContext sqlHaving() throws RecognitionException {
		SqlHavingContext _localctx = new SqlHavingContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_sqlHaving);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(501);
			match(HAVING);
			setState(502);
			((SqlHavingContext)_localctx).expr = sqlExpr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SqlLimitContext extends ParserRuleContext {
		public SqlExpr_limitRowCountContext limit;
		public SqlExpr_limitOffsetContext offset;
		public TerminalNode LIMIT() { return getToken(EqlParser.LIMIT, 0); }
		public SqlExpr_limitRowCountContext sqlExpr_limitRowCount() {
			return getRuleContext(SqlExpr_limitRowCountContext.class,0);
		}
		public TerminalNode OFFSET() { return getToken(EqlParser.OFFSET, 0); }
		public SqlExpr_limitOffsetContext sqlExpr_limitOffset() {
			return getRuleContext(SqlExpr_limitOffsetContext.class,0);
		}
		public SqlLimitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sqlLimit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).enterSqlLimit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).exitSqlLimit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EqlVisitor ) return ((EqlVisitor<? extends T>)visitor).visitSqlLimit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SqlLimitContext sqlLimit() throws RecognitionException {
		SqlLimitContext _localctx = new SqlLimitContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_sqlLimit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(504);
			match(LIMIT);
			setState(505);
			((SqlLimitContext)_localctx).limit = sqlExpr_limitRowCount();
			setState(508);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				{
				setState(506);
				match(OFFSET);
				setState(507);
				((SqlLimitContext)_localctx).offset = sqlExpr_limitOffset();
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

	public static class SqlExpr_limitRowCountContext extends ParserRuleContext {
		public SqlNumberLiteralContext sqlNumberLiteral() {
			return getRuleContext(SqlNumberLiteralContext.class,0);
		}
		public SqlParameterMarkerContext sqlParameterMarker() {
			return getRuleContext(SqlParameterMarkerContext.class,0);
		}
		public SqlExpr_limitRowCountContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sqlExpr_limitRowCount; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).enterSqlExpr_limitRowCount(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).exitSqlExpr_limitRowCount(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EqlVisitor ) return ((EqlVisitor<? extends T>)visitor).visitSqlExpr_limitRowCount(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SqlExpr_limitRowCountContext sqlExpr_limitRowCount() throws RecognitionException {
		SqlExpr_limitRowCountContext _localctx = new SqlExpr_limitRowCountContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_sqlExpr_limitRowCount);
		try {
			setState(512);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER_:
				enterOuterAlt(_localctx, 1);
				{
				setState(510);
				sqlNumberLiteral();
				}
				break;
			case QUESTION_:
				enterOuterAlt(_localctx, 2);
				{
				setState(511);
				sqlParameterMarker();
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

	public static class SqlExpr_limitOffsetContext extends ParserRuleContext {
		public SqlNumberLiteralContext sqlNumberLiteral() {
			return getRuleContext(SqlNumberLiteralContext.class,0);
		}
		public SqlParameterMarkerContext sqlParameterMarker() {
			return getRuleContext(SqlParameterMarkerContext.class,0);
		}
		public SqlExpr_limitOffsetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sqlExpr_limitOffset; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).enterSqlExpr_limitOffset(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).exitSqlExpr_limitOffset(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EqlVisitor ) return ((EqlVisitor<? extends T>)visitor).visitSqlExpr_limitOffset(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SqlExpr_limitOffsetContext sqlExpr_limitOffset() throws RecognitionException {
		SqlExpr_limitOffsetContext _localctx = new SqlExpr_limitOffsetContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_sqlExpr_limitOffset);
		try {
			setState(516);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER_:
				enterOuterAlt(_localctx, 1);
				{
				setState(514);
				sqlNumberLiteral();
				}
				break;
			case QUESTION_:
				enterOuterAlt(_localctx, 2);
				{
				setState(515);
				sqlParameterMarker();
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

	public static class SqlSubQueryExprContext extends ParserRuleContext {
		public SqlSelectContext select;
		public TerminalNode LP_() { return getToken(EqlParser.LP_, 0); }
		public TerminalNode RP_() { return getToken(EqlParser.RP_, 0); }
		public SqlSelectContext sqlSelect() {
			return getRuleContext(SqlSelectContext.class,0);
		}
		public SqlSubQueryExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sqlSubQueryExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).enterSqlSubQueryExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).exitSqlSubQueryExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EqlVisitor ) return ((EqlVisitor<? extends T>)visitor).visitSqlSubQueryExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SqlSubQueryExprContext sqlSubQueryExpr() throws RecognitionException {
		SqlSubQueryExprContext _localctx = new SqlSubQueryExprContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_sqlSubQueryExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(518);
			match(LP_);
			setState(519);
			((SqlSubQueryExprContext)_localctx).select = sqlSelect(0);
			setState(520);
			match(RP_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForUpdate_Context extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(EqlParser.FOR, 0); }
		public TerminalNode UPDATE() { return getToken(EqlParser.UPDATE, 0); }
		public ForUpdate_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forUpdate_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).enterForUpdate_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).exitForUpdate_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EqlVisitor ) return ((EqlVisitor<? extends T>)visitor).visitForUpdate_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForUpdate_Context forUpdate_() throws RecognitionException {
		ForUpdate_Context _localctx = new ForUpdate_Context(_ctx, getState());
		enterRule(_localctx, 90, RULE_forUpdate_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(522);
			match(FOR);
			setState(523);
			match(UPDATE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SqlParameterMarkerContext extends ParserRuleContext {
		public TerminalNode QUESTION_() { return getToken(EqlParser.QUESTION_, 0); }
		public SqlParameterMarkerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sqlParameterMarker; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).enterSqlParameterMarker(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).exitSqlParameterMarker(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EqlVisitor ) return ((EqlVisitor<? extends T>)visitor).visitSqlParameterMarker(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SqlParameterMarkerContext sqlParameterMarker() throws RecognitionException {
		SqlParameterMarkerContext _localctx = new SqlParameterMarkerContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_sqlParameterMarker);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(525);
			match(QUESTION_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SqlLiteralContext extends ParserRuleContext {
		public SqlStringLiteralContext sqlStringLiteral() {
			return getRuleContext(SqlStringLiteralContext.class,0);
		}
		public SqlNumberLiteralContext sqlNumberLiteral() {
			return getRuleContext(SqlNumberLiteralContext.class,0);
		}
		public SqlDateTimeLiteralContext sqlDateTimeLiteral() {
			return getRuleContext(SqlDateTimeLiteralContext.class,0);
		}
		public SqlHexadecimalLiteralContext sqlHexadecimalLiteral() {
			return getRuleContext(SqlHexadecimalLiteralContext.class,0);
		}
		public SqlBitValueLiteralContext sqlBitValueLiteral() {
			return getRuleContext(SqlBitValueLiteralContext.class,0);
		}
		public SqlBooleanLiteralContext sqlBooleanLiteral() {
			return getRuleContext(SqlBooleanLiteralContext.class,0);
		}
		public SqlNullLiteralContext sqlNullLiteral() {
			return getRuleContext(SqlNullLiteralContext.class,0);
		}
		public SqlLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sqlLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).enterSqlLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).exitSqlLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EqlVisitor ) return ((EqlVisitor<? extends T>)visitor).visitSqlLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SqlLiteralContext sqlLiteral() throws RecognitionException {
		SqlLiteralContext _localctx = new SqlLiteralContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_sqlLiteral);
		try {
			setState(534);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING_:
				enterOuterAlt(_localctx, 1);
				{
				setState(527);
				sqlStringLiteral();
				}
				break;
			case NUMBER_:
				enterOuterAlt(_localctx, 2);
				{
				setState(528);
				sqlNumberLiteral();
				}
				break;
			case DATE:
			case TIME:
			case TIMESTAMP:
				enterOuterAlt(_localctx, 3);
				{
				setState(529);
				sqlDateTimeLiteral();
				}
				break;
			case HEX_DIGIT_:
				enterOuterAlt(_localctx, 4);
				{
				setState(530);
				sqlHexadecimalLiteral();
				}
				break;
			case BIT_NUM_:
				enterOuterAlt(_localctx, 5);
				{
				setState(531);
				sqlBitValueLiteral();
				}
				break;
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 6);
				{
				setState(532);
				sqlBooleanLiteral();
				}
				break;
			case NULL:
				enterOuterAlt(_localctx, 7);
				{
				setState(533);
				sqlNullLiteral();
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

	public static class SqlStringLiteralContext extends ParserRuleContext {
		public Token value;
		public TerminalNode STRING_() { return getToken(EqlParser.STRING_, 0); }
		public SqlStringLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sqlStringLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).enterSqlStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).exitSqlStringLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EqlVisitor ) return ((EqlVisitor<? extends T>)visitor).visitSqlStringLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SqlStringLiteralContext sqlStringLiteral() throws RecognitionException {
		SqlStringLiteralContext _localctx = new SqlStringLiteralContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_sqlStringLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(536);
			((SqlStringLiteralContext)_localctx).value = match(STRING_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SqlNumberLiteralContext extends ParserRuleContext {
		public Token value;
		public TerminalNode NUMBER_() { return getToken(EqlParser.NUMBER_, 0); }
		public SqlNumberLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sqlNumberLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).enterSqlNumberLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).exitSqlNumberLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EqlVisitor ) return ((EqlVisitor<? extends T>)visitor).visitSqlNumberLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SqlNumberLiteralContext sqlNumberLiteral() throws RecognitionException {
		SqlNumberLiteralContext _localctx = new SqlNumberLiteralContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_sqlNumberLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(538);
			((SqlNumberLiteralContext)_localctx).value = match(NUMBER_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SqlDateTimeLiteralContext extends ParserRuleContext {
		public Token type;
		public Token value;
		public TerminalNode STRING_() { return getToken(EqlParser.STRING_, 0); }
		public TerminalNode DATE() { return getToken(EqlParser.DATE, 0); }
		public TerminalNode TIME() { return getToken(EqlParser.TIME, 0); }
		public TerminalNode TIMESTAMP() { return getToken(EqlParser.TIMESTAMP, 0); }
		public SqlDateTimeLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sqlDateTimeLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).enterSqlDateTimeLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).exitSqlDateTimeLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EqlVisitor ) return ((EqlVisitor<? extends T>)visitor).visitSqlDateTimeLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SqlDateTimeLiteralContext sqlDateTimeLiteral() throws RecognitionException {
		SqlDateTimeLiteralContext _localctx = new SqlDateTimeLiteralContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_sqlDateTimeLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(540);
			((SqlDateTimeLiteralContext)_localctx).type = _input.LT(1);
			_la = _input.LA(1);
			if ( !(((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (DATE - 131)) | (1L << (TIME - 131)) | (1L << (TIMESTAMP - 131)))) != 0)) ) {
				((SqlDateTimeLiteralContext)_localctx).type = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(541);
			((SqlDateTimeLiteralContext)_localctx).value = match(STRING_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SqlHexadecimalLiteralContext extends ParserRuleContext {
		public Token value;
		public TerminalNode HEX_DIGIT_() { return getToken(EqlParser.HEX_DIGIT_, 0); }
		public SqlHexadecimalLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sqlHexadecimalLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).enterSqlHexadecimalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).exitSqlHexadecimalLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EqlVisitor ) return ((EqlVisitor<? extends T>)visitor).visitSqlHexadecimalLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SqlHexadecimalLiteralContext sqlHexadecimalLiteral() throws RecognitionException {
		SqlHexadecimalLiteralContext _localctx = new SqlHexadecimalLiteralContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_sqlHexadecimalLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(543);
			((SqlHexadecimalLiteralContext)_localctx).value = match(HEX_DIGIT_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SqlBitValueLiteralContext extends ParserRuleContext {
		public Token value;
		public TerminalNode BIT_NUM_() { return getToken(EqlParser.BIT_NUM_, 0); }
		public SqlBitValueLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sqlBitValueLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).enterSqlBitValueLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).exitSqlBitValueLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EqlVisitor ) return ((EqlVisitor<? extends T>)visitor).visitSqlBitValueLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SqlBitValueLiteralContext sqlBitValueLiteral() throws RecognitionException {
		SqlBitValueLiteralContext _localctx = new SqlBitValueLiteralContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_sqlBitValueLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(545);
			((SqlBitValueLiteralContext)_localctx).value = match(BIT_NUM_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SqlBooleanLiteralContext extends ParserRuleContext {
		public Token value;
		public TerminalNode TRUE() { return getToken(EqlParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(EqlParser.FALSE, 0); }
		public SqlBooleanLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sqlBooleanLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).enterSqlBooleanLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).exitSqlBooleanLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EqlVisitor ) return ((EqlVisitor<? extends T>)visitor).visitSqlBooleanLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SqlBooleanLiteralContext sqlBooleanLiteral() throws RecognitionException {
		SqlBooleanLiteralContext _localctx = new SqlBooleanLiteralContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_sqlBooleanLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(547);
			((SqlBooleanLiteralContext)_localctx).value = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
				((SqlBooleanLiteralContext)_localctx).value = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	public static class SqlNullLiteralContext extends ParserRuleContext {
		public TerminalNode NULL() { return getToken(EqlParser.NULL, 0); }
		public SqlNullLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sqlNullLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).enterSqlNullLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).exitSqlNullLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EqlVisitor ) return ((EqlVisitor<? extends T>)visitor).visitSqlNullLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SqlNullLiteralContext sqlNullLiteral() throws RecognitionException {
		SqlNullLiteralContext _localctx = new SqlNullLiteralContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_sqlNullLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(549);
			match(NULL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SqlIdentifier_Context extends ParserRuleContext {
		public TerminalNode IDENTIFIER_() { return getToken(EqlParser.IDENTIFIER_, 0); }
		public UnreservedWord_Context unreservedWord_() {
			return getRuleContext(UnreservedWord_Context.class,0);
		}
		public SqlIdentifier_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sqlIdentifier_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).enterSqlIdentifier_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).exitSqlIdentifier_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EqlVisitor ) return ((EqlVisitor<? extends T>)visitor).visitSqlIdentifier_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SqlIdentifier_Context sqlIdentifier_() throws RecognitionException {
		SqlIdentifier_Context _localctx = new SqlIdentifier_Context(_ctx, getState());
		enterRule(_localctx, 110, RULE_sqlIdentifier_);
		try {
			setState(553);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER_:
				enterOuterAlt(_localctx, 1);
				{
				setState(551);
				match(IDENTIFIER_);
				}
				break;
			case POSITION:
			case YEAR:
			case MONTH:
			case COUNT:
			case NAME:
			case TYPE:
			case CATALOG_NAME:
			case CHARACTER_SET_CATALOG:
			case CHARACTER_SET_NAME:
			case CHARACTER_SET_SCHEMA:
			case CLASS_ORIGIN:
			case COBOL:
			case COLLATION_CATALOG:
			case COLLATION_NAME:
			case COLLATION_SCHEMA:
			case COLUMN_NAME:
			case COMMAND_FUNCTION:
			case COMMITTED:
			case CONDITION_NUMBER:
			case CONNECTION_NAME:
			case CONSTRAINT_CATALOG:
			case CONSTRAINT_NAME:
			case CONSTRAINT_SCHEMA:
			case CURSOR_NAME:
			case DATA:
			case DATETIME_INTERVAL_CODE:
			case DATETIME_INTERVAL_PRECISION:
			case DYNAMIC_FUNCTION:
			case FORTRAN:
			case LENGTH:
			case MESSAGE_LENGTH:
			case MESSAGE_OCTET_LENGTH:
			case MESSAGE_TEXT:
			case MORE92:
			case MUMPS:
			case NULLABLE:
			case NUMBER:
			case PASCAL:
			case PLI:
			case REPEATABLE:
			case RETURNED_LENGTH:
			case RETURNED_OCTET_LENGTH:
			case RETURNED_SQLSTATE:
			case ROW_COUNT:
			case SCALE:
			case SCHEMA_NAME:
			case SERIALIZABLE:
			case SERVER_NAME:
			case SUBCLASS_ORIGIN:
			case TABLE_NAME:
			case UNCOMMITTED:
			case UNNAMED:
			case COALESCE:
			case LEVEL:
			case SESSION:
			case VALUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(552);
				unreservedWord_();
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

	public static class UnreservedWord_Context extends ParserRuleContext {
		public TerminalNode CATALOG_NAME() { return getToken(EqlParser.CATALOG_NAME, 0); }
		public TerminalNode CHARACTER_SET_CATALOG() { return getToken(EqlParser.CHARACTER_SET_CATALOG, 0); }
		public TerminalNode CHARACTER_SET_NAME() { return getToken(EqlParser.CHARACTER_SET_NAME, 0); }
		public TerminalNode CHARACTER_SET_SCHEMA() { return getToken(EqlParser.CHARACTER_SET_SCHEMA, 0); }
		public TerminalNode CLASS_ORIGIN() { return getToken(EqlParser.CLASS_ORIGIN, 0); }
		public TerminalNode COBOL() { return getToken(EqlParser.COBOL, 0); }
		public TerminalNode COLLATION_CATALOG() { return getToken(EqlParser.COLLATION_CATALOG, 0); }
		public TerminalNode COLLATION_NAME() { return getToken(EqlParser.COLLATION_NAME, 0); }
		public TerminalNode COLLATION_SCHEMA() { return getToken(EqlParser.COLLATION_SCHEMA, 0); }
		public TerminalNode COLUMN_NAME() { return getToken(EqlParser.COLUMN_NAME, 0); }
		public TerminalNode COMMAND_FUNCTION() { return getToken(EqlParser.COMMAND_FUNCTION, 0); }
		public TerminalNode COMMITTED() { return getToken(EqlParser.COMMITTED, 0); }
		public TerminalNode CONDITION_NUMBER() { return getToken(EqlParser.CONDITION_NUMBER, 0); }
		public TerminalNode CONNECTION_NAME() { return getToken(EqlParser.CONNECTION_NAME, 0); }
		public TerminalNode CONSTRAINT_CATALOG() { return getToken(EqlParser.CONSTRAINT_CATALOG, 0); }
		public TerminalNode CONSTRAINT_NAME() { return getToken(EqlParser.CONSTRAINT_NAME, 0); }
		public TerminalNode CONSTRAINT_SCHEMA() { return getToken(EqlParser.CONSTRAINT_SCHEMA, 0); }
		public TerminalNode CURSOR_NAME() { return getToken(EqlParser.CURSOR_NAME, 0); }
		public TerminalNode DATA() { return getToken(EqlParser.DATA, 0); }
		public TerminalNode DATETIME_INTERVAL_CODE() { return getToken(EqlParser.DATETIME_INTERVAL_CODE, 0); }
		public TerminalNode DATETIME_INTERVAL_PRECISION() { return getToken(EqlParser.DATETIME_INTERVAL_PRECISION, 0); }
		public TerminalNode DYNAMIC_FUNCTION() { return getToken(EqlParser.DYNAMIC_FUNCTION, 0); }
		public TerminalNode FORTRAN() { return getToken(EqlParser.FORTRAN, 0); }
		public TerminalNode LENGTH() { return getToken(EqlParser.LENGTH, 0); }
		public TerminalNode MESSAGE_LENGTH() { return getToken(EqlParser.MESSAGE_LENGTH, 0); }
		public TerminalNode MESSAGE_OCTET_LENGTH() { return getToken(EqlParser.MESSAGE_OCTET_LENGTH, 0); }
		public TerminalNode MESSAGE_TEXT() { return getToken(EqlParser.MESSAGE_TEXT, 0); }
		public TerminalNode MORE92() { return getToken(EqlParser.MORE92, 0); }
		public TerminalNode MUMPS() { return getToken(EqlParser.MUMPS, 0); }
		public TerminalNode NAME() { return getToken(EqlParser.NAME, 0); }
		public TerminalNode NULLABLE() { return getToken(EqlParser.NULLABLE, 0); }
		public TerminalNode NUMBER() { return getToken(EqlParser.NUMBER, 0); }
		public TerminalNode PASCAL() { return getToken(EqlParser.PASCAL, 0); }
		public TerminalNode PLI() { return getToken(EqlParser.PLI, 0); }
		public TerminalNode REPEATABLE() { return getToken(EqlParser.REPEATABLE, 0); }
		public TerminalNode RETURNED_LENGTH() { return getToken(EqlParser.RETURNED_LENGTH, 0); }
		public TerminalNode RETURNED_OCTET_LENGTH() { return getToken(EqlParser.RETURNED_OCTET_LENGTH, 0); }
		public TerminalNode RETURNED_SQLSTATE() { return getToken(EqlParser.RETURNED_SQLSTATE, 0); }
		public TerminalNode ROW_COUNT() { return getToken(EqlParser.ROW_COUNT, 0); }
		public TerminalNode SCALE() { return getToken(EqlParser.SCALE, 0); }
		public TerminalNode SCHEMA_NAME() { return getToken(EqlParser.SCHEMA_NAME, 0); }
		public TerminalNode SERIALIZABLE() { return getToken(EqlParser.SERIALIZABLE, 0); }
		public TerminalNode SERVER_NAME() { return getToken(EqlParser.SERVER_NAME, 0); }
		public TerminalNode SUBCLASS_ORIGIN() { return getToken(EqlParser.SUBCLASS_ORIGIN, 0); }
		public TerminalNode TABLE_NAME() { return getToken(EqlParser.TABLE_NAME, 0); }
		public TerminalNode TYPE() { return getToken(EqlParser.TYPE, 0); }
		public TerminalNode UNCOMMITTED() { return getToken(EqlParser.UNCOMMITTED, 0); }
		public TerminalNode UNNAMED() { return getToken(EqlParser.UNNAMED, 0); }
		public TerminalNode VALUE() { return getToken(EqlParser.VALUE, 0); }
		public TerminalNode POSITION() { return getToken(EqlParser.POSITION, 0); }
		public TerminalNode LEVEL() { return getToken(EqlParser.LEVEL, 0); }
		public TerminalNode SESSION() { return getToken(EqlParser.SESSION, 0); }
		public TerminalNode COUNT() { return getToken(EqlParser.COUNT, 0); }
		public TerminalNode COALESCE() { return getToken(EqlParser.COALESCE, 0); }
		public TerminalNode YEAR() { return getToken(EqlParser.YEAR, 0); }
		public TerminalNode MONTH() { return getToken(EqlParser.MONTH, 0); }
		public UnreservedWord_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unreservedWord_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).enterUnreservedWord_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).exitUnreservedWord_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EqlVisitor ) return ((EqlVisitor<? extends T>)visitor).visitUnreservedWord_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnreservedWord_Context unreservedWord_() throws RecognitionException {
		UnreservedWord_Context _localctx = new UnreservedWord_Context(_ctx, getState());
		enterRule(_localctx, 112, RULE_unreservedWord_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(555);
			_la = _input.LA(1);
			if ( !(_la==POSITION || ((((_la - 136)) & ~0x3f) == 0 && ((1L << (_la - 136)) & ((1L << (YEAR - 136)) | (1L << (MONTH - 136)) | (1L << (COUNT - 136)) | (1L << (NAME - 136)) | (1L << (TYPE - 136)) | (1L << (CATALOG_NAME - 136)) | (1L << (CHARACTER_SET_CATALOG - 136)) | (1L << (CHARACTER_SET_NAME - 136)) | (1L << (CHARACTER_SET_SCHEMA - 136)) | (1L << (CLASS_ORIGIN - 136)) | (1L << (COBOL - 136)) | (1L << (COLLATION_CATALOG - 136)) | (1L << (COLLATION_NAME - 136)) | (1L << (COLLATION_SCHEMA - 136)) | (1L << (COLUMN_NAME - 136)) | (1L << (COMMAND_FUNCTION - 136)) | (1L << (COMMITTED - 136)) | (1L << (CONDITION_NUMBER - 136)) | (1L << (CONNECTION_NAME - 136)) | (1L << (CONSTRAINT_CATALOG - 136)) | (1L << (CONSTRAINT_NAME - 136)) | (1L << (CONSTRAINT_SCHEMA - 136)) | (1L << (CURSOR_NAME - 136)) | (1L << (DATA - 136)) | (1L << (DATETIME_INTERVAL_CODE - 136)) | (1L << (DATETIME_INTERVAL_PRECISION - 136)) | (1L << (DYNAMIC_FUNCTION - 136)) | (1L << (FORTRAN - 136)) | (1L << (LENGTH - 136)))) != 0) || ((((_la - 200)) & ~0x3f) == 0 && ((1L << (_la - 200)) & ((1L << (MESSAGE_LENGTH - 200)) | (1L << (MESSAGE_OCTET_LENGTH - 200)) | (1L << (MESSAGE_TEXT - 200)) | (1L << (MORE92 - 200)) | (1L << (MUMPS - 200)) | (1L << (NULLABLE - 200)) | (1L << (NUMBER - 200)) | (1L << (PASCAL - 200)) | (1L << (PLI - 200)) | (1L << (REPEATABLE - 200)) | (1L << (RETURNED_LENGTH - 200)) | (1L << (RETURNED_OCTET_LENGTH - 200)) | (1L << (RETURNED_SQLSTATE - 200)) | (1L << (ROW_COUNT - 200)) | (1L << (SCALE - 200)) | (1L << (SCHEMA_NAME - 200)) | (1L << (SERIALIZABLE - 200)) | (1L << (SERVER_NAME - 200)) | (1L << (SUBCLASS_ORIGIN - 200)) | (1L << (TABLE_NAME - 200)) | (1L << (UNCOMMITTED - 200)) | (1L << (UNNAMED - 200)) | (1L << (COALESCE - 200)))) != 0) || ((((_la - 286)) & ~0x3f) == 0 && ((1L << (_la - 286)) & ((1L << (LEVEL - 286)) | (1L << (SESSION - 286)) | (1L << (VALUE - 286)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	public static class SqlTableNameContext extends ParserRuleContext {
		public SqlQualifiedNameContext owner;
		public SqlIdentifier_Context name;
		public SqlIdentifier_Context sqlIdentifier_() {
			return getRuleContext(SqlIdentifier_Context.class,0);
		}
		public TerminalNode DOT_() { return getToken(EqlParser.DOT_, 0); }
		public SqlQualifiedNameContext sqlQualifiedName() {
			return getRuleContext(SqlQualifiedNameContext.class,0);
		}
		public SqlTableNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sqlTableName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).enterSqlTableName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).exitSqlTableName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EqlVisitor ) return ((EqlVisitor<? extends T>)visitor).visitSqlTableName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SqlTableNameContext sqlTableName() throws RecognitionException {
		SqlTableNameContext _localctx = new SqlTableNameContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_sqlTableName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(560);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				{
				setState(557);
				((SqlTableNameContext)_localctx).owner = sqlQualifiedName();
				setState(558);
				match(DOT_);
				}
				break;
			}
			setState(562);
			((SqlTableNameContext)_localctx).name = sqlIdentifier_();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SqlColumnNameContext extends ParserRuleContext {
		public SqlQualifiedNameContext owner;
		public SqlIdentifier_Context name;
		public SqlIdentifier_Context sqlIdentifier_() {
			return getRuleContext(SqlIdentifier_Context.class,0);
		}
		public TerminalNode DOT_() { return getToken(EqlParser.DOT_, 0); }
		public SqlQualifiedNameContext sqlQualifiedName() {
			return getRuleContext(SqlQualifiedNameContext.class,0);
		}
		public SqlColumnNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sqlColumnName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).enterSqlColumnName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).exitSqlColumnName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EqlVisitor ) return ((EqlVisitor<? extends T>)visitor).visitSqlColumnName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SqlColumnNameContext sqlColumnName() throws RecognitionException {
		SqlColumnNameContext _localctx = new SqlColumnNameContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_sqlColumnName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(567);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				{
				setState(564);
				((SqlColumnNameContext)_localctx).owner = sqlQualifiedName();
				setState(565);
				match(DOT_);
				}
				break;
			}
			setState(569);
			((SqlColumnNameContext)_localctx).name = sqlIdentifier_();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SqlQualifiedNameContext extends ParserRuleContext {
		public SqlIdentifier_Context name;
		public SqlQualifiedNameContext next;
		public SqlIdentifier_Context sqlIdentifier_() {
			return getRuleContext(SqlIdentifier_Context.class,0);
		}
		public TerminalNode DOT_() { return getToken(EqlParser.DOT_, 0); }
		public SqlQualifiedNameContext sqlQualifiedName() {
			return getRuleContext(SqlQualifiedNameContext.class,0);
		}
		public SqlQualifiedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sqlQualifiedName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).enterSqlQualifiedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).exitSqlQualifiedName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EqlVisitor ) return ((EqlVisitor<? extends T>)visitor).visitSqlQualifiedName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SqlQualifiedNameContext sqlQualifiedName() throws RecognitionException {
		SqlQualifiedNameContext _localctx = new SqlQualifiedNameContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_sqlQualifiedName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(571);
			((SqlQualifiedNameContext)_localctx).name = sqlIdentifier_();
			setState(574);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				{
				setState(572);
				match(DOT_);
				setState(573);
				((SqlQualifiedNameContext)_localctx).next = sqlQualifiedName();
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

	public static class ColumnNames_Context extends ParserRuleContext {
		public SqlColumnNameContext e;
		public List<SqlColumnNameContext> sqlColumnName() {
			return getRuleContexts(SqlColumnNameContext.class);
		}
		public SqlColumnNameContext sqlColumnName(int i) {
			return getRuleContext(SqlColumnNameContext.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(EqlParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(EqlParser.COMMA_, i);
		}
		public ColumnNames_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnNames_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).enterColumnNames_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).exitColumnNames_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EqlVisitor ) return ((EqlVisitor<? extends T>)visitor).visitColumnNames_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnNames_Context columnNames_() throws RecognitionException {
		ColumnNames_Context _localctx = new ColumnNames_Context(_ctx, getState());
		enterRule(_localctx, 120, RULE_columnNames_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(576);
			((ColumnNames_Context)_localctx).e = sqlColumnName();
			setState(581);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(577);
				match(COMMA_);
				setState(578);
				((ColumnNames_Context)_localctx).e = sqlColumnName();
				}
				}
				setState(583);
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

	public static class SqlExprContext extends ParserRuleContext {
		public SqlExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sqlExpr; }
	 
		public SqlExprContext() { }
		public void copyFrom(SqlExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SqlExpr_primary2Context extends SqlExprContext {
		public SqlExpr_primaryContext sqlExpr_primary() {
			return getRuleContext(SqlExpr_primaryContext.class,0);
		}
		public SqlExpr_primary2Context(SqlExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).enterSqlExpr_primary2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).exitSqlExpr_primary2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EqlVisitor ) return ((EqlVisitor<? extends T>)visitor).visitSqlExpr_primary2(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SqlOrExprContext extends SqlExprContext {
		public SqlExprContext left;
		public SqlExprContext right;
		public TerminalNode OR() { return getToken(EqlParser.OR, 0); }
		public List<SqlExprContext> sqlExpr() {
			return getRuleContexts(SqlExprContext.class);
		}
		public SqlExprContext sqlExpr(int i) {
			return getRuleContext(SqlExprContext.class,i);
		}
		public SqlOrExprContext(SqlExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).enterSqlOrExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).exitSqlOrExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EqlVisitor ) return ((EqlVisitor<? extends T>)visitor).visitSqlOrExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SqlNotExprContext extends SqlExprContext {
		public SqlExprContext expr;
		public TerminalNode NOT() { return getToken(EqlParser.NOT, 0); }
		public TerminalNode NOT_() { return getToken(EqlParser.NOT_, 0); }
		public SqlExprContext sqlExpr() {
			return getRuleContext(SqlExprContext.class,0);
		}
		public SqlNotExprContext(SqlExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).enterSqlNotExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).exitSqlNotExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EqlVisitor ) return ((EqlVisitor<? extends T>)visitor).visitSqlNotExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SqlAndExprContext extends SqlExprContext {
		public SqlExprContext left;
		public SqlExprContext right;
		public List<SqlExprContext> sqlExpr() {
			return getRuleContexts(SqlExprContext.class);
		}
		public SqlExprContext sqlExpr(int i) {
			return getRuleContext(SqlExprContext.class,i);
		}
		public TerminalNode AND() { return getToken(EqlParser.AND, 0); }
		public TerminalNode AND_() { return getToken(EqlParser.AND_, 0); }
		public SqlAndExprContext(SqlExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).enterSqlAndExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).exitSqlAndExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EqlVisitor ) return ((EqlVisitor<? extends T>)visitor).visitSqlAndExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SqlExprContext sqlExpr() throws RecognitionException {
		return sqlExpr(0);
	}

	private SqlExprContext sqlExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		SqlExprContext _localctx = new SqlExprContext(_ctx, _parentState);
		SqlExprContext _prevctx = _localctx;
		int _startState = 122;
		enterRecursionRule(_localctx, 122, RULE_sqlExpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(588);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				{
				_localctx = new SqlNotExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(585);
				_la = _input.LA(1);
				if ( !(_la==NOT_ || _la==NOT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(586);
				((SqlNotExprContext)_localctx).expr = sqlExpr(2);
				}
				break;
			case 2:
				{
				_localctx = new SqlExpr_primary2Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(587);
				sqlExpr_primary(0);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(598);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(596);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
					case 1:
						{
						_localctx = new SqlAndExprContext(new SqlExprContext(_parentctx, _parentState));
						((SqlAndExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_sqlExpr);
						setState(590);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(591);
						_la = _input.LA(1);
						if ( !(_la==AND_ || _la==AND) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(592);
						((SqlAndExprContext)_localctx).right = sqlExpr(5);
						}
						break;
					case 2:
						{
						_localctx = new SqlOrExprContext(new SqlExprContext(_parentctx, _parentState));
						((SqlOrExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_sqlExpr);
						setState(593);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(594);
						match(OR);
						setState(595);
						((SqlOrExprContext)_localctx).right = sqlExpr(4);
						}
						break;
					}
					} 
				}
				setState(600);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class SqlExpr_primaryContext extends ParserRuleContext {
		public SqlExpr_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sqlExpr_primary; }
	 
		public SqlExpr_primaryContext() { }
		public void copyFrom(SqlExpr_primaryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SqlBinaryExpr_compareContext extends SqlExpr_primaryContext {
		public SqlExpr_primaryContext left;
		public ComparisonOperator_Context operator;
		public SqlExpr_predicateContext right;
		public SqlExpr_primaryContext sqlExpr_primary() {
			return getRuleContext(SqlExpr_primaryContext.class,0);
		}
		public ComparisonOperator_Context comparisonOperator_() {
			return getRuleContext(ComparisonOperator_Context.class,0);
		}
		public SqlExpr_predicateContext sqlExpr_predicate() {
			return getRuleContext(SqlExpr_predicateContext.class,0);
		}
		public SqlBinaryExpr_compareContext(SqlExpr_primaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).enterSqlBinaryExpr_compare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).exitSqlBinaryExpr_compare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EqlVisitor ) return ((EqlVisitor<? extends T>)visitor).visitSqlBinaryExpr_compare(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SqlExpr_predicate2Context extends SqlExpr_primaryContext {
		public SqlExpr_predicateContext sqlExpr_predicate() {
			return getRuleContext(SqlExpr_predicateContext.class,0);
		}
		public SqlExpr_predicate2Context(SqlExpr_primaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).enterSqlExpr_predicate2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).exitSqlExpr_predicate2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EqlVisitor ) return ((EqlVisitor<? extends T>)visitor).visitSqlExpr_predicate2(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SqlIsNullExprContext extends SqlExpr_primaryContext {
		public SqlExpr_primaryContext expr;
		public Token not;
		public TerminalNode IS() { return getToken(EqlParser.IS, 0); }
		public TerminalNode NULL() { return getToken(EqlParser.NULL, 0); }
		public SqlExpr_primaryContext sqlExpr_primary() {
			return getRuleContext(SqlExpr_primaryContext.class,0);
		}
		public TerminalNode NOT() { return getToken(EqlParser.NOT, 0); }
		public SqlIsNullExprContext(SqlExpr_primaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).enterSqlIsNullExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).exitSqlIsNullExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EqlVisitor ) return ((EqlVisitor<? extends T>)visitor).visitSqlIsNullExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SqlCompareWithQueryExprContext extends SqlExpr_primaryContext {
		public SqlExpr_primaryContext expr;
		public ComparisonOperator_Context operator;
		public Token compareRange;
		public SqlSubQueryExprContext query;
		public SqlExpr_primaryContext sqlExpr_primary() {
			return getRuleContext(SqlExpr_primaryContext.class,0);
		}
		public ComparisonOperator_Context comparisonOperator_() {
			return getRuleContext(ComparisonOperator_Context.class,0);
		}
		public SqlSubQueryExprContext sqlSubQueryExpr() {
			return getRuleContext(SqlSubQueryExprContext.class,0);
		}
		public TerminalNode ALL() { return getToken(EqlParser.ALL, 0); }
		public TerminalNode ANY() { return getToken(EqlParser.ANY, 0); }
		public SqlCompareWithQueryExprContext(SqlExpr_primaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).enterSqlCompareWithQueryExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).exitSqlCompareWithQueryExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EqlVisitor ) return ((EqlVisitor<? extends T>)visitor).visitSqlCompareWithQueryExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SqlExpr_primaryContext sqlExpr_primary() throws RecognitionException {
		return sqlExpr_primary(0);
	}

	private SqlExpr_primaryContext sqlExpr_primary(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		SqlExpr_primaryContext _localctx = new SqlExpr_primaryContext(_ctx, _parentState);
		SqlExpr_primaryContext _prevctx = _localctx;
		int _startState = 124;
		enterRecursionRule(_localctx, 124, RULE_sqlExpr_primary, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new SqlExpr_predicate2Context(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(602);
			sqlExpr_predicate();
			}
			_ctx.stop = _input.LT(-1);
			setState(621);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(619);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
					case 1:
						{
						_localctx = new SqlIsNullExprContext(new SqlExpr_primaryContext(_parentctx, _parentState));
						((SqlIsNullExprContext)_localctx).expr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_sqlExpr_primary);
						setState(604);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(605);
						match(IS);
						setState(607);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NOT) {
							{
							setState(606);
							((SqlIsNullExprContext)_localctx).not = match(NOT);
							}
						}

						setState(609);
						match(NULL);
						}
						break;
					case 2:
						{
						_localctx = new SqlBinaryExpr_compareContext(new SqlExpr_primaryContext(_parentctx, _parentState));
						((SqlBinaryExpr_compareContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_sqlExpr_primary);
						setState(610);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(611);
						((SqlBinaryExpr_compareContext)_localctx).operator = comparisonOperator_();
						setState(612);
						((SqlBinaryExpr_compareContext)_localctx).right = sqlExpr_predicate();
						}
						break;
					case 3:
						{
						_localctx = new SqlCompareWithQueryExprContext(new SqlExpr_primaryContext(_parentctx, _parentState));
						((SqlCompareWithQueryExprContext)_localctx).expr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_sqlExpr_primary);
						setState(614);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(615);
						((SqlCompareWithQueryExprContext)_localctx).operator = comparisonOperator_();
						setState(616);
						((SqlCompareWithQueryExprContext)_localctx).compareRange = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ALL || _la==ANY) ) {
							((SqlCompareWithQueryExprContext)_localctx).compareRange = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(617);
						((SqlCompareWithQueryExprContext)_localctx).query = sqlSubQueryExpr();
						}
						break;
					}
					} 
				}
				setState(623);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ComparisonOperator_Context extends ParserRuleContext {
		public TerminalNode EQ_() { return getToken(EqlParser.EQ_, 0); }
		public TerminalNode GTE_() { return getToken(EqlParser.GTE_, 0); }
		public TerminalNode GT_() { return getToken(EqlParser.GT_, 0); }
		public TerminalNode LTE_() { return getToken(EqlParser.LTE_, 0); }
		public TerminalNode LT_() { return getToken(EqlParser.LT_, 0); }
		public TerminalNode NEQ_() { return getToken(EqlParser.NEQ_, 0); }
		public ComparisonOperator_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonOperator_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).enterComparisonOperator_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).exitComparisonOperator_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EqlVisitor ) return ((EqlVisitor<? extends T>)visitor).visitComparisonOperator_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonOperator_Context comparisonOperator_() throws RecognitionException {
		ComparisonOperator_Context _localctx = new ComparisonOperator_Context(_ctx, getState());
		enterRule(_localctx, 126, RULE_comparisonOperator_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(624);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQ_) | (1L << NEQ_) | (1L << GT_) | (1L << GTE_) | (1L << LT_) | (1L << LTE_))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	public static class SqlExpr_predicateContext extends ParserRuleContext {
		public SqlExpr_predicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sqlExpr_predicate; }
	 
		public SqlExpr_predicateContext() { }
		public void copyFrom(SqlExpr_predicateContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SqlExpr_bit2Context extends SqlExpr_predicateContext {
		public SqlExpr_bitContext sqlExpr_bit() {
			return getRuleContext(SqlExpr_bitContext.class,0);
		}
		public SqlExpr_bit2Context(SqlExpr_predicateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).enterSqlExpr_bit2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).exitSqlExpr_bit2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EqlVisitor ) return ((EqlVisitor<? extends T>)visitor).visitSqlExpr_bit2(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SqlInQueryExprContext extends SqlExpr_predicateContext {
		public SqlExpr_bitContext expr;
		public Token not;
		public SqlSubQueryExprContext query;
		public TerminalNode IN() { return getToken(EqlParser.IN, 0); }
		public SqlExpr_bitContext sqlExpr_bit() {
			return getRuleContext(SqlExpr_bitContext.class,0);
		}
		public SqlSubQueryExprContext sqlSubQueryExpr() {
			return getRuleContext(SqlSubQueryExprContext.class,0);
		}
		public TerminalNode NOT() { return getToken(EqlParser.NOT, 0); }
		public SqlInQueryExprContext(SqlExpr_predicateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).enterSqlInQueryExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).exitSqlInQueryExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EqlVisitor ) return ((EqlVisitor<? extends T>)visitor).visitSqlInQueryExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SqlInValuesExprContext extends SqlExpr_predicateContext {
		public SqlExpr_bitContext expr;
		public Token not;
		public SqlInValues_Context values;
		public TerminalNode IN() { return getToken(EqlParser.IN, 0); }
		public TerminalNode LP_() { return getToken(EqlParser.LP_, 0); }
		public TerminalNode RP_() { return getToken(EqlParser.RP_, 0); }
		public SqlExpr_bitContext sqlExpr_bit() {
			return getRuleContext(SqlExpr_bitContext.class,0);
		}
		public SqlInValues_Context sqlInValues_() {
			return getRuleContext(SqlInValues_Context.class,0);
		}
		public TerminalNode NOT() { return getToken(EqlParser.NOT, 0); }
		public SqlInValuesExprContext(SqlExpr_predicateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).enterSqlInValuesExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).exitSqlInValuesExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EqlVisitor ) return ((EqlVisitor<? extends T>)visitor).visitSqlInValuesExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SqlBetweenExprContext extends SqlExpr_predicateContext {
		public SqlExpr_bitContext test;
		public Token not;
		public SqlExpr_bitContext begin;
		public SqlExpr_predicateContext end;
		public TerminalNode BETWEEN() { return getToken(EqlParser.BETWEEN, 0); }
		public TerminalNode AND() { return getToken(EqlParser.AND, 0); }
		public List<SqlExpr_bitContext> sqlExpr_bit() {
			return getRuleContexts(SqlExpr_bitContext.class);
		}
		public SqlExpr_bitContext sqlExpr_bit(int i) {
			return getRuleContext(SqlExpr_bitContext.class,i);
		}
		public SqlExpr_predicateContext sqlExpr_predicate() {
			return getRuleContext(SqlExpr_predicateContext.class,0);
		}
		public TerminalNode NOT() { return getToken(EqlParser.NOT, 0); }
		public SqlBetweenExprContext(SqlExpr_predicateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).enterSqlBetweenExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).exitSqlBetweenExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EqlVisitor ) return ((EqlVisitor<? extends T>)visitor).visitSqlBetweenExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SqlLikeExprContext extends SqlExpr_predicateContext {
		public SqlExpr_bitContext expr;
		public Token not;
		public SqlExpr_simpleContext value;
		public SqlExpr_simpleContext escape;
		public Token ignoreCase;
		public TerminalNode LIKE() { return getToken(EqlParser.LIKE, 0); }
		public SqlExpr_bitContext sqlExpr_bit() {
			return getRuleContext(SqlExpr_bitContext.class,0);
		}
		public List<SqlExpr_simpleContext> sqlExpr_simple() {
			return getRuleContexts(SqlExpr_simpleContext.class);
		}
		public SqlExpr_simpleContext sqlExpr_simple(int i) {
			return getRuleContext(SqlExpr_simpleContext.class,i);
		}
		public TerminalNode ESCAPE() { return getToken(EqlParser.ESCAPE, 0); }
		public TerminalNode NOT() { return getToken(EqlParser.NOT, 0); }
		public TerminalNode ILIKE() { return getToken(EqlParser.ILIKE, 0); }
		public SqlLikeExprContext(SqlExpr_predicateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).enterSqlLikeExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).exitSqlLikeExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EqlVisitor ) return ((EqlVisitor<? extends T>)visitor).visitSqlLikeExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SqlExpr_predicateContext sqlExpr_predicate() throws RecognitionException {
		SqlExpr_predicateContext _localctx = new SqlExpr_predicateContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_sqlExpr_predicate);
		int _la;
		try {
			setState(672);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
			case 1:
				_localctx = new SqlInQueryExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(626);
				((SqlInQueryExprContext)_localctx).expr = sqlExpr_bit(0);
				setState(628);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(627);
					((SqlInQueryExprContext)_localctx).not = match(NOT);
					}
				}

				setState(630);
				match(IN);
				setState(631);
				((SqlInQueryExprContext)_localctx).query = sqlSubQueryExpr();
				}
				break;
			case 2:
				_localctx = new SqlInValuesExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(633);
				((SqlInValuesExprContext)_localctx).expr = sqlExpr_bit(0);
				setState(635);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(634);
					((SqlInValuesExprContext)_localctx).not = match(NOT);
					}
				}

				setState(637);
				match(IN);
				setState(638);
				match(LP_);
				setState(639);
				((SqlInValuesExprContext)_localctx).values = sqlInValues_();
				setState(640);
				match(RP_);
				}
				break;
			case 3:
				_localctx = new SqlBetweenExprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(642);
				((SqlBetweenExprContext)_localctx).test = sqlExpr_bit(0);
				setState(644);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(643);
					((SqlBetweenExprContext)_localctx).not = match(NOT);
					}
				}

				setState(646);
				match(BETWEEN);
				setState(647);
				((SqlBetweenExprContext)_localctx).begin = sqlExpr_bit(0);
				setState(648);
				match(AND);
				setState(649);
				((SqlBetweenExprContext)_localctx).end = sqlExpr_predicate();
				}
				break;
			case 4:
				_localctx = new SqlLikeExprContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(651);
				((SqlLikeExprContext)_localctx).expr = sqlExpr_bit(0);
				setState(653);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(652);
					((SqlLikeExprContext)_localctx).not = match(NOT);
					}
				}

				setState(655);
				match(LIKE);
				setState(656);
				((SqlLikeExprContext)_localctx).value = sqlExpr_simple();
				setState(659);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
				case 1:
					{
					setState(657);
					match(ESCAPE);
					setState(658);
					((SqlLikeExprContext)_localctx).escape = sqlExpr_simple();
					}
					break;
				}
				}
				break;
			case 5:
				_localctx = new SqlLikeExprContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(661);
				((SqlLikeExprContext)_localctx).expr = sqlExpr_bit(0);
				setState(663);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(662);
					((SqlLikeExprContext)_localctx).not = match(NOT);
					}
				}

				setState(665);
				((SqlLikeExprContext)_localctx).ignoreCase = match(ILIKE);
				setState(666);
				((SqlLikeExprContext)_localctx).value = sqlExpr_simple();
				setState(669);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
				case 1:
					{
					setState(667);
					match(ESCAPE);
					setState(668);
					((SqlLikeExprContext)_localctx).escape = sqlExpr_simple();
					}
					break;
				}
				}
				break;
			case 6:
				_localctx = new SqlExpr_bit2Context(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(671);
				sqlExpr_bit(0);
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

	public static class SqlInValues_Context extends ParserRuleContext {
		public SqlExprContext e;
		public List<SqlExprContext> sqlExpr() {
			return getRuleContexts(SqlExprContext.class);
		}
		public SqlExprContext sqlExpr(int i) {
			return getRuleContext(SqlExprContext.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(EqlParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(EqlParser.COMMA_, i);
		}
		public SqlInValues_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sqlInValues_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).enterSqlInValues_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).exitSqlInValues_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EqlVisitor ) return ((EqlVisitor<? extends T>)visitor).visitSqlInValues_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SqlInValues_Context sqlInValues_() throws RecognitionException {
		SqlInValues_Context _localctx = new SqlInValues_Context(_ctx, getState());
		enterRule(_localctx, 130, RULE_sqlInValues_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(674);
			((SqlInValues_Context)_localctx).e = sqlExpr(0);
			setState(679);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(675);
				match(COMMA_);
				setState(676);
				((SqlInValues_Context)_localctx).e = sqlExpr(0);
				}
				}
				setState(681);
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

	public static class SqlExpr_bitContext extends ParserRuleContext {
		public SqlExpr_bitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sqlExpr_bit; }
	 
		public SqlExpr_bitContext() { }
		public void copyFrom(SqlExpr_bitContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SqlBinaryExprContext extends SqlExpr_bitContext {
		public SqlExpr_bitContext left;
		public Token operator;
		public SqlExpr_bitContext right;
		public List<SqlExpr_bitContext> sqlExpr_bit() {
			return getRuleContexts(SqlExpr_bitContext.class);
		}
		public SqlExpr_bitContext sqlExpr_bit(int i) {
			return getRuleContext(SqlExpr_bitContext.class,i);
		}
		public TerminalNode VERTICAL_BAR_() { return getToken(EqlParser.VERTICAL_BAR_, 0); }
		public TerminalNode AMPERSAND_() { return getToken(EqlParser.AMPERSAND_, 0); }
		public TerminalNode SIGNED_LEFT_SHIFT_() { return getToken(EqlParser.SIGNED_LEFT_SHIFT_, 0); }
		public TerminalNode SIGNED_RIGHT_SHIFT_() { return getToken(EqlParser.SIGNED_RIGHT_SHIFT_, 0); }
		public TerminalNode PLUS_() { return getToken(EqlParser.PLUS_, 0); }
		public TerminalNode MINUS_() { return getToken(EqlParser.MINUS_, 0); }
		public TerminalNode ASTERISK_() { return getToken(EqlParser.ASTERISK_, 0); }
		public TerminalNode SLASH_() { return getToken(EqlParser.SLASH_, 0); }
		public TerminalNode MOD_() { return getToken(EqlParser.MOD_, 0); }
		public TerminalNode CARET_() { return getToken(EqlParser.CARET_, 0); }
		public SqlBinaryExprContext(SqlExpr_bitContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).enterSqlBinaryExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).exitSqlBinaryExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EqlVisitor ) return ((EqlVisitor<? extends T>)visitor).visitSqlBinaryExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SqlExpr_simple2Context extends SqlExpr_bitContext {
		public SqlExpr_simpleContext sqlExpr_simple() {
			return getRuleContext(SqlExpr_simpleContext.class,0);
		}
		public SqlExpr_simple2Context(SqlExpr_bitContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).enterSqlExpr_simple2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).exitSqlExpr_simple2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EqlVisitor ) return ((EqlVisitor<? extends T>)visitor).visitSqlExpr_simple2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SqlExpr_bitContext sqlExpr_bit() throws RecognitionException {
		return sqlExpr_bit(0);
	}

	private SqlExpr_bitContext sqlExpr_bit(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		SqlExpr_bitContext _localctx = new SqlExpr_bitContext(_ctx, _parentState);
		SqlExpr_bitContext _prevctx = _localctx;
		int _startState = 132;
		enterRecursionRule(_localctx, 132, RULE_sqlExpr_bit, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new SqlExpr_simple2Context(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(683);
			sqlExpr_simple();
			}
			_ctx.stop = _input.LT(-1);
			setState(717);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,80,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(715);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
					case 1:
						{
						_localctx = new SqlBinaryExprContext(new SqlExpr_bitContext(_parentctx, _parentState));
						((SqlBinaryExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_sqlExpr_bit);
						setState(685);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(686);
						((SqlBinaryExprContext)_localctx).operator = match(VERTICAL_BAR_);
						setState(687);
						((SqlBinaryExprContext)_localctx).right = sqlExpr_bit(12);
						}
						break;
					case 2:
						{
						_localctx = new SqlBinaryExprContext(new SqlExpr_bitContext(_parentctx, _parentState));
						((SqlBinaryExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_sqlExpr_bit);
						setState(688);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(689);
						((SqlBinaryExprContext)_localctx).operator = match(AMPERSAND_);
						setState(690);
						((SqlBinaryExprContext)_localctx).right = sqlExpr_bit(11);
						}
						break;
					case 3:
						{
						_localctx = new SqlBinaryExprContext(new SqlExpr_bitContext(_parentctx, _parentState));
						((SqlBinaryExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_sqlExpr_bit);
						setState(691);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(692);
						((SqlBinaryExprContext)_localctx).operator = match(SIGNED_LEFT_SHIFT_);
						setState(693);
						((SqlBinaryExprContext)_localctx).right = sqlExpr_bit(10);
						}
						break;
					case 4:
						{
						_localctx = new SqlBinaryExprContext(new SqlExpr_bitContext(_parentctx, _parentState));
						((SqlBinaryExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_sqlExpr_bit);
						setState(694);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(695);
						((SqlBinaryExprContext)_localctx).operator = match(SIGNED_RIGHT_SHIFT_);
						setState(696);
						((SqlBinaryExprContext)_localctx).right = sqlExpr_bit(9);
						}
						break;
					case 5:
						{
						_localctx = new SqlBinaryExprContext(new SqlExpr_bitContext(_parentctx, _parentState));
						((SqlBinaryExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_sqlExpr_bit);
						setState(697);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(698);
						((SqlBinaryExprContext)_localctx).operator = match(PLUS_);
						setState(699);
						((SqlBinaryExprContext)_localctx).right = sqlExpr_bit(8);
						}
						break;
					case 6:
						{
						_localctx = new SqlBinaryExprContext(new SqlExpr_bitContext(_parentctx, _parentState));
						((SqlBinaryExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_sqlExpr_bit);
						setState(700);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(701);
						((SqlBinaryExprContext)_localctx).operator = match(MINUS_);
						setState(702);
						((SqlBinaryExprContext)_localctx).right = sqlExpr_bit(7);
						}
						break;
					case 7:
						{
						_localctx = new SqlBinaryExprContext(new SqlExpr_bitContext(_parentctx, _parentState));
						((SqlBinaryExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_sqlExpr_bit);
						setState(703);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(704);
						((SqlBinaryExprContext)_localctx).operator = match(ASTERISK_);
						setState(705);
						((SqlBinaryExprContext)_localctx).right = sqlExpr_bit(6);
						}
						break;
					case 8:
						{
						_localctx = new SqlBinaryExprContext(new SqlExpr_bitContext(_parentctx, _parentState));
						((SqlBinaryExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_sqlExpr_bit);
						setState(706);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(707);
						((SqlBinaryExprContext)_localctx).operator = match(SLASH_);
						setState(708);
						((SqlBinaryExprContext)_localctx).right = sqlExpr_bit(5);
						}
						break;
					case 9:
						{
						_localctx = new SqlBinaryExprContext(new SqlExpr_bitContext(_parentctx, _parentState));
						((SqlBinaryExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_sqlExpr_bit);
						setState(709);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(710);
						((SqlBinaryExprContext)_localctx).operator = match(MOD_);
						setState(711);
						((SqlBinaryExprContext)_localctx).right = sqlExpr_bit(4);
						}
						break;
					case 10:
						{
						_localctx = new SqlBinaryExprContext(new SqlExpr_bitContext(_parentctx, _parentState));
						((SqlBinaryExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_sqlExpr_bit);
						setState(712);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(713);
						((SqlBinaryExprContext)_localctx).operator = match(CARET_);
						setState(714);
						((SqlBinaryExprContext)_localctx).right = sqlExpr_bit(3);
						}
						break;
					}
					} 
				}
				setState(719);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,80,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class SqlExpr_simpleContext extends ParserRuleContext {
		public SqlExpr_functionCallContext sqlExpr_functionCall() {
			return getRuleContext(SqlExpr_functionCallContext.class,0);
		}
		public SqlParameterMarkerContext sqlParameterMarker() {
			return getRuleContext(SqlParameterMarkerContext.class,0);
		}
		public SqlLiteralContext sqlLiteral() {
			return getRuleContext(SqlLiteralContext.class,0);
		}
		public SqlColumnNameContext sqlColumnName() {
			return getRuleContext(SqlColumnNameContext.class,0);
		}
		public SqlSubQueryExprContext sqlSubQueryExpr() {
			return getRuleContext(SqlSubQueryExprContext.class,0);
		}
		public SqlUnaryExprContext sqlUnaryExpr() {
			return getRuleContext(SqlUnaryExprContext.class,0);
		}
		public SqlExpr_braceContext sqlExpr_brace() {
			return getRuleContext(SqlExpr_braceContext.class,0);
		}
		public SqlMultiValueExprContext sqlMultiValueExpr() {
			return getRuleContext(SqlMultiValueExprContext.class,0);
		}
		public SqlExistsExprContext sqlExistsExpr() {
			return getRuleContext(SqlExistsExprContext.class,0);
		}
		public SqlCaseExprContext sqlCaseExpr() {
			return getRuleContext(SqlCaseExprContext.class,0);
		}
		public SqlIntervalExprContext sqlIntervalExpr() {
			return getRuleContext(SqlIntervalExprContext.class,0);
		}
		public SqlExpr_simpleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sqlExpr_simple; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).enterSqlExpr_simple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).exitSqlExpr_simple(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EqlVisitor ) return ((EqlVisitor<? extends T>)visitor).visitSqlExpr_simple(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SqlExpr_simpleContext sqlExpr_simple() throws RecognitionException {
		SqlExpr_simpleContext _localctx = new SqlExpr_simpleContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_sqlExpr_simple);
		try {
			setState(731);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(720);
				sqlExpr_functionCall();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(721);
				sqlParameterMarker();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(722);
				sqlLiteral();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(723);
				sqlColumnName();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(724);
				sqlSubQueryExpr();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(725);
				sqlUnaryExpr();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(726);
				sqlExpr_brace();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(727);
				sqlMultiValueExpr();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(728);
				sqlExistsExpr();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(729);
				sqlCaseExpr();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(730);
				sqlIntervalExpr();
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

	public static class SqlUnaryExprContext extends ParserRuleContext {
		public Token operator;
		public SqlExpr_simpleContext expr;
		public SqlExpr_simpleContext sqlExpr_simple() {
			return getRuleContext(SqlExpr_simpleContext.class,0);
		}
		public TerminalNode PLUS_() { return getToken(EqlParser.PLUS_, 0); }
		public TerminalNode MINUS_() { return getToken(EqlParser.MINUS_, 0); }
		public TerminalNode TILDE_() { return getToken(EqlParser.TILDE_, 0); }
		public TerminalNode NOT_() { return getToken(EqlParser.NOT_, 0); }
		public SqlUnaryExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sqlUnaryExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).enterSqlUnaryExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).exitSqlUnaryExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EqlVisitor ) return ((EqlVisitor<? extends T>)visitor).visitSqlUnaryExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SqlUnaryExprContext sqlUnaryExpr() throws RecognitionException {
		SqlUnaryExprContext _localctx = new SqlUnaryExprContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_sqlUnaryExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(733);
			((SqlUnaryExprContext)_localctx).operator = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOT_) | (1L << TILDE_) | (1L << PLUS_) | (1L << MINUS_))) != 0)) ) {
				((SqlUnaryExprContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(734);
			((SqlUnaryExprContext)_localctx).expr = sqlExpr_simple();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SqlExpr_braceContext extends ParserRuleContext {
		public TerminalNode LP_() { return getToken(EqlParser.LP_, 0); }
		public SqlExprContext sqlExpr() {
			return getRuleContext(SqlExprContext.class,0);
		}
		public TerminalNode RP_() { return getToken(EqlParser.RP_, 0); }
		public SqlExpr_braceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sqlExpr_brace; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).enterSqlExpr_brace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).exitSqlExpr_brace(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EqlVisitor ) return ((EqlVisitor<? extends T>)visitor).visitSqlExpr_brace(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SqlExpr_braceContext sqlExpr_brace() throws RecognitionException {
		SqlExpr_braceContext _localctx = new SqlExpr_braceContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_sqlExpr_brace);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(736);
			match(LP_);
			setState(737);
			sqlExpr(0);
			setState(738);
			match(RP_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SqlMultiValueExprContext extends ParserRuleContext {
		public SqlInValues_Context values;
		public TerminalNode LP_() { return getToken(EqlParser.LP_, 0); }
		public TerminalNode RP_() { return getToken(EqlParser.RP_, 0); }
		public SqlInValues_Context sqlInValues_() {
			return getRuleContext(SqlInValues_Context.class,0);
		}
		public SqlMultiValueExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sqlMultiValueExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).enterSqlMultiValueExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).exitSqlMultiValueExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EqlVisitor ) return ((EqlVisitor<? extends T>)visitor).visitSqlMultiValueExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SqlMultiValueExprContext sqlMultiValueExpr() throws RecognitionException {
		SqlMultiValueExprContext _localctx = new SqlMultiValueExprContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_sqlMultiValueExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(740);
			match(LP_);
			setState(741);
			((SqlMultiValueExprContext)_localctx).values = sqlInValues_();
			setState(742);
			match(RP_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SqlExistsExprContext extends ParserRuleContext {
		public SqlSubQueryExprContext query;
		public TerminalNode EXISTS() { return getToken(EqlParser.EXISTS, 0); }
		public SqlSubQueryExprContext sqlSubQueryExpr() {
			return getRuleContext(SqlSubQueryExprContext.class,0);
		}
		public SqlExistsExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sqlExistsExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).enterSqlExistsExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).exitSqlExistsExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EqlVisitor ) return ((EqlVisitor<? extends T>)visitor).visitSqlExistsExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SqlExistsExprContext sqlExistsExpr() throws RecognitionException {
		SqlExistsExprContext _localctx = new SqlExistsExprContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_sqlExistsExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(744);
			match(EXISTS);
			setState(745);
			((SqlExistsExprContext)_localctx).query = sqlSubQueryExpr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SqlExpr_functionCallContext extends ParserRuleContext {
		public SqlAggregateFunctionContext sqlAggregateFunction() {
			return getRuleContext(SqlAggregateFunctionContext.class,0);
		}
		public SqlExpr_specialContext sqlExpr_special() {
			return getRuleContext(SqlExpr_specialContext.class,0);
		}
		public SqlRegularFunctionContext sqlRegularFunction() {
			return getRuleContext(SqlRegularFunctionContext.class,0);
		}
		public SqlExpr_functionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sqlExpr_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).enterSqlExpr_functionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).exitSqlExpr_functionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EqlVisitor ) return ((EqlVisitor<? extends T>)visitor).visitSqlExpr_functionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SqlExpr_functionCallContext sqlExpr_functionCall() throws RecognitionException {
		SqlExpr_functionCallContext _localctx = new SqlExpr_functionCallContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_sqlExpr_functionCall);
		try {
			setState(750);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(747);
				sqlAggregateFunction();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(748);
				sqlExpr_special();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(749);
				sqlRegularFunction();
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

	public static class SqlAggregateFunctionContext extends ParserRuleContext {
		public SqlIdentifier_agg_Context name;
		public Distinct_Context distinct;
		public FunctionArgs_Context args;
		public Token selectAll;
		public TerminalNode LP_() { return getToken(EqlParser.LP_, 0); }
		public TerminalNode RP_() { return getToken(EqlParser.RP_, 0); }
		public SqlIdentifier_agg_Context sqlIdentifier_agg_() {
			return getRuleContext(SqlIdentifier_agg_Context.class,0);
		}
		public Distinct_Context distinct_() {
			return getRuleContext(Distinct_Context.class,0);
		}
		public FunctionArgs_Context functionArgs_() {
			return getRuleContext(FunctionArgs_Context.class,0);
		}
		public TerminalNode ASTERISK_() { return getToken(EqlParser.ASTERISK_, 0); }
		public SqlAggregateFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sqlAggregateFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).enterSqlAggregateFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).exitSqlAggregateFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EqlVisitor ) return ((EqlVisitor<? extends T>)visitor).visitSqlAggregateFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SqlAggregateFunctionContext sqlAggregateFunction() throws RecognitionException {
		SqlAggregateFunctionContext _localctx = new SqlAggregateFunctionContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_sqlAggregateFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(752);
			((SqlAggregateFunctionContext)_localctx).name = sqlIdentifier_agg_();
			setState(753);
			match(LP_);
			setState(755);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DISTINCT) {
				{
				setState(754);
				((SqlAggregateFunctionContext)_localctx).distinct = distinct_();
				}
			}

			setState(759);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT_:
			case TILDE_:
			case PLUS_:
			case MINUS_:
			case LP_:
			case QUESTION_:
			case POSITION:
			case CASE:
			case CAST:
			case IF:
			case NOT:
			case NULL:
			case TRUE:
			case FALSE:
			case EXISTS:
			case INTERVAL:
			case DATE:
			case TIME:
			case TIMESTAMP:
			case LOCALTIME:
			case LOCALTIMESTAMP:
			case YEAR:
			case MONTH:
			case MAX:
			case MIN:
			case SUM:
			case COUNT:
			case AVG:
			case NAME:
			case TYPE:
			case CATALOG_NAME:
			case CHARACTER_SET_CATALOG:
			case CHARACTER_SET_NAME:
			case CHARACTER_SET_SCHEMA:
			case CLASS_ORIGIN:
			case COBOL:
			case COLLATION_CATALOG:
			case COLLATION_NAME:
			case COLLATION_SCHEMA:
			case COLUMN_NAME:
			case COMMAND_FUNCTION:
			case COMMITTED:
			case CONDITION_NUMBER:
			case CONNECTION_NAME:
			case CONSTRAINT_CATALOG:
			case CONSTRAINT_NAME:
			case CONSTRAINT_SCHEMA:
			case CURSOR_NAME:
			case DATA:
			case DATETIME_INTERVAL_CODE:
			case DATETIME_INTERVAL_PRECISION:
			case DYNAMIC_FUNCTION:
			case FORTRAN:
			case LENGTH:
			case MESSAGE_LENGTH:
			case MESSAGE_OCTET_LENGTH:
			case MESSAGE_TEXT:
			case MORE92:
			case MUMPS:
			case NULLABLE:
			case NUMBER:
			case PASCAL:
			case PLI:
			case REPEATABLE:
			case RETURNED_LENGTH:
			case RETURNED_OCTET_LENGTH:
			case RETURNED_SQLSTATE:
			case ROW_COUNT:
			case SCALE:
			case SCHEMA_NAME:
			case SERIALIZABLE:
			case SERVER_NAME:
			case SUBCLASS_ORIGIN:
			case TABLE_NAME:
			case UNCOMMITTED:
			case UNNAMED:
			case COALESCE:
			case CURRENT_TIMESTAMP:
			case LEVEL:
			case SESSION:
			case VALUE:
			case IDENTIFIER_:
			case STRING_:
			case NUMBER_:
			case HEX_DIGIT_:
			case BIT_NUM_:
				{
				setState(757);
				((SqlAggregateFunctionContext)_localctx).args = functionArgs_();
				}
				break;
			case ASTERISK_:
				{
				setState(758);
				((SqlAggregateFunctionContext)_localctx).selectAll = match(ASTERISK_);
				}
				break;
			case RP_:
				break;
			default:
				break;
			}
			setState(761);
			match(RP_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SqlIdentifier_agg_Context extends ParserRuleContext {
		public TerminalNode MAX() { return getToken(EqlParser.MAX, 0); }
		public TerminalNode MIN() { return getToken(EqlParser.MIN, 0); }
		public TerminalNode SUM() { return getToken(EqlParser.SUM, 0); }
		public TerminalNode COUNT() { return getToken(EqlParser.COUNT, 0); }
		public TerminalNode AVG() { return getToken(EqlParser.AVG, 0); }
		public SqlIdentifier_agg_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sqlIdentifier_agg_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).enterSqlIdentifier_agg_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).exitSqlIdentifier_agg_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EqlVisitor ) return ((EqlVisitor<? extends T>)visitor).visitSqlIdentifier_agg_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SqlIdentifier_agg_Context sqlIdentifier_agg_() throws RecognitionException {
		SqlIdentifier_agg_Context _localctx = new SqlIdentifier_agg_Context(_ctx, getState());
		enterRule(_localctx, 148, RULE_sqlIdentifier_agg_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(763);
			_la = _input.LA(1);
			if ( !(((((_la - 145)) & ~0x3f) == 0 && ((1L << (_la - 145)) & ((1L << (MAX - 145)) | (1L << (MIN - 145)) | (1L << (SUM - 145)) | (1L << (COUNT - 145)) | (1L << (AVG - 145)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	public static class Distinct_Context extends ParserRuleContext {
		public TerminalNode DISTINCT() { return getToken(EqlParser.DISTINCT, 0); }
		public Distinct_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_distinct_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).enterDistinct_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).exitDistinct_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EqlVisitor ) return ((EqlVisitor<? extends T>)visitor).visitDistinct_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Distinct_Context distinct_() throws RecognitionException {
		Distinct_Context _localctx = new Distinct_Context(_ctx, getState());
		enterRule(_localctx, 150, RULE_distinct_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(765);
			match(DISTINCT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionArgs_Context extends ParserRuleContext {
		public SqlExprContext e;
		public List<SqlExprContext> sqlExpr() {
			return getRuleContexts(SqlExprContext.class);
		}
		public SqlExprContext sqlExpr(int i) {
			return getRuleContext(SqlExprContext.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(EqlParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(EqlParser.COMMA_, i);
		}
		public FunctionArgs_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionArgs_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).enterFunctionArgs_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).exitFunctionArgs_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EqlVisitor ) return ((EqlVisitor<? extends T>)visitor).visitFunctionArgs_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionArgs_Context functionArgs_() throws RecognitionException {
		FunctionArgs_Context _localctx = new FunctionArgs_Context(_ctx, getState());
		enterRule(_localctx, 152, RULE_functionArgs_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(767);
			((FunctionArgs_Context)_localctx).e = sqlExpr(0);
			setState(772);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(768);
				match(COMMA_);
				setState(769);
				((FunctionArgs_Context)_localctx).e = sqlExpr(0);
				}
				}
				setState(774);
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

	public static class SqlExpr_specialContext extends ParserRuleContext {
		public SqlCastExprContext sqlCastExpr() {
			return getRuleContext(SqlCastExprContext.class,0);
		}
		public SqlExpr_specialContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sqlExpr_special; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).enterSqlExpr_special(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).exitSqlExpr_special(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EqlVisitor ) return ((EqlVisitor<? extends T>)visitor).visitSqlExpr_special(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SqlExpr_specialContext sqlExpr_special() throws RecognitionException {
		SqlExpr_specialContext _localctx = new SqlExpr_specialContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_sqlExpr_special);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(775);
			sqlCastExpr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SqlCastExprContext extends ParserRuleContext {
		public SqlExprContext expr;
		public SqlTypeExprContext dataType;
		public TerminalNode CAST() { return getToken(EqlParser.CAST, 0); }
		public TerminalNode LP_() { return getToken(EqlParser.LP_, 0); }
		public TerminalNode AS() { return getToken(EqlParser.AS, 0); }
		public TerminalNode RP_() { return getToken(EqlParser.RP_, 0); }
		public SqlTypeExprContext sqlTypeExpr() {
			return getRuleContext(SqlTypeExprContext.class,0);
		}
		public TerminalNode NULL() { return getToken(EqlParser.NULL, 0); }
		public SqlExprContext sqlExpr() {
			return getRuleContext(SqlExprContext.class,0);
		}
		public SqlCastExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sqlCastExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).enterSqlCastExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).exitSqlCastExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EqlVisitor ) return ((EqlVisitor<? extends T>)visitor).visitSqlCastExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SqlCastExprContext sqlCastExpr() throws RecognitionException {
		SqlCastExprContext _localctx = new SqlCastExprContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_sqlCastExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(777);
			match(CAST);
			setState(778);
			match(LP_);
			setState(781);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
			case 1:
				{
				setState(779);
				((SqlCastExprContext)_localctx).expr = sqlExpr(0);
				}
				break;
			case 2:
				{
				setState(780);
				match(NULL);
				}
				break;
			}
			setState(783);
			match(AS);
			setState(784);
			((SqlCastExprContext)_localctx).dataType = sqlTypeExpr();
			setState(785);
			match(RP_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SqlRegularFunctionContext extends ParserRuleContext {
		public SqlIdentifier_func_Context name;
		public FunctionArgs_Context args;
		public TerminalNode LP_() { return getToken(EqlParser.LP_, 0); }
		public TerminalNode RP_() { return getToken(EqlParser.RP_, 0); }
		public SqlIdentifier_func_Context sqlIdentifier_func_() {
			return getRuleContext(SqlIdentifier_func_Context.class,0);
		}
		public FunctionArgs_Context functionArgs_() {
			return getRuleContext(FunctionArgs_Context.class,0);
		}
		public SqlRegularFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sqlRegularFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).enterSqlRegularFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).exitSqlRegularFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EqlVisitor ) return ((EqlVisitor<? extends T>)visitor).visitSqlRegularFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SqlRegularFunctionContext sqlRegularFunction() throws RecognitionException {
		SqlRegularFunctionContext _localctx = new SqlRegularFunctionContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_sqlRegularFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(787);
			((SqlRegularFunctionContext)_localctx).name = sqlIdentifier_func_();
			setState(788);
			match(LP_);
			setState(790);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOT_) | (1L << TILDE_) | (1L << PLUS_) | (1L << MINUS_) | (1L << LP_) | (1L << QUESTION_))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (POSITION - 64)) | (1L << (CASE - 64)) | (1L << (CAST - 64)) | (1L << (IF - 64)) | (1L << (NOT - 64)) | (1L << (NULL - 64)) | (1L << (TRUE - 64)) | (1L << (FALSE - 64)) | (1L << (EXISTS - 64)))) != 0) || ((((_la - 130)) & ~0x3f) == 0 && ((1L << (_la - 130)) & ((1L << (INTERVAL - 130)) | (1L << (DATE - 130)) | (1L << (TIME - 130)) | (1L << (TIMESTAMP - 130)) | (1L << (LOCALTIME - 130)) | (1L << (LOCALTIMESTAMP - 130)) | (1L << (YEAR - 130)) | (1L << (MONTH - 130)) | (1L << (MAX - 130)) | (1L << (MIN - 130)) | (1L << (SUM - 130)) | (1L << (COUNT - 130)) | (1L << (AVG - 130)) | (1L << (NAME - 130)) | (1L << (TYPE - 130)) | (1L << (CATALOG_NAME - 130)) | (1L << (CHARACTER_SET_CATALOG - 130)) | (1L << (CHARACTER_SET_NAME - 130)) | (1L << (CHARACTER_SET_SCHEMA - 130)) | (1L << (CLASS_ORIGIN - 130)) | (1L << (COBOL - 130)) | (1L << (COLLATION_CATALOG - 130)) | (1L << (COLLATION_NAME - 130)) | (1L << (COLLATION_SCHEMA - 130)) | (1L << (COLUMN_NAME - 130)) | (1L << (COMMAND_FUNCTION - 130)) | (1L << (COMMITTED - 130)) | (1L << (CONDITION_NUMBER - 130)) | (1L << (CONNECTION_NAME - 130)) | (1L << (CONSTRAINT_CATALOG - 130)) | (1L << (CONSTRAINT_NAME - 130)) | (1L << (CONSTRAINT_SCHEMA - 130)) | (1L << (CURSOR_NAME - 130)))) != 0) || ((((_la - 194)) & ~0x3f) == 0 && ((1L << (_la - 194)) & ((1L << (DATA - 194)) | (1L << (DATETIME_INTERVAL_CODE - 194)) | (1L << (DATETIME_INTERVAL_PRECISION - 194)) | (1L << (DYNAMIC_FUNCTION - 194)) | (1L << (FORTRAN - 194)) | (1L << (LENGTH - 194)) | (1L << (MESSAGE_LENGTH - 194)) | (1L << (MESSAGE_OCTET_LENGTH - 194)) | (1L << (MESSAGE_TEXT - 194)) | (1L << (MORE92 - 194)) | (1L << (MUMPS - 194)) | (1L << (NULLABLE - 194)) | (1L << (NUMBER - 194)) | (1L << (PASCAL - 194)) | (1L << (PLI - 194)) | (1L << (REPEATABLE - 194)) | (1L << (RETURNED_LENGTH - 194)) | (1L << (RETURNED_OCTET_LENGTH - 194)) | (1L << (RETURNED_SQLSTATE - 194)) | (1L << (ROW_COUNT - 194)) | (1L << (SCALE - 194)) | (1L << (SCHEMA_NAME - 194)) | (1L << (SERIALIZABLE - 194)) | (1L << (SERVER_NAME - 194)) | (1L << (SUBCLASS_ORIGIN - 194)) | (1L << (TABLE_NAME - 194)) | (1L << (UNCOMMITTED - 194)) | (1L << (UNNAMED - 194)) | (1L << (COALESCE - 194)) | (1L << (CURRENT_TIMESTAMP - 194)))) != 0) || ((((_la - 286)) & ~0x3f) == 0 && ((1L << (_la - 286)) & ((1L << (LEVEL - 286)) | (1L << (SESSION - 286)) | (1L << (VALUE - 286)) | (1L << (IDENTIFIER_ - 286)) | (1L << (STRING_ - 286)) | (1L << (NUMBER_ - 286)) | (1L << (HEX_DIGIT_ - 286)) | (1L << (BIT_NUM_ - 286)))) != 0)) {
				{
				setState(789);
				((SqlRegularFunctionContext)_localctx).args = functionArgs_();
				}
			}

			setState(792);
			match(RP_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SqlIdentifier_func_Context extends ParserRuleContext {
		public SqlIdentifier_Context sqlIdentifier_() {
			return getRuleContext(SqlIdentifier_Context.class,0);
		}
		public TerminalNode IF() { return getToken(EqlParser.IF, 0); }
		public TerminalNode CURRENT_TIMESTAMP() { return getToken(EqlParser.CURRENT_TIMESTAMP, 0); }
		public TerminalNode LOCALTIME() { return getToken(EqlParser.LOCALTIME, 0); }
		public TerminalNode LOCALTIMESTAMP() { return getToken(EqlParser.LOCALTIMESTAMP, 0); }
		public TerminalNode INTERVAL() { return getToken(EqlParser.INTERVAL, 0); }
		public SqlIdentifier_func_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sqlIdentifier_func_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).enterSqlIdentifier_func_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).exitSqlIdentifier_func_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EqlVisitor ) return ((EqlVisitor<? extends T>)visitor).visitSqlIdentifier_func_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SqlIdentifier_func_Context sqlIdentifier_func_() throws RecognitionException {
		SqlIdentifier_func_Context _localctx = new SqlIdentifier_func_Context(_ctx, getState());
		enterRule(_localctx, 160, RULE_sqlIdentifier_func_);
		try {
			setState(800);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case POSITION:
			case YEAR:
			case MONTH:
			case COUNT:
			case NAME:
			case TYPE:
			case CATALOG_NAME:
			case CHARACTER_SET_CATALOG:
			case CHARACTER_SET_NAME:
			case CHARACTER_SET_SCHEMA:
			case CLASS_ORIGIN:
			case COBOL:
			case COLLATION_CATALOG:
			case COLLATION_NAME:
			case COLLATION_SCHEMA:
			case COLUMN_NAME:
			case COMMAND_FUNCTION:
			case COMMITTED:
			case CONDITION_NUMBER:
			case CONNECTION_NAME:
			case CONSTRAINT_CATALOG:
			case CONSTRAINT_NAME:
			case CONSTRAINT_SCHEMA:
			case CURSOR_NAME:
			case DATA:
			case DATETIME_INTERVAL_CODE:
			case DATETIME_INTERVAL_PRECISION:
			case DYNAMIC_FUNCTION:
			case FORTRAN:
			case LENGTH:
			case MESSAGE_LENGTH:
			case MESSAGE_OCTET_LENGTH:
			case MESSAGE_TEXT:
			case MORE92:
			case MUMPS:
			case NULLABLE:
			case NUMBER:
			case PASCAL:
			case PLI:
			case REPEATABLE:
			case RETURNED_LENGTH:
			case RETURNED_OCTET_LENGTH:
			case RETURNED_SQLSTATE:
			case ROW_COUNT:
			case SCALE:
			case SCHEMA_NAME:
			case SERIALIZABLE:
			case SERVER_NAME:
			case SUBCLASS_ORIGIN:
			case TABLE_NAME:
			case UNCOMMITTED:
			case UNNAMED:
			case COALESCE:
			case LEVEL:
			case SESSION:
			case VALUE:
			case IDENTIFIER_:
				enterOuterAlt(_localctx, 1);
				{
				setState(794);
				sqlIdentifier_();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(795);
				match(IF);
				}
				break;
			case CURRENT_TIMESTAMP:
				enterOuterAlt(_localctx, 3);
				{
				setState(796);
				match(CURRENT_TIMESTAMP);
				}
				break;
			case LOCALTIME:
				enterOuterAlt(_localctx, 4);
				{
				setState(797);
				match(LOCALTIME);
				}
				break;
			case LOCALTIMESTAMP:
				enterOuterAlt(_localctx, 5);
				{
				setState(798);
				match(LOCALTIMESTAMP);
				}
				break;
			case INTERVAL:
				enterOuterAlt(_localctx, 6);
				{
				setState(799);
				match(INTERVAL);
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

	public static class SqlDecorators_Context extends ParserRuleContext {
		public SqlDecoratorContext e;
		public List<SqlDecoratorContext> sqlDecorator() {
			return getRuleContexts(SqlDecoratorContext.class);
		}
		public SqlDecoratorContext sqlDecorator(int i) {
			return getRuleContext(SqlDecoratorContext.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(EqlParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(EqlParser.COMMA_, i);
		}
		public SqlDecorators_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sqlDecorators_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).enterSqlDecorators_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).exitSqlDecorators_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EqlVisitor ) return ((EqlVisitor<? extends T>)visitor).visitSqlDecorators_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SqlDecorators_Context sqlDecorators_() throws RecognitionException {
		SqlDecorators_Context _localctx = new SqlDecorators_Context(_ctx, getState());
		enterRule(_localctx, 162, RULE_sqlDecorators_);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(802);
			((SqlDecorators_Context)_localctx).e = sqlDecorator();
			setState(807);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,89,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(803);
					match(COMMA_);
					setState(804);
					((SqlDecorators_Context)_localctx).e = sqlDecorator();
					}
					} 
				}
				setState(809);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,89,_ctx);
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

	public static class SqlDecoratorContext extends ParserRuleContext {
		public SqlIdentifier_Context name;
		public DecoratorArgs_Context args;
		public TerminalNode AT_() { return getToken(EqlParser.AT_, 0); }
		public SqlIdentifier_Context sqlIdentifier_() {
			return getRuleContext(SqlIdentifier_Context.class,0);
		}
		public TerminalNode LP_() { return getToken(EqlParser.LP_, 0); }
		public TerminalNode RP_() { return getToken(EqlParser.RP_, 0); }
		public DecoratorArgs_Context decoratorArgs_() {
			return getRuleContext(DecoratorArgs_Context.class,0);
		}
		public SqlDecoratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sqlDecorator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).enterSqlDecorator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).exitSqlDecorator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EqlVisitor ) return ((EqlVisitor<? extends T>)visitor).visitSqlDecorator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SqlDecoratorContext sqlDecorator() throws RecognitionException {
		SqlDecoratorContext _localctx = new SqlDecoratorContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_sqlDecorator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(810);
			match(AT_);
			setState(811);
			((SqlDecoratorContext)_localctx).name = sqlIdentifier_();
			setState(817);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
			case 1:
				{
				setState(812);
				match(LP_);
				setState(814);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 103)) & ~0x3f) == 0 && ((1L << (_la - 103)) & ((1L << (NULL - 103)) | (1L << (TRUE - 103)) | (1L << (FALSE - 103)) | (1L << (DATE - 103)) | (1L << (TIME - 103)) | (1L << (TIMESTAMP - 103)))) != 0) || ((((_la - 342)) & ~0x3f) == 0 && ((1L << (_la - 342)) & ((1L << (STRING_ - 342)) | (1L << (NUMBER_ - 342)) | (1L << (HEX_DIGIT_ - 342)) | (1L << (BIT_NUM_ - 342)))) != 0)) {
					{
					setState(813);
					((SqlDecoratorContext)_localctx).args = decoratorArgs_();
					}
				}

				setState(816);
				match(RP_);
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

	public static class DecoratorArgs_Context extends ParserRuleContext {
		public SqlLiteralContext e;
		public List<SqlLiteralContext> sqlLiteral() {
			return getRuleContexts(SqlLiteralContext.class);
		}
		public SqlLiteralContext sqlLiteral(int i) {
			return getRuleContext(SqlLiteralContext.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(EqlParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(EqlParser.COMMA_, i);
		}
		public DecoratorArgs_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decoratorArgs_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).enterDecoratorArgs_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).exitDecoratorArgs_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EqlVisitor ) return ((EqlVisitor<? extends T>)visitor).visitDecoratorArgs_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecoratorArgs_Context decoratorArgs_() throws RecognitionException {
		DecoratorArgs_Context _localctx = new DecoratorArgs_Context(_ctx, getState());
		enterRule(_localctx, 166, RULE_decoratorArgs_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(819);
			((DecoratorArgs_Context)_localctx).e = sqlLiteral();
			setState(824);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(820);
				match(COMMA_);
				setState(821);
				((DecoratorArgs_Context)_localctx).e = sqlLiteral();
				}
				}
				setState(826);
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

	public static class SqlCaseExprContext extends ParserRuleContext {
		public SqlExpr_simpleContext test;
		public CaseWhens_Context caseWhens;
		public SqlExprContext elseExpr;
		public TerminalNode CASE() { return getToken(EqlParser.CASE, 0); }
		public TerminalNode END() { return getToken(EqlParser.END, 0); }
		public CaseWhens_Context caseWhens_() {
			return getRuleContext(CaseWhens_Context.class,0);
		}
		public TerminalNode ELSE() { return getToken(EqlParser.ELSE, 0); }
		public SqlExpr_simpleContext sqlExpr_simple() {
			return getRuleContext(SqlExpr_simpleContext.class,0);
		}
		public SqlExprContext sqlExpr() {
			return getRuleContext(SqlExprContext.class,0);
		}
		public SqlCaseExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sqlCaseExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).enterSqlCaseExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).exitSqlCaseExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EqlVisitor ) return ((EqlVisitor<? extends T>)visitor).visitSqlCaseExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SqlCaseExprContext sqlCaseExpr() throws RecognitionException {
		SqlCaseExprContext _localctx = new SqlCaseExprContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_sqlCaseExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(827);
			match(CASE);
			setState(829);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOT_) | (1L << TILDE_) | (1L << PLUS_) | (1L << MINUS_) | (1L << LP_) | (1L << QUESTION_))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (POSITION - 64)) | (1L << (CASE - 64)) | (1L << (CAST - 64)) | (1L << (IF - 64)) | (1L << (NULL - 64)) | (1L << (TRUE - 64)) | (1L << (FALSE - 64)) | (1L << (EXISTS - 64)))) != 0) || ((((_la - 130)) & ~0x3f) == 0 && ((1L << (_la - 130)) & ((1L << (INTERVAL - 130)) | (1L << (DATE - 130)) | (1L << (TIME - 130)) | (1L << (TIMESTAMP - 130)) | (1L << (LOCALTIME - 130)) | (1L << (LOCALTIMESTAMP - 130)) | (1L << (YEAR - 130)) | (1L << (MONTH - 130)) | (1L << (MAX - 130)) | (1L << (MIN - 130)) | (1L << (SUM - 130)) | (1L << (COUNT - 130)) | (1L << (AVG - 130)) | (1L << (NAME - 130)) | (1L << (TYPE - 130)) | (1L << (CATALOG_NAME - 130)) | (1L << (CHARACTER_SET_CATALOG - 130)) | (1L << (CHARACTER_SET_NAME - 130)) | (1L << (CHARACTER_SET_SCHEMA - 130)) | (1L << (CLASS_ORIGIN - 130)) | (1L << (COBOL - 130)) | (1L << (COLLATION_CATALOG - 130)) | (1L << (COLLATION_NAME - 130)) | (1L << (COLLATION_SCHEMA - 130)) | (1L << (COLUMN_NAME - 130)) | (1L << (COMMAND_FUNCTION - 130)) | (1L << (COMMITTED - 130)) | (1L << (CONDITION_NUMBER - 130)) | (1L << (CONNECTION_NAME - 130)) | (1L << (CONSTRAINT_CATALOG - 130)) | (1L << (CONSTRAINT_NAME - 130)) | (1L << (CONSTRAINT_SCHEMA - 130)) | (1L << (CURSOR_NAME - 130)))) != 0) || ((((_la - 194)) & ~0x3f) == 0 && ((1L << (_la - 194)) & ((1L << (DATA - 194)) | (1L << (DATETIME_INTERVAL_CODE - 194)) | (1L << (DATETIME_INTERVAL_PRECISION - 194)) | (1L << (DYNAMIC_FUNCTION - 194)) | (1L << (FORTRAN - 194)) | (1L << (LENGTH - 194)) | (1L << (MESSAGE_LENGTH - 194)) | (1L << (MESSAGE_OCTET_LENGTH - 194)) | (1L << (MESSAGE_TEXT - 194)) | (1L << (MORE92 - 194)) | (1L << (MUMPS - 194)) | (1L << (NULLABLE - 194)) | (1L << (NUMBER - 194)) | (1L << (PASCAL - 194)) | (1L << (PLI - 194)) | (1L << (REPEATABLE - 194)) | (1L << (RETURNED_LENGTH - 194)) | (1L << (RETURNED_OCTET_LENGTH - 194)) | (1L << (RETURNED_SQLSTATE - 194)) | (1L << (ROW_COUNT - 194)) | (1L << (SCALE - 194)) | (1L << (SCHEMA_NAME - 194)) | (1L << (SERIALIZABLE - 194)) | (1L << (SERVER_NAME - 194)) | (1L << (SUBCLASS_ORIGIN - 194)) | (1L << (TABLE_NAME - 194)) | (1L << (UNCOMMITTED - 194)) | (1L << (UNNAMED - 194)) | (1L << (COALESCE - 194)) | (1L << (CURRENT_TIMESTAMP - 194)))) != 0) || ((((_la - 286)) & ~0x3f) == 0 && ((1L << (_la - 286)) & ((1L << (LEVEL - 286)) | (1L << (SESSION - 286)) | (1L << (VALUE - 286)) | (1L << (IDENTIFIER_ - 286)) | (1L << (STRING_ - 286)) | (1L << (NUMBER_ - 286)) | (1L << (HEX_DIGIT_ - 286)) | (1L << (BIT_NUM_ - 286)))) != 0)) {
				{
				setState(828);
				((SqlCaseExprContext)_localctx).test = sqlExpr_simple();
				}
			}

			setState(831);
			((SqlCaseExprContext)_localctx).caseWhens = caseWhens_();
			setState(834);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(832);
				match(ELSE);
				setState(833);
				((SqlCaseExprContext)_localctx).elseExpr = sqlExpr(0);
				}
			}

			setState(836);
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

	public static class CaseWhens_Context extends ParserRuleContext {
		public SqlCaseWhenItemContext e;
		public List<SqlCaseWhenItemContext> sqlCaseWhenItem() {
			return getRuleContexts(SqlCaseWhenItemContext.class);
		}
		public SqlCaseWhenItemContext sqlCaseWhenItem(int i) {
			return getRuleContext(SqlCaseWhenItemContext.class,i);
		}
		public CaseWhens_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseWhens_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).enterCaseWhens_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).exitCaseWhens_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EqlVisitor ) return ((EqlVisitor<? extends T>)visitor).visitCaseWhens_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaseWhens_Context caseWhens_() throws RecognitionException {
		CaseWhens_Context _localctx = new CaseWhens_Context(_ctx, getState());
		enterRule(_localctx, 170, RULE_caseWhens_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(839); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(838);
				((CaseWhens_Context)_localctx).e = sqlCaseWhenItem();
				}
				}
				setState(841); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WHEN );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SqlCaseWhenItemContext extends ParserRuleContext {
		public SqlExprContext when;
		public SqlExprContext then;
		public TerminalNode WHEN() { return getToken(EqlParser.WHEN, 0); }
		public TerminalNode THEN() { return getToken(EqlParser.THEN, 0); }
		public List<SqlExprContext> sqlExpr() {
			return getRuleContexts(SqlExprContext.class);
		}
		public SqlExprContext sqlExpr(int i) {
			return getRuleContext(SqlExprContext.class,i);
		}
		public SqlCaseWhenItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sqlCaseWhenItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).enterSqlCaseWhenItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).exitSqlCaseWhenItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EqlVisitor ) return ((EqlVisitor<? extends T>)visitor).visitSqlCaseWhenItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SqlCaseWhenItemContext sqlCaseWhenItem() throws RecognitionException {
		SqlCaseWhenItemContext _localctx = new SqlCaseWhenItemContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_sqlCaseWhenItem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(843);
			match(WHEN);
			setState(844);
			((SqlCaseWhenItemContext)_localctx).when = sqlExpr(0);
			setState(845);
			match(THEN);
			setState(846);
			((SqlCaseWhenItemContext)_localctx).then = sqlExpr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SqlIntervalExprContext extends ParserRuleContext {
		public SqlExprContext expr;
		public IntervalUnit_Context intervalUnit;
		public TerminalNode INTERVAL() { return getToken(EqlParser.INTERVAL, 0); }
		public SqlExprContext sqlExpr() {
			return getRuleContext(SqlExprContext.class,0);
		}
		public IntervalUnit_Context intervalUnit_() {
			return getRuleContext(IntervalUnit_Context.class,0);
		}
		public SqlIntervalExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sqlIntervalExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).enterSqlIntervalExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).exitSqlIntervalExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EqlVisitor ) return ((EqlVisitor<? extends T>)visitor).visitSqlIntervalExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SqlIntervalExprContext sqlIntervalExpr() throws RecognitionException {
		SqlIntervalExprContext _localctx = new SqlIntervalExprContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_sqlIntervalExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(848);
			match(INTERVAL);
			setState(849);
			((SqlIntervalExprContext)_localctx).expr = sqlExpr(0);
			setState(850);
			((SqlIntervalExprContext)_localctx).intervalUnit = intervalUnit_();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntervalUnit_Context extends ParserRuleContext {
		public TerminalNode MICROSECOND() { return getToken(EqlParser.MICROSECOND, 0); }
		public TerminalNode SECOND() { return getToken(EqlParser.SECOND, 0); }
		public TerminalNode MINUTE() { return getToken(EqlParser.MINUTE, 0); }
		public TerminalNode HOUR() { return getToken(EqlParser.HOUR, 0); }
		public TerminalNode DAY() { return getToken(EqlParser.DAY, 0); }
		public TerminalNode WEEK() { return getToken(EqlParser.WEEK, 0); }
		public TerminalNode MONTH() { return getToken(EqlParser.MONTH, 0); }
		public TerminalNode QUARTER() { return getToken(EqlParser.QUARTER, 0); }
		public TerminalNode YEAR() { return getToken(EqlParser.YEAR, 0); }
		public IntervalUnit_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intervalUnit_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).enterIntervalUnit_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).exitIntervalUnit_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EqlVisitor ) return ((EqlVisitor<? extends T>)visitor).visitIntervalUnit_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntervalUnit_Context intervalUnit_() throws RecognitionException {
		IntervalUnit_Context _localctx = new IntervalUnit_Context(_ctx, getState());
		enterRule(_localctx, 176, RULE_intervalUnit_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(852);
			_la = _input.LA(1);
			if ( !(((((_la - 136)) & ~0x3f) == 0 && ((1L << (_la - 136)) & ((1L << (YEAR - 136)) | (1L << (QUARTER - 136)) | (1L << (MONTH - 136)) | (1L << (WEEK - 136)) | (1L << (DAY - 136)) | (1L << (HOUR - 136)) | (1L << (MINUTE - 136)) | (1L << (SECOND - 136)) | (1L << (MICROSECOND - 136)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	public static class SqlOrderByContext extends ParserRuleContext {
		public SqlOrderByItems_Context items;
		public TerminalNode ORDER() { return getToken(EqlParser.ORDER, 0); }
		public TerminalNode BY() { return getToken(EqlParser.BY, 0); }
		public SqlOrderByItems_Context sqlOrderByItems_() {
			return getRuleContext(SqlOrderByItems_Context.class,0);
		}
		public SqlOrderByContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sqlOrderBy; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).enterSqlOrderBy(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).exitSqlOrderBy(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EqlVisitor ) return ((EqlVisitor<? extends T>)visitor).visitSqlOrderBy(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SqlOrderByContext sqlOrderBy() throws RecognitionException {
		SqlOrderByContext _localctx = new SqlOrderByContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_sqlOrderBy);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(854);
			match(ORDER);
			setState(855);
			match(BY);
			setState(856);
			((SqlOrderByContext)_localctx).items = sqlOrderByItems_();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SqlOrderByItems_Context extends ParserRuleContext {
		public SqlOrderByItemContext e;
		public List<SqlOrderByItemContext> sqlOrderByItem() {
			return getRuleContexts(SqlOrderByItemContext.class);
		}
		public SqlOrderByItemContext sqlOrderByItem(int i) {
			return getRuleContext(SqlOrderByItemContext.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(EqlParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(EqlParser.COMMA_, i);
		}
		public SqlOrderByItems_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sqlOrderByItems_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).enterSqlOrderByItems_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).exitSqlOrderByItems_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EqlVisitor ) return ((EqlVisitor<? extends T>)visitor).visitSqlOrderByItems_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SqlOrderByItems_Context sqlOrderByItems_() throws RecognitionException {
		SqlOrderByItems_Context _localctx = new SqlOrderByItems_Context(_ctx, getState());
		enterRule(_localctx, 180, RULE_sqlOrderByItems_);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(858);
			((SqlOrderByItems_Context)_localctx).e = sqlOrderByItem();
			setState(863);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,96,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(859);
					match(COMMA_);
					setState(860);
					((SqlOrderByItems_Context)_localctx).e = sqlOrderByItem();
					}
					} 
				}
				setState(865);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,96,_ctx);
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

	public static class SqlOrderByItemContext extends ParserRuleContext {
		public SqlExprContext expr;
		public Token asc;
		public SqlExprContext sqlExpr() {
			return getRuleContext(SqlExprContext.class,0);
		}
		public TerminalNode ASC() { return getToken(EqlParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(EqlParser.DESC, 0); }
		public SqlOrderByItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sqlOrderByItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).enterSqlOrderByItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).exitSqlOrderByItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EqlVisitor ) return ((EqlVisitor<? extends T>)visitor).visitSqlOrderByItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SqlOrderByItemContext sqlOrderByItem() throws RecognitionException {
		SqlOrderByItemContext _localctx = new SqlOrderByItemContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_sqlOrderByItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(866);
			((SqlOrderByItemContext)_localctx).expr = sqlExpr(0);
			setState(868);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
			case 1:
				{
				setState(867);
				((SqlOrderByItemContext)_localctx).asc = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ASC || _la==DESC) ) {
					((SqlOrderByItemContext)_localctx).asc = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
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

	public static class SqlGroupByItemContext extends ParserRuleContext {
		public SqlExprContext expr;
		public SqlExprContext sqlExpr() {
			return getRuleContext(SqlExprContext.class,0);
		}
		public SqlGroupByItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sqlGroupByItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).enterSqlGroupByItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).exitSqlGroupByItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EqlVisitor ) return ((EqlVisitor<? extends T>)visitor).visitSqlGroupByItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SqlGroupByItemContext sqlGroupByItem() throws RecognitionException {
		SqlGroupByItemContext _localctx = new SqlGroupByItemContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_sqlGroupByItem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(870);
			((SqlGroupByItemContext)_localctx).expr = sqlExpr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SqlTypeExprContext extends ParserRuleContext {
		public DataTypeName_Context name;
		public Token precision;
		public Token scale;
		public CharacterSet_Context characterSet;
		public CollateClause_Context collate;
		public DataTypeName_Context dataTypeName_() {
			return getRuleContext(DataTypeName_Context.class,0);
		}
		public TerminalNode LP_() { return getToken(EqlParser.LP_, 0); }
		public TerminalNode RP_() { return getToken(EqlParser.RP_, 0); }
		public List<TerminalNode> NUMBER_() { return getTokens(EqlParser.NUMBER_); }
		public TerminalNode NUMBER_(int i) {
			return getToken(EqlParser.NUMBER_, i);
		}
		public CharacterSet_Context characterSet_() {
			return getRuleContext(CharacterSet_Context.class,0);
		}
		public CollateClause_Context collateClause_() {
			return getRuleContext(CollateClause_Context.class,0);
		}
		public TerminalNode COMMA_() { return getToken(EqlParser.COMMA_, 0); }
		public SqlTypeExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sqlTypeExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).enterSqlTypeExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).exitSqlTypeExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EqlVisitor ) return ((EqlVisitor<? extends T>)visitor).visitSqlTypeExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SqlTypeExprContext sqlTypeExpr() throws RecognitionException {
		SqlTypeExprContext _localctx = new SqlTypeExprContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_sqlTypeExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(872);
			((SqlTypeExprContext)_localctx).name = dataTypeName_();
			setState(880);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LP_) {
				{
				setState(873);
				match(LP_);
				setState(874);
				((SqlTypeExprContext)_localctx).precision = match(NUMBER_);
				setState(877);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA_) {
					{
					setState(875);
					match(COMMA_);
					setState(876);
					((SqlTypeExprContext)_localctx).scale = match(NUMBER_);
					}
				}

				setState(879);
				match(RP_);
				}
			}

			setState(883);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CHAR || _la==CHARACTER) {
				{
				setState(882);
				((SqlTypeExprContext)_localctx).characterSet = characterSet_();
				}
			}

			setState(886);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLLATE) {
				{
				setState(885);
				((SqlTypeExprContext)_localctx).collate = collateClause_();
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

	public static class DataTypeName_Context extends ParserRuleContext {
		public TerminalNode CHARACTER() { return getToken(EqlParser.CHARACTER, 0); }
		public TerminalNode VARYING() { return getToken(EqlParser.VARYING, 0); }
		public TerminalNode NATIONAL() { return getToken(EqlParser.NATIONAL, 0); }
		public TerminalNode CHAR() { return getToken(EqlParser.CHAR, 0); }
		public TerminalNode VARCHAR() { return getToken(EqlParser.VARCHAR, 0); }
		public TerminalNode NCHAR() { return getToken(EqlParser.NCHAR, 0); }
		public TerminalNode BIT() { return getToken(EqlParser.BIT, 0); }
		public TerminalNode NUMERIC() { return getToken(EqlParser.NUMERIC, 0); }
		public TerminalNode DECIMAL() { return getToken(EqlParser.DECIMAL, 0); }
		public TerminalNode DEC() { return getToken(EqlParser.DEC, 0); }
		public TerminalNode INTEGER() { return getToken(EqlParser.INTEGER, 0); }
		public TerminalNode SMALLINT() { return getToken(EqlParser.SMALLINT, 0); }
		public TerminalNode FLOAT() { return getToken(EqlParser.FLOAT, 0); }
		public TerminalNode REAL() { return getToken(EqlParser.REAL, 0); }
		public TerminalNode DOUBLE() { return getToken(EqlParser.DOUBLE, 0); }
		public TerminalNode PRECISION() { return getToken(EqlParser.PRECISION, 0); }
		public TerminalNode DATE() { return getToken(EqlParser.DATE, 0); }
		public List<TerminalNode> TIME() { return getTokens(EqlParser.TIME); }
		public TerminalNode TIME(int i) {
			return getToken(EqlParser.TIME, i);
		}
		public TerminalNode TIMESTAMP() { return getToken(EqlParser.TIMESTAMP, 0); }
		public TerminalNode INTERVAL() { return getToken(EqlParser.INTERVAL, 0); }
		public TerminalNode WITH() { return getToken(EqlParser.WITH, 0); }
		public TerminalNode ZONE() { return getToken(EqlParser.ZONE, 0); }
		public SqlIdentifier_Context sqlIdentifier_() {
			return getRuleContext(SqlIdentifier_Context.class,0);
		}
		public DataTypeName_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataTypeName_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).enterDataTypeName_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).exitDataTypeName_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EqlVisitor ) return ((EqlVisitor<? extends T>)visitor).visitDataTypeName_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataTypeName_Context dataTypeName_() throws RecognitionException {
		DataTypeName_Context _localctx = new DataTypeName_Context(_ctx, getState());
		enterRule(_localctx, 188, RULE_dataTypeName_);
		try {
			setState(929);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(888);
				match(CHARACTER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(889);
				match(CHARACTER);
				setState(890);
				match(VARYING);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(891);
				match(NATIONAL);
				setState(892);
				match(CHARACTER);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(893);
				match(NATIONAL);
				setState(894);
				match(CHARACTER);
				setState(895);
				match(VARYING);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(896);
				match(CHAR);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(897);
				match(VARCHAR);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(898);
				match(NCHAR);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(899);
				match(NATIONAL);
				setState(900);
				match(CHAR);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(901);
				match(NATIONAL);
				setState(902);
				match(CHAR);
				setState(903);
				match(VARYING);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(904);
				match(BIT);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(905);
				match(BIT);
				setState(906);
				match(VARYING);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(907);
				match(NUMERIC);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(908);
				match(DECIMAL);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(909);
				match(DEC);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(910);
				match(INTEGER);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(911);
				match(SMALLINT);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(912);
				match(FLOAT);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(913);
				match(REAL);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(914);
				match(DOUBLE);
				setState(915);
				match(PRECISION);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(916);
				match(DATE);
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(917);
				match(TIME);
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(918);
				match(TIMESTAMP);
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(919);
				match(INTERVAL);
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(920);
				match(TIME);
				setState(921);
				match(WITH);
				setState(922);
				match(TIME);
				setState(923);
				match(ZONE);
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(924);
				match(TIMESTAMP);
				setState(925);
				match(WITH);
				setState(926);
				match(TIME);
				setState(927);
				match(ZONE);
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(928);
				sqlIdentifier_();
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

	public static class CharacterSet_Context extends ParserRuleContext {
		public Token characterSet;
		public TerminalNode SET() { return getToken(EqlParser.SET, 0); }
		public TerminalNode CHARACTER() { return getToken(EqlParser.CHARACTER, 0); }
		public TerminalNode CHAR() { return getToken(EqlParser.CHAR, 0); }
		public TerminalNode STRING() { return getToken(EqlParser.STRING, 0); }
		public TerminalNode EQ_() { return getToken(EqlParser.EQ_, 0); }
		public CharacterSet_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_characterSet_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).enterCharacterSet_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).exitCharacterSet_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EqlVisitor ) return ((EqlVisitor<? extends T>)visitor).visitCharacterSet_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CharacterSet_Context characterSet_() throws RecognitionException {
		CharacterSet_Context _localctx = new CharacterSet_Context(_ctx, getState());
		enterRule(_localctx, 190, RULE_characterSet_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(931);
			_la = _input.LA(1);
			if ( !(_la==CHAR || _la==CHARACTER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(932);
			match(SET);
			setState(934);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQ_) {
				{
				setState(933);
				match(EQ_);
				}
			}

			setState(936);
			((CharacterSet_Context)_localctx).characterSet = match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CollateClause_Context extends ParserRuleContext {
		public Token collate;
		public TerminalNode COLLATE() { return getToken(EqlParser.COLLATE, 0); }
		public TerminalNode STRING_() { return getToken(EqlParser.STRING_, 0); }
		public TerminalNode EQ_() { return getToken(EqlParser.EQ_, 0); }
		public CollateClause_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collateClause_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).enterCollateClause_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).exitCollateClause_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EqlVisitor ) return ((EqlVisitor<? extends T>)visitor).visitCollateClause_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CollateClause_Context collateClause_() throws RecognitionException {
		CollateClause_Context _localctx = new CollateClause_Context(_ctx, getState());
		enterRule(_localctx, 192, RULE_collateClause_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(938);
			match(COLLATE);
			setState(940);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQ_) {
				{
				setState(939);
				match(EQ_);
				}
			}

			setState(942);
			((CollateClause_Context)_localctx).collate = match(STRING_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 17:
			return sqlSelect_sempred((SqlSelectContext)_localctx, predIndex);
		case 28:
			return sqlTableSource_sempred((SqlTableSourceContext)_localctx, predIndex);
		case 61:
			return sqlExpr_sempred((SqlExprContext)_localctx, predIndex);
		case 62:
			return sqlExpr_primary_sempred((SqlExpr_primaryContext)_localctx, predIndex);
		case 66:
			return sqlExpr_bit_sempred((SqlExpr_bitContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean sqlSelect_sempred(SqlSelectContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean sqlTableSource_sempred(SqlTableSourceContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean sqlExpr_sempred(SqlExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 4);
		case 3:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean sqlExpr_primary_sempred(SqlExpr_primaryContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 4);
		case 5:
			return precpred(_ctx, 3);
		case 6:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean sqlExpr_bit_sempred(SqlExpr_bitContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return precpred(_ctx, 11);
		case 8:
			return precpred(_ctx, 10);
		case 9:
			return precpred(_ctx, 9);
		case 10:
			return precpred(_ctx, 8);
		case 11:
			return precpred(_ctx, 7);
		case 12:
			return precpred(_ctx, 6);
		case 13:
			return precpred(_ctx, 5);
		case 14:
			return precpred(_ctx, 4);
		case 15:
			return precpred(_ctx, 3);
		case 16:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u015a\u03b1\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007"+
		"\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007"+
		"\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007"+
		"\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007"+
		"\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007"+
		"\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007"+
		",\u0002-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u0007"+
		"1\u00022\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u0007"+
		"6\u00027\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007"+
		";\u0002<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007?\u0002@\u0007"+
		"@\u0002A\u0007A\u0002B\u0007B\u0002C\u0007C\u0002D\u0007D\u0002E\u0007"+
		"E\u0002F\u0007F\u0002G\u0007G\u0002H\u0007H\u0002I\u0007I\u0002J\u0007"+
		"J\u0002K\u0007K\u0002L\u0007L\u0002M\u0007M\u0002N\u0007N\u0002O\u0007"+
		"O\u0002P\u0007P\u0002Q\u0007Q\u0002R\u0007R\u0002S\u0007S\u0002T\u0007"+
		"T\u0002U\u0007U\u0002V\u0007V\u0002W\u0007W\u0002X\u0007X\u0002Y\u0007"+
		"Y\u0002Z\u0007Z\u0002[\u0007[\u0002\\\u0007\\\u0002]\u0007]\u0002^\u0007"+
		"^\u0002_\u0007_\u0002`\u0007`\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0005\u0001\u00c8\b\u0001\n\u0001\f\u0001\u00cb\t\u0001"+
		"\u0001\u0001\u0003\u0001\u00ce\b\u0001\u0001\u0002\u0001\u0002\u0003\u0002"+
		"\u00d2\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0003\u0003\u00d9\b\u0003\u0001\u0004\u0001\u0004\u0003\u0004\u00dd\b"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0003"+
		"\u0007\u00e4\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u00ee\b\u0007\u0001"+
		"\b\u0003\b\u00f1\b\b\u0001\b\u0001\b\u0001\b\u0003\b\u00f6\b\b\u0001\b"+
		"\u0003\b\u00f9\b\b\u0001\b\u0001\b\u0003\b\u00fd\b\b\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0005\t\u0103\b\t\n\t\f\t\u0106\t\t\u0001\n\u0001\n\u0001\n"+
		"\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0005\f\u0113\b\f\n\f\f\f\u0116\t\f\u0001\f\u0001\f\u0001\r\u0003\r"+
		"\u011b\b\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u0121\b\r\u0001\r\u0003"+
		"\r\u0124\b\r\u0001\r\u0003\r\u0127\b\r\u0001\u000e\u0003\u000e\u012a\b"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0005\u0010\u0139\b\u0010\n\u0010\f\u0010\u013c\t\u0010"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0003\u0011\u0144\b\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u0148\b"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0005\u0011\u014d\b\u0011\n"+
		"\u0011\f\u0011\u0150\t\u0011\u0001\u0012\u0001\u0012\u0003\u0012\u0154"+
		"\b\u0012\u0001\u0013\u0003\u0013\u0157\b\u0013\u0001\u0013\u0001\u0013"+
		"\u0003\u0013\u015b\b\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u015f\b"+
		"\u0013\u0001\u0013\u0003\u0013\u0162\b\u0013\u0001\u0013\u0003\u0013\u0165"+
		"\b\u0013\u0001\u0013\u0003\u0013\u0168\b\u0013\u0001\u0013\u0003\u0013"+
		"\u016b\b\u0013\u0001\u0013\u0003\u0013\u016e\b\u0013\u0001\u0013\u0003"+
		"\u0013\u0171\b\u0013\u0001\u0013\u0003\u0013\u0174\b\u0013\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0005\u0014\u0179\b\u0014\n\u0014\f\u0014\u017c"+
		"\t\u0014\u0001\u0015\u0001\u0015\u0003\u0015\u0180\b\u0015\u0001\u0016"+
		"\u0001\u0016\u0003\u0016\u0184\b\u0016\u0001\u0016\u0003\u0016\u0187\b"+
		"\u0016\u0001\u0016\u0003\u0016\u018a\b\u0016\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0003\u0019\u0193"+
		"\b\u0019\u0001\u001a\u0001\u001a\u0003\u001a\u0197\b\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0005\u001b\u019e\b\u001b"+
		"\n\u001b\f\u001b\u01a1\t\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0003"+
		"\u001c\u01a6\b\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0003\u001c\u01ad\b\u001c\u0005\u001c\u01af\b\u001c\n\u001c\f\u001c"+
		"\u01b2\t\u001c\u0001\u001d\u0001\u001d\u0003\u001d\u01b6\b\u001d\u0001"+
		"\u001d\u0003\u001d\u01b9\b\u001d\u0001\u001d\u0003\u001d\u01bc\b\u001d"+
		"\u0001\u001e\u0003\u001e\u01bf\b\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0003\u001e\u01c5\b\u001e\u0001\u001e\u0001\u001e\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u01cd\b\u001f\u0001 "+
		"\u0001 \u0003 \u01d1\b \u0001!\u0003!\u01d4\b!\u0001!\u0001!\u0001\"\u0001"+
		"\"\u0001\"\u0001#\u0001#\u0003#\u01dd\b#\u0001#\u0001#\u0001$\u0001$\u0003"+
		"$\u01e3\b$\u0001$\u0001$\u0001%\u0001%\u0001%\u0001&\u0001&\u0001&\u0001"+
		"&\u0001\'\u0001\'\u0001\'\u0005\'\u01f1\b\'\n\'\f\'\u01f4\t\'\u0001(\u0001"+
		"(\u0001(\u0001)\u0001)\u0001)\u0001)\u0003)\u01fd\b)\u0001*\u0001*\u0003"+
		"*\u0201\b*\u0001+\u0001+\u0003+\u0205\b+\u0001,\u0001,\u0001,\u0001,\u0001"+
		"-\u0001-\u0001-\u0001.\u0001.\u0001/\u0001/\u0001/\u0001/\u0001/\u0001"+
		"/\u0001/\u0003/\u0217\b/\u00010\u00010\u00011\u00011\u00012\u00012\u0001"+
		"2\u00013\u00013\u00014\u00014\u00015\u00015\u00016\u00016\u00017\u0001"+
		"7\u00037\u022a\b7\u00018\u00018\u00019\u00019\u00019\u00039\u0231\b9\u0001"+
		"9\u00019\u0001:\u0001:\u0001:\u0003:\u0238\b:\u0001:\u0001:\u0001;\u0001"+
		";\u0001;\u0003;\u023f\b;\u0001<\u0001<\u0001<\u0005<\u0244\b<\n<\f<\u0247"+
		"\t<\u0001=\u0001=\u0001=\u0001=\u0003=\u024d\b=\u0001=\u0001=\u0001=\u0001"+
		"=\u0001=\u0001=\u0005=\u0255\b=\n=\f=\u0258\t=\u0001>\u0001>\u0001>\u0001"+
		">\u0001>\u0001>\u0003>\u0260\b>\u0001>\u0001>\u0001>\u0001>\u0001>\u0001"+
		">\u0001>\u0001>\u0001>\u0001>\u0005>\u026c\b>\n>\f>\u026f\t>\u0001?\u0001"+
		"?\u0001@\u0001@\u0003@\u0275\b@\u0001@\u0001@\u0001@\u0001@\u0001@\u0003"+
		"@\u027c\b@\u0001@\u0001@\u0001@\u0001@\u0001@\u0001@\u0001@\u0003@\u0285"+
		"\b@\u0001@\u0001@\u0001@\u0001@\u0001@\u0001@\u0001@\u0003@\u028e\b@\u0001"+
		"@\u0001@\u0001@\u0001@\u0003@\u0294\b@\u0001@\u0001@\u0003@\u0298\b@\u0001"+
		"@\u0001@\u0001@\u0001@\u0003@\u029e\b@\u0001@\u0003@\u02a1\b@\u0001A\u0001"+
		"A\u0001A\u0005A\u02a6\bA\nA\fA\u02a9\tA\u0001B\u0001B\u0001B\u0001B\u0001"+
		"B\u0001B\u0001B\u0001B\u0001B\u0001B\u0001B\u0001B\u0001B\u0001B\u0001"+
		"B\u0001B\u0001B\u0001B\u0001B\u0001B\u0001B\u0001B\u0001B\u0001B\u0001"+
		"B\u0001B\u0001B\u0001B\u0001B\u0001B\u0001B\u0001B\u0001B\u0005B\u02cc"+
		"\bB\nB\fB\u02cf\tB\u0001C\u0001C\u0001C\u0001C\u0001C\u0001C\u0001C\u0001"+
		"C\u0001C\u0001C\u0001C\u0003C\u02dc\bC\u0001D\u0001D\u0001D\u0001E\u0001"+
		"E\u0001E\u0001E\u0001F\u0001F\u0001F\u0001F\u0001G\u0001G\u0001G\u0001"+
		"H\u0001H\u0001H\u0003H\u02ef\bH\u0001I\u0001I\u0001I\u0003I\u02f4\bI\u0001"+
		"I\u0001I\u0003I\u02f8\bI\u0001I\u0001I\u0001J\u0001J\u0001K\u0001K\u0001"+
		"L\u0001L\u0001L\u0005L\u0303\bL\nL\fL\u0306\tL\u0001M\u0001M\u0001N\u0001"+
		"N\u0001N\u0001N\u0003N\u030e\bN\u0001N\u0001N\u0001N\u0001N\u0001O\u0001"+
		"O\u0001O\u0003O\u0317\bO\u0001O\u0001O\u0001P\u0001P\u0001P\u0001P\u0001"+
		"P\u0001P\u0003P\u0321\bP\u0001Q\u0001Q\u0001Q\u0005Q\u0326\bQ\nQ\fQ\u0329"+
		"\tQ\u0001R\u0001R\u0001R\u0001R\u0003R\u032f\bR\u0001R\u0003R\u0332\b"+
		"R\u0001S\u0001S\u0001S\u0005S\u0337\bS\nS\fS\u033a\tS\u0001T\u0001T\u0003"+
		"T\u033e\bT\u0001T\u0001T\u0001T\u0003T\u0343\bT\u0001T\u0001T\u0001U\u0004"+
		"U\u0348\bU\u000bU\fU\u0349\u0001V\u0001V\u0001V\u0001V\u0001V\u0001W\u0001"+
		"W\u0001W\u0001W\u0001X\u0001X\u0001Y\u0001Y\u0001Y\u0001Y\u0001Z\u0001"+
		"Z\u0001Z\u0005Z\u035e\bZ\nZ\fZ\u0361\tZ\u0001[\u0001[\u0003[\u0365\b["+
		"\u0001\\\u0001\\\u0001]\u0001]\u0001]\u0001]\u0001]\u0003]\u036e\b]\u0001"+
		"]\u0003]\u0371\b]\u0001]\u0003]\u0374\b]\u0001]\u0003]\u0377\b]\u0001"+
		"^\u0001^\u0001^\u0001^\u0001^\u0001^\u0001^\u0001^\u0001^\u0001^\u0001"+
		"^\u0001^\u0001^\u0001^\u0001^\u0001^\u0001^\u0001^\u0001^\u0001^\u0001"+
		"^\u0001^\u0001^\u0001^\u0001^\u0001^\u0001^\u0001^\u0001^\u0001^\u0001"+
		"^\u0001^\u0001^\u0001^\u0001^\u0001^\u0001^\u0001^\u0001^\u0001^\u0001"+
		"^\u0003^\u03a2\b^\u0001_\u0001_\u0001_\u0003_\u03a7\b_\u0001_\u0001_\u0001"+
		"`\u0001`\u0003`\u03ad\b`\u0001`\u0001`\u0001`\u0000\u0005\"8z|\u0084a"+
		"\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a"+
		"\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082"+
		"\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a"+
		"\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2"+
		"\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u0000\f\u0001\u0000\u0083\u0085"+
		"\u0001\u0000hi\u000b\u0000@@\u0088\u0088\u008a\u008a\u0094\u0094\u00a6"+
		"\u00a6\u00ac\u00ac\u00b0\u00dd\u00ed\u00ed\u011e\u011e\u013a\u013a\u014f"+
		"\u014f\u0002\u0000\u0003\u0003ff\u0002\u0000\u0001\u0001cc\u0001\u0000"+
		"mn\u0001\u0000\u0015\u001a\u0002\u0000\u0003\u0004\f\r\u0001\u0000\u0091"+
		"\u0095\u0001\u0000\u0088\u0090\u0001\u0000tu\u0001\u0000\u007f\u0080\u03f6"+
		"\u0000\u00c2\u0001\u0000\u0000\u0000\u0002\u00c4\u0001\u0000\u0000\u0000"+
		"\u0004\u00d1\u0001\u0000\u0000\u0000\u0006\u00d8\u0001\u0000\u0000\u0000"+
		"\b\u00dc\u0001\u0000\u0000\u0000\n\u00de\u0001\u0000\u0000\u0000\f\u00e0"+
		"\u0001\u0000\u0000\u0000\u000e\u00e3\u0001\u0000\u0000\u0000\u0010\u00f0"+
		"\u0001\u0000\u0000\u0000\u0012\u00fe\u0001\u0000\u0000\u0000\u0014\u0107"+
		"\u0001\u0000\u0000\u0000\u0016\u010b\u0001\u0000\u0000\u0000\u0018\u010d"+
		"\u0001\u0000\u0000\u0000\u001a\u011a\u0001\u0000\u0000\u0000\u001c\u0129"+
		"\u0001\u0000\u0000\u0000\u001e\u012e\u0001\u0000\u0000\u0000 \u0134\u0001"+
		"\u0000\u0000\u0000\"\u0143\u0001\u0000\u0000\u0000$\u0151\u0001\u0000"+
		"\u0000\u0000&\u0156\u0001\u0000\u0000\u0000(\u0175\u0001\u0000\u0000\u0000"+
		"*\u017f\u0001\u0000\u0000\u0000,\u0181\u0001\u0000\u0000\u0000.\u018b"+
		"\u0001\u0000\u0000\u00000\u018e\u0001\u0000\u0000\u00002\u0192\u0001\u0000"+
		"\u0000\u00004\u0194\u0001\u0000\u0000\u00006\u019a\u0001\u0000\u0000\u0000"+
		"8\u01a5\u0001\u0000\u0000\u0000:\u01b3\u0001\u0000\u0000\u0000<\u01be"+
		"\u0001\u0000\u0000\u0000>\u01cc\u0001\u0000\u0000\u0000@\u01d0\u0001\u0000"+
		"\u0000\u0000B\u01d3\u0001\u0000\u0000\u0000D\u01d7\u0001\u0000\u0000\u0000"+
		"F\u01da\u0001\u0000\u0000\u0000H\u01e0\u0001\u0000\u0000\u0000J\u01e6"+
		"\u0001\u0000\u0000\u0000L\u01e9\u0001\u0000\u0000\u0000N\u01ed\u0001\u0000"+
		"\u0000\u0000P\u01f5\u0001\u0000\u0000\u0000R\u01f8\u0001\u0000\u0000\u0000"+
		"T\u0200\u0001\u0000\u0000\u0000V\u0204\u0001\u0000\u0000\u0000X\u0206"+
		"\u0001\u0000\u0000\u0000Z\u020a\u0001\u0000\u0000\u0000\\\u020d\u0001"+
		"\u0000\u0000\u0000^\u0216\u0001\u0000\u0000\u0000`\u0218\u0001\u0000\u0000"+
		"\u0000b\u021a\u0001\u0000\u0000\u0000d\u021c\u0001\u0000\u0000\u0000f"+
		"\u021f\u0001\u0000\u0000\u0000h\u0221\u0001\u0000\u0000\u0000j\u0223\u0001"+
		"\u0000\u0000\u0000l\u0225\u0001\u0000\u0000\u0000n\u0229\u0001\u0000\u0000"+
		"\u0000p\u022b\u0001\u0000\u0000\u0000r\u0230\u0001\u0000\u0000\u0000t"+
		"\u0237\u0001\u0000\u0000\u0000v\u023b\u0001\u0000\u0000\u0000x\u0240\u0001"+
		"\u0000\u0000\u0000z\u024c\u0001\u0000\u0000\u0000|\u0259\u0001\u0000\u0000"+
		"\u0000~\u0270\u0001\u0000\u0000\u0000\u0080\u02a0\u0001\u0000\u0000\u0000"+
		"\u0082\u02a2\u0001\u0000\u0000\u0000\u0084\u02aa\u0001\u0000\u0000\u0000"+
		"\u0086\u02db\u0001\u0000\u0000\u0000\u0088\u02dd\u0001\u0000\u0000\u0000"+
		"\u008a\u02e0\u0001\u0000\u0000\u0000\u008c\u02e4\u0001\u0000\u0000\u0000"+
		"\u008e\u02e8\u0001\u0000\u0000\u0000\u0090\u02ee\u0001\u0000\u0000\u0000"+
		"\u0092\u02f0\u0001\u0000\u0000\u0000\u0094\u02fb\u0001\u0000\u0000\u0000"+
		"\u0096\u02fd\u0001\u0000\u0000\u0000\u0098\u02ff\u0001\u0000\u0000\u0000"+
		"\u009a\u0307\u0001\u0000\u0000\u0000\u009c\u0309\u0001\u0000\u0000\u0000"+
		"\u009e\u0313\u0001\u0000\u0000\u0000\u00a0\u0320\u0001\u0000\u0000\u0000"+
		"\u00a2\u0322\u0001\u0000\u0000\u0000\u00a4\u032a\u0001\u0000\u0000\u0000"+
		"\u00a6\u0333\u0001\u0000\u0000\u0000\u00a8\u033b\u0001\u0000\u0000\u0000"+
		"\u00aa\u0347\u0001\u0000\u0000\u0000\u00ac\u034b\u0001\u0000\u0000\u0000"+
		"\u00ae\u0350\u0001\u0000\u0000\u0000\u00b0\u0354\u0001\u0000\u0000\u0000"+
		"\u00b2\u0356\u0001\u0000\u0000\u0000\u00b4\u035a\u0001\u0000\u0000\u0000"+
		"\u00b6\u0362\u0001\u0000\u0000\u0000\u00b8\u0366\u0001\u0000\u0000\u0000"+
		"\u00ba\u0368\u0001\u0000\u0000\u0000\u00bc\u03a1\u0001\u0000\u0000\u0000"+
		"\u00be\u03a3\u0001\u0000\u0000\u0000\u00c0\u03aa\u0001\u0000\u0000\u0000"+
		"\u00c2\u00c3\u0003\u0002\u0001\u0000\u00c3\u0001\u0001\u0000\u0000\u0000"+
		"\u00c4\u00c9\u0003\u0004\u0002\u0000\u00c5\u00c6\u0005\'\u0000\u0000\u00c6"+
		"\u00c8\u0003\u0004\u0002\u0000\u00c7\u00c5\u0001\u0000\u0000\u0000\u00c8"+
		"\u00cb\u0001\u0000\u0000\u0000\u00c9\u00c7\u0001\u0000\u0000\u0000\u00c9"+
		"\u00ca\u0001\u0000\u0000\u0000\u00ca\u00cd\u0001\u0000\u0000\u0000\u00cb"+
		"\u00c9\u0001\u0000\u0000\u0000\u00cc\u00ce\u0005\'\u0000\u0000\u00cd\u00cc"+
		"\u0001\u0000\u0000\u0000\u00cd\u00ce\u0001\u0000\u0000\u0000\u00ce\u0003"+
		"\u0001\u0000\u0000\u0000\u00cf\u00d2\u0003\u0006\u0003\u0000\u00d0\u00d2"+
		"\u0003\b\u0004\u0000\u00d1\u00cf\u0001\u0000\u0000\u0000\u00d1\u00d0\u0001"+
		"\u0000\u0000\u0000\u00d2\u0005\u0001\u0000\u0000\u0000\u00d3\u00d9\u0003"+
		"\u001c\u000e\u0000\u00d4\u00d9\u0003\"\u0011\u0000\u00d5\u00d9\u0003\u000e"+
		"\u0007\u0000\u00d6\u00d9\u0003\u0010\b\u0000\u00d7\u00d9\u0003\u001a\r"+
		"\u0000\u00d8\u00d3\u0001\u0000\u0000\u0000\u00d8\u00d4\u0001\u0000\u0000"+
		"\u0000\u00d8\u00d5\u0001\u0000\u0000\u0000\u00d8\u00d6\u0001\u0000\u0000"+
		"\u0000\u00d8\u00d7\u0001\u0000\u0000\u0000\u00d9\u0007\u0001\u0000\u0000"+
		"\u0000\u00da\u00dd\u0003\n\u0005\u0000\u00db\u00dd\u0003\f\u0006\u0000"+
		"\u00dc\u00da\u0001\u0000\u0000\u0000\u00dc\u00db\u0001\u0000\u0000\u0000"+
		"\u00dd\t\u0001\u0000\u0000\u0000\u00de\u00df\u0005z\u0000\u0000\u00df"+
		"\u000b\u0001\u0000\u0000\u0000\u00e0\u00e1\u0005{\u0000\u0000\u00e1\r"+
		"\u0001\u0000\u0000\u0000\u00e2\u00e4\u0003\u00a2Q\u0000\u00e3\u00e2\u0001"+
		"\u0000\u0000\u0000\u00e3\u00e4\u0001\u0000\u0000\u0000\u00e4\u00e5\u0001"+
		"\u0000\u0000\u0000\u00e5\u00e6\u0005,\u0000\u0000\u00e6\u00e7\u0005F\u0000"+
		"\u0000\u00e7\u00e8\u0003r9\u0000\u00e8\u00e9\u0005\u001c\u0000\u0000\u00e9"+
		"\u00ea\u0003x<\u0000\u00ea\u00ed\u0005\u001d\u0000\u0000\u00eb\u00ee\u0003"+
		"\u0016\u000b\u0000\u00ec\u00ee\u0003\"\u0011\u0000\u00ed\u00eb\u0001\u0000"+
		"\u0000\u0000\u00ed\u00ec\u0001\u0000\u0000\u0000\u00ee\u000f\u0001\u0000"+
		"\u0000\u0000\u00ef\u00f1\u0003\u00a2Q\u0000\u00f0\u00ef\u0001\u0000\u0000"+
		"\u0000\u00f0\u00f1\u0001\u0000\u0000\u0000\u00f1\u00f2\u0001\u0000\u0000"+
		"\u0000\u00f2\u00f3\u0005-\u0000\u0000\u00f3\u00f5\u0003r9\u0000\u00f4"+
		"\u00f6\u0005\\\u0000\u0000\u00f5\u00f4\u0001\u0000\u0000\u0000\u00f5\u00f6"+
		"\u0001\u0000\u0000\u0000\u00f6\u00f8\u0001\u0000\u0000\u0000\u00f7\u00f9"+
		"\u00030\u0018\u0000\u00f8\u00f7\u0001\u0000\u0000\u0000\u00f8\u00f9\u0001"+
		"\u0000\u0000\u0000\u00f9\u00fa\u0001\u0000\u0000\u0000\u00fa\u00fc\u0003"+
		"\u0012\t\u0000\u00fb\u00fd\u0003J%\u0000\u00fc\u00fb\u0001\u0000\u0000"+
		"\u0000\u00fc\u00fd\u0001\u0000\u0000\u0000\u00fd\u0011\u0001\u0000\u0000"+
		"\u0000\u00fe\u00ff\u00057\u0000\u0000\u00ff\u0104\u0003\u0014\n\u0000"+
		"\u0100\u0101\u0005\"\u0000\u0000\u0101\u0103\u0003\u0014\n\u0000\u0102"+
		"\u0100\u0001\u0000\u0000\u0000\u0103\u0106\u0001\u0000\u0000\u0000\u0104"+
		"\u0102\u0001\u0000\u0000\u0000\u0104\u0105\u0001\u0000\u0000\u0000\u0105"+
		"\u0013\u0001\u0000\u0000\u0000\u0106\u0104\u0001\u0000\u0000\u0000\u0107"+
		"\u0108\u0003t:\u0000\u0108\u0109\u0005\u0015\u0000\u0000\u0109\u010a\u0003"+
		"z=\u0000\u010a\u0015\u0001\u0000\u0000\u0000\u010b\u010c\u0003\u0018\f"+
		"\u0000\u010c\u0017\u0001\u0000\u0000\u0000\u010d\u010e\u0005G\u0000\u0000"+
		"\u010e\u010f\u0005\u001c\u0000\u0000\u010f\u0114\u0003z=\u0000\u0110\u0111"+
		"\u0005\"\u0000\u0000\u0111\u0113\u0003z=\u0000\u0112\u0110\u0001\u0000"+
		"\u0000\u0000\u0113\u0116\u0001\u0000\u0000\u0000\u0114\u0112\u0001\u0000"+
		"\u0000\u0000\u0114\u0115\u0001\u0000\u0000\u0000\u0115\u0117\u0001\u0000"+
		"\u0000\u0000\u0116\u0114\u0001\u0000\u0000\u0000\u0117\u0118\u0005\u001d"+
		"\u0000\u0000\u0118\u0019\u0001\u0000\u0000\u0000\u0119\u011b\u0003\u00a2"+
		"Q\u0000\u011a\u0119\u0001\u0000\u0000\u0000\u011a\u011b\u0001\u0000\u0000"+
		"\u0000\u011b\u011c\u0001\u0000\u0000\u0000\u011c\u011d\u0005.\u0000\u0000"+
		"\u011d\u011e\u0005P\u0000\u0000\u011e\u0120\u0003r9\u0000\u011f\u0121"+
		"\u0005\\\u0000\u0000\u0120\u011f\u0001\u0000\u0000\u0000\u0120\u0121\u0001"+
		"\u0000\u0000\u0000\u0121\u0123\u0001\u0000\u0000\u0000\u0122\u0124\u0003"+
		"0\u0018\u0000\u0123\u0122\u0001\u0000\u0000\u0000\u0123\u0124\u0001\u0000"+
		"\u0000\u0000\u0124\u0126\u0001\u0000\u0000\u0000\u0125\u0127\u0003J%\u0000"+
		"\u0126\u0125\u0001\u0000\u0000\u0000\u0126\u0127\u0001\u0000\u0000\u0000"+
		"\u0127\u001b\u0001\u0000\u0000\u0000\u0128\u012a\u0003\u00a2Q\u0000\u0129"+
		"\u0128\u0001\u0000\u0000\u0000\u0129\u012a\u0001\u0000\u0000\u0000\u012a"+
		"\u012b\u0001\u0000\u0000\u0000\u012b\u012c\u0003 \u0010\u0000\u012c\u012d"+
		"\u0003\"\u0011\u0000\u012d\u001d\u0001\u0000\u0000\u0000\u012e\u012f\u0003"+
		"n7\u0000\u012f\u0130\u0005\\\u0000\u0000\u0130\u0131\u0005\u001c\u0000"+
		"\u0000\u0131\u0132\u0003\"\u0011\u0000\u0132\u0133\u0005\u001d\u0000\u0000"+
		"\u0133\u001f\u0001\u0000\u0000\u0000\u0134\u0135\u0005H\u0000\u0000\u0135"+
		"\u013a\u0003\u001e\u000f\u0000\u0136\u0137\u0005\"\u0000\u0000\u0137\u0139"+
		"\u0003\u001e\u000f\u0000\u0138\u0136\u0001\u0000\u0000\u0000\u0139\u013c"+
		"\u0001\u0000\u0000\u0000\u013a\u0138\u0001\u0000\u0000\u0000\u013a\u013b"+
		"\u0001\u0000\u0000\u0000\u013b!\u0001\u0000\u0000\u0000\u013c\u013a\u0001"+
		"\u0000\u0000\u0000\u013d\u013e\u0006\u0011\uffff\uffff\u0000\u013e\u0144"+
		"\u0003&\u0013\u0000\u013f\u0140\u0005\u001c\u0000\u0000\u0140\u0141\u0003"+
		"\"\u0011\u0000\u0141\u0142\u0005\u001d\u0000\u0000\u0142\u0144\u0001\u0000"+
		"\u0000\u0000\u0143\u013d\u0001\u0000\u0000\u0000\u0143\u013f\u0001\u0000"+
		"\u0000\u0000\u0144\u014e\u0001\u0000\u0000\u0000\u0145\u0147\n\u0001\u0000"+
		"\u0000\u0146\u0148\u0003\u00a2Q\u0000\u0147\u0146\u0001\u0000\u0000\u0000"+
		"\u0147\u0148\u0001\u0000\u0000\u0000\u0148\u0149\u0001\u0000\u0000\u0000"+
		"\u0149\u014a\u0003$\u0012\u0000\u014a\u014b\u0003\"\u0011\u0002\u014b"+
		"\u014d\u0001\u0000\u0000\u0000\u014c\u0145\u0001\u0000\u0000\u0000\u014d"+
		"\u0150\u0001\u0000\u0000\u0000\u014e\u014c\u0001\u0000\u0000\u0000\u014e"+
		"\u014f\u0001\u0000\u0000\u0000\u014f#\u0001\u0000\u0000\u0000\u0150\u014e"+
		"\u0001\u0000\u0000\u0000\u0151\u0153\u0005I\u0000\u0000\u0152\u0154\u0005"+
		"m\u0000\u0000\u0153\u0152\u0001\u0000\u0000\u0000\u0153\u0154\u0001\u0000"+
		"\u0000\u0000\u0154%\u0001\u0000\u0000\u0000\u0155\u0157\u0003\u00a2Q\u0000"+
		"\u0156\u0155\u0001\u0000\u0000\u0000\u0156\u0157\u0001\u0000\u0000\u0000"+
		"\u0157\u0158\u0001\u0000\u0000\u0000\u0158\u015a\u0005+\u0000\u0000\u0159"+
		"\u015b\u0003\u0096K\u0000\u015a\u0159\u0001\u0000\u0000\u0000\u015a\u015b"+
		"\u0001\u0000\u0000\u0000\u015b\u015e\u0001\u0000\u0000\u0000\u015c\u015f"+
		"\u0005\u000e\u0000\u0000\u015d\u015f\u0003(\u0014\u0000\u015e\u015c\u0001"+
		"\u0000\u0000\u0000\u015e\u015d\u0001\u0000\u0000\u0000\u015f\u0161\u0001"+
		"\u0000\u0000\u0000\u0160\u0162\u00034\u001a\u0000\u0161\u0160\u0001\u0000"+
		"\u0000\u0000\u0161\u0162\u0001\u0000\u0000\u0000\u0162\u0164\u0001\u0000"+
		"\u0000\u0000\u0163\u0165\u0003J%\u0000\u0164\u0163\u0001\u0000\u0000\u0000"+
		"\u0164\u0165\u0001\u0000\u0000\u0000\u0165\u0167\u0001\u0000\u0000\u0000"+
		"\u0166\u0168\u0003L&\u0000\u0167\u0166\u0001\u0000\u0000\u0000\u0167\u0168"+
		"\u0001\u0000\u0000\u0000\u0168\u016a\u0001\u0000\u0000\u0000\u0169\u016b"+
		"\u0003P(\u0000\u016a\u0169\u0001\u0000\u0000\u0000\u016a\u016b\u0001\u0000"+
		"\u0000\u0000\u016b\u016d\u0001\u0000\u0000\u0000\u016c\u016e\u0003\u00b2"+
		"Y\u0000\u016d\u016c\u0001\u0000\u0000\u0000\u016d\u016e\u0001\u0000\u0000"+
		"\u0000\u016e\u0170\u0001\u0000\u0000\u0000\u016f\u0171\u0003R)\u0000\u0170"+
		"\u016f\u0001\u0000\u0000\u0000\u0170\u0171\u0001\u0000\u0000\u0000\u0171"+
		"\u0173\u0001\u0000\u0000\u0000\u0172\u0174\u0003Z-\u0000\u0173\u0172\u0001"+
		"\u0000\u0000\u0000\u0173\u0174\u0001\u0000\u0000\u0000\u0174\'\u0001\u0000"+
		"\u0000\u0000\u0175\u017a\u0003*\u0015\u0000\u0176\u0177\u0005\"\u0000"+
		"\u0000\u0177\u0179\u0003*\u0015\u0000\u0178\u0176\u0001\u0000\u0000\u0000"+
		"\u0179\u017c\u0001\u0000\u0000\u0000\u017a\u0178\u0001\u0000\u0000\u0000"+
		"\u017a\u017b\u0001\u0000\u0000\u0000\u017b)\u0001\u0000\u0000\u0000\u017c"+
		"\u017a\u0001\u0000\u0000\u0000\u017d\u0180\u0003,\u0016\u0000\u017e\u0180"+
		"\u0003.\u0017\u0000\u017f\u017d\u0001\u0000\u0000\u0000\u017f\u017e\u0001"+
		"\u0000\u0000\u0000\u0180+\u0001\u0000\u0000\u0000\u0181\u0183\u0003z="+
		"\u0000\u0182\u0184\u0005\\\u0000\u0000\u0183\u0182\u0001\u0000\u0000\u0000"+
		"\u0183\u0184\u0001\u0000\u0000\u0000\u0184\u0186\u0001\u0000\u0000\u0000"+
		"\u0185\u0187\u00030\u0018\u0000\u0186\u0185\u0001\u0000\u0000\u0000\u0186"+
		"\u0187\u0001\u0000\u0000\u0000\u0187\u0189\u0001\u0000\u0000\u0000\u0188"+
		"\u018a\u0003\u00a2Q\u0000\u0189\u0188\u0001\u0000\u0000\u0000\u0189\u018a"+
		"\u0001\u0000\u0000\u0000\u018a-\u0001\u0000\u0000\u0000\u018b\u018c\u0003"+
		"v;\u0000\u018c\u018d\u0005\u0012\u0000\u0000\u018d/\u0001\u0000\u0000"+
		"\u0000\u018e\u018f\u00032\u0019\u0000\u018f1\u0001\u0000\u0000\u0000\u0190"+
		"\u0193\u0003n7\u0000\u0191\u0193\u0005\u0156\u0000\u0000\u0192\u0190\u0001"+
		"\u0000\u0000\u0000\u0192\u0191\u0001\u0000\u0000\u0000\u01933\u0001\u0000"+
		"\u0000\u0000\u0194\u0196\u0005P\u0000\u0000\u0195\u0197\u0003\u00a2Q\u0000"+
		"\u0196\u0195\u0001\u0000\u0000\u0000\u0196\u0197\u0001\u0000\u0000\u0000"+
		"\u0197\u0198\u0001\u0000\u0000\u0000\u0198\u0199\u00036\u001b\u0000\u0199"+
		"5\u0001\u0000\u0000\u0000\u019a\u019f\u00038\u001c\u0000\u019b\u019c\u0005"+
		"\"\u0000\u0000\u019c\u019e\u00038\u001c\u0000\u019d\u019b\u0001\u0000"+
		"\u0000\u0000\u019e\u01a1\u0001\u0000\u0000\u0000\u019f\u019d\u0001\u0000"+
		"\u0000\u0000\u019f\u01a0\u0001\u0000\u0000\u0000\u01a07\u0001\u0000\u0000"+
		"\u0000\u01a1\u019f\u0001\u0000\u0000\u0000\u01a2\u01a3\u0006\u001c\uffff"+
		"\uffff\u0000\u01a3\u01a6\u0003:\u001d\u0000\u01a4\u01a6\u0003<\u001e\u0000"+
		"\u01a5\u01a2\u0001\u0000\u0000\u0000\u01a5\u01a4\u0001\u0000\u0000\u0000"+
		"\u01a6\u01b0\u0001\u0000\u0000\u0000\u01a7\u01a8\n\u0001\u0000\u0000\u01a8"+
		"\u01a9\u0003>\u001f\u0000\u01a9\u01ac\u0003@ \u0000\u01aa\u01ab\u0005"+
		"]\u0000\u0000\u01ab\u01ad\u0003z=\u0000\u01ac\u01aa\u0001\u0000\u0000"+
		"\u0000\u01ac\u01ad\u0001\u0000\u0000\u0000\u01ad\u01af\u0001\u0000\u0000"+
		"\u0000\u01ae\u01a7\u0001\u0000\u0000\u0000\u01af\u01b2\u0001\u0000\u0000"+
		"\u0000\u01b0\u01ae\u0001\u0000\u0000\u0000\u01b0\u01b1\u0001\u0000\u0000"+
		"\u0000\u01b19\u0001\u0000\u0000\u0000\u01b2\u01b0\u0001\u0000\u0000\u0000"+
		"\u01b3\u01b5\u0003r9\u0000\u01b4\u01b6\u0005\\\u0000\u0000\u01b5\u01b4"+
		"\u0001\u0000\u0000\u0000\u01b5\u01b6\u0001\u0000\u0000\u0000\u01b6\u01b8"+
		"\u0001\u0000\u0000\u0000\u01b7\u01b9\u00030\u0018\u0000\u01b8\u01b7\u0001"+
		"\u0000\u0000\u0000\u01b8\u01b9\u0001\u0000\u0000\u0000\u01b9\u01bb\u0001"+
		"\u0000\u0000\u0000\u01ba\u01bc\u0003\u00a2Q\u0000\u01bb\u01ba\u0001\u0000"+
		"\u0000\u0000\u01bb\u01bc\u0001\u0000\u0000\u0000\u01bc;\u0001\u0000\u0000"+
		"\u0000\u01bd\u01bf\u0005W\u0000\u0000\u01be\u01bd\u0001\u0000\u0000\u0000"+
		"\u01be\u01bf\u0001\u0000\u0000\u0000\u01bf\u01c0\u0001\u0000\u0000\u0000"+
		"\u01c0\u01c1\u0005\u001c\u0000\u0000\u01c1\u01c2\u0003\"\u0011\u0000\u01c2"+
		"\u01c4\u0005\u001d\u0000\u0000\u01c3\u01c5\u0005\\\u0000\u0000\u01c4\u01c3"+
		"\u0001\u0000\u0000\u0000\u01c4\u01c5\u0001\u0000\u0000\u0000\u01c5\u01c6"+
		"\u0001\u0000\u0000\u0000\u01c6\u01c7\u00030\u0018\u0000\u01c7=\u0001\u0000"+
		"\u0000\u0000\u01c8\u01cd\u0003B!\u0000\u01c9\u01cd\u0003F#\u0000\u01ca"+
		"\u01cd\u0003H$\u0000\u01cb\u01cd\u0003D\"\u0000\u01cc\u01c8\u0001\u0000"+
		"\u0000\u0000\u01cc\u01c9\u0001\u0000\u0000\u0000\u01cc\u01ca\u0001\u0000"+
		"\u0000\u0000\u01cc\u01cb\u0001\u0000\u0000\u0000\u01cd?\u0001\u0000\u0000"+
		"\u0000\u01ce\u01d1\u0003:\u001d\u0000\u01cf\u01d1\u0003<\u001e\u0000\u01d0"+
		"\u01ce\u0001\u0000\u0000\u0000\u01d0\u01cf\u0001\u0000\u0000\u0000\u01d1"+
		"A\u0001\u0000\u0000\u0000\u01d2\u01d4\u0005T\u0000\u0000\u01d3\u01d2\u0001"+
		"\u0000\u0000\u0000\u01d3\u01d4\u0001\u0000\u0000\u0000\u01d4\u01d5\u0001"+
		"\u0000\u0000\u0000\u01d5\u01d6\u0005R\u0000\u0000\u01d6C\u0001\u0000\u0000"+
		"\u0000\u01d7\u01d8\u0005S\u0000\u0000\u01d8\u01d9\u0005R\u0000\u0000\u01d9"+
		"E\u0001\u0000\u0000\u0000\u01da\u01dc\u0005V\u0000\u0000\u01db\u01dd\u0005"+
		"U\u0000\u0000\u01dc\u01db\u0001\u0000\u0000\u0000\u01dc\u01dd\u0001\u0000"+
		"\u0000\u0000\u01dd\u01de\u0001\u0000\u0000\u0000\u01de\u01df\u0005R\u0000"+
		"\u0000\u01dfG\u0001\u0000\u0000\u0000\u01e0\u01e2\u0005X\u0000\u0000\u01e1"+
		"\u01e3\u0005U\u0000\u0000\u01e2\u01e1\u0001\u0000\u0000\u0000\u01e2\u01e3"+
		"\u0001\u0000\u0000\u0000\u01e3\u01e4\u0001\u0000\u0000\u0000\u01e4\u01e5"+
		"\u0005R\u0000\u0000\u01e5I\u0001\u0000\u0000\u0000\u01e6\u01e7\u0005["+
		"\u0000\u0000\u01e7\u01e8\u0003z=\u0000\u01e8K\u0001\u0000\u0000\u0000"+
		"\u01e9\u01ea\u0005r\u0000\u0000\u01ea\u01eb\u0005s\u0000\u0000\u01eb\u01ec"+
		"\u0003N\'\u0000\u01ecM\u0001\u0000\u0000\u0000\u01ed\u01f2\u0003\u00b8"+
		"\\\u0000\u01ee\u01ef\u0005\"\u0000\u0000\u01ef\u01f1\u0003\u00b8\\\u0000"+
		"\u01f0\u01ee\u0001\u0000\u0000\u0000\u01f1\u01f4\u0001\u0000\u0000\u0000"+
		"\u01f2\u01f0\u0001\u0000\u0000\u0000\u01f2\u01f3\u0001\u0000\u0000\u0000"+
		"\u01f3O\u0001\u0000\u0000\u0000\u01f4\u01f2\u0001\u0000\u0000\u0000\u01f5"+
		"\u01f6\u0005v\u0000\u0000\u01f6\u01f7\u0003z=\u0000\u01f7Q\u0001\u0000"+
		"\u0000\u0000\u01f8\u01f9\u0005w\u0000\u0000\u01f9\u01fc\u0003T*\u0000"+
		"\u01fa\u01fb\u0005x\u0000\u0000\u01fb\u01fd\u0003V+\u0000\u01fc\u01fa"+
		"\u0001\u0000\u0000\u0000\u01fc\u01fd\u0001\u0000\u0000\u0000\u01fdS\u0001"+
		"\u0000\u0000\u0000\u01fe\u0201\u0003b1\u0000\u01ff\u0201\u0003\\.\u0000"+
		"\u0200\u01fe\u0001\u0000\u0000\u0000\u0200\u01ff\u0001\u0000\u0000\u0000"+
		"\u0201U\u0001\u0000\u0000\u0000\u0202\u0205\u0003b1\u0000\u0203\u0205"+
		"\u0003\\.\u0000\u0204\u0202\u0001\u0000\u0000\u0000\u0204\u0203\u0001"+
		"\u0000\u0000\u0000\u0205W\u0001\u0000\u0000\u0000\u0206\u0207\u0005\u001c"+
		"\u0000\u0000\u0207\u0208\u0003\"\u0011\u0000\u0208\u0209\u0005\u001d\u0000"+
		"\u0000\u0209Y\u0001\u0000\u0000\u0000\u020a\u020b\u0005a\u0000\u0000\u020b"+
		"\u020c\u0005-\u0000\u0000\u020c[\u0001\u0000\u0000\u0000\u020d\u020e\u0005"+
		"%\u0000\u0000\u020e]\u0001\u0000\u0000\u0000\u020f\u0217\u0003`0\u0000"+
		"\u0210\u0217\u0003b1\u0000\u0211\u0217\u0003d2\u0000\u0212\u0217\u0003"+
		"f3\u0000\u0213\u0217\u0003h4\u0000\u0214\u0217\u0003j5\u0000\u0215\u0217"+
		"\u0003l6\u0000\u0216\u020f\u0001\u0000\u0000\u0000\u0216\u0210\u0001\u0000"+
		"\u0000\u0000\u0216\u0211\u0001\u0000\u0000\u0000\u0216\u0212\u0001\u0000"+
		"\u0000\u0000\u0216\u0213\u0001\u0000\u0000\u0000\u0216\u0214\u0001\u0000"+
		"\u0000\u0000\u0216\u0215\u0001\u0000\u0000\u0000\u0217_\u0001\u0000\u0000"+
		"\u0000\u0218\u0219\u0005\u0156\u0000\u0000\u0219a\u0001\u0000\u0000\u0000"+
		"\u021a\u021b\u0005\u0157\u0000\u0000\u021bc\u0001\u0000\u0000\u0000\u021c"+
		"\u021d\u0007\u0000\u0000\u0000\u021d\u021e\u0005\u0156\u0000\u0000\u021e"+
		"e\u0001\u0000\u0000\u0000\u021f\u0220\u0005\u0158\u0000\u0000\u0220g\u0001"+
		"\u0000\u0000\u0000\u0221\u0222\u0005\u0159\u0000\u0000\u0222i\u0001\u0000"+
		"\u0000\u0000\u0223\u0224\u0007\u0001\u0000\u0000\u0224k\u0001\u0000\u0000"+
		"\u0000\u0225\u0226\u0005g\u0000\u0000\u0226m\u0001\u0000\u0000\u0000\u0227"+
		"\u022a\u0005\u0155\u0000\u0000\u0228\u022a\u0003p8\u0000\u0229\u0227\u0001"+
		"\u0000\u0000\u0000\u0229\u0228\u0001\u0000\u0000\u0000\u022ao\u0001\u0000"+
		"\u0000\u0000\u022b\u022c\u0007\u0002\u0000\u0000\u022cq\u0001\u0000\u0000"+
		"\u0000\u022d\u022e\u0003v;\u0000\u022e\u022f\u0005\u0011\u0000\u0000\u022f"+
		"\u0231\u0001\u0000\u0000\u0000\u0230\u022d\u0001\u0000\u0000\u0000\u0230"+
		"\u0231\u0001\u0000\u0000\u0000\u0231\u0232\u0001\u0000\u0000\u0000\u0232"+
		"\u0233\u0003n7\u0000\u0233s\u0001\u0000\u0000\u0000\u0234\u0235\u0003"+
		"v;\u0000\u0235\u0236\u0005\u0011\u0000\u0000\u0236\u0238\u0001\u0000\u0000"+
		"\u0000\u0237\u0234\u0001\u0000\u0000\u0000\u0237\u0238\u0001\u0000\u0000"+
		"\u0000\u0238\u0239\u0001\u0000\u0000\u0000\u0239\u023a\u0003n7\u0000\u023a"+
		"u\u0001\u0000\u0000\u0000\u023b\u023e\u0003n7\u0000\u023c\u023d\u0005"+
		"\u0011\u0000\u0000\u023d\u023f\u0003v;\u0000\u023e\u023c\u0001\u0000\u0000"+
		"\u0000\u023e\u023f\u0001\u0000\u0000\u0000\u023fw\u0001\u0000\u0000\u0000"+
		"\u0240\u0245\u0003t:\u0000\u0241\u0242\u0005\"\u0000\u0000\u0242\u0244"+
		"\u0003t:\u0000\u0243\u0241\u0001\u0000\u0000\u0000\u0244\u0247\u0001\u0000"+
		"\u0000\u0000\u0245\u0243\u0001\u0000\u0000\u0000\u0245\u0246\u0001\u0000"+
		"\u0000\u0000\u0246y\u0001\u0000\u0000\u0000\u0247\u0245\u0001\u0000\u0000"+
		"\u0000\u0248\u0249\u0006=\uffff\uffff\u0000\u0249\u024a\u0007\u0003\u0000"+
		"\u0000\u024a\u024d\u0003z=\u0002\u024b\u024d\u0003|>\u0000\u024c\u0248"+
		"\u0001\u0000\u0000\u0000\u024c\u024b\u0001\u0000\u0000\u0000\u024d\u0256"+
		"\u0001\u0000\u0000\u0000\u024e\u024f\n\u0004\u0000\u0000\u024f\u0250\u0007"+
		"\u0004\u0000\u0000\u0250\u0255\u0003z=\u0005\u0251\u0252\n\u0003\u0000"+
		"\u0000\u0252\u0253\u0005d\u0000\u0000\u0253\u0255\u0003z=\u0004\u0254"+
		"\u024e\u0001\u0000\u0000\u0000\u0254\u0251\u0001\u0000\u0000\u0000\u0255"+
		"\u0258\u0001\u0000\u0000\u0000\u0256\u0254\u0001\u0000\u0000\u0000\u0256"+
		"\u0257\u0001\u0000\u0000\u0000\u0257{\u0001\u0000\u0000\u0000\u0258\u0256"+
		"\u0001\u0000\u0000\u0000\u0259\u025a\u0006>\uffff\uffff\u0000\u025a\u025b"+
		"\u0003\u0080@\u0000\u025b\u026d\u0001\u0000\u0000\u0000\u025c\u025d\n"+
		"\u0004\u0000\u0000\u025d\u025f\u0005e\u0000\u0000\u025e\u0260\u0005f\u0000"+
		"\u0000\u025f\u025e\u0001\u0000\u0000\u0000\u025f\u0260\u0001\u0000\u0000"+
		"\u0000\u0260\u0261\u0001\u0000\u0000\u0000\u0261\u026c\u0005g\u0000\u0000"+
		"\u0262\u0263\n\u0003\u0000\u0000\u0263\u0264\u0003~?\u0000\u0264\u0265"+
		"\u0003\u0080@\u0000\u0265\u026c\u0001\u0000\u0000\u0000\u0266\u0267\n"+
		"\u0002\u0000\u0000\u0267\u0268\u0003~?\u0000\u0268\u0269\u0007\u0005\u0000"+
		"\u0000\u0269\u026a\u0003X,\u0000\u026a\u026c\u0001\u0000\u0000\u0000\u026b"+
		"\u025c\u0001\u0000\u0000\u0000\u026b\u0262\u0001\u0000\u0000\u0000\u026b"+
		"\u0266\u0001\u0000\u0000\u0000\u026c\u026f\u0001\u0000\u0000\u0000\u026d"+
		"\u026b\u0001\u0000\u0000\u0000\u026d\u026e\u0001\u0000\u0000\u0000\u026e"+
		"}\u0001\u0000\u0000\u0000\u026f\u026d\u0001\u0000\u0000\u0000\u0270\u0271"+
		"\u0007\u0006\u0000\u0000\u0271\u007f\u0001\u0000\u0000\u0000\u0272\u0274"+
		"\u0003\u0084B\u0000\u0273\u0275\u0005f\u0000\u0000\u0274\u0273\u0001\u0000"+
		"\u0000\u0000\u0274\u0275\u0001\u0000\u0000\u0000\u0275\u0276\u0001\u0000"+
		"\u0000\u0000\u0276\u0277\u0005l\u0000\u0000\u0277\u0278\u0003X,\u0000"+
		"\u0278\u02a1\u0001\u0000\u0000\u0000\u0279\u027b\u0003\u0084B\u0000\u027a"+
		"\u027c\u0005f\u0000\u0000\u027b\u027a\u0001\u0000\u0000\u0000\u027b\u027c"+
		"\u0001\u0000\u0000\u0000\u027c\u027d\u0001\u0000\u0000\u0000\u027d\u027e"+
		"\u0005l\u0000\u0000\u027e\u027f\u0005\u001c\u0000\u0000\u027f\u0280\u0003"+
		"\u0082A\u0000\u0280\u0281\u0005\u001d\u0000\u0000\u0281\u02a1\u0001\u0000"+
		"\u0000\u0000\u0282\u0284\u0003\u0084B\u0000\u0283\u0285\u0005f\u0000\u0000"+
		"\u0284\u0283\u0001\u0000\u0000\u0000\u0284\u0285\u0001\u0000\u0000\u0000"+
		"\u0285\u0286\u0001\u0000\u0000\u0000\u0286\u0287\u0005k\u0000\u0000\u0287"+
		"\u0288\u0003\u0084B\u0000\u0288\u0289\u0005c\u0000\u0000\u0289\u028a\u0003"+
		"\u0080@\u0000\u028a\u02a1\u0001\u0000\u0000\u0000\u028b\u028d\u0003\u0084"+
		"B\u0000\u028c\u028e\u0005f\u0000\u0000\u028d\u028c\u0001\u0000\u0000\u0000"+
		"\u028d\u028e\u0001\u0000\u0000\u0000\u028e\u028f\u0001\u0000\u0000\u0000"+
		"\u028f\u0290\u0005o\u0000\u0000\u0290\u0293\u0003\u0086C\u0000\u0291\u0292"+
		"\u0005\u0105\u0000\u0000\u0292\u0294\u0003\u0086C\u0000\u0293\u0291\u0001"+
		"\u0000\u0000\u0000\u0293\u0294\u0001\u0000\u0000\u0000\u0294\u02a1\u0001"+
		"\u0000\u0000\u0000\u0295\u0297\u0003\u0084B\u0000\u0296\u0298\u0005f\u0000"+
		"\u0000\u0297\u0296\u0001\u0000\u0000\u0000\u0297\u0298\u0001\u0000\u0000"+
		"\u0000\u0298\u0299\u0001\u0000\u0000\u0000\u0299\u029a\u0005p\u0000\u0000"+
		"\u029a\u029d\u0003\u0086C\u0000\u029b\u029c\u0005\u0105\u0000\u0000\u029c"+
		"\u029e\u0003\u0086C\u0000\u029d\u029b\u0001\u0000\u0000\u0000\u029d\u029e"+
		"\u0001\u0000\u0000\u0000\u029e\u02a1\u0001\u0000\u0000\u0000\u029f\u02a1"+
		"\u0003\u0084B\u0000\u02a0\u0272\u0001\u0000\u0000\u0000\u02a0\u0279\u0001"+
		"\u0000\u0000\u0000\u02a0\u0282\u0001\u0000\u0000\u0000\u02a0\u028b\u0001"+
		"\u0000\u0000\u0000\u02a0\u0295\u0001\u0000\u0000\u0000\u02a0\u029f\u0001"+
		"\u0000\u0000\u0000\u02a1\u0081\u0001\u0000\u0000\u0000\u02a2\u02a7\u0003"+
		"z=\u0000\u02a3\u02a4\u0005\"\u0000\u0000\u02a4\u02a6\u0003z=\u0000\u02a5"+
		"\u02a3\u0001\u0000\u0000\u0000\u02a6\u02a9\u0001\u0000\u0000\u0000\u02a7"+
		"\u02a5\u0001\u0000\u0000\u0000\u02a7\u02a8\u0001\u0000\u0000\u0000\u02a8"+
		"\u0083\u0001\u0000\u0000\u0000\u02a9\u02a7\u0001\u0000\u0000\u0000\u02aa"+
		"\u02ab\u0006B\uffff\uffff\u0000\u02ab\u02ac\u0003\u0086C\u0000\u02ac\u02cd"+
		"\u0001\u0000\u0000\u0000\u02ad\u02ae\n\u000b\u0000\u0000\u02ae\u02af\u0005"+
		"\u0005\u0000\u0000\u02af\u02cc\u0003\u0084B\f\u02b0\u02b1\n\n\u0000\u0000"+
		"\u02b1\u02b2\u0005\u0006\u0000\u0000\u02b2\u02cc\u0003\u0084B\u000b\u02b3"+
		"\u02b4\n\t\u0000\u0000\u02b4\u02b5\u0005\u0007\u0000\u0000\u02b5\u02cc"+
		"\u0003\u0084B\n\u02b6\u02b7\n\b\u0000\u0000\u02b7\u02b8\u0005\b\u0000"+
		"\u0000\u02b8\u02cc\u0003\u0084B\t\u02b9\u02ba\n\u0007\u0000\u0000\u02ba"+
		"\u02bb\u0005\f\u0000\u0000\u02bb\u02cc\u0003\u0084B\b\u02bc\u02bd\n\u0006"+
		"\u0000\u0000\u02bd\u02be\u0005\r\u0000\u0000\u02be\u02cc\u0003\u0084B"+
		"\u0007\u02bf\u02c0\n\u0005\u0000\u0000\u02c0\u02c1\u0005\u000e\u0000\u0000"+
		"\u02c1\u02cc\u0003\u0084B\u0006\u02c2\u02c3\n\u0004\u0000\u0000\u02c3"+
		"\u02c4\u0005\u000f\u0000\u0000\u02c4\u02cc\u0003\u0084B\u0005\u02c5\u02c6"+
		"\n\u0003\u0000\u0000\u02c6\u02c7\u0005\n\u0000\u0000\u02c7\u02cc\u0003"+
		"\u0084B\u0004\u02c8\u02c9\n\u0002\u0000\u0000\u02c9\u02ca\u0005\t\u0000"+
		"\u0000\u02ca\u02cc\u0003\u0084B\u0003\u02cb\u02ad\u0001\u0000\u0000\u0000"+
		"\u02cb\u02b0\u0001\u0000\u0000\u0000\u02cb\u02b3\u0001\u0000\u0000\u0000"+
		"\u02cb\u02b6\u0001\u0000\u0000\u0000\u02cb\u02b9\u0001\u0000\u0000\u0000"+
		"\u02cb\u02bc\u0001\u0000\u0000\u0000\u02cb\u02bf\u0001\u0000\u0000\u0000"+
		"\u02cb\u02c2\u0001\u0000\u0000\u0000\u02cb\u02c5\u0001\u0000\u0000\u0000"+
		"\u02cb\u02c8\u0001\u0000\u0000\u0000\u02cc\u02cf\u0001\u0000\u0000\u0000"+
		"\u02cd\u02cb\u0001\u0000\u0000\u0000\u02cd\u02ce\u0001\u0000\u0000\u0000"+
		"\u02ce\u0085\u0001\u0000\u0000\u0000\u02cf\u02cd\u0001\u0000\u0000\u0000"+
		"\u02d0\u02dc\u0003\u0090H\u0000\u02d1\u02dc\u0003\\.\u0000\u02d2\u02dc"+
		"\u0003^/\u0000\u02d3\u02dc\u0003t:\u0000\u02d4\u02dc\u0003X,\u0000\u02d5"+
		"\u02dc\u0003\u0088D\u0000\u02d6\u02dc\u0003\u008aE\u0000\u02d7\u02dc\u0003"+
		"\u008cF\u0000\u02d8\u02dc\u0003\u008eG\u0000\u02d9\u02dc\u0003\u00a8T"+
		"\u0000\u02da\u02dc\u0003\u00aeW\u0000\u02db\u02d0\u0001\u0000\u0000\u0000"+
		"\u02db\u02d1\u0001\u0000\u0000\u0000\u02db\u02d2\u0001\u0000\u0000\u0000"+
		"\u02db\u02d3\u0001\u0000\u0000\u0000\u02db\u02d4\u0001\u0000\u0000\u0000"+
		"\u02db\u02d5\u0001\u0000\u0000\u0000\u02db\u02d6\u0001\u0000\u0000\u0000"+
		"\u02db\u02d7\u0001\u0000\u0000\u0000\u02db\u02d8\u0001\u0000\u0000\u0000"+
		"\u02db\u02d9\u0001\u0000\u0000\u0000\u02db\u02da\u0001\u0000\u0000\u0000"+
		"\u02dc\u0087\u0001\u0000\u0000\u0000\u02dd\u02de\u0007\u0007\u0000\u0000"+
		"\u02de\u02df\u0003\u0086C\u0000\u02df\u0089\u0001\u0000\u0000\u0000\u02e0"+
		"\u02e1\u0005\u001c\u0000\u0000\u02e1\u02e2\u0003z=\u0000\u02e2\u02e3\u0005"+
		"\u001d\u0000\u0000\u02e3\u008b\u0001\u0000\u0000\u0000\u02e4\u02e5\u0005"+
		"\u001c\u0000\u0000\u02e5\u02e6\u0003\u0082A\u0000\u02e6\u02e7\u0005\u001d"+
		"\u0000\u0000\u02e7\u008d\u0001\u0000\u0000\u0000\u02e8\u02e9\u0005j\u0000"+
		"\u0000\u02e9\u02ea\u0003X,\u0000\u02ea\u008f\u0001\u0000\u0000\u0000\u02eb"+
		"\u02ef\u0003\u0092I\u0000\u02ec\u02ef\u0003\u009aM\u0000\u02ed\u02ef\u0003"+
		"\u009eO\u0000\u02ee\u02eb\u0001\u0000\u0000\u0000\u02ee\u02ec\u0001\u0000"+
		"\u0000\u0000\u02ee\u02ed\u0001\u0000\u0000\u0000\u02ef\u0091\u0001\u0000"+
		"\u0000\u0000\u02f0\u02f1\u0003\u0094J\u0000\u02f1\u02f3\u0005\u001c\u0000"+
		"\u0000\u02f2\u02f4\u0003\u0096K\u0000\u02f3\u02f2\u0001\u0000\u0000\u0000"+
		"\u02f3\u02f4\u0001\u0000\u0000\u0000\u02f4\u02f7\u0001\u0000\u0000\u0000"+
		"\u02f5\u02f8\u0003\u0098L\u0000\u02f6\u02f8\u0005\u000e\u0000\u0000\u02f7"+
		"\u02f5\u0001\u0000\u0000\u0000\u02f7\u02f6\u0001\u0000\u0000\u0000\u02f7"+
		"\u02f8\u0001\u0000\u0000\u0000\u02f8\u02f9\u0001\u0000\u0000\u0000\u02f9"+
		"\u02fa\u0005\u001d\u0000\u0000\u02fa\u0093\u0001\u0000\u0000\u0000\u02fb"+
		"\u02fc\u0007\b\u0000\u0000\u02fc\u0095\u0001\u0000\u0000\u0000\u02fd\u02fe"+
		"\u0005J\u0000\u0000\u02fe\u0097\u0001\u0000\u0000\u0000\u02ff\u0304\u0003"+
		"z=\u0000\u0300\u0301\u0005\"\u0000\u0000\u0301\u0303\u0003z=\u0000\u0302"+
		"\u0300\u0001\u0000\u0000\u0000\u0303\u0306\u0001\u0000\u0000\u0000\u0304"+
		"\u0302\u0001\u0000\u0000\u0000\u0304\u0305\u0001\u0000\u0000\u0000\u0305"+
		"\u0099\u0001\u0000\u0000\u0000\u0306\u0304\u0001\u0000\u0000\u0000\u0307"+
		"\u0308\u0003\u009cN\u0000\u0308\u009b\u0001\u0000\u0000\u0000\u0309\u030a"+
		"\u0005M\u0000\u0000\u030a\u030d\u0005\u001c\u0000\u0000\u030b\u030e\u0003"+
		"z=\u0000\u030c\u030e\u0005g\u0000\u0000\u030d\u030b\u0001\u0000\u0000"+
		"\u0000\u030d\u030c\u0001\u0000\u0000\u0000\u030e\u030f\u0001\u0000\u0000"+
		"\u0000\u030f\u0310\u0005\\\u0000\u0000\u0310\u0311\u0003\u00ba]\u0000"+
		"\u0311\u0312\u0005\u001d\u0000\u0000\u0312\u009d\u0001\u0000\u0000\u0000"+
		"\u0313\u0314\u0003\u00a0P\u0000\u0314\u0316\u0005\u001c\u0000\u0000\u0315"+
		"\u0317\u0003\u0098L\u0000\u0316\u0315\u0001\u0000\u0000\u0000\u0316\u0317"+
		"\u0001\u0000\u0000\u0000\u0317\u0318\u0001\u0000\u0000\u0000\u0318\u0319"+
		"\u0005\u001d\u0000\u0000\u0319\u009f\u0001\u0000\u0000\u0000\u031a\u0321"+
		"\u0003n7\u0000\u031b\u0321\u0005^\u0000\u0000\u031c\u0321\u0005\u00f7"+
		"\u0000\u0000\u031d\u0321\u0005\u0086\u0000\u0000\u031e\u0321\u0005\u0087"+
		"\u0000\u0000\u031f\u0321\u0005\u0082\u0000\u0000\u0320\u031a\u0001\u0000"+
		"\u0000\u0000\u0320\u031b\u0001\u0000\u0000\u0000\u0320\u031c\u0001\u0000"+
		"\u0000\u0000\u0320\u031d\u0001\u0000\u0000\u0000\u0320\u031e\u0001\u0000"+
		"\u0000\u0000\u0320\u031f\u0001\u0000\u0000\u0000\u0321\u00a1\u0001\u0000"+
		"\u0000\u0000\u0322\u0327\u0003\u00a4R\u0000\u0323\u0324\u0005\"\u0000"+
		"\u0000\u0324\u0326\u0003\u00a4R\u0000\u0325\u0323\u0001\u0000\u0000\u0000"+
		"\u0326\u0329\u0001\u0000\u0000\u0000\u0327\u0325\u0001\u0000\u0000\u0000"+
		"\u0327\u0328\u0001\u0000\u0000\u0000\u0328\u00a3\u0001\u0000\u0000\u0000"+
		"\u0329\u0327\u0001\u0000\u0000\u0000\u032a\u032b\u0005&\u0000\u0000\u032b"+
		"\u0331\u0003n7\u0000\u032c\u032e\u0005\u001c\u0000\u0000\u032d\u032f\u0003"+
		"\u00a6S\u0000\u032e\u032d\u0001\u0000\u0000\u0000\u032e\u032f\u0001\u0000"+
		"\u0000\u0000\u032f\u0330\u0001\u0000\u0000\u0000\u0330\u0332\u0005\u001d"+
		"\u0000\u0000\u0331\u032c\u0001\u0000\u0000\u0000\u0331\u0332\u0001\u0000"+
		"\u0000\u0000\u0332\u00a5\u0001\u0000\u0000\u0000\u0333\u0338\u0003^/\u0000"+
		"\u0334\u0335\u0005\"\u0000\u0000\u0335\u0337\u0003^/\u0000\u0336\u0334"+
		"\u0001\u0000\u0000\u0000\u0337\u033a\u0001\u0000\u0000\u0000\u0338\u0336"+
		"\u0001\u0000\u0000\u0000\u0338\u0339\u0001\u0000\u0000\u0000\u0339\u00a7"+
		"\u0001\u0000\u0000\u0000\u033a\u0338\u0001\u0000\u0000\u0000\u033b\u033d"+
		"\u0005K\u0000\u0000\u033c\u033e\u0003\u0086C\u0000\u033d\u033c\u0001\u0000"+
		"\u0000\u0000\u033d\u033e\u0001\u0000\u0000\u0000\u033e\u033f\u0001\u0000"+
		"\u0000\u0000\u033f\u0342\u0003\u00aaU\u0000\u0340\u0341\u0005_\u0000\u0000"+
		"\u0341\u0343\u0003z=\u0000\u0342\u0340\u0001\u0000\u0000\u0000\u0342\u0343"+
		"\u0001\u0000\u0000\u0000\u0343\u0344\u0001\u0000\u0000\u0000\u0344\u0345"+
		"\u0005\u0103\u0000\u0000\u0345\u00a9\u0001\u0000\u0000\u0000\u0346\u0348"+
		"\u0003\u00acV\u0000\u0347\u0346\u0001\u0000\u0000\u0000\u0348\u0349\u0001"+
		"\u0000\u0000\u0000\u0349\u0347\u0001\u0000\u0000\u0000\u0349\u034a\u0001"+
		"\u0000\u0000\u0000\u034a\u00ab\u0001\u0000\u0000\u0000\u034b\u034c\u0005"+
		"L\u0000\u0000\u034c\u034d\u0003z=\u0000\u034d\u034e\u0005`\u0000\u0000"+
		"\u034e\u034f\u0003z=\u0000\u034f\u00ad\u0001\u0000\u0000\u0000\u0350\u0351"+
		"\u0005\u0082\u0000\u0000\u0351\u0352\u0003z=\u0000\u0352\u0353\u0003\u00b0"+
		"X\u0000\u0353\u00af\u0001\u0000\u0000\u0000\u0354\u0355\u0007\t\u0000"+
		"\u0000\u0355\u00b1\u0001\u0000\u0000\u0000\u0356\u0357\u0005q\u0000\u0000"+
		"\u0357\u0358\u0005s\u0000\u0000\u0358\u0359\u0003\u00b4Z\u0000\u0359\u00b3"+
		"\u0001\u0000\u0000\u0000\u035a\u035f\u0003\u00b6[\u0000\u035b\u035c\u0005"+
		"\"\u0000\u0000\u035c\u035e\u0003\u00b6[\u0000\u035d\u035b\u0001\u0000"+
		"\u0000\u0000\u035e\u0361\u0001\u0000\u0000\u0000\u035f\u035d\u0001\u0000"+
		"\u0000\u0000\u035f\u0360\u0001\u0000\u0000\u0000\u0360\u00b5\u0001\u0000"+
		"\u0000\u0000\u0361\u035f\u0001\u0000\u0000\u0000\u0362\u0364\u0003z=\u0000"+
		"\u0363\u0365\u0007\n\u0000\u0000\u0364\u0363\u0001\u0000\u0000\u0000\u0364"+
		"\u0365\u0001\u0000\u0000\u0000\u0365\u00b7\u0001\u0000\u0000\u0000\u0366"+
		"\u0367\u0003z=\u0000\u0367\u00b9\u0001\u0000\u0000\u0000\u0368\u0370\u0003"+
		"\u00bc^\u0000\u0369\u036a\u0005\u001c\u0000\u0000\u036a\u036d\u0005\u0157"+
		"\u0000\u0000\u036b\u036c\u0005\"\u0000\u0000\u036c\u036e\u0005\u0157\u0000"+
		"\u0000\u036d\u036b\u0001\u0000\u0000\u0000\u036d\u036e\u0001\u0000\u0000"+
		"\u0000\u036e\u036f\u0001\u0000\u0000\u0000\u036f\u0371\u0005\u001d\u0000"+
		"\u0000\u0370\u0369\u0001\u0000\u0000\u0000\u0370\u0371\u0001\u0000\u0000"+
		"\u0000\u0371\u0373\u0001\u0000\u0000\u0000\u0372\u0374\u0003\u00be_\u0000"+
		"\u0373\u0372\u0001\u0000\u0000\u0000\u0373\u0374\u0001\u0000\u0000\u0000"+
		"\u0374\u0376\u0001\u0000\u0000\u0000\u0375\u0377\u0003\u00c0`\u0000\u0376"+
		"\u0375\u0001\u0000\u0000\u0000\u0376\u0377\u0001\u0000\u0000\u0000\u0377"+
		"\u00bb\u0001\u0000\u0000\u0000\u0378\u03a2\u0005\u0080\u0000\u0000\u0379"+
		"\u037a\u0005\u0080\u0000\u0000\u037a\u03a2\u0005\u0150\u0000\u0000\u037b"+
		"\u037c\u0005\u0122\u0000\u0000\u037c\u03a2\u0005\u0080\u0000\u0000\u037d"+
		"\u037e\u0005\u0122\u0000\u0000\u037e\u037f\u0005\u0080\u0000\u0000\u037f"+
		"\u03a2\u0005\u0150\u0000\u0000\u0380\u03a2\u0005\u007f\u0000\u0000\u0381"+
		"\u03a2\u0005\u00ad\u0000\u0000\u0382\u03a2\u0005\u0123\u0000\u0000\u0383"+
		"\u0384\u0005\u0122\u0000\u0000\u0384\u03a2\u0005\u007f\u0000\u0000\u0385"+
		"\u0386\u0005\u0122\u0000\u0000\u0386\u0387\u0005\u007f\u0000\u0000\u0387"+
		"\u03a2\u0005\u0150\u0000\u0000\u0388\u03a2\u0005\u00e5\u0000\u0000\u0389"+
		"\u038a\u0005\u00e5\u0000\u0000\u038a\u03a2\u0005\u0150\u0000\u0000\u038b"+
		"\u03a2\u0005\u0126\u0000\u0000\u038c\u03a2\u0005\u00ab\u0000\u0000\u038d"+
		"\u03a2\u0005\u00fa\u0000\u0000\u038e\u03a2\u0005\u00a9\u0000\u0000\u038f"+
		"\u03a2\u0005\u013d\u0000\u0000\u0390\u03a2\u0005\u00ae\u0000\u0000\u0391"+
		"\u03a2\u0005\u00aa\u0000\u0000\u0392\u0393\u0005~\u0000\u0000\u0393\u03a2"+
		"\u0005A\u0000\u0000\u0394\u03a2\u0005\u0083\u0000\u0000\u0395\u03a2\u0005"+
		"\u0084\u0000\u0000\u0396\u03a2\u0005\u0085\u0000\u0000\u0397\u03a2\u0005"+
		"\u0082\u0000\u0000\u0398\u0399\u0005\u0084\u0000\u0000\u0399\u039a\u0005"+
		"H\u0000\u0000\u039a\u039b\u0005\u0084\u0000\u0000\u039b\u03a2\u0005\u0154"+
		"\u0000\u0000\u039c\u039d\u0005\u0085\u0000\u0000\u039d\u039e\u0005H\u0000"+
		"\u0000\u039e\u039f\u0005\u0084\u0000\u0000\u039f\u03a2\u0005\u0154\u0000"+
		"\u0000\u03a0\u03a2\u0003n7\u0000\u03a1\u0378\u0001\u0000\u0000\u0000\u03a1"+
		"\u0379\u0001\u0000\u0000\u0000\u03a1\u037b\u0001\u0000\u0000\u0000\u03a1"+
		"\u037d\u0001\u0000\u0000\u0000\u03a1\u0380\u0001\u0000\u0000\u0000\u03a1"+
		"\u0381\u0001\u0000\u0000\u0000\u03a1\u0382\u0001\u0000\u0000\u0000\u03a1"+
		"\u0383\u0001\u0000\u0000\u0000\u03a1\u0385\u0001\u0000\u0000\u0000\u03a1"+
		"\u0388\u0001\u0000\u0000\u0000\u03a1\u0389\u0001\u0000\u0000\u0000\u03a1"+
		"\u038b\u0001\u0000\u0000\u0000\u03a1\u038c\u0001\u0000\u0000\u0000\u03a1"+
		"\u038d\u0001\u0000\u0000\u0000\u03a1\u038e\u0001\u0000\u0000\u0000\u03a1"+
		"\u038f\u0001\u0000\u0000\u0000\u03a1\u0390\u0001\u0000\u0000\u0000\u03a1"+
		"\u0391\u0001\u0000\u0000\u0000\u03a1\u0392\u0001\u0000\u0000\u0000\u03a1"+
		"\u0394\u0001\u0000\u0000\u0000\u03a1\u0395\u0001\u0000\u0000\u0000\u03a1"+
		"\u0396\u0001\u0000\u0000\u0000\u03a1\u0397\u0001\u0000\u0000\u0000\u03a1"+
		"\u0398\u0001\u0000\u0000\u0000\u03a1\u039c\u0001\u0000\u0000\u0000\u03a1"+
		"\u03a0\u0001\u0000\u0000\u0000\u03a2\u00bd\u0001\u0000\u0000\u0000\u03a3"+
		"\u03a4\u0007\u000b\u0000\u0000\u03a4\u03a6\u00057\u0000\u0000\u03a5\u03a7"+
		"\u0005\u0015\u0000\u0000\u03a6\u03a5\u0001\u0000\u0000\u0000\u03a6\u03a7"+
		"\u0001\u0000\u0000\u0000\u03a7\u03a8\u0001\u0000\u0000\u0000\u03a8\u03a9"+
		"\u0005\u015a\u0000\u0000\u03a9\u00bf\u0001\u0000\u0000\u0000\u03aa\u03ac"+
		"\u0005\u00ee\u0000\u0000\u03ab\u03ad\u0005\u0015\u0000\u0000\u03ac\u03ab"+
		"\u0001\u0000\u0000\u0000\u03ac\u03ad\u0001\u0000\u0000\u0000\u03ad\u03ae"+
		"\u0001\u0000\u0000\u0000\u03ae\u03af\u0005\u0156\u0000\u0000\u03af\u00c1"+
		"\u0001\u0000\u0000\u0000i\u00c9\u00cd\u00d1\u00d8\u00dc\u00e3\u00ed\u00f0"+
		"\u00f5\u00f8\u00fc\u0104\u0114\u011a\u0120\u0123\u0126\u0129\u013a\u0143"+
		"\u0147\u014e\u0153\u0156\u015a\u015e\u0161\u0164\u0167\u016a\u016d\u0170"+
		"\u0173\u017a\u017f\u0183\u0186\u0189\u0192\u0196\u019f\u01a5\u01ac\u01b0"+
		"\u01b5\u01b8\u01bb\u01be\u01c4\u01cc\u01d0\u01d3\u01dc\u01e2\u01f2\u01fc"+
		"\u0200\u0204\u0216\u0229\u0230\u0237\u023e\u0245\u024c\u0254\u0256\u025f"+
		"\u026b\u026d\u0274\u027b\u0284\u028d\u0293\u0297\u029d\u02a0\u02a7\u02cb"+
		"\u02cd\u02db\u02ee\u02f3\u02f7\u0304\u030d\u0316\u0320\u0327\u032e\u0331"+
		"\u0338\u033d\u0342\u0349\u035f\u0364\u036d\u0370\u0373\u0376\u03a1\u03a6"+
		"\u03ac";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
// resume CPD analysis - CPD-ON