// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.queues

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class QueueUpdateResponseTest {

    @Test
    fun create() {
        val queueUpdateResponse =
            QueueUpdateResponse.builder()
                .data(
                    QueueUpdateResponse.Data.builder()
                        .id("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                        .averageWaitTimeSecs(175L)
                        .createdAt("2019-01-23T18:10:02.574Z")
                        .currentSize(20L)
                        .maxSize(50L)
                        .name("support")
                        .recordType(QueueUpdateResponse.Data.RecordType.QUEUE)
                        .updatedAt("2019-01-23T18:10:02.574Z")
                        .build()
                )
                .build()

        assertThat(queueUpdateResponse.data())
            .contains(
                QueueUpdateResponse.Data.builder()
                    .id("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                    .averageWaitTimeSecs(175L)
                    .createdAt("2019-01-23T18:10:02.574Z")
                    .currentSize(20L)
                    .maxSize(50L)
                    .name("support")
                    .recordType(QueueUpdateResponse.Data.RecordType.QUEUE)
                    .updatedAt("2019-01-23T18:10:02.574Z")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val queueUpdateResponse =
            QueueUpdateResponse.builder()
                .data(
                    QueueUpdateResponse.Data.builder()
                        .id("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                        .averageWaitTimeSecs(175L)
                        .createdAt("2019-01-23T18:10:02.574Z")
                        .currentSize(20L)
                        .maxSize(50L)
                        .name("support")
                        .recordType(QueueUpdateResponse.Data.RecordType.QUEUE)
                        .updatedAt("2019-01-23T18:10:02.574Z")
                        .build()
                )
                .build()

        val roundtrippedQueueUpdateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(queueUpdateResponse),
                jacksonTypeRef<QueueUpdateResponse>(),
            )

        assertThat(roundtrippedQueueUpdateResponse).isEqualTo(queueUpdateResponse)
    }
}
