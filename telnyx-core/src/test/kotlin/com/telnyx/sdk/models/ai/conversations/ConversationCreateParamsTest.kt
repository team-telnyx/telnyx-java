// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.conversations

import com.telnyx.sdk.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ConversationCreateParamsTest {

    @Test
    fun create() {
        ConversationCreateParams.builder()
            .metadata(
                ConversationCreateParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
            .name("string")
            .build()
    }

    @Test
    fun body() {
        val params =
            ConversationCreateParams.builder()
                .metadata(
                    ConversationCreateParams.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .name("string")
                .build()

        val body = params._body()

        assertThat(body.metadata())
            .contains(
                ConversationCreateParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(body.name()).contains("string")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = ConversationCreateParams.builder().build()

        val body = params._body()
    }
}
