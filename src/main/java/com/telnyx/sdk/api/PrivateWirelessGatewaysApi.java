package com.telnyx.sdk.api;

import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.Pair;

import javax.ws.rs.core.GenericType;

import com.telnyx.sdk.model.CreatePrivateWirelessGatewayResponse;
import com.telnyx.sdk.model.CreatePrivateWirelessGatwewayRequest;
import com.telnyx.sdk.model.DeletePrivateWirelessGatewayResponse;
import com.telnyx.sdk.model.Error;
import com.telnyx.sdk.model.Errors;
import com.telnyx.sdk.model.GetAllPrivateWirelessGatewaysResponse;
import com.telnyx.sdk.model.GetPrivateWirelessGatewayResponse;
import java.util.UUID;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
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
   * @param createPrivateWirelessGatwewayRequest  (required)
   * @return CreatePrivateWirelessGatewayResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 202 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check the &#39;detail&#39; field in response for details. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public CreatePrivateWirelessGatewayResponse createPrivateWirelessGateway(CreatePrivateWirelessGatwewayRequest createPrivateWirelessGatwewayRequest) throws ApiException {
    return createPrivateWirelessGatewayWithHttpInfo(createPrivateWirelessGatwewayRequest).getData();
  }

  /**
   * Create a Private Wireless Gateway
   * Asynchronously create a Private Wireless Gateway for SIM cards for a previously created network.
   * @param createPrivateWirelessGatwewayRequest  (required)
   * @return ApiResponse&lt;CreatePrivateWirelessGatewayResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 202 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check the &#39;detail&#39; field in response for details. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CreatePrivateWirelessGatewayResponse> createPrivateWirelessGatewayWithHttpInfo(CreatePrivateWirelessGatwewayRequest createPrivateWirelessGatwewayRequest) throws ApiException {
    Object localVarPostBody = createPrivateWirelessGatwewayRequest;
    
    // verify the required parameter 'createPrivateWirelessGatwewayRequest' is set
    if (createPrivateWirelessGatwewayRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'createPrivateWirelessGatwewayRequest' when calling createPrivateWirelessGateway");
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

    GenericType<CreatePrivateWirelessGatewayResponse> localVarReturnType = new GenericType<CreatePrivateWirelessGatewayResponse>() {};

    return apiClient.invokeAPI("PrivateWirelessGatewaysApi.createPrivateWirelessGateway", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Delete a Private Wireless Gateway
   * Deletes the Private Wireless Gateway.
   * @param id Identifies the resource. (required)
   * @return DeletePrivateWirelessGatewayResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public DeletePrivateWirelessGatewayResponse deletePrivateWirelessGateway(UUID id) throws ApiException {
    return deletePrivateWirelessGatewayWithHttpInfo(id).getData();
  }

  /**
   * Delete a Private Wireless Gateway
   * Deletes the Private Wireless Gateway.
   * @param id Identifies the resource. (required)
   * @return ApiResponse&lt;DeletePrivateWirelessGatewayResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<DeletePrivateWirelessGatewayResponse> deletePrivateWirelessGatewayWithHttpInfo(UUID id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling deletePrivateWirelessGateway");
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

    GenericType<DeletePrivateWirelessGatewayResponse> localVarReturnType = new GenericType<DeletePrivateWirelessGatewayResponse>() {};

    return apiClient.invokeAPI("PrivateWirelessGatewaysApi.deletePrivateWirelessGateway", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get a Private Wireless Gateway
   * Retrieve information about a Private Wireless Gateway.
   * @param id Identifies the resource. (required)
   * @return GetPrivateWirelessGatewayResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public GetPrivateWirelessGatewayResponse getPrivateWirelessGateway(UUID id) throws ApiException {
    return getPrivateWirelessGatewayWithHttpInfo(id).getData();
  }

  /**
   * Get a Private Wireless Gateway
   * Retrieve information about a Private Wireless Gateway.
   * @param id Identifies the resource. (required)
   * @return ApiResponse&lt;GetPrivateWirelessGatewayResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GetPrivateWirelessGatewayResponse> getPrivateWirelessGatewayWithHttpInfo(UUID id) throws ApiException {
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

    GenericType<GetPrivateWirelessGatewayResponse> localVarReturnType = new GenericType<GetPrivateWirelessGatewayResponse>() {};

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
   * @return GetAllPrivateWirelessGatewaysResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public GetAllPrivateWirelessGatewaysResponse getPrivateWirelessGateways(Integer pageNumber, Integer pageSize, String filterName, String filterIpRange, String filterRegionCode, String filterCreatedAt, String filterUpdatedAt) throws ApiException {
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
   * @return ApiResponse&lt;GetAllPrivateWirelessGatewaysResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GetAllPrivateWirelessGatewaysResponse> getPrivateWirelessGatewaysWithHttpInfo(Integer pageNumber, Integer pageSize, String filterName, String filterIpRange, String filterRegionCode, String filterCreatedAt, String filterUpdatedAt) throws ApiException {
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

    GenericType<GetAllPrivateWirelessGatewaysResponse> localVarReturnType = new GenericType<GetAllPrivateWirelessGatewaysResponse>() {};

    return apiClient.invokeAPI("PrivateWirelessGatewaysApi.getPrivateWirelessGateways", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
