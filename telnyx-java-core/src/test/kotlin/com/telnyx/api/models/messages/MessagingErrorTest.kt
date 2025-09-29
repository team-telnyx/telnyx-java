// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.messages

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.JsonValue
import com.telnyx.api.core.jsonMapper
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
                .meta(JsonValue.from(mapOf<String, Any>()))
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
        assertThat(messagingError._meta()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
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
                .meta(JsonValue.from(mapOf<String, Any>()))
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
