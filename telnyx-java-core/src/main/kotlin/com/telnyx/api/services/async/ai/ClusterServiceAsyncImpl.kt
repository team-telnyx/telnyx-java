// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async.ai

import com.telnyx.api.core.ClientOptions
import com.telnyx.api.core.RequestOptions
import com.telnyx.api.core.checkRequired
import com.telnyx.api.core.handlers.emptyHandler
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
import com.telnyx.api.models.ai.clusters.ClusterComputeParams
import com.telnyx.api.models.ai.clusters.ClusterComputeResponse
import com.telnyx.api.models.ai.clusters.ClusterDeleteParams
import com.telnyx.api.models.ai.clusters.ClusterFetchGraphParams
import com.telnyx.api.models.ai.clusters.ClusterFetchGraphResponse
import com.telnyx.api.models.ai.clusters.ClusterListParams
import com.telnyx.api.models.ai.clusters.ClusterListResponse
import com.telnyx.api.models.ai.clusters.ClusterRetrieveParams
import com.telnyx.api.models.ai.clusters.ClusterRetrieveResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class ClusterServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    ClusterServiceAsync {

    private val withRawResponse: ClusterServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ClusterServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ClusterServiceAsync =
        ClusterServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun retrieve(
        params: ClusterRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ClusterRetrieveResponse> =
        // get /ai/clusters/{task_id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: ClusterListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ClusterListResponse> =
        // get /ai/clusters
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: ClusterDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // delete /ai/clusters/{task_id}
        withRawResponse().delete(params, requestOptions).thenAccept {}

    override fun compute(
        params: ClusterComputeParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ClusterComputeResponse> =
        // post /ai/clusters
        withRawResponse().compute(params, requestOptions).thenApply { it.parse() }

    override fun fetchGraph(
        params: ClusterFetchGraphParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ClusterFetchGraphResponse> =
        // get /ai/clusters/{task_id}/graph
        withRawResponse().fetchGraph(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ClusterServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ClusterServiceAsync.WithRawResponse =
            ClusterServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val retrieveHandler: Handler<ClusterRetrieveResponse> =
            jsonHandler<ClusterRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: ClusterRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ClusterRetrieveResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("taskId", params.taskId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("ai", "clusters", params._pathParam(0))
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

        private val listHandler: Handler<ClusterListResponse> =
            jsonHandler<ClusterListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: ClusterListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ClusterListResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("ai", "clusters")
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
            params: ClusterDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("taskId", params.taskId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("ai", "clusters", params._pathParam(0))
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

        private val computeHandler: Handler<ClusterComputeResponse> =
            jsonHandler<ClusterComputeResponse>(clientOptions.jsonMapper)

        override fun compute(
            params: ClusterComputeParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ClusterComputeResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("ai", "clusters")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { computeHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val fetchGraphHandler: Handler<ClusterFetchGraphResponse> =
            jsonHandler<ClusterFetchGraphResponse>(clientOptions.jsonMapper)

        override fun fetchGraph(
            params: ClusterFetchGraphParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ClusterFetchGraphResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("taskId", params.taskId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("ai", "clusters", params._pathParam(0), "graph")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { fetchGraphHandler.handle(it) }
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
