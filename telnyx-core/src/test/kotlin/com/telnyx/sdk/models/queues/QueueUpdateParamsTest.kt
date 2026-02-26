// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.queues

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class QueueUpdateParamsTest {

    @Test
    fun create() {
        QueueUpdateParams.builder().queueName("queue_name").maxSize(200L).build()
    }

    @Test
    fun pathParams() {
        val params = QueueUpdateParams.builder().queueName("queue_name").maxSize(200L).build()

        assertThat(params._pathParam(0)).isEqualTo("queue_name")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params = QueueUpdateParams.builder().queueName("queue_name").maxSize(200L).build()

        val body = params._body()

        assertThat(body.maxSize()).isEqualTo(200L)
    }
}
