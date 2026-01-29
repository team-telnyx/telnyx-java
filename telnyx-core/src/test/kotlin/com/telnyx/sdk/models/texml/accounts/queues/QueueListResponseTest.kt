// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.texml.accounts.queues

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class QueueListResponseTest {

    @Test
    fun create() {
        val queueListResponse =
            QueueListResponse.builder()
                .accountSid("4e71926f-8f13-450e-b91c-23c2ef786aa6")
                .averageWaitTime(30L)
                .currentSize(3L)
                .dateCreated("Fri, 27 Oct 2023 07:41:58 +0000")
                .dateUpdated("Fri, 27 Oct 2023 07:41:58 +0000")
                .maxSize(10L)
                .sid("my-queue")
                .subresourceUris(
                    QueueListResponse.SubresourceUris.builder()
                        .putAdditionalProperty("members", JsonValue.from("bar"))
                        .build()
                )
                .uri("/Accounts/4e71926f-8f13-450e-b91c-23c2ef786aa6/Queues/my-queue.json")
                .build()

        assertThat(queueListResponse.accountSid()).contains("4e71926f-8f13-450e-b91c-23c2ef786aa6")
        assertThat(queueListResponse.averageWaitTime()).contains(30L)
        assertThat(queueListResponse.currentSize()).contains(3L)
        assertThat(queueListResponse.dateCreated()).contains("Fri, 27 Oct 2023 07:41:58 +0000")
        assertThat(queueListResponse.dateUpdated()).contains("Fri, 27 Oct 2023 07:41:58 +0000")
        assertThat(queueListResponse.maxSize()).contains(10L)
        assertThat(queueListResponse.sid()).contains("my-queue")
        assertThat(queueListResponse.subresourceUris())
            .contains(
                QueueListResponse.SubresourceUris.builder()
                    .putAdditionalProperty("members", JsonValue.from("bar"))
                    .build()
            )
        assertThat(queueListResponse.uri())
            .contains("/Accounts/4e71926f-8f13-450e-b91c-23c2ef786aa6/Queues/my-queue.json")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val queueListResponse =
            QueueListResponse.builder()
                .accountSid("4e71926f-8f13-450e-b91c-23c2ef786aa6")
                .averageWaitTime(30L)
                .currentSize(3L)
                .dateCreated("Fri, 27 Oct 2023 07:41:58 +0000")
                .dateUpdated("Fri, 27 Oct 2023 07:41:58 +0000")
                .maxSize(10L)
                .sid("my-queue")
                .subresourceUris(
                    QueueListResponse.SubresourceUris.builder()
                        .putAdditionalProperty("members", JsonValue.from("bar"))
                        .build()
                )
                .uri("/Accounts/4e71926f-8f13-450e-b91c-23c2ef786aa6/Queues/my-queue.json")
                .build()

        val roundtrippedQueueListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(queueListResponse),
                jacksonTypeRef<QueueListResponse>(),
            )

        assertThat(roundtrippedQueueListResponse).isEqualTo(queueListResponse)
    }
}
