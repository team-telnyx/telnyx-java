package com.telnyx.sdk.api;

import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.Pair;

import jakarta.ws.rs.core.GenericType;

import com.telnyx.sdk.model.ConnectionResponse;
import com.telnyx.sdk.model.ErrorResponse;
import com.telnyx.sdk.model.ListConnectionsResponse;
import com.telnyx.sdk.model.ResourceNotFound;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class ConnectionsApi {
  private ApiClient apiClient;

  public ConnectionsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ConnectionsApi(ApiClient apiClient) {
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


private ApiResponse<ListConnectionsResponse> listConnectionsWithHttpInfo(Integer pageNumber, Integer pageSize, String filterConnectionNameContains, String filterOutboundOutboundVoiceProfileId, String sort) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/connections";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[number]", pageNumber));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[connection_name][contains]", filterConnectionNameContains));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[outbound.outbound_voice_profile_id]", filterOutboundOutboundVoiceProfileId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort", sort));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    GenericType<ListConnectionsResponse> localVarReturnType = new GenericType<ListConnectionsResponse>() {};

    return apiClient.invokeAPI("ConnectionsApi.listConnections", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIlistConnectionsRequest {
    private Integer pageNumber;
    private Integer pageSize;
    private String filterConnectionNameContains;
    private String filterOutboundOutboundVoiceProfileId;
    private String sort;

    private APIlistConnectionsRequest() {
    }

    /**
     * Set pageNumber
     * @param pageNumber The page number to load (optional, default to 1)
     * @return APIlistConnectionsRequest
     */
    public APIlistConnectionsRequest pageNumber(Integer pageNumber) {
      this.pageNumber = pageNumber;
      return this;
    }

    /**
     * Set pageSize
     * @param pageSize The size of the page (optional, default to 20)
     * @return APIlistConnectionsRequest
     */
    public APIlistConnectionsRequest pageSize(Integer pageSize) {
      this.pageSize = pageSize;
      return this;
    }

    /**
     * Set filterConnectionNameContains
     * @param filterConnectionNameContains If present, connections with &lt;code&gt;connection_name&lt;/code&gt; containing the given value will be returned. Matching is not case-sensitive. Requires at least three characters. (optional)
     * @return APIlistConnectionsRequest
     */
    public APIlistConnectionsRequest filterConnectionNameContains(String filterConnectionNameContains) {
      this.filterConnectionNameContains = filterConnectionNameContains;
      return this;
    }

    /**
     * Set filterOutboundOutboundVoiceProfileId
     * @param filterOutboundOutboundVoiceProfileId Identifies the associated outbound voice profile. (optional)
     * @return APIlistConnectionsRequest
     */
    public APIlistConnectionsRequest filterOutboundOutboundVoiceProfileId(String filterOutboundOutboundVoiceProfileId) {
      this.filterOutboundOutboundVoiceProfileId = filterOutboundOutboundVoiceProfileId;
      return this;
    }

    /**
     * Set sort
     * @param sort Specifies the sort order for results. By default sorting direction is ascending. To have the results sorted in descending order add the &lt;code&gt; -&lt;/code&gt; prefix.&lt;br/&gt;&lt;br/&gt; That is: &lt;ul&gt;   &lt;li&gt;     &lt;code&gt;connection_name&lt;/code&gt;: sorts the result by the     &lt;code&gt;connection_name&lt;/code&gt; field in ascending order.   &lt;/li&gt;    &lt;li&gt;     &lt;code&gt;-connection_name&lt;/code&gt;: sorts the result by the     &lt;code&gt;connection_name&lt;/code&gt; field in descending order.   &lt;/li&gt; &lt;/ul&gt; &lt;br/&gt; If not given, results are sorted by &lt;code&gt;created_at&lt;/code&gt; in descending order. (optional, default to created_at)
     * @return APIlistConnectionsRequest
     */
    public APIlistConnectionsRequest sort(String sort) {
      this.sort = sort;
      return this;
    }

    /**
     * Execute listConnections request
     * @return ListConnectionsResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response with a list of connections. </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad request, the request was unacceptable, often due to missing a required parameter. </td><td>  -  </td></tr>
         <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Unauthenticated response. Happens when the current user cannot be authenticated. </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ListConnectionsResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute listConnections request with HTTP info returned
     * @return ApiResponse&lt;ListConnectionsResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response with a list of connections. </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad request, the request was unacceptable, often due to missing a required parameter. </td><td>  -  </td></tr>
         <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Unauthenticated response. Happens when the current user cannot be authenticated. </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<ListConnectionsResponse> executeWithHttpInfo() throws ApiException {
      return listConnectionsWithHttpInfo(pageNumber, pageSize, filterConnectionNameContains, filterOutboundOutboundVoiceProfileId, sort);
    }
  }

  /**
   * List connections
   * Returns a list of your connections irrespective of type.
   * @return listConnectionsRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIlistConnectionsRequest listConnections() throws ApiException {
    return new APIlistConnectionsRequest();
  }
  /**
   * Retrieve a connection
   * Retrieves the high-level details of an existing connection. To retrieve specific authentication information, use the endpoint for the specific connection type.
   * @param id IP Connection ID (required)
   * @return ConnectionResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response with details about a connection. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad request, the request was unacceptable, often due to missing a required parameter. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Unauthenticated response. Happens when the current user cannot be authenticated. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
     </table>
   */
  public ConnectionResponse retrieveConnection(String id) throws ApiException {
    return retrieveConnectionWithHttpInfo(id).getData();
  }

  /**
   * Retrieve a connection
   * Retrieves the high-level details of an existing connection. To retrieve specific authentication information, use the endpoint for the specific connection type.
   * @param id IP Connection ID (required)
   * @return ApiResponse&lt;ConnectionResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response with details about a connection. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad request, the request was unacceptable, often due to missing a required parameter. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Unauthenticated response. Happens when the current user cannot be authenticated. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ConnectionResponse> retrieveConnectionWithHttpInfo(String id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling retrieveConnection");
    }
    
    // create path and map variables
    String localVarPath = "/connections/{id}"
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

    GenericType<ConnectionResponse> localVarReturnType = new GenericType<ConnectionResponse>() {};

    return apiClient.invokeAPI("ConnectionsApi.retrieveConnection", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
