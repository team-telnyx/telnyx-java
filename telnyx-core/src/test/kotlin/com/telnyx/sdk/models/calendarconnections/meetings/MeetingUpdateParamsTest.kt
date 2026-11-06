// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.calendarconnections.meetings

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MeetingUpdateParamsTest {

    @Test
    fun create() {
        MeetingUpdateParams.builder().id("id").meetingId("meeting_id").botWillJoin(false).build()
    }

    @Test
    fun pathParams() {
        val params =
            MeetingUpdateParams.builder()
                .id("id")
                .meetingId("meeting_id")
                .botWillJoin(false)
                .build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        assertThat(params._pathParam(1)).isEqualTo("meeting_id")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            MeetingUpdateParams.builder()
                .id("id")
                .meetingId("meeting_id")
                .botWillJoin(false)
                .build()

        val body = params._body()

        assertThat(body.botWillJoin()).contains(false)
    }
}
