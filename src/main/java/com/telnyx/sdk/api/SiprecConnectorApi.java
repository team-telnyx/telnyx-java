package com.telnyx.sdk.api;

import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.Pair;

import javax.ws.rs.core.GenericType;

import com.telnyx.sdk.model.Errors;
import com.telnyx.sdk.model.SiprecConnector;
import com.telnyx.sdk.model.SiprecConnectorResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class SiprecConnectorApi {
  private ApiClient apiClient;

  public SiprecConnectorApi() {
    this(Configuration.getDefaultApiClient());
  }

  public SiprecConnectorApi(ApiClient apiClient) {
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
   * Creates a siprec connector
   * Saves a siprec connector configuration.
   * @param siprecConnector The params expected to create/update a SIPREC connector (required)
   * @return SiprecConnectorResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Return details of the SIPREC connector associated with the given name. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public SiprecConnectorResponse createSiprecConnector(SiprecConnector siprecConnector) throws ApiException {
    return createSiprecConnectorWithHttpInfo(siprecConnector).getData();
  }

  /**
   * Creates a siprec connector
   * Saves a siprec connector configuration.
   * @param siprecConnector The params expected to create/update a SIPREC connector (required)
   * @return ApiResponse&lt;SiprecConnectorResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Return details of the SIPREC connector associated with the given name. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<SiprecConnectorResponse> createSiprecConnectorWithHttpInfo(SiprecConnector siprecConnector) throws ApiException {
    Object localVarPostBody = siprecConnector;
    
    // verify the required parameter 'siprecConnector' is set
    if (siprecConnector == null) {
      throw new ApiException(400, "Missing the required parameter 'siprecConnector' when calling createSiprecConnector");
    }
    
    // create path and map variables
    String localVarPath = "/siprec_connectors";

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

    GenericType<SiprecConnectorResponse> localVarReturnType = new GenericType<SiprecConnectorResponse>() {};

    return apiClient.invokeAPI("SiprecConnectorApi.createSiprecConnector", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Delete stored Siprec Connection
   * Deletes a stored Siprec Connection.
   * @param connectorName Uniquely identifies a SIPREC connector (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> The SIPREC connector was deleted successfully. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public void deleteSiprecConnection(String connectorName) throws ApiException {
    deleteSiprecConnectionWithHttpInfo(connectorName);
  }

  /**
   * Delete stored Siprec Connection
   * Deletes a stored Siprec Connection.
   * @param connectorName Uniquely identifies a SIPREC connector (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> The SIPREC connector was deleted successfully. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> deleteSiprecConnectionWithHttpInfo(String connectorName) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'connectorName' is set
    if (connectorName == null) {
      throw new ApiException(400, "Missing the required parameter 'connectorName' when calling deleteSiprecConnection");
    }
    
    // create path and map variables
    String localVarPath = "/siprec_connectors"
      .replaceAll("\\{" + "connector_name" + "\\}", apiClient.escapeString(connectorName.toString()));

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

    return apiClient.invokeAPI("SiprecConnectorApi.deleteSiprecConnection", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * Retrieve stored Siprec Connection
   * Return details of the Siprec connection.
   * @param connectorName Uniquely identifies a SIPREC connector (required)
   * @return SiprecConnectorResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Return details of the SIPREC connector associated with the given name. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public SiprecConnectorResponse getSiprecConnection(String connectorName) throws ApiException {
    return getSiprecConnectionWithHttpInfo(connectorName).getData();
  }

  /**
   * Retrieve stored Siprec Connection
   * Return details of the Siprec connection.
   * @param connectorName Uniquely identifies a SIPREC connector (required)
   * @return ApiResponse&lt;SiprecConnectorResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Return details of the SIPREC connector associated with the given name. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<SiprecConnectorResponse> getSiprecConnectionWithHttpInfo(String connectorName) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'connectorName' is set
    if (connectorName == null) {
      throw new ApiException(400, "Missing the required parameter 'connectorName' when calling getSiprecConnection");
    }
    
    // create path and map variables
    String localVarPath = "/siprec_connectors"
      .replaceAll("\\{" + "connector_name" + "\\}", apiClient.escapeString(connectorName.toString()));

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

    GenericType<SiprecConnectorResponse> localVarReturnType = new GenericType<SiprecConnectorResponse>() {};

    return apiClient.invokeAPI("SiprecConnectorApi.getSiprecConnection", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Update stored SIPREC connector
   * Updates a stored SIPREC connector
   * @param connectorName Uniquely identifies a SIPREC connector (required)
   * @param siprecConnector The params expected to create/update a SIPREC connector (required)
   * @return SiprecConnectorResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Return details of the SIPREC connector associated with the given name. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public SiprecConnectorResponse updateSiprecConnector(String connectorName, SiprecConnector siprecConnector) throws ApiException {
    return updateSiprecConnectorWithHttpInfo(connectorName, siprecConnector).getData();
  }

  /**
   * Update stored SIPREC connector
   * Updates a stored SIPREC connector
   * @param connectorName Uniquely identifies a SIPREC connector (required)
   * @param siprecConnector The params expected to create/update a SIPREC connector (required)
   * @return ApiResponse&lt;SiprecConnectorResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Return details of the SIPREC connector associated with the given name. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<SiprecConnectorResponse> updateSiprecConnectorWithHttpInfo(String connectorName, SiprecConnector siprecConnector) throws ApiException {
    Object localVarPostBody = siprecConnector;
    
    // verify the required parameter 'connectorName' is set
    if (connectorName == null) {
      throw new ApiException(400, "Missing the required parameter 'connectorName' when calling updateSiprecConnector");
    }
    
    // verify the required parameter 'siprecConnector' is set
    if (siprecConnector == null) {
      throw new ApiException(400, "Missing the required parameter 'siprecConnector' when calling updateSiprecConnector");
    }
    
    // create path and map variables
    String localVarPath = "/siprec_connectors"
      .replaceAll("\\{" + "connector_name" + "\\}", apiClient.escapeString(connectorName.toString()));

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

    GenericType<SiprecConnectorResponse> localVarReturnType = new GenericType<SiprecConnectorResponse>() {};

    return apiClient.invokeAPI("SiprecConnectorApi.updateSiprecConnector", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
