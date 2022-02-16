# WebhookEventHandlerApi

All URIs are relative to *https://app.harness.io/gateway*

Method | HTTP request | Description
------------- | ------------- | -------------
[**processWebhookEvent**](WebhookEventHandlerApi.md#processWebhookEvent) | **POST** /ng/api/webhook | Process event payload for webhook triggers.

<a name="processWebhookEvent"></a>
# **processWebhookEvent**
> ResponseDTOString processWebhookEvent(body, accountIdentifier)

Process event payload for webhook triggers.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.WebhookEventHandlerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

WebhookEventHandlerApi apiInstance = new WebhookEventHandlerApi();
String body = "body_example"; // String | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    ResponseDTOString result = apiInstance.processWebhookEvent(body, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebhookEventHandlerApi#processWebhookEvent");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**String**](String.md)|  |
 **accountIdentifier** | **String**|  |

### Return type

[**ResponseDTOString**](ResponseDTOString.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json, application/yaml, text/plain
 - **Accept**: application/json, application/yaml, text/plain

