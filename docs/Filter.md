# Filter

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | Name of the Filter. | 
**identifier** | **String** | Identifier of the Filter. | 
**orgIdentifier** | **String** | Organization Identifier for the Entity |  [optional]
**projectIdentifier** | **String** | Project Identifier for the Entity |  [optional]
**filterProperties** | [**FilterProperties**](FilterProperties.md) |  | 
**filterVisibility** | [**FilterVisibilityEnum**](#FilterVisibilityEnum) | This indicates visibility of Filter, by default it is Everyone. |  [optional]

<a name="FilterVisibilityEnum"></a>
## Enum: FilterVisibilityEnum
Name | Value
---- | -----
EVERYONE | &quot;EVERYONE&quot;
ONLY_CREATOR | &quot;ONLY_CREATOR&quot;
