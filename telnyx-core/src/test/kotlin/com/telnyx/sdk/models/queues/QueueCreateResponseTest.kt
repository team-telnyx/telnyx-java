// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.queues

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class QueueCreateResponseTest {

    @Test
    fun create() {
        val queueCreateResponse =
            QueueCreateResponse.builder()
                .data(
                    QueueCreateResponse.Data.builder()
                        .id("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                        .averageWaitTimeSecs(175L)
                        .createdAt("2019-01-23T18:10:02.574Z")
                        .currentSize(20L)
                        .maxSize(50L)
                        .name("support")
                        .recordType(QueueCreateResponse.Data.RecordType.QUEUE)
                        .updatedAt("2019-01-23T18:10:02.574Z")
                        .build()
                )
                .build()

        assertThat(queueCreateResponse.data())
            .contains(
                QueueCreateResponse.Data.builder()
                    .id("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                    .averageWaitTimeSecs(175L)
                    .createdAt("2019-01-23T18:10:02.574Z")
                    .currentSize(20L)
                    .maxSize(50L)
                    .name("support")
                    .recordType(QueueCreateResponse.Data.RecordType.QUEUE)
                    .updatedAt("2019-01-23T18:10:02.574Z")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val queueCreateResponse =
            QueueCreateResponse.builder()
                .data(
                    QueueCreateResponse.Data.builder()
                        .id("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                        .averageWaitTimeSecs(175L)
                        .createdAt("2019-01-23T18:10:02.574Z")
                        .currentSize(20L)
                        .maxSize(50L)
                        .name("support")
                        .recordType(QueueCreateResponse.Data.RecordType.QUEUE)
                        .updatedAt("2019-01-23T18:10:02.574Z")
                        .build()
                )
                .build()

        val roundtrippedQueueCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(queueCreateResponse),
                jacksonTypeRef<QueueCreateResponse>(),
            )

        assertThat(roundtrippedQueueCreateResponse).isEqualTo(queueCreateResponse)
    }
}
