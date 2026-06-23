// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.calls.actions

import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.models.calls.ConversationRelayInterruptionSettings
import com.telnyx.sdk.models.calls.ConversationRelayLanguage
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
                            .putAdditionalProperty("tier", JsonValue.from("premium"))
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
                    .interruptible(ConversationRelayInterruptible.SPEECH)
                    .interruptibleGreeting(ConversationRelayInterruptible.DTMF)
                    .addLanguage(
                        ConversationRelayLanguage.builder()
                            .language("en-US")
                            .speechModel("nova-3")
                            .transcriptionEngine(
                                ConversationRelayLanguage.TranscriptionEngine.DEEPGRAM
                            )
                            .transcriptionEngineConfig(
                                ConversationRelayLanguage.TranscriptionEngineConfig.builder()
                                    .putAdditionalProperty(
                                        "transcription_model",
                                        JsonValue.from("bar"),
                                    )
                                    .build()
                            )
                            .transcriptionProvider("Deepgram")
                            .ttsProvider("telnyx")
                            .voice("Telnyx.KokoroTTS.af")
                            .voiceSettings(
                                ElevenLabsVoiceSettings.builder()
                                    .type(ElevenLabsVoiceSettings.Type.ELEVENLABS)
                                    .apiKeyRef("my_elevenlabs_api_key")
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )
            .conversationRelayUrl("wss://example.com/conversation-relay")
            .customParameters(
                ActionStartConversationRelayParams.CustomParameters.builder()
                    .putAdditionalProperty("customer_id", JsonValue.from("bar"))
                    .build()
            )
            .dtmfDetection(true)
            .greeting("Hi! Ask me anything!")
            .interruptible(ConversationRelayInterruptible.SPEECH)
            .interruptibleGreeting(ConversationRelayInterruptible.DTMF)
            .interruptionSettings(
                ConversationRelayInterruptionSettings.builder()
                    .enable(true)
                    .interruptible(ConversationRelayInterruptible.SPEECH)
                    .interruptibleGreeting(ConversationRelayInterruptible.SPEECH)
                    .welcomeGreetingInterruptible(ConversationRelayInterruptible.SPEECH)
                    .build()
            )
            .language("en-US")
            .addLanguage(
                ConversationRelayLanguage.builder()
                    .language("en-US")
                    .speechModel("nova-3")
                    .transcriptionEngine(ConversationRelayLanguage.TranscriptionEngine.DEEPGRAM)
                    .transcriptionEngineConfig(
                        ConversationRelayLanguage.TranscriptionEngineConfig.builder()
                            .putAdditionalProperty("transcription_model", JsonValue.from("bar"))
                            .build()
                    )
                    .transcriptionProvider("Deepgram")
                    .ttsProvider("telnyx")
                    .voice("Telnyx.KokoroTTS.af")
                    .voiceSettings(
                        ElevenLabsVoiceSettings.builder()
                            .type(ElevenLabsVoiceSettings.Type.ELEVENLABS)
                            .apiKeyRef("my_elevenlabs_api_key")
                            .build()
                    )
                    .build()
            )
            .provider("elevenlabs")
            .structuredProvider(
                ActionStartConversationRelayParams.StructuredProvider.builder()
                    .putAdditionalProperty("voice_id", JsonValue.from("bar"))
                    .putAdditionalProperty("model_id", JsonValue.from("bar"))
                    .build()
            )
            .transcription(
                ActionStartConversationRelayParams.Transcription.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
            .transcriptionEngine(ActionStartConversationRelayParams.TranscriptionEngine.GOOGLE)
            .transcriptionEngineConfig(
                ActionStartConversationRelayParams.TranscriptionEngineConfig.builder()
                    .putAdditionalProperty("transcription_model", JsonValue.from("bar"))
                    .putAdditionalProperty("interim_results", JsonValue.from("bar"))
                    .putAdditionalProperty("keywords_boosting", JsonValue.from("bar"))
                    .build()
            )
            .ttsProvider("telnyx")
            .url("wss://example.com/conversation-relay")
            .voice("Telnyx.KokoroTTS.af")
            .voiceSettings(
                TelnyxVoiceSettings.builder()
                    .type(TelnyxVoiceSettings.Type.TELNYX)
                    .voiceSpeed(1.0f)
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
                                .putAdditionalProperty("tier", JsonValue.from("premium"))
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
                        .interruptible(ConversationRelayInterruptible.SPEECH)
                        .interruptibleGreeting(ConversationRelayInterruptible.DTMF)
                        .addLanguage(
                            ConversationRelayLanguage.builder()
                                .language("en-US")
                                .speechModel("nova-3")
                                .transcriptionEngine(
                                    ConversationRelayLanguage.TranscriptionEngine.DEEPGRAM
                                )
                                .transcriptionEngineConfig(
                                    ConversationRelayLanguage.TranscriptionEngineConfig.builder()
                                        .putAdditionalProperty(
                                            "transcription_model",
                                            JsonValue.from("bar"),
                                        )
                                        .build()
                                )
                                .transcriptionProvider("Deepgram")
                                .ttsProvider("telnyx")
                                .voice("Telnyx.KokoroTTS.af")
                                .voiceSettings(
                                    ElevenLabsVoiceSettings.builder()
                                        .type(ElevenLabsVoiceSettings.Type.ELEVENLABS)
                                        .apiKeyRef("my_elevenlabs_api_key")
                                        .build()
                                )
                                .build()
                        )
                        .build()
                )
                .conversationRelayUrl("wss://example.com/conversation-relay")
                .customParameters(
                    ActionStartConversationRelayParams.CustomParameters.builder()
                        .putAdditionalProperty("customer_id", JsonValue.from("bar"))
                        .build()
                )
                .dtmfDetection(true)
                .greeting("Hi! Ask me anything!")
                .interruptible(ConversationRelayInterruptible.SPEECH)
                .interruptibleGreeting(ConversationRelayInterruptible.DTMF)
                .interruptionSettings(
                    ConversationRelayInterruptionSettings.builder()
                        .enable(true)
                        .interruptible(ConversationRelayInterruptible.SPEECH)
                        .interruptibleGreeting(ConversationRelayInterruptible.SPEECH)
                        .welcomeGreetingInterruptible(ConversationRelayInterruptible.SPEECH)
                        .build()
                )
                .language("en-US")
                .addLanguage(
                    ConversationRelayLanguage.builder()
                        .language("en-US")
                        .speechModel("nova-3")
                        .transcriptionEngine(ConversationRelayLanguage.TranscriptionEngine.DEEPGRAM)
                        .transcriptionEngineConfig(
                            ConversationRelayLanguage.TranscriptionEngineConfig.builder()
                                .putAdditionalProperty("transcription_model", JsonValue.from("bar"))
                                .build()
                        )
                        .transcriptionProvider("Deepgram")
                        .ttsProvider("telnyx")
                        .voice("Telnyx.KokoroTTS.af")
                        .voiceSettings(
                            ElevenLabsVoiceSettings.builder()
                                .type(ElevenLabsVoiceSettings.Type.ELEVENLABS)
                                .apiKeyRef("my_elevenlabs_api_key")
                                .build()
                        )
                        .build()
                )
                .provider("elevenlabs")
                .structuredProvider(
                    ActionStartConversationRelayParams.StructuredProvider.builder()
                        .putAdditionalProperty("voice_id", JsonValue.from("bar"))
                        .putAdditionalProperty("model_id", JsonValue.from("bar"))
                        .build()
                )
                .transcription(
                    ActionStartConversationRelayParams.Transcription.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .transcriptionEngine(ActionStartConversationRelayParams.TranscriptionEngine.GOOGLE)
                .transcriptionEngineConfig(
                    ActionStartConversationRelayParams.TranscriptionEngineConfig.builder()
                        .putAdditionalProperty("transcription_model", JsonValue.from("bar"))
                        .putAdditionalProperty("interim_results", JsonValue.from("bar"))
                        .putAdditionalProperty("keywords_boosting", JsonValue.from("bar"))
                        .build()
                )
                .ttsProvider("telnyx")
                .url("wss://example.com/conversation-relay")
                .voice("Telnyx.KokoroTTS.af")
                .voiceSettings(
                    TelnyxVoiceSettings.builder()
                        .type(TelnyxVoiceSettings.Type.TELNYX)
                        .voiceSpeed(1.0f)
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
                            .putAdditionalProperty("tier", JsonValue.from("premium"))
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
                    .interruptible(ConversationRelayInterruptible.SPEECH)
                    .interruptibleGreeting(ConversationRelayInterruptible.DTMF)
                    .addLanguage(
                        ConversationRelayLanguage.builder()
                            .language("en-US")
                            .speechModel("nova-3")
                            .transcriptionEngine(
                                ConversationRelayLanguage.TranscriptionEngine.DEEPGRAM
                            )
                            .transcriptionEngineConfig(
                                ConversationRelayLanguage.TranscriptionEngineConfig.builder()
                                    .putAdditionalProperty(
                                        "transcription_model",
                                        JsonValue.from("bar"),
                                    )
                                    .build()
                            )
                            .transcriptionProvider("Deepgram")
                            .ttsProvider("telnyx")
                            .voice("Telnyx.KokoroTTS.af")
                            .voiceSettings(
                                ElevenLabsVoiceSettings.builder()
                                    .type(ElevenLabsVoiceSettings.Type.ELEVENLABS)
                                    .apiKeyRef("my_elevenlabs_api_key")
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )
        assertThat(body.conversationRelayUrl()).contains("wss://example.com/conversation-relay")
        assertThat(body.customParameters())
            .contains(
                ActionStartConversationRelayParams.CustomParameters.builder()
                    .putAdditionalProperty("customer_id", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.dtmfDetection()).contains(true)
        assertThat(body.greeting()).contains("Hi! Ask me anything!")
        assertThat(body.interruptible()).contains(ConversationRelayInterruptible.SPEECH)
        assertThat(body.interruptibleGreeting()).contains(ConversationRelayInterruptible.DTMF)
        assertThat(body.interruptionSettings())
            .contains(
                ConversationRelayInterruptionSettings.builder()
                    .enable(true)
                    .interruptible(ConversationRelayInterruptible.SPEECH)
                    .interruptibleGreeting(ConversationRelayInterruptible.SPEECH)
                    .welcomeGreetingInterruptible(ConversationRelayInterruptible.SPEECH)
                    .build()
            )
        assertThat(body.language()).contains("en-US")
        assertThat(body.languages().getOrNull())
            .containsExactly(
                ConversationRelayLanguage.builder()
                    .language("en-US")
                    .speechModel("nova-3")
                    .transcriptionEngine(ConversationRelayLanguage.TranscriptionEngine.DEEPGRAM)
                    .transcriptionEngineConfig(
                        ConversationRelayLanguage.TranscriptionEngineConfig.builder()
                            .putAdditionalProperty("transcription_model", JsonValue.from("bar"))
                            .build()
                    )
                    .transcriptionProvider("Deepgram")
                    .ttsProvider("telnyx")
                    .voice("Telnyx.KokoroTTS.af")
                    .voiceSettings(
                        ElevenLabsVoiceSettings.builder()
                            .type(ElevenLabsVoiceSettings.Type.ELEVENLABS)
                            .apiKeyRef("my_elevenlabs_api_key")
                            .build()
                    )
                    .build()
            )
        assertThat(body.provider()).contains("elevenlabs")
        assertThat(body.structuredProvider())
            .contains(
                ActionStartConversationRelayParams.StructuredProvider.builder()
                    .putAdditionalProperty("voice_id", JsonValue.from("bar"))
                    .putAdditionalProperty("model_id", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.transcription())
            .contains(
                ActionStartConversationRelayParams.Transcription.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.transcriptionEngine())
            .contains(ActionStartConversationRelayParams.TranscriptionEngine.GOOGLE)
        assertThat(body.transcriptionEngineConfig())
            .contains(
                ActionStartConversationRelayParams.TranscriptionEngineConfig.builder()
                    .putAdditionalProperty("transcription_model", JsonValue.from("bar"))
                    .putAdditionalProperty("interim_results", JsonValue.from("bar"))
                    .putAdditionalProperty("keywords_boosting", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.ttsProvider()).contains("telnyx")
        assertThat(body.url()).contains("wss://example.com/conversation-relay")
        assertThat(body.voice()).contains("Telnyx.KokoroTTS.af")
        assertThat(body.voiceSettings())
            .contains(
                ActionStartConversationRelayParams.VoiceSettings.ofTelnyx(
                    TelnyxVoiceSettings.builder()
                        .type(TelnyxVoiceSettings.Type.TELNYX)
                        .voiceSpeed(1.0f)
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
