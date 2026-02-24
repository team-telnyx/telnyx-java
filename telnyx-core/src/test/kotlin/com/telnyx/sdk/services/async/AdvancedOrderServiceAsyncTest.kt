// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.advancedorders.AdvancedOrder
import com.telnyx.sdk.models.advancedorders.AdvancedOrderUpdateRequirementGroupParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class AdvancedOrderServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val advancedOrderServiceAsync = client.advancedOrders()

        val advancedOrderFuture =
            advancedOrderServiceAsync.create(
                AdvancedOrder.builder()
                    .areaCode("xxx")
                    .comments("comments")
                    .countryCode("xx")
                    .customerReference("customer_reference")
                    .addFeature(AdvancedOrder.Feature.SMS)
                    .phoneNumberType(AdvancedOrder.PhoneNumberType.LOCAL)
                    .quantity(1L)
                    .requirementGroupId("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                    .build()
            )

        val advancedOrder = advancedOrderFuture.get()
        advancedOrder.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val advancedOrderServiceAsync = client.advancedOrders()

        val advancedOrderFuture =
            advancedOrderServiceAsync.retrieve("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val advancedOrder = advancedOrderFuture.get()
        advancedOrder.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val advancedOrderServiceAsync = client.advancedOrders()

        val advancedOrdersFuture = advancedOrderServiceAsync.list()

        val advancedOrders = advancedOrdersFuture.get()
        advancedOrders.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun updateRequirementGroup() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val advancedOrderServiceAsync = client.advancedOrders()

        val responseFuture =
            advancedOrderServiceAsync.updateRequirementGroup(
                AdvancedOrderUpdateRequirementGroupParams.builder()
                    .advancedOrderId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .advancedOrder(
                        AdvancedOrder.builder()
                            .areaCode("xxx")
                            .comments("comments")
                            .countryCode("xx")
                            .customerReference("customer_reference")
                            .addFeature(AdvancedOrder.Feature.SMS)
                            .phoneNumberType(AdvancedOrder.PhoneNumberType.LOCAL)
                            .quantity(1L)
                            .requirementGroupId("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                            .build()
                    )
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
