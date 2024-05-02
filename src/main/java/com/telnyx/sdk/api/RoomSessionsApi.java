package com.telnyx.sdk.api;

import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.Pair;

import jakarta.ws.rs.core.GenericType;

import com.telnyx.sdk.model.ActionsParticipantsRequest;
import com.telnyx.sdk.model.EndSession200Response;
import com.telnyx.sdk.model.Error;
import com.telnyx.sdk.model.ListRoomParticipants200Response;
import com.telnyx.sdk.model.ListRoomSessions200Response;
import java.time.LocalDate;
import java.util.UUID;
import com.telnyx.sdk.model.ViewRoomSession200Response;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class RoomSessionsApi {
  private ApiClient apiClient;

  public RoomSessionsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public RoomSessionsApi(ApiClient apiClient) {
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
   * End a room session.
   * Note: this will also kick all participants currently present in the room
   * @param roomSessionId The unique identifier of a room session. (required)
   * @return EndSession200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success Action Response </td><td>  -  </td></tr>
     </table>
   */
  public EndSession200Response endSession(UUID roomSessionId) throws ApiException {
    return endSessionWithHttpInfo(roomSessionId).getData();
  }

  /**
   * End a room session.
   * Note: this will also kick all participants currently present in the room
   * @param roomSessionId The unique identifier of a room session. (required)
   * @return ApiResponse&lt;EndSession200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success Action Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<EndSession200Response> endSessionWithHttpInfo(UUID roomSessionId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'roomSessionId' is set
    if (roomSessionId == null) {
      throw new ApiException(400, "Missing the required parameter 'roomSessionId' when calling endSession");
    }
    
    // create path and map variables
    String localVarPath = "/room_sessions/{room_session_id}/actions/end"
      .replaceAll("\\{" + "room_session_id" + "\\}", apiClient.escapeString(roomSessionId.toString()));

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

    String[] localVarAuthNames = new String[] {  };

    GenericType<EndSession200Response> localVarReturnType = new GenericType<EndSession200Response>() {};

    return apiClient.invokeAPI("RoomSessionsApi.endSession", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Kick participants from a room session.
   * 
   * @param roomSessionId The unique identifier of a room session. (required)
   * @param actionsParticipantsRequest Parameters that can be defined during Kick action. (required)
   * @return EndSession200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success Action Response </td><td>  -  </td></tr>
     </table>
   */
  public EndSession200Response kickParticipantInSession(UUID roomSessionId, ActionsParticipantsRequest actionsParticipantsRequest) throws ApiException {
    return kickParticipantInSessionWithHttpInfo(roomSessionId, actionsParticipantsRequest).getData();
  }

  /**
   * Kick participants from a room session.
   * 
   * @param roomSessionId The unique identifier of a room session. (required)
   * @param actionsParticipantsRequest Parameters that can be defined during Kick action. (required)
   * @return ApiResponse&lt;EndSession200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success Action Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<EndSession200Response> kickParticipantInSessionWithHttpInfo(UUID roomSessionId, ActionsParticipantsRequest actionsParticipantsRequest) throws ApiException {
    Object localVarPostBody = actionsParticipantsRequest;
    
    // verify the required parameter 'roomSessionId' is set
    if (roomSessionId == null) {
      throw new ApiException(400, "Missing the required parameter 'roomSessionId' when calling kickParticipantInSession");
    }
    
    // verify the required parameter 'actionsParticipantsRequest' is set
    if (actionsParticipantsRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'actionsParticipantsRequest' when calling kickParticipantInSession");
    }
    
    // create path and map variables
    String localVarPath = "/room_sessions/{room_session_id}/actions/kick"
      .replaceAll("\\{" + "room_session_id" + "\\}", apiClient.escapeString(roomSessionId.toString()));

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

    String[] localVarAuthNames = new String[] {  };

    GenericType<EndSession200Response> localVarReturnType = new GenericType<EndSession200Response>() {};

    return apiClient.invokeAPI("RoomSessionsApi.kickParticipantInSession", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * View a list of room participants.
   * 
   * @param roomSessionId The unique identifier of a room session. (required)
   * @param filterDateJoinedAtEq ISO 8601 date for filtering room participants that joined on that date. (optional)
   * @param filterDateJoinedAtGte ISO 8601 date for filtering room participants that joined after that date. (optional)
   * @param filterDateJoinedAtLte ISO 8601 date for filtering room participants that joined before that date. (optional)
   * @param filterDateUpdatedAtEq ISO 8601 date for filtering room participants updated on that date. (optional)
   * @param filterDateUpdatedAtGte ISO 8601 date for filtering room participants updated after that date. (optional)
   * @param filterDateUpdatedAtLte ISO 8601 date for filtering room participants updated before that date. (optional)
   * @param filterDateLeftAtEq ISO 8601 date for filtering room participants that left on that date. (optional)
   * @param filterDateLeftAtGte ISO 8601 date for filtering room participants that left after that date. (optional)
   * @param filterDateLeftAtLte ISO 8601 date for filtering room participants that left before that date. (optional)
   * @param filterContext Filter room participants based on the context. (optional)
   * @param pageSize The size of the page (optional, default to 20)
   * @param pageNumber The page number to load (optional, default to 1)
   * @return ListRoomParticipants200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> List room participants response. </td><td>  -  </td></tr>
     </table>
   */
  public ListRoomParticipants200Response listRoomParticipants(UUID roomSessionId, LocalDate filterDateJoinedAtEq, LocalDate filterDateJoinedAtGte, LocalDate filterDateJoinedAtLte, LocalDate filterDateUpdatedAtEq, LocalDate filterDateUpdatedAtGte, LocalDate filterDateUpdatedAtLte, LocalDate filterDateLeftAtEq, LocalDate filterDateLeftAtGte, LocalDate filterDateLeftAtLte, String filterContext, Integer pageSize, Integer pageNumber) throws ApiException {
    return listRoomParticipantsWithHttpInfo(roomSessionId, filterDateJoinedAtEq, filterDateJoinedAtGte, filterDateJoinedAtLte, filterDateUpdatedAtEq, filterDateUpdatedAtGte, filterDateUpdatedAtLte, filterDateLeftAtEq, filterDateLeftAtGte, filterDateLeftAtLte, filterContext, pageSize, pageNumber).getData();
  }

  /**
   * View a list of room participants.
   * 
   * @param roomSessionId The unique identifier of a room session. (required)
   * @param filterDateJoinedAtEq ISO 8601 date for filtering room participants that joined on that date. (optional)
   * @param filterDateJoinedAtGte ISO 8601 date for filtering room participants that joined after that date. (optional)
   * @param filterDateJoinedAtLte ISO 8601 date for filtering room participants that joined before that date. (optional)
   * @param filterDateUpdatedAtEq ISO 8601 date for filtering room participants updated on that date. (optional)
   * @param filterDateUpdatedAtGte ISO 8601 date for filtering room participants updated after that date. (optional)
   * @param filterDateUpdatedAtLte ISO 8601 date for filtering room participants updated before that date. (optional)
   * @param filterDateLeftAtEq ISO 8601 date for filtering room participants that left on that date. (optional)
   * @param filterDateLeftAtGte ISO 8601 date for filtering room participants that left after that date. (optional)
   * @param filterDateLeftAtLte ISO 8601 date for filtering room participants that left before that date. (optional)
   * @param filterContext Filter room participants based on the context. (optional)
   * @param pageSize The size of the page (optional, default to 20)
   * @param pageNumber The page number to load (optional, default to 1)
   * @return ApiResponse&lt;ListRoomParticipants200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> List room participants response. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ListRoomParticipants200Response> listRoomParticipantsWithHttpInfo(UUID roomSessionId, LocalDate filterDateJoinedAtEq, LocalDate filterDateJoinedAtGte, LocalDate filterDateJoinedAtLte, LocalDate filterDateUpdatedAtEq, LocalDate filterDateUpdatedAtGte, LocalDate filterDateUpdatedAtLte, LocalDate filterDateLeftAtEq, LocalDate filterDateLeftAtGte, LocalDate filterDateLeftAtLte, String filterContext, Integer pageSize, Integer pageNumber) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'roomSessionId' is set
    if (roomSessionId == null) {
      throw new ApiException(400, "Missing the required parameter 'roomSessionId' when calling listRoomParticipants");
    }
    
    // create path and map variables
    String localVarPath = "/room_sessions/{room_session_id}/participants"
      .replaceAll("\\{" + "room_session_id" + "\\}", apiClient.escapeString(roomSessionId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[date_joined_at][eq]", filterDateJoinedAtEq));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[date_joined_at][gte]", filterDateJoinedAtGte));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[date_joined_at][lte]", filterDateJoinedAtLte));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[date_updated_at][eq]", filterDateUpdatedAtEq));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[date_updated_at][gte]", filterDateUpdatedAtGte));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[date_updated_at][lte]", filterDateUpdatedAtLte));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[date_left_at][eq]", filterDateLeftAtEq));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[date_left_at][gte]", filterDateLeftAtGte));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[date_left_at][lte]", filterDateLeftAtLte));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[context]", filterContext));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[number]", pageNumber));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    GenericType<ListRoomParticipants200Response> localVarReturnType = new GenericType<ListRoomParticipants200Response>() {};

    return apiClient.invokeAPI("RoomSessionsApi.listRoomParticipants", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * View a list of room sessions.
   * 
   * @param filterDateCreatedAtEq ISO 8601 date for filtering room sessions created on that date. (optional)
   * @param filterDateCreatedAtGte ISO 8601 date for filtering room sessions created after that date. (optional)
   * @param filterDateCreatedAtLte ISO 8601 date for filtering room sessions created before that date. (optional)
   * @param filterDateUpdatedAtEq ISO 8601 date for filtering room sessions updated on that date. (optional)
   * @param filterDateUpdatedAtGte ISO 8601 date for filtering room sessions updated after that date. (optional)
   * @param filterDateUpdatedAtLte ISO 8601 date for filtering room sessions updated before that date. (optional)
   * @param filterDateEndedAtEq ISO 8601 date for filtering room sessions ended on that date. (optional)
   * @param filterDateEndedAtGte ISO 8601 date for filtering room sessions ended after that date. (optional)
   * @param filterDateEndedAtLte ISO 8601 date for filtering room sessions ended before that date. (optional)
   * @param filterRoomId Room_id for filtering room sessions. (optional)
   * @param filterActive Filter active or inactive room sessions. (optional)
   * @param includeParticipants To decide if room participants should be included in the response. (optional)
   * @param pageSize The size of the page (optional, default to 20)
   * @param pageNumber The page number to load (optional, default to 1)
   * @return ListRoomSessions200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> List room sessions response. </td><td>  -  </td></tr>
     </table>
   */
  public ListRoomSessions200Response listRoomSessions(LocalDate filterDateCreatedAtEq, LocalDate filterDateCreatedAtGte, LocalDate filterDateCreatedAtLte, LocalDate filterDateUpdatedAtEq, LocalDate filterDateUpdatedAtGte, LocalDate filterDateUpdatedAtLte, LocalDate filterDateEndedAtEq, LocalDate filterDateEndedAtGte, LocalDate filterDateEndedAtLte, String filterRoomId, Boolean filterActive, Boolean includeParticipants, Integer pageSize, Integer pageNumber) throws ApiException {
    return listRoomSessionsWithHttpInfo(filterDateCreatedAtEq, filterDateCreatedAtGte, filterDateCreatedAtLte, filterDateUpdatedAtEq, filterDateUpdatedAtGte, filterDateUpdatedAtLte, filterDateEndedAtEq, filterDateEndedAtGte, filterDateEndedAtLte, filterRoomId, filterActive, includeParticipants, pageSize, pageNumber).getData();
  }

  /**
   * View a list of room sessions.
   * 
   * @param filterDateCreatedAtEq ISO 8601 date for filtering room sessions created on that date. (optional)
   * @param filterDateCreatedAtGte ISO 8601 date for filtering room sessions created after that date. (optional)
   * @param filterDateCreatedAtLte ISO 8601 date for filtering room sessions created before that date. (optional)
   * @param filterDateUpdatedAtEq ISO 8601 date for filtering room sessions updated on that date. (optional)
   * @param filterDateUpdatedAtGte ISO 8601 date for filtering room sessions updated after that date. (optional)
   * @param filterDateUpdatedAtLte ISO 8601 date for filtering room sessions updated before that date. (optional)
   * @param filterDateEndedAtEq ISO 8601 date for filtering room sessions ended on that date. (optional)
   * @param filterDateEndedAtGte ISO 8601 date for filtering room sessions ended after that date. (optional)
   * @param filterDateEndedAtLte ISO 8601 date for filtering room sessions ended before that date. (optional)
   * @param filterRoomId Room_id for filtering room sessions. (optional)
   * @param filterActive Filter active or inactive room sessions. (optional)
   * @param includeParticipants To decide if room participants should be included in the response. (optional)
   * @param pageSize The size of the page (optional, default to 20)
   * @param pageNumber The page number to load (optional, default to 1)
   * @return ApiResponse&lt;ListRoomSessions200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> List room sessions response. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ListRoomSessions200Response> listRoomSessionsWithHttpInfo(LocalDate filterDateCreatedAtEq, LocalDate filterDateCreatedAtGte, LocalDate filterDateCreatedAtLte, LocalDate filterDateUpdatedAtEq, LocalDate filterDateUpdatedAtGte, LocalDate filterDateUpdatedAtLte, LocalDate filterDateEndedAtEq, LocalDate filterDateEndedAtGte, LocalDate filterDateEndedAtLte, String filterRoomId, Boolean filterActive, Boolean includeParticipants, Integer pageSize, Integer pageNumber) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/room_sessions";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[date_created_at][eq]", filterDateCreatedAtEq));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[date_created_at][gte]", filterDateCreatedAtGte));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[date_created_at][lte]", filterDateCreatedAtLte));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[date_updated_at][eq]", filterDateUpdatedAtEq));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[date_updated_at][gte]", filterDateUpdatedAtGte));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[date_updated_at][lte]", filterDateUpdatedAtLte));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[date_ended_at][eq]", filterDateEndedAtEq));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[date_ended_at][gte]", filterDateEndedAtGte));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[date_ended_at][lte]", filterDateEndedAtLte));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[room_id]", filterRoomId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[active]", filterActive));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include_participants", includeParticipants));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[number]", pageNumber));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    GenericType<ListRoomSessions200Response> localVarReturnType = new GenericType<ListRoomSessions200Response>() {};

    return apiClient.invokeAPI("RoomSessionsApi.listRoomSessions", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Mute participants in room session.
   * 
   * @param roomSessionId The unique identifier of a room session. (required)
   * @param actionsParticipantsRequest Parameters that can be defined during Mute action. (required)
   * @return EndSession200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success Action Response </td><td>  -  </td></tr>
     </table>
   */
  public EndSession200Response muteParticipantInSession(UUID roomSessionId, ActionsParticipantsRequest actionsParticipantsRequest) throws ApiException {
    return muteParticipantInSessionWithHttpInfo(roomSessionId, actionsParticipantsRequest).getData();
  }

  /**
   * Mute participants in room session.
   * 
   * @param roomSessionId The unique identifier of a room session. (required)
   * @param actionsParticipantsRequest Parameters that can be defined during Mute action. (required)
   * @return ApiResponse&lt;EndSession200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success Action Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<EndSession200Response> muteParticipantInSessionWithHttpInfo(UUID roomSessionId, ActionsParticipantsRequest actionsParticipantsRequest) throws ApiException {
    Object localVarPostBody = actionsParticipantsRequest;
    
    // verify the required parameter 'roomSessionId' is set
    if (roomSessionId == null) {
      throw new ApiException(400, "Missing the required parameter 'roomSessionId' when calling muteParticipantInSession");
    }
    
    // verify the required parameter 'actionsParticipantsRequest' is set
    if (actionsParticipantsRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'actionsParticipantsRequest' when calling muteParticipantInSession");
    }
    
    // create path and map variables
    String localVarPath = "/room_sessions/{room_session_id}/actions/mute"
      .replaceAll("\\{" + "room_session_id" + "\\}", apiClient.escapeString(roomSessionId.toString()));

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

    String[] localVarAuthNames = new String[] {  };

    GenericType<EndSession200Response> localVarReturnType = new GenericType<EndSession200Response>() {};

    return apiClient.invokeAPI("RoomSessionsApi.muteParticipantInSession", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Unmute participants in room session.
   * 
   * @param roomSessionId The unique identifier of a room session. (required)
   * @param actionsParticipantsRequest Parameters that can be defined during Unmute action. (required)
   * @return EndSession200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success Action Response </td><td>  -  </td></tr>
     </table>
   */
  public EndSession200Response unmuteParticipantInSession(UUID roomSessionId, ActionsParticipantsRequest actionsParticipantsRequest) throws ApiException {
    return unmuteParticipantInSessionWithHttpInfo(roomSessionId, actionsParticipantsRequest).getData();
  }

  /**
   * Unmute participants in room session.
   * 
   * @param roomSessionId The unique identifier of a room session. (required)
   * @param actionsParticipantsRequest Parameters that can be defined during Unmute action. (required)
   * @return ApiResponse&lt;EndSession200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success Action Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<EndSession200Response> unmuteParticipantInSessionWithHttpInfo(UUID roomSessionId, ActionsParticipantsRequest actionsParticipantsRequest) throws ApiException {
    Object localVarPostBody = actionsParticipantsRequest;
    
    // verify the required parameter 'roomSessionId' is set
    if (roomSessionId == null) {
      throw new ApiException(400, "Missing the required parameter 'roomSessionId' when calling unmuteParticipantInSession");
    }
    
    // verify the required parameter 'actionsParticipantsRequest' is set
    if (actionsParticipantsRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'actionsParticipantsRequest' when calling unmuteParticipantInSession");
    }
    
    // create path and map variables
    String localVarPath = "/room_sessions/{room_session_id}/actions/unmute"
      .replaceAll("\\{" + "room_session_id" + "\\}", apiClient.escapeString(roomSessionId.toString()));

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

    String[] localVarAuthNames = new String[] {  };

    GenericType<EndSession200Response> localVarReturnType = new GenericType<EndSession200Response>() {};

    return apiClient.invokeAPI("RoomSessionsApi.unmuteParticipantInSession", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * View a room session.
   * 
   * @param roomSessionId The unique identifier of a room session. (required)
   * @param includeParticipants To decide if room participants should be included in the response. (optional)
   * @return ViewRoomSession200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Get room session response. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
     </table>
   */
  public ViewRoomSession200Response viewRoomSession(UUID roomSessionId, Boolean includeParticipants) throws ApiException {
    return viewRoomSessionWithHttpInfo(roomSessionId, includeParticipants).getData();
  }

  /**
   * View a room session.
   * 
   * @param roomSessionId The unique identifier of a room session. (required)
   * @param includeParticipants To decide if room participants should be included in the response. (optional)
   * @return ApiResponse&lt;ViewRoomSession200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Get room session response. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ViewRoomSession200Response> viewRoomSessionWithHttpInfo(UUID roomSessionId, Boolean includeParticipants) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'roomSessionId' is set
    if (roomSessionId == null) {
      throw new ApiException(400, "Missing the required parameter 'roomSessionId' when calling viewRoomSession");
    }
    
    // create path and map variables
    String localVarPath = "/room_sessions/{room_session_id}"
      .replaceAll("\\{" + "room_session_id" + "\\}", apiClient.escapeString(roomSessionId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include_participants", includeParticipants));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    GenericType<ViewRoomSession200Response> localVarReturnType = new GenericType<ViewRoomSession200Response>() {};

    return apiClient.invokeAPI("RoomSessionsApi.viewRoomSession", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
