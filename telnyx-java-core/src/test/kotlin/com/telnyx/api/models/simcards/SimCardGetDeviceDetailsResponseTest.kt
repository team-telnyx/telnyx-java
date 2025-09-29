// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.simcards

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SimCardGetDeviceDetailsResponseTest {

    @Test
    fun create() {
        val simCardGetDeviceDetailsResponse =
            SimCardGetDeviceDetailsResponse.builder()
                .data(
                    SimCardGetDeviceDetailsResponse.Data.builder()
                        .brandName("Apple")
                        .deviceType("Tablet")
                        .imei("457032284023794")
                        .modelName("iPad Pro 11 2020 Cellular")
                        .operatingSystem("iOS 12")
                        .recordType("device_details")
                        .build()
                )
                .build()

        assertThat(simCardGetDeviceDetailsResponse.data())
            .contains(
                SimCardGetDeviceDetailsResponse.Data.builder()
                    .brandName("Apple")
                    .deviceType("Tablet")
                    .imei("457032284023794")
                    .modelName("iPad Pro 11 2020 Cellular")
                    .operatingSystem("iOS 12")
                    .recordType("device_details")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val simCardGetDeviceDetailsResponse =
            SimCardGetDeviceDetailsResponse.builder()
                .data(
                    SimCardGetDeviceDetailsResponse.Data.builder()
                        .brandName("Apple")
                        .deviceType("Tablet")
                        .imei("457032284023794")
                        .modelName("iPad Pro 11 2020 Cellular")
                        .operatingSystem("iOS 12")
                        .recordType("device_details")
                        .build()
                )
                .build()

        val roundtrippedSimCardGetDeviceDetailsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(simCardGetDeviceDetailsResponse),
                jacksonTypeRef<SimCardGetDeviceDetailsResponse>(),
            )

        assertThat(roundtrippedSimCardGetDeviceDetailsResponse)
            .isEqualTo(simCardGetDeviceDetailsResponse)
    }
}
