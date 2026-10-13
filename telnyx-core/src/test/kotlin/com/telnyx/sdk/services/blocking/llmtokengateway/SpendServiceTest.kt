// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.llmtokengateway

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.llmtokengateway.spend.SpendGroupBy
import com.telnyx.sdk.models.llmtokengateway.spend.SpendRetrieveEventsParams
import com.telnyx.sdk.models.llmtokengateway.spend.SpendRetrieveSummaryParams
import java.time.LocalDate
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class SpendServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieveEvents() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val spendService = client.llmTokenGateway().spend()

        val response =
            spendService.retrieveEvents(
                SpendRetrieveEventsParams.builder()
                    .endDate(LocalDate.parse("2019-12-27"))
                    .endUserId("end_user_id")
                    .metadata(
                        SpendRetrieveEventsParams.Metadata.builder()
                            .putAdditionalProperty("foo", "J!Q0Ok0bzJb7")
                            .build()
                    )
                    .pageNumber(1L)
                    .pageSize(1L)
                    .pageSnapshot("page[snapshot]")
                    .startDate(LocalDate.parse("2019-12-27"))
                    .tokenGroupId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .tokenKeyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .tokenUserId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieveSummary() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val spendService = client.llmTokenGateway().spend()

        val response =
            spendService.retrieveSummary(
                SpendRetrieveSummaryParams.builder()
                    .endDate(LocalDate.parse("2019-12-27"))
                    .groupBy(SpendGroupBy.TOKEN_GROUP)
                    .startDate(LocalDate.parse("2019-12-27"))
                    .endUserId("end_user_id")
                    .metadata(
                        SpendRetrieveSummaryParams.Metadata.builder()
                            .putAdditionalProperty("foo", "J!Q0Ok0bzJb7")
                            .build()
                    )
                    .pageNumber(1L)
                    .pageSize(1L)
                    .pageSnapshot("page[snapshot]")
                    .tokenGroupId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .tokenKeyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .tokenUserId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        response.validate()
    }
}
