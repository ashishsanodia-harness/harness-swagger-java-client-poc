# ProjectApi

All URIs are relative to *https://app.harness.io/gateway*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteProject**](ProjectApi.md#deleteProject) | **DELETE** /ng/api/projects/{identifier} | Deletes the Project corresponding to the specified Project ID.
[**getProject**](ProjectApi.md#getProject) | **GET** /ng/api/projects/{identifier} | Gets a Project by ID
[**getProjectList**](ProjectApi.md#getProjectList) | **GET** /ng/api/projects | List user&#x27;s project
[**getProjectListWithMultiOrgFilter**](ProjectApi.md#getProjectListWithMultiOrgFilter) | **GET** /ng/api/projects/list | List user&#x27;s project with support to filter by multiple organizations
[**postProject**](ProjectApi.md#postProject) | **POST** /ng/api/projects | Creates a Project
[**putProject**](ProjectApi.md#putProject) | **PUT** /ng/api/projects/{identifier} | Update Project by ID

<a name="deleteProject"></a>
# **deleteProject**
> ResponseDTOBoolean deleteProject(identifier, accountIdentifier, ifMatch, orgIdentifier)

Deletes the Project corresponding to the specified Project ID.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProjectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

ProjectApi apiInstance = new ProjectApi();
String identifier = "identifier_example"; // String | Project Identifier for the Entity
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the Entity
String ifMatch = "ifMatch_example"; // String | Version number of Project
String orgIdentifier = "default"; // String | This is the Organization Identifier for the Project. By default, the Default Organization's Identifier is considered.
try {
    ResponseDTOBoolean result = apiInstance.deleteProject(identifier, accountIdentifier, ifMatch, orgIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectApi#deleteProject");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **String**| Project Identifier for the Entity |
 **accountIdentifier** | **String**| Account Identifier for the Entity |
 **ifMatch** | **String**| Version number of Project | [optional]
 **orgIdentifier** | **String**| This is the Organization Identifier for the Project. By default, the Default Organization&#x27;s Identifier is considered. | [optional] [default to default]

### Return type

[**ResponseDTOBoolean**](ResponseDTOBoolean.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/yaml

<a name="getProject"></a>
# **getProject**
> ResponseDTOProjectResponse getProject(identifier, accountIdentifier, orgIdentifier)

Gets a Project by ID

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProjectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

ProjectApi apiInstance = new ProjectApi();
String identifier = "identifier_example"; // String | Project Identifier for the Entity
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the Entity
String orgIdentifier = "default"; // String | Organization identifier for the project. If left empty, Default Organization is assumed
try {
    ResponseDTOProjectResponse result = apiInstance.getProject(identifier, accountIdentifier, orgIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectApi#getProject");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **String**| Project Identifier for the Entity |
 **accountIdentifier** | **String**| Account Identifier for the Entity |
 **orgIdentifier** | **String**| Organization identifier for the project. If left empty, Default Organization is assumed | [optional] [default to default]

### Return type

[**ResponseDTOProjectResponse**](ResponseDTOProjectResponse.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/yaml

<a name="getProjectList"></a>
# **getProjectList**
> ResponseDTOPageResponseProjectResponse getProjectList(accountIdentifier, orgIdentifier, hasModule, identifiers, moduleType, searchTerm, pageIndex, pageSize, sortOrders)

List user&#x27;s project

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProjectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

ProjectApi apiInstance = new ProjectApi();
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the Entity
String orgIdentifier = "orgIdentifier_example"; // String | Organization Identifier for the Entity
Boolean hasModule = true; // Boolean | This boolean specifies whether to Filter Projects which has the Module of type passed in the module type parameter or to Filter Projects which does not has the Module of type passed in the module type parameter
List<String> identifiers = Arrays.asList("identifiers_example"); // List<String> | This is the list of Project IDs. Details specific to these IDs would be fetched.
String moduleType = "moduleType_example"; // String | Filter Projects by module type
String searchTerm = "searchTerm_example"; // String | This would be used to filter Projects. Any Project having the specified string in its Name, ID and Tag would be filtered.
Integer pageIndex = 0; // Integer | Indicates the number of pages. Results for these pages will be retrieved.
Integer pageSize = 50; // Integer | The number of the elements to fetch
List<SortOrder> sortOrders = Arrays.asList(new SortOrder()); // List<SortOrder> | Sort criteria for the elements.
try {
    ResponseDTOPageResponseProjectResponse result = apiInstance.getProjectList(accountIdentifier, orgIdentifier, hasModule, identifiers, moduleType, searchTerm, pageIndex, pageSize, sortOrders);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectApi#getProjectList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountIdentifier** | **String**| Account Identifier for the Entity |
 **orgIdentifier** | **String**| Organization Identifier for the Entity | [optional]
 **hasModule** | **Boolean**| This boolean specifies whether to Filter Projects which has the Module of type passed in the module type parameter or to Filter Projects which does not has the Module of type passed in the module type parameter | [optional] [default to true]
 **identifiers** | [**List&lt;String&gt;**](String.md)| This is the list of Project IDs. Details specific to these IDs would be fetched. | [optional]
 **moduleType** | **String**| Filter Projects by module type | [optional] [enum: CD, CI, CV, CF, CE, CORE, PMS, TEMPLATESERVICE]
 **searchTerm** | **String**| This would be used to filter Projects. Any Project having the specified string in its Name, ID and Tag would be filtered. | [optional]
 **pageIndex** | **Integer**| Indicates the number of pages. Results for these pages will be retrieved. | [optional] [default to 0]
 **pageSize** | **Integer**| The number of the elements to fetch | [optional] [default to 50]
 **sortOrders** | [**List&lt;SortOrder&gt;**](SortOrder.md)| Sort criteria for the elements. | [optional]

### Return type

[**ResponseDTOPageResponseProjectResponse**](ResponseDTOPageResponseProjectResponse.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/yaml

<a name="getProjectListWithMultiOrgFilter"></a>
# **getProjectListWithMultiOrgFilter**
> ResponseDTOPageResponseProjectResponse getProjectListWithMultiOrgFilter(accountIdentifier, orgIdentifiers, hasModule, identifiers, moduleType, searchTerm, pageIndex, pageSize, sortOrders)

List user&#x27;s project with support to filter by multiple organizations

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProjectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

ProjectApi apiInstance = new ProjectApi();
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the Entity
List<String> orgIdentifiers = Arrays.asList("orgIdentifiers_example"); // List<String> | List of Organization Identifiers for the Entities
Boolean hasModule = true; // Boolean | This boolean specifies whether to Filter Projects which has the Module of type passed in the module type parameter or to Filter Projects which does not has the Module of type passed in the module type parameter
List<String> identifiers = Arrays.asList("identifiers_example"); // List<String> | This is the list of Project Identifiers. Details specific to these IDs would be fetched.
String moduleType = "moduleType_example"; // String | Filter Projects by module type
String searchTerm = "searchTerm_example"; // String | Filter Projects by searching for this word in Name, Id, and Tag
Integer pageIndex = 0; // Integer | Indicates the number of pages. Results for these pages will be retrieved.
Integer pageSize = 50; // Integer | The number of the elements to fetch
List<SortOrder> sortOrders = Arrays.asList(new SortOrder()); // List<SortOrder> | Sort criteria for the elements.
try {
    ResponseDTOPageResponseProjectResponse result = apiInstance.getProjectListWithMultiOrgFilter(accountIdentifier, orgIdentifiers, hasModule, identifiers, moduleType, searchTerm, pageIndex, pageSize, sortOrders);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectApi#getProjectListWithMultiOrgFilter");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountIdentifier** | **String**| Account Identifier for the Entity |
 **orgIdentifiers** | [**List&lt;String&gt;**](String.md)| List of Organization Identifiers for the Entities | [optional]
 **hasModule** | **Boolean**| This boolean specifies whether to Filter Projects which has the Module of type passed in the module type parameter or to Filter Projects which does not has the Module of type passed in the module type parameter | [optional] [default to true]
 **identifiers** | [**List&lt;String&gt;**](String.md)| This is the list of Project Identifiers. Details specific to these IDs would be fetched. | [optional]
 **moduleType** | **String**| Filter Projects by module type | [optional] [enum: CD, CI, CV, CF, CE, CORE, PMS, TEMPLATESERVICE]
 **searchTerm** | **String**| Filter Projects by searching for this word in Name, Id, and Tag | [optional]
 **pageIndex** | **Integer**| Indicates the number of pages. Results for these pages will be retrieved. | [optional] [default to 0]
 **pageSize** | **Integer**| The number of the elements to fetch | [optional] [default to 50]
 **sortOrders** | [**List&lt;SortOrder&gt;**](SortOrder.md)| Sort criteria for the elements. | [optional]

### Return type

[**ResponseDTOPageResponseProjectResponse**](ResponseDTOPageResponseProjectResponse.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/yaml

<a name="postProject"></a>
# **postProject**
> ResponseDTOProjectResponse postProject(body, accountIdentifier, orgIdentifier)

Creates a Project

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProjectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

ProjectApi apiInstance = new ProjectApi();
ProjectRequest body = new ProjectRequest(); // ProjectRequest | Details of the Project to create
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the Entity
String orgIdentifier = "default"; // String | Organization identifier for the Project. If left empty, the Project is created under Default Organization
try {
    ResponseDTOProjectResponse result = apiInstance.postProject(body, accountIdentifier, orgIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectApi#postProject");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ProjectRequest**](ProjectRequest.md)| Details of the Project to create |
 **accountIdentifier** | **String**| Account Identifier for the Entity |
 **orgIdentifier** | **String**| Organization identifier for the Project. If left empty, the Project is created under Default Organization | [optional] [default to default]

### Return type

[**ResponseDTOProjectResponse**](ResponseDTOProjectResponse.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json, application/yaml
 - **Accept**: application/json, application/yaml

<a name="putProject"></a>
# **putProject**
> ResponseDTOProjectResponse putProject(body, accountIdentifier, identifier, ifMatch, orgIdentifier)

Update Project by ID

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProjectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

ProjectApi apiInstance = new ProjectApi();
ProjectRequest body = new ProjectRequest(); // ProjectRequest | This is the updated Project. Please provide values for all fields, not just the fields you are updating
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the Entity
String identifier = "identifier_example"; // String | Project Identifier for the Entity
String ifMatch = "ifMatch_example"; // String | Version number of Project
String orgIdentifier = "default"; // String | Organization identifier for the Project. If left empty, Default Organization is assumed
try {
    ResponseDTOProjectResponse result = apiInstance.putProject(body, accountIdentifier, identifier, ifMatch, orgIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectApi#putProject");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ProjectRequest**](ProjectRequest.md)| This is the updated Project. Please provide values for all fields, not just the fields you are updating |
 **accountIdentifier** | **String**| Account Identifier for the Entity |
 **identifier** | **String**| Project Identifier for the Entity |
 **ifMatch** | **String**| Version number of Project | [optional]
 **orgIdentifier** | **String**| Organization identifier for the Project. If left empty, Default Organization is assumed | [optional] [default to default]

### Return type

[**ResponseDTOProjectResponse**](ResponseDTOProjectResponse.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json, application/yaml
 - **Accept**: application/json, application/yaml

