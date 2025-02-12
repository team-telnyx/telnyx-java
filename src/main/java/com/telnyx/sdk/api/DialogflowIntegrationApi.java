package com.telnyx.sdk.api;

import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.Pair;
import com.telnyx.sdk.model.DialogflowConnection;
import com.telnyx.sdk.model.DialogflowConnectionResponse;
import com.telnyx.sdk.model.Errors;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.11.0"
)
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
   * @param connectionIdWireless Telnyx connection id (required)
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
    public DialogflowConnectionResponse createDialogflowConnection(
        String connectionIdWireless,
        DialogflowConnection dialogflowConnection
    ) throws ApiException {
        return createDialogflowConnectionWithHttpInfo(
            connectionIdWireless,
            dialogflowConnection
        ).getData();
    }

    /**
   * Create a Dialogflow Connection
   * Save Dialogflow Credentiails to Telnyx, so it can be used with other Telnyx services.
   * @param connectionIdWireless Telnyx connection id (required)
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
    public ApiResponse<
        DialogflowConnectionResponse
    > createDialogflowConnectionWithHttpInfo(
        String connectionIdWireless,
        DialogflowConnection dialogflowConnection
    ) throws ApiException {
        Object localVarPostBody = dialogflowConnection;

        // verify the required parameter 'connectionIdWireless' is set
        if (connectionIdWireless == null) {
            throw new ApiException(
                400,
                "Missing the required parameter 'connectionIdWireless' when calling createDialogflowConnection"
            );
        }

        // verify the required parameter 'dialogflowConnection' is set
        if (dialogflowConnection == null) {
            throw new ApiException(
                400,
                "Missing the required parameter 'dialogflowConnection' when calling createDialogflowConnection"
            );
        }

        // create path and map variables
        String localVarPath =
            "/dialogflow_connections/{connection_id_wireless}".replaceAll(
                    "\\{" + "connection_id_wireless" + "\\}",
                    apiClient.escapeString(connectionIdWireless.toString())
                );

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<
            String,
            String
        >();
        Map<String, String> localVarCookieParams = new HashMap<
            String,
            String
        >();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = { "application/json" };
        final String localVarAccept = apiClient.selectHeaderAccept(
            localVarAccepts
        );

        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = apiClient.selectHeaderContentType(
            localVarContentTypes
        );

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        GenericType<DialogflowConnectionResponse> localVarReturnType =
            new GenericType<DialogflowConnectionResponse>() {};

        return apiClient.invokeAPI(
            "DialogflowIntegrationApi.createDialogflowConnection",
            localVarPath,
            "POST",
            localVarQueryParams,
            localVarPostBody,
            localVarHeaderParams,
            localVarCookieParams,
            localVarFormParams,
            localVarAccept,
            localVarContentType,
            localVarAuthNames,
            localVarReturnType,
            false
        );
    }

    /**
   * Delete stored Dialogflow Connection
   * Deletes a stored Dialogflow Connection.
   * @param connectionIdWireless Telnyx connection id (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> The Dialogflow Connection for connection_id was deleted successfully. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
    public void deleteDialogflowConnection(String connectionIdWireless)
        throws ApiException {
        deleteDialogflowConnectionWithHttpInfo(connectionIdWireless);
    }

    /**
   * Delete stored Dialogflow Connection
   * Deletes a stored Dialogflow Connection.
   * @param connectionIdWireless Telnyx connection id (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> The Dialogflow Connection for connection_id was deleted successfully. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
    public ApiResponse<Void> deleteDialogflowConnectionWithHttpInfo(
        String connectionIdWireless
    ) throws ApiException {
        Object localVarPostBody = null;

        // verify the required parameter 'connectionIdWireless' is set
        if (connectionIdWireless == null) {
            throw new ApiException(
                400,
                "Missing the required parameter 'connectionIdWireless' when calling deleteDialogflowConnection"
            );
        }

        // create path and map variables
        String localVarPath =
            "/dialogflow_connections/{connection_id_wireless}".replaceAll(
                    "\\{" + "connection_id_wireless" + "\\}",
                    apiClient.escapeString(connectionIdWireless.toString())
                );

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<
            String,
            String
        >();
        Map<String, String> localVarCookieParams = new HashMap<
            String,
            String
        >();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = { "application/json" };
        final String localVarAccept = apiClient.selectHeaderAccept(
            localVarAccepts
        );

        final String[] localVarContentTypes = {};
        final String localVarContentType = apiClient.selectHeaderContentType(
            localVarContentTypes
        );

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        return apiClient.invokeAPI(
            "DialogflowIntegrationApi.deleteDialogflowConnection",
            localVarPath,
            "DELETE",
            localVarQueryParams,
            localVarPostBody,
            localVarHeaderParams,
            localVarCookieParams,
            localVarFormParams,
            localVarAccept,
            localVarContentType,
            localVarAuthNames,
            null,
            false
        );
    }

    /**
   * Retrieve stored Dialogflow Connection
   * Return details of the Dialogflow connection associated with the given CallControl connection.
   * @param connectionIdWireless Telnyx connection id (required)
   * @return DialogflowConnectionResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Return details of the Dialogflow connection associated with the given CallControl connection. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
    public DialogflowConnectionResponse getDialogflowConnection(
        String connectionIdWireless
    ) throws ApiException {
        return getDialogflowConnectionWithHttpInfo(
            connectionIdWireless
        ).getData();
    }

    /**
   * Retrieve stored Dialogflow Connection
   * Return details of the Dialogflow connection associated with the given CallControl connection.
   * @param connectionIdWireless Telnyx connection id (required)
   * @return ApiResponse&lt;DialogflowConnectionResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Return details of the Dialogflow connection associated with the given CallControl connection. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
    public ApiResponse<
        DialogflowConnectionResponse
    > getDialogflowConnectionWithHttpInfo(String connectionIdWireless)
        throws ApiException {
        Object localVarPostBody = null;

        // verify the required parameter 'connectionIdWireless' is set
        if (connectionIdWireless == null) {
            throw new ApiException(
                400,
                "Missing the required parameter 'connectionIdWireless' when calling getDialogflowConnection"
            );
        }

        // create path and map variables
        String localVarPath =
            "/dialogflow_connections/{connection_id_wireless}".replaceAll(
                    "\\{" + "connection_id_wireless" + "\\}",
                    apiClient.escapeString(connectionIdWireless.toString())
                );

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<
            String,
            String
        >();
        Map<String, String> localVarCookieParams = new HashMap<
            String,
            String
        >();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = { "application/json" };
        final String localVarAccept = apiClient.selectHeaderAccept(
            localVarAccepts
        );

        final String[] localVarContentTypes = {};
        final String localVarContentType = apiClient.selectHeaderContentType(
            localVarContentTypes
        );

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        GenericType<DialogflowConnectionResponse> localVarReturnType =
            new GenericType<DialogflowConnectionResponse>() {};

        return apiClient.invokeAPI(
            "DialogflowIntegrationApi.getDialogflowConnection",
            localVarPath,
            "GET",
            localVarQueryParams,
            localVarPostBody,
            localVarHeaderParams,
            localVarCookieParams,
            localVarFormParams,
            localVarAccept,
            localVarContentType,
            localVarAuthNames,
            localVarReturnType,
            false
        );
    }

    /**
   * Update stored Dialogflow Connection
   * Updates a stored Dialogflow Connection.
   * @param connectionIdWireless Telnyx connection id (required)
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
    public DialogflowConnectionResponse updateDialogflowConnection(
        String connectionIdWireless,
        DialogflowConnection dialogflowConnection
    ) throws ApiException {
        return updateDialogflowConnectionWithHttpInfo(
            connectionIdWireless,
            dialogflowConnection
        ).getData();
    }

    /**
   * Update stored Dialogflow Connection
   * Updates a stored Dialogflow Connection.
   * @param connectionIdWireless Telnyx connection id (required)
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
    public ApiResponse<
        DialogflowConnectionResponse
    > updateDialogflowConnectionWithHttpInfo(
        String connectionIdWireless,
        DialogflowConnection dialogflowConnection
    ) throws ApiException {
        Object localVarPostBody = dialogflowConnection;

        // verify the required parameter 'connectionIdWireless' is set
        if (connectionIdWireless == null) {
            throw new ApiException(
                400,
                "Missing the required parameter 'connectionIdWireless' when calling updateDialogflowConnection"
            );
        }

        // verify the required parameter 'dialogflowConnection' is set
        if (dialogflowConnection == null) {
            throw new ApiException(
                400,
                "Missing the required parameter 'dialogflowConnection' when calling updateDialogflowConnection"
            );
        }

        // create path and map variables
        String localVarPath =
            "/dialogflow_connections/{connection_id_wireless}".replaceAll(
                    "\\{" + "connection_id_wireless" + "\\}",
                    apiClient.escapeString(connectionIdWireless.toString())
                );

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<
            String,
            String
        >();
        Map<String, String> localVarCookieParams = new HashMap<
            String,
            String
        >();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = { "application/json" };
        final String localVarAccept = apiClient.selectHeaderAccept(
            localVarAccepts
        );

        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = apiClient.selectHeaderContentType(
            localVarContentTypes
        );

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        GenericType<DialogflowConnectionResponse> localVarReturnType =
            new GenericType<DialogflowConnectionResponse>() {};

        return apiClient.invokeAPI(
            "DialogflowIntegrationApi.updateDialogflowConnection",
            localVarPath,
            "PUT",
            localVarQueryParams,
            localVarPostBody,
            localVarHeaderParams,
            localVarCookieParams,
            localVarFormParams,
            localVarAccept,
            localVarContentType,
            localVarAuthNames,
            localVarReturnType,
            false
        );
    }
}
