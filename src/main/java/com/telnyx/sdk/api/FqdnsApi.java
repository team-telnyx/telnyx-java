package com.telnyx.sdk.api;

import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.Pair;

import jakarta.ws.rs.core.GenericType;

import com.telnyx.sdk.model.CreateFqdnRequest;
import com.telnyx.sdk.model.ErrorResponse;
import com.telnyx.sdk.model.FQDNResponse;
import com.telnyx.sdk.model.ListFQDNsResponse;
import com.telnyx.sdk.model.ResourceNotFound;
import com.telnyx.sdk.model.UpdateFqdnRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class FqdnsApi {
  private ApiClient apiClient;

  public FqdnsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public FqdnsApi(ApiClient apiClient) {
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
   * Create an FQDN
   * Create a new FQDN object.
   * @param createFqdnRequest  (optional)
   * @return FQDNResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Successful response with details about an FQDN connection. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Unauthenticated response. Happens when the current user cannot be authenticated. </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity </td><td>  -  </td></tr>
     </table>
   */
  public FQDNResponse createFqdn(CreateFqdnRequest createFqdnRequest) throws ApiException {
    return createFqdnWithHttpInfo(createFqdnRequest).getData();
  }

  /**
   * Create an FQDN
   * Create a new FQDN object.
   * @param createFqdnRequest  (optional)
   * @return ApiResponse&lt;FQDNResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Successful response with details about an FQDN connection. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Unauthenticated response. Happens when the current user cannot be authenticated. </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<FQDNResponse> createFqdnWithHttpInfo(CreateFqdnRequest createFqdnRequest) throws ApiException {
    Object localVarPostBody = createFqdnRequest;
    
    // create path and map variables
    String localVarPath = "/fqdns";

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

    GenericType<FQDNResponse> localVarReturnType = new GenericType<FQDNResponse>() {};

    return apiClient.invokeAPI("FqdnsApi.createFqdn", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Delete an FQDN
   * Delete an FQDN.
   * @param id Identifies the resource. (required)
   * @return FQDNResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response with details about an FQDN connection. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad request, the request was unacceptable, often due to missing a required parameter. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Unauthenticated response. Happens when the current user cannot be authenticated. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
     </table>
   */
  public FQDNResponse deleteFqdn(String id) throws ApiException {
    return deleteFqdnWithHttpInfo(id).getData();
  }

  /**
   * Delete an FQDN
   * Delete an FQDN.
   * @param id Identifies the resource. (required)
   * @return ApiResponse&lt;FQDNResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response with details about an FQDN connection. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad request, the request was unacceptable, often due to missing a required parameter. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Unauthenticated response. Happens when the current user cannot be authenticated. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<FQDNResponse> deleteFqdnWithHttpInfo(String id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling deleteFqdn");
    }
    
    // create path and map variables
    String localVarPath = "/fqdns/{id}"
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

    GenericType<FQDNResponse> localVarReturnType = new GenericType<FQDNResponse>() {};

    return apiClient.invokeAPI("FqdnsApi.deleteFqdn", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

private ApiResponse<ListFQDNsResponse> listFqdnsWithHttpInfo(Integer pageNumber, Integer pageSize, String filterConnectionId, String filterFqdn, Integer filterPort, String filterDnsRecordType) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/fqdns";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[number]", pageNumber));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[connection_id]", filterConnectionId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[fqdn]", filterFqdn));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[port]", filterPort));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[dns_record_type]", filterDnsRecordType));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    GenericType<ListFQDNsResponse> localVarReturnType = new GenericType<ListFQDNsResponse>() {};

    return apiClient.invokeAPI("FqdnsApi.listFqdns", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIlistFqdnsRequest {
    private Integer pageNumber;
    private Integer pageSize;
    private String filterConnectionId;
    private String filterFqdn;
    private Integer filterPort;
    private String filterDnsRecordType;

    private APIlistFqdnsRequest() {
    }

    /**
     * Set pageNumber
     * @param pageNumber The page number to load (optional, default to 1)
     * @return APIlistFqdnsRequest
     */
    public APIlistFqdnsRequest pageNumber(Integer pageNumber) {
      this.pageNumber = pageNumber;
      return this;
    }

    /**
     * Set pageSize
     * @param pageSize The size of the page (optional, default to 20)
     * @return APIlistFqdnsRequest
     */
    public APIlistFqdnsRequest pageSize(Integer pageSize) {
      this.pageSize = pageSize;
      return this;
    }

    /**
     * Set filterConnectionId
     * @param filterConnectionId ID of the FQDN connection to which the FQDN belongs. (optional)
     * @return APIlistFqdnsRequest
     */
    public APIlistFqdnsRequest filterConnectionId(String filterConnectionId) {
      this.filterConnectionId = filterConnectionId;
      return this;
    }

    /**
     * Set filterFqdn
     * @param filterFqdn FQDN represented by the resource. (optional)
     * @return APIlistFqdnsRequest
     */
    public APIlistFqdnsRequest filterFqdn(String filterFqdn) {
      this.filterFqdn = filterFqdn;
      return this;
    }

    /**
     * Set filterPort
     * @param filterPort Port to use when connecting to the FQDN. (optional)
     * @return APIlistFqdnsRequest
     */
    public APIlistFqdnsRequest filterPort(Integer filterPort) {
      this.filterPort = filterPort;
      return this;
    }

    /**
     * Set filterDnsRecordType
     * @param filterDnsRecordType DNS record type used by the FQDN. (optional)
     * @return APIlistFqdnsRequest
     */
    public APIlistFqdnsRequest filterDnsRecordType(String filterDnsRecordType) {
      this.filterDnsRecordType = filterDnsRecordType;
      return this;
    }

    /**
     * Execute listFqdns request
     * @return ListFQDNsResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response with a list of FQDN connections. </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad request, the request was unacceptable, often due to missing a required parameter. </td><td>  -  </td></tr>
         <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ListFQDNsResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute listFqdns request with HTTP info returned
     * @return ApiResponse&lt;ListFQDNsResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response with a list of FQDN connections. </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad request, the request was unacceptable, often due to missing a required parameter. </td><td>  -  </td></tr>
         <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<ListFQDNsResponse> executeWithHttpInfo() throws ApiException {
      return listFqdnsWithHttpInfo(pageNumber, pageSize, filterConnectionId, filterFqdn, filterPort, filterDnsRecordType);
    }
  }

  /**
   * List FQDNs
   * Get all FQDNs belonging to the user that match the given filters.
   * @return listFqdnsRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIlistFqdnsRequest listFqdns() throws ApiException {
    return new APIlistFqdnsRequest();
  }
  /**
   * Retrieve an FQDN
   * Return the details regarding a specific FQDN.
   * @param id Identifies the resource. (required)
   * @return FQDNResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response with details about an FQDN connection. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad request, the request was unacceptable, often due to missing a required parameter. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Unauthenticated response. Happens when the current user cannot be authenticated. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
     </table>
   */
  public FQDNResponse retrieveFqdn(String id) throws ApiException {
    return retrieveFqdnWithHttpInfo(id).getData();
  }

  /**
   * Retrieve an FQDN
   * Return the details regarding a specific FQDN.
   * @param id Identifies the resource. (required)
   * @return ApiResponse&lt;FQDNResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response with details about an FQDN connection. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad request, the request was unacceptable, often due to missing a required parameter. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Unauthenticated response. Happens when the current user cannot be authenticated. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<FQDNResponse> retrieveFqdnWithHttpInfo(String id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling retrieveFqdn");
    }
    
    // create path and map variables
    String localVarPath = "/fqdns/{id}"
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

    GenericType<FQDNResponse> localVarReturnType = new GenericType<FQDNResponse>() {};

    return apiClient.invokeAPI("FqdnsApi.retrieveFqdn", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Update an FQDN
   * Update the details of a specific FQDN.
   * @param id Identifies the resource. (required)
   * @param updateFqdnRequest  (optional)
   * @return FQDNResponse
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
  public FQDNResponse updateFqdn(String id, UpdateFqdnRequest updateFqdnRequest) throws ApiException {
    return updateFqdnWithHttpInfo(id, updateFqdnRequest).getData();
  }

  /**
   * Update an FQDN
   * Update the details of a specific FQDN.
   * @param id Identifies the resource. (required)
   * @param updateFqdnRequest  (optional)
   * @return ApiResponse&lt;FQDNResponse&gt;
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
  public ApiResponse<FQDNResponse> updateFqdnWithHttpInfo(String id, UpdateFqdnRequest updateFqdnRequest) throws ApiException {
    Object localVarPostBody = updateFqdnRequest;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling updateFqdn");
    }
    
    // create path and map variables
    String localVarPath = "/fqdns/{id}"
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

    GenericType<FQDNResponse> localVarReturnType = new GenericType<FQDNResponse>() {};

    return apiClient.invokeAPI("FqdnsApi.updateFqdn", localVarPath, "PATCH", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
