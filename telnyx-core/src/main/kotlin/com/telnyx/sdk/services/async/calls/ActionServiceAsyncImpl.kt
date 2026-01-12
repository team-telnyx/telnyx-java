// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.calls

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.handlers.errorBodyHandler
import com.telnyx.sdk.core.handlers.errorHandler
import com.telnyx.sdk.core.handlers.jsonHandler
import com.telnyx.sdk.core.http.HttpMethod
import com.telnyx.sdk.core.http.HttpRequest
import com.telnyx.sdk.core.http.HttpResponse
import com.telnyx.sdk.core.http.HttpResponse.Handler
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.core.http.json
import com.telnyx.sdk.core.http.parseable
import com.telnyx.sdk.core.prepareAsync
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
import kotlin.jvm.optionals.getOrNull

class ActionServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    ActionServiceAsync {

    private val withRawResponse: ActionServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ActionServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ActionServiceAsync =
        ActionServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun answer(
        params: ActionAnswerParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ActionAnswerResponse> =
        // post /calls/{call_control_id}/actions/answer
        withRawResponse().answer(params, requestOptions).thenApply { it.parse() }

    override fun bridge(
        params: ActionBridgeParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ActionBridgeResponse> =
        // post /calls/{call_control_id}/actions/bridge
        withRawResponse().bridge(params, requestOptions).thenApply { it.parse() }

    override fun enqueue(
        params: ActionEnqueueParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ActionEnqueueResponse> =
        // post /calls/{call_control_id}/actions/enqueue
        withRawResponse().enqueue(params, requestOptions).thenApply { it.parse() }

    override fun gather(
        params: ActionGatherParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ActionGatherResponse> =
        // post /calls/{call_control_id}/actions/gather
        withRawResponse().gather(params, requestOptions).thenApply { it.parse() }

    override fun gatherUsingAi(
        params: ActionGatherUsingAiParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ActionGatherUsingAiResponse> =
        // post /calls/{call_control_id}/actions/gather_using_ai
        withRawResponse().gatherUsingAi(params, requestOptions).thenApply { it.parse() }

    override fun gatherUsingAudio(
        params: ActionGatherUsingAudioParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ActionGatherUsingAudioResponse> =
        // post /calls/{call_control_id}/actions/gather_using_audio
        withRawResponse().gatherUsingAudio(params, requestOptions).thenApply { it.parse() }

    override fun gatherUsingSpeak(
        params: ActionGatherUsingSpeakParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ActionGatherUsingSpeakResponse> =
        // post /calls/{call_control_id}/actions/gather_using_speak
        withRawResponse().gatherUsingSpeak(params, requestOptions).thenApply { it.parse() }

    override fun hangup(
        params: ActionHangupParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ActionHangupResponse> =
        // post /calls/{call_control_id}/actions/hangup
        withRawResponse().hangup(params, requestOptions).thenApply { it.parse() }

    override fun leaveQueue(
        params: ActionLeaveQueueParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ActionLeaveQueueResponse> =
        // post /calls/{call_control_id}/actions/leave_queue
        withRawResponse().leaveQueue(params, requestOptions).thenApply { it.parse() }

    override fun pauseRecording(
        params: ActionPauseRecordingParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ActionPauseRecordingResponse> =
        // post /calls/{call_control_id}/actions/record_pause
        withRawResponse().pauseRecording(params, requestOptions).thenApply { it.parse() }

    override fun refer(
        params: ActionReferParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ActionReferResponse> =
        // post /calls/{call_control_id}/actions/refer
        withRawResponse().refer(params, requestOptions).thenApply { it.parse() }

    override fun reject(
        params: ActionRejectParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ActionRejectResponse> =
        // post /calls/{call_control_id}/actions/reject
        withRawResponse().reject(params, requestOptions).thenApply { it.parse() }

    override fun resumeRecording(
        params: ActionResumeRecordingParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ActionResumeRecordingResponse> =
        // post /calls/{call_control_id}/actions/record_resume
        withRawResponse().resumeRecording(params, requestOptions).thenApply { it.parse() }

    override fun sendDtmf(
        params: ActionSendDtmfParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ActionSendDtmfResponse> =
        // post /calls/{call_control_id}/actions/send_dtmf
        withRawResponse().sendDtmf(params, requestOptions).thenApply { it.parse() }

    override fun sendSipInfo(
        params: ActionSendSipInfoParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ActionSendSipInfoResponse> =
        // post /calls/{call_control_id}/actions/send_sip_info
        withRawResponse().sendSipInfo(params, requestOptions).thenApply { it.parse() }

    override fun speak(
        params: ActionSpeakParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ActionSpeakResponse> =
        // post /calls/{call_control_id}/actions/speak
        withRawResponse().speak(params, requestOptions).thenApply { it.parse() }

    override fun startAiAssistant(
        params: ActionStartAiAssistantParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ActionStartAiAssistantResponse> =
        // post /calls/{call_control_id}/actions/ai_assistant_start
        withRawResponse().startAiAssistant(params, requestOptions).thenApply { it.parse() }

    override fun startForking(
        params: ActionStartForkingParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ActionStartForkingResponse> =
        // post /calls/{call_control_id}/actions/fork_start
        withRawResponse().startForking(params, requestOptions).thenApply { it.parse() }

    override fun startNoiseSuppression(
        params: ActionStartNoiseSuppressionParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ActionStartNoiseSuppressionResponse> =
        // post /calls/{call_control_id}/actions/suppression_start
        withRawResponse().startNoiseSuppression(params, requestOptions).thenApply { it.parse() }

    override fun startPlayback(
        params: ActionStartPlaybackParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ActionStartPlaybackResponse> =
        // post /calls/{call_control_id}/actions/playback_start
        withRawResponse().startPlayback(params, requestOptions).thenApply { it.parse() }

    override fun startRecording(
        params: ActionStartRecordingParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ActionStartRecordingResponse> =
        // post /calls/{call_control_id}/actions/record_start
        withRawResponse().startRecording(params, requestOptions).thenApply { it.parse() }

    override fun startSiprec(
        params: ActionStartSiprecParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ActionStartSiprecResponse> =
        // post /calls/{call_control_id}/actions/siprec_start
        withRawResponse().startSiprec(params, requestOptions).thenApply { it.parse() }

    override fun startStreaming(
        params: ActionStartStreamingParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ActionStartStreamingResponse> =
        // post /calls/{call_control_id}/actions/streaming_start
        withRawResponse().startStreaming(params, requestOptions).thenApply { it.parse() }

    override fun startTranscription(
        params: ActionStartTranscriptionParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ActionStartTranscriptionResponse> =
        // post /calls/{call_control_id}/actions/transcription_start
        withRawResponse().startTranscription(params, requestOptions).thenApply { it.parse() }

    override fun stopAiAssistant(
        params: ActionStopAiAssistantParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ActionStopAiAssistantResponse> =
        // post /calls/{call_control_id}/actions/ai_assistant_stop
        withRawResponse().stopAiAssistant(params, requestOptions).thenApply { it.parse() }

    override fun stopForking(
        params: ActionStopForkingParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ActionStopForkingResponse> =
        // post /calls/{call_control_id}/actions/fork_stop
        withRawResponse().stopForking(params, requestOptions).thenApply { it.parse() }

    override fun stopGather(
        params: ActionStopGatherParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ActionStopGatherResponse> =
        // post /calls/{call_control_id}/actions/gather_stop
        withRawResponse().stopGather(params, requestOptions).thenApply { it.parse() }

    override fun stopNoiseSuppression(
        params: ActionStopNoiseSuppressionParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ActionStopNoiseSuppressionResponse> =
        // post /calls/{call_control_id}/actions/suppression_stop
        withRawResponse().stopNoiseSuppression(params, requestOptions).thenApply { it.parse() }

    override fun stopPlayback(
        params: ActionStopPlaybackParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ActionStopPlaybackResponse> =
        // post /calls/{call_control_id}/actions/playback_stop
        withRawResponse().stopPlayback(params, requestOptions).thenApply { it.parse() }

    override fun stopRecording(
        params: ActionStopRecordingParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ActionStopRecordingResponse> =
        // post /calls/{call_control_id}/actions/record_stop
        withRawResponse().stopRecording(params, requestOptions).thenApply { it.parse() }

    override fun stopSiprec(
        params: ActionStopSiprecParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ActionStopSiprecResponse> =
        // post /calls/{call_control_id}/actions/siprec_stop
        withRawResponse().stopSiprec(params, requestOptions).thenApply { it.parse() }

    override fun stopStreaming(
        params: ActionStopStreamingParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ActionStopStreamingResponse> =
        // post /calls/{call_control_id}/actions/streaming_stop
        withRawResponse().stopStreaming(params, requestOptions).thenApply { it.parse() }

    override fun stopTranscription(
        params: ActionStopTranscriptionParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ActionStopTranscriptionResponse> =
        // post /calls/{call_control_id}/actions/transcription_stop
        withRawResponse().stopTranscription(params, requestOptions).thenApply { it.parse() }

    override fun switchSupervisorRole(
        params: ActionSwitchSupervisorRoleParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ActionSwitchSupervisorRoleResponse> =
        // post /calls/{call_control_id}/actions/switch_supervisor_role
        withRawResponse().switchSupervisorRole(params, requestOptions).thenApply { it.parse() }

    override fun transfer(
        params: ActionTransferParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ActionTransferResponse> =
        // post /calls/{call_control_id}/actions/transfer
        withRawResponse().transfer(params, requestOptions).thenApply { it.parse() }

    override fun updateClientState(
        params: ActionUpdateClientStateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ActionUpdateClientStateResponse> =
        // put /calls/{call_control_id}/actions/client_state_update
        withRawResponse().updateClientState(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ActionServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ActionServiceAsync.WithRawResponse =
            ActionServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val answerHandler: Handler<ActionAnswerResponse> =
            jsonHandler<ActionAnswerResponse>(clientOptions.jsonMapper)

        override fun answer(
            params: ActionAnswerParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ActionAnswerResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("callControlId", params.callControlId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("calls", params._pathParam(0), "actions", "answer")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { answerHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val bridgeHandler: Handler<ActionBridgeResponse> =
            jsonHandler<ActionBridgeResponse>(clientOptions.jsonMapper)

        override fun bridge(
            params: ActionBridgeParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ActionBridgeResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("callControlIdToBridge", params.callControlIdToBridge().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("calls", params._pathParam(0), "actions", "bridge")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { bridgeHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val enqueueHandler: Handler<ActionEnqueueResponse> =
            jsonHandler<ActionEnqueueResponse>(clientOptions.jsonMapper)

        override fun enqueue(
            params: ActionEnqueueParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ActionEnqueueResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("callControlId", params.callControlId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("calls", params._pathParam(0), "actions", "enqueue")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { enqueueHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val gatherHandler: Handler<ActionGatherResponse> =
            jsonHandler<ActionGatherResponse>(clientOptions.jsonMapper)

        override fun gather(
            params: ActionGatherParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ActionGatherResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("callControlId", params.callControlId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("calls", params._pathParam(0), "actions", "gather")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { gatherHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val gatherUsingAiHandler: Handler<ActionGatherUsingAiResponse> =
            jsonHandler<ActionGatherUsingAiResponse>(clientOptions.jsonMapper)

        override fun gatherUsingAi(
            params: ActionGatherUsingAiParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ActionGatherUsingAiResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("callControlId", params.callControlId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("calls", params._pathParam(0), "actions", "gather_using_ai")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { gatherUsingAiHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val gatherUsingAudioHandler: Handler<ActionGatherUsingAudioResponse> =
            jsonHandler<ActionGatherUsingAudioResponse>(clientOptions.jsonMapper)

        override fun gatherUsingAudio(
            params: ActionGatherUsingAudioParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ActionGatherUsingAudioResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("callControlId", params.callControlId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("calls", params._pathParam(0), "actions", "gather_using_audio")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { gatherUsingAudioHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val gatherUsingSpeakHandler: Handler<ActionGatherUsingSpeakResponse> =
            jsonHandler<ActionGatherUsingSpeakResponse>(clientOptions.jsonMapper)

        override fun gatherUsingSpeak(
            params: ActionGatherUsingSpeakParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ActionGatherUsingSpeakResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("callControlId", params.callControlId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("calls", params._pathParam(0), "actions", "gather_using_speak")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { gatherUsingSpeakHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val hangupHandler: Handler<ActionHangupResponse> =
            jsonHandler<ActionHangupResponse>(clientOptions.jsonMapper)

        override fun hangup(
            params: ActionHangupParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ActionHangupResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("callControlId", params.callControlId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("calls", params._pathParam(0), "actions", "hangup")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { hangupHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val leaveQueueHandler: Handler<ActionLeaveQueueResponse> =
            jsonHandler<ActionLeaveQueueResponse>(clientOptions.jsonMapper)

        override fun leaveQueue(
            params: ActionLeaveQueueParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ActionLeaveQueueResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("callControlId", params.callControlId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("calls", params._pathParam(0), "actions", "leave_queue")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { leaveQueueHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val pauseRecordingHandler: Handler<ActionPauseRecordingResponse> =
            jsonHandler<ActionPauseRecordingResponse>(clientOptions.jsonMapper)

        override fun pauseRecording(
            params: ActionPauseRecordingParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ActionPauseRecordingResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("callControlId", params.callControlId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("calls", params._pathParam(0), "actions", "record_pause")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { pauseRecordingHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val referHandler: Handler<ActionReferResponse> =
            jsonHandler<ActionReferResponse>(clientOptions.jsonMapper)

        override fun refer(
            params: ActionReferParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ActionReferResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("callControlId", params.callControlId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("calls", params._pathParam(0), "actions", "refer")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { referHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val rejectHandler: Handler<ActionRejectResponse> =
            jsonHandler<ActionRejectResponse>(clientOptions.jsonMapper)

        override fun reject(
            params: ActionRejectParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ActionRejectResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("callControlId", params.callControlId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("calls", params._pathParam(0), "actions", "reject")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { rejectHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val resumeRecordingHandler: Handler<ActionResumeRecordingResponse> =
            jsonHandler<ActionResumeRecordingResponse>(clientOptions.jsonMapper)

        override fun resumeRecording(
            params: ActionResumeRecordingParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ActionResumeRecordingResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("callControlId", params.callControlId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("calls", params._pathParam(0), "actions", "record_resume")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { resumeRecordingHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val sendDtmfHandler: Handler<ActionSendDtmfResponse> =
            jsonHandler<ActionSendDtmfResponse>(clientOptions.jsonMapper)

        override fun sendDtmf(
            params: ActionSendDtmfParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ActionSendDtmfResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("callControlId", params.callControlId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("calls", params._pathParam(0), "actions", "send_dtmf")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { sendDtmfHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val sendSipInfoHandler: Handler<ActionSendSipInfoResponse> =
            jsonHandler<ActionSendSipInfoResponse>(clientOptions.jsonMapper)

        override fun sendSipInfo(
            params: ActionSendSipInfoParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ActionSendSipInfoResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("callControlId", params.callControlId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("calls", params._pathParam(0), "actions", "send_sip_info")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { sendSipInfoHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val speakHandler: Handler<ActionSpeakResponse> =
            jsonHandler<ActionSpeakResponse>(clientOptions.jsonMapper)

        override fun speak(
            params: ActionSpeakParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ActionSpeakResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("callControlId", params.callControlId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("calls", params._pathParam(0), "actions", "speak")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { speakHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val startAiAssistantHandler: Handler<ActionStartAiAssistantResponse> =
            jsonHandler<ActionStartAiAssistantResponse>(clientOptions.jsonMapper)

        override fun startAiAssistant(
            params: ActionStartAiAssistantParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ActionStartAiAssistantResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("callControlId", params.callControlId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("calls", params._pathParam(0), "actions", "ai_assistant_start")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { startAiAssistantHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val startForkingHandler: Handler<ActionStartForkingResponse> =
            jsonHandler<ActionStartForkingResponse>(clientOptions.jsonMapper)

        override fun startForking(
            params: ActionStartForkingParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ActionStartForkingResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("callControlId", params.callControlId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("calls", params._pathParam(0), "actions", "fork_start")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { startForkingHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val startNoiseSuppressionHandler: Handler<ActionStartNoiseSuppressionResponse> =
            jsonHandler<ActionStartNoiseSuppressionResponse>(clientOptions.jsonMapper)

        override fun startNoiseSuppression(
            params: ActionStartNoiseSuppressionParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ActionStartNoiseSuppressionResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("callControlId", params.callControlId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("calls", params._pathParam(0), "actions", "suppression_start")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { startNoiseSuppressionHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val startPlaybackHandler: Handler<ActionStartPlaybackResponse> =
            jsonHandler<ActionStartPlaybackResponse>(clientOptions.jsonMapper)

        override fun startPlayback(
            params: ActionStartPlaybackParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ActionStartPlaybackResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("callControlId", params.callControlId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("calls", params._pathParam(0), "actions", "playback_start")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { startPlaybackHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val startRecordingHandler: Handler<ActionStartRecordingResponse> =
            jsonHandler<ActionStartRecordingResponse>(clientOptions.jsonMapper)

        override fun startRecording(
            params: ActionStartRecordingParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ActionStartRecordingResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("callControlId", params.callControlId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("calls", params._pathParam(0), "actions", "record_start")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { startRecordingHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val startSiprecHandler: Handler<ActionStartSiprecResponse> =
            jsonHandler<ActionStartSiprecResponse>(clientOptions.jsonMapper)

        override fun startSiprec(
            params: ActionStartSiprecParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ActionStartSiprecResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("callControlId", params.callControlId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("calls", params._pathParam(0), "actions", "siprec_start")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { startSiprecHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val startStreamingHandler: Handler<ActionStartStreamingResponse> =
            jsonHandler<ActionStartStreamingResponse>(clientOptions.jsonMapper)

        override fun startStreaming(
            params: ActionStartStreamingParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ActionStartStreamingResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("callControlId", params.callControlId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("calls", params._pathParam(0), "actions", "streaming_start")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { startStreamingHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val startTranscriptionHandler: Handler<ActionStartTranscriptionResponse> =
            jsonHandler<ActionStartTranscriptionResponse>(clientOptions.jsonMapper)

        override fun startTranscription(
            params: ActionStartTranscriptionParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ActionStartTranscriptionResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("callControlId", params.callControlId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "calls",
                        params._pathParam(0),
                        "actions",
                        "transcription_start",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { startTranscriptionHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val stopAiAssistantHandler: Handler<ActionStopAiAssistantResponse> =
            jsonHandler<ActionStopAiAssistantResponse>(clientOptions.jsonMapper)

        override fun stopAiAssistant(
            params: ActionStopAiAssistantParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ActionStopAiAssistantResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("callControlId", params.callControlId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("calls", params._pathParam(0), "actions", "ai_assistant_stop")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { stopAiAssistantHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val stopForkingHandler: Handler<ActionStopForkingResponse> =
            jsonHandler<ActionStopForkingResponse>(clientOptions.jsonMapper)

        override fun stopForking(
            params: ActionStopForkingParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ActionStopForkingResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("callControlId", params.callControlId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("calls", params._pathParam(0), "actions", "fork_stop")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { stopForkingHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val stopGatherHandler: Handler<ActionStopGatherResponse> =
            jsonHandler<ActionStopGatherResponse>(clientOptions.jsonMapper)

        override fun stopGather(
            params: ActionStopGatherParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ActionStopGatherResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("callControlId", params.callControlId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("calls", params._pathParam(0), "actions", "gather_stop")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { stopGatherHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val stopNoiseSuppressionHandler: Handler<ActionStopNoiseSuppressionResponse> =
            jsonHandler<ActionStopNoiseSuppressionResponse>(clientOptions.jsonMapper)

        override fun stopNoiseSuppression(
            params: ActionStopNoiseSuppressionParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ActionStopNoiseSuppressionResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("callControlId", params.callControlId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("calls", params._pathParam(0), "actions", "suppression_stop")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { stopNoiseSuppressionHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val stopPlaybackHandler: Handler<ActionStopPlaybackResponse> =
            jsonHandler<ActionStopPlaybackResponse>(clientOptions.jsonMapper)

        override fun stopPlayback(
            params: ActionStopPlaybackParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ActionStopPlaybackResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("callControlId", params.callControlId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("calls", params._pathParam(0), "actions", "playback_stop")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { stopPlaybackHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val stopRecordingHandler: Handler<ActionStopRecordingResponse> =
            jsonHandler<ActionStopRecordingResponse>(clientOptions.jsonMapper)

        override fun stopRecording(
            params: ActionStopRecordingParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ActionStopRecordingResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("callControlId", params.callControlId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("calls", params._pathParam(0), "actions", "record_stop")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { stopRecordingHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val stopSiprecHandler: Handler<ActionStopSiprecResponse> =
            jsonHandler<ActionStopSiprecResponse>(clientOptions.jsonMapper)

        override fun stopSiprec(
            params: ActionStopSiprecParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ActionStopSiprecResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("callControlId", params.callControlId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("calls", params._pathParam(0), "actions", "siprec_stop")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { stopSiprecHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val stopStreamingHandler: Handler<ActionStopStreamingResponse> =
            jsonHandler<ActionStopStreamingResponse>(clientOptions.jsonMapper)

        override fun stopStreaming(
            params: ActionStopStreamingParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ActionStopStreamingResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("callControlId", params.callControlId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("calls", params._pathParam(0), "actions", "streaming_stop")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { stopStreamingHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val stopTranscriptionHandler: Handler<ActionStopTranscriptionResponse> =
            jsonHandler<ActionStopTranscriptionResponse>(clientOptions.jsonMapper)

        override fun stopTranscription(
            params: ActionStopTranscriptionParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ActionStopTranscriptionResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("callControlId", params.callControlId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("calls", params._pathParam(0), "actions", "transcription_stop")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { stopTranscriptionHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val switchSupervisorRoleHandler: Handler<ActionSwitchSupervisorRoleResponse> =
            jsonHandler<ActionSwitchSupervisorRoleResponse>(clientOptions.jsonMapper)

        override fun switchSupervisorRole(
            params: ActionSwitchSupervisorRoleParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ActionSwitchSupervisorRoleResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("callControlId", params.callControlId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "calls",
                        params._pathParam(0),
                        "actions",
                        "switch_supervisor_role",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { switchSupervisorRoleHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val transferHandler: Handler<ActionTransferResponse> =
            jsonHandler<ActionTransferResponse>(clientOptions.jsonMapper)

        override fun transfer(
            params: ActionTransferParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ActionTransferResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("callControlId", params.callControlId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("calls", params._pathParam(0), "actions", "transfer")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { transferHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val updateClientStateHandler: Handler<ActionUpdateClientStateResponse> =
            jsonHandler<ActionUpdateClientStateResponse>(clientOptions.jsonMapper)

        override fun updateClientState(
            params: ActionUpdateClientStateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ActionUpdateClientStateResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("callControlId", params.callControlId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "calls",
                        params._pathParam(0),
                        "actions",
                        "client_state_update",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { updateClientStateHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }
    }
}
