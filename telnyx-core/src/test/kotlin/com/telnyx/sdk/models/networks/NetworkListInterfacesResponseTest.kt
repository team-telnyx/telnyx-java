// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.networks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NetworkListInterfacesResponseTest {

    @Test
    fun create() {
        val networkListInterfacesResponse =
            NetworkListInterfacesResponse.builder()
                .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                .createdAt("2018-02-02T22:25:27.521Z")
                .recordType("network_interface")
                .updatedAt("2018-02-02T22:25:27.521Z")
                .name("test interface")
                .networkId("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                .status(InterfaceStatus.PROVISIONED)
                .region(
                    NetworkListInterfacesResponse.Region.builder()
                        .code("ashburn-va")
                        .name("Ashburn")
                        .recordType("region")
                        .build()
                )
                .regionCode("ashburn-va")
                .type("wireguard_interface")
                .build()

        assertThat(networkListInterfacesResponse.id())
            .contains("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
        assertThat(networkListInterfacesResponse.createdAt()).contains("2018-02-02T22:25:27.521Z")
        assertThat(networkListInterfacesResponse.recordType()).contains("network_interface")
        assertThat(networkListInterfacesResponse.updatedAt()).contains("2018-02-02T22:25:27.521Z")
        assertThat(networkListInterfacesResponse.name()).contains("test interface")
        assertThat(networkListInterfacesResponse.networkId())
            .contains("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
        assertThat(networkListInterfacesResponse.status()).contains(InterfaceStatus.PROVISIONED)
        assertThat(networkListInterfacesResponse.region())
            .contains(
                NetworkListInterfacesResponse.Region.builder()
                    .code("ashburn-va")
                    .name("Ashburn")
                    .recordType("region")
                    .build()
            )
        assertThat(networkListInterfacesResponse.regionCode()).contains("ashburn-va")
        assertThat(networkListInterfacesResponse.type()).contains("wireguard_interface")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val networkListInterfacesResponse =
            NetworkListInterfacesResponse.builder()
                .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                .createdAt("2018-02-02T22:25:27.521Z")
                .recordType("network_interface")
                .updatedAt("2018-02-02T22:25:27.521Z")
                .name("test interface")
                .networkId("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                .status(InterfaceStatus.PROVISIONED)
                .region(
                    NetworkListInterfacesResponse.Region.builder()
                        .code("ashburn-va")
                        .name("Ashburn")
                        .recordType("region")
                        .build()
                )
                .regionCode("ashburn-va")
                .type("wireguard_interface")
                .build()

        val roundtrippedNetworkListInterfacesResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(networkListInterfacesResponse),
                jacksonTypeRef<NetworkListInterfacesResponse>(),
            )

        assertThat(roundtrippedNetworkListInterfacesResponse)
            .isEqualTo(networkListInterfacesResponse)
    }
}
