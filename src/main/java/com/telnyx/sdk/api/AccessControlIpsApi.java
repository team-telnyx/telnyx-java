package com.telnyx.sdk.api;

import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.Pair;

import jakarta.ws.rs.core.GenericType;

import com.telnyx.sdk.model.AccessControlIpCreate;
import com.telnyx.sdk.model.AccessControlIpResponse;
import com.telnyx.sdk.model.AccessControlIpUpdate;
import com.telnyx.sdk.model.GetAllAccessControlIpResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AccessControlIpsApi {
  private ApiClient apiClient;

  public AccessControlIpsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public AccessControlIpsApi(ApiClient apiClient) {
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
   * Adds an access control IP
   * This endpoint will be deprecated on 15th March 2022 and has been replaced by the following APIs, [api.telnyx.com/v2/access_ip_address](https://developers.telnyx.com/docs/api/v2/account/IP-Addresses) and [api.telnyx.com/v2/access_ip_ranges](https://developers.telnyx.com/docs/api/v2/account/IP-Ranges). We recommend that Customers already using this endpoint transition to using: [api.telnyx.com/v2/access_ip_address](https://developers.telnyx.com/docs/api/v2/account/IP-Addresses).)
   * @param accessControlIpCreate Parameters that can be defined during access control IP creation (required)
   * @return AccessControlIpResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Bad request </td><td>  -  </td></tr>
     </table>
   */
  public AccessControlIpResponse createAccessControlIp(AccessControlIpCreate accessControlIpCreate) throws ApiException {
    return createAccessControlIpWithHttpInfo(accessControlIpCreate).getData();
  }

  /**
   * Adds an access control IP
   * This endpoint will be deprecated on 15th March 2022 and has been replaced by the following APIs, [api.telnyx.com/v2/access_ip_address](https://developers.telnyx.com/docs/api/v2/account/IP-Addresses) and [api.telnyx.com/v2/access_ip_ranges](https://developers.telnyx.com/docs/api/v2/account/IP-Ranges). We recommend that Customers already using this endpoint transition to using: [api.telnyx.com/v2/access_ip_address](https://developers.telnyx.com/docs/api/v2/account/IP-Addresses).)
   * @param accessControlIpCreate Parameters that can be defined during access control IP creation (required)
   * @return ApiResponse&lt;AccessControlIpResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Bad request </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<AccessControlIpResponse> createAccessControlIpWithHttpInfo(AccessControlIpCreate accessControlIpCreate) throws ApiException {
    Object localVarPostBody = accessControlIpCreate;
    
    // verify the required parameter 'accessControlIpCreate' is set
    if (accessControlIpCreate == null) {
      throw new ApiException(400, "Missing the required parameter 'accessControlIpCreate' when calling createAccessControlIp");
    }
    
    // create path and map variables
    String localVarPath = "/access_control_ips";

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

    GenericType<AccessControlIpResponse> localVarReturnType = new GenericType<AccessControlIpResponse>() {};

    return apiClient.invokeAPI("AccessControlIpsApi.createAccessControlIp", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Deletes an access control IP
   * This endpoint will be deprecated on 15th March 2022 and has been replaced by the following APIs, [api.telnyx.com/v2/access_ip_address](https://developers.telnyx.com/docs/api/v2/account/IP-Addresses) and [api.telnyx.com/v2/access_ip_ranges](https://developers.telnyx.com/docs/api/v2/account/IP-Ranges). We recommend that Customers already using this endpoint transition to using: [api.telnyx.com/v2/access_ip_address](https://developers.telnyx.com/docs/api/v2/account/IP-Addresses).)
   * @param id access control IP ID (required)
   * @return AccessControlIpResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Bad request </td><td>  -  </td></tr>
     </table>
   */
  public AccessControlIpResponse deleteAccessControlIp(String id) throws ApiException {
    return deleteAccessControlIpWithHttpInfo(id).getData();
  }

  /**
   * Deletes an access control IP
   * This endpoint will be deprecated on 15th March 2022 and has been replaced by the following APIs, [api.telnyx.com/v2/access_ip_address](https://developers.telnyx.com/docs/api/v2/account/IP-Addresses) and [api.telnyx.com/v2/access_ip_ranges](https://developers.telnyx.com/docs/api/v2/account/IP-Ranges). We recommend that Customers already using this endpoint transition to using: [api.telnyx.com/v2/access_ip_address](https://developers.telnyx.com/docs/api/v2/account/IP-Addresses).)
   * @param id access control IP ID (required)
   * @return ApiResponse&lt;AccessControlIpResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Bad request </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<AccessControlIpResponse> deleteAccessControlIpWithHttpInfo(String id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling deleteAccessControlIp");
    }
    
    // create path and map variables
    String localVarPath = "/access_control_ips/{id}"
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

    GenericType<AccessControlIpResponse> localVarReturnType = new GenericType<AccessControlIpResponse>() {};

    return apiClient.invokeAPI("AccessControlIpsApi.deleteAccessControlIp", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * List all access control IPs
   * This endpoint will be deprecated on 15th March 2022 and has been replaced by the following APIs, [api.telnyx.com/v2/access_ip_address](https://developers.telnyx.com/docs/api/v2/account/IP-Addresses) and [api.telnyx.com/v2/access_ip_ranges](https://developers.telnyx.com/docs/api/v2/account/IP-Ranges). We recommend that Customers already using this endpoint transition to using: [api.telnyx.com/v2/access_ip_address](https://developers.telnyx.com/docs/api/v2/account/IP-Addresses).
   * @param pageNumber The page number to load (optional, default to 1)
   * @param pageSize The size of the page (optional, default to 20)
   * @param filterIpAddressEq Filter access control IPs via the ip_address sent. (optional)
   * @return GetAllAccessControlIpResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
     </table>
   */
  public GetAllAccessControlIpResponse findAccessControlIps(Integer pageNumber, Integer pageSize, String filterIpAddressEq) throws ApiException {
    return findAccessControlIpsWithHttpInfo(pageNumber, pageSize, filterIpAddressEq).getData();
  }

  /**
   * List all access control IPs
   * This endpoint will be deprecated on 15th March 2022 and has been replaced by the following APIs, [api.telnyx.com/v2/access_ip_address](https://developers.telnyx.com/docs/api/v2/account/IP-Addresses) and [api.telnyx.com/v2/access_ip_ranges](https://developers.telnyx.com/docs/api/v2/account/IP-Ranges). We recommend that Customers already using this endpoint transition to using: [api.telnyx.com/v2/access_ip_address](https://developers.telnyx.com/docs/api/v2/account/IP-Addresses).
   * @param pageNumber The page number to load (optional, default to 1)
   * @param pageSize The size of the page (optional, default to 20)
   * @param filterIpAddressEq Filter access control IPs via the ip_address sent. (optional)
   * @return ApiResponse&lt;GetAllAccessControlIpResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GetAllAccessControlIpResponse> findAccessControlIpsWithHttpInfo(Integer pageNumber, Integer pageSize, String filterIpAddressEq) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/access_control_ips";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[number]", pageNumber));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[ip_address][eq]", filterIpAddressEq));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    GenericType<GetAllAccessControlIpResponse> localVarReturnType = new GenericType<GetAllAccessControlIpResponse>() {};

    return apiClient.invokeAPI("AccessControlIpsApi.findAccessControlIps", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Retrieve an access control IP
   * This endpoint will be deprecated on 15th March 2022 and has been replaced by the following APIs, [api.telnyx.com/v2/access_ip_address](https://developers.telnyx.com/docs/api/v2/account/IP-Addresses) and [api.telnyx.com/v2/access_ip_ranges](https://developers.telnyx.com/docs/api/v2/account/IP-Ranges). We recommend that Customers already using this endpoint transition to using: [api.telnyx.com/v2/access_ip_address](https://developers.telnyx.com/docs/api/v2/account/IP-Addresses).
   * @param id access control IP ID (required)
   * @return AccessControlIpResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Bad request </td><td>  -  </td></tr>
     </table>
   */
  public AccessControlIpResponse getAccessControlIp(String id) throws ApiException {
    return getAccessControlIpWithHttpInfo(id).getData();
  }

  /**
   * Retrieve an access control IP
   * This endpoint will be deprecated on 15th March 2022 and has been replaced by the following APIs, [api.telnyx.com/v2/access_ip_address](https://developers.telnyx.com/docs/api/v2/account/IP-Addresses) and [api.telnyx.com/v2/access_ip_ranges](https://developers.telnyx.com/docs/api/v2/account/IP-Ranges). We recommend that Customers already using this endpoint transition to using: [api.telnyx.com/v2/access_ip_address](https://developers.telnyx.com/docs/api/v2/account/IP-Addresses).
   * @param id access control IP ID (required)
   * @return ApiResponse&lt;AccessControlIpResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Bad request </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<AccessControlIpResponse> getAccessControlIpWithHttpInfo(String id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getAccessControlIp");
    }
    
    // create path and map variables
    String localVarPath = "/access_control_ips/{id}"
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

    GenericType<AccessControlIpResponse> localVarReturnType = new GenericType<AccessControlIpResponse>() {};

    return apiClient.invokeAPI("AccessControlIpsApi.getAccessControlIp", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Update an access control IP
   * This endpoint will be deprecated on 15th March 2022 and has been replaced by the following APIs, [api.telnyx.com/v2/access_ip_address](https://developers.telnyx.com/docs/api/v2/account/IP-Addresses) and [api.telnyx.com/v2/access_ip_ranges](https://developers.telnyx.com/docs/api/v2/account/IP-Ranges). We recommend that Customers already using this endpoint transition to using: [api.telnyx.com/v2/access_ip_address](https://developers.telnyx.com/docs/api/v2/account/IP-Addresses).)
   * @param id access control IP ID (required)
   * @param accessControlIpUpdate Parameters to update on the access control IP record (required)
   * @return AccessControlIpResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Bad request </td><td>  -  </td></tr>
     </table>
   */
  public AccessControlIpResponse updateAccessControlIp(String id, AccessControlIpUpdate accessControlIpUpdate) throws ApiException {
    return updateAccessControlIpWithHttpInfo(id, accessControlIpUpdate).getData();
  }

  /**
   * Update an access control IP
   * This endpoint will be deprecated on 15th March 2022 and has been replaced by the following APIs, [api.telnyx.com/v2/access_ip_address](https://developers.telnyx.com/docs/api/v2/account/IP-Addresses) and [api.telnyx.com/v2/access_ip_ranges](https://developers.telnyx.com/docs/api/v2/account/IP-Ranges). We recommend that Customers already using this endpoint transition to using: [api.telnyx.com/v2/access_ip_address](https://developers.telnyx.com/docs/api/v2/account/IP-Addresses).)
   * @param id access control IP ID (required)
   * @param accessControlIpUpdate Parameters to update on the access control IP record (required)
   * @return ApiResponse&lt;AccessControlIpResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Bad request </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<AccessControlIpResponse> updateAccessControlIpWithHttpInfo(String id, AccessControlIpUpdate accessControlIpUpdate) throws ApiException {
    Object localVarPostBody = accessControlIpUpdate;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling updateAccessControlIp");
    }
    
    // verify the required parameter 'accessControlIpUpdate' is set
    if (accessControlIpUpdate == null) {
      throw new ApiException(400, "Missing the required parameter 'accessControlIpUpdate' when calling updateAccessControlIp");
    }
    
    // create path and map variables
    String localVarPath = "/access_control_ips/{id}"
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

    GenericType<AccessControlIpResponse> localVarReturnType = new GenericType<AccessControlIpResponse>() {};

    return apiClient.invokeAPI("AccessControlIpsApi.updateAccessControlIp", localVarPath, "PATCH", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
