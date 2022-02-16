# UserGroupApi

All URIs are relative to *https://app.harness.io/gateway*

Method | HTTP request | Description
------------- | ------------- | -------------
[**copyUserGroup**](UserGroupApi.md#copyUserGroup) | **PUT** /ng/api/user-groups/copy | Get a User Group in an account/org/project
[**deleteMember**](UserGroupApi.md#deleteMember) | **DELETE** /ng/api/user-groups/{identifier}/member/{userIdentifier} | Remove a user from the user group in an account/org/project
[**deleteUserGroup**](UserGroupApi.md#deleteUserGroup) | **DELETE** /ng/api/user-groups/{identifier} | Delete a User Group in an account/org/project
[**getBatchUsersGroupList**](UserGroupApi.md#getBatchUsersGroupList) | **POST** /ng/api/user-groups/batch | List the User Groups selected by a filter in an account/org/project
[**getMember**](UserGroupApi.md#getMember) | **GET** /ng/api/user-groups/{identifier}/member/{userIdentifier} | Check if the user is part of the user group in an account/org/project
[**getUserGroup**](UserGroupApi.md#getUserGroup) | **GET** /ng/api/user-groups/{identifier} | Get a User Group in an account/org/project
[**getUserGroupList**](UserGroupApi.md#getUserGroupList) | **GET** /ng/api/user-groups | List the User Groups in an account/org/project
[**getUserListInUserGroup**](UserGroupApi.md#getUserListInUserGroup) | **POST** /ng/api/user-groups/{identifier}/users | List the users in a User Group in an account/org/project
[**linkUserGroupToSAML**](UserGroupApi.md#linkUserGroupToSAML) | **PUT** /ng/api/user-groups/{userGroupId}/link/saml/{samlId} | Link SAML Group to the User Group in an account/org/project
[**postUserGroup**](UserGroupApi.md#postUserGroup) | **POST** /ng/api/user-groups | Create a User Group in an account/org/project
[**putMember**](UserGroupApi.md#putMember) | **PUT** /ng/api/user-groups/{identifier}/member/{userIdentifier} | Add a user to the user group in an account/org/project
[**putUserGroup**](UserGroupApi.md#putUserGroup) | **PUT** /ng/api/user-groups | Update a User Group in an account/org/project
[**unlinkUserGroupfromSSO**](UserGroupApi.md#unlinkUserGroupfromSSO) | **PUT** /ng/api/user-groups/{userGroupId}/unlink | Unlink SSO Group from the User Group in an account/org/project

<a name="copyUserGroup"></a>
# **copyUserGroup**
> ResponseDTOBoolean copyUserGroup(body, accountIdentifier, groupIdentifier)

Get a User Group in an account/org/project

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UserGroupApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

UserGroupApi apiInstance = new UserGroupApi();
List<Scope> body = Arrays.asList(new Scope()); // List<Scope> | 
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the Entity
String groupIdentifier = "groupIdentifier_example"; // String | groupIdentifier
try {
    ResponseDTOBoolean result = apiInstance.copyUserGroup(body, accountIdentifier, groupIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserGroupApi#copyUserGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**List&lt;Scope&gt;**](Scope.md)|  |
 **accountIdentifier** | **String**| Account Identifier for the Entity |
 **groupIdentifier** | **String**| groupIdentifier |

### Return type

[**ResponseDTOBoolean**](ResponseDTOBoolean.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json, application/yaml
 - **Accept**: application/json, application/yaml

<a name="deleteMember"></a>
# **deleteMember**
> ResponseDTOUserGroup deleteMember(accountIdentifier, identifier, userIdentifier, orgIdentifier, projectIdentifier)

Remove a user from the user group in an account/org/project

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UserGroupApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

UserGroupApi apiInstance = new UserGroupApi();
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the Entity
String identifier = "identifier_example"; // String | Identifier of the user group
String userIdentifier = "userIdentifier_example"; // String | Identifier of the user
String orgIdentifier = "orgIdentifier_example"; // String | Organization Identifier for the Entity
String projectIdentifier = "projectIdentifier_example"; // String | Project Identifier for the Entity
try {
    ResponseDTOUserGroup result = apiInstance.deleteMember(accountIdentifier, identifier, userIdentifier, orgIdentifier, projectIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserGroupApi#deleteMember");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountIdentifier** | **String**| Account Identifier for the Entity |
 **identifier** | **String**| Identifier of the user group |
 **userIdentifier** | **String**| Identifier of the user |
 **orgIdentifier** | **String**| Organization Identifier for the Entity | [optional]
 **projectIdentifier** | **String**| Project Identifier for the Entity | [optional]

### Return type

[**ResponseDTOUserGroup**](ResponseDTOUserGroup.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/yaml

<a name="deleteUserGroup"></a>
# **deleteUserGroup**
> ResponseDTOUserGroup deleteUserGroup(accountIdentifier, identifier, orgIdentifier, projectIdentifier)

Delete a User Group in an account/org/project

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UserGroupApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

UserGroupApi apiInstance = new UserGroupApi();
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the Entity
String identifier = "identifier_example"; // String | Identifier of the user group
String orgIdentifier = "orgIdentifier_example"; // String | Organization Identifier for the Entity
String projectIdentifier = "projectIdentifier_example"; // String | Project Identifier for the Entity
try {
    ResponseDTOUserGroup result = apiInstance.deleteUserGroup(accountIdentifier, identifier, orgIdentifier, projectIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserGroupApi#deleteUserGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountIdentifier** | **String**| Account Identifier for the Entity |
 **identifier** | **String**| Identifier of the user group |
 **orgIdentifier** | **String**| Organization Identifier for the Entity | [optional]
 **projectIdentifier** | **String**| Project Identifier for the Entity | [optional]

### Return type

[**ResponseDTOUserGroup**](ResponseDTOUserGroup.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/yaml

<a name="getBatchUsersGroupList"></a>
# **getBatchUsersGroupList**
> ResponseDTOListUserGroup getBatchUsersGroupList(body)

List the User Groups selected by a filter in an account/org/project

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UserGroupApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

UserGroupApi apiInstance = new UserGroupApi();
UserGroupFilter body = new UserGroupFilter(); // UserGroupFilter | User Group Filter
try {
    ResponseDTOListUserGroup result = apiInstance.getBatchUsersGroupList(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserGroupApi#getBatchUsersGroupList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**UserGroupFilter**](UserGroupFilter.md)| User Group Filter |

### Return type

[**ResponseDTOListUserGroup**](ResponseDTOListUserGroup.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json, application/yaml
 - **Accept**: application/json, application/yaml

<a name="getMember"></a>
# **getMember**
> ResponseDTOBoolean getMember(accountIdentifier, identifier, userIdentifier, orgIdentifier, projectIdentifier)

Check if the user is part of the user group in an account/org/project

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UserGroupApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

UserGroupApi apiInstance = new UserGroupApi();
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the Entity
String identifier = "identifier_example"; // String | Identifier of the user group
String userIdentifier = "userIdentifier_example"; // String | Identifier of the user
String orgIdentifier = "orgIdentifier_example"; // String | Organization Identifier for the Entity
String projectIdentifier = "projectIdentifier_example"; // String | Project Identifier for the Entity
try {
    ResponseDTOBoolean result = apiInstance.getMember(accountIdentifier, identifier, userIdentifier, orgIdentifier, projectIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserGroupApi#getMember");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountIdentifier** | **String**| Account Identifier for the Entity |
 **identifier** | **String**| Identifier of the user group |
 **userIdentifier** | **String**| Identifier of the user |
 **orgIdentifier** | **String**| Organization Identifier for the Entity | [optional]
 **projectIdentifier** | **String**| Project Identifier for the Entity | [optional]

### Return type

[**ResponseDTOBoolean**](ResponseDTOBoolean.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/yaml

<a name="getUserGroup"></a>
# **getUserGroup**
> ResponseDTOUserGroup getUserGroup(accountIdentifier, identifier, orgIdentifier, projectIdentifier)

Get a User Group in an account/org/project

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UserGroupApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

UserGroupApi apiInstance = new UserGroupApi();
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the Entity
String identifier = "identifier_example"; // String | Identifier of the user group
String orgIdentifier = "orgIdentifier_example"; // String | Organization Identifier for the Entity
String projectIdentifier = "projectIdentifier_example"; // String | Project Identifier for the Entity
try {
    ResponseDTOUserGroup result = apiInstance.getUserGroup(accountIdentifier, identifier, orgIdentifier, projectIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserGroupApi#getUserGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountIdentifier** | **String**| Account Identifier for the Entity |
 **identifier** | **String**| Identifier of the user group |
 **orgIdentifier** | **String**| Organization Identifier for the Entity | [optional]
 **projectIdentifier** | **String**| Project Identifier for the Entity | [optional]

### Return type

[**ResponseDTOUserGroup**](ResponseDTOUserGroup.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/yaml

<a name="getUserGroupList"></a>
# **getUserGroupList**
> ResponseDTOPageResponseUserGroup getUserGroupList(accountIdentifier, orgIdentifier, projectIdentifier, searchTerm, pageIndex, pageSize, sortOrders)

List the User Groups in an account/org/project

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UserGroupApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

UserGroupApi apiInstance = new UserGroupApi();
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the Entity
String orgIdentifier = "orgIdentifier_example"; // String | Organization Identifier for the Entity
String projectIdentifier = "projectIdentifier_example"; // String | Project Identifier for the Entity
String searchTerm = "searchTerm_example"; // String | Search filter which matches by user group name/identifier
Integer pageIndex = 0; // Integer | Indicates the number of pages. Results for these pages will be retrieved.
Integer pageSize = 50; // Integer | The number of the elements to fetch
List<SortOrder> sortOrders = Arrays.asList(new SortOrder()); // List<SortOrder> | Sort criteria for the elements.
try {
    ResponseDTOPageResponseUserGroup result = apiInstance.getUserGroupList(accountIdentifier, orgIdentifier, projectIdentifier, searchTerm, pageIndex, pageSize, sortOrders);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserGroupApi#getUserGroupList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountIdentifier** | **String**| Account Identifier for the Entity |
 **orgIdentifier** | **String**| Organization Identifier for the Entity | [optional]
 **projectIdentifier** | **String**| Project Identifier for the Entity | [optional]
 **searchTerm** | **String**| Search filter which matches by user group name/identifier | [optional]
 **pageIndex** | **Integer**| Indicates the number of pages. Results for these pages will be retrieved. | [optional] [default to 0]
 **pageSize** | **Integer**| The number of the elements to fetch | [optional] [default to 50]
 **sortOrders** | [**List&lt;SortOrder&gt;**](SortOrder.md)| Sort criteria for the elements. | [optional]

### Return type

[**ResponseDTOPageResponseUserGroup**](ResponseDTOPageResponseUserGroup.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/yaml

<a name="getUserListInUserGroup"></a>
# **getUserListInUserGroup**
> ResponseDTOPageResponseUserMetadata getUserListInUserGroup(accountIdentifier, identifier, body, orgIdentifier, projectIdentifier, pageIndex, pageSize, sortOrders)

List the users in a User Group in an account/org/project

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UserGroupApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

UserGroupApi apiInstance = new UserGroupApi();
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the Entity
String identifier = "identifier_example"; // String | Identifier of the user group
UserFilter body = new UserFilter(); // UserFilter | Filter users based on multiple parameters
String orgIdentifier = "orgIdentifier_example"; // String | Organization Identifier for the Entity
String projectIdentifier = "projectIdentifier_example"; // String | Project Identifier for the Entity
Integer pageIndex = 0; // Integer | Indicates the number of pages. Results for these pages will be retrieved.
Integer pageSize = 50; // Integer | The number of the elements to fetch
List<SortOrder> sortOrders = Arrays.asList(new SortOrder()); // List<SortOrder> | Sort criteria for the elements.
try {
    ResponseDTOPageResponseUserMetadata result = apiInstance.getUserListInUserGroup(accountIdentifier, identifier, body, orgIdentifier, projectIdentifier, pageIndex, pageSize, sortOrders);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserGroupApi#getUserListInUserGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountIdentifier** | **String**| Account Identifier for the Entity |
 **identifier** | **String**| Identifier of the user group |
 **body** | [**UserFilter**](UserFilter.md)| Filter users based on multiple parameters | [optional]
 **orgIdentifier** | **String**| Organization Identifier for the Entity | [optional]
 **projectIdentifier** | **String**| Project Identifier for the Entity | [optional]
 **pageIndex** | **Integer**| Indicates the number of pages. Results for these pages will be retrieved. | [optional] [default to 0]
 **pageSize** | **Integer**| The number of the elements to fetch | [optional] [default to 50]
 **sortOrders** | [**List&lt;SortOrder&gt;**](SortOrder.md)| Sort criteria for the elements. | [optional]

### Return type

[**ResponseDTOPageResponseUserMetadata**](ResponseDTOPageResponseUserMetadata.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json, application/yaml
 - **Accept**: application/json, application/yaml

<a name="linkUserGroupToSAML"></a>
# **linkUserGroupToSAML**
> RestResponseUserGroup linkUserGroupToSAML(body, accountIdentifier, userGroupId, samlId, orgIdentifier, projectIdentifier)

Link SAML Group to the User Group in an account/org/project

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UserGroupApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

UserGroupApi apiInstance = new UserGroupApi();
SamlLinkGroupRequest body = new SamlLinkGroupRequest(); // SamlLinkGroupRequest | Saml Link Group Request
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the Entity
String userGroupId = "userGroupId_example"; // String | Identifier of the user group
String samlId = "samlId_example"; // String | Saml Group entity identifier
String orgIdentifier = "orgIdentifier_example"; // String | Organization Identifier for the Entity
String projectIdentifier = "projectIdentifier_example"; // String | Project Identifier for the Entity
try {
    RestResponseUserGroup result = apiInstance.linkUserGroupToSAML(body, accountIdentifier, userGroupId, samlId, orgIdentifier, projectIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserGroupApi#linkUserGroupToSAML");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SamlLinkGroupRequest**](SamlLinkGroupRequest.md)| Saml Link Group Request |
 **accountIdentifier** | **String**| Account Identifier for the Entity |
 **userGroupId** | **String**| Identifier of the user group |
 **samlId** | **String**| Saml Group entity identifier |
 **orgIdentifier** | **String**| Organization Identifier for the Entity | [optional]
 **projectIdentifier** | **String**| Project Identifier for the Entity | [optional]

### Return type

[**RestResponseUserGroup**](RestResponseUserGroup.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json, application/yaml
 - **Accept**: application/json, application/yaml

<a name="postUserGroup"></a>
# **postUserGroup**
> ResponseDTOUserGroup postUserGroup(body, accountIdentifier, orgIdentifier, projectIdentifier)

Create a User Group in an account/org/project

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UserGroupApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

UserGroupApi apiInstance = new UserGroupApi();
UserGroup body = new UserGroup(); // UserGroup | User Group entity to be created
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the Entity
String orgIdentifier = "orgIdentifier_example"; // String | Organization Identifier for the Entity
String projectIdentifier = "projectIdentifier_example"; // String | Project Identifier for the Entity
try {
    ResponseDTOUserGroup result = apiInstance.postUserGroup(body, accountIdentifier, orgIdentifier, projectIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserGroupApi#postUserGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**UserGroup**](UserGroup.md)| User Group entity to be created |
 **accountIdentifier** | **String**| Account Identifier for the Entity |
 **orgIdentifier** | **String**| Organization Identifier for the Entity | [optional]
 **projectIdentifier** | **String**| Project Identifier for the Entity | [optional]

### Return type

[**ResponseDTOUserGroup**](ResponseDTOUserGroup.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json, application/yaml
 - **Accept**: application/json, application/yaml

<a name="putMember"></a>
# **putMember**
> ResponseDTOUserGroup putMember(accountIdentifier, identifier, userIdentifier, orgIdentifier, projectIdentifier)

Add a user to the user group in an account/org/project

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UserGroupApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

UserGroupApi apiInstance = new UserGroupApi();
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the Entity
String identifier = "identifier_example"; // String | Identifier of the user group
String userIdentifier = "userIdentifier_example"; // String | Identifier of the user
String orgIdentifier = "orgIdentifier_example"; // String | Organization Identifier for the Entity
String projectIdentifier = "projectIdentifier_example"; // String | Project Identifier for the Entity
try {
    ResponseDTOUserGroup result = apiInstance.putMember(accountIdentifier, identifier, userIdentifier, orgIdentifier, projectIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserGroupApi#putMember");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountIdentifier** | **String**| Account Identifier for the Entity |
 **identifier** | **String**| Identifier of the user group |
 **userIdentifier** | **String**| Identifier of the user |
 **orgIdentifier** | **String**| Organization Identifier for the Entity | [optional]
 **projectIdentifier** | **String**| Project Identifier for the Entity | [optional]

### Return type

[**ResponseDTOUserGroup**](ResponseDTOUserGroup.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/yaml

<a name="putUserGroup"></a>
# **putUserGroup**
> ResponseDTOUserGroup putUserGroup(body, accountIdentifier, orgIdentifier, projectIdentifier)

Update a User Group in an account/org/project

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UserGroupApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

UserGroupApi apiInstance = new UserGroupApi();
UserGroup body = new UserGroup(); // UserGroup | User Group entity with the updates
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the Entity
String orgIdentifier = "orgIdentifier_example"; // String | Organization Identifier for the Entity
String projectIdentifier = "projectIdentifier_example"; // String | Project Identifier for the Entity
try {
    ResponseDTOUserGroup result = apiInstance.putUserGroup(body, accountIdentifier, orgIdentifier, projectIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserGroupApi#putUserGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**UserGroup**](UserGroup.md)| User Group entity with the updates |
 **accountIdentifier** | **String**| Account Identifier for the Entity |
 **orgIdentifier** | **String**| Organization Identifier for the Entity | [optional]
 **projectIdentifier** | **String**| Project Identifier for the Entity | [optional]

### Return type

[**ResponseDTOUserGroup**](ResponseDTOUserGroup.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json, application/yaml
 - **Accept**: application/json, application/yaml

<a name="unlinkUserGroupfromSSO"></a>
# **unlinkUserGroupfromSSO**
> RestResponseUserGroup unlinkUserGroupfromSSO(userGroupId, accountIdentifier, retainMembers, orgIdentifier, projectIdentifier)

Unlink SSO Group from the User Group in an account/org/project

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UserGroupApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

UserGroupApi apiInstance = new UserGroupApi();
String userGroupId = "userGroupId_example"; // String | Identifier of the user group
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the Entity
Boolean retainMembers = true; // Boolean | Retain currently synced members of the user group
String orgIdentifier = "orgIdentifier_example"; // String | Organization Identifier for the Entity
String projectIdentifier = "projectIdentifier_example"; // String | Project Identifier for the Entity
try {
    RestResponseUserGroup result = apiInstance.unlinkUserGroupfromSSO(userGroupId, accountIdentifier, retainMembers, orgIdentifier, projectIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserGroupApi#unlinkUserGroupfromSSO");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userGroupId** | **String**| Identifier of the user group |
 **accountIdentifier** | **String**| Account Identifier for the Entity |
 **retainMembers** | **Boolean**| Retain currently synced members of the user group | [optional]
 **orgIdentifier** | **String**| Organization Identifier for the Entity | [optional]
 **projectIdentifier** | **String**| Project Identifier for the Entity | [optional]

### Return type

[**RestResponseUserGroup**](RestResponseUserGroup.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/yaml

