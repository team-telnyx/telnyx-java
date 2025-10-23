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
                JsonValue.from(
                    mapOf(
                        "properties" to
                            mapOf(
                                "age" to
                                    mapOf(
                                        "description" to "The age of the customer.",
                                        "type" to "integer",
                                    ),
                                "location" to
                                    mapOf(
                                        "description" to "The location of the customer.",
                                        "type" to "string",
                                    ),
                            ),
                        "required" to listOf("age", "location"),
                        "type" to "object",
                    )
                )
            )
            .assistant(
                Assistant.builder()
                    .instructions("You are a friendly voice assistant.")
                    .model("meta-llama/Meta-Llama-3.1-70B-Instruct")
                    .openaiApiKeyRef("my_openai_api_key")
                    .addTool(
                        Assistant.Tool.BookAppointmentTool.builder()
                            .bookAppointment(
                                Assistant.Tool.BookAppointmentTool.BookAppointment.builder()
                                    .apiKeyRef("my_calcom_api_key")
                                    .eventTypeId(0L)
                                    .attendeeName("attendee_name")
                                    .attendeeTimezone("attendee_timezone")
                                    .build()
                            )
                            .type(Assistant.Tool.BookAppointmentTool.Type.BOOK_APPOINTMENT)
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
                ElevenLabsVoiceSettings.builder().apiKeyRef("my_elevenlabs_api_key").build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ActionGatherUsingAiParams.builder()
                .callControlId("call_control_id")
                .parameters(
                    JsonValue.from(
                        mapOf(
                            "properties" to
                                mapOf(
                                    "age" to
                                        mapOf(
                                            "description" to "The age of the customer.",
                                            "type" to "integer",
                                        ),
                                    "location" to
                                        mapOf(
                                            "description" to "The location of the customer.",
                                            "type" to "string",
                                        ),
                                ),
                            "required" to listOf("age", "location"),
                            "type" to "object",
                        )
                    )
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
                    JsonValue.from(
                        mapOf(
                            "properties" to
                                mapOf(
                                    "age" to
                                        mapOf(
                                            "description" to "The age of the customer.",
                                            "type" to "integer",
                                        ),
                                    "location" to
                                        mapOf(
                                            "description" to "The location of the customer.",
                                            "type" to "string",
                                        ),
                                ),
                            "required" to listOf("age", "location"),
                            "type" to "object",
                        )
                    )
                )
                .assistant(
                    Assistant.builder()
                        .instructions("You are a friendly voice assistant.")
                        .model("meta-llama/Meta-Llama-3.1-70B-Instruct")
                        .openaiApiKeyRef("my_openai_api_key")
                        .addTool(
                            Assistant.Tool.BookAppointmentTool.builder()
                                .bookAppointment(
                                    Assistant.Tool.BookAppointmentTool.BookAppointment.builder()
                                        .apiKeyRef("my_calcom_api_key")
                                        .eventTypeId(0L)
                                        .attendeeName("attendee_name")
                                        .attendeeTimezone("attendee_timezone")
                                        .build()
                                )
                                .type(Assistant.Tool.BookAppointmentTool.Type.BOOK_APPOINTMENT)
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
                    ElevenLabsVoiceSettings.builder().apiKeyRef("my_elevenlabs_api_key").build()
                )
                .build()

        val body = params._body()

        assertThat(body._parameters())
            .isEqualTo(
                JsonValue.from(
                    mapOf(
                        "properties" to
                            mapOf(
                                "age" to
                                    mapOf(
                                        "description" to "The age of the customer.",
                                        "type" to "integer",
                                    ),
                                "location" to
                                    mapOf(
                                        "description" to "The location of the customer.",
                                        "type" to "string",
                                    ),
                            ),
                        "required" to listOf("age", "location"),
                        "type" to "object",
                    )
                )
            )
        assertThat(body.assistant())
            .contains(
                Assistant.builder()
                    .instructions("You are a friendly voice assistant.")
                    .model("meta-llama/Meta-Llama-3.1-70B-Instruct")
                    .openaiApiKeyRef("my_openai_api_key")
                    .addTool(
                        Assistant.Tool.BookAppointmentTool.builder()
                            .bookAppointment(
                                Assistant.Tool.BookAppointmentTool.BookAppointment.builder()
                                    .apiKeyRef("my_calcom_api_key")
                                    .eventTypeId(0L)
                                    .attendeeName("attendee_name")
                                    .attendeeTimezone("attendee_timezone")
                                    .build()
                            )
                            .type(Assistant.Tool.BookAppointmentTool.Type.BOOK_APPOINTMENT)
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
                ActionGatherUsingAiParams.VoiceSettings.ofElevenLabs(
                    ElevenLabsVoiceSettings.builder().apiKeyRef("my_elevenlabs_api_key").build()
                )
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ActionGatherUsingAiParams.builder()
                .callControlId("call_control_id")
                .parameters(
                    JsonValue.from(
                        mapOf(
                            "properties" to
                                mapOf(
                                    "age" to
                                        mapOf(
                                            "description" to "The age of the customer.",
                                            "type" to "integer",
                                        ),
                                    "location" to
                                        mapOf(
                                            "description" to "The location of the customer.",
                                            "type" to "string",
                                        ),
                                ),
                            "required" to listOf("age", "location"),
                            "type" to "object",
                        )
                    )
                )
                .build()

        val body = params._body()

        assertThat(body._parameters())
            .isEqualTo(
                JsonValue.from(
                    mapOf(
                        "properties" to
                            mapOf(
                                "age" to
                                    mapOf(
                                        "description" to "The age of the customer.",
                                        "type" to "integer",
                                    ),
                                "location" to
                                    mapOf(
                                        "description" to "The location of the customer.",
                                        "type" to "string",
                                    ),
                            ),
                        "required" to listOf("age", "location"),
                        "type" to "object",
                    )
                )
            )
    }
}
