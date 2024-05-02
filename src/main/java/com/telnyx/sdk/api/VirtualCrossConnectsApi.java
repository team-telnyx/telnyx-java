package com.telnyx.sdk.api;

import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.Pair;

import jakarta.ws.rs.core.GenericType;

import com.telnyx.sdk.model.CreateVirtualCrossConnect200Response;
import com.telnyx.sdk.model.Errors;
import com.telnyx.sdk.model.GetVirtualCrossConnectRegion200Response;
import com.telnyx.sdk.model.ListVirtualCrossConnectRegions200Response;
import com.telnyx.sdk.model.ListVirtualCrossConnects200Response;
import java.util.UUID;
import com.telnyx.sdk.model.VirtualCrossConnectCreate;
import com.telnyx.sdk.model.VirtualCrossConnectPatch;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
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
   * Create a Virtual Cross Connect
   * Create a new Virtual Cross Connect.&lt;br /&gt;&lt;br /&gt;For AWS and GCE, you have the option of creating the primary connection first and the secondary connection later. You also have the option of disabling the primary and/or secondary connections at any time and later re-enabling them. With Azure, you do not have this option. Azure requires both the primary and secondary connections to be created at the same time and they can not be independantly disabled.
   * @param virtualCrossConnectCreate  (required)
   * @return CreateVirtualCrossConnect200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check the &#39;detail&#39; field in response for details. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public CreateVirtualCrossConnect200Response createVirtualCrossConnect(VirtualCrossConnectCreate virtualCrossConnectCreate) throws ApiException {
    return createVirtualCrossConnectWithHttpInfo(virtualCrossConnectCreate).getData();
  }

  /**
   * Create a Virtual Cross Connect
   * Create a new Virtual Cross Connect.&lt;br /&gt;&lt;br /&gt;For AWS and GCE, you have the option of creating the primary connection first and the secondary connection later. You also have the option of disabling the primary and/or secondary connections at any time and later re-enabling them. With Azure, you do not have this option. Azure requires both the primary and secondary connections to be created at the same time and they can not be independantly disabled.
   * @param virtualCrossConnectCreate  (required)
   * @return ApiResponse&lt;CreateVirtualCrossConnect200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check the &#39;detail&#39; field in response for details. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CreateVirtualCrossConnect200Response> createVirtualCrossConnectWithHttpInfo(VirtualCrossConnectCreate virtualCrossConnectCreate) throws ApiException {
    Object localVarPostBody = virtualCrossConnectCreate;
    
    // verify the required parameter 'virtualCrossConnectCreate' is set
    if (virtualCrossConnectCreate == null) {
      throw new ApiException(400, "Missing the required parameter 'virtualCrossConnectCreate' when calling createVirtualCrossConnect");
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

    GenericType<CreateVirtualCrossConnect200Response> localVarReturnType = new GenericType<CreateVirtualCrossConnect200Response>() {};

    return apiClient.invokeAPI("VirtualCrossConnectsApi.createVirtualCrossConnect", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Delete a Virtual Cross Connect
   * Delete a Virtual Cross Connect.
   * @param id Identifies the resource. (required)
   * @return CreateVirtualCrossConnect200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public CreateVirtualCrossConnect200Response deleteVirtualCrossConnect(UUID id) throws ApiException {
    return deleteVirtualCrossConnectWithHttpInfo(id).getData();
  }

  /**
   * Delete a Virtual Cross Connect
   * Delete a Virtual Cross Connect.
   * @param id Identifies the resource. (required)
   * @return ApiResponse&lt;CreateVirtualCrossConnect200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CreateVirtualCrossConnect200Response> deleteVirtualCrossConnectWithHttpInfo(UUID id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling deleteVirtualCrossConnect");
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

    GenericType<CreateVirtualCrossConnect200Response> localVarReturnType = new GenericType<CreateVirtualCrossConnect200Response>() {};

    return apiClient.invokeAPI("VirtualCrossConnectsApi.deleteVirtualCrossConnect", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Retrieve a Virtual Cross Connect
   * Retrieve a Virtual Cross Connect.
   * @param id Identifies the resource. (required)
   * @return CreateVirtualCrossConnect200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public CreateVirtualCrossConnect200Response getVirtualCrossConnect(UUID id) throws ApiException {
    return getVirtualCrossConnectWithHttpInfo(id).getData();
  }

  /**
   * Retrieve a Virtual Cross Connect
   * Retrieve a Virtual Cross Connect.
   * @param id Identifies the resource. (required)
   * @return ApiResponse&lt;CreateVirtualCrossConnect200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CreateVirtualCrossConnect200Response> getVirtualCrossConnectWithHttpInfo(UUID id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getVirtualCrossConnect");
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

    GenericType<CreateVirtualCrossConnect200Response> localVarReturnType = new GenericType<CreateVirtualCrossConnect200Response>() {};

    return apiClient.invokeAPI("VirtualCrossConnectsApi.getVirtualCrossConnect", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Retrieve a Virtual Cross Connect Cloud Regions
   * Retrieve a Virtual Cross Connect Cloud Regions.
   * @param id Identifies the resource. (required)
   * @return GetVirtualCrossConnectRegion200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public GetVirtualCrossConnectRegion200Response getVirtualCrossConnectRegion(UUID id) throws ApiException {
    return getVirtualCrossConnectRegionWithHttpInfo(id).getData();
  }

  /**
   * Retrieve a Virtual Cross Connect Cloud Regions
   * Retrieve a Virtual Cross Connect Cloud Regions.
   * @param id Identifies the resource. (required)
   * @return ApiResponse&lt;GetVirtualCrossConnectRegion200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GetVirtualCrossConnectRegion200Response> getVirtualCrossConnectRegionWithHttpInfo(UUID id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getVirtualCrossConnectRegion");
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

    GenericType<GetVirtualCrossConnectRegion200Response> localVarReturnType = new GenericType<GetVirtualCrossConnectRegion200Response>() {};

    return apiClient.invokeAPI("VirtualCrossConnectsApi.getVirtualCrossConnectRegion", localVarPath, "GET", localVarQueryParams, localVarPostBody,
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
   * @return ListVirtualCrossConnectRegions200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ListVirtualCrossConnectRegions200Response listVirtualCrossConnectRegions(Integer pageNumber, Integer pageSize, String filterRegionCode, String filterCloudProvider) throws ApiException {
    return listVirtualCrossConnectRegionsWithHttpInfo(pageNumber, pageSize, filterRegionCode, filterCloudProvider).getData();
  }

  /**
   * List all Virtual Cross Connect Cloud Regions
   * List all Virtual Cross Connects Cloud Regions.&lt;br /&gt;&lt;br /&gt;This endpoint shows which cloud regions are available for the &#x60;region_code&#x60; your Virtual Cross Connect will be provisioned in.
   * @param pageNumber The page number to load (optional, default to 1)
   * @param pageSize The size of the page (optional, default to 20)
   * @param filterRegionCode The Telnyx region code (optional)
   * @param filterCloudProvider The Telnyx region code (optional)
   * @return ApiResponse&lt;ListVirtualCrossConnectRegions200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ListVirtualCrossConnectRegions200Response> listVirtualCrossConnectRegionsWithHttpInfo(Integer pageNumber, Integer pageSize, String filterRegionCode, String filterCloudProvider) throws ApiException {
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

    GenericType<ListVirtualCrossConnectRegions200Response> localVarReturnType = new GenericType<ListVirtualCrossConnectRegions200Response>() {};

    return apiClient.invokeAPI("VirtualCrossConnectsApi.listVirtualCrossConnectRegions", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * List all Virtual Cross Connects
   * List all Virtual Cross Connects.
   * @param pageNumber The page number to load (optional, default to 1)
   * @param pageSize The size of the page (optional, default to 20)
   * @param filterNetworkId The associated network id to filter on. (optional)
   * @return ListVirtualCrossConnects200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ListVirtualCrossConnects200Response listVirtualCrossConnects(Integer pageNumber, Integer pageSize, String filterNetworkId) throws ApiException {
    return listVirtualCrossConnectsWithHttpInfo(pageNumber, pageSize, filterNetworkId).getData();
  }

  /**
   * List all Virtual Cross Connects
   * List all Virtual Cross Connects.
   * @param pageNumber The page number to load (optional, default to 1)
   * @param pageSize The size of the page (optional, default to 20)
   * @param filterNetworkId The associated network id to filter on. (optional)
   * @return ApiResponse&lt;ListVirtualCrossConnects200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ListVirtualCrossConnects200Response> listVirtualCrossConnectsWithHttpInfo(Integer pageNumber, Integer pageSize, String filterNetworkId) throws ApiException {
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

    GenericType<ListVirtualCrossConnects200Response> localVarReturnType = new GenericType<ListVirtualCrossConnects200Response>() {};

    return apiClient.invokeAPI("VirtualCrossConnectsApi.listVirtualCrossConnects", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Provision a Virtual Cross Connect
   * Provision a new Virtual Cross Connect.&lt;br /&gt;&lt;br /&gt;This endpoint is only necessary for GCE cloud regions. Once you have patched your Cloud IPs, you must POST this request to trigger the provision.
   * @param id Identifies the resource. (required)
   * @return CreateVirtualCrossConnect200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 202 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public CreateVirtualCrossConnect200Response provisionVirtualCrossConnect(UUID id) throws ApiException {
    return provisionVirtualCrossConnectWithHttpInfo(id).getData();
  }

  /**
   * Provision a Virtual Cross Connect
   * Provision a new Virtual Cross Connect.&lt;br /&gt;&lt;br /&gt;This endpoint is only necessary for GCE cloud regions. Once you have patched your Cloud IPs, you must POST this request to trigger the provision.
   * @param id Identifies the resource. (required)
   * @return ApiResponse&lt;CreateVirtualCrossConnect200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 202 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CreateVirtualCrossConnect200Response> provisionVirtualCrossConnectWithHttpInfo(UUID id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling provisionVirtualCrossConnect");
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

    GenericType<CreateVirtualCrossConnect200Response> localVarReturnType = new GenericType<CreateVirtualCrossConnect200Response>() {};

    return apiClient.invokeAPI("VirtualCrossConnectsApi.provisionVirtualCrossConnect", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Update the Virtual Cross Connect
   * Update the Virtual Cross Connect.&lt;br /&gt;&lt;br /&gt;Cloud IPs can only be patched during the &#x60;created&#x60; state, as GCE will only inform you of your generated IP once the pending connection requested has been accepted. Once the Virtual Cross Connect has moved to &#x60;provisioning&#x60;, the IPs can no longer be patched.&lt;br /&gt;&lt;br /&gt;Once the Virtual Cross Connect has moved to &#x60;provisioned&#x60; and you are ready to enable routing, you can toggle the routing announcements to &#x60;true&#x60;.
   * @param id Identifies the resource. (required)
   * @param virtualCrossConnectPatch  (required)
   * @return CreateVirtualCrossConnect200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check the &#39;detail&#39; field in response for details. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public CreateVirtualCrossConnect200Response updateVirtualCrossConnect(UUID id, VirtualCrossConnectPatch virtualCrossConnectPatch) throws ApiException {
    return updateVirtualCrossConnectWithHttpInfo(id, virtualCrossConnectPatch).getData();
  }

  /**
   * Update the Virtual Cross Connect
   * Update the Virtual Cross Connect.&lt;br /&gt;&lt;br /&gt;Cloud IPs can only be patched during the &#x60;created&#x60; state, as GCE will only inform you of your generated IP once the pending connection requested has been accepted. Once the Virtual Cross Connect has moved to &#x60;provisioning&#x60;, the IPs can no longer be patched.&lt;br /&gt;&lt;br /&gt;Once the Virtual Cross Connect has moved to &#x60;provisioned&#x60; and you are ready to enable routing, you can toggle the routing announcements to &#x60;true&#x60;.
   * @param id Identifies the resource. (required)
   * @param virtualCrossConnectPatch  (required)
   * @return ApiResponse&lt;CreateVirtualCrossConnect200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check the &#39;detail&#39; field in response for details. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CreateVirtualCrossConnect200Response> updateVirtualCrossConnectWithHttpInfo(UUID id, VirtualCrossConnectPatch virtualCrossConnectPatch) throws ApiException {
    Object localVarPostBody = virtualCrossConnectPatch;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling updateVirtualCrossConnect");
    }
    
    // verify the required parameter 'virtualCrossConnectPatch' is set
    if (virtualCrossConnectPatch == null) {
      throw new ApiException(400, "Missing the required parameter 'virtualCrossConnectPatch' when calling updateVirtualCrossConnect");
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

    GenericType<CreateVirtualCrossConnect200Response> localVarReturnType = new GenericType<CreateVirtualCrossConnect200Response>() {};

    return apiClient.invokeAPI("VirtualCrossConnectsApi.updateVirtualCrossConnect", localVarPath, "PATCH", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
