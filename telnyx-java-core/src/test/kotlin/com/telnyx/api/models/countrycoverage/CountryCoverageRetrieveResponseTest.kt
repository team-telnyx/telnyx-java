// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.countrycoverage

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.JsonValue
import com.telnyx.api.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CountryCoverageRetrieveResponseTest {

    @Test
    fun create() {
        val countryCoverageRetrieveResponse =
            CountryCoverageRetrieveResponse.builder()
                .addData(
                    CountryCoverageRetrieveResponse.Data.builder()
                        .code("code")
                        .addFeature("string")
                        .internationalSms(true)
                        .inventoryCoverage(true)
                        .local(
                            CountryCoverageRetrieveResponse.Data.Local.builder()
                                .addFeature("string")
                                .fullPstnReplacement(true)
                                .internationalSms(true)
                                .p2p(true)
                                .quickship(true)
                                .reservable(true)
                                .build()
                        )
                        .mobile(
                            CountryCoverageRetrieveResponse.Data.Mobile.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .national(
                            CountryCoverageRetrieveResponse.Data.National.builder()
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
                            CountryCoverageRetrieveResponse.Data.SharedCost.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .tollFree(
                            CountryCoverageRetrieveResponse.Data.TollFree.builder()
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

        assertThat(countryCoverageRetrieveResponse.data().getOrNull())
            .containsExactly(
                CountryCoverageRetrieveResponse.Data.builder()
                    .code("code")
                    .addFeature("string")
                    .internationalSms(true)
                    .inventoryCoverage(true)
                    .local(
                        CountryCoverageRetrieveResponse.Data.Local.builder()
                            .addFeature("string")
                            .fullPstnReplacement(true)
                            .internationalSms(true)
                            .p2p(true)
                            .quickship(true)
                            .reservable(true)
                            .build()
                    )
                    .mobile(
                        CountryCoverageRetrieveResponse.Data.Mobile.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .national(
                        CountryCoverageRetrieveResponse.Data.National.builder()
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
                        CountryCoverageRetrieveResponse.Data.SharedCost.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .tollFree(
                        CountryCoverageRetrieveResponse.Data.TollFree.builder()
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
        val countryCoverageRetrieveResponse =
            CountryCoverageRetrieveResponse.builder()
                .addData(
                    CountryCoverageRetrieveResponse.Data.builder()
                        .code("code")
                        .addFeature("string")
                        .internationalSms(true)
                        .inventoryCoverage(true)
                        .local(
                            CountryCoverageRetrieveResponse.Data.Local.builder()
                                .addFeature("string")
                                .fullPstnReplacement(true)
                                .internationalSms(true)
                                .p2p(true)
                                .quickship(true)
                                .reservable(true)
                                .build()
                        )
                        .mobile(
                            CountryCoverageRetrieveResponse.Data.Mobile.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .national(
                            CountryCoverageRetrieveResponse.Data.National.builder()
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
                            CountryCoverageRetrieveResponse.Data.SharedCost.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .tollFree(
                            CountryCoverageRetrieveResponse.Data.TollFree.builder()
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

        val roundtrippedCountryCoverageRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(countryCoverageRetrieveResponse),
                jacksonTypeRef<CountryCoverageRetrieveResponse>(),
            )

        assertThat(roundtrippedCountryCoverageRetrieveResponse)
            .isEqualTo(countryCoverageRetrieveResponse)
    }
}
