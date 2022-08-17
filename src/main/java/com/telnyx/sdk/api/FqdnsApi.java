package com.telnyx.sdk.api;

import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.Pair;

import javax.ws.rs.core.GenericType;

import com.telnyx.sdk.model.CreateFqdnRequest;
import com.telnyx.sdk.model.CustomerFacingFQDNsGetIPResponse;
import com.telnyx.sdk.model.CustomerFacingFQDNsListResponse;
import com.telnyx.sdk.model.CustomerFacingFQDNsPatch;
import com.telnyx.sdk.model.CustomerFacingFQDNsPost;
import com.telnyx.sdk.model.CustomerFacingFQDNsResponseSchema;
import com.telnyx.sdk.model.FQDNResponse;
import com.telnyx.sdk.model.ListFQDNsResponse;
import com.telnyx.sdk.model.UpdateFqdnRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
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
   * Create new Access FQDN
   * 
   * @param customerFacingFQDNsPost  (required)
   * @return CustomerFacingFQDNsResponseSchema
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public CustomerFacingFQDNsResponseSchema createAccessFqdn(CustomerFacingFQDNsPost customerFacingFQDNsPost) throws ApiException {
    return createAccessFqdnWithHttpInfo(customerFacingFQDNsPost).getData();
  }

  /**
   * Create new Access FQDN
   * 
   * @param customerFacingFQDNsPost  (required)
   * @return ApiResponse&lt;CustomerFacingFQDNsResponseSchema&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CustomerFacingFQDNsResponseSchema> createAccessFqdnWithHttpInfo(CustomerFacingFQDNsPost customerFacingFQDNsPost) throws ApiException {
    Object localVarPostBody = customerFacingFQDNsPost;
    
    // verify the required parameter 'customerFacingFQDNsPost' is set
    if (customerFacingFQDNsPost == null) {
      throw new ApiException(400, "Missing the required parameter 'customerFacingFQDNsPost' when calling createAccessFqdn");
    }
    
    // create path and map variables
    String localVarPath = "/access_fqdns";

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

    GenericType<CustomerFacingFQDNsResponseSchema> localVarReturnType = new GenericType<CustomerFacingFQDNsResponseSchema>() {};

    return apiClient.invokeAPI("FqdnsApi.createAccessFqdn", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
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
       <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
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
       <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
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
   * Delete Access FQDN
   * 
   * @param fqdnId  (required)
   * @return CustomerFacingFQDNsResponseSchema
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public CustomerFacingFQDNsResponseSchema deleteAccessFqdn(String fqdnId) throws ApiException {
    return deleteAccessFqdnWithHttpInfo(fqdnId).getData();
  }

  /**
   * Delete Access FQDN
   * 
   * @param fqdnId  (required)
   * @return ApiResponse&lt;CustomerFacingFQDNsResponseSchema&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CustomerFacingFQDNsResponseSchema> deleteAccessFqdnWithHttpInfo(String fqdnId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'fqdnId' is set
    if (fqdnId == null) {
      throw new ApiException(400, "Missing the required parameter 'fqdnId' when calling deleteAccessFqdn");
    }
    
    // create path and map variables
    String localVarPath = "/access_fqdns/{fqdn_id}"
      .replaceAll("\\{" + "fqdn_id" + "\\}", apiClient.escapeString(fqdnId.toString()));

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

    GenericType<CustomerFacingFQDNsResponseSchema> localVarReturnType = new GenericType<CustomerFacingFQDNsResponseSchema>() {};

    return apiClient.invokeAPI("FqdnsApi.deleteAccessFqdn", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
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
       <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
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
       <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
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
  /**
   * List an Access FQDN
   * 
   * @param fqdnId  (required)
   * @return CustomerFacingFQDNsResponseSchema
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public CustomerFacingFQDNsResponseSchema listAccessFqdnById(String fqdnId) throws ApiException {
    return listAccessFqdnByIdWithHttpInfo(fqdnId).getData();
  }

  /**
   * List an Access FQDN
   * 
   * @param fqdnId  (required)
   * @return ApiResponse&lt;CustomerFacingFQDNsResponseSchema&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CustomerFacingFQDNsResponseSchema> listAccessFqdnByIdWithHttpInfo(String fqdnId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'fqdnId' is set
    if (fqdnId == null) {
      throw new ApiException(400, "Missing the required parameter 'fqdnId' when calling listAccessFqdnById");
    }
    
    // create path and map variables
    String localVarPath = "/access_fqdns/{fqdn_id}"
      .replaceAll("\\{" + "fqdn_id" + "\\}", apiClient.escapeString(fqdnId.toString()));

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

    GenericType<CustomerFacingFQDNsResponseSchema> localVarReturnType = new GenericType<CustomerFacingFQDNsResponseSchema>() {};

    return apiClient.invokeAPI("FqdnsApi.listAccessFqdnById", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * List all Access FQDNs
   * 
   * @param pageNumber  (optional, default to 1)
   * @param pageSize  (optional, default to 20)
   * @return CustomerFacingFQDNsListResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public CustomerFacingFQDNsListResponse listAllAccessFqdns(Integer pageNumber, Integer pageSize) throws ApiException {
    return listAllAccessFqdnsWithHttpInfo(pageNumber, pageSize).getData();
  }

  /**
   * List all Access FQDNs
   * 
   * @param pageNumber  (optional, default to 1)
   * @param pageSize  (optional, default to 20)
   * @return ApiResponse&lt;CustomerFacingFQDNsListResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CustomerFacingFQDNsListResponse> listAllAccessFqdnsWithHttpInfo(Integer pageNumber, Integer pageSize) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/access_fqdns";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

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

    GenericType<CustomerFacingFQDNsListResponse> localVarReturnType = new GenericType<CustomerFacingFQDNsListResponse>() {};

    return apiClient.invokeAPI("FqdnsApi.listAllAccessFqdns", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * List Access FQDN&#39;s IP Addresses
   * 
   * @param fqdnId  (required)
   * @param pageNumber  (optional, default to 1)
   * @param pageSize  (optional, default to 20)
   * @return CustomerFacingFQDNsGetIPResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public CustomerFacingFQDNsGetIPResponse listAllIpsByFqdn(String fqdnId, Integer pageNumber, Integer pageSize) throws ApiException {
    return listAllIpsByFqdnWithHttpInfo(fqdnId, pageNumber, pageSize).getData();
  }

  /**
   * List Access FQDN&#39;s IP Addresses
   * 
   * @param fqdnId  (required)
   * @param pageNumber  (optional, default to 1)
   * @param pageSize  (optional, default to 20)
   * @return ApiResponse&lt;CustomerFacingFQDNsGetIPResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CustomerFacingFQDNsGetIPResponse> listAllIpsByFqdnWithHttpInfo(String fqdnId, Integer pageNumber, Integer pageSize) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'fqdnId' is set
    if (fqdnId == null) {
      throw new ApiException(400, "Missing the required parameter 'fqdnId' when calling listAllIpsByFqdn");
    }
    
    // create path and map variables
    String localVarPath = "/access_fqdns/{fqdn_id}/ips"
      .replaceAll("\\{" + "fqdn_id" + "\\}", apiClient.escapeString(fqdnId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

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

    GenericType<CustomerFacingFQDNsGetIPResponse> localVarReturnType = new GenericType<CustomerFacingFQDNsGetIPResponse>() {};

    return apiClient.invokeAPI("FqdnsApi.listAllIpsByFqdn", localVarPath, "GET", localVarQueryParams, localVarPostBody,
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
         <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
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
         <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
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
       <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
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
       <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
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
   * Update Access FQDN
   * 
   * @param fqdnId  (required)
   * @param customerFacingFQDNsPatch  (required)
   * @return CustomerFacingFQDNsResponseSchema
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public CustomerFacingFQDNsResponseSchema updateAccessFqdn(String fqdnId, CustomerFacingFQDNsPatch customerFacingFQDNsPatch) throws ApiException {
    return updateAccessFqdnWithHttpInfo(fqdnId, customerFacingFQDNsPatch).getData();
  }

  /**
   * Update Access FQDN
   * 
   * @param fqdnId  (required)
   * @param customerFacingFQDNsPatch  (required)
   * @return ApiResponse&lt;CustomerFacingFQDNsResponseSchema&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CustomerFacingFQDNsResponseSchema> updateAccessFqdnWithHttpInfo(String fqdnId, CustomerFacingFQDNsPatch customerFacingFQDNsPatch) throws ApiException {
    Object localVarPostBody = customerFacingFQDNsPatch;
    
    // verify the required parameter 'fqdnId' is set
    if (fqdnId == null) {
      throw new ApiException(400, "Missing the required parameter 'fqdnId' when calling updateAccessFqdn");
    }
    
    // verify the required parameter 'customerFacingFQDNsPatch' is set
    if (customerFacingFQDNsPatch == null) {
      throw new ApiException(400, "Missing the required parameter 'customerFacingFQDNsPatch' when calling updateAccessFqdn");
    }
    
    // create path and map variables
    String localVarPath = "/access_fqdns/{fqdn_id}"
      .replaceAll("\\{" + "fqdn_id" + "\\}", apiClient.escapeString(fqdnId.toString()));

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

    GenericType<CustomerFacingFQDNsResponseSchema> localVarReturnType = new GenericType<CustomerFacingFQDNsResponseSchema>() {};

    return apiClient.invokeAPI("FqdnsApi.updateAccessFqdn", localVarPath, "PATCH", localVarQueryParams, localVarPostBody,
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
       <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
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
       <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
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
