// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.reports.ReportListMdrsParams
import com.telnyx.sdk.models.reports.ReportListMdrsResponse
import com.telnyx.sdk.models.reports.ReportListWdrsParams
import com.telnyx.sdk.models.reports.ReportListWdrsResponse
import com.telnyx.sdk.services.blocking.reports.CdrUsageReportService
import com.telnyx.sdk.services.blocking.reports.MdrUsageReportService
import java.util.function.Consumer

interface ReportService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ReportService

    fun cdrUsageReports(): CdrUsageReportService

    fun mdrUsageReports(): MdrUsageReportService

    /** Fetch all Mdr records */
    fun listMdrs(): ReportListMdrsResponse = listMdrs(ReportListMdrsParams.none())

    /** @see listMdrs */
    fun listMdrs(
        params: ReportListMdrsParams = ReportListMdrsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ReportListMdrsResponse

    /** @see listMdrs */
    fun listMdrs(
        params: ReportListMdrsParams = ReportListMdrsParams.none()
    ): ReportListMdrsResponse = listMdrs(params, RequestOptions.none())

    /** @see listMdrs */
    fun listMdrs(requestOptions: RequestOptions): ReportListMdrsResponse =
        listMdrs(ReportListMdrsParams.none(), requestOptions)

    /** Fetch all Wdr records */
    fun listWdrs(): ReportListWdrsResponse = listWdrs(ReportListWdrsParams.none())

    /** @see listWdrs */
    fun listWdrs(
        params: ReportListWdrsParams = ReportListWdrsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ReportListWdrsResponse

    /** @see listWdrs */
    fun listWdrs(
        params: ReportListWdrsParams = ReportListWdrsParams.none()
    ): ReportListWdrsResponse = listWdrs(params, RequestOptions.none())

    /** @see listWdrs */
    fun listWdrs(requestOptions: RequestOptions): ReportListWdrsResponse =
        listWdrs(ReportListWdrsParams.none(), requestOptions)

    /** A view of [ReportService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ReportService.WithRawResponse

        fun cdrUsageReports(): CdrUsageReportService.WithRawResponse

        fun mdrUsageReports(): MdrUsageReportService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /reports/mdrs`, but is otherwise the same as
         * [ReportService.listMdrs].
         */
        @MustBeClosed
        fun listMdrs(): HttpResponseFor<ReportListMdrsResponse> =
            listMdrs(ReportListMdrsParams.none())

        /** @see listMdrs */
        @MustBeClosed
        fun listMdrs(
            params: ReportListMdrsParams = ReportListMdrsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ReportListMdrsResponse>

        /** @see listMdrs */
        @MustBeClosed
        fun listMdrs(
            params: ReportListMdrsParams = ReportListMdrsParams.none()
        ): HttpResponseFor<ReportListMdrsResponse> = listMdrs(params, RequestOptions.none())

        /** @see listMdrs */
        @MustBeClosed
        fun listMdrs(requestOptions: RequestOptions): HttpResponseFor<ReportListMdrsResponse> =
            listMdrs(ReportListMdrsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /reports/wdrs`, but is otherwise the same as
         * [ReportService.listWdrs].
         */
        @MustBeClosed
        fun listWdrs(): HttpResponseFor<ReportListWdrsResponse> =
            listWdrs(ReportListWdrsParams.none())

        /** @see listWdrs */
        @MustBeClosed
        fun listWdrs(
            params: ReportListWdrsParams = ReportListWdrsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ReportListWdrsResponse>

        /** @see listWdrs */
        @MustBeClosed
        fun listWdrs(
            params: ReportListWdrsParams = ReportListWdrsParams.none()
        ): HttpResponseFor<ReportListWdrsResponse> = listWdrs(params, RequestOptions.none())

        /** @see listWdrs */
        @MustBeClosed
        fun listWdrs(requestOptions: RequestOptions): HttpResponseFor<ReportListWdrsResponse> =
            listWdrs(ReportListWdrsParams.none(), requestOptions)
    }
}
