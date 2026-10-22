// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.tailscalesubnetrouters

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TailscaleSubnetRouterTest {

    @Test
    fun create() {
        val tailscaleSubnetRouter =
            TailscaleSubnetRouter.builder()
                .id("5c6f0a7e-6c7b-4d7f-9f2e-3b1e4e9a8c21")
                .addAdvertisedRoute("172.27.0.0/24")
                .createdAt(OffsetDateTime.parse("2026-10-13T15:04:05.123456Z"))
                .customerAddress("172.27.254.1")
                .deviceId("n5c6f0a7e1CNTRL")
                .name("tailnet-ashburn")
                .networkId("0de011ae-ee53-4df4-ba96-754728eb5aad")
                .recordType("tailscale_subnet_router")
                .regionCode("ashburn-va")
                .status(TailscaleSubnetRouter.Status.PROVISIONED)
                .tailnetName("acme.example")
                .addTailscaleIp("100.101.2.30")
                .addTailscaleIp("fd7a:115c:a1e0::2a")
                .updatedAt(OffsetDateTime.parse("2026-10-13T15:09:41.654321Z"))
                .build()

        assertThat(tailscaleSubnetRouter.id()).contains("5c6f0a7e-6c7b-4d7f-9f2e-3b1e4e9a8c21")
        assertThat(tailscaleSubnetRouter.advertisedRoutes().getOrNull())
            .containsExactly("172.27.0.0/24")
        assertThat(tailscaleSubnetRouter.createdAt())
            .contains(OffsetDateTime.parse("2026-10-13T15:04:05.123456Z"))
        assertThat(tailscaleSubnetRouter.customerAddress()).contains("172.27.254.1")
        assertThat(tailscaleSubnetRouter.deviceId()).contains("n5c6f0a7e1CNTRL")
        assertThat(tailscaleSubnetRouter.name()).contains("tailnet-ashburn")
        assertThat(tailscaleSubnetRouter.networkId())
            .contains("0de011ae-ee53-4df4-ba96-754728eb5aad")
        assertThat(tailscaleSubnetRouter.recordType()).contains("tailscale_subnet_router")
        assertThat(tailscaleSubnetRouter.regionCode()).contains("ashburn-va")
        assertThat(tailscaleSubnetRouter.status())
            .contains(TailscaleSubnetRouter.Status.PROVISIONED)
        assertThat(tailscaleSubnetRouter.tailnetName()).contains("acme.example")
        assertThat(tailscaleSubnetRouter.tailscaleIps().getOrNull())
            .containsExactly("100.101.2.30", "fd7a:115c:a1e0::2a")
        assertThat(tailscaleSubnetRouter.updatedAt())
            .contains(OffsetDateTime.parse("2026-10-13T15:09:41.654321Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val tailscaleSubnetRouter =
            TailscaleSubnetRouter.builder()
                .id("5c6f0a7e-6c7b-4d7f-9f2e-3b1e4e9a8c21")
                .addAdvertisedRoute("172.27.0.0/24")
                .createdAt(OffsetDateTime.parse("2026-10-13T15:04:05.123456Z"))
                .customerAddress("172.27.254.1")
                .deviceId("n5c6f0a7e1CNTRL")
                .name("tailnet-ashburn")
                .networkId("0de011ae-ee53-4df4-ba96-754728eb5aad")
                .recordType("tailscale_subnet_router")
                .regionCode("ashburn-va")
                .status(TailscaleSubnetRouter.Status.PROVISIONED)
                .tailnetName("acme.example")
                .addTailscaleIp("100.101.2.30")
                .addTailscaleIp("fd7a:115c:a1e0::2a")
                .updatedAt(OffsetDateTime.parse("2026-10-13T15:09:41.654321Z"))
                .build()

        val roundtrippedTailscaleSubnetRouter =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(tailscaleSubnetRouter),
                jacksonTypeRef<TailscaleSubnetRouter>(),
            )

        assertThat(roundtrippedTailscaleSubnetRouter).isEqualTo(tailscaleSubnetRouter)
    }
}
