// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.models.calendarconnections.CalendarConnectionCreateParams
import com.telnyx.sdk.models.calendarconnections.CalendarConnectionUpdateParams
import com.telnyx.sdk.models.meetingsessions.MeetingSessionRecordingDestination
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class CalendarConnectionServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val calendarConnectionService = client.calendarConnections()

        val calendarConnection =
            calendarConnectionService.create(
                CalendarConnectionCreateParams.builder()
                    .platform(CalendarConnectionCreateParams.Platform.GOOGLE_CALENDAR)
                    .build()
            )

        calendarConnection.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val calendarConnectionService = client.calendarConnections()

        val calendarConnectionResponse = calendarConnectionService.retrieve("id")

        calendarConnectionResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val calendarConnectionService = client.calendarConnections()

        val calendarConnection =
            calendarConnectionService.update(
                CalendarConnectionUpdateParams.builder()
                    .id("id")
                    .autoJoinPolicy(CalendarConnectionUpdateParams.AutoJoinPolicy.ALL_MEETINGS)
                    .botName("x")
                    .defaultAssistant(
                        CalendarConnectionUpdateParams.DefaultAssistant.builder()
                            .id("x")
                            .audioGate(
                                CalendarConnectionUpdateParams.DefaultAssistant.AudioGate
                                    .HALF_DUPLEX
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
            )

        calendarConnection.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val calendarConnectionService = client.calendarConnections()

        val calendarConnections = calendarConnectionService.list()

        calendarConnections.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val calendarConnectionService = client.calendarConnections()

        val calendarConnectionResponse = calendarConnectionService.delete("id")

        calendarConnectionResponse.validate()
    }
}
