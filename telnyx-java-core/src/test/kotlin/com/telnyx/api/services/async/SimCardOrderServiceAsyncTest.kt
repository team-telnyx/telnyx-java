// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async

import com.telnyx.api.TestServerExtension
import com.telnyx.api.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.api.models.simcardorders.SimCardOrderCreateParams
import com.telnyx.api.models.simcardorders.SimCardOrderListParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class SimCardOrderServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val simCardOrderServiceAsync = client.simCardOrders()

        val simCardOrderFuture =
            simCardOrderServiceAsync.create(
                SimCardOrderCreateParams.builder()
                    .addressId("1293384261075731499")
                    .quantity(23L)
                    .build()
            )

        val simCardOrder = simCardOrderFuture.get()
        simCardOrder.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val simCardOrderServiceAsync = client.simCardOrders()

        val simCardOrderFuture =
            simCardOrderServiceAsync.retrieve("6a09cdc3-8948-47f0-aa62-74ac943d6c58")

        val simCardOrder = simCardOrderFuture.get()
        simCardOrder.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val simCardOrderServiceAsync = client.simCardOrders()

        val simCardOrdersFuture =
            simCardOrderServiceAsync.list(
                SimCardOrderListParams.builder()
                    .filter(
                        SimCardOrderListParams.Filter.builder()
                            .address(
                                SimCardOrderListParams.Filter.Address.builder()
                                    .id("1293384261075731499")
                                    .administrativeArea("TX")
                                    .countryCode("US")
                                    .extendedAddress("14th Floor")
                                    .locality("Austin")
                                    .postalCode("78701")
                                    .streetAddress("600 Congress Avenue")
                                    .build()
                            )
                            .cost(
                                SimCardOrderListParams.Filter.Cost.builder()
                                    .amount("2.53")
                                    .currency("USD")
                                    .build()
                            )
                            .createdAt(OffsetDateTime.parse("2018-02-02T22:25:27.521Z"))
                            .quantity(21L)
                            .updatedAt(OffsetDateTime.parse("2018-02-02T22:25:27.521Z"))
                            .build()
                    )
                    .page(SimCardOrderListParams.Page.builder().number(1L).size(1L).build())
                    .build()
            )

        val simCardOrders = simCardOrdersFuture.get()
        simCardOrders.validate()
    }
}
