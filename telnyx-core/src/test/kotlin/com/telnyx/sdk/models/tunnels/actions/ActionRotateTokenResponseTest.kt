// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.tunnels.actions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.tunnels.Tunnel
import com.telnyx.sdk.models.tunnels.TunnelWithToken
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ActionRotateTokenResponseTest {

    @Test
    fun create() {
        val actionRotateTokenResponse =
            ActionRotateTokenResponse.builder()
                .data(
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
                )
                .build()

        assertThat(actionRotateTokenResponse.data())
            .contains(
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
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val actionRotateTokenResponse =
            ActionRotateTokenResponse.builder()
                .data(
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
                )
                .build()

        val roundtrippedActionRotateTokenResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(actionRotateTokenResponse),
                jacksonTypeRef<ActionRotateTokenResponse>(),
            )

        assertThat(roundtrippedActionRotateTokenResponse).isEqualTo(actionRotateTokenResponse)
    }
}
