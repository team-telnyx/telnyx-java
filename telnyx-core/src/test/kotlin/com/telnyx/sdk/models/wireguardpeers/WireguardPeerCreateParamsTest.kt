// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.wireguardpeers

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WireguardPeerCreateParamsTest {

    @Test
    fun create() {
        WireguardPeerCreateParams.builder()
            .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
            .createdAt("2018-02-02T22:25:27.521Z")
            .recordType("sample_record_type")
            .updatedAt("2018-02-02T22:25:27.521Z")
            .publicKey("qF4EqlZq+5JL2IKYY8ij49daYyfKVhevJrcDxdqC8GU=")
            .wireguardInterfaceId("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
            .lastSeen("2018-02-02T22:25:27.521Z")
            .privateKey("qF4EqlZq+5JL2IKYY8ij49daYyfKVhevJrcDxdqC8GU=")
            .build()
    }

    @Test
    fun body() {
        val params =
            WireguardPeerCreateParams.builder()
                .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                .createdAt("2018-02-02T22:25:27.521Z")
                .recordType("sample_record_type")
                .updatedAt("2018-02-02T22:25:27.521Z")
                .publicKey("qF4EqlZq+5JL2IKYY8ij49daYyfKVhevJrcDxdqC8GU=")
                .wireguardInterfaceId("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                .lastSeen("2018-02-02T22:25:27.521Z")
                .privateKey("qF4EqlZq+5JL2IKYY8ij49daYyfKVhevJrcDxdqC8GU=")
                .build()

        val body = params._body()

        assertThat(body.id()).contains("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
        assertThat(body.createdAt()).contains("2018-02-02T22:25:27.521Z")
        assertThat(body.recordType()).contains("sample_record_type")
        assertThat(body.updatedAt()).contains("2018-02-02T22:25:27.521Z")
        assertThat(body.publicKey()).contains("qF4EqlZq+5JL2IKYY8ij49daYyfKVhevJrcDxdqC8GU=")
        assertThat(body.wireguardInterfaceId()).isEqualTo("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
        assertThat(body.lastSeen()).contains("2018-02-02T22:25:27.521Z")
        assertThat(body.privateKey()).contains("qF4EqlZq+5JL2IKYY8ij49daYyfKVhevJrcDxdqC8GU=")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            WireguardPeerCreateParams.builder()
                .wireguardInterfaceId("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                .build()

        val body = params._body()

        assertThat(body.wireguardInterfaceId()).isEqualTo("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
    }
}
