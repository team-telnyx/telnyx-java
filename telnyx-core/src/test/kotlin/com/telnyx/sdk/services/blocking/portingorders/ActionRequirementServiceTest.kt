// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.portingorders

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.portingorders.actionrequirements.ActionRequirementInitiateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ActionRequirementServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val actionRequirementService = client.portingOrders().actionRequirements()

        val page = actionRequirementService.list("porting_order_id")

        page.response().validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun initiate() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val actionRequirementService = client.portingOrders().actionRequirements()

        val response =
            actionRequirementService.initiate(
                ActionRequirementInitiateParams.builder()
                    .portingOrderId("porting_order_id")
                    .id("id")
                    .params(
                        ActionRequirementInitiateParams.Params.builder()
                            .firstName("John")
                            .lastName("Doe")
                            .build()
                    )
                    .build()
            )

        response.validate()
    }
}
