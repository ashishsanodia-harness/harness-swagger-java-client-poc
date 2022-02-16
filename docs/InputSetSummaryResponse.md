# InputSetSummaryResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**identifier** | **String** |  |  [optional]
**name** | **String** |  |  [optional]
**pipelineIdentifier** | **String** |  |  [optional]
**description** | **String** |  |  [optional]
**inputSetType** | [**InputSetTypeEnum**](#InputSetTypeEnum) |  |  [optional]
**tags** | **Map&lt;String, String&gt;** |  |  [optional]
**version** | **Long** |  |  [optional]
**gitDetails** | [**PipelineEntityGitDetails**](PipelineEntityGitDetails.md) |  |  [optional]
**createdAt** | **Long** |  |  [optional]
**lastUpdatedAt** | **Long** |  |  [optional]
**isOutdated** | **Boolean** |  |  [optional]
**inputSetErrorDetails** | [**InputSetErrorWrapperDTOPMS**](InputSetErrorWrapperDTOPMS.md) |  |  [optional]
**overlaySetErrorDetails** | **Map&lt;String, String&gt;** |  |  [optional]
**entityValidityDetails** | [**PipelineEntityGitDetails**](PipelineEntityGitDetails.md) |  |  [optional]
**modules** | **List&lt;String&gt;** |  |  [optional]

<a name="InputSetTypeEnum"></a>
## Enum: InputSetTypeEnum
Name | Value
---- | -----
INPUT_SET | &quot;INPUT_SET&quot;
OVERLAY_INPUT_SET | &quot;OVERLAY_INPUT_SET&quot;
