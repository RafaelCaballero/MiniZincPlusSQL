// Generated from MiniZincGrammar.g4 by ANTLR 4.5.1
package antlr4;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MiniZincGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		T__52=53, T__53=54, T__54=55, T__55=56, T__56=57, T__57=58, T__58=59, 
		T__59=60, T__60=61, T__61=62, T__62=63, T__63=64, T__64=65, T__65=66, 
		T__66=67, T__67=68, T__68=69, T__69=70, T__70=71, T__71=72, T__72=73, 
		T__73=74, T__74=75, T__75=76, T__76=77, T__77=78, T__78=79, T__79=80, 
		T__80=81, T__81=82, T__82=83, T__83=84, STRING=85, ESC=86, SINGLE_LINE_COMMENT=87, 
		ID=88, NAT=89, WS=90, BOOL=91;
	public static final int
		RULE_model = 0, RULE_stat = 1, RULE_decl = 2, RULE_vardecl = 3, RULE_pardecl = 4, 
		RULE_table = 5, RULE_constraint = 6, RULE_var = 7, RULE_output = 8, RULE_solve = 9, 
		RULE_parameter = 10, RULE_include = 11, RULE_init = 12, RULE_predicate = 13, 
		RULE_function = 14, RULE_qualName = 15, RULE_varmark = 16, RULE_extendsmark = 17, 
		RULE_opOrID = 18, RULE_satisfy = 19, RULE_optimize = 20, RULE_maximize = 21, 
		RULE_minimize = 22, RULE_annotation = 23, RULE_modeAnnotation = 24, RULE_intS = 25, 
		RULE_boolS = 26, RULE_setS = 27, RULE_seqS = 28, RULE_restS = 29, RULE_varchoice = 30, 
		RULE_constrainchoice = 31, RULE_constr = 32, RULE_scons = 33, RULE_tcons = 34, 
		RULE_typename = 35, RULE_typeset = 36, RULE_vararray = 37, RULE_pararray = 38, 
		RULE_dimensions = 39, RULE_typedata = 40, RULE_expr = 41, RULE_boolVal = 42, 
		RULE_op = 43, RULE_boolOp = 44, RULE_arithOp = 45, RULE_arithOp2 = 46, 
		RULE_qualBoolOp = 47, RULE_qualArithOp = 48, RULE_boolComplexExpr = 49, 
		RULE_boolExpr = 50, RULE_operand = 51, RULE_qualified = 52, RULE_arithComplexExpr = 53, 
		RULE_arithExpr = 54, RULE_notExpr = 55, RULE_minusExpr = 56, RULE_predOrUnionExpr = 57, 
		RULE_onesection = 58, RULE_twosections = 59, RULE_rbracketExpr = 60, RULE_idexpr = 61, 
		RULE_stringExpr = 62, RULE_infixOp = 63, RULE_infixSetOp = 64, RULE_arrayaccess = 65, 
		RULE_caseExpr = 66, RULE_caseBranch = 67, RULE_listExpr = 68, RULE_oneDimList = 69, 
		RULE_simpleList = 70, RULE_simpleNonEmptyList = 71, RULE_guardedList = 72, 
		RULE_multiDimList = 73, RULE_nonEmptyListElems = 74, RULE_listValue = 75, 
		RULE_inDecl = 76, RULE_whereCond = 77, RULE_letExpr = 78, RULE_letDecl = 79, 
		RULE_ifExpr = 80, RULE_bodyIf = 81, RULE_elseS = 82, RULE_elseifS = 83, 
		RULE_setVal = 84, RULE_setExpr = 85, RULE_bracketExpr = 86, RULE_guardedSet = 87, 
		RULE_commaList = 88, RULE_guard = 89, RULE_range = 90, RULE_fromR = 91, 
		RULE_toR = 92, RULE_rint = 93, RULE_rfloat = 94, RULE_rbool = 95, RULE_integer = 96, 
		RULE_real = 97, RULE_string = 98;
	public static final String[] ruleNames = {
		"model", "stat", "decl", "vardecl", "pardecl", "table", "constraint", 
		"var", "output", "solve", "parameter", "include", "init", "predicate", 
		"function", "qualName", "varmark", "extendsmark", "opOrID", "satisfy", 
		"optimize", "maximize", "minimize", "annotation", "modeAnnotation", "intS", 
		"boolS", "setS", "seqS", "restS", "varchoice", "constrainchoice", "constr", 
		"scons", "tcons", "typename", "typeset", "vararray", "pararray", "dimensions", 
		"typedata", "expr", "boolVal", "op", "boolOp", "arithOp", "arithOp2", 
		"qualBoolOp", "qualArithOp", "boolComplexExpr", "boolExpr", "operand", 
		"qualified", "arithComplexExpr", "arithExpr", "notExpr", "minusExpr", 
		"predOrUnionExpr", "onesection", "twosections", "rbracketExpr", "idexpr", 
		"stringExpr", "infixOp", "infixSetOp", "arrayaccess", "caseExpr", "caseBranch", 
		"listExpr", "oneDimList", "simpleList", "simpleNonEmptyList", "guardedList", 
		"multiDimList", "nonEmptyListElems", "listValue", "inDecl", "whereCond", 
		"letExpr", "letDecl", "ifExpr", "bodyIf", "elseS", "elseifS", "setVal", 
		"setExpr", "bracketExpr", "guardedSet", "commaList", "guard", "range", 
		"fromR", "toR", "rint", "rfloat", "rbool", "integer", "real", "string"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'='", "'table'", "'constraint'", "':'", "'output'", "'('", 
		"')'", "'solve'", "'par'", "'include'", "'predicate'", "','", "'function'", 
		"'var'", "'extends'", "'satisfy'", "'maximize'", "'minimize'", "'::'", 
		"'int_search'", "'bool_search'", "'set_search'", "'seq_search'", "'['", 
		"']'", "'complete'", "'input_order'", "'first_fail'", "'smallest'", "'indomain'", 
		"'indomain_min'", "'indomain_median'", "'indomain_random'", "'indomain_split'", 
		"'set'", "'of'", "'array'", "'int'", "'_'", "'/\\'", "'\\/'", "'xor'", 
		"'->'", "'<-'", "'<->'", "'=='", "'!='", "'<'", "'>'", "'>='", "'<='", 
		"'in'", "'like'", "'*'", "'/'", "'div'", "'mod'", "'+'", "'-'", "'.'", 
		"'not'", "'`'", "'intersect'", "'union'", "'case'", "'endcase'", "'-->'", 
		"'++'", "'|'", "'[|'", "'|]'", "'where'", "'let'", "'{'", "'}'", "'if'", 
		"'then'", "'else'", "'endif'", "'elseif'", "'..'", "'float'", "'bool'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, "STRING", "ESC", "SINGLE_LINE_COMMENT", "ID", "NAT", "WS", "BOOL"
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
	public String getGrammarFileName() { return "MiniZincGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MiniZincGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ModelContext extends ParserRuleContext {
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public ModelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_model; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterModel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitModel(this);
		}
	}

	public final ModelContext model() throws RecognitionException {
		ModelContext _localctx = new ModelContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_model);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(198);
				stat();
				setState(199);
				match(T__0);
				}
				}
				setState(203); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__5) | (1L << T__6) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__13) | (1L << T__14) | (1L << T__24) | (1L << T__35) | (1L << T__37) | (1L << T__38) | (1L << T__59))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (T__73 - 74)) | (1L << (T__76 - 74)) | (1L << (T__82 - 74)) | (1L << (T__83 - 74)) | (1L << (STRING - 74)) | (1L << (ID - 74)) | (1L << (NAT - 74)))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatContext extends ParserRuleContext {
		public TableContext table() {
			return getRuleContext(TableContext.class,0);
		}
		public ConstraintContext constraint() {
			return getRuleContext(ConstraintContext.class,0);
		}
		public DeclContext decl() {
			return getRuleContext(DeclContext.class,0);
		}
		public SolveContext solve() {
			return getRuleContext(SolveContext.class,0);
		}
		public OutputContext output() {
			return getRuleContext(OutputContext.class,0);
		}
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public IncludeContext include() {
			return getRuleContext(IncludeContext.class,0);
		}
		public InitContext init() {
			return getRuleContext(InitContext.class,0);
		}
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitStat(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stat);
		try {
			setState(214);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(205);
				table();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(206);
				constraint();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(207);
				decl();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(208);
				solve();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(209);
				output();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(210);
				predicate();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(211);
				function();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(212);
				include();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(213);
				init();
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

	public static class DeclContext extends ParserRuleContext {
		public VardeclContext vardecl() {
			return getRuleContext(VardeclContext.class,0);
		}
		public PardeclContext pardecl() {
			return getRuleContext(PardeclContext.class,0);
		}
		public DeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitDecl(this);
		}
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_decl);
		try {
			setState(218);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(216);
				vardecl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(217);
				pardecl();
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

	public static class VardeclContext extends ParserRuleContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public VararrayContext vararray() {
			return getRuleContext(VararrayContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public VardeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vardecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterVardecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitVardecl(this);
		}
	}

	public final VardeclContext vardecl() throws RecognitionException {
		VardeclContext _localctx = new VardeclContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_vardecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			switch (_input.LA(1)) {
			case T__14:
				{
				setState(220);
				var();
				}
				break;
			case T__37:
				{
				setState(221);
				vararray();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(226);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(224);
				match(T__1);
				setState(225);
				expr(0);
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

	public static class PardeclContext extends ParserRuleContext {
		public ParameterContext parameter() {
			return getRuleContext(ParameterContext.class,0);
		}
		public PararrayContext pararray() {
			return getRuleContext(PararrayContext.class,0);
		}
		public PardeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pardecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterPardecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitPardecl(this);
		}
	}

	public final PardeclContext pardecl() throws RecognitionException {
		PardeclContext _localctx = new PardeclContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_pardecl);
		try {
			setState(230);
			switch (_input.LA(1)) {
			case T__6:
			case T__9:
			case T__24:
			case T__35:
			case T__38:
			case T__59:
			case T__73:
			case T__76:
			case T__82:
			case T__83:
			case STRING:
			case ID:
			case NAT:
				enterOuterAlt(_localctx, 1);
				{
				setState(228);
				parameter();
				}
				break;
			case T__37:
				enterOuterAlt(_localctx, 2);
				{
				setState(229);
				pararray();
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

	public static class TableContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MiniZincGrammarParser.ID, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public TableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitTable(this);
		}
	}

	public final TableContext table() throws RecognitionException {
		TableContext _localctx = new TableContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_table);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			match(T__2);
			setState(233);
			match(ID);
			setState(234);
			match(T__1);
			setState(235);
			string();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstraintContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterConstraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitConstraint(this);
		}
	}

	public final ConstraintContext constraint() throws RecognitionException {
		ConstraintContext _localctx = new ConstraintContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_constraint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			match(T__3);
			setState(238);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarContext extends ParserRuleContext {
		public VarmarkContext varmark() {
			return getRuleContext(VarmarkContext.class,0);
		}
		public TypenameContext typename() {
			return getRuleContext(TypenameContext.class,0);
		}
		public TerminalNode ID() { return getToken(MiniZincGrammarParser.ID, 0); }
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitVar(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			varmark();
			setState(241);
			typename();
			setState(242);
			match(T__4);
			setState(243);
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

	public static class OutputContext extends ParserRuleContext {
		public ListExprContext listExpr() {
			return getRuleContext(ListExprContext.class,0);
		}
		public OutputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_output; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterOutput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitOutput(this);
		}
	}

	public final OutputContext output() throws RecognitionException {
		OutputContext _localctx = new OutputContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_output);
		try {
			setState(252);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(245);
				match(T__5);
				setState(246);
				match(T__6);
				setState(247);
				listExpr(0);
				setState(248);
				match(T__7);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(250);
				match(T__5);
				setState(251);
				listExpr(0);
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

	public static class SolveContext extends ParserRuleContext {
		public SatisfyContext satisfy() {
			return getRuleContext(SatisfyContext.class,0);
		}
		public OptimizeContext optimize() {
			return getRuleContext(OptimizeContext.class,0);
		}
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public SolveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_solve; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterSolve(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitSolve(this);
		}
	}

	public final SolveContext solve() throws RecognitionException {
		SolveContext _localctx = new SolveContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_solve);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			match(T__8);
			setState(256);
			_la = _input.LA(1);
			if (_la==T__19) {
				{
				setState(255);
				annotation();
				}
			}

			setState(260);
			switch (_input.LA(1)) {
			case T__16:
				{
				setState(258);
				satisfy();
				}
				break;
			case T__17:
			case T__18:
				{
				setState(259);
				optimize();
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

	public static class ParameterContext extends ParserRuleContext {
		public TypenameContext typename() {
			return getRuleContext(TypenameContext.class,0);
		}
		public TerminalNode ID() { return getToken(MiniZincGrammarParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitParameter(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_parameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(262);
				match(T__9);
				}
			}

			setState(265);
			typename();
			setState(266);
			match(T__4);
			setState(267);
			match(ID);
			setState(270);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(268);
				match(T__1);
				setState(269);
				expr(0);
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

	public static class IncludeContext extends ParserRuleContext {
		public StringExprContext stringExpr() {
			return getRuleContext(StringExprContext.class,0);
		}
		public IncludeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_include; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterInclude(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitInclude(this);
		}
	}

	public final IncludeContext include() throws RecognitionException {
		IncludeContext _localctx = new IncludeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_include);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			match(T__10);
			setState(273);
			stringExpr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MiniZincGrammarParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public InitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitInit(this);
		}
	}

	public final InitContext init() throws RecognitionException {
		InitContext _localctx = new InitContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_init);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			match(ID);
			setState(276);
			match(T__1);
			setState(277);
			expr(0);
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode ID() { return getToken(MiniZincGrammarParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<DeclContext> decl() {
			return getRuleContexts(DeclContext.class);
		}
		public DeclContext decl(int i) {
			return getRuleContext(DeclContext.class,i);
		}
		public PredicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitPredicate(this);
		}
	}

	public final PredicateContext predicate() throws RecognitionException {
		PredicateContext _localctx = new PredicateContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_predicate);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			match(T__11);
			setState(280);
			match(ID);
			setState(281);
			match(T__6);
			setState(290);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__9) | (1L << T__14) | (1L << T__24) | (1L << T__35) | (1L << T__37) | (1L << T__38) | (1L << T__59))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (T__73 - 74)) | (1L << (T__76 - 74)) | (1L << (T__82 - 74)) | (1L << (T__83 - 74)) | (1L << (STRING - 74)) | (1L << (ID - 74)) | (1L << (NAT - 74)))) != 0)) {
				{
				setState(282);
				decl();
				setState(287);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__12) {
					{
					{
					setState(283);
					match(T__12);
					setState(284);
					decl();
					}
					}
					setState(289);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(292);
			match(T__7);
			setState(293);
			match(T__1);
			setState(294);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionContext extends ParserRuleContext {
		public QualNameContext qualName() {
			return getRuleContext(QualNameContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public VarmarkContext varmark() {
			return getRuleContext(VarmarkContext.class,0);
		}
		public List<DeclContext> decl() {
			return getRuleContexts(DeclContext.class);
		}
		public DeclContext decl(int i) {
			return getRuleContext(DeclContext.class,i);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitFunction(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			match(T__13);
			setState(298);
			_la = _input.LA(1);
			if (_la==T__14) {
				{
				setState(297);
				varmark();
				}
			}

			setState(300);
			qualName();
			setState(301);
			match(T__6);
			setState(310);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__9) | (1L << T__14) | (1L << T__24) | (1L << T__35) | (1L << T__37) | (1L << T__38) | (1L << T__59))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (T__73 - 74)) | (1L << (T__76 - 74)) | (1L << (T__82 - 74)) | (1L << (T__83 - 74)) | (1L << (STRING - 74)) | (1L << (ID - 74)) | (1L << (NAT - 74)))) != 0)) {
				{
				setState(302);
				decl();
				setState(307);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__12) {
					{
					{
					setState(303);
					match(T__12);
					setState(304);
					decl();
					}
					}
					setState(309);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(312);
			match(T__7);
			setState(313);
			match(T__1);
			setState(314);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QualNameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MiniZincGrammarParser.ID, 0); }
		public List<OpOrIDContext> opOrID() {
			return getRuleContexts(OpOrIDContext.class);
		}
		public OpOrIDContext opOrID(int i) {
			return getRuleContext(OpOrIDContext.class,i);
		}
		public ExtendsmarkContext extendsmark() {
			return getRuleContext(ExtendsmarkContext.class,0);
		}
		public QualNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterQualName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitQualName(this);
		}
	}

	public final QualNameContext qualName() throws RecognitionException {
		QualNameContext _localctx = new QualNameContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_qualName);
		try {
			setState(324);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(316);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(317);
				match(ID);
				setState(318);
				match(T__4);
				setState(319);
				opOrID();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(320);
				opOrID();
				setState(321);
				extendsmark();
				setState(322);
				opOrID();
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

	public static class VarmarkContext extends ParserRuleContext {
		public VarmarkContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varmark; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterVarmark(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitVarmark(this);
		}
	}

	public final VarmarkContext varmark() throws RecognitionException {
		VarmarkContext _localctx = new VarmarkContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_varmark);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(326);
			match(T__14);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExtendsmarkContext extends ParserRuleContext {
		public ExtendsmarkContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extendsmark; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterExtendsmark(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitExtendsmark(this);
		}
	}

	public final ExtendsmarkContext extendsmark() throws RecognitionException {
		ExtendsmarkContext _localctx = new ExtendsmarkContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_extendsmark);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
			match(T__15);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OpOrIDContext extends ParserRuleContext {
		public OpContext op() {
			return getRuleContext(OpContext.class,0);
		}
		public TerminalNode ID() { return getToken(MiniZincGrammarParser.ID, 0); }
		public OpOrIDContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opOrID; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterOpOrID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitOpOrID(this);
		}
	}

	public final OpOrIDContext opOrID() throws RecognitionException {
		OpOrIDContext _localctx = new OpOrIDContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_opOrID);
		try {
			setState(332);
			switch (_input.LA(1)) {
			case T__1:
			case T__40:
			case T__41:
			case T__42:
			case T__43:
			case T__44:
			case T__45:
			case T__46:
			case T__47:
			case T__48:
			case T__49:
			case T__50:
			case T__51:
			case T__52:
			case T__53:
				enterOuterAlt(_localctx, 1);
				{
				setState(330);
				op();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(331);
				match(ID);
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

	public static class SatisfyContext extends ParserRuleContext {
		public SatisfyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_satisfy; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterSatisfy(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitSatisfy(this);
		}
	}

	public final SatisfyContext satisfy() throws RecognitionException {
		SatisfyContext _localctx = new SatisfyContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_satisfy);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(334);
			match(T__16);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OptimizeContext extends ParserRuleContext {
		public MaximizeContext maximize() {
			return getRuleContext(MaximizeContext.class,0);
		}
		public MinimizeContext minimize() {
			return getRuleContext(MinimizeContext.class,0);
		}
		public OptimizeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optimize; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterOptimize(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitOptimize(this);
		}
	}

	public final OptimizeContext optimize() throws RecognitionException {
		OptimizeContext _localctx = new OptimizeContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_optimize);
		try {
			setState(338);
			switch (_input.LA(1)) {
			case T__17:
				enterOuterAlt(_localctx, 1);
				{
				setState(336);
				maximize();
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 2);
				{
				setState(337);
				minimize();
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

	public static class MaximizeContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public MaximizeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_maximize; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterMaximize(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitMaximize(this);
		}
	}

	public final MaximizeContext maximize() throws RecognitionException {
		MaximizeContext _localctx = new MaximizeContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_maximize);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
			match(T__17);
			setState(341);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MinimizeContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public MinimizeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_minimize; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterMinimize(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitMinimize(this);
		}
	}

	public final MinimizeContext minimize() throws RecognitionException {
		MinimizeContext _localctx = new MinimizeContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_minimize);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
			match(T__18);
			setState(344);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationContext extends ParserRuleContext {
		public ModeAnnotationContext modeAnnotation() {
			return getRuleContext(ModeAnnotationContext.class,0);
		}
		public AnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitAnnotation(this);
		}
	}

	public final AnnotationContext annotation() throws RecognitionException {
		AnnotationContext _localctx = new AnnotationContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_annotation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(346);
			match(T__19);
			setState(347);
			modeAnnotation();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModeAnnotationContext extends ParserRuleContext {
		public IntSContext intS() {
			return getRuleContext(IntSContext.class,0);
		}
		public BoolSContext boolS() {
			return getRuleContext(BoolSContext.class,0);
		}
		public SetSContext setS() {
			return getRuleContext(SetSContext.class,0);
		}
		public SeqSContext seqS() {
			return getRuleContext(SeqSContext.class,0);
		}
		public ModeAnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modeAnnotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterModeAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitModeAnnotation(this);
		}
	}

	public final ModeAnnotationContext modeAnnotation() throws RecognitionException {
		ModeAnnotationContext _localctx = new ModeAnnotationContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_modeAnnotation);
		try {
			setState(353);
			switch (_input.LA(1)) {
			case T__20:
				enterOuterAlt(_localctx, 1);
				{
				setState(349);
				intS();
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 2);
				{
				setState(350);
				boolS();
				}
				break;
			case T__22:
				enterOuterAlt(_localctx, 3);
				{
				setState(351);
				setS();
				}
				break;
			case T__23:
				enterOuterAlt(_localctx, 4);
				{
				setState(352);
				seqS();
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

	public static class IntSContext extends ParserRuleContext {
		public RestSContext restS() {
			return getRuleContext(RestSContext.class,0);
		}
		public IntSContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intS; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterIntS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitIntS(this);
		}
	}

	public final IntSContext intS() throws RecognitionException {
		IntSContext _localctx = new IntSContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_intS);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(355);
			match(T__20);
			setState(356);
			restS();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BoolSContext extends ParserRuleContext {
		public RestSContext restS() {
			return getRuleContext(RestSContext.class,0);
		}
		public BoolSContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolS; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterBoolS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitBoolS(this);
		}
	}

	public final BoolSContext boolS() throws RecognitionException {
		BoolSContext _localctx = new BoolSContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_boolS);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(358);
			match(T__21);
			setState(359);
			restS();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SetSContext extends ParserRuleContext {
		public RestSContext restS() {
			return getRuleContext(RestSContext.class,0);
		}
		public SetSContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setS; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterSetS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitSetS(this);
		}
	}

	public final SetSContext setS() throws RecognitionException {
		SetSContext _localctx = new SetSContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_setS);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(361);
			match(T__22);
			setState(362);
			restS();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SeqSContext extends ParserRuleContext {
		public List<ModeAnnotationContext> modeAnnotation() {
			return getRuleContexts(ModeAnnotationContext.class);
		}
		public ModeAnnotationContext modeAnnotation(int i) {
			return getRuleContext(ModeAnnotationContext.class,i);
		}
		public SeqSContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_seqS; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterSeqS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitSeqS(this);
		}
	}

	public final SeqSContext seqS() throws RecognitionException {
		SeqSContext _localctx = new SeqSContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_seqS);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(364);
			match(T__23);
			setState(366);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(365);
				match(T__6);
				}
			}

			setState(368);
			match(T__24);
			setState(369);
			modeAnnotation();
			setState(374);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__12) {
				{
				{
				setState(370);
				match(T__12);
				setState(371);
				modeAnnotation();
				}
				}
				setState(376);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(377);
			match(T__25);
			setState(379);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(378);
				match(T__7);
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

	public static class RestSContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public VarchoiceContext varchoice() {
			return getRuleContext(VarchoiceContext.class,0);
		}
		public ConstrainchoiceContext constrainchoice() {
			return getRuleContext(ConstrainchoiceContext.class,0);
		}
		public RestSContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_restS; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterRestS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitRestS(this);
		}
	}

	public final RestSContext restS() throws RecognitionException {
		RestSContext _localctx = new RestSContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_restS);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(381);
			match(T__6);
			setState(382);
			expr(0);
			setState(383);
			match(T__12);
			setState(384);
			varchoice();
			setState(385);
			match(T__12);
			setState(386);
			constrainchoice();
			setState(387);
			match(T__12);
			setState(388);
			match(T__26);
			setState(389);
			match(T__7);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarchoiceContext extends ParserRuleContext {
		public VarchoiceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varchoice; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterVarchoice(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitVarchoice(this);
		}
	}

	public final VarchoiceContext varchoice() throws RecognitionException {
		VarchoiceContext _localctx = new VarchoiceContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_varchoice);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(391);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__27) | (1L << T__28) | (1L << T__29))) != 0)) ) {
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

	public static class ConstrainchoiceContext extends ParserRuleContext {
		public ConstrainchoiceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constrainchoice; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterConstrainchoice(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitConstrainchoice(this);
		}
	}

	public final ConstrainchoiceContext constrainchoice() throws RecognitionException {
		ConstrainchoiceContext _localctx = new ConstrainchoiceContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_constrainchoice);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(393);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34))) != 0)) ) {
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

	public static class ConstrContext extends ParserRuleContext {
		public SconsContext scons() {
			return getRuleContext(SconsContext.class,0);
		}
		public TconsContext tcons() {
			return getRuleContext(TconsContext.class,0);
		}
		public ConstrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterConstr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitConstr(this);
		}
	}

	public final ConstrContext constr() throws RecognitionException {
		ConstrContext _localctx = new ConstrContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_constr);
		try {
			setState(397);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(395);
				scons();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(396);
				tcons();
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

	public static class SconsContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MiniZincGrammarParser.ID, 0); }
		public SconsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scons; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterScons(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitScons(this);
		}
	}

	public final SconsContext scons() throws RecognitionException {
		SconsContext _localctx = new SconsContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_scons);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(399);
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

	public static class TconsContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MiniZincGrammarParser.ID, 0); }
		public List<TypenameContext> typename() {
			return getRuleContexts(TypenameContext.class);
		}
		public TypenameContext typename(int i) {
			return getRuleContext(TypenameContext.class,i);
		}
		public TconsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tcons; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterTcons(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitTcons(this);
		}
	}

	public final TconsContext tcons() throws RecognitionException {
		TconsContext _localctx = new TconsContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_tcons);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(401);
			match(ID);
			setState(402);
			match(T__6);
			setState(403);
			typename();
			setState(408);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__12) {
				{
				{
				setState(404);
				match(T__12);
				setState(405);
				typename();
				}
				}
				setState(410);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(411);
			match(T__7);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypenameContext extends ParserRuleContext {
		public RintContext rint() {
			return getRuleContext(RintContext.class,0);
		}
		public RboolContext rbool() {
			return getRuleContext(RboolContext.class,0);
		}
		public RfloatContext rfloat() {
			return getRuleContext(RfloatContext.class,0);
		}
		public TerminalNode ID() { return getToken(MiniZincGrammarParser.ID, 0); }
		public TypedataContext typedata() {
			return getRuleContext(TypedataContext.class,0);
		}
		public RangeContext range() {
			return getRuleContext(RangeContext.class,0);
		}
		public TypesetContext typeset() {
			return getRuleContext(TypesetContext.class,0);
		}
		public TypenameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typename; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterTypename(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitTypename(this);
		}
	}

	public final TypenameContext typename() throws RecognitionException {
		TypenameContext _localctx = new TypenameContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_typename);
		try {
			setState(420);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(413);
				rint();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(414);
				rbool();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(415);
				rfloat();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(416);
				match(ID);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(417);
				typedata();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(418);
				range();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(419);
				typeset();
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

	public static class TypesetContext extends ParserRuleContext {
		public TypenameContext typename() {
			return getRuleContext(TypenameContext.class,0);
		}
		public TypesetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeset; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterTypeset(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitTypeset(this);
		}
	}

	public final TypesetContext typeset() throws RecognitionException {
		TypesetContext _localctx = new TypesetContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_typeset);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(422);
			match(T__35);
			setState(423);
			match(T__36);
			setState(424);
			typename();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VararrayContext extends ParserRuleContext {
		public DimensionsContext dimensions() {
			return getRuleContext(DimensionsContext.class,0);
		}
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public VararrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vararray; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterVararray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitVararray(this);
		}
	}

	public final VararrayContext vararray() throws RecognitionException {
		VararrayContext _localctx = new VararrayContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_vararray);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(426);
			match(T__37);
			setState(427);
			dimensions();
			setState(428);
			match(T__36);
			setState(429);
			var();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PararrayContext extends ParserRuleContext {
		public DimensionsContext dimensions() {
			return getRuleContext(DimensionsContext.class,0);
		}
		public ParameterContext parameter() {
			return getRuleContext(ParameterContext.class,0);
		}
		public PararrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pararray; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterPararray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitPararray(this);
		}
	}

	public final PararrayContext pararray() throws RecognitionException {
		PararrayContext _localctx = new PararrayContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_pararray);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(431);
			match(T__37);
			setState(432);
			dimensions();
			setState(433);
			match(T__36);
			setState(434);
			parameter();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DimensionsContext extends ParserRuleContext {
		public List<RangeContext> range() {
			return getRuleContexts(RangeContext.class);
		}
		public RangeContext range(int i) {
			return getRuleContext(RangeContext.class,i);
		}
		public DimensionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dimensions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterDimensions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitDimensions(this);
		}
	}

	public final DimensionsContext dimensions() throws RecognitionException {
		DimensionsContext _localctx = new DimensionsContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_dimensions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(436);
			match(T__24);
			setState(446);
			switch (_input.LA(1)) {
			case T__6:
			case T__24:
			case T__59:
			case T__73:
			case T__76:
			case STRING:
			case ID:
			case NAT:
				{
				{
				setState(437);
				range();
				setState(442);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__12) {
					{
					{
					setState(438);
					match(T__12);
					setState(439);
					range();
					}
					}
					setState(444);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			case T__38:
				{
				setState(445);
				match(T__38);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(448);
			match(T__25);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypedataContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MiniZincGrammarParser.ID, 0); }
		public ArithExprContext arithExpr() {
			return getRuleContext(ArithExprContext.class,0);
		}
		public TypedataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typedata; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterTypedata(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitTypedata(this);
		}
	}

	public final TypedataContext typedata() throws RecognitionException {
		TypedataContext _localctx = new TypedataContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_typedata);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(450);
			match(ID);
			setState(451);
			match(T__6);
			setState(452);
			arithExpr(0);
			setState(453);
			match(T__7);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MiniZincGrammarParser.ID, 0); }
		public TerminalNode BOOL() { return getToken(MiniZincGrammarParser.BOOL, 0); }
		public RealContext real() {
			return getRuleContext(RealContext.class,0);
		}
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public PredOrUnionExprContext predOrUnionExpr() {
			return getRuleContext(PredOrUnionExprContext.class,0);
		}
		public RbracketExprContext rbracketExpr() {
			return getRuleContext(RbracketExprContext.class,0);
		}
		public IfExprContext ifExpr() {
			return getRuleContext(IfExprContext.class,0);
		}
		public LetExprContext letExpr() {
			return getRuleContext(LetExprContext.class,0);
		}
		public ListExprContext listExpr() {
			return getRuleContext(ListExprContext.class,0);
		}
		public BoolComplexExprContext boolComplexExpr() {
			return getRuleContext(BoolComplexExprContext.class,0);
		}
		public ArithComplexExprContext arithComplexExpr() {
			return getRuleContext(ArithComplexExprContext.class,0);
		}
		public SetExprContext setExpr() {
			return getRuleContext(SetExprContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public InfixOpContext infixOp() {
			return getRuleContext(InfixOpContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 82;
		enterRecursionRule(_localctx, 82, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(469);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(456);
				match(ID);
				}
				break;
			case 2:
				{
				setState(457);
				match(T__39);
				}
				break;
			case 3:
				{
				setState(458);
				match(BOOL);
				}
				break;
			case 4:
				{
				setState(459);
				real();
				}
				break;
			case 5:
				{
				setState(460);
				integer();
				}
				break;
			case 6:
				{
				setState(461);
				predOrUnionExpr();
				}
				break;
			case 7:
				{
				setState(462);
				rbracketExpr();
				}
				break;
			case 8:
				{
				setState(463);
				ifExpr();
				}
				break;
			case 9:
				{
				setState(464);
				letExpr();
				}
				break;
			case 10:
				{
				setState(465);
				listExpr(0);
				}
				break;
			case 11:
				{
				setState(466);
				boolComplexExpr();
				}
				break;
			case 12:
				{
				setState(467);
				arithComplexExpr();
				}
				break;
			case 13:
				{
				setState(468);
				setExpr(0);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(477);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expr);
					setState(471);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(472);
					infixOp();
					setState(473);
					expr(2);
					}
					} 
				}
				setState(479);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
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

	public static class BoolValContext extends ParserRuleContext {
		public BoolExprContext boolExpr() {
			return getRuleContext(BoolExprContext.class,0);
		}
		public TerminalNode ID() { return getToken(MiniZincGrammarParser.ID, 0); }
		public TerminalNode BOOL() { return getToken(MiniZincGrammarParser.BOOL, 0); }
		public ArrayaccessContext arrayaccess() {
			return getRuleContext(ArrayaccessContext.class,0);
		}
		public IfExprContext ifExpr() {
			return getRuleContext(IfExprContext.class,0);
		}
		public LetExprContext letExpr() {
			return getRuleContext(LetExprContext.class,0);
		}
		public PredOrUnionExprContext predOrUnionExpr() {
			return getRuleContext(PredOrUnionExprContext.class,0);
		}
		public QualifiedContext qualified() {
			return getRuleContext(QualifiedContext.class,0);
		}
		public BoolValContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolVal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterBoolVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitBoolVal(this);
		}
	}

	public final BoolValContext boolVal() throws RecognitionException {
		BoolValContext _localctx = new BoolValContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_boolVal);
		try {
			setState(492);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(481);
				match(T__6);
				setState(482);
				boolExpr(0);
				setState(483);
				match(T__7);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(485);
				match(ID);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(486);
				match(BOOL);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(487);
				arrayaccess();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(488);
				ifExpr();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(489);
				letExpr();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(490);
				predOrUnionExpr();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(491);
				qualified();
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

	public static class OpContext extends ParserRuleContext {
		public BoolOpContext boolOp() {
			return getRuleContext(BoolOpContext.class,0);
		}
		public ArithOpContext arithOp() {
			return getRuleContext(ArithOpContext.class,0);
		}
		public OpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitOp(this);
		}
	}

	public final OpContext op() throws RecognitionException {
		OpContext _localctx = new OpContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_op);
		try {
			setState(496);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(494);
				boolOp();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(495);
				arithOp();
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

	public static class BoolOpContext extends ParserRuleContext {
		public BoolOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterBoolOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitBoolOp(this);
		}
	}

	public final BoolOpContext boolOp() throws RecognitionException {
		BoolOpContext _localctx = new BoolOpContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_boolOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(498);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47))) != 0)) ) {
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

	public static class ArithOpContext extends ParserRuleContext {
		public ArithOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterArithOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitArithOp(this);
		}
	}

	public final ArithOpContext arithOp() throws RecognitionException {
		ArithOpContext _localctx = new ArithOpContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_arithOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(500);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53))) != 0)) ) {
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

	public static class ArithOp2Context extends ParserRuleContext {
		public ArithOp2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithOp2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterArithOp2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitArithOp2(this);
		}
	}

	public final ArithOp2Context arithOp2() throws RecognitionException {
		ArithOp2Context _localctx = new ArithOp2Context(_ctx, getState());
		enterRule(_localctx, 92, RULE_arithOp2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(502);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59))) != 0)) ) {
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

	public static class QualBoolOpContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MiniZincGrammarParser.ID, 0); }
		public BoolOpContext boolOp() {
			return getRuleContext(BoolOpContext.class,0);
		}
		public QualBoolOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualBoolOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterQualBoolOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitQualBoolOp(this);
		}
	}

	public final QualBoolOpContext qualBoolOp() throws RecognitionException {
		QualBoolOpContext _localctx = new QualBoolOpContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_qualBoolOp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(504);
			match(ID);
			setState(505);
			match(T__4);
			setState(506);
			boolOp();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QualArithOpContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MiniZincGrammarParser.ID, 0); }
		public ArithOpContext arithOp() {
			return getRuleContext(ArithOpContext.class,0);
		}
		public QualArithOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualArithOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterQualArithOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitQualArithOp(this);
		}
	}

	public final QualArithOpContext qualArithOp() throws RecognitionException {
		QualArithOpContext _localctx = new QualArithOpContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_qualArithOp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(508);
			match(ID);
			setState(509);
			match(T__4);
			setState(510);
			arithOp();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BoolComplexExprContext extends ParserRuleContext {
		public List<BoolExprContext> boolExpr() {
			return getRuleContexts(BoolExprContext.class);
		}
		public BoolExprContext boolExpr(int i) {
			return getRuleContext(BoolExprContext.class,i);
		}
		public BoolOpContext boolOp() {
			return getRuleContext(BoolOpContext.class,0);
		}
		public QualBoolOpContext qualBoolOp() {
			return getRuleContext(QualBoolOpContext.class,0);
		}
		public List<ArithExprContext> arithExpr() {
			return getRuleContexts(ArithExprContext.class);
		}
		public ArithExprContext arithExpr(int i) {
			return getRuleContext(ArithExprContext.class,i);
		}
		public ArithOpContext arithOp() {
			return getRuleContext(ArithOpContext.class,0);
		}
		public QualArithOpContext qualArithOp() {
			return getRuleContext(QualArithOpContext.class,0);
		}
		public NotExprContext notExpr() {
			return getRuleContext(NotExprContext.class,0);
		}
		public BoolComplexExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolComplexExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterBoolComplexExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitBoolComplexExpr(this);
		}
	}

	public final BoolComplexExprContext boolComplexExpr() throws RecognitionException {
		BoolComplexExprContext _localctx = new BoolComplexExprContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_boolComplexExpr);
		try {
			setState(527);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(512);
				boolExpr(0);
				setState(515);
				switch (_input.LA(1)) {
				case T__1:
				case T__40:
				case T__41:
				case T__42:
				case T__43:
				case T__44:
				case T__45:
				case T__46:
				case T__47:
					{
					setState(513);
					boolOp();
					}
					break;
				case ID:
					{
					setState(514);
					qualBoolOp();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(517);
				boolExpr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(519);
				arithExpr(0);
				setState(522);
				switch (_input.LA(1)) {
				case T__1:
				case T__46:
				case T__47:
				case T__48:
				case T__49:
				case T__50:
				case T__51:
				case T__52:
				case T__53:
					{
					setState(520);
					arithOp();
					}
					break;
				case ID:
					{
					setState(521);
					qualArithOp();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(524);
				arithExpr(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(526);
				notExpr();
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

	public static class BoolExprContext extends ParserRuleContext {
		public List<ArithExprContext> arithExpr() {
			return getRuleContexts(ArithExprContext.class);
		}
		public ArithExprContext arithExpr(int i) {
			return getRuleContext(ArithExprContext.class,i);
		}
		public ArithOpContext arithOp() {
			return getRuleContext(ArithOpContext.class,0);
		}
		public QualArithOpContext qualArithOp() {
			return getRuleContext(QualArithOpContext.class,0);
		}
		public NotExprContext notExpr() {
			return getRuleContext(NotExprContext.class,0);
		}
		public BoolValContext boolVal() {
			return getRuleContext(BoolValContext.class,0);
		}
		public List<BoolExprContext> boolExpr() {
			return getRuleContexts(BoolExprContext.class);
		}
		public BoolExprContext boolExpr(int i) {
			return getRuleContext(BoolExprContext.class,i);
		}
		public BoolOpContext boolOp() {
			return getRuleContext(BoolOpContext.class,0);
		}
		public QualBoolOpContext qualBoolOp() {
			return getRuleContext(QualBoolOpContext.class,0);
		}
		public BoolExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterBoolExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitBoolExpr(this);
		}
	}

	public final BoolExprContext boolExpr() throws RecognitionException {
		return boolExpr(0);
	}

	private BoolExprContext boolExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BoolExprContext _localctx = new BoolExprContext(_ctx, _parentState);
		BoolExprContext _prevctx = _localctx;
		int _startState = 100;
		enterRecursionRule(_localctx, 100, RULE_boolExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(539);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				setState(530);
				arithExpr(0);
				setState(533);
				switch (_input.LA(1)) {
				case T__1:
				case T__46:
				case T__47:
				case T__48:
				case T__49:
				case T__50:
				case T__51:
				case T__52:
				case T__53:
					{
					setState(531);
					arithOp();
					}
					break;
				case ID:
					{
					setState(532);
					qualArithOp();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(535);
				arithExpr(0);
				}
				break;
			case 2:
				{
				setState(537);
				notExpr();
				}
				break;
			case 3:
				{
				setState(538);
				boolVal();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(550);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new BoolExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_boolExpr);
					setState(541);
					if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
					setState(544);
					switch (_input.LA(1)) {
					case T__1:
					case T__40:
					case T__41:
					case T__42:
					case T__43:
					case T__44:
					case T__45:
					case T__46:
					case T__47:
						{
						setState(542);
						boolOp();
						}
						break;
					case ID:
						{
						setState(543);
						qualBoolOp();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(546);
					boolExpr(5);
					}
					} 
				}
				setState(552);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
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

	public static class OperandContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MiniZincGrammarParser.ID, 0); }
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public RealContext real() {
			return getRuleContext(RealContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public ArrayaccessContext arrayaccess() {
			return getRuleContext(ArrayaccessContext.class,0);
		}
		public IfExprContext ifExpr() {
			return getRuleContext(IfExprContext.class,0);
		}
		public LetExprContext letExpr() {
			return getRuleContext(LetExprContext.class,0);
		}
		public ArithExprContext arithExpr() {
			return getRuleContext(ArithExprContext.class,0);
		}
		public PredOrUnionExprContext predOrUnionExpr() {
			return getRuleContext(PredOrUnionExprContext.class,0);
		}
		public QualifiedContext qualified() {
			return getRuleContext(QualifiedContext.class,0);
		}
		public OperandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterOperand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitOperand(this);
		}
	}

	public final OperandContext operand() throws RecognitionException {
		OperandContext _localctx = new OperandContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_operand);
		try {
			setState(566);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(553);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(554);
				integer();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(555);
				real();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(556);
				string();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(557);
				arrayaccess();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(558);
				ifExpr();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(559);
				letExpr();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(560);
				match(T__6);
				setState(561);
				arithExpr(0);
				setState(562);
				match(T__7);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(564);
				predOrUnionExpr();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(565);
				qualified();
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

	public static class QualifiedContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(MiniZincGrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MiniZincGrammarParser.ID, i);
		}
		public ArrayaccessContext arrayaccess() {
			return getRuleContext(ArrayaccessContext.class,0);
		}
		public QualifiedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualified; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterQualified(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitQualified(this);
		}
	}

	public final QualifiedContext qualified() throws RecognitionException {
		QualifiedContext _localctx = new QualifiedContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_qualified);
		try {
			setState(575);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(568);
				match(ID);
				setState(569);
				match(T__60);
				setState(570);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(571);
				arrayaccess();
				setState(572);
				match(T__60);
				setState(573);
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

	public static class ArithComplexExprContext extends ParserRuleContext {
		public MinusExprContext minusExpr() {
			return getRuleContext(MinusExprContext.class,0);
		}
		public List<ArithExprContext> arithExpr() {
			return getRuleContexts(ArithExprContext.class);
		}
		public ArithExprContext arithExpr(int i) {
			return getRuleContext(ArithExprContext.class,i);
		}
		public ArithOp2Context arithOp2() {
			return getRuleContext(ArithOp2Context.class,0);
		}
		public ArithComplexExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithComplexExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterArithComplexExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitArithComplexExpr(this);
		}
	}

	public final ArithComplexExprContext arithComplexExpr() throws RecognitionException {
		ArithComplexExprContext _localctx = new ArithComplexExprContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_arithComplexExpr);
		try {
			setState(582);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(577);
				minusExpr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(578);
				arithExpr(0);
				setState(579);
				arithOp2();
				setState(580);
				arithExpr(0);
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

	public static class ArithExprContext extends ParserRuleContext {
		public MinusExprContext minusExpr() {
			return getRuleContext(MinusExprContext.class,0);
		}
		public OperandContext operand() {
			return getRuleContext(OperandContext.class,0);
		}
		public List<ArithExprContext> arithExpr() {
			return getRuleContexts(ArithExprContext.class);
		}
		public ArithExprContext arithExpr(int i) {
			return getRuleContext(ArithExprContext.class,i);
		}
		public ArithOp2Context arithOp2() {
			return getRuleContext(ArithOp2Context.class,0);
		}
		public ArithExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterArithExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitArithExpr(this);
		}
	}

	public final ArithExprContext arithExpr() throws RecognitionException {
		return arithExpr(0);
	}

	private ArithExprContext arithExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ArithExprContext _localctx = new ArithExprContext(_ctx, _parentState);
		ArithExprContext _prevctx = _localctx;
		int _startState = 108;
		enterRecursionRule(_localctx, 108, RULE_arithExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(587);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				{
				setState(585);
				minusExpr();
				}
				break;
			case 2:
				{
				setState(586);
				operand();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(595);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ArithExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_arithExpr);
					setState(589);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(590);
					arithOp2();
					setState(591);
					arithExpr(3);
					}
					} 
				}
				setState(597);
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

	public static class NotExprContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public NotExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterNotExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitNotExpr(this);
		}
	}

	public final NotExprContext notExpr() throws RecognitionException {
		NotExprContext _localctx = new NotExprContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_notExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(598);
			match(T__61);
			setState(599);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MinusExprContext extends ParserRuleContext {
		public ArithExprContext arithExpr() {
			return getRuleContext(ArithExprContext.class,0);
		}
		public MinusExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_minusExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterMinusExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitMinusExpr(this);
		}
	}

	public final MinusExprContext minusExpr() throws RecognitionException {
		MinusExprContext _localctx = new MinusExprContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_minusExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(601);
			match(T__59);
			setState(602);
			arithExpr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PredOrUnionExprContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MiniZincGrammarParser.ID, 0); }
		public TwosectionsContext twosections() {
			return getRuleContext(TwosectionsContext.class,0);
		}
		public OnesectionContext onesection() {
			return getRuleContext(OnesectionContext.class,0);
		}
		public PredOrUnionExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predOrUnionExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterPredOrUnionExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitPredOrUnionExpr(this);
		}
	}

	public final PredOrUnionExprContext predOrUnionExpr() throws RecognitionException {
		PredOrUnionExprContext _localctx = new PredOrUnionExprContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_predOrUnionExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(604);
			match(ID);
			setState(607);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				{
				setState(605);
				twosections();
				}
				break;
			case 2:
				{
				setState(606);
				onesection();
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

	public static class OnesectionContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public OnesectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_onesection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterOnesection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitOnesection(this);
		}
	}

	public final OnesectionContext onesection() throws RecognitionException {
		OnesectionContext _localctx = new OnesectionContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_onesection);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(609);
			match(T__6);
			setState(618);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				{
				setState(610);
				expr(0);
				setState(615);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__12) {
					{
					{
					setState(611);
					match(T__12);
					setState(612);
					expr(0);
					}
					}
					setState(617);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(620);
			match(T__7);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TwosectionsContext extends ParserRuleContext {
		public GuardContext guard() {
			return getRuleContext(GuardContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TwosectionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_twosections; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterTwosections(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitTwosections(this);
		}
	}

	public final TwosectionsContext twosections() throws RecognitionException {
		TwosectionsContext _localctx = new TwosectionsContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_twosections);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(622);
			match(T__6);
			setState(623);
			guard();
			setState(624);
			match(T__7);
			setState(625);
			match(T__6);
			setState(626);
			expr(0);
			setState(627);
			match(T__7);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RbracketExprContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public RbracketExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rbracketExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterRbracketExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitRbracketExpr(this);
		}
	}

	public final RbracketExprContext rbracketExpr() throws RecognitionException {
		RbracketExprContext _localctx = new RbracketExprContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_rbracketExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(629);
			match(T__6);
			setState(630);
			expr(0);
			setState(631);
			match(T__7);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdexprContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MiniZincGrammarParser.ID, 0); }
		public IdexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterIdexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitIdexpr(this);
		}
	}

	public final IdexprContext idexpr() throws RecognitionException {
		IdexprContext _localctx = new IdexprContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_idexpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(633);
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

	public static class StringExprContext extends ParserRuleContext {
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public StringExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterStringExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitStringExpr(this);
		}
	}

	public final StringExprContext stringExpr() throws RecognitionException {
		StringExprContext _localctx = new StringExprContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_stringExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(635);
			string();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InfixOpContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MiniZincGrammarParser.ID, 0); }
		public InfixSetOpContext infixSetOp() {
			return getRuleContext(InfixSetOpContext.class,0);
		}
		public InfixOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_infixOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterInfixOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitInfixOp(this);
		}
	}

	public final InfixOpContext infixOp() throws RecognitionException {
		InfixOpContext _localctx = new InfixOpContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_infixOp);
		try {
			setState(641);
			switch (_input.LA(1)) {
			case T__62:
				enterOuterAlt(_localctx, 1);
				{
				setState(637);
				match(T__62);
				setState(638);
				match(ID);
				setState(639);
				match(T__62);
				}
				break;
			case T__52:
			case T__63:
			case T__64:
				enterOuterAlt(_localctx, 2);
				{
				setState(640);
				infixSetOp();
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

	public static class InfixSetOpContext extends ParserRuleContext {
		public InfixSetOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_infixSetOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterInfixSetOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitInfixSetOp(this);
		}
	}

	public final InfixSetOpContext infixSetOp() throws RecognitionException {
		InfixSetOpContext _localctx = new InfixSetOpContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_infixSetOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(643);
			_la = _input.LA(1);
			if ( !(((((_la - 53)) & ~0x3f) == 0 && ((1L << (_la - 53)) & ((1L << (T__52 - 53)) | (1L << (T__63 - 53)) | (1L << (T__64 - 53)))) != 0)) ) {
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

	public static class ArrayaccessContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MiniZincGrammarParser.ID, 0); }
		public List<SimpleNonEmptyListContext> simpleNonEmptyList() {
			return getRuleContexts(SimpleNonEmptyListContext.class);
		}
		public SimpleNonEmptyListContext simpleNonEmptyList(int i) {
			return getRuleContext(SimpleNonEmptyListContext.class,i);
		}
		public ArrayaccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayaccess; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterArrayaccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitArrayaccess(this);
		}
	}

	public final ArrayaccessContext arrayaccess() throws RecognitionException {
		ArrayaccessContext _localctx = new ArrayaccessContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_arrayaccess);
		try {
			setState(650);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(645);
				match(ID);
				setState(646);
				simpleNonEmptyList();
				}
				break;
			case T__24:
				enterOuterAlt(_localctx, 2);
				{
				setState(647);
				simpleNonEmptyList();
				setState(648);
				simpleNonEmptyList();
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

	public static class CaseExprContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MiniZincGrammarParser.ID, 0); }
		public List<CaseBranchContext> caseBranch() {
			return getRuleContexts(CaseBranchContext.class);
		}
		public CaseBranchContext caseBranch(int i) {
			return getRuleContext(CaseBranchContext.class,i);
		}
		public CaseExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterCaseExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitCaseExpr(this);
		}
	}

	public final CaseExprContext caseExpr() throws RecognitionException {
		CaseExprContext _localctx = new CaseExprContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_caseExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(652);
			match(T__65);
			setState(653);
			match(ID);
			setState(654);
			match(T__36);
			setState(658); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(655);
				caseBranch();
				setState(656);
				match(T__0);
				}
				}
				setState(660); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
			setState(662);
			match(T__66);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CaseBranchContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PredOrUnionExprContext predOrUnionExpr() {
			return getRuleContext(PredOrUnionExprContext.class,0);
		}
		public TerminalNode ID() { return getToken(MiniZincGrammarParser.ID, 0); }
		public CaseBranchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseBranch; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterCaseBranch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitCaseBranch(this);
		}
	}

	public final CaseBranchContext caseBranch() throws RecognitionException {
		CaseBranchContext _localctx = new CaseBranchContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_caseBranch);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(666);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				{
				setState(664);
				predOrUnionExpr();
				}
				break;
			case 2:
				{
				setState(665);
				match(ID);
				}
				break;
			}
			setState(668);
			match(T__67);
			setState(669);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ListExprContext extends ParserRuleContext {
		public ListValueContext listValue() {
			return getRuleContext(ListValueContext.class,0);
		}
		public OneDimListContext oneDimList() {
			return getRuleContext(OneDimListContext.class,0);
		}
		public MultiDimListContext multiDimList() {
			return getRuleContext(MultiDimListContext.class,0);
		}
		public List<ListExprContext> listExpr() {
			return getRuleContexts(ListExprContext.class);
		}
		public ListExprContext listExpr(int i) {
			return getRuleContext(ListExprContext.class,i);
		}
		public ListExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterListExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitListExpr(this);
		}
	}

	public final ListExprContext listExpr() throws RecognitionException {
		return listExpr(0);
	}

	private ListExprContext listExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ListExprContext _localctx = new ListExprContext(_ctx, _parentState);
		ListExprContext _prevctx = _localctx;
		int _startState = 136;
		enterRecursionRule(_localctx, 136, RULE_listExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(675);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				{
				setState(672);
				listValue();
				}
				break;
			case 2:
				{
				setState(673);
				oneDimList();
				}
				break;
			case 3:
				{
				setState(674);
				multiDimList();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(682);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ListExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_listExpr);
					setState(677);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(678);
					match(T__68);
					setState(679);
					listExpr(4);
					}
					} 
				}
				setState(684);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
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

	public static class OneDimListContext extends ParserRuleContext {
		public SimpleListContext simpleList() {
			return getRuleContext(SimpleListContext.class,0);
		}
		public GuardedListContext guardedList() {
			return getRuleContext(GuardedListContext.class,0);
		}
		public OneDimListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oneDimList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterOneDimList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitOneDimList(this);
		}
	}

	public final OneDimListContext oneDimList() throws RecognitionException {
		OneDimListContext _localctx = new OneDimListContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_oneDimList);
		try {
			setState(687);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(685);
				simpleList();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(686);
				guardedList();
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

	public static class SimpleListContext extends ParserRuleContext {
		public SimpleNonEmptyListContext simpleNonEmptyList() {
			return getRuleContext(SimpleNonEmptyListContext.class,0);
		}
		public SimpleListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterSimpleList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitSimpleList(this);
		}
	}

	public final SimpleListContext simpleList() throws RecognitionException {
		SimpleListContext _localctx = new SimpleListContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_simpleList);
		try {
			setState(692);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(689);
				match(T__24);
				setState(690);
				match(T__25);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(691);
				simpleNonEmptyList();
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

	public static class SimpleNonEmptyListContext extends ParserRuleContext {
		public NonEmptyListElemsContext nonEmptyListElems() {
			return getRuleContext(NonEmptyListElemsContext.class,0);
		}
		public SimpleNonEmptyListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleNonEmptyList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterSimpleNonEmptyList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitSimpleNonEmptyList(this);
		}
	}

	public final SimpleNonEmptyListContext simpleNonEmptyList() throws RecognitionException {
		SimpleNonEmptyListContext _localctx = new SimpleNonEmptyListContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_simpleNonEmptyList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(694);
			match(T__24);
			setState(695);
			nonEmptyListElems();
			setState(697);
			_la = _input.LA(1);
			if (_la==T__12) {
				{
				setState(696);
				match(T__12);
				}
			}

			setState(699);
			match(T__25);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GuardedListContext extends ParserRuleContext {
		public NonEmptyListElemsContext nonEmptyListElems() {
			return getRuleContext(NonEmptyListElemsContext.class,0);
		}
		public GuardContext guard() {
			return getRuleContext(GuardContext.class,0);
		}
		public GuardedListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_guardedList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterGuardedList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitGuardedList(this);
		}
	}

	public final GuardedListContext guardedList() throws RecognitionException {
		GuardedListContext _localctx = new GuardedListContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_guardedList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(701);
			match(T__24);
			setState(702);
			nonEmptyListElems();
			setState(703);
			match(T__69);
			setState(704);
			guard();
			setState(705);
			match(T__25);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultiDimListContext extends ParserRuleContext {
		public List<NonEmptyListElemsContext> nonEmptyListElems() {
			return getRuleContexts(NonEmptyListElemsContext.class);
		}
		public NonEmptyListElemsContext nonEmptyListElems(int i) {
			return getRuleContext(NonEmptyListElemsContext.class,i);
		}
		public MultiDimListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiDimList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterMultiDimList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitMultiDimList(this);
		}
	}

	public final MultiDimListContext multiDimList() throws RecognitionException {
		MultiDimListContext _localctx = new MultiDimListContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_multiDimList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(707);
			match(T__70);
			setState(708);
			nonEmptyListElems();
			setState(716);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(710);
					_la = _input.LA(1);
					if (_la==T__12) {
						{
						setState(709);
						match(T__12);
						}
					}

					setState(712);
					match(T__69);
					setState(713);
					nonEmptyListElems();
					}
					} 
				}
				setState(718);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
			}
			setState(720);
			_la = _input.LA(1);
			if (_la==T__69) {
				{
				setState(719);
				match(T__69);
				}
			}

			setState(722);
			match(T__71);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NonEmptyListElemsContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public NonEmptyListElemsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonEmptyListElems; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterNonEmptyListElems(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitNonEmptyListElems(this);
		}
	}

	public final NonEmptyListElemsContext nonEmptyListElems() throws RecognitionException {
		NonEmptyListElemsContext _localctx = new NonEmptyListElemsContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_nonEmptyListElems);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(724);
			expr(0);
			setState(729);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(725);
					match(T__12);
					setState(726);
					expr(0);
					}
					} 
				}
				setState(731);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
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

	public static class ListValueContext extends ParserRuleContext {
		public StringExprContext stringExpr() {
			return getRuleContext(StringExprContext.class,0);
		}
		public TerminalNode ID() { return getToken(MiniZincGrammarParser.ID, 0); }
		public IfExprContext ifExpr() {
			return getRuleContext(IfExprContext.class,0);
		}
		public ArrayaccessContext arrayaccess() {
			return getRuleContext(ArrayaccessContext.class,0);
		}
		public PredOrUnionExprContext predOrUnionExpr() {
			return getRuleContext(PredOrUnionExprContext.class,0);
		}
		public QualifiedContext qualified() {
			return getRuleContext(QualifiedContext.class,0);
		}
		public ListValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterListValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitListValue(this);
		}
	}

	public final ListValueContext listValue() throws RecognitionException {
		ListValueContext _localctx = new ListValueContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_listValue);
		try {
			setState(738);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(732);
				stringExpr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(733);
				match(ID);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(734);
				ifExpr();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(735);
				arrayaccess();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(736);
				predOrUnionExpr();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(737);
				qualified();
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

	public static class InDeclContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(MiniZincGrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MiniZincGrammarParser.ID, i);
		}
		public SetExprContext setExpr() {
			return getRuleContext(SetExprContext.class,0);
		}
		public WhereCondContext whereCond() {
			return getRuleContext(WhereCondContext.class,0);
		}
		public InDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterInDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitInDecl(this);
		}
	}

	public final InDeclContext inDecl() throws RecognitionException {
		InDeclContext _localctx = new InDeclContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_inDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(740);
			match(ID);
			setState(745);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__12) {
				{
				{
				setState(741);
				match(T__12);
				setState(742);
				match(ID);
				}
				}
				setState(747);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(748);
			match(T__52);
			setState(749);
			setExpr(0);
			setState(751);
			_la = _input.LA(1);
			if (_la==T__72) {
				{
				setState(750);
				whereCond();
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

	public static class WhereCondContext extends ParserRuleContext {
		public BoolExprContext boolExpr() {
			return getRuleContext(BoolExprContext.class,0);
		}
		public WhereCondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whereCond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterWhereCond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitWhereCond(this);
		}
	}

	public final WhereCondContext whereCond() throws RecognitionException {
		WhereCondContext _localctx = new WhereCondContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_whereCond);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(753);
			match(T__72);
			setState(754);
			boolExpr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LetExprContext extends ParserRuleContext {
		public List<LetDeclContext> letDecl() {
			return getRuleContexts(LetDeclContext.class);
		}
		public LetDeclContext letDecl(int i) {
			return getRuleContext(LetDeclContext.class,i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public LetExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_letExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterLetExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitLetExpr(this);
		}
	}

	public final LetExprContext letExpr() throws RecognitionException {
		LetExprContext _localctx = new LetExprContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_letExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(756);
			match(T__73);
			setState(757);
			match(T__74);
			setState(758);
			letDecl();
			setState(763);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__12) {
				{
				{
				setState(759);
				match(T__12);
				setState(760);
				letDecl();
				}
				}
				setState(765);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(766);
			match(T__75);
			setState(767);
			match(T__52);
			setState(768);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LetDeclContext extends ParserRuleContext {
		public DeclContext decl() {
			return getRuleContext(DeclContext.class,0);
		}
		public ConstraintContext constraint() {
			return getRuleContext(ConstraintContext.class,0);
		}
		public LetDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_letDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterLetDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitLetDecl(this);
		}
	}

	public final LetDeclContext letDecl() throws RecognitionException {
		LetDeclContext _localctx = new LetDeclContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_letDecl);
		try {
			setState(772);
			switch (_input.LA(1)) {
			case T__6:
			case T__9:
			case T__14:
			case T__24:
			case T__35:
			case T__37:
			case T__38:
			case T__59:
			case T__73:
			case T__76:
			case T__82:
			case T__83:
			case STRING:
			case ID:
			case NAT:
				enterOuterAlt(_localctx, 1);
				{
				setState(770);
				decl();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(771);
				constraint();
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

	public static class IfExprContext extends ParserRuleContext {
		public BodyIfContext bodyIf() {
			return getRuleContext(BodyIfContext.class,0);
		}
		public IfExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterIfExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitIfExpr(this);
		}
	}

	public final IfExprContext ifExpr() throws RecognitionException {
		IfExprContext _localctx = new IfExprContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_ifExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(774);
			match(T__76);
			setState(775);
			bodyIf();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BodyIfContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ElseSContext elseS() {
			return getRuleContext(ElseSContext.class,0);
		}
		public ElseifSContext elseifS() {
			return getRuleContext(ElseifSContext.class,0);
		}
		public BodyIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bodyIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterBodyIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitBodyIf(this);
		}
	}

	public final BodyIfContext bodyIf() throws RecognitionException {
		BodyIfContext _localctx = new BodyIfContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_bodyIf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(777);
			expr(0);
			setState(778);
			match(T__77);
			setState(779);
			expr(0);
			setState(782);
			switch (_input.LA(1)) {
			case T__78:
				{
				setState(780);
				elseS();
				}
				break;
			case T__80:
				{
				setState(781);
				elseifS();
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

	public static class ElseSContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ElseSContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseS; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterElseS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitElseS(this);
		}
	}

	public final ElseSContext elseS() throws RecognitionException {
		ElseSContext _localctx = new ElseSContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_elseS);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(784);
			match(T__78);
			setState(785);
			expr(0);
			setState(786);
			match(T__79);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElseifSContext extends ParserRuleContext {
		public BodyIfContext bodyIf() {
			return getRuleContext(BodyIfContext.class,0);
		}
		public ElseifSContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseifS; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterElseifS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitElseifS(this);
		}
	}

	public final ElseifSContext elseifS() throws RecognitionException {
		ElseifSContext _localctx = new ElseifSContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_elseifS);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(788);
			match(T__80);
			setState(789);
			bodyIf();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SetValContext extends ParserRuleContext {
		public BracketExprContext bracketExpr() {
			return getRuleContext(BracketExprContext.class,0);
		}
		public RangeContext range() {
			return getRuleContext(RangeContext.class,0);
		}
		public GuardedSetContext guardedSet() {
			return getRuleContext(GuardedSetContext.class,0);
		}
		public SetValContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setVal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterSetVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitSetVal(this);
		}
	}

	public final SetValContext setVal() throws RecognitionException {
		SetValContext _localctx = new SetValContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_setVal);
		try {
			setState(794);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(791);
				bracketExpr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(792);
				range();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(793);
				guardedSet();
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

	public static class SetExprContext extends ParserRuleContext {
		public SetValContext setVal() {
			return getRuleContext(SetValContext.class,0);
		}
		public List<SetExprContext> setExpr() {
			return getRuleContexts(SetExprContext.class);
		}
		public SetExprContext setExpr(int i) {
			return getRuleContext(SetExprContext.class,i);
		}
		public InfixSetOpContext infixSetOp() {
			return getRuleContext(InfixSetOpContext.class,0);
		}
		public SetExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterSetExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitSetExpr(this);
		}
	}

	public final SetExprContext setExpr() throws RecognitionException {
		return setExpr(0);
	}

	private SetExprContext setExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		SetExprContext _localctx = new SetExprContext(_ctx, _parentState);
		SetExprContext _prevctx = _localctx;
		int _startState = 170;
		enterRecursionRule(_localctx, 170, RULE_setExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(797);
			setVal();
			}
			_ctx.stop = _input.LT(-1);
			setState(805);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new SetExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_setExpr);
					setState(799);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(800);
					infixSetOp();
					setState(801);
					setExpr(2);
					}
					} 
				}
				setState(807);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
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

	public static class BracketExprContext extends ParserRuleContext {
		public CommaListContext commaList() {
			return getRuleContext(CommaListContext.class,0);
		}
		public BracketExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bracketExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterBracketExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitBracketExpr(this);
		}
	}

	public final BracketExprContext bracketExpr() throws RecognitionException {
		BracketExprContext _localctx = new BracketExprContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_bracketExpr);
		try {
			setState(814);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(808);
				match(T__74);
				setState(809);
				match(T__75);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(810);
				match(T__74);
				setState(811);
				commaList();
				setState(812);
				match(T__75);
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

	public static class GuardedSetContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public GuardContext guard() {
			return getRuleContext(GuardContext.class,0);
		}
		public GuardedSetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_guardedSet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterGuardedSet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitGuardedSet(this);
		}
	}

	public final GuardedSetContext guardedSet() throws RecognitionException {
		GuardedSetContext _localctx = new GuardedSetContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_guardedSet);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(816);
			match(T__74);
			setState(817);
			expr(0);
			setState(818);
			match(T__69);
			setState(819);
			guard();
			setState(820);
			match(T__75);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CommaListContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public CommaListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commaList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterCommaList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitCommaList(this);
		}
	}

	public final CommaListContext commaList() throws RecognitionException {
		CommaListContext _localctx = new CommaListContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_commaList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(822);
			expr(0);
			setState(827);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__12) {
				{
				{
				setState(823);
				match(T__12);
				setState(824);
				expr(0);
				}
				}
				setState(829);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class GuardContext extends ParserRuleContext {
		public List<InDeclContext> inDecl() {
			return getRuleContexts(InDeclContext.class);
		}
		public InDeclContext inDecl(int i) {
			return getRuleContext(InDeclContext.class,i);
		}
		public GuardContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_guard; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterGuard(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitGuard(this);
		}
	}

	public final GuardContext guard() throws RecognitionException {
		GuardContext _localctx = new GuardContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_guard);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(830);
			inDecl();
			setState(835);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__12) {
				{
				{
				setState(831);
				match(T__12);
				setState(832);
				inDecl();
				}
				}
				setState(837);
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

	public static class RangeContext extends ParserRuleContext {
		public FromRContext fromR() {
			return getRuleContext(FromRContext.class,0);
		}
		public ToRContext toR() {
			return getRuleContext(ToRContext.class,0);
		}
		public TerminalNode ID() { return getToken(MiniZincGrammarParser.ID, 0); }
		public RangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_range; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterRange(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitRange(this);
		}
	}

	public final RangeContext range() throws RecognitionException {
		RangeContext _localctx = new RangeContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_range);
		try {
			setState(843);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(838);
				fromR();
				setState(839);
				match(T__81);
				setState(840);
				toR();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(842);
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

	public static class FromRContext extends ParserRuleContext {
		public ArithExprContext arithExpr() {
			return getRuleContext(ArithExprContext.class,0);
		}
		public FromRContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fromR; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterFromR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitFromR(this);
		}
	}

	public final FromRContext fromR() throws RecognitionException {
		FromRContext _localctx = new FromRContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_fromR);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(845);
			arithExpr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ToRContext extends ParserRuleContext {
		public ArithExprContext arithExpr() {
			return getRuleContext(ArithExprContext.class,0);
		}
		public ToRContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_toR; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterToR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitToR(this);
		}
	}

	public final ToRContext toR() throws RecognitionException {
		ToRContext _localctx = new ToRContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_toR);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(847);
			arithExpr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RintContext extends ParserRuleContext {
		public RintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterRint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitRint(this);
		}
	}

	public final RintContext rint() throws RecognitionException {
		RintContext _localctx = new RintContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_rint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(849);
			match(T__38);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RfloatContext extends ParserRuleContext {
		public RfloatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rfloat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterRfloat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitRfloat(this);
		}
	}

	public final RfloatContext rfloat() throws RecognitionException {
		RfloatContext _localctx = new RfloatContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_rfloat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(851);
			match(T__82);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RboolContext extends ParserRuleContext {
		public RboolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rbool; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterRbool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitRbool(this);
		}
	}

	public final RboolContext rbool() throws RecognitionException {
		RboolContext _localctx = new RboolContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_rbool);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(853);
			match(T__83);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntegerContext extends ParserRuleContext {
		public TerminalNode NAT() { return getToken(MiniZincGrammarParser.NAT, 0); }
		public IntegerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterInteger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitInteger(this);
		}
	}

	public final IntegerContext integer() throws RecognitionException {
		IntegerContext _localctx = new IntegerContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_integer);
		try {
			setState(858);
			switch (_input.LA(1)) {
			case NAT:
				enterOuterAlt(_localctx, 1);
				{
				setState(855);
				match(NAT);
				}
				break;
			case T__59:
				enterOuterAlt(_localctx, 2);
				{
				setState(856);
				match(T__59);
				setState(857);
				match(NAT);
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

	public static class RealContext extends ParserRuleContext {
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public TerminalNode NAT() { return getToken(MiniZincGrammarParser.NAT, 0); }
		public RealContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_real; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterReal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitReal(this);
		}
	}

	public final RealContext real() throws RecognitionException {
		RealContext _localctx = new RealContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_real);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(860);
			integer();
			setState(861);
			match(T__60);
			setState(862);
			match(NAT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(MiniZincGrammarParser.STRING, 0); }
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniZincGrammarListener ) ((MiniZincGrammarListener)listener).exitString(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(864);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
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
		case 41:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 50:
			return boolExpr_sempred((BoolExprContext)_localctx, predIndex);
		case 54:
			return arithExpr_sempred((ArithExprContext)_localctx, predIndex);
		case 68:
			return listExpr_sempred((ListExprContext)_localctx, predIndex);
		case 85:
			return setExpr_sempred((SetExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean boolExpr_sempred(BoolExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 4);
		}
		return true;
	}
	private boolean arithExpr_sempred(ArithExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean listExpr_sempred(ListExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean setExpr_sempred(SetExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3]\u0365\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\3\2\3\2\3\2\6\2\u00cc\n\2\r\2\16\2\u00cd"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\u00d9\n\3\3\4\3\4\5\4\u00dd\n"+
		"\4\3\5\3\5\5\5\u00e1\n\5\3\5\3\5\5\5\u00e5\n\5\3\6\3\6\5\6\u00e9\n\6\3"+
		"\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\5\n\u00ff\n\n\3\13\3\13\5\13\u0103\n\13\3\13\3\13\5\13\u0107"+
		"\n\13\3\f\5\f\u010a\n\f\3\f\3\f\3\f\3\f\3\f\5\f\u0111\n\f\3\r\3\r\3\r"+
		"\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u0120\n\17\f\17"+
		"\16\17\u0123\13\17\5\17\u0125\n\17\3\17\3\17\3\17\3\17\3\20\3\20\5\20"+
		"\u012d\n\20\3\20\3\20\3\20\3\20\3\20\7\20\u0134\n\20\f\20\16\20\u0137"+
		"\13\20\5\20\u0139\n\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\5\21\u0147\n\21\3\22\3\22\3\23\3\23\3\24\3\24\5\24\u014f"+
		"\n\24\3\25\3\25\3\26\3\26\5\26\u0155\n\26\3\27\3\27\3\27\3\30\3\30\3\30"+
		"\3\31\3\31\3\31\3\32\3\32\3\32\3\32\5\32\u0164\n\32\3\33\3\33\3\33\3\34"+
		"\3\34\3\34\3\35\3\35\3\35\3\36\3\36\5\36\u0171\n\36\3\36\3\36\3\36\3\36"+
		"\7\36\u0177\n\36\f\36\16\36\u017a\13\36\3\36\3\36\5\36\u017e\n\36\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3!\3!\3\"\3\"\5\""+
		"\u0190\n\"\3#\3#\3$\3$\3$\3$\3$\7$\u0199\n$\f$\16$\u019c\13$\3$\3$\3%"+
		"\3%\3%\3%\3%\3%\3%\5%\u01a7\n%\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3(\3(\3"+
		"(\3(\3(\3)\3)\3)\3)\7)\u01bb\n)\f)\16)\u01be\13)\3)\5)\u01c1\n)\3)\3)"+
		"\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\5+\u01d8\n+"+
		"\3+\3+\3+\3+\7+\u01de\n+\f+\16+\u01e1\13+\3,\3,\3,\3,\3,\3,\3,\3,\3,\3"+
		",\3,\3,\5,\u01ef\n,\3-\3-\5-\u01f3\n-\3.\3.\3/\3/\3\60\3\60\3\61\3\61"+
		"\3\61\3\61\3\62\3\62\3\62\3\62\3\63\3\63\3\63\5\63\u0206\n\63\3\63\3\63"+
		"\3\63\3\63\3\63\5\63\u020d\n\63\3\63\3\63\3\63\5\63\u0212\n\63\3\64\3"+
		"\64\3\64\3\64\5\64\u0218\n\64\3\64\3\64\3\64\3\64\5\64\u021e\n\64\3\64"+
		"\3\64\3\64\5\64\u0223\n\64\3\64\3\64\7\64\u0227\n\64\f\64\16\64\u022a"+
		"\13\64\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65"+
		"\5\65\u0239\n\65\3\66\3\66\3\66\3\66\3\66\3\66\3\66\5\66\u0242\n\66\3"+
		"\67\3\67\3\67\3\67\3\67\5\67\u0249\n\67\38\38\38\58\u024e\n8\38\38\38"+
		"\38\78\u0254\n8\f8\168\u0257\138\39\39\39\3:\3:\3:\3;\3;\3;\5;\u0262\n"+
		";\3<\3<\3<\3<\7<\u0268\n<\f<\16<\u026b\13<\5<\u026d\n<\3<\3<\3=\3=\3="+
		"\3=\3=\3=\3=\3>\3>\3>\3>\3?\3?\3@\3@\3A\3A\3A\3A\5A\u0284\nA\3B\3B\3C"+
		"\3C\3C\3C\3C\5C\u028d\nC\3D\3D\3D\3D\3D\3D\6D\u0295\nD\rD\16D\u0296\3"+
		"D\3D\3E\3E\5E\u029d\nE\3E\3E\3E\3F\3F\3F\3F\5F\u02a6\nF\3F\3F\3F\7F\u02ab"+
		"\nF\fF\16F\u02ae\13F\3G\3G\5G\u02b2\nG\3H\3H\3H\5H\u02b7\nH\3I\3I\3I\5"+
		"I\u02bc\nI\3I\3I\3J\3J\3J\3J\3J\3J\3K\3K\3K\5K\u02c9\nK\3K\3K\7K\u02cd"+
		"\nK\fK\16K\u02d0\13K\3K\5K\u02d3\nK\3K\3K\3L\3L\3L\7L\u02da\nL\fL\16L"+
		"\u02dd\13L\3M\3M\3M\3M\3M\3M\5M\u02e5\nM\3N\3N\3N\7N\u02ea\nN\fN\16N\u02ed"+
		"\13N\3N\3N\3N\5N\u02f2\nN\3O\3O\3O\3P\3P\3P\3P\3P\7P\u02fc\nP\fP\16P\u02ff"+
		"\13P\3P\3P\3P\3P\3Q\3Q\5Q\u0307\nQ\3R\3R\3R\3S\3S\3S\3S\3S\5S\u0311\n"+
		"S\3T\3T\3T\3T\3U\3U\3U\3V\3V\3V\5V\u031d\nV\3W\3W\3W\3W\3W\3W\3W\7W\u0326"+
		"\nW\fW\16W\u0329\13W\3X\3X\3X\3X\3X\3X\5X\u0331\nX\3Y\3Y\3Y\3Y\3Y\3Y\3"+
		"Z\3Z\3Z\7Z\u033c\nZ\fZ\16Z\u033f\13Z\3[\3[\3[\7[\u0344\n[\f[\16[\u0347"+
		"\13[\3\\\3\\\3\\\3\\\3\\\5\\\u034e\n\\\3]\3]\3^\3^\3_\3_\3`\3`\3a\3a\3"+
		"b\3b\3b\5b\u035d\nb\3c\3c\3c\3c\3d\3d\3d\2\7Tfn\u008a\u00ace\2\4\6\b\n"+
		"\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\"+
		"^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090"+
		"\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8"+
		"\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0"+
		"\u00c2\u00c4\u00c6\2\b\3\2\36 \3\2!%\4\2\4\4+\62\4\2\4\4\618\3\29>\4\2"+
		"\67\67BC\u037b\2\u00cb\3\2\2\2\4\u00d8\3\2\2\2\6\u00dc\3\2\2\2\b\u00e0"+
		"\3\2\2\2\n\u00e8\3\2\2\2\f\u00ea\3\2\2\2\16\u00ef\3\2\2\2\20\u00f2\3\2"+
		"\2\2\22\u00fe\3\2\2\2\24\u0100\3\2\2\2\26\u0109\3\2\2\2\30\u0112\3\2\2"+
		"\2\32\u0115\3\2\2\2\34\u0119\3\2\2\2\36\u012a\3\2\2\2 \u0146\3\2\2\2\""+
		"\u0148\3\2\2\2$\u014a\3\2\2\2&\u014e\3\2\2\2(\u0150\3\2\2\2*\u0154\3\2"+
		"\2\2,\u0156\3\2\2\2.\u0159\3\2\2\2\60\u015c\3\2\2\2\62\u0163\3\2\2\2\64"+
		"\u0165\3\2\2\2\66\u0168\3\2\2\28\u016b\3\2\2\2:\u016e\3\2\2\2<\u017f\3"+
		"\2\2\2>\u0189\3\2\2\2@\u018b\3\2\2\2B\u018f\3\2\2\2D\u0191\3\2\2\2F\u0193"+
		"\3\2\2\2H\u01a6\3\2\2\2J\u01a8\3\2\2\2L\u01ac\3\2\2\2N\u01b1\3\2\2\2P"+
		"\u01b6\3\2\2\2R\u01c4\3\2\2\2T\u01d7\3\2\2\2V\u01ee\3\2\2\2X\u01f2\3\2"+
		"\2\2Z\u01f4\3\2\2\2\\\u01f6\3\2\2\2^\u01f8\3\2\2\2`\u01fa\3\2\2\2b\u01fe"+
		"\3\2\2\2d\u0211\3\2\2\2f\u021d\3\2\2\2h\u0238\3\2\2\2j\u0241\3\2\2\2l"+
		"\u0248\3\2\2\2n\u024d\3\2\2\2p\u0258\3\2\2\2r\u025b\3\2\2\2t\u025e\3\2"+
		"\2\2v\u0263\3\2\2\2x\u0270\3\2\2\2z\u0277\3\2\2\2|\u027b\3\2\2\2~\u027d"+
		"\3\2\2\2\u0080\u0283\3\2\2\2\u0082\u0285\3\2\2\2\u0084\u028c\3\2\2\2\u0086"+
		"\u028e\3\2\2\2\u0088\u029c\3\2\2\2\u008a\u02a5\3\2\2\2\u008c\u02b1\3\2"+
		"\2\2\u008e\u02b6\3\2\2\2\u0090\u02b8\3\2\2\2\u0092\u02bf\3\2\2\2\u0094"+
		"\u02c5\3\2\2\2\u0096\u02d6\3\2\2\2\u0098\u02e4\3\2\2\2\u009a\u02e6\3\2"+
		"\2\2\u009c\u02f3\3\2\2\2\u009e\u02f6\3\2\2\2\u00a0\u0306\3\2\2\2\u00a2"+
		"\u0308\3\2\2\2\u00a4\u030b\3\2\2\2\u00a6\u0312\3\2\2\2\u00a8\u0316\3\2"+
		"\2\2\u00aa\u031c\3\2\2\2\u00ac\u031e\3\2\2\2\u00ae\u0330\3\2\2\2\u00b0"+
		"\u0332\3\2\2\2\u00b2\u0338\3\2\2\2\u00b4\u0340\3\2\2\2\u00b6\u034d\3\2"+
		"\2\2\u00b8\u034f\3\2\2\2\u00ba\u0351\3\2\2\2\u00bc\u0353\3\2\2\2\u00be"+
		"\u0355\3\2\2\2\u00c0\u0357\3\2\2\2\u00c2\u035c\3\2\2\2\u00c4\u035e\3\2"+
		"\2\2\u00c6\u0362\3\2\2\2\u00c8\u00c9\5\4\3\2\u00c9\u00ca\7\3\2\2\u00ca"+
		"\u00cc\3\2\2\2\u00cb\u00c8\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00cb\3\2"+
		"\2\2\u00cd\u00ce\3\2\2\2\u00ce\3\3\2\2\2\u00cf\u00d9\5\f\7\2\u00d0\u00d9"+
		"\5\16\b\2\u00d1\u00d9\5\6\4\2\u00d2\u00d9\5\24\13\2\u00d3\u00d9\5\22\n"+
		"\2\u00d4\u00d9\5\34\17\2\u00d5\u00d9\5\36\20\2\u00d6\u00d9\5\30\r\2\u00d7"+
		"\u00d9\5\32\16\2\u00d8\u00cf\3\2\2\2\u00d8\u00d0\3\2\2\2\u00d8\u00d1\3"+
		"\2\2\2\u00d8\u00d2\3\2\2\2\u00d8\u00d3\3\2\2\2\u00d8\u00d4\3\2\2\2\u00d8"+
		"\u00d5\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d8\u00d7\3\2\2\2\u00d9\5\3\2\2\2"+
		"\u00da\u00dd\5\b\5\2\u00db\u00dd\5\n\6\2\u00dc\u00da\3\2\2\2\u00dc\u00db"+
		"\3\2\2\2\u00dd\7\3\2\2\2\u00de\u00e1\5\20\t\2\u00df\u00e1\5L\'\2\u00e0"+
		"\u00de\3\2\2\2\u00e0\u00df\3\2\2\2\u00e1\u00e4\3\2\2\2\u00e2\u00e3\7\4"+
		"\2\2\u00e3\u00e5\5T+\2\u00e4\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\t"+
		"\3\2\2\2\u00e6\u00e9\5\26\f\2\u00e7\u00e9\5N(\2\u00e8\u00e6\3\2\2\2\u00e8"+
		"\u00e7\3\2\2\2\u00e9\13\3\2\2\2\u00ea\u00eb\7\5\2\2\u00eb\u00ec\7Z\2\2"+
		"\u00ec\u00ed\7\4\2\2\u00ed\u00ee\5\u00c6d\2\u00ee\r\3\2\2\2\u00ef\u00f0"+
		"\7\6\2\2\u00f0\u00f1\5T+\2\u00f1\17\3\2\2\2\u00f2\u00f3\5\"\22\2\u00f3"+
		"\u00f4\5H%\2\u00f4\u00f5\7\7\2\2\u00f5\u00f6\7Z\2\2\u00f6\21\3\2\2\2\u00f7"+
		"\u00f8\7\b\2\2\u00f8\u00f9\7\t\2\2\u00f9\u00fa\5\u008aF\2\u00fa\u00fb"+
		"\7\n\2\2\u00fb\u00ff\3\2\2\2\u00fc\u00fd\7\b\2\2\u00fd\u00ff\5\u008aF"+
		"\2\u00fe\u00f7\3\2\2\2\u00fe\u00fc\3\2\2\2\u00ff\23\3\2\2\2\u0100\u0102"+
		"\7\13\2\2\u0101\u0103\5\60\31\2\u0102\u0101\3\2\2\2\u0102\u0103\3\2\2"+
		"\2\u0103\u0106\3\2\2\2\u0104\u0107\5(\25\2\u0105\u0107\5*\26\2\u0106\u0104"+
		"\3\2\2\2\u0106\u0105\3\2\2\2\u0107\25\3\2\2\2\u0108\u010a\7\f\2\2\u0109"+
		"\u0108\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u010b\3\2\2\2\u010b\u010c\5H"+
		"%\2\u010c\u010d\7\7\2\2\u010d\u0110\7Z\2\2\u010e\u010f\7\4\2\2\u010f\u0111"+
		"\5T+\2\u0110\u010e\3\2\2\2\u0110\u0111\3\2\2\2\u0111\27\3\2\2\2\u0112"+
		"\u0113\7\r\2\2\u0113\u0114\5~@\2\u0114\31\3\2\2\2\u0115\u0116\7Z\2\2\u0116"+
		"\u0117\7\4\2\2\u0117\u0118\5T+\2\u0118\33\3\2\2\2\u0119\u011a\7\16\2\2"+
		"\u011a\u011b\7Z\2\2\u011b\u0124\7\t\2\2\u011c\u0121\5\6\4\2\u011d\u011e"+
		"\7\17\2\2\u011e\u0120\5\6\4\2\u011f\u011d\3\2\2\2\u0120\u0123\3\2\2\2"+
		"\u0121\u011f\3\2\2\2\u0121\u0122\3\2\2\2\u0122\u0125\3\2\2\2\u0123\u0121"+
		"\3\2\2\2\u0124\u011c\3\2\2\2\u0124\u0125\3\2\2\2\u0125\u0126\3\2\2\2\u0126"+
		"\u0127\7\n\2\2\u0127\u0128\7\4\2\2\u0128\u0129\5T+\2\u0129\35\3\2\2\2"+
		"\u012a\u012c\7\20\2\2\u012b\u012d\5\"\22\2\u012c\u012b\3\2\2\2\u012c\u012d"+
		"\3\2\2\2\u012d\u012e\3\2\2\2\u012e\u012f\5 \21\2\u012f\u0138\7\t\2\2\u0130"+
		"\u0135\5\6\4\2\u0131\u0132\7\17\2\2\u0132\u0134\5\6\4\2\u0133\u0131\3"+
		"\2\2\2\u0134\u0137\3\2\2\2\u0135\u0133\3\2\2\2\u0135\u0136\3\2\2\2\u0136"+
		"\u0139\3\2\2\2\u0137\u0135\3\2\2\2\u0138\u0130\3\2\2\2\u0138\u0139\3\2"+
		"\2\2\u0139\u013a\3\2\2\2\u013a\u013b\7\n\2\2\u013b\u013c\7\4\2\2\u013c"+
		"\u013d\5T+\2\u013d\37\3\2\2\2\u013e\u0147\7Z\2\2\u013f\u0140\7Z\2\2\u0140"+
		"\u0141\7\7\2\2\u0141\u0147\5&\24\2\u0142\u0143\5&\24\2\u0143\u0144\5$"+
		"\23\2\u0144\u0145\5&\24\2\u0145\u0147\3\2\2\2\u0146\u013e\3\2\2\2\u0146"+
		"\u013f\3\2\2\2\u0146\u0142\3\2\2\2\u0147!\3\2\2\2\u0148\u0149\7\21\2\2"+
		"\u0149#\3\2\2\2\u014a\u014b\7\22\2\2\u014b%\3\2\2\2\u014c\u014f\5X-\2"+
		"\u014d\u014f\7Z\2\2\u014e\u014c\3\2\2\2\u014e\u014d\3\2\2\2\u014f\'\3"+
		"\2\2\2\u0150\u0151\7\23\2\2\u0151)\3\2\2\2\u0152\u0155\5,\27\2\u0153\u0155"+
		"\5.\30\2\u0154\u0152\3\2\2\2\u0154\u0153\3\2\2\2\u0155+\3\2\2\2\u0156"+
		"\u0157\7\24\2\2\u0157\u0158\5T+\2\u0158-\3\2\2\2\u0159\u015a\7\25\2\2"+
		"\u015a\u015b\5T+\2\u015b/\3\2\2\2\u015c\u015d\7\26\2\2\u015d\u015e\5\62"+
		"\32\2\u015e\61\3\2\2\2\u015f\u0164\5\64\33\2\u0160\u0164\5\66\34\2\u0161"+
		"\u0164\58\35\2\u0162\u0164\5:\36\2\u0163\u015f\3\2\2\2\u0163\u0160\3\2"+
		"\2\2\u0163\u0161\3\2\2\2\u0163\u0162\3\2\2\2\u0164\63\3\2\2\2\u0165\u0166"+
		"\7\27\2\2\u0166\u0167\5<\37\2\u0167\65\3\2\2\2\u0168\u0169\7\30\2\2\u0169"+
		"\u016a\5<\37\2\u016a\67\3\2\2\2\u016b\u016c\7\31\2\2\u016c\u016d\5<\37"+
		"\2\u016d9\3\2\2\2\u016e\u0170\7\32\2\2\u016f\u0171\7\t\2\2\u0170\u016f"+
		"\3\2\2\2\u0170\u0171\3\2\2\2\u0171\u0172\3\2\2\2\u0172\u0173\7\33\2\2"+
		"\u0173\u0178\5\62\32\2\u0174\u0175\7\17\2\2\u0175\u0177\5\62\32\2\u0176"+
		"\u0174\3\2\2\2\u0177\u017a\3\2\2\2\u0178\u0176\3\2\2\2\u0178\u0179\3\2"+
		"\2\2\u0179\u017b\3\2\2\2\u017a\u0178\3\2\2\2\u017b\u017d\7\34\2\2\u017c"+
		"\u017e\7\n\2\2\u017d\u017c\3\2\2\2\u017d\u017e\3\2\2\2\u017e;\3\2\2\2"+
		"\u017f\u0180\7\t\2\2\u0180\u0181\5T+\2\u0181\u0182\7\17\2\2\u0182\u0183"+
		"\5> \2\u0183\u0184\7\17\2\2\u0184\u0185\5@!\2\u0185\u0186\7\17\2\2\u0186"+
		"\u0187\7\35\2\2\u0187\u0188\7\n\2\2\u0188=\3\2\2\2\u0189\u018a\t\2\2\2"+
		"\u018a?\3\2\2\2\u018b\u018c\t\3\2\2\u018cA\3\2\2\2\u018d\u0190\5D#\2\u018e"+
		"\u0190\5F$\2\u018f\u018d\3\2\2\2\u018f\u018e\3\2\2\2\u0190C\3\2\2\2\u0191"+
		"\u0192\7Z\2\2\u0192E\3\2\2\2\u0193\u0194\7Z\2\2\u0194\u0195\7\t\2\2\u0195"+
		"\u019a\5H%\2\u0196\u0197\7\17\2\2\u0197\u0199\5H%\2\u0198\u0196\3\2\2"+
		"\2\u0199\u019c\3\2\2\2\u019a\u0198\3\2\2\2\u019a\u019b\3\2\2\2\u019b\u019d"+
		"\3\2\2\2\u019c\u019a\3\2\2\2\u019d\u019e\7\n\2\2\u019eG\3\2\2\2\u019f"+
		"\u01a7\5\u00bc_\2\u01a0\u01a7\5\u00c0a\2\u01a1\u01a7\5\u00be`\2\u01a2"+
		"\u01a7\7Z\2\2\u01a3\u01a7\5R*\2\u01a4\u01a7\5\u00b6\\\2\u01a5\u01a7\5"+
		"J&\2\u01a6\u019f\3\2\2\2\u01a6\u01a0\3\2\2\2\u01a6\u01a1\3\2\2\2\u01a6"+
		"\u01a2\3\2\2\2\u01a6\u01a3\3\2\2\2\u01a6\u01a4\3\2\2\2\u01a6\u01a5\3\2"+
		"\2\2\u01a7I\3\2\2\2\u01a8\u01a9\7&\2\2\u01a9\u01aa\7\'\2\2\u01aa\u01ab"+
		"\5H%\2\u01abK\3\2\2\2\u01ac\u01ad\7(\2\2\u01ad\u01ae\5P)\2\u01ae\u01af"+
		"\7\'\2\2\u01af\u01b0\5\20\t\2\u01b0M\3\2\2\2\u01b1\u01b2\7(\2\2\u01b2"+
		"\u01b3\5P)\2\u01b3\u01b4\7\'\2\2\u01b4\u01b5\5\26\f\2\u01b5O\3\2\2\2\u01b6"+
		"\u01c0\7\33\2\2\u01b7\u01bc\5\u00b6\\\2\u01b8\u01b9\7\17\2\2\u01b9\u01bb"+
		"\5\u00b6\\\2\u01ba\u01b8\3\2\2\2\u01bb\u01be\3\2\2\2\u01bc\u01ba\3\2\2"+
		"\2\u01bc\u01bd\3\2\2\2\u01bd\u01c1\3\2\2\2\u01be\u01bc\3\2\2\2\u01bf\u01c1"+
		"\7)\2\2\u01c0\u01b7\3\2\2\2\u01c0\u01bf\3\2\2\2\u01c1\u01c2\3\2\2\2\u01c2"+
		"\u01c3\7\34\2\2\u01c3Q\3\2\2\2\u01c4\u01c5\7Z\2\2\u01c5\u01c6\7\t\2\2"+
		"\u01c6\u01c7\5n8\2\u01c7\u01c8\7\n\2\2\u01c8S\3\2\2\2\u01c9\u01ca\b+\1"+
		"\2\u01ca\u01d8\7Z\2\2\u01cb\u01d8\7*\2\2\u01cc\u01d8\7]\2\2\u01cd\u01d8"+
		"\5\u00c4c\2\u01ce\u01d8\5\u00c2b\2\u01cf\u01d8\5t;\2\u01d0\u01d8\5z>\2"+
		"\u01d1\u01d8\5\u00a2R\2\u01d2\u01d8\5\u009eP\2\u01d3\u01d8\5\u008aF\2"+
		"\u01d4\u01d8\5d\63\2\u01d5\u01d8\5l\67\2\u01d6\u01d8\5\u00acW\2\u01d7"+
		"\u01c9\3\2\2\2\u01d7\u01cb\3\2\2\2\u01d7\u01cc\3\2\2\2\u01d7\u01cd\3\2"+
		"\2\2\u01d7\u01ce\3\2\2\2\u01d7\u01cf\3\2\2\2\u01d7\u01d0\3\2\2\2\u01d7"+
		"\u01d1\3\2\2\2\u01d7\u01d2\3\2\2\2\u01d7\u01d3\3\2\2\2\u01d7\u01d4\3\2"+
		"\2\2\u01d7\u01d5\3\2\2\2\u01d7\u01d6\3\2\2\2\u01d8\u01df\3\2\2\2\u01d9"+
		"\u01da\f\3\2\2\u01da\u01db\5\u0080A\2\u01db\u01dc\5T+\4\u01dc\u01de\3"+
		"\2\2\2\u01dd\u01d9\3\2\2\2\u01de\u01e1\3\2\2\2\u01df\u01dd\3\2\2\2\u01df"+
		"\u01e0\3\2\2\2\u01e0U\3\2\2\2\u01e1\u01df\3\2\2\2\u01e2\u01ef\3\2\2\2"+
		"\u01e3\u01e4\7\t\2\2\u01e4\u01e5\5f\64\2\u01e5\u01e6\7\n\2\2\u01e6\u01ef"+
		"\3\2\2\2\u01e7\u01ef\7Z\2\2\u01e8\u01ef\7]\2\2\u01e9\u01ef\5\u0084C\2"+
		"\u01ea\u01ef\5\u00a2R\2\u01eb\u01ef\5\u009eP\2\u01ec\u01ef\5t;\2\u01ed"+
		"\u01ef\5j\66\2\u01ee\u01e2\3\2\2\2\u01ee\u01e3\3\2\2\2\u01ee\u01e7\3\2"+
		"\2\2\u01ee\u01e8\3\2\2\2\u01ee\u01e9\3\2\2\2\u01ee\u01ea\3\2\2\2\u01ee"+
		"\u01eb\3\2\2\2\u01ee\u01ec\3\2\2\2\u01ee\u01ed\3\2\2\2\u01efW\3\2\2\2"+
		"\u01f0\u01f3\5Z.\2\u01f1\u01f3\5\\/\2\u01f2\u01f0\3\2\2\2\u01f2\u01f1"+
		"\3\2\2\2\u01f3Y\3\2\2\2\u01f4\u01f5\t\4\2\2\u01f5[\3\2\2\2\u01f6\u01f7"+
		"\t\5\2\2\u01f7]\3\2\2\2\u01f8\u01f9\t\6\2\2\u01f9_\3\2\2\2\u01fa\u01fb"+
		"\7Z\2\2\u01fb\u01fc\7\7\2\2\u01fc\u01fd\5Z.\2\u01fda\3\2\2\2\u01fe\u01ff"+
		"\7Z\2\2\u01ff\u0200\7\7\2\2\u0200\u0201\5\\/\2\u0201c\3\2\2\2\u0202\u0205"+
		"\5f\64\2\u0203\u0206\5Z.\2\u0204\u0206\5`\61\2\u0205\u0203\3\2\2\2\u0205"+
		"\u0204\3\2\2\2\u0206\u0207\3\2\2\2\u0207\u0208\5f\64\2\u0208\u0212\3\2"+
		"\2\2\u0209\u020c\5n8\2\u020a\u020d\5\\/\2\u020b\u020d\5b\62\2\u020c\u020a"+
		"\3\2\2\2\u020c\u020b\3\2\2\2\u020d\u020e\3\2\2\2\u020e\u020f\5n8\2\u020f"+
		"\u0212\3\2\2\2\u0210\u0212\5p9\2\u0211\u0202\3\2\2\2\u0211\u0209\3\2\2"+
		"\2\u0211\u0210\3\2\2\2\u0212e\3\2\2\2\u0213\u0214\b\64\1\2\u0214\u0217"+
		"\5n8\2\u0215\u0218\5\\/\2\u0216\u0218\5b\62\2\u0217\u0215\3\2\2\2\u0217"+
		"\u0216\3\2\2\2\u0218\u0219\3\2\2\2\u0219\u021a\5n8\2\u021a\u021e\3\2\2"+
		"\2\u021b\u021e\5p9\2\u021c\u021e\5V,\2\u021d\u0213\3\2\2\2\u021d\u021b"+
		"\3\2\2\2\u021d\u021c\3\2\2\2\u021e\u0228\3\2\2\2\u021f\u0222\f\6\2\2\u0220"+
		"\u0223\5Z.\2\u0221\u0223\5`\61\2\u0222\u0220\3\2\2\2\u0222\u0221\3\2\2"+
		"\2\u0223\u0224\3\2\2\2\u0224\u0225\5f\64\7\u0225\u0227\3\2\2\2\u0226\u021f"+
		"\3\2\2\2\u0227\u022a\3\2\2\2\u0228\u0226\3\2\2\2\u0228\u0229\3\2\2\2\u0229"+
		"g\3\2\2\2\u022a\u0228\3\2\2\2\u022b\u0239\7Z\2\2\u022c\u0239\5\u00c2b"+
		"\2\u022d\u0239\5\u00c4c\2\u022e\u0239\5\u00c6d\2\u022f\u0239\5\u0084C"+
		"\2\u0230\u0239\5\u00a2R\2\u0231\u0239\5\u009eP\2\u0232\u0233\7\t\2\2\u0233"+
		"\u0234\5n8\2\u0234\u0235\7\n\2\2\u0235\u0239\3\2\2\2\u0236\u0239\5t;\2"+
		"\u0237\u0239\5j\66\2\u0238\u022b\3\2\2\2\u0238\u022c\3\2\2\2\u0238\u022d"+
		"\3\2\2\2\u0238\u022e\3\2\2\2\u0238\u022f\3\2\2\2\u0238\u0230\3\2\2\2\u0238"+
		"\u0231\3\2\2\2\u0238\u0232\3\2\2\2\u0238\u0236\3\2\2\2\u0238\u0237\3\2"+
		"\2\2\u0239i\3\2\2\2\u023a\u023b\7Z\2\2\u023b\u023c\7?\2\2\u023c\u0242"+
		"\7Z\2\2\u023d\u023e\5\u0084C\2\u023e\u023f\7?\2\2\u023f\u0240\7Z\2\2\u0240"+
		"\u0242\3\2\2\2\u0241\u023a\3\2\2\2\u0241\u023d\3\2\2\2\u0242k\3\2\2\2"+
		"\u0243\u0249\5r:\2\u0244\u0245\5n8\2\u0245\u0246\5^\60\2\u0246\u0247\5"+
		"n8\2\u0247\u0249\3\2\2\2\u0248\u0243\3\2\2\2\u0248\u0244\3\2\2\2\u0249"+
		"m\3\2\2\2\u024a\u024b\b8\1\2\u024b\u024e\5r:\2\u024c\u024e\5h\65\2\u024d"+
		"\u024a\3\2\2\2\u024d\u024c\3\2\2\2\u024e\u0255\3\2\2\2\u024f\u0250\f\4"+
		"\2\2\u0250\u0251\5^\60\2\u0251\u0252\5n8\5\u0252\u0254\3\2\2\2\u0253\u024f"+
		"\3\2\2\2\u0254\u0257\3\2\2\2\u0255\u0253\3\2\2\2\u0255\u0256\3\2\2\2\u0256"+
		"o\3\2\2\2\u0257\u0255\3\2\2\2\u0258\u0259\7@\2\2\u0259\u025a\5T+\2\u025a"+
		"q\3\2\2\2\u025b\u025c\7>\2\2\u025c\u025d\5n8\2\u025ds\3\2\2\2\u025e\u0261"+
		"\7Z\2\2\u025f\u0262\5x=\2\u0260\u0262\5v<\2\u0261\u025f\3\2\2\2\u0261"+
		"\u0260\3\2\2\2\u0262u\3\2\2\2\u0263\u026c\7\t\2\2\u0264\u0269\5T+\2\u0265"+
		"\u0266\7\17\2\2\u0266\u0268\5T+\2\u0267\u0265\3\2\2\2\u0268\u026b\3\2"+
		"\2\2\u0269\u0267\3\2\2\2\u0269\u026a\3\2\2\2\u026a\u026d\3\2\2\2\u026b"+
		"\u0269\3\2\2\2\u026c\u0264\3\2\2\2\u026c\u026d\3\2\2\2\u026d\u026e\3\2"+
		"\2\2\u026e\u026f\7\n\2\2\u026fw\3\2\2\2\u0270\u0271\7\t\2\2\u0271\u0272"+
		"\5\u00b4[\2\u0272\u0273\7\n\2\2\u0273\u0274\7\t\2\2\u0274\u0275\5T+\2"+
		"\u0275\u0276\7\n\2\2\u0276y\3\2\2\2\u0277\u0278\7\t\2\2\u0278\u0279\5"+
		"T+\2\u0279\u027a\7\n\2\2\u027a{\3\2\2\2\u027b\u027c\7Z\2\2\u027c}\3\2"+
		"\2\2\u027d\u027e\5\u00c6d\2\u027e\177\3\2\2\2\u027f\u0280\7A\2\2\u0280"+
		"\u0281\7Z\2\2\u0281\u0284\7A\2\2\u0282\u0284\5\u0082B\2\u0283\u027f\3"+
		"\2\2\2\u0283\u0282\3\2\2\2\u0284\u0081\3\2\2\2\u0285\u0286\t\7\2\2\u0286"+
		"\u0083\3\2\2\2\u0287\u0288\7Z\2\2\u0288\u028d\5\u0090I\2\u0289\u028a\5"+
		"\u0090I\2\u028a\u028b\5\u0090I\2\u028b\u028d\3\2\2\2\u028c\u0287\3\2\2"+
		"\2\u028c\u0289\3\2\2\2\u028d\u0085\3\2\2\2\u028e\u028f\7D\2\2\u028f\u0290"+
		"\7Z\2\2\u0290\u0294\7\'\2\2\u0291\u0292\5\u0088E\2\u0292\u0293\7\3\2\2"+
		"\u0293\u0295\3\2\2\2\u0294\u0291\3\2\2\2\u0295\u0296\3\2\2\2\u0296\u0294"+
		"\3\2\2\2\u0296\u0297\3\2\2\2\u0297\u0298\3\2\2\2\u0298\u0299\7E\2\2\u0299"+
		"\u0087\3\2\2\2\u029a\u029d\5t;\2\u029b\u029d\7Z\2\2\u029c\u029a\3\2\2"+
		"\2\u029c\u029b\3\2\2\2\u029d\u029e\3\2\2\2\u029e\u029f\7F\2\2\u029f\u02a0"+
		"\5T+\2\u02a0\u0089\3\2\2\2\u02a1\u02a2\bF\1\2\u02a2\u02a6\5\u0098M\2\u02a3"+
		"\u02a6\5\u008cG\2\u02a4\u02a6\5\u0094K\2\u02a5\u02a1\3\2\2\2\u02a5\u02a3"+
		"\3\2\2\2\u02a5\u02a4\3\2\2\2\u02a6\u02ac\3\2\2\2\u02a7\u02a8\f\5\2\2\u02a8"+
		"\u02a9\7G\2\2\u02a9\u02ab\5\u008aF\6\u02aa\u02a7\3\2\2\2\u02ab\u02ae\3"+
		"\2\2\2\u02ac\u02aa\3\2\2\2\u02ac\u02ad\3\2\2\2\u02ad\u008b\3\2\2\2\u02ae"+
		"\u02ac\3\2\2\2\u02af\u02b2\5\u008eH\2\u02b0\u02b2\5\u0092J\2\u02b1\u02af"+
		"\3\2\2\2\u02b1\u02b0\3\2\2\2\u02b2\u008d\3\2\2\2\u02b3\u02b4\7\33\2\2"+
		"\u02b4\u02b7\7\34\2\2\u02b5\u02b7\5\u0090I\2\u02b6\u02b3\3\2\2\2\u02b6"+
		"\u02b5\3\2\2\2\u02b7\u008f\3\2\2\2\u02b8\u02b9\7\33\2\2\u02b9\u02bb\5"+
		"\u0096L\2\u02ba\u02bc\7\17\2\2\u02bb\u02ba\3\2\2\2\u02bb\u02bc\3\2\2\2"+
		"\u02bc\u02bd\3\2\2\2\u02bd\u02be\7\34\2\2\u02be\u0091\3\2\2\2\u02bf\u02c0"+
		"\7\33\2\2\u02c0\u02c1\5\u0096L\2\u02c1\u02c2\7H\2\2\u02c2\u02c3\5\u00b4"+
		"[\2\u02c3\u02c4\7\34\2\2\u02c4\u0093\3\2\2\2\u02c5\u02c6\7I\2\2\u02c6"+
		"\u02ce\5\u0096L\2\u02c7\u02c9\7\17\2\2\u02c8\u02c7\3\2\2\2\u02c8\u02c9"+
		"\3\2\2\2\u02c9\u02ca\3\2\2\2\u02ca\u02cb\7H\2\2\u02cb\u02cd\5\u0096L\2"+
		"\u02cc\u02c8\3\2\2\2\u02cd\u02d0\3\2\2\2\u02ce\u02cc\3\2\2\2\u02ce\u02cf"+
		"\3\2\2\2\u02cf\u02d2\3\2\2\2\u02d0\u02ce\3\2\2\2\u02d1\u02d3\7H\2\2\u02d2"+
		"\u02d1\3\2\2\2\u02d2\u02d3\3\2\2\2\u02d3\u02d4\3\2\2\2\u02d4\u02d5\7J"+
		"\2\2\u02d5\u0095\3\2\2\2\u02d6\u02db\5T+\2\u02d7\u02d8\7\17\2\2\u02d8"+
		"\u02da\5T+\2\u02d9\u02d7\3\2\2\2\u02da\u02dd\3\2\2\2\u02db\u02d9\3\2\2"+
		"\2\u02db\u02dc\3\2\2\2\u02dc\u0097\3\2\2\2\u02dd\u02db\3\2\2\2\u02de\u02e5"+
		"\5~@\2\u02df\u02e5\7Z\2\2\u02e0\u02e5\5\u00a2R\2\u02e1\u02e5\5\u0084C"+
		"\2\u02e2\u02e5\5t;\2\u02e3\u02e5\5j\66\2\u02e4\u02de\3\2\2\2\u02e4\u02df"+
		"\3\2\2\2\u02e4\u02e0\3\2\2\2\u02e4\u02e1\3\2\2\2\u02e4\u02e2\3\2\2\2\u02e4"+
		"\u02e3\3\2\2\2\u02e5\u0099\3\2\2\2\u02e6\u02eb\7Z\2\2\u02e7\u02e8\7\17"+
		"\2\2\u02e8\u02ea\7Z\2\2\u02e9\u02e7\3\2\2\2\u02ea\u02ed\3\2\2\2\u02eb"+
		"\u02e9\3\2\2\2\u02eb\u02ec\3\2\2\2\u02ec\u02ee\3\2\2\2\u02ed\u02eb\3\2"+
		"\2\2\u02ee\u02ef\7\67\2\2\u02ef\u02f1\5\u00acW\2\u02f0\u02f2\5\u009cO"+
		"\2\u02f1\u02f0\3\2\2\2\u02f1\u02f2\3\2\2\2\u02f2\u009b\3\2\2\2\u02f3\u02f4"+
		"\7K\2\2\u02f4\u02f5\5f\64\2\u02f5\u009d\3\2\2\2\u02f6\u02f7\7L\2\2\u02f7"+
		"\u02f8\7M\2\2\u02f8\u02fd\5\u00a0Q\2\u02f9\u02fa\7\17\2\2\u02fa\u02fc"+
		"\5\u00a0Q\2\u02fb\u02f9\3\2\2\2\u02fc\u02ff\3\2\2\2\u02fd\u02fb\3\2\2"+
		"\2\u02fd\u02fe\3\2\2\2\u02fe\u0300\3\2\2\2\u02ff\u02fd\3\2\2\2\u0300\u0301"+
		"\7N\2\2\u0301\u0302\7\67\2\2\u0302\u0303\5T+\2\u0303\u009f\3\2\2\2\u0304"+
		"\u0307\5\6\4\2\u0305\u0307\5\16\b\2\u0306\u0304\3\2\2\2\u0306\u0305\3"+
		"\2\2\2\u0307\u00a1\3\2\2\2\u0308\u0309\7O\2\2\u0309\u030a\5\u00a4S\2\u030a"+
		"\u00a3\3\2\2\2\u030b\u030c\5T+\2\u030c\u030d\7P\2\2\u030d\u0310\5T+\2"+
		"\u030e\u0311\5\u00a6T\2\u030f\u0311\5\u00a8U\2\u0310\u030e\3\2\2\2\u0310"+
		"\u030f\3\2\2\2\u0311\u00a5\3\2\2\2\u0312\u0313\7Q\2\2\u0313\u0314\5T+"+
		"\2\u0314\u0315\7R\2\2\u0315\u00a7\3\2\2\2\u0316\u0317\7S\2\2\u0317\u0318"+
		"\5\u00a4S\2\u0318\u00a9\3\2\2\2\u0319\u031d\5\u00aeX\2\u031a\u031d\5\u00b6"+
		"\\\2\u031b\u031d\5\u00b0Y\2\u031c\u0319\3\2\2\2\u031c\u031a\3\2\2\2\u031c"+
		"\u031b\3\2\2\2\u031d\u00ab\3\2\2\2\u031e\u031f\bW\1\2\u031f\u0320\5\u00aa"+
		"V\2\u0320\u0327\3\2\2\2\u0321\u0322\f\3\2\2\u0322\u0323\5\u0082B\2\u0323"+
		"\u0324\5\u00acW\4\u0324\u0326\3\2\2\2\u0325\u0321\3\2\2\2\u0326\u0329"+
		"\3\2\2\2\u0327\u0325\3\2\2\2\u0327\u0328\3\2\2\2\u0328\u00ad\3\2\2\2\u0329"+
		"\u0327\3\2\2\2\u032a\u032b\7M\2\2\u032b\u0331\7N\2\2\u032c\u032d\7M\2"+
		"\2\u032d\u032e\5\u00b2Z\2\u032e\u032f\7N\2\2\u032f\u0331\3\2\2\2\u0330"+
		"\u032a\3\2\2\2\u0330\u032c\3\2\2\2\u0331\u00af\3\2\2\2\u0332\u0333\7M"+
		"\2\2\u0333\u0334\5T+\2\u0334\u0335\7H\2\2\u0335\u0336\5\u00b4[\2\u0336"+
		"\u0337\7N\2\2\u0337\u00b1\3\2\2\2\u0338\u033d\5T+\2\u0339\u033a\7\17\2"+
		"\2\u033a\u033c\5T+\2\u033b\u0339\3\2\2\2\u033c\u033f\3\2\2\2\u033d\u033b"+
		"\3\2\2\2\u033d\u033e\3\2\2\2\u033e\u00b3\3\2\2\2\u033f\u033d\3\2\2\2\u0340"+
		"\u0345\5\u009aN\2\u0341\u0342\7\17\2\2\u0342\u0344\5\u009aN\2\u0343\u0341"+
		"\3\2\2\2\u0344\u0347\3\2\2\2\u0345\u0343\3\2\2\2\u0345\u0346\3\2\2\2\u0346"+
		"\u00b5\3\2\2\2\u0347\u0345\3\2\2\2\u0348\u0349\5\u00b8]\2\u0349\u034a"+
		"\7T\2\2\u034a\u034b\5\u00ba^\2\u034b\u034e\3\2\2\2\u034c\u034e\7Z\2\2"+
		"\u034d\u0348\3\2\2\2\u034d\u034c\3\2\2\2\u034e\u00b7\3\2\2\2\u034f\u0350"+
		"\5n8\2\u0350\u00b9\3\2\2\2\u0351\u0352\5n8\2\u0352\u00bb\3\2\2\2\u0353"+
		"\u0354\7)\2\2\u0354\u00bd\3\2\2\2\u0355\u0356\7U\2\2\u0356\u00bf\3\2\2"+
		"\2\u0357\u0358\7V\2\2\u0358\u00c1\3\2\2\2\u0359\u035d\7[\2\2\u035a\u035b"+
		"\7>\2\2\u035b\u035d\7[\2\2\u035c\u0359\3\2\2\2\u035c\u035a\3\2\2\2\u035d"+
		"\u00c3\3\2\2\2\u035e\u035f\5\u00c2b\2\u035f\u0360\7?\2\2\u0360\u0361\7"+
		"[\2\2\u0361\u00c5\3\2\2\2\u0362\u0363\7W\2\2\u0363\u00c7\3\2\2\2K\u00cd"+
		"\u00d8\u00dc\u00e0\u00e4\u00e8\u00fe\u0102\u0106\u0109\u0110\u0121\u0124"+
		"\u012c\u0135\u0138\u0146\u014e\u0154\u0163\u0170\u0178\u017d\u018f\u019a"+
		"\u01a6\u01bc\u01c0\u01d7\u01df\u01ee\u01f2\u0205\u020c\u0211\u0217\u021d"+
		"\u0222\u0228\u0238\u0241\u0248\u024d\u0255\u0261\u0269\u026c\u0283\u028c"+
		"\u0296\u029c\u02a5\u02ac\u02b1\u02b6\u02bb\u02c8\u02ce\u02d2\u02db\u02e4"+
		"\u02eb\u02f1\u02fd\u0306\u0310\u031c\u0327\u0330\u033d\u0345\u034d\u035c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}