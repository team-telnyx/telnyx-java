// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.actions

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.actions.purchase.PurchaseCreateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class PurchaseServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val purchaseServiceAsync = client.actions().purchase()

        val purchaseFuture =
            purchaseServiceAsync.create(
                PurchaseCreateParams.builder()
                    .amount(10L)
                    .product("whitelabel")
                    .simCardGroupId("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                    .status(PurchaseCreateParams.Status.STANDBY)
                    .tags(listOf("personal", "customers", "active-customers"))
                    .whitelabelName("Custom SPN")
                    .build()
            )

        val purchase = purchaseFuture.get()
        purchase.validate()
    }
}
