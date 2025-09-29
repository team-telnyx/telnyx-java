// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.ai.embeddings

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EmbeddingListResponseTest {

    @Test
    fun create() {
        val embeddingListResponse =
            EmbeddingListResponse.builder()
                .addData(
                    EmbeddingListResponse.Data.builder()
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .status(BackgroundTaskStatus.QUEUED)
                        .taskId("task_id")
                        .taskName("task_name")
                        .userId("user_id")
                        .bucket("bucket")
                        .finishedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .build()

        assertThat(embeddingListResponse.data())
            .containsExactly(
                EmbeddingListResponse.Data.builder()
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .status(BackgroundTaskStatus.QUEUED)
                    .taskId("task_id")
                    .taskName("task_name")
                    .userId("user_id")
                    .bucket("bucket")
                    .finishedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val embeddingListResponse =
            EmbeddingListResponse.builder()
                .addData(
                    EmbeddingListResponse.Data.builder()
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .status(BackgroundTaskStatus.QUEUED)
                        .taskId("task_id")
                        .taskName("task_name")
                        .userId("user_id")
                        .bucket("bucket")
                        .finishedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .build()

        val roundtrippedEmbeddingListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(embeddingListResponse),
                jacksonTypeRef<EmbeddingListResponse>(),
            )

        assertThat(roundtrippedEmbeddingListResponse).isEqualTo(embeddingListResponse)
    }
}
