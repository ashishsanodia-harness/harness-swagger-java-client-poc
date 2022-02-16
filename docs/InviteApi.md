# InviteApi

All URIs are relative to *https://app.harness.io/gateway*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteInvite**](InviteApi.md#deleteInvite) | **DELETE** /ng/api/invites/{inviteId} | Delete an Invite by Identifier
[**getInvite**](InviteApi.md#getInvite) | **GET** /ng/api/invites/invite | Gets an Invite by either Invite Id or JwtToken
[**getInvites**](InviteApi.md#getInvites) | **GET** /ng/api/invites | List all the Invites for a Project or Organization
[**getPendingUsersAggregated**](InviteApi.md#getPendingUsersAggregated) | **POST** /ng/api/invites/aggregate | List of all the Invites pending users
[**sendInvite**](InviteApi.md#sendInvite) | **POST** /ng/api/invites | Send a user Invite to either Project or Organization (Deprecated). Please use the /user/users API to invite users
[**updateInvite**](InviteApi.md#updateInvite) | **PUT** /ng/api/invites/{inviteId} | Resend the Invite email

<a name="deleteInvite"></a>
# **deleteInvite**
> ResponseDTOOptionalInvite deleteInvite(inviteId)

Delete an Invite by Identifier

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.InviteApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

InviteApi apiInstance = new InviteApi();
String inviteId = "inviteId_example"; // String | Invite Id
try {
    ResponseDTOOptionalInvite result = apiInstance.deleteInvite(inviteId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InviteApi#deleteInvite");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inviteId** | **String**| Invite Id |

### Return type

[**ResponseDTOOptionalInvite**](ResponseDTOOptionalInvite.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/yaml

<a name="getInvite"></a>
# **getInvite**
> ResponseDTOInvite getInvite(inviteId, jwttoken)

Gets an Invite by either Invite Id or JwtToken

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.InviteApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

InviteApi apiInstance = new InviteApi();
String inviteId = "inviteId_example"; // String | Invitation Id
String jwttoken = "jwttoken_example"; // String | JWT Token
try {
    ResponseDTOInvite result = apiInstance.getInvite(inviteId, jwttoken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InviteApi#getInvite");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inviteId** | **String**| Invitation Id | [optional]
 **jwttoken** | **String**| JWT Token | [optional]

### Return type

[**ResponseDTOInvite**](ResponseDTOInvite.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/yaml, text/yaml

<a name="getInvites"></a>
# **getInvites**
> ResponseDTOPageResponseInvite getInvites(accountIdentifier, orgIdentifier, projectIdentifier, pageIndex, pageSize, sortOrders)

List all the Invites for a Project or Organization

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.InviteApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

InviteApi apiInstance = new InviteApi();
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the Entity
String orgIdentifier = "orgIdentifier_example"; // String | Organization Identifier for the Entity
String projectIdentifier = "projectIdentifier_example"; // String | Project Identifier for the Entity
Integer pageIndex = 0; // Integer | Indicates the number of pages. Results for these pages will be retrieved.
Integer pageSize = 50; // Integer | The number of the elements to fetch
List<SortOrder> sortOrders = Arrays.asList(new SortOrder()); // List<SortOrder> | Sort criteria for the elements.
try {
    ResponseDTOPageResponseInvite result = apiInstance.getInvites(accountIdentifier, orgIdentifier, projectIdentifier, pageIndex, pageSize, sortOrders);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InviteApi#getInvites");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountIdentifier** | **String**| Account Identifier for the Entity |
 **orgIdentifier** | **String**| Organization Identifier for the Entity | [optional]
 **projectIdentifier** | **String**| Project Identifier for the Entity | [optional]
 **pageIndex** | **Integer**| Indicates the number of pages. Results for these pages will be retrieved. | [optional] [default to 0]
 **pageSize** | **Integer**| The number of the elements to fetch | [optional] [default to 50]
 **sortOrders** | [**List&lt;SortOrder&gt;**](SortOrder.md)| Sort criteria for the elements. | [optional]

### Return type

[**ResponseDTOPageResponseInvite**](ResponseDTOPageResponseInvite.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/yaml, text/yaml

<a name="getPendingUsersAggregated"></a>
# **getPendingUsersAggregated**
> ResponseDTOPageResponseInvite getPendingUsersAggregated(accountIdentifier, body, orgIdentifier, projectIdentifier, searchTerm, pageIndex, pageSize, sortOrders)

List of all the Invites pending users

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.InviteApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

InviteApi apiInstance = new InviteApi();
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the Entity
ACLAggregateFilter body = new ACLAggregateFilter(); // ACLAggregateFilter | 
String orgIdentifier = "orgIdentifier_example"; // String | Organization Identifier for the Entity
String projectIdentifier = "projectIdentifier_example"; // String | Project Identifier for the Entity
String searchTerm = "searchTerm_example"; // String | Search term
Integer pageIndex = 0; // Integer | Indicates the number of pages. Results for these pages will be retrieved.
Integer pageSize = 50; // Integer | The number of the elements to fetch
List<SortOrder> sortOrders = Arrays.asList(new SortOrder()); // List<SortOrder> | Sort criteria for the elements.
try {
    ResponseDTOPageResponseInvite result = apiInstance.getPendingUsersAggregated(accountIdentifier, body, orgIdentifier, projectIdentifier, searchTerm, pageIndex, pageSize, sortOrders);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InviteApi#getPendingUsersAggregated");
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

[**ResponseDTOPageResponseInvite**](ResponseDTOPageResponseInvite.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json, text/yaml
 - **Accept**: application/json, application/yaml, text/yaml

<a name="sendInvite"></a>
# **sendInvite**
> ResponseDTOListInviteOperationResponse sendInvite(body, accountIdentifier, orgIdentifier, projectIdentifier)

Send a user Invite to either Project or Organization (Deprecated). Please use the /user/users API to invite users

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.InviteApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

InviteApi apiInstance = new InviteApi();
CreateInvite body = new CreateInvite(); // CreateInvite | Details of the Invite to create
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the Entity
String orgIdentifier = "orgIdentifier_example"; // String | Organization Identifier for the Entity
String projectIdentifier = "projectIdentifier_example"; // String | Project Identifier for the Entity
try {
    ResponseDTOListInviteOperationResponse result = apiInstance.sendInvite(body, accountIdentifier, orgIdentifier, projectIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InviteApi#sendInvite");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CreateInvite**](CreateInvite.md)| Details of the Invite to create |
 **accountIdentifier** | **String**| Account Identifier for the Entity |
 **orgIdentifier** | **String**| Organization Identifier for the Entity | [optional]
 **projectIdentifier** | **String**| Project Identifier for the Entity | [optional]

### Return type

[**ResponseDTOListInviteOperationResponse**](ResponseDTOListInviteOperationResponse.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json, text/yaml
 - **Accept**: application/json, application/yaml, text/yaml

<a name="updateInvite"></a>
# **updateInvite**
> ResponseDTOOptionalInvite updateInvite(body, accountIdentifier, inviteId)

Resend the Invite email

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.InviteApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

InviteApi apiInstance = new InviteApi();
Invite body = new Invite(); // Invite | Details of the Updated Invite
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the Entity
String inviteId = "inviteId_example"; // String | Invite id
try {
    ResponseDTOOptionalInvite result = apiInstance.updateInvite(body, accountIdentifier, inviteId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InviteApi#updateInvite");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Invite**](Invite.md)| Details of the Updated Invite |
 **accountIdentifier** | **String**| Account Identifier for the Entity |
 **inviteId** | **String**| Invite id |

### Return type

[**ResponseDTOOptionalInvite**](ResponseDTOOptionalInvite.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json, text/yaml
 - **Accept**: application/json, application/yaml, text/yaml

