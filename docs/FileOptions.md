# FileOptions

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**unknownFields** | [**UnknownFieldSet**](UnknownFieldSet.md) |  |  [optional]
**initialized** | **Boolean** |  |  [optional]
**javaPackage** | **String** |  |  [optional]
**javaStringCheckUtf8** | **Boolean** |  |  [optional]
**javaPackageBytes** | [**ByteString**](ByteString.md) |  |  [optional]
**javaOuterClassname** | **String** |  |  [optional]
**javaOuterClassnameBytes** | [**ByteString**](ByteString.md) |  |  [optional]
**javaMultipleFiles** | **Boolean** |  |  [optional]
**javaGenerateEqualsAndHash** | **Boolean** |  |  [optional]
**optimizeFor** | [**OptimizeForEnum**](#OptimizeForEnum) |  |  [optional]
**goPackage** | **String** |  |  [optional]
**goPackageBytes** | [**ByteString**](ByteString.md) |  |  [optional]
**ccGenericServices** | **Boolean** |  |  [optional]
**javaGenericServices** | **Boolean** |  |  [optional]
**pyGenericServices** | **Boolean** |  |  [optional]
**phpGenericServices** | **Boolean** |  |  [optional]
**deprecated** | **Boolean** |  |  [optional]
**ccEnableArenas** | **Boolean** |  |  [optional]
**objcClassPrefix** | **String** |  |  [optional]
**objcClassPrefixBytes** | [**ByteString**](ByteString.md) |  |  [optional]
**csharpNamespace** | **String** |  |  [optional]
**csharpNamespaceBytes** | [**ByteString**](ByteString.md) |  |  [optional]
**swiftPrefix** | **String** |  |  [optional]
**swiftPrefixBytes** | [**ByteString**](ByteString.md) |  |  [optional]
**phpClassPrefix** | **String** |  |  [optional]
**phpClassPrefixBytes** | [**ByteString**](ByteString.md) |  |  [optional]
**phpNamespace** | **String** |  |  [optional]
**phpNamespaceBytes** | [**ByteString**](ByteString.md) |  |  [optional]
**phpMetadataNamespace** | **String** |  |  [optional]
**phpMetadataNamespaceBytes** | [**ByteString**](ByteString.md) |  |  [optional]
**rubyPackage** | **String** |  |  [optional]
**rubyPackageBytes** | [**ByteString**](ByteString.md) |  |  [optional]
**uninterpretedOptionList** | [**List&lt;UninterpretedOption&gt;**](UninterpretedOption.md) |  |  [optional]
**uninterpretedOptionCount** | **Integer** |  |  [optional]
**uninterpretedOptionOrBuilderList** | [**List&lt;UninterpretedOptionOrBuilder&gt;**](UninterpretedOptionOrBuilder.md) |  |  [optional]
**serializedSize** | **Integer** |  |  [optional]
**parserForType** | [**ParserFileOptions**](ParserFileOptions.md) |  |  [optional]
**defaultInstanceForType** | [**FileOptions**](FileOptions.md) |  |  [optional]
**allFields** | **Map&lt;String, Object&gt;** |  |  [optional]
**initializationErrorString** | **String** |  |  [optional]
**descriptorForType** | [**Descriptor**](Descriptor.md) |  |  [optional]
**allFieldsRaw** | **Map&lt;String, Object&gt;** |  |  [optional]
**memoizedSerializedSize** | **Integer** |  |  [optional]

<a name="OptimizeForEnum"></a>
## Enum: OptimizeForEnum
Name | Value
---- | -----
SPEED | &quot;SPEED&quot;
CODE_SIZE | &quot;CODE_SIZE&quot;
LITE_RUNTIME | &quot;LITE_RUNTIME&quot;
