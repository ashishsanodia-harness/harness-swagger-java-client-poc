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
import io.swagger.client.model.GitEntityBranchSummaryFilter;
import io.swagger.client.model.GitEntitySummaryFilter;
import io.swagger.client.model.ResponseDTOGitSyncRepoFilesList;
import io.swagger.client.model.ResponseDTOListGitSyncEntityList;
import io.swagger.client.model.ResponseDTOPageResponseGitSyncEntityList;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for GitSyncEntitiesApi
 */
@Ignore
public class GitSyncEntitiesApiTest {

    private final GitSyncEntitiesApi api = new GitSyncEntitiesApi();

    /**
     * Lists Git Sync Entity filtered by their Type for the given scope
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void listGitSyncEntitiesByTypeTest() throws Exception {
        String entityType = null;
        String projectIdentifier = null;
        String orgIdentifier = null;
        String accountIdentifier = null;
        String gitSyncConfigId = null;
        String branch = null;
        Integer page = null;
        Integer size = null;
        String moduleType = null;
        ResponseDTOPageResponseGitSyncEntityList response = api.listGitSyncEntitiesByType(entityType, projectIdentifier, orgIdentifier, accountIdentifier, gitSyncConfigId, branch, page, size, moduleType);

        // TODO: test validations
    }
    /**
     * Lists Git Sync Entity by product for the given Repo, Branch and list of Entity Types
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void listGitSyncEntitiesSummaryForRepoAndBranchTest() throws Exception {
        GitEntityBranchSummaryFilter body = null;
        String branch = null;
        String projectIdentifier = null;
        String orgIdentifier = null;
        String accountIdentifier = null;
        Integer size = null;
        String gitSyncConfigId = null;
        ResponseDTOListGitSyncEntityList response = api.listGitSyncEntitiesSummaryForRepoAndBranch(body, branch, projectIdentifier, orgIdentifier, accountIdentifier, size, gitSyncConfigId);

        // TODO: test validations
    }
    /**
     * Lists Git Sync Entity by product for the given list of Repos and Entity Types
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void listGitSyncEntitiesSummaryForRepoAndTypesTest() throws Exception {
        GitEntitySummaryFilter body = null;
        String projectIdentifier = null;
        String orgIdentifier = null;
        String accountIdentifier = null;
        Integer size = null;
        ResponseDTOGitSyncRepoFilesList response = api.listGitSyncEntitiesSummaryForRepoAndTypes(body, projectIdentifier, orgIdentifier, accountIdentifier, size);

        // TODO: test validations
    }
}
