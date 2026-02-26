// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.externalconnections.civicaddresses

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CivicAddressTest {

    @Test
    fun create() {
        val civicAddress =
            CivicAddress.builder()
                .id("07a4dc5d-9b3b-4ba2-88a4-6ba172316c65")
                .cityOrTown("Austin")
                .cityOrTownAlias("")
                .companyName("Telnyx")
                .country("US")
                .countryOrDistrict("US")
                .defaultLocationId("18ded4bb-b694-44c1-a89b-a35b7acd4c9e")
                .description("Austin Office")
                .houseNumber("600")
                .houseNumberSuffix("")
                .addLocation(
                    Location.builder()
                        .id("18ded4bb-b694-44c1-a89b-a35b7acd4c9e")
                        .additionalInfo("")
                        .description("Austin Office")
                        .isDefault(true)
                        .build()
                )
                .addLocation(
                    Location.builder()
                        .id("d420a57f-c4ae-4697-87e1-fbefd9e86f72")
                        .additionalInfo("14th Floor")
                        .description("")
                        .isDefault(false)
                        .build()
                )
                .postalOrZipCode("78701")
                .recordType("civic_address")
                .stateOrProvince("TX")
                .streetName("Congress Street")
                .streetSuffix("")
                .build()

        assertThat(civicAddress.id()).contains("07a4dc5d-9b3b-4ba2-88a4-6ba172316c65")
        assertThat(civicAddress.cityOrTown()).contains("Austin")
        assertThat(civicAddress.cityOrTownAlias()).contains("")
        assertThat(civicAddress.companyName()).contains("Telnyx")
        assertThat(civicAddress.country()).contains("US")
        assertThat(civicAddress.countryOrDistrict()).contains("US")
        assertThat(civicAddress.defaultLocationId())
            .contains("18ded4bb-b694-44c1-a89b-a35b7acd4c9e")
        assertThat(civicAddress.description()).contains("Austin Office")
        assertThat(civicAddress.houseNumber()).contains("600")
        assertThat(civicAddress.houseNumberSuffix()).contains("")
        assertThat(civicAddress.locations().getOrNull())
            .containsExactly(
                Location.builder()
                    .id("18ded4bb-b694-44c1-a89b-a35b7acd4c9e")
                    .additionalInfo("")
                    .description("Austin Office")
                    .isDefault(true)
                    .build(),
                Location.builder()
                    .id("d420a57f-c4ae-4697-87e1-fbefd9e86f72")
                    .additionalInfo("14th Floor")
                    .description("")
                    .isDefault(false)
                    .build(),
            )
        assertThat(civicAddress.postalOrZipCode()).contains("78701")
        assertThat(civicAddress.recordType()).contains("civic_address")
        assertThat(civicAddress.stateOrProvince()).contains("TX")
        assertThat(civicAddress.streetName()).contains("Congress Street")
        assertThat(civicAddress.streetSuffix()).contains("")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val civicAddress =
            CivicAddress.builder()
                .id("07a4dc5d-9b3b-4ba2-88a4-6ba172316c65")
                .cityOrTown("Austin")
                .cityOrTownAlias("")
                .companyName("Telnyx")
                .country("US")
                .countryOrDistrict("US")
                .defaultLocationId("18ded4bb-b694-44c1-a89b-a35b7acd4c9e")
                .description("Austin Office")
                .houseNumber("600")
                .houseNumberSuffix("")
                .addLocation(
                    Location.builder()
                        .id("18ded4bb-b694-44c1-a89b-a35b7acd4c9e")
                        .additionalInfo("")
                        .description("Austin Office")
                        .isDefault(true)
                        .build()
                )
                .addLocation(
                    Location.builder()
                        .id("d420a57f-c4ae-4697-87e1-fbefd9e86f72")
                        .additionalInfo("14th Floor")
                        .description("")
                        .isDefault(false)
                        .build()
                )
                .postalOrZipCode("78701")
                .recordType("civic_address")
                .stateOrProvince("TX")
                .streetName("Congress Street")
                .streetSuffix("")
                .build()

        val roundtrippedCivicAddress =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(civicAddress),
                jacksonTypeRef<CivicAddress>(),
            )

        assertThat(roundtrippedCivicAddress).isEqualTo(civicAddress)
    }
}
