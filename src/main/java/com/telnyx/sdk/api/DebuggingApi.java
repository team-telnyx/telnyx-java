package com.telnyx.sdk.api;

import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.Pair;

import jakarta.ws.rs.core.GenericType;

import com.telnyx.sdk.model.Errors;
import com.telnyx.sdk.model.ListCallEventsResponse;
import java.util.UUID;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class DebuggingApi {
  private ApiClient apiClient;

  public DebuggingApi() {
    this(Configuration.getDefaultApiClient());
  }

  public DebuggingApi(ApiClient apiClient) {
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


private ApiResponse<ListCallEventsResponse> listCallEventsWithHttpInfo(UUID filterCallLegId, UUID filterCallSessionId, String filterStatus, String filterType, String filterEventTimestampGt, String filterEventTimestampGte, String filterEventTimestampLt, String filterEventTimestampLte, String filterEventTimestampEq, Integer pageNumber, Integer pageSize) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/call_events";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[call_leg_id]", filterCallLegId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[call_session_id]", filterCallSessionId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[status]", filterStatus));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[type]", filterType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[event_timestamp][gt]", filterEventTimestampGt));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[event_timestamp][gte]", filterEventTimestampGte));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[event_timestamp][lt]", filterEventTimestampLt));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[event_timestamp][lte]", filterEventTimestampLte));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[event_timestamp][eq]", filterEventTimestampEq));
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

    GenericType<ListCallEventsResponse> localVarReturnType = new GenericType<ListCallEventsResponse>() {};

    return apiClient.invokeAPI("DebuggingApi.listCallEvents", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIlistCallEventsRequest {
    private UUID filterCallLegId;
    private UUID filterCallSessionId;
    private String filterStatus;
    private String filterType;
    private String filterEventTimestampGt;
    private String filterEventTimestampGte;
    private String filterEventTimestampLt;
    private String filterEventTimestampLte;
    private String filterEventTimestampEq;
    private Integer pageNumber;
    private Integer pageSize;

    private APIlistCallEventsRequest() {
    }

    /**
     * Set filterCallLegId
     * @param filterCallLegId The unique identifier of an individual call leg. (optional)
     * @return APIlistCallEventsRequest
     */
    public APIlistCallEventsRequest filterCallLegId(UUID filterCallLegId) {
      this.filterCallLegId = filterCallLegId;
      return this;
    }

    /**
     * Set filterCallSessionId
     * @param filterCallSessionId The unique identifier of the call control session. A session may include multiple call leg events. (optional)
     * @return APIlistCallEventsRequest
     */
    public APIlistCallEventsRequest filterCallSessionId(UUID filterCallSessionId) {
      this.filterCallSessionId = filterCallSessionId;
      return this;
    }

    /**
     * Set filterStatus
     * @param filterStatus Event status (optional)
     * @return APIlistCallEventsRequest
     */
    public APIlistCallEventsRequest filterStatus(String filterStatus) {
      this.filterStatus = filterStatus;
      return this;
    }

    /**
     * Set filterType
     * @param filterType Event type (optional)
     * @return APIlistCallEventsRequest
     */
    public APIlistCallEventsRequest filterType(String filterType) {
      this.filterType = filterType;
      return this;
    }

    /**
     * Set filterEventTimestampGt
     * @param filterEventTimestampGt Event timestamp: greater than (optional)
     * @return APIlistCallEventsRequest
     */
    public APIlistCallEventsRequest filterEventTimestampGt(String filterEventTimestampGt) {
      this.filterEventTimestampGt = filterEventTimestampGt;
      return this;
    }

    /**
     * Set filterEventTimestampGte
     * @param filterEventTimestampGte Event timestamp: greater than or equal (optional)
     * @return APIlistCallEventsRequest
     */
    public APIlistCallEventsRequest filterEventTimestampGte(String filterEventTimestampGte) {
      this.filterEventTimestampGte = filterEventTimestampGte;
      return this;
    }

    /**
     * Set filterEventTimestampLt
     * @param filterEventTimestampLt Event timestamp: lower than (optional)
     * @return APIlistCallEventsRequest
     */
    public APIlistCallEventsRequest filterEventTimestampLt(String filterEventTimestampLt) {
      this.filterEventTimestampLt = filterEventTimestampLt;
      return this;
    }

    /**
     * Set filterEventTimestampLte
     * @param filterEventTimestampLte Event timestamp: lower than or equal (optional)
     * @return APIlistCallEventsRequest
     */
    public APIlistCallEventsRequest filterEventTimestampLte(String filterEventTimestampLte) {
      this.filterEventTimestampLte = filterEventTimestampLte;
      return this;
    }

    /**
     * Set filterEventTimestampEq
     * @param filterEventTimestampEq Event timestamp: equal (optional)
     * @return APIlistCallEventsRequest
     */
    public APIlistCallEventsRequest filterEventTimestampEq(String filterEventTimestampEq) {
      this.filterEventTimestampEq = filterEventTimestampEq;
      return this;
    }

    /**
     * Set pageNumber
     * @param pageNumber The page number to load (optional, default to 1)
     * @return APIlistCallEventsRequest
     */
    public APIlistCallEventsRequest pageNumber(Integer pageNumber) {
      this.pageNumber = pageNumber;
      return this;
    }

    /**
     * Set pageSize
     * @param pageSize The size of the page (optional, default to 20)
     * @return APIlistCallEventsRequest
     */
    public APIlistCallEventsRequest pageSize(Integer pageSize) {
      this.pageSize = pageSize;
      return this;
    }

    /**
     * Execute listCallEvents request
     * @return ListCallEventsResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response with a list of call events. </td><td>  -  </td></tr>
         <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ListCallEventsResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute listCallEvents request with HTTP info returned
     * @return ApiResponse&lt;ListCallEventsResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response with a list of call events. </td><td>  -  </td></tr>
         <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<ListCallEventsResponse> executeWithHttpInfo() throws ApiException {
      return listCallEventsWithHttpInfo(filterCallLegId, filterCallSessionId, filterStatus, filterType, filterEventTimestampGt, filterEventTimestampGte, filterEventTimestampLt, filterEventTimestampLte, filterEventTimestampEq, pageNumber, pageSize);
    }
  }

  /**
   * List call events
   * Filters call events by given filter parameters. Events are ordered by &#x60;event_timestamp&#x60;. If filter for &#x60;call_leg_id&#x60; or &#x60;call_session_id&#x60; is not present, it only filters events from the last 24 hours.  **Note**: Only one &#x60;filter[event_timestamp]&#x60; can be passed. 
   * @return listCallEventsRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIlistCallEventsRequest listCallEvents() throws ApiException {
    return new APIlistCallEventsRequest();
  }
}
