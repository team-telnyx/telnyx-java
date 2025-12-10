// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

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
import com.telnyx.sdk.models.privatewirelessgateways.PrivateWirelessGatewayCreateParams
import com.telnyx.sdk.models.privatewirelessgateways.PrivateWirelessGatewayCreateResponse
import com.telnyx.sdk.models.privatewirelessgateways.PrivateWirelessGatewayDeleteParams
import com.telnyx.sdk.models.privatewirelessgateways.PrivateWirelessGatewayDeleteResponse
import com.telnyx.sdk.models.privatewirelessgateways.PrivateWirelessGatewayListParams
import com.telnyx.sdk.models.privatewirelessgateways.PrivateWirelessGatewayListResponse
import com.telnyx.sdk.models.privatewirelessgateways.PrivateWirelessGatewayRetrieveParams
import com.telnyx.sdk.models.privatewirelessgateways.PrivateWirelessGatewayRetrieveResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class PrivateWirelessGatewayServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) :
    PrivateWirelessGatewayServiceAsync {

    private val withRawResponse: PrivateWirelessGatewayServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): PrivateWirelessGatewayServiceAsync.WithRawResponse =
        withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): PrivateWirelessGatewayServiceAsync =
        PrivateWirelessGatewayServiceAsyncImpl(
            clientOptions.toBuilder().apply(modifier::accept).build()
        )

    override fun create(
        params: PrivateWirelessGatewayCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PrivateWirelessGatewayCreateResponse> =
        // post /private_wireless_gateways
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: PrivateWirelessGatewayRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PrivateWirelessGatewayRetrieveResponse> =
        // get /private_wireless_gateways/{id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: PrivateWirelessGatewayListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PrivateWirelessGatewayListResponse> =
        // get /private_wireless_gateways
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: PrivateWirelessGatewayDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PrivateWirelessGatewayDeleteResponse> =
        // delete /private_wireless_gateways/{id}
        withRawResponse().delete(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PrivateWirelessGatewayServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PrivateWirelessGatewayServiceAsync.WithRawResponse =
            PrivateWirelessGatewayServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<PrivateWirelessGatewayCreateResponse> =
            jsonHandler<PrivateWirelessGatewayCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: PrivateWirelessGatewayCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PrivateWirelessGatewayCreateResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("private_wireless_gateways")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { createHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val retrieveHandler: Handler<PrivateWirelessGatewayRetrieveResponse> =
            jsonHandler<PrivateWirelessGatewayRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: PrivateWirelessGatewayRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PrivateWirelessGatewayRetrieveResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("private_wireless_gateways", params._pathParam(0))
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

        private val listHandler: Handler<PrivateWirelessGatewayListResponse> =
            jsonHandler<PrivateWirelessGatewayListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: PrivateWirelessGatewayListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PrivateWirelessGatewayListResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("private_wireless_gateways")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val deleteHandler: Handler<PrivateWirelessGatewayDeleteResponse> =
            jsonHandler<PrivateWirelessGatewayDeleteResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: PrivateWirelessGatewayDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PrivateWirelessGatewayDeleteResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("private_wireless_gateways", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { deleteHandler.handle(it) }
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
