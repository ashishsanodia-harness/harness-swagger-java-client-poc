# SmtpConfigApi

All URIs are relative to *https://app.harness.io/gateway*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createSmtpConfig**](SmtpConfigApi.md#createSmtpConfig) | **POST** /ng/api/smtpConfig | Creates SMTP config
[**deleteSmtpConfig**](SmtpConfigApi.md#deleteSmtpConfig) | **DELETE** /ng/api/smtpConfig/{identifier} | Delete Smtp Config by identifier
[**getSmtpConfig**](SmtpConfigApi.md#getSmtpConfig) | **GET** /ng/api/smtpConfig | Gets Smtp config by accountId
[**updateSmtp**](SmtpConfigApi.md#updateSmtp) | **PUT** /ng/api/smtpConfig | Updates the Smtp Config
[**validateConnectivity**](SmtpConfigApi.md#validateConnectivity) | **POST** /ng/api/smtpConfig/validate-connectivity | Tests the config&#x27;s connectivity by sending a test email
[**validateName**](SmtpConfigApi.md#validateName) | **POST** /ng/api/smtpConfig/validateName | Checks whether other connectors exist with the same name

<a name="createSmtpConfig"></a>
# **createSmtpConfig**
> ResponseDTONgSmtp createSmtpConfig(body)

Creates SMTP config

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SmtpConfigApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

SmtpConfigApi apiInstance = new SmtpConfigApi();
NgSmtp body = new NgSmtp(); // NgSmtp | 
try {
    ResponseDTONgSmtp result = apiInstance.createSmtpConfig(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SmtpConfigApi#createSmtpConfig");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**NgSmtp**](NgSmtp.md)|  |

### Return type

[**ResponseDTONgSmtp**](ResponseDTONgSmtp.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/yaml

<a name="deleteSmtpConfig"></a>
# **deleteSmtpConfig**
> ResponseDTOBoolean deleteSmtpConfig(identifier)

Delete Smtp Config by identifier

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SmtpConfigApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

SmtpConfigApi apiInstance = new SmtpConfigApi();
String identifier = "identifier_example"; // String | Config identifier
try {
    ResponseDTOBoolean result = apiInstance.deleteSmtpConfig(identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SmtpConfigApi#deleteSmtpConfig");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **String**| Config identifier |

### Return type

[**ResponseDTOBoolean**](ResponseDTOBoolean.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/yaml

<a name="getSmtpConfig"></a>
# **getSmtpConfig**
> ResponseDTONgSmtp getSmtpConfig(accountId)

Gets Smtp config by accountId

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SmtpConfigApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

SmtpConfigApi apiInstance = new SmtpConfigApi();
String accountId = "accountId_example"; // String | Account Identifier for the Entity
try {
    ResponseDTONgSmtp result = apiInstance.getSmtpConfig(accountId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SmtpConfigApi#getSmtpConfig");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **String**| Account Identifier for the Entity | [optional]

### Return type

[**ResponseDTONgSmtp**](ResponseDTONgSmtp.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/yaml

<a name="updateSmtp"></a>
# **updateSmtp**
> ResponseDTONgSmtp updateSmtp(body)

Updates the Smtp Config

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SmtpConfigApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

SmtpConfigApi apiInstance = new SmtpConfigApi();
NgSmtp body = new NgSmtp(); // NgSmtp | 
try {
    ResponseDTONgSmtp result = apiInstance.updateSmtp(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SmtpConfigApi#updateSmtp");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**NgSmtp**](NgSmtp.md)|  |

### Return type

[**ResponseDTONgSmtp**](ResponseDTONgSmtp.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/yaml

<a name="validateConnectivity"></a>
# **validateConnectivity**
> ResponseDTOValidationResult validateConnectivity(identifier, accountId, to, subject, body)

Tests the config&#x27;s connectivity by sending a test email

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SmtpConfigApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

SmtpConfigApi apiInstance = new SmtpConfigApi();
String identifier = "identifier_example"; // String | Attribute uuid
String accountId = "accountId_example"; // String | Account Identifier for the Entity
String to = "to_example"; // String | 
String subject = "subject_example"; // String | 
String body = "body_example"; // String | 
try {
    ResponseDTOValidationResult result = apiInstance.validateConnectivity(identifier, accountId, to, subject, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SmtpConfigApi#validateConnectivity");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **String**| Attribute uuid |
 **accountId** | **String**| Account Identifier for the Entity |
 **to** | **String**|  |
 **subject** | **String**|  |
 **body** | **String**|  |

### Return type

[**ResponseDTOValidationResult**](ResponseDTOValidationResult.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/yaml

<a name="validateName"></a>
# **validateName**
> ResponseDTOValidationResult validateName(accountId, name)

Checks whether other connectors exist with the same name

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SmtpConfigApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

SmtpConfigApi apiInstance = new SmtpConfigApi();
String accountId = "accountId_example"; // String | Account Identifier for the Entity
String name = "name_example"; // String | The name of Config
try {
    ResponseDTOValidationResult result = apiInstance.validateName(accountId, name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SmtpConfigApi#validateName");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **String**| Account Identifier for the Entity |
 **name** | **String**| The name of Config | [optional]

### Return type

[**ResponseDTOValidationResult**](ResponseDTOValidationResult.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/yaml

