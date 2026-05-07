// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.openai

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.ai.ModelMetadata
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OpenAIListModelsResponseTest {

    @Test
    fun create() {
        val openaiListModelsResponse =
            OpenAIListModelsResponse.builder()
                .addData(
                    ModelMetadata.builder()
                        .id("id")
                        .created(0L)
                        .ownedBy("owned_by")
                        .modelObject("object")
                        .build()
                )
                .modelObject("object")
                .build()

        assertThat(openaiListModelsResponse.data())
            .containsExactly(
                ModelMetadata.builder()
                    .id("id")
                    .created(0L)
                    .ownedBy("owned_by")
                    .modelObject("object")
                    .build()
            )
        assertThat(openaiListModelsResponse.modelObject()).contains("object")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val openaiListModelsResponse =
            OpenAIListModelsResponse.builder()
                .addData(
                    ModelMetadata.builder()
                        .id("id")
                        .created(0L)
                        .ownedBy("owned_by")
                        .modelObject("object")
                        .build()
                )
                .modelObject("object")
                .build()

        val roundtrippedOpenAIListModelsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(openaiListModelsResponse),
                jacksonTypeRef<OpenAIListModelsResponse>(),
            )

        assertThat(roundtrippedOpenAIListModelsResponse).isEqualTo(openaiListModelsResponse)
    }
}
