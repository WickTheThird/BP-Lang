// Generated from bp.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class bpParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ASSIGN=1, WRITE=2, READ=3, BEGIN=4, END=5, LBR=6, RBR=7, SEMI=8, AND=9, 
		OR=10, NEG=11, ID=12, BV=13, WS=14;
	public static final int
		RULE_prog = 0, RULE_stm = 1, RULE_expr = 2;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "stm", "expr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "':='", "'write'", "'read'", "'begin'", "'end'", "'('", "')'", 
			"';'", "'&'", "'|'", "'~'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ASSIGN", "WRITE", "READ", "BEGIN", "END", "LBR", "RBR", "SEMI", 
			"AND", "OR", "NEG", "ID", "BV", "WS"
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
	public String getGrammarFileName() { return "bp.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public bpParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgContext extends ParserRuleContext {
		public TerminalNode BEGIN() { return getToken(bpParser.BEGIN, 0); }
		public TerminalNode END() { return getToken(bpParser.END, 0); }
		public List<StmContext> stm() {
			return getRuleContexts(StmContext.class);
		}
		public StmContext stm(int i) {
			return getRuleContext(StmContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bpVisitor ) return ((bpVisitor<? extends T>)visitor).visitProg(this);
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
			setState(6);
			match(BEGIN);
			setState(10);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4108L) != 0)) {
				{
				{
				setState(7);
				stm();
				}
				}
				setState(12);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(13);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StmContext extends ParserRuleContext {
		public StmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stm; }
	 
		public StmContext() { }
		public void copyFrom(StmContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignStmContext extends StmContext {
		public TerminalNode ID() { return getToken(bpParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(bpParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(bpParser.SEMI, 0); }
		public AssignStmContext(StmContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bpVisitor ) return ((bpVisitor<? extends T>)visitor).visitAssignStm(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WriteStmContext extends StmContext {
		public TerminalNode WRITE() { return getToken(bpParser.WRITE, 0); }
		public TerminalNode LBR() { return getToken(bpParser.LBR, 0); }
		public TerminalNode ID() { return getToken(bpParser.ID, 0); }
		public TerminalNode RBR() { return getToken(bpParser.RBR, 0); }
		public TerminalNode SEMI() { return getToken(bpParser.SEMI, 0); }
		public WriteStmContext(StmContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bpVisitor ) return ((bpVisitor<? extends T>)visitor).visitWriteStm(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ReadStmContext extends StmContext {
		public TerminalNode READ() { return getToken(bpParser.READ, 0); }
		public TerminalNode LBR() { return getToken(bpParser.LBR, 0); }
		public TerminalNode ID() { return getToken(bpParser.ID, 0); }
		public TerminalNode RBR() { return getToken(bpParser.RBR, 0); }
		public TerminalNode SEMI() { return getToken(bpParser.SEMI, 0); }
		public ReadStmContext(StmContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bpVisitor ) return ((bpVisitor<? extends T>)visitor).visitReadStm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmContext stm() throws RecognitionException {
		StmContext _localctx = new StmContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stm);
		try {
			setState(30);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				_localctx = new AssignStmContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(15);
				match(ID);
				setState(16);
				match(ASSIGN);
				setState(17);
				expr(0);
				setState(18);
				match(SEMI);
				}
				break;
			case READ:
				_localctx = new ReadStmContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(20);
				match(READ);
				setState(21);
				match(LBR);
				setState(22);
				match(ID);
				setState(23);
				match(RBR);
				setState(24);
				match(SEMI);
				}
				break;
			case WRITE:
				_localctx = new WriteStmContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(25);
				match(WRITE);
				setState(26);
				match(LBR);
				setState(27);
				match(ID);
				setState(28);
				match(RBR);
				setState(29);
				match(SEMI);
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

	@SuppressWarnings("CheckReturnValue")
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
	@SuppressWarnings("CheckReturnValue")
	public static class ParensContext extends ExprContext {
		public TerminalNode LBR() { return getToken(bpParser.LBR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RBR() { return getToken(bpParser.RBR, 0); }
		public ParensContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bpVisitor ) return ((bpVisitor<? extends T>)visitor).visitParens(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BoolVContext extends ExprContext {
		public TerminalNode BV() { return getToken(bpParser.BV, 0); }
		public BoolVContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bpVisitor ) return ((bpVisitor<? extends T>)visitor).visitBoolV(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NegOpContext extends ExprContext {
		public TerminalNode NEG() { return getToken(bpParser.NEG, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public NegOpContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bpVisitor ) return ((bpVisitor<? extends T>)visitor).visitNegOp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdContext extends ExprContext {
		public TerminalNode ID() { return getToken(bpParser.ID, 0); }
		public IdContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bpVisitor ) return ((bpVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BinOpContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode AND() { return getToken(bpParser.AND, 0); }
		public TerminalNode OR() { return getToken(bpParser.OR, 0); }
		public BinOpContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bpVisitor ) return ((bpVisitor<? extends T>)visitor).visitBinOp(this);
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
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBR:
				{
				_localctx = new ParensContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(33);
				match(LBR);
				setState(34);
				expr(0);
				setState(35);
				match(RBR);
				}
				break;
			case NEG:
				{
				_localctx = new NegOpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(37);
				match(NEG);
				setState(38);
				expr(4);
				}
				break;
			case BV:
				{
				_localctx = new BoolVContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(39);
				match(BV);
				}
				break;
			case ID:
				{
				_localctx = new IdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(40);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(48);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new BinOpContext(new ExprContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_expr);
					setState(43);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(44);
					((BinOpContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==AND || _la==OR) ) {
						((BinOpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(45);
					expr(4);
					}
					} 
				}
				setState(50);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 2:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u000e4\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0001\u0000\u0001\u0000\u0005\u0000\t\b\u0000\n\u0000"+
		"\f\u0000\f\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0003\u0001\u001f\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003"+
		"\u0002*\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002/\b\u0002"+
		"\n\u0002\f\u00022\t\u0002\u0001\u0002\u0000\u0001\u0004\u0003\u0000\u0002"+
		"\u0004\u0000\u0001\u0001\u0000\t\n7\u0000\u0006\u0001\u0000\u0000\u0000"+
		"\u0002\u001e\u0001\u0000\u0000\u0000\u0004)\u0001\u0000\u0000\u0000\u0006"+
		"\n\u0005\u0004\u0000\u0000\u0007\t\u0003\u0002\u0001\u0000\b\u0007\u0001"+
		"\u0000\u0000\u0000\t\f\u0001\u0000\u0000\u0000\n\b\u0001\u0000\u0000\u0000"+
		"\n\u000b\u0001\u0000\u0000\u0000\u000b\r\u0001\u0000\u0000\u0000\f\n\u0001"+
		"\u0000\u0000\u0000\r\u000e\u0005\u0005\u0000\u0000\u000e\u0001\u0001\u0000"+
		"\u0000\u0000\u000f\u0010\u0005\f\u0000\u0000\u0010\u0011\u0005\u0001\u0000"+
		"\u0000\u0011\u0012\u0003\u0004\u0002\u0000\u0012\u0013\u0005\b\u0000\u0000"+
		"\u0013\u001f\u0001\u0000\u0000\u0000\u0014\u0015\u0005\u0003\u0000\u0000"+
		"\u0015\u0016\u0005\u0006\u0000\u0000\u0016\u0017\u0005\f\u0000\u0000\u0017"+
		"\u0018\u0005\u0007\u0000\u0000\u0018\u001f\u0005\b\u0000\u0000\u0019\u001a"+
		"\u0005\u0002\u0000\u0000\u001a\u001b\u0005\u0006\u0000\u0000\u001b\u001c"+
		"\u0005\f\u0000\u0000\u001c\u001d\u0005\u0007\u0000\u0000\u001d\u001f\u0005"+
		"\b\u0000\u0000\u001e\u000f\u0001\u0000\u0000\u0000\u001e\u0014\u0001\u0000"+
		"\u0000\u0000\u001e\u0019\u0001\u0000\u0000\u0000\u001f\u0003\u0001\u0000"+
		"\u0000\u0000 !\u0006\u0002\uffff\uffff\u0000!\"\u0005\u0006\u0000\u0000"+
		"\"#\u0003\u0004\u0002\u0000#$\u0005\u0007\u0000\u0000$*\u0001\u0000\u0000"+
		"\u0000%&\u0005\u000b\u0000\u0000&*\u0003\u0004\u0002\u0004\'*\u0005\r"+
		"\u0000\u0000(*\u0005\f\u0000\u0000) \u0001\u0000\u0000\u0000)%\u0001\u0000"+
		"\u0000\u0000)\'\u0001\u0000\u0000\u0000)(\u0001\u0000\u0000\u0000*0\u0001"+
		"\u0000\u0000\u0000+,\n\u0003\u0000\u0000,-\u0007\u0000\u0000\u0000-/\u0003"+
		"\u0004\u0002\u0004.+\u0001\u0000\u0000\u0000/2\u0001\u0000\u0000\u0000"+
		"0.\u0001\u0000\u0000\u000001\u0001\u0000\u0000\u00001\u0005\u0001\u0000"+
		"\u0000\u000020\u0001\u0000\u0000\u0000\u0004\n\u001e)0";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}