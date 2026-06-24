// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.calls.actions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SystemMessageTest {

    @Test
    fun create() {
        val systemMessage =
            SystemMessage.builder()
                .content("Get the user's favorite color")
                .role(SystemMessage.Role.SYSTEM)
                .metadata(
                    SystemMessage.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .build()

        assertThat(systemMessage.content()).isEqualTo("Get the user's favorite color")
        assertThat(systemMessage.role()).isEqualTo(SystemMessage.Role.SYSTEM)
        assertThat(systemMessage.metadata())
            .contains(
                SystemMessage.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val systemMessage =
            SystemMessage.builder()
                .content("Get the user's favorite color")
                .role(SystemMessage.Role.SYSTEM)
                .metadata(
                    SystemMessage.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .build()

        val roundtrippedSystemMessage =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(systemMessage),
                jacksonTypeRef<SystemMessage>(),
            )

        assertThat(roundtrippedSystemMessage).isEqualTo(systemMessage)
    }
}
