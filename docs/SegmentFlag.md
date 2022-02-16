# SegmentFlag

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**description** | **String** | A description of the feature flag |  [optional]
**environment** | **String** | The environment identifier for the feature flag | 
**identifier** | **String** | The identifier of the feature flag | 
**name** | **String** | The name of the feature flag | 
**project** | **String** | The project identifier for the feature flag | 
**type** | [**TypeEnum**](#TypeEnum) | How the the flag has been included, either directly or via a custom rule | 
**variation** | **String** | The identifier for the variation of the flag that should be served to members of the group | 

<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
DIRECT | &quot;DIRECT&quot;
CONDITION | &quot;CONDITION&quot;
