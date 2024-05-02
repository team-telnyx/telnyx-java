package com.telnyx.sdk.api;

import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.Pair;

import jakarta.ws.rs.core.GenericType;

import com.telnyx.sdk.model.CreateWireguardInterface202Response;
import com.telnyx.sdk.model.CreateWireguardPeer202Response;
import com.telnyx.sdk.model.Errors;
import com.telnyx.sdk.model.GetWireguardPeerAllowedIp200Response;
import com.telnyx.sdk.model.ListWireguardInterfaces200Response;
import com.telnyx.sdk.model.ListWireguardPeerAllowedIps200Response;
import com.telnyx.sdk.model.ListWireguardPeers200Response;
import java.util.UUID;
import com.telnyx.sdk.model.WireguardInterfaceCreate;
import com.telnyx.sdk.model.WireguardPeerCreate;
import com.telnyx.sdk.model.WireguardPeerPatch;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
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
   * @return CreateWireguardInterface202Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 202 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check the &#39;detail&#39; field in response for details. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public CreateWireguardInterface202Response createWireguardInterface(WireguardInterfaceCreate wireguardInterfaceCreate) throws ApiException {
    return createWireguardInterfaceWithHttpInfo(wireguardInterfaceCreate).getData();
  }

  /**
   * Create a WireGuard Interface
   * Create a new WireGuard Interface. Current limitation of 10 interfaces per user can be created.
   * @param wireguardInterfaceCreate  (required)
   * @return ApiResponse&lt;CreateWireguardInterface202Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 202 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check the &#39;detail&#39; field in response for details. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CreateWireguardInterface202Response> createWireguardInterfaceWithHttpInfo(WireguardInterfaceCreate wireguardInterfaceCreate) throws ApiException {
    Object localVarPostBody = wireguardInterfaceCreate;
    
    // verify the required parameter 'wireguardInterfaceCreate' is set
    if (wireguardInterfaceCreate == null) {
      throw new ApiException(400, "Missing the required parameter 'wireguardInterfaceCreate' when calling createWireguardInterface");
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

    GenericType<CreateWireguardInterface202Response> localVarReturnType = new GenericType<CreateWireguardInterface202Response>() {};

    return apiClient.invokeAPI("WireGuardInterfacesApi.createWireguardInterface", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Create a WireGuard Peer
   * Create a new WireGuard Peer. Current limitation of 5 peers per interface can be created.
   * @param id Identifies the resource. (required)
   * @param wireguardPeerCreate  (required)
   * @return CreateWireguardPeer202Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 202 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check the &#39;detail&#39; field in response for details. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public CreateWireguardPeer202Response createWireguardPeer(UUID id, WireguardPeerCreate wireguardPeerCreate) throws ApiException {
    return createWireguardPeerWithHttpInfo(id, wireguardPeerCreate).getData();
  }

  /**
   * Create a WireGuard Peer
   * Create a new WireGuard Peer. Current limitation of 5 peers per interface can be created.
   * @param id Identifies the resource. (required)
   * @param wireguardPeerCreate  (required)
   * @return ApiResponse&lt;CreateWireguardPeer202Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 202 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check the &#39;detail&#39; field in response for details. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CreateWireguardPeer202Response> createWireguardPeerWithHttpInfo(UUID id, WireguardPeerCreate wireguardPeerCreate) throws ApiException {
    Object localVarPostBody = wireguardPeerCreate;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling createWireguardPeer");
    }
    
    // verify the required parameter 'wireguardPeerCreate' is set
    if (wireguardPeerCreate == null) {
      throw new ApiException(400, "Missing the required parameter 'wireguardPeerCreate' when calling createWireguardPeer");
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

    GenericType<CreateWireguardPeer202Response> localVarReturnType = new GenericType<CreateWireguardPeer202Response>() {};

    return apiClient.invokeAPI("WireGuardInterfacesApi.createWireguardPeer", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Delete a WireGuard Interface
   * Delete a WireGuard Interface.
   * @param id Identifies the resource. (required)
   * @return CreateWireguardInterface202Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public CreateWireguardInterface202Response deleteWireguardInterface(UUID id) throws ApiException {
    return deleteWireguardInterfaceWithHttpInfo(id).getData();
  }

  /**
   * Delete a WireGuard Interface
   * Delete a WireGuard Interface.
   * @param id Identifies the resource. (required)
   * @return ApiResponse&lt;CreateWireguardInterface202Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CreateWireguardInterface202Response> deleteWireguardInterfaceWithHttpInfo(UUID id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling deleteWireguardInterface");
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

    GenericType<CreateWireguardInterface202Response> localVarReturnType = new GenericType<CreateWireguardInterface202Response>() {};

    return apiClient.invokeAPI("WireGuardInterfacesApi.deleteWireguardInterface", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Delete the WireGuard Peer
   * Delete the WireGuard peer.
   * @param id Identifies the resource. (required)
   * @return CreateWireguardPeer202Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public CreateWireguardPeer202Response deleteWireguardPeer(UUID id) throws ApiException {
    return deleteWireguardPeerWithHttpInfo(id).getData();
  }

  /**
   * Delete the WireGuard Peer
   * Delete the WireGuard peer.
   * @param id Identifies the resource. (required)
   * @return ApiResponse&lt;CreateWireguardPeer202Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CreateWireguardPeer202Response> deleteWireguardPeerWithHttpInfo(UUID id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling deleteWireguardPeer");
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

    GenericType<CreateWireguardPeer202Response> localVarReturnType = new GenericType<CreateWireguardPeer202Response>() {};

    return apiClient.invokeAPI("WireGuardInterfacesApi.deleteWireguardPeer", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Retrieve a WireGuard Interfaces
   * Retrieve a WireGuard Interfaces.
   * @param id Identifies the resource. (required)
   * @return CreateWireguardInterface202Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public CreateWireguardInterface202Response getWireguardInterface(UUID id) throws ApiException {
    return getWireguardInterfaceWithHttpInfo(id).getData();
  }

  /**
   * Retrieve a WireGuard Interfaces
   * Retrieve a WireGuard Interfaces.
   * @param id Identifies the resource. (required)
   * @return ApiResponse&lt;CreateWireguardInterface202Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CreateWireguardInterface202Response> getWireguardInterfaceWithHttpInfo(UUID id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getWireguardInterface");
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

    GenericType<CreateWireguardInterface202Response> localVarReturnType = new GenericType<CreateWireguardInterface202Response>() {};

    return apiClient.invokeAPI("WireGuardInterfacesApi.getWireguardInterface", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Retrieve the WireGuard Peer
   * Retrieve the WireGuard peer.
   * @param id Identifies the resource. (required)
   * @return CreateWireguardPeer202Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public CreateWireguardPeer202Response getWireguardPeer(UUID id) throws ApiException {
    return getWireguardPeerWithHttpInfo(id).getData();
  }

  /**
   * Retrieve the WireGuard Peer
   * Retrieve the WireGuard peer.
   * @param id Identifies the resource. (required)
   * @return ApiResponse&lt;CreateWireguardPeer202Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CreateWireguardPeer202Response> getWireguardPeerWithHttpInfo(UUID id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getWireguardPeer");
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

    GenericType<CreateWireguardPeer202Response> localVarReturnType = new GenericType<CreateWireguardPeer202Response>() {};

    return apiClient.invokeAPI("WireGuardInterfacesApi.getWireguardPeer", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Retrieve the Allowed IP
   * Retrieve the Allowed IP.
   * @param id Identifies the resource. (required)
   * @param childId Identifies the child resource (required)
   * @return GetWireguardPeerAllowedIp200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public GetWireguardPeerAllowedIp200Response getWireguardPeerAllowedIp(UUID id, UUID childId) throws ApiException {
    return getWireguardPeerAllowedIpWithHttpInfo(id, childId).getData();
  }

  /**
   * Retrieve the Allowed IP
   * Retrieve the Allowed IP.
   * @param id Identifies the resource. (required)
   * @param childId Identifies the child resource (required)
   * @return ApiResponse&lt;GetWireguardPeerAllowedIp200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GetWireguardPeerAllowedIp200Response> getWireguardPeerAllowedIpWithHttpInfo(UUID id, UUID childId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getWireguardPeerAllowedIp");
    }
    
    // verify the required parameter 'childId' is set
    if (childId == null) {
      throw new ApiException(400, "Missing the required parameter 'childId' when calling getWireguardPeerAllowedIp");
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

    GenericType<GetWireguardPeerAllowedIp200Response> localVarReturnType = new GenericType<GetWireguardPeerAllowedIp200Response>() {};

    return apiClient.invokeAPI("WireGuardInterfacesApi.getWireguardPeerAllowedIp", localVarPath, "GET", localVarQueryParams, localVarPostBody,
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
  public String getWireguardPeerConfig(UUID id) throws ApiException {
    return getWireguardPeerConfigWithHttpInfo(id).getData();
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
  public ApiResponse<String> getWireguardPeerConfigWithHttpInfo(UUID id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getWireguardPeerConfig");
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

    return apiClient.invokeAPI("WireGuardInterfacesApi.getWireguardPeerConfig", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * List all WireGuard Interfaces
   * List all WireGuard Interfaces.
   * @param pageNumber The page number to load (optional, default to 1)
   * @param pageSize The size of the page (optional, default to 20)
   * @param filterNetworkId The associated network id to filter on. (optional)
   * @return ListWireguardInterfaces200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ListWireguardInterfaces200Response listWireguardInterfaces(Integer pageNumber, Integer pageSize, String filterNetworkId) throws ApiException {
    return listWireguardInterfacesWithHttpInfo(pageNumber, pageSize, filterNetworkId).getData();
  }

  /**
   * List all WireGuard Interfaces
   * List all WireGuard Interfaces.
   * @param pageNumber The page number to load (optional, default to 1)
   * @param pageSize The size of the page (optional, default to 20)
   * @param filterNetworkId The associated network id to filter on. (optional)
   * @return ApiResponse&lt;ListWireguardInterfaces200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ListWireguardInterfaces200Response> listWireguardInterfacesWithHttpInfo(Integer pageNumber, Integer pageSize, String filterNetworkId) throws ApiException {
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

    GenericType<ListWireguardInterfaces200Response> localVarReturnType = new GenericType<ListWireguardInterfaces200Response>() {};

    return apiClient.invokeAPI("WireGuardInterfacesApi.listWireguardInterfaces", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * List all Allowed IPs for a WireGuard Peer
   * List all Allowed IPs for a WireGuard peer.
   * @param id Identifies the resource. (required)
   * @param pageNumber The page number to load (optional, default to 1)
   * @param pageSize The size of the page (optional, default to 20)
   * @return ListWireguardPeerAllowedIps200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ListWireguardPeerAllowedIps200Response listWireguardPeerAllowedIps(UUID id, Integer pageNumber, Integer pageSize) throws ApiException {
    return listWireguardPeerAllowedIpsWithHttpInfo(id, pageNumber, pageSize).getData();
  }

  /**
   * List all Allowed IPs for a WireGuard Peer
   * List all Allowed IPs for a WireGuard peer.
   * @param id Identifies the resource. (required)
   * @param pageNumber The page number to load (optional, default to 1)
   * @param pageSize The size of the page (optional, default to 20)
   * @return ApiResponse&lt;ListWireguardPeerAllowedIps200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ListWireguardPeerAllowedIps200Response> listWireguardPeerAllowedIpsWithHttpInfo(UUID id, Integer pageNumber, Integer pageSize) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling listWireguardPeerAllowedIps");
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

    GenericType<ListWireguardPeerAllowedIps200Response> localVarReturnType = new GenericType<ListWireguardPeerAllowedIps200Response>() {};

    return apiClient.invokeAPI("WireGuardInterfacesApi.listWireguardPeerAllowedIps", localVarPath, "GET", localVarQueryParams, localVarPostBody,
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
   * @return ListWireguardPeers200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ListWireguardPeers200Response listWireguardPeers(UUID id, Integer pageNumber, Integer pageSize, UUID filterWireguardInterfaceId) throws ApiException {
    return listWireguardPeersWithHttpInfo(id, pageNumber, pageSize, filterWireguardInterfaceId).getData();
  }

  /**
   * List all WireGuard Peers
   * List all WireGuard peers.
   * @param id Identifies the resource. (required)
   * @param pageNumber The page number to load (optional, default to 1)
   * @param pageSize The size of the page (optional, default to 20)
   * @param filterWireguardInterfaceId The id of the associated WireGuard interface to filter on. (optional)
   * @return ApiResponse&lt;ListWireguardPeers200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ListWireguardPeers200Response> listWireguardPeersWithHttpInfo(UUID id, Integer pageNumber, Integer pageSize, UUID filterWireguardInterfaceId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling listWireguardPeers");
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

    GenericType<ListWireguardPeers200Response> localVarReturnType = new GenericType<ListWireguardPeers200Response>() {};

    return apiClient.invokeAPI("WireGuardInterfacesApi.listWireguardPeers", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Update the WireGuard Peer
   * Update the WireGuard peer.
   * @param id Identifies the resource. (required)
   * @param wireguardPeerPatch  (required)
   * @return CreateWireguardPeer202Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check the &#39;detail&#39; field in response for details. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public CreateWireguardPeer202Response updateWireguardPeer(UUID id, WireguardPeerPatch wireguardPeerPatch) throws ApiException {
    return updateWireguardPeerWithHttpInfo(id, wireguardPeerPatch).getData();
  }

  /**
   * Update the WireGuard Peer
   * Update the WireGuard peer.
   * @param id Identifies the resource. (required)
   * @param wireguardPeerPatch  (required)
   * @return ApiResponse&lt;CreateWireguardPeer202Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check the &#39;detail&#39; field in response for details. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CreateWireguardPeer202Response> updateWireguardPeerWithHttpInfo(UUID id, WireguardPeerPatch wireguardPeerPatch) throws ApiException {
    Object localVarPostBody = wireguardPeerPatch;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling updateWireguardPeer");
    }
    
    // verify the required parameter 'wireguardPeerPatch' is set
    if (wireguardPeerPatch == null) {
      throw new ApiException(400, "Missing the required parameter 'wireguardPeerPatch' when calling updateWireguardPeer");
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

    GenericType<CreateWireguardPeer202Response> localVarReturnType = new GenericType<CreateWireguardPeer202Response>() {};

    return apiClient.invokeAPI("WireGuardInterfacesApi.updateWireguardPeer", localVarPath, "PATCH", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
