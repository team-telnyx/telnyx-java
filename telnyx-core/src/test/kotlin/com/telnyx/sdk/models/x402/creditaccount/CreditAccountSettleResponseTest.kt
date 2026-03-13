// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.x402.creditaccount

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CreditAccountSettleResponseTest {

    @Test
    fun create() {
        val creditAccountSettleResponse =
            CreditAccountSettleResponse.builder()
                .data(
                    CreditAccountSettleResponse.Data.builder()
                        .id("id")
                        .amount("amount")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .currency("currency")
                        .quoteId("quote_id")
                        .recordType(CreditAccountSettleResponse.Data.RecordType.X402_TRANSACTION)
                        .status(CreditAccountSettleResponse.Data.Status.SETTLED)
                        .txHash("tx_hash")
                        .build()
                )
                .build()

        assertThat(creditAccountSettleResponse.data())
            .contains(
                CreditAccountSettleResponse.Data.builder()
                    .id("id")
                    .amount("amount")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .currency("currency")
                    .quoteId("quote_id")
                    .recordType(CreditAccountSettleResponse.Data.RecordType.X402_TRANSACTION)
                    .status(CreditAccountSettleResponse.Data.Status.SETTLED)
                    .txHash("tx_hash")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val creditAccountSettleResponse =
            CreditAccountSettleResponse.builder()
                .data(
                    CreditAccountSettleResponse.Data.builder()
                        .id("id")
                        .amount("amount")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .currency("currency")
                        .quoteId("quote_id")
                        .recordType(CreditAccountSettleResponse.Data.RecordType.X402_TRANSACTION)
                        .status(CreditAccountSettleResponse.Data.Status.SETTLED)
                        .txHash("tx_hash")
                        .build()
                )
                .build()

        val roundtrippedCreditAccountSettleResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(creditAccountSettleResponse),
                jacksonTypeRef<CreditAccountSettleResponse>(),
            )

        assertThat(roundtrippedCreditAccountSettleResponse).isEqualTo(creditAccountSettleResponse)
    }
}
