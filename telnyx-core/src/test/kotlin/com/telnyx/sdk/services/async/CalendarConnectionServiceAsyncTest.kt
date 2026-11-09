// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.models.calendarconnections.CalendarConnectionCreateParams
import com.telnyx.sdk.models.calendarconnections.CalendarConnectionUpdateParams
import com.telnyx.sdk.models.meetingsessions.MeetingSessionRecordingDestination
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class CalendarConnectionServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val calendarConnectionServiceAsync = client.calendarConnections()

        val calendarConnectionFuture =
            calendarConnectionServiceAsync.create(
                CalendarConnectionCreateParams.builder()
                    .platform(CalendarConnectionCreateParams.Platform.GOOGLE_CALENDAR)
                    .build()
            )

        val calendarConnection = calendarConnectionFuture.get()
        calendarConnection.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val calendarConnectionServiceAsync = client.calendarConnections()

        val calendarConnectionResponseFuture = calendarConnectionServiceAsync.retrieve("id")

        val calendarConnectionResponse = calendarConnectionResponseFuture.get()
        calendarConnectionResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val calendarConnectionServiceAsync = client.calendarConnections()

        val calendarConnectionFuture =
            calendarConnectionServiceAsync.update(
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

        val calendarConnection = calendarConnectionFuture.get()
        calendarConnection.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val calendarConnectionServiceAsync = client.calendarConnections()

        val calendarConnectionsFuture = calendarConnectionServiceAsync.list()

        val calendarConnections = calendarConnectionsFuture.get()
        calendarConnections.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val calendarConnectionServiceAsync = client.calendarConnections()

        val calendarConnectionResponseFuture = calendarConnectionServiceAsync.delete("id")

        val calendarConnectionResponse = calendarConnectionResponseFuture.get()
        calendarConnectionResponse.validate()
    }
}
