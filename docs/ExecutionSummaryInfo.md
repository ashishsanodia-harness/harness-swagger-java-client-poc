# ExecutionSummaryInfo

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**numOfErrors** | **List&lt;Integer&gt;** |  |  [optional]
**deployments** | **List&lt;Integer&gt;** |  |  [optional]
**lastExecutionTs** | **Long** |  |  [optional]
**lastExecutionStatus** | [**LastExecutionStatusEnum**](#LastExecutionStatusEnum) | This is the Execution Status of the entity |  [optional]
**lastExecutionId** | **String** |  |  [optional]

<a name="LastExecutionStatusEnum"></a>
## Enum: LastExecutionStatusEnum
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
