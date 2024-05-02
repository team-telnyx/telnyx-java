package com.telnyx.sdk.api;

import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.Pair;

import jakarta.ws.rs.core.GenericType;

import com.telnyx.sdk.model.CreateGlobalIp202Response;
import com.telnyx.sdk.model.CreateGlobalIpAssignment202Response;
import com.telnyx.sdk.model.CreateGlobalIpHealthCheck202Response;
import com.telnyx.sdk.model.Errors;
import com.telnyx.sdk.model.GetGlobalIpAssignmentHealth200Response;
import com.telnyx.sdk.model.GetGlobalIpAssignmentUsage200Response;
import com.telnyx.sdk.model.GetGlobalIpLatency200Response;
import com.telnyx.sdk.model.GetGlobalIpUsage200Response;
import com.telnyx.sdk.model.GlobalIP;
import com.telnyx.sdk.model.GlobalIPHealthCheck;
import com.telnyx.sdk.model.GlobalIpAssignment;
import com.telnyx.sdk.model.GlobalIpAssignmentUpdate;
import com.telnyx.sdk.model.ListGlobalIpAllowedPorts200Response;
import com.telnyx.sdk.model.ListGlobalIpAssignments200Response;
import com.telnyx.sdk.model.ListGlobalIpHealthCheckTypes200Response;
import com.telnyx.sdk.model.ListGlobalIpHealthChecks200Response;
import com.telnyx.sdk.model.ListGlobalIpProtocols200Response;
import com.telnyx.sdk.model.ListGlobalIps200Response;
import java.time.OffsetDateTime;
import java.util.UUID;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class GlobalIpsApi {
  private ApiClient apiClient;

  public GlobalIpsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public GlobalIpsApi(ApiClient apiClient) {
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
   * Create a Global IP
   * Create a Global IP.
   * @param globalIP  (required)
   * @return CreateGlobalIp202Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 202 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check the &#39;detail&#39; field in response for details. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public CreateGlobalIp202Response createGlobalIp(GlobalIP globalIP) throws ApiException {
    return createGlobalIpWithHttpInfo(globalIP).getData();
  }

  /**
   * Create a Global IP
   * Create a Global IP.
   * @param globalIP  (required)
   * @return ApiResponse&lt;CreateGlobalIp202Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 202 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check the &#39;detail&#39; field in response for details. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CreateGlobalIp202Response> createGlobalIpWithHttpInfo(GlobalIP globalIP) throws ApiException {
    Object localVarPostBody = globalIP;
    
    // verify the required parameter 'globalIP' is set
    if (globalIP == null) {
      throw new ApiException(400, "Missing the required parameter 'globalIP' when calling createGlobalIp");
    }
    
    // create path and map variables
    String localVarPath = "/global_ips";

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

    GenericType<CreateGlobalIp202Response> localVarReturnType = new GenericType<CreateGlobalIp202Response>() {};

    return apiClient.invokeAPI("GlobalIpsApi.createGlobalIp", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Create a Global IP assignment
   * Create a Global IP assignment.
   * @param globalIpAssignment  (required)
   * @return CreateGlobalIpAssignment202Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 202 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check the &#39;detail&#39; field in response for details. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public CreateGlobalIpAssignment202Response createGlobalIpAssignment(GlobalIpAssignment globalIpAssignment) throws ApiException {
    return createGlobalIpAssignmentWithHttpInfo(globalIpAssignment).getData();
  }

  /**
   * Create a Global IP assignment
   * Create a Global IP assignment.
   * @param globalIpAssignment  (required)
   * @return ApiResponse&lt;CreateGlobalIpAssignment202Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 202 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check the &#39;detail&#39; field in response for details. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CreateGlobalIpAssignment202Response> createGlobalIpAssignmentWithHttpInfo(GlobalIpAssignment globalIpAssignment) throws ApiException {
    Object localVarPostBody = globalIpAssignment;
    
    // verify the required parameter 'globalIpAssignment' is set
    if (globalIpAssignment == null) {
      throw new ApiException(400, "Missing the required parameter 'globalIpAssignment' when calling createGlobalIpAssignment");
    }
    
    // create path and map variables
    String localVarPath = "/global_ip_assignments";

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

    GenericType<CreateGlobalIpAssignment202Response> localVarReturnType = new GenericType<CreateGlobalIpAssignment202Response>() {};

    return apiClient.invokeAPI("GlobalIpsApi.createGlobalIpAssignment", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Create a Global IP health check
   * Create a Global IP health check.
   * @param globalIPHealthCheck  (required)
   * @return CreateGlobalIpHealthCheck202Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 202 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check the &#39;detail&#39; field in response for details. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public CreateGlobalIpHealthCheck202Response createGlobalIpHealthCheck(GlobalIPHealthCheck globalIPHealthCheck) throws ApiException {
    return createGlobalIpHealthCheckWithHttpInfo(globalIPHealthCheck).getData();
  }

  /**
   * Create a Global IP health check
   * Create a Global IP health check.
   * @param globalIPHealthCheck  (required)
   * @return ApiResponse&lt;CreateGlobalIpHealthCheck202Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 202 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check the &#39;detail&#39; field in response for details. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CreateGlobalIpHealthCheck202Response> createGlobalIpHealthCheckWithHttpInfo(GlobalIPHealthCheck globalIPHealthCheck) throws ApiException {
    Object localVarPostBody = globalIPHealthCheck;
    
    // verify the required parameter 'globalIPHealthCheck' is set
    if (globalIPHealthCheck == null) {
      throw new ApiException(400, "Missing the required parameter 'globalIPHealthCheck' when calling createGlobalIpHealthCheck");
    }
    
    // create path and map variables
    String localVarPath = "/global_ip_health_checks";

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

    GenericType<CreateGlobalIpHealthCheck202Response> localVarReturnType = new GenericType<CreateGlobalIpHealthCheck202Response>() {};

    return apiClient.invokeAPI("GlobalIpsApi.createGlobalIpHealthCheck", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Delete a Global IP
   * Delete a Global IP.
   * @param id Identifies the resource. (required)
   * @return CreateGlobalIp202Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public CreateGlobalIp202Response deleteGlobalIp(UUID id) throws ApiException {
    return deleteGlobalIpWithHttpInfo(id).getData();
  }

  /**
   * Delete a Global IP
   * Delete a Global IP.
   * @param id Identifies the resource. (required)
   * @return ApiResponse&lt;CreateGlobalIp202Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CreateGlobalIp202Response> deleteGlobalIpWithHttpInfo(UUID id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling deleteGlobalIp");
    }
    
    // create path and map variables
    String localVarPath = "/global_ips/{id}"
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

    GenericType<CreateGlobalIp202Response> localVarReturnType = new GenericType<CreateGlobalIp202Response>() {};

    return apiClient.invokeAPI("GlobalIpsApi.deleteGlobalIp", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Delete a Global IP assignment
   * Delete a Global IP assignment.
   * @param id Identifies the resource. (required)
   * @return CreateGlobalIpAssignment202Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public CreateGlobalIpAssignment202Response deleteGlobalIpAssignment(UUID id) throws ApiException {
    return deleteGlobalIpAssignmentWithHttpInfo(id).getData();
  }

  /**
   * Delete a Global IP assignment
   * Delete a Global IP assignment.
   * @param id Identifies the resource. (required)
   * @return ApiResponse&lt;CreateGlobalIpAssignment202Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CreateGlobalIpAssignment202Response> deleteGlobalIpAssignmentWithHttpInfo(UUID id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling deleteGlobalIpAssignment");
    }
    
    // create path and map variables
    String localVarPath = "/global_ip_assignments/{id}"
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

    GenericType<CreateGlobalIpAssignment202Response> localVarReturnType = new GenericType<CreateGlobalIpAssignment202Response>() {};

    return apiClient.invokeAPI("GlobalIpsApi.deleteGlobalIpAssignment", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Delete a Global IP health check
   * Delete a Global IP health check.
   * @param id Identifies the resource. (required)
   * @return CreateGlobalIpHealthCheck202Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public CreateGlobalIpHealthCheck202Response deleteGlobalIpHealthCheck(UUID id) throws ApiException {
    return deleteGlobalIpHealthCheckWithHttpInfo(id).getData();
  }

  /**
   * Delete a Global IP health check
   * Delete a Global IP health check.
   * @param id Identifies the resource. (required)
   * @return ApiResponse&lt;CreateGlobalIpHealthCheck202Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CreateGlobalIpHealthCheck202Response> deleteGlobalIpHealthCheckWithHttpInfo(UUID id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling deleteGlobalIpHealthCheck");
    }
    
    // create path and map variables
    String localVarPath = "/global_ip_health_checks/{id}"
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

    GenericType<CreateGlobalIpHealthCheck202Response> localVarReturnType = new GenericType<CreateGlobalIpHealthCheck202Response>() {};

    return apiClient.invokeAPI("GlobalIpsApi.deleteGlobalIpHealthCheck", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Retrieve a Global IP
   * Retrieve a Global IP.
   * @param id Identifies the resource. (required)
   * @return CreateGlobalIp202Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public CreateGlobalIp202Response getGlobalIp(UUID id) throws ApiException {
    return getGlobalIpWithHttpInfo(id).getData();
  }

  /**
   * Retrieve a Global IP
   * Retrieve a Global IP.
   * @param id Identifies the resource. (required)
   * @return ApiResponse&lt;CreateGlobalIp202Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CreateGlobalIp202Response> getGlobalIpWithHttpInfo(UUID id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getGlobalIp");
    }
    
    // create path and map variables
    String localVarPath = "/global_ips/{id}"
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

    GenericType<CreateGlobalIp202Response> localVarReturnType = new GenericType<CreateGlobalIp202Response>() {};

    return apiClient.invokeAPI("GlobalIpsApi.getGlobalIp", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Retrieve a Global IP
   * Retrieve a Global IP assignment.
   * @param id Identifies the resource. (required)
   * @return CreateGlobalIpAssignment202Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public CreateGlobalIpAssignment202Response getGlobalIpAssignment(UUID id) throws ApiException {
    return getGlobalIpAssignmentWithHttpInfo(id).getData();
  }

  /**
   * Retrieve a Global IP
   * Retrieve a Global IP assignment.
   * @param id Identifies the resource. (required)
   * @return ApiResponse&lt;CreateGlobalIpAssignment202Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CreateGlobalIpAssignment202Response> getGlobalIpAssignmentWithHttpInfo(UUID id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getGlobalIpAssignment");
    }
    
    // create path and map variables
    String localVarPath = "/global_ip_assignments/{id}"
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

    GenericType<CreateGlobalIpAssignment202Response> localVarReturnType = new GenericType<CreateGlobalIpAssignment202Response>() {};

    return apiClient.invokeAPI("GlobalIpsApi.getGlobalIpAssignment", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param filterGlobalIpIdIn Filter by Global IP ID(s) separated by commas (optional)
   * @param filterGlobalIpAssignmentIdIn Filter by Global IP Assignment ID(s) separated by commas (optional)
   * @param filterTimestampGt Filter by timestamp greater than (optional)
   * @param filterTimestampLt Filter by timestamp less than (optional)
   * @return GetGlobalIpAssignmentHealth200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public GetGlobalIpAssignmentHealth200Response getGlobalIpAssignmentHealth(String filterGlobalIpIdIn, String filterGlobalIpAssignmentIdIn, OffsetDateTime filterTimestampGt, OffsetDateTime filterTimestampLt) throws ApiException {
    return getGlobalIpAssignmentHealthWithHttpInfo(filterGlobalIpIdIn, filterGlobalIpAssignmentIdIn, filterTimestampGt, filterTimestampLt).getData();
  }

  /**
   * 
   * 
   * @param filterGlobalIpIdIn Filter by Global IP ID(s) separated by commas (optional)
   * @param filterGlobalIpAssignmentIdIn Filter by Global IP Assignment ID(s) separated by commas (optional)
   * @param filterTimestampGt Filter by timestamp greater than (optional)
   * @param filterTimestampLt Filter by timestamp less than (optional)
   * @return ApiResponse&lt;GetGlobalIpAssignmentHealth200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GetGlobalIpAssignmentHealth200Response> getGlobalIpAssignmentHealthWithHttpInfo(String filterGlobalIpIdIn, String filterGlobalIpAssignmentIdIn, OffsetDateTime filterTimestampGt, OffsetDateTime filterTimestampLt) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/global_ip_assignment_health";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[global_ip_id][in]", filterGlobalIpIdIn));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[global_ip_assignment_id][in]", filterGlobalIpAssignmentIdIn));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[timestamp][gt]", filterTimestampGt));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[timestamp][lt]", filterTimestampLt));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    GenericType<GetGlobalIpAssignmentHealth200Response> localVarReturnType = new GenericType<GetGlobalIpAssignmentHealth200Response>() {};

    return apiClient.invokeAPI("GlobalIpsApi.getGlobalIpAssignmentHealth", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param filterGlobalIpAssignmentIdIn Filter by Global IP Assignment ID(s) separated by commas (optional)
   * @param filterGlobalIpIdIn Filter by Global IP ID(s), separated by commas (optional)
   * @param filterTimestampGt Filter by timestamp greater than (optional)
   * @param filterTimestampLt Filter by timestamp less than (optional)
   * @return GetGlobalIpAssignmentUsage200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public GetGlobalIpAssignmentUsage200Response getGlobalIpAssignmentUsage(String filterGlobalIpAssignmentIdIn, String filterGlobalIpIdIn, OffsetDateTime filterTimestampGt, OffsetDateTime filterTimestampLt) throws ApiException {
    return getGlobalIpAssignmentUsageWithHttpInfo(filterGlobalIpAssignmentIdIn, filterGlobalIpIdIn, filterTimestampGt, filterTimestampLt).getData();
  }

  /**
   * 
   * 
   * @param filterGlobalIpAssignmentIdIn Filter by Global IP Assignment ID(s) separated by commas (optional)
   * @param filterGlobalIpIdIn Filter by Global IP ID(s), separated by commas (optional)
   * @param filterTimestampGt Filter by timestamp greater than (optional)
   * @param filterTimestampLt Filter by timestamp less than (optional)
   * @return ApiResponse&lt;GetGlobalIpAssignmentUsage200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GetGlobalIpAssignmentUsage200Response> getGlobalIpAssignmentUsageWithHttpInfo(String filterGlobalIpAssignmentIdIn, String filterGlobalIpIdIn, OffsetDateTime filterTimestampGt, OffsetDateTime filterTimestampLt) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/global_ip_assignments_usage";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[global_ip_assignment_id][in]", filterGlobalIpAssignmentIdIn));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[global_ip_id][in]", filterGlobalIpIdIn));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[timestamp][gt]", filterTimestampGt));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[timestamp][lt]", filterTimestampLt));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    GenericType<GetGlobalIpAssignmentUsage200Response> localVarReturnType = new GenericType<GetGlobalIpAssignmentUsage200Response>() {};

    return apiClient.invokeAPI("GlobalIpsApi.getGlobalIpAssignmentUsage", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Retrieve a Global IP health check
   * Retrieve a Global IP health check.
   * @param id Identifies the resource. (required)
   * @return CreateGlobalIpHealthCheck202Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public CreateGlobalIpHealthCheck202Response getGlobalIpHealthCheck(UUID id) throws ApiException {
    return getGlobalIpHealthCheckWithHttpInfo(id).getData();
  }

  /**
   * Retrieve a Global IP health check
   * Retrieve a Global IP health check.
   * @param id Identifies the resource. (required)
   * @return ApiResponse&lt;CreateGlobalIpHealthCheck202Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CreateGlobalIpHealthCheck202Response> getGlobalIpHealthCheckWithHttpInfo(UUID id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getGlobalIpHealthCheck");
    }
    
    // create path and map variables
    String localVarPath = "/global_ip_health_checks/{id}"
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

    GenericType<CreateGlobalIpHealthCheck202Response> localVarReturnType = new GenericType<CreateGlobalIpHealthCheck202Response>() {};

    return apiClient.invokeAPI("GlobalIpsApi.getGlobalIpHealthCheck", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param filterGlobalIpIdIn Filter by Global IP ID(s) separated by commas (optional)
   * @param filterTimestampGt Filter by timestamp greater than (optional)
   * @param filterTimestampLt Filter by timestamp less than (optional)
   * @return GetGlobalIpLatency200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public GetGlobalIpLatency200Response getGlobalIpLatency(String filterGlobalIpIdIn, OffsetDateTime filterTimestampGt, OffsetDateTime filterTimestampLt) throws ApiException {
    return getGlobalIpLatencyWithHttpInfo(filterGlobalIpIdIn, filterTimestampGt, filterTimestampLt).getData();
  }

  /**
   * 
   * 
   * @param filterGlobalIpIdIn Filter by Global IP ID(s) separated by commas (optional)
   * @param filterTimestampGt Filter by timestamp greater than (optional)
   * @param filterTimestampLt Filter by timestamp less than (optional)
   * @return ApiResponse&lt;GetGlobalIpLatency200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GetGlobalIpLatency200Response> getGlobalIpLatencyWithHttpInfo(String filterGlobalIpIdIn, OffsetDateTime filterTimestampGt, OffsetDateTime filterTimestampLt) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/global_ip_latency";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[global_ip_id][in]", filterGlobalIpIdIn));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[timestamp][gt]", filterTimestampGt));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[timestamp][lt]", filterTimestampLt));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    GenericType<GetGlobalIpLatency200Response> localVarReturnType = new GenericType<GetGlobalIpLatency200Response>() {};

    return apiClient.invokeAPI("GlobalIpsApi.getGlobalIpLatency", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param filterGlobalIpIdIn Filter by Global IP ID(s) separated by commas (optional)
   * @param filterTimestampGt Filter by timestamp greater than (optional)
   * @param filterTimestampLt Filter by timestamp less than (optional)
   * @return GetGlobalIpUsage200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public GetGlobalIpUsage200Response getGlobalIpUsage(String filterGlobalIpIdIn, OffsetDateTime filterTimestampGt, OffsetDateTime filterTimestampLt) throws ApiException {
    return getGlobalIpUsageWithHttpInfo(filterGlobalIpIdIn, filterTimestampGt, filterTimestampLt).getData();
  }

  /**
   * 
   * 
   * @param filterGlobalIpIdIn Filter by Global IP ID(s) separated by commas (optional)
   * @param filterTimestampGt Filter by timestamp greater than (optional)
   * @param filterTimestampLt Filter by timestamp less than (optional)
   * @return ApiResponse&lt;GetGlobalIpUsage200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GetGlobalIpUsage200Response> getGlobalIpUsageWithHttpInfo(String filterGlobalIpIdIn, OffsetDateTime filterTimestampGt, OffsetDateTime filterTimestampLt) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/global_ip_usage";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[global_ip_id][in]", filterGlobalIpIdIn));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[timestamp][gt]", filterTimestampGt));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[timestamp][lt]", filterTimestampLt));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    GenericType<GetGlobalIpUsage200Response> localVarReturnType = new GenericType<GetGlobalIpUsage200Response>() {};

    return apiClient.invokeAPI("GlobalIpsApi.getGlobalIpUsage", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * List all Global IP Allowed Ports
   * List all Global IP Allowed Ports
   * @return ListGlobalIpAllowedPorts200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ListGlobalIpAllowedPorts200Response listGlobalIpAllowedPorts() throws ApiException {
    return listGlobalIpAllowedPortsWithHttpInfo().getData();
  }

  /**
   * List all Global IP Allowed Ports
   * List all Global IP Allowed Ports
   * @return ApiResponse&lt;ListGlobalIpAllowedPorts200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ListGlobalIpAllowedPorts200Response> listGlobalIpAllowedPortsWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/global_ip_allowed_ports";

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

    GenericType<ListGlobalIpAllowedPorts200Response> localVarReturnType = new GenericType<ListGlobalIpAllowedPorts200Response>() {};

    return apiClient.invokeAPI("GlobalIpsApi.listGlobalIpAllowedPorts", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * List all Global IP assignments
   * List all Global IP assignments.
   * @param pageNumber The page number to load (optional, default to 1)
   * @param pageSize The size of the page (optional, default to 20)
   * @return ListGlobalIpAssignments200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ListGlobalIpAssignments200Response listGlobalIpAssignments(Integer pageNumber, Integer pageSize) throws ApiException {
    return listGlobalIpAssignmentsWithHttpInfo(pageNumber, pageSize).getData();
  }

  /**
   * List all Global IP assignments
   * List all Global IP assignments.
   * @param pageNumber The page number to load (optional, default to 1)
   * @param pageSize The size of the page (optional, default to 20)
   * @return ApiResponse&lt;ListGlobalIpAssignments200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ListGlobalIpAssignments200Response> listGlobalIpAssignmentsWithHttpInfo(Integer pageNumber, Integer pageSize) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/global_ip_assignments";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

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

    GenericType<ListGlobalIpAssignments200Response> localVarReturnType = new GenericType<ListGlobalIpAssignments200Response>() {};

    return apiClient.invokeAPI("GlobalIpsApi.listGlobalIpAssignments", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * List all Global IP Health check types
   * List all Global IP Health check types.
   * @return ListGlobalIpHealthCheckTypes200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ListGlobalIpHealthCheckTypes200Response listGlobalIpHealthCheckTypes() throws ApiException {
    return listGlobalIpHealthCheckTypesWithHttpInfo().getData();
  }

  /**
   * List all Global IP Health check types
   * List all Global IP Health check types.
   * @return ApiResponse&lt;ListGlobalIpHealthCheckTypes200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ListGlobalIpHealthCheckTypes200Response> listGlobalIpHealthCheckTypesWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/global_ip_health_check_types";

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

    GenericType<ListGlobalIpHealthCheckTypes200Response> localVarReturnType = new GenericType<ListGlobalIpHealthCheckTypes200Response>() {};

    return apiClient.invokeAPI("GlobalIpsApi.listGlobalIpHealthCheckTypes", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * List all Global IP health checks
   * List all Global IP health checks.
   * @param pageNumber The page number to load (optional, default to 1)
   * @param pageSize The size of the page (optional, default to 20)
   * @return ListGlobalIpHealthChecks200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ListGlobalIpHealthChecks200Response listGlobalIpHealthChecks(Integer pageNumber, Integer pageSize) throws ApiException {
    return listGlobalIpHealthChecksWithHttpInfo(pageNumber, pageSize).getData();
  }

  /**
   * List all Global IP health checks
   * List all Global IP health checks.
   * @param pageNumber The page number to load (optional, default to 1)
   * @param pageSize The size of the page (optional, default to 20)
   * @return ApiResponse&lt;ListGlobalIpHealthChecks200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ListGlobalIpHealthChecks200Response> listGlobalIpHealthChecksWithHttpInfo(Integer pageNumber, Integer pageSize) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/global_ip_health_checks";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

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

    GenericType<ListGlobalIpHealthChecks200Response> localVarReturnType = new GenericType<ListGlobalIpHealthChecks200Response>() {};

    return apiClient.invokeAPI("GlobalIpsApi.listGlobalIpHealthChecks", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * List all Global IP Protocols
   * List all Global IP Protocols
   * @return ListGlobalIpProtocols200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ListGlobalIpProtocols200Response listGlobalIpProtocols() throws ApiException {
    return listGlobalIpProtocolsWithHttpInfo().getData();
  }

  /**
   * List all Global IP Protocols
   * List all Global IP Protocols
   * @return ApiResponse&lt;ListGlobalIpProtocols200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ListGlobalIpProtocols200Response> listGlobalIpProtocolsWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/global_ip_protocols";

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

    GenericType<ListGlobalIpProtocols200Response> localVarReturnType = new GenericType<ListGlobalIpProtocols200Response>() {};

    return apiClient.invokeAPI("GlobalIpsApi.listGlobalIpProtocols", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * List all Global IPs
   * List all Global IPs.
   * @param pageNumber The page number to load (optional, default to 1)
   * @param pageSize The size of the page (optional, default to 20)
   * @return ListGlobalIps200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ListGlobalIps200Response listGlobalIps(Integer pageNumber, Integer pageSize) throws ApiException {
    return listGlobalIpsWithHttpInfo(pageNumber, pageSize).getData();
  }

  /**
   * List all Global IPs
   * List all Global IPs.
   * @param pageNumber The page number to load (optional, default to 1)
   * @param pageSize The size of the page (optional, default to 20)
   * @return ApiResponse&lt;ListGlobalIps200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ListGlobalIps200Response> listGlobalIpsWithHttpInfo(Integer pageNumber, Integer pageSize) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/global_ips";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

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

    GenericType<ListGlobalIps200Response> localVarReturnType = new GenericType<ListGlobalIps200Response>() {};

    return apiClient.invokeAPI("GlobalIpsApi.listGlobalIps", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Update a Global IP assignment
   * Update a Global IP assignment.
   * @param id Identifies the resource. (required)
   * @param globalIpAssignmentUpdate  (required)
   * @return CreateGlobalIpAssignment202Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public CreateGlobalIpAssignment202Response updateGlobalIpAssignment(UUID id, GlobalIpAssignmentUpdate globalIpAssignmentUpdate) throws ApiException {
    return updateGlobalIpAssignmentWithHttpInfo(id, globalIpAssignmentUpdate).getData();
  }

  /**
   * Update a Global IP assignment
   * Update a Global IP assignment.
   * @param id Identifies the resource. (required)
   * @param globalIpAssignmentUpdate  (required)
   * @return ApiResponse&lt;CreateGlobalIpAssignment202Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CreateGlobalIpAssignment202Response> updateGlobalIpAssignmentWithHttpInfo(UUID id, GlobalIpAssignmentUpdate globalIpAssignmentUpdate) throws ApiException {
    Object localVarPostBody = globalIpAssignmentUpdate;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling updateGlobalIpAssignment");
    }
    
    // verify the required parameter 'globalIpAssignmentUpdate' is set
    if (globalIpAssignmentUpdate == null) {
      throw new ApiException(400, "Missing the required parameter 'globalIpAssignmentUpdate' when calling updateGlobalIpAssignment");
    }
    
    // create path and map variables
    String localVarPath = "/global_ip_assignments/{id}"
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

    GenericType<CreateGlobalIpAssignment202Response> localVarReturnType = new GenericType<CreateGlobalIpAssignment202Response>() {};

    return apiClient.invokeAPI("GlobalIpsApi.updateGlobalIpAssignment", localVarPath, "PATCH", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
