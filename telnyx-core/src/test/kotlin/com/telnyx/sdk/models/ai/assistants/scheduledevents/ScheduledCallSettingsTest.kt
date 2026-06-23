// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.assistants.scheduledevents

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ScheduledCallSettingsTest {

    @Test
    fun create() {
        val scheduledCallSettings =
            ScheduledCallSettings.builder().sipRegion(ScheduledCallSettings.SipRegion.US).build()

        assertThat(scheduledCallSettings.sipRegion()).contains(ScheduledCallSettings.SipRegion.US)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val scheduledCallSettings =
            ScheduledCallSettings.builder().sipRegion(ScheduledCallSettings.SipRegion.US).build()

        val roundtrippedScheduledCallSettings =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(scheduledCallSettings),
                jacksonTypeRef<ScheduledCallSettings>(),
            )

        assertThat(roundtrippedScheduledCallSettings).isEqualTo(scheduledCallSettings)
    }
}
