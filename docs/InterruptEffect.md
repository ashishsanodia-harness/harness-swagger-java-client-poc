# InterruptEffect

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**interruptId** | **String** |  | 
**tookEffectAt** | **Long** |  | 
**interruptType** | [**InterruptTypeEnum**](#InterruptTypeEnum) |  | 
**interruptConfig** | [**InterruptConfig**](InterruptConfig.md) |  | 

<a name="InterruptTypeEnum"></a>
## Enum: InterruptTypeEnum
Name | Value
---- | -----
UNKNOWN | &quot;UNKNOWN&quot;
ABORT | &quot;ABORT&quot;
ABORT_ALL | &quot;ABORT_ALL&quot;
PAUSE | &quot;PAUSE&quot;
PAUSE_ALL | &quot;PAUSE_ALL&quot;
RESUME | &quot;RESUME&quot;
RESUME_ALL | &quot;RESUME_ALL&quot;
RETRY | &quot;RETRY&quot;
IGNORE | &quot;IGNORE&quot;
WAITING_FOR_MANUAL_INTERVENTION | &quot;WAITING_FOR_MANUAL_INTERVENTION&quot;
MARK_FAILED | &quot;MARK_FAILED&quot;
MARK_SUCCESS | &quot;MARK_SUCCESS&quot;
NEXT_STEP | &quot;NEXT_STEP&quot;
END_EXECUTION | &quot;END_EXECUTION&quot;
MARK_EXPIRED | &quot;MARK_EXPIRED&quot;
CUSTOM_FAILURE | &quot;CUSTOM_FAILURE&quot;
EXPIRE_ALL | &quot;EXPIRE_ALL&quot;
UNRECOGNIZED | &quot;UNRECOGNIZED&quot;
