// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.webhooks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ConferenceEndedWebhookEventTest {

    @Test
    fun create() {
        val conferenceEndedWebhookEvent =
            ConferenceEndedWebhookEvent.builder()
                .data(
                    ConferenceEndedWebhookEvent.Data.builder()
                        .id("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                        .eventType(ConferenceEndedWebhookEvent.Data.EventType.CONFERENCE_ENDED)
                        .payload(
                            ConferenceEndedWebhookEvent.Data.Payload.builder()
                                .callControlId(
                                    "v3:MdI91X4lWFEs7IgbBEOT9M4AigoY08M0WWZFISt1Yw2axZ_IiE4pqg"
                                )
                                .callLegId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                                .callSessionId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                                .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                                .conferenceId("428c31b6-abf3-3bc1-b7f4-5013ef9657c1")
                                .connectionId("7267xxxxxxxxxxxxxx")
                                .occurredAt(OffsetDateTime.parse("2018-02-02T22:25:27.521Z"))
                                .reason(ConferenceEndedWebhookEvent.Data.Payload.Reason.HOST_LEFT)
                                .build()
                        )
                        .recordType(ConferenceEndedWebhookEvent.Data.RecordType.EVENT)
                        .build()
                )
                .build()

        assertThat(conferenceEndedWebhookEvent.data())
            .contains(
                ConferenceEndedWebhookEvent.Data.builder()
                    .id("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                    .eventType(ConferenceEndedWebhookEvent.Data.EventType.CONFERENCE_ENDED)
                    .payload(
                        ConferenceEndedWebhookEvent.Data.Payload.builder()
                            .callControlId(
                                "v3:MdI91X4lWFEs7IgbBEOT9M4AigoY08M0WWZFISt1Yw2axZ_IiE4pqg"
                            )
                            .callLegId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                            .callSessionId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                            .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                            .conferenceId("428c31b6-abf3-3bc1-b7f4-5013ef9657c1")
                            .connectionId("7267xxxxxxxxxxxxxx")
                            .occurredAt(OffsetDateTime.parse("2018-02-02T22:25:27.521Z"))
                            .reason(ConferenceEndedWebhookEvent.Data.Payload.Reason.HOST_LEFT)
                            .build()
                    )
                    .recordType(ConferenceEndedWebhookEvent.Data.RecordType.EVENT)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val conferenceEndedWebhookEvent =
            ConferenceEndedWebhookEvent.builder()
                .data(
                    ConferenceEndedWebhookEvent.Data.builder()
                        .id("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                        .eventType(ConferenceEndedWebhookEvent.Data.EventType.CONFERENCE_ENDED)
                        .payload(
                            ConferenceEndedWebhookEvent.Data.Payload.builder()
                                .callControlId(
                                    "v3:MdI91X4lWFEs7IgbBEOT9M4AigoY08M0WWZFISt1Yw2axZ_IiE4pqg"
                                )
                                .callLegId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                                .callSessionId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                                .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                                .conferenceId("428c31b6-abf3-3bc1-b7f4-5013ef9657c1")
                                .connectionId("7267xxxxxxxxxxxxxx")
                                .occurredAt(OffsetDateTime.parse("2018-02-02T22:25:27.521Z"))
                                .reason(ConferenceEndedWebhookEvent.Data.Payload.Reason.HOST_LEFT)
                                .build()
                        )
                        .recordType(ConferenceEndedWebhookEvent.Data.RecordType.EVENT)
                        .build()
                )
                .build()

        val roundtrippedConferenceEndedWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(conferenceEndedWebhookEvent),
                jacksonTypeRef<ConferenceEndedWebhookEvent>(),
            )

        assertThat(roundtrippedConferenceEndedWebhookEvent).isEqualTo(conferenceEndedWebhookEvent)
    }
}
