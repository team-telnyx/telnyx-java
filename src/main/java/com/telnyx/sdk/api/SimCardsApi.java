package com.telnyx.sdk.api;

import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.Pair;
import com.telnyx.sdk.model.ESimPurchase;
import com.telnyx.sdk.model.Error;
import com.telnyx.sdk.model.Errors;
import com.telnyx.sdk.model.GetSimCard200Response;
import com.telnyx.sdk.model.GetSimCardAction200Response;
import com.telnyx.sdk.model.GetSimCardActivationCode200Response;
import com.telnyx.sdk.model.GetSimCardDeviceDetails200Response;
import com.telnyx.sdk.model.GetSimCardPublicIp200Response;
import com.telnyx.sdk.model.GetSimCards200Response;
import com.telnyx.sdk.model.GetWirelessConnectivityLogs200Response;
import com.telnyx.sdk.model.ListDataUsageNotifications200Response;
import com.telnyx.sdk.model.PostSimCardDataUsageNotification201Response;
import com.telnyx.sdk.model.PostSimCardDataUsageNotificationRequest;
import com.telnyx.sdk.model.PurchaseESim202Response;
import com.telnyx.sdk.model.SIMCard;
import com.telnyx.sdk.model.SIMCardRegistration;
import com.telnyx.sdk.model.SIMCardRegistrationCodeValidations;
import com.telnyx.sdk.model.SetPublicIPsBulk202Response;
import com.telnyx.sdk.model.SetPublicIPsBulkRequest;
import com.telnyx.sdk.model.SimCardDataUsageNotification;
import com.telnyx.sdk.model.ValidateRegistrationCodesRequest;
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
public class SimCardsApi {

    private ApiClient apiClient;

    public SimCardsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public SimCardsApi(ApiClient apiClient) {
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
   * Deletes a SIM card
   * The SIM card will be decommissioned, removed from your account and you will stop being charged.&lt;br /&gt;The SIM card won&#39;t be able to connect to the network after the deletion is completed, thus making it impossible to consume data.&lt;br/&gt; Transitioning to the disabled state may take a period of time. Until the transition is completed, the SIM card status will be disabling &lt;code&gt;disabling&lt;/code&gt;.&lt;br /&gt;In order to re-enable the SIM card, you will need to re-register it.
   * @param id Identifies the SIM. (required)
   * @return GetSimCard200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
    public GetSimCard200Response deleteSimCard(UUID id) throws ApiException {
        return deleteSimCardWithHttpInfo(id).getData();
    }

    /**
   * Deletes a SIM card
   * The SIM card will be decommissioned, removed from your account and you will stop being charged.&lt;br /&gt;The SIM card won&#39;t be able to connect to the network after the deletion is completed, thus making it impossible to consume data.&lt;br/&gt; Transitioning to the disabled state may take a period of time. Until the transition is completed, the SIM card status will be disabling &lt;code&gt;disabling&lt;/code&gt;.&lt;br /&gt;In order to re-enable the SIM card, you will need to re-register it.
   * @param id Identifies the SIM. (required)
   * @return ApiResponse&lt;GetSimCard200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
    public ApiResponse<GetSimCard200Response> deleteSimCardWithHttpInfo(
        UUID id
    ) throws ApiException {
        Object localVarPostBody = null;

        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException(
                400,
                "Missing the required parameter 'id' when calling deleteSimCard"
            );
        }

        // create path and map variables
        String localVarPath =
            "/sim_cards/{id}".replaceAll(
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

        GenericType<GetSimCard200Response> localVarReturnType = new GenericType<
            GetSimCard200Response
        >() {};

        return apiClient.invokeAPI(
            "SimCardsApi.deleteSimCard",
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
            localVarReturnType,
            false
        );
    }

    /**
   * Delete SIM card data usage notifications
   * Delete the SIM Card Data Usage Notification.
   * @param id Identifies the resource. (required)
   * @return PostSimCardDataUsageNotification201Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
    public PostSimCardDataUsageNotification201Response deleteSimCardDataUsageNotifications(
        UUID id
    ) throws ApiException {
        return deleteSimCardDataUsageNotificationsWithHttpInfo(id).getData();
    }

    /**
   * Delete SIM card data usage notifications
   * Delete the SIM Card Data Usage Notification.
   * @param id Identifies the resource. (required)
   * @return ApiResponse&lt;PostSimCardDataUsageNotification201Response&gt;
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
        PostSimCardDataUsageNotification201Response
    > deleteSimCardDataUsageNotificationsWithHttpInfo(UUID id)
        throws ApiException {
        Object localVarPostBody = null;

        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException(
                400,
                "Missing the required parameter 'id' when calling deleteSimCardDataUsageNotifications"
            );
        }

        // create path and map variables
        String localVarPath =
            "/sim_card_data_usage_notifications/{id}".replaceAll(
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

        GenericType<
            PostSimCardDataUsageNotification201Response
        > localVarReturnType = new GenericType<
            PostSimCardDataUsageNotification201Response
        >() {};

        return apiClient.invokeAPI(
            "SimCardsApi.deleteSimCardDataUsageNotifications",
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
            localVarReturnType,
            false
        );
    }

    /**
   * Request a SIM card disable
   * This API disables a SIM card, disconnecting it from the network and making it impossible to consume data.&lt;br/&gt; The API will trigger an asynchronous operation called a SIM Card Action. Transitioning to the disabled state may take a period of time. The status of the SIM Card Action can be followed through the [List SIM Card Action](https://developersdev.telnyx.com/docs/api/v2/wireless/SIM-Card-Actions#ListSIMCardActions) API. 
   * @param id Identifies the SIM. (required)
   * @return GetSimCardAction200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 202 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
    public GetSimCardAction200Response disableSimCard(UUID id)
        throws ApiException {
        return disableSimCardWithHttpInfo(id).getData();
    }

    /**
   * Request a SIM card disable
   * This API disables a SIM card, disconnecting it from the network and making it impossible to consume data.&lt;br/&gt; The API will trigger an asynchronous operation called a SIM Card Action. Transitioning to the disabled state may take a period of time. The status of the SIM Card Action can be followed through the [List SIM Card Action](https://developersdev.telnyx.com/docs/api/v2/wireless/SIM-Card-Actions#ListSIMCardActions) API. 
   * @param id Identifies the SIM. (required)
   * @return ApiResponse&lt;GetSimCardAction200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 202 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
    public ApiResponse<GetSimCardAction200Response> disableSimCardWithHttpInfo(
        UUID id
    ) throws ApiException {
        Object localVarPostBody = null;

        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException(
                400,
                "Missing the required parameter 'id' when calling disableSimCard"
            );
        }

        // create path and map variables
        String localVarPath =
            "/sim_cards/{id}/actions/disable".replaceAll(
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
            "SimCardsApi.disableSimCard",
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
   * Request a SIM card enable
   * This API enables a SIM card, connecting it to the network and making it possible to consume data.&lt;br/&gt; To enable a SIM card, it must be associated with a SIM card group.&lt;br/&gt; The API will trigger an asynchronous operation called a SIM Card Action. Transitioning to the enabled state may take a period of time. The status of the SIM Card Action can be followed through the [List SIM Card Action](https://developersdev.telnyx.com/docs/api/v2/wireless/SIM-Card-Actions#ListSIMCardActions) API. 
   * @param id Identifies the SIM. (required)
   * @return GetSimCardAction200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 202 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check the &#39;detail&#39; field in response for details. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
    public GetSimCardAction200Response enableSimCard(UUID id)
        throws ApiException {
        return enableSimCardWithHttpInfo(id).getData();
    }

    /**
   * Request a SIM card enable
   * This API enables a SIM card, connecting it to the network and making it possible to consume data.&lt;br/&gt; To enable a SIM card, it must be associated with a SIM card group.&lt;br/&gt; The API will trigger an asynchronous operation called a SIM Card Action. Transitioning to the enabled state may take a period of time. The status of the SIM Card Action can be followed through the [List SIM Card Action](https://developersdev.telnyx.com/docs/api/v2/wireless/SIM-Card-Actions#ListSIMCardActions) API. 
   * @param id Identifies the SIM. (required)
   * @return ApiResponse&lt;GetSimCardAction200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 202 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check the &#39;detail&#39; field in response for details. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
    public ApiResponse<GetSimCardAction200Response> enableSimCardWithHttpInfo(
        UUID id
    ) throws ApiException {
        Object localVarPostBody = null;

        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException(
                400,
                "Missing the required parameter 'id' when calling enableSimCard"
            );
        }

        // create path and map variables
        String localVarPath =
            "/sim_cards/{id}/actions/enable".replaceAll(
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
            "SimCardsApi.enableSimCard",
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
   * Get SIM card
   * Returns the details regarding a specific SIM card.
   * @param id Identifies the SIM. (required)
   * @param includeSimCardGroup It includes the associated SIM card group object in the response when present. (optional, default to false)
   * @return GetSimCard200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
    public GetSimCard200Response getSimCard(
        UUID id,
        Boolean includeSimCardGroup
    ) throws ApiException {
        return getSimCardWithHttpInfo(id, includeSimCardGroup).getData();
    }

    /**
   * Get SIM card
   * Returns the details regarding a specific SIM card.
   * @param id Identifies the SIM. (required)
   * @param includeSimCardGroup It includes the associated SIM card group object in the response when present. (optional, default to false)
   * @return ApiResponse&lt;GetSimCard200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
    public ApiResponse<GetSimCard200Response> getSimCardWithHttpInfo(
        UUID id,
        Boolean includeSimCardGroup
    ) throws ApiException {
        Object localVarPostBody = null;

        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException(
                400,
                "Missing the required parameter 'id' when calling getSimCard"
            );
        }

        // create path and map variables
        String localVarPath =
            "/sim_cards/{id}".replaceAll(
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

        localVarQueryParams.addAll(
            apiClient.parameterToPairs(
                "",
                "include_sim_card_group",
                includeSimCardGroup
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

        GenericType<GetSimCard200Response> localVarReturnType = new GenericType<
            GetSimCard200Response
        >() {};

        return apiClient.invokeAPI(
            "SimCardsApi.getSimCard",
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
   * Get activation code for an eSIM
   * It returns the activation code for an eSIM.&lt;br/&gt;&lt;br/&gt;  This API is only available for eSIMs. If the given SIM is a physical SIM card, or has already been installed, an error will be returned. 
   * @param id Identifies the SIM. (required)
   * @return GetSimCardActivationCode200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
    public GetSimCardActivationCode200Response getSimCardActivationCode(
        UUID id
    ) throws ApiException {
        return getSimCardActivationCodeWithHttpInfo(id).getData();
    }

    /**
   * Get activation code for an eSIM
   * It returns the activation code for an eSIM.&lt;br/&gt;&lt;br/&gt;  This API is only available for eSIMs. If the given SIM is a physical SIM card, or has already been installed, an error will be returned. 
   * @param id Identifies the SIM. (required)
   * @return ApiResponse&lt;GetSimCardActivationCode200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
    public ApiResponse<
        GetSimCardActivationCode200Response
    > getSimCardActivationCodeWithHttpInfo(UUID id) throws ApiException {
        Object localVarPostBody = null;

        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException(
                400,
                "Missing the required parameter 'id' when calling getSimCardActivationCode"
            );
        }

        // create path and map variables
        String localVarPath =
            "/sim_cards/{id}/activation_code".replaceAll(
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

        GenericType<GetSimCardActivationCode200Response> localVarReturnType =
            new GenericType<GetSimCardActivationCode200Response>() {};

        return apiClient.invokeAPI(
            "SimCardsApi.getSimCardActivationCode",
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
   * Get a single SIM card data usage notification
   * Get a single SIM Card Data Usage Notification.
   * @param id Identifies the resource. (required)
   * @return PostSimCardDataUsageNotification201Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
    public PostSimCardDataUsageNotification201Response getSimCardDataUsageNotification(
        UUID id
    ) throws ApiException {
        return getSimCardDataUsageNotificationWithHttpInfo(id).getData();
    }

    /**
   * Get a single SIM card data usage notification
   * Get a single SIM Card Data Usage Notification.
   * @param id Identifies the resource. (required)
   * @return ApiResponse&lt;PostSimCardDataUsageNotification201Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
    public ApiResponse<
        PostSimCardDataUsageNotification201Response
    > getSimCardDataUsageNotificationWithHttpInfo(UUID id) throws ApiException {
        Object localVarPostBody = null;

        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException(
                400,
                "Missing the required parameter 'id' when calling getSimCardDataUsageNotification"
            );
        }

        // create path and map variables
        String localVarPath =
            "/sim_card_data_usage_notifications/{id}".replaceAll(
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

        GenericType<
            PostSimCardDataUsageNotification201Response
        > localVarReturnType = new GenericType<
            PostSimCardDataUsageNotification201Response
        >() {};

        return apiClient.invokeAPI(
            "SimCardsApi.getSimCardDataUsageNotification",
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
   * Get SIM card device details
   * It returns the device details where a SIM card is currently being used. 
   * @param id Identifies the SIM. (required)
   * @return GetSimCardDeviceDetails200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
    public GetSimCardDeviceDetails200Response getSimCardDeviceDetails(UUID id)
        throws ApiException {
        return getSimCardDeviceDetailsWithHttpInfo(id).getData();
    }

    /**
   * Get SIM card device details
   * It returns the device details where a SIM card is currently being used. 
   * @param id Identifies the SIM. (required)
   * @return ApiResponse&lt;GetSimCardDeviceDetails200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
    public ApiResponse<
        GetSimCardDeviceDetails200Response
    > getSimCardDeviceDetailsWithHttpInfo(UUID id) throws ApiException {
        Object localVarPostBody = null;

        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException(
                400,
                "Missing the required parameter 'id' when calling getSimCardDeviceDetails"
            );
        }

        // create path and map variables
        String localVarPath =
            "/sim_cards/{id}/device_details".replaceAll(
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

        GenericType<GetSimCardDeviceDetails200Response> localVarReturnType =
            new GenericType<GetSimCardDeviceDetails200Response>() {};

        return apiClient.invokeAPI(
            "SimCardsApi.getSimCardDeviceDetails",
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
   * Get SIM card public IP definition
   * It returns the public IP requested for a SIM card. 
   * @param id Identifies the SIM. (required)
   * @return GetSimCardPublicIp200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
    public GetSimCardPublicIp200Response getSimCardPublicIp(UUID id)
        throws ApiException {
        return getSimCardPublicIpWithHttpInfo(id).getData();
    }

    /**
   * Get SIM card public IP definition
   * It returns the public IP requested for a SIM card. 
   * @param id Identifies the SIM. (required)
   * @return ApiResponse&lt;GetSimCardPublicIp200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
    public ApiResponse<
        GetSimCardPublicIp200Response
    > getSimCardPublicIpWithHttpInfo(UUID id) throws ApiException {
        Object localVarPostBody = null;

        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException(
                400,
                "Missing the required parameter 'id' when calling getSimCardPublicIp"
            );
        }

        // create path and map variables
        String localVarPath =
            "/sim_cards/{id}/public_ip".replaceAll(
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

        GenericType<GetSimCardPublicIp200Response> localVarReturnType =
            new GenericType<GetSimCardPublicIp200Response>() {};

        return apiClient.invokeAPI(
            "SimCardsApi.getSimCardPublicIp",
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
   * Get all SIM cards
   * Get all SIM cards belonging to the user that match the given filters.
   * @param pageNumber The page number to load (optional, default to 1)
   * @param pageSize The size of the page (optional, default to 20)
   * @param includeSimCardGroup It includes the associated SIM card group object in the response when present. (optional, default to false)
   * @param filterSimCardGroupId A valid SIM card group ID. (optional)
   * @param filterTags A list of SIM card tags to filter on.&lt;br/&gt;&lt;br/&gt;  If the SIM card contains &lt;b&gt;&lt;i&gt;all&lt;/i&gt;&lt;/b&gt; of the given &lt;code&gt;tags&lt;/code&gt; they will be found.&lt;br/&gt;&lt;br/&gt; For example, if the SIM cards have the following tags: &lt;ul&gt;   &lt;li&gt;&lt;code&gt;[&#39;customers&#39;, &#39;staff&#39;, &#39;test&#39;]&lt;/code&gt;   &lt;li&gt;&lt;code&gt;[&#39;test&#39;]&lt;/code&gt;&lt;/li&gt;   &lt;li&gt;&lt;code&gt;[&#39;customers&#39;]&lt;/code&gt;&lt;/li&gt; &lt;/ul&gt; Searching for &lt;code&gt;[&#39;customers&#39;, &#39;test&#39;]&lt;/code&gt; returns only the first because it&#39;s the only one with both tags.&lt;br/&gt; Searching for &lt;code&gt;test&lt;/code&gt; returns the first two SIMs, because both of them have such tag.&lt;br/&gt; Searching for &lt;code&gt;customers&lt;/code&gt; returns the first and last SIMs.&lt;br/&gt;  (optional)
   * @param filterIccid A search string to partially match for the SIM card&#39;s ICCID. (optional)
   * @param filterStatus Filter by a SIM card&#39;s status. (optional)
   * @param sort Sorts SIM cards by the given field. Defaults to ascending order unless field is prefixed with a minus sign. (optional)
   * @return GetSimCards200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
    public GetSimCards200Response getSimCards(
        Integer pageNumber,
        Integer pageSize,
        Boolean includeSimCardGroup,
        UUID filterSimCardGroupId,
        List<String> filterTags,
        String filterIccid,
        List<String> filterStatus,
        String sort
    ) throws ApiException {
        return getSimCardsWithHttpInfo(
            pageNumber,
            pageSize,
            includeSimCardGroup,
            filterSimCardGroupId,
            filterTags,
            filterIccid,
            filterStatus,
            sort
        ).getData();
    }

    /**
   * Get all SIM cards
   * Get all SIM cards belonging to the user that match the given filters.
   * @param pageNumber The page number to load (optional, default to 1)
   * @param pageSize The size of the page (optional, default to 20)
   * @param includeSimCardGroup It includes the associated SIM card group object in the response when present. (optional, default to false)
   * @param filterSimCardGroupId A valid SIM card group ID. (optional)
   * @param filterTags A list of SIM card tags to filter on.&lt;br/&gt;&lt;br/&gt;  If the SIM card contains &lt;b&gt;&lt;i&gt;all&lt;/i&gt;&lt;/b&gt; of the given &lt;code&gt;tags&lt;/code&gt; they will be found.&lt;br/&gt;&lt;br/&gt; For example, if the SIM cards have the following tags: &lt;ul&gt;   &lt;li&gt;&lt;code&gt;[&#39;customers&#39;, &#39;staff&#39;, &#39;test&#39;]&lt;/code&gt;   &lt;li&gt;&lt;code&gt;[&#39;test&#39;]&lt;/code&gt;&lt;/li&gt;   &lt;li&gt;&lt;code&gt;[&#39;customers&#39;]&lt;/code&gt;&lt;/li&gt; &lt;/ul&gt; Searching for &lt;code&gt;[&#39;customers&#39;, &#39;test&#39;]&lt;/code&gt; returns only the first because it&#39;s the only one with both tags.&lt;br/&gt; Searching for &lt;code&gt;test&lt;/code&gt; returns the first two SIMs, because both of them have such tag.&lt;br/&gt; Searching for &lt;code&gt;customers&lt;/code&gt; returns the first and last SIMs.&lt;br/&gt;  (optional)
   * @param filterIccid A search string to partially match for the SIM card&#39;s ICCID. (optional)
   * @param filterStatus Filter by a SIM card&#39;s status. (optional)
   * @param sort Sorts SIM cards by the given field. Defaults to ascending order unless field is prefixed with a minus sign. (optional)
   * @return ApiResponse&lt;GetSimCards200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
    public ApiResponse<GetSimCards200Response> getSimCardsWithHttpInfo(
        Integer pageNumber,
        Integer pageSize,
        Boolean includeSimCardGroup,
        UUID filterSimCardGroupId,
        List<String> filterTags,
        String filterIccid,
        List<String> filterStatus,
        String sort
    ) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/sim_cards";

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
                "include_sim_card_group",
                includeSimCardGroup
            )
        );
        localVarQueryParams.addAll(
            apiClient.parameterToPairs(
                "",
                "filter[sim_card_group_id]",
                filterSimCardGroupId
            )
        );
        localVarQueryParams.addAll(
            apiClient.parameterToPairs("multi", "filter[tags]", filterTags)
        );
        localVarQueryParams.addAll(
            apiClient.parameterToPairs("", "filter[iccid]", filterIccid)
        );
        localVarQueryParams.addAll(
            apiClient.parameterToPairs("multi", "filter[status]", filterStatus)
        );
        localVarQueryParams.addAll(
            apiClient.parameterToPairs("", "sort", sort)
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

        GenericType<GetSimCards200Response> localVarReturnType =
            new GenericType<GetSimCards200Response>() {};

        return apiClient.invokeAPI(
            "SimCardsApi.getSimCards",
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
   * List wireless connectivity logs
   * This API allows listing a paginated collection of Wireless Connectivity Logs associated with a SIM Card, for troubleshooting purposes.
   * @param id Identifies the SIM. (required)
   * @param pageNumber The page number to load (optional, default to 1)
   * @param pageSize The size of the page (optional, default to 20)
   * @return GetWirelessConnectivityLogs200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
    public GetWirelessConnectivityLogs200Response getWirelessConnectivityLogs(
        UUID id,
        Integer pageNumber,
        Integer pageSize
    ) throws ApiException {
        return getWirelessConnectivityLogsWithHttpInfo(
            id,
            pageNumber,
            pageSize
        ).getData();
    }

    /**
   * List wireless connectivity logs
   * This API allows listing a paginated collection of Wireless Connectivity Logs associated with a SIM Card, for troubleshooting purposes.
   * @param id Identifies the SIM. (required)
   * @param pageNumber The page number to load (optional, default to 1)
   * @param pageSize The size of the page (optional, default to 20)
   * @return ApiResponse&lt;GetWirelessConnectivityLogs200Response&gt;
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
        GetWirelessConnectivityLogs200Response
    > getWirelessConnectivityLogsWithHttpInfo(
        UUID id,
        Integer pageNumber,
        Integer pageSize
    ) throws ApiException {
        Object localVarPostBody = null;

        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException(
                400,
                "Missing the required parameter 'id' when calling getWirelessConnectivityLogs"
            );
        }

        // create path and map variables
        String localVarPath =
            "/sim_cards/{id}/wireless_connectivity_logs".replaceAll(
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

        localVarQueryParams.addAll(
            apiClient.parameterToPairs("", "page[number]", pageNumber)
        );
        localVarQueryParams.addAll(
            apiClient.parameterToPairs("", "page[size]", pageSize)
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

        GenericType<GetWirelessConnectivityLogs200Response> localVarReturnType =
            new GenericType<GetWirelessConnectivityLogs200Response>() {};

        return apiClient.invokeAPI(
            "SimCardsApi.getWirelessConnectivityLogs",
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
   * List SIM card data usage notifications
   * Lists a paginated collection of SIM card data usage notifications. It enables exploring the collection using specific filters.
   * @param pageNumber The page number to load (optional, default to 1)
   * @param pageSize The size of the page (optional, default to 20)
   * @param filterSimCardId A valid SIM card ID. (optional)
   * @return ListDataUsageNotifications200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
    public ListDataUsageNotifications200Response listDataUsageNotifications(
        Integer pageNumber,
        Integer pageSize,
        UUID filterSimCardId
    ) throws ApiException {
        return listDataUsageNotificationsWithHttpInfo(
            pageNumber,
            pageSize,
            filterSimCardId
        ).getData();
    }

    /**
   * List SIM card data usage notifications
   * Lists a paginated collection of SIM card data usage notifications. It enables exploring the collection using specific filters.
   * @param pageNumber The page number to load (optional, default to 1)
   * @param pageSize The size of the page (optional, default to 20)
   * @param filterSimCardId A valid SIM card ID. (optional)
   * @return ApiResponse&lt;ListDataUsageNotifications200Response&gt;
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
        ListDataUsageNotifications200Response
    > listDataUsageNotificationsWithHttpInfo(
        Integer pageNumber,
        Integer pageSize,
        UUID filterSimCardId
    ) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/sim_card_data_usage_notifications";

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

        final String[] localVarAccepts = { "application/json" };
        final String localVarAccept = apiClient.selectHeaderAccept(
            localVarAccepts
        );

        final String[] localVarContentTypes = {};
        final String localVarContentType = apiClient.selectHeaderContentType(
            localVarContentTypes
        );

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        GenericType<ListDataUsageNotifications200Response> localVarReturnType =
            new GenericType<ListDataUsageNotifications200Response>() {};

        return apiClient.invokeAPI(
            "SimCardsApi.listDataUsageNotifications",
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
   * Updates information for a SIM Card Data Usage Notification
   * Updates information for a SIM Card Data Usage Notification.
   * @param id Identifies the resource. (required)
   * @param simCardDataUsageNotification  (required)
   * @return PostSimCardDataUsageNotification201Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
    public PostSimCardDataUsageNotification201Response patchSimCardDataUsageNotification(
        UUID id,
        SimCardDataUsageNotification simCardDataUsageNotification
    ) throws ApiException {
        return patchSimCardDataUsageNotificationWithHttpInfo(
            id,
            simCardDataUsageNotification
        ).getData();
    }

    /**
   * Updates information for a SIM Card Data Usage Notification
   * Updates information for a SIM Card Data Usage Notification.
   * @param id Identifies the resource. (required)
   * @param simCardDataUsageNotification  (required)
   * @return ApiResponse&lt;PostSimCardDataUsageNotification201Response&gt;
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
        PostSimCardDataUsageNotification201Response
    > patchSimCardDataUsageNotificationWithHttpInfo(
        UUID id,
        SimCardDataUsageNotification simCardDataUsageNotification
    ) throws ApiException {
        Object localVarPostBody = simCardDataUsageNotification;

        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException(
                400,
                "Missing the required parameter 'id' when calling patchSimCardDataUsageNotification"
            );
        }

        // verify the required parameter 'simCardDataUsageNotification' is set
        if (simCardDataUsageNotification == null) {
            throw new ApiException(
                400,
                "Missing the required parameter 'simCardDataUsageNotification' when calling patchSimCardDataUsageNotification"
            );
        }

        // create path and map variables
        String localVarPath =
            "/sim_card_data_usage_notifications/{id}".replaceAll(
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

        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = apiClient.selectHeaderContentType(
            localVarContentTypes
        );

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        GenericType<
            PostSimCardDataUsageNotification201Response
        > localVarReturnType = new GenericType<
            PostSimCardDataUsageNotification201Response
        >() {};

        return apiClient.invokeAPI(
            "SimCardsApi.patchSimCardDataUsageNotification",
            localVarPath,
            "PATCH",
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
   * Create a new SIM card data usage notification
   * Creates a new SIM card data usage notification.
   * @param postSimCardDataUsageNotificationRequest  (required)
   * @return PostSimCardDataUsageNotification201Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
    public PostSimCardDataUsageNotification201Response postSimCardDataUsageNotification(
        PostSimCardDataUsageNotificationRequest postSimCardDataUsageNotificationRequest
    ) throws ApiException {
        return postSimCardDataUsageNotificationWithHttpInfo(
            postSimCardDataUsageNotificationRequest
        ).getData();
    }

    /**
   * Create a new SIM card data usage notification
   * Creates a new SIM card data usage notification.
   * @param postSimCardDataUsageNotificationRequest  (required)
   * @return ApiResponse&lt;PostSimCardDataUsageNotification201Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
    public ApiResponse<
        PostSimCardDataUsageNotification201Response
    > postSimCardDataUsageNotificationWithHttpInfo(
        PostSimCardDataUsageNotificationRequest postSimCardDataUsageNotificationRequest
    ) throws ApiException {
        Object localVarPostBody = postSimCardDataUsageNotificationRequest;

        // verify the required parameter 'postSimCardDataUsageNotificationRequest' is set
        if (postSimCardDataUsageNotificationRequest == null) {
            throw new ApiException(
                400,
                "Missing the required parameter 'postSimCardDataUsageNotificationRequest' when calling postSimCardDataUsageNotification"
            );
        }

        // create path and map variables
        String localVarPath = "/sim_card_data_usage_notifications";

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

        GenericType<
            PostSimCardDataUsageNotification201Response
        > localVarReturnType = new GenericType<
            PostSimCardDataUsageNotification201Response
        >() {};

        return apiClient.invokeAPI(
            "SimCardsApi.postSimCardDataUsageNotification",
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
   * Purchase eSIMs
   * Purchases and registers the specified amount of eSIMs to the current user&#39;s account.&lt;br/&gt;&lt;br/&gt; If &lt;code&gt;sim_card_group_id&lt;/code&gt; is provided, the eSIMs will be associated with that group. Otherwise, the default group for the current user will be used.&lt;br/&gt;&lt;br/&gt; 
   * @param esimPurchase  (required)
   * @return PurchaseESim202Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 202 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
   */
    public PurchaseESim202Response purchaseESim(ESimPurchase esimPurchase)
        throws ApiException {
        return purchaseESimWithHttpInfo(esimPurchase).getData();
    }

    /**
   * Purchase eSIMs
   * Purchases and registers the specified amount of eSIMs to the current user&#39;s account.&lt;br/&gt;&lt;br/&gt; If &lt;code&gt;sim_card_group_id&lt;/code&gt; is provided, the eSIMs will be associated with that group. Otherwise, the default group for the current user will be used.&lt;br/&gt;&lt;br/&gt; 
   * @param esimPurchase  (required)
   * @return ApiResponse&lt;PurchaseESim202Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 202 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
   */
    public ApiResponse<PurchaseESim202Response> purchaseESimWithHttpInfo(
        ESimPurchase esimPurchase
    ) throws ApiException {
        Object localVarPostBody = esimPurchase;

        // verify the required parameter 'esimPurchase' is set
        if (esimPurchase == null) {
            throw new ApiException(
                400,
                "Missing the required parameter 'esimPurchase' when calling purchaseESim"
            );
        }

        // create path and map variables
        String localVarPath = "/actions/purchase/esims";

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

        GenericType<PurchaseESim202Response> localVarReturnType =
            new GenericType<PurchaseESim202Response>() {};

        return apiClient.invokeAPI(
            "SimCardsApi.purchaseESim",
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
   * Register SIM cards
   * Register the SIM cards associated with the provided registration codes to the current user&#39;s account.&lt;br/&gt;&lt;br/&gt; If &lt;code&gt;sim_card_group_id&lt;/code&gt; is provided, the SIM cards will be associated with that group. Otherwise, the default group for the current user will be used.&lt;br/&gt;&lt;br/&gt; 
   * @param siMCardRegistration  (required)
   * @return PurchaseESim202Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 202 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
   */
    public PurchaseESim202Response registerSimCards(
        SIMCardRegistration siMCardRegistration
    ) throws ApiException {
        return registerSimCardsWithHttpInfo(siMCardRegistration).getData();
    }

    /**
   * Register SIM cards
   * Register the SIM cards associated with the provided registration codes to the current user&#39;s account.&lt;br/&gt;&lt;br/&gt; If &lt;code&gt;sim_card_group_id&lt;/code&gt; is provided, the SIM cards will be associated with that group. Otherwise, the default group for the current user will be used.&lt;br/&gt;&lt;br/&gt; 
   * @param siMCardRegistration  (required)
   * @return ApiResponse&lt;PurchaseESim202Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 202 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
   */
    public ApiResponse<PurchaseESim202Response> registerSimCardsWithHttpInfo(
        SIMCardRegistration siMCardRegistration
    ) throws ApiException {
        Object localVarPostBody = siMCardRegistration;

        // verify the required parameter 'siMCardRegistration' is set
        if (siMCardRegistration == null) {
            throw new ApiException(
                400,
                "Missing the required parameter 'siMCardRegistration' when calling registerSimCards"
            );
        }

        // create path and map variables
        String localVarPath = "/actions/register/sim_cards";

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

        GenericType<PurchaseESim202Response> localVarReturnType =
            new GenericType<PurchaseESim202Response>() {};

        return apiClient.invokeAPI(
            "SimCardsApi.registerSimCards",
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
   * Request removing a SIM card public IP
   * This API removes an existing public IP from a SIM card. &lt;br/&gt;&lt;br/&gt;  The API will trigger an asynchronous operation called a SIM Card Action. The status of the SIM Card Action can be followed through the [List SIM Card Action](https://developersdev.telnyx.com/docs/api/v2/wireless/SIM-Card-Actions#ListSIMCardActions) API.
   * @param id Identifies the SIM. (required)
   * @return GetSimCardAction200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 202 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
    public GetSimCardAction200Response removeSimCardPublicIp(UUID id)
        throws ApiException {
        return removeSimCardPublicIpWithHttpInfo(id).getData();
    }

    /**
   * Request removing a SIM card public IP
   * This API removes an existing public IP from a SIM card. &lt;br/&gt;&lt;br/&gt;  The API will trigger an asynchronous operation called a SIM Card Action. The status of the SIM Card Action can be followed through the [List SIM Card Action](https://developersdev.telnyx.com/docs/api/v2/wireless/SIM-Card-Actions#ListSIMCardActions) API.
   * @param id Identifies the SIM. (required)
   * @return ApiResponse&lt;GetSimCardAction200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 202 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
    public ApiResponse<
        GetSimCardAction200Response
    > removeSimCardPublicIpWithHttpInfo(UUID id) throws ApiException {
        Object localVarPostBody = null;

        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException(
                400,
                "Missing the required parameter 'id' when calling removeSimCardPublicIp"
            );
        }

        // create path and map variables
        String localVarPath =
            "/sim_cards/{id}/actions/remove_public_ip".replaceAll(
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
            "SimCardsApi.removeSimCardPublicIp",
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
   * Request bulk setting SIM card public IPs.
   * This API triggers an asynchronous operation to set a public IP for each of the specified SIM cards.&lt;br/&gt; For each SIM Card a SIM Card Action will be generated. The status of the SIM Card Action can be followed through the [List SIM Card Action](https://developersdev.telnyx.com/docs/api/v2/wireless/SIM-Card-Actions#ListSIMCardActions) API. 
   * @param setPublicIPsBulkRequest  (optional)
   * @return SetPublicIPsBulk202Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 202 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check the &#39;detail&#39; field in response for details. </td><td>  -  </td></tr>
     </table>
   */
    public SetPublicIPsBulk202Response setPublicIPsBulk(
        SetPublicIPsBulkRequest setPublicIPsBulkRequest
    ) throws ApiException {
        return setPublicIPsBulkWithHttpInfo(setPublicIPsBulkRequest).getData();
    }

    /**
   * Request bulk setting SIM card public IPs.
   * This API triggers an asynchronous operation to set a public IP for each of the specified SIM cards.&lt;br/&gt; For each SIM Card a SIM Card Action will be generated. The status of the SIM Card Action can be followed through the [List SIM Card Action](https://developersdev.telnyx.com/docs/api/v2/wireless/SIM-Card-Actions#ListSIMCardActions) API. 
   * @param setPublicIPsBulkRequest  (optional)
   * @return ApiResponse&lt;SetPublicIPsBulk202Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 202 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check the &#39;detail&#39; field in response for details. </td><td>  -  </td></tr>
     </table>
   */
    public ApiResponse<
        SetPublicIPsBulk202Response
    > setPublicIPsBulkWithHttpInfo(
        SetPublicIPsBulkRequest setPublicIPsBulkRequest
    ) throws ApiException {
        Object localVarPostBody = setPublicIPsBulkRequest;

        // create path and map variables
        String localVarPath = "/sim_cards/actions/bulk_set_public_ips";

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

        GenericType<SetPublicIPsBulk202Response> localVarReturnType =
            new GenericType<SetPublicIPsBulk202Response>() {};

        return apiClient.invokeAPI(
            "SimCardsApi.setPublicIPsBulk",
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
   * Request setting a SIM card public IP
   * This API makes a SIM card reachable on the public internet by mapping a random public IP to the SIM card. &lt;br/&gt;&lt;br/&gt;  The API will trigger an asynchronous operation called a SIM Card Action. The status of the SIM Card Action can be followed through the [List SIM Card Action](https://developersdev.telnyx.com/docs/api/v2/wireless/SIM-Card-Actions#ListSIMCardActions) API. &lt;br/&gt;&lt;br/&gt;  Setting a Public IP to a SIM Card incurs a charge and will only succeed if the account has sufficient funds.
   * @param id Identifies the SIM. (required)
   * @param regionCode The code of the region where the public IP should be assigned. A list of available regions can be found at the regions endpoint (optional)
   * @return GetSimCardAction200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 202 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
    public GetSimCardAction200Response setSimCardPublicIp(
        UUID id,
        String regionCode
    ) throws ApiException {
        return setSimCardPublicIpWithHttpInfo(id, regionCode).getData();
    }

    /**
   * Request setting a SIM card public IP
   * This API makes a SIM card reachable on the public internet by mapping a random public IP to the SIM card. &lt;br/&gt;&lt;br/&gt;  The API will trigger an asynchronous operation called a SIM Card Action. The status of the SIM Card Action can be followed through the [List SIM Card Action](https://developersdev.telnyx.com/docs/api/v2/wireless/SIM-Card-Actions#ListSIMCardActions) API. &lt;br/&gt;&lt;br/&gt;  Setting a Public IP to a SIM Card incurs a charge and will only succeed if the account has sufficient funds.
   * @param id Identifies the SIM. (required)
   * @param regionCode The code of the region where the public IP should be assigned. A list of available regions can be found at the regions endpoint (optional)
   * @return ApiResponse&lt;GetSimCardAction200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 202 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
    public ApiResponse<
        GetSimCardAction200Response
    > setSimCardPublicIpWithHttpInfo(UUID id, String regionCode)
        throws ApiException {
        Object localVarPostBody = null;

        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException(
                400,
                "Missing the required parameter 'id' when calling setSimCardPublicIp"
            );
        }

        // create path and map variables
        String localVarPath =
            "/sim_cards/{id}/actions/set_public_ip".replaceAll(
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

        localVarQueryParams.addAll(
            apiClient.parameterToPairs("", "region_code", regionCode)
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

        GenericType<GetSimCardAction200Response> localVarReturnType =
            new GenericType<GetSimCardAction200Response>() {};

        return apiClient.invokeAPI(
            "SimCardsApi.setSimCardPublicIp",
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
   * Request setting a SIM card to standby
   * The SIM card will be able to connect to the network once the process to set it to standby has been completed, thus making it possible to consume data.&lt;br/&gt; To set a SIM card to standby, it must be associated with SIM card group.&lt;br/&gt; The API will trigger an asynchronous operation called a SIM Card Action. Transitioning to the standby state may take a period of time. The status of the SIM Card Action can be followed through the [List SIM Card Action](https://developersdev.telnyx.com/docs/api/v2/wireless/SIM-Card-Actions#ListSIMCardActions) API. 
   * @param id Identifies the SIM. (required)
   * @return GetSimCardAction200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 202 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
    public GetSimCardAction200Response setSimCardStandby(UUID id)
        throws ApiException {
        return setSimCardStandbyWithHttpInfo(id).getData();
    }

    /**
   * Request setting a SIM card to standby
   * The SIM card will be able to connect to the network once the process to set it to standby has been completed, thus making it possible to consume data.&lt;br/&gt; To set a SIM card to standby, it must be associated with SIM card group.&lt;br/&gt; The API will trigger an asynchronous operation called a SIM Card Action. Transitioning to the standby state may take a period of time. The status of the SIM Card Action can be followed through the [List SIM Card Action](https://developersdev.telnyx.com/docs/api/v2/wireless/SIM-Card-Actions#ListSIMCardActions) API. 
   * @param id Identifies the SIM. (required)
   * @return ApiResponse&lt;GetSimCardAction200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 202 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
    public ApiResponse<
        GetSimCardAction200Response
    > setSimCardStandbyWithHttpInfo(UUID id) throws ApiException {
        Object localVarPostBody = null;

        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException(
                400,
                "Missing the required parameter 'id' when calling setSimCardStandby"
            );
        }

        // create path and map variables
        String localVarPath =
            "/sim_cards/{id}/actions/set_standby".replaceAll(
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
            "SimCardsApi.setSimCardStandby",
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
   * Update a SIM card
   * Updates SIM card data
   * @param id Identifies the SIM. (required)
   * @param siMCard  (required)
   * @return GetSimCard200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
    public GetSimCard200Response updateSimCard(UUID id, SIMCard siMCard)
        throws ApiException {
        return updateSimCardWithHttpInfo(id, siMCard).getData();
    }

    /**
   * Update a SIM card
   * Updates SIM card data
   * @param id Identifies the SIM. (required)
   * @param siMCard  (required)
   * @return ApiResponse&lt;GetSimCard200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
    public ApiResponse<GetSimCard200Response> updateSimCardWithHttpInfo(
        UUID id,
        SIMCard siMCard
    ) throws ApiException {
        Object localVarPostBody = siMCard;

        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException(
                400,
                "Missing the required parameter 'id' when calling updateSimCard"
            );
        }

        // verify the required parameter 'siMCard' is set
        if (siMCard == null) {
            throw new ApiException(
                400,
                "Missing the required parameter 'siMCard' when calling updateSimCard"
            );
        }

        // create path and map variables
        String localVarPath =
            "/sim_cards/{id}".replaceAll(
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

        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = apiClient.selectHeaderContentType(
            localVarContentTypes
        );

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        GenericType<GetSimCard200Response> localVarReturnType = new GenericType<
            GetSimCard200Response
        >() {};

        return apiClient.invokeAPI(
            "SimCardsApi.updateSimCard",
            localVarPath,
            "PATCH",
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
   * Validate SIM cards registration codes
   * It validates whether SIM card registration codes are valid or not.
   * @param validateRegistrationCodesRequest  (required)
   * @return SIMCardRegistrationCodeValidations
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
    public SIMCardRegistrationCodeValidations validateRegistrationCodes(
        ValidateRegistrationCodesRequest validateRegistrationCodesRequest
    ) throws ApiException {
        return validateRegistrationCodesWithHttpInfo(
            validateRegistrationCodesRequest
        ).getData();
    }

    /**
   * Validate SIM cards registration codes
   * It validates whether SIM card registration codes are valid or not.
   * @param validateRegistrationCodesRequest  (required)
   * @return ApiResponse&lt;SIMCardRegistrationCodeValidations&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
    public ApiResponse<
        SIMCardRegistrationCodeValidations
    > validateRegistrationCodesWithHttpInfo(
        ValidateRegistrationCodesRequest validateRegistrationCodesRequest
    ) throws ApiException {
        Object localVarPostBody = validateRegistrationCodesRequest;

        // verify the required parameter 'validateRegistrationCodesRequest' is set
        if (validateRegistrationCodesRequest == null) {
            throw new ApiException(
                400,
                "Missing the required parameter 'validateRegistrationCodesRequest' when calling validateRegistrationCodes"
            );
        }

        // create path and map variables
        String localVarPath = "/sim_cards/actions/validate_registration_codes";

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

        GenericType<SIMCardRegistrationCodeValidations> localVarReturnType =
            new GenericType<SIMCardRegistrationCodeValidations>() {};

        return apiClient.invokeAPI(
            "SimCardsApi.validateRegistrationCodes",
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
}
