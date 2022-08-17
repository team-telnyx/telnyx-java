package com.telnyx.sdk.api;

import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.Pair;

import javax.ws.rs.core.GenericType;

import com.telnyx.sdk.model.Errors;
import com.telnyx.sdk.model.PublicInternetGatewayCreate;
import com.telnyx.sdk.model.PublicInternetGatewayCreate202Response;
import com.telnyx.sdk.model.PublicInternetGatewayList200Response;
import java.util.UUID;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PublicInternetGatewaysApi {
  private ApiClient apiClient;

  public PublicInternetGatewaysApi() {
    this(Configuration.getDefaultApiClient());
  }

  public PublicInternetGatewaysApi(ApiClient apiClient) {
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
   * Create a Public Internet Gateway
   * Create a new Public Internet Gateway.
   * @param publicInternetGatewayCreate  (required)
   * @return PublicInternetGatewayCreate202Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 202 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check the &#39;detail&#39; field in response for details. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public PublicInternetGatewayCreate202Response publicInternetGatewayCreate(PublicInternetGatewayCreate publicInternetGatewayCreate) throws ApiException {
    return publicInternetGatewayCreateWithHttpInfo(publicInternetGatewayCreate).getData();
  }

  /**
   * Create a Public Internet Gateway
   * Create a new Public Internet Gateway.
   * @param publicInternetGatewayCreate  (required)
   * @return ApiResponse&lt;PublicInternetGatewayCreate202Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 202 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check the &#39;detail&#39; field in response for details. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<PublicInternetGatewayCreate202Response> publicInternetGatewayCreateWithHttpInfo(PublicInternetGatewayCreate publicInternetGatewayCreate) throws ApiException {
    Object localVarPostBody = publicInternetGatewayCreate;
    
    // verify the required parameter 'publicInternetGatewayCreate' is set
    if (publicInternetGatewayCreate == null) {
      throw new ApiException(400, "Missing the required parameter 'publicInternetGatewayCreate' when calling publicInternetGatewayCreate");
    }
    
    // create path and map variables
    String localVarPath = "/public_internet_gateways";

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

    GenericType<PublicInternetGatewayCreate202Response> localVarReturnType = new GenericType<PublicInternetGatewayCreate202Response>() {};

    return apiClient.invokeAPI("PublicInternetGatewaysApi.publicInternetGatewayCreate", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Delete a Public Internet Gateway
   * Delete a Public Internet Gateway.
   * @param id Identifies the resource. (required)
   * @return PublicInternetGatewayCreate202Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public PublicInternetGatewayCreate202Response publicInternetGatewayDelete(UUID id) throws ApiException {
    return publicInternetGatewayDeleteWithHttpInfo(id).getData();
  }

  /**
   * Delete a Public Internet Gateway
   * Delete a Public Internet Gateway.
   * @param id Identifies the resource. (required)
   * @return ApiResponse&lt;PublicInternetGatewayCreate202Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<PublicInternetGatewayCreate202Response> publicInternetGatewayDeleteWithHttpInfo(UUID id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling publicInternetGatewayDelete");
    }
    
    // create path and map variables
    String localVarPath = "/public_internet_gateways/{id}"
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

    GenericType<PublicInternetGatewayCreate202Response> localVarReturnType = new GenericType<PublicInternetGatewayCreate202Response>() {};

    return apiClient.invokeAPI("PublicInternetGatewaysApi.publicInternetGatewayDelete", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Retrieve a Public Internet Gateway
   * Retrieve a Public Internet Gateway.
   * @param id Identifies the resource. (required)
   * @return PublicInternetGatewayCreate202Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public PublicInternetGatewayCreate202Response publicInternetGatewayGet(UUID id) throws ApiException {
    return publicInternetGatewayGetWithHttpInfo(id).getData();
  }

  /**
   * Retrieve a Public Internet Gateway
   * Retrieve a Public Internet Gateway.
   * @param id Identifies the resource. (required)
   * @return ApiResponse&lt;PublicInternetGatewayCreate202Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<PublicInternetGatewayCreate202Response> publicInternetGatewayGetWithHttpInfo(UUID id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling publicInternetGatewayGet");
    }
    
    // create path and map variables
    String localVarPath = "/public_internet_gateways/{id}"
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

    GenericType<PublicInternetGatewayCreate202Response> localVarReturnType = new GenericType<PublicInternetGatewayCreate202Response>() {};

    return apiClient.invokeAPI("PublicInternetGatewaysApi.publicInternetGatewayGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * List all Public Internet Gateways
   * List all Public Internet Gateways.
   * @param pageNumber The page number to load (optional, default to 1)
   * @param pageSize The size of the page (optional, default to 20)
   * @param filterNetworkId The associated network id to filter on. (optional)
   * @return PublicInternetGatewayList200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public PublicInternetGatewayList200Response publicInternetGatewayList(Integer pageNumber, Integer pageSize, String filterNetworkId) throws ApiException {
    return publicInternetGatewayListWithHttpInfo(pageNumber, pageSize, filterNetworkId).getData();
  }

  /**
   * List all Public Internet Gateways
   * List all Public Internet Gateways.
   * @param pageNumber The page number to load (optional, default to 1)
   * @param pageSize The size of the page (optional, default to 20)
   * @param filterNetworkId The associated network id to filter on. (optional)
   * @return ApiResponse&lt;PublicInternetGatewayList200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<PublicInternetGatewayList200Response> publicInternetGatewayListWithHttpInfo(Integer pageNumber, Integer pageSize, String filterNetworkId) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/public_internet_gateways";

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

    GenericType<PublicInternetGatewayList200Response> localVarReturnType = new GenericType<PublicInternetGatewayList200Response>() {};

    return apiClient.invokeAPI("PublicInternetGatewaysApi.publicInternetGatewayList", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
