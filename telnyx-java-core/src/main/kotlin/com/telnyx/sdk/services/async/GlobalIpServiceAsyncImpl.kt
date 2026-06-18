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
import com.telnyx.sdk.models.globalips.GlobalIpCreateParams
import com.telnyx.sdk.models.globalips.GlobalIpCreateResponse
import com.telnyx.sdk.models.globalips.GlobalIpDeleteParams
import com.telnyx.sdk.models.globalips.GlobalIpDeleteResponse
import com.telnyx.sdk.models.globalips.GlobalIpListPageAsync
import com.telnyx.sdk.models.globalips.GlobalIpListPageResponse
import com.telnyx.sdk.models.globalips.GlobalIpListParams
import com.telnyx.sdk.models.globalips.GlobalIpRetrieveParams
import com.telnyx.sdk.models.globalips.GlobalIpRetrieveResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** Global IPs */
class GlobalIpServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    GlobalIpServiceAsync {

    private val withRawResponse: GlobalIpServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): GlobalIpServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): GlobalIpServiceAsync =
        GlobalIpServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: GlobalIpCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<GlobalIpCreateResponse> =
        // post /global_ips
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: GlobalIpRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<GlobalIpRetrieveResponse> =
        // get /global_ips/{id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: GlobalIpListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<GlobalIpListPageAsync> =
        // get /global_ips
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: GlobalIpDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<GlobalIpDeleteResponse> =
        // delete /global_ips/{id}
        withRawResponse().delete(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        GlobalIpServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): GlobalIpServiceAsync.WithRawResponse =
            GlobalIpServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<GlobalIpCreateResponse> =
            jsonHandler<GlobalIpCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: GlobalIpCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<GlobalIpCreateResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("global_ips")
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

        private val retrieveHandler: Handler<GlobalIpRetrieveResponse> =
            jsonHandler<GlobalIpRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: GlobalIpRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<GlobalIpRetrieveResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("global_ips", params._pathParam(0))
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

        private val listHandler: Handler<GlobalIpListPageResponse> =
            jsonHandler<GlobalIpListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: GlobalIpListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<GlobalIpListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("global_ips")
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
                            .let {
                                GlobalIpListPageAsync.builder()
                                    .service(GlobalIpServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        private val deleteHandler: Handler<GlobalIpDeleteResponse> =
            jsonHandler<GlobalIpDeleteResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: GlobalIpDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<GlobalIpDeleteResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("global_ips", params._pathParam(0))
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
