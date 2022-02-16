# ScmApi

All URIs are relative to *https://app.harness.io/gateway*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createPR**](ScmApi.md#createPR) | **POST** /ng/api/scm/createPR | creates a Pull Request
[**getFileContent**](ScmApi.md#getFileContent) | **GET** /ng/api/scm/fileContent | Gets Git File Content
[**getListOfBranchesByConnector**](ScmApi.md#getListOfBranchesByConnector) | **GET** /ng/api/scm/listRepoBranches | Lists Branches of given Repo by referenced Connector Identifier
[**getListOfBranchesByGitConfig**](ScmApi.md#getListOfBranchesByGitConfig) | **GET** /ng/api/scm/listBranchesByGitConfig | Lists Branches by given Git Sync Config Id
[**isSaasGit**](ScmApi.md#isSaasGit) | **POST** /ng/api/scm/isSaasGit | Checks if Saas is possible for given Repo Url

<a name="createPR"></a>
# **createPR**
> ResponseDTOPRDetails createPR(body)

creates a Pull Request

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ScmApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

ScmApi apiInstance = new ScmApi();
GitPRCreateRequest body = new GitPRCreateRequest(); // GitPRCreateRequest | Details to create a PR
try {
    ResponseDTOPRDetails result = apiInstance.createPR(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ScmApi#createPR");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**GitPRCreateRequest**](GitPRCreateRequest.md)| Details to create a PR |

### Return type

[**ResponseDTOPRDetails**](ResponseDTOPRDetails.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json, text/yaml, text/html
 - **Accept**: application/json, application/yaml, text/yaml, text/html

<a name="getFileContent"></a>
# **getFileContent**
> ResponseDTOGitFileContent getFileContent(yamlGitConfigIdentifier, accountIdentifier, filePath, orgIdentifier, projectIdentifier, branch, commitId)

Gets Git File Content

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ScmApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

ScmApi apiInstance = new ScmApi();
String yamlGitConfigIdentifier = "yamlGitConfigIdentifier_example"; // String | Git Sync Config Id
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the Entity
String filePath = "filePath_example"; // String | File Path
String orgIdentifier = "orgIdentifier_example"; // String | Organization Identifier for the Entity
String projectIdentifier = "projectIdentifier_example"; // String | Project Identifier for the Entity
String branch = "branch_example"; // String | Branch Name
String commitId = "commitId_example"; // String | Commit Id
try {
    ResponseDTOGitFileContent result = apiInstance.getFileContent(yamlGitConfigIdentifier, accountIdentifier, filePath, orgIdentifier, projectIdentifier, branch, commitId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ScmApi#getFileContent");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **yamlGitConfigIdentifier** | **String**| Git Sync Config Id |
 **accountIdentifier** | **String**| Account Identifier for the Entity |
 **filePath** | **String**| File Path |
 **orgIdentifier** | **String**| Organization Identifier for the Entity | [optional]
 **projectIdentifier** | **String**| Project Identifier for the Entity | [optional]
 **branch** | **String**| Branch Name | [optional]
 **commitId** | **String**| Commit Id | [optional]

### Return type

[**ResponseDTOGitFileContent**](ResponseDTOGitFileContent.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/yaml, text/yaml, text/html

<a name="getListOfBranchesByConnector"></a>
# **getListOfBranchesByConnector**
> ResponseDTOListString getListOfBranchesByConnector(connectorIdentifierRef, accountIdentifier, orgIdentifier, projectIdentifier, repoURL, page, size, searchTerm)

Lists Branches of given Repo by referenced Connector Identifier

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ScmApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

ScmApi apiInstance = new ScmApi();
String connectorIdentifierRef = "connectorIdentifierRef_example"; // String | Connector Identifier Reference
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the Entity
String orgIdentifier = "orgIdentifier_example"; // String | Organization Identifier for the Entity
String projectIdentifier = "projectIdentifier_example"; // String | Project Identifier for the Entity
String repoURL = "repoURL_example"; // String | Repo URL
Integer page = 0; // Integer | Indicates the number of pages. Results for these pages will be retrieved.
Integer size = 50; // Integer | The number of the elements to fetch
String searchTerm = ""; // String | Search Term
try {
    ResponseDTOListString result = apiInstance.getListOfBranchesByConnector(connectorIdentifierRef, accountIdentifier, orgIdentifier, projectIdentifier, repoURL, page, size, searchTerm);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ScmApi#getListOfBranchesByConnector");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **connectorIdentifierRef** | **String**| Connector Identifier Reference | [optional]
 **accountIdentifier** | **String**| Account Identifier for the Entity | [optional]
 **orgIdentifier** | **String**| Organization Identifier for the Entity | [optional]
 **projectIdentifier** | **String**| Project Identifier for the Entity | [optional]
 **repoURL** | **String**| Repo URL | [optional]
 **page** | **Integer**| Indicates the number of pages. Results for these pages will be retrieved. | [optional] [default to 0]
 **size** | **Integer**| The number of the elements to fetch | [optional] [default to 50]
 **searchTerm** | **String**| Search Term | [optional]

### Return type

[**ResponseDTOListString**](ResponseDTOListString.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/yaml, text/yaml, text/html

<a name="getListOfBranchesByGitConfig"></a>
# **getListOfBranchesByGitConfig**
> ResponseDTOListString getListOfBranchesByGitConfig(yamlGitConfigIdentifier, accountIdentifier, orgIdentifier, projectIdentifier, page, size, searchTerm)

Lists Branches by given Git Sync Config Id

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ScmApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

ScmApi apiInstance = new ScmApi();
String yamlGitConfigIdentifier = "yamlGitConfigIdentifier_example"; // String | Git Sync Config Id
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the Entity
String orgIdentifier = "orgIdentifier_example"; // String | Organization Identifier for the Entity
String projectIdentifier = "projectIdentifier_example"; // String | Project Identifier for the Entity
Integer page = 0; // Integer | Indicates the number of pages. Results for these pages will be retrieved.
Integer size = 50; // Integer | The number of the elements to fetch
String searchTerm = ""; // String | Search Term
try {
    ResponseDTOListString result = apiInstance.getListOfBranchesByGitConfig(yamlGitConfigIdentifier, accountIdentifier, orgIdentifier, projectIdentifier, page, size, searchTerm);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ScmApi#getListOfBranchesByGitConfig");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **yamlGitConfigIdentifier** | **String**| Git Sync Config Id | [optional]
 **accountIdentifier** | **String**| Account Identifier for the Entity | [optional]
 **orgIdentifier** | **String**| Organization Identifier for the Entity | [optional]
 **projectIdentifier** | **String**| Project Identifier for the Entity | [optional]
 **page** | **Integer**| Indicates the number of pages. Results for these pages will be retrieved. | [optional] [default to 0]
 **size** | **Integer**| The number of the elements to fetch | [optional] [default to 50]
 **searchTerm** | **String**| Search Term | [optional]

### Return type

[**ResponseDTOListString**](ResponseDTOListString.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/yaml, text/yaml, text/html

<a name="isSaasGit"></a>
# **isSaasGit**
> ResponseDTOSaasGit isSaasGit(repoURL)

Checks if Saas is possible for given Repo Url

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ScmApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

ScmApi apiInstance = new ScmApi();
String repoURL = "repoURL_example"; // String | Repo URL
try {
    ResponseDTOSaasGit result = apiInstance.isSaasGit(repoURL);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ScmApi#isSaasGit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repoURL** | **String**| Repo URL | [optional]

### Return type

[**ResponseDTOSaasGit**](ResponseDTOSaasGit.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/yaml, text/yaml, text/html

