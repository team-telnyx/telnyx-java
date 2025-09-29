// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking.legacy

import com.telnyx.api.core.ClientOptions
import com.telnyx.api.services.blocking.legacy.reporting.BatchDetailRecordService
import com.telnyx.api.services.blocking.legacy.reporting.UsageReportService
import java.util.function.Consumer

interface ReportingService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ReportingService

    fun batchDetailRecords(): BatchDetailRecordService

    fun usageReports(): UsageReportService

    /** A view of [ReportingService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ReportingService.WithRawResponse

        fun batchDetailRecords(): BatchDetailRecordService.WithRawResponse

        fun usageReports(): UsageReportService.WithRawResponse
    }
}
