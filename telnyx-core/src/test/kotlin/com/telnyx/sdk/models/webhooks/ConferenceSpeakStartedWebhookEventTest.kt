// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.webhooks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ConferenceSpeakStartedWebhookEventTest {

    @Test
    fun create() {
        val conferenceSpeakStartedWebhookEvent =
            ConferenceSpeakStartedWebhookEvent.builder()
                .data(
                    ConferenceSpeakStarted.builder()
                        .id("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                        .eventType(ConferenceSpeakStarted.EventType.CONFERENCE_SPEAK_STARTED)
                        .payload(
                            ConferenceSpeakStarted.Payload.builder()
                                .conferenceId("428c31b6-abf3-3bc1-b7f4-5013ef9657c1")
                                .connectionId("7267xxxxxxxxxxxxxx")
                                .creatorCallSessionId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                                .occurredAt(OffsetDateTime.parse("2018-02-02T22:25:27.521Z"))
                                .build()
                        )
                        .recordType(ConferenceSpeakStarted.RecordType.EVENT)
                        .build()
                )
                .build()

        assertThat(conferenceSpeakStartedWebhookEvent.data())
            .contains(
                ConferenceSpeakStarted.builder()
                    .id("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                    .eventType(ConferenceSpeakStarted.EventType.CONFERENCE_SPEAK_STARTED)
                    .payload(
                        ConferenceSpeakStarted.Payload.builder()
                            .conferenceId("428c31b6-abf3-3bc1-b7f4-5013ef9657c1")
                            .connectionId("7267xxxxxxxxxxxxxx")
                            .creatorCallSessionId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                            .occurredAt(OffsetDateTime.parse("2018-02-02T22:25:27.521Z"))
                            .build()
                    )
                    .recordType(ConferenceSpeakStarted.RecordType.EVENT)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val conferenceSpeakStartedWebhookEvent =
            ConferenceSpeakStartedWebhookEvent.builder()
                .data(
                    ConferenceSpeakStarted.builder()
                        .id("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                        .eventType(ConferenceSpeakStarted.EventType.CONFERENCE_SPEAK_STARTED)
                        .payload(
                            ConferenceSpeakStarted.Payload.builder()
                                .conferenceId("428c31b6-abf3-3bc1-b7f4-5013ef9657c1")
                                .connectionId("7267xxxxxxxxxxxxxx")
                                .creatorCallSessionId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                                .occurredAt(OffsetDateTime.parse("2018-02-02T22:25:27.521Z"))
                                .build()
                        )
                        .recordType(ConferenceSpeakStarted.RecordType.EVENT)
                        .build()
                )
                .build()

        val roundtrippedConferenceSpeakStartedWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(conferenceSpeakStartedWebhookEvent),
                jacksonTypeRef<ConferenceSpeakStartedWebhookEvent>(),
            )

        assertThat(roundtrippedConferenceSpeakStartedWebhookEvent)
            .isEqualTo(conferenceSpeakStartedWebhookEvent)
    }
}
