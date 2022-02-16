# AlertThreshold

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**percentage** | **Double** |  |  [optional]
**basedOn** | [**BasedOnEnum**](#BasedOnEnum) | Whether the alert is based on Actual cost or next 30 days Forecasted Cost |  [optional]
**emailAddresses** | **List&lt;String&gt;** |  |  [optional]
**userGroupIds** | **List&lt;String&gt;** |  |  [optional]
**slackWebhooks** | **List&lt;String&gt;** |  |  [optional]
**alertsSent** | **Integer** |  |  [optional]
**crossedAt** | **Long** |  |  [optional]

<a name="BasedOnEnum"></a>
## Enum: BasedOnEnum
Name | Value
---- | -----
ACTUAL_COST | &quot;ACTUAL_COST&quot;
FORECASTED_COST | &quot;FORECASTED_COST&quot;
