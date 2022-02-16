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

import io.swagger.client.model.EnvironmentRequest;
import io.swagger.client.model.Error;
import io.swagger.client.model.Failure;
import io.swagger.client.model.ResponseDTOBoolean;
import io.swagger.client.model.ResponseDTOEnvironmentResponse;
import io.swagger.client.model.ResponseDTOListEnvironmentResponse;
import io.swagger.client.model.ResponseDTOPageResponseEnvironmentResponse;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for EnvironmentsApi
 */
@Ignore
public class EnvironmentsApiTest {

    private final EnvironmentsApi api = new EnvironmentsApi();

    /**
     * Create an Environment
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void createEnvironmentV2Test() throws Exception {
        String accountIdentifier = null;
        EnvironmentRequest body = null;
        ResponseDTOEnvironmentResponse response = api.createEnvironmentV2(accountIdentifier, body);

        // TODO: test validations
    }
    /**
     * Delete an Environment by identifier
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void deleteEnvironmentV2Test() throws Exception {
        String environmentIdentifier = null;
        String accountIdentifier = null;
        String ifMatch = null;
        String orgIdentifier = null;
        String projectIdentifier = null;
        ResponseDTOBoolean response = api.deleteEnvironmentV2(environmentIdentifier, accountIdentifier, ifMatch, orgIdentifier, projectIdentifier);

        // TODO: test validations
    }
    /**
     * Gets Environment Access list
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getEnvironmentAccessListTest() throws Exception {
        String accountIdentifier = null;
        Integer page = null;
        Integer size = null;
        String orgIdentifier = null;
        String projectIdentifier = null;
        String searchTerm = null;
        List<String> envIdentifiers = null;
        List<String> sort = null;
        ResponseDTOListEnvironmentResponse response = api.getEnvironmentAccessList(accountIdentifier, page, size, orgIdentifier, projectIdentifier, searchTerm, envIdentifiers, sort);

        // TODO: test validations
    }
    /**
     * Gets Environment list for a project
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getEnvironmentListTest() throws Exception {
        String accountIdentifier = null;
        Integer page = null;
        Integer size = null;
        String orgIdentifier = null;
        String projectIdentifier = null;
        String searchTerm = null;
        List<String> envIdentifiers = null;
        List<String> sort = null;
        ResponseDTOPageResponseEnvironmentResponse response = api.getEnvironmentList(accountIdentifier, page, size, orgIdentifier, projectIdentifier, searchTerm, envIdentifiers, sort);

        // TODO: test validations
    }
    /**
     * Gets an Environment by identifier
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getEnvironmentV2Test() throws Exception {
        String environmentIdentifier = null;
        String accountIdentifier = null;
        String orgIdentifier = null;
        String projectIdentifier = null;
        Boolean deleted = null;
        ResponseDTOEnvironmentResponse response = api.getEnvironmentV2(environmentIdentifier, accountIdentifier, orgIdentifier, projectIdentifier, deleted);

        // TODO: test validations
    }
    /**
     * Update an Environment by identifier
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void updateEnvironmentV2Test() throws Exception {
        String accountIdentifier = null;
        EnvironmentRequest body = null;
        String ifMatch = null;
        ResponseDTOEnvironmentResponse response = api.updateEnvironmentV2(accountIdentifier, body, ifMatch);

        // TODO: test validations
    }
    /**
     * Upsert an Environment by identifier
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void upsertEnvironmentV2Test() throws Exception {
        String accountIdentifier = null;
        EnvironmentRequest body = null;
        String ifMatch = null;
        ResponseDTOEnvironmentResponse response = api.upsertEnvironmentV2(accountIdentifier, body, ifMatch);

        // TODO: test validations
    }
}
