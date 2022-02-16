# PMSPipelineSummaryResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** |  |  [optional]
**identifier** | **String** |  |  [optional]
**description** | **String** |  |  [optional]
**tags** | **Map&lt;String, String&gt;** |  |  [optional]
**version** | **Long** |  |  [optional]
**numOfStages** | **Integer** |  |  [optional]
**createdAt** | **Long** |  |  [optional]
**lastUpdatedAt** | **Long** |  |  [optional]
**modules** | **List&lt;String&gt;** |  |  [optional]
**executionSummaryInfo** | [**ExecutionSummaryInfo**](ExecutionSummaryInfo.md) |  |  [optional]
**filters** | [**Map&lt;String, Document&gt;**](Document.md) |  |  [optional]
**stageNames** | **List&lt;String&gt;** |  |  [optional]
**gitDetails** | [**PipelineEntityGitDetails**](PipelineEntityGitDetails.md) |  |  [optional]
**entityValidityDetails** | [**PipelineEntityGitDetails**](PipelineEntityGitDetails.md) |  |  [optional]
