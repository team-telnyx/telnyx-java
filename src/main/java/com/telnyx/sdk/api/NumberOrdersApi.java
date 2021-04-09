package com.telnyx.sdk.api;

import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.Pair;

import javax.ws.rs.core.GenericType;

import com.telnyx.sdk.model.CreateNumberOrderRequest;
import com.telnyx.sdk.model.Errors;
import com.telnyx.sdk.model.ListNumberOrdersResponse;
import com.telnyx.sdk.model.NumberOrderResponse;
import com.telnyx.sdk.model.UpdateNumberOrderRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class NumberOrdersApi {
  private ApiClient apiClient;

  public NumberOrdersApi() {
    this(Configuration.getDefaultApiClient());
  }

  public NumberOrdersApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Get the API cilent
   *
   * @return API client
   */
  public ApiClient getApiClient() {
    return apiClient;
  }

  /**
   * Set the API cilent
   *
   * @param apiClient an instance of API client
   */
  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Create a number order
   * Creates a phone number order.
   * @param createNumberOrderRequest  (required)
   * @return NumberOrderResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response with details about a number order. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Bad Request </td><td>  -  </td></tr>
     </table>
   */
  public NumberOrderResponse createNumberOrder(CreateNumberOrderRequest createNumberOrderRequest) throws ApiException {
    return createNumberOrderWithHttpInfo(createNumberOrderRequest).getData();
  }

  /**
   * Create a number order
   * Creates a phone number order.
   * @param createNumberOrderRequest  (required)
   * @return ApiResponse&lt;NumberOrderResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response with details about a number order. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Bad Request </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<NumberOrderResponse> createNumberOrderWithHttpInfo(CreateNumberOrderRequest createNumberOrderRequest) throws ApiException {
    Object localVarPostBody = createNumberOrderRequest;
    
    // verify the required parameter 'createNumberOrderRequest' is set
    if (createNumberOrderRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'createNumberOrderRequest' when calling createNumberOrder");
    }
    
    // create path and map variables
    String localVarPath = "/number_orders";

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

    GenericType<NumberOrderResponse> localVarReturnType = new GenericType<NumberOrderResponse>() {};

    return apiClient.invokeAPI("NumberOrdersApi.createNumberOrder", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

private ApiResponse<ListNumberOrdersResponse> listNumberOrdersWithHttpInfo(String filterStatus, String filterCreatedAtGt, String filterCreatedAtLt, String filterPhoneNumbersPhoneNumber, String filterCustomerReference, Boolean filterRequirementsMet, Integer pageNumber, Integer pageSize) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/number_orders";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[status]", filterStatus));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[created_at][gt]", filterCreatedAtGt));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[created_at][lt]", filterCreatedAtLt));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[phone_numbers.phone_number]", filterPhoneNumbersPhoneNumber));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[customer_reference]", filterCustomerReference));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[requirements_met]", filterRequirementsMet));
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

    GenericType<ListNumberOrdersResponse> localVarReturnType = new GenericType<ListNumberOrdersResponse>() {};

    return apiClient.invokeAPI("NumberOrdersApi.listNumberOrders", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIlistNumberOrdersRequest {
    private String filterStatus;
    private String filterCreatedAtGt;
    private String filterCreatedAtLt;
    private String filterPhoneNumbersPhoneNumber;
    private String filterCustomerReference;
    private Boolean filterRequirementsMet;
    private Integer pageNumber;
    private Integer pageSize;

    private APIlistNumberOrdersRequest() {
    }

    /**
     * Set filterStatus
     * @param filterStatus Filter number orders by status. (optional)
     * @return APIlistNumberOrdersRequest
     */
    public APIlistNumberOrdersRequest filterStatus(String filterStatus) {
      this.filterStatus = filterStatus;
      return this;
    }

    /**
     * Set filterCreatedAtGt
     * @param filterCreatedAtGt Filter number orders later than this value. (optional)
     * @return APIlistNumberOrdersRequest
     */
    public APIlistNumberOrdersRequest filterCreatedAtGt(String filterCreatedAtGt) {
      this.filterCreatedAtGt = filterCreatedAtGt;
      return this;
    }

    /**
     * Set filterCreatedAtLt
     * @param filterCreatedAtLt Filter number orders earlier than this value. (optional)
     * @return APIlistNumberOrdersRequest
     */
    public APIlistNumberOrdersRequest filterCreatedAtLt(String filterCreatedAtLt) {
      this.filterCreatedAtLt = filterCreatedAtLt;
      return this;
    }

    /**
     * Set filterPhoneNumbersPhoneNumber
     * @param filterPhoneNumbersPhoneNumber Filter number orders having these phone numbers. (optional)
     * @return APIlistNumberOrdersRequest
     */
    public APIlistNumberOrdersRequest filterPhoneNumbersPhoneNumber(String filterPhoneNumbersPhoneNumber) {
      this.filterPhoneNumbersPhoneNumber = filterPhoneNumbersPhoneNumber;
      return this;
    }

    /**
     * Set filterCustomerReference
     * @param filterCustomerReference Filter number orders via the customer reference set. (optional)
     * @return APIlistNumberOrdersRequest
     */
    public APIlistNumberOrdersRequest filterCustomerReference(String filterCustomerReference) {
      this.filterCustomerReference = filterCustomerReference;
      return this;
    }

    /**
     * Set filterRequirementsMet
     * @param filterRequirementsMet Filter number orders by requirements met. (optional)
     * @return APIlistNumberOrdersRequest
     */
    public APIlistNumberOrdersRequest filterRequirementsMet(Boolean filterRequirementsMet) {
      this.filterRequirementsMet = filterRequirementsMet;
      return this;
    }

    /**
     * Set pageNumber
     * @param pageNumber The page number to load (optional, default to 1)
     * @return APIlistNumberOrdersRequest
     */
    public APIlistNumberOrdersRequest pageNumber(Integer pageNumber) {
      this.pageNumber = pageNumber;
      return this;
    }

    /**
     * Set pageSize
     * @param pageSize The size of the page (optional, default to 250)
     * @return APIlistNumberOrdersRequest
     */
    public APIlistNumberOrdersRequest pageSize(Integer pageSize) {
      this.pageSize = pageSize;
      return this;
    }

    /**
     * Execute listNumberOrders request
     * @return ListNumberOrdersResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response with a list of number orders. </td><td>  -  </td></tr>
         <tr><td> 0 </td><td> Bad Request </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ListNumberOrdersResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute listNumberOrders request with HTTP info returned
     * @return ApiResponse&lt;ListNumberOrdersResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response with a list of number orders. </td><td>  -  </td></tr>
         <tr><td> 0 </td><td> Bad Request </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<ListNumberOrdersResponse> executeWithHttpInfo() throws ApiException {
      return listNumberOrdersWithHttpInfo(filterStatus, filterCreatedAtGt, filterCreatedAtLt, filterPhoneNumbersPhoneNumber, filterCustomerReference, filterRequirementsMet, pageNumber, pageSize);
    }
  }

  /**
   * List number orders
   * Get a paginated list of number orders.
   * @return listNumberOrdersRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIlistNumberOrdersRequest listNumberOrders() throws ApiException {
    return new APIlistNumberOrdersRequest();
  }
  /**
   * Retrieve a number order
   * Get an existing phone number order.
   * @param numberOrderId The number order ID. (required)
   * @return NumberOrderResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response with details about a number order. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Bad Request </td><td>  -  </td></tr>
     </table>
   */
  public NumberOrderResponse retrieveNumberOrder(String numberOrderId) throws ApiException {
    return retrieveNumberOrderWithHttpInfo(numberOrderId).getData();
  }

  /**
   * Retrieve a number order
   * Get an existing phone number order.
   * @param numberOrderId The number order ID. (required)
   * @return ApiResponse&lt;NumberOrderResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response with details about a number order. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Bad Request </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<NumberOrderResponse> retrieveNumberOrderWithHttpInfo(String numberOrderId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'numberOrderId' is set
    if (numberOrderId == null) {
      throw new ApiException(400, "Missing the required parameter 'numberOrderId' when calling retrieveNumberOrder");
    }
    
    // create path and map variables
    String localVarPath = "/number_orders/{number_order_id}"
      .replaceAll("\\{" + "number_order_id" + "\\}", apiClient.escapeString(numberOrderId.toString()));

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

    GenericType<NumberOrderResponse> localVarReturnType = new GenericType<NumberOrderResponse>() {};

    return apiClient.invokeAPI("NumberOrdersApi.retrieveNumberOrder", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Update a number order
   * Updates a phone number order.
   * @param numberOrderId The number order ID. (required)
   * @param updateNumberOrderRequest  (required)
   * @return NumberOrderResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response with details about a number order. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Bad Request </td><td>  -  </td></tr>
     </table>
   */
  public NumberOrderResponse updateNumberOrder(String numberOrderId, UpdateNumberOrderRequest updateNumberOrderRequest) throws ApiException {
    return updateNumberOrderWithHttpInfo(numberOrderId, updateNumberOrderRequest).getData();
  }

  /**
   * Update a number order
   * Updates a phone number order.
   * @param numberOrderId The number order ID. (required)
   * @param updateNumberOrderRequest  (required)
   * @return ApiResponse&lt;NumberOrderResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response with details about a number order. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Bad Request </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<NumberOrderResponse> updateNumberOrderWithHttpInfo(String numberOrderId, UpdateNumberOrderRequest updateNumberOrderRequest) throws ApiException {
    Object localVarPostBody = updateNumberOrderRequest;
    
    // verify the required parameter 'numberOrderId' is set
    if (numberOrderId == null) {
      throw new ApiException(400, "Missing the required parameter 'numberOrderId' when calling updateNumberOrder");
    }
    
    // verify the required parameter 'updateNumberOrderRequest' is set
    if (updateNumberOrderRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'updateNumberOrderRequest' when calling updateNumberOrder");
    }
    
    // create path and map variables
    String localVarPath = "/number_orders/{number_order_id}"
      .replaceAll("\\{" + "number_order_id" + "\\}", apiClient.escapeString(numberOrderId.toString()));

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

    GenericType<NumberOrderResponse> localVarReturnType = new GenericType<NumberOrderResponse>() {};

    return apiClient.invokeAPI("NumberOrdersApi.updateNumberOrder", localVarPath, "PATCH", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
