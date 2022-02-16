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
import io.swagger.client.model.InputSetTemplateRequest;
import io.swagger.client.model.MergeInputSetRequest;
import io.swagger.client.model.MergeInputSetTemplateRequest;
import io.swagger.client.model.ResponseDTOBoolean;
import io.swagger.client.model.ResponseDTOInputSetResponse;
import io.swagger.client.model.ResponseDTOInputSetTemplateWithReplacedExpressionsResponse;
import io.swagger.client.model.ResponseDTOMergeInputSetResponse;
import io.swagger.client.model.ResponseDTOOverlayInputSetResponse;
import io.swagger.client.model.ResponseDTOPageResponseInputSetSummaryResponse;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for InputSetsApi
 */
@Ignore
public class InputSetsApiTest {

    private final InputSetsApi api = new InputSetsApi();

    /**
     * Delete the Input Set by Identifier
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void deleteInputSetTest() throws Exception {
        String inputSetIdentifier = null;
        String accountIdentifier = null;
        String orgIdentifier = null;
        String projectIdentifier = null;
        String pipelineIdentifier = null;
        String ifMatch = null;
        String branch = null;
        String repoIdentifier = null;
        String rootFolder = null;
        String filePath = null;
        String commitMsg = null;
        String lastObjectId = null;
        ResponseDTOBoolean response = api.deleteInputSet(inputSetIdentifier, accountIdentifier, orgIdentifier, projectIdentifier, pipelineIdentifier, ifMatch, branch, repoIdentifier, rootFolder, filePath, commitMsg, lastObjectId);

        // TODO: test validations
    }
    /**
     * Gets Input Set for a given identifier. Throws error if no Input Set exists for the given identifier.
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getInputSetTest() throws Exception {
        String inputSetIdentifier = null;
        String accountIdentifier = null;
        String orgIdentifier = null;
        String projectIdentifier = null;
        String pipelineIdentifier = null;
        String branch = null;
        String repoIdentifier = null;
        Boolean getDefaultFromOtherRepo = null;
        ResponseDTOInputSetResponse response = api.getInputSet(inputSetIdentifier, accountIdentifier, orgIdentifier, projectIdentifier, pipelineIdentifier, branch, repoIdentifier, getDefaultFromOtherRepo);

        // TODO: test validations
    }
    /**
     * Gets an Overlay Input Set by identifier
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getOverlayInputSetTest() throws Exception {
        String inputSetIdentifier = null;
        String accountIdentifier = null;
        String orgIdentifier = null;
        String projectIdentifier = null;
        String pipelineIdentifier = null;
        String branch = null;
        String repoIdentifier = null;
        Boolean getDefaultFromOtherRepo = null;
        ResponseDTOOverlayInputSetResponse response = api.getOverlayInputSet(inputSetIdentifier, accountIdentifier, orgIdentifier, projectIdentifier, pipelineIdentifier, branch, repoIdentifier, getDefaultFromOtherRepo);

        // TODO: test validations
    }
    /**
     * List all Input Sets for a pipeline
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void listInputSetTest() throws Exception {
        String accountIdentifier = null;
        String orgIdentifier = null;
        String projectIdentifier = null;
        String pipelineIdentifier = null;
        Integer pageIndex = null;
        Integer pageSize = null;
        String inputSetType = null;
        String searchTerm = null;
        List<String> sortOrders = null;
        String branch = null;
        String repoIdentifier = null;
        Boolean getDefaultFromOtherRepo = null;
        ResponseDTOPageResponseInputSetSummaryResponse response = api.listInputSet(accountIdentifier, orgIdentifier, projectIdentifier, pipelineIdentifier, pageIndex, pageSize, inputSetType, searchTerm, sortOrders, branch, repoIdentifier, getDefaultFromOtherRepo);

        // TODO: test validations
    }
    /**
     * Merge given Input Sets into a single Runtime Input YAML
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void mergeInputSetsTest() throws Exception {
        MergeInputSetRequest body = null;
        String accountIdentifier = null;
        String orgIdentifier = null;
        String projectIdentifier = null;
        String pipelineIdentifier = null;
        String pipelineBranch = null;
        String pipelineRepoID = null;
        String branch = null;
        String repoIdentifier = null;
        Boolean getDefaultFromOtherRepo = null;
        ResponseDTOMergeInputSetResponse response = api.mergeInputSets(body, accountIdentifier, orgIdentifier, projectIdentifier, pipelineIdentifier, pipelineBranch, pipelineRepoID, branch, repoIdentifier, getDefaultFromOtherRepo);

        // TODO: test validations
    }
    /**
     * Merge given Runtime Input YAML into the Pipeline
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void mergeRuntimeInputIntoPipelineTest() throws Exception {
        MergeInputSetTemplateRequest body = null;
        String accountIdentifier = null;
        String orgIdentifier = null;
        String projectIdentifier = null;
        String pipelineIdentifier = null;
        String pipelineBranch = null;
        String pipelineRepoID = null;
        String branch = null;
        String repoIdentifier = null;
        Boolean getDefaultFromOtherRepo = null;
        ResponseDTOMergeInputSetResponse response = api.mergeRuntimeInputIntoPipeline(body, accountIdentifier, orgIdentifier, projectIdentifier, pipelineIdentifier, pipelineBranch, pipelineRepoID, branch, repoIdentifier, getDefaultFromOtherRepo);

        // TODO: test validations
    }
    /**
     * Create an Input Set for a Pipeline
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postInputSetTest() throws Exception {
        String body = null;
        String accountIdentifier = null;
        String orgIdentifier = null;
        String projectIdentifier = null;
        String pipelineIdentifier = null;
        String pipelineBranch = null;
        String pipelineRepoID = null;
        String branch = null;
        String repoIdentifier = null;
        String rootFolder = null;
        String filePath = null;
        String commitMsg = null;
        Boolean isNewBranch = null;
        String baseBranch = null;
        ResponseDTOInputSetResponse response = api.postInputSet(body, accountIdentifier, orgIdentifier, projectIdentifier, pipelineIdentifier, pipelineBranch, pipelineRepoID, branch, repoIdentifier, rootFolder, filePath, commitMsg, isNewBranch, baseBranch);

        // TODO: test validations
    }
    /**
     * Create an Overlay Input Set for a pipeline
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postOverlayInputSetTest() throws Exception {
        String body = null;
        String accountIdentifier = null;
        String orgIdentifier = null;
        String projectIdentifier = null;
        String pipelineIdentifier = null;
        String branch = null;
        String repoIdentifier = null;
        String rootFolder = null;
        String filePath = null;
        String commitMsg = null;
        Boolean isNewBranch = null;
        String baseBranch = null;
        ResponseDTOOverlayInputSetResponse response = api.postOverlayInputSet(body, accountIdentifier, orgIdentifier, projectIdentifier, pipelineIdentifier, branch, repoIdentifier, rootFolder, filePath, commitMsg, isNewBranch, baseBranch);

        // TODO: test validations
    }
    /**
     * Update Input Set for Pipeline
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void putInputSetTest() throws Exception {
        String body = null;
        String accountIdentifier = null;
        String orgIdentifier = null;
        String projectIdentifier = null;
        String pipelineIdentifier = null;
        String inputSetIdentifier = null;
        String ifMatch = null;
        String pipelineBranch = null;
        String pipelineRepoID = null;
        String branch = null;
        String repoIdentifier = null;
        String rootFolder = null;
        String filePath = null;
        String commitMsg = null;
        String lastObjectId = null;
        String baseBranch = null;
        ResponseDTOInputSetResponse response = api.putInputSet(body, accountIdentifier, orgIdentifier, projectIdentifier, pipelineIdentifier, inputSetIdentifier, ifMatch, pipelineBranch, pipelineRepoID, branch, repoIdentifier, rootFolder, filePath, commitMsg, lastObjectId, baseBranch);

        // TODO: test validations
    }
    /**
     * Update an Overlay Input Set for a pipeline
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void putOverlayInputSetTest() throws Exception {
        String body = null;
        String accountIdentifier = null;
        String orgIdentifier = null;
        String projectIdentifier = null;
        String pipelineIdentifier = null;
        String inputSetIdentifier = null;
        String ifMatch = null;
        String branch = null;
        String repoIdentifier = null;
        String rootFolder = null;
        String filePath = null;
        String commitMsg = null;
        String lastObjectId = null;
        String baseBranch = null;
        ResponseDTOOverlayInputSetResponse response = api.putOverlayInputSet(body, accountIdentifier, orgIdentifier, projectIdentifier, pipelineIdentifier, inputSetIdentifier, ifMatch, branch, repoIdentifier, rootFolder, filePath, commitMsg, lastObjectId, baseBranch);

        // TODO: test validations
    }
    /**
     * Fetch Runtime Input Template for a Pipeline
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void runtimeInputTemplateTest() throws Exception {
        String accountIdentifier = null;
        String orgIdentifier = null;
        String projectIdentifier = null;
        String pipelineIdentifier = null;
        InputSetTemplateRequest body = null;
        String branch = null;
        String repoIdentifier = null;
        Boolean getDefaultFromOtherRepo = null;
        ResponseDTOInputSetTemplateWithReplacedExpressionsResponse response = api.runtimeInputTemplate(accountIdentifier, orgIdentifier, projectIdentifier, pipelineIdentifier, body, branch, repoIdentifier, getDefaultFromOtherRepo);

        // TODO: test validations
    }
}