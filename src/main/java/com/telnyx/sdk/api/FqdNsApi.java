package com.telnyx.sdk.api;

import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.Pair;

import javax.ws.rs.core.GenericType;

import com.telnyx.sdk.model.CreateFqdnRequest;
import com.telnyx.sdk.model.FqdnResponse;
import com.telnyx.sdk.model.ListFqdnsResponse;
import com.telnyx.sdk.model.UpdateFqdnRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class FqdNsApi {
  private ApiClient apiClient;

  public FqdNsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public FqdNsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Get the API cilent
   *
   * @return API client
   */
  public ApiClient getApiClient() {
    return apiClient;
  }

  /**
   * Set the API cilent
   *
   * @param apiClient an instance of API client
   */
  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Create an Fqdn
   * Create a new FQDN object.
   * @param createFqdnRequest  (optional)
   * @return FqdnResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Successful response with details about an FQDN connection. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
   */
  public FqdnResponse createFqdn(CreateFqdnRequest createFqdnRequest) throws ApiException {
    return createFqdnWithHttpInfo(createFqdnRequest).getData();
  }

  /**
   * Create an Fqdn
   * Create a new FQDN object.
   * @param createFqdnRequest  (optional)
   * @return ApiResponse&lt;FqdnResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Successful response with details about an FQDN connection. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<FqdnResponse> createFqdnWithHttpInfo(CreateFqdnRequest createFqdnRequest) throws ApiException {
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

    GenericType<FqdnResponse> localVarReturnType = new GenericType<FqdnResponse>() {};

    return apiClient.invokeAPI("FqdNsApi.createFqdn", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Delete an Fqdn
   * Delete an FQDN.
   * @param id Identifies the resource. (required)
   * @return FqdnResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response with details about an FQDN connection. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
   */
  public FqdnResponse deleteFqdn(String id) throws ApiException {
    return deleteFqdnWithHttpInfo(id).getData();
  }

  /**
   * Delete an Fqdn
   * Delete an FQDN.
   * @param id Identifies the resource. (required)
   * @return ApiResponse&lt;FqdnResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response with details about an FQDN connection. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<FqdnResponse> deleteFqdnWithHttpInfo(String id) throws ApiException {
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

    GenericType<FqdnResponse> localVarReturnType = new GenericType<FqdnResponse>() {};

    return apiClient.invokeAPI("FqdNsApi.deleteFqdn", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

private ApiResponse<ListFqdnsResponse> listFqdnsWithHttpInfo(Integer pageNumber, Integer pageSize, String filterConnectionId, String filterFqdn, Integer filterPort, String filterDnsRecordType) throws ApiException {
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

    GenericType<ListFqdnsResponse> localVarReturnType = new GenericType<ListFqdnsResponse>() {};

    return apiClient.invokeAPI("FqdNsApi.listFqdns", localVarPath, "GET", localVarQueryParams, localVarPostBody,
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
     * @param pageSize The size of the page (optional, default to 250)
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
     * @return ListFqdnsResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response with a list of FQDN connections. </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
         <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ListFqdnsResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute listFqdns request with HTTP info returned
     * @return ApiResponse&lt;ListFqdnsResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response with a list of FQDN connections. </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
         <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<ListFqdnsResponse> executeWithHttpInfo() throws ApiException {
      return listFqdnsWithHttpInfo(pageNumber, pageSize, filterConnectionId, filterFqdn, filterPort, filterDnsRecordType);
    }
  }

  /**
   * List Fqdns
   * Get all FQDNs belonging to the user that match the given filters.
   * @return listFqdnsRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIlistFqdnsRequest listFqdns() throws ApiException {
    return new APIlistFqdnsRequest();
  }
  /**
   * Retrieve an Fqdn
   * Return the details regarding a specific FQDN.
   * @param id Identifies the resource. (required)
   * @return FqdnResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response with details about an FQDN connection. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
   */
  public FqdnResponse retrieveFqdn(String id) throws ApiException {
    return retrieveFqdnWithHttpInfo(id).getData();
  }

  /**
   * Retrieve an Fqdn
   * Return the details regarding a specific FQDN.
   * @param id Identifies the resource. (required)
   * @return ApiResponse&lt;FqdnResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response with details about an FQDN connection. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<FqdnResponse> retrieveFqdnWithHttpInfo(String id) throws ApiException {
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

    GenericType<FqdnResponse> localVarReturnType = new GenericType<FqdnResponse>() {};

    return apiClient.invokeAPI("FqdNsApi.retrieveFqdn", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Update an Fqdn
   * Update the details of a specific FQDN.
   * @param id Identifies the resource. (required)
   * @param updateFqdnRequest  (optional)
   * @return FqdnResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response with details about an FQDN connection. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
   */
  public FqdnResponse updateFqdn(String id, UpdateFqdnRequest updateFqdnRequest) throws ApiException {
    return updateFqdnWithHttpInfo(id, updateFqdnRequest).getData();
  }

  /**
   * Update an Fqdn
   * Update the details of a specific FQDN.
   * @param id Identifies the resource. (required)
   * @param updateFqdnRequest  (optional)
   * @return ApiResponse&lt;FqdnResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response with details about an FQDN connection. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<FqdnResponse> updateFqdnWithHttpInfo(String id, UpdateFqdnRequest updateFqdnRequest) throws ApiException {
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

    GenericType<FqdnResponse> localVarReturnType = new GenericType<FqdnResponse>() {};

    return apiClient.invokeAPI("FqdNsApi.updateFqdn", localVarPath, "PATCH", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
