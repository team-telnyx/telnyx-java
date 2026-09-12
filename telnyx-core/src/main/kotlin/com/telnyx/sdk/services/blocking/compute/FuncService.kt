// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.compute

import com.google.errorprone.annotations.MustBeClosed
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
import java.util.function.Consumer

interface FuncService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): FuncService

    /**
     * Returns logs oldest first. `type=runtime` (default) returns function stdout/stderr.
     * `type=invocations` returns one platform-generated record per HTTP request served.
     */
    fun retrieveLogs(id: String): FuncRetrieveLogsResponse =
        retrieveLogs(id, FuncRetrieveLogsParams.none())

    /** @see retrieveLogs */
    fun retrieveLogs(
        id: String,
        params: FuncRetrieveLogsParams = FuncRetrieveLogsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FuncRetrieveLogsResponse = retrieveLogs(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieveLogs */
    fun retrieveLogs(
        id: String,
        params: FuncRetrieveLogsParams = FuncRetrieveLogsParams.none(),
    ): FuncRetrieveLogsResponse = retrieveLogs(id, params, RequestOptions.none())

    /** @see retrieveLogs */
    fun retrieveLogs(
        params: FuncRetrieveLogsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FuncRetrieveLogsResponse

    /** @see retrieveLogs */
    fun retrieveLogs(params: FuncRetrieveLogsParams): FuncRetrieveLogsResponse =
        retrieveLogs(params, RequestOptions.none())

    /** @see retrieveLogs */
    fun retrieveLogs(id: String, requestOptions: RequestOptions): FuncRetrieveLogsResponse =
        retrieveLogs(id, FuncRetrieveLogsParams.none(), requestOptions)

    /**
     * Returns aggregate request, latency, CPU, memory, and resource-limit metrics for a function
     * over the requested window.
     */
    fun retrieveMetricAggregates(
        id: String,
        params: FuncRetrieveMetricAggregatesParams,
    ): FuncRetrieveMetricAggregatesResponse =
        retrieveMetricAggregates(id, params, RequestOptions.none())

    /** @see retrieveMetricAggregates */
    fun retrieveMetricAggregates(
        id: String,
        params: FuncRetrieveMetricAggregatesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FuncRetrieveMetricAggregatesResponse =
        retrieveMetricAggregates(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieveMetricAggregates */
    fun retrieveMetricAggregates(
        params: FuncRetrieveMetricAggregatesParams
    ): FuncRetrieveMetricAggregatesResponse =
        retrieveMetricAggregates(params, RequestOptions.none())

    /** @see retrieveMetricAggregates */
    fun retrieveMetricAggregates(
        params: FuncRetrieveMetricAggregatesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FuncRetrieveMetricAggregatesResponse

    /**
     * Lists a function's ship history newest first, including per-ship failure stage and reason
     * when recorded.
     */
    fun retrieveRevisions(id: String): FuncRetrieveRevisionsResponse =
        retrieveRevisions(id, FuncRetrieveRevisionsParams.none())

    /** @see retrieveRevisions */
    fun retrieveRevisions(
        id: String,
        params: FuncRetrieveRevisionsParams = FuncRetrieveRevisionsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FuncRetrieveRevisionsResponse =
        retrieveRevisions(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieveRevisions */
    fun retrieveRevisions(
        id: String,
        params: FuncRetrieveRevisionsParams = FuncRetrieveRevisionsParams.none(),
    ): FuncRetrieveRevisionsResponse = retrieveRevisions(id, params, RequestOptions.none())

    /** @see retrieveRevisions */
    fun retrieveRevisions(
        params: FuncRetrieveRevisionsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FuncRetrieveRevisionsResponse

    /** @see retrieveRevisions */
    fun retrieveRevisions(params: FuncRetrieveRevisionsParams): FuncRetrieveRevisionsResponse =
        retrieveRevisions(params, RequestOptions.none())

    /** @see retrieveRevisions */
    fun retrieveRevisions(
        id: String,
        requestOptions: RequestOptions,
    ): FuncRetrieveRevisionsResponse =
        retrieveRevisions(id, FuncRetrieveRevisionsParams.none(), requestOptions)

    /**
     * Returns the latest ship outcome. The stage is `none` on success, `pending` while building, or
     * a failure stage such as `build`, `platform`, `pre_build`, `deploy`, or `security_review`.
     * This stage-neutral customer-facing path is an alias over the same inspection resource as
     * `build_log_inspection`.
     */
    fun retrieveShipInspection(id: String): FuncRetrieveShipInspectionResponse =
        retrieveShipInspection(id, FuncRetrieveShipInspectionParams.none())

    /** @see retrieveShipInspection */
    fun retrieveShipInspection(
        id: String,
        params: FuncRetrieveShipInspectionParams = FuncRetrieveShipInspectionParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FuncRetrieveShipInspectionResponse =
        retrieveShipInspection(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieveShipInspection */
    fun retrieveShipInspection(
        id: String,
        params: FuncRetrieveShipInspectionParams = FuncRetrieveShipInspectionParams.none(),
    ): FuncRetrieveShipInspectionResponse =
        retrieveShipInspection(id, params, RequestOptions.none())

    /** @see retrieveShipInspection */
    fun retrieveShipInspection(
        params: FuncRetrieveShipInspectionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FuncRetrieveShipInspectionResponse

    /** @see retrieveShipInspection */
    fun retrieveShipInspection(
        params: FuncRetrieveShipInspectionParams
    ): FuncRetrieveShipInspectionResponse = retrieveShipInspection(params, RequestOptions.none())

    /** @see retrieveShipInspection */
    fun retrieveShipInspection(
        id: String,
        requestOptions: RequestOptions,
    ): FuncRetrieveShipInspectionResponse =
        retrieveShipInspection(id, FuncRetrieveShipInspectionParams.none(), requestOptions)

    /** A view of [FuncService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): FuncService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /compute/funcs/{id}/logs`, but is otherwise the same
         * as [FuncService.retrieveLogs].
         */
        @MustBeClosed
        fun retrieveLogs(id: String): HttpResponseFor<FuncRetrieveLogsResponse> =
            retrieveLogs(id, FuncRetrieveLogsParams.none())

        /** @see retrieveLogs */
        @MustBeClosed
        fun retrieveLogs(
            id: String,
            params: FuncRetrieveLogsParams = FuncRetrieveLogsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FuncRetrieveLogsResponse> =
            retrieveLogs(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieveLogs */
        @MustBeClosed
        fun retrieveLogs(
            id: String,
            params: FuncRetrieveLogsParams = FuncRetrieveLogsParams.none(),
        ): HttpResponseFor<FuncRetrieveLogsResponse> =
            retrieveLogs(id, params, RequestOptions.none())

        /** @see retrieveLogs */
        @MustBeClosed
        fun retrieveLogs(
            params: FuncRetrieveLogsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FuncRetrieveLogsResponse>

        /** @see retrieveLogs */
        @MustBeClosed
        fun retrieveLogs(
            params: FuncRetrieveLogsParams
        ): HttpResponseFor<FuncRetrieveLogsResponse> = retrieveLogs(params, RequestOptions.none())

        /** @see retrieveLogs */
        @MustBeClosed
        fun retrieveLogs(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FuncRetrieveLogsResponse> =
            retrieveLogs(id, FuncRetrieveLogsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /compute/funcs/{id}/metric_aggregates`, but is
         * otherwise the same as [FuncService.retrieveMetricAggregates].
         */
        @MustBeClosed
        fun retrieveMetricAggregates(
            id: String,
            params: FuncRetrieveMetricAggregatesParams,
        ): HttpResponseFor<FuncRetrieveMetricAggregatesResponse> =
            retrieveMetricAggregates(id, params, RequestOptions.none())

        /** @see retrieveMetricAggregates */
        @MustBeClosed
        fun retrieveMetricAggregates(
            id: String,
            params: FuncRetrieveMetricAggregatesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FuncRetrieveMetricAggregatesResponse> =
            retrieveMetricAggregates(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieveMetricAggregates */
        @MustBeClosed
        fun retrieveMetricAggregates(
            params: FuncRetrieveMetricAggregatesParams
        ): HttpResponseFor<FuncRetrieveMetricAggregatesResponse> =
            retrieveMetricAggregates(params, RequestOptions.none())

        /** @see retrieveMetricAggregates */
        @MustBeClosed
        fun retrieveMetricAggregates(
            params: FuncRetrieveMetricAggregatesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FuncRetrieveMetricAggregatesResponse>

        /**
         * Returns a raw HTTP response for `get /compute/funcs/{id}/revisions`, but is otherwise the
         * same as [FuncService.retrieveRevisions].
         */
        @MustBeClosed
        fun retrieveRevisions(id: String): HttpResponseFor<FuncRetrieveRevisionsResponse> =
            retrieveRevisions(id, FuncRetrieveRevisionsParams.none())

        /** @see retrieveRevisions */
        @MustBeClosed
        fun retrieveRevisions(
            id: String,
            params: FuncRetrieveRevisionsParams = FuncRetrieveRevisionsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FuncRetrieveRevisionsResponse> =
            retrieveRevisions(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieveRevisions */
        @MustBeClosed
        fun retrieveRevisions(
            id: String,
            params: FuncRetrieveRevisionsParams = FuncRetrieveRevisionsParams.none(),
        ): HttpResponseFor<FuncRetrieveRevisionsResponse> =
            retrieveRevisions(id, params, RequestOptions.none())

        /** @see retrieveRevisions */
        @MustBeClosed
        fun retrieveRevisions(
            params: FuncRetrieveRevisionsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FuncRetrieveRevisionsResponse>

        /** @see retrieveRevisions */
        @MustBeClosed
        fun retrieveRevisions(
            params: FuncRetrieveRevisionsParams
        ): HttpResponseFor<FuncRetrieveRevisionsResponse> =
            retrieveRevisions(params, RequestOptions.none())

        /** @see retrieveRevisions */
        @MustBeClosed
        fun retrieveRevisions(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FuncRetrieveRevisionsResponse> =
            retrieveRevisions(id, FuncRetrieveRevisionsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /compute/funcs/{id}/ship_inspection`, but is
         * otherwise the same as [FuncService.retrieveShipInspection].
         */
        @MustBeClosed
        fun retrieveShipInspection(
            id: String
        ): HttpResponseFor<FuncRetrieveShipInspectionResponse> =
            retrieveShipInspection(id, FuncRetrieveShipInspectionParams.none())

        /** @see retrieveShipInspection */
        @MustBeClosed
        fun retrieveShipInspection(
            id: String,
            params: FuncRetrieveShipInspectionParams = FuncRetrieveShipInspectionParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FuncRetrieveShipInspectionResponse> =
            retrieveShipInspection(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieveShipInspection */
        @MustBeClosed
        fun retrieveShipInspection(
            id: String,
            params: FuncRetrieveShipInspectionParams = FuncRetrieveShipInspectionParams.none(),
        ): HttpResponseFor<FuncRetrieveShipInspectionResponse> =
            retrieveShipInspection(id, params, RequestOptions.none())

        /** @see retrieveShipInspection */
        @MustBeClosed
        fun retrieveShipInspection(
            params: FuncRetrieveShipInspectionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FuncRetrieveShipInspectionResponse>

        /** @see retrieveShipInspection */
        @MustBeClosed
        fun retrieveShipInspection(
            params: FuncRetrieveShipInspectionParams
        ): HttpResponseFor<FuncRetrieveShipInspectionResponse> =
            retrieveShipInspection(params, RequestOptions.none())

        /** @see retrieveShipInspection */
        @MustBeClosed
        fun retrieveShipInspection(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FuncRetrieveShipInspectionResponse> =
            retrieveShipInspection(id, FuncRetrieveShipInspectionParams.none(), requestOptions)
    }
}
