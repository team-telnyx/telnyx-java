// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async

import com.telnyx.api.core.ClientOptions
import com.telnyx.api.core.RequestOptions
import com.telnyx.api.core.checkRequired
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
import com.telnyx.api.core.prepareAsync
import com.telnyx.api.models.publicinternetgateways.PublicInternetGatewayCreateParams
import com.telnyx.api.models.publicinternetgateways.PublicInternetGatewayCreateResponse
import com.telnyx.api.models.publicinternetgateways.PublicInternetGatewayDeleteParams
import com.telnyx.api.models.publicinternetgateways.PublicInternetGatewayDeleteResponse
import com.telnyx.api.models.publicinternetgateways.PublicInternetGatewayListParams
import com.telnyx.api.models.publicinternetgateways.PublicInternetGatewayListResponse
import com.telnyx.api.models.publicinternetgateways.PublicInternetGatewayRetrieveParams
import com.telnyx.api.models.publicinternetgateways.PublicInternetGatewayRetrieveResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class PublicInternetGatewayServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : PublicInternetGatewayServiceAsync {

    private val withRawResponse: PublicInternetGatewayServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): PublicInternetGatewayServiceAsync.WithRawResponse =
        withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): PublicInternetGatewayServiceAsync =
        PublicInternetGatewayServiceAsyncImpl(
            clientOptions.toBuilder().apply(modifier::accept).build()
        )

    override fun create(
        params: PublicInternetGatewayCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PublicInternetGatewayCreateResponse> =
        // post /public_internet_gateways
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: PublicInternetGatewayRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PublicInternetGatewayRetrieveResponse> =
        // get /public_internet_gateways/{id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: PublicInternetGatewayListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PublicInternetGatewayListResponse> =
        // get /public_internet_gateways
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: PublicInternetGatewayDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PublicInternetGatewayDeleteResponse> =
        // delete /public_internet_gateways/{id}
        withRawResponse().delete(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PublicInternetGatewayServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PublicInternetGatewayServiceAsync.WithRawResponse =
            PublicInternetGatewayServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<PublicInternetGatewayCreateResponse> =
            jsonHandler<PublicInternetGatewayCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: PublicInternetGatewayCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PublicInternetGatewayCreateResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("public_internet_gateways")
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

        private val retrieveHandler: Handler<PublicInternetGatewayRetrieveResponse> =
            jsonHandler<PublicInternetGatewayRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: PublicInternetGatewayRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PublicInternetGatewayRetrieveResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("public_internet_gateways", params._pathParam(0))
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

        private val listHandler: Handler<PublicInternetGatewayListResponse> =
            jsonHandler<PublicInternetGatewayListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: PublicInternetGatewayListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PublicInternetGatewayListResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("public_internet_gateways")
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

        private val deleteHandler: Handler<PublicInternetGatewayDeleteResponse> =
            jsonHandler<PublicInternetGatewayDeleteResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: PublicInternetGatewayDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PublicInternetGatewayDeleteResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("public_internet_gateways", params._pathParam(0))
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
