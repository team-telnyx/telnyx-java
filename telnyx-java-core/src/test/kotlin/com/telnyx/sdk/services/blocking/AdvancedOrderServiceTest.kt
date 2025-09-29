// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.telnyx.sdk.TestServerExtension
import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.advancedorders.AdvancedOrderCreateParams
import com.telnyx.sdk.models.advancedorders.AdvancedOrderUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class AdvancedOrderServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val advancedOrderService = client.advancedOrders()

        val advancedOrder =
            advancedOrderService.create(
                AdvancedOrderCreateParams.builder()
                    .areaCode("xxx")
                    .comments("comments")
                    .countryCode("xx")
                    .customerReference("customer_reference")
                    .addFeature(AdvancedOrderCreateParams.Feature.SMS)
                    .phoneNumberType(AdvancedOrderCreateParams.PhoneNumberType.LOCAL)
                    .quantity(1L)
                    .requirementGroupId("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                    .build()
            )

        advancedOrder.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val advancedOrderService = client.advancedOrders()

        val advancedOrder = advancedOrderService.retrieve("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        advancedOrder.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val advancedOrderService = client.advancedOrders()

        val advancedOrder =
            advancedOrderService.update(
                AdvancedOrderUpdateParams.builder()
                    .orderId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .areaCode("xxx")
                    .comments("comments")
                    .countryCode("xx")
                    .customerReference("customer_reference")
                    .addFeature(AdvancedOrderUpdateParams.Feature.SMS)
                    .phoneNumberType(AdvancedOrderUpdateParams.PhoneNumberType.LOCAL)
                    .quantity(1L)
                    .requirementGroupId("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                    .build()
            )

        advancedOrder.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val advancedOrderService = client.advancedOrders()

        val advancedOrders = advancedOrderService.list()

        advancedOrders.validate()
    }
}
