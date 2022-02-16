# CloudCostBudgetsApi

All URIs are relative to *https://app.harness.io/gateway*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cloneBudget**](CloudCostBudgetsApi.md#cloneBudget) | **POST** /ccm/api/budgets/{id} | Clone a budget
[**createBudget**](CloudCostBudgetsApi.md#createBudget) | **POST** /ccm/api/budgets | Create a Budget
[**deleteBudget**](CloudCostBudgetsApi.md#deleteBudget) | **DELETE** /ccm/api/budgets/{id} | Delete a budget
[**getBudget**](CloudCostBudgetsApi.md#getBudget) | **GET** /ccm/api/budgets/{id} | Fetch Budget details
[**getCostDetails**](CloudCostBudgetsApi.md#getCostDetails) | **GET** /ccm/api/budgets/{id}/costDetails | Fetch the cost details of a Budget
[**listBudgets**](CloudCostBudgetsApi.md#listBudgets) | **GET** /ccm/api/budgets | List all the Budgets
[**listBudgetsForPerspective**](CloudCostBudgetsApi.md#listBudgetsForPerspective) | **GET** /ccm/api/budgets/perspectiveBudgets | List all the Budgets associated with a Perspective
[**updateBudget**](CloudCostBudgetsApi.md#updateBudget) | **PUT** /ccm/api/budgets/{id} | Update an existing budget

<a name="cloneBudget"></a>
# **cloneBudget**
> ResponseDTOString cloneBudget(accountIdentifier, id, cloneName)

Clone a budget

Clone a Cloud Cost Budget using the given Budget ID.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CloudCostBudgetsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

CloudCostBudgetsApi apiInstance = new CloudCostBudgetsApi();
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the Entity
String id = "id_example"; // String | Unique identifier for the budget
String cloneName = "cloneName_example"; // String | Name of the new budget
try {
    ResponseDTOString result = apiInstance.cloneBudget(accountIdentifier, id, cloneName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CloudCostBudgetsApi#cloneBudget");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountIdentifier** | **String**| Account Identifier for the Entity |
 **id** | **String**| Unique identifier for the budget |
 **cloneName** | **String**| Name of the new budget |

### Return type

[**ResponseDTOString**](ResponseDTOString.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createBudget"></a>
# **createBudget**
> ResponseDTOString createBudget(body, accountIdentifier)

Create a Budget

Create a Budget to set and receive alerts when your costs exceed (or are forecasted to exceed) your budget amount.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CloudCostBudgetsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

CloudCostBudgetsApi apiInstance = new CloudCostBudgetsApi();
Budget body = new Budget(); // Budget | Budget definition
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the Entity
try {
    ResponseDTOString result = apiInstance.createBudget(body, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CloudCostBudgetsApi#createBudget");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Budget**](Budget.md)| Budget definition |
 **accountIdentifier** | **String**| Account Identifier for the Entity |

### Return type

[**ResponseDTOString**](ResponseDTOString.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteBudget"></a>
# **deleteBudget**
> ResponseDTOString deleteBudget(accountIdentifier, id)

Delete a budget

Delete a Cloud Cost Budget for the given Budget ID.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CloudCostBudgetsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

CloudCostBudgetsApi apiInstance = new CloudCostBudgetsApi();
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the Entity
String id = "id_example"; // String | Unique identifier for the budget
try {
    ResponseDTOString result = apiInstance.deleteBudget(accountIdentifier, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CloudCostBudgetsApi#deleteBudget");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountIdentifier** | **String**| Account Identifier for the Entity |
 **id** | **String**| Unique identifier for the budget |

### Return type

[**ResponseDTOString**](ResponseDTOString.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getBudget"></a>
# **getBudget**
> ResponseDTOBudget getBudget(accountIdentifier, id)

Fetch Budget details

Fetch details of a Cloud Cost Budget for the given Budget ID.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CloudCostBudgetsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

CloudCostBudgetsApi apiInstance = new CloudCostBudgetsApi();
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the Entity
String id = "id_example"; // String | Unique identifier for the budget
try {
    ResponseDTOBudget result = apiInstance.getBudget(accountIdentifier, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CloudCostBudgetsApi#getBudget");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountIdentifier** | **String**| Account Identifier for the Entity |
 **id** | **String**| Unique identifier for the budget |

### Return type

[**ResponseDTOBudget**](ResponseDTOBudget.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCostDetails"></a>
# **getCostDetails**
> ResponseDTOBudgetData getCostDetails(accountIdentifier, id)

Fetch the cost details of a Budget

Fetch the cost details of a Cloud Cost Budget for the given Budget ID.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CloudCostBudgetsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

CloudCostBudgetsApi apiInstance = new CloudCostBudgetsApi();
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the Entity
String id = "id_example"; // String | Unique identifier for the Budget
try {
    ResponseDTOBudgetData result = apiInstance.getCostDetails(accountIdentifier, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CloudCostBudgetsApi#getCostDetails");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountIdentifier** | **String**| Account Identifier for the Entity |
 **id** | **String**| Unique identifier for the Budget |

### Return type

[**ResponseDTOBudgetData**](ResponseDTOBudgetData.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listBudgets"></a>
# **listBudgets**
> ResponseDTOListBudget listBudgets(accountIdentifier)

List all the Budgets

List all the Cloud Cost Budgets.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CloudCostBudgetsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

CloudCostBudgetsApi apiInstance = new CloudCostBudgetsApi();
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the Entity
try {
    ResponseDTOListBudget result = apiInstance.listBudgets(accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CloudCostBudgetsApi#listBudgets");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountIdentifier** | **String**| Account Identifier for the Entity |

### Return type

[**ResponseDTOListBudget**](ResponseDTOListBudget.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listBudgetsForPerspective"></a>
# **listBudgetsForPerspective**
> ResponseDTOListBudget listBudgetsForPerspective(accountIdentifier, perspectiveId)

List all the Budgets associated with a Perspective

List all the Cloud Cost Budgets associated for the given Perspective ID.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CloudCostBudgetsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

CloudCostBudgetsApi apiInstance = new CloudCostBudgetsApi();
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the Entity
String perspectiveId = "perspectiveId_example"; // String | Unique identifier for the Perspective
try {
    ResponseDTOListBudget result = apiInstance.listBudgetsForPerspective(accountIdentifier, perspectiveId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CloudCostBudgetsApi#listBudgetsForPerspective");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountIdentifier** | **String**| Account Identifier for the Entity |
 **perspectiveId** | **String**| Unique identifier for the Perspective |

### Return type

[**ResponseDTOListBudget**](ResponseDTOListBudget.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateBudget"></a>
# **updateBudget**
> ResponseDTOString updateBudget(body, accountIdentifier, id)

Update an existing budget

Update an existing Cloud Cost Budget for the given Budget ID.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CloudCostBudgetsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

CloudCostBudgetsApi apiInstance = new CloudCostBudgetsApi();
Budget body = new Budget(); // Budget | The Budget object
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the Entity
String id = "id_example"; // String | Unique identifier for the budget
try {
    ResponseDTOString result = apiInstance.updateBudget(body, accountIdentifier, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CloudCostBudgetsApi#updateBudget");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Budget**](Budget.md)| The Budget object |
 **accountIdentifier** | **String**| Account Identifier for the Entity |
 **id** | **String**| Unique identifier for the budget |

### Return type

[**ResponseDTOString**](ResponseDTOString.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

