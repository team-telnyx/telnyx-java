package com.telnyx.sdk.api;

import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.Pair;

import jakarta.ws.rs.core.GenericType;

import com.telnyx.sdk.model.Errors;
import com.telnyx.sdk.model.ListPhoneNumberBlocksBackgroundJobsResponse;
import com.telnyx.sdk.model.PhoneNumberBlocksJob;
import com.telnyx.sdk.model.PhoneNumberBlocksJobDeletePhoneNumberBlock;
import com.telnyx.sdk.model.PhoneNumberBlocksJobDeletePhoneNumberBlockRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class NumberBlocksBackgroundJobsApi {
  private ApiClient apiClient;

  public NumberBlocksBackgroundJobsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public NumberBlocksBackgroundJobsApi(ApiClient apiClient) {
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


private ApiResponse<PhoneNumberBlocksJobDeletePhoneNumberBlock> createPhoneNumberBlocksJobDeletePhoneNumberBlockWithHttpInfo(PhoneNumberBlocksJobDeletePhoneNumberBlockRequest phoneNumberBlocksJobDeletePhoneNumberBlockRequest) throws ApiException {
    Object localVarPostBody = phoneNumberBlocksJobDeletePhoneNumberBlockRequest;
    
    // verify the required parameter 'phoneNumberBlocksJobDeletePhoneNumberBlockRequest' is set
    if (phoneNumberBlocksJobDeletePhoneNumberBlockRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'phoneNumberBlocksJobDeletePhoneNumberBlockRequest' when calling createPhoneNumberBlocksJobDeletePhoneNumberBlock");
    }
    
    // create path and map variables
    String localVarPath = "/phone_number_blocks/jobs/delete_phone_number_block";

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

    GenericType<PhoneNumberBlocksJobDeletePhoneNumberBlock> localVarReturnType = new GenericType<PhoneNumberBlocksJobDeletePhoneNumberBlock>() {};

    return apiClient.invokeAPI("NumberBlocksBackgroundJobsApi.createPhoneNumberBlocksJobDeletePhoneNumberBlock", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIcreatePhoneNumberBlocksJobDeletePhoneNumberBlockRequest {
    private PhoneNumberBlocksJobDeletePhoneNumberBlockRequest phoneNumberBlocksJobDeletePhoneNumberBlockRequest;

    private APIcreatePhoneNumberBlocksJobDeletePhoneNumberBlockRequest() {
    }

    /**
     * Set phoneNumberBlocksJobDeletePhoneNumberBlockRequest
     * @param phoneNumberBlocksJobDeletePhoneNumberBlockRequest  (required)
     * @return APIcreatePhoneNumberBlocksJobDeletePhoneNumberBlockRequest
     */
    public APIcreatePhoneNumberBlocksJobDeletePhoneNumberBlockRequest phoneNumberBlocksJobDeletePhoneNumberBlockRequest(PhoneNumberBlocksJobDeletePhoneNumberBlockRequest phoneNumberBlocksJobDeletePhoneNumberBlockRequest) {
      this.phoneNumberBlocksJobDeletePhoneNumberBlockRequest = phoneNumberBlocksJobDeletePhoneNumberBlockRequest;
      return this;
    }

    /**
     * Execute createPhoneNumberBlocksJobDeletePhoneNumberBlock request
     * @return PhoneNumberBlocksJobDeletePhoneNumberBlock
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 202 </td><td> Phone number blocks job delete phone numbers requested. </td><td>  -  </td></tr>
         <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
       </table>
     
     */
    
    public PhoneNumberBlocksJobDeletePhoneNumberBlock execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute createPhoneNumberBlocksJobDeletePhoneNumberBlock request with HTTP info returned
     * @return ApiResponse&lt;PhoneNumberBlocksJobDeletePhoneNumberBlock&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 202 </td><td> Phone number blocks job delete phone numbers requested. </td><td>  -  </td></tr>
         <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<PhoneNumberBlocksJobDeletePhoneNumberBlock> executeWithHttpInfo() throws ApiException {
      return createPhoneNumberBlocksJobDeletePhoneNumberBlockWithHttpInfo(phoneNumberBlocksJobDeletePhoneNumberBlockRequest);
    }
  }

  /**
   * Deletes all numbers associated with a phone number block
   * Creates a new background job to delete all the phone numbers associated with the given block. We will only consider the phone number block as deleted after all phone numbers associated with it are removed, so multiple executions of this job may be necessary in case some of the phone numbers present errors during the deletion process.
   * @return createPhoneNumberBlocksJobDeletePhoneNumberBlockRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIcreatePhoneNumberBlocksJobDeletePhoneNumberBlockRequest createPhoneNumberBlocksJobDeletePhoneNumberBlock() throws ApiException {
    return new APIcreatePhoneNumberBlocksJobDeletePhoneNumberBlockRequest();
  }

private ApiResponse<ListPhoneNumberBlocksBackgroundJobsResponse> listPhoneNumberBlocksJobsWithHttpInfo(String filterType, String filterStatus, Integer pageNumber, Integer pageSize, String sort) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/phone_number_blocks/jobs";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[type]", filterType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[status]", filterStatus));
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

    GenericType<ListPhoneNumberBlocksBackgroundJobsResponse> localVarReturnType = new GenericType<ListPhoneNumberBlocksBackgroundJobsResponse>() {};

    return apiClient.invokeAPI("NumberBlocksBackgroundJobsApi.listPhoneNumberBlocksJobs", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIlistPhoneNumberBlocksJobsRequest {
    private String filterType;
    private String filterStatus;
    private Integer pageNumber;
    private Integer pageSize;
    private String sort;

    private APIlistPhoneNumberBlocksJobsRequest() {
    }

    /**
     * Set filterType
     * @param filterType Filter the phone number blocks jobs by type. (optional)
     * @return APIlistPhoneNumberBlocksJobsRequest
     */
    public APIlistPhoneNumberBlocksJobsRequest filterType(String filterType) {
      this.filterType = filterType;
      return this;
    }

    /**
     * Set filterStatus
     * @param filterStatus Filter the phone number blocks jobs by status. (optional)
     * @return APIlistPhoneNumberBlocksJobsRequest
     */
    public APIlistPhoneNumberBlocksJobsRequest filterStatus(String filterStatus) {
      this.filterStatus = filterStatus;
      return this;
    }

    /**
     * Set pageNumber
     * @param pageNumber The page number to load (optional, default to 1)
     * @return APIlistPhoneNumberBlocksJobsRequest
     */
    public APIlistPhoneNumberBlocksJobsRequest pageNumber(Integer pageNumber) {
      this.pageNumber = pageNumber;
      return this;
    }

    /**
     * Set pageSize
     * @param pageSize The size of the page (optional, default to 20)
     * @return APIlistPhoneNumberBlocksJobsRequest
     */
    public APIlistPhoneNumberBlocksJobsRequest pageSize(Integer pageSize) {
      this.pageSize = pageSize;
      return this;
    }

    /**
     * Set sort
     * @param sort Specifies the sort order for results. If not given, results are sorted by created_at in descending order. (optional)
     * @return APIlistPhoneNumberBlocksJobsRequest
     */
    public APIlistPhoneNumberBlocksJobsRequest sort(String sort) {
      this.sort = sort;
      return this;
    }

    /**
     * Execute listPhoneNumberBlocksJobs request
     * @return ListPhoneNumberBlocksBackgroundJobsResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response with a list of phone number blocks background jobs. </td><td>  -  </td></tr>
         <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ListPhoneNumberBlocksBackgroundJobsResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute listPhoneNumberBlocksJobs request with HTTP info returned
     * @return ApiResponse&lt;ListPhoneNumberBlocksBackgroundJobsResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response with a list of phone number blocks background jobs. </td><td>  -  </td></tr>
         <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<ListPhoneNumberBlocksBackgroundJobsResponse> executeWithHttpInfo() throws ApiException {
      return listPhoneNumberBlocksJobsWithHttpInfo(filterType, filterStatus, pageNumber, pageSize, sort);
    }
  }

  /**
   * Lists the phone number blocks jobs
   * 
   * @return listPhoneNumberBlocksJobsRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIlistPhoneNumberBlocksJobsRequest listPhoneNumberBlocksJobs() throws ApiException {
    return new APIlistPhoneNumberBlocksJobsRequest();
  }

private ApiResponse<PhoneNumberBlocksJob> retrievePhoneNumberBlocksJobWithHttpInfo(String id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling retrievePhoneNumberBlocksJob");
    }
    
    // create path and map variables
    String localVarPath = "/phone_number_blocks/jobs/{id}"
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

    GenericType<PhoneNumberBlocksJob> localVarReturnType = new GenericType<PhoneNumberBlocksJob>() {};

    return apiClient.invokeAPI("NumberBlocksBackgroundJobsApi.retrievePhoneNumberBlocksJob", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIretrievePhoneNumberBlocksJobRequest {
    private String id;

    private APIretrievePhoneNumberBlocksJobRequest(String id) {
      this.id = id;
    }

    /**
     * Execute retrievePhoneNumberBlocksJob request
     * @return PhoneNumberBlocksJob
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Phone number blocks job details. </td><td>  -  </td></tr>
         <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
       </table>
     
     */
    
    public PhoneNumberBlocksJob execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute retrievePhoneNumberBlocksJob request with HTTP info returned
     * @return ApiResponse&lt;PhoneNumberBlocksJob&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Phone number blocks job details. </td><td>  -  </td></tr>
         <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<PhoneNumberBlocksJob> executeWithHttpInfo() throws ApiException {
      return retrievePhoneNumberBlocksJobWithHttpInfo(id);
    }
  }

  /**
   * Retrieves a phone number blocks job
   * 
   * @param id Identifies the Phone Number Blocks Job. (required)
   * @return retrievePhoneNumberBlocksJobRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIretrievePhoneNumberBlocksJobRequest retrievePhoneNumberBlocksJob(String id) throws ApiException {
    return new APIretrievePhoneNumberBlocksJobRequest(id);
  }
}
