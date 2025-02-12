package com.telnyx.sdk.api;

import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.Pair;
import com.telnyx.sdk.model.Errors;
import com.telnyx.sdk.model.GetBulkSIMCardAction200Response;
import com.telnyx.sdk.model.GetSimCardAction200Response;
import com.telnyx.sdk.model.ListBulkSIMCardActions200Response;
import com.telnyx.sdk.model.ListSimCardActions200Response;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import javax.ws.rs.core.GenericType;

@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.11.0"
)
public class SimCardActionsApi {

    private ApiClient apiClient;

    public SimCardActionsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public SimCardActionsApi(ApiClient apiClient) {
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
   * Get bulk SIM card action details
   * This API fetches information about a bulk SIM card action. A bulk SIM card action contains details about a collection of individual SIM card actions.
   * @param id Identifies the resource. (required)
   * @return GetBulkSIMCardAction200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
    public GetBulkSIMCardAction200Response getBulkSIMCardAction(UUID id)
        throws ApiException {
        return getBulkSIMCardActionWithHttpInfo(id).getData();
    }

    /**
   * Get bulk SIM card action details
   * This API fetches information about a bulk SIM card action. A bulk SIM card action contains details about a collection of individual SIM card actions.
   * @param id Identifies the resource. (required)
   * @return ApiResponse&lt;GetBulkSIMCardAction200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
    public ApiResponse<
        GetBulkSIMCardAction200Response
    > getBulkSIMCardActionWithHttpInfo(UUID id) throws ApiException {
        Object localVarPostBody = null;

        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException(
                400,
                "Missing the required parameter 'id' when calling getBulkSIMCardAction"
            );
        }

        // create path and map variables
        String localVarPath =
            "/bulk_sim_card_actions/{id}".replaceAll(
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

        GenericType<GetBulkSIMCardAction200Response> localVarReturnType =
            new GenericType<GetBulkSIMCardAction200Response>() {};

        return apiClient.invokeAPI(
            "SimCardActionsApi.getBulkSIMCardAction",
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
   * Get SIM card action details
   * This API fetches detailed information about a SIM card action to follow-up on an existing asynchronous operation.
   * @param id Identifies the resource. (required)
   * @return GetSimCardAction200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
    public GetSimCardAction200Response getSimCardAction(UUID id)
        throws ApiException {
        return getSimCardActionWithHttpInfo(id).getData();
    }

    /**
   * Get SIM card action details
   * This API fetches detailed information about a SIM card action to follow-up on an existing asynchronous operation.
   * @param id Identifies the resource. (required)
   * @return ApiResponse&lt;GetSimCardAction200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
    public ApiResponse<
        GetSimCardAction200Response
    > getSimCardActionWithHttpInfo(UUID id) throws ApiException {
        Object localVarPostBody = null;

        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException(
                400,
                "Missing the required parameter 'id' when calling getSimCardAction"
            );
        }

        // create path and map variables
        String localVarPath =
            "/sim_card_actions/{id}".replaceAll(
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

        GenericType<GetSimCardAction200Response> localVarReturnType =
            new GenericType<GetSimCardAction200Response>() {};

        return apiClient.invokeAPI(
            "SimCardActionsApi.getSimCardAction",
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
   * List bulk SIM card actions
   * This API lists a paginated collection of bulk SIM card actions. A bulk SIM card action contains details about a collection of individual SIM card actions.
   * @param pageNumber The page number to load (optional, default to 1)
   * @param pageSize The size of the page (optional, default to 20)
   * @param filterActionType Filter by action type. (optional)
   * @return ListBulkSIMCardActions200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
    public ListBulkSIMCardActions200Response listBulkSIMCardActions(
        Integer pageNumber,
        Integer pageSize,
        String filterActionType
    ) throws ApiException {
        return listBulkSIMCardActionsWithHttpInfo(
            pageNumber,
            pageSize,
            filterActionType
        ).getData();
    }

    /**
   * List bulk SIM card actions
   * This API lists a paginated collection of bulk SIM card actions. A bulk SIM card action contains details about a collection of individual SIM card actions.
   * @param pageNumber The page number to load (optional, default to 1)
   * @param pageSize The size of the page (optional, default to 20)
   * @param filterActionType Filter by action type. (optional)
   * @return ApiResponse&lt;ListBulkSIMCardActions200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
    public ApiResponse<
        ListBulkSIMCardActions200Response
    > listBulkSIMCardActionsWithHttpInfo(
        Integer pageNumber,
        Integer pageSize,
        String filterActionType
    ) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/bulk_sim_card_actions";

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

        localVarQueryParams.addAll(
            apiClient.parameterToPairs("", "page[number]", pageNumber)
        );
        localVarQueryParams.addAll(
            apiClient.parameterToPairs("", "page[size]", pageSize)
        );
        localVarQueryParams.addAll(
            apiClient.parameterToPairs(
                "",
                "filter[action_type]",
                filterActionType
            )
        );

        final String[] localVarAccepts = { "application/json" };
        final String localVarAccept = apiClient.selectHeaderAccept(
            localVarAccepts
        );

        final String[] localVarContentTypes = {};
        final String localVarContentType = apiClient.selectHeaderContentType(
            localVarContentTypes
        );

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        GenericType<ListBulkSIMCardActions200Response> localVarReturnType =
            new GenericType<ListBulkSIMCardActions200Response>() {};

        return apiClient.invokeAPI(
            "SimCardActionsApi.listBulkSIMCardActions",
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
   * List SIM card actions
   * This API lists a paginated collection of SIM card actions. It enables exploring a collection of existing asynchronous operations using specific filters.
   * @param pageNumber The page number to load (optional, default to 1)
   * @param pageSize The size of the page (optional, default to 20)
   * @param filterSimCardId A valid SIM card ID. (optional)
   * @param filterStatus Filter by a specific status of the resource&#39;s lifecycle. (optional)
   * @param filterBulkSimCardActionId Filter by a bulk SIM card action ID. (optional)
   * @param filterActionType Filter by action type. (optional)
   * @return ListSimCardActions200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
    public ListSimCardActions200Response listSimCardActions(
        Integer pageNumber,
        Integer pageSize,
        UUID filterSimCardId,
        String filterStatus,
        UUID filterBulkSimCardActionId,
        String filterActionType
    ) throws ApiException {
        return listSimCardActionsWithHttpInfo(
            pageNumber,
            pageSize,
            filterSimCardId,
            filterStatus,
            filterBulkSimCardActionId,
            filterActionType
        ).getData();
    }

    /**
   * List SIM card actions
   * This API lists a paginated collection of SIM card actions. It enables exploring a collection of existing asynchronous operations using specific filters.
   * @param pageNumber The page number to load (optional, default to 1)
   * @param pageSize The size of the page (optional, default to 20)
   * @param filterSimCardId A valid SIM card ID. (optional)
   * @param filterStatus Filter by a specific status of the resource&#39;s lifecycle. (optional)
   * @param filterBulkSimCardActionId Filter by a bulk SIM card action ID. (optional)
   * @param filterActionType Filter by action type. (optional)
   * @return ApiResponse&lt;ListSimCardActions200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
    public ApiResponse<
        ListSimCardActions200Response
    > listSimCardActionsWithHttpInfo(
        Integer pageNumber,
        Integer pageSize,
        UUID filterSimCardId,
        String filterStatus,
        UUID filterBulkSimCardActionId,
        String filterActionType
    ) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/sim_card_actions";

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

        localVarQueryParams.addAll(
            apiClient.parameterToPairs("", "page[number]", pageNumber)
        );
        localVarQueryParams.addAll(
            apiClient.parameterToPairs("", "page[size]", pageSize)
        );
        localVarQueryParams.addAll(
            apiClient.parameterToPairs(
                "",
                "filter[sim_card_id]",
                filterSimCardId
            )
        );
        localVarQueryParams.addAll(
            apiClient.parameterToPairs("", "filter[status]", filterStatus)
        );
        localVarQueryParams.addAll(
            apiClient.parameterToPairs(
                "",
                "filter[bulk_sim_card_action_id]",
                filterBulkSimCardActionId
            )
        );
        localVarQueryParams.addAll(
            apiClient.parameterToPairs(
                "",
                "filter[action_type]",
                filterActionType
            )
        );

        final String[] localVarAccepts = { "application/json" };
        final String localVarAccept = apiClient.selectHeaderAccept(
            localVarAccepts
        );

        final String[] localVarContentTypes = {};
        final String localVarContentType = apiClient.selectHeaderContentType(
            localVarContentTypes
        );

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        GenericType<ListSimCardActions200Response> localVarReturnType =
            new GenericType<ListSimCardActions200Response>() {};

        return apiClient.invokeAPI(
            "SimCardActionsApi.listSimCardActions",
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
