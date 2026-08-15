// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.models.meetingsessions.MeetingSessionCreateParams
import com.telnyx.sdk.models.meetingsessions.MeetingSessionListParams
import com.telnyx.sdk.models.meetingsessions.MeetingSessionRetrieveEventsParams
import com.telnyx.sdk.models.meetingsessions.MeetingSessionRetrieveTranscriptParams
import com.telnyx.sdk.models.meetingsessions.MeetingSessionUpdateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class MeetingSessionServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val meetingSessionService = client.meetingSessions()

        val meetingSessionResponse =
            meetingSessionService.create(
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

        meetingSessionResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val meetingSessionService = client.meetingSessions()

        val meetingSessionResponse =
            meetingSessionService.retrieve("mtgsess_a1b2c3d4-e5f6-7890-abcd-ef1234567890")

        meetingSessionResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val meetingSessionService = client.meetingSessions()

        val meetingSessionResponse =
            meetingSessionService.update(
                MeetingSessionUpdateParams.builder()
                    .id("mtgsess_a1b2c3d4-e5f6-7890-abcd-ef1234567890")
                    .botName("x")
                    .joinAt(OffsetDateTime.parse("2026-08-05T17:00:00Z"))
                    .build()
            )

        meetingSessionResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val meetingSessionService = client.meetingSessions()

        val meetingSessions =
            meetingSessionService.list(
                MeetingSessionListParams.builder()
                    .status(MeetingSessionListParams.Status.SCHEDULED)
                    .build()
            )

        meetingSessions.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val meetingSessionService = client.meetingSessions()

        val meetingSessionResponse =
            meetingSessionService.delete("mtgsess_a1b2c3d4-e5f6-7890-abcd-ef1234567890")

        meetingSessionResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun deleteRecordingMedia() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val meetingSessionService = client.meetingSessions()

        val response =
            meetingSessionService.deleteRecordingMedia(
                "mtgsess_a1b2c3d4-e5f6-7890-abcd-ef1234567890"
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieveEvents() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val meetingSessionService = client.meetingSessions()

        val response =
            meetingSessionService.retrieveEvents(
                MeetingSessionRetrieveEventsParams.builder()
                    .id("mtgsess_a1b2c3d4-e5f6-7890-abcd-ef1234567890")
                    .after(0L)
                    .limit(1L)
                    .build()
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieveRecordings() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val meetingSessionService = client.meetingSessions()

        val response =
            meetingSessionService.retrieveRecordings("mtgsess_a1b2c3d4-e5f6-7890-abcd-ef1234567890")

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieveTranscript() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val meetingSessionService = client.meetingSessions()

        val response =
            meetingSessionService.retrieveTranscript(
                MeetingSessionRetrieveTranscriptParams.builder()
                    .id("mtgsess_a1b2c3d4-e5f6-7890-abcd-ef1234567890")
                    .after(0L)
                    .limit(1L)
                    .waitSeconds(0L)
                    .build()
            )

        response.validate()
    }
}
