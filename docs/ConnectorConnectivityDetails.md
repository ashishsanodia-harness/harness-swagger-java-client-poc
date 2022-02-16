# ConnectorConnectivityDetails

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**StatusEnum**](#StatusEnum) | Connectivity status of a Connector. |  [optional]
**errorSummary** | **String** | Summary of errors. |  [optional]
**errors** | [**List&lt;ErrorDetail&gt;**](ErrorDetail.md) | List of errors and their details. |  [optional]
**testedAt** | **Long** | Time at which Test Connection was completed  |  [optional]
**lastTestedAt** | **Long** |  |  [optional]
**lastConnectedAt** | **Long** | This is the last time at which the Connector was successfully connected. |  [optional]

<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
SUCCESS | &quot;SUCCESS&quot;
FAILURE | &quot;FAILURE&quot;
PARTIAL | &quot;PARTIAL&quot;
UNKNOWN | &quot;UNKNOWN&quot;
