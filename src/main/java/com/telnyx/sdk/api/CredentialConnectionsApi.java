package com.telnyx.sdk.api;

import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.Pair;

import jakarta.ws.rs.core.GenericType;

import com.telnyx.sdk.model.CreateCredentialConnectionRequest;
import com.telnyx.sdk.model.CredentialConnectionResponse;
import com.telnyx.sdk.model.ErrorResponse;
import com.telnyx.sdk.model.ListCredentialConnectionsResponse;
import com.telnyx.sdk.model.RegistrationStatusResponse;
import com.telnyx.sdk.model.ResourceNotFound;
import com.telnyx.sdk.model.UpdateCredentialConnectionRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class CredentialConnectionsApi {
  private ApiClient apiClient;

  public CredentialConnectionsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public CredentialConnectionsApi(ApiClient apiClient) {
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
   * Update a credential connection registration status
   * Updates the registration_status for a credential connection, this endpoint also updates the &#x60;registration_status&#x60; and &#x60;registration_status_updated_at&#x60; fields in the credential connection
   * @param id Identifies the resource. (required)
   * @return RegistrationStatusResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response with details about a credential connection registration status. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad request, the request was unacceptable, often due to missing a required parameter. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Unauthenticated response. Happens when the current user cannot be authenticated. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
     </table>
   */
  public RegistrationStatusResponse checkRegistrationStatus(String id) throws ApiException {
    return checkRegistrationStatusWithHttpInfo(id).getData();
  }

  /**
   * Update a credential connection registration status
   * Updates the registration_status for a credential connection, this endpoint also updates the &#x60;registration_status&#x60; and &#x60;registration_status_updated_at&#x60; fields in the credential connection
   * @param id Identifies the resource. (required)
   * @return ApiResponse&lt;RegistrationStatusResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response with details about a credential connection registration status. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad request, the request was unacceptable, often due to missing a required parameter. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Unauthenticated response. Happens when the current user cannot be authenticated. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<RegistrationStatusResponse> checkRegistrationStatusWithHttpInfo(String id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling checkRegistrationStatus");
    }
    
    // create path and map variables
    String localVarPath = "/credential_connections/{id}/actions/check_registration_status"
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

    GenericType<RegistrationStatusResponse> localVarReturnType = new GenericType<RegistrationStatusResponse>() {};

    return apiClient.invokeAPI("CredentialConnectionsApi.checkRegistrationStatus", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Create a credential connection
   * Creates a credential connection.
   * @param createCredentialConnectionRequest Parameters that can be defined during credential connection creation (required)
   * @return CredentialConnectionResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Successful response with details about a credential connection. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Unauthenticated response. Happens when the current user cannot be authenticated. </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity </td><td>  -  </td></tr>
     </table>
   */
  public CredentialConnectionResponse createCredentialConnection(CreateCredentialConnectionRequest createCredentialConnectionRequest) throws ApiException {
    return createCredentialConnectionWithHttpInfo(createCredentialConnectionRequest).getData();
  }

  /**
   * Create a credential connection
   * Creates a credential connection.
   * @param createCredentialConnectionRequest Parameters that can be defined during credential connection creation (required)
   * @return ApiResponse&lt;CredentialConnectionResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Successful response with details about a credential connection. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Unauthenticated response. Happens when the current user cannot be authenticated. </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CredentialConnectionResponse> createCredentialConnectionWithHttpInfo(CreateCredentialConnectionRequest createCredentialConnectionRequest) throws ApiException {
    Object localVarPostBody = createCredentialConnectionRequest;
    
    // verify the required parameter 'createCredentialConnectionRequest' is set
    if (createCredentialConnectionRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'createCredentialConnectionRequest' when calling createCredentialConnection");
    }
    
    // create path and map variables
    String localVarPath = "/credential_connections";

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

    GenericType<CredentialConnectionResponse> localVarReturnType = new GenericType<CredentialConnectionResponse>() {};

    return apiClient.invokeAPI("CredentialConnectionsApi.createCredentialConnection", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Delete a credential connection
   * Deletes an existing credential connection.
   * @param id Identifies the resource. (required)
   * @return CredentialConnectionResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response with details about a credential connection. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad request, the request was unacceptable, often due to missing a required parameter. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Unauthenticated response. Happens when the current user cannot be authenticated. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
     </table>
   */
  public CredentialConnectionResponse deleteCredentialConnection(String id) throws ApiException {
    return deleteCredentialConnectionWithHttpInfo(id).getData();
  }

  /**
   * Delete a credential connection
   * Deletes an existing credential connection.
   * @param id Identifies the resource. (required)
   * @return ApiResponse&lt;CredentialConnectionResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response with details about a credential connection. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad request, the request was unacceptable, often due to missing a required parameter. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Unauthenticated response. Happens when the current user cannot be authenticated. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CredentialConnectionResponse> deleteCredentialConnectionWithHttpInfo(String id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling deleteCredentialConnection");
    }
    
    // create path and map variables
    String localVarPath = "/credential_connections/{id}"
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

    GenericType<CredentialConnectionResponse> localVarReturnType = new GenericType<CredentialConnectionResponse>() {};

    return apiClient.invokeAPI("CredentialConnectionsApi.deleteCredentialConnection", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

private ApiResponse<ListCredentialConnectionsResponse> listCredentialConnectionsWithHttpInfo(Integer pageNumber, Integer pageSize, String filterConnectionNameContains, String filterOutboundOutboundVoiceProfileId, String sort) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/credential_connections";

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

    GenericType<ListCredentialConnectionsResponse> localVarReturnType = new GenericType<ListCredentialConnectionsResponse>() {};

    return apiClient.invokeAPI("CredentialConnectionsApi.listCredentialConnections", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIlistCredentialConnectionsRequest {
    private Integer pageNumber;
    private Integer pageSize;
    private String filterConnectionNameContains;
    private String filterOutboundOutboundVoiceProfileId;
    private String sort;

    private APIlistCredentialConnectionsRequest() {
    }

    /**
     * Set pageNumber
     * @param pageNumber The page number to load (optional, default to 1)
     * @return APIlistCredentialConnectionsRequest
     */
    public APIlistCredentialConnectionsRequest pageNumber(Integer pageNumber) {
      this.pageNumber = pageNumber;
      return this;
    }

    /**
     * Set pageSize
     * @param pageSize The size of the page (optional, default to 20)
     * @return APIlistCredentialConnectionsRequest
     */
    public APIlistCredentialConnectionsRequest pageSize(Integer pageSize) {
      this.pageSize = pageSize;
      return this;
    }

    /**
     * Set filterConnectionNameContains
     * @param filterConnectionNameContains If present, connections with &lt;code&gt;connection_name&lt;/code&gt; containing the given value will be returned. Matching is not case-sensitive. Requires at least three characters. (optional)
     * @return APIlistCredentialConnectionsRequest
     */
    public APIlistCredentialConnectionsRequest filterConnectionNameContains(String filterConnectionNameContains) {
      this.filterConnectionNameContains = filterConnectionNameContains;
      return this;
    }

    /**
     * Set filterOutboundOutboundVoiceProfileId
     * @param filterOutboundOutboundVoiceProfileId Identifies the associated outbound voice profile. (optional)
     * @return APIlistCredentialConnectionsRequest
     */
    public APIlistCredentialConnectionsRequest filterOutboundOutboundVoiceProfileId(String filterOutboundOutboundVoiceProfileId) {
      this.filterOutboundOutboundVoiceProfileId = filterOutboundOutboundVoiceProfileId;
      return this;
    }

    /**
     * Set sort
     * @param sort Specifies the sort order for results. By default sorting direction is ascending. To have the results sorted in descending order add the &lt;code&gt; -&lt;/code&gt; prefix.&lt;br/&gt;&lt;br/&gt; That is: &lt;ul&gt;   &lt;li&gt;     &lt;code&gt;connection_name&lt;/code&gt;: sorts the result by the     &lt;code&gt;connection_name&lt;/code&gt; field in ascending order.   &lt;/li&gt;    &lt;li&gt;     &lt;code&gt;-connection_name&lt;/code&gt;: sorts the result by the     &lt;code&gt;connection_name&lt;/code&gt; field in descending order.   &lt;/li&gt; &lt;/ul&gt; &lt;br/&gt; If not given, results are sorted by &lt;code&gt;created_at&lt;/code&gt; in descending order. (optional, default to created_at)
     * @return APIlistCredentialConnectionsRequest
     */
    public APIlistCredentialConnectionsRequest sort(String sort) {
      this.sort = sort;
      return this;
    }

    /**
     * Execute listCredentialConnections request
     * @return ListCredentialConnectionsResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response with a list of credential connections. </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad request, the request was unacceptable, often due to missing a required parameter. </td><td>  -  </td></tr>
         <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Unauthenticated response. Happens when the current user cannot be authenticated. </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ListCredentialConnectionsResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute listCredentialConnections request with HTTP info returned
     * @return ApiResponse&lt;ListCredentialConnectionsResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response with a list of credential connections. </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad request, the request was unacceptable, often due to missing a required parameter. </td><td>  -  </td></tr>
         <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Unauthenticated response. Happens when the current user cannot be authenticated. </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<ListCredentialConnectionsResponse> executeWithHttpInfo() throws ApiException {
      return listCredentialConnectionsWithHttpInfo(pageNumber, pageSize, filterConnectionNameContains, filterOutboundOutboundVoiceProfileId, sort);
    }
  }

  /**
   * List credential connections
   * Returns a list of your credential connections.
   * @return listCredentialConnectionsRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIlistCredentialConnectionsRequest listCredentialConnections() throws ApiException {
    return new APIlistCredentialConnectionsRequest();
  }
  /**
   * Retrieve a credential connection
   * Retrieves the details of an existing credential connection.
   * @param id Identifies the resource. (required)
   * @return CredentialConnectionResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response with details about a credential connection. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad request, the request was unacceptable, often due to missing a required parameter. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Unauthenticated response. Happens when the current user cannot be authenticated. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
     </table>
   */
  public CredentialConnectionResponse retrieveCredentialConnection(String id) throws ApiException {
    return retrieveCredentialConnectionWithHttpInfo(id).getData();
  }

  /**
   * Retrieve a credential connection
   * Retrieves the details of an existing credential connection.
   * @param id Identifies the resource. (required)
   * @return ApiResponse&lt;CredentialConnectionResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response with details about a credential connection. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad request, the request was unacceptable, often due to missing a required parameter. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Unauthenticated response. Happens when the current user cannot be authenticated. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CredentialConnectionResponse> retrieveCredentialConnectionWithHttpInfo(String id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling retrieveCredentialConnection");
    }
    
    // create path and map variables
    String localVarPath = "/credential_connections/{id}"
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

    GenericType<CredentialConnectionResponse> localVarReturnType = new GenericType<CredentialConnectionResponse>() {};

    return apiClient.invokeAPI("CredentialConnectionsApi.retrieveCredentialConnection", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Update a credential connection
   * Updates settings of an existing credential connection.
   * @param id Identifies the resource. (required)
   * @param updateCredentialConnectionRequest Parameters that can be updated in a credential connection (required)
   * @return CredentialConnectionResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response with details about a credential connection. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Unauthenticated response. Happens when the current user cannot be authenticated. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity </td><td>  -  </td></tr>
     </table>
   */
  public CredentialConnectionResponse updateCredentialConnection(String id, UpdateCredentialConnectionRequest updateCredentialConnectionRequest) throws ApiException {
    return updateCredentialConnectionWithHttpInfo(id, updateCredentialConnectionRequest).getData();
  }

  /**
   * Update a credential connection
   * Updates settings of an existing credential connection.
   * @param id Identifies the resource. (required)
   * @param updateCredentialConnectionRequest Parameters that can be updated in a credential connection (required)
   * @return ApiResponse&lt;CredentialConnectionResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response with details about a credential connection. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Unauthenticated response. Happens when the current user cannot be authenticated. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CredentialConnectionResponse> updateCredentialConnectionWithHttpInfo(String id, UpdateCredentialConnectionRequest updateCredentialConnectionRequest) throws ApiException {
    Object localVarPostBody = updateCredentialConnectionRequest;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling updateCredentialConnection");
    }
    
    // verify the required parameter 'updateCredentialConnectionRequest' is set
    if (updateCredentialConnectionRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'updateCredentialConnectionRequest' when calling updateCredentialConnection");
    }
    
    // create path and map variables
    String localVarPath = "/credential_connections/{id}"
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

    GenericType<CredentialConnectionResponse> localVarReturnType = new GenericType<CredentialConnectionResponse>() {};

    return apiClient.invokeAPI("CredentialConnectionsApi.updateCredentialConnection", localVarPath, "PATCH", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
