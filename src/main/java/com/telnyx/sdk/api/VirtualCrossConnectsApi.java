package com.telnyx.sdk.api;

import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.Pair;

import javax.ws.rs.core.GenericType;

import com.telnyx.sdk.model.Errors;
import java.util.UUID;
import com.telnyx.sdk.model.VirtaulCrossConnectList200Response;
import com.telnyx.sdk.model.VirtaulCrossConnectRegionList200Response;
import com.telnyx.sdk.model.VirtualCrossConnectCreate;
import com.telnyx.sdk.model.VirtualCrossConnectCreate200Response;
import com.telnyx.sdk.model.VirtualCrossConnectPatch;
import com.telnyx.sdk.model.VirtualCrossConnectRegionGet200Response;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class VirtualCrossConnectsApi {
  private ApiClient apiClient;

  public VirtualCrossConnectsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public VirtualCrossConnectsApi(ApiClient apiClient) {
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
   * List all Virtual Cross Connects
   * List all Virtual Cross Connects.
   * @param pageNumber The page number to load (optional, default to 1)
   * @param pageSize The size of the page (optional, default to 20)
   * @param filterNetworkId The associated network id to filter on. (optional)
   * @return VirtaulCrossConnectList200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public VirtaulCrossConnectList200Response virtaulCrossConnectList(Integer pageNumber, Integer pageSize, String filterNetworkId) throws ApiException {
    return virtaulCrossConnectListWithHttpInfo(pageNumber, pageSize, filterNetworkId).getData();
  }

  /**
   * List all Virtual Cross Connects
   * List all Virtual Cross Connects.
   * @param pageNumber The page number to load (optional, default to 1)
   * @param pageSize The size of the page (optional, default to 20)
   * @param filterNetworkId The associated network id to filter on. (optional)
   * @return ApiResponse&lt;VirtaulCrossConnectList200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<VirtaulCrossConnectList200Response> virtaulCrossConnectListWithHttpInfo(Integer pageNumber, Integer pageSize, String filterNetworkId) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/virtual_cross_connects";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[number]", pageNumber));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[network_id]", filterNetworkId));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    GenericType<VirtaulCrossConnectList200Response> localVarReturnType = new GenericType<VirtaulCrossConnectList200Response>() {};

    return apiClient.invokeAPI("VirtualCrossConnectsApi.virtaulCrossConnectList", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * List all Virtual Cross Connect Cloud Regions
   * List all Virtual Cross Connects Cloud Regions.&lt;br /&gt;&lt;br /&gt;This endpoint shows which cloud regions are available for the &#x60;region_code&#x60; your Virtual Cross Connect will be provisioned in.
   * @param pageNumber The page number to load (optional, default to 1)
   * @param pageSize The size of the page (optional, default to 20)
   * @param filterRegionCode The Telnyx region code (optional)
   * @param filterCloudProvider The Telnyx region code (optional)
   * @return VirtaulCrossConnectRegionList200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public VirtaulCrossConnectRegionList200Response virtaulCrossConnectRegionList(Integer pageNumber, Integer pageSize, String filterRegionCode, String filterCloudProvider) throws ApiException {
    return virtaulCrossConnectRegionListWithHttpInfo(pageNumber, pageSize, filterRegionCode, filterCloudProvider).getData();
  }

  /**
   * List all Virtual Cross Connect Cloud Regions
   * List all Virtual Cross Connects Cloud Regions.&lt;br /&gt;&lt;br /&gt;This endpoint shows which cloud regions are available for the &#x60;region_code&#x60; your Virtual Cross Connect will be provisioned in.
   * @param pageNumber The page number to load (optional, default to 1)
   * @param pageSize The size of the page (optional, default to 20)
   * @param filterRegionCode The Telnyx region code (optional)
   * @param filterCloudProvider The Telnyx region code (optional)
   * @return ApiResponse&lt;VirtaulCrossConnectRegionList200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<VirtaulCrossConnectRegionList200Response> virtaulCrossConnectRegionListWithHttpInfo(Integer pageNumber, Integer pageSize, String filterRegionCode, String filterCloudProvider) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/virtual_cross_connect_regions";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[number]", pageNumber));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[region_code]", filterRegionCode));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[cloud_provider]", filterCloudProvider));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    GenericType<VirtaulCrossConnectRegionList200Response> localVarReturnType = new GenericType<VirtaulCrossConnectRegionList200Response>() {};

    return apiClient.invokeAPI("VirtualCrossConnectsApi.virtaulCrossConnectRegionList", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Create a Virtual Cross Connect
   * Create a new Virtual Cross Connect.&lt;br /&gt;&lt;br /&gt;For AWS and GCE, you have the option of creating the primary connection first and the secondary connection later. You also have the option of disabling the primary and/or secondary connections at any time and later re-enabling them. With Azure, you do not have this option. Azure requires both the primary and secondary connections to be created at the same time and they can not be independantly disabled.
   * @param virtualCrossConnectCreate  (required)
   * @return VirtualCrossConnectCreate200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check the &#39;detail&#39; field in response for details. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public VirtualCrossConnectCreate200Response virtualCrossConnectCreate(VirtualCrossConnectCreate virtualCrossConnectCreate) throws ApiException {
    return virtualCrossConnectCreateWithHttpInfo(virtualCrossConnectCreate).getData();
  }

  /**
   * Create a Virtual Cross Connect
   * Create a new Virtual Cross Connect.&lt;br /&gt;&lt;br /&gt;For AWS and GCE, you have the option of creating the primary connection first and the secondary connection later. You also have the option of disabling the primary and/or secondary connections at any time and later re-enabling them. With Azure, you do not have this option. Azure requires both the primary and secondary connections to be created at the same time and they can not be independantly disabled.
   * @param virtualCrossConnectCreate  (required)
   * @return ApiResponse&lt;VirtualCrossConnectCreate200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check the &#39;detail&#39; field in response for details. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<VirtualCrossConnectCreate200Response> virtualCrossConnectCreateWithHttpInfo(VirtualCrossConnectCreate virtualCrossConnectCreate) throws ApiException {
    Object localVarPostBody = virtualCrossConnectCreate;
    
    // verify the required parameter 'virtualCrossConnectCreate' is set
    if (virtualCrossConnectCreate == null) {
      throw new ApiException(400, "Missing the required parameter 'virtualCrossConnectCreate' when calling virtualCrossConnectCreate");
    }
    
    // create path and map variables
    String localVarPath = "/virtual_cross_connects";

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

    GenericType<VirtualCrossConnectCreate200Response> localVarReturnType = new GenericType<VirtualCrossConnectCreate200Response>() {};

    return apiClient.invokeAPI("VirtualCrossConnectsApi.virtualCrossConnectCreate", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Delete a Virtual Cross Connect
   * Delete a Virtual Cross Connect.
   * @param id Identifies the resource. (required)
   * @return VirtualCrossConnectCreate200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public VirtualCrossConnectCreate200Response virtualCrossConnectDelete(UUID id) throws ApiException {
    return virtualCrossConnectDeleteWithHttpInfo(id).getData();
  }

  /**
   * Delete a Virtual Cross Connect
   * Delete a Virtual Cross Connect.
   * @param id Identifies the resource. (required)
   * @return ApiResponse&lt;VirtualCrossConnectCreate200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<VirtualCrossConnectCreate200Response> virtualCrossConnectDeleteWithHttpInfo(UUID id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling virtualCrossConnectDelete");
    }
    
    // create path and map variables
    String localVarPath = "/virtual_cross_connects/{id}"
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

    GenericType<VirtualCrossConnectCreate200Response> localVarReturnType = new GenericType<VirtualCrossConnectCreate200Response>() {};

    return apiClient.invokeAPI("VirtualCrossConnectsApi.virtualCrossConnectDelete", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Retrieve a Virtual Cross Connect
   * Retrieve a Virtual Cross Connect.
   * @param id Identifies the resource. (required)
   * @return VirtualCrossConnectCreate200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public VirtualCrossConnectCreate200Response virtualCrossConnectGet(UUID id) throws ApiException {
    return virtualCrossConnectGetWithHttpInfo(id).getData();
  }

  /**
   * Retrieve a Virtual Cross Connect
   * Retrieve a Virtual Cross Connect.
   * @param id Identifies the resource. (required)
   * @return ApiResponse&lt;VirtualCrossConnectCreate200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<VirtualCrossConnectCreate200Response> virtualCrossConnectGetWithHttpInfo(UUID id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling virtualCrossConnectGet");
    }
    
    // create path and map variables
    String localVarPath = "/virtual_cross_connects/{id}"
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

    GenericType<VirtualCrossConnectCreate200Response> localVarReturnType = new GenericType<VirtualCrossConnectCreate200Response>() {};

    return apiClient.invokeAPI("VirtualCrossConnectsApi.virtualCrossConnectGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Provision a Virtual Cross Connect
   * Provision a new Virtual Cross Connect.&lt;br /&gt;&lt;br /&gt;This endpoint is only necessary for GCE cloud regions. Once you have patched your Cloud IPs, you must POST this request to trigger the provision.
   * @param id Identifies the resource. (required)
   * @return VirtualCrossConnectCreate200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 202 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public VirtualCrossConnectCreate200Response virtualCrossConnectProvision(UUID id) throws ApiException {
    return virtualCrossConnectProvisionWithHttpInfo(id).getData();
  }

  /**
   * Provision a Virtual Cross Connect
   * Provision a new Virtual Cross Connect.&lt;br /&gt;&lt;br /&gt;This endpoint is only necessary for GCE cloud regions. Once you have patched your Cloud IPs, you must POST this request to trigger the provision.
   * @param id Identifies the resource. (required)
   * @return ApiResponse&lt;VirtualCrossConnectCreate200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 202 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<VirtualCrossConnectCreate200Response> virtualCrossConnectProvisionWithHttpInfo(UUID id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling virtualCrossConnectProvision");
    }
    
    // create path and map variables
    String localVarPath = "/virtual_cross_connects/{id}/actions/provision"
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

    GenericType<VirtualCrossConnectCreate200Response> localVarReturnType = new GenericType<VirtualCrossConnectCreate200Response>() {};

    return apiClient.invokeAPI("VirtualCrossConnectsApi.virtualCrossConnectProvision", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Retrieve a Virtual Cross Connect Cloud Regions
   * Retrieve a Virtual Cross Connect Cloud Regions.
   * @param id Identifies the resource. (required)
   * @return VirtualCrossConnectRegionGet200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public VirtualCrossConnectRegionGet200Response virtualCrossConnectRegionGet(UUID id) throws ApiException {
    return virtualCrossConnectRegionGetWithHttpInfo(id).getData();
  }

  /**
   * Retrieve a Virtual Cross Connect Cloud Regions
   * Retrieve a Virtual Cross Connect Cloud Regions.
   * @param id Identifies the resource. (required)
   * @return ApiResponse&lt;VirtualCrossConnectRegionGet200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<VirtualCrossConnectRegionGet200Response> virtualCrossConnectRegionGetWithHttpInfo(UUID id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling virtualCrossConnectRegionGet");
    }
    
    // create path and map variables
    String localVarPath = "/virtual_cross_connect_regions/{id}"
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

    GenericType<VirtualCrossConnectRegionGet200Response> localVarReturnType = new GenericType<VirtualCrossConnectRegionGet200Response>() {};

    return apiClient.invokeAPI("VirtualCrossConnectsApi.virtualCrossConnectRegionGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Update the Virtual Cross Connect
   * Update the Virtual Cross Connect.&lt;br /&gt;&lt;br /&gt;Cloud IPs can only be patched during the &#x60;created&#x60; state, as GCE will only inform you of your generated IP once the pending connection requested has been accepted. Once the Virtual Cross Connect has moved to &#x60;provisioning&#x60;, the IPs can no longer be patched.&lt;br /&gt;&lt;br /&gt;Once the Virtual Cross Connect has moved to &#x60;provisioned&#x60; and you are ready to enable routing, you can toggle the routing announcements to &#x60;true&#x60;.
   * @param id Identifies the resource. (required)
   * @param virtualCrossConnectPatch  (required)
   * @return VirtualCrossConnectCreate200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check the &#39;detail&#39; field in response for details. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public VirtualCrossConnectCreate200Response virtualCrossConnectUpdate(UUID id, VirtualCrossConnectPatch virtualCrossConnectPatch) throws ApiException {
    return virtualCrossConnectUpdateWithHttpInfo(id, virtualCrossConnectPatch).getData();
  }

  /**
   * Update the Virtual Cross Connect
   * Update the Virtual Cross Connect.&lt;br /&gt;&lt;br /&gt;Cloud IPs can only be patched during the &#x60;created&#x60; state, as GCE will only inform you of your generated IP once the pending connection requested has been accepted. Once the Virtual Cross Connect has moved to &#x60;provisioning&#x60;, the IPs can no longer be patched.&lt;br /&gt;&lt;br /&gt;Once the Virtual Cross Connect has moved to &#x60;provisioned&#x60; and you are ready to enable routing, you can toggle the routing announcements to &#x60;true&#x60;.
   * @param id Identifies the resource. (required)
   * @param virtualCrossConnectPatch  (required)
   * @return ApiResponse&lt;VirtualCrossConnectCreate200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check the &#39;detail&#39; field in response for details. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<VirtualCrossConnectCreate200Response> virtualCrossConnectUpdateWithHttpInfo(UUID id, VirtualCrossConnectPatch virtualCrossConnectPatch) throws ApiException {
    Object localVarPostBody = virtualCrossConnectPatch;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling virtualCrossConnectUpdate");
    }
    
    // verify the required parameter 'virtualCrossConnectPatch' is set
    if (virtualCrossConnectPatch == null) {
      throw new ApiException(400, "Missing the required parameter 'virtualCrossConnectPatch' when calling virtualCrossConnectUpdate");
    }
    
    // create path and map variables
    String localVarPath = "/virtual_cross_connects/{id}"
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

    GenericType<VirtualCrossConnectCreate200Response> localVarReturnType = new GenericType<VirtualCrossConnectCreate200Response>() {};

    return apiClient.invokeAPI("VirtualCrossConnectsApi.virtualCrossConnectUpdate", localVarPath, "PATCH", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
