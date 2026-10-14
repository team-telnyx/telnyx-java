// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.spendlimits

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SpendLimitListResponseTest {

    @Test
    fun create() {
        val spendLimitListResponse =
            SpendLimitListResponse.builder()
                .addData(
                    SpendLimit.builder()
                        .block(
                            SpendLimit.Block.builder()
                                .blockedUntil(LocalDate.parse("2026-09-25"))
                                .detectedAt(OffsetDateTime.parse("2026-09-24T08:41:17Z"))
                                .limitUsd("10")
                                .spendUsd("10.20")
                                .build()
                        )
                        .blocked(false)
                        .effectiveLimitUsd("100")
                        .limit(
                            SpendLimit.Limit.builder()
                                .amount("100")
                                .origin(SpendLimit.Limit.Origin.SELF_SERVICE)
                                .unlimited(false)
                                .updatedAt(OffsetDateTime.parse("2026-09-24T09:12:03.412Z"))
                                .build()
                        )
                        .period(SpendLimitPeriod.DAILY)
                        .periodEnd(LocalDate.parse("2026-09-25"))
                        .periodStart(LocalDate.parse("2026-09-24"))
                        .product("inference")
                        .productName("Inference")
                        .recordType("spend_limit")
                        .spendError(null)
                        .spendUsd("37.41")
                        .evaluation(
                            SpendLimit.Evaluation.builder()
                                .blockedNow(false)
                                .evaluationDeferred(false)
                                .released(false)
                                .spendUsd("37.41")
                                .stillBlockedOtherPeriod(false)
                                .stillOverLimit(false)
                                .note(
                                    "A block was lifted by Telnyx support today; this limit applies from tomorrow."
                                )
                                .build()
                        )
                        .build()
                )
                .meta(
                    SpendLimitListResponse.Meta.builder()
                        .pageNumber(1L)
                        .pageSize(2L)
                        .totalPages(1L)
                        .totalResults(2L)
                        .build()
                )
                .build()

        assertThat(spendLimitListResponse.data())
            .containsExactly(
                SpendLimit.builder()
                    .block(
                        SpendLimit.Block.builder()
                            .blockedUntil(LocalDate.parse("2026-09-25"))
                            .detectedAt(OffsetDateTime.parse("2026-09-24T08:41:17Z"))
                            .limitUsd("10")
                            .spendUsd("10.20")
                            .build()
                    )
                    .blocked(false)
                    .effectiveLimitUsd("100")
                    .limit(
                        SpendLimit.Limit.builder()
                            .amount("100")
                            .origin(SpendLimit.Limit.Origin.SELF_SERVICE)
                            .unlimited(false)
                            .updatedAt(OffsetDateTime.parse("2026-09-24T09:12:03.412Z"))
                            .build()
                    )
                    .period(SpendLimitPeriod.DAILY)
                    .periodEnd(LocalDate.parse("2026-09-25"))
                    .periodStart(LocalDate.parse("2026-09-24"))
                    .product("inference")
                    .productName("Inference")
                    .recordType("spend_limit")
                    .spendError(null)
                    .spendUsd("37.41")
                    .evaluation(
                        SpendLimit.Evaluation.builder()
                            .blockedNow(false)
                            .evaluationDeferred(false)
                            .released(false)
                            .spendUsd("37.41")
                            .stillBlockedOtherPeriod(false)
                            .stillOverLimit(false)
                            .note(
                                "A block was lifted by Telnyx support today; this limit applies from tomorrow."
                            )
                            .build()
                    )
                    .build()
            )
        assertThat(spendLimitListResponse.meta())
            .contains(
                SpendLimitListResponse.Meta.builder()
                    .pageNumber(1L)
                    .pageSize(2L)
                    .totalPages(1L)
                    .totalResults(2L)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val spendLimitListResponse =
            SpendLimitListResponse.builder()
                .addData(
                    SpendLimit.builder()
                        .block(
                            SpendLimit.Block.builder()
                                .blockedUntil(LocalDate.parse("2026-09-25"))
                                .detectedAt(OffsetDateTime.parse("2026-09-24T08:41:17Z"))
                                .limitUsd("10")
                                .spendUsd("10.20")
                                .build()
                        )
                        .blocked(false)
                        .effectiveLimitUsd("100")
                        .limit(
                            SpendLimit.Limit.builder()
                                .amount("100")
                                .origin(SpendLimit.Limit.Origin.SELF_SERVICE)
                                .unlimited(false)
                                .updatedAt(OffsetDateTime.parse("2026-09-24T09:12:03.412Z"))
                                .build()
                        )
                        .period(SpendLimitPeriod.DAILY)
                        .periodEnd(LocalDate.parse("2026-09-25"))
                        .periodStart(LocalDate.parse("2026-09-24"))
                        .product("inference")
                        .productName("Inference")
                        .recordType("spend_limit")
                        .spendError(null)
                        .spendUsd("37.41")
                        .evaluation(
                            SpendLimit.Evaluation.builder()
                                .blockedNow(false)
                                .evaluationDeferred(false)
                                .released(false)
                                .spendUsd("37.41")
                                .stillBlockedOtherPeriod(false)
                                .stillOverLimit(false)
                                .note(
                                    "A block was lifted by Telnyx support today; this limit applies from tomorrow."
                                )
                                .build()
                        )
                        .build()
                )
                .meta(
                    SpendLimitListResponse.Meta.builder()
                        .pageNumber(1L)
                        .pageSize(2L)
                        .totalPages(1L)
                        .totalResults(2L)
                        .build()
                )
                .build()

        val roundtrippedSpendLimitListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(spendLimitListResponse),
                jacksonTypeRef<SpendLimitListResponse>(),
            )

        assertThat(roundtrippedSpendLimitListResponse).isEqualTo(spendLimitListResponse)
    }
}
