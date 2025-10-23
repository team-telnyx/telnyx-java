// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.numberreservations

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ReservedPhoneNumberTest {

    @Test
    fun create() {
        val reservedPhoneNumber =
            ReservedPhoneNumber.builder()
                .id("12ade33a-21c0-473b-b055-b3c836e1c292")
                .createdAt(OffsetDateTime.parse("2018-01-01T00:00:00.000000Z"))
                .expiredAt(OffsetDateTime.parse("2018-01-01T00:00:00.000000Z"))
                .phoneNumber("+19705555098")
                .recordType("reserved_phone_number")
                .status(ReservedPhoneNumber.Status.PENDING)
                .updatedAt(OffsetDateTime.parse("2018-01-01T00:00:00.000000Z"))
                .build()

        assertThat(reservedPhoneNumber.id()).contains("12ade33a-21c0-473b-b055-b3c836e1c292")
        assertThat(reservedPhoneNumber.createdAt())
            .contains(OffsetDateTime.parse("2018-01-01T00:00:00.000000Z"))
        assertThat(reservedPhoneNumber.expiredAt())
            .contains(OffsetDateTime.parse("2018-01-01T00:00:00.000000Z"))
        assertThat(reservedPhoneNumber.phoneNumber()).contains("+19705555098")
        assertThat(reservedPhoneNumber.recordType()).contains("reserved_phone_number")
        assertThat(reservedPhoneNumber.status()).contains(ReservedPhoneNumber.Status.PENDING)
        assertThat(reservedPhoneNumber.updatedAt())
            .contains(OffsetDateTime.parse("2018-01-01T00:00:00.000000Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val reservedPhoneNumber =
            ReservedPhoneNumber.builder()
                .id("12ade33a-21c0-473b-b055-b3c836e1c292")
                .createdAt(OffsetDateTime.parse("2018-01-01T00:00:00.000000Z"))
                .expiredAt(OffsetDateTime.parse("2018-01-01T00:00:00.000000Z"))
                .phoneNumber("+19705555098")
                .recordType("reserved_phone_number")
                .status(ReservedPhoneNumber.Status.PENDING)
                .updatedAt(OffsetDateTime.parse("2018-01-01T00:00:00.000000Z"))
                .build()

        val roundtrippedReservedPhoneNumber =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(reservedPhoneNumber),
                jacksonTypeRef<ReservedPhoneNumber>(),
            )

        assertThat(roundtrippedReservedPhoneNumber).isEqualTo(reservedPhoneNumber)
    }
}
