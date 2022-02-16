# TwoFactorAuthSettingsInfo

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**userId** | **String** |  |  [optional]
**email** | **String** |  |  [optional]
**twoFactorAuthenticationEnabled** | **Boolean** |  |  [optional]
**mechanism** | [**MechanismEnum**](#MechanismEnum) |  |  [optional]
**totpSecretKey** | **String** |  |  [optional]
**totpqrurl** | **String** |  |  [optional]

<a name="MechanismEnum"></a>
## Enum: MechanismEnum
Name | Value
---- | -----
TOTP | &quot;TOTP&quot;
