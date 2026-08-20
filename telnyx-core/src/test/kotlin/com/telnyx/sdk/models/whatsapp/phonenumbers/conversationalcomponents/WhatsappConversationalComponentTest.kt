// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.whatsapp.phonenumbers.conversationalcomponents

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WhatsappConversationalComponentTest {

    @Test
    fun create() {
        val whatsappConversationalComponent =
            WhatsappConversationalComponent.builder()
                .addCommand(
                    WhatsappConversationalComponent.Command.builder()
                        .command("command")
                        .description("description")
                        .build()
                )
                .addIceBreaker("string")
                .phoneNumber("phone_number")
                .recordType("whatsapp_conversational_component")
                .build()

        assertThat(whatsappConversationalComponent.commands().getOrNull())
            .containsExactly(
                WhatsappConversationalComponent.Command.builder()
                    .command("command")
                    .description("description")
                    .build()
            )
        assertThat(whatsappConversationalComponent.iceBreakers().getOrNull())
            .containsExactly("string")
        assertThat(whatsappConversationalComponent.phoneNumber()).contains("phone_number")
        assertThat(whatsappConversationalComponent.recordType())
            .contains("whatsapp_conversational_component")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val whatsappConversationalComponent =
            WhatsappConversationalComponent.builder()
                .addCommand(
                    WhatsappConversationalComponent.Command.builder()
                        .command("command")
                        .description("description")
                        .build()
                )
                .addIceBreaker("string")
                .phoneNumber("phone_number")
                .recordType("whatsapp_conversational_component")
                .build()

        val roundtrippedWhatsappConversationalComponent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(whatsappConversationalComponent),
                jacksonTypeRef<WhatsappConversationalComponent>(),
            )

        assertThat(roundtrippedWhatsappConversationalComponent)
            .isEqualTo(whatsappConversationalComponent)
    }
}
