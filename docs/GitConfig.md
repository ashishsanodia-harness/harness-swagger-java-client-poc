# GitConfig

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**url** | **String** |  | 
**validationRepo** | **String** |  |  [optional]
**branchName** | **String** |  |  [optional]
**delegateSelectors** | **List&lt;String&gt;** |  |  [optional]
**executeOnDelegate** | **Boolean** |  |  [optional]
**type** | [**TypeEnum**](#TypeEnum) |  | 
**connectionType** | [**ConnectionTypeEnum**](#ConnectionTypeEnum) |  | 
**spec** | [**GitAuthentication**](GitAuthentication.md) |  | 

<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
HTTP | &quot;Http&quot;
SSH | &quot;Ssh&quot;

<a name="ConnectionTypeEnum"></a>
## Enum: ConnectionTypeEnum
Name | Value
---- | -----
ACCOUNT | &quot;ACCOUNT&quot;
REPO | &quot;REPO&quot;
