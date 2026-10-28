// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.ai.tests.testframework.v1

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
import com.telnyx.sdk.models.ai.tests.testframework.v1.metrics.AiTestMetric
import com.telnyx.sdk.models.ai.tests.testframework.v1.metrics.MetricBulkCreateParams
import com.telnyx.sdk.models.ai.tests.testframework.v1.metrics.MetricCreateParams
import com.telnyx.sdk.models.ai.tests.testframework.v1.metrics.MetricDeleteParams
import com.telnyx.sdk.models.ai.tests.testframework.v1.metrics.MetricDeleteResponse
import com.telnyx.sdk.models.ai.tests.testframework.v1.metrics.MetricGenerateMetricsParams
import com.telnyx.sdk.models.ai.tests.testframework.v1.metrics.MetricListParams
import com.telnyx.sdk.models.ai.tests.testframework.v1.metrics.MetricRetrieveGenerateMetricsProgressParams
import com.telnyx.sdk.models.ai.tests.testframework.v1.metrics.MetricRetrieveGenerateMetricsProgressResponse
import com.telnyx.sdk.models.ai.tests.testframework.v1.metrics.MetricRetrieveParams
import com.telnyx.sdk.models.ai.tests.testframework.v1.metrics.MetricUpdateParams
import com.telnyx.sdk.models.ai.tests.testframework.v1.metrics.ScenarioGenerationResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** Test agents, evaluator scenarios, metrics, and run results for the AI test framework. */
class MetricServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    MetricServiceAsync {

    private val withRawResponse: MetricServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): MetricServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): MetricServiceAsync =
        MetricServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: MetricCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AiTestMetric> =
        // post /ai/tests/test_framework/v1/metrics
        withRawResponse().create(params, requestOptions).mapCancellable { it.parse() }

    override fun retrieve(
        params: MetricRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AiTestMetric> =
        // get /ai/tests/test_framework/v1/metrics/{id}
        withRawResponse().retrieve(params, requestOptions).mapCancellable { it.parse() }

    override fun update(
        params: MetricUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AiTestMetric> =
        // patch /ai/tests/test_framework/v1/metrics/{id}
        withRawResponse().update(params, requestOptions).mapCancellable { it.parse() }

    override fun list(
        params: MetricListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<List<AiTestMetric>> =
        // get /ai/tests/test_framework/v1/metrics
        withRawResponse().list(params, requestOptions).mapCancellable { it.parse() }

    override fun delete(
        params: MetricDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<MetricDeleteResponse> =
        // delete /ai/tests/test_framework/v1/metrics/{id}
        withRawResponse().delete(params, requestOptions).mapCancellable { it.parse() }

    override fun bulkCreate(
        params: MetricBulkCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<List<AiTestMetric>> =
        // post /ai/tests/test_framework/v1/metrics/bulk_create
        withRawResponse().bulkCreate(params, requestOptions).mapCancellable { it.parse() }

    override fun generateMetrics(
        params: MetricGenerateMetricsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ScenarioGenerationResponse> =
        // post /ai/tests/test_framework/v1/metrics/generate_metrics
        withRawResponse().generateMetrics(params, requestOptions).mapCancellable { it.parse() }

    override fun retrieveGenerateMetricsProgress(
        params: MetricRetrieveGenerateMetricsProgressParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<MetricRetrieveGenerateMetricsProgressResponse> =
        // get /ai/tests/test_framework/v1/metrics/generate_metrics_progress
        withRawResponse().retrieveGenerateMetricsProgress(params, requestOptions).mapCancellable {
            it.parse()
        }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        MetricServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): MetricServiceAsync.WithRawResponse =
            MetricServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<AiTestMetric> =
            jsonHandler<AiTestMetric>(clientOptions.jsonMapper)

        override fun create(
            params: MetricCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AiTestMetric>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("ai", "tests", "test_framework", "v1", "metrics")
                    .body(json(clientOptions.jsonMapper, params._body()))
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
                            .use { createHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val retrieveHandler: Handler<AiTestMetric> =
            jsonHandler<AiTestMetric>(clientOptions.jsonMapper)

        override fun retrieve(
            params: MetricRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AiTestMetric>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "ai",
                        "tests",
                        "test_framework",
                        "v1",
                        "metrics",
                        params._pathParam(0),
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

        private val updateHandler: Handler<AiTestMetric> =
            jsonHandler<AiTestMetric>(clientOptions.jsonMapper)

        override fun update(
            params: MetricUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AiTestMetric>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "ai",
                        "tests",
                        "test_framework",
                        "v1",
                        "metrics",
                        params._pathParam(0),
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
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
                            .use { updateHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listHandler: Handler<List<AiTestMetric>> =
            jsonHandler<List<AiTestMetric>>(clientOptions.jsonMapper)

        override fun list(
            params: MetricListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<List<AiTestMetric>>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("ai", "tests", "test_framework", "v1", "metrics")
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
                                    it.forEach { it.validate() }
                                }
                            }
                    }
                }
        }

        private val deleteHandler: Handler<MetricDeleteResponse> =
            jsonHandler<MetricDeleteResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: MetricDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MetricDeleteResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "ai",
                        "tests",
                        "test_framework",
                        "v1",
                        "metrics",
                        params._pathParam(0),
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

        private val bulkCreateHandler: Handler<List<AiTestMetric>> =
            jsonHandler<List<AiTestMetric>>(clientOptions.jsonMapper)

        override fun bulkCreate(
            params: MetricBulkCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<List<AiTestMetric>>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "ai",
                        "tests",
                        "test_framework",
                        "v1",
                        "metrics",
                        "bulk_create",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
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
                            .use { bulkCreateHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.forEach { it.validate() }
                                }
                            }
                    }
                }
        }

        private val generateMetricsHandler: Handler<ScenarioGenerationResponse> =
            jsonHandler<ScenarioGenerationResponse>(clientOptions.jsonMapper)

        override fun generateMetrics(
            params: MetricGenerateMetricsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ScenarioGenerationResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "ai",
                        "tests",
                        "test_framework",
                        "v1",
                        "metrics",
                        "generate_metrics",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
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
                            .use { generateMetricsHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val retrieveGenerateMetricsProgressHandler:
            Handler<MetricRetrieveGenerateMetricsProgressResponse> =
            jsonHandler<MetricRetrieveGenerateMetricsProgressResponse>(clientOptions.jsonMapper)

        override fun retrieveGenerateMetricsProgress(
            params: MetricRetrieveGenerateMetricsProgressParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MetricRetrieveGenerateMetricsProgressResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "ai",
                        "tests",
                        "test_framework",
                        "v1",
                        "metrics",
                        "generate_metrics_progress",
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
                            .use { retrieveGenerateMetricsProgressHandler.handle(it) }
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
