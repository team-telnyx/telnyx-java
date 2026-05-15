// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.calls.actions

import com.telnyx.sdk.core.JsonValue
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ActionStartConversationRelayParamsTest {

    @Test
    fun create() {
        ActionStartConversationRelayParams.builder()
            .callControlId("call_control_id")
            .assistant(
                ActionStartConversationRelayParams.Assistant.builder()
                    .dynamicVariables(
                        ActionStartConversationRelayParams.Assistant.DynamicVariables.builder()
                            .putAdditionalProperty("customer_id", JsonValue.from("12345"))
                            .build()
                    )
                    .build()
            )
            .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
            .commandId("891510ac-f3e4-11e8-af5b-de00688a4901")
            .conversationRelayDtmfDetection(true)
            .conversationRelaySettings(
                ActionStartConversationRelayParams.ConversationRelaySettings.builder()
                    .url("wss://example.com/conversation-relay")
                    .dtmfDetection(true)
                    .interruptible(
                        ActionStartConversationRelayParams.ConversationRelaySettings.Interruptible
                            .SPEECH
                    )
                    .interruptibleGreeting(
                        ActionStartConversationRelayParams.ConversationRelaySettings
                            .InterruptibleGreeting
                            .ANY
                    )
                    .addLanguage(
                        ActionStartConversationRelayParams.ConversationRelaySettings.Language
                            .builder()
                            .code("en-US")
                            .speechModel("nova-2")
                            .transcriptionProvider("Deepgram")
                            .ttsProvider("ElevenLabs")
                            .voice("alice")
                            .build()
                    )
                    .build()
            )
            .conversationRelayUrl("wss://example.com/conversation-relay")
            .greeting("Hi! Ask me anything!")
            .interruptionSettings(
                ActionStartConversationRelayParams.InterruptionSettings.builder()
                    .enable(true)
                    .interruptible(
                        ActionStartConversationRelayParams.InterruptionSettings.Interruptible.SPEECH
                    )
                    .interruptibleGreeting(
                        ActionStartConversationRelayParams.InterruptionSettings
                            .InterruptibleGreeting
                            .SPEECH
                    )
                    .welcomeGreetingInterruptible(
                        ActionStartConversationRelayParams.InterruptionSettings
                            .WelcomeGreetingInterruptible
                            .SPEECH
                    )
                    .build()
            )
            .language("en-US")
            .addLanguage(
                ActionStartConversationRelayParams.Language.builder()
                    .code("en-US")
                    .speechModel("nova-2")
                    .transcriptionProvider("Deepgram")
                    .ttsProvider("ElevenLabs")
                    .voice("alice")
                    .build()
            )
            .transcription(
                ActionStartConversationRelayParams.Transcription.builder()
                    .language("en-US")
                    .model("nova-2")
                    .provider("deepgram")
                    .build()
            )
            .transcriptionLanguage("en-US")
            .ttsLanguage("es")
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
            ActionStartConversationRelayParams.builder().callControlId("call_control_id").build()

        assertThat(params._pathParam(0)).isEqualTo("call_control_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            ActionStartConversationRelayParams.builder()
                .callControlId("call_control_id")
                .assistant(
                    ActionStartConversationRelayParams.Assistant.builder()
                        .dynamicVariables(
                            ActionStartConversationRelayParams.Assistant.DynamicVariables.builder()
                                .putAdditionalProperty("customer_id", JsonValue.from("12345"))
                                .build()
                        )
                        .build()
                )
                .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                .commandId("891510ac-f3e4-11e8-af5b-de00688a4901")
                .conversationRelayDtmfDetection(true)
                .conversationRelaySettings(
                    ActionStartConversationRelayParams.ConversationRelaySettings.builder()
                        .url("wss://example.com/conversation-relay")
                        .dtmfDetection(true)
                        .interruptible(
                            ActionStartConversationRelayParams.ConversationRelaySettings
                                .Interruptible
                                .SPEECH
                        )
                        .interruptibleGreeting(
                            ActionStartConversationRelayParams.ConversationRelaySettings
                                .InterruptibleGreeting
                                .ANY
                        )
                        .addLanguage(
                            ActionStartConversationRelayParams.ConversationRelaySettings.Language
                                .builder()
                                .code("en-US")
                                .speechModel("nova-2")
                                .transcriptionProvider("Deepgram")
                                .ttsProvider("ElevenLabs")
                                .voice("alice")
                                .build()
                        )
                        .build()
                )
                .conversationRelayUrl("wss://example.com/conversation-relay")
                .greeting("Hi! Ask me anything!")
                .interruptionSettings(
                    ActionStartConversationRelayParams.InterruptionSettings.builder()
                        .enable(true)
                        .interruptible(
                            ActionStartConversationRelayParams.InterruptionSettings.Interruptible
                                .SPEECH
                        )
                        .interruptibleGreeting(
                            ActionStartConversationRelayParams.InterruptionSettings
                                .InterruptibleGreeting
                                .SPEECH
                        )
                        .welcomeGreetingInterruptible(
                            ActionStartConversationRelayParams.InterruptionSettings
                                .WelcomeGreetingInterruptible
                                .SPEECH
                        )
                        .build()
                )
                .language("en-US")
                .addLanguage(
                    ActionStartConversationRelayParams.Language.builder()
                        .code("en-US")
                        .speechModel("nova-2")
                        .transcriptionProvider("Deepgram")
                        .ttsProvider("ElevenLabs")
                        .voice("alice")
                        .build()
                )
                .transcription(
                    ActionStartConversationRelayParams.Transcription.builder()
                        .language("en-US")
                        .model("nova-2")
                        .provider("deepgram")
                        .build()
                )
                .transcriptionLanguage("en-US")
                .ttsLanguage("es")
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
                ActionStartConversationRelayParams.Assistant.builder()
                    .dynamicVariables(
                        ActionStartConversationRelayParams.Assistant.DynamicVariables.builder()
                            .putAdditionalProperty("customer_id", JsonValue.from("12345"))
                            .build()
                    )
                    .build()
            )
        assertThat(body.clientState()).contains("aGF2ZSBhIG5pY2UgZGF5ID1d")
        assertThat(body.commandId()).contains("891510ac-f3e4-11e8-af5b-de00688a4901")
        assertThat(body.conversationRelayDtmfDetection()).contains(true)
        assertThat(body.conversationRelaySettings())
            .contains(
                ActionStartConversationRelayParams.ConversationRelaySettings.builder()
                    .url("wss://example.com/conversation-relay")
                    .dtmfDetection(true)
                    .interruptible(
                        ActionStartConversationRelayParams.ConversationRelaySettings.Interruptible
                            .SPEECH
                    )
                    .interruptibleGreeting(
                        ActionStartConversationRelayParams.ConversationRelaySettings
                            .InterruptibleGreeting
                            .ANY
                    )
                    .addLanguage(
                        ActionStartConversationRelayParams.ConversationRelaySettings.Language
                            .builder()
                            .code("en-US")
                            .speechModel("nova-2")
                            .transcriptionProvider("Deepgram")
                            .ttsProvider("ElevenLabs")
                            .voice("alice")
                            .build()
                    )
                    .build()
            )
        assertThat(body.conversationRelayUrl()).contains("wss://example.com/conversation-relay")
        assertThat(body.greeting()).contains("Hi! Ask me anything!")
        assertThat(body.interruptionSettings())
            .contains(
                ActionStartConversationRelayParams.InterruptionSettings.builder()
                    .enable(true)
                    .interruptible(
                        ActionStartConversationRelayParams.InterruptionSettings.Interruptible.SPEECH
                    )
                    .interruptibleGreeting(
                        ActionStartConversationRelayParams.InterruptionSettings
                            .InterruptibleGreeting
                            .SPEECH
                    )
                    .welcomeGreetingInterruptible(
                        ActionStartConversationRelayParams.InterruptionSettings
                            .WelcomeGreetingInterruptible
                            .SPEECH
                    )
                    .build()
            )
        assertThat(body.language()).contains("en-US")
        assertThat(body.languages().getOrNull())
            .containsExactly(
                ActionStartConversationRelayParams.Language.builder()
                    .code("en-US")
                    .speechModel("nova-2")
                    .transcriptionProvider("Deepgram")
                    .ttsProvider("ElevenLabs")
                    .voice("alice")
                    .build()
            )
        assertThat(body.transcription())
            .contains(
                ActionStartConversationRelayParams.Transcription.builder()
                    .language("en-US")
                    .model("nova-2")
                    .provider("deepgram")
                    .build()
            )
        assertThat(body.transcriptionLanguage()).contains("en-US")
        assertThat(body.ttsLanguage()).contains("es")
        assertThat(body.voice()).contains("Telnyx.KokoroTTS.af")
        assertThat(body.voiceSettings())
            .contains(
                ActionStartConversationRelayParams.VoiceSettings.ofElevenlabs(
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
            ActionStartConversationRelayParams.builder().callControlId("call_control_id").build()

        val body = params._body()
    }
}
