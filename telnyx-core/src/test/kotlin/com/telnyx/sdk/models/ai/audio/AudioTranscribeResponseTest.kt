// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.audio

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AudioTranscribeResponseTest {

    @Test
    fun create() {
        val audioTranscribeResponse =
            AudioTranscribeResponse.builder()
                .text("text")
                .duration(0.0)
                .addSegment(
                    AudioTranscribeResponse.Segment.builder()
                        .id(0.0)
                        .end(0.0)
                        .start(0.0)
                        .text("text")
                        .build()
                )
                .build()

        assertThat(audioTranscribeResponse.text()).isEqualTo("text")
        assertThat(audioTranscribeResponse.duration()).contains(0.0)
        assertThat(audioTranscribeResponse.segments().getOrNull())
            .containsExactly(
                AudioTranscribeResponse.Segment.builder()
                    .id(0.0)
                    .end(0.0)
                    .start(0.0)
                    .text("text")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val audioTranscribeResponse =
            AudioTranscribeResponse.builder()
                .text("text")
                .duration(0.0)
                .addSegment(
                    AudioTranscribeResponse.Segment.builder()
                        .id(0.0)
                        .end(0.0)
                        .start(0.0)
                        .text("text")
                        .build()
                )
                .build()

        val roundtrippedAudioTranscribeResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(audioTranscribeResponse),
                jacksonTypeRef<AudioTranscribeResponse>(),
            )

        assertThat(roundtrippedAudioTranscribeResponse).isEqualTo(audioTranscribeResponse)
    }
}
