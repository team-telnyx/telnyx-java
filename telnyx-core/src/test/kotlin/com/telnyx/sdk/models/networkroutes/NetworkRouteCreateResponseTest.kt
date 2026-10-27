// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.networkroutes

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NetworkRouteCreateResponseTest {

    @Test
    fun create() {
        val networkRouteCreateResponse =
            NetworkRouteCreateResponse.builder()
                .data(
                    NetworkRoute.builder()
                        .id("e8a2c5d0-3f7b-4a19-b6d2-9c1e0f8a7b53")
                        .cidr("10.20.0.0/16")
                        .createdAt(OffsetDateTime.parse("2026-10-21T15:04:05.123456Z"))
                        .networkId("91446ee3-5b1c-4f0e-8d2a-6c7e9b0a1f24")
                        .nextHop(
                            NetworkRoute.NextHop.builder()
                                .id("62d438d2-8a51-4c5e-9d0c-1f6b2a7e4c39")
                                .type(NetworkRoute.NextHop.Type.TUNNEL)
                                .build()
                        )
                        .origin(NetworkRoute.Origin.STATIC)
                        .recordType("network_route")
                        .status(NetworkRoute.Status.ACTIVE)
                        .build()
                )
                .build()

        assertThat(networkRouteCreateResponse.data())
            .contains(
                NetworkRoute.builder()
                    .id("e8a2c5d0-3f7b-4a19-b6d2-9c1e0f8a7b53")
                    .cidr("10.20.0.0/16")
                    .createdAt(OffsetDateTime.parse("2026-10-21T15:04:05.123456Z"))
                    .networkId("91446ee3-5b1c-4f0e-8d2a-6c7e9b0a1f24")
                    .nextHop(
                        NetworkRoute.NextHop.builder()
                            .id("62d438d2-8a51-4c5e-9d0c-1f6b2a7e4c39")
                            .type(NetworkRoute.NextHop.Type.TUNNEL)
                            .build()
                    )
                    .origin(NetworkRoute.Origin.STATIC)
                    .recordType("network_route")
                    .status(NetworkRoute.Status.ACTIVE)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val networkRouteCreateResponse =
            NetworkRouteCreateResponse.builder()
                .data(
                    NetworkRoute.builder()
                        .id("e8a2c5d0-3f7b-4a19-b6d2-9c1e0f8a7b53")
                        .cidr("10.20.0.0/16")
                        .createdAt(OffsetDateTime.parse("2026-10-21T15:04:05.123456Z"))
                        .networkId("91446ee3-5b1c-4f0e-8d2a-6c7e9b0a1f24")
                        .nextHop(
                            NetworkRoute.NextHop.builder()
                                .id("62d438d2-8a51-4c5e-9d0c-1f6b2a7e4c39")
                                .type(NetworkRoute.NextHop.Type.TUNNEL)
                                .build()
                        )
                        .origin(NetworkRoute.Origin.STATIC)
                        .recordType("network_route")
                        .status(NetworkRoute.Status.ACTIVE)
                        .build()
                )
                .build()

        val roundtrippedNetworkRouteCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(networkRouteCreateResponse),
                jacksonTypeRef<NetworkRouteCreateResponse>(),
            )

        assertThat(roundtrippedNetworkRouteCreateResponse).isEqualTo(networkRouteCreateResponse)
    }
}
