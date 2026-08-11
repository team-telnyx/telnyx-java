// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.ai

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
import com.telnyx.sdk.core.prepareAsync
import com.telnyx.sdk.models.ai.collections.CollectionCreateParams
import com.telnyx.sdk.models.ai.collections.CollectionDeleteParams
import com.telnyx.sdk.models.ai.collections.CollectionEnvelope
import com.telnyx.sdk.models.ai.collections.CollectionListPageAsync
import com.telnyx.sdk.models.ai.collections.CollectionListPageResponse
import com.telnyx.sdk.models.ai.collections.CollectionListParams
import com.telnyx.sdk.models.ai.collections.CollectionRetrieveByIdParams
import com.telnyx.sdk.models.ai.collections.CollectionRetrieveDocumentsParams
import com.telnyx.sdk.models.ai.collections.CollectionRetrieveDocumentsResponse
import com.telnyx.sdk.models.ai.collections.CollectionRetrieveParams
import com.telnyx.sdk.models.ai.collections.CollectionUpdateParams
import com.telnyx.sdk.services.async.ai.collections.SettingServiceAsync
import com.telnyx.sdk.services.async.ai.collections.SettingServiceAsyncImpl
import com.telnyx.sdk.services.async.ai.collections.SourceServiceAsync
import com.telnyx.sdk.services.async.ai.collections.SourceServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/**
 * Create and manage logical collections of your Telnyx data, tune retrieval settings, manage
 * sources, and run collection-scoped semantic search.
 */
class CollectionServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    CollectionServiceAsync {

    private val withRawResponse: CollectionServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val settings: SettingServiceAsync by lazy { SettingServiceAsyncImpl(clientOptions) }

    private val sources: SourceServiceAsync by lazy { SourceServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): CollectionServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): CollectionServiceAsync =
        CollectionServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /**
     * Create and manage logical collections of your Telnyx data, tune retrieval settings, manage
     * sources, and run collection-scoped semantic search.
     */
    override fun settings(): SettingServiceAsync = settings

    /**
     * Create and manage logical collections of your Telnyx data, tune retrieval settings, manage
     * sources, and run collection-scoped semantic search.
     */
    override fun sources(): SourceServiceAsync = sources

    override fun create(
        params: CollectionCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CollectionEnvelope> =
        // post /ai/collections
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: CollectionRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CollectionEnvelope> =
        // get /ai/collections/slug/{slug}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: CollectionUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CollectionEnvelope> =
        // patch /ai/collections/{uuid}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: CollectionListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CollectionListPageAsync> =
        // get /ai/collections
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: CollectionDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // delete /ai/collections/{uuid}
        withRawResponse().delete(params, requestOptions).thenAccept {}

    override fun retrieveById(
        params: CollectionRetrieveByIdParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CollectionEnvelope> =
        // get /ai/collections/{uuid}
        withRawResponse().retrieveById(params, requestOptions).thenApply { it.parse() }

    override fun retrieveDocuments(
        params: CollectionRetrieveDocumentsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CollectionRetrieveDocumentsResponse> =
        // get /ai/collections/{slug}/documents
        withRawResponse().retrieveDocuments(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CollectionServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val settings: SettingServiceAsync.WithRawResponse by lazy {
            SettingServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val sources: SourceServiceAsync.WithRawResponse by lazy {
            SourceServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CollectionServiceAsync.WithRawResponse =
            CollectionServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /**
         * Create and manage logical collections of your Telnyx data, tune retrieval settings,
         * manage sources, and run collection-scoped semantic search.
         */
        override fun settings(): SettingServiceAsync.WithRawResponse = settings

        /**
         * Create and manage logical collections of your Telnyx data, tune retrieval settings,
         * manage sources, and run collection-scoped semantic search.
         */
        override fun sources(): SourceServiceAsync.WithRawResponse = sources

        private val createHandler: Handler<CollectionEnvelope> =
            jsonHandler<CollectionEnvelope>(clientOptions.jsonMapper)

        override fun create(
            params: CollectionCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CollectionEnvelope>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("ai", "collections")
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

        private val retrieveHandler: Handler<CollectionEnvelope> =
            jsonHandler<CollectionEnvelope>(clientOptions.jsonMapper)

        override fun retrieve(
            params: CollectionRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CollectionEnvelope>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("slug", params.slug().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("ai", "collections", "slug", params._pathParam(0))
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

        private val updateHandler: Handler<CollectionEnvelope> =
            jsonHandler<CollectionEnvelope>(clientOptions.jsonMapper)

        override fun update(
            params: CollectionUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CollectionEnvelope>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("uuid", params.uuid().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("ai", "collections", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { updateHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listHandler: Handler<CollectionListPageResponse> =
            jsonHandler<CollectionListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: CollectionListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CollectionListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("ai", "collections")
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
                                CollectionListPageAsync.builder()
                                    .service(CollectionServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: CollectionDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("uuid", params.uuid().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("ai", "collections", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { deleteHandler.handle(it) }
                    }
                }
        }

        private val retrieveByIdHandler: Handler<CollectionEnvelope> =
            jsonHandler<CollectionEnvelope>(clientOptions.jsonMapper)

        override fun retrieveById(
            params: CollectionRetrieveByIdParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CollectionEnvelope>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("uuid", params.uuid().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("ai", "collections", params._pathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { retrieveByIdHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val retrieveDocumentsHandler: Handler<CollectionRetrieveDocumentsResponse> =
            jsonHandler<CollectionRetrieveDocumentsResponse>(clientOptions.jsonMapper)

        override fun retrieveDocuments(
            params: CollectionRetrieveDocumentsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CollectionRetrieveDocumentsResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("slug", params.slug().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("ai", "collections", params._pathParam(0), "documents")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { retrieveDocumentsHandler.handle(it) }
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
