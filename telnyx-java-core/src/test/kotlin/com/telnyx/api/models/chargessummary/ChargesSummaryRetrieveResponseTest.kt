// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.chargessummary

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ChargesSummaryRetrieveResponseTest {

    @Test
    fun create() {
        val chargesSummaryRetrieveResponse =
            ChargesSummaryRetrieveResponse.builder()
                .data(
                    ChargesSummaryRetrieveResponse.Data.builder()
                        .currency("USD")
                        .endDate(LocalDate.parse("2025-06-01"))
                        .startDate(LocalDate.parse("2025-05-01"))
                        .summary(
                            ChargesSummaryRetrieveResponse.Data.Summary.builder()
                                .addAdjustment(
                                    ChargesSummaryRetrieveResponse.Data.Summary.Adjustment.builder()
                                        .amount("-10.00")
                                        .description("Credit for service outage")
                                        .eventDate(LocalDate.parse("2025-05-15"))
                                        .build()
                                )
                                .addLine(
                                    ChargesSummaryRetrieveResponse.Data.Summary.Line.Comparative
                                        .builder()
                                        .alias("local")
                                        .existingThisMonth(
                                            MonthDetail.builder()
                                                .mrc("20.00")
                                                .quantity(8L)
                                                .otc("5.00")
                                                .build()
                                        )
                                        .name("Local DIDs")
                                        .newThisMonth(
                                            MonthDetail.builder()
                                                .mrc("25.50")
                                                .quantity(10L)
                                                .otc("5.00")
                                                .build()
                                        )
                                        .build()
                                )
                                .addLine(
                                    ChargesSummaryRetrieveResponse.Data.Summary.Line.Simple
                                        .builder()
                                        .alias("port_out")
                                        .amount("15.75")
                                        .name("Port Out")
                                        .quantity(100L)
                                        .build()
                                )
                                .build()
                        )
                        .total(
                            ChargesSummaryRetrieveResponse.Data.Total.builder()
                                .credits("-5.00")
                                .existingMrc("100.00")
                                .grandTotal("180.00")
                                .ledgerAdjustments("0.00")
                                .newMrc("50.00")
                                .newOtc("25.00")
                                .other("10.00")
                                .build()
                        )
                        .userEmail("user@example.com")
                        .userId("0db0b4aa-a83d-4d4f-ad9b-3ba7c1ac2ce8")
                        .build()
                )
                .build()

        assertThat(chargesSummaryRetrieveResponse.data())
            .isEqualTo(
                ChargesSummaryRetrieveResponse.Data.builder()
                    .currency("USD")
                    .endDate(LocalDate.parse("2025-06-01"))
                    .startDate(LocalDate.parse("2025-05-01"))
                    .summary(
                        ChargesSummaryRetrieveResponse.Data.Summary.builder()
                            .addAdjustment(
                                ChargesSummaryRetrieveResponse.Data.Summary.Adjustment.builder()
                                    .amount("-10.00")
                                    .description("Credit for service outage")
                                    .eventDate(LocalDate.parse("2025-05-15"))
                                    .build()
                            )
                            .addLine(
                                ChargesSummaryRetrieveResponse.Data.Summary.Line.Comparative
                                    .builder()
                                    .alias("local")
                                    .existingThisMonth(
                                        MonthDetail.builder()
                                            .mrc("20.00")
                                            .quantity(8L)
                                            .otc("5.00")
                                            .build()
                                    )
                                    .name("Local DIDs")
                                    .newThisMonth(
                                        MonthDetail.builder()
                                            .mrc("25.50")
                                            .quantity(10L)
                                            .otc("5.00")
                                            .build()
                                    )
                                    .build()
                            )
                            .addLine(
                                ChargesSummaryRetrieveResponse.Data.Summary.Line.Simple.builder()
                                    .alias("port_out")
                                    .amount("15.75")
                                    .name("Port Out")
                                    .quantity(100L)
                                    .build()
                            )
                            .build()
                    )
                    .total(
                        ChargesSummaryRetrieveResponse.Data.Total.builder()
                            .credits("-5.00")
                            .existingMrc("100.00")
                            .grandTotal("180.00")
                            .ledgerAdjustments("0.00")
                            .newMrc("50.00")
                            .newOtc("25.00")
                            .other("10.00")
                            .build()
                    )
                    .userEmail("user@example.com")
                    .userId("0db0b4aa-a83d-4d4f-ad9b-3ba7c1ac2ce8")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val chargesSummaryRetrieveResponse =
            ChargesSummaryRetrieveResponse.builder()
                .data(
                    ChargesSummaryRetrieveResponse.Data.builder()
                        .currency("USD")
                        .endDate(LocalDate.parse("2025-06-01"))
                        .startDate(LocalDate.parse("2025-05-01"))
                        .summary(
                            ChargesSummaryRetrieveResponse.Data.Summary.builder()
                                .addAdjustment(
                                    ChargesSummaryRetrieveResponse.Data.Summary.Adjustment.builder()
                                        .amount("-10.00")
                                        .description("Credit for service outage")
                                        .eventDate(LocalDate.parse("2025-05-15"))
                                        .build()
                                )
                                .addLine(
                                    ChargesSummaryRetrieveResponse.Data.Summary.Line.Comparative
                                        .builder()
                                        .alias("local")
                                        .existingThisMonth(
                                            MonthDetail.builder()
                                                .mrc("20.00")
                                                .quantity(8L)
                                                .otc("5.00")
                                                .build()
                                        )
                                        .name("Local DIDs")
                                        .newThisMonth(
                                            MonthDetail.builder()
                                                .mrc("25.50")
                                                .quantity(10L)
                                                .otc("5.00")
                                                .build()
                                        )
                                        .build()
                                )
                                .addLine(
                                    ChargesSummaryRetrieveResponse.Data.Summary.Line.Simple
                                        .builder()
                                        .alias("port_out")
                                        .amount("15.75")
                                        .name("Port Out")
                                        .quantity(100L)
                                        .build()
                                )
                                .build()
                        )
                        .total(
                            ChargesSummaryRetrieveResponse.Data.Total.builder()
                                .credits("-5.00")
                                .existingMrc("100.00")
                                .grandTotal("180.00")
                                .ledgerAdjustments("0.00")
                                .newMrc("50.00")
                                .newOtc("25.00")
                                .other("10.00")
                                .build()
                        )
                        .userEmail("user@example.com")
                        .userId("0db0b4aa-a83d-4d4f-ad9b-3ba7c1ac2ce8")
                        .build()
                )
                .build()

        val roundtrippedChargesSummaryRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(chargesSummaryRetrieveResponse),
                jacksonTypeRef<ChargesSummaryRetrieveResponse>(),
            )

        assertThat(roundtrippedChargesSummaryRetrieveResponse)
            .isEqualTo(chargesSummaryRetrieveResponse)
    }
}
