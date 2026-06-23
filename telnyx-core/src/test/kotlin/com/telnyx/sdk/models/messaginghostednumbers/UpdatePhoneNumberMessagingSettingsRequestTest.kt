// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.messaginghostednumbers

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UpdatePhoneNumberMessagingSettingsRequestTest {

    @Test
    fun create() {
        val updatePhoneNumberMessagingSettingsRequest =
            UpdatePhoneNumberMessagingSettingsRequest.builder()
                .messagingProduct("P2P")
                .messagingProfileId("dd50eba1-a0c0-4563-9925-b25e842a7cb6")
                .addTag("string")
                .build()

        assertThat(updatePhoneNumberMessagingSettingsRequest.messagingProduct()).contains("P2P")
        assertThat(updatePhoneNumberMessagingSettingsRequest.messagingProfileId())
            .contains("dd50eba1-a0c0-4563-9925-b25e842a7cb6")
        assertThat(updatePhoneNumberMessagingSettingsRequest.tags().getOrNull())
            .containsExactly("string")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val updatePhoneNumberMessagingSettingsRequest =
            UpdatePhoneNumberMessagingSettingsRequest.builder()
                .messagingProduct("P2P")
                .messagingProfileId("dd50eba1-a0c0-4563-9925-b25e842a7cb6")
                .addTag("string")
                .build()

        val roundtrippedUpdatePhoneNumberMessagingSettingsRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(updatePhoneNumberMessagingSettingsRequest),
                jacksonTypeRef<UpdatePhoneNumberMessagingSettingsRequest>(),
            )

        assertThat(roundtrippedUpdatePhoneNumberMessagingSettingsRequest)
            .isEqualTo(updatePhoneNumberMessagingSettingsRequest)
    }
}
