# ResponseDTOListInviteOperationResponse

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
ACCOUNT_INVITE_ACCEPTED_NEED_PASSWORD | &quot;ACCOUNT_INVITE_ACCEPTED_NEED_PASSWORD&quot;
ACCOUNT_INVITE_ACCEPTED | &quot;ACCOUNT_INVITE_ACCEPTED&quot;
USER_INVITED_SUCCESSFULLY | &quot;USER_INVITED_SUCCESSFULLY&quot;
USER_ALREADY_ADDED | &quot;USER_ALREADY_ADDED&quot;
USER_ALREADY_INVITED | &quot;USER_ALREADY_INVITED&quot;
FAIL | &quot;FAIL&quot;
INVITE_EXPIRED | &quot;INVITE_EXPIRED&quot;
INVITE_INVALID | &quot;INVITE_INVALID&quot;
