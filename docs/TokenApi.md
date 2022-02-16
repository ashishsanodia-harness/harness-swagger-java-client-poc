# TokenApi

All URIs are relative to *https://app.harness.io/gateway*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createToken**](TokenApi.md#createToken) | **POST** /ng/api/token | Creates a Token
[**deleteToken**](TokenApi.md#deleteToken) | **DELETE** /ng/api/token/{identifier} | Deletes a Token by ID
[**listAggregatedTokens**](TokenApi.md#listAggregatedTokens) | **GET** /ng/api/token/aggregate | Fetches the list of Aggregated Tokens corresponding to the request&#x27;s filter criteria.
[**rotateToken**](TokenApi.md#rotateToken) | **POST** /ng/api/token/rotate/{identifier} | Rotates a Token by ID
[**updateToken**](TokenApi.md#updateToken) | **PUT** /ng/api/token/{identifier} | Updates a Token by ID

<a name="createToken"></a>
# **createToken**
> ResponseDTOString createToken(body)

Creates a Token

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TokenApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

TokenApi apiInstance = new TokenApi();
Token body = new Token(); // Token | 
try {
    ResponseDTOString result = apiInstance.createToken(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TokenApi#createToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Token**](Token.md)|  | [optional]

### Return type

[**ResponseDTOString**](ResponseDTOString.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json, application/yaml, text/plain
 - **Accept**: application/json, application/yaml, text/plain

<a name="deleteToken"></a>
# **deleteToken**
> ResponseDTOBoolean deleteToken(identifier, accountIdentifier, apiKeyType, parentIdentifier, apiKeyIdentifier, orgIdentifier, projectIdentifier)

Deletes a Token by ID

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TokenApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

TokenApi apiInstance = new TokenApi();
String identifier = "identifier_example"; // String | Token ID
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the Entity
String apiKeyType = "apiKeyType_example"; // String | This is the API Key type like Personal Access Key or Service Account Key.
String parentIdentifier = "parentIdentifier_example"; // String | ID of API key's Parent Service Account
String apiKeyIdentifier = "apiKeyIdentifier_example"; // String | API key ID
String orgIdentifier = "orgIdentifier_example"; // String | Organization Identifier for the Entity
String projectIdentifier = "projectIdentifier_example"; // String | Project Identifier for the Entity
try {
    ResponseDTOBoolean result = apiInstance.deleteToken(identifier, accountIdentifier, apiKeyType, parentIdentifier, apiKeyIdentifier, orgIdentifier, projectIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TokenApi#deleteToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **String**| Token ID |
 **accountIdentifier** | **String**| Account Identifier for the Entity |
 **apiKeyType** | **String**| This is the API Key type like Personal Access Key or Service Account Key. | [enum: USER, SERVICE_ACCOUNT]
 **parentIdentifier** | **String**| ID of API key&#x27;s Parent Service Account |
 **apiKeyIdentifier** | **String**| API key ID |
 **orgIdentifier** | **String**| Organization Identifier for the Entity | [optional]
 **projectIdentifier** | **String**| Project Identifier for the Entity | [optional]

### Return type

[**ResponseDTOBoolean**](ResponseDTOBoolean.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/yaml, text/plain

<a name="listAggregatedTokens"></a>
# **listAggregatedTokens**
> ResponseDTOPageResponseTokenAggregate listAggregatedTokens(accountIdentifier, apiKeyType, parentIdentifier, apiKeyIdentifier, orgIdentifier, projectIdentifier, identifiers, pageIndex, pageSize, sortOrders, searchTerm)

Fetches the list of Aggregated Tokens corresponding to the request&#x27;s filter criteria.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TokenApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

TokenApi apiInstance = new TokenApi();
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the Entity
String apiKeyType = "apiKeyType_example"; // String | This is the API Key type like Personal Access Key or Service Account Key.
String parentIdentifier = "parentIdentifier_example"; // String | ID of API key's Parent Service Account
String apiKeyIdentifier = "apiKeyIdentifier_example"; // String | API key ID
String orgIdentifier = "orgIdentifier_example"; // String | Organization Identifier for the Entity
String projectIdentifier = "projectIdentifier_example"; // String | Project Identifier for the Entity
List<String> identifiers = Arrays.asList("identifiers_example"); // List<String> | This is the list of Token IDs. Details specific to these IDs would be fetched.
Integer pageIndex = 0; // Integer | Indicates the number of pages. Results for these pages will be retrieved.
Integer pageSize = 50; // Integer | The number of the elements to fetch
List<SortOrder> sortOrders = Arrays.asList(new SortOrder()); // List<SortOrder> | Sort criteria for the elements.
String searchTerm = "searchTerm_example"; // String | This would be used to filter Tokens. Any Token having the specified string in its Name, ID and Tag would be filtered.
try {
    ResponseDTOPageResponseTokenAggregate result = apiInstance.listAggregatedTokens(accountIdentifier, apiKeyType, parentIdentifier, apiKeyIdentifier, orgIdentifier, projectIdentifier, identifiers, pageIndex, pageSize, sortOrders, searchTerm);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TokenApi#listAggregatedTokens");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountIdentifier** | **String**| Account Identifier for the Entity |
 **apiKeyType** | **String**| This is the API Key type like Personal Access Key or Service Account Key. | [enum: USER, SERVICE_ACCOUNT]
 **parentIdentifier** | **String**| ID of API key&#x27;s Parent Service Account |
 **apiKeyIdentifier** | **String**| API key ID |
 **orgIdentifier** | **String**| Organization Identifier for the Entity | [optional]
 **projectIdentifier** | **String**| Project Identifier for the Entity | [optional]
 **identifiers** | [**List&lt;String&gt;**](String.md)| This is the list of Token IDs. Details specific to these IDs would be fetched. | [optional]
 **pageIndex** | **Integer**| Indicates the number of pages. Results for these pages will be retrieved. | [optional] [default to 0]
 **pageSize** | **Integer**| The number of the elements to fetch | [optional] [default to 50]
 **sortOrders** | [**List&lt;SortOrder&gt;**](SortOrder.md)| Sort criteria for the elements. | [optional]
 **searchTerm** | **String**| This would be used to filter Tokens. Any Token having the specified string in its Name, ID and Tag would be filtered. | [optional]

### Return type

[**ResponseDTOPageResponseTokenAggregate**](ResponseDTOPageResponseTokenAggregate.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/yaml, text/plain

<a name="rotateToken"></a>
# **rotateToken**
> ResponseDTOString rotateToken(identifier, accountIdentifier, apiKeyType, parentIdentifier, apiKeyIdentifier, rotateTimestamp, orgIdentifier, projectIdentifier)

Rotates a Token by ID

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TokenApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

TokenApi apiInstance = new TokenApi();
String identifier = "identifier_example"; // String | Token Identifier
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the Entity
String apiKeyType = "apiKeyType_example"; // String | This is the API Key type like Personal Access Key or Service Account Key.
String parentIdentifier = "parentIdentifier_example"; // String | ID of API key's Parent Service Account
String apiKeyIdentifier = "apiKeyIdentifier_example"; // String | API key ID
Long rotateTimestamp = 789L; // Long | Time stamp when the Token is to be rotated
String orgIdentifier = "orgIdentifier_example"; // String | Organization Identifier for the Entity
String projectIdentifier = "projectIdentifier_example"; // String | Project Identifier for the Entity
try {
    ResponseDTOString result = apiInstance.rotateToken(identifier, accountIdentifier, apiKeyType, parentIdentifier, apiKeyIdentifier, rotateTimestamp, orgIdentifier, projectIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TokenApi#rotateToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **String**| Token Identifier |
 **accountIdentifier** | **String**| Account Identifier for the Entity |
 **apiKeyType** | **String**| This is the API Key type like Personal Access Key or Service Account Key. | [enum: USER, SERVICE_ACCOUNT]
 **parentIdentifier** | **String**| ID of API key&#x27;s Parent Service Account |
 **apiKeyIdentifier** | **String**| API key ID |
 **rotateTimestamp** | **Long**| Time stamp when the Token is to be rotated | [optional]
 **orgIdentifier** | **String**| Organization Identifier for the Entity | [optional]
 **projectIdentifier** | **String**| Project Identifier for the Entity | [optional]

### Return type

[**ResponseDTOString**](ResponseDTOString.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/yaml, text/plain

<a name="updateToken"></a>
# **updateToken**
> ResponseDTOToken updateToken(identifier, body)

Updates a Token by ID

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TokenApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

TokenApi apiInstance = new TokenApi();
String identifier = "identifier_example"; // String | Token ID
Token body = new Token(); // Token | 
try {
    ResponseDTOToken result = apiInstance.updateToken(identifier, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TokenApi#updateToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **String**| Token ID |
 **body** | [**Token**](Token.md)|  | [optional]

### Return type

[**ResponseDTOToken**](ResponseDTOToken.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json, application/yaml, text/plain
 - **Accept**: application/json, application/yaml, text/plain

