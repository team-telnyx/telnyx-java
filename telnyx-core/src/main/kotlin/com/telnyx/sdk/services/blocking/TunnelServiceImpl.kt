// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.handlers.emptyHandler
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
import com.telnyx.sdk.models.tunnels.TunnelCreateParams
import com.telnyx.sdk.models.tunnels.TunnelCreateResponse
import com.telnyx.sdk.models.tunnels.TunnelDeleteParams
import com.telnyx.sdk.models.tunnels.TunnelListParams
import com.telnyx.sdk.models.tunnels.TunnelListResponse
import com.telnyx.sdk.models.tunnels.TunnelRetrieveParams
import com.telnyx.sdk.models.tunnels.TunnelRetrieveResponse
import com.telnyx.sdk.services.blocking.tunnels.ActionService
import com.telnyx.sdk.services.blocking.tunnels.ActionServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** Tunnels connect a Network to hosts behind a tunnel process within the user's network. */
class TunnelServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    TunnelService {

    private val withRawResponse: TunnelService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val actions: ActionService by lazy { ActionServiceImpl(clientOptions) }

    override fun withRawResponse(): TunnelService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): TunnelService =
        TunnelServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /** Tunnels connect a Network to hosts behind a tunnel process within the user's network. */
    override fun actions(): ActionService = actions

    override fun create(
        params: TunnelCreateParams,
        requestOptions: RequestOptions,
    ): TunnelCreateResponse =
        // post /tunnels
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: TunnelRetrieveParams,
        requestOptions: RequestOptions,
    ): TunnelRetrieveResponse =
        // get /tunnels/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(
        params: TunnelListParams,
        requestOptions: RequestOptions,
    ): TunnelListResponse =
        // get /tunnels
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: TunnelDeleteParams, requestOptions: RequestOptions) {
        // delete /tunnels/{id}
        withRawResponse().delete(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        TunnelService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val actions: ActionService.WithRawResponse by lazy {
            ActionServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): TunnelService.WithRawResponse =
            TunnelServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /** Tunnels connect a Network to hosts behind a tunnel process within the user's network. */
        override fun actions(): ActionService.WithRawResponse = actions

        private val createHandler: Handler<TunnelCreateResponse> =
            jsonHandler<TunnelCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: TunnelCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TunnelCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("tunnels")
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

        private val retrieveHandler: Handler<TunnelRetrieveResponse> =
            jsonHandler<TunnelRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: TunnelRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TunnelRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("tunnels", params._pathParam(0))
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

        private val listHandler: Handler<TunnelListResponse> =
            jsonHandler<TunnelListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: TunnelListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TunnelListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("tunnels")
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
            params: TunnelDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("tunnels", params._pathParam(0))
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
