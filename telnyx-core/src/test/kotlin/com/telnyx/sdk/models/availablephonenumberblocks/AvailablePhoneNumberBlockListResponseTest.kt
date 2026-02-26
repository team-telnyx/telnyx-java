// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.availablephonenumberblocks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.AvailablePhoneNumbersMetadata
import com.telnyx.sdk.models.CostInformation
import com.telnyx.sdk.models.Feature
import com.telnyx.sdk.models.RegionInformation
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AvailablePhoneNumberBlockListResponseTest {

    @Test
    fun create() {
        val availablePhoneNumberBlockListResponse =
            AvailablePhoneNumberBlockListResponse.builder()
                .addData(
                    AvailablePhoneNumberBlockListResponse.Data.builder()
                        .costInformation(
                            CostInformation.builder()
                                .currency("USD")
                                .monthlyCost("6.54")
                                .upfrontCost("3.21")
                                .build()
                        )
                        .addFeature(Feature.builder().name("sms").build())
                        .addFeature(Feature.builder().name("voice").build())
                        .phoneNumber("+19705555000")
                        .range(10L)
                        .recordType(
                            AvailablePhoneNumberBlockListResponse.Data.RecordType
                                .AVAILABLE_PHONE_NUMBER_BLOCK
                        )
                        .addRegionInformation(
                            RegionInformation.builder()
                                .regionName("US")
                                .regionType(RegionInformation.RegionType.COUNTRY_CODE)
                                .build()
                        )
                        .build()
                )
                .meta(
                    AvailablePhoneNumbersMetadata.builder()
                        .bestEffortResults(50L)
                        .totalResults(100L)
                        .build()
                )
                .build()

        assertThat(availablePhoneNumberBlockListResponse.data().getOrNull())
            .containsExactly(
                AvailablePhoneNumberBlockListResponse.Data.builder()
                    .costInformation(
                        CostInformation.builder()
                            .currency("USD")
                            .monthlyCost("6.54")
                            .upfrontCost("3.21")
                            .build()
                    )
                    .addFeature(Feature.builder().name("sms").build())
                    .addFeature(Feature.builder().name("voice").build())
                    .phoneNumber("+19705555000")
                    .range(10L)
                    .recordType(
                        AvailablePhoneNumberBlockListResponse.Data.RecordType
                            .AVAILABLE_PHONE_NUMBER_BLOCK
                    )
                    .addRegionInformation(
                        RegionInformation.builder()
                            .regionName("US")
                            .regionType(RegionInformation.RegionType.COUNTRY_CODE)
                            .build()
                    )
                    .build()
            )
        assertThat(availablePhoneNumberBlockListResponse.meta())
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
        val availablePhoneNumberBlockListResponse =
            AvailablePhoneNumberBlockListResponse.builder()
                .addData(
                    AvailablePhoneNumberBlockListResponse.Data.builder()
                        .costInformation(
                            CostInformation.builder()
                                .currency("USD")
                                .monthlyCost("6.54")
                                .upfrontCost("3.21")
                                .build()
                        )
                        .addFeature(Feature.builder().name("sms").build())
                        .addFeature(Feature.builder().name("voice").build())
                        .phoneNumber("+19705555000")
                        .range(10L)
                        .recordType(
                            AvailablePhoneNumberBlockListResponse.Data.RecordType
                                .AVAILABLE_PHONE_NUMBER_BLOCK
                        )
                        .addRegionInformation(
                            RegionInformation.builder()
                                .regionName("US")
                                .regionType(RegionInformation.RegionType.COUNTRY_CODE)
                                .build()
                        )
                        .build()
                )
                .meta(
                    AvailablePhoneNumbersMetadata.builder()
                        .bestEffortResults(50L)
                        .totalResults(100L)
                        .build()
                )
                .build()

        val roundtrippedAvailablePhoneNumberBlockListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(availablePhoneNumberBlockListResponse),
                jacksonTypeRef<AvailablePhoneNumberBlockListResponse>(),
            )

        assertThat(roundtrippedAvailablePhoneNumberBlockListResponse)
            .isEqualTo(availablePhoneNumberBlockListResponse)
    }
}
