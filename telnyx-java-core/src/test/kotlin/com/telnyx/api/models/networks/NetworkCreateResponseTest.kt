// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.networks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NetworkCreateResponseTest {

    @Test
    fun create() {
        val networkCreateResponse =
            NetworkCreateResponse.builder()
                .data(
                    NetworkCreateResponse.Data.builder()
                        .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                        .createdAt("2018-02-02T22:25:27.521Z")
                        .recordType("network")
                        .updatedAt("2018-02-02T22:25:27.521Z")
                        .name("test network")
                        .build()
                )
                .build()

        assertThat(networkCreateResponse.data())
            .contains(
                NetworkCreateResponse.Data.builder()
                    .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                    .createdAt("2018-02-02T22:25:27.521Z")
                    .recordType("network")
                    .updatedAt("2018-02-02T22:25:27.521Z")
                    .name("test network")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val networkCreateResponse =
            NetworkCreateResponse.builder()
                .data(
                    NetworkCreateResponse.Data.builder()
                        .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                        .createdAt("2018-02-02T22:25:27.521Z")
                        .recordType("network")
                        .updatedAt("2018-02-02T22:25:27.521Z")
                        .name("test network")
                        .build()
                )
                .build()

        val roundtrippedNetworkCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(networkCreateResponse),
                jacksonTypeRef<NetworkCreateResponse>(),
            )

        assertThat(roundtrippedNetworkCreateResponse).isEqualTo(networkCreateResponse)
    }
}
