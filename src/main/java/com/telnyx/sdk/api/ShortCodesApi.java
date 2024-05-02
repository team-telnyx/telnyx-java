package com.telnyx.sdk.api;

import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.Pair;

import jakarta.ws.rs.core.GenericType;

import com.telnyx.sdk.model.Errors;
import com.telnyx.sdk.model.ListShortCodesResponse;
import com.telnyx.sdk.model.ShortCodeResponse;
import java.util.UUID;
import com.telnyx.sdk.model.UpdateShortCodeRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class ShortCodesApi {
  private ApiClient apiClient;

  public ShortCodesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ShortCodesApi(ApiClient apiClient) {
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


private ApiResponse<ListShortCodesResponse> listShortCodesWithHttpInfo(Integer pageNumber, Integer pageSize, String filterMessagingProfileId) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/short_codes";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[number]", pageNumber));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[messaging_profile_id]", filterMessagingProfileId));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    GenericType<ListShortCodesResponse> localVarReturnType = new GenericType<ListShortCodesResponse>() {};

    return apiClient.invokeAPI("ShortCodesApi.listShortCodes", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIlistShortCodesRequest {
    private Integer pageNumber;
    private Integer pageSize;
    private String filterMessagingProfileId;

    private APIlistShortCodesRequest() {
    }

    /**
     * Set pageNumber
     * @param pageNumber The page number to load (optional, default to 1)
     * @return APIlistShortCodesRequest
     */
    public APIlistShortCodesRequest pageNumber(Integer pageNumber) {
      this.pageNumber = pageNumber;
      return this;
    }

    /**
     * Set pageSize
     * @param pageSize The size of the page (optional, default to 20)
     * @return APIlistShortCodesRequest
     */
    public APIlistShortCodesRequest pageSize(Integer pageSize) {
      this.pageSize = pageSize;
      return this;
    }

    /**
     * Set filterMessagingProfileId
     * @param filterMessagingProfileId Filter by Messaging Profile ID. Use the string &#x60;null&#x60; for phone numbers without assigned profiles. A synonym for the &#x60;/messaging_profiles/{id}/short_codes&#x60; endpoint when querying about an extant profile. (optional)
     * @return APIlistShortCodesRequest
     */
    public APIlistShortCodesRequest filterMessagingProfileId(String filterMessagingProfileId) {
      this.filterMessagingProfileId = filterMessagingProfileId;
      return this;
    }

    /**
     * Execute listShortCodes request
     * @return ListShortCodesResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response with a list of short codes. </td><td>  -  </td></tr>
         <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ListShortCodesResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute listShortCodes request with HTTP info returned
     * @return ApiResponse&lt;ListShortCodesResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response with a list of short codes. </td><td>  -  </td></tr>
         <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<ListShortCodesResponse> executeWithHttpInfo() throws ApiException {
      return listShortCodesWithHttpInfo(pageNumber, pageSize, filterMessagingProfileId);
    }
  }

  /**
   * List short codes
   * 
   * @return listShortCodesRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIlistShortCodesRequest listShortCodes() throws ApiException {
    return new APIlistShortCodesRequest();
  }
  /**
   * Retrieve a short code
   * 
   * @param id The id of the short code (required)
   * @return ShortCodeResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response with details about a short code. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ShortCodeResponse retrieveShortCode(UUID id) throws ApiException {
    return retrieveShortCodeWithHttpInfo(id).getData();
  }

  /**
   * Retrieve a short code
   * 
   * @param id The id of the short code (required)
   * @return ApiResponse&lt;ShortCodeResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response with details about a short code. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ShortCodeResponse> retrieveShortCodeWithHttpInfo(UUID id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling retrieveShortCode");
    }
    
    // create path and map variables
    String localVarPath = "/short_codes/{id}"
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

    GenericType<ShortCodeResponse> localVarReturnType = new GenericType<ShortCodeResponse>() {};

    return apiClient.invokeAPI("ShortCodesApi.retrieveShortCode", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Update short code
   * Update the settings for a specific short code. To unbind a short code from a profile, set the &#x60;messaging_profile_id&#x60; to &#x60;null&#x60; or an empty string.
   * @param id The id of the short code (required)
   * @param updateShortCodeRequest Short code update (required)
   * @return ShortCodeResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response with details about a short code. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ShortCodeResponse updateShortCode(UUID id, UpdateShortCodeRequest updateShortCodeRequest) throws ApiException {
    return updateShortCodeWithHttpInfo(id, updateShortCodeRequest).getData();
  }

  /**
   * Update short code
   * Update the settings for a specific short code. To unbind a short code from a profile, set the &#x60;messaging_profile_id&#x60; to &#x60;null&#x60; or an empty string.
   * @param id The id of the short code (required)
   * @param updateShortCodeRequest Short code update (required)
   * @return ApiResponse&lt;ShortCodeResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response with details about a short code. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ShortCodeResponse> updateShortCodeWithHttpInfo(UUID id, UpdateShortCodeRequest updateShortCodeRequest) throws ApiException {
    Object localVarPostBody = updateShortCodeRequest;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling updateShortCode");
    }
    
    // verify the required parameter 'updateShortCodeRequest' is set
    if (updateShortCodeRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'updateShortCodeRequest' when calling updateShortCode");
    }
    
    // create path and map variables
    String localVarPath = "/short_codes/{id}"
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

    GenericType<ShortCodeResponse> localVarReturnType = new GenericType<ShortCodeResponse>() {};

    return apiClient.invokeAPI("ShortCodesApi.updateShortCode", localVarPath, "PATCH", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
