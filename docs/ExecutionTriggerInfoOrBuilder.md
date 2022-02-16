# ExecutionTriggerInfoOrBuilder

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**triggeredByOrBuilder** | [**TriggeredByOrBuilder**](TriggeredByOrBuilder.md) |  |  [optional]
**isRerun** | **Boolean** |  |  [optional]
**triggerTypeValue** | **Integer** |  |  [optional]
**triggeredBy** | [**TriggeredBy**](TriggeredBy.md) |  |  [optional]
**triggerType** | [**TriggerTypeEnum**](#TriggerTypeEnum) |  |  [optional]
**rerunInfoOrBuilder** | [**RerunInfoOrBuilder**](RerunInfoOrBuilder.md) |  |  [optional]
**rerunInfo** | [**RerunInfo**](RerunInfo.md) |  |  [optional]
**allFields** | **Map&lt;String, Object&gt;** |  |  [optional]
**initializationErrorString** | **String** |  |  [optional]
**descriptorForType** | [**Descriptor**](Descriptor.md) |  |  [optional]
**defaultInstanceForType** | [**Message**](Message.md) |  |  [optional]
**unknownFields** | [**UnknownFieldSet**](UnknownFieldSet.md) |  |  [optional]
**initialized** | **Boolean** |  |  [optional]

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
