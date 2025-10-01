// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.webhooks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ConferenceSpeakEndedWebhookEventTest {

    @Test
    fun create() {
        val conferenceSpeakEndedWebhookEvent =
            ConferenceSpeakEndedWebhookEvent.builder()
                .data(
                    ConferenceSpeakEndedWebhookEvent.Data.builder()
                        .id("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                        .eventType(
                            ConferenceSpeakEndedWebhookEvent.Data.EventType.CONFERENCE_SPEAK_ENDED
                        )
                        .payload(
                            ConferenceSpeakEndedWebhookEvent.Data.Payload.builder()
                                .conferenceId("428c31b6-abf3-3bc1-b7f4-5013ef9657c1")
                                .connectionId("7267xxxxxxxxxxxxxx")
                                .creatorCallSessionId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                                .occurredAt(OffsetDateTime.parse("2018-02-02T22:25:27.521Z"))
                                .build()
                        )
                        .recordType(ConferenceSpeakEndedWebhookEvent.Data.RecordType.EVENT)
                        .build()
                )
                .build()

        assertThat(conferenceSpeakEndedWebhookEvent.data())
            .contains(
                ConferenceSpeakEndedWebhookEvent.Data.builder()
                    .id("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                    .eventType(
                        ConferenceSpeakEndedWebhookEvent.Data.EventType.CONFERENCE_SPEAK_ENDED
                    )
                    .payload(
                        ConferenceSpeakEndedWebhookEvent.Data.Payload.builder()
                            .conferenceId("428c31b6-abf3-3bc1-b7f4-5013ef9657c1")
                            .connectionId("7267xxxxxxxxxxxxxx")
                            .creatorCallSessionId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                            .occurredAt(OffsetDateTime.parse("2018-02-02T22:25:27.521Z"))
                            .build()
                    )
                    .recordType(ConferenceSpeakEndedWebhookEvent.Data.RecordType.EVENT)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val conferenceSpeakEndedWebhookEvent =
            ConferenceSpeakEndedWebhookEvent.builder()
                .data(
                    ConferenceSpeakEndedWebhookEvent.Data.builder()
                        .id("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                        .eventType(
                            ConferenceSpeakEndedWebhookEvent.Data.EventType.CONFERENCE_SPEAK_ENDED
                        )
                        .payload(
                            ConferenceSpeakEndedWebhookEvent.Data.Payload.builder()
                                .conferenceId("428c31b6-abf3-3bc1-b7f4-5013ef9657c1")
                                .connectionId("7267xxxxxxxxxxxxxx")
                                .creatorCallSessionId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                                .occurredAt(OffsetDateTime.parse("2018-02-02T22:25:27.521Z"))
                                .build()
                        )
                        .recordType(ConferenceSpeakEndedWebhookEvent.Data.RecordType.EVENT)
                        .build()
                )
                .build()

        val roundtrippedConferenceSpeakEndedWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(conferenceSpeakEndedWebhookEvent),
                jacksonTypeRef<ConferenceSpeakEndedWebhookEvent>(),
            )

        assertThat(roundtrippedConferenceSpeakEndedWebhookEvent)
            .isEqualTo(conferenceSpeakEndedWebhookEvent)
    }
}
