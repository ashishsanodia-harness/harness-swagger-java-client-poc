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

import io.swagger.client.ApiCallback;
import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.ApiResponse;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;
import io.swagger.client.ProgressRequestBody;
import io.swagger.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import io.swagger.client.model.Error;
import io.swagger.client.model.Failure;
import io.swagger.client.model.GitEntityBranchSummaryFilter;
import io.swagger.client.model.GitEntitySummaryFilter;
import io.swagger.client.model.ResponseDTOGitSyncRepoFilesList;
import io.swagger.client.model.ResponseDTOListGitSyncEntityList;
import io.swagger.client.model.ResponseDTOPageResponseGitSyncEntityList;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GitSyncEntitiesApi {
    private ApiClient apiClient;

    public GitSyncEntitiesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public GitSyncEntitiesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for listGitSyncEntitiesByType
     * @param entityType Entity Type (required)
     * @param projectIdentifier Project Identifier for the Entity (optional)
     * @param orgIdentifier Organization Identifier for the Entity (optional)
     * @param accountIdentifier Account Identifier for the Entity (optional)
     * @param gitSyncConfigId Git Sync Config Id (optional)
     * @param branch Branch Name (optional)
     * @param page Indicates the number of pages. Results for these pages will be retrieved. (optional, default to 0)
     * @param size The number of the elements to fetch (optional)
     * @param moduleType Module Type (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call listGitSyncEntitiesByTypeCall(String entityType, String projectIdentifier, String orgIdentifier, String accountIdentifier, String gitSyncConfigId, String branch, Integer page, Integer size, String moduleType, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/ng/api/git-sync-entities/{entityType}"
            .replaceAll("\\{" + "entityType" + "\\}", apiClient.escapeString(entityType.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (projectIdentifier != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("projectIdentifier", projectIdentifier));
        if (orgIdentifier != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("orgIdentifier", orgIdentifier));
        if (accountIdentifier != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("accountIdentifier", accountIdentifier));
        if (gitSyncConfigId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("gitSyncConfigId", gitSyncConfigId));
        if (branch != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("branch", branch));
        if (page != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("page", page));
        if (size != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("size", size));
        if (moduleType != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("moduleType", moduleType));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "application/yaml", "text/yaml", "text/html"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "ApiKey" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call listGitSyncEntitiesByTypeValidateBeforeCall(String entityType, String projectIdentifier, String orgIdentifier, String accountIdentifier, String gitSyncConfigId, String branch, Integer page, Integer size, String moduleType, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'entityType' is set
        if (entityType == null) {
            throw new ApiException("Missing the required parameter 'entityType' when calling listGitSyncEntitiesByType(Async)");
        }
        
        com.squareup.okhttp.Call call = listGitSyncEntitiesByTypeCall(entityType, projectIdentifier, orgIdentifier, accountIdentifier, gitSyncConfigId, branch, page, size, moduleType, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Lists Git Sync Entity filtered by their Type for the given scope
     * 
     * @param entityType Entity Type (required)
     * @param projectIdentifier Project Identifier for the Entity (optional)
     * @param orgIdentifier Organization Identifier for the Entity (optional)
     * @param accountIdentifier Account Identifier for the Entity (optional)
     * @param gitSyncConfigId Git Sync Config Id (optional)
     * @param branch Branch Name (optional)
     * @param page Indicates the number of pages. Results for these pages will be retrieved. (optional, default to 0)
     * @param size The number of the elements to fetch (optional)
     * @param moduleType Module Type (optional)
     * @return ResponseDTOPageResponseGitSyncEntityList
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ResponseDTOPageResponseGitSyncEntityList listGitSyncEntitiesByType(String entityType, String projectIdentifier, String orgIdentifier, String accountIdentifier, String gitSyncConfigId, String branch, Integer page, Integer size, String moduleType) throws ApiException {
        ApiResponse<ResponseDTOPageResponseGitSyncEntityList> resp = listGitSyncEntitiesByTypeWithHttpInfo(entityType, projectIdentifier, orgIdentifier, accountIdentifier, gitSyncConfigId, branch, page, size, moduleType);
        return resp.getData();
    }

    /**
     * Lists Git Sync Entity filtered by their Type for the given scope
     * 
     * @param entityType Entity Type (required)
     * @param projectIdentifier Project Identifier for the Entity (optional)
     * @param orgIdentifier Organization Identifier for the Entity (optional)
     * @param accountIdentifier Account Identifier for the Entity (optional)
     * @param gitSyncConfigId Git Sync Config Id (optional)
     * @param branch Branch Name (optional)
     * @param page Indicates the number of pages. Results for these pages will be retrieved. (optional, default to 0)
     * @param size The number of the elements to fetch (optional)
     * @param moduleType Module Type (optional)
     * @return ApiResponse&lt;ResponseDTOPageResponseGitSyncEntityList&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ResponseDTOPageResponseGitSyncEntityList> listGitSyncEntitiesByTypeWithHttpInfo(String entityType, String projectIdentifier, String orgIdentifier, String accountIdentifier, String gitSyncConfigId, String branch, Integer page, Integer size, String moduleType) throws ApiException {
        com.squareup.okhttp.Call call = listGitSyncEntitiesByTypeValidateBeforeCall(entityType, projectIdentifier, orgIdentifier, accountIdentifier, gitSyncConfigId, branch, page, size, moduleType, null, null);
        Type localVarReturnType = new TypeToken<ResponseDTOPageResponseGitSyncEntityList>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Lists Git Sync Entity filtered by their Type for the given scope (asynchronously)
     * 
     * @param entityType Entity Type (required)
     * @param projectIdentifier Project Identifier for the Entity (optional)
     * @param orgIdentifier Organization Identifier for the Entity (optional)
     * @param accountIdentifier Account Identifier for the Entity (optional)
     * @param gitSyncConfigId Git Sync Config Id (optional)
     * @param branch Branch Name (optional)
     * @param page Indicates the number of pages. Results for these pages will be retrieved. (optional, default to 0)
     * @param size The number of the elements to fetch (optional)
     * @param moduleType Module Type (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call listGitSyncEntitiesByTypeAsync(String entityType, String projectIdentifier, String orgIdentifier, String accountIdentifier, String gitSyncConfigId, String branch, Integer page, Integer size, String moduleType, final ApiCallback<ResponseDTOPageResponseGitSyncEntityList> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = listGitSyncEntitiesByTypeValidateBeforeCall(entityType, projectIdentifier, orgIdentifier, accountIdentifier, gitSyncConfigId, branch, page, size, moduleType, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ResponseDTOPageResponseGitSyncEntityList>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for listGitSyncEntitiesSummaryForRepoAndBranch
     * @param body This filters the Git Sync Entity based on multiple parameters (required)
     * @param branch Branch Name (required)
     * @param projectIdentifier Project Identifier for the Entity (optional)
     * @param orgIdentifier Organization Identifier for the Entity (optional)
     * @param accountIdentifier Account Identifier for the Entity (optional)
     * @param size The number of the elements to fetch (optional)
     * @param gitSyncConfigId Git Sync Config Id (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call listGitSyncEntitiesSummaryForRepoAndBranchCall(GitEntityBranchSummaryFilter body, String branch, String projectIdentifier, String orgIdentifier, String accountIdentifier, Integer size, String gitSyncConfigId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/ng/api/git-sync-entities/branch/{branch}"
            .replaceAll("\\{" + "branch" + "\\}", apiClient.escapeString(branch.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (projectIdentifier != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("projectIdentifier", projectIdentifier));
        if (orgIdentifier != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("orgIdentifier", orgIdentifier));
        if (accountIdentifier != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("accountIdentifier", accountIdentifier));
        if (size != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("size", size));
        if (gitSyncConfigId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("gitSyncConfigId", gitSyncConfigId));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "application/yaml", "text/yaml", "text/html"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json", "text/yaml", "text/html"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "ApiKey" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call listGitSyncEntitiesSummaryForRepoAndBranchValidateBeforeCall(GitEntityBranchSummaryFilter body, String branch, String projectIdentifier, String orgIdentifier, String accountIdentifier, Integer size, String gitSyncConfigId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling listGitSyncEntitiesSummaryForRepoAndBranch(Async)");
        }
        // verify the required parameter 'branch' is set
        if (branch == null) {
            throw new ApiException("Missing the required parameter 'branch' when calling listGitSyncEntitiesSummaryForRepoAndBranch(Async)");
        }
        
        com.squareup.okhttp.Call call = listGitSyncEntitiesSummaryForRepoAndBranchCall(body, branch, projectIdentifier, orgIdentifier, accountIdentifier, size, gitSyncConfigId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Lists Git Sync Entity by product for the given Repo, Branch and list of Entity Types
     * 
     * @param body This filters the Git Sync Entity based on multiple parameters (required)
     * @param branch Branch Name (required)
     * @param projectIdentifier Project Identifier for the Entity (optional)
     * @param orgIdentifier Organization Identifier for the Entity (optional)
     * @param accountIdentifier Account Identifier for the Entity (optional)
     * @param size The number of the elements to fetch (optional)
     * @param gitSyncConfigId Git Sync Config Id (optional)
     * @return ResponseDTOListGitSyncEntityList
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ResponseDTOListGitSyncEntityList listGitSyncEntitiesSummaryForRepoAndBranch(GitEntityBranchSummaryFilter body, String branch, String projectIdentifier, String orgIdentifier, String accountIdentifier, Integer size, String gitSyncConfigId) throws ApiException {
        ApiResponse<ResponseDTOListGitSyncEntityList> resp = listGitSyncEntitiesSummaryForRepoAndBranchWithHttpInfo(body, branch, projectIdentifier, orgIdentifier, accountIdentifier, size, gitSyncConfigId);
        return resp.getData();
    }

    /**
     * Lists Git Sync Entity by product for the given Repo, Branch and list of Entity Types
     * 
     * @param body This filters the Git Sync Entity based on multiple parameters (required)
     * @param branch Branch Name (required)
     * @param projectIdentifier Project Identifier for the Entity (optional)
     * @param orgIdentifier Organization Identifier for the Entity (optional)
     * @param accountIdentifier Account Identifier for the Entity (optional)
     * @param size The number of the elements to fetch (optional)
     * @param gitSyncConfigId Git Sync Config Id (optional)
     * @return ApiResponse&lt;ResponseDTOListGitSyncEntityList&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ResponseDTOListGitSyncEntityList> listGitSyncEntitiesSummaryForRepoAndBranchWithHttpInfo(GitEntityBranchSummaryFilter body, String branch, String projectIdentifier, String orgIdentifier, String accountIdentifier, Integer size, String gitSyncConfigId) throws ApiException {
        com.squareup.okhttp.Call call = listGitSyncEntitiesSummaryForRepoAndBranchValidateBeforeCall(body, branch, projectIdentifier, orgIdentifier, accountIdentifier, size, gitSyncConfigId, null, null);
        Type localVarReturnType = new TypeToken<ResponseDTOListGitSyncEntityList>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Lists Git Sync Entity by product for the given Repo, Branch and list of Entity Types (asynchronously)
     * 
     * @param body This filters the Git Sync Entity based on multiple parameters (required)
     * @param branch Branch Name (required)
     * @param projectIdentifier Project Identifier for the Entity (optional)
     * @param orgIdentifier Organization Identifier for the Entity (optional)
     * @param accountIdentifier Account Identifier for the Entity (optional)
     * @param size The number of the elements to fetch (optional)
     * @param gitSyncConfigId Git Sync Config Id (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call listGitSyncEntitiesSummaryForRepoAndBranchAsync(GitEntityBranchSummaryFilter body, String branch, String projectIdentifier, String orgIdentifier, String accountIdentifier, Integer size, String gitSyncConfigId, final ApiCallback<ResponseDTOListGitSyncEntityList> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = listGitSyncEntitiesSummaryForRepoAndBranchValidateBeforeCall(body, branch, projectIdentifier, orgIdentifier, accountIdentifier, size, gitSyncConfigId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ResponseDTOListGitSyncEntityList>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for listGitSyncEntitiesSummaryForRepoAndTypes
     * @param body Filter Git Sync Entity based on multiple parameters (required)
     * @param projectIdentifier Project Identifier for the Entity (optional)
     * @param orgIdentifier Organization Identifier for the Entity (optional)
     * @param accountIdentifier Account Identifier for the Entity (optional)
     * @param size The number of the elements to fetch (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call listGitSyncEntitiesSummaryForRepoAndTypesCall(GitEntitySummaryFilter body, String projectIdentifier, String orgIdentifier, String accountIdentifier, Integer size, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/ng/api/git-sync-entities/summary";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (projectIdentifier != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("projectIdentifier", projectIdentifier));
        if (orgIdentifier != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("orgIdentifier", orgIdentifier));
        if (accountIdentifier != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("accountIdentifier", accountIdentifier));
        if (size != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("size", size));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "application/yaml", "text/yaml", "text/html"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json", "text/yaml", "text/html"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "ApiKey" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call listGitSyncEntitiesSummaryForRepoAndTypesValidateBeforeCall(GitEntitySummaryFilter body, String projectIdentifier, String orgIdentifier, String accountIdentifier, Integer size, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling listGitSyncEntitiesSummaryForRepoAndTypes(Async)");
        }
        
        com.squareup.okhttp.Call call = listGitSyncEntitiesSummaryForRepoAndTypesCall(body, projectIdentifier, orgIdentifier, accountIdentifier, size, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Lists Git Sync Entity by product for the given list of Repos and Entity Types
     * 
     * @param body Filter Git Sync Entity based on multiple parameters (required)
     * @param projectIdentifier Project Identifier for the Entity (optional)
     * @param orgIdentifier Organization Identifier for the Entity (optional)
     * @param accountIdentifier Account Identifier for the Entity (optional)
     * @param size The number of the elements to fetch (optional)
     * @return ResponseDTOGitSyncRepoFilesList
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ResponseDTOGitSyncRepoFilesList listGitSyncEntitiesSummaryForRepoAndTypes(GitEntitySummaryFilter body, String projectIdentifier, String orgIdentifier, String accountIdentifier, Integer size) throws ApiException {
        ApiResponse<ResponseDTOGitSyncRepoFilesList> resp = listGitSyncEntitiesSummaryForRepoAndTypesWithHttpInfo(body, projectIdentifier, orgIdentifier, accountIdentifier, size);
        return resp.getData();
    }

    /**
     * Lists Git Sync Entity by product for the given list of Repos and Entity Types
     * 
     * @param body Filter Git Sync Entity based on multiple parameters (required)
     * @param projectIdentifier Project Identifier for the Entity (optional)
     * @param orgIdentifier Organization Identifier for the Entity (optional)
     * @param accountIdentifier Account Identifier for the Entity (optional)
     * @param size The number of the elements to fetch (optional)
     * @return ApiResponse&lt;ResponseDTOGitSyncRepoFilesList&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ResponseDTOGitSyncRepoFilesList> listGitSyncEntitiesSummaryForRepoAndTypesWithHttpInfo(GitEntitySummaryFilter body, String projectIdentifier, String orgIdentifier, String accountIdentifier, Integer size) throws ApiException {
        com.squareup.okhttp.Call call = listGitSyncEntitiesSummaryForRepoAndTypesValidateBeforeCall(body, projectIdentifier, orgIdentifier, accountIdentifier, size, null, null);
        Type localVarReturnType = new TypeToken<ResponseDTOGitSyncRepoFilesList>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Lists Git Sync Entity by product for the given list of Repos and Entity Types (asynchronously)
     * 
     * @param body Filter Git Sync Entity based on multiple parameters (required)
     * @param projectIdentifier Project Identifier for the Entity (optional)
     * @param orgIdentifier Organization Identifier for the Entity (optional)
     * @param accountIdentifier Account Identifier for the Entity (optional)
     * @param size The number of the elements to fetch (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call listGitSyncEntitiesSummaryForRepoAndTypesAsync(GitEntitySummaryFilter body, String projectIdentifier, String orgIdentifier, String accountIdentifier, Integer size, final ApiCallback<ResponseDTOGitSyncRepoFilesList> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = listGitSyncEntitiesSummaryForRepoAndTypesValidateBeforeCall(body, projectIdentifier, orgIdentifier, accountIdentifier, size, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ResponseDTOGitSyncRepoFilesList>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}