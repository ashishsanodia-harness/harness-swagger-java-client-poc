# RerunInfo

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**unknownFields** | [**UnknownFieldSet**](UnknownFieldSet.md) |  |  [optional]
**initialized** | **Boolean** |  |  [optional]
**rootExecutionId** | **String** |  |  [optional]
**rootTriggerTypeValue** | **Integer** |  |  [optional]
**prevExecutionId** | **String** |  |  [optional]
**prevExecutionIdBytes** | [**ByteString**](ByteString.md) |  |  [optional]
**prevTriggerTypeValue** | **Integer** |  |  [optional]
**prevTriggerType** | [**PrevTriggerTypeEnum**](#PrevTriggerTypeEnum) |  |  [optional]
**rootExecutionIdBytes** | [**ByteString**](ByteString.md) |  |  [optional]
**serializedSize** | **Integer** |  |  [optional]
**parserForType** | [**ParserRerunInfo**](ParserRerunInfo.md) |  |  [optional]
**defaultInstanceForType** | [**RerunInfo**](RerunInfo.md) |  |  [optional]
**rootTriggerType** | [**RootTriggerTypeEnum**](#RootTriggerTypeEnum) |  |  [optional]
**allFields** | **Map&lt;String, Object&gt;** |  |  [optional]
**initializationErrorString** | **String** |  |  [optional]
**descriptorForType** | [**Descriptor**](Descriptor.md) |  |  [optional]
**memoizedSerializedSize** | **Integer** |  |  [optional]

<a name="PrevTriggerTypeEnum"></a>
## Enum: PrevTriggerTypeEnum
Name | Value
---- | -----
NOOP | &quot;NOOP&quot;
MANUAL | &quot;MANUAL&quot;
WEBHOOK | &quot;WEBHOOK&quot;
WEBHOOK_CUSTOM | &quot;WEBHOOK_CUSTOM&quot;
SCHEDULER_CRON | &quot;SCHEDULER_CRON&quot;
UNRECOGNIZED | &quot;UNRECOGNIZED&quot;

<a name="RootTriggerTypeEnum"></a>
## Enum: RootTriggerTypeEnum
Name | Value
---- | -----
NOOP | &quot;NOOP&quot;
MANUAL | &quot;MANUAL&quot;
WEBHOOK | &quot;WEBHOOK&quot;
WEBHOOK_CUSTOM | &quot;WEBHOOK_CUSTOM&quot;
SCHEDULER_CRON | &quot;SCHEDULER_CRON&quot;
UNRECOGNIZED | &quot;UNRECOGNIZED&quot;
