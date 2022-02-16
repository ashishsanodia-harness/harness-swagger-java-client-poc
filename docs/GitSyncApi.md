# GitSyncApi

All URIs are relative to *https://app.harness.io/gateway*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createGitSyncConfig**](GitSyncApi.md#createGitSyncConfig) | **POST** /ng/api/git-sync | Creates Git Sync Config in given scope
[**getGitSyncConfigList**](GitSyncApi.md#getGitSyncConfigList) | **GET** /ng/api/git-sync | Lists Git Sync Config for the given scope
[**isGitSyncEnabled**](GitSyncApi.md#isGitSyncEnabled) | **GET** /ng/api/git-sync/git-sync-enabled | Check whether Git Sync is enabled for given scope or not
[**putGitExperience**](GitSyncApi.md#putGitExperience) | **PUT** /ng/api/git-sync/disable | 
[**updateDefaultFolder**](GitSyncApi.md#updateDefaultFolder) | **PUT** /ng/api/git-sync/{identifier}/folder/{folderIdentifier}/default | Update existing Git Sync Config default root folder by Identifier
[**updateGitSyncConfig**](GitSyncApi.md#updateGitSyncConfig) | **PUT** /ng/api/git-sync | Update existing Git Sync Config by Identifier

<a name="createGitSyncConfig"></a>
# **createGitSyncConfig**
> GitSyncConfig createGitSyncConfig(body, accountIdentifier)

Creates Git Sync Config in given scope

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.GitSyncApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

GitSyncApi apiInstance = new GitSyncApi();
GitSyncConfig body = new GitSyncConfig(); // GitSyncConfig | Details of Git Sync Config
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the Entity
try {
    GitSyncConfig result = apiInstance.createGitSyncConfig(body, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GitSyncApi#createGitSyncConfig");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**GitSyncConfig**](GitSyncConfig.md)| Details of Git Sync Config |
 **accountIdentifier** | **String**| Account Identifier for the Entity | [optional]

### Return type

[**GitSyncConfig**](GitSyncConfig.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json, text/yaml, text/html, text/plain
 - **Accept**: application/json, application/yaml, text/yaml, text/html

<a name="getGitSyncConfigList"></a>
# **getGitSyncConfigList**
> List&lt;GitSyncConfig&gt; getGitSyncConfigList(projectIdentifier, orgIdentifier, accountIdentifier)

Lists Git Sync Config for the given scope

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.GitSyncApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

GitSyncApi apiInstance = new GitSyncApi();
String projectIdentifier = "projectIdentifier_example"; // String | Project Identifier for the Entity
String orgIdentifier = "orgIdentifier_example"; // String | Organization Identifier for the Entity
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the Entity
try {
    List<GitSyncConfig> result = apiInstance.getGitSyncConfigList(projectIdentifier, orgIdentifier, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GitSyncApi#getGitSyncConfigList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectIdentifier** | **String**| Project Identifier for the Entity | [optional]
 **orgIdentifier** | **String**| Organization Identifier for the Entity | [optional]
 **accountIdentifier** | **String**| Account Identifier for the Entity | [optional]

### Return type

[**List&lt;GitSyncConfig&gt;**](GitSyncConfig.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/yaml, text/yaml, text/html

<a name="isGitSyncEnabled"></a>
# **isGitSyncEnabled**
> GitEnabled isGitSyncEnabled(accountIdentifier, projectIdentifier, orgIdentifier)

Check whether Git Sync is enabled for given scope or not

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.GitSyncApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

GitSyncApi apiInstance = new GitSyncApi();
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the Entity
String projectIdentifier = "projectIdentifier_example"; // String | Project Identifier for the Entity
String orgIdentifier = "orgIdentifier_example"; // String | Organization Identifier for the Entity
try {
    GitEnabled result = apiInstance.isGitSyncEnabled(accountIdentifier, projectIdentifier, orgIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GitSyncApi#isGitSyncEnabled");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountIdentifier** | **String**| Account Identifier for the Entity | [optional]
 **projectIdentifier** | **String**| Project Identifier for the Entity | [optional]
 **orgIdentifier** | **String**| Organization Identifier for the Entity | [optional]

### Return type

[**GitEnabled**](GitEnabled.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/yaml, text/yaml, text/html

<a name="putGitExperience"></a>
# **putGitExperience**
> putGitExperience(accountIdentifier, orgIdentifier, projectIdentifier)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.GitSyncApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

GitSyncApi apiInstance = new GitSyncApi();
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the Entity
String orgIdentifier = "orgIdentifier_example"; // String | Organization Identifier for the Entity
String projectIdentifier = "projectIdentifier_example"; // String | Project Identifier for the Entity
try {
    apiInstance.putGitExperience(accountIdentifier, orgIdentifier, projectIdentifier);
} catch (ApiException e) {
    System.err.println("Exception when calling GitSyncApi#putGitExperience");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountIdentifier** | **String**| Account Identifier for the Entity | [optional]
 **orgIdentifier** | **String**| Organization Identifier for the Entity | [optional]
 **projectIdentifier** | **String**| Project Identifier for the Entity | [optional]

### Return type

null (empty response body)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/yaml

<a name="updateDefaultFolder"></a>
# **updateDefaultFolder**
> GitSyncConfig updateDefaultFolder(identifier, folderIdentifier, projectId, organizationId, accountId)

Update existing Git Sync Config default root folder by Identifier

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.GitSyncApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

GitSyncApi apiInstance = new GitSyncApi();
String identifier = "identifier_example"; // String | Git Sync Config Id
String folderIdentifier = "folderIdentifier_example"; // String | Folder Id
String projectId = "projectId_example"; // String | Project Identifier for the Entity
String organizationId = "organizationId_example"; // String | Organization Identifier for the Entity
String accountId = "accountId_example"; // String | Account Identifier for the Entity
try {
    GitSyncConfig result = apiInstance.updateDefaultFolder(identifier, folderIdentifier, projectId, organizationId, accountId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GitSyncApi#updateDefaultFolder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **String**| Git Sync Config Id |
 **folderIdentifier** | **String**| Folder Id |
 **projectId** | **String**| Project Identifier for the Entity | [optional]
 **organizationId** | **String**| Organization Identifier for the Entity | [optional]
 **accountId** | **String**| Account Identifier for the Entity | [optional]

### Return type

[**GitSyncConfig**](GitSyncConfig.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/yaml, text/yaml, text/html

<a name="updateGitSyncConfig"></a>
# **updateGitSyncConfig**
> GitSyncConfig updateGitSyncConfig(body, accountIdentifier)

Update existing Git Sync Config by Identifier

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.GitSyncApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

GitSyncApi apiInstance = new GitSyncApi();
GitSyncConfig body = new GitSyncConfig(); // GitSyncConfig | Details of Git Sync Config
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the Entity
try {
    GitSyncConfig result = apiInstance.updateGitSyncConfig(body, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GitSyncApi#updateGitSyncConfig");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**GitSyncConfig**](GitSyncConfig.md)| Details of Git Sync Config |
 **accountIdentifier** | **String**| Account Identifier for the Entity | [optional]

### Return type

[**GitSyncConfig**](GitSyncConfig.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json, text/yaml, text/html, text/plain
 - **Accept**: application/json, application/yaml, text/yaml, text/html

