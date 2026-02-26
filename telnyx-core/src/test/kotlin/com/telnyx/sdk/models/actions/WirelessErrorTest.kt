// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.actions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WirelessErrorTest {

    @Test
    fun create() {
        val wirelessError =
            WirelessError.builder()
                .code("code")
                .title("title")
                .detail("detail")
                .meta(
                    WirelessError.Meta.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .source(
                    WirelessError.Source.builder().parameter("parameter").pointer("pointer").build()
                )
                .build()

        assertThat(wirelessError.code()).isEqualTo("code")
        assertThat(wirelessError.title()).isEqualTo("title")
        assertThat(wirelessError.detail()).contains("detail")
        assertThat(wirelessError.meta())
            .contains(
                WirelessError.Meta.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(wirelessError.source())
            .contains(
                WirelessError.Source.builder().parameter("parameter").pointer("pointer").build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val wirelessError =
            WirelessError.builder()
                .code("code")
                .title("title")
                .detail("detail")
                .meta(
                    WirelessError.Meta.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .source(
                    WirelessError.Source.builder().parameter("parameter").pointer("pointer").build()
                )
                .build()

        val roundtrippedWirelessError =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(wirelessError),
                jacksonTypeRef<WirelessError>(),
            )

        assertThat(roundtrippedWirelessError).isEqualTo(wirelessError)
    }
}
