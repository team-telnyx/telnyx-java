// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.storage

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
import com.telnyx.sdk.models.storage.kvs.KvCreateParams
import com.telnyx.sdk.models.storage.kvs.KvDeleteParams
import com.telnyx.sdk.models.storage.kvs.KvListPageAsync
import com.telnyx.sdk.models.storage.kvs.KvListPageResponse
import com.telnyx.sdk.models.storage.kvs.KvListParams
import com.telnyx.sdk.models.storage.kvs.KvNamespaceResponseWrapper
import com.telnyx.sdk.models.storage.kvs.KvRetrieveParams
import com.telnyx.sdk.services.async.storage.kvs.KeyServiceAsync
import com.telnyx.sdk.services.async.storage.kvs.KeyServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** Manage KV storage namespaces */
class KvServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    KvServiceAsync {

    private val withRawResponse: KvServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val keys: KeyServiceAsync by lazy { KeyServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): KvServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): KvServiceAsync =
        KvServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /** Read and write keys within a KV namespace */
    override fun keys(): KeyServiceAsync = keys

    override fun create(
        params: KvCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<KvNamespaceResponseWrapper> =
        // post /storage/kvs
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: KvRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<KvNamespaceResponseWrapper> =
        // get /storage/kvs/{id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: KvListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<KvListPageAsync> =
        // get /storage/kvs
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: KvDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<KvNamespaceResponseWrapper> =
        // delete /storage/kvs/{id}
        withRawResponse().delete(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        KvServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val keys: KeyServiceAsync.WithRawResponse by lazy {
            KeyServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): KvServiceAsync.WithRawResponse =
            KvServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /** Read and write keys within a KV namespace */
        override fun keys(): KeyServiceAsync.WithRawResponse = keys

        private val createHandler: Handler<KvNamespaceResponseWrapper> =
            jsonHandler<KvNamespaceResponseWrapper>(clientOptions.jsonMapper)

        override fun create(
            params: KvCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<KvNamespaceResponseWrapper>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("storage", "kvs")
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

        private val retrieveHandler: Handler<KvNamespaceResponseWrapper> =
            jsonHandler<KvNamespaceResponseWrapper>(clientOptions.jsonMapper)

        override fun retrieve(
            params: KvRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<KvNamespaceResponseWrapper>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("storage", "kvs", params._pathParam(0))
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

        private val listHandler: Handler<KvListPageResponse> =
            jsonHandler<KvListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: KvListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<KvListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("storage", "kvs")
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
                                KvListPageAsync.builder()
                                    .service(KvServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        private val deleteHandler: Handler<KvNamespaceResponseWrapper> =
            jsonHandler<KvNamespaceResponseWrapper>(clientOptions.jsonMapper)

        override fun delete(
            params: KvDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<KvNamespaceResponseWrapper>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("storage", "kvs", params._pathParam(0))
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
