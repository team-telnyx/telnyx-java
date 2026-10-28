// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.tunnels

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TunnelWithTokenTest {

    @Test
    fun create() {
        val tunnelWithToken =
            TunnelWithToken.builder()
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
                .tunnelToken("tnl_example-token-shown-once")
                .build()

        assertThat(tunnelWithToken.id()).contains("62d438d2-8a51-4c5e-9d0c-1f6b2a7e4c39")
        assertThat(tunnelWithToken.connectionCount()).contains(2L)
        assertThat(tunnelWithToken.connections().getOrNull())
            .containsExactly(
                Tunnel.Connection.builder()
                    .connectedAt(OffsetDateTime.parse("2026-10-21T15:04:05.123456Z"))
                    .hostname("dc1-tunnel-a")
                    .regionCode("chicago-il")
                    .version("0.6.0")
                    .build()
            )
        assertThat(tunnelWithToken.createdAt())
            .contains(OffsetDateTime.parse("2026-10-21T15:04:05.123456Z"))
        assertThat(tunnelWithToken.name()).contains("chicago-dc")
        assertThat(tunnelWithToken.recordType()).contains("tunnel")
        assertThat(tunnelWithToken.status()).contains(Tunnel.Status.HEALTHY)
        assertThat(tunnelWithToken.tunnelToken()).contains("tnl_example-token-shown-once")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val tunnelWithToken =
            TunnelWithToken.builder()
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
                .tunnelToken("tnl_example-token-shown-once")
                .build()

        val roundtrippedTunnelWithToken =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(tunnelWithToken),
                jacksonTypeRef<TunnelWithToken>(),
            )

        assertThat(roundtrippedTunnelWithToken).isEqualTo(tunnelWithToken)
    }
}
