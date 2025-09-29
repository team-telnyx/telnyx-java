// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async

import com.telnyx.api.TestServerExtension
import com.telnyx.api.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.api.models.ledgerbillinggroupreports.LedgerBillingGroupReportCreateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class LedgerBillingGroupReportServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val ledgerBillingGroupReportServiceAsync = client.ledgerBillingGroupReports()

        val ledgerBillingGroupReportFuture =
            ledgerBillingGroupReportServiceAsync.create(
                LedgerBillingGroupReportCreateParams.builder().month(10L).year(2019L).build()
            )

        val ledgerBillingGroupReport = ledgerBillingGroupReportFuture.get()
        ledgerBillingGroupReport.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val ledgerBillingGroupReportServiceAsync = client.ledgerBillingGroupReports()

        val ledgerBillingGroupReportFuture =
            ledgerBillingGroupReportServiceAsync.retrieve("f5586561-8ff0-4291-a0ac-84fe544797bd")

        val ledgerBillingGroupReport = ledgerBillingGroupReportFuture.get()
        ledgerBillingGroupReport.validate()
    }
}
