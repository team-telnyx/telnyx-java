// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.bundlepricing

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.bundlepricing.billingbundles.BillingBundleRetrieveParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class BillingBundleServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val billingBundleService = client.bundlePricing().billingBundles()

        val billingBundle =
            billingBundleService.retrieve(
                BillingBundleRetrieveParams.builder()
                    .bundleId("8661948c-a386-4385-837f-af00f40f111a")
                    .authorizationBearer("authorization_bearer")
                    .build()
            )

        billingBundle.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val billingBundleService = client.bundlePricing().billingBundles()

        val page = billingBundleService.list()

        page.response().validate()
    }
}
