# Account

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**identifier** | **String** |  |  [optional]
**name** | **String** |  |  [optional]
**companyName** | **String** |  |  [optional]
**cluster** | **String** |  |  [optional]
**defaultExperience** | [**DefaultExperienceEnum**](#DefaultExperienceEnum) |  |  [optional]
**authenticationMechanism** | [**AuthenticationMechanismEnum**](#AuthenticationMechanismEnum) |  |  [optional]
**serviceAccountConfig** | [**ServiceAccountConfig**](ServiceAccountConfig.md) |  |  [optional]
**nextGenEnabled** | **Boolean** |  |  [optional]

<a name="DefaultExperienceEnum"></a>
## Enum: DefaultExperienceEnum
Name | Value
---- | -----
NG | &quot;NG&quot;
CG | &quot;CG&quot;

<a name="AuthenticationMechanismEnum"></a>
## Enum: AuthenticationMechanismEnum
Name | Value
---- | -----
USER_PASSWORD | &quot;USER_PASSWORD&quot;
SAML | &quot;SAML&quot;
LDAP | &quot;LDAP&quot;
OAUTH | &quot;OAUTH&quot;
