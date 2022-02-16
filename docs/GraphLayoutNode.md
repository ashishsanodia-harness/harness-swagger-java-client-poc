# GraphLayoutNode

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**nodeType** | **String** |  |  [optional]
**nodeGroup** | **String** |  |  [optional]
**nodeIdentifier** | **String** |  |  [optional]
**name** | **String** |  |  [optional]
**nodeUuid** | **String** |  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | This is the Execution Status of the entity |  [optional]
**module** | **String** |  |  [optional]
**moduleInfo** | [**Map&lt;String, Document&gt;**](Document.md) |  |  [optional]
**startTs** | **Long** |  |  [optional]
**endTs** | **Long** |  |  [optional]
**edgeLayoutList** | [**EdgeLayoutList**](EdgeLayoutList.md) |  |  [optional]
**skipInfo** | [**SkipInfo**](SkipInfo.md) |  |  [optional]
**nodeRunInfo** | [**NodeRunInfo**](NodeRunInfo.md) |  |  [optional]
**barrierFound** | **Boolean** |  |  [optional]
**failureInfo** | [**ExecutionErrorInfo**](ExecutionErrorInfo.md) |  |  [optional]
**failureInfoDTO** | [**FailureInfoDTO**](FailureInfoDTO.md) |  |  [optional]

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
