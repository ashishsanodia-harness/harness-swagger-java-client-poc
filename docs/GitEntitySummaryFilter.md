# GitEntitySummaryFilter

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**moduleType** | [**ModuleTypeEnum**](#ModuleTypeEnum) | Module Type |  [optional]
**gitSyncConfigIdentifiers** | **List&lt;String&gt;** | List of Git Sync Config Ids |  [optional]
**entityTypes** | [**List&lt;EntityTypesEnum&gt;**](#List&lt;EntityTypesEnum&gt;) | List of Entity Types |  [optional]
**searchTerm** | **String** | Search Term |  [optional]

<a name="ModuleTypeEnum"></a>
## Enum: ModuleTypeEnum
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

<a name="List<EntityTypesEnum>"></a>
## Enum: List&lt;EntityTypesEnum&gt;
Name | Value
---- | -----
PROJECTS | &quot;Projects&quot;
PIPELINES | &quot;Pipelines&quot;
PIPELINESTEPS | &quot;PipelineSteps&quot;
HTTP | &quot;Http&quot;
JIRACREATE | &quot;JiraCreate&quot;
JIRAUPDATE | &quot;JiraUpdate&quot;
JIRAAPPROVAL | &quot;JiraApproval&quot;
HARNESSAPPROVAL | &quot;HarnessApproval&quot;
BARRIER | &quot;Barrier&quot;
SHELLSCRIPT | &quot;ShellScript&quot;
K8SCANARYDEPLOY | &quot;K8sCanaryDeploy&quot;
CONNECTORS | &quot;Connectors&quot;
SECRETS | &quot;Secrets&quot;
SERVICE | &quot;Service&quot;
ENVIRONMENT | &quot;Environment&quot;
INPUTSETS | &quot;InputSets&quot;
CVCONFIG | &quot;CvConfig&quot;
VERIFY | &quot;Verify&quot;
DELEGATES | &quot;Delegates&quot;
DELEGATECONFIGURATIONS | &quot;DelegateConfigurations&quot;
CVVERIFICATIONJOB | &quot;CvVerificationJob&quot;
INTEGRATIONSTAGE | &quot;IntegrationStage&quot;
INTEGRATIONSTEPS | &quot;IntegrationSteps&quot;
CVKUBERNETESACTIVITYSOURCE | &quot;CvKubernetesActivitySource&quot;
DEPLOYMENTSTEPS | &quot;DeploymentSteps&quot;
DEPLOYMENTSTAGE | &quot;DeploymentStage&quot;
APPROVALSTAGE | &quot;ApprovalStage&quot;
FEATUREFLAGSTAGE | &quot;FeatureFlagStage&quot;
TEMPLATE | &quot;Template&quot;
TRIGGERS | &quot;Triggers&quot;
MONITOREDSERVICE | &quot;MonitoredService&quot;
GITREPOSITORIES | &quot;GitRepositories&quot;
FEATUREFLAGS | &quot;FeatureFlags&quot;
SERVICENOWAPPROVAL | &quot;ServiceNowApproval&quot;
