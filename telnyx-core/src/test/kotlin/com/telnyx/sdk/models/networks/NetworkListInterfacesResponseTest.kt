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
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt("created_at")
                .name("name")
                .networkId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .recordType("network_interface")
                .region(
                    NetworkListInterfacesResponse.Region.builder()
                        .code("ashburn-va")
                        .name("Ashburn")
                        .recordType("region")
                        .build()
                )
                .regionCode("region_code")
                .status(InterfaceStatus.PROVISIONED)
                .type("wireguard_interface")
                .updatedAt("updated_at")
                .build()

        assertThat(networkListInterfacesResponse.id())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(networkListInterfacesResponse.createdAt()).contains("created_at")
        assertThat(networkListInterfacesResponse.name()).contains("name")
        assertThat(networkListInterfacesResponse.networkId())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(networkListInterfacesResponse.recordType()).contains("network_interface")
        assertThat(networkListInterfacesResponse.region())
            .contains(
                NetworkListInterfacesResponse.Region.builder()
                    .code("ashburn-va")
                    .name("Ashburn")
                    .recordType("region")
                    .build()
            )
        assertThat(networkListInterfacesResponse.regionCode()).contains("region_code")
        assertThat(networkListInterfacesResponse.status()).contains(InterfaceStatus.PROVISIONED)
        assertThat(networkListInterfacesResponse.type()).contains("wireguard_interface")
        assertThat(networkListInterfacesResponse.updatedAt()).contains("updated_at")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val networkListInterfacesResponse =
            NetworkListInterfacesResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt("created_at")
                .name("name")
                .networkId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .recordType("network_interface")
                .region(
                    NetworkListInterfacesResponse.Region.builder()
                        .code("ashburn-va")
                        .name("Ashburn")
                        .recordType("region")
                        .build()
                )
                .regionCode("region_code")
                .status(InterfaceStatus.PROVISIONED)
                .type("wireguard_interface")
                .updatedAt("updated_at")
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
