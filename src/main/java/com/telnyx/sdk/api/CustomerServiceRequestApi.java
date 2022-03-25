package com.telnyx.sdk.api;

import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.Pair;

import javax.ws.rs.core.GenericType;

import com.telnyx.sdk.model.ListCustomerServiceRequestPhoneNumberCoverage;
import com.telnyx.sdk.model.ShowCustomerServiceRequest;
import com.telnyx.sdk.model.UNKNOWN_BASE_TYPE;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CustomerServiceRequestApi {
  private ApiClient apiClient;

  public CustomerServiceRequestApi() {
    this(Configuration.getDefaultApiClient());
  }

  public CustomerServiceRequestApi(ApiClient apiClient) {
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
   * Get a customer service request
   * Get a specific customer service request.
   * @param customerServiceRequestId The ID of the customer service request (required)
   * @return ShowCustomerServiceRequest
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> The required authentication headers were either invalid or not included in the request. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> You do not have permission to perform the requested action on the specified resource or resources. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> An unexpected error occurred. </td><td>  -  </td></tr>
     </table>
   */
  public ShowCustomerServiceRequest getCustomerServiceRequest(String customerServiceRequestId) throws ApiException {
    return getCustomerServiceRequestWithHttpInfo(customerServiceRequestId).getData();
  }

  /**
   * Get a customer service request
   * Get a specific customer service request.
   * @param customerServiceRequestId The ID of the customer service request (required)
   * @return ApiResponse&lt;ShowCustomerServiceRequest&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> The required authentication headers were either invalid or not included in the request. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> You do not have permission to perform the requested action on the specified resource or resources. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> An unexpected error occurred. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ShowCustomerServiceRequest> getCustomerServiceRequestWithHttpInfo(String customerServiceRequestId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'customerServiceRequestId' is set
    if (customerServiceRequestId == null) {
      throw new ApiException(400, "Missing the required parameter 'customerServiceRequestId' when calling getCustomerServiceRequest");
    }
    
    // create path and map variables
    String localVarPath = "/customer_service_requests/{customer_service_request_id}"
      .replaceAll("\\{" + "customer_service_request_id" + "\\}", apiClient.escapeString(customerServiceRequestId.toString()));

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

    GenericType<ShowCustomerServiceRequest> localVarReturnType = new GenericType<ShowCustomerServiceRequest>() {};

    return apiClient.invokeAPI("CustomerServiceRequestApi.getCustomerServiceRequest", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Verify CSR phone number coverage
   * Verify the coverage for a list of phone numbers.
   * @param UNKNOWN_BASE_TYPE  (required)
   * @return ListCustomerServiceRequestPhoneNumberCoverage
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> The required authentication headers were either invalid or not included in the request. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> You do not have permission to perform the requested action on the specified resource or resources. </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check the &#39;detail&#39; field in response for details. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> An unexpected error occurred. </td><td>  -  </td></tr>
     </table>
   */
  public ListCustomerServiceRequestPhoneNumberCoverage verifyPhoneNumberCoverage(UNKNOWN_BASE_TYPE UNKNOWN_BASE_TYPE) throws ApiException {
    return verifyPhoneNumberCoverageWithHttpInfo(UNKNOWN_BASE_TYPE).getData();
  }

  /**
   * Verify CSR phone number coverage
   * Verify the coverage for a list of phone numbers.
   * @param UNKNOWN_BASE_TYPE  (required)
   * @return ApiResponse&lt;ListCustomerServiceRequestPhoneNumberCoverage&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> The required authentication headers were either invalid or not included in the request. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> You do not have permission to perform the requested action on the specified resource or resources. </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check the &#39;detail&#39; field in response for details. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> An unexpected error occurred. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ListCustomerServiceRequestPhoneNumberCoverage> verifyPhoneNumberCoverageWithHttpInfo(UNKNOWN_BASE_TYPE UNKNOWN_BASE_TYPE) throws ApiException {
    Object localVarPostBody = UNKNOWN_BASE_TYPE;
    
    // verify the required parameter 'UNKNOWN_BASE_TYPE' is set
    if (UNKNOWN_BASE_TYPE == null) {
      throw new ApiException(400, "Missing the required parameter 'UNKNOWN_BASE_TYPE' when calling verifyPhoneNumberCoverage");
    }
    
    // create path and map variables
    String localVarPath = "/customer_service_requests/phone_number_coverages";

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

    GenericType<ListCustomerServiceRequestPhoneNumberCoverage> localVarReturnType = new GenericType<ListCustomerServiceRequestPhoneNumberCoverage>() {};

    return apiClient.invokeAPI("CustomerServiceRequestApi.verifyPhoneNumberCoverage", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
