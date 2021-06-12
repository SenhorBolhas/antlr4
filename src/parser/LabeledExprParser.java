// Generated from D:/Materias/Compiladores/Implementacao2Unidade/g4Files\LabeledExpr.g4 by ANTLR 4.9.1
package parser;
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
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

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
		RULE_declarationConst = 4, RULE_conditional = 5, RULE_whileloop = 6, RULE_forloop = 7, 
		RULE_asignNumberExpr = 8, RULE_asignStringExpr = 9, RULE_expr = 10, RULE_stringexpr = 11, 
		RULE_concatStringexpr = 12, RULE_sumStringExpr = 13, RULE_comparisson = 14;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "stat", "declaration", "declarationSimple", "declarationConst", 
			"conditional", "whileloop", "forloop", "asignNumberExpr", "asignStringExpr", 
			"expr", "stringexpr", "concatStringexpr", "sumStringExpr", "comparisson"
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(30);
				stat();
				}
				}
				setState(33); 
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterCondi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitCondi(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitCondi(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ForLoopCContext extends StatContext {
		public ForloopContext forloop() {
			return getRuleContext(ForloopContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(LabeledExprParser.NEWLINE, 0); }
		public ForLoopCContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterForLoopC(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitForLoopC(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitForLoopC(this);
			else return visitor.visitChildren(this);
		}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterAssing(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitAssing(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitAssing(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BlankContext extends StatContext {
		public TerminalNode NEWLINE() { return getToken(LabeledExprParser.NEWLINE, 0); }
		public BlankContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterBlank(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitBlank(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitBlank(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DeclarConstContext extends StatContext {
		public DeclarationConstContext declarationConst() {
			return getRuleContext(DeclarationConstContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(LabeledExprParser.NEWLINE, 0); }
		public DeclarConstContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterDeclarConst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitDeclarConst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitDeclarConst(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WhileLoopCContext extends StatContext {
		public WhileloopContext whileloop() {
			return getRuleContext(WhileloopContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(LabeledExprParser.NEWLINE, 0); }
		public WhileLoopCContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterWhileLoopC(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitWhileLoopC(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitWhileLoopC(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DeclarSimpleContext extends StatContext {
		public DeclarationSimpleContext declarationSimple() {
			return getRuleContext(DeclarationSimpleContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(LabeledExprParser.NEWLINE, 0); }
		public DeclarSimpleContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterDeclarSimple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitDeclarSimple(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitDeclarSimple(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DeclarContext extends StatContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(LabeledExprParser.NEWLINE, 0); }
		public DeclarContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterDeclar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitDeclar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitDeclar(this);
			else return visitor.visitChildren(this);
		}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterPrintln(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitPrintln(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitPrintln(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpContext extends StatContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(LabeledExprParser.NEWLINE, 0); }
		public ExpContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitExp(this);
			else return visitor.visitChildren(this);
		}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterPrintlnstr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitPrintlnstr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitPrintlnstr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stat);
		try {
			setState(79);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				_localctx = new WhileLoopCContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(35);
				whileloop();
				setState(36);
				match(NEWLINE);
				}
				break;
			case 2:
				_localctx = new ForLoopCContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(38);
				forloop();
				setState(39);
				match(NEWLINE);
				}
				break;
			case 3:
				_localctx = new CondiContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(41);
				conditional();
				setState(42);
				match(NEWLINE);
				}
				break;
			case 4:
				_localctx = new ExpContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(44);
				expr(0);
				setState(45);
				match(NEWLINE);
				}
				break;
			case 5:
				_localctx = new DeclarContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(47);
				declaration();
				setState(48);
				match(NEWLINE);
				}
				break;
			case 6:
				_localctx = new DeclarSimpleContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(50);
				declarationSimple();
				setState(51);
				match(NEWLINE);
				}
				break;
			case 7:
				_localctx = new DeclarConstContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(53);
				declarationConst();
				setState(54);
				match(NEWLINE);
				}
				break;
			case 8:
				_localctx = new AssingContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(58);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(56);
					asignNumberExpr();
					}
					break;
				case 2:
					{
					setState(57);
					asignStringExpr();
					}
					break;
				}
				setState(60);
				match(NEWLINE);
				}
				break;
			case 9:
				_localctx = new PrintlnContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(62);
				match(PRINT);
				setState(63);
				match(APARE);
				setState(66);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case APARE:
				case ID:
				case INT:
				case FLOAT:
					{
					setState(64);
					expr(0);
					}
					break;
				case STRING:
					{
					setState(65);
					stringexpr();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(68);
				match(FPARE);
				}
				break;
			case 10:
				_localctx = new PrintlnstrContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(70);
				match(PRINTSTR);
				setState(71);
				match(APARE);
				setState(74);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(72);
					concatStringexpr();
					}
					break;
				case 2:
					{
					setState(73);
					stringexpr();
					}
					break;
				}
				setState(76);
				match(FPARE);
				}
				break;
			case 11:
				_localctx = new BlankContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(78);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterDeclarationExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitDeclarationExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitDeclarationExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaration);
		int _la;
		try {
			_localctx = new DeclarationExprContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			match(TYPES);
			setState(82);
			match(ID);
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIG) {
				{
				{
				setState(83);
				match(VIG);
				setState(84);
				match(TYPES);
				setState(85);
				match(ID);
				}
				}
				setState(90);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(91);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterDeclarationSimpleExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitDeclarationSimpleExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitDeclarationSimpleExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationSimpleContext declarationSimple() throws RecognitionException {
		DeclarationSimpleContext _localctx = new DeclarationSimpleContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declarationSimple);
		int _la;
		try {
			_localctx = new DeclarationSimpleExprContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(TYPES);
			setState(94);
			match(ID);
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIG) {
				{
				{
				setState(95);
				match(VIG);
				setState(96);
				match(ID);
				}
				}
				setState(101);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(102);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterDeclarationConstExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitDeclarationConstExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitDeclarationConstExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationConstContext declarationConst() throws RecognitionException {
		DeclarationConstContext _localctx = new DeclarationConstContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_declarationConst);
		try {
			_localctx = new DeclarationConstExprContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			match(CONST);
			setState(105);
			match(TYPES);
			setState(106);
			match(ID);
			setState(107);
			match(EQ);
			setState(110);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case APARE:
			case ID:
			case INT:
			case FLOAT:
				{
				setState(108);
				expr(0);
				}
				break;
			case STRING:
				{
				setState(109);
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
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> FECHAV() { return getTokens(LabeledExprParser.FECHAV); }
		public TerminalNode FECHAV(int i) {
			return getToken(LabeledExprParser.FECHAV, i);
		}
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(LabeledExprParser.ELSE, 0); }
		public ConditionalExprContext(ConditionalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterConditionalExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitConditionalExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitConditionalExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalContext conditional() throws RecognitionException {
		ConditionalContext _localctx = new ConditionalContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_conditional);
		int _la;
		try {
			_localctx = new ConditionalExprContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(IF);
			setState(113);
			match(APARE);
			setState(114);
			comparisson();
			setState(115);
			match(FPARE);
			setState(116);
			match(ABCHAV);
			setState(117);
			expr(0);
			setState(119); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(118);
				stat();
				}
				}
				setState(121); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << PRINT) | (1L << PRINTSTR) | (1L << APARE) | (1L << TYPES) | (1L << CONST) | (1L << ID) | (1L << INT) | (1L << FLOAT) | (1L << NEWLINE))) != 0) );
			setState(123);
			match(FECHAV);
			setState(134);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(124);
				match(ELSE);
				setState(125);
				match(ABCHAV);
				setState(126);
				expr(0);
				setState(128); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(127);
					stat();
					}
					}
					setState(130); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << PRINT) | (1L << PRINTSTR) | (1L << APARE) | (1L << TYPES) | (1L << CONST) | (1L << ID) | (1L << INT) | (1L << FLOAT) | (1L << NEWLINE))) != 0) );
				setState(132);
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
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode FECHAV() { return getToken(LabeledExprParser.FECHAV, 0); }
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public WhileLoopExprContext(WhileloopContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterWhileLoopExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitWhileLoopExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitWhileLoopExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileloopContext whileloop() throws RecognitionException {
		WhileloopContext _localctx = new WhileloopContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_whileloop);
		int _la;
		try {
			_localctx = new WhileLoopExprContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			match(WHILE);
			setState(137);
			match(APARE);
			setState(138);
			comparisson();
			setState(139);
			match(FPARE);
			setState(140);
			match(ABCHAV);
			setState(141);
			expr(0);
			setState(143); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(142);
				stat();
				}
				}
				setState(145); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << PRINT) | (1L << PRINTSTR) | (1L << APARE) | (1L << TYPES) | (1L << CONST) | (1L << ID) | (1L << INT) | (1L << FLOAT) | (1L << NEWLINE))) != 0) );
			setState(147);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterForLoopExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitForLoopExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitForLoopExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForloopContext forloop() throws RecognitionException {
		ForloopContext _localctx = new ForloopContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_forloop);
		int _la;
		try {
			_localctx = new ForLoopExprContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(FOR);
			setState(150);
			match(APARE);
			setState(151);
			asignNumberExpr();
			setState(152);
			match(PTVIG);
			setState(153);
			comparisson();
			setState(154);
			match(FPARE);
			setState(155);
			match(ABCHAV);
			setState(157); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(156);
				stat();
				}
				}
				setState(159); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << PRINT) | (1L << PRINTSTR) | (1L << APARE) | (1L << TYPES) | (1L << CONST) | (1L << ID) | (1L << INT) | (1L << FLOAT) | (1L << NEWLINE))) != 0) );
			setState(161);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterAssingNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitAssingNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitAssingNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsignNumberExprContext asignNumberExpr() throws RecognitionException {
		AsignNumberExprContext _localctx = new AsignNumberExprContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_asignNumberExpr);
		try {
			_localctx = new AssingNumberContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			match(ID);
			setState(164);
			match(EQ);
			setState(165);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterAssingString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitAssingString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitAssingString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsignStringExprContext asignStringExpr() throws RecognitionException {
		AsignStringExprContext _localctx = new AsignStringExprContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_asignStringExpr);
		try {
			_localctx = new AssingStringContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			match(ID);
			setState(168);
			match(EQ);
			setState(169);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterParens(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitParens(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitParens(this);
			else return visitor.visitChildren(this);
		}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterMulDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitMulDiv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitMulDiv(this);
			else return visitor.visitChildren(this);
		}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterAddSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitAddSub(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitAddSub(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdContext extends ExprContext {
		public TerminalNode ID() { return getToken(LabeledExprParser.ID, 0); }
		public IdContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FloatContext extends ExprContext {
		public TerminalNode FLOAT() { return getToken(LabeledExprParser.FLOAT, 0); }
		public FloatContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterFloat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitFloat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitFloat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntContext extends ExprContext {
		public TerminalNode INT() { return getToken(LabeledExprParser.INT, 0); }
		public IntContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitInt(this);
			else return visitor.visitChildren(this);
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
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				{
				_localctx = new IntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(172);
				match(INT);
				}
				break;
			case ID:
				{
				_localctx = new IdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(173);
				match(ID);
				}
				break;
			case FLOAT:
				{
				_localctx = new FloatContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(174);
				match(FLOAT);
				}
				break;
			case APARE:
				{
				_localctx = new ParensContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(175);
				match(APARE);
				setState(176);
				expr(0);
				setState(177);
				match(FPARE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(189);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(187);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						_localctx = new MulDivContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(181);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(182);
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
						setState(183);
						expr(7);
						}
						break;
					case 2:
						{
						_localctx = new AddSubContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(184);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(185);
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
						setState(186);
						expr(6);
						}
						break;
					}
					} 
				}
				setState(191);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringexprContext stringexpr() throws RecognitionException {
		StringexprContext _localctx = new StringexprContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_stringexpr);
		try {
			_localctx = new StringContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterConcatString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitConcatString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitConcatString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConcatStringexprContext concatStringexpr() throws RecognitionException {
		ConcatStringexprContext _localctx = new ConcatStringexprContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_concatStringexpr);
		int _la;
		try {
			_localctx = new ConcatStringContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
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
			setState(196); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(195);
				sumStringExpr();
				}
				}
				setState(198); 
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterSumString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitSumString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitSumString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SumStringExprContext sumStringExpr() throws RecognitionException {
		SumStringExprContext _localctx = new SumStringExprContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_sumStringExpr);
		int _la;
		try {
			_localctx = new SumStringContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			match(ADD);
			setState(201);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterComparissonExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitComparissonExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitComparissonExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparissonContext comparisson() throws RecognitionException {
		ComparissonContext _localctx = new ComparissonContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_comparisson);
		int _la;
		try {
			_localctx = new ComparissonExprContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
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
			setState(204);
			match(OPREL);
			setState(205);
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
		case 10:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\35\u00d2\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\6\2\"\n\2\r\2"+
		"\16\2#\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3=\n\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3E\n\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\5\3M\n\3\3\3\3\3\3\3\5\3R\n\3\3\4\3\4\3\4\3\4"+
		"\3\4\7\4Y\n\4\f\4\16\4\\\13\4\3\4\3\4\3\5\3\5\3\5\3\5\7\5d\n\5\f\5\16"+
		"\5g\13\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\5\6q\n\6\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\6\7z\n\7\r\7\16\7{\3\7\3\7\3\7\3\7\3\7\6\7\u0083\n\7\r\7\16\7"+
		"\u0084\3\7\3\7\5\7\u0089\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\6\b\u0092\n\b"+
		"\r\b\16\b\u0093\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\6\t\u00a0\n\t"+
		"\r\t\16\t\u00a1\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\5\f\u00b6\n\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u00be"+
		"\n\f\f\f\16\f\u00c1\13\f\3\r\3\r\3\16\3\16\6\16\u00c7\n\16\r\16\16\16"+
		"\u00c8\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\2\3\26\21\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\36\2\6\3\2\n\13\3\2\f\r\4\2\27\27\32\32\3\2\27\31"+
		"\2\u00de\2!\3\2\2\2\4Q\3\2\2\2\6S\3\2\2\2\b_\3\2\2\2\nj\3\2\2\2\fr\3\2"+
		"\2\2\16\u008a\3\2\2\2\20\u0097\3\2\2\2\22\u00a5\3\2\2\2\24\u00a9\3\2\2"+
		"\2\26\u00b5\3\2\2\2\30\u00c2\3\2\2\2\32\u00c4\3\2\2\2\34\u00ca\3\2\2\2"+
		"\36\u00cd\3\2\2\2 \"\5\4\3\2! \3\2\2\2\"#\3\2\2\2#!\3\2\2\2#$\3\2\2\2"+
		"$\3\3\2\2\2%&\5\16\b\2&\'\7\34\2\2\'R\3\2\2\2()\5\20\t\2)*\7\34\2\2*R"+
		"\3\2\2\2+,\5\f\7\2,-\7\34\2\2-R\3\2\2\2./\5\26\f\2/\60\7\34\2\2\60R\3"+
		"\2\2\2\61\62\5\6\4\2\62\63\7\34\2\2\63R\3\2\2\2\64\65\5\b\5\2\65\66\7"+
		"\34\2\2\66R\3\2\2\2\678\5\n\6\289\7\34\2\29R\3\2\2\2:=\5\22\n\2;=\5\24"+
		"\13\2<:\3\2\2\2<;\3\2\2\2=>\3\2\2\2>?\7\34\2\2?R\3\2\2\2@A\7\7\2\2AD\7"+
		"\21\2\2BE\5\26\f\2CE\5\30\r\2DB\3\2\2\2DC\3\2\2\2EF\3\2\2\2FG\7\22\2\2"+
		"GR\3\2\2\2HI\7\b\2\2IL\7\21\2\2JM\5\32\16\2KM\5\30\r\2LJ\3\2\2\2LK\3\2"+
		"\2\2MN\3\2\2\2NO\7\22\2\2OR\3\2\2\2PR\7\34\2\2Q%\3\2\2\2Q(\3\2\2\2Q+\3"+
		"\2\2\2Q.\3\2\2\2Q\61\3\2\2\2Q\64\3\2\2\2Q\67\3\2\2\2Q<\3\2\2\2Q@\3\2\2"+
		"\2QH\3\2\2\2QP\3\2\2\2R\5\3\2\2\2ST\7\25\2\2TZ\7\27\2\2UV\7\23\2\2VW\7"+
		"\25\2\2WY\7\27\2\2XU\3\2\2\2Y\\\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[]\3\2\2\2"+
		"\\Z\3\2\2\2]^\7\24\2\2^\7\3\2\2\2_`\7\25\2\2`e\7\27\2\2ab\7\23\2\2bd\7"+
		"\27\2\2ca\3\2\2\2dg\3\2\2\2ec\3\2\2\2ef\3\2\2\2fh\3\2\2\2ge\3\2\2\2hi"+
		"\7\24\2\2i\t\3\2\2\2jk\7\26\2\2kl\7\25\2\2lm\7\27\2\2mp\7\16\2\2nq\5\26"+
		"\f\2oq\5\30\r\2pn\3\2\2\2po\3\2\2\2q\13\3\2\2\2rs\7\3\2\2st\7\21\2\2t"+
		"u\5\36\20\2uv\7\22\2\2vw\7\17\2\2wy\5\26\f\2xz\5\4\3\2yx\3\2\2\2z{\3\2"+
		"\2\2{y\3\2\2\2{|\3\2\2\2|}\3\2\2\2}\u0088\7\20\2\2~\177\7\4\2\2\177\u0080"+
		"\7\17\2\2\u0080\u0082\5\26\f\2\u0081\u0083\5\4\3\2\u0082\u0081\3\2\2\2"+
		"\u0083\u0084\3\2\2\2\u0084\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0086"+
		"\3\2\2\2\u0086\u0087\7\20\2\2\u0087\u0089\3\2\2\2\u0088~\3\2\2\2\u0088"+
		"\u0089\3\2\2\2\u0089\r\3\2\2\2\u008a\u008b\7\5\2\2\u008b\u008c\7\21\2"+
		"\2\u008c\u008d\5\36\20\2\u008d\u008e\7\22\2\2\u008e\u008f\7\17\2\2\u008f"+
		"\u0091\5\26\f\2\u0090\u0092\5\4\3\2\u0091\u0090\3\2\2\2\u0092\u0093\3"+
		"\2\2\2\u0093\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0095\3\2\2\2\u0095"+
		"\u0096\7\20\2\2\u0096\17\3\2\2\2\u0097\u0098\7\6\2\2\u0098\u0099\7\21"+
		"\2\2\u0099\u009a\5\22\n\2\u009a\u009b\7\24\2\2\u009b\u009c\5\36\20\2\u009c"+
		"\u009d\7\22\2\2\u009d\u009f\7\17\2\2\u009e\u00a0\5\4\3\2\u009f\u009e\3"+
		"\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2"+
		"\u00a3\3\2\2\2\u00a3\u00a4\7\20\2\2\u00a4\21\3\2\2\2\u00a5\u00a6\7\27"+
		"\2\2\u00a6\u00a7\7\16\2\2\u00a7\u00a8\5\26\f\2\u00a8\23\3\2\2\2\u00a9"+
		"\u00aa\7\27\2\2\u00aa\u00ab\7\16\2\2\u00ab\u00ac\5\30\r\2\u00ac\25\3\2"+
		"\2\2\u00ad\u00ae\b\f\1\2\u00ae\u00b6\7\30\2\2\u00af\u00b6\7\27\2\2\u00b0"+
		"\u00b6\7\31\2\2\u00b1\u00b2\7\21\2\2\u00b2\u00b3\5\26\f\2\u00b3\u00b4"+
		"\7\22\2\2\u00b4\u00b6\3\2\2\2\u00b5\u00ad\3\2\2\2\u00b5\u00af\3\2\2\2"+
		"\u00b5\u00b0\3\2\2\2\u00b5\u00b1\3\2\2\2\u00b6\u00bf\3\2\2\2\u00b7\u00b8"+
		"\f\b\2\2\u00b8\u00b9\t\2\2\2\u00b9\u00be\5\26\f\t\u00ba\u00bb\f\7\2\2"+
		"\u00bb\u00bc\t\3\2\2\u00bc\u00be\5\26\f\b\u00bd\u00b7\3\2\2\2\u00bd\u00ba"+
		"\3\2\2\2\u00be\u00c1\3\2\2\2\u00bf\u00bd\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0"+
		"\27\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c2\u00c3\7\32\2\2\u00c3\31\3\2\2\2"+
		"\u00c4\u00c6\t\4\2\2\u00c5\u00c7\5\34\17\2\u00c6\u00c5\3\2\2\2\u00c7\u00c8"+
		"\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\33\3\2\2\2\u00ca"+
		"\u00cb\7\f\2\2\u00cb\u00cc\t\4\2\2\u00cc\35\3\2\2\2\u00cd\u00ce\t\5\2"+
		"\2\u00ce\u00cf\7\t\2\2\u00cf\u00d0\t\5\2\2\u00d0\37\3\2\2\2\23#<DLQZe"+
		"p{\u0084\u0088\u0093\u00a1\u00b5\u00bd\u00bf\u00c8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}