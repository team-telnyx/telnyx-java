// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.emailmessages

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TrackingSettingsTest {

    @Test
    fun create() {
        val trackingSettings =
            TrackingSettings.builder().clickTracking(true).openTracking(true).build()

        assertThat(trackingSettings.clickTracking()).contains(true)
        assertThat(trackingSettings.openTracking()).contains(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val trackingSettings =
            TrackingSettings.builder().clickTracking(true).openTracking(true).build()

        val roundtrippedTrackingSettings =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(trackingSettings),
                jacksonTypeRef<TrackingSettings>(),
            )

        assertThat(roundtrippedTrackingSettings).isEqualTo(trackingSettings)
    }
}
