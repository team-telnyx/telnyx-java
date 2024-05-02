package com.telnyx.sdk.api;

import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.Pair;

import jakarta.ws.rs.core.GenericType;

import com.telnyx.sdk.model.GetAllTelephonyCredentialResponse;
import com.telnyx.sdk.model.ListTagsResponse;
import com.telnyx.sdk.model.TelephonyCredentialCreateRequest;
import com.telnyx.sdk.model.TelephonyCredentialResponse;
import com.telnyx.sdk.model.TelephonyCredentialUpdateRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class CredentialsApi {
  private ApiClient apiClient;

  public CredentialsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public CredentialsApi(ApiClient apiClient) {
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
   * Create a credential
   * Create a credential.
   * @param telephonyCredentialCreateRequest Parameters that can be defined during credential creation (required)
   * @return TelephonyCredentialResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Successful response with details about a credential </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Bad request </td><td>  -  </td></tr>
     </table>
   */
  public TelephonyCredentialResponse createTelephonyCredential(TelephonyCredentialCreateRequest telephonyCredentialCreateRequest) throws ApiException {
    return createTelephonyCredentialWithHttpInfo(telephonyCredentialCreateRequest).getData();
  }

  /**
   * Create a credential
   * Create a credential.
   * @param telephonyCredentialCreateRequest Parameters that can be defined during credential creation (required)
   * @return ApiResponse&lt;TelephonyCredentialResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Successful response with details about a credential </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Bad request </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<TelephonyCredentialResponse> createTelephonyCredentialWithHttpInfo(TelephonyCredentialCreateRequest telephonyCredentialCreateRequest) throws ApiException {
    Object localVarPostBody = telephonyCredentialCreateRequest;
    
    // verify the required parameter 'telephonyCredentialCreateRequest' is set
    if (telephonyCredentialCreateRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'telephonyCredentialCreateRequest' when calling createTelephonyCredential");
    }
    
    // create path and map variables
    String localVarPath = "/telephony_credentials";

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

    GenericType<TelephonyCredentialResponse> localVarReturnType = new GenericType<TelephonyCredentialResponse>() {};

    return apiClient.invokeAPI("CredentialsApi.createTelephonyCredential", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Delete a credential
   * Delete an existing credential.
   * @param id Identifies the resource. (required)
   * @return TelephonyCredentialResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response with details about a credential </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Bad request </td><td>  -  </td></tr>
     </table>
   */
  public TelephonyCredentialResponse deleteTelephonyCredential(String id) throws ApiException {
    return deleteTelephonyCredentialWithHttpInfo(id).getData();
  }

  /**
   * Delete a credential
   * Delete an existing credential.
   * @param id Identifies the resource. (required)
   * @return ApiResponse&lt;TelephonyCredentialResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response with details about a credential </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Bad request </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<TelephonyCredentialResponse> deleteTelephonyCredentialWithHttpInfo(String id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling deleteTelephonyCredential");
    }
    
    // create path and map variables
    String localVarPath = "/telephony_credentials/{id}"
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

    GenericType<TelephonyCredentialResponse> localVarReturnType = new GenericType<TelephonyCredentialResponse>() {};

    return apiClient.invokeAPI("CredentialsApi.deleteTelephonyCredential", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

private ApiResponse<GetAllTelephonyCredentialResponse> findTelephonyCredentialsWithHttpInfo(Integer pageNumber, Integer pageSize, String filterTag, String filterName, String filterStatus, String filterResourceId, String filterSipUsername) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/telephony_credentials";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[number]", pageNumber));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[tag]", filterTag));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[name]", filterName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[status]", filterStatus));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[resource_id]", filterResourceId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[sip_username]", filterSipUsername));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    GenericType<GetAllTelephonyCredentialResponse> localVarReturnType = new GenericType<GetAllTelephonyCredentialResponse>() {};

    return apiClient.invokeAPI("CredentialsApi.findTelephonyCredentials", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIfindTelephonyCredentialsRequest {
    private Integer pageNumber;
    private Integer pageSize;
    private String filterTag;
    private String filterName;
    private String filterStatus;
    private String filterResourceId;
    private String filterSipUsername;

    private APIfindTelephonyCredentialsRequest() {
    }

    /**
     * Set pageNumber
     * @param pageNumber The page number to load (optional, default to 1)
     * @return APIfindTelephonyCredentialsRequest
     */
    public APIfindTelephonyCredentialsRequest pageNumber(Integer pageNumber) {
      this.pageNumber = pageNumber;
      return this;
    }

    /**
     * Set pageSize
     * @param pageSize The size of the page (optional, default to 20)
     * @return APIfindTelephonyCredentialsRequest
     */
    public APIfindTelephonyCredentialsRequest pageSize(Integer pageSize) {
      this.pageSize = pageSize;
      return this;
    }

    /**
     * Set filterTag
     * @param filterTag Filter by tag (optional)
     * @return APIfindTelephonyCredentialsRequest
     */
    public APIfindTelephonyCredentialsRequest filterTag(String filterTag) {
      this.filterTag = filterTag;
      return this;
    }

    /**
     * Set filterName
     * @param filterName Filter by name (optional)
     * @return APIfindTelephonyCredentialsRequest
     */
    public APIfindTelephonyCredentialsRequest filterName(String filterName) {
      this.filterName = filterName;
      return this;
    }

    /**
     * Set filterStatus
     * @param filterStatus Filter by status (optional)
     * @return APIfindTelephonyCredentialsRequest
     */
    public APIfindTelephonyCredentialsRequest filterStatus(String filterStatus) {
      this.filterStatus = filterStatus;
      return this;
    }

    /**
     * Set filterResourceId
     * @param filterResourceId Filter by resource_id (optional)
     * @return APIfindTelephonyCredentialsRequest
     */
    public APIfindTelephonyCredentialsRequest filterResourceId(String filterResourceId) {
      this.filterResourceId = filterResourceId;
      return this;
    }

    /**
     * Set filterSipUsername
     * @param filterSipUsername Filter by sip_username (optional)
     * @return APIfindTelephonyCredentialsRequest
     */
    public APIfindTelephonyCredentialsRequest filterSipUsername(String filterSipUsername) {
      this.filterSipUsername = filterSipUsername;
      return this;
    }

    /**
     * Execute findTelephonyCredentials request
     * @return GetAllTelephonyCredentialResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response with multiple credentials </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
         <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
       </table>
     
     */
    
    public GetAllTelephonyCredentialResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute findTelephonyCredentials request with HTTP info returned
     * @return ApiResponse&lt;GetAllTelephonyCredentialResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response with multiple credentials </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
         <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<GetAllTelephonyCredentialResponse> executeWithHttpInfo() throws ApiException {
      return findTelephonyCredentialsWithHttpInfo(pageNumber, pageSize, filterTag, filterName, filterStatus, filterResourceId, filterSipUsername);
    }
  }

  /**
   * List all credentials
   * List all On-demand Credentials.
   * @return findTelephonyCredentialsRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIfindTelephonyCredentialsRequest findTelephonyCredentials() throws ApiException {
    return new APIfindTelephonyCredentialsRequest();
  }
  /**
   * Get a credential
   * Get the details of an existing On-demand Credential.
   * @param id Identifies the resource. (required)
   * @return TelephonyCredentialResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response with details about a credential </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
     </table>
   */
  public TelephonyCredentialResponse getTelephonyCredential(String id) throws ApiException {
    return getTelephonyCredentialWithHttpInfo(id).getData();
  }

  /**
   * Get a credential
   * Get the details of an existing On-demand Credential.
   * @param id Identifies the resource. (required)
   * @return ApiResponse&lt;TelephonyCredentialResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response with details about a credential </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<TelephonyCredentialResponse> getTelephonyCredentialWithHttpInfo(String id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getTelephonyCredential");
    }
    
    // create path and map variables
    String localVarPath = "/telephony_credentials/{id}"
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

    GenericType<TelephonyCredentialResponse> localVarReturnType = new GenericType<TelephonyCredentialResponse>() {};

    return apiClient.invokeAPI("CredentialsApi.getTelephonyCredential", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * List all tags
   * Returns a list of tags used on Credentials
   * @param pageNumber The page number to load (optional, default to 1)
   * @param pageSize The size of the page (optional, default to 20)
   * @return ListTagsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response with multiple tags </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
     </table>
   */
  public ListTagsResponse listTags(Integer pageNumber, Integer pageSize) throws ApiException {
    return listTagsWithHttpInfo(pageNumber, pageSize).getData();
  }

  /**
   * List all tags
   * Returns a list of tags used on Credentials
   * @param pageNumber The page number to load (optional, default to 1)
   * @param pageSize The size of the page (optional, default to 20)
   * @return ApiResponse&lt;ListTagsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response with multiple tags </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ListTagsResponse> listTagsWithHttpInfo(Integer pageNumber, Integer pageSize) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/telephony_credentials/tags";

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

    GenericType<ListTagsResponse> localVarReturnType = new GenericType<ListTagsResponse>() {};

    return apiClient.invokeAPI("CredentialsApi.listTags", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Perform activate or deactivate action on provided Credential
   * Perform activate or deactivate action on provided Credential. Activate action will change the status to active, making it possible to connect calls with the credential. Deactivate action will change the status to inactive, making it impossible to connect calls with the credential.
   * @param id Identifies the resource. (required)
   * @param action Identifies the action to be taken. (required)
   * @return TelephonyCredentialResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response with details about a credential </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
     </table>
   */
  public TelephonyCredentialResponse performCredentialAction(String id, String action) throws ApiException {
    return performCredentialActionWithHttpInfo(id, action).getData();
  }

  /**
   * Perform activate or deactivate action on provided Credential
   * Perform activate or deactivate action on provided Credential. Activate action will change the status to active, making it possible to connect calls with the credential. Deactivate action will change the status to inactive, making it impossible to connect calls with the credential.
   * @param id Identifies the resource. (required)
   * @param action Identifies the action to be taken. (required)
   * @return ApiResponse&lt;TelephonyCredentialResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response with details about a credential </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<TelephonyCredentialResponse> performCredentialActionWithHttpInfo(String id, String action) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling performCredentialAction");
    }
    
    // verify the required parameter 'action' is set
    if (action == null) {
      throw new ApiException(400, "Missing the required parameter 'action' when calling performCredentialAction");
    }
    
    // create path and map variables
    String localVarPath = "/telephony_credentials/{id}/actions/{action}"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()))
      .replaceAll("\\{" + "action" + "\\}", apiClient.escapeString(action.toString()));

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

    GenericType<TelephonyCredentialResponse> localVarReturnType = new GenericType<TelephonyCredentialResponse>() {};

    return apiClient.invokeAPI("CredentialsApi.performCredentialAction", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Update a credential
   * Update an existing credential.
   * @param id Identifies the resource. (required)
   * @param telephonyCredentialUpdateRequest Parameters that can be updated in a credential (required)
   * @return TelephonyCredentialResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response with details about a credential </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Bad request </td><td>  -  </td></tr>
     </table>
   */
  public TelephonyCredentialResponse updateTelephonyCredential(String id, TelephonyCredentialUpdateRequest telephonyCredentialUpdateRequest) throws ApiException {
    return updateTelephonyCredentialWithHttpInfo(id, telephonyCredentialUpdateRequest).getData();
  }

  /**
   * Update a credential
   * Update an existing credential.
   * @param id Identifies the resource. (required)
   * @param telephonyCredentialUpdateRequest Parameters that can be updated in a credential (required)
   * @return ApiResponse&lt;TelephonyCredentialResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response with details about a credential </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Bad request </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<TelephonyCredentialResponse> updateTelephonyCredentialWithHttpInfo(String id, TelephonyCredentialUpdateRequest telephonyCredentialUpdateRequest) throws ApiException {
    Object localVarPostBody = telephonyCredentialUpdateRequest;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling updateTelephonyCredential");
    }
    
    // verify the required parameter 'telephonyCredentialUpdateRequest' is set
    if (telephonyCredentialUpdateRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'telephonyCredentialUpdateRequest' when calling updateTelephonyCredential");
    }
    
    // create path and map variables
    String localVarPath = "/telephony_credentials/{id}"
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

    GenericType<TelephonyCredentialResponse> localVarReturnType = new GenericType<TelephonyCredentialResponse>() {};

    return apiClient.invokeAPI("CredentialsApi.updateTelephonyCredential", localVarPath, "PATCH", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
