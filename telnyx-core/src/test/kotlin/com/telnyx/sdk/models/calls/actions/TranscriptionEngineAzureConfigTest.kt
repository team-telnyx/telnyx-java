// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.calls.actions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TranscriptionEngineAzureConfigTest {

    @Test
    fun create() {
        val transcriptionEngineAzureConfig =
            TranscriptionEngineAzureConfig.builder()
                .region(TranscriptionEngineAzureConfig.Region.EASTUS)
                .transcriptionEngine(TranscriptionEngineAzureConfig.TranscriptionEngine.AZURE)
                .apiKeyRef("api_key_ref")
                .language(TranscriptionEngineAzureConfig.Language.EN)
                .build()

        assertThat(transcriptionEngineAzureConfig.region())
            .isEqualTo(TranscriptionEngineAzureConfig.Region.EASTUS)
        assertThat(transcriptionEngineAzureConfig.transcriptionEngine())
            .isEqualTo(TranscriptionEngineAzureConfig.TranscriptionEngine.AZURE)
        assertThat(transcriptionEngineAzureConfig.apiKeyRef()).contains("api_key_ref")
        assertThat(transcriptionEngineAzureConfig.language())
            .contains(TranscriptionEngineAzureConfig.Language.EN)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val transcriptionEngineAzureConfig =
            TranscriptionEngineAzureConfig.builder()
                .region(TranscriptionEngineAzureConfig.Region.EASTUS)
                .transcriptionEngine(TranscriptionEngineAzureConfig.TranscriptionEngine.AZURE)
                .apiKeyRef("api_key_ref")
                .language(TranscriptionEngineAzureConfig.Language.EN)
                .build()

        val roundtrippedTranscriptionEngineAzureConfig =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(transcriptionEngineAzureConfig),
                jacksonTypeRef<TranscriptionEngineAzureConfig>(),
            )

        assertThat(roundtrippedTranscriptionEngineAzureConfig)
            .isEqualTo(transcriptionEngineAzureConfig)
    }
}
