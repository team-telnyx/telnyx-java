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


import com.telnyx.sdk.models.Errors;
import com.telnyx.sdk.models.ListCallEventsResponse;
import java.util.UUID;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DebuggingApi {
    private ApiClient apiClient;

    public DebuggingApi() {
        this(Configuration.getDefaultApiClient());
    }

    public DebuggingApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for listCallEvents
     * @param filterCallLegId The unique identifier of an individual call leg. (optional)
     * @param filterCallSessionId The unique identifier of the call control session. A session may include multiple call leg events. (optional)
     * @param filterStatus Event status (optional)
     * @param filterType Event type (optional)
     * @param filterEventTimestampGt Event timestamp: greater than (optional)
     * @param filterEventTimestampGte Event timestamp: greater than or equal (optional)
     * @param filterEventTimestampLt Event timestamp: lower than (optional)
     * @param filterEventTimestampLte Event timestamp: lower than or equal (optional)
     * @param filterEventTimestampEq Event timestamp: equal (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call listCallEventsCall(UUID filterCallLegId, UUID filterCallSessionId, String filterStatus, String filterType, String filterEventTimestampGt, String filterEventTimestampGte, String filterEventTimestampLt, String filterEventTimestampLte, String filterEventTimestampEq, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/call_events";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (filterCallLegId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("filter[call_leg_id]", filterCallLegId));
        if (filterCallSessionId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("filter[call_session_id]", filterCallSessionId));
        if (filterStatus != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("filter[status]", filterStatus));
        if (filterType != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("filter[type]", filterType));
        if (filterEventTimestampGt != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("filter[event_timestamp][gt]", filterEventTimestampGt));
        if (filterEventTimestampGte != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("filter[event_timestamp][gte]", filterEventTimestampGte));
        if (filterEventTimestampLt != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("filter[event_timestamp][lt]", filterEventTimestampLt));
        if (filterEventTimestampLte != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("filter[event_timestamp][lte]", filterEventTimestampLte));
        if (filterEventTimestampEq != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("filter[event_timestamp][eq]", filterEventTimestampEq));

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
    private com.squareup.okhttp.Call listCallEventsValidateBeforeCall(UUID filterCallLegId, UUID filterCallSessionId, String filterStatus, String filterType, String filterEventTimestampGt, String filterEventTimestampGte, String filterEventTimestampLt, String filterEventTimestampLte, String filterEventTimestampEq, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = listCallEventsCall(filterCallLegId, filterCallSessionId, filterStatus, filterType, filterEventTimestampGt, filterEventTimestampGte, filterEventTimestampLt, filterEventTimestampLte, filterEventTimestampEq, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * List call events
     * Filters call events by given filter parameters. Events are ordered by &#x60;event_timestamp&#x60;. If filter for &#x60;call_leg_id&#x60; or &#x60;call_session_id&#x60; is not present, it only filters events from the last 24 hours.  **Note**: Only one &#x60;filter[event_timestamp]&#x60; can be passed. 
     * @param filterCallLegId The unique identifier of an individual call leg. (optional)
     * @param filterCallSessionId The unique identifier of the call control session. A session may include multiple call leg events. (optional)
     * @param filterStatus Event status (optional)
     * @param filterType Event type (optional)
     * @param filterEventTimestampGt Event timestamp: greater than (optional)
     * @param filterEventTimestampGte Event timestamp: greater than or equal (optional)
     * @param filterEventTimestampLt Event timestamp: lower than (optional)
     * @param filterEventTimestampLte Event timestamp: lower than or equal (optional)
     * @param filterEventTimestampEq Event timestamp: equal (optional)
     * @return ListCallEventsResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ListCallEventsResponse listCallEvents(UUID filterCallLegId, UUID filterCallSessionId, String filterStatus, String filterType, String filterEventTimestampGt, String filterEventTimestampGte, String filterEventTimestampLt, String filterEventTimestampLte, String filterEventTimestampEq) throws ApiException {
        ApiResponse<ListCallEventsResponse> resp = listCallEventsWithHttpInfo(filterCallLegId, filterCallSessionId, filterStatus, filterType, filterEventTimestampGt, filterEventTimestampGte, filterEventTimestampLt, filterEventTimestampLte, filterEventTimestampEq);
        return resp.getData();
    }

    /**
     * List call events
     * Filters call events by given filter parameters. Events are ordered by &#x60;event_timestamp&#x60;. If filter for &#x60;call_leg_id&#x60; or &#x60;call_session_id&#x60; is not present, it only filters events from the last 24 hours.  **Note**: Only one &#x60;filter[event_timestamp]&#x60; can be passed. 
     * @param filterCallLegId The unique identifier of an individual call leg. (optional)
     * @param filterCallSessionId The unique identifier of the call control session. A session may include multiple call leg events. (optional)
     * @param filterStatus Event status (optional)
     * @param filterType Event type (optional)
     * @param filterEventTimestampGt Event timestamp: greater than (optional)
     * @param filterEventTimestampGte Event timestamp: greater than or equal (optional)
     * @param filterEventTimestampLt Event timestamp: lower than (optional)
     * @param filterEventTimestampLte Event timestamp: lower than or equal (optional)
     * @param filterEventTimestampEq Event timestamp: equal (optional)
     * @return ApiResponse&lt;ListCallEventsResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ListCallEventsResponse> listCallEventsWithHttpInfo(UUID filterCallLegId, UUID filterCallSessionId, String filterStatus, String filterType, String filterEventTimestampGt, String filterEventTimestampGte, String filterEventTimestampLt, String filterEventTimestampLte, String filterEventTimestampEq) throws ApiException {
        com.squareup.okhttp.Call call = listCallEventsValidateBeforeCall(filterCallLegId, filterCallSessionId, filterStatus, filterType, filterEventTimestampGt, filterEventTimestampGte, filterEventTimestampLt, filterEventTimestampLte, filterEventTimestampEq, null, null);
        Type localVarReturnType = new TypeToken<ListCallEventsResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * List call events (asynchronously)
     * Filters call events by given filter parameters. Events are ordered by &#x60;event_timestamp&#x60;. If filter for &#x60;call_leg_id&#x60; or &#x60;call_session_id&#x60; is not present, it only filters events from the last 24 hours.  **Note**: Only one &#x60;filter[event_timestamp]&#x60; can be passed. 
     * @param filterCallLegId The unique identifier of an individual call leg. (optional)
     * @param filterCallSessionId The unique identifier of the call control session. A session may include multiple call leg events. (optional)
     * @param filterStatus Event status (optional)
     * @param filterType Event type (optional)
     * @param filterEventTimestampGt Event timestamp: greater than (optional)
     * @param filterEventTimestampGte Event timestamp: greater than or equal (optional)
     * @param filterEventTimestampLt Event timestamp: lower than (optional)
     * @param filterEventTimestampLte Event timestamp: lower than or equal (optional)
     * @param filterEventTimestampEq Event timestamp: equal (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call listCallEventsAsync(UUID filterCallLegId, UUID filterCallSessionId, String filterStatus, String filterType, String filterEventTimestampGt, String filterEventTimestampGte, String filterEventTimestampLt, String filterEventTimestampLte, String filterEventTimestampEq, final ApiCallback<ListCallEventsResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = listCallEventsValidateBeforeCall(filterCallLegId, filterCallSessionId, filterStatus, filterType, filterEventTimestampGt, filterEventTimestampGte, filterEventTimestampLt, filterEventTimestampLte, filterEventTimestampEq, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ListCallEventsResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}