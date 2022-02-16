# ResourceGroupFilter

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accountIdentifier** | **String** | Filter by account identifier | 
**orgIdentifier** | **String** | Filter by organization identifier |  [optional]
**projectIdentifier** | **String** | Filter by project identifier |  [optional]
**searchTerm** | **String** | Filter resource group matching by identifier/name |  [optional]
**identifierFilter** | **List&lt;String&gt;** | Filter by resource group identifiers |  [optional]
**resourceSelectorFilterList** | [**List&lt;ResourceSelectorFilter&gt;**](ResourceSelectorFilter.md) | Filter based on whether it has a particular resource |  [optional]
**managedFilter** | [**ManagedFilterEnum**](#ManagedFilterEnum) | Filter based on whether the resource group is Harness managed |  [optional]

<a name="ManagedFilterEnum"></a>
## Enum: ManagedFilterEnum
Name | Value
---- | -----
NO_FILTER | &quot;NO_FILTER&quot;
ONLY_MANAGED | &quot;ONLY_MANAGED&quot;
ONLY_CUSTOM | &quot;ONLY_CUSTOM&quot;
