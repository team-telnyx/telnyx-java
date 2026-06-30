// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.numberreservations.actions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.numberreservations.NumberReservation
import com.telnyx.sdk.models.numberreservations.ReservedPhoneNumber
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ActionExtendResponseTest {

    @Test
    fun create() {
        val actionExtendResponse =
            ActionExtendResponse.builder()
                .data(
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
                )
                .build()

        assertThat(actionExtendResponse.data())
            .contains(
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
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val actionExtendResponse =
            ActionExtendResponse.builder()
                .data(
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
                )
                .build()

        val roundtrippedActionExtendResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(actionExtendResponse),
                jacksonTypeRef<ActionExtendResponse>(),
            )

        assertThat(roundtrippedActionExtendResponse).isEqualTo(actionExtendResponse)
    }
}
