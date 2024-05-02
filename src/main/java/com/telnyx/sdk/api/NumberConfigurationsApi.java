package com.telnyx.sdk.api;

import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.Pair;

import jakarta.ws.rs.core.GenericType;

import com.telnyx.sdk.model.Errors;
import com.telnyx.sdk.model.ListMessagingSettingsResponse;
import com.telnyx.sdk.model.RetrieveMessagingSettingsResponse;
import com.telnyx.sdk.model.UpdatePhoneNumberMessagingSettingsRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class NumberConfigurationsApi {
  private ApiClient apiClient;

  public NumberConfigurationsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public NumberConfigurationsApi(ApiClient apiClient) {
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
   * Retrieve a phone number with messaging settings
   * 
   * @param id Identifies the type of resource. (required)
   * @return RetrieveMessagingSettingsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response with details about a phone number including voice settings. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public RetrieveMessagingSettingsResponse getPhoneNumberMessagingSettings(String id) throws ApiException {
    return getPhoneNumberMessagingSettingsWithHttpInfo(id).getData();
  }

  /**
   * Retrieve a phone number with messaging settings
   * 
   * @param id Identifies the type of resource. (required)
   * @return ApiResponse&lt;RetrieveMessagingSettingsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response with details about a phone number including voice settings. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<RetrieveMessagingSettingsResponse> getPhoneNumberMessagingSettingsWithHttpInfo(String id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getPhoneNumberMessagingSettings");
    }
    
    // create path and map variables
    String localVarPath = "/phone_numbers/{id}/messaging"
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

    GenericType<RetrieveMessagingSettingsResponse> localVarReturnType = new GenericType<RetrieveMessagingSettingsResponse>() {};

    return apiClient.invokeAPI("NumberConfigurationsApi.getPhoneNumberMessagingSettings", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

private ApiResponse<ListMessagingSettingsResponse> listPhoneNumbersWithMessagingSettingsWithHttpInfo(Integer pageNumber, Integer pageSize) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/phone_numbers/messaging";

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

    GenericType<ListMessagingSettingsResponse> localVarReturnType = new GenericType<ListMessagingSettingsResponse>() {};

    return apiClient.invokeAPI("NumberConfigurationsApi.listPhoneNumbersWithMessagingSettings", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIlistPhoneNumbersWithMessagingSettingsRequest {
    private Integer pageNumber;
    private Integer pageSize;

    private APIlistPhoneNumbersWithMessagingSettingsRequest() {
    }

    /**
     * Set pageNumber
     * @param pageNumber The page number to load (optional, default to 1)
     * @return APIlistPhoneNumbersWithMessagingSettingsRequest
     */
    public APIlistPhoneNumbersWithMessagingSettingsRequest pageNumber(Integer pageNumber) {
      this.pageNumber = pageNumber;
      return this;
    }

    /**
     * Set pageSize
     * @param pageSize The size of the page (optional, default to 20)
     * @return APIlistPhoneNumbersWithMessagingSettingsRequest
     */
    public APIlistPhoneNumbersWithMessagingSettingsRequest pageSize(Integer pageSize) {
      this.pageSize = pageSize;
      return this;
    }

    /**
     * Execute listPhoneNumbersWithMessagingSettings request
     * @return ListMessagingSettingsResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response with a list of phone numbers with messaging settings. </td><td>  -  </td></tr>
         <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ListMessagingSettingsResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute listPhoneNumbersWithMessagingSettings request with HTTP info returned
     * @return ApiResponse&lt;ListMessagingSettingsResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response with a list of phone numbers with messaging settings. </td><td>  -  </td></tr>
         <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<ListMessagingSettingsResponse> executeWithHttpInfo() throws ApiException {
      return listPhoneNumbersWithMessagingSettingsWithHttpInfo(pageNumber, pageSize);
    }
  }

  /**
   * List phone numbers with messaging settings
   * 
   * @return listPhoneNumbersWithMessagingSettingsRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIlistPhoneNumbersWithMessagingSettingsRequest listPhoneNumbersWithMessagingSettings() throws ApiException {
    return new APIlistPhoneNumbersWithMessagingSettingsRequest();
  }
  /**
   * Update a phone number with messaging settings
   * 
   * @param id Identifies the type of resource. (required)
   * @param updatePhoneNumberMessagingSettingsRequest Updated messaging settings for the phone number (required)
   * @return RetrieveMessagingSettingsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response with details about a phone number including voice settings. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public RetrieveMessagingSettingsResponse updatePhoneNumberMessagingSettings(String id, UpdatePhoneNumberMessagingSettingsRequest updatePhoneNumberMessagingSettingsRequest) throws ApiException {
    return updatePhoneNumberMessagingSettingsWithHttpInfo(id, updatePhoneNumberMessagingSettingsRequest).getData();
  }

  /**
   * Update a phone number with messaging settings
   * 
   * @param id Identifies the type of resource. (required)
   * @param updatePhoneNumberMessagingSettingsRequest Updated messaging settings for the phone number (required)
   * @return ApiResponse&lt;RetrieveMessagingSettingsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response with details about a phone number including voice settings. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<RetrieveMessagingSettingsResponse> updatePhoneNumberMessagingSettingsWithHttpInfo(String id, UpdatePhoneNumberMessagingSettingsRequest updatePhoneNumberMessagingSettingsRequest) throws ApiException {
    Object localVarPostBody = updatePhoneNumberMessagingSettingsRequest;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling updatePhoneNumberMessagingSettings");
    }
    
    // verify the required parameter 'updatePhoneNumberMessagingSettingsRequest' is set
    if (updatePhoneNumberMessagingSettingsRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'updatePhoneNumberMessagingSettingsRequest' when calling updatePhoneNumberMessagingSettings");
    }
    
    // create path and map variables
    String localVarPath = "/phone_numbers/{id}/messaging"
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
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    GenericType<RetrieveMessagingSettingsResponse> localVarReturnType = new GenericType<RetrieveMessagingSettingsResponse>() {};

    return apiClient.invokeAPI("NumberConfigurationsApi.updatePhoneNumberMessagingSettings", localVarPath, "PATCH", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
