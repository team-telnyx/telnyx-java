package com.telnyx.sdk.api;

import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.Pair;

import javax.ws.rs.core.GenericType;

import com.telnyx.sdk.model.Errors;
import com.telnyx.sdk.model.InterfaceStatus;
import com.telnyx.sdk.model.NetworkCreate;
import com.telnyx.sdk.model.NetworkCreate200Response;
import com.telnyx.sdk.model.NetworkInterfaceList200Response;
import com.telnyx.sdk.model.NetworkList200Response;
import java.util.UUID;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class NetworksApi {
  private ApiClient apiClient;

  public NetworksApi() {
    this(Configuration.getDefaultApiClient());
  }

  public NetworksApi(ApiClient apiClient) {
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
   * Create a Network
   * Create a new Network.
   * @param networkCreate  (required)
   * @return NetworkCreate200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check the &#39;detail&#39; field in response for details. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public NetworkCreate200Response networkCreate(NetworkCreate networkCreate) throws ApiException {
    return networkCreateWithHttpInfo(networkCreate).getData();
  }

  /**
   * Create a Network
   * Create a new Network.
   * @param networkCreate  (required)
   * @return ApiResponse&lt;NetworkCreate200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check the &#39;detail&#39; field in response for details. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<NetworkCreate200Response> networkCreateWithHttpInfo(NetworkCreate networkCreate) throws ApiException {
    Object localVarPostBody = networkCreate;
    
    // verify the required parameter 'networkCreate' is set
    if (networkCreate == null) {
      throw new ApiException(400, "Missing the required parameter 'networkCreate' when calling networkCreate");
    }
    
    // create path and map variables
    String localVarPath = "/networks";

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

    GenericType<NetworkCreate200Response> localVarReturnType = new GenericType<NetworkCreate200Response>() {};

    return apiClient.invokeAPI("NetworksApi.networkCreate", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Delete a Network
   * Delete a Network.
   * @param id Identifies the resource. (required)
   * @return NetworkCreate200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public NetworkCreate200Response networkDelete(UUID id) throws ApiException {
    return networkDeleteWithHttpInfo(id).getData();
  }

  /**
   * Delete a Network
   * Delete a Network.
   * @param id Identifies the resource. (required)
   * @return ApiResponse&lt;NetworkCreate200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<NetworkCreate200Response> networkDeleteWithHttpInfo(UUID id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling networkDelete");
    }
    
    // create path and map variables
    String localVarPath = "/networks/{id}"
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

    GenericType<NetworkCreate200Response> localVarReturnType = new GenericType<NetworkCreate200Response>() {};

    return apiClient.invokeAPI("NetworksApi.networkDelete", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Retrieve a Network
   * Retrieve a Network.
   * @param id Identifies the resource. (required)
   * @return NetworkCreate200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public NetworkCreate200Response networkGet(UUID id) throws ApiException {
    return networkGetWithHttpInfo(id).getData();
  }

  /**
   * Retrieve a Network
   * Retrieve a Network.
   * @param id Identifies the resource. (required)
   * @return ApiResponse&lt;NetworkCreate200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<NetworkCreate200Response> networkGetWithHttpInfo(UUID id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling networkGet");
    }
    
    // create path and map variables
    String localVarPath = "/networks/{id}"
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

    GenericType<NetworkCreate200Response> localVarReturnType = new GenericType<NetworkCreate200Response>() {};

    return apiClient.invokeAPI("NetworksApi.networkGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * List all Interfaces for a Network.
   * List all Interfaces for a Network.
   * @param id Identifies the resource. (required)
   * @param pageNumber The page number to load (optional, default to 1)
   * @param pageSize The size of the page (optional, default to 20)
   * @param filterName The interface name to filter on. (optional)
   * @param filterType The interface type to filter on. (optional)
   * @param filterStatus The interface status to filter on. (optional)
   * @return NetworkInterfaceList200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public NetworkInterfaceList200Response networkInterfaceList(UUID id, Integer pageNumber, Integer pageSize, String filterName, String filterType, InterfaceStatus filterStatus) throws ApiException {
    return networkInterfaceListWithHttpInfo(id, pageNumber, pageSize, filterName, filterType, filterStatus).getData();
  }

  /**
   * List all Interfaces for a Network.
   * List all Interfaces for a Network.
   * @param id Identifies the resource. (required)
   * @param pageNumber The page number to load (optional, default to 1)
   * @param pageSize The size of the page (optional, default to 20)
   * @param filterName The interface name to filter on. (optional)
   * @param filterType The interface type to filter on. (optional)
   * @param filterStatus The interface status to filter on. (optional)
   * @return ApiResponse&lt;NetworkInterfaceList200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<NetworkInterfaceList200Response> networkInterfaceListWithHttpInfo(UUID id, Integer pageNumber, Integer pageSize, String filterName, String filterType, InterfaceStatus filterStatus) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling networkInterfaceList");
    }
    
    // create path and map variables
    String localVarPath = "/networks/{id}/network_interfaces"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[number]", pageNumber));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[name]", filterName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[type]", filterType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[status]", filterStatus));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    GenericType<NetworkInterfaceList200Response> localVarReturnType = new GenericType<NetworkInterfaceList200Response>() {};

    return apiClient.invokeAPI("NetworksApi.networkInterfaceList", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * List all Networks
   * List all Networks.
   * @param pageNumber The page number to load (optional, default to 1)
   * @param pageSize The size of the page (optional, default to 20)
   * @param filterName The network name to filter on. (optional)
   * @return NetworkList200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public NetworkList200Response networkList(Integer pageNumber, Integer pageSize, String filterName) throws ApiException {
    return networkListWithHttpInfo(pageNumber, pageSize, filterName).getData();
  }

  /**
   * List all Networks
   * List all Networks.
   * @param pageNumber The page number to load (optional, default to 1)
   * @param pageSize The size of the page (optional, default to 20)
   * @param filterName The network name to filter on. (optional)
   * @return ApiResponse&lt;NetworkList200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<NetworkList200Response> networkListWithHttpInfo(Integer pageNumber, Integer pageSize, String filterName) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/networks";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[number]", pageNumber));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[name]", filterName));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    GenericType<NetworkList200Response> localVarReturnType = new GenericType<NetworkList200Response>() {};

    return apiClient.invokeAPI("NetworksApi.networkList", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Update a Network
   * Update a Network.
   * @param id Identifies the resource. (required)
   * @param networkCreate  (required)
   * @return NetworkCreate200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public NetworkCreate200Response networkUpdate(UUID id, NetworkCreate networkCreate) throws ApiException {
    return networkUpdateWithHttpInfo(id, networkCreate).getData();
  }

  /**
   * Update a Network
   * Update a Network.
   * @param id Identifies the resource. (required)
   * @param networkCreate  (required)
   * @return ApiResponse&lt;NetworkCreate200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<NetworkCreate200Response> networkUpdateWithHttpInfo(UUID id, NetworkCreate networkCreate) throws ApiException {
    Object localVarPostBody = networkCreate;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling networkUpdate");
    }
    
    // verify the required parameter 'networkCreate' is set
    if (networkCreate == null) {
      throw new ApiException(400, "Missing the required parameter 'networkCreate' when calling networkUpdate");
    }
    
    // create path and map variables
    String localVarPath = "/networks/{id}"
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

    GenericType<NetworkCreate200Response> localVarReturnType = new GenericType<NetworkCreate200Response>() {};

    return apiClient.invokeAPI("NetworksApi.networkUpdate", localVarPath, "PATCH", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
