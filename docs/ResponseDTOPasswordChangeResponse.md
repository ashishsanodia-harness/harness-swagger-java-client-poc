# ResponseDTOPasswordChangeResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**StatusEnum**](#StatusEnum) |  |  [optional]
**data** | [**DataEnum**](#DataEnum) |  |  [optional]
**metaData** | **Object** |  |  [optional]
**correlationId** | **String** |  |  [optional]

<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
SUCCESS | &quot;SUCCESS&quot;
FAILURE | &quot;FAILURE&quot;
ERROR | &quot;ERROR&quot;

<a name="DataEnum"></a>
## Enum: DataEnum
Name | Value
---- | -----
PASSWORD_CHANGED | &quot;PASSWORD_CHANGED&quot;
INCORRECT_CURRENT_PASSWORD | &quot;INCORRECT_CURRENT_PASSWORD&quot;
PASSWORD_STRENGTH_VIOLATED | &quot;PASSWORD_STRENGTH_VIOLATED&quot;
