# ServicesApi

All URIs are relative to *https://app.harness.io/gateway*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createServiceV2**](ServicesApi.md#createServiceV2) | **POST** /ng/api/servicesV2 | Create a Service
[**createServicesV2**](ServicesApi.md#createServicesV2) | **POST** /ng/api/servicesV2/batch | Create Services
[**deleteServiceV2**](ServicesApi.md#deleteServiceV2) | **DELETE** /ng/api/servicesV2/{serviceIdentifier} | Delete a Service by identifier
[**getServiceAccessList**](ServicesApi.md#getServiceAccessList) | **GET** /ng/api/servicesV2/list/access | Gets Service Access list
[**getServiceList**](ServicesApi.md#getServiceList) | **GET** /ng/api/servicesV2 | Gets Service list
[**getServiceV2**](ServicesApi.md#getServiceV2) | **GET** /ng/api/servicesV2/{serviceIdentifier} | Gets a Service by identifier
[**updateServiceV2**](ServicesApi.md#updateServiceV2) | **PUT** /ng/api/servicesV2 | Update a Service by identifier
[**upsertServiceV2**](ServicesApi.md#upsertServiceV2) | **PUT** /ng/api/servicesV2/upsert | Upsert a Service by identifier

<a name="createServiceV2"></a>
# **createServiceV2**
> ResponseDTOServiceResponse createServiceV2(accountIdentifier, body)

Create a Service

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ServicesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

ServicesApi apiInstance = new ServicesApi();
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the Entity
ServiceRequest body = new ServiceRequest(); // ServiceRequest | Details of the Service to be created
try {
    ResponseDTOServiceResponse result = apiInstance.createServiceV2(accountIdentifier, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServicesApi#createServiceV2");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountIdentifier** | **String**| Account Identifier for the Entity |
 **body** | [**ServiceRequest**](ServiceRequest.md)| Details of the Service to be created | [optional]

### Return type

[**ResponseDTOServiceResponse**](ResponseDTOServiceResponse.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json, application/yaml
 - **Accept**: application/json, application/yaml

<a name="createServicesV2"></a>
# **createServicesV2**
> ResponseDTOPageResponseServiceResponse createServicesV2(accountIdentifier, body)

Create Services

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ServicesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

ServicesApi apiInstance = new ServicesApi();
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the Entity
List<ServiceRequest> body = Arrays.asList(new ServiceRequest()); // List<ServiceRequest> | Details of the Services to be created
try {
    ResponseDTOPageResponseServiceResponse result = apiInstance.createServicesV2(accountIdentifier, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServicesApi#createServicesV2");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountIdentifier** | **String**| Account Identifier for the Entity |
 **body** | [**List&lt;ServiceRequest&gt;**](ServiceRequest.md)| Details of the Services to be created | [optional]

### Return type

[**ResponseDTOPageResponseServiceResponse**](ResponseDTOPageResponseServiceResponse.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json, application/yaml
 - **Accept**: application/json, application/yaml

<a name="deleteServiceV2"></a>
# **deleteServiceV2**
> ResponseDTOBoolean deleteServiceV2(serviceIdentifier, accountIdentifier, ifMatch, orgIdentifier, projectIdentifier)

Delete a Service by identifier

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ServicesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

ServicesApi apiInstance = new ServicesApi();
String serviceIdentifier = "serviceIdentifier_example"; // String | Service Identifier for the entity
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the Entity
String ifMatch = "ifMatch_example"; // String | 
String orgIdentifier = "orgIdentifier_example"; // String | Organization Identifier for the Entity
String projectIdentifier = "projectIdentifier_example"; // String | Project Identifier for the Entity
try {
    ResponseDTOBoolean result = apiInstance.deleteServiceV2(serviceIdentifier, accountIdentifier, ifMatch, orgIdentifier, projectIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServicesApi#deleteServiceV2");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serviceIdentifier** | **String**| Service Identifier for the entity |
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

<a name="getServiceAccessList"></a>
# **getServiceAccessList**
> ResponseDTOListServiceResponse getServiceAccessList(accountIdentifier, page, size, orgIdentifier, projectIdentifier, searchTerm, serviceIdentifiers, sort)

Gets Service Access list

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ServicesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

ServicesApi apiInstance = new ServicesApi();
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the Entity
Integer page = 0; // Integer | Indicates the number of pages. Results for these pages will be retrieved.
Integer size = 100; // Integer | The number of the elements to fetch
String orgIdentifier = "orgIdentifier_example"; // String | Organization Identifier for the Entity
String projectIdentifier = "projectIdentifier_example"; // String | Project Identifier for the Entity
String searchTerm = "searchTerm_example"; // String | The word to be searched and included in the list response
List<String> serviceIdentifiers = Arrays.asList("serviceIdentifiers_example"); // List<String> | List of ServicesIds
List<String> sort = Arrays.asList("sort_example"); // List<String> | Specifies the sorting criteria of the list. Like sorting based on the last updated entity, alphabetical sorting in an ascending or descending order
try {
    ResponseDTOListServiceResponse result = apiInstance.getServiceAccessList(accountIdentifier, page, size, orgIdentifier, projectIdentifier, searchTerm, serviceIdentifiers, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServicesApi#getServiceAccessList");
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
 **serviceIdentifiers** | [**List&lt;String&gt;**](String.md)| List of ServicesIds | [optional]
 **sort** | [**List&lt;String&gt;**](String.md)| Specifies the sorting criteria of the list. Like sorting based on the last updated entity, alphabetical sorting in an ascending or descending order | [optional]

### Return type

[**ResponseDTOListServiceResponse**](ResponseDTOListServiceResponse.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/yaml

<a name="getServiceList"></a>
# **getServiceList**
> ResponseDTOPageResponseServiceResponse getServiceList(accountIdentifier, page, size, orgIdentifier, projectIdentifier, searchTerm, serviceIdentifiers, sort)

Gets Service list

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ServicesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

ServicesApi apiInstance = new ServicesApi();
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the Entity
Integer page = 0; // Integer | Indicates the number of pages. Results for these pages will be retrieved.
Integer size = 100; // Integer | The number of the elements to fetch
String orgIdentifier = "orgIdentifier_example"; // String | Organization Identifier for the Entity
String projectIdentifier = "projectIdentifier_example"; // String | Project Identifier for the Entity
String searchTerm = "searchTerm_example"; // String | The word to be searched and included in the list response
List<String> serviceIdentifiers = Arrays.asList("serviceIdentifiers_example"); // List<String> | List of ServicesIds
List<String> sort = Arrays.asList("sort_example"); // List<String> | Specifies the sorting criteria of the list. Like sorting based on the last updated entity, alphabetical sorting in an ascending or descending order
try {
    ResponseDTOPageResponseServiceResponse result = apiInstance.getServiceList(accountIdentifier, page, size, orgIdentifier, projectIdentifier, searchTerm, serviceIdentifiers, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServicesApi#getServiceList");
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
 **serviceIdentifiers** | [**List&lt;String&gt;**](String.md)| List of ServicesIds | [optional]
 **sort** | [**List&lt;String&gt;**](String.md)| Specifies the sorting criteria of the list. Like sorting based on the last updated entity, alphabetical sorting in an ascending or descending order | [optional]

### Return type

[**ResponseDTOPageResponseServiceResponse**](ResponseDTOPageResponseServiceResponse.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/yaml

<a name="getServiceV2"></a>
# **getServiceV2**
> ResponseDTOServiceResponse getServiceV2(serviceIdentifier, accountIdentifier, orgIdentifier, projectIdentifier, deleted)

Gets a Service by identifier

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ServicesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

ServicesApi apiInstance = new ServicesApi();
String serviceIdentifier = "serviceIdentifier_example"; // String | Service Identifier for the entity
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the Entity
String orgIdentifier = "orgIdentifier_example"; // String | Organization Identifier for the Entity
String projectIdentifier = "projectIdentifier_example"; // String | Project Identifier for the Entity
Boolean deleted = false; // Boolean | Specify whether Service is deleted or not
try {
    ResponseDTOServiceResponse result = apiInstance.getServiceV2(serviceIdentifier, accountIdentifier, orgIdentifier, projectIdentifier, deleted);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServicesApi#getServiceV2");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serviceIdentifier** | **String**| Service Identifier for the entity |
 **accountIdentifier** | **String**| Account Identifier for the Entity |
 **orgIdentifier** | **String**| Organization Identifier for the Entity | [optional]
 **projectIdentifier** | **String**| Project Identifier for the Entity | [optional]
 **deleted** | **Boolean**| Specify whether Service is deleted or not | [optional] [default to false]

### Return type

[**ResponseDTOServiceResponse**](ResponseDTOServiceResponse.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/yaml

<a name="updateServiceV2"></a>
# **updateServiceV2**
> ResponseDTOServiceResponse updateServiceV2(accountIdentifier, body, ifMatch)

Update a Service by identifier

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ServicesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

ServicesApi apiInstance = new ServicesApi();
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the Entity
ServiceRequest body = new ServiceRequest(); // ServiceRequest | Details of the Service to be updated
String ifMatch = "ifMatch_example"; // String | 
try {
    ResponseDTOServiceResponse result = apiInstance.updateServiceV2(accountIdentifier, body, ifMatch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServicesApi#updateServiceV2");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountIdentifier** | **String**| Account Identifier for the Entity |
 **body** | [**ServiceRequest**](ServiceRequest.md)| Details of the Service to be updated | [optional]
 **ifMatch** | **String**|  | [optional]

### Return type

[**ResponseDTOServiceResponse**](ResponseDTOServiceResponse.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json, application/yaml
 - **Accept**: application/json, application/yaml

<a name="upsertServiceV2"></a>
# **upsertServiceV2**
> ResponseDTOServiceResponse upsertServiceV2(accountIdentifier, body, ifMatch)

Upsert a Service by identifier

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ServicesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

ServicesApi apiInstance = new ServicesApi();
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the Entity
ServiceRequest body = new ServiceRequest(); // ServiceRequest | Details of the Service to be updated
String ifMatch = "ifMatch_example"; // String | 
try {
    ResponseDTOServiceResponse result = apiInstance.upsertServiceV2(accountIdentifier, body, ifMatch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServicesApi#upsertServiceV2");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountIdentifier** | **String**| Account Identifier for the Entity |
 **body** | [**ServiceRequest**](ServiceRequest.md)| Details of the Service to be updated | [optional]
 **ifMatch** | **String**|  | [optional]

### Return type

[**ResponseDTOServiceResponse**](ResponseDTOServiceResponse.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json, application/yaml
 - **Accept**: application/json, application/yaml

