// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.webhooks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CallForkStartedTest {

    @Test
    fun create() {
        val callForkStarted =
            CallForkStarted.builder()
                .id("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                .eventType(CallForkStarted.EventType.CALL_FORK_STARTED)
                .occurredAt(OffsetDateTime.parse("2018-02-02T22:25:27.521992Z"))
                .payload(
                    CallForkStarted.Payload.builder()
                        .callControlId("v2:OycMASgvIjsGIAVEx8x3n9rYeKnUJx6a3V8VGhs5futnr17KZhujZA")
                        .callLegId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                        .callSessionId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                        .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                        .connectionId("7267xxxxxxxxxxxxxx")
                        .streamType(CallForkStarted.Payload.StreamType.DECRYPTED)
                        .build()
                )
                .recordType(CallForkStarted.RecordType.EVENT)
                .build()

        assertThat(callForkStarted.id()).contains("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
        assertThat(callForkStarted.eventType())
            .contains(CallForkStarted.EventType.CALL_FORK_STARTED)
        assertThat(callForkStarted.occurredAt())
            .contains(OffsetDateTime.parse("2018-02-02T22:25:27.521992Z"))
        assertThat(callForkStarted.payload())
            .contains(
                CallForkStarted.Payload.builder()
                    .callControlId("v2:OycMASgvIjsGIAVEx8x3n9rYeKnUJx6a3V8VGhs5futnr17KZhujZA")
                    .callLegId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                    .callSessionId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                    .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                    .connectionId("7267xxxxxxxxxxxxxx")
                    .streamType(CallForkStarted.Payload.StreamType.DECRYPTED)
                    .build()
            )
        assertThat(callForkStarted.recordType()).contains(CallForkStarted.RecordType.EVENT)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val callForkStarted =
            CallForkStarted.builder()
                .id("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                .eventType(CallForkStarted.EventType.CALL_FORK_STARTED)
                .occurredAt(OffsetDateTime.parse("2018-02-02T22:25:27.521992Z"))
                .payload(
                    CallForkStarted.Payload.builder()
                        .callControlId("v2:OycMASgvIjsGIAVEx8x3n9rYeKnUJx6a3V8VGhs5futnr17KZhujZA")
                        .callLegId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                        .callSessionId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                        .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                        .connectionId("7267xxxxxxxxxxxxxx")
                        .streamType(CallForkStarted.Payload.StreamType.DECRYPTED)
                        .build()
                )
                .recordType(CallForkStarted.RecordType.EVENT)
                .build()

        val roundtrippedCallForkStarted =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(callForkStarted),
                jacksonTypeRef<CallForkStarted>(),
            )

        assertThat(roundtrippedCallForkStarted).isEqualTo(callForkStarted)
    }
}
