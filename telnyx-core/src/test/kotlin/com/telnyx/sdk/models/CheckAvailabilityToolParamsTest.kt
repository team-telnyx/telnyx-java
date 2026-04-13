// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CheckAvailabilityToolParamsTest {

    @Test
    fun create() {
        val checkAvailabilityToolParams =
            CheckAvailabilityToolParams.builder()
                .apiKeyRef("my_calcom_api_key")
                .eventTypeId(0L)
                .build()

        assertThat(checkAvailabilityToolParams.apiKeyRef()).isEqualTo("my_calcom_api_key")
        assertThat(checkAvailabilityToolParams.eventTypeId()).isEqualTo(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val checkAvailabilityToolParams =
            CheckAvailabilityToolParams.builder()
                .apiKeyRef("my_calcom_api_key")
                .eventTypeId(0L)
                .build()

        val roundtrippedCheckAvailabilityToolParams =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(checkAvailabilityToolParams),
                jacksonTypeRef<CheckAvailabilityToolParams>(),
            )

        assertThat(roundtrippedCheckAvailabilityToolParams).isEqualTo(checkAvailabilityToolParams)
    }
}
