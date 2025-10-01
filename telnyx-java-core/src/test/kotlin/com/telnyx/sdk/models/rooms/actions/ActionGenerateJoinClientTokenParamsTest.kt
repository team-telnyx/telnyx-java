// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.rooms.actions

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ActionGenerateJoinClientTokenParamsTest {

    @Test
    fun create() {
        ActionGenerateJoinClientTokenParams.builder()
            .roomId("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
            .refreshTokenTtlSecs(3600L)
            .tokenTtlSecs(600L)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ActionGenerateJoinClientTokenParams.builder()
                .roomId("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            ActionGenerateJoinClientTokenParams.builder()
                .roomId("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                .refreshTokenTtlSecs(3600L)
                .tokenTtlSecs(600L)
                .build()

        val body = params._body()

        assertThat(body.refreshTokenTtlSecs()).contains(3600L)
        assertThat(body.tokenTtlSecs()).contains(600L)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ActionGenerateJoinClientTokenParams.builder()
                .roomId("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                .build()

        val body = params._body()
    }
}
