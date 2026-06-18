// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.calls.actions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InterruptionSettingsTest {

    @Test
    fun create() {
        val interruptionSettings = InterruptionSettings.builder().enable(true).build()

        assertThat(interruptionSettings.enable()).contains(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val interruptionSettings = InterruptionSettings.builder().enable(true).build()

        val roundtrippedInterruptionSettings =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(interruptionSettings),
                jacksonTypeRef<InterruptionSettings>(),
            )

        assertThat(roundtrippedInterruptionSettings).isEqualTo(interruptionSettings)
    }
}
