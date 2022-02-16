# ConnectorsApi

All URIs are relative to *https://app.harness.io/gateway*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createConnector**](ConnectorsApi.md#createConnector) | **POST** /ng/api/connectors | Creates a Connector
[**deleteConnector**](ConnectorsApi.md#deleteConnector) | **DELETE** /ng/api/connectors/{identifier} | Deletes Connector by ID
[**getAllAllowedFieldValues**](ConnectorsApi.md#getAllAllowedFieldValues) | **GET** /ng/api/connectors/fieldValues | Get the allowed field values by Connector Type
[**getCEAwsTemplate**](ConnectorsApi.md#getCEAwsTemplate) | **POST** /ng/api/connectors/getceawstemplateurl | Get the Template URL of connector
[**getConnector**](ConnectorsApi.md#getConnector) | **GET** /ng/api/connectors/{identifier} | Get the Connector by accountIdentifier and connectorIdentifier
[**getConnectorCatalogue**](ConnectorsApi.md#getConnectorCatalogue) | **GET** /ng/api/connectors/catalogue | Gets the Connector catalogue by Account Identifier
[**getConnectorList**](ConnectorsApi.md#getConnectorList) | **GET** /ng/api/connectors | Fetches the list of Connectors corresponding to the request&#x27;s filter criteria.
[**getConnectorListV2**](ConnectorsApi.md#getConnectorListV2) | **POST** /ng/api/connectors/listV2 | Fetches the list of Connectors corresponding to the request&#x27;s filter criteria.
[**getConnectorStatistics**](ConnectorsApi.md#getConnectorStatistics) | **GET** /ng/api/connectors/stats | Gets the connector&#x27;s statistics by Account Identifier, Project Identifier and Organization Identifier
[**getTestConnectionResult**](ConnectorsApi.md#getTestConnectionResult) | **POST** /ng/api/connectors/testConnection/{identifier} | Tests the connection of the Connector by ID
[**getTestGitRepoConnectionResult**](ConnectorsApi.md#getTestGitRepoConnectionResult) | **POST** /ng/api/connectors/testGitRepoConnection/{identifier} | Tests the Git Repo connection
[**listConnectorByFQN**](ConnectorsApi.md#listConnectorByFQN) | **POST** /ng/api/connectors/listbyfqn | Get the list of connectors by FQN satisfying the criteria (if any) in the request
[**updateConnector**](ConnectorsApi.md#updateConnector) | **PUT** /ng/api/connectors | Updates the Connector
[**validateTheIdentifierIsUnique**](ConnectorsApi.md#validateTheIdentifierIsUnique) | **GET** /ng/api/connectors/validateUniqueIdentifier | Validate the Connector by Account Identifier and Connector Identifier

<a name="createConnector"></a>
# **createConnector**
> ResponseDTOConnectorResponse createConnector(body, accountIdentifier, branch, repoIdentifier, rootFolder, filePath, commitMsg, isNewBranch, baseBranch)

Creates a Connector

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ConnectorsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

ConnectorsApi apiInstance = new ConnectorsApi();
Connector body = new Connector(); // Connector | Details of the Connector to create
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the Entity
String branch = "branch_example"; // String | Branch Name
String repoIdentifier = "repoIdentifier_example"; // String | Git Sync Config Id
String rootFolder = "rootFolder_example"; // String | Root Folder Path of the Entity
String filePath = "filePath_example"; // String | File Path of the Entity
String commitMsg = "commitMsg_example"; // String | File Path of the Entity
Boolean isNewBranch = false; // Boolean | Checks the new branch
String baseBranch = "baseBranch_example"; // String | Default Branch
try {
    ResponseDTOConnectorResponse result = apiInstance.createConnector(body, accountIdentifier, branch, repoIdentifier, rootFolder, filePath, commitMsg, isNewBranch, baseBranch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConnectorsApi#createConnector");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Connector**](Connector.md)| Details of the Connector to create |
 **accountIdentifier** | **String**| Account Identifier for the Entity |
 **branch** | **String**| Branch Name | [optional]
 **repoIdentifier** | **String**| Git Sync Config Id | [optional]
 **rootFolder** | **String**| Root Folder Path of the Entity | [optional]
 **filePath** | **String**| File Path of the Entity | [optional]
 **commitMsg** | **String**| File Path of the Entity | [optional]
 **isNewBranch** | **Boolean**| Checks the new branch | [optional] [default to false]
 **baseBranch** | **String**| Default Branch | [optional]

### Return type

[**ResponseDTOConnectorResponse**](ResponseDTOConnectorResponse.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json, text/yaml, text/html, text/plain
 - **Accept**: application/json, application/yaml, text/yaml, text/html

<a name="deleteConnector"></a>
# **deleteConnector**
> ResponseDTOBoolean deleteConnector(accountIdentifier, identifier, orgIdentifier, projectIdentifier, branch, repoIdentifier, rootFolder, filePath, commitMsg, lastObjectId)

Deletes Connector by ID

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ConnectorsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

ConnectorsApi apiInstance = new ConnectorsApi();
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the Entity
String identifier = "identifier_example"; // String | Connector ID
String orgIdentifier = "orgIdentifier_example"; // String | Organization Identifier for the Entity
String projectIdentifier = "projectIdentifier_example"; // String | Project Identifier for the Entity
String branch = "branch_example"; // String | Branch Name
String repoIdentifier = "repoIdentifier_example"; // String | Git Sync Config Id
String rootFolder = "rootFolder_example"; // String | Root Folder Path of the Entity
String filePath = "filePath_example"; // String | File Path of the Entity
String commitMsg = "commitMsg_example"; // String | Commit Message
String lastObjectId = "lastObjectId_example"; // String | Last Object Id
try {
    ResponseDTOBoolean result = apiInstance.deleteConnector(accountIdentifier, identifier, orgIdentifier, projectIdentifier, branch, repoIdentifier, rootFolder, filePath, commitMsg, lastObjectId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConnectorsApi#deleteConnector");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountIdentifier** | **String**| Account Identifier for the Entity |
 **identifier** | **String**| Connector ID |
 **orgIdentifier** | **String**| Organization Identifier for the Entity | [optional]
 **projectIdentifier** | **String**| Project Identifier for the Entity | [optional]
 **branch** | **String**| Branch Name | [optional]
 **repoIdentifier** | **String**| Git Sync Config Id | [optional]
 **rootFolder** | **String**| Root Folder Path of the Entity | [optional]
 **filePath** | **String**| File Path of the Entity | [optional]
 **commitMsg** | **String**| Commit Message | [optional]
 **lastObjectId** | **String**| Last Object Id | [optional]

### Return type

[**ResponseDTOBoolean**](ResponseDTOBoolean.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/yaml, text/yaml, text/html

<a name="getAllAllowedFieldValues"></a>
# **getAllAllowedFieldValues**
> ResponseDTOFieldValues getAllAllowedFieldValues(connectorType)

Get the allowed field values by Connector Type

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ConnectorsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

ConnectorsApi apiInstance = new ConnectorsApi();
String connectorType = "connectorType_example"; // String | Connector type
try {
    ResponseDTOFieldValues result = apiInstance.getAllAllowedFieldValues(connectorType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConnectorsApi#getAllAllowedFieldValues");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **connectorType** | **String**| Connector type | [enum: K8sCluster, Git, Splunk, AppDynamics, Prometheus, Dynatrace, Vault, AzureKeyVault, DockerRegistry, Local, AwsKms, GcpKms, AwsSecretManager, Gcp, Aws, Artifactory, Jira, Nexus, Github, Gitlab, Bitbucket, Codecommit, CEAws, CEAzure, GcpCloudCost, CEK8sCluster, HttpHelmRepo, NewRelic, Datadog, SumoLogic, PagerDuty, CustomHealth, ServiceNow, ErrorTracking]

### Return type

[**ResponseDTOFieldValues**](ResponseDTOFieldValues.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/yaml, text/yaml, text/html

<a name="getCEAwsTemplate"></a>
# **getCEAwsTemplate**
> ResponseDTOString getCEAwsTemplate(eventsEnabled, curEnabled, optimizationEnabled)

Get the Template URL of connector

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ConnectorsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

ConnectorsApi apiInstance = new ConnectorsApi();
Boolean eventsEnabled = true; // Boolean | Specify whether or not to enable events
Boolean curEnabled = true; // Boolean | Specify whether or not to enable CUR
Boolean optimizationEnabled = true; // Boolean | Specify whether or not to enable optimization
try {
    ResponseDTOString result = apiInstance.getCEAwsTemplate(eventsEnabled, curEnabled, optimizationEnabled);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConnectorsApi#getCEAwsTemplate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eventsEnabled** | **Boolean**| Specify whether or not to enable events | [optional]
 **curEnabled** | **Boolean**| Specify whether or not to enable CUR | [optional]
 **optimizationEnabled** | **Boolean**| Specify whether or not to enable optimization | [optional]

### Return type

[**ResponseDTOString**](ResponseDTOString.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/yaml, text/yaml, text/html

<a name="getConnector"></a>
# **getConnector**
> ResponseDTOConnectorResponse getConnector(accountIdentifier, identifier, orgIdentifier, projectIdentifier, branch, repoIdentifier, getDefaultFromOtherRepo)

Get the Connector by accountIdentifier and connectorIdentifier

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ConnectorsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

ConnectorsApi apiInstance = new ConnectorsApi();
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the Entity
String identifier = "identifier_example"; // String | Connector Identifier
String orgIdentifier = "orgIdentifier_example"; // String | Organization Identifier for the Entity
String projectIdentifier = "projectIdentifier_example"; // String | Project Identifier for the Entity
String branch = "branch_example"; // String | Branch Name
String repoIdentifier = "repoIdentifier_example"; // String | Git Sync Config Id
Boolean getDefaultFromOtherRepo = true; // Boolean | if true, return all the default entities
try {
    ResponseDTOConnectorResponse result = apiInstance.getConnector(accountIdentifier, identifier, orgIdentifier, projectIdentifier, branch, repoIdentifier, getDefaultFromOtherRepo);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConnectorsApi#getConnector");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountIdentifier** | **String**| Account Identifier for the Entity |
 **identifier** | **String**| Connector Identifier |
 **orgIdentifier** | **String**| Organization Identifier for the Entity | [optional]
 **projectIdentifier** | **String**| Project Identifier for the Entity | [optional]
 **branch** | **String**| Branch Name | [optional]
 **repoIdentifier** | **String**| Git Sync Config Id | [optional]
 **getDefaultFromOtherRepo** | **Boolean**| if true, return all the default entities | [optional]

### Return type

[**ResponseDTOConnectorResponse**](ResponseDTOConnectorResponse.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/yaml, text/yaml, text/html

<a name="getConnectorCatalogue"></a>
# **getConnectorCatalogue**
> ResponseDTOConnectorCatalogueResponse getConnectorCatalogue(accountIdentifier)

Gets the Connector catalogue by Account Identifier

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ConnectorsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

ConnectorsApi apiInstance = new ConnectorsApi();
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the Entity
try {
    ResponseDTOConnectorCatalogueResponse result = apiInstance.getConnectorCatalogue(accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConnectorsApi#getConnectorCatalogue");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountIdentifier** | **String**| Account Identifier for the Entity |

### Return type

[**ResponseDTOConnectorCatalogueResponse**](ResponseDTOConnectorCatalogueResponse.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/yaml, text/yaml, text/html

<a name="getConnectorList"></a>
# **getConnectorList**
> ResponseDTOPageResponseConnectorResponse getConnectorList(accountIdentifier, pageIndex, pageSize, orgIdentifier, projectIdentifier, searchTerm, type, category, sourceCategory, branch, repoIdentifier, getDefaultFromOtherRepo)

Fetches the list of Connectors corresponding to the request&#x27;s filter criteria.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ConnectorsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

ConnectorsApi apiInstance = new ConnectorsApi();
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the Entity
Integer pageIndex = 0; // Integer | Page number of navigation. The default value is 0
Integer pageSize = 100; // Integer | Number of entries per page. The default value is 100
String orgIdentifier = "orgIdentifier_example"; // String | Organization Identifier for the Entity
String projectIdentifier = "projectIdentifier_example"; // String | Project Identifier for the Entity
String searchTerm = "searchTerm_example"; // String | This would be used to filter Connectors. Any Connector having the specified string in its Name, ID and Tag would be filtered.
String type = "type_example"; // String | Filter Connectors by type
String category = "category_example"; // String | Filter Connectors by category
String sourceCategory = "sourceCategory_example"; // String | Filter Connectors by Source Category. Available Source Categories are CLOUD_PROVIDER, SECRET_MANAGER, CLOUD_COST, ARTIFACTORY, CODE_REPO,  MONITORING and TICKETING
String branch = "branch_example"; // String | Branch Name
String repoIdentifier = "repoIdentifier_example"; // String | Git Sync Config Id
Boolean getDefaultFromOtherRepo = true; // Boolean | if true, return all the default entities
try {
    ResponseDTOPageResponseConnectorResponse result = apiInstance.getConnectorList(accountIdentifier, pageIndex, pageSize, orgIdentifier, projectIdentifier, searchTerm, type, category, sourceCategory, branch, repoIdentifier, getDefaultFromOtherRepo);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConnectorsApi#getConnectorList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountIdentifier** | **String**| Account Identifier for the Entity |
 **pageIndex** | **Integer**| Page number of navigation. The default value is 0 | [optional] [default to 0]
 **pageSize** | **Integer**| Number of entries per page. The default value is 100 | [optional] [default to 100]
 **orgIdentifier** | **String**| Organization Identifier for the Entity | [optional]
 **projectIdentifier** | **String**| Project Identifier for the Entity | [optional]
 **searchTerm** | **String**| This would be used to filter Connectors. Any Connector having the specified string in its Name, ID and Tag would be filtered. | [optional]
 **type** | **String**| Filter Connectors by type | [optional] [enum: K8sCluster, Git, Splunk, AppDynamics, Prometheus, Dynatrace, Vault, AzureKeyVault, DockerRegistry, Local, AwsKms, GcpKms, AwsSecretManager, Gcp, Aws, Artifactory, Jira, Nexus, Github, Gitlab, Bitbucket, Codecommit, CEAws, CEAzure, GcpCloudCost, CEK8sCluster, HttpHelmRepo, NewRelic, Datadog, SumoLogic, PagerDuty, CustomHealth, ServiceNow, ErrorTracking]
 **category** | **String**| Filter Connectors by category | [optional] [enum: CLOUD_PROVIDER, SECRET_MANAGER, CLOUD_COST, ARTIFACTORY, CODE_REPO, MONITORING, TICKETING]
 **sourceCategory** | **String**| Filter Connectors by Source Category. Available Source Categories are CLOUD_PROVIDER, SECRET_MANAGER, CLOUD_COST, ARTIFACTORY, CODE_REPO,  MONITORING and TICKETING | [optional] [enum: CLOUD_PROVIDER, SECRET_MANAGER, CLOUD_COST, ARTIFACTORY, CODE_REPO, MONITORING, TICKETING]
 **branch** | **String**| Branch Name | [optional]
 **repoIdentifier** | **String**| Git Sync Config Id | [optional]
 **getDefaultFromOtherRepo** | **Boolean**| if true, return all the default entities | [optional]

### Return type

[**ResponseDTOPageResponseConnectorResponse**](ResponseDTOPageResponseConnectorResponse.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/yaml, text/yaml, text/html

<a name="getConnectorListV2"></a>
# **getConnectorListV2**
> ResponseDTOPageResponseConnectorResponse getConnectorListV2(body, accountIdentifier, pageIndex, pageSize, searchTerm, orgIdentifier, projectIdentifier, filterIdentifier, includeAllConnectorsAvailableAtScope, branch, repoIdentifier, getDefaultFromOtherRepo, getDistinctFromBranches)

Fetches the list of Connectors corresponding to the request&#x27;s filter criteria.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ConnectorsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

ConnectorsApi apiInstance = new ConnectorsApi();
ConnectorFilterProperties body = new ConnectorFilterProperties(); // ConnectorFilterProperties | Details of the filters applied
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the Entity
Integer pageIndex = 0; // Integer | Page number of navigation. The default value is 0
Integer pageSize = 100; // Integer | Number of entries per page. The default value is 100
String searchTerm = "searchTerm_example"; // String | This would be used to filter Connectors. Any Connector having the specified string in its Name, ID and Tag would be filtered.
String orgIdentifier = "orgIdentifier_example"; // String | Organization Identifier for the Entity
String projectIdentifier = "projectIdentifier_example"; // String | Project Identifier for the Entity
String filterIdentifier = "filterIdentifier_example"; // String | 
Boolean includeAllConnectorsAvailableAtScope = true; // Boolean | Specify whether or not to include all the Connectors accessible at the scope. For eg if set as true, at the Project scope we will get org and account Connector also in the response
String branch = "branch_example"; // String | Branch Name
String repoIdentifier = "repoIdentifier_example"; // String | Git Sync Config Id
Boolean getDefaultFromOtherRepo = true; // Boolean | if true, return all the default entities
Boolean getDistinctFromBranches = true; // Boolean | This when set to true along with GitSync enabled for the Connector, you can to get other Connectors too which are not from same repo - branch but different repo's default branch
try {
    ResponseDTOPageResponseConnectorResponse result = apiInstance.getConnectorListV2(body, accountIdentifier, pageIndex, pageSize, searchTerm, orgIdentifier, projectIdentifier, filterIdentifier, includeAllConnectorsAvailableAtScope, branch, repoIdentifier, getDefaultFromOtherRepo, getDistinctFromBranches);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConnectorsApi#getConnectorListV2");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ConnectorFilterProperties**](ConnectorFilterProperties.md)| Details of the filters applied |
 **accountIdentifier** | **String**| Account Identifier for the Entity |
 **pageIndex** | **Integer**| Page number of navigation. The default value is 0 | [optional] [default to 0]
 **pageSize** | **Integer**| Number of entries per page. The default value is 100 | [optional] [default to 100]
 **searchTerm** | **String**| This would be used to filter Connectors. Any Connector having the specified string in its Name, ID and Tag would be filtered. | [optional]
 **orgIdentifier** | **String**| Organization Identifier for the Entity | [optional]
 **projectIdentifier** | **String**| Project Identifier for the Entity | [optional]
 **filterIdentifier** | **String**|  | [optional]
 **includeAllConnectorsAvailableAtScope** | **Boolean**| Specify whether or not to include all the Connectors accessible at the scope. For eg if set as true, at the Project scope we will get org and account Connector also in the response | [optional]
 **branch** | **String**| Branch Name | [optional]
 **repoIdentifier** | **String**| Git Sync Config Id | [optional]
 **getDefaultFromOtherRepo** | **Boolean**| if true, return all the default entities | [optional]
 **getDistinctFromBranches** | **Boolean**| This when set to true along with GitSync enabled for the Connector, you can to get other Connectors too which are not from same repo - branch but different repo&#x27;s default branch | [optional]

### Return type

[**ResponseDTOPageResponseConnectorResponse**](ResponseDTOPageResponseConnectorResponse.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json, text/yaml, text/html, text/plain
 - **Accept**: application/json, application/yaml, text/yaml, text/html

<a name="getConnectorStatistics"></a>
# **getConnectorStatistics**
> ResponseDTOConnectorStatistics getConnectorStatistics(accountIdentifier, orgIdentifier, projectIdentifier, branch, repoIdentifier, getDefaultFromOtherRepo)

Gets the connector&#x27;s statistics by Account Identifier, Project Identifier and Organization Identifier

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ConnectorsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

ConnectorsApi apiInstance = new ConnectorsApi();
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the Entity
String orgIdentifier = "orgIdentifier_example"; // String | Organization Identifier for the Entity
String projectIdentifier = "projectIdentifier_example"; // String | Project Identifier for the Entity
String branch = "branch_example"; // String | Branch Name
String repoIdentifier = "repoIdentifier_example"; // String | Git Sync Config Id
Boolean getDefaultFromOtherRepo = true; // Boolean | if true, return all the default entities
try {
    ResponseDTOConnectorStatistics result = apiInstance.getConnectorStatistics(accountIdentifier, orgIdentifier, projectIdentifier, branch, repoIdentifier, getDefaultFromOtherRepo);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConnectorsApi#getConnectorStatistics");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountIdentifier** | **String**| Account Identifier for the Entity |
 **orgIdentifier** | **String**| Organization Identifier for the Entity | [optional]
 **projectIdentifier** | **String**| Project Identifier for the Entity | [optional]
 **branch** | **String**| Branch Name | [optional]
 **repoIdentifier** | **String**| Git Sync Config Id | [optional]
 **getDefaultFromOtherRepo** | **Boolean**| if true, return all the default entities | [optional]

### Return type

[**ResponseDTOConnectorStatistics**](ResponseDTOConnectorStatistics.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/yaml, text/yaml, text/html

<a name="getTestConnectionResult"></a>
# **getTestConnectionResult**
> ResponseDTOConnectorValidationResult getTestConnectionResult(accountIdentifier, identifier, orgIdentifier, projectIdentifier, branch, repoIdentifier, getDefaultFromOtherRepo)

Tests the connection of the Connector by ID

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ConnectorsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

ConnectorsApi apiInstance = new ConnectorsApi();
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the Entity
String identifier = "identifier_example"; // String | Connector ID
String orgIdentifier = "orgIdentifier_example"; // String | Organization Identifier for the Entity
String projectIdentifier = "projectIdentifier_example"; // String | Project Identifier for the Entity
String branch = "branch_example"; // String | Branch Name
String repoIdentifier = "repoIdentifier_example"; // String | Git Sync Config Id
Boolean getDefaultFromOtherRepo = true; // Boolean | if true, return all the default entities
try {
    ResponseDTOConnectorValidationResult result = apiInstance.getTestConnectionResult(accountIdentifier, identifier, orgIdentifier, projectIdentifier, branch, repoIdentifier, getDefaultFromOtherRepo);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConnectorsApi#getTestConnectionResult");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountIdentifier** | **String**| Account Identifier for the Entity |
 **identifier** | **String**| Connector ID |
 **orgIdentifier** | **String**| Organization Identifier for the Entity | [optional]
 **projectIdentifier** | **String**| Project Identifier for the Entity | [optional]
 **branch** | **String**| Branch Name | [optional]
 **repoIdentifier** | **String**| Git Sync Config Id | [optional]
 **getDefaultFromOtherRepo** | **Boolean**| if true, return all the default entities | [optional]

### Return type

[**ResponseDTOConnectorValidationResult**](ResponseDTOConnectorValidationResult.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/yaml, text/yaml, text/html

<a name="getTestGitRepoConnectionResult"></a>
# **getTestGitRepoConnectionResult**
> ResponseDTOConnectorValidationResult getTestGitRepoConnectionResult(accountIdentifier, identifier, orgIdentifier, projectIdentifier, repoURL)

Tests the Git Repo connection

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ConnectorsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

ConnectorsApi apiInstance = new ConnectorsApi();
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the Entity
String identifier = "identifier_example"; // String | Connector ID
String orgIdentifier = "orgIdentifier_example"; // String | Organization Identifier for the Entity
String projectIdentifier = "projectIdentifier_example"; // String | Project Identifier for the Entity
String repoURL = "repoURL_example"; // String | URL of the repository, specify only in the case of Account Type Git Connector
try {
    ResponseDTOConnectorValidationResult result = apiInstance.getTestGitRepoConnectionResult(accountIdentifier, identifier, orgIdentifier, projectIdentifier, repoURL);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConnectorsApi#getTestGitRepoConnectionResult");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountIdentifier** | **String**| Account Identifier for the Entity |
 **identifier** | **String**| Connector ID |
 **orgIdentifier** | **String**| Organization Identifier for the Entity | [optional]
 **projectIdentifier** | **String**| Project Identifier for the Entity | [optional]
 **repoURL** | **String**| URL of the repository, specify only in the case of Account Type Git Connector | [optional]

### Return type

[**ResponseDTOConnectorValidationResult**](ResponseDTOConnectorValidationResult.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/yaml, text/yaml, text/html

<a name="listConnectorByFQN"></a>
# **listConnectorByFQN**
> ResponseDTOListConnectorResponse listConnectorByFQN(body, accountIdentifier)

Get the list of connectors by FQN satisfying the criteria (if any) in the request

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ConnectorsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

ConnectorsApi apiInstance = new ConnectorsApi();
List<String> body = Arrays.asList("body_example"); // List<String> | List of ConnectorsFQN as strings
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the Entity
try {
    ResponseDTOListConnectorResponse result = apiInstance.listConnectorByFQN(body, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConnectorsApi#listConnectorByFQN");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**List&lt;String&gt;**](String.md)| List of ConnectorsFQN as strings |
 **accountIdentifier** | **String**| Account Identifier for the Entity |

### Return type

[**ResponseDTOListConnectorResponse**](ResponseDTOListConnectorResponse.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json, text/yaml, text/html, text/plain
 - **Accept**: application/json, application/yaml, text/yaml, text/html

<a name="updateConnector"></a>
# **updateConnector**
> ResponseDTOConnectorResponse updateConnector(body, accountIdentifier, branch, repoIdentifier, rootFolder, filePath, commitMsg, lastObjectId, baseBranch)

Updates the Connector

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ConnectorsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

ConnectorsApi apiInstance = new ConnectorsApi();
Connector body = new Connector(); // Connector | This is the updated Connector. Please provide values for all fields, not just the fields you are updating
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the Entity
String branch = "branch_example"; // String | Branch Name
String repoIdentifier = "repoIdentifier_example"; // String | Git Sync Config Id
String rootFolder = "rootFolder_example"; // String | Root Folder Path of the Entity
String filePath = "filePath_example"; // String | Root Folder Path of the Entity
String commitMsg = "commitMsg_example"; // String | Commit Message
String lastObjectId = "lastObjectId_example"; // String | Last Object Id
String baseBranch = "baseBranch_example"; // String | Default Branch
try {
    ResponseDTOConnectorResponse result = apiInstance.updateConnector(body, accountIdentifier, branch, repoIdentifier, rootFolder, filePath, commitMsg, lastObjectId, baseBranch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConnectorsApi#updateConnector");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Connector**](Connector.md)| This is the updated Connector. Please provide values for all fields, not just the fields you are updating |
 **accountIdentifier** | **String**| Account Identifier for the Entity |
 **branch** | **String**| Branch Name | [optional]
 **repoIdentifier** | **String**| Git Sync Config Id | [optional]
 **rootFolder** | **String**| Root Folder Path of the Entity | [optional]
 **filePath** | **String**| Root Folder Path of the Entity | [optional]
 **commitMsg** | **String**| Commit Message | [optional]
 **lastObjectId** | **String**| Last Object Id | [optional]
 **baseBranch** | **String**| Default Branch | [optional]

### Return type

[**ResponseDTOConnectorResponse**](ResponseDTOConnectorResponse.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json, text/yaml, text/html, text/plain
 - **Accept**: application/json, application/yaml, text/yaml, text/html

<a name="validateTheIdentifierIsUnique"></a>
# **validateTheIdentifierIsUnique**
> ResponseDTOBoolean validateTheIdentifierIsUnique(accountIdentifier, orgIdentifier, projectIdentifier, identifier)

Validate the Connector by Account Identifier and Connector Identifier

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ConnectorsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

ConnectorsApi apiInstance = new ConnectorsApi();
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the Entity
String orgIdentifier = "orgIdentifier_example"; // String | Organization Identifier for the Entity
String projectIdentifier = "projectIdentifier_example"; // String | Project Identifier for the Entity
String identifier = "identifier_example"; // String | Connector ID
try {
    ResponseDTOBoolean result = apiInstance.validateTheIdentifierIsUnique(accountIdentifier, orgIdentifier, projectIdentifier, identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConnectorsApi#validateTheIdentifierIsUnique");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountIdentifier** | **String**| Account Identifier for the Entity |
 **orgIdentifier** | **String**| Organization Identifier for the Entity | [optional]
 **projectIdentifier** | **String**| Project Identifier for the Entity | [optional]
 **identifier** | **String**| Connector ID | [optional]

### Return type

[**ResponseDTOBoolean**](ResponseDTOBoolean.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/yaml, text/yaml, text/html

