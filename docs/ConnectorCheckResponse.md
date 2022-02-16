# ConnectorCheckResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**connectorIdentifier** | **String** |  |  [optional]
**errorInfo** | [**PreFlightEntityErrorInfo**](PreFlightEntityErrorInfo.md) |  |  [optional]
**fqn** | **String** |  |  [optional]
**stageName** | **String** |  |  [optional]
**stageIdentifier** | **String** |  |  [optional]
**stepName** | **String** |  |  [optional]
**stepIdentifier** | **String** |  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) |  |  [optional]

<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
SUCCESS | &quot;SUCCESS&quot;
FAILURE | &quot;FAILURE&quot;
IN_PROGRESS | &quot;IN_PROGRESS&quot;
UNKNOWN | &quot;UNKNOWN&quot;
