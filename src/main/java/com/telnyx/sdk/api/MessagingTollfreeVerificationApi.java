package com.telnyx.sdk.api;

import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.Pair;

import jakarta.ws.rs.core.GenericType;

import com.telnyx.sdk.model.Errors;
import java.time.OffsetDateTime;
import com.telnyx.sdk.model.PaginatedVerificationRequestStatus;
import com.telnyx.sdk.model.TFVerificationRequest;
import com.telnyx.sdk.model.TFVerificationStatus;
import java.util.UUID;
import com.telnyx.sdk.model.VerificationRequestEgress;
import com.telnyx.sdk.model.VerificationRequestStatus;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class MessagingTollfreeVerificationApi {
  private ApiClient apiClient;

  public MessagingTollfreeVerificationApi() {
    this(Configuration.getDefaultApiClient());
  }

  public MessagingTollfreeVerificationApi(ApiClient apiClient) {
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
   * Delete Verification Request
   * Delete a verification request  A request may only be deleted when when the request is in the \&quot;rejected\&quot; state.  * &#x60;HTTP 200&#x60;: request successfully deleted * &#x60;HTTP 400&#x60;: request exists but can&#39;t be deleted (i.e. not rejected) * &#x60;HTTP 404&#x60;: request unknown or already deleted
   * @param id  (required)
   * @return Object
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public Object deleteVerificationRequest(UUID id) throws ApiException {
    return deleteVerificationRequestWithHttpInfo(id).getData();
  }

  /**
   * Delete Verification Request
   * Delete a verification request  A request may only be deleted when when the request is in the \&quot;rejected\&quot; state.  * &#x60;HTTP 200&#x60;: request successfully deleted * &#x60;HTTP 400&#x60;: request exists but can&#39;t be deleted (i.e. not rejected) * &#x60;HTTP 404&#x60;: request unknown or already deleted
   * @param id  (required)
   * @return ApiResponse&lt;Object&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Object> deleteVerificationRequestWithHttpInfo(UUID id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling deleteVerificationRequest");
    }
    
    // create path and map variables
    String localVarPath = "/messaging_tollfree/verification/requests/{id}"
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

    GenericType<Object> localVarReturnType = new GenericType<Object>() {};

    return apiClient.invokeAPI("MessagingTollfreeVerificationApi.deleteVerificationRequest", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get Verification Request
   * Get a single verification request by its ID.
   * @param id  (required)
   * @return VerificationRequestStatus
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public VerificationRequestStatus getVerificationRequest(UUID id) throws ApiException {
    return getVerificationRequestWithHttpInfo(id).getData();
  }

  /**
   * Get Verification Request
   * Get a single verification request by its ID.
   * @param id  (required)
   * @return ApiResponse&lt;VerificationRequestStatus&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<VerificationRequestStatus> getVerificationRequestWithHttpInfo(UUID id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getVerificationRequest");
    }
    
    // create path and map variables
    String localVarPath = "/messaging_tollfree/verification/requests/{id}"
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

    GenericType<VerificationRequestStatus> localVarReturnType = new GenericType<VerificationRequestStatus>() {};

    return apiClient.invokeAPI("MessagingTollfreeVerificationApi.getVerificationRequest", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * List Verification Requests
   * Get a list of previously-submitted tollfree verification requests
   * @param page  (required)
   * @param pageSize          Request this many records per page          This value is automatically clamped if the provided value is too large.          (required)
   * @param dateStart  (optional)
   * @param dateEnd  (optional)
   * @param status  (optional)
   * @param phoneNumber  (optional)
   * @return PaginatedVerificationRequestStatus
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public PaginatedVerificationRequestStatus listVerificationRequests(Integer page, Integer pageSize, OffsetDateTime dateStart, OffsetDateTime dateEnd, TFVerificationStatus status, String phoneNumber) throws ApiException {
    return listVerificationRequestsWithHttpInfo(page, pageSize, dateStart, dateEnd, status, phoneNumber).getData();
  }

  /**
   * List Verification Requests
   * Get a list of previously-submitted tollfree verification requests
   * @param page  (required)
   * @param pageSize          Request this many records per page          This value is automatically clamped if the provided value is too large.          (required)
   * @param dateStart  (optional)
   * @param dateEnd  (optional)
   * @param status  (optional)
   * @param phoneNumber  (optional)
   * @return ApiResponse&lt;PaginatedVerificationRequestStatus&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<PaginatedVerificationRequestStatus> listVerificationRequestsWithHttpInfo(Integer page, Integer pageSize, OffsetDateTime dateStart, OffsetDateTime dateEnd, TFVerificationStatus status, String phoneNumber) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'page' is set
    if (page == null) {
      throw new ApiException(400, "Missing the required parameter 'page' when calling listVerificationRequests");
    }
    
    // verify the required parameter 'pageSize' is set
    if (pageSize == null) {
      throw new ApiException(400, "Missing the required parameter 'pageSize' when calling listVerificationRequests");
    }
    
    // create path and map variables
    String localVarPath = "/messaging_tollfree/verification/requests";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page", page));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page_size", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "date_start", dateStart));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "date_end", dateEnd));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "status", status));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "phone_number", phoneNumber));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    GenericType<PaginatedVerificationRequestStatus> localVarReturnType = new GenericType<PaginatedVerificationRequestStatus>() {};

    return apiClient.invokeAPI("MessagingTollfreeVerificationApi.listVerificationRequests", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Submit Verification Request
   * Submit a new tollfree verification request
   * @param tfVerificationRequest  (required)
   * @return VerificationRequestEgress
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public VerificationRequestEgress submitVerificationRequest(TFVerificationRequest tfVerificationRequest) throws ApiException {
    return submitVerificationRequestWithHttpInfo(tfVerificationRequest).getData();
  }

  /**
   * Submit Verification Request
   * Submit a new tollfree verification request
   * @param tfVerificationRequest  (required)
   * @return ApiResponse&lt;VerificationRequestEgress&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<VerificationRequestEgress> submitVerificationRequestWithHttpInfo(TFVerificationRequest tfVerificationRequest) throws ApiException {
    Object localVarPostBody = tfVerificationRequest;
    
    // verify the required parameter 'tfVerificationRequest' is set
    if (tfVerificationRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'tfVerificationRequest' when calling submitVerificationRequest");
    }
    
    // create path and map variables
    String localVarPath = "/messaging_tollfree/verification/requests";

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

    GenericType<VerificationRequestEgress> localVarReturnType = new GenericType<VerificationRequestEgress>() {};

    return apiClient.invokeAPI("MessagingTollfreeVerificationApi.submitVerificationRequest", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Update Verification Request
   * Update an existing tollfree verification request. This is particularly useful when there are pending customer actions to be taken.
   * @param id  (required)
   * @param tfVerificationRequest  (required)
   * @return VerificationRequestEgress
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public VerificationRequestEgress updateVerificationRequest(UUID id, TFVerificationRequest tfVerificationRequest) throws ApiException {
    return updateVerificationRequestWithHttpInfo(id, tfVerificationRequest).getData();
  }

  /**
   * Update Verification Request
   * Update an existing tollfree verification request. This is particularly useful when there are pending customer actions to be taken.
   * @param id  (required)
   * @param tfVerificationRequest  (required)
   * @return ApiResponse&lt;VerificationRequestEgress&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<VerificationRequestEgress> updateVerificationRequestWithHttpInfo(UUID id, TFVerificationRequest tfVerificationRequest) throws ApiException {
    Object localVarPostBody = tfVerificationRequest;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling updateVerificationRequest");
    }
    
    // verify the required parameter 'tfVerificationRequest' is set
    if (tfVerificationRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'tfVerificationRequest' when calling updateVerificationRequest");
    }
    
    // create path and map variables
    String localVarPath = "/messaging_tollfree/verification/requests/{id}"
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

    GenericType<VerificationRequestEgress> localVarReturnType = new GenericType<VerificationRequestEgress>() {};

    return apiClient.invokeAPI("MessagingTollfreeVerificationApi.updateVerificationRequest", localVarPath, "PATCH", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
