# ResponseDTOListWebhookTriggerType

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
GITHUB | &quot;GITHUB&quot;
GITLAB | &quot;GITLAB&quot;
BITBUCKET | &quot;BITBUCKET&quot;
CUSTOM | &quot;CUSTOM&quot;
AWS_CODECOMMIT | &quot;AWS_CODECOMMIT&quot;
