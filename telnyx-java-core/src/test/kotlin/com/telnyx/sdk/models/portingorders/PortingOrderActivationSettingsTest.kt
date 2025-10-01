// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.portingorders

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PortingOrderActivationSettingsTest {

    @Test
    fun create() {
        val portingOrderActivationSettings =
            PortingOrderActivationSettings.builder()
                .activationStatus(PortingOrderActivationSettings.ActivationStatus.ACTIVE)
                .fastPortEligible(true)
                .focDatetimeActual(OffsetDateTime.parse("2021-03-19T10:07:15.527Z"))
                .focDatetimeRequested(OffsetDateTime.parse("2021-03-19T10:07:15.527Z"))
                .build()

        assertThat(portingOrderActivationSettings.activationStatus())
            .contains(PortingOrderActivationSettings.ActivationStatus.ACTIVE)
        assertThat(portingOrderActivationSettings.fastPortEligible()).contains(true)
        assertThat(portingOrderActivationSettings.focDatetimeActual())
            .contains(OffsetDateTime.parse("2021-03-19T10:07:15.527Z"))
        assertThat(portingOrderActivationSettings.focDatetimeRequested())
            .contains(OffsetDateTime.parse("2021-03-19T10:07:15.527Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val portingOrderActivationSettings =
            PortingOrderActivationSettings.builder()
                .activationStatus(PortingOrderActivationSettings.ActivationStatus.ACTIVE)
                .fastPortEligible(true)
                .focDatetimeActual(OffsetDateTime.parse("2021-03-19T10:07:15.527Z"))
                .focDatetimeRequested(OffsetDateTime.parse("2021-03-19T10:07:15.527Z"))
                .build()

        val roundtrippedPortingOrderActivationSettings =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(portingOrderActivationSettings),
                jacksonTypeRef<PortingOrderActivationSettings>(),
            )

        assertThat(roundtrippedPortingOrderActivationSettings)
            .isEqualTo(portingOrderActivationSettings)
    }
}
