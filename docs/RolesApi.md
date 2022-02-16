# RolesApi

All URIs are relative to *https://app.harness.io/gateway*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteRole**](RolesApi.md#deleteRole) | **DELETE** /authz/api/roles/{identifier} | Delete a Custom Role in a scope
[**getRole**](RolesApi.md#getRole) | **GET** /authz/api/roles/{identifier} | Get a Role by identifier
[**getRoleList**](RolesApi.md#getRoleList) | **GET** /authz/api/roles | List roles in the given scope
[**postRole**](RolesApi.md#postRole) | **POST** /authz/api/roles | Create a Custom Role in a scope
[**putRole**](RolesApi.md#putRole) | **PUT** /authz/api/roles/{identifier} | Update a Custom Role by identifier

<a name="deleteRole"></a>
# **deleteRole**
> ResponseDTORoleResponse deleteRole(identifier, accountIdentifier, orgIdentifier, projectIdentifier)

Delete a Custom Role in a scope

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RolesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

RolesApi apiInstance = new RolesApi();
String identifier = "identifier_example"; // String | Identifier of the Role
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the Entity
String orgIdentifier = "orgIdentifier_example"; // String | Organization Identifier for the Entity
String projectIdentifier = "projectIdentifier_example"; // String | Project Identifier for the Entity
try {
    ResponseDTORoleResponse result = apiInstance.deleteRole(identifier, accountIdentifier, orgIdentifier, projectIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RolesApi#deleteRole");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **String**| Identifier of the Role |
 **accountIdentifier** | **String**| Account Identifier for the Entity | [optional]
 **orgIdentifier** | **String**| Organization Identifier for the Entity | [optional]
 **projectIdentifier** | **String**| Project Identifier for the Entity | [optional]

### Return type

[**ResponseDTORoleResponse**](ResponseDTORoleResponse.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/yaml

<a name="getRole"></a>
# **getRole**
> ResponseDTORoleResponse getRole(identifier, accountIdentifier, orgIdentifier, projectIdentifier)

Get a Role by identifier

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RolesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

RolesApi apiInstance = new RolesApi();
String identifier = "identifier_example"; // String | Identifier of the Role
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the Entity
String orgIdentifier = "orgIdentifier_example"; // String | Organization Identifier for the Entity
String projectIdentifier = "projectIdentifier_example"; // String | Project Identifier for the Entity
try {
    ResponseDTORoleResponse result = apiInstance.getRole(identifier, accountIdentifier, orgIdentifier, projectIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RolesApi#getRole");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **String**| Identifier of the Role |
 **accountIdentifier** | **String**| Account Identifier for the Entity | [optional]
 **orgIdentifier** | **String**| Organization Identifier for the Entity | [optional]
 **projectIdentifier** | **String**| Project Identifier for the Entity | [optional]

### Return type

[**ResponseDTORoleResponse**](ResponseDTORoleResponse.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/yaml

<a name="getRoleList"></a>
# **getRoleList**
> ResponseDTOPageResponseRoleResponse getRoleList(pageIndex, pageSize, sortOrders, accountIdentifier, orgIdentifier, projectIdentifier, searchTerm)

List roles in the given scope

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RolesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

RolesApi apiInstance = new RolesApi();
Integer pageIndex = 0; // Integer | Indicates the number of pages. Results for these pages will be retrieved.
Integer pageSize = 50; // Integer | The number of the elements to fetch
List<SortOrder> sortOrders = Arrays.asList(new SortOrder()); // List<SortOrder> | Sort criteria for the elements.
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the Entity
String orgIdentifier = "orgIdentifier_example"; // String | Organization Identifier for the Entity
String projectIdentifier = "projectIdentifier_example"; // String | Project Identifier for the Entity
String searchTerm = "searchTerm_example"; // String | Search roles by name/identifier
try {
    ResponseDTOPageResponseRoleResponse result = apiInstance.getRoleList(pageIndex, pageSize, sortOrders, accountIdentifier, orgIdentifier, projectIdentifier, searchTerm);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RolesApi#getRoleList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pageIndex** | **Integer**| Indicates the number of pages. Results for these pages will be retrieved. | [optional] [default to 0]
 **pageSize** | **Integer**| The number of the elements to fetch | [optional] [default to 50]
 **sortOrders** | [**List&lt;SortOrder&gt;**](SortOrder.md)| Sort criteria for the elements. | [optional]
 **accountIdentifier** | **String**| Account Identifier for the Entity | [optional]
 **orgIdentifier** | **String**| Organization Identifier for the Entity | [optional]
 **projectIdentifier** | **String**| Project Identifier for the Entity | [optional]
 **searchTerm** | **String**| Search roles by name/identifier | [optional]

### Return type

[**ResponseDTOPageResponseRoleResponse**](ResponseDTOPageResponseRoleResponse.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/yaml

<a name="postRole"></a>
# **postRole**
> ResponseDTORoleResponse postRole(body, accountIdentifier, orgIdentifier, projectIdentifier)

Create a Custom Role in a scope

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RolesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

RolesApi apiInstance = new RolesApi();
Role body = new Role(); // Role | Role entity
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the Entity
String orgIdentifier = "orgIdentifier_example"; // String | Organization Identifier for the Entity
String projectIdentifier = "projectIdentifier_example"; // String | Project Identifier for the Entity
try {
    ResponseDTORoleResponse result = apiInstance.postRole(body, accountIdentifier, orgIdentifier, projectIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RolesApi#postRole");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Role**](Role.md)| Role entity |
 **accountIdentifier** | **String**| Account Identifier for the Entity | [optional]
 **orgIdentifier** | **String**| Organization Identifier for the Entity | [optional]
 **projectIdentifier** | **String**| Project Identifier for the Entity | [optional]

### Return type

[**ResponseDTORoleResponse**](ResponseDTORoleResponse.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json, application/yaml
 - **Accept**: application/json, application/yaml

<a name="putRole"></a>
# **putRole**
> ResponseDTORoleResponse putRole(body, identifier, accountIdentifier, orgIdentifier, projectIdentifier)

Update a Custom Role by identifier

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RolesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

RolesApi apiInstance = new RolesApi();
Role body = new Role(); // Role | Updated Role entity
String identifier = "identifier_example"; // String | Identifier of the Role
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the Entity
String orgIdentifier = "orgIdentifier_example"; // String | Organization Identifier for the Entity
String projectIdentifier = "projectIdentifier_example"; // String | Project Identifier for the Entity
try {
    ResponseDTORoleResponse result = apiInstance.putRole(body, identifier, accountIdentifier, orgIdentifier, projectIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RolesApi#putRole");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Role**](Role.md)| Updated Role entity |
 **identifier** | **String**| Identifier of the Role |
 **accountIdentifier** | **String**| Account Identifier for the Entity | [optional]
 **orgIdentifier** | **String**| Organization Identifier for the Entity | [optional]
 **projectIdentifier** | **String**| Project Identifier for the Entity | [optional]

### Return type

[**ResponseDTORoleResponse**](ResponseDTORoleResponse.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json, application/yaml
 - **Accept**: application/json, application/yaml

