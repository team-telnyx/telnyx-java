// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.rooms

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
import com.telnyx.sdk.core.prepare
import com.telnyx.sdk.models.rooms.sessions.SessionList0Page
import com.telnyx.sdk.models.rooms.sessions.SessionList0PageResponse
import com.telnyx.sdk.models.rooms.sessions.SessionList0Params
import com.telnyx.sdk.models.rooms.sessions.SessionList1Page
import com.telnyx.sdk.models.rooms.sessions.SessionList1PageResponse
import com.telnyx.sdk.models.rooms.sessions.SessionList1Params
import com.telnyx.sdk.models.rooms.sessions.SessionRetrieveParams
import com.telnyx.sdk.models.rooms.sessions.SessionRetrieveParticipantsPage
import com.telnyx.sdk.models.rooms.sessions.SessionRetrieveParticipantsPageResponse
import com.telnyx.sdk.models.rooms.sessions.SessionRetrieveParticipantsParams
import com.telnyx.sdk.models.rooms.sessions.SessionRetrieveResponse
import com.telnyx.sdk.services.blocking.rooms.sessions.ActionService
import com.telnyx.sdk.services.blocking.rooms.sessions.ActionServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class SessionServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    SessionService {

    private val withRawResponse: SessionService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val actions: ActionService by lazy { ActionServiceImpl(clientOptions) }

    override fun withRawResponse(): SessionService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SessionService =
        SessionServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /** Rooms Sessions operations. */
    override fun actions(): ActionService = actions

    override fun retrieve(
        params: SessionRetrieveParams,
        requestOptions: RequestOptions,
    ): SessionRetrieveResponse =
        // get /room_sessions/{room_session_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list0(
        params: SessionList0Params,
        requestOptions: RequestOptions,
    ): SessionList0Page =
        // get /room_sessions
        withRawResponse().list0(params, requestOptions).parse()

    override fun list1(
        params: SessionList1Params,
        requestOptions: RequestOptions,
    ): SessionList1Page =
        // get /rooms/{room_id}/sessions
        withRawResponse().list1(params, requestOptions).parse()

    override fun retrieveParticipants(
        params: SessionRetrieveParticipantsParams,
        requestOptions: RequestOptions,
    ): SessionRetrieveParticipantsPage =
        // get /room_sessions/{room_session_id}/participants
        withRawResponse().retrieveParticipants(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SessionService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val actions: ActionService.WithRawResponse by lazy {
            ActionServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SessionService.WithRawResponse =
            SessionServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /** Rooms Sessions operations. */
        override fun actions(): ActionService.WithRawResponse = actions

        private val retrieveHandler: Handler<SessionRetrieveResponse> =
            jsonHandler<SessionRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: SessionRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SessionRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("roomSessionId", params.roomSessionId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("room_sessions", params._pathParam(0))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val list0Handler: Handler<SessionList0PageResponse> =
            jsonHandler<SessionList0PageResponse>(clientOptions.jsonMapper)

        override fun list0(
            params: SessionList0Params,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SessionList0Page> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("room_sessions")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { list0Handler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        SessionList0Page.builder()
                            .service(SessionServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val list1Handler: Handler<SessionList1PageResponse> =
            jsonHandler<SessionList1PageResponse>(clientOptions.jsonMapper)

        override fun list1(
            params: SessionList1Params,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SessionList1Page> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("roomId", params.roomId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("rooms", params._pathParam(0), "sessions")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { list1Handler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        SessionList1Page.builder()
                            .service(SessionServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val retrieveParticipantsHandler: Handler<SessionRetrieveParticipantsPageResponse> =
            jsonHandler<SessionRetrieveParticipantsPageResponse>(clientOptions.jsonMapper)

        override fun retrieveParticipants(
            params: SessionRetrieveParticipantsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SessionRetrieveParticipantsPage> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("roomSessionId", params.roomSessionId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("room_sessions", params._pathParam(0), "participants")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveParticipantsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        SessionRetrieveParticipantsPage.builder()
                            .service(SessionServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }
    }
}
