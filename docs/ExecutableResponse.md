# ExecutableResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**unknownFields** | [**UnknownFieldSet**](UnknownFieldSet.md) |  |  [optional]
**async** | [**AsyncExecutableResponse**](AsyncExecutableResponse.md) |  |  [optional]
**initialized** | **Boolean** |  |  [optional]
**children** | [**ChildrenExecutableResponse**](ChildrenExecutableResponse.md) |  |  [optional]
**task** | [**TaskExecutableResponse**](TaskExecutableResponse.md) |  |  [optional]
**child** | [**ChildExecutableResponse**](ChildExecutableResponse.md) |  |  [optional]
**responseCase** | [**ResponseCaseEnum**](#ResponseCaseEnum) |  |  [optional]
**asyncOrBuilder** | [**AsyncExecutableResponseOrBuilder**](AsyncExecutableResponseOrBuilder.md) |  |  [optional]
**childOrBuilder** | [**ChildExecutableResponseOrBuilder**](ChildExecutableResponseOrBuilder.md) |  |  [optional]
**childrenOrBuilder** | [**ChildrenExecutableResponseOrBuilder**](ChildrenExecutableResponseOrBuilder.md) |  |  [optional]
**childChain** | [**ChildChainExecutableResponse**](ChildChainExecutableResponse.md) |  |  [optional]
**childChainOrBuilder** | [**ChildChainExecutableResponseOrBuilder**](ChildChainExecutableResponseOrBuilder.md) |  |  [optional]
**taskOrBuilder** | [**TaskExecutableResponseOrBuilder**](TaskExecutableResponseOrBuilder.md) |  |  [optional]
**taskChain** | [**TaskChainExecutableResponse**](TaskChainExecutableResponse.md) |  |  [optional]
**taskChainOrBuilder** | [**TaskChainExecutableResponseOrBuilder**](TaskChainExecutableResponseOrBuilder.md) |  |  [optional]
**syncOrBuilder** | [**SyncExecutableResponseOrBuilder**](SyncExecutableResponseOrBuilder.md) |  |  [optional]
**skipTask** | [**SkipTaskExecutableResponse**](SkipTaskExecutableResponse.md) |  |  [optional]
**skipTaskOrBuilder** | [**SkipTaskExecutableResponseOrBuilder**](SkipTaskExecutableResponseOrBuilder.md) |  |  [optional]
**sync** | [**SyncExecutableResponse**](SyncExecutableResponse.md) |  |  [optional]
**serializedSize** | **Integer** |  |  [optional]
**parserForType** | [**ParserExecutableResponse**](ParserExecutableResponse.md) |  |  [optional]
**defaultInstanceForType** | [**ExecutableResponse**](ExecutableResponse.md) |  |  [optional]
**allFields** | **Map&lt;String, Object&gt;** |  |  [optional]
**initializationErrorString** | **String** |  |  [optional]
**descriptorForType** | [**Descriptor**](Descriptor.md) |  |  [optional]
**memoizedSerializedSize** | **Integer** |  |  [optional]

<a name="ResponseCaseEnum"></a>
## Enum: ResponseCaseEnum
Name | Value
---- | -----
ASYNC | &quot;ASYNC&quot;
CHILD | &quot;CHILD&quot;
CHILDREN | &quot;CHILDREN&quot;
CHILDCHAIN | &quot;CHILDCHAIN&quot;
TASK | &quot;TASK&quot;
TASKCHAIN | &quot;TASKCHAIN&quot;
SYNC | &quot;SYNC&quot;
SKIPTASK | &quot;SKIPTASK&quot;
RESPONSE_NOT_SET | &quot;RESPONSE_NOT_SET&quot;
