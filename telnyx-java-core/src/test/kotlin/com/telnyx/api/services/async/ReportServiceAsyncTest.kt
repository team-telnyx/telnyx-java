// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async

import com.telnyx.api.TestServerExtension
import com.telnyx.api.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.api.models.reports.ReportListMdrsParams
import com.telnyx.api.models.reports.ReportListWdrsParams
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

        val responseFuture =
            reportServiceAsync.listWdrs(
                ReportListWdrsParams.builder()
                    .id("e093fbe0-5bde-11eb-ae93-0242ac130002")
                    .endDate("2021-06-01T00:00:00Z")
                    .imsi("123456")
                    .mcc("204")
                    .mnc("01")
                    .page(ReportListWdrsParams.Page.builder().number(0).size(0).build())
                    .phoneNumber("+12345678910")
                    .simCardId("877f80a6-e5b2-4687-9a04-88076265720f")
                    .simGroupId("f05a189f-7c46-4531-ac56-1460dc465a42")
                    .simGroupName("sim name")
                    .addSort("string")
                    .startDate("2021-05-01T00:00:00Z")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
