# GitSyncSettingsApi

All URIs are relative to *https://app.harness.io/gateway*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createGitSyncSetting**](GitSyncSettingsApi.md#createGitSyncSetting) | **POST** /ng/api/git-sync-settings | Creates Git Sync Setting in a scope
[**getGitSyncSettings**](GitSyncSettingsApi.md#getGitSyncSettings) | **GET** /ng/api/git-sync-settings | Get Git Sync Setting for the given scope
[**updateGitSyncSetting**](GitSyncSettingsApi.md#updateGitSyncSetting) | **PUT** /ng/api/git-sync-settings | This updates the existing Git Sync settings within the scope. Only changing Connectivity Mode is allowed

<a name="createGitSyncSetting"></a>
# **createGitSyncSetting**
> ResponseDTOGitSyncSettings createGitSyncSetting(body)

Creates Git Sync Setting in a scope

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.GitSyncSettingsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

GitSyncSettingsApi apiInstance = new GitSyncSettingsApi();
GitSyncSettings body = new GitSyncSettings(); // GitSyncSettings | This contains details of Git Sync settings like - (scope, executionOnDelegate)
try {
    ResponseDTOGitSyncSettings result = apiInstance.createGitSyncSetting(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GitSyncSettingsApi#createGitSyncSetting");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**GitSyncSettings**](GitSyncSettings.md)| This contains details of Git Sync settings like - (scope, executionOnDelegate) |

### Return type

[**ResponseDTOGitSyncSettings**](ResponseDTOGitSyncSettings.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json, text/yaml, text/html
 - **Accept**: application/json, application/yaml, text/yaml, text/html

<a name="getGitSyncSettings"></a>
# **getGitSyncSettings**
> ResponseDTOGitSyncSettings getGitSyncSettings(projectIdentifier, orgIdentifier, accountIdentifier)

Get Git Sync Setting for the given scope

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.GitSyncSettingsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

GitSyncSettingsApi apiInstance = new GitSyncSettingsApi();
String projectIdentifier = "projectIdentifier_example"; // String | Project Identifier for the Entity
String orgIdentifier = "orgIdentifier_example"; // String | Organization Identifier for the Entity
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the Entity
try {
    ResponseDTOGitSyncSettings result = apiInstance.getGitSyncSettings(projectIdentifier, orgIdentifier, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GitSyncSettingsApi#getGitSyncSettings");
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

[**ResponseDTOGitSyncSettings**](ResponseDTOGitSyncSettings.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/yaml, text/yaml, text/html

<a name="updateGitSyncSetting"></a>
# **updateGitSyncSetting**
> ResponseDTOGitSyncSettings updateGitSyncSetting(body)

This updates the existing Git Sync settings within the scope. Only changing Connectivity Mode is allowed

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.GitSyncSettingsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

GitSyncSettingsApi apiInstance = new GitSyncSettingsApi();
GitSyncSettings body = new GitSyncSettings(); // GitSyncSettings | This contains details of Git Sync Settings
try {
    ResponseDTOGitSyncSettings result = apiInstance.updateGitSyncSetting(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GitSyncSettingsApi#updateGitSyncSetting");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**GitSyncSettings**](GitSyncSettings.md)| This contains details of Git Sync Settings |

### Return type

[**ResponseDTOGitSyncSettings**](ResponseDTOGitSyncSettings.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json, text/yaml, text/html
 - **Accept**: application/json, application/yaml, text/yaml, text/html

