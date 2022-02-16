# FieldOptions

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**unknownFields** | [**UnknownFieldSet**](UnknownFieldSet.md) |  |  [optional]
**initialized** | **Boolean** |  |  [optional]
**packed** | **Boolean** |  |  [optional]
**jstype** | [**JstypeEnum**](#JstypeEnum) |  |  [optional]
**weak** | **Boolean** |  |  [optional]
**lazy** | **Boolean** |  |  [optional]
**deprecated** | **Boolean** |  |  [optional]
**uninterpretedOptionList** | [**List&lt;UninterpretedOption&gt;**](UninterpretedOption.md) |  |  [optional]
**uninterpretedOptionCount** | **Integer** |  |  [optional]
**uninterpretedOptionOrBuilderList** | [**List&lt;UninterpretedOptionOrBuilder&gt;**](UninterpretedOptionOrBuilder.md) |  |  [optional]
**serializedSize** | **Integer** |  |  [optional]
**parserForType** | [**ParserFieldOptions**](ParserFieldOptions.md) |  |  [optional]
**defaultInstanceForType** | [**FieldOptions**](FieldOptions.md) |  |  [optional]
**ctype** | [**CtypeEnum**](#CtypeEnum) |  |  [optional]
**allFields** | **Map&lt;String, Object&gt;** |  |  [optional]
**initializationErrorString** | **String** |  |  [optional]
**descriptorForType** | [**Descriptor**](Descriptor.md) |  |  [optional]
**allFieldsRaw** | **Map&lt;String, Object&gt;** |  |  [optional]
**memoizedSerializedSize** | **Integer** |  |  [optional]

<a name="JstypeEnum"></a>
## Enum: JstypeEnum
Name | Value
---- | -----
NORMAL | &quot;JS_NORMAL&quot;
STRING | &quot;JS_STRING&quot;
NUMBER | &quot;JS_NUMBER&quot;

<a name="CtypeEnum"></a>
## Enum: CtypeEnum
Name | Value
---- | -----
STRING | &quot;STRING&quot;
CORD | &quot;CORD&quot;
STRING_PIECE | &quot;STRING_PIECE&quot;
