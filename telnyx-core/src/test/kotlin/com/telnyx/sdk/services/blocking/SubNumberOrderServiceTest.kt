// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.numberorderphonenumbers.UpdateRegulatoryRequirement
import com.telnyx.sdk.models.subnumberorders.SubNumberOrderListParams
import com.telnyx.sdk.models.subnumberorders.SubNumberOrderRetrieveParams
import com.telnyx.sdk.models.subnumberorders.SubNumberOrderUpdateParams
import com.telnyx.sdk.models.subnumberorders.SubNumberOrderUpdateRequirementGroupParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class SubNumberOrderServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val subNumberOrderService = client.subNumberOrders()

        val subNumberOrder =
            subNumberOrderService.retrieve(
                SubNumberOrderRetrieveParams.builder()
                    .subNumberOrderId("sub_number_order_id")
                    .filter(
                        SubNumberOrderRetrieveParams.Filter.builder()
                            .includePhoneNumbers(true)
                            .build()
                    )
                    .build()
            )

        subNumberOrder.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val subNumberOrderService = client.subNumberOrders()

        val subNumberOrder =
            subNumberOrderService.update(
                SubNumberOrderUpdateParams.builder()
                    .subNumberOrderId("sub_number_order_id")
                    .addRegulatoryRequirement(
                        UpdateRegulatoryRequirement.builder()
                            .fieldValue("45f45a04-b4be-4592-95b1-9306b9db2b21")
                            .requirementId("8ffb3622-7c6b-4ccc-b65f-7a3dc0099576")
                            .build()
                    )
                    .build()
            )

        subNumberOrder.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val subNumberOrderService = client.subNumberOrders()

        val subNumberOrders =
            subNumberOrderService.list(
                SubNumberOrderListParams.builder()
                    .filter(
                        SubNumberOrderListParams.Filter.builder()
                            .countryCode("US")
                            .orderRequestId("12ade33a-21c0-473b-b055-b3c836e1c293")
                            .phoneNumberType("local")
                            .phoneNumbersCount(1L)
                            .status("status")
                            .build()
                    )
                    .build()
            )

        subNumberOrders.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun cancel() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val subNumberOrderService = client.subNumberOrders()

        val response = subNumberOrderService.cancel("sub_number_order_id")

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun updateRequirementGroup() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val subNumberOrderService = client.subNumberOrders()

        val response =
            subNumberOrderService.updateRequirementGroup(
                SubNumberOrderUpdateRequirementGroupParams.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .requirementGroupId("a4b201f9-8646-4e54-a7d2-b2e403eeaf8c")
                    .build()
            )

        response.validate()
    }
}
