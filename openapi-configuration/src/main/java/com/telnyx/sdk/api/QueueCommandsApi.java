package com.telnyx.sdk.api;

import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.Pair;

import javax.ws.rs.core.GenericType;

import com.telnyx.sdk.model.CreateQueueRequest;
import com.telnyx.sdk.model.Errors;
import com.telnyx.sdk.model.ListQueueCallsResponse;
import com.telnyx.sdk.model.QueueCallResponse;
import com.telnyx.sdk.model.QueueResponse;
import com.telnyx.sdk.model.UpdateQueueMaxSizeRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0")
public class QueueCommandsApi {
  private ApiClient apiClient;

  public QueueCommandsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public QueueCommandsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Get the API client
   *
   * @return API client
   */
  public ApiClient getApiClient() {
    return apiClient;
  }

  /**
   * Set the API client
   *
   * @param apiClient an instance of API client
   */
  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Create a queue
   * Create a new call queue with the specified name and maximum size.
   * @param createQueueRequest Queue creation request (required)
   * @return QueueResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response with details about a queue. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public QueueResponse createQueue(CreateQueueRequest createQueueRequest) throws ApiException {
    return createQueueWithHttpInfo(createQueueRequest).getData();
  }

  /**
   * Create a queue
   * Create a new call queue with the specified name and maximum size.
   * @param createQueueRequest Queue creation request (required)
   * @return ApiResponse&lt;QueueResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response with details about a queue. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<QueueResponse> createQueueWithHttpInfo(CreateQueueRequest createQueueRequest) throws ApiException {
    Object localVarPostBody = createQueueRequest;
    
    // verify the required parameter 'createQueueRequest' is set
    if (createQueueRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'createQueueRequest' when calling createQueue");
    }
    
    // create path and map variables
    String localVarPath = "/queues";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    GenericType<QueueResponse> localVarReturnType = new GenericType<QueueResponse>() {};

    return apiClient.invokeAPI("QueueCommandsApi.createQueue", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Delete a queue
   * Delete an existing queue. The queue must be empty (no calls in it) to be deleted.
   * @param queueName Uniquely identifies the queue by name (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> Queue successfully deleted </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Fax does not exist </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public void deleteQueue(String queueName) throws ApiException {
    deleteQueueWithHttpInfo(queueName);
  }

  /**
   * Delete a queue
   * Delete an existing queue. The queue must be empty (no calls in it) to be deleted.
   * @param queueName Uniquely identifies the queue by name (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> Queue successfully deleted </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Fax does not exist </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> deleteQueueWithHttpInfo(String queueName) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'queueName' is set
    if (queueName == null) {
      throw new ApiException(400, "Missing the required parameter 'queueName' when calling deleteQueue");
    }
    
    // create path and map variables
    String localVarPath = "/queues/{queue_name}"
      .replaceAll("\\{" + "queue_name" + "\\}", apiClient.escapeString(queueName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    return apiClient.invokeAPI("QueueCommandsApi.deleteQueue", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * Retrieve calls from a queue
   * Retrieve the list of calls in an existing queue
   * @param queueName Uniquely identifies the queue by name (required)
   * @param pageNumber The page number to load (optional, default to 1)
   * @param pageSize The size of the page (optional, default to 20)
   * @return ListQueueCallsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response with a list of calls in a queue. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Fax does not exist </td><td>  -  </td></tr>
     </table>
   */
  public ListQueueCallsResponse listQueueCalls(String queueName, Integer pageNumber, Integer pageSize) throws ApiException {
    return listQueueCallsWithHttpInfo(queueName, pageNumber, pageSize).getData();
  }

  /**
   * Retrieve calls from a queue
   * Retrieve the list of calls in an existing queue
   * @param queueName Uniquely identifies the queue by name (required)
   * @param pageNumber The page number to load (optional, default to 1)
   * @param pageSize The size of the page (optional, default to 20)
   * @return ApiResponse&lt;ListQueueCallsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response with a list of calls in a queue. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Fax does not exist </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ListQueueCallsResponse> listQueueCallsWithHttpInfo(String queueName, Integer pageNumber, Integer pageSize) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'queueName' is set
    if (queueName == null) {
      throw new ApiException(400, "Missing the required parameter 'queueName' when calling listQueueCalls");
    }
    
    // create path and map variables
    String localVarPath = "/queues/{queue_name}/calls"
      .replaceAll("\\{" + "queue_name" + "\\}", apiClient.escapeString(queueName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[number]", pageNumber));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    GenericType<ListQueueCallsResponse> localVarReturnType = new GenericType<ListQueueCallsResponse>() {};

    return apiClient.invokeAPI("QueueCommandsApi.listQueueCalls", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Retrieve a call from a queue
   * Retrieve an existing call from an existing queue
   * @param queueName Uniquely identifies the queue by name (required)
   * @param callControlId Unique identifier and token for controlling the call (required)
   * @return QueueCallResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response with details about a call in a queue. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Fax does not exist </td><td>  -  </td></tr>
     </table>
   */
  public QueueCallResponse retrieveCallFromQueue(String queueName, String callControlId) throws ApiException {
    return retrieveCallFromQueueWithHttpInfo(queueName, callControlId).getData();
  }

  /**
   * Retrieve a call from a queue
   * Retrieve an existing call from an existing queue
   * @param queueName Uniquely identifies the queue by name (required)
   * @param callControlId Unique identifier and token for controlling the call (required)
   * @return ApiResponse&lt;QueueCallResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response with details about a call in a queue. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Fax does not exist </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<QueueCallResponse> retrieveCallFromQueueWithHttpInfo(String queueName, String callControlId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'queueName' is set
    if (queueName == null) {
      throw new ApiException(400, "Missing the required parameter 'queueName' when calling retrieveCallFromQueue");
    }
    
    // verify the required parameter 'callControlId' is set
    if (callControlId == null) {
      throw new ApiException(400, "Missing the required parameter 'callControlId' when calling retrieveCallFromQueue");
    }
    
    // create path and map variables
    String localVarPath = "/queues/{queue_name}/calls/{call_control_id}"
      .replaceAll("\\{" + "queue_name" + "\\}", apiClient.escapeString(queueName.toString()))
      .replaceAll("\\{" + "call_control_id" + "\\}", apiClient.escapeString(callControlId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    GenericType<QueueCallResponse> localVarReturnType = new GenericType<QueueCallResponse>() {};

    return apiClient.invokeAPI("QueueCommandsApi.retrieveCallFromQueue", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Retrieve a call queue
   * Retrieve an existing call queue
   * @param queueName Uniquely identifies the queue by name (required)
   * @return QueueResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response with details about a queue. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Fax does not exist </td><td>  -  </td></tr>
     </table>
   */
  public QueueResponse retrieveCallQueue(String queueName) throws ApiException {
    return retrieveCallQueueWithHttpInfo(queueName).getData();
  }

  /**
   * Retrieve a call queue
   * Retrieve an existing call queue
   * @param queueName Uniquely identifies the queue by name (required)
   * @return ApiResponse&lt;QueueResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response with details about a queue. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Fax does not exist </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<QueueResponse> retrieveCallQueueWithHttpInfo(String queueName) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'queueName' is set
    if (queueName == null) {
      throw new ApiException(400, "Missing the required parameter 'queueName' when calling retrieveCallQueue");
    }
    
    // create path and map variables
    String localVarPath = "/queues/{queue_name}"
      .replaceAll("\\{" + "queue_name" + "\\}", apiClient.escapeString(queueName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    GenericType<QueueResponse> localVarReturnType = new GenericType<QueueResponse>() {};

    return apiClient.invokeAPI("QueueCommandsApi.retrieveCallQueue", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Update queue max size
   * Update the maximum size of an existing queue
   * @param queueName Uniquely identifies the queue by name (required)
   * @param updateQueueMaxSizeRequest Queue max size update request (required)
   * @return QueueResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response with details about a queue. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Fax does not exist </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public QueueResponse updateQueueMaxSize(String queueName, UpdateQueueMaxSizeRequest updateQueueMaxSizeRequest) throws ApiException {
    return updateQueueMaxSizeWithHttpInfo(queueName, updateQueueMaxSizeRequest).getData();
  }

  /**
   * Update queue max size
   * Update the maximum size of an existing queue
   * @param queueName Uniquely identifies the queue by name (required)
   * @param updateQueueMaxSizeRequest Queue max size update request (required)
   * @return ApiResponse&lt;QueueResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response with details about a queue. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Fax does not exist </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<QueueResponse> updateQueueMaxSizeWithHttpInfo(String queueName, UpdateQueueMaxSizeRequest updateQueueMaxSizeRequest) throws ApiException {
    Object localVarPostBody = updateQueueMaxSizeRequest;
    
    // verify the required parameter 'queueName' is set
    if (queueName == null) {
      throw new ApiException(400, "Missing the required parameter 'queueName' when calling updateQueueMaxSize");
    }
    
    // verify the required parameter 'updateQueueMaxSizeRequest' is set
    if (updateQueueMaxSizeRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'updateQueueMaxSizeRequest' when calling updateQueueMaxSize");
    }
    
    // create path and map variables
    String localVarPath = "/queues/{queue_name}"
      .replaceAll("\\{" + "queue_name" + "\\}", apiClient.escapeString(queueName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    GenericType<QueueResponse> localVarReturnType = new GenericType<QueueResponse>() {};

    return apiClient.invokeAPI("QueueCommandsApi.updateQueueMaxSize", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
