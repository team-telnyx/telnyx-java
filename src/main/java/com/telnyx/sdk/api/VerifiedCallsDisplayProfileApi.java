package com.telnyx.sdk.api;

import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.Pair;

import jakarta.ws.rs.core.GenericType;

import com.telnyx.sdk.model.CreateVerifiedCallsDisplayProfileRequest;
import com.telnyx.sdk.model.Errors;
import com.telnyx.sdk.model.ListVerifiedCallsDisplayProfilesResponse;
import com.telnyx.sdk.model.ShowVerifiedCallsDisplayProfileResponse;
import com.telnyx.sdk.model.UpdateVerifiedCallsDisplayProfileRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
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


private ApiResponse<ShowVerifiedCallsDisplayProfileResponse> createProfileWithHttpInfo(CreateVerifiedCallsDisplayProfileRequest createVerifiedCallsDisplayProfileRequest) throws ApiException {
    Object localVarPostBody = createVerifiedCallsDisplayProfileRequest;
    
    // verify the required parameter 'createVerifiedCallsDisplayProfileRequest' is set
    if (createVerifiedCallsDisplayProfileRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'createVerifiedCallsDisplayProfileRequest' when calling createProfile");
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

    return apiClient.invokeAPI("VerifiedCallsDisplayProfileApi.createProfile", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIcreateProfileRequest {
    private CreateVerifiedCallsDisplayProfileRequest createVerifiedCallsDisplayProfileRequest;

    private APIcreateProfileRequest() {
    }

    /**
     * Set createVerifiedCallsDisplayProfileRequest
     * @param createVerifiedCallsDisplayProfileRequest  (required)
     * @return APIcreateProfileRequest
     */
    public APIcreateProfileRequest createVerifiedCallsDisplayProfileRequest(CreateVerifiedCallsDisplayProfileRequest createVerifiedCallsDisplayProfileRequest) {
      this.createVerifiedCallsDisplayProfileRequest = createVerifiedCallsDisplayProfileRequest;
      return this;
    }

    /**
     * Execute createProfile request
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
     * Execute createProfile request with HTTP info returned
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
      return createProfileWithHttpInfo(createVerifiedCallsDisplayProfileRequest);
    }
  }

  /**
   * Creates a Verified Calls Display Profile
   * Creates a Verified Calls Display Profile associated with the given Business Identity
   * @return createProfileRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIcreateProfileRequest createProfile() throws ApiException {
    return new APIcreateProfileRequest();
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
  public void createProfileVerificationRequest(String id) throws ApiException {
    createProfileVerificationRequestWithHttpInfo(id);
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
  public ApiResponse<Void> createProfileVerificationRequestWithHttpInfo(String id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling createProfileVerificationRequest");
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

    return apiClient.invokeAPI("VerifiedCallsDisplayProfileApi.createProfileVerificationRequest", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }

private ApiResponse<ShowVerifiedCallsDisplayProfileResponse> deleteProfileWithHttpInfo(String id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling deleteProfile");
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

    return apiClient.invokeAPI("VerifiedCallsDisplayProfileApi.deleteProfile", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIdeleteProfileRequest {
    private String id;

    private APIdeleteProfileRequest(String id) {
      this.id = id;
    }

    /**
     * Execute deleteProfile request
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
     * Execute deleteProfile request with HTTP info returned
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
      return deleteProfileWithHttpInfo(id);
    }
  }

  /**
   * Deletes the Verified Calls Display Profile
   * Deletes the Verified Calls Display Profile. This action will fail if any verification requests have been made for this Verified Calls Display Profile. Please contact support@telnyx.com in case you want to delete a Verified Calls Display Profile in that situation.
   * @param id Identifies the Verified Calls Display Profile (required)
   * @return deleteProfileRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIdeleteProfileRequest deleteProfile(String id) throws ApiException {
    return new APIdeleteProfileRequest(id);
  }

private ApiResponse<ShowVerifiedCallsDisplayProfileResponse> displayProfileWithHttpInfo(String id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling displayProfile");
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

    return apiClient.invokeAPI("VerifiedCallsDisplayProfileApi.displayProfile", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIdisplayProfileRequest {
    private String id;

    private APIdisplayProfileRequest(String id) {
      this.id = id;
    }

    /**
     * Execute displayProfile request
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
     * Execute displayProfile request with HTTP info returned
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
      return displayProfileWithHttpInfo(id);
    }
  }

  /**
   * Display the Verified Calls Display Profile
   * 
   * @param id Identifies the Verified Calls Display Profile (required)
   * @return displayProfileRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIdisplayProfileRequest displayProfile(String id) throws ApiException {
    return new APIdisplayProfileRequest(id);
  }

private ApiResponse<ListVerifiedCallsDisplayProfilesResponse> listProfilesWithHttpInfo(Integer pageNumber, Integer pageSize) throws ApiException {
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

    return apiClient.invokeAPI("VerifiedCallsDisplayProfileApi.listProfiles", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIlistProfilesRequest {
    private Integer pageNumber;
    private Integer pageSize;

    private APIlistProfilesRequest() {
    }

    /**
     * Set pageNumber
     * @param pageNumber The page number to load (optional, default to 1)
     * @return APIlistProfilesRequest
     */
    public APIlistProfilesRequest pageNumber(Integer pageNumber) {
      this.pageNumber = pageNumber;
      return this;
    }

    /**
     * Set pageSize
     * @param pageSize The size of the page (optional, default to 20)
     * @return APIlistProfilesRequest
     */
    public APIlistProfilesRequest pageSize(Integer pageSize) {
      this.pageSize = pageSize;
      return this;
    }

    /**
     * Execute listProfiles request
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
     * Execute listProfiles request with HTTP info returned
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
      return listProfilesWithHttpInfo(pageNumber, pageSize);
    }
  }

  /**
   * Lists the Verified Calls Display Profiles owned by the current user/organization
   * 
   * @return listProfilesRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIlistProfilesRequest listProfiles() throws ApiException {
    return new APIlistProfilesRequest();
  }

private ApiResponse<Void> updateProfileWithHttpInfo(String id, UpdateVerifiedCallsDisplayProfileRequest updateVerifiedCallsDisplayProfileRequest) throws ApiException {
    Object localVarPostBody = updateVerifiedCallsDisplayProfileRequest;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling updateProfile");
    }
    
    // verify the required parameter 'updateVerifiedCallsDisplayProfileRequest' is set
    if (updateVerifiedCallsDisplayProfileRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'updateVerifiedCallsDisplayProfileRequest' when calling updateProfile");
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

    return apiClient.invokeAPI("VerifiedCallsDisplayProfileApi.updateProfile", localVarPath, "PATCH", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }

  public class APIupdateProfileRequest {
    private String id;
    private UpdateVerifiedCallsDisplayProfileRequest updateVerifiedCallsDisplayProfileRequest;

    private APIupdateProfileRequest(String id) {
      this.id = id;
    }

    /**
     * Set updateVerifiedCallsDisplayProfileRequest
     * @param updateVerifiedCallsDisplayProfileRequest  (required)
     * @return APIupdateProfileRequest
     */
    public APIupdateProfileRequest updateVerifiedCallsDisplayProfileRequest(UpdateVerifiedCallsDisplayProfileRequest updateVerifiedCallsDisplayProfileRequest) {
      this.updateVerifiedCallsDisplayProfileRequest = updateVerifiedCallsDisplayProfileRequest;
      return this;
    }

    /**
     * Execute updateProfile request
     
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
     * Execute updateProfile request with HTTP info returned
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
      return updateProfileWithHttpInfo(id, updateVerifiedCallsDisplayProfileRequest);
    }
  }

  /**
   * Update a Verified Calls Display Profile
   * Update an existing Verified Calls Display Profile and allows adding/removing nested Call Reasons and Phone Numbers. Different attributes can be updated depending on the Verified Calls Display Profile&#39;s status: For the VERIFICATION_STATE_PENDING status, no fields can be updated. For the VERIFICATION_STATE_VERIFIED status, it is allowed only to add/remove Call Reaons and Phone Numbers. For the other statuses, all fields can be updated. All existing Call Reasons and Phone Numbers must be sent during the request, or the update will fail.
   * @param id Identifies the Verified Calls Display Profile (required)
   * @return updateProfileRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIupdateProfileRequest updateProfile(String id) throws ApiException {
    return new APIupdateProfileRequest(id);
  }
}
