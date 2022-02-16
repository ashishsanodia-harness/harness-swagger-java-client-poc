# LicensesApi

All URIs are relative to *https://app.harness.io/gateway*

Method | HTTP request | Description
------------- | ------------- | -------------
[**extendTrialLicense**](LicensesApi.md#extendTrialLicense) | **POST** /ng/api/licenses/extend-trial | Extends Trial License For A Module
[**getAccountLicenses**](LicensesApi.md#getAccountLicenses) | **GET** /ng/api/licenses/account | Gets All Module License Information in Account
[**getEditionActions**](LicensesApi.md#getEditionActions) | **GET** /ng/api/licenses/actions | Get Allowed Actions Under Each Edition
[**getLastModifiedTimeForAllModuleTypes**](LicensesApi.md#getLastModifiedTimeForAllModuleTypes) | **POST** /ng/api/licenses/versions | Get Last Modified Time Under Each ModuleType
[**getLicensesAndSummary**](LicensesApi.md#getLicensesAndSummary) | **GET** /ng/api/licenses/{accountIdentifier}/summary | Gets Module Licenses With Summary By Account And ModuleType
[**getModuleLicenseById**](LicensesApi.md#getModuleLicenseById) | **GET** /ng/api/licenses/{identifier} | Gets Module License
[**getModuleLicensesByAccountAndModuleType**](LicensesApi.md#getModuleLicensesByAccountAndModuleType) | **GET** /ng/api/licenses/modules/{accountIdentifier} | Gets Module Licenses By Account And ModuleType
[**startFreeLicense**](LicensesApi.md#startFreeLicense) | **POST** /ng/api/licenses/free | Starts Free License For A Module
[**startTrialLicense**](LicensesApi.md#startTrialLicense) | **POST** /ng/api/licenses/trial | Starts Trial License For A Module

<a name="extendTrialLicense"></a>
# **extendTrialLicense**
> ResponseDTOModuleLicense extendTrialLicense(body, accountIdentifier)

Extends Trial License For A Module

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.LicensesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

LicensesApi apiInstance = new LicensesApi();
StartTrial body = new StartTrial(); // StartTrial | This is the details of the Trial License. ModuleType and edition are mandatory
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the Entity
try {
    ResponseDTOModuleLicense result = apiInstance.extendTrialLicense(body, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LicensesApi#extendTrialLicense");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**StartTrial**](StartTrial.md)| This is the details of the Trial License. ModuleType and edition are mandatory |
 **accountIdentifier** | **String**| Account Identifier for the Entity |

### Return type

[**ResponseDTOModuleLicense**](ResponseDTOModuleLicense.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/yaml

<a name="getAccountLicenses"></a>
# **getAccountLicenses**
> ResponseDTOAccountLicense getAccountLicenses(accountIdentifier)

Gets All Module License Information in Account

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.LicensesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

LicensesApi apiInstance = new LicensesApi();
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the Entity
try {
    ResponseDTOAccountLicense result = apiInstance.getAccountLicenses(accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LicensesApi#getAccountLicenses");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountIdentifier** | **String**| Account Identifier for the Entity |

### Return type

[**ResponseDTOAccountLicense**](ResponseDTOAccountLicense.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/yaml

<a name="getEditionActions"></a>
# **getEditionActions**
> ResponseDTOMapEditionSetEditionAction getEditionActions(accountIdentifier, moduleType)

Get Allowed Actions Under Each Edition

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.LicensesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

LicensesApi apiInstance = new LicensesApi();
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the Entity
String moduleType = "moduleType_example"; // String | A Harness Platform module.
try {
    ResponseDTOMapEditionSetEditionAction result = apiInstance.getEditionActions(accountIdentifier, moduleType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LicensesApi#getEditionActions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountIdentifier** | **String**| Account Identifier for the Entity |
 **moduleType** | **String**| A Harness Platform module. | [enum: CD, CI, CV, CF, CE, CORE, PMS, TEMPLATESERVICE]

### Return type

[**ResponseDTOMapEditionSetEditionAction**](ResponseDTOMapEditionSetEditionAction.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/yaml

<a name="getLastModifiedTimeForAllModuleTypes"></a>
# **getLastModifiedTimeForAllModuleTypes**
> ResponseDTOMapModuleTypeLong getLastModifiedTimeForAllModuleTypes(accountIdentifier)

Get Last Modified Time Under Each ModuleType

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.LicensesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

LicensesApi apiInstance = new LicensesApi();
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the Entity
try {
    ResponseDTOMapModuleTypeLong result = apiInstance.getLastModifiedTimeForAllModuleTypes(accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LicensesApi#getLastModifiedTimeForAllModuleTypes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountIdentifier** | **String**| Account Identifier for the Entity |

### Return type

[**ResponseDTOMapModuleTypeLong**](ResponseDTOMapModuleTypeLong.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/yaml

<a name="getLicensesAndSummary"></a>
# **getLicensesAndSummary**
> ResponseDTOLicensesWithSummary getLicensesAndSummary(accountIdentifier, moduleType)

Gets Module Licenses With Summary By Account And ModuleType

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.LicensesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

LicensesApi apiInstance = new LicensesApi();
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the Entity
String moduleType = "moduleType_example"; // String | A Harness Platform module.
try {
    ResponseDTOLicensesWithSummary result = apiInstance.getLicensesAndSummary(accountIdentifier, moduleType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LicensesApi#getLicensesAndSummary");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountIdentifier** | **String**| Account Identifier for the Entity |
 **moduleType** | **String**| A Harness Platform module. | [enum: CD, CI, CV, CF, CE, CORE, PMS, TEMPLATESERVICE]

### Return type

[**ResponseDTOLicensesWithSummary**](ResponseDTOLicensesWithSummary.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/yaml

<a name="getModuleLicenseById"></a>
# **getModuleLicenseById**
> ResponseDTOModuleLicense getModuleLicenseById(identifier, accountIdentifier)

Gets Module License

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.LicensesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

LicensesApi apiInstance = new LicensesApi();
String identifier = "identifier_example"; // String | The module license identifier
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the Entity
try {
    ResponseDTOModuleLicense result = apiInstance.getModuleLicenseById(identifier, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LicensesApi#getModuleLicenseById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **String**| The module license identifier |
 **accountIdentifier** | **String**| Account Identifier for the Entity |

### Return type

[**ResponseDTOModuleLicense**](ResponseDTOModuleLicense.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/yaml

<a name="getModuleLicensesByAccountAndModuleType"></a>
# **getModuleLicensesByAccountAndModuleType**
> ResponseDTOListModuleLicense getModuleLicensesByAccountAndModuleType(accountIdentifier, moduleType)

Gets Module Licenses By Account And ModuleType

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.LicensesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

LicensesApi apiInstance = new LicensesApi();
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the Entity
String moduleType = "moduleType_example"; // String | A Harness Platform module.
try {
    ResponseDTOListModuleLicense result = apiInstance.getModuleLicensesByAccountAndModuleType(accountIdentifier, moduleType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LicensesApi#getModuleLicensesByAccountAndModuleType");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountIdentifier** | **String**| Account Identifier for the Entity |
 **moduleType** | **String**| A Harness Platform module. | [enum: CD, CI, CV, CF, CE, CORE, PMS, TEMPLATESERVICE]

### Return type

[**ResponseDTOListModuleLicense**](ResponseDTOListModuleLicense.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/yaml

<a name="startFreeLicense"></a>
# **startFreeLicense**
> ResponseDTOModuleLicense startFreeLicense(accountIdentifier, moduleType)

Starts Free License For A Module

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.LicensesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

LicensesApi apiInstance = new LicensesApi();
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the Entity
String moduleType = "moduleType_example"; // String | A Harness Platform module.
try {
    ResponseDTOModuleLicense result = apiInstance.startFreeLicense(accountIdentifier, moduleType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LicensesApi#startFreeLicense");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountIdentifier** | **String**| Account Identifier for the Entity |
 **moduleType** | **String**| A Harness Platform module. | [enum: CD, CI, CV, CF, CE, CORE, PMS, TEMPLATESERVICE]

### Return type

[**ResponseDTOModuleLicense**](ResponseDTOModuleLicense.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/yaml

<a name="startTrialLicense"></a>
# **startTrialLicense**
> ResponseDTOModuleLicense startTrialLicense(body, accountIdentifier)

Starts Trial License For A Module

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.LicensesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

LicensesApi apiInstance = new LicensesApi();
StartTrial body = new StartTrial(); // StartTrial | This is the details of the Trial License. ModuleType and edition are mandatory
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the Entity
try {
    ResponseDTOModuleLicense result = apiInstance.startTrialLicense(body, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LicensesApi#startTrialLicense");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**StartTrial**](StartTrial.md)| This is the details of the Trial License. ModuleType and edition are mandatory |
 **accountIdentifier** | **String**| Account Identifier for the Entity |

### Return type

[**ResponseDTOModuleLicense**](ResponseDTOModuleLicense.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/yaml

