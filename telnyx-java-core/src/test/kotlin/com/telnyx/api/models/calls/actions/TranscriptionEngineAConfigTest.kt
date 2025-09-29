// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.calls.actions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TranscriptionEngineAConfigTest {

    @Test
    fun create() {
        val transcriptionEngineAConfig =
            TranscriptionEngineAConfig.builder()
                .enableSpeakerDiarization(true)
                .addHint("Telnyx")
                .interimResults(true)
                .language(GoogleTranscriptionLanguage.EN)
                .maxSpeakerCount(4)
                .minSpeakerCount(4)
                .model(TranscriptionEngineAConfig.Model.LATEST_LONG)
                .profanityFilter(true)
                .addSpeechContext(
                    TranscriptionEngineAConfig.SpeechContext.builder()
                        .boost(1.0)
                        .addPhrase("Telnyx")
                        .build()
                )
                .transcriptionEngine(TranscriptionEngineAConfig.TranscriptionEngine.A)
                .useEnhanced(true)
                .build()

        assertThat(transcriptionEngineAConfig.enableSpeakerDiarization()).contains(true)
        assertThat(transcriptionEngineAConfig.hints().getOrNull()).containsExactly("Telnyx")
        assertThat(transcriptionEngineAConfig.interimResults()).contains(true)
        assertThat(transcriptionEngineAConfig.language()).contains(GoogleTranscriptionLanguage.EN)
        assertThat(transcriptionEngineAConfig.maxSpeakerCount()).contains(4)
        assertThat(transcriptionEngineAConfig.minSpeakerCount()).contains(4)
        assertThat(transcriptionEngineAConfig.model())
            .contains(TranscriptionEngineAConfig.Model.LATEST_LONG)
        assertThat(transcriptionEngineAConfig.profanityFilter()).contains(true)
        assertThat(transcriptionEngineAConfig.speechContext().getOrNull())
            .containsExactly(
                TranscriptionEngineAConfig.SpeechContext.builder()
                    .boost(1.0)
                    .addPhrase("Telnyx")
                    .build()
            )
        assertThat(transcriptionEngineAConfig.transcriptionEngine())
            .contains(TranscriptionEngineAConfig.TranscriptionEngine.A)
        assertThat(transcriptionEngineAConfig.useEnhanced()).contains(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val transcriptionEngineAConfig =
            TranscriptionEngineAConfig.builder()
                .enableSpeakerDiarization(true)
                .addHint("Telnyx")
                .interimResults(true)
                .language(GoogleTranscriptionLanguage.EN)
                .maxSpeakerCount(4)
                .minSpeakerCount(4)
                .model(TranscriptionEngineAConfig.Model.LATEST_LONG)
                .profanityFilter(true)
                .addSpeechContext(
                    TranscriptionEngineAConfig.SpeechContext.builder()
                        .boost(1.0)
                        .addPhrase("Telnyx")
                        .build()
                )
                .transcriptionEngine(TranscriptionEngineAConfig.TranscriptionEngine.A)
                .useEnhanced(true)
                .build()

        val roundtrippedTranscriptionEngineAConfig =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(transcriptionEngineAConfig),
                jacksonTypeRef<TranscriptionEngineAConfig>(),
            )

        assertThat(roundtrippedTranscriptionEngineAConfig).isEqualTo(transcriptionEngineAConfig)
    }
}
