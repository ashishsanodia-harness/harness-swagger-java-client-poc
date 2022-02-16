# ConnectorCatalogueItem

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**category** | [**CategoryEnum**](#CategoryEnum) | Category of this Connector. |  [optional]
**connectors** | [**List&lt;ConnectorsEnum&gt;**](#List&lt;ConnectorsEnum&gt;) | List of Connector types corresponding to a specific category. |  [optional]

<a name="CategoryEnum"></a>
## Enum: CategoryEnum
Name | Value
---- | -----
CLOUD_PROVIDER | &quot;CLOUD_PROVIDER&quot;
SECRET_MANAGER | &quot;SECRET_MANAGER&quot;
CLOUD_COST | &quot;CLOUD_COST&quot;
ARTIFACTORY | &quot;ARTIFACTORY&quot;
CODE_REPO | &quot;CODE_REPO&quot;
MONITORING | &quot;MONITORING&quot;
TICKETING | &quot;TICKETING&quot;

<a name="List<ConnectorsEnum>"></a>
## Enum: List&lt;ConnectorsEnum&gt;
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
