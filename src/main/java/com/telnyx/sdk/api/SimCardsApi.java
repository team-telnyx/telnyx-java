package com.telnyx.sdk.api;

import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.Pair;

import jakarta.ws.rs.core.GenericType;

import com.telnyx.sdk.model.ESimPurchase;
import com.telnyx.sdk.model.Error;
import com.telnyx.sdk.model.Errors;
import com.telnyx.sdk.model.GetSimCard200Response;
import com.telnyx.sdk.model.GetSimCardAction200Response;
import com.telnyx.sdk.model.GetSimCardActivationCode200Response;
import com.telnyx.sdk.model.GetSimCardDeviceDetails200Response;
import com.telnyx.sdk.model.GetSimCardNetworkPreferences200Response;
import com.telnyx.sdk.model.GetSimCardPublicIp200Response;
import com.telnyx.sdk.model.GetSimCards200Response;
import com.telnyx.sdk.model.GetWirelessConnectivityLogs200Response;
import com.telnyx.sdk.model.ListDataUsageNotifications200Response;
import com.telnyx.sdk.model.PostSimCardDataUsageNotification201Response;
import com.telnyx.sdk.model.PostSimCardDataUsageNotificationRequest;
import com.telnyx.sdk.model.PurchaseESim202Response;
import com.telnyx.sdk.model.PutSimCardNetworkPreferencesRequest;
import com.telnyx.sdk.model.SIMCard;
import com.telnyx.sdk.model.SIMCardRegistration;
import com.telnyx.sdk.model.SIMCardRegistrationCodeValidations;
import com.telnyx.sdk.model.SetNetworkPreferencesBulk202Response;
import com.telnyx.sdk.model.SetNetworkPreferencesBulkRequest;
import com.telnyx.sdk.model.SimCardDataUsageNotification;
import java.util.UUID;
import com.telnyx.sdk.model.ValidateRegistrationCodesRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
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
   * Bulk Network Preferences for SIM cards
   * This API allows dispatching the same operation described for the PUT sim_cards/:sim_card_id/network_preferences API for multiple SIM cards at once.&lt;br/&gt;&lt;br/&gt; Although, a SIM card network preference may fail individually under any validation triggered as a consequence of its state. For example, a SIM can&#39;t have an in-progress OTA update for applying a Network Preference, so they&#39;ll fail when requested in this API. In that scenario, the specific error will be present in the response along with the successful definitions in the \&quot;errors\&quot; response node. 
   * @param bulkSimCardNetworkPreferencesRequest  (optional)
   * @return BulkSimCardNetworkPreferences202Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 202 </td><td>  </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check the &#39;detail&#39; field in response for details. </td><td>  -  </td></tr>
     </table>
   */

  /**
   * Bulk Network Preferences for SIM cards
   * This API allows dispatching the same operation described for the PUT sim_cards/:sim_card_id/network_preferences API for multiple SIM cards at once.&lt;br/&gt;&lt;br/&gt; Although, a SIM card network preference may fail individually under any validation triggered as a consequence of its state. For example, a SIM can&#39;t have an in-progress OTA update for applying a Network Preference, so they&#39;ll fail when requested in this API. In that scenario, the specific error will be present in the response along with the successful definitions in the \&quot;errors\&quot; response node. 
   * @param bulkSimCardNetworkPreferencesRequest  (optional)
   * @return ApiResponse&lt;BulkSimCardNetworkPreferences202Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 202 </td><td>  </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check the &#39;detail&#39; field in response for details. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<String> bulkSimCardNetworkPreferencesWithHttpInfo(String bulkSimCardNetworkPreferencesRequest) throws ApiException {
    Object localVarPostBody = bulkSimCardNetworkPreferencesRequest;
    
    // create path and map variables
    String localVarPath = "/actions/network_preferences/sim_cards";

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

    GenericType<String> localVarReturnType = new GenericType<String>() {};

    return apiClient.invokeAPI("SimCardsApi.bulkSimCardNetworkPreferences", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Delete network preferences for a SIM card
   * This API deletes network preferences for a SIM card.&lt;br/&gt; The API will trigger an asynchronous operation called a SIM Card Action. Creating network preferences may take a period of time. The status of the SIM Card Action can be followed through the [List SIM Card Action](https://developersdev.telnyx.com/docs/api/v2/wireless/SIM-Card-Actions#ListSIMCardActions) API. 
   * @param id Identifies the resource. (required)
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
  public GetSimCardAction200Response deleteNetworkPreferences(UUID id) throws ApiException {
    return deleteNetworkPreferencesWithHttpInfo(id).getData();
  }

  /**
   * Delete network preferences for a SIM card
   * This API deletes network preferences for a SIM card.&lt;br/&gt; The API will trigger an asynchronous operation called a SIM Card Action. Creating network preferences may take a period of time. The status of the SIM Card Action can be followed through the [List SIM Card Action](https://developersdev.telnyx.com/docs/api/v2/wireless/SIM-Card-Actions#ListSIMCardActions) API. 
   * @param id Identifies the resource. (required)
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
  public ApiResponse<GetSimCardAction200Response> deleteNetworkPreferencesWithHttpInfo(UUID id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling deleteNetworkPreferences");
    }
    
    // create path and map variables
    String localVarPath = "/sim_cards/{id}/actions/delete_network_preferences"
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

    GenericType<GetSimCardAction200Response> localVarReturnType = new GenericType<GetSimCardAction200Response>() {};

    return apiClient.invokeAPI("SimCardsApi.deleteNetworkPreferences", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * DELETE network preferences
   * This API asynchronously removes the custom-defined network preferences settings. After this operation is done the Telnyx default settings, the same applied for an unaltered SIM card, will be in place. 
   * @param simCardId Identifies a SIM card. (required)
   * @return GetSimCardNetworkPreferences200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 202 </td><td> A successful network preferences deletion response. &lt;br/&gt;&lt;br/&gt; The delete won&#39;t be done right away - this is an asynchronous operation. The request will return the resource with an in-progress OTA update resource (in the ota_updates node) representing the delete operation. Similarly to the PUT API, the resource will only be deleted when the OTA updated is successfully completed. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public GetSimCardNetworkPreferences200Response deleteSIMCardNetworkPreferences(UUID simCardId) throws ApiException {
    return deleteSIMCardNetworkPreferencesWithHttpInfo(simCardId).getData();
  }

  /**
   * DELETE network preferences
   * This API asynchronously removes the custom-defined network preferences settings. After this operation is done the Telnyx default settings, the same applied for an unaltered SIM card, will be in place. 
   * @param simCardId Identifies a SIM card. (required)
   * @return ApiResponse&lt;GetSimCardNetworkPreferences200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 202 </td><td> A successful network preferences deletion response. &lt;br/&gt;&lt;br/&gt; The delete won&#39;t be done right away - this is an asynchronous operation. The request will return the resource with an in-progress OTA update resource (in the ota_updates node) representing the delete operation. Similarly to the PUT API, the resource will only be deleted when the OTA updated is successfully completed. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GetSimCardNetworkPreferences200Response> deleteSIMCardNetworkPreferencesWithHttpInfo(UUID simCardId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'simCardId' is set
    if (simCardId == null) {
      throw new ApiException(400, "Missing the required parameter 'simCardId' when calling deleteSIMCardNetworkPreferences");
    }
    
    // create path and map variables
    String localVarPath = "/sim_cards/{sim_card_id}/network_preferences"
      .replaceAll("\\{" + "sim_card_id" + "\\}", apiClient.escapeString(simCardId.toString()));

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

    GenericType<GetSimCardNetworkPreferences200Response> localVarReturnType = new GenericType<GetSimCardNetworkPreferences200Response>() {};

    return apiClient.invokeAPI("SimCardsApi.deleteSIMCardNetworkPreferences", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Deletes a SIM card
   * The SIM card will be decommissioned, removed from your account and you will stop being charged.&lt;br /&gt;The SIM card won&#39;t be able to connect to the network after the deletion is completed, thus making it impossible to consume data.&lt;br/&gt; Transitioning to the disabled state may take a period of time. Until the transition is completed, the SIM card status will be disabling &lt;code&gt;disabling&lt;/code&gt;.&lt;br /&gt;In order to re-enable the SIM card, you will need to re-register it.
   * @param id Identifies the resource. (required)
   * @return GetSimCard200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public GetSimCard200Response deleteSimCard(UUID id) throws ApiException {
    return deleteSimCardWithHttpInfo(id).getData();
  }

  /**
   * Deletes a SIM card
   * The SIM card will be decommissioned, removed from your account and you will stop being charged.&lt;br /&gt;The SIM card won&#39;t be able to connect to the network after the deletion is completed, thus making it impossible to consume data.&lt;br/&gt; Transitioning to the disabled state may take a period of time. Until the transition is completed, the SIM card status will be disabling &lt;code&gt;disabling&lt;/code&gt;.&lt;br /&gt;In order to re-enable the SIM card, you will need to re-register it.
   * @param id Identifies the resource. (required)
   * @return ApiResponse&lt;GetSimCard200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GetSimCard200Response> deleteSimCardWithHttpInfo(UUID id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling deleteSimCard");
    }
    
    // create path and map variables
    String localVarPath = "/sim_cards/{id}"
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

    GenericType<GetSimCard200Response> localVarReturnType = new GenericType<GetSimCard200Response>() {};

    return apiClient.invokeAPI("SimCardsApi.deleteSimCard", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
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
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public PostSimCardDataUsageNotification201Response deleteSimCardDataUsageNotifications(UUID id) throws ApiException {
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
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<PostSimCardDataUsageNotification201Response> deleteSimCardDataUsageNotificationsWithHttpInfo(UUID id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling deleteSimCardDataUsageNotifications");
    }
    
    // create path and map variables
    String localVarPath = "/sim_card_data_usage_notifications/{id}"
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

    GenericType<PostSimCardDataUsageNotification201Response> localVarReturnType = new GenericType<PostSimCardDataUsageNotification201Response>() {};

    return apiClient.invokeAPI("SimCardsApi.deleteSimCardDataUsageNotifications", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Request a SIM card disable
   * This API disables a SIM card, disconnecting it from the network and making it impossible to consume data.&lt;br/&gt; The API will trigger an asynchronous operation called a SIM Card Action. Transitioning to the disabled state may take a period of time. The status of the SIM Card Action can be followed through the [List SIM Card Action](https://developersdev.telnyx.com/docs/api/v2/wireless/SIM-Card-Actions#ListSIMCardActions) API. 
   * @param id Identifies the resource. (required)
   * @return GetSimCardAction200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 202 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public GetSimCardAction200Response disableSimCard(UUID id) throws ApiException {
    return disableSimCardWithHttpInfo(id).getData();
  }

  /**
   * Request a SIM card disable
   * This API disables a SIM card, disconnecting it from the network and making it impossible to consume data.&lt;br/&gt; The API will trigger an asynchronous operation called a SIM Card Action. Transitioning to the disabled state may take a period of time. The status of the SIM Card Action can be followed through the [List SIM Card Action](https://developersdev.telnyx.com/docs/api/v2/wireless/SIM-Card-Actions#ListSIMCardActions) API. 
   * @param id Identifies the resource. (required)
   * @return ApiResponse&lt;GetSimCardAction200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 202 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GetSimCardAction200Response> disableSimCardWithHttpInfo(UUID id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling disableSimCard");
    }
    
    // create path and map variables
    String localVarPath = "/sim_cards/{id}/actions/disable"
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

    GenericType<GetSimCardAction200Response> localVarReturnType = new GenericType<GetSimCardAction200Response>() {};

    return apiClient.invokeAPI("SimCardsApi.disableSimCard", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Request a SIM card enable
   * This API enables a SIM card, connecting it to the network and making it possible to consume data.&lt;br/&gt; To enable a SIM card, it must be associated with a SIM card group.&lt;br/&gt; The API will trigger an asynchronous operation called a SIM Card Action. Transitioning to the enabled state may take a period of time. The status of the SIM Card Action can be followed through the [List SIM Card Action](https://developersdev.telnyx.com/docs/api/v2/wireless/SIM-Card-Actions#ListSIMCardActions) API. 
   * @param id Identifies the resource. (required)
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
  public GetSimCardAction200Response enableSimCard(UUID id) throws ApiException {
    return enableSimCardWithHttpInfo(id).getData();
  }

  /**
   * Request a SIM card enable
   * This API enables a SIM card, connecting it to the network and making it possible to consume data.&lt;br/&gt; To enable a SIM card, it must be associated with a SIM card group.&lt;br/&gt; The API will trigger an asynchronous operation called a SIM Card Action. Transitioning to the enabled state may take a period of time. The status of the SIM Card Action can be followed through the [List SIM Card Action](https://developersdev.telnyx.com/docs/api/v2/wireless/SIM-Card-Actions#ListSIMCardActions) API. 
   * @param id Identifies the resource. (required)
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
  public ApiResponse<GetSimCardAction200Response> enableSimCardWithHttpInfo(UUID id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling enableSimCard");
    }
    
    // create path and map variables
    String localVarPath = "/sim_cards/{id}/actions/enable"
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

    GenericType<GetSimCardAction200Response> localVarReturnType = new GenericType<GetSimCardAction200Response>() {};

    return apiClient.invokeAPI("SimCardsApi.enableSimCard", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get SIM card
   * Returns the details regarding a specific SIM card.
   * @param id Identifies the resource. (required)
   * @param includeSimCardGroup It includes the associated SIM card group object in the response when present. (optional, default to false)
   * @return GetSimCard200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public GetSimCard200Response getSimCard(UUID id, Boolean includeSimCardGroup) throws ApiException {
    return getSimCardWithHttpInfo(id, includeSimCardGroup).getData();
  }

  /**
   * Get SIM card
   * Returns the details regarding a specific SIM card.
   * @param id Identifies the resource. (required)
   * @param includeSimCardGroup It includes the associated SIM card group object in the response when present. (optional, default to false)
   * @return ApiResponse&lt;GetSimCard200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GetSimCard200Response> getSimCardWithHttpInfo(UUID id, Boolean includeSimCardGroup) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getSimCard");
    }
    
    // create path and map variables
    String localVarPath = "/sim_cards/{id}"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include_sim_card_group", includeSimCardGroup));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    GenericType<GetSimCard200Response> localVarReturnType = new GenericType<GetSimCard200Response>() {};

    return apiClient.invokeAPI("SimCardsApi.getSimCard", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get activation QR code for an eSIM
   * It returns the contents for the activation QR code for an eSIM.&lt;br/&gt;&lt;br/&gt;  This API is only available for eSIMs. If the given SIM is a physical SIM card, or has already been installed, an error will be returned. 
   * @param simCardId Identifies a SIM card. (required)
   * @return GetSimCardActivationCode200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public GetSimCardActivationCode200Response getSimCardActivationCode(UUID simCardId) throws ApiException {
    return getSimCardActivationCodeWithHttpInfo(simCardId).getData();
  }

  /**
   * Get activation QR code for an eSIM
   * It returns the contents for the activation QR code for an eSIM.&lt;br/&gt;&lt;br/&gt;  This API is only available for eSIMs. If the given SIM is a physical SIM card, or has already been installed, an error will be returned. 
   * @param simCardId Identifies a SIM card. (required)
   * @return ApiResponse&lt;GetSimCardActivationCode200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GetSimCardActivationCode200Response> getSimCardActivationCodeWithHttpInfo(UUID simCardId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'simCardId' is set
    if (simCardId == null) {
      throw new ApiException(400, "Missing the required parameter 'simCardId' when calling getSimCardActivationCode");
    }
    
    // create path and map variables
    String localVarPath = "/sim_cards/{sim_card_id}/activation_code"
      .replaceAll("\\{" + "sim_card_id" + "\\}", apiClient.escapeString(simCardId.toString()));

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

    GenericType<GetSimCardActivationCode200Response> localVarReturnType = new GenericType<GetSimCardActivationCode200Response>() {};

    return apiClient.invokeAPI("SimCardsApi.getSimCardActivationCode", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
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
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public PostSimCardDataUsageNotification201Response getSimCardDataUsageNotification(UUID id) throws ApiException {
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
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<PostSimCardDataUsageNotification201Response> getSimCardDataUsageNotificationWithHttpInfo(UUID id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getSimCardDataUsageNotification");
    }
    
    // create path and map variables
    String localVarPath = "/sim_card_data_usage_notifications/{id}"
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

    GenericType<PostSimCardDataUsageNotification201Response> localVarReturnType = new GenericType<PostSimCardDataUsageNotification201Response>() {};

    return apiClient.invokeAPI("SimCardsApi.getSimCardDataUsageNotification", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get SIM card device details
   * It returns the device details where a SIM card is currently being used. 
   * @param simCardId Identifies a SIM card. (required)
   * @return GetSimCardDeviceDetails200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public GetSimCardDeviceDetails200Response getSimCardDeviceDetails(UUID simCardId) throws ApiException {
    return getSimCardDeviceDetailsWithHttpInfo(simCardId).getData();
  }

  /**
   * Get SIM card device details
   * It returns the device details where a SIM card is currently being used. 
   * @param simCardId Identifies a SIM card. (required)
   * @return ApiResponse&lt;GetSimCardDeviceDetails200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GetSimCardDeviceDetails200Response> getSimCardDeviceDetailsWithHttpInfo(UUID simCardId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'simCardId' is set
    if (simCardId == null) {
      throw new ApiException(400, "Missing the required parameter 'simCardId' when calling getSimCardDeviceDetails");
    }
    
    // create path and map variables
    String localVarPath = "/sim_cards/{sim_card_id}/device_details"
      .replaceAll("\\{" + "sim_card_id" + "\\}", apiClient.escapeString(simCardId.toString()));

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

    GenericType<GetSimCardDeviceDetails200Response> localVarReturnType = new GenericType<GetSimCardDeviceDetails200Response>() {};

    return apiClient.invokeAPI("SimCardsApi.getSimCardDeviceDetails", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get network preferences
   * It returns the network preferences currently applied in the SIM card. 
   * @param simCardId Identifies a SIM card. (required)
   * @param includeOtaUpdates It includes the associated OTA update objects in the response when present. (optional, default to false)
   * @return GetSimCardNetworkPreferences200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A successful network preferences definition response. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public GetSimCardNetworkPreferences200Response getSimCardNetworkPreferences(UUID simCardId, Boolean includeOtaUpdates) throws ApiException {
    return getSimCardNetworkPreferencesWithHttpInfo(simCardId, includeOtaUpdates).getData();
  }

  /**
   * Get network preferences
   * It returns the network preferences currently applied in the SIM card. 
   * @param simCardId Identifies a SIM card. (required)
   * @param includeOtaUpdates It includes the associated OTA update objects in the response when present. (optional, default to false)
   * @return ApiResponse&lt;GetSimCardNetworkPreferences200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A successful network preferences definition response. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GetSimCardNetworkPreferences200Response> getSimCardNetworkPreferencesWithHttpInfo(UUID simCardId, Boolean includeOtaUpdates) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'simCardId' is set
    if (simCardId == null) {
      throw new ApiException(400, "Missing the required parameter 'simCardId' when calling getSimCardNetworkPreferences");
    }
    
    // create path and map variables
    String localVarPath = "/sim_cards/{sim_card_id}/network_preferences"
      .replaceAll("\\{" + "sim_card_id" + "\\}", apiClient.escapeString(simCardId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include_ota_updates", includeOtaUpdates));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    GenericType<GetSimCardNetworkPreferences200Response> localVarReturnType = new GenericType<GetSimCardNetworkPreferences200Response>() {};

    return apiClient.invokeAPI("SimCardsApi.getSimCardNetworkPreferences", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get SIM card public IP definition
   * It returns the public IP requested for a SIM card. 
   * @param simCardId Identifies a SIM card. (required)
   * @return GetSimCardPublicIp200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public GetSimCardPublicIp200Response getSimCardPublicIp(UUID simCardId) throws ApiException {
    return getSimCardPublicIpWithHttpInfo(simCardId).getData();
  }

  /**
   * Get SIM card public IP definition
   * It returns the public IP requested for a SIM card. 
   * @param simCardId Identifies a SIM card. (required)
   * @return ApiResponse&lt;GetSimCardPublicIp200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GetSimCardPublicIp200Response> getSimCardPublicIpWithHttpInfo(UUID simCardId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'simCardId' is set
    if (simCardId == null) {
      throw new ApiException(400, "Missing the required parameter 'simCardId' when calling getSimCardPublicIp");
    }
    
    // create path and map variables
    String localVarPath = "/sim_cards/{sim_card_id}/public_ip"
      .replaceAll("\\{" + "sim_card_id" + "\\}", apiClient.escapeString(simCardId.toString()));

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

    GenericType<GetSimCardPublicIp200Response> localVarReturnType = new GenericType<GetSimCardPublicIp200Response>() {};

    return apiClient.invokeAPI("SimCardsApi.getSimCardPublicIp", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get all SIM cards
   * Get all SIM cards belonging to the user that match the given filters.
   * @param pageNumber The page number to load (optional, default to 1)
   * @param pageSize The size of the page (optional, default to 20)
   * @param includeSimCardGroup It includes the associated SIM card group object in the response when present. (optional, default to false)
   * @param filterSimCardGroupId A valid SIM card group ID. (optional)
   * @param filterTags A list of SIM card tags to filter on.&lt;br/&gt;&lt;br/&gt; If the SIM card contains &lt;b&gt;&lt;i&gt;all&lt;/i&gt;&lt;/b&gt; of the given &lt;code&gt;tags&lt;/code&gt; they will be found.&lt;br/&gt;&lt;br/&gt; For example, if the SIM cards have the following tags: &lt;ul&gt;   &lt;li&gt;&lt;code&gt;[&#39;customers&#39;, &#39;staff&#39;, &#39;test&#39;]&lt;/code&gt;   &lt;li&gt;&lt;code&gt;[&#39;test&#39;]&lt;/code&gt;&lt;/li&gt;   &lt;li&gt;&lt;code&gt;[&#39;customers&#39;]&lt;/code&gt;&lt;/li&gt; &lt;/ul&gt; Searching for &lt;code&gt;[&#39;customers&#39;, &#39;test&#39;]&lt;/code&gt; returns only the first because it&#39;s the only one with both tags.&lt;br/&gt; Searching for &lt;code&gt;test&lt;/code&gt; returns the first two SIMs, because both of them have such tag.&lt;br/&gt; Searching for &lt;code&gt;customers&lt;/code&gt; returns the first and last SIMs.&lt;br/&gt;  (optional)
   * @param filterIccid A search string to partially match for the SIM card&#39;s ICCID. (optional)
   * @param filterStatus Filter by a SIM card&#39;s status. (optional)
   * @param sort Sorts SIM cards by the given field. Defaults to ascending order unless field is prefixed with a minus sign. (optional)
   * @return GetSimCards200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public GetSimCards200Response getSimCards(Integer pageNumber, Integer pageSize, Boolean includeSimCardGroup, UUID filterSimCardGroupId, List<String> filterTags, String filterIccid, List<String> filterStatus, String sort) throws ApiException {
    return getSimCardsWithHttpInfo(pageNumber, pageSize, includeSimCardGroup, filterSimCardGroupId, filterTags, filterIccid, filterStatus, sort).getData();
  }

  /**
   * Get all SIM cards
   * Get all SIM cards belonging to the user that match the given filters.
   * @param pageNumber The page number to load (optional, default to 1)
   * @param pageSize The size of the page (optional, default to 20)
   * @param includeSimCardGroup It includes the associated SIM card group object in the response when present. (optional, default to false)
   * @param filterSimCardGroupId A valid SIM card group ID. (optional)
   * @param filterTags A list of SIM card tags to filter on.&lt;br/&gt;&lt;br/&gt; If the SIM card contains &lt;b&gt;&lt;i&gt;all&lt;/i&gt;&lt;/b&gt; of the given &lt;code&gt;tags&lt;/code&gt; they will be found.&lt;br/&gt;&lt;br/&gt; For example, if the SIM cards have the following tags: &lt;ul&gt;   &lt;li&gt;&lt;code&gt;[&#39;customers&#39;, &#39;staff&#39;, &#39;test&#39;]&lt;/code&gt;   &lt;li&gt;&lt;code&gt;[&#39;test&#39;]&lt;/code&gt;&lt;/li&gt;   &lt;li&gt;&lt;code&gt;[&#39;customers&#39;]&lt;/code&gt;&lt;/li&gt; &lt;/ul&gt; Searching for &lt;code&gt;[&#39;customers&#39;, &#39;test&#39;]&lt;/code&gt; returns only the first because it&#39;s the only one with both tags.&lt;br/&gt; Searching for &lt;code&gt;test&lt;/code&gt; returns the first two SIMs, because both of them have such tag.&lt;br/&gt; Searching for &lt;code&gt;customers&lt;/code&gt; returns the first and last SIMs.&lt;br/&gt;  (optional)
   * @param filterIccid A search string to partially match for the SIM card&#39;s ICCID. (optional)
   * @param filterStatus Filter by a SIM card&#39;s status. (optional)
   * @param sort Sorts SIM cards by the given field. Defaults to ascending order unless field is prefixed with a minus sign. (optional)
   * @return ApiResponse&lt;GetSimCards200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GetSimCards200Response> getSimCardsWithHttpInfo(Integer pageNumber, Integer pageSize, Boolean includeSimCardGroup, UUID filterSimCardGroupId, List<String> filterTags, String filterIccid, List<String> filterStatus, String sort) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/sim_cards";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[number]", pageNumber));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include_sim_card_group", includeSimCardGroup));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[sim_card_group_id]", filterSimCardGroupId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "filter[tags]", filterTags));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[iccid]", filterIccid));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "filter[status]", filterStatus));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort", sort));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    GenericType<GetSimCards200Response> localVarReturnType = new GenericType<GetSimCards200Response>() {};

    return apiClient.invokeAPI("SimCardsApi.getSimCards", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * List wireless connectivity logs
   * This API allows listing a paginated collection of Wireless Connectivity Logs associated with a SIM Card, for troubleshooting purposes.
   * @param simCardId Identifies a SIM card. (required)
   * @param pageNumber The page number to load (optional, default to 1)
   * @param pageSize The size of the page (optional, default to 20)
   * @return GetWirelessConnectivityLogs200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public GetWirelessConnectivityLogs200Response getWirelessConnectivityLogs(UUID simCardId, Integer pageNumber, Integer pageSize) throws ApiException {
    return getWirelessConnectivityLogsWithHttpInfo(simCardId, pageNumber, pageSize).getData();
  }

  /**
   * List wireless connectivity logs
   * This API allows listing a paginated collection of Wireless Connectivity Logs associated with a SIM Card, for troubleshooting purposes.
   * @param simCardId Identifies a SIM card. (required)
   * @param pageNumber The page number to load (optional, default to 1)
   * @param pageSize The size of the page (optional, default to 20)
   * @return ApiResponse&lt;GetWirelessConnectivityLogs200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GetWirelessConnectivityLogs200Response> getWirelessConnectivityLogsWithHttpInfo(UUID simCardId, Integer pageNumber, Integer pageSize) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'simCardId' is set
    if (simCardId == null) {
      throw new ApiException(400, "Missing the required parameter 'simCardId' when calling getWirelessConnectivityLogs");
    }
    
    // create path and map variables
    String localVarPath = "/sim_cards/{sim_card_id}/wireless_connectivity_logs"
      .replaceAll("\\{" + "sim_card_id" + "\\}", apiClient.escapeString(simCardId.toString()));

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

    GenericType<GetWirelessConnectivityLogs200Response> localVarReturnType = new GenericType<GetWirelessConnectivityLogs200Response>() {};

    return apiClient.invokeAPI("SimCardsApi.getWirelessConnectivityLogs", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
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
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ListDataUsageNotifications200Response listDataUsageNotifications(Integer pageNumber, Integer pageSize, UUID filterSimCardId) throws ApiException {
    return listDataUsageNotificationsWithHttpInfo(pageNumber, pageSize, filterSimCardId).getData();
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
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ListDataUsageNotifications200Response> listDataUsageNotificationsWithHttpInfo(Integer pageNumber, Integer pageSize, UUID filterSimCardId) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/sim_card_data_usage_notifications";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[number]", pageNumber));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[sim_card_id]", filterSimCardId));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    GenericType<ListDataUsageNotifications200Response> localVarReturnType = new GenericType<ListDataUsageNotifications200Response>() {};

    return apiClient.invokeAPI("SimCardsApi.listDataUsageNotifications", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
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
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public PostSimCardDataUsageNotification201Response patchSimCardDataUsageNotification(UUID id, SimCardDataUsageNotification simCardDataUsageNotification) throws ApiException {
    return patchSimCardDataUsageNotificationWithHttpInfo(id, simCardDataUsageNotification).getData();
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
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<PostSimCardDataUsageNotification201Response> patchSimCardDataUsageNotificationWithHttpInfo(UUID id, SimCardDataUsageNotification simCardDataUsageNotification) throws ApiException {
    Object localVarPostBody = simCardDataUsageNotification;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling patchSimCardDataUsageNotification");
    }
    
    // verify the required parameter 'simCardDataUsageNotification' is set
    if (simCardDataUsageNotification == null) {
      throw new ApiException(400, "Missing the required parameter 'simCardDataUsageNotification' when calling patchSimCardDataUsageNotification");
    }
    
    // create path and map variables
    String localVarPath = "/sim_card_data_usage_notifications/{id}"
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

    GenericType<PostSimCardDataUsageNotification201Response> localVarReturnType = new GenericType<PostSimCardDataUsageNotification201Response>() {};

    return apiClient.invokeAPI("SimCardsApi.patchSimCardDataUsageNotification", localVarPath, "PATCH", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
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
       <tr><td> 201 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public PostSimCardDataUsageNotification201Response postSimCardDataUsageNotification(PostSimCardDataUsageNotificationRequest postSimCardDataUsageNotificationRequest) throws ApiException {
    return postSimCardDataUsageNotificationWithHttpInfo(postSimCardDataUsageNotificationRequest).getData();
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
       <tr><td> 201 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<PostSimCardDataUsageNotification201Response> postSimCardDataUsageNotificationWithHttpInfo(PostSimCardDataUsageNotificationRequest postSimCardDataUsageNotificationRequest) throws ApiException {
    Object localVarPostBody = postSimCardDataUsageNotificationRequest;
    
    // verify the required parameter 'postSimCardDataUsageNotificationRequest' is set
    if (postSimCardDataUsageNotificationRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'postSimCardDataUsageNotificationRequest' when calling postSimCardDataUsageNotification");
    }
    
    // create path and map variables
    String localVarPath = "/sim_card_data_usage_notifications";

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

    GenericType<PostSimCardDataUsageNotification201Response> localVarReturnType = new GenericType<PostSimCardDataUsageNotification201Response>() {};

    return apiClient.invokeAPI("SimCardsApi.postSimCardDataUsageNotification", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
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
     </table>
   */
  public PurchaseESim202Response purchaseESim(ESimPurchase esimPurchase) throws ApiException {
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
     </table>
   */
  public ApiResponse<PurchaseESim202Response> purchaseESimWithHttpInfo(ESimPurchase esimPurchase) throws ApiException {
    Object localVarPostBody = esimPurchase;
    
    // verify the required parameter 'esimPurchase' is set
    if (esimPurchase == null) {
      throw new ApiException(400, "Missing the required parameter 'esimPurchase' when calling purchaseESim");
    }
    
    // create path and map variables
    String localVarPath = "/actions/purchase/esims";

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

    GenericType<PurchaseESim202Response> localVarReturnType = new GenericType<PurchaseESim202Response>() {};

    return apiClient.invokeAPI("SimCardsApi.purchaseESim", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Set network preferences
   * This API allows setting or updating a SIM card network preference. &lt;br/&gt;&lt;br/&gt; Every SIM card has default network preferences defined on Telnyx. These preferences will determine how a SIMCard will connect to the network by considering a list of preferable operators.&lt;br/&gt;&lt;br/&gt; There can be multiple scenarios where an operator can be preferred over another, for example, when a specific mobile operator can provide better network latency or better pricing. 
   * @param simCardId Identifies a SIM card. (required)
   * @param putSimCardNetworkPreferencesRequest  (optional)
   * @return GetSimCardNetworkPreferences200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 202 </td><td> A successful network preferences definition response. &lt;br/&gt;&lt;br/&gt; The sent mobile_network_operators_preferences parameter won&#39;t be applied to the main resource right away - this is an asynchronous operation. While interacting with this API, you will face the following scenarios:    * The first request for this API will return an empty mobile_network_operators_preferences with an in-progress OTA update resource in the ota_updates node containing the exact sent parameters to indicate the operation progress. The value will be applied to the principal object when the OTA update finishes its processing, thus indicating the SIM card network preference current state.    * The subsequent requests will contain the current state, that is what&#39;s applied to the SIM card settings, and return the related OTA update in the ota_updates node.    The returned OTA updated (present in the ota_updates node) will, by default, be the resource related to the operation, not all of them. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public GetSimCardNetworkPreferences200Response putSimCardNetworkPreferences(UUID simCardId, PutSimCardNetworkPreferencesRequest putSimCardNetworkPreferencesRequest) throws ApiException {
    return putSimCardNetworkPreferencesWithHttpInfo(simCardId, putSimCardNetworkPreferencesRequest).getData();
  }

  /**
   * Set network preferences
   * This API allows setting or updating a SIM card network preference. &lt;br/&gt;&lt;br/&gt; Every SIM card has default network preferences defined on Telnyx. These preferences will determine how a SIMCard will connect to the network by considering a list of preferable operators.&lt;br/&gt;&lt;br/&gt; There can be multiple scenarios where an operator can be preferred over another, for example, when a specific mobile operator can provide better network latency or better pricing. 
   * @param simCardId Identifies a SIM card. (required)
   * @param putSimCardNetworkPreferencesRequest  (optional)
   * @return ApiResponse&lt;GetSimCardNetworkPreferences200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 202 </td><td> A successful network preferences definition response. &lt;br/&gt;&lt;br/&gt; The sent mobile_network_operators_preferences parameter won&#39;t be applied to the main resource right away - this is an asynchronous operation. While interacting with this API, you will face the following scenarios:    * The first request for this API will return an empty mobile_network_operators_preferences with an in-progress OTA update resource in the ota_updates node containing the exact sent parameters to indicate the operation progress. The value will be applied to the principal object when the OTA update finishes its processing, thus indicating the SIM card network preference current state.    * The subsequent requests will contain the current state, that is what&#39;s applied to the SIM card settings, and return the related OTA update in the ota_updates node.    The returned OTA updated (present in the ota_updates node) will, by default, be the resource related to the operation, not all of them. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GetSimCardNetworkPreferences200Response> putSimCardNetworkPreferencesWithHttpInfo(UUID simCardId, PutSimCardNetworkPreferencesRequest putSimCardNetworkPreferencesRequest) throws ApiException {
    Object localVarPostBody = putSimCardNetworkPreferencesRequest;
    
    // verify the required parameter 'simCardId' is set
    if (simCardId == null) {
      throw new ApiException(400, "Missing the required parameter 'simCardId' when calling putSimCardNetworkPreferences");
    }
    
    // create path and map variables
    String localVarPath = "/sim_cards/{sim_card_id}/network_preferences"
      .replaceAll("\\{" + "sim_card_id" + "\\}", apiClient.escapeString(simCardId.toString()));

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

    GenericType<GetSimCardNetworkPreferences200Response> localVarReturnType = new GenericType<GetSimCardNetworkPreferences200Response>() {};

    return apiClient.invokeAPI("SimCardsApi.putSimCardNetworkPreferences", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
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
     </table>
   */
  public PurchaseESim202Response registerSimCards(SIMCardRegistration siMCardRegistration) throws ApiException {
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
     </table>
   */
  public ApiResponse<PurchaseESim202Response> registerSimCardsWithHttpInfo(SIMCardRegistration siMCardRegistration) throws ApiException {
    Object localVarPostBody = siMCardRegistration;
    
    // verify the required parameter 'siMCardRegistration' is set
    if (siMCardRegistration == null) {
      throw new ApiException(400, "Missing the required parameter 'siMCardRegistration' when calling registerSimCards");
    }
    
    // create path and map variables
    String localVarPath = "/actions/register/sim_cards";

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

    GenericType<PurchaseESim202Response> localVarReturnType = new GenericType<PurchaseESim202Response>() {};

    return apiClient.invokeAPI("SimCardsApi.registerSimCards", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Request removing a SIM card public IP
   * This API removes an existing public IP from a SIM card. &lt;br/&gt;&lt;br/&gt;  The API will trigger an asynchronous operation called a SIM Card Action. The status of the SIM Card Action can be followed through the [List SIM Card Action](https://developersdev.telnyx.com/docs/api/v2/wireless/SIM-Card-Actions#ListSIMCardActions) API.
   * @param id Identifies the resource. (required)
   * @return GetSimCardAction200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 202 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public GetSimCardAction200Response removeSimCardPublicIp(UUID id) throws ApiException {
    return removeSimCardPublicIpWithHttpInfo(id).getData();
  }

  /**
   * Request removing a SIM card public IP
   * This API removes an existing public IP from a SIM card. &lt;br/&gt;&lt;br/&gt;  The API will trigger an asynchronous operation called a SIM Card Action. The status of the SIM Card Action can be followed through the [List SIM Card Action](https://developersdev.telnyx.com/docs/api/v2/wireless/SIM-Card-Actions#ListSIMCardActions) API.
   * @param id Identifies the resource. (required)
   * @return ApiResponse&lt;GetSimCardAction200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 202 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GetSimCardAction200Response> removeSimCardPublicIpWithHttpInfo(UUID id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling removeSimCardPublicIp");
    }
    
    // create path and map variables
    String localVarPath = "/sim_cards/{id}/actions/remove_public_ip"
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

    GenericType<GetSimCardAction200Response> localVarReturnType = new GenericType<GetSimCardAction200Response>() {};

    return apiClient.invokeAPI("SimCardsApi.removeSimCardPublicIp", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Create or update network preferences for a SIM card
   * This API sets network preferences for a SIM card.&lt;br/&gt; Every SIM card has default network preferences defined on Telnyx. These preferences will determine how a SIMCard will connect to the network by considering a list of preferable operators.&lt;br/&gt;&lt;br/&gt; The SIM card needs to be attached to the network so this can connect and SMS must be available, otherwise, the operation will fail. This preference will only be respected if the network is available, otherwise the strongest signal will be used. &lt;br/&gt;&lt;br/&gt; The API will trigger an asynchronous operation called a SIM Card Action. Creating network preferences may take a period of time. The status of the SIM Card Action can be followed through the [List SIM Card Action](https://developersdev.telnyx.com/docs/api/v2/wireless/SIM-Card-Actions#ListSIMCardActions) API. 
   * @param id Identifies the resource. (required)
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
  public GetSimCardAction200Response setNetworkPreference(UUID id) throws ApiException {
    return setNetworkPreferenceWithHttpInfo(id).getData();
  }

  /**
   * Create or update network preferences for a SIM card
   * This API sets network preferences for a SIM card.&lt;br/&gt; Every SIM card has default network preferences defined on Telnyx. These preferences will determine how a SIMCard will connect to the network by considering a list of preferable operators.&lt;br/&gt;&lt;br/&gt; The SIM card needs to be attached to the network so this can connect and SMS must be available, otherwise, the operation will fail. This preference will only be respected if the network is available, otherwise the strongest signal will be used. &lt;br/&gt;&lt;br/&gt; The API will trigger an asynchronous operation called a SIM Card Action. Creating network preferences may take a period of time. The status of the SIM Card Action can be followed through the [List SIM Card Action](https://developersdev.telnyx.com/docs/api/v2/wireless/SIM-Card-Actions#ListSIMCardActions) API. 
   * @param id Identifies the resource. (required)
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
  public ApiResponse<GetSimCardAction200Response> setNetworkPreferenceWithHttpInfo(UUID id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling setNetworkPreference");
    }
    
    // create path and map variables
    String localVarPath = "/sim_cards/{id}/actions/set_network_preferences"
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

    GenericType<GetSimCardAction200Response> localVarReturnType = new GenericType<GetSimCardAction200Response>() {};

    return apiClient.invokeAPI("SimCardsApi.setNetworkPreference", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Request bulk setting of network preferences for SIM cards.
   * This API triggers an asynchronous operation to set network preferences for each of the specified SIM cards.&lt;br/&gt; For each SIM Card a SIM Card Action will be generated. The status of the SIM Card Action can be followed through the [List SIM Card Action](https://developersdev.telnyx.com/docs/api/v2/wireless/SIM-Card-Actions#ListSIMCardActions) API. 
   * @param setNetworkPreferencesBulkRequest  (optional)
   * @return SetNetworkPreferencesBulk202Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 202 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check the &#39;detail&#39; field in response for details. </td><td>  -  </td></tr>
     </table>
   */
  public SetNetworkPreferencesBulk202Response setNetworkPreferencesBulk(SetNetworkPreferencesBulkRequest setNetworkPreferencesBulkRequest) throws ApiException {
    return setNetworkPreferencesBulkWithHttpInfo(setNetworkPreferencesBulkRequest).getData();
  }

  /**
   * Request bulk setting of network preferences for SIM cards.
   * This API triggers an asynchronous operation to set network preferences for each of the specified SIM cards.&lt;br/&gt; For each SIM Card a SIM Card Action will be generated. The status of the SIM Card Action can be followed through the [List SIM Card Action](https://developersdev.telnyx.com/docs/api/v2/wireless/SIM-Card-Actions#ListSIMCardActions) API. 
   * @param setNetworkPreferencesBulkRequest  (optional)
   * @return ApiResponse&lt;SetNetworkPreferencesBulk202Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 202 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check the &#39;detail&#39; field in response for details. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<SetNetworkPreferencesBulk202Response> setNetworkPreferencesBulkWithHttpInfo(SetNetworkPreferencesBulkRequest setNetworkPreferencesBulkRequest) throws ApiException {
    Object localVarPostBody = setNetworkPreferencesBulkRequest;
    
    // create path and map variables
    String localVarPath = "/sim_cards/actions/bulk_set_network_preferences";

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

    GenericType<SetNetworkPreferencesBulk202Response> localVarReturnType = new GenericType<SetNetworkPreferencesBulk202Response>() {};

    return apiClient.invokeAPI("SimCardsApi.setNetworkPreferencesBulk", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Request bulk setting SIM card public IPs.
   * This API triggers an asynchronous operation to set a public IP for each of the specified SIM cards.&lt;br/&gt; For each SIM Card a SIM Card Action will be generated. The status of the SIM Card Action can be followed through the [List SIM Card Action](https://developersdev.telnyx.com/docs/api/v2/wireless/SIM-Card-Actions#ListSIMCardActions) API. 
   * @param setNetworkPreferencesBulkRequest  (optional)
   * @return SetNetworkPreferencesBulk202Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 202 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check the &#39;detail&#39; field in response for details. </td><td>  -  </td></tr>
     </table>
   */
  public SetNetworkPreferencesBulk202Response setPublicIPsBulk(SetNetworkPreferencesBulkRequest setNetworkPreferencesBulkRequest) throws ApiException {
    return setPublicIPsBulkWithHttpInfo(setNetworkPreferencesBulkRequest).getData();
  }

  /**
   * Request bulk setting SIM card public IPs.
   * This API triggers an asynchronous operation to set a public IP for each of the specified SIM cards.&lt;br/&gt; For each SIM Card a SIM Card Action will be generated. The status of the SIM Card Action can be followed through the [List SIM Card Action](https://developersdev.telnyx.com/docs/api/v2/wireless/SIM-Card-Actions#ListSIMCardActions) API. 
   * @param setNetworkPreferencesBulkRequest  (optional)
   * @return ApiResponse&lt;SetNetworkPreferencesBulk202Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 202 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check the &#39;detail&#39; field in response for details. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<SetNetworkPreferencesBulk202Response> setPublicIPsBulkWithHttpInfo(SetNetworkPreferencesBulkRequest setNetworkPreferencesBulkRequest) throws ApiException {
    Object localVarPostBody = setNetworkPreferencesBulkRequest;
    
    // create path and map variables
    String localVarPath = "/sim_cards/actions/bulk_set_public_ips";

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

    GenericType<SetNetworkPreferencesBulk202Response> localVarReturnType = new GenericType<SetNetworkPreferencesBulk202Response>() {};

    return apiClient.invokeAPI("SimCardsApi.setPublicIPsBulk", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Request setting a SIM card public IP
   * This API makes a SIM card reachable on the public internet by mapping a random public IP to the SIM card. &lt;br/&gt;&lt;br/&gt;  The API will trigger an asynchronous operation called a SIM Card Action. The status of the SIM Card Action can be followed through the [List SIM Card Action](https://developersdev.telnyx.com/docs/api/v2/wireless/SIM-Card-Actions#ListSIMCardActions) API. &lt;br/&gt;&lt;br/&gt;  Setting a Public IP to a SIM Card incurs a charge and will only succeed if the account has sufficient funds.
   * @param id Identifies the resource. (required)
   * @return GetSimCardAction200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 202 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public GetSimCardAction200Response setSimCardPublicIp(UUID id) throws ApiException {
    return setSimCardPublicIpWithHttpInfo(id).getData();
  }

  /**
   * Request setting a SIM card public IP
   * This API makes a SIM card reachable on the public internet by mapping a random public IP to the SIM card. &lt;br/&gt;&lt;br/&gt;  The API will trigger an asynchronous operation called a SIM Card Action. The status of the SIM Card Action can be followed through the [List SIM Card Action](https://developersdev.telnyx.com/docs/api/v2/wireless/SIM-Card-Actions#ListSIMCardActions) API. &lt;br/&gt;&lt;br/&gt;  Setting a Public IP to a SIM Card incurs a charge and will only succeed if the account has sufficient funds.
   * @param id Identifies the resource. (required)
   * @return ApiResponse&lt;GetSimCardAction200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 202 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GetSimCardAction200Response> setSimCardPublicIpWithHttpInfo(UUID id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling setSimCardPublicIp");
    }
    
    // create path and map variables
    String localVarPath = "/sim_cards/{id}/actions/set_public_ip"
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

    GenericType<GetSimCardAction200Response> localVarReturnType = new GenericType<GetSimCardAction200Response>() {};

    return apiClient.invokeAPI("SimCardsApi.setSimCardPublicIp", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Request setting a SIM card to standby
   * The SIM card will be able to connect to the network once the process to set it to standby has been completed, thus making it possible to consume data.&lt;br/&gt; To set a SIM card to standby, it must be associated with SIM card group.&lt;br/&gt; The API will trigger an asynchronous operation called a SIM Card Action. Transitioning to the standby state may take a period of time. The status of the SIM Card Action can be followed through the [List SIM Card Action](https://developersdev.telnyx.com/docs/api/v2/wireless/SIM-Card-Actions#ListSIMCardActions) API. 
   * @param id Identifies the resource. (required)
   * @return GetSimCardAction200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 202 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public GetSimCardAction200Response setSimCardStandby(UUID id) throws ApiException {
    return setSimCardStandbyWithHttpInfo(id).getData();
  }

  /**
   * Request setting a SIM card to standby
   * The SIM card will be able to connect to the network once the process to set it to standby has been completed, thus making it possible to consume data.&lt;br/&gt; To set a SIM card to standby, it must be associated with SIM card group.&lt;br/&gt; The API will trigger an asynchronous operation called a SIM Card Action. Transitioning to the standby state may take a period of time. The status of the SIM Card Action can be followed through the [List SIM Card Action](https://developersdev.telnyx.com/docs/api/v2/wireless/SIM-Card-Actions#ListSIMCardActions) API. 
   * @param id Identifies the resource. (required)
   * @return ApiResponse&lt;GetSimCardAction200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 202 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GetSimCardAction200Response> setSimCardStandbyWithHttpInfo(UUID id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling setSimCardStandby");
    }
    
    // create path and map variables
    String localVarPath = "/sim_cards/{id}/actions/set_standby"
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

    GenericType<GetSimCardAction200Response> localVarReturnType = new GenericType<GetSimCardAction200Response>() {};

    return apiClient.invokeAPI("SimCardsApi.setSimCardStandby", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Update a SIM card
   * Updates SIM card data
   * @param id Identifies the resource. (required)
   * @param siMCard  (required)
   * @return GetSimCard200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public GetSimCard200Response updateSimCard(UUID id, SIMCard siMCard) throws ApiException {
    return updateSimCardWithHttpInfo(id, siMCard).getData();
  }

  /**
   * Update a SIM card
   * Updates SIM card data
   * @param id Identifies the resource. (required)
   * @param siMCard  (required)
   * @return ApiResponse&lt;GetSimCard200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GetSimCard200Response> updateSimCardWithHttpInfo(UUID id, SIMCard siMCard) throws ApiException {
    Object localVarPostBody = siMCard;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling updateSimCard");
    }
    
    // verify the required parameter 'siMCard' is set
    if (siMCard == null) {
      throw new ApiException(400, "Missing the required parameter 'siMCard' when calling updateSimCard");
    }
    
    // create path and map variables
    String localVarPath = "/sim_cards/{id}"
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

    GenericType<GetSimCard200Response> localVarReturnType = new GenericType<GetSimCard200Response>() {};

    return apiClient.invokeAPI("SimCardsApi.updateSimCard", localVarPath, "PATCH", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
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
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public SIMCardRegistrationCodeValidations validateRegistrationCodes(ValidateRegistrationCodesRequest validateRegistrationCodesRequest) throws ApiException {
    return validateRegistrationCodesWithHttpInfo(validateRegistrationCodesRequest).getData();
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
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<SIMCardRegistrationCodeValidations> validateRegistrationCodesWithHttpInfo(ValidateRegistrationCodesRequest validateRegistrationCodesRequest) throws ApiException {
    Object localVarPostBody = validateRegistrationCodesRequest;
    
    // verify the required parameter 'validateRegistrationCodesRequest' is set
    if (validateRegistrationCodesRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'validateRegistrationCodesRequest' when calling validateRegistrationCodes");
    }
    
    // create path and map variables
    String localVarPath = "/sim_cards/actions/validate_registration_codes";

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

    GenericType<SIMCardRegistrationCodeValidations> localVarReturnType = new GenericType<SIMCardRegistrationCodeValidations>() {};

    return apiClient.invokeAPI("SimCardsApi.validateRegistrationCodes", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
