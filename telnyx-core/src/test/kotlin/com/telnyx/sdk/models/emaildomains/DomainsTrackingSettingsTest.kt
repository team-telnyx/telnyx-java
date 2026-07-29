// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.emaildomains

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DomainsTrackingSettingsTest {

    @Test
    fun create() {
        val domainsTrackingSettings =
            DomainsTrackingSettings.builder()
                .clickTracking(true)
                .openTracking(true)
                .unsubscribeTracking(true)
                .build()

        assertThat(domainsTrackingSettings.clickTracking()).contains(true)
        assertThat(domainsTrackingSettings.openTracking()).contains(true)
        assertThat(domainsTrackingSettings.unsubscribeTracking()).contains(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val domainsTrackingSettings =
            DomainsTrackingSettings.builder()
                .clickTracking(true)
                .openTracking(true)
                .unsubscribeTracking(true)
                .build()

        val roundtrippedDomainsTrackingSettings =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(domainsTrackingSettings),
                jacksonTypeRef<DomainsTrackingSettings>(),
            )

        assertThat(roundtrippedDomainsTrackingSettings).isEqualTo(domainsTrackingSettings)
    }
}
