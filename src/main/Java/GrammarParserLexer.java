// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class GrammarParserLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ENTRY_MARKER=1, SEMICOLON=2, COLON=3, COMMA=4, PIPE=5, ARROW=6, EQUAL=7, 
		NOT_EQUAL=8, LPARENTHESIS=9, RPARENTHESIS=10, LBRAKET=11, RBRAKET=12, 
		TERMINAL=13, NON_TERMINAL=14, REGEX=15, REGEX_STYLE=16, CODE=17, WHITESPACE=18, 
		STRING=19;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"ENTRY_MARKER", "SEMICOLON", "COLON", "COMMA", "PIPE", "ARROW", "EQUAL", 
			"NOT_EQUAL", "LPARENTHESIS", "RPARENTHESIS", "LBRAKET", "RBRAKET", "TERMINAL", 
			"NON_TERMINAL", "REGEX", "REGEX_STYLE", "CODE", "WHITESPACE", "STRING"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'=>'", "';'", "':'", "','", "'|'", "'->'", "'='", "'!='", "'('", 
			"')'", "'['", "']'", null, null, null, "'''"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ENTRY_MARKER", "SEMICOLON", "COLON", "COMMA", "PIPE", "ARROW", 
			"EQUAL", "NOT_EQUAL", "LPARENTHESIS", "RPARENTHESIS", "LBRAKET", "RBRAKET", 
			"TERMINAL", "NON_TERMINAL", "REGEX", "REGEX_STYLE", "CODE", "WHITESPACE", 
			"STRING"
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


	public GrammarParserLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "GrammarParser.g4"; }

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
		"\u0004\u0000\u0013\u007f\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0005\fE\b\f\n\f\f"+
		"\fH\t\f\u0001\r\u0001\r\u0005\rL\b\r\n\r\f\rO\t\r\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0005\u000eU\b\u000e\n\u000e\f\u000eX\t\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010"+
		"\u0004\u0010`\b\u0010\u000b\u0010\f\u0010a\u0001\u0010\u0003\u0010e\b"+
		"\u0010\u0005\u0010g\b\u0010\n\u0010\f\u0010j\t\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0011\u0004\u0011o\b\u0011\u000b\u0011\f\u0011p\u0001\u0011"+
		"\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0005\u0012"+
		"y\b\u0012\n\u0012\f\u0012|\t\u0012\u0001\u0012\u0001\u0012\u0000\u0000"+
		"\u0013\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006"+
		"\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e"+
		"\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\u0001\u0000\b\u0001\u0000"+
		"AZ\u0006\u000009<<>>AZ__az\u0001\u0000az\u0004\u000009AZ__az\u0003\u0000"+
		"\n\n\r\r\'\'\u0002\u0000{{}}\u0003\u0000\t\n\r\r  \u0001\u0000\"\"\u0088"+
		"\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000"+
		"\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000"+
		"\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000"+
		"\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011"+
		"\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015"+
		"\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019"+
		"\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d"+
		"\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001"+
		"\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000"+
		"\u0000\u0001\'\u0001\u0000\u0000\u0000\u0003*\u0001\u0000\u0000\u0000"+
		"\u0005,\u0001\u0000\u0000\u0000\u0007.\u0001\u0000\u0000\u0000\t0\u0001"+
		"\u0000\u0000\u0000\u000b2\u0001\u0000\u0000\u0000\r5\u0001\u0000\u0000"+
		"\u0000\u000f7\u0001\u0000\u0000\u0000\u0011:\u0001\u0000\u0000\u0000\u0013"+
		"<\u0001\u0000\u0000\u0000\u0015>\u0001\u0000\u0000\u0000\u0017@\u0001"+
		"\u0000\u0000\u0000\u0019B\u0001\u0000\u0000\u0000\u001bI\u0001\u0000\u0000"+
		"\u0000\u001dP\u0001\u0000\u0000\u0000\u001f[\u0001\u0000\u0000\u0000!"+
		"]\u0001\u0000\u0000\u0000#n\u0001\u0000\u0000\u0000%t\u0001\u0000\u0000"+
		"\u0000\'(\u0005=\u0000\u0000()\u0005>\u0000\u0000)\u0002\u0001\u0000\u0000"+
		"\u0000*+\u0005;\u0000\u0000+\u0004\u0001\u0000\u0000\u0000,-\u0005:\u0000"+
		"\u0000-\u0006\u0001\u0000\u0000\u0000./\u0005,\u0000\u0000/\b\u0001\u0000"+
		"\u0000\u000001\u0005|\u0000\u00001\n\u0001\u0000\u0000\u000023\u0005-"+
		"\u0000\u000034\u0005>\u0000\u00004\f\u0001\u0000\u0000\u000056\u0005="+
		"\u0000\u00006\u000e\u0001\u0000\u0000\u000078\u0005!\u0000\u000089\u0005"+
		"=\u0000\u00009\u0010\u0001\u0000\u0000\u0000:;\u0005(\u0000\u0000;\u0012"+
		"\u0001\u0000\u0000\u0000<=\u0005)\u0000\u0000=\u0014\u0001\u0000\u0000"+
		"\u0000>?\u0005[\u0000\u0000?\u0016\u0001\u0000\u0000\u0000@A\u0005]\u0000"+
		"\u0000A\u0018\u0001\u0000\u0000\u0000BF\u0007\u0000\u0000\u0000CE\u0007"+
		"\u0001\u0000\u0000DC\u0001\u0000\u0000\u0000EH\u0001\u0000\u0000\u0000"+
		"FD\u0001\u0000\u0000\u0000FG\u0001\u0000\u0000\u0000G\u001a\u0001\u0000"+
		"\u0000\u0000HF\u0001\u0000\u0000\u0000IM\u0007\u0002\u0000\u0000JL\u0007"+
		"\u0003\u0000\u0000KJ\u0001\u0000\u0000\u0000LO\u0001\u0000\u0000\u0000"+
		"MK\u0001\u0000\u0000\u0000MN\u0001\u0000\u0000\u0000N\u001c\u0001\u0000"+
		"\u0000\u0000OM\u0001\u0000\u0000\u0000PV\u0005\'\u0000\u0000QU\b\u0004"+
		"\u0000\u0000RS\u0005\\\u0000\u0000SU\u0005\'\u0000\u0000TQ\u0001\u0000"+
		"\u0000\u0000TR\u0001\u0000\u0000\u0000UX\u0001\u0000\u0000\u0000VT\u0001"+
		"\u0000\u0000\u0000VW\u0001\u0000\u0000\u0000WY\u0001\u0000\u0000\u0000"+
		"XV\u0001\u0000\u0000\u0000YZ\u0005\'\u0000\u0000Z\u001e\u0001\u0000\u0000"+
		"\u0000[\\\u0005\'\u0000\u0000\\ \u0001\u0000\u0000\u0000]h\u0005{\u0000"+
		"\u0000^`\b\u0005\u0000\u0000_^\u0001\u0000\u0000\u0000`a\u0001\u0000\u0000"+
		"\u0000a_\u0001\u0000\u0000\u0000ab\u0001\u0000\u0000\u0000bd\u0001\u0000"+
		"\u0000\u0000ce\u0003!\u0010\u0000dc\u0001\u0000\u0000\u0000de\u0001\u0000"+
		"\u0000\u0000eg\u0001\u0000\u0000\u0000f_\u0001\u0000\u0000\u0000gj\u0001"+
		"\u0000\u0000\u0000hf\u0001\u0000\u0000\u0000hi\u0001\u0000\u0000\u0000"+
		"ik\u0001\u0000\u0000\u0000jh\u0001\u0000\u0000\u0000kl\u0005}\u0000\u0000"+
		"l\"\u0001\u0000\u0000\u0000mo\u0007\u0006\u0000\u0000nm\u0001\u0000\u0000"+
		"\u0000op\u0001\u0000\u0000\u0000pn\u0001\u0000\u0000\u0000pq\u0001\u0000"+
		"\u0000\u0000qr\u0001\u0000\u0000\u0000rs\u0006\u0011\u0000\u0000s$\u0001"+
		"\u0000\u0000\u0000tz\u0005\"\u0000\u0000uy\b\u0007\u0000\u0000vw\u0005"+
		"\\\u0000\u0000wy\u0005\"\u0000\u0000xu\u0001\u0000\u0000\u0000xv\u0001"+
		"\u0000\u0000\u0000y|\u0001\u0000\u0000\u0000zx\u0001\u0000\u0000\u0000"+
		"z{\u0001\u0000\u0000\u0000{}\u0001\u0000\u0000\u0000|z\u0001\u0000\u0000"+
		"\u0000}~\u0005\"\u0000\u0000~&\u0001\u0000\u0000\u0000\u000b\u0000FMT"+
		"Vadhpxz\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}