/*
 * CD NextGen API Reference
 * This is the Open Api Spec 3 for the NextGen Manager. This is under active development. Beware of the breaking change with respect to the generated code stub  # Authentication  <!-- ReDoc-Inject: <security-definitions> -->
 *
 * OpenAPI spec version: 3.0
 * Contact: contact@harness.io
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.api;

import io.swagger.client.model.ApiKey;
import io.swagger.client.model.Error;
import io.swagger.client.model.Failure;
import io.swagger.client.model.ResponseDTOApiKey;
import io.swagger.client.model.ResponseDTOApiKeyAggregate;
import io.swagger.client.model.ResponseDTOBoolean;
import io.swagger.client.model.ResponseDTOListApiKey;
import io.swagger.client.model.ResponseDTOPageResponseApiKeyAggregate;
import io.swagger.client.model.SortOrder;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for ApiKeyApi
 */
@Ignore
public class ApiKeyApiTest {

    private final ApiKeyApi api = new ApiKeyApi();

    /**
     * Creates an API key
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void createApiKeyTest() throws Exception {
        ApiKey body = null;
        ResponseDTOApiKey response = api.createApiKey(body);

        // TODO: test validations
    }
    /**
     * Deletes the API Key corresponding to the provided ID.
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void deleteApiKeyTest() throws Exception {
        String accountIdentifier = null;
        String apiKeyType = null;
        String parentIdentifier = null;
        String identifier = null;
        String orgIdentifier = null;
        String projectIdentifier = null;
        ResponseDTOBoolean response = api.deleteApiKey(accountIdentifier, apiKeyType, parentIdentifier, identifier, orgIdentifier, projectIdentifier);

        // TODO: test validations
    }
    /**
     * Fetches the API Keys details corresponding to the provided ID and Scope.
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getAggregatedApiKeyTest() throws Exception {
        String accountIdentifier = null;
        String apiKeyType = null;
        String parentIdentifier = null;
        String identifier = null;
        String orgIdentifier = null;
        String projectIdentifier = null;
        ResponseDTOApiKeyAggregate response = api.getAggregatedApiKey(accountIdentifier, apiKeyType, parentIdentifier, identifier, orgIdentifier, projectIdentifier);

        // TODO: test validations
    }
    /**
     * Fetches the list of API Keys corresponding to the request&#x27;s filter criteria.
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void listApiKeysTest() throws Exception {
        String accountIdentifier = null;
        String apiKeyType = null;
        String parentIdentifier = null;
        String orgIdentifier = null;
        String projectIdentifier = null;
        List<String> identifiers = null;
        ResponseDTOListApiKey response = api.listApiKeys(accountIdentifier, apiKeyType, parentIdentifier, orgIdentifier, projectIdentifier, identifiers);

        // TODO: test validations
    }
    /**
     * Fetches the list of Aggregated API Keys corresponding to the request&#x27;s filter criteria.
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void listApiKeys1Test() throws Exception {
        String accountIdentifier = null;
        String apiKeyType = null;
        String parentIdentifier = null;
        String orgIdentifier = null;
        String projectIdentifier = null;
        List<String> identifiers = null;
        Integer pageIndex = null;
        Integer pageSize = null;
        List<SortOrder> sortOrders = null;
        String searchTerm = null;
        ResponseDTOPageResponseApiKeyAggregate response = api.listApiKeys1(accountIdentifier, apiKeyType, parentIdentifier, orgIdentifier, projectIdentifier, identifiers, pageIndex, pageSize, sortOrders, searchTerm);

        // TODO: test validations
    }
    /**
     * Updates API Key for the provided ID
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void updateApiKeyTest() throws Exception {
        String identifier = null;
        ApiKey body = null;
        ResponseDTOApiKey response = api.updateApiKey(identifier, body);

        // TODO: test validations
    }
}
