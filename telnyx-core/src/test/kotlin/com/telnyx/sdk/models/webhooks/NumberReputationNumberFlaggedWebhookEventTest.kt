// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.webhooks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.enterprises.reputation.numbers.ReputationNumberSource
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NumberReputationNumberFlaggedWebhookEventTest {

    @Test
    fun create() {
        val numberReputationNumberFlaggedWebhookEvent =
            NumberReputationNumberFlaggedWebhookEvent.builder()
                .data(
                    NumberReputationNumberFlaggedWebhookEvent.Data.builder()
                        .id("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                        .eventType(
                            NumberReputationNumberFlaggedWebhookEvent.Data.EventType
                                .NUMBER_REPUTATION_NUMBER_FLAGGED
                        )
                        .occurredAt(OffsetDateTime.parse("2026-10-05T07:00:12.521992Z"))
                        .payload(
                            NumberReputationNumberFlaggedWebhookEvent.Data.Payload.builder()
                                .confirmBy(OffsetDateTime.parse("2026-10-08T07:00:00+00:00"))
                                .enterpriseId("4a6192a4-573d-446d-b3ce-aff9117272a6")
                                .flagReason(
                                    NumberReputationNumberFlaggedWebhookEvent.Data.Payload
                                        .FlagReason
                                        .CARRIER_CHANGED
                                )
                                .ownershipStatus(
                                    NumberReputationNumberFlaggedWebhookEvent.Data.Payload
                                        .OwnershipStatus
                                        .PENDING_CONFIRMATION
                                )
                                .phoneNumber("+13125550142")
                                .recordType(
                                    NumberReputationNumberFlaggedWebhookEvent.Data.Payload
                                        .RecordType
                                        .REPUTATION_PHONE_NUMBER
                                )
                                .source(ReputationNumberSource.EXTERNAL)
                                .build()
                        )
                        .recordType(NumberReputationNumberFlaggedWebhookEvent.Data.RecordType.EVENT)
                        .build()
                )
                .meta(
                    NumberReputationNumberFlaggedWebhookEvent.Meta.builder()
                        .attempt(1L)
                        .deliveredTo("https://example.com/webhooks/telnyx")
                        .build()
                )
                .build()

        assertThat(numberReputationNumberFlaggedWebhookEvent.data())
            .isEqualTo(
                NumberReputationNumberFlaggedWebhookEvent.Data.builder()
                    .id("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                    .eventType(
                        NumberReputationNumberFlaggedWebhookEvent.Data.EventType
                            .NUMBER_REPUTATION_NUMBER_FLAGGED
                    )
                    .occurredAt(OffsetDateTime.parse("2026-10-05T07:00:12.521992Z"))
                    .payload(
                        NumberReputationNumberFlaggedWebhookEvent.Data.Payload.builder()
                            .confirmBy(OffsetDateTime.parse("2026-10-08T07:00:00+00:00"))
                            .enterpriseId("4a6192a4-573d-446d-b3ce-aff9117272a6")
                            .flagReason(
                                NumberReputationNumberFlaggedWebhookEvent.Data.Payload.FlagReason
                                    .CARRIER_CHANGED
                            )
                            .ownershipStatus(
                                NumberReputationNumberFlaggedWebhookEvent.Data.Payload
                                    .OwnershipStatus
                                    .PENDING_CONFIRMATION
                            )
                            .phoneNumber("+13125550142")
                            .recordType(
                                NumberReputationNumberFlaggedWebhookEvent.Data.Payload.RecordType
                                    .REPUTATION_PHONE_NUMBER
                            )
                            .source(ReputationNumberSource.EXTERNAL)
                            .build()
                    )
                    .recordType(NumberReputationNumberFlaggedWebhookEvent.Data.RecordType.EVENT)
                    .build()
            )
        assertThat(numberReputationNumberFlaggedWebhookEvent.meta())
            .isEqualTo(
                NumberReputationNumberFlaggedWebhookEvent.Meta.builder()
                    .attempt(1L)
                    .deliveredTo("https://example.com/webhooks/telnyx")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val numberReputationNumberFlaggedWebhookEvent =
            NumberReputationNumberFlaggedWebhookEvent.builder()
                .data(
                    NumberReputationNumberFlaggedWebhookEvent.Data.builder()
                        .id("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                        .eventType(
                            NumberReputationNumberFlaggedWebhookEvent.Data.EventType
                                .NUMBER_REPUTATION_NUMBER_FLAGGED
                        )
                        .occurredAt(OffsetDateTime.parse("2026-10-05T07:00:12.521992Z"))
                        .payload(
                            NumberReputationNumberFlaggedWebhookEvent.Data.Payload.builder()
                                .confirmBy(OffsetDateTime.parse("2026-10-08T07:00:00+00:00"))
                                .enterpriseId("4a6192a4-573d-446d-b3ce-aff9117272a6")
                                .flagReason(
                                    NumberReputationNumberFlaggedWebhookEvent.Data.Payload
                                        .FlagReason
                                        .CARRIER_CHANGED
                                )
                                .ownershipStatus(
                                    NumberReputationNumberFlaggedWebhookEvent.Data.Payload
                                        .OwnershipStatus
                                        .PENDING_CONFIRMATION
                                )
                                .phoneNumber("+13125550142")
                                .recordType(
                                    NumberReputationNumberFlaggedWebhookEvent.Data.Payload
                                        .RecordType
                                        .REPUTATION_PHONE_NUMBER
                                )
                                .source(ReputationNumberSource.EXTERNAL)
                                .build()
                        )
                        .recordType(NumberReputationNumberFlaggedWebhookEvent.Data.RecordType.EVENT)
                        .build()
                )
                .meta(
                    NumberReputationNumberFlaggedWebhookEvent.Meta.builder()
                        .attempt(1L)
                        .deliveredTo("https://example.com/webhooks/telnyx")
                        .build()
                )
                .build()

        val roundtrippedNumberReputationNumberFlaggedWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(numberReputationNumberFlaggedWebhookEvent),
                jacksonTypeRef<NumberReputationNumberFlaggedWebhookEvent>(),
            )

        assertThat(roundtrippedNumberReputationNumberFlaggedWebhookEvent)
            .isEqualTo(numberReputationNumberFlaggedWebhookEvent)
    }
}
