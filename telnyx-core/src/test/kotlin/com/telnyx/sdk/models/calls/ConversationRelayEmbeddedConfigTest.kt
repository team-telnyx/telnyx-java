// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.calls

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.calls.actions.ConversationRelayInterruptible
import com.telnyx.sdk.models.calls.actions.ElevenLabsVoiceSettings
import com.telnyx.sdk.models.calls.actions.TelnyxVoiceSettings
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ConversationRelayEmbeddedConfigTest {

    @Test
    fun create() {
        val conversationRelayEmbeddedConfig =
            ConversationRelayEmbeddedConfig.builder()
                .url("wss://example.com/conversation-relay")
                .customParameters(
                    ConversationRelayEmbeddedConfig.CustomParameters.builder()
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
                        .voice("Telnyx.Ultra.alloy")
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
                    ConversationRelayEmbeddedConfig.StructuredProvider.builder()
                        .putAdditionalProperty("voice_id", JsonValue.from("bar"))
                        .putAdditionalProperty("model_id", JsonValue.from("bar"))
                        .build()
                )
                .transcriptionEngine(ConversationRelayEmbeddedConfig.TranscriptionEngine.GOOGLE)
                .transcriptionEngineConfig(
                    ConversationRelayEmbeddedConfig.TranscriptionEngineConfig.builder()
                        .putAdditionalProperty("transcription_model", JsonValue.from("bar"))
                        .putAdditionalProperty("interim_results", JsonValue.from("bar"))
                        .putAdditionalProperty("keywords_boosting", JsonValue.from("bar"))
                        .build()
                )
                .ttsProvider("telnyx")
                .voice("Telnyx.KokoroTTS.af")
                .voiceSettings(
                    TelnyxVoiceSettings.builder()
                        .type(TelnyxVoiceSettings.Type.TELNYX)
                        .voiceSpeed(1.0f)
                        .build()
                )
                .build()

        assertThat(conversationRelayEmbeddedConfig.url())
            .isEqualTo("wss://example.com/conversation-relay")
        assertThat(conversationRelayEmbeddedConfig.customParameters())
            .contains(
                ConversationRelayEmbeddedConfig.CustomParameters.builder()
                    .putAdditionalProperty("customer_id", JsonValue.from("bar"))
                    .build()
            )
        assertThat(conversationRelayEmbeddedConfig.dtmfDetection()).contains(true)
        assertThat(conversationRelayEmbeddedConfig.greeting()).contains("Hi! Ask me anything!")
        assertThat(conversationRelayEmbeddedConfig.interruptible())
            .contains(ConversationRelayInterruptible.SPEECH)
        assertThat(conversationRelayEmbeddedConfig.interruptibleGreeting())
            .contains(ConversationRelayInterruptible.DTMF)
        assertThat(conversationRelayEmbeddedConfig.interruptionSettings())
            .contains(
                ConversationRelayInterruptionSettings.builder()
                    .enable(true)
                    .interruptible(ConversationRelayInterruptible.SPEECH)
                    .interruptibleGreeting(ConversationRelayInterruptible.SPEECH)
                    .welcomeGreetingInterruptible(ConversationRelayInterruptible.SPEECH)
                    .build()
            )
        assertThat(conversationRelayEmbeddedConfig.language()).contains("en-US")
        assertThat(conversationRelayEmbeddedConfig.languages().getOrNull())
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
                    .voice("Telnyx.Ultra.alloy")
                    .voiceSettings(
                        ElevenLabsVoiceSettings.builder()
                            .type(ElevenLabsVoiceSettings.Type.ELEVENLABS)
                            .apiKeyRef("my_elevenlabs_api_key")
                            .build()
                    )
                    .build()
            )
        assertThat(conversationRelayEmbeddedConfig.provider()).contains("elevenlabs")
        assertThat(conversationRelayEmbeddedConfig.structuredProvider())
            .contains(
                ConversationRelayEmbeddedConfig.StructuredProvider.builder()
                    .putAdditionalProperty("voice_id", JsonValue.from("bar"))
                    .putAdditionalProperty("model_id", JsonValue.from("bar"))
                    .build()
            )
        assertThat(conversationRelayEmbeddedConfig.transcriptionEngine())
            .contains(ConversationRelayEmbeddedConfig.TranscriptionEngine.GOOGLE)
        assertThat(conversationRelayEmbeddedConfig.transcriptionEngineConfig())
            .contains(
                ConversationRelayEmbeddedConfig.TranscriptionEngineConfig.builder()
                    .putAdditionalProperty("transcription_model", JsonValue.from("bar"))
                    .putAdditionalProperty("interim_results", JsonValue.from("bar"))
                    .putAdditionalProperty("keywords_boosting", JsonValue.from("bar"))
                    .build()
            )
        assertThat(conversationRelayEmbeddedConfig.ttsProvider()).contains("telnyx")
        assertThat(conversationRelayEmbeddedConfig.voice()).contains("Telnyx.KokoroTTS.af")
        assertThat(conversationRelayEmbeddedConfig.voiceSettings())
            .contains(
                ConversationRelayEmbeddedConfig.VoiceSettings.ofTelnyx(
                    TelnyxVoiceSettings.builder()
                        .type(TelnyxVoiceSettings.Type.TELNYX)
                        .voiceSpeed(1.0f)
                        .build()
                )
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val conversationRelayEmbeddedConfig =
            ConversationRelayEmbeddedConfig.builder()
                .url("wss://example.com/conversation-relay")
                .customParameters(
                    ConversationRelayEmbeddedConfig.CustomParameters.builder()
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
                        .voice("Telnyx.Ultra.alloy")
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
                    ConversationRelayEmbeddedConfig.StructuredProvider.builder()
                        .putAdditionalProperty("voice_id", JsonValue.from("bar"))
                        .putAdditionalProperty("model_id", JsonValue.from("bar"))
                        .build()
                )
                .transcriptionEngine(ConversationRelayEmbeddedConfig.TranscriptionEngine.GOOGLE)
                .transcriptionEngineConfig(
                    ConversationRelayEmbeddedConfig.TranscriptionEngineConfig.builder()
                        .putAdditionalProperty("transcription_model", JsonValue.from("bar"))
                        .putAdditionalProperty("interim_results", JsonValue.from("bar"))
                        .putAdditionalProperty("keywords_boosting", JsonValue.from("bar"))
                        .build()
                )
                .ttsProvider("telnyx")
                .voice("Telnyx.KokoroTTS.af")
                .voiceSettings(
                    TelnyxVoiceSettings.builder()
                        .type(TelnyxVoiceSettings.Type.TELNYX)
                        .voiceSpeed(1.0f)
                        .build()
                )
                .build()

        val roundtrippedConversationRelayEmbeddedConfig =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(conversationRelayEmbeddedConfig),
                jacksonTypeRef<ConversationRelayEmbeddedConfig>(),
            )

        assertThat(roundtrippedConversationRelayEmbeddedConfig)
            .isEqualTo(conversationRelayEmbeddedConfig)
    }
}
