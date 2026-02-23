// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.ai

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
import com.telnyx.sdk.core.prepare
import com.telnyx.sdk.models.ai.clusters.ClusterComputeParams
import com.telnyx.sdk.models.ai.clusters.ClusterComputeResponse
import com.telnyx.sdk.models.ai.clusters.ClusterDeleteParams
import com.telnyx.sdk.models.ai.clusters.ClusterFetchGraphParams
import com.telnyx.sdk.models.ai.clusters.ClusterListPage
import com.telnyx.sdk.models.ai.clusters.ClusterListPageResponse
import com.telnyx.sdk.models.ai.clusters.ClusterListParams
import com.telnyx.sdk.models.ai.clusters.ClusterRetrieveParams
import com.telnyx.sdk.models.ai.clusters.ClusterRetrieveResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class ClusterServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ClusterService {

    private val withRawResponse: ClusterService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ClusterService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ClusterService =
        ClusterServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun retrieve(
        params: ClusterRetrieveParams,
        requestOptions: RequestOptions,
    ): ClusterRetrieveResponse =
        // get /ai/clusters/{task_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(params: ClusterListParams, requestOptions: RequestOptions): ClusterListPage =
        // get /ai/clusters
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: ClusterDeleteParams, requestOptions: RequestOptions) {
        // delete /ai/clusters/{task_id}
        withRawResponse().delete(params, requestOptions)
    }

    override fun compute(
        params: ClusterComputeParams,
        requestOptions: RequestOptions,
    ): ClusterComputeResponse =
        // post /ai/clusters
        withRawResponse().compute(params, requestOptions).parse()

    override fun fetchGraph(
        params: ClusterFetchGraphParams,
        requestOptions: RequestOptions,
    ): HttpResponse =
        // get /ai/clusters/{task_id}/graph
        withRawResponse().fetchGraph(params, requestOptions)

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ClusterService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ClusterService.WithRawResponse =
            ClusterServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val retrieveHandler: Handler<ClusterRetrieveResponse> =
            jsonHandler<ClusterRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: ClusterRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ClusterRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("taskId", params.taskId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("ai", "clusters", params._pathParam(0))
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

        private val listHandler: Handler<ClusterListPageResponse> =
            jsonHandler<ClusterListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: ClusterListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ClusterListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("ai", "clusters")
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
                        ClusterListPage.builder()
                            .service(ClusterServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: ClusterDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteHandler.handle(it) }
            }
        }

        private val computeHandler: Handler<ClusterComputeResponse> =
            jsonHandler<ClusterComputeResponse>(clientOptions.jsonMapper)

        override fun compute(
            params: ClusterComputeParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ClusterComputeResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("ai", "clusters")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { computeHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        override fun fetchGraph(
            params: ClusterFetchGraphParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("taskId", params.taskId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("ai", "clusters", params._pathParam(0), "graph")
                    .putHeader("Accept", "image/png")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response)
        }
    }
}
