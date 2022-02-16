# ResponseDTOListGitlabTriggerEvent

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**StatusEnum**](#StatusEnum) |  |  [optional]
**data** | [**List&lt;DataEnum&gt;**](#List&lt;DataEnum&gt;) |  |  [optional]
**metaData** | **Object** |  |  [optional]
**correlationId** | **String** |  |  [optional]

<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
SUCCESS | &quot;SUCCESS&quot;
FAILURE | &quot;FAILURE&quot;
ERROR | &quot;ERROR&quot;

<a name="List<DataEnum>"></a>
## Enum: List&lt;DataEnum&gt;
Name | Value
---- | -----
MERGE_REQUEST | &quot;MERGE_REQUEST&quot;
PUSH | &quot;PUSH&quot;
