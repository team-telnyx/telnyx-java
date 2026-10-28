// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.spendlimits

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SpendLimitBlockTest {

    @Test
    fun create() {
        val spendLimitBlock =
            SpendLimitBlock.builder()
                .blockedUntil(LocalDate.parse("2026-09-25"))
                .detectedAt(OffsetDateTime.parse("2026-09-24T08:41:17Z"))
                .limitUsd("10")
                .spendUsd("10.20")
                .build()

        assertThat(spendLimitBlock.blockedUntil()).isEqualTo(LocalDate.parse("2026-09-25"))
        assertThat(spendLimitBlock.detectedAt())
            .isEqualTo(OffsetDateTime.parse("2026-09-24T08:41:17Z"))
        assertThat(spendLimitBlock.limitUsd()).isEqualTo("10")
        assertThat(spendLimitBlock.spendUsd()).isEqualTo("10.20")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val spendLimitBlock =
            SpendLimitBlock.builder()
                .blockedUntil(LocalDate.parse("2026-09-25"))
                .detectedAt(OffsetDateTime.parse("2026-09-24T08:41:17Z"))
                .limitUsd("10")
                .spendUsd("10.20")
                .build()

        val roundtrippedSpendLimitBlock =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(spendLimitBlock),
                jacksonTypeRef<SpendLimitBlock>(),
            )

        assertThat(roundtrippedSpendLimitBlock).isEqualTo(spendLimitBlock)
    }
}
