package com.telnyx.sdk.api;

import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.Pair;

import jakarta.ws.rs.core.GenericType;

import com.telnyx.sdk.model.CreateOrUpdateBusinessIdentityRequest;
import com.telnyx.sdk.model.Errors;
import com.telnyx.sdk.model.ListBusinessIdentitiesResponse;
import com.telnyx.sdk.model.ShowBusinessIdentityResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class BusinessIdentityApi {
  private ApiClient apiClient;

  public BusinessIdentityApi() {
    this(Configuration.getDefaultApiClient());
  }

  public BusinessIdentityApi(ApiClient apiClient) {
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
   * Creates a Business Identity
   * Creates a new Business Identity.
   * @param createOrUpdateBusinessIdentityRequest  (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Business Identity was created. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public void createBusinessIdentity(CreateOrUpdateBusinessIdentityRequest createOrUpdateBusinessIdentityRequest) throws ApiException {
    createBusinessIdentityWithHttpInfo(createOrUpdateBusinessIdentityRequest);
  }

  /**
   * Creates a Business Identity
   * Creates a new Business Identity.
   * @param createOrUpdateBusinessIdentityRequest  (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Business Identity was created. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> createBusinessIdentityWithHttpInfo(CreateOrUpdateBusinessIdentityRequest createOrUpdateBusinessIdentityRequest) throws ApiException {
    Object localVarPostBody = createOrUpdateBusinessIdentityRequest;
    
    // verify the required parameter 'createOrUpdateBusinessIdentityRequest' is set
    if (createOrUpdateBusinessIdentityRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'createOrUpdateBusinessIdentityRequest' when calling createBusinessIdentity");
    }
    
    // create path and map variables
    String localVarPath = "/business_identities";

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

    return apiClient.invokeAPI("BusinessIdentityApi.createBusinessIdentity", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }

private ApiResponse<ShowBusinessIdentityResponse> deleteBusinessIdentityWithHttpInfo(String id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling deleteBusinessIdentity");
    }
    
    // create path and map variables
    String localVarPath = "/business_identities/{id}"
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

    GenericType<ShowBusinessIdentityResponse> localVarReturnType = new GenericType<ShowBusinessIdentityResponse>() {};

    return apiClient.invokeAPI("BusinessIdentityApi.deleteBusinessIdentity", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIdeleteBusinessIdentityRequest {
    private String id;

    private APIdeleteBusinessIdentityRequest(String id) {
      this.id = id;
    }

    /**
     * Execute deleteBusinessIdentity request
     * @return ShowBusinessIdentityResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response with a Business Identity. </td><td>  -  </td></tr>
         <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ShowBusinessIdentityResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute deleteBusinessIdentity request with HTTP info returned
     * @return ApiResponse&lt;ShowBusinessIdentityResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response with a Business Identity. </td><td>  -  </td></tr>
         <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<ShowBusinessIdentityResponse> executeWithHttpInfo() throws ApiException {
      return deleteBusinessIdentityWithHttpInfo(id);
    }
  }

  /**
   * Delete a Business Identity
   * Deletes the Business Identity. This action will fail if any verification requests have been made for any associated Display Profile. Please contact support@telnyx.com in case you want to delete a Business Identity in that situation.
   * @param id Identifies the Business Identity (required)
   * @return deleteBusinessIdentityRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIdeleteBusinessIdentityRequest deleteBusinessIdentity(String id) throws ApiException {
    return new APIdeleteBusinessIdentityRequest(id);
  }

private ApiResponse<ShowBusinessIdentityResponse> displayBusinessIdentityWithHttpInfo(String id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling displayBusinessIdentity");
    }
    
    // create path and map variables
    String localVarPath = "/business_identities/{id}"
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

    GenericType<ShowBusinessIdentityResponse> localVarReturnType = new GenericType<ShowBusinessIdentityResponse>() {};

    return apiClient.invokeAPI("BusinessIdentityApi.displayBusinessIdentity", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIdisplayBusinessIdentityRequest {
    private String id;

    private APIdisplayBusinessIdentityRequest(String id) {
      this.id = id;
    }

    /**
     * Execute displayBusinessIdentity request
     * @return ShowBusinessIdentityResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response with a Business Identity. </td><td>  -  </td></tr>
         <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ShowBusinessIdentityResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute displayBusinessIdentity request with HTTP info returned
     * @return ApiResponse&lt;ShowBusinessIdentityResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response with a Business Identity. </td><td>  -  </td></tr>
         <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<ShowBusinessIdentityResponse> executeWithHttpInfo() throws ApiException {
      return displayBusinessIdentityWithHttpInfo(id);
    }
  }

  /**
   * Display the Business Identity
   * 
   * @param id Identifies the Business Identity (required)
   * @return displayBusinessIdentityRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIdisplayBusinessIdentityRequest displayBusinessIdentity(String id) throws ApiException {
    return new APIdisplayBusinessIdentityRequest(id);
  }

private ApiResponse<ListBusinessIdentitiesResponse> listBusinessIdentitiesWithHttpInfo(Integer pageNumber, Integer pageSize) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/business_identities";

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

    GenericType<ListBusinessIdentitiesResponse> localVarReturnType = new GenericType<ListBusinessIdentitiesResponse>() {};

    return apiClient.invokeAPI("BusinessIdentityApi.listBusinessIdentities", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIlistBusinessIdentitiesRequest {
    private Integer pageNumber;
    private Integer pageSize;

    private APIlistBusinessIdentitiesRequest() {
    }

    /**
     * Set pageNumber
     * @param pageNumber The page number to load (optional, default to 1)
     * @return APIlistBusinessIdentitiesRequest
     */
    public APIlistBusinessIdentitiesRequest pageNumber(Integer pageNumber) {
      this.pageNumber = pageNumber;
      return this;
    }

    /**
     * Set pageSize
     * @param pageSize The size of the page (optional, default to 20)
     * @return APIlistBusinessIdentitiesRequest
     */
    public APIlistBusinessIdentitiesRequest pageSize(Integer pageSize) {
      this.pageSize = pageSize;
      return this;
    }

    /**
     * Execute listBusinessIdentities request
     * @return ListBusinessIdentitiesResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response with a list of Business Identities. </td><td>  -  </td></tr>
         <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ListBusinessIdentitiesResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute listBusinessIdentities request with HTTP info returned
     * @return ApiResponse&lt;ListBusinessIdentitiesResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response with a list of Business Identities. </td><td>  -  </td></tr>
         <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<ListBusinessIdentitiesResponse> executeWithHttpInfo() throws ApiException {
      return listBusinessIdentitiesWithHttpInfo(pageNumber, pageSize);
    }
  }

  /**
   * Lists the Business Identities owned by the current user/organization
   * 
   * @return listBusinessIdentitiesRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIlistBusinessIdentitiesRequest listBusinessIdentities() throws ApiException {
    return new APIlistBusinessIdentitiesRequest();
  }
  /**
   * Update a Business Identity
   * Update an existing Business Identity.
   * @param id Identifies the Business Identity (required)
   * @param createOrUpdateBusinessIdentityRequest  (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Business Identity was updated. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public void updateBusinessIdentity(String id, CreateOrUpdateBusinessIdentityRequest createOrUpdateBusinessIdentityRequest) throws ApiException {
    updateBusinessIdentityWithHttpInfo(id, createOrUpdateBusinessIdentityRequest);
  }

  /**
   * Update a Business Identity
   * Update an existing Business Identity.
   * @param id Identifies the Business Identity (required)
   * @param createOrUpdateBusinessIdentityRequest  (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Business Identity was updated. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> updateBusinessIdentityWithHttpInfo(String id, CreateOrUpdateBusinessIdentityRequest createOrUpdateBusinessIdentityRequest) throws ApiException {
    Object localVarPostBody = createOrUpdateBusinessIdentityRequest;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling updateBusinessIdentity");
    }
    
    // verify the required parameter 'createOrUpdateBusinessIdentityRequest' is set
    if (createOrUpdateBusinessIdentityRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'createOrUpdateBusinessIdentityRequest' when calling updateBusinessIdentity");
    }
    
    // create path and map variables
    String localVarPath = "/business_identities/{id}"
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

    return apiClient.invokeAPI("BusinessIdentityApi.updateBusinessIdentity", localVarPath, "PATCH", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
}
