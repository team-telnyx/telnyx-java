// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.messaging.rcs

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RcListBulkCapabilitiesResponseTest {

    @Test
    fun create() {
        val rcListBulkCapabilitiesResponse =
            RcListBulkCapabilitiesResponse.builder()
                .addData(
                    RcsCapabilities.builder()
                        .agentId("TestAgent")
                        .agentName("Testing agent")
                        .addFeature("string")
                        .phoneNumber("+13125551234")
                        .recordType(RcsCapabilities.RecordType.RCS_CAPABILITIES)
                        .build()
                )
                .build()

        assertThat(rcListBulkCapabilitiesResponse.data().getOrNull())
            .containsExactly(
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
        val rcListBulkCapabilitiesResponse =
            RcListBulkCapabilitiesResponse.builder()
                .addData(
                    RcsCapabilities.builder()
                        .agentId("TestAgent")
                        .agentName("Testing agent")
                        .addFeature("string")
                        .phoneNumber("+13125551234")
                        .recordType(RcsCapabilities.RecordType.RCS_CAPABILITIES)
                        .build()
                )
                .build()

        val roundtrippedRcListBulkCapabilitiesResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(rcListBulkCapabilitiesResponse),
                jacksonTypeRef<RcListBulkCapabilitiesResponse>(),
            )

        assertThat(roundtrippedRcListBulkCapabilitiesResponse)
            .isEqualTo(rcListBulkCapabilitiesResponse)
    }
}
