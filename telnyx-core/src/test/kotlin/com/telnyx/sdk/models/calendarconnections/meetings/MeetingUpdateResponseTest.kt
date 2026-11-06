// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.calendarconnections.meetings

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MeetingUpdateResponseTest {

    @Test
    fun create() {
        val meetingUpdateResponse =
            MeetingUpdateResponse.builder()
                .data(
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
                )
                .build()

        assertThat(meetingUpdateResponse.data())
            .isEqualTo(
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
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val meetingUpdateResponse =
            MeetingUpdateResponse.builder()
                .data(
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
                )
                .build()

        val roundtrippedMeetingUpdateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(meetingUpdateResponse),
                jacksonTypeRef<MeetingUpdateResponse>(),
            )

        assertThat(roundtrippedMeetingUpdateResponse).isEqualTo(meetingUpdateResponse)
    }
}
