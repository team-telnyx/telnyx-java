// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.ai.tests.testframework.v1

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.ai.tests.testframework.v1.metrics.AiTestMetric
import com.telnyx.sdk.models.ai.tests.testframework.v1.metrics.CreateAiTestMetricRequest
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

/** Test agents, evaluator scenarios, metrics, and run results for the AI test framework. */
interface MetricServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): MetricServiceAsync

    /** Creates a metric in your organization. */
    fun create(params: MetricCreateParams): CompletableFuture<AiTestMetric> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: MetricCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AiTestMetric>

    /** @see create */
    fun create(
        createAiTestMetricRequest: CreateAiTestMetricRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AiTestMetric> =
        create(
            MetricCreateParams.builder()
                .createAiTestMetricRequest(createAiTestMetricRequest)
                .build(),
            requestOptions,
        )

    /** @see create */
    fun create(
        createAiTestMetricRequest: CreateAiTestMetricRequest
    ): CompletableFuture<AiTestMetric> = create(createAiTestMetricRequest, RequestOptions.none())

    /** Returns the specified metric. */
    fun retrieve(id: Long): CompletableFuture<AiTestMetric> =
        retrieve(id, MetricRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: Long,
        params: MetricRetrieveParams = MetricRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AiTestMetric> = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: Long,
        params: MetricRetrieveParams = MetricRetrieveParams.none(),
    ): CompletableFuture<AiTestMetric> = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: MetricRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AiTestMetric>

    /** @see retrieve */
    fun retrieve(params: MetricRetrieveParams): CompletableFuture<AiTestMetric> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: Long, requestOptions: RequestOptions): CompletableFuture<AiTestMetric> =
        retrieve(id, MetricRetrieveParams.none(), requestOptions)

    /** Updates the specified metric. */
    fun update(id: Long): CompletableFuture<AiTestMetric> = update(id, MetricUpdateParams.none())

    /** @see update */
    fun update(
        id: Long,
        params: MetricUpdateParams = MetricUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AiTestMetric> = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(
        id: Long,
        params: MetricUpdateParams = MetricUpdateParams.none(),
    ): CompletableFuture<AiTestMetric> = update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: MetricUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AiTestMetric>

    /** @see update */
    fun update(params: MetricUpdateParams): CompletableFuture<AiTestMetric> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(id: Long, requestOptions: RequestOptions): CompletableFuture<AiTestMetric> =
        update(id, MetricUpdateParams.none(), requestOptions)

    /**
     * Returns the metrics available in your organization, optionally filtered by test agent. Each
     * metric scores one aspect of a conversation or scenario run.
     */
    fun list(): CompletableFuture<List<AiTestMetric>> = list(MetricListParams.none())

    /** @see list */
    fun list(
        params: MetricListParams = MetricListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<AiTestMetric>>

    /** @see list */
    fun list(
        params: MetricListParams = MetricListParams.none()
    ): CompletableFuture<List<AiTestMetric>> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<List<AiTestMetric>> =
        list(MetricListParams.none(), requestOptions)

    /** Deletes the specified metric. */
    fun delete(id: Long): CompletableFuture<MetricDeleteResponse> =
        delete(id, MetricDeleteParams.none())

    /** @see delete */
    fun delete(
        id: Long,
        params: MetricDeleteParams = MetricDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MetricDeleteResponse> =
        delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: Long,
        params: MetricDeleteParams = MetricDeleteParams.none(),
    ): CompletableFuture<MetricDeleteResponse> = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: MetricDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MetricDeleteResponse>

    /** @see delete */
    fun delete(params: MetricDeleteParams): CompletableFuture<MetricDeleteResponse> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: Long, requestOptions: RequestOptions): CompletableFuture<MetricDeleteResponse> =
        delete(id, MetricDeleteParams.none(), requestOptions)

    /**
     * Creates several metrics in one request. Accepts an array of metric objects and returns the
     * created metrics.
     */
    fun bulkCreate(params: MetricBulkCreateParams): CompletableFuture<List<AiTestMetric>> =
        bulkCreate(params, RequestOptions.none())

    /** @see bulkCreate */
    fun bulkCreate(
        params: MetricBulkCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<AiTestMetric>>

    /** @see bulkCreate */
    fun bulkCreate(
        body: List<CreateAiTestMetricRequest>,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<AiTestMetric>> =
        bulkCreate(MetricBulkCreateParams.builder().body(body).build(), requestOptions)

    /** @see bulkCreate */
    fun bulkCreate(body: List<CreateAiTestMetricRequest>): CompletableFuture<List<AiTestMetric>> =
        bulkCreate(body, RequestOptions.none())

    /**
     * Starts background generation of suggested metrics for a test agent. Returns a progress ID to
     * poll with the get-test-metric-generation-progress endpoint.
     */
    fun generateMetrics(
        params: MetricGenerateMetricsParams
    ): CompletableFuture<ScenarioGenerationResponse> =
        generateMetrics(params, RequestOptions.none())

    /** @see generateMetrics */
    fun generateMetrics(
        params: MetricGenerateMetricsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ScenarioGenerationResponse>

    /**
     * Returns the status of a background metric-generation job started with the
     * generate-test-metrics endpoint.
     */
    fun retrieveGenerateMetricsProgress(
        params: MetricRetrieveGenerateMetricsProgressParams
    ): CompletableFuture<MetricRetrieveGenerateMetricsProgressResponse> =
        retrieveGenerateMetricsProgress(params, RequestOptions.none())

    /** @see retrieveGenerateMetricsProgress */
    fun retrieveGenerateMetricsProgress(
        params: MetricRetrieveGenerateMetricsProgressParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MetricRetrieveGenerateMetricsProgressResponse>

    /**
     * A view of [MetricServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): MetricServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /ai/tests/test_framework/v1/metrics`, but is
         * otherwise the same as [MetricServiceAsync.create].
         */
        fun create(params: MetricCreateParams): CompletableFuture<HttpResponseFor<AiTestMetric>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: MetricCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AiTestMetric>>

        /** @see create */
        fun create(
            createAiTestMetricRequest: CreateAiTestMetricRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AiTestMetric>> =
            create(
                MetricCreateParams.builder()
                    .createAiTestMetricRequest(createAiTestMetricRequest)
                    .build(),
                requestOptions,
            )

        /** @see create */
        fun create(
            createAiTestMetricRequest: CreateAiTestMetricRequest
        ): CompletableFuture<HttpResponseFor<AiTestMetric>> =
            create(createAiTestMetricRequest, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `get /ai/tests/test_framework/v1/metrics/{id}`, but is
         * otherwise the same as [MetricServiceAsync.retrieve].
         */
        fun retrieve(id: Long): CompletableFuture<HttpResponseFor<AiTestMetric>> =
            retrieve(id, MetricRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: Long,
            params: MetricRetrieveParams = MetricRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AiTestMetric>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: Long,
            params: MetricRetrieveParams = MetricRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<AiTestMetric>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: MetricRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AiTestMetric>>

        /** @see retrieve */
        fun retrieve(
            params: MetricRetrieveParams
        ): CompletableFuture<HttpResponseFor<AiTestMetric>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: Long,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AiTestMetric>> =
            retrieve(id, MetricRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /ai/tests/test_framework/v1/metrics/{id}`, but is
         * otherwise the same as [MetricServiceAsync.update].
         */
        fun update(id: Long): CompletableFuture<HttpResponseFor<AiTestMetric>> =
            update(id, MetricUpdateParams.none())

        /** @see update */
        fun update(
            id: Long,
            params: MetricUpdateParams = MetricUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AiTestMetric>> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        fun update(
            id: Long,
            params: MetricUpdateParams = MetricUpdateParams.none(),
        ): CompletableFuture<HttpResponseFor<AiTestMetric>> =
            update(id, params, RequestOptions.none())

        /** @see update */
        fun update(
            params: MetricUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AiTestMetric>>

        /** @see update */
        fun update(params: MetricUpdateParams): CompletableFuture<HttpResponseFor<AiTestMetric>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            id: Long,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AiTestMetric>> =
            update(id, MetricUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /ai/tests/test_framework/v1/metrics`, but is
         * otherwise the same as [MetricServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<List<AiTestMetric>>> =
            list(MetricListParams.none())

        /** @see list */
        fun list(
            params: MetricListParams = MetricListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<AiTestMetric>>>

        /** @see list */
        fun list(
            params: MetricListParams = MetricListParams.none()
        ): CompletableFuture<HttpResponseFor<List<AiTestMetric>>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<List<AiTestMetric>>> =
            list(MetricListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /ai/tests/test_framework/v1/metrics/{id}`, but is
         * otherwise the same as [MetricServiceAsync.delete].
         */
        fun delete(id: Long): CompletableFuture<HttpResponseFor<MetricDeleteResponse>> =
            delete(id, MetricDeleteParams.none())

        /** @see delete */
        fun delete(
            id: Long,
            params: MetricDeleteParams = MetricDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MetricDeleteResponse>> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        fun delete(
            id: Long,
            params: MetricDeleteParams = MetricDeleteParams.none(),
        ): CompletableFuture<HttpResponseFor<MetricDeleteResponse>> =
            delete(id, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: MetricDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MetricDeleteResponse>>

        /** @see delete */
        fun delete(
            params: MetricDeleteParams
        ): CompletableFuture<HttpResponseFor<MetricDeleteResponse>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            id: Long,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MetricDeleteResponse>> =
            delete(id, MetricDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /ai/tests/test_framework/v1/metrics/bulk_create`,
         * but is otherwise the same as [MetricServiceAsync.bulkCreate].
         */
        fun bulkCreate(
            params: MetricBulkCreateParams
        ): CompletableFuture<HttpResponseFor<List<AiTestMetric>>> =
            bulkCreate(params, RequestOptions.none())

        /** @see bulkCreate */
        fun bulkCreate(
            params: MetricBulkCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<AiTestMetric>>>

        /** @see bulkCreate */
        fun bulkCreate(
            body: List<CreateAiTestMetricRequest>,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<AiTestMetric>>> =
            bulkCreate(MetricBulkCreateParams.builder().body(body).build(), requestOptions)

        /** @see bulkCreate */
        fun bulkCreate(
            body: List<CreateAiTestMetricRequest>
        ): CompletableFuture<HttpResponseFor<List<AiTestMetric>>> =
            bulkCreate(body, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post
         * /ai/tests/test_framework/v1/metrics/generate_metrics`, but is otherwise the same as
         * [MetricServiceAsync.generateMetrics].
         */
        fun generateMetrics(
            params: MetricGenerateMetricsParams
        ): CompletableFuture<HttpResponseFor<ScenarioGenerationResponse>> =
            generateMetrics(params, RequestOptions.none())

        /** @see generateMetrics */
        fun generateMetrics(
            params: MetricGenerateMetricsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ScenarioGenerationResponse>>

        /**
         * Returns a raw HTTP response for `get
         * /ai/tests/test_framework/v1/metrics/generate_metrics_progress`, but is otherwise the same
         * as [MetricServiceAsync.retrieveGenerateMetricsProgress].
         */
        fun retrieveGenerateMetricsProgress(
            params: MetricRetrieveGenerateMetricsProgressParams
        ): CompletableFuture<HttpResponseFor<MetricRetrieveGenerateMetricsProgressResponse>> =
            retrieveGenerateMetricsProgress(params, RequestOptions.none())

        /** @see retrieveGenerateMetricsProgress */
        fun retrieveGenerateMetricsProgress(
            params: MetricRetrieveGenerateMetricsProgressParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MetricRetrieveGenerateMetricsProgressResponse>>
    }
}
