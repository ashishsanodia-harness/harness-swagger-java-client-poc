# ExecutionDetailsApi

All URIs are relative to *https://app.harness.io/gateway*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getExecutionDetail**](ExecutionDetailsApi.md#getExecutionDetail) | **GET** /pipeline/api/pipelines/execution/{planExecutionId} | Get the Pipeline Execution details for given PlanExecution Id
[**getInputsetYaml**](ExecutionDetailsApi.md#getInputsetYaml) | **GET** /pipeline/api/pipelines/execution/{planExecutionId}/inputset | Get the Input Set YAML used for given Plan Execution
[**getInputsetYamlV2**](ExecutionDetailsApi.md#getInputsetYamlV2) | **GET** /pipeline/api/pipelines/execution/{planExecutionId}/inputsetV2 | Get the Input Set YAML used for given Plan Execution
[**getListOfExecutions**](ExecutionDetailsApi.md#getListOfExecutions) | **POST** /pipeline/api/pipelines/execution/summary | Gets list of Executions of Pipelines for specific filters.

<a name="getExecutionDetail"></a>
# **getExecutionDetail**
> ResponseDTOPipelineExecutionDetail getExecutionDetail(accountIdentifier, orgIdentifier, projectIdentifier, planExecutionId, stageNodeId)

Get the Pipeline Execution details for given PlanExecution Id

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ExecutionDetailsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

ExecutionDetailsApi apiInstance = new ExecutionDetailsApi();
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the entity.
String orgIdentifier = "orgIdentifier_example"; // String | Organization Identifier for the entity.
String projectIdentifier = "projectIdentifier_example"; // String | Project Identifier for the entity.
String planExecutionId = "planExecutionId_example"; // String | Plan Execution Id for which we want to get the Execution details
String stageNodeId = "stageNodeId_example"; // String | Stage Node Identifier to get execution stats.
try {
    ResponseDTOPipelineExecutionDetail result = apiInstance.getExecutionDetail(accountIdentifier, orgIdentifier, projectIdentifier, planExecutionId, stageNodeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExecutionDetailsApi#getExecutionDetail");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountIdentifier** | **String**| Account Identifier for the entity. |
 **orgIdentifier** | **String**| Organization Identifier for the entity. |
 **projectIdentifier** | **String**| Project Identifier for the entity. |
 **planExecutionId** | **String**| Plan Execution Id for which we want to get the Execution details |
 **stageNodeId** | **String**| Stage Node Identifier to get execution stats. | [optional]

### Return type

[**ResponseDTOPipelineExecutionDetail**](ResponseDTOPipelineExecutionDetail.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/yaml

<a name="getInputsetYaml"></a>
# **getInputsetYaml**
> String getInputsetYaml(accountIdentifier, orgIdentifier, projectIdentifier, planExecutionId, resolveExpressions)

Get the Input Set YAML used for given Plan Execution

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ExecutionDetailsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

ExecutionDetailsApi apiInstance = new ExecutionDetailsApi();
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the entity.
String orgIdentifier = "orgIdentifier_example"; // String | Organization Identifier for the entity.
String projectIdentifier = "projectIdentifier_example"; // String | Project Identifier for the entity.
String planExecutionId = "planExecutionId_example"; // String | Plan Execution Id for which we want to get the Input Set YAML
Boolean resolveExpressions = false; // Boolean | 
try {
    String result = apiInstance.getInputsetYaml(accountIdentifier, orgIdentifier, projectIdentifier, planExecutionId, resolveExpressions);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExecutionDetailsApi#getInputsetYaml");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountIdentifier** | **String**| Account Identifier for the entity. |
 **orgIdentifier** | **String**| Organization Identifier for the entity. |
 **projectIdentifier** | **String**| Project Identifier for the entity. |
 **planExecutionId** | **String**| Plan Execution Id for which we want to get the Input Set YAML |
 **resolveExpressions** | **Boolean**|  | [optional] [default to false]

### Return type

**String**

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/yaml

<a name="getInputsetYamlV2"></a>
# **getInputsetYamlV2**
> ResponseDTOInputSetTemplateResponse getInputsetYamlV2(accountIdentifier, orgIdentifier, projectIdentifier, planExecutionId, resolveExpressions)

Get the Input Set YAML used for given Plan Execution

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ExecutionDetailsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

ExecutionDetailsApi apiInstance = new ExecutionDetailsApi();
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the entity.
String orgIdentifier = "orgIdentifier_example"; // String | Organization Identifier for the entity.
String projectIdentifier = "projectIdentifier_example"; // String | Project Identifier for the entity.
String planExecutionId = "planExecutionId_example"; // String | Plan Execution Id for which we want to get the Input Set YAML
Boolean resolveExpressions = false; // Boolean | 
try {
    ResponseDTOInputSetTemplateResponse result = apiInstance.getInputsetYamlV2(accountIdentifier, orgIdentifier, projectIdentifier, planExecutionId, resolveExpressions);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExecutionDetailsApi#getInputsetYamlV2");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountIdentifier** | **String**| Account Identifier for the entity. |
 **orgIdentifier** | **String**| Organization Identifier for the entity. |
 **projectIdentifier** | **String**| Project Identifier for the entity. |
 **planExecutionId** | **String**| Plan Execution Id for which we want to get the Input Set YAML |
 **resolveExpressions** | **Boolean**|  | [optional] [default to false]

### Return type

[**ResponseDTOInputSetTemplateResponse**](ResponseDTOInputSetTemplateResponse.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/yaml

<a name="getListOfExecutions"></a>
# **getListOfExecutions**
> ResponseDTOPagePipelineExecutionSummary getListOfExecutions(accountIdentifier, orgIdentifier, projectIdentifier, body, searchTerm, pipelineIdentifier, page, size, sort, filterIdentifier, module, status, myDeployments, branch, repoIdentifier, getDefaultFromOtherRepo)

Gets list of Executions of Pipelines for specific filters.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ExecutionDetailsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

ExecutionDetailsApi apiInstance = new ExecutionDetailsApi();
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the entity.
String orgIdentifier = "orgIdentifier_example"; // String | Organization Identifier for the entity.
String projectIdentifier = "projectIdentifier_example"; // String | Project Identifier for the entity.
FilterProperties body = new FilterProperties(); // FilterProperties | 
String searchTerm = "searchTerm_example"; // String | Search term to filter out pipelines based on pipeline name, identifier, tags.
String pipelineIdentifier = "pipelineIdentifier_example"; // String | Pipeline Identifier filter if exact pipelines needs to be filtered.
Integer page = 0; // Integer | Indicates the number of pages. Results for these pages will be retrieved.
Integer size = 10; // Integer | The number of the elements to fetch
List<String> sort = Arrays.asList("sort_example"); // List<String> | Sort criteria for the elements.
String filterIdentifier = "filterIdentifier_example"; // String | 
String module = "module_example"; // String | 
List<String> status = Arrays.asList("status_example"); // List<String> | 
Boolean myDeployments = true; // Boolean | 
String branch = "branch_example"; // String | Branch Name
String repoIdentifier = "repoIdentifier_example"; // String | Git Sync Config Id
Boolean getDefaultFromOtherRepo = true; // Boolean | if true, return all the default entities
try {
    ResponseDTOPagePipelineExecutionSummary result = apiInstance.getListOfExecutions(accountIdentifier, orgIdentifier, projectIdentifier, body, searchTerm, pipelineIdentifier, page, size, sort, filterIdentifier, module, status, myDeployments, branch, repoIdentifier, getDefaultFromOtherRepo);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExecutionDetailsApi#getListOfExecutions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountIdentifier** | **String**| Account Identifier for the entity. |
 **orgIdentifier** | **String**| Organization Identifier for the entity. |
 **projectIdentifier** | **String**| Project Identifier for the entity. |
 **body** | [**FilterProperties**](FilterProperties.md)|  | [optional]
 **searchTerm** | **String**| Search term to filter out pipelines based on pipeline name, identifier, tags. | [optional]
 **pipelineIdentifier** | **String**| Pipeline Identifier filter if exact pipelines needs to be filtered. | [optional]
 **page** | **Integer**| Indicates the number of pages. Results for these pages will be retrieved. | [optional] [default to 0]
 **size** | **Integer**| The number of the elements to fetch | [optional] [default to 10]
 **sort** | [**List&lt;String&gt;**](String.md)| Sort criteria for the elements. | [optional]
 **filterIdentifier** | **String**|  | [optional]
 **module** | **String**|  | [optional]
 **status** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: RUNNING, ASYNCWAITING, TASKWAITING, TIMEDWAITING, FAILED, ERRORED, IGNOREFAILED, NOTSTARTED, EXPIRED, ABORTED, DISCONTINUING, QUEUED, PAUSED, RESOURCEWAITING, INTERVENTIONWAITING, APPROVALWAITING, SUCCESS, SUSPENDED, SKIPPED, PAUSING, APPROVALREJECTED, NOT_STARTED, INTERVENTION_WAITING, APPROVAL_WAITING, APPROVAL_REJECTED, WAITING]
 **myDeployments** | **Boolean**|  | [optional]
 **branch** | **String**| Branch Name | [optional]
 **repoIdentifier** | **String**| Git Sync Config Id | [optional]
 **getDefaultFromOtherRepo** | **Boolean**| if true, return all the default entities | [optional]

### Return type

[**ResponseDTOPagePipelineExecutionSummary**](ResponseDTOPagePipelineExecutionSummary.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json, application/yaml
 - **Accept**: application/json, application/yaml

