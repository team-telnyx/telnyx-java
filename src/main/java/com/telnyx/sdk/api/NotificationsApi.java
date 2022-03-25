package com.telnyx.sdk.api;

import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.Pair;

import javax.ws.rs.core.GenericType;

import com.telnyx.sdk.model.CreateNotificationChannel;
import com.telnyx.sdk.model.CreateNotificationProfile;
import com.telnyx.sdk.model.CreateNotificationSetting;
import com.telnyx.sdk.model.CreateNotificationSettingAsync;
import com.telnyx.sdk.model.DeleteNotificationChannel;
import com.telnyx.sdk.model.DeleteNotificationProfiles;
import com.telnyx.sdk.model.DeleteNotificationSetting;
import com.telnyx.sdk.model.DeleteNotificationSettingAsync;
import com.telnyx.sdk.model.Errors;
import com.telnyx.sdk.model.ListNotificationChannels;
import com.telnyx.sdk.model.ListNotificationEvenConditions;
import com.telnyx.sdk.model.ListNotificationEvents;
import com.telnyx.sdk.model.ListNotificationProfiles;
import com.telnyx.sdk.model.ListNotificationSettings;
import com.telnyx.sdk.model.NotificationChannel;
import com.telnyx.sdk.model.NotificationProfile;
import com.telnyx.sdk.model.NotificationSetting;
import com.telnyx.sdk.model.RetrieveNotificationChannel;
import com.telnyx.sdk.model.RetrieveNotificationProfile;
import com.telnyx.sdk.model.RetrieveNotificationSetting;
import java.util.UUID;
import com.telnyx.sdk.model.UpdateNotificationChannel;
import com.telnyx.sdk.model.UpdateNotificationProfile;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
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
   * @return CreateNotificationChannel
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A Notification Channel response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public CreateNotificationChannel createNotificationChannels(NotificationChannel notificationChannel) throws ApiException {
    return createNotificationChannelsWithHttpInfo(notificationChannel).getData();
  }

  /**
   * Create a notification channel
   * Create a notification channel.
   * @param notificationChannel Add a Notification Channel (optional)
   * @return ApiResponse&lt;CreateNotificationChannel&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A Notification Channel response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CreateNotificationChannel> createNotificationChannelsWithHttpInfo(NotificationChannel notificationChannel) throws ApiException {
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

    GenericType<CreateNotificationChannel> localVarReturnType = new GenericType<CreateNotificationChannel>() {};

    return apiClient.invokeAPI("NotificationsApi.createNotificationChannels", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Create a notification profile
   * Create a notification profile.
   * @param notificationProfile Add a Notification Profile (optional)
   * @return CreateNotificationProfile
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A Notification Profile response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public CreateNotificationProfile createNotificationProfile(NotificationProfile notificationProfile) throws ApiException {
    return createNotificationProfileWithHttpInfo(notificationProfile).getData();
  }

  /**
   * Create a notification profile
   * Create a notification profile.
   * @param notificationProfile Add a Notification Profile (optional)
   * @return ApiResponse&lt;CreateNotificationProfile&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A Notification Profile response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CreateNotificationProfile> createNotificationProfileWithHttpInfo(NotificationProfile notificationProfile) throws ApiException {
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

    GenericType<CreateNotificationProfile> localVarReturnType = new GenericType<CreateNotificationProfile>() {};

    return apiClient.invokeAPI("NotificationsApi.createNotificationProfile", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Add a Notification Setting
   * Add a notification setting.
   * @param notificationSetting  (optional)
   * @return CreateNotificationSetting
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A Notification Setting response </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> A Notification Setting response - async </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public CreateNotificationSetting createNotificationSetting(NotificationSetting notificationSetting) throws ApiException {
    return createNotificationSettingWithHttpInfo(notificationSetting).getData();
  }

  /**
   * Add a Notification Setting
   * Add a notification setting.
   * @param notificationSetting  (optional)
   * @return ApiResponse&lt;CreateNotificationSetting&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A Notification Setting response </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> A Notification Setting response - async </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CreateNotificationSetting> createNotificationSettingWithHttpInfo(NotificationSetting notificationSetting) throws ApiException {
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

    GenericType<CreateNotificationSetting> localVarReturnType = new GenericType<CreateNotificationSetting>() {};

    return apiClient.invokeAPI("NotificationsApi.createNotificationSetting", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Delete a notification channel
   * Delete a notification channel.
   * @param id Identifies the resource. (required)
   * @return DeleteNotificationChannel
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A Notification Channel response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public DeleteNotificationChannel deleteNotificationChannel(UUID id) throws ApiException {
    return deleteNotificationChannelWithHttpInfo(id).getData();
  }

  /**
   * Delete a notification channel
   * Delete a notification channel.
   * @param id Identifies the resource. (required)
   * @return ApiResponse&lt;DeleteNotificationChannel&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A Notification Channel response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<DeleteNotificationChannel> deleteNotificationChannelWithHttpInfo(UUID id) throws ApiException {
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

    GenericType<DeleteNotificationChannel> localVarReturnType = new GenericType<DeleteNotificationChannel>() {};

    return apiClient.invokeAPI("NotificationsApi.deleteNotificationChannel", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Delete a notification profile
   * Delete a notification profile.
   * @param id Identifies the resource. (required)
   * @return DeleteNotificationProfiles
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A Notification Profile response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public DeleteNotificationProfiles deleteNotificationProfile(UUID id) throws ApiException {
    return deleteNotificationProfileWithHttpInfo(id).getData();
  }

  /**
   * Delete a notification profile
   * Delete a notification profile.
   * @param id Identifies the resource. (required)
   * @return ApiResponse&lt;DeleteNotificationProfiles&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A Notification Profile response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<DeleteNotificationProfiles> deleteNotificationProfileWithHttpInfo(UUID id) throws ApiException {
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

    GenericType<DeleteNotificationProfiles> localVarReturnType = new GenericType<DeleteNotificationProfiles>() {};

    return apiClient.invokeAPI("NotificationsApi.deleteNotificationProfile", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Delete a notification setting
   * Delete a notification setting.
   * @param id Identifies the resource. (required)
   * @return DeleteNotificationSetting
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A Notification Setting response </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> A Notification Setting response - async </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public DeleteNotificationSetting deleteNotificationSetting(UUID id) throws ApiException {
    return deleteNotificationSettingWithHttpInfo(id).getData();
  }

  /**
   * Delete a notification setting
   * Delete a notification setting.
   * @param id Identifies the resource. (required)
   * @return ApiResponse&lt;DeleteNotificationSetting&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A Notification Setting response </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> A Notification Setting response - async </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<DeleteNotificationSetting> deleteNotificationSettingWithHttpInfo(UUID id) throws ApiException {
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

    GenericType<DeleteNotificationSetting> localVarReturnType = new GenericType<DeleteNotificationSetting>() {};

    return apiClient.invokeAPI("NotificationsApi.deleteNotificationSetting", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * List all Notifications Events
   * Returns a list of your notifications events.
   * @param pageNumber The page number to load (optional, default to 1)
   * @param pageSize The size of the page (optional, default to 20)
   * @return ListNotificationEvents
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Returns a list of notification events available. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ListNotificationEvents findNotificationsEvents(Integer pageNumber, Integer pageSize) throws ApiException {
    return findNotificationsEventsWithHttpInfo(pageNumber, pageSize).getData();
  }

  /**
   * List all Notifications Events
   * Returns a list of your notifications events.
   * @param pageNumber The page number to load (optional, default to 1)
   * @param pageSize The size of the page (optional, default to 20)
   * @return ApiResponse&lt;ListNotificationEvents&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Returns a list of notification events available. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ListNotificationEvents> findNotificationsEventsWithHttpInfo(Integer pageNumber, Integer pageSize) throws ApiException {
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

    GenericType<ListNotificationEvents> localVarReturnType = new GenericType<ListNotificationEvents>() {};

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
   * @return ListNotificationEvenConditions
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Returns a list of notification event conditions available. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ListNotificationEvenConditions findNotificationsEventsConditions(Integer pageNumber, Integer pageSize, String filterAssociatedRecordTypeEq) throws ApiException {
    return findNotificationsEventsConditionsWithHttpInfo(pageNumber, pageSize, filterAssociatedRecordTypeEq).getData();
  }

  /**
   * List all Notifications Events Conditions
   * Returns a list of your notifications events conditions.
   * @param pageNumber The page number to load (optional, default to 1)
   * @param pageSize The size of the page (optional, default to 20)
   * @param filterAssociatedRecordTypeEq Filter by the associated record type (optional)
   * @return ApiResponse&lt;ListNotificationEvenConditions&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Returns a list of notification event conditions available. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ListNotificationEvenConditions> findNotificationsEventsConditionsWithHttpInfo(Integer pageNumber, Integer pageSize, String filterAssociatedRecordTypeEq) throws ApiException {
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

    GenericType<ListNotificationEvenConditions> localVarReturnType = new GenericType<ListNotificationEvenConditions>() {};

    return apiClient.invokeAPI("NotificationsApi.findNotificationsEventsConditions", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * List all Notifications Profiles
   * Returns a list of your notifications profiles.
   * @param pageNumber The page number to load (optional, default to 1)
   * @param pageSize The size of the page (optional, default to 20)
   * @return ListNotificationProfiles
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Returns a list of notification profiles. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ListNotificationProfiles findNotificationsProfiles(Integer pageNumber, Integer pageSize) throws ApiException {
    return findNotificationsProfilesWithHttpInfo(pageNumber, pageSize).getData();
  }

  /**
   * List all Notifications Profiles
   * Returns a list of your notifications profiles.
   * @param pageNumber The page number to load (optional, default to 1)
   * @param pageSize The size of the page (optional, default to 20)
   * @return ApiResponse&lt;ListNotificationProfiles&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Returns a list of notification profiles. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ListNotificationProfiles> findNotificationsProfilesWithHttpInfo(Integer pageNumber, Integer pageSize) throws ApiException {
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

    GenericType<ListNotificationProfiles> localVarReturnType = new GenericType<ListNotificationProfiles>() {};

    return apiClient.invokeAPI("NotificationsApi.findNotificationsProfiles", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * List notification channels
   * List notification channels.
   * @param pageNumber The page number to load (optional, default to 1)
   * @param pageSize The size of the page (optional, default to 20)
   * @param filterChannelTypeIdEq Filter by the id of a channel type (optional)
   * @return ListNotificationChannels
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Returns a list of notification channels. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ListNotificationChannels listNotificationChannels(Integer pageNumber, Integer pageSize, String filterChannelTypeIdEq) throws ApiException {
    return listNotificationChannelsWithHttpInfo(pageNumber, pageSize, filterChannelTypeIdEq).getData();
  }

  /**
   * List notification channels
   * List notification channels.
   * @param pageNumber The page number to load (optional, default to 1)
   * @param pageSize The size of the page (optional, default to 20)
   * @param filterChannelTypeIdEq Filter by the id of a channel type (optional)
   * @return ApiResponse&lt;ListNotificationChannels&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Returns a list of notification channels. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ListNotificationChannels> listNotificationChannelsWithHttpInfo(Integer pageNumber, Integer pageSize, String filterChannelTypeIdEq) throws ApiException {
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

    GenericType<ListNotificationChannels> localVarReturnType = new GenericType<ListNotificationChannels>() {};

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
   * @param filterStatusEq The status of a notification setting (optional)
   * @return ListNotificationSettings
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Returns a list of notification settings. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ListNotificationSettings listNotificationSettings(Integer pageNumber, Integer pageSize, String filterNotificationProfileIdEq, String filterNotificationChannelEq, String filterNotificationEventConditionIdEq, String filterAssociatedRecordTypeEq, String filterStatusEq) throws ApiException {
    return listNotificationSettingsWithHttpInfo(pageNumber, pageSize, filterNotificationProfileIdEq, filterNotificationChannelEq, filterNotificationEventConditionIdEq, filterAssociatedRecordTypeEq, filterStatusEq).getData();
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
   * @param filterStatusEq The status of a notification setting (optional)
   * @return ApiResponse&lt;ListNotificationSettings&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Returns a list of notification settings. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ListNotificationSettings> listNotificationSettingsWithHttpInfo(Integer pageNumber, Integer pageSize, String filterNotificationProfileIdEq, String filterNotificationChannelEq, String filterNotificationEventConditionIdEq, String filterAssociatedRecordTypeEq, String filterStatusEq) throws ApiException {
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
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[status][eq]", filterStatusEq));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    GenericType<ListNotificationSettings> localVarReturnType = new GenericType<ListNotificationSettings>() {};

    return apiClient.invokeAPI("NotificationsApi.listNotificationSettings", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Retrieve a notification channel
   * Retrieve a notification channel.
   * @param id Identifies the resource. (required)
   * @return RetrieveNotificationChannel
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A Notification Channel response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public RetrieveNotificationChannel retrieveNotificationChannel(UUID id) throws ApiException {
    return retrieveNotificationChannelWithHttpInfo(id).getData();
  }

  /**
   * Retrieve a notification channel
   * Retrieve a notification channel.
   * @param id Identifies the resource. (required)
   * @return ApiResponse&lt;RetrieveNotificationChannel&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A Notification Channel response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<RetrieveNotificationChannel> retrieveNotificationChannelWithHttpInfo(UUID id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling retrieveNotificationChannel");
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

    GenericType<RetrieveNotificationChannel> localVarReturnType = new GenericType<RetrieveNotificationChannel>() {};

    return apiClient.invokeAPI("NotificationsApi.retrieveNotificationChannel", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Retrieve a notification profile
   * Retrieve a notification profile.
   * @param id Identifies the resource. (required)
   * @return RetrieveNotificationProfile
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A Notification Profile response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public RetrieveNotificationProfile retrieveNotificationProfile(UUID id) throws ApiException {
    return retrieveNotificationProfileWithHttpInfo(id).getData();
  }

  /**
   * Retrieve a notification profile
   * Retrieve a notification profile.
   * @param id Identifies the resource. (required)
   * @return ApiResponse&lt;RetrieveNotificationProfile&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A Notification Profile response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<RetrieveNotificationProfile> retrieveNotificationProfileWithHttpInfo(UUID id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling retrieveNotificationProfile");
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

    GenericType<RetrieveNotificationProfile> localVarReturnType = new GenericType<RetrieveNotificationProfile>() {};

    return apiClient.invokeAPI("NotificationsApi.retrieveNotificationProfile", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Retrieve a notification setting
   * Retrieve a notification setting.
   * @param id Identifies the resource. (required)
   * @return RetrieveNotificationSetting
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A Notification Setting response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public RetrieveNotificationSetting retrieveNotificationSetting(UUID id) throws ApiException {
    return retrieveNotificationSettingWithHttpInfo(id).getData();
  }

  /**
   * Retrieve a notification setting
   * Retrieve a notification setting.
   * @param id Identifies the resource. (required)
   * @return ApiResponse&lt;RetrieveNotificationSetting&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A Notification Setting response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<RetrieveNotificationSetting> retrieveNotificationSettingWithHttpInfo(UUID id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling retrieveNotificationSetting");
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

    GenericType<RetrieveNotificationSetting> localVarReturnType = new GenericType<RetrieveNotificationSetting>() {};

    return apiClient.invokeAPI("NotificationsApi.retrieveNotificationSetting", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Update a notification channel
   * Update a notification channel.
   * @param id Identifies the resource. (required)
   * @param notificationChannel Update notification channel object (required)
   * @return UpdateNotificationChannel
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A Notification Channel response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public UpdateNotificationChannel updateNotificationChannel(UUID id, NotificationChannel notificationChannel) throws ApiException {
    return updateNotificationChannelWithHttpInfo(id, notificationChannel).getData();
  }

  /**
   * Update a notification channel
   * Update a notification channel.
   * @param id Identifies the resource. (required)
   * @param notificationChannel Update notification channel object (required)
   * @return ApiResponse&lt;UpdateNotificationChannel&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A Notification Channel response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<UpdateNotificationChannel> updateNotificationChannelWithHttpInfo(UUID id, NotificationChannel notificationChannel) throws ApiException {
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

    GenericType<UpdateNotificationChannel> localVarReturnType = new GenericType<UpdateNotificationChannel>() {};

    return apiClient.invokeAPI("NotificationsApi.updateNotificationChannel", localVarPath, "PATCH", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Update a notification profile
   * Update a notification profile.
   * @param id Identifies the resource. (required)
   * @param notificationProfile Update notification profile object (required)
   * @return UpdateNotificationProfile
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A Notification Profile response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public UpdateNotificationProfile updateNotificationProfile(UUID id, NotificationProfile notificationProfile) throws ApiException {
    return updateNotificationProfileWithHttpInfo(id, notificationProfile).getData();
  }

  /**
   * Update a notification profile
   * Update a notification profile.
   * @param id Identifies the resource. (required)
   * @param notificationProfile Update notification profile object (required)
   * @return ApiResponse&lt;UpdateNotificationProfile&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A Notification Profile response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<UpdateNotificationProfile> updateNotificationProfileWithHttpInfo(UUID id, NotificationProfile notificationProfile) throws ApiException {
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

    GenericType<UpdateNotificationProfile> localVarReturnType = new GenericType<UpdateNotificationProfile>() {};

    return apiClient.invokeAPI("NotificationsApi.updateNotificationProfile", localVarPath, "PATCH", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
