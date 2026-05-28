// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.calls.actions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TranscriptionEngineSonioxConfigTest {

    @Test
    fun create() {
        val transcriptionEngineSonioxConfig =
            TranscriptionEngineSonioxConfig.builder()
                .transcriptionEngine(TranscriptionEngineSonioxConfig.TranscriptionEngine.SONIOX)
                .enableEndpointDetection(false)
                .interimResults(true)
                .language("auto")
                .maxEndpointDelayMs(1000L)
                .transcriptionModel(
                    TranscriptionEngineSonioxConfig.TranscriptionModel.SONIOX_STT_RT_V4
                )
                .build()

        assertThat(transcriptionEngineSonioxConfig.transcriptionEngine())
            .isEqualTo(TranscriptionEngineSonioxConfig.TranscriptionEngine.SONIOX)
        assertThat(transcriptionEngineSonioxConfig.enableEndpointDetection()).contains(false)
        assertThat(transcriptionEngineSonioxConfig.interimResults()).contains(true)
        assertThat(transcriptionEngineSonioxConfig.language()).contains("auto")
        assertThat(transcriptionEngineSonioxConfig.maxEndpointDelayMs()).contains(1000L)
        assertThat(transcriptionEngineSonioxConfig.transcriptionModel())
            .contains(TranscriptionEngineSonioxConfig.TranscriptionModel.SONIOX_STT_RT_V4)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val transcriptionEngineSonioxConfig =
            TranscriptionEngineSonioxConfig.builder()
                .transcriptionEngine(TranscriptionEngineSonioxConfig.TranscriptionEngine.SONIOX)
                .enableEndpointDetection(false)
                .interimResults(true)
                .language("auto")
                .maxEndpointDelayMs(1000L)
                .transcriptionModel(
                    TranscriptionEngineSonioxConfig.TranscriptionModel.SONIOX_STT_RT_V4
                )
                .build()

        val roundtrippedTranscriptionEngineSonioxConfig =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(transcriptionEngineSonioxConfig),
                jacksonTypeRef<TranscriptionEngineSonioxConfig>(),
            )

        assertThat(roundtrippedTranscriptionEngineSonioxConfig)
            .isEqualTo(transcriptionEngineSonioxConfig)
    }
}
