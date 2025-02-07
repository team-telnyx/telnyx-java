package com.telnyx.sdk.api;

import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.Pair;

import jakarta.ws.rs.core.GenericType;

import com.telnyx.sdk.model.CallResource;
import com.telnyx.sdk.model.CallResourceIndex;
import com.telnyx.sdk.model.ConferenceRecordingResourceIndex;
import com.telnyx.sdk.model.ConferenceResource;
import com.telnyx.sdk.model.ConferenceResourceIndex;
import com.telnyx.sdk.model.CreateTeXMLSecretRequest;
import com.telnyx.sdk.model.InitiateCallRequest;
import com.telnyx.sdk.model.InitiateCallResult;
import com.telnyx.sdk.model.NewParticipantResource;
import com.telnyx.sdk.model.ParticipantResource;
import com.telnyx.sdk.model.ParticipantResourceIndex;
import com.telnyx.sdk.model.RecordingTrack;
import com.telnyx.sdk.model.StreamStatus;
import com.telnyx.sdk.model.StreamTrack;
import com.telnyx.sdk.model.TeXMLRESTCommandResponse;
import com.telnyx.sdk.model.TexmlBidirectionalStreamCodec;
import com.telnyx.sdk.model.TexmlBidirectionalStreamMode;
import com.telnyx.sdk.model.TexmlCreateCallRecordingResponseBody;
import com.telnyx.sdk.model.TexmlCreateCallStreamingResponseBody;
import com.telnyx.sdk.model.TexmlCreateSiprecSessionResponseBody;
import com.telnyx.sdk.model.TexmlGetCallRecordingResponseBody;
import com.telnyx.sdk.model.TexmlGetCallRecordingsResponseBody;
import com.telnyx.sdk.model.TexmlRecordingChannels;
import com.telnyx.sdk.model.TexmlStatusCallbackMethod;
import com.telnyx.sdk.model.TexmlUpdateCallStreamingResponseBody;
import com.telnyx.sdk.model.TexmlUpdateSiprecSessionResponseBody;
import java.net.URI;
import java.util.UUID;
import com.telnyx.sdk.model.UpdateCallRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0")
public class TeXmlRestCommandsApi {
  private ApiClient apiClient;

  public TeXmlRestCommandsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public TeXmlRestCommandsApi(ApiClient apiClient) {
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
   * Create a TeXML secret
   * Create a TeXML secret which can be later used as a Dynamic Parameter for TeXML when using Mustache Templates in your TeXML. In your TeXML you will be able to use your secret name, and this name will be replaced by the actual secret value when processing the TeXML on Telnyx side.  The secrets are not visible in any logs.
   * @param createTeXMLSecretRequest Create TeXML secret request object (required)
   * @return CreateTeXMLSecretRequest
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Successful response upon creating a TeXML secret. </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity </td><td>  -  </td></tr>
     </table>
   */
  public CreateTeXMLSecretRequest createTexmlSecret(CreateTeXMLSecretRequest createTeXMLSecretRequest) throws ApiException {
    return createTexmlSecretWithHttpInfo(createTeXMLSecretRequest).getData();
  }

  /**
   * Create a TeXML secret
   * Create a TeXML secret which can be later used as a Dynamic Parameter for TeXML when using Mustache Templates in your TeXML. In your TeXML you will be able to use your secret name, and this name will be replaced by the actual secret value when processing the TeXML on Telnyx side.  The secrets are not visible in any logs.
   * @param createTeXMLSecretRequest Create TeXML secret request object (required)
   * @return ApiResponse&lt;CreateTeXMLSecretRequest&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Successful response upon creating a TeXML secret. </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CreateTeXMLSecretRequest> createTexmlSecretWithHttpInfo(CreateTeXMLSecretRequest createTeXMLSecretRequest) throws ApiException {
    Object localVarPostBody = createTeXMLSecretRequest;
    
    // verify the required parameter 'createTeXMLSecretRequest' is set
    if (createTeXMLSecretRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'createTeXMLSecretRequest' when calling createTexmlSecret");
    }
    
    // create path and map variables
    String localVarPath = "/texml/secrets";

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

    GenericType<CreateTeXMLSecretRequest> localVarReturnType = new GenericType<CreateTeXMLSecretRequest>() {};

    return apiClient.invokeAPI("TeXmlRestCommandsApi.createTexmlSecret", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

private ApiResponse<Void> deleteTeXMLCallRecordingWithHttpInfo(String accountSid, UUID recordingSid) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'accountSid' is set
    if (accountSid == null) {
      throw new ApiException(400, "Missing the required parameter 'accountSid' when calling deleteTeXMLCallRecording");
    }
    
    // verify the required parameter 'recordingSid' is set
    if (recordingSid == null) {
      throw new ApiException(400, "Missing the required parameter 'recordingSid' when calling deleteTeXMLCallRecording");
    }
    
    // create path and map variables
    String localVarPath = "/texml/Accounts/{account_sid}/Recordings/{recording_sid}.json"
      .replaceAll("\\{" + "account_sid" + "\\}", apiClient.escapeString(accountSid.toString()))
      .replaceAll("\\{" + "recording_sid" + "\\}", apiClient.escapeString(recordingSid.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    return apiClient.invokeAPI("TeXmlRestCommandsApi.deleteTeXMLCallRecording", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }

  public class APIdeleteTeXMLCallRecordingRequest {
    private String accountSid;
    private UUID recordingSid;

    private APIdeleteTeXMLCallRecordingRequest(String accountSid, UUID recordingSid) {
      this.accountSid = accountSid;
      this.recordingSid = recordingSid;
    }

    /**
     * Execute deleteTeXMLCallRecording request
     
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 204 </td><td> The resource was deleted successfully. </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> Fax does not exist </td><td>  -  </td></tr>
       </table>
     
     */
    
    public void execute() throws ApiException {
      this.executeWithHttpInfo().getData();
    }

    /**
     * Execute deleteTeXMLCallRecording request with HTTP info returned
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 204 </td><td> The resource was deleted successfully. </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> Fax does not exist </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<Void> executeWithHttpInfo() throws ApiException {
      return deleteTeXMLCallRecordingWithHttpInfo(accountSid, recordingSid);
    }
  }

  /**
   * Delete recording resource
   * Deletes recording resource identified by recording id.
   * @param accountSid The id of the account the resource belongs to. (required)
   * @param recordingSid Uniquely identifies the recording by id. (required)
   * @return deleteTeXMLCallRecordingRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIdeleteTeXMLCallRecordingRequest deleteTeXMLCallRecording(String accountSid, UUID recordingSid) throws ApiException {
    return new APIdeleteTeXMLCallRecordingRequest(accountSid, recordingSid);
  }
  /**
   * Delete a conference participant
   * Deletes a conference participant
   * @param accountSid The id of the account the resource belongs to. (required)
   * @param conferenceSid The ConferenceSid that uniquely identifies a conference. (required)
   * @param callSid The CallSid that identifies the call to update. (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> The resource was deleted successfully. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Fax does not exist </td><td>  -  </td></tr>
     </table>
   */
  public void deleteTexmlConferenceParticipant(String accountSid, String conferenceSid, String callSid) throws ApiException {
    deleteTexmlConferenceParticipantWithHttpInfo(accountSid, conferenceSid, callSid);
  }

  /**
   * Delete a conference participant
   * Deletes a conference participant
   * @param accountSid The id of the account the resource belongs to. (required)
   * @param conferenceSid The ConferenceSid that uniquely identifies a conference. (required)
   * @param callSid The CallSid that identifies the call to update. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> The resource was deleted successfully. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Fax does not exist </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> deleteTexmlConferenceParticipantWithHttpInfo(String accountSid, String conferenceSid, String callSid) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'accountSid' is set
    if (accountSid == null) {
      throw new ApiException(400, "Missing the required parameter 'accountSid' when calling deleteTexmlConferenceParticipant");
    }
    
    // verify the required parameter 'conferenceSid' is set
    if (conferenceSid == null) {
      throw new ApiException(400, "Missing the required parameter 'conferenceSid' when calling deleteTexmlConferenceParticipant");
    }
    
    // verify the required parameter 'callSid' is set
    if (callSid == null) {
      throw new ApiException(400, "Missing the required parameter 'callSid' when calling deleteTexmlConferenceParticipant");
    }
    
    // create path and map variables
    String localVarPath = "/texml/Accounts/{account_sid}/Conferences/{conference_sid}/Participants/{call_sid}"
      .replaceAll("\\{" + "account_sid" + "\\}", apiClient.escapeString(accountSid.toString()))
      .replaceAll("\\{" + "conference_sid" + "\\}", apiClient.escapeString(conferenceSid.toString()))
      .replaceAll("\\{" + "call_sid" + "\\}", apiClient.escapeString(callSid.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    return apiClient.invokeAPI("TeXmlRestCommandsApi.deleteTexmlConferenceParticipant", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * Dial a new conference participant
   * Dials a new conference participant
   * @param accountSid The id of the account the resource belongs to. (required)
   * @param conferenceSid The ConferenceSid that uniquely identifies a conference. (required)
   * @param beep Whether to play a notification beep to the conference when the participant enters and exits. (optional)
   * @param statusCallback URL destination for Telnyx to send status callback events to for the call. (optional)
   * @param statusCallbackMethod HTTP request type used for &#x60;StatusCallback&#x60;. (optional)
   * @param statusCallbackEvent The changes to the call&#39;s state that should generate a call to &#x60;StatusCallback&#x60;. Can be: &#x60;initiated&#x60;, &#x60;ringing&#x60;, &#x60;answered&#x60;, and &#x60;completed&#x60;. Separate multiple values with a space. The default value is &#x60;completed&#x60;. (optional)
   * @param to The phone number of the called party. Phone numbers are formatted with a &#x60;+&#x60; and country code. (optional)
   * @param from The phone number of the party that initiated the call. Phone numbers are formatted with a &#x60;+&#x60; and country code. (optional)
   * @param timeout The number of seconds that we should allow the phone to ring before assuming there is no answer. Can be an integer between 5 and 120, inclusive. The default value is 30. (optional)
   * @param muted Whether the participant should be muted. (optional)
   * @param startConferenceOnEnter Whether to start the conference when the participant enters. Defaults to &#x60;true&#x60;. (optional)
   * @param endConferenceOnExit Whether to end the conference when the participant leaves. Defaults to &#x60;false&#x60;. (optional)
   * @param earlyMedia Whether participant shall be bridged to conference before the participant answers (from early media if available). Defaults to &#x60;false&#x60;. (optional, default to false)
   * @param conferenceStatusCallback The URL the conference callbacks will be sent to. (optional)
   * @param conferenceStatusCallbackMethod HTTP request type used for &#x60;ConferenceStatusCallback&#x60;. Defaults to &#x60;POST&#x60;. (optional)
   * @param conferenceStatusCallbackEvent The changes to the conference&#39;s state that should generate a call to &#x60;ConferenceStatusCallback&#x60;. Can be: &#x60;start&#x60;, &#x60;end&#x60;, &#x60;join&#x60; and &#x60;leave&#x60;. Separate multiple values with a space. By default no callbacks are sent. (optional)
   * @param waitUrl The URL to call for an audio file to play while the participant is waiting for the conference to start. (optional)
   * @param maxParticipants The maximum number of participants in the conference. Can be a positive integer from 2 to 800. The default value is 250. (optional)
   * @param coaching Whether the participant is coaching another call. When &#x60;true&#x60;, &#x60;CallSidToCoach&#x60; has to be given. (optional)
   * @param callSidToCoach The SID of the participant who is being coached. The participant being coached is the only participant who can hear the participant who is coaching. (optional)
   * @param callerId To be used as the caller id name (SIP From Display Name) presented to the destination (&#x60;To&#x60; number). The string should have a maximum of 128 characters, containing only letters, numbers, spaces, and &#x60;-_~!.+&#x60; special characters. If ommited, the display name will be the same as the number in the &#x60;From&#x60; field. (optional)
   * @param timeLimit The maximum duration of the call in seconds. (optional)
   * @param machineDetection Whether to detect if a human or an answering machine picked up the call. Use &#x60;Enable&#x60; if you would like to ne notified as soon as the called party is identified. Use &#x60;DetectMessageEnd&#x60;, if you would like to leave a message on an answering machine. (optional)
   * @param machineDetectionTimeout How long answering machine detection should go on for before sending an &#x60;Unknown&#x60; result. Given in milliseconds. (optional)
   * @param machineDetectionSpeechThreshold Maximum threshold of a human greeting. If greeting longer than this value, considered machine. Ignored when &#x60;premium&#x60; detection is used. (optional, default to 3500)
   * @param machineDetectionSpeechEndThreshold Silence duration threshold after a greeting message or voice for it be considered human. Ignored when &#x60;premium&#x60; detection is used. (optional, default to 800)
   * @param machineDetectionSilenceTimeout If initial silence duration is greater than this value, consider it a machine. Ignored when &#x60;premium&#x60; detection is used. (optional, default to 3500)
   * @param amdStatusCallback The URL the result of answering machine detection will be sent to. (optional)
   * @param amdStatusCallbackMethod HTTP request type used for &#x60;AmdStatusCallback&#x60;. Defaults to &#x60;POST&#x60;. (optional)
   * @param cancelPlaybackOnMachineDetection Whether to cancel ongoing playback on &#x60;machine&#x60; detection. Defaults to &#x60;true&#x60;. (optional, default to true)
   * @param cancelPlaybackOnDetectMessageEnd Whether to cancel ongoing playback on &#x60;greeting ended&#x60; detection. Defaults to &#x60;true&#x60;. (optional, default to true)
   * @param preferredCodecs The list of comma-separated codecs to be offered on a call. (optional)
   * @param record Whether to record the entire participant&#39;s call leg. Defaults to &#x60;false&#x60;. (optional)
   * @param recordingChannels The number of channels in the final recording. Defaults to &#x60;mono&#x60;. (optional)
   * @param recordingStatusCallback The URL the recording callbacks will be sent to. (optional)
   * @param recordingStatusCallbackMethod HTTP request type used for &#x60;RecordingStatusCallback&#x60;. Defaults to &#x60;POST&#x60;. (optional)
   * @param recordingStatusCallbackEvent The changes to the recording&#39;s state that should generate a call to &#x60;RecoridngStatusCallback&#x60;. Can be: &#x60;in-progress&#x60;, &#x60;completed&#x60; and &#x60;absent&#x60;. Separate multiple values with a space. Defaults to &#x60;completed&#x60;. (optional)
   * @param recordingTrack The audio track to record for the call. The default is &#x60;both&#x60;. (optional)
   * @param sipAuthPassword The password to use for SIP authentication. (optional)
   * @param sipAuthUsername The username to use for SIP authentication. (optional)
   * @param trim Whether to trim any leading and trailing silence from the recording. Defaults to &#x60;trim-silence&#x60;. (optional)
   * @param conferenceRecord Whether to record the conference the participant is joining. Defualts to &#x60;do-not-record&#x60;. The boolean values &#x60;true&#x60; and &#x60;false&#x60; are synonymous with &#x60;record-from-start&#x60; and &#x60;do-not-record&#x60; respectively. (optional)
   * @param conferenceRecordingStatusCallback The URL the conference recording callbacks will be sent to. (optional)
   * @param conferenceRecordingStatusCallbackMethod HTTP request type used for &#x60;ConferenceRecordingStatusCallback&#x60;. Defaults to &#x60;POST&#x60;. (optional)
   * @param conferenceRecordingStatusCallbackEvent The changes to the conference recording&#39;s state that should generate a call to &#x60;RecoridngStatusCallback&#x60;. Can be: &#x60;in-progress&#x60;, &#x60;completed&#x60; and &#x60;absent&#x60;. Separate multiple values with a space. Defaults to &#x60;completed&#x60;. &#x60;failed&#x60; and &#x60;absent&#x60; are synonymous. (optional)
   * @param conferenceRecordingTimeout The number of seconds that Telnyx will wait for the recording to be stopped if silence is detected. The timer only starts when the speech is detected. Please note that the transcription is used to detect silence and the related charge will be applied. The minimum value is 0. The default value is 0 (infinite) (optional, default to 0)
   * @param conferenceTrim Whether to trim any leading and trailing silence from the conference recording. Defaults to &#x60;trim-silence&#x60;. (optional)
   * @return NewParticipantResource
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> New participant resource. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Fax does not exist </td><td>  -  </td></tr>
     </table>
   */
  public NewParticipantResource dialTexmlConferenceParticipant(String accountSid, String conferenceSid, String beep, String statusCallback, String statusCallbackMethod, String statusCallbackEvent, String to, String from, Integer timeout, Boolean muted, Boolean startConferenceOnEnter, Boolean endConferenceOnExit, Boolean earlyMedia, String conferenceStatusCallback, String conferenceStatusCallbackMethod, String conferenceStatusCallbackEvent, String waitUrl, Integer maxParticipants, Boolean coaching, String callSidToCoach, String callerId, Integer timeLimit, String machineDetection, Integer machineDetectionTimeout, Integer machineDetectionSpeechThreshold, Integer machineDetectionSpeechEndThreshold, Integer machineDetectionSilenceTimeout, String amdStatusCallback, String amdStatusCallbackMethod, Boolean cancelPlaybackOnMachineDetection, Boolean cancelPlaybackOnDetectMessageEnd, String preferredCodecs, Boolean record, String recordingChannels, String recordingStatusCallback, String recordingStatusCallbackMethod, String recordingStatusCallbackEvent, String recordingTrack, String sipAuthPassword, String sipAuthUsername, String trim, String conferenceRecord, String conferenceRecordingStatusCallback, String conferenceRecordingStatusCallbackMethod, String conferenceRecordingStatusCallbackEvent, Integer conferenceRecordingTimeout, String conferenceTrim) throws ApiException {
    return dialTexmlConferenceParticipantWithHttpInfo(accountSid, conferenceSid, beep, statusCallback, statusCallbackMethod, statusCallbackEvent, to, from, timeout, muted, startConferenceOnEnter, endConferenceOnExit, earlyMedia, conferenceStatusCallback, conferenceStatusCallbackMethod, conferenceStatusCallbackEvent, waitUrl, maxParticipants, coaching, callSidToCoach, callerId, timeLimit, machineDetection, machineDetectionTimeout, machineDetectionSpeechThreshold, machineDetectionSpeechEndThreshold, machineDetectionSilenceTimeout, amdStatusCallback, amdStatusCallbackMethod, cancelPlaybackOnMachineDetection, cancelPlaybackOnDetectMessageEnd, preferredCodecs, record, recordingChannels, recordingStatusCallback, recordingStatusCallbackMethod, recordingStatusCallbackEvent, recordingTrack, sipAuthPassword, sipAuthUsername, trim, conferenceRecord, conferenceRecordingStatusCallback, conferenceRecordingStatusCallbackMethod, conferenceRecordingStatusCallbackEvent, conferenceRecordingTimeout, conferenceTrim).getData();
  }

  /**
   * Dial a new conference participant
   * Dials a new conference participant
   * @param accountSid The id of the account the resource belongs to. (required)
   * @param conferenceSid The ConferenceSid that uniquely identifies a conference. (required)
   * @param beep Whether to play a notification beep to the conference when the participant enters and exits. (optional)
   * @param statusCallback URL destination for Telnyx to send status callback events to for the call. (optional)
   * @param statusCallbackMethod HTTP request type used for &#x60;StatusCallback&#x60;. (optional)
   * @param statusCallbackEvent The changes to the call&#39;s state that should generate a call to &#x60;StatusCallback&#x60;. Can be: &#x60;initiated&#x60;, &#x60;ringing&#x60;, &#x60;answered&#x60;, and &#x60;completed&#x60;. Separate multiple values with a space. The default value is &#x60;completed&#x60;. (optional)
   * @param to The phone number of the called party. Phone numbers are formatted with a &#x60;+&#x60; and country code. (optional)
   * @param from The phone number of the party that initiated the call. Phone numbers are formatted with a &#x60;+&#x60; and country code. (optional)
   * @param timeout The number of seconds that we should allow the phone to ring before assuming there is no answer. Can be an integer between 5 and 120, inclusive. The default value is 30. (optional)
   * @param muted Whether the participant should be muted. (optional)
   * @param startConferenceOnEnter Whether to start the conference when the participant enters. Defaults to &#x60;true&#x60;. (optional)
   * @param endConferenceOnExit Whether to end the conference when the participant leaves. Defaults to &#x60;false&#x60;. (optional)
   * @param earlyMedia Whether participant shall be bridged to conference before the participant answers (from early media if available). Defaults to &#x60;false&#x60;. (optional, default to false)
   * @param conferenceStatusCallback The URL the conference callbacks will be sent to. (optional)
   * @param conferenceStatusCallbackMethod HTTP request type used for &#x60;ConferenceStatusCallback&#x60;. Defaults to &#x60;POST&#x60;. (optional)
   * @param conferenceStatusCallbackEvent The changes to the conference&#39;s state that should generate a call to &#x60;ConferenceStatusCallback&#x60;. Can be: &#x60;start&#x60;, &#x60;end&#x60;, &#x60;join&#x60; and &#x60;leave&#x60;. Separate multiple values with a space. By default no callbacks are sent. (optional)
   * @param waitUrl The URL to call for an audio file to play while the participant is waiting for the conference to start. (optional)
   * @param maxParticipants The maximum number of participants in the conference. Can be a positive integer from 2 to 800. The default value is 250. (optional)
   * @param coaching Whether the participant is coaching another call. When &#x60;true&#x60;, &#x60;CallSidToCoach&#x60; has to be given. (optional)
   * @param callSidToCoach The SID of the participant who is being coached. The participant being coached is the only participant who can hear the participant who is coaching. (optional)
   * @param callerId To be used as the caller id name (SIP From Display Name) presented to the destination (&#x60;To&#x60; number). The string should have a maximum of 128 characters, containing only letters, numbers, spaces, and &#x60;-_~!.+&#x60; special characters. If ommited, the display name will be the same as the number in the &#x60;From&#x60; field. (optional)
   * @param timeLimit The maximum duration of the call in seconds. (optional)
   * @param machineDetection Whether to detect if a human or an answering machine picked up the call. Use &#x60;Enable&#x60; if you would like to ne notified as soon as the called party is identified. Use &#x60;DetectMessageEnd&#x60;, if you would like to leave a message on an answering machine. (optional)
   * @param machineDetectionTimeout How long answering machine detection should go on for before sending an &#x60;Unknown&#x60; result. Given in milliseconds. (optional)
   * @param machineDetectionSpeechThreshold Maximum threshold of a human greeting. If greeting longer than this value, considered machine. Ignored when &#x60;premium&#x60; detection is used. (optional, default to 3500)
   * @param machineDetectionSpeechEndThreshold Silence duration threshold after a greeting message or voice for it be considered human. Ignored when &#x60;premium&#x60; detection is used. (optional, default to 800)
   * @param machineDetectionSilenceTimeout If initial silence duration is greater than this value, consider it a machine. Ignored when &#x60;premium&#x60; detection is used. (optional, default to 3500)
   * @param amdStatusCallback The URL the result of answering machine detection will be sent to. (optional)
   * @param amdStatusCallbackMethod HTTP request type used for &#x60;AmdStatusCallback&#x60;. Defaults to &#x60;POST&#x60;. (optional)
   * @param cancelPlaybackOnMachineDetection Whether to cancel ongoing playback on &#x60;machine&#x60; detection. Defaults to &#x60;true&#x60;. (optional, default to true)
   * @param cancelPlaybackOnDetectMessageEnd Whether to cancel ongoing playback on &#x60;greeting ended&#x60; detection. Defaults to &#x60;true&#x60;. (optional, default to true)
   * @param preferredCodecs The list of comma-separated codecs to be offered on a call. (optional)
   * @param record Whether to record the entire participant&#39;s call leg. Defaults to &#x60;false&#x60;. (optional)
   * @param recordingChannels The number of channels in the final recording. Defaults to &#x60;mono&#x60;. (optional)
   * @param recordingStatusCallback The URL the recording callbacks will be sent to. (optional)
   * @param recordingStatusCallbackMethod HTTP request type used for &#x60;RecordingStatusCallback&#x60;. Defaults to &#x60;POST&#x60;. (optional)
   * @param recordingStatusCallbackEvent The changes to the recording&#39;s state that should generate a call to &#x60;RecoridngStatusCallback&#x60;. Can be: &#x60;in-progress&#x60;, &#x60;completed&#x60; and &#x60;absent&#x60;. Separate multiple values with a space. Defaults to &#x60;completed&#x60;. (optional)
   * @param recordingTrack The audio track to record for the call. The default is &#x60;both&#x60;. (optional)
   * @param sipAuthPassword The password to use for SIP authentication. (optional)
   * @param sipAuthUsername The username to use for SIP authentication. (optional)
   * @param trim Whether to trim any leading and trailing silence from the recording. Defaults to &#x60;trim-silence&#x60;. (optional)
   * @param conferenceRecord Whether to record the conference the participant is joining. Defualts to &#x60;do-not-record&#x60;. The boolean values &#x60;true&#x60; and &#x60;false&#x60; are synonymous with &#x60;record-from-start&#x60; and &#x60;do-not-record&#x60; respectively. (optional)
   * @param conferenceRecordingStatusCallback The URL the conference recording callbacks will be sent to. (optional)
   * @param conferenceRecordingStatusCallbackMethod HTTP request type used for &#x60;ConferenceRecordingStatusCallback&#x60;. Defaults to &#x60;POST&#x60;. (optional)
   * @param conferenceRecordingStatusCallbackEvent The changes to the conference recording&#39;s state that should generate a call to &#x60;RecoridngStatusCallback&#x60;. Can be: &#x60;in-progress&#x60;, &#x60;completed&#x60; and &#x60;absent&#x60;. Separate multiple values with a space. Defaults to &#x60;completed&#x60;. &#x60;failed&#x60; and &#x60;absent&#x60; are synonymous. (optional)
   * @param conferenceRecordingTimeout The number of seconds that Telnyx will wait for the recording to be stopped if silence is detected. The timer only starts when the speech is detected. Please note that the transcription is used to detect silence and the related charge will be applied. The minimum value is 0. The default value is 0 (infinite) (optional, default to 0)
   * @param conferenceTrim Whether to trim any leading and trailing silence from the conference recording. Defaults to &#x60;trim-silence&#x60;. (optional)
   * @return ApiResponse&lt;NewParticipantResource&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> New participant resource. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Fax does not exist </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<NewParticipantResource> dialTexmlConferenceParticipantWithHttpInfo(String accountSid, String conferenceSid, String beep, String statusCallback, String statusCallbackMethod, String statusCallbackEvent, String to, String from, Integer timeout, Boolean muted, Boolean startConferenceOnEnter, Boolean endConferenceOnExit, Boolean earlyMedia, String conferenceStatusCallback, String conferenceStatusCallbackMethod, String conferenceStatusCallbackEvent, String waitUrl, Integer maxParticipants, Boolean coaching, String callSidToCoach, String callerId, Integer timeLimit, String machineDetection, Integer machineDetectionTimeout, Integer machineDetectionSpeechThreshold, Integer machineDetectionSpeechEndThreshold, Integer machineDetectionSilenceTimeout, String amdStatusCallback, String amdStatusCallbackMethod, Boolean cancelPlaybackOnMachineDetection, Boolean cancelPlaybackOnDetectMessageEnd, String preferredCodecs, Boolean record, String recordingChannels, String recordingStatusCallback, String recordingStatusCallbackMethod, String recordingStatusCallbackEvent, String recordingTrack, String sipAuthPassword, String sipAuthUsername, String trim, String conferenceRecord, String conferenceRecordingStatusCallback, String conferenceRecordingStatusCallbackMethod, String conferenceRecordingStatusCallbackEvent, Integer conferenceRecordingTimeout, String conferenceTrim) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'accountSid' is set
    if (accountSid == null) {
      throw new ApiException(400, "Missing the required parameter 'accountSid' when calling dialTexmlConferenceParticipant");
    }
    
    // verify the required parameter 'conferenceSid' is set
    if (conferenceSid == null) {
      throw new ApiException(400, "Missing the required parameter 'conferenceSid' when calling dialTexmlConferenceParticipant");
    }
    
    // create path and map variables
    String localVarPath = "/texml/Accounts/{account_sid}/Conferences/{conference_sid}/Participants"
      .replaceAll("\\{" + "account_sid" + "\\}", apiClient.escapeString(accountSid.toString()))
      .replaceAll("\\{" + "conference_sid" + "\\}", apiClient.escapeString(conferenceSid.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    if (beep != null)
      localVarFormParams.put("Beep", beep);
if (statusCallback != null)
      localVarFormParams.put("StatusCallback", statusCallback);
if (statusCallbackMethod != null)
      localVarFormParams.put("StatusCallbackMethod", statusCallbackMethod);
if (statusCallbackEvent != null)
      localVarFormParams.put("StatusCallbackEvent", statusCallbackEvent);
if (to != null)
      localVarFormParams.put("To", to);
if (from != null)
      localVarFormParams.put("From", from);
if (timeout != null)
      localVarFormParams.put("Timeout", timeout);
if (muted != null)
      localVarFormParams.put("Muted", muted);
if (startConferenceOnEnter != null)
      localVarFormParams.put("StartConferenceOnEnter", startConferenceOnEnter);
if (endConferenceOnExit != null)
      localVarFormParams.put("EndConferenceOnExit", endConferenceOnExit);
if (earlyMedia != null)
      localVarFormParams.put("EarlyMedia", earlyMedia);
if (conferenceStatusCallback != null)
      localVarFormParams.put("ConferenceStatusCallback", conferenceStatusCallback);
if (conferenceStatusCallbackMethod != null)
      localVarFormParams.put("ConferenceStatusCallbackMethod", conferenceStatusCallbackMethod);
if (conferenceStatusCallbackEvent != null)
      localVarFormParams.put("ConferenceStatusCallbackEvent", conferenceStatusCallbackEvent);
if (waitUrl != null)
      localVarFormParams.put("WaitUrl", waitUrl);
if (maxParticipants != null)
      localVarFormParams.put("MaxParticipants", maxParticipants);
if (coaching != null)
      localVarFormParams.put("Coaching", coaching);
if (callSidToCoach != null)
      localVarFormParams.put("CallSidToCoach", callSidToCoach);
if (callerId != null)
      localVarFormParams.put("CallerId", callerId);
if (timeLimit != null)
      localVarFormParams.put("TimeLimit", timeLimit);
if (machineDetection != null)
      localVarFormParams.put("MachineDetection", machineDetection);
if (machineDetectionTimeout != null)
      localVarFormParams.put("MachineDetectionTimeout", machineDetectionTimeout);
if (machineDetectionSpeechThreshold != null)
      localVarFormParams.put("MachineDetectionSpeechThreshold", machineDetectionSpeechThreshold);
if (machineDetectionSpeechEndThreshold != null)
      localVarFormParams.put("MachineDetectionSpeechEndThreshold", machineDetectionSpeechEndThreshold);
if (machineDetectionSilenceTimeout != null)
      localVarFormParams.put("MachineDetectionSilenceTimeout", machineDetectionSilenceTimeout);
if (amdStatusCallback != null)
      localVarFormParams.put("AmdStatusCallback", amdStatusCallback);
if (amdStatusCallbackMethod != null)
      localVarFormParams.put("AmdStatusCallbackMethod", amdStatusCallbackMethod);
if (cancelPlaybackOnMachineDetection != null)
      localVarFormParams.put("CancelPlaybackOnMachineDetection", cancelPlaybackOnMachineDetection);
if (cancelPlaybackOnDetectMessageEnd != null)
      localVarFormParams.put("CancelPlaybackOnDetectMessageEnd", cancelPlaybackOnDetectMessageEnd);
if (preferredCodecs != null)
      localVarFormParams.put("PreferredCodecs", preferredCodecs);
if (record != null)
      localVarFormParams.put("Record", record);
if (recordingChannels != null)
      localVarFormParams.put("RecordingChannels", recordingChannels);
if (recordingStatusCallback != null)
      localVarFormParams.put("RecordingStatusCallback", recordingStatusCallback);
if (recordingStatusCallbackMethod != null)
      localVarFormParams.put("RecordingStatusCallbackMethod", recordingStatusCallbackMethod);
if (recordingStatusCallbackEvent != null)
      localVarFormParams.put("RecordingStatusCallbackEvent", recordingStatusCallbackEvent);
if (recordingTrack != null)
      localVarFormParams.put("RecordingTrack", recordingTrack);
if (sipAuthPassword != null)
      localVarFormParams.put("SipAuthPassword", sipAuthPassword);
if (sipAuthUsername != null)
      localVarFormParams.put("SipAuthUsername", sipAuthUsername);
if (trim != null)
      localVarFormParams.put("Trim", trim);
if (conferenceRecord != null)
      localVarFormParams.put("ConferenceRecord", conferenceRecord);
if (conferenceRecordingStatusCallback != null)
      localVarFormParams.put("ConferenceRecordingStatusCallback", conferenceRecordingStatusCallback);
if (conferenceRecordingStatusCallbackMethod != null)
      localVarFormParams.put("ConferenceRecordingStatusCallbackMethod", conferenceRecordingStatusCallbackMethod);
if (conferenceRecordingStatusCallbackEvent != null)
      localVarFormParams.put("ConferenceRecordingStatusCallbackEvent", conferenceRecordingStatusCallbackEvent);
if (conferenceRecordingTimeout != null)
      localVarFormParams.put("ConferenceRecordingTimeout", conferenceRecordingTimeout);
if (conferenceTrim != null)
      localVarFormParams.put("ConferenceTrim", conferenceTrim);

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/x-www-form-urlencoded"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    GenericType<NewParticipantResource> localVarReturnType = new GenericType<NewParticipantResource>() {};

    return apiClient.invokeAPI("TeXmlRestCommandsApi.dialTexmlConferenceParticipant", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

private ApiResponse<TexmlGetCallRecordingsResponseBody> fetchTeXMLCallRecordingsWithHttpInfo(String accountSid, String callSid) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'accountSid' is set
    if (accountSid == null) {
      throw new ApiException(400, "Missing the required parameter 'accountSid' when calling fetchTeXMLCallRecordings");
    }
    
    // verify the required parameter 'callSid' is set
    if (callSid == null) {
      throw new ApiException(400, "Missing the required parameter 'callSid' when calling fetchTeXMLCallRecordings");
    }
    
    // create path and map variables
    String localVarPath = "/texml/Accounts/{account_sid}/Calls/{call_sid}/Recordings.json"
      .replaceAll("\\{" + "account_sid" + "\\}", apiClient.escapeString(accountSid.toString()))
      .replaceAll("\\{" + "call_sid" + "\\}", apiClient.escapeString(callSid.toString()));

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

    GenericType<TexmlGetCallRecordingsResponseBody> localVarReturnType = new GenericType<TexmlGetCallRecordingsResponseBody>() {};

    return apiClient.invokeAPI("TeXmlRestCommandsApi.fetchTeXMLCallRecordings", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIfetchTeXMLCallRecordingsRequest {
    private String accountSid;
    private String callSid;

    private APIfetchTeXMLCallRecordingsRequest(String accountSid, String callSid) {
      this.accountSid = accountSid;
      this.callSid = callSid;
    }

    /**
     * Execute fetchTeXMLCallRecordings request
     * @return TexmlGetCallRecordingsResponseBody
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful Get Call Recordings Response </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> Fax does not exist </td><td>  -  </td></tr>
       </table>
     
     */
    
    public TexmlGetCallRecordingsResponseBody execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute fetchTeXMLCallRecordings request with HTTP info returned
     * @return ApiResponse&lt;TexmlGetCallRecordingsResponseBody&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful Get Call Recordings Response </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> Fax does not exist </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<TexmlGetCallRecordingsResponseBody> executeWithHttpInfo() throws ApiException {
      return fetchTeXMLCallRecordingsWithHttpInfo(accountSid, callSid);
    }
  }

  /**
   * Fetch recordings for a call
   * Returns recordings for a call identified by call_sid.
   * @param accountSid The id of the account the resource belongs to. (required)
   * @param callSid The CallSid that identifies the call to update. (required)
   * @return fetchTeXMLCallRecordingsRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIfetchTeXMLCallRecordingsRequest fetchTeXMLCallRecordings(String accountSid, String callSid) throws ApiException {
    return new APIfetchTeXMLCallRecordingsRequest(accountSid, callSid);
  }

private ApiResponse<TexmlGetCallRecordingsResponseBody> fetchTeXMLConferenceRecordingsWithHttpInfo(String accountSid, String conferenceSid) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'accountSid' is set
    if (accountSid == null) {
      throw new ApiException(400, "Missing the required parameter 'accountSid' when calling fetchTeXMLConferenceRecordings");
    }
    
    // verify the required parameter 'conferenceSid' is set
    if (conferenceSid == null) {
      throw new ApiException(400, "Missing the required parameter 'conferenceSid' when calling fetchTeXMLConferenceRecordings");
    }
    
    // create path and map variables
    String localVarPath = "/texml/Accounts/{account_sid}/Conferences/{conference_sid}/Recordings.json"
      .replaceAll("\\{" + "account_sid" + "\\}", apiClient.escapeString(accountSid.toString()))
      .replaceAll("\\{" + "conference_sid" + "\\}", apiClient.escapeString(conferenceSid.toString()));

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

    GenericType<TexmlGetCallRecordingsResponseBody> localVarReturnType = new GenericType<TexmlGetCallRecordingsResponseBody>() {};

    return apiClient.invokeAPI("TeXmlRestCommandsApi.fetchTeXMLConferenceRecordings", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIfetchTeXMLConferenceRecordingsRequest {
    private String accountSid;
    private String conferenceSid;

    private APIfetchTeXMLConferenceRecordingsRequest(String accountSid, String conferenceSid) {
      this.accountSid = accountSid;
      this.conferenceSid = conferenceSid;
    }

    /**
     * Execute fetchTeXMLConferenceRecordings request
     * @return TexmlGetCallRecordingsResponseBody
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful Get Call Recordings Response </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> Fax does not exist </td><td>  -  </td></tr>
       </table>
     
     */
    
    public TexmlGetCallRecordingsResponseBody execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute fetchTeXMLConferenceRecordings request with HTTP info returned
     * @return ApiResponse&lt;TexmlGetCallRecordingsResponseBody&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful Get Call Recordings Response </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> Fax does not exist </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<TexmlGetCallRecordingsResponseBody> executeWithHttpInfo() throws ApiException {
      return fetchTeXMLConferenceRecordingsWithHttpInfo(accountSid, conferenceSid);
    }
  }

  /**
   * Fetch recordings for a conference
   * Returns recordings for a conference identified by conference_sid.
   * @param accountSid The id of the account the resource belongs to. (required)
   * @param conferenceSid The ConferenceSid that uniquely identifies a conference. (required)
   * @return fetchTeXMLConferenceRecordingsRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIfetchTeXMLConferenceRecordingsRequest fetchTeXMLConferenceRecordings(String accountSid, String conferenceSid) throws ApiException {
    return new APIfetchTeXMLConferenceRecordingsRequest(accountSid, conferenceSid);
  }

private ApiResponse<TexmlGetCallRecordingResponseBody> getTeXMLCallRecordingWithHttpInfo(String accountSid, UUID recordingSid) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'accountSid' is set
    if (accountSid == null) {
      throw new ApiException(400, "Missing the required parameter 'accountSid' when calling getTeXMLCallRecording");
    }
    
    // verify the required parameter 'recordingSid' is set
    if (recordingSid == null) {
      throw new ApiException(400, "Missing the required parameter 'recordingSid' when calling getTeXMLCallRecording");
    }
    
    // create path and map variables
    String localVarPath = "/texml/Accounts/{account_sid}/Recordings/{recording_sid}.json"
      .replaceAll("\\{" + "account_sid" + "\\}", apiClient.escapeString(accountSid.toString()))
      .replaceAll("\\{" + "recording_sid" + "\\}", apiClient.escapeString(recordingSid.toString()));

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

    GenericType<TexmlGetCallRecordingResponseBody> localVarReturnType = new GenericType<TexmlGetCallRecordingResponseBody>() {};

    return apiClient.invokeAPI("TeXmlRestCommandsApi.getTeXMLCallRecording", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIgetTeXMLCallRecordingRequest {
    private String accountSid;
    private UUID recordingSid;

    private APIgetTeXMLCallRecordingRequest(String accountSid, UUID recordingSid) {
      this.accountSid = accountSid;
      this.recordingSid = recordingSid;
    }

    /**
     * Execute getTeXMLCallRecording request
     * @return TexmlGetCallRecordingResponseBody
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Retrieves call recording resource. </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> Fax does not exist </td><td>  -  </td></tr>
       </table>
     
     */
    
    public TexmlGetCallRecordingResponseBody execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute getTeXMLCallRecording request with HTTP info returned
     * @return ApiResponse&lt;TexmlGetCallRecordingResponseBody&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Retrieves call recording resource. </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> Fax does not exist </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<TexmlGetCallRecordingResponseBody> executeWithHttpInfo() throws ApiException {
      return getTeXMLCallRecordingWithHttpInfo(accountSid, recordingSid);
    }
  }

  /**
   * Fetch recording resource
   * Returns recording resource identified by recording id.
   * @param accountSid The id of the account the resource belongs to. (required)
   * @param recordingSid Uniquely identifies the recording by id. (required)
   * @return getTeXMLCallRecordingRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIgetTeXMLCallRecordingRequest getTeXMLCallRecording(String accountSid, UUID recordingSid) throws ApiException {
    return new APIgetTeXMLCallRecordingRequest(accountSid, recordingSid);
  }

private ApiResponse<TexmlGetCallRecordingsResponseBody> getTeXMLCallRecordingsWithHttpInfo(String accountSid, Integer page, Integer pageSize, String dateCreated) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'accountSid' is set
    if (accountSid == null) {
      throw new ApiException(400, "Missing the required parameter 'accountSid' when calling getTeXMLCallRecordings");
    }
    
    // create path and map variables
    String localVarPath = "/texml/Accounts/{account_sid}/Recordings.json"
      .replaceAll("\\{" + "account_sid" + "\\}", apiClient.escapeString(accountSid.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "Page", page));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "PageSize", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "DateCreated", dateCreated));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    GenericType<TexmlGetCallRecordingsResponseBody> localVarReturnType = new GenericType<TexmlGetCallRecordingsResponseBody>() {};

    return apiClient.invokeAPI("TeXmlRestCommandsApi.getTeXMLCallRecordings", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIgetTeXMLCallRecordingsRequest {
    private String accountSid;
    private Integer page;
    private Integer pageSize;
    private String dateCreated;

    private APIgetTeXMLCallRecordingsRequest(String accountSid) {
      this.accountSid = accountSid;
    }

    /**
     * Set page
     * @param page The number of the page to be displayed, zero-indexed, should be used in conjuction with PageToken. (optional)
     * @return APIgetTeXMLCallRecordingsRequest
     */
    public APIgetTeXMLCallRecordingsRequest page(Integer page) {
      this.page = page;
      return this;
    }

    /**
     * Set pageSize
     * @param pageSize The number of records to be displayed on a page (optional)
     * @return APIgetTeXMLCallRecordingsRequest
     */
    public APIgetTeXMLCallRecordingsRequest pageSize(Integer pageSize) {
      this.pageSize = pageSize;
      return this;
    }

    /**
     * Set dateCreated
     * @param dateCreated Filters recording by the creation date. Expected format is ISO8601 date or date-time, ie. {YYYY}-{MM}-{DD} or {YYYY}-{MM}-{DD}T{hh}:{mm}:{ss}Z. Also accepts inequality operators, e.g. DateCreated&gt;&#x3D;2023-05-22. (optional)
     * @return APIgetTeXMLCallRecordingsRequest
     */
    public APIgetTeXMLCallRecordingsRequest dateCreated(String dateCreated) {
      this.dateCreated = dateCreated;
      return this;
    }

    /**
     * Execute getTeXMLCallRecordings request
     * @return TexmlGetCallRecordingsResponseBody
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful Get Call Recordings Response </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> Fax does not exist </td><td>  -  </td></tr>
       </table>
     
     */
    
    public TexmlGetCallRecordingsResponseBody execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute getTeXMLCallRecordings request with HTTP info returned
     * @return ApiResponse&lt;TexmlGetCallRecordingsResponseBody&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful Get Call Recordings Response </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> Fax does not exist </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<TexmlGetCallRecordingsResponseBody> executeWithHttpInfo() throws ApiException {
      return getTeXMLCallRecordingsWithHttpInfo(accountSid, page, pageSize, dateCreated);
    }
  }

  /**
   * Fetch multiple recording resources
   * Returns multiple recording resources for an account.
   * @param accountSid The id of the account the resource belongs to. (required)
   * @return getTeXMLCallRecordingsRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIgetTeXMLCallRecordingsRequest getTeXMLCallRecordings(String accountSid) throws ApiException {
    return new APIgetTeXMLCallRecordingsRequest(accountSid);
  }
  /**
   * Fetch a call
   * Returns an individual call identified by its CallSid. This endpoint is eventually consistent.
   * @param callSid The CallSid that identifies the call to update. (required)
   * @param accountSid The id of the account the resource belongs to. (required)
   * @return CallResource
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Call resource. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Fax does not exist </td><td>  -  </td></tr>
     </table>
   */
  public CallResource getTexmlCall(String callSid, String accountSid) throws ApiException {
    return getTexmlCallWithHttpInfo(callSid, accountSid).getData();
  }

  /**
   * Fetch a call
   * Returns an individual call identified by its CallSid. This endpoint is eventually consistent.
   * @param callSid The CallSid that identifies the call to update. (required)
   * @param accountSid The id of the account the resource belongs to. (required)
   * @return ApiResponse&lt;CallResource&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Call resource. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Fax does not exist </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CallResource> getTexmlCallWithHttpInfo(String callSid, String accountSid) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'callSid' is set
    if (callSid == null) {
      throw new ApiException(400, "Missing the required parameter 'callSid' when calling getTexmlCall");
    }
    
    // verify the required parameter 'accountSid' is set
    if (accountSid == null) {
      throw new ApiException(400, "Missing the required parameter 'accountSid' when calling getTexmlCall");
    }
    
    // create path and map variables
    String localVarPath = "/texml/Accounts/{account_sid}/Calls/{call_sid}"
      .replaceAll("\\{" + "call_sid" + "\\}", apiClient.escapeString(callSid.toString()))
      .replaceAll("\\{" + "account_sid" + "\\}", apiClient.escapeString(accountSid.toString()));

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

    GenericType<CallResource> localVarReturnType = new GenericType<CallResource>() {};

    return apiClient.invokeAPI("TeXmlRestCommandsApi.getTexmlCall", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Fetch multiple call resources
   * Returns multiple call resouces for an account. This endpoint is eventually consistent.
   * @param accountSid The id of the account the resource belongs to. (required)
   * @param page The number of the page to be displayed, zero-indexed, should be used in conjuction with PageToken. (optional)
   * @param pageSize The size of the page (optional, default to 20)
   * @param pageToken Used to request the next page of results. (optional)
   * @param to Filters calls by the to number. (optional)
   * @param from Filters calls by the from number. (optional)
   * @param status Filters calls by status. (optional)
   * @param startTime Filters calls by their start date. Expected format is YYYY-MM-DD. (optional)
   * @param startTimeGreaterThan Filters calls by their start date (after). Expected format is YYYY-MM-DD (optional)
   * @param startTimeLessThan Filters calls by their start date (before). Expected format is YYYY-MM-DD (optional)
   * @param endTime Filters calls by their end date. Expected format is YYYY-MM-DD (optional)
   * @param endTimeGreaterThan Filters calls by their end date (after). Expected format is YYYY-MM-DD (optional)
   * @param endTimeLessThan Filters calls by their end date (before). Expected format is YYYY-MM-DD (optional)
   * @return CallResourceIndex
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Multiple call resources. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Fax does not exist </td><td>  -  </td></tr>
     </table>
   */
  public CallResourceIndex getTexmlCalls(String accountSid, Integer page, Integer pageSize, String pageToken, String to, String from, String status, String startTime, String startTimeGreaterThan, String startTimeLessThan, String endTime, String endTimeGreaterThan, String endTimeLessThan) throws ApiException {
    return getTexmlCallsWithHttpInfo(accountSid, page, pageSize, pageToken, to, from, status, startTime, startTimeGreaterThan, startTimeLessThan, endTime, endTimeGreaterThan, endTimeLessThan).getData();
  }

  /**
   * Fetch multiple call resources
   * Returns multiple call resouces for an account. This endpoint is eventually consistent.
   * @param accountSid The id of the account the resource belongs to. (required)
   * @param page The number of the page to be displayed, zero-indexed, should be used in conjuction with PageToken. (optional)
   * @param pageSize The size of the page (optional, default to 20)
   * @param pageToken Used to request the next page of results. (optional)
   * @param to Filters calls by the to number. (optional)
   * @param from Filters calls by the from number. (optional)
   * @param status Filters calls by status. (optional)
   * @param startTime Filters calls by their start date. Expected format is YYYY-MM-DD. (optional)
   * @param startTimeGreaterThan Filters calls by their start date (after). Expected format is YYYY-MM-DD (optional)
   * @param startTimeLessThan Filters calls by their start date (before). Expected format is YYYY-MM-DD (optional)
   * @param endTime Filters calls by their end date. Expected format is YYYY-MM-DD (optional)
   * @param endTimeGreaterThan Filters calls by their end date (after). Expected format is YYYY-MM-DD (optional)
   * @param endTimeLessThan Filters calls by their end date (before). Expected format is YYYY-MM-DD (optional)
   * @return ApiResponse&lt;CallResourceIndex&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Multiple call resources. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Fax does not exist </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CallResourceIndex> getTexmlCallsWithHttpInfo(String accountSid, Integer page, Integer pageSize, String pageToken, String to, String from, String status, String startTime, String startTimeGreaterThan, String startTimeLessThan, String endTime, String endTimeGreaterThan, String endTimeLessThan) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'accountSid' is set
    if (accountSid == null) {
      throw new ApiException(400, "Missing the required parameter 'accountSid' when calling getTexmlCalls");
    }
    
    // create path and map variables
    String localVarPath = "/texml/Accounts/{account_sid}/Calls"
      .replaceAll("\\{" + "account_sid" + "\\}", apiClient.escapeString(accountSid.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "Page", page));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "PageToken", pageToken));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "To", to));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "From", from));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "Status", status));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "StartTime", startTime));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "StartTimeGreaterThan", startTimeGreaterThan));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "StartTimeLessThan", startTimeLessThan));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "EndTime", endTime));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "EndTimeGreaterThan", endTimeGreaterThan));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "EndTimeLessThan", endTimeLessThan));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    GenericType<CallResourceIndex> localVarReturnType = new GenericType<CallResourceIndex>() {};

    return apiClient.invokeAPI("TeXmlRestCommandsApi.getTexmlCalls", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Fetch a conference resource
   * Returns a conference resource.
   * @param accountSid The id of the account the resource belongs to. (required)
   * @param conferenceSid The ConferenceSid that uniquely identifies a conference. (required)
   * @return ConferenceResource
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Conference resource. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Fax does not exist </td><td>  -  </td></tr>
     </table>
   */
  public ConferenceResource getTexmlConference(String accountSid, String conferenceSid) throws ApiException {
    return getTexmlConferenceWithHttpInfo(accountSid, conferenceSid).getData();
  }

  /**
   * Fetch a conference resource
   * Returns a conference resource.
   * @param accountSid The id of the account the resource belongs to. (required)
   * @param conferenceSid The ConferenceSid that uniquely identifies a conference. (required)
   * @return ApiResponse&lt;ConferenceResource&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Conference resource. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Fax does not exist </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ConferenceResource> getTexmlConferenceWithHttpInfo(String accountSid, String conferenceSid) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'accountSid' is set
    if (accountSid == null) {
      throw new ApiException(400, "Missing the required parameter 'accountSid' when calling getTexmlConference");
    }
    
    // verify the required parameter 'conferenceSid' is set
    if (conferenceSid == null) {
      throw new ApiException(400, "Missing the required parameter 'conferenceSid' when calling getTexmlConference");
    }
    
    // create path and map variables
    String localVarPath = "/texml/Accounts/{account_sid}/Conferences/{conference_sid}"
      .replaceAll("\\{" + "account_sid" + "\\}", apiClient.escapeString(accountSid.toString()))
      .replaceAll("\\{" + "conference_sid" + "\\}", apiClient.escapeString(conferenceSid.toString()));

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

    GenericType<ConferenceResource> localVarReturnType = new GenericType<ConferenceResource>() {};

    return apiClient.invokeAPI("TeXmlRestCommandsApi.getTexmlConference", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get conference participant resource
   * Gets conference participant resource
   * @param accountSid The id of the account the resource belongs to. (required)
   * @param conferenceSid The ConferenceSid that uniquely identifies a conference. (required)
   * @param callSid The CallSid that identifies the call to update. (required)
   * @return ParticipantResource
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Participant resource. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Fax does not exist </td><td>  -  </td></tr>
     </table>
   */
  public ParticipantResource getTexmlConferenceParticipant(String accountSid, String conferenceSid, String callSid) throws ApiException {
    return getTexmlConferenceParticipantWithHttpInfo(accountSid, conferenceSid, callSid).getData();
  }

  /**
   * Get conference participant resource
   * Gets conference participant resource
   * @param accountSid The id of the account the resource belongs to. (required)
   * @param conferenceSid The ConferenceSid that uniquely identifies a conference. (required)
   * @param callSid The CallSid that identifies the call to update. (required)
   * @return ApiResponse&lt;ParticipantResource&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Participant resource. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Fax does not exist </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ParticipantResource> getTexmlConferenceParticipantWithHttpInfo(String accountSid, String conferenceSid, String callSid) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'accountSid' is set
    if (accountSid == null) {
      throw new ApiException(400, "Missing the required parameter 'accountSid' when calling getTexmlConferenceParticipant");
    }
    
    // verify the required parameter 'conferenceSid' is set
    if (conferenceSid == null) {
      throw new ApiException(400, "Missing the required parameter 'conferenceSid' when calling getTexmlConferenceParticipant");
    }
    
    // verify the required parameter 'callSid' is set
    if (callSid == null) {
      throw new ApiException(400, "Missing the required parameter 'callSid' when calling getTexmlConferenceParticipant");
    }
    
    // create path and map variables
    String localVarPath = "/texml/Accounts/{account_sid}/Conferences/{conference_sid}/Participants/{call_sid}"
      .replaceAll("\\{" + "account_sid" + "\\}", apiClient.escapeString(accountSid.toString()))
      .replaceAll("\\{" + "conference_sid" + "\\}", apiClient.escapeString(conferenceSid.toString()))
      .replaceAll("\\{" + "call_sid" + "\\}", apiClient.escapeString(callSid.toString()));

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

    GenericType<ParticipantResource> localVarReturnType = new GenericType<ParticipantResource>() {};

    return apiClient.invokeAPI("TeXmlRestCommandsApi.getTexmlConferenceParticipant", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * List conference participants
   * Lists conference participants
   * @param accountSid The id of the account the resource belongs to. (required)
   * @param conferenceSid The ConferenceSid that uniquely identifies a conference. (required)
   * @return ParticipantResourceIndex
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Multiple participant resources. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Fax does not exist </td><td>  -  </td></tr>
     </table>
   */
  public ParticipantResourceIndex getTexmlConferenceParticipants(String accountSid, String conferenceSid) throws ApiException {
    return getTexmlConferenceParticipantsWithHttpInfo(accountSid, conferenceSid).getData();
  }

  /**
   * List conference participants
   * Lists conference participants
   * @param accountSid The id of the account the resource belongs to. (required)
   * @param conferenceSid The ConferenceSid that uniquely identifies a conference. (required)
   * @return ApiResponse&lt;ParticipantResourceIndex&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Multiple participant resources. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Fax does not exist </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ParticipantResourceIndex> getTexmlConferenceParticipantsWithHttpInfo(String accountSid, String conferenceSid) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'accountSid' is set
    if (accountSid == null) {
      throw new ApiException(400, "Missing the required parameter 'accountSid' when calling getTexmlConferenceParticipants");
    }
    
    // verify the required parameter 'conferenceSid' is set
    if (conferenceSid == null) {
      throw new ApiException(400, "Missing the required parameter 'conferenceSid' when calling getTexmlConferenceParticipants");
    }
    
    // create path and map variables
    String localVarPath = "/texml/Accounts/{account_sid}/Conferences/{conference_sid}/Participants"
      .replaceAll("\\{" + "account_sid" + "\\}", apiClient.escapeString(accountSid.toString()))
      .replaceAll("\\{" + "conference_sid" + "\\}", apiClient.escapeString(conferenceSid.toString()));

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

    GenericType<ParticipantResourceIndex> localVarReturnType = new GenericType<ParticipantResourceIndex>() {};

    return apiClient.invokeAPI("TeXmlRestCommandsApi.getTexmlConferenceParticipants", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * List conference recordings
   * Lists conference recordings
   * @param accountSid The id of the account the resource belongs to. (required)
   * @param conferenceSid The ConferenceSid that uniquely identifies a conference. (required)
   * @return ConferenceRecordingResourceIndex
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Multiple conference recording resources. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Fax does not exist </td><td>  -  </td></tr>
     </table>
   */
  public ConferenceRecordingResourceIndex getTexmlConferenceRecordings(String accountSid, String conferenceSid) throws ApiException {
    return getTexmlConferenceRecordingsWithHttpInfo(accountSid, conferenceSid).getData();
  }

  /**
   * List conference recordings
   * Lists conference recordings
   * @param accountSid The id of the account the resource belongs to. (required)
   * @param conferenceSid The ConferenceSid that uniquely identifies a conference. (required)
   * @return ApiResponse&lt;ConferenceRecordingResourceIndex&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Multiple conference recording resources. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Fax does not exist </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ConferenceRecordingResourceIndex> getTexmlConferenceRecordingsWithHttpInfo(String accountSid, String conferenceSid) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'accountSid' is set
    if (accountSid == null) {
      throw new ApiException(400, "Missing the required parameter 'accountSid' when calling getTexmlConferenceRecordings");
    }
    
    // verify the required parameter 'conferenceSid' is set
    if (conferenceSid == null) {
      throw new ApiException(400, "Missing the required parameter 'conferenceSid' when calling getTexmlConferenceRecordings");
    }
    
    // create path and map variables
    String localVarPath = "/texml/Accounts/{account_sid}/Conferences/{conference_sid}/Recordings"
      .replaceAll("\\{" + "account_sid" + "\\}", apiClient.escapeString(accountSid.toString()))
      .replaceAll("\\{" + "conference_sid" + "\\}", apiClient.escapeString(conferenceSid.toString()));

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

    GenericType<ConferenceRecordingResourceIndex> localVarReturnType = new GenericType<ConferenceRecordingResourceIndex>() {};

    return apiClient.invokeAPI("TeXmlRestCommandsApi.getTexmlConferenceRecordings", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * List conference resources
   * Lists conference resources.
   * @param accountSid The id of the account the resource belongs to. (required)
   * @param page The number of the page to be displayed, zero-indexed, should be used in conjuction with PageToken. (optional)
   * @param pageSize The size of the page (optional, default to 20)
   * @param pageToken Used to request the next page of results. (optional)
   * @param friendlyName Filters conferences by their friendly name. (optional)
   * @param status Filters conferences by status. (optional)
   * @param dateCreated Filters conferences by the creation date. Expected format is YYYY-MM-DD. Also accepts inequality operators, e.g. DateCreated&gt;&#x3D;2023-05-22. (optional)
   * @param dateUpdated Filters conferences by the time they were last updated. Expected format is YYYY-MM-DD. Also accepts inequality operators, e.g. DateUpdated&gt;&#x3D;2023-05-22. (optional)
   * @return ConferenceResourceIndex
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Multiple conference resources. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Fax does not exist </td><td>  -  </td></tr>
     </table>
   */
  public ConferenceResourceIndex getTexmlConferences(String accountSid, Integer page, Integer pageSize, String pageToken, String friendlyName, String status, String dateCreated, String dateUpdated) throws ApiException {
    return getTexmlConferencesWithHttpInfo(accountSid, page, pageSize, pageToken, friendlyName, status, dateCreated, dateUpdated).getData();
  }

  /**
   * List conference resources
   * Lists conference resources.
   * @param accountSid The id of the account the resource belongs to. (required)
   * @param page The number of the page to be displayed, zero-indexed, should be used in conjuction with PageToken. (optional)
   * @param pageSize The size of the page (optional, default to 20)
   * @param pageToken Used to request the next page of results. (optional)
   * @param friendlyName Filters conferences by their friendly name. (optional)
   * @param status Filters conferences by status. (optional)
   * @param dateCreated Filters conferences by the creation date. Expected format is YYYY-MM-DD. Also accepts inequality operators, e.g. DateCreated&gt;&#x3D;2023-05-22. (optional)
   * @param dateUpdated Filters conferences by the time they were last updated. Expected format is YYYY-MM-DD. Also accepts inequality operators, e.g. DateUpdated&gt;&#x3D;2023-05-22. (optional)
   * @return ApiResponse&lt;ConferenceResourceIndex&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Multiple conference resources. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Fax does not exist </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ConferenceResourceIndex> getTexmlConferencesWithHttpInfo(String accountSid, Integer page, Integer pageSize, String pageToken, String friendlyName, String status, String dateCreated, String dateUpdated) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'accountSid' is set
    if (accountSid == null) {
      throw new ApiException(400, "Missing the required parameter 'accountSid' when calling getTexmlConferences");
    }
    
    // create path and map variables
    String localVarPath = "/texml/Accounts/{account_sid}/Conferences"
      .replaceAll("\\{" + "account_sid" + "\\}", apiClient.escapeString(accountSid.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "Page", page));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "PageToken", pageToken));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "FriendlyName", friendlyName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "Status", status));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "DateCreated", dateCreated));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "DateUpdated", dateUpdated));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    GenericType<ConferenceResourceIndex> localVarReturnType = new GenericType<ConferenceResourceIndex>() {};

    return apiClient.invokeAPI("TeXmlRestCommandsApi.getTexmlConferences", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

private ApiResponse<InitiateCallResult> initiateTexmlCallWithHttpInfo(String accountSid, InitiateCallRequest initiateCallRequest) throws ApiException {
    Object localVarPostBody = initiateCallRequest;
    
    // verify the required parameter 'accountSid' is set
    if (accountSid == null) {
      throw new ApiException(400, "Missing the required parameter 'accountSid' when calling initiateTexmlCall");
    }
    
    // verify the required parameter 'initiateCallRequest' is set
    if (initiateCallRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'initiateCallRequest' when calling initiateTexmlCall");
    }
    
    // create path and map variables
    String localVarPath = "/texml/Accounts/{account_sid}/Calls"
      .replaceAll("\\{" + "account_sid" + "\\}", apiClient.escapeString(accountSid.toString()));

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

    GenericType<InitiateCallResult> localVarReturnType = new GenericType<InitiateCallResult>() {};

    return apiClient.invokeAPI("TeXmlRestCommandsApi.initiateTexmlCall", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIinitiateTexmlCallRequest {
    private String accountSid;
    private InitiateCallRequest initiateCallRequest;

    private APIinitiateTexmlCallRequest(String accountSid) {
      this.accountSid = accountSid;
    }

    /**
     * Set initiateCallRequest
     * @param initiateCallRequest Iniatiate Call request object (required)
     * @return APIinitiateTexmlCallRequest
     */
    public APIinitiateTexmlCallRequest initiateCallRequest(InitiateCallRequest initiateCallRequest) {
      this.initiateCallRequest = initiateCallRequest;
      return this;
    }

    /**
     * Execute initiateTexmlCall request
     * @return InitiateCallResult
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response upon initiating a TeXML call. </td><td>  -  </td></tr>
       </table>
     
     */
    
    public InitiateCallResult execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute initiateTexmlCall request with HTTP info returned
     * @return ApiResponse&lt;InitiateCallResult&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response upon initiating a TeXML call. </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<InitiateCallResult> executeWithHttpInfo() throws ApiException {
      return initiateTexmlCallWithHttpInfo(accountSid, initiateCallRequest);
    }
  }

  /**
   * Initiate an outbound call
   * Initiate an outbound TeXML call. Telnyx will request TeXML from the XML Request URL configured for the connection in the Mission Control Portal.
   * @param accountSid The id of the account the resource belongs to. (required)
   * @return initiateTexmlCallRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIinitiateTexmlCallRequest initiateTexmlCall(String accountSid) throws ApiException {
    return new APIinitiateTexmlCallRequest(accountSid);
  }

private ApiResponse<InitiateCallResult> initiateTexmlCallByApplicationIdWithHttpInfo(String applicationId, InitiateCallRequest initiateCallRequest) throws ApiException {
    Object localVarPostBody = initiateCallRequest;
    
    // verify the required parameter 'applicationId' is set
    if (applicationId == null) {
      throw new ApiException(400, "Missing the required parameter 'applicationId' when calling initiateTexmlCallByApplicationId");
    }
    
    // verify the required parameter 'initiateCallRequest' is set
    if (initiateCallRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'initiateCallRequest' when calling initiateTexmlCallByApplicationId");
    }
    
    // create path and map variables
    String localVarPath = "/texml/calls/{application_id}"
      .replaceAll("\\{" + "application_id" + "\\}", apiClient.escapeString(applicationId.toString()));

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

    GenericType<InitiateCallResult> localVarReturnType = new GenericType<InitiateCallResult>() {};

    return apiClient.invokeAPI("TeXmlRestCommandsApi.initiateTexmlCallByApplicationId", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIinitiateTexmlCallByApplicationIdRequest {
    private String applicationId;
    private InitiateCallRequest initiateCallRequest;

    private APIinitiateTexmlCallByApplicationIdRequest(String applicationId) {
      this.applicationId = applicationId;
    }

    /**
     * Set initiateCallRequest
     * @param initiateCallRequest Iniatiate Call request object (required)
     * @return APIinitiateTexmlCallByApplicationIdRequest
     */
    public APIinitiateTexmlCallByApplicationIdRequest initiateCallRequest(InitiateCallRequest initiateCallRequest) {
      this.initiateCallRequest = initiateCallRequest;
      return this;
    }

    /**
     * Execute initiateTexmlCallByApplicationId request
     * @return InitiateCallResult
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response upon initiating a TeXML call. </td><td>  -  </td></tr>
       </table>
     
     */
    
    public InitiateCallResult execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute initiateTexmlCallByApplicationId request with HTTP info returned
     * @return ApiResponse&lt;InitiateCallResult&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response upon initiating a TeXML call. </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<InitiateCallResult> executeWithHttpInfo() throws ApiException {
      return initiateTexmlCallByApplicationIdWithHttpInfo(applicationId, initiateCallRequest);
    }
  }

  /**
   * Initiate an outbound call
   * Initiate an outbound TeXML call. Telnyx will request TeXML from the XML Request URL configured for the connection in the Mission Control Portal.
   * @param applicationId The ID of the TeXML application used for the call. (required)
   * @return initiateTexmlCallByApplicationIdRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIinitiateTexmlCallByApplicationIdRequest initiateTexmlCallByApplicationId(String applicationId) throws ApiException {
    return new APIinitiateTexmlCallByApplicationIdRequest(applicationId);
  }

private ApiResponse<TexmlCreateCallRecordingResponseBody> startTeXMLCallRecordingWithHttpInfo(String accountSid, String callSid, Boolean playBeep, String recordingStatusCallbackEvent, URI recordingStatusCallback, TexmlStatusCallbackMethod recordingStatusCallbackMethod, TexmlRecordingChannels recordingChannels, RecordingTrack recordingTrack) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'accountSid' is set
    if (accountSid == null) {
      throw new ApiException(400, "Missing the required parameter 'accountSid' when calling startTeXMLCallRecording");
    }
    
    // verify the required parameter 'callSid' is set
    if (callSid == null) {
      throw new ApiException(400, "Missing the required parameter 'callSid' when calling startTeXMLCallRecording");
    }
    
    // create path and map variables
    String localVarPath = "/texml/Accounts/{account_sid}/Calls/{call_sid}/Recordings.json"
      .replaceAll("\\{" + "account_sid" + "\\}", apiClient.escapeString(accountSid.toString()))
      .replaceAll("\\{" + "call_sid" + "\\}", apiClient.escapeString(callSid.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    if (playBeep != null)
      localVarFormParams.put("PlayBeep", playBeep);
if (recordingStatusCallbackEvent != null)
      localVarFormParams.put("RecordingStatusCallbackEvent", recordingStatusCallbackEvent);
if (recordingStatusCallback != null)
      localVarFormParams.put("RecordingStatusCallback", recordingStatusCallback);
if (recordingStatusCallbackMethod != null)
      localVarFormParams.put("RecordingStatusCallbackMethod", recordingStatusCallbackMethod);
if (recordingChannels != null)
      localVarFormParams.put("RecordingChannels", recordingChannels);
if (recordingTrack != null)
      localVarFormParams.put("RecordingTrack", recordingTrack);

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/x-www-form-urlencoded"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    GenericType<TexmlCreateCallRecordingResponseBody> localVarReturnType = new GenericType<TexmlCreateCallRecordingResponseBody>() {};

    return apiClient.invokeAPI("TeXmlRestCommandsApi.startTeXMLCallRecording", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIstartTeXMLCallRecordingRequest {
    private String accountSid;
    private String callSid;
    private Boolean playBeep;
    private String recordingStatusCallbackEvent;
    private URI recordingStatusCallback;
    private TexmlStatusCallbackMethod recordingStatusCallbackMethod;
    private TexmlRecordingChannels recordingChannels;
    private RecordingTrack recordingTrack;

    private APIstartTeXMLCallRecordingRequest(String accountSid, String callSid) {
      this.accountSid = accountSid;
      this.callSid = callSid;
    }

    /**
     * Set playBeep
     * @param playBeep Whether to play a beep when recording is started. (optional, default to true)
     * @return APIstartTeXMLCallRecordingRequest
     */
    public APIstartTeXMLCallRecordingRequest playBeep(Boolean playBeep) {
      this.playBeep = playBeep;
      return this;
    }

    /**
     * Set recordingStatusCallbackEvent
     * @param recordingStatusCallbackEvent The changes to the recording&#39;s state that should generate a call to &#x60;RecoridngStatusCallback&#x60;. Can be: &#x60;in-progress&#x60;, &#x60;completed&#x60; and &#x60;absent&#x60;. Separate multiple values with a space. Defaults to &#x60;completed&#x60;. (optional)
     * @return APIstartTeXMLCallRecordingRequest
     */
    public APIstartTeXMLCallRecordingRequest recordingStatusCallbackEvent(String recordingStatusCallbackEvent) {
      this.recordingStatusCallbackEvent = recordingStatusCallbackEvent;
      return this;
    }

    /**
     * Set recordingStatusCallback
     * @param recordingStatusCallback Url where status callbacks will be sent. (optional)
     * @return APIstartTeXMLCallRecordingRequest
     */
    public APIstartTeXMLCallRecordingRequest recordingStatusCallback(URI recordingStatusCallback) {
      this.recordingStatusCallback = recordingStatusCallback;
      return this;
    }

    /**
     * Set recordingStatusCallbackMethod
     * @param recordingStatusCallbackMethod  (optional, default to POST)
     * @return APIstartTeXMLCallRecordingRequest
     */
    public APIstartTeXMLCallRecordingRequest recordingStatusCallbackMethod(TexmlStatusCallbackMethod recordingStatusCallbackMethod) {
      this.recordingStatusCallbackMethod = recordingStatusCallbackMethod;
      return this;
    }

    /**
     * Set recordingChannels
     * @param recordingChannels  (optional, default to dual)
     * @return APIstartTeXMLCallRecordingRequest
     */
    public APIstartTeXMLCallRecordingRequest recordingChannels(TexmlRecordingChannels recordingChannels) {
      this.recordingChannels = recordingChannels;
      return this;
    }

    /**
     * Set recordingTrack
     * @param recordingTrack  (optional)
     * @return APIstartTeXMLCallRecordingRequest
     */
    public APIstartTeXMLCallRecordingRequest recordingTrack(RecordingTrack recordingTrack) {
      this.recordingTrack = recordingTrack;
      return this;
    }

    /**
     * Execute startTeXMLCallRecording request
     * @return TexmlCreateCallRecordingResponseBody
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful call recording create response </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> Fax does not exist </td><td>  -  </td></tr>
       </table>
     
     */
    
    public TexmlCreateCallRecordingResponseBody execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute startTeXMLCallRecording request with HTTP info returned
     * @return ApiResponse&lt;TexmlCreateCallRecordingResponseBody&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful call recording create response </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> Fax does not exist </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<TexmlCreateCallRecordingResponseBody> executeWithHttpInfo() throws ApiException {
      return startTeXMLCallRecordingWithHttpInfo(accountSid, callSid, playBeep, recordingStatusCallbackEvent, recordingStatusCallback, recordingStatusCallbackMethod, recordingChannels, recordingTrack);
    }
  }

  /**
   * Request recording for a call
   * Starts recording with specified parameters for call idientified by call_sid.
   * @param accountSid The id of the account the resource belongs to. (required)
   * @param callSid The CallSid that identifies the call to update. (required)
   * @return startTeXMLCallRecordingRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIstartTeXMLCallRecordingRequest startTeXMLCallRecording(String accountSid, String callSid) throws ApiException {
    return new APIstartTeXMLCallRecordingRequest(accountSid, callSid);
  }

private ApiResponse<TexmlCreateCallStreamingResponseBody> startTeXMLCallStreamingWithHttpInfo(String accountSid, String callSid, URI statusCallback, TexmlStatusCallbackMethod statusCallbackMethod, StreamTrack track, String name, TexmlBidirectionalStreamMode bidirectionalMode, TexmlBidirectionalStreamCodec bidirectionalCodec, String url) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'accountSid' is set
    if (accountSid == null) {
      throw new ApiException(400, "Missing the required parameter 'accountSid' when calling startTeXMLCallStreaming");
    }
    
    // verify the required parameter 'callSid' is set
    if (callSid == null) {
      throw new ApiException(400, "Missing the required parameter 'callSid' when calling startTeXMLCallStreaming");
    }
    
    // create path and map variables
    String localVarPath = "/texml/Accounts/{account_sid}/Calls/{call_sid}/Streams.json"
      .replaceAll("\\{" + "account_sid" + "\\}", apiClient.escapeString(accountSid.toString()))
      .replaceAll("\\{" + "call_sid" + "\\}", apiClient.escapeString(callSid.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    if (statusCallback != null)
      localVarFormParams.put("StatusCallback", statusCallback);
if (statusCallbackMethod != null)
      localVarFormParams.put("StatusCallbackMethod", statusCallbackMethod);
if (track != null)
      localVarFormParams.put("Track", track);
if (name != null)
      localVarFormParams.put("Name", name);
if (bidirectionalMode != null)
      localVarFormParams.put("BidirectionalMode", bidirectionalMode);
if (bidirectionalCodec != null)
      localVarFormParams.put("BidirectionalCodec", bidirectionalCodec);
if (url != null)
      localVarFormParams.put("Url", url);

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/x-www-form-urlencoded"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    GenericType<TexmlCreateCallStreamingResponseBody> localVarReturnType = new GenericType<TexmlCreateCallStreamingResponseBody>() {};

    return apiClient.invokeAPI("TeXmlRestCommandsApi.startTeXMLCallStreaming", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIstartTeXMLCallStreamingRequest {
    private String accountSid;
    private String callSid;
    private URI statusCallback;
    private TexmlStatusCallbackMethod statusCallbackMethod;
    private StreamTrack track;
    private String name;
    private TexmlBidirectionalStreamMode bidirectionalMode;
    private TexmlBidirectionalStreamCodec bidirectionalCodec;
    private String url;

    private APIstartTeXMLCallStreamingRequest(String accountSid, String callSid) {
      this.accountSid = accountSid;
      this.callSid = callSid;
    }

    /**
     * Set statusCallback
     * @param statusCallback Url where status callbacks will be sent. (optional)
     * @return APIstartTeXMLCallStreamingRequest
     */
    public APIstartTeXMLCallStreamingRequest statusCallback(URI statusCallback) {
      this.statusCallback = statusCallback;
      return this;
    }

    /**
     * Set statusCallbackMethod
     * @param statusCallbackMethod  (optional, default to POST)
     * @return APIstartTeXMLCallStreamingRequest
     */
    public APIstartTeXMLCallStreamingRequest statusCallbackMethod(TexmlStatusCallbackMethod statusCallbackMethod) {
      this.statusCallbackMethod = statusCallbackMethod;
      return this;
    }

    /**
     * Set track
     * @param track  (optional, default to inbound_track)
     * @return APIstartTeXMLCallStreamingRequest
     */
    public APIstartTeXMLCallStreamingRequest track(StreamTrack track) {
      this.track = track;
      return this;
    }

    /**
     * Set name
     * @param name The user specified name of Stream. (optional)
     * @return APIstartTeXMLCallStreamingRequest
     */
    public APIstartTeXMLCallStreamingRequest name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set bidirectionalMode
     * @param bidirectionalMode  (optional, default to mp3)
     * @return APIstartTeXMLCallStreamingRequest
     */
    public APIstartTeXMLCallStreamingRequest bidirectionalMode(TexmlBidirectionalStreamMode bidirectionalMode) {
      this.bidirectionalMode = bidirectionalMode;
      return this;
    }

    /**
     * Set bidirectionalCodec
     * @param bidirectionalCodec  (optional, default to PCMU)
     * @return APIstartTeXMLCallStreamingRequest
     */
    public APIstartTeXMLCallStreamingRequest bidirectionalCodec(TexmlBidirectionalStreamCodec bidirectionalCodec) {
      this.bidirectionalCodec = bidirectionalCodec;
      return this;
    }

    /**
     * Set url
     * @param url The destination WebSocket address where the stream is going to be delivered. (optional)
     * @return APIstartTeXMLCallStreamingRequest
     */
    public APIstartTeXMLCallStreamingRequest url(String url) {
      this.url = url;
      return this;
    }

    /**
     * Execute startTeXMLCallStreaming request
     * @return TexmlCreateCallStreamingResponseBody
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful call streaming create response </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> Fax does not exist </td><td>  -  </td></tr>
       </table>
     
     */
    
    public TexmlCreateCallStreamingResponseBody execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute startTeXMLCallStreaming request with HTTP info returned
     * @return ApiResponse&lt;TexmlCreateCallStreamingResponseBody&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful call streaming create response </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> Fax does not exist </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<TexmlCreateCallStreamingResponseBody> executeWithHttpInfo() throws ApiException {
      return startTeXMLCallStreamingWithHttpInfo(accountSid, callSid, statusCallback, statusCallbackMethod, track, name, bidirectionalMode, bidirectionalCodec, url);
    }
  }

  /**
   * Start streaming media from a call.
   * Starts streaming media from a call to a specific WebSocket address.
   * @param accountSid The id of the account the resource belongs to. (required)
   * @param callSid The CallSid that identifies the call to update. (required)
   * @return startTeXMLCallStreamingRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIstartTeXMLCallStreamingRequest startTeXMLCallStreaming(String accountSid, String callSid) throws ApiException {
    return new APIstartTeXMLCallStreamingRequest(accountSid, callSid);
  }

private ApiResponse<TexmlCreateSiprecSessionResponseBody> startTeXMLSiprecSessionWithHttpInfo(String accountSid, String callSid, String connectorName, String track, Boolean includeMetadataCustomHeaders, Boolean secure, Integer sessionTimeoutSecs, String statusCallback, String statusCallbackMethod) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'accountSid' is set
    if (accountSid == null) {
      throw new ApiException(400, "Missing the required parameter 'accountSid' when calling startTeXMLSiprecSession");
    }
    
    // verify the required parameter 'callSid' is set
    if (callSid == null) {
      throw new ApiException(400, "Missing the required parameter 'callSid' when calling startTeXMLSiprecSession");
    }
    
    // create path and map variables
    String localVarPath = "/texml/Accounts/{account_sid}/Calls/{call_sid}/Siprec.json"
      .replaceAll("\\{" + "account_sid" + "\\}", apiClient.escapeString(accountSid.toString()))
      .replaceAll("\\{" + "call_sid" + "\\}", apiClient.escapeString(callSid.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    if (connectorName != null)
      localVarFormParams.put("ConnectorName", connectorName);
if (track != null)
      localVarFormParams.put("Track", track);
if (includeMetadataCustomHeaders != null)
      localVarFormParams.put("IncludeMetadataCustomHeaders", includeMetadataCustomHeaders);
if (secure != null)
      localVarFormParams.put("Secure", secure);
if (sessionTimeoutSecs != null)
      localVarFormParams.put("SessionTimeoutSecs", sessionTimeoutSecs);
if (statusCallback != null)
      localVarFormParams.put("StatusCallback", statusCallback);
if (statusCallbackMethod != null)
      localVarFormParams.put("StatusCallbackMethod", statusCallbackMethod);

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/x-www-form-urlencoded"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    GenericType<TexmlCreateSiprecSessionResponseBody> localVarReturnType = new GenericType<TexmlCreateSiprecSessionResponseBody>() {};

    return apiClient.invokeAPI("TeXmlRestCommandsApi.startTeXMLSiprecSession", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIstartTeXMLSiprecSessionRequest {
    private String accountSid;
    private String callSid;
    private String connectorName;
    private String track;
    private Boolean includeMetadataCustomHeaders;
    private Boolean secure;
    private Integer sessionTimeoutSecs;
    private String statusCallback;
    private String statusCallbackMethod;

    private APIstartTeXMLSiprecSessionRequest(String accountSid, String callSid) {
      this.accountSid = accountSid;
      this.callSid = callSid;
    }

    /**
     * Set connectorName
     * @param connectorName The name of the connector to use for the SIPREC session. (optional)
     * @return APIstartTeXMLSiprecSessionRequest
     */
    public APIstartTeXMLSiprecSessionRequest connectorName(String connectorName) {
      this.connectorName = connectorName;
      return this;
    }

    /**
     * Set track
     * @param track The track to be used for siprec session. Can be &#x60;both_tracks&#x60;, &#x60;inbound_track&#x60; or &#x60;outbound_track&#x60;. Defaults to &#x60;both_tracks&#x60;. (optional)
     * @return APIstartTeXMLSiprecSessionRequest
     */
    public APIstartTeXMLSiprecSessionRequest track(String track) {
      this.track = track;
      return this;
    }

    /**
     * Set includeMetadataCustomHeaders
     * @param includeMetadataCustomHeaders When set, custom parameters will be added as metadata (recording.session.ExtensionParameters). Otherwise, they’ll be added to sip headers. (optional)
     * @return APIstartTeXMLSiprecSessionRequest
     */
    public APIstartTeXMLSiprecSessionRequest includeMetadataCustomHeaders(Boolean includeMetadataCustomHeaders) {
      this.includeMetadataCustomHeaders = includeMetadataCustomHeaders;
      return this;
    }

    /**
     * Set secure
     * @param secure Controls whether to encrypt media sent to your SRS using SRTP and TLS. When set you need to configure SRS port in your connector to 5061. (optional)
     * @return APIstartTeXMLSiprecSessionRequest
     */
    public APIstartTeXMLSiprecSessionRequest secure(Boolean secure) {
      this.secure = secure;
      return this;
    }

    /**
     * Set sessionTimeoutSecs
     * @param sessionTimeoutSecs Sets &#x60;Session-Expires&#x60; header to the INVITE. A reinvite is sent every half the value set. Usefull for session keep alive. Minimum value is 90, set to 0 to disable. (optional, default to 1800)
     * @return APIstartTeXMLSiprecSessionRequest
     */
    public APIstartTeXMLSiprecSessionRequest sessionTimeoutSecs(Integer sessionTimeoutSecs) {
      this.sessionTimeoutSecs = sessionTimeoutSecs;
      return this;
    }

    /**
     * Set statusCallback
     * @param statusCallback URL destination for Telnyx to send status callback events to for the siprec session. (optional)
     * @return APIstartTeXMLSiprecSessionRequest
     */
    public APIstartTeXMLSiprecSessionRequest statusCallback(String statusCallback) {
      this.statusCallback = statusCallback;
      return this;
    }

    /**
     * Set statusCallbackMethod
     * @param statusCallbackMethod HTTP request type used for &#x60;StatusCallback&#x60;. (optional)
     * @return APIstartTeXMLSiprecSessionRequest
     */
    public APIstartTeXMLSiprecSessionRequest statusCallbackMethod(String statusCallbackMethod) {
      this.statusCallbackMethod = statusCallbackMethod;
      return this;
    }

    /**
     * Execute startTeXMLSiprecSession request
     * @return TexmlCreateSiprecSessionResponseBody
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful SIPREC session create response </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> Fax does not exist </td><td>  -  </td></tr>
       </table>
     
     */
    
    public TexmlCreateSiprecSessionResponseBody execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute startTeXMLSiprecSession request with HTTP info returned
     * @return ApiResponse&lt;TexmlCreateSiprecSessionResponseBody&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful SIPREC session create response </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> Fax does not exist </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<TexmlCreateSiprecSessionResponseBody> executeWithHttpInfo() throws ApiException {
      return startTeXMLSiprecSessionWithHttpInfo(accountSid, callSid, connectorName, track, includeMetadataCustomHeaders, secure, sessionTimeoutSecs, statusCallback, statusCallbackMethod);
    }
  }

  /**
   * Request siprec session for a call
   * Starts siprec session with specified parameters for call idientified by call_sid.
   * @param accountSid The id of the account the resource belongs to. (required)
   * @param callSid The CallSid that identifies the call to update. (required)
   * @return startTeXMLSiprecSessionRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIstartTeXMLSiprecSessionRequest startTeXMLSiprecSession(String accountSid, String callSid) throws ApiException {
    return new APIstartTeXMLSiprecSessionRequest(accountSid, callSid);
  }

private ApiResponse<TexmlCreateCallRecordingResponseBody> updateTeXMLCallRecordingWithHttpInfo(String accountSid, String callSid, UUID recordingSid, String status) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'accountSid' is set
    if (accountSid == null) {
      throw new ApiException(400, "Missing the required parameter 'accountSid' when calling updateTeXMLCallRecording");
    }
    
    // verify the required parameter 'callSid' is set
    if (callSid == null) {
      throw new ApiException(400, "Missing the required parameter 'callSid' when calling updateTeXMLCallRecording");
    }
    
    // verify the required parameter 'recordingSid' is set
    if (recordingSid == null) {
      throw new ApiException(400, "Missing the required parameter 'recordingSid' when calling updateTeXMLCallRecording");
    }
    
    // create path and map variables
    String localVarPath = "/texml/Accounts/{account_sid}/Calls/{call_sid}/Recordings/{recording_sid}.json"
      .replaceAll("\\{" + "account_sid" + "\\}", apiClient.escapeString(accountSid.toString()))
      .replaceAll("\\{" + "call_sid" + "\\}", apiClient.escapeString(callSid.toString()))
      .replaceAll("\\{" + "recording_sid" + "\\}", apiClient.escapeString(recordingSid.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    if (status != null)
      localVarFormParams.put("Status", status);

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/x-www-form-urlencoded"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    GenericType<TexmlCreateCallRecordingResponseBody> localVarReturnType = new GenericType<TexmlCreateCallRecordingResponseBody>() {};

    return apiClient.invokeAPI("TeXmlRestCommandsApi.updateTeXMLCallRecording", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIupdateTeXMLCallRecordingRequest {
    private String accountSid;
    private String callSid;
    private UUID recordingSid;
    private String status;

    private APIupdateTeXMLCallRecordingRequest(String accountSid, String callSid, UUID recordingSid) {
      this.accountSid = accountSid;
      this.callSid = callSid;
      this.recordingSid = recordingSid;
    }

    /**
     * Set status
     * @param status  (optional)
     * @return APIupdateTeXMLCallRecordingRequest
     */
    public APIupdateTeXMLCallRecordingRequest status(String status) {
      this.status = status;
      return this;
    }

    /**
     * Execute updateTeXMLCallRecording request
     * @return TexmlCreateCallRecordingResponseBody
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful call recording create response </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> Fax does not exist </td><td>  -  </td></tr>
       </table>
     
     */
    
    public TexmlCreateCallRecordingResponseBody execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute updateTeXMLCallRecording request with HTTP info returned
     * @return ApiResponse&lt;TexmlCreateCallRecordingResponseBody&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful call recording create response </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> Fax does not exist </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<TexmlCreateCallRecordingResponseBody> executeWithHttpInfo() throws ApiException {
      return updateTeXMLCallRecordingWithHttpInfo(accountSid, callSid, recordingSid, status);
    }
  }

  /**
   * Update recording on a call
   * Updates recording resource for particular call.
   * @param accountSid The id of the account the resource belongs to. (required)
   * @param callSid The CallSid that identifies the call to update. (required)
   * @param recordingSid Uniquely identifies the recording by id. (required)
   * @return updateTeXMLCallRecordingRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIupdateTeXMLCallRecordingRequest updateTeXMLCallRecording(String accountSid, String callSid, UUID recordingSid) throws ApiException {
    return new APIupdateTeXMLCallRecordingRequest(accountSid, callSid, recordingSid);
  }

private ApiResponse<TexmlUpdateCallStreamingResponseBody> updateTeXMLCallStreamingWithHttpInfo(String accountSid, String callSid, UUID streamingSid, StreamStatus status) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'accountSid' is set
    if (accountSid == null) {
      throw new ApiException(400, "Missing the required parameter 'accountSid' when calling updateTeXMLCallStreaming");
    }
    
    // verify the required parameter 'callSid' is set
    if (callSid == null) {
      throw new ApiException(400, "Missing the required parameter 'callSid' when calling updateTeXMLCallStreaming");
    }
    
    // verify the required parameter 'streamingSid' is set
    if (streamingSid == null) {
      throw new ApiException(400, "Missing the required parameter 'streamingSid' when calling updateTeXMLCallStreaming");
    }
    
    // create path and map variables
    String localVarPath = "/texml/Accounts/{account_sid}/Calls/{call_sid}/Streams/{streaming_sid}.json"
      .replaceAll("\\{" + "account_sid" + "\\}", apiClient.escapeString(accountSid.toString()))
      .replaceAll("\\{" + "call_sid" + "\\}", apiClient.escapeString(callSid.toString()))
      .replaceAll("\\{" + "streaming_sid" + "\\}", apiClient.escapeString(streamingSid.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    if (status != null)
      localVarFormParams.put("Status", status);

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/x-www-form-urlencoded"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    GenericType<TexmlUpdateCallStreamingResponseBody> localVarReturnType = new GenericType<TexmlUpdateCallStreamingResponseBody>() {};

    return apiClient.invokeAPI("TeXmlRestCommandsApi.updateTeXMLCallStreaming", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIupdateTeXMLCallStreamingRequest {
    private String accountSid;
    private String callSid;
    private UUID streamingSid;
    private StreamStatus status;

    private APIupdateTeXMLCallStreamingRequest(String accountSid, String callSid, UUID streamingSid) {
      this.accountSid = accountSid;
      this.callSid = callSid;
      this.streamingSid = streamingSid;
    }

    /**
     * Set status
     * @param status  (optional, default to stopped)
     * @return APIupdateTeXMLCallStreamingRequest
     */
    public APIupdateTeXMLCallStreamingRequest status(StreamStatus status) {
      this.status = status;
      return this;
    }

    /**
     * Execute updateTeXMLCallStreaming request
     * @return TexmlUpdateCallStreamingResponseBody
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful call streaming update response </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> Fax does not exist </td><td>  -  </td></tr>
       </table>
     
     */
    
    public TexmlUpdateCallStreamingResponseBody execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute updateTeXMLCallStreaming request with HTTP info returned
     * @return ApiResponse&lt;TexmlUpdateCallStreamingResponseBody&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful call streaming update response </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> Fax does not exist </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<TexmlUpdateCallStreamingResponseBody> executeWithHttpInfo() throws ApiException {
      return updateTeXMLCallStreamingWithHttpInfo(accountSid, callSid, streamingSid, status);
    }
  }

  /**
   * Update streaming on a call
   * Updates streaming resource for particular call.
   * @param accountSid The id of the account the resource belongs to. (required)
   * @param callSid The CallSid that identifies the call to update. (required)
   * @param streamingSid Uniquely identifies the streaming by id. (required)
   * @return updateTeXMLCallStreamingRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIupdateTeXMLCallStreamingRequest updateTeXMLCallStreaming(String accountSid, String callSid, UUID streamingSid) throws ApiException {
    return new APIupdateTeXMLCallStreamingRequest(accountSid, callSid, streamingSid);
  }

private ApiResponse<TexmlUpdateSiprecSessionResponseBody> updateTeXMLSiprecSessionWithHttpInfo(String accountSid, String callSid, String status) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'accountSid' is set
    if (accountSid == null) {
      throw new ApiException(400, "Missing the required parameter 'accountSid' when calling updateTeXMLSiprecSession");
    }
    
    // verify the required parameter 'callSid' is set
    if (callSid == null) {
      throw new ApiException(400, "Missing the required parameter 'callSid' when calling updateTeXMLSiprecSession");
    }
    
    // create path and map variables
    String localVarPath = "/texml/Accounts/{account_sid}/Calls/{call_sid}/Siprec/{siprec_sid}.json"
      .replaceAll("\\{" + "account_sid" + "\\}", apiClient.escapeString(accountSid.toString()))
      .replaceAll("\\{" + "call_sid" + "\\}", apiClient.escapeString(callSid.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    if (status != null)
      localVarFormParams.put("Status", status);

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/x-www-form-urlencoded"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    GenericType<TexmlUpdateSiprecSessionResponseBody> localVarReturnType = new GenericType<TexmlUpdateSiprecSessionResponseBody>() {};

    return apiClient.invokeAPI("TeXmlRestCommandsApi.updateTeXMLSiprecSession", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIupdateTeXMLSiprecSessionRequest {
    private String accountSid;
    private String callSid;
    private String status;

    private APIupdateTeXMLSiprecSessionRequest(String accountSid, String callSid) {
      this.accountSid = accountSid;
      this.callSid = callSid;
    }

    /**
     * Set status
     * @param status The new status of the resource. Specifying &#x60;stopped&#x60; will end the siprec session. (optional)
     * @return APIupdateTeXMLSiprecSessionRequest
     */
    public APIupdateTeXMLSiprecSessionRequest status(String status) {
      this.status = status;
      return this;
    }

    /**
     * Execute updateTeXMLSiprecSession request
     * @return TexmlUpdateSiprecSessionResponseBody
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful SIPREC session update response </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> Fax does not exist </td><td>  -  </td></tr>
       </table>
     
     */
    
    public TexmlUpdateSiprecSessionResponseBody execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute updateTeXMLSiprecSession request with HTTP info returned
     * @return ApiResponse&lt;TexmlUpdateSiprecSessionResponseBody&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful SIPREC session update response </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> Fax does not exist </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<TexmlUpdateSiprecSessionResponseBody> executeWithHttpInfo() throws ApiException {
      return updateTeXMLSiprecSessionWithHttpInfo(accountSid, callSid, status);
    }
  }

  /**
   * Updates siprec session for a call
   * Updates siprec session identified by siprec_sid.
   * @param accountSid The id of the account the resource belongs to. (required)
   * @param callSid The CallSid that identifies the call to update. (required)
   * @return updateTeXMLSiprecSessionRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIupdateTeXMLSiprecSessionRequest updateTeXMLSiprecSession(String accountSid, String callSid) throws ApiException {
    return new APIupdateTeXMLSiprecSessionRequest(accountSid, callSid);
  }

private ApiResponse<CallResource> updateTexmlCallWithHttpInfo(String callSid, String accountSid, String status, String url, String method, String fallbackUrl, String fallbackMethod, String statusCallback, String statusCallbackMethod, String texml) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'callSid' is set
    if (callSid == null) {
      throw new ApiException(400, "Missing the required parameter 'callSid' when calling updateTexmlCall");
    }
    
    // verify the required parameter 'accountSid' is set
    if (accountSid == null) {
      throw new ApiException(400, "Missing the required parameter 'accountSid' when calling updateTexmlCall");
    }
    
    // create path and map variables
    String localVarPath = "/texml/Accounts/{account_sid}/Calls/{call_sid}"
      .replaceAll("\\{" + "call_sid" + "\\}", apiClient.escapeString(callSid.toString()))
      .replaceAll("\\{" + "account_sid" + "\\}", apiClient.escapeString(accountSid.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    if (status != null)
      localVarFormParams.put("Status", status);
if (url != null)
      localVarFormParams.put("Url", url);
if (method != null)
      localVarFormParams.put("Method", method);
if (fallbackUrl != null)
      localVarFormParams.put("FallbackUrl", fallbackUrl);
if (fallbackMethod != null)
      localVarFormParams.put("FallbackMethod", fallbackMethod);
if (statusCallback != null)
      localVarFormParams.put("StatusCallback", statusCallback);
if (statusCallbackMethod != null)
      localVarFormParams.put("StatusCallbackMethod", statusCallbackMethod);
if (texml != null)
      localVarFormParams.put("Texml", texml);

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/x-www-form-urlencoded"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    GenericType<CallResource> localVarReturnType = new GenericType<CallResource>() {};

    return apiClient.invokeAPI("TeXmlRestCommandsApi.updateTexmlCall", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIupdateTexmlCallRequest {
    private String callSid;
    private String accountSid;
    private String status;
    private String url;
    private String method;
    private String fallbackUrl;
    private String fallbackMethod;
    private String statusCallback;
    private String statusCallbackMethod;
    private String texml;

    private APIupdateTexmlCallRequest(String callSid, String accountSid) {
      this.callSid = callSid;
      this.accountSid = accountSid;
    }

    /**
     * Set status
     * @param status The value to set the call status to. Setting the status to completed ends the call. (optional)
     * @return APIupdateTexmlCallRequest
     */
    public APIupdateTexmlCallRequest status(String status) {
      this.status = status;
      return this;
    }

    /**
     * Set url
     * @param url The URL where TeXML will make a request to retrieve a new set of TeXML instructions to continue the call flow. (optional)
     * @return APIupdateTexmlCallRequest
     */
    public APIupdateTexmlCallRequest url(String url) {
      this.url = url;
      return this;
    }

    /**
     * Set method
     * @param method HTTP request type used for &#x60;Url&#x60;. (optional)
     * @return APIupdateTexmlCallRequest
     */
    public APIupdateTexmlCallRequest method(String method) {
      this.method = method;
      return this;
    }

    /**
     * Set fallbackUrl
     * @param fallbackUrl A failover URL for which Telnyx will retrieve the TeXML call instructions if the Url is not responding. (optional)
     * @return APIupdateTexmlCallRequest
     */
    public APIupdateTexmlCallRequest fallbackUrl(String fallbackUrl) {
      this.fallbackUrl = fallbackUrl;
      return this;
    }

    /**
     * Set fallbackMethod
     * @param fallbackMethod HTTP request type used for &#x60;FallbackUrl&#x60;. (optional)
     * @return APIupdateTexmlCallRequest
     */
    public APIupdateTexmlCallRequest fallbackMethod(String fallbackMethod) {
      this.fallbackMethod = fallbackMethod;
      return this;
    }

    /**
     * Set statusCallback
     * @param statusCallback URL destination for Telnyx to send status callback events to for the call. (optional)
     * @return APIupdateTexmlCallRequest
     */
    public APIupdateTexmlCallRequest statusCallback(String statusCallback) {
      this.statusCallback = statusCallback;
      return this;
    }

    /**
     * Set statusCallbackMethod
     * @param statusCallbackMethod HTTP request type used for &#x60;StatusCallback&#x60;. (optional)
     * @return APIupdateTexmlCallRequest
     */
    public APIupdateTexmlCallRequest statusCallbackMethod(String statusCallbackMethod) {
      this.statusCallbackMethod = statusCallbackMethod;
      return this;
    }

    /**
     * Set texml
     * @param texml TeXML to replace the current one with. (optional)
     * @return APIupdateTexmlCallRequest
     */
    public APIupdateTexmlCallRequest texml(String texml) {
      this.texml = texml;
      return this;
    }

    /**
     * Execute updateTexmlCall request
     * @return CallResource
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Call resource. </td><td>  -  </td></tr>
       </table>
     
     */
    
    public CallResource execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute updateTexmlCall request with HTTP info returned
     * @return ApiResponse&lt;CallResource&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Call resource. </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<CallResource> executeWithHttpInfo() throws ApiException {
      return updateTexmlCallWithHttpInfo(callSid, accountSid, status, url, method, fallbackUrl, fallbackMethod, statusCallback, statusCallbackMethod, texml);
    }
  }

  /**
   * Update call
   * Update TeXML call. Please note that the keys present in the payload MUST BE formatted in CamelCase as specified in the example.
   * @param callSid The CallSid that identifies the call to update. (required)
   * @param accountSid The id of the account the resource belongs to. (required)
   * @return updateTexmlCallRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIupdateTexmlCallRequest updateTexmlCall(String callSid, String accountSid) throws ApiException {
    return new APIupdateTexmlCallRequest(callSid, accountSid);
  }

private ApiResponse<TeXMLRESTCommandResponse> updateTexmlCallBySidWithHttpInfo(String callSid, UpdateCallRequest updateCallRequest) throws ApiException {
    Object localVarPostBody = updateCallRequest;
    
    // verify the required parameter 'callSid' is set
    if (callSid == null) {
      throw new ApiException(400, "Missing the required parameter 'callSid' when calling updateTexmlCallBySid");
    }
    
    // verify the required parameter 'updateCallRequest' is set
    if (updateCallRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'updateCallRequest' when calling updateTexmlCallBySid");
    }
    
    // create path and map variables
    String localVarPath = "/texml/calls/{call_sid}/update"
      .replaceAll("\\{" + "call_sid" + "\\}", apiClient.escapeString(callSid.toString()));

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

    GenericType<TeXMLRESTCommandResponse> localVarReturnType = new GenericType<TeXMLRESTCommandResponse>() {};

    return apiClient.invokeAPI("TeXmlRestCommandsApi.updateTexmlCallBySid", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIupdateTexmlCallBySidRequest {
    private String callSid;
    private UpdateCallRequest updateCallRequest;

    private APIupdateTexmlCallBySidRequest(String callSid) {
      this.callSid = callSid;
    }

    /**
     * Set updateCallRequest
     * @param updateCallRequest Update Call request object (required)
     * @return APIupdateTexmlCallBySidRequest
     */
    public APIupdateTexmlCallBySidRequest updateCallRequest(UpdateCallRequest updateCallRequest) {
      this.updateCallRequest = updateCallRequest;
      return this;
    }

    /**
     * Execute updateTexmlCallBySid request
     * @return TeXMLRESTCommandResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response upon updating a TeXML call. </td><td>  -  </td></tr>
       </table>
     
     */
    
    public TeXMLRESTCommandResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute updateTexmlCallBySid request with HTTP info returned
     * @return ApiResponse&lt;TeXMLRESTCommandResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response upon updating a TeXML call. </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<TeXMLRESTCommandResponse> executeWithHttpInfo() throws ApiException {
      return updateTexmlCallBySidWithHttpInfo(callSid, updateCallRequest);
    }
  }

  /**
   * Update call
   * Update TeXML call. Please note that the keys present in the payload MUST BE formatted in CamelCase as specified in the example.
   * @param callSid The CallSid that identifies the call to update. (required)
   * @return updateTexmlCallBySidRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIupdateTexmlCallBySidRequest updateTexmlCallBySid(String callSid) throws ApiException {
    return new APIupdateTexmlCallBySidRequest(callSid);
  }
  /**
   * Update a conference resource
   * Updates a conference resource.
   * @param accountSid The id of the account the resource belongs to. (required)
   * @param conferenceSid The ConferenceSid that uniquely identifies a conference. (required)
   * @param callControlId Unique identifier and token for controlling the call (required)
   * @param supervisorRole Sets the participant as a supervisor for the conference. A conference can have multiple supervisors. \\\&quot;barge\\\&quot; means the supervisor enters the conference as a normal participant. This is the same as \\\&quot;none\\\&quot;. \\\&quot;monitor\\\&quot; means the supervisor is muted but can hear all participants. \\\&quot;whisper\\\&quot; means that only the specified \\\&quot;whisper_call_control_ids\\\&quot; can hear the supervisor. Defaults to \\\&quot;none\\\&quot;. (required)
   * @param commandId Use this field to avoid execution of duplicate commands. Telnyx will ignore subsequent commands with the same &#x60;command_id&#x60; as one that has already been executed. (optional)
   * @param whisperCallControlIds Array of unique call_control_ids the supervisor can whisper to. If none provided, the supervisor will join the conference as a monitoring participant only. (optional)
   * @return ConferenceResource
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Conference resource. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Fax does not exist </td><td>  -  </td></tr>
     </table>
   */
  public ConferenceResource updateTexmlConference(String accountSid, String conferenceSid, String callControlId, String supervisorRole, String commandId, List<String> whisperCallControlIds) throws ApiException {
    return updateTexmlConferenceWithHttpInfo(accountSid, conferenceSid, callControlId, supervisorRole, commandId, whisperCallControlIds).getData();
  }

  /**
   * Update a conference resource
   * Updates a conference resource.
   * @param accountSid The id of the account the resource belongs to. (required)
   * @param conferenceSid The ConferenceSid that uniquely identifies a conference. (required)
   * @param callControlId Unique identifier and token for controlling the call (required)
   * @param supervisorRole Sets the participant as a supervisor for the conference. A conference can have multiple supervisors. \\\&quot;barge\\\&quot; means the supervisor enters the conference as a normal participant. This is the same as \\\&quot;none\\\&quot;. \\\&quot;monitor\\\&quot; means the supervisor is muted but can hear all participants. \\\&quot;whisper\\\&quot; means that only the specified \\\&quot;whisper_call_control_ids\\\&quot; can hear the supervisor. Defaults to \\\&quot;none\\\&quot;. (required)
   * @param commandId Use this field to avoid execution of duplicate commands. Telnyx will ignore subsequent commands with the same &#x60;command_id&#x60; as one that has already been executed. (optional)
   * @param whisperCallControlIds Array of unique call_control_ids the supervisor can whisper to. If none provided, the supervisor will join the conference as a monitoring participant only. (optional)
   * @return ApiResponse&lt;ConferenceResource&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Conference resource. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Fax does not exist </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ConferenceResource> updateTexmlConferenceWithHttpInfo(String accountSid, String conferenceSid, String callControlId, String supervisorRole, String commandId, List<String> whisperCallControlIds) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'accountSid' is set
    if (accountSid == null) {
      throw new ApiException(400, "Missing the required parameter 'accountSid' when calling updateTexmlConference");
    }
    
    // verify the required parameter 'conferenceSid' is set
    if (conferenceSid == null) {
      throw new ApiException(400, "Missing the required parameter 'conferenceSid' when calling updateTexmlConference");
    }
    
    // verify the required parameter 'callControlId' is set
    if (callControlId == null) {
      throw new ApiException(400, "Missing the required parameter 'callControlId' when calling updateTexmlConference");
    }
    
    // verify the required parameter 'supervisorRole' is set
    if (supervisorRole == null) {
      throw new ApiException(400, "Missing the required parameter 'supervisorRole' when calling updateTexmlConference");
    }
    
    // create path and map variables
    String localVarPath = "/texml/Accounts/{account_sid}/Conferences/{conference_sid}"
      .replaceAll("\\{" + "account_sid" + "\\}", apiClient.escapeString(accountSid.toString()))
      .replaceAll("\\{" + "conference_sid" + "\\}", apiClient.escapeString(conferenceSid.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    if (callControlId != null)
      localVarFormParams.put("call_control_id", callControlId);
if (commandId != null)
      localVarFormParams.put("command_id", commandId);
if (supervisorRole != null)
      localVarFormParams.put("supervisor_role", supervisorRole);
if (whisperCallControlIds != null)
      localVarFormParams.put("whisper_call_control_ids", whisperCallControlIds);

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/x-www-form-urlencoded"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    GenericType<ConferenceResource> localVarReturnType = new GenericType<ConferenceResource>() {};

    return apiClient.invokeAPI("TeXmlRestCommandsApi.updateTexmlConference", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Update a conference participant
   * Updates a conference participant
   * @param accountSid The id of the account the resource belongs to. (required)
   * @param conferenceSid The ConferenceSid that uniquely identifies a conference. (required)
   * @param callSid The CallSid that identifies the call to update. (required)
   * @param muted Whether the participant should be muted. (optional)
   * @param hold Whether the participant should be on hold. (optional)
   * @param holdUrl The URL to be called using the &#x60;HoldMethod&#x60; for music that plays when the participant is on hold. The URL may return an MP3 file, a WAV file, or a TwiML document that contains &#x60;&lt;Play&gt;&#x60;, &#x60;&lt;Say&gt;&#x60;, &#x60;&lt;Pause&gt;&#x60;, or &#x60;&lt;Redirect&gt;&#x60; verbs. (optional)
   * @param holdMethod The HTTP method to use when calling the &#x60;HoldUrl&#x60;. (optional)
   * @param announceUrl The URL to call to announce something to the participant. The URL may return an MP3 fileo a WAV file, or a TwiML document that contains &#x60;&lt;Play&gt;&#x60;, &#x60;&lt;Say&gt;&#x60;, &#x60;&lt;Pause&gt;&#x60;, or &#x60;&lt;Redirect&gt;&#x60; verbs. (optional)
   * @param announceMethod The HTTP method used to call the &#x60;AnnounceUrl&#x60;. Defaults to &#x60;POST&#x60;. (optional)
   * @param waitUrl The URL to call for an audio file to play while the participant is waiting for the conference to start. (optional)
   * @param beepOnExit Whether to play a notification beep to the conference when the participant exits. (optional)
   * @param endConferenceOnExit Whether to end the conference when the participant leaves. (optional)
   * @param coaching Whether the participant is coaching another call. When &#x60;true&#x60;, &#x60;CallSidToCoach&#x60; has to be given. (optional)
   * @param callSidToCoach The SID of the participant who is being coached. The participant being coached is the only participant who can hear the participant who is coaching. (optional)
   * @return ParticipantResource
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Participant resource. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Fax does not exist </td><td>  -  </td></tr>
     </table>
   */
  public ParticipantResource updateTexmlConferenceParticipant(String accountSid, String conferenceSid, String callSid, Boolean muted, Boolean hold, String holdUrl, String holdMethod, String announceUrl, String announceMethod, String waitUrl, Boolean beepOnExit, Boolean endConferenceOnExit, Boolean coaching, String callSidToCoach) throws ApiException {
    return updateTexmlConferenceParticipantWithHttpInfo(accountSid, conferenceSid, callSid, muted, hold, holdUrl, holdMethod, announceUrl, announceMethod, waitUrl, beepOnExit, endConferenceOnExit, coaching, callSidToCoach).getData();
  }

  /**
   * Update a conference participant
   * Updates a conference participant
   * @param accountSid The id of the account the resource belongs to. (required)
   * @param conferenceSid The ConferenceSid that uniquely identifies a conference. (required)
   * @param callSid The CallSid that identifies the call to update. (required)
   * @param muted Whether the participant should be muted. (optional)
   * @param hold Whether the participant should be on hold. (optional)
   * @param holdUrl The URL to be called using the &#x60;HoldMethod&#x60; for music that plays when the participant is on hold. The URL may return an MP3 file, a WAV file, or a TwiML document that contains &#x60;&lt;Play&gt;&#x60;, &#x60;&lt;Say&gt;&#x60;, &#x60;&lt;Pause&gt;&#x60;, or &#x60;&lt;Redirect&gt;&#x60; verbs. (optional)
   * @param holdMethod The HTTP method to use when calling the &#x60;HoldUrl&#x60;. (optional)
   * @param announceUrl The URL to call to announce something to the participant. The URL may return an MP3 fileo a WAV file, or a TwiML document that contains &#x60;&lt;Play&gt;&#x60;, &#x60;&lt;Say&gt;&#x60;, &#x60;&lt;Pause&gt;&#x60;, or &#x60;&lt;Redirect&gt;&#x60; verbs. (optional)
   * @param announceMethod The HTTP method used to call the &#x60;AnnounceUrl&#x60;. Defaults to &#x60;POST&#x60;. (optional)
   * @param waitUrl The URL to call for an audio file to play while the participant is waiting for the conference to start. (optional)
   * @param beepOnExit Whether to play a notification beep to the conference when the participant exits. (optional)
   * @param endConferenceOnExit Whether to end the conference when the participant leaves. (optional)
   * @param coaching Whether the participant is coaching another call. When &#x60;true&#x60;, &#x60;CallSidToCoach&#x60; has to be given. (optional)
   * @param callSidToCoach The SID of the participant who is being coached. The participant being coached is the only participant who can hear the participant who is coaching. (optional)
   * @return ApiResponse&lt;ParticipantResource&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Participant resource. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Fax does not exist </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ParticipantResource> updateTexmlConferenceParticipantWithHttpInfo(String accountSid, String conferenceSid, String callSid, Boolean muted, Boolean hold, String holdUrl, String holdMethod, String announceUrl, String announceMethod, String waitUrl, Boolean beepOnExit, Boolean endConferenceOnExit, Boolean coaching, String callSidToCoach) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'accountSid' is set
    if (accountSid == null) {
      throw new ApiException(400, "Missing the required parameter 'accountSid' when calling updateTexmlConferenceParticipant");
    }
    
    // verify the required parameter 'conferenceSid' is set
    if (conferenceSid == null) {
      throw new ApiException(400, "Missing the required parameter 'conferenceSid' when calling updateTexmlConferenceParticipant");
    }
    
    // verify the required parameter 'callSid' is set
    if (callSid == null) {
      throw new ApiException(400, "Missing the required parameter 'callSid' when calling updateTexmlConferenceParticipant");
    }
    
    // create path and map variables
    String localVarPath = "/texml/Accounts/{account_sid}/Conferences/{conference_sid}/Participants/{call_sid}"
      .replaceAll("\\{" + "account_sid" + "\\}", apiClient.escapeString(accountSid.toString()))
      .replaceAll("\\{" + "conference_sid" + "\\}", apiClient.escapeString(conferenceSid.toString()))
      .replaceAll("\\{" + "call_sid" + "\\}", apiClient.escapeString(callSid.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    if (muted != null)
      localVarFormParams.put("Muted", muted);
if (hold != null)
      localVarFormParams.put("Hold", hold);
if (holdUrl != null)
      localVarFormParams.put("HoldUrl", holdUrl);
if (holdMethod != null)
      localVarFormParams.put("HoldMethod", holdMethod);
if (announceUrl != null)
      localVarFormParams.put("AnnounceUrl", announceUrl);
if (announceMethod != null)
      localVarFormParams.put("AnnounceMethod", announceMethod);
if (waitUrl != null)
      localVarFormParams.put("WaitUrl", waitUrl);
if (beepOnExit != null)
      localVarFormParams.put("BeepOnExit", beepOnExit);
if (endConferenceOnExit != null)
      localVarFormParams.put("EndConferenceOnExit", endConferenceOnExit);
if (coaching != null)
      localVarFormParams.put("Coaching", coaching);
if (callSidToCoach != null)
      localVarFormParams.put("CallSidToCoach", callSidToCoach);

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/x-www-form-urlencoded"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    GenericType<ParticipantResource> localVarReturnType = new GenericType<ParticipantResource>() {};

    return apiClient.invokeAPI("TeXmlRestCommandsApi.updateTexmlConferenceParticipant", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
