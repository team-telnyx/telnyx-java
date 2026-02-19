// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.portingorders

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.portingorders.actionrequirements.ActionRequirementInitiateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ActionRequirementServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val actionRequirementServiceAsync = client.portingOrders().actionRequirements()

        val pageFuture = actionRequirementServiceAsync.list("porting_order_id")

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun initiate() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val actionRequirementServiceAsync = client.portingOrders().actionRequirements()

        val responseFuture =
            actionRequirementServiceAsync.initiate(
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

        val response = responseFuture.get()
        response.validate()
    }
}
