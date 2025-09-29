// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.calls.actions

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
            .transcription(
                TranscriptionConfig.builder().model("distil-whisper/distil-large-v2").build()
            )
            .voice("Telnyx.KokoroTTS.af")
            .voiceSettings(
                ElevenLabsVoiceSettings.builder().apiKeyRef("my_elevenlabs_api_key").build()
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
                .transcription(
                    TranscriptionConfig.builder().model("distil-whisper/distil-large-v2").build()
                )
                .voice("Telnyx.KokoroTTS.af")
                .voiceSettings(
                    ElevenLabsVoiceSettings.builder().apiKeyRef("my_elevenlabs_api_key").build()
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
        assertThat(body.transcription())
            .contains(TranscriptionConfig.builder().model("distil-whisper/distil-large-v2").build())
        assertThat(body.voice()).contains("Telnyx.KokoroTTS.af")
        assertThat(body.voiceSettings())
            .contains(
                ActionStartAiAssistantParams.VoiceSettings.ofElevenLabs(
                    ElevenLabsVoiceSettings.builder().apiKeyRef("my_elevenlabs_api_key").build()
                )
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = ActionStartAiAssistantParams.builder().callControlId("call_control_id").build()

        val body = params._body()
    }
}
