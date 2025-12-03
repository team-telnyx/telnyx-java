// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.rooms

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
import com.telnyx.sdk.core.http.parseable
import com.telnyx.sdk.core.prepareAsync
import com.telnyx.sdk.models.rooms.sessions.SessionList0Params
import com.telnyx.sdk.models.rooms.sessions.SessionList0Response
import com.telnyx.sdk.models.rooms.sessions.SessionList1Params
import com.telnyx.sdk.models.rooms.sessions.SessionList1Response
import com.telnyx.sdk.models.rooms.sessions.SessionRetrieveParams
import com.telnyx.sdk.models.rooms.sessions.SessionRetrieveParticipantsParams
import com.telnyx.sdk.models.rooms.sessions.SessionRetrieveParticipantsResponse
import com.telnyx.sdk.models.rooms.sessions.SessionRetrieveResponse
import com.telnyx.sdk.services.async.rooms.sessions.ActionServiceAsync
import com.telnyx.sdk.services.async.rooms.sessions.ActionServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class SessionServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    SessionServiceAsync {

    private val withRawResponse: SessionServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val actions: ActionServiceAsync by lazy { ActionServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): SessionServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SessionServiceAsync =
        SessionServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun actions(): ActionServiceAsync = actions

    override fun retrieve(
        params: SessionRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SessionRetrieveResponse> =
        // get /room_sessions/{room_session_id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun list0(
        params: SessionList0Params,
        requestOptions: RequestOptions,
    ): CompletableFuture<SessionList0Response> =
        // get /room_sessions
        withRawResponse().list0(params, requestOptions).thenApply { it.parse() }

    override fun list1(
        params: SessionList1Params,
        requestOptions: RequestOptions,
    ): CompletableFuture<SessionList1Response> =
        // get /rooms/{room_id}/sessions
        withRawResponse().list1(params, requestOptions).thenApply { it.parse() }

    override fun retrieveParticipants(
        params: SessionRetrieveParticipantsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SessionRetrieveParticipantsResponse> =
        // get /room_sessions/{room_session_id}/participants
        withRawResponse().retrieveParticipants(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SessionServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val actions: ActionServiceAsync.WithRawResponse by lazy {
            ActionServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SessionServiceAsync.WithRawResponse =
            SessionServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun actions(): ActionServiceAsync.WithRawResponse = actions

        private val retrieveHandler: Handler<SessionRetrieveResponse> =
            jsonHandler<SessionRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: SessionRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SessionRetrieveResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("roomSessionId", params.roomSessionId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("room_sessions", params._pathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { retrieveHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val list0Handler: Handler<SessionList0Response> =
            jsonHandler<SessionList0Response>(clientOptions.jsonMapper)

        override fun list0(
            params: SessionList0Params,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SessionList0Response>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("room_sessions")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { list0Handler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val list1Handler: Handler<SessionList1Response> =
            jsonHandler<SessionList1Response>(clientOptions.jsonMapper)

        override fun list1(
            params: SessionList1Params,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SessionList1Response>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("roomId", params.roomId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("rooms", params._pathParam(0), "sessions")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { list1Handler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val retrieveParticipantsHandler: Handler<SessionRetrieveParticipantsResponse> =
            jsonHandler<SessionRetrieveParticipantsResponse>(clientOptions.jsonMapper)

        override fun retrieveParticipants(
            params: SessionRetrieveParticipantsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SessionRetrieveParticipantsResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("roomSessionId", params.roomSessionId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("room_sessions", params._pathParam(0), "participants")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { retrieveParticipantsHandler.handle(it) }
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
