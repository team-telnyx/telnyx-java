package com.telnyx.sdk.api;

import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.Pair;

import javax.ws.rs.core.GenericType;

import com.telnyx.sdk.model.Errors;
import com.telnyx.sdk.model.ListMessagingSettingsResponse;
import com.telnyx.sdk.model.ListPhoneNumbersResponse;
import com.telnyx.sdk.model.ListPhoneNumbersWithVoiceSettingsResponse;
import com.telnyx.sdk.model.PhoneNumberEnableEmergency;
import com.telnyx.sdk.model.PhoneNumberEnableEmergencyRequest;
import com.telnyx.sdk.model.PhoneNumberResponse;
import com.telnyx.sdk.model.RetrieveMessagingSettingsResponse;
import com.telnyx.sdk.model.RetrievePhoneNumberVoiceResponse;
import com.telnyx.sdk.model.UpdatePhoneNumberMessagingSettingsRequest;
import com.telnyx.sdk.model.UpdatePhoneNumberRequest;
import com.telnyx.sdk.model.UpdatePhoneNumberVoiceSettingsRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class NumberConfigurationsApi {
  private ApiClient apiClient;

  public NumberConfigurationsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public NumberConfigurationsApi(ApiClient apiClient) {
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
   * Delete a phone number
   * 
   * @param id Identifies the resource. (required)
   * @return PhoneNumberResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response with details about a phone number. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public PhoneNumberResponse deletePhoneNumber(String id) throws ApiException {
    return deletePhoneNumberWithHttpInfo(id).getData();
  }

  /**
   * Delete a phone number
   * 
   * @param id Identifies the resource. (required)
   * @return ApiResponse&lt;PhoneNumberResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response with details about a phone number. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<PhoneNumberResponse> deletePhoneNumberWithHttpInfo(String id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling deletePhoneNumber");
    }
    
    // create path and map variables
    String localVarPath = "/phone_numbers/{id}"
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

    GenericType<PhoneNumberResponse> localVarReturnType = new GenericType<PhoneNumberResponse>() {};

    return apiClient.invokeAPI("NumberConfigurationsApi.deletePhoneNumber", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Enable emergency for a phone number
   * 
   * @param id Identifies the resource. (required)
   * @param phoneNumberEnableEmergencyRequest  (required)
   * @return PhoneNumberEnableEmergency
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Phone number emergency enabled. </td><td>  -  </td></tr>
       <tr><td> 202 </td><td> Phone number emergency requested. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public PhoneNumberEnableEmergency enableEmergencyPhoneNumber(String id, PhoneNumberEnableEmergencyRequest phoneNumberEnableEmergencyRequest) throws ApiException {
    return enableEmergencyPhoneNumberWithHttpInfo(id, phoneNumberEnableEmergencyRequest).getData();
  }

  /**
   * Enable emergency for a phone number
   * 
   * @param id Identifies the resource. (required)
   * @param phoneNumberEnableEmergencyRequest  (required)
   * @return ApiResponse&lt;PhoneNumberEnableEmergency&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Phone number emergency enabled. </td><td>  -  </td></tr>
       <tr><td> 202 </td><td> Phone number emergency requested. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<PhoneNumberEnableEmergency> enableEmergencyPhoneNumberWithHttpInfo(String id, PhoneNumberEnableEmergencyRequest phoneNumberEnableEmergencyRequest) throws ApiException {
    Object localVarPostBody = phoneNumberEnableEmergencyRequest;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling enableEmergencyPhoneNumber");
    }
    
    // verify the required parameter 'phoneNumberEnableEmergencyRequest' is set
    if (phoneNumberEnableEmergencyRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'phoneNumberEnableEmergencyRequest' when calling enableEmergencyPhoneNumber");
    }
    
    // create path and map variables
    String localVarPath = "/phone_numbers/{id}/actions/enable_emergency"
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

    GenericType<PhoneNumberEnableEmergency> localVarReturnType = new GenericType<PhoneNumberEnableEmergency>() {};

    return apiClient.invokeAPI("NumberConfigurationsApi.enableEmergencyPhoneNumber", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

private ApiResponse<ListPhoneNumbersResponse> listPhoneNumbersWithHttpInfo(Integer pageNumber, Integer pageSize, String filterTag, String filterPhoneNumber, String filterStatus, String filterVoiceConnectionNameContains, String filterVoiceConnectionNameStartsWith, String filterVoiceConnectionNameEndsWith, String filterVoiceConnectionNameEq, String filterUsagePaymentMethod, String filterBillingGroupId, String filterEmergencyAddressId, String sort) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/phone_numbers";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[number]", pageNumber));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[tag]", filterTag));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[phone_number]", filterPhoneNumber));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[status]", filterStatus));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[voice.connection_name][contains]", filterVoiceConnectionNameContains));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[voice.connection_name][starts_with]", filterVoiceConnectionNameStartsWith));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[voice.connection_name][ends_with]", filterVoiceConnectionNameEndsWith));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[voice.connection_name][eq]", filterVoiceConnectionNameEq));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[usage_payment_method]", filterUsagePaymentMethod));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[billing_group_id]", filterBillingGroupId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[emergency_address_id]", filterEmergencyAddressId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort", sort));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    GenericType<ListPhoneNumbersResponse> localVarReturnType = new GenericType<ListPhoneNumbersResponse>() {};

    return apiClient.invokeAPI("NumberConfigurationsApi.listPhoneNumbers", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIlistPhoneNumbersRequest {
    private Integer pageNumber;
    private Integer pageSize;
    private String filterTag;
    private String filterPhoneNumber;
    private String filterStatus;
    private String filterVoiceConnectionNameContains;
    private String filterVoiceConnectionNameStartsWith;
    private String filterVoiceConnectionNameEndsWith;
    private String filterVoiceConnectionNameEq;
    private String filterUsagePaymentMethod;
    private String filterBillingGroupId;
    private String filterEmergencyAddressId;
    private String sort;

    private APIlistPhoneNumbersRequest() {
    }

    /**
     * Set pageNumber
     * @param pageNumber The page number to load. (optional, default to 1)
     * @return APIlistPhoneNumbersRequest
     */
    public APIlistPhoneNumbersRequest pageNumber(Integer pageNumber) {
      this.pageNumber = pageNumber;
      return this;
    }

    /**
     * Set pageSize
     * @param pageSize The size of the page. (optional, default to 20)
     * @return APIlistPhoneNumbersRequest
     */
    public APIlistPhoneNumbersRequest pageSize(Integer pageSize) {
      this.pageSize = pageSize;
      return this;
    }

    /**
     * Set filterTag
     * @param filterTag Filter by phone number tags. (optional)
     * @return APIlistPhoneNumbersRequest
     */
    public APIlistPhoneNumbersRequest filterTag(String filterTag) {
      this.filterTag = filterTag;
      return this;
    }

    /**
     * Set filterPhoneNumber
     * @param filterPhoneNumber Filter by phone number. Requires at least three digits.              Non-numerical characters will result in no values being returned. (optional)
     * @return APIlistPhoneNumbersRequest
     */
    public APIlistPhoneNumbersRequest filterPhoneNumber(String filterPhoneNumber) {
      this.filterPhoneNumber = filterPhoneNumber;
      return this;
    }

    /**
     * Set filterStatus
     * @param filterStatus Filter by phone number status. (optional)
     * @return APIlistPhoneNumbersRequest
     */
    public APIlistPhoneNumbersRequest filterStatus(String filterStatus) {
      this.filterStatus = filterStatus;
      return this;
    }

    /**
     * Set filterVoiceConnectionNameContains
     * @param filterVoiceConnectionNameContains Filter contains connection name. Requires at least three characters. (optional)
     * @return APIlistPhoneNumbersRequest
     */
    public APIlistPhoneNumbersRequest filterVoiceConnectionNameContains(String filterVoiceConnectionNameContains) {
      this.filterVoiceConnectionNameContains = filterVoiceConnectionNameContains;
      return this;
    }

    /**
     * Set filterVoiceConnectionNameStartsWith
     * @param filterVoiceConnectionNameStartsWith Filter starts with connection name. Requires at least three characters. (optional)
     * @return APIlistPhoneNumbersRequest
     */
    public APIlistPhoneNumbersRequest filterVoiceConnectionNameStartsWith(String filterVoiceConnectionNameStartsWith) {
      this.filterVoiceConnectionNameStartsWith = filterVoiceConnectionNameStartsWith;
      return this;
    }

    /**
     * Set filterVoiceConnectionNameEndsWith
     * @param filterVoiceConnectionNameEndsWith Filter ends with connection name. Requires at least three characters. (optional)
     * @return APIlistPhoneNumbersRequest
     */
    public APIlistPhoneNumbersRequest filterVoiceConnectionNameEndsWith(String filterVoiceConnectionNameEndsWith) {
      this.filterVoiceConnectionNameEndsWith = filterVoiceConnectionNameEndsWith;
      return this;
    }

    /**
     * Set filterVoiceConnectionNameEq
     * @param filterVoiceConnectionNameEq Filter by connection name. (optional)
     * @return APIlistPhoneNumbersRequest
     */
    public APIlistPhoneNumbersRequest filterVoiceConnectionNameEq(String filterVoiceConnectionNameEq) {
      this.filterVoiceConnectionNameEq = filterVoiceConnectionNameEq;
      return this;
    }

    /**
     * Set filterUsagePaymentMethod
     * @param filterUsagePaymentMethod Filter by usage_payment_method. (optional)
     * @return APIlistPhoneNumbersRequest
     */
    public APIlistPhoneNumbersRequest filterUsagePaymentMethod(String filterUsagePaymentMethod) {
      this.filterUsagePaymentMethod = filterUsagePaymentMethod;
      return this;
    }

    /**
     * Set filterBillingGroupId
     * @param filterBillingGroupId Filter by the billing_group_id associated with phone numbers. To filter to only phone numbers that have no billing group associated them, set the value of this filter to the string &#39;null&#39;. (optional)
     * @return APIlistPhoneNumbersRequest
     */
    public APIlistPhoneNumbersRequest filterBillingGroupId(String filterBillingGroupId) {
      this.filterBillingGroupId = filterBillingGroupId;
      return this;
    }

    /**
     * Set filterEmergencyAddressId
     * @param filterEmergencyAddressId Filter by the emergency_address_id associated with phone numbers. To filter only phone numbers that have no emergency address associated with them, set the value of this filter to the string &#39;null&#39;. (optional)
     * @return APIlistPhoneNumbersRequest
     */
    public APIlistPhoneNumbersRequest filterEmergencyAddressId(String filterEmergencyAddressId) {
      this.filterEmergencyAddressId = filterEmergencyAddressId;
      return this;
    }

    /**
     * Set sort
     * @param sort Specifies the sort order for results. If not given, results are sorted by created_at in descending order. (optional)
     * @return APIlistPhoneNumbersRequest
     */
    public APIlistPhoneNumbersRequest sort(String sort) {
      this.sort = sort;
      return this;
    }

    /**
     * Execute listPhoneNumbers request
     * @return ListPhoneNumbersResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response with a list of phone numbers. </td><td>  -  </td></tr>
         <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ListPhoneNumbersResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute listPhoneNumbers request with HTTP info returned
     * @return ApiResponse&lt;ListPhoneNumbersResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response with a list of phone numbers. </td><td>  -  </td></tr>
         <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<ListPhoneNumbersResponse> executeWithHttpInfo() throws ApiException {
      return listPhoneNumbersWithHttpInfo(pageNumber, pageSize, filterTag, filterPhoneNumber, filterStatus, filterVoiceConnectionNameContains, filterVoiceConnectionNameStartsWith, filterVoiceConnectionNameEndsWith, filterVoiceConnectionNameEq, filterUsagePaymentMethod, filterBillingGroupId, filterEmergencyAddressId, sort);
    }
  }

  /**
   * List phone numbers
   * 
   * @return listPhoneNumbersRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIlistPhoneNumbersRequest listPhoneNumbers() throws ApiException {
    return new APIlistPhoneNumbersRequest();
  }

private ApiResponse<ListMessagingSettingsResponse> listPhoneNumbersWithMessagingSettingsWithHttpInfo(Integer pageNumber, Integer pageSize) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/phone_numbers/messaging";

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

    GenericType<ListMessagingSettingsResponse> localVarReturnType = new GenericType<ListMessagingSettingsResponse>() {};

    return apiClient.invokeAPI("NumberConfigurationsApi.listPhoneNumbersWithMessagingSettings", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIlistPhoneNumbersWithMessagingSettingsRequest {
    private Integer pageNumber;
    private Integer pageSize;

    private APIlistPhoneNumbersWithMessagingSettingsRequest() {
    }

    /**
     * Set pageNumber
     * @param pageNumber The page number to load. (optional, default to 1)
     * @return APIlistPhoneNumbersWithMessagingSettingsRequest
     */
    public APIlistPhoneNumbersWithMessagingSettingsRequest pageNumber(Integer pageNumber) {
      this.pageNumber = pageNumber;
      return this;
    }

    /**
     * Set pageSize
     * @param pageSize The size of the page. (optional, default to 20)
     * @return APIlistPhoneNumbersWithMessagingSettingsRequest
     */
    public APIlistPhoneNumbersWithMessagingSettingsRequest pageSize(Integer pageSize) {
      this.pageSize = pageSize;
      return this;
    }

    /**
     * Execute listPhoneNumbersWithMessagingSettings request
     * @return ListMessagingSettingsResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response with a list of phone numbers with messaging settings. </td><td>  -  </td></tr>
         <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ListMessagingSettingsResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute listPhoneNumbersWithMessagingSettings request with HTTP info returned
     * @return ApiResponse&lt;ListMessagingSettingsResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response with a list of phone numbers with messaging settings. </td><td>  -  </td></tr>
         <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<ListMessagingSettingsResponse> executeWithHttpInfo() throws ApiException {
      return listPhoneNumbersWithMessagingSettingsWithHttpInfo(pageNumber, pageSize);
    }
  }

  /**
   * List phone numbers with messaging settings
   * 
   * @return listPhoneNumbersWithMessagingSettingsRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIlistPhoneNumbersWithMessagingSettingsRequest listPhoneNumbersWithMessagingSettings() throws ApiException {
    return new APIlistPhoneNumbersWithMessagingSettingsRequest();
  }

private ApiResponse<ListPhoneNumbersWithVoiceSettingsResponse> listPhoneNumbersWithVoiceSettingsWithHttpInfo(Integer pageNumber, Integer pageSize, String filterPhoneNumber, String filterConnectionNameContains, String filterUsagePaymentMethod, String sort) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/phone_numbers/voice";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[number]", pageNumber));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[phone_number]", filterPhoneNumber));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[connection_name][contains]", filterConnectionNameContains));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[usage_payment_method]", filterUsagePaymentMethod));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort", sort));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    GenericType<ListPhoneNumbersWithVoiceSettingsResponse> localVarReturnType = new GenericType<ListPhoneNumbersWithVoiceSettingsResponse>() {};

    return apiClient.invokeAPI("NumberConfigurationsApi.listPhoneNumbersWithVoiceSettings", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIlistPhoneNumbersWithVoiceSettingsRequest {
    private Integer pageNumber;
    private Integer pageSize;
    private String filterPhoneNumber;
    private String filterConnectionNameContains;
    private String filterUsagePaymentMethod;
    private String sort;

    private APIlistPhoneNumbersWithVoiceSettingsRequest() {
    }

    /**
     * Set pageNumber
     * @param pageNumber The page number to load. (optional, default to 1)
     * @return APIlistPhoneNumbersWithVoiceSettingsRequest
     */
    public APIlistPhoneNumbersWithVoiceSettingsRequest pageNumber(Integer pageNumber) {
      this.pageNumber = pageNumber;
      return this;
    }

    /**
     * Set pageSize
     * @param pageSize The size of the page. (optional, default to 20)
     * @return APIlistPhoneNumbersWithVoiceSettingsRequest
     */
    public APIlistPhoneNumbersWithVoiceSettingsRequest pageSize(Integer pageSize) {
      this.pageSize = pageSize;
      return this;
    }

    /**
     * Set filterPhoneNumber
     * @param filterPhoneNumber Filter by phone number. Requires at least three digits.              Non-numerical characters will result in no values being returned. (optional)
     * @return APIlistPhoneNumbersWithVoiceSettingsRequest
     */
    public APIlistPhoneNumbersWithVoiceSettingsRequest filterPhoneNumber(String filterPhoneNumber) {
      this.filterPhoneNumber = filterPhoneNumber;
      return this;
    }

    /**
     * Set filterConnectionNameContains
     * @param filterConnectionNameContains Filter contains connection name. Requires at least three characters. (optional)
     * @return APIlistPhoneNumbersWithVoiceSettingsRequest
     */
    public APIlistPhoneNumbersWithVoiceSettingsRequest filterConnectionNameContains(String filterConnectionNameContains) {
      this.filterConnectionNameContains = filterConnectionNameContains;
      return this;
    }

    /**
     * Set filterUsagePaymentMethod
     * @param filterUsagePaymentMethod Filter by usage_payment_method. (optional)
     * @return APIlistPhoneNumbersWithVoiceSettingsRequest
     */
    public APIlistPhoneNumbersWithVoiceSettingsRequest filterUsagePaymentMethod(String filterUsagePaymentMethod) {
      this.filterUsagePaymentMethod = filterUsagePaymentMethod;
      return this;
    }

    /**
     * Set sort
     * @param sort Specifies the sort order for results. If not given, results are sorted by created_at in descending order. (optional)
     * @return APIlistPhoneNumbersWithVoiceSettingsRequest
     */
    public APIlistPhoneNumbersWithVoiceSettingsRequest sort(String sort) {
      this.sort = sort;
      return this;
    }

    /**
     * Execute listPhoneNumbersWithVoiceSettings request
     * @return ListPhoneNumbersWithVoiceSettingsResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response with a list of phone numbers with voice settings. </td><td>  -  </td></tr>
         <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ListPhoneNumbersWithVoiceSettingsResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute listPhoneNumbersWithVoiceSettings request with HTTP info returned
     * @return ApiResponse&lt;ListPhoneNumbersWithVoiceSettingsResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response with a list of phone numbers with voice settings. </td><td>  -  </td></tr>
         <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<ListPhoneNumbersWithVoiceSettingsResponse> executeWithHttpInfo() throws ApiException {
      return listPhoneNumbersWithVoiceSettingsWithHttpInfo(pageNumber, pageSize, filterPhoneNumber, filterConnectionNameContains, filterUsagePaymentMethod, sort);
    }
  }

  /**
   * List phone numbers with voice settings
   * 
   * @return listPhoneNumbersWithVoiceSettingsRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIlistPhoneNumbersWithVoiceSettingsRequest listPhoneNumbersWithVoiceSettings() throws ApiException {
    return new APIlistPhoneNumbersWithVoiceSettingsRequest();
  }
  /**
   * Retrieve a phone number
   * 
   * @param id Identifies the resource. (required)
   * @return PhoneNumberResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response with details about a phone number. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public PhoneNumberResponse retrievePhoneNumber(String id) throws ApiException {
    return retrievePhoneNumberWithHttpInfo(id).getData();
  }

  /**
   * Retrieve a phone number
   * 
   * @param id Identifies the resource. (required)
   * @return ApiResponse&lt;PhoneNumberResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response with details about a phone number. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<PhoneNumberResponse> retrievePhoneNumberWithHttpInfo(String id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling retrievePhoneNumber");
    }
    
    // create path and map variables
    String localVarPath = "/phone_numbers/{id}"
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

    GenericType<PhoneNumberResponse> localVarReturnType = new GenericType<PhoneNumberResponse>() {};

    return apiClient.invokeAPI("NumberConfigurationsApi.retrievePhoneNumber", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Retrieve a phone number with messaging settings
   * 
   * @param id Identifies the type of resource. (required)
   * @return RetrieveMessagingSettingsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response with details about a phone number including voice settings. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public RetrieveMessagingSettingsResponse retrievePhoneNumberWithMessagingSettings(String id) throws ApiException {
    return retrievePhoneNumberWithMessagingSettingsWithHttpInfo(id).getData();
  }

  /**
   * Retrieve a phone number with messaging settings
   * 
   * @param id Identifies the type of resource. (required)
   * @return ApiResponse&lt;RetrieveMessagingSettingsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response with details about a phone number including voice settings. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<RetrieveMessagingSettingsResponse> retrievePhoneNumberWithMessagingSettingsWithHttpInfo(String id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling retrievePhoneNumberWithMessagingSettings");
    }
    
    // create path and map variables
    String localVarPath = "/phone_numbers/{id}/messaging"
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

    GenericType<RetrieveMessagingSettingsResponse> localVarReturnType = new GenericType<RetrieveMessagingSettingsResponse>() {};

    return apiClient.invokeAPI("NumberConfigurationsApi.retrievePhoneNumberWithMessagingSettings", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Retrieve a phone number with voice settings
   * 
   * @param id Identifies the resource. (required)
   * @return RetrievePhoneNumberVoiceResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response with details about a phone number including voice settings. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public RetrievePhoneNumberVoiceResponse retrievePhoneNumberWithVoiceSettings(String id) throws ApiException {
    return retrievePhoneNumberWithVoiceSettingsWithHttpInfo(id).getData();
  }

  /**
   * Retrieve a phone number with voice settings
   * 
   * @param id Identifies the resource. (required)
   * @return ApiResponse&lt;RetrievePhoneNumberVoiceResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response with details about a phone number including voice settings. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<RetrievePhoneNumberVoiceResponse> retrievePhoneNumberWithVoiceSettingsWithHttpInfo(String id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling retrievePhoneNumberWithVoiceSettings");
    }
    
    // create path and map variables
    String localVarPath = "/phone_numbers/{id}/voice"
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

    GenericType<RetrievePhoneNumberVoiceResponse> localVarReturnType = new GenericType<RetrievePhoneNumberVoiceResponse>() {};

    return apiClient.invokeAPI("NumberConfigurationsApi.retrievePhoneNumberWithVoiceSettings", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Update a phone number
   * 
   * @param id Identifies the resource. (required)
   * @param updatePhoneNumberRequest Updated settings for the phone number. (required)
   * @return PhoneNumberResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response with details about a phone number. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public PhoneNumberResponse updatePhoneNumber(String id, UpdatePhoneNumberRequest updatePhoneNumberRequest) throws ApiException {
    return updatePhoneNumberWithHttpInfo(id, updatePhoneNumberRequest).getData();
  }

  /**
   * Update a phone number
   * 
   * @param id Identifies the resource. (required)
   * @param updatePhoneNumberRequest Updated settings for the phone number. (required)
   * @return ApiResponse&lt;PhoneNumberResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response with details about a phone number. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<PhoneNumberResponse> updatePhoneNumberWithHttpInfo(String id, UpdatePhoneNumberRequest updatePhoneNumberRequest) throws ApiException {
    Object localVarPostBody = updatePhoneNumberRequest;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling updatePhoneNumber");
    }
    
    // verify the required parameter 'updatePhoneNumberRequest' is set
    if (updatePhoneNumberRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'updatePhoneNumberRequest' when calling updatePhoneNumber");
    }
    
    // create path and map variables
    String localVarPath = "/phone_numbers/{id}"
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

    GenericType<PhoneNumberResponse> localVarReturnType = new GenericType<PhoneNumberResponse>() {};

    return apiClient.invokeAPI("NumberConfigurationsApi.updatePhoneNumber", localVarPath, "PATCH", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Update a phone number with messaging settings
   * 
   * @param id Identifies the type of resource. (required)
   * @param updatePhoneNumberMessagingSettingsRequest Updated messaging settings for the phone number (required)
   * @return RetrieveMessagingSettingsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response with details about a phone number including voice settings. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public RetrieveMessagingSettingsResponse updatePhoneNumberWithMessagingSettings(String id, UpdatePhoneNumberMessagingSettingsRequest updatePhoneNumberMessagingSettingsRequest) throws ApiException {
    return updatePhoneNumberWithMessagingSettingsWithHttpInfo(id, updatePhoneNumberMessagingSettingsRequest).getData();
  }

  /**
   * Update a phone number with messaging settings
   * 
   * @param id Identifies the type of resource. (required)
   * @param updatePhoneNumberMessagingSettingsRequest Updated messaging settings for the phone number (required)
   * @return ApiResponse&lt;RetrieveMessagingSettingsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response with details about a phone number including voice settings. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<RetrieveMessagingSettingsResponse> updatePhoneNumberWithMessagingSettingsWithHttpInfo(String id, UpdatePhoneNumberMessagingSettingsRequest updatePhoneNumberMessagingSettingsRequest) throws ApiException {
    Object localVarPostBody = updatePhoneNumberMessagingSettingsRequest;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling updatePhoneNumberWithMessagingSettings");
    }
    
    // verify the required parameter 'updatePhoneNumberMessagingSettingsRequest' is set
    if (updatePhoneNumberMessagingSettingsRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'updatePhoneNumberMessagingSettingsRequest' when calling updatePhoneNumberWithMessagingSettings");
    }
    
    // create path and map variables
    String localVarPath = "/phone_numbers/{id}/messaging"
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

    GenericType<RetrieveMessagingSettingsResponse> localVarReturnType = new GenericType<RetrieveMessagingSettingsResponse>() {};

    return apiClient.invokeAPI("NumberConfigurationsApi.updatePhoneNumberWithMessagingSettings", localVarPath, "PATCH", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Update a phone number with voice settings
   * 
   * @param id Identifies the resource. (required)
   * @param updatePhoneNumberVoiceSettingsRequest Updated voice settings for the phone number. (required)
   * @return RetrievePhoneNumberVoiceResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response with details about a phone number including voice settings. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public RetrievePhoneNumberVoiceResponse updatePhoneNumberWithVoiceSettings(String id, UpdatePhoneNumberVoiceSettingsRequest updatePhoneNumberVoiceSettingsRequest) throws ApiException {
    return updatePhoneNumberWithVoiceSettingsWithHttpInfo(id, updatePhoneNumberVoiceSettingsRequest).getData();
  }

  /**
   * Update a phone number with voice settings
   * 
   * @param id Identifies the resource. (required)
   * @param updatePhoneNumberVoiceSettingsRequest Updated voice settings for the phone number. (required)
   * @return ApiResponse&lt;RetrievePhoneNumberVoiceResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response with details about a phone number including voice settings. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<RetrievePhoneNumberVoiceResponse> updatePhoneNumberWithVoiceSettingsWithHttpInfo(String id, UpdatePhoneNumberVoiceSettingsRequest updatePhoneNumberVoiceSettingsRequest) throws ApiException {
    Object localVarPostBody = updatePhoneNumberVoiceSettingsRequest;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling updatePhoneNumberWithVoiceSettings");
    }
    
    // verify the required parameter 'updatePhoneNumberVoiceSettingsRequest' is set
    if (updatePhoneNumberVoiceSettingsRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'updatePhoneNumberVoiceSettingsRequest' when calling updatePhoneNumberWithVoiceSettings");
    }
    
    // create path and map variables
    String localVarPath = "/phone_numbers/{id}/voice"
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

    GenericType<RetrievePhoneNumberVoiceResponse> localVarReturnType = new GenericType<RetrievePhoneNumberVoiceResponse>() {};

    return apiClient.invokeAPI("NumberConfigurationsApi.updatePhoneNumberWithVoiceSettings", localVarPath, "PATCH", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
