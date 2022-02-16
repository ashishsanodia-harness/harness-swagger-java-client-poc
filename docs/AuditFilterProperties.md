# AuditFilterProperties

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**scopes** | [**List&lt;ResourcegroupResourceScope&gt;**](ResourcegroupResourceScope.md) | List of Resource Scopes |  [optional]
**resources** | [**List&lt;Resource&gt;**](Resource.md) | List of Resources |  [optional]
**modules** | [**List&lt;ModulesEnum&gt;**](#List&lt;ModulesEnum&gt;) | List of Module Types |  [optional]
**actions** | [**List&lt;ActionsEnum&gt;**](#List&lt;ActionsEnum&gt;) | List of Actions |  [optional]
**environments** | [**List&lt;Environment&gt;**](Environment.md) | List of Environments |  [optional]
**principals** | [**List&lt;ResourcegroupPrincipal&gt;**](ResourcegroupPrincipal.md) | List of Principals |  [optional]
**startTime** | **Long** | Used to specify a start time for retrieving Audit events that occurred at or after the time indicated. |  [optional]
**endTime** | **Long** | Used to specify the end time for retrieving Audit events that occurred at or before the time indicated. |  [optional]
**tags** | **Map&lt;String, String&gt;** | Filter tags as a key-value pair. |  [optional]
**filterType** | [**FilterTypeEnum**](#FilterTypeEnum) | This specifies the corresponding Entity of the filter. |  [optional]

<a name="List<ModulesEnum>"></a>
## Enum: List&lt;ModulesEnum&gt;
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

<a name="List<ActionsEnum>"></a>
## Enum: List&lt;ActionsEnum&gt;
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

<a name="FilterTypeEnum"></a>
## Enum: FilterTypeEnum
Name | Value
---- | -----
CONNECTOR | &quot;CONNECTOR&quot;
DELEGATEPROFILE | &quot;DELEGATEPROFILE&quot;
DELEGATE | &quot;DELEGATE&quot;
PIPELINESETUP | &quot;PIPELINESETUP&quot;
PIPELINEEXECUTION | &quot;PIPELINEEXECUTION&quot;
DEPLOYMENT | &quot;DEPLOYMENT&quot;
AUDIT | &quot;AUDIT&quot;
TEMPLATE | &quot;TEMPLATE&quot;
