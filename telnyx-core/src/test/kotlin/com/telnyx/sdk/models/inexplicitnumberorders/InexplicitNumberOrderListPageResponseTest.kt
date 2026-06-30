// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.inexplicitnumberorders

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InexplicitNumberOrderListPageResponseTest {

    @Test
    fun create() {
        val inexplicitNumberOrderListPageResponse =
            InexplicitNumberOrderListPageResponse.builder()
                .addData(
                    InexplicitNumberOrderResponse.builder()
                        .id("id")
                        .billingGroupId("billing_group_id")
                        .connectionId("connection_id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .customerReference("customer_reference")
                        .messagingProfileId("messaging_profile_id")
                        .addOrderingGroup(
                            InexplicitNumberOrderResponse.OrderingGroup.builder()
                                .administrativeArea("administrative_area")
                                .countAllocated(0L)
                                .countRequested(0L)
                                .countryIso("country_iso")
                                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .errorReason("error_reason")
                                .excludeHeldNumbers(true)
                                .nationalDestinationCode("national_destination_code")
                                .addOrder(
                                    InexplicitNumberOrderResponse.OrderingGroup.Order.builder()
                                        .numberOrderId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                        .addSubNumberOrderId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                        .build()
                                )
                                .phoneNumberType("phone_number_type")
                                .phoneNumberContains("phone_number[contains]")
                                .phoneNumberEndsWith("phone_number[ends_with]")
                                .phoneNumberStartsWith("phone_number[starts_with]")
                                .quickship(true)
                                .status(InexplicitNumberOrderResponse.OrderingGroup.Status.PENDING)
                                .strategy(
                                    InexplicitNumberOrderResponse.OrderingGroup.Strategy.ALWAYS
                                )
                                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .build()
                        )
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .meta(
                    PaginationMeta.builder()
                        .pageNumber(2L)
                        .totalPages(3L)
                        .pageSize(25L)
                        .totalResults(55L)
                        .build()
                )
                .build()

        assertThat(inexplicitNumberOrderListPageResponse.data().getOrNull())
            .containsExactly(
                InexplicitNumberOrderResponse.builder()
                    .id("id")
                    .billingGroupId("billing_group_id")
                    .connectionId("connection_id")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .customerReference("customer_reference")
                    .messagingProfileId("messaging_profile_id")
                    .addOrderingGroup(
                        InexplicitNumberOrderResponse.OrderingGroup.builder()
                            .administrativeArea("administrative_area")
                            .countAllocated(0L)
                            .countRequested(0L)
                            .countryIso("country_iso")
                            .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .errorReason("error_reason")
                            .excludeHeldNumbers(true)
                            .nationalDestinationCode("national_destination_code")
                            .addOrder(
                                InexplicitNumberOrderResponse.OrderingGroup.Order.builder()
                                    .numberOrderId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                    .addSubNumberOrderId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                    .build()
                            )
                            .phoneNumberType("phone_number_type")
                            .phoneNumberContains("phone_number[contains]")
                            .phoneNumberEndsWith("phone_number[ends_with]")
                            .phoneNumberStartsWith("phone_number[starts_with]")
                            .quickship(true)
                            .status(InexplicitNumberOrderResponse.OrderingGroup.Status.PENDING)
                            .strategy(InexplicitNumberOrderResponse.OrderingGroup.Strategy.ALWAYS)
                            .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .build()
                    )
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        assertThat(inexplicitNumberOrderListPageResponse.meta())
            .contains(
                PaginationMeta.builder()
                    .pageNumber(2L)
                    .totalPages(3L)
                    .pageSize(25L)
                    .totalResults(55L)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val inexplicitNumberOrderListPageResponse =
            InexplicitNumberOrderListPageResponse.builder()
                .addData(
                    InexplicitNumberOrderResponse.builder()
                        .id("id")
                        .billingGroupId("billing_group_id")
                        .connectionId("connection_id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .customerReference("customer_reference")
                        .messagingProfileId("messaging_profile_id")
                        .addOrderingGroup(
                            InexplicitNumberOrderResponse.OrderingGroup.builder()
                                .administrativeArea("administrative_area")
                                .countAllocated(0L)
                                .countRequested(0L)
                                .countryIso("country_iso")
                                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .errorReason("error_reason")
                                .excludeHeldNumbers(true)
                                .nationalDestinationCode("national_destination_code")
                                .addOrder(
                                    InexplicitNumberOrderResponse.OrderingGroup.Order.builder()
                                        .numberOrderId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                        .addSubNumberOrderId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                        .build()
                                )
                                .phoneNumberType("phone_number_type")
                                .phoneNumberContains("phone_number[contains]")
                                .phoneNumberEndsWith("phone_number[ends_with]")
                                .phoneNumberStartsWith("phone_number[starts_with]")
                                .quickship(true)
                                .status(InexplicitNumberOrderResponse.OrderingGroup.Status.PENDING)
                                .strategy(
                                    InexplicitNumberOrderResponse.OrderingGroup.Strategy.ALWAYS
                                )
                                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .build()
                        )
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .meta(
                    PaginationMeta.builder()
                        .pageNumber(2L)
                        .totalPages(3L)
                        .pageSize(25L)
                        .totalResults(55L)
                        .build()
                )
                .build()

        val roundtrippedInexplicitNumberOrderListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(inexplicitNumberOrderListPageResponse),
                jacksonTypeRef<InexplicitNumberOrderListPageResponse>(),
            )

        assertThat(roundtrippedInexplicitNumberOrderListPageResponse)
            .isEqualTo(inexplicitNumberOrderListPageResponse)
    }
}
