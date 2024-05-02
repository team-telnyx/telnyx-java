package com.telnyx.sdk.api;

import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.Pair;

import jakarta.ws.rs.core.GenericType;

import com.telnyx.sdk.model.Comment;
import com.telnyx.sdk.model.CreateComment200Response;
import com.telnyx.sdk.model.CreateNumberOrderRequest;
import com.telnyx.sdk.model.Errors;
import com.telnyx.sdk.model.ListComments200Response;
import com.telnyx.sdk.model.ListNumberOrderPhoneNumbersResponse;
import com.telnyx.sdk.model.ListNumberOrdersResponse;
import com.telnyx.sdk.model.ListRegulartoryRequirements200Response;
import com.telnyx.sdk.model.ListSubNumberOrdersResponse;
import com.telnyx.sdk.model.MarkCommentRead200Response;
import com.telnyx.sdk.model.NumberOrderPhoneNumberResponse;
import com.telnyx.sdk.model.NumberOrderResponse;
import com.telnyx.sdk.model.SubNumberOrderResponse;
import java.util.UUID;
import com.telnyx.sdk.model.UpdateNumberOrderPhoneNumberRequest;
import com.telnyx.sdk.model.UpdateNumberOrderRequest;
import com.telnyx.sdk.model.UpdateSubNumberOrderRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class NumberOrdersApi {
  private ApiClient apiClient;

  public NumberOrdersApi() {
    this(Configuration.getDefaultApiClient());
  }

  public NumberOrdersApi(ApiClient apiClient) {
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
   * Create a comment
   * 
   * @param comment  (required)
   * @return CreateComment200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A Comment Response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public CreateComment200Response createComment(Comment comment) throws ApiException {
    return createCommentWithHttpInfo(comment).getData();
  }

  /**
   * Create a comment
   * 
   * @param comment  (required)
   * @return ApiResponse&lt;CreateComment200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A Comment Response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CreateComment200Response> createCommentWithHttpInfo(Comment comment) throws ApiException {
    Object localVarPostBody = comment;
    
    // verify the required parameter 'comment' is set
    if (comment == null) {
      throw new ApiException(400, "Missing the required parameter 'comment' when calling createComment");
    }
    
    // create path and map variables
    String localVarPath = "/comments";

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

    GenericType<CreateComment200Response> localVarReturnType = new GenericType<CreateComment200Response>() {};

    return apiClient.invokeAPI("NumberOrdersApi.createComment", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
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
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
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
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
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
  /**
   * Retrieve all comments
   * 
   * @param filterCommentRecordType Record type that the comment relates to i.e number_order, sub_number_order or number_order_phone_number (required)
   * @param filterCommentRecordId ID of the record the comments relate to (required)
   * @return ListComments200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> An array of Comment Responses </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ListComments200Response listComments(String filterCommentRecordType, String filterCommentRecordId) throws ApiException {
    return listCommentsWithHttpInfo(filterCommentRecordType, filterCommentRecordId).getData();
  }

  /**
   * Retrieve all comments
   * 
   * @param filterCommentRecordType Record type that the comment relates to i.e number_order, sub_number_order or number_order_phone_number (required)
   * @param filterCommentRecordId ID of the record the comments relate to (required)
   * @return ApiResponse&lt;ListComments200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> An array of Comment Responses </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ListComments200Response> listCommentsWithHttpInfo(String filterCommentRecordType, String filterCommentRecordId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'filterCommentRecordType' is set
    if (filterCommentRecordType == null) {
      throw new ApiException(400, "Missing the required parameter 'filterCommentRecordType' when calling listComments");
    }
    
    // verify the required parameter 'filterCommentRecordId' is set
    if (filterCommentRecordId == null) {
      throw new ApiException(400, "Missing the required parameter 'filterCommentRecordId' when calling listComments");
    }
    
    // create path and map variables
    String localVarPath = "/comments";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[comment_record_type]", filterCommentRecordType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[comment_record_id]", filterCommentRecordId));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    GenericType<ListComments200Response> localVarReturnType = new GenericType<ListComments200Response>() {};

    return apiClient.invokeAPI("NumberOrdersApi.listComments", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

private ApiResponse<ListNumberOrdersResponse> listNumberOrdersWithHttpInfo(String filterStatus, String filterCreatedAtGt, String filterCreatedAtLt, String filterPhoneNumbersCount, String filterCustomerReference, Boolean filterRequirementsMet, Integer pageNumber, Integer pageSize) throws ApiException {
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
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[phone_numbers_count]", filterPhoneNumbersCount));
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
    private String filterPhoneNumbersCount;
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
     * Set filterPhoneNumbersCount
     * @param filterPhoneNumbersCount Filter number order with this amount of numbers (optional)
     * @return APIlistNumberOrdersRequest
     */
    public APIlistNumberOrdersRequest filterPhoneNumbersCount(String filterPhoneNumbersCount) {
      this.filterPhoneNumbersCount = filterPhoneNumbersCount;
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
     * @param pageSize The size of the page (optional, default to 20)
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
         <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
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
         <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<ListNumberOrdersResponse> executeWithHttpInfo() throws ApiException {
      return listNumberOrdersWithHttpInfo(filterStatus, filterCreatedAtGt, filterCreatedAtLt, filterPhoneNumbersCount, filterCustomerReference, filterRequirementsMet, pageNumber, pageSize);
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
   * Retrieve regulartory requirements
   * 
   * @param filterPhoneNumber Record type phone number/ phone numbers (required)
   * @return ListRegulartoryRequirements200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> An array of Regulatory Requiremenst Responses </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ListRegulartoryRequirements200Response listRegulartoryRequirements(String filterPhoneNumber) throws ApiException {
    return listRegulartoryRequirementsWithHttpInfo(filterPhoneNumber).getData();
  }

  /**
   * Retrieve regulartory requirements
   * 
   * @param filterPhoneNumber Record type phone number/ phone numbers (required)
   * @return ApiResponse&lt;ListRegulartoryRequirements200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> An array of Regulatory Requiremenst Responses </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ListRegulartoryRequirements200Response> listRegulartoryRequirementsWithHttpInfo(String filterPhoneNumber) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'filterPhoneNumber' is set
    if (filterPhoneNumber == null) {
      throw new ApiException(400, "Missing the required parameter 'filterPhoneNumber' when calling listRegulartoryRequirements");
    }
    
    // create path and map variables
    String localVarPath = "/phone_numbers_regulatory_requirements";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[phone_number]", filterPhoneNumber));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    GenericType<ListRegulartoryRequirements200Response> localVarReturnType = new GenericType<ListRegulartoryRequirements200Response>() {};

    return apiClient.invokeAPI("NumberOrdersApi.listRegulartoryRequirements", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

private ApiResponse<ListSubNumberOrdersResponse> listSubNumberOrdersWithHttpInfo(UUID filterUserId, UUID filterOrderRequestId, String filterCountryCode, String filterPhoneNumberType, Integer filterPhoneNumbersCount) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/sub_number_orders";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[user_id]", filterUserId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[order_request_id]", filterOrderRequestId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[country_code]", filterCountryCode));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[phone_number_type]", filterPhoneNumberType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[phone_numbers_count]", filterPhoneNumbersCount));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    GenericType<ListSubNumberOrdersResponse> localVarReturnType = new GenericType<ListSubNumberOrdersResponse>() {};

    return apiClient.invokeAPI("NumberOrdersApi.listSubNumberOrders", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIlistSubNumberOrdersRequest {
    private UUID filterUserId;
    private UUID filterOrderRequestId;
    private String filterCountryCode;
    private String filterPhoneNumberType;
    private Integer filterPhoneNumbersCount;

    private APIlistSubNumberOrdersRequest() {
    }

    /**
     * Set filterUserId
     * @param filterUserId User ID of the user who owns the sub number order (optional)
     * @return APIlistSubNumberOrdersRequest
     */
    public APIlistSubNumberOrdersRequest filterUserId(UUID filterUserId) {
      this.filterUserId = filterUserId;
      return this;
    }

    /**
     * Set filterOrderRequestId
     * @param filterOrderRequestId ID of the number order the sub number order belongs to (optional)
     * @return APIlistSubNumberOrdersRequest
     */
    public APIlistSubNumberOrdersRequest filterOrderRequestId(UUID filterOrderRequestId) {
      this.filterOrderRequestId = filterOrderRequestId;
      return this;
    }

    /**
     * Set filterCountryCode
     * @param filterCountryCode ISO alpha-2 country code. (optional)
     * @return APIlistSubNumberOrdersRequest
     */
    public APIlistSubNumberOrdersRequest filterCountryCode(String filterCountryCode) {
      this.filterCountryCode = filterCountryCode;
      return this;
    }

    /**
     * Set filterPhoneNumberType
     * @param filterPhoneNumberType Phone Number Type (optional)
     * @return APIlistSubNumberOrdersRequest
     */
    public APIlistSubNumberOrdersRequest filterPhoneNumberType(String filterPhoneNumberType) {
      this.filterPhoneNumberType = filterPhoneNumberType;
      return this;
    }

    /**
     * Set filterPhoneNumbersCount
     * @param filterPhoneNumbersCount Amount of numbers in the sub number order (optional)
     * @return APIlistSubNumberOrdersRequest
     */
    public APIlistSubNumberOrdersRequest filterPhoneNumbersCount(Integer filterPhoneNumbersCount) {
      this.filterPhoneNumbersCount = filterPhoneNumbersCount;
      return this;
    }

    /**
     * Execute listSubNumberOrders request
     * @return ListSubNumberOrdersResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response with a list of sub number orders. </td><td>  -  </td></tr>
         <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ListSubNumberOrdersResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute listSubNumberOrders request with HTTP info returned
     * @return ApiResponse&lt;ListSubNumberOrdersResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response with a list of sub number orders. </td><td>  -  </td></tr>
         <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<ListSubNumberOrdersResponse> executeWithHttpInfo() throws ApiException {
      return listSubNumberOrdersWithHttpInfo(filterUserId, filterOrderRequestId, filterCountryCode, filterPhoneNumberType, filterPhoneNumbersCount);
    }
  }

  /**
   * List sub number orders
   * Get a paginated list of sub number orders.
   * @return listSubNumberOrdersRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIlistSubNumberOrdersRequest listSubNumberOrders() throws ApiException {
    return new APIlistSubNumberOrdersRequest();
  }
  /**
   * Mark a comment as read
   * 
   * @param id The comment ID. (required)
   * @return MarkCommentRead200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A Comment Response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public MarkCommentRead200Response markCommentRead(String id) throws ApiException {
    return markCommentReadWithHttpInfo(id).getData();
  }

  /**
   * Mark a comment as read
   * 
   * @param id The comment ID. (required)
   * @return ApiResponse&lt;MarkCommentRead200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A Comment Response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<MarkCommentRead200Response> markCommentReadWithHttpInfo(String id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling markCommentRead");
    }
    
    // create path and map variables
    String localVarPath = "/comments/{id}/read"
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

    GenericType<MarkCommentRead200Response> localVarReturnType = new GenericType<MarkCommentRead200Response>() {};

    return apiClient.invokeAPI("NumberOrdersApi.markCommentRead", localVarPath, "PATCH", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Retrieve a comment
   * 
   * @param id The comment ID. (required)
   * @return CreateComment200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A Comment Response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public CreateComment200Response retrieveComment(String id) throws ApiException {
    return retrieveCommentWithHttpInfo(id).getData();
  }

  /**
   * Retrieve a comment
   * 
   * @param id The comment ID. (required)
   * @return ApiResponse&lt;CreateComment200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A Comment Response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CreateComment200Response> retrieveCommentWithHttpInfo(String id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling retrieveComment");
    }
    
    // create path and map variables
    String localVarPath = "/comments/{id}"
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

    GenericType<CreateComment200Response> localVarReturnType = new GenericType<CreateComment200Response>() {};

    return apiClient.invokeAPI("NumberOrdersApi.retrieveComment", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
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
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
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
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
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
   * Retrieve a number order phone number.
   * Get an existing number order phone number.
   * @param numberOrderPhoneNumberId The number order phone number ID. (required)
   * @return NumberOrderPhoneNumberResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response with details about a number order phone number. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public NumberOrderPhoneNumberResponse retrieveNumberOrderPhoneNumber(String numberOrderPhoneNumberId) throws ApiException {
    return retrieveNumberOrderPhoneNumberWithHttpInfo(numberOrderPhoneNumberId).getData();
  }

  /**
   * Retrieve a number order phone number.
   * Get an existing number order phone number.
   * @param numberOrderPhoneNumberId The number order phone number ID. (required)
   * @return ApiResponse&lt;NumberOrderPhoneNumberResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response with details about a number order phone number. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<NumberOrderPhoneNumberResponse> retrieveNumberOrderPhoneNumberWithHttpInfo(String numberOrderPhoneNumberId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'numberOrderPhoneNumberId' is set
    if (numberOrderPhoneNumberId == null) {
      throw new ApiException(400, "Missing the required parameter 'numberOrderPhoneNumberId' when calling retrieveNumberOrderPhoneNumber");
    }
    
    // create path and map variables
    String localVarPath = "/number_order_phone_numbers/{number_order_phone_number_id}"
      .replaceAll("\\{" + "number_order_phone_number_id" + "\\}", apiClient.escapeString(numberOrderPhoneNumberId.toString()));

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

    GenericType<NumberOrderPhoneNumberResponse> localVarReturnType = new GenericType<NumberOrderPhoneNumberResponse>() {};

    return apiClient.invokeAPI("NumberOrdersApi.retrieveNumberOrderPhoneNumber", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Retrieve a list of phone numbers associated to orders
   * Get a list of phone numbers associated to orders.
   * @return ListNumberOrderPhoneNumbersResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response with a list of number order phone numbers. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ListNumberOrderPhoneNumbersResponse retrieveNumberOrderPhoneNumbers() throws ApiException {
    return retrieveNumberOrderPhoneNumbersWithHttpInfo().getData();
  }

  /**
   * Retrieve a list of phone numbers associated to orders
   * Get a list of phone numbers associated to orders.
   * @return ApiResponse&lt;ListNumberOrderPhoneNumbersResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response with a list of number order phone numbers. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ListNumberOrderPhoneNumbersResponse> retrieveNumberOrderPhoneNumbersWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/number_order_phone_numbers";

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

    GenericType<ListNumberOrderPhoneNumbersResponse> localVarReturnType = new GenericType<ListNumberOrderPhoneNumbersResponse>() {};

    return apiClient.invokeAPI("NumberOrdersApi.retrieveNumberOrderPhoneNumbers", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Retrieve a sub number order
   * Get an existing sub number order.
   * @param subNumberOrderId The sub number order ID. (required)
   * @param filterIncludePhoneNumbers Include the first 50 phone number objects in the results (optional, default to false)
   * @return SubNumberOrderResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response with details about a sub number order. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public SubNumberOrderResponse retrieveSubNumberOrder(String subNumberOrderId, Boolean filterIncludePhoneNumbers) throws ApiException {
    return retrieveSubNumberOrderWithHttpInfo(subNumberOrderId, filterIncludePhoneNumbers).getData();
  }

  /**
   * Retrieve a sub number order
   * Get an existing sub number order.
   * @param subNumberOrderId The sub number order ID. (required)
   * @param filterIncludePhoneNumbers Include the first 50 phone number objects in the results (optional, default to false)
   * @return ApiResponse&lt;SubNumberOrderResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response with details about a sub number order. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<SubNumberOrderResponse> retrieveSubNumberOrderWithHttpInfo(String subNumberOrderId, Boolean filterIncludePhoneNumbers) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'subNumberOrderId' is set
    if (subNumberOrderId == null) {
      throw new ApiException(400, "Missing the required parameter 'subNumberOrderId' when calling retrieveSubNumberOrder");
    }
    
    // create path and map variables
    String localVarPath = "/sub_number_orders/{sub_number_order_id}"
      .replaceAll("\\{" + "sub_number_order_id" + "\\}", apiClient.escapeString(subNumberOrderId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[include_phone_numbers]", filterIncludePhoneNumbers));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    GenericType<SubNumberOrderResponse> localVarReturnType = new GenericType<SubNumberOrderResponse>() {};

    return apiClient.invokeAPI("NumberOrdersApi.retrieveSubNumberOrder", localVarPath, "GET", localVarQueryParams, localVarPostBody,
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
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
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
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
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
  /**
   * Update a number order phone number.
   * Updates a number order phone number.
   * @param numberOrderPhoneNumberId The number order phone number ID. (required)
   * @param updateNumberOrderPhoneNumberRequest  (required)
   * @return NumberOrderPhoneNumberResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response with details about a number order phone number. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public NumberOrderPhoneNumberResponse updateNumberOrderPhoneNumber(String numberOrderPhoneNumberId, UpdateNumberOrderPhoneNumberRequest updateNumberOrderPhoneNumberRequest) throws ApiException {
    return updateNumberOrderPhoneNumberWithHttpInfo(numberOrderPhoneNumberId, updateNumberOrderPhoneNumberRequest).getData();
  }

  /**
   * Update a number order phone number.
   * Updates a number order phone number.
   * @param numberOrderPhoneNumberId The number order phone number ID. (required)
   * @param updateNumberOrderPhoneNumberRequest  (required)
   * @return ApiResponse&lt;NumberOrderPhoneNumberResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response with details about a number order phone number. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<NumberOrderPhoneNumberResponse> updateNumberOrderPhoneNumberWithHttpInfo(String numberOrderPhoneNumberId, UpdateNumberOrderPhoneNumberRequest updateNumberOrderPhoneNumberRequest) throws ApiException {
    Object localVarPostBody = updateNumberOrderPhoneNumberRequest;
    
    // verify the required parameter 'numberOrderPhoneNumberId' is set
    if (numberOrderPhoneNumberId == null) {
      throw new ApiException(400, "Missing the required parameter 'numberOrderPhoneNumberId' when calling updateNumberOrderPhoneNumber");
    }
    
    // verify the required parameter 'updateNumberOrderPhoneNumberRequest' is set
    if (updateNumberOrderPhoneNumberRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'updateNumberOrderPhoneNumberRequest' when calling updateNumberOrderPhoneNumber");
    }
    
    // create path and map variables
    String localVarPath = "/number_order_phone_numbers/{number_order_phone_number_id}"
      .replaceAll("\\{" + "number_order_phone_number_id" + "\\}", apiClient.escapeString(numberOrderPhoneNumberId.toString()));

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

    GenericType<NumberOrderPhoneNumberResponse> localVarReturnType = new GenericType<NumberOrderPhoneNumberResponse>() {};

    return apiClient.invokeAPI("NumberOrdersApi.updateNumberOrderPhoneNumber", localVarPath, "PATCH", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Update a sub number order
   * Updates a sub number order.
   * @param subNumberOrderId The sub number order ID. (required)
   * @param updateSubNumberOrderRequest  (required)
   * @return SubNumberOrderResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response with details about a sub number order. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public SubNumberOrderResponse updateSubNumberOrder(String subNumberOrderId, UpdateSubNumberOrderRequest updateSubNumberOrderRequest) throws ApiException {
    return updateSubNumberOrderWithHttpInfo(subNumberOrderId, updateSubNumberOrderRequest).getData();
  }

  /**
   * Update a sub number order
   * Updates a sub number order.
   * @param subNumberOrderId The sub number order ID. (required)
   * @param updateSubNumberOrderRequest  (required)
   * @return ApiResponse&lt;SubNumberOrderResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response with details about a sub number order. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<SubNumberOrderResponse> updateSubNumberOrderWithHttpInfo(String subNumberOrderId, UpdateSubNumberOrderRequest updateSubNumberOrderRequest) throws ApiException {
    Object localVarPostBody = updateSubNumberOrderRequest;
    
    // verify the required parameter 'subNumberOrderId' is set
    if (subNumberOrderId == null) {
      throw new ApiException(400, "Missing the required parameter 'subNumberOrderId' when calling updateSubNumberOrder");
    }
    
    // verify the required parameter 'updateSubNumberOrderRequest' is set
    if (updateSubNumberOrderRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'updateSubNumberOrderRequest' when calling updateSubNumberOrder");
    }
    
    // create path and map variables
    String localVarPath = "/sub_number_orders/{sub_number_order_id}"
      .replaceAll("\\{" + "sub_number_order_id" + "\\}", apiClient.escapeString(subNumberOrderId.toString()));

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

    GenericType<SubNumberOrderResponse> localVarReturnType = new GenericType<SubNumberOrderResponse>() {};

    return apiClient.invokeAPI("NumberOrdersApi.updateSubNumberOrder", localVarPath, "PATCH", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
