# ExecutionTriggerInfo

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**unknownFields** | [**UnknownFieldSet**](UnknownFieldSet.md) |  |  [optional]
**initialized** | **Boolean** |  |  [optional]
**triggeredByOrBuilder** | [**TriggeredByOrBuilder**](TriggeredByOrBuilder.md) |  |  [optional]
**isRerun** | **Boolean** |  |  [optional]
**triggerTypeValue** | **Integer** |  |  [optional]
**triggeredBy** | [**TriggeredBy**](TriggeredBy.md) |  |  [optional]
**triggerType** | [**TriggerTypeEnum**](#TriggerTypeEnum) |  |  [optional]
**rerunInfoOrBuilder** | [**RerunInfoOrBuilder**](RerunInfoOrBuilder.md) |  |  [optional]
**serializedSize** | **Integer** |  |  [optional]
**parserForType** | [**ParserExecutionTriggerInfo**](ParserExecutionTriggerInfo.md) |  |  [optional]
**defaultInstanceForType** | [**ExecutionTriggerInfo**](ExecutionTriggerInfo.md) |  |  [optional]
**rerunInfo** | [**RerunInfo**](RerunInfo.md) |  |  [optional]
**allFields** | **Map&lt;String, Object&gt;** |  |  [optional]
**initializationErrorString** | **String** |  |  [optional]
**descriptorForType** | [**Descriptor**](Descriptor.md) |  |  [optional]
**memoizedSerializedSize** | **Integer** |  |  [optional]

<a name="TriggerTypeEnum"></a>
## Enum: TriggerTypeEnum
Name | Value
---- | -----
NOOP | &quot;NOOP&quot;
MANUAL | &quot;MANUAL&quot;
WEBHOOK | &quot;WEBHOOK&quot;
WEBHOOK_CUSTOM | &quot;WEBHOOK_CUSTOM&quot;
SCHEDULER_CRON | &quot;SCHEDULER_CRON&quot;
UNRECOGNIZED | &quot;UNRECOGNIZED&quot;
