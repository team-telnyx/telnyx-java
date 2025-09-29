// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.chargesbreakdown

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ChargesBreakdownRetrieveResponseTest {

    @Test
    fun create() {
        val chargesBreakdownRetrieveResponse =
            ChargesBreakdownRetrieveResponse.builder()
                .data(
                    ChargesBreakdownRetrieveResponse.Data.builder()
                        .currency("USD")
                        .endDate(LocalDate.parse("2025-06-01"))
                        .addResult(
                            ChargesBreakdownRetrieveResponse.Data.Result.builder()
                                .chargeType("local")
                                .serviceOwnerEmail("user@example.com")
                                .serviceOwnerUserId("0db0b4aa-a83d-4d4f-ad9b-3ba7c1ac2ce8")
                                .addService(
                                    ChargesBreakdownRetrieveResponse.Data.Result.Service.builder()
                                        .cost("1.50")
                                        .costType("MRC")
                                        .name("Local DIDs")
                                        .build()
                                )
                                .tn("+15551234567")
                                .build()
                        )
                        .startDate(LocalDate.parse("2025-05-01"))
                        .userEmail("user@example.com")
                        .userId("0db0b4aa-a83d-4d4f-ad9b-3ba7c1ac2ce8")
                        .build()
                )
                .build()

        assertThat(chargesBreakdownRetrieveResponse.data())
            .isEqualTo(
                ChargesBreakdownRetrieveResponse.Data.builder()
                    .currency("USD")
                    .endDate(LocalDate.parse("2025-06-01"))
                    .addResult(
                        ChargesBreakdownRetrieveResponse.Data.Result.builder()
                            .chargeType("local")
                            .serviceOwnerEmail("user@example.com")
                            .serviceOwnerUserId("0db0b4aa-a83d-4d4f-ad9b-3ba7c1ac2ce8")
                            .addService(
                                ChargesBreakdownRetrieveResponse.Data.Result.Service.builder()
                                    .cost("1.50")
                                    .costType("MRC")
                                    .name("Local DIDs")
                                    .build()
                            )
                            .tn("+15551234567")
                            .build()
                    )
                    .startDate(LocalDate.parse("2025-05-01"))
                    .userEmail("user@example.com")
                    .userId("0db0b4aa-a83d-4d4f-ad9b-3ba7c1ac2ce8")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val chargesBreakdownRetrieveResponse =
            ChargesBreakdownRetrieveResponse.builder()
                .data(
                    ChargesBreakdownRetrieveResponse.Data.builder()
                        .currency("USD")
                        .endDate(LocalDate.parse("2025-06-01"))
                        .addResult(
                            ChargesBreakdownRetrieveResponse.Data.Result.builder()
                                .chargeType("local")
                                .serviceOwnerEmail("user@example.com")
                                .serviceOwnerUserId("0db0b4aa-a83d-4d4f-ad9b-3ba7c1ac2ce8")
                                .addService(
                                    ChargesBreakdownRetrieveResponse.Data.Result.Service.builder()
                                        .cost("1.50")
                                        .costType("MRC")
                                        .name("Local DIDs")
                                        .build()
                                )
                                .tn("+15551234567")
                                .build()
                        )
                        .startDate(LocalDate.parse("2025-05-01"))
                        .userEmail("user@example.com")
                        .userId("0db0b4aa-a83d-4d4f-ad9b-3ba7c1ac2ce8")
                        .build()
                )
                .build()

        val roundtrippedChargesBreakdownRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(chargesBreakdownRetrieveResponse),
                jacksonTypeRef<ChargesBreakdownRetrieveResponse>(),
            )

        assertThat(roundtrippedChargesBreakdownRetrieveResponse)
            .isEqualTo(chargesBreakdownRetrieveResponse)
    }
}
