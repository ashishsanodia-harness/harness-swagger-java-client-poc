# CreateInvite

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**users** | **List&lt;String&gt;** |  |  [optional]
**roleBindings** | [**List&lt;RoleBinding&gt;**](RoleBinding.md) |  |  [optional]
**inviteType** | [**InviteTypeEnum**](#InviteTypeEnum) |  |  [optional]
**userGroups** | **List&lt;String&gt;** |  |  [optional]

<a name="InviteTypeEnum"></a>
## Enum: InviteTypeEnum
Name | Value
---- | -----
USER_INITIATED_INVITE | &quot;USER_INITIATED_INVITE&quot;
ADMIN_INITIATED_INVITE | &quot;ADMIN_INITIATED_INVITE&quot;
SCIM_INITIATED_INVITE | &quot;SCIM_INITIATED_INVITE&quot;
