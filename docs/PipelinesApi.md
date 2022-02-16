# PipelinesApi

All URIs are relative to *https://app.harness.io/gateway*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createVariables**](PipelinesApi.md#createVariables) | **POST** /pipeline/api/pipelines/variables | Get all the Variables which can be used as expression in the Pipeline.
[**deletePipeline**](PipelinesApi.md#deletePipeline) | **DELETE** /pipeline/api/pipelines/{pipelineIdentifier} | Deletes a Pipeline
[**getExecutionNode**](PipelinesApi.md#getExecutionNode) | **GET** /pipeline/api/pipelines/getExecutionNode | Get the Execution Node by Execution Id
[**getExpandedPipelineJSON**](PipelinesApi.md#getExpandedPipelineJSON) | **GET** /pipeline/api/pipelines/expandedJSON/{pipelineIdentifier} | Gets Pipeline JSON with extra info for some fields
[**getNotificationSchema**](PipelinesApi.md#getNotificationSchema) | **GET** /pipeline/api/pipelines/notification | 
[**getPipeline**](PipelinesApi.md#getPipeline) | **GET** /pipeline/api/pipelines/{pipelineIdentifier} | Gets a Pipeline by identifier
[**getPipelineList**](PipelinesApi.md#getPipelineList) | **POST** /pipeline/api/pipelines/list | List of pipelines
[**getPipelineSummary**](PipelinesApi.md#getPipelineSummary) | **GET** /pipeline/api/pipelines/summary/{pipelineIdentifier} | Gets pipeline summary by pipeline identifier
[**getPmsStepNodes**](PipelinesApi.md#getPmsStepNodes) | **GET** /pipeline/api/pipelines/dummy-pmsSteps-api | 
[**getSteps**](PipelinesApi.md#getSteps) | **GET** /pipeline/api/pipelines/steps | Gets all the Steps for given Category
[**getStepsV2**](PipelinesApi.md#getStepsV2) | **POST** /pipeline/api/pipelines/v2/steps | Gets all the Steps for given Category (V2 Version)
[**getTemplateStepNode**](PipelinesApi.md#getTemplateStepNode) | **GET** /pipeline/api/pipelines/dummy-templateStep-api | 
[**postPipeline**](PipelinesApi.md#postPipeline) | **POST** /pipeline/api/pipelines | Create a Pipeline
[**postPipelineV2**](PipelinesApi.md#postPipelineV2) | **POST** /pipeline/api/pipelines/v2 | Create a Pipeline API (V2 Version)
[**refreshFFCache**](PipelinesApi.md#refreshFFCache) | **GET** /pipeline/api/pipelines/ffCache/refresh | Refresh the feature flag cache
[**updatePipeline**](PipelinesApi.md#updatePipeline) | **PUT** /pipeline/api/pipelines/{pipelineIdentifier} | Update a Pipeline by identifier
[**updatePipelineV2**](PipelinesApi.md#updatePipelineV2) | **PUT** /pipeline/api/pipelines/v2/{pipelineIdentifier} | Updates a Pipeline by identifier (V2 Version)

<a name="createVariables"></a>
# **createVariables**
> ResponseDTOVariableMergeServiceResponse createVariables(body, accountIdentifier, orgIdentifier, projectIdentifier)

Get all the Variables which can be used as expression in the Pipeline.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PipelinesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

PipelinesApi apiInstance = new PipelinesApi();
String body = "body_example"; // String | Pipeline YAML
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the entity.
String orgIdentifier = "orgIdentifier_example"; // String | Organization Identifier for the entity.
String projectIdentifier = "projectIdentifier_example"; // String | Project Identifier for the entity.
try {
    ResponseDTOVariableMergeServiceResponse result = apiInstance.createVariables(body, accountIdentifier, orgIdentifier, projectIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PipelinesApi#createVariables");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**String**](String.md)| Pipeline YAML |
 **accountIdentifier** | **String**| Account Identifier for the entity. |
 **orgIdentifier** | **String**| Organization Identifier for the entity. |
 **projectIdentifier** | **String**| Project Identifier for the entity. |

### Return type

[**ResponseDTOVariableMergeServiceResponse**](ResponseDTOVariableMergeServiceResponse.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json, application/yaml
 - **Accept**: application/json, application/yaml

<a name="deletePipeline"></a>
# **deletePipeline**
> ResponseDTOBoolean deletePipeline(accountIdentifier, orgIdentifier, projectIdentifier, pipelineIdentifier, ifMatch, branch, repoIdentifier, rootFolder, filePath, commitMsg, lastObjectId)

Deletes a Pipeline

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PipelinesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

PipelinesApi apiInstance = new PipelinesApi();
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the entity.
String orgIdentifier = "orgIdentifier_example"; // String | Organization Identifier for the entity.
String projectIdentifier = "projectIdentifier_example"; // String | Project Identifier for the entity.
String pipelineIdentifier = "pipelineIdentifier_example"; // String | Pipeline Identifier
String ifMatch = "ifMatch_example"; // String | Version of entity to match
String branch = "branch_example"; // String | Branch Name
String repoIdentifier = "repoIdentifier_example"; // String | Git Sync Config Id
String rootFolder = "rootFolder_example"; // String | Root Folder Path of the Entity
String filePath = "filePath_example"; // String | File Path of the Entity
String commitMsg = "commitMsg_example"; // String | Commit Message
String lastObjectId = "lastObjectId_example"; // String | Last Object Id
try {
    ResponseDTOBoolean result = apiInstance.deletePipeline(accountIdentifier, orgIdentifier, projectIdentifier, pipelineIdentifier, ifMatch, branch, repoIdentifier, rootFolder, filePath, commitMsg, lastObjectId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PipelinesApi#deletePipeline");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountIdentifier** | **String**| Account Identifier for the entity. |
 **orgIdentifier** | **String**| Organization Identifier for the entity. |
 **projectIdentifier** | **String**| Project Identifier for the entity. |
 **pipelineIdentifier** | **String**| Pipeline Identifier |
 **ifMatch** | **String**| Version of entity to match | [optional]
 **branch** | **String**| Branch Name | [optional]
 **repoIdentifier** | **String**| Git Sync Config Id | [optional]
 **rootFolder** | **String**| Root Folder Path of the Entity | [optional]
 **filePath** | **String**| File Path of the Entity | [optional]
 **commitMsg** | **String**| Commit Message | [optional]
 **lastObjectId** | **String**| Last Object Id | [optional]

### Return type

[**ResponseDTOBoolean**](ResponseDTOBoolean.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/yaml

<a name="getExecutionNode"></a>
# **getExecutionNode**
> ResponseDTOExecutionNode getExecutionNode(accountIdentifier, orgIdentifier, projectIdentifier, nodeExecutionId)

Get the Execution Node by Execution Id

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PipelinesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

PipelinesApi apiInstance = new PipelinesApi();
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the entity.
String orgIdentifier = "orgIdentifier_example"; // String | Organization Identifier for the entity.
String projectIdentifier = "projectIdentifier_example"; // String | Project Identifier for the entity.
String nodeExecutionId = "nodeExecutionId_example"; // String | Id for the corresponding Node Execution
try {
    ResponseDTOExecutionNode result = apiInstance.getExecutionNode(accountIdentifier, orgIdentifier, projectIdentifier, nodeExecutionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PipelinesApi#getExecutionNode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountIdentifier** | **String**| Account Identifier for the entity. |
 **orgIdentifier** | **String**| Organization Identifier for the entity. |
 **projectIdentifier** | **String**| Project Identifier for the entity. |
 **nodeExecutionId** | **String**| Id for the corresponding Node Execution |

### Return type

[**ResponseDTOExecutionNode**](ResponseDTOExecutionNode.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/yaml

<a name="getExpandedPipelineJSON"></a>
# **getExpandedPipelineJSON**
> ResponseDTOPipelineExpandedJson getExpandedPipelineJSON(accountIdentifier, orgIdentifier, projectIdentifier, pipelineIdentifier, branch, repoIdentifier, getDefaultFromOtherRepo)

Gets Pipeline JSON with extra info for some fields

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PipelinesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

PipelinesApi apiInstance = new PipelinesApi();
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the entity.
String orgIdentifier = "orgIdentifier_example"; // String | Organization Identifier for the entity.
String projectIdentifier = "projectIdentifier_example"; // String | Project Identifier for the entity.
String pipelineIdentifier = "pipelineIdentifier_example"; // String | Pipeline Identifier
String branch = "branch_example"; // String | Branch Name
String repoIdentifier = "repoIdentifier_example"; // String | Git Sync Config Id
Boolean getDefaultFromOtherRepo = true; // Boolean | if true, return all the default entities
try {
    ResponseDTOPipelineExpandedJson result = apiInstance.getExpandedPipelineJSON(accountIdentifier, orgIdentifier, projectIdentifier, pipelineIdentifier, branch, repoIdentifier, getDefaultFromOtherRepo);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PipelinesApi#getExpandedPipelineJSON");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountIdentifier** | **String**| Account Identifier for the entity. |
 **orgIdentifier** | **String**| Organization Identifier for the entity. |
 **projectIdentifier** | **String**| Project Identifier for the entity. |
 **pipelineIdentifier** | **String**| Pipeline Identifier |
 **branch** | **String**| Branch Name | [optional]
 **repoIdentifier** | **String**| Git Sync Config Id | [optional]
 **getDefaultFromOtherRepo** | **Boolean**| if true, return all the default entities | [optional]

### Return type

[**ResponseDTOPipelineExpandedJson**](ResponseDTOPipelineExpandedJson.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/yaml

<a name="getNotificationSchema"></a>
# **getNotificationSchema**
> getNotificationSchema()



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PipelinesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

PipelinesApi apiInstance = new PipelinesApi();
try {
    apiInstance.getNotificationSchema();
} catch (ApiException e) {
    System.err.println("Exception when calling PipelinesApi#getNotificationSchema");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/yaml

<a name="getPipeline"></a>
# **getPipeline**
> ResponseDTOPMSPipelineResponse getPipeline(accountIdentifier, orgIdentifier, projectIdentifier, pipelineIdentifier, branch, repoIdentifier, getDefaultFromOtherRepo)

Gets a Pipeline by identifier

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PipelinesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

PipelinesApi apiInstance = new PipelinesApi();
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the entity.
String orgIdentifier = "orgIdentifier_example"; // String | Organization Identifier for the entity.
String projectIdentifier = "projectIdentifier_example"; // String | Project Identifier for the entity.
String pipelineIdentifier = "pipelineIdentifier_example"; // String | Pipeline Identifier
String branch = "branch_example"; // String | Branch Name
String repoIdentifier = "repoIdentifier_example"; // String | Git Sync Config Id
Boolean getDefaultFromOtherRepo = true; // Boolean | if true, return all the default entities
try {
    ResponseDTOPMSPipelineResponse result = apiInstance.getPipeline(accountIdentifier, orgIdentifier, projectIdentifier, pipelineIdentifier, branch, repoIdentifier, getDefaultFromOtherRepo);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PipelinesApi#getPipeline");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountIdentifier** | **String**| Account Identifier for the entity. |
 **orgIdentifier** | **String**| Organization Identifier for the entity. |
 **projectIdentifier** | **String**| Project Identifier for the entity. |
 **pipelineIdentifier** | **String**| Pipeline Identifier |
 **branch** | **String**| Branch Name | [optional]
 **repoIdentifier** | **String**| Git Sync Config Id | [optional]
 **getDefaultFromOtherRepo** | **Boolean**| if true, return all the default entities | [optional]

### Return type

[**ResponseDTOPMSPipelineResponse**](ResponseDTOPMSPipelineResponse.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/yaml

<a name="getPipelineList"></a>
# **getPipelineList**
> ResponseDTOPagePMSPipelineSummaryResponse getPipelineList(accountIdentifier, orgIdentifier, projectIdentifier, body, page, size, sort, searchTerm, module, filterIdentifier, branch, repoIdentifier, getDefaultFromOtherRepo, getDistinctFromBranches)

List of pipelines

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PipelinesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

PipelinesApi apiInstance = new PipelinesApi();
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the entity.
String orgIdentifier = "orgIdentifier_example"; // String | Organization Identifier for the entity.
String projectIdentifier = "projectIdentifier_example"; // String | Project Identifier for the entity.
FilterProperties body = new FilterProperties(); // FilterProperties | This is the body for the filter properties for listing pipelines.
Integer page = 0; // Integer | Indicates the number of pages. Results for these pages will be retrieved.
Integer size = 25; // Integer | The number of the elements to fetch
List<String> sort = Arrays.asList("sort_example"); // List<String> | Sort criteria for the elements.
String searchTerm = "searchTerm_example"; // String | Search term to filter out pipelines based on pipeline name, identifier, tags.
String module = "module_example"; // String | 
String filterIdentifier = "filterIdentifier_example"; // String | 
String branch = "branch_example"; // String | Branch Name
String repoIdentifier = "repoIdentifier_example"; // String | Git Sync Config Id
Boolean getDefaultFromOtherRepo = true; // Boolean | if true, return all the default entities
Boolean getDistinctFromBranches = true; // Boolean | Boolean flag to get distinct pipelines from all branches.
try {
    ResponseDTOPagePMSPipelineSummaryResponse result = apiInstance.getPipelineList(accountIdentifier, orgIdentifier, projectIdentifier, body, page, size, sort, searchTerm, module, filterIdentifier, branch, repoIdentifier, getDefaultFromOtherRepo, getDistinctFromBranches);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PipelinesApi#getPipelineList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountIdentifier** | **String**| Account Identifier for the entity. |
 **orgIdentifier** | **String**| Organization Identifier for the entity. |
 **projectIdentifier** | **String**| Project Identifier for the entity. |
 **body** | [**FilterProperties**](FilterProperties.md)| This is the body for the filter properties for listing pipelines. | [optional]
 **page** | **Integer**| Indicates the number of pages. Results for these pages will be retrieved. | [optional] [default to 0]
 **size** | **Integer**| The number of the elements to fetch | [optional] [default to 25]
 **sort** | [**List&lt;String&gt;**](String.md)| Sort criteria for the elements. | [optional]
 **searchTerm** | **String**| Search term to filter out pipelines based on pipeline name, identifier, tags. | [optional]
 **module** | **String**|  | [optional]
 **filterIdentifier** | **String**|  | [optional]
 **branch** | **String**| Branch Name | [optional]
 **repoIdentifier** | **String**| Git Sync Config Id | [optional]
 **getDefaultFromOtherRepo** | **Boolean**| if true, return all the default entities | [optional]
 **getDistinctFromBranches** | **Boolean**| Boolean flag to get distinct pipelines from all branches. | [optional]

### Return type

[**ResponseDTOPagePMSPipelineSummaryResponse**](ResponseDTOPagePMSPipelineSummaryResponse.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json, application/yaml
 - **Accept**: application/json, application/yaml

<a name="getPipelineSummary"></a>
# **getPipelineSummary**
> ResponseDTOPMSPipelineSummaryResponse getPipelineSummary(accountIdentifier, orgIdentifier, projectIdentifier, pipelineIdentifier, branch, repoIdentifier, getDefaultFromOtherRepo)

Gets pipeline summary by pipeline identifier

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PipelinesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

PipelinesApi apiInstance = new PipelinesApi();
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the entity.
String orgIdentifier = "orgIdentifier_example"; // String | Organization Identifier for the entity.
String projectIdentifier = "projectIdentifier_example"; // String | Project Identifier for the entity.
String pipelineIdentifier = "pipelineIdentifier_example"; // String | Pipeline Identifier
String branch = "branch_example"; // String | Branch Name
String repoIdentifier = "repoIdentifier_example"; // String | Git Sync Config Id
Boolean getDefaultFromOtherRepo = true; // Boolean | if true, return all the default entities
try {
    ResponseDTOPMSPipelineSummaryResponse result = apiInstance.getPipelineSummary(accountIdentifier, orgIdentifier, projectIdentifier, pipelineIdentifier, branch, repoIdentifier, getDefaultFromOtherRepo);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PipelinesApi#getPipelineSummary");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountIdentifier** | **String**| Account Identifier for the entity. |
 **orgIdentifier** | **String**| Organization Identifier for the entity. |
 **projectIdentifier** | **String**| Project Identifier for the entity. |
 **pipelineIdentifier** | **String**| Pipeline Identifier |
 **branch** | **String**| Branch Name | [optional]
 **repoIdentifier** | **String**| Git Sync Config Id | [optional]
 **getDefaultFromOtherRepo** | **Boolean**| if true, return all the default entities | [optional]

### Return type

[**ResponseDTOPMSPipelineSummaryResponse**](ResponseDTOPMSPipelineSummaryResponse.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/yaml

<a name="getPmsStepNodes"></a>
# **getPmsStepNodes**
> getPmsStepNodes()



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PipelinesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

PipelinesApi apiInstance = new PipelinesApi();
try {
    apiInstance.getPmsStepNodes();
} catch (ApiException e) {
    System.err.println("Exception when calling PipelinesApi#getPmsStepNodes");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/yaml

<a name="getSteps"></a>
# **getSteps**
> ResponseDTOStepCategory getSteps(category, module, accountId)

Gets all the Steps for given Category

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PipelinesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

PipelinesApi apiInstance = new PipelinesApi();
String category = "category_example"; // String | Step Category for which you needs all its steps
String module = "module_example"; // String | Module of the step to which it belongs
String accountId = "accountId_example"; // String | Account Identifier for the entity.
try {
    ResponseDTOStepCategory result = apiInstance.getSteps(category, module, accountId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PipelinesApi#getSteps");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **category** | **String**| Step Category for which you needs all its steps |
 **module** | **String**| Module of the step to which it belongs |
 **accountId** | **String**| Account Identifier for the entity. | [optional]

### Return type

[**ResponseDTOStepCategory**](ResponseDTOStepCategory.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/yaml

<a name="getStepsV2"></a>
# **getStepsV2**
> ResponseDTOStepCategory getStepsV2(body, accountId)

Gets all the Steps for given Category (V2 Version)

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PipelinesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

PipelinesApi apiInstance = new PipelinesApi();
StepPalleteFilterWrapper body = new StepPalleteFilterWrapper(); // StepPalleteFilterWrapper | Step Pallete Filter request body
String accountId = "accountId_example"; // String | Account Identifier for the entity.
try {
    ResponseDTOStepCategory result = apiInstance.getStepsV2(body, accountId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PipelinesApi#getStepsV2");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**StepPalleteFilterWrapper**](StepPalleteFilterWrapper.md)| Step Pallete Filter request body |
 **accountId** | **String**| Account Identifier for the entity. |

### Return type

[**ResponseDTOStepCategory**](ResponseDTOStepCategory.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json, application/yaml
 - **Accept**: application/json, application/yaml

<a name="getTemplateStepNode"></a>
# **getTemplateStepNode**
> getTemplateStepNode()



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PipelinesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

PipelinesApi apiInstance = new PipelinesApi();
try {
    apiInstance.getTemplateStepNode();
} catch (ApiException e) {
    System.err.println("Exception when calling PipelinesApi#getTemplateStepNode");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/yaml

<a name="postPipeline"></a>
# **postPipeline**
> ResponseDTOString postPipeline(body, accountIdentifier, orgIdentifier, projectIdentifier, branch, repoIdentifier, rootFolder, filePath, commitMsg, isNewBranch, baseBranch)

Create a Pipeline

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PipelinesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

PipelinesApi apiInstance = new PipelinesApi();
String body = "body_example"; // String | Pipeline YAML
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the entity.
String orgIdentifier = "orgIdentifier_example"; // String | Organization Identifier for the entity.
String projectIdentifier = "projectIdentifier_example"; // String | Project Identifier for the entity.
String branch = "branch_example"; // String | Branch Name
String repoIdentifier = "repoIdentifier_example"; // String | Git Sync Config Id
String rootFolder = "rootFolder_example"; // String | Root Folder Path of the Entity
String filePath = "filePath_example"; // String | File Path of the Entity
String commitMsg = "commitMsg_example"; // String | File Path of the Entity
Boolean isNewBranch = false; // Boolean | Checks the new branch
String baseBranch = "baseBranch_example"; // String | Default Branch
try {
    ResponseDTOString result = apiInstance.postPipeline(body, accountIdentifier, orgIdentifier, projectIdentifier, branch, repoIdentifier, rootFolder, filePath, commitMsg, isNewBranch, baseBranch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PipelinesApi#postPipeline");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**String**](String.md)| Pipeline YAML |
 **accountIdentifier** | **String**| Account Identifier for the entity. |
 **orgIdentifier** | **String**| Organization Identifier for the entity. |
 **projectIdentifier** | **String**| Project Identifier for the entity. |
 **branch** | **String**| Branch Name | [optional]
 **repoIdentifier** | **String**| Git Sync Config Id | [optional]
 **rootFolder** | **String**| Root Folder Path of the Entity | [optional]
 **filePath** | **String**| File Path of the Entity | [optional]
 **commitMsg** | **String**| File Path of the Entity | [optional]
 **isNewBranch** | **Boolean**| Checks the new branch | [optional] [default to false]
 **baseBranch** | **String**| Default Branch | [optional]

### Return type

[**ResponseDTOString**](ResponseDTOString.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json, application/yaml
 - **Accept**: application/json, application/yaml

<a name="postPipelineV2"></a>
# **postPipelineV2**
> ResponseDTOPipelineSaveResponse postPipelineV2(body, accountIdentifier, orgIdentifier, projectIdentifier, branch, repoIdentifier, rootFolder, filePath, commitMsg, isNewBranch, baseBranch)

Create a Pipeline API (V2 Version)

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PipelinesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

PipelinesApi apiInstance = new PipelinesApi();
String body = "body_example"; // String | Pipeline YAML
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the entity.
String orgIdentifier = "orgIdentifier_example"; // String | Organization Identifier for the entity.
String projectIdentifier = "projectIdentifier_example"; // String | Project Identifier for the entity.
String branch = "branch_example"; // String | Branch Name
String repoIdentifier = "repoIdentifier_example"; // String | Git Sync Config Id
String rootFolder = "rootFolder_example"; // String | Root Folder Path of the Entity
String filePath = "filePath_example"; // String | File Path of the Entity
String commitMsg = "commitMsg_example"; // String | File Path of the Entity
Boolean isNewBranch = false; // Boolean | Checks the new branch
String baseBranch = "baseBranch_example"; // String | Default Branch
try {
    ResponseDTOPipelineSaveResponse result = apiInstance.postPipelineV2(body, accountIdentifier, orgIdentifier, projectIdentifier, branch, repoIdentifier, rootFolder, filePath, commitMsg, isNewBranch, baseBranch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PipelinesApi#postPipelineV2");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**String**](String.md)| Pipeline YAML |
 **accountIdentifier** | **String**| Account Identifier for the entity. |
 **orgIdentifier** | **String**| Organization Identifier for the entity. |
 **projectIdentifier** | **String**| Project Identifier for the entity. |
 **branch** | **String**| Branch Name | [optional]
 **repoIdentifier** | **String**| Git Sync Config Id | [optional]
 **rootFolder** | **String**| Root Folder Path of the Entity | [optional]
 **filePath** | **String**| File Path of the Entity | [optional]
 **commitMsg** | **String**| File Path of the Entity | [optional]
 **isNewBranch** | **Boolean**| Checks the new branch | [optional] [default to false]
 **baseBranch** | **String**| Default Branch | [optional]

### Return type

[**ResponseDTOPipelineSaveResponse**](ResponseDTOPipelineSaveResponse.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json, application/yaml
 - **Accept**: application/json, application/yaml

<a name="refreshFFCache"></a>
# **refreshFFCache**
> ResponseDTOBoolean refreshFFCache(accountIdentifier)

Refresh the feature flag cache

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PipelinesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

PipelinesApi apiInstance = new PipelinesApi();
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the entity.
try {
    ResponseDTOBoolean result = apiInstance.refreshFFCache(accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PipelinesApi#refreshFFCache");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountIdentifier** | **String**| Account Identifier for the entity. |

### Return type

[**ResponseDTOBoolean**](ResponseDTOBoolean.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/yaml

<a name="updatePipeline"></a>
# **updatePipeline**
> ResponseDTOString updatePipeline(body, accountIdentifier, orgIdentifier, projectIdentifier, pipelineIdentifier, ifMatch, branch, repoIdentifier, rootFolder, filePath, commitMsg, lastObjectId, baseBranch)

Update a Pipeline by identifier

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PipelinesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

PipelinesApi apiInstance = new PipelinesApi();
String body = "body_example"; // String | Pipeline YAML to be updated
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the entity.
String orgIdentifier = "orgIdentifier_example"; // String | Organization Identifier for the entity.
String projectIdentifier = "projectIdentifier_example"; // String | Project Identifier for the entity.
String pipelineIdentifier = "pipelineIdentifier_example"; // String | Pipeline Identifier
String ifMatch = "ifMatch_example"; // String | Version of entity to match
String branch = "branch_example"; // String | Branch Name
String repoIdentifier = "repoIdentifier_example"; // String | Git Sync Config Id
String rootFolder = "rootFolder_example"; // String | Root Folder Path of the Entity
String filePath = "filePath_example"; // String | Root Folder Path of the Entity
String commitMsg = "commitMsg_example"; // String | Commit Message
String lastObjectId = "lastObjectId_example"; // String | Last Object Id
String baseBranch = "baseBranch_example"; // String | Default Branch
try {
    ResponseDTOString result = apiInstance.updatePipeline(body, accountIdentifier, orgIdentifier, projectIdentifier, pipelineIdentifier, ifMatch, branch, repoIdentifier, rootFolder, filePath, commitMsg, lastObjectId, baseBranch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PipelinesApi#updatePipeline");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**String**](String.md)| Pipeline YAML to be updated |
 **accountIdentifier** | **String**| Account Identifier for the entity. |
 **orgIdentifier** | **String**| Organization Identifier for the entity. |
 **projectIdentifier** | **String**| Project Identifier for the entity. |
 **pipelineIdentifier** | **String**| Pipeline Identifier |
 **ifMatch** | **String**| Version of entity to match | [optional]
 **branch** | **String**| Branch Name | [optional]
 **repoIdentifier** | **String**| Git Sync Config Id | [optional]
 **rootFolder** | **String**| Root Folder Path of the Entity | [optional]
 **filePath** | **String**| Root Folder Path of the Entity | [optional]
 **commitMsg** | **String**| Commit Message | [optional]
 **lastObjectId** | **String**| Last Object Id | [optional]
 **baseBranch** | **String**| Default Branch | [optional]

### Return type

[**ResponseDTOString**](ResponseDTOString.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json, application/yaml
 - **Accept**: application/json, application/yaml

<a name="updatePipelineV2"></a>
# **updatePipelineV2**
> ResponseDTOPipelineSaveResponse updatePipelineV2(body, accountIdentifier, orgIdentifier, projectIdentifier, pipelineIdentifier, ifMatch, branch, repoIdentifier, rootFolder, filePath, commitMsg, lastObjectId, baseBranch)

Updates a Pipeline by identifier (V2 Version)

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PipelinesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

PipelinesApi apiInstance = new PipelinesApi();
String body = "body_example"; // String | Pipeline YAML to be updated
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the entity.
String orgIdentifier = "orgIdentifier_example"; // String | Organization Identifier for the entity.
String projectIdentifier = "projectIdentifier_example"; // String | Project Identifier for the entity.
String pipelineIdentifier = "pipelineIdentifier_example"; // String | Pipeline Identifier
String ifMatch = "ifMatch_example"; // String | Version of entity to match
String branch = "branch_example"; // String | Branch Name
String repoIdentifier = "repoIdentifier_example"; // String | Git Sync Config Id
String rootFolder = "rootFolder_example"; // String | Root Folder Path of the Entity
String filePath = "filePath_example"; // String | Root Folder Path of the Entity
String commitMsg = "commitMsg_example"; // String | Commit Message
String lastObjectId = "lastObjectId_example"; // String | Last Object Id
String baseBranch = "baseBranch_example"; // String | Default Branch
try {
    ResponseDTOPipelineSaveResponse result = apiInstance.updatePipelineV2(body, accountIdentifier, orgIdentifier, projectIdentifier, pipelineIdentifier, ifMatch, branch, repoIdentifier, rootFolder, filePath, commitMsg, lastObjectId, baseBranch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PipelinesApi#updatePipelineV2");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**String**](String.md)| Pipeline YAML to be updated |
 **accountIdentifier** | **String**| Account Identifier for the entity. |
 **orgIdentifier** | **String**| Organization Identifier for the entity. |
 **projectIdentifier** | **String**| Project Identifier for the entity. |
 **pipelineIdentifier** | **String**| Pipeline Identifier |
 **ifMatch** | **String**| Version of entity to match | [optional]
 **branch** | **String**| Branch Name | [optional]
 **repoIdentifier** | **String**| Git Sync Config Id | [optional]
 **rootFolder** | **String**| Root Folder Path of the Entity | [optional]
 **filePath** | **String**| Root Folder Path of the Entity | [optional]
 **commitMsg** | **String**| Commit Message | [optional]
 **lastObjectId** | **String**| Last Object Id | [optional]
 **baseBranch** | **String**| Default Branch | [optional]

### Return type

[**ResponseDTOPipelineSaveResponse**](ResponseDTOPipelineSaveResponse.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json, application/yaml
 - **Accept**: application/json, application/yaml

