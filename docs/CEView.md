# CEView

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**uuid** | **String** |  |  [optional]
**name** | **String** |  |  [optional]
**accountId** | **String** |  |  [optional]
**viewVersion** | **String** |  |  [optional]
**viewTimeRange** | [**ViewTimeRange**](ViewTimeRange.md) |  |  [optional]
**viewRules** | [**List&lt;ViewRule&gt;**](ViewRule.md) |  |  [optional]
**dataSources** | [**List&lt;DataSourcesEnum&gt;**](#List&lt;DataSourcesEnum&gt;) |  |  [optional]
**viewVisualization** | [**ViewVisualization**](ViewVisualization.md) |  |  [optional]
**viewType** | [**ViewTypeEnum**](#ViewTypeEnum) |  |  [optional]
**viewState** | [**ViewStateEnum**](#ViewStateEnum) |  |  [optional]
**totalCost** | **Double** |  |  [optional]
**createdAt** | **Long** |  |  [optional]
**lastUpdatedAt** | **Long** |  |  [optional]
**createdBy** | [**EmbeddedUser**](EmbeddedUser.md) |  |  [optional]
**lastUpdatedBy** | [**EmbeddedUser**](EmbeddedUser.md) |  |  [optional]

<a name="List<DataSourcesEnum>"></a>
## Enum: List&lt;DataSourcesEnum&gt;
Name | Value
---- | -----
CLUSTER | &quot;CLUSTER&quot;
AWS | &quot;AWS&quot;
GCP | &quot;GCP&quot;
AZURE | &quot;AZURE&quot;
COMMON | &quot;COMMON&quot;
CUSTOM | &quot;CUSTOM&quot;
BUSINESS_MAPPING | &quot;BUSINESS_MAPPING&quot;
LABEL | &quot;LABEL&quot;

<a name="ViewTypeEnum"></a>
## Enum: ViewTypeEnum
Name | Value
---- | -----
SAMPLE | &quot;SAMPLE&quot;
CUSTOMER | &quot;CUSTOMER&quot;
DEFAULT_AZURE | &quot;DEFAULT_AZURE&quot;
DEFAULT | &quot;DEFAULT&quot;

<a name="ViewStateEnum"></a>
## Enum: ViewStateEnum
Name | Value
---- | -----
DRAFT | &quot;DRAFT&quot;
COMPLETED | &quot;COMPLETED&quot;
