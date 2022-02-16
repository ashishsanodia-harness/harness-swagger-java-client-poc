# FilterApi

All URIs are relative to *https://app.harness.io/gateway*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteFilter**](FilterApi.md#deleteFilter) | **DELETE** /ng/api/filters/{identifier} | Delete a Filter by identifier
[**getConnectorListV21**](FilterApi.md#getConnectorListV21) | **GET** /ng/api/filters | Get the list of Filters satisfying the criteria (if any) in the request
[**getFilter**](FilterApi.md#getFilter) | **GET** /ng/api/filters/{identifier} | Gets a Filter by identifier
[**pipelinedeleteFilter**](FilterApi.md#pipelinedeleteFilter) | **DELETE** /pipeline/api/filters/{identifier} | Delete a Filter by identifier
[**pipelinegetConnectorListV2**](FilterApi.md#pipelinegetConnectorListV2) | **GET** /pipeline/api/filters | Get the list of Filters satisfying the criteria (if any) in the request
[**pipelinegetFilter**](FilterApi.md#pipelinegetFilter) | **GET** /pipeline/api/filters/{identifier} | Gets a Filter by identifier
[**pipelinepostFilter**](FilterApi.md#pipelinepostFilter) | **POST** /pipeline/api/filters | Creates a Filter
[**pipelineupdateFilter**](FilterApi.md#pipelineupdateFilter) | **PUT** /pipeline/api/filters | Updates the Filter
[**postFilter**](FilterApi.md#postFilter) | **POST** /ng/api/filters | Creates a Filter
[**resourcegroupdeleteFilter**](FilterApi.md#resourcegroupdeleteFilter) | **DELETE** /resourcegroup/api/filters/{identifier} | Delete a Filter by identifier
[**resourcegroupgetConnectorListV2**](FilterApi.md#resourcegroupgetConnectorListV2) | **GET** /resourcegroup/api/filters | Get the list of Filters satisfying the criteria (if any) in the request
[**resourcegroupgetFilter**](FilterApi.md#resourcegroupgetFilter) | **GET** /resourcegroup/api/filters/{identifier} | Gets a Filter by identifier
[**resourcegrouppostFilter**](FilterApi.md#resourcegrouppostFilter) | **POST** /resourcegroup/api/filters | Creates a Filter
[**resourcegroupupdateFilter**](FilterApi.md#resourcegroupupdateFilter) | **PUT** /resourcegroup/api/filters | Updates the Filter
[**updateFilter**](FilterApi.md#updateFilter) | **PUT** /ng/api/filters | Updates the Filter

<a name="deleteFilter"></a>
# **deleteFilter**
> ResponseDTOBoolean deleteFilter(accountIdentifier, identifier, type, orgIdentifier, projectIdentifier)

Delete a Filter by identifier

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FilterApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

FilterApi apiInstance = new FilterApi();
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the Entity
String identifier = "identifier_example"; // String | Filter Identifier
String type = "type_example"; // String | Type of Filter
String orgIdentifier = "orgIdentifier_example"; // String | Organization Identifier for the Entity
String projectIdentifier = "projectIdentifier_example"; // String | Project Identifier for the Entity
try {
    ResponseDTOBoolean result = apiInstance.deleteFilter(accountIdentifier, identifier, type, orgIdentifier, projectIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FilterApi#deleteFilter");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountIdentifier** | **String**| Account Identifier for the Entity |
 **identifier** | **String**| Filter Identifier |
 **type** | **String**| Type of Filter | [enum: CONNECTOR, DELEGATEPROFILE, DELEGATE, PIPELINESETUP, PIPELINEEXECUTION, DEPLOYMENT, AUDIT, TEMPLATE]
 **orgIdentifier** | **String**| Organization Identifier for the Entity | [optional]
 **projectIdentifier** | **String**| Project Identifier for the Entity | [optional]

### Return type

[**ResponseDTOBoolean**](ResponseDTOBoolean.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/yaml, text/yaml, text/html

<a name="getConnectorListV21"></a>
# **getConnectorListV21**
> ResponseDTOPageResponseFilter getConnectorListV21(accountIdentifier, type, pageIndex, pageSize, orgIdentifier, projectIdentifier)

Get the list of Filters satisfying the criteria (if any) in the request

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FilterApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

FilterApi apiInstance = new FilterApi();
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the Entity
String type = "type_example"; // String | Type of Filter
Integer pageIndex = 0; // Integer | Page number of navigation. If left empty, default value of 0 is assumed
Integer pageSize = 100; // Integer | Number of entries per page. If left empty, default value of 100 is assumed
String orgIdentifier = "orgIdentifier_example"; // String | Organization Identifier for the Entity
String projectIdentifier = "projectIdentifier_example"; // String | Project Identifier for the Entity
try {
    ResponseDTOPageResponseFilter result = apiInstance.getConnectorListV21(accountIdentifier, type, pageIndex, pageSize, orgIdentifier, projectIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FilterApi#getConnectorListV21");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountIdentifier** | **String**| Account Identifier for the Entity |
 **type** | **String**| Type of Filter | [enum: CONNECTOR, DELEGATEPROFILE, DELEGATE, PIPELINESETUP, PIPELINEEXECUTION, DEPLOYMENT, AUDIT, TEMPLATE]
 **pageIndex** | **Integer**| Page number of navigation. If left empty, default value of 0 is assumed | [optional] [default to 0]
 **pageSize** | **Integer**| Number of entries per page. If left empty, default value of 100 is assumed | [optional] [default to 100]
 **orgIdentifier** | **String**| Organization Identifier for the Entity | [optional]
 **projectIdentifier** | **String**| Project Identifier for the Entity | [optional]

### Return type

[**ResponseDTOPageResponseFilter**](ResponseDTOPageResponseFilter.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/yaml, text/yaml, text/html

<a name="getFilter"></a>
# **getFilter**
> ResponseDTOFilter getFilter(accountIdentifier, identifier, type, orgIdentifier, projectIdentifier)

Gets a Filter by identifier

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FilterApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

FilterApi apiInstance = new FilterApi();
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the Entity
String identifier = "identifier_example"; // String | Filter Identifier
String type = "type_example"; // String | Type of Filter
String orgIdentifier = "orgIdentifier_example"; // String | Organization Identifier for the Entity
String projectIdentifier = "projectIdentifier_example"; // String | Project Identifier for the Entity
try {
    ResponseDTOFilter result = apiInstance.getFilter(accountIdentifier, identifier, type, orgIdentifier, projectIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FilterApi#getFilter");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountIdentifier** | **String**| Account Identifier for the Entity |
 **identifier** | **String**| Filter Identifier |
 **type** | **String**| Type of Filter | [enum: CONNECTOR, DELEGATEPROFILE, DELEGATE, PIPELINESETUP, PIPELINEEXECUTION, DEPLOYMENT, AUDIT, TEMPLATE]
 **orgIdentifier** | **String**| Organization Identifier for the Entity | [optional]
 **projectIdentifier** | **String**| Project Identifier for the Entity | [optional]

### Return type

[**ResponseDTOFilter**](ResponseDTOFilter.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/yaml, text/yaml, text/html

<a name="pipelinedeleteFilter"></a>
# **pipelinedeleteFilter**
> ResponseDTOBoolean pipelinedeleteFilter(accountIdentifier, identifier, type, orgIdentifier, projectIdentifier)

Delete a Filter by identifier

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FilterApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

FilterApi apiInstance = new FilterApi();
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the Entity
String identifier = "identifier_example"; // String | Filter Identifier
String type = "type_example"; // String | Type of Filter
String orgIdentifier = "orgIdentifier_example"; // String | Organization Identifier for the Entity
String projectIdentifier = "projectIdentifier_example"; // String | Project Identifier for the Entity
try {
    ResponseDTOBoolean result = apiInstance.pipelinedeleteFilter(accountIdentifier, identifier, type, orgIdentifier, projectIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FilterApi#pipelinedeleteFilter");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountIdentifier** | **String**| Account Identifier for the Entity |
 **identifier** | **String**| Filter Identifier |
 **type** | **String**| Type of Filter | [enum: CONNECTOR, DELEGATEPROFILE, DELEGATE, PIPELINESETUP, PIPELINEEXECUTION, DEPLOYMENT, AUDIT, TEMPLATE]
 **orgIdentifier** | **String**| Organization Identifier for the Entity | [optional]
 **projectIdentifier** | **String**| Project Identifier for the Entity | [optional]

### Return type

[**ResponseDTOBoolean**](ResponseDTOBoolean.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/yaml, text/yaml, text/html

<a name="pipelinegetConnectorListV2"></a>
# **pipelinegetConnectorListV2**
> ResponseDTOPageResponseFilter pipelinegetConnectorListV2(accountIdentifier, type, pageIndex, pageSize, orgIdentifier, projectIdentifier)

Get the list of Filters satisfying the criteria (if any) in the request

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FilterApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

FilterApi apiInstance = new FilterApi();
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the Entity
String type = "type_example"; // String | Type of Filter
Integer pageIndex = 0; // Integer | Page number of navigation. If left empty, default value of 0 is assumed
Integer pageSize = 100; // Integer | Number of entries per page. If left empty, default value of 100 is assumed
String orgIdentifier = "orgIdentifier_example"; // String | Organization Identifier for the Entity
String projectIdentifier = "projectIdentifier_example"; // String | Project Identifier for the Entity
try {
    ResponseDTOPageResponseFilter result = apiInstance.pipelinegetConnectorListV2(accountIdentifier, type, pageIndex, pageSize, orgIdentifier, projectIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FilterApi#pipelinegetConnectorListV2");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountIdentifier** | **String**| Account Identifier for the Entity |
 **type** | **String**| Type of Filter | [enum: CONNECTOR, DELEGATEPROFILE, DELEGATE, PIPELINESETUP, PIPELINEEXECUTION, DEPLOYMENT, AUDIT, TEMPLATE]
 **pageIndex** | **Integer**| Page number of navigation. If left empty, default value of 0 is assumed | [optional] [default to 0]
 **pageSize** | **Integer**| Number of entries per page. If left empty, default value of 100 is assumed | [optional] [default to 100]
 **orgIdentifier** | **String**| Organization Identifier for the Entity | [optional]
 **projectIdentifier** | **String**| Project Identifier for the Entity | [optional]

### Return type

[**ResponseDTOPageResponseFilter**](ResponseDTOPageResponseFilter.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/yaml, text/yaml, text/html

<a name="pipelinegetFilter"></a>
# **pipelinegetFilter**
> ResponseDTOFilter pipelinegetFilter(accountIdentifier, identifier, type, orgIdentifier, projectIdentifier)

Gets a Filter by identifier

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FilterApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

FilterApi apiInstance = new FilterApi();
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the Entity
String identifier = "identifier_example"; // String | Filter Identifier
String type = "type_example"; // String | Type of Filter
String orgIdentifier = "orgIdentifier_example"; // String | Organization Identifier for the Entity
String projectIdentifier = "projectIdentifier_example"; // String | Project Identifier for the Entity
try {
    ResponseDTOFilter result = apiInstance.pipelinegetFilter(accountIdentifier, identifier, type, orgIdentifier, projectIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FilterApi#pipelinegetFilter");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountIdentifier** | **String**| Account Identifier for the Entity |
 **identifier** | **String**| Filter Identifier |
 **type** | **String**| Type of Filter | [enum: CONNECTOR, DELEGATEPROFILE, DELEGATE, PIPELINESETUP, PIPELINEEXECUTION, DEPLOYMENT, AUDIT, TEMPLATE]
 **orgIdentifier** | **String**| Organization Identifier for the Entity | [optional]
 **projectIdentifier** | **String**| Project Identifier for the Entity | [optional]

### Return type

[**ResponseDTOFilter**](ResponseDTOFilter.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/yaml, text/yaml, text/html

<a name="pipelinepostFilter"></a>
# **pipelinepostFilter**
> ResponseDTOFilter pipelinepostFilter(body, accountIdentifier)

Creates a Filter

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FilterApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

FilterApi apiInstance = new FilterApi();
Filter body = new Filter(); // Filter | Details of the Connector to create
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the Entity
try {
    ResponseDTOFilter result = apiInstance.pipelinepostFilter(body, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FilterApi#pipelinepostFilter");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Filter**](Filter.md)| Details of the Connector to create |
 **accountIdentifier** | **String**| Account Identifier for the Entity |

### Return type

[**ResponseDTOFilter**](ResponseDTOFilter.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json, text/yaml, text/html, text/plain
 - **Accept**: application/json, application/yaml, text/yaml, text/html

<a name="pipelineupdateFilter"></a>
# **pipelineupdateFilter**
> ResponseDTOFilter pipelineupdateFilter(body, accountIdentifier)

Updates the Filter

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FilterApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

FilterApi apiInstance = new FilterApi();
Filter body = new Filter(); // Filter | This is the updated Filter. This should have all the fields not just the updated ones
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the Entity
try {
    ResponseDTOFilter result = apiInstance.pipelineupdateFilter(body, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FilterApi#pipelineupdateFilter");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Filter**](Filter.md)| This is the updated Filter. This should have all the fields not just the updated ones |
 **accountIdentifier** | **String**| Account Identifier for the Entity |

### Return type

[**ResponseDTOFilter**](ResponseDTOFilter.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json, text/yaml, text/html, text/plain
 - **Accept**: application/json, application/yaml, text/yaml, text/html

<a name="postFilter"></a>
# **postFilter**
> ResponseDTOFilter postFilter(body, accountIdentifier)

Creates a Filter

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FilterApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

FilterApi apiInstance = new FilterApi();
Filter body = new Filter(); // Filter | Details of the Connector to create
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the Entity
try {
    ResponseDTOFilter result = apiInstance.postFilter(body, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FilterApi#postFilter");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Filter**](Filter.md)| Details of the Connector to create |
 **accountIdentifier** | **String**| Account Identifier for the Entity |

### Return type

[**ResponseDTOFilter**](ResponseDTOFilter.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json, text/yaml, text/html, text/plain
 - **Accept**: application/json, application/yaml, text/yaml, text/html

<a name="resourcegroupdeleteFilter"></a>
# **resourcegroupdeleteFilter**
> ResponseDTOBoolean resourcegroupdeleteFilter(accountIdentifier, identifier, type, orgIdentifier, projectIdentifier)

Delete a Filter by identifier

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FilterApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

FilterApi apiInstance = new FilterApi();
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the Entity
String identifier = "identifier_example"; // String | Filter Identifier
String type = "type_example"; // String | Type of Filter
String orgIdentifier = "orgIdentifier_example"; // String | Organization Identifier for the Entity
String projectIdentifier = "projectIdentifier_example"; // String | Project Identifier for the Entity
try {
    ResponseDTOBoolean result = apiInstance.resourcegroupdeleteFilter(accountIdentifier, identifier, type, orgIdentifier, projectIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FilterApi#resourcegroupdeleteFilter");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountIdentifier** | **String**| Account Identifier for the Entity |
 **identifier** | **String**| Filter Identifier |
 **type** | **String**| Type of Filter | [enum: CONNECTOR, DELEGATEPROFILE, DELEGATE, PIPELINESETUP, PIPELINEEXECUTION, DEPLOYMENT, AUDIT, TEMPLATE]
 **orgIdentifier** | **String**| Organization Identifier for the Entity | [optional]
 **projectIdentifier** | **String**| Project Identifier for the Entity | [optional]

### Return type

[**ResponseDTOBoolean**](ResponseDTOBoolean.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/yaml, text/yaml, text/html

<a name="resourcegroupgetConnectorListV2"></a>
# **resourcegroupgetConnectorListV2**
> ResponseDTOPageResponseFilter resourcegroupgetConnectorListV2(accountIdentifier, type, pageIndex, pageSize, orgIdentifier, projectIdentifier)

Get the list of Filters satisfying the criteria (if any) in the request

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FilterApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

FilterApi apiInstance = new FilterApi();
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the Entity
String type = "type_example"; // String | Type of Filter
Integer pageIndex = 0; // Integer | Page number of navigation. If left empty, default value of 0 is assumed
Integer pageSize = 100; // Integer | Number of entries per page. If left empty, default value of 100 is assumed
String orgIdentifier = "orgIdentifier_example"; // String | Organization Identifier for the Entity
String projectIdentifier = "projectIdentifier_example"; // String | Project Identifier for the Entity
try {
    ResponseDTOPageResponseFilter result = apiInstance.resourcegroupgetConnectorListV2(accountIdentifier, type, pageIndex, pageSize, orgIdentifier, projectIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FilterApi#resourcegroupgetConnectorListV2");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountIdentifier** | **String**| Account Identifier for the Entity |
 **type** | **String**| Type of Filter | [enum: CONNECTOR, DELEGATEPROFILE, DELEGATE, PIPELINESETUP, PIPELINEEXECUTION, DEPLOYMENT, AUDIT, TEMPLATE]
 **pageIndex** | **Integer**| Page number of navigation. If left empty, default value of 0 is assumed | [optional] [default to 0]
 **pageSize** | **Integer**| Number of entries per page. If left empty, default value of 100 is assumed | [optional] [default to 100]
 **orgIdentifier** | **String**| Organization Identifier for the Entity | [optional]
 **projectIdentifier** | **String**| Project Identifier for the Entity | [optional]

### Return type

[**ResponseDTOPageResponseFilter**](ResponseDTOPageResponseFilter.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/yaml, text/yaml, text/html

<a name="resourcegroupgetFilter"></a>
# **resourcegroupgetFilter**
> ResponseDTOFilter resourcegroupgetFilter(accountIdentifier, identifier, type, orgIdentifier, projectIdentifier)

Gets a Filter by identifier

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FilterApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

FilterApi apiInstance = new FilterApi();
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the Entity
String identifier = "identifier_example"; // String | Filter Identifier
String type = "type_example"; // String | Type of Filter
String orgIdentifier = "orgIdentifier_example"; // String | Organization Identifier for the Entity
String projectIdentifier = "projectIdentifier_example"; // String | Project Identifier for the Entity
try {
    ResponseDTOFilter result = apiInstance.resourcegroupgetFilter(accountIdentifier, identifier, type, orgIdentifier, projectIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FilterApi#resourcegroupgetFilter");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountIdentifier** | **String**| Account Identifier for the Entity |
 **identifier** | **String**| Filter Identifier |
 **type** | **String**| Type of Filter | [enum: CONNECTOR, DELEGATEPROFILE, DELEGATE, PIPELINESETUP, PIPELINEEXECUTION, DEPLOYMENT, AUDIT, TEMPLATE]
 **orgIdentifier** | **String**| Organization Identifier for the Entity | [optional]
 **projectIdentifier** | **String**| Project Identifier for the Entity | [optional]

### Return type

[**ResponseDTOFilter**](ResponseDTOFilter.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/yaml, text/yaml, text/html

<a name="resourcegrouppostFilter"></a>
# **resourcegrouppostFilter**
> ResponseDTOFilter resourcegrouppostFilter(body, accountIdentifier)

Creates a Filter

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FilterApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

FilterApi apiInstance = new FilterApi();
Filter body = new Filter(); // Filter | Details of the Connector to create
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the Entity
try {
    ResponseDTOFilter result = apiInstance.resourcegrouppostFilter(body, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FilterApi#resourcegrouppostFilter");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Filter**](Filter.md)| Details of the Connector to create |
 **accountIdentifier** | **String**| Account Identifier for the Entity |

### Return type

[**ResponseDTOFilter**](ResponseDTOFilter.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json, text/yaml, text/html, text/plain
 - **Accept**: application/json, application/yaml, text/yaml, text/html

<a name="resourcegroupupdateFilter"></a>
# **resourcegroupupdateFilter**
> ResponseDTOFilter resourcegroupupdateFilter(body, accountIdentifier)

Updates the Filter

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FilterApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

FilterApi apiInstance = new FilterApi();
Filter body = new Filter(); // Filter | This is the updated Filter. This should have all the fields not just the updated ones
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the Entity
try {
    ResponseDTOFilter result = apiInstance.resourcegroupupdateFilter(body, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FilterApi#resourcegroupupdateFilter");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Filter**](Filter.md)| This is the updated Filter. This should have all the fields not just the updated ones |
 **accountIdentifier** | **String**| Account Identifier for the Entity |

### Return type

[**ResponseDTOFilter**](ResponseDTOFilter.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json, text/yaml, text/html, text/plain
 - **Accept**: application/json, application/yaml, text/yaml, text/html

<a name="updateFilter"></a>
# **updateFilter**
> ResponseDTOFilter updateFilter(body, accountIdentifier)

Updates the Filter

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FilterApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

FilterApi apiInstance = new FilterApi();
Filter body = new Filter(); // Filter | This is the updated Filter. This should have all the fields not just the updated ones
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the Entity
try {
    ResponseDTOFilter result = apiInstance.updateFilter(body, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FilterApi#updateFilter");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Filter**](Filter.md)| This is the updated Filter. This should have all the fields not just the updated ones |
 **accountIdentifier** | **String**| Account Identifier for the Entity |

### Return type

[**ResponseDTOFilter**](ResponseDTOFilter.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json, text/yaml, text/html, text/plain
 - **Accept**: application/json, application/yaml, text/yaml, text/html

