package com.telnyx.sdk.api;

import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.Pair;

import jakarta.ws.rs.core.GenericType;

import com.telnyx.sdk.model.Errors;
import com.telnyx.sdk.model.ListPhoneNumbersAsynchronousJobsResponse;
import com.telnyx.sdk.model.PhoneNumbersEnableEmergency;
import com.telnyx.sdk.model.PhoneNumbersJob;
import com.telnyx.sdk.model.PhoneNumbersJobDeletePhoneNumbers;
import com.telnyx.sdk.model.PhoneNumbersJobDeletePhoneNumbersRequest;
import com.telnyx.sdk.model.PhoneNumbersJobUpdateEmergencySettingsRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PhoneNumberJobsApi {
  private ApiClient apiClient;

  public PhoneNumberJobsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public PhoneNumberJobsApi(ApiClient apiClient) {
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


private ApiResponse<PhoneNumbersJobDeletePhoneNumbers> createPhoneNumbersJobDeletePhoneNumbersWithHttpInfo(PhoneNumbersJobDeletePhoneNumbersRequest phoneNumbersJobDeletePhoneNumbersRequest) throws ApiException {
    Object localVarPostBody = phoneNumbersJobDeletePhoneNumbersRequest;
    
    // verify the required parameter 'phoneNumbersJobDeletePhoneNumbersRequest' is set
    if (phoneNumbersJobDeletePhoneNumbersRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'phoneNumbersJobDeletePhoneNumbersRequest' when calling createPhoneNumbersJobDeletePhoneNumbers");
    }
    
    // create path and map variables
    String localVarPath = "/phone_numbers/jobs/delete_phone_numbers";

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

    GenericType<PhoneNumbersJobDeletePhoneNumbers> localVarReturnType = new GenericType<PhoneNumbersJobDeletePhoneNumbers>() {};

    return apiClient.invokeAPI("PhoneNumberJobsApi.createPhoneNumbersJobDeletePhoneNumbers", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIcreatePhoneNumbersJobDeletePhoneNumbersRequest {
    private PhoneNumbersJobDeletePhoneNumbersRequest phoneNumbersJobDeletePhoneNumbersRequest;

    private APIcreatePhoneNumbersJobDeletePhoneNumbersRequest() {
    }

    /**
     * Set phoneNumbersJobDeletePhoneNumbersRequest
     * @param phoneNumbersJobDeletePhoneNumbersRequest  (required)
     * @return APIcreatePhoneNumbersJobDeletePhoneNumbersRequest
     */
    public APIcreatePhoneNumbersJobDeletePhoneNumbersRequest phoneNumbersJobDeletePhoneNumbersRequest(PhoneNumbersJobDeletePhoneNumbersRequest phoneNumbersJobDeletePhoneNumbersRequest) {
      this.phoneNumbersJobDeletePhoneNumbersRequest = phoneNumbersJobDeletePhoneNumbersRequest;
      return this;
    }

    /**
     * Execute createPhoneNumbersJobDeletePhoneNumbers request
     * @return PhoneNumbersJobDeletePhoneNumbers
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 202 </td><td> Phone numbers job delete phone numbers requested. </td><td>  -  </td></tr>
         <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
       </table>
     
     */
    
    public PhoneNumbersJobDeletePhoneNumbers execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute createPhoneNumbersJobDeletePhoneNumbers request with HTTP info returned
     * @return ApiResponse&lt;PhoneNumbersJobDeletePhoneNumbers&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 202 </td><td> Phone numbers job delete phone numbers requested. </td><td>  -  </td></tr>
         <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<PhoneNumbersJobDeletePhoneNumbers> executeWithHttpInfo() throws ApiException {
      return createPhoneNumbersJobDeletePhoneNumbersWithHttpInfo(phoneNumbersJobDeletePhoneNumbersRequest);
    }
  }

  /**
   * Creates a new background job to delete a batch of numbers. At most one thousand numbers can be updated per API call.
   * 
   * @return createPhoneNumbersJobDeletePhoneNumbersRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIcreatePhoneNumbersJobDeletePhoneNumbersRequest createPhoneNumbersJobDeletePhoneNumbers() throws ApiException {
    return new APIcreatePhoneNumbersJobDeletePhoneNumbersRequest();
  }
  /**
   * Creates a background job to update the emergency settings of a collection of phone numbers. At most one thousand numbers can be updated per API call.
   * 
   * @param phoneNumbersJobUpdateEmergencySettingsRequest  (required)
   * @return PhoneNumbersEnableEmergency
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 202 </td><td> Phone numbers enable emergency requested. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public PhoneNumbersEnableEmergency createPhoneNumbersJobUpdateEmergencySettings(PhoneNumbersJobUpdateEmergencySettingsRequest phoneNumbersJobUpdateEmergencySettingsRequest) throws ApiException {
    return createPhoneNumbersJobUpdateEmergencySettingsWithHttpInfo(phoneNumbersJobUpdateEmergencySettingsRequest).getData();
  }

  /**
   * Creates a background job to update the emergency settings of a collection of phone numbers. At most one thousand numbers can be updated per API call.
   * 
   * @param phoneNumbersJobUpdateEmergencySettingsRequest  (required)
   * @return ApiResponse&lt;PhoneNumbersEnableEmergency&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 202 </td><td> Phone numbers enable emergency requested. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<PhoneNumbersEnableEmergency> createPhoneNumbersJobUpdateEmergencySettingsWithHttpInfo(PhoneNumbersJobUpdateEmergencySettingsRequest phoneNumbersJobUpdateEmergencySettingsRequest) throws ApiException {
    Object localVarPostBody = phoneNumbersJobUpdateEmergencySettingsRequest;
    
    // verify the required parameter 'phoneNumbersJobUpdateEmergencySettingsRequest' is set
    if (phoneNumbersJobUpdateEmergencySettingsRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'phoneNumbersJobUpdateEmergencySettingsRequest' when calling createPhoneNumbersJobUpdateEmergencySettings");
    }
    
    // create path and map variables
    String localVarPath = "/phone_numbers/jobs/update_emergency_settings";

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

    GenericType<PhoneNumbersEnableEmergency> localVarReturnType = new GenericType<PhoneNumbersEnableEmergency>() {};

    return apiClient.invokeAPI("PhoneNumberJobsApi.createPhoneNumbersJobUpdateEmergencySettings", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

private ApiResponse<ListPhoneNumbersAsynchronousJobsResponse> listPhoneNumbersJobsWithHttpInfo(String filterType, Integer pageNumber, Integer pageSize, String sort) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/phone_numbers/jobs";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[type]", filterType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[number]", pageNumber));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort", sort));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    GenericType<ListPhoneNumbersAsynchronousJobsResponse> localVarReturnType = new GenericType<ListPhoneNumbersAsynchronousJobsResponse>() {};

    return apiClient.invokeAPI("PhoneNumberJobsApi.listPhoneNumbersJobs", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIlistPhoneNumbersJobsRequest {
    private String filterType;
    private Integer pageNumber;
    private Integer pageSize;
    private String sort;

    private APIlistPhoneNumbersJobsRequest() {
    }

    /**
     * Set filterType
     * @param filterType Filter the phone number jobs by type. (optional)
     * @return APIlistPhoneNumbersJobsRequest
     */
    public APIlistPhoneNumbersJobsRequest filterType(String filterType) {
      this.filterType = filterType;
      return this;
    }

    /**
     * Set pageNumber
     * @param pageNumber The page number to load. (optional, default to 1)
     * @return APIlistPhoneNumbersJobsRequest
     */
    public APIlistPhoneNumbersJobsRequest pageNumber(Integer pageNumber) {
      this.pageNumber = pageNumber;
      return this;
    }

    /**
     * Set pageSize
     * @param pageSize The size of the page. (optional, default to 20)
     * @return APIlistPhoneNumbersJobsRequest
     */
    public APIlistPhoneNumbersJobsRequest pageSize(Integer pageSize) {
      this.pageSize = pageSize;
      return this;
    }

    /**
     * Set sort
     * @param sort Specifies the sort order for results. If not given, results are sorted by created_at in descending order. (optional)
     * @return APIlistPhoneNumbersJobsRequest
     */
    public APIlistPhoneNumbersJobsRequest sort(String sort) {
      this.sort = sort;
      return this;
    }

    /**
     * Execute listPhoneNumbersJobs request
     * @return ListPhoneNumbersAsynchronousJobsResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response with a list of phone numbers asynchronous jobs. </td><td>  -  </td></tr>
         <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ListPhoneNumbersAsynchronousJobsResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute listPhoneNumbersJobs request with HTTP info returned
     * @return ApiResponse&lt;ListPhoneNumbersAsynchronousJobsResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response with a list of phone numbers asynchronous jobs. </td><td>  -  </td></tr>
         <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<ListPhoneNumbersAsynchronousJobsResponse> executeWithHttpInfo() throws ApiException {
      return listPhoneNumbersJobsWithHttpInfo(filterType, pageNumber, pageSize, sort);
    }
  }

  /**
   * Lists the phone numbers asynchronous jobs.
   * 
   * @return listPhoneNumbersJobsRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIlistPhoneNumbersJobsRequest listPhoneNumbersJobs() throws ApiException {
    return new APIlistPhoneNumbersJobsRequest();
  }

private ApiResponse<PhoneNumbersJob> retrievePhoneNumbersJobWithHttpInfo(String id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling retrievePhoneNumbersJob");
    }
    
    // create path and map variables
    String localVarPath = "/phone_numbers/jobs/{id}"
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

    GenericType<PhoneNumbersJob> localVarReturnType = new GenericType<PhoneNumbersJob>() {};

    return apiClient.invokeAPI("PhoneNumberJobsApi.retrievePhoneNumbersJob", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIretrievePhoneNumbersJobRequest {
    private String id;

    private APIretrievePhoneNumbersJobRequest(String id) {
      this.id = id;
    }

    /**
     * Execute retrievePhoneNumbersJob request
     * @return PhoneNumbersJob
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Phone numbers job details. </td><td>  -  </td></tr>
         <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
       </table>
     
     */
    
    public PhoneNumbersJob execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute retrievePhoneNumbersJob request with HTTP info returned
     * @return ApiResponse&lt;PhoneNumbersJob&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Phone numbers job details. </td><td>  -  </td></tr>
         <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<PhoneNumbersJob> executeWithHttpInfo() throws ApiException {
      return retrievePhoneNumbersJobWithHttpInfo(id);
    }
  }

  /**
   * Retrieves the details of a given phone numbers job.
   * 
   * @param id Identifies the Phone Numbers Job. (required)
   * @return retrievePhoneNumbersJobRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIretrievePhoneNumbersJobRequest retrievePhoneNumbersJob(String id) throws ApiException {
    return new APIretrievePhoneNumbersJobRequest(id);
  }
}
