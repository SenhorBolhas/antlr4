// Generated from D:/Materias/Compiladores/antlr4/g4Files\LabeledExpr.g4 by ANTLR 4.9.1
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
		RULE_declarationConst = 4, RULE_conditional = 5, RULE_conditionalExecExpr = 6, 
		RULE_whileloop = 7, RULE_forloop = 8, RULE_asignNumberExpr = 9, RULE_asignStringExpr = 10, 
		RULE_expr = 11, RULE_addExpr = 12, RULE_stringNumberSumExpr = 13, RULE_stringexpr = 14, 
		RULE_sumStringExpr = 15, RULE_comparisson = 16;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "stat", "declaration", "declarationSimple", "declarationConst", 
			"conditional", "conditionalExecExpr", "whileloop", "forloop", "asignNumberExpr", 
			"asignStringExpr", "expr", "addExpr", "stringNumberSumExpr", "stringexpr", 
			"sumStringExpr", "comparisson"
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
			setState(35); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(34);
				stat();
				}
				}
				setState(37); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << PRINT) | (1L << APARE) | (1L << TYPES) | (1L << CONST) | (1L << ID) | (1L << INT) | (1L << FLOAT) | (1L << STRING) | (1L << NEWLINE))) != 0) );
			}
		}
		catch (RecognitionException re) {
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

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stat);
		try {
			setState(72);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new WhileLoopCContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(39);
				whileloop();
				setState(40);
				match(NEWLINE);
				}
				break;
			case 2:
				_localctx = new ForLoopCContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(42);
				forloop();
				setState(43);
				match(NEWLINE);
				}
				break;
			case 3:
				_localctx = new CondiContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(45);
				conditional();
				setState(46);
				match(NEWLINE);
				}
				break;
			case 4:
				_localctx = new ExpContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(48);
				expr(0);
				setState(49);
				match(NEWLINE);
				}
				break;
			case 5:
				_localctx = new DeclarContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(51);
				declaration();
				setState(52);
				match(NEWLINE);
				}
				break;
			case 6:
				_localctx = new DeclarSimpleContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(54);
				declarationSimple();
				setState(55);
				match(NEWLINE);
				}
				break;
			case 7:
				_localctx = new DeclarConstContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(57);
				declarationConst();
				setState(58);
				match(NEWLINE);
				}
				break;
			case 8:
				_localctx = new AssingContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(62);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(60);
					asignNumberExpr();
					}
					break;
				case 2:
					{
					setState(61);
					asignStringExpr();
					}
					break;
				}
				setState(64);
				match(NEWLINE);
				}
				break;
			case 9:
				_localctx = new PrintlnContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(66);
				match(PRINT);
				setState(67);
				match(APARE);
				{
				setState(68);
				expr(0);
				}
				setState(69);
				match(FPARE);
				}
				break;
			case 10:
				_localctx = new BlankContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(71);
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
			setState(74);
			match(TYPES);
			setState(75);
			match(ID);
			setState(81);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIG) {
				{
				{
				setState(76);
				match(VIG);
				setState(77);
				match(TYPES);
				setState(78);
				match(ID);
				}
				}
				setState(83);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(84);
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
			setState(86);
			match(TYPES);
			setState(87);
			match(ID);
			setState(92);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIG) {
				{
				{
				setState(88);
				match(VIG);
				setState(89);
				match(ID);
				}
				}
				setState(94);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(95);
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
			setState(97);
			match(CONST);
			setState(98);
			match(TYPES);
			setState(99);
			match(ID);
			setState(100);
			match(EQ);
			setState(103);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(101);
				expr(0);
				}
				break;
			case 2:
				{
				setState(102);
				stringexpr();
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
			int _alt;
			_localctx = new ConditionalExprContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			match(IF);
			setState(106);
			match(APARE);
			setState(107);
			comparisson();
			setState(108);
			match(FPARE);
			setState(109);
			match(ABCHAV);
			setState(110);
			conditionalExecExpr();
			setState(111);
			match(FECHAV);
			setState(123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(112);
				match(ELSE);
				setState(113);
				match(ABCHAV);
				setState(117);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(114);
						match(NEWLINE);
						}
						} 
					}
					setState(119);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				}
				setState(120);
				conditionalExecExpr();
				setState(121);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterConditionalExec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitConditionalExec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitConditionalExec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalExecExprContext conditionalExecExpr() throws RecognitionException {
		ConditionalExecExprContext _localctx = new ConditionalExecExprContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_conditionalExecExpr);
		int _la;
		try {
			_localctx = new ConditionalExecContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(126); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(125);
				stat();
				}
				}
				setState(128); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << PRINT) | (1L << APARE) | (1L << TYPES) | (1L << CONST) | (1L << ID) | (1L << INT) | (1L << FLOAT) | (1L << STRING) | (1L << NEWLINE))) != 0) );
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 14, RULE_whileloop);
		int _la;
		try {
			_localctx = new WhileLoopExprContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			match(WHILE);
			setState(131);
			match(APARE);
			setState(132);
			comparisson();
			setState(133);
			match(FPARE);
			setState(134);
			match(ABCHAV);
			setState(136); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(135);
				stat();
				}
				}
				setState(138); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << PRINT) | (1L << APARE) | (1L << TYPES) | (1L << CONST) | (1L << ID) | (1L << INT) | (1L << FLOAT) | (1L << STRING) | (1L << NEWLINE))) != 0) );
			setState(140);
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
		enterRule(_localctx, 16, RULE_forloop);
		int _la;
		try {
			_localctx = new ForLoopExprContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			match(FOR);
			setState(143);
			match(APARE);
			setState(144);
			asignNumberExpr();
			setState(145);
			match(PTVIG);
			setState(146);
			comparisson();
			setState(147);
			match(FPARE);
			setState(148);
			match(ABCHAV);
			setState(150); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(149);
				stat();
				}
				}
				setState(152); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << PRINT) | (1L << APARE) | (1L << TYPES) | (1L << CONST) | (1L << ID) | (1L << INT) | (1L << FLOAT) | (1L << STRING) | (1L << NEWLINE))) != 0) );
			setState(154);
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
		enterRule(_localctx, 18, RULE_asignNumberExpr);
		try {
			_localctx = new AssingNumberContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			match(ID);
			setState(157);
			match(EQ);
			setState(158);
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
		enterRule(_localctx, 20, RULE_asignStringExpr);
		try {
			_localctx = new AssingStringContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			match(ID);
			setState(161);
			match(EQ);
			setState(162);
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
	public static class SubContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode SUB() { return getToken(LabeledExprParser.SUB, 0); }
		public SubContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitSub(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitSub(this);
			else return visitor.visitChildren(this);
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
	public static class AddEContext extends ExprContext {
		public AddExprContext addExpr() {
			return getRuleContext(AddExprContext.class,0);
		}
		public AddEContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterAddE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitAddE(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitAddE(this);
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
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				_localctx = new AddEContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(165);
				addExpr();
				}
				break;
			case 2:
				{
				_localctx = new IntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(166);
				match(INT);
				}
				break;
			case 3:
				{
				_localctx = new IdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(167);
				match(ID);
				}
				break;
			case 4:
				{
				_localctx = new FloatContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(168);
				match(FLOAT);
				}
				break;
			case 5:
				{
				_localctx = new ParensContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(169);
				match(APARE);
				setState(170);
				expr(0);
				setState(171);
				match(FPARE);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(183);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(181);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
					case 1:
						{
						_localctx = new MulDivContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(175);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(176);
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
						setState(177);
						expr(8);
						}
						break;
					case 2:
						{
						_localctx = new SubContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(178);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(179);
						match(SUB);
						setState(180);
						expr(6);
						}
						break;
					}
					} 
				}
				setState(185);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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

	public static class AddExprContext extends ParserRuleContext {
		public AddExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addExpr; }
	 
		public AddExprContext() { }
		public void copyFrom(AddExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AddContext extends AddExprContext {
		public Token op;
		public TerminalNode ADD() { return getToken(LabeledExprParser.ADD, 0); }
		public TerminalNode STRING() { return getToken(LabeledExprParser.STRING, 0); }
		public TerminalNode INT() { return getToken(LabeledExprParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(LabeledExprParser.FLOAT, 0); }
		public TerminalNode ID() { return getToken(LabeledExprParser.ID, 0); }
		public List<StringNumberSumExprContext> stringNumberSumExpr() {
			return getRuleContexts(StringNumberSumExprContext.class);
		}
		public StringNumberSumExprContext stringNumberSumExpr(int i) {
			return getRuleContext(StringNumberSumExprContext.class,i);
		}
		public AddContext(AddExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterAdd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitAdd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitAdd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddExprContext addExpr() throws RecognitionException {
		AddExprContext _localctx = new AddExprContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_addExpr);
		int _la;
		try {
			int _alt;
			_localctx = new AddContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			((AddContext)_localctx).op = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << INT) | (1L << FLOAT) | (1L << STRING))) != 0)) ) {
				((AddContext)_localctx).op = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(187);
			match(ADD);
			setState(189); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(188);
					stringNumberSumExpr();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(191); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringNumberSumExprContext extends ParserRuleContext {
		public StringNumberSumExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringNumberSumExpr; }
	 
		public StringNumberSumExprContext() { }
		public void copyFrom(StringNumberSumExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StringNumberSumContext extends StringNumberSumExprContext {
		public SumStringExprContext sumStringExpr() {
			return getRuleContext(SumStringExprContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public StringNumberSumContext(StringNumberSumExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterStringNumberSum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitStringNumberSum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitStringNumberSum(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringNumberSumExprContext stringNumberSumExpr() throws RecognitionException {
		StringNumberSumExprContext _localctx = new StringNumberSumExprContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_stringNumberSumExpr);
		try {
			_localctx = new StringNumberSumContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(193);
				sumStringExpr();
				}
				break;
			case 2:
				{
				setState(194);
				expr(0);
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
		enterRule(_localctx, 28, RULE_stringexpr);
		try {
			_localctx = new StringContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
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
		enterRule(_localctx, 30, RULE_sumStringExpr);
		int _la;
		try {
			_localctx = new SumStringContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
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
		public List<TerminalNode> STRING() { return getTokens(LabeledExprParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(LabeledExprParser.STRING, i);
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
		enterRule(_localctx, 32, RULE_comparisson);
		int _la;
		try {
			_localctx = new ComparissonExprContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			((ComparissonExprContext)_localctx).op1 = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << INT) | (1L << FLOAT) | (1L << STRING))) != 0)) ) {
				((ComparissonExprContext)_localctx).op1 = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(202);
			match(OPREL);
			setState(203);
			((ComparissonExprContext)_localctx).op2 = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << INT) | (1L << FLOAT) | (1L << STRING))) != 0)) ) {
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
			return precpred(_ctx, 7);
		case 1:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\35\u00d0\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\6\2&\n\2\r\2\16\2\'\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3A\n\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\5\3K\n\3\3\4\3\4\3\4\3\4\3\4\7\4R\n\4\f\4\16\4U\13"+
		"\4\3\4\3\4\3\5\3\5\3\5\3\5\7\5]\n\5\f\5\16\5`\13\5\3\5\3\5\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\5\6j\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7v\n\7"+
		"\f\7\16\7y\13\7\3\7\3\7\3\7\5\7~\n\7\3\b\6\b\u0081\n\b\r\b\16\b\u0082"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\6\t\u008b\n\t\r\t\16\t\u008c\3\t\3\t\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\6\n\u0099\n\n\r\n\16\n\u009a\3\n\3\n\3\13\3\13"+
		"\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00b0"+
		"\n\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u00b8\n\r\f\r\16\r\u00bb\13\r\3\16\3"+
		"\16\3\16\6\16\u00c0\n\16\r\16\16\16\u00c1\3\17\3\17\5\17\u00c6\n\17\3"+
		"\20\3\20\3\21\3\21\3\22\3\22\3\22\3\22\3\22\2\3\30\23\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \"\2\5\3\2\n\13\3\2\27\32\4\2\27\27\32\32\2\u00d9"+
		"\2%\3\2\2\2\4J\3\2\2\2\6L\3\2\2\2\bX\3\2\2\2\nc\3\2\2\2\fk\3\2\2\2\16"+
		"\u0080\3\2\2\2\20\u0084\3\2\2\2\22\u0090\3\2\2\2\24\u009e\3\2\2\2\26\u00a2"+
		"\3\2\2\2\30\u00af\3\2\2\2\32\u00bc\3\2\2\2\34\u00c5\3\2\2\2\36\u00c7\3"+
		"\2\2\2 \u00c9\3\2\2\2\"\u00cb\3\2\2\2$&\5\4\3\2%$\3\2\2\2&\'\3\2\2\2\'"+
		"%\3\2\2\2\'(\3\2\2\2(\3\3\2\2\2)*\5\20\t\2*+\7\34\2\2+K\3\2\2\2,-\5\22"+
		"\n\2-.\7\34\2\2.K\3\2\2\2/\60\5\f\7\2\60\61\7\34\2\2\61K\3\2\2\2\62\63"+
		"\5\30\r\2\63\64\7\34\2\2\64K\3\2\2\2\65\66\5\6\4\2\66\67\7\34\2\2\67K"+
		"\3\2\2\289\5\b\5\29:\7\34\2\2:K\3\2\2\2;<\5\n\6\2<=\7\34\2\2=K\3\2\2\2"+
		">A\5\24\13\2?A\5\26\f\2@>\3\2\2\2@?\3\2\2\2AB\3\2\2\2BC\7\34\2\2CK\3\2"+
		"\2\2DE\7\7\2\2EF\7\21\2\2FG\5\30\r\2GH\7\22\2\2HK\3\2\2\2IK\7\34\2\2J"+
		")\3\2\2\2J,\3\2\2\2J/\3\2\2\2J\62\3\2\2\2J\65\3\2\2\2J8\3\2\2\2J;\3\2"+
		"\2\2J@\3\2\2\2JD\3\2\2\2JI\3\2\2\2K\5\3\2\2\2LM\7\25\2\2MS\7\27\2\2NO"+
		"\7\23\2\2OP\7\25\2\2PR\7\27\2\2QN\3\2\2\2RU\3\2\2\2SQ\3\2\2\2ST\3\2\2"+
		"\2TV\3\2\2\2US\3\2\2\2VW\7\24\2\2W\7\3\2\2\2XY\7\25\2\2Y^\7\27\2\2Z[\7"+
		"\23\2\2[]\7\27\2\2\\Z\3\2\2\2]`\3\2\2\2^\\\3\2\2\2^_\3\2\2\2_a\3\2\2\2"+
		"`^\3\2\2\2ab\7\24\2\2b\t\3\2\2\2cd\7\26\2\2de\7\25\2\2ef\7\27\2\2fi\7"+
		"\16\2\2gj\5\30\r\2hj\5\36\20\2ig\3\2\2\2ih\3\2\2\2j\13\3\2\2\2kl\7\3\2"+
		"\2lm\7\21\2\2mn\5\"\22\2no\7\22\2\2op\7\17\2\2pq\5\16\b\2q}\7\20\2\2r"+
		"s\7\4\2\2sw\7\17\2\2tv\7\34\2\2ut\3\2\2\2vy\3\2\2\2wu\3\2\2\2wx\3\2\2"+
		"\2xz\3\2\2\2yw\3\2\2\2z{\5\16\b\2{|\7\20\2\2|~\3\2\2\2}r\3\2\2\2}~\3\2"+
		"\2\2~\r\3\2\2\2\177\u0081\5\4\3\2\u0080\177\3\2\2\2\u0081\u0082\3\2\2"+
		"\2\u0082\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083\17\3\2\2\2\u0084\u0085"+
		"\7\5\2\2\u0085\u0086\7\21\2\2\u0086\u0087\5\"\22\2\u0087\u0088\7\22\2"+
		"\2\u0088\u008a\7\17\2\2\u0089\u008b\5\4\3\2\u008a\u0089\3\2\2\2\u008b"+
		"\u008c\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008e\3\2"+
		"\2\2\u008e\u008f\7\20\2\2\u008f\21\3\2\2\2\u0090\u0091\7\6\2\2\u0091\u0092"+
		"\7\21\2\2\u0092\u0093\5\24\13\2\u0093\u0094\7\24\2\2\u0094\u0095\5\"\22"+
		"\2\u0095\u0096\7\22\2\2\u0096\u0098\7\17\2\2\u0097\u0099\5\4\3\2\u0098"+
		"\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u0098\3\2\2\2\u009a\u009b\3\2"+
		"\2\2\u009b\u009c\3\2\2\2\u009c\u009d\7\20\2\2\u009d\23\3\2\2\2\u009e\u009f"+
		"\7\27\2\2\u009f\u00a0\7\16\2\2\u00a0\u00a1\5\30\r\2\u00a1\25\3\2\2\2\u00a2"+
		"\u00a3\7\27\2\2\u00a3\u00a4\7\16\2\2\u00a4\u00a5\5\36\20\2\u00a5\27\3"+
		"\2\2\2\u00a6\u00a7\b\r\1\2\u00a7\u00b0\5\32\16\2\u00a8\u00b0\7\30\2\2"+
		"\u00a9\u00b0\7\27\2\2\u00aa\u00b0\7\31\2\2\u00ab\u00ac\7\21\2\2\u00ac"+
		"\u00ad\5\30\r\2\u00ad\u00ae\7\22\2\2\u00ae\u00b0\3\2\2\2\u00af\u00a6\3"+
		"\2\2\2\u00af\u00a8\3\2\2\2\u00af\u00a9\3\2\2\2\u00af\u00aa\3\2\2\2\u00af"+
		"\u00ab\3\2\2\2\u00b0\u00b9\3\2\2\2\u00b1\u00b2\f\t\2\2\u00b2\u00b3\t\2"+
		"\2\2\u00b3\u00b8\5\30\r\n\u00b4\u00b5\f\7\2\2\u00b5\u00b6\7\r\2\2\u00b6"+
		"\u00b8\5\30\r\b\u00b7\u00b1\3\2\2\2\u00b7\u00b4\3\2\2\2\u00b8\u00bb\3"+
		"\2\2\2\u00b9\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\31\3\2\2\2\u00bb"+
		"\u00b9\3\2\2\2\u00bc\u00bd\t\3\2\2\u00bd\u00bf\7\f\2\2\u00be\u00c0\5\34"+
		"\17\2\u00bf\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1"+
		"\u00c2\3\2\2\2\u00c2\33\3\2\2\2\u00c3\u00c6\5 \21\2\u00c4\u00c6\5\30\r"+
		"\2\u00c5\u00c3\3\2\2\2\u00c5\u00c4\3\2\2\2\u00c6\35\3\2\2\2\u00c7\u00c8"+
		"\7\32\2\2\u00c8\37\3\2\2\2\u00c9\u00ca\t\4\2\2\u00ca!\3\2\2\2\u00cb\u00cc"+
		"\t\3\2\2\u00cc\u00cd\7\t\2\2\u00cd\u00ce\t\3\2\2\u00ce#\3\2\2\2\22\'@"+
		"JS^iw}\u0082\u008c\u009a\u00af\u00b7\u00b9\u00c1\u00c5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}