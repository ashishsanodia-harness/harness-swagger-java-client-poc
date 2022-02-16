# SSOSettings

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**uuid** | **String** |  | 
**appId** | **String** |  | 
**createdBy** | [**EmbeddedUser**](EmbeddedUser.md) |  |  [optional]
**createdAt** | **Long** |  |  [optional]
**lastUpdatedBy** | [**EmbeddedUser**](EmbeddedUser.md) |  |  [optional]
**lastUpdatedAt** | **Long** |  | 
**type** | [**TypeEnum**](#TypeEnum) |  | 
**displayName** | **String** |  |  [optional]
**url** | **String** |  |  [optional]
**nextIteration** | **Long** |  |  [optional]
**nextIterations** | **List&lt;Long&gt;** |  |  [optional]
**accountId** | **String** |  |  [optional]

<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
SAML | &quot;SAML&quot;
LDAP | &quot;LDAP&quot;
OAUTH | &quot;OAUTH&quot;
