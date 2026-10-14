// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.llmtokengateway

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.llmtokengateway.usage.UsageRetrieveExportParams
import com.telnyx.sdk.models.llmtokengateway.usage.UsageRetrieveSummaryParams
import java.time.LocalDate
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class UsageServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieveExport() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val usageService = client.llmTokenGateway().usage()

        val response =
            usageService.retrieveExport(
                UsageRetrieveExportParams.builder()
                    .cursor("cursor")
                    .limit(1L)
                    .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .types("types")
                    .build()
            )

        response.validate()
    }

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
                    .metadata(
                        UsageRetrieveSummaryParams.Metadata.builder()
                            .putAdditionalProperty("foo", "J!Q0Ok0bzJb7")
                            .build()
                    )
                    .build()
            )

        response.validate()
    }
}
