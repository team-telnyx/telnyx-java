// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.x402.creditaccount

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CreditAccountCreateQuoteResponseTest {

    @Test
    fun create() {
        val creditAccountCreateQuoteResponse =
            CreditAccountCreateQuoteResponse.builder()
                .data(
                    CreditAccountCreateQuoteResponse.Data.builder()
                        .id("id")
                        .amountCrypto("amount_crypto")
                        .amountUsd("amount_usd")
                        .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .network("network")
                        .paymentRequirements(
                            CreditAccountCreateQuoteResponse.Data.PaymentRequirements.builder()
                                .addAccept(
                                    CreditAccountCreateQuoteResponse.Data.PaymentRequirements.Accept
                                        .builder()
                                        .amount("amount")
                                        .asset("asset")
                                        .extra(
                                            CreditAccountCreateQuoteResponse.Data
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
                                    CreditAccountCreateQuoteResponse.Data.PaymentRequirements
                                        .Resource
                                        .builder()
                                        .description("description")
                                        .mimeType("mimeType")
                                        .url("url")
                                        .build()
                                )
                                .x402Version(
                                    CreditAccountCreateQuoteResponse.Data.PaymentRequirements
                                        .X402Version
                                        .V2
                                )
                                .build()
                        )
                        .recordType(CreditAccountCreateQuoteResponse.Data.RecordType.QUOTE)
                        .build()
                )
                .build()

        assertThat(creditAccountCreateQuoteResponse.data())
            .contains(
                CreditAccountCreateQuoteResponse.Data.builder()
                    .id("id")
                    .amountCrypto("amount_crypto")
                    .amountUsd("amount_usd")
                    .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .network("network")
                    .paymentRequirements(
                        CreditAccountCreateQuoteResponse.Data.PaymentRequirements.builder()
                            .addAccept(
                                CreditAccountCreateQuoteResponse.Data.PaymentRequirements.Accept
                                    .builder()
                                    .amount("amount")
                                    .asset("asset")
                                    .extra(
                                        CreditAccountCreateQuoteResponse.Data.PaymentRequirements
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
                                CreditAccountCreateQuoteResponse.Data.PaymentRequirements.Resource
                                    .builder()
                                    .description("description")
                                    .mimeType("mimeType")
                                    .url("url")
                                    .build()
                            )
                            .x402Version(
                                CreditAccountCreateQuoteResponse.Data.PaymentRequirements
                                    .X402Version
                                    .V2
                            )
                            .build()
                    )
                    .recordType(CreditAccountCreateQuoteResponse.Data.RecordType.QUOTE)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val creditAccountCreateQuoteResponse =
            CreditAccountCreateQuoteResponse.builder()
                .data(
                    CreditAccountCreateQuoteResponse.Data.builder()
                        .id("id")
                        .amountCrypto("amount_crypto")
                        .amountUsd("amount_usd")
                        .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .network("network")
                        .paymentRequirements(
                            CreditAccountCreateQuoteResponse.Data.PaymentRequirements.builder()
                                .addAccept(
                                    CreditAccountCreateQuoteResponse.Data.PaymentRequirements.Accept
                                        .builder()
                                        .amount("amount")
                                        .asset("asset")
                                        .extra(
                                            CreditAccountCreateQuoteResponse.Data
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
                                    CreditAccountCreateQuoteResponse.Data.PaymentRequirements
                                        .Resource
                                        .builder()
                                        .description("description")
                                        .mimeType("mimeType")
                                        .url("url")
                                        .build()
                                )
                                .x402Version(
                                    CreditAccountCreateQuoteResponse.Data.PaymentRequirements
                                        .X402Version
                                        .V2
                                )
                                .build()
                        )
                        .recordType(CreditAccountCreateQuoteResponse.Data.RecordType.QUOTE)
                        .build()
                )
                .build()

        val roundtrippedCreditAccountCreateQuoteResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(creditAccountCreateQuoteResponse),
                jacksonTypeRef<CreditAccountCreateQuoteResponse>(),
            )

        assertThat(roundtrippedCreditAccountCreateQuoteResponse)
            .isEqualTo(creditAccountCreateQuoteResponse)
    }
}
