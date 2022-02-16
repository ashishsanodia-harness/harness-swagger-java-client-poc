# ApiKeysApi

All URIs are relative to *https://app.harness.io/gateway*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addAPIKey**](ApiKeysApi.md#addAPIKey) | **POST** /cf/admin/apikey | Creates an API key for the given Environment
[**deleteApiKey**](ApiKeysApi.md#deleteApiKey) | **DELETE** /cf/admin/apikey/{identifier} | Deletes an API Key
[**getAPIKey**](ApiKeysApi.md#getAPIKey) | **GET** /cf/admin/apikey/{identifier} | Returns API keys
[**getAllAPIKeys**](ApiKeysApi.md#getAllAPIKeys) | **GET** /cf/admin/apikey | Returns API Keys for an Environment
[**updateAPIKey**](ApiKeysApi.md#updateAPIKey) | **PUT** /cf/admin/apikey/{identifier} | Updates an API Key

<a name="addAPIKey"></a>
# **addAPIKey**
> CfApiKey addAPIKey(accountIdentifier, orgIdentifier, environmentIdentifier, projectIdentifier, body)

Creates an API key for the given Environment

Creates an API key for the given Environment

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ApiKeysApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

ApiKeysApi apiInstance = new ApiKeysApi();
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier
String orgIdentifier = "orgIdentifier_example"; // String | Organization Identifier
String environmentIdentifier = "environmentIdentifier_example"; // String | Environment Identifier
String projectIdentifier = "projectIdentifier_example"; // String | The Project identifier
Object body = null; // Object | 
try {
    CfApiKey result = apiInstance.addAPIKey(accountIdentifier, orgIdentifier, environmentIdentifier, projectIdentifier, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApiKeysApi#addAPIKey");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountIdentifier** | **String**| Account Identifier |
 **orgIdentifier** | **String**| Organization Identifier |
 **environmentIdentifier** | **String**| Environment Identifier |
 **projectIdentifier** | **String**| The Project identifier |
 **body** | [**Object**](Object.md)|  | [optional]

### Return type

[**CfApiKey**](CfApiKey.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteApiKey"></a>
# **deleteApiKey**
> deleteApiKey(identifier, projectIdentifier, environmentIdentifier, accountIdentifier, orgIdentifier)

Deletes an API Key

Deletes an API key for the given identifier

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ApiKeysApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

ApiKeysApi apiInstance = new ApiKeysApi();
String identifier = "identifier_example"; // String | Unique identifier for the object in the API.
String projectIdentifier = "projectIdentifier_example"; // String | The Project identifier
String environmentIdentifier = "environmentIdentifier_example"; // String | Environment Identifier
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier
String orgIdentifier = "orgIdentifier_example"; // String | Organization Identifier
try {
    apiInstance.deleteApiKey(identifier, projectIdentifier, environmentIdentifier, accountIdentifier, orgIdentifier);
} catch (ApiException e) {
    System.err.println("Exception when calling ApiKeysApi#deleteApiKey");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **String**| Unique identifier for the object in the API. |
 **projectIdentifier** | **String**| The Project identifier |
 **environmentIdentifier** | **String**| Environment Identifier |
 **accountIdentifier** | **String**| Account Identifier |
 **orgIdentifier** | **String**| Organization Identifier |

### Return type

null (empty response body)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAPIKey"></a>
# **getAPIKey**
> CfApiKey getAPIKey(identifier, projectIdentifier, environmentIdentifier, accountIdentifier, orgIdentifier)

Returns API keys

Returns all the API Keys for the given identifier

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ApiKeysApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

ApiKeysApi apiInstance = new ApiKeysApi();
String identifier = "identifier_example"; // String | Unique identifier for the object in the API.
String projectIdentifier = "projectIdentifier_example"; // String | The Project identifier
String environmentIdentifier = "environmentIdentifier_example"; // String | Environment Identifier
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier
String orgIdentifier = "orgIdentifier_example"; // String | Organization Identifier
try {
    CfApiKey result = apiInstance.getAPIKey(identifier, projectIdentifier, environmentIdentifier, accountIdentifier, orgIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApiKeysApi#getAPIKey");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **String**| Unique identifier for the object in the API. |
 **projectIdentifier** | **String**| The Project identifier |
 **environmentIdentifier** | **String**| Environment Identifier |
 **accountIdentifier** | **String**| Account Identifier |
 **orgIdentifier** | **String**| Organization Identifier |

### Return type

[**CfApiKey**](CfApiKey.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAllAPIKeys"></a>
# **getAllAPIKeys**
> ApiKeys getAllAPIKeys(accountIdentifier, orgIdentifier, projectIdentifier, environmentIdentifier, pageNumber, pageSize)

Returns API Keys for an Environment

Returns all the API Keys for an Environment

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ApiKeysApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

ApiKeysApi apiInstance = new ApiKeysApi();
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier
String orgIdentifier = "orgIdentifier_example"; // String | Organization Identifier
String projectIdentifier = "projectIdentifier_example"; // String | The Project identifier
String environmentIdentifier = "environmentIdentifier_example"; // String | Environment Identifier
Integer pageNumber = 56; // Integer | PageNumber
Integer pageSize = 56; // Integer | PageSize
try {
    ApiKeys result = apiInstance.getAllAPIKeys(accountIdentifier, orgIdentifier, projectIdentifier, environmentIdentifier, pageNumber, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApiKeysApi#getAllAPIKeys");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountIdentifier** | **String**| Account Identifier |
 **orgIdentifier** | **String**| Organization Identifier |
 **projectIdentifier** | **String**| The Project identifier |
 **environmentIdentifier** | **String**| Environment Identifier |
 **pageNumber** | **Integer**| PageNumber | [optional]
 **pageSize** | **Integer**| PageSize | [optional]

### Return type

[**ApiKeys**](ApiKeys.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateAPIKey"></a>
# **updateAPIKey**
> updateAPIKey(projectIdentifier, environmentIdentifier, accountIdentifier, orgIdentifier, identifier, body)

Updates an API Key

Updates an API key for the given identifier

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ApiKeysApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

ApiKeysApi apiInstance = new ApiKeysApi();
String projectIdentifier = "projectIdentifier_example"; // String | The Project identifier
String environmentIdentifier = "environmentIdentifier_example"; // String | Environment Identifier
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier
String orgIdentifier = "orgIdentifier_example"; // String | Organization Identifier
String identifier = "identifier_example"; // String | Unique identifier for the object in the API.
Object body = null; // Object | 
try {
    apiInstance.updateAPIKey(projectIdentifier, environmentIdentifier, accountIdentifier, orgIdentifier, identifier, body);
} catch (ApiException e) {
    System.err.println("Exception when calling ApiKeysApi#updateAPIKey");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectIdentifier** | **String**| The Project identifier |
 **environmentIdentifier** | **String**| Environment Identifier |
 **accountIdentifier** | **String**| Account Identifier |
 **orgIdentifier** | **String**| Organization Identifier |
 **identifier** | **String**| Unique identifier for the object in the API. |
 **body** | [**Object**](Object.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

