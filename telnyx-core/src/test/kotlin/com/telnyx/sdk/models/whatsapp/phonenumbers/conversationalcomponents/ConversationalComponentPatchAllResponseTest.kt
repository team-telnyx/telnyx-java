// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.whatsapp.phonenumbers.conversationalcomponents

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ConversationalComponentPatchAllResponseTest {

    @Test
    fun create() {
        val conversationalComponentPatchAllResponse =
            ConversationalComponentPatchAllResponse.builder()
                .data(
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
                )
                .build()

        assertThat(conversationalComponentPatchAllResponse.data())
            .contains(
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
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val conversationalComponentPatchAllResponse =
            ConversationalComponentPatchAllResponse.builder()
                .data(
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
                )
                .build()

        val roundtrippedConversationalComponentPatchAllResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(conversationalComponentPatchAllResponse),
                jacksonTypeRef<ConversationalComponentPatchAllResponse>(),
            )

        assertThat(roundtrippedConversationalComponentPatchAllResponse)
            .isEqualTo(conversationalComponentPatchAllResponse)
    }
}
