// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.messages

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MessagingErrorTest {

    @Test
    fun create() {
        val messagingError =
            MessagingError.builder()
                .code("code")
                .title("title")
                .detail("detail")
                .meta(
                    MessagingError.Meta.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .source(
                    MessagingError.Source.builder()
                        .parameter("parameter")
                        .pointer("pointer")
                        .build()
                )
                .build()

        assertThat(messagingError.code()).isEqualTo("code")
        assertThat(messagingError.title()).isEqualTo("title")
        assertThat(messagingError.detail()).contains("detail")
        assertThat(messagingError.meta())
            .contains(
                MessagingError.Meta.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(messagingError.source())
            .contains(
                MessagingError.Source.builder().parameter("parameter").pointer("pointer").build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val messagingError =
            MessagingError.builder()
                .code("code")
                .title("title")
                .detail("detail")
                .meta(
                    MessagingError.Meta.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .source(
                    MessagingError.Source.builder()
                        .parameter("parameter")
                        .pointer("pointer")
                        .build()
                )
                .build()

        val roundtrippedMessagingError =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(messagingError),
                jacksonTypeRef<MessagingError>(),
            )

        assertThat(roundtrippedMessagingError).isEqualTo(messagingError)
    }
}
