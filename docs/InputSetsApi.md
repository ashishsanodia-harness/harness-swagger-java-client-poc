# InputSetsApi

All URIs are relative to *https://app.harness.io/gateway*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteInputSet**](InputSetsApi.md#deleteInputSet) | **DELETE** /pipeline/api/inputSets/{inputSetIdentifier} | Delete the Input Set by Identifier
[**getInputSet**](InputSetsApi.md#getInputSet) | **GET** /pipeline/api/inputSets/{inputSetIdentifier} | Gets Input Set for a given identifier. Throws error if no Input Set exists for the given identifier.
[**getOverlayInputSet**](InputSetsApi.md#getOverlayInputSet) | **GET** /pipeline/api/inputSets/overlay/{inputSetIdentifier} | Gets an Overlay Input Set by identifier
[**listInputSet**](InputSetsApi.md#listInputSet) | **GET** /pipeline/api/inputSets | List all Input Sets for a pipeline
[**mergeInputSets**](InputSetsApi.md#mergeInputSets) | **POST** /pipeline/api/inputSets/merge | Merge given Input Sets into a single Runtime Input YAML
[**mergeRuntimeInputIntoPipeline**](InputSetsApi.md#mergeRuntimeInputIntoPipeline) | **POST** /pipeline/api/inputSets/mergeWithTemplateYaml | Merge given Runtime Input YAML into the Pipeline
[**postInputSet**](InputSetsApi.md#postInputSet) | **POST** /pipeline/api/inputSets | Create an Input Set for a Pipeline
[**postOverlayInputSet**](InputSetsApi.md#postOverlayInputSet) | **POST** /pipeline/api/inputSets/overlay | Create an Overlay Input Set for a pipeline
[**putInputSet**](InputSetsApi.md#putInputSet) | **PUT** /pipeline/api/inputSets/{inputSetIdentifier} | Update Input Set for Pipeline
[**putOverlayInputSet**](InputSetsApi.md#putOverlayInputSet) | **PUT** /pipeline/api/inputSets/overlay/{inputSetIdentifier} | Update an Overlay Input Set for a pipeline
[**runtimeInputTemplate**](InputSetsApi.md#runtimeInputTemplate) | **POST** /pipeline/api/inputSets/template | Fetch Runtime Input Template for a Pipeline

<a name="deleteInputSet"></a>
# **deleteInputSet**
> ResponseDTOBoolean deleteInputSet(inputSetIdentifier, accountIdentifier, orgIdentifier, projectIdentifier, pipelineIdentifier, ifMatch, branch, repoIdentifier, rootFolder, filePath, commitMsg, lastObjectId)

Delete the Input Set by Identifier

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.InputSetsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

InputSetsApi apiInstance = new InputSetsApi();
String inputSetIdentifier = "inputSetIdentifier_example"; // String | This is the Id of the Input Set that needs to be deleted. An error is thrown if no Input Set exists for this Id.
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the entity.
String orgIdentifier = "orgIdentifier_example"; // String | Organization Identifier for the entity.
String projectIdentifier = "projectIdentifier_example"; // String | Project Identifier for the entity.
String pipelineIdentifier = "pipelineIdentifier_example"; // String | Pipeline identifier for the Input Set. Input Set will be deleted for the Pipeline corresponding to this Identifier
String ifMatch = "ifMatch_example"; // String | Version of entity to match
String branch = "branch_example"; // String | Branch Name
String repoIdentifier = "repoIdentifier_example"; // String | Git Sync Config Id
String rootFolder = "rootFolder_example"; // String | Root Folder Path of the Entity
String filePath = "filePath_example"; // String | File Path of the Entity
String commitMsg = "commitMsg_example"; // String | Commit Message
String lastObjectId = "lastObjectId_example"; // String | Last Object Id
try {
    ResponseDTOBoolean result = apiInstance.deleteInputSet(inputSetIdentifier, accountIdentifier, orgIdentifier, projectIdentifier, pipelineIdentifier, ifMatch, branch, repoIdentifier, rootFolder, filePath, commitMsg, lastObjectId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InputSetsApi#deleteInputSet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inputSetIdentifier** | **String**| This is the Id of the Input Set that needs to be deleted. An error is thrown if no Input Set exists for this Id. |
 **accountIdentifier** | **String**| Account Identifier for the entity. |
 **orgIdentifier** | **String**| Organization Identifier for the entity. |
 **projectIdentifier** | **String**| Project Identifier for the entity. |
 **pipelineIdentifier** | **String**| Pipeline identifier for the Input Set. Input Set will be deleted for the Pipeline corresponding to this Identifier |
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

<a name="getInputSet"></a>
# **getInputSet**
> ResponseDTOInputSetResponse getInputSet(inputSetIdentifier, accountIdentifier, orgIdentifier, projectIdentifier, pipelineIdentifier, branch, repoIdentifier, getDefaultFromOtherRepo)

Gets Input Set for a given identifier. Throws error if no Input Set exists for the given identifier.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.InputSetsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

InputSetsApi apiInstance = new InputSetsApi();
String inputSetIdentifier = "inputSetIdentifier_example"; // String | Identifier of the Input Set
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the entity.
String orgIdentifier = "orgIdentifier_example"; // String | Organization Identifier for the entity.
String projectIdentifier = "projectIdentifier_example"; // String | Project Identifier for the entity.
String pipelineIdentifier = "pipelineIdentifier_example"; // String | Pipeline ID for the Input Set. The Input Set will work only for the Pipeline corresponding to this identifier.
String branch = "branch_example"; // String | Branch Name
String repoIdentifier = "repoIdentifier_example"; // String | Git Sync Config Id
Boolean getDefaultFromOtherRepo = true; // Boolean | if true, return all the default entities
try {
    ResponseDTOInputSetResponse result = apiInstance.getInputSet(inputSetIdentifier, accountIdentifier, orgIdentifier, projectIdentifier, pipelineIdentifier, branch, repoIdentifier, getDefaultFromOtherRepo);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InputSetsApi#getInputSet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inputSetIdentifier** | **String**| Identifier of the Input Set |
 **accountIdentifier** | **String**| Account Identifier for the entity. |
 **orgIdentifier** | **String**| Organization Identifier for the entity. |
 **projectIdentifier** | **String**| Project Identifier for the entity. |
 **pipelineIdentifier** | **String**| Pipeline ID for the Input Set. The Input Set will work only for the Pipeline corresponding to this identifier. |
 **branch** | **String**| Branch Name | [optional]
 **repoIdentifier** | **String**| Git Sync Config Id | [optional]
 **getDefaultFromOtherRepo** | **Boolean**| if true, return all the default entities | [optional]

### Return type

[**ResponseDTOInputSetResponse**](ResponseDTOInputSetResponse.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/yaml

<a name="getOverlayInputSet"></a>
# **getOverlayInputSet**
> ResponseDTOOverlayInputSetResponse getOverlayInputSet(inputSetIdentifier, accountIdentifier, orgIdentifier, projectIdentifier, pipelineIdentifier, branch, repoIdentifier, getDefaultFromOtherRepo)

Gets an Overlay Input Set by identifier

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.InputSetsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

InputSetsApi apiInstance = new InputSetsApi();
String inputSetIdentifier = "inputSetIdentifier_example"; // String | Identifier of the Overlay Input Set
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the entity.
String orgIdentifier = "orgIdentifier_example"; // String | Organization Identifier for the entity.
String projectIdentifier = "projectIdentifier_example"; // String | Project Identifier for the entity.
String pipelineIdentifier = "pipelineIdentifier_example"; // String | This is the Pipeline Id specific to the Overlay Input Set. Overlay Input Set corresponding to the Pipeline with this Id would be fetched
String branch = "branch_example"; // String | Branch Name
String repoIdentifier = "repoIdentifier_example"; // String | Git Sync Config Id
Boolean getDefaultFromOtherRepo = true; // Boolean | if true, return all the default entities
try {
    ResponseDTOOverlayInputSetResponse result = apiInstance.getOverlayInputSet(inputSetIdentifier, accountIdentifier, orgIdentifier, projectIdentifier, pipelineIdentifier, branch, repoIdentifier, getDefaultFromOtherRepo);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InputSetsApi#getOverlayInputSet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inputSetIdentifier** | **String**| Identifier of the Overlay Input Set |
 **accountIdentifier** | **String**| Account Identifier for the entity. |
 **orgIdentifier** | **String**| Organization Identifier for the entity. |
 **projectIdentifier** | **String**| Project Identifier for the entity. |
 **pipelineIdentifier** | **String**| This is the Pipeline Id specific to the Overlay Input Set. Overlay Input Set corresponding to the Pipeline with this Id would be fetched |
 **branch** | **String**| Branch Name | [optional]
 **repoIdentifier** | **String**| Git Sync Config Id | [optional]
 **getDefaultFromOtherRepo** | **Boolean**| if true, return all the default entities | [optional]

### Return type

[**ResponseDTOOverlayInputSetResponse**](ResponseDTOOverlayInputSetResponse.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/yaml

<a name="listInputSet"></a>
# **listInputSet**
> ResponseDTOPageResponseInputSetSummaryResponse listInputSet(accountIdentifier, orgIdentifier, projectIdentifier, pipelineIdentifier, pageIndex, pageSize, inputSetType, searchTerm, sortOrders, branch, repoIdentifier, getDefaultFromOtherRepo)

List all Input Sets for a pipeline

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.InputSetsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

InputSetsApi apiInstance = new InputSetsApi();
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the entity.
String orgIdentifier = "orgIdentifier_example"; // String | Organization Identifier for the entity.
String projectIdentifier = "projectIdentifier_example"; // String | Project Identifier for the entity.
String pipelineIdentifier = "pipelineIdentifier_example"; // String | Pipeline identifier for which we need the Input Sets list.
Integer pageIndex = 0; // Integer | Indicates the number of pages. Results for these pages will be retrieved.
Integer pageSize = 100; // Integer | The number of the elements to fetch
String inputSetType = "ALL"; // String | Type of Input Set needed: \"INPUT_SET\", or \"OVERLAY_INPUT_SET\", or \"ALL\". If nothing is sent, ALL is considered.
String searchTerm = "searchTerm_example"; // String | Search term to filter out Input Sets based on name, identifier, tags.
List<String> sortOrders = Arrays.asList("sortOrders_example"); // List<String> | Sort criteria for the elements.
String branch = "branch_example"; // String | Branch Name
String repoIdentifier = "repoIdentifier_example"; // String | Git Sync Config Id
Boolean getDefaultFromOtherRepo = true; // Boolean | if true, return all the default entities
try {
    ResponseDTOPageResponseInputSetSummaryResponse result = apiInstance.listInputSet(accountIdentifier, orgIdentifier, projectIdentifier, pipelineIdentifier, pageIndex, pageSize, inputSetType, searchTerm, sortOrders, branch, repoIdentifier, getDefaultFromOtherRepo);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InputSetsApi#listInputSet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountIdentifier** | **String**| Account Identifier for the entity. |
 **orgIdentifier** | **String**| Organization Identifier for the entity. |
 **projectIdentifier** | **String**| Project Identifier for the entity. |
 **pipelineIdentifier** | **String**| Pipeline identifier for which we need the Input Sets list. |
 **pageIndex** | **Integer**| Indicates the number of pages. Results for these pages will be retrieved. | [optional] [default to 0]
 **pageSize** | **Integer**| The number of the elements to fetch | [optional] [default to 100]
 **inputSetType** | **String**| Type of Input Set needed: \&quot;INPUT_SET\&quot;, or \&quot;OVERLAY_INPUT_SET\&quot;, or \&quot;ALL\&quot;. If nothing is sent, ALL is considered. | [optional] [default to ALL] [enum: ALL, INPUT_SET, OVERLAY_INPUT_SET]
 **searchTerm** | **String**| Search term to filter out Input Sets based on name, identifier, tags. | [optional]
 **sortOrders** | [**List&lt;String&gt;**](String.md)| Sort criteria for the elements. | [optional]
 **branch** | **String**| Branch Name | [optional]
 **repoIdentifier** | **String**| Git Sync Config Id | [optional]
 **getDefaultFromOtherRepo** | **Boolean**| if true, return all the default entities | [optional]

### Return type

[**ResponseDTOPageResponseInputSetSummaryResponse**](ResponseDTOPageResponseInputSetSummaryResponse.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/yaml

<a name="mergeInputSets"></a>
# **mergeInputSets**
> ResponseDTOMergeInputSetResponse mergeInputSets(body, accountIdentifier, orgIdentifier, projectIdentifier, pipelineIdentifier, pipelineBranch, pipelineRepoID, branch, repoIdentifier, getDefaultFromOtherRepo)

Merge given Input Sets into a single Runtime Input YAML

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.InputSetsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

InputSetsApi apiInstance = new InputSetsApi();
MergeInputSetRequest body = new MergeInputSetRequest(); // MergeInputSetRequest | 
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the entity.
String orgIdentifier = "orgIdentifier_example"; // String | Organization Identifier for the entity.
String projectIdentifier = "projectIdentifier_example"; // String | Project Identifier for the entity.
String pipelineIdentifier = "pipelineIdentifier_example"; // String | Identifier of the Pipeline to which the Input Sets belong
String pipelineBranch = "pipelineBranch_example"; // String | Github branch of the Pipeline to which the Input Sets belong
String pipelineRepoID = "pipelineRepoID_example"; // String | Github Repo identifier of the Pipeline to which the Input Sets belong
String branch = "branch_example"; // String | Branch Name
String repoIdentifier = "repoIdentifier_example"; // String | Git Sync Config Id
Boolean getDefaultFromOtherRepo = true; // Boolean | if true, return all the default entities
try {
    ResponseDTOMergeInputSetResponse result = apiInstance.mergeInputSets(body, accountIdentifier, orgIdentifier, projectIdentifier, pipelineIdentifier, pipelineBranch, pipelineRepoID, branch, repoIdentifier, getDefaultFromOtherRepo);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InputSetsApi#mergeInputSets");
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
 **pipelineIdentifier** | **String**| Identifier of the Pipeline to which the Input Sets belong |
 **pipelineBranch** | **String**| Github branch of the Pipeline to which the Input Sets belong | [optional]
 **pipelineRepoID** | **String**| Github Repo identifier of the Pipeline to which the Input Sets belong | [optional]
 **branch** | **String**| Branch Name | [optional]
 **repoIdentifier** | **String**| Git Sync Config Id | [optional]
 **getDefaultFromOtherRepo** | **Boolean**| if true, return all the default entities | [optional]

### Return type

[**ResponseDTOMergeInputSetResponse**](ResponseDTOMergeInputSetResponse.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json, application/yaml
 - **Accept**: application/json, application/yaml

<a name="mergeRuntimeInputIntoPipeline"></a>
# **mergeRuntimeInputIntoPipeline**
> ResponseDTOMergeInputSetResponse mergeRuntimeInputIntoPipeline(body, accountIdentifier, orgIdentifier, projectIdentifier, pipelineIdentifier, pipelineBranch, pipelineRepoID, branch, repoIdentifier, getDefaultFromOtherRepo)

Merge given Runtime Input YAML into the Pipeline

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.InputSetsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

InputSetsApi apiInstance = new InputSetsApi();
MergeInputSetTemplateRequest body = new MergeInputSetTemplateRequest(); // MergeInputSetTemplateRequest | 
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the entity.
String orgIdentifier = "orgIdentifier_example"; // String | Organization Identifier for the entity.
String projectIdentifier = "projectIdentifier_example"; // String | Project Identifier for the entity.
String pipelineIdentifier = "pipelineIdentifier_example"; // String | Identifier of the Pipeline to which the Input Sets belong
String pipelineBranch = "pipelineBranch_example"; // String | Github branch of the Pipeline to which the Input Sets belong
String pipelineRepoID = "pipelineRepoID_example"; // String | Github Repo identifier of the Pipeline to which the Input Sets belong
String branch = "branch_example"; // String | Branch Name
String repoIdentifier = "repoIdentifier_example"; // String | Git Sync Config Id
Boolean getDefaultFromOtherRepo = true; // Boolean | if true, return all the default entities
try {
    ResponseDTOMergeInputSetResponse result = apiInstance.mergeRuntimeInputIntoPipeline(body, accountIdentifier, orgIdentifier, projectIdentifier, pipelineIdentifier, pipelineBranch, pipelineRepoID, branch, repoIdentifier, getDefaultFromOtherRepo);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InputSetsApi#mergeRuntimeInputIntoPipeline");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**MergeInputSetTemplateRequest**](MergeInputSetTemplateRequest.md)|  |
 **accountIdentifier** | **String**| Account Identifier for the entity. |
 **orgIdentifier** | **String**| Organization Identifier for the entity. |
 **projectIdentifier** | **String**| Project Identifier for the entity. |
 **pipelineIdentifier** | **String**| Identifier of the Pipeline to which the Input Sets belong |
 **pipelineBranch** | **String**| Github branch of the Pipeline to which the Input Sets belong | [optional]
 **pipelineRepoID** | **String**| Github Repo identifier of the Pipeline to which the Input Sets belong | [optional]
 **branch** | **String**| Branch Name | [optional]
 **repoIdentifier** | **String**| Git Sync Config Id | [optional]
 **getDefaultFromOtherRepo** | **Boolean**| if true, return all the default entities | [optional]

### Return type

[**ResponseDTOMergeInputSetResponse**](ResponseDTOMergeInputSetResponse.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json, application/yaml
 - **Accept**: application/json, application/yaml

<a name="postInputSet"></a>
# **postInputSet**
> ResponseDTOInputSetResponse postInputSet(body, accountIdentifier, orgIdentifier, projectIdentifier, pipelineIdentifier, pipelineBranch, pipelineRepoID, branch, repoIdentifier, rootFolder, filePath, commitMsg, isNewBranch, baseBranch)

Create an Input Set for a Pipeline

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.InputSetsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

InputSetsApi apiInstance = new InputSetsApi();
String body = "body_example"; // String | Input set YAML to be created. The account, org, project, and pipeline identifiers inside the YAML should match the query parameters
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the entity.
String orgIdentifier = "orgIdentifier_example"; // String | Organization Identifier for the entity.
String projectIdentifier = "projectIdentifier_example"; // String | Project Identifier for the entity.
String pipelineIdentifier = "pipelineIdentifier_example"; // String | Pipeline identifier for the input set. The input set will work only for the pipeline corresponding to this identifier.
String pipelineBranch = "pipelineBranch_example"; // String | Github branch of the Pipeline for which the Input Set is to be created
String pipelineRepoID = "pipelineRepoID_example"; // String | Github Repo identifier of the Pipeline for which the Input Set is to be created
String branch = "branch_example"; // String | Branch Name
String repoIdentifier = "repoIdentifier_example"; // String | Git Sync Config Id
String rootFolder = "rootFolder_example"; // String | Root Folder Path of the Entity
String filePath = "filePath_example"; // String | File Path of the Entity
String commitMsg = "commitMsg_example"; // String | File Path of the Entity
Boolean isNewBranch = false; // Boolean | Checks the new branch
String baseBranch = "baseBranch_example"; // String | Default Branch
try {
    ResponseDTOInputSetResponse result = apiInstance.postInputSet(body, accountIdentifier, orgIdentifier, projectIdentifier, pipelineIdentifier, pipelineBranch, pipelineRepoID, branch, repoIdentifier, rootFolder, filePath, commitMsg, isNewBranch, baseBranch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InputSetsApi#postInputSet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**String**](String.md)| Input set YAML to be created. The account, org, project, and pipeline identifiers inside the YAML should match the query parameters |
 **accountIdentifier** | **String**| Account Identifier for the entity. |
 **orgIdentifier** | **String**| Organization Identifier for the entity. |
 **projectIdentifier** | **String**| Project Identifier for the entity. |
 **pipelineIdentifier** | **String**| Pipeline identifier for the input set. The input set will work only for the pipeline corresponding to this identifier. |
 **pipelineBranch** | **String**| Github branch of the Pipeline for which the Input Set is to be created | [optional]
 **pipelineRepoID** | **String**| Github Repo identifier of the Pipeline for which the Input Set is to be created | [optional]
 **branch** | **String**| Branch Name | [optional]
 **repoIdentifier** | **String**| Git Sync Config Id | [optional]
 **rootFolder** | **String**| Root Folder Path of the Entity | [optional]
 **filePath** | **String**| File Path of the Entity | [optional]
 **commitMsg** | **String**| File Path of the Entity | [optional]
 **isNewBranch** | **Boolean**| Checks the new branch | [optional] [default to false]
 **baseBranch** | **String**| Default Branch | [optional]

### Return type

[**ResponseDTOInputSetResponse**](ResponseDTOInputSetResponse.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json, application/yaml
 - **Accept**: application/json, application/yaml

<a name="postOverlayInputSet"></a>
# **postOverlayInputSet**
> ResponseDTOOverlayInputSetResponse postOverlayInputSet(body, accountIdentifier, orgIdentifier, projectIdentifier, pipelineIdentifier, branch, repoIdentifier, rootFolder, filePath, commitMsg, isNewBranch, baseBranch)

Create an Overlay Input Set for a pipeline

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.InputSetsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

InputSetsApi apiInstance = new InputSetsApi();
String body = "body_example"; // String | Overlay Input Set YAML to be created. The Account, Org, Project, and Pipeline identifiers inside the YAML should match the query parameters
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the entity.
String orgIdentifier = "orgIdentifier_example"; // String | Organization Identifier for the entity.
String projectIdentifier = "projectIdentifier_example"; // String | Project Identifier for the entity.
String pipelineIdentifier = "pipelineIdentifier_example"; // String | Pipeline identifier for the overlay input set. The Overlay Input Set will work only for the Pipeline corresponding to this identifier.
String branch = "branch_example"; // String | Branch Name
String repoIdentifier = "repoIdentifier_example"; // String | Git Sync Config Id
String rootFolder = "rootFolder_example"; // String | Root Folder Path of the Entity
String filePath = "filePath_example"; // String | File Path of the Entity
String commitMsg = "commitMsg_example"; // String | File Path of the Entity
Boolean isNewBranch = false; // Boolean | Checks the new branch
String baseBranch = "baseBranch_example"; // String | Default Branch
try {
    ResponseDTOOverlayInputSetResponse result = apiInstance.postOverlayInputSet(body, accountIdentifier, orgIdentifier, projectIdentifier, pipelineIdentifier, branch, repoIdentifier, rootFolder, filePath, commitMsg, isNewBranch, baseBranch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InputSetsApi#postOverlayInputSet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**String**](String.md)| Overlay Input Set YAML to be created. The Account, Org, Project, and Pipeline identifiers inside the YAML should match the query parameters |
 **accountIdentifier** | **String**| Account Identifier for the entity. |
 **orgIdentifier** | **String**| Organization Identifier for the entity. |
 **projectIdentifier** | **String**| Project Identifier for the entity. |
 **pipelineIdentifier** | **String**| Pipeline identifier for the overlay input set. The Overlay Input Set will work only for the Pipeline corresponding to this identifier. |
 **branch** | **String**| Branch Name | [optional]
 **repoIdentifier** | **String**| Git Sync Config Id | [optional]
 **rootFolder** | **String**| Root Folder Path of the Entity | [optional]
 **filePath** | **String**| File Path of the Entity | [optional]
 **commitMsg** | **String**| File Path of the Entity | [optional]
 **isNewBranch** | **Boolean**| Checks the new branch | [optional] [default to false]
 **baseBranch** | **String**| Default Branch | [optional]

### Return type

[**ResponseDTOOverlayInputSetResponse**](ResponseDTOOverlayInputSetResponse.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json, application/yaml
 - **Accept**: application/json, application/yaml

<a name="putInputSet"></a>
# **putInputSet**
> ResponseDTOInputSetResponse putInputSet(body, accountIdentifier, orgIdentifier, projectIdentifier, pipelineIdentifier, inputSetIdentifier, ifMatch, pipelineBranch, pipelineRepoID, branch, repoIdentifier, rootFolder, filePath, commitMsg, lastObjectId, baseBranch)

Update Input Set for Pipeline

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.InputSetsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

InputSetsApi apiInstance = new InputSetsApi();
String body = "body_example"; // String | Input set YAML to be updated. The Account, Org, Project, and Pipeline Ids inside the YAML should match the query parameters
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the entity.
String orgIdentifier = "orgIdentifier_example"; // String | Organization Identifier for the entity.
String projectIdentifier = "projectIdentifier_example"; // String | Project Identifier for the entity.
String pipelineIdentifier = "pipelineIdentifier_example"; // String | Pipeline Id for the Input Set. The Input Set will work only for the Pipeline corresponding to this Id.
String inputSetIdentifier = "inputSetIdentifier_example"; // String | Identifier for the Input Set that needs to be updated. An Input Set corresponding to this identifier should already exist.
String ifMatch = "ifMatch_example"; // String | Version of entity to match
String pipelineBranch = "pipelineBranch_example"; // String | Github branch of the Pipeline for which the Input Set is to be created
String pipelineRepoID = "pipelineRepoID_example"; // String | Github Repo Id of the Pipeline for which the Input Set is to be created
String branch = "branch_example"; // String | Branch Name
String repoIdentifier = "repoIdentifier_example"; // String | Git Sync Config Id
String rootFolder = "rootFolder_example"; // String | Root Folder Path of the Entity
String filePath = "filePath_example"; // String | Root Folder Path of the Entity
String commitMsg = "commitMsg_example"; // String | Commit Message
String lastObjectId = "lastObjectId_example"; // String | Last Object Id
String baseBranch = "baseBranch_example"; // String | Default Branch
try {
    ResponseDTOInputSetResponse result = apiInstance.putInputSet(body, accountIdentifier, orgIdentifier, projectIdentifier, pipelineIdentifier, inputSetIdentifier, ifMatch, pipelineBranch, pipelineRepoID, branch, repoIdentifier, rootFolder, filePath, commitMsg, lastObjectId, baseBranch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InputSetsApi#putInputSet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**String**](String.md)| Input set YAML to be updated. The Account, Org, Project, and Pipeline Ids inside the YAML should match the query parameters |
 **accountIdentifier** | **String**| Account Identifier for the entity. |
 **orgIdentifier** | **String**| Organization Identifier for the entity. |
 **projectIdentifier** | **String**| Project Identifier for the entity. |
 **pipelineIdentifier** | **String**| Pipeline Id for the Input Set. The Input Set will work only for the Pipeline corresponding to this Id. |
 **inputSetIdentifier** | **String**| Identifier for the Input Set that needs to be updated. An Input Set corresponding to this identifier should already exist. |
 **ifMatch** | **String**| Version of entity to match | [optional]
 **pipelineBranch** | **String**| Github branch of the Pipeline for which the Input Set is to be created | [optional]
 **pipelineRepoID** | **String**| Github Repo Id of the Pipeline for which the Input Set is to be created | [optional]
 **branch** | **String**| Branch Name | [optional]
 **repoIdentifier** | **String**| Git Sync Config Id | [optional]
 **rootFolder** | **String**| Root Folder Path of the Entity | [optional]
 **filePath** | **String**| Root Folder Path of the Entity | [optional]
 **commitMsg** | **String**| Commit Message | [optional]
 **lastObjectId** | **String**| Last Object Id | [optional]
 **baseBranch** | **String**| Default Branch | [optional]

### Return type

[**ResponseDTOInputSetResponse**](ResponseDTOInputSetResponse.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json, application/yaml
 - **Accept**: application/json, application/yaml

<a name="putOverlayInputSet"></a>
# **putOverlayInputSet**
> ResponseDTOOverlayInputSetResponse putOverlayInputSet(body, accountIdentifier, orgIdentifier, projectIdentifier, pipelineIdentifier, inputSetIdentifier, ifMatch, branch, repoIdentifier, rootFolder, filePath, commitMsg, lastObjectId, baseBranch)

Update an Overlay Input Set for a pipeline

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.InputSetsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

InputSetsApi apiInstance = new InputSetsApi();
String body = "body_example"; // String | Overlay Input Set YAML to be updated. The Account, Org, Project, and Pipeline identifiers inside the YAML should match the query parameters, and the Overlay Input Set identifier cannot be changed.
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the entity.
String orgIdentifier = "orgIdentifier_example"; // String | Organization Identifier for the entity.
String projectIdentifier = "projectIdentifier_example"; // String | Project Identifier for the entity.
String pipelineIdentifier = "pipelineIdentifier_example"; // String | Pipeline identifier for the Overlay Input Set. The Overlay Input Set will work only for the Pipeline corresponding to this identifier.
String inputSetIdentifier = "inputSetIdentifier_example"; // String | Identifier for the Overlay Input Set that needs to be updated. An Overlay Input Set corresponding to this identifier should already exist.
String ifMatch = "ifMatch_example"; // String | Version of entity to match
String branch = "branch_example"; // String | Branch Name
String repoIdentifier = "repoIdentifier_example"; // String | Git Sync Config Id
String rootFolder = "rootFolder_example"; // String | Root Folder Path of the Entity
String filePath = "filePath_example"; // String | Root Folder Path of the Entity
String commitMsg = "commitMsg_example"; // String | Commit Message
String lastObjectId = "lastObjectId_example"; // String | Last Object Id
String baseBranch = "baseBranch_example"; // String | Default Branch
try {
    ResponseDTOOverlayInputSetResponse result = apiInstance.putOverlayInputSet(body, accountIdentifier, orgIdentifier, projectIdentifier, pipelineIdentifier, inputSetIdentifier, ifMatch, branch, repoIdentifier, rootFolder, filePath, commitMsg, lastObjectId, baseBranch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InputSetsApi#putOverlayInputSet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**String**](String.md)| Overlay Input Set YAML to be updated. The Account, Org, Project, and Pipeline identifiers inside the YAML should match the query parameters, and the Overlay Input Set identifier cannot be changed. |
 **accountIdentifier** | **String**| Account Identifier for the entity. |
 **orgIdentifier** | **String**| Organization Identifier for the entity. |
 **projectIdentifier** | **String**| Project Identifier for the entity. |
 **pipelineIdentifier** | **String**| Pipeline identifier for the Overlay Input Set. The Overlay Input Set will work only for the Pipeline corresponding to this identifier. |
 **inputSetIdentifier** | **String**| Identifier for the Overlay Input Set that needs to be updated. An Overlay Input Set corresponding to this identifier should already exist. |
 **ifMatch** | **String**| Version of entity to match | [optional]
 **branch** | **String**| Branch Name | [optional]
 **repoIdentifier** | **String**| Git Sync Config Id | [optional]
 **rootFolder** | **String**| Root Folder Path of the Entity | [optional]
 **filePath** | **String**| Root Folder Path of the Entity | [optional]
 **commitMsg** | **String**| Commit Message | [optional]
 **lastObjectId** | **String**| Last Object Id | [optional]
 **baseBranch** | **String**| Default Branch | [optional]

### Return type

[**ResponseDTOOverlayInputSetResponse**](ResponseDTOOverlayInputSetResponse.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json, application/yaml
 - **Accept**: application/json, application/yaml

<a name="runtimeInputTemplate"></a>
# **runtimeInputTemplate**
> ResponseDTOInputSetTemplateWithReplacedExpressionsResponse runtimeInputTemplate(accountIdentifier, orgIdentifier, projectIdentifier, pipelineIdentifier, body, branch, repoIdentifier, getDefaultFromOtherRepo)

Fetch Runtime Input Template for a Pipeline

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.InputSetsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

InputSetsApi apiInstance = new InputSetsApi();
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the entity.
String orgIdentifier = "orgIdentifier_example"; // String | Organization Identifier for the entity.
String projectIdentifier = "projectIdentifier_example"; // String | Project Identifier for the entity.
String pipelineIdentifier = "pipelineIdentifier_example"; // String | Pipeline identifier for which we need the Runtime Input Template.
InputSetTemplateRequest body = new InputSetTemplateRequest(); // InputSetTemplateRequest | 
String branch = "branch_example"; // String | Branch Name
String repoIdentifier = "repoIdentifier_example"; // String | Git Sync Config Id
Boolean getDefaultFromOtherRepo = true; // Boolean | if true, return all the default entities
try {
    ResponseDTOInputSetTemplateWithReplacedExpressionsResponse result = apiInstance.runtimeInputTemplate(accountIdentifier, orgIdentifier, projectIdentifier, pipelineIdentifier, body, branch, repoIdentifier, getDefaultFromOtherRepo);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InputSetsApi#runtimeInputTemplate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountIdentifier** | **String**| Account Identifier for the entity. |
 **orgIdentifier** | **String**| Organization Identifier for the entity. |
 **projectIdentifier** | **String**| Project Identifier for the entity. |
 **pipelineIdentifier** | **String**| Pipeline identifier for which we need the Runtime Input Template. |
 **body** | [**InputSetTemplateRequest**](InputSetTemplateRequest.md)|  | [optional]
 **branch** | **String**| Branch Name | [optional]
 **repoIdentifier** | **String**| Git Sync Config Id | [optional]
 **getDefaultFromOtherRepo** | **Boolean**| if true, return all the default entities | [optional]

### Return type

[**ResponseDTOInputSetTemplateWithReplacedExpressionsResponse**](ResponseDTOInputSetTemplateWithReplacedExpressionsResponse.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json, application/yaml
 - **Accept**: application/json, application/yaml

