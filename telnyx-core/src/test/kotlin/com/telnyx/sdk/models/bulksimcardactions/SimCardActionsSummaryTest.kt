// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.bulksimcardactions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SimCardActionsSummaryTest {

    @Test
    fun create() {
        val simCardActionsSummary =
            SimCardActionsSummary.builder()
                .count(0L)
                .status(SimCardActionsSummary.Status.IN_PROGRESS)
                .build()

        assertThat(simCardActionsSummary.count()).contains(0L)
        assertThat(simCardActionsSummary.status())
            .contains(SimCardActionsSummary.Status.IN_PROGRESS)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val simCardActionsSummary =
            SimCardActionsSummary.builder()
                .count(0L)
                .status(SimCardActionsSummary.Status.IN_PROGRESS)
                .build()

        val roundtrippedSimCardActionsSummary =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(simCardActionsSummary),
                jacksonTypeRef<SimCardActionsSummary>(),
            )

        assertThat(roundtrippedSimCardActionsSummary).isEqualTo(simCardActionsSummary)
    }
}
