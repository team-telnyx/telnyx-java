// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.calendarconnections

import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.models.meetingsessions.MeetingSessionRecordingDestination
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CalendarConnectionUpdateParamsTest {

    @Test
    fun create() {
        CalendarConnectionUpdateParams.builder()
            .id("id")
            .autoJoinPolicy(CalendarConnectionUpdateParams.AutoJoinPolicy.ALL_MEETINGS)
            .botName("x")
            .defaultAssistant(
                CalendarConnectionUpdateParams.DefaultAssistant.builder()
                    .id("x")
                    .audioGate(
                        CalendarConnectionUpdateParams.DefaultAssistant.AudioGate.HALF_DUPLEX
                    )
                    .dynamicVariables(
                        CalendarConnectionUpdateParams.DefaultAssistant.DynamicVariables.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .leaveOnEnd(true)
                    .build()
            )
            .defaultBargeIn(true)
            .defaultRecording(true)
            .defaultRecordingExport(
                MeetingSessionRecordingDestination.builder()
                    .bucket("meeting-recordings")
                    .prefix("prefix")
                    .build()
            )
            .defaultSummarizeOnEnd(true)
            .defaultVoice("x")
            .defaultWebhookUrl("https://example.com/meeting-events")
            .build()
    }

    @Test
    fun pathParams() {
        val params = CalendarConnectionUpdateParams.builder().id("id").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            CalendarConnectionUpdateParams.builder()
                .id("id")
                .autoJoinPolicy(CalendarConnectionUpdateParams.AutoJoinPolicy.ALL_MEETINGS)
                .botName("x")
                .defaultAssistant(
                    CalendarConnectionUpdateParams.DefaultAssistant.builder()
                        .id("x")
                        .audioGate(
                            CalendarConnectionUpdateParams.DefaultAssistant.AudioGate.HALF_DUPLEX
                        )
                        .dynamicVariables(
                            CalendarConnectionUpdateParams.DefaultAssistant.DynamicVariables
                                .builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .leaveOnEnd(true)
                        .build()
                )
                .defaultBargeIn(true)
                .defaultRecording(true)
                .defaultRecordingExport(
                    MeetingSessionRecordingDestination.builder()
                        .bucket("meeting-recordings")
                        .prefix("prefix")
                        .build()
                )
                .defaultSummarizeOnEnd(true)
                .defaultVoice("x")
                .defaultWebhookUrl("https://example.com/meeting-events")
                .build()

        val body = params._body()

        assertThat(body.autoJoinPolicy())
            .contains(CalendarConnectionUpdateParams.AutoJoinPolicy.ALL_MEETINGS)
        assertThat(body.botName()).contains("x")
        assertThat(body.defaultAssistant())
            .contains(
                CalendarConnectionUpdateParams.DefaultAssistant.builder()
                    .id("x")
                    .audioGate(
                        CalendarConnectionUpdateParams.DefaultAssistant.AudioGate.HALF_DUPLEX
                    )
                    .dynamicVariables(
                        CalendarConnectionUpdateParams.DefaultAssistant.DynamicVariables.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .leaveOnEnd(true)
                    .build()
            )
        assertThat(body.defaultBargeIn()).contains(true)
        assertThat(body.defaultRecording()).contains(true)
        assertThat(body.defaultRecordingExport())
            .contains(
                MeetingSessionRecordingDestination.builder()
                    .bucket("meeting-recordings")
                    .prefix("prefix")
                    .build()
            )
        assertThat(body.defaultSummarizeOnEnd()).contains(true)
        assertThat(body.defaultVoice()).contains("x")
        assertThat(body.defaultWebhookUrl()).contains("https://example.com/meeting-events")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = CalendarConnectionUpdateParams.builder().id("id").build()

        val body = params._body()
    }
}
