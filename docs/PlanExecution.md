# PlanExecution

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**uuid** | **String** |  |  [optional]
**createdAt** | **Long** |  |  [optional]
**planId** | **String** |  |  [optional]
**setupAbstractions** | **Map&lt;String, String&gt;** |  |  [optional]
**validUntil** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) |  |  [optional]
**startTs** | **Long** |  |  [optional]
**endTs** | **Long** |  |  [optional]
**metadata** | [**ExecutionMetadata**](ExecutionMetadata.md) |  |  [optional]
**governanceMetadata** | [**GovernanceMetadata**](GovernanceMetadata.md) |  |  [optional]
**lastUpdatedAt** | **Long** |  |  [optional]
**version** | **Long** |  |  [optional]
**nextIteration** | **Long** |  |  [optional]
**nodeType** | [**NodeTypeEnum**](#NodeTypeEnum) |  |  [optional]
**nodeId** | **String** |  |  [optional]

<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
NO_OP | &quot;NO_OP&quot;
RUNNING | &quot;RUNNING&quot;
INTERVENTION_WAITING | &quot;INTERVENTION_WAITING&quot;
TIMED_WAITING | &quot;TIMED_WAITING&quot;
ASYNC_WAITING | &quot;ASYNC_WAITING&quot;
TASK_WAITING | &quot;TASK_WAITING&quot;
DISCONTINUING | &quot;DISCONTINUING&quot;
PAUSING | &quot;PAUSING&quot;
QUEUED | &quot;QUEUED&quot;
SKIPPED | &quot;SKIPPED&quot;
PAUSED | &quot;PAUSED&quot;
ABORTED | &quot;ABORTED&quot;
ERRORED | &quot;ERRORED&quot;
FAILED | &quot;FAILED&quot;
EXPIRED | &quot;EXPIRED&quot;
SUSPENDED | &quot;SUSPENDED&quot;
SUCCEEDED | &quot;SUCCEEDED&quot;
IGNORE_FAILED | &quot;IGNORE_FAILED&quot;
APPROVAL_WAITING | &quot;APPROVAL_WAITING&quot;
RESOURCE_WAITING | &quot;RESOURCE_WAITING&quot;
APPROVAL_REJECTED | &quot;APPROVAL_REJECTED&quot;
UNRECOGNIZED | &quot;UNRECOGNIZED&quot;

<a name="NodeTypeEnum"></a>
## Enum: NodeTypeEnum
Name | Value
---- | -----
PLAN | &quot;PLAN&quot;
PLAN_NODE | &quot;PLAN_NODE&quot;
IDENTITY_PLAN_NODE | &quot;IDENTITY_PLAN_NODE&quot;
