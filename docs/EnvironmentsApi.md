# EnvironmentsApi

All URIs are relative to *https://app.harness.io/gateway*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createEnvironmentV2**](EnvironmentsApi.md#createEnvironmentV2) | **POST** /ng/api/environmentsV2 | Create an Environment
[**deleteEnvironmentV2**](EnvironmentsApi.md#deleteEnvironmentV2) | **DELETE** /ng/api/environmentsV2/{environmentIdentifier} | Delete an Environment by identifier
[**getEnvironmentAccessList**](EnvironmentsApi.md#getEnvironmentAccessList) | **GET** /ng/api/environmentsV2/list/access | Gets Environment Access list
[**getEnvironmentList**](EnvironmentsApi.md#getEnvironmentList) | **GET** /ng/api/environmentsV2 | Gets Environment list for a project
[**getEnvironmentV2**](EnvironmentsApi.md#getEnvironmentV2) | **GET** /ng/api/environmentsV2/{environmentIdentifier} | Gets an Environment by identifier
[**updateEnvironmentV2**](EnvironmentsApi.md#updateEnvironmentV2) | **PUT** /ng/api/environmentsV2 | Update an Environment by identifier
[**upsertEnvironmentV2**](EnvironmentsApi.md#upsertEnvironmentV2) | **PUT** /ng/api/environmentsV2/upsert | Upsert an Environment by identifier

<a name="createEnvironmentV2"></a>
# **createEnvironmentV2**
> ResponseDTOEnvironmentResponse createEnvironmentV2(accountIdentifier, body)

Create an Environment

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EnvironmentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

EnvironmentsApi apiInstance = new EnvironmentsApi();
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the Entity
EnvironmentRequest body = new EnvironmentRequest(); // EnvironmentRequest | Details of the Environment to be created
try {
    ResponseDTOEnvironmentResponse result = apiInstance.createEnvironmentV2(accountIdentifier, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EnvironmentsApi#createEnvironmentV2");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountIdentifier** | **String**| Account Identifier for the Entity |
 **body** | [**EnvironmentRequest**](EnvironmentRequest.md)| Details of the Environment to be created | [optional]

### Return type

[**ResponseDTOEnvironmentResponse**](ResponseDTOEnvironmentResponse.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json, application/yaml
 - **Accept**: application/json, application/yaml

<a name="deleteEnvironmentV2"></a>
# **deleteEnvironmentV2**
> ResponseDTOBoolean deleteEnvironmentV2(environmentIdentifier, accountIdentifier, ifMatch, orgIdentifier, projectIdentifier)

Delete an Environment by identifier

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EnvironmentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

EnvironmentsApi apiInstance = new EnvironmentsApi();
String environmentIdentifier = "environmentIdentifier_example"; // String | Environment Identifier for the entity
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the Entity
String ifMatch = "ifMatch_example"; // String | 
String orgIdentifier = "orgIdentifier_example"; // String | Organization Identifier for the Entity
String projectIdentifier = "projectIdentifier_example"; // String | Project Identifier for the Entity
try {
    ResponseDTOBoolean result = apiInstance.deleteEnvironmentV2(environmentIdentifier, accountIdentifier, ifMatch, orgIdentifier, projectIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EnvironmentsApi#deleteEnvironmentV2");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **environmentIdentifier** | **String**| Environment Identifier for the entity |
 **accountIdentifier** | **String**| Account Identifier for the Entity |
 **ifMatch** | **String**|  | [optional]
 **orgIdentifier** | **String**| Organization Identifier for the Entity | [optional]
 **projectIdentifier** | **String**| Project Identifier for the Entity | [optional]

### Return type

[**ResponseDTOBoolean**](ResponseDTOBoolean.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/yaml

<a name="getEnvironmentAccessList"></a>
# **getEnvironmentAccessList**
> ResponseDTOListEnvironmentResponse getEnvironmentAccessList(accountIdentifier, page, size, orgIdentifier, projectIdentifier, searchTerm, envIdentifiers, sort)

Gets Environment Access list

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EnvironmentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

EnvironmentsApi apiInstance = new EnvironmentsApi();
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the Entity
Integer page = 0; // Integer | page
Integer size = 100; // Integer | size
String orgIdentifier = "orgIdentifier_example"; // String | Organization Identifier for the Entity
String projectIdentifier = "projectIdentifier_example"; // String | Project Identifier for the Entity
String searchTerm = "searchTerm_example"; // String | The word to be searched and included in the list response
List<String> envIdentifiers = Arrays.asList("envIdentifiers_example"); // List<String> | List of EnvironmentIds
List<String> sort = Arrays.asList("sort_example"); // List<String> | Specifies sorting criteria of the list. Like sorting based on the last updated entity, alphabetical sorting in an ascending or descending order
try {
    ResponseDTOListEnvironmentResponse result = apiInstance.getEnvironmentAccessList(accountIdentifier, page, size, orgIdentifier, projectIdentifier, searchTerm, envIdentifiers, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EnvironmentsApi#getEnvironmentAccessList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountIdentifier** | **String**| Account Identifier for the Entity |
 **page** | **Integer**| page | [optional] [default to 0]
 **size** | **Integer**| size | [optional] [default to 100]
 **orgIdentifier** | **String**| Organization Identifier for the Entity | [optional]
 **projectIdentifier** | **String**| Project Identifier for the Entity | [optional]
 **searchTerm** | **String**| The word to be searched and included in the list response | [optional]
 **envIdentifiers** | [**List&lt;String&gt;**](String.md)| List of EnvironmentIds | [optional]
 **sort** | [**List&lt;String&gt;**](String.md)| Specifies sorting criteria of the list. Like sorting based on the last updated entity, alphabetical sorting in an ascending or descending order | [optional]

### Return type

[**ResponseDTOListEnvironmentResponse**](ResponseDTOListEnvironmentResponse.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/yaml

<a name="getEnvironmentList"></a>
# **getEnvironmentList**
> ResponseDTOPageResponseEnvironmentResponse getEnvironmentList(accountIdentifier, page, size, orgIdentifier, projectIdentifier, searchTerm, envIdentifiers, sort)

Gets Environment list for a project

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EnvironmentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

EnvironmentsApi apiInstance = new EnvironmentsApi();
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the Entity
Integer page = 0; // Integer | Indicates the number of pages. Results for these pages will be retrieved.
Integer size = 100; // Integer | The number of the elements to fetch
String orgIdentifier = "orgIdentifier_example"; // String | Organization Identifier for the Entity
String projectIdentifier = "projectIdentifier_example"; // String | Project Identifier for the Entity
String searchTerm = "searchTerm_example"; // String | The word to be searched and included in the list response
List<String> envIdentifiers = Arrays.asList("envIdentifiers_example"); // List<String> | List of EnvironmentIds
List<String> sort = Arrays.asList("sort_example"); // List<String> | Specifies sorting criteria of the list. Like sorting based on the last updated entity, alphabetical sorting in an ascending or descending order
try {
    ResponseDTOPageResponseEnvironmentResponse result = apiInstance.getEnvironmentList(accountIdentifier, page, size, orgIdentifier, projectIdentifier, searchTerm, envIdentifiers, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EnvironmentsApi#getEnvironmentList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountIdentifier** | **String**| Account Identifier for the Entity |
 **page** | **Integer**| Indicates the number of pages. Results for these pages will be retrieved. | [optional] [default to 0]
 **size** | **Integer**| The number of the elements to fetch | [optional] [default to 100]
 **orgIdentifier** | **String**| Organization Identifier for the Entity | [optional]
 **projectIdentifier** | **String**| Project Identifier for the Entity | [optional]
 **searchTerm** | **String**| The word to be searched and included in the list response | [optional]
 **envIdentifiers** | [**List&lt;String&gt;**](String.md)| List of EnvironmentIds | [optional]
 **sort** | [**List&lt;String&gt;**](String.md)| Specifies sorting criteria of the list. Like sorting based on the last updated entity, alphabetical sorting in an ascending or descending order | [optional]

### Return type

[**ResponseDTOPageResponseEnvironmentResponse**](ResponseDTOPageResponseEnvironmentResponse.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/yaml

<a name="getEnvironmentV2"></a>
# **getEnvironmentV2**
> ResponseDTOEnvironmentResponse getEnvironmentV2(environmentIdentifier, accountIdentifier, orgIdentifier, projectIdentifier, deleted)

Gets an Environment by identifier

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EnvironmentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

EnvironmentsApi apiInstance = new EnvironmentsApi();
String environmentIdentifier = "environmentIdentifier_example"; // String | Environment Identifier for the entity
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the Entity
String orgIdentifier = "orgIdentifier_example"; // String | Organization Identifier for the Entity
String projectIdentifier = "projectIdentifier_example"; // String | Project Identifier for the Entity
Boolean deleted = false; // Boolean | Specify whether Environment is deleted or not
try {
    ResponseDTOEnvironmentResponse result = apiInstance.getEnvironmentV2(environmentIdentifier, accountIdentifier, orgIdentifier, projectIdentifier, deleted);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EnvironmentsApi#getEnvironmentV2");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **environmentIdentifier** | **String**| Environment Identifier for the entity |
 **accountIdentifier** | **String**| Account Identifier for the Entity |
 **orgIdentifier** | **String**| Organization Identifier for the Entity | [optional]
 **projectIdentifier** | **String**| Project Identifier for the Entity | [optional]
 **deleted** | **Boolean**| Specify whether Environment is deleted or not | [optional] [default to false]

### Return type

[**ResponseDTOEnvironmentResponse**](ResponseDTOEnvironmentResponse.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/yaml

<a name="updateEnvironmentV2"></a>
# **updateEnvironmentV2**
> ResponseDTOEnvironmentResponse updateEnvironmentV2(accountIdentifier, body, ifMatch)

Update an Environment by identifier

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EnvironmentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

EnvironmentsApi apiInstance = new EnvironmentsApi();
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the Entity
EnvironmentRequest body = new EnvironmentRequest(); // EnvironmentRequest | Details of the Environment to be updated
String ifMatch = "ifMatch_example"; // String | 
try {
    ResponseDTOEnvironmentResponse result = apiInstance.updateEnvironmentV2(accountIdentifier, body, ifMatch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EnvironmentsApi#updateEnvironmentV2");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountIdentifier** | **String**| Account Identifier for the Entity |
 **body** | [**EnvironmentRequest**](EnvironmentRequest.md)| Details of the Environment to be updated | [optional]
 **ifMatch** | **String**|  | [optional]

### Return type

[**ResponseDTOEnvironmentResponse**](ResponseDTOEnvironmentResponse.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json, application/yaml
 - **Accept**: application/json, application/yaml

<a name="upsertEnvironmentV2"></a>
# **upsertEnvironmentV2**
> ResponseDTOEnvironmentResponse upsertEnvironmentV2(accountIdentifier, body, ifMatch)

Upsert an Environment by identifier

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EnvironmentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

EnvironmentsApi apiInstance = new EnvironmentsApi();
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the Entity
EnvironmentRequest body = new EnvironmentRequest(); // EnvironmentRequest | Details of the Environment to be updated
String ifMatch = "ifMatch_example"; // String | 
try {
    ResponseDTOEnvironmentResponse result = apiInstance.upsertEnvironmentV2(accountIdentifier, body, ifMatch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EnvironmentsApi#upsertEnvironmentV2");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountIdentifier** | **String**| Account Identifier for the Entity |
 **body** | [**EnvironmentRequest**](EnvironmentRequest.md)| Details of the Environment to be updated | [optional]
 **ifMatch** | **String**|  | [optional]

### Return type

[**ResponseDTOEnvironmentResponse**](ResponseDTOEnvironmentResponse.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json, application/yaml
 - **Accept**: application/json, application/yaml

