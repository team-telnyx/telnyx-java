// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.numberorders

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import com.telnyx.api.models.authenticationproviders.PaginationMeta
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NumberOrderListResponseTest {

    @Test
    fun create() {
        val numberOrderListResponse =
            NumberOrderListResponse.builder()
                .addData(
                    NumberOrderListResponse.Data.builder()
                        .id("12ade33a-21c0-473b-b055-b3c836e1c292")
                        .billingGroupId("abc85f64-5717-4562-b3fc-2c9600")
                        .connectionId("346789098765567")
                        .createdAt(OffsetDateTime.parse("2018-01-01T00:00:00.000000Z"))
                        .customerReference("MY REF 001")
                        .messagingProfileId("abc85f64-5717-4562-b3fc-2c9600")
                        .addPhoneNumber(
                            NumberOrderListResponse.Data.PhoneNumber.builder()
                                .id("id")
                                .phoneNumber("+19705555000")
                                .build()
                        )
                        .phoneNumbersCount(1L)
                        .recordType("number_order")
                        .requirementsMet(true)
                        .status(NumberOrderListResponse.Data.Status.PENDING)
                        .addSubNumberOrdersId("string")
                        .updatedAt(OffsetDateTime.parse("2018-01-01T00:00:00.000000Z"))
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

        assertThat(numberOrderListResponse.data().getOrNull())
            .containsExactly(
                NumberOrderListResponse.Data.builder()
                    .id("12ade33a-21c0-473b-b055-b3c836e1c292")
                    .billingGroupId("abc85f64-5717-4562-b3fc-2c9600")
                    .connectionId("346789098765567")
                    .createdAt(OffsetDateTime.parse("2018-01-01T00:00:00.000000Z"))
                    .customerReference("MY REF 001")
                    .messagingProfileId("abc85f64-5717-4562-b3fc-2c9600")
                    .addPhoneNumber(
                        NumberOrderListResponse.Data.PhoneNumber.builder()
                            .id("id")
                            .phoneNumber("+19705555000")
                            .build()
                    )
                    .phoneNumbersCount(1L)
                    .recordType("number_order")
                    .requirementsMet(true)
                    .status(NumberOrderListResponse.Data.Status.PENDING)
                    .addSubNumberOrdersId("string")
                    .updatedAt(OffsetDateTime.parse("2018-01-01T00:00:00.000000Z"))
                    .build()
            )
        assertThat(numberOrderListResponse.meta())
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
        val numberOrderListResponse =
            NumberOrderListResponse.builder()
                .addData(
                    NumberOrderListResponse.Data.builder()
                        .id("12ade33a-21c0-473b-b055-b3c836e1c292")
                        .billingGroupId("abc85f64-5717-4562-b3fc-2c9600")
                        .connectionId("346789098765567")
                        .createdAt(OffsetDateTime.parse("2018-01-01T00:00:00.000000Z"))
                        .customerReference("MY REF 001")
                        .messagingProfileId("abc85f64-5717-4562-b3fc-2c9600")
                        .addPhoneNumber(
                            NumberOrderListResponse.Data.PhoneNumber.builder()
                                .id("id")
                                .phoneNumber("+19705555000")
                                .build()
                        )
                        .phoneNumbersCount(1L)
                        .recordType("number_order")
                        .requirementsMet(true)
                        .status(NumberOrderListResponse.Data.Status.PENDING)
                        .addSubNumberOrdersId("string")
                        .updatedAt(OffsetDateTime.parse("2018-01-01T00:00:00.000000Z"))
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

        val roundtrippedNumberOrderListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(numberOrderListResponse),
                jacksonTypeRef<NumberOrderListResponse>(),
            )

        assertThat(roundtrippedNumberOrderListResponse).isEqualTo(numberOrderListResponse)
    }
}
