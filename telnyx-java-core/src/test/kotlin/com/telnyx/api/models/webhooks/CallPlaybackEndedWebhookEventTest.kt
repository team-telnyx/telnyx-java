// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.webhooks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CallPlaybackEndedWebhookEventTest {

    @Test
    fun create() {
        val callPlaybackEndedWebhookEvent =
            CallPlaybackEndedWebhookEvent.builder()
                .data(
                    CallPlaybackEndedWebhookEvent.Data.builder()
                        .id("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                        .eventType(CallPlaybackEndedWebhookEvent.Data.EventType.CALL_PLAYBACK_ENDED)
                        .occurredAt(OffsetDateTime.parse("2018-02-02T22:25:27.521992Z"))
                        .payload(
                            CallPlaybackEndedWebhookEvent.Data.Payload.builder()
                                .callControlId(
                                    "v3:MdI91X4lWFEs7IgbBEOT9M4AigoY08M0WWZFISt1Yw2axZ_IiE4pqg"
                                )
                                .callLegId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                                .callSessionId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                                .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                                .connectionId("7267xxxxxxxxxxxxxx")
                                .mediaName("my_media_uploaded_to_media_storage_api")
                                .mediaUrl("http://example.com/audio.wav")
                                .overlay(false)
                                .status(CallPlaybackEndedWebhookEvent.Data.Payload.Status.COMPLETED)
                                .statusDetail(
                                    "Received curl error 22 HTTP error code 404 trying to fetch http://mediaurl.com."
                                )
                                .build()
                        )
                        .recordType(CallPlaybackEndedWebhookEvent.Data.RecordType.EVENT)
                        .build()
                )
                .build()

        assertThat(callPlaybackEndedWebhookEvent.data())
            .contains(
                CallPlaybackEndedWebhookEvent.Data.builder()
                    .id("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                    .eventType(CallPlaybackEndedWebhookEvent.Data.EventType.CALL_PLAYBACK_ENDED)
                    .occurredAt(OffsetDateTime.parse("2018-02-02T22:25:27.521992Z"))
                    .payload(
                        CallPlaybackEndedWebhookEvent.Data.Payload.builder()
                            .callControlId(
                                "v3:MdI91X4lWFEs7IgbBEOT9M4AigoY08M0WWZFISt1Yw2axZ_IiE4pqg"
                            )
                            .callLegId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                            .callSessionId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                            .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                            .connectionId("7267xxxxxxxxxxxxxx")
                            .mediaName("my_media_uploaded_to_media_storage_api")
                            .mediaUrl("http://example.com/audio.wav")
                            .overlay(false)
                            .status(CallPlaybackEndedWebhookEvent.Data.Payload.Status.COMPLETED)
                            .statusDetail(
                                "Received curl error 22 HTTP error code 404 trying to fetch http://mediaurl.com."
                            )
                            .build()
                    )
                    .recordType(CallPlaybackEndedWebhookEvent.Data.RecordType.EVENT)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val callPlaybackEndedWebhookEvent =
            CallPlaybackEndedWebhookEvent.builder()
                .data(
                    CallPlaybackEndedWebhookEvent.Data.builder()
                        .id("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                        .eventType(CallPlaybackEndedWebhookEvent.Data.EventType.CALL_PLAYBACK_ENDED)
                        .occurredAt(OffsetDateTime.parse("2018-02-02T22:25:27.521992Z"))
                        .payload(
                            CallPlaybackEndedWebhookEvent.Data.Payload.builder()
                                .callControlId(
                                    "v3:MdI91X4lWFEs7IgbBEOT9M4AigoY08M0WWZFISt1Yw2axZ_IiE4pqg"
                                )
                                .callLegId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                                .callSessionId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                                .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                                .connectionId("7267xxxxxxxxxxxxxx")
                                .mediaName("my_media_uploaded_to_media_storage_api")
                                .mediaUrl("http://example.com/audio.wav")
                                .overlay(false)
                                .status(CallPlaybackEndedWebhookEvent.Data.Payload.Status.COMPLETED)
                                .statusDetail(
                                    "Received curl error 22 HTTP error code 404 trying to fetch http://mediaurl.com."
                                )
                                .build()
                        )
                        .recordType(CallPlaybackEndedWebhookEvent.Data.RecordType.EVENT)
                        .build()
                )
                .build()

        val roundtrippedCallPlaybackEndedWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(callPlaybackEndedWebhookEvent),
                jacksonTypeRef<CallPlaybackEndedWebhookEvent>(),
            )

        assertThat(roundtrippedCallPlaybackEndedWebhookEvent)
            .isEqualTo(callPlaybackEndedWebhookEvent)
    }
}
