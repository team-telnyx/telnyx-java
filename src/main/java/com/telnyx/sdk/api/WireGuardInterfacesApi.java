package com.telnyx.sdk.api;

import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.Pair;

import javax.ws.rs.core.GenericType;

import com.telnyx.sdk.model.Errors;
import java.util.UUID;
import com.telnyx.sdk.model.WireguardInterfaceCreate;
import com.telnyx.sdk.model.WireguardInterfaceCreate202Response;
import com.telnyx.sdk.model.WireguardInterfaceList200Response;
import com.telnyx.sdk.model.WireguardPeerAllowedIPGet200Response;
import com.telnyx.sdk.model.WireguardPeerAllowedIPList200Response;
import com.telnyx.sdk.model.WireguardPeerCreate;
import com.telnyx.sdk.model.WireguardPeerCreate202Response;
import com.telnyx.sdk.model.WireguardPeerList200Response;
import com.telnyx.sdk.model.WireguardPeerPatch;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class WireGuardInterfacesApi {
  private ApiClient apiClient;

  public WireGuardInterfacesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public WireGuardInterfacesApi(ApiClient apiClient) {
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
   * Create a WireGuard Interface
   * Create a new WireGuard Interface. Current limitation of 10 interfaces per user can be created.
   * @param wireguardInterfaceCreate  (required)
   * @return WireguardInterfaceCreate202Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 202 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check the &#39;detail&#39; field in response for details. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public WireguardInterfaceCreate202Response wireguardInterfaceCreate(WireguardInterfaceCreate wireguardInterfaceCreate) throws ApiException {
    return wireguardInterfaceCreateWithHttpInfo(wireguardInterfaceCreate).getData();
  }

  /**
   * Create a WireGuard Interface
   * Create a new WireGuard Interface. Current limitation of 10 interfaces per user can be created.
   * @param wireguardInterfaceCreate  (required)
   * @return ApiResponse&lt;WireguardInterfaceCreate202Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 202 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check the &#39;detail&#39; field in response for details. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<WireguardInterfaceCreate202Response> wireguardInterfaceCreateWithHttpInfo(WireguardInterfaceCreate wireguardInterfaceCreate) throws ApiException {
    Object localVarPostBody = wireguardInterfaceCreate;
    
    // verify the required parameter 'wireguardInterfaceCreate' is set
    if (wireguardInterfaceCreate == null) {
      throw new ApiException(400, "Missing the required parameter 'wireguardInterfaceCreate' when calling wireguardInterfaceCreate");
    }
    
    // create path and map variables
    String localVarPath = "/wireguard_interfaces";

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

    GenericType<WireguardInterfaceCreate202Response> localVarReturnType = new GenericType<WireguardInterfaceCreate202Response>() {};

    return apiClient.invokeAPI("WireGuardInterfacesApi.wireguardInterfaceCreate", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Delete a WireGuard Interface
   * Delete a WireGuard Interface.
   * @param id Identifies the resource. (required)
   * @return WireguardInterfaceCreate202Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public WireguardInterfaceCreate202Response wireguardInterfaceDelete(UUID id) throws ApiException {
    return wireguardInterfaceDeleteWithHttpInfo(id).getData();
  }

  /**
   * Delete a WireGuard Interface
   * Delete a WireGuard Interface.
   * @param id Identifies the resource. (required)
   * @return ApiResponse&lt;WireguardInterfaceCreate202Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<WireguardInterfaceCreate202Response> wireguardInterfaceDeleteWithHttpInfo(UUID id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling wireguardInterfaceDelete");
    }
    
    // create path and map variables
    String localVarPath = "/wireguard_interfaces/{id}"
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

    GenericType<WireguardInterfaceCreate202Response> localVarReturnType = new GenericType<WireguardInterfaceCreate202Response>() {};

    return apiClient.invokeAPI("WireGuardInterfacesApi.wireguardInterfaceDelete", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Retrieve a WireGuard Interfaces
   * Retrieve a WireGuard Interfaces.
   * @param id Identifies the resource. (required)
   * @return WireguardInterfaceCreate202Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public WireguardInterfaceCreate202Response wireguardInterfaceGet(UUID id) throws ApiException {
    return wireguardInterfaceGetWithHttpInfo(id).getData();
  }

  /**
   * Retrieve a WireGuard Interfaces
   * Retrieve a WireGuard Interfaces.
   * @param id Identifies the resource. (required)
   * @return ApiResponse&lt;WireguardInterfaceCreate202Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<WireguardInterfaceCreate202Response> wireguardInterfaceGetWithHttpInfo(UUID id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling wireguardInterfaceGet");
    }
    
    // create path and map variables
    String localVarPath = "/wireguard_interfaces/{id}"
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

    GenericType<WireguardInterfaceCreate202Response> localVarReturnType = new GenericType<WireguardInterfaceCreate202Response>() {};

    return apiClient.invokeAPI("WireGuardInterfacesApi.wireguardInterfaceGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * List all WireGuard Interfaces
   * List all WireGuard Interfaces.
   * @param pageNumber The page number to load (optional, default to 1)
   * @param pageSize The size of the page (optional, default to 20)
   * @param filterNetworkId The associated network id to filter on. (optional)
   * @return WireguardInterfaceList200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public WireguardInterfaceList200Response wireguardInterfaceList(Integer pageNumber, Integer pageSize, String filterNetworkId) throws ApiException {
    return wireguardInterfaceListWithHttpInfo(pageNumber, pageSize, filterNetworkId).getData();
  }

  /**
   * List all WireGuard Interfaces
   * List all WireGuard Interfaces.
   * @param pageNumber The page number to load (optional, default to 1)
   * @param pageSize The size of the page (optional, default to 20)
   * @param filterNetworkId The associated network id to filter on. (optional)
   * @return ApiResponse&lt;WireguardInterfaceList200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<WireguardInterfaceList200Response> wireguardInterfaceListWithHttpInfo(Integer pageNumber, Integer pageSize, String filterNetworkId) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/wireguard_interfaces";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[number]", pageNumber));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[network_id]", filterNetworkId));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    GenericType<WireguardInterfaceList200Response> localVarReturnType = new GenericType<WireguardInterfaceList200Response>() {};

    return apiClient.invokeAPI("WireGuardInterfacesApi.wireguardInterfaceList", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Retrieve the Allowed IP
   * Retrieve the Allowed IP.
   * @param id Identifies the resource. (required)
   * @param childId Identifies the child resource (required)
   * @return WireguardPeerAllowedIPGet200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public WireguardPeerAllowedIPGet200Response wireguardPeerAllowedIPGet(UUID id, UUID childId) throws ApiException {
    return wireguardPeerAllowedIPGetWithHttpInfo(id, childId).getData();
  }

  /**
   * Retrieve the Allowed IP
   * Retrieve the Allowed IP.
   * @param id Identifies the resource. (required)
   * @param childId Identifies the child resource (required)
   * @return ApiResponse&lt;WireguardPeerAllowedIPGet200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<WireguardPeerAllowedIPGet200Response> wireguardPeerAllowedIPGetWithHttpInfo(UUID id, UUID childId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling wireguardPeerAllowedIPGet");
    }
    
    // verify the required parameter 'childId' is set
    if (childId == null) {
      throw new ApiException(400, "Missing the required parameter 'childId' when calling wireguardPeerAllowedIPGet");
    }
    
    // create path and map variables
    String localVarPath = "/wireguard_peers/{id}/allowed_ips/{child_id}"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()))
      .replaceAll("\\{" + "child_id" + "\\}", apiClient.escapeString(childId.toString()));

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

    GenericType<WireguardPeerAllowedIPGet200Response> localVarReturnType = new GenericType<WireguardPeerAllowedIPGet200Response>() {};

    return apiClient.invokeAPI("WireGuardInterfacesApi.wireguardPeerAllowedIPGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * List all Allowed IPs for a WireGuard Peer
   * List all Allowed IPs for a WireGuard peer.
   * @param id Identifies the resource. (required)
   * @param pageNumber The page number to load (optional, default to 1)
   * @param pageSize The size of the page (optional, default to 20)
   * @return WireguardPeerAllowedIPList200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public WireguardPeerAllowedIPList200Response wireguardPeerAllowedIPList(UUID id, Integer pageNumber, Integer pageSize) throws ApiException {
    return wireguardPeerAllowedIPListWithHttpInfo(id, pageNumber, pageSize).getData();
  }

  /**
   * List all Allowed IPs for a WireGuard Peer
   * List all Allowed IPs for a WireGuard peer.
   * @param id Identifies the resource. (required)
   * @param pageNumber The page number to load (optional, default to 1)
   * @param pageSize The size of the page (optional, default to 20)
   * @return ApiResponse&lt;WireguardPeerAllowedIPList200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<WireguardPeerAllowedIPList200Response> wireguardPeerAllowedIPListWithHttpInfo(UUID id, Integer pageNumber, Integer pageSize) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling wireguardPeerAllowedIPList");
    }
    
    // create path and map variables
    String localVarPath = "/wireguard_peers/{id}/allowed_ips"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

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

    GenericType<WireguardPeerAllowedIPList200Response> localVarReturnType = new GenericType<WireguardPeerAllowedIPList200Response>() {};

    return apiClient.invokeAPI("WireGuardInterfacesApi.wireguardPeerAllowedIPList", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Retrieve Wireguard config template for Peer
   * Retrieve Wireguard config template for Peer
   * @param id Identifies the resource. (required)
   * @return String
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public String wireguardPeerConfig(UUID id) throws ApiException {
    return wireguardPeerConfigWithHttpInfo(id).getData();
  }

  /**
   * Retrieve Wireguard config template for Peer
   * Retrieve Wireguard config template for Peer
   * @param id Identifies the resource. (required)
   * @return ApiResponse&lt;String&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<String> wireguardPeerConfigWithHttpInfo(UUID id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling wireguardPeerConfig");
    }
    
    // create path and map variables
    String localVarPath = "/wireguard_peers/{id}/config"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "text/plain; charset=utf-8", "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    GenericType<String> localVarReturnType = new GenericType<String>() {};

    return apiClient.invokeAPI("WireGuardInterfacesApi.wireguardPeerConfig", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Create a WireGuard Peer
   * Create a new WireGuard Peer. Current limitation of 5 peers per interface can be created.
   * @param id Identifies the resource. (required)
   * @param wireguardPeerCreate  (required)
   * @return WireguardPeerCreate202Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 202 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check the &#39;detail&#39; field in response for details. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public WireguardPeerCreate202Response wireguardPeerCreate(UUID id, WireguardPeerCreate wireguardPeerCreate) throws ApiException {
    return wireguardPeerCreateWithHttpInfo(id, wireguardPeerCreate).getData();
  }

  /**
   * Create a WireGuard Peer
   * Create a new WireGuard Peer. Current limitation of 5 peers per interface can be created.
   * @param id Identifies the resource. (required)
   * @param wireguardPeerCreate  (required)
   * @return ApiResponse&lt;WireguardPeerCreate202Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 202 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check the &#39;detail&#39; field in response for details. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<WireguardPeerCreate202Response> wireguardPeerCreateWithHttpInfo(UUID id, WireguardPeerCreate wireguardPeerCreate) throws ApiException {
    Object localVarPostBody = wireguardPeerCreate;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling wireguardPeerCreate");
    }
    
    // verify the required parameter 'wireguardPeerCreate' is set
    if (wireguardPeerCreate == null) {
      throw new ApiException(400, "Missing the required parameter 'wireguardPeerCreate' when calling wireguardPeerCreate");
    }
    
    // create path and map variables
    String localVarPath = "/wireguard_peers"
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

    GenericType<WireguardPeerCreate202Response> localVarReturnType = new GenericType<WireguardPeerCreate202Response>() {};

    return apiClient.invokeAPI("WireGuardInterfacesApi.wireguardPeerCreate", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Delete the WireGuard Peer
   * Delete the WireGuard peer.
   * @param id Identifies the resource. (required)
   * @return WireguardPeerCreate202Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public WireguardPeerCreate202Response wireguardPeerDelete(UUID id) throws ApiException {
    return wireguardPeerDeleteWithHttpInfo(id).getData();
  }

  /**
   * Delete the WireGuard Peer
   * Delete the WireGuard peer.
   * @param id Identifies the resource. (required)
   * @return ApiResponse&lt;WireguardPeerCreate202Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<WireguardPeerCreate202Response> wireguardPeerDeleteWithHttpInfo(UUID id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling wireguardPeerDelete");
    }
    
    // create path and map variables
    String localVarPath = "/wireguard_peers/{id}"
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

    GenericType<WireguardPeerCreate202Response> localVarReturnType = new GenericType<WireguardPeerCreate202Response>() {};

    return apiClient.invokeAPI("WireGuardInterfacesApi.wireguardPeerDelete", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Retrieve the WireGuard Peer
   * Retrieve the WireGuard peer.
   * @param id Identifies the resource. (required)
   * @return WireguardPeerCreate202Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public WireguardPeerCreate202Response wireguardPeerGet(UUID id) throws ApiException {
    return wireguardPeerGetWithHttpInfo(id).getData();
  }

  /**
   * Retrieve the WireGuard Peer
   * Retrieve the WireGuard peer.
   * @param id Identifies the resource. (required)
   * @return ApiResponse&lt;WireguardPeerCreate202Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<WireguardPeerCreate202Response> wireguardPeerGetWithHttpInfo(UUID id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling wireguardPeerGet");
    }
    
    // create path and map variables
    String localVarPath = "/wireguard_peers/{id}"
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

    GenericType<WireguardPeerCreate202Response> localVarReturnType = new GenericType<WireguardPeerCreate202Response>() {};

    return apiClient.invokeAPI("WireGuardInterfacesApi.wireguardPeerGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * List all WireGuard Peers
   * List all WireGuard peers.
   * @param id Identifies the resource. (required)
   * @param pageNumber The page number to load (optional, default to 1)
   * @param pageSize The size of the page (optional, default to 20)
   * @param filterWireguardInterfaceId The id of the associated WireGuard interface to filter on. (optional)
   * @return WireguardPeerList200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public WireguardPeerList200Response wireguardPeerList(UUID id, Integer pageNumber, Integer pageSize, UUID filterWireguardInterfaceId) throws ApiException {
    return wireguardPeerListWithHttpInfo(id, pageNumber, pageSize, filterWireguardInterfaceId).getData();
  }

  /**
   * List all WireGuard Peers
   * List all WireGuard peers.
   * @param id Identifies the resource. (required)
   * @param pageNumber The page number to load (optional, default to 1)
   * @param pageSize The size of the page (optional, default to 20)
   * @param filterWireguardInterfaceId The id of the associated WireGuard interface to filter on. (optional)
   * @return ApiResponse&lt;WireguardPeerList200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<WireguardPeerList200Response> wireguardPeerListWithHttpInfo(UUID id, Integer pageNumber, Integer pageSize, UUID filterWireguardInterfaceId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling wireguardPeerList");
    }
    
    // create path and map variables
    String localVarPath = "/wireguard_peers"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[number]", pageNumber));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[wireguard_interface_id]", filterWireguardInterfaceId));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    GenericType<WireguardPeerList200Response> localVarReturnType = new GenericType<WireguardPeerList200Response>() {};

    return apiClient.invokeAPI("WireGuardInterfacesApi.wireguardPeerList", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Update the WireGuard Peer
   * Update the WireGuard peer.
   * @param id Identifies the resource. (required)
   * @param wireguardPeerPatch  (required)
   * @return WireguardPeerCreate202Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check the &#39;detail&#39; field in response for details. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public WireguardPeerCreate202Response wireguardPeerUpdate(UUID id, WireguardPeerPatch wireguardPeerPatch) throws ApiException {
    return wireguardPeerUpdateWithHttpInfo(id, wireguardPeerPatch).getData();
  }

  /**
   * Update the WireGuard Peer
   * Update the WireGuard peer.
   * @param id Identifies the resource. (required)
   * @param wireguardPeerPatch  (required)
   * @return ApiResponse&lt;WireguardPeerCreate202Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check the &#39;detail&#39; field in response for details. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<WireguardPeerCreate202Response> wireguardPeerUpdateWithHttpInfo(UUID id, WireguardPeerPatch wireguardPeerPatch) throws ApiException {
    Object localVarPostBody = wireguardPeerPatch;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling wireguardPeerUpdate");
    }
    
    // verify the required parameter 'wireguardPeerPatch' is set
    if (wireguardPeerPatch == null) {
      throw new ApiException(400, "Missing the required parameter 'wireguardPeerPatch' when calling wireguardPeerUpdate");
    }
    
    // create path and map variables
    String localVarPath = "/wireguard_peers/{id}"
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

    GenericType<WireguardPeerCreate202Response> localVarReturnType = new GenericType<WireguardPeerCreate202Response>() {};

    return apiClient.invokeAPI("WireGuardInterfacesApi.wireguardPeerUpdate", localVarPath, "PATCH", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
