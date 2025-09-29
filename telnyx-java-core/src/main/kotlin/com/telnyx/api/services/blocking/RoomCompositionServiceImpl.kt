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
import com.telnyx.api.models.roomcompositions.RoomCompositionCreateParams
import com.telnyx.api.models.roomcompositions.RoomCompositionCreateResponse
import com.telnyx.api.models.roomcompositions.RoomCompositionDeleteParams
import com.telnyx.api.models.roomcompositions.RoomCompositionListParams
import com.telnyx.api.models.roomcompositions.RoomCompositionListResponse
import com.telnyx.api.models.roomcompositions.RoomCompositionRetrieveParams
import com.telnyx.api.models.roomcompositions.RoomCompositionRetrieveResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class RoomCompositionServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    RoomCompositionService {

    private val withRawResponse: RoomCompositionService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): RoomCompositionService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): RoomCompositionService =
        RoomCompositionServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: RoomCompositionCreateParams,
        requestOptions: RequestOptions,
    ): RoomCompositionCreateResponse =
        // post /room_compositions
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: RoomCompositionRetrieveParams,
        requestOptions: RequestOptions,
    ): RoomCompositionRetrieveResponse =
        // get /room_compositions/{room_composition_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(
        params: RoomCompositionListParams,
        requestOptions: RequestOptions,
    ): RoomCompositionListResponse =
        // get /room_compositions
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: RoomCompositionDeleteParams, requestOptions: RequestOptions) {
        // delete /room_compositions/{room_composition_id}
        withRawResponse().delete(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        RoomCompositionService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): RoomCompositionService.WithRawResponse =
            RoomCompositionServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<RoomCompositionCreateResponse> =
            jsonHandler<RoomCompositionCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: RoomCompositionCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RoomCompositionCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("room_compositions")
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

        private val retrieveHandler: Handler<RoomCompositionRetrieveResponse> =
            jsonHandler<RoomCompositionRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: RoomCompositionRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RoomCompositionRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("roomCompositionId", params.roomCompositionId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("room_compositions", params._pathParam(0))
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

        private val listHandler: Handler<RoomCompositionListResponse> =
            jsonHandler<RoomCompositionListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: RoomCompositionListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RoomCompositionListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("room_compositions")
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
            params: RoomCompositionDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("roomCompositionId", params.roomCompositionId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("room_compositions", params._pathParam(0))
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
