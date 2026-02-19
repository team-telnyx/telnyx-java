// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.actions

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.actions.purchase.PurchaseCreateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class PurchaseServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val purchaseService = client.actions().purchase()

        val purchase =
            purchaseService.create(
                PurchaseCreateParams.builder()
                    .amount(10L)
                    .product("whitelabel")
                    .simCardGroupId("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                    .status(PurchaseCreateParams.Status.STANDBY)
                    .tags(listOf("personal", "customers", "active-customers"))
                    .whitelabelName("Custom SPN")
                    .build()
            )

        purchase.validate()
    }
}
