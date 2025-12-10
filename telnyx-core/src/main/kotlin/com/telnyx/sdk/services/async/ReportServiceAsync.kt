// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.reports.ReportListMdrsParams
import com.telnyx.sdk.models.reports.ReportListMdrsResponse
import com.telnyx.sdk.models.reports.ReportListWdrsPageAsync
import com.telnyx.sdk.models.reports.ReportListWdrsParams
import com.telnyx.sdk.services.async.reports.CdrUsageReportServiceAsync
import com.telnyx.sdk.services.async.reports.MdrUsageReportServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface ReportServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ReportServiceAsync

    fun cdrUsageReports(): CdrUsageReportServiceAsync

    fun mdrUsageReports(): MdrUsageReportServiceAsync

    /** Fetch all Mdr records */
    fun listMdrs(): CompletableFuture<ReportListMdrsResponse> =
        listMdrs(ReportListMdrsParams.none())

    /** @see listMdrs */
    fun listMdrs(
        params: ReportListMdrsParams = ReportListMdrsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ReportListMdrsResponse>

    /** @see listMdrs */
    fun listMdrs(
        params: ReportListMdrsParams = ReportListMdrsParams.none()
    ): CompletableFuture<ReportListMdrsResponse> = listMdrs(params, RequestOptions.none())

    /** @see listMdrs */
    fun listMdrs(requestOptions: RequestOptions): CompletableFuture<ReportListMdrsResponse> =
        listMdrs(ReportListMdrsParams.none(), requestOptions)

    /** Fetch all Wdr records */
    fun listWdrs(): CompletableFuture<ReportListWdrsPageAsync> =
        listWdrs(ReportListWdrsParams.none())

    /** @see listWdrs */
    fun listWdrs(
        params: ReportListWdrsParams = ReportListWdrsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ReportListWdrsPageAsync>

    /** @see listWdrs */
    fun listWdrs(
        params: ReportListWdrsParams = ReportListWdrsParams.none()
    ): CompletableFuture<ReportListWdrsPageAsync> = listWdrs(params, RequestOptions.none())

    /** @see listWdrs */
    fun listWdrs(requestOptions: RequestOptions): CompletableFuture<ReportListWdrsPageAsync> =
        listWdrs(ReportListWdrsParams.none(), requestOptions)

    /**
     * A view of [ReportServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ReportServiceAsync.WithRawResponse

        fun cdrUsageReports(): CdrUsageReportServiceAsync.WithRawResponse

        fun mdrUsageReports(): MdrUsageReportServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /reports/mdrs`, but is otherwise the same as
         * [ReportServiceAsync.listMdrs].
         */
        fun listMdrs(): CompletableFuture<HttpResponseFor<ReportListMdrsResponse>> =
            listMdrs(ReportListMdrsParams.none())

        /** @see listMdrs */
        fun listMdrs(
            params: ReportListMdrsParams = ReportListMdrsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ReportListMdrsResponse>>

        /** @see listMdrs */
        fun listMdrs(
            params: ReportListMdrsParams = ReportListMdrsParams.none()
        ): CompletableFuture<HttpResponseFor<ReportListMdrsResponse>> =
            listMdrs(params, RequestOptions.none())

        /** @see listMdrs */
        fun listMdrs(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<ReportListMdrsResponse>> =
            listMdrs(ReportListMdrsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /reports/wdrs`, but is otherwise the same as
         * [ReportServiceAsync.listWdrs].
         */
        fun listWdrs(): CompletableFuture<HttpResponseFor<ReportListWdrsPageAsync>> =
            listWdrs(ReportListWdrsParams.none())

        /** @see listWdrs */
        fun listWdrs(
            params: ReportListWdrsParams = ReportListWdrsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ReportListWdrsPageAsync>>

        /** @see listWdrs */
        fun listWdrs(
            params: ReportListWdrsParams = ReportListWdrsParams.none()
        ): CompletableFuture<HttpResponseFor<ReportListWdrsPageAsync>> =
            listWdrs(params, RequestOptions.none())

        /** @see listWdrs */
        fun listWdrs(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<ReportListWdrsPageAsync>> =
            listWdrs(ReportListWdrsParams.none(), requestOptions)
    }
}
