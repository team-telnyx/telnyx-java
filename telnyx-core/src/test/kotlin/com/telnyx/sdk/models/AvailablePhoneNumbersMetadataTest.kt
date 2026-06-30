// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AvailablePhoneNumbersMetadataTest {

    @Test
    fun create() {
        val availablePhoneNumbersMetadata =
            AvailablePhoneNumbersMetadata.builder()
                .bestEffortResults(50L)
                .totalResults(100L)
                .build()

        assertThat(availablePhoneNumbersMetadata.bestEffortResults()).contains(50L)
        assertThat(availablePhoneNumbersMetadata.totalResults()).contains(100L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val availablePhoneNumbersMetadata =
            AvailablePhoneNumbersMetadata.builder()
                .bestEffortResults(50L)
                .totalResults(100L)
                .build()

        val roundtrippedAvailablePhoneNumbersMetadata =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(availablePhoneNumbersMetadata),
                jacksonTypeRef<AvailablePhoneNumbersMetadata>(),
            )

        assertThat(roundtrippedAvailablePhoneNumbersMetadata)
            .isEqualTo(availablePhoneNumbersMetadata)
    }
}
