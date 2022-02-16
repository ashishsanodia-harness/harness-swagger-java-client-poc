# AccountsApi

All URIs are relative to *https://app.harness.io/gateway*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAccountNG**](AccountsApi.md#getAccountNG) | **GET** /ng/api/accounts/{accountIdentifier} | Gets an account
[**updateAccountDefaultExperienceNG**](AccountsApi.md#updateAccountDefaultExperienceNG) | **PUT** /ng/api/accounts/{accountIdentifier}/default-experience | Update Default Experience
[**updateAccountNameNG**](AccountsApi.md#updateAccountNameNG) | **PUT** /ng/api/accounts/{accountIdentifier}/name | Update Account Name

<a name="getAccountNG"></a>
# **getAccountNG**
> ResponseDTOAccount getAccountNG(accountIdentifier)

Gets an account

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AccountsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

AccountsApi apiInstance = new AccountsApi();
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the Entity
try {
    ResponseDTOAccount result = apiInstance.getAccountNG(accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountsApi#getAccountNG");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountIdentifier** | **String**| Account Identifier for the Entity |

### Return type

[**ResponseDTOAccount**](ResponseDTOAccount.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/yaml

<a name="updateAccountDefaultExperienceNG"></a>
# **updateAccountDefaultExperienceNG**
> ResponseDTOAccount updateAccountDefaultExperienceNG(body, accountIdentifier)

Update Default Experience

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AccountsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

AccountsApi apiInstance = new AccountsApi();
Account body = new Account(); // Account | This is details of the Account. DefaultExperience is mandatory
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the Entity
try {
    ResponseDTOAccount result = apiInstance.updateAccountDefaultExperienceNG(body, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountsApi#updateAccountDefaultExperienceNG");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Account**](Account.md)| This is details of the Account. DefaultExperience is mandatory |
 **accountIdentifier** | **String**| Account Identifier for the Entity |

### Return type

[**ResponseDTOAccount**](ResponseDTOAccount.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/yaml

<a name="updateAccountNameNG"></a>
# **updateAccountNameNG**
> ResponseDTOAccount updateAccountNameNG(body, accountIdentifier)

Update Account Name

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AccountsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

AccountsApi apiInstance = new AccountsApi();
Account body = new Account(); // Account | This is details of the Account. Name is mandatory.
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the Entity
try {
    ResponseDTOAccount result = apiInstance.updateAccountNameNG(body, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountsApi#updateAccountNameNG");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Account**](Account.md)| This is details of the Account. Name is mandatory. |
 **accountIdentifier** | **String**| Account Identifier for the Entity |

### Return type

[**ResponseDTOAccount**](ResponseDTOAccount.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/yaml

