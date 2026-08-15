// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.meetingsessions

import com.telnyx.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MeetingSessionListParamsTest {

    @Test
    fun create() {
        MeetingSessionListParams.builder().status(MeetingSessionListParams.Status.SCHEDULED).build()
    }

    @Test
    fun queryParams() {
        val params =
            MeetingSessionListParams.builder()
                .status(MeetingSessionListParams.Status.SCHEDULED)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("status", "scheduled").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = MeetingSessionListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
