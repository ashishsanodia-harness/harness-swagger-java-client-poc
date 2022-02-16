# ScimApi

All URIs are relative to *https://app.harness.io/gateway*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createUser**](ScimApi.md#createUser) | **POST** /ng/api/scim/account/{accountIdentifier}/Users | 
[**deleteUser**](ScimApi.md#deleteUser) | **DELETE** /ng/api/scim/account/{accountIdentifier}/Users/{userIdentifier} | 
[**getUser**](ScimApi.md#getUser) | **GET** /ng/api/scim/account/{accountIdentifier}/Users/{userIdentifier} | 
[**searchUser**](ScimApi.md#searchUser) | **GET** /ng/api/scim/account/{accountIdentifier}/Users | 
[**updateUser**](ScimApi.md#updateUser) | **PATCH** /ng/api/scim/account/{accountIdentifier}/Users/{userIdentifier} | 
[**updateUser1**](ScimApi.md#updateUser1) | **PUT** /ng/api/scim/account/{accountIdentifier}/Users/{userIdentifier} | 

<a name="createUser"></a>
# **createUser**
> createUser(accountIdentifier, body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ScimApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

ScimApi apiInstance = new ScimApi();
String accountIdentifier = "accountIdentifier_example"; // String | 
ScimUser body = new ScimUser(); // ScimUser | 
try {
    apiInstance.createUser(accountIdentifier, body);
} catch (ApiException e) {
    System.err.println("Exception when calling ScimApi#createUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountIdentifier** | **String**|  |
 **body** | [**ScimUser**](ScimUser.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/scim+json, application/json
 - **Accept**: application/json, application/yaml

<a name="deleteUser"></a>
# **deleteUser**
> deleteUser(userIdentifier, accountIdentifier)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ScimApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

ScimApi apiInstance = new ScimApi();
String userIdentifier = "userIdentifier_example"; // String | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    apiInstance.deleteUser(userIdentifier, accountIdentifier);
} catch (ApiException e) {
    System.err.println("Exception when calling ScimApi#deleteUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userIdentifier** | **String**|  |
 **accountIdentifier** | **String**|  |

### Return type

null (empty response body)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/yaml

<a name="getUser"></a>
# **getUser**
> getUser(userIdentifier, accountIdentifier)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ScimApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

ScimApi apiInstance = new ScimApi();
String userIdentifier = "userIdentifier_example"; // String | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    apiInstance.getUser(userIdentifier, accountIdentifier);
} catch (ApiException e) {
    System.err.println("Exception when calling ScimApi#getUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userIdentifier** | **String**|  |
 **accountIdentifier** | **String**|  |

### Return type

null (empty response body)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/yaml

<a name="searchUser"></a>
# **searchUser**
> searchUser(accountIdentifier, filter, count, startIndex)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ScimApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

ScimApi apiInstance = new ScimApi();
String accountIdentifier = "accountIdentifier_example"; // String | 
String filter = "filter_example"; // String | 
Integer count = 56; // Integer | 
Integer startIndex = 56; // Integer | 
try {
    apiInstance.searchUser(accountIdentifier, filter, count, startIndex);
} catch (ApiException e) {
    System.err.println("Exception when calling ScimApi#searchUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountIdentifier** | **String**|  |
 **filter** | **String**|  | [optional]
 **count** | **Integer**|  | [optional]
 **startIndex** | **Integer**|  | [optional]

### Return type

null (empty response body)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/yaml

<a name="updateUser"></a>
# **updateUser**
> updateUser(accountIdentifier, userIdentifier, body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ScimApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

ScimApi apiInstance = new ScimApi();
String accountIdentifier = "accountIdentifier_example"; // String | 
String userIdentifier = "userIdentifier_example"; // String | 
PatchRequest body = new PatchRequest(); // PatchRequest | 
try {
    apiInstance.updateUser(accountIdentifier, userIdentifier, body);
} catch (ApiException e) {
    System.err.println("Exception when calling ScimApi#updateUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountIdentifier** | **String**|  |
 **userIdentifier** | **String**|  |
 **body** | [**PatchRequest**](PatchRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/scim+json, application/json
 - **Accept**: application/json, application/yaml

<a name="updateUser1"></a>
# **updateUser1**
> updateUser1(userIdentifier, accountIdentifier, body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ScimApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

ScimApi apiInstance = new ScimApi();
String userIdentifier = "userIdentifier_example"; // String | 
String accountIdentifier = "accountIdentifier_example"; // String | 
ScimUser body = new ScimUser(); // ScimUser | 
try {
    apiInstance.updateUser1(userIdentifier, accountIdentifier, body);
} catch (ApiException e) {
    System.err.println("Exception when calling ScimApi#updateUser1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userIdentifier** | **String**|  |
 **accountIdentifier** | **String**|  |
 **body** | [**ScimUser**](ScimUser.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/scim+json, application/json
 - **Accept**: application/json, application/yaml

