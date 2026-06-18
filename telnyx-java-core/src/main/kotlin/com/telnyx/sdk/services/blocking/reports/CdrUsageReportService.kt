// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.reports

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.reports.cdrusagereports.CdrUsageReportFetchSyncParams
import com.telnyx.sdk.models.reports.cdrusagereports.CdrUsageReportFetchSyncResponse
import java.util.function.Consumer

/** Voice usage reports */
interface CdrUsageReportService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CdrUsageReportService

    /**
     * Generate and fetch voice usage report synchronously. This endpoint will both generate and
     * fetch the voice report over a specified time period. No polling is necessary but the response
     * may take up to a couple of minutes.
     */
    fun fetchSync(params: CdrUsageReportFetchSyncParams): CdrUsageReportFetchSyncResponse =
        fetchSync(params, RequestOptions.none())

    /** @see fetchSync */
    fun fetchSync(
        params: CdrUsageReportFetchSyncParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CdrUsageReportFetchSyncResponse

    /**
     * A view of [CdrUsageReportService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CdrUsageReportService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /reports/cdr_usage_reports/sync`, but is otherwise
         * the same as [CdrUsageReportService.fetchSync].
         */
        @MustBeClosed
        fun fetchSync(
            params: CdrUsageReportFetchSyncParams
        ): HttpResponseFor<CdrUsageReportFetchSyncResponse> =
            fetchSync(params, RequestOptions.none())

        /** @see fetchSync */
        @MustBeClosed
        fun fetchSync(
            params: CdrUsageReportFetchSyncParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CdrUsageReportFetchSyncResponse>
    }
}
