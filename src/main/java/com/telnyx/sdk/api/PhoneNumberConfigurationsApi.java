package com.telnyx.sdk.api;

import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.Pair;

import jakarta.ws.rs.core.GenericType;

import com.telnyx.sdk.model.Errors;
import com.telnyx.sdk.model.ListPhoneNumbersResponse;
import com.telnyx.sdk.model.ListPhoneNumbersResponse1;
import com.telnyx.sdk.model.ListPhoneNumbersWithVoiceSettingsResponse;
import com.telnyx.sdk.model.PhoneNumberEnableEmergency;
import com.telnyx.sdk.model.PhoneNumberEnableEmergencyRequest;
import com.telnyx.sdk.model.PhoneNumberResponse;
import com.telnyx.sdk.model.PhoneNumberResponse1;
import com.telnyx.sdk.model.RetrievePhoneNumberVoiceResponse;
import com.telnyx.sdk.model.UpdatePhoneNumberRequest;
import com.telnyx.sdk.model.UpdatePhoneNumberVoiceSettingsRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class PhoneNumberConfigurationsApi {
  private ApiClient apiClient;

  public PhoneNumberConfigurationsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public PhoneNumberConfigurationsApi(ApiClient apiClient) {
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
   * Delete a phone number
   * 
   * @param id Identifies the resource. (required)
   * @return PhoneNumberResponse1
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response with details about a phone number. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public PhoneNumberResponse1 deletePhoneNumber(String id) throws ApiException {
    return deletePhoneNumberWithHttpInfo(id).getData();
  }

  /**
   * Delete a phone number
   * 
   * @param id Identifies the resource. (required)
   * @return ApiResponse&lt;PhoneNumberResponse1&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response with details about a phone number. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<PhoneNumberResponse1> deletePhoneNumberWithHttpInfo(String id) throws ApiException {
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

    GenericType<PhoneNumberResponse1> localVarReturnType = new GenericType<PhoneNumberResponse1>() {};

    return apiClient.invokeAPI("PhoneNumberConfigurationsApi.deletePhoneNumber", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
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
  public PhoneNumberEnableEmergency enablePhoneNumberEmergency(String id, PhoneNumberEnableEmergencyRequest phoneNumberEnableEmergencyRequest) throws ApiException {
    return enablePhoneNumberEmergencyWithHttpInfo(id, phoneNumberEnableEmergencyRequest).getData();
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
  public ApiResponse<PhoneNumberEnableEmergency> enablePhoneNumberEmergencyWithHttpInfo(String id, PhoneNumberEnableEmergencyRequest phoneNumberEnableEmergencyRequest) throws ApiException {
    Object localVarPostBody = phoneNumberEnableEmergencyRequest;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling enablePhoneNumberEmergency");
    }
    
    // verify the required parameter 'phoneNumberEnableEmergencyRequest' is set
    if (phoneNumberEnableEmergencyRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'phoneNumberEnableEmergencyRequest' when calling enablePhoneNumberEmergency");
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

    return apiClient.invokeAPI("PhoneNumberConfigurationsApi.enablePhoneNumberEmergency", localVarPath, "POST", localVarQueryParams, localVarPostBody,
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
  public RetrievePhoneNumberVoiceResponse getPhoneNumberVoiceSettings(String id) throws ApiException {
    return getPhoneNumberVoiceSettingsWithHttpInfo(id).getData();
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
  public ApiResponse<RetrievePhoneNumberVoiceResponse> getPhoneNumberVoiceSettingsWithHttpInfo(String id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getPhoneNumberVoiceSettings");
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

    return apiClient.invokeAPI("PhoneNumberConfigurationsApi.getPhoneNumberVoiceSettings", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

private ApiResponse<ListPhoneNumbersResponse> listPhoneNumbersWithHttpInfo(Integer pageNumber, Integer pageSize, String filterTag, String filterPhoneNumber, String filterStatus, String filterConnectionId, String filterVoiceConnectionNameContains, String filterVoiceConnectionNameStartsWith, String filterVoiceConnectionNameEndsWith, String filterVoiceConnectionNameEq, String filterVoiceUsagePaymentMethod, String filterBillingGroupId, String filterEmergencyAddressId, String filterCustomerReference, String sort) throws ApiException {
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
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[connection_id]", filterConnectionId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[voice.connection_name][contains]", filterVoiceConnectionNameContains));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[voice.connection_name][starts_with]", filterVoiceConnectionNameStartsWith));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[voice.connection_name][ends_with]", filterVoiceConnectionNameEndsWith));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[voice.connection_name][eq]", filterVoiceConnectionNameEq));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[voice.usage_payment_method]", filterVoiceUsagePaymentMethod));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[billing_group_id]", filterBillingGroupId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[emergency_address_id]", filterEmergencyAddressId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[customer_reference]", filterCustomerReference));
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

    return apiClient.invokeAPI("PhoneNumberConfigurationsApi.listPhoneNumbers", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIlistPhoneNumbersRequest {
    private Integer pageNumber;
    private Integer pageSize;
    private String filterTag;
    private String filterPhoneNumber;
    private String filterStatus;
    private String filterConnectionId;
    private String filterVoiceConnectionNameContains;
    private String filterVoiceConnectionNameStartsWith;
    private String filterVoiceConnectionNameEndsWith;
    private String filterVoiceConnectionNameEq;
    private String filterVoiceUsagePaymentMethod;
    private String filterBillingGroupId;
    private String filterEmergencyAddressId;
    private String filterCustomerReference;
    private String sort;

    private APIlistPhoneNumbersRequest() {
    }

    /**
     * Set pageNumber
     * @param pageNumber The page number to load (optional, default to 1)
     * @return APIlistPhoneNumbersRequest
     */
    public APIlistPhoneNumbersRequest pageNumber(Integer pageNumber) {
      this.pageNumber = pageNumber;
      return this;
    }

    /**
     * Set pageSize
     * @param pageSize The size of the page (optional, default to 20)
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
     * Set filterConnectionId
     * @param filterConnectionId Filter by connection_id. (optional)
     * @return APIlistPhoneNumbersRequest
     */
    public APIlistPhoneNumbersRequest filterConnectionId(String filterConnectionId) {
      this.filterConnectionId = filterConnectionId;
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
     * Set filterVoiceUsagePaymentMethod
     * @param filterVoiceUsagePaymentMethod Filter by usage_payment_method. (optional)
     * @return APIlistPhoneNumbersRequest
     */
    public APIlistPhoneNumbersRequest filterVoiceUsagePaymentMethod(String filterVoiceUsagePaymentMethod) {
      this.filterVoiceUsagePaymentMethod = filterVoiceUsagePaymentMethod;
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
     * Set filterCustomerReference
     * @param filterCustomerReference Filter numbers via the customer_reference set. (optional)
     * @return APIlistPhoneNumbersRequest
     */
    public APIlistPhoneNumbersRequest filterCustomerReference(String filterCustomerReference) {
      this.filterCustomerReference = filterCustomerReference;
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
      return listPhoneNumbersWithHttpInfo(pageNumber, pageSize, filterTag, filterPhoneNumber, filterStatus, filterConnectionId, filterVoiceConnectionNameContains, filterVoiceConnectionNameStartsWith, filterVoiceConnectionNameEndsWith, filterVoiceConnectionNameEq, filterVoiceUsagePaymentMethod, filterBillingGroupId, filterEmergencyAddressId, filterCustomerReference, sort);
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

private ApiResponse<ListPhoneNumbersWithVoiceSettingsResponse> listPhoneNumbersWithVoiceSettingsWithHttpInfo(Integer pageNumber, Integer pageSize, String filterPhoneNumber, String filterConnectionNameContains, String filterCustomerReference, String filterVoiceUsagePaymentMethod, String sort) throws ApiException {
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
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[customer_reference]", filterCustomerReference));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[voice.usage_payment_method]", filterVoiceUsagePaymentMethod));
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

    return apiClient.invokeAPI("PhoneNumberConfigurationsApi.listPhoneNumbersWithVoiceSettings", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIlistPhoneNumbersWithVoiceSettingsRequest {
    private Integer pageNumber;
    private Integer pageSize;
    private String filterPhoneNumber;
    private String filterConnectionNameContains;
    private String filterCustomerReference;
    private String filterVoiceUsagePaymentMethod;
    private String sort;

    private APIlistPhoneNumbersWithVoiceSettingsRequest() {
    }

    /**
     * Set pageNumber
     * @param pageNumber The page number to load (optional, default to 1)
     * @return APIlistPhoneNumbersWithVoiceSettingsRequest
     */
    public APIlistPhoneNumbersWithVoiceSettingsRequest pageNumber(Integer pageNumber) {
      this.pageNumber = pageNumber;
      return this;
    }

    /**
     * Set pageSize
     * @param pageSize The size of the page (optional, default to 20)
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
     * Set filterCustomerReference
     * @param filterCustomerReference Filter numbers via the customer_reference set. (optional)
     * @return APIlistPhoneNumbersWithVoiceSettingsRequest
     */
    public APIlistPhoneNumbersWithVoiceSettingsRequest filterCustomerReference(String filterCustomerReference) {
      this.filterCustomerReference = filterCustomerReference;
      return this;
    }

    /**
     * Set filterVoiceUsagePaymentMethod
     * @param filterVoiceUsagePaymentMethod Filter by usage_payment_method. (optional)
     * @return APIlistPhoneNumbersWithVoiceSettingsRequest
     */
    public APIlistPhoneNumbersWithVoiceSettingsRequest filterVoiceUsagePaymentMethod(String filterVoiceUsagePaymentMethod) {
      this.filterVoiceUsagePaymentMethod = filterVoiceUsagePaymentMethod;
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
      return listPhoneNumbersWithVoiceSettingsWithHttpInfo(pageNumber, pageSize, filterPhoneNumber, filterConnectionNameContains, filterCustomerReference, filterVoiceUsagePaymentMethod, sort);
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

    return apiClient.invokeAPI("PhoneNumberConfigurationsApi.retrievePhoneNumber", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

private ApiResponse<ListPhoneNumbersResponse1> slimListPhoneNumbersWithHttpInfo(Integer pageNumber, Integer pageSize, Boolean includeConnection, Boolean includeTags, String filterTag, String filterPhoneNumber, String filterStatus, String filterConnectionId, String filterVoiceConnectionNameContains, String filterVoiceConnectionNameStartsWith, String filterVoiceConnectionNameEndsWith, String filterVoiceConnectionName, String filterVoiceUsagePaymentMethod, String filterBillingGroupId, String filterEmergencyAddressId, String filterCustomerReference, String sort) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/phone_numbers/slim";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[number]", pageNumber));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include_connection", includeConnection));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include_tags", includeTags));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[tag]", filterTag));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[phone_number]", filterPhoneNumber));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[status]", filterStatus));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[connection_id]", filterConnectionId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[voice.connection_name][contains]", filterVoiceConnectionNameContains));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[voice.connection_name][starts_with]", filterVoiceConnectionNameStartsWith));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[voice.connection_name][ends_with]", filterVoiceConnectionNameEndsWith));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[voice.connection_name]", filterVoiceConnectionName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[voice.usage_payment_method]", filterVoiceUsagePaymentMethod));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[billing_group_id]", filterBillingGroupId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[emergency_address_id]", filterEmergencyAddressId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[customer_reference]", filterCustomerReference));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort", sort));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    GenericType<ListPhoneNumbersResponse1> localVarReturnType = new GenericType<ListPhoneNumbersResponse1>() {};

    return apiClient.invokeAPI("PhoneNumberConfigurationsApi.slimListPhoneNumbers", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIslimListPhoneNumbersRequest {
    private Integer pageNumber;
    private Integer pageSize;
    private Boolean includeConnection;
    private Boolean includeTags;
    private String filterTag;
    private String filterPhoneNumber;
    private String filterStatus;
    private String filterConnectionId;
    private String filterVoiceConnectionNameContains;
    private String filterVoiceConnectionNameStartsWith;
    private String filterVoiceConnectionNameEndsWith;
    private String filterVoiceConnectionName;
    private String filterVoiceUsagePaymentMethod;
    private String filterBillingGroupId;
    private String filterEmergencyAddressId;
    private String filterCustomerReference;
    private String sort;

    private APIslimListPhoneNumbersRequest() {
    }

    /**
     * Set pageNumber
     * @param pageNumber The page number to load (optional, default to 1)
     * @return APIslimListPhoneNumbersRequest
     */
    public APIslimListPhoneNumbersRequest pageNumber(Integer pageNumber) {
      this.pageNumber = pageNumber;
      return this;
    }

    /**
     * Set pageSize
     * @param pageSize The size of the page (optional, default to 20)
     * @return APIslimListPhoneNumbersRequest
     */
    public APIslimListPhoneNumbersRequest pageSize(Integer pageSize) {
      this.pageSize = pageSize;
      return this;
    }

    /**
     * Set includeConnection
     * @param includeConnection Include the connection associated with the phone number. (optional, default to false)
     * @return APIslimListPhoneNumbersRequest
     */
    public APIslimListPhoneNumbersRequest includeConnection(Boolean includeConnection) {
      this.includeConnection = includeConnection;
      return this;
    }

    /**
     * Set includeTags
     * @param includeTags Include the tags associated with the phone number. (optional, default to false)
     * @return APIslimListPhoneNumbersRequest
     */
    public APIslimListPhoneNumbersRequest includeTags(Boolean includeTags) {
      this.includeTags = includeTags;
      return this;
    }

    /**
     * Set filterTag
     * @param filterTag Filter by phone number tags. (This requires the include_tags param) (optional)
     * @return APIslimListPhoneNumbersRequest
     */
    public APIslimListPhoneNumbersRequest filterTag(String filterTag) {
      this.filterTag = filterTag;
      return this;
    }

    /**
     * Set filterPhoneNumber
     * @param filterPhoneNumber Filter by phone number. Requires at least three digits.              Non-numerical characters will result in no values being returned. (optional)
     * @return APIslimListPhoneNumbersRequest
     */
    public APIslimListPhoneNumbersRequest filterPhoneNumber(String filterPhoneNumber) {
      this.filterPhoneNumber = filterPhoneNumber;
      return this;
    }

    /**
     * Set filterStatus
     * @param filterStatus Filter by phone number status. (optional)
     * @return APIslimListPhoneNumbersRequest
     */
    public APIslimListPhoneNumbersRequest filterStatus(String filterStatus) {
      this.filterStatus = filterStatus;
      return this;
    }

    /**
     * Set filterConnectionId
     * @param filterConnectionId Filter by connection_id. (optional)
     * @return APIslimListPhoneNumbersRequest
     */
    public APIslimListPhoneNumbersRequest filterConnectionId(String filterConnectionId) {
      this.filterConnectionId = filterConnectionId;
      return this;
    }

    /**
     * Set filterVoiceConnectionNameContains
     * @param filterVoiceConnectionNameContains Filter contains connection name. Requires at least three characters and the include_connection param. (optional)
     * @return APIslimListPhoneNumbersRequest
     */
    public APIslimListPhoneNumbersRequest filterVoiceConnectionNameContains(String filterVoiceConnectionNameContains) {
      this.filterVoiceConnectionNameContains = filterVoiceConnectionNameContains;
      return this;
    }

    /**
     * Set filterVoiceConnectionNameStartsWith
     * @param filterVoiceConnectionNameStartsWith Filter starts with connection name. Requires at least three characters and the include_connection param. (optional)
     * @return APIslimListPhoneNumbersRequest
     */
    public APIslimListPhoneNumbersRequest filterVoiceConnectionNameStartsWith(String filterVoiceConnectionNameStartsWith) {
      this.filterVoiceConnectionNameStartsWith = filterVoiceConnectionNameStartsWith;
      return this;
    }

    /**
     * Set filterVoiceConnectionNameEndsWith
     * @param filterVoiceConnectionNameEndsWith Filter ends with connection name. Requires at least three characters and the include_connection param. (optional)
     * @return APIslimListPhoneNumbersRequest
     */
    public APIslimListPhoneNumbersRequest filterVoiceConnectionNameEndsWith(String filterVoiceConnectionNameEndsWith) {
      this.filterVoiceConnectionNameEndsWith = filterVoiceConnectionNameEndsWith;
      return this;
    }

    /**
     * Set filterVoiceConnectionName
     * @param filterVoiceConnectionName Filter by connection name , requires the include_connection param and the include_connection param. (optional)
     * @return APIslimListPhoneNumbersRequest
     */
    public APIslimListPhoneNumbersRequest filterVoiceConnectionName(String filterVoiceConnectionName) {
      this.filterVoiceConnectionName = filterVoiceConnectionName;
      return this;
    }

    /**
     * Set filterVoiceUsagePaymentMethod
     * @param filterVoiceUsagePaymentMethod Filter by usage_payment_method. (optional)
     * @return APIslimListPhoneNumbersRequest
     */
    public APIslimListPhoneNumbersRequest filterVoiceUsagePaymentMethod(String filterVoiceUsagePaymentMethod) {
      this.filterVoiceUsagePaymentMethod = filterVoiceUsagePaymentMethod;
      return this;
    }

    /**
     * Set filterBillingGroupId
     * @param filterBillingGroupId Filter by the billing_group_id associated with phone numbers. To filter to only phone numbers that have no billing group associated them, set the value of this filter to the string &#39;null&#39;. (optional)
     * @return APIslimListPhoneNumbersRequest
     */
    public APIslimListPhoneNumbersRequest filterBillingGroupId(String filterBillingGroupId) {
      this.filterBillingGroupId = filterBillingGroupId;
      return this;
    }

    /**
     * Set filterEmergencyAddressId
     * @param filterEmergencyAddressId Filter by the emergency_address_id associated with phone numbers. To filter only phone numbers that have no emergency address associated with them, set the value of this filter to the string &#39;null&#39;. (optional)
     * @return APIslimListPhoneNumbersRequest
     */
    public APIslimListPhoneNumbersRequest filterEmergencyAddressId(String filterEmergencyAddressId) {
      this.filterEmergencyAddressId = filterEmergencyAddressId;
      return this;
    }

    /**
     * Set filterCustomerReference
     * @param filterCustomerReference Filter numbers via the customer_reference set. (optional)
     * @return APIslimListPhoneNumbersRequest
     */
    public APIslimListPhoneNumbersRequest filterCustomerReference(String filterCustomerReference) {
      this.filterCustomerReference = filterCustomerReference;
      return this;
    }

    /**
     * Set sort
     * @param sort Specifies the sort order for results. If not given, results are sorted by created_at in descending order. (optional)
     * @return APIslimListPhoneNumbersRequest
     */
    public APIslimListPhoneNumbersRequest sort(String sort) {
      this.sort = sort;
      return this;
    }

    /**
     * Execute slimListPhoneNumbers request
     * @return ListPhoneNumbersResponse1
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response with a list of phone numbers. </td><td>  -  </td></tr>
         <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ListPhoneNumbersResponse1 execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute slimListPhoneNumbers request with HTTP info returned
     * @return ApiResponse&lt;ListPhoneNumbersResponse1&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response with a list of phone numbers. </td><td>  -  </td></tr>
         <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<ListPhoneNumbersResponse1> executeWithHttpInfo() throws ApiException {
      return slimListPhoneNumbersWithHttpInfo(pageNumber, pageSize, includeConnection, includeTags, filterTag, filterPhoneNumber, filterStatus, filterConnectionId, filterVoiceConnectionNameContains, filterVoiceConnectionNameStartsWith, filterVoiceConnectionNameEndsWith, filterVoiceConnectionName, filterVoiceUsagePaymentMethod, filterBillingGroupId, filterEmergencyAddressId, filterCustomerReference, sort);
    }
  }

  /**
   * Slim List phone numbers
   * List phone numbers, This endpoint is a lighter version of the /phone_numbers endpoint having higher performance and rate limit.
   * @return slimListPhoneNumbersRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIslimListPhoneNumbersRequest slimListPhoneNumbers() throws ApiException {
    return new APIslimListPhoneNumbersRequest();
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

    return apiClient.invokeAPI("PhoneNumberConfigurationsApi.updatePhoneNumber", localVarPath, "PATCH", localVarQueryParams, localVarPostBody,
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
  public RetrievePhoneNumberVoiceResponse updatePhoneNumberVoiceSettings(String id, UpdatePhoneNumberVoiceSettingsRequest updatePhoneNumberVoiceSettingsRequest) throws ApiException {
    return updatePhoneNumberVoiceSettingsWithHttpInfo(id, updatePhoneNumberVoiceSettingsRequest).getData();
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
  public ApiResponse<RetrievePhoneNumberVoiceResponse> updatePhoneNumberVoiceSettingsWithHttpInfo(String id, UpdatePhoneNumberVoiceSettingsRequest updatePhoneNumberVoiceSettingsRequest) throws ApiException {
    Object localVarPostBody = updatePhoneNumberVoiceSettingsRequest;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling updatePhoneNumberVoiceSettings");
    }
    
    // verify the required parameter 'updatePhoneNumberVoiceSettingsRequest' is set
    if (updatePhoneNumberVoiceSettingsRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'updatePhoneNumberVoiceSettingsRequest' when calling updatePhoneNumberVoiceSettings");
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

    return apiClient.invokeAPI("PhoneNumberConfigurationsApi.updatePhoneNumberVoiceSettings", localVarPath, "PATCH", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
