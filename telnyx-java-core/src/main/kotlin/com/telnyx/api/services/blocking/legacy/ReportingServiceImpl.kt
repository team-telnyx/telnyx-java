// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking.legacy

import com.telnyx.api.core.ClientOptions
import com.telnyx.api.services.blocking.legacy.reporting.BatchDetailRecordService
import com.telnyx.api.services.blocking.legacy.reporting.BatchDetailRecordServiceImpl
import com.telnyx.api.services.blocking.legacy.reporting.UsageReportService
import com.telnyx.api.services.blocking.legacy.reporting.UsageReportServiceImpl
import java.util.function.Consumer

class ReportingServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ReportingService {

    private val withRawResponse: ReportingService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val batchDetailRecords: BatchDetailRecordService by lazy {
        BatchDetailRecordServiceImpl(clientOptions)
    }

    private val usageReports: UsageReportService by lazy { UsageReportServiceImpl(clientOptions) }

    override fun withRawResponse(): ReportingService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ReportingService =
        ReportingServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun batchDetailRecords(): BatchDetailRecordService = batchDetailRecords

    override fun usageReports(): UsageReportService = usageReports

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ReportingService.WithRawResponse {

        private val batchDetailRecords: BatchDetailRecordService.WithRawResponse by lazy {
            BatchDetailRecordServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val usageReports: UsageReportService.WithRawResponse by lazy {
            UsageReportServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ReportingService.WithRawResponse =
            ReportingServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun batchDetailRecords(): BatchDetailRecordService.WithRawResponse =
            batchDetailRecords

        override fun usageReports(): UsageReportService.WithRawResponse = usageReports
    }
}
