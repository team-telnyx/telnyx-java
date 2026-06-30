// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.countrycoverage

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CountryCoverageRetrieveResponseTest {

    @Test
    fun create() {
        val countryCoverageRetrieveResponse =
            CountryCoverageRetrieveResponse.builder()
                .data(
                    CountryCoverageRetrieveResponse.Data.builder()
                        .putAdditionalProperty(
                            "foo",
                            JsonValue.from(
                                mapOf(
                                    "code" to "US",
                                    "features" to
                                        listOf(
                                            "hd_voice",
                                            "emergency",
                                            "voice",
                                            "mms",
                                            "fax",
                                            "sms",
                                            "international_sms",
                                        ),
                                    "international_sms" to true,
                                    "inventory_coverage" to true,
                                    "local" to
                                        mapOf(
                                            "features" to
                                                listOf(
                                                    "hd_voice",
                                                    "voice",
                                                    "international_sms",
                                                    "mms",
                                                    "fax",
                                                    "sms",
                                                    "emergency",
                                                ),
                                            "full_pstn_replacement" to true,
                                            "international_sms" to true,
                                            "p2p" to true,
                                            "quickship" to false,
                                            "reservable" to true,
                                        ),
                                    "mobile" to mapOf<String, Any>(),
                                    "national" to mapOf<String, Any>(),
                                    "numbers" to true,
                                    "p2p" to true,
                                    "phone_number_type" to
                                        listOf("local", "local", "local", "toll_free"),
                                    "quickship" to true,
                                    "region" to "AMER",
                                    "reservable" to true,
                                    "shared_cost" to mapOf<String, Any>(),
                                    "toll_free" to
                                        mapOf(
                                            "features" to
                                                listOf("voice", "mms", "fax", "sms", "emergency"),
                                            "full_pstn_replacement" to false,
                                            "international_sms" to false,
                                            "p2p" to false,
                                            "quickship" to true,
                                            "reservable" to true,
                                        ),
                                )
                            ),
                        )
                        .build()
                )
                .build()

        assertThat(countryCoverageRetrieveResponse.data())
            .contains(
                CountryCoverageRetrieveResponse.Data.builder()
                    .putAdditionalProperty(
                        "foo",
                        JsonValue.from(
                            mapOf(
                                "code" to "US",
                                "features" to
                                    listOf(
                                        "hd_voice",
                                        "emergency",
                                        "voice",
                                        "mms",
                                        "fax",
                                        "sms",
                                        "international_sms",
                                    ),
                                "international_sms" to true,
                                "inventory_coverage" to true,
                                "local" to
                                    mapOf(
                                        "features" to
                                            listOf(
                                                "hd_voice",
                                                "voice",
                                                "international_sms",
                                                "mms",
                                                "fax",
                                                "sms",
                                                "emergency",
                                            ),
                                        "full_pstn_replacement" to true,
                                        "international_sms" to true,
                                        "p2p" to true,
                                        "quickship" to false,
                                        "reservable" to true,
                                    ),
                                "mobile" to mapOf<String, Any>(),
                                "national" to mapOf<String, Any>(),
                                "numbers" to true,
                                "p2p" to true,
                                "phone_number_type" to
                                    listOf("local", "local", "local", "toll_free"),
                                "quickship" to true,
                                "region" to "AMER",
                                "reservable" to true,
                                "shared_cost" to mapOf<String, Any>(),
                                "toll_free" to
                                    mapOf(
                                        "features" to
                                            listOf("voice", "mms", "fax", "sms", "emergency"),
                                        "full_pstn_replacement" to false,
                                        "international_sms" to false,
                                        "p2p" to false,
                                        "quickship" to true,
                                        "reservable" to true,
                                    ),
                            )
                        ),
                    )
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val countryCoverageRetrieveResponse =
            CountryCoverageRetrieveResponse.builder()
                .data(
                    CountryCoverageRetrieveResponse.Data.builder()
                        .putAdditionalProperty(
                            "foo",
                            JsonValue.from(
                                mapOf(
                                    "code" to "US",
                                    "features" to
                                        listOf(
                                            "hd_voice",
                                            "emergency",
                                            "voice",
                                            "mms",
                                            "fax",
                                            "sms",
                                            "international_sms",
                                        ),
                                    "international_sms" to true,
                                    "inventory_coverage" to true,
                                    "local" to
                                        mapOf(
                                            "features" to
                                                listOf(
                                                    "hd_voice",
                                                    "voice",
                                                    "international_sms",
                                                    "mms",
                                                    "fax",
                                                    "sms",
                                                    "emergency",
                                                ),
                                            "full_pstn_replacement" to true,
                                            "international_sms" to true,
                                            "p2p" to true,
                                            "quickship" to false,
                                            "reservable" to true,
                                        ),
                                    "mobile" to mapOf<String, Any>(),
                                    "national" to mapOf<String, Any>(),
                                    "numbers" to true,
                                    "p2p" to true,
                                    "phone_number_type" to
                                        listOf("local", "local", "local", "toll_free"),
                                    "quickship" to true,
                                    "region" to "AMER",
                                    "reservable" to true,
                                    "shared_cost" to mapOf<String, Any>(),
                                    "toll_free" to
                                        mapOf(
                                            "features" to
                                                listOf("voice", "mms", "fax", "sms", "emergency"),
                                            "full_pstn_replacement" to false,
                                            "international_sms" to false,
                                            "p2p" to false,
                                            "quickship" to true,
                                            "reservable" to true,
                                        ),
                                )
                            ),
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
