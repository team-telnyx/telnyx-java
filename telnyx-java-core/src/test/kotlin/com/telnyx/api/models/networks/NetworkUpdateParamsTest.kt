// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.networks

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NetworkUpdateParamsTest {

    @Test
    fun create() {
        NetworkUpdateParams.builder()
            .pathId("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
            .networkCreate(
                NetworkCreate.builder()
                    .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                    .createdAt("2018-02-02T22:25:27.521Z")
                    .recordType("network")
                    .updatedAt("2018-02-02T22:25:27.521Z")
                    .name("test network")
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            NetworkUpdateParams.builder()
                .pathId("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                .networkCreate(NetworkCreate.builder().name("test network").build())
                .build()

        assertThat(params._pathParam(0)).isEqualTo("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            NetworkUpdateParams.builder()
                .pathId("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                .networkCreate(
                    NetworkCreate.builder()
                        .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                        .createdAt("2018-02-02T22:25:27.521Z")
                        .recordType("network")
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
                    .recordType("network")
                    .updatedAt("2018-02-02T22:25:27.521Z")
                    .name("test network")
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            NetworkUpdateParams.builder()
                .pathId("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                .networkCreate(NetworkCreate.builder().name("test network").build())
                .build()

        val body = params._body()

        assertThat(body).isEqualTo(NetworkCreate.builder().name("test network").build())
    }
}
