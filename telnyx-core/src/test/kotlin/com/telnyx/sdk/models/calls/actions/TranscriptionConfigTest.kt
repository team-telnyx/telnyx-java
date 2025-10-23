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
            TranscriptionConfig.builder().model("distil-whisper/distil-large-v2").build()

        assertThat(transcriptionConfig.model()).contains("distil-whisper/distil-large-v2")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val transcriptionConfig =
            TranscriptionConfig.builder().model("distil-whisper/distil-large-v2").build()

        val roundtrippedTranscriptionConfig =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(transcriptionConfig),
                jacksonTypeRef<TranscriptionConfig>(),
            )

        assertThat(roundtrippedTranscriptionConfig).isEqualTo(transcriptionConfig)
    }
}
