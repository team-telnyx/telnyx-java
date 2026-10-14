// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.llmtokengateway

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.llmtokengateway.usage.UsageRetrieveExportParams
import com.telnyx.sdk.models.llmtokengateway.usage.UsageRetrieveSummaryParams
import java.time.LocalDate
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class UsageServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieveExport() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val usageServiceAsync = client.llmTokenGateway().usage()

        val responseFuture =
            usageServiceAsync.retrieveExport(
                UsageRetrieveExportParams.builder()
                    .cursor("cursor")
                    .limit(1L)
                    .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .types("types")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieveSummary() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val usageServiceAsync = client.llmTokenGateway().usage()

        val responseFuture =
            usageServiceAsync.retrieveSummary(
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

        val response = responseFuture.get()
        response.validate()
    }
}
