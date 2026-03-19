// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.x402.creditaccount

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CreditAccountCreatePaymentQuoteResponseTest {

    @Test
    fun create() {
        val creditAccountCreatePaymentQuoteResponse =
            CreditAccountCreatePaymentQuoteResponse.builder()
                .data(
                    CreditAccountCreatePaymentQuoteResponse.Data.builder()
                        .id("id")
                        .amountCrypto("amount_crypto")
                        .amountUsd("amount_usd")
                        .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .network("network")
                        .paymentRequirements(
                            CreditAccountCreatePaymentQuoteResponse.Data.PaymentRequirements
                                .builder()
                                .addAccept(
                                    CreditAccountCreatePaymentQuoteResponse.Data.PaymentRequirements
                                        .Accept
                                        .builder()
                                        .amount("amount")
                                        .asset("asset")
                                        .extra(
                                            CreditAccountCreatePaymentQuoteResponse.Data
                                                .PaymentRequirements
                                                .Accept
                                                .Extra
                                                .builder()
                                                .facilitatorUrl("facilitatorUrl")
                                                .name("name")
                                                .quoteId("quoteId")
                                                .version("version")
                                                .build()
                                        )
                                        .maxTimeoutSeconds(0L)
                                        .network("network")
                                        .payTo("payTo")
                                        .scheme("scheme")
                                        .build()
                                )
                                .resource(
                                    CreditAccountCreatePaymentQuoteResponse.Data.PaymentRequirements
                                        .Resource
                                        .builder()
                                        .description("description")
                                        .mimeType("mimeType")
                                        .url("url")
                                        .build()
                                )
                                .x402Version(
                                    CreditAccountCreatePaymentQuoteResponse.Data.PaymentRequirements
                                        .X402Version
                                        ._2
                                )
                                .build()
                        )
                        .recordType(CreditAccountCreatePaymentQuoteResponse.Data.RecordType.QUOTE)
                        .build()
                )
                .build()

        assertThat(creditAccountCreatePaymentQuoteResponse.data())
            .contains(
                CreditAccountCreatePaymentQuoteResponse.Data.builder()
                    .id("id")
                    .amountCrypto("amount_crypto")
                    .amountUsd("amount_usd")
                    .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .network("network")
                    .paymentRequirements(
                        CreditAccountCreatePaymentQuoteResponse.Data.PaymentRequirements.builder()
                            .addAccept(
                                CreditAccountCreatePaymentQuoteResponse.Data.PaymentRequirements
                                    .Accept
                                    .builder()
                                    .amount("amount")
                                    .asset("asset")
                                    .extra(
                                        CreditAccountCreatePaymentQuoteResponse.Data
                                            .PaymentRequirements
                                            .Accept
                                            .Extra
                                            .builder()
                                            .facilitatorUrl("facilitatorUrl")
                                            .name("name")
                                            .quoteId("quoteId")
                                            .version("version")
                                            .build()
                                    )
                                    .maxTimeoutSeconds(0L)
                                    .network("network")
                                    .payTo("payTo")
                                    .scheme("scheme")
                                    .build()
                            )
                            .resource(
                                CreditAccountCreatePaymentQuoteResponse.Data.PaymentRequirements
                                    .Resource
                                    .builder()
                                    .description("description")
                                    .mimeType("mimeType")
                                    .url("url")
                                    .build()
                            )
                            .x402Version(
                                CreditAccountCreatePaymentQuoteResponse.Data.PaymentRequirements
                                    .X402Version
                                    ._2
                            )
                            .build()
                    )
                    .recordType(CreditAccountCreatePaymentQuoteResponse.Data.RecordType.QUOTE)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val creditAccountCreatePaymentQuoteResponse =
            CreditAccountCreatePaymentQuoteResponse.builder()
                .data(
                    CreditAccountCreatePaymentQuoteResponse.Data.builder()
                        .id("id")
                        .amountCrypto("amount_crypto")
                        .amountUsd("amount_usd")
                        .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .network("network")
                        .paymentRequirements(
                            CreditAccountCreatePaymentQuoteResponse.Data.PaymentRequirements
                                .builder()
                                .addAccept(
                                    CreditAccountCreatePaymentQuoteResponse.Data.PaymentRequirements
                                        .Accept
                                        .builder()
                                        .amount("amount")
                                        .asset("asset")
                                        .extra(
                                            CreditAccountCreatePaymentQuoteResponse.Data
                                                .PaymentRequirements
                                                .Accept
                                                .Extra
                                                .builder()
                                                .facilitatorUrl("facilitatorUrl")
                                                .name("name")
                                                .quoteId("quoteId")
                                                .version("version")
                                                .build()
                                        )
                                        .maxTimeoutSeconds(0L)
                                        .network("network")
                                        .payTo("payTo")
                                        .scheme("scheme")
                                        .build()
                                )
                                .resource(
                                    CreditAccountCreatePaymentQuoteResponse.Data.PaymentRequirements
                                        .Resource
                                        .builder()
                                        .description("description")
                                        .mimeType("mimeType")
                                        .url("url")
                                        .build()
                                )
                                .x402Version(
                                    CreditAccountCreatePaymentQuoteResponse.Data.PaymentRequirements
                                        .X402Version
                                        ._2
                                )
                                .build()
                        )
                        .recordType(CreditAccountCreatePaymentQuoteResponse.Data.RecordType.QUOTE)
                        .build()
                )
                .build()

        val roundtrippedCreditAccountCreatePaymentQuoteResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(creditAccountCreatePaymentQuoteResponse),
                jacksonTypeRef<CreditAccountCreatePaymentQuoteResponse>(),
            )

        assertThat(roundtrippedCreditAccountCreatePaymentQuoteResponse)
            .isEqualTo(creditAccountCreatePaymentQuoteResponse)
    }
}
