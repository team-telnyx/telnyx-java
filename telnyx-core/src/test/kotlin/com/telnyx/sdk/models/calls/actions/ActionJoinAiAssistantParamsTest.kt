// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.calls.actions

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ActionJoinAiAssistantParamsTest {

    @Test
    fun create() {
        ActionJoinAiAssistantParams.builder()
            .callControlId("call_control_id")
            .conversationId("v3:abc123")
            .participant(
                ActionJoinAiAssistantParams.Participant.builder()
                    .id("v3:abc123def456")
                    .role(ActionJoinAiAssistantParams.Participant.Role.USER)
                    .name("John Doe")
                    .onHangup(
                        ActionJoinAiAssistantParams.Participant.OnHangup.CONTINUE_CONVERSATION
                    )
                    .build()
            )
            .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
            .commandId("891510ac-f3e4-11e8-af5b-de00688a4901")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ActionJoinAiAssistantParams.builder()
                .callControlId("call_control_id")
                .conversationId("v3:abc123")
                .participant(
                    ActionJoinAiAssistantParams.Participant.builder()
                        .id("v3:abc123def456")
                        .role(ActionJoinAiAssistantParams.Participant.Role.USER)
                        .build()
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("call_control_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            ActionJoinAiAssistantParams.builder()
                .callControlId("call_control_id")
                .conversationId("v3:abc123")
                .participant(
                    ActionJoinAiAssistantParams.Participant.builder()
                        .id("v3:abc123def456")
                        .role(ActionJoinAiAssistantParams.Participant.Role.USER)
                        .name("John Doe")
                        .onHangup(
                            ActionJoinAiAssistantParams.Participant.OnHangup.CONTINUE_CONVERSATION
                        )
                        .build()
                )
                .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                .commandId("891510ac-f3e4-11e8-af5b-de00688a4901")
                .build()

        val body = params._body()

        assertThat(body.conversationId()).isEqualTo("v3:abc123")
        assertThat(body.participant())
            .isEqualTo(
                ActionJoinAiAssistantParams.Participant.builder()
                    .id("v3:abc123def456")
                    .role(ActionJoinAiAssistantParams.Participant.Role.USER)
                    .name("John Doe")
                    .onHangup(
                        ActionJoinAiAssistantParams.Participant.OnHangup.CONTINUE_CONVERSATION
                    )
                    .build()
            )
        assertThat(body.clientState()).contains("aGF2ZSBhIG5pY2UgZGF5ID1d")
        assertThat(body.commandId()).contains("891510ac-f3e4-11e8-af5b-de00688a4901")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ActionJoinAiAssistantParams.builder()
                .callControlId("call_control_id")
                .conversationId("v3:abc123")
                .participant(
                    ActionJoinAiAssistantParams.Participant.builder()
                        .id("v3:abc123def456")
                        .role(ActionJoinAiAssistantParams.Participant.Role.USER)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.conversationId()).isEqualTo("v3:abc123")
        assertThat(body.participant())
            .isEqualTo(
                ActionJoinAiAssistantParams.Participant.builder()
                    .id("v3:abc123def456")
                    .role(ActionJoinAiAssistantParams.Participant.Role.USER)
                    .build()
            )
    }
}
