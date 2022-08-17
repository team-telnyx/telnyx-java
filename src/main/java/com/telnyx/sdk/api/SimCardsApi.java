package com.telnyx.sdk.api;

import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.Pair;

import javax.ws.rs.core.GenericType;

import com.telnyx.sdk.model.BulkSIMCardNetworkPreferences202Response;
import com.telnyx.sdk.model.BulkSIMCardNetworkPreferencesRequest;
import com.telnyx.sdk.model.BulkSetPublicIPs202Response;
import com.telnyx.sdk.model.BulkSetPublicIPsRequest;
import com.telnyx.sdk.model.Error;
import com.telnyx.sdk.model.Errors;
import com.telnyx.sdk.model.ListSimCardDataUsageNotifications200Response;
import com.telnyx.sdk.model.PostValidateRegistrationCodesRequest;
import com.telnyx.sdk.model.SIMCard;
import com.telnyx.sdk.model.SIMCardDeviceDetailsGet200Response;
import com.telnyx.sdk.model.SIMCardNetworkPreferencesGet200Response;
import com.telnyx.sdk.model.SIMCardNetworkPreferencesPutRequest;
import com.telnyx.sdk.model.SIMCardPublicIPGet200Response;
import com.telnyx.sdk.model.SIMCardRegistration;
import com.telnyx.sdk.model.SIMCardRegistrationCodeValidations;
import com.telnyx.sdk.model.SimCardActionGet200Response;
import com.telnyx.sdk.model.SimCardDataUsageNotification;
import com.telnyx.sdk.model.SimCardDataUsageNotificationsPost201Response;
import com.telnyx.sdk.model.SimCardDataUsageNotificationsPostRequest;
import com.telnyx.sdk.model.SimCardGet200Response;
import com.telnyx.sdk.model.SimCardRegister202Response;
import com.telnyx.sdk.model.SimCardsGet200Response;
import java.util.UUID;
import com.telnyx.sdk.model.WirelessConnectivityLogsGet200Response;

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
   * @param bulkSIMCardNetworkPreferencesRequest  (optional)
   * @return BulkSIMCardNetworkPreferences202Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 202 </td><td>  </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check the &#39;detail&#39; field in response for details. </td><td>  -  </td></tr>
     </table>
   */
  public BulkSIMCardNetworkPreferences202Response bulkSIMCardNetworkPreferences(BulkSIMCardNetworkPreferencesRequest bulkSIMCardNetworkPreferencesRequest) throws ApiException {
    return bulkSIMCardNetworkPreferencesWithHttpInfo(bulkSIMCardNetworkPreferencesRequest).getData();
  }

  /**
   * Bulk Network Preferences for SIM cards
   * This API allows dispatching the same operation described for the PUT sim_cards/:sim_card_id/network_preferences API for multiple SIM cards at once.&lt;br/&gt;&lt;br/&gt; Although, a SIM card network preference may fail individually under any validation triggered as a consequence of its state. For example, a SIM can&#39;t have an in-progress OTA update for applying a Network Preference, so they&#39;ll fail when requested in this API. In that scenario, the specific error will be present in the response along with the successful definitions in the \&quot;errors\&quot; response node. 
   * @param bulkSIMCardNetworkPreferencesRequest  (optional)
   * @return ApiResponse&lt;BulkSIMCardNetworkPreferences202Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 202 </td><td>  </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check the &#39;detail&#39; field in response for details. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<BulkSIMCardNetworkPreferences202Response> bulkSIMCardNetworkPreferencesWithHttpInfo(BulkSIMCardNetworkPreferencesRequest bulkSIMCardNetworkPreferencesRequest) throws ApiException {
    Object localVarPostBody = bulkSIMCardNetworkPreferencesRequest;
    
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

    GenericType<BulkSIMCardNetworkPreferences202Response> localVarReturnType = new GenericType<BulkSIMCardNetworkPreferences202Response>() {};

    return apiClient.invokeAPI("SimCardsApi.bulkSIMCardNetworkPreferences", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Request bulk setting SIM card public IPs.
   * This API triggers an asynchronous operation to set a public IP for each of the specified SIM cards.&lt;br/&gt; For each SIM Card a SIM Card Action will be generated. The status of the SIM Card Action can be followed through the [List SIM Card Action](https://developersdev.telnyx.com/docs/api/v2/wireless/SIM-Card-Actions#ListSIMCardActions) API. 
   * @param bulkSetPublicIPsRequest  (optional)
   * @return BulkSetPublicIPs202Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 202 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check the &#39;detail&#39; field in response for details. </td><td>  -  </td></tr>
     </table>
   */
  public BulkSetPublicIPs202Response bulkSetPublicIPs(BulkSetPublicIPsRequest bulkSetPublicIPsRequest) throws ApiException {
    return bulkSetPublicIPsWithHttpInfo(bulkSetPublicIPsRequest).getData();
  }

  /**
   * Request bulk setting SIM card public IPs.
   * This API triggers an asynchronous operation to set a public IP for each of the specified SIM cards.&lt;br/&gt; For each SIM Card a SIM Card Action will be generated. The status of the SIM Card Action can be followed through the [List SIM Card Action](https://developersdev.telnyx.com/docs/api/v2/wireless/SIM-Card-Actions#ListSIMCardActions) API. 
   * @param bulkSetPublicIPsRequest  (optional)
   * @return ApiResponse&lt;BulkSetPublicIPs202Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 202 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check the &#39;detail&#39; field in response for details. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<BulkSetPublicIPs202Response> bulkSetPublicIPsWithHttpInfo(BulkSetPublicIPsRequest bulkSetPublicIPsRequest) throws ApiException {
    Object localVarPostBody = bulkSetPublicIPsRequest;
    
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

    GenericType<BulkSetPublicIPs202Response> localVarReturnType = new GenericType<BulkSetPublicIPs202Response>() {};

    return apiClient.invokeAPI("SimCardsApi.bulkSetPublicIPs", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Delete network preferences for a SIM card
   * This API deletes network preferences for a SIM card.&lt;br/&gt; The API will trigger an asynchronous operation called a SIM Card Action. Creating network preferences may take a period of time. The status of the SIM Card Action can be followed through the [List SIM Card Action](https://developersdev.telnyx.com/docs/api/v2/wireless/SIM-Card-Actions#ListSIMCardActions) API. 
   * @param id Identifies the resource. (required)
   * @return SimCardActionGet200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 202 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check the &#39;detail&#39; field in response for details. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public SimCardActionGet200Response deleteNetworkPreference(UUID id) throws ApiException {
    return deleteNetworkPreferenceWithHttpInfo(id).getData();
  }

  /**
   * Delete network preferences for a SIM card
   * This API deletes network preferences for a SIM card.&lt;br/&gt; The API will trigger an asynchronous operation called a SIM Card Action. Creating network preferences may take a period of time. The status of the SIM Card Action can be followed through the [List SIM Card Action](https://developersdev.telnyx.com/docs/api/v2/wireless/SIM-Card-Actions#ListSIMCardActions) API. 
   * @param id Identifies the resource. (required)
   * @return ApiResponse&lt;SimCardActionGet200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 202 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check the &#39;detail&#39; field in response for details. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<SimCardActionGet200Response> deleteNetworkPreferenceWithHttpInfo(UUID id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling deleteNetworkPreference");
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

    GenericType<SimCardActionGet200Response> localVarReturnType = new GenericType<SimCardActionGet200Response>() {};

    return apiClient.invokeAPI("SimCardsApi.deleteNetworkPreference", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * List SIM card data usage notifications
   * Lists a paginated collection of SIM card data usage notifications. It enables exploring the collection using specific filters.
   * @param pageNumber The page number to load (optional, default to 1)
   * @param pageSize The size of the page (optional, default to 20)
   * @param filterSimCardId A valid SIM card ID. (optional)
   * @return ListSimCardDataUsageNotifications200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ListSimCardDataUsageNotifications200Response listSimCardDataUsageNotifications(Integer pageNumber, Integer pageSize, UUID filterSimCardId) throws ApiException {
    return listSimCardDataUsageNotificationsWithHttpInfo(pageNumber, pageSize, filterSimCardId).getData();
  }

  /**
   * List SIM card data usage notifications
   * Lists a paginated collection of SIM card data usage notifications. It enables exploring the collection using specific filters.
   * @param pageNumber The page number to load (optional, default to 1)
   * @param pageSize The size of the page (optional, default to 20)
   * @param filterSimCardId A valid SIM card ID. (optional)
   * @return ApiResponse&lt;ListSimCardDataUsageNotifications200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ListSimCardDataUsageNotifications200Response> listSimCardDataUsageNotificationsWithHttpInfo(Integer pageNumber, Integer pageSize, UUID filterSimCardId) throws ApiException {
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

    GenericType<ListSimCardDataUsageNotifications200Response> localVarReturnType = new GenericType<ListSimCardDataUsageNotifications200Response>() {};

    return apiClient.invokeAPI("SimCardsApi.listSimCardDataUsageNotifications", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Validate SIM cards registration codes
   * It validates whether SIM card registration codes are valid or not.
   * @param postValidateRegistrationCodesRequest  (required)
   * @return SIMCardRegistrationCodeValidations
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public SIMCardRegistrationCodeValidations postValidateRegistrationCodes(PostValidateRegistrationCodesRequest postValidateRegistrationCodesRequest) throws ApiException {
    return postValidateRegistrationCodesWithHttpInfo(postValidateRegistrationCodesRequest).getData();
  }

  /**
   * Validate SIM cards registration codes
   * It validates whether SIM card registration codes are valid or not.
   * @param postValidateRegistrationCodesRequest  (required)
   * @return ApiResponse&lt;SIMCardRegistrationCodeValidations&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<SIMCardRegistrationCodeValidations> postValidateRegistrationCodesWithHttpInfo(PostValidateRegistrationCodesRequest postValidateRegistrationCodesRequest) throws ApiException {
    Object localVarPostBody = postValidateRegistrationCodesRequest;
    
    // verify the required parameter 'postValidateRegistrationCodesRequest' is set
    if (postValidateRegistrationCodesRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'postValidateRegistrationCodesRequest' when calling postValidateRegistrationCodes");
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
   * @return SimCardActionGet200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 202 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public SimCardActionGet200Response removeSIMCardPublicIP(UUID id) throws ApiException {
    return removeSIMCardPublicIPWithHttpInfo(id).getData();
  }

  /**
   * Request removing a SIM card public IP
   * This API removes an existing public IP from a SIM card. &lt;br/&gt;&lt;br/&gt;  The API will trigger an asynchronous operation called a SIM Card Action. The status of the SIM Card Action can be followed through the [List SIM Card Action](https://developers.telnyx.com/docs/api/v2/wireless/SIM-Card-Actions#ListSIMCardActions) API.
   * @param id Identifies the resource. (required)
   * @return ApiResponse&lt;SimCardActionGet200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 202 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<SimCardActionGet200Response> removeSIMCardPublicIPWithHttpInfo(UUID id) throws ApiException {
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

    GenericType<SimCardActionGet200Response> localVarReturnType = new GenericType<SimCardActionGet200Response>() {};

    return apiClient.invokeAPI("SimCardsApi.removeSIMCardPublicIP", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get SIM card device details
   * It returns the device details where a SIM card is currently being used. 
   * @param simCardId Identifies a SIM card. (required)
   * @return SIMCardDeviceDetailsGet200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public SIMCardDeviceDetailsGet200Response sIMCardDeviceDetailsGet(UUID simCardId) throws ApiException {
    return sIMCardDeviceDetailsGetWithHttpInfo(simCardId).getData();
  }

  /**
   * Get SIM card device details
   * It returns the device details where a SIM card is currently being used. 
   * @param simCardId Identifies a SIM card. (required)
   * @return ApiResponse&lt;SIMCardDeviceDetailsGet200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<SIMCardDeviceDetailsGet200Response> sIMCardDeviceDetailsGetWithHttpInfo(UUID simCardId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'simCardId' is set
    if (simCardId == null) {
      throw new ApiException(400, "Missing the required parameter 'simCardId' when calling sIMCardDeviceDetailsGet");
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

    GenericType<SIMCardDeviceDetailsGet200Response> localVarReturnType = new GenericType<SIMCardDeviceDetailsGet200Response>() {};

    return apiClient.invokeAPI("SimCardsApi.sIMCardDeviceDetailsGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * DELETE network preferences
   * This API asynchronously removes the custom-defined network preferences settings. After this operation is done the Telnyx default settings, the same applied for an unaltered SIM card, will be in place. 
   * @param simCardId Identifies a SIM card. (required)
   * @return SIMCardNetworkPreferencesGet200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 202 </td><td> A successful network preferences deletion response. &lt;br/&gt;&lt;br/&gt; The delete won&#39;t be done right away - this is an asynchronous operation. The request will return the resource with an in-progress OTA update resource (in the ota_updates node) representing the delete operation. Similarly to the PUT API, the resource will only be deleted when the OTA updated is successfully completed. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public SIMCardNetworkPreferencesGet200Response sIMCardNetworkPreferencesDelete(UUID simCardId) throws ApiException {
    return sIMCardNetworkPreferencesDeleteWithHttpInfo(simCardId).getData();
  }

  /**
   * DELETE network preferences
   * This API asynchronously removes the custom-defined network preferences settings. After this operation is done the Telnyx default settings, the same applied for an unaltered SIM card, will be in place. 
   * @param simCardId Identifies a SIM card. (required)
   * @return ApiResponse&lt;SIMCardNetworkPreferencesGet200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 202 </td><td> A successful network preferences deletion response. &lt;br/&gt;&lt;br/&gt; The delete won&#39;t be done right away - this is an asynchronous operation. The request will return the resource with an in-progress OTA update resource (in the ota_updates node) representing the delete operation. Similarly to the PUT API, the resource will only be deleted when the OTA updated is successfully completed. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<SIMCardNetworkPreferencesGet200Response> sIMCardNetworkPreferencesDeleteWithHttpInfo(UUID simCardId) throws ApiException {
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

    GenericType<SIMCardNetworkPreferencesGet200Response> localVarReturnType = new GenericType<SIMCardNetworkPreferencesGet200Response>() {};

    return apiClient.invokeAPI("SimCardsApi.sIMCardNetworkPreferencesDelete", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get network preferences
   * It returns the network preferences currently applied in the SIM card. 
   * @param simCardId Identifies a SIM card. (required)
   * @param includeOtaUpdates It includes the associated OTA update objects in the response when present. (optional, default to false)
   * @return SIMCardNetworkPreferencesGet200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A successful network preferences definition response. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public SIMCardNetworkPreferencesGet200Response sIMCardNetworkPreferencesGet(UUID simCardId, Boolean includeOtaUpdates) throws ApiException {
    return sIMCardNetworkPreferencesGetWithHttpInfo(simCardId, includeOtaUpdates).getData();
  }

  /**
   * Get network preferences
   * It returns the network preferences currently applied in the SIM card. 
   * @param simCardId Identifies a SIM card. (required)
   * @param includeOtaUpdates It includes the associated OTA update objects in the response when present. (optional, default to false)
   * @return ApiResponse&lt;SIMCardNetworkPreferencesGet200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A successful network preferences definition response. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<SIMCardNetworkPreferencesGet200Response> sIMCardNetworkPreferencesGetWithHttpInfo(UUID simCardId, Boolean includeOtaUpdates) throws ApiException {
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

    GenericType<SIMCardNetworkPreferencesGet200Response> localVarReturnType = new GenericType<SIMCardNetworkPreferencesGet200Response>() {};

    return apiClient.invokeAPI("SimCardsApi.sIMCardNetworkPreferencesGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Set network preferences
   * This API allows setting or updating a SIM card network preference. &lt;br/&gt;&lt;br/&gt; Every SIM card has default network preferences defined on Telnyx. These preferences will determine how a SIMCard will connect to the network by considering a list of preferable operators.&lt;br/&gt;&lt;br/&gt; There can be multiple scenarios where an operator can be preferred over another, for example, when a specific mobile operator can provide better network latency or better pricing. 
   * @param simCardId Identifies a SIM card. (required)
   * @param siMCardNetworkPreferencesPutRequest  (optional)
   * @return SIMCardNetworkPreferencesGet200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 202 </td><td> A successful network preferences definition response. &lt;br/&gt;&lt;br/&gt; The sent mobile_operator_networks_preferences parameter won&#39;t be applied to the main resource right away - this is an asynchronous operation. While interacting with this API, you will face the following scenarios:    * The first request for this API will return an empty mobile_operator_networks_preferences with an in-progress OTA update resource in the ota_updates node containing the exact sent parameters to indicate the operation progress. The value will be applied to the principal object when the OTA update finishes its processing, thus indicating the SIM card network preference current state.    * The subsequent requests will contain the current state, that is what&#39;s applied to the SIM card settings, and return the related OTA update in the ota_updates node.    The returned OTA updated (present in the ota_updates node) will, by default, be the resource related to the operation, not all of them. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public SIMCardNetworkPreferencesGet200Response sIMCardNetworkPreferencesPut(UUID simCardId, SIMCardNetworkPreferencesPutRequest siMCardNetworkPreferencesPutRequest) throws ApiException {
    return sIMCardNetworkPreferencesPutWithHttpInfo(simCardId, siMCardNetworkPreferencesPutRequest).getData();
  }

  /**
   * Set network preferences
   * This API allows setting or updating a SIM card network preference. &lt;br/&gt;&lt;br/&gt; Every SIM card has default network preferences defined on Telnyx. These preferences will determine how a SIMCard will connect to the network by considering a list of preferable operators.&lt;br/&gt;&lt;br/&gt; There can be multiple scenarios where an operator can be preferred over another, for example, when a specific mobile operator can provide better network latency or better pricing. 
   * @param simCardId Identifies a SIM card. (required)
   * @param siMCardNetworkPreferencesPutRequest  (optional)
   * @return ApiResponse&lt;SIMCardNetworkPreferencesGet200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 202 </td><td> A successful network preferences definition response. &lt;br/&gt;&lt;br/&gt; The sent mobile_operator_networks_preferences parameter won&#39;t be applied to the main resource right away - this is an asynchronous operation. While interacting with this API, you will face the following scenarios:    * The first request for this API will return an empty mobile_operator_networks_preferences with an in-progress OTA update resource in the ota_updates node containing the exact sent parameters to indicate the operation progress. The value will be applied to the principal object when the OTA update finishes its processing, thus indicating the SIM card network preference current state.    * The subsequent requests will contain the current state, that is what&#39;s applied to the SIM card settings, and return the related OTA update in the ota_updates node.    The returned OTA updated (present in the ota_updates node) will, by default, be the resource related to the operation, not all of them. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<SIMCardNetworkPreferencesGet200Response> sIMCardNetworkPreferencesPutWithHttpInfo(UUID simCardId, SIMCardNetworkPreferencesPutRequest siMCardNetworkPreferencesPutRequest) throws ApiException {
    Object localVarPostBody = siMCardNetworkPreferencesPutRequest;
    
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

    GenericType<SIMCardNetworkPreferencesGet200Response> localVarReturnType = new GenericType<SIMCardNetworkPreferencesGet200Response>() {};

    return apiClient.invokeAPI("SimCardsApi.sIMCardNetworkPreferencesPut", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get SIM card public IP definition
   * It returns the public IP requested for a SIM card. 
   * @param simCardId Identifies a SIM card. (required)
   * @return SIMCardPublicIPGet200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public SIMCardPublicIPGet200Response sIMCardPublicIPGet(UUID simCardId) throws ApiException {
    return sIMCardPublicIPGetWithHttpInfo(simCardId).getData();
  }

  /**
   * Get SIM card public IP definition
   * It returns the public IP requested for a SIM card. 
   * @param simCardId Identifies a SIM card. (required)
   * @return ApiResponse&lt;SIMCardPublicIPGet200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<SIMCardPublicIPGet200Response> sIMCardPublicIPGetWithHttpInfo(UUID simCardId) throws ApiException {
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

    GenericType<SIMCardPublicIPGet200Response> localVarReturnType = new GenericType<SIMCardPublicIPGet200Response>() {};

    return apiClient.invokeAPI("SimCardsApi.sIMCardPublicIPGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Create or update network preferences for a SIM card
   * This API sets network preferences for a SIM card.&lt;br/&gt; Every SIM card has default network preferences defined on Telnyx. These preferences will determine how a SIMCard will connect to the network by considering a list of preferable operators.&lt;br/&gt;&lt;br/&gt; The SIM card needs to be attached to the network so this can connect and SMS must be available, otherwise, the operation will fail. This preference will only be respected if the network is available, otherwise the strongest signal will be used. &lt;br/&gt;&lt;br/&gt; The API will trigger an asynchronous operation called a SIM Card Action. Creating network preferences may take a period of time. The status of the SIM Card Action can be followed through the [List SIM Card Action](https://developersdev.telnyx.com/docs/api/v2/wireless/SIM-Card-Actions#ListSIMCardActions) API. 
   * @param id Identifies the resource. (required)
   * @return SimCardActionGet200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 202 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check the &#39;detail&#39; field in response for details. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public SimCardActionGet200Response setNetworkPreference(UUID id) throws ApiException {
    return setNetworkPreferenceWithHttpInfo(id).getData();
  }

  /**
   * Create or update network preferences for a SIM card
   * This API sets network preferences for a SIM card.&lt;br/&gt; Every SIM card has default network preferences defined on Telnyx. These preferences will determine how a SIMCard will connect to the network by considering a list of preferable operators.&lt;br/&gt;&lt;br/&gt; The SIM card needs to be attached to the network so this can connect and SMS must be available, otherwise, the operation will fail. This preference will only be respected if the network is available, otherwise the strongest signal will be used. &lt;br/&gt;&lt;br/&gt; The API will trigger an asynchronous operation called a SIM Card Action. Creating network preferences may take a period of time. The status of the SIM Card Action can be followed through the [List SIM Card Action](https://developersdev.telnyx.com/docs/api/v2/wireless/SIM-Card-Actions#ListSIMCardActions) API. 
   * @param id Identifies the resource. (required)
   * @return ApiResponse&lt;SimCardActionGet200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 202 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check the &#39;detail&#39; field in response for details. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<SimCardActionGet200Response> setNetworkPreferenceWithHttpInfo(UUID id) throws ApiException {
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

    GenericType<SimCardActionGet200Response> localVarReturnType = new GenericType<SimCardActionGet200Response>() {};

    return apiClient.invokeAPI("SimCardsApi.setNetworkPreference", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Request setting a SIM card public IP
   * This API makes a SIM card reachable on the public internet by mapping a random public IP to the SIM card. &lt;br/&gt;&lt;br/&gt;  The API will trigger an asynchronous operation called a SIM Card Action. The status of the SIM Card Action can be followed through the [List SIM Card Action](https://developers.telnyx.com/docs/api/v2/wireless/SIM-Card-Actions#ListSIMCardActions) API. &lt;br/&gt;&lt;br/&gt;  Setting a Public IP to a SIM Card incurs a charge and will only succeed if the account has sufficient funds.
   * @param id Identifies the resource. (required)
   * @return SimCardActionGet200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 202 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public SimCardActionGet200Response setSIMCardPublicIP(UUID id) throws ApiException {
    return setSIMCardPublicIPWithHttpInfo(id).getData();
  }

  /**
   * Request setting a SIM card public IP
   * This API makes a SIM card reachable on the public internet by mapping a random public IP to the SIM card. &lt;br/&gt;&lt;br/&gt;  The API will trigger an asynchronous operation called a SIM Card Action. The status of the SIM Card Action can be followed through the [List SIM Card Action](https://developers.telnyx.com/docs/api/v2/wireless/SIM-Card-Actions#ListSIMCardActions) API. &lt;br/&gt;&lt;br/&gt;  Setting a Public IP to a SIM Card incurs a charge and will only succeed if the account has sufficient funds.
   * @param id Identifies the resource. (required)
   * @return ApiResponse&lt;SimCardActionGet200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 202 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<SimCardActionGet200Response> setSIMCardPublicIPWithHttpInfo(UUID id) throws ApiException {
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

    GenericType<SimCardActionGet200Response> localVarReturnType = new GenericType<SimCardActionGet200Response>() {};

    return apiClient.invokeAPI("SimCardsApi.setSIMCardPublicIP", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Delete SIM card data usage notifications
   * Delete the SIM Card Data Usage Notification.
   * @param id Identifies the resource. (required)
   * @return SimCardDataUsageNotificationsPost201Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public SimCardDataUsageNotificationsPost201Response simCardDataUsageNotificationsDelete(UUID id) throws ApiException {
    return simCardDataUsageNotificationsDeleteWithHttpInfo(id).getData();
  }

  /**
   * Delete SIM card data usage notifications
   * Delete the SIM Card Data Usage Notification.
   * @param id Identifies the resource. (required)
   * @return ApiResponse&lt;SimCardDataUsageNotificationsPost201Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<SimCardDataUsageNotificationsPost201Response> simCardDataUsageNotificationsDeleteWithHttpInfo(UUID id) throws ApiException {
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

    GenericType<SimCardDataUsageNotificationsPost201Response> localVarReturnType = new GenericType<SimCardDataUsageNotificationsPost201Response>() {};

    return apiClient.invokeAPI("SimCardsApi.simCardDataUsageNotificationsDelete", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get a single SIM card data usage notification
   * Get a single SIM Card Data Usage Notification.
   * @param id Identifies the resource. (required)
   * @return SimCardDataUsageNotificationsPost201Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public SimCardDataUsageNotificationsPost201Response simCardDataUsageNotificationsGet(UUID id) throws ApiException {
    return simCardDataUsageNotificationsGetWithHttpInfo(id).getData();
  }

  /**
   * Get a single SIM card data usage notification
   * Get a single SIM Card Data Usage Notification.
   * @param id Identifies the resource. (required)
   * @return ApiResponse&lt;SimCardDataUsageNotificationsPost201Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<SimCardDataUsageNotificationsPost201Response> simCardDataUsageNotificationsGetWithHttpInfo(UUID id) throws ApiException {
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

    GenericType<SimCardDataUsageNotificationsPost201Response> localVarReturnType = new GenericType<SimCardDataUsageNotificationsPost201Response>() {};

    return apiClient.invokeAPI("SimCardsApi.simCardDataUsageNotificationsGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Updates information for a SIM Card Data Usage Notification
   * Updates information for a SIM Card Data Usage Notification.
   * @param id Identifies the resource. (required)
   * @param simCardDataUsageNotification  (required)
   * @return SimCardDataUsageNotificationsPost201Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public SimCardDataUsageNotificationsPost201Response simCardDataUsageNotificationsPatch(UUID id, SimCardDataUsageNotification simCardDataUsageNotification) throws ApiException {
    return simCardDataUsageNotificationsPatchWithHttpInfo(id, simCardDataUsageNotification).getData();
  }

  /**
   * Updates information for a SIM Card Data Usage Notification
   * Updates information for a SIM Card Data Usage Notification.
   * @param id Identifies the resource. (required)
   * @param simCardDataUsageNotification  (required)
   * @return ApiResponse&lt;SimCardDataUsageNotificationsPost201Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<SimCardDataUsageNotificationsPost201Response> simCardDataUsageNotificationsPatchWithHttpInfo(UUID id, SimCardDataUsageNotification simCardDataUsageNotification) throws ApiException {
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

    GenericType<SimCardDataUsageNotificationsPost201Response> localVarReturnType = new GenericType<SimCardDataUsageNotificationsPost201Response>() {};

    return apiClient.invokeAPI("SimCardsApi.simCardDataUsageNotificationsPatch", localVarPath, "PATCH", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Create a new SIM card data usage notification
   * Creates a new SIM card data usage notification.
   * @param simCardDataUsageNotificationsPostRequest  (required)
   * @return SimCardDataUsageNotificationsPost201Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public SimCardDataUsageNotificationsPost201Response simCardDataUsageNotificationsPost(SimCardDataUsageNotificationsPostRequest simCardDataUsageNotificationsPostRequest) throws ApiException {
    return simCardDataUsageNotificationsPostWithHttpInfo(simCardDataUsageNotificationsPostRequest).getData();
  }

  /**
   * Create a new SIM card data usage notification
   * Creates a new SIM card data usage notification.
   * @param simCardDataUsageNotificationsPostRequest  (required)
   * @return ApiResponse&lt;SimCardDataUsageNotificationsPost201Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<SimCardDataUsageNotificationsPost201Response> simCardDataUsageNotificationsPostWithHttpInfo(SimCardDataUsageNotificationsPostRequest simCardDataUsageNotificationsPostRequest) throws ApiException {
    Object localVarPostBody = simCardDataUsageNotificationsPostRequest;
    
    // verify the required parameter 'simCardDataUsageNotificationsPostRequest' is set
    if (simCardDataUsageNotificationsPostRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'simCardDataUsageNotificationsPostRequest' when calling simCardDataUsageNotificationsPost");
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

    GenericType<SimCardDataUsageNotificationsPost201Response> localVarReturnType = new GenericType<SimCardDataUsageNotificationsPost201Response>() {};

    return apiClient.invokeAPI("SimCardsApi.simCardDataUsageNotificationsPost", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Deletes a SIM card
   * The SIM card will be decommissioned, removed from your account and you will stop being charged.&lt;br /&gt;The SIM card won&#39;t be able to connect to the network after the deletion is completed, thus making it impossible to consume data.&lt;br/&gt; Transitioning to the disabled state may take a period of time.&lt;/br&gt; Until the transition is completed, the SIM card status will be disabling &lt;code&gt;disabling&lt;/code&gt;.&lt;br /&gt;In order to re-enable the SIM card, you will need to re-register it.
   * @param id Identifies the resource. (required)
   * @return SimCardGet200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public SimCardGet200Response simCardDelete(UUID id) throws ApiException {
    return simCardDeleteWithHttpInfo(id).getData();
  }

  /**
   * Deletes a SIM card
   * The SIM card will be decommissioned, removed from your account and you will stop being charged.&lt;br /&gt;The SIM card won&#39;t be able to connect to the network after the deletion is completed, thus making it impossible to consume data.&lt;br/&gt; Transitioning to the disabled state may take a period of time.&lt;/br&gt; Until the transition is completed, the SIM card status will be disabling &lt;code&gt;disabling&lt;/code&gt;.&lt;br /&gt;In order to re-enable the SIM card, you will need to re-register it.
   * @param id Identifies the resource. (required)
   * @return ApiResponse&lt;SimCardGet200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<SimCardGet200Response> simCardDeleteWithHttpInfo(UUID id) throws ApiException {
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

    GenericType<SimCardGet200Response> localVarReturnType = new GenericType<SimCardGet200Response>() {};

    return apiClient.invokeAPI("SimCardsApi.simCardDelete", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Request a SIM card disable
   * This API disables a SIM card, disconnecting it from the network and making it impossible to consume data.&lt;br/&gt; The API will trigger an asynchronous operation called a SIM Card Action. Transitioning to the disabled state may take a period of time. The status of the SIM Card Action can be followed through the [List SIM Card Action](https://developers.telnyx.com/docs/api/v2/wireless/SIM-Card-Actions#ListSIMCardActions) API. 
   * @param id Identifies the resource. (required)
   * @return SimCardActionGet200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 202 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public SimCardActionGet200Response simCardDisable(UUID id) throws ApiException {
    return simCardDisableWithHttpInfo(id).getData();
  }

  /**
   * Request a SIM card disable
   * This API disables a SIM card, disconnecting it from the network and making it impossible to consume data.&lt;br/&gt; The API will trigger an asynchronous operation called a SIM Card Action. Transitioning to the disabled state may take a period of time. The status of the SIM Card Action can be followed through the [List SIM Card Action](https://developers.telnyx.com/docs/api/v2/wireless/SIM-Card-Actions#ListSIMCardActions) API. 
   * @param id Identifies the resource. (required)
   * @return ApiResponse&lt;SimCardActionGet200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 202 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<SimCardActionGet200Response> simCardDisableWithHttpInfo(UUID id) throws ApiException {
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

    GenericType<SimCardActionGet200Response> localVarReturnType = new GenericType<SimCardActionGet200Response>() {};

    return apiClient.invokeAPI("SimCardsApi.simCardDisable", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Request a SIM card enable
   * This API enables a SIM card, connecting it to the network and making it possible to consume data.&lt;br/&gt; To enable a SIM card, it must be associated with a SIM card group.&lt;br/&gt; The API will trigger an asynchronous operation called a SIM Card Action. Transitioning to the enabled state may take a period of time. The status of the SIM Card Action can be followed through the [List SIM Card Action](https://developers.telnyx.com/docs/api/v2/wireless/SIM-Card-Actions#ListSIMCardActions) API. 
   * @param id Identifies the resource. (required)
   * @return SimCardActionGet200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 202 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check the &#39;detail&#39; field in response for details. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public SimCardActionGet200Response simCardEnable(UUID id) throws ApiException {
    return simCardEnableWithHttpInfo(id).getData();
  }

  /**
   * Request a SIM card enable
   * This API enables a SIM card, connecting it to the network and making it possible to consume data.&lt;br/&gt; To enable a SIM card, it must be associated with a SIM card group.&lt;br/&gt; The API will trigger an asynchronous operation called a SIM Card Action. Transitioning to the enabled state may take a period of time. The status of the SIM Card Action can be followed through the [List SIM Card Action](https://developers.telnyx.com/docs/api/v2/wireless/SIM-Card-Actions#ListSIMCardActions) API. 
   * @param id Identifies the resource. (required)
   * @return ApiResponse&lt;SimCardActionGet200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 202 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check the &#39;detail&#39; field in response for details. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<SimCardActionGet200Response> simCardEnableWithHttpInfo(UUID id) throws ApiException {
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

    GenericType<SimCardActionGet200Response> localVarReturnType = new GenericType<SimCardActionGet200Response>() {};

    return apiClient.invokeAPI("SimCardsApi.simCardEnable", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get SIM card
   * Returns the details regarding a specific SIM card.
   * @param id Identifies the resource. (required)
   * @param includeSimCardGroup It includes the associated SIM card group object in the response when present. (optional, default to false)
   * @return SimCardGet200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public SimCardGet200Response simCardGet(UUID id, Boolean includeSimCardGroup) throws ApiException {
    return simCardGetWithHttpInfo(id, includeSimCardGroup).getData();
  }

  /**
   * Get SIM card
   * Returns the details regarding a specific SIM card.
   * @param id Identifies the resource. (required)
   * @param includeSimCardGroup It includes the associated SIM card group object in the response when present. (optional, default to false)
   * @return ApiResponse&lt;SimCardGet200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<SimCardGet200Response> simCardGetWithHttpInfo(UUID id, Boolean includeSimCardGroup) throws ApiException {
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

    GenericType<SimCardGet200Response> localVarReturnType = new GenericType<SimCardGet200Response>() {};

    return apiClient.invokeAPI("SimCardsApi.simCardGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Register SIM cards
   * Register the SIM cards associated with the provided registration codes to the current user&#39;s account.&lt;br/&gt;&lt;br/&gt; If &lt;code&gt;sim_card_group_id&lt;/code&gt; is provided, the SIM cards will be associated with that group. Otherwise, the default group for the current user will be used.&lt;br/&gt;&lt;br/&gt; 
   * @param siMCardRegistration  (required)
   * @return SimCardRegister202Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 202 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public SimCardRegister202Response simCardRegister(SIMCardRegistration siMCardRegistration) throws ApiException {
    return simCardRegisterWithHttpInfo(siMCardRegistration).getData();
  }

  /**
   * Register SIM cards
   * Register the SIM cards associated with the provided registration codes to the current user&#39;s account.&lt;br/&gt;&lt;br/&gt; If &lt;code&gt;sim_card_group_id&lt;/code&gt; is provided, the SIM cards will be associated with that group. Otherwise, the default group for the current user will be used.&lt;br/&gt;&lt;br/&gt; 
   * @param siMCardRegistration  (required)
   * @return ApiResponse&lt;SimCardRegister202Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 202 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<SimCardRegister202Response> simCardRegisterWithHttpInfo(SIMCardRegistration siMCardRegistration) throws ApiException {
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

    GenericType<SimCardRegister202Response> localVarReturnType = new GenericType<SimCardRegister202Response>() {};

    return apiClient.invokeAPI("SimCardsApi.simCardRegister", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Request setting a SIM card to standby
   * The SIM card will be able to connect to the network once the process to set it to standby has been completed, thus making it possible to consume data.&lt;br/&gt; To set a SIM card to standby, it must be associated with SIM card group.&lt;br/&gt; The API will trigger an asynchronous operation called a SIM Card Action. Transitioning to the standby state may take a period of time. The status of the SIM Card Action can be followed through the [List SIM Card Action](https://developers.telnyx.com/docs/api/v2/wireless/SIM-Card-Actions#ListSIMCardActions) API. 
   * @param id Identifies the resource. (required)
   * @return SimCardActionGet200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 202 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public SimCardActionGet200Response simCardSetStandby(UUID id) throws ApiException {
    return simCardSetStandbyWithHttpInfo(id).getData();
  }

  /**
   * Request setting a SIM card to standby
   * The SIM card will be able to connect to the network once the process to set it to standby has been completed, thus making it possible to consume data.&lt;br/&gt; To set a SIM card to standby, it must be associated with SIM card group.&lt;br/&gt; The API will trigger an asynchronous operation called a SIM Card Action. Transitioning to the standby state may take a period of time. The status of the SIM Card Action can be followed through the [List SIM Card Action](https://developers.telnyx.com/docs/api/v2/wireless/SIM-Card-Actions#ListSIMCardActions) API. 
   * @param id Identifies the resource. (required)
   * @return ApiResponse&lt;SimCardActionGet200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 202 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<SimCardActionGet200Response> simCardSetStandbyWithHttpInfo(UUID id) throws ApiException {
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

    GenericType<SimCardActionGet200Response> localVarReturnType = new GenericType<SimCardActionGet200Response>() {};

    return apiClient.invokeAPI("SimCardsApi.simCardSetStandby", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Update a SIM card
   * Updates SIM card data
   * @param id Identifies the resource. (required)
   * @param siMCard  (required)
   * @return SimCardGet200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public SimCardGet200Response simCardUpdate(UUID id, SIMCard siMCard) throws ApiException {
    return simCardUpdateWithHttpInfo(id, siMCard).getData();
  }

  /**
   * Update a SIM card
   * Updates SIM card data
   * @param id Identifies the resource. (required)
   * @param siMCard  (required)
   * @return ApiResponse&lt;SimCardGet200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<SimCardGet200Response> simCardUpdateWithHttpInfo(UUID id, SIMCard siMCard) throws ApiException {
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

    GenericType<SimCardGet200Response> localVarReturnType = new GenericType<SimCardGet200Response>() {};

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
   * @param filterStatus Filter by a SIM card&#39;s status. (optional)
   * @return SimCardsGet200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public SimCardsGet200Response simCardsGet(Integer pageNumber, Integer pageSize, Boolean includeSimCardGroup, UUID filterSimCardGroupId, List<String> filterTags, String filterIccid, List<String> filterStatus) throws ApiException {
    return simCardsGetWithHttpInfo(pageNumber, pageSize, includeSimCardGroup, filterSimCardGroupId, filterTags, filterIccid, filterStatus).getData();
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
   * @return ApiResponse&lt;SimCardsGet200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<SimCardsGet200Response> simCardsGetWithHttpInfo(Integer pageNumber, Integer pageSize, Boolean includeSimCardGroup, UUID filterSimCardGroupId, List<String> filterTags, String filterIccid, List<String> filterStatus) throws ApiException {
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

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    GenericType<SimCardsGet200Response> localVarReturnType = new GenericType<SimCardsGet200Response>() {};

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
   * @return WirelessConnectivityLogsGet200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public WirelessConnectivityLogsGet200Response wirelessConnectivityLogsGet(UUID simCardId, Integer pageNumber, Integer pageSize) throws ApiException {
    return wirelessConnectivityLogsGetWithHttpInfo(simCardId, pageNumber, pageSize).getData();
  }

  /**
   * List wireless connectivity logs
   * This API allows listing a paginated collection of Wireless Connectivity Logs associated with a SIM Card, for troubleshooting purposes.
   * @param simCardId Identifies a SIM card. (required)
   * @param pageNumber The page number to load (optional, default to 1)
   * @param pageSize The size of the page (optional, default to 20)
   * @return ApiResponse&lt;WirelessConnectivityLogsGet200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<WirelessConnectivityLogsGet200Response> wirelessConnectivityLogsGetWithHttpInfo(UUID simCardId, Integer pageNumber, Integer pageSize) throws ApiException {
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

    GenericType<WirelessConnectivityLogsGet200Response> localVarReturnType = new GenericType<WirelessConnectivityLogsGet200Response>() {};

    return apiClient.invokeAPI("SimCardsApi.wirelessConnectivityLogsGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
