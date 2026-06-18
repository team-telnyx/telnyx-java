// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.queues

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class QueueDeleteParamsTest {

    @Test
    fun create() {
        QueueDeleteParams.builder().queueName("queue_name").build()
    }

    @Test
    fun pathParams() {
        val params = QueueDeleteParams.builder().queueName("queue_name").build()

        assertThat(params._pathParam(0)).isEqualTo("queue_name")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
