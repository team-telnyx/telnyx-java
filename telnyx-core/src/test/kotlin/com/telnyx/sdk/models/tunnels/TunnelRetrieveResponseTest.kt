// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.tunnels

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TunnelRetrieveResponseTest {

    @Test
    fun create() {
        val tunnelRetrieveResponse =
            TunnelRetrieveResponse.builder()
                .data(
                    Tunnel.builder()
                        .id("62d438d2-8a51-4c5e-9d0c-1f6b2a7e4c39")
                        .connectionCount(2L)
                        .addConnection(
                            Tunnel.Connection.builder()
                                .connectedAt(OffsetDateTime.parse("2026-10-21T15:04:05.123456Z"))
                                .hostname("dc1-tunnel-a")
                                .regionCode("chicago-il")
                                .version("0.6.0")
                                .build()
                        )
                        .createdAt(OffsetDateTime.parse("2026-10-21T15:04:05.123456Z"))
                        .name("chicago-dc")
                        .recordType("tunnel")
                        .status(Tunnel.Status.HEALTHY)
                        .build()
                )
                .build()

        assertThat(tunnelRetrieveResponse.data())
            .contains(
                Tunnel.builder()
                    .id("62d438d2-8a51-4c5e-9d0c-1f6b2a7e4c39")
                    .connectionCount(2L)
                    .addConnection(
                        Tunnel.Connection.builder()
                            .connectedAt(OffsetDateTime.parse("2026-10-21T15:04:05.123456Z"))
                            .hostname("dc1-tunnel-a")
                            .regionCode("chicago-il")
                            .version("0.6.0")
                            .build()
                    )
                    .createdAt(OffsetDateTime.parse("2026-10-21T15:04:05.123456Z"))
                    .name("chicago-dc")
                    .recordType("tunnel")
                    .status(Tunnel.Status.HEALTHY)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val tunnelRetrieveResponse =
            TunnelRetrieveResponse.builder()
                .data(
                    Tunnel.builder()
                        .id("62d438d2-8a51-4c5e-9d0c-1f6b2a7e4c39")
                        .connectionCount(2L)
                        .addConnection(
                            Tunnel.Connection.builder()
                                .connectedAt(OffsetDateTime.parse("2026-10-21T15:04:05.123456Z"))
                                .hostname("dc1-tunnel-a")
                                .regionCode("chicago-il")
                                .version("0.6.0")
                                .build()
                        )
                        .createdAt(OffsetDateTime.parse("2026-10-21T15:04:05.123456Z"))
                        .name("chicago-dc")
                        .recordType("tunnel")
                        .status(Tunnel.Status.HEALTHY)
                        .build()
                )
                .build()

        val roundtrippedTunnelRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(tunnelRetrieveResponse),
                jacksonTypeRef<TunnelRetrieveResponse>(),
            )

        assertThat(roundtrippedTunnelRetrieveResponse).isEqualTo(tunnelRetrieveResponse)
    }
}
