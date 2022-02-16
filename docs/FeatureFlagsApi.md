# FeatureFlagsApi

All URIs are relative to *https://app.harness.io/gateway*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createFeatureFlag**](FeatureFlagsApi.md#createFeatureFlag) | **POST** /cf/admin/features | Creates a Feature Flag
[**deleteFeatureFlag**](FeatureFlagsApi.md#deleteFeatureFlag) | **DELETE** /cf/admin/features/{identifier} | Delete a Feature Flag
[**getAllFeatures**](FeatureFlagsApi.md#getAllFeatures) | **GET** /cf/admin/features | Returns all Feature Flags for the project
[**getFeatureFlag**](FeatureFlagsApi.md#getFeatureFlag) | **GET** /cf/admin/features/{identifier} | Returns a Feature Flag
[**patchFeature**](FeatureFlagsApi.md#patchFeature) | **PATCH** /cf/admin/features/{identifier} | Updates a Feature Flag

<a name="createFeatureFlag"></a>
# **createFeatureFlag**
> createFeatureFlag(accountIdentifier, orgIdentifier, body)

Creates a Feature Flag

Creates a Feature Flag in the Project

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FeatureFlagsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

FeatureFlagsApi apiInstance = new FeatureFlagsApi();
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier
String orgIdentifier = "orgIdentifier_example"; // String | Organization Identifier
Object body = null; // Object | 
try {
    apiInstance.createFeatureFlag(accountIdentifier, orgIdentifier, body);
} catch (ApiException e) {
    System.err.println("Exception when calling FeatureFlagsApi#createFeatureFlag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountIdentifier** | **String**| Account Identifier |
 **orgIdentifier** | **String**| Organization Identifier |
 **body** | [**Object**](Object.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteFeatureFlag"></a>
# **deleteFeatureFlag**
> deleteFeatureFlag(identifier, accountIdentifier, orgIdentifier, projectIdentifier, commitMsg)

Delete a Feature Flag

Delete Feature Flag for the given identifier and account ID

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FeatureFlagsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

FeatureFlagsApi apiInstance = new FeatureFlagsApi();
String identifier = "identifier_example"; // String | Unique identifier for the object in the API.
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier
String orgIdentifier = "orgIdentifier_example"; // String | Organization Identifier
String projectIdentifier = "projectIdentifier_example"; // String | The Project identifier
String commitMsg = "commitMsg_example"; // String | Git commit message
try {
    apiInstance.deleteFeatureFlag(identifier, accountIdentifier, orgIdentifier, projectIdentifier, commitMsg);
} catch (ApiException e) {
    System.err.println("Exception when calling FeatureFlagsApi#deleteFeatureFlag");
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
 **commitMsg** | **String**| Git commit message | [optional]

### Return type

null (empty response body)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAllFeatures"></a>
# **getAllFeatures**
> Features getAllFeatures(accountIdentifier, orgIdentifier, projectIdentifier, environmentIdentifier, pageNumber, pageSize, sortOrder, sortByField, name, identifier, archived, kind, targetIdentifier, metrics)

Returns all Feature Flags for the project

Returns all the Feature Flag details for the given project

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FeatureFlagsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

FeatureFlagsApi apiInstance = new FeatureFlagsApi();
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier
String orgIdentifier = "orgIdentifier_example"; // String | Organization Identifier
String projectIdentifier = "projectIdentifier_example"; // String | The Project identifier
String environmentIdentifier = "environmentIdentifier_example"; // String | Environment
Integer pageNumber = 56; // Integer | PageNumber
Integer pageSize = 56; // Integer | PageSize
String sortOrder = "sortOrder_example"; // String | SortOrder
String sortByField = "sortByField_example"; // String | SortByField
String name = "name_example"; // String | Name of the field
String identifier = "identifier_example"; // String | Identifier of the field
Boolean archived = true; // Boolean | Status of the feature flag
String kind = "kind_example"; // String | Kind of the feature flag
String targetIdentifier = "targetIdentifier_example"; // String | Identifier of a target
Boolean metrics = true; // Boolean | Parameter to indicate if metrics data is requested in response
try {
    Features result = apiInstance.getAllFeatures(accountIdentifier, orgIdentifier, projectIdentifier, environmentIdentifier, pageNumber, pageSize, sortOrder, sortByField, name, identifier, archived, kind, targetIdentifier, metrics);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FeatureFlagsApi#getAllFeatures");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountIdentifier** | **String**| Account Identifier |
 **orgIdentifier** | **String**| Organization Identifier |
 **projectIdentifier** | **String**| The Project identifier |
 **environmentIdentifier** | **String**| Environment | [optional]
 **pageNumber** | **Integer**| PageNumber | [optional]
 **pageSize** | **Integer**| PageSize | [optional]
 **sortOrder** | **String**| SortOrder | [optional] [enum: ASCENDING, DESCENDING]
 **sortByField** | **String**| SortByField | [optional] [enum: name, identifier, archived, kind, modifiedAt]
 **name** | **String**| Name of the field | [optional]
 **identifier** | **String**| Identifier of the field | [optional]
 **archived** | **Boolean**| Status of the feature flag | [optional]
 **kind** | **String**| Kind of the feature flag | [optional] [enum: json, string, int, boolean]
 **targetIdentifier** | **String**| Identifier of a target | [optional]
 **metrics** | **Boolean**| Parameter to indicate if metrics data is requested in response | [optional]

### Return type

[**Features**](Features.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getFeatureFlag"></a>
# **getFeatureFlag**
> Feature getFeatureFlag(identifier, accountIdentifier, orgIdentifier, projectIdentifier, environmentIdentifier)

Returns a Feature Flag

Returns details such as Variation name, identifier etc for the given Feature Flag

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FeatureFlagsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

FeatureFlagsApi apiInstance = new FeatureFlagsApi();
String identifier = "identifier_example"; // String | Unique identifier for the object in the API.
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier
String orgIdentifier = "orgIdentifier_example"; // String | Organization Identifier
String projectIdentifier = "projectIdentifier_example"; // String | The Project identifier
String environmentIdentifier = "environmentIdentifier_example"; // String | Environment
try {
    Feature result = apiInstance.getFeatureFlag(identifier, accountIdentifier, orgIdentifier, projectIdentifier, environmentIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FeatureFlagsApi#getFeatureFlag");
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
 **environmentIdentifier** | **String**| Environment | [optional]

### Return type

[**Feature**](Feature.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="patchFeature"></a>
# **patchFeature**
> Feature patchFeature(accountIdentifier, orgIdentifier, projectIdentifier, identifier, body, environmentIdentifier)

Updates a Feature Flag

This operation is used to modify a Feature Flag.  The request body can include one or more instructions that can modify flag attributes such as the state (off|on), the variations that are returned and serving rules. For example if you want to turn a flag off you can use this opeartion and send the setFeatureFlagState  {   \&quot;kind\&quot;: \&quot;setFeatureFlagState\&quot;,   \&quot;parameters\&quot;: {     \&quot;state\&quot;: \&quot;off\&quot;   } } 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FeatureFlagsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

FeatureFlagsApi apiInstance = new FeatureFlagsApi();
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier
String orgIdentifier = "orgIdentifier_example"; // String | Organization Identifier
String projectIdentifier = "projectIdentifier_example"; // String | The Project identifier
String identifier = "identifier_example"; // String | Unique identifier for the object in the API.
GitSyncPatchOperation body = new GitSyncPatchOperation(); // GitSyncPatchOperation | 
String environmentIdentifier = "environmentIdentifier_example"; // String | Environment
try {
    Feature result = apiInstance.patchFeature(accountIdentifier, orgIdentifier, projectIdentifier, identifier, body, environmentIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FeatureFlagsApi#patchFeature");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountIdentifier** | **String**| Account Identifier |
 **orgIdentifier** | **String**| Organization Identifier |
 **projectIdentifier** | **String**| The Project identifier |
 **identifier** | **String**| Unique identifier for the object in the API. |
 **body** | [**GitSyncPatchOperation**](GitSyncPatchOperation.md)|  | [optional]
 **environmentIdentifier** | **String**| Environment | [optional]

### Return type

[**Feature**](Feature.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

