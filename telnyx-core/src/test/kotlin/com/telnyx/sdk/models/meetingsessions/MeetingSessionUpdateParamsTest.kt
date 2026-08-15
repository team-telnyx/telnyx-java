// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.meetingsessions

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MeetingSessionUpdateParamsTest {

    @Test
    fun create() {
        MeetingSessionUpdateParams.builder()
            .id("mtgsess_a1b2c3d4-e5f6-7890-abcd-ef1234567890")
            .botName("x")
            .joinAt(OffsetDateTime.parse("2026-08-05T17:00:00Z"))
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            MeetingSessionUpdateParams.builder()
                .id("mtgsess_a1b2c3d4-e5f6-7890-abcd-ef1234567890")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("mtgsess_a1b2c3d4-e5f6-7890-abcd-ef1234567890")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            MeetingSessionUpdateParams.builder()
                .id("mtgsess_a1b2c3d4-e5f6-7890-abcd-ef1234567890")
                .botName("x")
                .joinAt(OffsetDateTime.parse("2026-08-05T17:00:00Z"))
                .build()

        val body = params._body()

        assertThat(body.botName()).contains("x")
        assertThat(body.joinAt()).contains(OffsetDateTime.parse("2026-08-05T17:00:00Z"))
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            MeetingSessionUpdateParams.builder()
                .id("mtgsess_a1b2c3d4-e5f6-7890-abcd-ef1234567890")
                .build()

        val body = params._body()
    }
}
