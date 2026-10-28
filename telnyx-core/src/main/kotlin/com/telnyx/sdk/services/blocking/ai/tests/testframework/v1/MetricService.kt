// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.ai.tests.testframework.v1

import com.google.errorprone.annotations.MustBeClosed
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
import java.util.function.Consumer

/** Test agents, evaluator scenarios, metrics, and run results for the AI test framework. */
interface MetricService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): MetricService

    /** Creates a metric in your organization. */
    fun create(params: MetricCreateParams): AiTestMetric = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: MetricCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AiTestMetric

    /** @see create */
    fun create(
        createAiTestMetricRequest: CreateAiTestMetricRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AiTestMetric =
        create(
            MetricCreateParams.builder()
                .createAiTestMetricRequest(createAiTestMetricRequest)
                .build(),
            requestOptions,
        )

    /** @see create */
    fun create(createAiTestMetricRequest: CreateAiTestMetricRequest): AiTestMetric =
        create(createAiTestMetricRequest, RequestOptions.none())

    /** Returns the specified metric. */
    fun retrieve(id: Long): AiTestMetric = retrieve(id, MetricRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: Long,
        params: MetricRetrieveParams = MetricRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AiTestMetric = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: Long,
        params: MetricRetrieveParams = MetricRetrieveParams.none(),
    ): AiTestMetric = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: MetricRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AiTestMetric

    /** @see retrieve */
    fun retrieve(params: MetricRetrieveParams): AiTestMetric =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: Long, requestOptions: RequestOptions): AiTestMetric =
        retrieve(id, MetricRetrieveParams.none(), requestOptions)

    /** Updates the specified metric. */
    fun update(id: Long): AiTestMetric = update(id, MetricUpdateParams.none())

    /** @see update */
    fun update(
        id: Long,
        params: MetricUpdateParams = MetricUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AiTestMetric = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(id: Long, params: MetricUpdateParams = MetricUpdateParams.none()): AiTestMetric =
        update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: MetricUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AiTestMetric

    /** @see update */
    fun update(params: MetricUpdateParams): AiTestMetric = update(params, RequestOptions.none())

    /** @see update */
    fun update(id: Long, requestOptions: RequestOptions): AiTestMetric =
        update(id, MetricUpdateParams.none(), requestOptions)

    /**
     * Returns the metrics available in your organization, optionally filtered by test agent. Each
     * metric scores one aspect of a conversation or scenario run.
     */
    fun list(): List<AiTestMetric> = list(MetricListParams.none())

    /** @see list */
    fun list(
        params: MetricListParams = MetricListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<AiTestMetric>

    /** @see list */
    fun list(params: MetricListParams = MetricListParams.none()): List<AiTestMetric> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): List<AiTestMetric> =
        list(MetricListParams.none(), requestOptions)

    /** Deletes the specified metric. */
    fun delete(id: Long): MetricDeleteResponse = delete(id, MetricDeleteParams.none())

    /** @see delete */
    fun delete(
        id: Long,
        params: MetricDeleteParams = MetricDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MetricDeleteResponse = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: Long,
        params: MetricDeleteParams = MetricDeleteParams.none(),
    ): MetricDeleteResponse = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: MetricDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MetricDeleteResponse

    /** @see delete */
    fun delete(params: MetricDeleteParams): MetricDeleteResponse =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: Long, requestOptions: RequestOptions): MetricDeleteResponse =
        delete(id, MetricDeleteParams.none(), requestOptions)

    /**
     * Creates several metrics in one request. Accepts an array of metric objects and returns the
     * created metrics.
     */
    fun bulkCreate(params: MetricBulkCreateParams): List<AiTestMetric> =
        bulkCreate(params, RequestOptions.none())

    /** @see bulkCreate */
    fun bulkCreate(
        params: MetricBulkCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<AiTestMetric>

    /** @see bulkCreate */
    fun bulkCreate(
        body: List<CreateAiTestMetricRequest>,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<AiTestMetric> =
        bulkCreate(MetricBulkCreateParams.builder().body(body).build(), requestOptions)

    /** @see bulkCreate */
    fun bulkCreate(body: List<CreateAiTestMetricRequest>): List<AiTestMetric> =
        bulkCreate(body, RequestOptions.none())

    /**
     * Starts background generation of suggested metrics for a test agent. Returns a progress ID to
     * poll with the get-test-metric-generation-progress endpoint.
     */
    fun generateMetrics(params: MetricGenerateMetricsParams): ScenarioGenerationResponse =
        generateMetrics(params, RequestOptions.none())

    /** @see generateMetrics */
    fun generateMetrics(
        params: MetricGenerateMetricsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ScenarioGenerationResponse

    /**
     * Returns the status of a background metric-generation job started with the
     * generate-test-metrics endpoint.
     */
    fun retrieveGenerateMetricsProgress(
        params: MetricRetrieveGenerateMetricsProgressParams
    ): MetricRetrieveGenerateMetricsProgressResponse =
        retrieveGenerateMetricsProgress(params, RequestOptions.none())

    /** @see retrieveGenerateMetricsProgress */
    fun retrieveGenerateMetricsProgress(
        params: MetricRetrieveGenerateMetricsProgressParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MetricRetrieveGenerateMetricsProgressResponse

    /** A view of [MetricService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): MetricService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /ai/tests/test_framework/v1/metrics`, but is
         * otherwise the same as [MetricService.create].
         */
        @MustBeClosed
        fun create(params: MetricCreateParams): HttpResponseFor<AiTestMetric> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: MetricCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AiTestMetric>

        /** @see create */
        @MustBeClosed
        fun create(
            createAiTestMetricRequest: CreateAiTestMetricRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AiTestMetric> =
            create(
                MetricCreateParams.builder()
                    .createAiTestMetricRequest(createAiTestMetricRequest)
                    .build(),
                requestOptions,
            )

        /** @see create */
        @MustBeClosed
        fun create(
            createAiTestMetricRequest: CreateAiTestMetricRequest
        ): HttpResponseFor<AiTestMetric> = create(createAiTestMetricRequest, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `get /ai/tests/test_framework/v1/metrics/{id}`, but is
         * otherwise the same as [MetricService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: Long): HttpResponseFor<AiTestMetric> =
            retrieve(id, MetricRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: Long,
            params: MetricRetrieveParams = MetricRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AiTestMetric> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: Long,
            params: MetricRetrieveParams = MetricRetrieveParams.none(),
        ): HttpResponseFor<AiTestMetric> = retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: MetricRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AiTestMetric>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: MetricRetrieveParams): HttpResponseFor<AiTestMetric> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(id: Long, requestOptions: RequestOptions): HttpResponseFor<AiTestMetric> =
            retrieve(id, MetricRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /ai/tests/test_framework/v1/metrics/{id}`, but is
         * otherwise the same as [MetricService.update].
         */
        @MustBeClosed
        fun update(id: Long): HttpResponseFor<AiTestMetric> = update(id, MetricUpdateParams.none())

        /** @see update */
        @MustBeClosed
        fun update(
            id: Long,
            params: MetricUpdateParams = MetricUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AiTestMetric> = update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            id: Long,
            params: MetricUpdateParams = MetricUpdateParams.none(),
        ): HttpResponseFor<AiTestMetric> = update(id, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: MetricUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AiTestMetric>

        /** @see update */
        @MustBeClosed
        fun update(params: MetricUpdateParams): HttpResponseFor<AiTestMetric> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(id: Long, requestOptions: RequestOptions): HttpResponseFor<AiTestMetric> =
            update(id, MetricUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /ai/tests/test_framework/v1/metrics`, but is
         * otherwise the same as [MetricService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<List<AiTestMetric>> = list(MetricListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: MetricListParams = MetricListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<AiTestMetric>>

        /** @see list */
        @MustBeClosed
        fun list(
            params: MetricListParams = MetricListParams.none()
        ): HttpResponseFor<List<AiTestMetric>> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<List<AiTestMetric>> =
            list(MetricListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /ai/tests/test_framework/v1/metrics/{id}`, but is
         * otherwise the same as [MetricService.delete].
         */
        @MustBeClosed
        fun delete(id: Long): HttpResponseFor<MetricDeleteResponse> =
            delete(id, MetricDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: Long,
            params: MetricDeleteParams = MetricDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MetricDeleteResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: Long,
            params: MetricDeleteParams = MetricDeleteParams.none(),
        ): HttpResponseFor<MetricDeleteResponse> = delete(id, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: MetricDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MetricDeleteResponse>

        /** @see delete */
        @MustBeClosed
        fun delete(params: MetricDeleteParams): HttpResponseFor<MetricDeleteResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: Long,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MetricDeleteResponse> =
            delete(id, MetricDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /ai/tests/test_framework/v1/metrics/bulk_create`,
         * but is otherwise the same as [MetricService.bulkCreate].
         */
        @MustBeClosed
        fun bulkCreate(params: MetricBulkCreateParams): HttpResponseFor<List<AiTestMetric>> =
            bulkCreate(params, RequestOptions.none())

        /** @see bulkCreate */
        @MustBeClosed
        fun bulkCreate(
            params: MetricBulkCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<AiTestMetric>>

        /** @see bulkCreate */
        @MustBeClosed
        fun bulkCreate(
            body: List<CreateAiTestMetricRequest>,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<AiTestMetric>> =
            bulkCreate(MetricBulkCreateParams.builder().body(body).build(), requestOptions)

        /** @see bulkCreate */
        @MustBeClosed
        fun bulkCreate(body: List<CreateAiTestMetricRequest>): HttpResponseFor<List<AiTestMetric>> =
            bulkCreate(body, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post
         * /ai/tests/test_framework/v1/metrics/generate_metrics`, but is otherwise the same as
         * [MetricService.generateMetrics].
         */
        @MustBeClosed
        fun generateMetrics(
            params: MetricGenerateMetricsParams
        ): HttpResponseFor<ScenarioGenerationResponse> =
            generateMetrics(params, RequestOptions.none())

        /** @see generateMetrics */
        @MustBeClosed
        fun generateMetrics(
            params: MetricGenerateMetricsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ScenarioGenerationResponse>

        /**
         * Returns a raw HTTP response for `get
         * /ai/tests/test_framework/v1/metrics/generate_metrics_progress`, but is otherwise the same
         * as [MetricService.retrieveGenerateMetricsProgress].
         */
        @MustBeClosed
        fun retrieveGenerateMetricsProgress(
            params: MetricRetrieveGenerateMetricsProgressParams
        ): HttpResponseFor<MetricRetrieveGenerateMetricsProgressResponse> =
            retrieveGenerateMetricsProgress(params, RequestOptions.none())

        /** @see retrieveGenerateMetricsProgress */
        @MustBeClosed
        fun retrieveGenerateMetricsProgress(
            params: MetricRetrieveGenerateMetricsProgressParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MetricRetrieveGenerateMetricsProgressResponse>
    }
}
