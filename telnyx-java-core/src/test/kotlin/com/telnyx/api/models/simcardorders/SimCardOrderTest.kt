// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.simcardorders

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SimCardOrderTest {

    @Test
    fun create() {
        val simCardOrder =
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

        assertThat(simCardOrder.id()).contains("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
        assertThat(simCardOrder.cost())
            .contains(SimCardOrder.Cost.builder().amount("2.52").currency("USD").build())
        assertThat(simCardOrder.createdAt()).contains("2018-02-02T22:25:27.521Z")
        assertThat(simCardOrder.orderAddress())
            .contains(
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
        assertThat(simCardOrder.quantity()).contains(21L)
        assertThat(simCardOrder.recordType()).contains("sim_card_order")
        assertThat(simCardOrder.status()).contains(SimCardOrder.Status.PENDING)
        assertThat(simCardOrder.trackingUrl()).contains("http://www.example.com/")
        assertThat(simCardOrder.updatedAt()).contains("2018-02-02T22:25:27.521Z")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val simCardOrder =
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

        val roundtrippedSimCardOrder =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(simCardOrder),
                jacksonTypeRef<SimCardOrder>(),
            )

        assertThat(roundtrippedSimCardOrder).isEqualTo(simCardOrder)
    }
}
