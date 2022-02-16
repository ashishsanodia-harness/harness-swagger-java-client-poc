# FailureInfoDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**message** | **String** |  |  [optional]
**failureTypeList** | [**List&lt;FailureTypeListEnum&gt;**](#List&lt;FailureTypeListEnum&gt;) |  |  [optional]
**responseMessages** | [**List&lt;ResponseMessage&gt;**](ResponseMessage.md) |  |  [optional]

<a name="List<FailureTypeListEnum>"></a>
## Enum: List&lt;FailureTypeListEnum&gt;
Name | Value
---- | -----
EXPIRED | &quot;EXPIRED&quot;
DELEGATE_PROVISIONING | &quot;DELEGATE_PROVISIONING&quot;
CONNECTIVITY | &quot;CONNECTIVITY&quot;
AUTHENTICATION | &quot;AUTHENTICATION&quot;
VERIFICATION_FAILURE | &quot;VERIFICATION_FAILURE&quot;
APPLICATION_ERROR | &quot;APPLICATION_ERROR&quot;
AUTHORIZATION_ERROR | &quot;AUTHORIZATION_ERROR&quot;
TIMEOUT_ERROR | &quot;TIMEOUT_ERROR&quot;
