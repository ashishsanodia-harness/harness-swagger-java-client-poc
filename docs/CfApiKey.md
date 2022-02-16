# CfApiKey

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**apiKey** | **String** | The Key will be shown only on create. On subsequent GET calls, only the masked APIKeys will be returned | 
**identifier** | **String** | The environment that this key was created in | 
**key** | **String** | A hash of API key |  [optional]
**name** | **String** | The user friendly identifier for the API Key | 
**type** | [**TypeEnum**](#TypeEnum) | The type of key depending on the SDK that is being used. | 

<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
SERVER | &quot;server&quot;
CLIENT | &quot;client&quot;
