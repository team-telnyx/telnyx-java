// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.subnumberorders

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import com.telnyx.api.models.authenticationproviders.PaginationMeta
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SubNumberOrderListResponseTest {

    @Test
    fun create() {
        val subNumberOrderListResponse =
            SubNumberOrderListResponse.builder()
                .addData(
                    SubNumberOrder.builder()
                        .id("12ade33a-21c0-473b-b055-b3c836e1c292")
                        .countryCode("US")
                        .createdAt(OffsetDateTime.parse("2018-01-01T00:00:00.000000Z"))
                        .customerReference("MY REF 001")
                        .isBlockSubNumberOrder(false)
                        .orderRequestId("12ade33a-21c0-473b-b055-b3c836e1c293")
                        .phoneNumberType(SubNumberOrder.PhoneNumberType.LOCAL)
                        .phoneNumbersCount(1L)
                        .recordType("sub_number_order")
                        .addRegulatoryRequirement(
                            SubNumberOrderRegulatoryRequirement.builder()
                                .fieldType(SubNumberOrderRegulatoryRequirement.FieldType.ADDRESS)
                                .recordType("phone_number_regulatory_requirement")
                                .requirementId("8ffb3622-7c6b-4ccc-b65f-7a3dc0099576")
                                .build()
                        )
                        .requirementsMet(true)
                        .status(SubNumberOrder.Status.PENDING)
                        .updatedAt(OffsetDateTime.parse("2018-01-01T00:00:00.000000Z"))
                        .userId("d70873cd-7c98-401a-81b6-b1ae08246995")
                        .build()
                )
                .meta(
                    PaginationMeta.builder()
                        .pageNumber(2L)
                        .pageSize(25L)
                        .totalPages(3L)
                        .totalResults(55L)
                        .build()
                )
                .build()

        assertThat(subNumberOrderListResponse.data().getOrNull())
            .containsExactly(
                SubNumberOrder.builder()
                    .id("12ade33a-21c0-473b-b055-b3c836e1c292")
                    .countryCode("US")
                    .createdAt(OffsetDateTime.parse("2018-01-01T00:00:00.000000Z"))
                    .customerReference("MY REF 001")
                    .isBlockSubNumberOrder(false)
                    .orderRequestId("12ade33a-21c0-473b-b055-b3c836e1c293")
                    .phoneNumberType(SubNumberOrder.PhoneNumberType.LOCAL)
                    .phoneNumbersCount(1L)
                    .recordType("sub_number_order")
                    .addRegulatoryRequirement(
                        SubNumberOrderRegulatoryRequirement.builder()
                            .fieldType(SubNumberOrderRegulatoryRequirement.FieldType.ADDRESS)
                            .recordType("phone_number_regulatory_requirement")
                            .requirementId("8ffb3622-7c6b-4ccc-b65f-7a3dc0099576")
                            .build()
                    )
                    .requirementsMet(true)
                    .status(SubNumberOrder.Status.PENDING)
                    .updatedAt(OffsetDateTime.parse("2018-01-01T00:00:00.000000Z"))
                    .userId("d70873cd-7c98-401a-81b6-b1ae08246995")
                    .build()
            )
        assertThat(subNumberOrderListResponse.meta())
            .contains(
                PaginationMeta.builder()
                    .pageNumber(2L)
                    .pageSize(25L)
                    .totalPages(3L)
                    .totalResults(55L)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val subNumberOrderListResponse =
            SubNumberOrderListResponse.builder()
                .addData(
                    SubNumberOrder.builder()
                        .id("12ade33a-21c0-473b-b055-b3c836e1c292")
                        .countryCode("US")
                        .createdAt(OffsetDateTime.parse("2018-01-01T00:00:00.000000Z"))
                        .customerReference("MY REF 001")
                        .isBlockSubNumberOrder(false)
                        .orderRequestId("12ade33a-21c0-473b-b055-b3c836e1c293")
                        .phoneNumberType(SubNumberOrder.PhoneNumberType.LOCAL)
                        .phoneNumbersCount(1L)
                        .recordType("sub_number_order")
                        .addRegulatoryRequirement(
                            SubNumberOrderRegulatoryRequirement.builder()
                                .fieldType(SubNumberOrderRegulatoryRequirement.FieldType.ADDRESS)
                                .recordType("phone_number_regulatory_requirement")
                                .requirementId("8ffb3622-7c6b-4ccc-b65f-7a3dc0099576")
                                .build()
                        )
                        .requirementsMet(true)
                        .status(SubNumberOrder.Status.PENDING)
                        .updatedAt(OffsetDateTime.parse("2018-01-01T00:00:00.000000Z"))
                        .userId("d70873cd-7c98-401a-81b6-b1ae08246995")
                        .build()
                )
                .meta(
                    PaginationMeta.builder()
                        .pageNumber(2L)
                        .pageSize(25L)
                        .totalPages(3L)
                        .totalResults(55L)
                        .build()
                )
                .build()

        val roundtrippedSubNumberOrderListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(subNumberOrderListResponse),
                jacksonTypeRef<SubNumberOrderListResponse>(),
            )

        assertThat(roundtrippedSubNumberOrderListResponse).isEqualTo(subNumberOrderListResponse)
    }
}
