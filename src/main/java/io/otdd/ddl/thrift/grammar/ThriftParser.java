// Generated from Thrift.g4 by ANTLR 4.7
 package io.otdd.ddl.thrift.grammar; 
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ThriftParser extends Parser {
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
	public static final int
		RULE_response = 0, RULE_body = 1, RULE_mapElement = 2, RULE_mapKey = 3, 
		RULE_setElement = 4, RULE_setKey = 5, RULE_listElement = 6, RULE_listKey = 7, 
		RULE_basicElement = 8, RULE_basicKey = 9, RULE_basicType = 10, RULE_basicValue = 11, 
		RULE_charValue = 12, RULE_stringValue = 13, RULE_boolValue = 14, RULE_numberValue = 15, 
		RULE_doubleValue = 16, RULE_mapValue = 17, RULE_mapValueElement = 18, 
		RULE_setOrListValue = 19, RULE_containerValue = 20, RULE_seq = 21, RULE_boolType = 22, 
		RULE_byteType = 23, RULE_i8Type = 24, RULE_i16Type = 25, RULE_i32Type = 26, 
		RULE_i64Type = 27, RULE_enumType = 28, RULE_doubleType = 29, RULE_stringType = 30, 
		RULE_binaryType = 31, RULE_bodyType = 32, RULE_mapType = 33, RULE_setType = 34, 
		RULE_listType = 35;
	public static final String[] ruleNames = {
		"response", "body", "mapElement", "mapKey", "setElement", "setKey", "listElement", 
		"listKey", "basicElement", "basicKey", "basicType", "basicValue", "charValue", 
		"stringValue", "boolValue", "numberValue", "doubleValue", "mapValue", 
		"mapValueElement", "setOrListValue", "containerValue", "seq", "boolType", 
		"byteType", "i8Type", "i16Type", "i32Type", "i64Type", "enumType", "doubleType", 
		"stringType", "binaryType", "bodyType", "mapType", "setType", "listType"
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

	@Override
	public String getGrammarFileName() { return "Thrift.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ThriftParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ResponseContext extends ParserRuleContext {
		public BoolTypeContext boolType() {
			return getRuleContext(BoolTypeContext.class,0);
		}
		public ByteTypeContext byteType() {
			return getRuleContext(ByteTypeContext.class,0);
		}
		public I8TypeContext i8Type() {
			return getRuleContext(I8TypeContext.class,0);
		}
		public I16TypeContext i16Type() {
			return getRuleContext(I16TypeContext.class,0);
		}
		public I32TypeContext i32Type() {
			return getRuleContext(I32TypeContext.class,0);
		}
		public I64TypeContext i64Type() {
			return getRuleContext(I64TypeContext.class,0);
		}
		public EnumTypeContext enumType() {
			return getRuleContext(EnumTypeContext.class,0);
		}
		public DoubleTypeContext doubleType() {
			return getRuleContext(DoubleTypeContext.class,0);
		}
		public StringTypeContext stringType() {
			return getRuleContext(StringTypeContext.class,0);
		}
		public BinaryTypeContext binaryType() {
			return getRuleContext(BinaryTypeContext.class,0);
		}
		public BodyTypeContext bodyType() {
			return getRuleContext(BodyTypeContext.class,0);
		}
		public MapTypeContext mapType() {
			return getRuleContext(MapTypeContext.class,0);
		}
		public ListTypeContext listType() {
			return getRuleContext(ListTypeContext.class,0);
		}
		public SetTypeContext setType() {
			return getRuleContext(SetTypeContext.class,0);
		}
		public BoolValueContext boolValue() {
			return getRuleContext(BoolValueContext.class,0);
		}
		public CharValueContext charValue() {
			return getRuleContext(CharValueContext.class,0);
		}
		public StringValueContext stringValue() {
			return getRuleContext(StringValueContext.class,0);
		}
		public NumberValueContext numberValue() {
			return getRuleContext(NumberValueContext.class,0);
		}
		public DoubleValueContext doubleValue() {
			return getRuleContext(DoubleValueContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public SetOrListValueContext setOrListValue() {
			return getRuleContext(SetOrListValueContext.class,0);
		}
		public MapValueContext mapValue() {
			return getRuleContext(MapValueContext.class,0);
		}
		public ResponseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_response; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ThriftListener ) ((ThriftListener)listener).enterResponse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ThriftListener ) ((ThriftListener)listener).exitResponse(this);
		}
	}

	public final ResponseContext response() throws RecognitionException {
		ResponseContext _localctx = new ResponseContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_response);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BoolType:
				{
				setState(72);
				boolType();
				}
				break;
			case ByteType:
				{
				setState(73);
				byteType();
				}
				break;
			case I8Type:
				{
				setState(74);
				i8Type();
				}
				break;
			case I16Type:
				{
				setState(75);
				i16Type();
				}
				break;
			case I32Type:
				{
				setState(76);
				i32Type();
				}
				break;
			case I64Type:
				{
				setState(77);
				i64Type();
				}
				break;
			case EnumType:
				{
				setState(78);
				enumType();
				}
				break;
			case DoubleType:
				{
				setState(79);
				doubleType();
				}
				break;
			case StringType:
				{
				setState(80);
				stringType();
				}
				break;
			case BinaryType:
				{
				setState(81);
				binaryType();
				}
				break;
			case BodyType:
				{
				setState(82);
				bodyType();
				}
				break;
			case T__8:
				{
				setState(83);
				mapType();
				}
				break;
			case T__10:
				{
				setState(84);
				listType();
				}
				break;
			case T__9:
				{
				setState(85);
				setType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(88);
			match(T__0);
			setState(97);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(89);
				boolValue();
				}
				break;
			case 2:
				{
				setState(90);
				charValue();
				}
				break;
			case 3:
				{
				setState(91);
				stringValue();
				}
				break;
			case 4:
				{
				setState(92);
				numberValue();
				}
				break;
			case 5:
				{
				setState(93);
				doubleValue();
				}
				break;
			case 6:
				{
				setState(94);
				body();
				}
				break;
			case 7:
				{
				setState(95);
				setOrListValue();
				}
				break;
			case 8:
				{
				setState(96);
				mapValue();
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

	public static class BodyContext extends ParserRuleContext {
		public List<BasicElementContext> basicElement() {
			return getRuleContexts(BasicElementContext.class);
		}
		public BasicElementContext basicElement(int i) {
			return getRuleContext(BasicElementContext.class,i);
		}
		public List<MapElementContext> mapElement() {
			return getRuleContexts(MapElementContext.class);
		}
		public MapElementContext mapElement(int i) {
			return getRuleContext(MapElementContext.class,i);
		}
		public List<SetElementContext> setElement() {
			return getRuleContexts(SetElementContext.class);
		}
		public SetElementContext setElement(int i) {
			return getRuleContext(SetElementContext.class,i);
		}
		public List<ListElementContext> listElement() {
			return getRuleContexts(ListElementContext.class);
		}
		public ListElementContext listElement(int i) {
			return getRuleContext(ListElementContext.class,i);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ThriftListener ) ((ThriftListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ThriftListener ) ((ThriftListener)listener).exitBody(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			match(T__1);
			setState(104);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(100);
				basicElement();
				}
				break;
			case 2:
				{
				setState(101);
				mapElement();
				}
				break;
			case 3:
				{
				setState(102);
				setElement();
				}
				break;
			case 4:
				{
				setState(103);
				listElement();
				}
				break;
			}
			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(106);
				match(T__2);
				setState(111);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(107);
					basicElement();
					}
					break;
				case 2:
					{
					setState(108);
					mapElement();
					}
					break;
				case 3:
					{
					setState(109);
					setElement();
					}
					break;
				case 4:
					{
					setState(110);
					listElement();
					}
					break;
				}
				}
				}
				setState(117);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(118);
			match(T__3);
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

	public static class MapElementContext extends ParserRuleContext {
		public MapKeyContext mapKey() {
			return getRuleContext(MapKeyContext.class,0);
		}
		public MapValueContext mapValue() {
			return getRuleContext(MapValueContext.class,0);
		}
		public MapElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mapElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ThriftListener ) ((ThriftListener)listener).enterMapElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ThriftListener ) ((ThriftListener)listener).exitMapElement(this);
		}
	}

	public final MapElementContext mapElement() throws RecognitionException {
		MapElementContext _localctx = new MapElementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_mapElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			mapKey();
			setState(121);
			match(T__0);
			setState(122);
			mapValue();
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

	public static class MapKeyContext extends ParserRuleContext {
		public SeqContext seq() {
			return getRuleContext(SeqContext.class,0);
		}
		public MapTypeContext mapType() {
			return getRuleContext(MapTypeContext.class,0);
		}
		public MapKeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mapKey; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ThriftListener ) ((ThriftListener)listener).enterMapKey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ThriftListener ) ((ThriftListener)listener).exitMapKey(this);
		}
	}

	public final MapKeyContext mapKey() throws RecognitionException {
		MapKeyContext _localctx = new MapKeyContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_mapKey);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			seq();
			setState(125);
			match(T__4);
			setState(126);
			mapType();
			setState(127);
			match(T__5);
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

	public static class SetElementContext extends ParserRuleContext {
		public SetKeyContext setKey() {
			return getRuleContext(SetKeyContext.class,0);
		}
		public SetOrListValueContext setOrListValue() {
			return getRuleContext(SetOrListValueContext.class,0);
		}
		public SetElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ThriftListener ) ((ThriftListener)listener).enterSetElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ThriftListener ) ((ThriftListener)listener).exitSetElement(this);
		}
	}

	public final SetElementContext setElement() throws RecognitionException {
		SetElementContext _localctx = new SetElementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_setElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			setKey();
			setState(130);
			match(T__0);
			setState(131);
			setOrListValue();
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

	public static class SetKeyContext extends ParserRuleContext {
		public SeqContext seq() {
			return getRuleContext(SeqContext.class,0);
		}
		public SetTypeContext setType() {
			return getRuleContext(SetTypeContext.class,0);
		}
		public SetKeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setKey; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ThriftListener ) ((ThriftListener)listener).enterSetKey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ThriftListener ) ((ThriftListener)listener).exitSetKey(this);
		}
	}

	public final SetKeyContext setKey() throws RecognitionException {
		SetKeyContext _localctx = new SetKeyContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_setKey);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			seq();
			setState(134);
			match(T__4);
			setState(135);
			setType();
			setState(136);
			match(T__5);
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

	public static class ListElementContext extends ParserRuleContext {
		public ListKeyContext listKey() {
			return getRuleContext(ListKeyContext.class,0);
		}
		public SetOrListValueContext setOrListValue() {
			return getRuleContext(SetOrListValueContext.class,0);
		}
		public ListElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ThriftListener ) ((ThriftListener)listener).enterListElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ThriftListener ) ((ThriftListener)listener).exitListElement(this);
		}
	}

	public final ListElementContext listElement() throws RecognitionException {
		ListElementContext _localctx = new ListElementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_listElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			listKey();
			setState(139);
			match(T__0);
			setState(140);
			setOrListValue();
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

	public static class ListKeyContext extends ParserRuleContext {
		public SeqContext seq() {
			return getRuleContext(SeqContext.class,0);
		}
		public ListTypeContext listType() {
			return getRuleContext(ListTypeContext.class,0);
		}
		public ListKeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listKey; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ThriftListener ) ((ThriftListener)listener).enterListKey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ThriftListener ) ((ThriftListener)listener).exitListKey(this);
		}
	}

	public final ListKeyContext listKey() throws RecognitionException {
		ListKeyContext _localctx = new ListKeyContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_listKey);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			seq();
			setState(143);
			match(T__4);
			setState(144);
			listType();
			setState(145);
			match(T__5);
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

	public static class BasicElementContext extends ParserRuleContext {
		public BasicKeyContext basicKey() {
			return getRuleContext(BasicKeyContext.class,0);
		}
		public BasicValueContext basicValue() {
			return getRuleContext(BasicValueContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public BasicElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basicElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ThriftListener ) ((ThriftListener)listener).enterBasicElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ThriftListener ) ((ThriftListener)listener).exitBasicElement(this);
		}
	}

	public final BasicElementContext basicElement() throws RecognitionException {
		BasicElementContext _localctx = new BasicElementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_basicElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			basicKey();
			setState(148);
			match(T__0);
			setState(151);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case StringValue:
			case CharValue:
			case BoolValue:
			case NumberValue:
			case DoubleValue:
				{
				setState(149);
				basicValue();
				}
				break;
			case T__1:
				{
				setState(150);
				body();
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

	public static class BasicKeyContext extends ParserRuleContext {
		public SeqContext seq() {
			return getRuleContext(SeqContext.class,0);
		}
		public BasicTypeContext basicType() {
			return getRuleContext(BasicTypeContext.class,0);
		}
		public BasicKeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basicKey; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ThriftListener ) ((ThriftListener)listener).enterBasicKey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ThriftListener ) ((ThriftListener)listener).exitBasicKey(this);
		}
	}

	public final BasicKeyContext basicKey() throws RecognitionException {
		BasicKeyContext _localctx = new BasicKeyContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_basicKey);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			seq();
			setState(155);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(154);
				basicType();
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

	public static class BasicTypeContext extends ParserRuleContext {
		public BoolTypeContext boolType() {
			return getRuleContext(BoolTypeContext.class,0);
		}
		public ByteTypeContext byteType() {
			return getRuleContext(ByteTypeContext.class,0);
		}
		public I8TypeContext i8Type() {
			return getRuleContext(I8TypeContext.class,0);
		}
		public I16TypeContext i16Type() {
			return getRuleContext(I16TypeContext.class,0);
		}
		public I32TypeContext i32Type() {
			return getRuleContext(I32TypeContext.class,0);
		}
		public I64TypeContext i64Type() {
			return getRuleContext(I64TypeContext.class,0);
		}
		public EnumTypeContext enumType() {
			return getRuleContext(EnumTypeContext.class,0);
		}
		public DoubleTypeContext doubleType() {
			return getRuleContext(DoubleTypeContext.class,0);
		}
		public StringTypeContext stringType() {
			return getRuleContext(StringTypeContext.class,0);
		}
		public BinaryTypeContext binaryType() {
			return getRuleContext(BinaryTypeContext.class,0);
		}
		public BodyTypeContext bodyType() {
			return getRuleContext(BodyTypeContext.class,0);
		}
		public BasicTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basicType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ThriftListener ) ((ThriftListener)listener).enterBasicType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ThriftListener ) ((ThriftListener)listener).exitBasicType(this);
		}
	}

	public final BasicTypeContext basicType() throws RecognitionException {
		BasicTypeContext _localctx = new BasicTypeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_basicType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			match(T__4);
			setState(169);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BoolType:
				{
				setState(158);
				boolType();
				}
				break;
			case ByteType:
				{
				setState(159);
				byteType();
				}
				break;
			case I8Type:
				{
				setState(160);
				i8Type();
				}
				break;
			case I16Type:
				{
				setState(161);
				i16Type();
				}
				break;
			case I32Type:
				{
				setState(162);
				i32Type();
				}
				break;
			case I64Type:
				{
				setState(163);
				i64Type();
				}
				break;
			case EnumType:
				{
				setState(164);
				enumType();
				}
				break;
			case DoubleType:
				{
				setState(165);
				doubleType();
				}
				break;
			case StringType:
				{
				setState(166);
				stringType();
				}
				break;
			case BinaryType:
				{
				setState(167);
				binaryType();
				}
				break;
			case BodyType:
				{
				setState(168);
				bodyType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(171);
			match(T__5);
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

	public static class BasicValueContext extends ParserRuleContext {
		public BoolValueContext boolValue() {
			return getRuleContext(BoolValueContext.class,0);
		}
		public CharValueContext charValue() {
			return getRuleContext(CharValueContext.class,0);
		}
		public StringValueContext stringValue() {
			return getRuleContext(StringValueContext.class,0);
		}
		public NumberValueContext numberValue() {
			return getRuleContext(NumberValueContext.class,0);
		}
		public DoubleValueContext doubleValue() {
			return getRuleContext(DoubleValueContext.class,0);
		}
		public BasicValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basicValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ThriftListener ) ((ThriftListener)listener).enterBasicValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ThriftListener ) ((ThriftListener)listener).exitBasicValue(this);
		}
	}

	public final BasicValueContext basicValue() throws RecognitionException {
		BasicValueContext _localctx = new BasicValueContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_basicValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BoolValue:
				{
				setState(173);
				boolValue();
				}
				break;
			case CharValue:
				{
				setState(174);
				charValue();
				}
				break;
			case StringValue:
				{
				setState(175);
				stringValue();
				}
				break;
			case NumberValue:
				{
				setState(176);
				numberValue();
				}
				break;
			case DoubleValue:
				{
				setState(177);
				doubleValue();
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

	public static class CharValueContext extends ParserRuleContext {
		public TerminalNode CharValue() { return getToken(ThriftParser.CharValue, 0); }
		public CharValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_charValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ThriftListener ) ((ThriftListener)listener).enterCharValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ThriftListener ) ((ThriftListener)listener).exitCharValue(this);
		}
	}

	public final CharValueContext charValue() throws RecognitionException {
		CharValueContext _localctx = new CharValueContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_charValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			match(CharValue);
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

	public static class StringValueContext extends ParserRuleContext {
		public TerminalNode StringValue() { return getToken(ThriftParser.StringValue, 0); }
		public StringValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ThriftListener ) ((ThriftListener)listener).enterStringValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ThriftListener ) ((ThriftListener)listener).exitStringValue(this);
		}
	}

	public final StringValueContext stringValue() throws RecognitionException {
		StringValueContext _localctx = new StringValueContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_stringValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			match(StringValue);
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

	public static class BoolValueContext extends ParserRuleContext {
		public TerminalNode BoolValue() { return getToken(ThriftParser.BoolValue, 0); }
		public BoolValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ThriftListener ) ((ThriftListener)listener).enterBoolValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ThriftListener ) ((ThriftListener)listener).exitBoolValue(this);
		}
	}

	public final BoolValueContext boolValue() throws RecognitionException {
		BoolValueContext _localctx = new BoolValueContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_boolValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			match(BoolValue);
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

	public static class NumberValueContext extends ParserRuleContext {
		public TerminalNode NumberValue() { return getToken(ThriftParser.NumberValue, 0); }
		public NumberValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numberValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ThriftListener ) ((ThriftListener)listener).enterNumberValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ThriftListener ) ((ThriftListener)listener).exitNumberValue(this);
		}
	}

	public final NumberValueContext numberValue() throws RecognitionException {
		NumberValueContext _localctx = new NumberValueContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_numberValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			match(NumberValue);
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

	public static class DoubleValueContext extends ParserRuleContext {
		public TerminalNode DoubleValue() { return getToken(ThriftParser.DoubleValue, 0); }
		public DoubleValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doubleValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ThriftListener ) ((ThriftListener)listener).enterDoubleValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ThriftListener ) ((ThriftListener)listener).exitDoubleValue(this);
		}
	}

	public final DoubleValueContext doubleValue() throws RecognitionException {
		DoubleValueContext _localctx = new DoubleValueContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_doubleValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			match(DoubleValue);
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

	public static class MapValueContext extends ParserRuleContext {
		public List<MapValueElementContext> mapValueElement() {
			return getRuleContexts(MapValueElementContext.class);
		}
		public MapValueElementContext mapValueElement(int i) {
			return getRuleContext(MapValueElementContext.class,i);
		}
		public MapValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mapValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ThriftListener ) ((ThriftListener)listener).enterMapValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ThriftListener ) ((ThriftListener)listener).exitMapValue(this);
		}
	}

	public final MapValueContext mapValue() throws RecognitionException {
		MapValueContext _localctx = new MapValueContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_mapValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			match(T__1);
			{
			setState(191);
			mapValueElement();
			}
			setState(196);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(192);
				match(T__2);
				{
				setState(193);
				mapValueElement();
				}
				}
				}
				setState(198);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(199);
			match(T__3);
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

	public static class MapValueElementContext extends ParserRuleContext {
		public ContainerValueContext containerValue() {
			return getRuleContext(ContainerValueContext.class,0);
		}
		public StringValueContext stringValue() {
			return getRuleContext(StringValueContext.class,0);
		}
		public CharValueContext charValue() {
			return getRuleContext(CharValueContext.class,0);
		}
		public BoolValueContext boolValue() {
			return getRuleContext(BoolValueContext.class,0);
		}
		public NumberValueContext numberValue() {
			return getRuleContext(NumberValueContext.class,0);
		}
		public DoubleValueContext doubleValue() {
			return getRuleContext(DoubleValueContext.class,0);
		}
		public MapValueElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mapValueElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ThriftListener ) ((ThriftListener)listener).enterMapValueElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ThriftListener ) ((ThriftListener)listener).exitMapValueElement(this);
		}
	}

	public final MapValueElementContext mapValueElement() throws RecognitionException {
		MapValueElementContext _localctx = new MapValueElementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_mapValueElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case StringValue:
				{
				setState(201);
				stringValue();
				}
				break;
			case CharValue:
				{
				setState(202);
				charValue();
				}
				break;
			case BoolValue:
				{
				setState(203);
				boolValue();
				}
				break;
			case NumberValue:
				{
				setState(204);
				numberValue();
				}
				break;
			case DoubleValue:
				{
				setState(205);
				doubleValue();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(208);
			match(T__0);
			setState(209);
			containerValue();
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

	public static class SetOrListValueContext extends ParserRuleContext {
		public List<ContainerValueContext> containerValue() {
			return getRuleContexts(ContainerValueContext.class);
		}
		public ContainerValueContext containerValue(int i) {
			return getRuleContext(ContainerValueContext.class,i);
		}
		public SetOrListValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setOrListValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ThriftListener ) ((ThriftListener)listener).enterSetOrListValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ThriftListener ) ((ThriftListener)listener).exitSetOrListValue(this);
		}
	}

	public final SetOrListValueContext setOrListValue() throws RecognitionException {
		SetOrListValueContext _localctx = new SetOrListValueContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_setOrListValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			match(T__6);
			{
			setState(212);
			containerValue();
			}
			setState(217);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(213);
				match(T__2);
				{
				setState(214);
				containerValue();
				}
				}
				}
				setState(219);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(220);
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

	public static class ContainerValueContext extends ParserRuleContext {
		public StringValueContext stringValue() {
			return getRuleContext(StringValueContext.class,0);
		}
		public CharValueContext charValue() {
			return getRuleContext(CharValueContext.class,0);
		}
		public BoolValueContext boolValue() {
			return getRuleContext(BoolValueContext.class,0);
		}
		public NumberValueContext numberValue() {
			return getRuleContext(NumberValueContext.class,0);
		}
		public DoubleValueContext doubleValue() {
			return getRuleContext(DoubleValueContext.class,0);
		}
		public MapValueContext mapValue() {
			return getRuleContext(MapValueContext.class,0);
		}
		public SetOrListValueContext setOrListValue() {
			return getRuleContext(SetOrListValueContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public ContainerValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_containerValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ThriftListener ) ((ThriftListener)listener).enterContainerValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ThriftListener ) ((ThriftListener)listener).exitContainerValue(this);
		}
	}

	public final ContainerValueContext containerValue() throws RecognitionException {
		ContainerValueContext _localctx = new ContainerValueContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_containerValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(222);
				stringValue();
				}
				break;
			case 2:
				{
				setState(223);
				charValue();
				}
				break;
			case 3:
				{
				setState(224);
				boolValue();
				}
				break;
			case 4:
				{
				setState(225);
				numberValue();
				}
				break;
			case 5:
				{
				setState(226);
				doubleValue();
				}
				break;
			case 6:
				{
				setState(227);
				mapValue();
				}
				break;
			case 7:
				{
				setState(228);
				setOrListValue();
				}
				break;
			case 8:
				{
				setState(229);
				body();
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

	public static class SeqContext extends ParserRuleContext {
		public TerminalNode NumberValue() { return getToken(ThriftParser.NumberValue, 0); }
		public SeqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_seq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ThriftListener ) ((ThriftListener)listener).enterSeq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ThriftListener ) ((ThriftListener)listener).exitSeq(this);
		}
	}

	public final SeqContext seq() throws RecognitionException {
		SeqContext _localctx = new SeqContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_seq);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			match(NumberValue);
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

	public static class BoolTypeContext extends ParserRuleContext {
		public TerminalNode BoolType() { return getToken(ThriftParser.BoolType, 0); }
		public BoolTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ThriftListener ) ((ThriftListener)listener).enterBoolType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ThriftListener ) ((ThriftListener)listener).exitBoolType(this);
		}
	}

	public final BoolTypeContext boolType() throws RecognitionException {
		BoolTypeContext _localctx = new BoolTypeContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_boolType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			match(BoolType);
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

	public static class ByteTypeContext extends ParserRuleContext {
		public TerminalNode ByteType() { return getToken(ThriftParser.ByteType, 0); }
		public ByteTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_byteType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ThriftListener ) ((ThriftListener)listener).enterByteType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ThriftListener ) ((ThriftListener)listener).exitByteType(this);
		}
	}

	public final ByteTypeContext byteType() throws RecognitionException {
		ByteTypeContext _localctx = new ByteTypeContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_byteType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			match(ByteType);
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

	public static class I8TypeContext extends ParserRuleContext {
		public TerminalNode I8Type() { return getToken(ThriftParser.I8Type, 0); }
		public I8TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_i8Type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ThriftListener ) ((ThriftListener)listener).enterI8Type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ThriftListener ) ((ThriftListener)listener).exitI8Type(this);
		}
	}

	public final I8TypeContext i8Type() throws RecognitionException {
		I8TypeContext _localctx = new I8TypeContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_i8Type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			match(I8Type);
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

	public static class I16TypeContext extends ParserRuleContext {
		public TerminalNode I16Type() { return getToken(ThriftParser.I16Type, 0); }
		public I16TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_i16Type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ThriftListener ) ((ThriftListener)listener).enterI16Type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ThriftListener ) ((ThriftListener)listener).exitI16Type(this);
		}
	}

	public final I16TypeContext i16Type() throws RecognitionException {
		I16TypeContext _localctx = new I16TypeContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_i16Type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			match(I16Type);
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

	public static class I32TypeContext extends ParserRuleContext {
		public TerminalNode I32Type() { return getToken(ThriftParser.I32Type, 0); }
		public I32TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_i32Type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ThriftListener ) ((ThriftListener)listener).enterI32Type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ThriftListener ) ((ThriftListener)listener).exitI32Type(this);
		}
	}

	public final I32TypeContext i32Type() throws RecognitionException {
		I32TypeContext _localctx = new I32TypeContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_i32Type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			match(I32Type);
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

	public static class I64TypeContext extends ParserRuleContext {
		public TerminalNode I64Type() { return getToken(ThriftParser.I64Type, 0); }
		public I64TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_i64Type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ThriftListener ) ((ThriftListener)listener).enterI64Type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ThriftListener ) ((ThriftListener)listener).exitI64Type(this);
		}
	}

	public final I64TypeContext i64Type() throws RecognitionException {
		I64TypeContext _localctx = new I64TypeContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_i64Type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			match(I64Type);
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

	public static class EnumTypeContext extends ParserRuleContext {
		public TerminalNode EnumType() { return getToken(ThriftParser.EnumType, 0); }
		public EnumTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ThriftListener ) ((ThriftListener)listener).enterEnumType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ThriftListener ) ((ThriftListener)listener).exitEnumType(this);
		}
	}

	public final EnumTypeContext enumType() throws RecognitionException {
		EnumTypeContext _localctx = new EnumTypeContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_enumType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			match(EnumType);
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

	public static class DoubleTypeContext extends ParserRuleContext {
		public TerminalNode DoubleType() { return getToken(ThriftParser.DoubleType, 0); }
		public DoubleTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doubleType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ThriftListener ) ((ThriftListener)listener).enterDoubleType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ThriftListener ) ((ThriftListener)listener).exitDoubleType(this);
		}
	}

	public final DoubleTypeContext doubleType() throws RecognitionException {
		DoubleTypeContext _localctx = new DoubleTypeContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_doubleType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			match(DoubleType);
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

	public static class StringTypeContext extends ParserRuleContext {
		public TerminalNode StringType() { return getToken(ThriftParser.StringType, 0); }
		public StringTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ThriftListener ) ((ThriftListener)listener).enterStringType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ThriftListener ) ((ThriftListener)listener).exitStringType(this);
		}
	}

	public final StringTypeContext stringType() throws RecognitionException {
		StringTypeContext _localctx = new StringTypeContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_stringType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			match(StringType);
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

	public static class BinaryTypeContext extends ParserRuleContext {
		public TerminalNode BinaryType() { return getToken(ThriftParser.BinaryType, 0); }
		public BinaryTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binaryType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ThriftListener ) ((ThriftListener)listener).enterBinaryType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ThriftListener ) ((ThriftListener)listener).exitBinaryType(this);
		}
	}

	public final BinaryTypeContext binaryType() throws RecognitionException {
		BinaryTypeContext _localctx = new BinaryTypeContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_binaryType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			match(BinaryType);
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

	public static class BodyTypeContext extends ParserRuleContext {
		public TerminalNode BodyType() { return getToken(ThriftParser.BodyType, 0); }
		public BodyTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bodyType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ThriftListener ) ((ThriftListener)listener).enterBodyType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ThriftListener ) ((ThriftListener)listener).exitBodyType(this);
		}
	}

	public final BodyTypeContext bodyType() throws RecognitionException {
		BodyTypeContext _localctx = new BodyTypeContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_bodyType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			match(BodyType);
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

	public static class MapTypeContext extends ParserRuleContext {
		public List<BoolTypeContext> boolType() {
			return getRuleContexts(BoolTypeContext.class);
		}
		public BoolTypeContext boolType(int i) {
			return getRuleContext(BoolTypeContext.class,i);
		}
		public List<ByteTypeContext> byteType() {
			return getRuleContexts(ByteTypeContext.class);
		}
		public ByteTypeContext byteType(int i) {
			return getRuleContext(ByteTypeContext.class,i);
		}
		public List<I8TypeContext> i8Type() {
			return getRuleContexts(I8TypeContext.class);
		}
		public I8TypeContext i8Type(int i) {
			return getRuleContext(I8TypeContext.class,i);
		}
		public List<I16TypeContext> i16Type() {
			return getRuleContexts(I16TypeContext.class);
		}
		public I16TypeContext i16Type(int i) {
			return getRuleContext(I16TypeContext.class,i);
		}
		public List<I32TypeContext> i32Type() {
			return getRuleContexts(I32TypeContext.class);
		}
		public I32TypeContext i32Type(int i) {
			return getRuleContext(I32TypeContext.class,i);
		}
		public List<I64TypeContext> i64Type() {
			return getRuleContexts(I64TypeContext.class);
		}
		public I64TypeContext i64Type(int i) {
			return getRuleContext(I64TypeContext.class,i);
		}
		public List<DoubleTypeContext> doubleType() {
			return getRuleContexts(DoubleTypeContext.class);
		}
		public DoubleTypeContext doubleType(int i) {
			return getRuleContext(DoubleTypeContext.class,i);
		}
		public List<EnumTypeContext> enumType() {
			return getRuleContexts(EnumTypeContext.class);
		}
		public EnumTypeContext enumType(int i) {
			return getRuleContext(EnumTypeContext.class,i);
		}
		public List<StringTypeContext> stringType() {
			return getRuleContexts(StringTypeContext.class);
		}
		public StringTypeContext stringType(int i) {
			return getRuleContext(StringTypeContext.class,i);
		}
		public List<BinaryTypeContext> binaryType() {
			return getRuleContexts(BinaryTypeContext.class);
		}
		public BinaryTypeContext binaryType(int i) {
			return getRuleContext(BinaryTypeContext.class,i);
		}
		public ListTypeContext listType() {
			return getRuleContext(ListTypeContext.class,0);
		}
		public SetTypeContext setType() {
			return getRuleContext(SetTypeContext.class,0);
		}
		public MapTypeContext mapType() {
			return getRuleContext(MapTypeContext.class,0);
		}
		public BodyTypeContext bodyType() {
			return getRuleContext(BodyTypeContext.class,0);
		}
		public MapTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mapType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ThriftListener ) ((ThriftListener)listener).enterMapType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ThriftListener ) ((ThriftListener)listener).exitMapType(this);
		}
	}

	public final MapTypeContext mapType() throws RecognitionException {
		MapTypeContext _localctx = new MapTypeContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_mapType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			match(T__8);
			setState(257);
			match(T__4);
			setState(268);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BoolType:
				{
				setState(258);
				boolType();
				}
				break;
			case ByteType:
				{
				setState(259);
				byteType();
				}
				break;
			case I8Type:
				{
				setState(260);
				i8Type();
				}
				break;
			case I16Type:
				{
				setState(261);
				i16Type();
				}
				break;
			case I32Type:
				{
				setState(262);
				i32Type();
				}
				break;
			case I64Type:
				{
				setState(263);
				i64Type();
				}
				break;
			case DoubleType:
				{
				setState(264);
				doubleType();
				}
				break;
			case EnumType:
				{
				setState(265);
				enumType();
				}
				break;
			case StringType:
				{
				setState(266);
				stringType();
				}
				break;
			case BinaryType:
				{
				setState(267);
				binaryType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(270);
			match(T__2);
			setState(285);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BoolType:
				{
				setState(271);
				boolType();
				}
				break;
			case ByteType:
				{
				setState(272);
				byteType();
				}
				break;
			case I8Type:
				{
				setState(273);
				i8Type();
				}
				break;
			case I16Type:
				{
				setState(274);
				i16Type();
				}
				break;
			case I32Type:
				{
				setState(275);
				i32Type();
				}
				break;
			case I64Type:
				{
				setState(276);
				i64Type();
				}
				break;
			case DoubleType:
				{
				setState(277);
				doubleType();
				}
				break;
			case EnumType:
				{
				setState(278);
				enumType();
				}
				break;
			case StringType:
				{
				setState(279);
				stringType();
				}
				break;
			case BinaryType:
				{
				setState(280);
				binaryType();
				}
				break;
			case T__10:
				{
				setState(281);
				listType();
				}
				break;
			case T__9:
				{
				setState(282);
				setType();
				}
				break;
			case T__8:
				{
				setState(283);
				mapType();
				}
				break;
			case BodyType:
				{
				setState(284);
				bodyType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(287);
			match(T__5);
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

	public static class SetTypeContext extends ParserRuleContext {
		public BoolTypeContext boolType() {
			return getRuleContext(BoolTypeContext.class,0);
		}
		public ByteTypeContext byteType() {
			return getRuleContext(ByteTypeContext.class,0);
		}
		public I8TypeContext i8Type() {
			return getRuleContext(I8TypeContext.class,0);
		}
		public I16TypeContext i16Type() {
			return getRuleContext(I16TypeContext.class,0);
		}
		public I32TypeContext i32Type() {
			return getRuleContext(I32TypeContext.class,0);
		}
		public I64TypeContext i64Type() {
			return getRuleContext(I64TypeContext.class,0);
		}
		public DoubleTypeContext doubleType() {
			return getRuleContext(DoubleTypeContext.class,0);
		}
		public EnumTypeContext enumType() {
			return getRuleContext(EnumTypeContext.class,0);
		}
		public StringTypeContext stringType() {
			return getRuleContext(StringTypeContext.class,0);
		}
		public BinaryTypeContext binaryType() {
			return getRuleContext(BinaryTypeContext.class,0);
		}
		public ListTypeContext listType() {
			return getRuleContext(ListTypeContext.class,0);
		}
		public SetTypeContext setType() {
			return getRuleContext(SetTypeContext.class,0);
		}
		public MapTypeContext mapType() {
			return getRuleContext(MapTypeContext.class,0);
		}
		public BodyTypeContext bodyType() {
			return getRuleContext(BodyTypeContext.class,0);
		}
		public SetTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ThriftListener ) ((ThriftListener)listener).enterSetType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ThriftListener ) ((ThriftListener)listener).exitSetType(this);
		}
	}

	public final SetTypeContext setType() throws RecognitionException {
		SetTypeContext _localctx = new SetTypeContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_setType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			match(T__9);
			setState(290);
			match(T__4);
			setState(305);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BoolType:
				{
				setState(291);
				boolType();
				}
				break;
			case ByteType:
				{
				setState(292);
				byteType();
				}
				break;
			case I8Type:
				{
				setState(293);
				i8Type();
				}
				break;
			case I16Type:
				{
				setState(294);
				i16Type();
				}
				break;
			case I32Type:
				{
				setState(295);
				i32Type();
				}
				break;
			case I64Type:
				{
				setState(296);
				i64Type();
				}
				break;
			case DoubleType:
				{
				setState(297);
				doubleType();
				}
				break;
			case EnumType:
				{
				setState(298);
				enumType();
				}
				break;
			case StringType:
				{
				setState(299);
				stringType();
				}
				break;
			case BinaryType:
				{
				setState(300);
				binaryType();
				}
				break;
			case T__10:
				{
				setState(301);
				listType();
				}
				break;
			case T__9:
				{
				setState(302);
				setType();
				}
				break;
			case T__8:
				{
				setState(303);
				mapType();
				}
				break;
			case BodyType:
				{
				setState(304);
				bodyType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(307);
			match(T__5);
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

	public static class ListTypeContext extends ParserRuleContext {
		public BoolTypeContext boolType() {
			return getRuleContext(BoolTypeContext.class,0);
		}
		public ByteTypeContext byteType() {
			return getRuleContext(ByteTypeContext.class,0);
		}
		public I8TypeContext i8Type() {
			return getRuleContext(I8TypeContext.class,0);
		}
		public I16TypeContext i16Type() {
			return getRuleContext(I16TypeContext.class,0);
		}
		public I32TypeContext i32Type() {
			return getRuleContext(I32TypeContext.class,0);
		}
		public I64TypeContext i64Type() {
			return getRuleContext(I64TypeContext.class,0);
		}
		public DoubleTypeContext doubleType() {
			return getRuleContext(DoubleTypeContext.class,0);
		}
		public EnumTypeContext enumType() {
			return getRuleContext(EnumTypeContext.class,0);
		}
		public StringTypeContext stringType() {
			return getRuleContext(StringTypeContext.class,0);
		}
		public BinaryTypeContext binaryType() {
			return getRuleContext(BinaryTypeContext.class,0);
		}
		public ListTypeContext listType() {
			return getRuleContext(ListTypeContext.class,0);
		}
		public SetTypeContext setType() {
			return getRuleContext(SetTypeContext.class,0);
		}
		public MapTypeContext mapType() {
			return getRuleContext(MapTypeContext.class,0);
		}
		public BodyTypeContext bodyType() {
			return getRuleContext(BodyTypeContext.class,0);
		}
		public ListTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ThriftListener ) ((ThriftListener)listener).enterListType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ThriftListener ) ((ThriftListener)listener).exitListType(this);
		}
	}

	public final ListTypeContext listType() throws RecognitionException {
		ListTypeContext _localctx = new ListTypeContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_listType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			match(T__10);
			setState(310);
			match(T__4);
			setState(325);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BoolType:
				{
				setState(311);
				boolType();
				}
				break;
			case ByteType:
				{
				setState(312);
				byteType();
				}
				break;
			case I8Type:
				{
				setState(313);
				i8Type();
				}
				break;
			case I16Type:
				{
				setState(314);
				i16Type();
				}
				break;
			case I32Type:
				{
				setState(315);
				i32Type();
				}
				break;
			case I64Type:
				{
				setState(316);
				i64Type();
				}
				break;
			case DoubleType:
				{
				setState(317);
				doubleType();
				}
				break;
			case EnumType:
				{
				setState(318);
				enumType();
				}
				break;
			case StringType:
				{
				setState(319);
				stringType();
				}
				break;
			case BinaryType:
				{
				setState(320);
				binaryType();
				}
				break;
			case T__10:
				{
				setState(321);
				listType();
				}
				break;
			case T__9:
				{
				setState(322);
				setType();
				}
				break;
			case T__8:
				{
				setState(323);
				mapType();
				}
				break;
			case BodyType:
				{
				setState(324);
				bodyType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(327);
			match(T__5);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\36\u014c\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\5\2Y\n\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2d\n\2"+
		"\3\3\3\3\3\3\3\3\3\3\5\3k\n\3\3\3\3\3\3\3\3\3\3\3\5\3r\n\3\7\3t\n\3\f"+
		"\3\16\3w\13\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6"+
		"\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3"+
		"\n\3\n\5\n\u009a\n\n\3\13\3\13\5\13\u009e\n\13\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00ac\n\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\5\r"+
		"\u00b5\n\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23"+
		"\3\23\3\23\7\23\u00c5\n\23\f\23\16\23\u00c8\13\23\3\23\3\23\3\24\3\24"+
		"\3\24\3\24\3\24\5\24\u00d1\n\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\7\25"+
		"\u00da\n\25\f\25\16\25\u00dd\13\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\5\26\u00e9\n\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32"+
		"\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\""+
		"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\5#\u010f\n#\3#\3#\3#\3#\3#\3#\3#"+
		"\3#\3#\3#\3#\3#\3#\3#\3#\5#\u0120\n#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$\3$"+
		"\3$\3$\3$\3$\3$\3$\3$\5$\u0134\n$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%"+
		"\3%\3%\3%\3%\3%\3%\5%\u0148\n%\3%\3%\3%\2\2&\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFH\2\2\2\u018f\2X\3\2\2\2\4e\3"+
		"\2\2\2\6z\3\2\2\2\b~\3\2\2\2\n\u0083\3\2\2\2\f\u0087\3\2\2\2\16\u008c"+
		"\3\2\2\2\20\u0090\3\2\2\2\22\u0095\3\2\2\2\24\u009b\3\2\2\2\26\u009f\3"+
		"\2\2\2\30\u00b4\3\2\2\2\32\u00b6\3\2\2\2\34\u00b8\3\2\2\2\36\u00ba\3\2"+
		"\2\2 \u00bc\3\2\2\2\"\u00be\3\2\2\2$\u00c0\3\2\2\2&\u00d0\3\2\2\2(\u00d5"+
		"\3\2\2\2*\u00e8\3\2\2\2,\u00ea\3\2\2\2.\u00ec\3\2\2\2\60\u00ee\3\2\2\2"+
		"\62\u00f0\3\2\2\2\64\u00f2\3\2\2\2\66\u00f4\3\2\2\28\u00f6\3\2\2\2:\u00f8"+
		"\3\2\2\2<\u00fa\3\2\2\2>\u00fc\3\2\2\2@\u00fe\3\2\2\2B\u0100\3\2\2\2D"+
		"\u0102\3\2\2\2F\u0123\3\2\2\2H\u0137\3\2\2\2JY\5.\30\2KY\5\60\31\2LY\5"+
		"\62\32\2MY\5\64\33\2NY\5\66\34\2OY\58\35\2PY\5:\36\2QY\5<\37\2RY\5> \2"+
		"SY\5@!\2TY\5B\"\2UY\5D#\2VY\5H%\2WY\5F$\2XJ\3\2\2\2XK\3\2\2\2XL\3\2\2"+
		"\2XM\3\2\2\2XN\3\2\2\2XO\3\2\2\2XP\3\2\2\2XQ\3\2\2\2XR\3\2\2\2XS\3\2\2"+
		"\2XT\3\2\2\2XU\3\2\2\2XV\3\2\2\2XW\3\2\2\2YZ\3\2\2\2Zc\7\3\2\2[d\5\36"+
		"\20\2\\d\5\32\16\2]d\5\34\17\2^d\5 \21\2_d\5\"\22\2`d\5\4\3\2ad\5(\25"+
		"\2bd\5$\23\2c[\3\2\2\2c\\\3\2\2\2c]\3\2\2\2c^\3\2\2\2c_\3\2\2\2c`\3\2"+
		"\2\2ca\3\2\2\2cb\3\2\2\2d\3\3\2\2\2ej\7\4\2\2fk\5\22\n\2gk\5\6\4\2hk\5"+
		"\n\6\2ik\5\16\b\2jf\3\2\2\2jg\3\2\2\2jh\3\2\2\2ji\3\2\2\2ku\3\2\2\2lq"+
		"\7\5\2\2mr\5\22\n\2nr\5\6\4\2or\5\n\6\2pr\5\16\b\2qm\3\2\2\2qn\3\2\2\2"+
		"qo\3\2\2\2qp\3\2\2\2rt\3\2\2\2sl\3\2\2\2tw\3\2\2\2us\3\2\2\2uv\3\2\2\2"+
		"vx\3\2\2\2wu\3\2\2\2xy\7\6\2\2y\5\3\2\2\2z{\5\b\5\2{|\7\3\2\2|}\5$\23"+
		"\2}\7\3\2\2\2~\177\5,\27\2\177\u0080\7\7\2\2\u0080\u0081\5D#\2\u0081\u0082"+
		"\7\b\2\2\u0082\t\3\2\2\2\u0083\u0084\5\f\7\2\u0084\u0085\7\3\2\2\u0085"+
		"\u0086\5(\25\2\u0086\13\3\2\2\2\u0087\u0088\5,\27\2\u0088\u0089\7\7\2"+
		"\2\u0089\u008a\5F$\2\u008a\u008b\7\b\2\2\u008b\r\3\2\2\2\u008c\u008d\5"+
		"\20\t\2\u008d\u008e\7\3\2\2\u008e\u008f\5(\25\2\u008f\17\3\2\2\2\u0090"+
		"\u0091\5,\27\2\u0091\u0092\7\7\2\2\u0092\u0093\5H%\2\u0093\u0094\7\b\2"+
		"\2\u0094\21\3\2\2\2\u0095\u0096\5\24\13\2\u0096\u0099\7\3\2\2\u0097\u009a"+
		"\5\30\r\2\u0098\u009a\5\4\3\2\u0099\u0097\3\2\2\2\u0099\u0098\3\2\2\2"+
		"\u009a\23\3\2\2\2\u009b\u009d\5,\27\2\u009c\u009e\5\26\f\2\u009d\u009c"+
		"\3\2\2\2\u009d\u009e\3\2\2\2\u009e\25\3\2\2\2\u009f\u00ab\7\7\2\2\u00a0"+
		"\u00ac\5.\30\2\u00a1\u00ac\5\60\31\2\u00a2\u00ac\5\62\32\2\u00a3\u00ac"+
		"\5\64\33\2\u00a4\u00ac\5\66\34\2\u00a5\u00ac\58\35\2\u00a6\u00ac\5:\36"+
		"\2\u00a7\u00ac\5<\37\2\u00a8\u00ac\5> \2\u00a9\u00ac\5@!\2\u00aa\u00ac"+
		"\5B\"\2\u00ab\u00a0\3\2\2\2\u00ab\u00a1\3\2\2\2\u00ab\u00a2\3\2\2\2\u00ab"+
		"\u00a3\3\2\2\2\u00ab\u00a4\3\2\2\2\u00ab\u00a5\3\2\2\2\u00ab\u00a6\3\2"+
		"\2\2\u00ab\u00a7\3\2\2\2\u00ab\u00a8\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ab"+
		"\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00ae\7\b\2\2\u00ae\27\3\2\2"+
		"\2\u00af\u00b5\5\36\20\2\u00b0\u00b5\5\32\16\2\u00b1\u00b5\5\34\17\2\u00b2"+
		"\u00b5\5 \21\2\u00b3\u00b5\5\"\22\2\u00b4\u00af\3\2\2\2\u00b4\u00b0\3"+
		"\2\2\2\u00b4\u00b1\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b4\u00b3\3\2\2\2\u00b5"+
		"\31\3\2\2\2\u00b6\u00b7\7\31\2\2\u00b7\33\3\2\2\2\u00b8\u00b9\7\30\2\2"+
		"\u00b9\35\3\2\2\2\u00ba\u00bb\7\32\2\2\u00bb\37\3\2\2\2\u00bc\u00bd\7"+
		"\33\2\2\u00bd!\3\2\2\2\u00be\u00bf\7\34\2\2\u00bf#\3\2\2\2\u00c0\u00c1"+
		"\7\4\2\2\u00c1\u00c6\5&\24\2\u00c2\u00c3\7\5\2\2\u00c3\u00c5\5&\24\2\u00c4"+
		"\u00c2\3\2\2\2\u00c5\u00c8\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c6\u00c7\3\2"+
		"\2\2\u00c7\u00c9\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c9\u00ca\7\6\2\2\u00ca"+
		"%\3\2\2\2\u00cb\u00d1\5\34\17\2\u00cc\u00d1\5\32\16\2\u00cd\u00d1\5\36"+
		"\20\2\u00ce\u00d1\5 \21\2\u00cf\u00d1\5\"\22\2\u00d0\u00cb\3\2\2\2\u00d0"+
		"\u00cc\3\2\2\2\u00d0\u00cd\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d0\u00cf\3\2"+
		"\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d3\7\3\2\2\u00d3\u00d4\5*\26\2\u00d4"+
		"\'\3\2\2\2\u00d5\u00d6\7\t\2\2\u00d6\u00db\5*\26\2\u00d7\u00d8\7\5\2\2"+
		"\u00d8\u00da\5*\26\2\u00d9\u00d7\3\2\2\2\u00da\u00dd\3\2\2\2\u00db\u00d9"+
		"\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00de\3\2\2\2\u00dd\u00db\3\2\2\2\u00de"+
		"\u00df\7\n\2\2\u00df)\3\2\2\2\u00e0\u00e9\5\34\17\2\u00e1\u00e9\5\32\16"+
		"\2\u00e2\u00e9\5\36\20\2\u00e3\u00e9\5 \21\2\u00e4\u00e9\5\"\22\2\u00e5"+
		"\u00e9\5$\23\2\u00e6\u00e9\5(\25\2\u00e7\u00e9\5\4\3\2\u00e8\u00e0\3\2"+
		"\2\2\u00e8\u00e1\3\2\2\2\u00e8\u00e2\3\2\2\2\u00e8\u00e3\3\2\2\2\u00e8"+
		"\u00e4\3\2\2\2\u00e8\u00e5\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e8\u00e7\3\2"+
		"\2\2\u00e9+\3\2\2\2\u00ea\u00eb\7\33\2\2\u00eb-\3\2\2\2\u00ec\u00ed\7"+
		"\16\2\2\u00ed/\3\2\2\2\u00ee\u00ef\7\17\2\2\u00ef\61\3\2\2\2\u00f0\u00f1"+
		"\7\20\2\2\u00f1\63\3\2\2\2\u00f2\u00f3\7\21\2\2\u00f3\65\3\2\2\2\u00f4"+
		"\u00f5\7\22\2\2\u00f5\67\3\2\2\2\u00f6\u00f7\7\23\2\2\u00f79\3\2\2\2\u00f8"+
		"\u00f9\7\25\2\2\u00f9;\3\2\2\2\u00fa\u00fb\7\24\2\2\u00fb=\3\2\2\2\u00fc"+
		"\u00fd\7\26\2\2\u00fd?\3\2\2\2\u00fe\u00ff\7\27\2\2\u00ffA\3\2\2\2\u0100"+
		"\u0101\7\35\2\2\u0101C\3\2\2\2\u0102\u0103\7\13\2\2\u0103\u010e\7\7\2"+
		"\2\u0104\u010f\5.\30\2\u0105\u010f\5\60\31\2\u0106\u010f\5\62\32\2\u0107"+
		"\u010f\5\64\33\2\u0108\u010f\5\66\34\2\u0109\u010f\58\35\2\u010a\u010f"+
		"\5<\37\2\u010b\u010f\5:\36\2\u010c\u010f\5> \2\u010d\u010f\5@!\2\u010e"+
		"\u0104\3\2\2\2\u010e\u0105\3\2\2\2\u010e\u0106\3\2\2\2\u010e\u0107\3\2"+
		"\2\2\u010e\u0108\3\2\2\2\u010e\u0109\3\2\2\2\u010e\u010a\3\2\2\2\u010e"+
		"\u010b\3\2\2\2\u010e\u010c\3\2\2\2\u010e\u010d\3\2\2\2\u010f\u0110\3\2"+
		"\2\2\u0110\u011f\7\5\2\2\u0111\u0120\5.\30\2\u0112\u0120\5\60\31\2\u0113"+
		"\u0120\5\62\32\2\u0114\u0120\5\64\33\2\u0115\u0120\5\66\34\2\u0116\u0120"+
		"\58\35\2\u0117\u0120\5<\37\2\u0118\u0120\5:\36\2\u0119\u0120\5> \2\u011a"+
		"\u0120\5@!\2\u011b\u0120\5H%\2\u011c\u0120\5F$\2\u011d\u0120\5D#\2\u011e"+
		"\u0120\5B\"\2\u011f\u0111\3\2\2\2\u011f\u0112\3\2\2\2\u011f\u0113\3\2"+
		"\2\2\u011f\u0114\3\2\2\2\u011f\u0115\3\2\2\2\u011f\u0116\3\2\2\2\u011f"+
		"\u0117\3\2\2\2\u011f\u0118\3\2\2\2\u011f\u0119\3\2\2\2\u011f\u011a\3\2"+
		"\2\2\u011f\u011b\3\2\2\2\u011f\u011c\3\2\2\2\u011f\u011d\3\2\2\2\u011f"+
		"\u011e\3\2\2\2\u0120\u0121\3\2\2\2\u0121\u0122\7\b\2\2\u0122E\3\2\2\2"+
		"\u0123\u0124\7\f\2\2\u0124\u0133\7\7\2\2\u0125\u0134\5.\30\2\u0126\u0134"+
		"\5\60\31\2\u0127\u0134\5\62\32\2\u0128\u0134\5\64\33\2\u0129\u0134\5\66"+
		"\34\2\u012a\u0134\58\35\2\u012b\u0134\5<\37\2\u012c\u0134\5:\36\2\u012d"+
		"\u0134\5> \2\u012e\u0134\5@!\2\u012f\u0134\5H%\2\u0130\u0134\5F$\2\u0131"+
		"\u0134\5D#\2\u0132\u0134\5B\"\2\u0133\u0125\3\2\2\2\u0133\u0126\3\2\2"+
		"\2\u0133\u0127\3\2\2\2\u0133\u0128\3\2\2\2\u0133\u0129\3\2\2\2\u0133\u012a"+
		"\3\2\2\2\u0133\u012b\3\2\2\2\u0133\u012c\3\2\2\2\u0133\u012d\3\2\2\2\u0133"+
		"\u012e\3\2\2\2\u0133\u012f\3\2\2\2\u0133\u0130\3\2\2\2\u0133\u0131\3\2"+
		"\2\2\u0133\u0132\3\2\2\2\u0134\u0135\3\2\2\2\u0135\u0136\7\b\2\2\u0136"+
		"G\3\2\2\2\u0137\u0138\7\r\2\2\u0138\u0147\7\7\2\2\u0139\u0148\5.\30\2"+
		"\u013a\u0148\5\60\31\2\u013b\u0148\5\62\32\2\u013c\u0148\5\64\33\2\u013d"+
		"\u0148\5\66\34\2\u013e\u0148\58\35\2\u013f\u0148\5<\37\2\u0140\u0148\5"+
		":\36\2\u0141\u0148\5> \2\u0142\u0148\5@!\2\u0143\u0148\5H%\2\u0144\u0148"+
		"\5F$\2\u0145\u0148\5D#\2\u0146\u0148\5B\"\2\u0147\u0139\3\2\2\2\u0147"+
		"\u013a\3\2\2\2\u0147\u013b\3\2\2\2\u0147\u013c\3\2\2\2\u0147\u013d\3\2"+
		"\2\2\u0147\u013e\3\2\2\2\u0147\u013f\3\2\2\2\u0147\u0140\3\2\2\2\u0147"+
		"\u0141\3\2\2\2\u0147\u0142\3\2\2\2\u0147\u0143\3\2\2\2\u0147\u0144\3\2"+
		"\2\2\u0147\u0145\3\2\2\2\u0147\u0146\3\2\2\2\u0148\u0149\3\2\2\2\u0149"+
		"\u014a\7\b\2\2\u014aI\3\2\2\2\23Xcjqu\u0099\u009d\u00ab\u00b4\u00c6\u00d0"+
		"\u00db\u00e8\u010e\u011f\u0133\u0147";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}