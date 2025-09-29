// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.TestServerExtension
import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.advancedorders.AdvancedOrderCreateParams
import com.telnyx.sdk.models.advancedorders.AdvancedOrderUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class AdvancedOrderServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val advancedOrderServiceAsync = client.advancedOrders()

        val advancedOrderFuture =
            advancedOrderServiceAsync.create(
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

        val advancedOrder = advancedOrderFuture.get()
        advancedOrder.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val advancedOrderServiceAsync = client.advancedOrders()

        val advancedOrderFuture =
            advancedOrderServiceAsync.retrieve("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val advancedOrder = advancedOrderFuture.get()
        advancedOrder.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val advancedOrderServiceAsync = client.advancedOrders()

        val advancedOrderFuture =
            advancedOrderServiceAsync.update(
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

        val advancedOrder = advancedOrderFuture.get()
        advancedOrder.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val advancedOrderServiceAsync = client.advancedOrders()

        val advancedOrdersFuture = advancedOrderServiceAsync.list()

        val advancedOrders = advancedOrdersFuture.get()
        advancedOrders.validate()
    }
}
