// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.privatewirelessgateways

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PwgAssignedResourcesSummaryTest {

    @Test
    fun create() {
        val pwgAssignedResourcesSummary =
            PwgAssignedResourcesSummary.builder().count(1L).recordType("sim_card_group").build()

        assertThat(pwgAssignedResourcesSummary.count()).contains(1L)
        assertThat(pwgAssignedResourcesSummary.recordType()).contains("sim_card_group")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val pwgAssignedResourcesSummary =
            PwgAssignedResourcesSummary.builder().count(1L).recordType("sim_card_group").build()

        val roundtrippedPwgAssignedResourcesSummary =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(pwgAssignedResourcesSummary),
                jacksonTypeRef<PwgAssignedResourcesSummary>(),
            )

        assertThat(roundtrippedPwgAssignedResourcesSummary).isEqualTo(pwgAssignedResourcesSummary)
    }
}
