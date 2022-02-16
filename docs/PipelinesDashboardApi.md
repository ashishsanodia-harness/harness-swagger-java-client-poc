# PipelinesDashboardApi

All URIs are relative to *https://app.harness.io/gateway*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getPipelineDashboardExecution**](PipelinesDashboardApi.md#getPipelineDashboardExecution) | **GET** /pipeline/api/dashboard/pipelineExecution | Fetches Pipeline Executions details for a given Interval and will be presented in day wise format
[**getPipelineExecution**](PipelinesDashboardApi.md#getPipelineExecution) | **GET** /pipeline/api/pipelines/pipelineExecution | Fetches Pipeline Executions details for a given Interval and will be presented in day wise format
[**getPipelinedHealth**](PipelinesDashboardApi.md#getPipelinedHealth) | **GET** /pipeline/api/pipelines/pipelineHealth | Fetches Pipeline Health data for a given Interval and will be presented in day wise format 
[**getPipelinedHealth1**](PipelinesDashboardApi.md#getPipelinedHealth1) | **GET** /pipeline/api/dashboard/pipelineHealth | Fetches Pipeline Health data for a given Interval and will be presented in day wise format

<a name="getPipelineDashboardExecution"></a>
# **getPipelineDashboardExecution**
> ResponseDTODashboardPipelineExecution getPipelineDashboardExecution(accountIdentifier, orgIdentifier, projectIdentifier, pipelineIdentifier, moduleInfo, startTime, endTime)

Fetches Pipeline Executions details for a given Interval and will be presented in day wise format

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PipelinesDashboardApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

PipelinesDashboardApi apiInstance = new PipelinesDashboardApi();
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the entity.
String orgIdentifier = "orgIdentifier_example"; // String | Organization Identifier for the entity.
String projectIdentifier = "projectIdentifier_example"; // String | Project Identifier for the entity.
String pipelineIdentifier = "pipelineIdentifier_example"; // String | Pipeline Identifier
String moduleInfo = "moduleInfo_example"; // String | The module from which execution was triggered.
Long startTime = 789L; // Long | Start Date Epoch time in ms
Long endTime = 789L; // Long | End Date Epoch time in ms
try {
    ResponseDTODashboardPipelineExecution result = apiInstance.getPipelineDashboardExecution(accountIdentifier, orgIdentifier, projectIdentifier, pipelineIdentifier, moduleInfo, startTime, endTime);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PipelinesDashboardApi#getPipelineDashboardExecution");
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
 **moduleInfo** | **String**| The module from which execution was triggered. |
 **startTime** | **Long**| Start Date Epoch time in ms |
 **endTime** | **Long**| End Date Epoch time in ms |

### Return type

[**ResponseDTODashboardPipelineExecution**](ResponseDTODashboardPipelineExecution.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/yaml

<a name="getPipelineExecution"></a>
# **getPipelineExecution**
> ResponseDTODashboardPipelineExecution getPipelineExecution(accountIdentifier, orgIdentifier, projectIdentifier, pipelineIdentifier, moduleInfo, startTime, endTime)

Fetches Pipeline Executions details for a given Interval and will be presented in day wise format

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PipelinesDashboardApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

PipelinesDashboardApi apiInstance = new PipelinesDashboardApi();
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the entity.
String orgIdentifier = "orgIdentifier_example"; // String | Organization Identifier for the entity.
String projectIdentifier = "projectIdentifier_example"; // String | Project Identifier for the entity.
String pipelineIdentifier = "pipelineIdentifier_example"; // String | Pipeline Identifier
String moduleInfo = "moduleInfo_example"; // String | The module from which execution was triggered.
Long startTime = 789L; // Long | Start Date Epoch time in ms
Long endTime = 789L; // Long | End Date Epoch time in ms
try {
    ResponseDTODashboardPipelineExecution result = apiInstance.getPipelineExecution(accountIdentifier, orgIdentifier, projectIdentifier, pipelineIdentifier, moduleInfo, startTime, endTime);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PipelinesDashboardApi#getPipelineExecution");
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
 **moduleInfo** | **String**| The module from which execution was triggered. |
 **startTime** | **Long**| Start Date Epoch time in ms |
 **endTime** | **Long**| End Date Epoch time in ms |

### Return type

[**ResponseDTODashboardPipelineExecution**](ResponseDTODashboardPipelineExecution.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/yaml

<a name="getPipelinedHealth"></a>
# **getPipelinedHealth**
> ResponseDTODashboardPipelineHealth getPipelinedHealth(accountIdentifier, orgIdentifier, projectIdentifier, pipelineIdentifier, moduleInfo, startTime, endTime)

Fetches Pipeline Health data for a given Interval and will be presented in day wise format 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PipelinesDashboardApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

PipelinesDashboardApi apiInstance = new PipelinesDashboardApi();
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the entity.
String orgIdentifier = "orgIdentifier_example"; // String | Organization Identifier for the entity.
String projectIdentifier = "projectIdentifier_example"; // String | Project Identifier for the entity.
String pipelineIdentifier = "pipelineIdentifier_example"; // String | Pipeline Identifier
String moduleInfo = "moduleInfo_example"; // String | The module from which execution was triggered.
Long startTime = 789L; // Long | Start Date Epoch time in ms
Long endTime = 789L; // Long | End Date Epoch time in ms
try {
    ResponseDTODashboardPipelineHealth result = apiInstance.getPipelinedHealth(accountIdentifier, orgIdentifier, projectIdentifier, pipelineIdentifier, moduleInfo, startTime, endTime);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PipelinesDashboardApi#getPipelinedHealth");
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
 **moduleInfo** | **String**| The module from which execution was triggered. |
 **startTime** | **Long**| Start Date Epoch time in ms |
 **endTime** | **Long**| End Date Epoch time in ms |

### Return type

[**ResponseDTODashboardPipelineHealth**](ResponseDTODashboardPipelineHealth.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/yaml

<a name="getPipelinedHealth1"></a>
# **getPipelinedHealth1**
> ResponseDTODashboardPipelineHealth getPipelinedHealth1(accountIdentifier, orgIdentifier, projectIdentifier, pipelineIdentifier, moduleInfo, startTime, endTime)

Fetches Pipeline Health data for a given Interval and will be presented in day wise format

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PipelinesDashboardApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

PipelinesDashboardApi apiInstance = new PipelinesDashboardApi();
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the entity.
String orgIdentifier = "orgIdentifier_example"; // String | Organization Identifier for the entity.
String projectIdentifier = "projectIdentifier_example"; // String | Project Identifier for the entity.
String pipelineIdentifier = "pipelineIdentifier_example"; // String | Pipeline Identifier
String moduleInfo = "moduleInfo_example"; // String | The module from which execution was triggered.
Long startTime = 789L; // Long | Start Date Epoch time in ms
Long endTime = 789L; // Long | End Date Epoch time in ms
try {
    ResponseDTODashboardPipelineHealth result = apiInstance.getPipelinedHealth1(accountIdentifier, orgIdentifier, projectIdentifier, pipelineIdentifier, moduleInfo, startTime, endTime);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PipelinesDashboardApi#getPipelinedHealth1");
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
 **moduleInfo** | **String**| The module from which execution was triggered. |
 **startTime** | **Long**| Start Date Epoch time in ms |
 **endTime** | **Long**| End Date Epoch time in ms |

### Return type

[**ResponseDTODashboardPipelineHealth**](ResponseDTODashboardPipelineHealth.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/yaml

