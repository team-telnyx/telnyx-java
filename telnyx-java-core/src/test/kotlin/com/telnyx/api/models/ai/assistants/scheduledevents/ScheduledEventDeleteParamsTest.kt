// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.ai.assistants.scheduledevents

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ScheduledEventDeleteParamsTest {

    @Test
    fun create() {
        ScheduledEventDeleteParams.builder().assistantId("assistant_id").eventId("event_id").build()
    }

    @Test
    fun pathParams() {
        val params =
            ScheduledEventDeleteParams.builder()
                .assistantId("assistant_id")
                .eventId("event_id")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("assistant_id")
        assertThat(params._pathParam(1)).isEqualTo("event_id")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }
}
