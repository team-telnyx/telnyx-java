package com.telnyx.sdk.api;

import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.Pair;

import jakarta.ws.rs.core.GenericType;

import com.telnyx.sdk.model.CreateOutboundVoiceProfileRequest;
import com.telnyx.sdk.model.ListOutboundVoiceProfilesResponse;
import com.telnyx.sdk.model.OutboundVoiceProfileResponse;
import com.telnyx.sdk.model.UpdateOutboundVoiceProfileRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class OutboundVoiceProfilesApi {
  private ApiClient apiClient;

  public OutboundVoiceProfilesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public OutboundVoiceProfilesApi(ApiClient apiClient) {
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
   * Create an outbound voice profile
   * Create an outbound voice profile.
   * @param createOutboundVoiceProfileRequest Parameters that can be defined when creating an outbound voice profile (required)
   * @return OutboundVoiceProfileResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Bad request </td><td>  -  </td></tr>
     </table>
   */
  public OutboundVoiceProfileResponse createVoiceProfile(CreateOutboundVoiceProfileRequest createOutboundVoiceProfileRequest) throws ApiException {
    return createVoiceProfileWithHttpInfo(createOutboundVoiceProfileRequest).getData();
  }

  /**
   * Create an outbound voice profile
   * Create an outbound voice profile.
   * @param createOutboundVoiceProfileRequest Parameters that can be defined when creating an outbound voice profile (required)
   * @return ApiResponse&lt;OutboundVoiceProfileResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Bad request </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<OutboundVoiceProfileResponse> createVoiceProfileWithHttpInfo(CreateOutboundVoiceProfileRequest createOutboundVoiceProfileRequest) throws ApiException {
    Object localVarPostBody = createOutboundVoiceProfileRequest;
    
    // verify the required parameter 'createOutboundVoiceProfileRequest' is set
    if (createOutboundVoiceProfileRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'createOutboundVoiceProfileRequest' when calling createVoiceProfile");
    }
    
    // create path and map variables
    String localVarPath = "/outbound_voice_profiles";

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

    GenericType<OutboundVoiceProfileResponse> localVarReturnType = new GenericType<OutboundVoiceProfileResponse>() {};

    return apiClient.invokeAPI("OutboundVoiceProfilesApi.createVoiceProfile", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Delete an outbound voice profile
   * Deletes an existing outbound voice profile.
   * @param id Identifies the resource. (required)
   * @return OutboundVoiceProfileResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Bad request </td><td>  -  </td></tr>
     </table>
   */
  public OutboundVoiceProfileResponse deleteOutboundVoiceProfile(String id) throws ApiException {
    return deleteOutboundVoiceProfileWithHttpInfo(id).getData();
  }

  /**
   * Delete an outbound voice profile
   * Deletes an existing outbound voice profile.
   * @param id Identifies the resource. (required)
   * @return ApiResponse&lt;OutboundVoiceProfileResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Bad request </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<OutboundVoiceProfileResponse> deleteOutboundVoiceProfileWithHttpInfo(String id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling deleteOutboundVoiceProfile");
    }
    
    // create path and map variables
    String localVarPath = "/outbound_voice_profiles/{id}"
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

    GenericType<OutboundVoiceProfileResponse> localVarReturnType = new GenericType<OutboundVoiceProfileResponse>() {};

    return apiClient.invokeAPI("OutboundVoiceProfilesApi.deleteOutboundVoiceProfile", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Retrieve an outbound voice profile
   * Retrieves the details of an existing outbound voice profile.
   * @param id Identifies the resource. (required)
   * @return OutboundVoiceProfileResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Bad request </td><td>  -  </td></tr>
     </table>
   */
  public OutboundVoiceProfileResponse getOutboundVoiceProfile(String id) throws ApiException {
    return getOutboundVoiceProfileWithHttpInfo(id).getData();
  }

  /**
   * Retrieve an outbound voice profile
   * Retrieves the details of an existing outbound voice profile.
   * @param id Identifies the resource. (required)
   * @return ApiResponse&lt;OutboundVoiceProfileResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Bad request </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<OutboundVoiceProfileResponse> getOutboundVoiceProfileWithHttpInfo(String id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getOutboundVoiceProfile");
    }
    
    // create path and map variables
    String localVarPath = "/outbound_voice_profiles/{id}"
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

    GenericType<OutboundVoiceProfileResponse> localVarReturnType = new GenericType<OutboundVoiceProfileResponse>() {};

    return apiClient.invokeAPI("OutboundVoiceProfilesApi.getOutboundVoiceProfile", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

private ApiResponse<ListOutboundVoiceProfilesResponse> listOutboundVoiceProfilesWithHttpInfo(Integer pageNumber, Integer pageSize, String filterNameContains, String sort) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/outbound_voice_profiles";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[number]", pageNumber));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[name][contains]", filterNameContains));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort", sort));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    GenericType<ListOutboundVoiceProfilesResponse> localVarReturnType = new GenericType<ListOutboundVoiceProfilesResponse>() {};

    return apiClient.invokeAPI("OutboundVoiceProfilesApi.listOutboundVoiceProfiles", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIlistOutboundVoiceProfilesRequest {
    private Integer pageNumber;
    private Integer pageSize;
    private String filterNameContains;
    private String sort;

    private APIlistOutboundVoiceProfilesRequest() {
    }

    /**
     * Set pageNumber
     * @param pageNumber The page number to load (optional, default to 1)
     * @return APIlistOutboundVoiceProfilesRequest
     */
    public APIlistOutboundVoiceProfilesRequest pageNumber(Integer pageNumber) {
      this.pageNumber = pageNumber;
      return this;
    }

    /**
     * Set pageSize
     * @param pageSize The size of the page (optional, default to 20)
     * @return APIlistOutboundVoiceProfilesRequest
     */
    public APIlistOutboundVoiceProfilesRequest pageSize(Integer pageSize) {
      this.pageSize = pageSize;
      return this;
    }

    /**
     * Set filterNameContains
     * @param filterNameContains Optional filter on outbound voice profile name. (optional)
     * @return APIlistOutboundVoiceProfilesRequest
     */
    public APIlistOutboundVoiceProfilesRequest filterNameContains(String filterNameContains) {
      this.filterNameContains = filterNameContains;
      return this;
    }

    /**
     * Set sort
     * @param sort Specifies the sort order for results. By default sorting direction is ascending. To have the results sorted in descending order add the &lt;code&gt;-&lt;/code&gt; prefix.&lt;br/&gt;&lt;br/&gt; That is: &lt;ul&gt;   &lt;li&gt;     &lt;code&gt;name&lt;/code&gt;: sorts the result by the     &lt;code&gt;name&lt;/code&gt; field in ascending order.   &lt;/li&gt;    &lt;li&gt;     &lt;code&gt;-name&lt;/code&gt;: sorts the result by the     &lt;code&gt;name&lt;/code&gt; field in descending order.   &lt;/li&gt; &lt;/ul&gt; &lt;br/&gt; (optional, default to -created_at)
     * @return APIlistOutboundVoiceProfilesRequest
     */
    public APIlistOutboundVoiceProfilesRequest sort(String sort) {
      this.sort = sort;
      return this;
    }

    /**
     * Execute listOutboundVoiceProfiles request
     * @return ListOutboundVoiceProfilesResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
         <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         <tr><td> 422 </td><td> Bad request </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ListOutboundVoiceProfilesResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute listOutboundVoiceProfiles request with HTTP info returned
     * @return ApiResponse&lt;ListOutboundVoiceProfilesResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
         <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         <tr><td> 422 </td><td> Bad request </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<ListOutboundVoiceProfilesResponse> executeWithHttpInfo() throws ApiException {
      return listOutboundVoiceProfilesWithHttpInfo(pageNumber, pageSize, filterNameContains, sort);
    }
  }

  /**
   * Get all outbound voice profiles
   * Get all outbound voice profiles belonging to the user that match the given filters.
   * @return listOutboundVoiceProfilesRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIlistOutboundVoiceProfilesRequest listOutboundVoiceProfiles() throws ApiException {
    return new APIlistOutboundVoiceProfilesRequest();
  }
  /**
   * Updates an existing outbound voice profile.
   * Updates an existing outbound voice profile.
   * @param id Identifies the resource. (required)
   * @param updateOutboundVoiceProfileRequest Parameters that can be updated on an outbound voice profile (required)
   * @return OutboundVoiceProfileResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Bad request </td><td>  -  </td></tr>
     </table>
   */
  public OutboundVoiceProfileResponse updateOutboundVoiceProfile(String id, UpdateOutboundVoiceProfileRequest updateOutboundVoiceProfileRequest) throws ApiException {
    return updateOutboundVoiceProfileWithHttpInfo(id, updateOutboundVoiceProfileRequest).getData();
  }

  /**
   * Updates an existing outbound voice profile.
   * Updates an existing outbound voice profile.
   * @param id Identifies the resource. (required)
   * @param updateOutboundVoiceProfileRequest Parameters that can be updated on an outbound voice profile (required)
   * @return ApiResponse&lt;OutboundVoiceProfileResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Bad request </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<OutboundVoiceProfileResponse> updateOutboundVoiceProfileWithHttpInfo(String id, UpdateOutboundVoiceProfileRequest updateOutboundVoiceProfileRequest) throws ApiException {
    Object localVarPostBody = updateOutboundVoiceProfileRequest;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling updateOutboundVoiceProfile");
    }
    
    // verify the required parameter 'updateOutboundVoiceProfileRequest' is set
    if (updateOutboundVoiceProfileRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'updateOutboundVoiceProfileRequest' when calling updateOutboundVoiceProfile");
    }
    
    // create path and map variables
    String localVarPath = "/outbound_voice_profiles/{id}"
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

    GenericType<OutboundVoiceProfileResponse> localVarReturnType = new GenericType<OutboundVoiceProfileResponse>() {};

    return apiClient.invokeAPI("OutboundVoiceProfilesApi.updateOutboundVoiceProfile", localVarPath, "PATCH", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
