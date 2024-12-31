// Generated from bp.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class bpLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ASSIGN=1, WRITE=2, READ=3, BEGIN=4, END=5, LBR=6, RBR=7, SEMI=8, AND=9, 
		OR=10, NEG=11, ID=12, BV=13, WS=14;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"ASSIGN", "WRITE", "READ", "BEGIN", "END", "LBR", "RBR", "SEMI", "AND", 
			"OR", "NEG", "Letter", "Digit", "Underscore", "ID", "BV", "WS"
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


	public bpLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "bp.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u000eh\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001"+
		"\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001"+
		"\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0005\u000eR\b\u000e"+
		"\n\u000e\f\u000eU\t\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f"+
		"`\b\u000f\u0001\u0010\u0004\u0010c\b\u0010\u000b\u0010\f\u0010d\u0001"+
		"\u0010\u0001\u0010\u0000\u0000\u0011\u0001\u0001\u0003\u0002\u0005\u0003"+
		"\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015"+
		"\u000b\u0017\u0000\u0019\u0000\u001b\u0000\u001d\f\u001f\r!\u000e\u0001"+
		"\u0000\u0003\u0002\u0000AZaz\u0001\u000009\u0003\u0000\t\n\r\r  i\u0000"+
		"\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000"+
		"\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000"+
		"\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r"+
		"\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011"+
		"\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015"+
		"\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f"+
		"\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0001#\u0001\u0000"+
		"\u0000\u0000\u0003&\u0001\u0000\u0000\u0000\u0005,\u0001\u0000\u0000\u0000"+
		"\u00071\u0001\u0000\u0000\u0000\t7\u0001\u0000\u0000\u0000\u000b;\u0001"+
		"\u0000\u0000\u0000\r=\u0001\u0000\u0000\u0000\u000f?\u0001\u0000\u0000"+
		"\u0000\u0011A\u0001\u0000\u0000\u0000\u0013C\u0001\u0000\u0000\u0000\u0015"+
		"E\u0001\u0000\u0000\u0000\u0017G\u0001\u0000\u0000\u0000\u0019I\u0001"+
		"\u0000\u0000\u0000\u001bK\u0001\u0000\u0000\u0000\u001dM\u0001\u0000\u0000"+
		"\u0000\u001f_\u0001\u0000\u0000\u0000!b\u0001\u0000\u0000\u0000#$\u0005"+
		":\u0000\u0000$%\u0005=\u0000\u0000%\u0002\u0001\u0000\u0000\u0000&\'\u0005"+
		"w\u0000\u0000\'(\u0005r\u0000\u0000()\u0005i\u0000\u0000)*\u0005t\u0000"+
		"\u0000*+\u0005e\u0000\u0000+\u0004\u0001\u0000\u0000\u0000,-\u0005r\u0000"+
		"\u0000-.\u0005e\u0000\u0000./\u0005a\u0000\u0000/0\u0005d\u0000\u0000"+
		"0\u0006\u0001\u0000\u0000\u000012\u0005b\u0000\u000023\u0005e\u0000\u0000"+
		"34\u0005g\u0000\u000045\u0005i\u0000\u000056\u0005n\u0000\u00006\b\u0001"+
		"\u0000\u0000\u000078\u0005e\u0000\u000089\u0005n\u0000\u00009:\u0005d"+
		"\u0000\u0000:\n\u0001\u0000\u0000\u0000;<\u0005(\u0000\u0000<\f\u0001"+
		"\u0000\u0000\u0000=>\u0005)\u0000\u0000>\u000e\u0001\u0000\u0000\u0000"+
		"?@\u0005;\u0000\u0000@\u0010\u0001\u0000\u0000\u0000AB\u0005&\u0000\u0000"+
		"B\u0012\u0001\u0000\u0000\u0000CD\u0005|\u0000\u0000D\u0014\u0001\u0000"+
		"\u0000\u0000EF\u0005~\u0000\u0000F\u0016\u0001\u0000\u0000\u0000GH\u0007"+
		"\u0000\u0000\u0000H\u0018\u0001\u0000\u0000\u0000IJ\u0007\u0001\u0000"+
		"\u0000J\u001a\u0001\u0000\u0000\u0000KL\u0005_\u0000\u0000L\u001c\u0001"+
		"\u0000\u0000\u0000MS\u0003\u0017\u000b\u0000NR\u0003\u0017\u000b\u0000"+
		"OR\u0003\u0019\f\u0000PR\u0003\u001b\r\u0000QN\u0001\u0000\u0000\u0000"+
		"QO\u0001\u0000\u0000\u0000QP\u0001\u0000\u0000\u0000RU\u0001\u0000\u0000"+
		"\u0000SQ\u0001\u0000\u0000\u0000ST\u0001\u0000\u0000\u0000T\u001e\u0001"+
		"\u0000\u0000\u0000US\u0001\u0000\u0000\u0000VW\u0005t\u0000\u0000WX\u0005"+
		"r\u0000\u0000XY\u0005u\u0000\u0000Y`\u0005e\u0000\u0000Z[\u0005f\u0000"+
		"\u0000[\\\u0005a\u0000\u0000\\]\u0005l\u0000\u0000]^\u0005s\u0000\u0000"+
		"^`\u0005e\u0000\u0000_V\u0001\u0000\u0000\u0000_Z\u0001\u0000\u0000\u0000"+
		"` \u0001\u0000\u0000\u0000ac\u0007\u0002\u0000\u0000ba\u0001\u0000\u0000"+
		"\u0000cd\u0001\u0000\u0000\u0000db\u0001\u0000\u0000\u0000de\u0001\u0000"+
		"\u0000\u0000ef\u0001\u0000\u0000\u0000fg\u0006\u0010\u0000\u0000g\"\u0001"+
		"\u0000\u0000\u0000\u0005\u0000QS_d\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}