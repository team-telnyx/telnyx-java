// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.x402.creditaccount.payments

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class X402TransactionRecordTest {

    @Test
    fun create() {
        val x402TransactionRecord =
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

        assertThat(x402TransactionRecord.id()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(x402TransactionRecord.amount()).contains("amount")
        assertThat(x402TransactionRecord.createdAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(x402TransactionRecord.currency()).contains("currency")
        assertThat(x402TransactionRecord.quoteId()).contains("quote_id")
        assertThat(x402TransactionRecord.recordType())
            .contains(X402TransactionRecord.RecordType.X402_TRANSACTION)
        assertThat(x402TransactionRecord.status()).contains(X402TransactionRecord.Status.SETTLED)
        assertThat(x402TransactionRecord.txHash()).contains("tx_hash")
        assertThat(x402TransactionRecord.updatedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val x402TransactionRecord =
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

        val roundtrippedX402TransactionRecord =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(x402TransactionRecord),
                jacksonTypeRef<X402TransactionRecord>(),
            )

        assertThat(roundtrippedX402TransactionRecord).isEqualTo(x402TransactionRecord)
    }
}
