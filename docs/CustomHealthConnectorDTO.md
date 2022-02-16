# CustomHealthConnectorDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**baseURL** | **String** |  | 
**headers** | [**List&lt;CustomHealthKeyAndValue&gt;**](CustomHealthKeyAndValue.md) |  |  [optional]
**params** | [**List&lt;CustomHealthKeyAndValue&gt;**](CustomHealthKeyAndValue.md) |  |  [optional]
**method** | [**MethodEnum**](#MethodEnum) |  | 
**validationBody** | **String** |  |  [optional]
**validationPath** | **String** |  |  [optional]
**delegateSelectors** | **List&lt;String&gt;** |  |  [optional]

<a name="MethodEnum"></a>
## Enum: MethodEnum
Name | Value
---- | -----
GET | &quot;GET&quot;
POST | &quot;POST&quot;
