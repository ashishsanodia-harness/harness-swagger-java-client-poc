# PipelineExecutionSummary

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pipelineIdentifier** | **String** |  |  [optional]
**planExecutionId** | **String** |  |  [optional]
**name** | **String** |  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | This is the Execution Status of the entity |  [optional]
**tags** | [**List&lt;NGTag&gt;**](NGTag.md) |  |  [optional]
**executionTriggerInfo** | [**ExecutionTriggerInfo**](ExecutionTriggerInfo.md) |  |  [optional]
**executionErrorInfo** | [**ExecutionErrorInfo**](ExecutionErrorInfo.md) |  |  [optional]
**governanceMetadata** | [**GovernanceMetadata**](GovernanceMetadata.md) |  |  [optional]
**moduleInfo** | [**Map&lt;String, Document&gt;**](Document.md) |  |  [optional]
**layoutNodeMap** | [**Map&lt;String, GraphLayoutNode&gt;**](GraphLayoutNode.md) |  |  [optional]
**modules** | **List&lt;String&gt;** |  |  [optional]
**startingNodeId** | **String** |  |  [optional]
**startTs** | **Long** |  |  [optional]
**endTs** | **Long** |  |  [optional]
**createdAt** | **Long** |  |  [optional]
**canRetry** | **Boolean** |  |  [optional]
**showRetryHistory** | **Boolean** |  |  [optional]
**runSequence** | **Integer** |  |  [optional]
**successfulStagesCount** | **Long** |  |  [optional]
**runningStagesCount** | **Long** |  |  [optional]
**failedStagesCount** | **Long** |  |  [optional]
**totalStagesCount** | **Long** |  |  [optional]
**gitDetails** | [**PipelineEntityGitDetails**](PipelineEntityGitDetails.md) |  |  [optional]
**isStagesExecution** | **Boolean** |  |  [optional]
**stagesExecuted** | **List&lt;String&gt;** |  |  [optional]
**stagesExecutedNames** | **Map&lt;String, String&gt;** |  |  [optional]
**stagesExecution** | **Boolean** |  |  [optional]

<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
RUNNING | &quot;RUNNING&quot;
ASYNCWAITING | &quot;ASYNCWAITING&quot;
TASKWAITING | &quot;TASKWAITING&quot;
TIMEDWAITING | &quot;TIMEDWAITING&quot;
FAILED | &quot;FAILED&quot;
ERRORED | &quot;ERRORED&quot;
IGNOREFAILED | &quot;IGNOREFAILED&quot;
NOTSTARTED | &quot;NOTSTARTED&quot;
EXPIRED | &quot;EXPIRED&quot;
ABORTED | &quot;ABORTED&quot;
DISCONTINUING | &quot;DISCONTINUING&quot;
QUEUED | &quot;QUEUED&quot;
PAUSED | &quot;PAUSED&quot;
RESOURCEWAITING | &quot;RESOURCEWAITING&quot;
INTERVENTIONWAITING | &quot;INTERVENTIONWAITING&quot;
APPROVALWAITING | &quot;APPROVALWAITING&quot;
SUCCESS | &quot;SUCCESS&quot;
SUSPENDED | &quot;SUSPENDED&quot;
SKIPPED | &quot;SKIPPED&quot;
PAUSING | &quot;PAUSING&quot;
APPROVALREJECTED | &quot;APPROVALREJECTED&quot;
NOT_STARTED | &quot;NOT_STARTED&quot;
INTERVENTION_WAITING | &quot;INTERVENTION_WAITING&quot;
APPROVAL_WAITING | &quot;APPROVAL_WAITING&quot;
APPROVAL_REJECTED | &quot;APPROVAL_REJECTED&quot;
WAITING | &quot;WAITING&quot;
