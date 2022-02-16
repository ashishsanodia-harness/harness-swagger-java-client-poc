# OrganizationApi

All URIs are relative to *https://app.harness.io/gateway*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteOrganization**](OrganizationApi.md#deleteOrganization) | **DELETE** /ng/api/organizations/{identifier} | Deletes the Organization corresponding to the specified Organization ID.
[**getOrganization**](OrganizationApi.md#getOrganization) | **GET** /ng/api/organizations/{identifier} | Get the Organization by accountIdentifier and orgIdentifier
[**getOrganizationList**](OrganizationApi.md#getOrganizationList) | **GET** /ng/api/organizations | Get the list of Organizations satisfying the criteria (if any) in the request
[**postOrganization**](OrganizationApi.md#postOrganization) | **POST** /ng/api/organizations | Creates an Organization
[**putOrganization**](OrganizationApi.md#putOrganization) | **PUT** /ng/api/organizations/{identifier} | Updates the Organization

<a name="deleteOrganization"></a>
# **deleteOrganization**
> ResponseDTOBoolean deleteOrganization(identifier, accountIdentifier, ifMatch)

Deletes the Organization corresponding to the specified Organization ID.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.OrganizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

OrganizationApi apiInstance = new OrganizationApi();
String identifier = "identifier_example"; // String | Organization Identifier for the Entity
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the Entity
String ifMatch = "ifMatch_example"; // String | Version number of the Organization
try {
    ResponseDTOBoolean result = apiInstance.deleteOrganization(identifier, accountIdentifier, ifMatch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationApi#deleteOrganization");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **String**| Organization Identifier for the Entity |
 **accountIdentifier** | **String**| Account Identifier for the Entity |
 **ifMatch** | **String**| Version number of the Organization | [optional]

### Return type

[**ResponseDTOBoolean**](ResponseDTOBoolean.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/yaml

<a name="getOrganization"></a>
# **getOrganization**
> ResponseDTOOrganizationResponse getOrganization(identifier, accountIdentifier)

Get the Organization by accountIdentifier and orgIdentifier

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.OrganizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

OrganizationApi apiInstance = new OrganizationApi();
String identifier = "identifier_example"; // String | Organization Identifier for the Entity
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the Entity
try {
    ResponseDTOOrganizationResponse result = apiInstance.getOrganization(identifier, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationApi#getOrganization");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **String**| Organization Identifier for the Entity |
 **accountIdentifier** | **String**| Account Identifier for the Entity |

### Return type

[**ResponseDTOOrganizationResponse**](ResponseDTOOrganizationResponse.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/yaml

<a name="getOrganizationList"></a>
# **getOrganizationList**
> ResponseDTOPageResponseOrganizationResponse getOrganizationList(accountIdentifier, identifiers, searchTerm, pageIndex, pageSize, sortOrders)

Get the list of Organizations satisfying the criteria (if any) in the request

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.OrganizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

OrganizationApi apiInstance = new OrganizationApi();
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the Entity
List<String> identifiers = Arrays.asList("identifiers_example"); // List<String> | This is the list of Org Key IDs. Details specific to these IDs would be fetched.
String searchTerm = "searchTerm_example"; // String | This would be used to filter Organizations. Any Organization having the specified string in its Name, ID and Tag would be filtered.
Integer pageIndex = 0; // Integer | Indicates the number of pages. Results for these pages will be retrieved.
Integer pageSize = 50; // Integer | The number of the elements to fetch
List<SortOrder> sortOrders = Arrays.asList(new SortOrder()); // List<SortOrder> | Sort criteria for the elements.
try {
    ResponseDTOPageResponseOrganizationResponse result = apiInstance.getOrganizationList(accountIdentifier, identifiers, searchTerm, pageIndex, pageSize, sortOrders);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationApi#getOrganizationList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountIdentifier** | **String**| Account Identifier for the Entity |
 **identifiers** | [**List&lt;String&gt;**](String.md)| This is the list of Org Key IDs. Details specific to these IDs would be fetched. | [optional]
 **searchTerm** | **String**| This would be used to filter Organizations. Any Organization having the specified string in its Name, ID and Tag would be filtered. | [optional]
 **pageIndex** | **Integer**| Indicates the number of pages. Results for these pages will be retrieved. | [optional] [default to 0]
 **pageSize** | **Integer**| The number of the elements to fetch | [optional] [default to 50]
 **sortOrders** | [**List&lt;SortOrder&gt;**](SortOrder.md)| Sort criteria for the elements. | [optional]

### Return type

[**ResponseDTOPageResponseOrganizationResponse**](ResponseDTOPageResponseOrganizationResponse.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/yaml

<a name="postOrganization"></a>
# **postOrganization**
> ResponseDTOOrganizationResponse postOrganization(body, accountIdentifier)

Creates an Organization

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.OrganizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

OrganizationApi apiInstance = new OrganizationApi();
OrganizationRequest body = new OrganizationRequest(); // OrganizationRequest | Details of the Organization to create
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the Entity
try {
    ResponseDTOOrganizationResponse result = apiInstance.postOrganization(body, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationApi#postOrganization");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OrganizationRequest**](OrganizationRequest.md)| Details of the Organization to create |
 **accountIdentifier** | **String**| Account Identifier for the Entity |

### Return type

[**ResponseDTOOrganizationResponse**](ResponseDTOOrganizationResponse.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json, application/yaml
 - **Accept**: application/json, application/yaml

<a name="putOrganization"></a>
# **putOrganization**
> ResponseDTOOrganizationResponse putOrganization(body, accountIdentifier, identifier, ifMatch)

Updates the Organization

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.OrganizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

OrganizationApi apiInstance = new OrganizationApi();
OrganizationRequest body = new OrganizationRequest(); // OrganizationRequest | This is the updated Organization. Please provide values for all fields, not just the fields you are updating
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the Entity
String identifier = "identifier_example"; // String | Organization Identifier for the Entity
String ifMatch = "ifMatch_example"; // String | Version number of the Organization
try {
    ResponseDTOOrganizationResponse result = apiInstance.putOrganization(body, accountIdentifier, identifier, ifMatch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationApi#putOrganization");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OrganizationRequest**](OrganizationRequest.md)| This is the updated Organization. Please provide values for all fields, not just the fields you are updating |
 **accountIdentifier** | **String**| Account Identifier for the Entity |
 **identifier** | **String**| Organization Identifier for the Entity |
 **ifMatch** | **String**| Version number of the Organization | [optional]

### Return type

[**ResponseDTOOrganizationResponse**](ResponseDTOOrganizationResponse.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json, application/yaml
 - **Accept**: application/json, application/yaml

