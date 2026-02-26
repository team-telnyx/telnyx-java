// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.queues

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class QueueTest {

    @Test
    fun create() {
        val queue =
            Queue.builder()
                .id("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                .averageWaitTimeSecs(175L)
                .createdAt("2019-01-23T18:10:02.574Z")
                .currentSize(20L)
                .maxSize(50L)
                .name("support")
                .recordType(Queue.RecordType.QUEUE)
                .updatedAt("2019-01-23T18:10:02.574Z")
                .build()

        assertThat(queue.id()).isEqualTo("3fa85f64-5717-4562-b3fc-2c963f66afa6")
        assertThat(queue.averageWaitTimeSecs()).isEqualTo(175L)
        assertThat(queue.createdAt()).isEqualTo("2019-01-23T18:10:02.574Z")
        assertThat(queue.currentSize()).isEqualTo(20L)
        assertThat(queue.maxSize()).isEqualTo(50L)
        assertThat(queue.name()).isEqualTo("support")
        assertThat(queue.recordType()).isEqualTo(Queue.RecordType.QUEUE)
        assertThat(queue.updatedAt()).isEqualTo("2019-01-23T18:10:02.574Z")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val queue =
            Queue.builder()
                .id("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                .averageWaitTimeSecs(175L)
                .createdAt("2019-01-23T18:10:02.574Z")
                .currentSize(20L)
                .maxSize(50L)
                .name("support")
                .recordType(Queue.RecordType.QUEUE)
                .updatedAt("2019-01-23T18:10:02.574Z")
                .build()

        val roundtrippedQueue =
            jsonMapper.readValue(jsonMapper.writeValueAsString(queue), jacksonTypeRef<Queue>())

        assertThat(roundtrippedQueue).isEqualTo(queue)
    }
}
