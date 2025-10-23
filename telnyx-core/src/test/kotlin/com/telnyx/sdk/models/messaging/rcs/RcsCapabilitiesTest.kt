// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.messaging.rcs

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RcsCapabilitiesTest {

    @Test
    fun create() {
        val rcsCapabilities =
            RcsCapabilities.builder()
                .agentId("TestAgent")
                .agentName("Testing agent")
                .addFeature("string")
                .phoneNumber("+13125551234")
                .recordType(RcsCapabilities.RecordType.RCS_CAPABILITIES)
                .build()

        assertThat(rcsCapabilities.agentId()).contains("TestAgent")
        assertThat(rcsCapabilities.agentName()).contains("Testing agent")
        assertThat(rcsCapabilities.features().getOrNull()).containsExactly("string")
        assertThat(rcsCapabilities.phoneNumber()).contains("+13125551234")
        assertThat(rcsCapabilities.recordType())
            .contains(RcsCapabilities.RecordType.RCS_CAPABILITIES)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val rcsCapabilities =
            RcsCapabilities.builder()
                .agentId("TestAgent")
                .agentName("Testing agent")
                .addFeature("string")
                .phoneNumber("+13125551234")
                .recordType(RcsCapabilities.RecordType.RCS_CAPABILITIES)
                .build()

        val roundtrippedRcsCapabilities =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(rcsCapabilities),
                jacksonTypeRef<RcsCapabilities>(),
            )

        assertThat(roundtrippedRcsCapabilities).isEqualTo(rcsCapabilities)
    }
}
