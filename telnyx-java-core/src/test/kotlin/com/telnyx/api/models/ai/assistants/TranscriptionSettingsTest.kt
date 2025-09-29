// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.ai.assistants

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TranscriptionSettingsTest {

    @Test
    fun create() {
        val transcriptionSettings =
            TranscriptionSettings.builder().language("language").model("model").build()

        assertThat(transcriptionSettings.language()).contains("language")
        assertThat(transcriptionSettings.model()).contains("model")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val transcriptionSettings =
            TranscriptionSettings.builder().language("language").model("model").build()

        val roundtrippedTranscriptionSettings =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(transcriptionSettings),
                jacksonTypeRef<TranscriptionSettings>(),
            )

        assertThat(roundtrippedTranscriptionSettings).isEqualTo(transcriptionSettings)
    }
}
