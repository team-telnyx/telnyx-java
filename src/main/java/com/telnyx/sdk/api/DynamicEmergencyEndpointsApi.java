package com.telnyx.sdk.api;

import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.Pair;

import jakarta.ws.rs.core.GenericType;

import com.telnyx.sdk.model.CreateDynamicEmergencyEndpoint201Response;
import com.telnyx.sdk.model.DynamicEmergencyEndpoint;
import com.telnyx.sdk.model.ListDynamicEmergencyEndpoints200Response;
import java.util.UUID;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class DynamicEmergencyEndpointsApi {
  private ApiClient apiClient;

  public DynamicEmergencyEndpointsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public DynamicEmergencyEndpointsApi(ApiClient apiClient) {
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
   * Create a dynamic emergency endpoint.
   * Creates a dynamic emergency endpoints.
   * @param dynamicEmergencyEndpoint  (required)
   * @return CreateDynamicEmergencyEndpoint201Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Dynamic Emergency Endpoint Response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check message field in response for details. </td><td>  -  </td></tr>
     </table>
   */
  public CreateDynamicEmergencyEndpoint201Response createDynamicEmergencyEndpoint(DynamicEmergencyEndpoint dynamicEmergencyEndpoint) throws ApiException {
    return createDynamicEmergencyEndpointWithHttpInfo(dynamicEmergencyEndpoint).getData();
  }

  /**
   * Create a dynamic emergency endpoint.
   * Creates a dynamic emergency endpoints.
   * @param dynamicEmergencyEndpoint  (required)
   * @return ApiResponse&lt;CreateDynamicEmergencyEndpoint201Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Dynamic Emergency Endpoint Response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check message field in response for details. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CreateDynamicEmergencyEndpoint201Response> createDynamicEmergencyEndpointWithHttpInfo(DynamicEmergencyEndpoint dynamicEmergencyEndpoint) throws ApiException {
    Object localVarPostBody = dynamicEmergencyEndpoint;
    
    // verify the required parameter 'dynamicEmergencyEndpoint' is set
    if (dynamicEmergencyEndpoint == null) {
      throw new ApiException(400, "Missing the required parameter 'dynamicEmergencyEndpoint' when calling createDynamicEmergencyEndpoint");
    }
    
    // create path and map variables
    String localVarPath = "/dynamic_emergency_endpoints";

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

    GenericType<CreateDynamicEmergencyEndpoint201Response> localVarReturnType = new GenericType<CreateDynamicEmergencyEndpoint201Response>() {};

    return apiClient.invokeAPI("DynamicEmergencyEndpointsApi.createDynamicEmergencyEndpoint", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Delete a dynamic emergency endpoint
   * Deletes the dynamic emergency endpoint based on the ID provided
   * @param id Dynamic Emergency Endpoint id (required)
   * @return CreateDynamicEmergencyEndpoint201Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Dynamic Emergency Endpoint Response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check message field in response for details. </td><td>  -  </td></tr>
     </table>
   */
  public CreateDynamicEmergencyEndpoint201Response deleteDynamicEmergencyEndpoint(UUID id) throws ApiException {
    return deleteDynamicEmergencyEndpointWithHttpInfo(id).getData();
  }

  /**
   * Delete a dynamic emergency endpoint
   * Deletes the dynamic emergency endpoint based on the ID provided
   * @param id Dynamic Emergency Endpoint id (required)
   * @return ApiResponse&lt;CreateDynamicEmergencyEndpoint201Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Dynamic Emergency Endpoint Response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check message field in response for details. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CreateDynamicEmergencyEndpoint201Response> deleteDynamicEmergencyEndpointWithHttpInfo(UUID id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling deleteDynamicEmergencyEndpoint");
    }
    
    // create path and map variables
    String localVarPath = "/dynamic_emergency_endpoints/{id}"
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

    GenericType<CreateDynamicEmergencyEndpoint201Response> localVarReturnType = new GenericType<CreateDynamicEmergencyEndpoint201Response>() {};

    return apiClient.invokeAPI("DynamicEmergencyEndpointsApi.deleteDynamicEmergencyEndpoint", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get a dynamic emergency endpoint
   * Returns the dynamic emergency endpoint based on the ID provided
   * @param id Dynamic Emergency Endpoint id (required)
   * @return CreateDynamicEmergencyEndpoint201Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Dynamic Emergency Endpoint Response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check message field in response for details. </td><td>  -  </td></tr>
     </table>
   */
  public CreateDynamicEmergencyEndpoint201Response getDynamicEmergencyEndpoint(UUID id) throws ApiException {
    return getDynamicEmergencyEndpointWithHttpInfo(id).getData();
  }

  /**
   * Get a dynamic emergency endpoint
   * Returns the dynamic emergency endpoint based on the ID provided
   * @param id Dynamic Emergency Endpoint id (required)
   * @return ApiResponse&lt;CreateDynamicEmergencyEndpoint201Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Dynamic Emergency Endpoint Response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check message field in response for details. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CreateDynamicEmergencyEndpoint201Response> getDynamicEmergencyEndpointWithHttpInfo(UUID id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getDynamicEmergencyEndpoint");
    }
    
    // create path and map variables
    String localVarPath = "/dynamic_emergency_endpoints/{id}"
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

    GenericType<CreateDynamicEmergencyEndpoint201Response> localVarReturnType = new GenericType<CreateDynamicEmergencyEndpoint201Response>() {};

    return apiClient.invokeAPI("DynamicEmergencyEndpointsApi.getDynamicEmergencyEndpoint", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * List dynamic emergency endpoints
   * Returns the dynamic emergency endpoints according to filters
   * @param filterStatus Filter by status. (optional)
   * @param filterCountryCode Filter by country code. (optional)
   * @param pageNumber The page number to load (optional, default to 1)
   * @param pageSize The size of the page (optional, default to 20)
   * @return ListDynamicEmergencyEndpoints200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Dynamic Emergency Endpoints Responses </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check message field in response for details. </td><td>  -  </td></tr>
     </table>
   */
  public ListDynamicEmergencyEndpoints200Response listDynamicEmergencyEndpoints(String filterStatus, String filterCountryCode, Integer pageNumber, Integer pageSize) throws ApiException {
    return listDynamicEmergencyEndpointsWithHttpInfo(filterStatus, filterCountryCode, pageNumber, pageSize).getData();
  }

  /**
   * List dynamic emergency endpoints
   * Returns the dynamic emergency endpoints according to filters
   * @param filterStatus Filter by status. (optional)
   * @param filterCountryCode Filter by country code. (optional)
   * @param pageNumber The page number to load (optional, default to 1)
   * @param pageSize The size of the page (optional, default to 20)
   * @return ApiResponse&lt;ListDynamicEmergencyEndpoints200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Dynamic Emergency Endpoints Responses </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check message field in response for details. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ListDynamicEmergencyEndpoints200Response> listDynamicEmergencyEndpointsWithHttpInfo(String filterStatus, String filterCountryCode, Integer pageNumber, Integer pageSize) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/dynamic_emergency_endpoints";

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

    GenericType<ListDynamicEmergencyEndpoints200Response> localVarReturnType = new GenericType<ListDynamicEmergencyEndpoints200Response>() {};

    return apiClient.invokeAPI("DynamicEmergencyEndpointsApi.listDynamicEmergencyEndpoints", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
