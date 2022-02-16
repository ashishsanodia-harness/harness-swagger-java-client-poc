# SecretsApi

All URIs are relative to *https://app.harness.io/gateway*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteSecretV2**](SecretsApi.md#deleteSecretV2) | **DELETE** /ng/api/v2/secrets/{identifier} | Deletes Secret by ID and Scope
[**getSecretV2**](SecretsApi.md#getSecretV2) | **GET** /ng/api/v2/secrets/{identifier} | Get the Secret by ID and Scope
[**listSecretsV2**](SecretsApi.md#listSecretsV2) | **GET** /ng/api/v2/secrets | Fetches the list of Secrets corresponding to the request&#x27;s filter criteria.
[**listSecretsV3**](SecretsApi.md#listSecretsV3) | **POST** /ng/api/v2/secrets/list | Fetches the list of Secrets corresponding to the request&#x27;s filter criteria.
[**postSecret**](SecretsApi.md#postSecret) | **POST** /ng/api/v2/secrets | Creates a Secret at given Scope
[**postSecretFileV2**](SecretsApi.md#postSecretFileV2) | **POST** /ng/api/v2/secrets/files | Creates a Secret File
[**postSecretViaYaml**](SecretsApi.md#postSecretViaYaml) | **POST** /ng/api/v2/secrets/yaml | Creates a secret via YAML
[**putSecret**](SecretsApi.md#putSecret) | **PUT** /ng/api/v2/secrets/{identifier} | Updates the Secret by ID and Scope
[**putSecretFileV2**](SecretsApi.md#putSecretFileV2) | **PUT** /ng/api/v2/secrets/files/{identifier} | Updates the Secret file by ID and Scope
[**putSecretViaYaml**](SecretsApi.md#putSecretViaYaml) | **PUT** /ng/api/v2/secrets/{identifier}/yaml | Updates the Secret by ID and Scope via YAML
[**validateSecret**](SecretsApi.md#validateSecret) | **POST** /ng/api/v2/secrets/validate | Validates Secret with the provided ID and Scope
[**validateSecretIdentifierIsUnique**](SecretsApi.md#validateSecretIdentifierIsUnique) | **GET** /ng/api/v2/secrets/validateUniqueIdentifier/{identifier} | Checks whether the identifier is unique or not

<a name="deleteSecretV2"></a>
# **deleteSecretV2**
> ResponseDTOBoolean deleteSecretV2(identifier, accountIdentifier, orgIdentifier, projectIdentifier)

Deletes Secret by ID and Scope

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SecretsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

SecretsApi apiInstance = new SecretsApi();
String identifier = "identifier_example"; // String | Secret ID
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the Entity
String orgIdentifier = "orgIdentifier_example"; // String | Organization Identifier for the Entity
String projectIdentifier = "projectIdentifier_example"; // String | Project Identifier for the Entity
try {
    ResponseDTOBoolean result = apiInstance.deleteSecretV2(identifier, accountIdentifier, orgIdentifier, projectIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SecretsApi#deleteSecretV2");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **String**| Secret ID |
 **accountIdentifier** | **String**| Account Identifier for the Entity |
 **orgIdentifier** | **String**| Organization Identifier for the Entity | [optional]
 **projectIdentifier** | **String**| Project Identifier for the Entity | [optional]

### Return type

[**ResponseDTOBoolean**](ResponseDTOBoolean.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/yaml

<a name="getSecretV2"></a>
# **getSecretV2**
> ResponseDTOSecretResponse getSecretV2(identifier, accountIdentifier, orgIdentifier, projectIdentifier)

Get the Secret by ID and Scope

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SecretsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

SecretsApi apiInstance = new SecretsApi();
String identifier = "identifier_example"; // String | Secret ID
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the Entity
String orgIdentifier = "orgIdentifier_example"; // String | Organization Identifier for the Entity
String projectIdentifier = "projectIdentifier_example"; // String | Project Identifier for the Entity
try {
    ResponseDTOSecretResponse result = apiInstance.getSecretV2(identifier, accountIdentifier, orgIdentifier, projectIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SecretsApi#getSecretV2");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **String**| Secret ID |
 **accountIdentifier** | **String**| Account Identifier for the Entity |
 **orgIdentifier** | **String**| Organization Identifier for the Entity | [optional]
 **projectIdentifier** | **String**| Project Identifier for the Entity | [optional]

### Return type

[**ResponseDTOSecretResponse**](ResponseDTOSecretResponse.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/yaml

<a name="listSecretsV2"></a>
# **listSecretsV2**
> ResponseDTOPageResponseSecretResponse listSecretsV2(accountIdentifier, orgIdentifier, projectIdentifier, identifiers, type, searchTerm, types, sourceCategory, includeSecretsFromEverySubScope, pageIndex, pageSize)

Fetches the list of Secrets corresponding to the request&#x27;s filter criteria.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SecretsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

SecretsApi apiInstance = new SecretsApi();
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the Entity
String orgIdentifier = "orgIdentifier_example"; // String | Organization Identifier for the Entity
String projectIdentifier = "projectIdentifier_example"; // String | Project Identifier for the Entity
List<String> identifiers = Arrays.asList("identifiers_example"); // List<String> | This is the list of Secret IDs. Details specific to these IDs would be fetched.
String type = "type_example"; // String | Type of Secret whether it is SecretFile, SecretText or SSH key
String searchTerm = "searchTerm_example"; // String | Filter Secrets based on name, Identifier and tags by this search term
List<String> types = Arrays.asList("types_example"); // List<String> | Add multiple secret types like SecretFile, SecretText or SSH key to criteria
String sourceCategory = "sourceCategory_example"; // String | Source Category like CLOUD_PROVIDER, SECRET_MANAGER, CLOUD_COST, ARTIFACTORY, CODE_REPO, MONITORING or TICKETING
Boolean includeSecretsFromEverySubScope = false; // Boolean | Specify whether or not to include secrets from all the sub-scopes of the given Scope
Integer pageIndex = 0; // Integer | Page number of navigation. The default value is 0
Integer pageSize = 100; // Integer | Number of entries per page. The default value is 100 
try {
    ResponseDTOPageResponseSecretResponse result = apiInstance.listSecretsV2(accountIdentifier, orgIdentifier, projectIdentifier, identifiers, type, searchTerm, types, sourceCategory, includeSecretsFromEverySubScope, pageIndex, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SecretsApi#listSecretsV2");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountIdentifier** | **String**| Account Identifier for the Entity |
 **orgIdentifier** | **String**| Organization Identifier for the Entity | [optional]
 **projectIdentifier** | **String**| Project Identifier for the Entity | [optional]
 **identifiers** | [**List&lt;String&gt;**](String.md)| This is the list of Secret IDs. Details specific to these IDs would be fetched. | [optional]
 **type** | **String**| Type of Secret whether it is SecretFile, SecretText or SSH key | [optional] [enum: SecretFile, SecretText, SSHKey]
 **searchTerm** | **String**| Filter Secrets based on name, Identifier and tags by this search term | [optional]
 **types** | [**List&lt;String&gt;**](String.md)| Add multiple secret types like SecretFile, SecretText or SSH key to criteria | [optional] [enum: SecretFile, SecretText, SSHKey]
 **sourceCategory** | **String**| Source Category like CLOUD_PROVIDER, SECRET_MANAGER, CLOUD_COST, ARTIFACTORY, CODE_REPO, MONITORING or TICKETING | [optional] [enum: CLOUD_PROVIDER, SECRET_MANAGER, CLOUD_COST, ARTIFACTORY, CODE_REPO, MONITORING, TICKETING]
 **includeSecretsFromEverySubScope** | **Boolean**| Specify whether or not to include secrets from all the sub-scopes of the given Scope | [optional] [default to false]
 **pageIndex** | **Integer**| Page number of navigation. The default value is 0 | [optional] [default to 0]
 **pageSize** | **Integer**| Number of entries per page. The default value is 100  | [optional] [default to 100]

### Return type

[**ResponseDTOPageResponseSecretResponse**](ResponseDTOPageResponseSecretResponse.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/yaml

<a name="listSecretsV3"></a>
# **listSecretsV3**
> ResponseDTOPageResponseSecretResponse listSecretsV3(accountIdentifier, body, orgIdentifier, projectIdentifier, pageIndex, pageSize)

Fetches the list of Secrets corresponding to the request&#x27;s filter criteria.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SecretsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

SecretsApi apiInstance = new SecretsApi();
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the Entity
SecretResourceFilter body = new SecretResourceFilter(); // SecretResourceFilter | 
String orgIdentifier = "orgIdentifier_example"; // String | Organization Identifier for the Entity
String projectIdentifier = "projectIdentifier_example"; // String | Project Identifier for the Entity
Integer pageIndex = 0; // Integer | Page number of navigation. The default value of 0
Integer pageSize = 100; // Integer | Number of entries per page. The default value is 100
try {
    ResponseDTOPageResponseSecretResponse result = apiInstance.listSecretsV3(accountIdentifier, body, orgIdentifier, projectIdentifier, pageIndex, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SecretsApi#listSecretsV3");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountIdentifier** | **String**| Account Identifier for the Entity |
 **body** | [**SecretResourceFilter**](SecretResourceFilter.md)|  | [optional]
 **orgIdentifier** | **String**| Organization Identifier for the Entity | [optional]
 **projectIdentifier** | **String**| Project Identifier for the Entity | [optional]
 **pageIndex** | **Integer**| Page number of navigation. The default value of 0 | [optional] [default to 0]
 **pageSize** | **Integer**| Number of entries per page. The default value is 100 | [optional] [default to 100]

### Return type

[**ResponseDTOPageResponseSecretResponse**](ResponseDTOPageResponseSecretResponse.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json, application/yaml
 - **Accept**: application/json, application/yaml

<a name="postSecret"></a>
# **postSecret**
> ResponseDTOSecretResponse postSecret(body, accountIdentifier, orgIdentifier, projectIdentifier, privateSecret)

Creates a Secret at given Scope

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SecretsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

SecretsApi apiInstance = new SecretsApi();
SecretRequestWrapper body = new SecretRequestWrapper(); // SecretRequestWrapper | Details required to create the Secret
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the Entity
String orgIdentifier = "orgIdentifier_example"; // String | Organization Identifier for the Entity
String projectIdentifier = "projectIdentifier_example"; // String | Project Identifier for the Entity
Boolean privateSecret = false; // Boolean | This is a boolean value to specify if the Secret is Private. The default value is False.
try {
    ResponseDTOSecretResponse result = apiInstance.postSecret(body, accountIdentifier, orgIdentifier, projectIdentifier, privateSecret);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SecretsApi#postSecret");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SecretRequestWrapper**](SecretRequestWrapper.md)| Details required to create the Secret |
 **accountIdentifier** | **String**| Account Identifier for the Entity |
 **orgIdentifier** | **String**| Organization Identifier for the Entity | [optional]
 **projectIdentifier** | **String**| Project Identifier for the Entity | [optional]
 **privateSecret** | **Boolean**| This is a boolean value to specify if the Secret is Private. The default value is False. | [optional] [default to false]

### Return type

[**ResponseDTOSecretResponse**](ResponseDTOSecretResponse.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/yaml

<a name="postSecretFileV2"></a>
# **postSecretFileV2**
> ResponseDTOSecretResponse postSecretFileV2(accountIdentifier, file, spec, orgIdentifier, projectIdentifier, privateSecret)

Creates a Secret File

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SecretsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

SecretsApi apiInstance = new SecretsApi();
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the Entity
Object file = null; // Object | 
String spec = "spec_example"; // String | 
String orgIdentifier = "orgIdentifier_example"; // String | Organization Identifier for the Entity
String projectIdentifier = "projectIdentifier_example"; // String | Project Identifier for the Entity
Boolean privateSecret = false; // Boolean | This is a boolean value to specify if the Secret is Private. The default value is False.
try {
    ResponseDTOSecretResponse result = apiInstance.postSecretFileV2(accountIdentifier, file, spec, orgIdentifier, projectIdentifier, privateSecret);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SecretsApi#postSecretFileV2");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountIdentifier** | **String**| Account Identifier for the Entity |
 **file** | [**Object**](.md)|  | [optional]
 **spec** | **String**|  | [optional]
 **orgIdentifier** | **String**| Organization Identifier for the Entity | [optional]
 **projectIdentifier** | **String**| Project Identifier for the Entity | [optional]
 **privateSecret** | **Boolean**| This is a boolean value to specify if the Secret is Private. The default value is False. | [optional] [default to false]

### Return type

[**ResponseDTOSecretResponse**](ResponseDTOSecretResponse.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json, application/yaml

<a name="postSecretViaYaml"></a>
# **postSecretViaYaml**
> ResponseDTOSecretResponse postSecretViaYaml(body, accountIdentifier, orgIdentifier, projectIdentifier, privateSecret)

Creates a secret via YAML

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SecretsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

SecretsApi apiInstance = new SecretsApi();
SecretRequestWrapper body = new SecretRequestWrapper(); // SecretRequestWrapper | Details required to create the Secret
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the Entity
String orgIdentifier = "orgIdentifier_example"; // String | Organization Identifier for the Entity
String projectIdentifier = "projectIdentifier_example"; // String | Project Identifier for the Entity
Boolean privateSecret = false; // Boolean | This is a boolean value to specify if the Secret is Private. The default value is False.
try {
    ResponseDTOSecretResponse result = apiInstance.postSecretViaYaml(body, accountIdentifier, orgIdentifier, projectIdentifier, privateSecret);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SecretsApi#postSecretViaYaml");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SecretRequestWrapper**](SecretRequestWrapper.md)| Details required to create the Secret |
 **accountIdentifier** | **String**| Account Identifier for the Entity |
 **orgIdentifier** | **String**| Organization Identifier for the Entity | [optional]
 **projectIdentifier** | **String**| Project Identifier for the Entity | [optional]
 **privateSecret** | **Boolean**| This is a boolean value to specify if the Secret is Private. The default value is False. | [optional] [default to false]

### Return type

[**ResponseDTOSecretResponse**](ResponseDTOSecretResponse.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/yaml
 - **Accept**: application/json, application/yaml

<a name="putSecret"></a>
# **putSecret**
> ResponseDTOSecretResponse putSecret(accountIdentifier, identifier, body, orgIdentifier, projectIdentifier)

Updates the Secret by ID and Scope

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SecretsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

SecretsApi apiInstance = new SecretsApi();
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the Entity
String identifier = "identifier_example"; // String | Secret ID
SecretRequestWrapper body = new SecretRequestWrapper(); // SecretRequestWrapper | 
String orgIdentifier = "orgIdentifier_example"; // String | Organization Identifier for the Entity
String projectIdentifier = "projectIdentifier_example"; // String | Project Identifier for the Entity
try {
    ResponseDTOSecretResponse result = apiInstance.putSecret(accountIdentifier, identifier, body, orgIdentifier, projectIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SecretsApi#putSecret");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountIdentifier** | **String**| Account Identifier for the Entity |
 **identifier** | **String**| Secret ID |
 **body** | [**SecretRequestWrapper**](SecretRequestWrapper.md)|  | [optional]
 **orgIdentifier** | **String**| Organization Identifier for the Entity | [optional]
 **projectIdentifier** | **String**| Project Identifier for the Entity | [optional]

### Return type

[**ResponseDTOSecretResponse**](ResponseDTOSecretResponse.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/yaml

<a name="putSecretFileV2"></a>
# **putSecretFileV2**
> ResponseDTOSecretResponse putSecretFileV2(accountIdentifier, identifier, file, spec, orgIdentifier, projectIdentifier)

Updates the Secret file by ID and Scope

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SecretsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

SecretsApi apiInstance = new SecretsApi();
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the Entity
String identifier = "identifier_example"; // String | Secret ID
Object file = null; // Object | 
String spec = "spec_example"; // String | 
String orgIdentifier = "orgIdentifier_example"; // String | Organization Identifier for the Entity
String projectIdentifier = "projectIdentifier_example"; // String | Project Identifier for the Entity
try {
    ResponseDTOSecretResponse result = apiInstance.putSecretFileV2(accountIdentifier, identifier, file, spec, orgIdentifier, projectIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SecretsApi#putSecretFileV2");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountIdentifier** | **String**| Account Identifier for the Entity |
 **identifier** | **String**| Secret ID |
 **file** | [**Object**](.md)|  | [optional]
 **spec** | **String**|  | [optional]
 **orgIdentifier** | **String**| Organization Identifier for the Entity | [optional]
 **projectIdentifier** | **String**| Project Identifier for the Entity | [optional]

### Return type

[**ResponseDTOSecretResponse**](ResponseDTOSecretResponse.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json, application/yaml

<a name="putSecretViaYaml"></a>
# **putSecretViaYaml**
> ResponseDTOSecretResponse putSecretViaYaml(body, accountIdentifier, identifier, orgIdentifier, projectIdentifier)

Updates the Secret by ID and Scope via YAML

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SecretsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

SecretsApi apiInstance = new SecretsApi();
SecretRequestWrapper body = new SecretRequestWrapper(); // SecretRequestWrapper | Details of Secret to create
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the Entity
String identifier = "identifier_example"; // String | Secret ID
String orgIdentifier = "orgIdentifier_example"; // String | Organization Identifier for the Entity
String projectIdentifier = "projectIdentifier_example"; // String | Project Identifier for the Entity
try {
    ResponseDTOSecretResponse result = apiInstance.putSecretViaYaml(body, accountIdentifier, identifier, orgIdentifier, projectIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SecretsApi#putSecretViaYaml");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SecretRequestWrapper**](SecretRequestWrapper.md)| Details of Secret to create |
 **accountIdentifier** | **String**| Account Identifier for the Entity |
 **identifier** | **String**| Secret ID |
 **orgIdentifier** | **String**| Organization Identifier for the Entity | [optional]
 **projectIdentifier** | **String**| Project Identifier for the Entity | [optional]

### Return type

[**ResponseDTOSecretResponse**](ResponseDTOSecretResponse.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/yaml
 - **Accept**: application/json, application/yaml

<a name="validateSecret"></a>
# **validateSecret**
> ResponseDTOSecretValidationResult validateSecret(body, accountIdentifier, orgIdentifier, projectIdentifier, identifier)

Validates Secret with the provided ID and Scope

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SecretsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

SecretsApi apiInstance = new SecretsApi();
SecretValidationMetaData body = new SecretValidationMetaData(); // SecretValidationMetaData | Details of the Secret type
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the Entity
String orgIdentifier = "orgIdentifier_example"; // String | Organization Identifier for the Entity
String projectIdentifier = "projectIdentifier_example"; // String | Project Identifier for the Entity
String identifier = "identifier_example"; // String | Secret ID
try {
    ResponseDTOSecretValidationResult result = apiInstance.validateSecret(body, accountIdentifier, orgIdentifier, projectIdentifier, identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SecretsApi#validateSecret");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SecretValidationMetaData**](SecretValidationMetaData.md)| Details of the Secret type |
 **accountIdentifier** | **String**| Account Identifier for the Entity |
 **orgIdentifier** | **String**| Organization Identifier for the Entity | [optional]
 **projectIdentifier** | **String**| Project Identifier for the Entity | [optional]
 **identifier** | **String**| Secret ID | [optional]

### Return type

[**ResponseDTOSecretValidationResult**](ResponseDTOSecretValidationResult.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json, application/yaml
 - **Accept**: application/json, application/yaml

<a name="validateSecretIdentifierIsUnique"></a>
# **validateSecretIdentifierIsUnique**
> ResponseDTOBoolean validateSecretIdentifierIsUnique(identifier, accountIdentifier, orgIdentifier, projectIdentifier)

Checks whether the identifier is unique or not

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SecretsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

SecretsApi apiInstance = new SecretsApi();
String identifier = "identifier_example"; // String | Secret Identifier
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the Entity
String orgIdentifier = "orgIdentifier_example"; // String | Organization Identifier for the Entity
String projectIdentifier = "projectIdentifier_example"; // String | Project Identifier for the Entity
try {
    ResponseDTOBoolean result = apiInstance.validateSecretIdentifierIsUnique(identifier, accountIdentifier, orgIdentifier, projectIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SecretsApi#validateSecretIdentifierIsUnique");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **String**| Secret Identifier |
 **accountIdentifier** | **String**| Account Identifier for the Entity |
 **orgIdentifier** | **String**| Organization Identifier for the Entity | [optional]
 **projectIdentifier** | **String**| Project Identifier for the Entity | [optional]

### Return type

[**ResponseDTOBoolean**](ResponseDTOBoolean.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/yaml

