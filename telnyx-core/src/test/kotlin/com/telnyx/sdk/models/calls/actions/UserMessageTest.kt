// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.calls.actions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UserMessageTest {

    @Test
    fun create() {
        val userMessage =
            UserMessage.builder()
                .content("Hello, I would like some help.")
                .role(UserMessage.Role.USER)
                .metadata(
                    UserMessage.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .build()

        assertThat(userMessage.content()).isEqualTo("Hello, I would like some help.")
        assertThat(userMessage.role()).isEqualTo(UserMessage.Role.USER)
        assertThat(userMessage.metadata())
            .contains(
                UserMessage.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val userMessage =
            UserMessage.builder()
                .content("Hello, I would like some help.")
                .role(UserMessage.Role.USER)
                .metadata(
                    UserMessage.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .build()

        val roundtrippedUserMessage =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(userMessage),
                jacksonTypeRef<UserMessage>(),
            )

        assertThat(roundtrippedUserMessage).isEqualTo(userMessage)
    }
}
