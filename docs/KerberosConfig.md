# KerberosConfig

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**principal** | **String** | This is the authorization role, the user/service has in the realm. | 
**realm** | **String** | Name of the Realm. | 
**tgtGenerationMethod** | [**TgtGenerationMethodEnum**](#TgtGenerationMethodEnum) |  |  [optional]
**spec** | [**TGTGenerationSpecDTO**](TGTGenerationSpecDTO.md) |  |  [optional]

<a name="TgtGenerationMethodEnum"></a>
## Enum: TgtGenerationMethodEnum
Name | Value
---- | -----
KEYTABFILEPATH | &quot;KeyTabFilePath&quot;
PASSWORD | &quot;Password&quot;
