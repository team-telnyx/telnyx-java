// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.texml.accounts.queues

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class QueueCreateResponseTest {

    @Test
    fun create() {
        val queueCreateResponse =
            QueueCreateResponse.builder()
                .accountSid("4e71926f-8f13-450e-b91c-23c2ef786aa6")
                .averageWaitTime(30L)
                .currentSize(3L)
                .dateCreated("Fri, 27 Oct 2023 07:41:58 +0000")
                .dateUpdated("Fri, 27 Oct 2023 07:41:58 +0000")
                .maxSize(10L)
                .sid("my-queue")
                .subresourceUris(
                    QueueCreateResponse.SubresourceUris.builder()
                        .putAdditionalProperty("members", JsonValue.from("bar"))
                        .build()
                )
                .uri("/Accounts/4e71926f-8f13-450e-b91c-23c2ef786aa6/Queues/my-queue.json")
                .build()

        assertThat(queueCreateResponse.accountSid())
            .contains("4e71926f-8f13-450e-b91c-23c2ef786aa6")
        assertThat(queueCreateResponse.averageWaitTime()).contains(30L)
        assertThat(queueCreateResponse.currentSize()).contains(3L)
        assertThat(queueCreateResponse.dateCreated()).contains("Fri, 27 Oct 2023 07:41:58 +0000")
        assertThat(queueCreateResponse.dateUpdated()).contains("Fri, 27 Oct 2023 07:41:58 +0000")
        assertThat(queueCreateResponse.maxSize()).contains(10L)
        assertThat(queueCreateResponse.sid()).contains("my-queue")
        assertThat(queueCreateResponse.subresourceUris())
            .contains(
                QueueCreateResponse.SubresourceUris.builder()
                    .putAdditionalProperty("members", JsonValue.from("bar"))
                    .build()
            )
        assertThat(queueCreateResponse.uri())
            .contains("/Accounts/4e71926f-8f13-450e-b91c-23c2ef786aa6/Queues/my-queue.json")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val queueCreateResponse =
            QueueCreateResponse.builder()
                .accountSid("4e71926f-8f13-450e-b91c-23c2ef786aa6")
                .averageWaitTime(30L)
                .currentSize(3L)
                .dateCreated("Fri, 27 Oct 2023 07:41:58 +0000")
                .dateUpdated("Fri, 27 Oct 2023 07:41:58 +0000")
                .maxSize(10L)
                .sid("my-queue")
                .subresourceUris(
                    QueueCreateResponse.SubresourceUris.builder()
                        .putAdditionalProperty("members", JsonValue.from("bar"))
                        .build()
                )
                .uri("/Accounts/4e71926f-8f13-450e-b91c-23c2ef786aa6/Queues/my-queue.json")
                .build()

        val roundtrippedQueueCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(queueCreateResponse),
                jacksonTypeRef<QueueCreateResponse>(),
            )

        assertThat(roundtrippedQueueCreateResponse).isEqualTo(queueCreateResponse)
    }
}
