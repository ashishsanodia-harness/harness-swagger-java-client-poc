# InterruptResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** |  |  [optional]
**type** | [**TypeEnum**](#TypeEnum) |  |  [optional]
**planExecutionId** | **String** |  |  [optional]

<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
ABORTALL | &quot;ABORTALL&quot;
ABORT | &quot;ABORT&quot;
PAUSE | &quot;PAUSE&quot;
RESUME | &quot;RESUME&quot;
IGNORE | &quot;IGNORE&quot;
STAGEROLLBACK | &quot;STAGEROLLBACK&quot;
STEPGROUPROLLBACK | &quot;STEPGROUPROLLBACK&quot;
MARKASSUCCESS | &quot;MARKASSUCCESS&quot;
EXPIREALL | &quot;EXPIREALL&quot;
RETRY | &quot;RETRY&quot;
