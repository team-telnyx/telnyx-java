// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.queues

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class QueueCreateParamsTest {

    @Test
    fun create() {
        QueueCreateParams.builder().queueName("tier_1_support").maxSize(100L).build()
    }

    @Test
    fun body() {
        val params = QueueCreateParams.builder().queueName("tier_1_support").maxSize(100L).build()

        val body = params._body()

        assertThat(body.queueName()).isEqualTo("tier_1_support")
        assertThat(body.maxSize()).contains(100L)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = QueueCreateParams.builder().queueName("tier_1_support").build()

        val body = params._body()

        assertThat(body.queueName()).isEqualTo("tier_1_support")
    }
}
