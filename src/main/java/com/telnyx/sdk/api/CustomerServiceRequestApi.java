package com.telnyx.sdk.api;

import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.Pair;

import jakarta.ws.rs.core.GenericType;

import com.telnyx.sdk.model.CreateCustomerServiceRequest201Response;
import com.telnyx.sdk.model.CreateCustomerServiceRequestRequest;
import com.telnyx.sdk.model.GetCustomerServiceRequest404Response;
import com.telnyx.sdk.model.ListCustomerServiceRequests200Response;
import com.telnyx.sdk.model.ListCustomerServiceRequests401Response;
import com.telnyx.sdk.model.ListCustomerServiceRequests403Response;
import com.telnyx.sdk.model.ListCustomerServiceRequests422Response;
import com.telnyx.sdk.model.ListCustomerServiceRequests500Response;
import java.time.OffsetDateTime;
import com.telnyx.sdk.model.VerifyPhoneNumberCoverage201Response;
import com.telnyx.sdk.model.VerifyPhoneNumberCoverageRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
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
   * Create a customer service request
   * Create a new customer service request for the provided phone number.
   * @param createCustomerServiceRequestRequest  (required)
   * @return CreateCustomerServiceRequest201Response
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
  public CreateCustomerServiceRequest201Response createCustomerServiceRequest(CreateCustomerServiceRequestRequest createCustomerServiceRequestRequest) throws ApiException {
    return createCustomerServiceRequestWithHttpInfo(createCustomerServiceRequestRequest).getData();
  }

  /**
   * Create a customer service request
   * Create a new customer service request for the provided phone number.
   * @param createCustomerServiceRequestRequest  (required)
   * @return ApiResponse&lt;CreateCustomerServiceRequest201Response&gt;
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
  public ApiResponse<CreateCustomerServiceRequest201Response> createCustomerServiceRequestWithHttpInfo(CreateCustomerServiceRequestRequest createCustomerServiceRequestRequest) throws ApiException {
    Object localVarPostBody = createCustomerServiceRequestRequest;
    
    // verify the required parameter 'createCustomerServiceRequestRequest' is set
    if (createCustomerServiceRequestRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'createCustomerServiceRequestRequest' when calling createCustomerServiceRequest");
    }
    
    // create path and map variables
    String localVarPath = "/customer_service_requests";

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

    GenericType<CreateCustomerServiceRequest201Response> localVarReturnType = new GenericType<CreateCustomerServiceRequest201Response>() {};

    return apiClient.invokeAPI("CustomerServiceRequestApi.createCustomerServiceRequest", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get a customer service request
   * Get a specific customer service request.
   * @param customerServiceRequestId The ID of the customer service request (required)
   * @return CreateCustomerServiceRequest201Response
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
  public CreateCustomerServiceRequest201Response getCustomerServiceRequest(String customerServiceRequestId) throws ApiException {
    return getCustomerServiceRequestWithHttpInfo(customerServiceRequestId).getData();
  }

  /**
   * Get a customer service request
   * Get a specific customer service request.
   * @param customerServiceRequestId The ID of the customer service request (required)
   * @return ApiResponse&lt;CreateCustomerServiceRequest201Response&gt;
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
  public ApiResponse<CreateCustomerServiceRequest201Response> getCustomerServiceRequestWithHttpInfo(String customerServiceRequestId) throws ApiException {
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

    GenericType<CreateCustomerServiceRequest201Response> localVarReturnType = new GenericType<CreateCustomerServiceRequest201Response>() {};

    return apiClient.invokeAPI("CustomerServiceRequestApi.getCustomerServiceRequest", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * List customer service requests
   * List customer service requests.
   * @param pageNumber The page number to load (optional, default to 1)
   * @param pageSize The size of the page (optional, default to 20)
   * @param sort Specifies the sort order for results. If not given, results are sorted by created_at in descending order. (optional)
   * @param filterPhoneNumberEq Filters records to those with a specified number. (optional)
   * @param filterPhoneNumberIn Filters records to those with at least one number in the list. (optional)
   * @param filterStatusEq Filters records to those with a specific status. (optional)
   * @param filterStatusIn Filters records to those with a least one status in the list. (optional)
   * @param filterCreatedAtLt Filters records to those created before a specific date. (optional)
   * @return ListCustomerServiceRequests200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> The required authentication headers were either invalid or not included in the request. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> You do not have permission to perform the requested action on the specified resource or resources. </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check the &#39;detail&#39; field in response for details. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> An unexpected error occurred. </td><td>  -  </td></tr>
     </table>
   */
  public ListCustomerServiceRequests200Response listCustomerServiceRequests(Integer pageNumber, Integer pageSize, String sort, String filterPhoneNumberEq, List<String> filterPhoneNumberIn, String filterStatusEq, List<String> filterStatusIn, OffsetDateTime filterCreatedAtLt) throws ApiException {
    return listCustomerServiceRequestsWithHttpInfo(pageNumber, pageSize, sort, filterPhoneNumberEq, filterPhoneNumberIn, filterStatusEq, filterStatusIn, filterCreatedAtLt).getData();
  }

  /**
   * List customer service requests
   * List customer service requests.
   * @param pageNumber The page number to load (optional, default to 1)
   * @param pageSize The size of the page (optional, default to 20)
   * @param sort Specifies the sort order for results. If not given, results are sorted by created_at in descending order. (optional)
   * @param filterPhoneNumberEq Filters records to those with a specified number. (optional)
   * @param filterPhoneNumberIn Filters records to those with at least one number in the list. (optional)
   * @param filterStatusEq Filters records to those with a specific status. (optional)
   * @param filterStatusIn Filters records to those with a least one status in the list. (optional)
   * @param filterCreatedAtLt Filters records to those created before a specific date. (optional)
   * @return ApiResponse&lt;ListCustomerServiceRequests200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> The required authentication headers were either invalid or not included in the request. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> You do not have permission to perform the requested action on the specified resource or resources. </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check the &#39;detail&#39; field in response for details. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> An unexpected error occurred. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ListCustomerServiceRequests200Response> listCustomerServiceRequestsWithHttpInfo(Integer pageNumber, Integer pageSize, String sort, String filterPhoneNumberEq, List<String> filterPhoneNumberIn, String filterStatusEq, List<String> filterStatusIn, OffsetDateTime filterCreatedAtLt) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/customer_service_requests";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[number]", pageNumber));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort[]", sort));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[phone_number][eq]", filterPhoneNumberEq));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "filter[phone_number][in][]", filterPhoneNumberIn));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[status][eq]", filterStatusEq));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "filter[status][in][]", filterStatusIn));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[created_at][lt]", filterCreatedAtLt));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    GenericType<ListCustomerServiceRequests200Response> localVarReturnType = new GenericType<ListCustomerServiceRequests200Response>() {};

    return apiClient.invokeAPI("CustomerServiceRequestApi.listCustomerServiceRequests", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Verify CSR phone number coverage
   * Verify the coverage for a list of phone numbers.
   * @param verifyPhoneNumberCoverageRequest  (required)
   * @return VerifyPhoneNumberCoverage201Response
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
  public VerifyPhoneNumberCoverage201Response verifyPhoneNumberCoverage(VerifyPhoneNumberCoverageRequest verifyPhoneNumberCoverageRequest) throws ApiException {
    return verifyPhoneNumberCoverageWithHttpInfo(verifyPhoneNumberCoverageRequest).getData();
  }

  /**
   * Verify CSR phone number coverage
   * Verify the coverage for a list of phone numbers.
   * @param verifyPhoneNumberCoverageRequest  (required)
   * @return ApiResponse&lt;VerifyPhoneNumberCoverage201Response&gt;
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
  public ApiResponse<VerifyPhoneNumberCoverage201Response> verifyPhoneNumberCoverageWithHttpInfo(VerifyPhoneNumberCoverageRequest verifyPhoneNumberCoverageRequest) throws ApiException {
    Object localVarPostBody = verifyPhoneNumberCoverageRequest;
    
    // verify the required parameter 'verifyPhoneNumberCoverageRequest' is set
    if (verifyPhoneNumberCoverageRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'verifyPhoneNumberCoverageRequest' when calling verifyPhoneNumberCoverage");
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

    GenericType<VerifyPhoneNumberCoverage201Response> localVarReturnType = new GenericType<VerifyPhoneNumberCoverage201Response>() {};

    return apiClient.invokeAPI("CustomerServiceRequestApi.verifyPhoneNumberCoverage", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
