// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.externalrequirements

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.externalrequirements.subnumberorders.SubNumberOrderRetrieveParams
import com.telnyx.sdk.models.externalrequirements.subnumberorders.SubNumberOrderUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class SubNumberOrderServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val subNumberOrderServiceAsync = client.externalRequirements().subNumberOrders()

        val subNumberOrderFuture =
            subNumberOrderServiceAsync.retrieve(
                SubNumberOrderRetrieveParams.builder()
                    .regulatoryRequirementId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .subNumberOrderId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        val subNumberOrder = subNumberOrderFuture.get()
        subNumberOrder.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val subNumberOrderServiceAsync = client.externalRequirements().subNumberOrders()

        val subNumberOrderFuture =
            subNumberOrderServiceAsync.update(
                SubNumberOrderUpdateParams.builder()
                    .regulatoryRequirementId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .subNumberOrderId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .requirement(
                        SubNumberOrderUpdateParams.Requirement.builder()
                            .firstName("Jane")
                            .lastName("Doe")
                            .build()
                    )
                    .build()
            )

        val subNumberOrder = subNumberOrderFuture.get()
        subNumberOrder.validate()
    }
}
