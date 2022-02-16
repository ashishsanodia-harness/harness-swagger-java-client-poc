# AwsSecretManagerCredential

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**TypeEnum**](#TypeEnum) | This indicates AWS credential types, Manual Credential, Assume IAM Role, Assume STS Role. | 
**spec** | [**AwsSecretManagerCredentialSpec**](AwsSecretManagerCredentialSpec.md) |  |  [optional]

<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
ASSUMEIAMROLE | &quot;AssumeIAMRole&quot;
ASSUMESTSROLE | &quot;AssumeSTSRole&quot;
MANUALCONFIG | &quot;ManualConfig&quot;
