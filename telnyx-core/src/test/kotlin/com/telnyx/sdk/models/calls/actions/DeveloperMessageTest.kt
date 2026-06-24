// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.calls.actions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DeveloperMessageTest {

    @Test
    fun create() {
        val developerMessage =
            DeveloperMessage.builder()
                .content("Get the user's favorite color")
                .role(DeveloperMessage.Role.DEVELOPER)
                .metadata(
                    DeveloperMessage.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .build()

        assertThat(developerMessage.content()).isEqualTo("Get the user's favorite color")
        assertThat(developerMessage.role()).isEqualTo(DeveloperMessage.Role.DEVELOPER)
        assertThat(developerMessage.metadata())
            .contains(
                DeveloperMessage.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val developerMessage =
            DeveloperMessage.builder()
                .content("Get the user's favorite color")
                .role(DeveloperMessage.Role.DEVELOPER)
                .metadata(
                    DeveloperMessage.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .build()

        val roundtrippedDeveloperMessage =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(developerMessage),
                jacksonTypeRef<DeveloperMessage>(),
            )

        assertThat(roundtrippedDeveloperMessage).isEqualTo(developerMessage)
    }
}
