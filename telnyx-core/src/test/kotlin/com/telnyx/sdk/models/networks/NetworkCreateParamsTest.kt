// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.networks

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NetworkCreateParamsTest {

    @Test
    fun create() {
        NetworkCreateParams.builder()
            .networkCreate(
                NetworkCreate.builder()
                    .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                    .createdAt("2018-02-02T22:25:27.521Z")
                    .recordType("sample_record_type")
                    .updatedAt("2018-02-02T22:25:27.521Z")
                    .name("test network")
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            NetworkCreateParams.builder()
                .networkCreate(
                    NetworkCreate.builder()
                        .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                        .createdAt("2018-02-02T22:25:27.521Z")
                        .recordType("sample_record_type")
                        .updatedAt("2018-02-02T22:25:27.521Z")
                        .name("test network")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                NetworkCreate.builder()
                    .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                    .createdAt("2018-02-02T22:25:27.521Z")
                    .recordType("sample_record_type")
                    .updatedAt("2018-02-02T22:25:27.521Z")
                    .name("test network")
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            NetworkCreateParams.builder()
                .networkCreate(NetworkCreate.builder().name("test network").build())
                .build()

        val body = params._body()

        assertThat(body).isEqualTo(NetworkCreate.builder().name("test network").build())
    }
}
