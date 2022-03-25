package com.telnyx.sdk.api;

import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.Pair;

import javax.ws.rs.core.GenericType;

import com.telnyx.sdk.model.BulkSIMCardNetworkPreferenceResponse;
import com.telnyx.sdk.model.BulkUpdateSimNetworkPreference;
import com.telnyx.sdk.model.CreateSIMCardDataUsageNotificationRequest;
import com.telnyx.sdk.model.CreateSIMCardValidateRequest;
import com.telnyx.sdk.model.CreateSimCardDataUsageNotificationResponse;
import com.telnyx.sdk.model.DeleteSIMCardNetworkPreferenceResponse;
import com.telnyx.sdk.model.DeleteSimCardDataUsageNotificationResponse;
import com.telnyx.sdk.model.DeleteSimCardResponse;
import com.telnyx.sdk.model.Error;
import com.telnyx.sdk.model.Errors;
import com.telnyx.sdk.model.GetSimCardDataUsageNotificationResponse;
import com.telnyx.sdk.model.GetSimCardResponse;
import com.telnyx.sdk.model.PUTSIMCardNetworkPreferenceResponse;
import com.telnyx.sdk.model.PutNetworkPreferenceRequest;
import com.telnyx.sdk.model.RegisterSimCardsResponse;
import com.telnyx.sdk.model.SIMCard;
import com.telnyx.sdk.model.SIMCardActionResponse;
import com.telnyx.sdk.model.SIMCardNetworkPreferenceWithOTAUpdatesResponse;
import com.telnyx.sdk.model.SIMCardPublicIPResponse;
import com.telnyx.sdk.model.SIMCardRegistration;
import com.telnyx.sdk.model.SIMCardRegistrationCodeValidations;
import com.telnyx.sdk.model.SearchSimCardsResponse;
import com.telnyx.sdk.model.SimCardDataUsageNotification;
import com.telnyx.sdk.model.SimCardDataUsageNotificationCollection;
import java.util.UUID;
import com.telnyx.sdk.model.UpdateSimCardDataUsageNotificationResponse;
import com.telnyx.sdk.model.UpdateSimCardResponse;
import com.telnyx.sdk.model.WirelessConnectivityLogCollectionResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
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
   * @param bulkUpdateSimNetworkPreference  (optional)
   * @return BulkSIMCardNetworkPreferenceResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 202 </td><td>  </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check the &#39;detail&#39; field in response for details. </td><td>  -  </td></tr>
     </table>
   */
  public BulkSIMCardNetworkPreferenceResponse bulkSIMCardNetworkPreferences(BulkUpdateSimNetworkPreference bulkUpdateSimNetworkPreference) throws ApiException {
    return bulkSIMCardNetworkPreferencesWithHttpInfo(bulkUpdateSimNetworkPreference).getData();
  }

  /**
   * Bulk Network Preferences for SIM cards
   * This API allows dispatching the same operation described for the PUT sim_cards/:sim_card_id/network_preferences API for multiple SIM cards at once.&lt;br/&gt;&lt;br/&gt; Although, a SIM card network preference may fail individually under any validation triggered as a consequence of its state. For example, a SIM can&#39;t have an in-progress OTA update for applying a Network Preference, so they&#39;ll fail when requested in this API. In that scenario, the specific error will be present in the response along with the successful definitions in the \&quot;errors\&quot; response node. 
   * @param bulkUpdateSimNetworkPreference  (optional)
   * @return ApiResponse&lt;BulkSIMCardNetworkPreferenceResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 202 </td><td>  </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check the &#39;detail&#39; field in response for details. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<BulkSIMCardNetworkPreferenceResponse> bulkSIMCardNetworkPreferencesWithHttpInfo(BulkUpdateSimNetworkPreference bulkUpdateSimNetworkPreference) throws ApiException {
    Object localVarPostBody = bulkUpdateSimNetworkPreference;
    
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

    GenericType<BulkSIMCardNetworkPreferenceResponse> localVarReturnType = new GenericType<BulkSIMCardNetworkPreferenceResponse>() {};

    return apiClient.invokeAPI("SimCardsApi.bulkSIMCardNetworkPreferences", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * List SIM card data usage notifications
   * Lists a paginated collection of SIM card data usage notifications. It enables exploring the collection using specific filters.
   * @param pageNumber The page number to load (optional, default to 1)
   * @param pageSize The size of the page (optional, default to 20)
   * @param filterSimCardId A valid SIM card ID. (optional)
   * @return SimCardDataUsageNotificationCollection
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public SimCardDataUsageNotificationCollection listSimCardDataUsageNotifications(Integer pageNumber, Integer pageSize, UUID filterSimCardId) throws ApiException {
    return listSimCardDataUsageNotificationsWithHttpInfo(pageNumber, pageSize, filterSimCardId).getData();
  }

  /**
   * List SIM card data usage notifications
   * Lists a paginated collection of SIM card data usage notifications. It enables exploring the collection using specific filters.
   * @param pageNumber The page number to load (optional, default to 1)
   * @param pageSize The size of the page (optional, default to 20)
   * @param filterSimCardId A valid SIM card ID. (optional)
   * @return ApiResponse&lt;SimCardDataUsageNotificationCollection&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<SimCardDataUsageNotificationCollection> listSimCardDataUsageNotificationsWithHttpInfo(Integer pageNumber, Integer pageSize, UUID filterSimCardId) throws ApiException {
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

    GenericType<SimCardDataUsageNotificationCollection> localVarReturnType = new GenericType<SimCardDataUsageNotificationCollection>() {};

    return apiClient.invokeAPI("SimCardsApi.listSimCardDataUsageNotifications", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Validate SIM cards registration codes
   * It validates whether SIM card registration codes are valid or not.
   * @param createSIMCardValidateRequest  (required)
   * @return SIMCardRegistrationCodeValidations
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public SIMCardRegistrationCodeValidations postValidateRegistrationCodes(CreateSIMCardValidateRequest createSIMCardValidateRequest) throws ApiException {
    return postValidateRegistrationCodesWithHttpInfo(createSIMCardValidateRequest).getData();
  }

  /**
   * Validate SIM cards registration codes
   * It validates whether SIM card registration codes are valid or not.
   * @param createSIMCardValidateRequest  (required)
   * @return ApiResponse&lt;SIMCardRegistrationCodeValidations&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<SIMCardRegistrationCodeValidations> postValidateRegistrationCodesWithHttpInfo(CreateSIMCardValidateRequest createSIMCardValidateRequest) throws ApiException {
    Object localVarPostBody = createSIMCardValidateRequest;
    
    // verify the required parameter 'createSIMCardValidateRequest' is set
    if (createSIMCardValidateRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'createSIMCardValidateRequest' when calling postValidateRegistrationCodes");
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

    return apiClient.invokeAPI("SimCardsApi.postValidateRegistrationCodes", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Request removing a SIM card public IP
   * This API removes an existing public IP from a SIM card. &lt;br/&gt;&lt;br/&gt;  The API will trigger an asynchronous operation called a SIM Card Action. The status of the SIM Card Action can be followed through the [List SIM Card Action](https://developers.telnyx.com/docs/api/v2/wireless/SIM-Card-Actions#ListSIMCardActions) API.
   * @param id Identifies the resource. (required)
   * @return SIMCardActionResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 202 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public SIMCardActionResponse removeSIMCardPublicIP(UUID id) throws ApiException {
    return removeSIMCardPublicIPWithHttpInfo(id).getData();
  }

  /**
   * Request removing a SIM card public IP
   * This API removes an existing public IP from a SIM card. &lt;br/&gt;&lt;br/&gt;  The API will trigger an asynchronous operation called a SIM Card Action. The status of the SIM Card Action can be followed through the [List SIM Card Action](https://developers.telnyx.com/docs/api/v2/wireless/SIM-Card-Actions#ListSIMCardActions) API.
   * @param id Identifies the resource. (required)
   * @return ApiResponse&lt;SIMCardActionResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 202 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<SIMCardActionResponse> removeSIMCardPublicIPWithHttpInfo(UUID id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling removeSIMCardPublicIP");
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

    GenericType<SIMCardActionResponse> localVarReturnType = new GenericType<SIMCardActionResponse>() {};

    return apiClient.invokeAPI("SimCardsApi.removeSIMCardPublicIP", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * DELETE network preferences
   * This API asynchronously removes the custom-defined network preferences settings. After this operation is done the Telnyx default settings, the same applied for an unaltered SIM card, will be in place. 
   * @param simCardId Identifies a SIM card. (required)
   * @return DeleteSIMCardNetworkPreferenceResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 202 </td><td> A successful network preferences deletion response. &lt;br/&gt;&lt;br/&gt; The delete won&#39;t be done right away - this is an asynchronous operation. The request will return the resource with an in-progress OTA update resource (in the ota_updates node) representing the delete operation. Similarly to the PUT API, the resource will only be deleted when the OTA updated is successfully completed. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public DeleteSIMCardNetworkPreferenceResponse sIMCardNetworkPreferencesDelete(UUID simCardId) throws ApiException {
    return sIMCardNetworkPreferencesDeleteWithHttpInfo(simCardId).getData();
  }

  /**
   * DELETE network preferences
   * This API asynchronously removes the custom-defined network preferences settings. After this operation is done the Telnyx default settings, the same applied for an unaltered SIM card, will be in place. 
   * @param simCardId Identifies a SIM card. (required)
   * @return ApiResponse&lt;DeleteSIMCardNetworkPreferenceResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 202 </td><td> A successful network preferences deletion response. &lt;br/&gt;&lt;br/&gt; The delete won&#39;t be done right away - this is an asynchronous operation. The request will return the resource with an in-progress OTA update resource (in the ota_updates node) representing the delete operation. Similarly to the PUT API, the resource will only be deleted when the OTA updated is successfully completed. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<DeleteSIMCardNetworkPreferenceResponse> sIMCardNetworkPreferencesDeleteWithHttpInfo(UUID simCardId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'simCardId' is set
    if (simCardId == null) {
      throw new ApiException(400, "Missing the required parameter 'simCardId' when calling sIMCardNetworkPreferencesDelete");
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

    GenericType<DeleteSIMCardNetworkPreferenceResponse> localVarReturnType = new GenericType<DeleteSIMCardNetworkPreferenceResponse>() {};

    return apiClient.invokeAPI("SimCardsApi.sIMCardNetworkPreferencesDelete", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get network preferences
   * It returns the network preferences currently applied in the SIM card. 
   * @param simCardId Identifies a SIM card. (required)
   * @param includeOtaUpdates It includes the associated OTA update objects in the response when present. (optional, default to false)
   * @return SIMCardNetworkPreferenceWithOTAUpdatesResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A successful network preferences definition response. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public SIMCardNetworkPreferenceWithOTAUpdatesResponse sIMCardNetworkPreferencesGet(UUID simCardId, Boolean includeOtaUpdates) throws ApiException {
    return sIMCardNetworkPreferencesGetWithHttpInfo(simCardId, includeOtaUpdates).getData();
  }

  /**
   * Get network preferences
   * It returns the network preferences currently applied in the SIM card. 
   * @param simCardId Identifies a SIM card. (required)
   * @param includeOtaUpdates It includes the associated OTA update objects in the response when present. (optional, default to false)
   * @return ApiResponse&lt;SIMCardNetworkPreferenceWithOTAUpdatesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A successful network preferences definition response. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<SIMCardNetworkPreferenceWithOTAUpdatesResponse> sIMCardNetworkPreferencesGetWithHttpInfo(UUID simCardId, Boolean includeOtaUpdates) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'simCardId' is set
    if (simCardId == null) {
      throw new ApiException(400, "Missing the required parameter 'simCardId' when calling sIMCardNetworkPreferencesGet");
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

    GenericType<SIMCardNetworkPreferenceWithOTAUpdatesResponse> localVarReturnType = new GenericType<SIMCardNetworkPreferenceWithOTAUpdatesResponse>() {};

    return apiClient.invokeAPI("SimCardsApi.sIMCardNetworkPreferencesGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Set network preferences
   * This API allows setting or updating a SIM card network preference. &lt;br/&gt;&lt;br/&gt; Every SIM card has default network preferences defined on Telnyx. These preferences will determine how a SIMCard will connect to the network by considering a list of preferable operators.&lt;br/&gt;&lt;br/&gt; There can be multiple scenarios where an operator can be preferred over another, for example, when a specific mobile operator can provide better network latency or better pricing. 
   * @param simCardId Identifies a SIM card. (required)
   * @param putNetworkPreferenceRequest  (optional)
   * @return PUTSIMCardNetworkPreferenceResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 202 </td><td> A successful network preferences definition response. &lt;br/&gt;&lt;br/&gt; The sent mobile_operator_networks_preferences parameter won&#39;t be applied to the main resource right away - this is an asynchronous operation. While interacting with this API, you will face the following scenarios:    * The first request for this API will return an empty mobile_operator_networks_preferences with an in-progress OTA update resource in the ota_updates node containing the exact sent parameters to indicate the operation progress. The value will be applied to the principal object when the OTA update finishes its processing, thus indicating the SIM card network preference current state.    * The subsequent requests will contain the current state, that is what&#39;s applied to the SIM card settings, and return the related OTA update in the ota_updates node.    The returned OTA updated (present in the ota_updates node) will, by default, be the resource related to the operation, not all of them. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public PUTSIMCardNetworkPreferenceResponse sIMCardNetworkPreferencesPut(UUID simCardId, PutNetworkPreferenceRequest putNetworkPreferenceRequest) throws ApiException {
    return sIMCardNetworkPreferencesPutWithHttpInfo(simCardId, putNetworkPreferenceRequest).getData();
  }

  /**
   * Set network preferences
   * This API allows setting or updating a SIM card network preference. &lt;br/&gt;&lt;br/&gt; Every SIM card has default network preferences defined on Telnyx. These preferences will determine how a SIMCard will connect to the network by considering a list of preferable operators.&lt;br/&gt;&lt;br/&gt; There can be multiple scenarios where an operator can be preferred over another, for example, when a specific mobile operator can provide better network latency or better pricing. 
   * @param simCardId Identifies a SIM card. (required)
   * @param putNetworkPreferenceRequest  (optional)
   * @return ApiResponse&lt;PUTSIMCardNetworkPreferenceResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 202 </td><td> A successful network preferences definition response. &lt;br/&gt;&lt;br/&gt; The sent mobile_operator_networks_preferences parameter won&#39;t be applied to the main resource right away - this is an asynchronous operation. While interacting with this API, you will face the following scenarios:    * The first request for this API will return an empty mobile_operator_networks_preferences with an in-progress OTA update resource in the ota_updates node containing the exact sent parameters to indicate the operation progress. The value will be applied to the principal object when the OTA update finishes its processing, thus indicating the SIM card network preference current state.    * The subsequent requests will contain the current state, that is what&#39;s applied to the SIM card settings, and return the related OTA update in the ota_updates node.    The returned OTA updated (present in the ota_updates node) will, by default, be the resource related to the operation, not all of them. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<PUTSIMCardNetworkPreferenceResponse> sIMCardNetworkPreferencesPutWithHttpInfo(UUID simCardId, PutNetworkPreferenceRequest putNetworkPreferenceRequest) throws ApiException {
    Object localVarPostBody = putNetworkPreferenceRequest;
    
    // verify the required parameter 'simCardId' is set
    if (simCardId == null) {
      throw new ApiException(400, "Missing the required parameter 'simCardId' when calling sIMCardNetworkPreferencesPut");
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

    GenericType<PUTSIMCardNetworkPreferenceResponse> localVarReturnType = new GenericType<PUTSIMCardNetworkPreferenceResponse>() {};

    return apiClient.invokeAPI("SimCardsApi.sIMCardNetworkPreferencesPut", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get SIM card public IP definition
   * It returns the public IP requested for a SIM card. 
   * @param simCardId Identifies a SIM card. (required)
   * @return SIMCardPublicIPResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public SIMCardPublicIPResponse sIMCardPublicIPGet(UUID simCardId) throws ApiException {
    return sIMCardPublicIPGetWithHttpInfo(simCardId).getData();
  }

  /**
   * Get SIM card public IP definition
   * It returns the public IP requested for a SIM card. 
   * @param simCardId Identifies a SIM card. (required)
   * @return ApiResponse&lt;SIMCardPublicIPResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<SIMCardPublicIPResponse> sIMCardPublicIPGetWithHttpInfo(UUID simCardId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'simCardId' is set
    if (simCardId == null) {
      throw new ApiException(400, "Missing the required parameter 'simCardId' when calling sIMCardPublicIPGet");
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

    GenericType<SIMCardPublicIPResponse> localVarReturnType = new GenericType<SIMCardPublicIPResponse>() {};

    return apiClient.invokeAPI("SimCardsApi.sIMCardPublicIPGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Request setting a SIM card public IP
   * This API makes a SIM card reachable on the public internet by mapping a random public IP to the SIM card. &lt;br/&gt;&lt;br/&gt;  The API will trigger an asynchronous operation called a SIM Card Action. The status of the SIM Card Action can be followed through the [List SIM Card Action](https://developers.telnyx.com/docs/api/v2/wireless/SIM-Card-Actions#ListSIMCardActions) API. &lt;br/&gt;&lt;br/&gt;  Setting a Public IP to a SIM Card incurs a charge and will only succeed if the account has sufficient funds.
   * @param id Identifies the resource. (required)
   * @return SIMCardActionResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 202 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public SIMCardActionResponse setSIMCardPublicIP(UUID id) throws ApiException {
    return setSIMCardPublicIPWithHttpInfo(id).getData();
  }

  /**
   * Request setting a SIM card public IP
   * This API makes a SIM card reachable on the public internet by mapping a random public IP to the SIM card. &lt;br/&gt;&lt;br/&gt;  The API will trigger an asynchronous operation called a SIM Card Action. The status of the SIM Card Action can be followed through the [List SIM Card Action](https://developers.telnyx.com/docs/api/v2/wireless/SIM-Card-Actions#ListSIMCardActions) API. &lt;br/&gt;&lt;br/&gt;  Setting a Public IP to a SIM Card incurs a charge and will only succeed if the account has sufficient funds.
   * @param id Identifies the resource. (required)
   * @return ApiResponse&lt;SIMCardActionResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 202 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<SIMCardActionResponse> setSIMCardPublicIPWithHttpInfo(UUID id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling setSIMCardPublicIP");
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

    GenericType<SIMCardActionResponse> localVarReturnType = new GenericType<SIMCardActionResponse>() {};

    return apiClient.invokeAPI("SimCardsApi.setSIMCardPublicIP", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Delete SIM card data usage notifications
   * Delete the SIM Card Data Usage Notification.
   * @param id Identifies the resource. (required)
   * @return DeleteSimCardDataUsageNotificationResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public DeleteSimCardDataUsageNotificationResponse simCardDataUsageNotificationsDelete(UUID id) throws ApiException {
    return simCardDataUsageNotificationsDeleteWithHttpInfo(id).getData();
  }

  /**
   * Delete SIM card data usage notifications
   * Delete the SIM Card Data Usage Notification.
   * @param id Identifies the resource. (required)
   * @return ApiResponse&lt;DeleteSimCardDataUsageNotificationResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<DeleteSimCardDataUsageNotificationResponse> simCardDataUsageNotificationsDeleteWithHttpInfo(UUID id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling simCardDataUsageNotificationsDelete");
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

    GenericType<DeleteSimCardDataUsageNotificationResponse> localVarReturnType = new GenericType<DeleteSimCardDataUsageNotificationResponse>() {};

    return apiClient.invokeAPI("SimCardsApi.simCardDataUsageNotificationsDelete", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get a single SIM card data usage notification
   * Get a single SIM Card Data Usage Notification.
   * @param id Identifies the resource. (required)
   * @return GetSimCardDataUsageNotificationResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public GetSimCardDataUsageNotificationResponse simCardDataUsageNotificationsGet(UUID id) throws ApiException {
    return simCardDataUsageNotificationsGetWithHttpInfo(id).getData();
  }

  /**
   * Get a single SIM card data usage notification
   * Get a single SIM Card Data Usage Notification.
   * @param id Identifies the resource. (required)
   * @return ApiResponse&lt;GetSimCardDataUsageNotificationResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GetSimCardDataUsageNotificationResponse> simCardDataUsageNotificationsGetWithHttpInfo(UUID id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling simCardDataUsageNotificationsGet");
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

    GenericType<GetSimCardDataUsageNotificationResponse> localVarReturnType = new GenericType<GetSimCardDataUsageNotificationResponse>() {};

    return apiClient.invokeAPI("SimCardsApi.simCardDataUsageNotificationsGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Updates information for a SIM Card Data Usage Notification
   * Updates information for a SIM Card Data Usage Notification.
   * @param id Identifies the resource. (required)
   * @param simCardDataUsageNotification  (required)
   * @return UpdateSimCardDataUsageNotificationResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public UpdateSimCardDataUsageNotificationResponse simCardDataUsageNotificationsPatch(UUID id, SimCardDataUsageNotification simCardDataUsageNotification) throws ApiException {
    return simCardDataUsageNotificationsPatchWithHttpInfo(id, simCardDataUsageNotification).getData();
  }

  /**
   * Updates information for a SIM Card Data Usage Notification
   * Updates information for a SIM Card Data Usage Notification.
   * @param id Identifies the resource. (required)
   * @param simCardDataUsageNotification  (required)
   * @return ApiResponse&lt;UpdateSimCardDataUsageNotificationResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<UpdateSimCardDataUsageNotificationResponse> simCardDataUsageNotificationsPatchWithHttpInfo(UUID id, SimCardDataUsageNotification simCardDataUsageNotification) throws ApiException {
    Object localVarPostBody = simCardDataUsageNotification;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling simCardDataUsageNotificationsPatch");
    }
    
    // verify the required parameter 'simCardDataUsageNotification' is set
    if (simCardDataUsageNotification == null) {
      throw new ApiException(400, "Missing the required parameter 'simCardDataUsageNotification' when calling simCardDataUsageNotificationsPatch");
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

    GenericType<UpdateSimCardDataUsageNotificationResponse> localVarReturnType = new GenericType<UpdateSimCardDataUsageNotificationResponse>() {};

    return apiClient.invokeAPI("SimCardsApi.simCardDataUsageNotificationsPatch", localVarPath, "PATCH", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Create a new SIM card data usage notification
   * Creates a new SIM card data usage notification.
   * @param createSIMCardDataUsageNotificationRequest  (required)
   * @return CreateSimCardDataUsageNotificationResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public CreateSimCardDataUsageNotificationResponse simCardDataUsageNotificationsPost(CreateSIMCardDataUsageNotificationRequest createSIMCardDataUsageNotificationRequest) throws ApiException {
    return simCardDataUsageNotificationsPostWithHttpInfo(createSIMCardDataUsageNotificationRequest).getData();
  }

  /**
   * Create a new SIM card data usage notification
   * Creates a new SIM card data usage notification.
   * @param createSIMCardDataUsageNotificationRequest  (required)
   * @return ApiResponse&lt;CreateSimCardDataUsageNotificationResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CreateSimCardDataUsageNotificationResponse> simCardDataUsageNotificationsPostWithHttpInfo(CreateSIMCardDataUsageNotificationRequest createSIMCardDataUsageNotificationRequest) throws ApiException {
    Object localVarPostBody = createSIMCardDataUsageNotificationRequest;
    
    // verify the required parameter 'createSIMCardDataUsageNotificationRequest' is set
    if (createSIMCardDataUsageNotificationRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'createSIMCardDataUsageNotificationRequest' when calling simCardDataUsageNotificationsPost");
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

    GenericType<CreateSimCardDataUsageNotificationResponse> localVarReturnType = new GenericType<CreateSimCardDataUsageNotificationResponse>() {};

    return apiClient.invokeAPI("SimCardsApi.simCardDataUsageNotificationsPost", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Deletes a SIM card
   * The SIM card will be decommissioned, removed from your account and you will stop being charged.&lt;br /&gt;The SIM card won&#39;t be able to connect to the network after the deletion is completed, thus making it impossible to consume data.&lt;br/&gt; Transitioning to the disabled state may take a period of time.&lt;/br&gt; Until the transition is completed, the SIM card status will be disabling &lt;code&gt;disabling&lt;/code&gt;.&lt;br /&gt;In order to re-enable the SIM card, you will need to re-register it.
   * @param id Identifies the resource. (required)
   * @return DeleteSimCardResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public DeleteSimCardResponse simCardDelete(UUID id) throws ApiException {
    return simCardDeleteWithHttpInfo(id).getData();
  }

  /**
   * Deletes a SIM card
   * The SIM card will be decommissioned, removed from your account and you will stop being charged.&lt;br /&gt;The SIM card won&#39;t be able to connect to the network after the deletion is completed, thus making it impossible to consume data.&lt;br/&gt; Transitioning to the disabled state may take a period of time.&lt;/br&gt; Until the transition is completed, the SIM card status will be disabling &lt;code&gt;disabling&lt;/code&gt;.&lt;br /&gt;In order to re-enable the SIM card, you will need to re-register it.
   * @param id Identifies the resource. (required)
   * @return ApiResponse&lt;DeleteSimCardResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<DeleteSimCardResponse> simCardDeleteWithHttpInfo(UUID id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling simCardDelete");
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

    GenericType<DeleteSimCardResponse> localVarReturnType = new GenericType<DeleteSimCardResponse>() {};

    return apiClient.invokeAPI("SimCardsApi.simCardDelete", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Request a SIM card disable
   * This API disables a SIM card, disconnecting it from the network and making it impossible to consume data.&lt;br/&gt; The API will trigger an asynchronous operation called a SIM Card Action. Transitioning to the disabled state may take a period of time. The status of the SIM Card Action can be followed through the [List SIM Card Action](https://developers.telnyx.com/docs/api/v2/wireless/SIM-Card-Actions#ListSIMCardActions) API. 
   * @param id Identifies the resource. (required)
   * @return SIMCardActionResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 202 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public SIMCardActionResponse simCardDisable(UUID id) throws ApiException {
    return simCardDisableWithHttpInfo(id).getData();
  }

  /**
   * Request a SIM card disable
   * This API disables a SIM card, disconnecting it from the network and making it impossible to consume data.&lt;br/&gt; The API will trigger an asynchronous operation called a SIM Card Action. Transitioning to the disabled state may take a period of time. The status of the SIM Card Action can be followed through the [List SIM Card Action](https://developers.telnyx.com/docs/api/v2/wireless/SIM-Card-Actions#ListSIMCardActions) API. 
   * @param id Identifies the resource. (required)
   * @return ApiResponse&lt;SIMCardActionResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 202 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<SIMCardActionResponse> simCardDisableWithHttpInfo(UUID id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling simCardDisable");
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

    GenericType<SIMCardActionResponse> localVarReturnType = new GenericType<SIMCardActionResponse>() {};

    return apiClient.invokeAPI("SimCardsApi.simCardDisable", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Request a SIM card enable
   * This API enables a SIM card, connecting it to the network and making it possible to consume data.&lt;br/&gt; To enable a SIM card, it must be associated with a SIM card group.&lt;br/&gt; The API will trigger an asynchronous operation called a SIM Card Action. Transitioning to the enabled state may take a period of time. The status of the SIM Card Action can be followed through the [List SIM Card Action](https://developers.telnyx.com/docs/api/v2/wireless/SIM-Card-Actions#ListSIMCardActions) API. 
   * @param id Identifies the resource. (required)
   * @return SIMCardActionResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 202 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check the &#39;detail&#39; field in response for details. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public SIMCardActionResponse simCardEnable(UUID id) throws ApiException {
    return simCardEnableWithHttpInfo(id).getData();
  }

  /**
   * Request a SIM card enable
   * This API enables a SIM card, connecting it to the network and making it possible to consume data.&lt;br/&gt; To enable a SIM card, it must be associated with a SIM card group.&lt;br/&gt; The API will trigger an asynchronous operation called a SIM Card Action. Transitioning to the enabled state may take a period of time. The status of the SIM Card Action can be followed through the [List SIM Card Action](https://developers.telnyx.com/docs/api/v2/wireless/SIM-Card-Actions#ListSIMCardActions) API. 
   * @param id Identifies the resource. (required)
   * @return ApiResponse&lt;SIMCardActionResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 202 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check the &#39;detail&#39; field in response for details. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<SIMCardActionResponse> simCardEnableWithHttpInfo(UUID id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling simCardEnable");
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

    GenericType<SIMCardActionResponse> localVarReturnType = new GenericType<SIMCardActionResponse>() {};

    return apiClient.invokeAPI("SimCardsApi.simCardEnable", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get SIM card
   * Returns the details regarding a specific SIM card.
   * @param id Identifies the resource. (required)
   * @param includeSimCardGroup It includes the associated SIM card group object in the response when present. (optional, default to false)
   * @return GetSimCardResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public GetSimCardResponse simCardGet(UUID id, Boolean includeSimCardGroup) throws ApiException {
    return simCardGetWithHttpInfo(id, includeSimCardGroup).getData();
  }

  /**
   * Get SIM card
   * Returns the details regarding a specific SIM card.
   * @param id Identifies the resource. (required)
   * @param includeSimCardGroup It includes the associated SIM card group object in the response when present. (optional, default to false)
   * @return ApiResponse&lt;GetSimCardResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GetSimCardResponse> simCardGetWithHttpInfo(UUID id, Boolean includeSimCardGroup) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling simCardGet");
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

    GenericType<GetSimCardResponse> localVarReturnType = new GenericType<GetSimCardResponse>() {};

    return apiClient.invokeAPI("SimCardsApi.simCardGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Register SIM cards
   * Register the SIM cards associated with the provided registration codes to the current user&#39;s account.&lt;br/&gt;&lt;br/&gt; If &lt;code&gt;sim_card_group_id&lt;/code&gt; is provided, the SIM cards will be associated with that group. Otherwise, the default group for the current user will be used.&lt;br/&gt;&lt;br/&gt; 
   * @param siMCardRegistration  (required)
   * @return RegisterSimCardsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 202 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public RegisterSimCardsResponse simCardRegister(SIMCardRegistration siMCardRegistration) throws ApiException {
    return simCardRegisterWithHttpInfo(siMCardRegistration).getData();
  }

  /**
   * Register SIM cards
   * Register the SIM cards associated with the provided registration codes to the current user&#39;s account.&lt;br/&gt;&lt;br/&gt; If &lt;code&gt;sim_card_group_id&lt;/code&gt; is provided, the SIM cards will be associated with that group. Otherwise, the default group for the current user will be used.&lt;br/&gt;&lt;br/&gt; 
   * @param siMCardRegistration  (required)
   * @return ApiResponse&lt;RegisterSimCardsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 202 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<RegisterSimCardsResponse> simCardRegisterWithHttpInfo(SIMCardRegistration siMCardRegistration) throws ApiException {
    Object localVarPostBody = siMCardRegistration;
    
    // verify the required parameter 'siMCardRegistration' is set
    if (siMCardRegistration == null) {
      throw new ApiException(400, "Missing the required parameter 'siMCardRegistration' when calling simCardRegister");
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

    GenericType<RegisterSimCardsResponse> localVarReturnType = new GenericType<RegisterSimCardsResponse>() {};

    return apiClient.invokeAPI("SimCardsApi.simCardRegister", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Request setting a SIM card to standby
   * The SIM card will be able to connect to the network once the process to set it to standby has been completed, thus making it possible to consume data.&lt;br/&gt; To set a SIM card to standby, it must be associated with SIM card group.&lt;br/&gt; The API will trigger an asynchronous operation called a SIM Card Action. Transitioning to the standby state may take a period of time. The status of the SIM Card Action can be followed through the [List SIM Card Action](https://developers.telnyx.com/docs/api/v2/wireless/SIM-Card-Actions#ListSIMCardActions) API. 
   * @param id Identifies the resource. (required)
   * @return SIMCardActionResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 202 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public SIMCardActionResponse simCardSetStandby(UUID id) throws ApiException {
    return simCardSetStandbyWithHttpInfo(id).getData();
  }

  /**
   * Request setting a SIM card to standby
   * The SIM card will be able to connect to the network once the process to set it to standby has been completed, thus making it possible to consume data.&lt;br/&gt; To set a SIM card to standby, it must be associated with SIM card group.&lt;br/&gt; The API will trigger an asynchronous operation called a SIM Card Action. Transitioning to the standby state may take a period of time. The status of the SIM Card Action can be followed through the [List SIM Card Action](https://developers.telnyx.com/docs/api/v2/wireless/SIM-Card-Actions#ListSIMCardActions) API. 
   * @param id Identifies the resource. (required)
   * @return ApiResponse&lt;SIMCardActionResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 202 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<SIMCardActionResponse> simCardSetStandbyWithHttpInfo(UUID id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling simCardSetStandby");
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

    GenericType<SIMCardActionResponse> localVarReturnType = new GenericType<SIMCardActionResponse>() {};

    return apiClient.invokeAPI("SimCardsApi.simCardSetStandby", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Update a SIM card
   * Updates SIM card data
   * @param id Identifies the resource. (required)
   * @param siMCard  (required)
   * @return UpdateSimCardResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public UpdateSimCardResponse simCardUpdate(UUID id, SIMCard siMCard) throws ApiException {
    return simCardUpdateWithHttpInfo(id, siMCard).getData();
  }

  /**
   * Update a SIM card
   * Updates SIM card data
   * @param id Identifies the resource. (required)
   * @param siMCard  (required)
   * @return ApiResponse&lt;UpdateSimCardResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<UpdateSimCardResponse> simCardUpdateWithHttpInfo(UUID id, SIMCard siMCard) throws ApiException {
    Object localVarPostBody = siMCard;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling simCardUpdate");
    }
    
    // verify the required parameter 'siMCard' is set
    if (siMCard == null) {
      throw new ApiException(400, "Missing the required parameter 'siMCard' when calling simCardUpdate");
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

    GenericType<UpdateSimCardResponse> localVarReturnType = new GenericType<UpdateSimCardResponse>() {};

    return apiClient.invokeAPI("SimCardsApi.simCardUpdate", localVarPath, "PATCH", localVarQueryParams, localVarPostBody,
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
   * @return SearchSimCardsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public SearchSimCardsResponse simCardsGet(Integer pageNumber, Integer pageSize, Boolean includeSimCardGroup, UUID filterSimCardGroupId, List<String> filterTags, String filterIccid) throws ApiException {
    return simCardsGetWithHttpInfo(pageNumber, pageSize, includeSimCardGroup, filterSimCardGroupId, filterTags, filterIccid).getData();
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
   * @return ApiResponse&lt;SearchSimCardsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<SearchSimCardsResponse> simCardsGetWithHttpInfo(Integer pageNumber, Integer pageSize, Boolean includeSimCardGroup, UUID filterSimCardGroupId, List<String> filterTags, String filterIccid) throws ApiException {
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

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    GenericType<SearchSimCardsResponse> localVarReturnType = new GenericType<SearchSimCardsResponse>() {};

    return apiClient.invokeAPI("SimCardsApi.simCardsGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * List wireless connectivity logs
   * This API allows listing a paginated collection of Wireless Connectivity Logs associated with a SIM Card, for troubleshooting purposes.
   * @param simCardId Identifies a SIM card. (required)
   * @param pageNumber The page number to load (optional, default to 1)
   * @param pageSize The size of the page (optional, default to 20)
   * @return WirelessConnectivityLogCollectionResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public WirelessConnectivityLogCollectionResponse wirelessConnectivityLogsGet(UUID simCardId, Integer pageNumber, Integer pageSize) throws ApiException {
    return wirelessConnectivityLogsGetWithHttpInfo(simCardId, pageNumber, pageSize).getData();
  }

  /**
   * List wireless connectivity logs
   * This API allows listing a paginated collection of Wireless Connectivity Logs associated with a SIM Card, for troubleshooting purposes.
   * @param simCardId Identifies a SIM card. (required)
   * @param pageNumber The page number to load (optional, default to 1)
   * @param pageSize The size of the page (optional, default to 20)
   * @return ApiResponse&lt;WirelessConnectivityLogCollectionResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<WirelessConnectivityLogCollectionResponse> wirelessConnectivityLogsGetWithHttpInfo(UUID simCardId, Integer pageNumber, Integer pageSize) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'simCardId' is set
    if (simCardId == null) {
      throw new ApiException(400, "Missing the required parameter 'simCardId' when calling wirelessConnectivityLogsGet");
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

    GenericType<WirelessConnectivityLogCollectionResponse> localVarReturnType = new GenericType<WirelessConnectivityLogCollectionResponse>() {};

    return apiClient.invokeAPI("SimCardsApi.wirelessConnectivityLogsGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
