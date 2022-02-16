# UnitProgress

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**unknownFields** | [**UnknownFieldSet**](UnknownFieldSet.md) |  |  [optional]
**startTime** | **Long** |  |  [optional]
**initialized** | **Boolean** |  |  [optional]
**endTime** | **Long** |  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) |  |  [optional]
**serializedSize** | **Integer** |  |  [optional]
**parserForType** | [**ParserUnitProgress**](ParserUnitProgress.md) |  |  [optional]
**defaultInstanceForType** | [**UnitProgress**](UnitProgress.md) |  |  [optional]
**unitName** | **String** |  |  [optional]
**unitNameBytes** | [**ByteString**](ByteString.md) |  |  [optional]
**statusValue** | **Integer** |  |  [optional]
**allFields** | **Map&lt;String, Object&gt;** |  |  [optional]
**initializationErrorString** | **String** |  |  [optional]
**descriptorForType** | [**Descriptor**](Descriptor.md) |  |  [optional]
**memoizedSerializedSize** | **Integer** |  |  [optional]

<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
UNKNOWN | &quot;UNKNOWN&quot;
SUCCESS | &quot;SUCCESS&quot;
FAILURE | &quot;FAILURE&quot;
RUNNING | &quot;RUNNING&quot;
QUEUED | &quot;QUEUED&quot;
SKIPPED | &quot;SKIPPED&quot;
EXPIRED | &quot;EXPIRED&quot;
UNRECOGNIZED | &quot;UNRECOGNIZED&quot;
