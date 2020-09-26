/*
 * Telnyx API
 * SIP trunking, SMS, MMS, Call Control and Telephony Data Services.
 *
 * OpenAPI spec version: 2.0.0
 * Contact: support@telnyx.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.telnyx.sdk.apis;

import com.telnyx.sdk.ApiCallback;
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.Pair;
import com.telnyx.sdk.ProgressRequestBody;
import com.telnyx.sdk.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.telnyx.sdk.models.GetRecordingResponse;
import com.telnyx.sdk.models.ListRecordingsResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RecordingsCommandsApi {
    private ApiClient apiClient;

    public RecordingsCommandsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public RecordingsCommandsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for listRecordings
     * @param filterConferenceId Return only recordings associated with a given conference (optional)
     * @param filterCreatedAtGte Return only recordings created later than or at given ISO 8601 datetime (optional)
     * @param filterCreatedAtLte Return only recordings created earlier than or at given ISO 8601 datetime (optional)
     * @param pageNumber The page number to load (optional, default to 1)
     * @param pageSize The size of the page (optional, default to 20)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call listRecordingsCall(String filterConferenceId, String filterCreatedAtGte, String filterCreatedAtLte, Integer pageNumber, Integer pageSize, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/recordings";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (filterConferenceId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("filter[conference_id]", filterConferenceId));
        if (filterCreatedAtGte != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("filter[created_at][gte]", filterCreatedAtGte));
        if (filterCreatedAtLte != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("filter[created_at][lte]", filterCreatedAtLte));
        if (pageNumber != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("page[number]", pageNumber));
        if (pageSize != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("page[size]", pageSize));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
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

        String[] localVarAuthNames = new String[] { "bearerAuth" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call listRecordingsValidateBeforeCall(String filterConferenceId, String filterCreatedAtGte, String filterCreatedAtLte, Integer pageNumber, Integer pageSize, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = listRecordingsCall(filterConferenceId, filterCreatedAtGte, filterCreatedAtLte, pageNumber, pageSize, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * List recordings
     * Lists recordings for the authenticated user
     * @param filterConferenceId Return only recordings associated with a given conference (optional)
     * @param filterCreatedAtGte Return only recordings created later than or at given ISO 8601 datetime (optional)
     * @param filterCreatedAtLte Return only recordings created earlier than or at given ISO 8601 datetime (optional)
     * @param pageNumber The page number to load (optional, default to 1)
     * @param pageSize The size of the page (optional, default to 20)
     * @return ListRecordingsResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ListRecordingsResponse listRecordings(String filterConferenceId, String filterCreatedAtGte, String filterCreatedAtLte, Integer pageNumber, Integer pageSize) throws ApiException {
        ApiResponse<ListRecordingsResponse> resp = listRecordingsWithHttpInfo(filterConferenceId, filterCreatedAtGte, filterCreatedAtLte, pageNumber, pageSize);
        return resp.getData();
    }

    /**
     * List recordings
     * Lists recordings for the authenticated user
     * @param filterConferenceId Return only recordings associated with a given conference (optional)
     * @param filterCreatedAtGte Return only recordings created later than or at given ISO 8601 datetime (optional)
     * @param filterCreatedAtLte Return only recordings created earlier than or at given ISO 8601 datetime (optional)
     * @param pageNumber The page number to load (optional, default to 1)
     * @param pageSize The size of the page (optional, default to 20)
     * @return ApiResponse&lt;ListRecordingsResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ListRecordingsResponse> listRecordingsWithHttpInfo(String filterConferenceId, String filterCreatedAtGte, String filterCreatedAtLte, Integer pageNumber, Integer pageSize) throws ApiException {
        com.squareup.okhttp.Call call = listRecordingsValidateBeforeCall(filterConferenceId, filterCreatedAtGte, filterCreatedAtLte, pageNumber, pageSize, null, null);
        Type localVarReturnType = new TypeToken<ListRecordingsResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * List recordings (asynchronously)
     * Lists recordings for the authenticated user
     * @param filterConferenceId Return only recordings associated with a given conference (optional)
     * @param filterCreatedAtGte Return only recordings created later than or at given ISO 8601 datetime (optional)
     * @param filterCreatedAtLte Return only recordings created earlier than or at given ISO 8601 datetime (optional)
     * @param pageNumber The page number to load (optional, default to 1)
     * @param pageSize The size of the page (optional, default to 20)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call listRecordingsAsync(String filterConferenceId, String filterCreatedAtGte, String filterCreatedAtLte, Integer pageNumber, Integer pageSize, final ApiCallback<ListRecordingsResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = listRecordingsValidateBeforeCall(filterConferenceId, filterCreatedAtGte, filterCreatedAtLte, pageNumber, pageSize, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ListRecordingsResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for retrieveRecording
     * @param id Uniquely identifies the recording (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call retrieveRecordingCall(String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/recordings/{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
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

        String[] localVarAuthNames = new String[] { "bearerAuth" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call retrieveRecordingValidateBeforeCall(String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling retrieveRecording(Async)");
        }
        
        com.squareup.okhttp.Call call = retrieveRecordingCall(id, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Retrieve a recording
     * Retrieve a recording from the authenticated user&#x27;s recordings
     * @param id Uniquely identifies the recording (required)
     * @return GetRecordingResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GetRecordingResponse retrieveRecording(String id) throws ApiException {
        ApiResponse<GetRecordingResponse> resp = retrieveRecordingWithHttpInfo(id);
        return resp.getData();
    }

    /**
     * Retrieve a recording
     * Retrieve a recording from the authenticated user&#x27;s recordings
     * @param id Uniquely identifies the recording (required)
     * @return ApiResponse&lt;GetRecordingResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<GetRecordingResponse> retrieveRecordingWithHttpInfo(String id) throws ApiException {
        com.squareup.okhttp.Call call = retrieveRecordingValidateBeforeCall(id, null, null);
        Type localVarReturnType = new TypeToken<GetRecordingResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Retrieve a recording (asynchronously)
     * Retrieve a recording from the authenticated user&#x27;s recordings
     * @param id Uniquely identifies the recording (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call retrieveRecordingAsync(String id, final ApiCallback<GetRecordingResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = retrieveRecordingValidateBeforeCall(id, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<GetRecordingResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
