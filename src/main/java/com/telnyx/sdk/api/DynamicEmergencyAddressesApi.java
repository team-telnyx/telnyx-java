package com.telnyx.sdk.api;

import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.Pair;

import javax.ws.rs.core.GenericType;

import com.telnyx.sdk.model.DynamicEmergencyAddress;
import com.telnyx.sdk.model.DynamicEmergencyAddressResponse;
import com.telnyx.sdk.model.ListDynamicEmergencyAddresses;
import java.util.UUID;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DynamicEmergencyAddressesApi {
  private ApiClient apiClient;

  public DynamicEmergencyAddressesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public DynamicEmergencyAddressesApi(ApiClient apiClient) {
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
   * Create a dynamic emergency address.
   * Creates a dynamic emergency address.
   * @param dynamicEmergencyAddress  (required)
   * @return DynamicEmergencyAddressResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Dynamic Emergency Address Response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check message field in response for details. </td><td>  -  </td></tr>
     </table>
   */
  public DynamicEmergencyAddressResponse createDyanmicEmergencyAddress(DynamicEmergencyAddress dynamicEmergencyAddress) throws ApiException {
    return createDyanmicEmergencyAddressWithHttpInfo(dynamicEmergencyAddress).getData();
  }

  /**
   * Create a dynamic emergency address.
   * Creates a dynamic emergency address.
   * @param dynamicEmergencyAddress  (required)
   * @return ApiResponse&lt;DynamicEmergencyAddressResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Dynamic Emergency Address Response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check message field in response for details. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<DynamicEmergencyAddressResponse> createDyanmicEmergencyAddressWithHttpInfo(DynamicEmergencyAddress dynamicEmergencyAddress) throws ApiException {
    Object localVarPostBody = dynamicEmergencyAddress;
    
    // verify the required parameter 'dynamicEmergencyAddress' is set
    if (dynamicEmergencyAddress == null) {
      throw new ApiException(400, "Missing the required parameter 'dynamicEmergencyAddress' when calling createDyanmicEmergencyAddress");
    }
    
    // create path and map variables
    String localVarPath = "/dynamic_emergency_addresses";

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

    GenericType<DynamicEmergencyAddressResponse> localVarReturnType = new GenericType<DynamicEmergencyAddressResponse>() {};

    return apiClient.invokeAPI("DynamicEmergencyAddressesApi.createDyanmicEmergencyAddress", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Delete a dynamic emergency address
   * Deletes the dynamic emergency address based on the ID provided
   * @param id Dynamic Emergency Address id (required)
   * @return DynamicEmergencyAddressResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Dynamic Emergency Address Response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check message field in response for details. </td><td>  -  </td></tr>
     </table>
   */
  public DynamicEmergencyAddressResponse deleteDynamicEmergencyAddress(UUID id) throws ApiException {
    return deleteDynamicEmergencyAddressWithHttpInfo(id).getData();
  }

  /**
   * Delete a dynamic emergency address
   * Deletes the dynamic emergency address based on the ID provided
   * @param id Dynamic Emergency Address id (required)
   * @return ApiResponse&lt;DynamicEmergencyAddressResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Dynamic Emergency Address Response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check message field in response for details. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<DynamicEmergencyAddressResponse> deleteDynamicEmergencyAddressWithHttpInfo(UUID id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling deleteDynamicEmergencyAddress");
    }
    
    // create path and map variables
    String localVarPath = "/dynamic_emergency_addresses/{id}"
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

    GenericType<DynamicEmergencyAddressResponse> localVarReturnType = new GenericType<DynamicEmergencyAddressResponse>() {};

    return apiClient.invokeAPI("DynamicEmergencyAddressesApi.deleteDynamicEmergencyAddress", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get a dynamic emergency address
   * Returns the dynamic emergency address based on the ID provided
   * @param id Dynamic Emergency Address id (required)
   * @return DynamicEmergencyAddressResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Dynamic Emergency Address Response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check message field in response for details. </td><td>  -  </td></tr>
     </table>
   */
  public DynamicEmergencyAddressResponse getDynamicEmergencyAddress(UUID id) throws ApiException {
    return getDynamicEmergencyAddressWithHttpInfo(id).getData();
  }

  /**
   * Get a dynamic emergency address
   * Returns the dynamic emergency address based on the ID provided
   * @param id Dynamic Emergency Address id (required)
   * @return ApiResponse&lt;DynamicEmergencyAddressResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Dynamic Emergency Address Response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check message field in response for details. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<DynamicEmergencyAddressResponse> getDynamicEmergencyAddressWithHttpInfo(UUID id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getDynamicEmergencyAddress");
    }
    
    // create path and map variables
    String localVarPath = "/dynamic_emergency_addresses/{id}"
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

    GenericType<DynamicEmergencyAddressResponse> localVarReturnType = new GenericType<DynamicEmergencyAddressResponse>() {};

    return apiClient.invokeAPI("DynamicEmergencyAddressesApi.getDynamicEmergencyAddress", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * List dynamic emergency addresses
   * Returns the dynamic emergency addresses according to filters
   * @param filterStatus Filter by status. (optional)
   * @param filterCountryCode Filter by country code. (optional)
   * @param pageNumber The page number to load (optional, default to 1)
   * @param pageSize The size of the page (optional, default to 20)
   * @return ListDynamicEmergencyAddresses
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Dynamic Emergency Address Responses </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check message field in response for details. </td><td>  -  </td></tr>
     </table>
   */
  public ListDynamicEmergencyAddresses listDyanmicEmergencyAddresses(String filterStatus, String filterCountryCode, Integer pageNumber, Integer pageSize) throws ApiException {
    return listDyanmicEmergencyAddressesWithHttpInfo(filterStatus, filterCountryCode, pageNumber, pageSize).getData();
  }

  /**
   * List dynamic emergency addresses
   * Returns the dynamic emergency addresses according to filters
   * @param filterStatus Filter by status. (optional)
   * @param filterCountryCode Filter by country code. (optional)
   * @param pageNumber The page number to load (optional, default to 1)
   * @param pageSize The size of the page (optional, default to 20)
   * @return ApiResponse&lt;ListDynamicEmergencyAddresses&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Dynamic Emergency Address Responses </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check message field in response for details. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ListDynamicEmergencyAddresses> listDyanmicEmergencyAddressesWithHttpInfo(String filterStatus, String filterCountryCode, Integer pageNumber, Integer pageSize) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/dynamic_emergency_addresses";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[status]", filterStatus));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[country_code]", filterCountryCode));
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

    GenericType<ListDynamicEmergencyAddresses> localVarReturnType = new GenericType<ListDynamicEmergencyAddresses>() {};

    return apiClient.invokeAPI("DynamicEmergencyAddressesApi.listDyanmicEmergencyAddresses", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
