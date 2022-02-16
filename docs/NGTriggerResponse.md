# NGTriggerResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** |  |  [optional]
**identifier** | **String** |  |  [optional]
**description** | **String** |  |  [optional]
**type** | [**TypeEnum**](#TypeEnum) |  |  [optional]
**accountIdentifier** | **String** |  |  [optional]
**orgIdentifier** | **String** |  |  [optional]
**projectIdentifier** | **String** |  |  [optional]
**targetIdentifier** | **String** |  |  [optional]
**yaml** | **String** |  |  [optional]
**version** | **Long** |  |  [optional]
**enabled** | **Boolean** |  |  [optional]

<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
WEBHOOK | &quot;WEBHOOK&quot;
ARTIFACT | &quot;ARTIFACT&quot;
MANIFEST | &quot;MANIFEST&quot;
SCHEDULED | &quot;SCHEDULED&quot;
