// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.wireguardinterfaces

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.networks.InterfaceStatus
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WireguardInterfaceTest {

    @Test
    fun create() {
        val wireguardInterface =
            WireguardInterface.builder()
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
                .build()

        assertThat(wireguardInterface.id()).contains("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
        assertThat(wireguardInterface.createdAt()).contains("2018-02-02T22:25:27.521Z")
        assertThat(wireguardInterface.recordType()).contains("sample_record_type")
        assertThat(wireguardInterface.updatedAt()).contains("2018-02-02T22:25:27.521Z")
        assertThat(wireguardInterface.name()).contains("test interface")
        assertThat(wireguardInterface.networkId()).contains("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
        assertThat(wireguardInterface.status()).contains(InterfaceStatus.PROVISIONED)
        assertThat(wireguardInterface.enableSipTrunking()).contains(false)
        assertThat(wireguardInterface.endpoint()).contains("203.0.113.0:51871")
        assertThat(wireguardInterface.publicKey())
            .contains("qF4EqlZq+5JL2IKYY8ij49daYyfKVhevJrcDxdqC8GU=")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val wireguardInterface =
            WireguardInterface.builder()
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
                .build()

        val roundtrippedWireguardInterface =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(wireguardInterface),
                jacksonTypeRef<WireguardInterface>(),
            )

        assertThat(roundtrippedWireguardInterface).isEqualTo(wireguardInterface)
    }
}
