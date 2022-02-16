# Permission

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**identifier** | **String** |  |  [optional]
**name** | **String** |  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) |  |  [optional]
**includeInAllRoles** | **Boolean** |  |  [optional]
**allowedScopeLevels** | **List&lt;String&gt;** |  |  [optional]
**resourceType** | **String** |  |  [optional]
**action** | **String** |  |  [optional]

<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
STAGING | &quot;STAGING&quot;
EXPERIMENTAL | &quot;EXPERIMENTAL&quot;
ACTIVE | &quot;ACTIVE&quot;
DEPRECATED | &quot;DEPRECATED&quot;
INACTIVE | &quot;INACTIVE&quot;
