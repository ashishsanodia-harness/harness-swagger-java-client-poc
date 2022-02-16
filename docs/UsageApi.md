# UsageApi

All URIs are relative to *https://app.harness.io/gateway*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ccmgetLicenseUsage**](UsageApi.md#ccmgetLicenseUsage) | **GET** /ccm/api/usage/{module} | Gets License Usage By Module, Timestamp, and Account Identifier
[**getLicenseUsage**](UsageApi.md#getLicenseUsage) | **GET** /ng/api/usage/{module} | Gets License Usage By Module, Timestamp, and Account Identifier

<a name="ccmgetLicenseUsage"></a>
# **ccmgetLicenseUsage**
> ResponseDTOLicenseUsage ccmgetLicenseUsage(module, accountIdentifier, timestamp, cdLicenseType)

Gets License Usage By Module, Timestamp, and Account Identifier

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UsageApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

UsageApi apiInstance = new UsageApi();
String module = "module_example"; // String | A Harness platform module.
String accountIdentifier = "accountIdentifier_example"; // String | Account id to get the license usage.
Long timestamp = 789L; // Long | 
String cdLicenseType = "cdLicenseType_example"; // String | 
try {
    ResponseDTOLicenseUsage result = apiInstance.ccmgetLicenseUsage(module, accountIdentifier, timestamp, cdLicenseType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsageApi#ccmgetLicenseUsage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **module** | **String**| A Harness platform module. |
 **accountIdentifier** | **String**| Account id to get the license usage. | [optional]
 **timestamp** | **Long**|  | [optional]
 **cdLicenseType** | **String**|  | [optional]

### Return type

[**ResponseDTOLicenseUsage**](ResponseDTOLicenseUsage.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/yaml

<a name="getLicenseUsage"></a>
# **getLicenseUsage**
> ResponseDTOLicenseUsage getLicenseUsage(module, accountIdentifier, timestamp, cdLicenseType)

Gets License Usage By Module, Timestamp, and Account Identifier

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UsageApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

UsageApi apiInstance = new UsageApi();
String module = "module_example"; // String | A Harness platform module.
String accountIdentifier = "accountIdentifier_example"; // String | Account id to get the license usage.
Long timestamp = 789L; // Long | 
String cdLicenseType = "cdLicenseType_example"; // String | 
try {
    ResponseDTOLicenseUsage result = apiInstance.getLicenseUsage(module, accountIdentifier, timestamp, cdLicenseType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsageApi#getLicenseUsage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **module** | **String**| A Harness platform module. |
 **accountIdentifier** | **String**| Account id to get the license usage. | [optional]
 **timestamp** | **Long**|  | [optional]
 **cdLicenseType** | **String**|  | [optional]

### Return type

[**ResponseDTOLicenseUsage**](ResponseDTOLicenseUsage.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/yaml

