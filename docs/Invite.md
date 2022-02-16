# Invite

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**encryptionType** | [**EncryptionTypeEnum**](#EncryptionTypeEnum) |  | 
**orgIdentifier** | **String** |  |  [optional]
**projectIdentifier** | **String** |  |  [optional]
**identifier** | **String** |  | 
**spec** | [**SecretManagerMetadataRequestSpecDTO**](SecretManagerMetadataRequestSpecDTO.md) |  | 

<a name="EncryptionTypeEnum"></a>
## Enum: EncryptionTypeEnum
Name | Value
---- | -----
LOCAL | &quot;LOCAL&quot;
KMS | &quot;KMS&quot;
GCP_KMS | &quot;GCP_KMS&quot;
AWS_SECRETS_MANAGER | &quot;AWS_SECRETS_MANAGER&quot;
AZURE_VAULT | &quot;AZURE_VAULT&quot;
CYBERARK | &quot;CYBERARK&quot;
VAULT | &quot;VAULT&quot;
GCP_SECRETS_MANAGER | &quot;GCP_SECRETS_MANAGER&quot;
CUSTOM | &quot;CUSTOM&quot;
VAULT_SSH | &quot;VAULT_SSH&quot;
