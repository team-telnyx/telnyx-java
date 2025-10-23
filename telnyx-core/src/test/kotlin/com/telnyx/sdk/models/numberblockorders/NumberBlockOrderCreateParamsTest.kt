// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.numberblockorders

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NumberBlockOrderCreateParamsTest {

    @Test
    fun create() {
        NumberBlockOrderCreateParams.builder()
            .range(10L)
            .startingNumber("+19705555000")
            .id("12ade33a-21c0-473b-b055-b3c836e1c292")
            .connectionId("346789098765567")
            .createdAt(OffsetDateTime.parse("2018-01-01T00:00:00.000000Z"))
            .customerReference("MY REF 001")
            .errors("Number is already on hold")
            .messagingProfileId("abc85f64-5717-4562-b3fc-2c9600")
            .phoneNumbersCount(10L)
            .recordType("number_block_order")
            .requirementsMet(true)
            .status(NumberBlockOrderCreateParams.Status.PENDING)
            .updatedAt(OffsetDateTime.parse("2018-01-01T00:00:00.000000Z"))
            .build()
    }

    @Test
    fun body() {
        val params =
            NumberBlockOrderCreateParams.builder()
                .range(10L)
                .startingNumber("+19705555000")
                .id("12ade33a-21c0-473b-b055-b3c836e1c292")
                .connectionId("346789098765567")
                .createdAt(OffsetDateTime.parse("2018-01-01T00:00:00.000000Z"))
                .customerReference("MY REF 001")
                .errors("Number is already on hold")
                .messagingProfileId("abc85f64-5717-4562-b3fc-2c9600")
                .phoneNumbersCount(10L)
                .recordType("number_block_order")
                .requirementsMet(true)
                .status(NumberBlockOrderCreateParams.Status.PENDING)
                .updatedAt(OffsetDateTime.parse("2018-01-01T00:00:00.000000Z"))
                .build()

        val body = params._body()

        assertThat(body.range()).isEqualTo(10L)
        assertThat(body.startingNumber()).isEqualTo("+19705555000")
        assertThat(body.id()).contains("12ade33a-21c0-473b-b055-b3c836e1c292")
        assertThat(body.connectionId()).contains("346789098765567")
        assertThat(body.createdAt()).contains(OffsetDateTime.parse("2018-01-01T00:00:00.000000Z"))
        assertThat(body.customerReference()).contains("MY REF 001")
        assertThat(body.errors()).contains("Number is already on hold")
        assertThat(body.messagingProfileId()).contains("abc85f64-5717-4562-b3fc-2c9600")
        assertThat(body.phoneNumbersCount()).contains(10L)
        assertThat(body.recordType()).contains("number_block_order")
        assertThat(body.requirementsMet()).contains(true)
        assertThat(body.status()).contains(NumberBlockOrderCreateParams.Status.PENDING)
        assertThat(body.updatedAt()).contains(OffsetDateTime.parse("2018-01-01T00:00:00.000000Z"))
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            NumberBlockOrderCreateParams.builder().range(10L).startingNumber("+19705555000").build()

        val body = params._body()

        assertThat(body.range()).isEqualTo(10L)
        assertThat(body.startingNumber()).isEqualTo("+19705555000")
    }
}
