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
                    WireguardInterfaceDeleteResponse.Data.builder()
                        .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                        .createdAt("2018-02-02T22:25:27.521Z")
                        .recordType("sample_record_type")
                        .updatedAt("2018-02-02T22:25:27.521Z")
                        .name("test interface")
                        .networkId("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                        .status(InterfaceStatus.PROVISIONED)
                        .enableSipTrunking(false)
                        .endpoint("203.0.113.0:51871")
                        .publicKey("qF4EqlZq+5JL2IKYY8ij49daYyfKVhevJrcDxdqC8GU=")
                        .region(
                            WireguardInterfaceDeleteResponse.Data.Region.builder()
                                .code("ashburn-va")
                                .name("Ashburn")
                                .recordType("region")
                                .build()
                        )
                        .regionCode("ashburn-va")
                        .build()
                )
                .build()

        assertThat(wireguardInterfaceDeleteResponse.data())
            .contains(
                WireguardInterfaceDeleteResponse.Data.builder()
                    .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                    .createdAt("2018-02-02T22:25:27.521Z")
                    .recordType("sample_record_type")
                    .updatedAt("2018-02-02T22:25:27.521Z")
                    .name("test interface")
                    .networkId("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                    .status(InterfaceStatus.PROVISIONED)
                    .enableSipTrunking(false)
                    .endpoint("203.0.113.0:51871")
                    .publicKey("qF4EqlZq+5JL2IKYY8ij49daYyfKVhevJrcDxdqC8GU=")
                    .region(
                        WireguardInterfaceDeleteResponse.Data.Region.builder()
                            .code("ashburn-va")
                            .name("Ashburn")
                            .recordType("region")
                            .build()
                    )
                    .regionCode("ashburn-va")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val wireguardInterfaceDeleteResponse =
            WireguardInterfaceDeleteResponse.builder()
                .data(
                    WireguardInterfaceDeleteResponse.Data.builder()
                        .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                        .createdAt("2018-02-02T22:25:27.521Z")
                        .recordType("sample_record_type")
                        .updatedAt("2018-02-02T22:25:27.521Z")
                        .name("test interface")
                        .networkId("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                        .status(InterfaceStatus.PROVISIONED)
                        .enableSipTrunking(false)
                        .endpoint("203.0.113.0:51871")
                        .publicKey("qF4EqlZq+5JL2IKYY8ij49daYyfKVhevJrcDxdqC8GU=")
                        .region(
                            WireguardInterfaceDeleteResponse.Data.Region.builder()
                                .code("ashburn-va")
                                .name("Ashburn")
                                .recordType("region")
                                .build()
                        )
                        .regionCode("ashburn-va")
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
