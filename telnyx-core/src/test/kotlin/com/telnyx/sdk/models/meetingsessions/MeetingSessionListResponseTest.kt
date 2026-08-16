// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.meetingsessions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MeetingSessionListResponseTest {

    @Test
    fun create() {
        val meetingSessionListResponse =
            MeetingSessionListResponse.builder()
                .addData(
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
                )
                .build()

        assertThat(meetingSessionListResponse.data())
            .containsExactly(
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
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val meetingSessionListResponse =
            MeetingSessionListResponse.builder()
                .addData(
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
                )
                .build()

        val roundtrippedMeetingSessionListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(meetingSessionListResponse),
                jacksonTypeRef<MeetingSessionListResponse>(),
            )

        assertThat(roundtrippedMeetingSessionListResponse).isEqualTo(meetingSessionListResponse)
    }
}
