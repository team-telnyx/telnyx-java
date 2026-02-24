// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.numberreservations

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NumberReservationTest {

    @Test
    fun create() {
        val numberReservation =
            NumberReservation.builder()
                .id("12ade33a-21c0-473b-b055-b3c836e1c292")
                .createdAt(OffsetDateTime.parse("2018-01-01T00:00:00.000000Z"))
                .customerReference("MY REF 001")
                .errors("Number is already on hold")
                .addPhoneNumber(
                    ReservedPhoneNumber.builder()
                        .id("12ade33a-21c0-473b-b055-b3c836e1c292")
                        .createdAt(OffsetDateTime.parse("2018-01-01T00:00:00.000000Z"))
                        .errors("Number is already on hold")
                        .expiredAt(OffsetDateTime.parse("2018-01-01T00:00:00.000000Z"))
                        .phoneNumber("+19705555098")
                        .recordType("reserved_phone_number")
                        .status(ReservedPhoneNumber.Status.PENDING)
                        .updatedAt(OffsetDateTime.parse("2018-01-01T00:00:00.000000Z"))
                        .build()
                )
                .recordType("number_reservation")
                .status(NumberReservation.Status.PENDING)
                .updatedAt(OffsetDateTime.parse("2018-01-01T00:00:00.000000Z"))
                .build()

        assertThat(numberReservation.id()).contains("12ade33a-21c0-473b-b055-b3c836e1c292")
        assertThat(numberReservation.createdAt())
            .contains(OffsetDateTime.parse("2018-01-01T00:00:00.000000Z"))
        assertThat(numberReservation.customerReference()).contains("MY REF 001")
        assertThat(numberReservation.errors()).contains("Number is already on hold")
        assertThat(numberReservation.phoneNumbers().getOrNull())
            .containsExactly(
                ReservedPhoneNumber.builder()
                    .id("12ade33a-21c0-473b-b055-b3c836e1c292")
                    .createdAt(OffsetDateTime.parse("2018-01-01T00:00:00.000000Z"))
                    .errors("Number is already on hold")
                    .expiredAt(OffsetDateTime.parse("2018-01-01T00:00:00.000000Z"))
                    .phoneNumber("+19705555098")
                    .recordType("reserved_phone_number")
                    .status(ReservedPhoneNumber.Status.PENDING)
                    .updatedAt(OffsetDateTime.parse("2018-01-01T00:00:00.000000Z"))
                    .build()
            )
        assertThat(numberReservation.recordType()).contains("number_reservation")
        assertThat(numberReservation.status()).contains(NumberReservation.Status.PENDING)
        assertThat(numberReservation.updatedAt())
            .contains(OffsetDateTime.parse("2018-01-01T00:00:00.000000Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val numberReservation =
            NumberReservation.builder()
                .id("12ade33a-21c0-473b-b055-b3c836e1c292")
                .createdAt(OffsetDateTime.parse("2018-01-01T00:00:00.000000Z"))
                .customerReference("MY REF 001")
                .errors("Number is already on hold")
                .addPhoneNumber(
                    ReservedPhoneNumber.builder()
                        .id("12ade33a-21c0-473b-b055-b3c836e1c292")
                        .createdAt(OffsetDateTime.parse("2018-01-01T00:00:00.000000Z"))
                        .errors("Number is already on hold")
                        .expiredAt(OffsetDateTime.parse("2018-01-01T00:00:00.000000Z"))
                        .phoneNumber("+19705555098")
                        .recordType("reserved_phone_number")
                        .status(ReservedPhoneNumber.Status.PENDING)
                        .updatedAt(OffsetDateTime.parse("2018-01-01T00:00:00.000000Z"))
                        .build()
                )
                .recordType("number_reservation")
                .status(NumberReservation.Status.PENDING)
                .updatedAt(OffsetDateTime.parse("2018-01-01T00:00:00.000000Z"))
                .build()

        val roundtrippedNumberReservation =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(numberReservation),
                jacksonTypeRef<NumberReservation>(),
            )

        assertThat(roundtrippedNumberReservation).isEqualTo(numberReservation)
    }
}
