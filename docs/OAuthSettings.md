# OAuthSettings

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**filter** | **String** |  |  [optional]
**allowedProviders** | [**List&lt;AllowedProvidersEnum&gt;**](#List&lt;AllowedProvidersEnum&gt;) | This is the list of OAuth Providers that are supported. |  [optional]
**settingsType** | [**SettingsTypeEnum**](#SettingsTypeEnum) |  |  [optional]

<a name="List<AllowedProvidersEnum>"></a>
## Enum: List&lt;AllowedProvidersEnum&gt;
Name | Value
---- | -----
AZURE | &quot;AZURE&quot;
BITBUCKET | &quot;BITBUCKET&quot;
GITHUB | &quot;GITHUB&quot;
GITLAB | &quot;GITLAB&quot;
GOOGLE | &quot;GOOGLE&quot;
LINKEDIN | &quot;LINKEDIN&quot;

<a name="SettingsTypeEnum"></a>
## Enum: SettingsTypeEnum
Name | Value
---- | -----
USER_PASSWORD | &quot;USER_PASSWORD&quot;
SAML | &quot;SAML&quot;
LDAP | &quot;LDAP&quot;
OAUTH | &quot;OAUTH&quot;
