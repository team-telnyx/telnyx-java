// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.calendarconnections

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.meetingsessions.MeetingSessionRecordingDestination
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CalendarConnectionTest {

    @Test
    fun create() {
        val calendarConnection =
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

        assertThat(calendarConnection.id()).isEqualTo("id")
        assertThat(calendarConnection.autoJoinPolicy())
            .isEqualTo(CalendarConnection.AutoJoinPolicy.ALL_MEETINGS)
        assertThat(calendarConnection.botName()).contains("x")
        assertThat(calendarConnection.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(calendarConnection.defaultAssistant())
            .contains(
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
        assertThat(calendarConnection.defaultBargeIn()).contains(true)
        assertThat(calendarConnection.defaultRecording()).contains(true)
        assertThat(calendarConnection.defaultRecordingExport())
            .contains(
                MeetingSessionRecordingDestination.builder()
                    .bucket("bucket")
                    .prefix("prefix")
                    .build()
            )
        assertThat(calendarConnection.defaultSummarizeOnEnd()).contains(true)
        assertThat(calendarConnection.defaultVoice()).contains("x")
        assertThat(calendarConnection.defaultWebhookUrl()).contains("https://example.com")
        assertThat(calendarConnection.platform())
            .isEqualTo(CalendarConnection.Platform.GOOGLE_CALENDAR)
        assertThat(calendarConnection.platformEmail()).contains("platform_email")
        assertThat(calendarConnection.status()).isEqualTo(CalendarConnection.Status.CONNECTED)
        assertThat(calendarConnection.statusDetail()).contains("status_detail")
        assertThat(calendarConnection.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val calendarConnection =
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

        val roundtrippedCalendarConnection =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(calendarConnection),
                jacksonTypeRef<CalendarConnection>(),
            )

        assertThat(roundtrippedCalendarConnection).isEqualTo(calendarConnection)
    }
}
