# GitBranchesApi

All URIs are relative to *https://app.harness.io/gateway*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getListOfBranchesWithStatus**](GitBranchesApi.md#getListOfBranchesWithStatus) | **GET** /ng/api/git-sync-branch/listBranchesWithStatus | Lists branches with their status(Synced, Unsynced) by Git Sync Config Id for the given scope
[**syncGitBranch**](GitBranchesApi.md#syncGitBranch) | **POST** /ng/api/git-sync-branch/sync | Sync the content of new Git Branch into harness with Git Sync Config Id

<a name="getListOfBranchesWithStatus"></a>
# **getListOfBranchesWithStatus**
> ResponseDTOGitBranchList getListOfBranchesWithStatus(yamlGitConfigIdentifier, accountIdentifier, orgIdentifier, projectIdentifier, page, size, searchTerm, branchSyncStatus)

Lists branches with their status(Synced, Unsynced) by Git Sync Config Id for the given scope

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.GitBranchesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

GitBranchesApi apiInstance = new GitBranchesApi();
String yamlGitConfigIdentifier = "yamlGitConfigIdentifier_example"; // String | Git Sync Config Id
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the Entity
String orgIdentifier = "orgIdentifier_example"; // String | Organization Identifier for the Entity
String projectIdentifier = "projectIdentifier_example"; // String | Project Identifier for the Entity
Integer page = 0; // Integer | Indicates the number of pages. Results for these pages will be retrieved.
Integer size = 56; // Integer | The number of the elements to fetch
String searchTerm = ""; // String | Search Term
String branchSyncStatus = "branchSyncStatus_example"; // String | Used to filter out Synced and Unsynced branches
try {
    ResponseDTOGitBranchList result = apiInstance.getListOfBranchesWithStatus(yamlGitConfigIdentifier, accountIdentifier, orgIdentifier, projectIdentifier, page, size, searchTerm, branchSyncStatus);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GitBranchesApi#getListOfBranchesWithStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **yamlGitConfigIdentifier** | **String**| Git Sync Config Id |
 **accountIdentifier** | **String**| Account Identifier for the Entity | [optional]
 **orgIdentifier** | **String**| Organization Identifier for the Entity | [optional]
 **projectIdentifier** | **String**| Project Identifier for the Entity | [optional]
 **page** | **Integer**| Indicates the number of pages. Results for these pages will be retrieved. | [optional] [default to 0]
 **size** | **Integer**| The number of the elements to fetch | [optional]
 **searchTerm** | **String**| Search Term | [optional]
 **branchSyncStatus** | **String**| Used to filter out Synced and Unsynced branches | [optional] [enum: SYNCED, SYNCING, UNSYNCED]

### Return type

[**ResponseDTOGitBranchList**](ResponseDTOGitBranchList.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/yaml, text/yaml, text/html

<a name="syncGitBranch"></a>
# **syncGitBranch**
> ResponseDTOBoolean syncGitBranch(repoIdentifier, accountIdentifier, orgIdentifier, projectIdentifier, branch)

Sync the content of new Git Branch into harness with Git Sync Config Id

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.GitBranchesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

GitBranchesApi apiInstance = new GitBranchesApi();
String repoIdentifier = "repoIdentifier_example"; // String | Git Sync Config Id
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the Entity
String orgIdentifier = "orgIdentifier_example"; // String | Organization Identifier for the Entity
String projectIdentifier = "projectIdentifier_example"; // String | Project Identifier for the Entity
String branch = "branch_example"; // String | Branch Name
try {
    ResponseDTOBoolean result = apiInstance.syncGitBranch(repoIdentifier, accountIdentifier, orgIdentifier, projectIdentifier, branch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GitBranchesApi#syncGitBranch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repoIdentifier** | **String**| Git Sync Config Id |
 **accountIdentifier** | **String**| Account Identifier for the Entity | [optional]
 **orgIdentifier** | **String**| Organization Identifier for the Entity | [optional]
 **projectIdentifier** | **String**| Project Identifier for the Entity | [optional]
 **branch** | **String**| Branch Name | [optional]

### Return type

[**ResponseDTOBoolean**](ResponseDTOBoolean.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/yaml, text/yaml, text/html

