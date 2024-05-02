package com.telnyx.sdk.api;

import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.Pair;

import jakarta.ws.rs.core.GenericType;

import com.telnyx.sdk.model.CreateCustomerServiceRecord201Response;
import com.telnyx.sdk.model.CreateCustomerServiceRecordRequest;
import com.telnyx.sdk.model.GetCustomerServiceRecord201Response;
import com.telnyx.sdk.model.GetCustomerServiceRecord404Response;
import com.telnyx.sdk.model.ListCustomerServiceRecords200Response;
import com.telnyx.sdk.model.ListCustomerServiceRecords401Response;
import com.telnyx.sdk.model.ListCustomerServiceRecords403Response;
import com.telnyx.sdk.model.ListCustomerServiceRecords422Response;
import com.telnyx.sdk.model.ListCustomerServiceRecords500Response;
import java.time.OffsetDateTime;
import com.telnyx.sdk.model.VerifyPhoneNumberCoverage201Response;
import com.telnyx.sdk.model.VerifyPhoneNumberCoverageRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class CustomerServiceRecordApi {
  private ApiClient apiClient;

  public CustomerServiceRecordApi() {
    this(Configuration.getDefaultApiClient());
  }

  public CustomerServiceRecordApi(ApiClient apiClient) {
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
   * Create a customer service record
   * Create a new customer service record for the provided phone number.
   * @param createCustomerServiceRecordRequest  (required)
   * @return CreateCustomerServiceRecord201Response
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
  public CreateCustomerServiceRecord201Response createCustomerServiceRecord(CreateCustomerServiceRecordRequest createCustomerServiceRecordRequest) throws ApiException {
    return createCustomerServiceRecordWithHttpInfo(createCustomerServiceRecordRequest).getData();
  }

  /**
   * Create a customer service record
   * Create a new customer service record for the provided phone number.
   * @param createCustomerServiceRecordRequest  (required)
   * @return ApiResponse&lt;CreateCustomerServiceRecord201Response&gt;
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
  public ApiResponse<CreateCustomerServiceRecord201Response> createCustomerServiceRecordWithHttpInfo(CreateCustomerServiceRecordRequest createCustomerServiceRecordRequest) throws ApiException {
    Object localVarPostBody = createCustomerServiceRecordRequest;
    
    // verify the required parameter 'createCustomerServiceRecordRequest' is set
    if (createCustomerServiceRecordRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'createCustomerServiceRecordRequest' when calling createCustomerServiceRecord");
    }
    
    // create path and map variables
    String localVarPath = "/customer_service_records";

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

    GenericType<CreateCustomerServiceRecord201Response> localVarReturnType = new GenericType<CreateCustomerServiceRecord201Response>() {};

    return apiClient.invokeAPI("CustomerServiceRecordApi.createCustomerServiceRecord", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get a customer service record
   * Get a specific customer service record.
   * @param customerServiceRecordId The ID of the customer service record (required)
   * @return GetCustomerServiceRecord201Response
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
  public GetCustomerServiceRecord201Response getCustomerServiceRecord(String customerServiceRecordId) throws ApiException {
    return getCustomerServiceRecordWithHttpInfo(customerServiceRecordId).getData();
  }

  /**
   * Get a customer service record
   * Get a specific customer service record.
   * @param customerServiceRecordId The ID of the customer service record (required)
   * @return ApiResponse&lt;GetCustomerServiceRecord201Response&gt;
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
  public ApiResponse<GetCustomerServiceRecord201Response> getCustomerServiceRecordWithHttpInfo(String customerServiceRecordId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'customerServiceRecordId' is set
    if (customerServiceRecordId == null) {
      throw new ApiException(400, "Missing the required parameter 'customerServiceRecordId' when calling getCustomerServiceRecord");
    }
    
    // create path and map variables
    String localVarPath = "/customer_service_records/{customer_service_record_id}"
      .replaceAll("\\{" + "customer_service_record_id" + "\\}", apiClient.escapeString(customerServiceRecordId.toString()));

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

    GenericType<GetCustomerServiceRecord201Response> localVarReturnType = new GenericType<GetCustomerServiceRecord201Response>() {};

    return apiClient.invokeAPI("CustomerServiceRecordApi.getCustomerServiceRecord", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * List customer service records
   * List customer service records.
   * @param pageNumber The page number to load (optional, default to 1)
   * @param pageSize The size of the page (optional, default to 20)
   * @param sort Specifies the sort order for results. If not given, results are sorted by created_at in descending order. (optional)
   * @param filterPhoneNumberEq Filters records to those with a specified number. (optional)
   * @param filterPhoneNumberIn Filters records to those with at least one number in the list. (optional)
   * @param filterStatusEq Filters records to those with a specific status. (optional)
   * @param filterStatusIn Filters records to those with a least one status in the list. (optional)
   * @param filterCreatedAtLt Filters records to those created after a specific date. (optional)
   * @return ListCustomerServiceRecords200Response
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
  public ListCustomerServiceRecords200Response listCustomerServiceRecords(Integer pageNumber, Integer pageSize, String sort, String filterPhoneNumberEq, List<String> filterPhoneNumberIn, String filterStatusEq, List<String> filterStatusIn, OffsetDateTime filterCreatedAtLt) throws ApiException {
    return listCustomerServiceRecordsWithHttpInfo(pageNumber, pageSize, sort, filterPhoneNumberEq, filterPhoneNumberIn, filterStatusEq, filterStatusIn, filterCreatedAtLt).getData();
  }

  /**
   * List customer service records
   * List customer service records.
   * @param pageNumber The page number to load (optional, default to 1)
   * @param pageSize The size of the page (optional, default to 20)
   * @param sort Specifies the sort order for results. If not given, results are sorted by created_at in descending order. (optional)
   * @param filterPhoneNumberEq Filters records to those with a specified number. (optional)
   * @param filterPhoneNumberIn Filters records to those with at least one number in the list. (optional)
   * @param filterStatusEq Filters records to those with a specific status. (optional)
   * @param filterStatusIn Filters records to those with a least one status in the list. (optional)
   * @param filterCreatedAtLt Filters records to those created after a specific date. (optional)
   * @return ApiResponse&lt;ListCustomerServiceRecords200Response&gt;
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
  public ApiResponse<ListCustomerServiceRecords200Response> listCustomerServiceRecordsWithHttpInfo(Integer pageNumber, Integer pageSize, String sort, String filterPhoneNumberEq, List<String> filterPhoneNumberIn, String filterStatusEq, List<String> filterStatusIn, OffsetDateTime filterCreatedAtLt) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/customer_service_records";

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

    GenericType<ListCustomerServiceRecords200Response> localVarReturnType = new GenericType<ListCustomerServiceRecords200Response>() {};

    return apiClient.invokeAPI("CustomerServiceRecordApi.listCustomerServiceRecords", localVarPath, "GET", localVarQueryParams, localVarPostBody,
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
    String localVarPath = "/customer_service_records/phone_number_coverages";

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

    return apiClient.invokeAPI("CustomerServiceRecordApi.verifyPhoneNumberCoverage", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
