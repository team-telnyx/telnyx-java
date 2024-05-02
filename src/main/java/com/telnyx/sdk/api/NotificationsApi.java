package com.telnyx.sdk.api;

import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.Pair;

import jakarta.ws.rs.core.GenericType;

import com.telnyx.sdk.model.CreateNotificationChannels200Response;
import com.telnyx.sdk.model.CreateNotificationProfile200Response;
import com.telnyx.sdk.model.CreateNotificationSetting200Response;
import com.telnyx.sdk.model.Errors;
import com.telnyx.sdk.model.FindNotificationsEvents200Response;
import com.telnyx.sdk.model.FindNotificationsEventsConditions200Response;
import com.telnyx.sdk.model.FindNotificationsProfiles200Response;
import com.telnyx.sdk.model.ListNotificationChannels200Response;
import com.telnyx.sdk.model.ListNotificationSettings200Response;
import com.telnyx.sdk.model.NotificationChannel;
import com.telnyx.sdk.model.NotificationProfile;
import com.telnyx.sdk.model.NotificationSetting;
import java.util.UUID;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class NotificationsApi {
  private ApiClient apiClient;

  public NotificationsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public NotificationsApi(ApiClient apiClient) {
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
   * Create a notification channel
   * Create a notification channel.
   * @param notificationChannel Add a Notification Channel (optional)
   * @return CreateNotificationChannels200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A Notification Channel response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public CreateNotificationChannels200Response createNotificationChannels(NotificationChannel notificationChannel) throws ApiException {
    return createNotificationChannelsWithHttpInfo(notificationChannel).getData();
  }

  /**
   * Create a notification channel
   * Create a notification channel.
   * @param notificationChannel Add a Notification Channel (optional)
   * @return ApiResponse&lt;CreateNotificationChannels200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A Notification Channel response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CreateNotificationChannels200Response> createNotificationChannelsWithHttpInfo(NotificationChannel notificationChannel) throws ApiException {
    Object localVarPostBody = notificationChannel;
    
    // create path and map variables
    String localVarPath = "/notification_channels";

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

    GenericType<CreateNotificationChannels200Response> localVarReturnType = new GenericType<CreateNotificationChannels200Response>() {};

    return apiClient.invokeAPI("NotificationsApi.createNotificationChannels", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Create a notification profile
   * Create a notification profile.
   * @param notificationProfile Add a Notification Profile (optional)
   * @return CreateNotificationProfile200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A Notification Profile response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public CreateNotificationProfile200Response createNotificationProfile(NotificationProfile notificationProfile) throws ApiException {
    return createNotificationProfileWithHttpInfo(notificationProfile).getData();
  }

  /**
   * Create a notification profile
   * Create a notification profile.
   * @param notificationProfile Add a Notification Profile (optional)
   * @return ApiResponse&lt;CreateNotificationProfile200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A Notification Profile response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CreateNotificationProfile200Response> createNotificationProfileWithHttpInfo(NotificationProfile notificationProfile) throws ApiException {
    Object localVarPostBody = notificationProfile;
    
    // create path and map variables
    String localVarPath = "/notification_profiles";

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

    GenericType<CreateNotificationProfile200Response> localVarReturnType = new GenericType<CreateNotificationProfile200Response>() {};

    return apiClient.invokeAPI("NotificationsApi.createNotificationProfile", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Add a Notification Setting
   * Add a notification setting.
   * @param notificationSetting  (optional)
   * @return CreateNotificationSetting200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A Notification Setting response </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> A Notification Setting response - async </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public CreateNotificationSetting200Response createNotificationSetting(NotificationSetting notificationSetting) throws ApiException {
    return createNotificationSettingWithHttpInfo(notificationSetting).getData();
  }

  /**
   * Add a Notification Setting
   * Add a notification setting.
   * @param notificationSetting  (optional)
   * @return ApiResponse&lt;CreateNotificationSetting200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A Notification Setting response </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> A Notification Setting response - async </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CreateNotificationSetting200Response> createNotificationSettingWithHttpInfo(NotificationSetting notificationSetting) throws ApiException {
    Object localVarPostBody = notificationSetting;
    
    // create path and map variables
    String localVarPath = "/notification_settings";

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

    GenericType<CreateNotificationSetting200Response> localVarReturnType = new GenericType<CreateNotificationSetting200Response>() {};

    return apiClient.invokeAPI("NotificationsApi.createNotificationSetting", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Delete a notification channel
   * Delete a notification channel.
   * @param id Identifies the resource. (required)
   * @return CreateNotificationChannels200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A Notification Channel response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public CreateNotificationChannels200Response deleteNotificationChannel(UUID id) throws ApiException {
    return deleteNotificationChannelWithHttpInfo(id).getData();
  }

  /**
   * Delete a notification channel
   * Delete a notification channel.
   * @param id Identifies the resource. (required)
   * @return ApiResponse&lt;CreateNotificationChannels200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A Notification Channel response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CreateNotificationChannels200Response> deleteNotificationChannelWithHttpInfo(UUID id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling deleteNotificationChannel");
    }
    
    // create path and map variables
    String localVarPath = "/notification_channels/{id}"
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

    GenericType<CreateNotificationChannels200Response> localVarReturnType = new GenericType<CreateNotificationChannels200Response>() {};

    return apiClient.invokeAPI("NotificationsApi.deleteNotificationChannel", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Delete a notification profile
   * Delete a notification profile.
   * @param id Identifies the resource. (required)
   * @return CreateNotificationProfile200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A Notification Profile response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public CreateNotificationProfile200Response deleteNotificationProfile(UUID id) throws ApiException {
    return deleteNotificationProfileWithHttpInfo(id).getData();
  }

  /**
   * Delete a notification profile
   * Delete a notification profile.
   * @param id Identifies the resource. (required)
   * @return ApiResponse&lt;CreateNotificationProfile200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A Notification Profile response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CreateNotificationProfile200Response> deleteNotificationProfileWithHttpInfo(UUID id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling deleteNotificationProfile");
    }
    
    // create path and map variables
    String localVarPath = "/notification_profiles/{id}"
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

    GenericType<CreateNotificationProfile200Response> localVarReturnType = new GenericType<CreateNotificationProfile200Response>() {};

    return apiClient.invokeAPI("NotificationsApi.deleteNotificationProfile", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Delete a notification setting
   * Delete a notification setting.
   * @param id Identifies the resource. (required)
   * @return CreateNotificationSetting200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A Notification Setting response </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> A Notification Setting response - async </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public CreateNotificationSetting200Response deleteNotificationSetting(UUID id) throws ApiException {
    return deleteNotificationSettingWithHttpInfo(id).getData();
  }

  /**
   * Delete a notification setting
   * Delete a notification setting.
   * @param id Identifies the resource. (required)
   * @return ApiResponse&lt;CreateNotificationSetting200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A Notification Setting response </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> A Notification Setting response - async </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CreateNotificationSetting200Response> deleteNotificationSettingWithHttpInfo(UUID id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling deleteNotificationSetting");
    }
    
    // create path and map variables
    String localVarPath = "/notification_settings/{id}"
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

    GenericType<CreateNotificationSetting200Response> localVarReturnType = new GenericType<CreateNotificationSetting200Response>() {};

    return apiClient.invokeAPI("NotificationsApi.deleteNotificationSetting", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * List all Notifications Events
   * Returns a list of your notifications events.
   * @param pageNumber The page number to load (optional, default to 1)
   * @param pageSize The size of the page (optional, default to 20)
   * @return FindNotificationsEvents200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Returns a list of notification events available. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public FindNotificationsEvents200Response findNotificationsEvents(Integer pageNumber, Integer pageSize) throws ApiException {
    return findNotificationsEventsWithHttpInfo(pageNumber, pageSize).getData();
  }

  /**
   * List all Notifications Events
   * Returns a list of your notifications events.
   * @param pageNumber The page number to load (optional, default to 1)
   * @param pageSize The size of the page (optional, default to 20)
   * @return ApiResponse&lt;FindNotificationsEvents200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Returns a list of notification events available. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<FindNotificationsEvents200Response> findNotificationsEventsWithHttpInfo(Integer pageNumber, Integer pageSize) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/notification_events";

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

    GenericType<FindNotificationsEvents200Response> localVarReturnType = new GenericType<FindNotificationsEvents200Response>() {};

    return apiClient.invokeAPI("NotificationsApi.findNotificationsEvents", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * List all Notifications Events Conditions
   * Returns a list of your notifications events conditions.
   * @param pageNumber The page number to load (optional, default to 1)
   * @param pageSize The size of the page (optional, default to 20)
   * @param filterAssociatedRecordTypeEq Filter by the associated record type (optional)
   * @return FindNotificationsEventsConditions200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Returns a list of notification event conditions available. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public FindNotificationsEventsConditions200Response findNotificationsEventsConditions(Integer pageNumber, Integer pageSize, String filterAssociatedRecordTypeEq) throws ApiException {
    return findNotificationsEventsConditionsWithHttpInfo(pageNumber, pageSize, filterAssociatedRecordTypeEq).getData();
  }

  /**
   * List all Notifications Events Conditions
   * Returns a list of your notifications events conditions.
   * @param pageNumber The page number to load (optional, default to 1)
   * @param pageSize The size of the page (optional, default to 20)
   * @param filterAssociatedRecordTypeEq Filter by the associated record type (optional)
   * @return ApiResponse&lt;FindNotificationsEventsConditions200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Returns a list of notification event conditions available. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<FindNotificationsEventsConditions200Response> findNotificationsEventsConditionsWithHttpInfo(Integer pageNumber, Integer pageSize, String filterAssociatedRecordTypeEq) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/notification_event_conditions";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[number]", pageNumber));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[associated_record_type][eq]", filterAssociatedRecordTypeEq));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    GenericType<FindNotificationsEventsConditions200Response> localVarReturnType = new GenericType<FindNotificationsEventsConditions200Response>() {};

    return apiClient.invokeAPI("NotificationsApi.findNotificationsEventsConditions", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * List all Notifications Profiles
   * Returns a list of your notifications profiles.
   * @param pageNumber The page number to load (optional, default to 1)
   * @param pageSize The size of the page (optional, default to 20)
   * @return FindNotificationsProfiles200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Returns a list of notification profiles. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public FindNotificationsProfiles200Response findNotificationsProfiles(Integer pageNumber, Integer pageSize) throws ApiException {
    return findNotificationsProfilesWithHttpInfo(pageNumber, pageSize).getData();
  }

  /**
   * List all Notifications Profiles
   * Returns a list of your notifications profiles.
   * @param pageNumber The page number to load (optional, default to 1)
   * @param pageSize The size of the page (optional, default to 20)
   * @return ApiResponse&lt;FindNotificationsProfiles200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Returns a list of notification profiles. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<FindNotificationsProfiles200Response> findNotificationsProfilesWithHttpInfo(Integer pageNumber, Integer pageSize) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/notification_profiles";

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

    GenericType<FindNotificationsProfiles200Response> localVarReturnType = new GenericType<FindNotificationsProfiles200Response>() {};

    return apiClient.invokeAPI("NotificationsApi.findNotificationsProfiles", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get a notification channel
   * Get a notification channel.
   * @param id Identifies the resource. (required)
   * @return CreateNotificationChannels200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A Notification Channel response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public CreateNotificationChannels200Response getNotificationChannel(UUID id) throws ApiException {
    return getNotificationChannelWithHttpInfo(id).getData();
  }

  /**
   * Get a notification channel
   * Get a notification channel.
   * @param id Identifies the resource. (required)
   * @return ApiResponse&lt;CreateNotificationChannels200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A Notification Channel response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CreateNotificationChannels200Response> getNotificationChannelWithHttpInfo(UUID id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getNotificationChannel");
    }
    
    // create path and map variables
    String localVarPath = "/notification_channels/{id}"
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

    GenericType<CreateNotificationChannels200Response> localVarReturnType = new GenericType<CreateNotificationChannels200Response>() {};

    return apiClient.invokeAPI("NotificationsApi.getNotificationChannel", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get a notification profile
   * Get a notification profile.
   * @param id Identifies the resource. (required)
   * @return CreateNotificationProfile200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A Notification Profile response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public CreateNotificationProfile200Response getNotificationProfile(UUID id) throws ApiException {
    return getNotificationProfileWithHttpInfo(id).getData();
  }

  /**
   * Get a notification profile
   * Get a notification profile.
   * @param id Identifies the resource. (required)
   * @return ApiResponse&lt;CreateNotificationProfile200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A Notification Profile response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CreateNotificationProfile200Response> getNotificationProfileWithHttpInfo(UUID id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getNotificationProfile");
    }
    
    // create path and map variables
    String localVarPath = "/notification_profiles/{id}"
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

    GenericType<CreateNotificationProfile200Response> localVarReturnType = new GenericType<CreateNotificationProfile200Response>() {};

    return apiClient.invokeAPI("NotificationsApi.getNotificationProfile", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get a notification setting
   * Get a notification setting.
   * @param id Identifies the resource. (required)
   * @return CreateNotificationSetting200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A Notification Setting response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public CreateNotificationSetting200Response getNotificationSetting(UUID id) throws ApiException {
    return getNotificationSettingWithHttpInfo(id).getData();
  }

  /**
   * Get a notification setting
   * Get a notification setting.
   * @param id Identifies the resource. (required)
   * @return ApiResponse&lt;CreateNotificationSetting200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A Notification Setting response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CreateNotificationSetting200Response> getNotificationSettingWithHttpInfo(UUID id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getNotificationSetting");
    }
    
    // create path and map variables
    String localVarPath = "/notification_settings/{id}"
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

    GenericType<CreateNotificationSetting200Response> localVarReturnType = new GenericType<CreateNotificationSetting200Response>() {};

    return apiClient.invokeAPI("NotificationsApi.getNotificationSetting", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * List notification channels
   * List notification channels.
   * @param pageNumber The page number to load (optional, default to 1)
   * @param pageSize The size of the page (optional, default to 20)
   * @param filterChannelTypeIdEq Filter by the id of a channel type (optional)
   * @return ListNotificationChannels200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Returns a list of notification channels. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ListNotificationChannels200Response listNotificationChannels(Integer pageNumber, Integer pageSize, String filterChannelTypeIdEq) throws ApiException {
    return listNotificationChannelsWithHttpInfo(pageNumber, pageSize, filterChannelTypeIdEq).getData();
  }

  /**
   * List notification channels
   * List notification channels.
   * @param pageNumber The page number to load (optional, default to 1)
   * @param pageSize The size of the page (optional, default to 20)
   * @param filterChannelTypeIdEq Filter by the id of a channel type (optional)
   * @return ApiResponse&lt;ListNotificationChannels200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Returns a list of notification channels. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ListNotificationChannels200Response> listNotificationChannelsWithHttpInfo(Integer pageNumber, Integer pageSize, String filterChannelTypeIdEq) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/notification_channels";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[number]", pageNumber));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[channel_type_id][eq]", filterChannelTypeIdEq));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    GenericType<ListNotificationChannels200Response> localVarReturnType = new GenericType<ListNotificationChannels200Response>() {};

    return apiClient.invokeAPI("NotificationsApi.listNotificationChannels", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * List notification settings
   * List notification settings.
   * @param pageNumber The page number to load (optional, default to 1)
   * @param pageSize The size of the page (optional, default to 20)
   * @param filterNotificationProfileIdEq Filter by the id of a notification profile (optional)
   * @param filterNotificationChannelEq Filter by the id of a notification channel (optional)
   * @param filterNotificationEventConditionIdEq Filter by the id of a notification channel (optional)
   * @param filterAssociatedRecordTypeEq Filter by the associated record type (optional)
   * @param status Filters calls by status. (optional)
   * @return ListNotificationSettings200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Returns a list of notification settings. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ListNotificationSettings200Response listNotificationSettings(Integer pageNumber, Integer pageSize, String filterNotificationProfileIdEq, String filterNotificationChannelEq, String filterNotificationEventConditionIdEq, String filterAssociatedRecordTypeEq, String status) throws ApiException {
    return listNotificationSettingsWithHttpInfo(pageNumber, pageSize, filterNotificationProfileIdEq, filterNotificationChannelEq, filterNotificationEventConditionIdEq, filterAssociatedRecordTypeEq, status).getData();
  }

  /**
   * List notification settings
   * List notification settings.
   * @param pageNumber The page number to load (optional, default to 1)
   * @param pageSize The size of the page (optional, default to 20)
   * @param filterNotificationProfileIdEq Filter by the id of a notification profile (optional)
   * @param filterNotificationChannelEq Filter by the id of a notification channel (optional)
   * @param filterNotificationEventConditionIdEq Filter by the id of a notification channel (optional)
   * @param filterAssociatedRecordTypeEq Filter by the associated record type (optional)
   * @param status Filters calls by status. (optional)
   * @return ApiResponse&lt;ListNotificationSettings200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Returns a list of notification settings. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ListNotificationSettings200Response> listNotificationSettingsWithHttpInfo(Integer pageNumber, Integer pageSize, String filterNotificationProfileIdEq, String filterNotificationChannelEq, String filterNotificationEventConditionIdEq, String filterAssociatedRecordTypeEq, String status) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/notification_settings";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[number]", pageNumber));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[notification_profile_id][eq]", filterNotificationProfileIdEq));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[notification_channel][eq]", filterNotificationChannelEq));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[notification_event_condition_id][eq]", filterNotificationEventConditionIdEq));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[associated_record_type][eq]", filterAssociatedRecordTypeEq));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "Status", status));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    GenericType<ListNotificationSettings200Response> localVarReturnType = new GenericType<ListNotificationSettings200Response>() {};

    return apiClient.invokeAPI("NotificationsApi.listNotificationSettings", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Update a notification channel
   * Update a notification channel.
   * @param id Identifies the resource. (required)
   * @param notificationChannel Update notification channel object (required)
   * @return CreateNotificationChannels200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A Notification Channel response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public CreateNotificationChannels200Response updateNotificationChannel(UUID id, NotificationChannel notificationChannel) throws ApiException {
    return updateNotificationChannelWithHttpInfo(id, notificationChannel).getData();
  }

  /**
   * Update a notification channel
   * Update a notification channel.
   * @param id Identifies the resource. (required)
   * @param notificationChannel Update notification channel object (required)
   * @return ApiResponse&lt;CreateNotificationChannels200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A Notification Channel response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CreateNotificationChannels200Response> updateNotificationChannelWithHttpInfo(UUID id, NotificationChannel notificationChannel) throws ApiException {
    Object localVarPostBody = notificationChannel;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling updateNotificationChannel");
    }
    
    // verify the required parameter 'notificationChannel' is set
    if (notificationChannel == null) {
      throw new ApiException(400, "Missing the required parameter 'notificationChannel' when calling updateNotificationChannel");
    }
    
    // create path and map variables
    String localVarPath = "/notification_channels/{id}"
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

    GenericType<CreateNotificationChannels200Response> localVarReturnType = new GenericType<CreateNotificationChannels200Response>() {};

    return apiClient.invokeAPI("NotificationsApi.updateNotificationChannel", localVarPath, "PATCH", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Update a notification profile
   * Update a notification profile.
   * @param id Identifies the resource. (required)
   * @param notificationProfile Update notification profile object (required)
   * @return CreateNotificationProfile200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A Notification Profile response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public CreateNotificationProfile200Response updateNotificationProfile(UUID id, NotificationProfile notificationProfile) throws ApiException {
    return updateNotificationProfileWithHttpInfo(id, notificationProfile).getData();
  }

  /**
   * Update a notification profile
   * Update a notification profile.
   * @param id Identifies the resource. (required)
   * @param notificationProfile Update notification profile object (required)
   * @return ApiResponse&lt;CreateNotificationProfile200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A Notification Profile response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CreateNotificationProfile200Response> updateNotificationProfileWithHttpInfo(UUID id, NotificationProfile notificationProfile) throws ApiException {
    Object localVarPostBody = notificationProfile;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling updateNotificationProfile");
    }
    
    // verify the required parameter 'notificationProfile' is set
    if (notificationProfile == null) {
      throw new ApiException(400, "Missing the required parameter 'notificationProfile' when calling updateNotificationProfile");
    }
    
    // create path and map variables
    String localVarPath = "/notification_profiles/{id}"
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

    GenericType<CreateNotificationProfile200Response> localVarReturnType = new GenericType<CreateNotificationProfile200Response>() {};

    return apiClient.invokeAPI("NotificationsApi.updateNotificationProfile", localVarPath, "PATCH", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
