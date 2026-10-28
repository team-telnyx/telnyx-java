// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.tunnels

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TunnelTest {

    @Test
    fun create() {
        val tunnel =
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

        assertThat(tunnel.id()).contains("62d438d2-8a51-4c5e-9d0c-1f6b2a7e4c39")
        assertThat(tunnel.connectionCount()).contains(2L)
        assertThat(tunnel.connections().getOrNull())
            .containsExactly(
                Tunnel.Connection.builder()
                    .connectedAt(OffsetDateTime.parse("2026-10-21T15:04:05.123456Z"))
                    .hostname("dc1-tunnel-a")
                    .regionCode("chicago-il")
                    .version("0.6.0")
                    .build()
            )
        assertThat(tunnel.createdAt()).contains(OffsetDateTime.parse("2026-10-21T15:04:05.123456Z"))
        assertThat(tunnel.name()).contains("chicago-dc")
        assertThat(tunnel.recordType()).contains("tunnel")
        assertThat(tunnel.status()).contains(Tunnel.Status.HEALTHY)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val tunnel =
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

        val roundtrippedTunnel =
            jsonMapper.readValue(jsonMapper.writeValueAsString(tunnel), jacksonTypeRef<Tunnel>())

        assertThat(roundtrippedTunnel).isEqualTo(tunnel)
    }
}
