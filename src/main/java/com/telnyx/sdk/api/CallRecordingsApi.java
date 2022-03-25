package com.telnyx.sdk.api;

import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.Pair;

import javax.ws.rs.core.GenericType;

import com.telnyx.sdk.model.CredentialsResponse;
import com.telnyx.sdk.model.Errors;
import com.telnyx.sdk.model.GCSConfiguration;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CallRecordingsApi {
  private ApiClient apiClient;

  public CallRecordingsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public CallRecordingsApi(ApiClient apiClient) {
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
   * Create custom storage credentials
   * Creates custom storage credentials configuration.
   * @param connectionId Uniquely identifies a Telnyx application (Call Control, TeXML) or Sip connection resource. (required)
   * @param gcSConfiguration Creates new credentials resource for given connection_id. (required)
   * @return CredentialsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A response with credentials resource. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public CredentialsResponse createCustomStorageCredentials(String connectionId, GCSConfiguration gcSConfiguration) throws ApiException {
    return createCustomStorageCredentialsWithHttpInfo(connectionId, gcSConfiguration).getData();
  }

  /**
   * Create custom storage credentials
   * Creates custom storage credentials configuration.
   * @param connectionId Uniquely identifies a Telnyx application (Call Control, TeXML) or Sip connection resource. (required)
   * @param gcSConfiguration Creates new credentials resource for given connection_id. (required)
   * @return ApiResponse&lt;CredentialsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A response with credentials resource. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CredentialsResponse> createCustomStorageCredentialsWithHttpInfo(String connectionId, GCSConfiguration gcSConfiguration) throws ApiException {
    Object localVarPostBody = gcSConfiguration;
    
    // verify the required parameter 'connectionId' is set
    if (connectionId == null) {
      throw new ApiException(400, "Missing the required parameter 'connectionId' when calling createCustomStorageCredentials");
    }
    
    // verify the required parameter 'gcSConfiguration' is set
    if (gcSConfiguration == null) {
      throw new ApiException(400, "Missing the required parameter 'gcSConfiguration' when calling createCustomStorageCredentials");
    }
    
    // create path and map variables
    String localVarPath = "/custom_storage_credentials/{connection_id}"
      .replaceAll("\\{" + "connection_id" + "\\}", apiClient.escapeString(connectionId.toString()));

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

    GenericType<CredentialsResponse> localVarReturnType = new GenericType<CredentialsResponse>() {};

    return apiClient.invokeAPI("CallRecordingsApi.createCustomStorageCredentials", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Delete stored credentials
   * Deletes a stored custom credentials configuration.
   * @param connectionId Uniquely identifies a Telnyx application (Call Control, TeXML) or Sip connection resource. (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> The credentials configuration for connection_id was deleted successfully. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public void deleteCustomStorageCredentials(String connectionId) throws ApiException {
    deleteCustomStorageCredentialsWithHttpInfo(connectionId);
  }

  /**
   * Delete stored credentials
   * Deletes a stored custom credentials configuration.
   * @param connectionId Uniquely identifies a Telnyx application (Call Control, TeXML) or Sip connection resource. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> The credentials configuration for connection_id was deleted successfully. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> deleteCustomStorageCredentialsWithHttpInfo(String connectionId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'connectionId' is set
    if (connectionId == null) {
      throw new ApiException(400, "Missing the required parameter 'connectionId' when calling deleteCustomStorageCredentials");
    }
    
    // create path and map variables
    String localVarPath = "/custom_storage_credentials/{connection_id}"
      .replaceAll("\\{" + "connection_id" + "\\}", apiClient.escapeString(connectionId.toString()));

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

    return apiClient.invokeAPI("CallRecordingsApi.deleteCustomStorageCredentials", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * Retrieve stored credentials
   * Returns the information about custom storage credentials.
   * @param connectionId Uniquely identifies a Telnyx application (Call Control, TeXML) or Sip connection resource. (required)
   * @return CredentialsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A response with credentials resource. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public CredentialsResponse getCustomStorageCredentials(String connectionId) throws ApiException {
    return getCustomStorageCredentialsWithHttpInfo(connectionId).getData();
  }

  /**
   * Retrieve stored credentials
   * Returns the information about custom storage credentials.
   * @param connectionId Uniquely identifies a Telnyx application (Call Control, TeXML) or Sip connection resource. (required)
   * @return ApiResponse&lt;CredentialsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A response with credentials resource. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CredentialsResponse> getCustomStorageCredentialsWithHttpInfo(String connectionId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'connectionId' is set
    if (connectionId == null) {
      throw new ApiException(400, "Missing the required parameter 'connectionId' when calling getCustomStorageCredentials");
    }
    
    // create path and map variables
    String localVarPath = "/custom_storage_credentials/{connection_id}"
      .replaceAll("\\{" + "connection_id" + "\\}", apiClient.escapeString(connectionId.toString()));

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

    GenericType<CredentialsResponse> localVarReturnType = new GenericType<CredentialsResponse>() {};

    return apiClient.invokeAPI("CallRecordingsApi.getCustomStorageCredentials", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Update stored credentials
   * Updates a stored custom credentials configuration.
   * @param connectionId Uniquely identifies a Telnyx application (Call Control, TeXML) or Sip connection resource. (required)
   * @param gcSConfiguration Creates new credentials resource for given connection_id. (required)
   * @return CredentialsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A response with credentials resource. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public CredentialsResponse updateCustomStorageCredentials(String connectionId, GCSConfiguration gcSConfiguration) throws ApiException {
    return updateCustomStorageCredentialsWithHttpInfo(connectionId, gcSConfiguration).getData();
  }

  /**
   * Update stored credentials
   * Updates a stored custom credentials configuration.
   * @param connectionId Uniquely identifies a Telnyx application (Call Control, TeXML) or Sip connection resource. (required)
   * @param gcSConfiguration Creates new credentials resource for given connection_id. (required)
   * @return ApiResponse&lt;CredentialsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A response with credentials resource. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CredentialsResponse> updateCustomStorageCredentialsWithHttpInfo(String connectionId, GCSConfiguration gcSConfiguration) throws ApiException {
    Object localVarPostBody = gcSConfiguration;
    
    // verify the required parameter 'connectionId' is set
    if (connectionId == null) {
      throw new ApiException(400, "Missing the required parameter 'connectionId' when calling updateCustomStorageCredentials");
    }
    
    // verify the required parameter 'gcSConfiguration' is set
    if (gcSConfiguration == null) {
      throw new ApiException(400, "Missing the required parameter 'gcSConfiguration' when calling updateCustomStorageCredentials");
    }
    
    // create path and map variables
    String localVarPath = "/custom_storage_credentials/{connection_id}"
      .replaceAll("\\{" + "connection_id" + "\\}", apiClient.escapeString(connectionId.toString()));

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

    GenericType<CredentialsResponse> localVarReturnType = new GenericType<CredentialsResponse>() {};

    return apiClient.invokeAPI("CallRecordingsApi.updateCustomStorageCredentials", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
