// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.globalipprotocols

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class GlobalIpProtocolListResponseTest {

    @Test
    fun create() {
        val globalIpProtocolListResponse =
            GlobalIpProtocolListResponse.builder()
                .addData(
                    GlobalIpProtocolListResponse.Data.builder()
                        .code("tcp")
                        .name("TCP")
                        .recordType("global_ip_protocol")
                        .build()
                )
                .build()

        assertThat(globalIpProtocolListResponse.data().getOrNull())
            .containsExactly(
                GlobalIpProtocolListResponse.Data.builder()
                    .code("tcp")
                    .name("TCP")
                    .recordType("global_ip_protocol")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val globalIpProtocolListResponse =
            GlobalIpProtocolListResponse.builder()
                .addData(
                    GlobalIpProtocolListResponse.Data.builder()
                        .code("tcp")
                        .name("TCP")
                        .recordType("global_ip_protocol")
                        .build()
                )
                .build()

        val roundtrippedGlobalIpProtocolListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(globalIpProtocolListResponse),
                jacksonTypeRef<GlobalIpProtocolListResponse>(),
            )

        assertThat(roundtrippedGlobalIpProtocolListResponse).isEqualTo(globalIpProtocolListResponse)
    }
}
