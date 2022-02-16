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
import io.swagger.client.model.ResponseDTOLicenseUsage;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UsageApi {
    private ApiClient apiClient;

    public UsageApi() {
        this(Configuration.getDefaultApiClient());
    }

    public UsageApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for ccmgetLicenseUsage
     * @param module A Harness platform module. (required)
     * @param accountIdentifier Account id to get the license usage. (optional)
     * @param timestamp  (optional)
     * @param cdLicenseType  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call ccmgetLicenseUsageCall(String module, String accountIdentifier, Long timestamp, String cdLicenseType, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/ccm/api/usage/{module}"
            .replaceAll("\\{" + "module" + "\\}", apiClient.escapeString(module.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (accountIdentifier != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("accountIdentifier", accountIdentifier));
        if (timestamp != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("timestamp", timestamp));
        if (cdLicenseType != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("CDLicenseType", cdLicenseType));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "application/yaml"
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
    private com.squareup.okhttp.Call ccmgetLicenseUsageValidateBeforeCall(String module, String accountIdentifier, Long timestamp, String cdLicenseType, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'module' is set
        if (module == null) {
            throw new ApiException("Missing the required parameter 'module' when calling ccmgetLicenseUsage(Async)");
        }
        
        com.squareup.okhttp.Call call = ccmgetLicenseUsageCall(module, accountIdentifier, timestamp, cdLicenseType, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Gets License Usage By Module, Timestamp, and Account Identifier
     * 
     * @param module A Harness platform module. (required)
     * @param accountIdentifier Account id to get the license usage. (optional)
     * @param timestamp  (optional)
     * @param cdLicenseType  (optional)
     * @return ResponseDTOLicenseUsage
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ResponseDTOLicenseUsage ccmgetLicenseUsage(String module, String accountIdentifier, Long timestamp, String cdLicenseType) throws ApiException {
        ApiResponse<ResponseDTOLicenseUsage> resp = ccmgetLicenseUsageWithHttpInfo(module, accountIdentifier, timestamp, cdLicenseType);
        return resp.getData();
    }

    /**
     * Gets License Usage By Module, Timestamp, and Account Identifier
     * 
     * @param module A Harness platform module. (required)
     * @param accountIdentifier Account id to get the license usage. (optional)
     * @param timestamp  (optional)
     * @param cdLicenseType  (optional)
     * @return ApiResponse&lt;ResponseDTOLicenseUsage&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ResponseDTOLicenseUsage> ccmgetLicenseUsageWithHttpInfo(String module, String accountIdentifier, Long timestamp, String cdLicenseType) throws ApiException {
        com.squareup.okhttp.Call call = ccmgetLicenseUsageValidateBeforeCall(module, accountIdentifier, timestamp, cdLicenseType, null, null);
        Type localVarReturnType = new TypeToken<ResponseDTOLicenseUsage>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Gets License Usage By Module, Timestamp, and Account Identifier (asynchronously)
     * 
     * @param module A Harness platform module. (required)
     * @param accountIdentifier Account id to get the license usage. (optional)
     * @param timestamp  (optional)
     * @param cdLicenseType  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call ccmgetLicenseUsageAsync(String module, String accountIdentifier, Long timestamp, String cdLicenseType, final ApiCallback<ResponseDTOLicenseUsage> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = ccmgetLicenseUsageValidateBeforeCall(module, accountIdentifier, timestamp, cdLicenseType, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ResponseDTOLicenseUsage>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getLicenseUsage
     * @param module A Harness platform module. (required)
     * @param accountIdentifier Account id to get the license usage. (optional)
     * @param timestamp  (optional)
     * @param cdLicenseType  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getLicenseUsageCall(String module, String accountIdentifier, Long timestamp, String cdLicenseType, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/ng/api/usage/{module}"
            .replaceAll("\\{" + "module" + "\\}", apiClient.escapeString(module.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (accountIdentifier != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("accountIdentifier", accountIdentifier));
        if (timestamp != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("timestamp", timestamp));
        if (cdLicenseType != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("CDLicenseType", cdLicenseType));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "application/yaml"
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
    private com.squareup.okhttp.Call getLicenseUsageValidateBeforeCall(String module, String accountIdentifier, Long timestamp, String cdLicenseType, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'module' is set
        if (module == null) {
            throw new ApiException("Missing the required parameter 'module' when calling getLicenseUsage(Async)");
        }
        
        com.squareup.okhttp.Call call = getLicenseUsageCall(module, accountIdentifier, timestamp, cdLicenseType, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Gets License Usage By Module, Timestamp, and Account Identifier
     * 
     * @param module A Harness platform module. (required)
     * @param accountIdentifier Account id to get the license usage. (optional)
     * @param timestamp  (optional)
     * @param cdLicenseType  (optional)
     * @return ResponseDTOLicenseUsage
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ResponseDTOLicenseUsage getLicenseUsage(String module, String accountIdentifier, Long timestamp, String cdLicenseType) throws ApiException {
        ApiResponse<ResponseDTOLicenseUsage> resp = getLicenseUsageWithHttpInfo(module, accountIdentifier, timestamp, cdLicenseType);
        return resp.getData();
    }

    /**
     * Gets License Usage By Module, Timestamp, and Account Identifier
     * 
     * @param module A Harness platform module. (required)
     * @param accountIdentifier Account id to get the license usage. (optional)
     * @param timestamp  (optional)
     * @param cdLicenseType  (optional)
     * @return ApiResponse&lt;ResponseDTOLicenseUsage&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ResponseDTOLicenseUsage> getLicenseUsageWithHttpInfo(String module, String accountIdentifier, Long timestamp, String cdLicenseType) throws ApiException {
        com.squareup.okhttp.Call call = getLicenseUsageValidateBeforeCall(module, accountIdentifier, timestamp, cdLicenseType, null, null);
        Type localVarReturnType = new TypeToken<ResponseDTOLicenseUsage>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Gets License Usage By Module, Timestamp, and Account Identifier (asynchronously)
     * 
     * @param module A Harness platform module. (required)
     * @param accountIdentifier Account id to get the license usage. (optional)
     * @param timestamp  (optional)
     * @param cdLicenseType  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getLicenseUsageAsync(String module, String accountIdentifier, Long timestamp, String cdLicenseType, final ApiCallback<ResponseDTOLicenseUsage> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getLicenseUsageValidateBeforeCall(module, accountIdentifier, timestamp, cdLicenseType, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ResponseDTOLicenseUsage>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
