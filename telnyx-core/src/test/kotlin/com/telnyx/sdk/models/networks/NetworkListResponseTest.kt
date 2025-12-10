// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.networks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NetworkListResponseTest {

    @Test
    fun create() {
        val networkListResponse =
            NetworkListResponse.builder()
                .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                .createdAt("2018-02-02T22:25:27.521Z")
                .recordType("sample_record_type")
                .updatedAt("2018-02-02T22:25:27.521Z")
                .name("test network")
                .build()

        assertThat(networkListResponse.id()).contains("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
        assertThat(networkListResponse.createdAt()).contains("2018-02-02T22:25:27.521Z")
        assertThat(networkListResponse.recordType()).contains("sample_record_type")
        assertThat(networkListResponse.updatedAt()).contains("2018-02-02T22:25:27.521Z")
        assertThat(networkListResponse.name()).contains("test network")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val networkListResponse =
            NetworkListResponse.builder()
                .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                .createdAt("2018-02-02T22:25:27.521Z")
                .recordType("sample_record_type")
                .updatedAt("2018-02-02T22:25:27.521Z")
                .name("test network")
                .build()

        val roundtrippedNetworkListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(networkListResponse),
                jacksonTypeRef<NetworkListResponse>(),
            )

        assertThat(roundtrippedNetworkListResponse).isEqualTo(networkListResponse)
    }
}
