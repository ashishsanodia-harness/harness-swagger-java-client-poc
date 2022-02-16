# UserFilter

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**searchTerm** | **String** | This string will be used to filter the results. Details of all the users having this string in their name or email address will be filtered. |  [optional]
**identifiers** | **List&lt;String&gt;** | Filter by User Identifiers |  [optional]
**parentFilter** | [**ParentFilterEnum**](#ParentFilterEnum) |  |  [optional]

<a name="ParentFilterEnum"></a>
## Enum: ParentFilterEnum
Name | Value
---- | -----
NO_PARENT_SCOPES | &quot;NO_PARENT_SCOPES&quot;
INCLUDE_PARENT_SCOPES | &quot;INCLUDE_PARENT_SCOPES&quot;
STRICTLY_PARENT_SCOPES | &quot;STRICTLY_PARENT_SCOPES&quot;
