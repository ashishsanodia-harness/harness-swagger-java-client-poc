# Token

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**identifier** | **String** | Identifier of the Token |  [optional]
**name** | **String** | Name of the Token |  [optional]
**validFrom** | **Long** | This is the time from which the Token is valid. The time is in milliseconds. |  [optional]
**validTo** | **Long** | This is the time till which the Token is valid. The time is in milliseconds. |  [optional]
**scheduledExpireTime** | **Long** | Scheduled expiry time in milliseconds. |  [optional]
**valid** | **Boolean** | Boolean value to indicate if Token is valid or not. |  [optional]
**accountIdentifier** | **String** | Account Identifier for the Entity |  [optional]
**projectIdentifier** | **String** | Project Identifier for the Entity |  [optional]
**orgIdentifier** | **String** | Organization Identifier for the Entity |  [optional]
**apiKeyIdentifier** | **String** | This is the API Key Id within which the Token is created. |  [optional]
**parentIdentifier** | **String** | This is the ID of the Parent entity from which the Token inherits its role bindings. |  [optional]
**apiKeyType** | [**ApiKeyTypeEnum**](#ApiKeyTypeEnum) | Type of the API Key |  [optional]
**description** | **String** | Description of the Token |  [optional]
**tags** | **Map&lt;String, String&gt;** | Tags for the Token |  [optional]
**email** | **String** | Email Id of the user who created the Token. |  [optional]
**username** | **String** | Name of the user who created the Token. |  [optional]
**encodedPassword** | **String** |  |  [optional]

<a name="ApiKeyTypeEnum"></a>
## Enum: ApiKeyTypeEnum
Name | Value
---- | -----
USER | &quot;USER&quot;
SERVICE_ACCOUNT | &quot;SERVICE_ACCOUNT&quot;
