/*
 * Telnyx API
 * SIP trunking, SMS, MMS, Call Control and Telephony Data Services.
 *
 * OpenAPI spec version: 2.0.0
 * Contact: support@telnyx.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.AnswerRequest;
import io.swagger.client.model.BridgeRequest;
import io.swagger.client.model.CallControlCommandResponse;
import io.swagger.client.model.DialRequest;
import io.swagger.client.model.Errors;
import io.swagger.client.model.GatherUsingAudioRequest;
import io.swagger.client.model.GatherUsingSpeakRequest;
import io.swagger.client.model.HangupRequest;
import io.swagger.client.model.PlayAudioUrlRequest;
import io.swagger.client.model.PlaybackStopRequest;
import io.swagger.client.model.RejectRequest;
import io.swagger.client.model.RetrieveCallStatusResponse;
import io.swagger.client.model.SendDTMFRequest;
import io.swagger.client.model.SpeakRequest;
import io.swagger.client.model.StartForkingRequest;
import io.swagger.client.model.StartRecordingRequest;
import io.swagger.client.model.StopForkingRequest;
import io.swagger.client.model.StopGatherRequest;
import io.swagger.client.model.StopRecordingRequest;
import io.swagger.client.model.TransferCallRequest;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CallCommandsApi
 */
@Ignore
public class CallCommandsApiTest {

    private final CallCommandsApi api = new CallCommandsApi();

    /**
     * Answer call
     *
     * Answer an incoming call. You must issue this command before executing subsequent commands on an incoming call.  **Expected Webhooks:**  - &#x60;call.answered&#x60; 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void callControlAnswerTest() throws ApiException {
        AnswerRequest body = null;
        String callControlId = null;
        CallControlCommandResponse response = api.callControlAnswer(body, callControlId);

        // TODO: test validations
    }
    /**
     * Bridge calls
     *
     * Bridge two call control calls.  **Expected Webhooks:**  - &#x60;call.bridged&#x60; for Leg A - &#x60;call.bridged&#x60; for Leg B 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void callControlBridgeTest() throws ApiException {
        BridgeRequest body = null;
        String callControlId = null;
        CallControlCommandResponse response = api.callControlBridge(body, callControlId);

        // TODO: test validations
    }
    /**
     * Dial
     *
     * Dial a number from a given connection. A successful response will include a &#x60;call_leg_id&#x60; which can be used to correlate the command with subsequent webhooks.  **Expected Webhooks:**  - &#x60;call.initiated&#x60; - &#x60;call.answered&#x60; or &#x60;call.hangup&#x60; - &#x60;call.machine.detection.ended&#x60; if &#x60;answering_machine_detection&#x60; was requested - &#x60;call.machine.greeting.ended&#x60; if &#x60;answering_machine_detection&#x60; was requested to detect the end of machine greeting 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void callControlDialTest() throws ApiException {
        DialRequest body = null;
        RetrieveCallStatusResponse response = api.callControlDial(body);

        // TODO: test validations
    }
    /**
     * Forking start
     *
     * Call forking allows you to stream the media from a call to a specific target in realtime.  This stream can be used to enable realtime audio analysis to support a  variety of use cases, including fraud detection, or the creation of AI-generated audio responses.  Requests must specify either the &#x60;target&#x60; attribute or the &#x60;rx&#x60; and &#x60;tx&#x60; attributes.  **Expected Webhooks:**  - &#x60;call.fork.started&#x60; - &#x60;call.fork.stopped&#x60;  **Simple Telnyx RTP Encapsulation Protocol (STREP)**  *Note: This header/encapsulation is not used when the &#x60;rx&#x60; and &#x60;tx&#x60; parameters have been specified; it only applies when media is forked using the &#x60;target&#x60; attribute.*  If the destination for forked media is specified using the \&quot;target\&quot; attribute, the RTP will be encapsulated in an extra Telnyx protocol, which adds a 24 byte header to the RTP payload in each packet. The STREP header includes the Call Control &#x60;call_leg_id&#x60; for stream identification, along with bits that represent the direction (inbound or outbound) of the media. This 24-byte header sits between the UDP header and the RTP header.  The STREP header makes it possible to fork RTP for multiple calls (or two RTP streams for the same call) to the same IP:port, where the streams can be demultiplexed by your application using the information in the header. Of course, it&#x27;s still possible to ignore this header completely, for example, if sending forked media for different calls to different ports or IP addresses. In this case, simply strip 24 bytes (or use the second byte to find the header length) from the received UDP payload to get the RTP (RTP header and payload).  &#x60;&#x60;&#x60; STREP Specification    0                   1                   2                   3   0 1 2 3 4 5 6 7 8 9 0 1 2 3 4 5 6 7 8 9 0 1 2 3 4 5 6 7 8 9 0 1  +-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+  |1 1|Version|L|D|    HeaderLen  |  reserved (2 bytes)           |  +-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+  |       reserved (4 bytes, for UDP ports or anything else)      |  +-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+  |               The call_leg_id                                 |  |                   from Call Control                           |  |                       (128 bits / 16 bytes)                   |  |                           (this is binary data)               |  +-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+   11    Static bits 11, always set to 11 to easily distinguish forked media    from RTP (10) and T.38 media (usually 00) and SIP (which begins    with a capital letter, so begins with bits 01). This is a magic number.   Version    Four bits to indicate the version number of the protocol, starting at 0001.   L    One bit to represent the leg of the call (A or B).    0 represents the A (first) leg of the call.    1 represents the B (second) leg of the call.   D    One bit to represent the direction of this RTP stream.    0 represents media received by Telnyx.    1 represents media transmitted by Telnyx.   HeaderLen (1 byte)    The length of the header in bytes.    Note that this value does not include the length of the payload. The total    size of the RTP can be calculated by subtracting the HeaderLen from the UDP    length (minus 8 for the UDP header).    In version 1, this value will always be 24.   Reserved (6 bytes)    Reserved for future use and to make sure that the header is a multiple of 32 bits   Call Leg ID    A 128-bit identifier for the call leg.    This is the call_leg_id from Call Control. &#x60;&#x60;&#x60; 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void callControlForkStartTest() throws ApiException {
        StartForkingRequest body = null;
        String callControlId = null;
        CallControlCommandResponse response = api.callControlForkStart(body, callControlId);

        // TODO: test validations
    }
    /**
     * Forking stop
     *
     * Stop forking a call.  **Expected Webhooks:**  - &#x60;call.fork.stopped&#x60; 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void callControlForkStopTest() throws ApiException {
        StopForkingRequest body = null;
        String callControlId = null;
        CallControlCommandResponse response = api.callControlForkStop(body, callControlId);

        // TODO: test validations
    }
    /**
     * Gather stop
     *
     * Stop current gather.  **Expected Webhooks:**  - &#x60;call.gather.ended&#x60; 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void callControlGatherStopTest() throws ApiException {
        StopGatherRequest body = null;
        String callControlId = null;
        CallControlCommandResponse response = api.callControlGatherStop(body, callControlId);

        // TODO: test validations
    }
    /**
     * Gather using audio
     *
     * Play an audio file on the call until the required DTMF signals are gathered to build interactive menus.  You can pass a list of valid digits along with an &#x27;invalid_audio_url&#x27;, which will be played back at the beginning of each prompt. Playback will be interrupted when a DTMF signal is received. The [Answer](/docs/api/v2/call-control/Call-Commands#CallControlAnswer) command must be issued before the &#x60;gather_using_audio&#x60; command.  **Expected Webhooks:**  - &#x60;call.playback.started&#x60; - &#x60;call.playback.ended&#x60; - &#x60;call.dtmf.received&#x60; (you may receive many of these webhooks) - &#x60;call.gather.ended&#x60; 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void callControlGatherUsingAudioTest() throws ApiException {
        GatherUsingAudioRequest body = null;
        String callControlId = null;
        CallControlCommandResponse response = api.callControlGatherUsingAudio(body, callControlId);

        // TODO: test validations
    }
    /**
     * Gather using speak
     *
     * Convert text to speech and play it on the call until the required DTMF signals are gathered to build interactive menus.  You can pass a list of valid digits along with an &#x27;invalid_payload&#x27;, which will be played back at the beginning of each prompt. Speech will be interrupted when a DTMF signal is received. The [Answer](/docs/api/v2/call-control/Call-Commands#CallControlAnswer) command must be issued before the &#x60;gather_using_speak&#x60; command.  **Expected Webhooks:**  - &#x60;call.dtmf.received&#x60; (you may receive many of these webhooks) - &#x60;call.gather.ended&#x60; 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void callControlGatherUsingSpeakTest() throws ApiException {
        GatherUsingSpeakRequest body = null;
        String callControlId = null;
        CallControlCommandResponse response = api.callControlGatherUsingSpeak(body, callControlId);

        // TODO: test validations
    }
    /**
     * Hangup call
     *
     * Hang up the call.  **Expected Webhooks:**  - &#x60;call.hangup&#x60; - &#x60;call.recording.saved&#x60; 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void callControlHangupTest() throws ApiException {
        HangupRequest body = null;
        String callControlId = null;
        CallControlCommandResponse response = api.callControlHangup(body, callControlId);

        // TODO: test validations
    }
    /**
     * Play audio URL
     *
     * Play an audio file on the call. If multiple play audio commands are issued consecutively, the audio files will be placed in a queue awaiting playback.  *Notes:*  - When &#x60;overlay&#x60; is enabled, &#x60;loop&#x60; is limited to 1, and &#x60;target_legs&#x60; is limited to &#x60;self&#x60;. - A customer cannot Play Audio with &#x60;overlay&#x3D;true&#x60; unless there is a Play Audio with &#x60;overlay&#x3D;false&#x60; actively playing.  **Expected Webhooks:**  - &#x60;call.playback.started&#x60; - &#x60;call.playback.ended&#x60; 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void callControlPlaybackStartTest() throws ApiException {
        PlayAudioUrlRequest body = null;
        String callControlId = null;
        CallControlCommandResponse response = api.callControlPlaybackStart(body, callControlId);

        // TODO: test validations
    }
    /**
     * Stop audio playback
     *
     * Stop audio being played on the call.  **Expected Webhooks:**  - &#x60;call.playback.ended&#x60; or &#x60;call.speak.ended&#x60; 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void callControlPlaybackStopTest() throws ApiException {
        PlaybackStopRequest body = null;
        String callControlId = null;
        CallControlCommandResponse response = api.callControlPlaybackStop(body, callControlId);

        // TODO: test validations
    }
    /**
     * Recording start
     *
     * Start recording the call. Recording will stop on call hang-up, or can be initiated via the Stop Recording command.  **Expected Webhooks:**  - &#x60;call.recording.saved&#x60; 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void callControlRecordStartTest() throws ApiException {
        StartRecordingRequest body = null;
        String callControlId = null;
        CallControlCommandResponse response = api.callControlRecordStart(body, callControlId);

        // TODO: test validations
    }
    /**
     * Recording stop
     *
     * Stop recording the call.  **Expected Webhooks:**  - &#x60;call.recording.saved&#x60; 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void callControlRecordStopTest() throws ApiException {
        StopRecordingRequest body = null;
        String callControlId = null;
        CallControlCommandResponse response = api.callControlRecordStop(body, callControlId);

        // TODO: test validations
    }
    /**
     * Reject call
     *
     * Reject an incoming call.  **Expected Webhooks:**  - &#x60;call.hangup&#x60; 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void callControlRejectTest() throws ApiException {
        RejectRequest body = null;
        String callControlId = null;
        CallControlCommandResponse response = api.callControlReject(body, callControlId);

        // TODO: test validations
    }
    /**
     * Send DTMF
     *
     * Sends DTMF tones from this leg. DTMF tones will be heard by the other end of the call.  **Expected Webhooks:**  There are no webhooks associated with this command. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void callControlSendDTMFTest() throws ApiException {
        SendDTMFRequest body = null;
        String callControlId = null;
        CallControlCommandResponse response = api.callControlSendDTMF(body, callControlId);

        // TODO: test validations
    }
    /**
     * Speak text
     *
     * Convert text to speech and play it back on the call. If multiple speak text commands are issued consecutively, the audio files will be placed in a queue awaiting playback.  **Expected Webhooks:**  - &#x60;call.speak.started&#x60; - &#x60;call.speak.ended&#x60; 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void callControlSpeakTest() throws ApiException {
        SpeakRequest body = null;
        String callControlId = null;
        CallControlCommandResponse response = api.callControlSpeak(body, callControlId);

        // TODO: test validations
    }
    /**
     * Transfer call
     *
     * Transfer a call to a new destination. If the transfer is unsuccessful, a &#x60;call.hangup&#x60; webhook will be sent indicating that the transfer could not be completed. The original call will remain active and may be issued additional commands, potentially transfering the call to an alternate destination.  **Expected Webhooks:**  - &#x60;call.initiated&#x60; - &#x60;call.bridged&#x60; to Leg B - &#x60;call.answered&#x60; or &#x60;call.hangup&#x60; - &#x60;call.machine.detection.ended&#x60; if &#x60;answering_machine_detection&#x60; was requested - &#x60;call.machine.greeting.ended&#x60; if &#x60;answering_machine_detection&#x60; was requested to detect the end of machine greeting 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void callControlTransferTest() throws ApiException {
        TransferCallRequest body = null;
        String callControlId = null;
        CallControlCommandResponse response = api.callControlTransfer(body, callControlId);

        // TODO: test validations
    }
}