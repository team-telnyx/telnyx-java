/*
 * Telnyx API
 * SIP trunking, SMS, MMS, Call Control and Telephony Data Services.
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: support@telnyx.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.telnyx.sdk.api;

import com.telnyx.sdk.*;
import com.telnyx.sdk.auth.*;
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
import com.telnyx.sdk.model.UpdateCallRequest;
import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

/**
 * API tests for TeXmlRestCommandsApi
 */
public class TeXmlRestCommandsApiTest {

    private final TeXmlRestCommandsApi api = new TeXmlRestCommandsApi();

    /**
     * Create a TeXML secret
     *
     * Create a TeXML secret which can be later used as a Dynamic Parameter for TeXML when using Mustache Templates in your TeXML. In your TeXML you will be able to use your secret name, and this name will be replaced by the actual secret value when processing the TeXML on Telnyx side.  The secrets are not visible in any logs.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createTexmlSecretTest() throws ApiException {
        //CreateTeXMLSecretRequest createTeXMLSecretRequest = null;
        //CreateTeXMLSecretRequest response = api.createTexmlSecret(createTeXMLSecretRequest);
        // TODO: test validations
    }

    /**
     * Delete recording resource
     *
     * Deletes recording resource identified by recording id.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteTeXMLCallRecordingTest() throws ApiException {
        //String accountSid = null;
        //UUID recordingSid = null;
        //api.deleteTeXMLCallRecording(accountSid, recordingSid)
        //        .execute();
        // TODO: test validations
    }

    /**
     * Delete a conference participant
     *
     * Deletes a conference participant
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteTexmlConferenceParticipantTest() throws ApiException {
        //String accountSid = null;
        //String conferenceSid = null;
        //String callSid = null;
        //api.deleteTexmlConferenceParticipant(accountSid, conferenceSid, callSid);
        // TODO: test validations
    }

    /**
     * Dial a new conference participant
     *
     * Dials a new conference participant
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void dialTexmlConferenceParticipantTest() throws ApiException {
        //String accountSid = null;
        //String conferenceSid = null;
        //String beep = null;
        //String statusCallback = null;
        //String statusCallbackMethod = null;
        //String statusCallbackEvent = null;
        //String to = null;
        //String from = null;
        //Integer timeout = null;
        //Boolean muted = null;
        //Boolean startConferenceOnEnter = null;
        //Boolean endConferenceOnExit = null;
        //Boolean earlyMedia = null;
        //String conferenceStatusCallback = null;
        //String conferenceStatusCallbackMethod = null;
        //String conferenceStatusCallbackEvent = null;
        //String waitUrl = null;
        //Integer maxParticipants = null;
        //Boolean coaching = null;
        //String callSidToCoach = null;
        //String callerId = null;
        //Integer timeLimit = null;
        //String machineDetection = null;
        //Integer machineDetectionTimeout = null;
        //Integer machineDetectionSpeechThreshold = null;
        //Integer machineDetectionSpeechEndThreshold = null;
        //Integer machineDetectionSilenceTimeout = null;
        //String amdStatusCallback = null;
        //String amdStatusCallbackMethod = null;
        //Boolean cancelPlaybackOnMachineDetection = null;
        //Boolean cancelPlaybackOnDetectMessageEnd = null;
        //String preferredCodecs = null;
        //Boolean record = null;
        //String recordingChannels = null;
        //String recordingStatusCallback = null;
        //String recordingStatusCallbackMethod = null;
        //String recordingStatusCallbackEvent = null;
        //String recordingTrack = null;
        //String sipAuthPassword = null;
        //String sipAuthUsername = null;
        //String trim = null;
        //String conferenceRecord = null;
        //String conferenceRecordingStatusCallback = null;
        //String conferenceRecordingStatusCallbackMethod = null;
        //String conferenceRecordingStatusCallbackEvent = null;
        //Integer conferenceRecordingTimeout = null;
        //String conferenceTrim = null;
        //NewParticipantResource response = api.dialTexmlConferenceParticipant(accountSid, conferenceSid, beep, statusCallback, statusCallbackMethod, statusCallbackEvent, to, from, timeout, muted, startConferenceOnEnter, endConferenceOnExit, earlyMedia, conferenceStatusCallback, conferenceStatusCallbackMethod, conferenceStatusCallbackEvent, waitUrl, maxParticipants, coaching, callSidToCoach, callerId, timeLimit, machineDetection, machineDetectionTimeout, machineDetectionSpeechThreshold, machineDetectionSpeechEndThreshold, machineDetectionSilenceTimeout, amdStatusCallback, amdStatusCallbackMethod, cancelPlaybackOnMachineDetection, cancelPlaybackOnDetectMessageEnd, preferredCodecs, record, recordingChannels, recordingStatusCallback, recordingStatusCallbackMethod, recordingStatusCallbackEvent, recordingTrack, sipAuthPassword, sipAuthUsername, trim, conferenceRecord, conferenceRecordingStatusCallback, conferenceRecordingStatusCallbackMethod, conferenceRecordingStatusCallbackEvent, conferenceRecordingTimeout, conferenceTrim);
        // TODO: test validations
    }

    /**
     * Fetch recordings for a call
     *
     * Returns recordings for a call identified by call_sid.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void fetchTeXMLCallRecordingsTest() throws ApiException {
        //String accountSid = null;
        //String callSid = null;
        //TexmlGetCallRecordingsResponseBody response = api.fetchTeXMLCallRecordings(accountSid, callSid)
        //        .execute();
        // TODO: test validations
    }

    /**
     * Fetch recordings for a conference
     *
     * Returns recordings for a conference identified by conference_sid.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void fetchTeXMLConferenceRecordingsTest() throws ApiException {
        //String accountSid = null;
        //String conferenceSid = null;
        //TexmlGetCallRecordingsResponseBody response = api.fetchTeXMLConferenceRecordings(accountSid, conferenceSid)
        //        .execute();
        // TODO: test validations
    }

    /**
     * Fetch recording resource
     *
     * Returns recording resource identified by recording id.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTeXMLCallRecordingTest() throws ApiException {
        //String accountSid = null;
        //UUID recordingSid = null;
        //TexmlGetCallRecordingResponseBody response = api.getTeXMLCallRecording(accountSid, recordingSid)
        //        .execute();
        // TODO: test validations
    }

    /**
     * Fetch multiple recording resources
     *
     * Returns multiple recording resources for an account.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTeXMLCallRecordingsTest() throws ApiException {
        //String accountSid = null;
        //Integer page = null;
        //Integer pageSize = null;
        //String dateCreated = null;
        //TexmlGetCallRecordingsResponseBody response = api.getTeXMLCallRecordings(accountSid)
        //        .page(page)
        //        .pageSize(pageSize)
        //        .dateCreated(dateCreated)
        //        .execute();
        // TODO: test validations
    }

    /**
     * Fetch a call
     *
     * Returns an individual call identified by its CallSid. This endpoint is eventually consistent.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTexmlCallTest() throws ApiException {
        //String callSid = null;
        //String accountSid = null;
        //CallResource response = api.getTexmlCall(callSid, accountSid);
        // TODO: test validations
    }

    /**
     * Fetch multiple call resources
     *
     * Returns multiple call resouces for an account. This endpoint is eventually consistent.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTexmlCallsTest() throws ApiException {
        //String accountSid = null;
        //Integer page = null;
        //Integer pageSize = null;
        //String pageToken = null;
        //String to = null;
        //String from = null;
        //String status = null;
        //String startTime = null;
        //String startTimeGreaterThan = null;
        //String startTimeLessThan = null;
        //String endTime = null;
        //String endTimeGreaterThan = null;
        //String endTimeLessThan = null;
        //CallResourceIndex response = api.getTexmlCalls(accountSid, page, pageSize, pageToken, to, from, status, startTime, startTimeGreaterThan, startTimeLessThan, endTime, endTimeGreaterThan, endTimeLessThan);
        // TODO: test validations
    }

    /**
     * Fetch a conference resource
     *
     * Returns a conference resource.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTexmlConferenceTest() throws ApiException {
        //String accountSid = null;
        //String conferenceSid = null;
        //ConferenceResource response = api.getTexmlConference(accountSid, conferenceSid);
        // TODO: test validations
    }

    /**
     * Get conference participant resource
     *
     * Gets conference participant resource
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTexmlConferenceParticipantTest() throws ApiException {
        //String accountSid = null;
        //String conferenceSid = null;
        //String callSid = null;
        //ParticipantResource response = api.getTexmlConferenceParticipant(accountSid, conferenceSid, callSid);
        // TODO: test validations
    }

    /**
     * List conference participants
     *
     * Lists conference participants
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTexmlConferenceParticipantsTest() throws ApiException {
        //String accountSid = null;
        //String conferenceSid = null;
        //ParticipantResourceIndex response = api.getTexmlConferenceParticipants(accountSid, conferenceSid);
        // TODO: test validations
    }

    /**
     * List conference recordings
     *
     * Lists conference recordings
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTexmlConferenceRecordingsTest() throws ApiException {
        //String accountSid = null;
        //String conferenceSid = null;
        //ConferenceRecordingResourceIndex response = api.getTexmlConferenceRecordings(accountSid, conferenceSid);
        // TODO: test validations
    }

    /**
     * List conference resources
     *
     * Lists conference resources.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTexmlConferencesTest() throws ApiException {
        //String accountSid = null;
        //Integer page = null;
        //Integer pageSize = null;
        //String pageToken = null;
        //String friendlyName = null;
        //String status = null;
        //String dateCreated = null;
        //String dateUpdated = null;
        //ConferenceResourceIndex response = api.getTexmlConferences(accountSid, page, pageSize, pageToken, friendlyName, status, dateCreated, dateUpdated);
        // TODO: test validations
    }

    /**
     * Initiate an outbound call
     *
     * Initiate an outbound TeXML call. Telnyx will request TeXML from the XML Request URL configured for the connection in the Mission Control Portal.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void initiateTexmlCallTest() throws ApiException {
        //String accountSid = null;
        //InitiateCallRequest initiateCallRequest = null;
        //InitiateCallResult response = api.initiateTexmlCall(accountSid)
        //        .initiateCallRequest(initiateCallRequest)
        //        .execute();
        // TODO: test validations
    }

    /**
     * Initiate an outbound call
     *
     * Initiate an outbound TeXML call. Telnyx will request TeXML from the XML Request URL configured for the connection in the Mission Control Portal.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void initiateTexmlCallByApplicationIdTest() throws ApiException {
        //String applicationId = null;
        //InitiateCallRequest initiateCallRequest = null;
        //InitiateCallResult response = api.initiateTexmlCallByApplicationId(applicationId)
        //        .initiateCallRequest(initiateCallRequest)
        //        .execute();
        // TODO: test validations
    }

    /**
     * Request recording for a call
     *
     * Starts recording with specified parameters for call idientified by call_sid.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void startTeXMLCallRecordingTest() throws ApiException {
        //String accountSid = null;
        //String callSid = null;
        //Boolean playBeep = null;
        //String recordingStatusCallbackEvent = null;
        //URI recordingStatusCallback = null;
        //TexmlStatusCallbackMethod recordingStatusCallbackMethod = null;
        //TexmlRecordingChannels recordingChannels = null;
        //RecordingTrack recordingTrack = null;
        //TexmlCreateCallRecordingResponseBody response = api.startTeXMLCallRecording(accountSid, callSid)
        //        .playBeep(playBeep)
        //        .recordingStatusCallbackEvent(recordingStatusCallbackEvent)
        //        .recordingStatusCallback(recordingStatusCallback)
        //        .recordingStatusCallbackMethod(recordingStatusCallbackMethod)
        //        .recordingChannels(recordingChannels)
        //        .recordingTrack(recordingTrack)
        //        .execute();
        // TODO: test validations
    }

    /**
     * Start streaming media from a call.
     *
     * Starts streaming media from a call to a specific WebSocket address.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void startTeXMLCallStreamingTest() throws ApiException {
        //String accountSid = null;
        //String callSid = null;
        //URI statusCallback = null;
        //TexmlStatusCallbackMethod statusCallbackMethod = null;
        //StreamTrack track = null;
        //String name = null;
        //TexmlBidirectionalStreamMode bidirectionalMode = null;
        //TexmlBidirectionalStreamCodec bidirectionalCodec = null;
        //String url = null;
        //TexmlCreateCallStreamingResponseBody response = api.startTeXMLCallStreaming(accountSid, callSid)
        //        .statusCallback(statusCallback)
        //        .statusCallbackMethod(statusCallbackMethod)
        //        .track(track)
        //        .name(name)
        //        .bidirectionalMode(bidirectionalMode)
        //        .bidirectionalCodec(bidirectionalCodec)
        //        .url(url)
        //        .execute();
        // TODO: test validations
    }

    /**
     * Request siprec session for a call
     *
     * Starts siprec session with specified parameters for call idientified by call_sid.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void startTeXMLSiprecSessionTest() throws ApiException {
        //String accountSid = null;
        //String callSid = null;
        //String connectorName = null;
        //String track = null;
        //Boolean includeMetadataCustomHeaders = null;
        //Boolean secure = null;
        //Integer sessionTimeoutSecs = null;
        //String statusCallback = null;
        //String statusCallbackMethod = null;
        //TexmlCreateSiprecSessionResponseBody response = api.startTeXMLSiprecSession(accountSid, callSid)
        //        .connectorName(connectorName)
        //        .track(track)
        //        .includeMetadataCustomHeaders(includeMetadataCustomHeaders)
        //        .secure(secure)
        //        .sessionTimeoutSecs(sessionTimeoutSecs)
        //        .statusCallback(statusCallback)
        //        .statusCallbackMethod(statusCallbackMethod)
        //        .execute();
        // TODO: test validations
    }

    /**
     * Update recording on a call
     *
     * Updates recording resource for particular call.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateTeXMLCallRecordingTest() throws ApiException {
        //String accountSid = null;
        //String callSid = null;
        //UUID recordingSid = null;
        //String status = null;
        //TexmlCreateCallRecordingResponseBody response = api.updateTeXMLCallRecording(accountSid, callSid, recordingSid)
        //        .status(status)
        //        .execute();
        // TODO: test validations
    }

    /**
     * Update streaming on a call
     *
     * Updates streaming resource for particular call.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateTeXMLCallStreamingTest() throws ApiException {
        //String accountSid = null;
        //String callSid = null;
        //UUID streamingSid = null;
        //StreamStatus status = null;
        //TexmlUpdateCallStreamingResponseBody response = api.updateTeXMLCallStreaming(accountSid, callSid, streamingSid)
        //        .status(status)
        //        .execute();
        // TODO: test validations
    }

    /**
     * Updates siprec session for a call
     *
     * Updates siprec session identified by siprec_sid.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateTeXMLSiprecSessionTest() throws ApiException {
        //String accountSid = null;
        //String callSid = null;
        //String status = null;
        //TexmlUpdateSiprecSessionResponseBody response = api.updateTeXMLSiprecSession(accountSid, callSid)
        //        .status(status)
        //        .execute();
        // TODO: test validations
    }

    /**
     * Update call
     *
     * Update TeXML call. Please note that the keys present in the payload MUST BE formatted in CamelCase as specified in the example.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateTexmlCallTest() throws ApiException {
        //String callSid = null;
        //String accountSid = null;
        //String status = null;
        //String url = null;
        //String method = null;
        //String fallbackUrl = null;
        //String fallbackMethod = null;
        //String statusCallback = null;
        //String statusCallbackMethod = null;
        //String texml = null;
        //CallResource response = api.updateTexmlCall(callSid, accountSid)
        //        .status(status)
        //        .url(url)
        //        .method(method)
        //        .fallbackUrl(fallbackUrl)
        //        .fallbackMethod(fallbackMethod)
        //        .statusCallback(statusCallback)
        //        .statusCallbackMethod(statusCallbackMethod)
        //        .texml(texml)
        //        .execute();
        // TODO: test validations
    }

    /**
     * Update call
     *
     * Update TeXML call. Please note that the keys present in the payload MUST BE formatted in CamelCase as specified in the example.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateTexmlCallBySidTest() throws ApiException {
        //String callSid = null;
        //UpdateCallRequest updateCallRequest = null;
        //TeXMLRESTCommandResponse response = api.updateTexmlCallBySid(callSid)
        //        .updateCallRequest(updateCallRequest)
        //        .execute();
        // TODO: test validations
    }

    /**
     * Update a conference resource
     *
     * Updates a conference resource.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateTexmlConferenceTest() throws ApiException {
        //String accountSid = null;
        //String conferenceSid = null;
        //String callControlId = null;
        //String supervisorRole = null;
        //String commandId = null;
        //List<String> whisperCallControlIds = null;
        //ConferenceResource response = api.updateTexmlConference(accountSid, conferenceSid, callControlId, supervisorRole, commandId, whisperCallControlIds);
        // TODO: test validations
    }

    /**
     * Update a conference participant
     *
     * Updates a conference participant
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateTexmlConferenceParticipantTest() throws ApiException {
        //String accountSid = null;
        //String conferenceSid = null;
        //String callSid = null;
        //Boolean muted = null;
        //Boolean hold = null;
        //String holdUrl = null;
        //String holdMethod = null;
        //String announceUrl = null;
        //String announceMethod = null;
        //String waitUrl = null;
        //Boolean beepOnExit = null;
        //Boolean endConferenceOnExit = null;
        //Boolean coaching = null;
        //String callSidToCoach = null;
        //ParticipantResource response = api.updateTexmlConferenceParticipant(accountSid, conferenceSid, callSid, muted, hold, holdUrl, holdMethod, announceUrl, announceMethod, waitUrl, beepOnExit, endConferenceOnExit, coaching, callSidToCoach);
        // TODO: test validations
    }
}
