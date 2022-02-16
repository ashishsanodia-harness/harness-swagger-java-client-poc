# ConnectorInfo

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | Name of the Connector. | 
**identifier** | **String** | Identifier of the Connector. | 
**description** | **String** | Description of the entity |  [optional]
**orgIdentifier** | **String** | Organization Identifier for the Entity |  [optional]
**projectIdentifier** | **String** | Project Identifier for the Entity |  [optional]
**tags** | **Map&lt;String, String&gt;** | Tags |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | Type of the Connector. | 
**spec** | [**ConnectorConfig**](ConnectorConfig.md) |  | 

<a name="TypeEnum"></a>
## Enum: TypeEnum
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
