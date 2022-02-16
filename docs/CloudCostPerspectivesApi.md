# CloudCostPerspectivesApi

All URIs are relative to *https://app.harness.io/gateway*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createPerspective**](CloudCostPerspectivesApi.md#createPerspective) | **POST** /ccm/api/perspective | Create a Perspective
[**deletePerspective**](CloudCostPerspectivesApi.md#deletePerspective) | **DELETE** /ccm/api/perspective | Delete a Perspective
[**getForecastCostForPeriod**](CloudCostPerspectivesApi.md#getForecastCostForPeriod) | **GET** /ccm/api/perspective/forecastCostForPeriod | Get the forecasted cost of a Perspective for given period
[**getForecastCostV2**](CloudCostPerspectivesApi.md#getForecastCostV2) | **GET** /ccm/api/perspective/forecastCost | Fetch forecasted cost details of a Perspective
[**getLastMonthCostV2**](CloudCostPerspectivesApi.md#getLastMonthCostV2) | **GET** /ccm/api/perspective/lastMonthCost | Fetch cost details of a Perspective for the previous month
[**getLastPeriodCost**](CloudCostPerspectivesApi.md#getLastPeriodCost) | **GET** /ccm/api/perspective/lastPeriodCost | Get the last period cost for a Perspective
[**getPerspective**](CloudCostPerspectivesApi.md#getPerspective) | **GET** /ccm/api/perspective | Fetch details of a Perspective
[**updatePerspective**](CloudCostPerspectivesApi.md#updatePerspective) | **PUT** /ccm/api/perspective | Update a Perspective

<a name="createPerspective"></a>
# **createPerspective**
> ResponseDTOCEView createPerspective(body, accountIdentifier, clone)

Create a Perspective

Create a Perspective. You can set the clone parameter as true to clone a Perspective.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CloudCostPerspectivesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

CloudCostPerspectivesApi apiInstance = new CloudCostPerspectivesApi();
CEView body = new CEView(); // CEView | Request body containing Perspective's CEView object
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the Entity
Boolean clone = true; // Boolean | Set the clone parameter as true to clone a Perspective.
try {
    ResponseDTOCEView result = apiInstance.createPerspective(body, accountIdentifier, clone);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CloudCostPerspectivesApi#createPerspective");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CEView**](CEView.md)| Request body containing Perspective&#x27;s CEView object |
 **accountIdentifier** | **String**| Account Identifier for the Entity |
 **clone** | **Boolean**| Set the clone parameter as true to clone a Perspective. |

### Return type

[**ResponseDTOCEView**](ResponseDTOCEView.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deletePerspective"></a>
# **deletePerspective**
> ResponseDTOString deletePerspective(accountIdentifier, perspectiveId)

Delete a Perspective

Delete a Perspective for the given Perspective ID.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CloudCostPerspectivesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

CloudCostPerspectivesApi apiInstance = new CloudCostPerspectivesApi();
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the Entity
String perspectiveId = "perspectiveId_example"; // String | Unique identifier for the Perspective
try {
    ResponseDTOString result = apiInstance.deletePerspective(accountIdentifier, perspectiveId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CloudCostPerspectivesApi#deletePerspective");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountIdentifier** | **String**| Account Identifier for the Entity |
 **perspectiveId** | **String**| Unique identifier for the Perspective |

### Return type

[**ResponseDTOString**](ResponseDTOString.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getForecastCostForPeriod"></a>
# **getForecastCostForPeriod**
> ResponseDTODouble getForecastCostForPeriod(accountIdentifier, perspectiveId, startTime, period)

Get the forecasted cost of a Perspective for given period

Get the forecasted cost of a Perspective for next period

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CloudCostPerspectivesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

CloudCostPerspectivesApi apiInstance = new CloudCostPerspectivesApi();
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the Entity
String perspectiveId = "perspectiveId_example"; // String | The Perspective identifier for which we want the forecast cost
Long startTime = 789L; // Long | The Start time (timestamp in millis) for the period
String period = "period_example"; // String | The period (DAILY, WEEKLY, MONTHLY, QUARTERLY, YEARLY) for which we want the forecast cost
try {
    ResponseDTODouble result = apiInstance.getForecastCostForPeriod(accountIdentifier, perspectiveId, startTime, period);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CloudCostPerspectivesApi#getForecastCostForPeriod");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountIdentifier** | **String**| Account Identifier for the Entity |
 **perspectiveId** | **String**| The Perspective identifier for which we want the forecast cost |
 **startTime** | **Long**| The Start time (timestamp in millis) for the period |
 **period** | **String**| The period (DAILY, WEEKLY, MONTHLY, QUARTERLY, YEARLY) for which we want the forecast cost | [enum: DAILY, WEEKLY, MONTHLY, QUARTERLY, YEARLY]

### Return type

[**ResponseDTODouble**](ResponseDTODouble.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getForecastCostV2"></a>
# **getForecastCostV2**
> ResponseDTODouble getForecastCostV2(accountIdentifier, perspectiveId)

Fetch forecasted cost details of a Perspective

Fetch forecasted cost details of a Perspective for the next 30 days for the given Perspective ID.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CloudCostPerspectivesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

CloudCostPerspectivesApi apiInstance = new CloudCostPerspectivesApi();
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the Entity
String perspectiveId = "perspectiveId_example"; // String | Unique identifier for the Perspective
try {
    ResponseDTODouble result = apiInstance.getForecastCostV2(accountIdentifier, perspectiveId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CloudCostPerspectivesApi#getForecastCostV2");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountIdentifier** | **String**| Account Identifier for the Entity |
 **perspectiveId** | **String**| Unique identifier for the Perspective |

### Return type

[**ResponseDTODouble**](ResponseDTODouble.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getLastMonthCostV2"></a>
# **getLastMonthCostV2**
> ResponseDTODouble getLastMonthCostV2(accountIdentifier, perspectiveId)

Fetch cost details of a Perspective for the previous month

Fetch cost details of a Perspective for the previous month for the given  Perspective ID.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CloudCostPerspectivesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

CloudCostPerspectivesApi apiInstance = new CloudCostPerspectivesApi();
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the Entity
String perspectiveId = "perspectiveId_example"; // String | Unique identifier for the Perspective
try {
    ResponseDTODouble result = apiInstance.getLastMonthCostV2(accountIdentifier, perspectiveId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CloudCostPerspectivesApi#getLastMonthCostV2");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountIdentifier** | **String**| Account Identifier for the Entity |
 **perspectiveId** | **String**| Unique identifier for the Perspective |

### Return type

[**ResponseDTODouble**](ResponseDTODouble.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getLastPeriodCost"></a>
# **getLastPeriodCost**
> ResponseDTODouble getLastPeriodCost(accountIdentifier, perspectiveId, startTime, period)

Get the last period cost for a Perspective

Get last period cost for a Perspective

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CloudCostPerspectivesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

CloudCostPerspectivesApi apiInstance = new CloudCostPerspectivesApi();
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the Entity
String perspectiveId = "perspectiveId_example"; // String | The Perspective identifier for which we want the cost
Long startTime = 789L; // Long | The Start time (timestamp in millis) for the period
String period = "period_example"; // String | The period (DAILY, WEEKLY, MONTHLY, QUARTERLY, YEARLY) for which we want the cost
try {
    ResponseDTODouble result = apiInstance.getLastPeriodCost(accountIdentifier, perspectiveId, startTime, period);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CloudCostPerspectivesApi#getLastPeriodCost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountIdentifier** | **String**| Account Identifier for the Entity |
 **perspectiveId** | **String**| The Perspective identifier for which we want the cost |
 **startTime** | **Long**| The Start time (timestamp in millis) for the period |
 **period** | **String**| The period (DAILY, WEEKLY, MONTHLY, QUARTERLY, YEARLY) for which we want the cost | [enum: DAILY, WEEKLY, MONTHLY, QUARTERLY, YEARLY]

### Return type

[**ResponseDTODouble**](ResponseDTODouble.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getPerspective"></a>
# **getPerspective**
> ResponseDTOCEView getPerspective(accountIdentifier, perspectiveId)

Fetch details of a Perspective

Fetch details of a Perspective for the given Perspective ID.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CloudCostPerspectivesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

CloudCostPerspectivesApi apiInstance = new CloudCostPerspectivesApi();
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the Entity
String perspectiveId = "perspectiveId_example"; // String | Unique identifier for the Perspective
try {
    ResponseDTOCEView result = apiInstance.getPerspective(accountIdentifier, perspectiveId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CloudCostPerspectivesApi#getPerspective");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountIdentifier** | **String**| Account Identifier for the Entity |
 **perspectiveId** | **String**| Unique identifier for the Perspective |

### Return type

[**ResponseDTOCEView**](ResponseDTOCEView.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updatePerspective"></a>
# **updatePerspective**
> ResponseDTOCEView updatePerspective(body, accountIdentifier)

Update a Perspective

Update a Perspective. It accepts a CEView object and upserts it using the uuid mentioned in the definition.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CloudCostPerspectivesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

CloudCostPerspectivesApi apiInstance = new CloudCostPerspectivesApi();
CEView body = new CEView(); // CEView | Perspective's CEView object
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the Entity
try {
    ResponseDTOCEView result = apiInstance.updatePerspective(body, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CloudCostPerspectivesApi#updatePerspective");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CEView**](CEView.md)| Perspective&#x27;s CEView object |
 **accountIdentifier** | **String**| Account Identifier for the Entity |

### Return type

[**ResponseDTOCEView**](ResponseDTOCEView.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

