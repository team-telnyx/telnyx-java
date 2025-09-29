// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.numberblockorders

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NumberBlockOrderTest {

    @Test
    fun create() {
        val numberBlockOrder =
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

        assertThat(numberBlockOrder.id()).contains("12ade33a-21c0-473b-b055-b3c836e1c292")
        assertThat(numberBlockOrder.connectionId()).contains("346789098765567")
        assertThat(numberBlockOrder.createdAt())
            .contains(OffsetDateTime.parse("2018-01-01T00:00:00.000000Z"))
        assertThat(numberBlockOrder.customerReference()).contains("MY REF 001")
        assertThat(numberBlockOrder.messagingProfileId()).contains("abc85f64-5717-4562-b3fc-2c9600")
        assertThat(numberBlockOrder.phoneNumbersCount()).contains(10L)
        assertThat(numberBlockOrder.range()).contains(10L)
        assertThat(numberBlockOrder.recordType()).contains("number_block_order")
        assertThat(numberBlockOrder.requirementsMet()).contains(true)
        assertThat(numberBlockOrder.startingNumber()).contains("+19705555000")
        assertThat(numberBlockOrder.status()).contains(NumberBlockOrder.Status.PENDING)
        assertThat(numberBlockOrder.updatedAt())
            .contains(OffsetDateTime.parse("2018-01-01T00:00:00.000000Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val numberBlockOrder =
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

        val roundtrippedNumberBlockOrder =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(numberBlockOrder),
                jacksonTypeRef<NumberBlockOrder>(),
            )

        assertThat(roundtrippedNumberBlockOrder).isEqualTo(numberBlockOrder)
    }
}
