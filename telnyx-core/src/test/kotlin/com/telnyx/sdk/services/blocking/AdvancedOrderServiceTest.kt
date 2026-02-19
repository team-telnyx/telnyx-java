// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.advancedorders.AdvancedOrder
import com.telnyx.sdk.models.advancedorders.AdvancedOrderUpdateRequirementGroupParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class AdvancedOrderServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val advancedOrderService = client.advancedOrders()

        val advancedOrder =
            advancedOrderService.create(
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

        advancedOrder.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val advancedOrderService = client.advancedOrders()

        val advancedOrder = advancedOrderService.retrieve("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        advancedOrder.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val advancedOrderService = client.advancedOrders()

        val advancedOrders = advancedOrderService.list()

        advancedOrders.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun updateRequirementGroup() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val advancedOrderService = client.advancedOrders()

        val response =
            advancedOrderService.updateRequirementGroup(
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

        response.validate()
    }
}
