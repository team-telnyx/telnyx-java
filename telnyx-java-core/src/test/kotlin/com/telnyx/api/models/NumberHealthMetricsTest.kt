// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NumberHealthMetricsTest {

    @Test
    fun create() {
        val numberHealthMetrics =
            NumberHealthMetrics.builder()
                .inboundOutboundRatio(1.0f)
                .messageCount(10L)
                .spamRatio(10.0f)
                .successRatio(2.0f)
                .build()

        assertThat(numberHealthMetrics.inboundOutboundRatio()).isEqualTo(1.0f)
        assertThat(numberHealthMetrics.messageCount()).isEqualTo(10L)
        assertThat(numberHealthMetrics.spamRatio()).isEqualTo(10.0f)
        assertThat(numberHealthMetrics.successRatio()).isEqualTo(2.0f)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val numberHealthMetrics =
            NumberHealthMetrics.builder()
                .inboundOutboundRatio(1.0f)
                .messageCount(10L)
                .spamRatio(10.0f)
                .successRatio(2.0f)
                .build()

        val roundtrippedNumberHealthMetrics =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(numberHealthMetrics),
                jacksonTypeRef<NumberHealthMetrics>(),
            )

        assertThat(roundtrippedNumberHealthMetrics).isEqualTo(numberHealthMetrics)
    }
}
