package com.telnyx.sdk.api;

import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.Pair;

import jakarta.ws.rs.core.GenericType;

import com.telnyx.sdk.model.DialogflowConnection;
import com.telnyx.sdk.model.DialogflowConnectionResponse;
import com.telnyx.sdk.model.Errors;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class DialogflowIntegrationApi {
  private ApiClient apiClient;

  public DialogflowIntegrationApi() {
    this(Configuration.getDefaultApiClient());
  }

  public DialogflowIntegrationApi(ApiClient apiClient) {
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
   * Create a Dialogflow Connection
   * Save Dialogflow Credentiails to Telnyx, so it can be used with other Telnyx services.
   * @param connectionId Uniquely identifies a Telnyx application (Call Control, TeXML) or Sip connection resource. (required)
   * @param dialogflowConnection The params expected to create/update a Dialogflow Connection for given connection_id. (required)
   * @return DialogflowConnectionResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Return details of the Dialogflow connection associated with the given CallControl connection. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public DialogflowConnectionResponse createDialogflowConnection(String connectionId, DialogflowConnection dialogflowConnection) throws ApiException {
    return createDialogflowConnectionWithHttpInfo(connectionId, dialogflowConnection).getData();
  }

  /**
   * Create a Dialogflow Connection
   * Save Dialogflow Credentiails to Telnyx, so it can be used with other Telnyx services.
   * @param connectionId Uniquely identifies a Telnyx application (Call Control, TeXML) or Sip connection resource. (required)
   * @param dialogflowConnection The params expected to create/update a Dialogflow Connection for given connection_id. (required)
   * @return ApiResponse&lt;DialogflowConnectionResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Return details of the Dialogflow connection associated with the given CallControl connection. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<DialogflowConnectionResponse> createDialogflowConnectionWithHttpInfo(String connectionId, DialogflowConnection dialogflowConnection) throws ApiException {
    Object localVarPostBody = dialogflowConnection;
    
    // verify the required parameter 'connectionId' is set
    if (connectionId == null) {
      throw new ApiException(400, "Missing the required parameter 'connectionId' when calling createDialogflowConnection");
    }
    
    // verify the required parameter 'dialogflowConnection' is set
    if (dialogflowConnection == null) {
      throw new ApiException(400, "Missing the required parameter 'dialogflowConnection' when calling createDialogflowConnection");
    }
    
    // create path and map variables
    String localVarPath = "/dialogflow_connections/{connection_id}"
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

    GenericType<DialogflowConnectionResponse> localVarReturnType = new GenericType<DialogflowConnectionResponse>() {};

    return apiClient.invokeAPI("DialogflowIntegrationApi.createDialogflowConnection", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Delete stored Dialogflow Connection
   * Deletes a stored Dialogflow Connection.
   * @param connectionId Uniquely identifies a Telnyx application (Call Control, TeXML) or Sip connection resource. (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> The Dialogflow Connection for connection_id was deleted successfully. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public void deleteDialogflowConnection(String connectionId) throws ApiException {
    deleteDialogflowConnectionWithHttpInfo(connectionId);
  }

  /**
   * Delete stored Dialogflow Connection
   * Deletes a stored Dialogflow Connection.
   * @param connectionId Uniquely identifies a Telnyx application (Call Control, TeXML) or Sip connection resource. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> The Dialogflow Connection for connection_id was deleted successfully. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> deleteDialogflowConnectionWithHttpInfo(String connectionId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'connectionId' is set
    if (connectionId == null) {
      throw new ApiException(400, "Missing the required parameter 'connectionId' when calling deleteDialogflowConnection");
    }
    
    // create path and map variables
    String localVarPath = "/dialogflow_connections/{connection_id}"
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

    return apiClient.invokeAPI("DialogflowIntegrationApi.deleteDialogflowConnection", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * Retrieve stored Dialogflow Connection
   * Return details of the Dialogflow connection associated with the given CallControl connection.
   * @param connectionId Uniquely identifies a Telnyx application (Call Control, TeXML) or Sip connection resource. (required)
   * @return DialogflowConnectionResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Return details of the Dialogflow connection associated with the given CallControl connection. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public DialogflowConnectionResponse getDialogflowConnection(String connectionId) throws ApiException {
    return getDialogflowConnectionWithHttpInfo(connectionId).getData();
  }

  /**
   * Retrieve stored Dialogflow Connection
   * Return details of the Dialogflow connection associated with the given CallControl connection.
   * @param connectionId Uniquely identifies a Telnyx application (Call Control, TeXML) or Sip connection resource. (required)
   * @return ApiResponse&lt;DialogflowConnectionResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Return details of the Dialogflow connection associated with the given CallControl connection. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<DialogflowConnectionResponse> getDialogflowConnectionWithHttpInfo(String connectionId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'connectionId' is set
    if (connectionId == null) {
      throw new ApiException(400, "Missing the required parameter 'connectionId' when calling getDialogflowConnection");
    }
    
    // create path and map variables
    String localVarPath = "/dialogflow_connections/{connection_id}"
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

    GenericType<DialogflowConnectionResponse> localVarReturnType = new GenericType<DialogflowConnectionResponse>() {};

    return apiClient.invokeAPI("DialogflowIntegrationApi.getDialogflowConnection", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Update stored Dialogflow Connection
   * Updates a stored Dialogflow Connection.
   * @param connectionId Uniquely identifies a Telnyx application (Call Control, TeXML) or Sip connection resource. (required)
   * @param dialogflowConnection The params expected to create/update a Dialogflow Connection for given connection_id. (required)
   * @return DialogflowConnectionResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Return details of the Dialogflow connection associated with the given CallControl connection. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public DialogflowConnectionResponse updateDialogflowConnection(String connectionId, DialogflowConnection dialogflowConnection) throws ApiException {
    return updateDialogflowConnectionWithHttpInfo(connectionId, dialogflowConnection).getData();
  }

  /**
   * Update stored Dialogflow Connection
   * Updates a stored Dialogflow Connection.
   * @param connectionId Uniquely identifies a Telnyx application (Call Control, TeXML) or Sip connection resource. (required)
   * @param dialogflowConnection The params expected to create/update a Dialogflow Connection for given connection_id. (required)
   * @return ApiResponse&lt;DialogflowConnectionResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Return details of the Dialogflow connection associated with the given CallControl connection. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<DialogflowConnectionResponse> updateDialogflowConnectionWithHttpInfo(String connectionId, DialogflowConnection dialogflowConnection) throws ApiException {
    Object localVarPostBody = dialogflowConnection;
    
    // verify the required parameter 'connectionId' is set
    if (connectionId == null) {
      throw new ApiException(400, "Missing the required parameter 'connectionId' when calling updateDialogflowConnection");
    }
    
    // verify the required parameter 'dialogflowConnection' is set
    if (dialogflowConnection == null) {
      throw new ApiException(400, "Missing the required parameter 'dialogflowConnection' when calling updateDialogflowConnection");
    }
    
    // create path and map variables
    String localVarPath = "/dialogflow_connections/{connection_id}"
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

    GenericType<DialogflowConnectionResponse> localVarReturnType = new GenericType<DialogflowConnectionResponse>() {};

    return apiClient.invokeAPI("DialogflowIntegrationApi.updateDialogflowConnection", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
