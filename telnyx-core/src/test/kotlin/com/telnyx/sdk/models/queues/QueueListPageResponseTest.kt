// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.queues

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class QueueListPageResponseTest {

    @Test
    fun create() {
        val queueListPageResponse =
            QueueListPageResponse.builder()
                .addData(
                    QueueListResponse.builder()
                        .id("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                        .averageWaitTimeSecs(175L)
                        .createdAt("2019-01-23T18:10:02.574Z")
                        .currentSize(20L)
                        .maxSize(50L)
                        .name("support")
                        .recordType(QueueListResponse.RecordType.QUEUE)
                        .updatedAt("2019-01-23T18:10:02.574Z")
                        .build()
                )
                .meta(
                    PaginationMeta.builder()
                        .pageNumber(2L)
                        .totalPages(3L)
                        .pageSize(25L)
                        .totalResults(55L)
                        .build()
                )
                .build()

        assertThat(queueListPageResponse.data().getOrNull())
            .containsExactly(
                QueueListResponse.builder()
                    .id("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                    .averageWaitTimeSecs(175L)
                    .createdAt("2019-01-23T18:10:02.574Z")
                    .currentSize(20L)
                    .maxSize(50L)
                    .name("support")
                    .recordType(QueueListResponse.RecordType.QUEUE)
                    .updatedAt("2019-01-23T18:10:02.574Z")
                    .build()
            )
        assertThat(queueListPageResponse.meta())
            .contains(
                PaginationMeta.builder()
                    .pageNumber(2L)
                    .totalPages(3L)
                    .pageSize(25L)
                    .totalResults(55L)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val queueListPageResponse =
            QueueListPageResponse.builder()
                .addData(
                    QueueListResponse.builder()
                        .id("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                        .averageWaitTimeSecs(175L)
                        .createdAt("2019-01-23T18:10:02.574Z")
                        .currentSize(20L)
                        .maxSize(50L)
                        .name("support")
                        .recordType(QueueListResponse.RecordType.QUEUE)
                        .updatedAt("2019-01-23T18:10:02.574Z")
                        .build()
                )
                .meta(
                    PaginationMeta.builder()
                        .pageNumber(2L)
                        .totalPages(3L)
                        .pageSize(25L)
                        .totalResults(55L)
                        .build()
                )
                .build()

        val roundtrippedQueueListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(queueListPageResponse),
                jacksonTypeRef<QueueListPageResponse>(),
            )

        assertThat(roundtrippedQueueListPageResponse).isEqualTo(queueListPageResponse)
    }
}
