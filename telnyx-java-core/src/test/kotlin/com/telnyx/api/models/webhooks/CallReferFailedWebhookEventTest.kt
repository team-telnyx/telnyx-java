// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.webhooks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CallReferFailedWebhookEventTest {

    @Test
    fun create() {
        val callReferFailedWebhookEvent =
            CallReferFailedWebhookEvent.builder()
                .data(
                    CallReferFailedWebhookEvent.Data.builder()
                        .id("fbeb70e0-54eb-4e26-8d19-56b43e66f754")
                        .eventType(CallReferFailedWebhookEvent.Data.EventType.CALL_REFER_FAILED)
                        .occurredAt(OffsetDateTime.parse("2020-03-30T13:29:42.130013Z"))
                        .payload(
                            CallReferFailedWebhookEvent.Data.Payload.builder()
                                .callControlId(
                                    "v2:OycMASgvIjsGIAVEx8x3n9rYeKnUJx6a3V8VGhs5futnr17KZhujZA"
                                )
                                .callLegId("817f7de8-728a-11ea-9ce6-02420a0f8969")
                                .callSessionId("817f8c2a-728a-11ea-9cbe-02420a0f8969")
                                .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                                .connectionId("1289082222292239760")
                                .from("+35319605860")
                                .sipNotifyResponse(603L)
                                .to("+13129457420")
                                .build()
                        )
                        .recordType(CallReferFailedWebhookEvent.Data.RecordType.EVENT)
                        .build()
                )
                .build()

        assertThat(callReferFailedWebhookEvent.data())
            .contains(
                CallReferFailedWebhookEvent.Data.builder()
                    .id("fbeb70e0-54eb-4e26-8d19-56b43e66f754")
                    .eventType(CallReferFailedWebhookEvent.Data.EventType.CALL_REFER_FAILED)
                    .occurredAt(OffsetDateTime.parse("2020-03-30T13:29:42.130013Z"))
                    .payload(
                        CallReferFailedWebhookEvent.Data.Payload.builder()
                            .callControlId(
                                "v2:OycMASgvIjsGIAVEx8x3n9rYeKnUJx6a3V8VGhs5futnr17KZhujZA"
                            )
                            .callLegId("817f7de8-728a-11ea-9ce6-02420a0f8969")
                            .callSessionId("817f8c2a-728a-11ea-9cbe-02420a0f8969")
                            .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                            .connectionId("1289082222292239760")
                            .from("+35319605860")
                            .sipNotifyResponse(603L)
                            .to("+13129457420")
                            .build()
                    )
                    .recordType(CallReferFailedWebhookEvent.Data.RecordType.EVENT)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val callReferFailedWebhookEvent =
            CallReferFailedWebhookEvent.builder()
                .data(
                    CallReferFailedWebhookEvent.Data.builder()
                        .id("fbeb70e0-54eb-4e26-8d19-56b43e66f754")
                        .eventType(CallReferFailedWebhookEvent.Data.EventType.CALL_REFER_FAILED)
                        .occurredAt(OffsetDateTime.parse("2020-03-30T13:29:42.130013Z"))
                        .payload(
                            CallReferFailedWebhookEvent.Data.Payload.builder()
                                .callControlId(
                                    "v2:OycMASgvIjsGIAVEx8x3n9rYeKnUJx6a3V8VGhs5futnr17KZhujZA"
                                )
                                .callLegId("817f7de8-728a-11ea-9ce6-02420a0f8969")
                                .callSessionId("817f8c2a-728a-11ea-9cbe-02420a0f8969")
                                .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                                .connectionId("1289082222292239760")
                                .from("+35319605860")
                                .sipNotifyResponse(603L)
                                .to("+13129457420")
                                .build()
                        )
                        .recordType(CallReferFailedWebhookEvent.Data.RecordType.EVENT)
                        .build()
                )
                .build()

        val roundtrippedCallReferFailedWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(callReferFailedWebhookEvent),
                jacksonTypeRef<CallReferFailedWebhookEvent>(),
            )

        assertThat(roundtrippedCallReferFailedWebhookEvent).isEqualTo(callReferFailedWebhookEvent)
    }
}
