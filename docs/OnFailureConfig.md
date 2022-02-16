# OnFailureConfig

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**errors** | [**List&lt;ErrorsEnum&gt;**](#List&lt;ErrorsEnum&gt;) |  | 
**action** | [**FailureStrategyActionConfig**](FailureStrategyActionConfig.md) |  | 

<a name="List<ErrorsEnum>"></a>
## Enum: List&lt;ErrorsEnum&gt;
Name | Value
---- | -----
UNKNOWN | &quot;UNKNOWN&quot;
ALL_ERRORS | &quot;ALL_ERRORS&quot;
AUTHENTICATION_ERROR | &quot;AUTHENTICATION_ERROR&quot;
CONNECTIVITY_ERROR | &quot;CONNECTIVITY_ERROR&quot;
TIMEOUT_ERROR | &quot;TIMEOUT_ERROR&quot;
AUTHORIZATION_ERROR | &quot;AUTHORIZATION_ERROR&quot;
VERIFICATION_ERROR | &quot;VERIFICATION_ERROR&quot;
DELEGATE_PROVISIONING_ERROR | &quot;DELEGATE_PROVISIONING_ERROR&quot;
