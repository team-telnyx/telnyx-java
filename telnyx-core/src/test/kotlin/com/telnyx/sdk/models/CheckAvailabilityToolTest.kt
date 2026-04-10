// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CheckAvailabilityToolTest {

    @Test
    fun create() {
        val checkAvailabilityTool =
            CheckAvailabilityTool.builder()
                .checkAvailability(
                    CheckAvailabilityToolParams.builder()
                        .apiKeyRef("my_calcom_api_key")
                        .eventTypeId(0L)
                        .build()
                )
                .type(CheckAvailabilityTool.Type.CHECK_AVAILABILITY)
                .build()

        assertThat(checkAvailabilityTool.checkAvailability())
            .isEqualTo(
                CheckAvailabilityToolParams.builder()
                    .apiKeyRef("my_calcom_api_key")
                    .eventTypeId(0L)
                    .build()
            )
        assertThat(checkAvailabilityTool.type())
            .isEqualTo(CheckAvailabilityTool.Type.CHECK_AVAILABILITY)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val checkAvailabilityTool =
            CheckAvailabilityTool.builder()
                .checkAvailability(
                    CheckAvailabilityToolParams.builder()
                        .apiKeyRef("my_calcom_api_key")
                        .eventTypeId(0L)
                        .build()
                )
                .type(CheckAvailabilityTool.Type.CHECK_AVAILABILITY)
                .build()

        val roundtrippedCheckAvailabilityTool =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(checkAvailabilityTool),
                jacksonTypeRef<CheckAvailabilityTool>(),
            )

        assertThat(roundtrippedCheckAvailabilityTool).isEqualTo(checkAvailabilityTool)
    }
}
