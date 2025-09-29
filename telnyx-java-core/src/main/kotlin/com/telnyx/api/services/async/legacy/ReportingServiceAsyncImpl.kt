// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async.legacy

import com.telnyx.api.core.ClientOptions
import com.telnyx.api.services.async.legacy.reporting.BatchDetailRecordServiceAsync
import com.telnyx.api.services.async.legacy.reporting.BatchDetailRecordServiceAsyncImpl
import com.telnyx.api.services.async.legacy.reporting.UsageReportServiceAsync
import com.telnyx.api.services.async.legacy.reporting.UsageReportServiceAsyncImpl
import java.util.function.Consumer

class ReportingServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    ReportingServiceAsync {

    private val withRawResponse: ReportingServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val batchDetailRecords: BatchDetailRecordServiceAsync by lazy {
        BatchDetailRecordServiceAsyncImpl(clientOptions)
    }

    private val usageReports: UsageReportServiceAsync by lazy {
        UsageReportServiceAsyncImpl(clientOptions)
    }

    override fun withRawResponse(): ReportingServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ReportingServiceAsync =
        ReportingServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun batchDetailRecords(): BatchDetailRecordServiceAsync = batchDetailRecords

    override fun usageReports(): UsageReportServiceAsync = usageReports

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ReportingServiceAsync.WithRawResponse {

        private val batchDetailRecords: BatchDetailRecordServiceAsync.WithRawResponse by lazy {
            BatchDetailRecordServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val usageReports: UsageReportServiceAsync.WithRawResponse by lazy {
            UsageReportServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ReportingServiceAsync.WithRawResponse =
            ReportingServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun batchDetailRecords(): BatchDetailRecordServiceAsync.WithRawResponse =
            batchDetailRecords

        override fun usageReports(): UsageReportServiceAsync.WithRawResponse = usageReports
    }
}
