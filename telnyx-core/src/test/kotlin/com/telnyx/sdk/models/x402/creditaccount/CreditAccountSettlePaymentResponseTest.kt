// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.x402.creditaccount

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CreditAccountSettlePaymentResponseTest {

    @Test
    fun create() {
        val creditAccountSettlePaymentResponse =
            CreditAccountSettlePaymentResponse.builder()
                .data(
                    CreditAccountSettlePaymentResponse.Data.builder()
                        .id("id")
                        .amount("amount")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .currency("currency")
                        .quoteId("quote_id")
                        .recordType(
                            CreditAccountSettlePaymentResponse.Data.RecordType.X402_TRANSACTION
                        )
                        .status(CreditAccountSettlePaymentResponse.Data.Status.SETTLED)
                        .txHash("tx_hash")
                        .build()
                )
                .build()

        assertThat(creditAccountSettlePaymentResponse.data())
            .contains(
                CreditAccountSettlePaymentResponse.Data.builder()
                    .id("id")
                    .amount("amount")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .currency("currency")
                    .quoteId("quote_id")
                    .recordType(CreditAccountSettlePaymentResponse.Data.RecordType.X402_TRANSACTION)
                    .status(CreditAccountSettlePaymentResponse.Data.Status.SETTLED)
                    .txHash("tx_hash")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val creditAccountSettlePaymentResponse =
            CreditAccountSettlePaymentResponse.builder()
                .data(
                    CreditAccountSettlePaymentResponse.Data.builder()
                        .id("id")
                        .amount("amount")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .currency("currency")
                        .quoteId("quote_id")
                        .recordType(
                            CreditAccountSettlePaymentResponse.Data.RecordType.X402_TRANSACTION
                        )
                        .status(CreditAccountSettlePaymentResponse.Data.Status.SETTLED)
                        .txHash("tx_hash")
                        .build()
                )
                .build()

        val roundtrippedCreditAccountSettlePaymentResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(creditAccountSettlePaymentResponse),
                jacksonTypeRef<CreditAccountSettlePaymentResponse>(),
            )

        assertThat(roundtrippedCreditAccountSettlePaymentResponse)
            .isEqualTo(creditAccountSettlePaymentResponse)
    }
}
