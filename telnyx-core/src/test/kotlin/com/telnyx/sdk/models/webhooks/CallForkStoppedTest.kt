// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.webhooks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CallForkStoppedTest {

    @Test
    fun create() {
        val callForkStopped =
            CallForkStopped.builder()
                .id("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                .eventType(CallForkStopped.EventType.CALL_FORK_STOPPED)
                .occurredAt(OffsetDateTime.parse("2018-02-02T22:25:27.521992Z"))
                .payload(
                    CallForkStopped.Payload.builder()
                        .callControlId("v2:OycMASgvIjsGIAVEx8x3n9rYeKnUJx6a3V8VGhs5futnr17KZhujZA")
                        .callLegId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                        .callSessionId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                        .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                        .connectionId("7267xxxxxxxxxxxxxx")
                        .streamType(CallForkStopped.Payload.StreamType.DECRYPTED)
                        .build()
                )
                .recordType(CallForkStopped.RecordType.EVENT)
                .build()

        assertThat(callForkStopped.id()).contains("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
        assertThat(callForkStopped.eventType())
            .contains(CallForkStopped.EventType.CALL_FORK_STOPPED)
        assertThat(callForkStopped.occurredAt())
            .contains(OffsetDateTime.parse("2018-02-02T22:25:27.521992Z"))
        assertThat(callForkStopped.payload())
            .contains(
                CallForkStopped.Payload.builder()
                    .callControlId("v2:OycMASgvIjsGIAVEx8x3n9rYeKnUJx6a3V8VGhs5futnr17KZhujZA")
                    .callLegId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                    .callSessionId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                    .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                    .connectionId("7267xxxxxxxxxxxxxx")
                    .streamType(CallForkStopped.Payload.StreamType.DECRYPTED)
                    .build()
            )
        assertThat(callForkStopped.recordType()).contains(CallForkStopped.RecordType.EVENT)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val callForkStopped =
            CallForkStopped.builder()
                .id("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                .eventType(CallForkStopped.EventType.CALL_FORK_STOPPED)
                .occurredAt(OffsetDateTime.parse("2018-02-02T22:25:27.521992Z"))
                .payload(
                    CallForkStopped.Payload.builder()
                        .callControlId("v2:OycMASgvIjsGIAVEx8x3n9rYeKnUJx6a3V8VGhs5futnr17KZhujZA")
                        .callLegId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                        .callSessionId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                        .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                        .connectionId("7267xxxxxxxxxxxxxx")
                        .streamType(CallForkStopped.Payload.StreamType.DECRYPTED)
                        .build()
                )
                .recordType(CallForkStopped.RecordType.EVENT)
                .build()

        val roundtrippedCallForkStopped =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(callForkStopped),
                jacksonTypeRef<CallForkStopped>(),
            )

        assertThat(roundtrippedCallForkStopped).isEqualTo(callForkStopped)
    }
}
