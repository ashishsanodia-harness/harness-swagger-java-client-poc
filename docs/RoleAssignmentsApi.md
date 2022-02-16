# RoleAssignmentsApi

All URIs are relative to *https://app.harness.io/gateway*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteRoleAssignment**](RoleAssignmentsApi.md#deleteRoleAssignment) | **DELETE** /authz/api/roleassignments/{identifier} | Delete an existing role assignment by identifier
[**getFilteredRoleAssignmentList**](RoleAssignmentsApi.md#getFilteredRoleAssignmentList) | **POST** /authz/api/roleassignments/filter | List role assignments in the scope according to the given filter
[**getRoleAssignmentAggregateList**](RoleAssignmentsApi.md#getRoleAssignmentAggregateList) | **POST** /authz/api/roleassignments/aggregate | List role assignments in the scope according to the given filter with added metadata
[**getRoleAssignmentList**](RoleAssignmentsApi.md#getRoleAssignmentList) | **GET** /authz/api/roleassignments | List role assignments in the given scope
[**postRoleAssignment**](RoleAssignmentsApi.md#postRoleAssignment) | **POST** /authz/api/roleassignments | Creates role assignment within the specified scope.
[**postRoleAssignments**](RoleAssignmentsApi.md#postRoleAssignments) | **POST** /authz/api/roleassignments/multi | Create multiple role assignments in a scope. Returns all successfully created role assignments. Ignores failures and duplicates.
[**putRoleAssignment**](RoleAssignmentsApi.md#putRoleAssignment) | **PUT** /authz/api/roleassignments/{identifier} | Update existing role assignment by identifier and scope. Only changing the disabled/enabled state is allowed.
[**validateRoleAssignment**](RoleAssignmentsApi.md#validateRoleAssignment) | **POST** /authz/api/roleassignments/validate | Check whether a proposed role assignment is valid.

<a name="deleteRoleAssignment"></a>
# **deleteRoleAssignment**
> ResponseDTORoleAssignmentResponse deleteRoleAssignment(identifier, accountIdentifier, orgIdentifier, projectIdentifier)

Delete an existing role assignment by identifier

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RoleAssignmentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

RoleAssignmentsApi apiInstance = new RoleAssignmentsApi();
String identifier = "identifier_example"; // String | Identifier for role assignment
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the Entity
String orgIdentifier = "orgIdentifier_example"; // String | Organization Identifier for the Entity
String projectIdentifier = "projectIdentifier_example"; // String | Project Identifier for the Entity
try {
    ResponseDTORoleAssignmentResponse result = apiInstance.deleteRoleAssignment(identifier, accountIdentifier, orgIdentifier, projectIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoleAssignmentsApi#deleteRoleAssignment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **String**| Identifier for role assignment |
 **accountIdentifier** | **String**| Account Identifier for the Entity | [optional]
 **orgIdentifier** | **String**| Organization Identifier for the Entity | [optional]
 **projectIdentifier** | **String**| Project Identifier for the Entity | [optional]

### Return type

[**ResponseDTORoleAssignmentResponse**](ResponseDTORoleAssignmentResponse.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/yaml

<a name="getFilteredRoleAssignmentList"></a>
# **getFilteredRoleAssignmentList**
> ResponseDTOPageResponseRoleAssignmentResponse getFilteredRoleAssignmentList(body, pageIndex, pageSize, sortOrders, accountIdentifier, orgIdentifier, projectIdentifier)

List role assignments in the scope according to the given filter

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RoleAssignmentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

RoleAssignmentsApi apiInstance = new RoleAssignmentsApi();
RoleAssignmentFilter body = new RoleAssignmentFilter(); // RoleAssignmentFilter | Filter role assignments based on multiple parameters.
Integer pageIndex = 0; // Integer | Indicates the number of pages. Results for these pages will be retrieved.
Integer pageSize = 50; // Integer | The number of the elements to fetch
List<SortOrder> sortOrders = Arrays.asList(new SortOrder()); // List<SortOrder> | Sort criteria for the elements.
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the Entity
String orgIdentifier = "orgIdentifier_example"; // String | Organization Identifier for the Entity
String projectIdentifier = "projectIdentifier_example"; // String | Project Identifier for the Entity
try {
    ResponseDTOPageResponseRoleAssignmentResponse result = apiInstance.getFilteredRoleAssignmentList(body, pageIndex, pageSize, sortOrders, accountIdentifier, orgIdentifier, projectIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoleAssignmentsApi#getFilteredRoleAssignmentList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RoleAssignmentFilter**](RoleAssignmentFilter.md)| Filter role assignments based on multiple parameters. |
 **pageIndex** | **Integer**| Indicates the number of pages. Results for these pages will be retrieved. | [optional] [default to 0]
 **pageSize** | **Integer**| The number of the elements to fetch | [optional] [default to 50]
 **sortOrders** | [**List&lt;SortOrder&gt;**](SortOrder.md)| Sort criteria for the elements. | [optional]
 **accountIdentifier** | **String**| Account Identifier for the Entity | [optional]
 **orgIdentifier** | **String**| Organization Identifier for the Entity | [optional]
 **projectIdentifier** | **String**| Project Identifier for the Entity | [optional]

### Return type

[**ResponseDTOPageResponseRoleAssignmentResponse**](ResponseDTOPageResponseRoleAssignmentResponse.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json, application/yaml
 - **Accept**: application/json, application/yaml

<a name="getRoleAssignmentAggregateList"></a>
# **getRoleAssignmentAggregateList**
> ResponseDTORoleAssignmentAggregateResponse getRoleAssignmentAggregateList(body, accountIdentifier, orgIdentifier, projectIdentifier)

List role assignments in the scope according to the given filter with added metadata

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RoleAssignmentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

RoleAssignmentsApi apiInstance = new RoleAssignmentsApi();
RoleAssignmentFilter body = new RoleAssignmentFilter(); // RoleAssignmentFilter | Filter role assignments based on multiple parameters.
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the Entity
String orgIdentifier = "orgIdentifier_example"; // String | Organization Identifier for the Entity
String projectIdentifier = "projectIdentifier_example"; // String | Project Identifier for the Entity
try {
    ResponseDTORoleAssignmentAggregateResponse result = apiInstance.getRoleAssignmentAggregateList(body, accountIdentifier, orgIdentifier, projectIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoleAssignmentsApi#getRoleAssignmentAggregateList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RoleAssignmentFilter**](RoleAssignmentFilter.md)| Filter role assignments based on multiple parameters. |
 **accountIdentifier** | **String**| Account Identifier for the Entity | [optional]
 **orgIdentifier** | **String**| Organization Identifier for the Entity | [optional]
 **projectIdentifier** | **String**| Project Identifier for the Entity | [optional]

### Return type

[**ResponseDTORoleAssignmentAggregateResponse**](ResponseDTORoleAssignmentAggregateResponse.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json, application/yaml
 - **Accept**: application/json, application/yaml

<a name="getRoleAssignmentList"></a>
# **getRoleAssignmentList**
> ResponseDTOPageResponseRoleAssignmentResponse getRoleAssignmentList(pageIndex, pageSize, sortOrders, accountIdentifier, orgIdentifier, projectIdentifier)

List role assignments in the given scope

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RoleAssignmentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

RoleAssignmentsApi apiInstance = new RoleAssignmentsApi();
Integer pageIndex = 0; // Integer | Indicates the number of pages. Results for these pages will be retrieved.
Integer pageSize = 50; // Integer | The number of the elements to fetch
List<SortOrder> sortOrders = Arrays.asList(new SortOrder()); // List<SortOrder> | Sort criteria for the elements.
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the Entity
String orgIdentifier = "orgIdentifier_example"; // String | Organization Identifier for the Entity
String projectIdentifier = "projectIdentifier_example"; // String | Project Identifier for the Entity
try {
    ResponseDTOPageResponseRoleAssignmentResponse result = apiInstance.getRoleAssignmentList(pageIndex, pageSize, sortOrders, accountIdentifier, orgIdentifier, projectIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoleAssignmentsApi#getRoleAssignmentList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pageIndex** | **Integer**| Indicates the number of pages. Results for these pages will be retrieved. | [optional] [default to 0]
 **pageSize** | **Integer**| The number of the elements to fetch | [optional] [default to 50]
 **sortOrders** | [**List&lt;SortOrder&gt;**](SortOrder.md)| Sort criteria for the elements. | [optional]
 **accountIdentifier** | **String**| Account Identifier for the Entity | [optional]
 **orgIdentifier** | **String**| Organization Identifier for the Entity | [optional]
 **projectIdentifier** | **String**| Project Identifier for the Entity | [optional]

### Return type

[**ResponseDTOPageResponseRoleAssignmentResponse**](ResponseDTOPageResponseRoleAssignmentResponse.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/yaml

<a name="postRoleAssignment"></a>
# **postRoleAssignment**
> ResponseDTORoleAssignmentResponse postRoleAssignment(body, accountIdentifier, orgIdentifier, projectIdentifier)

Creates role assignment within the specified scope.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RoleAssignmentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

RoleAssignmentsApi apiInstance = new RoleAssignmentsApi();
RoleAssignment body = new RoleAssignment(); // RoleAssignment | These are details for the role assignment to create.
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the Entity
String orgIdentifier = "orgIdentifier_example"; // String | Organization Identifier for the Entity
String projectIdentifier = "projectIdentifier_example"; // String | Project Identifier for the Entity
try {
    ResponseDTORoleAssignmentResponse result = apiInstance.postRoleAssignment(body, accountIdentifier, orgIdentifier, projectIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoleAssignmentsApi#postRoleAssignment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RoleAssignment**](RoleAssignment.md)| These are details for the role assignment to create. |
 **accountIdentifier** | **String**| Account Identifier for the Entity | [optional]
 **orgIdentifier** | **String**| Organization Identifier for the Entity | [optional]
 **projectIdentifier** | **String**| Project Identifier for the Entity | [optional]

### Return type

[**ResponseDTORoleAssignmentResponse**](ResponseDTORoleAssignmentResponse.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json, application/yaml
 - **Accept**: application/json, application/yaml

<a name="postRoleAssignments"></a>
# **postRoleAssignments**
> ResponseDTOListRoleAssignmentResponse postRoleAssignments(body, accountIdentifier, orgIdentifier, projectIdentifier)

Create multiple role assignments in a scope. Returns all successfully created role assignments. Ignores failures and duplicates.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RoleAssignmentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

RoleAssignmentsApi apiInstance = new RoleAssignmentsApi();
RoleAssignmentCreateRequest body = new RoleAssignmentCreateRequest(); // RoleAssignmentCreateRequest | List of role assignments to create
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the Entity
String orgIdentifier = "orgIdentifier_example"; // String | Organization Identifier for the Entity
String projectIdentifier = "projectIdentifier_example"; // String | Project Identifier for the Entity
try {
    ResponseDTOListRoleAssignmentResponse result = apiInstance.postRoleAssignments(body, accountIdentifier, orgIdentifier, projectIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoleAssignmentsApi#postRoleAssignments");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RoleAssignmentCreateRequest**](RoleAssignmentCreateRequest.md)| List of role assignments to create |
 **accountIdentifier** | **String**| Account Identifier for the Entity | [optional]
 **orgIdentifier** | **String**| Organization Identifier for the Entity | [optional]
 **projectIdentifier** | **String**| Project Identifier for the Entity | [optional]

### Return type

[**ResponseDTOListRoleAssignmentResponse**](ResponseDTOListRoleAssignmentResponse.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json, application/yaml
 - **Accept**: application/json, application/yaml

<a name="putRoleAssignment"></a>
# **putRoleAssignment**
> ResponseDTORoleAssignmentResponse putRoleAssignment(body, identifier, accountIdentifier, orgIdentifier, projectIdentifier)

Update existing role assignment by identifier and scope. Only changing the disabled/enabled state is allowed.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RoleAssignmentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

RoleAssignmentsApi apiInstance = new RoleAssignmentsApi();
RoleAssignment body = new RoleAssignment(); // RoleAssignment | This has the details of the updated role assignment.
String identifier = "identifier_example"; // String | Identifier of the role assignment to update
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the Entity
String orgIdentifier = "orgIdentifier_example"; // String | Organization Identifier for the Entity
String projectIdentifier = "projectIdentifier_example"; // String | Project Identifier for the Entity
try {
    ResponseDTORoleAssignmentResponse result = apiInstance.putRoleAssignment(body, identifier, accountIdentifier, orgIdentifier, projectIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoleAssignmentsApi#putRoleAssignment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RoleAssignment**](RoleAssignment.md)| This has the details of the updated role assignment. |
 **identifier** | **String**| Identifier of the role assignment to update |
 **accountIdentifier** | **String**| Account Identifier for the Entity | [optional]
 **orgIdentifier** | **String**| Organization Identifier for the Entity | [optional]
 **projectIdentifier** | **String**| Project Identifier for the Entity | [optional]

### Return type

[**ResponseDTORoleAssignmentResponse**](ResponseDTORoleAssignmentResponse.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json, application/yaml
 - **Accept**: application/json, application/yaml

<a name="validateRoleAssignment"></a>
# **validateRoleAssignment**
> ResponseDTORoleAssignmentValidationResponse validateRoleAssignment(body, accountIdentifier, orgIdentifier, projectIdentifier)

Check whether a proposed role assignment is valid.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RoleAssignmentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

RoleAssignmentsApi apiInstance = new RoleAssignmentsApi();
RoleAssignmentValidationRequest body = new RoleAssignmentValidationRequest(); // RoleAssignmentValidationRequest | This is the details of the role assignment for validation.
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the Entity
String orgIdentifier = "orgIdentifier_example"; // String | Organization Identifier for the Entity
String projectIdentifier = "projectIdentifier_example"; // String | Project Identifier for the Entity
try {
    ResponseDTORoleAssignmentValidationResponse result = apiInstance.validateRoleAssignment(body, accountIdentifier, orgIdentifier, projectIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoleAssignmentsApi#validateRoleAssignment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RoleAssignmentValidationRequest**](RoleAssignmentValidationRequest.md)| This is the details of the role assignment for validation. |
 **accountIdentifier** | **String**| Account Identifier for the Entity | [optional]
 **orgIdentifier** | **String**| Organization Identifier for the Entity | [optional]
 **projectIdentifier** | **String**| Project Identifier for the Entity | [optional]

### Return type

[**ResponseDTORoleAssignmentValidationResponse**](ResponseDTORoleAssignmentValidationResponse.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json, application/yaml
 - **Accept**: application/json, application/yaml

