# TriggersApi

All URIs are relative to *https://app.harness.io/gateway*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createTrigger**](TriggersApi.md#createTrigger) | **POST** /pipeline/api/triggers | Creates Trigger for triggering target pipeline identifier.
[**deleteTrigger**](TriggersApi.md#deleteTrigger) | **DELETE** /pipeline/api/triggers/{triggerIdentifier} | Deletes Trigger by identifier.
[**generateWebhookToken**](TriggersApi.md#generateWebhookToken) | **GET** /pipeline/api/triggers/regenerateToken | Generates random webhook token for new triggers.
[**getListForTarget**](TriggersApi.md#getListForTarget) | **GET** /pipeline/api/triggers | Gets the paginated list of triggers for accountIdentifier, orgIdentifier, projectIdentifier, targetIdentifier.
[**getTrigger**](TriggersApi.md#getTrigger) | **GET** /pipeline/api/triggers/{triggerIdentifier} | Gets the trigger by accountIdentifier, orgIdentifier, projectIdentifier, targetIdentifier and triggerIdentifier.
[**getTriggerDetails**](TriggersApi.md#getTriggerDetails) | **GET** /pipeline/api/triggers/{triggerIdentifier}/details | Gets the list of triggers for accountIdentifier, orgIdentifier, projectIdentifier, targetIdentifier.
[**updateTrigger**](TriggersApi.md#updateTrigger) | **PUT** /pipeline/api/triggers/{triggerIdentifier} | Updates trigger for pipeline with target pipeline identifier.
[**updateTriggerStatus**](TriggersApi.md#updateTriggerStatus) | **PUT** /pipeline/api/triggers/{triggerIdentifier}/status | Activates or deactivate trigger for pipeline with target pipeline identifier.

<a name="createTrigger"></a>
# **createTrigger**
> ResponseDTONGTriggerResponse createTrigger(body, accountIdentifier, orgIdentifier, projectIdentifier, targetIdentifier)

Creates Trigger for triggering target pipeline identifier.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TriggersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

TriggersApi apiInstance = new TriggersApi();
String body = "body_example"; // String | 
String accountIdentifier = "accountIdentifier_example"; // String | 
String orgIdentifier = "orgIdentifier_example"; // String | 
String projectIdentifier = "projectIdentifier_example"; // String | 
String targetIdentifier = "targetIdentifier_example"; // String | Identifier of the target pipeline
try {
    ResponseDTONGTriggerResponse result = apiInstance.createTrigger(body, accountIdentifier, orgIdentifier, projectIdentifier, targetIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TriggersApi#createTrigger");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**String**](String.md)|  |
 **accountIdentifier** | **String**|  |
 **orgIdentifier** | **String**|  |
 **projectIdentifier** | **String**|  |
 **targetIdentifier** | **String**| Identifier of the target pipeline |

### Return type

[**ResponseDTONGTriggerResponse**](ResponseDTONGTriggerResponse.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json, application/yaml
 - **Accept**: application/json, application/yaml

<a name="deleteTrigger"></a>
# **deleteTrigger**
> ResponseDTOBoolean deleteTrigger(accountIdentifier, orgIdentifier, projectIdentifier, targetIdentifier, triggerIdentifier, ifMatch)

Deletes Trigger by identifier.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TriggersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

TriggersApi apiInstance = new TriggersApi();
String accountIdentifier = "accountIdentifier_example"; // String | 
String orgIdentifier = "orgIdentifier_example"; // String | 
String projectIdentifier = "projectIdentifier_example"; // String | 
String targetIdentifier = "targetIdentifier_example"; // String | Identifier of the target pipeline under which trigger resides.
String triggerIdentifier = "triggerIdentifier_example"; // String | 
String ifMatch = "ifMatch_example"; // String | 
try {
    ResponseDTOBoolean result = apiInstance.deleteTrigger(accountIdentifier, orgIdentifier, projectIdentifier, targetIdentifier, triggerIdentifier, ifMatch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TriggersApi#deleteTrigger");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountIdentifier** | **String**|  |
 **orgIdentifier** | **String**|  |
 **projectIdentifier** | **String**|  |
 **targetIdentifier** | **String**| Identifier of the target pipeline under which trigger resides. |
 **triggerIdentifier** | **String**|  |
 **ifMatch** | **String**|  | [optional]

### Return type

[**ResponseDTOBoolean**](ResponseDTOBoolean.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/yaml

<a name="generateWebhookToken"></a>
# **generateWebhookToken**
> RestResponseString generateWebhookToken()

Generates random webhook token for new triggers.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TriggersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

TriggersApi apiInstance = new TriggersApi();
try {
    RestResponseString result = apiInstance.generateWebhookToken();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TriggersApi#generateWebhookToken");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**RestResponseString**](RestResponseString.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/yaml

<a name="getListForTarget"></a>
# **getListForTarget**
> ResponseDTOPageResponseNGTriggerDetailsResponseDTO getListForTarget(accountIdentifier, orgIdentifier, projectIdentifier, targetIdentifier, filter, page, size, sort, searchTerm)

Gets the paginated list of triggers for accountIdentifier, orgIdentifier, projectIdentifier, targetIdentifier.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TriggersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

TriggersApi apiInstance = new TriggersApi();
String accountIdentifier = "accountIdentifier_example"; // String | 
String orgIdentifier = "orgIdentifier_example"; // String | 
String projectIdentifier = "projectIdentifier_example"; // String | 
String targetIdentifier = "targetIdentifier_example"; // String | Identifier of the target pipeline
String filter = "filter_example"; // String | 
Integer page = 0; // Integer | 
Integer size = 25; // Integer | 
List<String> sort = Arrays.asList("sort_example"); // List<String> | 
String searchTerm = "searchTerm_example"; // String | 
try {
    ResponseDTOPageResponseNGTriggerDetailsResponseDTO result = apiInstance.getListForTarget(accountIdentifier, orgIdentifier, projectIdentifier, targetIdentifier, filter, page, size, sort, searchTerm);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TriggersApi#getListForTarget");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountIdentifier** | **String**|  |
 **orgIdentifier** | **String**|  |
 **projectIdentifier** | **String**|  |
 **targetIdentifier** | **String**| Identifier of the target pipeline |
 **filter** | **String**|  | [optional]
 **page** | **Integer**|  | [optional] [default to 0]
 **size** | **Integer**|  | [optional] [default to 25]
 **sort** | [**List&lt;String&gt;**](String.md)|  | [optional]
 **searchTerm** | **String**|  | [optional]

### Return type

[**ResponseDTOPageResponseNGTriggerDetailsResponseDTO**](ResponseDTOPageResponseNGTriggerDetailsResponseDTO.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/yaml

<a name="getTrigger"></a>
# **getTrigger**
> ResponseDTONGTriggerResponse getTrigger(accountIdentifier, orgIdentifier, projectIdentifier, targetIdentifier, triggerIdentifier)

Gets the trigger by accountIdentifier, orgIdentifier, projectIdentifier, targetIdentifier and triggerIdentifier.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TriggersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

TriggersApi apiInstance = new TriggersApi();
String accountIdentifier = "accountIdentifier_example"; // String | 
String orgIdentifier = "orgIdentifier_example"; // String | 
String projectIdentifier = "projectIdentifier_example"; // String | 
String targetIdentifier = "targetIdentifier_example"; // String | Identifier of the target pipeline under which trigger resides
String triggerIdentifier = "triggerIdentifier_example"; // String | 
try {
    ResponseDTONGTriggerResponse result = apiInstance.getTrigger(accountIdentifier, orgIdentifier, projectIdentifier, targetIdentifier, triggerIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TriggersApi#getTrigger");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountIdentifier** | **String**|  |
 **orgIdentifier** | **String**|  |
 **projectIdentifier** | **String**|  |
 **targetIdentifier** | **String**| Identifier of the target pipeline under which trigger resides |
 **triggerIdentifier** | **String**|  |

### Return type

[**ResponseDTONGTriggerResponse**](ResponseDTONGTriggerResponse.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/yaml

<a name="getTriggerDetails"></a>
# **getTriggerDetails**
> ResponseDTONGTriggerDetailsResponseDTO getTriggerDetails(accountIdentifier, orgIdentifier, projectIdentifier, triggerIdentifier, targetIdentifier)

Gets the list of triggers for accountIdentifier, orgIdentifier, projectIdentifier, targetIdentifier.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TriggersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

TriggersApi apiInstance = new TriggersApi();
String accountIdentifier = "accountIdentifier_example"; // String | 
String orgIdentifier = "orgIdentifier_example"; // String | 
String projectIdentifier = "projectIdentifier_example"; // String | 
String triggerIdentifier = "triggerIdentifier_example"; // String | Identifier of the target pipeline
String targetIdentifier = "targetIdentifier_example"; // String | 
try {
    ResponseDTONGTriggerDetailsResponseDTO result = apiInstance.getTriggerDetails(accountIdentifier, orgIdentifier, projectIdentifier, triggerIdentifier, targetIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TriggersApi#getTriggerDetails");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountIdentifier** | **String**|  |
 **orgIdentifier** | **String**|  |
 **projectIdentifier** | **String**|  |
 **triggerIdentifier** | **String**| Identifier of the target pipeline |
 **targetIdentifier** | **String**|  |

### Return type

[**ResponseDTONGTriggerDetailsResponseDTO**](ResponseDTONGTriggerDetailsResponseDTO.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/yaml

<a name="updateTrigger"></a>
# **updateTrigger**
> ResponseDTONGTriggerResponse updateTrigger(body, accountIdentifier, orgIdentifier, projectIdentifier, targetIdentifier, triggerIdentifier, ifMatch)

Updates trigger for pipeline with target pipeline identifier.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TriggersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

TriggersApi apiInstance = new TriggersApi();
String body = "body_example"; // String | 
String accountIdentifier = "accountIdentifier_example"; // String | 
String orgIdentifier = "orgIdentifier_example"; // String | 
String projectIdentifier = "projectIdentifier_example"; // String | 
String targetIdentifier = "targetIdentifier_example"; // String | Identifier of the target pipeline under which trigger resides
String triggerIdentifier = "triggerIdentifier_example"; // String | 
String ifMatch = "ifMatch_example"; // String | 
try {
    ResponseDTONGTriggerResponse result = apiInstance.updateTrigger(body, accountIdentifier, orgIdentifier, projectIdentifier, targetIdentifier, triggerIdentifier, ifMatch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TriggersApi#updateTrigger");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**String**](String.md)|  |
 **accountIdentifier** | **String**|  |
 **orgIdentifier** | **String**|  |
 **projectIdentifier** | **String**|  |
 **targetIdentifier** | **String**| Identifier of the target pipeline under which trigger resides |
 **triggerIdentifier** | **String**|  |
 **ifMatch** | **String**|  | [optional]

### Return type

[**ResponseDTONGTriggerResponse**](ResponseDTONGTriggerResponse.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json, application/yaml
 - **Accept**: application/json, application/yaml

<a name="updateTriggerStatus"></a>
# **updateTriggerStatus**
> ResponseDTOBoolean updateTriggerStatus(accountIdentifier, orgIdentifier, projectIdentifier, targetIdentifier, triggerIdentifier, status)

Activates or deactivate trigger for pipeline with target pipeline identifier.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TriggersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

TriggersApi apiInstance = new TriggersApi();
String accountIdentifier = "accountIdentifier_example"; // String | 
String orgIdentifier = "orgIdentifier_example"; // String | 
String projectIdentifier = "projectIdentifier_example"; // String | 
String targetIdentifier = "targetIdentifier_example"; // String | Identifier of the target pipeline under which trigger resides
String triggerIdentifier = "triggerIdentifier_example"; // String | 
Boolean status = true; // Boolean | 
try {
    ResponseDTOBoolean result = apiInstance.updateTriggerStatus(accountIdentifier, orgIdentifier, projectIdentifier, targetIdentifier, triggerIdentifier, status);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TriggersApi#updateTriggerStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountIdentifier** | **String**|  |
 **orgIdentifier** | **String**|  |
 **projectIdentifier** | **String**|  |
 **targetIdentifier** | **String**| Identifier of the target pipeline under which trigger resides |
 **triggerIdentifier** | **String**|  |
 **status** | **Boolean**|  |

### Return type

[**ResponseDTOBoolean**](ResponseDTOBoolean.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/yaml

