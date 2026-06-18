// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.messages

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WhatsappReactionTest {

    @Test
    fun create() {
        val whatsappReaction =
            WhatsappReaction.builder().emoji("emoji").messageId("message_id").build()

        assertThat(whatsappReaction.emoji()).contains("emoji")
        assertThat(whatsappReaction.messageId()).contains("message_id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val whatsappReaction =
            WhatsappReaction.builder().emoji("emoji").messageId("message_id").build()

        val roundtrippedWhatsappReaction =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(whatsappReaction),
                jacksonTypeRef<WhatsappReaction>(),
            )

        assertThat(roundtrippedWhatsappReaction).isEqualTo(whatsappReaction)
    }
}
