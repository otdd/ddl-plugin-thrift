/**
 * Define a grammar called Hello
 */
grammar Thrift;
@header { package io.otdd.ddl.thrift.grammar; }

response : (boolType|byteType|i8Type|i16Type|i32Type|i64Type|enumType|doubleType|stringType|binaryType|bodyType|mapType|listType|setType) ':' (boolValue|charValue|stringValue|numberValue|doubleValue|body|setOrListValue|mapValue);

body  : '{' (basicElement|mapElement|setElement|listElement) (',' (basicElement|mapElement|setElement|listElement) )* '}' ;

//bodyContent : (element) (',' (element) )* ;

//element : (basicElement|mapElement) ;

// as the map value structure is conflicting with the body value and list/set value conflicts with each other, they are specified intentionlly
mapElement : mapKey ':' mapValue ;

mapKey : seq '<' mapType '>' ;

//setElement : setKey ':' setValue ;
setElement : setKey ':' setOrListValue ;

setKey : seq '<' setType '>' ;

//listElement : listKey ':' listValue ;
listElement : listKey ':' setOrListValue ;

listKey : seq '<' listType '>' ;

basicElement : basicKey ':' (basicValue|body) ;

basicKey : seq basicType?;

basicType : '<' (boolType|byteType|i8Type|i16Type|i32Type|i64Type|enumType|doubleType|stringType|binaryType|bodyType) '>' ;

basicValue : (boolValue|charValue|stringValue|numberValue|doubleValue) ;

charValue : CharValue ;

stringValue : StringValue ;

boolValue : BoolValue ;

numberValue : NumberValue ;

doubleValue : DoubleValue ;

mapValue : '{' (mapValueElement) (',' (mapValueElement) )* '}' ;

//mapValueElement : (stringValue|boolValue|numberValue|doubleValue) ':' (stringValue|boolValue|numberValue|doubleValue|mapValue|setValue|listValue|body) ;
mapValueElement : (stringValue|charValue|boolValue|numberValue|doubleValue) ':' containerValue ;

//setValue : '{' (setValueElement) (',' (setValueElement) )* '}' ;
setOrListValue : '[' (containerValue) (',' (containerValue) )* ']' ;

//setValueElement : (stringValue|boolValue|numberValue|doubleValue|mapValue|setValue|listValue|body) ;
containerValue : (stringValue|charValue|boolValue|numberValue|doubleValue|mapValue|setOrListValue|body) ;

//listValue : '{' (listValueElement) (',' (listValueElement) )* '}' ;
//
//listValueElement : (stringValue|boolValue|numberValue|doubleValue|mapValue|setValue|listValue|body) ;

seq : NumberValue ;

boolType : BoolType ;

byteType : ByteType ;

i8Type : I8Type ;

i16Type : I16Type ;

i32Type : I32Type ;

i64Type : I64Type ;

enumType : EnumType ;

doubleType : DoubleType ;

stringType : StringType ;

binaryType : BinaryType ;

bodyType : BodyType ;

mapType : 'map' '<' (boolType|byteType|i8Type|i16Type|i32Type|i64Type|doubleType|enumType|stringType|binaryType) ',' (boolType|byteType|i8Type|i16Type|i32Type|i64Type|doubleType|enumType|stringType|binaryType|listType|setType|mapType|bodyType) '>' ;

setType : 'set' '<' (boolType|byteType|i8Type|i16Type|i32Type|i64Type|doubleType|enumType|stringType|binaryType|listType|setType|mapType|bodyType) '>' ;

listType : 'list' '<' (boolType|byteType|i8Type|i16Type|i32Type|i64Type|doubleType|enumType|stringType|binaryType|listType|setType|mapType|bodyType) '>' ;

BoolType : 'bool' ;

ByteType : 'byte' ;

I8Type : 'i8' ;

I16Type : 'i16' ;

I32Type : 'i32' ;

I64Type : 'i64' ;

DoubleType : 'double' ;

EnumType : 'enum' ;

StringType : 'string' ;

BinaryType : 'binary' ;

StringValue  : '"'('\\"'|~'"')*'"' ;

CharValue  : '\''('\\\''|~'\'')'\'' ;

BoolValue   : ('true'|'false'|'True'|'False'|'TRUE'|'FALSE') ;

NumberValue : ([1-9] [0-9]*|'0') ;

DoubleValue  : '0'..'9'+'.''0'..'9'+ ;

BodyType : [a-zA-Z0-9]+ ;

WS     : [ \t\r\n]+ -> skip ;
