// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.whatsapp.phonenumbers.conversationalcomponents

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ConversationalComponentListResponseTest {

    @Test
    fun create() {
        val conversationalComponentListResponse =
            ConversationalComponentListResponse.builder()
                .data(
                    ConversationalComponentListResponse.Data.builder()
                        .addCommand(
                            ConversationalComponentListResponse.Data.Command.builder()
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

        assertThat(conversationalComponentListResponse.data())
            .contains(
                ConversationalComponentListResponse.Data.builder()
                    .addCommand(
                        ConversationalComponentListResponse.Data.Command.builder()
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
        val conversationalComponentListResponse =
            ConversationalComponentListResponse.builder()
                .data(
                    ConversationalComponentListResponse.Data.builder()
                        .addCommand(
                            ConversationalComponentListResponse.Data.Command.builder()
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

        val roundtrippedConversationalComponentListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(conversationalComponentListResponse),
                jacksonTypeRef<ConversationalComponentListResponse>(),
            )

        assertThat(roundtrippedConversationalComponentListResponse)
            .isEqualTo(conversationalComponentListResponse)
    }
}
