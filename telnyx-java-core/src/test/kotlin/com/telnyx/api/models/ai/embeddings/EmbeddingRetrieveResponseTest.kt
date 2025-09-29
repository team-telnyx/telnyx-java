// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.ai.embeddings

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EmbeddingRetrieveResponseTest {

    @Test
    fun create() {
        val embeddingRetrieveResponse =
            EmbeddingRetrieveResponse.builder()
                .data(
                    EmbeddingRetrieveResponse.Data.builder()
                        .createdAt("created_at")
                        .finishedAt("finished_at")
                        .status(BackgroundTaskStatus.QUEUED)
                        .taskId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .taskName("task_name")
                        .build()
                )
                .build()

        assertThat(embeddingRetrieveResponse.data())
            .isEqualTo(
                EmbeddingRetrieveResponse.Data.builder()
                    .createdAt("created_at")
                    .finishedAt("finished_at")
                    .status(BackgroundTaskStatus.QUEUED)
                    .taskId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .taskName("task_name")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val embeddingRetrieveResponse =
            EmbeddingRetrieveResponse.builder()
                .data(
                    EmbeddingRetrieveResponse.Data.builder()
                        .createdAt("created_at")
                        .finishedAt("finished_at")
                        .status(BackgroundTaskStatus.QUEUED)
                        .taskId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .taskName("task_name")
                        .build()
                )
                .build()

        val roundtrippedEmbeddingRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(embeddingRetrieveResponse),
                jacksonTypeRef<EmbeddingRetrieveResponse>(),
            )

        assertThat(roundtrippedEmbeddingRetrieveResponse).isEqualTo(embeddingRetrieveResponse)
    }
}
