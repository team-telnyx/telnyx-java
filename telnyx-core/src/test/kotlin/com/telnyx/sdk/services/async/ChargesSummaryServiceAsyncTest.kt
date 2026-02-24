// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.chargessummary.ChargesSummaryRetrieveParams
import java.time.LocalDate
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ChargesSummaryServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
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
