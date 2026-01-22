// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.texml.accounts.queues

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class QueueListResponseTest {

    @Test
    fun create() {
        val queueListResponse =
            QueueListResponse.builder()
                .end(0L)
                .firstPageUri(
                    "/v2/texml/Accounts/61bf923e-5e4d-4595-a110-56190ea18a1b/Queues.json?Page=0&PageSize=1"
                )
                .nextPageUri(
                    "/v2/texml/Accounts/61bf923e-5e4d-4595-a110-56190ea18a1b/Queues.json?Page=1&PageSize=1&PageToken=MTY4AjgyNDkwNzIxMQ"
                )
                .page(0L)
                .pageSize(1L)
                .addQueue(
                    QueueListResponse.Queue.builder()
                        .accountSid("4e71926f-8f13-450e-b91c-23c2ef786aa6")
                        .averageWaitTime(30L)
                        .currentSize(3L)
                        .dateCreated("Fri, 27 Oct 2023 07:41:58 +0000")
                        .dateUpdated("Fri, 27 Oct 2023 07:41:58 +0000")
                        .maxSize(10L)
                        .sid("my-queue")
                        .subresourceUris(
                            QueueListResponse.Queue.SubresourceUris.builder()
                                .putAdditionalProperty("members", JsonValue.from("bar"))
                                .build()
                        )
                        .uri("/Accounts/4e71926f-8f13-450e-b91c-23c2ef786aa6/Queues/my-queue.json")
                        .build()
                )
                .start(0L)
                .uri(
                    "/v2/texml/Accounts/61bf923e-5e4d-4595-a110-56190ea18a1b/Queues.json?Page=0&PageSize=1"
                )
                .build()

        assertThat(queueListResponse.end()).contains(0L)
        assertThat(queueListResponse.firstPageUri())
            .contains(
                "/v2/texml/Accounts/61bf923e-5e4d-4595-a110-56190ea18a1b/Queues.json?Page=0&PageSize=1"
            )
        assertThat(queueListResponse.nextPageUri())
            .contains(
                "/v2/texml/Accounts/61bf923e-5e4d-4595-a110-56190ea18a1b/Queues.json?Page=1&PageSize=1&PageToken=MTY4AjgyNDkwNzIxMQ"
            )
        assertThat(queueListResponse.page()).contains(0L)
        assertThat(queueListResponse.pageSize()).contains(1L)
        assertThat(queueListResponse.queues().getOrNull())
            .containsExactly(
                QueueListResponse.Queue.builder()
                    .accountSid("4e71926f-8f13-450e-b91c-23c2ef786aa6")
                    .averageWaitTime(30L)
                    .currentSize(3L)
                    .dateCreated("Fri, 27 Oct 2023 07:41:58 +0000")
                    .dateUpdated("Fri, 27 Oct 2023 07:41:58 +0000")
                    .maxSize(10L)
                    .sid("my-queue")
                    .subresourceUris(
                        QueueListResponse.Queue.SubresourceUris.builder()
                            .putAdditionalProperty("members", JsonValue.from("bar"))
                            .build()
                    )
                    .uri("/Accounts/4e71926f-8f13-450e-b91c-23c2ef786aa6/Queues/my-queue.json")
                    .build()
            )
        assertThat(queueListResponse.start()).contains(0L)
        assertThat(queueListResponse.uri())
            .contains(
                "/v2/texml/Accounts/61bf923e-5e4d-4595-a110-56190ea18a1b/Queues.json?Page=0&PageSize=1"
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val queueListResponse =
            QueueListResponse.builder()
                .end(0L)
                .firstPageUri(
                    "/v2/texml/Accounts/61bf923e-5e4d-4595-a110-56190ea18a1b/Queues.json?Page=0&PageSize=1"
                )
                .nextPageUri(
                    "/v2/texml/Accounts/61bf923e-5e4d-4595-a110-56190ea18a1b/Queues.json?Page=1&PageSize=1&PageToken=MTY4AjgyNDkwNzIxMQ"
                )
                .page(0L)
                .pageSize(1L)
                .addQueue(
                    QueueListResponse.Queue.builder()
                        .accountSid("4e71926f-8f13-450e-b91c-23c2ef786aa6")
                        .averageWaitTime(30L)
                        .currentSize(3L)
                        .dateCreated("Fri, 27 Oct 2023 07:41:58 +0000")
                        .dateUpdated("Fri, 27 Oct 2023 07:41:58 +0000")
                        .maxSize(10L)
                        .sid("my-queue")
                        .subresourceUris(
                            QueueListResponse.Queue.SubresourceUris.builder()
                                .putAdditionalProperty("members", JsonValue.from("bar"))
                                .build()
                        )
                        .uri("/Accounts/4e71926f-8f13-450e-b91c-23c2ef786aa6/Queues/my-queue.json")
                        .build()
                )
                .start(0L)
                .uri(
                    "/v2/texml/Accounts/61bf923e-5e4d-4595-a110-56190ea18a1b/Queues.json?Page=0&PageSize=1"
                )
                .build()

        val roundtrippedQueueListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(queueListResponse),
                jacksonTypeRef<QueueListResponse>(),
            )

        assertThat(roundtrippedQueueListResponse).isEqualTo(queueListResponse)
    }
}
