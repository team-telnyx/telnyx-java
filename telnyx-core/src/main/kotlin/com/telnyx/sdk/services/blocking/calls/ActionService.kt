// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.calls

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.calls.actions.ActionAddAiAssistantMessagesParams
import com.telnyx.sdk.models.calls.actions.ActionAddAiAssistantMessagesResponse
import com.telnyx.sdk.models.calls.actions.ActionAnswerParams
import com.telnyx.sdk.models.calls.actions.ActionAnswerResponse
import com.telnyx.sdk.models.calls.actions.ActionBridgeParams
import com.telnyx.sdk.models.calls.actions.ActionBridgeResponse
import com.telnyx.sdk.models.calls.actions.ActionEnqueueParams
import com.telnyx.sdk.models.calls.actions.ActionEnqueueResponse
import com.telnyx.sdk.models.calls.actions.ActionGatherParams
import com.telnyx.sdk.models.calls.actions.ActionGatherResponse
import com.telnyx.sdk.models.calls.actions.ActionGatherUsingAiParams
import com.telnyx.sdk.models.calls.actions.ActionGatherUsingAiResponse
import com.telnyx.sdk.models.calls.actions.ActionGatherUsingAudioParams
import com.telnyx.sdk.models.calls.actions.ActionGatherUsingAudioResponse
import com.telnyx.sdk.models.calls.actions.ActionGatherUsingSpeakParams
import com.telnyx.sdk.models.calls.actions.ActionGatherUsingSpeakResponse
import com.telnyx.sdk.models.calls.actions.ActionHangupParams
import com.telnyx.sdk.models.calls.actions.ActionHangupResponse
import com.telnyx.sdk.models.calls.actions.ActionLeaveQueueParams
import com.telnyx.sdk.models.calls.actions.ActionLeaveQueueResponse
import com.telnyx.sdk.models.calls.actions.ActionPauseRecordingParams
import com.telnyx.sdk.models.calls.actions.ActionPauseRecordingResponse
import com.telnyx.sdk.models.calls.actions.ActionReferParams
import com.telnyx.sdk.models.calls.actions.ActionReferResponse
import com.telnyx.sdk.models.calls.actions.ActionRejectParams
import com.telnyx.sdk.models.calls.actions.ActionRejectResponse
import com.telnyx.sdk.models.calls.actions.ActionResumeRecordingParams
import com.telnyx.sdk.models.calls.actions.ActionResumeRecordingResponse
import com.telnyx.sdk.models.calls.actions.ActionSendDtmfParams
import com.telnyx.sdk.models.calls.actions.ActionSendDtmfResponse
import com.telnyx.sdk.models.calls.actions.ActionSendSipInfoParams
import com.telnyx.sdk.models.calls.actions.ActionSendSipInfoResponse
import com.telnyx.sdk.models.calls.actions.ActionSpeakParams
import com.telnyx.sdk.models.calls.actions.ActionSpeakResponse
import com.telnyx.sdk.models.calls.actions.ActionStartAiAssistantParams
import com.telnyx.sdk.models.calls.actions.ActionStartAiAssistantResponse
import com.telnyx.sdk.models.calls.actions.ActionStartForkingParams
import com.telnyx.sdk.models.calls.actions.ActionStartForkingResponse
import com.telnyx.sdk.models.calls.actions.ActionStartNoiseSuppressionParams
import com.telnyx.sdk.models.calls.actions.ActionStartNoiseSuppressionResponse
import com.telnyx.sdk.models.calls.actions.ActionStartPlaybackParams
import com.telnyx.sdk.models.calls.actions.ActionStartPlaybackResponse
import com.telnyx.sdk.models.calls.actions.ActionStartRecordingParams
import com.telnyx.sdk.models.calls.actions.ActionStartRecordingResponse
import com.telnyx.sdk.models.calls.actions.ActionStartSiprecParams
import com.telnyx.sdk.models.calls.actions.ActionStartSiprecResponse
import com.telnyx.sdk.models.calls.actions.ActionStartStreamingParams
import com.telnyx.sdk.models.calls.actions.ActionStartStreamingResponse
import com.telnyx.sdk.models.calls.actions.ActionStartTranscriptionParams
import com.telnyx.sdk.models.calls.actions.ActionStartTranscriptionResponse
import com.telnyx.sdk.models.calls.actions.ActionStopAiAssistantParams
import com.telnyx.sdk.models.calls.actions.ActionStopAiAssistantResponse
import com.telnyx.sdk.models.calls.actions.ActionStopForkingParams
import com.telnyx.sdk.models.calls.actions.ActionStopForkingResponse
import com.telnyx.sdk.models.calls.actions.ActionStopGatherParams
import com.telnyx.sdk.models.calls.actions.ActionStopGatherResponse
import com.telnyx.sdk.models.calls.actions.ActionStopNoiseSuppressionParams
import com.telnyx.sdk.models.calls.actions.ActionStopNoiseSuppressionResponse
import com.telnyx.sdk.models.calls.actions.ActionStopPlaybackParams
import com.telnyx.sdk.models.calls.actions.ActionStopPlaybackResponse
import com.telnyx.sdk.models.calls.actions.ActionStopRecordingParams
import com.telnyx.sdk.models.calls.actions.ActionStopRecordingResponse
import com.telnyx.sdk.models.calls.actions.ActionStopSiprecParams
import com.telnyx.sdk.models.calls.actions.ActionStopSiprecResponse
import com.telnyx.sdk.models.calls.actions.ActionStopStreamingParams
import com.telnyx.sdk.models.calls.actions.ActionStopStreamingResponse
import com.telnyx.sdk.models.calls.actions.ActionStopTranscriptionParams
import com.telnyx.sdk.models.calls.actions.ActionStopTranscriptionResponse
import com.telnyx.sdk.models.calls.actions.ActionSwitchSupervisorRoleParams
import com.telnyx.sdk.models.calls.actions.ActionSwitchSupervisorRoleResponse
import com.telnyx.sdk.models.calls.actions.ActionTransferParams
import com.telnyx.sdk.models.calls.actions.ActionTransferResponse
import com.telnyx.sdk.models.calls.actions.ActionUpdateClientStateParams
import com.telnyx.sdk.models.calls.actions.ActionUpdateClientStateResponse
import java.util.function.Consumer

interface ActionService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ActionService

    /** Add messages to the conversation started by an AI assistant on the call. */
    fun addAiAssistantMessages(callControlId: String): ActionAddAiAssistantMessagesResponse =
        addAiAssistantMessages(callControlId, ActionAddAiAssistantMessagesParams.none())

    /** @see addAiAssistantMessages */
    fun addAiAssistantMessages(
        callControlId: String,
        params: ActionAddAiAssistantMessagesParams = ActionAddAiAssistantMessagesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActionAddAiAssistantMessagesResponse =
        addAiAssistantMessages(
            params.toBuilder().callControlId(callControlId).build(),
            requestOptions,
        )

    /** @see addAiAssistantMessages */
    fun addAiAssistantMessages(
        callControlId: String,
        params: ActionAddAiAssistantMessagesParams = ActionAddAiAssistantMessagesParams.none(),
    ): ActionAddAiAssistantMessagesResponse =
        addAiAssistantMessages(callControlId, params, RequestOptions.none())

    /** @see addAiAssistantMessages */
    fun addAiAssistantMessages(
        params: ActionAddAiAssistantMessagesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActionAddAiAssistantMessagesResponse

    /** @see addAiAssistantMessages */
    fun addAiAssistantMessages(
        params: ActionAddAiAssistantMessagesParams
    ): ActionAddAiAssistantMessagesResponse = addAiAssistantMessages(params, RequestOptions.none())

    /** @see addAiAssistantMessages */
    fun addAiAssistantMessages(
        callControlId: String,
        requestOptions: RequestOptions,
    ): ActionAddAiAssistantMessagesResponse =
        addAiAssistantMessages(
            callControlId,
            ActionAddAiAssistantMessagesParams.none(),
            requestOptions,
        )

    /**
     * Answer an incoming call. You must issue this command before executing subsequent commands on
     * an incoming call.
     *
     * **Expected Webhooks:**
     * - `call.answered`
     * - `streaming.started`, `streaming.stopped` or `streaming.failed` if `stream_url` was set
     *
     * When the `record` parameter is set to `record-from-answer`, the response will include a
     * `recording_id` field.
     */
    fun answer(callControlId: String): ActionAnswerResponse =
        answer(callControlId, ActionAnswerParams.none())

    /** @see answer */
    fun answer(
        callControlId: String,
        params: ActionAnswerParams = ActionAnswerParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActionAnswerResponse =
        answer(params.toBuilder().callControlId(callControlId).build(), requestOptions)

    /** @see answer */
    fun answer(
        callControlId: String,
        params: ActionAnswerParams = ActionAnswerParams.none(),
    ): ActionAnswerResponse = answer(callControlId, params, RequestOptions.none())

    /** @see answer */
    fun answer(
        params: ActionAnswerParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActionAnswerResponse

    /** @see answer */
    fun answer(params: ActionAnswerParams): ActionAnswerResponse =
        answer(params, RequestOptions.none())

    /** @see answer */
    fun answer(callControlId: String, requestOptions: RequestOptions): ActionAnswerResponse =
        answer(callControlId, ActionAnswerParams.none(), requestOptions)

    /**
     * Bridge two call control calls.
     *
     * **Expected Webhooks:**
     * - `call.bridged` for Leg A
     * - `call.bridged` for Leg B
     */
    fun bridge(callControlIdToBridge: String, params: ActionBridgeParams): ActionBridgeResponse =
        bridge(callControlIdToBridge, params, RequestOptions.none())

    /** @see bridge */
    fun bridge(
        callControlIdToBridge: String,
        params: ActionBridgeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActionBridgeResponse =
        bridge(
            params.toBuilder().callControlIdToBridge(callControlIdToBridge).build(),
            requestOptions,
        )

    /** @see bridge */
    fun bridge(params: ActionBridgeParams): ActionBridgeResponse =
        bridge(params, RequestOptions.none())

    /** @see bridge */
    fun bridge(
        params: ActionBridgeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActionBridgeResponse

    /** Put the call in a queue. */
    fun enqueue(callControlId: String, params: ActionEnqueueParams): ActionEnqueueResponse =
        enqueue(callControlId, params, RequestOptions.none())

    /** @see enqueue */
    fun enqueue(
        callControlId: String,
        params: ActionEnqueueParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActionEnqueueResponse =
        enqueue(params.toBuilder().callControlId(callControlId).build(), requestOptions)

    /** @see enqueue */
    fun enqueue(params: ActionEnqueueParams): ActionEnqueueResponse =
        enqueue(params, RequestOptions.none())

    /** @see enqueue */
    fun enqueue(
        params: ActionEnqueueParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActionEnqueueResponse

    /**
     * Gather DTMF signals to build interactive menus.
     *
     * You can pass a list of valid digits. The `Answer` command must be issued before the `gather`
     * command.
     *
     * **Expected Webhooks:**
     * - `call.dtmf.received` (you may receive many of these webhooks)
     * - `call.gather.ended`
     */
    fun gather(callControlId: String): ActionGatherResponse =
        gather(callControlId, ActionGatherParams.none())

    /** @see gather */
    fun gather(
        callControlId: String,
        params: ActionGatherParams = ActionGatherParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActionGatherResponse =
        gather(params.toBuilder().callControlId(callControlId).build(), requestOptions)

    /** @see gather */
    fun gather(
        callControlId: String,
        params: ActionGatherParams = ActionGatherParams.none(),
    ): ActionGatherResponse = gather(callControlId, params, RequestOptions.none())

    /** @see gather */
    fun gather(
        params: ActionGatherParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActionGatherResponse

    /** @see gather */
    fun gather(params: ActionGatherParams): ActionGatherResponse =
        gather(params, RequestOptions.none())

    /** @see gather */
    fun gather(callControlId: String, requestOptions: RequestOptions): ActionGatherResponse =
        gather(callControlId, ActionGatherParams.none(), requestOptions)

    /**
     * Gather parameters defined in the request payload using a voice assistant.
     *
     * You can pass parameters described as a JSON Schema object and the voice assistant will
     * attempt to gather these informations.
     *
     * **Expected Webhooks:**
     * - `call.ai_gather.ended`
     * - `call.conversation.ended`
     * - `call.ai_gather.partial_results` (if `send_partial_results` is set to `true`)
     * - `call.ai_gather.message_history_updated` (if `send_message_history_updates` is set to
     *   `true`)
     */
    fun gatherUsingAi(
        callControlId: String,
        params: ActionGatherUsingAiParams,
    ): ActionGatherUsingAiResponse = gatherUsingAi(callControlId, params, RequestOptions.none())

    /** @see gatherUsingAi */
    fun gatherUsingAi(
        callControlId: String,
        params: ActionGatherUsingAiParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActionGatherUsingAiResponse =
        gatherUsingAi(params.toBuilder().callControlId(callControlId).build(), requestOptions)

    /** @see gatherUsingAi */
    fun gatherUsingAi(params: ActionGatherUsingAiParams): ActionGatherUsingAiResponse =
        gatherUsingAi(params, RequestOptions.none())

    /** @see gatherUsingAi */
    fun gatherUsingAi(
        params: ActionGatherUsingAiParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActionGatherUsingAiResponse

    /**
     * Play an audio file on the call until the required DTMF signals are gathered to build
     * interactive menus.
     *
     * You can pass a list of valid digits along with an 'invalid_audio_url', which will be played
     * back at the beginning of each prompt. Playback will be interrupted when a DTMF signal is
     * received. The `Answer command must be issued before the `gather_using_audio` command.
     *
     * **Expected Webhooks:**
     * - `call.playback.started`
     * - `call.playback.ended`
     * - `call.dtmf.received` (you may receive many of these webhooks)
     * - `call.gather.ended`
     */
    fun gatherUsingAudio(callControlId: String): ActionGatherUsingAudioResponse =
        gatherUsingAudio(callControlId, ActionGatherUsingAudioParams.none())

    /** @see gatherUsingAudio */
    fun gatherUsingAudio(
        callControlId: String,
        params: ActionGatherUsingAudioParams = ActionGatherUsingAudioParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActionGatherUsingAudioResponse =
        gatherUsingAudio(params.toBuilder().callControlId(callControlId).build(), requestOptions)

    /** @see gatherUsingAudio */
    fun gatherUsingAudio(
        callControlId: String,
        params: ActionGatherUsingAudioParams = ActionGatherUsingAudioParams.none(),
    ): ActionGatherUsingAudioResponse =
        gatherUsingAudio(callControlId, params, RequestOptions.none())

    /** @see gatherUsingAudio */
    fun gatherUsingAudio(
        params: ActionGatherUsingAudioParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActionGatherUsingAudioResponse

    /** @see gatherUsingAudio */
    fun gatherUsingAudio(params: ActionGatherUsingAudioParams): ActionGatherUsingAudioResponse =
        gatherUsingAudio(params, RequestOptions.none())

    /** @see gatherUsingAudio */
    fun gatherUsingAudio(
        callControlId: String,
        requestOptions: RequestOptions,
    ): ActionGatherUsingAudioResponse =
        gatherUsingAudio(callControlId, ActionGatherUsingAudioParams.none(), requestOptions)

    /**
     * Convert text to speech and play it on the call until the required DTMF signals are gathered
     * to build interactive menus.
     *
     * You can pass a list of valid digits along with an 'invalid_payload', which will be played
     * back at the beginning of each prompt. Speech will be interrupted when a DTMF signal is
     * received. The `Answer` command must be issued before the `gather_using_speak` command.
     *
     * **Expected Webhooks:**
     * - `call.dtmf.received` (you may receive many of these webhooks)
     * - `call.gather.ended`
     */
    fun gatherUsingSpeak(
        callControlId: String,
        params: ActionGatherUsingSpeakParams,
    ): ActionGatherUsingSpeakResponse =
        gatherUsingSpeak(callControlId, params, RequestOptions.none())

    /** @see gatherUsingSpeak */
    fun gatherUsingSpeak(
        callControlId: String,
        params: ActionGatherUsingSpeakParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActionGatherUsingSpeakResponse =
        gatherUsingSpeak(params.toBuilder().callControlId(callControlId).build(), requestOptions)

    /** @see gatherUsingSpeak */
    fun gatherUsingSpeak(params: ActionGatherUsingSpeakParams): ActionGatherUsingSpeakResponse =
        gatherUsingSpeak(params, RequestOptions.none())

    /** @see gatherUsingSpeak */
    fun gatherUsingSpeak(
        params: ActionGatherUsingSpeakParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActionGatherUsingSpeakResponse

    /**
     * Hang up the call.
     *
     * **Expected Webhooks:**
     * - `call.hangup`
     * - `call.recording.saved`
     */
    fun hangup(callControlId: String): ActionHangupResponse =
        hangup(callControlId, ActionHangupParams.none())

    /** @see hangup */
    fun hangup(
        callControlId: String,
        params: ActionHangupParams = ActionHangupParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActionHangupResponse =
        hangup(params.toBuilder().callControlId(callControlId).build(), requestOptions)

    /** @see hangup */
    fun hangup(
        callControlId: String,
        params: ActionHangupParams = ActionHangupParams.none(),
    ): ActionHangupResponse = hangup(callControlId, params, RequestOptions.none())

    /** @see hangup */
    fun hangup(
        params: ActionHangupParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActionHangupResponse

    /** @see hangup */
    fun hangup(params: ActionHangupParams): ActionHangupResponse =
        hangup(params, RequestOptions.none())

    /** @see hangup */
    fun hangup(callControlId: String, requestOptions: RequestOptions): ActionHangupResponse =
        hangup(callControlId, ActionHangupParams.none(), requestOptions)

    /** Removes the call from a queue. */
    fun leaveQueue(callControlId: String): ActionLeaveQueueResponse =
        leaveQueue(callControlId, ActionLeaveQueueParams.none())

    /** @see leaveQueue */
    fun leaveQueue(
        callControlId: String,
        params: ActionLeaveQueueParams = ActionLeaveQueueParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActionLeaveQueueResponse =
        leaveQueue(params.toBuilder().callControlId(callControlId).build(), requestOptions)

    /** @see leaveQueue */
    fun leaveQueue(
        callControlId: String,
        params: ActionLeaveQueueParams = ActionLeaveQueueParams.none(),
    ): ActionLeaveQueueResponse = leaveQueue(callControlId, params, RequestOptions.none())

    /** @see leaveQueue */
    fun leaveQueue(
        params: ActionLeaveQueueParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActionLeaveQueueResponse

    /** @see leaveQueue */
    fun leaveQueue(params: ActionLeaveQueueParams): ActionLeaveQueueResponse =
        leaveQueue(params, RequestOptions.none())

    /** @see leaveQueue */
    fun leaveQueue(
        callControlId: String,
        requestOptions: RequestOptions,
    ): ActionLeaveQueueResponse =
        leaveQueue(callControlId, ActionLeaveQueueParams.none(), requestOptions)

    /**
     * Pause recording the call. Recording can be resumed via Resume recording command.
     *
     * **Expected Webhooks:**
     *
     * There are no webhooks associated with this command.
     */
    fun pauseRecording(callControlId: String): ActionPauseRecordingResponse =
        pauseRecording(callControlId, ActionPauseRecordingParams.none())

    /** @see pauseRecording */
    fun pauseRecording(
        callControlId: String,
        params: ActionPauseRecordingParams = ActionPauseRecordingParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActionPauseRecordingResponse =
        pauseRecording(params.toBuilder().callControlId(callControlId).build(), requestOptions)

    /** @see pauseRecording */
    fun pauseRecording(
        callControlId: String,
        params: ActionPauseRecordingParams = ActionPauseRecordingParams.none(),
    ): ActionPauseRecordingResponse = pauseRecording(callControlId, params, RequestOptions.none())

    /** @see pauseRecording */
    fun pauseRecording(
        params: ActionPauseRecordingParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActionPauseRecordingResponse

    /** @see pauseRecording */
    fun pauseRecording(params: ActionPauseRecordingParams): ActionPauseRecordingResponse =
        pauseRecording(params, RequestOptions.none())

    /** @see pauseRecording */
    fun pauseRecording(
        callControlId: String,
        requestOptions: RequestOptions,
    ): ActionPauseRecordingResponse =
        pauseRecording(callControlId, ActionPauseRecordingParams.none(), requestOptions)

    /**
     * Initiate a SIP Refer on a Call Control call. You can initiate a SIP Refer at any point in the
     * duration of a call.
     *
     * **Expected Webhooks:**
     * - `call.refer.started`
     * - `call.refer.completed`
     * - `call.refer.failed`
     */
    fun refer(callControlId: String, params: ActionReferParams): ActionReferResponse =
        refer(callControlId, params, RequestOptions.none())

    /** @see refer */
    fun refer(
        callControlId: String,
        params: ActionReferParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActionReferResponse =
        refer(params.toBuilder().callControlId(callControlId).build(), requestOptions)

    /** @see refer */
    fun refer(params: ActionReferParams): ActionReferResponse = refer(params, RequestOptions.none())

    /** @see refer */
    fun refer(
        params: ActionReferParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActionReferResponse

    /**
     * Reject an incoming call.
     *
     * **Expected Webhooks:**
     * - `call.hangup`
     */
    fun reject(callControlId: String, params: ActionRejectParams): ActionRejectResponse =
        reject(callControlId, params, RequestOptions.none())

    /** @see reject */
    fun reject(
        callControlId: String,
        params: ActionRejectParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActionRejectResponse =
        reject(params.toBuilder().callControlId(callControlId).build(), requestOptions)

    /** @see reject */
    fun reject(params: ActionRejectParams): ActionRejectResponse =
        reject(params, RequestOptions.none())

    /** @see reject */
    fun reject(
        params: ActionRejectParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActionRejectResponse

    /**
     * Resume recording the call.
     *
     * **Expected Webhooks:**
     *
     * There are no webhooks associated with this command.
     */
    fun resumeRecording(callControlId: String): ActionResumeRecordingResponse =
        resumeRecording(callControlId, ActionResumeRecordingParams.none())

    /** @see resumeRecording */
    fun resumeRecording(
        callControlId: String,
        params: ActionResumeRecordingParams = ActionResumeRecordingParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActionResumeRecordingResponse =
        resumeRecording(params.toBuilder().callControlId(callControlId).build(), requestOptions)

    /** @see resumeRecording */
    fun resumeRecording(
        callControlId: String,
        params: ActionResumeRecordingParams = ActionResumeRecordingParams.none(),
    ): ActionResumeRecordingResponse = resumeRecording(callControlId, params, RequestOptions.none())

    /** @see resumeRecording */
    fun resumeRecording(
        params: ActionResumeRecordingParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActionResumeRecordingResponse

    /** @see resumeRecording */
    fun resumeRecording(params: ActionResumeRecordingParams): ActionResumeRecordingResponse =
        resumeRecording(params, RequestOptions.none())

    /** @see resumeRecording */
    fun resumeRecording(
        callControlId: String,
        requestOptions: RequestOptions,
    ): ActionResumeRecordingResponse =
        resumeRecording(callControlId, ActionResumeRecordingParams.none(), requestOptions)

    /**
     * Sends DTMF tones from this leg. DTMF tones will be heard by the other end of the call.
     *
     * **Expected Webhooks:**
     *
     * There are no webhooks associated with this command.
     */
    fun sendDtmf(callControlId: String, params: ActionSendDtmfParams): ActionSendDtmfResponse =
        sendDtmf(callControlId, params, RequestOptions.none())

    /** @see sendDtmf */
    fun sendDtmf(
        callControlId: String,
        params: ActionSendDtmfParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActionSendDtmfResponse =
        sendDtmf(params.toBuilder().callControlId(callControlId).build(), requestOptions)

    /** @see sendDtmf */
    fun sendDtmf(params: ActionSendDtmfParams): ActionSendDtmfResponse =
        sendDtmf(params, RequestOptions.none())

    /** @see sendDtmf */
    fun sendDtmf(
        params: ActionSendDtmfParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActionSendDtmfResponse

    /**
     * Sends SIP info from this leg.
     *
     * **Expected Webhooks:**
     * - `call.sip_info.received` (to be received on the target call leg)
     */
    fun sendSipInfo(
        callControlId: String,
        params: ActionSendSipInfoParams,
    ): ActionSendSipInfoResponse = sendSipInfo(callControlId, params, RequestOptions.none())

    /** @see sendSipInfo */
    fun sendSipInfo(
        callControlId: String,
        params: ActionSendSipInfoParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActionSendSipInfoResponse =
        sendSipInfo(params.toBuilder().callControlId(callControlId).build(), requestOptions)

    /** @see sendSipInfo */
    fun sendSipInfo(params: ActionSendSipInfoParams): ActionSendSipInfoResponse =
        sendSipInfo(params, RequestOptions.none())

    /** @see sendSipInfo */
    fun sendSipInfo(
        params: ActionSendSipInfoParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActionSendSipInfoResponse

    /**
     * Convert text to speech and play it back on the call. If multiple speak text commands are
     * issued consecutively, the audio files will be placed in a queue awaiting playback.
     *
     * **Expected Webhooks:**
     * - `call.speak.started`
     * - `call.speak.ended`
     */
    fun speak(callControlId: String, params: ActionSpeakParams): ActionSpeakResponse =
        speak(callControlId, params, RequestOptions.none())

    /** @see speak */
    fun speak(
        callControlId: String,
        params: ActionSpeakParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActionSpeakResponse =
        speak(params.toBuilder().callControlId(callControlId).build(), requestOptions)

    /** @see speak */
    fun speak(params: ActionSpeakParams): ActionSpeakResponse = speak(params, RequestOptions.none())

    /** @see speak */
    fun speak(
        params: ActionSpeakParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActionSpeakResponse

    /**
     * Start an AI assistant on the call.
     *
     * **Expected Webhooks:**
     * - `call.conversation.ended`
     * - `call.conversation_insights.generated`
     */
    fun startAiAssistant(callControlId: String): ActionStartAiAssistantResponse =
        startAiAssistant(callControlId, ActionStartAiAssistantParams.none())

    /** @see startAiAssistant */
    fun startAiAssistant(
        callControlId: String,
        params: ActionStartAiAssistantParams = ActionStartAiAssistantParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActionStartAiAssistantResponse =
        startAiAssistant(params.toBuilder().callControlId(callControlId).build(), requestOptions)

    /** @see startAiAssistant */
    fun startAiAssistant(
        callControlId: String,
        params: ActionStartAiAssistantParams = ActionStartAiAssistantParams.none(),
    ): ActionStartAiAssistantResponse =
        startAiAssistant(callControlId, params, RequestOptions.none())

    /** @see startAiAssistant */
    fun startAiAssistant(
        params: ActionStartAiAssistantParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActionStartAiAssistantResponse

    /** @see startAiAssistant */
    fun startAiAssistant(params: ActionStartAiAssistantParams): ActionStartAiAssistantResponse =
        startAiAssistant(params, RequestOptions.none())

    /** @see startAiAssistant */
    fun startAiAssistant(
        callControlId: String,
        requestOptions: RequestOptions,
    ): ActionStartAiAssistantResponse =
        startAiAssistant(callControlId, ActionStartAiAssistantParams.none(), requestOptions)

    /**
     * Call forking allows you to stream the media from a call to a specific target in realtime.
     * This stream can be used to enable realtime audio analysis to support a variety of use cases,
     * including fraud detection, or the creation of AI-generated audio responses. Requests must
     * specify either the `target` attribute or the `rx` and `tx` attributes.
     *
     * **Expected Webhooks:**
     * - `call.fork.started`
     * - `call.fork.stopped`
     */
    fun startForking(callControlId: String): ActionStartForkingResponse =
        startForking(callControlId, ActionStartForkingParams.none())

    /** @see startForking */
    fun startForking(
        callControlId: String,
        params: ActionStartForkingParams = ActionStartForkingParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActionStartForkingResponse =
        startForking(params.toBuilder().callControlId(callControlId).build(), requestOptions)

    /** @see startForking */
    fun startForking(
        callControlId: String,
        params: ActionStartForkingParams = ActionStartForkingParams.none(),
    ): ActionStartForkingResponse = startForking(callControlId, params, RequestOptions.none())

    /** @see startForking */
    fun startForking(
        params: ActionStartForkingParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActionStartForkingResponse

    /** @see startForking */
    fun startForking(params: ActionStartForkingParams): ActionStartForkingResponse =
        startForking(params, RequestOptions.none())

    /** @see startForking */
    fun startForking(
        callControlId: String,
        requestOptions: RequestOptions,
    ): ActionStartForkingResponse =
        startForking(callControlId, ActionStartForkingParams.none(), requestOptions)

    /** Noise Suppression Start (BETA) */
    fun startNoiseSuppression(callControlId: String): ActionStartNoiseSuppressionResponse =
        startNoiseSuppression(callControlId, ActionStartNoiseSuppressionParams.none())

    /** @see startNoiseSuppression */
    fun startNoiseSuppression(
        callControlId: String,
        params: ActionStartNoiseSuppressionParams = ActionStartNoiseSuppressionParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActionStartNoiseSuppressionResponse =
        startNoiseSuppression(
            params.toBuilder().callControlId(callControlId).build(),
            requestOptions,
        )

    /** @see startNoiseSuppression */
    fun startNoiseSuppression(
        callControlId: String,
        params: ActionStartNoiseSuppressionParams = ActionStartNoiseSuppressionParams.none(),
    ): ActionStartNoiseSuppressionResponse =
        startNoiseSuppression(callControlId, params, RequestOptions.none())

    /** @see startNoiseSuppression */
    fun startNoiseSuppression(
        params: ActionStartNoiseSuppressionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActionStartNoiseSuppressionResponse

    /** @see startNoiseSuppression */
    fun startNoiseSuppression(
        params: ActionStartNoiseSuppressionParams
    ): ActionStartNoiseSuppressionResponse = startNoiseSuppression(params, RequestOptions.none())

    /** @see startNoiseSuppression */
    fun startNoiseSuppression(
        callControlId: String,
        requestOptions: RequestOptions,
    ): ActionStartNoiseSuppressionResponse =
        startNoiseSuppression(
            callControlId,
            ActionStartNoiseSuppressionParams.none(),
            requestOptions,
        )

    /**
     * Play an audio file on the call. If multiple play audio commands are issued consecutively, the
     * audio files will be placed in a queue awaiting playback.
     *
     * *Notes:*
     * - When `overlay` is enabled, `target_legs` is limited to `self`.
     * - A customer cannot Play Audio with `overlay=true` unless there is a Play Audio with
     *   `overlay=false` actively playing.
     *
     * **Expected Webhooks:**
     * - `call.playback.started`
     * - `call.playback.ended`
     */
    fun startPlayback(callControlId: String): ActionStartPlaybackResponse =
        startPlayback(callControlId, ActionStartPlaybackParams.none())

    /** @see startPlayback */
    fun startPlayback(
        callControlId: String,
        params: ActionStartPlaybackParams = ActionStartPlaybackParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActionStartPlaybackResponse =
        startPlayback(params.toBuilder().callControlId(callControlId).build(), requestOptions)

    /** @see startPlayback */
    fun startPlayback(
        callControlId: String,
        params: ActionStartPlaybackParams = ActionStartPlaybackParams.none(),
    ): ActionStartPlaybackResponse = startPlayback(callControlId, params, RequestOptions.none())

    /** @see startPlayback */
    fun startPlayback(
        params: ActionStartPlaybackParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActionStartPlaybackResponse

    /** @see startPlayback */
    fun startPlayback(params: ActionStartPlaybackParams): ActionStartPlaybackResponse =
        startPlayback(params, RequestOptions.none())

    /** @see startPlayback */
    fun startPlayback(
        callControlId: String,
        requestOptions: RequestOptions,
    ): ActionStartPlaybackResponse =
        startPlayback(callControlId, ActionStartPlaybackParams.none(), requestOptions)

    /**
     * Start recording the call. Recording will stop on call hang-up, or can be initiated via the
     * Stop Recording command.
     *
     * **Expected Webhooks:**
     * - `call.recording.saved`
     * - `call.recording.transcription.saved`
     * - `call.recording.error`
     */
    fun startRecording(
        callControlId: String,
        params: ActionStartRecordingParams,
    ): ActionStartRecordingResponse = startRecording(callControlId, params, RequestOptions.none())

    /** @see startRecording */
    fun startRecording(
        callControlId: String,
        params: ActionStartRecordingParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActionStartRecordingResponse =
        startRecording(params.toBuilder().callControlId(callControlId).build(), requestOptions)

    /** @see startRecording */
    fun startRecording(params: ActionStartRecordingParams): ActionStartRecordingResponse =
        startRecording(params, RequestOptions.none())

    /** @see startRecording */
    fun startRecording(
        params: ActionStartRecordingParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActionStartRecordingResponse

    /**
     * Start siprec session to configured in SIPREC connector SRS.
     *
     * **Expected Webhooks:**
     * - `siprec.started`
     * - `siprec.stopped`
     * - `siprec.failed`
     */
    fun startSiprec(callControlId: String): ActionStartSiprecResponse =
        startSiprec(callControlId, ActionStartSiprecParams.none())

    /** @see startSiprec */
    fun startSiprec(
        callControlId: String,
        params: ActionStartSiprecParams = ActionStartSiprecParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActionStartSiprecResponse =
        startSiprec(params.toBuilder().callControlId(callControlId).build(), requestOptions)

    /** @see startSiprec */
    fun startSiprec(
        callControlId: String,
        params: ActionStartSiprecParams = ActionStartSiprecParams.none(),
    ): ActionStartSiprecResponse = startSiprec(callControlId, params, RequestOptions.none())

    /** @see startSiprec */
    fun startSiprec(
        params: ActionStartSiprecParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActionStartSiprecResponse

    /** @see startSiprec */
    fun startSiprec(params: ActionStartSiprecParams): ActionStartSiprecResponse =
        startSiprec(params, RequestOptions.none())

    /** @see startSiprec */
    fun startSiprec(
        callControlId: String,
        requestOptions: RequestOptions,
    ): ActionStartSiprecResponse =
        startSiprec(callControlId, ActionStartSiprecParams.none(), requestOptions)

    /**
     * Start streaming the media from a call to a specific WebSocket address or Dialogflow
     * connection in near-realtime. Audio will be delivered as base64-encoded RTP payload (raw
     * audio), wrapped in JSON payloads.
     *
     * Please find more details about media streaming messages specification under the
     * [link](https://developers.telnyx.com/docs/voice/programmable-voice/media-streaming).
     */
    fun startStreaming(callControlId: String): ActionStartStreamingResponse =
        startStreaming(callControlId, ActionStartStreamingParams.none())

    /** @see startStreaming */
    fun startStreaming(
        callControlId: String,
        params: ActionStartStreamingParams = ActionStartStreamingParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActionStartStreamingResponse =
        startStreaming(params.toBuilder().callControlId(callControlId).build(), requestOptions)

    /** @see startStreaming */
    fun startStreaming(
        callControlId: String,
        params: ActionStartStreamingParams = ActionStartStreamingParams.none(),
    ): ActionStartStreamingResponse = startStreaming(callControlId, params, RequestOptions.none())

    /** @see startStreaming */
    fun startStreaming(
        params: ActionStartStreamingParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActionStartStreamingResponse

    /** @see startStreaming */
    fun startStreaming(params: ActionStartStreamingParams): ActionStartStreamingResponse =
        startStreaming(params, RequestOptions.none())

    /** @see startStreaming */
    fun startStreaming(
        callControlId: String,
        requestOptions: RequestOptions,
    ): ActionStartStreamingResponse =
        startStreaming(callControlId, ActionStartStreamingParams.none(), requestOptions)

    /**
     * Start real-time transcription. Transcription will stop on call hang-up, or can be initiated
     * via the Transcription stop command.
     *
     * **Expected Webhooks:**
     * - `call.transcription`
     */
    fun startTranscription(
        callControlId: String,
        params: ActionStartTranscriptionParams,
    ): ActionStartTranscriptionResponse =
        startTranscription(callControlId, params, RequestOptions.none())

    /** @see startTranscription */
    fun startTranscription(
        callControlId: String,
        params: ActionStartTranscriptionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActionStartTranscriptionResponse =
        startTranscription(params.toBuilder().callControlId(callControlId).build(), requestOptions)

    /** @see startTranscription */
    fun startTranscription(
        params: ActionStartTranscriptionParams
    ): ActionStartTranscriptionResponse = startTranscription(params, RequestOptions.none())

    /** @see startTranscription */
    fun startTranscription(
        params: ActionStartTranscriptionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActionStartTranscriptionResponse

    /** Stop an AI assistant on the call. */
    fun stopAiAssistant(callControlId: String): ActionStopAiAssistantResponse =
        stopAiAssistant(callControlId, ActionStopAiAssistantParams.none())

    /** @see stopAiAssistant */
    fun stopAiAssistant(
        callControlId: String,
        params: ActionStopAiAssistantParams = ActionStopAiAssistantParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActionStopAiAssistantResponse =
        stopAiAssistant(params.toBuilder().callControlId(callControlId).build(), requestOptions)

    /** @see stopAiAssistant */
    fun stopAiAssistant(
        callControlId: String,
        params: ActionStopAiAssistantParams = ActionStopAiAssistantParams.none(),
    ): ActionStopAiAssistantResponse = stopAiAssistant(callControlId, params, RequestOptions.none())

    /** @see stopAiAssistant */
    fun stopAiAssistant(
        params: ActionStopAiAssistantParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActionStopAiAssistantResponse

    /** @see stopAiAssistant */
    fun stopAiAssistant(params: ActionStopAiAssistantParams): ActionStopAiAssistantResponse =
        stopAiAssistant(params, RequestOptions.none())

    /** @see stopAiAssistant */
    fun stopAiAssistant(
        callControlId: String,
        requestOptions: RequestOptions,
    ): ActionStopAiAssistantResponse =
        stopAiAssistant(callControlId, ActionStopAiAssistantParams.none(), requestOptions)

    /**
     * Stop forking a call.
     *
     * **Expected Webhooks:**
     * - `call.fork.stopped`
     */
    fun stopForking(callControlId: String): ActionStopForkingResponse =
        stopForking(callControlId, ActionStopForkingParams.none())

    /** @see stopForking */
    fun stopForking(
        callControlId: String,
        params: ActionStopForkingParams = ActionStopForkingParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActionStopForkingResponse =
        stopForking(params.toBuilder().callControlId(callControlId).build(), requestOptions)

    /** @see stopForking */
    fun stopForking(
        callControlId: String,
        params: ActionStopForkingParams = ActionStopForkingParams.none(),
    ): ActionStopForkingResponse = stopForking(callControlId, params, RequestOptions.none())

    /** @see stopForking */
    fun stopForking(
        params: ActionStopForkingParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActionStopForkingResponse

    /** @see stopForking */
    fun stopForking(params: ActionStopForkingParams): ActionStopForkingResponse =
        stopForking(params, RequestOptions.none())

    /** @see stopForking */
    fun stopForking(
        callControlId: String,
        requestOptions: RequestOptions,
    ): ActionStopForkingResponse =
        stopForking(callControlId, ActionStopForkingParams.none(), requestOptions)

    /**
     * Stop current gather.
     *
     * **Expected Webhooks:**
     * - `call.gather.ended`
     */
    fun stopGather(callControlId: String): ActionStopGatherResponse =
        stopGather(callControlId, ActionStopGatherParams.none())

    /** @see stopGather */
    fun stopGather(
        callControlId: String,
        params: ActionStopGatherParams = ActionStopGatherParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActionStopGatherResponse =
        stopGather(params.toBuilder().callControlId(callControlId).build(), requestOptions)

    /** @see stopGather */
    fun stopGather(
        callControlId: String,
        params: ActionStopGatherParams = ActionStopGatherParams.none(),
    ): ActionStopGatherResponse = stopGather(callControlId, params, RequestOptions.none())

    /** @see stopGather */
    fun stopGather(
        params: ActionStopGatherParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActionStopGatherResponse

    /** @see stopGather */
    fun stopGather(params: ActionStopGatherParams): ActionStopGatherResponse =
        stopGather(params, RequestOptions.none())

    /** @see stopGather */
    fun stopGather(
        callControlId: String,
        requestOptions: RequestOptions,
    ): ActionStopGatherResponse =
        stopGather(callControlId, ActionStopGatherParams.none(), requestOptions)

    /** Noise Suppression Stop (BETA) */
    fun stopNoiseSuppression(callControlId: String): ActionStopNoiseSuppressionResponse =
        stopNoiseSuppression(callControlId, ActionStopNoiseSuppressionParams.none())

    /** @see stopNoiseSuppression */
    fun stopNoiseSuppression(
        callControlId: String,
        params: ActionStopNoiseSuppressionParams = ActionStopNoiseSuppressionParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActionStopNoiseSuppressionResponse =
        stopNoiseSuppression(
            params.toBuilder().callControlId(callControlId).build(),
            requestOptions,
        )

    /** @see stopNoiseSuppression */
    fun stopNoiseSuppression(
        callControlId: String,
        params: ActionStopNoiseSuppressionParams = ActionStopNoiseSuppressionParams.none(),
    ): ActionStopNoiseSuppressionResponse =
        stopNoiseSuppression(callControlId, params, RequestOptions.none())

    /** @see stopNoiseSuppression */
    fun stopNoiseSuppression(
        params: ActionStopNoiseSuppressionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActionStopNoiseSuppressionResponse

    /** @see stopNoiseSuppression */
    fun stopNoiseSuppression(
        params: ActionStopNoiseSuppressionParams
    ): ActionStopNoiseSuppressionResponse = stopNoiseSuppression(params, RequestOptions.none())

    /** @see stopNoiseSuppression */
    fun stopNoiseSuppression(
        callControlId: String,
        requestOptions: RequestOptions,
    ): ActionStopNoiseSuppressionResponse =
        stopNoiseSuppression(callControlId, ActionStopNoiseSuppressionParams.none(), requestOptions)

    /**
     * Stop audio being played on the call.
     *
     * **Expected Webhooks:**
     * - `call.playback.ended` or `call.speak.ended`
     */
    fun stopPlayback(callControlId: String): ActionStopPlaybackResponse =
        stopPlayback(callControlId, ActionStopPlaybackParams.none())

    /** @see stopPlayback */
    fun stopPlayback(
        callControlId: String,
        params: ActionStopPlaybackParams = ActionStopPlaybackParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActionStopPlaybackResponse =
        stopPlayback(params.toBuilder().callControlId(callControlId).build(), requestOptions)

    /** @see stopPlayback */
    fun stopPlayback(
        callControlId: String,
        params: ActionStopPlaybackParams = ActionStopPlaybackParams.none(),
    ): ActionStopPlaybackResponse = stopPlayback(callControlId, params, RequestOptions.none())

    /** @see stopPlayback */
    fun stopPlayback(
        params: ActionStopPlaybackParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActionStopPlaybackResponse

    /** @see stopPlayback */
    fun stopPlayback(params: ActionStopPlaybackParams): ActionStopPlaybackResponse =
        stopPlayback(params, RequestOptions.none())

    /** @see stopPlayback */
    fun stopPlayback(
        callControlId: String,
        requestOptions: RequestOptions,
    ): ActionStopPlaybackResponse =
        stopPlayback(callControlId, ActionStopPlaybackParams.none(), requestOptions)

    /**
     * Stop recording the call.
     *
     * **Expected Webhooks:**
     * - `call.recording.saved`
     */
    fun stopRecording(
        callControlId: String,
        params: ActionStopRecordingParams,
    ): ActionStopRecordingResponse = stopRecording(callControlId, params, RequestOptions.none())

    /** @see stopRecording */
    fun stopRecording(
        callControlId: String,
        params: ActionStopRecordingParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActionStopRecordingResponse =
        stopRecording(params.toBuilder().callControlId(callControlId).build(), requestOptions)

    /** @see stopRecording */
    fun stopRecording(params: ActionStopRecordingParams): ActionStopRecordingResponse =
        stopRecording(params, RequestOptions.none())

    /** @see stopRecording */
    fun stopRecording(
        params: ActionStopRecordingParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActionStopRecordingResponse

    /**
     * Stop SIPREC session.
     *
     * **Expected Webhooks:**
     * - `siprec.stopped`
     */
    fun stopSiprec(callControlId: String): ActionStopSiprecResponse =
        stopSiprec(callControlId, ActionStopSiprecParams.none())

    /** @see stopSiprec */
    fun stopSiprec(
        callControlId: String,
        params: ActionStopSiprecParams = ActionStopSiprecParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActionStopSiprecResponse =
        stopSiprec(params.toBuilder().callControlId(callControlId).build(), requestOptions)

    /** @see stopSiprec */
    fun stopSiprec(
        callControlId: String,
        params: ActionStopSiprecParams = ActionStopSiprecParams.none(),
    ): ActionStopSiprecResponse = stopSiprec(callControlId, params, RequestOptions.none())

    /** @see stopSiprec */
    fun stopSiprec(
        params: ActionStopSiprecParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActionStopSiprecResponse

    /** @see stopSiprec */
    fun stopSiprec(params: ActionStopSiprecParams): ActionStopSiprecResponse =
        stopSiprec(params, RequestOptions.none())

    /** @see stopSiprec */
    fun stopSiprec(
        callControlId: String,
        requestOptions: RequestOptions,
    ): ActionStopSiprecResponse =
        stopSiprec(callControlId, ActionStopSiprecParams.none(), requestOptions)

    /**
     * Stop streaming a call to a WebSocket.
     *
     * **Expected Webhooks:**
     * - `streaming.stopped`
     */
    fun stopStreaming(callControlId: String): ActionStopStreamingResponse =
        stopStreaming(callControlId, ActionStopStreamingParams.none())

    /** @see stopStreaming */
    fun stopStreaming(
        callControlId: String,
        params: ActionStopStreamingParams = ActionStopStreamingParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActionStopStreamingResponse =
        stopStreaming(params.toBuilder().callControlId(callControlId).build(), requestOptions)

    /** @see stopStreaming */
    fun stopStreaming(
        callControlId: String,
        params: ActionStopStreamingParams = ActionStopStreamingParams.none(),
    ): ActionStopStreamingResponse = stopStreaming(callControlId, params, RequestOptions.none())

    /** @see stopStreaming */
    fun stopStreaming(
        params: ActionStopStreamingParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActionStopStreamingResponse

    /** @see stopStreaming */
    fun stopStreaming(params: ActionStopStreamingParams): ActionStopStreamingResponse =
        stopStreaming(params, RequestOptions.none())

    /** @see stopStreaming */
    fun stopStreaming(
        callControlId: String,
        requestOptions: RequestOptions,
    ): ActionStopStreamingResponse =
        stopStreaming(callControlId, ActionStopStreamingParams.none(), requestOptions)

    /** Stop real-time transcription. */
    fun stopTranscription(callControlId: String): ActionStopTranscriptionResponse =
        stopTranscription(callControlId, ActionStopTranscriptionParams.none())

    /** @see stopTranscription */
    fun stopTranscription(
        callControlId: String,
        params: ActionStopTranscriptionParams = ActionStopTranscriptionParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActionStopTranscriptionResponse =
        stopTranscription(params.toBuilder().callControlId(callControlId).build(), requestOptions)

    /** @see stopTranscription */
    fun stopTranscription(
        callControlId: String,
        params: ActionStopTranscriptionParams = ActionStopTranscriptionParams.none(),
    ): ActionStopTranscriptionResponse =
        stopTranscription(callControlId, params, RequestOptions.none())

    /** @see stopTranscription */
    fun stopTranscription(
        params: ActionStopTranscriptionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActionStopTranscriptionResponse

    /** @see stopTranscription */
    fun stopTranscription(params: ActionStopTranscriptionParams): ActionStopTranscriptionResponse =
        stopTranscription(params, RequestOptions.none())

    /** @see stopTranscription */
    fun stopTranscription(
        callControlId: String,
        requestOptions: RequestOptions,
    ): ActionStopTranscriptionResponse =
        stopTranscription(callControlId, ActionStopTranscriptionParams.none(), requestOptions)

    /**
     * Switch the supervisor role for a bridged call. This allows switching between different
     * supervisor modes during an active call
     */
    fun switchSupervisorRole(
        callControlId: String,
        params: ActionSwitchSupervisorRoleParams,
    ): ActionSwitchSupervisorRoleResponse =
        switchSupervisorRole(callControlId, params, RequestOptions.none())

    /** @see switchSupervisorRole */
    fun switchSupervisorRole(
        callControlId: String,
        params: ActionSwitchSupervisorRoleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActionSwitchSupervisorRoleResponse =
        switchSupervisorRole(
            params.toBuilder().callControlId(callControlId).build(),
            requestOptions,
        )

    /** @see switchSupervisorRole */
    fun switchSupervisorRole(
        params: ActionSwitchSupervisorRoleParams
    ): ActionSwitchSupervisorRoleResponse = switchSupervisorRole(params, RequestOptions.none())

    /** @see switchSupervisorRole */
    fun switchSupervisorRole(
        params: ActionSwitchSupervisorRoleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActionSwitchSupervisorRoleResponse

    /**
     * Transfer a call to a new destination. If the transfer is unsuccessful, a `call.hangup`
     * webhook for the other call (Leg B) will be sent indicating that the transfer could not be
     * completed. The original call will remain active and may be issued additional commands,
     * potentially transfering the call to an alternate destination.
     *
     * **Expected Webhooks:**
     * - `call.initiated`
     * - `call.bridged` to Leg B
     * - `call.answered` or `call.hangup`
     * - `call.machine.detection.ended` if `answering_machine_detection` was requested
     * - `call.machine.greeting.ended` if `answering_machine_detection` was requested to detect the
     *   end of machine greeting
     * - `call.machine.premium.detection.ended` if `answering_machine_detection=premium` was
     *   requested
     * - `call.machine.premium.greeting.ended` if `answering_machine_detection=premium` was
     *   requested and a beep was detected
     */
    fun transfer(callControlId: String, params: ActionTransferParams): ActionTransferResponse =
        transfer(callControlId, params, RequestOptions.none())

    /** @see transfer */
    fun transfer(
        callControlId: String,
        params: ActionTransferParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActionTransferResponse =
        transfer(params.toBuilder().callControlId(callControlId).build(), requestOptions)

    /** @see transfer */
    fun transfer(params: ActionTransferParams): ActionTransferResponse =
        transfer(params, RequestOptions.none())

    /** @see transfer */
    fun transfer(
        params: ActionTransferParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActionTransferResponse

    /** Updates client state */
    fun updateClientState(
        callControlId: String,
        params: ActionUpdateClientStateParams,
    ): ActionUpdateClientStateResponse =
        updateClientState(callControlId, params, RequestOptions.none())

    /** @see updateClientState */
    fun updateClientState(
        callControlId: String,
        params: ActionUpdateClientStateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActionUpdateClientStateResponse =
        updateClientState(params.toBuilder().callControlId(callControlId).build(), requestOptions)

    /** @see updateClientState */
    fun updateClientState(params: ActionUpdateClientStateParams): ActionUpdateClientStateResponse =
        updateClientState(params, RequestOptions.none())

    /** @see updateClientState */
    fun updateClientState(
        params: ActionUpdateClientStateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActionUpdateClientStateResponse

    /** A view of [ActionService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ActionService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post
         * /calls/{call_control_id}/actions/ai_assistant_add_messages`, but is otherwise the same as
         * [ActionService.addAiAssistantMessages].
         */
        @MustBeClosed
        fun addAiAssistantMessages(
            callControlId: String
        ): HttpResponseFor<ActionAddAiAssistantMessagesResponse> =
            addAiAssistantMessages(callControlId, ActionAddAiAssistantMessagesParams.none())

        /** @see addAiAssistantMessages */
        @MustBeClosed
        fun addAiAssistantMessages(
            callControlId: String,
            params: ActionAddAiAssistantMessagesParams = ActionAddAiAssistantMessagesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActionAddAiAssistantMessagesResponse> =
            addAiAssistantMessages(
                params.toBuilder().callControlId(callControlId).build(),
                requestOptions,
            )

        /** @see addAiAssistantMessages */
        @MustBeClosed
        fun addAiAssistantMessages(
            callControlId: String,
            params: ActionAddAiAssistantMessagesParams = ActionAddAiAssistantMessagesParams.none(),
        ): HttpResponseFor<ActionAddAiAssistantMessagesResponse> =
            addAiAssistantMessages(callControlId, params, RequestOptions.none())

        /** @see addAiAssistantMessages */
        @MustBeClosed
        fun addAiAssistantMessages(
            params: ActionAddAiAssistantMessagesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActionAddAiAssistantMessagesResponse>

        /** @see addAiAssistantMessages */
        @MustBeClosed
        fun addAiAssistantMessages(
            params: ActionAddAiAssistantMessagesParams
        ): HttpResponseFor<ActionAddAiAssistantMessagesResponse> =
            addAiAssistantMessages(params, RequestOptions.none())

        /** @see addAiAssistantMessages */
        @MustBeClosed
        fun addAiAssistantMessages(
            callControlId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ActionAddAiAssistantMessagesResponse> =
            addAiAssistantMessages(
                callControlId,
                ActionAddAiAssistantMessagesParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `post /calls/{call_control_id}/actions/answer`, but is
         * otherwise the same as [ActionService.answer].
         */
        @MustBeClosed
        fun answer(callControlId: String): HttpResponseFor<ActionAnswerResponse> =
            answer(callControlId, ActionAnswerParams.none())

        /** @see answer */
        @MustBeClosed
        fun answer(
            callControlId: String,
            params: ActionAnswerParams = ActionAnswerParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActionAnswerResponse> =
            answer(params.toBuilder().callControlId(callControlId).build(), requestOptions)

        /** @see answer */
        @MustBeClosed
        fun answer(
            callControlId: String,
            params: ActionAnswerParams = ActionAnswerParams.none(),
        ): HttpResponseFor<ActionAnswerResponse> =
            answer(callControlId, params, RequestOptions.none())

        /** @see answer */
        @MustBeClosed
        fun answer(
            params: ActionAnswerParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActionAnswerResponse>

        /** @see answer */
        @MustBeClosed
        fun answer(params: ActionAnswerParams): HttpResponseFor<ActionAnswerResponse> =
            answer(params, RequestOptions.none())

        /** @see answer */
        @MustBeClosed
        fun answer(
            callControlId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ActionAnswerResponse> =
            answer(callControlId, ActionAnswerParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /calls/{call_control_id}/actions/bridge`, but is
         * otherwise the same as [ActionService.bridge].
         */
        @MustBeClosed
        fun bridge(
            callControlIdToBridge: String,
            params: ActionBridgeParams,
        ): HttpResponseFor<ActionBridgeResponse> =
            bridge(callControlIdToBridge, params, RequestOptions.none())

        /** @see bridge */
        @MustBeClosed
        fun bridge(
            callControlIdToBridge: String,
            params: ActionBridgeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActionBridgeResponse> =
            bridge(
                params.toBuilder().callControlIdToBridge(callControlIdToBridge).build(),
                requestOptions,
            )

        /** @see bridge */
        @MustBeClosed
        fun bridge(params: ActionBridgeParams): HttpResponseFor<ActionBridgeResponse> =
            bridge(params, RequestOptions.none())

        /** @see bridge */
        @MustBeClosed
        fun bridge(
            params: ActionBridgeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActionBridgeResponse>

        /**
         * Returns a raw HTTP response for `post /calls/{call_control_id}/actions/enqueue`, but is
         * otherwise the same as [ActionService.enqueue].
         */
        @MustBeClosed
        fun enqueue(
            callControlId: String,
            params: ActionEnqueueParams,
        ): HttpResponseFor<ActionEnqueueResponse> =
            enqueue(callControlId, params, RequestOptions.none())

        /** @see enqueue */
        @MustBeClosed
        fun enqueue(
            callControlId: String,
            params: ActionEnqueueParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActionEnqueueResponse> =
            enqueue(params.toBuilder().callControlId(callControlId).build(), requestOptions)

        /** @see enqueue */
        @MustBeClosed
        fun enqueue(params: ActionEnqueueParams): HttpResponseFor<ActionEnqueueResponse> =
            enqueue(params, RequestOptions.none())

        /** @see enqueue */
        @MustBeClosed
        fun enqueue(
            params: ActionEnqueueParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActionEnqueueResponse>

        /**
         * Returns a raw HTTP response for `post /calls/{call_control_id}/actions/gather`, but is
         * otherwise the same as [ActionService.gather].
         */
        @MustBeClosed
        fun gather(callControlId: String): HttpResponseFor<ActionGatherResponse> =
            gather(callControlId, ActionGatherParams.none())

        /** @see gather */
        @MustBeClosed
        fun gather(
            callControlId: String,
            params: ActionGatherParams = ActionGatherParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActionGatherResponse> =
            gather(params.toBuilder().callControlId(callControlId).build(), requestOptions)

        /** @see gather */
        @MustBeClosed
        fun gather(
            callControlId: String,
            params: ActionGatherParams = ActionGatherParams.none(),
        ): HttpResponseFor<ActionGatherResponse> =
            gather(callControlId, params, RequestOptions.none())

        /** @see gather */
        @MustBeClosed
        fun gather(
            params: ActionGatherParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActionGatherResponse>

        /** @see gather */
        @MustBeClosed
        fun gather(params: ActionGatherParams): HttpResponseFor<ActionGatherResponse> =
            gather(params, RequestOptions.none())

        /** @see gather */
        @MustBeClosed
        fun gather(
            callControlId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ActionGatherResponse> =
            gather(callControlId, ActionGatherParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /calls/{call_control_id}/actions/gather_using_ai`,
         * but is otherwise the same as [ActionService.gatherUsingAi].
         */
        @MustBeClosed
        fun gatherUsingAi(
            callControlId: String,
            params: ActionGatherUsingAiParams,
        ): HttpResponseFor<ActionGatherUsingAiResponse> =
            gatherUsingAi(callControlId, params, RequestOptions.none())

        /** @see gatherUsingAi */
        @MustBeClosed
        fun gatherUsingAi(
            callControlId: String,
            params: ActionGatherUsingAiParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActionGatherUsingAiResponse> =
            gatherUsingAi(params.toBuilder().callControlId(callControlId).build(), requestOptions)

        /** @see gatherUsingAi */
        @MustBeClosed
        fun gatherUsingAi(
            params: ActionGatherUsingAiParams
        ): HttpResponseFor<ActionGatherUsingAiResponse> =
            gatherUsingAi(params, RequestOptions.none())

        /** @see gatherUsingAi */
        @MustBeClosed
        fun gatherUsingAi(
            params: ActionGatherUsingAiParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActionGatherUsingAiResponse>

        /**
         * Returns a raw HTTP response for `post
         * /calls/{call_control_id}/actions/gather_using_audio`, but is otherwise the same as
         * [ActionService.gatherUsingAudio].
         */
        @MustBeClosed
        fun gatherUsingAudio(
            callControlId: String
        ): HttpResponseFor<ActionGatherUsingAudioResponse> =
            gatherUsingAudio(callControlId, ActionGatherUsingAudioParams.none())

        /** @see gatherUsingAudio */
        @MustBeClosed
        fun gatherUsingAudio(
            callControlId: String,
            params: ActionGatherUsingAudioParams = ActionGatherUsingAudioParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActionGatherUsingAudioResponse> =
            gatherUsingAudio(
                params.toBuilder().callControlId(callControlId).build(),
                requestOptions,
            )

        /** @see gatherUsingAudio */
        @MustBeClosed
        fun gatherUsingAudio(
            callControlId: String,
            params: ActionGatherUsingAudioParams = ActionGatherUsingAudioParams.none(),
        ): HttpResponseFor<ActionGatherUsingAudioResponse> =
            gatherUsingAudio(callControlId, params, RequestOptions.none())

        /** @see gatherUsingAudio */
        @MustBeClosed
        fun gatherUsingAudio(
            params: ActionGatherUsingAudioParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActionGatherUsingAudioResponse>

        /** @see gatherUsingAudio */
        @MustBeClosed
        fun gatherUsingAudio(
            params: ActionGatherUsingAudioParams
        ): HttpResponseFor<ActionGatherUsingAudioResponse> =
            gatherUsingAudio(params, RequestOptions.none())

        /** @see gatherUsingAudio */
        @MustBeClosed
        fun gatherUsingAudio(
            callControlId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ActionGatherUsingAudioResponse> =
            gatherUsingAudio(callControlId, ActionGatherUsingAudioParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /calls/{call_control_id}/actions/gather_using_speak`, but is otherwise the same as
         * [ActionService.gatherUsingSpeak].
         */
        @MustBeClosed
        fun gatherUsingSpeak(
            callControlId: String,
            params: ActionGatherUsingSpeakParams,
        ): HttpResponseFor<ActionGatherUsingSpeakResponse> =
            gatherUsingSpeak(callControlId, params, RequestOptions.none())

        /** @see gatherUsingSpeak */
        @MustBeClosed
        fun gatherUsingSpeak(
            callControlId: String,
            params: ActionGatherUsingSpeakParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActionGatherUsingSpeakResponse> =
            gatherUsingSpeak(
                params.toBuilder().callControlId(callControlId).build(),
                requestOptions,
            )

        /** @see gatherUsingSpeak */
        @MustBeClosed
        fun gatherUsingSpeak(
            params: ActionGatherUsingSpeakParams
        ): HttpResponseFor<ActionGatherUsingSpeakResponse> =
            gatherUsingSpeak(params, RequestOptions.none())

        /** @see gatherUsingSpeak */
        @MustBeClosed
        fun gatherUsingSpeak(
            params: ActionGatherUsingSpeakParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActionGatherUsingSpeakResponse>

        /**
         * Returns a raw HTTP response for `post /calls/{call_control_id}/actions/hangup`, but is
         * otherwise the same as [ActionService.hangup].
         */
        @MustBeClosed
        fun hangup(callControlId: String): HttpResponseFor<ActionHangupResponse> =
            hangup(callControlId, ActionHangupParams.none())

        /** @see hangup */
        @MustBeClosed
        fun hangup(
            callControlId: String,
            params: ActionHangupParams = ActionHangupParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActionHangupResponse> =
            hangup(params.toBuilder().callControlId(callControlId).build(), requestOptions)

        /** @see hangup */
        @MustBeClosed
        fun hangup(
            callControlId: String,
            params: ActionHangupParams = ActionHangupParams.none(),
        ): HttpResponseFor<ActionHangupResponse> =
            hangup(callControlId, params, RequestOptions.none())

        /** @see hangup */
        @MustBeClosed
        fun hangup(
            params: ActionHangupParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActionHangupResponse>

        /** @see hangup */
        @MustBeClosed
        fun hangup(params: ActionHangupParams): HttpResponseFor<ActionHangupResponse> =
            hangup(params, RequestOptions.none())

        /** @see hangup */
        @MustBeClosed
        fun hangup(
            callControlId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ActionHangupResponse> =
            hangup(callControlId, ActionHangupParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /calls/{call_control_id}/actions/leave_queue`, but
         * is otherwise the same as [ActionService.leaveQueue].
         */
        @MustBeClosed
        fun leaveQueue(callControlId: String): HttpResponseFor<ActionLeaveQueueResponse> =
            leaveQueue(callControlId, ActionLeaveQueueParams.none())

        /** @see leaveQueue */
        @MustBeClosed
        fun leaveQueue(
            callControlId: String,
            params: ActionLeaveQueueParams = ActionLeaveQueueParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActionLeaveQueueResponse> =
            leaveQueue(params.toBuilder().callControlId(callControlId).build(), requestOptions)

        /** @see leaveQueue */
        @MustBeClosed
        fun leaveQueue(
            callControlId: String,
            params: ActionLeaveQueueParams = ActionLeaveQueueParams.none(),
        ): HttpResponseFor<ActionLeaveQueueResponse> =
            leaveQueue(callControlId, params, RequestOptions.none())

        /** @see leaveQueue */
        @MustBeClosed
        fun leaveQueue(
            params: ActionLeaveQueueParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActionLeaveQueueResponse>

        /** @see leaveQueue */
        @MustBeClosed
        fun leaveQueue(params: ActionLeaveQueueParams): HttpResponseFor<ActionLeaveQueueResponse> =
            leaveQueue(params, RequestOptions.none())

        /** @see leaveQueue */
        @MustBeClosed
        fun leaveQueue(
            callControlId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ActionLeaveQueueResponse> =
            leaveQueue(callControlId, ActionLeaveQueueParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /calls/{call_control_id}/actions/record_pause`, but
         * is otherwise the same as [ActionService.pauseRecording].
         */
        @MustBeClosed
        fun pauseRecording(callControlId: String): HttpResponseFor<ActionPauseRecordingResponse> =
            pauseRecording(callControlId, ActionPauseRecordingParams.none())

        /** @see pauseRecording */
        @MustBeClosed
        fun pauseRecording(
            callControlId: String,
            params: ActionPauseRecordingParams = ActionPauseRecordingParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActionPauseRecordingResponse> =
            pauseRecording(params.toBuilder().callControlId(callControlId).build(), requestOptions)

        /** @see pauseRecording */
        @MustBeClosed
        fun pauseRecording(
            callControlId: String,
            params: ActionPauseRecordingParams = ActionPauseRecordingParams.none(),
        ): HttpResponseFor<ActionPauseRecordingResponse> =
            pauseRecording(callControlId, params, RequestOptions.none())

        /** @see pauseRecording */
        @MustBeClosed
        fun pauseRecording(
            params: ActionPauseRecordingParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActionPauseRecordingResponse>

        /** @see pauseRecording */
        @MustBeClosed
        fun pauseRecording(
            params: ActionPauseRecordingParams
        ): HttpResponseFor<ActionPauseRecordingResponse> =
            pauseRecording(params, RequestOptions.none())

        /** @see pauseRecording */
        @MustBeClosed
        fun pauseRecording(
            callControlId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ActionPauseRecordingResponse> =
            pauseRecording(callControlId, ActionPauseRecordingParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /calls/{call_control_id}/actions/refer`, but is
         * otherwise the same as [ActionService.refer].
         */
        @MustBeClosed
        fun refer(
            callControlId: String,
            params: ActionReferParams,
        ): HttpResponseFor<ActionReferResponse> =
            refer(callControlId, params, RequestOptions.none())

        /** @see refer */
        @MustBeClosed
        fun refer(
            callControlId: String,
            params: ActionReferParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActionReferResponse> =
            refer(params.toBuilder().callControlId(callControlId).build(), requestOptions)

        /** @see refer */
        @MustBeClosed
        fun refer(params: ActionReferParams): HttpResponseFor<ActionReferResponse> =
            refer(params, RequestOptions.none())

        /** @see refer */
        @MustBeClosed
        fun refer(
            params: ActionReferParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActionReferResponse>

        /**
         * Returns a raw HTTP response for `post /calls/{call_control_id}/actions/reject`, but is
         * otherwise the same as [ActionService.reject].
         */
        @MustBeClosed
        fun reject(
            callControlId: String,
            params: ActionRejectParams,
        ): HttpResponseFor<ActionRejectResponse> =
            reject(callControlId, params, RequestOptions.none())

        /** @see reject */
        @MustBeClosed
        fun reject(
            callControlId: String,
            params: ActionRejectParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActionRejectResponse> =
            reject(params.toBuilder().callControlId(callControlId).build(), requestOptions)

        /** @see reject */
        @MustBeClosed
        fun reject(params: ActionRejectParams): HttpResponseFor<ActionRejectResponse> =
            reject(params, RequestOptions.none())

        /** @see reject */
        @MustBeClosed
        fun reject(
            params: ActionRejectParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActionRejectResponse>

        /**
         * Returns a raw HTTP response for `post /calls/{call_control_id}/actions/record_resume`,
         * but is otherwise the same as [ActionService.resumeRecording].
         */
        @MustBeClosed
        fun resumeRecording(callControlId: String): HttpResponseFor<ActionResumeRecordingResponse> =
            resumeRecording(callControlId, ActionResumeRecordingParams.none())

        /** @see resumeRecording */
        @MustBeClosed
        fun resumeRecording(
            callControlId: String,
            params: ActionResumeRecordingParams = ActionResumeRecordingParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActionResumeRecordingResponse> =
            resumeRecording(params.toBuilder().callControlId(callControlId).build(), requestOptions)

        /** @see resumeRecording */
        @MustBeClosed
        fun resumeRecording(
            callControlId: String,
            params: ActionResumeRecordingParams = ActionResumeRecordingParams.none(),
        ): HttpResponseFor<ActionResumeRecordingResponse> =
            resumeRecording(callControlId, params, RequestOptions.none())

        /** @see resumeRecording */
        @MustBeClosed
        fun resumeRecording(
            params: ActionResumeRecordingParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActionResumeRecordingResponse>

        /** @see resumeRecording */
        @MustBeClosed
        fun resumeRecording(
            params: ActionResumeRecordingParams
        ): HttpResponseFor<ActionResumeRecordingResponse> =
            resumeRecording(params, RequestOptions.none())

        /** @see resumeRecording */
        @MustBeClosed
        fun resumeRecording(
            callControlId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ActionResumeRecordingResponse> =
            resumeRecording(callControlId, ActionResumeRecordingParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /calls/{call_control_id}/actions/send_dtmf`, but is
         * otherwise the same as [ActionService.sendDtmf].
         */
        @MustBeClosed
        fun sendDtmf(
            callControlId: String,
            params: ActionSendDtmfParams,
        ): HttpResponseFor<ActionSendDtmfResponse> =
            sendDtmf(callControlId, params, RequestOptions.none())

        /** @see sendDtmf */
        @MustBeClosed
        fun sendDtmf(
            callControlId: String,
            params: ActionSendDtmfParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActionSendDtmfResponse> =
            sendDtmf(params.toBuilder().callControlId(callControlId).build(), requestOptions)

        /** @see sendDtmf */
        @MustBeClosed
        fun sendDtmf(params: ActionSendDtmfParams): HttpResponseFor<ActionSendDtmfResponse> =
            sendDtmf(params, RequestOptions.none())

        /** @see sendDtmf */
        @MustBeClosed
        fun sendDtmf(
            params: ActionSendDtmfParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActionSendDtmfResponse>

        /**
         * Returns a raw HTTP response for `post /calls/{call_control_id}/actions/send_sip_info`,
         * but is otherwise the same as [ActionService.sendSipInfo].
         */
        @MustBeClosed
        fun sendSipInfo(
            callControlId: String,
            params: ActionSendSipInfoParams,
        ): HttpResponseFor<ActionSendSipInfoResponse> =
            sendSipInfo(callControlId, params, RequestOptions.none())

        /** @see sendSipInfo */
        @MustBeClosed
        fun sendSipInfo(
            callControlId: String,
            params: ActionSendSipInfoParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActionSendSipInfoResponse> =
            sendSipInfo(params.toBuilder().callControlId(callControlId).build(), requestOptions)

        /** @see sendSipInfo */
        @MustBeClosed
        fun sendSipInfo(
            params: ActionSendSipInfoParams
        ): HttpResponseFor<ActionSendSipInfoResponse> = sendSipInfo(params, RequestOptions.none())

        /** @see sendSipInfo */
        @MustBeClosed
        fun sendSipInfo(
            params: ActionSendSipInfoParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActionSendSipInfoResponse>

        /**
         * Returns a raw HTTP response for `post /calls/{call_control_id}/actions/speak`, but is
         * otherwise the same as [ActionService.speak].
         */
        @MustBeClosed
        fun speak(
            callControlId: String,
            params: ActionSpeakParams,
        ): HttpResponseFor<ActionSpeakResponse> =
            speak(callControlId, params, RequestOptions.none())

        /** @see speak */
        @MustBeClosed
        fun speak(
            callControlId: String,
            params: ActionSpeakParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActionSpeakResponse> =
            speak(params.toBuilder().callControlId(callControlId).build(), requestOptions)

        /** @see speak */
        @MustBeClosed
        fun speak(params: ActionSpeakParams): HttpResponseFor<ActionSpeakResponse> =
            speak(params, RequestOptions.none())

        /** @see speak */
        @MustBeClosed
        fun speak(
            params: ActionSpeakParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActionSpeakResponse>

        /**
         * Returns a raw HTTP response for `post
         * /calls/{call_control_id}/actions/ai_assistant_start`, but is otherwise the same as
         * [ActionService.startAiAssistant].
         */
        @MustBeClosed
        fun startAiAssistant(
            callControlId: String
        ): HttpResponseFor<ActionStartAiAssistantResponse> =
            startAiAssistant(callControlId, ActionStartAiAssistantParams.none())

        /** @see startAiAssistant */
        @MustBeClosed
        fun startAiAssistant(
            callControlId: String,
            params: ActionStartAiAssistantParams = ActionStartAiAssistantParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActionStartAiAssistantResponse> =
            startAiAssistant(
                params.toBuilder().callControlId(callControlId).build(),
                requestOptions,
            )

        /** @see startAiAssistant */
        @MustBeClosed
        fun startAiAssistant(
            callControlId: String,
            params: ActionStartAiAssistantParams = ActionStartAiAssistantParams.none(),
        ): HttpResponseFor<ActionStartAiAssistantResponse> =
            startAiAssistant(callControlId, params, RequestOptions.none())

        /** @see startAiAssistant */
        @MustBeClosed
        fun startAiAssistant(
            params: ActionStartAiAssistantParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActionStartAiAssistantResponse>

        /** @see startAiAssistant */
        @MustBeClosed
        fun startAiAssistant(
            params: ActionStartAiAssistantParams
        ): HttpResponseFor<ActionStartAiAssistantResponse> =
            startAiAssistant(params, RequestOptions.none())

        /** @see startAiAssistant */
        @MustBeClosed
        fun startAiAssistant(
            callControlId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ActionStartAiAssistantResponse> =
            startAiAssistant(callControlId, ActionStartAiAssistantParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /calls/{call_control_id}/actions/fork_start`, but
         * is otherwise the same as [ActionService.startForking].
         */
        @MustBeClosed
        fun startForking(callControlId: String): HttpResponseFor<ActionStartForkingResponse> =
            startForking(callControlId, ActionStartForkingParams.none())

        /** @see startForking */
        @MustBeClosed
        fun startForking(
            callControlId: String,
            params: ActionStartForkingParams = ActionStartForkingParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActionStartForkingResponse> =
            startForking(params.toBuilder().callControlId(callControlId).build(), requestOptions)

        /** @see startForking */
        @MustBeClosed
        fun startForking(
            callControlId: String,
            params: ActionStartForkingParams = ActionStartForkingParams.none(),
        ): HttpResponseFor<ActionStartForkingResponse> =
            startForking(callControlId, params, RequestOptions.none())

        /** @see startForking */
        @MustBeClosed
        fun startForking(
            params: ActionStartForkingParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActionStartForkingResponse>

        /** @see startForking */
        @MustBeClosed
        fun startForking(
            params: ActionStartForkingParams
        ): HttpResponseFor<ActionStartForkingResponse> = startForking(params, RequestOptions.none())

        /** @see startForking */
        @MustBeClosed
        fun startForking(
            callControlId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ActionStartForkingResponse> =
            startForking(callControlId, ActionStartForkingParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /calls/{call_control_id}/actions/suppression_start`, but is otherwise the same as
         * [ActionService.startNoiseSuppression].
         */
        @MustBeClosed
        fun startNoiseSuppression(
            callControlId: String
        ): HttpResponseFor<ActionStartNoiseSuppressionResponse> =
            startNoiseSuppression(callControlId, ActionStartNoiseSuppressionParams.none())

        /** @see startNoiseSuppression */
        @MustBeClosed
        fun startNoiseSuppression(
            callControlId: String,
            params: ActionStartNoiseSuppressionParams = ActionStartNoiseSuppressionParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActionStartNoiseSuppressionResponse> =
            startNoiseSuppression(
                params.toBuilder().callControlId(callControlId).build(),
                requestOptions,
            )

        /** @see startNoiseSuppression */
        @MustBeClosed
        fun startNoiseSuppression(
            callControlId: String,
            params: ActionStartNoiseSuppressionParams = ActionStartNoiseSuppressionParams.none(),
        ): HttpResponseFor<ActionStartNoiseSuppressionResponse> =
            startNoiseSuppression(callControlId, params, RequestOptions.none())

        /** @see startNoiseSuppression */
        @MustBeClosed
        fun startNoiseSuppression(
            params: ActionStartNoiseSuppressionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActionStartNoiseSuppressionResponse>

        /** @see startNoiseSuppression */
        @MustBeClosed
        fun startNoiseSuppression(
            params: ActionStartNoiseSuppressionParams
        ): HttpResponseFor<ActionStartNoiseSuppressionResponse> =
            startNoiseSuppression(params, RequestOptions.none())

        /** @see startNoiseSuppression */
        @MustBeClosed
        fun startNoiseSuppression(
            callControlId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ActionStartNoiseSuppressionResponse> =
            startNoiseSuppression(
                callControlId,
                ActionStartNoiseSuppressionParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `post /calls/{call_control_id}/actions/playback_start`,
         * but is otherwise the same as [ActionService.startPlayback].
         */
        @MustBeClosed
        fun startPlayback(callControlId: String): HttpResponseFor<ActionStartPlaybackResponse> =
            startPlayback(callControlId, ActionStartPlaybackParams.none())

        /** @see startPlayback */
        @MustBeClosed
        fun startPlayback(
            callControlId: String,
            params: ActionStartPlaybackParams = ActionStartPlaybackParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActionStartPlaybackResponse> =
            startPlayback(params.toBuilder().callControlId(callControlId).build(), requestOptions)

        /** @see startPlayback */
        @MustBeClosed
        fun startPlayback(
            callControlId: String,
            params: ActionStartPlaybackParams = ActionStartPlaybackParams.none(),
        ): HttpResponseFor<ActionStartPlaybackResponse> =
            startPlayback(callControlId, params, RequestOptions.none())

        /** @see startPlayback */
        @MustBeClosed
        fun startPlayback(
            params: ActionStartPlaybackParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActionStartPlaybackResponse>

        /** @see startPlayback */
        @MustBeClosed
        fun startPlayback(
            params: ActionStartPlaybackParams
        ): HttpResponseFor<ActionStartPlaybackResponse> =
            startPlayback(params, RequestOptions.none())

        /** @see startPlayback */
        @MustBeClosed
        fun startPlayback(
            callControlId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ActionStartPlaybackResponse> =
            startPlayback(callControlId, ActionStartPlaybackParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /calls/{call_control_id}/actions/record_start`, but
         * is otherwise the same as [ActionService.startRecording].
         */
        @MustBeClosed
        fun startRecording(
            callControlId: String,
            params: ActionStartRecordingParams,
        ): HttpResponseFor<ActionStartRecordingResponse> =
            startRecording(callControlId, params, RequestOptions.none())

        /** @see startRecording */
        @MustBeClosed
        fun startRecording(
            callControlId: String,
            params: ActionStartRecordingParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActionStartRecordingResponse> =
            startRecording(params.toBuilder().callControlId(callControlId).build(), requestOptions)

        /** @see startRecording */
        @MustBeClosed
        fun startRecording(
            params: ActionStartRecordingParams
        ): HttpResponseFor<ActionStartRecordingResponse> =
            startRecording(params, RequestOptions.none())

        /** @see startRecording */
        @MustBeClosed
        fun startRecording(
            params: ActionStartRecordingParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActionStartRecordingResponse>

        /**
         * Returns a raw HTTP response for `post /calls/{call_control_id}/actions/siprec_start`, but
         * is otherwise the same as [ActionService.startSiprec].
         */
        @MustBeClosed
        fun startSiprec(callControlId: String): HttpResponseFor<ActionStartSiprecResponse> =
            startSiprec(callControlId, ActionStartSiprecParams.none())

        /** @see startSiprec */
        @MustBeClosed
        fun startSiprec(
            callControlId: String,
            params: ActionStartSiprecParams = ActionStartSiprecParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActionStartSiprecResponse> =
            startSiprec(params.toBuilder().callControlId(callControlId).build(), requestOptions)

        /** @see startSiprec */
        @MustBeClosed
        fun startSiprec(
            callControlId: String,
            params: ActionStartSiprecParams = ActionStartSiprecParams.none(),
        ): HttpResponseFor<ActionStartSiprecResponse> =
            startSiprec(callControlId, params, RequestOptions.none())

        /** @see startSiprec */
        @MustBeClosed
        fun startSiprec(
            params: ActionStartSiprecParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActionStartSiprecResponse>

        /** @see startSiprec */
        @MustBeClosed
        fun startSiprec(
            params: ActionStartSiprecParams
        ): HttpResponseFor<ActionStartSiprecResponse> = startSiprec(params, RequestOptions.none())

        /** @see startSiprec */
        @MustBeClosed
        fun startSiprec(
            callControlId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ActionStartSiprecResponse> =
            startSiprec(callControlId, ActionStartSiprecParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /calls/{call_control_id}/actions/streaming_start`,
         * but is otherwise the same as [ActionService.startStreaming].
         */
        @MustBeClosed
        fun startStreaming(callControlId: String): HttpResponseFor<ActionStartStreamingResponse> =
            startStreaming(callControlId, ActionStartStreamingParams.none())

        /** @see startStreaming */
        @MustBeClosed
        fun startStreaming(
            callControlId: String,
            params: ActionStartStreamingParams = ActionStartStreamingParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActionStartStreamingResponse> =
            startStreaming(params.toBuilder().callControlId(callControlId).build(), requestOptions)

        /** @see startStreaming */
        @MustBeClosed
        fun startStreaming(
            callControlId: String,
            params: ActionStartStreamingParams = ActionStartStreamingParams.none(),
        ): HttpResponseFor<ActionStartStreamingResponse> =
            startStreaming(callControlId, params, RequestOptions.none())

        /** @see startStreaming */
        @MustBeClosed
        fun startStreaming(
            params: ActionStartStreamingParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActionStartStreamingResponse>

        /** @see startStreaming */
        @MustBeClosed
        fun startStreaming(
            params: ActionStartStreamingParams
        ): HttpResponseFor<ActionStartStreamingResponse> =
            startStreaming(params, RequestOptions.none())

        /** @see startStreaming */
        @MustBeClosed
        fun startStreaming(
            callControlId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ActionStartStreamingResponse> =
            startStreaming(callControlId, ActionStartStreamingParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /calls/{call_control_id}/actions/transcription_start`, but is otherwise the same as
         * [ActionService.startTranscription].
         */
        @MustBeClosed
        fun startTranscription(
            callControlId: String,
            params: ActionStartTranscriptionParams,
        ): HttpResponseFor<ActionStartTranscriptionResponse> =
            startTranscription(callControlId, params, RequestOptions.none())

        /** @see startTranscription */
        @MustBeClosed
        fun startTranscription(
            callControlId: String,
            params: ActionStartTranscriptionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActionStartTranscriptionResponse> =
            startTranscription(
                params.toBuilder().callControlId(callControlId).build(),
                requestOptions,
            )

        /** @see startTranscription */
        @MustBeClosed
        fun startTranscription(
            params: ActionStartTranscriptionParams
        ): HttpResponseFor<ActionStartTranscriptionResponse> =
            startTranscription(params, RequestOptions.none())

        /** @see startTranscription */
        @MustBeClosed
        fun startTranscription(
            params: ActionStartTranscriptionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActionStartTranscriptionResponse>

        /**
         * Returns a raw HTTP response for `post
         * /calls/{call_control_id}/actions/ai_assistant_stop`, but is otherwise the same as
         * [ActionService.stopAiAssistant].
         */
        @MustBeClosed
        fun stopAiAssistant(callControlId: String): HttpResponseFor<ActionStopAiAssistantResponse> =
            stopAiAssistant(callControlId, ActionStopAiAssistantParams.none())

        /** @see stopAiAssistant */
        @MustBeClosed
        fun stopAiAssistant(
            callControlId: String,
            params: ActionStopAiAssistantParams = ActionStopAiAssistantParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActionStopAiAssistantResponse> =
            stopAiAssistant(params.toBuilder().callControlId(callControlId).build(), requestOptions)

        /** @see stopAiAssistant */
        @MustBeClosed
        fun stopAiAssistant(
            callControlId: String,
            params: ActionStopAiAssistantParams = ActionStopAiAssistantParams.none(),
        ): HttpResponseFor<ActionStopAiAssistantResponse> =
            stopAiAssistant(callControlId, params, RequestOptions.none())

        /** @see stopAiAssistant */
        @MustBeClosed
        fun stopAiAssistant(
            params: ActionStopAiAssistantParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActionStopAiAssistantResponse>

        /** @see stopAiAssistant */
        @MustBeClosed
        fun stopAiAssistant(
            params: ActionStopAiAssistantParams
        ): HttpResponseFor<ActionStopAiAssistantResponse> =
            stopAiAssistant(params, RequestOptions.none())

        /** @see stopAiAssistant */
        @MustBeClosed
        fun stopAiAssistant(
            callControlId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ActionStopAiAssistantResponse> =
            stopAiAssistant(callControlId, ActionStopAiAssistantParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /calls/{call_control_id}/actions/fork_stop`, but is
         * otherwise the same as [ActionService.stopForking].
         */
        @MustBeClosed
        fun stopForking(callControlId: String): HttpResponseFor<ActionStopForkingResponse> =
            stopForking(callControlId, ActionStopForkingParams.none())

        /** @see stopForking */
        @MustBeClosed
        fun stopForking(
            callControlId: String,
            params: ActionStopForkingParams = ActionStopForkingParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActionStopForkingResponse> =
            stopForking(params.toBuilder().callControlId(callControlId).build(), requestOptions)

        /** @see stopForking */
        @MustBeClosed
        fun stopForking(
            callControlId: String,
            params: ActionStopForkingParams = ActionStopForkingParams.none(),
        ): HttpResponseFor<ActionStopForkingResponse> =
            stopForking(callControlId, params, RequestOptions.none())

        /** @see stopForking */
        @MustBeClosed
        fun stopForking(
            params: ActionStopForkingParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActionStopForkingResponse>

        /** @see stopForking */
        @MustBeClosed
        fun stopForking(
            params: ActionStopForkingParams
        ): HttpResponseFor<ActionStopForkingResponse> = stopForking(params, RequestOptions.none())

        /** @see stopForking */
        @MustBeClosed
        fun stopForking(
            callControlId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ActionStopForkingResponse> =
            stopForking(callControlId, ActionStopForkingParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /calls/{call_control_id}/actions/gather_stop`, but
         * is otherwise the same as [ActionService.stopGather].
         */
        @MustBeClosed
        fun stopGather(callControlId: String): HttpResponseFor<ActionStopGatherResponse> =
            stopGather(callControlId, ActionStopGatherParams.none())

        /** @see stopGather */
        @MustBeClosed
        fun stopGather(
            callControlId: String,
            params: ActionStopGatherParams = ActionStopGatherParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActionStopGatherResponse> =
            stopGather(params.toBuilder().callControlId(callControlId).build(), requestOptions)

        /** @see stopGather */
        @MustBeClosed
        fun stopGather(
            callControlId: String,
            params: ActionStopGatherParams = ActionStopGatherParams.none(),
        ): HttpResponseFor<ActionStopGatherResponse> =
            stopGather(callControlId, params, RequestOptions.none())

        /** @see stopGather */
        @MustBeClosed
        fun stopGather(
            params: ActionStopGatherParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActionStopGatherResponse>

        /** @see stopGather */
        @MustBeClosed
        fun stopGather(params: ActionStopGatherParams): HttpResponseFor<ActionStopGatherResponse> =
            stopGather(params, RequestOptions.none())

        /** @see stopGather */
        @MustBeClosed
        fun stopGather(
            callControlId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ActionStopGatherResponse> =
            stopGather(callControlId, ActionStopGatherParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /calls/{call_control_id}/actions/suppression_stop`,
         * but is otherwise the same as [ActionService.stopNoiseSuppression].
         */
        @MustBeClosed
        fun stopNoiseSuppression(
            callControlId: String
        ): HttpResponseFor<ActionStopNoiseSuppressionResponse> =
            stopNoiseSuppression(callControlId, ActionStopNoiseSuppressionParams.none())

        /** @see stopNoiseSuppression */
        @MustBeClosed
        fun stopNoiseSuppression(
            callControlId: String,
            params: ActionStopNoiseSuppressionParams = ActionStopNoiseSuppressionParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActionStopNoiseSuppressionResponse> =
            stopNoiseSuppression(
                params.toBuilder().callControlId(callControlId).build(),
                requestOptions,
            )

        /** @see stopNoiseSuppression */
        @MustBeClosed
        fun stopNoiseSuppression(
            callControlId: String,
            params: ActionStopNoiseSuppressionParams = ActionStopNoiseSuppressionParams.none(),
        ): HttpResponseFor<ActionStopNoiseSuppressionResponse> =
            stopNoiseSuppression(callControlId, params, RequestOptions.none())

        /** @see stopNoiseSuppression */
        @MustBeClosed
        fun stopNoiseSuppression(
            params: ActionStopNoiseSuppressionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActionStopNoiseSuppressionResponse>

        /** @see stopNoiseSuppression */
        @MustBeClosed
        fun stopNoiseSuppression(
            params: ActionStopNoiseSuppressionParams
        ): HttpResponseFor<ActionStopNoiseSuppressionResponse> =
            stopNoiseSuppression(params, RequestOptions.none())

        /** @see stopNoiseSuppression */
        @MustBeClosed
        fun stopNoiseSuppression(
            callControlId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ActionStopNoiseSuppressionResponse> =
            stopNoiseSuppression(
                callControlId,
                ActionStopNoiseSuppressionParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `post /calls/{call_control_id}/actions/playback_stop`,
         * but is otherwise the same as [ActionService.stopPlayback].
         */
        @MustBeClosed
        fun stopPlayback(callControlId: String): HttpResponseFor<ActionStopPlaybackResponse> =
            stopPlayback(callControlId, ActionStopPlaybackParams.none())

        /** @see stopPlayback */
        @MustBeClosed
        fun stopPlayback(
            callControlId: String,
            params: ActionStopPlaybackParams = ActionStopPlaybackParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActionStopPlaybackResponse> =
            stopPlayback(params.toBuilder().callControlId(callControlId).build(), requestOptions)

        /** @see stopPlayback */
        @MustBeClosed
        fun stopPlayback(
            callControlId: String,
            params: ActionStopPlaybackParams = ActionStopPlaybackParams.none(),
        ): HttpResponseFor<ActionStopPlaybackResponse> =
            stopPlayback(callControlId, params, RequestOptions.none())

        /** @see stopPlayback */
        @MustBeClosed
        fun stopPlayback(
            params: ActionStopPlaybackParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActionStopPlaybackResponse>

        /** @see stopPlayback */
        @MustBeClosed
        fun stopPlayback(
            params: ActionStopPlaybackParams
        ): HttpResponseFor<ActionStopPlaybackResponse> = stopPlayback(params, RequestOptions.none())

        /** @see stopPlayback */
        @MustBeClosed
        fun stopPlayback(
            callControlId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ActionStopPlaybackResponse> =
            stopPlayback(callControlId, ActionStopPlaybackParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /calls/{call_control_id}/actions/record_stop`, but
         * is otherwise the same as [ActionService.stopRecording].
         */
        @MustBeClosed
        fun stopRecording(
            callControlId: String,
            params: ActionStopRecordingParams,
        ): HttpResponseFor<ActionStopRecordingResponse> =
            stopRecording(callControlId, params, RequestOptions.none())

        /** @see stopRecording */
        @MustBeClosed
        fun stopRecording(
            callControlId: String,
            params: ActionStopRecordingParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActionStopRecordingResponse> =
            stopRecording(params.toBuilder().callControlId(callControlId).build(), requestOptions)

        /** @see stopRecording */
        @MustBeClosed
        fun stopRecording(
            params: ActionStopRecordingParams
        ): HttpResponseFor<ActionStopRecordingResponse> =
            stopRecording(params, RequestOptions.none())

        /** @see stopRecording */
        @MustBeClosed
        fun stopRecording(
            params: ActionStopRecordingParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActionStopRecordingResponse>

        /**
         * Returns a raw HTTP response for `post /calls/{call_control_id}/actions/siprec_stop`, but
         * is otherwise the same as [ActionService.stopSiprec].
         */
        @MustBeClosed
        fun stopSiprec(callControlId: String): HttpResponseFor<ActionStopSiprecResponse> =
            stopSiprec(callControlId, ActionStopSiprecParams.none())

        /** @see stopSiprec */
        @MustBeClosed
        fun stopSiprec(
            callControlId: String,
            params: ActionStopSiprecParams = ActionStopSiprecParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActionStopSiprecResponse> =
            stopSiprec(params.toBuilder().callControlId(callControlId).build(), requestOptions)

        /** @see stopSiprec */
        @MustBeClosed
        fun stopSiprec(
            callControlId: String,
            params: ActionStopSiprecParams = ActionStopSiprecParams.none(),
        ): HttpResponseFor<ActionStopSiprecResponse> =
            stopSiprec(callControlId, params, RequestOptions.none())

        /** @see stopSiprec */
        @MustBeClosed
        fun stopSiprec(
            params: ActionStopSiprecParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActionStopSiprecResponse>

        /** @see stopSiprec */
        @MustBeClosed
        fun stopSiprec(params: ActionStopSiprecParams): HttpResponseFor<ActionStopSiprecResponse> =
            stopSiprec(params, RequestOptions.none())

        /** @see stopSiprec */
        @MustBeClosed
        fun stopSiprec(
            callControlId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ActionStopSiprecResponse> =
            stopSiprec(callControlId, ActionStopSiprecParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /calls/{call_control_id}/actions/streaming_stop`,
         * but is otherwise the same as [ActionService.stopStreaming].
         */
        @MustBeClosed
        fun stopStreaming(callControlId: String): HttpResponseFor<ActionStopStreamingResponse> =
            stopStreaming(callControlId, ActionStopStreamingParams.none())

        /** @see stopStreaming */
        @MustBeClosed
        fun stopStreaming(
            callControlId: String,
            params: ActionStopStreamingParams = ActionStopStreamingParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActionStopStreamingResponse> =
            stopStreaming(params.toBuilder().callControlId(callControlId).build(), requestOptions)

        /** @see stopStreaming */
        @MustBeClosed
        fun stopStreaming(
            callControlId: String,
            params: ActionStopStreamingParams = ActionStopStreamingParams.none(),
        ): HttpResponseFor<ActionStopStreamingResponse> =
            stopStreaming(callControlId, params, RequestOptions.none())

        /** @see stopStreaming */
        @MustBeClosed
        fun stopStreaming(
            params: ActionStopStreamingParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActionStopStreamingResponse>

        /** @see stopStreaming */
        @MustBeClosed
        fun stopStreaming(
            params: ActionStopStreamingParams
        ): HttpResponseFor<ActionStopStreamingResponse> =
            stopStreaming(params, RequestOptions.none())

        /** @see stopStreaming */
        @MustBeClosed
        fun stopStreaming(
            callControlId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ActionStopStreamingResponse> =
            stopStreaming(callControlId, ActionStopStreamingParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /calls/{call_control_id}/actions/transcription_stop`, but is otherwise the same as
         * [ActionService.stopTranscription].
         */
        @MustBeClosed
        fun stopTranscription(
            callControlId: String
        ): HttpResponseFor<ActionStopTranscriptionResponse> =
            stopTranscription(callControlId, ActionStopTranscriptionParams.none())

        /** @see stopTranscription */
        @MustBeClosed
        fun stopTranscription(
            callControlId: String,
            params: ActionStopTranscriptionParams = ActionStopTranscriptionParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActionStopTranscriptionResponse> =
            stopTranscription(
                params.toBuilder().callControlId(callControlId).build(),
                requestOptions,
            )

        /** @see stopTranscription */
        @MustBeClosed
        fun stopTranscription(
            callControlId: String,
            params: ActionStopTranscriptionParams = ActionStopTranscriptionParams.none(),
        ): HttpResponseFor<ActionStopTranscriptionResponse> =
            stopTranscription(callControlId, params, RequestOptions.none())

        /** @see stopTranscription */
        @MustBeClosed
        fun stopTranscription(
            params: ActionStopTranscriptionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActionStopTranscriptionResponse>

        /** @see stopTranscription */
        @MustBeClosed
        fun stopTranscription(
            params: ActionStopTranscriptionParams
        ): HttpResponseFor<ActionStopTranscriptionResponse> =
            stopTranscription(params, RequestOptions.none())

        /** @see stopTranscription */
        @MustBeClosed
        fun stopTranscription(
            callControlId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ActionStopTranscriptionResponse> =
            stopTranscription(callControlId, ActionStopTranscriptionParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /calls/{call_control_id}/actions/switch_supervisor_role`, but is otherwise the same as
         * [ActionService.switchSupervisorRole].
         */
        @MustBeClosed
        fun switchSupervisorRole(
            callControlId: String,
            params: ActionSwitchSupervisorRoleParams,
        ): HttpResponseFor<ActionSwitchSupervisorRoleResponse> =
            switchSupervisorRole(callControlId, params, RequestOptions.none())

        /** @see switchSupervisorRole */
        @MustBeClosed
        fun switchSupervisorRole(
            callControlId: String,
            params: ActionSwitchSupervisorRoleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActionSwitchSupervisorRoleResponse> =
            switchSupervisorRole(
                params.toBuilder().callControlId(callControlId).build(),
                requestOptions,
            )

        /** @see switchSupervisorRole */
        @MustBeClosed
        fun switchSupervisorRole(
            params: ActionSwitchSupervisorRoleParams
        ): HttpResponseFor<ActionSwitchSupervisorRoleResponse> =
            switchSupervisorRole(params, RequestOptions.none())

        /** @see switchSupervisorRole */
        @MustBeClosed
        fun switchSupervisorRole(
            params: ActionSwitchSupervisorRoleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActionSwitchSupervisorRoleResponse>

        /**
         * Returns a raw HTTP response for `post /calls/{call_control_id}/actions/transfer`, but is
         * otherwise the same as [ActionService.transfer].
         */
        @MustBeClosed
        fun transfer(
            callControlId: String,
            params: ActionTransferParams,
        ): HttpResponseFor<ActionTransferResponse> =
            transfer(callControlId, params, RequestOptions.none())

        /** @see transfer */
        @MustBeClosed
        fun transfer(
            callControlId: String,
            params: ActionTransferParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActionTransferResponse> =
            transfer(params.toBuilder().callControlId(callControlId).build(), requestOptions)

        /** @see transfer */
        @MustBeClosed
        fun transfer(params: ActionTransferParams): HttpResponseFor<ActionTransferResponse> =
            transfer(params, RequestOptions.none())

        /** @see transfer */
        @MustBeClosed
        fun transfer(
            params: ActionTransferParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActionTransferResponse>

        /**
         * Returns a raw HTTP response for `put
         * /calls/{call_control_id}/actions/client_state_update`, but is otherwise the same as
         * [ActionService.updateClientState].
         */
        @MustBeClosed
        fun updateClientState(
            callControlId: String,
            params: ActionUpdateClientStateParams,
        ): HttpResponseFor<ActionUpdateClientStateResponse> =
            updateClientState(callControlId, params, RequestOptions.none())

        /** @see updateClientState */
        @MustBeClosed
        fun updateClientState(
            callControlId: String,
            params: ActionUpdateClientStateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActionUpdateClientStateResponse> =
            updateClientState(
                params.toBuilder().callControlId(callControlId).build(),
                requestOptions,
            )

        /** @see updateClientState */
        @MustBeClosed
        fun updateClientState(
            params: ActionUpdateClientStateParams
        ): HttpResponseFor<ActionUpdateClientStateResponse> =
            updateClientState(params, RequestOptions.none())

        /** @see updateClientState */
        @MustBeClosed
        fun updateClientState(
            params: ActionUpdateClientStateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActionUpdateClientStateResponse>
    }
}
