package com.telnyx.sdk.api;

import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.Pair;

import jakarta.ws.rs.core.GenericType;

import com.telnyx.sdk.model.BulkCreationDetailedStatusResponse;
import com.telnyx.sdk.model.BulkCreationRequest;
import com.telnyx.sdk.model.BulkCreationResponse;
import com.telnyx.sdk.model.BulkCreationStatusResponse;
import com.telnyx.sdk.model.BulkCreationTasksResponse;
import com.telnyx.sdk.model.HTTPValidationError;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class BulkSoleProprietorCreationApi {
  private ApiClient apiClient;

  public BulkSoleProprietorCreationApi() {
    this(Configuration.getDefaultApiClient());
  }

  public BulkSoleProprietorCreationApi(ApiClient apiClient) {
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
   * Get All Tasks
   * Get a list of all tasks ever submitted by your organization.
   * @param recordsPerPage  (optional, default to 20)
   * @param page  (optional, default to 1)
   * @return BulkCreationTasksResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
     </table>
   */
  public BulkCreationTasksResponse getAllTasks(Object recordsPerPage, Object page) throws ApiException {
    return getAllTasksWithHttpInfo(recordsPerPage, page).getData();
  }

  /**
   * Get All Tasks
   * Get a list of all tasks ever submitted by your organization.
   * @param recordsPerPage  (optional, default to 20)
   * @param page  (optional, default to 1)
   * @return ApiResponse&lt;BulkCreationTasksResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<BulkCreationTasksResponse> getAllTasksWithHttpInfo(Object recordsPerPage, Object page) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/bulkCreation";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "recordsPerPage", recordsPerPage));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page", page));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    GenericType<BulkCreationTasksResponse> localVarReturnType = new GenericType<BulkCreationTasksResponse>() {};

    return apiClient.invokeAPI("BulkSoleProprietorCreationApi.getAllTasks", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get Task Status
   * Get a simple overview of the status of a bulk creation task.
   * @param taskId  (required)
   * @return BulkCreationStatusResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
     </table>
   */
  public BulkCreationStatusResponse getBulkCreationTaskStatus(String taskId) throws ApiException {
    return getBulkCreationTaskStatusWithHttpInfo(taskId).getData();
  }

  /**
   * Get Task Status
   * Get a simple overview of the status of a bulk creation task.
   * @param taskId  (required)
   * @return ApiResponse&lt;BulkCreationStatusResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<BulkCreationStatusResponse> getBulkCreationTaskStatusWithHttpInfo(String taskId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'taskId' is set
    if (taskId == null) {
      throw new ApiException(400, "Missing the required parameter 'taskId' when calling getBulkCreationTaskStatus");
    }
    
    // create path and map variables
    String localVarPath = "/bulkCreation/{taskId}"
      .replaceAll("\\{" + "taskId" + "\\}", apiClient.escapeString(taskId.toString()));

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

    GenericType<BulkCreationStatusResponse> localVarReturnType = new GenericType<BulkCreationStatusResponse>() {};

    return apiClient.invokeAPI("BulkSoleProprietorCreationApi.getBulkCreationTaskStatus", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get Detailed Task Status
   * Get detailed information about the status of a bulk creation task.
   * @param taskId  (required)
   * @param recordsPerPage  (optional, default to 20)
   * @param page  (optional, default to 1)
   * @return BulkCreationDetailedStatusResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
     </table>
   */
  public BulkCreationDetailedStatusResponse getTaskDetailedStatus(String taskId, Object recordsPerPage, Object page) throws ApiException {
    return getTaskDetailedStatusWithHttpInfo(taskId, recordsPerPage, page).getData();
  }

  /**
   * Get Detailed Task Status
   * Get detailed information about the status of a bulk creation task.
   * @param taskId  (required)
   * @param recordsPerPage  (optional, default to 20)
   * @param page  (optional, default to 1)
   * @return ApiResponse&lt;BulkCreationDetailedStatusResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<BulkCreationDetailedStatusResponse> getTaskDetailedStatusWithHttpInfo(String taskId, Object recordsPerPage, Object page) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'taskId' is set
    if (taskId == null) {
      throw new ApiException(400, "Missing the required parameter 'taskId' when calling getTaskDetailedStatus");
    }
    
    // create path and map variables
    String localVarPath = "/bulkCreation/{taskId}/detailedStatus"
      .replaceAll("\\{" + "taskId" + "\\}", apiClient.escapeString(taskId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "recordsPerPage", recordsPerPage));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page", page));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    GenericType<BulkCreationDetailedStatusResponse> localVarReturnType = new GenericType<BulkCreationDetailedStatusResponse>() {};

    return apiClient.invokeAPI("BulkSoleProprietorCreationApi.getTaskDetailedStatus", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Bulk Creation
   * Submit sets of data about brands, campaigns, and phone numbers to create and assign. Please note that sub-usecases, phone numbers, and sample messages are each limited to 5 per campaign.
   * @param bulkCreationRequest  (required)
   * @return BulkCreationResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 202 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
     </table>
   */
  public BulkCreationResponse postBulkCreation(BulkCreationRequest bulkCreationRequest) throws ApiException {
    return postBulkCreationWithHttpInfo(bulkCreationRequest).getData();
  }

  /**
   * Bulk Creation
   * Submit sets of data about brands, campaigns, and phone numbers to create and assign. Please note that sub-usecases, phone numbers, and sample messages are each limited to 5 per campaign.
   * @param bulkCreationRequest  (required)
   * @return ApiResponse&lt;BulkCreationResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 202 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<BulkCreationResponse> postBulkCreationWithHttpInfo(BulkCreationRequest bulkCreationRequest) throws ApiException {
    Object localVarPostBody = bulkCreationRequest;
    
    // verify the required parameter 'bulkCreationRequest' is set
    if (bulkCreationRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'bulkCreationRequest' when calling postBulkCreation");
    }
    
    // create path and map variables
    String localVarPath = "/bulkCreation";

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

    GenericType<BulkCreationResponse> localVarReturnType = new GenericType<BulkCreationResponse>() {};

    return apiClient.invokeAPI("BulkSoleProprietorCreationApi.postBulkCreation", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
