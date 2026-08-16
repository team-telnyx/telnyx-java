// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.meetingsessions

import com.telnyx.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MeetingSessionRetrieveEventsParamsTest {

    @Test
    fun create() {
        MeetingSessionRetrieveEventsParams.builder()
            .id("mtgsess_a1b2c3d4-e5f6-7890-abcd-ef1234567890")
            .after(0L)
            .limit(1L)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            MeetingSessionRetrieveEventsParams.builder()
                .id("mtgsess_a1b2c3d4-e5f6-7890-abcd-ef1234567890")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("mtgsess_a1b2c3d4-e5f6-7890-abcd-ef1234567890")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            MeetingSessionRetrieveEventsParams.builder()
                .id("mtgsess_a1b2c3d4-e5f6-7890-abcd-ef1234567890")
                .after(0L)
                .limit(1L)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("after", "0").put("limit", "1").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            MeetingSessionRetrieveEventsParams.builder()
                .id("mtgsess_a1b2c3d4-e5f6-7890-abcd-ef1234567890")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
