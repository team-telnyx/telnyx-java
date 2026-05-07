// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.calls.actions

import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.models.BookAppointmentToolParams
import com.telnyx.sdk.models.calls.CallAssistantRequest
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ActionStartAiAssistantParamsTest {

    @Test
    fun create() {
        ActionStartAiAssistantParams.builder()
            .callControlId("call_control_id")
            .assistant(
                CallAssistantRequest.builder()
                    .id("id")
                    .dynamicVariables(
                        CallAssistantRequest.DynamicVariables.builder()
                            .putAdditionalProperty("customer_name", JsonValue.from("John"))
                            .putAdditionalProperty("account_id", JsonValue.from("ACC-12345"))
                            .build()
                    )
                    .externalLlm(
                        CallAssistantRequest.ExternalLlm.builder()
                            .authenticationMethod(
                                CallAssistantRequest.ExternalLlm.AuthenticationMethod.TOKEN
                            )
                            .baseUrl("base_url")
                            .certificateRef("certificate_ref")
                            .forwardMetadata(true)
                            .llmApiKeyRef("llm_api_key_ref")
                            .model("model")
                            .tokenRetrievalUrl("token_retrieval_url")
                            .build()
                    )
                    .fallbackConfig(
                        CallAssistantRequest.FallbackConfig.builder()
                            .externalLlm(
                                CallAssistantRequest.FallbackConfig.ExternalLlm.builder()
                                    .authenticationMethod(
                                        CallAssistantRequest.FallbackConfig.ExternalLlm
                                            .AuthenticationMethod
                                            .TOKEN
                                    )
                                    .baseUrl("base_url")
                                    .certificateRef("certificate_ref")
                                    .forwardMetadata(true)
                                    .llmApiKeyRef("llm_api_key_ref")
                                    .model("model")
                                    .tokenRetrievalUrl("token_retrieval_url")
                                    .build()
                            )
                            .llmApiKeyRef("llm_api_key_ref")
                            .model("model")
                            .build()
                    )
                    .greeting("greeting")
                    .instructions("You are a friendly voice assistant.")
                    .llmApiKeyRef("my_llm_api_key")
                    .addMcpServer(
                        CallAssistantRequest.McpServer.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .model("gpt-4o")
                    .name("name")
                    .observabilitySettings(
                        CallAssistantRequest.ObservabilitySettings.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .openaiApiKeyRef("my_openai_api_key")
                    .addBookAppointmentTool(
                        BookAppointmentToolParams.builder()
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
                TranscriptionConfig.builder()
                    .language("auto")
                    .model(TranscriptionConfig.Model.DISTIL_WHISPER_DISTIL_LARGE_V2)
                    .build()
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
                    CallAssistantRequest.builder()
                        .id("id")
                        .dynamicVariables(
                            CallAssistantRequest.DynamicVariables.builder()
                                .putAdditionalProperty("customer_name", JsonValue.from("John"))
                                .putAdditionalProperty("account_id", JsonValue.from("ACC-12345"))
                                .build()
                        )
                        .externalLlm(
                            CallAssistantRequest.ExternalLlm.builder()
                                .authenticationMethod(
                                    CallAssistantRequest.ExternalLlm.AuthenticationMethod.TOKEN
                                )
                                .baseUrl("base_url")
                                .certificateRef("certificate_ref")
                                .forwardMetadata(true)
                                .llmApiKeyRef("llm_api_key_ref")
                                .model("model")
                                .tokenRetrievalUrl("token_retrieval_url")
                                .build()
                        )
                        .fallbackConfig(
                            CallAssistantRequest.FallbackConfig.builder()
                                .externalLlm(
                                    CallAssistantRequest.FallbackConfig.ExternalLlm.builder()
                                        .authenticationMethod(
                                            CallAssistantRequest.FallbackConfig.ExternalLlm
                                                .AuthenticationMethod
                                                .TOKEN
                                        )
                                        .baseUrl("base_url")
                                        .certificateRef("certificate_ref")
                                        .forwardMetadata(true)
                                        .llmApiKeyRef("llm_api_key_ref")
                                        .model("model")
                                        .tokenRetrievalUrl("token_retrieval_url")
                                        .build()
                                )
                                .llmApiKeyRef("llm_api_key_ref")
                                .model("model")
                                .build()
                        )
                        .greeting("greeting")
                        .instructions("You are a friendly voice assistant.")
                        .llmApiKeyRef("my_llm_api_key")
                        .addMcpServer(
                            CallAssistantRequest.McpServer.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .model("gpt-4o")
                        .name("name")
                        .observabilitySettings(
                            CallAssistantRequest.ObservabilitySettings.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .openaiApiKeyRef("my_openai_api_key")
                        .addBookAppointmentTool(
                            BookAppointmentToolParams.builder()
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
                    TranscriptionConfig.builder()
                        .language("auto")
                        .model(TranscriptionConfig.Model.DISTIL_WHISPER_DISTIL_LARGE_V2)
                        .build()
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
                CallAssistantRequest.builder()
                    .id("id")
                    .dynamicVariables(
                        CallAssistantRequest.DynamicVariables.builder()
                            .putAdditionalProperty("customer_name", JsonValue.from("John"))
                            .putAdditionalProperty("account_id", JsonValue.from("ACC-12345"))
                            .build()
                    )
                    .externalLlm(
                        CallAssistantRequest.ExternalLlm.builder()
                            .authenticationMethod(
                                CallAssistantRequest.ExternalLlm.AuthenticationMethod.TOKEN
                            )
                            .baseUrl("base_url")
                            .certificateRef("certificate_ref")
                            .forwardMetadata(true)
                            .llmApiKeyRef("llm_api_key_ref")
                            .model("model")
                            .tokenRetrievalUrl("token_retrieval_url")
                            .build()
                    )
                    .fallbackConfig(
                        CallAssistantRequest.FallbackConfig.builder()
                            .externalLlm(
                                CallAssistantRequest.FallbackConfig.ExternalLlm.builder()
                                    .authenticationMethod(
                                        CallAssistantRequest.FallbackConfig.ExternalLlm
                                            .AuthenticationMethod
                                            .TOKEN
                                    )
                                    .baseUrl("base_url")
                                    .certificateRef("certificate_ref")
                                    .forwardMetadata(true)
                                    .llmApiKeyRef("llm_api_key_ref")
                                    .model("model")
                                    .tokenRetrievalUrl("token_retrieval_url")
                                    .build()
                            )
                            .llmApiKeyRef("llm_api_key_ref")
                            .model("model")
                            .build()
                    )
                    .greeting("greeting")
                    .instructions("You are a friendly voice assistant.")
                    .llmApiKeyRef("my_llm_api_key")
                    .addMcpServer(
                        CallAssistantRequest.McpServer.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .model("gpt-4o")
                    .name("name")
                    .observabilitySettings(
                        CallAssistantRequest.ObservabilitySettings.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .openaiApiKeyRef("my_openai_api_key")
                    .addBookAppointmentTool(
                        BookAppointmentToolParams.builder()
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
            .contains(
                TranscriptionConfig.builder()
                    .language("auto")
                    .model(TranscriptionConfig.Model.DISTIL_WHISPER_DISTIL_LARGE_V2)
                    .build()
            )
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
