# AclApi

All URIs are relative to *https://app.harness.io/gateway*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAccessControlList**](AclApi.md#getAccessControlList) | **POST** /authz/api/acl | Check for permission on resource(s) for a principal

<a name="getAccessControlList"></a>
# **getAccessControlList**
> ResponseDTOAccessCheckResponse getAccessControlList(body)

Check for permission on resource(s) for a principal

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AclApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

AclApi apiInstance = new AclApi();
AccessCheckRequest body = new AccessCheckRequest(); // AccessCheckRequest | These are the checks to perform for Access Control.
try {
    ResponseDTOAccessCheckResponse result = apiInstance.getAccessControlList(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AclApi#getAccessControlList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AccessCheckRequest**](AccessCheckRequest.md)| These are the checks to perform for Access Control. |

### Return type

[**ResponseDTOAccessCheckResponse**](ResponseDTOAccessCheckResponse.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json, application/yaml
 - **Accept**: application/json, application/yaml

