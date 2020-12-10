package com.telnyx.sdk.api;

import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.Pair;

import javax.ws.rs.core.GenericType;

import com.telnyx.sdk.model.ConferenceCallRequest;
import com.telnyx.sdk.model.ConferenceCommandResponse;
import com.telnyx.sdk.model.ConferenceHoldRequest;
import com.telnyx.sdk.model.ConferenceMuteRequest;
import com.telnyx.sdk.model.ConferencePlayRequest;
import com.telnyx.sdk.model.ConferenceResponse;
import com.telnyx.sdk.model.ConferenceSpeakRequest;
import com.telnyx.sdk.model.ConferenceUnholdRequest;
import com.telnyx.sdk.model.ConferenceUnmuteRequest;
import com.telnyx.sdk.model.CreateConferenceRequest;
import com.telnyx.sdk.model.JoinConferenceRequest;
import com.telnyx.sdk.model.ListConferencesResponse;
import com.telnyx.sdk.model.ListParticipantsResponse;
import com.telnyx.sdk.model.StartRecordingRequest;
import com.telnyx.sdk.model.StopRecordingRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ConferenceCommandsApi {
  private ApiClient apiClient;

  public ConferenceCommandsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ConferenceCommandsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Get the API cilent
   *
   * @return API client
   */
  public ApiClient getApiClient() {
    return apiClient;
  }

  /**
   * Set the API cilent
   *
   * @param apiClient an instance of API client
   */
  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Dial a new participant into a conference
   * Dials a phone number and, when the call is answered, automatically joins them into the specified conference.  **Expected Webhooks:**  - &#x60;call.hangup&#x60; - &#x60;call.answered&#x60; - &#x60;conference.participant.joined&#x60; - &#x60;conference.participant.left&#x60; 
   * @param id Uniquely identifies the conference by id or name (required)
   * @param conferenceCallRequest Dial Into Conference request object (required)
   * @return ConferenceCommandResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response upon making a conference command. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Conference does not exist </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity </td><td>  -  </td></tr>
     </table>
   */
  public ConferenceCommandResponse conferenceDialParticipantIn(String id, ConferenceCallRequest conferenceCallRequest) throws ApiException {
    return conferenceDialParticipantInWithHttpInfo(id, conferenceCallRequest).getData();
  }

  /**
   * Dial a new participant into a conference
   * Dials a phone number and, when the call is answered, automatically joins them into the specified conference.  **Expected Webhooks:**  - &#x60;call.hangup&#x60; - &#x60;call.answered&#x60; - &#x60;conference.participant.joined&#x60; - &#x60;conference.participant.left&#x60; 
   * @param id Uniquely identifies the conference by id or name (required)
   * @param conferenceCallRequest Dial Into Conference request object (required)
   * @return ApiResponse&lt;ConferenceCommandResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response upon making a conference command. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Conference does not exist </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ConferenceCommandResponse> conferenceDialParticipantInWithHttpInfo(String id, ConferenceCallRequest conferenceCallRequest) throws ApiException {
    Object localVarPostBody = conferenceCallRequest;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling conferenceDialParticipantIn");
    }
    
    // verify the required parameter 'conferenceCallRequest' is set
    if (conferenceCallRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'conferenceCallRequest' when calling conferenceDialParticipantIn");
    }
    
    // create path and map variables
    String localVarPath = "/conferences/{id}/actions/dial_participant"
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

    return apiClient.invokeAPI("ConferenceCommandsApi.conferenceDialParticipantIn", localVarPath, "POST", localVarQueryParams, localVarPostBody,
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
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Conference does not exist </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity </td><td>  -  </td></tr>
     </table>
   */
  public ConferenceCommandResponse conferenceHoldParticipants(String id, ConferenceHoldRequest conferenceHoldRequest) throws ApiException {
    return conferenceHoldParticipantsWithHttpInfo(id, conferenceHoldRequest).getData();
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
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Conference does not exist </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ConferenceCommandResponse> conferenceHoldParticipantsWithHttpInfo(String id, ConferenceHoldRequest conferenceHoldRequest) throws ApiException {
    Object localVarPostBody = conferenceHoldRequest;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling conferenceHoldParticipants");
    }
    
    // verify the required parameter 'conferenceHoldRequest' is set
    if (conferenceHoldRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'conferenceHoldRequest' when calling conferenceHoldParticipants");
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

    return apiClient.invokeAPI("ConferenceCommandsApi.conferenceHoldParticipants", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Join a conference
   * Join an existing call leg to a conference. Issue the Join Conference command with the conference ID in the path and the &#x60;call_control_id&#x60; of the leg you wish to join to the conference as an attribute.  **Expected Webhooks:**  - &#x60;conference.participant.joined&#x60; - &#x60;conference.participant.left&#x60; 
   * @param id Uniquely identifies the conference by id or name (required)
   * @param joinConferenceRequest Join Conference request object (required)
   * @return ConferenceCommandResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response upon making a conference command. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity </td><td>  -  </td></tr>
     </table>
   */
  public ConferenceCommandResponse conferenceJoin(String id, JoinConferenceRequest joinConferenceRequest) throws ApiException {
    return conferenceJoinWithHttpInfo(id, joinConferenceRequest).getData();
  }

  /**
   * Join a conference
   * Join an existing call leg to a conference. Issue the Join Conference command with the conference ID in the path and the &#x60;call_control_id&#x60; of the leg you wish to join to the conference as an attribute.  **Expected Webhooks:**  - &#x60;conference.participant.joined&#x60; - &#x60;conference.participant.left&#x60; 
   * @param id Uniquely identifies the conference by id or name (required)
   * @param joinConferenceRequest Join Conference request object (required)
   * @return ApiResponse&lt;ConferenceCommandResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response upon making a conference command. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ConferenceCommandResponse> conferenceJoinWithHttpInfo(String id, JoinConferenceRequest joinConferenceRequest) throws ApiException {
    Object localVarPostBody = joinConferenceRequest;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling conferenceJoin");
    }
    
    // verify the required parameter 'joinConferenceRequest' is set
    if (joinConferenceRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'joinConferenceRequest' when calling conferenceJoin");
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

    return apiClient.invokeAPI("ConferenceCommandsApi.conferenceJoin", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
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
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Conference does not exist </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity </td><td>  -  </td></tr>
     </table>
   */
  public ConferenceCommandResponse conferenceMuteParticipants(String id, ConferenceMuteRequest conferenceMuteRequest) throws ApiException {
    return conferenceMuteParticipantsWithHttpInfo(id, conferenceMuteRequest).getData();
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
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Conference does not exist </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ConferenceCommandResponse> conferenceMuteParticipantsWithHttpInfo(String id, ConferenceMuteRequest conferenceMuteRequest) throws ApiException {
    Object localVarPostBody = conferenceMuteRequest;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling conferenceMuteParticipants");
    }
    
    // verify the required parameter 'conferenceMuteRequest' is set
    if (conferenceMuteRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'conferenceMuteRequest' when calling conferenceMuteParticipants");
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

    return apiClient.invokeAPI("ConferenceCommandsApi.conferenceMuteParticipants", localVarPath, "POST", localVarQueryParams, localVarPostBody,
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
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Conference does not exist </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity </td><td>  -  </td></tr>
     </table>
   */
  public ConferenceCommandResponse conferencePlayAudio(String id, ConferencePlayRequest conferencePlayRequest) throws ApiException {
    return conferencePlayAudioWithHttpInfo(id, conferencePlayRequest).getData();
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
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Conference does not exist </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ConferenceCommandResponse> conferencePlayAudioWithHttpInfo(String id, ConferencePlayRequest conferencePlayRequest) throws ApiException {
    Object localVarPostBody = conferencePlayRequest;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling conferencePlayAudio");
    }
    
    // verify the required parameter 'conferencePlayRequest' is set
    if (conferencePlayRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'conferencePlayRequest' when calling conferencePlayAudio");
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

    return apiClient.invokeAPI("ConferenceCommandsApi.conferencePlayAudio", localVarPath, "POST", localVarQueryParams, localVarPostBody,
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
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Conference does not exist </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity </td><td>  -  </td></tr>
     </table>
   */
  public ConferenceCommandResponse conferenceSpeakText(String id, ConferenceSpeakRequest conferenceSpeakRequest) throws ApiException {
    return conferenceSpeakTextWithHttpInfo(id, conferenceSpeakRequest).getData();
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
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Conference does not exist </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ConferenceCommandResponse> conferenceSpeakTextWithHttpInfo(String id, ConferenceSpeakRequest conferenceSpeakRequest) throws ApiException {
    Object localVarPostBody = conferenceSpeakRequest;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling conferenceSpeakText");
    }
    
    // verify the required parameter 'conferenceSpeakRequest' is set
    if (conferenceSpeakRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'conferenceSpeakRequest' when calling conferenceSpeakText");
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

    return apiClient.invokeAPI("ConferenceCommandsApi.conferenceSpeakText", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Conference recording start
   * Start recording the conference. Recording will stop on conference end, or via the Stop Recording command.  **Expected Webhooks:**  - &#x60;conference.recording.saved&#x60;
   * @param id Specifies the conference to record by id or name (required)
   * @param startRecordingRequest  (required)
   * @return ConferenceCommandResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response upon making a conference command. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Conference does not exist </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity </td><td>  -  </td></tr>
     </table>
   */
  public ConferenceCommandResponse conferenceStartRecording(String id, StartRecordingRequest startRecordingRequest) throws ApiException {
    return conferenceStartRecordingWithHttpInfo(id, startRecordingRequest).getData();
  }

  /**
   * Conference recording start
   * Start recording the conference. Recording will stop on conference end, or via the Stop Recording command.  **Expected Webhooks:**  - &#x60;conference.recording.saved&#x60;
   * @param id Specifies the conference to record by id or name (required)
   * @param startRecordingRequest  (required)
   * @return ApiResponse&lt;ConferenceCommandResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response upon making a conference command. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Conference does not exist </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ConferenceCommandResponse> conferenceStartRecordingWithHttpInfo(String id, StartRecordingRequest startRecordingRequest) throws ApiException {
    Object localVarPostBody = startRecordingRequest;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling conferenceStartRecording");
    }
    
    // verify the required parameter 'startRecordingRequest' is set
    if (startRecordingRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'startRecordingRequest' when calling conferenceStartRecording");
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

    return apiClient.invokeAPI("ConferenceCommandsApi.conferenceStartRecording", localVarPath, "POST", localVarQueryParams, localVarPostBody,
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
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Conference does not exist </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity </td><td>  -  </td></tr>
     </table>
   */
  public ConferenceCommandResponse conferenceStopRecording(String id, StopRecordingRequest stopRecordingRequest) throws ApiException {
    return conferenceStopRecordingWithHttpInfo(id, stopRecordingRequest).getData();
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
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Conference does not exist </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ConferenceCommandResponse> conferenceStopRecordingWithHttpInfo(String id, StopRecordingRequest stopRecordingRequest) throws ApiException {
    Object localVarPostBody = stopRecordingRequest;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling conferenceStopRecording");
    }
    
    // verify the required parameter 'stopRecordingRequest' is set
    if (stopRecordingRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'stopRecordingRequest' when calling conferenceStopRecording");
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

    return apiClient.invokeAPI("ConferenceCommandsApi.conferenceStopRecording", localVarPath, "POST", localVarQueryParams, localVarPostBody,
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
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Conference does not exist </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity </td><td>  -  </td></tr>
     </table>
   */
  public ConferenceCommandResponse conferenceUnholdParticipants(String id, ConferenceUnholdRequest conferenceUnholdRequest) throws ApiException {
    return conferenceUnholdParticipantsWithHttpInfo(id, conferenceUnholdRequest).getData();
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
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Conference does not exist </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ConferenceCommandResponse> conferenceUnholdParticipantsWithHttpInfo(String id, ConferenceUnholdRequest conferenceUnholdRequest) throws ApiException {
    Object localVarPostBody = conferenceUnholdRequest;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling conferenceUnholdParticipants");
    }
    
    // verify the required parameter 'conferenceUnholdRequest' is set
    if (conferenceUnholdRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'conferenceUnholdRequest' when calling conferenceUnholdParticipants");
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

    return apiClient.invokeAPI("ConferenceCommandsApi.conferenceUnholdParticipants", localVarPath, "POST", localVarQueryParams, localVarPostBody,
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
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Conference does not exist </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity </td><td>  -  </td></tr>
     </table>
   */
  public ConferenceCommandResponse conferenceUnmuteParticipants(String id, ConferenceUnmuteRequest conferenceUnmuteRequest) throws ApiException {
    return conferenceUnmuteParticipantsWithHttpInfo(id, conferenceUnmuteRequest).getData();
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
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Conference does not exist </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ConferenceCommandResponse> conferenceUnmuteParticipantsWithHttpInfo(String id, ConferenceUnmuteRequest conferenceUnmuteRequest) throws ApiException {
    Object localVarPostBody = conferenceUnmuteRequest;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling conferenceUnmuteParticipants");
    }
    
    // verify the required parameter 'conferenceUnmuteRequest' is set
    if (conferenceUnmuteRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'conferenceUnmuteRequest' when calling conferenceUnmuteParticipants");
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

    return apiClient.invokeAPI("ConferenceCommandsApi.conferenceUnmuteParticipants", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Create conference
   * Create a conference from an existing call leg using a &#x60;call_control_id&#x60; and a conference name. Upon creating the conference, the call will be automatically bridged to the conference. Conferences will expire after all participants have left the conference or after 4 hours regardless of the number of active participants.  **Expected Webhooks:**  - &#x60;conference.created&#x60; - &#x60;conference.participant.joined&#x60; - &#x60;conference.participant.left&#x60; - &#x60;conference.ended&#x60; - &#x60;conference.recording.saved&#x60; 
   * @param createConferenceRequest Create a conference (required)
   * @return ConferenceResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response with details about a conference. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity </td><td>  -  </td></tr>
     </table>
   */
  public ConferenceResponse createConference(CreateConferenceRequest createConferenceRequest) throws ApiException {
    return createConferenceWithHttpInfo(createConferenceRequest).getData();
  }

  /**
   * Create conference
   * Create a conference from an existing call leg using a &#x60;call_control_id&#x60; and a conference name. Upon creating the conference, the call will be automatically bridged to the conference. Conferences will expire after all participants have left the conference or after 4 hours regardless of the number of active participants.  **Expected Webhooks:**  - &#x60;conference.created&#x60; - &#x60;conference.participant.joined&#x60; - &#x60;conference.participant.left&#x60; - &#x60;conference.ended&#x60; - &#x60;conference.recording.saved&#x60; 
   * @param createConferenceRequest Create a conference (required)
   * @return ApiResponse&lt;ConferenceResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response with details about a conference. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
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
   * List conference participants
   * Lists conference participants
   * @param conferenceId Uniquely identifies the conference by id or name (required)
   * @param filterMuted If present, participants will be filtered to those who are/are not muted (optional)
   * @param filterOnHold If present, participants will be filtered to those who are/are not put on hold (optional)
   * @param filterWhispering If present, participants will be filtered to those who are whispering or are not (optional)
   * @param pageNumber The page number to load. (optional, default to 1)
   * @param pageSize The size of the page. (optional, default to 20)
   * @return ListParticipantsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response with a list of conference participants. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Conference does not exist </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity </td><td>  -  </td></tr>
     </table>
   */
  public ListParticipantsResponse listConferenceParticipants(String conferenceId, Boolean filterMuted, Boolean filterOnHold, Boolean filterWhispering, Integer pageNumber, Integer pageSize) throws ApiException {
    return listConferenceParticipantsWithHttpInfo(conferenceId, filterMuted, filterOnHold, filterWhispering, pageNumber, pageSize).getData();
  }

  /**
   * List conference participants
   * Lists conference participants
   * @param conferenceId Uniquely identifies the conference by id or name (required)
   * @param filterMuted If present, participants will be filtered to those who are/are not muted (optional)
   * @param filterOnHold If present, participants will be filtered to those who are/are not put on hold (optional)
   * @param filterWhispering If present, participants will be filtered to those who are whispering or are not (optional)
   * @param pageNumber The page number to load. (optional, default to 1)
   * @param pageSize The size of the page. (optional, default to 20)
   * @return ApiResponse&lt;ListParticipantsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response with a list of conference participants. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Conference does not exist </td><td>  -  </td></tr>
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

private ApiResponse<ListConferencesResponse> listConferencesWithHttpInfo(String filterName, Integer pageNumber, Integer pageSize) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/conferences";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[name]", filterName));
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
     * Set pageNumber
     * @param pageNumber The page number to load. (optional, default to 1)
     * @return APIlistConferencesRequest
     */
    public APIlistConferencesRequest pageNumber(Integer pageNumber) {
      this.pageNumber = pageNumber;
      return this;
    }

    /**
     * Set pageSize
     * @param pageSize The size of the page. (optional, default to 20)
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
         <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
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
         <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         <tr><td> 422 </td><td> Unprocessable entity </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<ListConferencesResponse> executeWithHttpInfo() throws ApiException {
      return listConferencesWithHttpInfo(filterName, pageNumber, pageSize);
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
   * Retrieve a conference
   * Retrieve an existing conference
   * @param id Uniquely identifies the conference by id or name (required)
   * @return ConferenceResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response with details about a conference. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Conference does not exist </td><td>  -  </td></tr>
     </table>
   */
  public ConferenceResponse retrieveConference(String id) throws ApiException {
    return retrieveConferenceWithHttpInfo(id).getData();
  }

  /**
   * Retrieve a conference
   * Retrieve an existing conference
   * @param id Uniquely identifies the conference by id or name (required)
   * @return ApiResponse&lt;ConferenceResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response with details about a conference. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Conference does not exist </td><td>  -  </td></tr>
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
}
