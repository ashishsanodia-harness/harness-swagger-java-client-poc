# GitSyncErrorsApi

All URIs are relative to *https://app.harness.io/gateway*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getGitSyncErrorsCount**](GitSyncErrorsApi.md#getGitSyncErrorsCount) | **GET** /ng/api/git-sync-errors/count | Get Errors Count for the given scope, Repo and Branch
[**listGitSyncErrors**](GitSyncErrorsApi.md#listGitSyncErrors) | **GET** /ng/api/git-sync-errors | Lists Git to Harness Errors by file or connectivity errors for the given scope, Repo and Branch
[**listGitToHarnessErrorForCommit**](GitSyncErrorsApi.md#listGitToHarnessErrorForCommit) | **GET** /ng/api/git-sync-errors/commits/{commitId} | Lists Git to Harness Errors for the given Commit Id
[**listGitToHarnessErrorsGroupedByCommits**](GitSyncErrorsApi.md#listGitToHarnessErrorsGroupedByCommits) | **GET** /ng/api/git-sync-errors/aggregate | Lists Git to Harness Errors grouped by Commits for the given scope, Repo and Branch

<a name="getGitSyncErrorsCount"></a>
# **getGitSyncErrorsCount**
> ResponseDTOGitSyncErrorCount getGitSyncErrorsCount(accountIdentifier, orgIdentifier, projectIdentifier, searchTerm, branch, repoIdentifier, getDefaultFromOtherRepo)

Get Errors Count for the given scope, Repo and Branch

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.GitSyncErrorsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

GitSyncErrorsApi apiInstance = new GitSyncErrorsApi();
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the Entity
String orgIdentifier = "orgIdentifier_example"; // String | Organization Identifier for the Entity
String projectIdentifier = "projectIdentifier_example"; // String | Project Identifier for the Entity
String searchTerm = "searchTerm_example"; // String | Search Term
String branch = "branch_example"; // String | Branch Name
String repoIdentifier = "repoIdentifier_example"; // String | Git Sync Config Id
Boolean getDefaultFromOtherRepo = true; // Boolean | if true, return all the default entities
try {
    ResponseDTOGitSyncErrorCount result = apiInstance.getGitSyncErrorsCount(accountIdentifier, orgIdentifier, projectIdentifier, searchTerm, branch, repoIdentifier, getDefaultFromOtherRepo);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GitSyncErrorsApi#getGitSyncErrorsCount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountIdentifier** | **String**| Account Identifier for the Entity | [optional]
 **orgIdentifier** | **String**| Organization Identifier for the Entity | [optional]
 **projectIdentifier** | **String**| Project Identifier for the Entity | [optional]
 **searchTerm** | **String**| Search Term | [optional]
 **branch** | **String**| Branch Name | [optional]
 **repoIdentifier** | **String**| Git Sync Config Id | [optional]
 **getDefaultFromOtherRepo** | **Boolean**| if true, return all the default entities | [optional]

### Return type

[**ResponseDTOGitSyncErrorCount**](ResponseDTOGitSyncErrorCount.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/yaml, text/yaml, text/html

<a name="listGitSyncErrors"></a>
# **listGitSyncErrors**
> ResponseDTOPageResponseGitSyncError listGitSyncErrors(pageIndex, pageSize, sortOrders, accountIdentifier, orgIdentifier, projectIdentifier, searchTerm, branch, repoIdentifier, getDefaultFromOtherRepo, gitToHarness)

Lists Git to Harness Errors by file or connectivity errors for the given scope, Repo and Branch

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.GitSyncErrorsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

GitSyncErrorsApi apiInstance = new GitSyncErrorsApi();
Integer pageIndex = 0; // Integer | Indicates the number of pages. Results for these pages will be retrieved.
Integer pageSize = 50; // Integer | The number of the elements to fetch
List<SortOrder> sortOrders = Arrays.asList(new SortOrder()); // List<SortOrder> | Sort criteria for the elements.
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the Entity
String orgIdentifier = "orgIdentifier_example"; // String | Organization Identifier for the Entity
String projectIdentifier = "projectIdentifier_example"; // String | Project Identifier for the Entity
String searchTerm = "searchTerm_example"; // String | Search Term
String branch = "branch_example"; // String | Branch Name
String repoIdentifier = "repoIdentifier_example"; // String | Git Sync Config Id
Boolean getDefaultFromOtherRepo = true; // Boolean | if true, return all the default entities
Boolean gitToHarness = true; // Boolean | This specifies which errors to show - (Git to Harness or Connectivity), Put true to show Git to Harness Errors
try {
    ResponseDTOPageResponseGitSyncError result = apiInstance.listGitSyncErrors(pageIndex, pageSize, sortOrders, accountIdentifier, orgIdentifier, projectIdentifier, searchTerm, branch, repoIdentifier, getDefaultFromOtherRepo, gitToHarness);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GitSyncErrorsApi#listGitSyncErrors");
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
 **searchTerm** | **String**| Search Term | [optional]
 **branch** | **String**| Branch Name | [optional]
 **repoIdentifier** | **String**| Git Sync Config Id | [optional]
 **getDefaultFromOtherRepo** | **Boolean**| if true, return all the default entities | [optional]
 **gitToHarness** | **Boolean**| This specifies which errors to show - (Git to Harness or Connectivity), Put true to show Git to Harness Errors | [optional] [default to true]

### Return type

[**ResponseDTOPageResponseGitSyncError**](ResponseDTOPageResponseGitSyncError.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/yaml, text/yaml, text/html

<a name="listGitToHarnessErrorForCommit"></a>
# **listGitToHarnessErrorForCommit**
> ResponseDTOPageResponseGitSyncError listGitToHarnessErrorForCommit(commitId, pageIndex, pageSize, sortOrders, accountIdentifier, orgIdentifier, projectIdentifier, branch, repoIdentifier, getDefaultFromOtherRepo)

Lists Git to Harness Errors for the given Commit Id

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.GitSyncErrorsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

GitSyncErrorsApi apiInstance = new GitSyncErrorsApi();
String commitId = "commitId_example"; // String | Commit Id
Integer pageIndex = 0; // Integer | Indicates the number of pages. Results for these pages will be retrieved.
Integer pageSize = 50; // Integer | The number of the elements to fetch
List<SortOrder> sortOrders = Arrays.asList(new SortOrder()); // List<SortOrder> | Sort criteria for the elements.
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the Entity
String orgIdentifier = "orgIdentifier_example"; // String | Organization Identifier for the Entity
String projectIdentifier = "projectIdentifier_example"; // String | Project Identifier for the Entity
String branch = "branch_example"; // String | Branch Name
String repoIdentifier = "repoIdentifier_example"; // String | Git Sync Config Id
Boolean getDefaultFromOtherRepo = true; // Boolean | if true, return all the default entities
try {
    ResponseDTOPageResponseGitSyncError result = apiInstance.listGitToHarnessErrorForCommit(commitId, pageIndex, pageSize, sortOrders, accountIdentifier, orgIdentifier, projectIdentifier, branch, repoIdentifier, getDefaultFromOtherRepo);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GitSyncErrorsApi#listGitToHarnessErrorForCommit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **commitId** | **String**| Commit Id |
 **pageIndex** | **Integer**| Indicates the number of pages. Results for these pages will be retrieved. | [optional] [default to 0]
 **pageSize** | **Integer**| The number of the elements to fetch | [optional] [default to 50]
 **sortOrders** | [**List&lt;SortOrder&gt;**](SortOrder.md)| Sort criteria for the elements. | [optional]
 **accountIdentifier** | **String**| Account Identifier for the Entity | [optional]
 **orgIdentifier** | **String**| Organization Identifier for the Entity | [optional]
 **projectIdentifier** | **String**| Project Identifier for the Entity | [optional]
 **branch** | **String**| Branch Name | [optional]
 **repoIdentifier** | **String**| Git Sync Config Id | [optional]
 **getDefaultFromOtherRepo** | **Boolean**| if true, return all the default entities | [optional]

### Return type

[**ResponseDTOPageResponseGitSyncError**](ResponseDTOPageResponseGitSyncError.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/yaml, text/yaml, text/html

<a name="listGitToHarnessErrorsGroupedByCommits"></a>
# **listGitToHarnessErrorsGroupedByCommits**
> ResponseDTOPageResponseGitSyncErrorAggregateByCommit listGitToHarnessErrorsGroupedByCommits(pageIndex, pageSize, sortOrders, accountIdentifier, orgIdentifier, projectIdentifier, searchTerm, branch, repoIdentifier, getDefaultFromOtherRepo, numberOfErrorsInSummary)

Lists Git to Harness Errors grouped by Commits for the given scope, Repo and Branch

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.GitSyncErrorsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

GitSyncErrorsApi apiInstance = new GitSyncErrorsApi();
Integer pageIndex = 0; // Integer | Indicates the number of pages. Results for these pages will be retrieved.
Integer pageSize = 50; // Integer | The number of the elements to fetch
List<SortOrder> sortOrders = Arrays.asList(new SortOrder()); // List<SortOrder> | Sort criteria for the elements.
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the Entity
String orgIdentifier = "orgIdentifier_example"; // String | Organization Identifier for the Entity
String projectIdentifier = "projectIdentifier_example"; // String | Project Identifier for the Entity
String searchTerm = "searchTerm_example"; // String | Search Term
String branch = "branch_example"; // String | Branch Name
String repoIdentifier = "repoIdentifier_example"; // String | Git Sync Config Id
Boolean getDefaultFromOtherRepo = true; // Boolean | if true, return all the default entities
Integer numberOfErrorsInSummary = 5; // Integer | Number of errors that will be displayed in the summary
try {
    ResponseDTOPageResponseGitSyncErrorAggregateByCommit result = apiInstance.listGitToHarnessErrorsGroupedByCommits(pageIndex, pageSize, sortOrders, accountIdentifier, orgIdentifier, projectIdentifier, searchTerm, branch, repoIdentifier, getDefaultFromOtherRepo, numberOfErrorsInSummary);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GitSyncErrorsApi#listGitToHarnessErrorsGroupedByCommits");
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
 **searchTerm** | **String**| Search Term | [optional]
 **branch** | **String**| Branch Name | [optional]
 **repoIdentifier** | **String**| Git Sync Config Id | [optional]
 **getDefaultFromOtherRepo** | **Boolean**| if true, return all the default entities | [optional]
 **numberOfErrorsInSummary** | **Integer**| Number of errors that will be displayed in the summary | [optional] [default to 5]

### Return type

[**ResponseDTOPageResponseGitSyncErrorAggregateByCommit**](ResponseDTOPageResponseGitSyncErrorAggregateByCommit.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/yaml, text/yaml, text/html

