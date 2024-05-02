package com.telnyx.sdk.api;

import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.Pair;

import jakarta.ws.rs.core.GenericType;

import com.telnyx.sdk.model.ConferenceCommandResponse;
import com.telnyx.sdk.model.ConferenceHoldRequest;
import com.telnyx.sdk.model.ConferenceMuteRequest;
import com.telnyx.sdk.model.ConferencePlayRequest;
import com.telnyx.sdk.model.ConferenceResponse;
import com.telnyx.sdk.model.ConferenceSpeakRequest;
import com.telnyx.sdk.model.ConferenceStopRequest;
import com.telnyx.sdk.model.ConferenceUnholdRequest;
import com.telnyx.sdk.model.ConferenceUnmuteRequest;
import com.telnyx.sdk.model.CreateConferenceRequest;
import com.telnyx.sdk.model.JoinConferenceRequest;
import com.telnyx.sdk.model.LeaveConferenceRequest;
import com.telnyx.sdk.model.ListConferencesResponse;
import com.telnyx.sdk.model.ListParticipantsResponse;
import com.telnyx.sdk.model.PauseConferenceRecordingRequest;
import com.telnyx.sdk.model.ResourceNotFound;
import com.telnyx.sdk.model.ResumeConferenceRecordingRequest;
import com.telnyx.sdk.model.StartConferenceRecordingRequest;
import com.telnyx.sdk.model.StopRecordingRequest;
import com.telnyx.sdk.model.UpdateConferenceRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class ConferenceCommandsApi {
  private ApiClient apiClient;

  public ConferenceCommandsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ConferenceCommandsApi(ApiClient apiClient) {
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
   * Create conference
   * Create a conference from an existing call leg using a &#x60;call_control_id&#x60; and a conference name. Upon creating the conference, the call will be automatically bridged to the conference. Conferences will expire after all participants have left the conference or after 4 hours regardless of the number of active participants.  **Expected Webhooks:**  - &#x60;conference.created&#x60; - &#x60;conference.participant.joined&#x60; - &#x60;conference.participant.left&#x60; - &#x60;conference.ended&#x60; - &#x60;conference.recording.saved&#x60; - &#x60;conference.floor.changed&#x60; 
   * @param createConferenceRequest Create a conference (required)
   * @return ConferenceResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response with details about a conference. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated response. Happens when the current user cannot be authenticated. </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity </td><td>  -  </td></tr>
     </table>
   */
  public ConferenceResponse createConference(CreateConferenceRequest createConferenceRequest) throws ApiException {
    return createConferenceWithHttpInfo(createConferenceRequest).getData();
  }

  /**
   * Create conference
   * Create a conference from an existing call leg using a &#x60;call_control_id&#x60; and a conference name. Upon creating the conference, the call will be automatically bridged to the conference. Conferences will expire after all participants have left the conference or after 4 hours regardless of the number of active participants.  **Expected Webhooks:**  - &#x60;conference.created&#x60; - &#x60;conference.participant.joined&#x60; - &#x60;conference.participant.left&#x60; - &#x60;conference.ended&#x60; - &#x60;conference.recording.saved&#x60; - &#x60;conference.floor.changed&#x60; 
   * @param createConferenceRequest Create a conference (required)
   * @return ApiResponse&lt;ConferenceResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response with details about a conference. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated response. Happens when the current user cannot be authenticated. </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ConferenceResponse> createConferenceWithHttpInfo(CreateConferenceRequest createConferenceRequest) throws ApiException {
    Object localVarPostBody = createConferenceRequest;
    
    // verify the required parameter 'createConferenceRequest' is set
    if (createConferenceRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'createConferenceRequest' when calling createConference");
    }
    
    // create path and map variables
    String localVarPath = "/conferences";

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

    GenericType<ConferenceResponse> localVarReturnType = new GenericType<ConferenceResponse>() {};

    return apiClient.invokeAPI("ConferenceCommandsApi.createConference", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Hold conference participants
   * Hold a list of participants in a conference call
   * @param id Uniquely identifies the conference by id or name (required)
   * @param conferenceHoldRequest  (required)
   * @return ConferenceCommandResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response upon making a conference command. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated response. Happens when the current user cannot be authenticated. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity </td><td>  -  </td></tr>
     </table>
   */
  public ConferenceCommandResponse holdConferenceParticipants(String id, ConferenceHoldRequest conferenceHoldRequest) throws ApiException {
    return holdConferenceParticipantsWithHttpInfo(id, conferenceHoldRequest).getData();
  }

  /**
   * Hold conference participants
   * Hold a list of participants in a conference call
   * @param id Uniquely identifies the conference by id or name (required)
   * @param conferenceHoldRequest  (required)
   * @return ApiResponse&lt;ConferenceCommandResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response upon making a conference command. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated response. Happens when the current user cannot be authenticated. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ConferenceCommandResponse> holdConferenceParticipantsWithHttpInfo(String id, ConferenceHoldRequest conferenceHoldRequest) throws ApiException {
    Object localVarPostBody = conferenceHoldRequest;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling holdConferenceParticipants");
    }
    
    // verify the required parameter 'conferenceHoldRequest' is set
    if (conferenceHoldRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'conferenceHoldRequest' when calling holdConferenceParticipants");
    }
    
    // create path and map variables
    String localVarPath = "/conferences/{id}/actions/hold"
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

    GenericType<ConferenceCommandResponse> localVarReturnType = new GenericType<ConferenceCommandResponse>() {};

    return apiClient.invokeAPI("ConferenceCommandsApi.holdConferenceParticipants", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Join a conference
   * Join an existing call leg to a conference. Issue the Join Conference command with the conference ID in the path and the &#x60;call_control_id&#x60; of the leg you wish to join to the conference as an attribute. The conference can have up to a certain amount of active participants, as set by the &#x60;max_participants&#x60; parameter in conference creation request.   **Expected Webhooks:**  - &#x60;conference.participant.joined&#x60; - &#x60;conference.participant.left&#x60; 
   * @param id Uniquely identifies the conference by id or name (required)
   * @param joinConferenceRequest Join Conference request object (required)
   * @return ConferenceCommandResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response upon making a conference command. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated response. Happens when the current user cannot be authenticated. </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity </td><td>  -  </td></tr>
     </table>
   */
  public ConferenceCommandResponse joinConference(String id, JoinConferenceRequest joinConferenceRequest) throws ApiException {
    return joinConferenceWithHttpInfo(id, joinConferenceRequest).getData();
  }

  /**
   * Join a conference
   * Join an existing call leg to a conference. Issue the Join Conference command with the conference ID in the path and the &#x60;call_control_id&#x60; of the leg you wish to join to the conference as an attribute. The conference can have up to a certain amount of active participants, as set by the &#x60;max_participants&#x60; parameter in conference creation request.   **Expected Webhooks:**  - &#x60;conference.participant.joined&#x60; - &#x60;conference.participant.left&#x60; 
   * @param id Uniquely identifies the conference by id or name (required)
   * @param joinConferenceRequest Join Conference request object (required)
   * @return ApiResponse&lt;ConferenceCommandResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response upon making a conference command. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated response. Happens when the current user cannot be authenticated. </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ConferenceCommandResponse> joinConferenceWithHttpInfo(String id, JoinConferenceRequest joinConferenceRequest) throws ApiException {
    Object localVarPostBody = joinConferenceRequest;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling joinConference");
    }
    
    // verify the required parameter 'joinConferenceRequest' is set
    if (joinConferenceRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'joinConferenceRequest' when calling joinConference");
    }
    
    // create path and map variables
    String localVarPath = "/conferences/{id}/actions/join"
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

    GenericType<ConferenceCommandResponse> localVarReturnType = new GenericType<ConferenceCommandResponse>() {};

    return apiClient.invokeAPI("ConferenceCommandsApi.joinConference", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Leave a conference
   * Removes a call leg from a conference and moves it back to parked state. **Expected Webhooks:**  - &#x60;conference.participant.left&#x60; 
   * @param id Uniquely identifies the conference by id or name (required)
   * @param leaveConferenceRequest Leave Conference request object (required)
   * @return ConferenceCommandResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response upon making a conference command. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated response. Happens when the current user cannot be authenticated. </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity </td><td>  -  </td></tr>
     </table>
   */
  public ConferenceCommandResponse leaveConference(String id, LeaveConferenceRequest leaveConferenceRequest) throws ApiException {
    return leaveConferenceWithHttpInfo(id, leaveConferenceRequest).getData();
  }

  /**
   * Leave a conference
   * Removes a call leg from a conference and moves it back to parked state. **Expected Webhooks:**  - &#x60;conference.participant.left&#x60; 
   * @param id Uniquely identifies the conference by id or name (required)
   * @param leaveConferenceRequest Leave Conference request object (required)
   * @return ApiResponse&lt;ConferenceCommandResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response upon making a conference command. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated response. Happens when the current user cannot be authenticated. </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ConferenceCommandResponse> leaveConferenceWithHttpInfo(String id, LeaveConferenceRequest leaveConferenceRequest) throws ApiException {
    Object localVarPostBody = leaveConferenceRequest;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling leaveConference");
    }
    
    // verify the required parameter 'leaveConferenceRequest' is set
    if (leaveConferenceRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'leaveConferenceRequest' when calling leaveConference");
    }
    
    // create path and map variables
    String localVarPath = "/conferences/{id}/actions/leave"
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

    GenericType<ConferenceCommandResponse> localVarReturnType = new GenericType<ConferenceCommandResponse>() {};

    return apiClient.invokeAPI("ConferenceCommandsApi.leaveConference", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * List conference participants
   * Lists conference participants
   * @param conferenceId Uniquely identifies the conference by id (required)
   * @param filterMuted If present, participants will be filtered to those who are/are not muted (optional)
   * @param filterOnHold If present, participants will be filtered to those who are/are not put on hold (optional)
   * @param filterWhispering If present, participants will be filtered to those who are whispering or are not (optional)
   * @param pageNumber The page number to load (optional, default to 1)
   * @param pageSize The size of the page (optional, default to 20)
   * @return ListParticipantsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response with a list of conference participants. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated response. Happens when the current user cannot be authenticated. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity </td><td>  -  </td></tr>
     </table>
   */
  public ListParticipantsResponse listConferenceParticipants(String conferenceId, Boolean filterMuted, Boolean filterOnHold, Boolean filterWhispering, Integer pageNumber, Integer pageSize) throws ApiException {
    return listConferenceParticipantsWithHttpInfo(conferenceId, filterMuted, filterOnHold, filterWhispering, pageNumber, pageSize).getData();
  }

  /**
   * List conference participants
   * Lists conference participants
   * @param conferenceId Uniquely identifies the conference by id (required)
   * @param filterMuted If present, participants will be filtered to those who are/are not muted (optional)
   * @param filterOnHold If present, participants will be filtered to those who are/are not put on hold (optional)
   * @param filterWhispering If present, participants will be filtered to those who are whispering or are not (optional)
   * @param pageNumber The page number to load (optional, default to 1)
   * @param pageSize The size of the page (optional, default to 20)
   * @return ApiResponse&lt;ListParticipantsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response with a list of conference participants. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated response. Happens when the current user cannot be authenticated. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ListParticipantsResponse> listConferenceParticipantsWithHttpInfo(String conferenceId, Boolean filterMuted, Boolean filterOnHold, Boolean filterWhispering, Integer pageNumber, Integer pageSize) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'conferenceId' is set
    if (conferenceId == null) {
      throw new ApiException(400, "Missing the required parameter 'conferenceId' when calling listConferenceParticipants");
    }
    
    // create path and map variables
    String localVarPath = "/conferences/{conference_id}/participants"
      .replaceAll("\\{" + "conference_id" + "\\}", apiClient.escapeString(conferenceId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[muted]", filterMuted));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[on_hold]", filterOnHold));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[whispering]", filterWhispering));
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

    GenericType<ListParticipantsResponse> localVarReturnType = new GenericType<ListParticipantsResponse>() {};

    return apiClient.invokeAPI("ConferenceCommandsApi.listConferenceParticipants", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

private ApiResponse<ListConferencesResponse> listConferencesWithHttpInfo(String filterName, String filterStatus, Integer pageNumber, Integer pageSize) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/conferences";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[name]", filterName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[status]", filterStatus));
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

    GenericType<ListConferencesResponse> localVarReturnType = new GenericType<ListConferencesResponse>() {};

    return apiClient.invokeAPI("ConferenceCommandsApi.listConferences", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIlistConferencesRequest {
    private String filterName;
    private String filterStatus;
    private Integer pageNumber;
    private Integer pageSize;

    private APIlistConferencesRequest() {
    }

    /**
     * Set filterName
     * @param filterName If present, conferences will be filtered to those with a matching &#x60;name&#x60; attribute. Matching is case-sensitive (optional)
     * @return APIlistConferencesRequest
     */
    public APIlistConferencesRequest filterName(String filterName) {
      this.filterName = filterName;
      return this;
    }

    /**
     * Set filterStatus
     * @param filterStatus If present, conferences will be filtered by status. (optional)
     * @return APIlistConferencesRequest
     */
    public APIlistConferencesRequest filterStatus(String filterStatus) {
      this.filterStatus = filterStatus;
      return this;
    }

    /**
     * Set pageNumber
     * @param pageNumber The page number to load (optional, default to 1)
     * @return APIlistConferencesRequest
     */
    public APIlistConferencesRequest pageNumber(Integer pageNumber) {
      this.pageNumber = pageNumber;
      return this;
    }

    /**
     * Set pageSize
     * @param pageSize The size of the page (optional, default to 20)
     * @return APIlistConferencesRequest
     */
    public APIlistConferencesRequest pageSize(Integer pageSize) {
      this.pageSize = pageSize;
      return this;
    }

    /**
     * Execute listConferences request
     * @return ListConferencesResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response with a list of conferences. </td><td>  -  </td></tr>
         <tr><td> 401 </td><td> Unauthenticated response. Happens when the current user cannot be authenticated. </td><td>  -  </td></tr>
         <tr><td> 422 </td><td> Unprocessable entity </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ListConferencesResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute listConferences request with HTTP info returned
     * @return ApiResponse&lt;ListConferencesResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response with a list of conferences. </td><td>  -  </td></tr>
         <tr><td> 401 </td><td> Unauthenticated response. Happens when the current user cannot be authenticated. </td><td>  -  </td></tr>
         <tr><td> 422 </td><td> Unprocessable entity </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<ListConferencesResponse> executeWithHttpInfo() throws ApiException {
      return listConferencesWithHttpInfo(filterName, filterStatus, pageNumber, pageSize);
    }
  }

  /**
   * List conferences
   * Lists conferences. Conferences are created on demand, and will expire after all participants have left the conference or after 4 hours regardless of the number of active participants. Conferences are listed in descending order by &#x60;expires_at&#x60;.
   * @return listConferencesRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIlistConferencesRequest listConferences() throws ApiException {
    return new APIlistConferencesRequest();
  }
  /**
   * Mute conference participants
   * Mute a list of participants in a conference call
   * @param id Uniquely identifies the conference by id or name (required)
   * @param conferenceMuteRequest  (required)
   * @return ConferenceCommandResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response upon making a conference command. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated response. Happens when the current user cannot be authenticated. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity </td><td>  -  </td></tr>
     </table>
   */
  public ConferenceCommandResponse muteConferenceParticipants(String id, ConferenceMuteRequest conferenceMuteRequest) throws ApiException {
    return muteConferenceParticipantsWithHttpInfo(id, conferenceMuteRequest).getData();
  }

  /**
   * Mute conference participants
   * Mute a list of participants in a conference call
   * @param id Uniquely identifies the conference by id or name (required)
   * @param conferenceMuteRequest  (required)
   * @return ApiResponse&lt;ConferenceCommandResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response upon making a conference command. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated response. Happens when the current user cannot be authenticated. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ConferenceCommandResponse> muteConferenceParticipantsWithHttpInfo(String id, ConferenceMuteRequest conferenceMuteRequest) throws ApiException {
    Object localVarPostBody = conferenceMuteRequest;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling muteConferenceParticipants");
    }
    
    // verify the required parameter 'conferenceMuteRequest' is set
    if (conferenceMuteRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'conferenceMuteRequest' when calling muteConferenceParticipants");
    }
    
    // create path and map variables
    String localVarPath = "/conferences/{id}/actions/mute"
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

    GenericType<ConferenceCommandResponse> localVarReturnType = new GenericType<ConferenceCommandResponse>() {};

    return apiClient.invokeAPI("ConferenceCommandsApi.muteConferenceParticipants", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Conference recording pause
   * Pause conference recording.
   * @param id Specifies the conference by id or name (required)
   * @param pauseConferenceRecordingRequest  (required)
   * @return ConferenceCommandResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response upon making a conference command. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated response. Happens when the current user cannot be authenticated. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity </td><td>  -  </td></tr>
     </table>
   */
  public ConferenceCommandResponse pauseConferenceRecording(String id, PauseConferenceRecordingRequest pauseConferenceRecordingRequest) throws ApiException {
    return pauseConferenceRecordingWithHttpInfo(id, pauseConferenceRecordingRequest).getData();
  }

  /**
   * Conference recording pause
   * Pause conference recording.
   * @param id Specifies the conference by id or name (required)
   * @param pauseConferenceRecordingRequest  (required)
   * @return ApiResponse&lt;ConferenceCommandResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response upon making a conference command. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated response. Happens when the current user cannot be authenticated. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ConferenceCommandResponse> pauseConferenceRecordingWithHttpInfo(String id, PauseConferenceRecordingRequest pauseConferenceRecordingRequest) throws ApiException {
    Object localVarPostBody = pauseConferenceRecordingRequest;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling pauseConferenceRecording");
    }
    
    // verify the required parameter 'pauseConferenceRecordingRequest' is set
    if (pauseConferenceRecordingRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'pauseConferenceRecordingRequest' when calling pauseConferenceRecording");
    }
    
    // create path and map variables
    String localVarPath = "/conferences/{id}/actions/record_pause"
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

    GenericType<ConferenceCommandResponse> localVarReturnType = new GenericType<ConferenceCommandResponse>() {};

    return apiClient.invokeAPI("ConferenceCommandsApi.pauseConferenceRecording", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Play audio to conference participants
   * Play audio to all or some participants on a conference call.
   * @param id Uniquely identifies the conference by id or name (required)
   * @param conferencePlayRequest  (required)
   * @return ConferenceCommandResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response upon making a conference command. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated response. Happens when the current user cannot be authenticated. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity </td><td>  -  </td></tr>
     </table>
   */
  public ConferenceCommandResponse playConferenceAudio(String id, ConferencePlayRequest conferencePlayRequest) throws ApiException {
    return playConferenceAudioWithHttpInfo(id, conferencePlayRequest).getData();
  }

  /**
   * Play audio to conference participants
   * Play audio to all or some participants on a conference call.
   * @param id Uniquely identifies the conference by id or name (required)
   * @param conferencePlayRequest  (required)
   * @return ApiResponse&lt;ConferenceCommandResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response upon making a conference command. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated response. Happens when the current user cannot be authenticated. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ConferenceCommandResponse> playConferenceAudioWithHttpInfo(String id, ConferencePlayRequest conferencePlayRequest) throws ApiException {
    Object localVarPostBody = conferencePlayRequest;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling playConferenceAudio");
    }
    
    // verify the required parameter 'conferencePlayRequest' is set
    if (conferencePlayRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'conferencePlayRequest' when calling playConferenceAudio");
    }
    
    // create path and map variables
    String localVarPath = "/conferences/{id}/actions/play"
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

    GenericType<ConferenceCommandResponse> localVarReturnType = new GenericType<ConferenceCommandResponse>() {};

    return apiClient.invokeAPI("ConferenceCommandsApi.playConferenceAudio", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Conference recording resume
   * Resume conference recording.
   * @param id Specifies the conference by id or name (required)
   * @param resumeConferenceRecordingRequest  (required)
   * @return ConferenceCommandResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response upon making a conference command. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated response. Happens when the current user cannot be authenticated. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity </td><td>  -  </td></tr>
     </table>
   */
  public ConferenceCommandResponse resumeConferenceRecording(String id, ResumeConferenceRecordingRequest resumeConferenceRecordingRequest) throws ApiException {
    return resumeConferenceRecordingWithHttpInfo(id, resumeConferenceRecordingRequest).getData();
  }

  /**
   * Conference recording resume
   * Resume conference recording.
   * @param id Specifies the conference by id or name (required)
   * @param resumeConferenceRecordingRequest  (required)
   * @return ApiResponse&lt;ConferenceCommandResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response upon making a conference command. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated response. Happens when the current user cannot be authenticated. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ConferenceCommandResponse> resumeConferenceRecordingWithHttpInfo(String id, ResumeConferenceRecordingRequest resumeConferenceRecordingRequest) throws ApiException {
    Object localVarPostBody = resumeConferenceRecordingRequest;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling resumeConferenceRecording");
    }
    
    // verify the required parameter 'resumeConferenceRecordingRequest' is set
    if (resumeConferenceRecordingRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'resumeConferenceRecordingRequest' when calling resumeConferenceRecording");
    }
    
    // create path and map variables
    String localVarPath = "/conferences/{id}/actions/record_resume"
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

    GenericType<ConferenceCommandResponse> localVarReturnType = new GenericType<ConferenceCommandResponse>() {};

    return apiClient.invokeAPI("ConferenceCommandsApi.resumeConferenceRecording", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Retrieve a conference
   * Retrieve an existing conference
   * @param id Uniquely identifies the conference by id (required)
   * @return ConferenceResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response with details about a conference. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
     </table>
   */
  public ConferenceResponse retrieveConference(String id) throws ApiException {
    return retrieveConferenceWithHttpInfo(id).getData();
  }

  /**
   * Retrieve a conference
   * Retrieve an existing conference
   * @param id Uniquely identifies the conference by id (required)
   * @return ApiResponse&lt;ConferenceResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response with details about a conference. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ConferenceResponse> retrieveConferenceWithHttpInfo(String id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling retrieveConference");
    }
    
    // create path and map variables
    String localVarPath = "/conferences/{id}"
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

    GenericType<ConferenceResponse> localVarReturnType = new GenericType<ConferenceResponse>() {};

    return apiClient.invokeAPI("ConferenceCommandsApi.retrieveConference", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Speak text to conference participants
   * Convert text to speech and play it to all or some participants.
   * @param id Specifies the conference by id or name (required)
   * @param conferenceSpeakRequest  (required)
   * @return ConferenceCommandResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response upon making a conference command. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated response. Happens when the current user cannot be authenticated. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity </td><td>  -  </td></tr>
     </table>
   */
  public ConferenceCommandResponse speakTextToConference(String id, ConferenceSpeakRequest conferenceSpeakRequest) throws ApiException {
    return speakTextToConferenceWithHttpInfo(id, conferenceSpeakRequest).getData();
  }

  /**
   * Speak text to conference participants
   * Convert text to speech and play it to all or some participants.
   * @param id Specifies the conference by id or name (required)
   * @param conferenceSpeakRequest  (required)
   * @return ApiResponse&lt;ConferenceCommandResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response upon making a conference command. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated response. Happens when the current user cannot be authenticated. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ConferenceCommandResponse> speakTextToConferenceWithHttpInfo(String id, ConferenceSpeakRequest conferenceSpeakRequest) throws ApiException {
    Object localVarPostBody = conferenceSpeakRequest;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling speakTextToConference");
    }
    
    // verify the required parameter 'conferenceSpeakRequest' is set
    if (conferenceSpeakRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'conferenceSpeakRequest' when calling speakTextToConference");
    }
    
    // create path and map variables
    String localVarPath = "/conferences/{id}/actions/speak"
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

    GenericType<ConferenceCommandResponse> localVarReturnType = new GenericType<ConferenceCommandResponse>() {};

    return apiClient.invokeAPI("ConferenceCommandsApi.speakTextToConference", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Conference recording start
   * Start recording the conference. Recording will stop on conference end, or via the Stop Recording command.  **Expected Webhooks:**  - &#x60;conference.recording.saved&#x60;
   * @param id Specifies the conference to record by id or name (required)
   * @param startConferenceRecordingRequest  (required)
   * @return ConferenceCommandResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response upon making a conference command. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated response. Happens when the current user cannot be authenticated. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity </td><td>  -  </td></tr>
     </table>
   */
  public ConferenceCommandResponse startConferenceRecording(String id, StartConferenceRecordingRequest startConferenceRecordingRequest) throws ApiException {
    return startConferenceRecordingWithHttpInfo(id, startConferenceRecordingRequest).getData();
  }

  /**
   * Conference recording start
   * Start recording the conference. Recording will stop on conference end, or via the Stop Recording command.  **Expected Webhooks:**  - &#x60;conference.recording.saved&#x60;
   * @param id Specifies the conference to record by id or name (required)
   * @param startConferenceRecordingRequest  (required)
   * @return ApiResponse&lt;ConferenceCommandResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response upon making a conference command. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated response. Happens when the current user cannot be authenticated. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ConferenceCommandResponse> startConferenceRecordingWithHttpInfo(String id, StartConferenceRecordingRequest startConferenceRecordingRequest) throws ApiException {
    Object localVarPostBody = startConferenceRecordingRequest;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling startConferenceRecording");
    }
    
    // verify the required parameter 'startConferenceRecordingRequest' is set
    if (startConferenceRecordingRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'startConferenceRecordingRequest' when calling startConferenceRecording");
    }
    
    // create path and map variables
    String localVarPath = "/conferences/{id}/actions/record_start"
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

    GenericType<ConferenceCommandResponse> localVarReturnType = new GenericType<ConferenceCommandResponse>() {};

    return apiClient.invokeAPI("ConferenceCommandsApi.startConferenceRecording", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Stop audio being played on the conference
   * Stop audio being played to all or some participants on a conference call.
   * @param id Uniquely identifies the conference by id or name (required)
   * @param conferenceStopRequest  (required)
   * @return ConferenceCommandResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response upon making a conference command. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated response. Happens when the current user cannot be authenticated. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity </td><td>  -  </td></tr>
     </table>
   */
  public ConferenceCommandResponse stopConferenceAudio(String id, ConferenceStopRequest conferenceStopRequest) throws ApiException {
    return stopConferenceAudioWithHttpInfo(id, conferenceStopRequest).getData();
  }

  /**
   * Stop audio being played on the conference
   * Stop audio being played to all or some participants on a conference call.
   * @param id Uniquely identifies the conference by id or name (required)
   * @param conferenceStopRequest  (required)
   * @return ApiResponse&lt;ConferenceCommandResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response upon making a conference command. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated response. Happens when the current user cannot be authenticated. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ConferenceCommandResponse> stopConferenceAudioWithHttpInfo(String id, ConferenceStopRequest conferenceStopRequest) throws ApiException {
    Object localVarPostBody = conferenceStopRequest;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling stopConferenceAudio");
    }
    
    // verify the required parameter 'conferenceStopRequest' is set
    if (conferenceStopRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'conferenceStopRequest' when calling stopConferenceAudio");
    }
    
    // create path and map variables
    String localVarPath = "/conferences/{id}/actions/stop"
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

    GenericType<ConferenceCommandResponse> localVarReturnType = new GenericType<ConferenceCommandResponse>() {};

    return apiClient.invokeAPI("ConferenceCommandsApi.stopConferenceAudio", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Conference recording stop
   * Stop recording the conference.  **Expected Webhooks:**  - &#x60;conference.recording.saved&#x60; 
   * @param id Specifies the conference to stop the recording for by id or name (required)
   * @param stopRecordingRequest Stop recording conference request (required)
   * @return ConferenceCommandResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response upon making a conference command. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated response. Happens when the current user cannot be authenticated. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity </td><td>  -  </td></tr>
     </table>
   */
  public ConferenceCommandResponse stopConferenceRecording(String id, StopRecordingRequest stopRecordingRequest) throws ApiException {
    return stopConferenceRecordingWithHttpInfo(id, stopRecordingRequest).getData();
  }

  /**
   * Conference recording stop
   * Stop recording the conference.  **Expected Webhooks:**  - &#x60;conference.recording.saved&#x60; 
   * @param id Specifies the conference to stop the recording for by id or name (required)
   * @param stopRecordingRequest Stop recording conference request (required)
   * @return ApiResponse&lt;ConferenceCommandResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response upon making a conference command. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated response. Happens when the current user cannot be authenticated. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ConferenceCommandResponse> stopConferenceRecordingWithHttpInfo(String id, StopRecordingRequest stopRecordingRequest) throws ApiException {
    Object localVarPostBody = stopRecordingRequest;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling stopConferenceRecording");
    }
    
    // verify the required parameter 'stopRecordingRequest' is set
    if (stopRecordingRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'stopRecordingRequest' when calling stopConferenceRecording");
    }
    
    // create path and map variables
    String localVarPath = "/conferences/{id}/actions/record_stop"
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

    GenericType<ConferenceCommandResponse> localVarReturnType = new GenericType<ConferenceCommandResponse>() {};

    return apiClient.invokeAPI("ConferenceCommandsApi.stopConferenceRecording", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Unhold conference participants
   * Unhold a list of participants in a conference call
   * @param id Uniquely identifies the conference by id or name (required)
   * @param conferenceUnholdRequest  (required)
   * @return ConferenceCommandResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response upon making a conference command. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated response. Happens when the current user cannot be authenticated. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity </td><td>  -  </td></tr>
     </table>
   */
  public ConferenceCommandResponse unholdConferenceParticipants(String id, ConferenceUnholdRequest conferenceUnholdRequest) throws ApiException {
    return unholdConferenceParticipantsWithHttpInfo(id, conferenceUnholdRequest).getData();
  }

  /**
   * Unhold conference participants
   * Unhold a list of participants in a conference call
   * @param id Uniquely identifies the conference by id or name (required)
   * @param conferenceUnholdRequest  (required)
   * @return ApiResponse&lt;ConferenceCommandResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response upon making a conference command. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated response. Happens when the current user cannot be authenticated. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ConferenceCommandResponse> unholdConferenceParticipantsWithHttpInfo(String id, ConferenceUnholdRequest conferenceUnholdRequest) throws ApiException {
    Object localVarPostBody = conferenceUnholdRequest;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling unholdConferenceParticipants");
    }
    
    // verify the required parameter 'conferenceUnholdRequest' is set
    if (conferenceUnholdRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'conferenceUnholdRequest' when calling unholdConferenceParticipants");
    }
    
    // create path and map variables
    String localVarPath = "/conferences/{id}/actions/unhold"
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

    GenericType<ConferenceCommandResponse> localVarReturnType = new GenericType<ConferenceCommandResponse>() {};

    return apiClient.invokeAPI("ConferenceCommandsApi.unholdConferenceParticipants", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Unmute conference participants
   * Unmute a list of participants in a conference call
   * @param id Uniquely identifies the conference by id or name (required)
   * @param conferenceUnmuteRequest  (required)
   * @return ConferenceCommandResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response upon making a conference command. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated response. Happens when the current user cannot be authenticated. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity </td><td>  -  </td></tr>
     </table>
   */
  public ConferenceCommandResponse unmuteConferenceParticipants(String id, ConferenceUnmuteRequest conferenceUnmuteRequest) throws ApiException {
    return unmuteConferenceParticipantsWithHttpInfo(id, conferenceUnmuteRequest).getData();
  }

  /**
   * Unmute conference participants
   * Unmute a list of participants in a conference call
   * @param id Uniquely identifies the conference by id or name (required)
   * @param conferenceUnmuteRequest  (required)
   * @return ApiResponse&lt;ConferenceCommandResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response upon making a conference command. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated response. Happens when the current user cannot be authenticated. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ConferenceCommandResponse> unmuteConferenceParticipantsWithHttpInfo(String id, ConferenceUnmuteRequest conferenceUnmuteRequest) throws ApiException {
    Object localVarPostBody = conferenceUnmuteRequest;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling unmuteConferenceParticipants");
    }
    
    // verify the required parameter 'conferenceUnmuteRequest' is set
    if (conferenceUnmuteRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'conferenceUnmuteRequest' when calling unmuteConferenceParticipants");
    }
    
    // create path and map variables
    String localVarPath = "/conferences/{id}/actions/unmute"
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

    GenericType<ConferenceCommandResponse> localVarReturnType = new GenericType<ConferenceCommandResponse>() {};

    return apiClient.invokeAPI("ConferenceCommandsApi.unmuteConferenceParticipants", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Update conference participant
   * Update conference participant supervisor_role
   * @param id Uniquely identifies the conference by id or name (required)
   * @param updateConferenceRequest Update Conference request object (required)
   * @return ConferenceCommandResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response upon making a conference command. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated response. Happens when the current user cannot be authenticated. </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity </td><td>  -  </td></tr>
     </table>
   */
  public ConferenceCommandResponse updateConference(String id, UpdateConferenceRequest updateConferenceRequest) throws ApiException {
    return updateConferenceWithHttpInfo(id, updateConferenceRequest).getData();
  }

  /**
   * Update conference participant
   * Update conference participant supervisor_role
   * @param id Uniquely identifies the conference by id or name (required)
   * @param updateConferenceRequest Update Conference request object (required)
   * @return ApiResponse&lt;ConferenceCommandResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response upon making a conference command. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated response. Happens when the current user cannot be authenticated. </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ConferenceCommandResponse> updateConferenceWithHttpInfo(String id, UpdateConferenceRequest updateConferenceRequest) throws ApiException {
    Object localVarPostBody = updateConferenceRequest;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling updateConference");
    }
    
    // verify the required parameter 'updateConferenceRequest' is set
    if (updateConferenceRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'updateConferenceRequest' when calling updateConference");
    }
    
    // create path and map variables
    String localVarPath = "/conferences/{id}/actions/update"
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

    GenericType<ConferenceCommandResponse> localVarReturnType = new GenericType<ConferenceCommandResponse>() {};

    return apiClient.invokeAPI("ConferenceCommandsApi.updateConference", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
