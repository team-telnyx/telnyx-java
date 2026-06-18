// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.queues.calls

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CallUpdateParamsTest {

    @Test
    fun create() {
        CallUpdateParams.builder()
            .queueName("queue_name")
            .callControlId("call_control_id")
            .keepAfterHangup(true)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            CallUpdateParams.builder()
                .queueName("queue_name")
                .callControlId("call_control_id")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("queue_name")
        assertThat(params._pathParam(1)).isEqualTo("call_control_id")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            CallUpdateParams.builder()
                .queueName("queue_name")
                .callControlId("call_control_id")
                .keepAfterHangup(true)
                .build()

        val body = params._body()

        assertThat(body.keepAfterHangup()).contains(true)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            CallUpdateParams.builder()
                .queueName("queue_name")
                .callControlId("call_control_id")
                .build()

        val body = params._body()
    }
}
