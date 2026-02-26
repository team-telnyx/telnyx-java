// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.countrycoverage

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CountryCoverageTest {

    @Test
    fun create() {
        val countryCoverage =
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

        assertThat(countryCoverage.code()).contains("US")
        assertThat(countryCoverage.features().getOrNull())
            .containsExactly(
                "hd_voice",
                "emergency",
                "voice",
                "mms",
                "fax",
                "sms",
                "international_sms",
            )
        assertThat(countryCoverage.internationalSms()).contains(true)
        assertThat(countryCoverage.inventoryCoverage()).contains(true)
        assertThat(countryCoverage.local())
            .contains(
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
        assertThat(countryCoverage.mobile()).contains(CountryCoverage.Mobile.builder().build())
        assertThat(countryCoverage.national()).contains(CountryCoverage.National.builder().build())
        assertThat(countryCoverage.numbers()).contains(true)
        assertThat(countryCoverage.p2p()).contains(true)
        assertThat(countryCoverage.phoneNumberType().getOrNull())
            .containsExactly("local", "local", "local", "toll_free")
        assertThat(countryCoverage.quickship()).contains(true)
        assertThat(countryCoverage.region()).contains("AMER")
        assertThat(countryCoverage.reservable()).contains(true)
        assertThat(countryCoverage.sharedCost())
            .contains(CountryCoverage.SharedCost.builder().build())
        assertThat(countryCoverage.tollFree())
            .contains(
                CountryCoverage.TollFree.builder()
                    .features(listOf("voice", "mms", "fax", "sms", "emergency"))
                    .fullPstnReplacement(false)
                    .internationalSms(false)
                    .p2p(false)
                    .quickship(true)
                    .reservable(true)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val countryCoverage =
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

        val roundtrippedCountryCoverage =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(countryCoverage),
                jacksonTypeRef<CountryCoverage>(),
            )

        assertThat(roundtrippedCountryCoverage).isEqualTo(countryCoverage)
    }
}
