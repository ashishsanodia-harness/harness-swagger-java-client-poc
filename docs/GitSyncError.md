# GitSyncError

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accountIdentifier** | **String** | Account Identifier for the Entity |  [optional]
**repoUrl** | **String** | Repo URL |  [optional]
**repoId** | **String** | Git Sync Config Id |  [optional]
**branchName** | **String** | Branch Name |  [optional]
**scopes** | [**List&lt;Scope&gt;**](Scope.md) | List of scope of the Git Sync Error |  [optional]
**changeType** | [**ChangeTypeEnum**](#ChangeTypeEnum) | Type of operation done in file |  [optional]
**completeFilePath** | **String** | Complete File Path of the Entity |  [optional]
**entityType** | [**EntityTypeEnum**](#EntityTypeEnum) | Entity Type |  [optional]
**failureReason** | **String** | Error Message |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | Status of Git Sync Error |  [optional]
**errorType** | [**ErrorTypeEnum**](#ErrorTypeEnum) | Type of Git Sync Error |  [optional]
**additionalErrorDetails** | [**GitSyncErrorDetails**](GitSyncErrorDetails.md) |  |  [optional]
**createdAt** | **Long** | Time at which the Git Sync error was logged |  [optional]

<a name="ChangeTypeEnum"></a>
## Enum: ChangeTypeEnum
Name | Value
---- | -----
ADD | &quot;ADD&quot;
RENAME | &quot;RENAME&quot;
MODIFY | &quot;MODIFY&quot;
DELETE | &quot;DELETE&quot;
NONE | &quot;NONE&quot;

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

<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
ACTIVE | &quot;ACTIVE&quot;
DISCARDED | &quot;DISCARDED&quot;
EXPIRED | &quot;EXPIRED&quot;
RESOLVED | &quot;RESOLVED&quot;
OVERRIDDEN | &quot;OVERRIDDEN&quot;

<a name="ErrorTypeEnum"></a>
## Enum: ErrorTypeEnum
Name | Value
---- | -----
GIT_TO_HARNESS | &quot;GIT_TO_HARNESS&quot;
CONNECTIVITY_ISSUE | &quot;CONNECTIVITY_ISSUE&quot;
FULL_SYNC | &quot;FULL_SYNC&quot;
