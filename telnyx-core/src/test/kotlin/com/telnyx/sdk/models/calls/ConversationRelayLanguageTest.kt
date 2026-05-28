// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.calls

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.calls.actions.ElevenLabsVoiceSettings
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ConversationRelayLanguageTest {

    @Test
    fun create() {
        val conversationRelayLanguage =
            ConversationRelayLanguage.builder()
                .language("en-US")
                .speechModel("nova-3")
                .transcriptionEngine(ConversationRelayLanguage.TranscriptionEngine.GOOGLE)
                .transcriptionEngineConfig(
                    ConversationRelayLanguage.TranscriptionEngineConfig.builder()
                        .putAdditionalProperty("transcription_model", JsonValue.from("bar"))
                        .putAdditionalProperty("interim_results", JsonValue.from("bar"))
                        .putAdditionalProperty("keywords_boosting", JsonValue.from("bar"))
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

        assertThat(conversationRelayLanguage.language()).isEqualTo("en-US")
        assertThat(conversationRelayLanguage.speechModel()).contains("nova-3")
        assertThat(conversationRelayLanguage.transcriptionEngine())
            .contains(ConversationRelayLanguage.TranscriptionEngine.GOOGLE)
        assertThat(conversationRelayLanguage.transcriptionEngineConfig())
            .contains(
                ConversationRelayLanguage.TranscriptionEngineConfig.builder()
                    .putAdditionalProperty("transcription_model", JsonValue.from("bar"))
                    .putAdditionalProperty("interim_results", JsonValue.from("bar"))
                    .putAdditionalProperty("keywords_boosting", JsonValue.from("bar"))
                    .build()
            )
        assertThat(conversationRelayLanguage.transcriptionProvider()).contains("Deepgram")
        assertThat(conversationRelayLanguage.ttsProvider()).contains("telnyx")
        assertThat(conversationRelayLanguage.voice()).contains("Telnyx.KokoroTTS.af")
        assertThat(conversationRelayLanguage.voiceSettings())
            .contains(
                ConversationRelayLanguage.VoiceSettings.ofElevenlabs(
                    ElevenLabsVoiceSettings.builder()
                        .type(ElevenLabsVoiceSettings.Type.ELEVENLABS)
                        .apiKeyRef("my_elevenlabs_api_key")
                        .build()
                )
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val conversationRelayLanguage =
            ConversationRelayLanguage.builder()
                .language("en-US")
                .speechModel("nova-3")
                .transcriptionEngine(ConversationRelayLanguage.TranscriptionEngine.GOOGLE)
                .transcriptionEngineConfig(
                    ConversationRelayLanguage.TranscriptionEngineConfig.builder()
                        .putAdditionalProperty("transcription_model", JsonValue.from("bar"))
                        .putAdditionalProperty("interim_results", JsonValue.from("bar"))
                        .putAdditionalProperty("keywords_boosting", JsonValue.from("bar"))
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

        val roundtrippedConversationRelayLanguage =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(conversationRelayLanguage),
                jacksonTypeRef<ConversationRelayLanguage>(),
            )

        assertThat(roundtrippedConversationRelayLanguage).isEqualTo(conversationRelayLanguage)
    }
}
