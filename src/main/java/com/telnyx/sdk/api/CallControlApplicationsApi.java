package com.telnyx.sdk.api;

import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.Pair;

import jakarta.ws.rs.core.GenericType;

import com.telnyx.sdk.model.CallControlApplicationResponse;
import com.telnyx.sdk.model.CreateCallControlApplicationRequest;
import com.telnyx.sdk.model.ListCallControlApplicationsResponse;
import com.telnyx.sdk.model.UpdateCallControlApplicationRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class CallControlApplicationsApi {
  private ApiClient apiClient;

  public CallControlApplicationsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public CallControlApplicationsApi(ApiClient apiClient) {
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
   * Create a call control application
   * Create a call control application.
   * @param createCallControlApplicationRequest Create call control application request. (required)
   * @return CallControlApplicationResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Successful response with details about a call control application. </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Bad Request </td><td>  -  </td></tr>
     </table>
   */
  public CallControlApplicationResponse createCallControlApplication(CreateCallControlApplicationRequest createCallControlApplicationRequest) throws ApiException {
    return createCallControlApplicationWithHttpInfo(createCallControlApplicationRequest).getData();
  }

  /**
   * Create a call control application
   * Create a call control application.
   * @param createCallControlApplicationRequest Create call control application request. (required)
   * @return ApiResponse&lt;CallControlApplicationResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Successful response with details about a call control application. </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Bad Request </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CallControlApplicationResponse> createCallControlApplicationWithHttpInfo(CreateCallControlApplicationRequest createCallControlApplicationRequest) throws ApiException {
    Object localVarPostBody = createCallControlApplicationRequest;
    
    // verify the required parameter 'createCallControlApplicationRequest' is set
    if (createCallControlApplicationRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'createCallControlApplicationRequest' when calling createCallControlApplication");
    }
    
    // create path and map variables
    String localVarPath = "/call_control_applications";

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

    GenericType<CallControlApplicationResponse> localVarReturnType = new GenericType<CallControlApplicationResponse>() {};

    return apiClient.invokeAPI("CallControlApplicationsApi.createCallControlApplication", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Delete a call control application
   * Deletes a call control application.
   * @param id Identifies the resource. (required)
   * @return CallControlApplicationResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response with details about a call control application. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated response. Happens when the current user cannot be authenticated. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Bad request </td><td>  -  </td></tr>
     </table>
   */
  public CallControlApplicationResponse deleteCallControlApplication(String id) throws ApiException {
    return deleteCallControlApplicationWithHttpInfo(id).getData();
  }

  /**
   * Delete a call control application
   * Deletes a call control application.
   * @param id Identifies the resource. (required)
   * @return ApiResponse&lt;CallControlApplicationResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response with details about a call control application. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated response. Happens when the current user cannot be authenticated. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Bad request </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CallControlApplicationResponse> deleteCallControlApplicationWithHttpInfo(String id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling deleteCallControlApplication");
    }
    
    // create path and map variables
    String localVarPath = "/call_control_applications/{id}"
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

    GenericType<CallControlApplicationResponse> localVarReturnType = new GenericType<CallControlApplicationResponse>() {};

    return apiClient.invokeAPI("CallControlApplicationsApi.deleteCallControlApplication", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

private ApiResponse<ListCallControlApplicationsResponse> listCallControlApplicationsWithHttpInfo(Integer pageNumber, Integer pageSize, String filterApplicationNameContains, String filterOutboundOutboundVoiceProfileId, String sort) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/call_control_applications";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[number]", pageNumber));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[application_name][contains]", filterApplicationNameContains));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[outbound.outbound_voice_profile_id]", filterOutboundOutboundVoiceProfileId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort", sort));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    GenericType<ListCallControlApplicationsResponse> localVarReturnType = new GenericType<ListCallControlApplicationsResponse>() {};

    return apiClient.invokeAPI("CallControlApplicationsApi.listCallControlApplications", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIlistCallControlApplicationsRequest {
    private Integer pageNumber;
    private Integer pageSize;
    private String filterApplicationNameContains;
    private String filterOutboundOutboundVoiceProfileId;
    private String sort;

    private APIlistCallControlApplicationsRequest() {
    }

    /**
     * Set pageNumber
     * @param pageNumber The page number to load (optional, default to 1)
     * @return APIlistCallControlApplicationsRequest
     */
    public APIlistCallControlApplicationsRequest pageNumber(Integer pageNumber) {
      this.pageNumber = pageNumber;
      return this;
    }

    /**
     * Set pageSize
     * @param pageSize The size of the page (optional, default to 20)
     * @return APIlistCallControlApplicationsRequest
     */
    public APIlistCallControlApplicationsRequest pageSize(Integer pageSize) {
      this.pageSize = pageSize;
      return this;
    }

    /**
     * Set filterApplicationNameContains
     * @param filterApplicationNameContains If present, applications with &lt;code&gt;application_name&lt;/code&gt; containing the given value will be returned. Matching is not case-sensitive. Requires at least three characters. (optional, default to null)
     * @return APIlistCallControlApplicationsRequest
     */
    public APIlistCallControlApplicationsRequest filterApplicationNameContains(String filterApplicationNameContains) {
      this.filterApplicationNameContains = filterApplicationNameContains;
      return this;
    }

    /**
     * Set filterOutboundOutboundVoiceProfileId
     * @param filterOutboundOutboundVoiceProfileId Identifies the associated outbound voice profile. (optional)
     * @return APIlistCallControlApplicationsRequest
     */
    public APIlistCallControlApplicationsRequest filterOutboundOutboundVoiceProfileId(String filterOutboundOutboundVoiceProfileId) {
      this.filterOutboundOutboundVoiceProfileId = filterOutboundOutboundVoiceProfileId;
      return this;
    }

    /**
     * Set sort
     * @param sort Specifies the sort order for results. By default sorting direction is ascending. To have the results sorted in descending order add the &lt;code&gt; -&lt;/code&gt; prefix.&lt;br/&gt;&lt;br/&gt; That is: &lt;ul&gt;   &lt;li&gt;     &lt;code&gt;connection_name&lt;/code&gt;: sorts the result by the     &lt;code&gt;connection_name&lt;/code&gt; field in ascending order.   &lt;/li&gt;    &lt;li&gt;     &lt;code&gt;-connection_name&lt;/code&gt;: sorts the result by the     &lt;code&gt;connection_name&lt;/code&gt; field in descending order.   &lt;/li&gt; &lt;/ul&gt; &lt;br/&gt; If not given, results are sorted by &lt;code&gt;created_at&lt;/code&gt; in descending order. (optional, default to created_at)
     * @return APIlistCallControlApplicationsRequest
     */
    public APIlistCallControlApplicationsRequest sort(String sort) {
      this.sort = sort;
      return this;
    }

    /**
     * Execute listCallControlApplications request
     * @return ListCallControlApplicationsResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response with a list of call control applications. </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
         <tr><td> 401 </td><td> Unauthenticated response. Happens when the current user cannot be authenticated. </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ListCallControlApplicationsResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute listCallControlApplications request with HTTP info returned
     * @return ApiResponse&lt;ListCallControlApplicationsResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response with a list of call control applications. </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
         <tr><td> 401 </td><td> Unauthenticated response. Happens when the current user cannot be authenticated. </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<ListCallControlApplicationsResponse> executeWithHttpInfo() throws ApiException {
      return listCallControlApplicationsWithHttpInfo(pageNumber, pageSize, filterApplicationNameContains, filterOutboundOutboundVoiceProfileId, sort);
    }
  }

  /**
   * List call control applications
   * Return a list of call control applications.
   * @return listCallControlApplicationsRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIlistCallControlApplicationsRequest listCallControlApplications() throws ApiException {
    return new APIlistCallControlApplicationsRequest();
  }
  /**
   * Retrieve a call control application
   * Retrieves the details of an existing call control application.
   * @param id Identifies the resource. (required)
   * @return CallControlApplicationResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response with details about a call control application. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated response. Happens when the current user cannot be authenticated. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Bad request </td><td>  -  </td></tr>
     </table>
   */
  public CallControlApplicationResponse retrieveCallControlApplication(String id) throws ApiException {
    return retrieveCallControlApplicationWithHttpInfo(id).getData();
  }

  /**
   * Retrieve a call control application
   * Retrieves the details of an existing call control application.
   * @param id Identifies the resource. (required)
   * @return ApiResponse&lt;CallControlApplicationResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response with details about a call control application. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated response. Happens when the current user cannot be authenticated. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Bad request </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CallControlApplicationResponse> retrieveCallControlApplicationWithHttpInfo(String id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling retrieveCallControlApplication");
    }
    
    // create path and map variables
    String localVarPath = "/call_control_applications/{id}"
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

    GenericType<CallControlApplicationResponse> localVarReturnType = new GenericType<CallControlApplicationResponse>() {};

    return apiClient.invokeAPI("CallControlApplicationsApi.retrieveCallControlApplication", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Update a call control application
   * Updates settings of an existing call control application.
   * @param id Identifies the resource. (required)
   * @param updateCallControlApplicationRequest Update call control application request. (required)
   * @return CallControlApplicationResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response with details about a call control application. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated response. Happens when the current user cannot be authenticated. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Bad request </td><td>  -  </td></tr>
     </table>
   */
  public CallControlApplicationResponse updateCallControlApplication(String id, UpdateCallControlApplicationRequest updateCallControlApplicationRequest) throws ApiException {
    return updateCallControlApplicationWithHttpInfo(id, updateCallControlApplicationRequest).getData();
  }

  /**
   * Update a call control application
   * Updates settings of an existing call control application.
   * @param id Identifies the resource. (required)
   * @param updateCallControlApplicationRequest Update call control application request. (required)
   * @return ApiResponse&lt;CallControlApplicationResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response with details about a call control application. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated response. Happens when the current user cannot be authenticated. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Bad request </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CallControlApplicationResponse> updateCallControlApplicationWithHttpInfo(String id, UpdateCallControlApplicationRequest updateCallControlApplicationRequest) throws ApiException {
    Object localVarPostBody = updateCallControlApplicationRequest;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling updateCallControlApplication");
    }
    
    // verify the required parameter 'updateCallControlApplicationRequest' is set
    if (updateCallControlApplicationRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'updateCallControlApplicationRequest' when calling updateCallControlApplication");
    }
    
    // create path and map variables
    String localVarPath = "/call_control_applications/{id}"
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

    GenericType<CallControlApplicationResponse> localVarReturnType = new GenericType<CallControlApplicationResponse>() {};

    return apiClient.invokeAPI("CallControlApplicationsApi.updateCallControlApplication", localVarPath, "PATCH", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
