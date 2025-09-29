// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.rooms.sessions

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
import com.telnyx.sdk.models.rooms.sessions.actions.ActionEndParams
import com.telnyx.sdk.models.rooms.sessions.actions.ActionEndResponse
import com.telnyx.sdk.models.rooms.sessions.actions.ActionKickParams
import com.telnyx.sdk.models.rooms.sessions.actions.ActionKickResponse
import com.telnyx.sdk.models.rooms.sessions.actions.ActionMuteParams
import com.telnyx.sdk.models.rooms.sessions.actions.ActionMuteResponse
import com.telnyx.sdk.models.rooms.sessions.actions.ActionUnmuteParams
import com.telnyx.sdk.models.rooms.sessions.actions.ActionUnmuteResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class ActionServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ActionService {

    private val withRawResponse: ActionService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ActionService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ActionService =
        ActionServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun end(params: ActionEndParams, requestOptions: RequestOptions): ActionEndResponse =
        // post /room_sessions/{room_session_id}/actions/end
        withRawResponse().end(params, requestOptions).parse()

    override fun kick(
        params: ActionKickParams,
        requestOptions: RequestOptions,
    ): ActionKickResponse =
        // post /room_sessions/{room_session_id}/actions/kick
        withRawResponse().kick(params, requestOptions).parse()

    override fun mute(
        params: ActionMuteParams,
        requestOptions: RequestOptions,
    ): ActionMuteResponse =
        // post /room_sessions/{room_session_id}/actions/mute
        withRawResponse().mute(params, requestOptions).parse()

    override fun unmute(
        params: ActionUnmuteParams,
        requestOptions: RequestOptions,
    ): ActionUnmuteResponse =
        // post /room_sessions/{room_session_id}/actions/unmute
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

        private val endHandler: Handler<ActionEndResponse> =
            jsonHandler<ActionEndResponse>(clientOptions.jsonMapper)

        override fun end(
            params: ActionEndParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ActionEndResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("roomSessionId", params.roomSessionId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("room_sessions", params._pathParam(0), "actions", "end")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { endHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val kickHandler: Handler<ActionKickResponse> =
            jsonHandler<ActionKickResponse>(clientOptions.jsonMapper)

        override fun kick(
            params: ActionKickParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ActionKickResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("roomSessionId", params.roomSessionId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("room_sessions", params._pathParam(0), "actions", "kick")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { kickHandler.handle(it) }
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
            checkRequired("roomSessionId", params.roomSessionId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("room_sessions", params._pathParam(0), "actions", "mute")
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

        private val unmuteHandler: Handler<ActionUnmuteResponse> =
            jsonHandler<ActionUnmuteResponse>(clientOptions.jsonMapper)

        override fun unmute(
            params: ActionUnmuteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ActionUnmuteResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("roomSessionId", params.roomSessionId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("room_sessions", params._pathParam(0), "actions", "unmute")
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
