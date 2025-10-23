// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.telnyx.sdk.TestServerExtension
import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.simcardorders.SimCardOrderCreateParams
import com.telnyx.sdk.models.simcardorders.SimCardOrderListParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class SimCardOrderServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val simCardOrderService = client.simCardOrders()

        val simCardOrder =
            simCardOrderService.create(
                SimCardOrderCreateParams.builder()
                    .addressId("1293384261075731499")
                    .quantity(23L)
                    .build()
            )

        simCardOrder.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val simCardOrderService = client.simCardOrders()

        val simCardOrder = simCardOrderService.retrieve("6a09cdc3-8948-47f0-aa62-74ac943d6c58")

        simCardOrder.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val simCardOrderService = client.simCardOrders()

        val simCardOrders =
            simCardOrderService.list(
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

        simCardOrders.validate()
    }
}
