// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.webhooks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CallPlaybackStartedWebhookEventTest {

    @Test
    fun create() {
        val callPlaybackStartedWebhookEvent =
            CallPlaybackStartedWebhookEvent.builder()
                .data(
                    CallPlaybackStartedWebhookEvent.Data.builder()
                        .id("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                        .eventType(
                            CallPlaybackStartedWebhookEvent.Data.EventType.CALL_PLAYBACK_STARTED
                        )
                        .occurredAt(OffsetDateTime.parse("2018-02-02T22:25:27.521992Z"))
                        .payload(
                            CallPlaybackStartedWebhookEvent.Data.Payload.builder()
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
                                .build()
                        )
                        .recordType(CallPlaybackStartedWebhookEvent.Data.RecordType.EVENT)
                        .build()
                )
                .build()

        assertThat(callPlaybackStartedWebhookEvent.data())
            .contains(
                CallPlaybackStartedWebhookEvent.Data.builder()
                    .id("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                    .eventType(CallPlaybackStartedWebhookEvent.Data.EventType.CALL_PLAYBACK_STARTED)
                    .occurredAt(OffsetDateTime.parse("2018-02-02T22:25:27.521992Z"))
                    .payload(
                        CallPlaybackStartedWebhookEvent.Data.Payload.builder()
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
                            .build()
                    )
                    .recordType(CallPlaybackStartedWebhookEvent.Data.RecordType.EVENT)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val callPlaybackStartedWebhookEvent =
            CallPlaybackStartedWebhookEvent.builder()
                .data(
                    CallPlaybackStartedWebhookEvent.Data.builder()
                        .id("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                        .eventType(
                            CallPlaybackStartedWebhookEvent.Data.EventType.CALL_PLAYBACK_STARTED
                        )
                        .occurredAt(OffsetDateTime.parse("2018-02-02T22:25:27.521992Z"))
                        .payload(
                            CallPlaybackStartedWebhookEvent.Data.Payload.builder()
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
                                .build()
                        )
                        .recordType(CallPlaybackStartedWebhookEvent.Data.RecordType.EVENT)
                        .build()
                )
                .build()

        val roundtrippedCallPlaybackStartedWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(callPlaybackStartedWebhookEvent),
                jacksonTypeRef<CallPlaybackStartedWebhookEvent>(),
            )

        assertThat(roundtrippedCallPlaybackStartedWebhookEvent)
            .isEqualTo(callPlaybackStartedWebhookEvent)
    }
}
