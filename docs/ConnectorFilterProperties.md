# ConnectorFilterProperties

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**connectorNames** | **List&lt;String&gt;** | This is the list of the Connector names on which the filter will be applied. |  [optional]
**connectorIdentifiers** | **List&lt;String&gt;** | This is the list of the Connector identifiers on which the filter will be applied. |  [optional]
**description** | **String** | Description of filter created. |  [optional]
**types** | [**List&lt;TypesEnum&gt;**](#List&lt;TypesEnum&gt;) | This is the list of the Connector types on which the filter will be applied. |  [optional]
**categories** | [**List&lt;CategoriesEnum&gt;**](#List&lt;CategoriesEnum&gt;) | This is the list of the Connector category on which the filter will be applied. |  [optional]
**connectivityStatuses** | [**List&lt;ConnectivityStatusesEnum&gt;**](#List&lt;ConnectivityStatusesEnum&gt;) | This is the list of the Connector status on which the filter will be applied. |  [optional]
**inheritingCredentialsFromDelegate** | **Boolean** | Boolean value to indicate if the Connector is using credentials from the Delegate to connect. |  [optional]
**ccmConnectorFilter** | [**CcmConnectorFilter**](CcmConnectorFilter.md) |  |  [optional]
**tags** | **Map&lt;String, String&gt;** | Filter tags as a key-value pair. |  [optional]
**filterType** | [**FilterTypeEnum**](#FilterTypeEnum) | This specifies the corresponding Entity of the filter. |  [optional]

<a name="List<TypesEnum>"></a>
## Enum: List&lt;TypesEnum&gt;
Name | Value
---- | -----
K8SCLUSTER | &quot;K8sCluster&quot;
GIT | &quot;Git&quot;
SPLUNK | &quot;Splunk&quot;
APPDYNAMICS | &quot;AppDynamics&quot;
PROMETHEUS | &quot;Prometheus&quot;
DYNATRACE | &quot;Dynatrace&quot;
VAULT | &quot;Vault&quot;
AZUREKEYVAULT | &quot;AzureKeyVault&quot;
DOCKERREGISTRY | &quot;DockerRegistry&quot;
LOCAL | &quot;Local&quot;
AWSKMS | &quot;AwsKms&quot;
GCPKMS | &quot;GcpKms&quot;
AWSSECRETMANAGER | &quot;AwsSecretManager&quot;
GCP | &quot;Gcp&quot;
AWS | &quot;Aws&quot;
ARTIFACTORY | &quot;Artifactory&quot;
JIRA | &quot;Jira&quot;
NEXUS | &quot;Nexus&quot;
GITHUB | &quot;Github&quot;
GITLAB | &quot;Gitlab&quot;
BITBUCKET | &quot;Bitbucket&quot;
CODECOMMIT | &quot;Codecommit&quot;
CEAWS | &quot;CEAws&quot;
CEAZURE | &quot;CEAzure&quot;
GCPCLOUDCOST | &quot;GcpCloudCost&quot;
CEK8SCLUSTER | &quot;CEK8sCluster&quot;
HTTPHELMREPO | &quot;HttpHelmRepo&quot;
NEWRELIC | &quot;NewRelic&quot;
DATADOG | &quot;Datadog&quot;
SUMOLOGIC | &quot;SumoLogic&quot;
PAGERDUTY | &quot;PagerDuty&quot;
CUSTOMHEALTH | &quot;CustomHealth&quot;
SERVICENOW | &quot;ServiceNow&quot;
ERRORTRACKING | &quot;ErrorTracking&quot;

<a name="List<CategoriesEnum>"></a>
## Enum: List&lt;CategoriesEnum&gt;
Name | Value
---- | -----
CLOUD_PROVIDER | &quot;CLOUD_PROVIDER&quot;
SECRET_MANAGER | &quot;SECRET_MANAGER&quot;
CLOUD_COST | &quot;CLOUD_COST&quot;
ARTIFACTORY | &quot;ARTIFACTORY&quot;
CODE_REPO | &quot;CODE_REPO&quot;
MONITORING | &quot;MONITORING&quot;
TICKETING | &quot;TICKETING&quot;

<a name="List<ConnectivityStatusesEnum>"></a>
## Enum: List&lt;ConnectivityStatusesEnum&gt;
Name | Value
---- | -----
SUCCESS | &quot;SUCCESS&quot;
FAILURE | &quot;FAILURE&quot;
PARTIAL | &quot;PARTIAL&quot;
UNKNOWN | &quot;UNKNOWN&quot;

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
