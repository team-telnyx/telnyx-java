// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.llmtokengateway.spend

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SpendRetrieveEventsResponseTest {

    @Test
    fun create() {
        val spendRetrieveEventsResponse =
            SpendRetrieveEventsResponse.builder()
                .addData(
                    SpendRetrieveEventsResponse.Data.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .attempts(0L)
                        .biller(SpendRetrieveEventsResponse.Data.Biller.TELNYX)
                        .cacheHit(true)
                        .configurationVersion(1L)
                        .cost(0.0)
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .endUserId("end_user_id")
                        .inputTokens(0L)
                        .metadata(
                            SpendRetrieveEventsResponse.Data.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("J!Q0Ok0bzJb7"))
                                .build()
                        )
                        .model("model")
                        .outputTokens(0L)
                        .providerKeyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .rateVersion("rate_version")
                        .requestId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .requestedModel("requested_model")
                        .reservationMicroUsd(0L)
                        .status(SpendRetrieveEventsResponse.Data.Status.SUCCEEDED)
                        .tokenGroupId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .tokenKeyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .tokenUserId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .usageStatus(SpendRetrieveEventsResponse.Data.UsageStatus.KNOWN)
                        .build()
                )
                .meta(
                    SpendRetrieveEventsResponse.Meta.builder()
                        .hasMore(true)
                        .pageNumber(1L)
                        .pageSize(1L)
                        .snapshot("snapshot")
                        .build()
                )
                .build()

        assertThat(spendRetrieveEventsResponse.data())
            .containsExactly(
                SpendRetrieveEventsResponse.Data.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .attempts(0L)
                    .biller(SpendRetrieveEventsResponse.Data.Biller.TELNYX)
                    .cacheHit(true)
                    .configurationVersion(1L)
                    .cost(0.0)
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .endUserId("end_user_id")
                    .inputTokens(0L)
                    .metadata(
                        SpendRetrieveEventsResponse.Data.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("J!Q0Ok0bzJb7"))
                            .build()
                    )
                    .model("model")
                    .outputTokens(0L)
                    .providerKeyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .rateVersion("rate_version")
                    .requestId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .requestedModel("requested_model")
                    .reservationMicroUsd(0L)
                    .status(SpendRetrieveEventsResponse.Data.Status.SUCCEEDED)
                    .tokenGroupId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .tokenKeyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .tokenUserId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .usageStatus(SpendRetrieveEventsResponse.Data.UsageStatus.KNOWN)
                    .build()
            )
        assertThat(spendRetrieveEventsResponse.meta())
            .isEqualTo(
                SpendRetrieveEventsResponse.Meta.builder()
                    .hasMore(true)
                    .pageNumber(1L)
                    .pageSize(1L)
                    .snapshot("snapshot")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val spendRetrieveEventsResponse =
            SpendRetrieveEventsResponse.builder()
                .addData(
                    SpendRetrieveEventsResponse.Data.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .attempts(0L)
                        .biller(SpendRetrieveEventsResponse.Data.Biller.TELNYX)
                        .cacheHit(true)
                        .configurationVersion(1L)
                        .cost(0.0)
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .endUserId("end_user_id")
                        .inputTokens(0L)
                        .metadata(
                            SpendRetrieveEventsResponse.Data.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("J!Q0Ok0bzJb7"))
                                .build()
                        )
                        .model("model")
                        .outputTokens(0L)
                        .providerKeyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .rateVersion("rate_version")
                        .requestId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .requestedModel("requested_model")
                        .reservationMicroUsd(0L)
                        .status(SpendRetrieveEventsResponse.Data.Status.SUCCEEDED)
                        .tokenGroupId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .tokenKeyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .tokenUserId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .usageStatus(SpendRetrieveEventsResponse.Data.UsageStatus.KNOWN)
                        .build()
                )
                .meta(
                    SpendRetrieveEventsResponse.Meta.builder()
                        .hasMore(true)
                        .pageNumber(1L)
                        .pageSize(1L)
                        .snapshot("snapshot")
                        .build()
                )
                .build()

        val roundtrippedSpendRetrieveEventsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(spendRetrieveEventsResponse),
                jacksonTypeRef<SpendRetrieveEventsResponse>(),
            )

        assertThat(roundtrippedSpendRetrieveEventsResponse).isEqualTo(spendRetrieveEventsResponse)
    }
}
