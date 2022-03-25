package com.telnyx.sdk.api;

import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.Pair;

import javax.ws.rs.core.GenericType;

import com.telnyx.sdk.model.CreateCommentPortoutRequest;
import com.telnyx.sdk.model.CreatePortOutSupportingDocumentsResponse;
import com.telnyx.sdk.model.CreatePortingSupportingDocsRequest;
import com.telnyx.sdk.model.ListPortoutComments;
import com.telnyx.sdk.model.ListPortoutResponse;
import com.telnyx.sdk.model.PortOutListSupportingDocumentsResponse;
import com.telnyx.sdk.model.PortoutCommentResposne;
import com.telnyx.sdk.model.PortoutResponse;
import java.util.UUID;
import com.telnyx.sdk.model.UpdatePortoutStatusRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class NumberPortoutApi {
  private ApiClient apiClient;

  public NumberPortoutApi() {
    this(Configuration.getDefaultApiClient());
  }

  public NumberPortoutApi(ApiClient apiClient) {
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
   * List all comments for a portout request
   * Returns a list of comments for a portout request.
   * @param id Portout id (required)
   * @return ListPortoutComments
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Portout Comments </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check message field in response for details. </td><td>  -  </td></tr>
     </table>
   */
  public ListPortoutComments findPortoutComments(UUID id) throws ApiException {
    return findPortoutCommentsWithHttpInfo(id).getData();
  }

  /**
   * List all comments for a portout request
   * Returns a list of comments for a portout request.
   * @param id Portout id (required)
   * @return ApiResponse&lt;ListPortoutComments&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Portout Comments </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check message field in response for details. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ListPortoutComments> findPortoutCommentsWithHttpInfo(UUID id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling findPortoutComments");
    }
    
    // create path and map variables
    String localVarPath = "/portouts/{id}/comments"
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

    GenericType<ListPortoutComments> localVarReturnType = new GenericType<ListPortoutComments>() {};

    return apiClient.invokeAPI("NumberPortoutApi.findPortoutComments", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get a portout request
   * Returns the portout request based on the ID provided
   * @param id Portout id (required)
   * @return PortoutResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Portout Response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check message field in response for details. </td><td>  -  </td></tr>
     </table>
   */
  public PortoutResponse findPortoutRequest(UUID id) throws ApiException {
    return findPortoutRequestWithHttpInfo(id).getData();
  }

  /**
   * Get a portout request
   * Returns the portout request based on the ID provided
   * @param id Portout id (required)
   * @return ApiResponse&lt;PortoutResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Portout Response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check message field in response for details. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<PortoutResponse> findPortoutRequestWithHttpInfo(UUID id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling findPortoutRequest");
    }
    
    // create path and map variables
    String localVarPath = "/portouts/{id}"
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

    GenericType<PortoutResponse> localVarReturnType = new GenericType<PortoutResponse>() {};

    return apiClient.invokeAPI("NumberPortoutApi.findPortoutRequest", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * List supporting documents on a portout request
   * List every supporting documents for a portout request.
   * @param id Portout id (required)
   * @return PortOutListSupportingDocumentsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Portout Supporting Documents </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
     </table>
   */
  public PortOutListSupportingDocumentsResponse getPortRequestSupportingDocuments(UUID id) throws ApiException {
    return getPortRequestSupportingDocumentsWithHttpInfo(id).getData();
  }

  /**
   * List supporting documents on a portout request
   * List every supporting documents for a portout request.
   * @param id Portout id (required)
   * @return ApiResponse&lt;PortOutListSupportingDocumentsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Portout Supporting Documents </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<PortOutListSupportingDocumentsResponse> getPortRequestSupportingDocumentsWithHttpInfo(UUID id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getPortRequestSupportingDocuments");
    }
    
    // create path and map variables
    String localVarPath = "/portouts/{id}/supporting_documents"
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

    GenericType<PortOutListSupportingDocumentsResponse> localVarReturnType = new GenericType<PortOutListSupportingDocumentsResponse>() {};

    return apiClient.invokeAPI("NumberPortoutApi.getPortRequestSupportingDocuments", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * List portout requests
   * Returns the portout requests according to filters
   * @param filterCarrierName Filter by new carrier name. (optional)
   * @param filterSpid Filter by new carrier spid. (optional)
   * @param filterStatus Filter by portout status. (optional)
   * @param pageNumber The page number to load (optional, default to 1)
   * @param pageSize The size of the page (optional, default to 20)
   * @return ListPortoutResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Portout Response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check message field in response for details. </td><td>  -  </td></tr>
     </table>
   */
  public ListPortoutResponse listPortoutRequest(String filterCarrierName, String filterSpid, String filterStatus, Integer pageNumber, Integer pageSize) throws ApiException {
    return listPortoutRequestWithHttpInfo(filterCarrierName, filterSpid, filterStatus, pageNumber, pageSize).getData();
  }

  /**
   * List portout requests
   * Returns the portout requests according to filters
   * @param filterCarrierName Filter by new carrier name. (optional)
   * @param filterSpid Filter by new carrier spid. (optional)
   * @param filterStatus Filter by portout status. (optional)
   * @param pageNumber The page number to load (optional, default to 1)
   * @param pageSize The size of the page (optional, default to 20)
   * @return ApiResponse&lt;ListPortoutResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Portout Response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check message field in response for details. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ListPortoutResponse> listPortoutRequestWithHttpInfo(String filterCarrierName, String filterSpid, String filterStatus, Integer pageNumber, Integer pageSize) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/portouts";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[carrier_name]", filterCarrierName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[spid]", filterSpid));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[status]", filterStatus));
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

    GenericType<ListPortoutResponse> localVarReturnType = new GenericType<ListPortoutResponse>() {};

    return apiClient.invokeAPI("NumberPortoutApi.listPortoutRequest", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Create a comment on a portout request
   * Creates a comment on a portout request.
   * @param id Portout id (required)
   * @param createCommentPortoutRequest  (required)
   * @return PortoutCommentResposne
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Portout Comment Response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check message field in response for details. </td><td>  -  </td></tr>
     </table>
   */
  public PortoutCommentResposne postPortRequestComment(UUID id, CreateCommentPortoutRequest createCommentPortoutRequest) throws ApiException {
    return postPortRequestCommentWithHttpInfo(id, createCommentPortoutRequest).getData();
  }

  /**
   * Create a comment on a portout request
   * Creates a comment on a portout request.
   * @param id Portout id (required)
   * @param createCommentPortoutRequest  (required)
   * @return ApiResponse&lt;PortoutCommentResposne&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Portout Comment Response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check message field in response for details. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<PortoutCommentResposne> postPortRequestCommentWithHttpInfo(UUID id, CreateCommentPortoutRequest createCommentPortoutRequest) throws ApiException {
    Object localVarPostBody = createCommentPortoutRequest;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling postPortRequestComment");
    }
    
    // verify the required parameter 'createCommentPortoutRequest' is set
    if (createCommentPortoutRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'createCommentPortoutRequest' when calling postPortRequestComment");
    }
    
    // create path and map variables
    String localVarPath = "/portouts/{id}/comments"
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

    GenericType<PortoutCommentResposne> localVarReturnType = new GenericType<PortoutCommentResposne>() {};

    return apiClient.invokeAPI("NumberPortoutApi.postPortRequestComment", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Create a list of supporting documents on a portout request
   * Creates a list of supporting documents on a portout request.
   * @param id Portout id (required)
   * @param createPortingSupportingDocsRequest  (required)
   * @return CreatePortOutSupportingDocumentsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Portout Supporting Documents </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check message field in response for details. </td><td>  -  </td></tr>
     </table>
   */
  public CreatePortOutSupportingDocumentsResponse postPortRequestSupportingDocuments(UUID id, CreatePortingSupportingDocsRequest createPortingSupportingDocsRequest) throws ApiException {
    return postPortRequestSupportingDocumentsWithHttpInfo(id, createPortingSupportingDocsRequest).getData();
  }

  /**
   * Create a list of supporting documents on a portout request
   * Creates a list of supporting documents on a portout request.
   * @param id Portout id (required)
   * @param createPortingSupportingDocsRequest  (required)
   * @return ApiResponse&lt;CreatePortOutSupportingDocumentsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Portout Supporting Documents </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check message field in response for details. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CreatePortOutSupportingDocumentsResponse> postPortRequestSupportingDocumentsWithHttpInfo(UUID id, CreatePortingSupportingDocsRequest createPortingSupportingDocsRequest) throws ApiException {
    Object localVarPostBody = createPortingSupportingDocsRequest;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling postPortRequestSupportingDocuments");
    }
    
    // verify the required parameter 'createPortingSupportingDocsRequest' is set
    if (createPortingSupportingDocsRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'createPortingSupportingDocsRequest' when calling postPortRequestSupportingDocuments");
    }
    
    // create path and map variables
    String localVarPath = "/portouts/{id}/supporting_documents"
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

    GenericType<CreatePortOutSupportingDocumentsResponse> localVarReturnType = new GenericType<CreatePortOutSupportingDocumentsResponse>() {};

    return apiClient.invokeAPI("NumberPortoutApi.postPortRequestSupportingDocuments", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Update Status
   * Authorize or reject portout request
   * @param id Portout id (required)
   * @param status Updated portout status (required)
   * @param updatePortoutStatusRequest  (required)
   * @return PortoutResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Portout Response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check message field in response for details. </td><td>  -  </td></tr>
     </table>
   */
  public PortoutResponse updatePortoutRequest(UUID id, String status, UpdatePortoutStatusRequest updatePortoutStatusRequest) throws ApiException {
    return updatePortoutRequestWithHttpInfo(id, status, updatePortoutStatusRequest).getData();
  }

  /**
   * Update Status
   * Authorize or reject portout request
   * @param id Portout id (required)
   * @param status Updated portout status (required)
   * @param updatePortoutStatusRequest  (required)
   * @return ApiResponse&lt;PortoutResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Portout Response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check message field in response for details. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<PortoutResponse> updatePortoutRequestWithHttpInfo(UUID id, String status, UpdatePortoutStatusRequest updatePortoutStatusRequest) throws ApiException {
    Object localVarPostBody = updatePortoutStatusRequest;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling updatePortoutRequest");
    }
    
    // verify the required parameter 'status' is set
    if (status == null) {
      throw new ApiException(400, "Missing the required parameter 'status' when calling updatePortoutRequest");
    }
    
    // verify the required parameter 'updatePortoutStatusRequest' is set
    if (updatePortoutStatusRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'updatePortoutStatusRequest' when calling updatePortoutRequest");
    }
    
    // create path and map variables
    String localVarPath = "/portouts/{id}/{status}"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()))
      .replaceAll("\\{" + "status" + "\\}", apiClient.escapeString(status.toString()));

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

    GenericType<PortoutResponse> localVarReturnType = new GenericType<PortoutResponse>() {};

    return apiClient.invokeAPI("NumberPortoutApi.updatePortoutRequest", localVarPath, "PATCH", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
