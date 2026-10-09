// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.llmtokengateway

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.llmtokengateway.usage.UsageRetrieveSummaryParams
import java.time.LocalDate
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class UsageServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieveSummary() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val usageService = client.llmTokenGateway().usage()

        val response =
            usageService.retrieveSummary(
                UsageRetrieveSummaryParams.builder()
                    .endDate(LocalDate.parse("2019-12-27"))
                    .startDate(LocalDate.parse("2019-12-27"))
                    .tokenGroupId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        response.validate()
    }
}
