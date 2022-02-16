# ConnectorValidationResult

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**StatusEnum**](#StatusEnum) | Connectivity status of a Connector. |  [optional]
**errors** | [**List&lt;ErrorDetail&gt;**](ErrorDetail.md) | List of errors and their details. |  [optional]
**errorSummary** | **String** | Summary of errors. |  [optional]
**testedAt** | **Long** | Time at which Test Connection was completed  |  [optional]
**delegateId** | **String** | ID of Delegate on which Test Connection is executed. |  [optional]

<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
SUCCESS | &quot;SUCCESS&quot;
FAILURE | &quot;FAILURE&quot;
PARTIAL | &quot;PARTIAL&quot;
UNKNOWN | &quot;UNKNOWN&quot;
