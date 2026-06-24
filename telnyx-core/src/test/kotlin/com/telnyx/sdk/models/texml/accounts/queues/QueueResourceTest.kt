// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.texml.accounts.queues

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class QueueResourceTest {

    @Test
    fun create() {
        val queueResource =
            QueueResource.builder()
                .accountSid("4e71926f-8f13-450e-b91c-23c2ef786aa6")
                .averageWaitTime(30L)
                .currentSize(3L)
                .dateCreated("Fri, 27 Oct 2023 07:41:58 +0000")
                .dateUpdated("Fri, 27 Oct 2023 07:41:58 +0000")
                .maxSize(10L)
                .sid("my-queue")
                .subresourceUris(
                    QueueResource.SubresourceUris.builder()
                        .putAdditionalProperty("members", JsonValue.from("bar"))
                        .build()
                )
                .uri("/Accounts/4e71926f-8f13-450e-b91c-23c2ef786aa6/Queues/my-queue.json")
                .build()

        assertThat(queueResource.accountSid()).contains("4e71926f-8f13-450e-b91c-23c2ef786aa6")
        assertThat(queueResource.averageWaitTime()).contains(30L)
        assertThat(queueResource.currentSize()).contains(3L)
        assertThat(queueResource.dateCreated()).contains("Fri, 27 Oct 2023 07:41:58 +0000")
        assertThat(queueResource.dateUpdated()).contains("Fri, 27 Oct 2023 07:41:58 +0000")
        assertThat(queueResource.maxSize()).contains(10L)
        assertThat(queueResource.sid()).contains("my-queue")
        assertThat(queueResource.subresourceUris())
            .contains(
                QueueResource.SubresourceUris.builder()
                    .putAdditionalProperty("members", JsonValue.from("bar"))
                    .build()
            )
        assertThat(queueResource.uri())
            .contains("/Accounts/4e71926f-8f13-450e-b91c-23c2ef786aa6/Queues/my-queue.json")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val queueResource =
            QueueResource.builder()
                .accountSid("4e71926f-8f13-450e-b91c-23c2ef786aa6")
                .averageWaitTime(30L)
                .currentSize(3L)
                .dateCreated("Fri, 27 Oct 2023 07:41:58 +0000")
                .dateUpdated("Fri, 27 Oct 2023 07:41:58 +0000")
                .maxSize(10L)
                .sid("my-queue")
                .subresourceUris(
                    QueueResource.SubresourceUris.builder()
                        .putAdditionalProperty("members", JsonValue.from("bar"))
                        .build()
                )
                .uri("/Accounts/4e71926f-8f13-450e-b91c-23c2ef786aa6/Queues/my-queue.json")
                .build()

        val roundtrippedQueueResource =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(queueResource),
                jacksonTypeRef<QueueResource>(),
            )

        assertThat(roundtrippedQueueResource).isEqualTo(queueResource)
    }
}
