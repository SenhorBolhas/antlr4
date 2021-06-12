// Generated from d:\Materias\Compiladores\antlr4\g4Files\LabeledExpr.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LabeledExprParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IF=1, ELSE=2, WHILE=3, FOR=4, PRINT=5, PRINTSTR=6, OPREL=7, MUL=8, DIV=9, 
		ADD=10, SUB=11, EQ=12, ABCHAV=13, FECHAV=14, APARE=15, FPARE=16, VIG=17, 
		PTVIG=18, TYPES=19, CONST=20, ID=21, INT=22, FLOAT=23, STRING=24, COMMENT=25, 
		NEWLINE=26, WS=27;
	public static final int
		RULE_prog = 0, RULE_stat = 1, RULE_declaration = 2, RULE_declarationSimple = 3, 
		RULE_declarationConst = 4, RULE_conditional = 5, RULE_conditionalExecExpr = 6, 
		RULE_whileloop = 7, RULE_forloop = 8, RULE_asignNumberExpr = 9, RULE_asignStringExpr = 10, 
		RULE_expr = 11, RULE_stringexpr = 12, RULE_concatStringexpr = 13, RULE_sumStringExpr = 14, 
		RULE_comparisson = 15;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "stat", "declaration", "declarationSimple", "declarationConst", 
			"conditional", "conditionalExecExpr", "whileloop", "forloop", "asignNumberExpr", 
			"asignStringExpr", "expr", "stringexpr", "concatStringexpr", "sumStringExpr", 
			"comparisson"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'if'", "'else'", "'while'", "'for'", "'println'", "'printlnstr'", 
			null, "'*'", "'/'", "'+'", "'-'", "'='", "'{'", "'}'", "'('", "')'", 
			"','", "';'", null, "'const'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IF", "ELSE", "WHILE", "FOR", "PRINT", "PRINTSTR", "OPREL", "MUL", 
			"DIV", "ADD", "SUB", "EQ", "ABCHAV", "FECHAV", "APARE", "FPARE", "VIG", 
			"PTVIG", "TYPES", "CONST", "ID", "INT", "FLOAT", "STRING", "COMMENT", 
			"NEWLINE", "WS"
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
	public String getGrammarFileName() { return "LabeledExpr.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LabeledExprParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(32);
				stat();
				}
				}
				setState(35); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << PRINT) | (1L << PRINTSTR) | (1L << APARE) | (1L << TYPES) | (1L << CONST) | (1L << ID) | (1L << INT) | (1L << FLOAT) | (1L << NEWLINE))) != 0) );
			}
		}
		catch (RecognitionException re) {
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
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
	 
		public StatContext() { }
		public void copyFrom(StatContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CondiContext extends StatContext {
		public ConditionalContext conditional() {
			return getRuleContext(ConditionalContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(LabeledExprParser.NEWLINE, 0); }
		public CondiContext(StatContext ctx) { copyFrom(ctx); }
	}
	public static class ForLoopCContext extends StatContext {
		public ForloopContext forloop() {
			return getRuleContext(ForloopContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(LabeledExprParser.NEWLINE, 0); }
		public ForLoopCContext(StatContext ctx) { copyFrom(ctx); }
	}
	public static class AssingContext extends StatContext {
		public TerminalNode NEWLINE() { return getToken(LabeledExprParser.NEWLINE, 0); }
		public AsignNumberExprContext asignNumberExpr() {
			return getRuleContext(AsignNumberExprContext.class,0);
		}
		public AsignStringExprContext asignStringExpr() {
			return getRuleContext(AsignStringExprContext.class,0);
		}
		public AssingContext(StatContext ctx) { copyFrom(ctx); }
	}
	public static class BlankContext extends StatContext {
		public TerminalNode NEWLINE() { return getToken(LabeledExprParser.NEWLINE, 0); }
		public BlankContext(StatContext ctx) { copyFrom(ctx); }
	}
	public static class DeclarConstContext extends StatContext {
		public DeclarationConstContext declarationConst() {
			return getRuleContext(DeclarationConstContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(LabeledExprParser.NEWLINE, 0); }
		public DeclarConstContext(StatContext ctx) { copyFrom(ctx); }
	}
	public static class WhileLoopCContext extends StatContext {
		public WhileloopContext whileloop() {
			return getRuleContext(WhileloopContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(LabeledExprParser.NEWLINE, 0); }
		public WhileLoopCContext(StatContext ctx) { copyFrom(ctx); }
	}
	public static class DeclarSimpleContext extends StatContext {
		public DeclarationSimpleContext declarationSimple() {
			return getRuleContext(DeclarationSimpleContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(LabeledExprParser.NEWLINE, 0); }
		public DeclarSimpleContext(StatContext ctx) { copyFrom(ctx); }
	}
	public static class DeclarContext extends StatContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(LabeledExprParser.NEWLINE, 0); }
		public DeclarContext(StatContext ctx) { copyFrom(ctx); }
	}
	public static class PrintlnContext extends StatContext {
		public TerminalNode PRINT() { return getToken(LabeledExprParser.PRINT, 0); }
		public TerminalNode APARE() { return getToken(LabeledExprParser.APARE, 0); }
		public TerminalNode FPARE() { return getToken(LabeledExprParser.FPARE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public StringexprContext stringexpr() {
			return getRuleContext(StringexprContext.class,0);
		}
		public PrintlnContext(StatContext ctx) { copyFrom(ctx); }
	}
	public static class ExpContext extends StatContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(LabeledExprParser.NEWLINE, 0); }
		public ExpContext(StatContext ctx) { copyFrom(ctx); }
	}
	public static class PrintlnstrContext extends StatContext {
		public TerminalNode PRINTSTR() { return getToken(LabeledExprParser.PRINTSTR, 0); }
		public TerminalNode APARE() { return getToken(LabeledExprParser.APARE, 0); }
		public TerminalNode FPARE() { return getToken(LabeledExprParser.FPARE, 0); }
		public ConcatStringexprContext concatStringexpr() {
			return getRuleContext(ConcatStringexprContext.class,0);
		}
		public StringexprContext stringexpr() {
			return getRuleContext(StringexprContext.class,0);
		}
		public PrintlnstrContext(StatContext ctx) { copyFrom(ctx); }
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stat);
		try {
			setState(81);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				_localctx = new WhileLoopCContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(37);
				whileloop();
				setState(38);
				match(NEWLINE);
				}
				break;
			case 2:
				_localctx = new ForLoopCContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(40);
				forloop();
				setState(41);
				match(NEWLINE);
				}
				break;
			case 3:
				_localctx = new CondiContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(43);
				conditional();
				setState(44);
				match(NEWLINE);
				}
				break;
			case 4:
				_localctx = new ExpContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(46);
				expr(0);
				setState(47);
				match(NEWLINE);
				}
				break;
			case 5:
				_localctx = new DeclarContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(49);
				declaration();
				setState(50);
				match(NEWLINE);
				}
				break;
			case 6:
				_localctx = new DeclarSimpleContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(52);
				declarationSimple();
				setState(53);
				match(NEWLINE);
				}
				break;
			case 7:
				_localctx = new DeclarConstContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(55);
				declarationConst();
				setState(56);
				match(NEWLINE);
				}
				break;
			case 8:
				_localctx = new AssingContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(60);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(58);
					asignNumberExpr();
					}
					break;
				case 2:
					{
					setState(59);
					asignStringExpr();
					}
					break;
				}
				setState(62);
				match(NEWLINE);
				}
				break;
			case 9:
				_localctx = new PrintlnContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(64);
				match(PRINT);
				setState(65);
				match(APARE);
				setState(68);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case APARE:
				case ID:
				case INT:
				case FLOAT:
					{
					setState(66);
					expr(0);
					}
					break;
				case STRING:
					{
					setState(67);
					stringexpr();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(70);
				match(FPARE);
				}
				break;
			case 10:
				_localctx = new PrintlnstrContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(72);
				match(PRINTSTR);
				setState(73);
				match(APARE);
				setState(76);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(74);
					concatStringexpr();
					}
					break;
				case 2:
					{
					setState(75);
					stringexpr();
					}
					break;
				}
				setState(78);
				match(FPARE);
				}
				break;
			case 11:
				_localctx = new BlankContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(80);
				match(NEWLINE);
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

	public static class DeclarationContext extends ParserRuleContext {
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
	 
		public DeclarationContext() { }
		public void copyFrom(DeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DeclarationExprContext extends DeclarationContext {
		public List<TerminalNode> TYPES() { return getTokens(LabeledExprParser.TYPES); }
		public TerminalNode TYPES(int i) {
			return getToken(LabeledExprParser.TYPES, i);
		}
		public List<TerminalNode> ID() { return getTokens(LabeledExprParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(LabeledExprParser.ID, i);
		}
		public TerminalNode PTVIG() { return getToken(LabeledExprParser.PTVIG, 0); }
		public List<TerminalNode> VIG() { return getTokens(LabeledExprParser.VIG); }
		public TerminalNode VIG(int i) {
			return getToken(LabeledExprParser.VIG, i);
		}
		public DeclarationExprContext(DeclarationContext ctx) { copyFrom(ctx); }
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaration);
		int _la;
		try {
			_localctx = new DeclarationExprContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			match(TYPES);
			setState(84);
			match(ID);
			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIG) {
				{
				{
				setState(85);
				match(VIG);
				setState(86);
				match(TYPES);
				setState(87);
				match(ID);
				}
				}
				setState(92);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(93);
			match(PTVIG);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationSimpleContext extends ParserRuleContext {
		public DeclarationSimpleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationSimple; }
	 
		public DeclarationSimpleContext() { }
		public void copyFrom(DeclarationSimpleContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DeclarationSimpleExprContext extends DeclarationSimpleContext {
		public TerminalNode TYPES() { return getToken(LabeledExprParser.TYPES, 0); }
		public List<TerminalNode> ID() { return getTokens(LabeledExprParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(LabeledExprParser.ID, i);
		}
		public TerminalNode PTVIG() { return getToken(LabeledExprParser.PTVIG, 0); }
		public List<TerminalNode> VIG() { return getTokens(LabeledExprParser.VIG); }
		public TerminalNode VIG(int i) {
			return getToken(LabeledExprParser.VIG, i);
		}
		public DeclarationSimpleExprContext(DeclarationSimpleContext ctx) { copyFrom(ctx); }
	}

	public final DeclarationSimpleContext declarationSimple() throws RecognitionException {
		DeclarationSimpleContext _localctx = new DeclarationSimpleContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declarationSimple);
		int _la;
		try {
			_localctx = new DeclarationSimpleExprContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			match(TYPES);
			setState(96);
			match(ID);
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIG) {
				{
				{
				setState(97);
				match(VIG);
				setState(98);
				match(ID);
				}
				}
				setState(103);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(104);
			match(PTVIG);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationConstContext extends ParserRuleContext {
		public DeclarationConstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationConst; }
	 
		public DeclarationConstContext() { }
		public void copyFrom(DeclarationConstContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DeclarationConstExprContext extends DeclarationConstContext {
		public TerminalNode CONST() { return getToken(LabeledExprParser.CONST, 0); }
		public TerminalNode TYPES() { return getToken(LabeledExprParser.TYPES, 0); }
		public TerminalNode ID() { return getToken(LabeledExprParser.ID, 0); }
		public TerminalNode EQ() { return getToken(LabeledExprParser.EQ, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public StringexprContext stringexpr() {
			return getRuleContext(StringexprContext.class,0);
		}
		public DeclarationConstExprContext(DeclarationConstContext ctx) { copyFrom(ctx); }
	}

	public final DeclarationConstContext declarationConst() throws RecognitionException {
		DeclarationConstContext _localctx = new DeclarationConstContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_declarationConst);
		try {
			_localctx = new DeclarationConstExprContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			match(CONST);
			setState(107);
			match(TYPES);
			setState(108);
			match(ID);
			setState(109);
			match(EQ);
			setState(112);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case APARE:
			case ID:
			case INT:
			case FLOAT:
				{
				setState(110);
				expr(0);
				}
				break;
			case STRING:
				{
				setState(111);
				stringexpr();
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

	public static class ConditionalContext extends ParserRuleContext {
		public ConditionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional; }
	 
		public ConditionalContext() { }
		public void copyFrom(ConditionalContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ConditionalExprContext extends ConditionalContext {
		public TerminalNode IF() { return getToken(LabeledExprParser.IF, 0); }
		public TerminalNode APARE() { return getToken(LabeledExprParser.APARE, 0); }
		public ComparissonContext comparisson() {
			return getRuleContext(ComparissonContext.class,0);
		}
		public TerminalNode FPARE() { return getToken(LabeledExprParser.FPARE, 0); }
		public List<TerminalNode> ABCHAV() { return getTokens(LabeledExprParser.ABCHAV); }
		public TerminalNode ABCHAV(int i) {
			return getToken(LabeledExprParser.ABCHAV, i);
		}
		public List<ConditionalExecExprContext> conditionalExecExpr() {
			return getRuleContexts(ConditionalExecExprContext.class);
		}
		public ConditionalExecExprContext conditionalExecExpr(int i) {
			return getRuleContext(ConditionalExecExprContext.class,i);
		}
		public List<TerminalNode> FECHAV() { return getTokens(LabeledExprParser.FECHAV); }
		public TerminalNode FECHAV(int i) {
			return getToken(LabeledExprParser.FECHAV, i);
		}
		public TerminalNode ELSE() { return getToken(LabeledExprParser.ELSE, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(LabeledExprParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(LabeledExprParser.NEWLINE, i);
		}
		public ConditionalExprContext(ConditionalContext ctx) { copyFrom(ctx); }
	}

	public final ConditionalContext conditional() throws RecognitionException {
		ConditionalContext _localctx = new ConditionalContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_conditional);
		int _la;
		try {
			int _alt;
			_localctx = new ConditionalExprContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(IF);
			setState(115);
			match(APARE);
			setState(116);
			comparisson();
			setState(117);
			match(FPARE);
			setState(118);
			match(ABCHAV);
			setState(119);
			conditionalExecExpr();
			setState(120);
			match(FECHAV);
			setState(132);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(121);
				match(ELSE);
				setState(122);
				match(ABCHAV);
				setState(126);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(123);
						match(NEWLINE);
						}
						} 
					}
					setState(128);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				}
				setState(129);
				conditionalExecExpr();
				setState(130);
				match(FECHAV);
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

	public static class ConditionalExecExprContext extends ParserRuleContext {
		public ConditionalExecExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalExecExpr; }
	 
		public ConditionalExecExprContext() { }
		public void copyFrom(ConditionalExecExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ConditionalExecContext extends ConditionalExecExprContext {
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public ConditionalExecContext(ConditionalExecExprContext ctx) { copyFrom(ctx); }
	}

	public final ConditionalExecExprContext conditionalExecExpr() throws RecognitionException {
		ConditionalExecExprContext _localctx = new ConditionalExecExprContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_conditionalExecExpr);
		int _la;
		try {
			_localctx = new ConditionalExecContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(135); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(134);
				stat();
				}
				}
				setState(137); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << PRINT) | (1L << PRINTSTR) | (1L << APARE) | (1L << TYPES) | (1L << CONST) | (1L << ID) | (1L << INT) | (1L << FLOAT) | (1L << NEWLINE))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileloopContext extends ParserRuleContext {
		public WhileloopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileloop; }
	 
		public WhileloopContext() { }
		public void copyFrom(WhileloopContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class WhileLoopExprContext extends WhileloopContext {
		public TerminalNode WHILE() { return getToken(LabeledExprParser.WHILE, 0); }
		public TerminalNode APARE() { return getToken(LabeledExprParser.APARE, 0); }
		public ComparissonContext comparisson() {
			return getRuleContext(ComparissonContext.class,0);
		}
		public TerminalNode FPARE() { return getToken(LabeledExprParser.FPARE, 0); }
		public TerminalNode ABCHAV() { return getToken(LabeledExprParser.ABCHAV, 0); }
		public TerminalNode FECHAV() { return getToken(LabeledExprParser.FECHAV, 0); }
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public WhileLoopExprContext(WhileloopContext ctx) { copyFrom(ctx); }
	}

	public final WhileloopContext whileloop() throws RecognitionException {
		WhileloopContext _localctx = new WhileloopContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_whileloop);
		int _la;
		try {
			_localctx = new WhileLoopExprContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(WHILE);
			setState(140);
			match(APARE);
			setState(141);
			comparisson();
			setState(142);
			match(FPARE);
			setState(143);
			match(ABCHAV);
			setState(145); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(144);
				stat();
				}
				}
				setState(147); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << PRINT) | (1L << PRINTSTR) | (1L << APARE) | (1L << TYPES) | (1L << CONST) | (1L << ID) | (1L << INT) | (1L << FLOAT) | (1L << NEWLINE))) != 0) );
			setState(149);
			match(FECHAV);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForloopContext extends ParserRuleContext {
		public ForloopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forloop; }
	 
		public ForloopContext() { }
		public void copyFrom(ForloopContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ForLoopExprContext extends ForloopContext {
		public TerminalNode FOR() { return getToken(LabeledExprParser.FOR, 0); }
		public TerminalNode APARE() { return getToken(LabeledExprParser.APARE, 0); }
		public AsignNumberExprContext asignNumberExpr() {
			return getRuleContext(AsignNumberExprContext.class,0);
		}
		public TerminalNode PTVIG() { return getToken(LabeledExprParser.PTVIG, 0); }
		public ComparissonContext comparisson() {
			return getRuleContext(ComparissonContext.class,0);
		}
		public TerminalNode FPARE() { return getToken(LabeledExprParser.FPARE, 0); }
		public TerminalNode ABCHAV() { return getToken(LabeledExprParser.ABCHAV, 0); }
		public TerminalNode FECHAV() { return getToken(LabeledExprParser.FECHAV, 0); }
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public ForLoopExprContext(ForloopContext ctx) { copyFrom(ctx); }
	}

	public final ForloopContext forloop() throws RecognitionException {
		ForloopContext _localctx = new ForloopContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_forloop);
		int _la;
		try {
			_localctx = new ForLoopExprContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			match(FOR);
			setState(152);
			match(APARE);
			setState(153);
			asignNumberExpr();
			setState(154);
			match(PTVIG);
			setState(155);
			comparisson();
			setState(156);
			match(FPARE);
			setState(157);
			match(ABCHAV);
			setState(159); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(158);
				stat();
				}
				}
				setState(161); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << PRINT) | (1L << PRINTSTR) | (1L << APARE) | (1L << TYPES) | (1L << CONST) | (1L << ID) | (1L << INT) | (1L << FLOAT) | (1L << NEWLINE))) != 0) );
			setState(163);
			match(FECHAV);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AsignNumberExprContext extends ParserRuleContext {
		public AsignNumberExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignNumberExpr; }
	 
		public AsignNumberExprContext() { }
		public void copyFrom(AsignNumberExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AssingNumberContext extends AsignNumberExprContext {
		public TerminalNode ID() { return getToken(LabeledExprParser.ID, 0); }
		public TerminalNode EQ() { return getToken(LabeledExprParser.EQ, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssingNumberContext(AsignNumberExprContext ctx) { copyFrom(ctx); }
	}

	public final AsignNumberExprContext asignNumberExpr() throws RecognitionException {
		AsignNumberExprContext _localctx = new AsignNumberExprContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_asignNumberExpr);
		try {
			_localctx = new AssingNumberContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			match(ID);
			setState(166);
			match(EQ);
			setState(167);
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

	public static class AsignStringExprContext extends ParserRuleContext {
		public AsignStringExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignStringExpr; }
	 
		public AsignStringExprContext() { }
		public void copyFrom(AsignStringExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AssingStringContext extends AsignStringExprContext {
		public TerminalNode ID() { return getToken(LabeledExprParser.ID, 0); }
		public TerminalNode EQ() { return getToken(LabeledExprParser.EQ, 0); }
		public StringexprContext stringexpr() {
			return getRuleContext(StringexprContext.class,0);
		}
		public AssingStringContext(AsignStringExprContext ctx) { copyFrom(ctx); }
	}

	public final AsignStringExprContext asignStringExpr() throws RecognitionException {
		AsignStringExprContext _localctx = new AsignStringExprContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_asignStringExpr);
		try {
			_localctx = new AssingStringContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			match(ID);
			setState(170);
			match(EQ);
			setState(171);
			stringexpr();
			}
		}
		catch (RecognitionException re) {
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
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ParensContext extends ExprContext {
		public TerminalNode APARE() { return getToken(LabeledExprParser.APARE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode FPARE() { return getToken(LabeledExprParser.FPARE, 0); }
		public ParensContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class MulDivContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MUL() { return getToken(LabeledExprParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(LabeledExprParser.DIV, 0); }
		public MulDivContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class AddSubContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ADD() { return getToken(LabeledExprParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(LabeledExprParser.SUB, 0); }
		public AddSubContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class IdContext extends ExprContext {
		public TerminalNode ID() { return getToken(LabeledExprParser.ID, 0); }
		public IdContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class FloatContext extends ExprContext {
		public TerminalNode FLOAT() { return getToken(LabeledExprParser.FLOAT, 0); }
		public FloatContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class IntContext extends ExprContext {
		public TerminalNode INT() { return getToken(LabeledExprParser.INT, 0); }
		public IntContext(ExprContext ctx) { copyFrom(ctx); }
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				{
				_localctx = new IntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(174);
				match(INT);
				}
				break;
			case ID:
				{
				_localctx = new IdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(175);
				match(ID);
				}
				break;
			case FLOAT:
				{
				_localctx = new FloatContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(176);
				match(FLOAT);
				}
				break;
			case APARE:
				{
				_localctx = new ParensContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(177);
				match(APARE);
				setState(178);
				expr(0);
				setState(179);
				match(FPARE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(191);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(189);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						_localctx = new MulDivContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(183);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(184);
						((MulDivContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MUL || _la==DIV) ) {
							((MulDivContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(185);
						expr(7);
						}
						break;
					case 2:
						{
						_localctx = new AddSubContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(186);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(187);
						((AddSubContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
							((AddSubContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(188);
						expr(6);
						}
						break;
					}
					} 
				}
				setState(193);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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

	public static class StringexprContext extends ParserRuleContext {
		public StringexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringexpr; }
	 
		public StringexprContext() { }
		public void copyFrom(StringexprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StringContext extends StringexprContext {
		public TerminalNode STRING() { return getToken(LabeledExprParser.STRING, 0); }
		public StringContext(StringexprContext ctx) { copyFrom(ctx); }
	}

	public final StringexprContext stringexpr() throws RecognitionException {
		StringexprContext _localctx = new StringexprContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_stringexpr);
		try {
			_localctx = new StringContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
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

	public static class ConcatStringexprContext extends ParserRuleContext {
		public ConcatStringexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_concatStringexpr; }
	 
		public ConcatStringexprContext() { }
		public void copyFrom(ConcatStringexprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ConcatStringContext extends ConcatStringexprContext {
		public Token op1;
		public TerminalNode ID() { return getToken(LabeledExprParser.ID, 0); }
		public TerminalNode STRING() { return getToken(LabeledExprParser.STRING, 0); }
		public List<SumStringExprContext> sumStringExpr() {
			return getRuleContexts(SumStringExprContext.class);
		}
		public SumStringExprContext sumStringExpr(int i) {
			return getRuleContext(SumStringExprContext.class,i);
		}
		public ConcatStringContext(ConcatStringexprContext ctx) { copyFrom(ctx); }
	}

	public final ConcatStringexprContext concatStringexpr() throws RecognitionException {
		ConcatStringexprContext _localctx = new ConcatStringexprContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_concatStringexpr);
		int _la;
		try {
			_localctx = new ConcatStringContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			((ConcatStringContext)_localctx).op1 = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==STRING) ) {
				((ConcatStringContext)_localctx).op1 = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(198); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(197);
				sumStringExpr();
				}
				}
				setState(200); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ADD );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SumStringExprContext extends ParserRuleContext {
		public SumStringExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sumStringExpr; }
	 
		public SumStringExprContext() { }
		public void copyFrom(SumStringExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SumStringContext extends SumStringExprContext {
		public Token op2;
		public TerminalNode ADD() { return getToken(LabeledExprParser.ADD, 0); }
		public TerminalNode ID() { return getToken(LabeledExprParser.ID, 0); }
		public TerminalNode STRING() { return getToken(LabeledExprParser.STRING, 0); }
		public SumStringContext(SumStringExprContext ctx) { copyFrom(ctx); }
	}

	public final SumStringExprContext sumStringExpr() throws RecognitionException {
		SumStringExprContext _localctx = new SumStringExprContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_sumStringExpr);
		int _la;
		try {
			_localctx = new SumStringContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			match(ADD);
			setState(203);
			((SumStringContext)_localctx).op2 = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==STRING) ) {
				((SumStringContext)_localctx).op2 = (Token)_errHandler.recoverInline(this);
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

	public static class ComparissonContext extends ParserRuleContext {
		public ComparissonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisson; }
	 
		public ComparissonContext() { }
		public void copyFrom(ComparissonContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ComparissonExprContext extends ComparissonContext {
		public Token op1;
		public Token op2;
		public TerminalNode OPREL() { return getToken(LabeledExprParser.OPREL, 0); }
		public List<TerminalNode> INT() { return getTokens(LabeledExprParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(LabeledExprParser.INT, i);
		}
		public List<TerminalNode> FLOAT() { return getTokens(LabeledExprParser.FLOAT); }
		public TerminalNode FLOAT(int i) {
			return getToken(LabeledExprParser.FLOAT, i);
		}
		public List<TerminalNode> ID() { return getTokens(LabeledExprParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(LabeledExprParser.ID, i);
		}
		public ComparissonExprContext(ComparissonContext ctx) { copyFrom(ctx); }
	}

	public final ComparissonContext comparisson() throws RecognitionException {
		ComparissonContext _localctx = new ComparissonContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_comparisson);
		int _la;
		try {
			_localctx = new ComparissonExprContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			((ComparissonExprContext)_localctx).op1 = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << INT) | (1L << FLOAT))) != 0)) ) {
				((ComparissonExprContext)_localctx).op1 = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(206);
			match(OPREL);
			setState(207);
			((ComparissonExprContext)_localctx).op2 = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << INT) | (1L << FLOAT))) != 0)) ) {
				((ComparissonExprContext)_localctx).op2 = (Token)_errHandler.recoverInline(this);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 11:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 6);
		case 1:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\35\u00d4\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\6\2"+
		"$\n\2\r\2\16\2%\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3?\n\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\5\3G\n\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3O\n\3\3\3\3\3\3\3\5\3T\n\3\3\4"+
		"\3\4\3\4\3\4\3\4\7\4[\n\4\f\4\16\4^\13\4\3\4\3\4\3\5\3\5\3\5\3\5\7\5f"+
		"\n\5\f\5\16\5i\13\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\5\6s\n\6\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\177\n\7\f\7\16\7\u0082\13\7\3\7\3\7"+
		"\3\7\5\7\u0087\n\7\3\b\6\b\u008a\n\b\r\b\16\b\u008b\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\6\t\u0094\n\t\r\t\16\t\u0095\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\6\n\u00a2\n\n\r\n\16\n\u00a3\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3"+
		"\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00b8\n\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\7\r\u00c0\n\r\f\r\16\r\u00c3\13\r\3\16\3\16\3\17\3\17\6\17"+
		"\u00c9\n\17\r\17\16\17\u00ca\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\2"+
		"\3\30\22\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \2\6\3\2\n\13\3\2\f\r"+
		"\4\2\27\27\32\32\3\2\27\31\2\u00df\2#\3\2\2\2\4S\3\2\2\2\6U\3\2\2\2\b"+
		"a\3\2\2\2\nl\3\2\2\2\ft\3\2\2\2\16\u0089\3\2\2\2\20\u008d\3\2\2\2\22\u0099"+
		"\3\2\2\2\24\u00a7\3\2\2\2\26\u00ab\3\2\2\2\30\u00b7\3\2\2\2\32\u00c4\3"+
		"\2\2\2\34\u00c6\3\2\2\2\36\u00cc\3\2\2\2 \u00cf\3\2\2\2\"$\5\4\3\2#\""+
		"\3\2\2\2$%\3\2\2\2%#\3\2\2\2%&\3\2\2\2&\3\3\2\2\2\'(\5\20\t\2()\7\34\2"+
		"\2)T\3\2\2\2*+\5\22\n\2+,\7\34\2\2,T\3\2\2\2-.\5\f\7\2./\7\34\2\2/T\3"+
		"\2\2\2\60\61\5\30\r\2\61\62\7\34\2\2\62T\3\2\2\2\63\64\5\6\4\2\64\65\7"+
		"\34\2\2\65T\3\2\2\2\66\67\5\b\5\2\678\7\34\2\28T\3\2\2\29:\5\n\6\2:;\7"+
		"\34\2\2;T\3\2\2\2<?\5\24\13\2=?\5\26\f\2><\3\2\2\2>=\3\2\2\2?@\3\2\2\2"+
		"@A\7\34\2\2AT\3\2\2\2BC\7\7\2\2CF\7\21\2\2DG\5\30\r\2EG\5\32\16\2FD\3"+
		"\2\2\2FE\3\2\2\2GH\3\2\2\2HI\7\22\2\2IT\3\2\2\2JK\7\b\2\2KN\7\21\2\2L"+
		"O\5\34\17\2MO\5\32\16\2NL\3\2\2\2NM\3\2\2\2OP\3\2\2\2PQ\7\22\2\2QT\3\2"+
		"\2\2RT\7\34\2\2S\'\3\2\2\2S*\3\2\2\2S-\3\2\2\2S\60\3\2\2\2S\63\3\2\2\2"+
		"S\66\3\2\2\2S9\3\2\2\2S>\3\2\2\2SB\3\2\2\2SJ\3\2\2\2SR\3\2\2\2T\5\3\2"+
		"\2\2UV\7\25\2\2V\\\7\27\2\2WX\7\23\2\2XY\7\25\2\2Y[\7\27\2\2ZW\3\2\2\2"+
		"[^\3\2\2\2\\Z\3\2\2\2\\]\3\2\2\2]_\3\2\2\2^\\\3\2\2\2_`\7\24\2\2`\7\3"+
		"\2\2\2ab\7\25\2\2bg\7\27\2\2cd\7\23\2\2df\7\27\2\2ec\3\2\2\2fi\3\2\2\2"+
		"ge\3\2\2\2gh\3\2\2\2hj\3\2\2\2ig\3\2\2\2jk\7\24\2\2k\t\3\2\2\2lm\7\26"+
		"\2\2mn\7\25\2\2no\7\27\2\2or\7\16\2\2ps\5\30\r\2qs\5\32\16\2rp\3\2\2\2"+
		"rq\3\2\2\2s\13\3\2\2\2tu\7\3\2\2uv\7\21\2\2vw\5 \21\2wx\7\22\2\2xy\7\17"+
		"\2\2yz\5\16\b\2z\u0086\7\20\2\2{|\7\4\2\2|\u0080\7\17\2\2}\177\7\34\2"+
		"\2~}\3\2\2\2\177\u0082\3\2\2\2\u0080~\3\2\2\2\u0080\u0081\3\2\2\2\u0081"+
		"\u0083\3\2\2\2\u0082\u0080\3\2\2\2\u0083\u0084\5\16\b\2\u0084\u0085\7"+
		"\20\2\2\u0085\u0087\3\2\2\2\u0086{\3\2\2\2\u0086\u0087\3\2\2\2\u0087\r"+
		"\3\2\2\2\u0088\u008a\5\4\3\2\u0089\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b"+
		"\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c\17\3\2\2\2\u008d\u008e\7\5\2"+
		"\2\u008e\u008f\7\21\2\2\u008f\u0090\5 \21\2\u0090\u0091\7\22\2\2\u0091"+
		"\u0093\7\17\2\2\u0092\u0094\5\4\3\2\u0093\u0092\3\2\2\2\u0094\u0095\3"+
		"\2\2\2\u0095\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0097\3\2\2\2\u0097"+
		"\u0098\7\20\2\2\u0098\21\3\2\2\2\u0099\u009a\7\6\2\2\u009a\u009b\7\21"+
		"\2\2\u009b\u009c\5\24\13\2\u009c\u009d\7\24\2\2\u009d\u009e\5 \21\2\u009e"+
		"\u009f\7\22\2\2\u009f\u00a1\7\17\2\2\u00a0\u00a2\5\4\3\2\u00a1\u00a0\3"+
		"\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4"+
		"\u00a5\3\2\2\2\u00a5\u00a6\7\20\2\2\u00a6\23\3\2\2\2\u00a7\u00a8\7\27"+
		"\2\2\u00a8\u00a9\7\16\2\2\u00a9\u00aa\5\30\r\2\u00aa\25\3\2\2\2\u00ab"+
		"\u00ac\7\27\2\2\u00ac\u00ad\7\16\2\2\u00ad\u00ae\5\32\16\2\u00ae\27\3"+
		"\2\2\2\u00af\u00b0\b\r\1\2\u00b0\u00b8\7\30\2\2\u00b1\u00b8\7\27\2\2\u00b2"+
		"\u00b8\7\31\2\2\u00b3\u00b4\7\21\2\2\u00b4\u00b5\5\30\r\2\u00b5\u00b6"+
		"\7\22\2\2\u00b6\u00b8\3\2\2\2\u00b7\u00af\3\2\2\2\u00b7\u00b1\3\2\2\2"+
		"\u00b7\u00b2\3\2\2\2\u00b7\u00b3\3\2\2\2\u00b8\u00c1\3\2\2\2\u00b9\u00ba"+
		"\f\b\2\2\u00ba\u00bb\t\2\2\2\u00bb\u00c0\5\30\r\t\u00bc\u00bd\f\7\2\2"+
		"\u00bd\u00be\t\3\2\2\u00be\u00c0\5\30\r\b\u00bf\u00b9\3\2\2\2\u00bf\u00bc"+
		"\3\2\2\2\u00c0\u00c3\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2"+
		"\31\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c4\u00c5\7\32\2\2\u00c5\33\3\2\2\2"+
		"\u00c6\u00c8\t\4\2\2\u00c7\u00c9\5\36\20\2\u00c8\u00c7\3\2\2\2\u00c9\u00ca"+
		"\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\35\3\2\2\2\u00cc"+
		"\u00cd\7\f\2\2\u00cd\u00ce\t\4\2\2\u00ce\37\3\2\2\2\u00cf\u00d0\t\5\2"+
		"\2\u00d0\u00d1\7\t\2\2\u00d1\u00d2\t\5\2\2\u00d2!\3\2\2\2\23%>FNS\\gr"+
		"\u0080\u0086\u008b\u0095\u00a3\u00b7\u00bf\u00c1\u00ca";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}