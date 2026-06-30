// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.texml.accounts.queues

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class QueueDeleteParamsTest {

    @Test
    fun create() {
        QueueDeleteParams.builder().accountSid("account_sid").queueSid("queue_sid").build()
    }

    @Test
    fun pathParams() {
        val params =
            QueueDeleteParams.builder().accountSid("account_sid").queueSid("queue_sid").build()

        assertThat(params._pathParam(0)).isEqualTo("account_sid")
        assertThat(params._pathParam(1)).isEqualTo("queue_sid")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }
}
