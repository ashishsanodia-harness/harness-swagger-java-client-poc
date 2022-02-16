# MethodOptions

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**unknownFields** | [**UnknownFieldSet**](UnknownFieldSet.md) |  |  [optional]
**initialized** | **Boolean** |  |  [optional]
**deprecated** | **Boolean** |  |  [optional]
**uninterpretedOptionList** | [**List&lt;UninterpretedOption&gt;**](UninterpretedOption.md) |  |  [optional]
**uninterpretedOptionCount** | **Integer** |  |  [optional]
**uninterpretedOptionOrBuilderList** | [**List&lt;UninterpretedOptionOrBuilder&gt;**](UninterpretedOptionOrBuilder.md) |  |  [optional]
**serializedSize** | **Integer** |  |  [optional]
**parserForType** | [**ParserMethodOptions**](ParserMethodOptions.md) |  |  [optional]
**defaultInstanceForType** | [**MethodOptions**](MethodOptions.md) |  |  [optional]
**idempotencyLevel** | [**IdempotencyLevelEnum**](#IdempotencyLevelEnum) |  |  [optional]
**allFields** | **Map&lt;String, Object&gt;** |  |  [optional]
**initializationErrorString** | **String** |  |  [optional]
**descriptorForType** | [**Descriptor**](Descriptor.md) |  |  [optional]
**allFieldsRaw** | **Map&lt;String, Object&gt;** |  |  [optional]
**memoizedSerializedSize** | **Integer** |  |  [optional]

<a name="IdempotencyLevelEnum"></a>
## Enum: IdempotencyLevelEnum
Name | Value
---- | -----
IDEMPOTENCY_UNKNOWN | &quot;IDEMPOTENCY_UNKNOWN&quot;
NO_SIDE_EFFECTS | &quot;NO_SIDE_EFFECTS&quot;
IDEMPOTENT | &quot;IDEMPOTENT&quot;
