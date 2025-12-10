// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.numberorders

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NumberOrderListResponseTest {

    @Test
    fun create() {
        val numberOrderListResponse =
            NumberOrderListResponse.builder()
                .id("12ade33a-21c0-473b-b055-b3c836e1c292")
                .billingGroupId("abc85f64-5717-4562-b3fc-2c9600")
                .connectionId("346789098765567")
                .createdAt(OffsetDateTime.parse("2018-01-01T00:00:00.000000Z"))
                .customerReference("MY REF 001")
                .messagingProfileId("abc85f64-5717-4562-b3fc-2c9600")
                .addPhoneNumber(
                    NumberOrderListResponse.PhoneNumber.builder()
                        .id("id")
                        .phoneNumber("+19705555000")
                        .build()
                )
                .phoneNumbersCount(1L)
                .recordType("number_order")
                .requirementsMet(true)
                .status(NumberOrderListResponse.Status.PENDING)
                .addSubNumberOrdersId("string")
                .updatedAt(OffsetDateTime.parse("2018-01-01T00:00:00.000000Z"))
                .build()

        assertThat(numberOrderListResponse.id()).contains("12ade33a-21c0-473b-b055-b3c836e1c292")
        assertThat(numberOrderListResponse.billingGroupId())
            .contains("abc85f64-5717-4562-b3fc-2c9600")
        assertThat(numberOrderListResponse.connectionId()).contains("346789098765567")
        assertThat(numberOrderListResponse.createdAt())
            .contains(OffsetDateTime.parse("2018-01-01T00:00:00.000000Z"))
        assertThat(numberOrderListResponse.customerReference()).contains("MY REF 001")
        assertThat(numberOrderListResponse.messagingProfileId())
            .contains("abc85f64-5717-4562-b3fc-2c9600")
        assertThat(numberOrderListResponse.phoneNumbers().getOrNull())
            .containsExactly(
                NumberOrderListResponse.PhoneNumber.builder()
                    .id("id")
                    .phoneNumber("+19705555000")
                    .build()
            )
        assertThat(numberOrderListResponse.phoneNumbersCount()).contains(1L)
        assertThat(numberOrderListResponse.recordType()).contains("number_order")
        assertThat(numberOrderListResponse.requirementsMet()).contains(true)
        assertThat(numberOrderListResponse.status())
            .contains(NumberOrderListResponse.Status.PENDING)
        assertThat(numberOrderListResponse.subNumberOrdersIds().getOrNull())
            .containsExactly("string")
        assertThat(numberOrderListResponse.updatedAt())
            .contains(OffsetDateTime.parse("2018-01-01T00:00:00.000000Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val numberOrderListResponse =
            NumberOrderListResponse.builder()
                .id("12ade33a-21c0-473b-b055-b3c836e1c292")
                .billingGroupId("abc85f64-5717-4562-b3fc-2c9600")
                .connectionId("346789098765567")
                .createdAt(OffsetDateTime.parse("2018-01-01T00:00:00.000000Z"))
                .customerReference("MY REF 001")
                .messagingProfileId("abc85f64-5717-4562-b3fc-2c9600")
                .addPhoneNumber(
                    NumberOrderListResponse.PhoneNumber.builder()
                        .id("id")
                        .phoneNumber("+19705555000")
                        .build()
                )
                .phoneNumbersCount(1L)
                .recordType("number_order")
                .requirementsMet(true)
                .status(NumberOrderListResponse.Status.PENDING)
                .addSubNumberOrdersId("string")
                .updatedAt(OffsetDateTime.parse("2018-01-01T00:00:00.000000Z"))
                .build()

        val roundtrippedNumberOrderListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(numberOrderListResponse),
                jacksonTypeRef<NumberOrderListResponse>(),
            )

        assertThat(roundtrippedNumberOrderListResponse).isEqualTo(numberOrderListResponse)
    }
}
