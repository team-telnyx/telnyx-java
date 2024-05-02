package com.telnyx.sdk.api;

import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.Pair;

import jakarta.ws.rs.core.GenericType;

import com.telnyx.sdk.model.CreateRoom201Response;
import com.telnyx.sdk.model.CreateRoomRequest;
import com.telnyx.sdk.model.Error;
import com.telnyx.sdk.model.Errors;
import com.telnyx.sdk.model.ListRoomSessions200Response;
import com.telnyx.sdk.model.ListRooms200Response;
import java.time.LocalDate;
import com.telnyx.sdk.model.PatchRoomRequest;
import java.util.UUID;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class RoomsApi {
  private ApiClient apiClient;

  public RoomsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public RoomsApi(ApiClient apiClient) {
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
   * Create a room.
   * Synchronously create a Room.
   * @param createRoomRequest Parameters that can be defined during room creation. (required)
   * @return CreateRoom201Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Create room response. </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check the &#39;detail&#39; field in response for details. </td><td>  -  </td></tr>
     </table>
   */
  public CreateRoom201Response createRoom(CreateRoomRequest createRoomRequest) throws ApiException {
    return createRoomWithHttpInfo(createRoomRequest).getData();
  }

  /**
   * Create a room.
   * Synchronously create a Room.
   * @param createRoomRequest Parameters that can be defined during room creation. (required)
   * @return ApiResponse&lt;CreateRoom201Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Create room response. </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check the &#39;detail&#39; field in response for details. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CreateRoom201Response> createRoomWithHttpInfo(CreateRoomRequest createRoomRequest) throws ApiException {
    Object localVarPostBody = createRoomRequest;
    
    // verify the required parameter 'createRoomRequest' is set
    if (createRoomRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'createRoomRequest' when calling createRoom");
    }
    
    // create path and map variables
    String localVarPath = "/rooms";

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

    GenericType<CreateRoom201Response> localVarReturnType = new GenericType<CreateRoom201Response>() {};

    return apiClient.invokeAPI("RoomsApi.createRoom", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Delete a room.
   * Synchronously delete a Room. Participants from that room will be kicked out, they won&#39;t be able to join that room anymore, and you won&#39;t be charged anymore for that room.
   * @param roomId The unique identifier of a room. (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> The resource was deleted successfully. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
     </table>
   */
  public void deleteRoom(UUID roomId) throws ApiException {
    deleteRoomWithHttpInfo(roomId);
  }

  /**
   * Delete a room.
   * Synchronously delete a Room. Participants from that room will be kicked out, they won&#39;t be able to join that room anymore, and you won&#39;t be charged anymore for that room.
   * @param roomId The unique identifier of a room. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> The resource was deleted successfully. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> deleteRoomWithHttpInfo(UUID roomId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'roomId' is set
    if (roomId == null) {
      throw new ApiException(400, "Missing the required parameter 'roomId' when calling deleteRoom");
    }
    
    // create path and map variables
    String localVarPath = "/rooms/{room_id}"
      .replaceAll("\\{" + "room_id" + "\\}", apiClient.escapeString(roomId.toString()));

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

    return apiClient.invokeAPI("RoomsApi.deleteRoom", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * View a list of room sessions.
   * 
   * @param roomId The unique identifier of a room. (required)
   * @param filterDateCreatedAtEq ISO 8601 date for filtering room sessions created on that date. (optional)
   * @param filterDateCreatedAtGte ISO 8601 date for filtering room sessions created after that date. (optional)
   * @param filterDateCreatedAtLte ISO 8601 date for filtering room sessions created before that date. (optional)
   * @param filterDateUpdatedAtEq ISO 8601 date for filtering room sessions updated on that date. (optional)
   * @param filterDateUpdatedAtGte ISO 8601 date for filtering room sessions updated after that date. (optional)
   * @param filterDateUpdatedAtLte ISO 8601 date for filtering room sessions updated before that date. (optional)
   * @param filterDateEndedAtEq ISO 8601 date for filtering room sessions ended on that date. (optional)
   * @param filterDateEndedAtGte ISO 8601 date for filtering room sessions ended after that date. (optional)
   * @param filterDateEndedAtLte ISO 8601 date for filtering room sessions ended before that date. (optional)
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
  public ListRoomSessions200Response listRoomSessions(UUID roomId, LocalDate filterDateCreatedAtEq, LocalDate filterDateCreatedAtGte, LocalDate filterDateCreatedAtLte, LocalDate filterDateUpdatedAtEq, LocalDate filterDateUpdatedAtGte, LocalDate filterDateUpdatedAtLte, LocalDate filterDateEndedAtEq, LocalDate filterDateEndedAtGte, LocalDate filterDateEndedAtLte, Boolean filterActive, Boolean includeParticipants, Integer pageSize, Integer pageNumber) throws ApiException {
    return listRoomSessionsWithHttpInfo(roomId, filterDateCreatedAtEq, filterDateCreatedAtGte, filterDateCreatedAtLte, filterDateUpdatedAtEq, filterDateUpdatedAtGte, filterDateUpdatedAtLte, filterDateEndedAtEq, filterDateEndedAtGte, filterDateEndedAtLte, filterActive, includeParticipants, pageSize, pageNumber).getData();
  }

  /**
   * View a list of room sessions.
   * 
   * @param roomId The unique identifier of a room. (required)
   * @param filterDateCreatedAtEq ISO 8601 date for filtering room sessions created on that date. (optional)
   * @param filterDateCreatedAtGte ISO 8601 date for filtering room sessions created after that date. (optional)
   * @param filterDateCreatedAtLte ISO 8601 date for filtering room sessions created before that date. (optional)
   * @param filterDateUpdatedAtEq ISO 8601 date for filtering room sessions updated on that date. (optional)
   * @param filterDateUpdatedAtGte ISO 8601 date for filtering room sessions updated after that date. (optional)
   * @param filterDateUpdatedAtLte ISO 8601 date for filtering room sessions updated before that date. (optional)
   * @param filterDateEndedAtEq ISO 8601 date for filtering room sessions ended on that date. (optional)
   * @param filterDateEndedAtGte ISO 8601 date for filtering room sessions ended after that date. (optional)
   * @param filterDateEndedAtLte ISO 8601 date for filtering room sessions ended before that date. (optional)
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
  public ApiResponse<ListRoomSessions200Response> listRoomSessionsWithHttpInfo(UUID roomId, LocalDate filterDateCreatedAtEq, LocalDate filterDateCreatedAtGte, LocalDate filterDateCreatedAtLte, LocalDate filterDateUpdatedAtEq, LocalDate filterDateUpdatedAtGte, LocalDate filterDateUpdatedAtLte, LocalDate filterDateEndedAtEq, LocalDate filterDateEndedAtGte, LocalDate filterDateEndedAtLte, Boolean filterActive, Boolean includeParticipants, Integer pageSize, Integer pageNumber) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'roomId' is set
    if (roomId == null) {
      throw new ApiException(400, "Missing the required parameter 'roomId' when calling listRoomSessions");
    }
    
    // create path and map variables
    String localVarPath = "/rooms/{room_id}/sessions"
      .replaceAll("\\{" + "room_id" + "\\}", apiClient.escapeString(roomId.toString()));

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

    return apiClient.invokeAPI("RoomsApi.listRoomSessions", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * View a list of rooms.
   * 
   * @param filterDateCreatedAtEq ISO 8601 date for filtering rooms created on that date. (optional)
   * @param filterDateCreatedAtGte ISO 8601 date for filtering rooms created after that date. (optional)
   * @param filterDateCreatedAtLte ISO 8601 date for filtering rooms created before that date. (optional)
   * @param filterDateUpdatedAtEq ISO 8601 date for filtering rooms updated on that date. (optional)
   * @param filterDateUpdatedAtGte ISO 8601 date for filtering rooms updated after that date. (optional)
   * @param filterDateUpdatedAtLte ISO 8601 date for filtering rooms updated before that date. (optional)
   * @param filterUniqueName Unique_name for filtering rooms. (optional)
   * @param includeSessions To decide if room sessions should be included in the response. (optional)
   * @param pageSize The size of the page (optional, default to 20)
   * @param pageNumber The page number to load (optional, default to 1)
   * @return ListRooms200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> List rooms response. </td><td>  -  </td></tr>
     </table>
   */
  public ListRooms200Response listRooms(LocalDate filterDateCreatedAtEq, LocalDate filterDateCreatedAtGte, LocalDate filterDateCreatedAtLte, LocalDate filterDateUpdatedAtEq, LocalDate filterDateUpdatedAtGte, LocalDate filterDateUpdatedAtLte, String filterUniqueName, Boolean includeSessions, Integer pageSize, Integer pageNumber) throws ApiException {
    return listRoomsWithHttpInfo(filterDateCreatedAtEq, filterDateCreatedAtGte, filterDateCreatedAtLte, filterDateUpdatedAtEq, filterDateUpdatedAtGte, filterDateUpdatedAtLte, filterUniqueName, includeSessions, pageSize, pageNumber).getData();
  }

  /**
   * View a list of rooms.
   * 
   * @param filterDateCreatedAtEq ISO 8601 date for filtering rooms created on that date. (optional)
   * @param filterDateCreatedAtGte ISO 8601 date for filtering rooms created after that date. (optional)
   * @param filterDateCreatedAtLte ISO 8601 date for filtering rooms created before that date. (optional)
   * @param filterDateUpdatedAtEq ISO 8601 date for filtering rooms updated on that date. (optional)
   * @param filterDateUpdatedAtGte ISO 8601 date for filtering rooms updated after that date. (optional)
   * @param filterDateUpdatedAtLte ISO 8601 date for filtering rooms updated before that date. (optional)
   * @param filterUniqueName Unique_name for filtering rooms. (optional)
   * @param includeSessions To decide if room sessions should be included in the response. (optional)
   * @param pageSize The size of the page (optional, default to 20)
   * @param pageNumber The page number to load (optional, default to 1)
   * @return ApiResponse&lt;ListRooms200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> List rooms response. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ListRooms200Response> listRoomsWithHttpInfo(LocalDate filterDateCreatedAtEq, LocalDate filterDateCreatedAtGte, LocalDate filterDateCreatedAtLte, LocalDate filterDateUpdatedAtEq, LocalDate filterDateUpdatedAtGte, LocalDate filterDateUpdatedAtLte, String filterUniqueName, Boolean includeSessions, Integer pageSize, Integer pageNumber) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/rooms";

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
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[unique_name]", filterUniqueName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include_sessions", includeSessions));
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

    GenericType<ListRooms200Response> localVarReturnType = new GenericType<ListRooms200Response>() {};

    return apiClient.invokeAPI("RoomsApi.listRooms", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Update a room.
   * Synchronously update a Room.
   * @param roomId The unique identifier of a room. (required)
   * @param patchRoomRequest Parameters that can be defined during room update. (required)
   * @return CreateRoom201Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Update room response. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated response. Happens when the current user cannot be authenticated. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Bad request </td><td>  -  </td></tr>
     </table>
   */
  public CreateRoom201Response updateRoom(UUID roomId, PatchRoomRequest patchRoomRequest) throws ApiException {
    return updateRoomWithHttpInfo(roomId, patchRoomRequest).getData();
  }

  /**
   * Update a room.
   * Synchronously update a Room.
   * @param roomId The unique identifier of a room. (required)
   * @param patchRoomRequest Parameters that can be defined during room update. (required)
   * @return ApiResponse&lt;CreateRoom201Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Update room response. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated response. Happens when the current user cannot be authenticated. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Bad request </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CreateRoom201Response> updateRoomWithHttpInfo(UUID roomId, PatchRoomRequest patchRoomRequest) throws ApiException {
    Object localVarPostBody = patchRoomRequest;
    
    // verify the required parameter 'roomId' is set
    if (roomId == null) {
      throw new ApiException(400, "Missing the required parameter 'roomId' when calling updateRoom");
    }
    
    // verify the required parameter 'patchRoomRequest' is set
    if (patchRoomRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'patchRoomRequest' when calling updateRoom");
    }
    
    // create path and map variables
    String localVarPath = "/rooms/{room_id}"
      .replaceAll("\\{" + "room_id" + "\\}", apiClient.escapeString(roomId.toString()));

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

    GenericType<CreateRoom201Response> localVarReturnType = new GenericType<CreateRoom201Response>() {};

    return apiClient.invokeAPI("RoomsApi.updateRoom", localVarPath, "PATCH", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * View a room.
   * 
   * @param roomId The unique identifier of a room. (required)
   * @param includeSessions To decide if room sessions should be included in the response. (optional)
   * @return CreateRoom201Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Get room response. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
     </table>
   */
  public CreateRoom201Response viewRoom(UUID roomId, Boolean includeSessions) throws ApiException {
    return viewRoomWithHttpInfo(roomId, includeSessions).getData();
  }

  /**
   * View a room.
   * 
   * @param roomId The unique identifier of a room. (required)
   * @param includeSessions To decide if room sessions should be included in the response. (optional)
   * @return ApiResponse&lt;CreateRoom201Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Get room response. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CreateRoom201Response> viewRoomWithHttpInfo(UUID roomId, Boolean includeSessions) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'roomId' is set
    if (roomId == null) {
      throw new ApiException(400, "Missing the required parameter 'roomId' when calling viewRoom");
    }
    
    // create path and map variables
    String localVarPath = "/rooms/{room_id}"
      .replaceAll("\\{" + "room_id" + "\\}", apiClient.escapeString(roomId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include_sessions", includeSessions));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    GenericType<CreateRoom201Response> localVarReturnType = new GenericType<CreateRoom201Response>() {};

    return apiClient.invokeAPI("RoomsApi.viewRoom", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
