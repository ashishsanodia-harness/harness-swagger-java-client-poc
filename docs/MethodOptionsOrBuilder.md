# MethodOptionsOrBuilder

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**deprecated** | **Boolean** |  |  [optional]
**uninterpretedOptionList** | [**List&lt;UninterpretedOption&gt;**](UninterpretedOption.md) |  |  [optional]
**uninterpretedOptionCount** | **Integer** |  |  [optional]
**uninterpretedOptionOrBuilderList** | [**List&lt;UninterpretedOptionOrBuilder&gt;**](UninterpretedOptionOrBuilder.md) |  |  [optional]
**idempotencyLevel** | [**IdempotencyLevelEnum**](#IdempotencyLevelEnum) |  |  [optional]
**defaultInstanceForType** | [**Message**](Message.md) |  |  [optional]
**allFields** | **Map&lt;String, Object&gt;** |  |  [optional]
**initializationErrorString** | **String** |  |  [optional]
**descriptorForType** | [**Descriptor**](Descriptor.md) |  |  [optional]
**unknownFields** | [**UnknownFieldSet**](UnknownFieldSet.md) |  |  [optional]
**initialized** | **Boolean** |  |  [optional]

<a name="IdempotencyLevelEnum"></a>
## Enum: IdempotencyLevelEnum
Name | Value
---- | -----
IDEMPOTENCY_UNKNOWN | &quot;IDEMPOTENCY_UNKNOWN&quot;
NO_SIDE_EFFECTS | &quot;NO_SIDE_EFFECTS&quot;
IDEMPOTENT | &quot;IDEMPOTENT&quot;
