# Budget

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**uuid** | **String** |  |  [optional]
**accountId** | **String** |  |  [optional]
**name** | **String** |  |  [optional]
**scope** | [**BudgetScope**](BudgetScope.md) |  |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | Whether the Budget is based on a specified amount or based on previous month&#x27;s actual spend |  [optional]
**budgetAmount** | **Double** |  |  [optional]
**period** | [**PeriodEnum**](#PeriodEnum) |  |  [optional]
**growthRate** | **Double** |  |  [optional]
**actualCost** | **Double** |  |  [optional]
**forecastCost** | **Double** |  |  [optional]
**lastMonthCost** | **Double** |  |  [optional]
**alertThresholds** | [**List&lt;AlertThreshold&gt;**](AlertThreshold.md) |  |  [optional]
**emailAddresses** | **List&lt;String&gt;** |  |  [optional]
**userGroupIds** | **List&lt;String&gt;** |  |  [optional]
**notifyOnSlack** | **Boolean** |  |  [optional]
**isNgBudget** | **Boolean** |  |  [optional]
**startTime** | **Long** |  |  [optional]
**endTime** | **Long** |  |  [optional]
**createdAt** | **Long** |  |  [optional]
**lastUpdatedAt** | **Long** |  |  [optional]
**ngBudget** | **Boolean** |  |  [optional]

<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
SPECIFIED_AMOUNT | &quot;SPECIFIED_AMOUNT&quot;
PREVIOUS_MONTH_SPEND | &quot;PREVIOUS_MONTH_SPEND&quot;
PREVIOUS_PERIOD_SPEND | &quot;PREVIOUS_PERIOD_SPEND&quot;

<a name="PeriodEnum"></a>
## Enum: PeriodEnum
Name | Value
---- | -----
DAILY | &quot;DAILY&quot;
WEEKLY | &quot;WEEKLY&quot;
MONTHLY | &quot;MONTHLY&quot;
QUARTERLY | &quot;QUARTERLY&quot;
YEARLY | &quot;YEARLY&quot;
