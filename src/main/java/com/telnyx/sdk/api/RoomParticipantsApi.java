package com.telnyx.sdk.api;

import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.Pair;

import jakarta.ws.rs.core.GenericType;

import com.telnyx.sdk.model.Error;
import com.telnyx.sdk.model.ListRoomParticipants200Response;
import java.time.LocalDate;
import java.util.UUID;
import com.telnyx.sdk.model.ViewRoomParticipant200Response;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class RoomParticipantsApi {
  private ApiClient apiClient;

  public RoomParticipantsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public RoomParticipantsApi(ApiClient apiClient) {
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
   * View a list of room participants.
   * 
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
   * @param filterSessionId Session_id for filtering room participants. (optional)
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
  public ListRoomParticipants200Response listRoomParticipants(LocalDate filterDateJoinedAtEq, LocalDate filterDateJoinedAtGte, LocalDate filterDateJoinedAtLte, LocalDate filterDateUpdatedAtEq, LocalDate filterDateUpdatedAtGte, LocalDate filterDateUpdatedAtLte, LocalDate filterDateLeftAtEq, LocalDate filterDateLeftAtGte, LocalDate filterDateLeftAtLte, String filterContext, String filterSessionId, Integer pageSize, Integer pageNumber) throws ApiException {
    return listRoomParticipantsWithHttpInfo(filterDateJoinedAtEq, filterDateJoinedAtGte, filterDateJoinedAtLte, filterDateUpdatedAtEq, filterDateUpdatedAtGte, filterDateUpdatedAtLte, filterDateLeftAtEq, filterDateLeftAtGte, filterDateLeftAtLte, filterContext, filterSessionId, pageSize, pageNumber).getData();
  }

  /**
   * View a list of room participants.
   * 
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
   * @param filterSessionId Session_id for filtering room participants. (optional)
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
  public ApiResponse<ListRoomParticipants200Response> listRoomParticipantsWithHttpInfo(LocalDate filterDateJoinedAtEq, LocalDate filterDateJoinedAtGte, LocalDate filterDateJoinedAtLte, LocalDate filterDateUpdatedAtEq, LocalDate filterDateUpdatedAtGte, LocalDate filterDateUpdatedAtLte, LocalDate filterDateLeftAtEq, LocalDate filterDateLeftAtGte, LocalDate filterDateLeftAtLte, String filterContext, String filterSessionId, Integer pageSize, Integer pageNumber) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/room_participants";

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
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[session_id]", filterSessionId));
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

    return apiClient.invokeAPI("RoomParticipantsApi.listRoomParticipants", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * View a room participant.
   * 
   * @param roomParticipantId The unique identifier of a room participant. (required)
   * @return ViewRoomParticipant200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Get room participant response. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
     </table>
   */
  public ViewRoomParticipant200Response viewRoomParticipant(UUID roomParticipantId) throws ApiException {
    return viewRoomParticipantWithHttpInfo(roomParticipantId).getData();
  }

  /**
   * View a room participant.
   * 
   * @param roomParticipantId The unique identifier of a room participant. (required)
   * @return ApiResponse&lt;ViewRoomParticipant200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Get room participant response. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ViewRoomParticipant200Response> viewRoomParticipantWithHttpInfo(UUID roomParticipantId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'roomParticipantId' is set
    if (roomParticipantId == null) {
      throw new ApiException(400, "Missing the required parameter 'roomParticipantId' when calling viewRoomParticipant");
    }
    
    // create path and map variables
    String localVarPath = "/room_participants/{room_participant_id}"
      .replaceAll("\\{" + "room_participant_id" + "\\}", apiClient.escapeString(roomParticipantId.toString()));

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

    GenericType<ViewRoomParticipant200Response> localVarReturnType = new GenericType<ViewRoomParticipant200Response>() {};

    return apiClient.invokeAPI("RoomParticipantsApi.viewRoomParticipant", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
