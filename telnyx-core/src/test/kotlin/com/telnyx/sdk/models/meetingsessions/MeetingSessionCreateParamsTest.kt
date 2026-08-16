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
    }

    @Test
    fun body() {
        val params =
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

        val body = params._body()

        assertThat(body.meetingUrl()).isEqualTo("https://zoom.us/j/1234567890")
        assertThat(body.assistant())
            .contains(
                MeetingSessionCreateParams.Assistant.builder()
                    .id("asst_fake-uuid-1234")
                    .callControlConnectionId("conn-fake-abcdef")
                    .from("+12025550199")
                    .loopbackSipUri("sip:loopback@example.invalid")
                    .audioGate(MeetingSessionCreateParams.Assistant.AudioGate.HALF_DUPLEX)
                    .build()
            )
        assertThat(body.avatar())
            .contains(
                MeetingSessionCreateParams.Avatar.builder()
                    .apiKey("fake_avatar_api_key_do_not_use")
                    .avatarId("avatar_fake-001")
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
        assertThat(body.idempotencyKey()).contains("x")
        assertThat(body.joinAt()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body.metadata())
            .contains(
                MeetingSessionCreateParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
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
