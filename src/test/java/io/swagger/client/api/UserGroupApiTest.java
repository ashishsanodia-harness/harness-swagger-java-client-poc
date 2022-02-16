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
import io.swagger.client.model.ResponseDTOListUserGroup;
import io.swagger.client.model.ResponseDTOPageResponseUserGroup;
import io.swagger.client.model.ResponseDTOPageResponseUserMetadata;
import io.swagger.client.model.ResponseDTOUserGroup;
import io.swagger.client.model.RestResponseUserGroup;
import io.swagger.client.model.SamlLinkGroupRequest;
import io.swagger.client.model.Scope;
import io.swagger.client.model.SortOrder;
import io.swagger.client.model.UserFilter;
import io.swagger.client.model.UserGroup;
import io.swagger.client.model.UserGroupFilter;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for UserGroupApi
 */
@Ignore
public class UserGroupApiTest {

    private final UserGroupApi api = new UserGroupApi();

    /**
     * Get a User Group in an account/org/project
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void copyUserGroupTest() throws Exception {
        List<Scope> body = null;
        String accountIdentifier = null;
        String groupIdentifier = null;
        ResponseDTOBoolean response = api.copyUserGroup(body, accountIdentifier, groupIdentifier);

        // TODO: test validations
    }
    /**
     * Remove a user from the user group in an account/org/project
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void deleteMemberTest() throws Exception {
        String accountIdentifier = null;
        String identifier = null;
        String userIdentifier = null;
        String orgIdentifier = null;
        String projectIdentifier = null;
        ResponseDTOUserGroup response = api.deleteMember(accountIdentifier, identifier, userIdentifier, orgIdentifier, projectIdentifier);

        // TODO: test validations
    }
    /**
     * Delete a User Group in an account/org/project
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void deleteUserGroupTest() throws Exception {
        String accountIdentifier = null;
        String identifier = null;
        String orgIdentifier = null;
        String projectIdentifier = null;
        ResponseDTOUserGroup response = api.deleteUserGroup(accountIdentifier, identifier, orgIdentifier, projectIdentifier);

        // TODO: test validations
    }
    /**
     * List the User Groups selected by a filter in an account/org/project
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getBatchUsersGroupListTest() throws Exception {
        UserGroupFilter body = null;
        ResponseDTOListUserGroup response = api.getBatchUsersGroupList(body);

        // TODO: test validations
    }
    /**
     * Check if the user is part of the user group in an account/org/project
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getMemberTest() throws Exception {
        String accountIdentifier = null;
        String identifier = null;
        String userIdentifier = null;
        String orgIdentifier = null;
        String projectIdentifier = null;
        ResponseDTOBoolean response = api.getMember(accountIdentifier, identifier, userIdentifier, orgIdentifier, projectIdentifier);

        // TODO: test validations
    }
    /**
     * Get a User Group in an account/org/project
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getUserGroupTest() throws Exception {
        String accountIdentifier = null;
        String identifier = null;
        String orgIdentifier = null;
        String projectIdentifier = null;
        ResponseDTOUserGroup response = api.getUserGroup(accountIdentifier, identifier, orgIdentifier, projectIdentifier);

        // TODO: test validations
    }
    /**
     * List the User Groups in an account/org/project
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getUserGroupListTest() throws Exception {
        String accountIdentifier = null;
        String orgIdentifier = null;
        String projectIdentifier = null;
        String searchTerm = null;
        Integer pageIndex = null;
        Integer pageSize = null;
        List<SortOrder> sortOrders = null;
        ResponseDTOPageResponseUserGroup response = api.getUserGroupList(accountIdentifier, orgIdentifier, projectIdentifier, searchTerm, pageIndex, pageSize, sortOrders);

        // TODO: test validations
    }
    /**
     * List the users in a User Group in an account/org/project
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getUserListInUserGroupTest() throws Exception {
        String accountIdentifier = null;
        String identifier = null;
        UserFilter body = null;
        String orgIdentifier = null;
        String projectIdentifier = null;
        Integer pageIndex = null;
        Integer pageSize = null;
        List<SortOrder> sortOrders = null;
        ResponseDTOPageResponseUserMetadata response = api.getUserListInUserGroup(accountIdentifier, identifier, body, orgIdentifier, projectIdentifier, pageIndex, pageSize, sortOrders);

        // TODO: test validations
    }
    /**
     * Link SAML Group to the User Group in an account/org/project
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void linkUserGroupToSAMLTest() throws Exception {
        SamlLinkGroupRequest body = null;
        String accountIdentifier = null;
        String userGroupId = null;
        String samlId = null;
        String orgIdentifier = null;
        String projectIdentifier = null;
        RestResponseUserGroup response = api.linkUserGroupToSAML(body, accountIdentifier, userGroupId, samlId, orgIdentifier, projectIdentifier);

        // TODO: test validations
    }
    /**
     * Create a User Group in an account/org/project
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postUserGroupTest() throws Exception {
        UserGroup body = null;
        String accountIdentifier = null;
        String orgIdentifier = null;
        String projectIdentifier = null;
        ResponseDTOUserGroup response = api.postUserGroup(body, accountIdentifier, orgIdentifier, projectIdentifier);

        // TODO: test validations
    }
    /**
     * Add a user to the user group in an account/org/project
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void putMemberTest() throws Exception {
        String accountIdentifier = null;
        String identifier = null;
        String userIdentifier = null;
        String orgIdentifier = null;
        String projectIdentifier = null;
        ResponseDTOUserGroup response = api.putMember(accountIdentifier, identifier, userIdentifier, orgIdentifier, projectIdentifier);

        // TODO: test validations
    }
    /**
     * Update a User Group in an account/org/project
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void putUserGroupTest() throws Exception {
        UserGroup body = null;
        String accountIdentifier = null;
        String orgIdentifier = null;
        String projectIdentifier = null;
        ResponseDTOUserGroup response = api.putUserGroup(body, accountIdentifier, orgIdentifier, projectIdentifier);

        // TODO: test validations
    }
    /**
     * Unlink SSO Group from the User Group in an account/org/project
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void unlinkUserGroupfromSSOTest() throws Exception {
        String userGroupId = null;
        String accountIdentifier = null;
        Boolean retainMembers = null;
        String orgIdentifier = null;
        String projectIdentifier = null;
        RestResponseUserGroup response = api.unlinkUserGroupfromSSO(userGroupId, accountIdentifier, retainMembers, orgIdentifier, projectIdentifier);

        // TODO: test validations
    }
}