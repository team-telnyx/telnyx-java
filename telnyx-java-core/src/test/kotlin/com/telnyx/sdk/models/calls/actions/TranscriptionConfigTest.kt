// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.calls.actions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TranscriptionConfigTest {

    @Test
    fun create() {
        val transcriptionConfig =
            TranscriptionConfig.builder()
                .language("auto")
                .model(TranscriptionConfig.Model.DISTIL_WHISPER_DISTIL_LARGE_V2)
                .build()

        assertThat(transcriptionConfig.language()).contains("auto")
        assertThat(transcriptionConfig.model())
            .contains(TranscriptionConfig.Model.DISTIL_WHISPER_DISTIL_LARGE_V2)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val transcriptionConfig =
            TranscriptionConfig.builder()
                .language("auto")
                .model(TranscriptionConfig.Model.DISTIL_WHISPER_DISTIL_LARGE_V2)
                .build()

        val roundtrippedTranscriptionConfig =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(transcriptionConfig),
                jacksonTypeRef<TranscriptionConfig>(),
            )

        assertThat(roundtrippedTranscriptionConfig).isEqualTo(transcriptionConfig)
    }
}
