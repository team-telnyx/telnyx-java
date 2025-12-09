// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

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
import com.telnyx.sdk.models.networks.NetworkCreateParams
import com.telnyx.sdk.models.networks.NetworkCreateResponse
import com.telnyx.sdk.models.networks.NetworkDeleteParams
import com.telnyx.sdk.models.networks.NetworkDeleteResponse
import com.telnyx.sdk.models.networks.NetworkListInterfacesPage
import com.telnyx.sdk.models.networks.NetworkListInterfacesPageResponse
import com.telnyx.sdk.models.networks.NetworkListInterfacesParams
import com.telnyx.sdk.models.networks.NetworkListPage
import com.telnyx.sdk.models.networks.NetworkListPageResponse
import com.telnyx.sdk.models.networks.NetworkListParams
import com.telnyx.sdk.models.networks.NetworkRetrieveParams
import com.telnyx.sdk.models.networks.NetworkRetrieveResponse
import com.telnyx.sdk.models.networks.NetworkUpdateParams
import com.telnyx.sdk.models.networks.NetworkUpdateResponse
import com.telnyx.sdk.services.blocking.networks.DefaultGatewayService
import com.telnyx.sdk.services.blocking.networks.DefaultGatewayServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class NetworkServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    NetworkService {

    private val withRawResponse: NetworkService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val defaultGateway: DefaultGatewayService by lazy {
        DefaultGatewayServiceImpl(clientOptions)
    }

    override fun withRawResponse(): NetworkService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): NetworkService =
        NetworkServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun defaultGateway(): DefaultGatewayService = defaultGateway

    override fun create(
        params: NetworkCreateParams,
        requestOptions: RequestOptions,
    ): NetworkCreateResponse =
        // post /networks
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: NetworkRetrieveParams,
        requestOptions: RequestOptions,
    ): NetworkRetrieveResponse =
        // get /networks/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: NetworkUpdateParams,
        requestOptions: RequestOptions,
    ): NetworkUpdateResponse =
        // patch /networks/{id}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(params: NetworkListParams, requestOptions: RequestOptions): NetworkListPage =
        // get /networks
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(
        params: NetworkDeleteParams,
        requestOptions: RequestOptions,
    ): NetworkDeleteResponse =
        // delete /networks/{id}
        withRawResponse().delete(params, requestOptions).parse()

    override fun listInterfaces(
        params: NetworkListInterfacesParams,
        requestOptions: RequestOptions,
    ): NetworkListInterfacesPage =
        // get /networks/{id}/network_interfaces
        withRawResponse().listInterfaces(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        NetworkService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val defaultGateway: DefaultGatewayService.WithRawResponse by lazy {
            DefaultGatewayServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): NetworkService.WithRawResponse =
            NetworkServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun defaultGateway(): DefaultGatewayService.WithRawResponse = defaultGateway

        private val createHandler: Handler<NetworkCreateResponse> =
            jsonHandler<NetworkCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: NetworkCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<NetworkCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("networks")
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

        private val retrieveHandler: Handler<NetworkRetrieveResponse> =
            jsonHandler<NetworkRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: NetworkRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<NetworkRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("networks", params._pathParam(0))
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

        private val updateHandler: Handler<NetworkUpdateResponse> =
            jsonHandler<NetworkUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: NetworkUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<NetworkUpdateResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("networkId", params.networkId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("networks", params._pathParam(0))
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

        private val listHandler: Handler<NetworkListPageResponse> =
            jsonHandler<NetworkListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: NetworkListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<NetworkListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("networks")
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
                    .let {
                        NetworkListPage.builder()
                            .service(NetworkServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val deleteHandler: Handler<NetworkDeleteResponse> =
            jsonHandler<NetworkDeleteResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: NetworkDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<NetworkDeleteResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("networks", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { deleteHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listInterfacesHandler: Handler<NetworkListInterfacesPageResponse> =
            jsonHandler<NetworkListInterfacesPageResponse>(clientOptions.jsonMapper)

        override fun listInterfaces(
            params: NetworkListInterfacesParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<NetworkListInterfacesPage> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("networks", params._pathParam(0), "network_interfaces")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listInterfacesHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        NetworkListInterfacesPage.builder()
                            .service(NetworkServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }
    }
}
