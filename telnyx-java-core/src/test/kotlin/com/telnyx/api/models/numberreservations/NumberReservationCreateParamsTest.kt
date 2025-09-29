// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.numberreservations

import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NumberReservationCreateParamsTest {

    @Test
    fun create() {
        NumberReservationCreateParams.builder()
            .id("12ade33a-21c0-473b-b055-b3c836e1c292")
            .createdAt(OffsetDateTime.parse("2018-01-01T00:00:00.000000Z"))
            .customerReference("MY REF 001")
            .addPhoneNumber(
                ReservedPhoneNumber.builder()
                    .id("12ade33a-21c0-473b-b055-b3c836e1c292")
                    .createdAt(OffsetDateTime.parse("2018-01-01T00:00:00.000000Z"))
                    .expiredAt(OffsetDateTime.parse("2018-01-01T00:00:00.000000Z"))
                    .phoneNumber("+19705555098")
                    .recordType("reserved_phone_number")
                    .status(ReservedPhoneNumber.Status.PENDING)
                    .updatedAt(OffsetDateTime.parse("2018-01-01T00:00:00.000000Z"))
                    .build()
            )
            .recordType("number_reservation")
            .status(NumberReservationCreateParams.Status.PENDING)
            .updatedAt(OffsetDateTime.parse("2018-01-01T00:00:00.000000Z"))
            .build()
    }

    @Test
    fun body() {
        val params =
            NumberReservationCreateParams.builder()
                .id("12ade33a-21c0-473b-b055-b3c836e1c292")
                .createdAt(OffsetDateTime.parse("2018-01-01T00:00:00.000000Z"))
                .customerReference("MY REF 001")
                .addPhoneNumber(
                    ReservedPhoneNumber.builder()
                        .id("12ade33a-21c0-473b-b055-b3c836e1c292")
                        .createdAt(OffsetDateTime.parse("2018-01-01T00:00:00.000000Z"))
                        .expiredAt(OffsetDateTime.parse("2018-01-01T00:00:00.000000Z"))
                        .phoneNumber("+19705555098")
                        .recordType("reserved_phone_number")
                        .status(ReservedPhoneNumber.Status.PENDING)
                        .updatedAt(OffsetDateTime.parse("2018-01-01T00:00:00.000000Z"))
                        .build()
                )
                .recordType("number_reservation")
                .status(NumberReservationCreateParams.Status.PENDING)
                .updatedAt(OffsetDateTime.parse("2018-01-01T00:00:00.000000Z"))
                .build()

        val body = params._body()

        assertThat(body.id()).contains("12ade33a-21c0-473b-b055-b3c836e1c292")
        assertThat(body.createdAt()).contains(OffsetDateTime.parse("2018-01-01T00:00:00.000000Z"))
        assertThat(body.customerReference()).contains("MY REF 001")
        assertThat(body.phoneNumbers().getOrNull())
            .containsExactly(
                ReservedPhoneNumber.builder()
                    .id("12ade33a-21c0-473b-b055-b3c836e1c292")
                    .createdAt(OffsetDateTime.parse("2018-01-01T00:00:00.000000Z"))
                    .expiredAt(OffsetDateTime.parse("2018-01-01T00:00:00.000000Z"))
                    .phoneNumber("+19705555098")
                    .recordType("reserved_phone_number")
                    .status(ReservedPhoneNumber.Status.PENDING)
                    .updatedAt(OffsetDateTime.parse("2018-01-01T00:00:00.000000Z"))
                    .build()
            )
        assertThat(body.recordType()).contains("number_reservation")
        assertThat(body.status()).contains(NumberReservationCreateParams.Status.PENDING)
        assertThat(body.updatedAt()).contains(OffsetDateTime.parse("2018-01-01T00:00:00.000000Z"))
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = NumberReservationCreateParams.builder().build()

        val body = params._body()
    }
}
