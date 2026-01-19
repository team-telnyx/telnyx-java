// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.calls.actions

import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.models.ai.assistants.Assistant
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ActionGatherUsingAiParamsTest {

    @Test
    fun create() {
        ActionGatherUsingAiParams.builder()
            .callControlId("call_control_id")
            .parameters(
                ActionGatherUsingAiParams.Parameters.builder()
                    .putAdditionalProperty("properties", JsonValue.from("bar"))
                    .putAdditionalProperty("required", JsonValue.from("bar"))
                    .putAdditionalProperty("type", JsonValue.from("bar"))
                    .build()
            )
            .assistant(
                Assistant.builder()
                    .instructions("You are a friendly voice assistant.")
                    .model("Qwen/Qwen3-235B-A22B")
                    .openaiApiKeyRef("my_openai_api_key")
                    .addBookAppointmentTool(
                        Assistant.Tool.BookAppointmentTool.BookAppointment.builder()
                            .apiKeyRef("my_calcom_api_key")
                            .eventTypeId(0L)
                            .attendeeName("attendee_name")
                            .attendeeTimezone("attendee_timezone")
                            .build()
                    )
                    .build()
            )
            .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
            .commandId("891510ac-f3e4-11e8-af5b-de00688a4901")
            .greeting("Hello, can you tell me your age and where you live?")
            .interruptionSettings(InterruptionSettings.builder().enable(true).build())
            .language(GoogleTranscriptionLanguage.EN)
            .addMessageHistory(
                ActionGatherUsingAiParams.MessageHistory.builder()
                    .content("Hello, what's your name?")
                    .role(ActionGatherUsingAiParams.MessageHistory.Role.ASSISTANT)
                    .build()
            )
            .addMessageHistory(
                ActionGatherUsingAiParams.MessageHistory.builder()
                    .content("Hello, I'm John.")
                    .role(ActionGatherUsingAiParams.MessageHistory.Role.USER)
                    .build()
            )
            .sendMessageHistoryUpdates(true)
            .sendPartialResults(true)
            .transcription(
                TranscriptionConfig.builder().model("distil-whisper/distil-large-v2").build()
            )
            .userResponseTimeoutMs(5000L)
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
        val params =
            ActionGatherUsingAiParams.builder()
                .callControlId("call_control_id")
                .parameters(
                    ActionGatherUsingAiParams.Parameters.builder()
                        .putAdditionalProperty("properties", JsonValue.from("bar"))
                        .putAdditionalProperty("required", JsonValue.from("bar"))
                        .putAdditionalProperty("type", JsonValue.from("bar"))
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
            ActionGatherUsingAiParams.builder()
                .callControlId("call_control_id")
                .parameters(
                    ActionGatherUsingAiParams.Parameters.builder()
                        .putAdditionalProperty("properties", JsonValue.from("bar"))
                        .putAdditionalProperty("required", JsonValue.from("bar"))
                        .putAdditionalProperty("type", JsonValue.from("bar"))
                        .build()
                )
                .assistant(
                    Assistant.builder()
                        .instructions("You are a friendly voice assistant.")
                        .model("Qwen/Qwen3-235B-A22B")
                        .openaiApiKeyRef("my_openai_api_key")
                        .addBookAppointmentTool(
                            Assistant.Tool.BookAppointmentTool.BookAppointment.builder()
                                .apiKeyRef("my_calcom_api_key")
                                .eventTypeId(0L)
                                .attendeeName("attendee_name")
                                .attendeeTimezone("attendee_timezone")
                                .build()
                        )
                        .build()
                )
                .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                .commandId("891510ac-f3e4-11e8-af5b-de00688a4901")
                .greeting("Hello, can you tell me your age and where you live?")
                .interruptionSettings(InterruptionSettings.builder().enable(true).build())
                .language(GoogleTranscriptionLanguage.EN)
                .addMessageHistory(
                    ActionGatherUsingAiParams.MessageHistory.builder()
                        .content("Hello, what's your name?")
                        .role(ActionGatherUsingAiParams.MessageHistory.Role.ASSISTANT)
                        .build()
                )
                .addMessageHistory(
                    ActionGatherUsingAiParams.MessageHistory.builder()
                        .content("Hello, I'm John.")
                        .role(ActionGatherUsingAiParams.MessageHistory.Role.USER)
                        .build()
                )
                .sendMessageHistoryUpdates(true)
                .sendPartialResults(true)
                .transcription(
                    TranscriptionConfig.builder().model("distil-whisper/distil-large-v2").build()
                )
                .userResponseTimeoutMs(5000L)
                .voice("Telnyx.KokoroTTS.af")
                .voiceSettings(
                    ElevenLabsVoiceSettings.builder()
                        .type(ElevenLabsVoiceSettings.Type.ELEVENLABS)
                        .apiKeyRef("my_elevenlabs_api_key")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.parameters())
            .isEqualTo(
                ActionGatherUsingAiParams.Parameters.builder()
                    .putAdditionalProperty("properties", JsonValue.from("bar"))
                    .putAdditionalProperty("required", JsonValue.from("bar"))
                    .putAdditionalProperty("type", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.assistant())
            .contains(
                Assistant.builder()
                    .instructions("You are a friendly voice assistant.")
                    .model("Qwen/Qwen3-235B-A22B")
                    .openaiApiKeyRef("my_openai_api_key")
                    .addBookAppointmentTool(
                        Assistant.Tool.BookAppointmentTool.BookAppointment.builder()
                            .apiKeyRef("my_calcom_api_key")
                            .eventTypeId(0L)
                            .attendeeName("attendee_name")
                            .attendeeTimezone("attendee_timezone")
                            .build()
                    )
                    .build()
            )
        assertThat(body.clientState()).contains("aGF2ZSBhIG5pY2UgZGF5ID1d")
        assertThat(body.commandId()).contains("891510ac-f3e4-11e8-af5b-de00688a4901")
        assertThat(body.greeting()).contains("Hello, can you tell me your age and where you live?")
        assertThat(body.interruptionSettings())
            .contains(InterruptionSettings.builder().enable(true).build())
        assertThat(body.language()).contains(GoogleTranscriptionLanguage.EN)
        assertThat(body.messageHistory().getOrNull())
            .containsExactly(
                ActionGatherUsingAiParams.MessageHistory.builder()
                    .content("Hello, what's your name?")
                    .role(ActionGatherUsingAiParams.MessageHistory.Role.ASSISTANT)
                    .build(),
                ActionGatherUsingAiParams.MessageHistory.builder()
                    .content("Hello, I'm John.")
                    .role(ActionGatherUsingAiParams.MessageHistory.Role.USER)
                    .build(),
            )
        assertThat(body.sendMessageHistoryUpdates()).contains(true)
        assertThat(body.sendPartialResults()).contains(true)
        assertThat(body.transcription())
            .contains(TranscriptionConfig.builder().model("distil-whisper/distil-large-v2").build())
        assertThat(body.userResponseTimeoutMs()).contains(5000L)
        assertThat(body.voice()).contains("Telnyx.KokoroTTS.af")
        assertThat(body.voiceSettings())
            .contains(
                ActionGatherUsingAiParams.VoiceSettings.ofElevenlabs(
                    ElevenLabsVoiceSettings.builder()
                        .type(ElevenLabsVoiceSettings.Type.ELEVENLABS)
                        .apiKeyRef("my_elevenlabs_api_key")
                        .build()
                )
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ActionGatherUsingAiParams.builder()
                .callControlId("call_control_id")
                .parameters(
                    ActionGatherUsingAiParams.Parameters.builder()
                        .putAdditionalProperty("properties", JsonValue.from("bar"))
                        .putAdditionalProperty("required", JsonValue.from("bar"))
                        .putAdditionalProperty("type", JsonValue.from("bar"))
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.parameters())
            .isEqualTo(
                ActionGatherUsingAiParams.Parameters.builder()
                    .putAdditionalProperty("properties", JsonValue.from("bar"))
                    .putAdditionalProperty("required", JsonValue.from("bar"))
                    .putAdditionalProperty("type", JsonValue.from("bar"))
                    .build()
            )
    }
}
