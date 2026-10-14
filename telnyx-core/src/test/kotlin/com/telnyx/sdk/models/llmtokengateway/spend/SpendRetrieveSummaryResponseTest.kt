// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.llmtokengateway.spend

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SpendRetrieveSummaryResponseTest {

    @Test
    fun create() {
        val spendRetrieveSummaryResponse =
            SpendRetrieveSummaryResponse.builder()
                .addData(
                    SpendRetrieveSummaryResponse.Data.builder()
                        .dimensionId("dimension_id")
                        .inputTokens(0L)
                        .name("name")
                        .outputTokens(0L)
                        .requests(0L)
                        .reservedSpend(0.0)
                        .spend(0.0)
                        .unknownRequests(0L)
                        .endUserId("end_user_id")
                        .metadataKey("metadata_key")
                        .tokenGroupId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .tokenKeyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .tokenUserId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .meta(
                    SpendRetrieveSummaryResponse.Meta.builder()
                        .endDate(LocalDate.parse("2019-12-27"))
                        .groupBy(SpendGroupBy.TOKEN_GROUP)
                        .hasMore(true)
                        .pageNumber(1L)
                        .pageSize(1L)
                        .snapshot("snapshot")
                        .startDate(LocalDate.parse("2019-12-27"))
                        .build()
                )
                .build()

        assertThat(spendRetrieveSummaryResponse.data())
            .containsExactly(
                SpendRetrieveSummaryResponse.Data.builder()
                    .dimensionId("dimension_id")
                    .inputTokens(0L)
                    .name("name")
                    .outputTokens(0L)
                    .requests(0L)
                    .reservedSpend(0.0)
                    .spend(0.0)
                    .unknownRequests(0L)
                    .endUserId("end_user_id")
                    .metadataKey("metadata_key")
                    .tokenGroupId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .tokenKeyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .tokenUserId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
        assertThat(spendRetrieveSummaryResponse.meta())
            .isEqualTo(
                SpendRetrieveSummaryResponse.Meta.builder()
                    .endDate(LocalDate.parse("2019-12-27"))
                    .groupBy(SpendGroupBy.TOKEN_GROUP)
                    .hasMore(true)
                    .pageNumber(1L)
                    .pageSize(1L)
                    .snapshot("snapshot")
                    .startDate(LocalDate.parse("2019-12-27"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val spendRetrieveSummaryResponse =
            SpendRetrieveSummaryResponse.builder()
                .addData(
                    SpendRetrieveSummaryResponse.Data.builder()
                        .dimensionId("dimension_id")
                        .inputTokens(0L)
                        .name("name")
                        .outputTokens(0L)
                        .requests(0L)
                        .reservedSpend(0.0)
                        .spend(0.0)
                        .unknownRequests(0L)
                        .endUserId("end_user_id")
                        .metadataKey("metadata_key")
                        .tokenGroupId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .tokenKeyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .tokenUserId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .meta(
                    SpendRetrieveSummaryResponse.Meta.builder()
                        .endDate(LocalDate.parse("2019-12-27"))
                        .groupBy(SpendGroupBy.TOKEN_GROUP)
                        .hasMore(true)
                        .pageNumber(1L)
                        .pageSize(1L)
                        .snapshot("snapshot")
                        .startDate(LocalDate.parse("2019-12-27"))
                        .build()
                )
                .build()

        val roundtrippedSpendRetrieveSummaryResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(spendRetrieveSummaryResponse),
                jacksonTypeRef<SpendRetrieveSummaryResponse>(),
            )

        assertThat(roundtrippedSpendRetrieveSummaryResponse).isEqualTo(spendRetrieveSummaryResponse)
    }
}
