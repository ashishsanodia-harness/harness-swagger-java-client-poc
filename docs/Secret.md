# Secret

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**TypeEnum**](#TypeEnum) | This specifies the type of secret | 
**name** | **String** | Name of the Secret | 
**identifier** | **String** | Identifier of the Secret | 
**orgIdentifier** | **String** | Organization Identifier for the Entity |  [optional]
**projectIdentifier** | **String** | Project Identifier for the Entity |  [optional]
**tags** | **Map&lt;String, String&gt;** | Tags |  [optional]
**description** | **String** | Description of the Secret |  [optional]
**spec** | [**SecretSpec**](SecretSpec.md) |  | 

<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
SECRETFILE | &quot;SecretFile&quot;
SECRETTEXT | &quot;SecretText&quot;
SSHKEY | &quot;SSHKey&quot;
