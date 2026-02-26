// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.availablephonenumbers

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.AvailablePhoneNumbersMetadata
import com.telnyx.sdk.models.CostInformation
import com.telnyx.sdk.models.Feature
import com.telnyx.sdk.models.RegionInformation
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
                            CostInformation.builder()
                                .currency("USD")
                                .monthlyCost("6.54")
                                .upfrontCost("3.21")
                                .build()
                        )
                        .addFeature(Feature.builder().name("sms").build())
                        .addFeature(Feature.builder().name("voice").build())
                        .phoneNumber("+19705555098")
                        .quickship(true)
                        .recordType(
                            AvailablePhoneNumberListResponse.Data.RecordType.AVAILABLE_PHONE_NUMBER
                        )
                        .addRegionInformation(
                            RegionInformation.builder()
                                .regionName("US")
                                .regionType(RegionInformation.RegionType.COUNTRY_CODE)
                                .build()
                        )
                        .reservable(true)
                        .vanityFormat("")
                        .build()
                )
                .meta(
                    AvailablePhoneNumbersMetadata.builder()
                        .bestEffortResults(50L)
                        .totalResults(100L)
                        .build()
                )
                .metadata(
                    AvailablePhoneNumbersMetadata.builder()
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
                        CostInformation.builder()
                            .currency("USD")
                            .monthlyCost("6.54")
                            .upfrontCost("3.21")
                            .build()
                    )
                    .addFeature(Feature.builder().name("sms").build())
                    .addFeature(Feature.builder().name("voice").build())
                    .phoneNumber("+19705555098")
                    .quickship(true)
                    .recordType(
                        AvailablePhoneNumberListResponse.Data.RecordType.AVAILABLE_PHONE_NUMBER
                    )
                    .addRegionInformation(
                        RegionInformation.builder()
                            .regionName("US")
                            .regionType(RegionInformation.RegionType.COUNTRY_CODE)
                            .build()
                    )
                    .reservable(true)
                    .vanityFormat("")
                    .build()
            )
        assertThat(availablePhoneNumberListResponse.meta())
            .contains(
                AvailablePhoneNumbersMetadata.builder()
                    .bestEffortResults(50L)
                    .totalResults(100L)
                    .build()
            )
        assertThat(availablePhoneNumberListResponse.metadata())
            .contains(
                AvailablePhoneNumbersMetadata.builder()
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
                            CostInformation.builder()
                                .currency("USD")
                                .monthlyCost("6.54")
                                .upfrontCost("3.21")
                                .build()
                        )
                        .addFeature(Feature.builder().name("sms").build())
                        .addFeature(Feature.builder().name("voice").build())
                        .phoneNumber("+19705555098")
                        .quickship(true)
                        .recordType(
                            AvailablePhoneNumberListResponse.Data.RecordType.AVAILABLE_PHONE_NUMBER
                        )
                        .addRegionInformation(
                            RegionInformation.builder()
                                .regionName("US")
                                .regionType(RegionInformation.RegionType.COUNTRY_CODE)
                                .build()
                        )
                        .reservable(true)
                        .vanityFormat("")
                        .build()
                )
                .meta(
                    AvailablePhoneNumbersMetadata.builder()
                        .bestEffortResults(50L)
                        .totalResults(100L)
                        .build()
                )
                .metadata(
                    AvailablePhoneNumbersMetadata.builder()
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
