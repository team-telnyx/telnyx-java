// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.ai.embeddings

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EmbeddingResponseTest {

    @Test
    fun create() {
        val embeddingResponse =
            EmbeddingResponse.builder()
                .data(
                    EmbeddingResponse.Data.builder()
                        .createdAt("created_at")
                        .finishedAt("finished_at")
                        .status("status")
                        .taskId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .taskName("task_name")
                        .userId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .build()

        assertThat(embeddingResponse.data())
            .isEqualTo(
                EmbeddingResponse.Data.builder()
                    .createdAt("created_at")
                    .finishedAt("finished_at")
                    .status("status")
                    .taskId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .taskName("task_name")
                    .userId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val embeddingResponse =
            EmbeddingResponse.builder()
                .data(
                    EmbeddingResponse.Data.builder()
                        .createdAt("created_at")
                        .finishedAt("finished_at")
                        .status("status")
                        .taskId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .taskName("task_name")
                        .userId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .build()

        val roundtrippedEmbeddingResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(embeddingResponse),
                jacksonTypeRef<EmbeddingResponse>(),
            )

        assertThat(roundtrippedEmbeddingResponse).isEqualTo(embeddingResponse)
    }
}
