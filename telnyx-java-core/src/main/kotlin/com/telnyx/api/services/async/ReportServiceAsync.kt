// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async

import com.telnyx.api.core.ClientOptions
import com.telnyx.api.core.RequestOptions
import com.telnyx.api.core.http.HttpResponseFor
import com.telnyx.api.models.reports.ReportListMdrsParams
import com.telnyx.api.models.reports.ReportListMdrsResponse
import com.telnyx.api.models.reports.ReportListWdrsParams
import com.telnyx.api.models.reports.ReportListWdrsResponse
import com.telnyx.api.services.async.reports.CdrUsageReportServiceAsync
import com.telnyx.api.services.async.reports.MdrUsageReportServiceAsync
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
    fun listWdrs(): CompletableFuture<ReportListWdrsResponse> =
        listWdrs(ReportListWdrsParams.none())

    /** @see listWdrs */
    fun listWdrs(
        params: ReportListWdrsParams = ReportListWdrsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ReportListWdrsResponse>

    /** @see listWdrs */
    fun listWdrs(
        params: ReportListWdrsParams = ReportListWdrsParams.none()
    ): CompletableFuture<ReportListWdrsResponse> = listWdrs(params, RequestOptions.none())

    /** @see listWdrs */
    fun listWdrs(requestOptions: RequestOptions): CompletableFuture<ReportListWdrsResponse> =
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
        fun listWdrs(): CompletableFuture<HttpResponseFor<ReportListWdrsResponse>> =
            listWdrs(ReportListWdrsParams.none())

        /** @see listWdrs */
        fun listWdrs(
            params: ReportListWdrsParams = ReportListWdrsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ReportListWdrsResponse>>

        /** @see listWdrs */
        fun listWdrs(
            params: ReportListWdrsParams = ReportListWdrsParams.none()
        ): CompletableFuture<HttpResponseFor<ReportListWdrsResponse>> =
            listWdrs(params, RequestOptions.none())

        /** @see listWdrs */
        fun listWdrs(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<ReportListWdrsResponse>> =
            listWdrs(ReportListWdrsParams.none(), requestOptions)
    }
}
