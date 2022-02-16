# GitSyncEntityList

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**entityType** | [**EntityTypeEnum**](#EntityTypeEnum) | Entity Type |  [optional]
**count** | **Long** | This is the number of Git Sync entities corresponding to a given entity type |  [optional]
**gitSyncEntities** | [**List&lt;GitSyncEntity&gt;**](GitSyncEntity.md) | This is the list of all the Git Sync entities corresponding to a given entity type |  [optional]

<a name="EntityTypeEnum"></a>
## Enum: EntityTypeEnum
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
