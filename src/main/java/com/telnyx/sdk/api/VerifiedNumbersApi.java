package com.telnyx.sdk.api;

import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.Pair;

import jakarta.ws.rs.core.GenericType;

import com.telnyx.sdk.model.CreateVerifiedNumberRequest;
import com.telnyx.sdk.model.CreateVerifiedNumberResponse;
import com.telnyx.sdk.model.Errors;
import com.telnyx.sdk.model.ListCustomerServiceRecords422Response;
import com.telnyx.sdk.model.ListVerifiedNumbersResponse;
import com.telnyx.sdk.model.VerifiedNumberResponseDataWrapper;
import com.telnyx.sdk.model.VerifyVerificationCodeRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class VerifiedNumbersApi {
  private ApiClient apiClient;

  public VerifiedNumbersApi() {
    this(Configuration.getDefaultApiClient());
  }

  public VerifiedNumbersApi(ApiClient apiClient) {
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
   * Request phone number verification
   * Initiates phone number verification procedure.
   * @param createVerifiedNumberRequest  (required)
   * @return CreateVerifiedNumberResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Expected response to a valid request. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Unexpected error </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized Request </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check the &#39;detail&#39; field in response for details. </td><td>  -  </td></tr>
     </table>
   */
  public CreateVerifiedNumberResponse createVerifiedNumber(CreateVerifiedNumberRequest createVerifiedNumberRequest) throws ApiException {
    return createVerifiedNumberWithHttpInfo(createVerifiedNumberRequest).getData();
  }

  /**
   * Request phone number verification
   * Initiates phone number verification procedure.
   * @param createVerifiedNumberRequest  (required)
   * @return ApiResponse&lt;CreateVerifiedNumberResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Expected response to a valid request. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Unexpected error </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized Request </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check the &#39;detail&#39; field in response for details. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CreateVerifiedNumberResponse> createVerifiedNumberWithHttpInfo(CreateVerifiedNumberRequest createVerifiedNumberRequest) throws ApiException {
    Object localVarPostBody = createVerifiedNumberRequest;
    
    // verify the required parameter 'createVerifiedNumberRequest' is set
    if (createVerifiedNumberRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'createVerifiedNumberRequest' when calling createVerifiedNumber");
    }
    
    // create path and map variables
    String localVarPath = "/verified_numbers";

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

    GenericType<CreateVerifiedNumberResponse> localVarReturnType = new GenericType<CreateVerifiedNumberResponse>() {};

    return apiClient.invokeAPI("VerifiedNumbersApi.createVerifiedNumber", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Delete a verified number
   * 
   * @param phoneNumber The phone number being deleted. (required)
   * @return VerifiedNumberResponseDataWrapper
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Expected verifications response to a valid request. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Unexpected error </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized Request </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource Not Found </td><td>  -  </td></tr>
     </table>
   */
  public VerifiedNumberResponseDataWrapper deleteVerifiedNumber(String phoneNumber) throws ApiException {
    return deleteVerifiedNumberWithHttpInfo(phoneNumber).getData();
  }

  /**
   * Delete a verified number
   * 
   * @param phoneNumber The phone number being deleted. (required)
   * @return ApiResponse&lt;VerifiedNumberResponseDataWrapper&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Expected verifications response to a valid request. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Unexpected error </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized Request </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource Not Found </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<VerifiedNumberResponseDataWrapper> deleteVerifiedNumberWithHttpInfo(String phoneNumber) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'phoneNumber' is set
    if (phoneNumber == null) {
      throw new ApiException(400, "Missing the required parameter 'phoneNumber' when calling deleteVerifiedNumber");
    }
    
    // create path and map variables
    String localVarPath = "/verified_numbers/{phone_number}"
      .replaceAll("\\{" + "phone_number" + "\\}", apiClient.escapeString(phoneNumber.toString()));

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

    GenericType<VerifiedNumberResponseDataWrapper> localVarReturnType = new GenericType<VerifiedNumberResponseDataWrapper>() {};

    return apiClient.invokeAPI("VerifiedNumbersApi.deleteVerifiedNumber", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Retrieve a verified number
   * 
   * @param phoneNumber The phone number being requested. (required)
   * @return VerifiedNumberResponseDataWrapper
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Expected verifications response to a valid request. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Unexpected error </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized Request </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource Not Found </td><td>  -  </td></tr>
     </table>
   */
  public VerifiedNumberResponseDataWrapper getVerifiedNumber(String phoneNumber) throws ApiException {
    return getVerifiedNumberWithHttpInfo(phoneNumber).getData();
  }

  /**
   * Retrieve a verified number
   * 
   * @param phoneNumber The phone number being requested. (required)
   * @return ApiResponse&lt;VerifiedNumberResponseDataWrapper&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Expected verifications response to a valid request. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Unexpected error </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized Request </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource Not Found </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<VerifiedNumberResponseDataWrapper> getVerifiedNumberWithHttpInfo(String phoneNumber) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'phoneNumber' is set
    if (phoneNumber == null) {
      throw new ApiException(400, "Missing the required parameter 'phoneNumber' when calling getVerifiedNumber");
    }
    
    // create path and map variables
    String localVarPath = "/verified_numbers/{phone_number}"
      .replaceAll("\\{" + "phone_number" + "\\}", apiClient.escapeString(phoneNumber.toString()));

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

    GenericType<VerifiedNumberResponseDataWrapper> localVarReturnType = new GenericType<VerifiedNumberResponseDataWrapper>() {};

    return apiClient.invokeAPI("VerifiedNumbersApi.getVerifiedNumber", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

private ApiResponse<ListVerifiedNumbersResponse> listVerifiedNumbersWithHttpInfo(Integer pageSize, Integer pageNumber) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/verified_numbers";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[number]", pageNumber));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    GenericType<ListVerifiedNumbersResponse> localVarReturnType = new GenericType<ListVerifiedNumbersResponse>() {};

    return apiClient.invokeAPI("VerifiedNumbersApi.listVerifiedNumbers", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIlistVerifiedNumbersRequest {
    private Integer pageSize;
    private Integer pageNumber;

    private APIlistVerifiedNumbersRequest() {
    }

    /**
     * Set pageSize
     * @param pageSize  (optional, default to 25)
     * @return APIlistVerifiedNumbersRequest
     */
    public APIlistVerifiedNumbersRequest pageSize(Integer pageSize) {
      this.pageSize = pageSize;
      return this;
    }

    /**
     * Set pageNumber
     * @param pageNumber  (optional, default to 1)
     * @return APIlistVerifiedNumbersRequest
     */
    public APIlistVerifiedNumbersRequest pageNumber(Integer pageNumber) {
      this.pageNumber = pageNumber;
      return this;
    }

    /**
     * Execute listVerifiedNumbers request
     * @return ListVerifiedNumbersResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Expected response to a valid request. </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Unexpected error </td><td>  -  </td></tr>
         <tr><td> 401 </td><td> Unauthorized Request </td><td>  -  </td></tr>
         <tr><td> 422 </td><td> Unprocessable entity. Check the &#39;detail&#39; field in response for details. </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ListVerifiedNumbersResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute listVerifiedNumbers request with HTTP info returned
     * @return ApiResponse&lt;ListVerifiedNumbersResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Expected response to a valid request. </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Unexpected error </td><td>  -  </td></tr>
         <tr><td> 401 </td><td> Unauthorized Request </td><td>  -  </td></tr>
         <tr><td> 422 </td><td> Unprocessable entity. Check the &#39;detail&#39; field in response for details. </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<ListVerifiedNumbersResponse> executeWithHttpInfo() throws ApiException {
      return listVerifiedNumbersWithHttpInfo(pageSize, pageNumber);
    }
  }

  /**
   * List all Verified Numbers
   * Gets a paginated list of Verified Numbers.
   * @return listVerifiedNumbersRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIlistVerifiedNumbersRequest listVerifiedNumbers() throws ApiException {
    return new APIlistVerifiedNumbersRequest();
  }
  /**
   * Submit verification code
   * 
   * @param phoneNumber The phone number being verified. (required)
   * @param verifyVerificationCodeRequest  (required)
   * @return VerifiedNumberResponseDataWrapper
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Expected response to a valid request. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Unexpected error </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized Request </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource Not Found </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check the &#39;detail&#39; field in response for details. </td><td>  -  </td></tr>
     </table>
   */
  public VerifiedNumberResponseDataWrapper verifyVerificationCode(String phoneNumber, VerifyVerificationCodeRequest verifyVerificationCodeRequest) throws ApiException {
    return verifyVerificationCodeWithHttpInfo(phoneNumber, verifyVerificationCodeRequest).getData();
  }

  /**
   * Submit verification code
   * 
   * @param phoneNumber The phone number being verified. (required)
   * @param verifyVerificationCodeRequest  (required)
   * @return ApiResponse&lt;VerifiedNumberResponseDataWrapper&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Expected response to a valid request. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Unexpected error </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized Request </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource Not Found </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check the &#39;detail&#39; field in response for details. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<VerifiedNumberResponseDataWrapper> verifyVerificationCodeWithHttpInfo(String phoneNumber, VerifyVerificationCodeRequest verifyVerificationCodeRequest) throws ApiException {
    Object localVarPostBody = verifyVerificationCodeRequest;
    
    // verify the required parameter 'phoneNumber' is set
    if (phoneNumber == null) {
      throw new ApiException(400, "Missing the required parameter 'phoneNumber' when calling verifyVerificationCode");
    }
    
    // verify the required parameter 'verifyVerificationCodeRequest' is set
    if (verifyVerificationCodeRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'verifyVerificationCodeRequest' when calling verifyVerificationCode");
    }
    
    // create path and map variables
    String localVarPath = "/verified_numbers/{phone_number}/actions/verify"
      .replaceAll("\\{" + "phone_number" + "\\}", apiClient.escapeString(phoneNumber.toString()));

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

    GenericType<VerifiedNumberResponseDataWrapper> localVarReturnType = new GenericType<VerifiedNumberResponseDataWrapper>() {};

    return apiClient.invokeAPI("VerifiedNumbersApi.verifyVerificationCode", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
