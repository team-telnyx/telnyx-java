package com.telnyx.sdk.api;

import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.Pair;

import javax.ws.rs.core.GenericType;

import com.telnyx.sdk.model.Errors;
import com.telnyx.sdk.model.ListCallEventsResponse;
import java.util.UUID;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0")
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


private ApiResponse<ListCallEventsResponse> listCallEventsWithHttpInfo(UUID filterLegId, UUID filterApplicationSessionId, String filterConnectionId, String filterProduct, String filterFrom, String filterTo, Boolean filterFailed, String filterType, String filterName, String filterOccurredAtGt, String filterOccurredAtGte, String filterOccurredAtLt, String filterOccurredAtLte, String filterOccurredAtEq, Integer pageNumber, Integer pageSize) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/call_events";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[leg_id]", filterLegId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[application_session_id]", filterApplicationSessionId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[connection_id]", filterConnectionId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[product]", filterProduct));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[from]", filterFrom));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[to]", filterTo));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[failed]", filterFailed));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[type]", filterType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[name]", filterName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[occurred_at][gt]", filterOccurredAtGt));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[occurred_at][gte]", filterOccurredAtGte));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[occurred_at][lt]", filterOccurredAtLt));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[occurred_at][lte]", filterOccurredAtLte));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[occurred_at][eq]", filterOccurredAtEq));
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
    private UUID filterLegId;
    private UUID filterApplicationSessionId;
    private String filterConnectionId;
    private String filterProduct;
    private String filterFrom;
    private String filterTo;
    private Boolean filterFailed;
    private String filterType;
    private String filterName;
    private String filterOccurredAtGt;
    private String filterOccurredAtGte;
    private String filterOccurredAtLt;
    private String filterOccurredAtLte;
    private String filterOccurredAtEq;
    private Integer pageNumber;
    private Integer pageSize;

    private APIlistCallEventsRequest() {
    }

    /**
     * Set filterLegId
     * @param filterLegId The unique identifier of an individual call leg. (optional)
     * @return APIlistCallEventsRequest
     */
    public APIlistCallEventsRequest filterLegId(UUID filterLegId) {
      this.filterLegId = filterLegId;
      return this;
    }

    /**
     * Set filterApplicationSessionId
     * @param filterApplicationSessionId The unique identifier of the call session. A session may include multiple call leg events. (optional)
     * @return APIlistCallEventsRequest
     */
    public APIlistCallEventsRequest filterApplicationSessionId(UUID filterApplicationSessionId) {
      this.filterApplicationSessionId = filterApplicationSessionId;
      return this;
    }

    /**
     * Set filterConnectionId
     * @param filterConnectionId The unique identifier of the conection. (optional)
     * @return APIlistCallEventsRequest
     */
    public APIlistCallEventsRequest filterConnectionId(String filterConnectionId) {
      this.filterConnectionId = filterConnectionId;
      return this;
    }

    /**
     * Set filterProduct
     * @param filterProduct Filter by product. (optional)
     * @return APIlistCallEventsRequest
     */
    public APIlistCallEventsRequest filterProduct(String filterProduct) {
      this.filterProduct = filterProduct;
      return this;
    }

    /**
     * Set filterFrom
     * @param filterFrom Filter by From number. (optional)
     * @return APIlistCallEventsRequest
     */
    public APIlistCallEventsRequest filterFrom(String filterFrom) {
      this.filterFrom = filterFrom;
      return this;
    }

    /**
     * Set filterTo
     * @param filterTo Filter by To number. (optional)
     * @return APIlistCallEventsRequest
     */
    public APIlistCallEventsRequest filterTo(String filterTo) {
      this.filterTo = filterTo;
      return this;
    }

    /**
     * Set filterFailed
     * @param filterFailed Delivery failed or not. (optional)
     * @return APIlistCallEventsRequest
     */
    public APIlistCallEventsRequest filterFailed(Boolean filterFailed) {
      this.filterFailed = filterFailed;
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
     * Set filterName
     * @param filterName Event name (optional)
     * @return APIlistCallEventsRequest
     */
    public APIlistCallEventsRequest filterName(String filterName) {
      this.filterName = filterName;
      return this;
    }

    /**
     * Set filterOccurredAtGt
     * @param filterOccurredAtGt Event occurred_at: greater than (optional)
     * @return APIlistCallEventsRequest
     */
    public APIlistCallEventsRequest filterOccurredAtGt(String filterOccurredAtGt) {
      this.filterOccurredAtGt = filterOccurredAtGt;
      return this;
    }

    /**
     * Set filterOccurredAtGte
     * @param filterOccurredAtGte Event occurred_at: greater than or equal (optional)
     * @return APIlistCallEventsRequest
     */
    public APIlistCallEventsRequest filterOccurredAtGte(String filterOccurredAtGte) {
      this.filterOccurredAtGte = filterOccurredAtGte;
      return this;
    }

    /**
     * Set filterOccurredAtLt
     * @param filterOccurredAtLt Event occurred_at: lower than (optional)
     * @return APIlistCallEventsRequest
     */
    public APIlistCallEventsRequest filterOccurredAtLt(String filterOccurredAtLt) {
      this.filterOccurredAtLt = filterOccurredAtLt;
      return this;
    }

    /**
     * Set filterOccurredAtLte
     * @param filterOccurredAtLte Event occurred_at: lower than or equal (optional)
     * @return APIlistCallEventsRequest
     */
    public APIlistCallEventsRequest filterOccurredAtLte(String filterOccurredAtLte) {
      this.filterOccurredAtLte = filterOccurredAtLte;
      return this;
    }

    /**
     * Set filterOccurredAtEq
     * @param filterOccurredAtEq Event occurred_at: equal (optional)
     * @return APIlistCallEventsRequest
     */
    public APIlistCallEventsRequest filterOccurredAtEq(String filterOccurredAtEq) {
      this.filterOccurredAtEq = filterOccurredAtEq;
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
      return listCallEventsWithHttpInfo(filterLegId, filterApplicationSessionId, filterConnectionId, filterProduct, filterFrom, filterTo, filterFailed, filterType, filterName, filterOccurredAtGt, filterOccurredAtGte, filterOccurredAtLt, filterOccurredAtLte, filterOccurredAtEq, pageNumber, pageSize);
    }
  }

  /**
   * List call events
   * Filters call events by given filter parameters. Events are ordered by &#x60;occurred_at&#x60;. If filter for &#x60;leg_id&#x60; or &#x60;application_session_id&#x60; is not present, it only filters events from the last 24 hours.  **Note**: Only one &#x60;filter[occurred_at]&#x60; can be passed. 
   * @return listCallEventsRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIlistCallEventsRequest listCallEvents() throws ApiException {
    return new APIlistCallEventsRequest();
  }
}
