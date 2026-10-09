// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.spendlimits

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SpendLimitResponseTest {

    @Test
    fun create() {
        val spendLimitResponse =
            SpendLimitResponse.builder()
                .data(
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
                .build()

        assertThat(spendLimitResponse.data())
            .isEqualTo(
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
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val spendLimitResponse =
            SpendLimitResponse.builder()
                .data(
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
                .build()

        val roundtrippedSpendLimitResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(spendLimitResponse),
                jacksonTypeRef<SpendLimitResponse>(),
            )

        assertThat(roundtrippedSpendLimitResponse).isEqualTo(spendLimitResponse)
    }
}
