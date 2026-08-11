// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.ai.collections

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
import com.telnyx.sdk.models.ai.collections.sources.SourceCreateParams
import com.telnyx.sdk.models.ai.collections.sources.SourceCreateResponse
import com.telnyx.sdk.models.ai.collections.sources.SourceDeleteParams
import com.telnyx.sdk.models.ai.collections.sources.SourceListParams
import com.telnyx.sdk.models.ai.collections.sources.SourceListResponse
import com.telnyx.sdk.models.ai.collections.sources.SourceReplaceParams
import com.telnyx.sdk.models.ai.collections.sources.SourceReplaceResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/**
 * Create and manage logical collections of your Telnyx data, tune retrieval settings, manage
 * sources, and run collection-scoped semantic search.
 */
class SourceServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    SourceServiceAsync {

    private val withRawResponse: SourceServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): SourceServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SourceServiceAsync =
        SourceServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: SourceCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SourceCreateResponse> =
        // post /ai/collections/{uuid}/sources
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: SourceListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SourceListResponse> =
        // get /ai/collections/{uuid}/sources
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: SourceDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // delete /ai/collections/{uuid}/sources/{sourceId}
        withRawResponse().delete(params, requestOptions).thenAccept {}

    override fun replace(
        params: SourceReplaceParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SourceReplaceResponse> =
        // put /ai/collections/{uuid}/sources
        withRawResponse().replace(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SourceServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SourceServiceAsync.WithRawResponse =
            SourceServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<SourceCreateResponse> =
            jsonHandler<SourceCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: SourceCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SourceCreateResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("uuid", params.uuid().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("ai", "collections", params._pathParam(0), "sources")
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

        private val listHandler: Handler<SourceListResponse> =
            jsonHandler<SourceListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: SourceListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SourceListResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("uuid", params.uuid().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("ai", "collections", params._pathParam(0), "sources")
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

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: SourceDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("sourceId", params.sourceId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "ai",
                        "collections",
                        params._pathParam(0),
                        "sources",
                        params._pathParam(1),
                    )
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

        private val replaceHandler: Handler<SourceReplaceResponse> =
            jsonHandler<SourceReplaceResponse>(clientOptions.jsonMapper)

        override fun replace(
            params: SourceReplaceParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SourceReplaceResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("uuid", params.uuid().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("ai", "collections", params._pathParam(0), "sources")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { replaceHandler.handle(it) }
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
