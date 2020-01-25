// Generated from Thrift.g4 by ANTLR 4.7
 package io.otdd.ddl.thrift.grammar; 
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ThriftParser}.
 */
public interface ThriftListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ThriftParser#response}.
	 * @param ctx the parse tree
	 */
	void enterResponse(ThriftParser.ResponseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ThriftParser#response}.
	 * @param ctx the parse tree
	 */
	void exitResponse(ThriftParser.ResponseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ThriftParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(ThriftParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ThriftParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(ThriftParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ThriftParser#mapElement}.
	 * @param ctx the parse tree
	 */
	void enterMapElement(ThriftParser.MapElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ThriftParser#mapElement}.
	 * @param ctx the parse tree
	 */
	void exitMapElement(ThriftParser.MapElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ThriftParser#mapKey}.
	 * @param ctx the parse tree
	 */
	void enterMapKey(ThriftParser.MapKeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ThriftParser#mapKey}.
	 * @param ctx the parse tree
	 */
	void exitMapKey(ThriftParser.MapKeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ThriftParser#setElement}.
	 * @param ctx the parse tree
	 */
	void enterSetElement(ThriftParser.SetElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ThriftParser#setElement}.
	 * @param ctx the parse tree
	 */
	void exitSetElement(ThriftParser.SetElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ThriftParser#setKey}.
	 * @param ctx the parse tree
	 */
	void enterSetKey(ThriftParser.SetKeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ThriftParser#setKey}.
	 * @param ctx the parse tree
	 */
	void exitSetKey(ThriftParser.SetKeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ThriftParser#listElement}.
	 * @param ctx the parse tree
	 */
	void enterListElement(ThriftParser.ListElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ThriftParser#listElement}.
	 * @param ctx the parse tree
	 */
	void exitListElement(ThriftParser.ListElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ThriftParser#listKey}.
	 * @param ctx the parse tree
	 */
	void enterListKey(ThriftParser.ListKeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ThriftParser#listKey}.
	 * @param ctx the parse tree
	 */
	void exitListKey(ThriftParser.ListKeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ThriftParser#basicElement}.
	 * @param ctx the parse tree
	 */
	void enterBasicElement(ThriftParser.BasicElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ThriftParser#basicElement}.
	 * @param ctx the parse tree
	 */
	void exitBasicElement(ThriftParser.BasicElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ThriftParser#basicKey}.
	 * @param ctx the parse tree
	 */
	void enterBasicKey(ThriftParser.BasicKeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ThriftParser#basicKey}.
	 * @param ctx the parse tree
	 */
	void exitBasicKey(ThriftParser.BasicKeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ThriftParser#basicType}.
	 * @param ctx the parse tree
	 */
	void enterBasicType(ThriftParser.BasicTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ThriftParser#basicType}.
	 * @param ctx the parse tree
	 */
	void exitBasicType(ThriftParser.BasicTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ThriftParser#basicValue}.
	 * @param ctx the parse tree
	 */
	void enterBasicValue(ThriftParser.BasicValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ThriftParser#basicValue}.
	 * @param ctx the parse tree
	 */
	void exitBasicValue(ThriftParser.BasicValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link ThriftParser#charValue}.
	 * @param ctx the parse tree
	 */
	void enterCharValue(ThriftParser.CharValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ThriftParser#charValue}.
	 * @param ctx the parse tree
	 */
	void exitCharValue(ThriftParser.CharValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link ThriftParser#stringValue}.
	 * @param ctx the parse tree
	 */
	void enterStringValue(ThriftParser.StringValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ThriftParser#stringValue}.
	 * @param ctx the parse tree
	 */
	void exitStringValue(ThriftParser.StringValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link ThriftParser#boolValue}.
	 * @param ctx the parse tree
	 */
	void enterBoolValue(ThriftParser.BoolValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ThriftParser#boolValue}.
	 * @param ctx the parse tree
	 */
	void exitBoolValue(ThriftParser.BoolValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link ThriftParser#numberValue}.
	 * @param ctx the parse tree
	 */
	void enterNumberValue(ThriftParser.NumberValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ThriftParser#numberValue}.
	 * @param ctx the parse tree
	 */
	void exitNumberValue(ThriftParser.NumberValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link ThriftParser#doubleValue}.
	 * @param ctx the parse tree
	 */
	void enterDoubleValue(ThriftParser.DoubleValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ThriftParser#doubleValue}.
	 * @param ctx the parse tree
	 */
	void exitDoubleValue(ThriftParser.DoubleValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link ThriftParser#mapValue}.
	 * @param ctx the parse tree
	 */
	void enterMapValue(ThriftParser.MapValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ThriftParser#mapValue}.
	 * @param ctx the parse tree
	 */
	void exitMapValue(ThriftParser.MapValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link ThriftParser#mapValueElement}.
	 * @param ctx the parse tree
	 */
	void enterMapValueElement(ThriftParser.MapValueElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ThriftParser#mapValueElement}.
	 * @param ctx the parse tree
	 */
	void exitMapValueElement(ThriftParser.MapValueElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ThriftParser#setOrListValue}.
	 * @param ctx the parse tree
	 */
	void enterSetOrListValue(ThriftParser.SetOrListValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ThriftParser#setOrListValue}.
	 * @param ctx the parse tree
	 */
	void exitSetOrListValue(ThriftParser.SetOrListValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link ThriftParser#containerValue}.
	 * @param ctx the parse tree
	 */
	void enterContainerValue(ThriftParser.ContainerValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ThriftParser#containerValue}.
	 * @param ctx the parse tree
	 */
	void exitContainerValue(ThriftParser.ContainerValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link ThriftParser#seq}.
	 * @param ctx the parse tree
	 */
	void enterSeq(ThriftParser.SeqContext ctx);
	/**
	 * Exit a parse tree produced by {@link ThriftParser#seq}.
	 * @param ctx the parse tree
	 */
	void exitSeq(ThriftParser.SeqContext ctx);
	/**
	 * Enter a parse tree produced by {@link ThriftParser#boolType}.
	 * @param ctx the parse tree
	 */
	void enterBoolType(ThriftParser.BoolTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ThriftParser#boolType}.
	 * @param ctx the parse tree
	 */
	void exitBoolType(ThriftParser.BoolTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ThriftParser#byteType}.
	 * @param ctx the parse tree
	 */
	void enterByteType(ThriftParser.ByteTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ThriftParser#byteType}.
	 * @param ctx the parse tree
	 */
	void exitByteType(ThriftParser.ByteTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ThriftParser#i8Type}.
	 * @param ctx the parse tree
	 */
	void enterI8Type(ThriftParser.I8TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ThriftParser#i8Type}.
	 * @param ctx the parse tree
	 */
	void exitI8Type(ThriftParser.I8TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ThriftParser#i16Type}.
	 * @param ctx the parse tree
	 */
	void enterI16Type(ThriftParser.I16TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ThriftParser#i16Type}.
	 * @param ctx the parse tree
	 */
	void exitI16Type(ThriftParser.I16TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ThriftParser#i32Type}.
	 * @param ctx the parse tree
	 */
	void enterI32Type(ThriftParser.I32TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ThriftParser#i32Type}.
	 * @param ctx the parse tree
	 */
	void exitI32Type(ThriftParser.I32TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ThriftParser#i64Type}.
	 * @param ctx the parse tree
	 */
	void enterI64Type(ThriftParser.I64TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ThriftParser#i64Type}.
	 * @param ctx the parse tree
	 */
	void exitI64Type(ThriftParser.I64TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ThriftParser#enumType}.
	 * @param ctx the parse tree
	 */
	void enterEnumType(ThriftParser.EnumTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ThriftParser#enumType}.
	 * @param ctx the parse tree
	 */
	void exitEnumType(ThriftParser.EnumTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ThriftParser#doubleType}.
	 * @param ctx the parse tree
	 */
	void enterDoubleType(ThriftParser.DoubleTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ThriftParser#doubleType}.
	 * @param ctx the parse tree
	 */
	void exitDoubleType(ThriftParser.DoubleTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ThriftParser#stringType}.
	 * @param ctx the parse tree
	 */
	void enterStringType(ThriftParser.StringTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ThriftParser#stringType}.
	 * @param ctx the parse tree
	 */
	void exitStringType(ThriftParser.StringTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ThriftParser#binaryType}.
	 * @param ctx the parse tree
	 */
	void enterBinaryType(ThriftParser.BinaryTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ThriftParser#binaryType}.
	 * @param ctx the parse tree
	 */
	void exitBinaryType(ThriftParser.BinaryTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ThriftParser#bodyType}.
	 * @param ctx the parse tree
	 */
	void enterBodyType(ThriftParser.BodyTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ThriftParser#bodyType}.
	 * @param ctx the parse tree
	 */
	void exitBodyType(ThriftParser.BodyTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ThriftParser#mapType}.
	 * @param ctx the parse tree
	 */
	void enterMapType(ThriftParser.MapTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ThriftParser#mapType}.
	 * @param ctx the parse tree
	 */
	void exitMapType(ThriftParser.MapTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ThriftParser#setType}.
	 * @param ctx the parse tree
	 */
	void enterSetType(ThriftParser.SetTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ThriftParser#setType}.
	 * @param ctx the parse tree
	 */
	void exitSetType(ThriftParser.SetTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ThriftParser#listType}.
	 * @param ctx the parse tree
	 */
	void enterListType(ThriftParser.ListTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ThriftParser#listType}.
	 * @param ctx the parse tree
	 */
	void exitListType(ThriftParser.ListTypeContext ctx);
}