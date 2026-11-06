// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.calendarconnections

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.meetingsessions.MeetingSessionRecordingDestination
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CalendarConnectionListResponseTest {

    @Test
    fun create() {
        val calendarConnectionListResponse =
            CalendarConnectionListResponse.builder()
                .addData(
                    CalendarConnection.builder()
                        .id("id")
                        .autoJoinPolicy(CalendarConnection.AutoJoinPolicy.ALL_MEETINGS)
                        .botName("x")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .defaultAssistant(
                            MeetingSessionAssistant.builder()
                                .id("id")
                                .audioGate(MeetingSessionAssistant.AudioGate.HALF_DUPLEX)
                                .leaveOnEnd(true)
                                .dynamicVariables(
                                    MeetingSessionAssistant.DynamicVariables.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("string"))
                                        .build()
                                )
                                .build()
                        )
                        .defaultBargeIn(true)
                        .defaultRecording(true)
                        .defaultRecordingExport(
                            MeetingSessionRecordingDestination.builder()
                                .bucket("bucket")
                                .prefix("prefix")
                                .build()
                        )
                        .defaultSummarizeOnEnd(true)
                        .defaultVoice("x")
                        .defaultWebhookUrl("https://example.com")
                        .platform(CalendarConnection.Platform.GOOGLE_CALENDAR)
                        .platformEmail("platform_email")
                        .status(CalendarConnection.Status.CONNECTED)
                        .statusDetail("status_detail")
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .build()

        assertThat(calendarConnectionListResponse.data())
            .containsExactly(
                CalendarConnection.builder()
                    .id("id")
                    .autoJoinPolicy(CalendarConnection.AutoJoinPolicy.ALL_MEETINGS)
                    .botName("x")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .defaultAssistant(
                        MeetingSessionAssistant.builder()
                            .id("id")
                            .audioGate(MeetingSessionAssistant.AudioGate.HALF_DUPLEX)
                            .leaveOnEnd(true)
                            .dynamicVariables(
                                MeetingSessionAssistant.DynamicVariables.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .build()
                    )
                    .defaultBargeIn(true)
                    .defaultRecording(true)
                    .defaultRecordingExport(
                        MeetingSessionRecordingDestination.builder()
                            .bucket("bucket")
                            .prefix("prefix")
                            .build()
                    )
                    .defaultSummarizeOnEnd(true)
                    .defaultVoice("x")
                    .defaultWebhookUrl("https://example.com")
                    .platform(CalendarConnection.Platform.GOOGLE_CALENDAR)
                    .platformEmail("platform_email")
                    .status(CalendarConnection.Status.CONNECTED)
                    .statusDetail("status_detail")
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val calendarConnectionListResponse =
            CalendarConnectionListResponse.builder()
                .addData(
                    CalendarConnection.builder()
                        .id("id")
                        .autoJoinPolicy(CalendarConnection.AutoJoinPolicy.ALL_MEETINGS)
                        .botName("x")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .defaultAssistant(
                            MeetingSessionAssistant.builder()
                                .id("id")
                                .audioGate(MeetingSessionAssistant.AudioGate.HALF_DUPLEX)
                                .leaveOnEnd(true)
                                .dynamicVariables(
                                    MeetingSessionAssistant.DynamicVariables.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("string"))
                                        .build()
                                )
                                .build()
                        )
                        .defaultBargeIn(true)
                        .defaultRecording(true)
                        .defaultRecordingExport(
                            MeetingSessionRecordingDestination.builder()
                                .bucket("bucket")
                                .prefix("prefix")
                                .build()
                        )
                        .defaultSummarizeOnEnd(true)
                        .defaultVoice("x")
                        .defaultWebhookUrl("https://example.com")
                        .platform(CalendarConnection.Platform.GOOGLE_CALENDAR)
                        .platformEmail("platform_email")
                        .status(CalendarConnection.Status.CONNECTED)
                        .statusDetail("status_detail")
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .build()

        val roundtrippedCalendarConnectionListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(calendarConnectionListResponse),
                jacksonTypeRef<CalendarConnectionListResponse>(),
            )

        assertThat(roundtrippedCalendarConnectionListResponse)
            .isEqualTo(calendarConnectionListResponse)
    }
}
