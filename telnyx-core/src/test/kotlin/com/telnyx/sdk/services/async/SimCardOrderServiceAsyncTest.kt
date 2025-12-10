// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.TestServerExtension
import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.simcardorders.SimCardOrderCreateParams
import com.telnyx.sdk.models.simcardorders.SimCardOrderListParams
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
                            .addressAdministrativeArea("TX")
                            .addressCountryCode("US")
                            .addressExtendedAddress("14th Floor")
                            .addressId("1293384261075731499")
                            .addressLocality("Austin")
                            .addressPostalCode("78701")
                            .addressStreetAddress("600 Congress Avenue")
                            .costAmount("2.53")
                            .costCurrency("USD")
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
