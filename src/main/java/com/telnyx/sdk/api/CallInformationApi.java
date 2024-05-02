package com.telnyx.sdk.api;

import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.Pair;

import jakarta.ws.rs.core.GenericType;

import com.telnyx.sdk.model.ActiveCallsResponse;
import com.telnyx.sdk.model.Errors;
import com.telnyx.sdk.model.RetrieveCallStatusResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class CallInformationApi {
  private ApiClient apiClient;

  public CallInformationApi() {
    this(Configuration.getDefaultApiClient());
  }

  public CallInformationApi(ApiClient apiClient) {
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


private ApiResponse<ActiveCallsResponse> listConnectionActiveCallsWithHttpInfo(String connectionId, Integer pageLimit, String pageAfter, String pageBefore) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'connectionId' is set
    if (connectionId == null) {
      throw new ApiException(400, "Missing the required parameter 'connectionId' when calling listConnectionActiveCalls");
    }
    
    // create path and map variables
    String localVarPath = "/connections/{connection_id}/active_calls"
      .replaceAll("\\{" + "connection_id" + "\\}", apiClient.escapeString(connectionId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[limit]", pageLimit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[after]", pageAfter));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[before]", pageBefore));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    GenericType<ActiveCallsResponse> localVarReturnType = new GenericType<ActiveCallsResponse>() {};

    return apiClient.invokeAPI("CallInformationApi.listConnectionActiveCalls", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIlistConnectionActiveCallsRequest {
    private String connectionId;
    private Integer pageLimit;
    private String pageAfter;
    private String pageBefore;

    private APIlistConnectionActiveCallsRequest(String connectionId) {
      this.connectionId = connectionId;
    }

    /**
     * Set pageLimit
     * @param pageLimit Limit of records per single page (optional, default to 20)
     * @return APIlistConnectionActiveCallsRequest
     */
    public APIlistConnectionActiveCallsRequest pageLimit(Integer pageLimit) {
      this.pageLimit = pageLimit;
      return this;
    }

    /**
     * Set pageAfter
     * @param pageAfter Opaque identifier of next page (optional, default to null)
     * @return APIlistConnectionActiveCallsRequest
     */
    public APIlistConnectionActiveCallsRequest pageAfter(String pageAfter) {
      this.pageAfter = pageAfter;
      return this;
    }

    /**
     * Set pageBefore
     * @param pageBefore Opaque identifier of previous page (optional, default to null)
     * @return APIlistConnectionActiveCallsRequest
     */
    public APIlistConnectionActiveCallsRequest pageBefore(String pageBefore) {
      this.pageBefore = pageBefore;
      return this;
    }

    /**
     * Execute listConnectionActiveCalls request
     * @return ActiveCallsResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response with list of details about active calls. </td><td>  -  </td></tr>
         <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ActiveCallsResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute listConnectionActiveCalls request with HTTP info returned
     * @return ApiResponse&lt;ActiveCallsResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response with list of details about active calls. </td><td>  -  </td></tr>
         <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<ActiveCallsResponse> executeWithHttpInfo() throws ApiException {
      return listConnectionActiveCallsWithHttpInfo(connectionId, pageLimit, pageAfter, pageBefore);
    }
  }

  /**
   * List all active calls for given connection
   * Lists all active calls for given connection. Acceptable connections are either SIP connections with webhook_url or xml_request_url, call control or texml. Returned results are cursor paginated. 
   * @param connectionId Uniquely identifies a Telnyx application (Call Control, TeXML) or Sip connection resource. (required)
   * @return listConnectionActiveCallsRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIlistConnectionActiveCallsRequest listConnectionActiveCalls(String connectionId) throws ApiException {
    return new APIlistConnectionActiveCallsRequest(connectionId);
  }
  /**
   * Retrieve a call status
   * Returns the status of a call (data is available 10 minutes after call ended).
   * @param callControlId Unique identifier and token for controlling the call (required)
   * @return RetrieveCallStatusResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response with details about a call status. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public RetrieveCallStatusResponse retrieveCallStatus(String callControlId) throws ApiException {
    return retrieveCallStatusWithHttpInfo(callControlId).getData();
  }

  /**
   * Retrieve a call status
   * Returns the status of a call (data is available 10 minutes after call ended).
   * @param callControlId Unique identifier and token for controlling the call (required)
   * @return ApiResponse&lt;RetrieveCallStatusResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response with details about a call status. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<RetrieveCallStatusResponse> retrieveCallStatusWithHttpInfo(String callControlId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'callControlId' is set
    if (callControlId == null) {
      throw new ApiException(400, "Missing the required parameter 'callControlId' when calling retrieveCallStatus");
    }
    
    // create path and map variables
    String localVarPath = "/calls/{call_control_id}"
      .replaceAll("\\{" + "call_control_id" + "\\}", apiClient.escapeString(callControlId.toString()));

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

    GenericType<RetrieveCallStatusResponse> localVarReturnType = new GenericType<RetrieveCallStatusResponse>() {};

    return apiClient.invokeAPI("CallInformationApi.retrieveCallStatus", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
