# FilterProperties

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**tags** | **Map&lt;String, String&gt;** | Filter tags as a key-value pair. |  [optional]
**filterType** | [**FilterTypeEnum**](#FilterTypeEnum) | This specifies the corresponding Entity of the filter. |  [optional]

<a name="FilterTypeEnum"></a>
## Enum: FilterTypeEnum
Name | Value
---- | -----
CONNECTOR | &quot;CONNECTOR&quot;
DELEGATEPROFILE | &quot;DELEGATEPROFILE&quot;
DELEGATE | &quot;DELEGATE&quot;
PIPELINESETUP | &quot;PIPELINESETUP&quot;
PIPELINEEXECUTION | &quot;PIPELINEEXECUTION&quot;
DEPLOYMENT | &quot;DEPLOYMENT&quot;
AUDIT | &quot;AUDIT&quot;
TEMPLATE | &quot;TEMPLATE&quot;
