# TaskChainExecutableResponseOrBuilder

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**taskId** | **String** |  |  [optional]
**taskName** | **String** |  |  [optional]
**taskCategoryValue** | **Integer** |  |  [optional]
**taskCategory** | [**TaskCategoryEnum**](#TaskCategoryEnum) |  |  [optional]
**chainEnd** | **Boolean** |  |  [optional]
**passThroughData** | [**ByteString**](ByteString.md) |  |  [optional]
**logKeysList** | **List&lt;String&gt;** |  |  [optional]
**logKeysCount** | **Integer** |  |  [optional]
**unitsList** | **List&lt;String&gt;** |  |  [optional]
**unitsCount** | **Integer** |  |  [optional]
**taskIdBytes** | [**ByteString**](ByteString.md) |  |  [optional]
**taskNameBytes** | [**ByteString**](ByteString.md) |  |  [optional]
**allFields** | **Map&lt;String, Object&gt;** |  |  [optional]
**initializationErrorString** | **String** |  |  [optional]
**descriptorForType** | [**Descriptor**](Descriptor.md) |  |  [optional]
**defaultInstanceForType** | [**Message**](Message.md) |  |  [optional]
**unknownFields** | [**UnknownFieldSet**](UnknownFieldSet.md) |  |  [optional]
**initialized** | **Boolean** |  |  [optional]

<a name="TaskCategoryEnum"></a>
## Enum: TaskCategoryEnum
Name | Value
---- | -----
UNKNOWN_CATEGORY | &quot;UNKNOWN_CATEGORY&quot;
DELEGATE_TASK_V1 | &quot;DELEGATE_TASK_V1&quot;
DELEGATE_TASK_V2 | &quot;DELEGATE_TASK_V2&quot;
UNRECOGNIZED | &quot;UNRECOGNIZED&quot;
