// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.wireguardinterfaces

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.networks.InterfaceStatus
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WireguardInterfaceReadTest {

    @Test
    fun create() {
        val wireguardInterfaceRead =
            WireguardInterfaceRead.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt("created_at")
                .enableSipTrunking(false)
                .endpoint("203.0.113.0:51871")
                .name("name")
                .networkId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .publicKey("qF4EqlZq+5JL2IKYY8ij49daYyfKVhevJrcDxdqC8GU=")
                .recordType("wireguard_interface")
                .region(
                    WireguardInterfaceRead.Region.builder()
                        .code("ashburn-va")
                        .name("Ashburn")
                        .recordType("region")
                        .build()
                )
                .regionCode("region_code")
                .status(InterfaceStatus.PROVISIONED)
                .updatedAt("updated_at")
                .build()

        assertThat(wireguardInterfaceRead.id()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(wireguardInterfaceRead.createdAt()).contains("created_at")
        assertThat(wireguardInterfaceRead.enableSipTrunking()).contains(false)
        assertThat(wireguardInterfaceRead.endpoint()).contains("203.0.113.0:51871")
        assertThat(wireguardInterfaceRead.name()).contains("name")
        assertThat(wireguardInterfaceRead.networkId())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(wireguardInterfaceRead.publicKey())
            .contains("qF4EqlZq+5JL2IKYY8ij49daYyfKVhevJrcDxdqC8GU=")
        assertThat(wireguardInterfaceRead.recordType()).contains("wireguard_interface")
        assertThat(wireguardInterfaceRead.region())
            .contains(
                WireguardInterfaceRead.Region.builder()
                    .code("ashburn-va")
                    .name("Ashburn")
                    .recordType("region")
                    .build()
            )
        assertThat(wireguardInterfaceRead.regionCode()).contains("region_code")
        assertThat(wireguardInterfaceRead.status()).contains(InterfaceStatus.PROVISIONED)
        assertThat(wireguardInterfaceRead.updatedAt()).contains("updated_at")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val wireguardInterfaceRead =
            WireguardInterfaceRead.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt("created_at")
                .enableSipTrunking(false)
                .endpoint("203.0.113.0:51871")
                .name("name")
                .networkId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .publicKey("qF4EqlZq+5JL2IKYY8ij49daYyfKVhevJrcDxdqC8GU=")
                .recordType("wireguard_interface")
                .region(
                    WireguardInterfaceRead.Region.builder()
                        .code("ashburn-va")
                        .name("Ashburn")
                        .recordType("region")
                        .build()
                )
                .regionCode("region_code")
                .status(InterfaceStatus.PROVISIONED)
                .updatedAt("updated_at")
                .build()

        val roundtrippedWireguardInterfaceRead =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(wireguardInterfaceRead),
                jacksonTypeRef<WireguardInterfaceRead>(),
            )

        assertThat(roundtrippedWireguardInterfaceRead).isEqualTo(wireguardInterfaceRead)
    }
}
