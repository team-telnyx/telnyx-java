// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.inexplicitnumberorders.InexplicitNumberOrderCreateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class InexplicitNumberOrderServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val inexplicitNumberOrderService = client.inexplicitNumberOrders()

        val inexplicitNumberOrder =
            inexplicitNumberOrderService.create(
                InexplicitNumberOrderCreateParams.builder()
                    .addOrderingGroup(
                        InexplicitNumberOrderCreateParams.OrderingGroup.builder()
                            .countRequested("count_requested")
                            .countryIso(
                                InexplicitNumberOrderCreateParams.OrderingGroup.CountryIso.US
                            )
                            .phoneNumberType("phone_number_type")
                            .administrativeArea("administrative_area")
                            .excludeHeldNumbers(true)
                            .addFeature("string")
                            .locality("locality")
                            .nationalDestinationCode("national_destination_code")
                            .phoneNumber(
                                InexplicitNumberOrderCreateParams.OrderingGroup.PhoneNumber
                                    .builder()
                                    .contains("contains")
                                    .endsWith("ends_with")
                                    .startsWith("starts_with")
                                    .build()
                            )
                            .quickship(true)
                            .strategy(
                                InexplicitNumberOrderCreateParams.OrderingGroup.Strategy.ALWAYS
                            )
                            .build()
                    )
                    .billingGroupId("billing_group_id")
                    .connectionId("connection_id")
                    .customerReference("customer_reference")
                    .messagingProfileId("messaging_profile_id")
                    .build()
            )

        inexplicitNumberOrder.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val inexplicitNumberOrderService = client.inexplicitNumberOrders()

        val inexplicitNumberOrder =
            inexplicitNumberOrderService.retrieve("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        inexplicitNumberOrder.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val inexplicitNumberOrderService = client.inexplicitNumberOrders()

        val page = inexplicitNumberOrderService.list()

        page.response().validate()
    }
}
