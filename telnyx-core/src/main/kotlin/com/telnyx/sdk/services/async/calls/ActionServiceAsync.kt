// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.calls

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
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface ActionServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ActionServiceAsync

    /** Add messages to the conversation started by an AI assistant on the call. */
    fun addAiAssistantMessages(
        callControlId: String
    ): CompletableFuture<ActionAddAiAssistantMessagesResponse> =
        addAiAssistantMessages(callControlId, ActionAddAiAssistantMessagesParams.none())

    /** @see addAiAssistantMessages */
    fun addAiAssistantMessages(
        callControlId: String,
        params: ActionAddAiAssistantMessagesParams = ActionAddAiAssistantMessagesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActionAddAiAssistantMessagesResponse> =
        addAiAssistantMessages(
            params.toBuilder().callControlId(callControlId).build(),
            requestOptions,
        )

    /** @see addAiAssistantMessages */
    fun addAiAssistantMessages(
        callControlId: String,
        params: ActionAddAiAssistantMessagesParams = ActionAddAiAssistantMessagesParams.none(),
    ): CompletableFuture<ActionAddAiAssistantMessagesResponse> =
        addAiAssistantMessages(callControlId, params, RequestOptions.none())

    /** @see addAiAssistantMessages */
    fun addAiAssistantMessages(
        params: ActionAddAiAssistantMessagesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActionAddAiAssistantMessagesResponse>

    /** @see addAiAssistantMessages */
    fun addAiAssistantMessages(
        params: ActionAddAiAssistantMessagesParams
    ): CompletableFuture<ActionAddAiAssistantMessagesResponse> =
        addAiAssistantMessages(params, RequestOptions.none())

    /** @see addAiAssistantMessages */
    fun addAiAssistantMessages(
        callControlId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ActionAddAiAssistantMessagesResponse> =
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
    fun answer(callControlId: String): CompletableFuture<ActionAnswerResponse> =
        answer(callControlId, ActionAnswerParams.none())

    /** @see answer */
    fun answer(
        callControlId: String,
        params: ActionAnswerParams = ActionAnswerParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActionAnswerResponse> =
        answer(params.toBuilder().callControlId(callControlId).build(), requestOptions)

    /** @see answer */
    fun answer(
        callControlId: String,
        params: ActionAnswerParams = ActionAnswerParams.none(),
    ): CompletableFuture<ActionAnswerResponse> =
        answer(callControlId, params, RequestOptions.none())

    /** @see answer */
    fun answer(
        params: ActionAnswerParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActionAnswerResponse>

    /** @see answer */
    fun answer(params: ActionAnswerParams): CompletableFuture<ActionAnswerResponse> =
        answer(params, RequestOptions.none())

    /** @see answer */
    fun answer(
        callControlId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ActionAnswerResponse> =
        answer(callControlId, ActionAnswerParams.none(), requestOptions)

    /**
     * Bridge two call control calls.
     *
     * **Expected Webhooks:**
     * - `call.bridged` for Leg A
     * - `call.bridged` for Leg B
     */
    fun bridge(
        callControlIdToBridge: String,
        params: ActionBridgeParams,
    ): CompletableFuture<ActionBridgeResponse> =
        bridge(callControlIdToBridge, params, RequestOptions.none())

    /** @see bridge */
    fun bridge(
        callControlIdToBridge: String,
        params: ActionBridgeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActionBridgeResponse> =
        bridge(
            params.toBuilder().callControlIdToBridge(callControlIdToBridge).build(),
            requestOptions,
        )

    /** @see bridge */
    fun bridge(params: ActionBridgeParams): CompletableFuture<ActionBridgeResponse> =
        bridge(params, RequestOptions.none())

    /** @see bridge */
    fun bridge(
        params: ActionBridgeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActionBridgeResponse>

    /** Put the call in a queue. */
    fun enqueue(
        callControlId: String,
        params: ActionEnqueueParams,
    ): CompletableFuture<ActionEnqueueResponse> =
        enqueue(callControlId, params, RequestOptions.none())

    /** @see enqueue */
    fun enqueue(
        callControlId: String,
        params: ActionEnqueueParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActionEnqueueResponse> =
        enqueue(params.toBuilder().callControlId(callControlId).build(), requestOptions)

    /** @see enqueue */
    fun enqueue(params: ActionEnqueueParams): CompletableFuture<ActionEnqueueResponse> =
        enqueue(params, RequestOptions.none())

    /** @see enqueue */
    fun enqueue(
        params: ActionEnqueueParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActionEnqueueResponse>

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
    fun gather(callControlId: String): CompletableFuture<ActionGatherResponse> =
        gather(callControlId, ActionGatherParams.none())

    /** @see gather */
    fun gather(
        callControlId: String,
        params: ActionGatherParams = ActionGatherParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActionGatherResponse> =
        gather(params.toBuilder().callControlId(callControlId).build(), requestOptions)

    /** @see gather */
    fun gather(
        callControlId: String,
        params: ActionGatherParams = ActionGatherParams.none(),
    ): CompletableFuture<ActionGatherResponse> =
        gather(callControlId, params, RequestOptions.none())

    /** @see gather */
    fun gather(
        params: ActionGatherParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActionGatherResponse>

    /** @see gather */
    fun gather(params: ActionGatherParams): CompletableFuture<ActionGatherResponse> =
        gather(params, RequestOptions.none())

    /** @see gather */
    fun gather(
        callControlId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ActionGatherResponse> =
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
    ): CompletableFuture<ActionGatherUsingAiResponse> =
        gatherUsingAi(callControlId, params, RequestOptions.none())

    /** @see gatherUsingAi */
    fun gatherUsingAi(
        callControlId: String,
        params: ActionGatherUsingAiParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActionGatherUsingAiResponse> =
        gatherUsingAi(params.toBuilder().callControlId(callControlId).build(), requestOptions)

    /** @see gatherUsingAi */
    fun gatherUsingAi(
        params: ActionGatherUsingAiParams
    ): CompletableFuture<ActionGatherUsingAiResponse> = gatherUsingAi(params, RequestOptions.none())

    /** @see gatherUsingAi */
    fun gatherUsingAi(
        params: ActionGatherUsingAiParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActionGatherUsingAiResponse>

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
    fun gatherUsingAudio(callControlId: String): CompletableFuture<ActionGatherUsingAudioResponse> =
        gatherUsingAudio(callControlId, ActionGatherUsingAudioParams.none())

    /** @see gatherUsingAudio */
    fun gatherUsingAudio(
        callControlId: String,
        params: ActionGatherUsingAudioParams = ActionGatherUsingAudioParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActionGatherUsingAudioResponse> =
        gatherUsingAudio(params.toBuilder().callControlId(callControlId).build(), requestOptions)

    /** @see gatherUsingAudio */
    fun gatherUsingAudio(
        callControlId: String,
        params: ActionGatherUsingAudioParams = ActionGatherUsingAudioParams.none(),
    ): CompletableFuture<ActionGatherUsingAudioResponse> =
        gatherUsingAudio(callControlId, params, RequestOptions.none())

    /** @see gatherUsingAudio */
    fun gatherUsingAudio(
        params: ActionGatherUsingAudioParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActionGatherUsingAudioResponse>

    /** @see gatherUsingAudio */
    fun gatherUsingAudio(
        params: ActionGatherUsingAudioParams
    ): CompletableFuture<ActionGatherUsingAudioResponse> =
        gatherUsingAudio(params, RequestOptions.none())

    /** @see gatherUsingAudio */
    fun gatherUsingAudio(
        callControlId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ActionGatherUsingAudioResponse> =
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
    ): CompletableFuture<ActionGatherUsingSpeakResponse> =
        gatherUsingSpeak(callControlId, params, RequestOptions.none())

    /** @see gatherUsingSpeak */
    fun gatherUsingSpeak(
        callControlId: String,
        params: ActionGatherUsingSpeakParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActionGatherUsingSpeakResponse> =
        gatherUsingSpeak(params.toBuilder().callControlId(callControlId).build(), requestOptions)

    /** @see gatherUsingSpeak */
    fun gatherUsingSpeak(
        params: ActionGatherUsingSpeakParams
    ): CompletableFuture<ActionGatherUsingSpeakResponse> =
        gatherUsingSpeak(params, RequestOptions.none())

    /** @see gatherUsingSpeak */
    fun gatherUsingSpeak(
        params: ActionGatherUsingSpeakParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActionGatherUsingSpeakResponse>

    /**
     * Hang up the call.
     *
     * **Expected Webhooks:**
     * - `call.hangup`
     * - `call.recording.saved`
     */
    fun hangup(callControlId: String): CompletableFuture<ActionHangupResponse> =
        hangup(callControlId, ActionHangupParams.none())

    /** @see hangup */
    fun hangup(
        callControlId: String,
        params: ActionHangupParams = ActionHangupParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActionHangupResponse> =
        hangup(params.toBuilder().callControlId(callControlId).build(), requestOptions)

    /** @see hangup */
    fun hangup(
        callControlId: String,
        params: ActionHangupParams = ActionHangupParams.none(),
    ): CompletableFuture<ActionHangupResponse> =
        hangup(callControlId, params, RequestOptions.none())

    /** @see hangup */
    fun hangup(
        params: ActionHangupParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActionHangupResponse>

    /** @see hangup */
    fun hangup(params: ActionHangupParams): CompletableFuture<ActionHangupResponse> =
        hangup(params, RequestOptions.none())

    /** @see hangup */
    fun hangup(
        callControlId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ActionHangupResponse> =
        hangup(callControlId, ActionHangupParams.none(), requestOptions)

    /** Removes the call from a queue. */
    fun leaveQueue(callControlId: String): CompletableFuture<ActionLeaveQueueResponse> =
        leaveQueue(callControlId, ActionLeaveQueueParams.none())

    /** @see leaveQueue */
    fun leaveQueue(
        callControlId: String,
        params: ActionLeaveQueueParams = ActionLeaveQueueParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActionLeaveQueueResponse> =
        leaveQueue(params.toBuilder().callControlId(callControlId).build(), requestOptions)

    /** @see leaveQueue */
    fun leaveQueue(
        callControlId: String,
        params: ActionLeaveQueueParams = ActionLeaveQueueParams.none(),
    ): CompletableFuture<ActionLeaveQueueResponse> =
        leaveQueue(callControlId, params, RequestOptions.none())

    /** @see leaveQueue */
    fun leaveQueue(
        params: ActionLeaveQueueParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActionLeaveQueueResponse>

    /** @see leaveQueue */
    fun leaveQueue(params: ActionLeaveQueueParams): CompletableFuture<ActionLeaveQueueResponse> =
        leaveQueue(params, RequestOptions.none())

    /** @see leaveQueue */
    fun leaveQueue(
        callControlId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ActionLeaveQueueResponse> =
        leaveQueue(callControlId, ActionLeaveQueueParams.none(), requestOptions)

    /**
     * Pause recording the call. Recording can be resumed via Resume recording command.
     *
     * **Expected Webhooks:**
     *
     * There are no webhooks associated with this command.
     */
    fun pauseRecording(callControlId: String): CompletableFuture<ActionPauseRecordingResponse> =
        pauseRecording(callControlId, ActionPauseRecordingParams.none())

    /** @see pauseRecording */
    fun pauseRecording(
        callControlId: String,
        params: ActionPauseRecordingParams = ActionPauseRecordingParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActionPauseRecordingResponse> =
        pauseRecording(params.toBuilder().callControlId(callControlId).build(), requestOptions)

    /** @see pauseRecording */
    fun pauseRecording(
        callControlId: String,
        params: ActionPauseRecordingParams = ActionPauseRecordingParams.none(),
    ): CompletableFuture<ActionPauseRecordingResponse> =
        pauseRecording(callControlId, params, RequestOptions.none())

    /** @see pauseRecording */
    fun pauseRecording(
        params: ActionPauseRecordingParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActionPauseRecordingResponse>

    /** @see pauseRecording */
    fun pauseRecording(
        params: ActionPauseRecordingParams
    ): CompletableFuture<ActionPauseRecordingResponse> =
        pauseRecording(params, RequestOptions.none())

    /** @see pauseRecording */
    fun pauseRecording(
        callControlId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ActionPauseRecordingResponse> =
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
    fun refer(
        callControlId: String,
        params: ActionReferParams,
    ): CompletableFuture<ActionReferResponse> = refer(callControlId, params, RequestOptions.none())

    /** @see refer */
    fun refer(
        callControlId: String,
        params: ActionReferParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActionReferResponse> =
        refer(params.toBuilder().callControlId(callControlId).build(), requestOptions)

    /** @see refer */
    fun refer(params: ActionReferParams): CompletableFuture<ActionReferResponse> =
        refer(params, RequestOptions.none())

    /** @see refer */
    fun refer(
        params: ActionReferParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActionReferResponse>

    /**
     * Reject an incoming call.
     *
     * **Expected Webhooks:**
     * - `call.hangup`
     */
    fun reject(
        callControlId: String,
        params: ActionRejectParams,
    ): CompletableFuture<ActionRejectResponse> =
        reject(callControlId, params, RequestOptions.none())

    /** @see reject */
    fun reject(
        callControlId: String,
        params: ActionRejectParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActionRejectResponse> =
        reject(params.toBuilder().callControlId(callControlId).build(), requestOptions)

    /** @see reject */
    fun reject(params: ActionRejectParams): CompletableFuture<ActionRejectResponse> =
        reject(params, RequestOptions.none())

    /** @see reject */
    fun reject(
        params: ActionRejectParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActionRejectResponse>

    /**
     * Resume recording the call.
     *
     * **Expected Webhooks:**
     *
     * There are no webhooks associated with this command.
     */
    fun resumeRecording(callControlId: String): CompletableFuture<ActionResumeRecordingResponse> =
        resumeRecording(callControlId, ActionResumeRecordingParams.none())

    /** @see resumeRecording */
    fun resumeRecording(
        callControlId: String,
        params: ActionResumeRecordingParams = ActionResumeRecordingParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActionResumeRecordingResponse> =
        resumeRecording(params.toBuilder().callControlId(callControlId).build(), requestOptions)

    /** @see resumeRecording */
    fun resumeRecording(
        callControlId: String,
        params: ActionResumeRecordingParams = ActionResumeRecordingParams.none(),
    ): CompletableFuture<ActionResumeRecordingResponse> =
        resumeRecording(callControlId, params, RequestOptions.none())

    /** @see resumeRecording */
    fun resumeRecording(
        params: ActionResumeRecordingParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActionResumeRecordingResponse>

    /** @see resumeRecording */
    fun resumeRecording(
        params: ActionResumeRecordingParams
    ): CompletableFuture<ActionResumeRecordingResponse> =
        resumeRecording(params, RequestOptions.none())

    /** @see resumeRecording */
    fun resumeRecording(
        callControlId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ActionResumeRecordingResponse> =
        resumeRecording(callControlId, ActionResumeRecordingParams.none(), requestOptions)

    /**
     * Sends DTMF tones from this leg. DTMF tones will be heard by the other end of the call.
     *
     * **Expected Webhooks:**
     *
     * There are no webhooks associated with this command.
     */
    fun sendDtmf(
        callControlId: String,
        params: ActionSendDtmfParams,
    ): CompletableFuture<ActionSendDtmfResponse> =
        sendDtmf(callControlId, params, RequestOptions.none())

    /** @see sendDtmf */
    fun sendDtmf(
        callControlId: String,
        params: ActionSendDtmfParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActionSendDtmfResponse> =
        sendDtmf(params.toBuilder().callControlId(callControlId).build(), requestOptions)

    /** @see sendDtmf */
    fun sendDtmf(params: ActionSendDtmfParams): CompletableFuture<ActionSendDtmfResponse> =
        sendDtmf(params, RequestOptions.none())

    /** @see sendDtmf */
    fun sendDtmf(
        params: ActionSendDtmfParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActionSendDtmfResponse>

    /**
     * Sends SIP info from this leg.
     *
     * **Expected Webhooks:**
     * - `call.sip_info.received` (to be received on the target call leg)
     */
    fun sendSipInfo(
        callControlId: String,
        params: ActionSendSipInfoParams,
    ): CompletableFuture<ActionSendSipInfoResponse> =
        sendSipInfo(callControlId, params, RequestOptions.none())

    /** @see sendSipInfo */
    fun sendSipInfo(
        callControlId: String,
        params: ActionSendSipInfoParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActionSendSipInfoResponse> =
        sendSipInfo(params.toBuilder().callControlId(callControlId).build(), requestOptions)

    /** @see sendSipInfo */
    fun sendSipInfo(params: ActionSendSipInfoParams): CompletableFuture<ActionSendSipInfoResponse> =
        sendSipInfo(params, RequestOptions.none())

    /** @see sendSipInfo */
    fun sendSipInfo(
        params: ActionSendSipInfoParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActionSendSipInfoResponse>

    /**
     * Convert text to speech and play it back on the call. If multiple speak text commands are
     * issued consecutively, the audio files will be placed in a queue awaiting playback.
     *
     * **Expected Webhooks:**
     * - `call.speak.started`
     * - `call.speak.ended`
     */
    fun speak(
        callControlId: String,
        params: ActionSpeakParams,
    ): CompletableFuture<ActionSpeakResponse> = speak(callControlId, params, RequestOptions.none())

    /** @see speak */
    fun speak(
        callControlId: String,
        params: ActionSpeakParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActionSpeakResponse> =
        speak(params.toBuilder().callControlId(callControlId).build(), requestOptions)

    /** @see speak */
    fun speak(params: ActionSpeakParams): CompletableFuture<ActionSpeakResponse> =
        speak(params, RequestOptions.none())

    /** @see speak */
    fun speak(
        params: ActionSpeakParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActionSpeakResponse>

    /**
     * Start an AI assistant on the call.
     *
     * **Expected Webhooks:**
     * - `call.conversation.ended`
     * - `call.conversation_insights.generated`
     */
    fun startAiAssistant(callControlId: String): CompletableFuture<ActionStartAiAssistantResponse> =
        startAiAssistant(callControlId, ActionStartAiAssistantParams.none())

    /** @see startAiAssistant */
    fun startAiAssistant(
        callControlId: String,
        params: ActionStartAiAssistantParams = ActionStartAiAssistantParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActionStartAiAssistantResponse> =
        startAiAssistant(params.toBuilder().callControlId(callControlId).build(), requestOptions)

    /** @see startAiAssistant */
    fun startAiAssistant(
        callControlId: String,
        params: ActionStartAiAssistantParams = ActionStartAiAssistantParams.none(),
    ): CompletableFuture<ActionStartAiAssistantResponse> =
        startAiAssistant(callControlId, params, RequestOptions.none())

    /** @see startAiAssistant */
    fun startAiAssistant(
        params: ActionStartAiAssistantParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActionStartAiAssistantResponse>

    /** @see startAiAssistant */
    fun startAiAssistant(
        params: ActionStartAiAssistantParams
    ): CompletableFuture<ActionStartAiAssistantResponse> =
        startAiAssistant(params, RequestOptions.none())

    /** @see startAiAssistant */
    fun startAiAssistant(
        callControlId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ActionStartAiAssistantResponse> =
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
    fun startForking(callControlId: String): CompletableFuture<ActionStartForkingResponse> =
        startForking(callControlId, ActionStartForkingParams.none())

    /** @see startForking */
    fun startForking(
        callControlId: String,
        params: ActionStartForkingParams = ActionStartForkingParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActionStartForkingResponse> =
        startForking(params.toBuilder().callControlId(callControlId).build(), requestOptions)

    /** @see startForking */
    fun startForking(
        callControlId: String,
        params: ActionStartForkingParams = ActionStartForkingParams.none(),
    ): CompletableFuture<ActionStartForkingResponse> =
        startForking(callControlId, params, RequestOptions.none())

    /** @see startForking */
    fun startForking(
        params: ActionStartForkingParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActionStartForkingResponse>

    /** @see startForking */
    fun startForking(
        params: ActionStartForkingParams
    ): CompletableFuture<ActionStartForkingResponse> = startForking(params, RequestOptions.none())

    /** @see startForking */
    fun startForking(
        callControlId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ActionStartForkingResponse> =
        startForking(callControlId, ActionStartForkingParams.none(), requestOptions)

    /** Noise Suppression Start (BETA) */
    fun startNoiseSuppression(
        callControlId: String
    ): CompletableFuture<ActionStartNoiseSuppressionResponse> =
        startNoiseSuppression(callControlId, ActionStartNoiseSuppressionParams.none())

    /** @see startNoiseSuppression */
    fun startNoiseSuppression(
        callControlId: String,
        params: ActionStartNoiseSuppressionParams = ActionStartNoiseSuppressionParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActionStartNoiseSuppressionResponse> =
        startNoiseSuppression(
            params.toBuilder().callControlId(callControlId).build(),
            requestOptions,
        )

    /** @see startNoiseSuppression */
    fun startNoiseSuppression(
        callControlId: String,
        params: ActionStartNoiseSuppressionParams = ActionStartNoiseSuppressionParams.none(),
    ): CompletableFuture<ActionStartNoiseSuppressionResponse> =
        startNoiseSuppression(callControlId, params, RequestOptions.none())

    /** @see startNoiseSuppression */
    fun startNoiseSuppression(
        params: ActionStartNoiseSuppressionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActionStartNoiseSuppressionResponse>

    /** @see startNoiseSuppression */
    fun startNoiseSuppression(
        params: ActionStartNoiseSuppressionParams
    ): CompletableFuture<ActionStartNoiseSuppressionResponse> =
        startNoiseSuppression(params, RequestOptions.none())

    /** @see startNoiseSuppression */
    fun startNoiseSuppression(
        callControlId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ActionStartNoiseSuppressionResponse> =
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
    fun startPlayback(callControlId: String): CompletableFuture<ActionStartPlaybackResponse> =
        startPlayback(callControlId, ActionStartPlaybackParams.none())

    /** @see startPlayback */
    fun startPlayback(
        callControlId: String,
        params: ActionStartPlaybackParams = ActionStartPlaybackParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActionStartPlaybackResponse> =
        startPlayback(params.toBuilder().callControlId(callControlId).build(), requestOptions)

    /** @see startPlayback */
    fun startPlayback(
        callControlId: String,
        params: ActionStartPlaybackParams = ActionStartPlaybackParams.none(),
    ): CompletableFuture<ActionStartPlaybackResponse> =
        startPlayback(callControlId, params, RequestOptions.none())

    /** @see startPlayback */
    fun startPlayback(
        params: ActionStartPlaybackParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActionStartPlaybackResponse>

    /** @see startPlayback */
    fun startPlayback(
        params: ActionStartPlaybackParams
    ): CompletableFuture<ActionStartPlaybackResponse> = startPlayback(params, RequestOptions.none())

    /** @see startPlayback */
    fun startPlayback(
        callControlId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ActionStartPlaybackResponse> =
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
    ): CompletableFuture<ActionStartRecordingResponse> =
        startRecording(callControlId, params, RequestOptions.none())

    /** @see startRecording */
    fun startRecording(
        callControlId: String,
        params: ActionStartRecordingParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActionStartRecordingResponse> =
        startRecording(params.toBuilder().callControlId(callControlId).build(), requestOptions)

    /** @see startRecording */
    fun startRecording(
        params: ActionStartRecordingParams
    ): CompletableFuture<ActionStartRecordingResponse> =
        startRecording(params, RequestOptions.none())

    /** @see startRecording */
    fun startRecording(
        params: ActionStartRecordingParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActionStartRecordingResponse>

    /**
     * Start siprec session to configured in SIPREC connector SRS.
     *
     * **Expected Webhooks:**
     * - `siprec.started`
     * - `siprec.stopped`
     * - `siprec.failed`
     */
    fun startSiprec(callControlId: String): CompletableFuture<ActionStartSiprecResponse> =
        startSiprec(callControlId, ActionStartSiprecParams.none())

    /** @see startSiprec */
    fun startSiprec(
        callControlId: String,
        params: ActionStartSiprecParams = ActionStartSiprecParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActionStartSiprecResponse> =
        startSiprec(params.toBuilder().callControlId(callControlId).build(), requestOptions)

    /** @see startSiprec */
    fun startSiprec(
        callControlId: String,
        params: ActionStartSiprecParams = ActionStartSiprecParams.none(),
    ): CompletableFuture<ActionStartSiprecResponse> =
        startSiprec(callControlId, params, RequestOptions.none())

    /** @see startSiprec */
    fun startSiprec(
        params: ActionStartSiprecParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActionStartSiprecResponse>

    /** @see startSiprec */
    fun startSiprec(params: ActionStartSiprecParams): CompletableFuture<ActionStartSiprecResponse> =
        startSiprec(params, RequestOptions.none())

    /** @see startSiprec */
    fun startSiprec(
        callControlId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ActionStartSiprecResponse> =
        startSiprec(callControlId, ActionStartSiprecParams.none(), requestOptions)

    /**
     * Start streaming the media from a call to a specific WebSocket address or Dialogflow
     * connection in near-realtime. Audio will be delivered as base64-encoded RTP payload (raw
     * audio), wrapped in JSON payloads.
     *
     * Please find more details about media streaming messages specification under the
     * [link](https://developers.telnyx.com/docs/voice/programmable-voice/media-streaming).
     */
    fun startStreaming(callControlId: String): CompletableFuture<ActionStartStreamingResponse> =
        startStreaming(callControlId, ActionStartStreamingParams.none())

    /** @see startStreaming */
    fun startStreaming(
        callControlId: String,
        params: ActionStartStreamingParams = ActionStartStreamingParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActionStartStreamingResponse> =
        startStreaming(params.toBuilder().callControlId(callControlId).build(), requestOptions)

    /** @see startStreaming */
    fun startStreaming(
        callControlId: String,
        params: ActionStartStreamingParams = ActionStartStreamingParams.none(),
    ): CompletableFuture<ActionStartStreamingResponse> =
        startStreaming(callControlId, params, RequestOptions.none())

    /** @see startStreaming */
    fun startStreaming(
        params: ActionStartStreamingParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActionStartStreamingResponse>

    /** @see startStreaming */
    fun startStreaming(
        params: ActionStartStreamingParams
    ): CompletableFuture<ActionStartStreamingResponse> =
        startStreaming(params, RequestOptions.none())

    /** @see startStreaming */
    fun startStreaming(
        callControlId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ActionStartStreamingResponse> =
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
    ): CompletableFuture<ActionStartTranscriptionResponse> =
        startTranscription(callControlId, params, RequestOptions.none())

    /** @see startTranscription */
    fun startTranscription(
        callControlId: String,
        params: ActionStartTranscriptionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActionStartTranscriptionResponse> =
        startTranscription(params.toBuilder().callControlId(callControlId).build(), requestOptions)

    /** @see startTranscription */
    fun startTranscription(
        params: ActionStartTranscriptionParams
    ): CompletableFuture<ActionStartTranscriptionResponse> =
        startTranscription(params, RequestOptions.none())

    /** @see startTranscription */
    fun startTranscription(
        params: ActionStartTranscriptionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActionStartTranscriptionResponse>

    /** Stop an AI assistant on the call. */
    fun stopAiAssistant(callControlId: String): CompletableFuture<ActionStopAiAssistantResponse> =
        stopAiAssistant(callControlId, ActionStopAiAssistantParams.none())

    /** @see stopAiAssistant */
    fun stopAiAssistant(
        callControlId: String,
        params: ActionStopAiAssistantParams = ActionStopAiAssistantParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActionStopAiAssistantResponse> =
        stopAiAssistant(params.toBuilder().callControlId(callControlId).build(), requestOptions)

    /** @see stopAiAssistant */
    fun stopAiAssistant(
        callControlId: String,
        params: ActionStopAiAssistantParams = ActionStopAiAssistantParams.none(),
    ): CompletableFuture<ActionStopAiAssistantResponse> =
        stopAiAssistant(callControlId, params, RequestOptions.none())

    /** @see stopAiAssistant */
    fun stopAiAssistant(
        params: ActionStopAiAssistantParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActionStopAiAssistantResponse>

    /** @see stopAiAssistant */
    fun stopAiAssistant(
        params: ActionStopAiAssistantParams
    ): CompletableFuture<ActionStopAiAssistantResponse> =
        stopAiAssistant(params, RequestOptions.none())

    /** @see stopAiAssistant */
    fun stopAiAssistant(
        callControlId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ActionStopAiAssistantResponse> =
        stopAiAssistant(callControlId, ActionStopAiAssistantParams.none(), requestOptions)

    /**
     * Stop forking a call.
     *
     * **Expected Webhooks:**
     * - `call.fork.stopped`
     */
    fun stopForking(callControlId: String): CompletableFuture<ActionStopForkingResponse> =
        stopForking(callControlId, ActionStopForkingParams.none())

    /** @see stopForking */
    fun stopForking(
        callControlId: String,
        params: ActionStopForkingParams = ActionStopForkingParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActionStopForkingResponse> =
        stopForking(params.toBuilder().callControlId(callControlId).build(), requestOptions)

    /** @see stopForking */
    fun stopForking(
        callControlId: String,
        params: ActionStopForkingParams = ActionStopForkingParams.none(),
    ): CompletableFuture<ActionStopForkingResponse> =
        stopForking(callControlId, params, RequestOptions.none())

    /** @see stopForking */
    fun stopForking(
        params: ActionStopForkingParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActionStopForkingResponse>

    /** @see stopForking */
    fun stopForking(params: ActionStopForkingParams): CompletableFuture<ActionStopForkingResponse> =
        stopForking(params, RequestOptions.none())

    /** @see stopForking */
    fun stopForking(
        callControlId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ActionStopForkingResponse> =
        stopForking(callControlId, ActionStopForkingParams.none(), requestOptions)

    /**
     * Stop current gather.
     *
     * **Expected Webhooks:**
     * - `call.gather.ended`
     */
    fun stopGather(callControlId: String): CompletableFuture<ActionStopGatherResponse> =
        stopGather(callControlId, ActionStopGatherParams.none())

    /** @see stopGather */
    fun stopGather(
        callControlId: String,
        params: ActionStopGatherParams = ActionStopGatherParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActionStopGatherResponse> =
        stopGather(params.toBuilder().callControlId(callControlId).build(), requestOptions)

    /** @see stopGather */
    fun stopGather(
        callControlId: String,
        params: ActionStopGatherParams = ActionStopGatherParams.none(),
    ): CompletableFuture<ActionStopGatherResponse> =
        stopGather(callControlId, params, RequestOptions.none())

    /** @see stopGather */
    fun stopGather(
        params: ActionStopGatherParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActionStopGatherResponse>

    /** @see stopGather */
    fun stopGather(params: ActionStopGatherParams): CompletableFuture<ActionStopGatherResponse> =
        stopGather(params, RequestOptions.none())

    /** @see stopGather */
    fun stopGather(
        callControlId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ActionStopGatherResponse> =
        stopGather(callControlId, ActionStopGatherParams.none(), requestOptions)

    /** Noise Suppression Stop (BETA) */
    fun stopNoiseSuppression(
        callControlId: String
    ): CompletableFuture<ActionStopNoiseSuppressionResponse> =
        stopNoiseSuppression(callControlId, ActionStopNoiseSuppressionParams.none())

    /** @see stopNoiseSuppression */
    fun stopNoiseSuppression(
        callControlId: String,
        params: ActionStopNoiseSuppressionParams = ActionStopNoiseSuppressionParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActionStopNoiseSuppressionResponse> =
        stopNoiseSuppression(
            params.toBuilder().callControlId(callControlId).build(),
            requestOptions,
        )

    /** @see stopNoiseSuppression */
    fun stopNoiseSuppression(
        callControlId: String,
        params: ActionStopNoiseSuppressionParams = ActionStopNoiseSuppressionParams.none(),
    ): CompletableFuture<ActionStopNoiseSuppressionResponse> =
        stopNoiseSuppression(callControlId, params, RequestOptions.none())

    /** @see stopNoiseSuppression */
    fun stopNoiseSuppression(
        params: ActionStopNoiseSuppressionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActionStopNoiseSuppressionResponse>

    /** @see stopNoiseSuppression */
    fun stopNoiseSuppression(
        params: ActionStopNoiseSuppressionParams
    ): CompletableFuture<ActionStopNoiseSuppressionResponse> =
        stopNoiseSuppression(params, RequestOptions.none())

    /** @see stopNoiseSuppression */
    fun stopNoiseSuppression(
        callControlId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ActionStopNoiseSuppressionResponse> =
        stopNoiseSuppression(callControlId, ActionStopNoiseSuppressionParams.none(), requestOptions)

    /**
     * Stop audio being played on the call.
     *
     * **Expected Webhooks:**
     * - `call.playback.ended` or `call.speak.ended`
     */
    fun stopPlayback(callControlId: String): CompletableFuture<ActionStopPlaybackResponse> =
        stopPlayback(callControlId, ActionStopPlaybackParams.none())

    /** @see stopPlayback */
    fun stopPlayback(
        callControlId: String,
        params: ActionStopPlaybackParams = ActionStopPlaybackParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActionStopPlaybackResponse> =
        stopPlayback(params.toBuilder().callControlId(callControlId).build(), requestOptions)

    /** @see stopPlayback */
    fun stopPlayback(
        callControlId: String,
        params: ActionStopPlaybackParams = ActionStopPlaybackParams.none(),
    ): CompletableFuture<ActionStopPlaybackResponse> =
        stopPlayback(callControlId, params, RequestOptions.none())

    /** @see stopPlayback */
    fun stopPlayback(
        params: ActionStopPlaybackParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActionStopPlaybackResponse>

    /** @see stopPlayback */
    fun stopPlayback(
        params: ActionStopPlaybackParams
    ): CompletableFuture<ActionStopPlaybackResponse> = stopPlayback(params, RequestOptions.none())

    /** @see stopPlayback */
    fun stopPlayback(
        callControlId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ActionStopPlaybackResponse> =
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
    ): CompletableFuture<ActionStopRecordingResponse> =
        stopRecording(callControlId, params, RequestOptions.none())

    /** @see stopRecording */
    fun stopRecording(
        callControlId: String,
        params: ActionStopRecordingParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActionStopRecordingResponse> =
        stopRecording(params.toBuilder().callControlId(callControlId).build(), requestOptions)

    /** @see stopRecording */
    fun stopRecording(
        params: ActionStopRecordingParams
    ): CompletableFuture<ActionStopRecordingResponse> = stopRecording(params, RequestOptions.none())

    /** @see stopRecording */
    fun stopRecording(
        params: ActionStopRecordingParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActionStopRecordingResponse>

    /**
     * Stop SIPREC session.
     *
     * **Expected Webhooks:**
     * - `siprec.stopped`
     */
    fun stopSiprec(callControlId: String): CompletableFuture<ActionStopSiprecResponse> =
        stopSiprec(callControlId, ActionStopSiprecParams.none())

    /** @see stopSiprec */
    fun stopSiprec(
        callControlId: String,
        params: ActionStopSiprecParams = ActionStopSiprecParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActionStopSiprecResponse> =
        stopSiprec(params.toBuilder().callControlId(callControlId).build(), requestOptions)

    /** @see stopSiprec */
    fun stopSiprec(
        callControlId: String,
        params: ActionStopSiprecParams = ActionStopSiprecParams.none(),
    ): CompletableFuture<ActionStopSiprecResponse> =
        stopSiprec(callControlId, params, RequestOptions.none())

    /** @see stopSiprec */
    fun stopSiprec(
        params: ActionStopSiprecParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActionStopSiprecResponse>

    /** @see stopSiprec */
    fun stopSiprec(params: ActionStopSiprecParams): CompletableFuture<ActionStopSiprecResponse> =
        stopSiprec(params, RequestOptions.none())

    /** @see stopSiprec */
    fun stopSiprec(
        callControlId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ActionStopSiprecResponse> =
        stopSiprec(callControlId, ActionStopSiprecParams.none(), requestOptions)

    /**
     * Stop streaming a call to a WebSocket.
     *
     * **Expected Webhooks:**
     * - `streaming.stopped`
     */
    fun stopStreaming(callControlId: String): CompletableFuture<ActionStopStreamingResponse> =
        stopStreaming(callControlId, ActionStopStreamingParams.none())

    /** @see stopStreaming */
    fun stopStreaming(
        callControlId: String,
        params: ActionStopStreamingParams = ActionStopStreamingParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActionStopStreamingResponse> =
        stopStreaming(params.toBuilder().callControlId(callControlId).build(), requestOptions)

    /** @see stopStreaming */
    fun stopStreaming(
        callControlId: String,
        params: ActionStopStreamingParams = ActionStopStreamingParams.none(),
    ): CompletableFuture<ActionStopStreamingResponse> =
        stopStreaming(callControlId, params, RequestOptions.none())

    /** @see stopStreaming */
    fun stopStreaming(
        params: ActionStopStreamingParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActionStopStreamingResponse>

    /** @see stopStreaming */
    fun stopStreaming(
        params: ActionStopStreamingParams
    ): CompletableFuture<ActionStopStreamingResponse> = stopStreaming(params, RequestOptions.none())

    /** @see stopStreaming */
    fun stopStreaming(
        callControlId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ActionStopStreamingResponse> =
        stopStreaming(callControlId, ActionStopStreamingParams.none(), requestOptions)

    /** Stop real-time transcription. */
    fun stopTranscription(
        callControlId: String
    ): CompletableFuture<ActionStopTranscriptionResponse> =
        stopTranscription(callControlId, ActionStopTranscriptionParams.none())

    /** @see stopTranscription */
    fun stopTranscription(
        callControlId: String,
        params: ActionStopTranscriptionParams = ActionStopTranscriptionParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActionStopTranscriptionResponse> =
        stopTranscription(params.toBuilder().callControlId(callControlId).build(), requestOptions)

    /** @see stopTranscription */
    fun stopTranscription(
        callControlId: String,
        params: ActionStopTranscriptionParams = ActionStopTranscriptionParams.none(),
    ): CompletableFuture<ActionStopTranscriptionResponse> =
        stopTranscription(callControlId, params, RequestOptions.none())

    /** @see stopTranscription */
    fun stopTranscription(
        params: ActionStopTranscriptionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActionStopTranscriptionResponse>

    /** @see stopTranscription */
    fun stopTranscription(
        params: ActionStopTranscriptionParams
    ): CompletableFuture<ActionStopTranscriptionResponse> =
        stopTranscription(params, RequestOptions.none())

    /** @see stopTranscription */
    fun stopTranscription(
        callControlId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ActionStopTranscriptionResponse> =
        stopTranscription(callControlId, ActionStopTranscriptionParams.none(), requestOptions)

    /**
     * Switch the supervisor role for a bridged call. This allows switching between different
     * supervisor modes during an active call
     */
    fun switchSupervisorRole(
        callControlId: String,
        params: ActionSwitchSupervisorRoleParams,
    ): CompletableFuture<ActionSwitchSupervisorRoleResponse> =
        switchSupervisorRole(callControlId, params, RequestOptions.none())

    /** @see switchSupervisorRole */
    fun switchSupervisorRole(
        callControlId: String,
        params: ActionSwitchSupervisorRoleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActionSwitchSupervisorRoleResponse> =
        switchSupervisorRole(
            params.toBuilder().callControlId(callControlId).build(),
            requestOptions,
        )

    /** @see switchSupervisorRole */
    fun switchSupervisorRole(
        params: ActionSwitchSupervisorRoleParams
    ): CompletableFuture<ActionSwitchSupervisorRoleResponse> =
        switchSupervisorRole(params, RequestOptions.none())

    /** @see switchSupervisorRole */
    fun switchSupervisorRole(
        params: ActionSwitchSupervisorRoleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActionSwitchSupervisorRoleResponse>

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
    fun transfer(
        callControlId: String,
        params: ActionTransferParams,
    ): CompletableFuture<ActionTransferResponse> =
        transfer(callControlId, params, RequestOptions.none())

    /** @see transfer */
    fun transfer(
        callControlId: String,
        params: ActionTransferParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActionTransferResponse> =
        transfer(params.toBuilder().callControlId(callControlId).build(), requestOptions)

    /** @see transfer */
    fun transfer(params: ActionTransferParams): CompletableFuture<ActionTransferResponse> =
        transfer(params, RequestOptions.none())

    /** @see transfer */
    fun transfer(
        params: ActionTransferParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActionTransferResponse>

    /** Updates client state */
    fun updateClientState(
        callControlId: String,
        params: ActionUpdateClientStateParams,
    ): CompletableFuture<ActionUpdateClientStateResponse> =
        updateClientState(callControlId, params, RequestOptions.none())

    /** @see updateClientState */
    fun updateClientState(
        callControlId: String,
        params: ActionUpdateClientStateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActionUpdateClientStateResponse> =
        updateClientState(params.toBuilder().callControlId(callControlId).build(), requestOptions)

    /** @see updateClientState */
    fun updateClientState(
        params: ActionUpdateClientStateParams
    ): CompletableFuture<ActionUpdateClientStateResponse> =
        updateClientState(params, RequestOptions.none())

    /** @see updateClientState */
    fun updateClientState(
        params: ActionUpdateClientStateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActionUpdateClientStateResponse>

    /**
     * A view of [ActionServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ActionServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post
         * /calls/{call_control_id}/actions/ai_assistant_add_messages`, but is otherwise the same as
         * [ActionServiceAsync.addAiAssistantMessages].
         */
        fun addAiAssistantMessages(
            callControlId: String
        ): CompletableFuture<HttpResponseFor<ActionAddAiAssistantMessagesResponse>> =
            addAiAssistantMessages(callControlId, ActionAddAiAssistantMessagesParams.none())

        /** @see addAiAssistantMessages */
        fun addAiAssistantMessages(
            callControlId: String,
            params: ActionAddAiAssistantMessagesParams = ActionAddAiAssistantMessagesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActionAddAiAssistantMessagesResponse>> =
            addAiAssistantMessages(
                params.toBuilder().callControlId(callControlId).build(),
                requestOptions,
            )

        /** @see addAiAssistantMessages */
        fun addAiAssistantMessages(
            callControlId: String,
            params: ActionAddAiAssistantMessagesParams = ActionAddAiAssistantMessagesParams.none(),
        ): CompletableFuture<HttpResponseFor<ActionAddAiAssistantMessagesResponse>> =
            addAiAssistantMessages(callControlId, params, RequestOptions.none())

        /** @see addAiAssistantMessages */
        fun addAiAssistantMessages(
            params: ActionAddAiAssistantMessagesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActionAddAiAssistantMessagesResponse>>

        /** @see addAiAssistantMessages */
        fun addAiAssistantMessages(
            params: ActionAddAiAssistantMessagesParams
        ): CompletableFuture<HttpResponseFor<ActionAddAiAssistantMessagesResponse>> =
            addAiAssistantMessages(params, RequestOptions.none())

        /** @see addAiAssistantMessages */
        fun addAiAssistantMessages(
            callControlId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ActionAddAiAssistantMessagesResponse>> =
            addAiAssistantMessages(
                callControlId,
                ActionAddAiAssistantMessagesParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `post /calls/{call_control_id}/actions/answer`, but is
         * otherwise the same as [ActionServiceAsync.answer].
         */
        fun answer(
            callControlId: String
        ): CompletableFuture<HttpResponseFor<ActionAnswerResponse>> =
            answer(callControlId, ActionAnswerParams.none())

        /** @see answer */
        fun answer(
            callControlId: String,
            params: ActionAnswerParams = ActionAnswerParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActionAnswerResponse>> =
            answer(params.toBuilder().callControlId(callControlId).build(), requestOptions)

        /** @see answer */
        fun answer(
            callControlId: String,
            params: ActionAnswerParams = ActionAnswerParams.none(),
        ): CompletableFuture<HttpResponseFor<ActionAnswerResponse>> =
            answer(callControlId, params, RequestOptions.none())

        /** @see answer */
        fun answer(
            params: ActionAnswerParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActionAnswerResponse>>

        /** @see answer */
        fun answer(
            params: ActionAnswerParams
        ): CompletableFuture<HttpResponseFor<ActionAnswerResponse>> =
            answer(params, RequestOptions.none())

        /** @see answer */
        fun answer(
            callControlId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ActionAnswerResponse>> =
            answer(callControlId, ActionAnswerParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /calls/{call_control_id}/actions/bridge`, but is
         * otherwise the same as [ActionServiceAsync.bridge].
         */
        fun bridge(
            callControlIdToBridge: String,
            params: ActionBridgeParams,
        ): CompletableFuture<HttpResponseFor<ActionBridgeResponse>> =
            bridge(callControlIdToBridge, params, RequestOptions.none())

        /** @see bridge */
        fun bridge(
            callControlIdToBridge: String,
            params: ActionBridgeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActionBridgeResponse>> =
            bridge(
                params.toBuilder().callControlIdToBridge(callControlIdToBridge).build(),
                requestOptions,
            )

        /** @see bridge */
        fun bridge(
            params: ActionBridgeParams
        ): CompletableFuture<HttpResponseFor<ActionBridgeResponse>> =
            bridge(params, RequestOptions.none())

        /** @see bridge */
        fun bridge(
            params: ActionBridgeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActionBridgeResponse>>

        /**
         * Returns a raw HTTP response for `post /calls/{call_control_id}/actions/enqueue`, but is
         * otherwise the same as [ActionServiceAsync.enqueue].
         */
        fun enqueue(
            callControlId: String,
            params: ActionEnqueueParams,
        ): CompletableFuture<HttpResponseFor<ActionEnqueueResponse>> =
            enqueue(callControlId, params, RequestOptions.none())

        /** @see enqueue */
        fun enqueue(
            callControlId: String,
            params: ActionEnqueueParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActionEnqueueResponse>> =
            enqueue(params.toBuilder().callControlId(callControlId).build(), requestOptions)

        /** @see enqueue */
        fun enqueue(
            params: ActionEnqueueParams
        ): CompletableFuture<HttpResponseFor<ActionEnqueueResponse>> =
            enqueue(params, RequestOptions.none())

        /** @see enqueue */
        fun enqueue(
            params: ActionEnqueueParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActionEnqueueResponse>>

        /**
         * Returns a raw HTTP response for `post /calls/{call_control_id}/actions/gather`, but is
         * otherwise the same as [ActionServiceAsync.gather].
         */
        fun gather(
            callControlId: String
        ): CompletableFuture<HttpResponseFor<ActionGatherResponse>> =
            gather(callControlId, ActionGatherParams.none())

        /** @see gather */
        fun gather(
            callControlId: String,
            params: ActionGatherParams = ActionGatherParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActionGatherResponse>> =
            gather(params.toBuilder().callControlId(callControlId).build(), requestOptions)

        /** @see gather */
        fun gather(
            callControlId: String,
            params: ActionGatherParams = ActionGatherParams.none(),
        ): CompletableFuture<HttpResponseFor<ActionGatherResponse>> =
            gather(callControlId, params, RequestOptions.none())

        /** @see gather */
        fun gather(
            params: ActionGatherParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActionGatherResponse>>

        /** @see gather */
        fun gather(
            params: ActionGatherParams
        ): CompletableFuture<HttpResponseFor<ActionGatherResponse>> =
            gather(params, RequestOptions.none())

        /** @see gather */
        fun gather(
            callControlId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ActionGatherResponse>> =
            gather(callControlId, ActionGatherParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /calls/{call_control_id}/actions/gather_using_ai`,
         * but is otherwise the same as [ActionServiceAsync.gatherUsingAi].
         */
        fun gatherUsingAi(
            callControlId: String,
            params: ActionGatherUsingAiParams,
        ): CompletableFuture<HttpResponseFor<ActionGatherUsingAiResponse>> =
            gatherUsingAi(callControlId, params, RequestOptions.none())

        /** @see gatherUsingAi */
        fun gatherUsingAi(
            callControlId: String,
            params: ActionGatherUsingAiParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActionGatherUsingAiResponse>> =
            gatherUsingAi(params.toBuilder().callControlId(callControlId).build(), requestOptions)

        /** @see gatherUsingAi */
        fun gatherUsingAi(
            params: ActionGatherUsingAiParams
        ): CompletableFuture<HttpResponseFor<ActionGatherUsingAiResponse>> =
            gatherUsingAi(params, RequestOptions.none())

        /** @see gatherUsingAi */
        fun gatherUsingAi(
            params: ActionGatherUsingAiParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActionGatherUsingAiResponse>>

        /**
         * Returns a raw HTTP response for `post
         * /calls/{call_control_id}/actions/gather_using_audio`, but is otherwise the same as
         * [ActionServiceAsync.gatherUsingAudio].
         */
        fun gatherUsingAudio(
            callControlId: String
        ): CompletableFuture<HttpResponseFor<ActionGatherUsingAudioResponse>> =
            gatherUsingAudio(callControlId, ActionGatherUsingAudioParams.none())

        /** @see gatherUsingAudio */
        fun gatherUsingAudio(
            callControlId: String,
            params: ActionGatherUsingAudioParams = ActionGatherUsingAudioParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActionGatherUsingAudioResponse>> =
            gatherUsingAudio(
                params.toBuilder().callControlId(callControlId).build(),
                requestOptions,
            )

        /** @see gatherUsingAudio */
        fun gatherUsingAudio(
            callControlId: String,
            params: ActionGatherUsingAudioParams = ActionGatherUsingAudioParams.none(),
        ): CompletableFuture<HttpResponseFor<ActionGatherUsingAudioResponse>> =
            gatherUsingAudio(callControlId, params, RequestOptions.none())

        /** @see gatherUsingAudio */
        fun gatherUsingAudio(
            params: ActionGatherUsingAudioParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActionGatherUsingAudioResponse>>

        /** @see gatherUsingAudio */
        fun gatherUsingAudio(
            params: ActionGatherUsingAudioParams
        ): CompletableFuture<HttpResponseFor<ActionGatherUsingAudioResponse>> =
            gatherUsingAudio(params, RequestOptions.none())

        /** @see gatherUsingAudio */
        fun gatherUsingAudio(
            callControlId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ActionGatherUsingAudioResponse>> =
            gatherUsingAudio(callControlId, ActionGatherUsingAudioParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /calls/{call_control_id}/actions/gather_using_speak`, but is otherwise the same as
         * [ActionServiceAsync.gatherUsingSpeak].
         */
        fun gatherUsingSpeak(
            callControlId: String,
            params: ActionGatherUsingSpeakParams,
        ): CompletableFuture<HttpResponseFor<ActionGatherUsingSpeakResponse>> =
            gatherUsingSpeak(callControlId, params, RequestOptions.none())

        /** @see gatherUsingSpeak */
        fun gatherUsingSpeak(
            callControlId: String,
            params: ActionGatherUsingSpeakParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActionGatherUsingSpeakResponse>> =
            gatherUsingSpeak(
                params.toBuilder().callControlId(callControlId).build(),
                requestOptions,
            )

        /** @see gatherUsingSpeak */
        fun gatherUsingSpeak(
            params: ActionGatherUsingSpeakParams
        ): CompletableFuture<HttpResponseFor<ActionGatherUsingSpeakResponse>> =
            gatherUsingSpeak(params, RequestOptions.none())

        /** @see gatherUsingSpeak */
        fun gatherUsingSpeak(
            params: ActionGatherUsingSpeakParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActionGatherUsingSpeakResponse>>

        /**
         * Returns a raw HTTP response for `post /calls/{call_control_id}/actions/hangup`, but is
         * otherwise the same as [ActionServiceAsync.hangup].
         */
        fun hangup(
            callControlId: String
        ): CompletableFuture<HttpResponseFor<ActionHangupResponse>> =
            hangup(callControlId, ActionHangupParams.none())

        /** @see hangup */
        fun hangup(
            callControlId: String,
            params: ActionHangupParams = ActionHangupParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActionHangupResponse>> =
            hangup(params.toBuilder().callControlId(callControlId).build(), requestOptions)

        /** @see hangup */
        fun hangup(
            callControlId: String,
            params: ActionHangupParams = ActionHangupParams.none(),
        ): CompletableFuture<HttpResponseFor<ActionHangupResponse>> =
            hangup(callControlId, params, RequestOptions.none())

        /** @see hangup */
        fun hangup(
            params: ActionHangupParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActionHangupResponse>>

        /** @see hangup */
        fun hangup(
            params: ActionHangupParams
        ): CompletableFuture<HttpResponseFor<ActionHangupResponse>> =
            hangup(params, RequestOptions.none())

        /** @see hangup */
        fun hangup(
            callControlId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ActionHangupResponse>> =
            hangup(callControlId, ActionHangupParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /calls/{call_control_id}/actions/leave_queue`, but
         * is otherwise the same as [ActionServiceAsync.leaveQueue].
         */
        fun leaveQueue(
            callControlId: String
        ): CompletableFuture<HttpResponseFor<ActionLeaveQueueResponse>> =
            leaveQueue(callControlId, ActionLeaveQueueParams.none())

        /** @see leaveQueue */
        fun leaveQueue(
            callControlId: String,
            params: ActionLeaveQueueParams = ActionLeaveQueueParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActionLeaveQueueResponse>> =
            leaveQueue(params.toBuilder().callControlId(callControlId).build(), requestOptions)

        /** @see leaveQueue */
        fun leaveQueue(
            callControlId: String,
            params: ActionLeaveQueueParams = ActionLeaveQueueParams.none(),
        ): CompletableFuture<HttpResponseFor<ActionLeaveQueueResponse>> =
            leaveQueue(callControlId, params, RequestOptions.none())

        /** @see leaveQueue */
        fun leaveQueue(
            params: ActionLeaveQueueParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActionLeaveQueueResponse>>

        /** @see leaveQueue */
        fun leaveQueue(
            params: ActionLeaveQueueParams
        ): CompletableFuture<HttpResponseFor<ActionLeaveQueueResponse>> =
            leaveQueue(params, RequestOptions.none())

        /** @see leaveQueue */
        fun leaveQueue(
            callControlId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ActionLeaveQueueResponse>> =
            leaveQueue(callControlId, ActionLeaveQueueParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /calls/{call_control_id}/actions/record_pause`, but
         * is otherwise the same as [ActionServiceAsync.pauseRecording].
         */
        fun pauseRecording(
            callControlId: String
        ): CompletableFuture<HttpResponseFor<ActionPauseRecordingResponse>> =
            pauseRecording(callControlId, ActionPauseRecordingParams.none())

        /** @see pauseRecording */
        fun pauseRecording(
            callControlId: String,
            params: ActionPauseRecordingParams = ActionPauseRecordingParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActionPauseRecordingResponse>> =
            pauseRecording(params.toBuilder().callControlId(callControlId).build(), requestOptions)

        /** @see pauseRecording */
        fun pauseRecording(
            callControlId: String,
            params: ActionPauseRecordingParams = ActionPauseRecordingParams.none(),
        ): CompletableFuture<HttpResponseFor<ActionPauseRecordingResponse>> =
            pauseRecording(callControlId, params, RequestOptions.none())

        /** @see pauseRecording */
        fun pauseRecording(
            params: ActionPauseRecordingParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActionPauseRecordingResponse>>

        /** @see pauseRecording */
        fun pauseRecording(
            params: ActionPauseRecordingParams
        ): CompletableFuture<HttpResponseFor<ActionPauseRecordingResponse>> =
            pauseRecording(params, RequestOptions.none())

        /** @see pauseRecording */
        fun pauseRecording(
            callControlId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ActionPauseRecordingResponse>> =
            pauseRecording(callControlId, ActionPauseRecordingParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /calls/{call_control_id}/actions/refer`, but is
         * otherwise the same as [ActionServiceAsync.refer].
         */
        fun refer(
            callControlId: String,
            params: ActionReferParams,
        ): CompletableFuture<HttpResponseFor<ActionReferResponse>> =
            refer(callControlId, params, RequestOptions.none())

        /** @see refer */
        fun refer(
            callControlId: String,
            params: ActionReferParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActionReferResponse>> =
            refer(params.toBuilder().callControlId(callControlId).build(), requestOptions)

        /** @see refer */
        fun refer(
            params: ActionReferParams
        ): CompletableFuture<HttpResponseFor<ActionReferResponse>> =
            refer(params, RequestOptions.none())

        /** @see refer */
        fun refer(
            params: ActionReferParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActionReferResponse>>

        /**
         * Returns a raw HTTP response for `post /calls/{call_control_id}/actions/reject`, but is
         * otherwise the same as [ActionServiceAsync.reject].
         */
        fun reject(
            callControlId: String,
            params: ActionRejectParams,
        ): CompletableFuture<HttpResponseFor<ActionRejectResponse>> =
            reject(callControlId, params, RequestOptions.none())

        /** @see reject */
        fun reject(
            callControlId: String,
            params: ActionRejectParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActionRejectResponse>> =
            reject(params.toBuilder().callControlId(callControlId).build(), requestOptions)

        /** @see reject */
        fun reject(
            params: ActionRejectParams
        ): CompletableFuture<HttpResponseFor<ActionRejectResponse>> =
            reject(params, RequestOptions.none())

        /** @see reject */
        fun reject(
            params: ActionRejectParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActionRejectResponse>>

        /**
         * Returns a raw HTTP response for `post /calls/{call_control_id}/actions/record_resume`,
         * but is otherwise the same as [ActionServiceAsync.resumeRecording].
         */
        fun resumeRecording(
            callControlId: String
        ): CompletableFuture<HttpResponseFor<ActionResumeRecordingResponse>> =
            resumeRecording(callControlId, ActionResumeRecordingParams.none())

        /** @see resumeRecording */
        fun resumeRecording(
            callControlId: String,
            params: ActionResumeRecordingParams = ActionResumeRecordingParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActionResumeRecordingResponse>> =
            resumeRecording(params.toBuilder().callControlId(callControlId).build(), requestOptions)

        /** @see resumeRecording */
        fun resumeRecording(
            callControlId: String,
            params: ActionResumeRecordingParams = ActionResumeRecordingParams.none(),
        ): CompletableFuture<HttpResponseFor<ActionResumeRecordingResponse>> =
            resumeRecording(callControlId, params, RequestOptions.none())

        /** @see resumeRecording */
        fun resumeRecording(
            params: ActionResumeRecordingParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActionResumeRecordingResponse>>

        /** @see resumeRecording */
        fun resumeRecording(
            params: ActionResumeRecordingParams
        ): CompletableFuture<HttpResponseFor<ActionResumeRecordingResponse>> =
            resumeRecording(params, RequestOptions.none())

        /** @see resumeRecording */
        fun resumeRecording(
            callControlId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ActionResumeRecordingResponse>> =
            resumeRecording(callControlId, ActionResumeRecordingParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /calls/{call_control_id}/actions/send_dtmf`, but is
         * otherwise the same as [ActionServiceAsync.sendDtmf].
         */
        fun sendDtmf(
            callControlId: String,
            params: ActionSendDtmfParams,
        ): CompletableFuture<HttpResponseFor<ActionSendDtmfResponse>> =
            sendDtmf(callControlId, params, RequestOptions.none())

        /** @see sendDtmf */
        fun sendDtmf(
            callControlId: String,
            params: ActionSendDtmfParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActionSendDtmfResponse>> =
            sendDtmf(params.toBuilder().callControlId(callControlId).build(), requestOptions)

        /** @see sendDtmf */
        fun sendDtmf(
            params: ActionSendDtmfParams
        ): CompletableFuture<HttpResponseFor<ActionSendDtmfResponse>> =
            sendDtmf(params, RequestOptions.none())

        /** @see sendDtmf */
        fun sendDtmf(
            params: ActionSendDtmfParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActionSendDtmfResponse>>

        /**
         * Returns a raw HTTP response for `post /calls/{call_control_id}/actions/send_sip_info`,
         * but is otherwise the same as [ActionServiceAsync.sendSipInfo].
         */
        fun sendSipInfo(
            callControlId: String,
            params: ActionSendSipInfoParams,
        ): CompletableFuture<HttpResponseFor<ActionSendSipInfoResponse>> =
            sendSipInfo(callControlId, params, RequestOptions.none())

        /** @see sendSipInfo */
        fun sendSipInfo(
            callControlId: String,
            params: ActionSendSipInfoParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActionSendSipInfoResponse>> =
            sendSipInfo(params.toBuilder().callControlId(callControlId).build(), requestOptions)

        /** @see sendSipInfo */
        fun sendSipInfo(
            params: ActionSendSipInfoParams
        ): CompletableFuture<HttpResponseFor<ActionSendSipInfoResponse>> =
            sendSipInfo(params, RequestOptions.none())

        /** @see sendSipInfo */
        fun sendSipInfo(
            params: ActionSendSipInfoParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActionSendSipInfoResponse>>

        /**
         * Returns a raw HTTP response for `post /calls/{call_control_id}/actions/speak`, but is
         * otherwise the same as [ActionServiceAsync.speak].
         */
        fun speak(
            callControlId: String,
            params: ActionSpeakParams,
        ): CompletableFuture<HttpResponseFor<ActionSpeakResponse>> =
            speak(callControlId, params, RequestOptions.none())

        /** @see speak */
        fun speak(
            callControlId: String,
            params: ActionSpeakParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActionSpeakResponse>> =
            speak(params.toBuilder().callControlId(callControlId).build(), requestOptions)

        /** @see speak */
        fun speak(
            params: ActionSpeakParams
        ): CompletableFuture<HttpResponseFor<ActionSpeakResponse>> =
            speak(params, RequestOptions.none())

        /** @see speak */
        fun speak(
            params: ActionSpeakParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActionSpeakResponse>>

        /**
         * Returns a raw HTTP response for `post
         * /calls/{call_control_id}/actions/ai_assistant_start`, but is otherwise the same as
         * [ActionServiceAsync.startAiAssistant].
         */
        fun startAiAssistant(
            callControlId: String
        ): CompletableFuture<HttpResponseFor<ActionStartAiAssistantResponse>> =
            startAiAssistant(callControlId, ActionStartAiAssistantParams.none())

        /** @see startAiAssistant */
        fun startAiAssistant(
            callControlId: String,
            params: ActionStartAiAssistantParams = ActionStartAiAssistantParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActionStartAiAssistantResponse>> =
            startAiAssistant(
                params.toBuilder().callControlId(callControlId).build(),
                requestOptions,
            )

        /** @see startAiAssistant */
        fun startAiAssistant(
            callControlId: String,
            params: ActionStartAiAssistantParams = ActionStartAiAssistantParams.none(),
        ): CompletableFuture<HttpResponseFor<ActionStartAiAssistantResponse>> =
            startAiAssistant(callControlId, params, RequestOptions.none())

        /** @see startAiAssistant */
        fun startAiAssistant(
            params: ActionStartAiAssistantParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActionStartAiAssistantResponse>>

        /** @see startAiAssistant */
        fun startAiAssistant(
            params: ActionStartAiAssistantParams
        ): CompletableFuture<HttpResponseFor<ActionStartAiAssistantResponse>> =
            startAiAssistant(params, RequestOptions.none())

        /** @see startAiAssistant */
        fun startAiAssistant(
            callControlId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ActionStartAiAssistantResponse>> =
            startAiAssistant(callControlId, ActionStartAiAssistantParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /calls/{call_control_id}/actions/fork_start`, but
         * is otherwise the same as [ActionServiceAsync.startForking].
         */
        fun startForking(
            callControlId: String
        ): CompletableFuture<HttpResponseFor<ActionStartForkingResponse>> =
            startForking(callControlId, ActionStartForkingParams.none())

        /** @see startForking */
        fun startForking(
            callControlId: String,
            params: ActionStartForkingParams = ActionStartForkingParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActionStartForkingResponse>> =
            startForking(params.toBuilder().callControlId(callControlId).build(), requestOptions)

        /** @see startForking */
        fun startForking(
            callControlId: String,
            params: ActionStartForkingParams = ActionStartForkingParams.none(),
        ): CompletableFuture<HttpResponseFor<ActionStartForkingResponse>> =
            startForking(callControlId, params, RequestOptions.none())

        /** @see startForking */
        fun startForking(
            params: ActionStartForkingParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActionStartForkingResponse>>

        /** @see startForking */
        fun startForking(
            params: ActionStartForkingParams
        ): CompletableFuture<HttpResponseFor<ActionStartForkingResponse>> =
            startForking(params, RequestOptions.none())

        /** @see startForking */
        fun startForking(
            callControlId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ActionStartForkingResponse>> =
            startForking(callControlId, ActionStartForkingParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /calls/{call_control_id}/actions/suppression_start`, but is otherwise the same as
         * [ActionServiceAsync.startNoiseSuppression].
         */
        fun startNoiseSuppression(
            callControlId: String
        ): CompletableFuture<HttpResponseFor<ActionStartNoiseSuppressionResponse>> =
            startNoiseSuppression(callControlId, ActionStartNoiseSuppressionParams.none())

        /** @see startNoiseSuppression */
        fun startNoiseSuppression(
            callControlId: String,
            params: ActionStartNoiseSuppressionParams = ActionStartNoiseSuppressionParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActionStartNoiseSuppressionResponse>> =
            startNoiseSuppression(
                params.toBuilder().callControlId(callControlId).build(),
                requestOptions,
            )

        /** @see startNoiseSuppression */
        fun startNoiseSuppression(
            callControlId: String,
            params: ActionStartNoiseSuppressionParams = ActionStartNoiseSuppressionParams.none(),
        ): CompletableFuture<HttpResponseFor<ActionStartNoiseSuppressionResponse>> =
            startNoiseSuppression(callControlId, params, RequestOptions.none())

        /** @see startNoiseSuppression */
        fun startNoiseSuppression(
            params: ActionStartNoiseSuppressionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActionStartNoiseSuppressionResponse>>

        /** @see startNoiseSuppression */
        fun startNoiseSuppression(
            params: ActionStartNoiseSuppressionParams
        ): CompletableFuture<HttpResponseFor<ActionStartNoiseSuppressionResponse>> =
            startNoiseSuppression(params, RequestOptions.none())

        /** @see startNoiseSuppression */
        fun startNoiseSuppression(
            callControlId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ActionStartNoiseSuppressionResponse>> =
            startNoiseSuppression(
                callControlId,
                ActionStartNoiseSuppressionParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `post /calls/{call_control_id}/actions/playback_start`,
         * but is otherwise the same as [ActionServiceAsync.startPlayback].
         */
        fun startPlayback(
            callControlId: String
        ): CompletableFuture<HttpResponseFor<ActionStartPlaybackResponse>> =
            startPlayback(callControlId, ActionStartPlaybackParams.none())

        /** @see startPlayback */
        fun startPlayback(
            callControlId: String,
            params: ActionStartPlaybackParams = ActionStartPlaybackParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActionStartPlaybackResponse>> =
            startPlayback(params.toBuilder().callControlId(callControlId).build(), requestOptions)

        /** @see startPlayback */
        fun startPlayback(
            callControlId: String,
            params: ActionStartPlaybackParams = ActionStartPlaybackParams.none(),
        ): CompletableFuture<HttpResponseFor<ActionStartPlaybackResponse>> =
            startPlayback(callControlId, params, RequestOptions.none())

        /** @see startPlayback */
        fun startPlayback(
            params: ActionStartPlaybackParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActionStartPlaybackResponse>>

        /** @see startPlayback */
        fun startPlayback(
            params: ActionStartPlaybackParams
        ): CompletableFuture<HttpResponseFor<ActionStartPlaybackResponse>> =
            startPlayback(params, RequestOptions.none())

        /** @see startPlayback */
        fun startPlayback(
            callControlId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ActionStartPlaybackResponse>> =
            startPlayback(callControlId, ActionStartPlaybackParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /calls/{call_control_id}/actions/record_start`, but
         * is otherwise the same as [ActionServiceAsync.startRecording].
         */
        fun startRecording(
            callControlId: String,
            params: ActionStartRecordingParams,
        ): CompletableFuture<HttpResponseFor<ActionStartRecordingResponse>> =
            startRecording(callControlId, params, RequestOptions.none())

        /** @see startRecording */
        fun startRecording(
            callControlId: String,
            params: ActionStartRecordingParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActionStartRecordingResponse>> =
            startRecording(params.toBuilder().callControlId(callControlId).build(), requestOptions)

        /** @see startRecording */
        fun startRecording(
            params: ActionStartRecordingParams
        ): CompletableFuture<HttpResponseFor<ActionStartRecordingResponse>> =
            startRecording(params, RequestOptions.none())

        /** @see startRecording */
        fun startRecording(
            params: ActionStartRecordingParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActionStartRecordingResponse>>

        /**
         * Returns a raw HTTP response for `post /calls/{call_control_id}/actions/siprec_start`, but
         * is otherwise the same as [ActionServiceAsync.startSiprec].
         */
        fun startSiprec(
            callControlId: String
        ): CompletableFuture<HttpResponseFor<ActionStartSiprecResponse>> =
            startSiprec(callControlId, ActionStartSiprecParams.none())

        /** @see startSiprec */
        fun startSiprec(
            callControlId: String,
            params: ActionStartSiprecParams = ActionStartSiprecParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActionStartSiprecResponse>> =
            startSiprec(params.toBuilder().callControlId(callControlId).build(), requestOptions)

        /** @see startSiprec */
        fun startSiprec(
            callControlId: String,
            params: ActionStartSiprecParams = ActionStartSiprecParams.none(),
        ): CompletableFuture<HttpResponseFor<ActionStartSiprecResponse>> =
            startSiprec(callControlId, params, RequestOptions.none())

        /** @see startSiprec */
        fun startSiprec(
            params: ActionStartSiprecParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActionStartSiprecResponse>>

        /** @see startSiprec */
        fun startSiprec(
            params: ActionStartSiprecParams
        ): CompletableFuture<HttpResponseFor<ActionStartSiprecResponse>> =
            startSiprec(params, RequestOptions.none())

        /** @see startSiprec */
        fun startSiprec(
            callControlId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ActionStartSiprecResponse>> =
            startSiprec(callControlId, ActionStartSiprecParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /calls/{call_control_id}/actions/streaming_start`,
         * but is otherwise the same as [ActionServiceAsync.startStreaming].
         */
        fun startStreaming(
            callControlId: String
        ): CompletableFuture<HttpResponseFor<ActionStartStreamingResponse>> =
            startStreaming(callControlId, ActionStartStreamingParams.none())

        /** @see startStreaming */
        fun startStreaming(
            callControlId: String,
            params: ActionStartStreamingParams = ActionStartStreamingParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActionStartStreamingResponse>> =
            startStreaming(params.toBuilder().callControlId(callControlId).build(), requestOptions)

        /** @see startStreaming */
        fun startStreaming(
            callControlId: String,
            params: ActionStartStreamingParams = ActionStartStreamingParams.none(),
        ): CompletableFuture<HttpResponseFor<ActionStartStreamingResponse>> =
            startStreaming(callControlId, params, RequestOptions.none())

        /** @see startStreaming */
        fun startStreaming(
            params: ActionStartStreamingParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActionStartStreamingResponse>>

        /** @see startStreaming */
        fun startStreaming(
            params: ActionStartStreamingParams
        ): CompletableFuture<HttpResponseFor<ActionStartStreamingResponse>> =
            startStreaming(params, RequestOptions.none())

        /** @see startStreaming */
        fun startStreaming(
            callControlId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ActionStartStreamingResponse>> =
            startStreaming(callControlId, ActionStartStreamingParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /calls/{call_control_id}/actions/transcription_start`, but is otherwise the same as
         * [ActionServiceAsync.startTranscription].
         */
        fun startTranscription(
            callControlId: String,
            params: ActionStartTranscriptionParams,
        ): CompletableFuture<HttpResponseFor<ActionStartTranscriptionResponse>> =
            startTranscription(callControlId, params, RequestOptions.none())

        /** @see startTranscription */
        fun startTranscription(
            callControlId: String,
            params: ActionStartTranscriptionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActionStartTranscriptionResponse>> =
            startTranscription(
                params.toBuilder().callControlId(callControlId).build(),
                requestOptions,
            )

        /** @see startTranscription */
        fun startTranscription(
            params: ActionStartTranscriptionParams
        ): CompletableFuture<HttpResponseFor<ActionStartTranscriptionResponse>> =
            startTranscription(params, RequestOptions.none())

        /** @see startTranscription */
        fun startTranscription(
            params: ActionStartTranscriptionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActionStartTranscriptionResponse>>

        /**
         * Returns a raw HTTP response for `post
         * /calls/{call_control_id}/actions/ai_assistant_stop`, but is otherwise the same as
         * [ActionServiceAsync.stopAiAssistant].
         */
        fun stopAiAssistant(
            callControlId: String
        ): CompletableFuture<HttpResponseFor<ActionStopAiAssistantResponse>> =
            stopAiAssistant(callControlId, ActionStopAiAssistantParams.none())

        /** @see stopAiAssistant */
        fun stopAiAssistant(
            callControlId: String,
            params: ActionStopAiAssistantParams = ActionStopAiAssistantParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActionStopAiAssistantResponse>> =
            stopAiAssistant(params.toBuilder().callControlId(callControlId).build(), requestOptions)

        /** @see stopAiAssistant */
        fun stopAiAssistant(
            callControlId: String,
            params: ActionStopAiAssistantParams = ActionStopAiAssistantParams.none(),
        ): CompletableFuture<HttpResponseFor<ActionStopAiAssistantResponse>> =
            stopAiAssistant(callControlId, params, RequestOptions.none())

        /** @see stopAiAssistant */
        fun stopAiAssistant(
            params: ActionStopAiAssistantParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActionStopAiAssistantResponse>>

        /** @see stopAiAssistant */
        fun stopAiAssistant(
            params: ActionStopAiAssistantParams
        ): CompletableFuture<HttpResponseFor<ActionStopAiAssistantResponse>> =
            stopAiAssistant(params, RequestOptions.none())

        /** @see stopAiAssistant */
        fun stopAiAssistant(
            callControlId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ActionStopAiAssistantResponse>> =
            stopAiAssistant(callControlId, ActionStopAiAssistantParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /calls/{call_control_id}/actions/fork_stop`, but is
         * otherwise the same as [ActionServiceAsync.stopForking].
         */
        fun stopForking(
            callControlId: String
        ): CompletableFuture<HttpResponseFor<ActionStopForkingResponse>> =
            stopForking(callControlId, ActionStopForkingParams.none())

        /** @see stopForking */
        fun stopForking(
            callControlId: String,
            params: ActionStopForkingParams = ActionStopForkingParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActionStopForkingResponse>> =
            stopForking(params.toBuilder().callControlId(callControlId).build(), requestOptions)

        /** @see stopForking */
        fun stopForking(
            callControlId: String,
            params: ActionStopForkingParams = ActionStopForkingParams.none(),
        ): CompletableFuture<HttpResponseFor<ActionStopForkingResponse>> =
            stopForking(callControlId, params, RequestOptions.none())

        /** @see stopForking */
        fun stopForking(
            params: ActionStopForkingParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActionStopForkingResponse>>

        /** @see stopForking */
        fun stopForking(
            params: ActionStopForkingParams
        ): CompletableFuture<HttpResponseFor<ActionStopForkingResponse>> =
            stopForking(params, RequestOptions.none())

        /** @see stopForking */
        fun stopForking(
            callControlId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ActionStopForkingResponse>> =
            stopForking(callControlId, ActionStopForkingParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /calls/{call_control_id}/actions/gather_stop`, but
         * is otherwise the same as [ActionServiceAsync.stopGather].
         */
        fun stopGather(
            callControlId: String
        ): CompletableFuture<HttpResponseFor<ActionStopGatherResponse>> =
            stopGather(callControlId, ActionStopGatherParams.none())

        /** @see stopGather */
        fun stopGather(
            callControlId: String,
            params: ActionStopGatherParams = ActionStopGatherParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActionStopGatherResponse>> =
            stopGather(params.toBuilder().callControlId(callControlId).build(), requestOptions)

        /** @see stopGather */
        fun stopGather(
            callControlId: String,
            params: ActionStopGatherParams = ActionStopGatherParams.none(),
        ): CompletableFuture<HttpResponseFor<ActionStopGatherResponse>> =
            stopGather(callControlId, params, RequestOptions.none())

        /** @see stopGather */
        fun stopGather(
            params: ActionStopGatherParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActionStopGatherResponse>>

        /** @see stopGather */
        fun stopGather(
            params: ActionStopGatherParams
        ): CompletableFuture<HttpResponseFor<ActionStopGatherResponse>> =
            stopGather(params, RequestOptions.none())

        /** @see stopGather */
        fun stopGather(
            callControlId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ActionStopGatherResponse>> =
            stopGather(callControlId, ActionStopGatherParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /calls/{call_control_id}/actions/suppression_stop`,
         * but is otherwise the same as [ActionServiceAsync.stopNoiseSuppression].
         */
        fun stopNoiseSuppression(
            callControlId: String
        ): CompletableFuture<HttpResponseFor<ActionStopNoiseSuppressionResponse>> =
            stopNoiseSuppression(callControlId, ActionStopNoiseSuppressionParams.none())

        /** @see stopNoiseSuppression */
        fun stopNoiseSuppression(
            callControlId: String,
            params: ActionStopNoiseSuppressionParams = ActionStopNoiseSuppressionParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActionStopNoiseSuppressionResponse>> =
            stopNoiseSuppression(
                params.toBuilder().callControlId(callControlId).build(),
                requestOptions,
            )

        /** @see stopNoiseSuppression */
        fun stopNoiseSuppression(
            callControlId: String,
            params: ActionStopNoiseSuppressionParams = ActionStopNoiseSuppressionParams.none(),
        ): CompletableFuture<HttpResponseFor<ActionStopNoiseSuppressionResponse>> =
            stopNoiseSuppression(callControlId, params, RequestOptions.none())

        /** @see stopNoiseSuppression */
        fun stopNoiseSuppression(
            params: ActionStopNoiseSuppressionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActionStopNoiseSuppressionResponse>>

        /** @see stopNoiseSuppression */
        fun stopNoiseSuppression(
            params: ActionStopNoiseSuppressionParams
        ): CompletableFuture<HttpResponseFor<ActionStopNoiseSuppressionResponse>> =
            stopNoiseSuppression(params, RequestOptions.none())

        /** @see stopNoiseSuppression */
        fun stopNoiseSuppression(
            callControlId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ActionStopNoiseSuppressionResponse>> =
            stopNoiseSuppression(
                callControlId,
                ActionStopNoiseSuppressionParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `post /calls/{call_control_id}/actions/playback_stop`,
         * but is otherwise the same as [ActionServiceAsync.stopPlayback].
         */
        fun stopPlayback(
            callControlId: String
        ): CompletableFuture<HttpResponseFor<ActionStopPlaybackResponse>> =
            stopPlayback(callControlId, ActionStopPlaybackParams.none())

        /** @see stopPlayback */
        fun stopPlayback(
            callControlId: String,
            params: ActionStopPlaybackParams = ActionStopPlaybackParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActionStopPlaybackResponse>> =
            stopPlayback(params.toBuilder().callControlId(callControlId).build(), requestOptions)

        /** @see stopPlayback */
        fun stopPlayback(
            callControlId: String,
            params: ActionStopPlaybackParams = ActionStopPlaybackParams.none(),
        ): CompletableFuture<HttpResponseFor<ActionStopPlaybackResponse>> =
            stopPlayback(callControlId, params, RequestOptions.none())

        /** @see stopPlayback */
        fun stopPlayback(
            params: ActionStopPlaybackParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActionStopPlaybackResponse>>

        /** @see stopPlayback */
        fun stopPlayback(
            params: ActionStopPlaybackParams
        ): CompletableFuture<HttpResponseFor<ActionStopPlaybackResponse>> =
            stopPlayback(params, RequestOptions.none())

        /** @see stopPlayback */
        fun stopPlayback(
            callControlId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ActionStopPlaybackResponse>> =
            stopPlayback(callControlId, ActionStopPlaybackParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /calls/{call_control_id}/actions/record_stop`, but
         * is otherwise the same as [ActionServiceAsync.stopRecording].
         */
        fun stopRecording(
            callControlId: String,
            params: ActionStopRecordingParams,
        ): CompletableFuture<HttpResponseFor<ActionStopRecordingResponse>> =
            stopRecording(callControlId, params, RequestOptions.none())

        /** @see stopRecording */
        fun stopRecording(
            callControlId: String,
            params: ActionStopRecordingParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActionStopRecordingResponse>> =
            stopRecording(params.toBuilder().callControlId(callControlId).build(), requestOptions)

        /** @see stopRecording */
        fun stopRecording(
            params: ActionStopRecordingParams
        ): CompletableFuture<HttpResponseFor<ActionStopRecordingResponse>> =
            stopRecording(params, RequestOptions.none())

        /** @see stopRecording */
        fun stopRecording(
            params: ActionStopRecordingParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActionStopRecordingResponse>>

        /**
         * Returns a raw HTTP response for `post /calls/{call_control_id}/actions/siprec_stop`, but
         * is otherwise the same as [ActionServiceAsync.stopSiprec].
         */
        fun stopSiprec(
            callControlId: String
        ): CompletableFuture<HttpResponseFor<ActionStopSiprecResponse>> =
            stopSiprec(callControlId, ActionStopSiprecParams.none())

        /** @see stopSiprec */
        fun stopSiprec(
            callControlId: String,
            params: ActionStopSiprecParams = ActionStopSiprecParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActionStopSiprecResponse>> =
            stopSiprec(params.toBuilder().callControlId(callControlId).build(), requestOptions)

        /** @see stopSiprec */
        fun stopSiprec(
            callControlId: String,
            params: ActionStopSiprecParams = ActionStopSiprecParams.none(),
        ): CompletableFuture<HttpResponseFor<ActionStopSiprecResponse>> =
            stopSiprec(callControlId, params, RequestOptions.none())

        /** @see stopSiprec */
        fun stopSiprec(
            params: ActionStopSiprecParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActionStopSiprecResponse>>

        /** @see stopSiprec */
        fun stopSiprec(
            params: ActionStopSiprecParams
        ): CompletableFuture<HttpResponseFor<ActionStopSiprecResponse>> =
            stopSiprec(params, RequestOptions.none())

        /** @see stopSiprec */
        fun stopSiprec(
            callControlId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ActionStopSiprecResponse>> =
            stopSiprec(callControlId, ActionStopSiprecParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /calls/{call_control_id}/actions/streaming_stop`,
         * but is otherwise the same as [ActionServiceAsync.stopStreaming].
         */
        fun stopStreaming(
            callControlId: String
        ): CompletableFuture<HttpResponseFor<ActionStopStreamingResponse>> =
            stopStreaming(callControlId, ActionStopStreamingParams.none())

        /** @see stopStreaming */
        fun stopStreaming(
            callControlId: String,
            params: ActionStopStreamingParams = ActionStopStreamingParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActionStopStreamingResponse>> =
            stopStreaming(params.toBuilder().callControlId(callControlId).build(), requestOptions)

        /** @see stopStreaming */
        fun stopStreaming(
            callControlId: String,
            params: ActionStopStreamingParams = ActionStopStreamingParams.none(),
        ): CompletableFuture<HttpResponseFor<ActionStopStreamingResponse>> =
            stopStreaming(callControlId, params, RequestOptions.none())

        /** @see stopStreaming */
        fun stopStreaming(
            params: ActionStopStreamingParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActionStopStreamingResponse>>

        /** @see stopStreaming */
        fun stopStreaming(
            params: ActionStopStreamingParams
        ): CompletableFuture<HttpResponseFor<ActionStopStreamingResponse>> =
            stopStreaming(params, RequestOptions.none())

        /** @see stopStreaming */
        fun stopStreaming(
            callControlId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ActionStopStreamingResponse>> =
            stopStreaming(callControlId, ActionStopStreamingParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /calls/{call_control_id}/actions/transcription_stop`, but is otherwise the same as
         * [ActionServiceAsync.stopTranscription].
         */
        fun stopTranscription(
            callControlId: String
        ): CompletableFuture<HttpResponseFor<ActionStopTranscriptionResponse>> =
            stopTranscription(callControlId, ActionStopTranscriptionParams.none())

        /** @see stopTranscription */
        fun stopTranscription(
            callControlId: String,
            params: ActionStopTranscriptionParams = ActionStopTranscriptionParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActionStopTranscriptionResponse>> =
            stopTranscription(
                params.toBuilder().callControlId(callControlId).build(),
                requestOptions,
            )

        /** @see stopTranscription */
        fun stopTranscription(
            callControlId: String,
            params: ActionStopTranscriptionParams = ActionStopTranscriptionParams.none(),
        ): CompletableFuture<HttpResponseFor<ActionStopTranscriptionResponse>> =
            stopTranscription(callControlId, params, RequestOptions.none())

        /** @see stopTranscription */
        fun stopTranscription(
            params: ActionStopTranscriptionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActionStopTranscriptionResponse>>

        /** @see stopTranscription */
        fun stopTranscription(
            params: ActionStopTranscriptionParams
        ): CompletableFuture<HttpResponseFor<ActionStopTranscriptionResponse>> =
            stopTranscription(params, RequestOptions.none())

        /** @see stopTranscription */
        fun stopTranscription(
            callControlId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ActionStopTranscriptionResponse>> =
            stopTranscription(callControlId, ActionStopTranscriptionParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /calls/{call_control_id}/actions/switch_supervisor_role`, but is otherwise the same as
         * [ActionServiceAsync.switchSupervisorRole].
         */
        fun switchSupervisorRole(
            callControlId: String,
            params: ActionSwitchSupervisorRoleParams,
        ): CompletableFuture<HttpResponseFor<ActionSwitchSupervisorRoleResponse>> =
            switchSupervisorRole(callControlId, params, RequestOptions.none())

        /** @see switchSupervisorRole */
        fun switchSupervisorRole(
            callControlId: String,
            params: ActionSwitchSupervisorRoleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActionSwitchSupervisorRoleResponse>> =
            switchSupervisorRole(
                params.toBuilder().callControlId(callControlId).build(),
                requestOptions,
            )

        /** @see switchSupervisorRole */
        fun switchSupervisorRole(
            params: ActionSwitchSupervisorRoleParams
        ): CompletableFuture<HttpResponseFor<ActionSwitchSupervisorRoleResponse>> =
            switchSupervisorRole(params, RequestOptions.none())

        /** @see switchSupervisorRole */
        fun switchSupervisorRole(
            params: ActionSwitchSupervisorRoleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActionSwitchSupervisorRoleResponse>>

        /**
         * Returns a raw HTTP response for `post /calls/{call_control_id}/actions/transfer`, but is
         * otherwise the same as [ActionServiceAsync.transfer].
         */
        fun transfer(
            callControlId: String,
            params: ActionTransferParams,
        ): CompletableFuture<HttpResponseFor<ActionTransferResponse>> =
            transfer(callControlId, params, RequestOptions.none())

        /** @see transfer */
        fun transfer(
            callControlId: String,
            params: ActionTransferParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActionTransferResponse>> =
            transfer(params.toBuilder().callControlId(callControlId).build(), requestOptions)

        /** @see transfer */
        fun transfer(
            params: ActionTransferParams
        ): CompletableFuture<HttpResponseFor<ActionTransferResponse>> =
            transfer(params, RequestOptions.none())

        /** @see transfer */
        fun transfer(
            params: ActionTransferParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActionTransferResponse>>

        /**
         * Returns a raw HTTP response for `put
         * /calls/{call_control_id}/actions/client_state_update`, but is otherwise the same as
         * [ActionServiceAsync.updateClientState].
         */
        fun updateClientState(
            callControlId: String,
            params: ActionUpdateClientStateParams,
        ): CompletableFuture<HttpResponseFor<ActionUpdateClientStateResponse>> =
            updateClientState(callControlId, params, RequestOptions.none())

        /** @see updateClientState */
        fun updateClientState(
            callControlId: String,
            params: ActionUpdateClientStateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActionUpdateClientStateResponse>> =
            updateClientState(
                params.toBuilder().callControlId(callControlId).build(),
                requestOptions,
            )

        /** @see updateClientState */
        fun updateClientState(
            params: ActionUpdateClientStateParams
        ): CompletableFuture<HttpResponseFor<ActionUpdateClientStateResponse>> =
            updateClientState(params, RequestOptions.none())

        /** @see updateClientState */
        fun updateClientState(
            params: ActionUpdateClientStateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActionUpdateClientStateResponse>>
    }
}
