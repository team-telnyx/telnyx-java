// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.networks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NetworkRetrieveResponseTest {

    @Test
    fun create() {
        val networkRetrieveResponse =
            NetworkRetrieveResponse.builder()
                .data(
                    NetworkRetrieveResponse.Data.builder()
                        .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                        .createdAt("2018-02-02T22:25:27.521Z")
                        .recordType("network")
                        .updatedAt("2018-02-02T22:25:27.521Z")
                        .name("test network")
                        .build()
                )
                .build()

        assertThat(networkRetrieveResponse.data())
            .contains(
                NetworkRetrieveResponse.Data.builder()
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
        val networkRetrieveResponse =
            NetworkRetrieveResponse.builder()
                .data(
                    NetworkRetrieveResponse.Data.builder()
                        .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                        .createdAt("2018-02-02T22:25:27.521Z")
                        .recordType("network")
                        .updatedAt("2018-02-02T22:25:27.521Z")
                        .name("test network")
                        .build()
                )
                .build()

        val roundtrippedNetworkRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(networkRetrieveResponse),
                jacksonTypeRef<NetworkRetrieveResponse>(),
            )

        assertThat(roundtrippedNetworkRetrieveResponse).isEqualTo(networkRetrieveResponse)
    }
}
