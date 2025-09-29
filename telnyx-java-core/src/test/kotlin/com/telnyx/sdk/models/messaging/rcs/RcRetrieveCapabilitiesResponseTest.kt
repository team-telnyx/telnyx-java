// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.messaging.rcs

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RcRetrieveCapabilitiesResponseTest {

    @Test
    fun create() {
        val rcRetrieveCapabilitiesResponse =
            RcRetrieveCapabilitiesResponse.builder()
                .data(
                    RcsCapabilities.builder()
                        .agentId("TestAgent")
                        .agentName("Testing agent")
                        .addFeature("string")
                        .phoneNumber("+13125551234")
                        .recordType(RcsCapabilities.RecordType.RCS_CAPABILITIES)
                        .build()
                )
                .build()

        assertThat(rcRetrieveCapabilitiesResponse.data())
            .contains(
                RcsCapabilities.builder()
                    .agentId("TestAgent")
                    .agentName("Testing agent")
                    .addFeature("string")
                    .phoneNumber("+13125551234")
                    .recordType(RcsCapabilities.RecordType.RCS_CAPABILITIES)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val rcRetrieveCapabilitiesResponse =
            RcRetrieveCapabilitiesResponse.builder()
                .data(
                    RcsCapabilities.builder()
                        .agentId("TestAgent")
                        .agentName("Testing agent")
                        .addFeature("string")
                        .phoneNumber("+13125551234")
                        .recordType(RcsCapabilities.RecordType.RCS_CAPABILITIES)
                        .build()
                )
                .build()

        val roundtrippedRcRetrieveCapabilitiesResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(rcRetrieveCapabilitiesResponse),
                jacksonTypeRef<RcRetrieveCapabilitiesResponse>(),
            )

        assertThat(roundtrippedRcRetrieveCapabilitiesResponse)
            .isEqualTo(rcRetrieveCapabilitiesResponse)
    }
}
