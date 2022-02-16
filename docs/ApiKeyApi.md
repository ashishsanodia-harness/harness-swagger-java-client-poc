# ApiKeyApi

All URIs are relative to *https://app.harness.io/gateway*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createApiKey**](ApiKeyApi.md#createApiKey) | **POST** /ng/api/apikey | Creates an API key
[**deleteApiKey**](ApiKeyApi.md#deleteApiKey) | **DELETE** /ng/api/apikey/{identifier} | Deletes the API Key corresponding to the provided ID.
[**getAggregatedApiKey**](ApiKeyApi.md#getAggregatedApiKey) | **GET** /ng/api/apikey/aggregate/{identifier} | Fetches the API Keys details corresponding to the provided ID and Scope.
[**listApiKeys**](ApiKeyApi.md#listApiKeys) | **GET** /ng/api/apikey | Fetches the list of API Keys corresponding to the request&#x27;s filter criteria.
[**listApiKeys1**](ApiKeyApi.md#listApiKeys1) | **GET** /ng/api/apikey/aggregate | Fetches the list of Aggregated API Keys corresponding to the request&#x27;s filter criteria.
[**updateApiKey**](ApiKeyApi.md#updateApiKey) | **PUT** /ng/api/apikey/{identifier} | Updates API Key for the provided ID

<a name="createApiKey"></a>
# **createApiKey**
> ResponseDTOApiKey createApiKey(body)

Creates an API key

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ApiKeyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

ApiKeyApi apiInstance = new ApiKeyApi();
ApiKey body = new ApiKey(); // ApiKey | 
try {
    ResponseDTOApiKey result = apiInstance.createApiKey(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApiKeyApi#createApiKey");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ApiKey**](ApiKey.md)|  | [optional]

### Return type

[**ResponseDTOApiKey**](ResponseDTOApiKey.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json, application/yaml, text/plain
 - **Accept**: application/json, application/yaml, text/plain

<a name="deleteApiKey"></a>
# **deleteApiKey**
> ResponseDTOBoolean deleteApiKey(accountIdentifier, apiKeyType, parentIdentifier, identifier, orgIdentifier, projectIdentifier)

Deletes the API Key corresponding to the provided ID.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ApiKeyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

ApiKeyApi apiInstance = new ApiKeyApi();
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the Entity
String apiKeyType = "apiKeyType_example"; // String | This is the API Key type like Personal Access Key or Service Account Key.
String parentIdentifier = "parentIdentifier_example"; // String | Id of API key's Parent Service Account
String identifier = "identifier_example"; // String | This is the API key ID
String orgIdentifier = "orgIdentifier_example"; // String | Organization Identifier for the Entity
String projectIdentifier = "projectIdentifier_example"; // String | Project Identifier for the Entity
try {
    ResponseDTOBoolean result = apiInstance.deleteApiKey(accountIdentifier, apiKeyType, parentIdentifier, identifier, orgIdentifier, projectIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApiKeyApi#deleteApiKey");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountIdentifier** | **String**| Account Identifier for the Entity |
 **apiKeyType** | **String**| This is the API Key type like Personal Access Key or Service Account Key. | [enum: USER, SERVICE_ACCOUNT]
 **parentIdentifier** | **String**| Id of API key&#x27;s Parent Service Account |
 **identifier** | **String**| This is the API key ID |
 **orgIdentifier** | **String**| Organization Identifier for the Entity | [optional]
 **projectIdentifier** | **String**| Project Identifier for the Entity | [optional]

### Return type

[**ResponseDTOBoolean**](ResponseDTOBoolean.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/yaml, text/plain

<a name="getAggregatedApiKey"></a>
# **getAggregatedApiKey**
> ResponseDTOApiKeyAggregate getAggregatedApiKey(accountIdentifier, apiKeyType, parentIdentifier, identifier, orgIdentifier, projectIdentifier)

Fetches the API Keys details corresponding to the provided ID and Scope.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ApiKeyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

ApiKeyApi apiInstance = new ApiKeyApi();
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the Entity
String apiKeyType = "apiKeyType_example"; // String | This is the API Key type like Personal Access Key or Service Account Key.
String parentIdentifier = "parentIdentifier_example"; // String | ID of API key's Parent Service Account
String identifier = "identifier_example"; // String | This is the API key ID
String orgIdentifier = "orgIdentifier_example"; // String | Organization Identifier for the Entity
String projectIdentifier = "projectIdentifier_example"; // String | Project Identifier for the Entity
try {
    ResponseDTOApiKeyAggregate result = apiInstance.getAggregatedApiKey(accountIdentifier, apiKeyType, parentIdentifier, identifier, orgIdentifier, projectIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApiKeyApi#getAggregatedApiKey");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountIdentifier** | **String**| Account Identifier for the Entity |
 **apiKeyType** | **String**| This is the API Key type like Personal Access Key or Service Account Key. | [enum: USER, SERVICE_ACCOUNT]
 **parentIdentifier** | **String**| ID of API key&#x27;s Parent Service Account |
 **identifier** | **String**| This is the API key ID |
 **orgIdentifier** | **String**| Organization Identifier for the Entity | [optional]
 **projectIdentifier** | **String**| Project Identifier for the Entity | [optional]

### Return type

[**ResponseDTOApiKeyAggregate**](ResponseDTOApiKeyAggregate.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/yaml, text/plain

<a name="listApiKeys"></a>
# **listApiKeys**
> ResponseDTOListApiKey listApiKeys(accountIdentifier, apiKeyType, parentIdentifier, orgIdentifier, projectIdentifier, identifiers)

Fetches the list of API Keys corresponding to the request&#x27;s filter criteria.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ApiKeyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

ApiKeyApi apiInstance = new ApiKeyApi();
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the Entity
String apiKeyType = "apiKeyType_example"; // String | This is the API Key type like Personal Access Key or Service Account Key.
String parentIdentifier = "parentIdentifier_example"; // String | ID of API key's Parent Service Account
String orgIdentifier = "orgIdentifier_example"; // String | Organization Identifier for the Entity
String projectIdentifier = "projectIdentifier_example"; // String | Project Identifier for the Entity
List<String> identifiers = Arrays.asList("identifiers_example"); // List<String> | This is the list of API Key IDs. Details specific to these IDs would be fetched.
try {
    ResponseDTOListApiKey result = apiInstance.listApiKeys(accountIdentifier, apiKeyType, parentIdentifier, orgIdentifier, projectIdentifier, identifiers);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApiKeyApi#listApiKeys");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountIdentifier** | **String**| Account Identifier for the Entity |
 **apiKeyType** | **String**| This is the API Key type like Personal Access Key or Service Account Key. | [enum: USER, SERVICE_ACCOUNT]
 **parentIdentifier** | **String**| ID of API key&#x27;s Parent Service Account |
 **orgIdentifier** | **String**| Organization Identifier for the Entity | [optional]
 **projectIdentifier** | **String**| Project Identifier for the Entity | [optional]
 **identifiers** | [**List&lt;String&gt;**](String.md)| This is the list of API Key IDs. Details specific to these IDs would be fetched. | [optional]

### Return type

[**ResponseDTOListApiKey**](ResponseDTOListApiKey.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/yaml, text/plain

<a name="listApiKeys1"></a>
# **listApiKeys1**
> ResponseDTOPageResponseApiKeyAggregate listApiKeys1(accountIdentifier, apiKeyType, parentIdentifier, orgIdentifier, projectIdentifier, identifiers, pageIndex, pageSize, sortOrders, searchTerm)

Fetches the list of Aggregated API Keys corresponding to the request&#x27;s filter criteria.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ApiKeyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

ApiKeyApi apiInstance = new ApiKeyApi();
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the Entity
String apiKeyType = "apiKeyType_example"; // String | This is the API Key type like Personal Access Key or Service Account Key.
String parentIdentifier = "parentIdentifier_example"; // String | ID of API key's Parent Service Account
String orgIdentifier = "orgIdentifier_example"; // String | Organization Identifier for the Entity
String projectIdentifier = "projectIdentifier_example"; // String | Project Identifier for the Entity
List<String> identifiers = Arrays.asList("identifiers_example"); // List<String> | This is the list of API Key IDs. Details specific to these IDs would be fetched.
Integer pageIndex = 0; // Integer | Indicates the number of pages. Results for these pages will be retrieved.
Integer pageSize = 50; // Integer | The number of the elements to fetch
List<SortOrder> sortOrders = Arrays.asList(new SortOrder()); // List<SortOrder> | Sort criteria for the elements.
String searchTerm = "searchTerm_example"; // String | This would be used to filter API keys. Any API key having the specified string in its Name, ID and Tag would be filtered.
try {
    ResponseDTOPageResponseApiKeyAggregate result = apiInstance.listApiKeys1(accountIdentifier, apiKeyType, parentIdentifier, orgIdentifier, projectIdentifier, identifiers, pageIndex, pageSize, sortOrders, searchTerm);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApiKeyApi#listApiKeys1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountIdentifier** | **String**| Account Identifier for the Entity |
 **apiKeyType** | **String**| This is the API Key type like Personal Access Key or Service Account Key. | [enum: USER, SERVICE_ACCOUNT]
 **parentIdentifier** | **String**| ID of API key&#x27;s Parent Service Account |
 **orgIdentifier** | **String**| Organization Identifier for the Entity | [optional]
 **projectIdentifier** | **String**| Project Identifier for the Entity | [optional]
 **identifiers** | [**List&lt;String&gt;**](String.md)| This is the list of API Key IDs. Details specific to these IDs would be fetched. | [optional]
 **pageIndex** | **Integer**| Indicates the number of pages. Results for these pages will be retrieved. | [optional] [default to 0]
 **pageSize** | **Integer**| The number of the elements to fetch | [optional] [default to 50]
 **sortOrders** | [**List&lt;SortOrder&gt;**](SortOrder.md)| Sort criteria for the elements. | [optional]
 **searchTerm** | **String**| This would be used to filter API keys. Any API key having the specified string in its Name, ID and Tag would be filtered. | [optional]

### Return type

[**ResponseDTOPageResponseApiKeyAggregate**](ResponseDTOPageResponseApiKeyAggregate.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/yaml, text/plain

<a name="updateApiKey"></a>
# **updateApiKey**
> ResponseDTOApiKey updateApiKey(identifier, body)

Updates API Key for the provided ID

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ApiKeyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

ApiKeyApi apiInstance = new ApiKeyApi();
String identifier = "identifier_example"; // String | This is the API key ID
ApiKey body = new ApiKey(); // ApiKey | 
try {
    ResponseDTOApiKey result = apiInstance.updateApiKey(identifier, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApiKeyApi#updateApiKey");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **String**| This is the API key ID |
 **body** | [**ApiKey**](ApiKey.md)|  | [optional]

### Return type

[**ResponseDTOApiKey**](ResponseDTOApiKey.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json, application/yaml, text/plain
 - **Accept**: application/json, application/yaml, text/plain

