# AuthenticationSettingsApi

All URIs are relative to *https://app.harness.io/gateway*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteSamlMetaData**](AuthenticationSettingsApi.md#deleteSamlMetaData) | **DELETE** /ng/api/authentication-settings/delete-saml-metadata | Deletes SAML meta data by accountIdentifier
[**getAuthenticationSettings**](AuthenticationSettingsApi.md#getAuthenticationSettings) | **GET** /ng/api/authentication-settings | Get the authentication settings by accountIdentifier
[**getPasswordStrengthSettings**](AuthenticationSettingsApi.md#getPasswordStrengthSettings) | **GET** /ng/api/authentication-settings/login-settings/password-strength | Get the password strength settings by accountIdentifier
[**getSamlLoginTest**](AuthenticationSettingsApi.md#getSamlLoginTest) | **GET** /ng/api/authentication-settings/saml-login-test | Get the SAML login test by accountId
[**removeOauthMechanism**](AuthenticationSettingsApi.md#removeOauthMechanism) | **DELETE** /ng/api/authentication-settings/oauth/remove-mechanism | Deletes OAuth mechanism by accountIdentifier
[**setTwoFactorAuthAtAccountLevel**](AuthenticationSettingsApi.md#setTwoFactorAuthAtAccountLevel) | **PUT** /ng/api/authentication-settings/two-factor-admin-override-settings | Set two factor auth at account lever by accountIdentifier
[**updateAuthMechanism**](AuthenticationSettingsApi.md#updateAuthMechanism) | **PUT** /ng/api/authentication-settings/update-auth-mechanism | Updates the Auth mechanism by accountIdentifier
[**updateOauthProviders**](AuthenticationSettingsApi.md#updateOauthProviders) | **PUT** /ng/api/authentication-settings/oauth/update-providers | Updates the Oauth providers by accountIdentifier
[**updateSamlMetaData**](AuthenticationSettingsApi.md#updateSamlMetaData) | **PUT** /ng/api/authentication-settings/saml-metadata-upload | Updates the SAML metadata by accountId
[**updateWhitelistedDomains**](AuthenticationSettingsApi.md#updateWhitelistedDomains) | **PUT** /ng/api/authentication-settings/whitelisted-domains | Updates the Whitelisted domains by accountIdentifier
[**uploadSamlMetaData**](AuthenticationSettingsApi.md#uploadSamlMetaData) | **POST** /ng/api/authentication-settings/saml-metadata-upload | Uploads the SAML metadata by accountId

<a name="deleteSamlMetaData"></a>
# **deleteSamlMetaData**
> RestResponseSSOConfig deleteSamlMetaData(accountIdentifier)

Deletes SAML meta data by accountIdentifier

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AuthenticationSettingsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

AuthenticationSettingsApi apiInstance = new AuthenticationSettingsApi();
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the Entity
try {
    RestResponseSSOConfig result = apiInstance.deleteSamlMetaData(accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthenticationSettingsApi#deleteSamlMetaData");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountIdentifier** | **String**| Account Identifier for the Entity |

### Return type

[**RestResponseSSOConfig**](RestResponseSSOConfig.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/yaml

<a name="getAuthenticationSettings"></a>
# **getAuthenticationSettings**
> RestResponseAuthenticationSettingsResponse getAuthenticationSettings(accountIdentifier)

Get the authentication settings by accountIdentifier

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AuthenticationSettingsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

AuthenticationSettingsApi apiInstance = new AuthenticationSettingsApi();
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the Entity
try {
    RestResponseAuthenticationSettingsResponse result = apiInstance.getAuthenticationSettings(accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthenticationSettingsApi#getAuthenticationSettings");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountIdentifier** | **String**| Account Identifier for the Entity |

### Return type

[**RestResponseAuthenticationSettingsResponse**](RestResponseAuthenticationSettingsResponse.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/yaml

<a name="getPasswordStrengthSettings"></a>
# **getPasswordStrengthSettings**
> RestResponsePasswordStrengthPolicy getPasswordStrengthSettings(accountIdentifier)

Get the password strength settings by accountIdentifier

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AuthenticationSettingsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

AuthenticationSettingsApi apiInstance = new AuthenticationSettingsApi();
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the Entity
try {
    RestResponsePasswordStrengthPolicy result = apiInstance.getPasswordStrengthSettings(accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthenticationSettingsApi#getPasswordStrengthSettings");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountIdentifier** | **String**| Account Identifier for the Entity |

### Return type

[**RestResponsePasswordStrengthPolicy**](RestResponsePasswordStrengthPolicy.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/yaml

<a name="getSamlLoginTest"></a>
# **getSamlLoginTest**
> RestResponseLoginTypeResponse getSamlLoginTest(accountId)

Get the SAML login test by accountId

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AuthenticationSettingsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

AuthenticationSettingsApi apiInstance = new AuthenticationSettingsApi();
String accountId = "accountId_example"; // String | Account Identifier for the Entity
try {
    RestResponseLoginTypeResponse result = apiInstance.getSamlLoginTest(accountId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthenticationSettingsApi#getSamlLoginTest");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **String**| Account Identifier for the Entity |

### Return type

[**RestResponseLoginTypeResponse**](RestResponseLoginTypeResponse.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/yaml

<a name="removeOauthMechanism"></a>
# **removeOauthMechanism**
> RestResponseBoolean removeOauthMechanism(accountIdentifier)

Deletes OAuth mechanism by accountIdentifier

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AuthenticationSettingsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

AuthenticationSettingsApi apiInstance = new AuthenticationSettingsApi();
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the Entity
try {
    RestResponseBoolean result = apiInstance.removeOauthMechanism(accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthenticationSettingsApi#removeOauthMechanism");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountIdentifier** | **String**| Account Identifier for the Entity |

### Return type

[**RestResponseBoolean**](RestResponseBoolean.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/yaml

<a name="setTwoFactorAuthAtAccountLevel"></a>
# **setTwoFactorAuthAtAccountLevel**
> RestResponseBoolean setTwoFactorAuthAtAccountLevel(body, accountIdentifier)

Set two factor auth at account lever by accountIdentifier

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AuthenticationSettingsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

AuthenticationSettingsApi apiInstance = new AuthenticationSettingsApi();
TwoFactorAdminOverrideSettings body = new TwoFactorAdminOverrideSettings(); // TwoFactorAdminOverrideSettings | Boolean that specify whether or not to override two factor enabled setting
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the Entity
try {
    RestResponseBoolean result = apiInstance.setTwoFactorAuthAtAccountLevel(body, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthenticationSettingsApi#setTwoFactorAuthAtAccountLevel");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**TwoFactorAdminOverrideSettings**](TwoFactorAdminOverrideSettings.md)| Boolean that specify whether or not to override two factor enabled setting |
 **accountIdentifier** | **String**| Account Identifier for the Entity |

### Return type

[**RestResponseBoolean**](RestResponseBoolean.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json, application/yaml

<a name="updateAuthMechanism"></a>
# **updateAuthMechanism**
> RestResponseBoolean updateAuthMechanism(accountIdentifier, authenticationMechanism)

Updates the Auth mechanism by accountIdentifier

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AuthenticationSettingsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

AuthenticationSettingsApi apiInstance = new AuthenticationSettingsApi();
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the Entity
String authenticationMechanism = "authenticationMechanism_example"; // String | Type of Authentication Mechanism SSO or NON_SSO
try {
    RestResponseBoolean result = apiInstance.updateAuthMechanism(accountIdentifier, authenticationMechanism);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthenticationSettingsApi#updateAuthMechanism");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountIdentifier** | **String**| Account Identifier for the Entity |
 **authenticationMechanism** | **String**| Type of Authentication Mechanism SSO or NON_SSO | [optional] [enum: USER_PASSWORD, SAML, LDAP, OAUTH]

### Return type

[**RestResponseBoolean**](RestResponseBoolean.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/yaml

<a name="updateOauthProviders"></a>
# **updateOauthProviders**
> RestResponseBoolean updateOauthProviders(body, accountIdentifier)

Updates the Oauth providers by accountIdentifier

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AuthenticationSettingsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

AuthenticationSettingsApi apiInstance = new AuthenticationSettingsApi();
OAuthSettings body = new OAuthSettings(); // OAuthSettings | This is the updated OAuthSettings. Please provide values for all fields, not just the fields you are updating
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the Entity
try {
    RestResponseBoolean result = apiInstance.updateOauthProviders(body, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthenticationSettingsApi#updateOauthProviders");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OAuthSettings**](OAuthSettings.md)| This is the updated OAuthSettings. Please provide values for all fields, not just the fields you are updating |
 **accountIdentifier** | **String**| Account Identifier for the Entity |

### Return type

[**RestResponseBoolean**](RestResponseBoolean.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json, application/yaml

<a name="updateSamlMetaData"></a>
# **updateSamlMetaData**
> RestResponseSSOConfig updateSamlMetaData(accountId, file, fileMetadata, displayName, groupMembershipAttr, authorizationEnabled, logoutUrl, entityIdentifier, samlProviderType, clientId, clientSecret)

Updates the SAML metadata by accountId

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AuthenticationSettingsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

AuthenticationSettingsApi apiInstance = new AuthenticationSettingsApi();
String accountId = "accountId_example"; // String | Account Identifier for the Entity
Object file = null; // Object | 
FormDataContentDisposition fileMetadata = new FormDataContentDisposition(); // FormDataContentDisposition | 
String displayName = "displayName_example"; // String | 
String groupMembershipAttr = "groupMembershipAttr_example"; // String | 
Boolean authorizationEnabled = true; // Boolean | 
String logoutUrl = "logoutUrl_example"; // String | 
String entityIdentifier = "entityIdentifier_example"; // String | 
String samlProviderType = "samlProviderType_example"; // String | 
String clientId = "clientId_example"; // String | 
String clientSecret = "clientSecret_example"; // String | 
try {
    RestResponseSSOConfig result = apiInstance.updateSamlMetaData(accountId, file, fileMetadata, displayName, groupMembershipAttr, authorizationEnabled, logoutUrl, entityIdentifier, samlProviderType, clientId, clientSecret);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthenticationSettingsApi#updateSamlMetaData");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **String**| Account Identifier for the Entity |
 **file** | [**Object**](.md)|  | [optional]
 **fileMetadata** | [**FormDataContentDisposition**](.md)|  | [optional]
 **displayName** | **String**|  | [optional]
 **groupMembershipAttr** | **String**|  | [optional]
 **authorizationEnabled** | **Boolean**|  | [optional]
 **logoutUrl** | **String**|  | [optional]
 **entityIdentifier** | **String**|  | [optional]
 **samlProviderType** | **String**|  | [optional]
 **clientId** | **String**|  | [optional]
 **clientSecret** | **String**|  | [optional]

### Return type

[**RestResponseSSOConfig**](RestResponseSSOConfig.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json, application/yaml

<a name="updateWhitelistedDomains"></a>
# **updateWhitelistedDomains**
> RestResponseBoolean updateWhitelistedDomains(accountIdentifier, body)

Updates the Whitelisted domains by accountIdentifier

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AuthenticationSettingsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

AuthenticationSettingsApi apiInstance = new AuthenticationSettingsApi();
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the Entity
List<String> body = Arrays.asList("body_example"); // List<String> | Set of whitelisted domains and IPs for the account
try {
    RestResponseBoolean result = apiInstance.updateWhitelistedDomains(accountIdentifier, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthenticationSettingsApi#updateWhitelistedDomains");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountIdentifier** | **String**| Account Identifier for the Entity |
 **body** | [**List&lt;String&gt;**](String.md)| Set of whitelisted domains and IPs for the account | [optional]

### Return type

[**RestResponseBoolean**](RestResponseBoolean.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json, application/yaml

<a name="uploadSamlMetaData"></a>
# **uploadSamlMetaData**
> RestResponseSSOConfig uploadSamlMetaData(accountId, file, fileMetadata, displayName, groupMembershipAttr, authorizationEnabled, logoutUrl, entityIdentifier, samlProviderType, clientId, clientSecret)

Uploads the SAML metadata by accountId

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AuthenticationSettingsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

AuthenticationSettingsApi apiInstance = new AuthenticationSettingsApi();
String accountId = "accountId_example"; // String | Account Identifier for the Entity
Object file = null; // Object | 
FormDataContentDisposition fileMetadata = new FormDataContentDisposition(); // FormDataContentDisposition | 
String displayName = "displayName_example"; // String | 
String groupMembershipAttr = "groupMembershipAttr_example"; // String | 
Boolean authorizationEnabled = true; // Boolean | 
String logoutUrl = "logoutUrl_example"; // String | 
String entityIdentifier = "entityIdentifier_example"; // String | 
String samlProviderType = "samlProviderType_example"; // String | 
String clientId = "clientId_example"; // String | 
String clientSecret = "clientSecret_example"; // String | 
try {
    RestResponseSSOConfig result = apiInstance.uploadSamlMetaData(accountId, file, fileMetadata, displayName, groupMembershipAttr, authorizationEnabled, logoutUrl, entityIdentifier, samlProviderType, clientId, clientSecret);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthenticationSettingsApi#uploadSamlMetaData");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **String**| Account Identifier for the Entity |
 **file** | [**Object**](.md)|  | [optional]
 **fileMetadata** | [**FormDataContentDisposition**](.md)|  | [optional]
 **displayName** | **String**|  | [optional]
 **groupMembershipAttr** | **String**|  | [optional]
 **authorizationEnabled** | **Boolean**|  | [optional]
 **logoutUrl** | **String**|  | [optional]
 **entityIdentifier** | **String**|  | [optional]
 **samlProviderType** | **String**|  | [optional]
 **clientId** | **String**|  | [optional]
 **clientSecret** | **String**|  | [optional]

### Return type

[**RestResponseSSOConfig**](RestResponseSSOConfig.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json, application/yaml

