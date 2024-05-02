package com.telnyx.sdk.api;

import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.Pair;

import jakarta.ws.rs.core.GenericType;

import com.telnyx.sdk.model.AccessIPAddressListResponseSchema;
import com.telnyx.sdk.model.AccessIPAddressPOST;
import com.telnyx.sdk.model.AccessIPAddressResponseSchema;
import com.telnyx.sdk.model.Errors;
import java.time.OffsetDateTime;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class IpAddressesApi {
  private ApiClient apiClient;

  public IpAddressesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public IpAddressesApi(ApiClient apiClient) {
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
   * Create new Access IP Address
   * 
   * @param accessIPAddressPOST  (required)
   * @return AccessIPAddressResponseSchema
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
     </table>
   */
  public AccessIPAddressResponseSchema createAccessIpAddress(AccessIPAddressPOST accessIPAddressPOST) throws ApiException {
    return createAccessIpAddressWithHttpInfo(accessIPAddressPOST).getData();
  }

  /**
   * Create new Access IP Address
   * 
   * @param accessIPAddressPOST  (required)
   * @return ApiResponse&lt;AccessIPAddressResponseSchema&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<AccessIPAddressResponseSchema> createAccessIpAddressWithHttpInfo(AccessIPAddressPOST accessIPAddressPOST) throws ApiException {
    Object localVarPostBody = accessIPAddressPOST;
    
    // verify the required parameter 'accessIPAddressPOST' is set
    if (accessIPAddressPOST == null) {
      throw new ApiException(400, "Missing the required parameter 'accessIPAddressPOST' when calling createAccessIpAddress");
    }
    
    // create path and map variables
    String localVarPath = "/access_ip_address";

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

    GenericType<AccessIPAddressResponseSchema> localVarReturnType = new GenericType<AccessIPAddressResponseSchema>() {};

    return apiClient.invokeAPI("IpAddressesApi.createAccessIpAddress", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Delete access IP address
   * 
   * @param accessIpAddressId  (required)
   * @return AccessIPAddressResponseSchema
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public AccessIPAddressResponseSchema deleteAccessIpAddress(String accessIpAddressId) throws ApiException {
    return deleteAccessIpAddressWithHttpInfo(accessIpAddressId).getData();
  }

  /**
   * Delete access IP address
   * 
   * @param accessIpAddressId  (required)
   * @return ApiResponse&lt;AccessIPAddressResponseSchema&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<AccessIPAddressResponseSchema> deleteAccessIpAddressWithHttpInfo(String accessIpAddressId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'accessIpAddressId' is set
    if (accessIpAddressId == null) {
      throw new ApiException(400, "Missing the required parameter 'accessIpAddressId' when calling deleteAccessIpAddress");
    }
    
    // create path and map variables
    String localVarPath = "/access_ip_address/{access_ip_address_id}"
      .replaceAll("\\{" + "access_ip_address_id" + "\\}", apiClient.escapeString(accessIpAddressId.toString()));

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

    GenericType<AccessIPAddressResponseSchema> localVarReturnType = new GenericType<AccessIPAddressResponseSchema>() {};

    return apiClient.invokeAPI("IpAddressesApi.deleteAccessIpAddress", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Retrieve an access IP address
   * 
   * @param accessIpAddressId  (required)
   * @return AccessIPAddressResponseSchema
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public AccessIPAddressResponseSchema getAccessIpAddress(String accessIpAddressId) throws ApiException {
    return getAccessIpAddressWithHttpInfo(accessIpAddressId).getData();
  }

  /**
   * Retrieve an access IP address
   * 
   * @param accessIpAddressId  (required)
   * @return ApiResponse&lt;AccessIPAddressResponseSchema&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<AccessIPAddressResponseSchema> getAccessIpAddressWithHttpInfo(String accessIpAddressId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'accessIpAddressId' is set
    if (accessIpAddressId == null) {
      throw new ApiException(400, "Missing the required parameter 'accessIpAddressId' when calling getAccessIpAddress");
    }
    
    // create path and map variables
    String localVarPath = "/access_ip_address/{access_ip_address_id}"
      .replaceAll("\\{" + "access_ip_address_id" + "\\}", apiClient.escapeString(accessIpAddressId.toString()));

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

    GenericType<AccessIPAddressResponseSchema> localVarReturnType = new GenericType<AccessIPAddressResponseSchema>() {};

    return apiClient.invokeAPI("IpAddressesApi.getAccessIpAddress", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * List all Access IP Addresses
   * 
   * @param filterIpSource  (optional)
   * @param filterIpAddress  (optional)
   * @param filterCreatedAtGt  (optional)
   * @param filterCreatedAtLt  (optional)
   * @param pageNumber  (optional, default to 1)
   * @param pageSize  (optional, default to 20)
   * @return AccessIPAddressListResponseSchema
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
     </table>
   */
  public AccessIPAddressListResponseSchema listAccessIpAddresses(String filterIpSource, String filterIpAddress, OffsetDateTime filterCreatedAtGt, OffsetDateTime filterCreatedAtLt, Integer pageNumber, Integer pageSize) throws ApiException {
    return listAccessIpAddressesWithHttpInfo(filterIpSource, filterIpAddress, filterCreatedAtGt, filterCreatedAtLt, pageNumber, pageSize).getData();
  }

  /**
   * List all Access IP Addresses
   * 
   * @param filterIpSource  (optional)
   * @param filterIpAddress  (optional)
   * @param filterCreatedAtGt  (optional)
   * @param filterCreatedAtLt  (optional)
   * @param pageNumber  (optional, default to 1)
   * @param pageSize  (optional, default to 20)
   * @return ApiResponse&lt;AccessIPAddressListResponseSchema&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<AccessIPAddressListResponseSchema> listAccessIpAddressesWithHttpInfo(String filterIpSource, String filterIpAddress, OffsetDateTime filterCreatedAtGt, OffsetDateTime filterCreatedAtLt, Integer pageNumber, Integer pageSize) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/access_ip_address";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[ip_source]", filterIpSource));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[ip_address]", filterIpAddress));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[created_at][gt]", filterCreatedAtGt));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[created_at][lt]", filterCreatedAtLt));
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

    GenericType<AccessIPAddressListResponseSchema> localVarReturnType = new GenericType<AccessIPAddressListResponseSchema>() {};

    return apiClient.invokeAPI("IpAddressesApi.listAccessIpAddresses", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
