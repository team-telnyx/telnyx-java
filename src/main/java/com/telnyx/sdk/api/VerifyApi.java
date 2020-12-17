package com.telnyx.sdk.api;

import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.Pair;

import javax.ws.rs.core.GenericType;

import com.telnyx.sdk.model.CreateVerificationResponse;
import com.telnyx.sdk.model.CreateVerifyProfileResponse;
import com.telnyx.sdk.model.DeleteVerifyProfileResponse;
import com.telnyx.sdk.model.Errors;
import com.telnyx.sdk.model.ListVerificationsResponse;
import com.telnyx.sdk.model.ListVerifyProfilesResponse;
import com.telnyx.sdk.model.RetrieveVerificationResponse;
import java.util.UUID;
import com.telnyx.sdk.model.UpdateVerifyProfileResponse;
import com.telnyx.sdk.model.VerificationCodeRequest;
import com.telnyx.sdk.model.VerificationRequest;
import com.telnyx.sdk.model.VerificationVerify;
import com.telnyx.sdk.model.VerifyProfileRequest;

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
   * @param verificationRequest  (required)
   * @return CreateVerificationResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Expected verifications response to a valid request. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public CreateVerificationResponse createVerification(VerificationRequest verificationRequest) throws ApiException {
    return createVerificationWithHttpInfo(verificationRequest).getData();
  }

  /**
   * Trigger a verification
   * 
   * @param verificationRequest  (required)
   * @return ApiResponse&lt;CreateVerificationResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Expected verifications response to a valid request. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CreateVerificationResponse> createVerificationWithHttpInfo(VerificationRequest verificationRequest) throws ApiException {
    Object localVarPostBody = verificationRequest;
    
    // verify the required parameter 'verificationRequest' is set
    if (verificationRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'verificationRequest' when calling createVerification");
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
   * @param verifyProfileRequest  (required)
   * @return CreateVerifyProfileResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Expected Verify profile response to a valid request. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public CreateVerifyProfileResponse createVerifyProfile(VerifyProfileRequest verifyProfileRequest) throws ApiException {
    return createVerifyProfileWithHttpInfo(verifyProfileRequest).getData();
  }

  /**
   * Create a Verify profile
   * Creates a new Verify profile to associate verifications with.
   * @param verifyProfileRequest  (required)
   * @return ApiResponse&lt;CreateVerifyProfileResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Expected Verify profile response to a valid request. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CreateVerifyProfileResponse> createVerifyProfileWithHttpInfo(VerifyProfileRequest verifyProfileRequest) throws ApiException {
    Object localVarPostBody = verifyProfileRequest;
    
    // verify the required parameter 'verifyProfileRequest' is set
    if (verifyProfileRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'verifyProfileRequest' when calling createVerifyProfile");
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

    GenericType<CreateVerifyProfileResponse> localVarReturnType = new GenericType<CreateVerifyProfileResponse>() {};

    return apiClient.invokeAPI("VerifyApi.createVerifyProfile", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Delete a Verify profile
   * 
   * @param verifyProfileId The identifier of the Verify profile to delete. (required)
   * @return DeleteVerifyProfileResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Expected Verify profile response to a valid request. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public DeleteVerifyProfileResponse deleteVerifyProfile(UUID verifyProfileId) throws ApiException {
    return deleteVerifyProfileWithHttpInfo(verifyProfileId).getData();
  }

  /**
   * Delete a Verify profile
   * 
   * @param verifyProfileId The identifier of the Verify profile to delete. (required)
   * @return ApiResponse&lt;DeleteVerifyProfileResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Expected Verify profile response to a valid request. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<DeleteVerifyProfileResponse> deleteVerifyProfileWithHttpInfo(UUID verifyProfileId) throws ApiException {
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

    GenericType<DeleteVerifyProfileResponse> localVarReturnType = new GenericType<DeleteVerifyProfileResponse>() {};

    return apiClient.invokeAPI("VerifyApi.deleteVerifyProfile", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
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
         <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
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
         <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
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
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public RetrieveVerificationResponse retrieveVerificationById(UUID verificationId) throws ApiException {
    return retrieveVerificationByIdWithHttpInfo(verificationId).getData();
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
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<RetrieveVerificationResponse> retrieveVerificationByIdWithHttpInfo(UUID verificationId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'verificationId' is set
    if (verificationId == null) {
      throw new ApiException(400, "Missing the required parameter 'verificationId' when calling retrieveVerificationById");
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

    return apiClient.invokeAPI("VerifyApi.retrieveVerificationById", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Retrieve a verification by phone number
   * 
   * @param phoneNumber The phone number associated with the verification to retrieve. (required)
   * @return ListVerificationsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Expected verifications response to a valid request. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ListVerificationsResponse retrieveVerificationByPhoneNumber(String phoneNumber) throws ApiException {
    return retrieveVerificationByPhoneNumberWithHttpInfo(phoneNumber).getData();
  }

  /**
   * Retrieve a verification by phone number
   * 
   * @param phoneNumber The phone number associated with the verification to retrieve. (required)
   * @return ApiResponse&lt;ListVerificationsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Expected verifications response to a valid request. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ListVerificationsResponse> retrieveVerificationByPhoneNumberWithHttpInfo(String phoneNumber) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'phoneNumber' is set
    if (phoneNumber == null) {
      throw new ApiException(400, "Missing the required parameter 'phoneNumber' when calling retrieveVerificationByPhoneNumber");
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

    return apiClient.invokeAPI("VerifyApi.retrieveVerificationByPhoneNumber", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Retrieve a Verify profile
   * Gets a single Verify profile.
   * @param verifyProfileId The identifier of the Verify profile to retrieve. (required)
   * @return CreateVerifyProfileResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Expected Verify profile response to a valid request. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public CreateVerifyProfileResponse retrieveVerifyProfile(UUID verifyProfileId) throws ApiException {
    return retrieveVerifyProfileWithHttpInfo(verifyProfileId).getData();
  }

  /**
   * Retrieve a Verify profile
   * Gets a single Verify profile.
   * @param verifyProfileId The identifier of the Verify profile to retrieve. (required)
   * @return ApiResponse&lt;CreateVerifyProfileResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Expected Verify profile response to a valid request. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CreateVerifyProfileResponse> retrieveVerifyProfileWithHttpInfo(UUID verifyProfileId) throws ApiException {
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

    GenericType<CreateVerifyProfileResponse> localVarReturnType = new GenericType<CreateVerifyProfileResponse>() {};

    return apiClient.invokeAPI("VerifyApi.retrieveVerifyProfile", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Update a Verify profile
   * 
   * @param verifyProfileId The identifier of the Verify profile to update. (required)
   * @param verifyProfileRequest  (required)
   * @return UpdateVerifyProfileResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Expected Verify profile response to a valid request. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public UpdateVerifyProfileResponse updateVerifyProfile(UUID verifyProfileId, VerifyProfileRequest verifyProfileRequest) throws ApiException {
    return updateVerifyProfileWithHttpInfo(verifyProfileId, verifyProfileRequest).getData();
  }

  /**
   * Update a Verify profile
   * 
   * @param verifyProfileId The identifier of the Verify profile to update. (required)
   * @param verifyProfileRequest  (required)
   * @return ApiResponse&lt;UpdateVerifyProfileResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Expected Verify profile response to a valid request. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<UpdateVerifyProfileResponse> updateVerifyProfileWithHttpInfo(UUID verifyProfileId, VerifyProfileRequest verifyProfileRequest) throws ApiException {
    Object localVarPostBody = verifyProfileRequest;
    
    // verify the required parameter 'verifyProfileId' is set
    if (verifyProfileId == null) {
      throw new ApiException(400, "Missing the required parameter 'verifyProfileId' when calling updateVerifyProfile");
    }
    
    // verify the required parameter 'verifyProfileRequest' is set
    if (verifyProfileRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'verifyProfileRequest' when calling updateVerifyProfile");
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

    GenericType<UpdateVerifyProfileResponse> localVarReturnType = new GenericType<UpdateVerifyProfileResponse>() {};

    return apiClient.invokeAPI("VerifyApi.updateVerifyProfile", localVarPath, "PATCH", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Submit a verification code
   * 
   * @param phoneNumber The phone number associated with the verification being verified. (required)
   * @param verificationCodeRequest  (required)
   * @return VerificationVerify
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Expected verify response to a valid request. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public VerificationVerify verifyVerificationByPhoneNumber(String phoneNumber, VerificationCodeRequest verificationCodeRequest) throws ApiException {
    return verifyVerificationByPhoneNumberWithHttpInfo(phoneNumber, verificationCodeRequest).getData();
  }

  /**
   * Submit a verification code
   * 
   * @param phoneNumber The phone number associated with the verification being verified. (required)
   * @param verificationCodeRequest  (required)
   * @return ApiResponse&lt;VerificationVerify&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Expected verify response to a valid request. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<VerificationVerify> verifyVerificationByPhoneNumberWithHttpInfo(String phoneNumber, VerificationCodeRequest verificationCodeRequest) throws ApiException {
    Object localVarPostBody = verificationCodeRequest;
    
    // verify the required parameter 'phoneNumber' is set
    if (phoneNumber == null) {
      throw new ApiException(400, "Missing the required parameter 'phoneNumber' when calling verifyVerificationByPhoneNumber");
    }
    
    // verify the required parameter 'verificationCodeRequest' is set
    if (verificationCodeRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'verificationCodeRequest' when calling verifyVerificationByPhoneNumber");
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

    GenericType<VerificationVerify> localVarReturnType = new GenericType<VerificationVerify>() {};

    return apiClient.invokeAPI("VerifyApi.verifyVerificationByPhoneNumber", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
