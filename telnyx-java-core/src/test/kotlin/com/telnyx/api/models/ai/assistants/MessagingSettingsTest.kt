// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.ai.assistants

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MessagingSettingsTest {

    @Test
    fun create() {
        val messagingSettings =
            MessagingSettings.builder()
                .defaultMessagingProfileId("default_messaging_profile_id")
                .deliveryStatusWebhookUrl("delivery_status_webhook_url")
                .build()

        assertThat(messagingSettings.defaultMessagingProfileId())
            .contains("default_messaging_profile_id")
        assertThat(messagingSettings.deliveryStatusWebhookUrl())
            .contains("delivery_status_webhook_url")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val messagingSettings =
            MessagingSettings.builder()
                .defaultMessagingProfileId("default_messaging_profile_id")
                .deliveryStatusWebhookUrl("delivery_status_webhook_url")
                .build()

        val roundtrippedMessagingSettings =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(messagingSettings),
                jacksonTypeRef<MessagingSettings>(),
            )

        assertThat(roundtrippedMessagingSettings).isEqualTo(messagingSettings)
    }
}
