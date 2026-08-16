// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.meetingsessions

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
import com.telnyx.sdk.models.meetingsessions.actions.ActionAcceptedResponse
import com.telnyx.sdk.models.meetingsessions.actions.ActionSendChatParams
import com.telnyx.sdk.models.meetingsessions.actions.ActionSpeakParams
import com.telnyx.sdk.models.meetingsessions.actions.ActionStopSpeakingParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** Send real-time speech and chat actions to an active meeting session. */
class ActionServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    ActionServiceAsync {

    private val withRawResponse: ActionServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ActionServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ActionServiceAsync =
        ActionServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun sendChat(
        params: ActionSendChatParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ActionAcceptedResponse> =
        // post /meeting_sessions/{id}/actions/send_chat
        withRawResponse().sendChat(params, requestOptions).thenApply { it.parse() }

    override fun speak(
        params: ActionSpeakParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ActionAcceptedResponse> =
        // post /meeting_sessions/{id}/actions/speak
        withRawResponse().speak(params, requestOptions).thenApply { it.parse() }

    override fun stopSpeaking(
        params: ActionStopSpeakingParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ActionAcceptedResponse> =
        // post /meeting_sessions/{id}/actions/stop_speaking
        withRawResponse().stopSpeaking(params, requestOptions).thenApply { it.parse() }

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

        private val sendChatHandler: Handler<ActionAcceptedResponse> =
            jsonHandler<ActionAcceptedResponse>(clientOptions.jsonMapper)

        override fun sendChat(
            params: ActionSendChatParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ActionAcceptedResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "meeting_sessions",
                        params._pathParam(0),
                        "actions",
                        "send_chat",
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
                            .use { sendChatHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val speakHandler: Handler<ActionAcceptedResponse> =
            jsonHandler<ActionAcceptedResponse>(clientOptions.jsonMapper)

        override fun speak(
            params: ActionSpeakParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ActionAcceptedResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("meeting_sessions", params._pathParam(0), "actions", "speak")
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

        private val stopSpeakingHandler: Handler<ActionAcceptedResponse> =
            jsonHandler<ActionAcceptedResponse>(clientOptions.jsonMapper)

        override fun stopSpeaking(
            params: ActionStopSpeakingParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ActionAcceptedResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "meeting_sessions",
                        params._pathParam(0),
                        "actions",
                        "stop_speaking",
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { stopSpeakingHandler.handle(it) }
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
