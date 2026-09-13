// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.compute

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.compute.funcs.FuncRetrieveLogsParams
import com.telnyx.sdk.models.compute.funcs.FuncRetrieveLogsResponse
import com.telnyx.sdk.models.compute.funcs.FuncRetrieveMetricAggregatesParams
import com.telnyx.sdk.models.compute.funcs.FuncRetrieveMetricAggregatesResponse
import com.telnyx.sdk.models.compute.funcs.FuncRetrieveRevisionsParams
import com.telnyx.sdk.models.compute.funcs.FuncRetrieveRevisionsResponse
import com.telnyx.sdk.models.compute.funcs.FuncRetrieveShipInspectionParams
import com.telnyx.sdk.models.compute.funcs.FuncRetrieveShipInspectionResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface FuncServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): FuncServiceAsync

    /**
     * Returns logs oldest first. `type=runtime` (default) returns function stdout/stderr.
     * `type=invocations` returns one platform-generated record per HTTP request served.
     */
    fun retrieveLogs(id: String): CompletableFuture<FuncRetrieveLogsResponse> =
        retrieveLogs(id, FuncRetrieveLogsParams.none())

    /** @see retrieveLogs */
    fun retrieveLogs(
        id: String,
        params: FuncRetrieveLogsParams = FuncRetrieveLogsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FuncRetrieveLogsResponse> =
        retrieveLogs(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieveLogs */
    fun retrieveLogs(
        id: String,
        params: FuncRetrieveLogsParams = FuncRetrieveLogsParams.none(),
    ): CompletableFuture<FuncRetrieveLogsResponse> = retrieveLogs(id, params, RequestOptions.none())

    /** @see retrieveLogs */
    fun retrieveLogs(
        params: FuncRetrieveLogsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FuncRetrieveLogsResponse>

    /** @see retrieveLogs */
    fun retrieveLogs(params: FuncRetrieveLogsParams): CompletableFuture<FuncRetrieveLogsResponse> =
        retrieveLogs(params, RequestOptions.none())

    /** @see retrieveLogs */
    fun retrieveLogs(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<FuncRetrieveLogsResponse> =
        retrieveLogs(id, FuncRetrieveLogsParams.none(), requestOptions)

    /**
     * Returns aggregate request, latency, CPU, memory, and resource-limit metrics for a function
     * over the requested window.
     */
    fun retrieveMetricAggregates(
        id: String,
        params: FuncRetrieveMetricAggregatesParams,
    ): CompletableFuture<FuncRetrieveMetricAggregatesResponse> =
        retrieveMetricAggregates(id, params, RequestOptions.none())

    /** @see retrieveMetricAggregates */
    fun retrieveMetricAggregates(
        id: String,
        params: FuncRetrieveMetricAggregatesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FuncRetrieveMetricAggregatesResponse> =
        retrieveMetricAggregates(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieveMetricAggregates */
    fun retrieveMetricAggregates(
        params: FuncRetrieveMetricAggregatesParams
    ): CompletableFuture<FuncRetrieveMetricAggregatesResponse> =
        retrieveMetricAggregates(params, RequestOptions.none())

    /** @see retrieveMetricAggregates */
    fun retrieveMetricAggregates(
        params: FuncRetrieveMetricAggregatesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FuncRetrieveMetricAggregatesResponse>

    /**
     * Lists a function's ship history newest first, including per-ship failure stage and reason
     * when recorded.
     */
    fun retrieveRevisions(id: String): CompletableFuture<FuncRetrieveRevisionsResponse> =
        retrieveRevisions(id, FuncRetrieveRevisionsParams.none())

    /** @see retrieveRevisions */
    fun retrieveRevisions(
        id: String,
        params: FuncRetrieveRevisionsParams = FuncRetrieveRevisionsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FuncRetrieveRevisionsResponse> =
        retrieveRevisions(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieveRevisions */
    fun retrieveRevisions(
        id: String,
        params: FuncRetrieveRevisionsParams = FuncRetrieveRevisionsParams.none(),
    ): CompletableFuture<FuncRetrieveRevisionsResponse> =
        retrieveRevisions(id, params, RequestOptions.none())

    /** @see retrieveRevisions */
    fun retrieveRevisions(
        params: FuncRetrieveRevisionsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FuncRetrieveRevisionsResponse>

    /** @see retrieveRevisions */
    fun retrieveRevisions(
        params: FuncRetrieveRevisionsParams
    ): CompletableFuture<FuncRetrieveRevisionsResponse> =
        retrieveRevisions(params, RequestOptions.none())

    /** @see retrieveRevisions */
    fun retrieveRevisions(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<FuncRetrieveRevisionsResponse> =
        retrieveRevisions(id, FuncRetrieveRevisionsParams.none(), requestOptions)

    /**
     * Returns the latest ship outcome. The stage is `none` on success, `pending` while building, or
     * a failure stage such as `build`, `platform`, `pre_build`, `deploy`, or `security_review`.
     * This stage-neutral customer-facing path is an alias over the same inspection resource as
     * `build_log_inspection`.
     */
    fun retrieveShipInspection(id: String): CompletableFuture<FuncRetrieveShipInspectionResponse> =
        retrieveShipInspection(id, FuncRetrieveShipInspectionParams.none())

    /** @see retrieveShipInspection */
    fun retrieveShipInspection(
        id: String,
        params: FuncRetrieveShipInspectionParams = FuncRetrieveShipInspectionParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FuncRetrieveShipInspectionResponse> =
        retrieveShipInspection(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieveShipInspection */
    fun retrieveShipInspection(
        id: String,
        params: FuncRetrieveShipInspectionParams = FuncRetrieveShipInspectionParams.none(),
    ): CompletableFuture<FuncRetrieveShipInspectionResponse> =
        retrieveShipInspection(id, params, RequestOptions.none())

    /** @see retrieveShipInspection */
    fun retrieveShipInspection(
        params: FuncRetrieveShipInspectionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FuncRetrieveShipInspectionResponse>

    /** @see retrieveShipInspection */
    fun retrieveShipInspection(
        params: FuncRetrieveShipInspectionParams
    ): CompletableFuture<FuncRetrieveShipInspectionResponse> =
        retrieveShipInspection(params, RequestOptions.none())

    /** @see retrieveShipInspection */
    fun retrieveShipInspection(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<FuncRetrieveShipInspectionResponse> =
        retrieveShipInspection(id, FuncRetrieveShipInspectionParams.none(), requestOptions)

    /** A view of [FuncServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): FuncServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /compute/funcs/{id}/logs`, but is otherwise the same
         * as [FuncServiceAsync.retrieveLogs].
         */
        fun retrieveLogs(id: String): CompletableFuture<HttpResponseFor<FuncRetrieveLogsResponse>> =
            retrieveLogs(id, FuncRetrieveLogsParams.none())

        /** @see retrieveLogs */
        fun retrieveLogs(
            id: String,
            params: FuncRetrieveLogsParams = FuncRetrieveLogsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FuncRetrieveLogsResponse>> =
            retrieveLogs(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieveLogs */
        fun retrieveLogs(
            id: String,
            params: FuncRetrieveLogsParams = FuncRetrieveLogsParams.none(),
        ): CompletableFuture<HttpResponseFor<FuncRetrieveLogsResponse>> =
            retrieveLogs(id, params, RequestOptions.none())

        /** @see retrieveLogs */
        fun retrieveLogs(
            params: FuncRetrieveLogsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FuncRetrieveLogsResponse>>

        /** @see retrieveLogs */
        fun retrieveLogs(
            params: FuncRetrieveLogsParams
        ): CompletableFuture<HttpResponseFor<FuncRetrieveLogsResponse>> =
            retrieveLogs(params, RequestOptions.none())

        /** @see retrieveLogs */
        fun retrieveLogs(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<FuncRetrieveLogsResponse>> =
            retrieveLogs(id, FuncRetrieveLogsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /compute/funcs/{id}/metric_aggregates`, but is
         * otherwise the same as [FuncServiceAsync.retrieveMetricAggregates].
         */
        fun retrieveMetricAggregates(
            id: String,
            params: FuncRetrieveMetricAggregatesParams,
        ): CompletableFuture<HttpResponseFor<FuncRetrieveMetricAggregatesResponse>> =
            retrieveMetricAggregates(id, params, RequestOptions.none())

        /** @see retrieveMetricAggregates */
        fun retrieveMetricAggregates(
            id: String,
            params: FuncRetrieveMetricAggregatesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FuncRetrieveMetricAggregatesResponse>> =
            retrieveMetricAggregates(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieveMetricAggregates */
        fun retrieveMetricAggregates(
            params: FuncRetrieveMetricAggregatesParams
        ): CompletableFuture<HttpResponseFor<FuncRetrieveMetricAggregatesResponse>> =
            retrieveMetricAggregates(params, RequestOptions.none())

        /** @see retrieveMetricAggregates */
        fun retrieveMetricAggregates(
            params: FuncRetrieveMetricAggregatesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FuncRetrieveMetricAggregatesResponse>>

        /**
         * Returns a raw HTTP response for `get /compute/funcs/{id}/revisions`, but is otherwise the
         * same as [FuncServiceAsync.retrieveRevisions].
         */
        fun retrieveRevisions(
            id: String
        ): CompletableFuture<HttpResponseFor<FuncRetrieveRevisionsResponse>> =
            retrieveRevisions(id, FuncRetrieveRevisionsParams.none())

        /** @see retrieveRevisions */
        fun retrieveRevisions(
            id: String,
            params: FuncRetrieveRevisionsParams = FuncRetrieveRevisionsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FuncRetrieveRevisionsResponse>> =
            retrieveRevisions(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieveRevisions */
        fun retrieveRevisions(
            id: String,
            params: FuncRetrieveRevisionsParams = FuncRetrieveRevisionsParams.none(),
        ): CompletableFuture<HttpResponseFor<FuncRetrieveRevisionsResponse>> =
            retrieveRevisions(id, params, RequestOptions.none())

        /** @see retrieveRevisions */
        fun retrieveRevisions(
            params: FuncRetrieveRevisionsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FuncRetrieveRevisionsResponse>>

        /** @see retrieveRevisions */
        fun retrieveRevisions(
            params: FuncRetrieveRevisionsParams
        ): CompletableFuture<HttpResponseFor<FuncRetrieveRevisionsResponse>> =
            retrieveRevisions(params, RequestOptions.none())

        /** @see retrieveRevisions */
        fun retrieveRevisions(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<FuncRetrieveRevisionsResponse>> =
            retrieveRevisions(id, FuncRetrieveRevisionsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /compute/funcs/{id}/ship_inspection`, but is
         * otherwise the same as [FuncServiceAsync.retrieveShipInspection].
         */
        fun retrieveShipInspection(
            id: String
        ): CompletableFuture<HttpResponseFor<FuncRetrieveShipInspectionResponse>> =
            retrieveShipInspection(id, FuncRetrieveShipInspectionParams.none())

        /** @see retrieveShipInspection */
        fun retrieveShipInspection(
            id: String,
            params: FuncRetrieveShipInspectionParams = FuncRetrieveShipInspectionParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FuncRetrieveShipInspectionResponse>> =
            retrieveShipInspection(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieveShipInspection */
        fun retrieveShipInspection(
            id: String,
            params: FuncRetrieveShipInspectionParams = FuncRetrieveShipInspectionParams.none(),
        ): CompletableFuture<HttpResponseFor<FuncRetrieveShipInspectionResponse>> =
            retrieveShipInspection(id, params, RequestOptions.none())

        /** @see retrieveShipInspection */
        fun retrieveShipInspection(
            params: FuncRetrieveShipInspectionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FuncRetrieveShipInspectionResponse>>

        /** @see retrieveShipInspection */
        fun retrieveShipInspection(
            params: FuncRetrieveShipInspectionParams
        ): CompletableFuture<HttpResponseFor<FuncRetrieveShipInspectionResponse>> =
            retrieveShipInspection(params, RequestOptions.none())

        /** @see retrieveShipInspection */
        fun retrieveShipInspection(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<FuncRetrieveShipInspectionResponse>> =
            retrieveShipInspection(id, FuncRetrieveShipInspectionParams.none(), requestOptions)
    }
}
