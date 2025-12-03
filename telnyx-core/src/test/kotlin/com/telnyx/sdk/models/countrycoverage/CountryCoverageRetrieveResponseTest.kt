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
                                    "code" to "code",
                                    "features" to listOf("string"),
                                    "international_sms" to true,
                                    "inventory_coverage" to true,
                                    "local" to
                                        mapOf(
                                            "features" to listOf("string"),
                                            "full_pstn_replacement" to true,
                                            "international_sms" to true,
                                            "p2p" to true,
                                            "quickship" to true,
                                            "reservable" to true,
                                        ),
                                    "mobile" to mapOf("foo" to "bar"),
                                    "national" to mapOf("foo" to "bar"),
                                    "numbers" to true,
                                    "p2p" to true,
                                    "phone_number_type" to listOf("string"),
                                    "quickship" to true,
                                    "region" to "region",
                                    "reservable" to true,
                                    "shared_cost" to mapOf("foo" to "bar"),
                                    "toll_free" to
                                        mapOf(
                                            "features" to listOf("string"),
                                            "full_pstn_replacement" to true,
                                            "international_sms" to true,
                                            "p2p" to true,
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
                                "code" to "code",
                                "features" to listOf("string"),
                                "international_sms" to true,
                                "inventory_coverage" to true,
                                "local" to
                                    mapOf(
                                        "features" to listOf("string"),
                                        "full_pstn_replacement" to true,
                                        "international_sms" to true,
                                        "p2p" to true,
                                        "quickship" to true,
                                        "reservable" to true,
                                    ),
                                "mobile" to mapOf("foo" to "bar"),
                                "national" to mapOf("foo" to "bar"),
                                "numbers" to true,
                                "p2p" to true,
                                "phone_number_type" to listOf("string"),
                                "quickship" to true,
                                "region" to "region",
                                "reservable" to true,
                                "shared_cost" to mapOf("foo" to "bar"),
                                "toll_free" to
                                    mapOf(
                                        "features" to listOf("string"),
                                        "full_pstn_replacement" to true,
                                        "international_sms" to true,
                                        "p2p" to true,
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
                                    "code" to "code",
                                    "features" to listOf("string"),
                                    "international_sms" to true,
                                    "inventory_coverage" to true,
                                    "local" to
                                        mapOf(
                                            "features" to listOf("string"),
                                            "full_pstn_replacement" to true,
                                            "international_sms" to true,
                                            "p2p" to true,
                                            "quickship" to true,
                                            "reservable" to true,
                                        ),
                                    "mobile" to mapOf("foo" to "bar"),
                                    "national" to mapOf("foo" to "bar"),
                                    "numbers" to true,
                                    "p2p" to true,
                                    "phone_number_type" to listOf("string"),
                                    "quickship" to true,
                                    "region" to "region",
                                    "reservable" to true,
                                    "shared_cost" to mapOf("foo" to "bar"),
                                    "toll_free" to
                                        mapOf(
                                            "features" to listOf("string"),
                                            "full_pstn_replacement" to true,
                                            "international_sms" to true,
                                            "p2p" to true,
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
