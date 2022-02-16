# TaskChainExecutableResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**unknownFields** | [**UnknownFieldSet**](UnknownFieldSet.md) |  |  [optional]
**initialized** | **Boolean** |  |  [optional]
**taskId** | **String** |  |  [optional]
**taskName** | **String** |  |  [optional]
**taskCategoryValue** | **Integer** |  |  [optional]
**taskCategory** | [**TaskCategoryEnum**](#TaskCategoryEnum) |  |  [optional]
**chainEnd** | **Boolean** |  |  [optional]
**passThroughData** | [**ByteString**](ByteString.md) |  |  [optional]
**serializedSize** | **Integer** |  |  [optional]
**parserForType** | [**ParserTaskChainExecutableResponse**](ParserTaskChainExecutableResponse.md) |  |  [optional]
**defaultInstanceForType** | [**TaskChainExecutableResponse**](TaskChainExecutableResponse.md) |  |  [optional]
**logKeysList** | **List&lt;String&gt;** |  |  [optional]
**logKeysCount** | **Integer** |  |  [optional]
**unitsList** | **List&lt;String&gt;** |  |  [optional]
**unitsCount** | **Integer** |  |  [optional]
**taskIdBytes** | [**ByteString**](ByteString.md) |  |  [optional]
**taskNameBytes** | [**ByteString**](ByteString.md) |  |  [optional]
**allFields** | **Map&lt;String, Object&gt;** |  |  [optional]
**initializationErrorString** | **String** |  |  [optional]
**descriptorForType** | [**Descriptor**](Descriptor.md) |  |  [optional]
**memoizedSerializedSize** | **Integer** |  |  [optional]

<a name="TaskCategoryEnum"></a>
## Enum: TaskCategoryEnum
Name | Value
---- | -----
UNKNOWN_CATEGORY | &quot;UNKNOWN_CATEGORY&quot;
DELEGATE_TASK_V1 | &quot;DELEGATE_TASK_V1&quot;
DELEGATE_TASK_V2 | &quot;DELEGATE_TASK_V2&quot;
UNRECOGNIZED | &quot;UNRECOGNIZED&quot;
