# TargetsApi

All URIs are relative to *https://app.harness.io/gateway*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createTarget**](TargetsApi.md#createTarget) | **POST** /cf/admin/targets | Creates a Target
[**deleteTarget**](TargetsApi.md#deleteTarget) | **DELETE** /cf/admin/targets/{identifier} | Deletes a Target
[**getAllTargets**](TargetsApi.md#getAllTargets) | **GET** /cf/admin/targets | Returns all Targets
[**getTarget**](TargetsApi.md#getTarget) | **GET** /cf/admin/targets/{identifier} | Returns details of a Target
[**getTargetSegments**](TargetsApi.md#getTargetSegments) | **GET** /cf/admin/targets/{identifier}/segments | Returns Target Groups for the given Target
[**modifyTarget**](TargetsApi.md#modifyTarget) | **PUT** /cf/admin/targets/{identifier} | Modifies a Target
[**patchTarget**](TargetsApi.md#patchTarget) | **PATCH** /cf/admin/targets/{identifier} | Updates a Target

<a name="createTarget"></a>
# **createTarget**
> createTarget(body, accountIdentifier, orgIdentifier)

Creates a Target

Create Targets for the given identifier

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TargetsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

TargetsApi apiInstance = new TargetsApi();
Target body = new Target(); // Target | 
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier
String orgIdentifier = "orgIdentifier_example"; // String | Organization Identifier
try {
    apiInstance.createTarget(body, accountIdentifier, orgIdentifier);
} catch (ApiException e) {
    System.err.println("Exception when calling TargetsApi#createTarget");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Target**](Target.md)|  |
 **accountIdentifier** | **String**| Account Identifier |
 **orgIdentifier** | **String**| Organization Identifier |

### Return type

null (empty response body)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteTarget"></a>
# **deleteTarget**
> deleteTarget(identifier, accountIdentifier, orgIdentifier, projectIdentifier, environmentIdentifier)

Deletes a Target

Deletes a Target for the given identifier

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TargetsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

TargetsApi apiInstance = new TargetsApi();
String identifier = "identifier_example"; // String | Unique identifier for the object in the API.
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier
String orgIdentifier = "orgIdentifier_example"; // String | Organization Identifier
String projectIdentifier = "projectIdentifier_example"; // String | The Project identifier
String environmentIdentifier = "environmentIdentifier_example"; // String | Environment Identifier
try {
    apiInstance.deleteTarget(identifier, accountIdentifier, orgIdentifier, projectIdentifier, environmentIdentifier);
} catch (ApiException e) {
    System.err.println("Exception when calling TargetsApi#deleteTarget");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **String**| Unique identifier for the object in the API. |
 **accountIdentifier** | **String**| Account Identifier |
 **orgIdentifier** | **String**| Organization Identifier |
 **projectIdentifier** | **String**| The Project identifier |
 **environmentIdentifier** | **String**| Environment Identifier |

### Return type

null (empty response body)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAllTargets"></a>
# **getAllTargets**
> Targets getAllTargets(accountIdentifier, orgIdentifier, projectIdentifier, environmentIdentifier, pageNumber, pageSize, sortOrder, sortByField, targetName, targetIdentifier)

Returns all Targets

Returns all the Targets for the given Account ID

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TargetsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

TargetsApi apiInstance = new TargetsApi();
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier
String orgIdentifier = "orgIdentifier_example"; // String | Organization Identifier
String projectIdentifier = "projectIdentifier_example"; // String | The Project identifier
String environmentIdentifier = "environmentIdentifier_example"; // String | Environment Identifier
Integer pageNumber = 56; // Integer | PageNumber
Integer pageSize = 56; // Integer | PageSize
String sortOrder = "sortOrder_example"; // String | SortOrder
String sortByField = "sortByField_example"; // String | SortByField
String targetName = "targetName_example"; // String | Name of the target
String targetIdentifier = "targetIdentifier_example"; // String | Identifier of the target
try {
    Targets result = apiInstance.getAllTargets(accountIdentifier, orgIdentifier, projectIdentifier, environmentIdentifier, pageNumber, pageSize, sortOrder, sortByField, targetName, targetIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TargetsApi#getAllTargets");
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
 **sortOrder** | **String**| SortOrder | [optional] [enum: ASC, DESC]
 **sortByField** | **String**| SortByField | [optional] [enum: createdAt, name, identifier]
 **targetName** | **String**| Name of the target | [optional]
 **targetIdentifier** | **String**| Identifier of the target | [optional]

### Return type

[**Targets**](Targets.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTarget"></a>
# **getTarget**
> Target getTarget(identifier, accountIdentifier, orgIdentifier, projectIdentifier, environmentIdentifier)

Returns details of a Target

Returns details of a Target for the given identifier

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TargetsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

TargetsApi apiInstance = new TargetsApi();
String identifier = "identifier_example"; // String | Unique identifier for the object in the API.
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier
String orgIdentifier = "orgIdentifier_example"; // String | Organization Identifier
String projectIdentifier = "projectIdentifier_example"; // String | The Project identifier
String environmentIdentifier = "environmentIdentifier_example"; // String | Environment Identifier
try {
    Target result = apiInstance.getTarget(identifier, accountIdentifier, orgIdentifier, projectIdentifier, environmentIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TargetsApi#getTarget");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **String**| Unique identifier for the object in the API. |
 **accountIdentifier** | **String**| Account Identifier |
 **orgIdentifier** | **String**| Organization Identifier |
 **projectIdentifier** | **String**| The Project identifier |
 **environmentIdentifier** | **String**| Environment Identifier |

### Return type

[**Target**](Target.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTargetSegments"></a>
# **getTargetSegments**
> TargetDetail getTargetSegments(identifier, accountIdentifier, orgIdentifier, projectIdentifier, environmentIdentifier)

Returns Target Groups for the given Target

Returns the Target Groups that the specified Target belongs to.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TargetsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

TargetsApi apiInstance = new TargetsApi();
String identifier = "identifier_example"; // String | Unique identifier for the object in the API.
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier
String orgIdentifier = "orgIdentifier_example"; // String | Organization Identifier
String projectIdentifier = "projectIdentifier_example"; // String | The Project identifier
String environmentIdentifier = "environmentIdentifier_example"; // String | Environment Identifier
try {
    TargetDetail result = apiInstance.getTargetSegments(identifier, accountIdentifier, orgIdentifier, projectIdentifier, environmentIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TargetsApi#getTargetSegments");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **String**| Unique identifier for the object in the API. |
 **accountIdentifier** | **String**| Account Identifier |
 **orgIdentifier** | **String**| Organization Identifier |
 **projectIdentifier** | **String**| The Project identifier |
 **environmentIdentifier** | **String**| Environment Identifier |

### Return type

[**TargetDetail**](TargetDetail.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="modifyTarget"></a>
# **modifyTarget**
> Target modifyTarget(body, accountIdentifier, orgIdentifier, projectIdentifier, environmentIdentifier, identifier)

Modifies a Target

Modifies a Target for the given account identifier

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TargetsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

TargetsApi apiInstance = new TargetsApi();
Target body = new Target(); // Target | 
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier
String orgIdentifier = "orgIdentifier_example"; // String | Organization Identifier
String projectIdentifier = "projectIdentifier_example"; // String | The Project identifier
String environmentIdentifier = "environmentIdentifier_example"; // String | Environment Identifier
String identifier = "identifier_example"; // String | Unique identifier for the object in the API.
try {
    Target result = apiInstance.modifyTarget(body, accountIdentifier, orgIdentifier, projectIdentifier, environmentIdentifier, identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TargetsApi#modifyTarget");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Target**](Target.md)|  |
 **accountIdentifier** | **String**| Account Identifier |
 **orgIdentifier** | **String**| Organization Identifier |
 **projectIdentifier** | **String**| The Project identifier |
 **environmentIdentifier** | **String**| Environment Identifier |
 **identifier** | **String**| Unique identifier for the object in the API. |

### Return type

[**Target**](Target.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="patchTarget"></a>
# **patchTarget**
> Target patchTarget(accountIdentifier, orgIdentifier, projectIdentifier, environmentIdentifier, identifier, body)

Updates a Target

Updates a Target for the given identifier

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TargetsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

TargetsApi apiInstance = new TargetsApi();
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier
String orgIdentifier = "orgIdentifier_example"; // String | Organization Identifier
String projectIdentifier = "projectIdentifier_example"; // String | The Project identifier
String environmentIdentifier = "environmentIdentifier_example"; // String | Environment Identifier
String identifier = "identifier_example"; // String | Unique identifier for the object in the API.
CfPatchOperation body = new CfPatchOperation(); // CfPatchOperation | 
try {
    Target result = apiInstance.patchTarget(accountIdentifier, orgIdentifier, projectIdentifier, environmentIdentifier, identifier, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TargetsApi#patchTarget");
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
 **identifier** | **String**| Unique identifier for the object in the API. |
 **body** | [**CfPatchOperation**](CfPatchOperation.md)|  | [optional]

### Return type

[**Target**](Target.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

