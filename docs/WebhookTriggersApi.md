# WebhookTriggersApi

All URIs are relative to *https://app.harness.io/gateway*

Method | HTTP request | Description
------------- | ------------- | -------------
[**fetchWebhookDetails**](WebhookTriggersApi.md#fetchWebhookDetails) | **GET** /pipeline/api/webhook/triggerProcessingDetails | Gets webhook event processing details for input eventId.
[**getActionsList**](WebhookTriggersApi.md#getActionsList) | **GET** /pipeline/api/webhook/actions | Get all supported actions for event type and source.
[**getBitbucketPRActions**](WebhookTriggersApi.md#getBitbucketPRActions) | **GET** /pipeline/api/webhook/bitbucketPRActions | Gets all supported Bitbucket PR event actions.
[**getBitbucketTriggerEvents**](WebhookTriggersApi.md#getBitbucketTriggerEvents) | **GET** /pipeline/api/webhook/bitbucketTriggerEvents | Gets all supported Bitbucket trigger events.
[**getGitTriggerEventDetails**](WebhookTriggersApi.md#getGitTriggerEventDetails) | **GET** /pipeline/api/webhook/gitTriggerEventDetails | Gets trigger git actions for each supported event.
[**getGithubIssueCommentActions**](WebhookTriggersApi.md#getGithubIssueCommentActions) | **GET** /pipeline/api/webhook/githubIssueCommentActions | Gets all supported Github Issue comment event actions
[**getGithubPRActions**](WebhookTriggersApi.md#getGithubPRActions) | **GET** /pipeline/api/webhook/githubPRActions | Gets all supported Github PR event actions
[**getGithubTriggerEvents**](WebhookTriggersApi.md#getGithubTriggerEvents) | **GET** /pipeline/api/webhook/githubTriggerEvents | Gets all supported Github trigger events.
[**getGitlabPRActions**](WebhookTriggersApi.md#getGitlabPRActions) | **GET** /pipeline/api/webhook/gitlabPRActions | Gets all supported GitLab PR event actions.
[**getGitlabTriggerEvents**](WebhookTriggersApi.md#getGitlabTriggerEvents) | **GET** /pipeline/api/webhook/gitlabTriggerEvents | Gets all supported Gitlab trigger events.
[**getSourceRepos**](WebhookTriggersApi.md#getSourceRepos) | **GET** /pipeline/api/webhook/sourceRepos | Gets source repo types with all supported events.
[**getWebhookTriggerTypes**](WebhookTriggersApi.md#getWebhookTriggerTypes) | **GET** /pipeline/api/webhook/webhookTriggerTypes | Gets all supported scm webhook type.
[**pipelineprocessWebhookEvent**](WebhookTriggersApi.md#pipelineprocessWebhookEvent) | **POST** /pipeline/api/webhook/trigger | Handles event payload for webhook triggers.
[**processCustomWebhookEvent**](WebhookTriggersApi.md#processCustomWebhookEvent) | **POST** /pipeline/api/webhook/custom | Handles event payload for custom webhook triggers.

<a name="fetchWebhookDetails"></a>
# **fetchWebhookDetails**
> ResponseDTOWebhookEventProcessingDetails fetchWebhookDetails(accountIdentifier, eventId)

Gets webhook event processing details for input eventId.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.WebhookTriggersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

WebhookTriggersApi apiInstance = new WebhookTriggersApi();
String accountIdentifier = "accountIdentifier_example"; // String | 
String eventId = "eventId_example"; // String | 
try {
    ResponseDTOWebhookEventProcessingDetails result = apiInstance.fetchWebhookDetails(accountIdentifier, eventId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebhookTriggersApi#fetchWebhookDetails");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountIdentifier** | **String**|  |
 **eventId** | **String**|  |

### Return type

[**ResponseDTOWebhookEventProcessingDetails**](ResponseDTOWebhookEventProcessingDetails.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/yaml, text/plain

<a name="getActionsList"></a>
# **getActionsList**
> ResponseDTOListWebhookAction getActionsList(sourceRepo, event)

Get all supported actions for event type and source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.WebhookTriggersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

WebhookTriggersApi apiInstance = new WebhookTriggersApi();
String sourceRepo = "sourceRepo_example"; // String | 
String event = "event_example"; // String | 
try {
    ResponseDTOListWebhookAction result = apiInstance.getActionsList(sourceRepo, event);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebhookTriggersApi#getActionsList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sourceRepo** | **String**|  | [enum: GITHUB, GITLAB, BITBUCKET, AWS_CODECOMMIT, CUSTOM]
 **event** | **String**|  |

### Return type

[**ResponseDTOListWebhookAction**](ResponseDTOListWebhookAction.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/yaml, text/plain

<a name="getBitbucketPRActions"></a>
# **getBitbucketPRActions**
> ResponseDTOListBitbucketPRAction getBitbucketPRActions()

Gets all supported Bitbucket PR event actions.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.WebhookTriggersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

WebhookTriggersApi apiInstance = new WebhookTriggersApi();
try {
    ResponseDTOListBitbucketPRAction result = apiInstance.getBitbucketPRActions();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebhookTriggersApi#getBitbucketPRActions");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ResponseDTOListBitbucketPRAction**](ResponseDTOListBitbucketPRAction.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/yaml, text/plain

<a name="getBitbucketTriggerEvents"></a>
# **getBitbucketTriggerEvents**
> ResponseDTOListBitbucketTriggerEvent getBitbucketTriggerEvents()

Gets all supported Bitbucket trigger events.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.WebhookTriggersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

WebhookTriggersApi apiInstance = new WebhookTriggersApi();
try {
    ResponseDTOListBitbucketTriggerEvent result = apiInstance.getBitbucketTriggerEvents();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebhookTriggersApi#getBitbucketTriggerEvents");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ResponseDTOListBitbucketTriggerEvent**](ResponseDTOListBitbucketTriggerEvent.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/yaml, text/plain

<a name="getGitTriggerEventDetails"></a>
# **getGitTriggerEventDetails**
> ResponseDTOMapStringMapStringListString getGitTriggerEventDetails()

Gets trigger git actions for each supported event.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.WebhookTriggersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

WebhookTriggersApi apiInstance = new WebhookTriggersApi();
try {
    ResponseDTOMapStringMapStringListString result = apiInstance.getGitTriggerEventDetails();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebhookTriggersApi#getGitTriggerEventDetails");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ResponseDTOMapStringMapStringListString**](ResponseDTOMapStringMapStringListString.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/yaml, text/plain

<a name="getGithubIssueCommentActions"></a>
# **getGithubIssueCommentActions**
> ResponseDTOListGithubIssueCommentAction getGithubIssueCommentActions()

Gets all supported Github Issue comment event actions

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.WebhookTriggersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

WebhookTriggersApi apiInstance = new WebhookTriggersApi();
try {
    ResponseDTOListGithubIssueCommentAction result = apiInstance.getGithubIssueCommentActions();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebhookTriggersApi#getGithubIssueCommentActions");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ResponseDTOListGithubIssueCommentAction**](ResponseDTOListGithubIssueCommentAction.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/yaml, text/plain

<a name="getGithubPRActions"></a>
# **getGithubPRActions**
> ResponseDTOListGithubPRAction getGithubPRActions()

Gets all supported Github PR event actions

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.WebhookTriggersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

WebhookTriggersApi apiInstance = new WebhookTriggersApi();
try {
    ResponseDTOListGithubPRAction result = apiInstance.getGithubPRActions();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebhookTriggersApi#getGithubPRActions");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ResponseDTOListGithubPRAction**](ResponseDTOListGithubPRAction.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/yaml, text/plain

<a name="getGithubTriggerEvents"></a>
# **getGithubTriggerEvents**
> ResponseDTOListGithubTriggerEvent getGithubTriggerEvents()

Gets all supported Github trigger events.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.WebhookTriggersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

WebhookTriggersApi apiInstance = new WebhookTriggersApi();
try {
    ResponseDTOListGithubTriggerEvent result = apiInstance.getGithubTriggerEvents();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebhookTriggersApi#getGithubTriggerEvents");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ResponseDTOListGithubTriggerEvent**](ResponseDTOListGithubTriggerEvent.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/yaml, text/plain

<a name="getGitlabPRActions"></a>
# **getGitlabPRActions**
> ResponseDTOListGitlabPRAction getGitlabPRActions()

Gets all supported GitLab PR event actions.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.WebhookTriggersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

WebhookTriggersApi apiInstance = new WebhookTriggersApi();
try {
    ResponseDTOListGitlabPRAction result = apiInstance.getGitlabPRActions();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebhookTriggersApi#getGitlabPRActions");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ResponseDTOListGitlabPRAction**](ResponseDTOListGitlabPRAction.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/yaml, text/plain

<a name="getGitlabTriggerEvents"></a>
# **getGitlabTriggerEvents**
> ResponseDTOListGitlabTriggerEvent getGitlabTriggerEvents()

Gets all supported Gitlab trigger events.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.WebhookTriggersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

WebhookTriggersApi apiInstance = new WebhookTriggersApi();
try {
    ResponseDTOListGitlabTriggerEvent result = apiInstance.getGitlabTriggerEvents();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebhookTriggersApi#getGitlabTriggerEvents");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ResponseDTOListGitlabTriggerEvent**](ResponseDTOListGitlabTriggerEvent.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/yaml, text/plain

<a name="getSourceRepos"></a>
# **getSourceRepos**
> ResponseDTOMapWebhookSourceRepoListWebhookEvent getSourceRepos()

Gets source repo types with all supported events.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.WebhookTriggersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

WebhookTriggersApi apiInstance = new WebhookTriggersApi();
try {
    ResponseDTOMapWebhookSourceRepoListWebhookEvent result = apiInstance.getSourceRepos();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebhookTriggersApi#getSourceRepos");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ResponseDTOMapWebhookSourceRepoListWebhookEvent**](ResponseDTOMapWebhookSourceRepoListWebhookEvent.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/yaml, text/plain

<a name="getWebhookTriggerTypes"></a>
# **getWebhookTriggerTypes**
> ResponseDTOListWebhookTriggerType getWebhookTriggerTypes()

Gets all supported scm webhook type.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.WebhookTriggersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

WebhookTriggersApi apiInstance = new WebhookTriggersApi();
try {
    ResponseDTOListWebhookTriggerType result = apiInstance.getWebhookTriggerTypes();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebhookTriggersApi#getWebhookTriggerTypes");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ResponseDTOListWebhookTriggerType**](ResponseDTOListWebhookTriggerType.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/yaml, text/plain

<a name="pipelineprocessWebhookEvent"></a>
# **pipelineprocessWebhookEvent**
> ResponseDTOString pipelineprocessWebhookEvent(body, accountIdentifier, orgIdentifier, projectIdentifier)

Handles event payload for webhook triggers.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.WebhookTriggersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

WebhookTriggersApi apiInstance = new WebhookTriggersApi();
String body = "body_example"; // String | 
String accountIdentifier = "accountIdentifier_example"; // String | 
String orgIdentifier = "orgIdentifier_example"; // String | 
String projectIdentifier = "projectIdentifier_example"; // String | 
try {
    ResponseDTOString result = apiInstance.pipelineprocessWebhookEvent(body, accountIdentifier, orgIdentifier, projectIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebhookTriggersApi#pipelineprocessWebhookEvent");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**String**](String.md)|  |
 **accountIdentifier** | **String**|  |
 **orgIdentifier** | **String**|  | [optional]
 **projectIdentifier** | **String**|  | [optional]

### Return type

[**ResponseDTOString**](ResponseDTOString.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json, application/yaml, text/plain
 - **Accept**: application/json, application/yaml, text/plain

<a name="processCustomWebhookEvent"></a>
# **processCustomWebhookEvent**
> ResponseDTOString processCustomWebhookEvent(body, accountIdentifier, orgIdentifier, projectIdentifier, pipelineIdentifier, triggerIdentifier)

Handles event payload for custom webhook triggers.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.WebhookTriggersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

WebhookTriggersApi apiInstance = new WebhookTriggersApi();
String body = "body_example"; // String | 
String accountIdentifier = "accountIdentifier_example"; // String | 
String orgIdentifier = "orgIdentifier_example"; // String | 
String projectIdentifier = "projectIdentifier_example"; // String | 
String pipelineIdentifier = "pipelineIdentifier_example"; // String | 
String triggerIdentifier = "triggerIdentifier_example"; // String | 
try {
    ResponseDTOString result = apiInstance.processCustomWebhookEvent(body, accountIdentifier, orgIdentifier, projectIdentifier, pipelineIdentifier, triggerIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebhookTriggersApi#processCustomWebhookEvent");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**String**](String.md)|  |
 **accountIdentifier** | **String**|  |
 **orgIdentifier** | **String**|  |
 **projectIdentifier** | **String**|  |
 **pipelineIdentifier** | **String**|  | [optional]
 **triggerIdentifier** | **String**|  | [optional]

### Return type

[**ResponseDTOString**](ResponseDTOString.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json, application/yaml, text/plain
 - **Accept**: application/json, application/yaml, text/plain

