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
import io.swagger.client.model.ResponseDTOResourceType;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for HarnessResourceTypeApi
 */
@Ignore
public class HarnessResourceTypeApiTest {

    private final HarnessResourceTypeApi api = new HarnessResourceTypeApi();

    /**
     * Gets all resource types available at this scope
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getResourceTypesTest() throws Exception {
        String accountIdentifier = null;
        String orgIdentifier = null;
        String projectIdentifier = null;
        ResponseDTOResourceType response = api.getResourceTypes(accountIdentifier, orgIdentifier, projectIdentifier);

        // TODO: test validations
    }
}
