// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class GrammarParserParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ENTRY_MARKER=1, SEMICOLON=2, COLON=3, COMMA=4, PIPE=5, ARROW=6, EQUAL=7, 
		NOT_EQUAL=8, LPARENTHESIS=9, RPARENTHESIS=10, LBRAKET=11, RBRAKET=12, 
		TERMINAL=13, NON_TERMINAL=14, REGEX=15, REGEX_STYLE=16, CODE=17, WHITESPACE=18, 
		STRING=19;
	public static final int
		RULE_file = 0, RULE_entryPoint = 1, RULE_grammar_rule = 2, RULE_parse_rule = 3, 
		RULE_lexer_rule = 4, RULE_terminal_value = 5, RULE_input_attributes = 6, 
		RULE_output_attributes = 7, RULE_attribute = 8, RULE_attribute_name = 9, 
		RULE_attribute_value = 10, RULE_rule_elements = 11, RULE_element = 12, 
		RULE_arguments = 13, RULE_argument = 14;
	private static String[] makeRuleNames() {
		return new String[] {
			"file", "entryPoint", "grammar_rule", "parse_rule", "lexer_rule", "terminal_value", 
			"input_attributes", "output_attributes", "attribute", "attribute_name", 
			"attribute_value", "rule_elements", "element", "arguments", "argument"
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

	@Override
	public String getGrammarFileName() { return "java-escape"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GrammarParserParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FileContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(GrammarParserParser.EOF, 0); }
		public EntryPointContext entryPoint() {
			return getRuleContext(EntryPointContext.class,0);
		}
		public List<Grammar_ruleContext> grammar_rule() {
			return getRuleContexts(Grammar_ruleContext.class);
		}
		public Grammar_ruleContext grammar_rule(int i) {
			return getRuleContext(Grammar_ruleContext.class,i);
		}
		public FileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitFile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarParserVisitor ) return ((GrammarParserVisitor<? extends T>)visitor).visitFile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FileContext file() throws RecognitionException {
		FileContext _localctx = new FileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_file);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(30);
			entryPoint();
			setState(32); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(31);
				grammar_rule();
				}
				}
				setState(34); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TERMINAL || _la==NON_TERMINAL );
			}
			setState(36);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
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
	public static class EntryPointContext extends ParserRuleContext {
		public TerminalNode ENTRY_MARKER() { return getToken(GrammarParserParser.ENTRY_MARKER, 0); }
		public TerminalNode NON_TERMINAL() { return getToken(GrammarParserParser.NON_TERMINAL, 0); }
		public TerminalNode SEMICOLON() { return getToken(GrammarParserParser.SEMICOLON, 0); }
		public EntryPointContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entryPoint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterEntryPoint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitEntryPoint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarParserVisitor ) return ((GrammarParserVisitor<? extends T>)visitor).visitEntryPoint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EntryPointContext entryPoint() throws RecognitionException {
		EntryPointContext _localctx = new EntryPointContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_entryPoint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			match(ENTRY_MARKER);
			setState(39);
			match(NON_TERMINAL);
			setState(40);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
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
	public static class Grammar_ruleContext extends ParserRuleContext {
		public Parse_ruleContext parse_rule() {
			return getRuleContext(Parse_ruleContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(GrammarParserParser.SEMICOLON, 0); }
		public Lexer_ruleContext lexer_rule() {
			return getRuleContext(Lexer_ruleContext.class,0);
		}
		public Grammar_ruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grammar_rule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterGrammar_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitGrammar_rule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarParserVisitor ) return ((GrammarParserVisitor<? extends T>)visitor).visitGrammar_rule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Grammar_ruleContext grammar_rule() throws RecognitionException {
		Grammar_ruleContext _localctx = new Grammar_ruleContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_grammar_rule);
		try {
			setState(48);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NON_TERMINAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(42);
				parse_rule();
				setState(43);
				match(SEMICOLON);
				}
				break;
			case TERMINAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(45);
				lexer_rule();
				setState(46);
				match(SEMICOLON);
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
	public static class Parse_ruleContext extends ParserRuleContext {
		public TerminalNode NON_TERMINAL() { return getToken(GrammarParserParser.NON_TERMINAL, 0); }
		public TerminalNode ARROW() { return getToken(GrammarParserParser.ARROW, 0); }
		public List<Rule_elementsContext> rule_elements() {
			return getRuleContexts(Rule_elementsContext.class);
		}
		public Rule_elementsContext rule_elements(int i) {
			return getRuleContext(Rule_elementsContext.class,i);
		}
		public Input_attributesContext input_attributes() {
			return getRuleContext(Input_attributesContext.class,0);
		}
		public TerminalNode COLON() { return getToken(GrammarParserParser.COLON, 0); }
		public Output_attributesContext output_attributes() {
			return getRuleContext(Output_attributesContext.class,0);
		}
		public List<TerminalNode> PIPE() { return getTokens(GrammarParserParser.PIPE); }
		public TerminalNode PIPE(int i) {
			return getToken(GrammarParserParser.PIPE, i);
		}
		public Parse_ruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parse_rule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterParse_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitParse_rule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarParserVisitor ) return ((GrammarParserVisitor<? extends T>)visitor).visitParse_rule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parse_ruleContext parse_rule() throws RecognitionException {
		Parse_ruleContext _localctx = new Parse_ruleContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_parse_rule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			match(NON_TERMINAL);
			setState(52);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRAKET) {
				{
				setState(51);
				input_attributes();
				}
			}

			setState(56);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(54);
				match(COLON);
				setState(55);
				output_attributes();
				}
			}

			setState(58);
			match(ARROW);
			setState(59);
			rule_elements();
			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PIPE) {
				{
				{
				setState(60);
				match(PIPE);
				setState(61);
				rule_elements();
				}
				}
				setState(66);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Lexer_ruleContext extends ParserRuleContext {
		public Lexer_ruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lexer_rule; }
	 
		public Lexer_ruleContext() { }
		public void copyFrom(Lexer_ruleContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TokenRuleContext extends Lexer_ruleContext {
		public TerminalNode TERMINAL() { return getToken(GrammarParserParser.TERMINAL, 0); }
		public TerminalNode EQUAL() { return getToken(GrammarParserParser.EQUAL, 0); }
		public Terminal_valueContext terminal_value() {
			return getRuleContext(Terminal_valueContext.class,0);
		}
		public TokenRuleContext(Lexer_ruleContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterTokenRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitTokenRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarParserVisitor ) return ((GrammarParserVisitor<? extends T>)visitor).visitTokenRule(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SkipRuleContext extends Lexer_ruleContext {
		public TerminalNode TERMINAL() { return getToken(GrammarParserParser.TERMINAL, 0); }
		public TerminalNode NOT_EQUAL() { return getToken(GrammarParserParser.NOT_EQUAL, 0); }
		public Terminal_valueContext terminal_value() {
			return getRuleContext(Terminal_valueContext.class,0);
		}
		public SkipRuleContext(Lexer_ruleContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterSkipRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitSkipRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarParserVisitor ) return ((GrammarParserVisitor<? extends T>)visitor).visitSkipRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lexer_ruleContext lexer_rule() throws RecognitionException {
		Lexer_ruleContext _localctx = new Lexer_ruleContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_lexer_rule);
		try {
			setState(73);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				_localctx = new TokenRuleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(67);
				match(TERMINAL);
				setState(68);
				match(EQUAL);
				setState(69);
				terminal_value();
				}
				break;
			case 2:
				_localctx = new SkipRuleContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(70);
				match(TERMINAL);
				setState(71);
				match(NOT_EQUAL);
				setState(72);
				terminal_value();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Terminal_valueContext extends ParserRuleContext {
		public TerminalNode REGEX() { return getToken(GrammarParserParser.REGEX, 0); }
		public TerminalNode STRING() { return getToken(GrammarParserParser.STRING, 0); }
		public Terminal_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_terminal_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterTerminal_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitTerminal_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarParserVisitor ) return ((GrammarParserVisitor<? extends T>)visitor).visitTerminal_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Terminal_valueContext terminal_value() throws RecognitionException {
		Terminal_valueContext _localctx = new Terminal_valueContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_terminal_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			_la = _input.LA(1);
			if ( !(_la==REGEX || _la==STRING) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class Input_attributesContext extends ParserRuleContext {
		public TerminalNode LBRAKET() { return getToken(GrammarParserParser.LBRAKET, 0); }
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public TerminalNode RBRAKET() { return getToken(GrammarParserParser.RBRAKET, 0); }
		public List<TerminalNode> COMMA() { return getTokens(GrammarParserParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GrammarParserParser.COMMA, i);
		}
		public Input_attributesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input_attributes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterInput_attributes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitInput_attributes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarParserVisitor ) return ((GrammarParserVisitor<? extends T>)visitor).visitInput_attributes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Input_attributesContext input_attributes() throws RecognitionException {
		Input_attributesContext _localctx = new Input_attributesContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_input_attributes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(LBRAKET);
			setState(78);
			attribute();
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(79);
				match(COMMA);
				setState(80);
				attribute();
				}
				}
				setState(85);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(86);
			match(RBRAKET);
			}
		}
		catch (RecognitionException re) {
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
	public static class Output_attributesContext extends ParserRuleContext {
		public TerminalNode TERMINAL() { return getToken(GrammarParserParser.TERMINAL, 0); }
		public Output_attributesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_output_attributes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterOutput_attributes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitOutput_attributes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarParserVisitor ) return ((GrammarParserVisitor<? extends T>)visitor).visitOutput_attributes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Output_attributesContext output_attributes() throws RecognitionException {
		Output_attributesContext _localctx = new Output_attributesContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_output_attributes);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(TERMINAL);
			}
		}
		catch (RecognitionException re) {
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
	public static class AttributeContext extends ParserRuleContext {
		public Attribute_nameContext attribute_name() {
			return getRuleContext(Attribute_nameContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(GrammarParserParser.EQUAL, 0); }
		public Attribute_valueContext attribute_value() {
			return getRuleContext(Attribute_valueContext.class,0);
		}
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarParserVisitor ) return ((GrammarParserVisitor<? extends T>)visitor).visitAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_attribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			attribute_name();
			setState(91);
			match(EQUAL);
			setState(92);
			attribute_value();
			}
		}
		catch (RecognitionException re) {
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
	public static class Attribute_nameContext extends ParserRuleContext {
		public TerminalNode NON_TERMINAL() { return getToken(GrammarParserParser.NON_TERMINAL, 0); }
		public Attribute_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterAttribute_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitAttribute_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarParserVisitor ) return ((GrammarParserVisitor<? extends T>)visitor).visitAttribute_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Attribute_nameContext attribute_name() throws RecognitionException {
		Attribute_nameContext _localctx = new Attribute_nameContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_attribute_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			match(NON_TERMINAL);
			}
		}
		catch (RecognitionException re) {
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
	public static class Attribute_valueContext extends ParserRuleContext {
		public TerminalNode TERMINAL() { return getToken(GrammarParserParser.TERMINAL, 0); }
		public Attribute_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterAttribute_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitAttribute_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarParserVisitor ) return ((GrammarParserVisitor<? extends T>)visitor).visitAttribute_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Attribute_valueContext attribute_value() throws RecognitionException {
		Attribute_valueContext _localctx = new Attribute_valueContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_attribute_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			match(TERMINAL);
			}
		}
		catch (RecognitionException re) {
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
	public static class Rule_elementsContext extends ParserRuleContext {
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public Rule_elementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rule_elements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterRule_elements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitRule_elements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarParserVisitor ) return ((GrammarParserVisitor<? extends T>)visitor).visitRule_elements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Rule_elementsContext rule_elements() throws RecognitionException {
		Rule_elementsContext _localctx = new Rule_elementsContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_rule_elements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 155648L) != 0) {
				{
				{
				setState(98);
				element();
				}
				}
				setState(103);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ElementContext extends ParserRuleContext {
		public TerminalNode NON_TERMINAL() { return getToken(GrammarParserParser.NON_TERMINAL, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public TerminalNode TERMINAL() { return getToken(GrammarParserParser.TERMINAL, 0); }
		public TerminalNode CODE() { return getToken(GrammarParserParser.CODE, 0); }
		public ElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarParserVisitor ) return ((GrammarParserVisitor<? extends T>)visitor).visitElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_element);
		int _la;
		try {
			setState(110);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NON_TERMINAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(104);
				match(NON_TERMINAL);
				setState(106);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPARENTHESIS) {
					{
					setState(105);
					arguments();
					}
				}

				}
				break;
			case TERMINAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(108);
				match(TERMINAL);
				}
				break;
			case CODE:
				enterOuterAlt(_localctx, 3);
				{
				setState(109);
				match(CODE);
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
	public static class ArgumentsContext extends ParserRuleContext {
		public TerminalNode LPARENTHESIS() { return getToken(GrammarParserParser.LPARENTHESIS, 0); }
		public List<ArgumentContext> argument() {
			return getRuleContexts(ArgumentContext.class);
		}
		public ArgumentContext argument(int i) {
			return getRuleContext(ArgumentContext.class,i);
		}
		public TerminalNode RPARENTHESIS() { return getToken(GrammarParserParser.RPARENTHESIS, 0); }
		public List<TerminalNode> COMMA() { return getTokens(GrammarParserParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GrammarParserParser.COMMA, i);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarParserVisitor ) return ((GrammarParserVisitor<? extends T>)visitor).visitArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(LPARENTHESIS);
			setState(113);
			argument();
			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(114);
				match(COMMA);
				setState(115);
				argument();
				}
				}
				setState(120);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(121);
			match(RPARENTHESIS);
			}
		}
		catch (RecognitionException re) {
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
	public static class ArgumentContext extends ParserRuleContext {
		public TerminalNode NON_TERMINAL() { return getToken(GrammarParserParser.NON_TERMINAL, 0); }
		public TerminalNode TERMINAL() { return getToken(GrammarParserParser.TERMINAL, 0); }
		public TerminalNode CODE() { return getToken(GrammarParserParser.CODE, 0); }
		public ArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarParserVisitor ) return ((GrammarParserVisitor<? extends T>)visitor).visitArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentContext argument() throws RecognitionException {
		ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_argument);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 155648L) != 0) ) {
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

	public static final String _serializedATN =
		"\u0004\u0001\u0013~\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0001\u0000\u0001\u0000"+
		"\u0004\u0000!\b\u0000\u000b\u0000\f\u0000\"\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u00021\b\u0002\u0001"+
		"\u0003\u0001\u0003\u0003\u00035\b\u0003\u0001\u0003\u0001\u0003\u0003"+
		"\u00039\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005"+
		"\u0003?\b\u0003\n\u0003\f\u0003B\t\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004J\b\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005"+
		"\u0006R\b\u0006\n\u0006\f\u0006U\t\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\n\u0001\n\u0001\u000b\u0005\u000bd\b\u000b\n\u000b\f\u000bg\t\u000b\u0001"+
		"\f\u0001\f\u0003\fk\b\f\u0001\f\u0001\f\u0003\fo\b\f\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0005\ru\b\r\n\r\f\rx\t\r\u0001\r\u0001\r\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0000\u0000\u000f\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u0000\u0002\u0002\u0000\u000f"+
		"\u000f\u0013\u0013\u0002\u0000\r\u000e\u0011\u0011z\u0000\u001e\u0001"+
		"\u0000\u0000\u0000\u0002&\u0001\u0000\u0000\u0000\u00040\u0001\u0000\u0000"+
		"\u0000\u00062\u0001\u0000\u0000\u0000\bI\u0001\u0000\u0000\u0000\nK\u0001"+
		"\u0000\u0000\u0000\fM\u0001\u0000\u0000\u0000\u000eX\u0001\u0000\u0000"+
		"\u0000\u0010Z\u0001\u0000\u0000\u0000\u0012^\u0001\u0000\u0000\u0000\u0014"+
		"`\u0001\u0000\u0000\u0000\u0016e\u0001\u0000\u0000\u0000\u0018n\u0001"+
		"\u0000\u0000\u0000\u001ap\u0001\u0000\u0000\u0000\u001c{\u0001\u0000\u0000"+
		"\u0000\u001e \u0003\u0002\u0001\u0000\u001f!\u0003\u0004\u0002\u0000 "+
		"\u001f\u0001\u0000\u0000\u0000!\"\u0001\u0000\u0000\u0000\" \u0001\u0000"+
		"\u0000\u0000\"#\u0001\u0000\u0000\u0000#$\u0001\u0000\u0000\u0000$%\u0005"+
		"\u0000\u0000\u0001%\u0001\u0001\u0000\u0000\u0000&\'\u0005\u0001\u0000"+
		"\u0000\'(\u0005\u000e\u0000\u0000()\u0005\u0002\u0000\u0000)\u0003\u0001"+
		"\u0000\u0000\u0000*+\u0003\u0006\u0003\u0000+,\u0005\u0002\u0000\u0000"+
		",1\u0001\u0000\u0000\u0000-.\u0003\b\u0004\u0000./\u0005\u0002\u0000\u0000"+
		"/1\u0001\u0000\u0000\u00000*\u0001\u0000\u0000\u00000-\u0001\u0000\u0000"+
		"\u00001\u0005\u0001\u0000\u0000\u000024\u0005\u000e\u0000\u000035\u0003"+
		"\f\u0006\u000043\u0001\u0000\u0000\u000045\u0001\u0000\u0000\u000058\u0001"+
		"\u0000\u0000\u000067\u0005\u0003\u0000\u000079\u0003\u000e\u0007\u0000"+
		"86\u0001\u0000\u0000\u000089\u0001\u0000\u0000\u00009:\u0001\u0000\u0000"+
		"\u0000:;\u0005\u0006\u0000\u0000;@\u0003\u0016\u000b\u0000<=\u0005\u0005"+
		"\u0000\u0000=?\u0003\u0016\u000b\u0000><\u0001\u0000\u0000\u0000?B\u0001"+
		"\u0000\u0000\u0000@>\u0001\u0000\u0000\u0000@A\u0001\u0000\u0000\u0000"+
		"A\u0007\u0001\u0000\u0000\u0000B@\u0001\u0000\u0000\u0000CD\u0005\r\u0000"+
		"\u0000DE\u0005\u0007\u0000\u0000EJ\u0003\n\u0005\u0000FG\u0005\r\u0000"+
		"\u0000GH\u0005\b\u0000\u0000HJ\u0003\n\u0005\u0000IC\u0001\u0000\u0000"+
		"\u0000IF\u0001\u0000\u0000\u0000J\t\u0001\u0000\u0000\u0000KL\u0007\u0000"+
		"\u0000\u0000L\u000b\u0001\u0000\u0000\u0000MN\u0005\u000b\u0000\u0000"+
		"NS\u0003\u0010\b\u0000OP\u0005\u0004\u0000\u0000PR\u0003\u0010\b\u0000"+
		"QO\u0001\u0000\u0000\u0000RU\u0001\u0000\u0000\u0000SQ\u0001\u0000\u0000"+
		"\u0000ST\u0001\u0000\u0000\u0000TV\u0001\u0000\u0000\u0000US\u0001\u0000"+
		"\u0000\u0000VW\u0005\f\u0000\u0000W\r\u0001\u0000\u0000\u0000XY\u0005"+
		"\r\u0000\u0000Y\u000f\u0001\u0000\u0000\u0000Z[\u0003\u0012\t\u0000[\\"+
		"\u0005\u0007\u0000\u0000\\]\u0003\u0014\n\u0000]\u0011\u0001\u0000\u0000"+
		"\u0000^_\u0005\u000e\u0000\u0000_\u0013\u0001\u0000\u0000\u0000`a\u0005"+
		"\r\u0000\u0000a\u0015\u0001\u0000\u0000\u0000bd\u0003\u0018\f\u0000cb"+
		"\u0001\u0000\u0000\u0000dg\u0001\u0000\u0000\u0000ec\u0001\u0000\u0000"+
		"\u0000ef\u0001\u0000\u0000\u0000f\u0017\u0001\u0000\u0000\u0000ge\u0001"+
		"\u0000\u0000\u0000hj\u0005\u000e\u0000\u0000ik\u0003\u001a\r\u0000ji\u0001"+
		"\u0000\u0000\u0000jk\u0001\u0000\u0000\u0000ko\u0001\u0000\u0000\u0000"+
		"lo\u0005\r\u0000\u0000mo\u0005\u0011\u0000\u0000nh\u0001\u0000\u0000\u0000"+
		"nl\u0001\u0000\u0000\u0000nm\u0001\u0000\u0000\u0000o\u0019\u0001\u0000"+
		"\u0000\u0000pq\u0005\t\u0000\u0000qv\u0003\u001c\u000e\u0000rs\u0005\u0004"+
		"\u0000\u0000su\u0003\u001c\u000e\u0000tr\u0001\u0000\u0000\u0000ux\u0001"+
		"\u0000\u0000\u0000vt\u0001\u0000\u0000\u0000vw\u0001\u0000\u0000\u0000"+
		"wy\u0001\u0000\u0000\u0000xv\u0001\u0000\u0000\u0000yz\u0005\n\u0000\u0000"+
		"z\u001b\u0001\u0000\u0000\u0000{|\u0007\u0001\u0000\u0000|\u001d\u0001"+
		"\u0000\u0000\u0000\u000b\"048@ISejnv";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}