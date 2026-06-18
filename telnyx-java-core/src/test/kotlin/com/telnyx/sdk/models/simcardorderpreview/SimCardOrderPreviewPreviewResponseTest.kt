// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.simcardorderpreview

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SimCardOrderPreviewPreviewResponseTest {

    @Test
    fun create() {
        val simCardOrderPreviewPreviewResponse =
            SimCardOrderPreviewPreviewResponse.builder()
                .data(
                    SimCardOrderPreviewPreviewResponse.Data.builder()
                        .quantity(21L)
                        .recordType("sim_card_order_preview")
                        .shippingCost(
                            SimCardOrderPreviewPreviewResponse.Data.ShippingCost.builder()
                                .amount("2.32")
                                .currency("USD")
                                .build()
                        )
                        .simCardsCost(
                            SimCardOrderPreviewPreviewResponse.Data.SimCardsCost.builder()
                                .amount("2.32")
                                .currency("USD")
                                .build()
                        )
                        .totalCost(
                            SimCardOrderPreviewPreviewResponse.Data.TotalCost.builder()
                                .amount("2.32")
                                .currency("USD")
                                .build()
                        )
                        .build()
                )
                .build()

        assertThat(simCardOrderPreviewPreviewResponse.data())
            .contains(
                SimCardOrderPreviewPreviewResponse.Data.builder()
                    .quantity(21L)
                    .recordType("sim_card_order_preview")
                    .shippingCost(
                        SimCardOrderPreviewPreviewResponse.Data.ShippingCost.builder()
                            .amount("2.32")
                            .currency("USD")
                            .build()
                    )
                    .simCardsCost(
                        SimCardOrderPreviewPreviewResponse.Data.SimCardsCost.builder()
                            .amount("2.32")
                            .currency("USD")
                            .build()
                    )
                    .totalCost(
                        SimCardOrderPreviewPreviewResponse.Data.TotalCost.builder()
                            .amount("2.32")
                            .currency("USD")
                            .build()
                    )
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val simCardOrderPreviewPreviewResponse =
            SimCardOrderPreviewPreviewResponse.builder()
                .data(
                    SimCardOrderPreviewPreviewResponse.Data.builder()
                        .quantity(21L)
                        .recordType("sim_card_order_preview")
                        .shippingCost(
                            SimCardOrderPreviewPreviewResponse.Data.ShippingCost.builder()
                                .amount("2.32")
                                .currency("USD")
                                .build()
                        )
                        .simCardsCost(
                            SimCardOrderPreviewPreviewResponse.Data.SimCardsCost.builder()
                                .amount("2.32")
                                .currency("USD")
                                .build()
                        )
                        .totalCost(
                            SimCardOrderPreviewPreviewResponse.Data.TotalCost.builder()
                                .amount("2.32")
                                .currency("USD")
                                .build()
                        )
                        .build()
                )
                .build()

        val roundtrippedSimCardOrderPreviewPreviewResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(simCardOrderPreviewPreviewResponse),
                jacksonTypeRef<SimCardOrderPreviewPreviewResponse>(),
            )

        assertThat(roundtrippedSimCardOrderPreviewPreviewResponse)
            .isEqualTo(simCardOrderPreviewPreviewResponse)
    }
}
