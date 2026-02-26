// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.payment

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PaymentCreateStoredPaymentTransactionResponseTest {

    @Test
    fun create() {
        val paymentCreateStoredPaymentTransactionResponse =
            PaymentCreateStoredPaymentTransactionResponse.builder()
                .data(
                    PaymentCreateStoredPaymentTransactionResponse.Data.builder()
                        .id("id")
                        .amountCents(0L)
                        .amountCurrency("amount_currency")
                        .autoRecharge(true)
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .processorStatus("processor_status")
                        .recordType(
                            PaymentCreateStoredPaymentTransactionResponse.Data.RecordType
                                .TRANSACTION
                        )
                        .transactionProcessingType(
                            PaymentCreateStoredPaymentTransactionResponse.Data
                                .TransactionProcessingType
                                .STORED_PAYMENT
                        )
                        .build()
                )
                .build()

        assertThat(paymentCreateStoredPaymentTransactionResponse.data())
            .contains(
                PaymentCreateStoredPaymentTransactionResponse.Data.builder()
                    .id("id")
                    .amountCents(0L)
                    .amountCurrency("amount_currency")
                    .autoRecharge(true)
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .processorStatus("processor_status")
                    .recordType(
                        PaymentCreateStoredPaymentTransactionResponse.Data.RecordType.TRANSACTION
                    )
                    .transactionProcessingType(
                        PaymentCreateStoredPaymentTransactionResponse.Data.TransactionProcessingType
                            .STORED_PAYMENT
                    )
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val paymentCreateStoredPaymentTransactionResponse =
            PaymentCreateStoredPaymentTransactionResponse.builder()
                .data(
                    PaymentCreateStoredPaymentTransactionResponse.Data.builder()
                        .id("id")
                        .amountCents(0L)
                        .amountCurrency("amount_currency")
                        .autoRecharge(true)
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .processorStatus("processor_status")
                        .recordType(
                            PaymentCreateStoredPaymentTransactionResponse.Data.RecordType
                                .TRANSACTION
                        )
                        .transactionProcessingType(
                            PaymentCreateStoredPaymentTransactionResponse.Data
                                .TransactionProcessingType
                                .STORED_PAYMENT
                        )
                        .build()
                )
                .build()

        val roundtrippedPaymentCreateStoredPaymentTransactionResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(paymentCreateStoredPaymentTransactionResponse),
                jacksonTypeRef<PaymentCreateStoredPaymentTransactionResponse>(),
            )

        assertThat(roundtrippedPaymentCreateStoredPaymentTransactionResponse)
            .isEqualTo(paymentCreateStoredPaymentTransactionResponse)
    }
}
