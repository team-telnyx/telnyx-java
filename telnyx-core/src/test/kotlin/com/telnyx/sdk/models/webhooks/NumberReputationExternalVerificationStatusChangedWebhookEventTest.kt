// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.webhooks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NumberReputationExternalVerificationStatusChangedWebhookEventTest {

    @Test
    fun create() {
        val numberReputationExternalVerificationStatusChangedWebhookEvent =
            NumberReputationExternalVerificationStatusChangedWebhookEvent.builder()
                .data(
                    NumberReputationExternalVerificationStatusChangedWebhookEvent.Data.builder()
                        .id("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                        .eventType(
                            NumberReputationExternalVerificationStatusChangedWebhookEvent.Data
                                .EventType
                                .NUMBER_REPUTATION_EXTERNAL_VERIFICATION_STATUS_CHANGED
                        )
                        .occurredAt(OffsetDateTime.parse("2026-10-05T07:00:12.521992Z"))
                        .payload(
                            NumberReputationExternalVerificationStatusChangedWebhookEvent.Data
                                .Payload
                                .builder()
                                .enterpriseId("4a6192a4-573d-446d-b3ce-aff9117272a6")
                                .recordType(
                                    NumberReputationExternalVerificationStatusChangedWebhookEvent
                                        .Data
                                        .Payload
                                        .RecordType
                                        .REPUTATION_EXTERNAL_VERIFICATION
                                )
                                .reviewedAt(OffsetDateTime.parse("2026-10-06T14:03:10+00:00"))
                                .status(
                                    NumberReputationExternalVerificationStatusChangedWebhookEvent
                                        .Data
                                        .Payload
                                        .Status
                                        .APPROVED
                                )
                                .rejectionReason(null)
                                .build()
                        )
                        .recordType(
                            NumberReputationExternalVerificationStatusChangedWebhookEvent.Data
                                .RecordType
                                .EVENT
                        )
                        .build()
                )
                .meta(
                    NumberReputationExternalVerificationStatusChangedWebhookEvent.Meta.builder()
                        .attempt(1L)
                        .deliveredTo("https://example.com/webhooks/telnyx")
                        .build()
                )
                .build()

        assertThat(numberReputationExternalVerificationStatusChangedWebhookEvent.data())
            .isEqualTo(
                NumberReputationExternalVerificationStatusChangedWebhookEvent.Data.builder()
                    .id("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                    .eventType(
                        NumberReputationExternalVerificationStatusChangedWebhookEvent.Data.EventType
                            .NUMBER_REPUTATION_EXTERNAL_VERIFICATION_STATUS_CHANGED
                    )
                    .occurredAt(OffsetDateTime.parse("2026-10-05T07:00:12.521992Z"))
                    .payload(
                        NumberReputationExternalVerificationStatusChangedWebhookEvent.Data.Payload
                            .builder()
                            .enterpriseId("4a6192a4-573d-446d-b3ce-aff9117272a6")
                            .recordType(
                                NumberReputationExternalVerificationStatusChangedWebhookEvent.Data
                                    .Payload
                                    .RecordType
                                    .REPUTATION_EXTERNAL_VERIFICATION
                            )
                            .reviewedAt(OffsetDateTime.parse("2026-10-06T14:03:10+00:00"))
                            .status(
                                NumberReputationExternalVerificationStatusChangedWebhookEvent.Data
                                    .Payload
                                    .Status
                                    .APPROVED
                            )
                            .rejectionReason(null)
                            .build()
                    )
                    .recordType(
                        NumberReputationExternalVerificationStatusChangedWebhookEvent.Data
                            .RecordType
                            .EVENT
                    )
                    .build()
            )
        assertThat(numberReputationExternalVerificationStatusChangedWebhookEvent.meta())
            .isEqualTo(
                NumberReputationExternalVerificationStatusChangedWebhookEvent.Meta.builder()
                    .attempt(1L)
                    .deliveredTo("https://example.com/webhooks/telnyx")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val numberReputationExternalVerificationStatusChangedWebhookEvent =
            NumberReputationExternalVerificationStatusChangedWebhookEvent.builder()
                .data(
                    NumberReputationExternalVerificationStatusChangedWebhookEvent.Data.builder()
                        .id("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                        .eventType(
                            NumberReputationExternalVerificationStatusChangedWebhookEvent.Data
                                .EventType
                                .NUMBER_REPUTATION_EXTERNAL_VERIFICATION_STATUS_CHANGED
                        )
                        .occurredAt(OffsetDateTime.parse("2026-10-05T07:00:12.521992Z"))
                        .payload(
                            NumberReputationExternalVerificationStatusChangedWebhookEvent.Data
                                .Payload
                                .builder()
                                .enterpriseId("4a6192a4-573d-446d-b3ce-aff9117272a6")
                                .recordType(
                                    NumberReputationExternalVerificationStatusChangedWebhookEvent
                                        .Data
                                        .Payload
                                        .RecordType
                                        .REPUTATION_EXTERNAL_VERIFICATION
                                )
                                .reviewedAt(OffsetDateTime.parse("2026-10-06T14:03:10+00:00"))
                                .status(
                                    NumberReputationExternalVerificationStatusChangedWebhookEvent
                                        .Data
                                        .Payload
                                        .Status
                                        .APPROVED
                                )
                                .rejectionReason(null)
                                .build()
                        )
                        .recordType(
                            NumberReputationExternalVerificationStatusChangedWebhookEvent.Data
                                .RecordType
                                .EVENT
                        )
                        .build()
                )
                .meta(
                    NumberReputationExternalVerificationStatusChangedWebhookEvent.Meta.builder()
                        .attempt(1L)
                        .deliveredTo("https://example.com/webhooks/telnyx")
                        .build()
                )
                .build()

        val roundtrippedNumberReputationExternalVerificationStatusChangedWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(
                    numberReputationExternalVerificationStatusChangedWebhookEvent
                ),
                jacksonTypeRef<NumberReputationExternalVerificationStatusChangedWebhookEvent>(),
            )

        assertThat(roundtrippedNumberReputationExternalVerificationStatusChangedWebhookEvent)
            .isEqualTo(numberReputationExternalVerificationStatusChangedWebhookEvent)
    }
}
