// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.TestServerExtension
import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.numberorderphonenumbers.UpdateRegulatoryRequirement
import com.telnyx.sdk.models.subnumberorders.SubNumberOrderListParams
import com.telnyx.sdk.models.subnumberorders.SubNumberOrderRetrieveParams
import com.telnyx.sdk.models.subnumberorders.SubNumberOrderUpdateParams
import com.telnyx.sdk.models.subnumberorders.SubNumberOrderUpdateRequirementGroupParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class SubNumberOrderServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val subNumberOrderServiceAsync = client.subNumberOrders()

        val subNumberOrderFuture =
            subNumberOrderServiceAsync.retrieve(
                SubNumberOrderRetrieveParams.builder()
                    .subNumberOrderId("sub_number_order_id")
                    .filter(
                        SubNumberOrderRetrieveParams.Filter.builder()
                            .includePhoneNumbers(true)
                            .build()
                    )
                    .build()
            )

        val subNumberOrder = subNumberOrderFuture.get()
        subNumberOrder.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val subNumberOrderServiceAsync = client.subNumberOrders()

        val subNumberOrderFuture =
            subNumberOrderServiceAsync.update(
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

        val subNumberOrder = subNumberOrderFuture.get()
        subNumberOrder.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val subNumberOrderServiceAsync = client.subNumberOrders()

        val subNumberOrdersFuture =
            subNumberOrderServiceAsync.list(
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

        val subNumberOrders = subNumberOrdersFuture.get()
        subNumberOrders.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun cancel() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val subNumberOrderServiceAsync = client.subNumberOrders()

        val responseFuture = subNumberOrderServiceAsync.cancel("sub_number_order_id")

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun updateRequirementGroup() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val subNumberOrderServiceAsync = client.subNumberOrders()

        val responseFuture =
            subNumberOrderServiceAsync.updateRequirementGroup(
                SubNumberOrderUpdateRequirementGroupParams.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .requirementGroupId("a4b201f9-8646-4e54-a7d2-b2e403eeaf8c")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
