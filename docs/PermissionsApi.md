# PermissionsApi

All URIs are relative to *https://app.harness.io/gateway*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getPermissionList**](PermissionsApi.md#getPermissionList) | **GET** /authz/api/permissions | Get all permissions in a scope or all permissions in the system.
[**getPermissionResourceTypesList**](PermissionsApi.md#getPermissionResourceTypesList) | **GET** /authz/api/permissions/resourcetypes | Get all resource types for permissions in a scope or in the system.

<a name="getPermissionList"></a>
# **getPermissionList**
> ResponseDTOListPermissionResponse getPermissionList(accountIdentifier, orgIdentifier, projectIdentifier, scopeFilterDisabled)

Get all permissions in a scope or all permissions in the system.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PermissionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

PermissionsApi apiInstance = new PermissionsApi();
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the Entity
String orgIdentifier = "orgIdentifier_example"; // String | Organization Identifier for the Entity
String projectIdentifier = "projectIdentifier_example"; // String | Project Identifier for the Entity
Boolean scopeFilterDisabled = true; // Boolean | This is to enable or disable filtering by scope. The default value is false. If the value is true, all the permissions in the system are fetched.
try {
    ResponseDTOListPermissionResponse result = apiInstance.getPermissionList(accountIdentifier, orgIdentifier, projectIdentifier, scopeFilterDisabled);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PermissionsApi#getPermissionList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountIdentifier** | **String**| Account Identifier for the Entity | [optional]
 **orgIdentifier** | **String**| Organization Identifier for the Entity | [optional]
 **projectIdentifier** | **String**| Project Identifier for the Entity | [optional]
 **scopeFilterDisabled** | **Boolean**| This is to enable or disable filtering by scope. The default value is false. If the value is true, all the permissions in the system are fetched. | [optional]

### Return type

[**ResponseDTOListPermissionResponse**](ResponseDTOListPermissionResponse.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/yaml

<a name="getPermissionResourceTypesList"></a>
# **getPermissionResourceTypesList**
> ResponseDTOSetString getPermissionResourceTypesList(accountIdentifier, orgIdentifier, projectIdentifier, scopeFilterDisabled)

Get all resource types for permissions in a scope or in the system.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PermissionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

PermissionsApi apiInstance = new PermissionsApi();
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the Entity
String orgIdentifier = "orgIdentifier_example"; // String | Organization Identifier for the Entity
String projectIdentifier = "projectIdentifier_example"; // String | Project Identifier for the Entity
Boolean scopeFilterDisabled = true; // Boolean | This is to enable or disable filtering by scope. The default value is false. If the value is true, all the permissions in the system are fetched.
try {
    ResponseDTOSetString result = apiInstance.getPermissionResourceTypesList(accountIdentifier, orgIdentifier, projectIdentifier, scopeFilterDisabled);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PermissionsApi#getPermissionResourceTypesList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountIdentifier** | **String**| Account Identifier for the Entity | [optional]
 **orgIdentifier** | **String**| Organization Identifier for the Entity | [optional]
 **projectIdentifier** | **String**| Project Identifier for the Entity | [optional]
 **scopeFilterDisabled** | **Boolean**| This is to enable or disable filtering by scope. The default value is false. If the value is true, all the permissions in the system are fetched. | [optional]

### Return type

[**ResponseDTOSetString**](ResponseDTOSetString.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/yaml

