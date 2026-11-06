// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.calendarconnections

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CalendarConnectionCreateParamsTest {

    @Test
    fun create() {
        CalendarConnectionCreateParams.builder()
            .platform(CalendarConnectionCreateParams.Platform.GOOGLE_CALENDAR)
            .build()
    }

    @Test
    fun body() {
        val params =
            CalendarConnectionCreateParams.builder()
                .platform(CalendarConnectionCreateParams.Platform.GOOGLE_CALENDAR)
                .build()

        val body = params._body()

        assertThat(body.platform())
            .isEqualTo(CalendarConnectionCreateParams.Platform.GOOGLE_CALENDAR)
    }
}
