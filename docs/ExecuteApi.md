# ExecuteApi

All URIs are relative to *https://app.harness.io/gateway*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getPreFlightCheckResponse**](ExecuteApi.md#getPreFlightCheckResponse) | **GET** /pipeline/api/pipeline/execute/getPreflightCheckResponse | Get Preflight Checks Response for a Preflight Id
[**getRetryStages**](ExecuteApi.md#getRetryStages) | **GET** /pipeline/api/pipeline/execute/{planExecutionId}/retryStages | Get retry stages for failed pipeline
[**getStagesExecutionList**](ExecuteApi.md#getStagesExecutionList) | **GET** /pipeline/api/pipeline/execute/stagesExecutionList | Get list of Stages to select for Stage executions
[**handleManualInterventionInterrupt**](ExecuteApi.md#handleManualInterventionInterrupt) | **PUT** /pipeline/api/pipeline/execute/manualIntervention/interrupt/{planExecutionId}/{nodeExecutionId} | Handles Ignore,Abort,MarkAsSuccess,Retry on post manual intervention for a given execution with the given planExecutionId
[**handleStageInterrupt**](ExecuteApi.md#handleStageInterrupt) | **PUT** /pipeline/api/pipeline/execute/interrupt/{planExecutionId}/{nodeExecutionId} | Handles the interrupt for a given stage in a pipeline
[**latestExecutionId**](ExecuteApi.md#latestExecutionId) | **GET** /pipeline/api/pipeline/execute/latestExecutionId/{planExecutionId} | Latest ExecutionId from Retry Executions
[**postExecuteStages**](ExecuteApi.md#postExecuteStages) | **POST** /pipeline/api/pipeline/execute/{identifier}/stages | Execute given Stages of a Pipeline
[**postPipelineExecuteWithInputSetList**](ExecuteApi.md#postPipelineExecuteWithInputSetList) | **POST** /pipeline/api/pipeline/execute/{identifier}/inputSetList | Execute a pipeline with input set references list
[**postPipelineExecuteWithInputSetYaml**](ExecuteApi.md#postPipelineExecuteWithInputSetYaml) | **POST** /pipeline/api/pipeline/execute/{identifier} | Execute a pipeline with inputSet pipeline yaml
[**postPipelineExecuteWithInputSetYamlv2**](ExecuteApi.md#postPipelineExecuteWithInputSetYamlv2) | **POST** /pipeline/api/pipeline/execute/{identifier}/v2 | Execute a pipeline with inputSet pipeline yaml V2
[**postReExecuteStages**](ExecuteApi.md#postReExecuteStages) | **POST** /pipeline/api/pipeline/execute/rerun/{originalExecutionId}/{identifier}/stages | Re-run given Stages of a Pipeline
[**putHandleInterrupt**](ExecuteApi.md#putHandleInterrupt) | **PUT** /pipeline/api/pipeline/execute/interrupt/{planExecutionId} | Execute an Interrupt on an execution
[**rePostPipelineExecuteWithInputSetYaml**](ExecuteApi.md#rePostPipelineExecuteWithInputSetYaml) | **POST** /pipeline/api/pipeline/execute/rerun/{originalExecutionId}/{identifier} | Re Execute a pipeline with inputSet pipeline yaml
[**rePostPipelineExecuteWithInputSetYamlV2**](ExecuteApi.md#rePostPipelineExecuteWithInputSetYamlV2) | **POST** /pipeline/api/pipeline/execute/rerun/v2/{originalExecutionId}/{identifier} | Re Execute a pipeline with InputSet Pipeline YAML Version 2
[**rerunPipelineWithInputSetIdentifierList**](ExecuteApi.md#rerunPipelineWithInputSetIdentifierList) | **POST** /pipeline/api/pipeline/execute/rerun/{originalExecutionId}/{identifier}/inputSetList | Rerun a pipeline with given inputSet identifiers
[**retryHistory**](ExecuteApi.md#retryHistory) | **GET** /pipeline/api/pipeline/execute/retryHistory/{planExecutionId} | Retry History for a given execution
[**retryPipeline**](ExecuteApi.md#retryPipeline) | **POST** /pipeline/api/pipeline/execute/retry/{identifier} | Retry a executed pipeline with inputSet pipeline yaml
[**startPreFlightCheck**](ExecuteApi.md#startPreFlightCheck) | **POST** /pipeline/api/pipeline/execute/preflightCheck | Start Preflight Checks for a Pipeline

<a name="getPreFlightCheckResponse"></a>
# **getPreFlightCheckResponse**
> ResponseDTOPreFlightDTO getPreFlightCheckResponse(accountIdentifier, orgIdentifier, projectIdentifier, preflightCheckId, body)

Get Preflight Checks Response for a Preflight Id

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ExecuteApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

ExecuteApi apiInstance = new ExecuteApi();
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the entity.
String orgIdentifier = "orgIdentifier_example"; // String | Organization Identifier for the entity.
String projectIdentifier = "projectIdentifier_example"; // String | Project Identifier for the entity.
String preflightCheckId = "preflightCheckId_example"; // String | Preflight Id from the start Preflight Checks API
String body = "body_example"; // String | 
try {
    ResponseDTOPreFlightDTO result = apiInstance.getPreFlightCheckResponse(accountIdentifier, orgIdentifier, projectIdentifier, preflightCheckId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExecuteApi#getPreFlightCheckResponse");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountIdentifier** | **String**| Account Identifier for the entity. |
 **orgIdentifier** | **String**| Organization Identifier for the entity. |
 **projectIdentifier** | **String**| Project Identifier for the entity. |
 **preflightCheckId** | **String**| Preflight Id from the start Preflight Checks API |
 **body** | [**String**](String.md)|  | [optional]

### Return type

[**ResponseDTOPreFlightDTO**](ResponseDTOPreFlightDTO.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json, application/yaml
 - **Accept**: application/json, application/yaml

<a name="getRetryStages"></a>
# **getRetryStages**
> ResponseDTORetryInfo getRetryStages(accountIdentifier, orgIdentifier, projectIdentifier, planExecutionId, pipelineIdentifier, branch, repoIdentifier, getDefaultFromOtherRepo)

Get retry stages for failed pipeline

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ExecuteApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

ExecuteApi apiInstance = new ExecuteApi();
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the entity.
String orgIdentifier = "orgIdentifier_example"; // String | Organization Identifier for the entity.
String projectIdentifier = "projectIdentifier_example"; // String | Project Identifier for the entity.
String planExecutionId = "planExecutionId_example"; // String | planExecutionId of the execution we want to retry
String pipelineIdentifier = "pipelineIdentifier_example"; // String | Pipeline Identifier
String branch = "branch_example"; // String | Branch Name
String repoIdentifier = "repoIdentifier_example"; // String | Git Sync Config Id
Boolean getDefaultFromOtherRepo = true; // Boolean | if true, return all the default entities
try {
    ResponseDTORetryInfo result = apiInstance.getRetryStages(accountIdentifier, orgIdentifier, projectIdentifier, planExecutionId, pipelineIdentifier, branch, repoIdentifier, getDefaultFromOtherRepo);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExecuteApi#getRetryStages");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountIdentifier** | **String**| Account Identifier for the entity. |
 **orgIdentifier** | **String**| Organization Identifier for the entity. |
 **projectIdentifier** | **String**| Project Identifier for the entity. |
 **planExecutionId** | **String**| planExecutionId of the execution we want to retry |
 **pipelineIdentifier** | **String**| Pipeline Identifier | [optional]
 **branch** | **String**| Branch Name | [optional]
 **repoIdentifier** | **String**| Git Sync Config Id | [optional]
 **getDefaultFromOtherRepo** | **Boolean**| if true, return all the default entities | [optional]

### Return type

[**ResponseDTORetryInfo**](ResponseDTORetryInfo.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/yaml

<a name="getStagesExecutionList"></a>
# **getStagesExecutionList**
> ResponseDTOListStageExecutionResponse getStagesExecutionList(accountIdentifier, orgIdentifier, projectIdentifier, pipelineIdentifier, branch, repoIdentifier, getDefaultFromOtherRepo)

Get list of Stages to select for Stage executions

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ExecuteApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

ExecuteApi apiInstance = new ExecuteApi();
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the entity.
String orgIdentifier = "orgIdentifier_example"; // String | Organization Identifier for the entity.
String projectIdentifier = "projectIdentifier_example"; // String | Project Identifier for the entity.
String pipelineIdentifier = "pipelineIdentifier_example"; // String | Pipeline Identifier
String branch = "branch_example"; // String | Branch Name
String repoIdentifier = "repoIdentifier_example"; // String | Git Sync Config Id
Boolean getDefaultFromOtherRepo = true; // Boolean | if true, return all the default entities
try {
    ResponseDTOListStageExecutionResponse result = apiInstance.getStagesExecutionList(accountIdentifier, orgIdentifier, projectIdentifier, pipelineIdentifier, branch, repoIdentifier, getDefaultFromOtherRepo);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExecuteApi#getStagesExecutionList");
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

[**ResponseDTOListStageExecutionResponse**](ResponseDTOListStageExecutionResponse.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/yaml

<a name="handleManualInterventionInterrupt"></a>
# **handleManualInterventionInterrupt**
> ResponseDTOInterruptResponse handleManualInterventionInterrupt(accountIdentifier, orgIdentifier, projectIdentifier, interruptType, planExecutionId, nodeExecutionId)

Handles Ignore,Abort,MarkAsSuccess,Retry on post manual intervention for a given execution with the given planExecutionId

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ExecuteApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

ExecuteApi apiInstance = new ExecuteApi();
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the entity.
String orgIdentifier = "orgIdentifier_example"; // String | Organization Identifier for the entity.
String projectIdentifier = "projectIdentifier_example"; // String | Project Identifier for the entity.
String interruptType = "interruptType_example"; // String | The Interrupt type needed to be applied to the execution. Choose a value from the enum list.
String planExecutionId = "planExecutionId_example"; // String | The Pipeline Execution Id on which the Interrupt needs to be applied.
String nodeExecutionId = "nodeExecutionId_example"; // String | The runtime Id of the step/stage on which the Interrupt needs to be applied.
try {
    ResponseDTOInterruptResponse result = apiInstance.handleManualInterventionInterrupt(accountIdentifier, orgIdentifier, projectIdentifier, interruptType, planExecutionId, nodeExecutionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExecuteApi#handleManualInterventionInterrupt");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountIdentifier** | **String**| Account Identifier for the entity. |
 **orgIdentifier** | **String**| Organization Identifier for the entity. |
 **projectIdentifier** | **String**| Project Identifier for the entity. |
 **interruptType** | **String**| The Interrupt type needed to be applied to the execution. Choose a value from the enum list. | [enum: ABORTALL, ABORT, PAUSE, RESUME, IGNORE, STAGEROLLBACK, STEPGROUPROLLBACK, MARKASSUCCESS, EXPIREALL, RETRY]
 **planExecutionId** | **String**| The Pipeline Execution Id on which the Interrupt needs to be applied. |
 **nodeExecutionId** | **String**| The runtime Id of the step/stage on which the Interrupt needs to be applied. |

### Return type

[**ResponseDTOInterruptResponse**](ResponseDTOInterruptResponse.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/yaml

<a name="handleStageInterrupt"></a>
# **handleStageInterrupt**
> ResponseDTOInterruptResponse handleStageInterrupt(accountIdentifier, orgIdentifier, projectIdentifier, interruptType, planExecutionId, nodeExecutionId)

Handles the interrupt for a given stage in a pipeline

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ExecuteApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

ExecuteApi apiInstance = new ExecuteApi();
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the entity.
String orgIdentifier = "orgIdentifier_example"; // String | Organization Identifier for the entity.
String projectIdentifier = "projectIdentifier_example"; // String | Project Identifier for the entity.
String interruptType = "interruptType_example"; // String | The Interrupt type needed to be applied to the execution. Choose a value from the enum list.
String planExecutionId = "planExecutionId_example"; // String | The Pipeline Execution Id on which the Interrupt needs to be applied.
String nodeExecutionId = "nodeExecutionId_example"; // String | The runtime Id of the step/stage on which the Interrupt needs to be applied.
try {
    ResponseDTOInterruptResponse result = apiInstance.handleStageInterrupt(accountIdentifier, orgIdentifier, projectIdentifier, interruptType, planExecutionId, nodeExecutionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExecuteApi#handleStageInterrupt");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountIdentifier** | **String**| Account Identifier for the entity. |
 **orgIdentifier** | **String**| Organization Identifier for the entity. |
 **projectIdentifier** | **String**| Project Identifier for the entity. |
 **interruptType** | **String**| The Interrupt type needed to be applied to the execution. Choose a value from the enum list. | [enum: ABORTALL, ABORT, PAUSE, RESUME, IGNORE, STAGEROLLBACK, STEPGROUPROLLBACK, MARKASSUCCESS, EXPIREALL, RETRY]
 **planExecutionId** | **String**| The Pipeline Execution Id on which the Interrupt needs to be applied. |
 **nodeExecutionId** | **String**| The runtime Id of the step/stage on which the Interrupt needs to be applied. |

### Return type

[**ResponseDTOInterruptResponse**](ResponseDTOInterruptResponse.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/yaml

<a name="latestExecutionId"></a>
# **latestExecutionId**
> ResponseDTORetryLatestExecutionResponse latestExecutionId(accountIdentifier, orgIdentifier, projectIdentifier, pipelineIdentifier, planExecutionId)

Latest ExecutionId from Retry Executions

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ExecuteApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

ExecuteApi apiInstance = new ExecuteApi();
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the entity.
String orgIdentifier = "orgIdentifier_example"; // String | Organization Identifier for the entity.
String projectIdentifier = "projectIdentifier_example"; // String | Project Identifier for the entity.
String pipelineIdentifier = "pipelineIdentifier_example"; // String | Pipeline Identifier
String planExecutionId = "planExecutionId_example"; // String | planExecutionId of the execution of whose we need to find the latest execution planExecutionId
try {
    ResponseDTORetryLatestExecutionResponse result = apiInstance.latestExecutionId(accountIdentifier, orgIdentifier, projectIdentifier, pipelineIdentifier, planExecutionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExecuteApi#latestExecutionId");
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
 **planExecutionId** | **String**| planExecutionId of the execution of whose we need to find the latest execution planExecutionId |

### Return type

[**ResponseDTORetryLatestExecutionResponse**](ResponseDTORetryLatestExecutionResponse.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/yaml

<a name="postExecuteStages"></a>
# **postExecuteStages**
> ResponseDTOPlanExecutionResponse postExecuteStages(accountIdentifier, orgIdentifier, projectIdentifier, moduleType, identifier, body, branch, repoIdentifier, getDefaultFromOtherRepo, useFQNIfError)

Execute given Stages of a Pipeline

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ExecuteApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

ExecuteApi apiInstance = new ExecuteApi();
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the entity.
String orgIdentifier = "orgIdentifier_example"; // String | Organization Identifier for the entity.
String projectIdentifier = "projectIdentifier_example"; // String | Project Identifier for the entity.
String moduleType = "moduleType_example"; // String | Module type for the entity. If its from deployments,type will be CD , if its from build type will be CI
String identifier = "identifier_example"; // String | Pipeline Identifier
RunStageRequest body = new RunStageRequest(); // RunStageRequest | 
String branch = "branch_example"; // String | Branch Name
String repoIdentifier = "repoIdentifier_example"; // String | Git Sync Config Id
Boolean getDefaultFromOtherRepo = true; // Boolean | if true, return all the default entities
Boolean useFQNIfError = false; // Boolean | 
try {
    ResponseDTOPlanExecutionResponse result = apiInstance.postExecuteStages(accountIdentifier, orgIdentifier, projectIdentifier, moduleType, identifier, body, branch, repoIdentifier, getDefaultFromOtherRepo, useFQNIfError);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExecuteApi#postExecuteStages");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountIdentifier** | **String**| Account Identifier for the entity. |
 **orgIdentifier** | **String**| Organization Identifier for the entity. |
 **projectIdentifier** | **String**| Project Identifier for the entity. |
 **moduleType** | **String**| Module type for the entity. If its from deployments,type will be CD , if its from build type will be CI |
 **identifier** | **String**| Pipeline Identifier |
 **body** | [**RunStageRequest**](RunStageRequest.md)|  | [optional]
 **branch** | **String**| Branch Name | [optional]
 **repoIdentifier** | **String**| Git Sync Config Id | [optional]
 **getDefaultFromOtherRepo** | **Boolean**| if true, return all the default entities | [optional]
 **useFQNIfError** | **Boolean**|  | [optional] [default to false]

### Return type

[**ResponseDTOPlanExecutionResponse**](ResponseDTOPlanExecutionResponse.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json, application/yaml
 - **Accept**: application/json, application/yaml

<a name="postPipelineExecuteWithInputSetList"></a>
# **postPipelineExecuteWithInputSetList**
> ResponseDTOPlanExecutionResponse postPipelineExecuteWithInputSetList(body, accountIdentifier, orgIdentifier, projectIdentifier, moduleType, identifier, branch, repoIdentifier, getDefaultFromOtherRepo, useFQNIfError)

Execute a pipeline with input set references list

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ExecuteApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

ExecuteApi apiInstance = new ExecuteApi();
MergeInputSetRequest body = new MergeInputSetRequest(); // MergeInputSetRequest | 
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the entity.
String orgIdentifier = "orgIdentifier_example"; // String | Organization Identifier for the entity.
String projectIdentifier = "projectIdentifier_example"; // String | Project Identifier for the entity.
String moduleType = "moduleType_example"; // String | Module type for the entity. If its from deployments,type will be CD , if its from build type will be CI
String identifier = "identifier_example"; // String | Pipeline identifier for the entity. Identifier of the Pipeline to be executed
String branch = "branch_example"; // String | Branch Name
String repoIdentifier = "repoIdentifier_example"; // String | Git Sync Config Id
Boolean getDefaultFromOtherRepo = true; // Boolean | if true, return all the default entities
Boolean useFQNIfError = false; // Boolean | 
try {
    ResponseDTOPlanExecutionResponse result = apiInstance.postPipelineExecuteWithInputSetList(body, accountIdentifier, orgIdentifier, projectIdentifier, moduleType, identifier, branch, repoIdentifier, getDefaultFromOtherRepo, useFQNIfError);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExecuteApi#postPipelineExecuteWithInputSetList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**MergeInputSetRequest**](MergeInputSetRequest.md)|  |
 **accountIdentifier** | **String**| Account Identifier for the entity. |
 **orgIdentifier** | **String**| Organization Identifier for the entity. |
 **projectIdentifier** | **String**| Project Identifier for the entity. |
 **moduleType** | **String**| Module type for the entity. If its from deployments,type will be CD , if its from build type will be CI |
 **identifier** | **String**| Pipeline identifier for the entity. Identifier of the Pipeline to be executed |
 **branch** | **String**| Branch Name | [optional]
 **repoIdentifier** | **String**| Git Sync Config Id | [optional]
 **getDefaultFromOtherRepo** | **Boolean**| if true, return all the default entities | [optional]
 **useFQNIfError** | **Boolean**|  | [optional] [default to false]

### Return type

[**ResponseDTOPlanExecutionResponse**](ResponseDTOPlanExecutionResponse.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json, application/yaml
 - **Accept**: application/json, application/yaml

<a name="postPipelineExecuteWithInputSetYaml"></a>
# **postPipelineExecuteWithInputSetYaml**
> ResponseDTOPlanExecutionResponse postPipelineExecuteWithInputSetYaml(accountIdentifier, orgIdentifier, projectIdentifier, moduleType, identifier, body, branch, repoIdentifier, getDefaultFromOtherRepo, useFQNIfError)

Execute a pipeline with inputSet pipeline yaml

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ExecuteApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

ExecuteApi apiInstance = new ExecuteApi();
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the entity.
String orgIdentifier = "orgIdentifier_example"; // String | Organization Identifier for the entity.
String projectIdentifier = "projectIdentifier_example"; // String | Project Identifier for the entity.
String moduleType = "moduleType_example"; // String | Module type for the entity. If its from deployments,type will be CD , if its from build type will be CI
String identifier = "identifier_example"; // String | Pipeline identifier for the entity. Identifier of the Pipeline to be executed
String body = "body_example"; // String | InputSet YAML if the pipeline contains runtime inputs. This will be empty by default if pipeline does not contains runtime inputs
String branch = "branch_example"; // String | Branch Name
String repoIdentifier = "repoIdentifier_example"; // String | Git Sync Config Id
Boolean getDefaultFromOtherRepo = true; // Boolean | if true, return all the default entities
Boolean useFQNIfError = false; // Boolean | 
try {
    ResponseDTOPlanExecutionResponse result = apiInstance.postPipelineExecuteWithInputSetYaml(accountIdentifier, orgIdentifier, projectIdentifier, moduleType, identifier, body, branch, repoIdentifier, getDefaultFromOtherRepo, useFQNIfError);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExecuteApi#postPipelineExecuteWithInputSetYaml");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountIdentifier** | **String**| Account Identifier for the entity. |
 **orgIdentifier** | **String**| Organization Identifier for the entity. |
 **projectIdentifier** | **String**| Project Identifier for the entity. |
 **moduleType** | **String**| Module type for the entity. If its from deployments,type will be CD , if its from build type will be CI |
 **identifier** | **String**| Pipeline identifier for the entity. Identifier of the Pipeline to be executed |
 **body** | [**String**](String.md)| InputSet YAML if the pipeline contains runtime inputs. This will be empty by default if pipeline does not contains runtime inputs | [optional]
 **branch** | **String**| Branch Name | [optional]
 **repoIdentifier** | **String**| Git Sync Config Id | [optional]
 **getDefaultFromOtherRepo** | **Boolean**| if true, return all the default entities | [optional]
 **useFQNIfError** | **Boolean**|  | [optional] [default to false]

### Return type

[**ResponseDTOPlanExecutionResponse**](ResponseDTOPlanExecutionResponse.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json, application/yaml
 - **Accept**: application/json, application/yaml

<a name="postPipelineExecuteWithInputSetYamlv2"></a>
# **postPipelineExecuteWithInputSetYamlv2**
> ResponseDTOPlanExecutionResponse postPipelineExecuteWithInputSetYamlv2(accountIdentifier, orgIdentifier, projectIdentifier, moduleType, identifier, body, branch, repoIdentifier, getDefaultFromOtherRepo, useFQNIfError)

Execute a pipeline with inputSet pipeline yaml V2

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ExecuteApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

ExecuteApi apiInstance = new ExecuteApi();
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the entity.
String orgIdentifier = "orgIdentifier_example"; // String | Organization Identifier for the entity.
String projectIdentifier = "projectIdentifier_example"; // String | Project Identifier for the entity.
String moduleType = "moduleType_example"; // String | Module type for the entity. If its from deployments,type will be CD , if its from build type will be CI
String identifier = "identifier_example"; // String | Pipeline identifier for the entity. Identifier of the Pipeline to be executed
String body = "body_example"; // String | InputSet YAML if the pipeline contains runtime inputs. This will be empty by default if pipeline does not contains runtime inputs
String branch = "branch_example"; // String | Branch Name
String repoIdentifier = "repoIdentifier_example"; // String | Git Sync Config Id
Boolean getDefaultFromOtherRepo = true; // Boolean | if true, return all the default entities
Boolean useFQNIfError = false; // Boolean | 
try {
    ResponseDTOPlanExecutionResponse result = apiInstance.postPipelineExecuteWithInputSetYamlv2(accountIdentifier, orgIdentifier, projectIdentifier, moduleType, identifier, body, branch, repoIdentifier, getDefaultFromOtherRepo, useFQNIfError);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExecuteApi#postPipelineExecuteWithInputSetYamlv2");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountIdentifier** | **String**| Account Identifier for the entity. |
 **orgIdentifier** | **String**| Organization Identifier for the entity. |
 **projectIdentifier** | **String**| Project Identifier for the entity. |
 **moduleType** | **String**| Module type for the entity. If its from deployments,type will be CD , if its from build type will be CI |
 **identifier** | **String**| Pipeline identifier for the entity. Identifier of the Pipeline to be executed |
 **body** | [**String**](String.md)| InputSet YAML if the pipeline contains runtime inputs. This will be empty by default if pipeline does not contains runtime inputs | [optional]
 **branch** | **String**| Branch Name | [optional]
 **repoIdentifier** | **String**| Git Sync Config Id | [optional]
 **getDefaultFromOtherRepo** | **Boolean**| if true, return all the default entities | [optional]
 **useFQNIfError** | **Boolean**|  | [optional] [default to false]

### Return type

[**ResponseDTOPlanExecutionResponse**](ResponseDTOPlanExecutionResponse.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json, application/yaml
 - **Accept**: application/json, application/yaml

<a name="postReExecuteStages"></a>
# **postReExecuteStages**
> ResponseDTOPlanExecutionResponse postReExecuteStages(accountIdentifier, orgIdentifier, projectIdentifier, moduleType, identifier, originalExecutionId, body, branch, repoIdentifier, getDefaultFromOtherRepo, useFQNIfError)

Re-run given Stages of a Pipeline

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ExecuteApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

ExecuteApi apiInstance = new ExecuteApi();
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the entity.
String orgIdentifier = "orgIdentifier_example"; // String | Organization Identifier for the entity.
String projectIdentifier = "projectIdentifier_example"; // String | Project Identifier for the entity.
String moduleType = "moduleType_example"; // String | Module type for the entity. If its from deployments,type will be CD , if its from build type will be CI
String identifier = "identifier_example"; // String | Pipeline Identifier
String originalExecutionId = "originalExecutionId_example"; // String | This param contains the previous execution execution id. This is basically when we are rerunning a Pipeline.
RunStageRequest body = new RunStageRequest(); // RunStageRequest | 
String branch = "branch_example"; // String | Branch Name
String repoIdentifier = "repoIdentifier_example"; // String | Git Sync Config Id
Boolean getDefaultFromOtherRepo = true; // Boolean | if true, return all the default entities
Boolean useFQNIfError = false; // Boolean | 
try {
    ResponseDTOPlanExecutionResponse result = apiInstance.postReExecuteStages(accountIdentifier, orgIdentifier, projectIdentifier, moduleType, identifier, originalExecutionId, body, branch, repoIdentifier, getDefaultFromOtherRepo, useFQNIfError);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExecuteApi#postReExecuteStages");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountIdentifier** | **String**| Account Identifier for the entity. |
 **orgIdentifier** | **String**| Organization Identifier for the entity. |
 **projectIdentifier** | **String**| Project Identifier for the entity. |
 **moduleType** | **String**| Module type for the entity. If its from deployments,type will be CD , if its from build type will be CI |
 **identifier** | **String**| Pipeline Identifier |
 **originalExecutionId** | **String**| This param contains the previous execution execution id. This is basically when we are rerunning a Pipeline. |
 **body** | [**RunStageRequest**](RunStageRequest.md)|  | [optional]
 **branch** | **String**| Branch Name | [optional]
 **repoIdentifier** | **String**| Git Sync Config Id | [optional]
 **getDefaultFromOtherRepo** | **Boolean**| if true, return all the default entities | [optional]
 **useFQNIfError** | **Boolean**|  | [optional] [default to false]

### Return type

[**ResponseDTOPlanExecutionResponse**](ResponseDTOPlanExecutionResponse.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json, application/yaml
 - **Accept**: application/json, application/yaml

<a name="putHandleInterrupt"></a>
# **putHandleInterrupt**
> ResponseDTOInterruptResponse putHandleInterrupt(accountIdentifier, orgIdentifier, projectIdentifier, interruptType, planExecutionId)

Execute an Interrupt on an execution

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ExecuteApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

ExecuteApi apiInstance = new ExecuteApi();
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the entity.
String orgIdentifier = "orgIdentifier_example"; // String | Organization Identifier for the entity.
String projectIdentifier = "projectIdentifier_example"; // String | Project Identifier for the entity.
String interruptType = "interruptType_example"; // String | The Interrupt type needed to be applied to the execution. Choose a value from the enum list.
String planExecutionId = "planExecutionId_example"; // String | The Pipeline Execution Id on which the Interrupt needs to be applied.
try {
    ResponseDTOInterruptResponse result = apiInstance.putHandleInterrupt(accountIdentifier, orgIdentifier, projectIdentifier, interruptType, planExecutionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExecuteApi#putHandleInterrupt");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountIdentifier** | **String**| Account Identifier for the entity. |
 **orgIdentifier** | **String**| Organization Identifier for the entity. |
 **projectIdentifier** | **String**| Project Identifier for the entity. |
 **interruptType** | **String**| The Interrupt type needed to be applied to the execution. Choose a value from the enum list. | [enum: ABORTALL, ABORT, PAUSE, RESUME, IGNORE, STAGEROLLBACK, STEPGROUPROLLBACK, MARKASSUCCESS, EXPIREALL, RETRY]
 **planExecutionId** | **String**| The Pipeline Execution Id on which the Interrupt needs to be applied. |

### Return type

[**ResponseDTOInterruptResponse**](ResponseDTOInterruptResponse.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/yaml

<a name="rePostPipelineExecuteWithInputSetYaml"></a>
# **rePostPipelineExecuteWithInputSetYaml**
> ResponseDTOPlanExecutionResponse rePostPipelineExecuteWithInputSetYaml(accountIdentifier, orgIdentifier, projectIdentifier, moduleType, originalExecutionId, identifier, body, branch, repoIdentifier, getDefaultFromOtherRepo, useFQNIfError)

Re Execute a pipeline with inputSet pipeline yaml

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ExecuteApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

ExecuteApi apiInstance = new ExecuteApi();
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the entity.
String orgIdentifier = "orgIdentifier_example"; // String | Organization Identifier for the entity.
String projectIdentifier = "projectIdentifier_example"; // String | Project Identifier for the entity.
String moduleType = "moduleType_example"; // String | Module type for the entity. If its from deployments,type will be CD , if its from build type will be CI
String originalExecutionId = "originalExecutionId_example"; // String | This param contains the previous execution execution id. This is basically when we are rerunning a Pipeline.
String identifier = "identifier_example"; // String | Pipeline identifier for the entity. Identifier of the Pipeline to be executed
String body = "body_example"; // String | InputSet YAML if the pipeline contains runtime inputs. This will be empty by default if pipeline does not contains runtime inputs
String branch = "branch_example"; // String | Branch Name
String repoIdentifier = "repoIdentifier_example"; // String | Git Sync Config Id
Boolean getDefaultFromOtherRepo = true; // Boolean | if true, return all the default entities
Boolean useFQNIfError = false; // Boolean | 
try {
    ResponseDTOPlanExecutionResponse result = apiInstance.rePostPipelineExecuteWithInputSetYaml(accountIdentifier, orgIdentifier, projectIdentifier, moduleType, originalExecutionId, identifier, body, branch, repoIdentifier, getDefaultFromOtherRepo, useFQNIfError);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExecuteApi#rePostPipelineExecuteWithInputSetYaml");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountIdentifier** | **String**| Account Identifier for the entity. |
 **orgIdentifier** | **String**| Organization Identifier for the entity. |
 **projectIdentifier** | **String**| Project Identifier for the entity. |
 **moduleType** | **String**| Module type for the entity. If its from deployments,type will be CD , if its from build type will be CI |
 **originalExecutionId** | **String**| This param contains the previous execution execution id. This is basically when we are rerunning a Pipeline. |
 **identifier** | **String**| Pipeline identifier for the entity. Identifier of the Pipeline to be executed |
 **body** | [**String**](String.md)| InputSet YAML if the pipeline contains runtime inputs. This will be empty by default if pipeline does not contains runtime inputs | [optional]
 **branch** | **String**| Branch Name | [optional]
 **repoIdentifier** | **String**| Git Sync Config Id | [optional]
 **getDefaultFromOtherRepo** | **Boolean**| if true, return all the default entities | [optional]
 **useFQNIfError** | **Boolean**|  | [optional] [default to false]

### Return type

[**ResponseDTOPlanExecutionResponse**](ResponseDTOPlanExecutionResponse.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json, application/yaml
 - **Accept**: application/json, application/yaml

<a name="rePostPipelineExecuteWithInputSetYamlV2"></a>
# **rePostPipelineExecuteWithInputSetYamlV2**
> ResponseDTOPlanExecutionResponse rePostPipelineExecuteWithInputSetYamlV2(accountIdentifier, orgIdentifier, projectIdentifier, moduleType, originalExecutionId, identifier, body, branch, repoIdentifier, getDefaultFromOtherRepo, useFQNIfError)

Re Execute a pipeline with InputSet Pipeline YAML Version 2

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ExecuteApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

ExecuteApi apiInstance = new ExecuteApi();
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the entity.
String orgIdentifier = "orgIdentifier_example"; // String | Organization Identifier for the entity.
String projectIdentifier = "projectIdentifier_example"; // String | Project Identifier for the entity.
String moduleType = "moduleType_example"; // String | Module type for the entity. If its from deployments,type will be CD , if its from build type will be CI
String originalExecutionId = "originalExecutionId_example"; // String | This param contains the previous execution execution id. This is basically when we are rerunning a Pipeline.
String identifier = "identifier_example"; // String | Pipeline identifier for the entity. Identifier of the Pipeline to be executed
String body = "body_example"; // String | InputSet YAML if the pipeline contains runtime inputs. This will be empty by default if pipeline does not contains runtime inputs
String branch = "branch_example"; // String | Branch Name
String repoIdentifier = "repoIdentifier_example"; // String | Git Sync Config Id
Boolean getDefaultFromOtherRepo = true; // Boolean | if true, return all the default entities
Boolean useFQNIfError = false; // Boolean | 
try {
    ResponseDTOPlanExecutionResponse result = apiInstance.rePostPipelineExecuteWithInputSetYamlV2(accountIdentifier, orgIdentifier, projectIdentifier, moduleType, originalExecutionId, identifier, body, branch, repoIdentifier, getDefaultFromOtherRepo, useFQNIfError);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExecuteApi#rePostPipelineExecuteWithInputSetYamlV2");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountIdentifier** | **String**| Account Identifier for the entity. |
 **orgIdentifier** | **String**| Organization Identifier for the entity. |
 **projectIdentifier** | **String**| Project Identifier for the entity. |
 **moduleType** | **String**| Module type for the entity. If its from deployments,type will be CD , if its from build type will be CI |
 **originalExecutionId** | **String**| This param contains the previous execution execution id. This is basically when we are rerunning a Pipeline. |
 **identifier** | **String**| Pipeline identifier for the entity. Identifier of the Pipeline to be executed |
 **body** | [**String**](String.md)| InputSet YAML if the pipeline contains runtime inputs. This will be empty by default if pipeline does not contains runtime inputs | [optional]
 **branch** | **String**| Branch Name | [optional]
 **repoIdentifier** | **String**| Git Sync Config Id | [optional]
 **getDefaultFromOtherRepo** | **Boolean**| if true, return all the default entities | [optional]
 **useFQNIfError** | **Boolean**|  | [optional] [default to false]

### Return type

[**ResponseDTOPlanExecutionResponse**](ResponseDTOPlanExecutionResponse.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json, application/yaml
 - **Accept**: application/json, application/yaml

<a name="rerunPipelineWithInputSetIdentifierList"></a>
# **rerunPipelineWithInputSetIdentifierList**
> ResponseDTOPlanExecutionResponse rerunPipelineWithInputSetIdentifierList(body, accountIdentifier, orgIdentifier, projectIdentifier, moduleType, useFQNIfError, originalExecutionId, identifier, branch, repoIdentifier, getDefaultFromOtherRepo)

Rerun a pipeline with given inputSet identifiers

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ExecuteApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

ExecuteApi apiInstance = new ExecuteApi();
MergeInputSetRequest body = new MergeInputSetRequest(); // MergeInputSetRequest | InputSet reference details
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the entity.
String orgIdentifier = "orgIdentifier_example"; // String | Organization Identifier for the entity.
String projectIdentifier = "projectIdentifier_example"; // String | Project Identifier for the entity.
String moduleType = "moduleType_example"; // String | The module from which execution was triggered.
Boolean useFQNIfError = false; // Boolean | Use FQN in error response
String originalExecutionId = "originalExecutionId_example"; // String | Id of the execution from which we are running
String identifier = "identifier_example"; // String | Pipeline Identifier
String branch = "branch_example"; // String | Branch Name
String repoIdentifier = "repoIdentifier_example"; // String | Git Sync Config Id
Boolean getDefaultFromOtherRepo = true; // Boolean | if true, return all the default entities
try {
    ResponseDTOPlanExecutionResponse result = apiInstance.rerunPipelineWithInputSetIdentifierList(body, accountIdentifier, orgIdentifier, projectIdentifier, moduleType, useFQNIfError, originalExecutionId, identifier, branch, repoIdentifier, getDefaultFromOtherRepo);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExecuteApi#rerunPipelineWithInputSetIdentifierList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**MergeInputSetRequest**](MergeInputSetRequest.md)| InputSet reference details |
 **accountIdentifier** | **String**| Account Identifier for the entity. |
 **orgIdentifier** | **String**| Organization Identifier for the entity. |
 **projectIdentifier** | **String**| Project Identifier for the entity. |
 **moduleType** | **String**| The module from which execution was triggered. |
 **useFQNIfError** | **Boolean**| Use FQN in error response | [default to false]
 **originalExecutionId** | **String**| Id of the execution from which we are running |
 **identifier** | **String**| Pipeline Identifier |
 **branch** | **String**| Branch Name | [optional]
 **repoIdentifier** | **String**| Git Sync Config Id | [optional]
 **getDefaultFromOtherRepo** | **Boolean**| if true, return all the default entities | [optional]

### Return type

[**ResponseDTOPlanExecutionResponse**](ResponseDTOPlanExecutionResponse.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json, application/yaml
 - **Accept**: application/json, application/yaml

<a name="retryHistory"></a>
# **retryHistory**
> ResponseDTORetryHistoryResponse retryHistory(accountIdentifier, orgIdentifier, projectIdentifier, pipelineIdentifier, planExecutionId)

Retry History for a given execution

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ExecuteApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

ExecuteApi apiInstance = new ExecuteApi();
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the entity.
String orgIdentifier = "orgIdentifier_example"; // String | Organization Identifier for the entity.
String projectIdentifier = "projectIdentifier_example"; // String | Project Identifier for the entity.
String pipelineIdentifier = "pipelineIdentifier_example"; // String | Pipeline Identifier
String planExecutionId = "planExecutionId_example"; // String | planExecutionId of the execution of whose we need to find the retry history
try {
    ResponseDTORetryHistoryResponse result = apiInstance.retryHistory(accountIdentifier, orgIdentifier, projectIdentifier, pipelineIdentifier, planExecutionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExecuteApi#retryHistory");
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
 **planExecutionId** | **String**| planExecutionId of the execution of whose we need to find the retry history |

### Return type

[**ResponseDTORetryHistoryResponse**](ResponseDTORetryHistoryResponse.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/yaml

<a name="retryPipeline"></a>
# **retryPipeline**
> ResponseDTOPlanExecutionResponse retryPipeline(accountIdentifier, orgIdentifier, projectIdentifier, moduleType, planExecutionId, retryStages, identifier, body, runAllStages)

Retry a executed pipeline with inputSet pipeline yaml

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ExecuteApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

ExecuteApi apiInstance = new ExecuteApi();
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the entity.
String orgIdentifier = "orgIdentifier_example"; // String | Organization Identifier for the entity.
String projectIdentifier = "projectIdentifier_example"; // String | Project Identifier for the entity.
String moduleType = "moduleType_example"; // String | Module type for the entity. If its from deployments,type will be CD , if its from build type will be CI
String planExecutionId = "planExecutionId_example"; // String | This param contains the previous execution execution id. This is basically when we are rerunning a Pipeline.
List<String> retryStages = Arrays.asList("retryStages_example"); // List<String> | This param contains the identifier of stages from where to resume. It will be a list if we want to retry from parallel group 
String identifier = "identifier_example"; // String | Pipeline Identifier
String body = "body_example"; // String | 
Boolean runAllStages = true; // Boolean | This param provides an option to run only the failed stages when Pipeline fails at parallel group. By default, it will run all the stages in the failed parallel group.
try {
    ResponseDTOPlanExecutionResponse result = apiInstance.retryPipeline(accountIdentifier, orgIdentifier, projectIdentifier, moduleType, planExecutionId, retryStages, identifier, body, runAllStages);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExecuteApi#retryPipeline");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountIdentifier** | **String**| Account Identifier for the entity. |
 **orgIdentifier** | **String**| Organization Identifier for the entity. |
 **projectIdentifier** | **String**| Project Identifier for the entity. |
 **moduleType** | **String**| Module type for the entity. If its from deployments,type will be CD , if its from build type will be CI |
 **planExecutionId** | **String**| This param contains the previous execution execution id. This is basically when we are rerunning a Pipeline. |
 **retryStages** | [**List&lt;String&gt;**](String.md)| This param contains the identifier of stages from where to resume. It will be a list if we want to retry from parallel group  |
 **identifier** | **String**| Pipeline Identifier |
 **body** | [**String**](String.md)|  | [optional]
 **runAllStages** | **Boolean**| This param provides an option to run only the failed stages when Pipeline fails at parallel group. By default, it will run all the stages in the failed parallel group. | [optional] [default to true]

### Return type

[**ResponseDTOPlanExecutionResponse**](ResponseDTOPlanExecutionResponse.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json, application/yaml
 - **Accept**: application/json, application/yaml

<a name="startPreFlightCheck"></a>
# **startPreFlightCheck**
> ResponseDTOString startPreFlightCheck(accountIdentifier, orgIdentifier, projectIdentifier, body, pipelineIdentifier, branch, repoIdentifier, getDefaultFromOtherRepo)

Start Preflight Checks for a Pipeline

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ExecuteApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

ExecuteApi apiInstance = new ExecuteApi();
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the entity.
String orgIdentifier = "orgIdentifier_example"; // String | Organization Identifier for the entity.
String projectIdentifier = "projectIdentifier_example"; // String | Project Identifier for the entity.
String body = "body_example"; // String | Runtime Input YAML to be sent for Pipeline execution
String pipelineIdentifier = "pipelineIdentifier_example"; // String | Pipeline Identifier
String branch = "branch_example"; // String | Branch Name
String repoIdentifier = "repoIdentifier_example"; // String | Git Sync Config Id
Boolean getDefaultFromOtherRepo = true; // Boolean | if true, return all the default entities
try {
    ResponseDTOString result = apiInstance.startPreFlightCheck(accountIdentifier, orgIdentifier, projectIdentifier, body, pipelineIdentifier, branch, repoIdentifier, getDefaultFromOtherRepo);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExecuteApi#startPreFlightCheck");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountIdentifier** | **String**| Account Identifier for the entity. |
 **orgIdentifier** | **String**| Organization Identifier for the entity. |
 **projectIdentifier** | **String**| Project Identifier for the entity. |
 **body** | [**String**](String.md)| Runtime Input YAML to be sent for Pipeline execution | [optional]
 **pipelineIdentifier** | **String**| Pipeline Identifier | [optional]
 **branch** | **String**| Branch Name | [optional]
 **repoIdentifier** | **String**| Git Sync Config Id | [optional]
 **getDefaultFromOtherRepo** | **Boolean**| if true, return all the default entities | [optional]

### Return type

[**ResponseDTOString**](ResponseDTOString.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json, application/yaml
 - **Accept**: application/json, application/yaml

