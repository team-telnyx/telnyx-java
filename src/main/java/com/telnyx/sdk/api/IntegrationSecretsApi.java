package com.telnyx.sdk.api;

import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.Pair;
import com.telnyx.sdk.model.CreateIntegrationSecretRequest;
import com.telnyx.sdk.model.ErrorResponse;
import com.telnyx.sdk.model.IntegrationSecretCreatedResponse;
import com.telnyx.sdk.model.IntegrationSecretsListData;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.11.0"
)
public class IntegrationSecretsApi {

    private ApiClient apiClient;

    public IntegrationSecretsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public IntegrationSecretsApi(ApiClient apiClient) {
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
   * Create a secret
   * Create a new secret with an associated identifier that can be used to securely integrate with other services.
   * @param createIntegrationSecretRequest  (required)
   * @return IntegrationSecretCreatedResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
     </table>
   */
    public IntegrationSecretCreatedResponse createIntegrationSecret(
        CreateIntegrationSecretRequest createIntegrationSecretRequest
    ) throws ApiException {
        return createIntegrationSecretWithHttpInfo(
            createIntegrationSecretRequest
        ).getData();
    }

    /**
   * Create a secret
   * Create a new secret with an associated identifier that can be used to securely integrate with other services.
   * @param createIntegrationSecretRequest  (required)
   * @return ApiResponse&lt;IntegrationSecretCreatedResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
     </table>
   */
    public ApiResponse<
        IntegrationSecretCreatedResponse
    > createIntegrationSecretWithHttpInfo(
        CreateIntegrationSecretRequest createIntegrationSecretRequest
    ) throws ApiException {
        Object localVarPostBody = createIntegrationSecretRequest;

        // verify the required parameter 'createIntegrationSecretRequest' is set
        if (createIntegrationSecretRequest == null) {
            throw new ApiException(
                400,
                "Missing the required parameter 'createIntegrationSecretRequest' when calling createIntegrationSecret"
            );
        }

        // create path and map variables
        String localVarPath = "/integration_secrets";

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

        GenericType<IntegrationSecretCreatedResponse> localVarReturnType =
            new GenericType<IntegrationSecretCreatedResponse>() {};

        return apiClient.invokeAPI(
            "IntegrationSecretsApi.createIntegrationSecret",
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
   * Delete an integration secret
   * Delete an integration secret given its ID.
   * @param id  (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> The resource was deleted successfully. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Secret Not found </td><td>  -  </td></tr>
     </table>
   */
    public void deleteIntegrationSecret(String id) throws ApiException {
        deleteIntegrationSecretWithHttpInfo(id);
    }

    /**
   * Delete an integration secret
   * Delete an integration secret given its ID.
   * @param id  (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> The resource was deleted successfully. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Secret Not found </td><td>  -  </td></tr>
     </table>
   */
    public ApiResponse<Void> deleteIntegrationSecretWithHttpInfo(String id)
        throws ApiException {
        Object localVarPostBody = null;

        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException(
                400,
                "Missing the required parameter 'id' when calling deleteIntegrationSecret"
            );
        }

        // create path and map variables
        String localVarPath =
            "/integration_secrets/{id}".replaceAll(
                    "\\{" + "id" + "\\}",
                    apiClient.escapeString(id.toString())
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
            "IntegrationSecretsApi.deleteIntegrationSecret",
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
   * List integration secrets
   * Retrieve a list of all integration secrets configured by the user.
   * @return IntegrationSecretsListData
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
    public IntegrationSecretsListData listIntegrationSecrets()
        throws ApiException {
        return listIntegrationSecretsWithHttpInfo().getData();
    }

    /**
   * List integration secrets
   * Retrieve a list of all integration secrets configured by the user.
   * @return ApiResponse&lt;IntegrationSecretsListData&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
    public ApiResponse<
        IntegrationSecretsListData
    > listIntegrationSecretsWithHttpInfo() throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/integration_secrets";

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

        GenericType<IntegrationSecretsListData> localVarReturnType =
            new GenericType<IntegrationSecretsListData>() {};

        return apiClient.invokeAPI(
            "IntegrationSecretsApi.listIntegrationSecrets",
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
}
