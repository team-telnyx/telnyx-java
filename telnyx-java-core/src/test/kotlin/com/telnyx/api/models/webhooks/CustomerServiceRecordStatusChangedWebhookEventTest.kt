// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.webhooks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CustomerServiceRecordStatusChangedWebhookEventTest {

    @Test
    fun create() {
        val customerServiceRecordStatusChangedWebhookEvent =
            CustomerServiceRecordStatusChangedWebhookEvent.builder()
                .data(
                    CustomerServiceRecordStatusChangedWebhookEvent.Data.builder()
                        .id("d3c462b5-8afa-4d48-9af1-4f9b1f00e7bd")
                        .eventType(
                            CustomerServiceRecordStatusChangedWebhookEvent.Data.EventType
                                .CUSTOMER_SERVICE_RECORD_STATUS_CHANGED
                        )
                        .occurredAt(OffsetDateTime.parse("2021-03-19T10:07:15.527Z"))
                        .payload(
                            CustomerServiceRecordStatusChangedWebhookEvent.Data.Payload.builder()
                                .id("f1486bae-f067-460c-ad43-73a92848f902")
                                .phoneNumber("+12065551212")
                                .status(
                                    CustomerServiceRecordStatusChangedWebhookEvent.Data.Payload
                                        .Status
                                        .COMPLETED
                                )
                                .updatedAt(OffsetDateTime.parse("2021-03-19T10:07:15.527Z"))
                                .build()
                        )
                        .recordType(
                            CustomerServiceRecordStatusChangedWebhookEvent.Data.RecordType.EVENT
                        )
                        .build()
                )
                .meta(
                    CustomerServiceRecordStatusChangedWebhookEvent.Meta.builder()
                        .attempt(1L)
                        .deliveredTo("https://example.com/webhook")
                        .build()
                )
                .build()

        assertThat(customerServiceRecordStatusChangedWebhookEvent.data())
            .contains(
                CustomerServiceRecordStatusChangedWebhookEvent.Data.builder()
                    .id("d3c462b5-8afa-4d48-9af1-4f9b1f00e7bd")
                    .eventType(
                        CustomerServiceRecordStatusChangedWebhookEvent.Data.EventType
                            .CUSTOMER_SERVICE_RECORD_STATUS_CHANGED
                    )
                    .occurredAt(OffsetDateTime.parse("2021-03-19T10:07:15.527Z"))
                    .payload(
                        CustomerServiceRecordStatusChangedWebhookEvent.Data.Payload.builder()
                            .id("f1486bae-f067-460c-ad43-73a92848f902")
                            .phoneNumber("+12065551212")
                            .status(
                                CustomerServiceRecordStatusChangedWebhookEvent.Data.Payload.Status
                                    .COMPLETED
                            )
                            .updatedAt(OffsetDateTime.parse("2021-03-19T10:07:15.527Z"))
                            .build()
                    )
                    .recordType(
                        CustomerServiceRecordStatusChangedWebhookEvent.Data.RecordType.EVENT
                    )
                    .build()
            )
        assertThat(customerServiceRecordStatusChangedWebhookEvent.meta())
            .contains(
                CustomerServiceRecordStatusChangedWebhookEvent.Meta.builder()
                    .attempt(1L)
                    .deliveredTo("https://example.com/webhook")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val customerServiceRecordStatusChangedWebhookEvent =
            CustomerServiceRecordStatusChangedWebhookEvent.builder()
                .data(
                    CustomerServiceRecordStatusChangedWebhookEvent.Data.builder()
                        .id("d3c462b5-8afa-4d48-9af1-4f9b1f00e7bd")
                        .eventType(
                            CustomerServiceRecordStatusChangedWebhookEvent.Data.EventType
                                .CUSTOMER_SERVICE_RECORD_STATUS_CHANGED
                        )
                        .occurredAt(OffsetDateTime.parse("2021-03-19T10:07:15.527Z"))
                        .payload(
                            CustomerServiceRecordStatusChangedWebhookEvent.Data.Payload.builder()
                                .id("f1486bae-f067-460c-ad43-73a92848f902")
                                .phoneNumber("+12065551212")
                                .status(
                                    CustomerServiceRecordStatusChangedWebhookEvent.Data.Payload
                                        .Status
                                        .COMPLETED
                                )
                                .updatedAt(OffsetDateTime.parse("2021-03-19T10:07:15.527Z"))
                                .build()
                        )
                        .recordType(
                            CustomerServiceRecordStatusChangedWebhookEvent.Data.RecordType.EVENT
                        )
                        .build()
                )
                .meta(
                    CustomerServiceRecordStatusChangedWebhookEvent.Meta.builder()
                        .attempt(1L)
                        .deliveredTo("https://example.com/webhook")
                        .build()
                )
                .build()

        val roundtrippedCustomerServiceRecordStatusChangedWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(customerServiceRecordStatusChangedWebhookEvent),
                jacksonTypeRef<CustomerServiceRecordStatusChangedWebhookEvent>(),
            )

        assertThat(roundtrippedCustomerServiceRecordStatusChangedWebhookEvent)
            .isEqualTo(customerServiceRecordStatusChangedWebhookEvent)
    }
}
