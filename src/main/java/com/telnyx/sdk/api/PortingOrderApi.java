package com.telnyx.sdk.api;

import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.Pair;

import javax.ws.rs.core.GenericType;

import com.telnyx.sdk.model.CreatePortingOrder;
import com.telnyx.sdk.model.CreatePortingOrderComment;
import java.io.File;
import com.telnyx.sdk.model.ListAllowedFocWindow;
import com.telnyx.sdk.model.ListDraftPortingOrderWithoutPagination;
import com.telnyx.sdk.model.ListPortingOrder;
import com.telnyx.sdk.model.ListPortingOrderDocuments;
import com.telnyx.sdk.model.ListPortingOrdersActivationJobs;
import com.telnyx.sdk.model.ListPortingOrdersComments;
import com.telnyx.sdk.model.ListPortingOrdersExceptionTypes;
import com.telnyx.sdk.model.ListPortingPhoneNumbers;
import com.telnyx.sdk.model.PortabilityStatus;
import com.telnyx.sdk.model.PortingOrderActivationStatus;
import com.telnyx.sdk.model.PortingOrderDocumentsCreated;
import com.telnyx.sdk.model.PortingOrderType;
import com.telnyx.sdk.model.ShowPortingOrder;
import com.telnyx.sdk.model.ShowPortingOrderComment;
import com.telnyx.sdk.model.ShowPortingOrdersActivationJob;
import com.telnyx.sdk.model.SubRequestByPortingOrder;
import com.telnyx.sdk.model.UNKNOWN_BASE_TYPE;
import java.util.UUID;
import com.telnyx.sdk.model.UpdatePortingOrder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PortingOrderApi {
  private ApiClient apiClient;

  public PortingOrderApi() {
    this(Configuration.getDefaultApiClient());
  }

  public PortingOrderApi(ApiClient apiClient) {
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
   * Activates every number on a porting order.
   * Activate every numbers of a porting order asynchronously.
   * @param id Porting Order id (required)
   * @return ShowPortingOrdersActivationJob
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 202 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check message field in response for details. </td><td>  -  </td></tr>
     </table>
   */
  public ShowPortingOrdersActivationJob activatePortingOrder(UUID id) throws ApiException {
    return activatePortingOrderWithHttpInfo(id).getData();
  }

  /**
   * Activates every number on a porting order.
   * Activate every numbers of a porting order asynchronously.
   * @param id Porting Order id (required)
   * @return ApiResponse&lt;ShowPortingOrdersActivationJob&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 202 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check message field in response for details. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ShowPortingOrdersActivationJob> activatePortingOrderWithHttpInfo(UUID id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling activatePortingOrder");
    }
    
    // create path and map variables
    String localVarPath = "/porting_orders/{id}/actions/activate"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

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

    GenericType<ShowPortingOrdersActivationJob> localVarReturnType = new GenericType<ShowPortingOrdersActivationJob>() {};

    return apiClient.invokeAPI("PortingOrderApi.activatePortingOrder", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Cancel a porting order
   * Cancel a porting order
   * @param id Porting Order id (required)
   * @return ShowPortingOrder
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check message field in response for details. </td><td>  -  </td></tr>
     </table>
   */
  public ShowPortingOrder cancelPortingOrder(UUID id) throws ApiException {
    return cancelPortingOrderWithHttpInfo(id).getData();
  }

  /**
   * Cancel a porting order
   * Cancel a porting order
   * @param id Porting Order id (required)
   * @return ApiResponse&lt;ShowPortingOrder&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check message field in response for details. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ShowPortingOrder> cancelPortingOrderWithHttpInfo(UUID id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling cancelPortingOrder");
    }
    
    // create path and map variables
    String localVarPath = "/porting_orders/{id}/actions/cancel"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

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

    GenericType<ShowPortingOrder> localVarReturnType = new GenericType<ShowPortingOrder>() {};

    return apiClient.invokeAPI("PortingOrderApi.cancelPortingOrder", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Submit a porting order.
   * Confirm and submit your porting order.
   * @param id Porting Order id (required)
   * @return ShowPortingOrder
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check message field in response for details. </td><td>  -  </td></tr>
     </table>
   */
  public ShowPortingOrder confirmPortingOrder(UUID id) throws ApiException {
    return confirmPortingOrderWithHttpInfo(id).getData();
  }

  /**
   * Submit a porting order.
   * Confirm and submit your porting order.
   * @param id Porting Order id (required)
   * @return ApiResponse&lt;ShowPortingOrder&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check message field in response for details. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ShowPortingOrder> confirmPortingOrderWithHttpInfo(UUID id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling confirmPortingOrder");
    }
    
    // create path and map variables
    String localVarPath = "/porting_orders/{id}/actions/confirm"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

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

    GenericType<ShowPortingOrder> localVarReturnType = new GenericType<ShowPortingOrder>() {};

    return apiClient.invokeAPI("PortingOrderApi.confirmPortingOrder", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Create a porting order
   * Creates a new porting order object.
   * @param createPortingOrder  (required)
   * @return ListDraftPortingOrderWithoutPagination
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check message field in response for details. </td><td>  -  </td></tr>
     </table>
   */
  public ListDraftPortingOrderWithoutPagination createPortingOrder(CreatePortingOrder createPortingOrder) throws ApiException {
    return createPortingOrderWithHttpInfo(createPortingOrder).getData();
  }

  /**
   * Create a porting order
   * Creates a new porting order object.
   * @param createPortingOrder  (required)
   * @return ApiResponse&lt;ListDraftPortingOrderWithoutPagination&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check message field in response for details. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ListDraftPortingOrderWithoutPagination> createPortingOrderWithHttpInfo(CreatePortingOrder createPortingOrder) throws ApiException {
    Object localVarPostBody = createPortingOrder;
    
    // verify the required parameter 'createPortingOrder' is set
    if (createPortingOrder == null) {
      throw new ApiException(400, "Missing the required parameter 'createPortingOrder' when calling createPortingOrder");
    }
    
    // create path and map variables
    String localVarPath = "/porting_orders";

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

    GenericType<ListDraftPortingOrderWithoutPagination> localVarReturnType = new GenericType<ListDraftPortingOrderWithoutPagination>() {};

    return apiClient.invokeAPI("PortingOrderApi.createPortingOrder", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Create a comment for a porting order
   * Creates a new comment for a porting order.
   * @param id Porting Order id (required)
   * @param createPortingOrderComment  (required)
   * @return ShowPortingOrderComment
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check message field in response for details. </td><td>  -  </td></tr>
     </table>
   */
  public ShowPortingOrderComment createPortingOrderComment(UUID id, CreatePortingOrderComment createPortingOrderComment) throws ApiException {
    return createPortingOrderCommentWithHttpInfo(id, createPortingOrderComment).getData();
  }

  /**
   * Create a comment for a porting order
   * Creates a new comment for a porting order.
   * @param id Porting Order id (required)
   * @param createPortingOrderComment  (required)
   * @return ApiResponse&lt;ShowPortingOrderComment&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check message field in response for details. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ShowPortingOrderComment> createPortingOrderCommentWithHttpInfo(UUID id, CreatePortingOrderComment createPortingOrderComment) throws ApiException {
    Object localVarPostBody = createPortingOrderComment;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling createPortingOrderComment");
    }
    
    // verify the required parameter 'createPortingOrderComment' is set
    if (createPortingOrderComment == null) {
      throw new ApiException(400, "Missing the required parameter 'createPortingOrderComment' when calling createPortingOrderComment");
    }
    
    // create path and map variables
    String localVarPath = "/porting_orders/{id}/comments"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

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

    GenericType<ShowPortingOrderComment> localVarReturnType = new GenericType<ShowPortingOrderComment>() {};

    return apiClient.invokeAPI("PortingOrderApi.createPortingOrderComment", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Delete a porting order
   * Deletes an existing porting order. This operation is restrict to porting orders in draft state.
   * @param id Porting Order id (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> No content </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check message field in response for details. </td><td>  -  </td></tr>
     </table>
   */
  public void deletePortingOrder(UUID id) throws ApiException {
    deletePortingOrderWithHttpInfo(id);
  }

  /**
   * Delete a porting order
   * Deletes an existing porting order. This operation is restrict to porting orders in draft state.
   * @param id Porting Order id (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> No content </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check message field in response for details. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> deletePortingOrderWithHttpInfo(UUID id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling deletePortingOrder");
    }
    
    // create path and map variables
    String localVarPath = "/porting_orders/{id}"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    return apiClient.invokeAPI("PortingOrderApi.deletePortingOrder", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * Retrieve a porting order
   * Retrieves the details of an existing porting order.
   * @param id Porting Order id (required)
   * @param includePhoneNumbers Include the first 50 phone number objects in the results (optional, default to true)
   * @return ShowPortingOrder
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
   */
  public ShowPortingOrder getPortingOrder(UUID id, Boolean includePhoneNumbers) throws ApiException {
    return getPortingOrderWithHttpInfo(id, includePhoneNumbers).getData();
  }

  /**
   * Retrieve a porting order
   * Retrieves the details of an existing porting order.
   * @param id Porting Order id (required)
   * @param includePhoneNumbers Include the first 50 phone number objects in the results (optional, default to true)
   * @return ApiResponse&lt;ShowPortingOrder&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ShowPortingOrder> getPortingOrderWithHttpInfo(UUID id, Boolean includePhoneNumbers) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getPortingOrder");
    }
    
    // create path and map variables
    String localVarPath = "/porting_orders/{id}"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include_phone_numbers", includePhoneNumbers));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    GenericType<ShowPortingOrder> localVarReturnType = new GenericType<ShowPortingOrder>() {};

    return apiClient.invokeAPI("PortingOrderApi.getPortingOrder", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Download a porting order loa template
   * Download a porting order loa template
   * @param id Porting Order id (required)
   * @return File
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
   */
  public File getPortingOrderLOATemplate(UUID id) throws ApiException {
    return getPortingOrderLOATemplateWithHttpInfo(id).getData();
  }

  /**
   * Download a porting order loa template
   * Download a porting order loa template
   * @param id Porting Order id (required)
   * @return ApiResponse&lt;File&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<File> getPortingOrderLOATemplateWithHttpInfo(UUID id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getPortingOrderLOATemplate");
    }
    
    // create path and map variables
    String localVarPath = "/porting_orders/{id}/loa_template"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/pdf"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    GenericType<File> localVarReturnType = new GenericType<File>() {};

    return apiClient.invokeAPI("PortingOrderApi.getPortingOrderLOATemplate", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Retrieve the associated V1 sub_request_id and port_request_id
   * Retrieve the associated V1 sub_request_id and port_request_id
   * @param id Porting Order id (required)
   * @return SubRequestByPortingOrder
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Porting Order not found </td><td>  -  </td></tr>
     </table>
   */
  public SubRequestByPortingOrder getPortingOrderSubRequest(UUID id) throws ApiException {
    return getPortingOrderSubRequestWithHttpInfo(id).getData();
  }

  /**
   * Retrieve the associated V1 sub_request_id and port_request_id
   * Retrieve the associated V1 sub_request_id and port_request_id
   * @param id Porting Order id (required)
   * @return ApiResponse&lt;SubRequestByPortingOrder&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Porting Order not found </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<SubRequestByPortingOrder> getPortingOrderSubRequestWithHttpInfo(UUID id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getPortingOrderSubRequest");
    }
    
    // create path and map variables
    String localVarPath = "/porting_orders/{id}/sub_request"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

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

    GenericType<SubRequestByPortingOrder> localVarReturnType = new GenericType<SubRequestByPortingOrder>() {};

    return apiClient.invokeAPI("PortingOrderApi.getPortingOrderSubRequest", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Retrieve a porting activation job
   * Returns a porting activation job.
   * @param id Porting Order id (required)
   * @param activationJobId Activation Job Identifier (required)
   * @return ShowPortingOrdersActivationJob
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check message field in response for details. </td><td>  -  </td></tr>
     </table>
   */
  public ShowPortingOrdersActivationJob getPortingOrdersActivationJob(UUID id, UUID activationJobId) throws ApiException {
    return getPortingOrdersActivationJobWithHttpInfo(id, activationJobId).getData();
  }

  /**
   * Retrieve a porting activation job
   * Returns a porting activation job.
   * @param id Porting Order id (required)
   * @param activationJobId Activation Job Identifier (required)
   * @return ApiResponse&lt;ShowPortingOrdersActivationJob&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check message field in response for details. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ShowPortingOrdersActivationJob> getPortingOrdersActivationJobWithHttpInfo(UUID id, UUID activationJobId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getPortingOrdersActivationJob");
    }
    
    // verify the required parameter 'activationJobId' is set
    if (activationJobId == null) {
      throw new ApiException(400, "Missing the required parameter 'activationJobId' when calling getPortingOrdersActivationJob");
    }
    
    // create path and map variables
    String localVarPath = "/porting_orders/{id}/activation_jobs/{activationJobId}"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()))
      .replaceAll("\\{" + "activationJobId" + "\\}", apiClient.escapeString(activationJobId.toString()));

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

    GenericType<ShowPortingOrdersActivationJob> localVarReturnType = new GenericType<ShowPortingOrdersActivationJob>() {};

    return apiClient.invokeAPI("PortingOrderApi.getPortingOrdersActivationJob", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * List allowed FOC dates
   * Returns a list of allowed FOC dates for a porting order.
   * @param id Porting Order id (required)
   * @return ListAllowedFocWindow
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
   */
  public ListAllowedFocWindow listAllowedFocWindows(UUID id) throws ApiException {
    return listAllowedFocWindowsWithHttpInfo(id).getData();
  }

  /**
   * List allowed FOC dates
   * Returns a list of allowed FOC dates for a porting order.
   * @param id Porting Order id (required)
   * @return ApiResponse&lt;ListAllowedFocWindow&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ListAllowedFocWindow> listAllowedFocWindowsWithHttpInfo(UUID id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling listAllowedFocWindows");
    }
    
    // create path and map variables
    String localVarPath = "/porting_orders/{id}/allowed_foc_windows"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

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

    GenericType<ListAllowedFocWindow> localVarReturnType = new GenericType<ListAllowedFocWindow>() {};

    return apiClient.invokeAPI("PortingOrderApi.listAllowedFocWindows", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * List all documents associated with a porting order
   * Returns a list of all documents associated with a porting order.
   * @param id Porting Order id (required)
   * @param pageNumber The page number to load (optional, default to 1)
   * @param pageSize The size of the page (optional, default to 20)
   * @return ListPortingOrderDocuments
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check message field in response for details. </td><td>  -  </td></tr>
     </table>
   */
  public ListPortingOrderDocuments listPortingOrderDocuments(UUID id, Integer pageNumber, Integer pageSize) throws ApiException {
    return listPortingOrderDocumentsWithHttpInfo(id, pageNumber, pageSize).getData();
  }

  /**
   * List all documents associated with a porting order
   * Returns a list of all documents associated with a porting order.
   * @param id Porting Order id (required)
   * @param pageNumber The page number to load (optional, default to 1)
   * @param pageSize The size of the page (optional, default to 20)
   * @return ApiResponse&lt;ListPortingOrderDocuments&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check message field in response for details. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ListPortingOrderDocuments> listPortingOrderDocumentsWithHttpInfo(UUID id, Integer pageNumber, Integer pageSize) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling listPortingOrderDocuments");
    }
    
    // create path and map variables
    String localVarPath = "/porting_orders/{id}/documents"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

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

    GenericType<ListPortingOrderDocuments> localVarReturnType = new GenericType<ListPortingOrderDocuments>() {};

    return apiClient.invokeAPI("PortingOrderApi.listPortingOrderDocuments", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * List all porting orders
   * Returns a list of your porting order.
   * @param pageNumber The page number to load (optional, default to 1)
   * @param pageSize The size of the page (optional, default to 20)
   * @param includePhoneNumbers Include the first 50 phone number objects in the results (optional, default to true)
   * @param filterStatus Filter results by status (optional)
   * @param filterCustomerReference Filter results by user reference (optional)
   * @param filterPhoneNumbersCountryCode Filter results by country ISO 3166-1 alpha-2 code (optional)
   * @param filterPhoneNumbersCarrierName Filter results by old service provider (optional)
   * @param filterMiscType Filter results by porting order type (optional)
   * @param filterEndUserAdminEntityName Filter results by person or company name (optional)
   * @param filterEndUserAdminAuthPersonName Filter results by authorized person (optional)
   * @param filterActivationSettingsFastPortEligible Filter results by fast port eligible (optional)
   * @param filterActivationSettingsFocDatetimeRequestedGt Filter results by foc date later than this value (optional)
   * @param filterActivationSettingsFocDatetimeRequestedLt Filter results by foc date earlier than this value (optional)
   * @param sort Specifies the sort order for results. If not given, results are sorted by created_at in descending order. (optional)
   * @return ListPortingOrder
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check message field in response for details. </td><td>  -  </td></tr>
     </table>
   */
  public ListPortingOrder listPortingOrders(Integer pageNumber, Integer pageSize, Boolean includePhoneNumbers, String filterStatus, String filterCustomerReference, String filterPhoneNumbersCountryCode, String filterPhoneNumbersCarrierName, PortingOrderType filterMiscType, String filterEndUserAdminEntityName, String filterEndUserAdminAuthPersonName, Boolean filterActivationSettingsFastPortEligible, String filterActivationSettingsFocDatetimeRequestedGt, String filterActivationSettingsFocDatetimeRequestedLt, String sort) throws ApiException {
    return listPortingOrdersWithHttpInfo(pageNumber, pageSize, includePhoneNumbers, filterStatus, filterCustomerReference, filterPhoneNumbersCountryCode, filterPhoneNumbersCarrierName, filterMiscType, filterEndUserAdminEntityName, filterEndUserAdminAuthPersonName, filterActivationSettingsFastPortEligible, filterActivationSettingsFocDatetimeRequestedGt, filterActivationSettingsFocDatetimeRequestedLt, sort).getData();
  }

  /**
   * List all porting orders
   * Returns a list of your porting order.
   * @param pageNumber The page number to load (optional, default to 1)
   * @param pageSize The size of the page (optional, default to 20)
   * @param includePhoneNumbers Include the first 50 phone number objects in the results (optional, default to true)
   * @param filterStatus Filter results by status (optional)
   * @param filterCustomerReference Filter results by user reference (optional)
   * @param filterPhoneNumbersCountryCode Filter results by country ISO 3166-1 alpha-2 code (optional)
   * @param filterPhoneNumbersCarrierName Filter results by old service provider (optional)
   * @param filterMiscType Filter results by porting order type (optional)
   * @param filterEndUserAdminEntityName Filter results by person or company name (optional)
   * @param filterEndUserAdminAuthPersonName Filter results by authorized person (optional)
   * @param filterActivationSettingsFastPortEligible Filter results by fast port eligible (optional)
   * @param filterActivationSettingsFocDatetimeRequestedGt Filter results by foc date later than this value (optional)
   * @param filterActivationSettingsFocDatetimeRequestedLt Filter results by foc date earlier than this value (optional)
   * @param sort Specifies the sort order for results. If not given, results are sorted by created_at in descending order. (optional)
   * @return ApiResponse&lt;ListPortingOrder&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check message field in response for details. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ListPortingOrder> listPortingOrdersWithHttpInfo(Integer pageNumber, Integer pageSize, Boolean includePhoneNumbers, String filterStatus, String filterCustomerReference, String filterPhoneNumbersCountryCode, String filterPhoneNumbersCarrierName, PortingOrderType filterMiscType, String filterEndUserAdminEntityName, String filterEndUserAdminAuthPersonName, Boolean filterActivationSettingsFastPortEligible, String filterActivationSettingsFocDatetimeRequestedGt, String filterActivationSettingsFocDatetimeRequestedLt, String sort) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/porting_orders";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[number]", pageNumber));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include_phone_numbers", includePhoneNumbers));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[status]", filterStatus));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[customer_reference]", filterCustomerReference));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[phone_numbers][country_code]", filterPhoneNumbersCountryCode));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[phone_numbers][carrier_name]", filterPhoneNumbersCarrierName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[misc][type]", filterMiscType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[end_user][admin][entity_name]", filterEndUserAdminEntityName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[end_user][admin][auth_person_name]", filterEndUserAdminAuthPersonName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[activation_settings][fast_port_eligible]", filterActivationSettingsFastPortEligible));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[activation_settings][foc_datetime_requested][gt]", filterActivationSettingsFocDatetimeRequestedGt));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[activation_settings][foc_datetime_requested][lt]", filterActivationSettingsFocDatetimeRequestedLt));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort", sort));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    GenericType<ListPortingOrder> localVarReturnType = new GenericType<ListPortingOrder>() {};

    return apiClient.invokeAPI("PortingOrderApi.listPortingOrders", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * List all porting activation jobs
   * Returns a list of your porting activation jobs.
   * @param id Porting Order id (required)
   * @param pageNumber The page number to load (optional, default to 1)
   * @param pageSize The size of the page (optional, default to 20)
   * @return ListPortingOrdersActivationJobs
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check message field in response for details. </td><td>  -  </td></tr>
     </table>
   */
  public ListPortingOrdersActivationJobs listPortingOrdersActivationJobs(UUID id, Integer pageNumber, Integer pageSize) throws ApiException {
    return listPortingOrdersActivationJobsWithHttpInfo(id, pageNumber, pageSize).getData();
  }

  /**
   * List all porting activation jobs
   * Returns a list of your porting activation jobs.
   * @param id Porting Order id (required)
   * @param pageNumber The page number to load (optional, default to 1)
   * @param pageSize The size of the page (optional, default to 20)
   * @return ApiResponse&lt;ListPortingOrdersActivationJobs&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check message field in response for details. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ListPortingOrdersActivationJobs> listPortingOrdersActivationJobsWithHttpInfo(UUID id, Integer pageNumber, Integer pageSize) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling listPortingOrdersActivationJobs");
    }
    
    // create path and map variables
    String localVarPath = "/porting_orders/{id}/activation_jobs"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

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

    GenericType<ListPortingOrdersActivationJobs> localVarReturnType = new GenericType<ListPortingOrdersActivationJobs>() {};

    return apiClient.invokeAPI("PortingOrderApi.listPortingOrdersActivationJobs", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * List all comments of a porting order
   * Returns a list of all comments of a porting order.
   * @param id Porting Order id (required)
   * @param pageNumber The page number to load (optional, default to 1)
   * @param pageSize The size of the page (optional, default to 20)
   * @return ListPortingOrdersComments
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check message field in response for details. </td><td>  -  </td></tr>
     </table>
   */
  public ListPortingOrdersComments listPortingOrdersComments(UUID id, Integer pageNumber, Integer pageSize) throws ApiException {
    return listPortingOrdersCommentsWithHttpInfo(id, pageNumber, pageSize).getData();
  }

  /**
   * List all comments of a porting order
   * Returns a list of all comments of a porting order.
   * @param id Porting Order id (required)
   * @param pageNumber The page number to load (optional, default to 1)
   * @param pageSize The size of the page (optional, default to 20)
   * @return ApiResponse&lt;ListPortingOrdersComments&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check message field in response for details. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ListPortingOrdersComments> listPortingOrdersCommentsWithHttpInfo(UUID id, Integer pageNumber, Integer pageSize) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling listPortingOrdersComments");
    }
    
    // create path and map variables
    String localVarPath = "/porting_orders/{id}/comments"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

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

    GenericType<ListPortingOrdersComments> localVarReturnType = new GenericType<ListPortingOrdersComments>() {};

    return apiClient.invokeAPI("PortingOrderApi.listPortingOrdersComments", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * List all exception types
   * Returns a list of all possible exception types for a porting order.
   * @return ListPortingOrdersExceptionTypes
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check message field in response for details. </td><td>  -  </td></tr>
     </table>
   */
  public ListPortingOrdersExceptionTypes listPortingOrdersExceptionTypes() throws ApiException {
    return listPortingOrdersExceptionTypesWithHttpInfo().getData();
  }

  /**
   * List all exception types
   * Returns a list of all possible exception types for a porting order.
   * @return ApiResponse&lt;ListPortingOrdersExceptionTypes&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check message field in response for details. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ListPortingOrdersExceptionTypes> listPortingOrdersExceptionTypesWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/porting_orders/exception_types";

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

    GenericType<ListPortingOrdersExceptionTypes> localVarReturnType = new GenericType<ListPortingOrdersExceptionTypes>() {};

    return apiClient.invokeAPI("PortingOrderApi.listPortingOrdersExceptionTypes", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * List all porting phone numbers
   * Returns a list of your porting phone numbers.
   * @param pageNumber The page number to load (optional, default to 1)
   * @param pageSize The size of the page (optional, default to 20)
   * @param filterPortingOrderId Filter results by porting order id (optional)
   * @param filterPortingOrderIdIn Filter results by a list of porting order ids (optional)
   * @param filterSupportKeyEq Filter results by support key (optional)
   * @param filterSupportKeyIn Filter results by a list of support keys (optional)
   * @param filterPhoneNumber Filter results by phone number (optional)
   * @param filterPhoneNumberIn Filter results by a list of phone numbers (optional)
   * @param filterPortingOrderStatus Filter results by porting order status (optional)
   * @param filterActivationStatus Filter results by activation status (optional)
   * @param filterPortabilityStatus Filter results by portability status (optional)
   * @return ListPortingPhoneNumbers
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check message field in response for details. </td><td>  -  </td></tr>
     </table>
   */
  public ListPortingPhoneNumbers listPortingPhoneNumbers(Integer pageNumber, Integer pageSize, UUID filterPortingOrderId, List<UUID> filterPortingOrderIdIn, String filterSupportKeyEq, List<String> filterSupportKeyIn, String filterPhoneNumber, List<String> filterPhoneNumberIn, String filterPortingOrderStatus, PortingOrderActivationStatus filterActivationStatus, PortabilityStatus filterPortabilityStatus) throws ApiException {
    return listPortingPhoneNumbersWithHttpInfo(pageNumber, pageSize, filterPortingOrderId, filterPortingOrderIdIn, filterSupportKeyEq, filterSupportKeyIn, filterPhoneNumber, filterPhoneNumberIn, filterPortingOrderStatus, filterActivationStatus, filterPortabilityStatus).getData();
  }

  /**
   * List all porting phone numbers
   * Returns a list of your porting phone numbers.
   * @param pageNumber The page number to load (optional, default to 1)
   * @param pageSize The size of the page (optional, default to 20)
   * @param filterPortingOrderId Filter results by porting order id (optional)
   * @param filterPortingOrderIdIn Filter results by a list of porting order ids (optional)
   * @param filterSupportKeyEq Filter results by support key (optional)
   * @param filterSupportKeyIn Filter results by a list of support keys (optional)
   * @param filterPhoneNumber Filter results by phone number (optional)
   * @param filterPhoneNumberIn Filter results by a list of phone numbers (optional)
   * @param filterPortingOrderStatus Filter results by porting order status (optional)
   * @param filterActivationStatus Filter results by activation status (optional)
   * @param filterPortabilityStatus Filter results by portability status (optional)
   * @return ApiResponse&lt;ListPortingPhoneNumbers&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check message field in response for details. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ListPortingPhoneNumbers> listPortingPhoneNumbersWithHttpInfo(Integer pageNumber, Integer pageSize, UUID filterPortingOrderId, List<UUID> filterPortingOrderIdIn, String filterSupportKeyEq, List<String> filterSupportKeyIn, String filterPhoneNumber, List<String> filterPhoneNumberIn, String filterPortingOrderStatus, PortingOrderActivationStatus filterActivationStatus, PortabilityStatus filterPortabilityStatus) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/porting_phone_numbers";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[number]", pageNumber));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[porting_order_id]", filterPortingOrderId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "filter[porting_order_id][in][]", filterPortingOrderIdIn));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[support_key][eq]", filterSupportKeyEq));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "filter[support_key][in][]", filterSupportKeyIn));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[phone_number]", filterPhoneNumber));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "filter[phone_number][in][]", filterPhoneNumberIn));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[porting_order_status]", filterPortingOrderStatus));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[activation_status]", filterActivationStatus));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[portability_status]", filterPortabilityStatus));

    
    
    
    final String[] localVarAccepts = {
      "application/json", "text/csv"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    GenericType<ListPortingPhoneNumbers> localVarReturnType = new GenericType<ListPortingPhoneNumbers>() {};

    return apiClient.invokeAPI("PortingOrderApi.listPortingPhoneNumbers", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Edit a porting order
   * Edits the details of an existing porting order.  Any or all of a porting order’s attributes may be included in the resource object included in a PATCH request.  If a request does not include all of the attributes for a resource, the system will interpret the missing attributes as if they were included with their current values. To explicitly set something to null, it must be included in the request with a null value.
   * @param id Porting Order id (required)
   * @param updatePortingOrder  (required)
   * @return ShowPortingOrder
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check message field in response for details. </td><td>  -  </td></tr>
     </table>
   */
  public ShowPortingOrder updatePortingOrder(UUID id, UpdatePortingOrder updatePortingOrder) throws ApiException {
    return updatePortingOrderWithHttpInfo(id, updatePortingOrder).getData();
  }

  /**
   * Edit a porting order
   * Edits the details of an existing porting order.  Any or all of a porting order’s attributes may be included in the resource object included in a PATCH request.  If a request does not include all of the attributes for a resource, the system will interpret the missing attributes as if they were included with their current values. To explicitly set something to null, it must be included in the request with a null value.
   * @param id Porting Order id (required)
   * @param updatePortingOrder  (required)
   * @return ApiResponse&lt;ShowPortingOrder&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check message field in response for details. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ShowPortingOrder> updatePortingOrderWithHttpInfo(UUID id, UpdatePortingOrder updatePortingOrder) throws ApiException {
    Object localVarPostBody = updatePortingOrder;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling updatePortingOrder");
    }
    
    // verify the required parameter 'updatePortingOrder' is set
    if (updatePortingOrder == null) {
      throw new ApiException(400, "Missing the required parameter 'updatePortingOrder' when calling updatePortingOrder");
    }
    
    // create path and map variables
    String localVarPath = "/porting_orders/{id}"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

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

    GenericType<ShowPortingOrder> localVarReturnType = new GenericType<ShowPortingOrder>() {};

    return apiClient.invokeAPI("PortingOrderApi.updatePortingOrder", localVarPath, "PATCH", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Associate a list of documents with a porting order
   * Associate a list of documents with a porting order.
   * @param id Porting Order id (required)
   * @param UNKNOWN_BASE_TYPE  (required)
   * @return PortingOrderDocumentsCreated
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check message field in response for details. </td><td>  -  </td></tr>
     </table>
   */
  public PortingOrderDocumentsCreated uploadPortingOrderDocuments(UUID id, UNKNOWN_BASE_TYPE UNKNOWN_BASE_TYPE) throws ApiException {
    return uploadPortingOrderDocumentsWithHttpInfo(id, UNKNOWN_BASE_TYPE).getData();
  }

  /**
   * Associate a list of documents with a porting order
   * Associate a list of documents with a porting order.
   * @param id Porting Order id (required)
   * @param UNKNOWN_BASE_TYPE  (required)
   * @return ApiResponse&lt;PortingOrderDocumentsCreated&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check message field in response for details. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<PortingOrderDocumentsCreated> uploadPortingOrderDocumentsWithHttpInfo(UUID id, UNKNOWN_BASE_TYPE UNKNOWN_BASE_TYPE) throws ApiException {
    Object localVarPostBody = UNKNOWN_BASE_TYPE;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling uploadPortingOrderDocuments");
    }
    
    // verify the required parameter 'UNKNOWN_BASE_TYPE' is set
    if (UNKNOWN_BASE_TYPE == null) {
      throw new ApiException(400, "Missing the required parameter 'UNKNOWN_BASE_TYPE' when calling uploadPortingOrderDocuments");
    }
    
    // create path and map variables
    String localVarPath = "/porting_orders/{id}/documents"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

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

    GenericType<PortingOrderDocumentsCreated> localVarReturnType = new GenericType<PortingOrderDocumentsCreated>() {};

    return apiClient.invokeAPI("PortingOrderApi.uploadPortingOrderDocuments", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
