// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.messages

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MessagingError0b38e7044bTest {

    @Test
    fun create() {
        val messagingError0b38e7044b =
            MessagingError0b38e7044b.builder()
                .code("code")
                .title("title")
                .detail("detail")
                .meta(
                    MessagingError0b38e7044b.Meta.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .source(
                    MessagingError0b38e7044b.Source.builder()
                        .parameter("parameter")
                        .pointer("pointer")
                        .build()
                )
                .build()

        assertThat(messagingError0b38e7044b.code()).isEqualTo("code")
        assertThat(messagingError0b38e7044b.title()).isEqualTo("title")
        assertThat(messagingError0b38e7044b.detail()).contains("detail")
        assertThat(messagingError0b38e7044b.meta())
            .contains(
                MessagingError0b38e7044b.Meta.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(messagingError0b38e7044b.source())
            .contains(
                MessagingError0b38e7044b.Source.builder()
                    .parameter("parameter")
                    .pointer("pointer")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val messagingError0b38e7044b =
            MessagingError0b38e7044b.builder()
                .code("code")
                .title("title")
                .detail("detail")
                .meta(
                    MessagingError0b38e7044b.Meta.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .source(
                    MessagingError0b38e7044b.Source.builder()
                        .parameter("parameter")
                        .pointer("pointer")
                        .build()
                )
                .build()

        val roundtrippedMessagingError0b38e7044b =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(messagingError0b38e7044b),
                jacksonTypeRef<MessagingError0b38e7044b>(),
            )

        assertThat(roundtrippedMessagingError0b38e7044b).isEqualTo(messagingError0b38e7044b)
    }
}
