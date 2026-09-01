// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.externalrequirements

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.externalrequirements.subnumberorders.SubNumberOrderRetrieveParams
import com.telnyx.sdk.models.externalrequirements.subnumberorders.SubNumberOrderUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class SubNumberOrderServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val subNumberOrderService = client.externalRequirements().subNumberOrders()

        val subNumberOrder =
            subNumberOrderService.retrieve(
                SubNumberOrderRetrieveParams.builder()
                    .regulatoryRequirementId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .subNumberOrderId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        subNumberOrder.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val subNumberOrderService = client.externalRequirements().subNumberOrders()

        val subNumberOrder =
            subNumberOrderService.update(
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

        subNumberOrder.validate()
    }
}
