// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.calls.actions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AiAssistantJoinParticipantTest {

    @Test
    fun create() {
        val aiAssistantJoinParticipant =
            AiAssistantJoinParticipant.builder()
                .id("v3:abc123def456")
                .role(AiAssistantJoinParticipant.Role.USER)
                .name("John Doe")
                .onHangup(AiAssistantJoinParticipant.OnHangup.CONTINUE_CONVERSATION)
                .build()

        assertThat(aiAssistantJoinParticipant.id()).isEqualTo("v3:abc123def456")
        assertThat(aiAssistantJoinParticipant.role())
            .isEqualTo(AiAssistantJoinParticipant.Role.USER)
        assertThat(aiAssistantJoinParticipant.name()).contains("John Doe")
        assertThat(aiAssistantJoinParticipant.onHangup())
            .contains(AiAssistantJoinParticipant.OnHangup.CONTINUE_CONVERSATION)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val aiAssistantJoinParticipant =
            AiAssistantJoinParticipant.builder()
                .id("v3:abc123def456")
                .role(AiAssistantJoinParticipant.Role.USER)
                .name("John Doe")
                .onHangup(AiAssistantJoinParticipant.OnHangup.CONTINUE_CONVERSATION)
                .build()

        val roundtrippedAiAssistantJoinParticipant =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(aiAssistantJoinParticipant),
                jacksonTypeRef<AiAssistantJoinParticipant>(),
            )

        assertThat(roundtrippedAiAssistantJoinParticipant).isEqualTo(aiAssistantJoinParticipant)
    }
}
