// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.JsonValue
import com.telnyx.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ApiErrorTest {

    @Test
    fun create() {
        val apiError =
            ApiError.builder()
                .code("code")
                .title("Invalid street address")
                .detail("detail")
                .meta(
                    ApiError.Meta.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .source(
                    ApiError.Source.builder()
                        .parameter("parameter")
                        .pointer("/street_address")
                        .build()
                )
                .build()

        assertThat(apiError.code()).isEqualTo("code")
        assertThat(apiError.title()).isEqualTo("Invalid street address")
        assertThat(apiError.detail()).contains("detail")
        assertThat(apiError.meta())
            .contains(
                ApiError.Meta.builder().putAdditionalProperty("foo", JsonValue.from("bar")).build()
            )
        assertThat(apiError.source())
            .contains(
                ApiError.Source.builder().parameter("parameter").pointer("/street_address").build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val apiError =
            ApiError.builder()
                .code("code")
                .title("Invalid street address")
                .detail("detail")
                .meta(
                    ApiError.Meta.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .source(
                    ApiError.Source.builder()
                        .parameter("parameter")
                        .pointer("/street_address")
                        .build()
                )
                .build()

        val roundtrippedApiError =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(apiError),
                jacksonTypeRef<ApiError>(),
            )

        assertThat(roundtrippedApiError).isEqualTo(apiError)
    }
}
