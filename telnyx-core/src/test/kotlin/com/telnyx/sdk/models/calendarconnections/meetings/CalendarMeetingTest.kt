// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.calendarconnections.meetings

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CalendarMeetingTest {

    @Test
    fun create() {
        val calendarMeeting =
            CalendarMeeting.builder()
                .id("id")
                .addAttendee(
                    CalendarMeeting.Attendee.builder()
                        .displayName("display_name")
                        .email("email")
                        .optional(true)
                        .responseStatus("response_status")
                        .self(true)
                        .build()
                )
                .botWillJoin(true)
                .botWillJoinOverride(true)
                .decision(CalendarMeeting.Decision.PENDING)
                .endTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .isExternalOrganizer(true)
                .organizer(
                    CalendarMeeting.Organizer.builder()
                        .displayName("display_name")
                        .email("email")
                        .self(true)
                        .build()
                )
                .platform(CalendarMeeting.Platform.ZOOM)
                .sessionId("session_id")
                .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(calendarMeeting.id()).isEqualTo("id")
        assertThat(calendarMeeting.attendees())
            .containsExactly(
                CalendarMeeting.Attendee.builder()
                    .displayName("display_name")
                    .email("email")
                    .optional(true)
                    .responseStatus("response_status")
                    .self(true)
                    .build()
            )
        assertThat(calendarMeeting.botWillJoin()).isEqualTo(true)
        assertThat(calendarMeeting.botWillJoinOverride()).contains(true)
        assertThat(calendarMeeting.decision()).isEqualTo(CalendarMeeting.Decision.PENDING)
        assertThat(calendarMeeting.endTime())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(calendarMeeting.isExternalOrganizer()).contains(true)
        assertThat(calendarMeeting.organizer())
            .contains(
                CalendarMeeting.Organizer.builder()
                    .displayName("display_name")
                    .email("email")
                    .self(true)
                    .build()
            )
        assertThat(calendarMeeting.platform()).isEqualTo(CalendarMeeting.Platform.ZOOM)
        assertThat(calendarMeeting.sessionId()).contains("session_id")
        assertThat(calendarMeeting.startTime())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val calendarMeeting =
            CalendarMeeting.builder()
                .id("id")
                .addAttendee(
                    CalendarMeeting.Attendee.builder()
                        .displayName("display_name")
                        .email("email")
                        .optional(true)
                        .responseStatus("response_status")
                        .self(true)
                        .build()
                )
                .botWillJoin(true)
                .botWillJoinOverride(true)
                .decision(CalendarMeeting.Decision.PENDING)
                .endTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .isExternalOrganizer(true)
                .organizer(
                    CalendarMeeting.Organizer.builder()
                        .displayName("display_name")
                        .email("email")
                        .self(true)
                        .build()
                )
                .platform(CalendarMeeting.Platform.ZOOM)
                .sessionId("session_id")
                .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedCalendarMeeting =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(calendarMeeting),
                jacksonTypeRef<CalendarMeeting>(),
            )

        assertThat(roundtrippedCalendarMeeting).isEqualTo(calendarMeeting)
    }
}
