// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.simcardorders

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SimCardOrderCreateResponseTest {

    @Test
    fun create() {
        val simCardOrderCreateResponse =
            SimCardOrderCreateResponse.builder()
                .data(
                    SimCardOrder.builder()
                        .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                        .cost(SimCardOrder.Cost.builder().amount("2.52").currency("USD").build())
                        .createdAt("2018-02-02T22:25:27.521Z")
                        .orderAddress(
                            SimCardOrder.OrderAddress.builder()
                                .id("1293384261075731499")
                                .administrativeArea("TX")
                                .businessName("Telnyx LLC")
                                .countryCode("US")
                                .extendedAddress("14th Floor")
                                .firstName("John")
                                .lastName("Smith")
                                .locality("Austin")
                                .postalCode("78701")
                                .streetAddress("600 Congress Avenue")
                                .build()
                        )
                        .quantity(21L)
                        .recordType("sim_card_order")
                        .status(SimCardOrder.Status.PENDING)
                        .trackingUrl("http://www.example.com/")
                        .updatedAt("2018-02-02T22:25:27.521Z")
                        .build()
                )
                .build()

        assertThat(simCardOrderCreateResponse.data())
            .contains(
                SimCardOrder.builder()
                    .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                    .cost(SimCardOrder.Cost.builder().amount("2.52").currency("USD").build())
                    .createdAt("2018-02-02T22:25:27.521Z")
                    .orderAddress(
                        SimCardOrder.OrderAddress.builder()
                            .id("1293384261075731499")
                            .administrativeArea("TX")
                            .businessName("Telnyx LLC")
                            .countryCode("US")
                            .extendedAddress("14th Floor")
                            .firstName("John")
                            .lastName("Smith")
                            .locality("Austin")
                            .postalCode("78701")
                            .streetAddress("600 Congress Avenue")
                            .build()
                    )
                    .quantity(21L)
                    .recordType("sim_card_order")
                    .status(SimCardOrder.Status.PENDING)
                    .trackingUrl("http://www.example.com/")
                    .updatedAt("2018-02-02T22:25:27.521Z")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val simCardOrderCreateResponse =
            SimCardOrderCreateResponse.builder()
                .data(
                    SimCardOrder.builder()
                        .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                        .cost(SimCardOrder.Cost.builder().amount("2.52").currency("USD").build())
                        .createdAt("2018-02-02T22:25:27.521Z")
                        .orderAddress(
                            SimCardOrder.OrderAddress.builder()
                                .id("1293384261075731499")
                                .administrativeArea("TX")
                                .businessName("Telnyx LLC")
                                .countryCode("US")
                                .extendedAddress("14th Floor")
                                .firstName("John")
                                .lastName("Smith")
                                .locality("Austin")
                                .postalCode("78701")
                                .streetAddress("600 Congress Avenue")
                                .build()
                        )
                        .quantity(21L)
                        .recordType("sim_card_order")
                        .status(SimCardOrder.Status.PENDING)
                        .trackingUrl("http://www.example.com/")
                        .updatedAt("2018-02-02T22:25:27.521Z")
                        .build()
                )
                .build()

        val roundtrippedSimCardOrderCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(simCardOrderCreateResponse),
                jacksonTypeRef<SimCardOrderCreateResponse>(),
            )

        assertThat(roundtrippedSimCardOrderCreateResponse).isEqualTo(simCardOrderCreateResponse)
    }
}
