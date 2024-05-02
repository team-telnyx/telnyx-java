package com.telnyx.sdk.api;

import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.Pair;

import jakarta.ws.rs.core.GenericType;

import com.telnyx.sdk.model.CreateFqdnConnectionRequest;
import com.telnyx.sdk.model.ErrorResponse;
import com.telnyx.sdk.model.FQDNConnectionResponse;
import com.telnyx.sdk.model.ListFQDNConnectionsResponse;
import com.telnyx.sdk.model.ResourceNotFound;
import com.telnyx.sdk.model.UpdateFqdnConnectionRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class FqdnConnectionsApi {
  private ApiClient apiClient;

  public FqdnConnectionsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public FqdnConnectionsApi(ApiClient apiClient) {
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
   * Create an FQDN connection
   * Creates a FQDN connection.
   * @param createFqdnConnectionRequest Parameters that can be defined during FQDN connection creation (required)
   * @return FQDNConnectionResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Successful response with details about an FQDN connection. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Unauthenticated response. Happens when the current user cannot be authenticated. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity </td><td>  -  </td></tr>
     </table>
   */
  public FQDNConnectionResponse createFqdnConnection(CreateFqdnConnectionRequest createFqdnConnectionRequest) throws ApiException {
    return createFqdnConnectionWithHttpInfo(createFqdnConnectionRequest).getData();
  }

  /**
   * Create an FQDN connection
   * Creates a FQDN connection.
   * @param createFqdnConnectionRequest Parameters that can be defined during FQDN connection creation (required)
   * @return ApiResponse&lt;FQDNConnectionResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Successful response with details about an FQDN connection. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Unauthenticated response. Happens when the current user cannot be authenticated. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<FQDNConnectionResponse> createFqdnConnectionWithHttpInfo(CreateFqdnConnectionRequest createFqdnConnectionRequest) throws ApiException {
    Object localVarPostBody = createFqdnConnectionRequest;
    
    // verify the required parameter 'createFqdnConnectionRequest' is set
    if (createFqdnConnectionRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'createFqdnConnectionRequest' when calling createFqdnConnection");
    }
    
    // create path and map variables
    String localVarPath = "/fqdn_connections";

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

    GenericType<FQDNConnectionResponse> localVarReturnType = new GenericType<FQDNConnectionResponse>() {};

    return apiClient.invokeAPI("FqdnConnectionsApi.createFqdnConnection", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Delete an FQDN connection
   * Deletes an FQDN connection.
   * @param id Identifies the resource. (required)
   * @return FQDNConnectionResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response with details about an FQDN connection. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Unauthenticated response. Happens when the current user cannot be authenticated. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity </td><td>  -  </td></tr>
     </table>
   */
  public FQDNConnectionResponse deleteFqdnConnection(String id) throws ApiException {
    return deleteFqdnConnectionWithHttpInfo(id).getData();
  }

  /**
   * Delete an FQDN connection
   * Deletes an FQDN connection.
   * @param id Identifies the resource. (required)
   * @return ApiResponse&lt;FQDNConnectionResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response with details about an FQDN connection. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Unauthenticated response. Happens when the current user cannot be authenticated. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<FQDNConnectionResponse> deleteFqdnConnectionWithHttpInfo(String id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling deleteFqdnConnection");
    }
    
    // create path and map variables
    String localVarPath = "/fqdn_connections/{id}"
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

    GenericType<FQDNConnectionResponse> localVarReturnType = new GenericType<FQDNConnectionResponse>() {};

    return apiClient.invokeAPI("FqdnConnectionsApi.deleteFqdnConnection", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

private ApiResponse<ListFQDNConnectionsResponse> listFqdnConnectionsWithHttpInfo(Integer pageNumber, Integer pageSize, String filterConnectionNameContains, String filterFqdn, String filterOutboundOutboundVoiceProfileId, String sort) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/fqdn_connections";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[number]", pageNumber));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[connection_name][contains]", filterConnectionNameContains));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[fqdn]", filterFqdn));
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

    GenericType<ListFQDNConnectionsResponse> localVarReturnType = new GenericType<ListFQDNConnectionsResponse>() {};

    return apiClient.invokeAPI("FqdnConnectionsApi.listFqdnConnections", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIlistFqdnConnectionsRequest {
    private Integer pageNumber;
    private Integer pageSize;
    private String filterConnectionNameContains;
    private String filterFqdn;
    private String filterOutboundOutboundVoiceProfileId;
    private String sort;

    private APIlistFqdnConnectionsRequest() {
    }

    /**
     * Set pageNumber
     * @param pageNumber The page number to load (optional, default to 1)
     * @return APIlistFqdnConnectionsRequest
     */
    public APIlistFqdnConnectionsRequest pageNumber(Integer pageNumber) {
      this.pageNumber = pageNumber;
      return this;
    }

    /**
     * Set pageSize
     * @param pageSize The size of the page (optional, default to 20)
     * @return APIlistFqdnConnectionsRequest
     */
    public APIlistFqdnConnectionsRequest pageSize(Integer pageSize) {
      this.pageSize = pageSize;
      return this;
    }

    /**
     * Set filterConnectionNameContains
     * @param filterConnectionNameContains If present, connections with &lt;code&gt;connection_name&lt;/code&gt; containing the given value will be returned. Matching is not case-sensitive. Requires at least three characters. (optional)
     * @return APIlistFqdnConnectionsRequest
     */
    public APIlistFqdnConnectionsRequest filterConnectionNameContains(String filterConnectionNameContains) {
      this.filterConnectionNameContains = filterConnectionNameContains;
      return this;
    }

    /**
     * Set filterFqdn
     * @param filterFqdn If present, connections with an &#x60;fqdn&#x60; that equals the given value will be returned. Matching is case-sensitive, and the full string must match. (optional)
     * @return APIlistFqdnConnectionsRequest
     */
    public APIlistFqdnConnectionsRequest filterFqdn(String filterFqdn) {
      this.filterFqdn = filterFqdn;
      return this;
    }

    /**
     * Set filterOutboundOutboundVoiceProfileId
     * @param filterOutboundOutboundVoiceProfileId Identifies the associated outbound voice profile. (optional)
     * @return APIlistFqdnConnectionsRequest
     */
    public APIlistFqdnConnectionsRequest filterOutboundOutboundVoiceProfileId(String filterOutboundOutboundVoiceProfileId) {
      this.filterOutboundOutboundVoiceProfileId = filterOutboundOutboundVoiceProfileId;
      return this;
    }

    /**
     * Set sort
     * @param sort Specifies the sort order for results. By default sorting direction is ascending. To have the results sorted in descending order add the &lt;code&gt; -&lt;/code&gt; prefix.&lt;br/&gt;&lt;br/&gt; That is: &lt;ul&gt;   &lt;li&gt;     &lt;code&gt;connection_name&lt;/code&gt;: sorts the result by the     &lt;code&gt;connection_name&lt;/code&gt; field in ascending order.   &lt;/li&gt;    &lt;li&gt;     &lt;code&gt;-connection_name&lt;/code&gt;: sorts the result by the     &lt;code&gt;connection_name&lt;/code&gt; field in descending order.   &lt;/li&gt; &lt;/ul&gt; &lt;br/&gt; If not given, results are sorted by &lt;code&gt;created_at&lt;/code&gt; in descending order. (optional, default to created_at)
     * @return APIlistFqdnConnectionsRequest
     */
    public APIlistFqdnConnectionsRequest sort(String sort) {
      this.sort = sort;
      return this;
    }

    /**
     * Execute listFqdnConnections request
     * @return ListFQDNConnectionsResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response with a list of FQDN connections. </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad request, the request was unacceptable, often due to missing a required parameter. </td><td>  -  </td></tr>
         <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Unauthenticated response. Happens when the current user cannot be authenticated. </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ListFQDNConnectionsResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute listFqdnConnections request with HTTP info returned
     * @return ApiResponse&lt;ListFQDNConnectionsResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response with a list of FQDN connections. </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad request, the request was unacceptable, often due to missing a required parameter. </td><td>  -  </td></tr>
         <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Unauthenticated response. Happens when the current user cannot be authenticated. </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<ListFQDNConnectionsResponse> executeWithHttpInfo() throws ApiException {
      return listFqdnConnectionsWithHttpInfo(pageNumber, pageSize, filterConnectionNameContains, filterFqdn, filterOutboundOutboundVoiceProfileId, sort);
    }
  }

  /**
   * List FQDN connections
   * Returns a list of your FQDN connections.
   * @return listFqdnConnectionsRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIlistFqdnConnectionsRequest listFqdnConnections() throws ApiException {
    return new APIlistFqdnConnectionsRequest();
  }
  /**
   * Retrieve an FQDN connection
   * Retrieves the details of an existing FQDN connection.
   * @param id Identifies the resource. (required)
   * @return FQDNConnectionResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response with details about an FQDN connection. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Unauthenticated response. Happens when the current user cannot be authenticated. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity </td><td>  -  </td></tr>
     </table>
   */
  public FQDNConnectionResponse retrieveFqdnConnection(String id) throws ApiException {
    return retrieveFqdnConnectionWithHttpInfo(id).getData();
  }

  /**
   * Retrieve an FQDN connection
   * Retrieves the details of an existing FQDN connection.
   * @param id Identifies the resource. (required)
   * @return ApiResponse&lt;FQDNConnectionResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response with details about an FQDN connection. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Unauthenticated response. Happens when the current user cannot be authenticated. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<FQDNConnectionResponse> retrieveFqdnConnectionWithHttpInfo(String id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling retrieveFqdnConnection");
    }
    
    // create path and map variables
    String localVarPath = "/fqdn_connections/{id}"
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

    GenericType<FQDNConnectionResponse> localVarReturnType = new GenericType<FQDNConnectionResponse>() {};

    return apiClient.invokeAPI("FqdnConnectionsApi.retrieveFqdnConnection", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Update an FQDN connection
   * Updates settings of an existing FQDN connection.
   * @param id Identifies the resource. (required)
   * @param updateFqdnConnectionRequest Parameters that can be updated in a FQDN connection (required)
   * @return FQDNConnectionResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response with details about an FQDN connection. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Unauthenticated response. Happens when the current user cannot be authenticated. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity </td><td>  -  </td></tr>
     </table>
   */
  public FQDNConnectionResponse updateFqdnConnection(String id, UpdateFqdnConnectionRequest updateFqdnConnectionRequest) throws ApiException {
    return updateFqdnConnectionWithHttpInfo(id, updateFqdnConnectionRequest).getData();
  }

  /**
   * Update an FQDN connection
   * Updates settings of an existing FQDN connection.
   * @param id Identifies the resource. (required)
   * @param updateFqdnConnectionRequest Parameters that can be updated in a FQDN connection (required)
   * @return ApiResponse&lt;FQDNConnectionResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response with details about an FQDN connection. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Unauthenticated response. Happens when the current user cannot be authenticated. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<FQDNConnectionResponse> updateFqdnConnectionWithHttpInfo(String id, UpdateFqdnConnectionRequest updateFqdnConnectionRequest) throws ApiException {
    Object localVarPostBody = updateFqdnConnectionRequest;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling updateFqdnConnection");
    }
    
    // verify the required parameter 'updateFqdnConnectionRequest' is set
    if (updateFqdnConnectionRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'updateFqdnConnectionRequest' when calling updateFqdnConnection");
    }
    
    // create path and map variables
    String localVarPath = "/fqdn_connections/{id}"
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

    GenericType<FQDNConnectionResponse> localVarReturnType = new GenericType<FQDNConnectionResponse>() {};

    return apiClient.invokeAPI("FqdnConnectionsApi.updateFqdnConnection", localVarPath, "PATCH", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
