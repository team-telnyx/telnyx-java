package com.telnyx.sdk.api;

import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.Pair;

import jakarta.ws.rs.core.GenericType;

import com.telnyx.sdk.model.CreatePublicInternetGateway202Response;
import com.telnyx.sdk.model.Errors;
import com.telnyx.sdk.model.ListPublicInternetGateways200Response;
import com.telnyx.sdk.model.PublicInternetGatewayCreate;
import java.util.UUID;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
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
   * @return CreatePublicInternetGateway202Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 202 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check the &#39;detail&#39; field in response for details. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public CreatePublicInternetGateway202Response createPublicInternetGateway(PublicInternetGatewayCreate publicInternetGatewayCreate) throws ApiException {
    return createPublicInternetGatewayWithHttpInfo(publicInternetGatewayCreate).getData();
  }

  /**
   * Create a Public Internet Gateway
   * Create a new Public Internet Gateway.
   * @param publicInternetGatewayCreate  (required)
   * @return ApiResponse&lt;CreatePublicInternetGateway202Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 202 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check the &#39;detail&#39; field in response for details. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CreatePublicInternetGateway202Response> createPublicInternetGatewayWithHttpInfo(PublicInternetGatewayCreate publicInternetGatewayCreate) throws ApiException {
    Object localVarPostBody = publicInternetGatewayCreate;
    
    // verify the required parameter 'publicInternetGatewayCreate' is set
    if (publicInternetGatewayCreate == null) {
      throw new ApiException(400, "Missing the required parameter 'publicInternetGatewayCreate' when calling createPublicInternetGateway");
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

    GenericType<CreatePublicInternetGateway202Response> localVarReturnType = new GenericType<CreatePublicInternetGateway202Response>() {};

    return apiClient.invokeAPI("PublicInternetGatewaysApi.createPublicInternetGateway", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Delete a Public Internet Gateway
   * Delete a Public Internet Gateway.
   * @param id Identifies the resource. (required)
   * @return CreatePublicInternetGateway202Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public CreatePublicInternetGateway202Response deletePublicInternetGateway(UUID id) throws ApiException {
    return deletePublicInternetGatewayWithHttpInfo(id).getData();
  }

  /**
   * Delete a Public Internet Gateway
   * Delete a Public Internet Gateway.
   * @param id Identifies the resource. (required)
   * @return ApiResponse&lt;CreatePublicInternetGateway202Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CreatePublicInternetGateway202Response> deletePublicInternetGatewayWithHttpInfo(UUID id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling deletePublicInternetGateway");
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

    GenericType<CreatePublicInternetGateway202Response> localVarReturnType = new GenericType<CreatePublicInternetGateway202Response>() {};

    return apiClient.invokeAPI("PublicInternetGatewaysApi.deletePublicInternetGateway", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Retrieve a Public Internet Gateway
   * Retrieve a Public Internet Gateway.
   * @param id Identifies the resource. (required)
   * @return CreatePublicInternetGateway202Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public CreatePublicInternetGateway202Response getPublicInternetGateway(UUID id) throws ApiException {
    return getPublicInternetGatewayWithHttpInfo(id).getData();
  }

  /**
   * Retrieve a Public Internet Gateway
   * Retrieve a Public Internet Gateway.
   * @param id Identifies the resource. (required)
   * @return ApiResponse&lt;CreatePublicInternetGateway202Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CreatePublicInternetGateway202Response> getPublicInternetGatewayWithHttpInfo(UUID id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getPublicInternetGateway");
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

    GenericType<CreatePublicInternetGateway202Response> localVarReturnType = new GenericType<CreatePublicInternetGateway202Response>() {};

    return apiClient.invokeAPI("PublicInternetGatewaysApi.getPublicInternetGateway", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * List all Public Internet Gateways
   * List all Public Internet Gateways.
   * @param pageNumber The page number to load (optional, default to 1)
   * @param pageSize The size of the page (optional, default to 20)
   * @param filterNetworkId The associated network id to filter on. (optional)
   * @return ListPublicInternetGateways200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ListPublicInternetGateways200Response listPublicInternetGateways(Integer pageNumber, Integer pageSize, String filterNetworkId) throws ApiException {
    return listPublicInternetGatewaysWithHttpInfo(pageNumber, pageSize, filterNetworkId).getData();
  }

  /**
   * List all Public Internet Gateways
   * List all Public Internet Gateways.
   * @param pageNumber The page number to load (optional, default to 1)
   * @param pageSize The size of the page (optional, default to 20)
   * @param filterNetworkId The associated network id to filter on. (optional)
   * @return ApiResponse&lt;ListPublicInternetGateways200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ListPublicInternetGateways200Response> listPublicInternetGatewaysWithHttpInfo(Integer pageNumber, Integer pageSize, String filterNetworkId) throws ApiException {
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

    GenericType<ListPublicInternetGateways200Response> localVarReturnType = new GenericType<ListPublicInternetGateways200Response>() {};

    return apiClient.invokeAPI("PublicInternetGatewaysApi.listPublicInternetGateways", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
