// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.ai.memory.namespaces.profiles

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.composeCancellableAsync
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
import com.telnyx.sdk.core.mapCancellable
import com.telnyx.sdk.core.ownResponse
import com.telnyx.sdk.core.prepareAsync
import com.telnyx.sdk.models.ai.memory.namespaces.profiles.sources.SourceDeleteParams
import com.telnyx.sdk.models.ai.memory.namespaces.profiles.sources.SourceDeleteResponse
import com.telnyx.sdk.models.ai.memory.namespaces.profiles.sources.SourceListPageAsync
import com.telnyx.sdk.models.ai.memory.namespaces.profiles.sources.SourceListPageResponse
import com.telnyx.sdk.models.ai.memory.namespaces.profiles.sources.SourceListParams
import com.telnyx.sdk.models.ai.memory.namespaces.profiles.sources.SourceRetrieveParams
import com.telnyx.sdk.models.ai.memory.namespaces.profiles.sources.SourceRetrieveResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** What a profile stored, and what its memories came from. */
class SourceServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    SourceServiceAsync {

    private val withRawResponse: SourceServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): SourceServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SourceServiceAsync =
        SourceServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun retrieve(
        params: SourceRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SourceRetrieveResponse> =
        // get /ai/memory/namespaces/{namespace}/profiles/{profile_id}/sources/{source_id}
        withRawResponse().retrieve(params, requestOptions).mapCancellable { it.parse() }

    override fun list(
        params: SourceListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SourceListPageAsync> =
        // get /ai/memory/namespaces/{namespace}/profiles/{profile_id}/sources
        withRawResponse().list(params, requestOptions).mapCancellable { it.parse() }

    override fun delete(
        params: SourceDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SourceDeleteResponse> =
        // delete /ai/memory/namespaces/{namespace}/profiles/{profile_id}/sources/{source_id}
        withRawResponse().delete(params, requestOptions).mapCancellable { it.parse() }

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

        private val retrieveHandler: Handler<SourceRetrieveResponse> =
            jsonHandler<SourceRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: SourceRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SourceRetrieveResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("sourceId", params.sourceId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "ai",
                        "memory",
                        "namespaces",
                        params._pathParam(0),
                        "profiles",
                        params._pathParam(1),
                        "sources",
                        params._pathParam(2),
                    )
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .composeCancellableAsync {
                    clientOptions.httpClient.executeAsync(it, requestOptions).ownResponse()
                }
                .mapCancellable { response ->
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

        private val listHandler: Handler<SourceListPageResponse> =
            jsonHandler<SourceListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: SourceListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SourceListPageAsync>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("profileId", params.profileId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "ai",
                        "memory",
                        "namespaces",
                        params._pathParam(0),
                        "profiles",
                        params._pathParam(1),
                        "sources",
                    )
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .composeCancellableAsync {
                    clientOptions.httpClient.executeAsync(it, requestOptions).ownResponse()
                }
                .mapCancellable { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                            .let {
                                SourceListPageAsync.builder()
                                    .service(SourceServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        private val deleteHandler: Handler<SourceDeleteResponse> =
            jsonHandler<SourceDeleteResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: SourceDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SourceDeleteResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("sourceId", params.sourceId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "ai",
                        "memory",
                        "namespaces",
                        params._pathParam(0),
                        "profiles",
                        params._pathParam(1),
                        "sources",
                        params._pathParam(2),
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .composeCancellableAsync {
                    clientOptions.httpClient.executeAsync(it, requestOptions).ownResponse()
                }
                .mapCancellable { response ->
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
