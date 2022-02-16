# SecretResourceFilter

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**identifiers** | **List&lt;String&gt;** | This is the list of Entity Identifiers on which the filter will be applied. |  [optional]
**searchTerm** | **String** | Text to search/filter the Entity. |  [optional]
**secretTypes** | [**List&lt;SecretTypesEnum&gt;**](#List&lt;SecretTypesEnum&gt;) | This is the list of the ENTITY types on which the filter will be applied. |  [optional]
**sourceCategory** | [**SourceCategoryEnum**](#SourceCategoryEnum) |  |  [optional]
**includeSecretsFromEverySubScope** | **Boolean** | This is true if secrets are filtered at every subsequent scope. Otherwise, it is false. |  [optional]

<a name="List<SecretTypesEnum>"></a>
## Enum: List&lt;SecretTypesEnum&gt;
Name | Value
---- | -----
SECRETFILE | &quot;SecretFile&quot;
SECRETTEXT | &quot;SecretText&quot;
SSHKEY | &quot;SSHKey&quot;

<a name="SourceCategoryEnum"></a>
## Enum: SourceCategoryEnum
Name | Value
---- | -----
CLOUD_PROVIDER | &quot;CLOUD_PROVIDER&quot;
SECRET_MANAGER | &quot;SECRET_MANAGER&quot;
CLOUD_COST | &quot;CLOUD_COST&quot;
ARTIFACTORY | &quot;ARTIFACTORY&quot;
CODE_REPO | &quot;CODE_REPO&quot;
MONITORING | &quot;MONITORING&quot;
TICKETING | &quot;TICKETING&quot;
