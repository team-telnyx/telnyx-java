// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.webhooks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CallPaymentCompletedWebhookEventTest {

    @Test
    fun create() {
        val callPaymentCompletedWebhookEvent =
            CallPaymentCompletedWebhookEvent.builder()
                .data(
                    CallPaymentCompletedWebhookEvent.Data.builder()
                        .id("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                        .eventType(
                            CallPaymentCompletedWebhookEvent.Data.EventType.CALL_PAYMENT_COMPLETED
                        )
                        .occurredAt(OffsetDateTime.parse("2026-07-27T07:00:00.000000Z"))
                        .payload(
                            CallPaymentCompletedWebhookEvent.Data.Payload.builder()
                                .bankAccountNumber("********34")
                                .bankAccountType("consumer-checking")
                                .bankRoutingNumber("110000000")
                                .callControlId(
                                    "v3:MdI91X4lWFEs7IgbBEOT9M4AigoY08M0WWZFISt1Yw2axZ_IiE4pqg"
                                )
                                .callLegId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                                .callSessionId("428c31b6-abf3-3bc1-b7f4-5013ef9657c1")
                                .chargeId("ch_abc123")
                                .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                                .connectionId("7267xxxxxxxxxxxxxx")
                                .connectorError("string")
                                .expirationDate("1230")
                                .from("+353****5860")
                                .payErrorCode("card_declined")
                                .paymentCardNumber("xxxxxxxxxxxx1111")
                                .paymentCardPostalCode("10001")
                                .paymentCardType(
                                    CallPaymentCompletedWebhookEvent.Data.Payload.PaymentCardType
                                        .VISA
                                )
                                .paymentConfirmationCode("CONF-98765")
                                .paymentConnector("Default")
                                .paymentError("pay_action_failed")
                                .paymentMethod(
                                    CallPaymentCompletedWebhookEvent.Data.Payload.PaymentMethod
                                        .CREDIT_CARD
                                )
                                .result(
                                    CallPaymentCompletedWebhookEvent.Data.Payload.Result.SUCCESS
                                )
                                .securityCode("xxx")
                                .to("+131****7420")
                                .tokenId("tok_abc123")
                                .build()
                        )
                        .recordType(CallPaymentCompletedWebhookEvent.Data.RecordType.EVENT)
                        .build()
                )
                .build()

        assertThat(callPaymentCompletedWebhookEvent.data())
            .contains(
                CallPaymentCompletedWebhookEvent.Data.builder()
                    .id("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                    .eventType(
                        CallPaymentCompletedWebhookEvent.Data.EventType.CALL_PAYMENT_COMPLETED
                    )
                    .occurredAt(OffsetDateTime.parse("2026-07-27T07:00:00.000000Z"))
                    .payload(
                        CallPaymentCompletedWebhookEvent.Data.Payload.builder()
                            .bankAccountNumber("********34")
                            .bankAccountType("consumer-checking")
                            .bankRoutingNumber("110000000")
                            .callControlId(
                                "v3:MdI91X4lWFEs7IgbBEOT9M4AigoY08M0WWZFISt1Yw2axZ_IiE4pqg"
                            )
                            .callLegId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                            .callSessionId("428c31b6-abf3-3bc1-b7f4-5013ef9657c1")
                            .chargeId("ch_abc123")
                            .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                            .connectionId("7267xxxxxxxxxxxxxx")
                            .connectorError("string")
                            .expirationDate("1230")
                            .from("+353****5860")
                            .payErrorCode("card_declined")
                            .paymentCardNumber("xxxxxxxxxxxx1111")
                            .paymentCardPostalCode("10001")
                            .paymentCardType(
                                CallPaymentCompletedWebhookEvent.Data.Payload.PaymentCardType.VISA
                            )
                            .paymentConfirmationCode("CONF-98765")
                            .paymentConnector("Default")
                            .paymentError("pay_action_failed")
                            .paymentMethod(
                                CallPaymentCompletedWebhookEvent.Data.Payload.PaymentMethod
                                    .CREDIT_CARD
                            )
                            .result(CallPaymentCompletedWebhookEvent.Data.Payload.Result.SUCCESS)
                            .securityCode("xxx")
                            .to("+131****7420")
                            .tokenId("tok_abc123")
                            .build()
                    )
                    .recordType(CallPaymentCompletedWebhookEvent.Data.RecordType.EVENT)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val callPaymentCompletedWebhookEvent =
            CallPaymentCompletedWebhookEvent.builder()
                .data(
                    CallPaymentCompletedWebhookEvent.Data.builder()
                        .id("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                        .eventType(
                            CallPaymentCompletedWebhookEvent.Data.EventType.CALL_PAYMENT_COMPLETED
                        )
                        .occurredAt(OffsetDateTime.parse("2026-07-27T07:00:00.000000Z"))
                        .payload(
                            CallPaymentCompletedWebhookEvent.Data.Payload.builder()
                                .bankAccountNumber("********34")
                                .bankAccountType("consumer-checking")
                                .bankRoutingNumber("110000000")
                                .callControlId(
                                    "v3:MdI91X4lWFEs7IgbBEOT9M4AigoY08M0WWZFISt1Yw2axZ_IiE4pqg"
                                )
                                .callLegId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                                .callSessionId("428c31b6-abf3-3bc1-b7f4-5013ef9657c1")
                                .chargeId("ch_abc123")
                                .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                                .connectionId("7267xxxxxxxxxxxxxx")
                                .connectorError("string")
                                .expirationDate("1230")
                                .from("+353****5860")
                                .payErrorCode("card_declined")
                                .paymentCardNumber("xxxxxxxxxxxx1111")
                                .paymentCardPostalCode("10001")
                                .paymentCardType(
                                    CallPaymentCompletedWebhookEvent.Data.Payload.PaymentCardType
                                        .VISA
                                )
                                .paymentConfirmationCode("CONF-98765")
                                .paymentConnector("Default")
                                .paymentError("pay_action_failed")
                                .paymentMethod(
                                    CallPaymentCompletedWebhookEvent.Data.Payload.PaymentMethod
                                        .CREDIT_CARD
                                )
                                .result(
                                    CallPaymentCompletedWebhookEvent.Data.Payload.Result.SUCCESS
                                )
                                .securityCode("xxx")
                                .to("+131****7420")
                                .tokenId("tok_abc123")
                                .build()
                        )
                        .recordType(CallPaymentCompletedWebhookEvent.Data.RecordType.EVENT)
                        .build()
                )
                .build()

        val roundtrippedCallPaymentCompletedWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(callPaymentCompletedWebhookEvent),
                jacksonTypeRef<CallPaymentCompletedWebhookEvent>(),
            )

        assertThat(roundtrippedCallPaymentCompletedWebhookEvent)
            .isEqualTo(callPaymentCompletedWebhookEvent)
    }
}
