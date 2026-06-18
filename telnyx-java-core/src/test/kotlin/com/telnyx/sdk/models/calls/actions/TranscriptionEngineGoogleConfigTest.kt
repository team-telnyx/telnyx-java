// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.calls.actions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TranscriptionEngineGoogleConfigTest {

    @Test
    fun create() {
        val transcriptionEngineGoogleConfig =
            TranscriptionEngineGoogleConfig.builder()
                .enableSpeakerDiarization(true)
                .addHint("string")
                .interimResults(true)
                .language(GoogleTranscriptionLanguage.EN)
                .maxSpeakerCount(4)
                .minSpeakerCount(4)
                .model(TranscriptionEngineGoogleConfig.Model.LATEST_LONG)
                .profanityFilter(true)
                .addSpeechContext(
                    TranscriptionEngineGoogleConfig.SpeechContext.builder()
                        .boost(1.0)
                        .addPhrase("string")
                        .build()
                )
                .transcriptionEngine(TranscriptionEngineGoogleConfig.TranscriptionEngine.GOOGLE)
                .useEnhanced(true)
                .build()

        assertThat(transcriptionEngineGoogleConfig.enableSpeakerDiarization()).contains(true)
        assertThat(transcriptionEngineGoogleConfig.hints().getOrNull()).containsExactly("string")
        assertThat(transcriptionEngineGoogleConfig.interimResults()).contains(true)
        assertThat(transcriptionEngineGoogleConfig.language())
            .contains(GoogleTranscriptionLanguage.EN)
        assertThat(transcriptionEngineGoogleConfig.maxSpeakerCount()).contains(4)
        assertThat(transcriptionEngineGoogleConfig.minSpeakerCount()).contains(4)
        assertThat(transcriptionEngineGoogleConfig.model())
            .contains(TranscriptionEngineGoogleConfig.Model.LATEST_LONG)
        assertThat(transcriptionEngineGoogleConfig.profanityFilter()).contains(true)
        assertThat(transcriptionEngineGoogleConfig.speechContext().getOrNull())
            .containsExactly(
                TranscriptionEngineGoogleConfig.SpeechContext.builder()
                    .boost(1.0)
                    .addPhrase("string")
                    .build()
            )
        assertThat(transcriptionEngineGoogleConfig.transcriptionEngine())
            .contains(TranscriptionEngineGoogleConfig.TranscriptionEngine.GOOGLE)
        assertThat(transcriptionEngineGoogleConfig.useEnhanced()).contains(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val transcriptionEngineGoogleConfig =
            TranscriptionEngineGoogleConfig.builder()
                .enableSpeakerDiarization(true)
                .addHint("string")
                .interimResults(true)
                .language(GoogleTranscriptionLanguage.EN)
                .maxSpeakerCount(4)
                .minSpeakerCount(4)
                .model(TranscriptionEngineGoogleConfig.Model.LATEST_LONG)
                .profanityFilter(true)
                .addSpeechContext(
                    TranscriptionEngineGoogleConfig.SpeechContext.builder()
                        .boost(1.0)
                        .addPhrase("string")
                        .build()
                )
                .transcriptionEngine(TranscriptionEngineGoogleConfig.TranscriptionEngine.GOOGLE)
                .useEnhanced(true)
                .build()

        val roundtrippedTranscriptionEngineGoogleConfig =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(transcriptionEngineGoogleConfig),
                jacksonTypeRef<TranscriptionEngineGoogleConfig>(),
            )

        assertThat(roundtrippedTranscriptionEngineGoogleConfig)
            .isEqualTo(transcriptionEngineGoogleConfig)
    }
}
