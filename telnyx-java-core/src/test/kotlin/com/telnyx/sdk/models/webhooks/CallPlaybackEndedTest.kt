// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.webhooks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CallPlaybackEndedTest {

    @Test
    fun create() {
        val callPlaybackEnded =
            CallPlaybackEnded.builder()
                .id("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                .eventType(CallPlaybackEnded.EventType.CALL_PLAYBACK_ENDED)
                .occurredAt(OffsetDateTime.parse("2018-02-02T22:25:27.521992Z"))
                .payload(
                    CallPlaybackEnded.Payload.builder()
                        .callControlId("v3:MdI91X4lWFEs7IgbBEOT9M4AigoY08M0WWZFISt1Yw2axZ_IiE4pqg")
                        .callLegId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                        .callSessionId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                        .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                        .connectionId("7267xxxxxxxxxxxxxx")
                        .mediaName("my_media_uploaded_to_media_storage_api")
                        .mediaUrl("http://example.com/audio.wav")
                        .overlay(false)
                        .status(CallPlaybackEnded.Payload.Status.COMPLETED)
                        .statusDetail(
                            "Received curl error 22 HTTP error code 404 trying to fetch http://mediaurl.com."
                        )
                        .build()
                )
                .recordType(CallPlaybackEnded.RecordType.EVENT)
                .build()

        assertThat(callPlaybackEnded.id()).contains("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
        assertThat(callPlaybackEnded.eventType())
            .contains(CallPlaybackEnded.EventType.CALL_PLAYBACK_ENDED)
        assertThat(callPlaybackEnded.occurredAt())
            .contains(OffsetDateTime.parse("2018-02-02T22:25:27.521992Z"))
        assertThat(callPlaybackEnded.payload())
            .contains(
                CallPlaybackEnded.Payload.builder()
                    .callControlId("v3:MdI91X4lWFEs7IgbBEOT9M4AigoY08M0WWZFISt1Yw2axZ_IiE4pqg")
                    .callLegId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                    .callSessionId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                    .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                    .connectionId("7267xxxxxxxxxxxxxx")
                    .mediaName("my_media_uploaded_to_media_storage_api")
                    .mediaUrl("http://example.com/audio.wav")
                    .overlay(false)
                    .status(CallPlaybackEnded.Payload.Status.COMPLETED)
                    .statusDetail(
                        "Received curl error 22 HTTP error code 404 trying to fetch http://mediaurl.com."
                    )
                    .build()
            )
        assertThat(callPlaybackEnded.recordType()).contains(CallPlaybackEnded.RecordType.EVENT)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val callPlaybackEnded =
            CallPlaybackEnded.builder()
                .id("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                .eventType(CallPlaybackEnded.EventType.CALL_PLAYBACK_ENDED)
                .occurredAt(OffsetDateTime.parse("2018-02-02T22:25:27.521992Z"))
                .payload(
                    CallPlaybackEnded.Payload.builder()
                        .callControlId("v3:MdI91X4lWFEs7IgbBEOT9M4AigoY08M0WWZFISt1Yw2axZ_IiE4pqg")
                        .callLegId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                        .callSessionId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                        .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                        .connectionId("7267xxxxxxxxxxxxxx")
                        .mediaName("my_media_uploaded_to_media_storage_api")
                        .mediaUrl("http://example.com/audio.wav")
                        .overlay(false)
                        .status(CallPlaybackEnded.Payload.Status.COMPLETED)
                        .statusDetail(
                            "Received curl error 22 HTTP error code 404 trying to fetch http://mediaurl.com."
                        )
                        .build()
                )
                .recordType(CallPlaybackEnded.RecordType.EVENT)
                .build()

        val roundtrippedCallPlaybackEnded =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(callPlaybackEnded),
                jacksonTypeRef<CallPlaybackEnded>(),
            )

        assertThat(roundtrippedCallPlaybackEnded).isEqualTo(callPlaybackEnded)
    }
}
