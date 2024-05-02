package com.telnyx.sdk.api;

import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.Pair;

import jakarta.ws.rs.core.GenericType;

import com.telnyx.sdk.model.GetRecordingResponse;
import com.telnyx.sdk.model.ListRecordingsResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RecordingsCommandsApi {
  private ApiClient apiClient;

  public RecordingsCommandsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public RecordingsCommandsApi(ApiClient apiClient) {
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


private ApiResponse<ListRecordingsResponse> listRecordingsWithHttpInfo(String filterConferenceId, String filterCreatedAtGte, String filterCreatedAtLte, Integer pageNumber, Integer pageSize) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/recordings";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[conference_id]", filterConferenceId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[created_at][gte]", filterCreatedAtGte));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[created_at][lte]", filterCreatedAtLte));
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

    GenericType<ListRecordingsResponse> localVarReturnType = new GenericType<ListRecordingsResponse>() {};

    return apiClient.invokeAPI("RecordingsCommandsApi.listRecordings", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIlistRecordingsRequest {
    private String filterConferenceId;
    private String filterCreatedAtGte;
    private String filterCreatedAtLte;
    private Integer pageNumber;
    private Integer pageSize;

    private APIlistRecordingsRequest() {
    }

    /**
     * Set filterConferenceId
     * @param filterConferenceId Return only recordings associated with a given conference (optional)
     * @return APIlistRecordingsRequest
     */
    public APIlistRecordingsRequest filterConferenceId(String filterConferenceId) {
      this.filterConferenceId = filterConferenceId;
      return this;
    }

    /**
     * Set filterCreatedAtGte
     * @param filterCreatedAtGte Return only recordings created later than or at given ISO 8601 datetime (optional)
     * @return APIlistRecordingsRequest
     */
    public APIlistRecordingsRequest filterCreatedAtGte(String filterCreatedAtGte) {
      this.filterCreatedAtGte = filterCreatedAtGte;
      return this;
    }

    /**
     * Set filterCreatedAtLte
     * @param filterCreatedAtLte Return only recordings created earlier than or at given ISO 8601 datetime (optional)
     * @return APIlistRecordingsRequest
     */
    public APIlistRecordingsRequest filterCreatedAtLte(String filterCreatedAtLte) {
      this.filterCreatedAtLte = filterCreatedAtLte;
      return this;
    }

    /**
     * Set pageNumber
     * @param pageNumber The page number to load (optional, default to 1)
     * @return APIlistRecordingsRequest
     */
    public APIlistRecordingsRequest pageNumber(Integer pageNumber) {
      this.pageNumber = pageNumber;
      return this;
    }

    /**
     * Set pageSize
     * @param pageSize The size of the page (optional, default to 20)
     * @return APIlistRecordingsRequest
     */
    public APIlistRecordingsRequest pageSize(Integer pageSize) {
      this.pageSize = pageSize;
      return this;
    }

    /**
     * Execute listRecordings request
     * @return ListRecordingsResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response with a list of recordings. </td><td>  -  </td></tr>
         <tr><td> 401 </td><td> Unauthorized response. Happens when the current user is not a manager account. </td><td>  -  </td></tr>
         <tr><td> 422 </td><td> Unprocessable entity </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ListRecordingsResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute listRecordings request with HTTP info returned
     * @return ApiResponse&lt;ListRecordingsResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response with a list of recordings. </td><td>  -  </td></tr>
         <tr><td> 401 </td><td> Unauthorized response. Happens when the current user is not a manager account. </td><td>  -  </td></tr>
         <tr><td> 422 </td><td> Unprocessable entity </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<ListRecordingsResponse> executeWithHttpInfo() throws ApiException {
      return listRecordingsWithHttpInfo(filterConferenceId, filterCreatedAtGte, filterCreatedAtLte, pageNumber, pageSize);
    }
  }

  /**
   * List recordings
   * Lists recordings for the authenticated user
   * @return listRecordingsRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIlistRecordingsRequest listRecordings() throws ApiException {
    return new APIlistRecordingsRequest();
  }
  /**
   * Retrieve a recording
   * Retrieve a recording from the authenticated user&#39;s recordings
   * @param id Uniquely identifies the recording (required)
   * @return GetRecordingResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response with details about a recording. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized response. Happens when the current user is not a manager account. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Fax does not exist </td><td>  -  </td></tr>
     </table>
   */
  public GetRecordingResponse retrieveRecording(String id) throws ApiException {
    return retrieveRecordingWithHttpInfo(id).getData();
  }

  /**
   * Retrieve a recording
   * Retrieve a recording from the authenticated user&#39;s recordings
   * @param id Uniquely identifies the recording (required)
   * @return ApiResponse&lt;GetRecordingResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response with details about a recording. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized response. Happens when the current user is not a manager account. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Fax does not exist </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GetRecordingResponse> retrieveRecordingWithHttpInfo(String id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling retrieveRecording");
    }
    
    // create path and map variables
    String localVarPath = "/recordings/{id}"
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

    GenericType<GetRecordingResponse> localVarReturnType = new GenericType<GetRecordingResponse>() {};

    return apiClient.invokeAPI("RecordingsCommandsApi.retrieveRecording", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
