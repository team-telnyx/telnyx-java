// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BookAppointmentToolTest {

    @Test
    fun create() {
        val bookAppointmentTool =
            BookAppointmentTool.builder()
                .bookAppointment(
                    BookAppointmentToolParams.builder()
                        .apiKeyRef("my_calcom_api_key")
                        .eventTypeId(0L)
                        .attendeeName("attendee_name")
                        .attendeeTimezone("attendee_timezone")
                        .build()
                )
                .type(BookAppointmentTool.Type.BOOK_APPOINTMENT)
                .build()

        assertThat(bookAppointmentTool.bookAppointment())
            .isEqualTo(
                BookAppointmentToolParams.builder()
                    .apiKeyRef("my_calcom_api_key")
                    .eventTypeId(0L)
                    .attendeeName("attendee_name")
                    .attendeeTimezone("attendee_timezone")
                    .build()
            )
        assertThat(bookAppointmentTool.type()).isEqualTo(BookAppointmentTool.Type.BOOK_APPOINTMENT)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val bookAppointmentTool =
            BookAppointmentTool.builder()
                .bookAppointment(
                    BookAppointmentToolParams.builder()
                        .apiKeyRef("my_calcom_api_key")
                        .eventTypeId(0L)
                        .attendeeName("attendee_name")
                        .attendeeTimezone("attendee_timezone")
                        .build()
                )
                .type(BookAppointmentTool.Type.BOOK_APPOINTMENT)
                .build()

        val roundtrippedBookAppointmentTool =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(bookAppointmentTool),
                jacksonTypeRef<BookAppointmentTool>(),
            )

        assertThat(roundtrippedBookAppointmentTool).isEqualTo(bookAppointmentTool)
    }
}
