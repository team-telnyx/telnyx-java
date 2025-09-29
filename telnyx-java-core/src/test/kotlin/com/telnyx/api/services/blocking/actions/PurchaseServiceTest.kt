// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking.actions

import com.telnyx.api.TestServerExtension
import com.telnyx.api.client.okhttp.TelnyxOkHttpClient
import com.telnyx.api.models.actions.purchase.PurchaseCreateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class PurchaseServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
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
