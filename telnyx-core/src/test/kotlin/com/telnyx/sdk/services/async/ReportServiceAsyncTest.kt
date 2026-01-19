// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.TestServerExtension
import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.reports.ReportListMdrsParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ReportServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun listMdrs() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val reportServiceAsync = client.reports()

        val responseFuture =
            reportServiceAsync.listMdrs(
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

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun listWdrs() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val reportServiceAsync = client.reports()

        val pageFuture = reportServiceAsync.listWdrs()

        val page = pageFuture.get()
        page.response().validate()
    }
}
