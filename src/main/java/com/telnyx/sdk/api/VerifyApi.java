package com.telnyx.sdk.api;

import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.Pair;

import javax.ws.rs.core.GenericType;

import com.telnyx.sdk.model.CreateVerificationRequest;
import com.telnyx.sdk.model.CreateVerificationResponse;
import com.telnyx.sdk.model.CreateVerifyProfileRequest;
import com.telnyx.sdk.model.Errors;
import com.telnyx.sdk.model.ListVerificationsResponse;
import com.telnyx.sdk.model.ListVerifyProfilesResponse;
import com.telnyx.sdk.model.RetrieveVerificationResponse;
import java.util.UUID;
import com.telnyx.sdk.model.UpdateVerifyProfileRequest;
import com.telnyx.sdk.model.VerifyProfileResponse;
import com.telnyx.sdk.model.VerifyVerificationCodeRequest;
import com.telnyx.sdk.model.VerifyVerificationCodeResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class VerifyApi {
  private ApiClient apiClient;

  public VerifyApi() {
    this(Configuration.getDefaultApiClient());
  }

  public VerifyApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Get the API cilent
   *
   * @return API client
   */
  public ApiClient getApiClient() {
    return apiClient;
  }

  /**
   * Set the API cilent
   *
   * @param apiClient an instance of API client
   */
  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Trigger a verification
   * 
   * @param createVerificationRequest  (required)
   * @return CreateVerificationResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Expected verifications response to a valid request. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public CreateVerificationResponse createVerification(CreateVerificationRequest createVerificationRequest) throws ApiException {
    return createVerificationWithHttpInfo(createVerificationRequest).getData();
  }

  /**
   * Trigger a verification
   * 
   * @param createVerificationRequest  (required)
   * @return ApiResponse&lt;CreateVerificationResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Expected verifications response to a valid request. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CreateVerificationResponse> createVerificationWithHttpInfo(CreateVerificationRequest createVerificationRequest) throws ApiException {
    Object localVarPostBody = createVerificationRequest;
    
    // verify the required parameter 'createVerificationRequest' is set
    if (createVerificationRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'createVerificationRequest' when calling createVerification");
    }
    
    // create path and map variables
    String localVarPath = "/verifications";

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

    GenericType<CreateVerificationResponse> localVarReturnType = new GenericType<CreateVerificationResponse>() {};

    return apiClient.invokeAPI("VerifyApi.createVerification", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Create a Verify profile
   * Creates a new Verify profile to associate verifications with.
   * @param createVerifyProfileRequest  (required)
   * @return VerifyProfileResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Expected Verify profile response to a valid request. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public VerifyProfileResponse createVerifyProfile(CreateVerifyProfileRequest createVerifyProfileRequest) throws ApiException {
    return createVerifyProfileWithHttpInfo(createVerifyProfileRequest).getData();
  }

  /**
   * Create a Verify profile
   * Creates a new Verify profile to associate verifications with.
   * @param createVerifyProfileRequest  (required)
   * @return ApiResponse&lt;VerifyProfileResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Expected Verify profile response to a valid request. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<VerifyProfileResponse> createVerifyProfileWithHttpInfo(CreateVerifyProfileRequest createVerifyProfileRequest) throws ApiException {
    Object localVarPostBody = createVerifyProfileRequest;
    
    // verify the required parameter 'createVerifyProfileRequest' is set
    if (createVerifyProfileRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'createVerifyProfileRequest' when calling createVerifyProfile");
    }
    
    // create path and map variables
    String localVarPath = "/verify_profiles";

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

    GenericType<VerifyProfileResponse> localVarReturnType = new GenericType<VerifyProfileResponse>() {};

    return apiClient.invokeAPI("VerifyApi.createVerifyProfile", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Delete a Verify profile
   * 
   * @param verifyProfileId The identifier of the Verify profile to delete. (required)
   * @return VerifyProfileResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Expected Verify profile response to a valid request. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public VerifyProfileResponse deleteVerifyProfile(UUID verifyProfileId) throws ApiException {
    return deleteVerifyProfileWithHttpInfo(verifyProfileId).getData();
  }

  /**
   * Delete a Verify profile
   * 
   * @param verifyProfileId The identifier of the Verify profile to delete. (required)
   * @return ApiResponse&lt;VerifyProfileResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Expected Verify profile response to a valid request. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<VerifyProfileResponse> deleteVerifyProfileWithHttpInfo(UUID verifyProfileId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'verifyProfileId' is set
    if (verifyProfileId == null) {
      throw new ApiException(400, "Missing the required parameter 'verifyProfileId' when calling deleteVerifyProfile");
    }
    
    // create path and map variables
    String localVarPath = "/verify_profiles/{verify_profile_id}"
      .replaceAll("\\{" + "verify_profile_id" + "\\}", apiClient.escapeString(verifyProfileId.toString()));

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

    GenericType<VerifyProfileResponse> localVarReturnType = new GenericType<VerifyProfileResponse>() {};

    return apiClient.invokeAPI("VerifyApi.deleteVerifyProfile", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * List verifications by phone number
   * 
   * @param phoneNumber The phone number associated with the verifications to retrieve. (required)
   * @return ListVerificationsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Expected verifications response to a valid request. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ListVerificationsResponse listVerifications(String phoneNumber) throws ApiException {
    return listVerificationsWithHttpInfo(phoneNumber).getData();
  }

  /**
   * List verifications by phone number
   * 
   * @param phoneNumber The phone number associated with the verifications to retrieve. (required)
   * @return ApiResponse&lt;ListVerificationsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Expected verifications response to a valid request. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ListVerificationsResponse> listVerificationsWithHttpInfo(String phoneNumber) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'phoneNumber' is set
    if (phoneNumber == null) {
      throw new ApiException(400, "Missing the required parameter 'phoneNumber' when calling listVerifications");
    }
    
    // create path and map variables
    String localVarPath = "/verifications/by_phone_number/{phone_number}"
      .replaceAll("\\{" + "phone_number" + "\\}", apiClient.escapeString(phoneNumber.toString()));

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

    GenericType<ListVerificationsResponse> localVarReturnType = new GenericType<ListVerificationsResponse>() {};

    return apiClient.invokeAPI("VerifyApi.listVerifications", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

private ApiResponse<ListVerifyProfilesResponse> listVerifyProfilesWithHttpInfo(String filterName, Integer pageSize, Integer pageNumber) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/verify_profiles";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[name]", filterName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[number]", pageNumber));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    GenericType<ListVerifyProfilesResponse> localVarReturnType = new GenericType<ListVerifyProfilesResponse>() {};

    return apiClient.invokeAPI("VerifyApi.listVerifyProfiles", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIlistVerifyProfilesRequest {
    private String filterName;
    private Integer pageSize;
    private Integer pageNumber;

    private APIlistVerifyProfilesRequest() {
    }

    /**
     * Set filterName
     * @param filterName  (optional)
     * @return APIlistVerifyProfilesRequest
     */
    public APIlistVerifyProfilesRequest filterName(String filterName) {
      this.filterName = filterName;
      return this;
    }

    /**
     * Set pageSize
     * @param pageSize  (optional, default to 25)
     * @return APIlistVerifyProfilesRequest
     */
    public APIlistVerifyProfilesRequest pageSize(Integer pageSize) {
      this.pageSize = pageSize;
      return this;
    }

    /**
     * Set pageNumber
     * @param pageNumber  (optional, default to 1)
     * @return APIlistVerifyProfilesRequest
     */
    public APIlistVerifyProfilesRequest pageNumber(Integer pageNumber) {
      this.pageNumber = pageNumber;
      return this;
    }

    /**
     * Execute listVerifyProfiles request
     * @return ListVerifyProfilesResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Expected Verify profile response to a valid request. </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Unexpected error </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ListVerifyProfilesResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute listVerifyProfiles request with HTTP info returned
     * @return ApiResponse&lt;ListVerifyProfilesResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Expected Verify profile response to a valid request. </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Unexpected error </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<ListVerifyProfilesResponse> executeWithHttpInfo() throws ApiException {
      return listVerifyProfilesWithHttpInfo(filterName, pageSize, pageNumber);
    }
  }

  /**
   * List all Verify profiles
   * Gets a paginated list of Verify profiles.
   * @return listVerifyProfilesRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIlistVerifyProfilesRequest listVerifyProfiles() throws ApiException {
    return new APIlistVerifyProfilesRequest();
  }
  /**
   * Retrieve a verification
   * 
   * @param verificationId The identifier of the verification to retrieve. (required)
   * @return RetrieveVerificationResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Expected verifications response to a valid request. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public RetrieveVerificationResponse retrieveVerification(UUID verificationId) throws ApiException {
    return retrieveVerificationWithHttpInfo(verificationId).getData();
  }

  /**
   * Retrieve a verification
   * 
   * @param verificationId The identifier of the verification to retrieve. (required)
   * @return ApiResponse&lt;RetrieveVerificationResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Expected verifications response to a valid request. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<RetrieveVerificationResponse> retrieveVerificationWithHttpInfo(UUID verificationId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'verificationId' is set
    if (verificationId == null) {
      throw new ApiException(400, "Missing the required parameter 'verificationId' when calling retrieveVerification");
    }
    
    // create path and map variables
    String localVarPath = "/verifications/{verification_id}"
      .replaceAll("\\{" + "verification_id" + "\\}", apiClient.escapeString(verificationId.toString()));

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

    GenericType<RetrieveVerificationResponse> localVarReturnType = new GenericType<RetrieveVerificationResponse>() {};

    return apiClient.invokeAPI("VerifyApi.retrieveVerification", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Retrieve a Verify profile
   * Gets a single Verify profile.
   * @param verifyProfileId The identifier of the Verify profile to retrieve. (required)
   * @return VerifyProfileResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Expected Verify profile response to a valid request. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public VerifyProfileResponse retrieveVerifyProfile(UUID verifyProfileId) throws ApiException {
    return retrieveVerifyProfileWithHttpInfo(verifyProfileId).getData();
  }

  /**
   * Retrieve a Verify profile
   * Gets a single Verify profile.
   * @param verifyProfileId The identifier of the Verify profile to retrieve. (required)
   * @return ApiResponse&lt;VerifyProfileResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Expected Verify profile response to a valid request. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<VerifyProfileResponse> retrieveVerifyProfileWithHttpInfo(UUID verifyProfileId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'verifyProfileId' is set
    if (verifyProfileId == null) {
      throw new ApiException(400, "Missing the required parameter 'verifyProfileId' when calling retrieveVerifyProfile");
    }
    
    // create path and map variables
    String localVarPath = "/verify_profiles/{verify_profile_id}"
      .replaceAll("\\{" + "verify_profile_id" + "\\}", apiClient.escapeString(verifyProfileId.toString()));

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

    GenericType<VerifyProfileResponse> localVarReturnType = new GenericType<VerifyProfileResponse>() {};

    return apiClient.invokeAPI("VerifyApi.retrieveVerifyProfile", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Update a Verify profile
   * 
   * @param verifyProfileId The identifier of the Verify profile to update. (required)
   * @param updateVerifyProfileRequest  (required)
   * @return VerifyProfileResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Expected Verify profile response to a valid request. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public VerifyProfileResponse updateVerifyProfile(UUID verifyProfileId, UpdateVerifyProfileRequest updateVerifyProfileRequest) throws ApiException {
    return updateVerifyProfileWithHttpInfo(verifyProfileId, updateVerifyProfileRequest).getData();
  }

  /**
   * Update a Verify profile
   * 
   * @param verifyProfileId The identifier of the Verify profile to update. (required)
   * @param updateVerifyProfileRequest  (required)
   * @return ApiResponse&lt;VerifyProfileResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Expected Verify profile response to a valid request. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<VerifyProfileResponse> updateVerifyProfileWithHttpInfo(UUID verifyProfileId, UpdateVerifyProfileRequest updateVerifyProfileRequest) throws ApiException {
    Object localVarPostBody = updateVerifyProfileRequest;
    
    // verify the required parameter 'verifyProfileId' is set
    if (verifyProfileId == null) {
      throw new ApiException(400, "Missing the required parameter 'verifyProfileId' when calling updateVerifyProfile");
    }
    
    // verify the required parameter 'updateVerifyProfileRequest' is set
    if (updateVerifyProfileRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'updateVerifyProfileRequest' when calling updateVerifyProfile");
    }
    
    // create path and map variables
    String localVarPath = "/verify_profiles/{verify_profile_id}"
      .replaceAll("\\{" + "verify_profile_id" + "\\}", apiClient.escapeString(verifyProfileId.toString()));

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

    GenericType<VerifyProfileResponse> localVarReturnType = new GenericType<VerifyProfileResponse>() {};

    return apiClient.invokeAPI("VerifyApi.updateVerifyProfile", localVarPath, "PATCH", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Submit a verification code
   * 
   * @param phoneNumber The phone number associated with the verification code being verified. (required)
   * @param verifyVerificationCodeRequest  (required)
   * @return VerifyVerificationCodeResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Expected verify response to a valid request. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public VerifyVerificationCodeResponse verifyVerificationCode(String phoneNumber, VerifyVerificationCodeRequest verifyVerificationCodeRequest) throws ApiException {
    return verifyVerificationCodeWithHttpInfo(phoneNumber, verifyVerificationCodeRequest).getData();
  }

  /**
   * Submit a verification code
   * 
   * @param phoneNumber The phone number associated with the verification code being verified. (required)
   * @param verifyVerificationCodeRequest  (required)
   * @return ApiResponse&lt;VerifyVerificationCodeResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Expected verify response to a valid request. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<VerifyVerificationCodeResponse> verifyVerificationCodeWithHttpInfo(String phoneNumber, VerifyVerificationCodeRequest verifyVerificationCodeRequest) throws ApiException {
    Object localVarPostBody = verifyVerificationCodeRequest;
    
    // verify the required parameter 'phoneNumber' is set
    if (phoneNumber == null) {
      throw new ApiException(400, "Missing the required parameter 'phoneNumber' when calling verifyVerificationCode");
    }
    
    // verify the required parameter 'verifyVerificationCodeRequest' is set
    if (verifyVerificationCodeRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'verifyVerificationCodeRequest' when calling verifyVerificationCode");
    }
    
    // create path and map variables
    String localVarPath = "/verifications/by_phone_number/{phone_number}/actions/verify"
      .replaceAll("\\{" + "phone_number" + "\\}", apiClient.escapeString(phoneNumber.toString()));

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

    GenericType<VerifyVerificationCodeResponse> localVarReturnType = new GenericType<VerifyVerificationCodeResponse>() {};

    return apiClient.invokeAPI("VerifyApi.verifyVerificationCode", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
