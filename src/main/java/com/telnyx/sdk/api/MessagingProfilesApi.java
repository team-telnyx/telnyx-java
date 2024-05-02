package com.telnyx.sdk.api;

import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.Pair;

import jakarta.ws.rs.core.GenericType;

import com.telnyx.sdk.model.CreateMessagingProfileRequest;
import com.telnyx.sdk.model.Errors;
import com.telnyx.sdk.model.ListMessagingProfileMetricsResponse;
import com.telnyx.sdk.model.ListMessagingProfilePhoneNumbersResponse;
import com.telnyx.sdk.model.ListMessagingProfileShortCodesResponse;
import com.telnyx.sdk.model.ListMessagingProfilesResponse;
import com.telnyx.sdk.model.MessagingProfileResponse;
import com.telnyx.sdk.model.RetrieveMessagingProfileMetricsResponse;
import java.util.UUID;
import com.telnyx.sdk.model.UpdateMessagingProfileRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class MessagingProfilesApi {
  private ApiClient apiClient;

  public MessagingProfilesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public MessagingProfilesApi(ApiClient apiClient) {
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
   * Create a messaging profile
   * 
   * @param createMessagingProfileRequest New Messaging Profile object (required)
   * @return MessagingProfileResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response with details about a messaging profile. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public MessagingProfileResponse createMessagingProfile(CreateMessagingProfileRequest createMessagingProfileRequest) throws ApiException {
    return createMessagingProfileWithHttpInfo(createMessagingProfileRequest).getData();
  }

  /**
   * Create a messaging profile
   * 
   * @param createMessagingProfileRequest New Messaging Profile object (required)
   * @return ApiResponse&lt;MessagingProfileResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response with details about a messaging profile. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<MessagingProfileResponse> createMessagingProfileWithHttpInfo(CreateMessagingProfileRequest createMessagingProfileRequest) throws ApiException {
    Object localVarPostBody = createMessagingProfileRequest;
    
    // verify the required parameter 'createMessagingProfileRequest' is set
    if (createMessagingProfileRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'createMessagingProfileRequest' when calling createMessagingProfile");
    }
    
    // create path and map variables
    String localVarPath = "/messaging_profiles";

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

    GenericType<MessagingProfileResponse> localVarReturnType = new GenericType<MessagingProfileResponse>() {};

    return apiClient.invokeAPI("MessagingProfilesApi.createMessagingProfile", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Delete a messaging profile
   * 
   * @param id The id of the messaging profile to retrieve (required)
   * @return MessagingProfileResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response with details about a messaging profile. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public MessagingProfileResponse deleteMessagingProfile(UUID id) throws ApiException {
    return deleteMessagingProfileWithHttpInfo(id).getData();
  }

  /**
   * Delete a messaging profile
   * 
   * @param id The id of the messaging profile to retrieve (required)
   * @return ApiResponse&lt;MessagingProfileResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response with details about a messaging profile. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<MessagingProfileResponse> deleteMessagingProfileWithHttpInfo(UUID id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling deleteMessagingProfile");
    }
    
    // create path and map variables
    String localVarPath = "/messaging_profiles/{id}"
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

    GenericType<MessagingProfileResponse> localVarReturnType = new GenericType<MessagingProfileResponse>() {};

    return apiClient.invokeAPI("MessagingProfilesApi.deleteMessagingProfile", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

private ApiResponse<RetrieveMessagingProfileMetricsResponse> getMessagingProfileMetricsWithHttpInfo(UUID id, String timeFrame) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getMessagingProfileMetrics");
    }
    
    // create path and map variables
    String localVarPath = "/messaging_profiles/{id}/metrics"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "time_frame", timeFrame));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    GenericType<RetrieveMessagingProfileMetricsResponse> localVarReturnType = new GenericType<RetrieveMessagingProfileMetricsResponse>() {};

    return apiClient.invokeAPI("MessagingProfilesApi.getMessagingProfileMetrics", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIgetMessagingProfileMetricsRequest {
    private UUID id;
    private String timeFrame;

    private APIgetMessagingProfileMetricsRequest(UUID id) {
      this.id = id;
    }

    /**
     * Set timeFrame
     * @param timeFrame The timeframe for which you&#39;d like to retrieve metrics. (optional, default to 24h)
     * @return APIgetMessagingProfileMetricsRequest
     */
    public APIgetMessagingProfileMetricsRequest timeFrame(String timeFrame) {
      this.timeFrame = timeFrame;
      return this;
    }

    /**
     * Execute getMessagingProfileMetrics request
     * @return RetrieveMessagingProfileMetricsResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response with details about a messaging profile&#39;s metrics. </td><td>  -  </td></tr>
         <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
       </table>
     
     */
    
    public RetrieveMessagingProfileMetricsResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute getMessagingProfileMetrics request with HTTP info returned
     * @return ApiResponse&lt;RetrieveMessagingProfileMetricsResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response with details about a messaging profile&#39;s metrics. </td><td>  -  </td></tr>
         <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<RetrieveMessagingProfileMetricsResponse> executeWithHttpInfo() throws ApiException {
      return getMessagingProfileMetricsWithHttpInfo(id, timeFrame);
    }
  }

  /**
   * Retrieve messaging profile metrics
   * 
   * @param id The id of the messaging profile to retrieve (required)
   * @return getMessagingProfileMetricsRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIgetMessagingProfileMetricsRequest getMessagingProfileMetrics(UUID id) throws ApiException {
    return new APIgetMessagingProfileMetricsRequest(id);
  }

private ApiResponse<ListMessagingProfilesResponse> listMessagingProfilesWithHttpInfo(Integer pageNumber, Integer pageSize, String filterName) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/messaging_profiles";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[number]", pageNumber));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[name]", filterName));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    GenericType<ListMessagingProfilesResponse> localVarReturnType = new GenericType<ListMessagingProfilesResponse>() {};

    return apiClient.invokeAPI("MessagingProfilesApi.listMessagingProfiles", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIlistMessagingProfilesRequest {
    private Integer pageNumber;
    private Integer pageSize;
    private String filterName;

    private APIlistMessagingProfilesRequest() {
    }

    /**
     * Set pageNumber
     * @param pageNumber The page number to load (optional, default to 1)
     * @return APIlistMessagingProfilesRequest
     */
    public APIlistMessagingProfilesRequest pageNumber(Integer pageNumber) {
      this.pageNumber = pageNumber;
      return this;
    }

    /**
     * Set pageSize
     * @param pageSize The size of the page (optional, default to 20)
     * @return APIlistMessagingProfilesRequest
     */
    public APIlistMessagingProfilesRequest pageSize(Integer pageSize) {
      this.pageSize = pageSize;
      return this;
    }

    /**
     * Set filterName
     * @param filterName Filter by name (optional)
     * @return APIlistMessagingProfilesRequest
     */
    public APIlistMessagingProfilesRequest filterName(String filterName) {
      this.filterName = filterName;
      return this;
    }

    /**
     * Execute listMessagingProfiles request
     * @return ListMessagingProfilesResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response with a list of messaging profiles. </td><td>  -  </td></tr>
         <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ListMessagingProfilesResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute listMessagingProfiles request with HTTP info returned
     * @return ApiResponse&lt;ListMessagingProfilesResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response with a list of messaging profiles. </td><td>  -  </td></tr>
         <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<ListMessagingProfilesResponse> executeWithHttpInfo() throws ApiException {
      return listMessagingProfilesWithHttpInfo(pageNumber, pageSize, filterName);
    }

    public APIlistMessagingProfilesRequest timeFrame(String string) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'timeFrame'");
    }
  }

  /**
   * List messaging profiles
   * 
   * @return listMessagingProfilesRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIlistMessagingProfilesRequest listMessagingProfiles() throws ApiException {
    return new APIlistMessagingProfilesRequest();
  }

private ApiResponse<ListMessagingProfileMetricsResponse> listProfileMetricsWithHttpInfo(Integer pageNumber, Integer pageSize, UUID id, String timeFrame) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/messaging_profile_metrics";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[number]", pageNumber));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "id", id));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "time_frame", timeFrame));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    GenericType<ListMessagingProfileMetricsResponse> localVarReturnType = new GenericType<ListMessagingProfileMetricsResponse>() {};

    return apiClient.invokeAPI("MessagingProfilesApi.listProfileMetrics", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIlistProfileMetricsRequest {
    private Integer pageNumber;
    private Integer pageSize;
    private UUID id;
    private String timeFrame;

    private APIlistProfileMetricsRequest() {
    }

    /**
     * Set pageNumber
     * @param pageNumber The page number to load (optional, default to 1)
     * @return APIlistProfileMetricsRequest
     */
    public APIlistProfileMetricsRequest pageNumber(Integer pageNumber) {
      this.pageNumber = pageNumber;
      return this;
    }

    /**
     * Set pageSize
     * @param pageSize The size of the page (optional, default to 20)
     * @return APIlistProfileMetricsRequest
     */
    public APIlistProfileMetricsRequest pageSize(Integer pageSize) {
      this.pageSize = pageSize;
      return this;
    }

    /**
     * Set id
     * @param id The id of the messaging profile(s) to retrieve (optional)
     * @return APIlistProfileMetricsRequest
     */
    public APIlistProfileMetricsRequest id(UUID id) {
      this.id = id;
      return this;
    }

    /**
     * Set timeFrame
     * @param timeFrame The timeframe for which you&#39;d like to retrieve metrics. (optional, default to 24h)
     * @return APIlistProfileMetricsRequest
     */
    public APIlistProfileMetricsRequest timeFrame(String timeFrame) {
      this.timeFrame = timeFrame;
      return this;
    }

    /**
     * Execute listProfileMetrics request
     * @return ListMessagingProfileMetricsResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response with a list of messaging profile metrics. </td><td>  -  </td></tr>
         <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ListMessagingProfileMetricsResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute listProfileMetrics request with HTTP info returned
     * @return ApiResponse&lt;ListMessagingProfileMetricsResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response with a list of messaging profile metrics. </td><td>  -  </td></tr>
         <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<ListMessagingProfileMetricsResponse> executeWithHttpInfo() throws ApiException {
      return listProfileMetricsWithHttpInfo(pageNumber, pageSize, id, timeFrame);
    }
  }

  /**
   * List messaging profile metrics
   * 
   * @return listProfileMetricsRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIlistProfileMetricsRequest listProfileMetrics() throws ApiException {
    return new APIlistProfileMetricsRequest();
  }

private ApiResponse<ListMessagingProfilePhoneNumbersResponse> listProfilePhoneNumbersWithHttpInfo(UUID id, Integer pageNumber, Integer pageSize) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling listProfilePhoneNumbers");
    }
    
    // create path and map variables
    String localVarPath = "/messaging_profiles/{id}/phone_numbers"
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

    GenericType<ListMessagingProfilePhoneNumbersResponse> localVarReturnType = new GenericType<ListMessagingProfilePhoneNumbersResponse>() {};

    return apiClient.invokeAPI("MessagingProfilesApi.listProfilePhoneNumbers", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIlistProfilePhoneNumbersRequest {
    private UUID id;
    private Integer pageNumber;
    private Integer pageSize;

    private APIlistProfilePhoneNumbersRequest(UUID id) {
      this.id = id;
    }

    /**
     * Set pageNumber
     * @param pageNumber The page number to load (optional, default to 1)
     * @return APIlistProfilePhoneNumbersRequest
     */
    public APIlistProfilePhoneNumbersRequest pageNumber(Integer pageNumber) {
      this.pageNumber = pageNumber;
      return this;
    }

    /**
     * Set pageSize
     * @param pageSize The size of the page (optional, default to 20)
     * @return APIlistProfilePhoneNumbersRequest
     */
    public APIlistProfilePhoneNumbersRequest pageSize(Integer pageSize) {
      this.pageSize = pageSize;
      return this;
    }

    /**
     * Execute listProfilePhoneNumbers request
     * @return ListMessagingProfilePhoneNumbersResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response with a list of messaging profile phone numbers. </td><td>  -  </td></tr>
         <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ListMessagingProfilePhoneNumbersResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute listProfilePhoneNumbers request with HTTP info returned
     * @return ApiResponse&lt;ListMessagingProfilePhoneNumbersResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response with a list of messaging profile phone numbers. </td><td>  -  </td></tr>
         <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<ListMessagingProfilePhoneNumbersResponse> executeWithHttpInfo() throws ApiException {
      return listProfilePhoneNumbersWithHttpInfo(id, pageNumber, pageSize);
    }
  }

  /**
   * List phone numbers associated with a messaging profile
   * 
   * @param id The id of the messaging profile to retrieve (required)
   * @return listProfilePhoneNumbersRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIlistProfilePhoneNumbersRequest listProfilePhoneNumbers(UUID id) throws ApiException {
    return new APIlistProfilePhoneNumbersRequest(id);
  }

private ApiResponse<ListMessagingProfileShortCodesResponse> listProfileShortCodesWithHttpInfo(UUID id, Integer pageNumber, Integer pageSize) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling listProfileShortCodes");
    }
    
    // create path and map variables
    String localVarPath = "/messaging_profiles/{id}/short_codes"
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

    GenericType<ListMessagingProfileShortCodesResponse> localVarReturnType = new GenericType<ListMessagingProfileShortCodesResponse>() {};

    return apiClient.invokeAPI("MessagingProfilesApi.listProfileShortCodes", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIlistProfileShortCodesRequest {
    private UUID id;
    private Integer pageNumber;
    private Integer pageSize;

    private APIlistProfileShortCodesRequest(UUID id) {
      this.id = id;
    }

    /**
     * Set pageNumber
     * @param pageNumber The page number to load (optional, default to 1)
     * @return APIlistProfileShortCodesRequest
     */
    public APIlistProfileShortCodesRequest pageNumber(Integer pageNumber) {
      this.pageNumber = pageNumber;
      return this;
    }

    /**
     * Set pageSize
     * @param pageSize The size of the page (optional, default to 20)
     * @return APIlistProfileShortCodesRequest
     */
    public APIlistProfileShortCodesRequest pageSize(Integer pageSize) {
      this.pageSize = pageSize;
      return this;
    }

    /**
     * Execute listProfileShortCodes request
     * @return ListMessagingProfileShortCodesResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response with a list of messaging profile short codes. </td><td>  -  </td></tr>
         <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ListMessagingProfileShortCodesResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute listProfileShortCodes request with HTTP info returned
     * @return ApiResponse&lt;ListMessagingProfileShortCodesResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response with a list of messaging profile short codes. </td><td>  -  </td></tr>
         <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<ListMessagingProfileShortCodesResponse> executeWithHttpInfo() throws ApiException {
      return listProfileShortCodesWithHttpInfo(id, pageNumber, pageSize);
    }
  }

  /**
   * List short codes associated with a messaging profile
   * 
   * @param id The id of the messaging profile to retrieve (required)
   * @return listProfileShortCodesRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIlistProfileShortCodesRequest listProfileShortCodes(UUID id) throws ApiException {
    return new APIlistProfileShortCodesRequest(id);
  }
  /**
   * Retrieve a messaging profile
   * 
   * @param id The id of the messaging profile to retrieve (required)
   * @return MessagingProfileResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response with details about a messaging profile. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public MessagingProfileResponse retrieveMessagingProfile(UUID id) throws ApiException {
    return retrieveMessagingProfileWithHttpInfo(id).getData();
  }

  /**
   * Retrieve a messaging profile
   * 
   * @param id The id of the messaging profile to retrieve (required)
   * @return ApiResponse&lt;MessagingProfileResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response with details about a messaging profile. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<MessagingProfileResponse> retrieveMessagingProfileWithHttpInfo(UUID id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling retrieveMessagingProfile");
    }
    
    // create path and map variables
    String localVarPath = "/messaging_profiles/{id}"
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

    GenericType<MessagingProfileResponse> localVarReturnType = new GenericType<MessagingProfileResponse>() {};

    return apiClient.invokeAPI("MessagingProfilesApi.retrieveMessagingProfile", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Update a messaging profile
   * 
   * @param id The id of the messaging profile to retrieve (required)
   * @param updateMessagingProfileRequest New Messaging Profile object (required)
   * @return MessagingProfileResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response with details about a messaging profile. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public MessagingProfileResponse updateMessagingProfile(UUID id, UpdateMessagingProfileRequest updateMessagingProfileRequest) throws ApiException {
    return updateMessagingProfileWithHttpInfo(id, updateMessagingProfileRequest).getData();
  }

  /**
   * Update a messaging profile
   * 
   * @param id The id of the messaging profile to retrieve (required)
   * @param updateMessagingProfileRequest New Messaging Profile object (required)
   * @return ApiResponse&lt;MessagingProfileResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response with details about a messaging profile. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<MessagingProfileResponse> updateMessagingProfileWithHttpInfo(UUID id, UpdateMessagingProfileRequest updateMessagingProfileRequest) throws ApiException {
    Object localVarPostBody = updateMessagingProfileRequest;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling updateMessagingProfile");
    }
    
    // verify the required parameter 'updateMessagingProfileRequest' is set
    if (updateMessagingProfileRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'updateMessagingProfileRequest' when calling updateMessagingProfile");
    }
    
    // create path and map variables
    String localVarPath = "/messaging_profiles/{id}"
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

    GenericType<MessagingProfileResponse> localVarReturnType = new GenericType<MessagingProfileResponse>() {};

    return apiClient.invokeAPI("MessagingProfilesApi.updateMessagingProfile", localVarPath, "PATCH", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
