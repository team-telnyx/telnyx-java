// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.networks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NetworkCreateTest {

    @Test
    fun create() {
        val networkCreate =
            NetworkCreate.builder()
                .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                .createdAt("2018-02-02T22:25:27.521Z")
                .recordType("network")
                .updatedAt("2018-02-02T22:25:27.521Z")
                .name("test network")
                .build()

        assertThat(networkCreate.id()).contains("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
        assertThat(networkCreate.createdAt()).contains("2018-02-02T22:25:27.521Z")
        assertThat(networkCreate.recordType()).contains("network")
        assertThat(networkCreate.updatedAt()).contains("2018-02-02T22:25:27.521Z")
        assertThat(networkCreate.name()).isEqualTo("test network")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val networkCreate =
            NetworkCreate.builder()
                .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                .createdAt("2018-02-02T22:25:27.521Z")
                .recordType("network")
                .updatedAt("2018-02-02T22:25:27.521Z")
                .name("test network")
                .build()

        val roundtrippedNetworkCreate =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(networkCreate),
                jacksonTypeRef<NetworkCreate>(),
            )

        assertThat(roundtrippedNetworkCreate).isEqualTo(networkCreate)
    }
}
