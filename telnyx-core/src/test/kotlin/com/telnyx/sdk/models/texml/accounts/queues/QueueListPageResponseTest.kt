// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.texml.accounts.queues

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class QueueListPageResponseTest {

    @Test
    fun create() {
        val queueListPageResponse =
            QueueListPageResponse.builder()
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
                )
                .start(0L)
                .uri(
                    "/v2/texml/Accounts/61bf923e-5e4d-4595-a110-56190ea18a1b/Queues.json?Page=0&PageSize=1"
                )
                .build()

        assertThat(queueListPageResponse.end()).contains(0L)
        assertThat(queueListPageResponse.firstPageUri())
            .contains(
                "/v2/texml/Accounts/61bf923e-5e4d-4595-a110-56190ea18a1b/Queues.json?Page=0&PageSize=1"
            )
        assertThat(queueListPageResponse.nextPageUri())
            .contains(
                "/v2/texml/Accounts/61bf923e-5e4d-4595-a110-56190ea18a1b/Queues.json?Page=1&PageSize=1&PageToken=MTY4AjgyNDkwNzIxMQ"
            )
        assertThat(queueListPageResponse.page()).contains(0L)
        assertThat(queueListPageResponse.pageSize()).contains(1L)
        assertThat(queueListPageResponse.queues().getOrNull())
            .containsExactly(
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
            )
        assertThat(queueListPageResponse.start()).contains(0L)
        assertThat(queueListPageResponse.uri())
            .contains(
                "/v2/texml/Accounts/61bf923e-5e4d-4595-a110-56190ea18a1b/Queues.json?Page=0&PageSize=1"
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val queueListPageResponse =
            QueueListPageResponse.builder()
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
                )
                .start(0L)
                .uri(
                    "/v2/texml/Accounts/61bf923e-5e4d-4595-a110-56190ea18a1b/Queues.json?Page=0&PageSize=1"
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
