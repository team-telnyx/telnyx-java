// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.webhooks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CallPaymentProgressWebhookEventTest {

    @Test
    fun create() {
        val callPaymentProgressWebhookEvent =
            CallPaymentProgressWebhookEvent.builder()
                .data(
                    CallPaymentProgressWebhookEvent.Data.builder()
                        .id("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                        .eventType(
                            CallPaymentProgressWebhookEvent.Data.EventType.CALL_PAYMENT_PROGRESS
                        )
                        .occurredAt(OffsetDateTime.parse("2026-07-27T07:00:00.000000Z"))
                        .payload(
                            CallPaymentProgressWebhookEvent.Data.Payload.builder()
                                .attempt(1)
                                .bankAccountNumber("********34")
                                .bankAccountType("consumer-checking")
                                .bankRoutingNumber("110000000")
                                .callControlId(
                                    "v3:MdI91X4lWFEs7IgbBEOT9M4AigoY08M0WWZFISt1Yw2axZ_IiE4pqg"
                                )
                                .callLegId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                                .callSessionId("428c31b6-abf3-3bc1-b7f4-5013ef9657c1")
                                .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                                .connectionId("7267xxxxxxxxxxxxxx")
                                .errorType(
                                    CallPaymentProgressWebhookEvent.Data.Payload.ErrorType
                                        .INVALID_CARD_NUMBER
                                )
                                .expirationDate("1230")
                                .from("+353****5860")
                                .paymentCardNumber("xxxxxxxxxxxx1111")
                                .paymentCardPostalCode("10001")
                                .paymentCardType(
                                    CallPaymentProgressWebhookEvent.Data.Payload.PaymentCardType
                                        .VISA
                                )
                                .paymentConnector("Default")
                                .paymentMethod(
                                    CallPaymentProgressWebhookEvent.Data.Payload.PaymentMethod
                                        .CREDIT_CARD
                                )
                                .paymentStatus(
                                    CallPaymentProgressWebhookEvent.Data.Payload.PaymentStatus
                                        .COMPLETED
                                )
                                .paymentStep(
                                    CallPaymentProgressWebhookEvent.Data.Payload.PaymentStep
                                        .PAYMENT_CARD_NUMBER
                                )
                                .securityCode("xxx")
                                .to("+131****7420")
                                .build()
                        )
                        .recordType(CallPaymentProgressWebhookEvent.Data.RecordType.EVENT)
                        .build()
                )
                .build()

        assertThat(callPaymentProgressWebhookEvent.data())
            .contains(
                CallPaymentProgressWebhookEvent.Data.builder()
                    .id("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                    .eventType(CallPaymentProgressWebhookEvent.Data.EventType.CALL_PAYMENT_PROGRESS)
                    .occurredAt(OffsetDateTime.parse("2026-07-27T07:00:00.000000Z"))
                    .payload(
                        CallPaymentProgressWebhookEvent.Data.Payload.builder()
                            .attempt(1)
                            .bankAccountNumber("********34")
                            .bankAccountType("consumer-checking")
                            .bankRoutingNumber("110000000")
                            .callControlId(
                                "v3:MdI91X4lWFEs7IgbBEOT9M4AigoY08M0WWZFISt1Yw2axZ_IiE4pqg"
                            )
                            .callLegId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                            .callSessionId("428c31b6-abf3-3bc1-b7f4-5013ef9657c1")
                            .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                            .connectionId("7267xxxxxxxxxxxxxx")
                            .errorType(
                                CallPaymentProgressWebhookEvent.Data.Payload.ErrorType
                                    .INVALID_CARD_NUMBER
                            )
                            .expirationDate("1230")
                            .from("+353****5860")
                            .paymentCardNumber("xxxxxxxxxxxx1111")
                            .paymentCardPostalCode("10001")
                            .paymentCardType(
                                CallPaymentProgressWebhookEvent.Data.Payload.PaymentCardType.VISA
                            )
                            .paymentConnector("Default")
                            .paymentMethod(
                                CallPaymentProgressWebhookEvent.Data.Payload.PaymentMethod
                                    .CREDIT_CARD
                            )
                            .paymentStatus(
                                CallPaymentProgressWebhookEvent.Data.Payload.PaymentStatus.COMPLETED
                            )
                            .paymentStep(
                                CallPaymentProgressWebhookEvent.Data.Payload.PaymentStep
                                    .PAYMENT_CARD_NUMBER
                            )
                            .securityCode("xxx")
                            .to("+131****7420")
                            .build()
                    )
                    .recordType(CallPaymentProgressWebhookEvent.Data.RecordType.EVENT)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val callPaymentProgressWebhookEvent =
            CallPaymentProgressWebhookEvent.builder()
                .data(
                    CallPaymentProgressWebhookEvent.Data.builder()
                        .id("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                        .eventType(
                            CallPaymentProgressWebhookEvent.Data.EventType.CALL_PAYMENT_PROGRESS
                        )
                        .occurredAt(OffsetDateTime.parse("2026-07-27T07:00:00.000000Z"))
                        .payload(
                            CallPaymentProgressWebhookEvent.Data.Payload.builder()
                                .attempt(1)
                                .bankAccountNumber("********34")
                                .bankAccountType("consumer-checking")
                                .bankRoutingNumber("110000000")
                                .callControlId(
                                    "v3:MdI91X4lWFEs7IgbBEOT9M4AigoY08M0WWZFISt1Yw2axZ_IiE4pqg"
                                )
                                .callLegId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                                .callSessionId("428c31b6-abf3-3bc1-b7f4-5013ef9657c1")
                                .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                                .connectionId("7267xxxxxxxxxxxxxx")
                                .errorType(
                                    CallPaymentProgressWebhookEvent.Data.Payload.ErrorType
                                        .INVALID_CARD_NUMBER
                                )
                                .expirationDate("1230")
                                .from("+353****5860")
                                .paymentCardNumber("xxxxxxxxxxxx1111")
                                .paymentCardPostalCode("10001")
                                .paymentCardType(
                                    CallPaymentProgressWebhookEvent.Data.Payload.PaymentCardType
                                        .VISA
                                )
                                .paymentConnector("Default")
                                .paymentMethod(
                                    CallPaymentProgressWebhookEvent.Data.Payload.PaymentMethod
                                        .CREDIT_CARD
                                )
                                .paymentStatus(
                                    CallPaymentProgressWebhookEvent.Data.Payload.PaymentStatus
                                        .COMPLETED
                                )
                                .paymentStep(
                                    CallPaymentProgressWebhookEvent.Data.Payload.PaymentStep
                                        .PAYMENT_CARD_NUMBER
                                )
                                .securityCode("xxx")
                                .to("+131****7420")
                                .build()
                        )
                        .recordType(CallPaymentProgressWebhookEvent.Data.RecordType.EVENT)
                        .build()
                )
                .build()

        val roundtrippedCallPaymentProgressWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(callPaymentProgressWebhookEvent),
                jacksonTypeRef<CallPaymentProgressWebhookEvent>(),
            )

        assertThat(roundtrippedCallPaymentProgressWebhookEvent)
            .isEqualTo(callPaymentProgressWebhookEvent)
    }
}
