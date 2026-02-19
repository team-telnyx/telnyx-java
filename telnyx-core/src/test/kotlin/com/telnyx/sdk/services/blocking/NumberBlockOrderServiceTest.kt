// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.numberblockorders.NumberBlockOrderCreateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class NumberBlockOrderServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val numberBlockOrderService = client.numberBlockOrders()

        val numberBlockOrder =
            numberBlockOrderService.create(
                NumberBlockOrderCreateParams.builder()
                    .range(10L)
                    .startingNumber("+19705555000")
                    .id("12ade33a-21c0-473b-b055-b3c836e1c292")
                    .connectionId("346789098765567")
                    .createdAt(OffsetDateTime.parse("2018-01-01T00:00:00.000000Z"))
                    .customerReference("MY REF 001")
                    .errors("Number is already on hold")
                    .messagingProfileId("abc85f64-5717-4562-b3fc-2c9600")
                    .phoneNumbersCount(10L)
                    .recordType("number_block_order")
                    .requirementsMet(true)
                    .status(NumberBlockOrderCreateParams.Status.PENDING)
                    .updatedAt(OffsetDateTime.parse("2018-01-01T00:00:00.000000Z"))
                    .build()
            )

        numberBlockOrder.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val numberBlockOrderService = client.numberBlockOrders()

        val numberBlockOrder = numberBlockOrderService.retrieve("number_block_order_id")

        numberBlockOrder.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val numberBlockOrderService = client.numberBlockOrders()

        val page = numberBlockOrderService.list()

        page.response().validate()
    }
}
