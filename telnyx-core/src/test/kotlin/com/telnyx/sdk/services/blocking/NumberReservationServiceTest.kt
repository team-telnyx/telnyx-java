// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.telnyx.sdk.TestServerExtension
import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.numberreservations.NumberReservationCreateParams
import com.telnyx.sdk.models.numberreservations.NumberReservationListParams
import com.telnyx.sdk.models.numberreservations.ReservedPhoneNumber
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class NumberReservationServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val numberReservationService = client.numberReservations()

        val numberReservation =
            numberReservationService.create(
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

        numberReservation.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val numberReservationService = client.numberReservations()

        val numberReservation = numberReservationService.retrieve("number_reservation_id")

        numberReservation.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val numberReservationService = client.numberReservations()

        val numberReservations =
            numberReservationService.list(
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

        numberReservations.validate()
    }
}
