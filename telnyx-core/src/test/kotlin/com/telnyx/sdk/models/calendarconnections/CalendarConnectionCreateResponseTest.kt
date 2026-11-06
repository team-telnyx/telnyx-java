// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.calendarconnections

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CalendarConnectionCreateResponseTest {

    @Test
    fun create() {
        val calendarConnectionCreateResponse =
            CalendarConnectionCreateResponse.builder()
                .data(
                    CalendarConnectionCreateResponse.Data.builder()
                        .oauthUrl("https://example.com")
                        .platform(CalendarConnectionCreateResponse.Data.Platform.GOOGLE_CALENDAR)
                        .build()
                )
                .build()

        assertThat(calendarConnectionCreateResponse.data())
            .isEqualTo(
                CalendarConnectionCreateResponse.Data.builder()
                    .oauthUrl("https://example.com")
                    .platform(CalendarConnectionCreateResponse.Data.Platform.GOOGLE_CALENDAR)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val calendarConnectionCreateResponse =
            CalendarConnectionCreateResponse.builder()
                .data(
                    CalendarConnectionCreateResponse.Data.builder()
                        .oauthUrl("https://example.com")
                        .platform(CalendarConnectionCreateResponse.Data.Platform.GOOGLE_CALENDAR)
                        .build()
                )
                .build()

        val roundtrippedCalendarConnectionCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(calendarConnectionCreateResponse),
                jacksonTypeRef<CalendarConnectionCreateResponse>(),
            )

        assertThat(roundtrippedCalendarConnectionCreateResponse)
            .isEqualTo(calendarConnectionCreateResponse)
    }
}
