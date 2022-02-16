# ServiceAccountApi

All URIs are relative to *https://app.harness.io/gateway*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createServiceAccount**](ServiceAccountApi.md#createServiceAccount) | **POST** /ng/api/serviceaccount | Creates a Service Account
[**deleteServiceAccount**](ServiceAccountApi.md#deleteServiceAccount) | **DELETE** /ng/api/serviceaccount/{identifier} | Deletes Service Account by ID
[**getAggregatedServiceAccount**](ServiceAccountApi.md#getAggregatedServiceAccount) | **GET** /ng/api/serviceaccount/aggregate/{identifier} | Get the Service Account by accountIdentifier and Service Account ID and Scope.
[**listAggregatedServiceAccounts**](ServiceAccountApi.md#listAggregatedServiceAccounts) | **GET** /ng/api/serviceaccount/aggregate | Fetches the list of Aggregated Service Accounts corresponding to the request&#x27;s filter criteria.
[**listServiceAccount**](ServiceAccountApi.md#listServiceAccount) | **GET** /ng/api/serviceaccount | Fetches the list of Service Accounts corresponding to the request&#x27;s filter criteria.
[**updateServiceAccount**](ServiceAccountApi.md#updateServiceAccount) | **PUT** /ng/api/serviceaccount/{identifier} | Updates the Service Account.

<a name="createServiceAccount"></a>
# **createServiceAccount**
> ResponseDTOServiceAccount createServiceAccount(body, accountIdentifier, orgIdentifier, projectIdentifier)

Creates a Service Account

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ServiceAccountApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

ServiceAccountApi apiInstance = new ServiceAccountApi();
ServiceAccount body = new ServiceAccount(); // ServiceAccount | Details required to create Service Account
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the Entity
String orgIdentifier = "orgIdentifier_example"; // String | Organization Identifier for the Entity
String projectIdentifier = "projectIdentifier_example"; // String | Project Identifier for the Entity
try {
    ResponseDTOServiceAccount result = apiInstance.createServiceAccount(body, accountIdentifier, orgIdentifier, projectIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServiceAccountApi#createServiceAccount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ServiceAccount**](ServiceAccount.md)| Details required to create Service Account |
 **accountIdentifier** | **String**| Account Identifier for the Entity |
 **orgIdentifier** | **String**| Organization Identifier for the Entity | [optional]
 **projectIdentifier** | **String**| Project Identifier for the Entity | [optional]

### Return type

[**ResponseDTOServiceAccount**](ResponseDTOServiceAccount.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json, application/yaml, text/plain
 - **Accept**: application/json, application/yaml, text/plain

<a name="deleteServiceAccount"></a>
# **deleteServiceAccount**
> ResponseDTOBoolean deleteServiceAccount(accountIdentifier, identifier, orgIdentifier, projectIdentifier)

Deletes Service Account by ID

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ServiceAccountApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

ServiceAccountApi apiInstance = new ServiceAccountApi();
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the Entity
String identifier = "identifier_example"; // String | Service Account ID
String orgIdentifier = "orgIdentifier_example"; // String | Organization Identifier for the Entity
String projectIdentifier = "projectIdentifier_example"; // String | Project Identifier for the Entity
try {
    ResponseDTOBoolean result = apiInstance.deleteServiceAccount(accountIdentifier, identifier, orgIdentifier, projectIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServiceAccountApi#deleteServiceAccount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountIdentifier** | **String**| Account Identifier for the Entity |
 **identifier** | **String**| Service Account ID |
 **orgIdentifier** | **String**| Organization Identifier for the Entity | [optional]
 **projectIdentifier** | **String**| Project Identifier for the Entity | [optional]

### Return type

[**ResponseDTOBoolean**](ResponseDTOBoolean.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/yaml, text/plain

<a name="getAggregatedServiceAccount"></a>
# **getAggregatedServiceAccount**
> ResponseDTOServiceAccountAggregate getAggregatedServiceAccount(accountIdentifier, identifier, orgIdentifier, projectIdentifier)

Get the Service Account by accountIdentifier and Service Account ID and Scope.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ServiceAccountApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

ServiceAccountApi apiInstance = new ServiceAccountApi();
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the Entity
String identifier = "identifier_example"; // String | Service Account IDr
String orgIdentifier = "orgIdentifier_example"; // String | Organization Identifier for the Entity
String projectIdentifier = "projectIdentifier_example"; // String | Project Identifier for the Entity
try {
    ResponseDTOServiceAccountAggregate result = apiInstance.getAggregatedServiceAccount(accountIdentifier, identifier, orgIdentifier, projectIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServiceAccountApi#getAggregatedServiceAccount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountIdentifier** | **String**| Account Identifier for the Entity |
 **identifier** | **String**| Service Account IDr |
 **orgIdentifier** | **String**| Organization Identifier for the Entity | [optional]
 **projectIdentifier** | **String**| Project Identifier for the Entity | [optional]

### Return type

[**ResponseDTOServiceAccountAggregate**](ResponseDTOServiceAccountAggregate.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/yaml, text/plain

<a name="listAggregatedServiceAccounts"></a>
# **listAggregatedServiceAccounts**
> ResponseDTOPageResponseServiceAccountAggregate listAggregatedServiceAccounts(accountIdentifier, orgIdentifier, projectIdentifier, identifiers, pageIndex, pageSize, sortOrders, searchTerm)

Fetches the list of Aggregated Service Accounts corresponding to the request&#x27;s filter criteria.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ServiceAccountApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

ServiceAccountApi apiInstance = new ServiceAccountApi();
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the Entity
String orgIdentifier = "orgIdentifier_example"; // String | Organization Identifier for the Entity
String projectIdentifier = "projectIdentifier_example"; // String | Project Identifier for the Entity
List<String> identifiers = Arrays.asList("identifiers_example"); // List<String> | This is the list of Service Account IDs. Details specific to these IDs would be fetched.
Integer pageIndex = 0; // Integer | Indicates the number of pages. Results for these pages will be retrieved.
Integer pageSize = 50; // Integer | The number of the elements to fetch
List<SortOrder> sortOrders = Arrays.asList(new SortOrder()); // List<SortOrder> | Sort criteria for the elements.
String searchTerm = "searchTerm_example"; // String | This would be used to filter Service Accounts. Any Service Account having the specified string in its Name, ID and Tag would be filtered.
try {
    ResponseDTOPageResponseServiceAccountAggregate result = apiInstance.listAggregatedServiceAccounts(accountIdentifier, orgIdentifier, projectIdentifier, identifiers, pageIndex, pageSize, sortOrders, searchTerm);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServiceAccountApi#listAggregatedServiceAccounts");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountIdentifier** | **String**| Account Identifier for the Entity |
 **orgIdentifier** | **String**| Organization Identifier for the Entity | [optional]
 **projectIdentifier** | **String**| Project Identifier for the Entity | [optional]
 **identifiers** | [**List&lt;String&gt;**](String.md)| This is the list of Service Account IDs. Details specific to these IDs would be fetched. | [optional]
 **pageIndex** | **Integer**| Indicates the number of pages. Results for these pages will be retrieved. | [optional] [default to 0]
 **pageSize** | **Integer**| The number of the elements to fetch | [optional] [default to 50]
 **sortOrders** | [**List&lt;SortOrder&gt;**](SortOrder.md)| Sort criteria for the elements. | [optional]
 **searchTerm** | **String**| This would be used to filter Service Accounts. Any Service Account having the specified string in its Name, ID and Tag would be filtered. | [optional]

### Return type

[**ResponseDTOPageResponseServiceAccountAggregate**](ResponseDTOPageResponseServiceAccountAggregate.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/yaml, text/plain

<a name="listServiceAccount"></a>
# **listServiceAccount**
> ResponseDTOListServiceAccount listServiceAccount(accountIdentifier, orgIdentifier, projectIdentifier, identifiers)

Fetches the list of Service Accounts corresponding to the request&#x27;s filter criteria.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ServiceAccountApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

ServiceAccountApi apiInstance = new ServiceAccountApi();
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the Entity
String orgIdentifier = "orgIdentifier_example"; // String | Organization Identifier for the Entity
String projectIdentifier = "projectIdentifier_example"; // String | Project Identifier for the Entity
List<String> identifiers = Arrays.asList("identifiers_example"); // List<String> | This is the list of Service Account IDs. Details specific to these IDs would be fetched.
try {
    ResponseDTOListServiceAccount result = apiInstance.listServiceAccount(accountIdentifier, orgIdentifier, projectIdentifier, identifiers);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServiceAccountApi#listServiceAccount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountIdentifier** | **String**| Account Identifier for the Entity |
 **orgIdentifier** | **String**| Organization Identifier for the Entity | [optional]
 **projectIdentifier** | **String**| Project Identifier for the Entity | [optional]
 **identifiers** | [**List&lt;String&gt;**](String.md)| This is the list of Service Account IDs. Details specific to these IDs would be fetched. | [optional]

### Return type

[**ResponseDTOListServiceAccount**](ResponseDTOListServiceAccount.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/yaml, text/plain

<a name="updateServiceAccount"></a>
# **updateServiceAccount**
> ResponseDTOServiceAccount updateServiceAccount(body, accountIdentifier, identifier, orgIdentifier, projectIdentifier)

Updates the Service Account.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ServiceAccountApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

ServiceAccountApi apiInstance = new ServiceAccountApi();
ServiceAccount body = new ServiceAccount(); // ServiceAccount | Details of the updated Service Account
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the Entity
String identifier = "identifier_example"; // String | Service Account ID
String orgIdentifier = "orgIdentifier_example"; // String | Organization Identifier for the Entity
String projectIdentifier = "projectIdentifier_example"; // String | Project Identifier for the Entity
try {
    ResponseDTOServiceAccount result = apiInstance.updateServiceAccount(body, accountIdentifier, identifier, orgIdentifier, projectIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServiceAccountApi#updateServiceAccount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ServiceAccount**](ServiceAccount.md)| Details of the updated Service Account |
 **accountIdentifier** | **String**| Account Identifier for the Entity |
 **identifier** | **String**| Service Account ID |
 **orgIdentifier** | **String**| Organization Identifier for the Entity | [optional]
 **projectIdentifier** | **String**| Project Identifier for the Entity | [optional]

### Return type

[**ResponseDTOServiceAccount**](ResponseDTOServiceAccount.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json, application/yaml, text/plain
 - **Accept**: application/json, application/yaml, text/plain

