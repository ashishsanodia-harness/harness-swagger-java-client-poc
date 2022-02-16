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

import io.swagger.client.model.Error;
import io.swagger.client.model.Failure;
import io.swagger.client.model.ResponseDTOBoolean;
import io.swagger.client.model.ResponseDTOListSourceCodeManager;
import io.swagger.client.model.ResponseDTOSourceCodeManager;
import io.swagger.client.model.SourceCodeManager;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for SourceCodeManagerApi
 */
@Ignore
public class SourceCodeManagerApiTest {

    private final SourceCodeManagerApi api = new SourceCodeManagerApi();

    /**
     * Creates Source Code Manager
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void createSourceCodeManagerTest() throws Exception {
        SourceCodeManager body = null;
        ResponseDTOSourceCodeManager response = api.createSourceCodeManager(body);

        // TODO: test validations
    }
    /**
     * Deletes the Source Code Manager corresponding to the specified Source Code Manager Id
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void deleteSourceCodeManagerTest() throws Exception {
        String identifier = null;
        String accountIdentifier = null;
        ResponseDTOBoolean response = api.deleteSourceCodeManager(identifier, accountIdentifier);

        // TODO: test validations
    }
    /**
     * Lists Source Code Managers for the given account
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getSourceCodeManagersTest() throws Exception {
        String accountIdentifier = null;
        ResponseDTOListSourceCodeManager response = api.getSourceCodeManagers(accountIdentifier);

        // TODO: test validations
    }
    /**
     * Updates Source Code Manager Details with the given Source Code Manager Id
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void updateSourceCodeManagerTest() throws Exception {
        String identifier = null;
        SourceCodeManager body = null;
        ResponseDTOSourceCodeManager response = api.updateSourceCodeManager(identifier, body);

        // TODO: test validations
    }
}