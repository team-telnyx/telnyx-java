package com.telnyx.sdk.api;

import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.Pair;

import jakarta.ws.rs.core.GenericType;

import com.telnyx.sdk.model.CreateRoomClientToken201Response;
import com.telnyx.sdk.model.CreateRoomClientTokenRequest;
import com.telnyx.sdk.model.Error;
import com.telnyx.sdk.model.RefreshRoomClientToken201Response;
import com.telnyx.sdk.model.RefreshRoomClientTokenRequest;
import java.util.UUID;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class RoomsClientTokensApi {
  private ApiClient apiClient;

  public RoomsClientTokensApi() {
    this(Configuration.getDefaultApiClient());
  }

  public RoomsClientTokensApi(ApiClient apiClient) {
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
   * Create Client Token to join a room.
   * Synchronously create an Client Token to join a Room. Client Token is necessary to join a Telnyx Room. Client Token will expire after &#x60;token_ttl_secs&#x60;, a Refresh Token is also provided to refresh a Client Token, the Refresh Token expires after &#x60;refresh_token_ttl_secs&#x60;.
   * @param roomId The unique identifier of a room. (required)
   * @param createRoomClientTokenRequest Parameters that can be defined during Room Client Token creation. (required)
   * @return CreateRoomClientToken201Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Create room client token response. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
     </table>
   */
  public CreateRoomClientToken201Response createRoomClientToken(UUID roomId, CreateRoomClientTokenRequest createRoomClientTokenRequest) throws ApiException {
    return createRoomClientTokenWithHttpInfo(roomId, createRoomClientTokenRequest).getData();
  }

  /**
   * Create Client Token to join a room.
   * Synchronously create an Client Token to join a Room. Client Token is necessary to join a Telnyx Room. Client Token will expire after &#x60;token_ttl_secs&#x60;, a Refresh Token is also provided to refresh a Client Token, the Refresh Token expires after &#x60;refresh_token_ttl_secs&#x60;.
   * @param roomId The unique identifier of a room. (required)
   * @param createRoomClientTokenRequest Parameters that can be defined during Room Client Token creation. (required)
   * @return ApiResponse&lt;CreateRoomClientToken201Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Create room client token response. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CreateRoomClientToken201Response> createRoomClientTokenWithHttpInfo(UUID roomId, CreateRoomClientTokenRequest createRoomClientTokenRequest) throws ApiException {
    Object localVarPostBody = createRoomClientTokenRequest;
    
    // verify the required parameter 'roomId' is set
    if (roomId == null) {
      throw new ApiException(400, "Missing the required parameter 'roomId' when calling createRoomClientToken");
    }
    
    // verify the required parameter 'createRoomClientTokenRequest' is set
    if (createRoomClientTokenRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'createRoomClientTokenRequest' when calling createRoomClientToken");
    }
    
    // create path and map variables
    String localVarPath = "/rooms/{room_id}/actions/generate_join_client_token"
      .replaceAll("\\{" + "room_id" + "\\}", apiClient.escapeString(roomId.toString()));

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

    GenericType<CreateRoomClientToken201Response> localVarReturnType = new GenericType<CreateRoomClientToken201Response>() {};

    return apiClient.invokeAPI("RoomsClientTokensApi.createRoomClientToken", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Refresh Client Token to join a room.
   * Synchronously refresh an Client Token to join a Room. Client Token is necessary to join a Telnyx Room. Client Token will expire after &#x60;token_ttl_secs&#x60;.
   * @param roomId The unique identifier of a room. (required)
   * @param refreshRoomClientTokenRequest Parameters that can be defined during Room Client Token refresh. (required)
   * @return RefreshRoomClientToken201Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Refresh room client token response. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
     </table>
   */
  public RefreshRoomClientToken201Response refreshRoomClientToken(UUID roomId, RefreshRoomClientTokenRequest refreshRoomClientTokenRequest) throws ApiException {
    return refreshRoomClientTokenWithHttpInfo(roomId, refreshRoomClientTokenRequest).getData();
  }

  /**
   * Refresh Client Token to join a room.
   * Synchronously refresh an Client Token to join a Room. Client Token is necessary to join a Telnyx Room. Client Token will expire after &#x60;token_ttl_secs&#x60;.
   * @param roomId The unique identifier of a room. (required)
   * @param refreshRoomClientTokenRequest Parameters that can be defined during Room Client Token refresh. (required)
   * @return ApiResponse&lt;RefreshRoomClientToken201Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Refresh room client token response. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<RefreshRoomClientToken201Response> refreshRoomClientTokenWithHttpInfo(UUID roomId, RefreshRoomClientTokenRequest refreshRoomClientTokenRequest) throws ApiException {
    Object localVarPostBody = refreshRoomClientTokenRequest;
    
    // verify the required parameter 'roomId' is set
    if (roomId == null) {
      throw new ApiException(400, "Missing the required parameter 'roomId' when calling refreshRoomClientToken");
    }
    
    // verify the required parameter 'refreshRoomClientTokenRequest' is set
    if (refreshRoomClientTokenRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'refreshRoomClientTokenRequest' when calling refreshRoomClientToken");
    }
    
    // create path and map variables
    String localVarPath = "/rooms/{room_id}/actions/refresh_client_token"
      .replaceAll("\\{" + "room_id" + "\\}", apiClient.escapeString(roomId.toString()));

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

    String[] localVarAuthNames = new String[] {  };

    GenericType<RefreshRoomClientToken201Response> localVarReturnType = new GenericType<RefreshRoomClientToken201Response>() {};

    return apiClient.invokeAPI("RoomsClientTokensApi.refreshRoomClientToken", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
