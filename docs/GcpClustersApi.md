# GcpClustersApi

All URIs are relative to *https://app.harness.io/gateway*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getClusterNamesForGcp**](GcpClustersApi.md#getClusterNamesForGcp) | **GET** /ng/api/gcp/clusters | Gets gcp cluster names

<a name="getClusterNamesForGcp"></a>
# **getClusterNamesForGcp**
> ResponseDTOGcpResponse getClusterNamesForGcp(connectorRef, accountIdentifier, orgIdentifier, projectIdentifier)

Gets gcp cluster names

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.GcpClustersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

GcpClustersApi apiInstance = new GcpClustersApi();
String connectorRef = "connectorRef_example"; // String | GCP Connector Identifier
String accountIdentifier = "accountIdentifier_example"; // String | Account Identifier for the Entity
String orgIdentifier = "orgIdentifier_example"; // String | Organization Identifier for the Entity
String projectIdentifier = "projectIdentifier_example"; // String | Project Identifier for the Entity
try {
    ResponseDTOGcpResponse result = apiInstance.getClusterNamesForGcp(connectorRef, accountIdentifier, orgIdentifier, projectIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GcpClustersApi#getClusterNamesForGcp");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **connectorRef** | **String**| GCP Connector Identifier |
 **accountIdentifier** | **String**| Account Identifier for the Entity |
 **orgIdentifier** | **String**| Organization Identifier for the Entity |
 **projectIdentifier** | **String**| Project Identifier for the Entity |

### Return type

[**ResponseDTOGcpResponse**](ResponseDTOGcpResponse.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/yaml

