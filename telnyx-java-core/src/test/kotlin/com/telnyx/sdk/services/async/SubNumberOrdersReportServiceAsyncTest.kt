// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.TestServerExtension
import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.subnumberordersreport.SubNumberOrdersReportCreateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class SubNumberOrdersReportServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val subNumberOrdersReportServiceAsync = client.subNumberOrdersReport()

        val subNumberOrdersReportFuture =
            subNumberOrdersReportServiceAsync.create(
                SubNumberOrdersReportCreateParams.builder()
                    .countryCode("US")
                    .createdAtGt(OffsetDateTime.parse("2023-04-05T10:22:08.230549Z"))
                    .createdAtLt(OffsetDateTime.parse("2025-06-05T10:22:08.230549Z"))
                    .customerReference("STRING")
                    .orderRequestId("12ade33a-21c0-473b-b055-b3c836e1c293")
                    .status(SubNumberOrdersReportCreateParams.Status.SUCCESS)
                    .build()
            )

        val subNumberOrdersReport = subNumberOrdersReportFuture.get()
        subNumberOrdersReport.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val subNumberOrdersReportServiceAsync = client.subNumberOrdersReport()

        val subNumberOrdersReportFuture =
            subNumberOrdersReportServiceAsync.retrieve("12ade33a-21c0-473b-b055-b3c836e1c293")

        val subNumberOrdersReport = subNumberOrdersReportFuture.get()
        subNumberOrdersReport.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun download() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val subNumberOrdersReportServiceAsync = client.subNumberOrdersReport()

        val responseFuture =
            subNumberOrdersReportServiceAsync.download("12ade33a-21c0-473b-b055-b3c836e1c293")

        val response = responseFuture.get()
    }
}
