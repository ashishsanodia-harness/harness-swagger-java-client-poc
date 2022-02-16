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
import io.swagger.client.model.ProjectRequest;
import io.swagger.client.model.ResponseDTOBoolean;
import io.swagger.client.model.ResponseDTOPageResponseProjectResponse;
import io.swagger.client.model.ResponseDTOProjectResponse;
import io.swagger.client.model.SortOrder;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for ProjectApi
 */
@Ignore
public class ProjectApiTest {

    private final ProjectApi api = new ProjectApi();

    /**
     * Deletes the Project corresponding to the specified Project ID.
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void deleteProjectTest() throws Exception {
        String identifier = null;
        String accountIdentifier = null;
        String ifMatch = null;
        String orgIdentifier = null;
        ResponseDTOBoolean response = api.deleteProject(identifier, accountIdentifier, ifMatch, orgIdentifier);

        // TODO: test validations
    }
    /**
     * Gets a Project by ID
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getProjectTest() throws Exception {
        String identifier = null;
        String accountIdentifier = null;
        String orgIdentifier = null;
        ResponseDTOProjectResponse response = api.getProject(identifier, accountIdentifier, orgIdentifier);

        // TODO: test validations
    }
    /**
     * List user&#x27;s project
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getProjectListTest() throws Exception {
        String accountIdentifier = null;
        String orgIdentifier = null;
        Boolean hasModule = null;
        List<String> identifiers = null;
        String moduleType = null;
        String searchTerm = null;
        Integer pageIndex = null;
        Integer pageSize = null;
        List<SortOrder> sortOrders = null;
        ResponseDTOPageResponseProjectResponse response = api.getProjectList(accountIdentifier, orgIdentifier, hasModule, identifiers, moduleType, searchTerm, pageIndex, pageSize, sortOrders);

        // TODO: test validations
    }
    /**
     * List user&#x27;s project with support to filter by multiple organizations
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getProjectListWithMultiOrgFilterTest() throws Exception {
        String accountIdentifier = null;
        List<String> orgIdentifiers = null;
        Boolean hasModule = null;
        List<String> identifiers = null;
        String moduleType = null;
        String searchTerm = null;
        Integer pageIndex = null;
        Integer pageSize = null;
        List<SortOrder> sortOrders = null;
        ResponseDTOPageResponseProjectResponse response = api.getProjectListWithMultiOrgFilter(accountIdentifier, orgIdentifiers, hasModule, identifiers, moduleType, searchTerm, pageIndex, pageSize, sortOrders);

        // TODO: test validations
    }
    /**
     * Creates a Project
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postProjectTest() throws Exception {
        ProjectRequest body = null;
        String accountIdentifier = null;
        String orgIdentifier = null;
        ResponseDTOProjectResponse response = api.postProject(body, accountIdentifier, orgIdentifier);

        // TODO: test validations
    }
    /**
     * Update Project by ID
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void putProjectTest() throws Exception {
        ProjectRequest body = null;
        String accountIdentifier = null;
        String identifier = null;
        String ifMatch = null;
        String orgIdentifier = null;
        ResponseDTOProjectResponse response = api.putProject(body, accountIdentifier, identifier, ifMatch, orgIdentifier);

        // TODO: test validations
    }
}