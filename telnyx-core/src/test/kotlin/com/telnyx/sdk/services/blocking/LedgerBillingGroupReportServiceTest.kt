// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.ledgerbillinggroupreports.LedgerBillingGroupReportCreateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class LedgerBillingGroupReportServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val ledgerBillingGroupReportService = client.ledgerBillingGroupReports()

        val ledgerBillingGroupReport =
            ledgerBillingGroupReportService.create(
                LedgerBillingGroupReportCreateParams.builder().month(10L).year(2019L).build()
            )

        ledgerBillingGroupReport.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val ledgerBillingGroupReportService = client.ledgerBillingGroupReports()

        val ledgerBillingGroupReport =
            ledgerBillingGroupReportService.retrieve("f5586561-8ff0-4291-a0ac-84fe544797bd")

        ledgerBillingGroupReport.validate()
    }
}
