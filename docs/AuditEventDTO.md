# AuditEventDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**auditId** | **String** |  |  [optional]
**insertId** | **String** |  | 
**resourceScope** | [**ResourcegroupResourceScope**](ResourcegroupResourceScope.md) |  | 
**httpRequestInfo** | [**HttpRequestInfo**](HttpRequestInfo.md) |  |  [optional]
**requestMetadata** | [**RequestMetadata**](RequestMetadata.md) |  |  [optional]
**timestamp** | **Long** |  | 
**authenticationInfo** | [**AuthenticationInfoDTO**](AuthenticationInfoDTO.md) |  | 
**module** | [**ModuleEnum**](#ModuleEnum) |  | 
**environment** | [**Environment**](Environment.md) |  |  [optional]
**resource** | [**Resource**](Resource.md) |  | 
**yamlDiffRecord** | [**YamlDiffRecordDTO**](YamlDiffRecordDTO.md) |  |  [optional]
**action** | [**ActionEnum**](#ActionEnum) |  | 
**auditEventData** | [**AuditEventData**](AuditEventData.md) |  |  [optional]
**internalInfo** | **Map&lt;String, String&gt;** |  |  [optional]

<a name="ModuleEnum"></a>
## Enum: ModuleEnum
Name | Value
---- | -----
CD | &quot;CD&quot;
CI | &quot;CI&quot;
CV | &quot;CV&quot;
CF | &quot;CF&quot;
CE | &quot;CE&quot;
CORE | &quot;CORE&quot;
PMS | &quot;PMS&quot;
TEMPLATESERVICE | &quot;TEMPLATESERVICE&quot;

<a name="ActionEnum"></a>
## Enum: ActionEnum
Name | Value
---- | -----
CREATE | &quot;CREATE&quot;
UPDATE | &quot;UPDATE&quot;
RESTORE | &quot;RESTORE&quot;
DELETE | &quot;DELETE&quot;
UPSERT | &quot;UPSERT&quot;
INVITE | &quot;INVITE&quot;
RESEND_INVITE | &quot;RESEND_INVITE&quot;
REVOKE_INVITE | &quot;REVOKE_INVITE&quot;
ADD_COLLABORATOR | &quot;ADD_COLLABORATOR&quot;
REMOVE_COLLABORATOR | &quot;REMOVE_COLLABORATOR&quot;
REVOKE_TOKEN | &quot;REVOKE_TOKEN&quot;
LOGIN | &quot;LOGIN&quot;
LOGIN2FA | &quot;LOGIN2FA&quot;
UNSUCCESSFUL_LOGIN | &quot;UNSUCCESSFUL_LOGIN&quot;
ADD_MEMBERSHIP | &quot;ADD_MEMBERSHIP&quot;
REMOVE_MEMBERSHIP | &quot;REMOVE_MEMBERSHIP&quot;
