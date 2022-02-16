# SecretManagersApi

All URIs are relative to *https://app.harness.io/gateway*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getMetadata**](SecretManagersApi.md#getMetadata) | **POST** /ng/api/secret-managers/meta-data | Gets the metadata of Secret Manager

<a name="getMetadata"></a>
# **getMetadata**
> ResponseDTOSecretManagerMetadataDTO getMetadata(body, accountIdentifier)

Gets the metadata of Secret Manager

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SecretManagersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

SecretManagersApi apiInstance = new SecretManagersApi();
Invite body = new Invite(); // Invite | Details required for the creation of the Secret Manager
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the Entity
try {
    ResponseDTOSecretManagerMetadataDTO result = apiInstance.getMetadata(body, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SecretManagersApi#getMetadata");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Invite**](Invite.md)| Details required for the creation of the Secret Manager |
 **accountIdentifier** | **String**| Account Identifier for the Entity |

### Return type

[**ResponseDTOSecretManagerMetadataDTO**](ResponseDTOSecretManagerMetadataDTO.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json, application/yaml
 - **Accept**: application/json, application/yaml

