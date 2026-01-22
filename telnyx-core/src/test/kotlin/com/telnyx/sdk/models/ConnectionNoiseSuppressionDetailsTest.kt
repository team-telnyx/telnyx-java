// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ConnectionNoiseSuppressionDetailsTest {

    @Test
    fun create() {
        val connectionNoiseSuppressionDetails =
            ConnectionNoiseSuppressionDetails.builder()
                .attenuationLimit(80L)
                .engine(ConnectionNoiseSuppressionDetails.Engine.DEEP_FILTER_NET)
                .build()

        assertThat(connectionNoiseSuppressionDetails.attenuationLimit()).contains(80L)
        assertThat(connectionNoiseSuppressionDetails.engine())
            .contains(ConnectionNoiseSuppressionDetails.Engine.DEEP_FILTER_NET)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val connectionNoiseSuppressionDetails =
            ConnectionNoiseSuppressionDetails.builder()
                .attenuationLimit(80L)
                .engine(ConnectionNoiseSuppressionDetails.Engine.DEEP_FILTER_NET)
                .build()

        val roundtrippedConnectionNoiseSuppressionDetails =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(connectionNoiseSuppressionDetails),
                jacksonTypeRef<ConnectionNoiseSuppressionDetails>(),
            )

        assertThat(roundtrippedConnectionNoiseSuppressionDetails)
            .isEqualTo(connectionNoiseSuppressionDetails)
    }
}
