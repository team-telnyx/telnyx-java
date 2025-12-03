// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.numberblockorders

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NumberBlockOrderListPageResponseTest {

    @Test
    fun create() {
        val numberBlockOrderListPageResponse =
            NumberBlockOrderListPageResponse.builder()
                .addData(
                    NumberBlockOrder.builder()
                        .id("12ade33a-21c0-473b-b055-b3c836e1c292")
                        .connectionId("346789098765567")
                        .createdAt(OffsetDateTime.parse("2018-01-01T00:00:00.000000Z"))
                        .customerReference("MY REF 001")
                        .messagingProfileId("abc85f64-5717-4562-b3fc-2c9600")
                        .phoneNumbersCount(10L)
                        .range(10L)
                        .recordType("number_block_order")
                        .requirementsMet(true)
                        .startingNumber("+19705555000")
                        .status(NumberBlockOrder.Status.PENDING)
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

        assertThat(numberBlockOrderListPageResponse.data().getOrNull())
            .containsExactly(
                NumberBlockOrder.builder()
                    .id("12ade33a-21c0-473b-b055-b3c836e1c292")
                    .connectionId("346789098765567")
                    .createdAt(OffsetDateTime.parse("2018-01-01T00:00:00.000000Z"))
                    .customerReference("MY REF 001")
                    .messagingProfileId("abc85f64-5717-4562-b3fc-2c9600")
                    .phoneNumbersCount(10L)
                    .range(10L)
                    .recordType("number_block_order")
                    .requirementsMet(true)
                    .startingNumber("+19705555000")
                    .status(NumberBlockOrder.Status.PENDING)
                    .updatedAt(OffsetDateTime.parse("2018-01-01T00:00:00.000000Z"))
                    .build()
            )
        assertThat(numberBlockOrderListPageResponse.meta())
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
        val numberBlockOrderListPageResponse =
            NumberBlockOrderListPageResponse.builder()
                .addData(
                    NumberBlockOrder.builder()
                        .id("12ade33a-21c0-473b-b055-b3c836e1c292")
                        .connectionId("346789098765567")
                        .createdAt(OffsetDateTime.parse("2018-01-01T00:00:00.000000Z"))
                        .customerReference("MY REF 001")
                        .messagingProfileId("abc85f64-5717-4562-b3fc-2c9600")
                        .phoneNumbersCount(10L)
                        .range(10L)
                        .recordType("number_block_order")
                        .requirementsMet(true)
                        .startingNumber("+19705555000")
                        .status(NumberBlockOrder.Status.PENDING)
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

        val roundtrippedNumberBlockOrderListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(numberBlockOrderListPageResponse),
                jacksonTypeRef<NumberBlockOrderListPageResponse>(),
            )

        assertThat(roundtrippedNumberBlockOrderListPageResponse)
            .isEqualTo(numberBlockOrderListPageResponse)
    }
}
