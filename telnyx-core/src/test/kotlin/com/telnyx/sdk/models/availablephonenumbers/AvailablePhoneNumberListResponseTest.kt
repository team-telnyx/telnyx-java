// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.availablephonenumbers

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AvailablePhoneNumberListResponseTest {

    @Test
    fun create() {
        val availablePhoneNumberListResponse =
            AvailablePhoneNumberListResponse.builder()
                .addData(
                    AvailablePhoneNumberListResponse.Data.builder()
                        .bestEffort(false)
                        .costInformation(
                            AvailablePhoneNumberListResponse.Data.CostInformation.builder()
                                .currency("USD")
                                .monthlyCost("6.54")
                                .upfrontCost("3.21")
                                .build()
                        )
                        .addFeature(
                            AvailablePhoneNumberListResponse.Data.Feature.builder()
                                .name("sms")
                                .build()
                        )
                        .addFeature(
                            AvailablePhoneNumberListResponse.Data.Feature.builder()
                                .name("voice")
                                .build()
                        )
                        .phoneNumber("+19705555098")
                        .quickship(true)
                        .recordType(
                            AvailablePhoneNumberListResponse.Data.RecordType.AVAILABLE_PHONE_NUMBER
                        )
                        .addRegionInformation(
                            AvailablePhoneNumberListResponse.Data.RegionInformation.builder()
                                .regionName("US")
                                .regionType(
                                    AvailablePhoneNumberListResponse.Data.RegionInformation
                                        .RegionType
                                        .COUNTRY_CODE
                                )
                                .build()
                        )
                        .reservable(true)
                        .vanityFormat("")
                        .build()
                )
                .meta(
                    AvailablePhoneNumberListResponse.Meta.builder()
                        .bestEffortResults(50L)
                        .totalResults(100L)
                        .build()
                )
                .build()

        assertThat(availablePhoneNumberListResponse.data().getOrNull())
            .containsExactly(
                AvailablePhoneNumberListResponse.Data.builder()
                    .bestEffort(false)
                    .costInformation(
                        AvailablePhoneNumberListResponse.Data.CostInformation.builder()
                            .currency("USD")
                            .monthlyCost("6.54")
                            .upfrontCost("3.21")
                            .build()
                    )
                    .addFeature(
                        AvailablePhoneNumberListResponse.Data.Feature.builder().name("sms").build()
                    )
                    .addFeature(
                        AvailablePhoneNumberListResponse.Data.Feature.builder()
                            .name("voice")
                            .build()
                    )
                    .phoneNumber("+19705555098")
                    .quickship(true)
                    .recordType(
                        AvailablePhoneNumberListResponse.Data.RecordType.AVAILABLE_PHONE_NUMBER
                    )
                    .addRegionInformation(
                        AvailablePhoneNumberListResponse.Data.RegionInformation.builder()
                            .regionName("US")
                            .regionType(
                                AvailablePhoneNumberListResponse.Data.RegionInformation.RegionType
                                    .COUNTRY_CODE
                            )
                            .build()
                    )
                    .reservable(true)
                    .vanityFormat("")
                    .build()
            )
        assertThat(availablePhoneNumberListResponse.meta())
            .contains(
                AvailablePhoneNumberListResponse.Meta.builder()
                    .bestEffortResults(50L)
                    .totalResults(100L)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val availablePhoneNumberListResponse =
            AvailablePhoneNumberListResponse.builder()
                .addData(
                    AvailablePhoneNumberListResponse.Data.builder()
                        .bestEffort(false)
                        .costInformation(
                            AvailablePhoneNumberListResponse.Data.CostInformation.builder()
                                .currency("USD")
                                .monthlyCost("6.54")
                                .upfrontCost("3.21")
                                .build()
                        )
                        .addFeature(
                            AvailablePhoneNumberListResponse.Data.Feature.builder()
                                .name("sms")
                                .build()
                        )
                        .addFeature(
                            AvailablePhoneNumberListResponse.Data.Feature.builder()
                                .name("voice")
                                .build()
                        )
                        .phoneNumber("+19705555098")
                        .quickship(true)
                        .recordType(
                            AvailablePhoneNumberListResponse.Data.RecordType.AVAILABLE_PHONE_NUMBER
                        )
                        .addRegionInformation(
                            AvailablePhoneNumberListResponse.Data.RegionInformation.builder()
                                .regionName("US")
                                .regionType(
                                    AvailablePhoneNumberListResponse.Data.RegionInformation
                                        .RegionType
                                        .COUNTRY_CODE
                                )
                                .build()
                        )
                        .reservable(true)
                        .vanityFormat("")
                        .build()
                )
                .meta(
                    AvailablePhoneNumberListResponse.Meta.builder()
                        .bestEffortResults(50L)
                        .totalResults(100L)
                        .build()
                )
                .build()

        val roundtrippedAvailablePhoneNumberListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(availablePhoneNumberListResponse),
                jacksonTypeRef<AvailablePhoneNumberListResponse>(),
            )

        assertThat(roundtrippedAvailablePhoneNumberListResponse)
            .isEqualTo(availablePhoneNumberListResponse)
    }
}
