// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.actions.purchase

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WirelessErrorC5290d5308Test {

    @Test
    fun create() {
        val wirelessErrorC5290d5308 =
            WirelessErrorC5290d5308.builder()
                .code("code")
                .title("title")
                .detail("detail")
                .meta(
                    WirelessErrorC5290d5308.Meta.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .source(
                    WirelessErrorC5290d5308.Source.builder()
                        .parameter("parameter")
                        .pointer("pointer")
                        .build()
                )
                .build()

        assertThat(wirelessErrorC5290d5308.code()).isEqualTo("code")
        assertThat(wirelessErrorC5290d5308.title()).isEqualTo("title")
        assertThat(wirelessErrorC5290d5308.detail()).contains("detail")
        assertThat(wirelessErrorC5290d5308.meta())
            .contains(
                WirelessErrorC5290d5308.Meta.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(wirelessErrorC5290d5308.source())
            .contains(
                WirelessErrorC5290d5308.Source.builder()
                    .parameter("parameter")
                    .pointer("pointer")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val wirelessErrorC5290d5308 =
            WirelessErrorC5290d5308.builder()
                .code("code")
                .title("title")
                .detail("detail")
                .meta(
                    WirelessErrorC5290d5308.Meta.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .source(
                    WirelessErrorC5290d5308.Source.builder()
                        .parameter("parameter")
                        .pointer("pointer")
                        .build()
                )
                .build()

        val roundtrippedWirelessErrorC5290d5308 =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(wirelessErrorC5290d5308),
                jacksonTypeRef<WirelessErrorC5290d5308>(),
            )

        assertThat(roundtrippedWirelessErrorC5290d5308).isEqualTo(wirelessErrorC5290d5308)
    }
}
