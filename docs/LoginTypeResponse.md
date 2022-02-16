# LoginTypeResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**authenticationMechanism** | [**AuthenticationMechanismEnum**](#AuthenticationMechanismEnum) |  |  [optional]
**ssORequest** | [**SSORequest**](SSORequest.md) |  |  [optional]
**isOauthEnabled** | **Boolean** |  |  [optional]
**showCaptcha** | **Boolean** |  |  [optional]
**defaultExperience** | [**DefaultExperienceEnum**](#DefaultExperienceEnum) |  |  [optional]
**oauthEnabled** | **Boolean** |  |  [optional]
**ssorequest** | [**SSORequest**](SSORequest.md) |  |  [optional]

<a name="AuthenticationMechanismEnum"></a>
## Enum: AuthenticationMechanismEnum
Name | Value
---- | -----
USER_PASSWORD | &quot;USER_PASSWORD&quot;
SAML | &quot;SAML&quot;
LDAP | &quot;LDAP&quot;
OAUTH | &quot;OAUTH&quot;

<a name="DefaultExperienceEnum"></a>
## Enum: DefaultExperienceEnum
Name | Value
---- | -----
NG | &quot;NG&quot;
CG | &quot;CG&quot;
