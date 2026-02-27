// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.rooms.sessions

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
import com.telnyx.sdk.models.rooms.sessions.actions.ActionEndParams
import com.telnyx.sdk.models.rooms.sessions.actions.ActionEndResponse
import com.telnyx.sdk.models.rooms.sessions.actions.ActionKickParams
import com.telnyx.sdk.models.rooms.sessions.actions.ActionKickResponse
import com.telnyx.sdk.models.rooms.sessions.actions.ActionMuteParams
import com.telnyx.sdk.models.rooms.sessions.actions.ActionMuteResponse
import com.telnyx.sdk.models.rooms.sessions.actions.ActionUnmuteParams
import com.telnyx.sdk.models.rooms.sessions.actions.ActionUnmuteResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** Rooms Sessions operations. */
class ActionServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    ActionServiceAsync {

    private val withRawResponse: ActionServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ActionServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ActionServiceAsync =
        ActionServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun end(
        params: ActionEndParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ActionEndResponse> =
        // post /room_sessions/{room_session_id}/actions/end
        withRawResponse().end(params, requestOptions).thenApply { it.parse() }

    override fun kick(
        params: ActionKickParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ActionKickResponse> =
        // post /room_sessions/{room_session_id}/actions/kick
        withRawResponse().kick(params, requestOptions).thenApply { it.parse() }

    override fun mute(
        params: ActionMuteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ActionMuteResponse> =
        // post /room_sessions/{room_session_id}/actions/mute
        withRawResponse().mute(params, requestOptions).thenApply { it.parse() }

    override fun unmute(
        params: ActionUnmuteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ActionUnmuteResponse> =
        // post /room_sessions/{room_session_id}/actions/unmute
        withRawResponse().unmute(params, requestOptions).thenApply { it.parse() }

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

        private val endHandler: Handler<ActionEndResponse> =
            jsonHandler<ActionEndResponse>(clientOptions.jsonMapper)

        override fun end(
            params: ActionEndParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ActionEndResponse>> {
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { endHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val kickHandler: Handler<ActionKickResponse> =
            jsonHandler<ActionKickResponse>(clientOptions.jsonMapper)

        override fun kick(
            params: ActionKickParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ActionKickResponse>> {
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { kickHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val muteHandler: Handler<ActionMuteResponse> =
            jsonHandler<ActionMuteResponse>(clientOptions.jsonMapper)

        override fun mute(
            params: ActionMuteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ActionMuteResponse>> {
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { muteHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val unmuteHandler: Handler<ActionUnmuteResponse> =
            jsonHandler<ActionUnmuteResponse>(clientOptions.jsonMapper)

        override fun unmute(
            params: ActionUnmuteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ActionUnmuteResponse>> {
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
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
}
