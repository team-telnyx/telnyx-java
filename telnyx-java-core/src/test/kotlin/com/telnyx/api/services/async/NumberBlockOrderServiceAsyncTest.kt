// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async

import com.telnyx.api.TestServerExtension
import com.telnyx.api.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.api.models.numberblockorders.NumberBlockOrderCreateParams
import com.telnyx.api.models.numberblockorders.NumberBlockOrderListParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class NumberBlockOrderServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val numberBlockOrderServiceAsync = client.numberBlockOrders()

        val numberBlockOrderFuture =
            numberBlockOrderServiceAsync.create(
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

        val numberBlockOrder = numberBlockOrderFuture.get()
        numberBlockOrder.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val numberBlockOrderServiceAsync = client.numberBlockOrders()

        val numberBlockOrderFuture = numberBlockOrderServiceAsync.retrieve("number_block_order_id")

        val numberBlockOrder = numberBlockOrderFuture.get()
        numberBlockOrder.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val numberBlockOrderServiceAsync = client.numberBlockOrders()

        val numberBlockOrdersFuture =
            numberBlockOrderServiceAsync.list(
                NumberBlockOrderListParams.builder()
                    .filter(
                        NumberBlockOrderListParams.Filter.builder()
                            .createdAt(
                                NumberBlockOrderListParams.Filter.CreatedAt.builder()
                                    .gt("2018-01-01T00:00:00.000000Z")
                                    .lt("2018-01-01T00:00:00.000000Z")
                                    .build()
                            )
                            .phoneNumbersStartingNumber("+19705555000")
                            .status("pending")
                            .build()
                    )
                    .page(NumberBlockOrderListParams.Page.builder().number(1L).size(1L).build())
                    .build()
            )

        val numberBlockOrders = numberBlockOrdersFuture.get()
        numberBlockOrders.validate()
    }
}
