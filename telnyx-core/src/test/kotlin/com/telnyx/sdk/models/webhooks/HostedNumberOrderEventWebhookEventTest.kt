// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.webhooks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class HostedNumberOrderEventWebhookEventTest {

    @Test
    fun create() {
        val hostedNumberOrderEventWebhookEvent =
            HostedNumberOrderEventWebhookEvent.builder()
                .data(
                    HostedNumberOrderEventWebhookEvent.Data.builder()
                        .id("bf6307bd-884d-4c1f-b6ea-c62b8c495d3c")
                        .eventType(
                            HostedNumberOrderEventWebhookEvent.Data.EventType
                                .MESSAGING_HOSTED_NUMBERS_ORDERS_INTERNAL_TRANSFER_APPROVAL_REQUESTED
                        )
                        .occurredAt(OffsetDateTime.parse("2026-04-20T18:10:02.574Z"))
                        .payload(
                            HostedNumberOrderEventWebhookEvent.Data.Payload.builder()
                                .approvalDeadline(1714521600L)
                                .decision(
                                    HostedNumberOrderEventWebhookEvent.Data.Payload.Decision.PENDING
                                )
                                .addNumber(
                                    HostedNumberOrderEventWebhookEvent.Data.Payload.Number.builder()
                                        .status(
                                            HostedNumberOrderEventWebhookEvent.Data.Payload.Number
                                                .Status
                                                .PENDING
                                        )
                                        .value("+13125550001")
                                        .build()
                                )
                                .orderId("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                                .orderStatus(
                                    HostedNumberOrderEventWebhookEvent.Data.Payload.OrderStatus
                                        .PENDING
                                )
                                .profileId("d0b1dabe-efdb-4bc8-9dd3-11f0d8b5f5b3")
                                .userId("b448f9cc-a842-4784-98e9-03c1a5872950")
                                .build()
                        )
                        .recordType(HostedNumberOrderEventWebhookEvent.Data.RecordType.EVENT)
                        .build()
                )
                .build()

        assertThat(hostedNumberOrderEventWebhookEvent.data())
            .contains(
                HostedNumberOrderEventWebhookEvent.Data.builder()
                    .id("bf6307bd-884d-4c1f-b6ea-c62b8c495d3c")
                    .eventType(
                        HostedNumberOrderEventWebhookEvent.Data.EventType
                            .MESSAGING_HOSTED_NUMBERS_ORDERS_INTERNAL_TRANSFER_APPROVAL_REQUESTED
                    )
                    .occurredAt(OffsetDateTime.parse("2026-04-20T18:10:02.574Z"))
                    .payload(
                        HostedNumberOrderEventWebhookEvent.Data.Payload.builder()
                            .approvalDeadline(1714521600L)
                            .decision(
                                HostedNumberOrderEventWebhookEvent.Data.Payload.Decision.PENDING
                            )
                            .addNumber(
                                HostedNumberOrderEventWebhookEvent.Data.Payload.Number.builder()
                                    .status(
                                        HostedNumberOrderEventWebhookEvent.Data.Payload.Number
                                            .Status
                                            .PENDING
                                    )
                                    .value("+13125550001")
                                    .build()
                            )
                            .orderId("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                            .orderStatus(
                                HostedNumberOrderEventWebhookEvent.Data.Payload.OrderStatus.PENDING
                            )
                            .profileId("d0b1dabe-efdb-4bc8-9dd3-11f0d8b5f5b3")
                            .userId("b448f9cc-a842-4784-98e9-03c1a5872950")
                            .build()
                    )
                    .recordType(HostedNumberOrderEventWebhookEvent.Data.RecordType.EVENT)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val hostedNumberOrderEventWebhookEvent =
            HostedNumberOrderEventWebhookEvent.builder()
                .data(
                    HostedNumberOrderEventWebhookEvent.Data.builder()
                        .id("bf6307bd-884d-4c1f-b6ea-c62b8c495d3c")
                        .eventType(
                            HostedNumberOrderEventWebhookEvent.Data.EventType
                                .MESSAGING_HOSTED_NUMBERS_ORDERS_INTERNAL_TRANSFER_APPROVAL_REQUESTED
                        )
                        .occurredAt(OffsetDateTime.parse("2026-04-20T18:10:02.574Z"))
                        .payload(
                            HostedNumberOrderEventWebhookEvent.Data.Payload.builder()
                                .approvalDeadline(1714521600L)
                                .decision(
                                    HostedNumberOrderEventWebhookEvent.Data.Payload.Decision.PENDING
                                )
                                .addNumber(
                                    HostedNumberOrderEventWebhookEvent.Data.Payload.Number.builder()
                                        .status(
                                            HostedNumberOrderEventWebhookEvent.Data.Payload.Number
                                                .Status
                                                .PENDING
                                        )
                                        .value("+13125550001")
                                        .build()
                                )
                                .orderId("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                                .orderStatus(
                                    HostedNumberOrderEventWebhookEvent.Data.Payload.OrderStatus
                                        .PENDING
                                )
                                .profileId("d0b1dabe-efdb-4bc8-9dd3-11f0d8b5f5b3")
                                .userId("b448f9cc-a842-4784-98e9-03c1a5872950")
                                .build()
                        )
                        .recordType(HostedNumberOrderEventWebhookEvent.Data.RecordType.EVENT)
                        .build()
                )
                .build()

        val roundtrippedHostedNumberOrderEventWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(hostedNumberOrderEventWebhookEvent),
                jacksonTypeRef<HostedNumberOrderEventWebhookEvent>(),
            )

        assertThat(roundtrippedHostedNumberOrderEventWebhookEvent)
            .isEqualTo(hostedNumberOrderEventWebhookEvent)
    }
}
