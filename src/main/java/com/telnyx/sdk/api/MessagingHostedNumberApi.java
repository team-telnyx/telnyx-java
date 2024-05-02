package com.telnyx.sdk.api;

import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.Pair;

import jakarta.ws.rs.core.GenericType;

import com.telnyx.sdk.model.CreateMessagingHostedNumberOrderRequest;
import com.telnyx.sdk.model.Errors;
import java.io.File;
import com.telnyx.sdk.model.ListMessagingHostedNumberOrderResponse;
import com.telnyx.sdk.model.RetrieveMessagingHostedNumberOrderResponse;
import com.telnyx.sdk.model.RetrieveMessagingHostedNumberResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class MessagingHostedNumberApi {
  private ApiClient apiClient;

  public MessagingHostedNumberApi() {
    this(Configuration.getDefaultApiClient());
  }

  public MessagingHostedNumberApi(ApiClient apiClient) {
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
   * Create a messaging hosted number order
   * 
   * @param createMessagingHostedNumberOrderRequest Message payload (optional)
   * @return RetrieveMessagingHostedNumberOrderResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response with details about a messaging hosted number order. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public RetrieveMessagingHostedNumberOrderResponse createMessagingHostedNumberOrder(CreateMessagingHostedNumberOrderRequest createMessagingHostedNumberOrderRequest) throws ApiException {
    return createMessagingHostedNumberOrderWithHttpInfo(createMessagingHostedNumberOrderRequest).getData();
  }

  /**
   * Create a messaging hosted number order
   * 
   * @param createMessagingHostedNumberOrderRequest Message payload (optional)
   * @return ApiResponse&lt;RetrieveMessagingHostedNumberOrderResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response with details about a messaging hosted number order. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<RetrieveMessagingHostedNumberOrderResponse> createMessagingHostedNumberOrderWithHttpInfo(CreateMessagingHostedNumberOrderRequest createMessagingHostedNumberOrderRequest) throws ApiException {
    Object localVarPostBody = createMessagingHostedNumberOrderRequest;
    
    // create path and map variables
    String localVarPath = "/messaging_hosted_number_orders";

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

    GenericType<RetrieveMessagingHostedNumberOrderResponse> localVarReturnType = new GenericType<RetrieveMessagingHostedNumberOrderResponse>() {};

    return apiClient.invokeAPI("MessagingHostedNumberApi.createMessagingHostedNumberOrder", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Delete a messaging hosted number
   * 
   * @param id Identifies the type of resource. (required)
   * @return RetrieveMessagingHostedNumberResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response with details about a messaging hosted number. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public RetrieveMessagingHostedNumberResponse deleteMessagingHostedNumber(String id) throws ApiException {
    return deleteMessagingHostedNumberWithHttpInfo(id).getData();
  }

  /**
   * Delete a messaging hosted number
   * 
   * @param id Identifies the type of resource. (required)
   * @return ApiResponse&lt;RetrieveMessagingHostedNumberResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response with details about a messaging hosted number. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<RetrieveMessagingHostedNumberResponse> deleteMessagingHostedNumberWithHttpInfo(String id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling deleteMessagingHostedNumber");
    }
    
    // create path and map variables
    String localVarPath = "/messaging_hosted_numbers/{id}"
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

    GenericType<RetrieveMessagingHostedNumberResponse> localVarReturnType = new GenericType<RetrieveMessagingHostedNumberResponse>() {};

    return apiClient.invokeAPI("MessagingHostedNumberApi.deleteMessagingHostedNumber", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Retrieve a messaging hosted number order
   * 
   * @param id Identifies the type of resource. (required)
   * @return RetrieveMessagingHostedNumberOrderResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response with details about a messaging hosted number order. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public RetrieveMessagingHostedNumberOrderResponse getMessagingHostedNumberOrder(String id) throws ApiException {
    return getMessagingHostedNumberOrderWithHttpInfo(id).getData();
  }

  /**
   * Retrieve a messaging hosted number order
   * 
   * @param id Identifies the type of resource. (required)
   * @return ApiResponse&lt;RetrieveMessagingHostedNumberOrderResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response with details about a messaging hosted number order. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<RetrieveMessagingHostedNumberOrderResponse> getMessagingHostedNumberOrderWithHttpInfo(String id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getMessagingHostedNumberOrder");
    }
    
    // create path and map variables
    String localVarPath = "/messaging_hosted_number_orders/{id}"
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

    GenericType<RetrieveMessagingHostedNumberOrderResponse> localVarReturnType = new GenericType<RetrieveMessagingHostedNumberOrderResponse>() {};

    return apiClient.invokeAPI("MessagingHostedNumberApi.getMessagingHostedNumberOrder", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

private ApiResponse<ListMessagingHostedNumberOrderResponse> listMessagingHostedNumberOrdersWithHttpInfo(Integer pageNumber, Integer pageSize) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/messaging_hosted_number_orders";

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

    GenericType<ListMessagingHostedNumberOrderResponse> localVarReturnType = new GenericType<ListMessagingHostedNumberOrderResponse>() {};

    return apiClient.invokeAPI("MessagingHostedNumberApi.listMessagingHostedNumberOrders", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIlistMessagingHostedNumberOrdersRequest {
    private Integer pageNumber;
    private Integer pageSize;

    private APIlistMessagingHostedNumberOrdersRequest() {
    }

    /**
     * Set pageNumber
     * @param pageNumber The page number to load (optional, default to 1)
     * @return APIlistMessagingHostedNumberOrdersRequest
     */
    public APIlistMessagingHostedNumberOrdersRequest pageNumber(Integer pageNumber) {
      this.pageNumber = pageNumber;
      return this;
    }

    /**
     * Set pageSize
     * @param pageSize The size of the page (optional, default to 20)
     * @return APIlistMessagingHostedNumberOrdersRequest
     */
    public APIlistMessagingHostedNumberOrdersRequest pageSize(Integer pageSize) {
      this.pageSize = pageSize;
      return this;
    }

    /**
     * Execute listMessagingHostedNumberOrders request
     * @return ListMessagingHostedNumberOrderResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response with a list of messaging hosted number orders. </td><td>  -  </td></tr>
         <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ListMessagingHostedNumberOrderResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute listMessagingHostedNumberOrders request with HTTP info returned
     * @return ApiResponse&lt;ListMessagingHostedNumberOrderResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response with a list of messaging hosted number orders. </td><td>  -  </td></tr>
         <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<ListMessagingHostedNumberOrderResponse> executeWithHttpInfo() throws ApiException {
      return listMessagingHostedNumberOrdersWithHttpInfo(pageNumber, pageSize);
    }
  }

  /**
   * List messaging hosted number orders
   * 
   * @return listMessagingHostedNumberOrdersRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIlistMessagingHostedNumberOrdersRequest listMessagingHostedNumberOrders() throws ApiException {
    return new APIlistMessagingHostedNumberOrdersRequest();
  }
  /**
   * Upload file required for a messaging hosted number order
   * 
   * @param id Identifies the type of resource. (required)
   * @param loa Must be a signed LOA for the numbers in the order in PDF format. (optional)
   * @param bill Must be the last month&#39;s bill with proof of ownership of all of the numbers in the order in PDF format. (optional)
   * @return RetrieveMessagingHostedNumberOrderResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response with details about a messaging hosted number order. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public RetrieveMessagingHostedNumberOrderResponse uploadMessagingHostedNumberOrderFile(String id, File loa, File bill) throws ApiException {
    return uploadMessagingHostedNumberOrderFileWithHttpInfo(id, loa, bill).getData();
  }

  /**
   * Upload file required for a messaging hosted number order
   * 
   * @param id Identifies the type of resource. (required)
   * @param loa Must be a signed LOA for the numbers in the order in PDF format. (optional)
   * @param bill Must be the last month&#39;s bill with proof of ownership of all of the numbers in the order in PDF format. (optional)
   * @return ApiResponse&lt;RetrieveMessagingHostedNumberOrderResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response with details about a messaging hosted number order. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<RetrieveMessagingHostedNumberOrderResponse> uploadMessagingHostedNumberOrderFileWithHttpInfo(String id, File loa, File bill) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling uploadMessagingHostedNumberOrderFile");
    }
    
    // create path and map variables
    String localVarPath = "/messaging_hosted_number_orders/{id}/actions/file_upload"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    if (loa != null)
      localVarFormParams.put("loa", loa);
if (bill != null)
      localVarFormParams.put("bill", bill);

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "multipart/form-data"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    GenericType<RetrieveMessagingHostedNumberOrderResponse> localVarReturnType = new GenericType<RetrieveMessagingHostedNumberOrderResponse>() {};

    return apiClient.invokeAPI("MessagingHostedNumberApi.uploadMessagingHostedNumberOrderFile", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
