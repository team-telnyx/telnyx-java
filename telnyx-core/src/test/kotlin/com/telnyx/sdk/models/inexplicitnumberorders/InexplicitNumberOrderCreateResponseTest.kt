// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.inexplicitnumberorders

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InexplicitNumberOrderCreateResponseTest {

    @Test
    fun create() {
        val inexplicitNumberOrderCreateResponse =
            InexplicitNumberOrderCreateResponse.builder()
                .data(
                    InexplicitNumberOrderCreateResponse.Data.builder()
                        .id("id")
                        .billingGroupId("billing_group_id")
                        .connectionId("connection_id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .customerReference("customer_reference")
                        .messagingProfileId("messaging_profile_id")
                        .addOrderingGroup(
                            InexplicitNumberOrderCreateResponse.Data.OrderingGroup.builder()
                                .administrativeArea("administrative_area")
                                .countAllocated(0L)
                                .countRequested(0L)
                                .countryIso("country_iso")
                                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .errorReason("error_reason")
                                .excludeHeldNumbers(true)
                                .nationalDestinationCode("national_destination_code")
                                .addOrder(
                                    InexplicitNumberOrderCreateResponse.Data.OrderingGroup.Order
                                        .builder()
                                        .numberOrderId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                        .addSubNumberOrderId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                        .build()
                                )
                                .phoneNumberType("phone_number_type")
                                .phoneNumberContains("phone_number[contains]")
                                .phoneNumberEndsWith("phone_number[ends_with]")
                                .phoneNumberStartsWith("phone_number[starts_with]")
                                .quickship(true)
                                .status(
                                    InexplicitNumberOrderCreateResponse.Data.OrderingGroup.Status
                                        .PENDING
                                )
                                .strategy(
                                    InexplicitNumberOrderCreateResponse.Data.OrderingGroup.Strategy
                                        .ALWAYS
                                )
                                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .build()
                        )
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .build()

        assertThat(inexplicitNumberOrderCreateResponse.data())
            .contains(
                InexplicitNumberOrderCreateResponse.Data.builder()
                    .id("id")
                    .billingGroupId("billing_group_id")
                    .connectionId("connection_id")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .customerReference("customer_reference")
                    .messagingProfileId("messaging_profile_id")
                    .addOrderingGroup(
                        InexplicitNumberOrderCreateResponse.Data.OrderingGroup.builder()
                            .administrativeArea("administrative_area")
                            .countAllocated(0L)
                            .countRequested(0L)
                            .countryIso("country_iso")
                            .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .errorReason("error_reason")
                            .excludeHeldNumbers(true)
                            .nationalDestinationCode("national_destination_code")
                            .addOrder(
                                InexplicitNumberOrderCreateResponse.Data.OrderingGroup.Order
                                    .builder()
                                    .numberOrderId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                    .addSubNumberOrderId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                    .build()
                            )
                            .phoneNumberType("phone_number_type")
                            .phoneNumberContains("phone_number[contains]")
                            .phoneNumberEndsWith("phone_number[ends_with]")
                            .phoneNumberStartsWith("phone_number[starts_with]")
                            .quickship(true)
                            .status(
                                InexplicitNumberOrderCreateResponse.Data.OrderingGroup.Status
                                    .PENDING
                            )
                            .strategy(
                                InexplicitNumberOrderCreateResponse.Data.OrderingGroup.Strategy
                                    .ALWAYS
                            )
                            .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .build()
                    )
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val inexplicitNumberOrderCreateResponse =
            InexplicitNumberOrderCreateResponse.builder()
                .data(
                    InexplicitNumberOrderCreateResponse.Data.builder()
                        .id("id")
                        .billingGroupId("billing_group_id")
                        .connectionId("connection_id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .customerReference("customer_reference")
                        .messagingProfileId("messaging_profile_id")
                        .addOrderingGroup(
                            InexplicitNumberOrderCreateResponse.Data.OrderingGroup.builder()
                                .administrativeArea("administrative_area")
                                .countAllocated(0L)
                                .countRequested(0L)
                                .countryIso("country_iso")
                                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .errorReason("error_reason")
                                .excludeHeldNumbers(true)
                                .nationalDestinationCode("national_destination_code")
                                .addOrder(
                                    InexplicitNumberOrderCreateResponse.Data.OrderingGroup.Order
                                        .builder()
                                        .numberOrderId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                        .addSubNumberOrderId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                        .build()
                                )
                                .phoneNumberType("phone_number_type")
                                .phoneNumberContains("phone_number[contains]")
                                .phoneNumberEndsWith("phone_number[ends_with]")
                                .phoneNumberStartsWith("phone_number[starts_with]")
                                .quickship(true)
                                .status(
                                    InexplicitNumberOrderCreateResponse.Data.OrderingGroup.Status
                                        .PENDING
                                )
                                .strategy(
                                    InexplicitNumberOrderCreateResponse.Data.OrderingGroup.Strategy
                                        .ALWAYS
                                )
                                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .build()
                        )
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .build()

        val roundtrippedInexplicitNumberOrderCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(inexplicitNumberOrderCreateResponse),
                jacksonTypeRef<InexplicitNumberOrderCreateResponse>(),
            )

        assertThat(roundtrippedInexplicitNumberOrderCreateResponse)
            .isEqualTo(inexplicitNumberOrderCreateResponse)
    }
}
