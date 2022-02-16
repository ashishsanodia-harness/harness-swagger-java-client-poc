# ResponseDTOMapWebhookSourceRepoListWebhookEvent

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**StatusEnum**](#StatusEnum) |  |  [optional]
**data** | [**Map&lt;String, List&lt;String&gt;&gt;**](#Map&lt;String, List&lt;String&gt;&gt;) |  |  [optional]
**metaData** | **Object** |  |  [optional]
**correlationId** | **String** |  |  [optional]

<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
SUCCESS | &quot;SUCCESS&quot;
FAILURE | &quot;FAILURE&quot;
ERROR | &quot;ERROR&quot;

<a name="Map<String, List<String>>"></a>
## Enum: Map&lt;String, List&lt;String&gt;&gt;
Name | Value
---- | -----
PULL_REQUEST | &quot;PULL_REQUEST&quot;
PUSH | &quot;PUSH&quot;
ISSUE_COMMENT | &quot;ISSUE_COMMENT&quot;
DELETE | &quot;DELETE&quot;
MERGE_REQUEST | &quot;MERGE_REQUEST&quot;
REPOSITORY | &quot;REPOSITORY&quot;
BRANCH | &quot;BRANCH&quot;
TAG | &quot;TAG&quot;
