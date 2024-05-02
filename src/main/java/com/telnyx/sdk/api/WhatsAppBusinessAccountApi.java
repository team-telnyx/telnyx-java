package com.telnyx.sdk.api;

import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.Pair;

import jakarta.ws.rs.core.GenericType;

import com.telnyx.sdk.model.Errors;
import com.telnyx.sdk.model.ListWhatsAppBusinessAccountsResponse;
import com.telnyx.sdk.model.ListWhatsAppPhoneNumbersResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class WhatsAppBusinessAccountApi {
  private ApiClient apiClient;

  public WhatsAppBusinessAccountApi() {
    this(Configuration.getDefaultApiClient());
  }

  public WhatsAppBusinessAccountApi(ApiClient apiClient) {
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


private ApiResponse<ListWhatsAppBusinessAccountsResponse> listWhatsappBusinessAccountsWithHttpInfo(Integer pageNumber, Integer pageSize) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/whatsapp_business_accounts";

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

    GenericType<ListWhatsAppBusinessAccountsResponse> localVarReturnType = new GenericType<ListWhatsAppBusinessAccountsResponse>() {};

    return apiClient.invokeAPI("WhatsAppBusinessAccountApi.listWhatsappBusinessAccounts", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIlistWhatsappBusinessAccountsRequest {
    private Integer pageNumber;
    private Integer pageSize;

    private APIlistWhatsappBusinessAccountsRequest() {
    }

    /**
     * Set pageNumber
     * @param pageNumber The page number to load (optional, default to 1)
     * @return APIlistWhatsappBusinessAccountsRequest
     */
    public APIlistWhatsappBusinessAccountsRequest pageNumber(Integer pageNumber) {
      this.pageNumber = pageNumber;
      return this;
    }

    /**
     * Set pageSize
     * @param pageSize The size of the page (optional, default to 20)
     * @return APIlistWhatsappBusinessAccountsRequest
     */
    public APIlistWhatsappBusinessAccountsRequest pageSize(Integer pageSize) {
      this.pageSize = pageSize;
      return this;
    }

    /**
     * Execute listWhatsappBusinessAccounts request
     * @return ListWhatsAppBusinessAccountsResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response with a list of WhatsApp Business Accounts. </td><td>  -  </td></tr>
         <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ListWhatsAppBusinessAccountsResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute listWhatsappBusinessAccounts request with HTTP info returned
     * @return ApiResponse&lt;ListWhatsAppBusinessAccountsResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response with a list of WhatsApp Business Accounts. </td><td>  -  </td></tr>
         <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<ListWhatsAppBusinessAccountsResponse> executeWithHttpInfo() throws ApiException {
      return listWhatsappBusinessAccountsWithHttpInfo(pageNumber, pageSize);
    }
  }

  /**
   * Lists the WhatsApp Business Accounts owned by the current organization
   * 
   * @return listWhatsappBusinessAccountsRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIlistWhatsappBusinessAccountsRequest listWhatsappBusinessAccounts() throws ApiException {
    return new APIlistWhatsappBusinessAccountsRequest();
  }

private ApiResponse<String> retrieveWhatsappBusinessAccountWithHttpInfo(String id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling retrieveWhatsappBusinessAccount");
    }
    
    // create path and map variables
    String localVarPath = "/whatsapp_business_accounts/{id}"
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

    GenericType<String> localVarReturnType = new GenericType<String>() {};

    return apiClient.invokeAPI("WhatsAppBusinessAccountApi.retrieveWhatsappBusinessAccount", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIretrieveWhatsappBusinessAccountRequest {
    private String id;

    private APIretrieveWhatsappBusinessAccountRequest(String id) {
      this.id = id;
    }

    /**
     * Execute retrieveWhatsappBusinessAccount request
     * @return WhatsAppBusinessAccount
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> WhatsApp Business Account details </td><td>  -  </td></tr>
         <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
       </table>
     
     */
    
    public String execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute retrieveWhatsappBusinessAccount request with HTTP info returned
     * @return ApiResponse&lt;WhatsAppBusinessAccount&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> WhatsApp Business Account details </td><td>  -  </td></tr>
         <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<String> executeWithHttpInfo() throws ApiException {
      return retrieveWhatsappBusinessAccountWithHttpInfo(id);
    }
  }

  /**
   * Retrieves a WhatsApp Business Account
   * 
   * @param id Identifies the WhatsApp Business Account (required)
   * @return retrieveWhatsappBusinessAccountRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIretrieveWhatsappBusinessAccountRequest retrieveWhatsappBusinessAccount(String id) throws ApiException {
    return new APIretrieveWhatsappBusinessAccountRequest(id);
  }

private ApiResponse<ListWhatsAppPhoneNumbersResponse> retrieveWhatsappBusinessAccountPhoneNumbersWithHttpInfo(String id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling retrieveWhatsappBusinessAccountPhoneNumbers");
    }
    
    // create path and map variables
    String localVarPath = "/whatsapp_business_accounts/{id}/phone_numbers"
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

    GenericType<ListWhatsAppPhoneNumbersResponse> localVarReturnType = new GenericType<ListWhatsAppPhoneNumbersResponse>() {};

    return apiClient.invokeAPI("WhatsAppBusinessAccountApi.retrieveWhatsappBusinessAccountPhoneNumbers", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIretrieveWhatsappBusinessAccountPhoneNumbersRequest {
    private String id;

    private APIretrieveWhatsappBusinessAccountPhoneNumbersRequest(String id) {
      this.id = id;
    }

    /**
     * Execute retrieveWhatsappBusinessAccountPhoneNumbers request
     * @return ListWhatsAppPhoneNumbersResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response with a list of WhatsApp Phone Numbers. </td><td>  -  </td></tr>
         <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ListWhatsAppPhoneNumbersResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute retrieveWhatsappBusinessAccountPhoneNumbers request with HTTP info returned
     * @return ApiResponse&lt;ListWhatsAppPhoneNumbersResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response with a list of WhatsApp Phone Numbers. </td><td>  -  </td></tr>
         <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<ListWhatsAppPhoneNumbersResponse> executeWithHttpInfo() throws ApiException {
      return retrieveWhatsappBusinessAccountPhoneNumbersWithHttpInfo(id);
    }
  }

  /**
   * Retrieves the phone numbers from a WhatsApp Business Account
   * 
   * @param id Identifies the WhatsApp Business Account (required)
   * @return retrieveWhatsappBusinessAccountPhoneNumbersRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIretrieveWhatsappBusinessAccountPhoneNumbersRequest retrieveWhatsappBusinessAccountPhoneNumbers(String id) throws ApiException {
    return new APIretrieveWhatsappBusinessAccountPhoneNumbersRequest(id);
  }
}
