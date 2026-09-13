// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.x402.creditaccount.payments

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PaymentRetrieveResponseTest {

    @Test
    fun create() {
        val paymentRetrieveResponse =
            PaymentRetrieveResponse.builder()
                .data(
                    X402TransactionRecord.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .amount("amount")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .currency("currency")
                        .quoteId("quote_id")
                        .recordType(X402TransactionRecord.RecordType.X402_TRANSACTION)
                        .status(X402TransactionRecord.Status.SETTLED)
                        .txHash("tx_hash")
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .build()

        assertThat(paymentRetrieveResponse.data())
            .contains(
                X402TransactionRecord.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .amount("amount")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .currency("currency")
                    .quoteId("quote_id")
                    .recordType(X402TransactionRecord.RecordType.X402_TRANSACTION)
                    .status(X402TransactionRecord.Status.SETTLED)
                    .txHash("tx_hash")
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val paymentRetrieveResponse =
            PaymentRetrieveResponse.builder()
                .data(
                    X402TransactionRecord.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .amount("amount")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .currency("currency")
                        .quoteId("quote_id")
                        .recordType(X402TransactionRecord.RecordType.X402_TRANSACTION)
                        .status(X402TransactionRecord.Status.SETTLED)
                        .txHash("tx_hash")
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .build()

        val roundtrippedPaymentRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(paymentRetrieveResponse),
                jacksonTypeRef<PaymentRetrieveResponse>(),
            )

        assertThat(roundtrippedPaymentRetrieveResponse).isEqualTo(paymentRetrieveResponse)
    }
}
