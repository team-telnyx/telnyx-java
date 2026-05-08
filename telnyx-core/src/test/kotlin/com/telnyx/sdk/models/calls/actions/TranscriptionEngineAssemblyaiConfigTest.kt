// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.calls.actions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TranscriptionEngineAssemblyaiConfigTest {

    @Test
    fun create() {
        val transcriptionEngineAssemblyaiConfig =
            TranscriptionEngineAssemblyaiConfig.builder()
                .interimResults(true)
                .transcriptionEngine(
                    TranscriptionEngineAssemblyaiConfig.TranscriptionEngine.ASSEMBLY_AI
                )
                .transcriptionModel(
                    TranscriptionEngineAssemblyaiConfig.TranscriptionModel
                        .ASSEMBLYAI_UNIVERSAL_STREAMING
                )
                .build()

        assertThat(transcriptionEngineAssemblyaiConfig.interimResults()).contains(true)
        assertThat(transcriptionEngineAssemblyaiConfig.transcriptionEngine())
            .contains(TranscriptionEngineAssemblyaiConfig.TranscriptionEngine.ASSEMBLY_AI)
        assertThat(transcriptionEngineAssemblyaiConfig.transcriptionModel())
            .contains(
                TranscriptionEngineAssemblyaiConfig.TranscriptionModel
                    .ASSEMBLYAI_UNIVERSAL_STREAMING
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val transcriptionEngineAssemblyaiConfig =
            TranscriptionEngineAssemblyaiConfig.builder()
                .interimResults(true)
                .transcriptionEngine(
                    TranscriptionEngineAssemblyaiConfig.TranscriptionEngine.ASSEMBLY_AI
                )
                .transcriptionModel(
                    TranscriptionEngineAssemblyaiConfig.TranscriptionModel
                        .ASSEMBLYAI_UNIVERSAL_STREAMING
                )
                .build()

        val roundtrippedTranscriptionEngineAssemblyaiConfig =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(transcriptionEngineAssemblyaiConfig),
                jacksonTypeRef<TranscriptionEngineAssemblyaiConfig>(),
            )

        assertThat(roundtrippedTranscriptionEngineAssemblyaiConfig)
            .isEqualTo(transcriptionEngineAssemblyaiConfig)
    }
}
