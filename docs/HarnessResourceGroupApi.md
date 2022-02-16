# HarnessResourceGroupApi

All URIs are relative to *https://app.harness.io/gateway*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createResourceGroup**](HarnessResourceGroupApi.md#createResourceGroup) | **POST** /resourcegroup/api/resourcegroup | Create a resource group
[**deleteResourceGroup**](HarnessResourceGroupApi.md#deleteResourceGroup) | **DELETE** /resourcegroup/api/resourcegroup/{identifier} | Delete a resource group
[**getFilterResourceGroupList**](HarnessResourceGroupApi.md#getFilterResourceGroupList) | **POST** /resourcegroup/api/resourcegroup/filter | 
[**getResourceGroup**](HarnessResourceGroupApi.md#getResourceGroup) | **GET** /resourcegroup/api/resourcegroup/{identifier} | Get a resource group by identifier
[**getResourceGroupList**](HarnessResourceGroupApi.md#getResourceGroupList) | **GET** /resourcegroup/api/resourcegroup | Get list of resource groups
[**updateResourceGroup**](HarnessResourceGroupApi.md#updateResourceGroup) | **PUT** /resourcegroup/api/resourcegroup/{identifier} | Update a resource group

<a name="createResourceGroup"></a>
# **createResourceGroup**
> ResponseDTOResourceGroupResponse createResourceGroup(body, accountIdentifier, orgIdentifier, projectIdentifier)

Create a resource group

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.HarnessResourceGroupApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

HarnessResourceGroupApi apiInstance = new HarnessResourceGroupApi();
ResourceGroupRequest body = new ResourceGroupRequest(); // ResourceGroupRequest | This contains the details required to create a Resource Group
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the Entity
String orgIdentifier = "orgIdentifier_example"; // String | Organization Identifier for the Entity
String projectIdentifier = "projectIdentifier_example"; // String | Project Identifier for the Entity
try {
    ResponseDTOResourceGroupResponse result = apiInstance.createResourceGroup(body, accountIdentifier, orgIdentifier, projectIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HarnessResourceGroupApi#createResourceGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ResourceGroupRequest**](ResourceGroupRequest.md)| This contains the details required to create a Resource Group |
 **accountIdentifier** | **String**| Account Identifier for the Entity |
 **orgIdentifier** | **String**| Organization Identifier for the Entity | [optional]
 **projectIdentifier** | **String**| Project Identifier for the Entity | [optional]

### Return type

[**ResponseDTOResourceGroupResponse**](ResponseDTOResourceGroupResponse.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json, application/yaml
 - **Accept**: application/json, application/yaml

<a name="deleteResourceGroup"></a>
# **deleteResourceGroup**
> ResponseDTOBoolean deleteResourceGroup(identifier, accountIdentifier, orgIdentifier, projectIdentifier)

Delete a resource group

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.HarnessResourceGroupApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

HarnessResourceGroupApi apiInstance = new HarnessResourceGroupApi();
String identifier = "identifier_example"; // String | 
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the Entity
String orgIdentifier = "orgIdentifier_example"; // String | Organization Identifier for the Entity
String projectIdentifier = "projectIdentifier_example"; // String | Project Identifier for the Entity
try {
    ResponseDTOBoolean result = apiInstance.deleteResourceGroup(identifier, accountIdentifier, orgIdentifier, projectIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HarnessResourceGroupApi#deleteResourceGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **String**|  |
 **accountIdentifier** | **String**| Account Identifier for the Entity |
 **orgIdentifier** | **String**| Organization Identifier for the Entity | [optional]
 **projectIdentifier** | **String**| Project Identifier for the Entity | [optional]

### Return type

[**ResponseDTOBoolean**](ResponseDTOBoolean.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/yaml

<a name="getFilterResourceGroupList"></a>
# **getFilterResourceGroupList**
> ResponseDTOPageResponseResourceGroupResponse getFilterResourceGroupList(body, pageIndex, pageSize, sortOrders)



This fetches a filtered list of Resource Groups

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.HarnessResourceGroupApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

HarnessResourceGroupApi apiInstance = new HarnessResourceGroupApi();
ResourceGroupFilter body = new ResourceGroupFilter(); // ResourceGroupFilter | Filter Resource Groups based on multiple parameters
Integer pageIndex = 0; // Integer | Indicates the number of pages. Results for these pages will be retrieved.
Integer pageSize = 50; // Integer | The number of the elements to fetch
List<SortOrder> sortOrders = Arrays.asList(new SortOrder()); // List<SortOrder> | Sort criteria for the elements.
try {
    ResponseDTOPageResponseResourceGroupResponse result = apiInstance.getFilterResourceGroupList(body, pageIndex, pageSize, sortOrders);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HarnessResourceGroupApi#getFilterResourceGroupList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ResourceGroupFilter**](ResourceGroupFilter.md)| Filter Resource Groups based on multiple parameters |
 **pageIndex** | **Integer**| Indicates the number of pages. Results for these pages will be retrieved. | [optional] [default to 0]
 **pageSize** | **Integer**| The number of the elements to fetch | [optional] [default to 50]
 **sortOrders** | [**List&lt;SortOrder&gt;**](SortOrder.md)| Sort criteria for the elements. | [optional]

### Return type

[**ResponseDTOPageResponseResourceGroupResponse**](ResponseDTOPageResponseResourceGroupResponse.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json, application/yaml
 - **Accept**: application/json, application/yaml

<a name="getResourceGroup"></a>
# **getResourceGroup**
> ResponseDTOResourceGroupResponse getResourceGroup(identifier, accountIdentifier, orgIdentifier, projectIdentifier)

Get a resource group by identifier

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.HarnessResourceGroupApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

HarnessResourceGroupApi apiInstance = new HarnessResourceGroupApi();
String identifier = "identifier_example"; // String | This is the Identifier of the Entity
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the Entity
String orgIdentifier = "orgIdentifier_example"; // String | Organization Identifier for the Entity
String projectIdentifier = "projectIdentifier_example"; // String | Project Identifier for the Entity
try {
    ResponseDTOResourceGroupResponse result = apiInstance.getResourceGroup(identifier, accountIdentifier, orgIdentifier, projectIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HarnessResourceGroupApi#getResourceGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **String**| This is the Identifier of the Entity |
 **accountIdentifier** | **String**| Account Identifier for the Entity |
 **orgIdentifier** | **String**| Organization Identifier for the Entity | [optional]
 **projectIdentifier** | **String**| Project Identifier for the Entity | [optional]

### Return type

[**ResponseDTOResourceGroupResponse**](ResponseDTOResourceGroupResponse.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/yaml

<a name="getResourceGroupList"></a>
# **getResourceGroupList**
> ResponseDTOPageResponseResourceGroupResponse getResourceGroupList(accountIdentifier, orgIdentifier, projectIdentifier, searchTerm, pageIndex, pageSize, sortOrders)

Get list of resource groups

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.HarnessResourceGroupApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

HarnessResourceGroupApi apiInstance = new HarnessResourceGroupApi();
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the Entity
String orgIdentifier = "orgIdentifier_example"; // String | Organization Identifier for the Entity
String projectIdentifier = "projectIdentifier_example"; // String | Project Identifier for the Entity
String searchTerm = "searchTerm_example"; // String | Details of all the resource groups having this string in their name or identifier will be returned.
Integer pageIndex = 0; // Integer | Indicates the number of pages. Results for these pages will be retrieved.
Integer pageSize = 50; // Integer | The number of the elements to fetch
List<SortOrder> sortOrders = Arrays.asList(new SortOrder()); // List<SortOrder> | Sort criteria for the elements.
try {
    ResponseDTOPageResponseResourceGroupResponse result = apiInstance.getResourceGroupList(accountIdentifier, orgIdentifier, projectIdentifier, searchTerm, pageIndex, pageSize, sortOrders);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HarnessResourceGroupApi#getResourceGroupList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountIdentifier** | **String**| Account Identifier for the Entity |
 **orgIdentifier** | **String**| Organization Identifier for the Entity | [optional]
 **projectIdentifier** | **String**| Project Identifier for the Entity | [optional]
 **searchTerm** | **String**| Details of all the resource groups having this string in their name or identifier will be returned. | [optional]
 **pageIndex** | **Integer**| Indicates the number of pages. Results for these pages will be retrieved. | [optional] [default to 0]
 **pageSize** | **Integer**| The number of the elements to fetch | [optional] [default to 50]
 **sortOrders** | [**List&lt;SortOrder&gt;**](SortOrder.md)| Sort criteria for the elements. | [optional]

### Return type

[**ResponseDTOPageResponseResourceGroupResponse**](ResponseDTOPageResponseResourceGroupResponse.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/yaml

<a name="updateResourceGroup"></a>
# **updateResourceGroup**
> ResponseDTOResourceGroupResponse updateResourceGroup(body, accountIdentifier, identifier, orgIdentifier, projectIdentifier)

Update a resource group

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.HarnessResourceGroupApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

HarnessResourceGroupApi apiInstance = new HarnessResourceGroupApi();
ResourceGroupRequest body = new ResourceGroupRequest(); // ResourceGroupRequest | This contains the details required to create a Resource Group
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the Entity
String identifier = "identifier_example"; // String | Identifier for the entity
String orgIdentifier = "orgIdentifier_example"; // String | Organization Identifier for the Entity
String projectIdentifier = "projectIdentifier_example"; // String | Project Identifier for the Entity
try {
    ResponseDTOResourceGroupResponse result = apiInstance.updateResourceGroup(body, accountIdentifier, identifier, orgIdentifier, projectIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HarnessResourceGroupApi#updateResourceGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ResourceGroupRequest**](ResourceGroupRequest.md)| This contains the details required to create a Resource Group |
 **accountIdentifier** | **String**| Account Identifier for the Entity |
 **identifier** | **String**| Identifier for the entity |
 **orgIdentifier** | **String**| Organization Identifier for the Entity | [optional]
 **projectIdentifier** | **String**| Project Identifier for the Entity | [optional]

### Return type

[**ResponseDTOResourceGroupResponse**](ResponseDTOResourceGroupResponse.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json, application/yaml
 - **Accept**: application/json, application/yaml

