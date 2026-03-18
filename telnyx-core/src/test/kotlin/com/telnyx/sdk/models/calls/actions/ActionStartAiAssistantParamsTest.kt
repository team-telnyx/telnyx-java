// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.calls.actions

import com.telnyx.sdk.core.JsonValue
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ActionStartAiAssistantParamsTest {

    @Test
    fun create() {
        ActionStartAiAssistantParams.builder()
            .callControlId("call_control_id")
            .assistant(
                ActionStartAiAssistantParams.Assistant.builder()
                    .id("id")
                    .instructions("You are a friendly voice assistant.")
                    .openaiApiKeyRef("openai_api_key_ref")
                    .build()
            )
            .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
            .commandId("891510ac-f3e4-11e8-af5b-de00688a4901")
            .greeting("Hello, can you tell me your age and where you live?")
            .interruptionSettings(InterruptionSettings.builder().enable(true).build())
            .addMessageHistory(
                ActionStartAiAssistantParams.MessageHistory.User.builder()
                    .content("Hello, I would like some help.")
                    .metadata(
                        ActionStartAiAssistantParams.MessageHistory.User.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .build()
            )
            .addParticipant(
                ActionStartAiAssistantParams.Participant.builder()
                    .id("v3:abc123def456")
                    .role(ActionStartAiAssistantParams.Participant.Role.USER)
                    .name("John Doe")
                    .onHangup(
                        ActionStartAiAssistantParams.Participant.OnHangup.CONTINUE_CONVERSATION
                    )
                    .build()
            )
            .sendMessageHistoryUpdates(true)
            .transcription(
                TranscriptionConfig.builder().model("distil-whisper/distil-large-v2").build()
            )
            .voice("Telnyx.KokoroTTS.af")
            .voiceSettings(
                ElevenLabsVoiceSettings.builder()
                    .type(ElevenLabsVoiceSettings.Type.ELEVENLABS)
                    .apiKeyRef("my_elevenlabs_api_key")
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params = ActionStartAiAssistantParams.builder().callControlId("call_control_id").build()

        assertThat(params._pathParam(0)).isEqualTo("call_control_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            ActionStartAiAssistantParams.builder()
                .callControlId("call_control_id")
                .assistant(
                    ActionStartAiAssistantParams.Assistant.builder()
                        .id("id")
                        .instructions("You are a friendly voice assistant.")
                        .openaiApiKeyRef("openai_api_key_ref")
                        .build()
                )
                .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                .commandId("891510ac-f3e4-11e8-af5b-de00688a4901")
                .greeting("Hello, can you tell me your age and where you live?")
                .interruptionSettings(InterruptionSettings.builder().enable(true).build())
                .addMessageHistory(
                    ActionStartAiAssistantParams.MessageHistory.User.builder()
                        .content("Hello, I would like some help.")
                        .metadata(
                            ActionStartAiAssistantParams.MessageHistory.User.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .build()
                )
                .addParticipant(
                    ActionStartAiAssistantParams.Participant.builder()
                        .id("v3:abc123def456")
                        .role(ActionStartAiAssistantParams.Participant.Role.USER)
                        .name("John Doe")
                        .onHangup(
                            ActionStartAiAssistantParams.Participant.OnHangup.CONTINUE_CONVERSATION
                        )
                        .build()
                )
                .sendMessageHistoryUpdates(true)
                .transcription(
                    TranscriptionConfig.builder().model("distil-whisper/distil-large-v2").build()
                )
                .voice("Telnyx.KokoroTTS.af")
                .voiceSettings(
                    ElevenLabsVoiceSettings.builder()
                        .type(ElevenLabsVoiceSettings.Type.ELEVENLABS)
                        .apiKeyRef("my_elevenlabs_api_key")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.assistant())
            .contains(
                ActionStartAiAssistantParams.Assistant.builder()
                    .id("id")
                    .instructions("You are a friendly voice assistant.")
                    .openaiApiKeyRef("openai_api_key_ref")
                    .build()
            )
        assertThat(body.clientState()).contains("aGF2ZSBhIG5pY2UgZGF5ID1d")
        assertThat(body.commandId()).contains("891510ac-f3e4-11e8-af5b-de00688a4901")
        assertThat(body.greeting()).contains("Hello, can you tell me your age and where you live?")
        assertThat(body.interruptionSettings())
            .contains(InterruptionSettings.builder().enable(true).build())
        assertThat(body.messageHistory().getOrNull())
            .containsExactly(
                ActionStartAiAssistantParams.MessageHistory.ofUser(
                    ActionStartAiAssistantParams.MessageHistory.User.builder()
                        .content("Hello, I would like some help.")
                        .metadata(
                            ActionStartAiAssistantParams.MessageHistory.User.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .build()
                )
            )
        assertThat(body.participants().getOrNull())
            .containsExactly(
                ActionStartAiAssistantParams.Participant.builder()
                    .id("v3:abc123def456")
                    .role(ActionStartAiAssistantParams.Participant.Role.USER)
                    .name("John Doe")
                    .onHangup(
                        ActionStartAiAssistantParams.Participant.OnHangup.CONTINUE_CONVERSATION
                    )
                    .build()
            )
        assertThat(body.sendMessageHistoryUpdates()).contains(true)
        assertThat(body.transcription())
            .contains(TranscriptionConfig.builder().model("distil-whisper/distil-large-v2").build())
        assertThat(body.voice()).contains("Telnyx.KokoroTTS.af")
        assertThat(body.voiceSettings())
            .contains(
                ActionStartAiAssistantParams.VoiceSettings.ofElevenlabs(
                    ElevenLabsVoiceSettings.builder()
                        .type(ElevenLabsVoiceSettings.Type.ELEVENLABS)
                        .apiKeyRef("my_elevenlabs_api_key")
                        .build()
                )
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = ActionStartAiAssistantParams.builder().callControlId("call_control_id").build()

        val body = params._body()
    }
}
