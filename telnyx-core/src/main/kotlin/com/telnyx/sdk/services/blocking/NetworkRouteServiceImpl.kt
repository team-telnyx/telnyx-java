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
import com.telnyx.sdk.models.networkroutes.NetworkRouteCreateParams
import com.telnyx.sdk.models.networkroutes.NetworkRouteCreateResponse
import com.telnyx.sdk.models.networkroutes.NetworkRouteDeleteParams
import com.telnyx.sdk.models.networkroutes.NetworkRouteListParams
import com.telnyx.sdk.models.networkroutes.NetworkRouteListResponse
import com.telnyx.sdk.models.networkroutes.NetworkRouteRetrieveParams
import com.telnyx.sdk.models.networkroutes.NetworkRouteRetrieveResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** Routes on a Network that send a CIDR to a next hop, such as a tunnel. */
class NetworkRouteServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    NetworkRouteService {

    private val withRawResponse: NetworkRouteService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): NetworkRouteService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): NetworkRouteService =
        NetworkRouteServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: NetworkRouteCreateParams,
        requestOptions: RequestOptions,
    ): NetworkRouteCreateResponse =
        // post /network_routes
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: NetworkRouteRetrieveParams,
        requestOptions: RequestOptions,
    ): NetworkRouteRetrieveResponse =
        // get /network_routes/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(
        params: NetworkRouteListParams,
        requestOptions: RequestOptions,
    ): NetworkRouteListResponse =
        // get /network_routes
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: NetworkRouteDeleteParams, requestOptions: RequestOptions) {
        // delete /network_routes/{id}
        withRawResponse().delete(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        NetworkRouteService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): NetworkRouteService.WithRawResponse =
            NetworkRouteServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<NetworkRouteCreateResponse> =
            jsonHandler<NetworkRouteCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: NetworkRouteCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<NetworkRouteCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("network_routes")
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

        private val retrieveHandler: Handler<NetworkRouteRetrieveResponse> =
            jsonHandler<NetworkRouteRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: NetworkRouteRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<NetworkRouteRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("network_routes", params._pathParam(0))
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

        private val listHandler: Handler<NetworkRouteListResponse> =
            jsonHandler<NetworkRouteListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: NetworkRouteListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<NetworkRouteListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("network_routes")
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
            params: NetworkRouteDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("network_routes", params._pathParam(0))
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
