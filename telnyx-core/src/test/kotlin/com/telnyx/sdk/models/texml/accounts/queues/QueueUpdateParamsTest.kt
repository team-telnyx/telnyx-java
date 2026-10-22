// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.texml.accounts.queues

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class QueueUpdateParamsTest {

    @Test
    fun create() {
        QueueUpdateParams.builder()
            .accountSid("f5586561-8ff0-4291-a51b-c7dfe4139ff9")
            .queueSid("queue_sid")
            .maxSize(10L)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            QueueUpdateParams.builder()
                .accountSid("f5586561-8ff0-4291-a51b-c7dfe4139ff9")
                .queueSid("queue_sid")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("f5586561-8ff0-4291-a51b-c7dfe4139ff9")
        assertThat(params._pathParam(1)).isEqualTo("queue_sid")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            QueueUpdateParams.builder()
                .accountSid("f5586561-8ff0-4291-a51b-c7dfe4139ff9")
                .queueSid("queue_sid")
                .maxSize(10L)
                .build()

        val body = params._body()

        assertThat(body.maxSize()).contains(10L)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            QueueUpdateParams.builder()
                .accountSid("f5586561-8ff0-4291-a51b-c7dfe4139ff9")
                .queueSid("queue_sid")
                .build()

        val body = params._body()
    }
}
