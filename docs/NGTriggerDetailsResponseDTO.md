# NGTriggerDetailsResponseDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** |  |  [optional]
**identifier** | **String** |  |  [optional]
**description** | **String** |  |  [optional]
**type** | [**TypeEnum**](#TypeEnum) |  |  [optional]
**triggerStatus** | [**TriggerStatus**](TriggerStatus.md) |  |  [optional]
**lastTriggerExecutionDetails** | [**LastTriggerExecutionDetails**](LastTriggerExecutionDetails.md) |  |  [optional]
**webhookDetails** | [**WebhookDetails**](WebhookDetails.md) |  |  [optional]
**buildDetails** | [**BuildDetails**](BuildDetails.md) |  |  [optional]
**tags** | **Map&lt;String, String&gt;** |  |  [optional]
**executions** | **List&lt;Integer&gt;** |  |  [optional]
**yaml** | **String** |  |  [optional]
**webhookUrl** | **String** |  |  [optional]
**registrationStatus** | [**RegistrationStatusEnum**](#RegistrationStatusEnum) |  |  [optional]
**enabled** | **Boolean** |  |  [optional]

<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
WEBHOOK | &quot;WEBHOOK&quot;
ARTIFACT | &quot;ARTIFACT&quot;
MANIFEST | &quot;MANIFEST&quot;
SCHEDULED | &quot;SCHEDULED&quot;

<a name="RegistrationStatusEnum"></a>
## Enum: RegistrationStatusEnum
Name | Value
---- | -----
SUCCESS | &quot;SUCCESS&quot;
FAILED | &quot;FAILED&quot;
ERROR | &quot;ERROR&quot;
TIMEOUT | &quot;TIMEOUT&quot;
UNAVAILABLE | &quot;UNAVAILABLE&quot;
