// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async

import com.telnyx.api.TestServerExtension
import com.telnyx.api.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.api.models.chargessummary.ChargesSummaryRetrieveParams
import java.time.LocalDate
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ChargesSummaryServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val chargesSummaryServiceAsync = client.chargesSummary()

        val chargesSummaryFuture =
            chargesSummaryServiceAsync.retrieve(
                ChargesSummaryRetrieveParams.builder()
                    .endDate(LocalDate.parse("2025-06-01"))
                    .startDate(LocalDate.parse("2025-05-01"))
                    .build()
            )

        val chargesSummary = chargesSummaryFuture.get()
        chargesSummary.validate()
    }
}
