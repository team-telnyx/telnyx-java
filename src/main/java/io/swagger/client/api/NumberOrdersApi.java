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


import io.swagger.client.model.CreateNumberOrderResponse;
import io.swagger.client.model.Errors;
import io.swagger.client.model.ListNumberOrdersResponse;
import io.swagger.client.model.NumberOrder;
import io.swagger.client.model.RetrieveNumberOrderResponse;
import io.swagger.client.model.UpdateNumberOrderResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NumberOrdersApi {
    private ApiClient apiClient;

    public NumberOrdersApi() {
        this(Configuration.getDefaultApiClient());
    }

    public NumberOrdersApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for createNumberOrder
     * @param body  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call createNumberOrderCall(NumberOrder body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/number_orders";

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
            "application/json"
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
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call createNumberOrderValidateBeforeCall(NumberOrder body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling createNumberOrder(Async)");
        }
        
        com.squareup.okhttp.Call call = createNumberOrderCall(body, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Create Phone Number Order
     * Creates a Phone Number Order
     * @param body  (required)
     * @return CreateNumberOrderResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CreateNumberOrderResponse createNumberOrder(NumberOrder body) throws ApiException {
        ApiResponse<CreateNumberOrderResponse> resp = createNumberOrderWithHttpInfo(body);
        return resp.getData();
    }

    /**
     * Create Phone Number Order
     * Creates a Phone Number Order
     * @param body  (required)
     * @return ApiResponse&lt;CreateNumberOrderResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CreateNumberOrderResponse> createNumberOrderWithHttpInfo(NumberOrder body) throws ApiException {
        com.squareup.okhttp.Call call = createNumberOrderValidateBeforeCall(body, null, null);
        Type localVarReturnType = new TypeToken<CreateNumberOrderResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Create Phone Number Order (asynchronously)
     * Creates a Phone Number Order
     * @param body  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createNumberOrderAsync(NumberOrder body, final ApiCallback<CreateNumberOrderResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = createNumberOrderValidateBeforeCall(body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CreateNumberOrderResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for listNumberOrders
     * @param filterStatus Filter number orders by status (optional)
     * @param filterCreatedAtGt Filter number orders later than this value (optional)
     * @param filterCreatedAtLt Filter number orders earlier than this value (optional)
     * @param filterPhoneNumbersPhoneNumber Filter number orders having these phone numbers (optional)
     * @param filterCustomerReference Filter number orders via the customer reference set (optional)
     * @param filterRequirementsMet Filter number orders by requirements met (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call listNumberOrdersCall(String filterStatus, String filterCreatedAtGt, String filterCreatedAtLt, String filterPhoneNumbersPhoneNumber, String filterCustomerReference, Boolean filterRequirementsMet, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/number_orders";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (filterStatus != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("filter[status]", filterStatus));
        if (filterCreatedAtGt != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("filter[created_at][gt]", filterCreatedAtGt));
        if (filterCreatedAtLt != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("filter[created_at][lt]", filterCreatedAtLt));
        if (filterPhoneNumbersPhoneNumber != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("filter[phone_numbers.phone_number]", filterPhoneNumbersPhoneNumber));
        if (filterCustomerReference != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("filter[customer_reference]", filterCustomerReference));
        if (filterRequirementsMet != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("filter[requirements_met]", filterRequirementsMet));

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
    private com.squareup.okhttp.Call listNumberOrdersValidateBeforeCall(String filterStatus, String filterCreatedAtGt, String filterCreatedAtLt, String filterPhoneNumbersPhoneNumber, String filterCustomerReference, Boolean filterRequirementsMet, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = listNumberOrdersCall(filterStatus, filterCreatedAtGt, filterCreatedAtLt, filterPhoneNumbersPhoneNumber, filterCustomerReference, filterRequirementsMet, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get multiple Number Orders
     * Get a paginated list of Number Orders
     * @param filterStatus Filter number orders by status (optional)
     * @param filterCreatedAtGt Filter number orders later than this value (optional)
     * @param filterCreatedAtLt Filter number orders earlier than this value (optional)
     * @param filterPhoneNumbersPhoneNumber Filter number orders having these phone numbers (optional)
     * @param filterCustomerReference Filter number orders via the customer reference set (optional)
     * @param filterRequirementsMet Filter number orders by requirements met (optional)
     * @return ListNumberOrdersResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ListNumberOrdersResponse listNumberOrders(String filterStatus, String filterCreatedAtGt, String filterCreatedAtLt, String filterPhoneNumbersPhoneNumber, String filterCustomerReference, Boolean filterRequirementsMet) throws ApiException {
        ApiResponse<ListNumberOrdersResponse> resp = listNumberOrdersWithHttpInfo(filterStatus, filterCreatedAtGt, filterCreatedAtLt, filterPhoneNumbersPhoneNumber, filterCustomerReference, filterRequirementsMet);
        return resp.getData();
    }

    /**
     * Get multiple Number Orders
     * Get a paginated list of Number Orders
     * @param filterStatus Filter number orders by status (optional)
     * @param filterCreatedAtGt Filter number orders later than this value (optional)
     * @param filterCreatedAtLt Filter number orders earlier than this value (optional)
     * @param filterPhoneNumbersPhoneNumber Filter number orders having these phone numbers (optional)
     * @param filterCustomerReference Filter number orders via the customer reference set (optional)
     * @param filterRequirementsMet Filter number orders by requirements met (optional)
     * @return ApiResponse&lt;ListNumberOrdersResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ListNumberOrdersResponse> listNumberOrdersWithHttpInfo(String filterStatus, String filterCreatedAtGt, String filterCreatedAtLt, String filterPhoneNumbersPhoneNumber, String filterCustomerReference, Boolean filterRequirementsMet) throws ApiException {
        com.squareup.okhttp.Call call = listNumberOrdersValidateBeforeCall(filterStatus, filterCreatedAtGt, filterCreatedAtLt, filterPhoneNumbersPhoneNumber, filterCustomerReference, filterRequirementsMet, null, null);
        Type localVarReturnType = new TypeToken<ListNumberOrdersResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get multiple Number Orders (asynchronously)
     * Get a paginated list of Number Orders
     * @param filterStatus Filter number orders by status (optional)
     * @param filterCreatedAtGt Filter number orders later than this value (optional)
     * @param filterCreatedAtLt Filter number orders earlier than this value (optional)
     * @param filterPhoneNumbersPhoneNumber Filter number orders having these phone numbers (optional)
     * @param filterCustomerReference Filter number orders via the customer reference set (optional)
     * @param filterRequirementsMet Filter number orders by requirements met (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call listNumberOrdersAsync(String filterStatus, String filterCreatedAtGt, String filterCreatedAtLt, String filterPhoneNumbersPhoneNumber, String filterCustomerReference, Boolean filterRequirementsMet, final ApiCallback<ListNumberOrdersResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = listNumberOrdersValidateBeforeCall(filterStatus, filterCreatedAtGt, filterCreatedAtLt, filterPhoneNumbersPhoneNumber, filterCustomerReference, filterRequirementsMet, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ListNumberOrdersResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for retrieveNumberOrder
     * @param numberOrderId The number order id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call retrieveNumberOrderCall(String numberOrderId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/number_orders/{number_order_id}"
            .replaceAll("\\{" + "number_order_id" + "\\}", apiClient.escapeString(numberOrderId.toString()));

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
    private com.squareup.okhttp.Call retrieveNumberOrderValidateBeforeCall(String numberOrderId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'numberOrderId' is set
        if (numberOrderId == null) {
            throw new ApiException("Missing the required parameter 'numberOrderId' when calling retrieveNumberOrder(Async)");
        }
        
        com.squareup.okhttp.Call call = retrieveNumberOrderCall(numberOrderId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get a single phone number order
     * Get an existing single phone number order
     * @param numberOrderId The number order id (required)
     * @return RetrieveNumberOrderResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public RetrieveNumberOrderResponse retrieveNumberOrder(String numberOrderId) throws ApiException {
        ApiResponse<RetrieveNumberOrderResponse> resp = retrieveNumberOrderWithHttpInfo(numberOrderId);
        return resp.getData();
    }

    /**
     * Get a single phone number order
     * Get an existing single phone number order
     * @param numberOrderId The number order id (required)
     * @return ApiResponse&lt;RetrieveNumberOrderResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<RetrieveNumberOrderResponse> retrieveNumberOrderWithHttpInfo(String numberOrderId) throws ApiException {
        com.squareup.okhttp.Call call = retrieveNumberOrderValidateBeforeCall(numberOrderId, null, null);
        Type localVarReturnType = new TypeToken<RetrieveNumberOrderResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get a single phone number order (asynchronously)
     * Get an existing single phone number order
     * @param numberOrderId The number order id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call retrieveNumberOrderAsync(String numberOrderId, final ApiCallback<RetrieveNumberOrderResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = retrieveNumberOrderValidateBeforeCall(numberOrderId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<RetrieveNumberOrderResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for updateNumberOrder
     * @param body  (required)
     * @param numberOrderId The number order id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call updateNumberOrderCall(NumberOrder body, String numberOrderId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/number_orders/{number_order_id}"
            .replaceAll("\\{" + "number_order_id" + "\\}", apiClient.escapeString(numberOrderId.toString()));

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
            "application/json"
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
        return apiClient.buildCall(localVarPath, "PATCH", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call updateNumberOrderValidateBeforeCall(NumberOrder body, String numberOrderId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling updateNumberOrder(Async)");
        }
        // verify the required parameter 'numberOrderId' is set
        if (numberOrderId == null) {
            throw new ApiException("Missing the required parameter 'numberOrderId' when calling updateNumberOrder(Async)");
        }
        
        com.squareup.okhttp.Call call = updateNumberOrderCall(body, numberOrderId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Update phone number order
     * Updates a Phone Number Order
     * @param body  (required)
     * @param numberOrderId The number order id (required)
     * @return UpdateNumberOrderResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public UpdateNumberOrderResponse updateNumberOrder(NumberOrder body, String numberOrderId) throws ApiException {
        ApiResponse<UpdateNumberOrderResponse> resp = updateNumberOrderWithHttpInfo(body, numberOrderId);
        return resp.getData();
    }

    /**
     * Update phone number order
     * Updates a Phone Number Order
     * @param body  (required)
     * @param numberOrderId The number order id (required)
     * @return ApiResponse&lt;UpdateNumberOrderResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<UpdateNumberOrderResponse> updateNumberOrderWithHttpInfo(NumberOrder body, String numberOrderId) throws ApiException {
        com.squareup.okhttp.Call call = updateNumberOrderValidateBeforeCall(body, numberOrderId, null, null);
        Type localVarReturnType = new TypeToken<UpdateNumberOrderResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Update phone number order (asynchronously)
     * Updates a Phone Number Order
     * @param body  (required)
     * @param numberOrderId The number order id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call updateNumberOrderAsync(NumberOrder body, String numberOrderId, final ApiCallback<UpdateNumberOrderResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = updateNumberOrderValidateBeforeCall(body, numberOrderId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<UpdateNumberOrderResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
