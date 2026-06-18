// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.texml.accounts.queues

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class QueueRetrieveResponseTest {

    @Test
    fun create() {
        val queueRetrieveResponse =
            QueueRetrieveResponse.builder()
                .accountSid("4e71926f-8f13-450e-b91c-23c2ef786aa6")
                .averageWaitTime(30L)
                .currentSize(3L)
                .dateCreated("Fri, 27 Oct 2023 07:41:58 +0000")
                .dateUpdated("Fri, 27 Oct 2023 07:41:58 +0000")
                .maxSize(10L)
                .sid("my-queue")
                .subresourceUris(
                    QueueRetrieveResponse.SubresourceUris.builder()
                        .putAdditionalProperty("members", JsonValue.from("bar"))
                        .build()
                )
                .uri("/Accounts/4e71926f-8f13-450e-b91c-23c2ef786aa6/Queues/my-queue.json")
                .build()

        assertThat(queueRetrieveResponse.accountSid())
            .contains("4e71926f-8f13-450e-b91c-23c2ef786aa6")
        assertThat(queueRetrieveResponse.averageWaitTime()).contains(30L)
        assertThat(queueRetrieveResponse.currentSize()).contains(3L)
        assertThat(queueRetrieveResponse.dateCreated()).contains("Fri, 27 Oct 2023 07:41:58 +0000")
        assertThat(queueRetrieveResponse.dateUpdated()).contains("Fri, 27 Oct 2023 07:41:58 +0000")
        assertThat(queueRetrieveResponse.maxSize()).contains(10L)
        assertThat(queueRetrieveResponse.sid()).contains("my-queue")
        assertThat(queueRetrieveResponse.subresourceUris())
            .contains(
                QueueRetrieveResponse.SubresourceUris.builder()
                    .putAdditionalProperty("members", JsonValue.from("bar"))
                    .build()
            )
        assertThat(queueRetrieveResponse.uri())
            .contains("/Accounts/4e71926f-8f13-450e-b91c-23c2ef786aa6/Queues/my-queue.json")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val queueRetrieveResponse =
            QueueRetrieveResponse.builder()
                .accountSid("4e71926f-8f13-450e-b91c-23c2ef786aa6")
                .averageWaitTime(30L)
                .currentSize(3L)
                .dateCreated("Fri, 27 Oct 2023 07:41:58 +0000")
                .dateUpdated("Fri, 27 Oct 2023 07:41:58 +0000")
                .maxSize(10L)
                .sid("my-queue")
                .subresourceUris(
                    QueueRetrieveResponse.SubresourceUris.builder()
                        .putAdditionalProperty("members", JsonValue.from("bar"))
                        .build()
                )
                .uri("/Accounts/4e71926f-8f13-450e-b91c-23c2ef786aa6/Queues/my-queue.json")
                .build()

        val roundtrippedQueueRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(queueRetrieveResponse),
                jacksonTypeRef<QueueRetrieveResponse>(),
            )

        assertThat(roundtrippedQueueRetrieveResponse).isEqualTo(queueRetrieveResponse)
    }
}
