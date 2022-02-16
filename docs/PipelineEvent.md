# PipelineEvent

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**TypeEnum**](#TypeEnum) |  |  [optional]
**forStages** | **List&lt;String&gt;** |  |  [optional]

<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
ALL_EVENTS | &quot;ALL_EVENTS&quot;
PIPELINE_START | &quot;PIPELINE_START&quot;
PIPELINE_SUCCESS | &quot;PIPELINE_SUCCESS&quot;
PIPELINE_FAILED | &quot;PIPELINE_FAILED&quot;
PIPELINE_END | &quot;PIPELINE_END&quot;
PIPELINE_PAUSED | &quot;PIPELINE_PAUSED&quot;
STAGE_SUCCESS | &quot;STAGE_SUCCESS&quot;
STAGE_FAILED | &quot;STAGE_FAILED&quot;
STAGE_START | &quot;STAGE_START&quot;
STEP_FAILED | &quot;STEP_FAILED&quot;
