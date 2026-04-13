// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BookAppointmentToolParamsTest {

    @Test
    fun create() {
        val bookAppointmentToolParams =
            BookAppointmentToolParams.builder()
                .apiKeyRef("my_calcom_api_key")
                .eventTypeId(0L)
                .attendeeName("attendee_name")
                .attendeeTimezone("attendee_timezone")
                .build()

        assertThat(bookAppointmentToolParams.apiKeyRef()).isEqualTo("my_calcom_api_key")
        assertThat(bookAppointmentToolParams.eventTypeId()).isEqualTo(0L)
        assertThat(bookAppointmentToolParams.attendeeName()).contains("attendee_name")
        assertThat(bookAppointmentToolParams.attendeeTimezone()).contains("attendee_timezone")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val bookAppointmentToolParams =
            BookAppointmentToolParams.builder()
                .apiKeyRef("my_calcom_api_key")
                .eventTypeId(0L)
                .attendeeName("attendee_name")
                .attendeeTimezone("attendee_timezone")
                .build()

        val roundtrippedBookAppointmentToolParams =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(bookAppointmentToolParams),
                jacksonTypeRef<BookAppointmentToolParams>(),
            )

        assertThat(roundtrippedBookAppointmentToolParams).isEqualTo(bookAppointmentToolParams)
    }
}
