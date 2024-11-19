package com.telnyx.sdk.api;

import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.Pair;

import javax.ws.rs.core.GenericType;

import com.telnyx.sdk.model.AdvancedOrderRequest;
import com.telnyx.sdk.model.ListVerifiedNumbersResponse;
import java.util.UUID;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class AdvancedNumberOrdersApi {
  private ApiClient apiClient;

  public AdvancedNumberOrdersApi() {
    this(Configuration.getDefaultApiClient());
  }

  public AdvancedNumberOrdersApi(ApiClient apiClient) {
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
   * Create Advanced Order
   * 
   * @param advancedOrderRequest  (required)
   * @return ListVerifiedNumbersResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ListVerifiedNumbersResponse createAdvancedOrderV2(AdvancedOrderRequest advancedOrderRequest) throws ApiException {
    return createAdvancedOrderV2WithHttpInfo(advancedOrderRequest).getData();
  }

  /**
   * Create Advanced Order
   * 
   * @param advancedOrderRequest  (required)
   * @return ApiResponse&lt;ListVerifiedNumbersResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ListVerifiedNumbersResponse> createAdvancedOrderV2WithHttpInfo(AdvancedOrderRequest advancedOrderRequest) throws ApiException {
    Object localVarPostBody = advancedOrderRequest;
    
    // verify the required parameter 'advancedOrderRequest' is set
    if (advancedOrderRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'advancedOrderRequest' when calling createAdvancedOrderV2");
    }
    
    // create path and map variables
    String localVarPath = "/advanced_orders";

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

    GenericType<ListVerifiedNumbersResponse> localVarReturnType = new GenericType<ListVerifiedNumbersResponse>() {};

    return apiClient.invokeAPI("AdvancedNumberOrdersApi.createAdvancedOrderV2", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get Advanced Order
   * 
   * @param orderId  (required)
   * @return AdvancedOrderRequest
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public AdvancedOrderRequest getAdvancedOrderV2(UUID orderId) throws ApiException {
    return getAdvancedOrderV2WithHttpInfo(orderId).getData();
  }

  /**
   * Get Advanced Order
   * 
   * @param orderId  (required)
   * @return ApiResponse&lt;AdvancedOrderRequest&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<AdvancedOrderRequest> getAdvancedOrderV2WithHttpInfo(UUID orderId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'orderId' is set
    if (orderId == null) {
      throw new ApiException(400, "Missing the required parameter 'orderId' when calling getAdvancedOrderV2");
    }
    
    // create path and map variables
    String localVarPath = "/advanced_orders/{order_id}"
      .replaceAll("\\{" + "order_id" + "\\}", apiClient.escapeString(orderId.toString()));

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

    GenericType<AdvancedOrderRequest> localVarReturnType = new GenericType<AdvancedOrderRequest>() {};

    return apiClient.invokeAPI("AdvancedNumberOrdersApi.getAdvancedOrderV2", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * List Advanced Orders
   * 
   * @return AdvancedOrderRequest
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public AdvancedOrderRequest listAdvancedOrdersV2() throws ApiException {
    return listAdvancedOrdersV2WithHttpInfo().getData();
  }

  /**
   * List Advanced Orders
   * 
   * @return ApiResponse&lt;AdvancedOrderRequest&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<AdvancedOrderRequest> listAdvancedOrdersV2WithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/advanced_orders";

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

    GenericType<AdvancedOrderRequest> localVarReturnType = new GenericType<AdvancedOrderRequest>() {};

    return apiClient.invokeAPI("AdvancedNumberOrdersApi.listAdvancedOrdersV2", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
