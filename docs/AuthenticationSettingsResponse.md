# AuthenticationSettingsResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ngAuthSettings** | [**List&lt;NGAuthSettings&gt;**](NGAuthSettings.md) | List of Auth Settings configured for an Account. |  [optional]
**whitelistedDomains** | **List&lt;String&gt;** | List of the whitelisted domains. |  [optional]
**authenticationMechanism** | [**AuthenticationMechanismEnum**](#AuthenticationMechanismEnum) | Indicates if the Authentication Mechanism is SSO or NON-SSO. |  [optional]
**twoFactorEnabled** | **Boolean** | If Two Factor Authentication is enabled, this value is true. Otherwise, it is false. |  [optional]

<a name="AuthenticationMechanismEnum"></a>
## Enum: AuthenticationMechanismEnum
Name | Value
---- | -----
USER_PASSWORD | &quot;USER_PASSWORD&quot;
SAML | &quot;SAML&quot;
LDAP | &quot;LDAP&quot;
OAUTH | &quot;OAUTH&quot;
