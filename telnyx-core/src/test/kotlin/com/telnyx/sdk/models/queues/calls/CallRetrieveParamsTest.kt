// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.queues.calls

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CallRetrieveParamsTest {

    @Test
    fun create() {
        CallRetrieveParams.builder()
            .queueName("queue_name")
            .callControlId("call_control_id")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            CallRetrieveParams.builder()
                .queueName("queue_name")
                .callControlId("call_control_id")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("queue_name")
        assertThat(params._pathParam(1)).isEqualTo("call_control_id")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }
}
