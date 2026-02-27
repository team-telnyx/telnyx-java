// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.legacy

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.services.async.legacy.reporting.BatchDetailRecordServiceAsync
import com.telnyx.sdk.services.async.legacy.reporting.UsageReportServiceAsync
import java.util.function.Consumer

interface ReportingServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ReportingServiceAsync

    fun batchDetailRecords(): BatchDetailRecordServiceAsync

    /** Speech to text usage reports */
    fun usageReports(): UsageReportServiceAsync

    /**
     * A view of [ReportingServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ReportingServiceAsync.WithRawResponse

        fun batchDetailRecords(): BatchDetailRecordServiceAsync.WithRawResponse

        /** Speech to text usage reports */
        fun usageReports(): UsageReportServiceAsync.WithRawResponse
    }
}
