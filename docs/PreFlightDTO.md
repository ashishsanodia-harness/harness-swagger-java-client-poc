# PreFlightDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pipelineInputWrapperResponse** | [**PipelineWrapperResponse**](PipelineWrapperResponse.md) |  |  [optional]
**connectorWrapperResponse** | [**ConnectorWrapperResponse**](ConnectorWrapperResponse.md) |  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) |  |  [optional]
**errorInfo** | [**PreFlightErrorInfo**](PreFlightErrorInfo.md) |  |  [optional]

<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
SUCCESS | &quot;SUCCESS&quot;
FAILURE | &quot;FAILURE&quot;
IN_PROGRESS | &quot;IN_PROGRESS&quot;
UNKNOWN | &quot;UNKNOWN&quot;
