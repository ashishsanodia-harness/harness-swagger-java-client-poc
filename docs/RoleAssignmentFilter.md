# RoleAssignmentFilter

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**resourceGroupFilter** | **List&lt;String&gt;** | Filter role assignments based on resource group identifiers |  [optional]
**roleFilter** | **List&lt;String&gt;** | Filter role assignments based on role identifiers |  [optional]
**principalTypeFilter** | [**List&lt;PrincipalTypeFilterEnum&gt;**](#List&lt;PrincipalTypeFilterEnum&gt;) | Filter role assignments based on principal type |  [optional]
**principalFilter** | [**List&lt;Principal&gt;**](Principal.md) | Filter role assignments based on principals |  [optional]
**harnessManagedFilter** | **List&lt;Boolean&gt;** | Filter role assignments based on role assignments being harness managed |  [optional]
**disabledFilter** | **List&lt;Boolean&gt;** | Filter role assignments based on whether they are enabled or disabled |  [optional]

<a name="List<PrincipalTypeFilterEnum>"></a>
## Enum: List&lt;PrincipalTypeFilterEnum&gt;
Name | Value
---- | -----
USER | &quot;USER&quot;
USER_GROUP | &quot;USER_GROUP&quot;
SERVICE | &quot;SERVICE&quot;
API_KEY | &quot;API_KEY&quot;
SERVICE_ACCOUNT | &quot;SERVICE_ACCOUNT&quot;
