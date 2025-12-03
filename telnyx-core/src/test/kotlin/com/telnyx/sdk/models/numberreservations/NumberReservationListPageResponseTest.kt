// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.numberreservations

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NumberReservationListPageResponseTest {

    @Test
    fun create() {
        val numberReservationListPageResponse =
            NumberReservationListPageResponse.builder()
                .addData(
                    NumberReservation.builder()
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
                        .status(NumberReservation.Status.PENDING)
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

        assertThat(numberReservationListPageResponse.data().getOrNull())
            .containsExactly(
                NumberReservation.builder()
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
                    .status(NumberReservation.Status.PENDING)
                    .updatedAt(OffsetDateTime.parse("2018-01-01T00:00:00.000000Z"))
                    .build()
            )
        assertThat(numberReservationListPageResponse.meta())
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
        val numberReservationListPageResponse =
            NumberReservationListPageResponse.builder()
                .addData(
                    NumberReservation.builder()
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
                        .status(NumberReservation.Status.PENDING)
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

        val roundtrippedNumberReservationListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(numberReservationListPageResponse),
                jacksonTypeRef<NumberReservationListPageResponse>(),
            )

        assertThat(roundtrippedNumberReservationListPageResponse)
            .isEqualTo(numberReservationListPageResponse)
    }
}
