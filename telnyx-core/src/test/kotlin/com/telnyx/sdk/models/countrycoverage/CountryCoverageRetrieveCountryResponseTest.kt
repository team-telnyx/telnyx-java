// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.countrycoverage

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CountryCoverageRetrieveCountryResponseTest {

    @Test
    fun create() {
        val countryCoverageRetrieveCountryResponse =
            CountryCoverageRetrieveCountryResponse.builder()
                .data(
                    CountryCoverage.builder()
                        .code("US")
                        .features(
                            listOf(
                                "hd_voice",
                                "emergency",
                                "voice",
                                "mms",
                                "fax",
                                "sms",
                                "international_sms",
                            )
                        )
                        .internationalSms(true)
                        .inventoryCoverage(true)
                        .local(
                            CountryCoverage.Local.builder()
                                .features(
                                    listOf(
                                        "hd_voice",
                                        "voice",
                                        "international_sms",
                                        "mms",
                                        "fax",
                                        "sms",
                                        "emergency",
                                    )
                                )
                                .fullPstnReplacement(true)
                                .internationalSms(true)
                                .p2p(true)
                                .quickship(false)
                                .reservable(true)
                                .build()
                        )
                        .mobile(CountryCoverage.Mobile.builder().build())
                        .national(CountryCoverage.National.builder().build())
                        .numbers(true)
                        .p2p(true)
                        .phoneNumberType(listOf("local", "local", "local", "toll_free"))
                        .quickship(true)
                        .region("AMER")
                        .reservable(true)
                        .sharedCost(CountryCoverage.SharedCost.builder().build())
                        .tollFree(
                            CountryCoverage.TollFree.builder()
                                .features(listOf("voice", "mms", "fax", "sms", "emergency"))
                                .fullPstnReplacement(false)
                                .internationalSms(false)
                                .p2p(false)
                                .quickship(true)
                                .reservable(true)
                                .build()
                        )
                        .build()
                )
                .build()

        assertThat(countryCoverageRetrieveCountryResponse.data())
            .contains(
                CountryCoverage.builder()
                    .code("US")
                    .features(
                        listOf(
                            "hd_voice",
                            "emergency",
                            "voice",
                            "mms",
                            "fax",
                            "sms",
                            "international_sms",
                        )
                    )
                    .internationalSms(true)
                    .inventoryCoverage(true)
                    .local(
                        CountryCoverage.Local.builder()
                            .features(
                                listOf(
                                    "hd_voice",
                                    "voice",
                                    "international_sms",
                                    "mms",
                                    "fax",
                                    "sms",
                                    "emergency",
                                )
                            )
                            .fullPstnReplacement(true)
                            .internationalSms(true)
                            .p2p(true)
                            .quickship(false)
                            .reservable(true)
                            .build()
                    )
                    .mobile(CountryCoverage.Mobile.builder().build())
                    .national(CountryCoverage.National.builder().build())
                    .numbers(true)
                    .p2p(true)
                    .phoneNumberType(listOf("local", "local", "local", "toll_free"))
                    .quickship(true)
                    .region("AMER")
                    .reservable(true)
                    .sharedCost(CountryCoverage.SharedCost.builder().build())
                    .tollFree(
                        CountryCoverage.TollFree.builder()
                            .features(listOf("voice", "mms", "fax", "sms", "emergency"))
                            .fullPstnReplacement(false)
                            .internationalSms(false)
                            .p2p(false)
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
                    CountryCoverage.builder()
                        .code("US")
                        .features(
                            listOf(
                                "hd_voice",
                                "emergency",
                                "voice",
                                "mms",
                                "fax",
                                "sms",
                                "international_sms",
                            )
                        )
                        .internationalSms(true)
                        .inventoryCoverage(true)
                        .local(
                            CountryCoverage.Local.builder()
                                .features(
                                    listOf(
                                        "hd_voice",
                                        "voice",
                                        "international_sms",
                                        "mms",
                                        "fax",
                                        "sms",
                                        "emergency",
                                    )
                                )
                                .fullPstnReplacement(true)
                                .internationalSms(true)
                                .p2p(true)
                                .quickship(false)
                                .reservable(true)
                                .build()
                        )
                        .mobile(CountryCoverage.Mobile.builder().build())
                        .national(CountryCoverage.National.builder().build())
                        .numbers(true)
                        .p2p(true)
                        .phoneNumberType(listOf("local", "local", "local", "toll_free"))
                        .quickship(true)
                        .region("AMER")
                        .reservable(true)
                        .sharedCost(CountryCoverage.SharedCost.builder().build())
                        .tollFree(
                            CountryCoverage.TollFree.builder()
                                .features(listOf("voice", "mms", "fax", "sms", "emergency"))
                                .fullPstnReplacement(false)
                                .internationalSms(false)
                                .p2p(false)
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
