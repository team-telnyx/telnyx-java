package com.telnyx.sdk.api;

import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.Pair;

import jakarta.ws.rs.core.GenericType;

import com.telnyx.sdk.model.CreatePrivateWirelessGateway202Response;
import com.telnyx.sdk.model.CreatePrivateWirelessGatewayRequest;
import com.telnyx.sdk.model.Error;
import com.telnyx.sdk.model.Errors;
import com.telnyx.sdk.model.GetPrivateWirelessGateways200Response;
import java.util.UUID;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class PrivateWirelessGatewaysApi {
  private ApiClient apiClient;

  public PrivateWirelessGatewaysApi() {
    this(Configuration.getDefaultApiClient());
  }

  public PrivateWirelessGatewaysApi(ApiClient apiClient) {
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
   * Create a Private Wireless Gateway
   * Asynchronously create a Private Wireless Gateway for SIM cards for a previously created network.
   * @param createPrivateWirelessGatewayRequest  (required)
   * @return CreatePrivateWirelessGateway202Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 202 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check the &#39;detail&#39; field in response for details. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public CreatePrivateWirelessGateway202Response createPrivateWirelessGateway(CreatePrivateWirelessGatewayRequest createPrivateWirelessGatewayRequest) throws ApiException {
    return createPrivateWirelessGatewayWithHttpInfo(createPrivateWirelessGatewayRequest).getData();
  }

  /**
   * Create a Private Wireless Gateway
   * Asynchronously create a Private Wireless Gateway for SIM cards for a previously created network.
   * @param createPrivateWirelessGatewayRequest  (required)
   * @return ApiResponse&lt;CreatePrivateWirelessGateway202Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 202 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check the &#39;detail&#39; field in response for details. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CreatePrivateWirelessGateway202Response> createPrivateWirelessGatewayWithHttpInfo(CreatePrivateWirelessGatewayRequest createPrivateWirelessGatewayRequest) throws ApiException {
    Object localVarPostBody = createPrivateWirelessGatewayRequest;
    
    // verify the required parameter 'createPrivateWirelessGatewayRequest' is set
    if (createPrivateWirelessGatewayRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'createPrivateWirelessGatewayRequest' when calling createPrivateWirelessGateway");
    }
    
    // create path and map variables
    String localVarPath = "/private_wireless_gateways";

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

    GenericType<CreatePrivateWirelessGateway202Response> localVarReturnType = new GenericType<CreatePrivateWirelessGateway202Response>() {};

    return apiClient.invokeAPI("PrivateWirelessGatewaysApi.createPrivateWirelessGateway", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Delete a Private Wireless Gateway
   * Deletes the Private Wireless Gateway.
   * @param id Identifies the resource. (required)
   * @return CreatePrivateWirelessGateway202Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public CreatePrivateWirelessGateway202Response deleteWirelessGateway(UUID id) throws ApiException {
    return deleteWirelessGatewayWithHttpInfo(id).getData();
  }

  /**
   * Delete a Private Wireless Gateway
   * Deletes the Private Wireless Gateway.
   * @param id Identifies the resource. (required)
   * @return ApiResponse&lt;CreatePrivateWirelessGateway202Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CreatePrivateWirelessGateway202Response> deleteWirelessGatewayWithHttpInfo(UUID id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling deleteWirelessGateway");
    }
    
    // create path and map variables
    String localVarPath = "/private_wireless_gateways/{id}"
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

    GenericType<CreatePrivateWirelessGateway202Response> localVarReturnType = new GenericType<CreatePrivateWirelessGateway202Response>() {};

    return apiClient.invokeAPI("PrivateWirelessGatewaysApi.deleteWirelessGateway", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get a Private Wireless Gateway
   * Retrieve information about a Private Wireless Gateway.
   * @param id Identifies the resource. (required)
   * @return CreatePrivateWirelessGateway202Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public CreatePrivateWirelessGateway202Response getPrivateWirelessGateway(UUID id) throws ApiException {
    return getPrivateWirelessGatewayWithHttpInfo(id).getData();
  }

  /**
   * Get a Private Wireless Gateway
   * Retrieve information about a Private Wireless Gateway.
   * @param id Identifies the resource. (required)
   * @return ApiResponse&lt;CreatePrivateWirelessGateway202Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CreatePrivateWirelessGateway202Response> getPrivateWirelessGatewayWithHttpInfo(UUID id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getPrivateWirelessGateway");
    }
    
    // create path and map variables
    String localVarPath = "/private_wireless_gateways/{id}"
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

    GenericType<CreatePrivateWirelessGateway202Response> localVarReturnType = new GenericType<CreatePrivateWirelessGateway202Response>() {};

    return apiClient.invokeAPI("PrivateWirelessGatewaysApi.getPrivateWirelessGateway", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get all Private Wireless Gateways
   * Get all Private Wireless Gateways belonging to the user.
   * @param pageNumber The page number to load (optional, default to 1)
   * @param pageSize The size of the page (optional, default to 20)
   * @param filterName The name of the Private Wireless Gateway. (optional)
   * @param filterIpRange The IP address range of the Private Wireless Gateway. (optional)
   * @param filterRegionCode The name of the region where the Private Wireless Gateway is deployed. (optional)
   * @param filterCreatedAt Private Wireless Gateway resource creation date. (optional)
   * @param filterUpdatedAt When the Private Wireless Gateway was last updated. (optional)
   * @return GetPrivateWirelessGateways200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public GetPrivateWirelessGateways200Response getPrivateWirelessGateways(Integer pageNumber, Integer pageSize, String filterName, String filterIpRange, String filterRegionCode, String filterCreatedAt, String filterUpdatedAt) throws ApiException {
    return getPrivateWirelessGatewaysWithHttpInfo(pageNumber, pageSize, filterName, filterIpRange, filterRegionCode, filterCreatedAt, filterUpdatedAt).getData();
  }

  /**
   * Get all Private Wireless Gateways
   * Get all Private Wireless Gateways belonging to the user.
   * @param pageNumber The page number to load (optional, default to 1)
   * @param pageSize The size of the page (optional, default to 20)
   * @param filterName The name of the Private Wireless Gateway. (optional)
   * @param filterIpRange The IP address range of the Private Wireless Gateway. (optional)
   * @param filterRegionCode The name of the region where the Private Wireless Gateway is deployed. (optional)
   * @param filterCreatedAt Private Wireless Gateway resource creation date. (optional)
   * @param filterUpdatedAt When the Private Wireless Gateway was last updated. (optional)
   * @return ApiResponse&lt;GetPrivateWirelessGateways200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GetPrivateWirelessGateways200Response> getPrivateWirelessGatewaysWithHttpInfo(Integer pageNumber, Integer pageSize, String filterName, String filterIpRange, String filterRegionCode, String filterCreatedAt, String filterUpdatedAt) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/private_wireless_gateways";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[number]", pageNumber));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[name]", filterName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[ip_range]", filterIpRange));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[region_code]", filterRegionCode));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[created_at]", filterCreatedAt));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[updated_at]", filterUpdatedAt));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    GenericType<GetPrivateWirelessGateways200Response> localVarReturnType = new GenericType<GetPrivateWirelessGateways200Response>() {};

    return apiClient.invokeAPI("PrivateWirelessGatewaysApi.getPrivateWirelessGateways", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
