// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.meetingsessions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MeetingSessionTest {

    @Test
    fun create() {
        val meetingSession =
            MeetingSession.builder()
                .id("id")
                .accountId("account_id")
                .assistant(
                    MeetingSession.Assistant.builder()
                        .id("id")
                        .audioGate(MeetingSession.Assistant.AudioGate.NONE)
                        .build()
                )
                .assistantState(MeetingSession.AssistantState.STARTING)
                .assistantStateChangedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .avatar(MeetingSession.Avatar.builder().avatarId("avatar_id").build())
                .avatarState(MeetingSession.AvatarState.STARTING)
                .avatarStateChangedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .botName("bot_name")
                .config(
                    MeetingSession.Config.builder()
                        .bargeIn(true)
                        .speakOnEnter("speak_on_enter")
                        .summarizeOnEnd(true)
                        .voice("voice")
                        .build()
                )
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .endedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .failureReason("failure_reason")
                .joinAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .joinedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .meetingUrl("https://example.com")
                .metadata(
                    MeetingSession.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .platform(MeetingSession.Platform.ZOOM)
                .provider("provider")
                .recording(true)
                .status(MeetingSession.Status.SCHEDULED)
                .statusDetail("status_detail")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .webhookUrl("https://example.com")
                .build()

        assertThat(meetingSession.id()).isEqualTo("id")
        assertThat(meetingSession.accountId()).isEqualTo("account_id")
        assertThat(meetingSession.assistant())
            .contains(
                MeetingSession.Assistant.builder()
                    .id("id")
                    .audioGate(MeetingSession.Assistant.AudioGate.NONE)
                    .build()
            )
        assertThat(meetingSession.assistantState()).contains(MeetingSession.AssistantState.STARTING)
        assertThat(meetingSession.assistantStateChangedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(meetingSession.avatar())
            .contains(MeetingSession.Avatar.builder().avatarId("avatar_id").build())
        assertThat(meetingSession.avatarState()).contains(MeetingSession.AvatarState.STARTING)
        assertThat(meetingSession.avatarStateChangedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(meetingSession.botName()).isEqualTo("bot_name")
        assertThat(meetingSession.config())
            .isEqualTo(
                MeetingSession.Config.builder()
                    .bargeIn(true)
                    .speakOnEnter("speak_on_enter")
                    .summarizeOnEnd(true)
                    .voice("voice")
                    .build()
            )
        assertThat(meetingSession.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(meetingSession.endedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(meetingSession.failureReason()).contains("failure_reason")
        assertThat(meetingSession.joinAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(meetingSession.joinedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(meetingSession.meetingUrl()).isEqualTo("https://example.com")
        assertThat(meetingSession.metadata())
            .isEqualTo(
                MeetingSession.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(meetingSession.platform()).isEqualTo(MeetingSession.Platform.ZOOM)
        assertThat(meetingSession.provider()).isEqualTo("provider")
        assertThat(meetingSession.recording()).isEqualTo(true)
        assertThat(meetingSession.status()).isEqualTo(MeetingSession.Status.SCHEDULED)
        assertThat(meetingSession.statusDetail()).contains("status_detail")
        assertThat(meetingSession.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(meetingSession.webhookUrl()).contains("https://example.com")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val meetingSession =
            MeetingSession.builder()
                .id("id")
                .accountId("account_id")
                .assistant(
                    MeetingSession.Assistant.builder()
                        .id("id")
                        .audioGate(MeetingSession.Assistant.AudioGate.NONE)
                        .build()
                )
                .assistantState(MeetingSession.AssistantState.STARTING)
                .assistantStateChangedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .avatar(MeetingSession.Avatar.builder().avatarId("avatar_id").build())
                .avatarState(MeetingSession.AvatarState.STARTING)
                .avatarStateChangedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .botName("bot_name")
                .config(
                    MeetingSession.Config.builder()
                        .bargeIn(true)
                        .speakOnEnter("speak_on_enter")
                        .summarizeOnEnd(true)
                        .voice("voice")
                        .build()
                )
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .endedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .failureReason("failure_reason")
                .joinAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .joinedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .meetingUrl("https://example.com")
                .metadata(
                    MeetingSession.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .platform(MeetingSession.Platform.ZOOM)
                .provider("provider")
                .recording(true)
                .status(MeetingSession.Status.SCHEDULED)
                .statusDetail("status_detail")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .webhookUrl("https://example.com")
                .build()

        val roundtrippedMeetingSession =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(meetingSession),
                jacksonTypeRef<MeetingSession>(),
            )

        assertThat(roundtrippedMeetingSession).isEqualTo(meetingSession)
    }
}
