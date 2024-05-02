package com.telnyx.sdk.api;

import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.Pair;

import jakarta.ws.rs.core.GenericType;

import com.telnyx.sdk.model.BulkRoomRecordingsDeleteResponse;
import com.telnyx.sdk.model.Error;
import com.telnyx.sdk.model.Errors;
import com.telnyx.sdk.model.ListRoomRecordings200Response;
import java.time.LocalDate;
import java.util.UUID;
import com.telnyx.sdk.model.ViewRoomRecording200Response;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class RoomRecordingsApi {
  private ApiClient apiClient;

  public RoomRecordingsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public RoomRecordingsApi(ApiClient apiClient) {
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
   * Delete a room recording.
   * Synchronously delete a Room Recording.
   * @param roomRecordingId The unique identifier of a room recording. (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> The resource was deleted successfully. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
     </table>
   */
  public void deleteRoomRecording(UUID roomRecordingId) throws ApiException {
    deleteRoomRecordingWithHttpInfo(roomRecordingId);
  }

  /**
   * Delete a room recording.
   * Synchronously delete a Room Recording.
   * @param roomRecordingId The unique identifier of a room recording. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> The resource was deleted successfully. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> deleteRoomRecordingWithHttpInfo(UUID roomRecordingId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'roomRecordingId' is set
    if (roomRecordingId == null) {
      throw new ApiException(400, "Missing the required parameter 'roomRecordingId' when calling deleteRoomRecording");
    }
    
    // create path and map variables
    String localVarPath = "/room_recordings/{room_recording_id}"
      .replaceAll("\\{" + "room_recording_id" + "\\}", apiClient.escapeString(roomRecordingId.toString()));

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

    return apiClient.invokeAPI("RoomRecordingsApi.deleteRoomRecording", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * Delete several room recordings in a bulk.
   * 
   * @param filterDateEndedAtEq ISO 8601 date for filtering room recordings ended on that date. (optional)
   * @param filterDateEndedAtGte ISO 8601 date for filtering room recordings ended after that date. (optional)
   * @param filterDateEndedAtLte ISO 8601 date for filtering room recordings ended before that date. (optional)
   * @param filterDateStartedAtEq ISO 8601 date for filtering room recordings started on that date. (optional)
   * @param filterDateStartedAtGte ISO 8601 date for filtering room recordings started after that date. (optional)
   * @param filterDateStartedAtLte ISO 8601 date for filtering room recordings started before that date. (optional)
   * @param filterRoomId room_id for filtering room recordings. (optional)
   * @param filterParticipantId participant_id for filtering room recordings. (optional)
   * @param filterSessionId session_id for filtering room recordings. (optional)
   * @param filterStatus status for filtering room recordings. (optional)
   * @param filterType type for filtering room recordings. (optional)
   * @param filterDurationSecsEq duration_secs equal for filtering room recordings. (optional)
   * @param filterDurationSecsLte duration_secs less or equal for filtering room recordings. (optional)
   * @param filterDurationSecsGte duration_secs greater or equal for filtering room recordings. (optional)
   * @param pageSize The size of the page (optional, default to 20)
   * @param pageNumber The page number to load (optional, default to 1)
   * @return BulkRoomRecordingsDeleteResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Successful response for Bulk Delete Room recordings requests </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check the &#39;detail&#39; field in response for details. </td><td>  -  </td></tr>
     </table>
   */
  public BulkRoomRecordingsDeleteResponse deleteRoomRecordings(LocalDate filterDateEndedAtEq, LocalDate filterDateEndedAtGte, LocalDate filterDateEndedAtLte, LocalDate filterDateStartedAtEq, LocalDate filterDateStartedAtGte, LocalDate filterDateStartedAtLte, UUID filterRoomId, UUID filterParticipantId, UUID filterSessionId, String filterStatus, String filterType, Integer filterDurationSecsEq, Integer filterDurationSecsLte, Integer filterDurationSecsGte, Integer pageSize, Integer pageNumber) throws ApiException {
    return deleteRoomRecordingsWithHttpInfo(filterDateEndedAtEq, filterDateEndedAtGte, filterDateEndedAtLte, filterDateStartedAtEq, filterDateStartedAtGte, filterDateStartedAtLte, filterRoomId, filterParticipantId, filterSessionId, filterStatus, filterType, filterDurationSecsEq, filterDurationSecsLte, filterDurationSecsGte, pageSize, pageNumber).getData();
  }

  /**
   * Delete several room recordings in a bulk.
   * 
   * @param filterDateEndedAtEq ISO 8601 date for filtering room recordings ended on that date. (optional)
   * @param filterDateEndedAtGte ISO 8601 date for filtering room recordings ended after that date. (optional)
   * @param filterDateEndedAtLte ISO 8601 date for filtering room recordings ended before that date. (optional)
   * @param filterDateStartedAtEq ISO 8601 date for filtering room recordings started on that date. (optional)
   * @param filterDateStartedAtGte ISO 8601 date for filtering room recordings started after that date. (optional)
   * @param filterDateStartedAtLte ISO 8601 date for filtering room recordings started before that date. (optional)
   * @param filterRoomId room_id for filtering room recordings. (optional)
   * @param filterParticipantId participant_id for filtering room recordings. (optional)
   * @param filterSessionId session_id for filtering room recordings. (optional)
   * @param filterStatus status for filtering room recordings. (optional)
   * @param filterType type for filtering room recordings. (optional)
   * @param filterDurationSecsEq duration_secs equal for filtering room recordings. (optional)
   * @param filterDurationSecsLte duration_secs less or equal for filtering room recordings. (optional)
   * @param filterDurationSecsGte duration_secs greater or equal for filtering room recordings. (optional)
   * @param pageSize The size of the page (optional, default to 20)
   * @param pageNumber The page number to load (optional, default to 1)
   * @return ApiResponse&lt;BulkRoomRecordingsDeleteResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Successful response for Bulk Delete Room recordings requests </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check the &#39;detail&#39; field in response for details. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<BulkRoomRecordingsDeleteResponse> deleteRoomRecordingsWithHttpInfo(LocalDate filterDateEndedAtEq, LocalDate filterDateEndedAtGte, LocalDate filterDateEndedAtLte, LocalDate filterDateStartedAtEq, LocalDate filterDateStartedAtGte, LocalDate filterDateStartedAtLte, UUID filterRoomId, UUID filterParticipantId, UUID filterSessionId, String filterStatus, String filterType, Integer filterDurationSecsEq, Integer filterDurationSecsLte, Integer filterDurationSecsGte, Integer pageSize, Integer pageNumber) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/room_recordings";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[date_ended_at][eq]", filterDateEndedAtEq));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[date_ended_at][gte]", filterDateEndedAtGte));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[date_ended_at][lte]", filterDateEndedAtLte));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[date_started_at][eq]", filterDateStartedAtEq));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[date_started_at][gte]", filterDateStartedAtGte));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[date_started_at][lte]", filterDateStartedAtLte));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[room_id]", filterRoomId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[participant_id]", filterParticipantId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[session_id]", filterSessionId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[status]", filterStatus));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[type]", filterType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[duration_secs][eq]", filterDurationSecsEq));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[duration_secs][lte]", filterDurationSecsLte));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[duration_secs][gte]", filterDurationSecsGte));
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

    GenericType<BulkRoomRecordingsDeleteResponse> localVarReturnType = new GenericType<BulkRoomRecordingsDeleteResponse>() {};

    return apiClient.invokeAPI("RoomRecordingsApi.deleteRoomRecordings", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * View a list of room recordings.
   * 
   * @param filterDateEndedAtEq ISO 8601 date for filtering room recordings ended on that date. (optional)
   * @param filterDateEndedAtGte ISO 8601 date for filtering room recordings ended after that date. (optional)
   * @param filterDateEndedAtLte ISO 8601 date for filtering room recordings ended before that date. (optional)
   * @param filterDateStartedAtEq ISO 8601 date for filtering room recordings started on that date. (optional)
   * @param filterDateStartedAtGte ISO 8601 date for filtering room recordings started after that date. (optional)
   * @param filterDateStartedAtLte ISO 8601 date for filtering room recordings started before that date. (optional)
   * @param filterRoomId room_id for filtering room recordings. (optional)
   * @param filterParticipantId participant_id for filtering room recordings. (optional)
   * @param filterSessionId session_id for filtering room recordings. (optional)
   * @param filterStatus status for filtering room recordings. (optional)
   * @param filterType type for filtering room recordings. (optional)
   * @param filterDurationSecsEq duration_secs equal for filtering room recordings. (optional)
   * @param filterDurationSecsLte duration_secs less or equal for filtering room recordings. (optional)
   * @param filterDurationSecsGte duration_secs greater or equal for filtering room recordings. (optional)
   * @param pageSize The size of the page (optional, default to 20)
   * @param pageNumber The page number to load (optional, default to 1)
   * @return ListRoomRecordings200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> List room recordings response. </td><td>  -  </td></tr>
     </table>
   */
  public ListRoomRecordings200Response listRoomRecordings(LocalDate filterDateEndedAtEq, LocalDate filterDateEndedAtGte, LocalDate filterDateEndedAtLte, LocalDate filterDateStartedAtEq, LocalDate filterDateStartedAtGte, LocalDate filterDateStartedAtLte, UUID filterRoomId, UUID filterParticipantId, UUID filterSessionId, String filterStatus, String filterType, Integer filterDurationSecsEq, Integer filterDurationSecsLte, Integer filterDurationSecsGte, Integer pageSize, Integer pageNumber) throws ApiException {
    return listRoomRecordingsWithHttpInfo(filterDateEndedAtEq, filterDateEndedAtGte, filterDateEndedAtLte, filterDateStartedAtEq, filterDateStartedAtGte, filterDateStartedAtLte, filterRoomId, filterParticipantId, filterSessionId, filterStatus, filterType, filterDurationSecsEq, filterDurationSecsLte, filterDurationSecsGte, pageSize, pageNumber).getData();
  }

  /**
   * View a list of room recordings.
   * 
   * @param filterDateEndedAtEq ISO 8601 date for filtering room recordings ended on that date. (optional)
   * @param filterDateEndedAtGte ISO 8601 date for filtering room recordings ended after that date. (optional)
   * @param filterDateEndedAtLte ISO 8601 date for filtering room recordings ended before that date. (optional)
   * @param filterDateStartedAtEq ISO 8601 date for filtering room recordings started on that date. (optional)
   * @param filterDateStartedAtGte ISO 8601 date for filtering room recordings started after that date. (optional)
   * @param filterDateStartedAtLte ISO 8601 date for filtering room recordings started before that date. (optional)
   * @param filterRoomId room_id for filtering room recordings. (optional)
   * @param filterParticipantId participant_id for filtering room recordings. (optional)
   * @param filterSessionId session_id for filtering room recordings. (optional)
   * @param filterStatus status for filtering room recordings. (optional)
   * @param filterType type for filtering room recordings. (optional)
   * @param filterDurationSecsEq duration_secs equal for filtering room recordings. (optional)
   * @param filterDurationSecsLte duration_secs less or equal for filtering room recordings. (optional)
   * @param filterDurationSecsGte duration_secs greater or equal for filtering room recordings. (optional)
   * @param pageSize The size of the page (optional, default to 20)
   * @param pageNumber The page number to load (optional, default to 1)
   * @return ApiResponse&lt;ListRoomRecordings200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> List room recordings response. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ListRoomRecordings200Response> listRoomRecordingsWithHttpInfo(LocalDate filterDateEndedAtEq, LocalDate filterDateEndedAtGte, LocalDate filterDateEndedAtLte, LocalDate filterDateStartedAtEq, LocalDate filterDateStartedAtGte, LocalDate filterDateStartedAtLte, UUID filterRoomId, UUID filterParticipantId, UUID filterSessionId, String filterStatus, String filterType, Integer filterDurationSecsEq, Integer filterDurationSecsLte, Integer filterDurationSecsGte, Integer pageSize, Integer pageNumber) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/room_recordings";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[date_ended_at][eq]", filterDateEndedAtEq));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[date_ended_at][gte]", filterDateEndedAtGte));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[date_ended_at][lte]", filterDateEndedAtLte));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[date_started_at][eq]", filterDateStartedAtEq));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[date_started_at][gte]", filterDateStartedAtGte));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[date_started_at][lte]", filterDateStartedAtLte));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[room_id]", filterRoomId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[participant_id]", filterParticipantId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[session_id]", filterSessionId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[status]", filterStatus));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[type]", filterType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[duration_secs][eq]", filterDurationSecsEq));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[duration_secs][lte]", filterDurationSecsLte));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[duration_secs][gte]", filterDurationSecsGte));
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

    GenericType<ListRoomRecordings200Response> localVarReturnType = new GenericType<ListRoomRecordings200Response>() {};

    return apiClient.invokeAPI("RoomRecordingsApi.listRoomRecordings", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * View a room recording.
   * 
   * @param roomRecordingId The unique identifier of a room recording. (required)
   * @return ViewRoomRecording200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Get room recording response. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
     </table>
   */
  public ViewRoomRecording200Response viewRoomRecording(UUID roomRecordingId) throws ApiException {
    return viewRoomRecordingWithHttpInfo(roomRecordingId).getData();
  }

  /**
   * View a room recording.
   * 
   * @param roomRecordingId The unique identifier of a room recording. (required)
   * @return ApiResponse&lt;ViewRoomRecording200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Get room recording response. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ViewRoomRecording200Response> viewRoomRecordingWithHttpInfo(UUID roomRecordingId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'roomRecordingId' is set
    if (roomRecordingId == null) {
      throw new ApiException(400, "Missing the required parameter 'roomRecordingId' when calling viewRoomRecording");
    }
    
    // create path and map variables
    String localVarPath = "/room_recordings/{room_recording_id}"
      .replaceAll("\\{" + "room_recording_id" + "\\}", apiClient.escapeString(roomRecordingId.toString()));

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

    GenericType<ViewRoomRecording200Response> localVarReturnType = new GenericType<ViewRoomRecording200Response>() {};

    return apiClient.invokeAPI("RoomRecordingsApi.viewRoomRecording", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
