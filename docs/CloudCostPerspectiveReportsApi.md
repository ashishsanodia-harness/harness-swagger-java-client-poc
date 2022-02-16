# CloudCostPerspectiveReportsApi

All URIs are relative to *https://app.harness.io/gateway*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createReportSetting**](CloudCostPerspectiveReportsApi.md#createReportSetting) | **POST** /ccm/api/perspectiveReport/{accountIdentifier} | Create a schedule for a Report
[**deleteReportSetting**](CloudCostPerspectiveReportsApi.md#deleteReportSetting) | **DELETE** /ccm/api/perspectiveReport/{accountIdentifier} | Delete cost Perspective report
[**getReportSetting**](CloudCostPerspectiveReportsApi.md#getReportSetting) | **GET** /ccm/api/perspectiveReport/{accountIdentifier} | Fetch details of a cost Report
[**updateReportSetting**](CloudCostPerspectiveReportsApi.md#updateReportSetting) | **PUT** /ccm/api/perspectiveReport/{accountIdentifier} | Update a cost Perspective Report

<a name="createReportSetting"></a>
# **createReportSetting**
> ResponseDTOListCEReportSchedule createReportSetting(body, accountIdentifier)

Create a schedule for a Report

Create a report schedule for the given Report ID or a Perspective ID.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CloudCostPerspectiveReportsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

CloudCostPerspectiveReportsApi apiInstance = new CloudCostPerspectiveReportsApi();
CEReportSchedule body = new CEReportSchedule(); // CEReportSchedule | CEReportSchedule object to be saved
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the Entity
try {
    ResponseDTOListCEReportSchedule result = apiInstance.createReportSetting(body, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CloudCostPerspectiveReportsApi#createReportSetting");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CEReportSchedule**](CEReportSchedule.md)| CEReportSchedule object to be saved |
 **accountIdentifier** | **String**| Account Identifier for the Entity |

### Return type

[**ResponseDTOListCEReportSchedule**](ResponseDTOListCEReportSchedule.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteReportSetting"></a>
# **deleteReportSetting**
> ResponseDTOString deleteReportSetting(accountIdentifier, reportId, perspectiveId)

Delete cost Perspective report

Delete cost Perspective Report for the given Report ID or a Perspective ID.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CloudCostPerspectiveReportsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

CloudCostPerspectiveReportsApi apiInstance = new CloudCostPerspectiveReportsApi();
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the Entity
String reportId = "reportId_example"; // String | Unique identifier for the Report
String perspectiveId = "perspectiveId_example"; // String | Unique identifier for the Perspective
try {
    ResponseDTOString result = apiInstance.deleteReportSetting(accountIdentifier, reportId, perspectiveId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CloudCostPerspectiveReportsApi#deleteReportSetting");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountIdentifier** | **String**| Account Identifier for the Entity |
 **reportId** | **String**| Unique identifier for the Report | [optional]
 **perspectiveId** | **String**| Unique identifier for the Perspective | [optional]

### Return type

[**ResponseDTOString**](ResponseDTOString.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getReportSetting"></a>
# **getReportSetting**
> ResponseDTOListCEReportSchedule getReportSetting(accountIdentifier, perspectiveId, reportId)

Fetch details of a cost Report

Fetch cost Report details for the given Report ID or a Perspective ID.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CloudCostPerspectiveReportsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

CloudCostPerspectiveReportsApi apiInstance = new CloudCostPerspectiveReportsApi();
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the Entity
String perspectiveId = "perspectiveId_example"; // String | Unique identifier for the Perspective
String reportId = "reportId_example"; // String | Unique identifier for the Report
try {
    ResponseDTOListCEReportSchedule result = apiInstance.getReportSetting(accountIdentifier, perspectiveId, reportId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CloudCostPerspectiveReportsApi#getReportSetting");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountIdentifier** | **String**| Account Identifier for the Entity |
 **perspectiveId** | **String**| Unique identifier for the Perspective | [optional]
 **reportId** | **String**| Unique identifier for the Report | [optional]

### Return type

[**ResponseDTOListCEReportSchedule**](ResponseDTOListCEReportSchedule.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateReportSetting"></a>
# **updateReportSetting**
> ResponseDTOListCEReportSchedule updateReportSetting(body, accountIdentifier)

Update a cost Perspective Report

Update cost Perspective Reports.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CloudCostPerspectiveReportsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

CloudCostPerspectiveReportsApi apiInstance = new CloudCostPerspectiveReportsApi();
CEReportSchedule body = new CEReportSchedule(); // CEReportSchedule | CEReportSchedule object to be updated
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the Entity
try {
    ResponseDTOListCEReportSchedule result = apiInstance.updateReportSetting(body, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CloudCostPerspectiveReportsApi#updateReportSetting");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CEReportSchedule**](CEReportSchedule.md)| CEReportSchedule object to be updated |
 **accountIdentifier** | **String**| Account Identifier for the Entity |

### Return type

[**ResponseDTOListCEReportSchedule**](ResponseDTOListCEReportSchedule.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

