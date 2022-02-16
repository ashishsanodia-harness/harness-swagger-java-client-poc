# GithubConnector

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**url** | **String** |  | 
**validationRepo** | **String** |  |  [optional]
**authentication** | [**GithubAuthentication**](GithubAuthentication.md) |  | 
**apiAccess** | [**GithubApiAccess**](GithubApiAccess.md) |  |  [optional]
**delegateSelectors** | **List&lt;String&gt;** |  |  [optional]
**executeOnDelegate** | **Boolean** |  |  [optional]
**type** | [**TypeEnum**](#TypeEnum) |  | 

<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
ACCOUNT | &quot;ACCOUNT&quot;
REPO | &quot;REPO&quot;
