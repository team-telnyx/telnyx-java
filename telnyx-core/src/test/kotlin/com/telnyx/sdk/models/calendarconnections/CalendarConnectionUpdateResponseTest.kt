// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.calendarconnections

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.meetingsessions.MeetingSessionRecordingDestination
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CalendarConnectionUpdateResponseTest {

    @Test
    fun create() {
        val calendarConnectionUpdateResponse =
            CalendarConnectionUpdateResponse.builder()
                .data(
                    CalendarConnectionUpdateResponse.Data.builder()
                        .id("id")
                        .autoJoinPolicy(
                            CalendarConnectionUpdateResponse.Data.AutoJoinPolicy.ALL_MEETINGS
                        )
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
                        .platform(CalendarConnectionUpdateResponse.Data.Platform.GOOGLE_CALENDAR)
                        .platformEmail("platform_email")
                        .status(CalendarConnectionUpdateResponse.Data.Status.CONNECTED)
                        .statusDetail("status_detail")
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .webhookSecret("webhook_secret")
                        .build()
                )
                .build()

        assertThat(calendarConnectionUpdateResponse.data())
            .isEqualTo(
                CalendarConnectionUpdateResponse.Data.builder()
                    .id("id")
                    .autoJoinPolicy(
                        CalendarConnectionUpdateResponse.Data.AutoJoinPolicy.ALL_MEETINGS
                    )
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
                    .platform(CalendarConnectionUpdateResponse.Data.Platform.GOOGLE_CALENDAR)
                    .platformEmail("platform_email")
                    .status(CalendarConnectionUpdateResponse.Data.Status.CONNECTED)
                    .statusDetail("status_detail")
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .webhookSecret("webhook_secret")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val calendarConnectionUpdateResponse =
            CalendarConnectionUpdateResponse.builder()
                .data(
                    CalendarConnectionUpdateResponse.Data.builder()
                        .id("id")
                        .autoJoinPolicy(
                            CalendarConnectionUpdateResponse.Data.AutoJoinPolicy.ALL_MEETINGS
                        )
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
                        .platform(CalendarConnectionUpdateResponse.Data.Platform.GOOGLE_CALENDAR)
                        .platformEmail("platform_email")
                        .status(CalendarConnectionUpdateResponse.Data.Status.CONNECTED)
                        .statusDetail("status_detail")
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .webhookSecret("webhook_secret")
                        .build()
                )
                .build()

        val roundtrippedCalendarConnectionUpdateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(calendarConnectionUpdateResponse),
                jacksonTypeRef<CalendarConnectionUpdateResponse>(),
            )

        assertThat(roundtrippedCalendarConnectionUpdateResponse)
            .isEqualTo(calendarConnectionUpdateResponse)
    }
}
