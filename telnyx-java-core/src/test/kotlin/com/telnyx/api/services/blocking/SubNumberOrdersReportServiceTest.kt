// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking

import com.telnyx.api.TestServerExtension
import com.telnyx.api.client.okhttp.TelnyxOkHttpClient
import com.telnyx.api.models.subnumberordersreport.SubNumberOrdersReportCreateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class SubNumberOrdersReportServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val subNumberOrdersReportService = client.subNumberOrdersReport()

        val subNumberOrdersReport =
            subNumberOrdersReportService.create(
                SubNumberOrdersReportCreateParams.builder()
                    .countryCode("US")
                    .createdAtGt(OffsetDateTime.parse("2023-04-05T10:22:08.230549Z"))
                    .createdAtLt(OffsetDateTime.parse("2025-06-05T10:22:08.230549Z"))
                    .customerReference("STRING")
                    .orderRequestId("12ade33a-21c0-473b-b055-b3c836e1c293")
                    .status(SubNumberOrdersReportCreateParams.Status.SUCCESS)
                    .build()
            )

        subNumberOrdersReport.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val subNumberOrdersReportService = client.subNumberOrdersReport()

        val subNumberOrdersReport =
            subNumberOrdersReportService.retrieve("12ade33a-21c0-473b-b055-b3c836e1c293")

        subNumberOrdersReport.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun download() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val subNumberOrdersReportService = client.subNumberOrdersReport()

        subNumberOrdersReportService.download("12ade33a-21c0-473b-b055-b3c836e1c293")
    }
}
