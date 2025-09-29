// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.actions

import com.telnyx.sdk.TestServerExtension
import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.actions.purchase.PurchaseCreateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class PurchaseServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
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
