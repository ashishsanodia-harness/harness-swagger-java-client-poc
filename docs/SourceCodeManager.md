# SourceCodeManager

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Source Code Manager Identifier |  [optional]
**userIdentifier** | **String** | Id of the User |  [optional]
**accountIdentifier** | **String** | Account Identifier for the Entity |  [optional]
**name** | **String** | Name of Source Code Manager | 
**createdAt** | **Long** | Time at which this Source Code Manager was created |  [optional]
**lastModifiedAt** | **Long** | Time at which this Source Code Manager was last Updated |  [optional]
**authentication** | [**SourceCodeManagerAuthentication**](SourceCodeManagerAuthentication.md) |  |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | Type of SCM |  [optional]

<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
BITBUCKET | &quot;BITBUCKET&quot;
GITHUB | &quot;GITHUB&quot;
GITLAB | &quot;GITLAB&quot;
AWS_CODE_COMMIT | &quot;AWS_CODE_COMMIT&quot;
AZURE_DEV_OPS | &quot;AZURE_DEV_OPS&quot;
