// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.meetingsessions

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MeetingSessionRetrieveParamsTest {

    @Test
    fun create() {
        MeetingSessionRetrieveParams.builder()
            .id("mtgsess_a1b2c3d4-e5f6-7890-abcd-ef1234567890")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            MeetingSessionRetrieveParams.builder()
                .id("mtgsess_a1b2c3d4-e5f6-7890-abcd-ef1234567890")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("mtgsess_a1b2c3d4-e5f6-7890-abcd-ef1234567890")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
