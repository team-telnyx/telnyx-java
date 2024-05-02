package com.telnyx.sdk.api;

import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.Pair;

import jakarta.ws.rs.core.GenericType;

import com.telnyx.sdk.model.CreateIpRequest;
import com.telnyx.sdk.model.ErrorResponse;
import com.telnyx.sdk.model.IpResponse;
import com.telnyx.sdk.model.ListIpsResponse;
import com.telnyx.sdk.model.ResourceNotFound;
import java.util.UUID;
import com.telnyx.sdk.model.UpdateIpRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class IpsApi {
  private ApiClient apiClient;

  public IpsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public IpsApi(ApiClient apiClient) {
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
   * Create an Ip
   * Create a new IP object.
   * @param createIpRequest  (optional)
   * @return IpResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Successful response with details about an IP. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Unauthenticated response. Happens when the current user cannot be authenticated. </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity </td><td>  -  </td></tr>
     </table>
   */
  public IpResponse createIp(CreateIpRequest createIpRequest) throws ApiException {
    return createIpWithHttpInfo(createIpRequest).getData();
  }

  /**
   * Create an Ip
   * Create a new IP object.
   * @param createIpRequest  (optional)
   * @return ApiResponse&lt;IpResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Successful response with details about an IP. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Unauthenticated response. Happens when the current user cannot be authenticated. </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<IpResponse> createIpWithHttpInfo(CreateIpRequest createIpRequest) throws ApiException {
    Object localVarPostBody = createIpRequest;
    
    // create path and map variables
    String localVarPath = "/ips";

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

    GenericType<IpResponse> localVarReturnType = new GenericType<IpResponse>() {};

    return apiClient.invokeAPI("IpsApi.createIp", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Delete an Ip
   * Delete an IP.
   * @param id Identifies the type of resource. (required)
   * @return IpResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response with details about an IP. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad request, the request was unacceptable, often due to missing a required parameter. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Unauthenticated response. Happens when the current user cannot be authenticated. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
     </table>
   */
  public IpResponse deleteIp(UUID id) throws ApiException {
    return deleteIpWithHttpInfo(id).getData();
  }

  /**
   * Delete an Ip
   * Delete an IP.
   * @param id Identifies the type of resource. (required)
   * @return ApiResponse&lt;IpResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response with details about an IP. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad request, the request was unacceptable, often due to missing a required parameter. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Unauthenticated response. Happens when the current user cannot be authenticated. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<IpResponse> deleteIpWithHttpInfo(UUID id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling deleteIp");
    }
    
    // create path and map variables
    String localVarPath = "/ips/{id}"
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

    GenericType<IpResponse> localVarReturnType = new GenericType<IpResponse>() {};

    return apiClient.invokeAPI("IpsApi.deleteIp", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

private ApiResponse<ListIpsResponse> listIpsWithHttpInfo(Integer pageNumber, Integer pageSize, String filterConnectionId, String filterIpAddress, Integer filterPort) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/ips";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[number]", pageNumber));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[connection_id]", filterConnectionId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[ip_address]", filterIpAddress));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[port]", filterPort));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    GenericType<ListIpsResponse> localVarReturnType = new GenericType<ListIpsResponse>() {};

    return apiClient.invokeAPI("IpsApi.listIps", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIlistIpsRequest {
    private Integer pageNumber;
    private Integer pageSize;
    private String filterConnectionId;
    private String filterIpAddress;
    private Integer filterPort;

    private APIlistIpsRequest() {
    }

    /**
     * Set pageNumber
     * @param pageNumber The page number to load (optional, default to 1)
     * @return APIlistIpsRequest
     */
    public APIlistIpsRequest pageNumber(Integer pageNumber) {
      this.pageNumber = pageNumber;
      return this;
    }

    /**
     * Set pageSize
     * @param pageSize The size of the page (optional, default to 20)
     * @return APIlistIpsRequest
     */
    public APIlistIpsRequest pageSize(Integer pageSize) {
      this.pageSize = pageSize;
      return this;
    }

    /**
     * Set filterConnectionId
     * @param filterConnectionId ID of the IP Connection to which this IP should be attached. (optional)
     * @return APIlistIpsRequest
     */
    public APIlistIpsRequest filterConnectionId(String filterConnectionId) {
      this.filterConnectionId = filterConnectionId;
      return this;
    }

    /**
     * Set filterIpAddress
     * @param filterIpAddress IP adddress represented by this resource. (optional)
     * @return APIlistIpsRequest
     */
    public APIlistIpsRequest filterIpAddress(String filterIpAddress) {
      this.filterIpAddress = filterIpAddress;
      return this;
    }

    /**
     * Set filterPort
     * @param filterPort Port to use when connecting to this IP. (optional)
     * @return APIlistIpsRequest
     */
    public APIlistIpsRequest filterPort(Integer filterPort) {
      this.filterPort = filterPort;
      return this;
    }

    /**
     * Execute listIps request
     * @return ListIpsResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response with a list of IPs. </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad request, the request was unacceptable, often due to missing a required parameter. </td><td>  -  </td></tr>
         <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Unauthenticated response. Happens when the current user cannot be authenticated. </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ListIpsResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute listIps request with HTTP info returned
     * @return ApiResponse&lt;ListIpsResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response with a list of IPs. </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad request, the request was unacceptable, often due to missing a required parameter. </td><td>  -  </td></tr>
         <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Unauthenticated response. Happens when the current user cannot be authenticated. </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<ListIpsResponse> executeWithHttpInfo() throws ApiException {
      return listIpsWithHttpInfo(pageNumber, pageSize, filterConnectionId, filterIpAddress, filterPort);
    }
  }

  /**
   * List Ips
   * Get all IPs belonging to the user that match the given filters.
   * @return listIpsRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIlistIpsRequest listIps() throws ApiException {
    return new APIlistIpsRequest();
  }
  /**
   * Retrieve an Ip
   * Return the details regarding a specific IP.
   * @param id Identifies the type of resource. (required)
   * @return IpResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response with details about an IP. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad request, the request was unacceptable, often due to missing a required parameter. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Unauthenticated response. Happens when the current user cannot be authenticated. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
     </table>
   */
  public IpResponse retrieveIp(UUID id) throws ApiException {
    return retrieveIpWithHttpInfo(id).getData();
  }

  /**
   * Retrieve an Ip
   * Return the details regarding a specific IP.
   * @param id Identifies the type of resource. (required)
   * @return ApiResponse&lt;IpResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response with details about an IP. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad request, the request was unacceptable, often due to missing a required parameter. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Unauthenticated response. Happens when the current user cannot be authenticated. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<IpResponse> retrieveIpWithHttpInfo(UUID id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling retrieveIp");
    }
    
    // create path and map variables
    String localVarPath = "/ips/{id}"
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

    GenericType<IpResponse> localVarReturnType = new GenericType<IpResponse>() {};

    return apiClient.invokeAPI("IpsApi.retrieveIp", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Update an Ip
   * Update the details of a specific IP.
   * @param id Identifies the type of resource. (required)
   * @param updateIpRequest  (optional)
   * @return IpResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response with details about an IP. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Unauthenticated response. Happens when the current user cannot be authenticated. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity </td><td>  -  </td></tr>
     </table>
   */
  public IpResponse updateIp(UUID id, UpdateIpRequest updateIpRequest) throws ApiException {
    return updateIpWithHttpInfo(id, updateIpRequest).getData();
  }

  /**
   * Update an Ip
   * Update the details of a specific IP.
   * @param id Identifies the type of resource. (required)
   * @param updateIpRequest  (optional)
   * @return ApiResponse&lt;IpResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response with details about an IP. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Unauthenticated response. Happens when the current user cannot be authenticated. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<IpResponse> updateIpWithHttpInfo(UUID id, UpdateIpRequest updateIpRequest) throws ApiException {
    Object localVarPostBody = updateIpRequest;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling updateIp");
    }
    
    // create path and map variables
    String localVarPath = "/ips/{id}"
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

    GenericType<IpResponse> localVarReturnType = new GenericType<IpResponse>() {};

    return apiClient.invokeAPI("IpsApi.updateIp", localVarPath, "PATCH", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
