// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.wireguardinterfaces

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.networks.InterfaceStatus
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WireguardInterfaceDeleteResponseTest {

    @Test
    fun create() {
        val wireguardInterfaceDeleteResponse =
            WireguardInterfaceDeleteResponse.builder()
                .data(
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
                )
                .build()

        assertThat(wireguardInterfaceDeleteResponse.data())
            .contains(
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
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val wireguardInterfaceDeleteResponse =
            WireguardInterfaceDeleteResponse.builder()
                .data(
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
                )
                .build()

        val roundtrippedWireguardInterfaceDeleteResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(wireguardInterfaceDeleteResponse),
                jacksonTypeRef<WireguardInterfaceDeleteResponse>(),
            )

        assertThat(roundtrippedWireguardInterfaceDeleteResponse)
            .isEqualTo(wireguardInterfaceDeleteResponse)
    }
}
