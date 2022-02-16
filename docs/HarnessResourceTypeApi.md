# HarnessResourceTypeApi

All URIs are relative to *https://app.harness.io/gateway*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getResourceTypes**](HarnessResourceTypeApi.md#getResourceTypes) | **GET** /resourcegroup/api/resourcetype | Gets all resource types available at this scope

<a name="getResourceTypes"></a>
# **getResourceTypes**
> ResponseDTOResourceType getResourceTypes(accountIdentifier, orgIdentifier, projectIdentifier)

Gets all resource types available at this scope

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.HarnessResourceTypeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

HarnessResourceTypeApi apiInstance = new HarnessResourceTypeApi();
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the Entity
String orgIdentifier = "orgIdentifier_example"; // String | Organization Identifier for the Entity
String projectIdentifier = "projectIdentifier_example"; // String | Project Identifier for the Entity
try {
    ResponseDTOResourceType result = apiInstance.getResourceTypes(accountIdentifier, orgIdentifier, projectIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HarnessResourceTypeApi#getResourceTypes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountIdentifier** | **String**| Account Identifier for the Entity |
 **orgIdentifier** | **String**| Organization Identifier for the Entity | [optional]
 **projectIdentifier** | **String**| Project Identifier for the Entity | [optional]

### Return type

[**ResponseDTOResourceType**](ResponseDTOResourceType.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/yaml

