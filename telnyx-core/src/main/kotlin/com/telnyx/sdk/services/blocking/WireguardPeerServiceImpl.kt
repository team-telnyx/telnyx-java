// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.handlers.errorBodyHandler
import com.telnyx.sdk.core.handlers.errorHandler
import com.telnyx.sdk.core.handlers.jsonHandler
import com.telnyx.sdk.core.handlers.stringHandler
import com.telnyx.sdk.core.http.HttpMethod
import com.telnyx.sdk.core.http.HttpRequest
import com.telnyx.sdk.core.http.HttpResponse
import com.telnyx.sdk.core.http.HttpResponse.Handler
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.core.http.json
import com.telnyx.sdk.core.http.parseable
import com.telnyx.sdk.core.prepare
import com.telnyx.sdk.models.wireguardpeers.WireguardPeerCreateParams
import com.telnyx.sdk.models.wireguardpeers.WireguardPeerCreateResponse
import com.telnyx.sdk.models.wireguardpeers.WireguardPeerDeleteParams
import com.telnyx.sdk.models.wireguardpeers.WireguardPeerDeleteResponse
import com.telnyx.sdk.models.wireguardpeers.WireguardPeerListParams
import com.telnyx.sdk.models.wireguardpeers.WireguardPeerListResponse
import com.telnyx.sdk.models.wireguardpeers.WireguardPeerRetrieveConfigParams
import com.telnyx.sdk.models.wireguardpeers.WireguardPeerRetrieveParams
import com.telnyx.sdk.models.wireguardpeers.WireguardPeerRetrieveResponse
import com.telnyx.sdk.models.wireguardpeers.WireguardPeerUpdateParams
import com.telnyx.sdk.models.wireguardpeers.WireguardPeerUpdateResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class WireguardPeerServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    WireguardPeerService {

    private val withRawResponse: WireguardPeerService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): WireguardPeerService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): WireguardPeerService =
        WireguardPeerServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: WireguardPeerCreateParams,
        requestOptions: RequestOptions,
    ): WireguardPeerCreateResponse =
        // post /wireguard_peers
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: WireguardPeerRetrieveParams,
        requestOptions: RequestOptions,
    ): WireguardPeerRetrieveResponse =
        // get /wireguard_peers/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: WireguardPeerUpdateParams,
        requestOptions: RequestOptions,
    ): WireguardPeerUpdateResponse =
        // patch /wireguard_peers/{id}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: WireguardPeerListParams,
        requestOptions: RequestOptions,
    ): WireguardPeerListResponse =
        // get /wireguard_peers
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(
        params: WireguardPeerDeleteParams,
        requestOptions: RequestOptions,
    ): WireguardPeerDeleteResponse =
        // delete /wireguard_peers/{id}
        withRawResponse().delete(params, requestOptions).parse()

    override fun retrieveConfig(
        params: WireguardPeerRetrieveConfigParams,
        requestOptions: RequestOptions,
    ): String =
        // get /wireguard_peers/{id}/config
        withRawResponse().retrieveConfig(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        WireguardPeerService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): WireguardPeerService.WithRawResponse =
            WireguardPeerServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<WireguardPeerCreateResponse> =
            jsonHandler<WireguardPeerCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: WireguardPeerCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<WireguardPeerCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("wireguard_peers")
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

        private val retrieveHandler: Handler<WireguardPeerRetrieveResponse> =
            jsonHandler<WireguardPeerRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: WireguardPeerRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<WireguardPeerRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("wireguard_peers", params._pathParam(0))
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

        private val updateHandler: Handler<WireguardPeerUpdateResponse> =
            jsonHandler<WireguardPeerUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: WireguardPeerUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<WireguardPeerUpdateResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("wireguard_peers", params._pathParam(0))
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

        private val listHandler: Handler<WireguardPeerListResponse> =
            jsonHandler<WireguardPeerListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: WireguardPeerListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<WireguardPeerListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("wireguard_peers")
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

        private val deleteHandler: Handler<WireguardPeerDeleteResponse> =
            jsonHandler<WireguardPeerDeleteResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: WireguardPeerDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<WireguardPeerDeleteResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("wireguard_peers", params._pathParam(0))
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

        private val retrieveConfigHandler: Handler<String> = stringHandler()

        override fun retrieveConfig(
            params: WireguardPeerRetrieveConfigParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<String> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("wireguard_peers", params._pathParam(0), "config")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { retrieveConfigHandler.handle(it) }
            }
        }
    }
}
