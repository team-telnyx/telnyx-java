// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.conferences

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
import com.telnyx.sdk.core.prepare
import com.telnyx.sdk.models.conferences.actions.ActionEndConferenceParams
import com.telnyx.sdk.models.conferences.actions.ActionEndConferenceResponse
import com.telnyx.sdk.models.conferences.actions.ActionGatherDtmfAudioParams
import com.telnyx.sdk.models.conferences.actions.ActionGatherDtmfAudioResponse
import com.telnyx.sdk.models.conferences.actions.ActionHoldParams
import com.telnyx.sdk.models.conferences.actions.ActionHoldResponse
import com.telnyx.sdk.models.conferences.actions.ActionJoinParams
import com.telnyx.sdk.models.conferences.actions.ActionJoinResponse
import com.telnyx.sdk.models.conferences.actions.ActionLeaveParams
import com.telnyx.sdk.models.conferences.actions.ActionLeaveResponse
import com.telnyx.sdk.models.conferences.actions.ActionMuteParams
import com.telnyx.sdk.models.conferences.actions.ActionMuteResponse
import com.telnyx.sdk.models.conferences.actions.ActionPlayParams
import com.telnyx.sdk.models.conferences.actions.ActionPlayResponse
import com.telnyx.sdk.models.conferences.actions.ActionRecordPauseParams
import com.telnyx.sdk.models.conferences.actions.ActionRecordPauseResponse
import com.telnyx.sdk.models.conferences.actions.ActionRecordResumeParams
import com.telnyx.sdk.models.conferences.actions.ActionRecordResumeResponse
import com.telnyx.sdk.models.conferences.actions.ActionRecordStartParams
import com.telnyx.sdk.models.conferences.actions.ActionRecordStartResponse
import com.telnyx.sdk.models.conferences.actions.ActionRecordStopParams
import com.telnyx.sdk.models.conferences.actions.ActionRecordStopResponse
import com.telnyx.sdk.models.conferences.actions.ActionSendDtmfParams
import com.telnyx.sdk.models.conferences.actions.ActionSendDtmfResponse
import com.telnyx.sdk.models.conferences.actions.ActionSpeakParams
import com.telnyx.sdk.models.conferences.actions.ActionSpeakResponse
import com.telnyx.sdk.models.conferences.actions.ActionStopParams
import com.telnyx.sdk.models.conferences.actions.ActionStopResponse
import com.telnyx.sdk.models.conferences.actions.ActionUnholdParams
import com.telnyx.sdk.models.conferences.actions.ActionUnholdResponse
import com.telnyx.sdk.models.conferences.actions.ActionUnmuteParams
import com.telnyx.sdk.models.conferences.actions.ActionUnmuteResponse
import com.telnyx.sdk.models.conferences.actions.ActionUpdateParams
import com.telnyx.sdk.models.conferences.actions.ActionUpdateResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** Conference command operations */
class ActionServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ActionService {

    private val withRawResponse: ActionService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ActionService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ActionService =
        ActionServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun update(
        params: ActionUpdateParams,
        requestOptions: RequestOptions,
    ): ActionUpdateResponse =
        // post /conferences/{id}/actions/update
        withRawResponse().update(params, requestOptions).parse()

    override fun endConference(
        params: ActionEndConferenceParams,
        requestOptions: RequestOptions,
    ): ActionEndConferenceResponse =
        // post /conferences/{id}/actions/end
        withRawResponse().endConference(params, requestOptions).parse()

    override fun gatherDtmfAudio(
        params: ActionGatherDtmfAudioParams,
        requestOptions: RequestOptions,
    ): ActionGatherDtmfAudioResponse =
        // post /conferences/{id}/actions/gather_using_audio
        withRawResponse().gatherDtmfAudio(params, requestOptions).parse()

    override fun hold(
        params: ActionHoldParams,
        requestOptions: RequestOptions,
    ): ActionHoldResponse =
        // post /conferences/{id}/actions/hold
        withRawResponse().hold(params, requestOptions).parse()

    override fun join(
        params: ActionJoinParams,
        requestOptions: RequestOptions,
    ): ActionJoinResponse =
        // post /conferences/{id}/actions/join
        withRawResponse().join(params, requestOptions).parse()

    override fun leave(
        params: ActionLeaveParams,
        requestOptions: RequestOptions,
    ): ActionLeaveResponse =
        // post /conferences/{id}/actions/leave
        withRawResponse().leave(params, requestOptions).parse()

    override fun mute(
        params: ActionMuteParams,
        requestOptions: RequestOptions,
    ): ActionMuteResponse =
        // post /conferences/{id}/actions/mute
        withRawResponse().mute(params, requestOptions).parse()

    override fun play(
        params: ActionPlayParams,
        requestOptions: RequestOptions,
    ): ActionPlayResponse =
        // post /conferences/{id}/actions/play
        withRawResponse().play(params, requestOptions).parse()

    override fun recordPause(
        params: ActionRecordPauseParams,
        requestOptions: RequestOptions,
    ): ActionRecordPauseResponse =
        // post /conferences/{id}/actions/record_pause
        withRawResponse().recordPause(params, requestOptions).parse()

    override fun recordResume(
        params: ActionRecordResumeParams,
        requestOptions: RequestOptions,
    ): ActionRecordResumeResponse =
        // post /conferences/{id}/actions/record_resume
        withRawResponse().recordResume(params, requestOptions).parse()

    override fun recordStart(
        params: ActionRecordStartParams,
        requestOptions: RequestOptions,
    ): ActionRecordStartResponse =
        // post /conferences/{id}/actions/record_start
        withRawResponse().recordStart(params, requestOptions).parse()

    override fun recordStop(
        params: ActionRecordStopParams,
        requestOptions: RequestOptions,
    ): ActionRecordStopResponse =
        // post /conferences/{id}/actions/record_stop
        withRawResponse().recordStop(params, requestOptions).parse()

    override fun sendDtmf(
        params: ActionSendDtmfParams,
        requestOptions: RequestOptions,
    ): ActionSendDtmfResponse =
        // post /conferences/{id}/actions/send_dtmf
        withRawResponse().sendDtmf(params, requestOptions).parse()

    override fun speak(
        params: ActionSpeakParams,
        requestOptions: RequestOptions,
    ): ActionSpeakResponse =
        // post /conferences/{id}/actions/speak
        withRawResponse().speak(params, requestOptions).parse()

    override fun stop(
        params: ActionStopParams,
        requestOptions: RequestOptions,
    ): ActionStopResponse =
        // post /conferences/{id}/actions/stop
        withRawResponse().stop(params, requestOptions).parse()

    override fun unhold(
        params: ActionUnholdParams,
        requestOptions: RequestOptions,
    ): ActionUnholdResponse =
        // post /conferences/{id}/actions/unhold
        withRawResponse().unhold(params, requestOptions).parse()

    override fun unmute(
        params: ActionUnmuteParams,
        requestOptions: RequestOptions,
    ): ActionUnmuteResponse =
        // post /conferences/{id}/actions/unmute
        withRawResponse().unmute(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ActionService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ActionService.WithRawResponse =
            ActionServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val updateHandler: Handler<ActionUpdateResponse> =
            jsonHandler<ActionUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: ActionUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ActionUpdateResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("conferences", params._pathParam(0), "actions", "update")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { updateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val endConferenceHandler: Handler<ActionEndConferenceResponse> =
            jsonHandler<ActionEndConferenceResponse>(clientOptions.jsonMapper)

        override fun endConference(
            params: ActionEndConferenceParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ActionEndConferenceResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("conferences", params._pathParam(0), "actions", "end")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { endConferenceHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val gatherDtmfAudioHandler: Handler<ActionGatherDtmfAudioResponse> =
            jsonHandler<ActionGatherDtmfAudioResponse>(clientOptions.jsonMapper)

        override fun gatherDtmfAudio(
            params: ActionGatherDtmfAudioParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ActionGatherDtmfAudioResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "conferences",
                        params._pathParam(0),
                        "actions",
                        "gather_using_audio",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { gatherDtmfAudioHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val holdHandler: Handler<ActionHoldResponse> =
            jsonHandler<ActionHoldResponse>(clientOptions.jsonMapper)

        override fun hold(
            params: ActionHoldParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ActionHoldResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("conferences", params._pathParam(0), "actions", "hold")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { holdHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val joinHandler: Handler<ActionJoinResponse> =
            jsonHandler<ActionJoinResponse>(clientOptions.jsonMapper)

        override fun join(
            params: ActionJoinParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ActionJoinResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("conferences", params._pathParam(0), "actions", "join")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { joinHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val leaveHandler: Handler<ActionLeaveResponse> =
            jsonHandler<ActionLeaveResponse>(clientOptions.jsonMapper)

        override fun leave(
            params: ActionLeaveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ActionLeaveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("conferences", params._pathParam(0), "actions", "leave")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { leaveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val muteHandler: Handler<ActionMuteResponse> =
            jsonHandler<ActionMuteResponse>(clientOptions.jsonMapper)

        override fun mute(
            params: ActionMuteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ActionMuteResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("conferences", params._pathParam(0), "actions", "mute")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { muteHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val playHandler: Handler<ActionPlayResponse> =
            jsonHandler<ActionPlayResponse>(clientOptions.jsonMapper)

        override fun play(
            params: ActionPlayParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ActionPlayResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("conferences", params._pathParam(0), "actions", "play")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { playHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val recordPauseHandler: Handler<ActionRecordPauseResponse> =
            jsonHandler<ActionRecordPauseResponse>(clientOptions.jsonMapper)

        override fun recordPause(
            params: ActionRecordPauseParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ActionRecordPauseResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("conferences", params._pathParam(0), "actions", "record_pause")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { recordPauseHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val recordResumeHandler: Handler<ActionRecordResumeResponse> =
            jsonHandler<ActionRecordResumeResponse>(clientOptions.jsonMapper)

        override fun recordResume(
            params: ActionRecordResumeParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ActionRecordResumeResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "conferences",
                        params._pathParam(0),
                        "actions",
                        "record_resume",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { recordResumeHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val recordStartHandler: Handler<ActionRecordStartResponse> =
            jsonHandler<ActionRecordStartResponse>(clientOptions.jsonMapper)

        override fun recordStart(
            params: ActionRecordStartParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ActionRecordStartResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("conferences", params._pathParam(0), "actions", "record_start")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { recordStartHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val recordStopHandler: Handler<ActionRecordStopResponse> =
            jsonHandler<ActionRecordStopResponse>(clientOptions.jsonMapper)

        override fun recordStop(
            params: ActionRecordStopParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ActionRecordStopResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("conferences", params._pathParam(0), "actions", "record_stop")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { recordStopHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val sendDtmfHandler: Handler<ActionSendDtmfResponse> =
            jsonHandler<ActionSendDtmfResponse>(clientOptions.jsonMapper)

        override fun sendDtmf(
            params: ActionSendDtmfParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ActionSendDtmfResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("conferences", params._pathParam(0), "actions", "send_dtmf")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { sendDtmfHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val speakHandler: Handler<ActionSpeakResponse> =
            jsonHandler<ActionSpeakResponse>(clientOptions.jsonMapper)

        override fun speak(
            params: ActionSpeakParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ActionSpeakResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("conferences", params._pathParam(0), "actions", "speak")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { speakHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val stopHandler: Handler<ActionStopResponse> =
            jsonHandler<ActionStopResponse>(clientOptions.jsonMapper)

        override fun stop(
            params: ActionStopParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ActionStopResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("conferences", params._pathParam(0), "actions", "stop")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { stopHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val unholdHandler: Handler<ActionUnholdResponse> =
            jsonHandler<ActionUnholdResponse>(clientOptions.jsonMapper)

        override fun unhold(
            params: ActionUnholdParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ActionUnholdResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("conferences", params._pathParam(0), "actions", "unhold")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { unholdHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val unmuteHandler: Handler<ActionUnmuteResponse> =
            jsonHandler<ActionUnmuteResponse>(clientOptions.jsonMapper)

        override fun unmute(
            params: ActionUnmuteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ActionUnmuteResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("conferences", params._pathParam(0), "actions", "unmute")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { unmuteHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
