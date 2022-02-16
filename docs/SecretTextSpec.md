# SecretTextSpec

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**secretManagerIdentifier** | **String** | Identifier of the Secret Manager used to manage the secret. | 
**valueType** | [**ValueTypeEnum**](#ValueTypeEnum) | This has details to specify if the secret value is inline or referenced. | 
**value** | **String** | Value of the Secret |  [optional]

<a name="ValueTypeEnum"></a>
## Enum: ValueTypeEnum
Name | Value
---- | -----
INLINE | &quot;Inline&quot;
REFERENCE | &quot;Reference&quot;
