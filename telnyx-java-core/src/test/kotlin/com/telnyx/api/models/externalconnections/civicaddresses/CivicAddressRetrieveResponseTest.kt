// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.externalconnections.civicaddresses

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CivicAddressRetrieveResponseTest {

    @Test
    fun create() {
        val civicAddressRetrieveResponse =
            CivicAddressRetrieveResponse.builder()
                .data(
                    CivicAddressRetrieveResponse.Data.builder()
                        .id("07a4dc5d-9b3b-4ba2-88a4-6ba172316c65")
                        .cityOrTown("Austin")
                        .cityOrTownAlias("city_or_town_alias")
                        .companyName("Telnyx")
                        .country("US")
                        .countryOrDistrict("US")
                        .defaultLocationId("18ded4bb-b694-44c1-a89b-a35b7acd4c9e")
                        .description("Austin Office")
                        .houseNumber("600")
                        .houseNumberSuffix("house_number_suffix")
                        .addLocation(
                            CivicAddressRetrieveResponse.Data.Location.builder()
                                .id("18ded4bb-b694-44c1-a89b-a35b7acd4c9e")
                                .additionalInfo("additional_info")
                                .description("Austin Office")
                                .isDefault(true)
                                .build()
                        )
                        .addLocation(
                            CivicAddressRetrieveResponse.Data.Location.builder()
                                .id("d420a57f-c4ae-4697-87e1-fbefd9e86f72")
                                .additionalInfo("14th Floor")
                                .description("description")
                                .isDefault(false)
                                .build()
                        )
                        .postalOrZipCode("78701")
                        .recordType("civic_address")
                        .stateOrProvince("TX")
                        .streetName("Congress Street")
                        .streetSuffix("street_suffix")
                        .build()
                )
                .build()

        assertThat(civicAddressRetrieveResponse.data())
            .contains(
                CivicAddressRetrieveResponse.Data.builder()
                    .id("07a4dc5d-9b3b-4ba2-88a4-6ba172316c65")
                    .cityOrTown("Austin")
                    .cityOrTownAlias("city_or_town_alias")
                    .companyName("Telnyx")
                    .country("US")
                    .countryOrDistrict("US")
                    .defaultLocationId("18ded4bb-b694-44c1-a89b-a35b7acd4c9e")
                    .description("Austin Office")
                    .houseNumber("600")
                    .houseNumberSuffix("house_number_suffix")
                    .addLocation(
                        CivicAddressRetrieveResponse.Data.Location.builder()
                            .id("18ded4bb-b694-44c1-a89b-a35b7acd4c9e")
                            .additionalInfo("additional_info")
                            .description("Austin Office")
                            .isDefault(true)
                            .build()
                    )
                    .addLocation(
                        CivicAddressRetrieveResponse.Data.Location.builder()
                            .id("d420a57f-c4ae-4697-87e1-fbefd9e86f72")
                            .additionalInfo("14th Floor")
                            .description("description")
                            .isDefault(false)
                            .build()
                    )
                    .postalOrZipCode("78701")
                    .recordType("civic_address")
                    .stateOrProvince("TX")
                    .streetName("Congress Street")
                    .streetSuffix("street_suffix")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val civicAddressRetrieveResponse =
            CivicAddressRetrieveResponse.builder()
                .data(
                    CivicAddressRetrieveResponse.Data.builder()
                        .id("07a4dc5d-9b3b-4ba2-88a4-6ba172316c65")
                        .cityOrTown("Austin")
                        .cityOrTownAlias("city_or_town_alias")
                        .companyName("Telnyx")
                        .country("US")
                        .countryOrDistrict("US")
                        .defaultLocationId("18ded4bb-b694-44c1-a89b-a35b7acd4c9e")
                        .description("Austin Office")
                        .houseNumber("600")
                        .houseNumberSuffix("house_number_suffix")
                        .addLocation(
                            CivicAddressRetrieveResponse.Data.Location.builder()
                                .id("18ded4bb-b694-44c1-a89b-a35b7acd4c9e")
                                .additionalInfo("additional_info")
                                .description("Austin Office")
                                .isDefault(true)
                                .build()
                        )
                        .addLocation(
                            CivicAddressRetrieveResponse.Data.Location.builder()
                                .id("d420a57f-c4ae-4697-87e1-fbefd9e86f72")
                                .additionalInfo("14th Floor")
                                .description("description")
                                .isDefault(false)
                                .build()
                        )
                        .postalOrZipCode("78701")
                        .recordType("civic_address")
                        .stateOrProvince("TX")
                        .streetName("Congress Street")
                        .streetSuffix("street_suffix")
                        .build()
                )
                .build()

        val roundtrippedCivicAddressRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(civicAddressRetrieveResponse),
                jacksonTypeRef<CivicAddressRetrieveResponse>(),
            )

        assertThat(roundtrippedCivicAddressRetrieveResponse).isEqualTo(civicAddressRetrieveResponse)
    }
}
