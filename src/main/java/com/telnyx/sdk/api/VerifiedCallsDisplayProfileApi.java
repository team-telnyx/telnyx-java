package com.telnyx.sdk.api;

import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.Pair;

import javax.ws.rs.core.GenericType;

import com.telnyx.sdk.model.CreateVerifiedCallsDisplayProfileRequest;
import com.telnyx.sdk.model.Errors;
import com.telnyx.sdk.model.ListVerifiedCallsDisplayProfilesResponse;
import com.telnyx.sdk.model.ShowVerifiedCallsDisplayProfileResponse;
import com.telnyx.sdk.model.UpdateVerifiedCallsDisplayProfileRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class VerifiedCallsDisplayProfileApi {
  private ApiClient apiClient;

  public VerifiedCallsDisplayProfileApi() {
    this(Configuration.getDefaultApiClient());
  }

  public VerifiedCallsDisplayProfileApi(ApiClient apiClient) {
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


private ApiResponse<ShowVerifiedCallsDisplayProfileResponse> createVerifiedCallsDisplayProfileWithHttpInfo(CreateVerifiedCallsDisplayProfileRequest createVerifiedCallsDisplayProfileRequest) throws ApiException {
    Object localVarPostBody = createVerifiedCallsDisplayProfileRequest;
    
    // verify the required parameter 'createVerifiedCallsDisplayProfileRequest' is set
    if (createVerifiedCallsDisplayProfileRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'createVerifiedCallsDisplayProfileRequest' when calling createVerifiedCallsDisplayProfile");
    }
    
    // create path and map variables
    String localVarPath = "/verified_calls_display_profiles";

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

    GenericType<ShowVerifiedCallsDisplayProfileResponse> localVarReturnType = new GenericType<ShowVerifiedCallsDisplayProfileResponse>() {};

    return apiClient.invokeAPI("VerifiedCallsDisplayProfileApi.createVerifiedCallsDisplayProfile", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIcreateVerifiedCallsDisplayProfileRequest {
    private CreateVerifiedCallsDisplayProfileRequest createVerifiedCallsDisplayProfileRequest;

    private APIcreateVerifiedCallsDisplayProfileRequest() {
    }

    /**
     * Set createVerifiedCallsDisplayProfileRequest
     * @param createVerifiedCallsDisplayProfileRequest  (required)
     * @return APIcreateVerifiedCallsDisplayProfileRequest
     */
    public APIcreateVerifiedCallsDisplayProfileRequest createVerifiedCallsDisplayProfileRequest(CreateVerifiedCallsDisplayProfileRequest createVerifiedCallsDisplayProfileRequest) {
      this.createVerifiedCallsDisplayProfileRequest = createVerifiedCallsDisplayProfileRequest;
      return this;
    }

    /**
     * Execute createVerifiedCallsDisplayProfile request
     * @return ShowVerifiedCallsDisplayProfileResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 201 </td><td> Successful response with a Verified Calls Display Profile. </td><td>  -  </td></tr>
         <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ShowVerifiedCallsDisplayProfileResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute createVerifiedCallsDisplayProfile request with HTTP info returned
     * @return ApiResponse&lt;ShowVerifiedCallsDisplayProfileResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 201 </td><td> Successful response with a Verified Calls Display Profile. </td><td>  -  </td></tr>
         <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<ShowVerifiedCallsDisplayProfileResponse> executeWithHttpInfo() throws ApiException {
      return createVerifiedCallsDisplayProfileWithHttpInfo(createVerifiedCallsDisplayProfileRequest);
    }
  }

  /**
   * Creates a Verified Calls Display Profile
   * Creates a Verified Calls Display Profile associated with the given Business Identity
   * @return createVerifiedCallsDisplayProfileRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIcreateVerifiedCallsDisplayProfileRequest createVerifiedCallsDisplayProfile() throws ApiException {
    return new APIcreateVerifiedCallsDisplayProfileRequest();
  }
  /**
   * Creates a Verification Request
   * Starts a new Verified Calls Display Profile verification process.
   * @param id Identifies the Verified Calls Display Profile (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> The Verification Request was issued. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public void createVerifiedCallsDisplayProfileVerificationRequest(String id) throws ApiException {
    createVerifiedCallsDisplayProfileVerificationRequestWithHttpInfo(id);
  }

  /**
   * Creates a Verification Request
   * Starts a new Verified Calls Display Profile verification process.
   * @param id Identifies the Verified Calls Display Profile (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> The Verification Request was issued. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> createVerifiedCallsDisplayProfileVerificationRequestWithHttpInfo(String id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling createVerifiedCallsDisplayProfileVerificationRequest");
    }
    
    // create path and map variables
    String localVarPath = "/verified_calls_display_profiles/{id}/verification_request"
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

    return apiClient.invokeAPI("VerifiedCallsDisplayProfileApi.createVerifiedCallsDisplayProfileVerificationRequest", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }

private ApiResponse<ShowVerifiedCallsDisplayProfileResponse> deleteVerifiedCallsDisplayProfileWithHttpInfo(String id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling deleteVerifiedCallsDisplayProfile");
    }
    
    // create path and map variables
    String localVarPath = "/verified_calls_display_profiles/{id}"
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

    GenericType<ShowVerifiedCallsDisplayProfileResponse> localVarReturnType = new GenericType<ShowVerifiedCallsDisplayProfileResponse>() {};

    return apiClient.invokeAPI("VerifiedCallsDisplayProfileApi.deleteVerifiedCallsDisplayProfile", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIdeleteVerifiedCallsDisplayProfileRequest {
    private String id;

    private APIdeleteVerifiedCallsDisplayProfileRequest(String id) {
      this.id = id;
    }

    /**
     * Execute deleteVerifiedCallsDisplayProfile request
     * @return ShowVerifiedCallsDisplayProfileResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response with a Verified Calls Display Profile. </td><td>  -  </td></tr>
         <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ShowVerifiedCallsDisplayProfileResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute deleteVerifiedCallsDisplayProfile request with HTTP info returned
     * @return ApiResponse&lt;ShowVerifiedCallsDisplayProfileResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response with a Verified Calls Display Profile. </td><td>  -  </td></tr>
         <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<ShowVerifiedCallsDisplayProfileResponse> executeWithHttpInfo() throws ApiException {
      return deleteVerifiedCallsDisplayProfileWithHttpInfo(id);
    }
  }

  /**
   * Deletes the Verified Calls Display Profile
   * Deletes the Verified Calls Display Profile. This action will fail if any verification requests have been made for this Verified Calls Display Profile. Please contact support@telnyx.com in case you want to delete a Verified Calls Display Profile in that situation.
   * @param id Identifies the Verified Calls Display Profile (required)
   * @return deleteVerifiedCallsDisplayProfileRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIdeleteVerifiedCallsDisplayProfileRequest deleteVerifiedCallsDisplayProfile(String id) throws ApiException {
    return new APIdeleteVerifiedCallsDisplayProfileRequest(id);
  }

private ApiResponse<ShowVerifiedCallsDisplayProfileResponse> displayVerifiedCallsDisplayProfileWithHttpInfo(String id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling displayVerifiedCallsDisplayProfile");
    }
    
    // create path and map variables
    String localVarPath = "/verified_calls_display_profiles/{id}"
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

    GenericType<ShowVerifiedCallsDisplayProfileResponse> localVarReturnType = new GenericType<ShowVerifiedCallsDisplayProfileResponse>() {};

    return apiClient.invokeAPI("VerifiedCallsDisplayProfileApi.displayVerifiedCallsDisplayProfile", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIdisplayVerifiedCallsDisplayProfileRequest {
    private String id;

    private APIdisplayVerifiedCallsDisplayProfileRequest(String id) {
      this.id = id;
    }

    /**
     * Execute displayVerifiedCallsDisplayProfile request
     * @return ShowVerifiedCallsDisplayProfileResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response with a Verified Calls Display Profile. </td><td>  -  </td></tr>
         <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ShowVerifiedCallsDisplayProfileResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute displayVerifiedCallsDisplayProfile request with HTTP info returned
     * @return ApiResponse&lt;ShowVerifiedCallsDisplayProfileResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response with a Verified Calls Display Profile. </td><td>  -  </td></tr>
         <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<ShowVerifiedCallsDisplayProfileResponse> executeWithHttpInfo() throws ApiException {
      return displayVerifiedCallsDisplayProfileWithHttpInfo(id);
    }
  }

  /**
   * Display the Verified Calls Display Profile
   * 
   * @param id Identifies the Verified Calls Display Profile (required)
   * @return displayVerifiedCallsDisplayProfileRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIdisplayVerifiedCallsDisplayProfileRequest displayVerifiedCallsDisplayProfile(String id) throws ApiException {
    return new APIdisplayVerifiedCallsDisplayProfileRequest(id);
  }

private ApiResponse<ListVerifiedCallsDisplayProfilesResponse> listVerifiedCallsDisplayProfilesWithHttpInfo(Integer pageNumber, Integer pageSize) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/verified_calls_display_profiles";

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

    GenericType<ListVerifiedCallsDisplayProfilesResponse> localVarReturnType = new GenericType<ListVerifiedCallsDisplayProfilesResponse>() {};

    return apiClient.invokeAPI("VerifiedCallsDisplayProfileApi.listVerifiedCallsDisplayProfiles", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIlistVerifiedCallsDisplayProfilesRequest {
    private Integer pageNumber;
    private Integer pageSize;

    private APIlistVerifiedCallsDisplayProfilesRequest() {
    }

    /**
     * Set pageNumber
     * @param pageNumber The page number to load (optional, default to 1)
     * @return APIlistVerifiedCallsDisplayProfilesRequest
     */
    public APIlistVerifiedCallsDisplayProfilesRequest pageNumber(Integer pageNumber) {
      this.pageNumber = pageNumber;
      return this;
    }

    /**
     * Set pageSize
     * @param pageSize The size of the page (optional, default to 20)
     * @return APIlistVerifiedCallsDisplayProfilesRequest
     */
    public APIlistVerifiedCallsDisplayProfilesRequest pageSize(Integer pageSize) {
      this.pageSize = pageSize;
      return this;
    }

    /**
     * Execute listVerifiedCallsDisplayProfiles request
     * @return ListVerifiedCallsDisplayProfilesResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response with a list of Verified Calls Display Profiles. </td><td>  -  </td></tr>
         <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ListVerifiedCallsDisplayProfilesResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute listVerifiedCallsDisplayProfiles request with HTTP info returned
     * @return ApiResponse&lt;ListVerifiedCallsDisplayProfilesResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response with a list of Verified Calls Display Profiles. </td><td>  -  </td></tr>
         <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<ListVerifiedCallsDisplayProfilesResponse> executeWithHttpInfo() throws ApiException {
      return listVerifiedCallsDisplayProfilesWithHttpInfo(pageNumber, pageSize);
    }
  }

  /**
   * Lists the Verified Calls Display Profiles owned by the current user/organization
   * 
   * @return listVerifiedCallsDisplayProfilesRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIlistVerifiedCallsDisplayProfilesRequest listVerifiedCallsDisplayProfiles() throws ApiException {
    return new APIlistVerifiedCallsDisplayProfilesRequest();
  }

private ApiResponse<Void> updateVerifiedCallsDisplayProfileWithHttpInfo(String id, UpdateVerifiedCallsDisplayProfileRequest updateVerifiedCallsDisplayProfileRequest) throws ApiException {
    Object localVarPostBody = updateVerifiedCallsDisplayProfileRequest;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling updateVerifiedCallsDisplayProfile");
    }
    
    // verify the required parameter 'updateVerifiedCallsDisplayProfileRequest' is set
    if (updateVerifiedCallsDisplayProfileRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'updateVerifiedCallsDisplayProfileRequest' when calling updateVerifiedCallsDisplayProfile");
    }
    
    // create path and map variables
    String localVarPath = "/verified_calls_display_profiles/{id}"
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

    return apiClient.invokeAPI("VerifiedCallsDisplayProfileApi.updateVerifiedCallsDisplayProfile", localVarPath, "PATCH", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }

  public class APIupdateVerifiedCallsDisplayProfileRequest {
    private String id;
    private UpdateVerifiedCallsDisplayProfileRequest updateVerifiedCallsDisplayProfileRequest;

    private APIupdateVerifiedCallsDisplayProfileRequest(String id) {
      this.id = id;
    }

    /**
     * Set updateVerifiedCallsDisplayProfileRequest
     * @param updateVerifiedCallsDisplayProfileRequest  (required)
     * @return APIupdateVerifiedCallsDisplayProfileRequest
     */
    public APIupdateVerifiedCallsDisplayProfileRequest updateVerifiedCallsDisplayProfileRequest(UpdateVerifiedCallsDisplayProfileRequest updateVerifiedCallsDisplayProfileRequest) {
      this.updateVerifiedCallsDisplayProfileRequest = updateVerifiedCallsDisplayProfileRequest;
      return this;
    }

    /**
     * Execute updateVerifiedCallsDisplayProfile request
     
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Verified Calls Display Profile was updated. </td><td>  -  </td></tr>
         <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
       </table>
     
     */
    
    public void execute() throws ApiException {
      this.executeWithHttpInfo().getData();
    }

    /**
     * Execute updateVerifiedCallsDisplayProfile request with HTTP info returned
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Verified Calls Display Profile was updated. </td><td>  -  </td></tr>
         <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<Void> executeWithHttpInfo() throws ApiException {
      return updateVerifiedCallsDisplayProfileWithHttpInfo(id, updateVerifiedCallsDisplayProfileRequest);
    }
  }

  /**
   * Update a Verified Calls Display Profile
   * Update an existing Verified Calls Display Profile and allows adding/removing nested Call Reasons and Phone Numbers. Different attributes can be updated depending on the Verified Calls Display Profile&#39;s status: For the VERIFICATION_STATE_PENDING status, no fields can be updated. For the VERIFICATION_STATE_VERIFIED status, it is allowed only to add/remove Call Reaons and Phone Numbers. For the other statuses, all fields can be updated. All existing Call Reasons and Phone Numbers must be sent during the request, or the update will fail.
   * @param id Identifies the Verified Calls Display Profile (required)
   * @return updateVerifiedCallsDisplayProfileRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIupdateVerifiedCallsDisplayProfileRequest updateVerifiedCallsDisplayProfile(String id) throws ApiException {
    return new APIupdateVerifiedCallsDisplayProfileRequest(id);
  }
}
