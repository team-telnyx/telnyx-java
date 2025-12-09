// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.telnyx.sdk.TestServerExtension
import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.reports.ReportListMdrsParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ReportServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun listMdrs() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val reportService = client.reports()

        val response =
            reportService.listMdrs(
                ReportListMdrsParams.builder()
                    .id("e093fbe0-5bde-11eb-ae93-0242ac130002")
                    .cld("+15551237654")
                    .cli("+15551237654")
                    .direction(ReportListMdrsParams.Direction.INBOUND)
                    .endDate("end_date")
                    .messageType(ReportListMdrsParams.MessageType.SMS)
                    .profile("My profile")
                    .startDate("start_date")
                    .status(ReportListMdrsParams.Status.DELIVERED)
                    .build()
            )

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun listWdrs() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val reportService = client.reports()

        val page = reportService.listWdrs()

        page.response().validate()
    }
}
