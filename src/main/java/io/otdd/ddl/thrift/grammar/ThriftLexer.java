// Generated from Thrift.g4 by ANTLR 4.7
 package io.otdd.ddl.thrift.grammar; 
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ThriftLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, BoolType=12, ByteType=13, I8Type=14, I16Type=15, I32Type=16, 
		I64Type=17, DoubleType=18, EnumType=19, StringType=20, BinaryType=21, 
		StringValue=22, CharValue=23, BoolValue=24, NumberValue=25, DoubleValue=26, 
		BodyType=27, WS=28;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "BoolType", "ByteType", "I8Type", "I16Type", "I32Type", 
		"I64Type", "DoubleType", "EnumType", "StringType", "BinaryType", "StringValue", 
		"CharValue", "BoolValue", "NumberValue", "DoubleValue", "BodyType", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "':'", "'{'", "','", "'}'", "'<'", "'>'", "'['", "']'", "'map'", 
		"'set'", "'list'", "'bool'", "'byte'", "'i8'", "'i16'", "'i32'", "'i64'", 
		"'double'", "'enum'", "'string'", "'binary'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		"BoolType", "ByteType", "I8Type", "I16Type", "I32Type", "I64Type", "DoubleType", 
		"EnumType", "StringType", "BinaryType", "StringValue", "CharValue", "BoolValue", 
		"NumberValue", "DoubleValue", "BodyType", "WS"
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


	public ThriftLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Thrift.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\36\u00dc\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\3\2\3\3\3\3\3\4\3\4"+
		"\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13"+
		"\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16"+
		"\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22"+
		"\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27"+
		"\3\27\3\27\3\27\7\27\u0090\n\27\f\27\16\27\u0093\13\27\3\27\3\27\3\30"+
		"\3\30\3\30\3\30\5\30\u009b\n\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u00ba\n\31\3\32\3\32\7\32\u00be"+
		"\n\32\f\32\16\32\u00c1\13\32\3\32\5\32\u00c4\n\32\3\33\6\33\u00c7\n\33"+
		"\r\33\16\33\u00c8\3\33\3\33\6\33\u00cd\n\33\r\33\16\33\u00ce\3\34\6\34"+
		"\u00d2\n\34\r\34\16\34\u00d3\3\35\6\35\u00d7\n\35\r\35\16\35\u00d8\3\35"+
		"\3\35\2\2\36\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16"+
		"\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34"+
		"\67\359\36\3\2\b\3\2$$\3\2))\3\2\63;\3\2\62;\5\2\62;C\\c|\5\2\13\f\17"+
		"\17\"\"\2\u00e9\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3"+
		"\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2"+
		"\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3"+
		"\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2"+
		"\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\2"+
		"9\3\2\2\2\3;\3\2\2\2\5=\3\2\2\2\7?\3\2\2\2\tA\3\2\2\2\13C\3\2\2\2\rE\3"+
		"\2\2\2\17G\3\2\2\2\21I\3\2\2\2\23K\3\2\2\2\25O\3\2\2\2\27S\3\2\2\2\31"+
		"X\3\2\2\2\33]\3\2\2\2\35b\3\2\2\2\37e\3\2\2\2!i\3\2\2\2#m\3\2\2\2%q\3"+
		"\2\2\2\'x\3\2\2\2)}\3\2\2\2+\u0084\3\2\2\2-\u008b\3\2\2\2/\u0096\3\2\2"+
		"\2\61\u00b9\3\2\2\2\63\u00c3\3\2\2\2\65\u00c6\3\2\2\2\67\u00d1\3\2\2\2"+
		"9\u00d6\3\2\2\2;<\7<\2\2<\4\3\2\2\2=>\7}\2\2>\6\3\2\2\2?@\7.\2\2@\b\3"+
		"\2\2\2AB\7\177\2\2B\n\3\2\2\2CD\7>\2\2D\f\3\2\2\2EF\7@\2\2F\16\3\2\2\2"+
		"GH\7]\2\2H\20\3\2\2\2IJ\7_\2\2J\22\3\2\2\2KL\7o\2\2LM\7c\2\2MN\7r\2\2"+
		"N\24\3\2\2\2OP\7u\2\2PQ\7g\2\2QR\7v\2\2R\26\3\2\2\2ST\7n\2\2TU\7k\2\2"+
		"UV\7u\2\2VW\7v\2\2W\30\3\2\2\2XY\7d\2\2YZ\7q\2\2Z[\7q\2\2[\\\7n\2\2\\"+
		"\32\3\2\2\2]^\7d\2\2^_\7{\2\2_`\7v\2\2`a\7g\2\2a\34\3\2\2\2bc\7k\2\2c"+
		"d\7:\2\2d\36\3\2\2\2ef\7k\2\2fg\7\63\2\2gh\78\2\2h \3\2\2\2ij\7k\2\2j"+
		"k\7\65\2\2kl\7\64\2\2l\"\3\2\2\2mn\7k\2\2no\78\2\2op\7\66\2\2p$\3\2\2"+
		"\2qr\7f\2\2rs\7q\2\2st\7w\2\2tu\7d\2\2uv\7n\2\2vw\7g\2\2w&\3\2\2\2xy\7"+
		"g\2\2yz\7p\2\2z{\7w\2\2{|\7o\2\2|(\3\2\2\2}~\7u\2\2~\177\7v\2\2\177\u0080"+
		"\7t\2\2\u0080\u0081\7k\2\2\u0081\u0082\7p\2\2\u0082\u0083\7i\2\2\u0083"+
		"*\3\2\2\2\u0084\u0085\7d\2\2\u0085\u0086\7k\2\2\u0086\u0087\7p\2\2\u0087"+
		"\u0088\7c\2\2\u0088\u0089\7t\2\2\u0089\u008a\7{\2\2\u008a,\3\2\2\2\u008b"+
		"\u0091\7$\2\2\u008c\u008d\7^\2\2\u008d\u0090\7$\2\2\u008e\u0090\n\2\2"+
		"\2\u008f\u008c\3\2\2\2\u008f\u008e\3\2\2\2\u0090\u0093\3\2\2\2\u0091\u008f"+
		"\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0094\3\2\2\2\u0093\u0091\3\2\2\2\u0094"+
		"\u0095\7$\2\2\u0095.\3\2\2\2\u0096\u009a\7)\2\2\u0097\u0098\7^\2\2\u0098"+
		"\u009b\7)\2\2\u0099\u009b\n\3\2\2\u009a\u0097\3\2\2\2\u009a\u0099\3\2"+
		"\2\2\u009b\u009c\3\2\2\2\u009c\u009d\7)\2\2\u009d\60\3\2\2\2\u009e\u009f"+
		"\7v\2\2\u009f\u00a0\7t\2\2\u00a0\u00a1\7w\2\2\u00a1\u00ba\7g\2\2\u00a2"+
		"\u00a3\7h\2\2\u00a3\u00a4\7c\2\2\u00a4\u00a5\7n\2\2\u00a5\u00a6\7u\2\2"+
		"\u00a6\u00ba\7g\2\2\u00a7\u00a8\7V\2\2\u00a8\u00a9\7t\2\2\u00a9\u00aa"+
		"\7w\2\2\u00aa\u00ba\7g\2\2\u00ab\u00ac\7H\2\2\u00ac\u00ad\7c\2\2\u00ad"+
		"\u00ae\7n\2\2\u00ae\u00af\7u\2\2\u00af\u00ba\7g\2\2\u00b0\u00b1\7V\2\2"+
		"\u00b1\u00b2\7T\2\2\u00b2\u00b3\7W\2\2\u00b3\u00ba\7G\2\2\u00b4\u00b5"+
		"\7H\2\2\u00b5\u00b6\7C\2\2\u00b6\u00b7\7N\2\2\u00b7\u00b8\7U\2\2\u00b8"+
		"\u00ba\7G\2\2\u00b9\u009e\3\2\2\2\u00b9\u00a2\3\2\2\2\u00b9\u00a7\3\2"+
		"\2\2\u00b9\u00ab\3\2\2\2\u00b9\u00b0\3\2\2\2\u00b9\u00b4\3\2\2\2\u00ba"+
		"\62\3\2\2\2\u00bb\u00bf\t\4\2\2\u00bc\u00be\t\5\2\2\u00bd\u00bc\3\2\2"+
		"\2\u00be\u00c1\3\2\2\2\u00bf\u00bd\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c4"+
		"\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c2\u00c4\7\62\2\2\u00c3\u00bb\3\2\2\2"+
		"\u00c3\u00c2\3\2\2\2\u00c4\64\3\2\2\2\u00c5\u00c7\4\62;\2\u00c6\u00c5"+
		"\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9"+
		"\u00ca\3\2\2\2\u00ca\u00cc\7\60\2\2\u00cb\u00cd\4\62;\2\u00cc\u00cb\3"+
		"\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf"+
		"\66\3\2\2\2\u00d0\u00d2\t\6\2\2\u00d1\u00d0\3\2\2\2\u00d2\u00d3\3\2\2"+
		"\2\u00d3\u00d1\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d48\3\2\2\2\u00d5\u00d7"+
		"\t\7\2\2\u00d6\u00d5\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d8"+
		"\u00d9\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00db\b\35\2\2\u00db:\3\2\2\2"+
		"\r\2\u008f\u0091\u009a\u00b9\u00bf\u00c3\u00c8\u00ce\u00d3\u00d8\3\b\2"+
		"\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}