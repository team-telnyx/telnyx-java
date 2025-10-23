// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.TestServerExtension
import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.chargesbreakdown.ChargesBreakdownRetrieveParams
import java.time.LocalDate
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ChargesBreakdownServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val chargesBreakdownServiceAsync = client.chargesBreakdown()

        val chargesBreakdownFuture =
            chargesBreakdownServiceAsync.retrieve(
                ChargesBreakdownRetrieveParams.builder()
                    .startDate(LocalDate.parse("2025-05-01"))
                    .endDate(LocalDate.parse("2025-06-01"))
                    .format(ChargesBreakdownRetrieveParams.Format.JSON)
                    .build()
            )

        val chargesBreakdown = chargesBreakdownFuture.get()
        chargesBreakdown.validate()
    }
}
