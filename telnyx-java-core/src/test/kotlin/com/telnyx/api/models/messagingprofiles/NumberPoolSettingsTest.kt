// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.messagingprofiles

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NumberPoolSettingsTest {

    @Test
    fun create() {
        val numberPoolSettings =
            NumberPoolSettings.builder()
                .longCodeWeight(1.0)
                .skipUnhealthy(true)
                .tollFreeWeight(10.0)
                .geomatch(false)
                .stickySender(false)
                .build()

        assertThat(numberPoolSettings.longCodeWeight()).isEqualTo(1.0)
        assertThat(numberPoolSettings.skipUnhealthy()).isEqualTo(true)
        assertThat(numberPoolSettings.tollFreeWeight()).isEqualTo(10.0)
        assertThat(numberPoolSettings.geomatch()).contains(false)
        assertThat(numberPoolSettings.stickySender()).contains(false)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val numberPoolSettings =
            NumberPoolSettings.builder()
                .longCodeWeight(1.0)
                .skipUnhealthy(true)
                .tollFreeWeight(10.0)
                .geomatch(false)
                .stickySender(false)
                .build()

        val roundtrippedNumberPoolSettings =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(numberPoolSettings),
                jacksonTypeRef<NumberPoolSettings>(),
            )

        assertThat(roundtrippedNumberPoolSettings).isEqualTo(numberPoolSettings)
    }
}
