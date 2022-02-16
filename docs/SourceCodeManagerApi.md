# SourceCodeManagerApi

All URIs are relative to *https://app.harness.io/gateway*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createSourceCodeManager**](SourceCodeManagerApi.md#createSourceCodeManager) | **POST** /ng/api/source-code-manager | Creates Source Code Manager
[**deleteSourceCodeManager**](SourceCodeManagerApi.md#deleteSourceCodeManager) | **DELETE** /ng/api/source-code-manager/{identifier} | Deletes the Source Code Manager corresponding to the specified Source Code Manager Id
[**getSourceCodeManagers**](SourceCodeManagerApi.md#getSourceCodeManagers) | **GET** /ng/api/source-code-manager | Lists Source Code Managers for the given account
[**updateSourceCodeManager**](SourceCodeManagerApi.md#updateSourceCodeManager) | **PUT** /ng/api/source-code-manager/{identifier} | Updates Source Code Manager Details with the given Source Code Manager Id

<a name="createSourceCodeManager"></a>
# **createSourceCodeManager**
> ResponseDTOSourceCodeManager createSourceCodeManager(body)

Creates Source Code Manager

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SourceCodeManagerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

SourceCodeManagerApi apiInstance = new SourceCodeManagerApi();
SourceCodeManager body = new SourceCodeManager(); // SourceCodeManager | This contains details of Source Code Manager
try {
    ResponseDTOSourceCodeManager result = apiInstance.createSourceCodeManager(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SourceCodeManagerApi#createSourceCodeManager");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SourceCodeManager**](SourceCodeManager.md)| This contains details of Source Code Manager | [optional]

### Return type

[**ResponseDTOSourceCodeManager**](ResponseDTOSourceCodeManager.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json, application/yaml

<a name="deleteSourceCodeManager"></a>
# **deleteSourceCodeManager**
> ResponseDTOBoolean deleteSourceCodeManager(identifier, accountIdentifier)

Deletes the Source Code Manager corresponding to the specified Source Code Manager Id

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SourceCodeManagerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

SourceCodeManagerApi apiInstance = new SourceCodeManagerApi();
String identifier = "identifier_example"; // String | Source Code manager Identifier
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the Entity
try {
    ResponseDTOBoolean result = apiInstance.deleteSourceCodeManager(identifier, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SourceCodeManagerApi#deleteSourceCodeManager");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **String**| Source Code manager Identifier |
 **accountIdentifier** | **String**| Account Identifier for the Entity |

### Return type

[**ResponseDTOBoolean**](ResponseDTOBoolean.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/yaml

<a name="getSourceCodeManagers"></a>
# **getSourceCodeManagers**
> ResponseDTOListSourceCodeManager getSourceCodeManagers(accountIdentifier)

Lists Source Code Managers for the given account

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SourceCodeManagerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

SourceCodeManagerApi apiInstance = new SourceCodeManagerApi();
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the Entity
try {
    ResponseDTOListSourceCodeManager result = apiInstance.getSourceCodeManagers(accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SourceCodeManagerApi#getSourceCodeManagers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountIdentifier** | **String**| Account Identifier for the Entity |

### Return type

[**ResponseDTOListSourceCodeManager**](ResponseDTOListSourceCodeManager.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/yaml

<a name="updateSourceCodeManager"></a>
# **updateSourceCodeManager**
> ResponseDTOSourceCodeManager updateSourceCodeManager(identifier, body)

Updates Source Code Manager Details with the given Source Code Manager Id

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SourceCodeManagerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

SourceCodeManagerApi apiInstance = new SourceCodeManagerApi();
String identifier = "identifier_example"; // String | Source Code manager Identifier
SourceCodeManager body = new SourceCodeManager(); // SourceCodeManager | This contains details of Source Code Manager
try {
    ResponseDTOSourceCodeManager result = apiInstance.updateSourceCodeManager(identifier, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SourceCodeManagerApi#updateSourceCodeManager");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **String**| Source Code manager Identifier |
 **body** | [**SourceCodeManager**](SourceCodeManager.md)| This contains details of Source Code Manager | [optional]

### Return type

[**ResponseDTOSourceCodeManager**](ResponseDTOSourceCodeManager.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json, application/yaml

