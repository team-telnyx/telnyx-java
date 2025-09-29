// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.globalipallowedports

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class GlobalIpAllowedPortListResponseTest {

    @Test
    fun create() {
        val globalIpAllowedPortListResponse =
            GlobalIpAllowedPortListResponse.builder()
                .addData(
                    GlobalIpAllowedPortListResponse.Data.builder()
                        .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                        .firstPort(1024L)
                        .lastPort(49151L)
                        .name("TCP Registered")
                        .protocolCode("tcp")
                        .recordType("global_ip_allowed_port")
                        .build()
                )
                .build()

        assertThat(globalIpAllowedPortListResponse.data().getOrNull())
            .containsExactly(
                GlobalIpAllowedPortListResponse.Data.builder()
                    .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                    .firstPort(1024L)
                    .lastPort(49151L)
                    .name("TCP Registered")
                    .protocolCode("tcp")
                    .recordType("global_ip_allowed_port")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val globalIpAllowedPortListResponse =
            GlobalIpAllowedPortListResponse.builder()
                .addData(
                    GlobalIpAllowedPortListResponse.Data.builder()
                        .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                        .firstPort(1024L)
                        .lastPort(49151L)
                        .name("TCP Registered")
                        .protocolCode("tcp")
                        .recordType("global_ip_allowed_port")
                        .build()
                )
                .build()

        val roundtrippedGlobalIpAllowedPortListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(globalIpAllowedPortListResponse),
                jacksonTypeRef<GlobalIpAllowedPortListResponse>(),
            )

        assertThat(roundtrippedGlobalIpAllowedPortListResponse)
            .isEqualTo(globalIpAllowedPortListResponse)
    }
}
