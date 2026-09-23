// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.audio

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AudioTranscriptionResponseWordTest {

    @Test
    fun create() {
        val audioTranscriptionResponseWord =
            AudioTranscriptionResponseWord.builder()
                .end(0.0)
                .start(0.0)
                .word("word")
                .confidence(0.0)
                .punctuatedWord("punctuated_word")
                .speaker(0L)
                .speakerConfidence(0.0)
                .build()

        assertThat(audioTranscriptionResponseWord.end()).isEqualTo(0.0)
        assertThat(audioTranscriptionResponseWord.start()).isEqualTo(0.0)
        assertThat(audioTranscriptionResponseWord.word()).isEqualTo("word")
        assertThat(audioTranscriptionResponseWord.confidence()).contains(0.0)
        assertThat(audioTranscriptionResponseWord.punctuatedWord()).contains("punctuated_word")
        assertThat(audioTranscriptionResponseWord.speaker()).contains(0L)
        assertThat(audioTranscriptionResponseWord.speakerConfidence()).contains(0.0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val audioTranscriptionResponseWord =
            AudioTranscriptionResponseWord.builder()
                .end(0.0)
                .start(0.0)
                .word("word")
                .confidence(0.0)
                .punctuatedWord("punctuated_word")
                .speaker(0L)
                .speakerConfidence(0.0)
                .build()

        val roundtrippedAudioTranscriptionResponseWord =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(audioTranscriptionResponseWord),
                jacksonTypeRef<AudioTranscriptionResponseWord>(),
            )

        assertThat(roundtrippedAudioTranscriptionResponseWord)
            .isEqualTo(audioTranscriptionResponseWord)
    }
}
