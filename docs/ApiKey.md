# ApiKey

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**identifier** | **String** | Identifier of the API Key |  [optional]
**name** | **String** | Name of the API Key |  [optional]
**description** | **String** | Description of the API Key |  [optional]
**tags** | **Map&lt;String, String&gt;** | Tags for the API Key |  [optional]
**apiKeyType** | [**ApiKeyTypeEnum**](#ApiKeyTypeEnum) | Type of the API Key |  [optional]
**parentIdentifier** | **String** | Parent Entity Identifier of the API Key |  [optional]
**defaultTimeToExpireToken** | **Long** | Default expiration time of the Token within API Key. |  [optional]
**accountIdentifier** | **String** | Account Identifier for the Entity |  [optional]
**projectIdentifier** | **String** | Project Identifier for the Entity |  [optional]
**orgIdentifier** | **String** | Organization Identifier for the Entity |  [optional]

<a name="ApiKeyTypeEnum"></a>
## Enum: ApiKeyTypeEnum
Name | Value
---- | -----
USER | &quot;USER&quot;
SERVICE_ACCOUNT | &quot;SERVICE_ACCOUNT&quot;
