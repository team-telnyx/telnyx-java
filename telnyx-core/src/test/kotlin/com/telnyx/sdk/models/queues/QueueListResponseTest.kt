// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.queues

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class QueueListResponseTest {

    @Test
    fun create() {
        val queueListResponse =
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

        assertThat(queueListResponse.id()).isEqualTo("3fa85f64-5717-4562-b3fc-2c963f66afa6")
        assertThat(queueListResponse.averageWaitTimeSecs()).isEqualTo(175L)
        assertThat(queueListResponse.createdAt()).isEqualTo("2019-01-23T18:10:02.574Z")
        assertThat(queueListResponse.currentSize()).isEqualTo(20L)
        assertThat(queueListResponse.maxSize()).isEqualTo(50L)
        assertThat(queueListResponse.name()).isEqualTo("support")
        assertThat(queueListResponse.recordType()).isEqualTo(QueueListResponse.RecordType.QUEUE)
        assertThat(queueListResponse.updatedAt()).isEqualTo("2019-01-23T18:10:02.574Z")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val queueListResponse =
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

        val roundtrippedQueueListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(queueListResponse),
                jacksonTypeRef<QueueListResponse>(),
            )

        assertThat(roundtrippedQueueListResponse).isEqualTo(queueListResponse)
    }
}
