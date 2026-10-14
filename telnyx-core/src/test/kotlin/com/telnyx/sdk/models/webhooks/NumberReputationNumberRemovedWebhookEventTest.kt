// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.webhooks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.enterprises.reputation.numbers.ReputationNumberSource
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NumberReputationNumberRemovedWebhookEventTest {

    @Test
    fun create() {
        val numberReputationNumberRemovedWebhookEvent =
            NumberReputationNumberRemovedWebhookEvent.builder()
                .data(
                    NumberReputationNumberRemovedWebhookEvent.Data.builder()
                        .id("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                        .eventType(
                            NumberReputationNumberRemovedWebhookEvent.Data.EventType
                                .NUMBER_REPUTATION_NUMBER_REMOVED
                        )
                        .occurredAt(OffsetDateTime.parse("2026-10-05T07:00:12.521992Z"))
                        .payload(
                            NumberReputationNumberRemovedWebhookEvent.Data.Payload.builder()
                                .enterpriseId("4a6192a4-573d-446d-b3ce-aff9117272a6")
                                .ownershipStatus(
                                    NumberReputationNumberRemovedWebhookEvent.Data.Payload
                                        .OwnershipStatus
                                        .REMOVED
                                )
                                .phoneNumber("+13125550142")
                                .recordType(
                                    NumberReputationNumberRemovedWebhookEvent.Data.Payload
                                        .RecordType
                                        .REPUTATION_PHONE_NUMBER
                                )
                                .removalReason(
                                    NumberReputationNumberRemovedWebhookEvent.Data.Payload
                                        .RemovalReason
                                        .UNCONFIRMED_OWNERSHIP
                                )
                                .removedAt(OffsetDateTime.parse("2026-10-09T07:00:03+00:00"))
                                .source(ReputationNumberSource.EXTERNAL)
                                .build()
                        )
                        .recordType(NumberReputationNumberRemovedWebhookEvent.Data.RecordType.EVENT)
                        .build()
                )
                .meta(
                    NumberReputationNumberRemovedWebhookEvent.Meta.builder()
                        .attempt(1L)
                        .deliveredTo("https://example.com/webhooks/telnyx")
                        .build()
                )
                .build()

        assertThat(numberReputationNumberRemovedWebhookEvent.data())
            .isEqualTo(
                NumberReputationNumberRemovedWebhookEvent.Data.builder()
                    .id("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                    .eventType(
                        NumberReputationNumberRemovedWebhookEvent.Data.EventType
                            .NUMBER_REPUTATION_NUMBER_REMOVED
                    )
                    .occurredAt(OffsetDateTime.parse("2026-10-05T07:00:12.521992Z"))
                    .payload(
                        NumberReputationNumberRemovedWebhookEvent.Data.Payload.builder()
                            .enterpriseId("4a6192a4-573d-446d-b3ce-aff9117272a6")
                            .ownershipStatus(
                                NumberReputationNumberRemovedWebhookEvent.Data.Payload
                                    .OwnershipStatus
                                    .REMOVED
                            )
                            .phoneNumber("+13125550142")
                            .recordType(
                                NumberReputationNumberRemovedWebhookEvent.Data.Payload.RecordType
                                    .REPUTATION_PHONE_NUMBER
                            )
                            .removalReason(
                                NumberReputationNumberRemovedWebhookEvent.Data.Payload.RemovalReason
                                    .UNCONFIRMED_OWNERSHIP
                            )
                            .removedAt(OffsetDateTime.parse("2026-10-09T07:00:03+00:00"))
                            .source(ReputationNumberSource.EXTERNAL)
                            .build()
                    )
                    .recordType(NumberReputationNumberRemovedWebhookEvent.Data.RecordType.EVENT)
                    .build()
            )
        assertThat(numberReputationNumberRemovedWebhookEvent.meta())
            .isEqualTo(
                NumberReputationNumberRemovedWebhookEvent.Meta.builder()
                    .attempt(1L)
                    .deliveredTo("https://example.com/webhooks/telnyx")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val numberReputationNumberRemovedWebhookEvent =
            NumberReputationNumberRemovedWebhookEvent.builder()
                .data(
                    NumberReputationNumberRemovedWebhookEvent.Data.builder()
                        .id("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                        .eventType(
                            NumberReputationNumberRemovedWebhookEvent.Data.EventType
                                .NUMBER_REPUTATION_NUMBER_REMOVED
                        )
                        .occurredAt(OffsetDateTime.parse("2026-10-05T07:00:12.521992Z"))
                        .payload(
                            NumberReputationNumberRemovedWebhookEvent.Data.Payload.builder()
                                .enterpriseId("4a6192a4-573d-446d-b3ce-aff9117272a6")
                                .ownershipStatus(
                                    NumberReputationNumberRemovedWebhookEvent.Data.Payload
                                        .OwnershipStatus
                                        .REMOVED
                                )
                                .phoneNumber("+13125550142")
                                .recordType(
                                    NumberReputationNumberRemovedWebhookEvent.Data.Payload
                                        .RecordType
                                        .REPUTATION_PHONE_NUMBER
                                )
                                .removalReason(
                                    NumberReputationNumberRemovedWebhookEvent.Data.Payload
                                        .RemovalReason
                                        .UNCONFIRMED_OWNERSHIP
                                )
                                .removedAt(OffsetDateTime.parse("2026-10-09T07:00:03+00:00"))
                                .source(ReputationNumberSource.EXTERNAL)
                                .build()
                        )
                        .recordType(NumberReputationNumberRemovedWebhookEvent.Data.RecordType.EVENT)
                        .build()
                )
                .meta(
                    NumberReputationNumberRemovedWebhookEvent.Meta.builder()
                        .attempt(1L)
                        .deliveredTo("https://example.com/webhooks/telnyx")
                        .build()
                )
                .build()

        val roundtrippedNumberReputationNumberRemovedWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(numberReputationNumberRemovedWebhookEvent),
                jacksonTypeRef<NumberReputationNumberRemovedWebhookEvent>(),
            )

        assertThat(roundtrippedNumberReputationNumberRemovedWebhookEvent)
            .isEqualTo(numberReputationNumberRemovedWebhookEvent)
    }
}
