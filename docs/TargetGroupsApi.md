# TargetGroupsApi

All URIs are relative to *https://app.harness.io/gateway*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createSegment**](TargetGroupsApi.md#createSegment) | **POST** /cf/admin/segments | Creates a Target Group
[**deleteSegment**](TargetGroupsApi.md#deleteSegment) | **DELETE** /cf/admin/segments/{identifier} | Deletes a Target Group
[**getAllSegments**](TargetGroupsApi.md#getAllSegments) | **GET** /cf/admin/segments | Returns all Target Groups
[**getAvailableFlagsForSegment**](TargetGroupsApi.md#getAvailableFlagsForSegment) | **GET** /cf/admin/segments/{identifier}/available_flags | Returns Feature Flags that are available to be added to the given Target Group
[**getSegment**](TargetGroupsApi.md#getSegment) | **GET** /cf/admin/segments/{identifier} | Returns Target Group details for the given identifier
[**getSegmentFlags**](TargetGroupsApi.md#getSegmentFlags) | **GET** /cf/admin/segments/{identifier}/flags | Returns Feature Flags in a Target Group
[**patchSegment**](TargetGroupsApi.md#patchSegment) | **PATCH** /cf/admin/segments/{identifier} | Updates a Target Group

<a name="createSegment"></a>
# **createSegment**
> createSegment(body, accountIdentifier, orgIdentifier)

Creates a Target Group

Creates a Target Group in the given Project

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TargetGroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

TargetGroupsApi apiInstance = new TargetGroupsApi();
Object body = null; // Object | 
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier
String orgIdentifier = "orgIdentifier_example"; // String | Organization Identifier
try {
    apiInstance.createSegment(body, accountIdentifier, orgIdentifier);
} catch (ApiException e) {
    System.err.println("Exception when calling TargetGroupsApi#createSegment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Object**](Object.md)|  |
 **accountIdentifier** | **String**| Account Identifier |
 **orgIdentifier** | **String**| Organization Identifier |

### Return type

null (empty response body)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteSegment"></a>
# **deleteSegment**
> deleteSegment(accountIdentifier, orgIdentifier, identifier, projectIdentifier, environmentIdentifier)

Deletes a Target Group

Deletes a Target Group for the given ID

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TargetGroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

TargetGroupsApi apiInstance = new TargetGroupsApi();
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier
String orgIdentifier = "orgIdentifier_example"; // String | Organization Identifier
String identifier = "identifier_example"; // String | Unique identifier for the object in the API.
String projectIdentifier = "projectIdentifier_example"; // String | The Project identifier
String environmentIdentifier = "environmentIdentifier_example"; // String | Environment Identifier
try {
    apiInstance.deleteSegment(accountIdentifier, orgIdentifier, identifier, projectIdentifier, environmentIdentifier);
} catch (ApiException e) {
    System.err.println("Exception when calling TargetGroupsApi#deleteSegment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountIdentifier** | **String**| Account Identifier |
 **orgIdentifier** | **String**| Organization Identifier |
 **identifier** | **String**| Unique identifier for the object in the API. |
 **projectIdentifier** | **String**| The Project identifier |
 **environmentIdentifier** | **String**| Environment Identifier |

### Return type

null (empty response body)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAllSegments"></a>
# **getAllSegments**
> Segments getAllSegments(accountIdentifier, orgIdentifier, environmentIdentifier, projectIdentifier, pageNumber, pageSize, sortOrder, sortByField, name, identifier)

Returns all Target Groups

Returns Target Group details for the given account

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TargetGroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

TargetGroupsApi apiInstance = new TargetGroupsApi();
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier
String orgIdentifier = "orgIdentifier_example"; // String | Organization Identifier
String environmentIdentifier = "environmentIdentifier_example"; // String | Environment Identifier
String projectIdentifier = "projectIdentifier_example"; // String | The Project identifier
Integer pageNumber = 56; // Integer | PageNumber
Integer pageSize = 56; // Integer | PageSize
String sortOrder = "sortOrder_example"; // String | SortOrder
String sortByField = "sortByField_example"; // String | SortByField
String name = "name_example"; // String | Name of the field
String identifier = "identifier_example"; // String | Identifier of the field
try {
    Segments result = apiInstance.getAllSegments(accountIdentifier, orgIdentifier, environmentIdentifier, projectIdentifier, pageNumber, pageSize, sortOrder, sortByField, name, identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TargetGroupsApi#getAllSegments");
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
 **pageNumber** | **Integer**| PageNumber | [optional]
 **pageSize** | **Integer**| PageSize | [optional]
 **sortOrder** | **String**| SortOrder | [optional] [enum: ASCENDING, DESCENDING]
 **sortByField** | **String**| SortByField | [optional] [enum: name, identifier, archived, kind, modifiedAt]
 **name** | **String**| Name of the field | [optional]
 **identifier** | **String**| Identifier of the field | [optional]

### Return type

[**Segments**](Segments.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAvailableFlagsForSegment"></a>
# **getAvailableFlagsForSegment**
> FlagBasicInfos getAvailableFlagsForSegment(identifier, accountIdentifier, orgIdentifier, projectIdentifier, environmentIdentifier, pageNumber, pageSize, sortOrder, sortByField, flagNameIdentifier)

Returns Feature Flags that are available to be added to the given Target Group

Returns the list of Feature Flags that the Target Group can be added to.  This list will exclude any Feature Flag that the Target Group is already part of.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TargetGroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

TargetGroupsApi apiInstance = new TargetGroupsApi();
String identifier = "identifier_example"; // String | Unique identifier for the object in the API.
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier
String orgIdentifier = "orgIdentifier_example"; // String | Organization Identifier
String projectIdentifier = "projectIdentifier_example"; // String | The Project identifier
String environmentIdentifier = "environmentIdentifier_example"; // String | Environment Identifier
Integer pageNumber = 56; // Integer | PageNumber
Integer pageSize = 56; // Integer | PageSize
String sortOrder = "sortOrder_example"; // String | SortOrder
String sortByField = "sortByField_example"; // String | SortByField
String flagNameIdentifier = "flagNameIdentifier_example"; // String | Identifier of the feature flag
try {
    FlagBasicInfos result = apiInstance.getAvailableFlagsForSegment(identifier, accountIdentifier, orgIdentifier, projectIdentifier, environmentIdentifier, pageNumber, pageSize, sortOrder, sortByField, flagNameIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TargetGroupsApi#getAvailableFlagsForSegment");
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
 **pageNumber** | **Integer**| PageNumber | [optional]
 **pageSize** | **Integer**| PageSize | [optional]
 **sortOrder** | **String**| SortOrder | [optional] [enum: ASCENDING, DESCENDING]
 **sortByField** | **String**| SortByField | [optional] [enum: name]
 **flagNameIdentifier** | **String**| Identifier of the feature flag | [optional]

### Return type

[**FlagBasicInfos**](FlagBasicInfos.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getSegment"></a>
# **getSegment**
> Segment getSegment(accountIdentifier, orgIdentifier, identifier, projectIdentifier, environmentIdentifier)

Returns Target Group details for the given identifier

Returns Target Group details for the given ID

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TargetGroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

TargetGroupsApi apiInstance = new TargetGroupsApi();
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier
String orgIdentifier = "orgIdentifier_example"; // String | Organization Identifier
String identifier = "identifier_example"; // String | Unique identifier for the object in the API.
String projectIdentifier = "projectIdentifier_example"; // String | The Project identifier
String environmentIdentifier = "environmentIdentifier_example"; // String | Environment Identifier
try {
    Segment result = apiInstance.getSegment(accountIdentifier, orgIdentifier, identifier, projectIdentifier, environmentIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TargetGroupsApi#getSegment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountIdentifier** | **String**| Account Identifier |
 **orgIdentifier** | **String**| Organization Identifier |
 **identifier** | **String**| Unique identifier for the object in the API. |
 **projectIdentifier** | **String**| The Project identifier |
 **environmentIdentifier** | **String**| Environment Identifier |

### Return type

[**Segment**](Segment.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getSegmentFlags"></a>
# **getSegmentFlags**
> List&lt;SegmentFlag&gt; getSegmentFlags(accountIdentifier, orgIdentifier, identifier, projectIdentifier, environmentIdentifier)

Returns Feature Flags in a Target Group

Returns the details of a Feature Flag in a Target Group for the given identifier

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TargetGroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

TargetGroupsApi apiInstance = new TargetGroupsApi();
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier
String orgIdentifier = "orgIdentifier_example"; // String | Organization Identifier
String identifier = "identifier_example"; // String | Unique identifier for the object in the API.
String projectIdentifier = "projectIdentifier_example"; // String | The Project identifier
String environmentIdentifier = "environmentIdentifier_example"; // String | Environment Identifier
try {
    List<SegmentFlag> result = apiInstance.getSegmentFlags(accountIdentifier, orgIdentifier, identifier, projectIdentifier, environmentIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TargetGroupsApi#getSegmentFlags");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountIdentifier** | **String**| Account Identifier |
 **orgIdentifier** | **String**| Organization Identifier |
 **identifier** | **String**| Unique identifier for the object in the API. |
 **projectIdentifier** | **String**| The Project identifier |
 **environmentIdentifier** | **String**| Environment Identifier |

### Return type

[**List&lt;SegmentFlag&gt;**](SegmentFlag.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="patchSegment"></a>
# **patchSegment**
> Segment patchSegment(accountIdentifier, orgIdentifier, projectIdentifier, environmentIdentifier, identifier, body)

Updates a Target Group

Updates a Target Group for the given identifier

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TargetGroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

TargetGroupsApi apiInstance = new TargetGroupsApi();
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier
String orgIdentifier = "orgIdentifier_example"; // String | Organization Identifier
String projectIdentifier = "projectIdentifier_example"; // String | The Project identifier
String environmentIdentifier = "environmentIdentifier_example"; // String | Environment Identifier
String identifier = "identifier_example"; // String | Unique identifier for the object in the API.
CfPatchOperation body = new CfPatchOperation(); // CfPatchOperation | 
try {
    Segment result = apiInstance.patchSegment(accountIdentifier, orgIdentifier, projectIdentifier, environmentIdentifier, identifier, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TargetGroupsApi#patchSegment");
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

[**Segment**](Segment.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

