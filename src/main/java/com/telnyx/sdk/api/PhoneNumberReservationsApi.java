package com.telnyx.sdk.api;

import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.Pair;

import jakarta.ws.rs.core.GenericType;

import com.telnyx.sdk.model.CreateNumberReservationRequest;
import com.telnyx.sdk.model.Errors;
import com.telnyx.sdk.model.ListNumberReservationsResponse;
import com.telnyx.sdk.model.NumberReservationResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class PhoneNumberReservationsApi {
  private ApiClient apiClient;

  public PhoneNumberReservationsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public PhoneNumberReservationsApi(ApiClient apiClient) {
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
   * Create a number reservation
   * Creates a Phone Number Reservation for multiple numbers.
   * @param createNumberReservationRequest  (required)
   * @return NumberReservationResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response with details about a number reservation. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public NumberReservationResponse createNumberReservation(CreateNumberReservationRequest createNumberReservationRequest) throws ApiException {
    return createNumberReservationWithHttpInfo(createNumberReservationRequest).getData();
  }

  /**
   * Create a number reservation
   * Creates a Phone Number Reservation for multiple numbers.
   * @param createNumberReservationRequest  (required)
   * @return ApiResponse&lt;NumberReservationResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response with details about a number reservation. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<NumberReservationResponse> createNumberReservationWithHttpInfo(CreateNumberReservationRequest createNumberReservationRequest) throws ApiException {
    Object localVarPostBody = createNumberReservationRequest;
    
    // verify the required parameter 'createNumberReservationRequest' is set
    if (createNumberReservationRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'createNumberReservationRequest' when calling createNumberReservation");
    }
    
    // create path and map variables
    String localVarPath = "/number_reservations";

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

    GenericType<NumberReservationResponse> localVarReturnType = new GenericType<NumberReservationResponse>() {};

    return apiClient.invokeAPI("PhoneNumberReservationsApi.createNumberReservation", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Extend a number reservation
   * Extends reservation expiry time on all phone numbers.
   * @param numberReservationId The number reservation ID. (required)
   * @return NumberReservationResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response with details about a number reservation. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public NumberReservationResponse extendNumberReservationExpiryTime(String numberReservationId) throws ApiException {
    return extendNumberReservationExpiryTimeWithHttpInfo(numberReservationId).getData();
  }

  /**
   * Extend a number reservation
   * Extends reservation expiry time on all phone numbers.
   * @param numberReservationId The number reservation ID. (required)
   * @return ApiResponse&lt;NumberReservationResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response with details about a number reservation. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<NumberReservationResponse> extendNumberReservationExpiryTimeWithHttpInfo(String numberReservationId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'numberReservationId' is set
    if (numberReservationId == null) {
      throw new ApiException(400, "Missing the required parameter 'numberReservationId' when calling extendNumberReservationExpiryTime");
    }
    
    // create path and map variables
    String localVarPath = "/number_reservations/{number_reservation_id}/actions/extend"
      .replaceAll("\\{" + "number_reservation_id" + "\\}", apiClient.escapeString(numberReservationId.toString()));

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

    GenericType<NumberReservationResponse> localVarReturnType = new GenericType<NumberReservationResponse>() {};

    return apiClient.invokeAPI("PhoneNumberReservationsApi.extendNumberReservationExpiryTime", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

private ApiResponse<ListNumberReservationsResponse> listNumberReservationsWithHttpInfo(String filterStatus, String filterCreatedAtGt, String filterCreatedAtLt, String filterPhoneNumbersPhoneNumber, String filterCustomerReference, Integer pageNumber, Integer pageSize) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/number_reservations";

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

    GenericType<ListNumberReservationsResponse> localVarReturnType = new GenericType<ListNumberReservationsResponse>() {};

    return apiClient.invokeAPI("PhoneNumberReservationsApi.listNumberReservations", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIlistNumberReservationsRequest {
    private String filterStatus;
    private String filterCreatedAtGt;
    private String filterCreatedAtLt;
    private String filterPhoneNumbersPhoneNumber;
    private String filterCustomerReference;
    private Integer pageNumber;
    private Integer pageSize;

    private APIlistNumberReservationsRequest() {
    }

    /**
     * Set filterStatus
     * @param filterStatus Filter number reservations by status. (optional)
     * @return APIlistNumberReservationsRequest
     */
    public APIlistNumberReservationsRequest filterStatus(String filterStatus) {
      this.filterStatus = filterStatus;
      return this;
    }

    /**
     * Set filterCreatedAtGt
     * @param filterCreatedAtGt Filter number reservations later than this value. (optional)
     * @return APIlistNumberReservationsRequest
     */
    public APIlistNumberReservationsRequest filterCreatedAtGt(String filterCreatedAtGt) {
      this.filterCreatedAtGt = filterCreatedAtGt;
      return this;
    }

    /**
     * Set filterCreatedAtLt
     * @param filterCreatedAtLt Filter number reservations earlier than this value. (optional)
     * @return APIlistNumberReservationsRequest
     */
    public APIlistNumberReservationsRequest filterCreatedAtLt(String filterCreatedAtLt) {
      this.filterCreatedAtLt = filterCreatedAtLt;
      return this;
    }

    /**
     * Set filterPhoneNumbersPhoneNumber
     * @param filterPhoneNumbersPhoneNumber Filter number reservations having these phone numbers. (optional)
     * @return APIlistNumberReservationsRequest
     */
    public APIlistNumberReservationsRequest filterPhoneNumbersPhoneNumber(String filterPhoneNumbersPhoneNumber) {
      this.filterPhoneNumbersPhoneNumber = filterPhoneNumbersPhoneNumber;
      return this;
    }

    /**
     * Set filterCustomerReference
     * @param filterCustomerReference Filter number reservations via the customer reference set. (optional)
     * @return APIlistNumberReservationsRequest
     */
    public APIlistNumberReservationsRequest filterCustomerReference(String filterCustomerReference) {
      this.filterCustomerReference = filterCustomerReference;
      return this;
    }

    /**
     * Set pageNumber
     * @param pageNumber The page number to load (optional, default to 1)
     * @return APIlistNumberReservationsRequest
     */
    public APIlistNumberReservationsRequest pageNumber(Integer pageNumber) {
      this.pageNumber = pageNumber;
      return this;
    }

    /**
     * Set pageSize
     * @param pageSize The size of the page (optional, default to 20)
     * @return APIlistNumberReservationsRequest
     */
    public APIlistNumberReservationsRequest pageSize(Integer pageSize) {
      this.pageSize = pageSize;
      return this;
    }

    /**
     * Execute listNumberReservations request
     * @return ListNumberReservationsResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response with a list of number reservations. </td><td>  -  </td></tr>
         <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ListNumberReservationsResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute listNumberReservations request with HTTP info returned
     * @return ApiResponse&lt;ListNumberReservationsResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response with a list of number reservations. </td><td>  -  </td></tr>
         <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<ListNumberReservationsResponse> executeWithHttpInfo() throws ApiException {
      return listNumberReservationsWithHttpInfo(filterStatus, filterCreatedAtGt, filterCreatedAtLt, filterPhoneNumbersPhoneNumber, filterCustomerReference, pageNumber, pageSize);
    }
  }

  /**
   * List number reservations
   * Gets a paginated list of phone number reservations.
   * @return listNumberReservationsRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIlistNumberReservationsRequest listNumberReservations() throws ApiException {
    return new APIlistNumberReservationsRequest();
  }
  /**
   * Retrieve a number reservation
   * Gets a single phone number reservation.
   * @param numberReservationId The number reservation ID. (required)
   * @return NumberReservationResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response with details about a number reservation. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public NumberReservationResponse retrieveNumberReservation(String numberReservationId) throws ApiException {
    return retrieveNumberReservationWithHttpInfo(numberReservationId).getData();
  }

  /**
   * Retrieve a number reservation
   * Gets a single phone number reservation.
   * @param numberReservationId The number reservation ID. (required)
   * @return ApiResponse&lt;NumberReservationResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response with details about a number reservation. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<NumberReservationResponse> retrieveNumberReservationWithHttpInfo(String numberReservationId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'numberReservationId' is set
    if (numberReservationId == null) {
      throw new ApiException(400, "Missing the required parameter 'numberReservationId' when calling retrieveNumberReservation");
    }
    
    // create path and map variables
    String localVarPath = "/number_reservations/{number_reservation_id}"
      .replaceAll("\\{" + "number_reservation_id" + "\\}", apiClient.escapeString(numberReservationId.toString()));

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

    GenericType<NumberReservationResponse> localVarReturnType = new GenericType<NumberReservationResponse>() {};

    return apiClient.invokeAPI("PhoneNumberReservationsApi.retrieveNumberReservation", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
