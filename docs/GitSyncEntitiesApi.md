# GitSyncEntitiesApi

All URIs are relative to *https://app.harness.io/gateway*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listGitSyncEntitiesByType**](GitSyncEntitiesApi.md#listGitSyncEntitiesByType) | **GET** /ng/api/git-sync-entities/{entityType} | Lists Git Sync Entity filtered by their Type for the given scope
[**listGitSyncEntitiesSummaryForRepoAndBranch**](GitSyncEntitiesApi.md#listGitSyncEntitiesSummaryForRepoAndBranch) | **POST** /ng/api/git-sync-entities/branch/{branch} | Lists Git Sync Entity by product for the given Repo, Branch and list of Entity Types
[**listGitSyncEntitiesSummaryForRepoAndTypes**](GitSyncEntitiesApi.md#listGitSyncEntitiesSummaryForRepoAndTypes) | **POST** /ng/api/git-sync-entities/summary | Lists Git Sync Entity by product for the given list of Repos and Entity Types

<a name="listGitSyncEntitiesByType"></a>
# **listGitSyncEntitiesByType**
> ResponseDTOPageResponseGitSyncEntityList listGitSyncEntitiesByType(entityType, projectIdentifier, orgIdentifier, accountIdentifier, gitSyncConfigId, branch, page, size, moduleType)

Lists Git Sync Entity filtered by their Type for the given scope

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.GitSyncEntitiesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

GitSyncEntitiesApi apiInstance = new GitSyncEntitiesApi();
String entityType = "entityType_example"; // String | Entity Type
String projectIdentifier = "projectIdentifier_example"; // String | Project Identifier for the Entity
String orgIdentifier = "orgIdentifier_example"; // String | Organization Identifier for the Entity
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the Entity
String gitSyncConfigId = "gitSyncConfigId_example"; // String | Git Sync Config Id
String branch = "branch_example"; // String | Branch Name
Integer page = 0; // Integer | Indicates the number of pages. Results for these pages will be retrieved.
Integer size = 56; // Integer | The number of the elements to fetch
String moduleType = "moduleType_example"; // String | Module Type
try {
    ResponseDTOPageResponseGitSyncEntityList result = apiInstance.listGitSyncEntitiesByType(entityType, projectIdentifier, orgIdentifier, accountIdentifier, gitSyncConfigId, branch, page, size, moduleType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GitSyncEntitiesApi#listGitSyncEntitiesByType");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **entityType** | **String**| Entity Type | [enum: Projects, Pipelines, PipelineSteps, Http, JiraCreate, JiraUpdate, JiraApproval, HarnessApproval, Barrier, ShellScript, K8sCanaryDeploy, Connectors, Secrets, Service, Environment, InputSets, CvConfig, Verify, Delegates, DelegateConfigurations, CvVerificationJob, IntegrationStage, IntegrationSteps, CvKubernetesActivitySource, DeploymentSteps, DeploymentStage, ApprovalStage, FeatureFlagStage, Template, Triggers, MonitoredService, GitRepositories, FeatureFlags, ServiceNowApproval]
 **projectIdentifier** | **String**| Project Identifier for the Entity | [optional]
 **orgIdentifier** | **String**| Organization Identifier for the Entity | [optional]
 **accountIdentifier** | **String**| Account Identifier for the Entity | [optional]
 **gitSyncConfigId** | **String**| Git Sync Config Id | [optional]
 **branch** | **String**| Branch Name | [optional]
 **page** | **Integer**| Indicates the number of pages. Results for these pages will be retrieved. | [optional] [default to 0]
 **size** | **Integer**| The number of the elements to fetch | [optional]
 **moduleType** | **String**| Module Type | [optional]

### Return type

[**ResponseDTOPageResponseGitSyncEntityList**](ResponseDTOPageResponseGitSyncEntityList.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/yaml, text/yaml, text/html

<a name="listGitSyncEntitiesSummaryForRepoAndBranch"></a>
# **listGitSyncEntitiesSummaryForRepoAndBranch**
> ResponseDTOListGitSyncEntityList listGitSyncEntitiesSummaryForRepoAndBranch(body, branch, projectIdentifier, orgIdentifier, accountIdentifier, size, gitSyncConfigId)

Lists Git Sync Entity by product for the given Repo, Branch and list of Entity Types

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.GitSyncEntitiesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

GitSyncEntitiesApi apiInstance = new GitSyncEntitiesApi();
GitEntityBranchSummaryFilter body = new GitEntityBranchSummaryFilter(); // GitEntityBranchSummaryFilter | This filters the Git Sync Entity based on multiple parameters
String branch = "branch_example"; // String | Branch Name
String projectIdentifier = "projectIdentifier_example"; // String | Project Identifier for the Entity
String orgIdentifier = "orgIdentifier_example"; // String | Organization Identifier for the Entity
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the Entity
Integer size = 56; // Integer | The number of the elements to fetch
String gitSyncConfigId = "gitSyncConfigId_example"; // String | Git Sync Config Id
try {
    ResponseDTOListGitSyncEntityList result = apiInstance.listGitSyncEntitiesSummaryForRepoAndBranch(body, branch, projectIdentifier, orgIdentifier, accountIdentifier, size, gitSyncConfigId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GitSyncEntitiesApi#listGitSyncEntitiesSummaryForRepoAndBranch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**GitEntityBranchSummaryFilter**](GitEntityBranchSummaryFilter.md)| This filters the Git Sync Entity based on multiple parameters |
 **branch** | **String**| Branch Name |
 **projectIdentifier** | **String**| Project Identifier for the Entity | [optional]
 **orgIdentifier** | **String**| Organization Identifier for the Entity | [optional]
 **accountIdentifier** | **String**| Account Identifier for the Entity | [optional]
 **size** | **Integer**| The number of the elements to fetch | [optional]
 **gitSyncConfigId** | **String**| Git Sync Config Id | [optional]

### Return type

[**ResponseDTOListGitSyncEntityList**](ResponseDTOListGitSyncEntityList.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json, text/yaml, text/html
 - **Accept**: application/json, application/yaml, text/yaml, text/html

<a name="listGitSyncEntitiesSummaryForRepoAndTypes"></a>
# **listGitSyncEntitiesSummaryForRepoAndTypes**
> ResponseDTOGitSyncRepoFilesList listGitSyncEntitiesSummaryForRepoAndTypes(body, projectIdentifier, orgIdentifier, accountIdentifier, size)

Lists Git Sync Entity by product for the given list of Repos and Entity Types

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.GitSyncEntitiesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

GitSyncEntitiesApi apiInstance = new GitSyncEntitiesApi();
GitEntitySummaryFilter body = new GitEntitySummaryFilter(); // GitEntitySummaryFilter | Filter Git Sync Entity based on multiple parameters
String projectIdentifier = "projectIdentifier_example"; // String | Project Identifier for the Entity
String orgIdentifier = "orgIdentifier_example"; // String | Organization Identifier for the Entity
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the Entity
Integer size = 56; // Integer | The number of the elements to fetch
try {
    ResponseDTOGitSyncRepoFilesList result = apiInstance.listGitSyncEntitiesSummaryForRepoAndTypes(body, projectIdentifier, orgIdentifier, accountIdentifier, size);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GitSyncEntitiesApi#listGitSyncEntitiesSummaryForRepoAndTypes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**GitEntitySummaryFilter**](GitEntitySummaryFilter.md)| Filter Git Sync Entity based on multiple parameters |
 **projectIdentifier** | **String**| Project Identifier for the Entity | [optional]
 **orgIdentifier** | **String**| Organization Identifier for the Entity | [optional]
 **accountIdentifier** | **String**| Account Identifier for the Entity | [optional]
 **size** | **Integer**| The number of the elements to fetch | [optional]

### Return type

[**ResponseDTOGitSyncRepoFilesList**](ResponseDTOGitSyncRepoFilesList.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json, text/yaml, text/html
 - **Accept**: application/json, application/yaml, text/yaml, text/html

