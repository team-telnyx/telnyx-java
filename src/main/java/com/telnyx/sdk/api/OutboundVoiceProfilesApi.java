package com.telnyx.sdk.api;

import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.Pair;

import javax.ws.rs.core.GenericType;

import com.telnyx.sdk.model.MultipleOutboundVoiceProfiles;
import com.telnyx.sdk.model.OutboundVoiceProfileWritable;
import com.telnyx.sdk.model.SingleOutboundVoiceProfile;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class OutboundVoiceProfilesApi {
  private ApiClient apiClient;

  public OutboundVoiceProfilesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public OutboundVoiceProfilesApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Get the API cilent
   *
   * @return API client
   */
  public ApiClient getApiClient() {
    return apiClient;
  }

  /**
   * Set the API cilent
   *
   * @param apiClient an instance of API client
   */
  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Create an outbound voice profile
   * Create an outbound voice profile.
   * @param outboundVoiceProfileWritable Parameters that can be defined when creating an outbound voice profile (required)
   * @return SingleOutboundVoiceProfile
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
  public SingleOutboundVoiceProfile createOutboundVoiceProfile(OutboundVoiceProfileWritable outboundVoiceProfileWritable) throws ApiException {
    return createOutboundVoiceProfileWithHttpInfo(outboundVoiceProfileWritable).getData();
  }

  /**
   * Create an outbound voice profile
   * Create an outbound voice profile.
   * @param outboundVoiceProfileWritable Parameters that can be defined when creating an outbound voice profile (required)
   * @return ApiResponse&lt;SingleOutboundVoiceProfile&gt;
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
  public ApiResponse<SingleOutboundVoiceProfile> createOutboundVoiceProfileWithHttpInfo(OutboundVoiceProfileWritable outboundVoiceProfileWritable) throws ApiException {
    Object localVarPostBody = outboundVoiceProfileWritable;
    
    // verify the required parameter 'outboundVoiceProfileWritable' is set
    if (outboundVoiceProfileWritable == null) {
      throw new ApiException(400, "Missing the required parameter 'outboundVoiceProfileWritable' when calling createOutboundVoiceProfile");
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

    GenericType<SingleOutboundVoiceProfile> localVarReturnType = new GenericType<SingleOutboundVoiceProfile>() {};

    return apiClient.invokeAPI("OutboundVoiceProfilesApi.createOutboundVoiceProfile", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Delete an outbound voice profile
   * Deletes an existing outbound voice profile.
   * @param id Identifies the resource. (required)
   * @return SingleOutboundVoiceProfile
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
  public SingleOutboundVoiceProfile deleteOutboundVoiceProfile(String id) throws ApiException {
    return deleteOutboundVoiceProfileWithHttpInfo(id).getData();
  }

  /**
   * Delete an outbound voice profile
   * Deletes an existing outbound voice profile.
   * @param id Identifies the resource. (required)
   * @return ApiResponse&lt;SingleOutboundVoiceProfile&gt;
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
  public ApiResponse<SingleOutboundVoiceProfile> deleteOutboundVoiceProfileWithHttpInfo(String id) throws ApiException {
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

    GenericType<SingleOutboundVoiceProfile> localVarReturnType = new GenericType<SingleOutboundVoiceProfile>() {};

    return apiClient.invokeAPI("OutboundVoiceProfilesApi.deleteOutboundVoiceProfile", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Retrieve an outbound voice profile
   * Retrieves the details of an existing outbound voice profile.
   * @param id Identifies the resource. (required)
   * @return SingleOutboundVoiceProfile
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
  public SingleOutboundVoiceProfile getOutboundVoiceProfile(String id) throws ApiException {
    return getOutboundVoiceProfileWithHttpInfo(id).getData();
  }

  /**
   * Retrieve an outbound voice profile
   * Retrieves the details of an existing outbound voice profile.
   * @param id Identifies the resource. (required)
   * @return ApiResponse&lt;SingleOutboundVoiceProfile&gt;
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
  public ApiResponse<SingleOutboundVoiceProfile> getOutboundVoiceProfileWithHttpInfo(String id) throws ApiException {
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

    GenericType<SingleOutboundVoiceProfile> localVarReturnType = new GenericType<SingleOutboundVoiceProfile>() {};

    return apiClient.invokeAPI("OutboundVoiceProfilesApi.getOutboundVoiceProfile", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get all outbound voice profiles
   * Get all outbound voice profiles belonging to the user that match the given filters.
   * @param pageNumber The page number to load. (optional, default to 1)
   * @param pageSize The size of the page. (optional, default to 20)
   * @param filterNameContains Optional filter on outbound voice profile name. (optional)
   * @param sort Specifies the sort order for results. By default sorting direction is ascending. To have the results sorted in descending order add the &lt;code&gt;-&lt;/code&gt; prefix.&lt;br/&gt;&lt;br/&gt; That is: &lt;ul&gt;   &lt;li&gt;     &lt;code&gt;name&lt;/code&gt;: sorts the result by the     &lt;code&gt;name&lt;/code&gt; field in ascending order.   &lt;/li&gt;    &lt;li&gt;     &lt;code&gt;-name&lt;/code&gt;: sorts the result by the     &lt;code&gt;name&lt;/code&gt; field in descending order.   &lt;/li&gt; &lt;/ul&gt; &lt;br/&gt; (optional, default to -created_at)
   * @return MultipleOutboundVoiceProfiles
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Bad request </td><td>  -  </td></tr>
     </table>
   */
  public MultipleOutboundVoiceProfiles getOutboundVoiceProfiles(Integer pageNumber, Integer pageSize, String filterNameContains, String sort) throws ApiException {
    return getOutboundVoiceProfilesWithHttpInfo(pageNumber, pageSize, filterNameContains, sort).getData();
  }

  /**
   * Get all outbound voice profiles
   * Get all outbound voice profiles belonging to the user that match the given filters.
   * @param pageNumber The page number to load. (optional, default to 1)
   * @param pageSize The size of the page. (optional, default to 20)
   * @param filterNameContains Optional filter on outbound voice profile name. (optional)
   * @param sort Specifies the sort order for results. By default sorting direction is ascending. To have the results sorted in descending order add the &lt;code&gt;-&lt;/code&gt; prefix.&lt;br/&gt;&lt;br/&gt; That is: &lt;ul&gt;   &lt;li&gt;     &lt;code&gt;name&lt;/code&gt;: sorts the result by the     &lt;code&gt;name&lt;/code&gt; field in ascending order.   &lt;/li&gt;    &lt;li&gt;     &lt;code&gt;-name&lt;/code&gt;: sorts the result by the     &lt;code&gt;name&lt;/code&gt; field in descending order.   &lt;/li&gt; &lt;/ul&gt; &lt;br/&gt; (optional, default to -created_at)
   * @return ApiResponse&lt;MultipleOutboundVoiceProfiles&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Bad request </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<MultipleOutboundVoiceProfiles> getOutboundVoiceProfilesWithHttpInfo(Integer pageNumber, Integer pageSize, String filterNameContains, String sort) throws ApiException {
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

    GenericType<MultipleOutboundVoiceProfiles> localVarReturnType = new GenericType<MultipleOutboundVoiceProfiles>() {};

    return apiClient.invokeAPI("OutboundVoiceProfilesApi.getOutboundVoiceProfiles", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Updates an existing outbound voice profile.
   * Updates an existing outbound voice profile.
   * @param id Identifies the resource. (required)
   * @param outboundVoiceProfileWritable Parameters that can be updated on an outbound voice profile (required)
   * @return SingleOutboundVoiceProfile
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
  public SingleOutboundVoiceProfile updateOutboundVoiceProfile(String id, OutboundVoiceProfileWritable outboundVoiceProfileWritable) throws ApiException {
    return updateOutboundVoiceProfileWithHttpInfo(id, outboundVoiceProfileWritable).getData();
  }

  /**
   * Updates an existing outbound voice profile.
   * Updates an existing outbound voice profile.
   * @param id Identifies the resource. (required)
   * @param outboundVoiceProfileWritable Parameters that can be updated on an outbound voice profile (required)
   * @return ApiResponse&lt;SingleOutboundVoiceProfile&gt;
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
  public ApiResponse<SingleOutboundVoiceProfile> updateOutboundVoiceProfileWithHttpInfo(String id, OutboundVoiceProfileWritable outboundVoiceProfileWritable) throws ApiException {
    Object localVarPostBody = outboundVoiceProfileWritable;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling updateOutboundVoiceProfile");
    }
    
    // verify the required parameter 'outboundVoiceProfileWritable' is set
    if (outboundVoiceProfileWritable == null) {
      throw new ApiException(400, "Missing the required parameter 'outboundVoiceProfileWritable' when calling updateOutboundVoiceProfile");
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

    GenericType<SingleOutboundVoiceProfile> localVarReturnType = new GenericType<SingleOutboundVoiceProfile>() {};

    return apiClient.invokeAPI("OutboundVoiceProfilesApi.updateOutboundVoiceProfile", localVarPath, "PATCH", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
