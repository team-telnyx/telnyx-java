// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.wireguardinterfaces

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.networks.InterfaceStatus
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WireguardInterfaceListResponseTest {

    @Test
    fun create() {
        val wireguardInterfaceListResponse =
            WireguardInterfaceListResponse.builder()
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
                    WireguardInterfaceListResponse.Region.builder()
                        .code("ashburn-va")
                        .name("Ashburn")
                        .recordType("region")
                        .build()
                )
                .regionCode("ashburn-va")
                .build()

        assertThat(wireguardInterfaceListResponse.id())
            .contains("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
        assertThat(wireguardInterfaceListResponse.createdAt()).contains("2018-02-02T22:25:27.521Z")
        assertThat(wireguardInterfaceListResponse.recordType()).contains("sample_record_type")
        assertThat(wireguardInterfaceListResponse.updatedAt()).contains("2018-02-02T22:25:27.521Z")
        assertThat(wireguardInterfaceListResponse.name()).contains("test interface")
        assertThat(wireguardInterfaceListResponse.networkId())
            .contains("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
        assertThat(wireguardInterfaceListResponse.status()).contains(InterfaceStatus.PROVISIONED)
        assertThat(wireguardInterfaceListResponse.enableSipTrunking()).contains(false)
        assertThat(wireguardInterfaceListResponse.endpoint()).contains("203.0.113.0:51871")
        assertThat(wireguardInterfaceListResponse.publicKey())
            .contains("qF4EqlZq+5JL2IKYY8ij49daYyfKVhevJrcDxdqC8GU=")
        assertThat(wireguardInterfaceListResponse.region())
            .contains(
                WireguardInterfaceListResponse.Region.builder()
                    .code("ashburn-va")
                    .name("Ashburn")
                    .recordType("region")
                    .build()
            )
        assertThat(wireguardInterfaceListResponse.regionCode()).contains("ashburn-va")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val wireguardInterfaceListResponse =
            WireguardInterfaceListResponse.builder()
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
                    WireguardInterfaceListResponse.Region.builder()
                        .code("ashburn-va")
                        .name("Ashburn")
                        .recordType("region")
                        .build()
                )
                .regionCode("ashburn-va")
                .build()

        val roundtrippedWireguardInterfaceListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(wireguardInterfaceListResponse),
                jacksonTypeRef<WireguardInterfaceListResponse>(),
            )

        assertThat(roundtrippedWireguardInterfaceListResponse)
            .isEqualTo(wireguardInterfaceListResponse)
    }
}
