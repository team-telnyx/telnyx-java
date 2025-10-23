// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.telnyx.sdk.TestServerExtension
import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.chargessummary.ChargesSummaryRetrieveParams
import java.time.LocalDate
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ChargesSummaryServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val chargesSummaryService = client.chargesSummary()

        val chargesSummary =
            chargesSummaryService.retrieve(
                ChargesSummaryRetrieveParams.builder()
                    .endDate(LocalDate.parse("2025-06-01"))
                    .startDate(LocalDate.parse("2025-05-01"))
                    .build()
            )

        chargesSummary.validate()
    }
}
