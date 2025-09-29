// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.numberblockorders

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NumberBlockOrderCreateResponseTest {

    @Test
    fun create() {
        val numberBlockOrderCreateResponse =
            NumberBlockOrderCreateResponse.builder()
                .data(
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
                .build()

        assertThat(numberBlockOrderCreateResponse.data())
            .contains(
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
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val numberBlockOrderCreateResponse =
            NumberBlockOrderCreateResponse.builder()
                .data(
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
                .build()

        val roundtrippedNumberBlockOrderCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(numberBlockOrderCreateResponse),
                jacksonTypeRef<NumberBlockOrderCreateResponse>(),
            )

        assertThat(roundtrippedNumberBlockOrderCreateResponse)
            .isEqualTo(numberBlockOrderCreateResponse)
    }
}
