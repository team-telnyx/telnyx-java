// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.assistants.canarydeploys

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RolloutSlotTest {

    @Test
    fun create() {
        val rolloutSlot = RolloutSlot.builder().versionId("version_id").weight(0.0).build()

        assertThat(rolloutSlot.versionId()).isEqualTo("version_id")
        assertThat(rolloutSlot.weight()).isEqualTo(0.0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val rolloutSlot = RolloutSlot.builder().versionId("version_id").weight(0.0).build()

        val roundtrippedRolloutSlot =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(rolloutSlot),
                jacksonTypeRef<RolloutSlot>(),
            )

        assertThat(roundtrippedRolloutSlot).isEqualTo(rolloutSlot)
    }
}
