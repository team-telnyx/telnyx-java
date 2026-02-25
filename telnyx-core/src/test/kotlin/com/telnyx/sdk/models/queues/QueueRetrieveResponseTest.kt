// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.queues

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class QueueRetrieveResponseTest {

    @Test
    fun create() {
        val queueRetrieveResponse =
            QueueRetrieveResponse.builder()
                .data(
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
                )
                .build()

        assertThat(queueRetrieveResponse.data())
            .contains(
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
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val queueRetrieveResponse =
            QueueRetrieveResponse.builder()
                .data(
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
                )
                .build()

        val roundtrippedQueueRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(queueRetrieveResponse),
                jacksonTypeRef<QueueRetrieveResponse>(),
            )

        assertThat(roundtrippedQueueRetrieveResponse).isEqualTo(queueRetrieveResponse)
    }
}
