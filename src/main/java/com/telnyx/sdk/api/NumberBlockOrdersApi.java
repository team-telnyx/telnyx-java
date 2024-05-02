package com.telnyx.sdk.api;

import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.Pair;

import jakarta.ws.rs.core.GenericType;

import com.telnyx.sdk.model.CreateNumberBlockOrderRequest;
import com.telnyx.sdk.model.Errors;
import com.telnyx.sdk.model.ListNumberBlockOrdersResponse;
import com.telnyx.sdk.model.NumberBlockOrderResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class NumberBlockOrdersApi {
  private ApiClient apiClient;

  public NumberBlockOrdersApi() {
    this(Configuration.getDefaultApiClient());
  }

  public NumberBlockOrdersApi(ApiClient apiClient) {
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
   * Create a number block order
   * Creates a phone number block order.
   * @param createNumberBlockOrderRequest  (required)
   * @return NumberBlockOrderResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response with details about a number block order. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public NumberBlockOrderResponse createNumberBlockOrder(CreateNumberBlockOrderRequest createNumberBlockOrderRequest) throws ApiException {
    return createNumberBlockOrderWithHttpInfo(createNumberBlockOrderRequest).getData();
  }

  /**
   * Create a number block order
   * Creates a phone number block order.
   * @param createNumberBlockOrderRequest  (required)
   * @return ApiResponse&lt;NumberBlockOrderResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response with details about a number block order. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<NumberBlockOrderResponse> createNumberBlockOrderWithHttpInfo(CreateNumberBlockOrderRequest createNumberBlockOrderRequest) throws ApiException {
    Object localVarPostBody = createNumberBlockOrderRequest;
    
    // verify the required parameter 'createNumberBlockOrderRequest' is set
    if (createNumberBlockOrderRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'createNumberBlockOrderRequest' when calling createNumberBlockOrder");
    }
    
    // create path and map variables
    String localVarPath = "/number_block_orders";

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

    GenericType<NumberBlockOrderResponse> localVarReturnType = new GenericType<NumberBlockOrderResponse>() {};

    return apiClient.invokeAPI("NumberBlockOrdersApi.createNumberBlockOrder", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * List number block orders
   * Get a paginated list of number block orders.
   * @param filterStatus Filter number block orders by status. (optional)
   * @param filterCreatedAtGt Filter number block orders later than this value. (optional)
   * @param filterCreatedAtLt Filter number block orders earlier than this value. (optional)
   * @param filterPhoneNumbersStartingNumber Filter number block  orders having these phone numbers. (optional)
   * @param pageNumber The page number to load (optional, default to 1)
   * @param pageSize The size of the page (optional, default to 20)
   * @return ListNumberBlockOrdersResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response with a list of number block orders. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ListNumberBlockOrdersResponse listNumberBlockOrders(String filterStatus, String filterCreatedAtGt, String filterCreatedAtLt, String filterPhoneNumbersStartingNumber, Integer pageNumber, Integer pageSize) throws ApiException {
    return listNumberBlockOrdersWithHttpInfo(filterStatus, filterCreatedAtGt, filterCreatedAtLt, filterPhoneNumbersStartingNumber, pageNumber, pageSize).getData();
  }

  /**
   * List number block orders
   * Get a paginated list of number block orders.
   * @param filterStatus Filter number block orders by status. (optional)
   * @param filterCreatedAtGt Filter number block orders later than this value. (optional)
   * @param filterCreatedAtLt Filter number block orders earlier than this value. (optional)
   * @param filterPhoneNumbersStartingNumber Filter number block  orders having these phone numbers. (optional)
   * @param pageNumber The page number to load (optional, default to 1)
   * @param pageSize The size of the page (optional, default to 20)
   * @return ApiResponse&lt;ListNumberBlockOrdersResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response with a list of number block orders. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ListNumberBlockOrdersResponse> listNumberBlockOrdersWithHttpInfo(String filterStatus, String filterCreatedAtGt, String filterCreatedAtLt, String filterPhoneNumbersStartingNumber, Integer pageNumber, Integer pageSize) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/number_block_orders";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[status]", filterStatus));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[created_at][gt]", filterCreatedAtGt));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[created_at][lt]", filterCreatedAtLt));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[phone_numbers.starting_number]", filterPhoneNumbersStartingNumber));
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

    GenericType<ListNumberBlockOrdersResponse> localVarReturnType = new GenericType<ListNumberBlockOrdersResponse>() {};

    return apiClient.invokeAPI("NumberBlockOrdersApi.listNumberBlockOrders", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Retrieve a number block order
   * Get an existing phone number block order.
   * @param numberBlockOrderId The number block order ID. (required)
   * @return NumberBlockOrderResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response with details about a number block order. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public NumberBlockOrderResponse retrieveNumberBlockOrder(String numberBlockOrderId) throws ApiException {
    return retrieveNumberBlockOrderWithHttpInfo(numberBlockOrderId).getData();
  }

  /**
   * Retrieve a number block order
   * Get an existing phone number block order.
   * @param numberBlockOrderId The number block order ID. (required)
   * @return ApiResponse&lt;NumberBlockOrderResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response with details about a number block order. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<NumberBlockOrderResponse> retrieveNumberBlockOrderWithHttpInfo(String numberBlockOrderId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'numberBlockOrderId' is set
    if (numberBlockOrderId == null) {
      throw new ApiException(400, "Missing the required parameter 'numberBlockOrderId' when calling retrieveNumberBlockOrder");
    }
    
    // create path and map variables
    String localVarPath = "/number_block_orders/{number_block_order_id}"
      .replaceAll("\\{" + "number_block_order_id" + "\\}", apiClient.escapeString(numberBlockOrderId.toString()));

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

    GenericType<NumberBlockOrderResponse> localVarReturnType = new GenericType<NumberBlockOrderResponse>() {};

    return apiClient.invokeAPI("NumberBlockOrdersApi.retrieveNumberBlockOrder", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
