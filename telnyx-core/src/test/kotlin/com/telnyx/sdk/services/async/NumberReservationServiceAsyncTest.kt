// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.TestServerExtension
import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.numberreservations.NumberReservationCreateParams
import com.telnyx.sdk.models.numberreservations.NumberReservationListParams
import com.telnyx.sdk.models.numberreservations.ReservedPhoneNumber
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class NumberReservationServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val numberReservationServiceAsync = client.numberReservations()

        val numberReservationFuture =
            numberReservationServiceAsync.create(
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
            )

        val numberReservation = numberReservationFuture.get()
        numberReservation.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val numberReservationServiceAsync = client.numberReservations()

        val numberReservationFuture =
            numberReservationServiceAsync.retrieve("number_reservation_id")

        val numberReservation = numberReservationFuture.get()
        numberReservation.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val numberReservationServiceAsync = client.numberReservations()

        val numberReservationsFuture =
            numberReservationServiceAsync.list(
                NumberReservationListParams.builder()
                    .filter(
                        NumberReservationListParams.Filter.builder()
                            .createdAt(
                                NumberReservationListParams.Filter.CreatedAt.builder()
                                    .gt("gt")
                                    .lt("lt")
                                    .build()
                            )
                            .customerReference("customer_reference")
                            .phoneNumbersPhoneNumber("phone_numbers.phone_number")
                            .status("status")
                            .build()
                    )
                    .page(NumberReservationListParams.Page.builder().number(1L).size(1L).build())
                    .build()
            )

        val numberReservations = numberReservationsFuture.get()
        numberReservations.validate()
    }
}
