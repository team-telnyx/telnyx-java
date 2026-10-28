// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.tunnels

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.networkroutes.NetappsCursorPaginationMeta
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TunnelListResponseTest {

    @Test
    fun create() {
        val tunnelListResponse =
            TunnelListResponse.builder()
                .addData(
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
                .meta(
                    NetappsCursorPaginationMeta.builder()
                        .cursors(
                            NetappsCursorPaginationMeta.Cursors.builder()
                                .after("after")
                                .before("before")
                                .build()
                        )
                        .next(
                            "/v2/network_routes?filter%5Bnetwork_id%5D=91446ee3-5b1c-4f0e-8d2a-6c7e9b0a1f24&page%5Bafter%5D=MjAyNi0xMC0yMVQxNjowNjowMC4wNDMwNDRa&page%5Blimit%5D=1"
                        )
                        .previous("previous")
                        .build()
                )
                .build()

        assertThat(tunnelListResponse.data().getOrNull())
            .containsExactly(
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
        assertThat(tunnelListResponse.meta())
            .contains(
                NetappsCursorPaginationMeta.builder()
                    .cursors(
                        NetappsCursorPaginationMeta.Cursors.builder()
                            .after("after")
                            .before("before")
                            .build()
                    )
                    .next(
                        "/v2/network_routes?filter%5Bnetwork_id%5D=91446ee3-5b1c-4f0e-8d2a-6c7e9b0a1f24&page%5Bafter%5D=MjAyNi0xMC0yMVQxNjowNjowMC4wNDMwNDRa&page%5Blimit%5D=1"
                    )
                    .previous("previous")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val tunnelListResponse =
            TunnelListResponse.builder()
                .addData(
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
                .meta(
                    NetappsCursorPaginationMeta.builder()
                        .cursors(
                            NetappsCursorPaginationMeta.Cursors.builder()
                                .after("after")
                                .before("before")
                                .build()
                        )
                        .next(
                            "/v2/network_routes?filter%5Bnetwork_id%5D=91446ee3-5b1c-4f0e-8d2a-6c7e9b0a1f24&page%5Bafter%5D=MjAyNi0xMC0yMVQxNjowNjowMC4wNDMwNDRa&page%5Blimit%5D=1"
                        )
                        .previous("previous")
                        .build()
                )
                .build()

        val roundtrippedTunnelListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(tunnelListResponse),
                jacksonTypeRef<TunnelListResponse>(),
            )

        assertThat(roundtrippedTunnelListResponse).isEqualTo(tunnelListResponse)
    }
}
