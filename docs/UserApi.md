# UserApi

All URIs are relative to *https://app.harness.io/gateway*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addUsers**](UserApi.md#addUsers) | **POST** /ng/api/user/users | Add user(s) to given scope
[**changeUserPassword**](UserApi.md#changeUserPassword) | **PUT** /ng/api/user/password | Updates the User password
[**checkIfLastAdmin**](UserApi.md#checkIfLastAdmin) | **GET** /ng/api/user/last-admin | Boolean status whether the user is last admin at scope or not
[**disableTTwoFactorAuth**](UserApi.md#disableTTwoFactorAuth) | **PUT** /ng/api/user/disable-two-factor-auth | Disables two-factor-auth for an user in an account
[**enableTwoFactorAuth**](UserApi.md#enableTwoFactorAuth) | **PUT** /ng/api/user/enable-two-factor-auth | Enables two-factor-auth for an user in an account
[**getAccessibleProjectsCount**](UserApi.md#getAccessibleProjectsCount) | **GET** /ng/api/user/projects-count | Count of projects that are accessible to a user filtered by CreatedAt time
[**getAggregatedUser**](UserApi.md#getAggregatedUser) | **GET** /ng/api/user/aggregate/{userId} | Returns the user metadata along with rolesAssignments by userId and scope
[**getAggregatedUsers**](UserApi.md#getAggregatedUsers) | **POST** /ng/api/user/aggregate | List of all the user&#x27;s metadata along with rolesAssignments who have access to given scope
[**getCurrentGenUsers**](UserApi.md#getCurrentGenUsers) | **GET** /ng/api/user/currentgen | List of current gen users with the given Account Identifier
[**getCurrentUserInfo**](UserApi.md#getCurrentUserInfo) | **GET** /ng/api/user/currentUser | Gets current logged in User information
[**getTwoFactorAuthSettings**](UserApi.md#getTwoFactorAuthSettings) | **GET** /ng/api/user/two-factor-auth/{authMechanism} | Gets two factor authentication settings information of the current logged in user
[**getUserAllProjectsInfo**](UserApi.md#getUserAllProjectsInfo) | **GET** /ng/api/user/all-projects | list of project(s) of current user in the passed account Id in form of List
[**getUserProjectInfo**](UserApi.md#getUserProjectInfo) | **GET** /ng/api/user/projects | Retrieves the list of projects of the current user corresponding to the specified Account Identifier.
[**getUsers**](UserApi.md#getUsers) | **POST** /ng/api/user/batch | List of user&#x27;s Metadata for a given scope
[**removeUser**](UserApi.md#removeUser) | **DELETE** /ng/api/user/{userId} | Remove user as the collaborator from the scope
[**unlockUser**](UserApi.md#unlockUser) | **PUT** /ng/api/user/unlock-user/{userId} | unlock user in a given scope
[**updateUserInfo**](UserApi.md#updateUserInfo) | **PUT** /ng/api/user | Updates the User information

<a name="addUsers"></a>
# **addUsers**
> ResponseDTOAddUsersResponse addUsers(body, accountIdentifier, orgIdentifier, projectIdentifier)

Add user(s) to given scope

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

UserApi apiInstance = new UserApi();
AddUsersDTO body = new AddUsersDTO(); // AddUsersDTO | 
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the Entity
String orgIdentifier = "orgIdentifier_example"; // String | Organization Identifier for the Entity
String projectIdentifier = "projectIdentifier_example"; // String | Project Identifier for the Entity
try {
    ResponseDTOAddUsersResponse result = apiInstance.addUsers(body, accountIdentifier, orgIdentifier, projectIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#addUsers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AddUsersDTO**](AddUsersDTO.md)|  |
 **accountIdentifier** | **String**| Account Identifier for the Entity |
 **orgIdentifier** | **String**| Organization Identifier for the Entity | [optional]
 **projectIdentifier** | **String**| Project Identifier for the Entity | [optional]

### Return type

[**ResponseDTOAddUsersResponse**](ResponseDTOAddUsersResponse.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json, application/yaml
 - **Accept**: application/json, application/yaml

<a name="changeUserPassword"></a>
# **changeUserPassword**
> ResponseDTOPasswordChangeResponse changeUserPassword(body)

Updates the User password

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

UserApi apiInstance = new UserApi();
PasswordChange body = new PasswordChange(); // PasswordChange | 
try {
    ResponseDTOPasswordChangeResponse result = apiInstance.changeUserPassword(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#changeUserPassword");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PasswordChange**](PasswordChange.md)|  | [optional]

### Return type

[**ResponseDTOPasswordChangeResponse**](ResponseDTOPasswordChangeResponse.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json, application/yaml
 - **Accept**: application/json, application/yaml

<a name="checkIfLastAdmin"></a>
# **checkIfLastAdmin**
> ResponseDTOBoolean checkIfLastAdmin(accountIdentifier, userId, orgIdentifier, projectIdentifier)

Boolean status whether the user is last admin at scope or not

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

UserApi apiInstance = new UserApi();
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the Entity
String userId = "userId_example"; // String | User identifier
String orgIdentifier = "orgIdentifier_example"; // String | Organization Identifier for the Entity
String projectIdentifier = "projectIdentifier_example"; // String | Project Identifier for the Entity
try {
    ResponseDTOBoolean result = apiInstance.checkIfLastAdmin(accountIdentifier, userId, orgIdentifier, projectIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#checkIfLastAdmin");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountIdentifier** | **String**| Account Identifier for the Entity |
 **userId** | **String**| User identifier | [optional]
 **orgIdentifier** | **String**| Organization Identifier for the Entity | [optional]
 **projectIdentifier** | **String**| Project Identifier for the Entity | [optional]

### Return type

[**ResponseDTOBoolean**](ResponseDTOBoolean.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/yaml

<a name="disableTTwoFactorAuth"></a>
# **disableTTwoFactorAuth**
> ResponseDTOUserInfo disableTTwoFactorAuth(routingId)

Disables two-factor-auth for an user in an account

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

UserApi apiInstance = new UserApi();
String routingId = "routingId_example"; // String | Account Identifier for the Entity
try {
    ResponseDTOUserInfo result = apiInstance.disableTTwoFactorAuth(routingId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#disableTTwoFactorAuth");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **routingId** | **String**| Account Identifier for the Entity | [optional]

### Return type

[**ResponseDTOUserInfo**](ResponseDTOUserInfo.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/yaml

<a name="enableTwoFactorAuth"></a>
# **enableTwoFactorAuth**
> ResponseDTOUserInfo enableTwoFactorAuth(body, routingId)

Enables two-factor-auth for an user in an account

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

UserApi apiInstance = new UserApi();
TwoFactorAuthSettingsInfo body = new TwoFactorAuthSettingsInfo(); // TwoFactorAuthSettingsInfo | 
String routingId = "routingId_example"; // String | Account Identifier for the Entity
try {
    ResponseDTOUserInfo result = apiInstance.enableTwoFactorAuth(body, routingId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#enableTwoFactorAuth");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**TwoFactorAuthSettingsInfo**](TwoFactorAuthSettingsInfo.md)|  | [optional]
 **routingId** | **String**| Account Identifier for the Entity | [optional]

### Return type

[**ResponseDTOUserInfo**](ResponseDTOUserInfo.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json, application/yaml
 - **Accept**: application/json, application/yaml

<a name="getAccessibleProjectsCount"></a>
# **getAccessibleProjectsCount**
> ResponseDTOActiveProjectsCount getAccessibleProjectsCount(accountIdentifier, userId, startTime, endTime)

Count of projects that are accessible to a user filtered by CreatedAt time

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

UserApi apiInstance = new UserApi();
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the Entity
String userId = "userId_example"; // String | user Identifier
Long startTime = 789L; // Long | Start time to Filter projects by CreatedAt time
Long endTime = 789L; // Long | End time to Filter projects by CreatedAt time
try {
    ResponseDTOActiveProjectsCount result = apiInstance.getAccessibleProjectsCount(accountIdentifier, userId, startTime, endTime);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#getAccessibleProjectsCount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountIdentifier** | **String**| Account Identifier for the Entity | [optional]
 **userId** | **String**| user Identifier | [optional]
 **startTime** | **Long**| Start time to Filter projects by CreatedAt time | [optional]
 **endTime** | **Long**| End time to Filter projects by CreatedAt time | [optional]

### Return type

[**ResponseDTOActiveProjectsCount**](ResponseDTOActiveProjectsCount.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/yaml

<a name="getAggregatedUser"></a>
# **getAggregatedUser**
> ResponseDTOUserAggregate getAggregatedUser(userId, accountIdentifier, orgIdentifier, projectIdentifier)

Returns the user metadata along with rolesAssignments by userId and scope

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

UserApi apiInstance = new UserApi();
String userId = "userId_example"; // String | user Identifier
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the Entity
String orgIdentifier = "orgIdentifier_example"; // String | Organization Identifier for the Entity
String projectIdentifier = "projectIdentifier_example"; // String | Project Identifier for the Entity
try {
    ResponseDTOUserAggregate result = apiInstance.getAggregatedUser(userId, accountIdentifier, orgIdentifier, projectIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#getAggregatedUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| user Identifier |
 **accountIdentifier** | **String**| Account Identifier for the Entity |
 **orgIdentifier** | **String**| Organization Identifier for the Entity | [optional]
 **projectIdentifier** | **String**| Project Identifier for the Entity | [optional]

### Return type

[**ResponseDTOUserAggregate**](ResponseDTOUserAggregate.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/yaml

<a name="getAggregatedUsers"></a>
# **getAggregatedUsers**
> ResponseDTOPageResponseUserAggregate getAggregatedUsers(accountIdentifier, body, orgIdentifier, projectIdentifier, searchTerm, pageIndex, pageSize, sortOrders)

List of all the user&#x27;s metadata along with rolesAssignments who have access to given scope

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

UserApi apiInstance = new UserApi();
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the Entity
ACLAggregateFilter body = new ACLAggregateFilter(); // ACLAggregateFilter | 
String orgIdentifier = "orgIdentifier_example"; // String | Organization Identifier for the Entity
String projectIdentifier = "projectIdentifier_example"; // String | Project Identifier for the Entity
String searchTerm = "searchTerm_example"; // String | Search term
Integer pageIndex = 0; // Integer | Indicates the number of pages. Results for these pages will be retrieved.
Integer pageSize = 50; // Integer | The number of the elements to fetch
List<SortOrder> sortOrders = Arrays.asList(new SortOrder()); // List<SortOrder> | Sort criteria for the elements.
try {
    ResponseDTOPageResponseUserAggregate result = apiInstance.getAggregatedUsers(accountIdentifier, body, orgIdentifier, projectIdentifier, searchTerm, pageIndex, pageSize, sortOrders);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#getAggregatedUsers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountIdentifier** | **String**| Account Identifier for the Entity |
 **body** | [**ACLAggregateFilter**](ACLAggregateFilter.md)|  | [optional]
 **orgIdentifier** | **String**| Organization Identifier for the Entity | [optional]
 **projectIdentifier** | **String**| Project Identifier for the Entity | [optional]
 **searchTerm** | **String**| Search term | [optional]
 **pageIndex** | **Integer**| Indicates the number of pages. Results for these pages will be retrieved. | [optional] [default to 0]
 **pageSize** | **Integer**| The number of the elements to fetch | [optional] [default to 50]
 **sortOrders** | [**List&lt;SortOrder&gt;**](SortOrder.md)| Sort criteria for the elements. | [optional]

### Return type

[**ResponseDTOPageResponseUserAggregate**](ResponseDTOPageResponseUserAggregate.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json, application/yaml
 - **Accept**: application/json, application/yaml

<a name="getCurrentGenUsers"></a>
# **getCurrentGenUsers**
> ResponseDTOPageResponseUserMetadata getCurrentGenUsers(accountIdentifier, searchString, pageIndex, pageSize, sortOrders)

List of current gen users with the given Account Identifier

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

UserApi apiInstance = new UserApi();
String accountIdentifier = "accountIdentifier_example"; // String | This is the Account Identifier. Users corresponding to this Account will be retrieved.
String searchString = ""; // String | This string will be used to filter the search results. Details of all the users having this string in their name or email address will be filtered.
Integer pageIndex = 0; // Integer | Indicates the number of pages. Results for these pages will be retrieved.
Integer pageSize = 50; // Integer | The number of the elements to fetch
List<SortOrder> sortOrders = Arrays.asList(new SortOrder()); // List<SortOrder> | Sort criteria for the elements.
try {
    ResponseDTOPageResponseUserMetadata result = apiInstance.getCurrentGenUsers(accountIdentifier, searchString, pageIndex, pageSize, sortOrders);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#getCurrentGenUsers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountIdentifier** | **String**| This is the Account Identifier. Users corresponding to this Account will be retrieved. |
 **searchString** | **String**| This string will be used to filter the search results. Details of all the users having this string in their name or email address will be filtered. | [optional]
 **pageIndex** | **Integer**| Indicates the number of pages. Results for these pages will be retrieved. | [optional] [default to 0]
 **pageSize** | **Integer**| The number of the elements to fetch | [optional] [default to 50]
 **sortOrders** | [**List&lt;SortOrder&gt;**](SortOrder.md)| Sort criteria for the elements. | [optional]

### Return type

[**ResponseDTOPageResponseUserMetadata**](ResponseDTOPageResponseUserMetadata.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/yaml

<a name="getCurrentUserInfo"></a>
# **getCurrentUserInfo**
> ResponseDTOUserInfo getCurrentUserInfo(accountIdentifier)

Gets current logged in User information

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

UserApi apiInstance = new UserApi();
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier
try {
    ResponseDTOUserInfo result = apiInstance.getCurrentUserInfo(accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#getCurrentUserInfo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountIdentifier** | **String**| Account Identifier |

### Return type

[**ResponseDTOUserInfo**](ResponseDTOUserInfo.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/yaml

<a name="getTwoFactorAuthSettings"></a>
# **getTwoFactorAuthSettings**
> ResponseDTOTwoFactorAuthSettingsInfo getTwoFactorAuthSettings(authMechanism)

Gets two factor authentication settings information of the current logged in user

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

UserApi apiInstance = new UserApi();
String authMechanism = "authMechanism_example"; // String | This is the authentication mechanism for the logged-in User. Two-Factor Authentication settings will be fetched for this mechanism.
try {
    ResponseDTOTwoFactorAuthSettingsInfo result = apiInstance.getTwoFactorAuthSettings(authMechanism);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#getTwoFactorAuthSettings");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authMechanism** | **String**| This is the authentication mechanism for the logged-in User. Two-Factor Authentication settings will be fetched for this mechanism. | [enum: TOTP]

### Return type

[**ResponseDTOTwoFactorAuthSettingsInfo**](ResponseDTOTwoFactorAuthSettingsInfo.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/yaml

<a name="getUserAllProjectsInfo"></a>
# **getUserAllProjectsInfo**
> ResponseDTOListProject getUserAllProjectsInfo(accountId, userId)

list of project(s) of current user in the passed account Id in form of List

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

UserApi apiInstance = new UserApi();
String accountId = "accountId_example"; // String | Account Identifier for the Entity
String userId = "userId_example"; // String | User Identifier
try {
    ResponseDTOListProject result = apiInstance.getUserAllProjectsInfo(accountId, userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#getUserAllProjectsInfo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **String**| Account Identifier for the Entity | [optional]
 **userId** | **String**| User Identifier | [optional]

### Return type

[**ResponseDTOListProject**](ResponseDTOListProject.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/yaml

<a name="getUserProjectInfo"></a>
# **getUserProjectInfo**
> ResponseDTOPageResponseProject getUserProjectInfo(accountId, pageIndex, pageSize, sortOrders)

Retrieves the list of projects of the current user corresponding to the specified Account Identifier.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

UserApi apiInstance = new UserApi();
String accountId = "accountId_example"; // String | This is the Account Identifier. Details of all the Projects within the scope of this Account will be fetched.
Integer pageIndex = 0; // Integer | Indicates the number of pages. Results for these pages will be retrieved.
Integer pageSize = 50; // Integer | The number of the elements to fetch
List<SortOrder> sortOrders = Arrays.asList(new SortOrder()); // List<SortOrder> | Sort criteria for the elements.
try {
    ResponseDTOPageResponseProject result = apiInstance.getUserProjectInfo(accountId, pageIndex, pageSize, sortOrders);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#getUserProjectInfo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **String**| This is the Account Identifier. Details of all the Projects within the scope of this Account will be fetched. | [optional]
 **pageIndex** | **Integer**| Indicates the number of pages. Results for these pages will be retrieved. | [optional] [default to 0]
 **pageSize** | **Integer**| The number of the elements to fetch | [optional] [default to 50]
 **sortOrders** | [**List&lt;SortOrder&gt;**](SortOrder.md)| Sort criteria for the elements. | [optional]

### Return type

[**ResponseDTOPageResponseProject**](ResponseDTOPageResponseProject.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/yaml

<a name="getUsers"></a>
# **getUsers**
> ResponseDTOPageResponseUserMetadata getUsers(accountIdentifier, body, orgIdentifier, projectIdentifier, pageIndex, pageSize, sortOrders)

List of user&#x27;s Metadata for a given scope

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

UserApi apiInstance = new UserApi();
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the Entity
UserFilter body = new UserFilter(); // UserFilter | 
String orgIdentifier = "orgIdentifier_example"; // String | Organization Identifier for the Entity
String projectIdentifier = "projectIdentifier_example"; // String | Project Identifier for the Entity
Integer pageIndex = 0; // Integer | Indicates the number of pages. Results for these pages will be retrieved.
Integer pageSize = 50; // Integer | The number of the elements to fetch
List<SortOrder> sortOrders = Arrays.asList(new SortOrder()); // List<SortOrder> | Sort criteria for the elements.
try {
    ResponseDTOPageResponseUserMetadata result = apiInstance.getUsers(accountIdentifier, body, orgIdentifier, projectIdentifier, pageIndex, pageSize, sortOrders);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#getUsers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountIdentifier** | **String**| Account Identifier for the Entity |
 **body** | [**UserFilter**](UserFilter.md)|  | [optional]
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

<a name="removeUser"></a>
# **removeUser**
> ResponseDTOBoolean removeUser(userId, accountIdentifier, orgIdentifier, projectIdentifier)

Remove user as the collaborator from the scope

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

UserApi apiInstance = new UserApi();
String userId = "userId_example"; // String | user Identifier
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the Entity
String orgIdentifier = "orgIdentifier_example"; // String | Organization Identifier for the Entity
String projectIdentifier = "projectIdentifier_example"; // String | Project Identifier for the Entity
try {
    ResponseDTOBoolean result = apiInstance.removeUser(userId, accountIdentifier, orgIdentifier, projectIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#removeUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| user Identifier |
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

<a name="unlockUser"></a>
# **unlockUser**
> ResponseDTOUserInfo unlockUser(userId, accountIdentifier, orgIdentifier, projectIdentifier)

unlock user in a given scope

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

UserApi apiInstance = new UserApi();
String userId = "userId_example"; // String | user Identifier
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the Entity
String orgIdentifier = "orgIdentifier_example"; // String | Organization Identifier for the Entity
String projectIdentifier = "projectIdentifier_example"; // String | Project Identifier for the Entity
try {
    ResponseDTOUserInfo result = apiInstance.unlockUser(userId, accountIdentifier, orgIdentifier, projectIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#unlockUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| user Identifier |
 **accountIdentifier** | **String**| Account Identifier for the Entity |
 **orgIdentifier** | **String**| Organization Identifier for the Entity | [optional]
 **projectIdentifier** | **String**| Project Identifier for the Entity | [optional]

### Return type

[**ResponseDTOUserInfo**](ResponseDTOUserInfo.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/yaml

<a name="updateUserInfo"></a>
# **updateUserInfo**
> ResponseDTOUserInfo updateUserInfo(body)

Updates the User information

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

UserApi apiInstance = new UserApi();
UserInfo body = new UserInfo(); // UserInfo | 
try {
    ResponseDTOUserInfo result = apiInstance.updateUserInfo(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#updateUserInfo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**UserInfo**](UserInfo.md)|  | [optional]

### Return type

[**ResponseDTOUserInfo**](ResponseDTOUserInfo.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json, application/yaml
 - **Accept**: application/json, application/yaml

