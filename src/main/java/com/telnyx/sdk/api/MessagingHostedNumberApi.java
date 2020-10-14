package com.telnyx.sdk.api;

import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.Pair;

import javax.ws.rs.core.GenericType;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class MessagingHostedNumberApi {
  private ApiClient apiClient;

  public MessagingHostedNumberApi() {
    this(Configuration.getDefaultApiClient());
  }

  public MessagingHostedNumberApi(ApiClient apiClient) {
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

private ApiResponse<ListMessagingHostedNumberOrderResponse> listMessagingHostedNumberOrderWithHttpInfo(Integer pageNumber, Integer pageSize) throws ApiException {
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

    return apiClient.invokeAPI("MessagingHostedNumberApi.listMessagingHostedNumberOrder", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIlistMessagingHostedNumberOrderRequest {
    private Integer pageNumber;
    private Integer pageSize;

    private APIlistMessagingHostedNumberOrderRequest() {
    }

    /**
     * Set pageNumber
     * @param pageNumber The page number to load (optional, default to 1)
     * @return APIlistMessagingHostedNumberOrderRequest
     */
    public APIlistMessagingHostedNumberOrderRequest pageNumber(Integer pageNumber) {
      this.pageNumber = pageNumber;
      return this;
    }

    /**
     * Set pageSize
     * @param pageSize The size of the page (optional, default to 20)
     * @return APIlistMessagingHostedNumberOrderRequest
     */
    public APIlistMessagingHostedNumberOrderRequest pageSize(Integer pageSize) {
      this.pageSize = pageSize;
      return this;
    }

    /**
     * Execute listMessagingHostedNumberOrder request
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
     * Execute listMessagingHostedNumberOrder request with HTTP info returned
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
      return listMessagingHostedNumberOrderWithHttpInfo(pageNumber, pageSize);
    }
  }

  /**
   * List messaging hosted number orders
   * 
   * @return listMessagingHostedNumberOrderRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIlistMessagingHostedNumberOrderRequest listMessagingHostedNumberOrder() throws ApiException {
    return new APIlistMessagingHostedNumberOrderRequest();
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
  public RetrieveMessagingHostedNumberOrderResponse retrieveMessagingHostedNumberOrder(String id) throws ApiException {
    return retrieveMessagingHostedNumberOrderWithHttpInfo(id).getData();
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
  public ApiResponse<RetrieveMessagingHostedNumberOrderResponse> retrieveMessagingHostedNumberOrderWithHttpInfo(String id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling retrieveMessagingHostedNumberOrder");
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

    return apiClient.invokeAPI("MessagingHostedNumberApi.retrieveMessagingHostedNumberOrder", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
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
  public RetrieveMessagingHostedNumberOrderResponse uploadFileMessagingHostedNumberOrder(String id, File loa, File bill) throws ApiException {
    return uploadFileMessagingHostedNumberOrderWithHttpInfo(id, loa, bill).getData();
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
  public ApiResponse<RetrieveMessagingHostedNumberOrderResponse> uploadFileMessagingHostedNumberOrderWithHttpInfo(String id, File loa, File bill) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling uploadFileMessagingHostedNumberOrder");
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

    return apiClient.invokeAPI("MessagingHostedNumberApi.uploadFileMessagingHostedNumberOrder", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
