// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.models.meetingsessions.MeetingSessionCreateParams
import com.telnyx.sdk.models.meetingsessions.MeetingSessionListParams
import com.telnyx.sdk.models.meetingsessions.MeetingSessionRetrieveEventsParams
import com.telnyx.sdk.models.meetingsessions.MeetingSessionRetrieveTranscriptParams
import com.telnyx.sdk.models.meetingsessions.MeetingSessionUpdateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class MeetingSessionServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val meetingSessionServiceAsync = client.meetingSessions()

        val meetingSessionResponseFuture =
            meetingSessionServiceAsync.create(
                MeetingSessionCreateParams.builder()
                    .meetingUrl("https://zoom.us/j/1234567890")
                    .assistant(
                        MeetingSessionCreateParams.Assistant.builder()
                            .id("asst_fake-uuid-1234")
                            .callControlConnectionId("conn-fake-abcdef")
                            .from("+12025550199")
                            .loopbackSipUri("sip:loopback@example.invalid")
                            .audioGate(MeetingSessionCreateParams.Assistant.AudioGate.HALF_DUPLEX)
                            .build()
                    )
                    .avatar(
                        MeetingSessionCreateParams.Avatar.builder()
                            .apiKey("fake_avatar_api_key_do_not_use")
                            .avatarId("avatar_fake-001")
                            .build()
                    )
                    .bargeIn(true)
                    .botName("Notetaker")
                    .cameraImage(
                        MeetingSessionCreateParams.CameraImage.MeetingSessionCameraImageBase64Source
                            .builder()
                            .base64Data(
                                "/9j/4AAQSkZJRgABAQAAAQABAAD/2wBDAAMCAgMCAgMDAwMEAwMEBQgFBQQEBQoHBwYIDAoMDAsKCwsNDhIQDQ4RDgsLEBYQERMUFRUVDA8XGBYUGBIUFRT/wAALCAACAAIBAREA/8QAFAABAAAAAAAAAAAAAAAAAAAACP/EAB4QAAAEBwAAAAAAAAAAAAAAAAAEBgcCFic1RVNi/9oACAEBAAA/AH8hGJbWR09TxKW4vhC2qHgf/9k="
                            )
                            .build()
                    )
                    .idempotencyKey("x")
                    .joinAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .metadata(
                        MeetingSessionCreateParams.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .speakOnEnter("x")
                    .summarizeOnEnd(true)
                    .voice("x")
                    .webhookUrl("https://example.com")
                    .build()
            )

        val meetingSessionResponse = meetingSessionResponseFuture.get()
        meetingSessionResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val meetingSessionServiceAsync = client.meetingSessions()

        val meetingSessionResponseFuture =
            meetingSessionServiceAsync.retrieve("mtgsess_a1b2c3d4-e5f6-7890-abcd-ef1234567890")

        val meetingSessionResponse = meetingSessionResponseFuture.get()
        meetingSessionResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val meetingSessionServiceAsync = client.meetingSessions()

        val meetingSessionResponseFuture =
            meetingSessionServiceAsync.update(
                MeetingSessionUpdateParams.builder()
                    .id("mtgsess_a1b2c3d4-e5f6-7890-abcd-ef1234567890")
                    .botName("x")
                    .joinAt(OffsetDateTime.parse("2026-08-05T17:00:00Z"))
                    .build()
            )

        val meetingSessionResponse = meetingSessionResponseFuture.get()
        meetingSessionResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val meetingSessionServiceAsync = client.meetingSessions()

        val meetingSessionsFuture =
            meetingSessionServiceAsync.list(
                MeetingSessionListParams.builder()
                    .status(MeetingSessionListParams.Status.SCHEDULED)
                    .build()
            )

        val meetingSessions = meetingSessionsFuture.get()
        meetingSessions.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val meetingSessionServiceAsync = client.meetingSessions()

        val meetingSessionResponseFuture =
            meetingSessionServiceAsync.delete("mtgsess_a1b2c3d4-e5f6-7890-abcd-ef1234567890")

        val meetingSessionResponse = meetingSessionResponseFuture.get()
        meetingSessionResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun deleteRecordingMedia() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val meetingSessionServiceAsync = client.meetingSessions()

        val responseFuture =
            meetingSessionServiceAsync.deleteRecordingMedia(
                "mtgsess_a1b2c3d4-e5f6-7890-abcd-ef1234567890"
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieveEvents() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val meetingSessionServiceAsync = client.meetingSessions()

        val responseFuture =
            meetingSessionServiceAsync.retrieveEvents(
                MeetingSessionRetrieveEventsParams.builder()
                    .id("mtgsess_a1b2c3d4-e5f6-7890-abcd-ef1234567890")
                    .after(0L)
                    .limit(1L)
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieveRecordings() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val meetingSessionServiceAsync = client.meetingSessions()

        val responseFuture =
            meetingSessionServiceAsync.retrieveRecordings(
                "mtgsess_a1b2c3d4-e5f6-7890-abcd-ef1234567890"
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieveTranscript() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val meetingSessionServiceAsync = client.meetingSessions()

        val responseFuture =
            meetingSessionServiceAsync.retrieveTranscript(
                MeetingSessionRetrieveTranscriptParams.builder()
                    .id("mtgsess_a1b2c3d4-e5f6-7890-abcd-ef1234567890")
                    .after(0L)
                    .limit(1L)
                    .waitSeconds(0L)
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
