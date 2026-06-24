// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.networks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NetworkTest {

    @Test
    fun create() {
        val network =
            Network.builder()
                .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                .createdAt("2018-02-02T22:25:27.521Z")
                .recordType("sample_record_type")
                .updatedAt("2018-02-02T22:25:27.521Z")
                .name("test network")
                .build()

        assertThat(network.id()).contains("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
        assertThat(network.createdAt()).contains("2018-02-02T22:25:27.521Z")
        assertThat(network.recordType()).contains("sample_record_type")
        assertThat(network.updatedAt()).contains("2018-02-02T22:25:27.521Z")
        assertThat(network.name()).contains("test network")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val network =
            Network.builder()
                .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                .createdAt("2018-02-02T22:25:27.521Z")
                .recordType("sample_record_type")
                .updatedAt("2018-02-02T22:25:27.521Z")
                .name("test network")
                .build()

        val roundtrippedNetwork =
            jsonMapper.readValue(jsonMapper.writeValueAsString(network), jacksonTypeRef<Network>())

        assertThat(roundtrippedNetwork).isEqualTo(network)
    }
}
