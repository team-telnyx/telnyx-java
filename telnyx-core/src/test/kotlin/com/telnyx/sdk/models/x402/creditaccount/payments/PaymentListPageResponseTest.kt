// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.x402.creditaccount.payments

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PaymentListPageResponseTest {

    @Test
    fun create() {
        val paymentListPageResponse =
            PaymentListPageResponse.builder()
                .addData(
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
                .meta(
                    PaymentListPageResponse.Meta.builder()
                        .pageNumber(0L)
                        .pageSize(0L)
                        .totalPages(0L)
                        .totalResults(0L)
                        .build()
                )
                .build()

        assertThat(paymentListPageResponse.data().getOrNull())
            .containsExactly(
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
        assertThat(paymentListPageResponse.meta())
            .contains(
                PaymentListPageResponse.Meta.builder()
                    .pageNumber(0L)
                    .pageSize(0L)
                    .totalPages(0L)
                    .totalResults(0L)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val paymentListPageResponse =
            PaymentListPageResponse.builder()
                .addData(
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
                .meta(
                    PaymentListPageResponse.Meta.builder()
                        .pageNumber(0L)
                        .pageSize(0L)
                        .totalPages(0L)
                        .totalResults(0L)
                        .build()
                )
                .build()

        val roundtrippedPaymentListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(paymentListPageResponse),
                jacksonTypeRef<PaymentListPageResponse>(),
            )

        assertThat(roundtrippedPaymentListPageResponse).isEqualTo(paymentListPageResponse)
    }
}
