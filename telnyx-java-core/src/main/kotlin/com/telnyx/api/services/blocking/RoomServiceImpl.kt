// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking

import com.telnyx.api.core.ClientOptions
import com.telnyx.api.core.RequestOptions
import com.telnyx.api.core.checkRequired
import com.telnyx.api.core.handlers.emptyHandler
import com.telnyx.api.core.handlers.errorBodyHandler
import com.telnyx.api.core.handlers.errorHandler
import com.telnyx.api.core.handlers.jsonHandler
import com.telnyx.api.core.http.HttpMethod
import com.telnyx.api.core.http.HttpRequest
import com.telnyx.api.core.http.HttpResponse
import com.telnyx.api.core.http.HttpResponse.Handler
import com.telnyx.api.core.http.HttpResponseFor
import com.telnyx.api.core.http.json
import com.telnyx.api.core.http.parseable
import com.telnyx.api.core.prepare
import com.telnyx.api.models.rooms.RoomCreateParams
import com.telnyx.api.models.rooms.RoomCreateResponse
import com.telnyx.api.models.rooms.RoomDeleteParams
import com.telnyx.api.models.rooms.RoomListParams
import com.telnyx.api.models.rooms.RoomListResponse
import com.telnyx.api.models.rooms.RoomRetrieveParams
import com.telnyx.api.models.rooms.RoomRetrieveResponse
import com.telnyx.api.models.rooms.RoomUpdateParams
import com.telnyx.api.models.rooms.RoomUpdateResponse
import com.telnyx.api.services.blocking.rooms.ActionService
import com.telnyx.api.services.blocking.rooms.ActionServiceImpl
import com.telnyx.api.services.blocking.rooms.SessionService
import com.telnyx.api.services.blocking.rooms.SessionServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class RoomServiceImpl internal constructor(private val clientOptions: ClientOptions) : RoomService {

    private val withRawResponse: RoomService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val actions: ActionService by lazy { ActionServiceImpl(clientOptions) }

    private val sessions: SessionService by lazy { SessionServiceImpl(clientOptions) }

    override fun withRawResponse(): RoomService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): RoomService =
        RoomServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun actions(): ActionService = actions

    override fun sessions(): SessionService = sessions

    override fun create(
        params: RoomCreateParams,
        requestOptions: RequestOptions,
    ): RoomCreateResponse =
        // post /rooms
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: RoomRetrieveParams,
        requestOptions: RequestOptions,
    ): RoomRetrieveResponse =
        // get /rooms/{room_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: RoomUpdateParams,
        requestOptions: RequestOptions,
    ): RoomUpdateResponse =
        // patch /rooms/{room_id}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(params: RoomListParams, requestOptions: RequestOptions): RoomListResponse =
        // get /rooms
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: RoomDeleteParams, requestOptions: RequestOptions) {
        // delete /rooms/{room_id}
        withRawResponse().delete(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        RoomService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val actions: ActionService.WithRawResponse by lazy {
            ActionServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val sessions: SessionService.WithRawResponse by lazy {
            SessionServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): RoomService.WithRawResponse =
            RoomServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun actions(): ActionService.WithRawResponse = actions

        override fun sessions(): SessionService.WithRawResponse = sessions

        private val createHandler: Handler<RoomCreateResponse> =
            jsonHandler<RoomCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: RoomCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RoomCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("rooms")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retrieveHandler: Handler<RoomRetrieveResponse> =
            jsonHandler<RoomRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: RoomRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RoomRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("roomId", params.roomId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("rooms", params._pathParam(0))
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

        private val updateHandler: Handler<RoomUpdateResponse> =
            jsonHandler<RoomUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: RoomUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RoomUpdateResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("roomId", params.roomId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("rooms", params._pathParam(0))
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

        private val listHandler: Handler<RoomListResponse> =
            jsonHandler<RoomListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: RoomListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RoomListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("rooms")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: RoomDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("roomId", params.roomId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("rooms", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteHandler.handle(it) }
            }
        }
    }
}
