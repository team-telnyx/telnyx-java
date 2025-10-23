// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.countrycoverage

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CountryCoverageRetrieveCountryResponseTest {

    @Test
    fun create() {
        val countryCoverageRetrieveCountryResponse =
            CountryCoverageRetrieveCountryResponse.builder()
                .data(
                    CountryCoverageRetrieveCountryResponse.Data.builder()
                        .code("code")
                        .addFeature("string")
                        .internationalSms(true)
                        .inventoryCoverage(true)
                        .local(
                            CountryCoverageRetrieveCountryResponse.Data.Local.builder()
                                .addFeature("string")
                                .fullPstnReplacement(true)
                                .internationalSms(true)
                                .p2p(true)
                                .quickship(true)
                                .reservable(true)
                                .build()
                        )
                        .mobile(
                            CountryCoverageRetrieveCountryResponse.Data.Mobile.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .national(
                            CountryCoverageRetrieveCountryResponse.Data.National.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .numbers(true)
                        .p2p(true)
                        .addPhoneNumberType("string")
                        .quickship(true)
                        .region("region")
                        .reservable(true)
                        .sharedCost(
                            CountryCoverageRetrieveCountryResponse.Data.SharedCost.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .tollFree(
                            CountryCoverageRetrieveCountryResponse.Data.TollFree.builder()
                                .addFeature("string")
                                .fullPstnReplacement(true)
                                .internationalSms(true)
                                .p2p(true)
                                .quickship(true)
                                .reservable(true)
                                .build()
                        )
                        .build()
                )
                .build()

        assertThat(countryCoverageRetrieveCountryResponse.data())
            .contains(
                CountryCoverageRetrieveCountryResponse.Data.builder()
                    .code("code")
                    .addFeature("string")
                    .internationalSms(true)
                    .inventoryCoverage(true)
                    .local(
                        CountryCoverageRetrieveCountryResponse.Data.Local.builder()
                            .addFeature("string")
                            .fullPstnReplacement(true)
                            .internationalSms(true)
                            .p2p(true)
                            .quickship(true)
                            .reservable(true)
                            .build()
                    )
                    .mobile(
                        CountryCoverageRetrieveCountryResponse.Data.Mobile.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .national(
                        CountryCoverageRetrieveCountryResponse.Data.National.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .numbers(true)
                    .p2p(true)
                    .addPhoneNumberType("string")
                    .quickship(true)
                    .region("region")
                    .reservable(true)
                    .sharedCost(
                        CountryCoverageRetrieveCountryResponse.Data.SharedCost.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .tollFree(
                        CountryCoverageRetrieveCountryResponse.Data.TollFree.builder()
                            .addFeature("string")
                            .fullPstnReplacement(true)
                            .internationalSms(true)
                            .p2p(true)
                            .quickship(true)
                            .reservable(true)
                            .build()
                    )
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val countryCoverageRetrieveCountryResponse =
            CountryCoverageRetrieveCountryResponse.builder()
                .data(
                    CountryCoverageRetrieveCountryResponse.Data.builder()
                        .code("code")
                        .addFeature("string")
                        .internationalSms(true)
                        .inventoryCoverage(true)
                        .local(
                            CountryCoverageRetrieveCountryResponse.Data.Local.builder()
                                .addFeature("string")
                                .fullPstnReplacement(true)
                                .internationalSms(true)
                                .p2p(true)
                                .quickship(true)
                                .reservable(true)
                                .build()
                        )
                        .mobile(
                            CountryCoverageRetrieveCountryResponse.Data.Mobile.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .national(
                            CountryCoverageRetrieveCountryResponse.Data.National.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .numbers(true)
                        .p2p(true)
                        .addPhoneNumberType("string")
                        .quickship(true)
                        .region("region")
                        .reservable(true)
                        .sharedCost(
                            CountryCoverageRetrieveCountryResponse.Data.SharedCost.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .tollFree(
                            CountryCoverageRetrieveCountryResponse.Data.TollFree.builder()
                                .addFeature("string")
                                .fullPstnReplacement(true)
                                .internationalSms(true)
                                .p2p(true)
                                .quickship(true)
                                .reservable(true)
                                .build()
                        )
                        .build()
                )
                .build()

        val roundtrippedCountryCoverageRetrieveCountryResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(countryCoverageRetrieveCountryResponse),
                jacksonTypeRef<CountryCoverageRetrieveCountryResponse>(),
            )

        assertThat(roundtrippedCountryCoverageRetrieveCountryResponse)
            .isEqualTo(countryCoverageRetrieveCountryResponse)
    }
}
