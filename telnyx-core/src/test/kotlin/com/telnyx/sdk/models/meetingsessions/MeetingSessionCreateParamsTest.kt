// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.meetingsessions

import com.telnyx.sdk.core.JsonValue
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MeetingSessionCreateParamsTest {

    @Test
    fun create() {
        MeetingSessionCreateParams.builder()
            .meetingUrl("https://zoom.us/j/1234567890")
            .assistant(
                MeetingSessionCreateParams.Assistant.builder()
                    .id("x")
                    .audioGate(MeetingSessionCreateParams.Assistant.AudioGate.HALF_DUPLEX)
                    .avatar(true)
                    .dynamicVariables(
                        MeetingSessionCreateParams.Assistant.DynamicVariables.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .leaveOnEnd(true)
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
            .chatOnEnter("x")
            .idempotencyKey("weekly-planning-2026-11-10")
            .joinAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .leavePolicy(
                MeetingSessionLeavePolicy.builder()
                    .aloneSeconds(300L)
                    .addBotNameKeyword("x")
                    .hostWaitSeconds(1L)
                    .lobbyWaitSeconds(1L)
                    .maxDurationSeconds(7200L)
                    .silenceGraceSeconds(1L)
                    .silenceSeconds(1L)
                    .build()
            )
            .metadata(
                MeetingSessionCreateParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
            .recording(true)
            .recordingExport(
                MeetingSessionRecordingDestination.builder()
                    .bucket("meeting-recordings")
                    .prefix("weekly-planning")
                    .build()
            )
            .recordingView(MeetingSessionCreateParams.RecordingView.SPEAKER_VIEW)
            .speakOnEnter("x")
            .summarizeOnEnd(true)
            .voice("x")
            .webhookUrl("https://example.com")
            .build()
    }

    @Test
    fun body() {
        val params =
            MeetingSessionCreateParams.builder()
                .meetingUrl("https://zoom.us/j/1234567890")
                .assistant(
                    MeetingSessionCreateParams.Assistant.builder()
                        .id("x")
                        .audioGate(MeetingSessionCreateParams.Assistant.AudioGate.HALF_DUPLEX)
                        .avatar(true)
                        .dynamicVariables(
                            MeetingSessionCreateParams.Assistant.DynamicVariables.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .leaveOnEnd(true)
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
                .chatOnEnter("x")
                .idempotencyKey("weekly-planning-2026-11-10")
                .joinAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .leavePolicy(
                    MeetingSessionLeavePolicy.builder()
                        .aloneSeconds(300L)
                        .addBotNameKeyword("x")
                        .hostWaitSeconds(1L)
                        .lobbyWaitSeconds(1L)
                        .maxDurationSeconds(7200L)
                        .silenceGraceSeconds(1L)
                        .silenceSeconds(1L)
                        .build()
                )
                .metadata(
                    MeetingSessionCreateParams.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .recording(true)
                .recordingExport(
                    MeetingSessionRecordingDestination.builder()
                        .bucket("meeting-recordings")
                        .prefix("weekly-planning")
                        .build()
                )
                .recordingView(MeetingSessionCreateParams.RecordingView.SPEAKER_VIEW)
                .speakOnEnter("x")
                .summarizeOnEnd(true)
                .voice("x")
                .webhookUrl("https://example.com")
                .build()

        val body = params._body()

        assertThat(body.meetingUrl()).isEqualTo("https://zoom.us/j/1234567890")
        assertThat(body.assistant())
            .contains(
                MeetingSessionCreateParams.Assistant.builder()
                    .id("x")
                    .audioGate(MeetingSessionCreateParams.Assistant.AudioGate.HALF_DUPLEX)
                    .avatar(true)
                    .dynamicVariables(
                        MeetingSessionCreateParams.Assistant.DynamicVariables.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .leaveOnEnd(true)
                    .build()
            )
        assertThat(body.bargeIn()).contains(true)
        assertThat(body.botName()).contains("Notetaker")
        assertThat(body.cameraImage())
            .contains(
                MeetingSessionCreateParams.CameraImage.ofMeetingSessionCameraImageBase64Source(
                    MeetingSessionCreateParams.CameraImage.MeetingSessionCameraImageBase64Source
                        .builder()
                        .base64Data(
                            "/9j/4AAQSkZJRgABAQAAAQABAAD/2wBDAAMCAgMCAgMDAwMEAwMEBQgFBQQEBQoHBwYIDAoMDAsKCwsNDhIQDQ4RDgsLEBYQERMUFRUVDA8XGBYUGBIUFRT/wAALCAACAAIBAREA/8QAFAABAAAAAAAAAAAAAAAAAAAACP/EAB4QAAAEBwAAAAAAAAAAAAAAAAAEBgcCFic1RVNi/9oACAEBAAA/AH8hGJbWR09TxKW4vhC2qHgf/9k="
                        )
                        .build()
                )
            )
        assertThat(body.chatOnEnter()).contains("x")
        assertThat(body.idempotencyKey()).contains("weekly-planning-2026-11-10")
        assertThat(body.joinAt()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body.leavePolicy())
            .contains(
                MeetingSessionLeavePolicy.builder()
                    .aloneSeconds(300L)
                    .addBotNameKeyword("x")
                    .hostWaitSeconds(1L)
                    .lobbyWaitSeconds(1L)
                    .maxDurationSeconds(7200L)
                    .silenceGraceSeconds(1L)
                    .silenceSeconds(1L)
                    .build()
            )
        assertThat(body.metadata())
            .contains(
                MeetingSessionCreateParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.recording()).contains(true)
        assertThat(body.recordingExport())
            .contains(
                MeetingSessionRecordingDestination.builder()
                    .bucket("meeting-recordings")
                    .prefix("weekly-planning")
                    .build()
            )
        assertThat(body.recordingView())
            .contains(MeetingSessionCreateParams.RecordingView.SPEAKER_VIEW)
        assertThat(body.speakOnEnter()).contains("x")
        assertThat(body.summarizeOnEnd()).contains(true)
        assertThat(body.voice()).contains("x")
        assertThat(body.webhookUrl()).contains("https://example.com")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            MeetingSessionCreateParams.builder().meetingUrl("https://zoom.us/j/1234567890").build()

        val body = params._body()

        assertThat(body.meetingUrl()).isEqualTo("https://zoom.us/j/1234567890")
    }
}
